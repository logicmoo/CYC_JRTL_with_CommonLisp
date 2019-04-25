package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.cycjava.cycl.inference.open_cyc_inference_api;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class java_api_kernel
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.java_api_kernel";
  public static final String myFingerPrint = "1553fd9a015f202e7cfa9cf78ab69cfc906c6395e2b1efc2b7fdfca5f804fd3a";
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 2880L)
  private static SubLSymbol $java_api_leases$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 3510L)
  private static SubLSymbol $java_api_lease_monitor$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 4188L)
  private static SubLSymbol $java_api_lease_monitor_sleep_seconds$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 7241L)
  private static SubLSymbol $maximum_api_services_lease_duration_in_milliseconds$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 7391L)
  private static SubLSymbol $lease_timeout_cushion_factor$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 9878L)
  private static SubLSymbol $java_api_sockets$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 19738L)
  private static SubLSymbol $java_home_red_key_name$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 19799L)
  private static SubLSymbol $java_lib_red_key_name$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 19855L)
  private static SubLSymbol $java_vm_red_key_name$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 19909L)
  private static SubLSymbol $java_re_home_red_key_name$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 19973L)
  private static SubLSymbol $java_re_lib_red_key_name$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 20035L)
  private static SubLSymbol $java_re_vm_red_key_name$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 20095L)
  private static SubLSymbol $java_path_separator_red_key_name$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 21476L)
  private static SubLSymbol $java_red_subtree_name$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 21647L)
  private static SubLSymbol $java_red_root_key$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 21693L)
  private static SubLSymbol $java_default_version_numbers$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 22890L)
  private static SubLSymbol $java_red_key_main_class_key$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 23127L)
  private static SubLSymbol $java_red_key_classpath_key$;
  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 23194L)
  private static SubLSymbol $java_red_key_arguments_key$;
  private static final SubLSymbol $sym0$STRINGP;
  private static final SubLString $str1$Java_API_lease_monitor;
  private static final SubLSymbol $sym2$JAVA_API_LEASE_MONITOR;
  private static final SubLSymbol $sym3$INITIALIZE_JAVA_API_LEASE_MONITOR;
  private static final SubLString $str4$Initialize_the_process_which_moni;
  private static final SubLSymbol $sym5$HALT_JAVA_API_LEASE_MONITOR;
  private static final SubLString $str6$Halt_the_the_process_which_monito;
  private static final SubLSymbol $kw7$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym8$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym9$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLInteger $int10$1000;
  private static final SubLString $str11$Releasing_java_API_resources_iden;
  private static final SubLString $str12$__Releasing_java_API_resources_id;
  private static final SubLSymbol $sym13$RELEASE_RESOURCES_FOR_JAVA_API_CLIENT;
  private static final SubLList $list14;
  private static final SubLString $str15$Closes_the_outbound_api_socket_an;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLInteger $int18$3600000;
  private static final SubLSymbol $sym19$INTEGERP;
  private static final SubLString $str20$_cfasl_kernel_standard_output_;
  private static final SubLString $str21$api_services_lease_denied_for__A_;
  private static final SubLString $str22$api_services_lease_denied;
  private static final SubLString $str23$api_services_lease_granted_by_;
  private static final SubLString $str24$_to_;
  private static final SubLString $str25$_for_;
  private static final SubLString $str26$_milliseconds;
  private static final SubLString $str27$_A__;
  private static final SubLSymbol $sym28$ACQUIRE_API_SERVICES_LEASE;
  private static final SubLList $list29;
  private static final SubLString $str30$Requests_an_API_services_lease___;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLString $str33$There_are_no_Java_API_client_leas;
  private static final SubLString $str34$Java_API_client__A_lease_expires_;
  private static final SubLSymbol $sym35$SHOW_JAVA_API_SERVICE_LEASES;
  private static final SubLString $str36$Displays_the_current_java_api_lea;
  private static final SubLString $str37$Java_API_stream_lock;
  private static final SubLSymbol $sym38$REGISTER_JAVA_API_PASSIVE_SOCKET;
  private static final SubLString $str39$Initializing_java_client_socket__;
  private static final SubLString $str40$Initialized_java_client_socket__S;
  private static final SubLString $str41$Invalid_java_client_socket__S__;
  private static final SubLSymbol $sym42$INITIALIZE_JAVA_API_PASSIVE_SOCKET;
  private static final SubLList $list43;
  private static final SubLString $str44$Associates_the_current_socket_wit;
  private static final SubLString $str45$Looked_up_socket__S_from_dictiona;
  private static final SubLString $str46$Removed_socket__S__from_dictionar;
  private static final SubLSymbol $sym47$CLOSE_JAVA_API_SOCKET;
  private static final SubLString $str48$Closes_the_persistent_cfasl_socke;
  private static final SubLString $str49$___S______S;
  private static final SubLSymbol $sym50$SHOW_JAVA_API_SOCKETS;
  private static final SubLString $str51$Displays_the_java_api_sockets_;
  private static final SubLSymbol $sym52$RESET_JAVA_API_KERNEL;
  private static final SubLString $str53$Reset_this_subsystem_to_an_un_ini;
  private static final SubLString $str54$Verifying_java_api_socket_identif;
  private static final SubLList $list55;
  private static final SubLString $str56$closing_broken_java_api_socket__A;
  private static final SubLString $str57$_cp;
  private static final SubLString $str58$Java_proxy_for_;
  private static final SubLSymbol $sym59$LAUNCH_JAVA_APPLICATION_FROM_RED;
  private static final SubLSymbol $kw60$LEAST_PRIVILEGED;
  private static final SubLString $str61$JAVA_HOME;
  private static final SubLString $str62$JAVA_LIB;
  private static final SubLString $str63$JAVA_VM;
  private static final SubLString $str64$JAVA_RE_HOME;
  private static final SubLString $str65$JAVA_RE_LIB;
  private static final SubLString $str66$JAVA_RE_VM;
  private static final SubLString $str67$path_separator;
  private static final SubLString $str68$java;
  private static final SubLList $list69;
  private static final SubLSymbol $sym70$LISTP;
  private static final SubLString $str71$java_main_class;
  private static final SubLString $str72$java_classpath;
  private static final SubLString $str73$java_arguments;
  private static final SubLSymbol $sym74$CCONCATENATE;

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 3256L)
  public static SubLObject java_api_lease_expiration_time(final SubLObject uuid_string)
  {
    assert NIL != Types.stringp( uuid_string ) : uuid_string;
    return dictionary_utilities.synchronized_dictionary_lookup( $java_api_leases$.getGlobalValue(), uuid_string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 3632L)
  public static SubLObject initialize_java_api_lease_monitor()
  {
    halt_java_api_lease_monitor();
    $java_api_lease_monitor$.setGlobalValue( Threads.make_process( $str1$Java_API_lease_monitor, Symbols.symbol_function( $sym2$JAVA_API_LEASE_MONITOR ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 3926L)
  public static SubLObject halt_java_api_lease_monitor()
  {
    if( NIL != $java_api_lease_monitor$.getGlobalValue() )
    {
      Threads.kill_process( $java_api_lease_monitor$.getGlobalValue() );
      $java_api_lease_monitor$.setGlobalValue( NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 4329L)
  public static SubLObject java_api_lease_monitor()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_utc_time_with_milliseconds = NIL;
    SubLObject uuid_strings_to_remove = NIL;
    while ( true)
    {
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw7$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym8$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            if( NIL == $java_api_leases$.getGlobalValue() )
            {
              continue;
            }
            uuid_strings_to_remove = NIL;
            current_utc_time_with_milliseconds = numeric_date_utilities.get_utc_time_with_milliseconds();
            final SubLObject lock = dictionary_utilities.synchronized_dictionary_lock( $java_api_leases$.getGlobalValue() );
            SubLObject release = NIL;
            try
            {
              release = Locks.seize_lock( lock );
              SubLObject iteration_state;
              for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( dictionary_utilities.synchronized_dictionary_dictionary( $java_api_leases$
                  .getGlobalValue() ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
              {
                thread.resetMultipleValues();
                final SubLObject uuid_string = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
                final SubLObject lease_expiration_time = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject error_message = NIL;
                SubLObject seconds_yet_to_wait = NIL;
                try
                {
                  thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding( thread );
                  try
                  {
                    Errors.$error_handler$.bind( $sym9$CATCH_ERROR_MESSAGE_HANDLER, thread );
                    try
                    {
                      seconds_yet_to_wait = Numbers.divide( Numbers.subtract( lease_expiration_time, current_utc_time_with_milliseconds ), $int10$1000 );
                      if( seconds_yet_to_wait.numL( ZERO_INTEGER ) )
                      {
                        uuid_strings_to_remove = ConsesLow.cons( uuid_string, uuid_strings_to_remove );
                        release_resources_for_java_api_client( uuid_string, T );
                      }
                    }
                    catch( final Throwable catch_var )
                    {
                      Errors.handleThrowable( catch_var, NIL );
                    }
                  }
                  finally
                  {
                    Errors.$error_handler$.rebind( _prev_bind_0_$1, thread );
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
                  Errors.warn( error_message );
                }
              }
              dictionary_contents.do_dictionary_contents_finalize( iteration_state );
            }
            finally
            {
              if( NIL != release )
              {
                Locks.release_lock( lock );
              }
            }
            SubLObject cdolist_list_var = uuid_strings_to_remove;
            SubLObject uuid_string_to_remove = NIL;
            uuid_string_to_remove = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject error_message2 = NIL;
              try
              {
                thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding( thread );
                try
                {
                  Errors.$error_handler$.bind( $sym9$CATCH_ERROR_MESSAGE_HANDLER, thread );
                  try
                  {
                    dictionary_utilities.synchronized_dictionary_remove( $java_api_leases$.getGlobalValue(), uuid_string_to_remove );
                  }
                  catch( final Throwable catch_var2 )
                  {
                    Errors.handleThrowable( catch_var2, NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( _prev_bind_0_$2, thread );
                }
              }
              catch( final Throwable ccatch_env_var2 )
              {
                error_message2 = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
              }
              finally
              {
                thread.throwStack.pop();
              }
              if( NIL != error_message2 )
              {
                Errors.warn( error_message2 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              uuid_string_to_remove = cdolist_list_var.first();
            }
            Threads.sleep( $java_api_lease_monitor_sleep_seconds$.getGlobalValue() );
          }
          catch( final Throwable catch_var3 )
          {
            Errors.handleThrowable( catch_var3, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0, thread );
        }
      }
      catch( final Throwable ccatch_env_var3 )
      {
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var3, $kw7$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 5865L)
  public static SubLObject release_resources_for_java_api_client(final SubLObject uuid_string, SubLObject abnormalP)
  {
    if( abnormalP == UNPROVIDED )
    {
      abnormalP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( uuid_string, $sym0$STRINGP );
    if( task_processor.get_task_processor_verbosity().numG( ZERO_INTEGER ) )
    {
      task_processor.push_tpool_background_msg( PrintLow.format( NIL, $str11$Releasing_java_API_resources_iden, uuid_string ), task_processor.$api_task_process_pool$.getGlobalValue() );
    }
    if( NIL != abnormalP )
    {
      Errors.warn( $str12$__Releasing_java_API_resources_id, uuid_string );
    }
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw7$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym8$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          open_cyc_inference_api.open_cyc_release_inference_resources_for_client( uuid_string );
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    SubLObject ignore_errors_tag_$3 = NIL;
    try
    {
      thread.throwStack.push( $kw7$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym8$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          api_widgets.release_widget_resources_for_client( uuid_string );
        }
        catch( final Throwable catch_var2 )
        {
          Errors.handleThrowable( catch_var2, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_2, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      ignore_errors_tag_$3 = Errors.handleThrowable( ccatch_env_var2, $kw7$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    SubLObject ignore_errors_tag_$4 = NIL;
    try
    {
      thread.throwStack.push( $kw7$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym8$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          close_java_api_socket( uuid_string );
        }
        catch( final Throwable catch_var2 )
        {
          Errors.handleThrowable( catch_var2, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_2, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      ignore_errors_tag_$4 = Errors.handleThrowable( ccatch_env_var2, $kw7$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    SubLObject ignore_errors_tag_$5 = NIL;
    try
    {
      thread.throwStack.push( $kw7$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym8$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          if( NIL == abnormalP )
          {
            dictionary_utilities.synchronized_dictionary_remove( $java_api_leases$.getGlobalValue(), uuid_string );
          }
        }
        catch( final Throwable catch_var2 )
        {
          Errors.handleThrowable( catch_var2, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_2, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      ignore_errors_tag_$5 = Errors.handleThrowable( ccatch_env_var2, $kw7$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    task_processor.terminate_active_task_processes( uuid_string );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 7542L)
  public static SubLObject acquire_api_services_lease(final SubLObject lease_duration_in_milliseconds, final SubLObject uuid_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( lease_duration_in_milliseconds, $sym19$INTEGERP );
    enforceType( uuid_string, $sym0$STRINGP );
    if( lease_duration_in_milliseconds.numG( $maximum_api_services_lease_duration_in_milliseconds$.getGlobalValue() ) )
    {
      dictionary_utilities.synchronized_dictionary_remove( $java_api_leases$.getGlobalValue(), uuid_string );
      if( NIL != task_processor.java_api_lease_activity_display() )
      {
        eval_in_api.trace_me( $str20$_cfasl_kernel_standard_output_, cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
        PrintLow.format( cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue( thread ), $str21$api_services_lease_denied_for__A_, uuid_string );
        streams_high.force_output( cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue( thread ) );
      }
      return $str22$api_services_lease_denied;
    }
    if( NIL == $java_api_lease_monitor$.getGlobalValue() )
    {
      initialize_java_api_lease_monitor();
    }
    final SubLObject lease_expiration_time = Numbers.add( numeric_date_utilities.get_utc_time_with_milliseconds(), Numbers.multiply( lease_duration_in_milliseconds, $lease_timeout_cushion_factor$.getGlobalValue() ) );
    final SubLObject renewal_msg = Sequences.cconcatenate( $str23$api_services_lease_granted_by_, new SubLObject[] { control_vars.cyc_image_id(), $str24$_to_, uuid_string, $str25$_for_, string_utilities.to_string(
        lease_duration_in_milliseconds ), $str26$_milliseconds
    } );
    dictionary_utilities.synchronized_dictionary_enter( $java_api_leases$.getGlobalValue(), uuid_string, lease_expiration_time );
    if( NIL != task_processor.java_api_lease_activity_display() )
    {
      PrintLow.format( cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue( thread ), $str27$_A__, renewal_msg );
      streams_high.force_output( cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue( thread ) );
    }
    return renewal_msg;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 9202L)
  public static SubLObject show_java_api_service_leases()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $java_api_leases$.getGlobalValue() )
    {
      PrintLow.format( T, $str33$There_are_no_Java_API_client_leas );
      return NIL;
    }
    final SubLObject current_utc_time_with_milliseconds = numeric_date_utilities.get_utc_time_with_milliseconds();
    final SubLObject lock = dictionary_utilities.synchronized_dictionary_lock( $java_api_leases$.getGlobalValue() );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( dictionary_utilities.synchronized_dictionary_dictionary( $java_api_leases$
          .getGlobalValue() ) ) ); NIL == dictionary_contents.do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject uuid_string = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject lease_expiration_time = thread.secondMultipleValue();
        thread.resetMultipleValues();
        PrintLow.format( T, $str34$Java_API_client__A_lease_expires_, uuid_string, Numbers.divide( Numbers.subtract( lease_expiration_time, current_utc_time_with_milliseconds ), $int10$1000 ) );
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 10310L)
  public static SubLObject get_current_api_socket()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.list( api_kernel.$api_in_stream$.getDynamicValue( thread ), api_kernel.$api_out_stream$.getDynamicValue( thread ), Locks.make_lock( $str37$Java_API_stream_lock ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 10536L)
  public static SubLObject api_socket_in_stream(final SubLObject api_socket)
  {
    return api_socket.first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 10615L)
  public static SubLObject api_socket_out_stream(final SubLObject api_socket)
  {
    return conses_high.second( api_socket );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 10696L)
  public static SubLObject api_socket_lock(final SubLObject api_socket)
  {
    return conses_high.third( api_socket );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 10770L)
  public static SubLObject register_java_api_passive_socket(final SubLObject uuid_string, final SubLObject in_stream, final SubLObject out_stream)
  {
    dictionary_utilities.synchronized_dictionary_enter( $java_api_sockets$.getGlobalValue(), uuid_string, ConsesLow.list( in_stream, out_stream, Locks.make_lock( $str37$Java_API_stream_lock ) ) );
    return uuid_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 11039L)
  public static SubLObject initialize_java_api_passive_socket(final SubLObject uuid_string)
  {
    enforceType( uuid_string, $sym0$STRINGP );
    final SubLObject api_socket = get_current_api_socket();
    if( task_processor.get_task_processor_verbosity().numG( ZERO_INTEGER ) )
    {
      task_processor.push_tpool_background_msg( PrintLow.format( NIL, $str39$Initializing_java_client_socket__, api_socket, uuid_string ), task_processor.$api_task_process_pool$.getGlobalValue() );
    }
    cleanup_broken_java_api_sockets();
    if( api_socket_out_stream( api_socket ).isStream() )
    {
      dictionary_utilities.synchronized_dictionary_enter( $java_api_sockets$.getGlobalValue(), uuid_string, api_socket );
      final SubLObject lock = api_socket_lock( api_socket );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        cfasl_kernel.send_cfasl_result( api_socket_out_stream( api_socket ), NIL, UNPROVIDED );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
      if( task_processor.get_task_processor_verbosity().numG( ZERO_INTEGER ) )
      {
        task_processor.push_tpool_background_msg( PrintLow.format( NIL, $str40$Initialized_java_client_socket__S, api_socket, uuid_string ), task_processor.$api_task_process_pool$.getGlobalValue() );
      }
    }
    else if( task_processor.get_task_processor_verbosity().numG( ZERO_INTEGER ) )
    {
      task_processor.push_tpool_background_msg( PrintLow.format( NIL, $str41$Invalid_java_client_socket__S__, api_socket ), task_processor.$api_task_process_pool$.getGlobalValue() );
    }
    dictionary_utilities.synchronized_dictionary_enter( $java_api_leases$.getGlobalValue(), uuid_string, Numbers.add( numeric_date_utilities.get_utc_time_with_milliseconds(),
        $maximum_api_services_lease_duration_in_milliseconds$.getGlobalValue() ) );
    Tcp.$retain_client_socketP$.setDynamicValue( T );
    cfasl_kernel.cfasl_quit();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 12495L)
  public static SubLObject java_api_socket(final SubLObject uuid_string)
  {
    assert NIL != Types.stringp( uuid_string ) : uuid_string;
    SubLObject api_socket = NIL;
    api_socket = dictionary_utilities.synchronized_dictionary_lookup( $java_api_sockets$.getGlobalValue(), uuid_string, UNPROVIDED );
    if( task_processor.get_task_processor_verbosity().numG( ZERO_INTEGER ) )
    {
      task_processor.push_tpool_background_msg( PrintLow.format( NIL, $str45$Looked_up_socket__S_from_dictiona, api_socket, uuid_string ), task_processor.$api_task_process_pool$.getGlobalValue() );
    }
    return api_socket;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 12992L)
  public static SubLObject java_api_socket_out_stream(final SubLObject uuid_string)
  {
    return api_socket_out_stream( java_api_socket( uuid_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 13197L)
  public static SubLObject java_api_lock(final SubLObject uuid_string)
  {
    return api_socket_lock( java_api_socket( uuid_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 13383L)
  public static SubLObject close_java_api_socket(final SubLObject uuid_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( uuid_string, $sym0$STRINGP );
    if( NIL == $java_api_sockets$.getGlobalValue() )
    {
      return NIL;
    }
    final SubLObject api_socket = java_api_socket( uuid_string );
    if( NIL != api_socket )
    {
      final SubLObject in_stream = api_socket_in_stream( api_socket );
      final SubLObject out_stream = api_socket_out_stream( api_socket );
      SubLObject ignore_errors_tag = NIL;
      try
      {
        thread.throwStack.push( $kw7$IGNORE_ERRORS_TARGET );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( $sym8$IGNORE_ERRORS_HANDLER ), thread );
          try
          {
            try
            {
              streams_high.close( in_stream, UNPROVIDED );
            }
            finally
            {
              final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                if( !in_stream.eql( out_stream ) )
                {
                  streams_high.close( out_stream, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
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
        ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET );
      }
      finally
      {
        thread.throwStack.pop();
      }
      dictionary_utilities.synchronized_dictionary_remove( $java_api_sockets$.getGlobalValue(), uuid_string );
      if( task_processor.get_task_processor_verbosity().numG( ZERO_INTEGER ) )
      {
        task_processor.push_tpool_background_msg( PrintLow.format( NIL, $str46$Removed_socket__S__from_dictionar, api_socket, uuid_string ), task_processor.$api_task_process_pool$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 14239L)
  public static SubLObject show_java_api_sockets()
  {
    if( NIL == $java_api_sockets$.getGlobalValue() )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = dictionary_utilities.synchronized_dictionary_keys( $java_api_sockets$.getGlobalValue() );
    SubLObject key = NIL;
    key = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      PrintLow.format( T, $str49$___S______S, key, dictionary_utilities.synchronized_dictionary_lookup( $java_api_sockets$.getGlobalValue(), key, UNPROVIDED ) );
      cdolist_list_var = cdolist_list_var.rest();
      key = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 14552L)
  public static SubLObject reset_java_api_kernel()
  {
    task_processor.halt_api_task_processors();
    dictionary_utilities.clear_synchronized_dictionary( $java_api_leases$.getGlobalValue() );
    dictionary_utilities.clear_synchronized_dictionary( $java_api_sockets$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 14863L)
  public static SubLObject cleanup_broken_java_api_sockets()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject close_socketP = NIL;
    SubLObject uuid_strings = NIL;
    if( NIL != $java_api_sockets$.getGlobalValue() )
    {
      SubLObject cdolist_list_var;
      uuid_strings = ( cdolist_list_var = dictionary_utilities.synchronized_dictionary_keys( $java_api_sockets$.getGlobalValue() ) );
      SubLObject uuid_string = NIL;
      uuid_string = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        if( task_processor.get_task_processor_verbosity().numG( ZERO_INTEGER ) )
        {
          task_processor.push_tpool_background_msg( PrintLow.format( NIL, $str54$Verifying_java_api_socket_identif, uuid_string ), task_processor.$api_task_process_pool$.getGlobalValue() );
        }
        final SubLObject lock = java_api_lock( uuid_string );
        final SubLObject socket = java_api_socket_out_stream( uuid_string );
        SubLObject ignore_errors_tag = NIL;
        try
        {
          thread.throwStack.push( $kw7$IGNORE_ERRORS_TARGET );
          final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $sym8$IGNORE_ERRORS_HANDLER ), thread );
            try
            {
              try
              {
                close_socketP = T;
                SubLObject release = NIL;
                try
                {
                  release = Locks.seize_lock( lock );
                  cfasl_kernel.send_cfasl_result( socket, $list55, NIL );
                }
                finally
                {
                  if( NIL != release )
                  {
                    Locks.release_lock( lock );
                  }
                }
                close_socketP = NIL;
              }
              finally
              {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  if( NIL != close_socketP )
                  {
                    if( task_processor.get_task_processor_verbosity().numG( ZERO_INTEGER ) )
                    {
                      task_processor.push_tpool_background_msg( PrintLow.format( NIL, $str56$closing_broken_java_api_socket__A, socket, uuid_string ), task_processor.$api_task_process_pool$.getGlobalValue() );
                    }
                    close_java_api_socket( uuid_string );
                  }
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
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
          ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET );
        }
        finally
        {
          thread.throwStack.pop();
        }
        cdolist_list_var = cdolist_list_var.rest();
        uuid_string = cdolist_list_var.first();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 15996L)
  public static SubLObject launch_java_application_from_red(final SubLObject application_name, SubLObject more_args)
  {
    if( more_args == UNPROVIDED )
    {
      more_args = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject java_vm = get_red_value_for_default_java_virtual_machine();
    SubLObject result_code = NIL;
    thread.resetMultipleValues();
    final SubLObject main_class = get_java_application_information_from_red( application_name );
    final SubLObject class_path = thread.secondMultipleValue();
    final SubLObject args = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    final SubLObject args_to_java = ConsesLow.list( $str57$_cp, class_path, main_class );
    final SubLObject final_args = Sequences.cconcatenate( args_to_java, new SubLObject[] { args, more_args
    } );
    result_code = os_process_utilities.system_eval_using_make_os_process( java_vm, final_args, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    return result_code;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 16805L)
  public static SubLObject launch_java_application_from_red_in_process(final SubLObject application_name, SubLObject more_args)
  {
    if( more_args == UNPROVIDED )
    {
      more_args = NIL;
    }
    return subl_promotions.make_process_with_args( Sequences.cconcatenate( $str58$Java_proxy_for_, application_name ), $sym59$LAUNCH_JAVA_APPLICATION_FROM_RED, ConsesLow.list( application_name, more_args ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 17197L)
  public static SubLObject get_red_value_for_default_java_virtual_machine()
  {
    SubLObject jvm = get_red_value_for_default_java_vm();
    if( NIL == jvm )
    {
      jvm = get_red_value_for_default_java_re_vm();
    }
    return jvm;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 17557L)
  public static SubLObject get_red_value_for_default_java_vm()
  {
    final SubLObject element = red_api.red_get_element( red_api.red_repository_list_struct_create( $kw60$LEAST_PRIVILEGED ), get_red_key_for_default_java_vm() );
    if( NIL != element )
    {
      return red_api.red_element_get_value( element );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 17883L)
  public static SubLObject get_red_value_for_default_java_re_vm()
  {
    final SubLObject element = red_api.red_get_element( red_api.red_repository_list_struct_create( $kw60$LEAST_PRIVILEGED ), get_red_key_for_default_java_re_vm() );
    if( NIL != element )
    {
      return red_api.red_element_get_value( element );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 18189L)
  public static SubLObject get_red_value_for_default_java_home()
  {
    final SubLObject element = red_api.red_get_element( red_api.red_repository_list_struct_create( $kw60$LEAST_PRIVILEGED ), get_red_key_for_default_java_home() );
    if( NIL != element )
    {
      return red_api.red_element_get_value( element );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 18493L)
  public static SubLObject get_red_value_for_default_java_re_home()
  {
    final SubLObject element = red_api.red_get_element( red_api.red_repository_list_struct_create( $kw60$LEAST_PRIVILEGED ), get_red_key_for_default_java_re_home() );
    if( NIL != element )
    {
      return red_api.red_element_get_value( element );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 18803L)
  public static SubLObject get_red_value_for_default_java_lib()
  {
    final SubLObject element = red_api.red_get_element( red_api.red_repository_list_struct_create( $kw60$LEAST_PRIVILEGED ), get_red_key_for_default_java_lib() );
    if( NIL != element )
    {
      return red_api.red_element_get_value( element );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 19105L)
  public static SubLObject get_red_value_for_default_java_re_lib()
  {
    final SubLObject element = red_api.red_get_element( red_api.red_repository_list_struct_create( $kw60$LEAST_PRIVILEGED ), get_red_key_for_default_java_re_lib() );
    if( NIL != element )
    {
      return red_api.red_element_get_value( element );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 19413L)
  public static SubLObject get_red_value_for_default_java_path_separator()
  {
    final SubLObject element = red_api.red_get_element( red_api.red_repository_list_struct_create( $kw60$LEAST_PRIVILEGED ), get_red_key_for_default_java_path_separator() );
    if( NIL != element )
    {
      return red_api.red_element_get_value( element );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 20169L)
  public static SubLObject get_red_key_for_default_java_home()
  {
    return Sequences.cconcatenate( get_java_red_root_key_for_default_version(), new SubLObject[] { red_utilities.$red_key_name_separator$.getGlobalValue(), $java_home_red_key_name$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 20352L)
  public static SubLObject get_red_key_for_default_java_re_home()
  {
    return Sequences.cconcatenate( get_java_red_root_key_for_default_version(), new SubLObject[] { red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_home_red_key_name$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 20541L)
  public static SubLObject get_red_key_for_default_java_lib()
  {
    return Sequences.cconcatenate( get_java_red_root_key_for_default_version(), new SubLObject[] { red_utilities.$red_key_name_separator$.getGlobalValue(), $java_lib_red_key_name$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 20722L)
  public static SubLObject get_red_key_for_default_java_re_lib()
  {
    return Sequences.cconcatenate( get_java_red_root_key_for_default_version(), new SubLObject[] { red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_lib_red_key_name$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 20909L)
  public static SubLObject get_red_key_for_default_java_vm()
  {
    return Sequences.cconcatenate( get_java_red_root_key_for_default_version(), new SubLObject[] { red_utilities.$red_key_name_separator$.getGlobalValue(), $java_vm_red_key_name$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 21088L)
  public static SubLObject get_red_key_for_default_java_re_vm()
  {
    return Sequences.cconcatenate( get_java_red_root_key_for_default_version(), new SubLObject[] { red_utilities.$red_key_name_separator$.getGlobalValue(), $java_re_vm_red_key_name$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 21273L)
  public static SubLObject get_red_key_for_default_java_path_separator()
  {
    return Sequences.cconcatenate( get_java_red_root_key_for_default_version(), new SubLObject[] { red_utilities.$red_key_name_separator$.getGlobalValue(), $java_path_separator_red_key_name$.getGlobalValue()
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 21755L)
  public static SubLObject get_software_type_as_red_key_name()
  {
    return string_utilities.split_string( Environment.software_type(), UNPROVIDED ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 21894L)
  public static SubLObject get_java_red_root_key()
  {
    if( NIL == $java_red_root_key$.getGlobalValue() )
    {
      $java_red_root_key$.setGlobalValue( Sequences.cconcatenate( red_utilities.$red_root_key_os$.getGlobalValue(), new SubLObject[] { red_utilities.$red_key_name_separator$.getGlobalValue(),
        get_software_type_as_red_key_name(), red_utilities.$red_key_name_separator$.getGlobalValue(), $java_red_subtree_name$.getGlobalValue()
      } ) );
    }
    return $java_red_root_key$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 22266L)
  public static SubLObject get_java_red_root_key_for_version(final SubLObject version_numbers)
  {
    assert NIL != Types.listp( version_numbers ) : version_numbers;
    SubLObject key = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      streams_high.write_string( get_java_red_root_key(), stream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( red_utilities.$red_key_name_separator$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED );
      SubLObject list_var = NIL;
      SubLObject version_number = NIL;
      SubLObject counter = NIL;
      list_var = version_numbers;
      version_number = list_var.first();
      for( counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), version_number = list_var.first(), counter = Numbers.add( ONE_INTEGER, counter ) )
      {
        if( !counter.isZero() )
        {
          streams_high.write_string( red_utilities.$red_key_name_separator$.getGlobalValue(), stream, UNPROVIDED, UNPROVIDED );
        }
        print_high.princ( version_number, stream );
      }
      key = streams_high.get_output_stream_string( stream );
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
    return key;
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 22750L)
  public static SubLObject get_java_red_root_key_for_default_version()
  {
    return get_java_red_root_key_for_version( $java_default_version_numbers$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 23261L)
  public static SubLObject get_java_application_information_from_red(final SubLObject application_name)
  {
    final SubLObject application = red_utilities.get_red_root_element_for_application( application_name );
    final SubLObject main_class = red_api.red_get_element_get_sub_element_by_key( application, $java_red_key_main_class_key$.getGlobalValue() );
    final SubLObject class_path_description = red_api.red_get_element_get_sub_element_by_key( application, $java_red_key_classpath_key$.getGlobalValue() );
    final SubLObject arguments_description = red_api.red_get_element_get_sub_element_by_key( application, $java_red_key_arguments_key$.getGlobalValue() );
    final SubLObject path_separator = get_red_value_for_default_java_path_separator();
    final SubLObject class_path_elements = red_utilities.interpret_red_element_subtree( class_path_description );
    return Values.values( red_api.red_element_get_value( main_class ), get_java_classpath_from_elments( class_path_elements, path_separator ), red_utilities.interpret_red_element_subtree( arguments_description ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/java-api-kernel.lisp", position = 24221L)
  public static SubLObject get_java_classpath_from_elments(final SubLObject class_path_elements, final SubLObject path_separator)
  {
    SubLObject items = NIL;
    SubLObject list_var = NIL;
    SubLObject element = NIL;
    SubLObject counter = NIL;
    list_var = class_path_elements;
    element = list_var.first();
    for( counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), element = list_var.first(), counter = Numbers.add( ONE_INTEGER, counter ) )
    {
      if( !counter.isZero() )
      {
        items = ConsesLow.cons( path_separator, items );
      }
      items = ConsesLow.cons( element, items );
    }
    return Functions.apply( Symbols.symbol_function( $sym74$CCONCATENATE ), Sequences.nreverse( items ) );
  }

  public static SubLObject declare_java_api_kernel_file()
  {
    SubLFiles.declareFunction( me, "java_api_lease_expiration_time", "JAVA-API-LEASE-EXPIRATION-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_java_api_lease_monitor", "INITIALIZE-JAVA-API-LEASE-MONITOR", 0, 0, false );
    SubLFiles.declareFunction( me, "halt_java_api_lease_monitor", "HALT-JAVA-API-LEASE-MONITOR", 0, 0, false );
    SubLFiles.declareFunction( me, "java_api_lease_monitor", "JAVA-API-LEASE-MONITOR", 0, 0, false );
    SubLFiles.declareFunction( me, "release_resources_for_java_api_client", "RELEASE-RESOURCES-FOR-JAVA-API-CLIENT", 1, 1, false );
    SubLFiles.declareFunction( me, "acquire_api_services_lease", "ACQUIRE-API-SERVICES-LEASE", 2, 0, false );
    SubLFiles.declareFunction( me, "show_java_api_service_leases", "SHOW-JAVA-API-SERVICE-LEASES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_current_api_socket", "GET-CURRENT-API-SOCKET", 0, 0, false );
    SubLFiles.declareFunction( me, "api_socket_in_stream", "API-SOCKET-IN-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "api_socket_out_stream", "API-SOCKET-OUT-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "api_socket_lock", "API-SOCKET-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "register_java_api_passive_socket", "REGISTER-JAVA-API-PASSIVE-SOCKET", 3, 0, false );
    SubLFiles.declareFunction( me, "initialize_java_api_passive_socket", "INITIALIZE-JAVA-API-PASSIVE-SOCKET", 1, 0, false );
    SubLFiles.declareFunction( me, "java_api_socket", "JAVA-API-SOCKET", 1, 0, false );
    SubLFiles.declareFunction( me, "java_api_socket_out_stream", "JAVA-API-SOCKET-OUT-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "java_api_lock", "JAVA-API-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "close_java_api_socket", "CLOSE-JAVA-API-SOCKET", 1, 0, false );
    SubLFiles.declareFunction( me, "show_java_api_sockets", "SHOW-JAVA-API-SOCKETS", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_java_api_kernel", "RESET-JAVA-API-KERNEL", 0, 0, false );
    SubLFiles.declareFunction( me, "cleanup_broken_java_api_sockets", "CLEANUP-BROKEN-JAVA-API-SOCKETS", 0, 0, false );
    SubLFiles.declareFunction( me, "launch_java_application_from_red", "LAUNCH-JAVA-APPLICATION-FROM-RED", 1, 1, false );
    SubLFiles.declareFunction( me, "launch_java_application_from_red_in_process", "LAUNCH-JAVA-APPLICATION-FROM-RED-IN-PROCESS", 1, 1, false );
    SubLFiles.declareFunction( me, "get_red_value_for_default_java_virtual_machine", "GET-RED-VALUE-FOR-DEFAULT-JAVA-VIRTUAL-MACHINE", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_value_for_default_java_vm", "GET-RED-VALUE-FOR-DEFAULT-JAVA-VM", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_value_for_default_java_re_vm", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-VM", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_value_for_default_java_home", "GET-RED-VALUE-FOR-DEFAULT-JAVA-HOME", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_value_for_default_java_re_home", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-HOME", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_value_for_default_java_lib", "GET-RED-VALUE-FOR-DEFAULT-JAVA-LIB", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_value_for_default_java_re_lib", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-LIB", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_value_for_default_java_path_separator", "GET-RED-VALUE-FOR-DEFAULT-JAVA-PATH-SEPARATOR", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_key_for_default_java_home", "GET-RED-KEY-FOR-DEFAULT-JAVA-HOME", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_key_for_default_java_re_home", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-HOME", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_key_for_default_java_lib", "GET-RED-KEY-FOR-DEFAULT-JAVA-LIB", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_key_for_default_java_re_lib", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-LIB", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_key_for_default_java_vm", "GET-RED-KEY-FOR-DEFAULT-JAVA-VM", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_key_for_default_java_re_vm", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-VM", 0, 0, false );
    SubLFiles.declareFunction( me, "get_red_key_for_default_java_path_separator", "GET-RED-KEY-FOR-DEFAULT-JAVA-PATH-SEPARATOR", 0, 0, false );
    SubLFiles.declareFunction( me, "get_software_type_as_red_key_name", "GET-SOFTWARE-TYPE-AS-RED-KEY-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "get_java_red_root_key", "GET-JAVA-RED-ROOT-KEY", 0, 0, false );
    SubLFiles.declareFunction( me, "get_java_red_root_key_for_version", "GET-JAVA-RED-ROOT-KEY-FOR-VERSION", 1, 0, false );
    SubLFiles.declareFunction( me, "get_java_red_root_key_for_default_version", "GET-JAVA-RED-ROOT-KEY-FOR-DEFAULT-VERSION", 0, 0, false );
    SubLFiles.declareFunction( me, "get_java_application_information_from_red", "GET-JAVA-APPLICATION-INFORMATION-FROM-RED", 1, 0, false );
    SubLFiles.declareFunction( me, "get_java_classpath_from_elments", "GET-JAVA-CLASSPATH-FROM-ELMENTS", 2, 0, false );
    return NIL;
  }

  public static SubLObject init_java_api_kernel_file()
  {
    $java_api_leases$ = SubLFiles.deflexical( "*JAVA-API-LEASES*", dictionary_utilities.new_synchronized_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    $java_api_lease_monitor$ = SubLFiles.deflexical( "*JAVA-API-LEASE-MONITOR*", NIL );
    $java_api_lease_monitor_sleep_seconds$ = SubLFiles.defconstant( "*JAVA-API-LEASE-MONITOR-SLEEP-SECONDS*", TWO_INTEGER );
    $maximum_api_services_lease_duration_in_milliseconds$ = SubLFiles.defconstant( "*MAXIMUM-API-SERVICES-LEASE-DURATION-IN-MILLISECONDS*", $int18$3600000 );
    $lease_timeout_cushion_factor$ = SubLFiles.defconstant( "*LEASE-TIMEOUT-CUSHION-FACTOR*", THREE_INTEGER );
    $java_api_sockets$ = SubLFiles.deflexical( "*JAVA-API-SOCKETS*", dictionary_utilities.new_synchronized_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    $java_home_red_key_name$ = SubLFiles.deflexical( "*JAVA-HOME-RED-KEY-NAME*", $str61$JAVA_HOME );
    $java_lib_red_key_name$ = SubLFiles.deflexical( "*JAVA-LIB-RED-KEY-NAME*", $str62$JAVA_LIB );
    $java_vm_red_key_name$ = SubLFiles.deflexical( "*JAVA-VM-RED-KEY-NAME*", $str63$JAVA_VM );
    $java_re_home_red_key_name$ = SubLFiles.deflexical( "*JAVA-RE-HOME-RED-KEY-NAME*", $str64$JAVA_RE_HOME );
    $java_re_lib_red_key_name$ = SubLFiles.deflexical( "*JAVA-RE-LIB-RED-KEY-NAME*", $str65$JAVA_RE_LIB );
    $java_re_vm_red_key_name$ = SubLFiles.deflexical( "*JAVA-RE-VM-RED-KEY-NAME*", $str66$JAVA_RE_VM );
    $java_path_separator_red_key_name$ = SubLFiles.deflexical( "*JAVA-PATH-SEPARATOR-RED-KEY-NAME*", $str67$path_separator );
    $java_red_subtree_name$ = SubLFiles.deflexical( "*JAVA-RED-SUBTREE-NAME*", $str68$java );
    $java_red_root_key$ = SubLFiles.deflexical( "*JAVA-RED-ROOT-KEY*", NIL );
    $java_default_version_numbers$ = SubLFiles.deflexical( "*JAVA-DEFAULT-VERSION-NUMBERS*", $list69 );
    $java_red_key_main_class_key$ = SubLFiles.deflexical( "*JAVA-RED-KEY-MAIN-CLASS-KEY*", $str71$java_main_class );
    $java_red_key_classpath_key$ = SubLFiles.deflexical( "*JAVA-RED-KEY-CLASSPATH-KEY*", $str72$java_classpath );
    $java_red_key_arguments_key$ = SubLFiles.deflexical( "*JAVA-RED-KEY-ARGUMENTS-KEY*", $str73$java_arguments );
    return NIL;
  }

  public static SubLObject setup_java_api_kernel_file()
  {
    utilities_macros.register_cyc_api_function( $sym3$INITIALIZE_JAVA_API_LEASE_MONITOR, NIL, $str4$Initialize_the_process_which_moni, NIL, NIL );
    utilities_macros.register_cyc_api_function( $sym5$HALT_JAVA_API_LEASE_MONITOR, NIL, $str6$Halt_the_the_process_which_monito, NIL, NIL );
    utilities_macros.register_cyc_api_function( $sym13$RELEASE_RESOURCES_FOR_JAVA_API_CLIENT, $list14, $str15$Closes_the_outbound_api_socket_an, $list16, $list17 );
    utilities_macros.register_cyc_api_function( $sym28$ACQUIRE_API_SERVICES_LEASE, $list29, $str30$Requests_an_API_services_lease___, $list31, $list32 );
    utilities_macros.register_cyc_api_function( $sym35$SHOW_JAVA_API_SERVICE_LEASES, NIL, $str36$Displays_the_current_java_api_lea, NIL, $list17 );
    access_macros.register_external_symbol( $sym38$REGISTER_JAVA_API_PASSIVE_SOCKET );
    utilities_macros.register_cyc_api_function( $sym42$INITIALIZE_JAVA_API_PASSIVE_SOCKET, $list43, $str44$Associates_the_current_socket_wit, $list16, $list17 );
    utilities_macros.register_cyc_api_function( $sym47$CLOSE_JAVA_API_SOCKET, $list43, $str48$Closes_the_persistent_cfasl_socke, $list16, $list17 );
    utilities_macros.register_cyc_api_function( $sym50$SHOW_JAVA_API_SOCKETS, NIL, $str51$Displays_the_java_api_sockets_, NIL, $list17 );
    utilities_macros.register_cyc_api_function( $sym52$RESET_JAVA_API_KERNEL, NIL, $str53$Reset_this_subsystem_to_an_un_ini, NIL, NIL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_java_api_kernel_file();
  }

  @Override
  public void initializeVariables()
  {
    init_java_api_kernel_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_java_api_kernel_file();
  }
  static
  {
    me = new java_api_kernel();
    $java_api_leases$ = null;
    $java_api_lease_monitor$ = null;
    $java_api_lease_monitor_sleep_seconds$ = null;
    $maximum_api_services_lease_duration_in_milliseconds$ = null;
    $lease_timeout_cushion_factor$ = null;
    $java_api_sockets$ = null;
    $java_home_red_key_name$ = null;
    $java_lib_red_key_name$ = null;
    $java_vm_red_key_name$ = null;
    $java_re_home_red_key_name$ = null;
    $java_re_lib_red_key_name$ = null;
    $java_re_vm_red_key_name$ = null;
    $java_path_separator_red_key_name$ = null;
    $java_red_subtree_name$ = null;
    $java_red_root_key$ = null;
    $java_default_version_numbers$ = null;
    $java_red_key_main_class_key$ = null;
    $java_red_key_classpath_key$ = null;
    $java_red_key_arguments_key$ = null;
    $sym0$STRINGP = makeSymbol( "STRINGP" );
    $str1$Java_API_lease_monitor = makeString( "Java API lease monitor" );
    $sym2$JAVA_API_LEASE_MONITOR = makeSymbol( "JAVA-API-LEASE-MONITOR" );
    $sym3$INITIALIZE_JAVA_API_LEASE_MONITOR = makeSymbol( "INITIALIZE-JAVA-API-LEASE-MONITOR" );
    $str4$Initialize_the_process_which_moni = makeString( "Initialize the process which monitors lease expirations for java api clients." );
    $sym5$HALT_JAVA_API_LEASE_MONITOR = makeSymbol( "HALT-JAVA-API-LEASE-MONITOR" );
    $str6$Halt_the_the_process_which_monito = makeString( "Halt the the process which monitors lease expirations for java api clients." );
    $kw7$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym8$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym9$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $int10$1000 = makeInteger( 1000 );
    $str11$Releasing_java_API_resources_iden = makeString( "Releasing java API resources identified by ~A~%" );
    $str12$__Releasing_java_API_resources_id = makeString( "~%Releasing java API resources identified by ~A~%" );
    $sym13$RELEASE_RESOURCES_FOR_JAVA_API_CLIENT = makeSymbol( "RELEASE-RESOURCES-FOR-JAVA-API-CLIENT" );
    $list14 = ConsesLow.list( makeSymbol( "UUID-STRING" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "ABNORMAL?" ) );
    $str15$Closes_the_outbound_api_socket_an = makeString(
        "Closes the outbound api socket and kills active api requests identified by the given uuid-string.\n   @param uuid-string ; stringp\n   @param abnormal?   ; boolean Whether or not the release was abnormal or expected" );
    $list16 = ConsesLow.list( ConsesLow.list( makeSymbol( "UUID-STRING" ), makeSymbol( "STRINGP" ) ) );
    $list17 = ConsesLow.list( NIL );
    $int18$3600000 = makeInteger( 3600000 );
    $sym19$INTEGERP = makeSymbol( "INTEGERP" );
    $str20$_cfasl_kernel_standard_output_ = makeString( "*cfasl-kernel-standard-output*" );
    $str21$api_services_lease_denied_for__A_ = makeString( "api services lease denied for ~A~%" );
    $str22$api_services_lease_denied = makeString( "api services lease denied" );
    $str23$api_services_lease_granted_by_ = makeString( "api services lease granted by " );
    $str24$_to_ = makeString( " to " );
    $str25$_for_ = makeString( " for " );
    $str26$_milliseconds = makeString( " milliseconds" );
    $str27$_A__ = makeString( "~A~%" );
    $sym28$ACQUIRE_API_SERVICES_LEASE = makeSymbol( "ACQUIRE-API-SERVICES-LEASE" );
    $list29 = ConsesLow.list( makeSymbol( "LEASE-DURATION-IN-MILLISECONDS" ), makeSymbol( "UUID-STRING" ) );
    $str30$Requests_an_API_services_lease___ = makeString(
        "Requests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request\n   for a duration longer than one hour is denied.\n   @param lease-duration-in-milliseconds ; integerp, the lease duration in milliseconds\n   @param uuid-string ; stringp, identifies the java api client" );
    $list31 = ConsesLow.list( ConsesLow.list( makeSymbol( "LEASE-DURATION-IN-MILLISECONDS" ), makeSymbol( "INTEGERP" ) ), ConsesLow.list( makeSymbol( "UUID-STRING" ), makeSymbol( "STRINGP" ) ) );
    $list32 = ConsesLow.list( makeSymbol( "STRINGP" ) );
    $str33$There_are_no_Java_API_client_leas = makeString( "There are no Java API client leases.~%" );
    $str34$Java_API_client__A_lease_expires_ = makeString( "Java API client ~A lease expires in ~A seconds~%" );
    $sym35$SHOW_JAVA_API_SERVICE_LEASES = makeSymbol( "SHOW-JAVA-API-SERVICE-LEASES" );
    $str36$Displays_the_current_java_api_lea = makeString( "Displays the current java api leases." );
    $str37$Java_API_stream_lock = makeString( "Java API stream lock" );
    $sym38$REGISTER_JAVA_API_PASSIVE_SOCKET = makeSymbol( "REGISTER-JAVA-API-PASSIVE-SOCKET" );
    $str39$Initializing_java_client_socket__ = makeString( "Initializing java client socket ~S~%identified by ~A~%" );
    $str40$Initialized_java_client_socket__S = makeString( "Initialized java client socket ~S~%identified by ~A~%" );
    $str41$Invalid_java_client_socket__S__ = makeString( "Invalid java client socket ~S~%" );
    $sym42$INITIALIZE_JAVA_API_PASSIVE_SOCKET = makeSymbol( "INITIALIZE-JAVA-API-PASSIVE-SOCKET" );
    $list43 = ConsesLow.list( makeSymbol( "UUID-STRING" ) );
    $str44$Associates_the_current_socket_wit = makeString( "Associates the current socket with the given UUID-STRING, then ends this server process\nthat currently uses the socket." );
    $str45$Looked_up_socket__S_from_dictiona = makeString( "Looked up socket ~S from dictionary~%identifed by ~A~%" );
    $str46$Removed_socket__S__from_dictionar = makeString( "Removed socket ~S~ from dictionary%identifed by ~A~%" );
    $sym47$CLOSE_JAVA_API_SOCKET = makeSymbol( "CLOSE-JAVA-API-SOCKET" );
    $str48$Closes_the_persistent_cfasl_socke = makeString( "Closes the persistent cfasl socket that is associated with \nthe given UUID-STRING." );
    $str49$___S______S = makeString( "~%~S ==> ~S" );
    $sym50$SHOW_JAVA_API_SOCKETS = makeSymbol( "SHOW-JAVA-API-SOCKETS" );
    $str51$Displays_the_java_api_sockets_ = makeString( "Displays the java api sockets." );
    $sym52$RESET_JAVA_API_KERNEL = makeSymbol( "RESET-JAVA-API-KERNEL" );
    $str53$Reset_this_subsystem_to_an_un_ini = makeString( "Reset this subsystem to an un-initialized state." );
    $str54$Verifying_java_api_socket_identif = makeString( "Verifying java api socket identified by ~A~%" );
    $list55 = ConsesLow.list( makeSymbol( "IGNORE" ) );
    $str56$closing_broken_java_api_socket__A = makeString( "closing broken java api socket ~A~%identified by ~A~%" );
    $str57$_cp = makeString( "-cp" );
    $str58$Java_proxy_for_ = makeString( "Java proxy for " );
    $sym59$LAUNCH_JAVA_APPLICATION_FROM_RED = makeSymbol( "LAUNCH-JAVA-APPLICATION-FROM-RED" );
    $kw60$LEAST_PRIVILEGED = makeKeyword( "LEAST-PRIVILEGED" );
    $str61$JAVA_HOME = makeString( "JAVA_HOME" );
    $str62$JAVA_LIB = makeString( "JAVA_LIB" );
    $str63$JAVA_VM = makeString( "JAVA_VM" );
    $str64$JAVA_RE_HOME = makeString( "JAVA_RE_HOME" );
    $str65$JAVA_RE_LIB = makeString( "JAVA_RE_LIB" );
    $str66$JAVA_RE_VM = makeString( "JAVA_RE_VM" );
    $str67$path_separator = makeString( "path_separator" );
    $str68$java = makeString( "java" );
    $list69 = ConsesLow.list( ONE_INTEGER, FOUR_INTEGER, TWO_INTEGER );
    $sym70$LISTP = makeSymbol( "LISTP" );
    $str71$java_main_class = makeString( "java-main-class" );
    $str72$java_classpath = makeString( "java-classpath" );
    $str73$java_arguments = makeString( "java-arguments" );
    $sym74$CCONCATENATE = makeSymbol( "CCONCATENATE" );
  }
}
/*
 * 
 * Total time: 412 ms
 * 
 */