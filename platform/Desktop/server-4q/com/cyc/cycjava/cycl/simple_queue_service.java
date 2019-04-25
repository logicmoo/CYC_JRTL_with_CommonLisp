package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class simple_queue_service
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.simple_queue_service";
  public static final String myFingerPrint = "8a633f7fc1f744f97c3487a29ecd721fce19eee1662d42050efbbf3ec06cc557";
  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2237L)
  private static SubLSymbol $local_sqs_relay_host$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2395L)
  private static SubLSymbol $local_sqs_relay_port$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2509L)
  public static SubLSymbol $default_sqs_retries$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2603L)
  public static SubLSymbol $default_sqs_wait_secs$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 3471L)
  public static SubLSymbol $sqs_error_reporting_policy$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 11668L)
  private static SubLSymbol $default_sqs_request_attribute_list$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13334L)
  private static SubLSymbol $get_empty_sqs_enqueue_command_fragments_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 26523L)
  public static SubLSymbol $recommended_max_hex_chars_per_sqs_message$;
  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 26752L)
  public static SubLSymbol $recommended_max_bytes_per_sqs_message$;
  private static final SubLString $str0$localhost;
  private static final SubLInteger $int1$19219;
  private static final SubLSymbol $kw2$OK;
  private static final SubLSymbol $kw3$NOT_AN_SQS_RESPONSE;
  private static final SubLSymbol $kw4$WARN_ON_ERROR;
  private static final SubLString $str5$Received_error__A___A____;
  private static final SubLSymbol $kw6$ERROR_ON_ERROR;
  private static final SubLList $list7;
  private static final SubLString $str8$;
  private static final SubLSymbol $kw9$MESSAGE;
  private static final SubLSymbol $sym10$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw11$PUBLIC;
  private static final SubLSymbol $sym12$STRINGP;
  private static final SubLString $str13$Only_support_STRINGP_or_LIST_OF_T;
  private static final SubLSymbol $kw14$EOF;
  private static final SubLString $str15$Empty_result_____suspicious_;
  private static final SubLSymbol $kw16$ERROR;
  private static final SubLString $str17$Bogus_result_returned_by_server_;
  private static final SubLString $str18$format;
  private static final SubLString $str19$subl;
  private static final SubLList $list20;
  private static final SubLSymbol $sym21$CWITH_OUTPUT_TO_STRING;
  private static final SubLSymbol $sym22$CLET;
  private static final SubLSymbol $sym23$_XML_STREAM_;
  private static final SubLSymbol $sym24$XML_TAG;
  private static final SubLList $list25;
  private static final SubLString $str26$request;
  private static final SubLSymbol $kw27$UNINITIALIZED;
  private static final SubLString $str28$version;
  private static final SubLString $str29$createq;
  private static final SubLString $str30$deleteq;
  private static final SubLString $str31$enqueue;
  private static final SubLSymbol $sym32$GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS;
  private static final SubLSymbol $sym33$_GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS_CACHING_STATE_;
  private static final SubLString $str34$dequeue;
  private static final SubLString $str35$pending;
  private static final SubLString $str36$listqs;
  private static final SubLString $str37$putfile;
  private static final SubLString $str38$data;
  private static final SubLString $str39$getfile;
  private static final SubLString $str40$name;
  private static final SubLString $str41$maxTries;
  private static final SubLString $str42$maxWaitSecs;
  private static final SubLString $str43$bucket;
  private static final SubLString $str44$key;
  private static final SubLSymbol $sym45$SQS_ITERATOR_DONE_;
  private static final SubLSymbol $sym46$SQS_ITERATOR_NEXT;
  private static final SubLList $list47;
  private static final SubLSymbol $sym48$SQS_ACCUMULATOR_RESET;
  private static final SubLSymbol $sym49$SQS_ACCUMULATOR_ADD;
  private static final SubLSymbol $sym50$SQS_ACCUMULATOR_SIZE;
  private static final SubLSymbol $sym51$SQS_ACCUMULATOR_CONTENTS;
  private static final SubLSymbol $sym52$SQS_ACCUMULATOR_IT;
  private static final SubLList $list53;
  private static final SubLString $str54$Could_not_post__A_to__A_;
  private static final SubLSymbol $sym55$ACCUMULATOR_P;
  private static final SubLSymbol $kw56$SENTENCE;
  private static final SubLSymbol $kw57$ELMT;
  private static final SubLSymbol $kw58$PROPERTIES;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$GETF;
  private static final SubLList $list61;
  private static final SubLList $list62;
  private static final SubLSymbol $kw63$EXHAUSTED;
  private static final SubLSymbol $sym64$COMPACT_HL_EXTERNAL_ID_STRING;
  private static final SubLSymbol $sym65$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING;
  private static final SubLInteger $int66$8192;
  private static final SubLInteger $int67$256;
  private static final SubLSymbol $sym68$SGMT_ACCUMULATOR_RESET;
  private static final SubLSymbol $sym69$SGMT_ACCUMULATOR_ADD;
  private static final SubLSymbol $sym70$SGMT_ACCUMULATOR_SIZE;
  private static final SubLSymbol $sym71$SGMT_ACCUMULATOR_CONTENTS;
  private static final SubLSymbol $sym72$SGMT_ACCUMULATOR_IT;
  private static final SubLList $list73;
  private static final SubLString $str74$Object__A_encodes_as__A_bytes__mo;
  private static final SubLString $str75$Implementation_error__serializing;
  private static final SubLSymbol $sym76$ITERATOR_P;
  private static final SubLSymbol $sym77$SQS_SGMNT_IT_DONE;
  private static final SubLSymbol $sym78$SQS_SGMNT_IT_NEXT;
  private static final SubLList $list79;
  private static final SubLInteger $int80$30;
  private static final SubLString $str81$___A__A___A_msgs__;
  private static final SubLSymbol $kw82$ALL_EMPTY;
  private static final SubLString $str83$___A__Cleaning_up_ca__A_msgs_from;
  private static final SubLString $str84$___A__Removed__A_msgs_from__A___;
  private static final SubLList $list85;
  private static final SubLSymbol $sym86$PROGN;
  private static final SubLSymbol $sym87$MUST;
  private static final SubLSymbol $sym88$IS_KNOWN_SQS_QUEUE_;
  private static final SubLString $str89$_A_is_not_a_known_SQS_queue______;
  private static final SubLSymbol $sym90$CSETQ;

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2700L)
  public static SubLObject success_sqs_response_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != sqs_response_p( v_object ) && $kw2$OK == v_object.first() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 2872L)
  public static SubLObject sqs_response_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isCons() && v_object.first().isKeyword() && NIL != list_utilities.lengthE( v_object, TWO_INTEGER, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 3015L)
  public static SubLObject sqs_response_status(final SubLObject v_object)
  {
    if( NIL != sqs_response_p( v_object ) )
    {
      return v_object.first();
    }
    return $kw3$NOT_AN_SQS_RESPONSE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 3156L)
  public static SubLObject sqs_response_reply(final SubLObject v_object)
  {
    if( NIL != sqs_response_p( v_object ) )
    {
      return conses_high.second( v_object );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 3279L)
  public static SubLObject sqs_empty_message_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != success_sqs_response_p( v_object ) && NIL == sqs_response_reply( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 3630L)
  public static SubLObject process_sqs_error_response(final SubLObject v_object)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != sqs_response_p( v_object ) )
    {
      final SubLObject msg1 = conses_high.second( v_object );
      final SubLObject msg2 = conses_high.third( v_object );
      final SubLObject pcase_var = $sqs_error_reporting_policy$.getDynamicValue( thread );
      if( pcase_var.eql( $kw4$WARN_ON_ERROR ) )
      {
        Errors.warn( $str5$Received_error__A___A____, msg1, msg2 );
      }
      else if( pcase_var.eql( $kw6$ERROR_ON_ERROR ) )
      {
        Errors.error( $str5$Received_error__A___A____, msg1, msg2 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 4025L)
  public static SubLObject get_sqs_version()
  {
    return communicate_with_local_sqs_relayer( get_sqs_version_command() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 4298L)
  public static SubLObject is_sqs_availableP()
  {
    return success_sqs_response_p( get_sqs_version() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 4435L)
  public static SubLObject sqs_list_queues()
  {
    final SubLObject reply = communicate_with_local_sqs_relayer( get_sqs_list_queues_command() );
    if( NIL != success_sqs_response_p( reply ) )
    {
      return sqs_response_reply( reply );
    }
    return process_sqs_error_response( reply );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 4907L)
  public static SubLObject is_known_sqs_queueP(final SubLObject queue_name)
  {
    return makeBoolean( queue_name.isString() && sqs_pending_message_estimate( queue_name ).isNumber() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 5154L)
  public static SubLObject sqs_create_queue(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs)
  {
    if( retries == UNPROVIDED )
    {
      retries = $default_sqs_retries$.getGlobalValue();
    }
    if( wait_secs == UNPROVIDED )
    {
      wait_secs = $default_sqs_wait_secs$.getGlobalValue();
    }
    final SubLObject reply = communicate_with_local_sqs_relayer( get_sqs_create_queue_command( queue_name, retries, wait_secs ) );
    if( NIL != success_sqs_response_p( reply ) )
    {
      return sqs_response_reply( reply );
    }
    return process_sqs_error_response( reply );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 5737L)
  public static SubLObject sqs_delete_queue(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs)
  {
    if( retries == UNPROVIDED )
    {
      retries = $default_sqs_retries$.getGlobalValue();
    }
    if( wait_secs == UNPROVIDED )
    {
      wait_secs = $default_sqs_wait_secs$.getGlobalValue();
    }
    final SubLObject reply = communicate_with_local_sqs_relayer( get_sqs_delete_queue_command( queue_name, retries, wait_secs ) );
    if( NIL != success_sqs_response_p( reply ) )
    {
      return sqs_response_reply( reply );
    }
    return process_sqs_error_response( reply );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 6331L)
  public static SubLObject sqs_post_message(final SubLObject queue_name, final SubLObject message)
  {
    final SubLObject reply = communicate_with_local_sqs_relayer( get_sqs_enqueue_command( queue_name, message ) );
    if( NIL != success_sqs_response_p( reply ) )
    {
      return sqs_response_reply( reply );
    }
    return process_sqs_error_response( reply );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 6826L)
  public static SubLObject sqs_post_message_pieces(final SubLObject queue_name, final SubLObject message_pieces)
  {
    SubLObject current;
    final SubLObject datum = current = get_empty_sqs_enqueue_command_fragments( queue_name );
    SubLObject preamble = NIL;
    SubLObject postamble = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    preamble = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    postamble = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
      return NIL;
    }
    final SubLObject final_message_pieces = list_utilities.flatten( ConsesLow.list( preamble, message_pieces, postamble ) );
    final SubLObject reply = communicate_with_local_sqs_relayer( final_message_pieces );
    if( NIL != success_sqs_response_p( reply ) )
    {
      return sqs_response_reply( reply );
    }
    return process_sqs_error_response( reply );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 7439L)
  public static SubLObject sqs_get_message(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs)
  {
    if( retries == UNPROVIDED )
    {
      retries = $default_sqs_retries$.getGlobalValue();
    }
    if( wait_secs == UNPROVIDED )
    {
      wait_secs = $default_sqs_wait_secs$.getGlobalValue();
    }
    final SubLObject reply = communicate_with_local_sqs_relayer( get_sqs_dequeue_command( queue_name, retries, wait_secs ) );
    if( NIL != success_sqs_response_p( reply ) )
    {
      return sqs_response_reply( reply );
    }
    return process_sqs_error_response( reply );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 8149L)
  public static SubLObject sqs_message_body_from_message(final SubLObject message, SubLObject v_default)
  {
    if( v_default == UNPROVIDED )
    {
      v_default = $str8$;
    }
    return conses_high.getf( message, $kw9$MESSAGE, v_default );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 8330L)
  public static SubLObject sqs_get_message_content(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs)
  {
    if( retries == UNPROVIDED )
    {
      retries = $default_sqs_retries$.getGlobalValue();
    }
    if( wait_secs == UNPROVIDED )
    {
      wait_secs = $default_sqs_wait_secs$.getGlobalValue();
    }
    return sqs_message_body_from_message( sqs_get_message( queue_name, retries, wait_secs ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 8733L)
  public static SubLObject sqs_pending_message_estimate(final SubLObject queue_name)
  {
    final SubLObject reply = communicate_with_local_sqs_relayer( get_sqs_pending_message_estimate_command( queue_name ) );
    if( NIL != success_sqs_response_p( reply ) )
    {
      return sqs_response_reply( reply );
    }
    return process_sqs_error_response( reply );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 9137L)
  public static SubLObject s3_put_file(final SubLObject bucket, final SubLObject key, final SubLObject filename)
  {
    final SubLObject reply = communicate_with_local_sqs_relayer( get_s3_putfile_command( bucket, key, filename ) );
    if( NIL != success_sqs_response_p( reply ) )
    {
      return sqs_response_reply( reply );
    }
    return process_sqs_error_response( reply );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 9539L)
  public static SubLObject s3_get_file_contents(final SubLObject bucket, final SubLObject key)
  {
    final SubLObject reply = communicate_with_local_sqs_relayer( get_s3_getfile_command( bucket, key ) );
    if( NIL != success_sqs_response_p( reply ) )
    {
      return sqs_response_reply( reply );
    }
    return process_sqs_error_response( reply );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 9945L)
  public static SubLObject s3_get_file(final SubLObject bucket, final SubLObject key, final SubLObject filename)
  {
    final SubLObject reply = communicate_with_local_sqs_relayer( get_s3_getfile_command( bucket, key ) );
    if( NIL != success_sqs_response_p( reply ) )
    {
      final SubLObject data = sqs_response_reply( reply );
      final SubLObject size = file_utilities.hex_string_to_file_contents( data, filename );
      return size;
    }
    process_sqs_error_response( reply );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 10467L)
  public static SubLObject communicate_with_local_sqs_relayer(final SubLObject command)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym10$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          SubLObject s = NIL;
          try
          {
            s = subl_promotions.open_tcp_stream_with_timeout( $local_sqs_relay_host$.getDynamicValue( thread ), $local_sqs_relay_port$.getDynamicValue( thread ), NIL, $kw11$PUBLIC );
            if( NIL != subl_macro_promotions.validate_tcp_connection( s, $local_sqs_relay_host$.getDynamicValue( thread ), $local_sqs_relay_port$.getDynamicValue( thread ) ) )
            {
              if( command.isString() )
              {
                streams_high.write_string( command, s, UNPROVIDED, UNPROVIDED );
              }
              else if( NIL != list_utilities.list_of_type_p( $sym12$STRINGP, command ) )
              {
                SubLObject cdolist_list_var = command;
                SubLObject fragment = NIL;
                fragment = cdolist_list_var.first();
                while ( NIL != cdolist_list_var)
                {
                  streams_high.write_string( fragment, s, UNPROVIDED, UNPROVIDED );
                  cdolist_list_var = cdolist_list_var.rest();
                  fragment = cdolist_list_var.first();
                }
              }
              else
              {
                Errors.error( $str13$Only_support_STRINGP_or_LIST_OF_T );
              }
              string_utilities.network_terpri( s );
              streams_high.force_output( s );
              result = reader.read( s, NIL, $kw14$EOF, UNPROVIDED );
              if( result.isCons() )
              {
                result = Eval.eval( result );
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( NIL != s )
              {
                streams_high.close( s, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
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
      message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL == result || result == $kw14$EOF )
    {
      message = $str15$Empty_result_____suspicious_;
    }
    if( message.isString() )
    {
      return ConsesLow.list( $kw16$ERROR, $str17$Bogus_result_returned_by_server_, message );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 11755L)
  public static SubLObject with_sqs_message_to_string(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject stream = NIL;
    SubLObject string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list20 );
    string = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym21$CWITH_OUTPUT_TO_STRING, ConsesLow.list( stream, string ), ConsesLow.list( $sym22$CLET, ConsesLow.list( ConsesLow.list( $sym23$_XML_STREAM_, stream ) ), ConsesLow.listS( $sym24$XML_TAG,
          $list25, ConsesLow.append( body, NIL ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list20 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 12029L)
  public static SubLObject get_sqs_version_command()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject command = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        try
        {
          final SubLObject _prev_bind_0_$2 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str26$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $kw27$UNINITIALIZED );
            final SubLObject _prev_bind_0_$3 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            final SubLObject _prev_bind_1_$4 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str28$version, NIL, T, NIL, $kw27$UNINITIALIZED );
              final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$4, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_1_$4, thread );
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$3, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$2, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str26$request );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$5, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      command = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return command;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 12193L)
  public static SubLObject get_sqs_create_queue_command(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs)
  {
    if( retries == UNPROVIDED )
    {
      retries = $default_sqs_retries$.getGlobalValue();
    }
    if( wait_secs == UNPROVIDED )
    {
      wait_secs = $default_sqs_wait_secs$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject att_list = get_sqs_queue_access_attribute_list( queue_name, retries, wait_secs );
    SubLObject command = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        try
        {
          final SubLObject _prev_bind_0_$7 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str26$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $kw27$UNINITIALIZED );
            final SubLObject _prev_bind_0_$8 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            final SubLObject _prev_bind_1_$9 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str29$createq, att_list, T, NIL, $kw27$UNINITIALIZED );
              final SubLObject _prev_bind_0_$9 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$9, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_1_$9, thread );
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$8, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$7, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$10 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str26$request );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$10, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      command = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return command;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 12624L)
  public static SubLObject get_sqs_delete_queue_command(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs)
  {
    if( retries == UNPROVIDED )
    {
      retries = $default_sqs_retries$.getGlobalValue();
    }
    if( wait_secs == UNPROVIDED )
    {
      wait_secs = $default_sqs_wait_secs$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject att_list = get_sqs_queue_access_attribute_list( queue_name, retries, wait_secs );
    SubLObject command = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        try
        {
          final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str26$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $kw27$UNINITIALIZED );
            final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            final SubLObject _prev_bind_1_$14 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str30$deleteq, att_list, T, NIL, $kw27$UNINITIALIZED );
              final SubLObject _prev_bind_0_$14 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$14, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_1_$14, thread );
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$13, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$12, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str26$request );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$15, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      command = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return command;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13055L)
  public static SubLObject get_sqs_enqueue_command(final SubLObject queue_name, final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject att_list = get_sqs_queue_attribute_list( queue_name );
    SubLObject command = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        try
        {
          final SubLObject _prev_bind_0_$17 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str26$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $kw27$UNINITIALIZED );
            final SubLObject _prev_bind_0_$18 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              try
              {
                final SubLObject _prev_bind_0_$19 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$20 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str31$enqueue, att_list, NIL, NIL, $kw27$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
                    xml_utilities.xml_write( string, UNPROVIDED );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$20, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$20, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$19, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  xml_utilities.xml_end_tag_internal( $str31$enqueue );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
                }
              }
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$18, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$17, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$22 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str26$request );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$22, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      command = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return command;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13334L)
  public static SubLObject clear_get_empty_sqs_enqueue_command_fragments()
  {
    final SubLObject cs = $get_empty_sqs_enqueue_command_fragments_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13334L)
  public static SubLObject remove_get_empty_sqs_enqueue_command_fragments(final SubLObject queue_name)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $get_empty_sqs_enqueue_command_fragments_caching_state$.getGlobalValue(), ConsesLow.list( queue_name ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13334L)
  public static SubLObject get_empty_sqs_enqueue_command_fragments_internal(final SubLObject queue_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject att_list = get_sqs_queue_attribute_list( queue_name );
    SubLObject split_point = NIL;
    SubLObject command = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        try
        {
          final SubLObject _prev_bind_0_$24 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str26$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $kw27$UNINITIALIZED );
            final SubLObject _prev_bind_0_$25 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              try
              {
                final SubLObject _prev_bind_0_$26 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$27 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str31$enqueue, att_list, NIL, NIL, $kw27$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$27 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
                    split_point = streams_high.file_position( xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED );
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$27, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$27, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$26, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values = Values.getValuesAsVector();
                  xml_utilities.xml_end_tag_internal( $str31$enqueue );
                  Values.restoreValuesFromVector( _values );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
                }
              }
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$25, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$24, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str26$request );
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      command = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return ConsesLow.list( string_utilities.substring( command, ZERO_INTEGER, split_point ), string_utilities.substring( command, split_point, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13334L)
  public static SubLObject get_empty_sqs_enqueue_command_fragments(final SubLObject queue_name)
  {
    SubLObject caching_state = $get_empty_sqs_enqueue_command_fragments_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym32$GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS, $sym33$_GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS_CACHING_STATE_, TWENTY_INTEGER, EQUAL,
          ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, queue_name, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( get_empty_sqs_enqueue_command_fragments_internal( queue_name ) ) );
      memoization_state.caching_state_put( caching_state, queue_name, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 13876L)
  public static SubLObject get_sqs_dequeue_command(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs)
  {
    if( retries == UNPROVIDED )
    {
      retries = $default_sqs_retries$.getGlobalValue();
    }
    if( wait_secs == UNPROVIDED )
    {
      wait_secs = $default_sqs_wait_secs$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject att_list = get_sqs_queue_access_attribute_list( queue_name, retries, wait_secs );
    SubLObject command = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        try
        {
          final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str26$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $kw27$UNINITIALIZED );
            final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            final SubLObject _prev_bind_1_$33 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str34$dequeue, att_list, T, NIL, $kw27$UNINITIALIZED );
              final SubLObject _prev_bind_0_$33 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$33, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_1_$33, thread );
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$32, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$31, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str26$request );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      command = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return command;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 14297L)
  public static SubLObject get_sqs_pending_message_estimate_command(final SubLObject queue_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject att_list = get_sqs_queue_attribute_list( queue_name );
    SubLObject command = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        try
        {
          final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str26$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $kw27$UNINITIALIZED );
            final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            final SubLObject _prev_bind_1_$38 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str35$pending, att_list, T, NIL, $kw27$UNINITIALIZED );
              final SubLObject _prev_bind_0_$38 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$38, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_1_$38, thread );
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$37, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$36, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str26$request );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$39, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      command = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return command;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 14555L)
  public static SubLObject get_sqs_list_queues_command()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject command = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        try
        {
          final SubLObject _prev_bind_0_$41 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str26$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $kw27$UNINITIALIZED );
            final SubLObject _prev_bind_0_$42 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            final SubLObject _prev_bind_1_$43 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str36$listqs, NIL, T, NIL, $kw27$UNINITIALIZED );
              final SubLObject _prev_bind_0_$43 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$43, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_1_$43, thread );
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$42, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$41, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str26$request );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      command = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return command;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 14722L)
  public static SubLObject get_s3_putfile_command(final SubLObject bucket, final SubLObject key, final SubLObject pathname)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject data = file_utilities.file_contents_to_hex_string( pathname );
    final SubLObject att_list = get_s3_file_attribute_list( bucket, key );
    SubLObject command = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        try
        {
          final SubLObject _prev_bind_0_$46 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str26$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $kw27$UNINITIALIZED );
            final SubLObject _prev_bind_0_$47 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              try
              {
                final SubLObject _prev_bind_0_$48 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                final SubLObject _prev_bind_1_$49 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                try
                {
                  xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
                  xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                  xml_utilities.xml_start_tag_internal( $str37$putfile, att_list, NIL, NIL, $kw27$UNINITIALIZED );
                  final SubLObject _prev_bind_0_$49 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                  try
                  {
                    xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
                    try
                    {
                      final SubLObject _prev_bind_0_$50 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
                      final SubLObject _prev_bind_1_$50 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
                      try
                      {
                        xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ),
                            thread );
                        xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
                        xml_utilities.xml_start_tag_internal( $str38$data, NIL, NIL, NIL, $kw27$UNINITIALIZED );
                        final SubLObject _prev_bind_0_$51 = xml_vars.$xml_default_namespace$.currentBinding( thread );
                        try
                        {
                          xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
                          streams_high.write_string( data, xml_vars.$xml_stream$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED );
                        }
                        finally
                        {
                          xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$51, thread );
                        }
                      }
                      finally
                      {
                        xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$50, thread );
                        xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$50, thread );
                      }
                    }
                    finally
                    {
                      final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                      try
                      {
                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                        final SubLObject _values = Values.getValuesAsVector();
                        xml_utilities.xml_end_tag_internal( $str38$data );
                        Values.restoreValuesFromVector( _values );
                      }
                      finally
                      {
                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$52, thread );
                      }
                    }
                  }
                  finally
                  {
                    xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$49, thread );
                  }
                }
                finally
                {
                  xml_utilities.$cycml_indent_level$.rebind( _prev_bind_1_$49, thread );
                  xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$48, thread );
                }
              }
              finally
              {
                final SubLObject _prev_bind_0_$53 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                  final SubLObject _values2 = Values.getValuesAsVector();
                  xml_utilities.xml_terpri();
                  xml_utilities.xml_end_tag_internal( $str37$putfile );
                  Values.restoreValuesFromVector( _values2 );
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$53, thread );
                }
              }
            }
            finally
            {
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$47, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$46, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$54 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values3 = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str26$request );
            Values.restoreValuesFromVector( _values3 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$54, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      command = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values4 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values4 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return command;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 15102L)
  public static SubLObject get_s3_getfile_command(final SubLObject bucket, final SubLObject key)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject att_list = get_s3_file_attribute_list( bucket, key );
    SubLObject command = NIL;
    SubLObject s = NIL;
    try
    {
      s = streams_high.make_private_string_output_stream();
      final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding( thread );
      try
      {
        xml_vars.$xml_stream$.bind( s, thread );
        try
        {
          final SubLObject _prev_bind_0_$57 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
          final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
          try
          {
            xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
            xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
            xml_utilities.xml_start_tag_internal( $str26$request, $default_sqs_request_attribute_list$.getGlobalValue(), NIL, NIL, $kw27$UNINITIALIZED );
            final SubLObject _prev_bind_0_$58 = xml_vars.$xml_default_namespace$.currentBinding( thread );
            final SubLObject _prev_bind_1_$59 = xml_utilities.$xml_indentation_level$.currentBinding( thread );
            final SubLObject _prev_bind_3 = xml_utilities.$cycml_indent_level$.currentBinding( thread );
            try
            {
              xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              xml_utilities.$xml_indentation_level$.bind( Numbers.add( xml_utilities.$xml_indentation_amount$.getDynamicValue( thread ), xml_utilities.$xml_indentation_level$.getDynamicValue( thread ) ), thread );
              xml_utilities.$cycml_indent_level$.bind( xml_utilities.$xml_indentation_level$.getDynamicValue( thread ), thread );
              xml_utilities.xml_start_tag_internal( $str39$getfile, att_list, T, NIL, $kw27$UNINITIALIZED );
              final SubLObject _prev_bind_0_$59 = xml_vars.$xml_default_namespace$.currentBinding( thread );
              try
              {
                xml_vars.$xml_default_namespace$.bind( $kw27$UNINITIALIZED, thread );
              }
              finally
              {
                xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$59, thread );
              }
            }
            finally
            {
              xml_utilities.$cycml_indent_level$.rebind( _prev_bind_3, thread );
              xml_utilities.$xml_indentation_level$.rebind( _prev_bind_1_$59, thread );
              xml_vars.$xml_default_namespace$.rebind( _prev_bind_0_$58, thread );
            }
          }
          finally
          {
            xml_utilities.$cycml_indent_level$.rebind( _prev_bind_2, thread );
            xml_utilities.$xml_indentation_level$.rebind( _prev_bind_0_$57, thread );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$60 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal( $str26$request );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$60, thread );
          }
        }
      }
      finally
      {
        xml_vars.$xml_stream$.rebind( _prev_bind_0, thread );
      }
      command = streams_high.get_output_stream_string( s );
    }
    finally
    {
      final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( s, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
      }
    }
    return command;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 15340L)
  public static SubLObject get_sqs_queue_access_attribute_list(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs)
  {
    if( retries == UNPROVIDED )
    {
      retries = $default_sqs_retries$.getGlobalValue();
    }
    if( wait_secs == UNPROVIDED )
    {
      wait_secs = $default_sqs_wait_secs$.getGlobalValue();
    }
    return ConsesLow.append( get_sqs_queue_attribute_list( queue_name ), get_sqs_time_out_info_attribute_list( retries, wait_secs ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 15731L)
  public static SubLObject get_sqs_queue_attribute_list(final SubLObject queue_name)
  {
    return ConsesLow.list( $str40$name, queue_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 15827L)
  public static SubLObject get_sqs_time_out_info_attribute_list(SubLObject retries, SubLObject wait_secs)
  {
    if( retries == UNPROVIDED )
    {
      retries = $default_sqs_retries$.getGlobalValue();
    }
    if( wait_secs == UNPROVIDED )
    {
      wait_secs = $default_sqs_wait_secs$.getGlobalValue();
    }
    return ConsesLow.list( $str41$maxTries, retries, $str42$maxWaitSecs, wait_secs );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 16136L)
  public static SubLObject get_s3_file_attribute_list(final SubLObject bucket, final SubLObject key)
  {
    return ConsesLow.list( $str43$bucket, bucket, $str44$key, key );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 21356L)
  public static SubLObject new_sqs_iterator(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs)
  {
    if( retries == UNPROVIDED )
    {
      retries = $default_sqs_retries$.getGlobalValue();
    }
    if( wait_secs == UNPROVIDED )
    {
      wait_secs = $default_sqs_wait_secs$.getGlobalValue();
    }
    return iteration.new_iterator( make_sqs_iterator_state( queue_name, retries, wait_secs ), $sym45$SQS_ITERATOR_DONE_, $sym46$SQS_ITERATOR_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 21847L)
  public static SubLObject make_sqs_iterator_state(final SubLObject queue_name, final SubLObject retries, final SubLObject wait_secs)
  {
    final SubLObject doneP = NIL;
    return ConsesLow.list( queue_name, retries, wait_secs, doneP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 21992L)
  public static SubLObject sqs_iterator_doneP(final SubLObject state)
  {
    final SubLObject doneP = ConsesLow.nth( THREE_INTEGER, state );
    return doneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 22094L)
  public static SubLObject sqs_iterator_next(final SubLObject state)
  {
    SubLObject queue_name = NIL;
    SubLObject retries = NIL;
    SubLObject wait_secs = NIL;
    SubLObject doneP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list47 );
    queue_name = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list47 );
    retries = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list47 );
    wait_secs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list47 );
    doneP = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list47 );
      return NIL;
    }
    final SubLObject full_message = sqs_get_message( queue_name, retries, wait_secs );
    if( NIL == full_message || NIL != sqs_empty_message_p( full_message ) )
    {
      doneP = T;
      ConsesLow.set_nth( THREE_INTEGER, state, doneP );
      return Values.values( NIL, state, T );
    }
    return Values.values( sqs_message_body_from_message( full_message, UNPROVIDED ), state, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 22571L)
  public static SubLObject new_sqs_accumulator(final SubLObject queue_name, SubLObject retries, SubLObject wait_secs)
  {
    if( retries == UNPROVIDED )
    {
      retries = $default_sqs_retries$.getGlobalValue();
    }
    if( wait_secs == UNPROVIDED )
    {
      wait_secs = $default_sqs_wait_secs$.getGlobalValue();
    }
    return accumulation.new_accumulator( make_sqs_accumulator_state( queue_name, retries, wait_secs ), $sym48$SQS_ACCUMULATOR_RESET, $sym49$SQS_ACCUMULATOR_ADD, $sym50$SQS_ACCUMULATOR_SIZE,
        $sym51$SQS_ACCUMULATOR_CONTENTS, $sym52$SQS_ACCUMULATOR_IT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 23175L)
  public static SubLObject make_sqs_accumulator_state(final SubLObject queue_name, final SubLObject retries, final SubLObject wait_secs)
  {
    return ConsesLow.list( queue_name, retries, wait_secs, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 23297L)
  public static SubLObject sqs_accumulator_reset(final SubLObject state)
  {
    SubLObject queue_name = NIL;
    SubLObject retries = NIL;
    SubLObject wait_secs = NIL;
    SubLObject posts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list53 );
    queue_name = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list53 );
    retries = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list53 );
    wait_secs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list53 );
    posts = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return make_sqs_accumulator_state( queue_name, retries, wait_secs );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list53 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 23514L)
  public static SubLObject sqs_accumulator_add(final SubLObject state, final SubLObject message)
  {
    enforceType( message, $sym12$STRINGP );
    SubLObject queue_name = NIL;
    SubLObject retries = NIL;
    SubLObject wait_secs = NIL;
    SubLObject posts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list53 );
    queue_name = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list53 );
    retries = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list53 );
    wait_secs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list53 );
    posts = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject result = sqs_post_message( queue_name, message );
      if( NIL != list_utilities.sublisp_boolean( result ) )
      {
        posts = Numbers.add( posts, ONE_INTEGER );
        ConsesLow.set_nth( THREE_INTEGER, state, posts );
      }
      else
      {
        Errors.error( $str54$Could_not_post__A_to__A_, message, queue_name );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list53 );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 23953L)
  public static SubLObject sqs_accumulator_get_posts(final SubLObject state)
  {
    return ConsesLow.nth( THREE_INTEGER, state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 24027L)
  public static SubLObject sqs_accumulator_size(final SubLObject state)
  {
    return sqs_accumulator_get_posts( state ).isZero() ? ZERO_INTEGER : ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 24142L)
  public static SubLObject sqs_accumulator_contents(final SubLObject state, SubLObject resetP)
  {
    if( resetP == UNPROVIDED )
    {
      resetP = NIL;
    }
    SubLObject queue_name = NIL;
    SubLObject retries = NIL;
    SubLObject wait_secs = NIL;
    SubLObject posts = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list53 );
    queue_name = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list53 );
    retries = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list53 );
    wait_secs = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list53 );
    posts = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return Values.values( posts, ( NIL != resetP ) ? make_sqs_accumulator_state( queue_name, retries, wait_secs ) : state );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list53 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 24451L)
  public static SubLObject sqs_accumulator_it(final SubLObject state)
  {
    final SubLObject posts = sqs_accumulator_get_posts( state );
    return posts.isZero() ? iteration.new_null_iterator() : iteration.new_list_iterator( ConsesLow.list( posts ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 24640L)
  public static SubLObject accumulate_assertion_description(final SubLObject acc, final SubLObject sentence, final SubLObject elmt, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    assert NIL != accumulation.accumulator_p( acc ) : acc;
    accumulation.accumulation_add( acc, encapsulate_assertion_description( sentence, elmt, v_properties ) );
    return acc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 25029L)
  public static SubLObject encapsulate_assertion_description(final SubLObject sentence, final SubLObject elmt, final SubLObject v_properties)
  {
    return ConsesLow.list( $kw56$SENTENCE, sentence, $kw57$ELMT, elmt, $kw58$PROPERTIES, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 25202L)
  public static SubLObject unencapsulate_assertion_description(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject sentence = NIL;
    SubLObject elmt = NIL;
    SubLObject v_properties = NIL;
    SubLObject ass_desc = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    sentence = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    elmt = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    v_properties = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    ass_desc = current.first();
    current = current.rest();
    final SubLObject default_properties = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list59 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym22$CLET, ConsesLow.list( ConsesLow.list( sentence, ConsesLow.listS( $sym60$GETF, ass_desc, $list61 ) ), ConsesLow.list( elmt, ConsesLow.listS( $sym60$GETF, ass_desc, $list62 ) ),
          ConsesLow.list( v_properties, ConsesLow.list( $sym60$GETF, ass_desc, $kw58$PROPERTIES, default_properties ) ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list59 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 25601L)
  public static SubLObject handle_assertion_descriptions(final SubLObject iterator, SubLObject default_props)
  {
    if( default_props == UNPROVIDED )
    {
      default_props = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject ass_desc = iteration.iteration_next( iterator );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        handle_assertion_description( ass_desc, default_props );
      }
    }
    return $kw63$EXHAUSTED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 25804L)
  public static SubLObject handle_assertion_description(final SubLObject ass_desc, SubLObject default_props)
  {
    if( default_props == UNPROVIDED )
    {
      default_props = NIL;
    }
    final SubLObject sentence = conses_high.getf( ass_desc, $kw56$SENTENCE, UNPROVIDED );
    final SubLObject elmt = conses_high.getf( ass_desc, $kw57$ELMT, UNPROVIDED );
    final SubLObject v_properties = conses_high.getf( ass_desc, $kw58$PROPERTIES, default_props );
    return cyc_kernel.cyc_assert( sentence, elmt, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 26024L)
  public static SubLObject new_externalizing_accumulator(final SubLObject accumulator)
  {
    return accumulation.new_transform_accumulator( accumulator, $sym64$COMPACT_HL_EXTERNAL_ID_STRING, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 26264L)
  public static SubLObject new_internalizing_iterator(final SubLObject iterator)
  {
    return iteration.new_transform_iterator( iterator, $sym65$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 26980L)
  public static SubLObject new_segment_accumulator(final SubLObject accumulator, SubLObject max_bytes, SubLObject cfasl_externalizedP)
  {
    if( max_bytes == UNPROVIDED )
    {
      max_bytes = $recommended_max_bytes_per_sqs_message$.getGlobalValue();
    }
    if( cfasl_externalizedP == UNPROVIDED )
    {
      cfasl_externalizedP = NIL;
    }
    return accumulation.new_accumulator( make_segment_accumulator_state( accumulator, max_bytes, cfasl_externalizedP ), $sym68$SGMT_ACCUMULATOR_RESET, $sym69$SGMT_ACCUMULATOR_ADD, $sym70$SGMT_ACCUMULATOR_SIZE,
        $sym71$SGMT_ACCUMULATOR_CONTENTS, $sym72$SGMT_ACCUMULATOR_IT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 28040L)
  public static SubLObject make_segment_accumulator_state(final SubLObject acc, final SubLObject max_bytes, final SubLObject cfasl_externalizedP)
  {
    final SubLObject stream = cfasl.new_cfasl_encoding_stream();
    final SubLObject total = ZERO_INTEGER;
    return ConsesLow.list( acc, stream, total, max_bytes, cfasl_externalizedP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 28309L)
  public static SubLObject sgmt_accumulator_size(final SubLObject state)
  {
    return ConsesLow.nth( TWO_INTEGER, state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 28379L)
  public static SubLObject sgmt_accumulator_reset(final SubLObject state)
  {
    SubLObject acc = NIL;
    SubLObject stream = NIL;
    SubLObject total = NIL;
    SubLObject max_bytes = NIL;
    SubLObject cfasl_externalizedP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list73 );
    acc = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list73 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list73 );
    total = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list73 );
    max_bytes = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list73 );
    cfasl_externalizedP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      accumulation.accumulation_reset( acc );
      return make_segment_accumulator_state( acc, max_bytes, cfasl_externalizedP );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list73 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 28645L)
  public static SubLObject sgmt_accumulator_add(final SubLObject state, final SubLObject v_object)
  {
    return sgmt_accumulator_add_internal( state, v_object, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 28752L)
  public static SubLObject sgmt_accumulator_add_internal(final SubLObject state, final SubLObject v_object, SubLObject error_on_overflowP)
  {
    if( error_on_overflowP == UNPROVIDED )
    {
      error_on_overflowP = NIL;
    }
    SubLObject acc = NIL;
    SubLObject stream = NIL;
    SubLObject total = NIL;
    SubLObject max_bytes = NIL;
    SubLObject cfasl_externalizedP = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list73 );
    acc = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list73 );
    stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list73 );
    total = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list73 );
    max_bytes = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list73 );
    cfasl_externalizedP = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject old_char_pos = cfasl.cfasl_encoding_stream_hexchar_position( stream );
      final SubLObject old_position = cfasl.cfasl_encoding_stream_byte_position( stream );
      SubLObject new_position = NIL;
      if( NIL != cfasl_externalizedP )
      {
        cfasl.cfasl_output_externalized( v_object, stream );
      }
      else
      {
        cfasl.cfasl_output( v_object, stream );
      }
      new_position = cfasl.cfasl_encoding_stream_byte_position( stream );
      if( new_position.numL( max_bytes ) )
      {
        ConsesLow.set_nth( TWO_INTEGER, state, Numbers.add( ONE_INTEGER, total ) );
      }
      else
      {
        if( !new_position.numE( max_bytes ) )
        {
          if( NIL != error_on_overflowP )
          {
            final SubLObject delta = Numbers.subtract( new_position, old_position );
            if( max_bytes.numL( delta ) )
            {
              Errors.error( $str74$Object__A_encodes_as__A_bytes__mo, v_object, delta, max_bytes );
            }
            else
            {
              Errors.error( $str75$Implementation_error__serializing, v_object, delta, max_bytes );
            }
          }
          sgmt_accumulator_flush_encoding_stream_up_to( acc, stream, old_char_pos );
          ConsesLow.set_nth( ONE_INTEGER, state, cfasl.new_cfasl_encoding_stream() );
          error_on_overflowP = T;
          return sgmt_accumulator_add_internal( state, v_object, error_on_overflowP );
        }
        sgmt_accumulator_flush_encoding_stream( acc, stream );
        ConsesLow.set_nth( ONE_INTEGER, state, cfasl.new_cfasl_encoding_stream() );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list73 );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 30604L)
  public static SubLObject sgmt_accumulator_contents(final SubLObject state, SubLObject resetP)
  {
    if( resetP == UNPROVIDED )
    {
      resetP = NIL;
    }
    sgmt_accumulator_possibly_flush_encoding_stream( state );
    final SubLObject acc = state.first();
    final SubLObject contents = accumulation.accumulation_contents( acc, resetP );
    return Values.values( contents, ( NIL != resetP ) ? sgmt_accumulator_reset( state ) : state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 30912L)
  public static SubLObject sgmt_accumulator_it(final SubLObject state)
  {
    final SubLObject acc = state.first();
    return accumulation.accumulation_iterator( acc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 31027L)
  public static SubLObject sgmt_accumulator_possibly_flush_encoding_stream(final SubLObject state)
  {
    final SubLObject acc = state.first();
    final SubLObject stream = conses_high.second( state );
    if( !cfasl.cfasl_encoding_stream_byte_position( stream ).isZero() )
    {
      sgmt_accumulator_flush_encoding_stream( acc, stream );
    }
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 31304L)
  public static SubLObject sgmt_accumulator_flush_encoding_stream(final SubLObject acc, final SubLObject stream)
  {
    final SubLObject limit = cfasl.cfasl_encoding_stream_hexchar_position( stream );
    return sgmt_accumulator_flush_encoding_stream_up_to( acc, stream, limit );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 31519L)
  public static SubLObject sgmt_accumulator_flush_encoding_stream_up_to(final SubLObject acc, final SubLObject stream, final SubLObject limit)
  {
    SubLObject segment = cfasl.cfasl_encoding_string_stream_encoding( stream );
    cfasl.close_cfasl_encoding_stream( stream );
    if( limit.numL( Sequences.length( segment ) ) )
    {
      segment = string_utilities.substring( segment, ZERO_INTEGER, limit );
    }
    accumulation.accumulation_add( acc, segment );
    return acc;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 31846L)
  public static SubLObject new_sqs_segment_iterator(final SubLObject sqs_iterator)
  {
    enforceType( sqs_iterator, $sym76$ITERATOR_P );
    return iteration.new_iterator( make_sqs_segment_iterator_state( sqs_iterator ), $sym77$SQS_SGMNT_IT_DONE, $sym78$SQS_SGMNT_IT_NEXT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 32327L)
  public static SubLObject make_sqs_segment_iterator_state(final SubLObject sqs_it)
  {
    return ConsesLow.list( sqs_it, iteration.new_null_iterator() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 32566L)
  public static SubLObject sqs_sgmnt_it_done(final SubLObject state)
  {
    SubLObject sqs_it = NIL;
    SubLObject sgmt_it = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list79 );
    sqs_it = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list79 );
    sgmt_it = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return makeBoolean( NIL != iteration.iteration_done( sgmt_it ) && NIL != iteration.iteration_done( sqs_it ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( state, $list79 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 32832L)
  public static SubLObject sqs_sgmnt_it_next(final SubLObject state)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject sqs_it = NIL;
    SubLObject sgmt_it = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( state, state, $list79 );
    sqs_it = state.first();
    SubLObject current = state.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, state, $list79 );
    sgmt_it = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( state, $list79 );
      return NIL;
    }
    thread.resetMultipleValues();
    final SubLObject value = iteration.iteration_next( sgmt_it );
    SubLObject validP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != validP )
    {
      return Values.values( value, state, NIL );
    }
    thread.resetMultipleValues();
    final SubLObject segment = iteration.iteration_next( sqs_it );
    validP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == validP )
    {
      return Values.values( NIL, state, T );
    }
    final SubLObject new_sgmt_it = new_iterator_from_segment_contents( segment );
    ConsesLow.set_nth( ONE_INTEGER, state, new_sgmt_it );
    thread.resetMultipleValues();
    final SubLObject value2 = iteration.iteration_next( new_sgmt_it );
    final SubLObject validP_$62 = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Values.values( value2, state, makeBoolean( NIL == validP_$62 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 33754L)
  public static SubLObject new_iterator_from_segment_contents(final SubLObject segment)
  {
    return iteration.new_list_iterator( Sequences.nreverse( cfasl_utilities.cfasl_load_all_from_string( segment ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 33896L)
  public static SubLObject monitor_all_sqs_queues(SubLObject wait_time)
  {
    if( wait_time == UNPROVIDED )
    {
      wait_time = $int80$30;
    }
    SubLObject all_emptyP = NIL;
    SubLObject doneP = NIL;
    while ( NIL == doneP)
    {
      all_emptyP = T;
      SubLObject cdolist_list_var = sqs_list_queues();
      SubLObject queue = NIL;
      queue = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject estimate = sqs_pending_message_estimate( queue );
        if( !estimate.isZero() )
        {
          PrintLow.format( T, $str81$___A__A___A_msgs__, new SubLObject[] { numeric_date_utilities.timestring( UNPROVIDED ), queue, estimate
          } );
          all_emptyP = NIL;
        }
        cdolist_list_var = cdolist_list_var.rest();
        queue = cdolist_list_var.first();
      }
      if( NIL != all_emptyP )
      {
        doneP = T;
      }
      else
      {
        Threads.sleep( wait_time );
      }
    }
    return $kw82$ALL_EMPTY;
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 34572L)
  public static SubLObject drain_some_sqs_queues(SubLObject v_queues)
  {
    if( v_queues == UNPROVIDED )
    {
      v_queues = sqs_list_queues();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject checked_queues = NIL;
    SubLObject cdolist_list_var = v_queues;
    SubLObject queue = NIL;
    queue = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != is_known_sqs_queueP( queue ) )
      {
        checked_queues = ConsesLow.cons( queue, checked_queues );
        SubLObject counter = ZERO_INTEGER;
        final SubLObject sqs_it = new_sqs_iterator( queue, UNPROVIDED, UNPROVIDED );
        format_nil.force_format( T, $str83$___A__Cleaning_up_ca__A_msgs_from, numeric_date_utilities.timestring( UNPROVIDED ), sqs_pending_message_estimate( queue ), queue, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED,
            UNPROVIDED );
        SubLObject valid;
        for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
        {
          thread.resetMultipleValues();
          final SubLObject msg = iteration.iteration_next( sqs_it );
          valid = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != valid )
          {
            counter = Numbers.add( counter, ONE_INTEGER );
          }
        }
        format_nil.force_format( T, $str84$___A__Removed__A_msgs_from__A___, numeric_date_utilities.timestring( UNPROVIDED ), counter, queue, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
      cdolist_list_var = cdolist_list_var.rest();
      queue = cdolist_list_var.first();
    }
    return Sequences.nreverse( checked_queues );
  }

  @SubLTranslatedFile.SubL(source = "cycl/simple-queue-service.lisp", position = 35383L)
  public static SubLObject configure_sqs_queue_name(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject place = NIL;
    SubLObject value = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    place = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list85 );
    value = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym86$PROGN, ConsesLow.list( $sym87$MUST, ConsesLow.list( $sym88$IS_KNOWN_SQS_QUEUE_, value ), $str89$_A_is_not_a_known_SQS_queue______, value ), ConsesLow.list( $sym90$CSETQ, place,
          value ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list85 );
    return NIL;
  }

  public static SubLObject declare_simple_queue_service_file()
  {
    SubLFiles.declareFunction( me, "success_sqs_response_p", "SUCCESS-SQS-RESPONSE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqs_response_p", "SQS-RESPONSE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "sqs_response_status", "SQS-RESPONSE-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "sqs_response_reply", "SQS-RESPONSE-REPLY", 1, 0, false );
    SubLFiles.declareFunction( me, "sqs_empty_message_p", "SQS-EMPTY-MESSAGE-P", 1, 0, false );
    SubLFiles.declareFunction( me, "process_sqs_error_response", "PROCESS-SQS-ERROR-RESPONSE", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sqs_version", "GET-SQS-VERSION", 0, 0, false );
    SubLFiles.declareFunction( me, "is_sqs_availableP", "IS-SQS-AVAILABLE?", 0, 0, false );
    SubLFiles.declareFunction( me, "sqs_list_queues", "SQS-LIST-QUEUES", 0, 0, false );
    SubLFiles.declareFunction( me, "is_known_sqs_queueP", "IS-KNOWN-SQS-QUEUE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sqs_create_queue", "SQS-CREATE-QUEUE", 1, 2, false );
    SubLFiles.declareFunction( me, "sqs_delete_queue", "SQS-DELETE-QUEUE", 1, 2, false );
    SubLFiles.declareFunction( me, "sqs_post_message", "SQS-POST-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "sqs_post_message_pieces", "SQS-POST-MESSAGE-PIECES", 2, 0, false );
    SubLFiles.declareFunction( me, "sqs_get_message", "SQS-GET-MESSAGE", 1, 2, false );
    SubLFiles.declareFunction( me, "sqs_message_body_from_message", "SQS-MESSAGE-BODY-FROM-MESSAGE", 1, 1, false );
    SubLFiles.declareFunction( me, "sqs_get_message_content", "SQS-GET-MESSAGE-CONTENT", 1, 2, false );
    SubLFiles.declareFunction( me, "sqs_pending_message_estimate", "SQS-PENDING-MESSAGE-ESTIMATE", 1, 0, false );
    SubLFiles.declareFunction( me, "s3_put_file", "S3-PUT-FILE", 3, 0, false );
    SubLFiles.declareFunction( me, "s3_get_file_contents", "S3-GET-FILE-CONTENTS", 2, 0, false );
    SubLFiles.declareFunction( me, "s3_get_file", "S3-GET-FILE", 3, 0, false );
    SubLFiles.declareFunction( me, "communicate_with_local_sqs_relayer", "COMMUNICATE-WITH-LOCAL-SQS-RELAYER", 1, 0, false );
    SubLFiles.declareMacro( me, "with_sqs_message_to_string", "WITH-SQS-MESSAGE-TO-STRING" );
    SubLFiles.declareFunction( me, "get_sqs_version_command", "GET-SQS-VERSION-COMMAND", 0, 0, false );
    SubLFiles.declareFunction( me, "get_sqs_create_queue_command", "GET-SQS-CREATE-QUEUE-COMMAND", 1, 2, false );
    SubLFiles.declareFunction( me, "get_sqs_delete_queue_command", "GET-SQS-DELETE-QUEUE-COMMAND", 1, 2, false );
    SubLFiles.declareFunction( me, "get_sqs_enqueue_command", "GET-SQS-ENQUEUE-COMMAND", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_get_empty_sqs_enqueue_command_fragments", "CLEAR-GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_get_empty_sqs_enqueue_command_fragments", "REMOVE-GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_empty_sqs_enqueue_command_fragments_internal", "GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "get_empty_sqs_enqueue_command_fragments", "GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sqs_dequeue_command", "GET-SQS-DEQUEUE-COMMAND", 1, 2, false );
    SubLFiles.declareFunction( me, "get_sqs_pending_message_estimate_command", "GET-SQS-PENDING-MESSAGE-ESTIMATE-COMMAND", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sqs_list_queues_command", "GET-SQS-LIST-QUEUES-COMMAND", 0, 0, false );
    SubLFiles.declareFunction( me, "get_s3_putfile_command", "GET-S3-PUTFILE-COMMAND", 3, 0, false );
    SubLFiles.declareFunction( me, "get_s3_getfile_command", "GET-S3-GETFILE-COMMAND", 2, 0, false );
    SubLFiles.declareFunction( me, "get_sqs_queue_access_attribute_list", "GET-SQS-QUEUE-ACCESS-ATTRIBUTE-LIST", 1, 2, false );
    SubLFiles.declareFunction( me, "get_sqs_queue_attribute_list", "GET-SQS-QUEUE-ATTRIBUTE-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "get_sqs_time_out_info_attribute_list", "GET-SQS-TIME-OUT-INFO-ATTRIBUTE-LIST", 0, 2, false );
    SubLFiles.declareFunction( me, "get_s3_file_attribute_list", "GET-S3-FILE-ATTRIBUTE-LIST", 2, 0, false );
    SubLFiles.declareFunction( me, "new_sqs_iterator", "NEW-SQS-ITERATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "make_sqs_iterator_state", "MAKE-SQS-ITERATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "sqs_iterator_doneP", "SQS-ITERATOR-DONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "sqs_iterator_next", "SQS-ITERATOR-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_sqs_accumulator", "NEW-SQS-ACCUMULATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "make_sqs_accumulator_state", "MAKE-SQS-ACCUMULATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "sqs_accumulator_reset", "SQS-ACCUMULATOR-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "sqs_accumulator_add", "SQS-ACCUMULATOR-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "sqs_accumulator_get_posts", "SQS-ACCUMULATOR-GET-POSTS", 1, 0, false );
    SubLFiles.declareFunction( me, "sqs_accumulator_size", "SQS-ACCUMULATOR-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "sqs_accumulator_contents", "SQS-ACCUMULATOR-CONTENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "sqs_accumulator_it", "SQS-ACCUMULATOR-IT", 1, 0, false );
    SubLFiles.declareFunction( me, "accumulate_assertion_description", "ACCUMULATE-ASSERTION-DESCRIPTION", 3, 1, false );
    SubLFiles.declareFunction( me, "encapsulate_assertion_description", "ENCAPSULATE-ASSERTION-DESCRIPTION", 3, 0, false );
    SubLFiles.declareMacro( me, "unencapsulate_assertion_description", "UNENCAPSULATE-ASSERTION-DESCRIPTION" );
    SubLFiles.declareFunction( me, "handle_assertion_descriptions", "HANDLE-ASSERTION-DESCRIPTIONS", 1, 1, false );
    SubLFiles.declareFunction( me, "handle_assertion_description", "HANDLE-ASSERTION-DESCRIPTION", 1, 1, false );
    SubLFiles.declareFunction( me, "new_externalizing_accumulator", "NEW-EXTERNALIZING-ACCUMULATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_internalizing_iterator", "NEW-INTERNALIZING-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "new_segment_accumulator", "NEW-SEGMENT-ACCUMULATOR", 1, 2, false );
    SubLFiles.declareFunction( me, "make_segment_accumulator_state", "MAKE-SEGMENT-ACCUMULATOR-STATE", 3, 0, false );
    SubLFiles.declareFunction( me, "sgmt_accumulator_size", "SGMT-ACCUMULATOR-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "sgmt_accumulator_reset", "SGMT-ACCUMULATOR-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "sgmt_accumulator_add", "SGMT-ACCUMULATOR-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "sgmt_accumulator_add_internal", "SGMT-ACCUMULATOR-ADD-INTERNAL", 2, 1, false );
    SubLFiles.declareFunction( me, "sgmt_accumulator_contents", "SGMT-ACCUMULATOR-CONTENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "sgmt_accumulator_it", "SGMT-ACCUMULATOR-IT", 1, 0, false );
    SubLFiles.declareFunction( me, "sgmt_accumulator_possibly_flush_encoding_stream", "SGMT-ACCUMULATOR-POSSIBLY-FLUSH-ENCODING-STREAM", 1, 0, false );
    SubLFiles.declareFunction( me, "sgmt_accumulator_flush_encoding_stream", "SGMT-ACCUMULATOR-FLUSH-ENCODING-STREAM", 2, 0, false );
    SubLFiles.declareFunction( me, "sgmt_accumulator_flush_encoding_stream_up_to", "SGMT-ACCUMULATOR-FLUSH-ENCODING-STREAM-UP-TO", 3, 0, false );
    SubLFiles.declareFunction( me, "new_sqs_segment_iterator", "NEW-SQS-SEGMENT-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "make_sqs_segment_iterator_state", "MAKE-SQS-SEGMENT-ITERATOR-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "sqs_sgmnt_it_done", "SQS-SGMNT-IT-DONE", 1, 0, false );
    SubLFiles.declareFunction( me, "sqs_sgmnt_it_next", "SQS-SGMNT-IT-NEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_iterator_from_segment_contents", "NEW-ITERATOR-FROM-SEGMENT-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "monitor_all_sqs_queues", "MONITOR-ALL-SQS-QUEUES", 0, 1, false );
    SubLFiles.declareFunction( me, "drain_some_sqs_queues", "DRAIN-SOME-SQS-QUEUES", 0, 1, false );
    SubLFiles.declareMacro( me, "configure_sqs_queue_name", "CONFIGURE-SQS-QUEUE-NAME" );
    return NIL;
  }

  public static SubLObject init_simple_queue_service_file()
  {
    $local_sqs_relay_host$ = SubLFiles.defparameter( "*LOCAL-SQS-RELAY-HOST*", $str0$localhost );
    $local_sqs_relay_port$ = SubLFiles.defparameter( "*LOCAL-SQS-RELAY-PORT*", $int1$19219 );
    $default_sqs_retries$ = SubLFiles.defconstant( "*DEFAULT-SQS-RETRIES*", TEN_INTEGER );
    $default_sqs_wait_secs$ = SubLFiles.defconstant( "*DEFAULT-SQS-WAIT-SECS*", TEN_INTEGER );
    $sqs_error_reporting_policy$ = SubLFiles.defparameter( "*SQS-ERROR-REPORTING-POLICY*", $kw4$WARN_ON_ERROR );
    $default_sqs_request_attribute_list$ = SubLFiles.deflexical( "*DEFAULT-SQS-REQUEST-ATTRIBUTE-LIST*", ConsesLow.list( $str18$format, $str19$subl ) );
    $get_empty_sqs_enqueue_command_fragments_caching_state$ = SubLFiles.deflexical( "*GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS-CACHING-STATE*", NIL );
    $recommended_max_hex_chars_per_sqs_message$ = SubLFiles.deflexical( "*RECOMMENDED-MAX-HEX-CHARS-PER-SQS-MESSAGE*", Numbers.subtract( $int66$8192, $int67$256 ) );
    $recommended_max_bytes_per_sqs_message$ = SubLFiles.deflexical( "*RECOMMENDED-MAX-BYTES-PER-SQS-MESSAGE*", Numbers.integerDivide( $recommended_max_hex_chars_per_sqs_message$.getGlobalValue(), TWO_INTEGER ) );
    return NIL;
  }

  public static SubLObject setup_simple_queue_service_file()
  {
    memoization_state.note_globally_cached_function( $sym32$GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS );
    utilities_macros.note_funcall_helper_function( $sym45$SQS_ITERATOR_DONE_ );
    utilities_macros.note_funcall_helper_function( $sym46$SQS_ITERATOR_NEXT );
    utilities_macros.note_funcall_helper_function( $sym48$SQS_ACCUMULATOR_RESET );
    utilities_macros.note_funcall_helper_function( $sym49$SQS_ACCUMULATOR_ADD );
    utilities_macros.note_funcall_helper_function( $sym50$SQS_ACCUMULATOR_SIZE );
    utilities_macros.note_funcall_helper_function( $sym51$SQS_ACCUMULATOR_CONTENTS );
    utilities_macros.note_funcall_helper_function( $sym52$SQS_ACCUMULATOR_IT );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_simple_queue_service_file();
  }

  @Override
  public void initializeVariables()
  {
    init_simple_queue_service_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_simple_queue_service_file();
  }
  static
  {
    me = new simple_queue_service();
    $local_sqs_relay_host$ = null;
    $local_sqs_relay_port$ = null;
    $default_sqs_retries$ = null;
    $default_sqs_wait_secs$ = null;
    $sqs_error_reporting_policy$ = null;
    $default_sqs_request_attribute_list$ = null;
    $get_empty_sqs_enqueue_command_fragments_caching_state$ = null;
    $recommended_max_hex_chars_per_sqs_message$ = null;
    $recommended_max_bytes_per_sqs_message$ = null;
    $str0$localhost = makeString( "localhost" );
    $int1$19219 = makeInteger( 19219 );
    $kw2$OK = makeKeyword( "OK" );
    $kw3$NOT_AN_SQS_RESPONSE = makeKeyword( "NOT-AN-SQS-RESPONSE" );
    $kw4$WARN_ON_ERROR = makeKeyword( "WARN-ON-ERROR" );
    $str5$Received_error__A___A____ = makeString( "Received error ~A (~A).~%" );
    $kw6$ERROR_ON_ERROR = makeKeyword( "ERROR-ON-ERROR" );
    $list7 = ConsesLow.list( makeSymbol( "PREAMBLE" ), makeSymbol( "POSTAMBLE" ) );
    $str8$ = makeString( "" );
    $kw9$MESSAGE = makeKeyword( "MESSAGE" );
    $sym10$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw11$PUBLIC = makeKeyword( "PUBLIC" );
    $sym12$STRINGP = makeSymbol( "STRINGP" );
    $str13$Only_support_STRINGP_or_LIST_OF_T = makeString( "Only support STRINGP or LIST-OF-TYPE-P 'STRINGP." );
    $kw14$EOF = makeKeyword( "EOF" );
    $str15$Empty_result_____suspicious_ = makeString( "Empty result ... suspicious." );
    $kw16$ERROR = makeKeyword( "ERROR" );
    $str17$Bogus_result_returned_by_server_ = makeString( "Bogus result returned by server." );
    $str18$format = makeString( "format" );
    $str19$subl = makeString( "subl" );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "STREAM" ), makeSymbol( "STRING" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym21$CWITH_OUTPUT_TO_STRING = makeSymbol( "CWITH-OUTPUT-TO-STRING" );
    $sym22$CLET = makeSymbol( "CLET" );
    $sym23$_XML_STREAM_ = makeSymbol( "*XML-STREAM*" );
    $sym24$XML_TAG = makeSymbol( "XML-TAG" );
    $list25 = ConsesLow.list( makeString( "request" ), makeSymbol( "*DEFAULT-SQS-REQUEST-ATTRIBUTE-LIST*" ) );
    $str26$request = makeString( "request" );
    $kw27$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str28$version = makeString( "version" );
    $str29$createq = makeString( "createq" );
    $str30$deleteq = makeString( "deleteq" );
    $str31$enqueue = makeString( "enqueue" );
    $sym32$GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS = makeSymbol( "GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS" );
    $sym33$_GET_EMPTY_SQS_ENQUEUE_COMMAND_FRAGMENTS_CACHING_STATE_ = makeSymbol( "*GET-EMPTY-SQS-ENQUEUE-COMMAND-FRAGMENTS-CACHING-STATE*" );
    $str34$dequeue = makeString( "dequeue" );
    $str35$pending = makeString( "pending" );
    $str36$listqs = makeString( "listqs" );
    $str37$putfile = makeString( "putfile" );
    $str38$data = makeString( "data" );
    $str39$getfile = makeString( "getfile" );
    $str40$name = makeString( "name" );
    $str41$maxTries = makeString( "maxTries" );
    $str42$maxWaitSecs = makeString( "maxWaitSecs" );
    $str43$bucket = makeString( "bucket" );
    $str44$key = makeString( "key" );
    $sym45$SQS_ITERATOR_DONE_ = makeSymbol( "SQS-ITERATOR-DONE?" );
    $sym46$SQS_ITERATOR_NEXT = makeSymbol( "SQS-ITERATOR-NEXT" );
    $list47 = ConsesLow.list( makeSymbol( "QUEUE-NAME" ), makeSymbol( "RETRIES" ), makeSymbol( "WAIT-SECS" ), makeSymbol( "DONE?" ) );
    $sym48$SQS_ACCUMULATOR_RESET = makeSymbol( "SQS-ACCUMULATOR-RESET" );
    $sym49$SQS_ACCUMULATOR_ADD = makeSymbol( "SQS-ACCUMULATOR-ADD" );
    $sym50$SQS_ACCUMULATOR_SIZE = makeSymbol( "SQS-ACCUMULATOR-SIZE" );
    $sym51$SQS_ACCUMULATOR_CONTENTS = makeSymbol( "SQS-ACCUMULATOR-CONTENTS" );
    $sym52$SQS_ACCUMULATOR_IT = makeSymbol( "SQS-ACCUMULATOR-IT" );
    $list53 = ConsesLow.list( makeSymbol( "QUEUE-NAME" ), makeSymbol( "RETRIES" ), makeSymbol( "WAIT-SECS" ), makeSymbol( "POSTS" ) );
    $str54$Could_not_post__A_to__A_ = makeString( "Could not post ~A to ~A." );
    $sym55$ACCUMULATOR_P = makeSymbol( "ACCUMULATOR-P" );
    $kw56$SENTENCE = makeKeyword( "SENTENCE" );
    $kw57$ELMT = makeKeyword( "ELMT" );
    $kw58$PROPERTIES = makeKeyword( "PROPERTIES" );
    $list59 = ConsesLow.list( ConsesLow.list( makeSymbol( "SENTENCE" ), makeSymbol( "ELMT" ), makeSymbol( "PROPERTIES" ), makeSymbol( "ASS-DESC" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol(
        "DEFAULT-PROPERTIES" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym60$GETF = makeSymbol( "GETF" );
    $list61 = ConsesLow.list( makeKeyword( "SENTENCE" ) );
    $list62 = ConsesLow.list( makeKeyword( "ELMT" ) );
    $kw63$EXHAUSTED = makeKeyword( "EXHAUSTED" );
    $sym64$COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol( "COMPACT-HL-EXTERNAL-ID-STRING" );
    $sym65$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol( "FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING" );
    $int66$8192 = makeInteger( 8192 );
    $int67$256 = makeInteger( 256 );
    $sym68$SGMT_ACCUMULATOR_RESET = makeSymbol( "SGMT-ACCUMULATOR-RESET" );
    $sym69$SGMT_ACCUMULATOR_ADD = makeSymbol( "SGMT-ACCUMULATOR-ADD" );
    $sym70$SGMT_ACCUMULATOR_SIZE = makeSymbol( "SGMT-ACCUMULATOR-SIZE" );
    $sym71$SGMT_ACCUMULATOR_CONTENTS = makeSymbol( "SGMT-ACCUMULATOR-CONTENTS" );
    $sym72$SGMT_ACCUMULATOR_IT = makeSymbol( "SGMT-ACCUMULATOR-IT" );
    $list73 = ConsesLow.list( makeSymbol( "ACC" ), makeSymbol( "STREAM" ), makeSymbol( "TOTAL" ), makeSymbol( "MAX-BYTES" ), makeSymbol( "CFASL-EXTERNALIZED?" ) );
    $str74$Object__A_encodes_as__A_bytes__mo = makeString( "Object ~A encodes as ~A bytes, more than the maximum number of bytes ~A.~%" );
    $str75$Implementation_error__serializing = makeString( "Implementation error: serializing ~A encodes as ~A bytes, less than the maximum number of bytes ~A, and STILL causes buffer overflow.~%" );
    $sym76$ITERATOR_P = makeSymbol( "ITERATOR-P" );
    $sym77$SQS_SGMNT_IT_DONE = makeSymbol( "SQS-SGMNT-IT-DONE" );
    $sym78$SQS_SGMNT_IT_NEXT = makeSymbol( "SQS-SGMNT-IT-NEXT" );
    $list79 = ConsesLow.list( makeSymbol( "SQS-IT" ), makeSymbol( "SGMT-IT" ) );
    $int80$30 = makeInteger( 30 );
    $str81$___A__A___A_msgs__ = makeString( "~&~A ~A: ~A msgs~%" );
    $kw82$ALL_EMPTY = makeKeyword( "ALL-EMPTY" );
    $str83$___A__Cleaning_up_ca__A_msgs_from = makeString( "~&~A: Cleaning up ca ~A msgs from ~A ....~%" );
    $str84$___A__Removed__A_msgs_from__A___ = makeString( "~&~A: Removed ~A msgs from ~A.~%" );
    $list85 = ConsesLow.list( makeSymbol( "PLACE" ), makeSymbol( "VALUE" ) );
    $sym86$PROGN = makeSymbol( "PROGN" );
    $sym87$MUST = makeSymbol( "MUST" );
    $sym88$IS_KNOWN_SQS_QUEUE_ = makeSymbol( "IS-KNOWN-SQS-QUEUE?" );
    $str89$_A_is_not_a_known_SQS_queue______ = makeString( "~A is not a known SQS queue ....~%" );
    $sym90$CSETQ = makeSymbol( "CSETQ" );
  }
}
/*
 * 
 * Total time: 847 ms
 * 
 */