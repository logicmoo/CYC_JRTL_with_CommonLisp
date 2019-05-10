package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class transcript_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.transcript_utilities";
  public static final String myFingerPrint = "35f31b6a3e07137e245eb21a4ad8e9d866ea4586e0791726049a305de0249c28";
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 2723L)
  public static SubLSymbol $transcript_suffix$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 2830L)
  public static SubLSymbol $master_transcript_already_exists$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 3298L)
  public static SubLSymbol $local_transcript_version$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 3540L)
  public static SubLSymbol $local_transcript_history$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 3835L)
  public static SubLSymbol $local_hl_transcript_version$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 4095L)
  public static SubLSymbol $local_hl_transcript_history$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 4408L)
  public static SubLSymbol $read_transcript_position$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 4807L)
  public static SubLSymbol $approx_chars_per_op$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 5038L)
  public static SubLSymbol $local_transcript$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 7498L)
  public static SubLSymbol $read_transcript$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 7804L)
  public static SubLSymbol $master_transcript$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 8529L)
  public static SubLSymbol $local_hl_transcript$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 13584L)
  public static SubLSymbol $count_ops_table$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 25625L)
  private static SubLSymbol $transcript_rename_hash$;
  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 26337L)
  private static SubLSymbol $transcript_create_hash$;
  private static final SubLSymbol $sym0$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str1$ts;
  private static final SubLSymbol $sym2$_LOCAL_TRANSCRIPT_VERSION_;
  private static final SubLSymbol $sym3$_LOCAL_TRANSCRIPT_HISTORY_;
  private static final SubLSymbol $sym4$_LOCAL_HL_TRANSCRIPT_VERSION_;
  private static final SubLSymbol $sym5$_LOCAL_HL_TRANSCRIPT_HISTORY_;
  private static final SubLSymbol $sym6$_READ_TRANSCRIPT_POSITION_;
  private static final SubLInteger $int7$206;
  private static final SubLSymbol $sym8$_LOCAL_TRANSCRIPT_;
  private static final SubLString $str9$ROLLED;
  private static final SubLSymbol $kw10$APPEND;
  private static final SubLSymbol $kw11$OUTPUT;
  private static final SubLString $str12$Unable_to_open__S;
  private static final SubLString $str13$_s__;
  private static final SubLSymbol $sym14$_READ_TRANSCRIPT_;
  private static final SubLSymbol $sym15$_MASTER_TRANSCRIPT_;
  private static final SubLSymbol $sym16$_LOCAL_HL_TRANSCRIPT_;
  private static final SubLString $str17$cyc_kb__a;
  private static final SubLString $str18$_a_local__a;
  private static final SubLString $str19$_a_local_hl__a;
  private static final SubLString $str20$_;
  private static final SubLString $str21$transcripts;
  private static final SubLSymbol $sym22$STRINGP;
  private static final SubLString $str23$_TS;
  private static final SubLString $str24$_;
  private static final SubLString $str25$_ts;
  private static final SubLSymbol $sym26$_COUNT_OPS_TABLE_;
  private static final SubLSymbol $sym27$CAR;
  private static final SubLSymbol $kw28$INPUT;
  private static final SubLSymbol $kw29$EOF;
  private static final SubLInteger $int30$100000;
  private static final SubLString $str31$_____s;
  private static final SubLString $str32$_s_is_not_a_stream_or_pathname_st;
  private static final SubLString $str33$__The_file__s_does_not_exist__or_;
  private static final SubLString $str34$Examining__A;
  private static final SubLList $list35;
  private static final SubLSymbol $sym36$FI_CREATE;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$FI_RENAME;
  private static final SubLList $list39;
  private static final SubLSymbol $sym40$FI_KILL;
  private static final SubLList $list41;
  private static final SubLString $str42$____Transcript____S;
  private static final SubLString $str43$______Examined______A;
  private static final SubLString $str44$______Total_Ops_____S;
  private static final SubLString $str45$______error_during_transcript_ana;
  private static final SubLString $str46$___A;
  private static final SubLList $list47;
  private static final SubLString $str48$_______S_KILLED;
  private static final SubLList $list49;
  private static final SubLString $str50$__EXTERNAL_ID__S____A_by__A_at__A;
  private static final SubLString $str51$_______S_RENAMED;
  private static final SubLList $list52;
  private static final SubLString $str53$__EXTERNAL_ID__S____A_to__A_by__A;
  private static final SubLString $str54$_______S_CREATED;
  private static final SubLSymbol $sym55$_TRANSCRIPT_RENAME_HASH_;
  private static final SubLInteger $int56$100;
  private static final SubLSymbol $sym57$_;
  private static final SubLSymbol $sym58$FIRST;
  private static final SubLSymbol $sym59$_TRANSCRIPT_CREATE_HASH_;
  private static final SubLString $str60$transcript_file_not_found;
  private static final SubLString $str61$_A__;
  private static final SubLSymbol $sym62$WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT;
  private static final SubLList $list63;
  private static final SubLString $str64$Generate_a_KE_Text_file_from_a_tr;
  private static final SubLList $list65;
  private static final SubLSymbol $kw66$ENTER;
  private static final SubLSymbol $sym67$FI_EDIT;
  private static final SubLList $list68;
  private static final SubLSymbol $kw69$DEFAULT;
  private static final SubLSymbol $sym70$FI_UNASSERT;
  private static final SubLSymbol $sym71$FI_ASSERT;
  private static final SubLSymbol $sym72$FI_FIND_OR_CREATE;
  private static final SubLString $str73$;
  private static final SubLString $str74$Constant__;
  private static final SubLList $list75;
  private static final SubLString $str76$Rename__;
  private static final SubLString $str77$_;
  private static final SubLSymbol $sym78$FI_MERGE;
  private static final SubLList $list79;
  private static final SubLString $str80$Merge__;
  private static final SubLString $str81$Kill__;
  private static final SubLSymbol $sym82$FI_REASSERT;
  private static final SubLSymbol $sym83$FI_BLAST;
  private static final SubLString $str84$Enter_;
  private static final SubLString $str85$___The_following_assertion_simula;
  private static final SubLSymbol $kw86$DELETE;
  private static final SubLString $str87$Delete_;
  private static final SubLSymbol $kw88$BLAST;
  private static final SubLString $str89$Delete_____Simulate_an_fi_blast_;
  private static final SubLSymbol $kw90$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym91$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str92$In_Mt__;
  private static final SubLSymbol $kw93$UNKNOWN;
  private static final SubLString $str94$Truth_Value___unknown_;
  private static final SubLObject $const95$DefaultMonotonicPredicate;
  private static final SubLString $str96$Truth_Value___default_;
  private static final SubLSymbol $kw97$MONOTONIC;
  private static final SubLString $str98$Truth_Value___monotonic_;
  private static final SubLSymbol $kw99$FORWARD;
  private static final SubLString $str100$Direction___forward_;
  private static final SubLSymbol $kw101$BACKWARD;
  private static final SubLString $str102$Direction___backward_;
  private static final SubLSymbol $kw103$CODE;
  private static final SubLString $str104$Direction___code_;
  private static final SubLString $str105$_A___A_;
  private static final SubLString $str106$f___A_;
  private static final SubLSymbol $sym107$FI_TIMESTAMP_ASSERTION;
  private static final SubLSymbol $sym108$FI_TIMESTAMP_CONSTANT;
  private static final SubLSymbol $sym109$FI_CREATE_SKOLEM;
  private static final SubLString $str110$___This_skolem_creation_should_be;
  private static final SubLString $str111$____S;
  private static final SubLString $str112$___Don_t_know_how_convert_next_li;
  private static final SubLString $str113$Internal_Error____A__for_operatio;
  private static final SubLString $str114$_;
  private static final SubLString $str115$_;
  private static final SubLSymbol $kw116$HP;
  private static final SubLSymbol $kw117$NAT;
  private static final SubLString $str118$TLReifiedNatFn;
  private static final SubLString $str119$TLAssertionFn;
  private static final SubLObject $const120$ist;
  private static final SubLString $str121$TLVariableFn;
  private static final SubLString $str122$_VAR;
  private static final SubLString $str123$_;
  private static final SubLString $str124$___;
  private static final SubLString $str125$_;
  private static final SubLSymbol $sym126$CCONCATENATE;
  private static final SubLString $str127$_;
  private static final SubLString $str128$__;
  private static final SubLString $str129$___;

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 413L)
  public static SubLObject transcript_eval(final SubLObject form, SubLObject bookkeeping_info)
  {
    if( bookkeeping_info == UNPROVIDED )
    {
      bookkeeping_info = NIL;
    }
    return transcript_form_int( form, T, bookkeeping_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 917L)
  public static SubLObject transcript_form(final SubLObject form, SubLObject bookkeeping_info)
  {
    if( bookkeeping_info == UNPROVIDED )
    {
      bookkeeping_info = NIL;
    }
    return transcript_form_int( form, NIL, bookkeeping_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 1419L)
  public static SubLObject transcript_form_int(SubLObject form, final SubLObject evalP, final SubLObject bookkeeping_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject transcriptP = T;
    SubLObject error_message = NIL;
    SubLObject result = NIL;
    form = precanonicalizer.immediate_precanonicalizations( form );
    final SubLObject _prev_bind_0 = cyc_bookkeeping.$cyc_bookkeeping_info$.currentBinding( thread );
    try
    {
      cyc_bookkeeping.$cyc_bookkeeping_info$.bind( ( NIL != bookkeeping_info ) ? bookkeeping_info : cyc_bookkeeping.cyc_bookkeeping_info(), thread );
      if( NIL != evalP )
      {
        try
        {
          thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
          final SubLObject _prev_bind_0_$1 = Errors.$error_handler$.currentBinding( thread );
          try
          {
            Errors.$error_handler$.bind( $sym0$CATCH_ERROR_MESSAGE_HANDLER, thread );
            try
            {
              transcriptP = NIL;
              result = eval_in_api.cyc_api_eval( form );
              transcriptP = T;
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
      }
      if( NIL != transcriptP && NIL == error_message )
      {
        final SubLObject transcript_form = form_to_transcript_form( form );
        operation_queues.add_to_transcript_queue( transcript_form );
      }
    }
    finally
    {
      cyc_bookkeeping.$cyc_bookkeeping_info$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 2119L)
  public static SubLObject form_to_transcript_form(final SubLObject form)
  {
    return operation_queues.form_to_api_op( form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 2198L)
  public static SubLObject initialize_transcript_handling()
  {
    set_master_transcript_already_exists( NIL );
    new_local_transcript();
    set_master_transcript( UNPROVIDED );
    set_read_transcript( master_transcript() );
    if( NIL != transcript_server.use_transcript_server() )
    {
      control_vars.$auto_increment_kb$.setGlobalValue( T );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 2764L)
  public static SubLObject transcript_suffix()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $transcript_suffix$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 2991L)
  public static SubLObject master_transcript_already_exists()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $master_transcript_already_exists$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 3140L)
  public static SubLObject set_master_transcript_already_exists(final SubLObject number)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $master_transcript_already_exists$.setDynamicValue( number, thread );
    return $master_transcript_already_exists$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 3340L)
  public static SubLObject local_transcript_version()
  {
    return $local_transcript_version$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 3420L)
  public static SubLObject inc_local_transcript_version()
  {
    $local_transcript_version$.setGlobalValue( Numbers.add( $local_transcript_version$.getGlobalValue(), ONE_INTEGER ) );
    return $local_transcript_version$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 3584L)
  public static SubLObject local_transcript_history()
  {
    return $local_transcript_history$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 3664L)
  public static SubLObject local_transcript_history_add(final SubLObject transcript)
  {
    $local_transcript_history$.setGlobalValue( ConsesLow.cons( transcript, $local_transcript_history$.getGlobalValue() ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 3880L)
  public static SubLObject local_hl_transcript_version()
  {
    return $local_hl_transcript_version$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 3966L)
  public static SubLObject inc_local_hl_transcript_version()
  {
    $local_hl_transcript_version$.setGlobalValue( Numbers.add( $local_hl_transcript_version$.getGlobalValue(), ONE_INTEGER ) );
    return $local_hl_transcript_version$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 4142L)
  public static SubLObject local_hl_transcript_history()
  {
    return $local_hl_transcript_history$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 4228L)
  public static SubLObject local_hl_transcript_history_add(final SubLObject transcript)
  {
    $local_hl_transcript_history$.setGlobalValue( ConsesLow.cons( transcript, $local_hl_transcript_history$.getGlobalValue() ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 4593L)
  public static SubLObject read_transcript_position()
  {
    return $read_transcript_position$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 4673L)
  public static SubLObject set_read_transcript_position(final SubLObject number)
  {
    $read_transcript_position$.setGlobalValue( number );
    return $read_transcript_position$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 4849L)
  public static SubLObject approx_chars_per_op()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $approx_chars_per_op$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 4919L)
  public static SubLObject set_approx_chars_per_op(final SubLObject number)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $approx_chars_per_op$.setDynamicValue( number, thread );
    return $approx_chars_per_op$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 5312L)
  public static SubLObject local_transcript()
  {
    return $local_transcript$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 5413L)
  public static SubLObject mark_local_transcript(final SubLObject mark)
  {
    final SubLObject oldname = $local_transcript$.getGlobalValue();
    if( NIL != oldname )
    {
      final SubLObject newname = mark_transcript_filename( oldname, mark );
      if( NIL != Filesys.probe_file( oldname ) )
      {
        Filesys.rename_file( oldname, newname );
      }
      $local_transcript$.setGlobalValue( newname );
      return newname;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 5831L)
  public static SubLObject roll_local_transcript()
  {
    mark_local_transcript( $str9$ROLLED );
    $local_transcript$.setGlobalValue( NIL );
    new_local_transcript_int();
    if( NIL == operation_queues.local_operation_storage_queue_empty() )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( local_transcript(), ( NIL != Filesys.probe_file( local_transcript() ) ) ? $kw10$APPEND : $kw11$OUTPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str12$Unable_to_open__S, local_transcript() );
        }
        final SubLObject stream_$2 = stream;
        SubLObject cdolist_list_var = operation_queues.local_operation_storage_queue_contents();
        SubLObject op = NIL;
        op = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          PrintLow.format( stream_$2, $str13$_s__, op );
          cdolist_list_var = cdolist_list_var.rest();
          op = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 6884L)
  public static SubLObject new_local_transcript()
  {
    operation_queues.clear_local_operation_storage_queue();
    return new_local_transcript_int();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 7082L)
  public static SubLObject new_local_transcript_int()
  {
    if( NIL != $local_transcript$.getGlobalValue() && NIL != Filesys.probe_file( $local_transcript$.getGlobalValue() ) )
    {
      local_transcript_history_add( $local_transcript$.getGlobalValue() );
      inc_local_transcript_version();
    }
    $local_transcript$.setGlobalValue( construct_transcript_filename( make_local_transcript_filename( local_transcript_version() ) ) );
    return $local_transcript$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 7594L)
  public static SubLObject read_transcript()
  {
    return $read_transcript$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 7692L)
  public static SubLObject set_read_transcript(final SubLObject filename)
  {
    $read_transcript$.setGlobalValue( filename );
    return $read_transcript$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 7930L)
  public static SubLObject master_transcript()
  {
    return $master_transcript$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 8032L)
  public static SubLObject set_master_transcript(SubLObject name)
  {
    if( name == UNPROVIDED )
    {
      name = make_master_transcript_filename( UNPROVIDED );
    }
    if( NIL == transcript_server.use_transcript_server() )
    {
      $master_transcript$.setGlobalValue( construct_transcript_filename( name ) );
    }
    return $master_transcript$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 8257L)
  public static SubLObject get_all_transcripts_image()
  {
    if( NIL != Filesys.probe_file( local_transcript() ) )
    {
      return ConsesLow.cons( local_transcript(), local_transcript_history() );
    }
    return local_transcript_history();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 8812L)
  public static SubLObject local_hl_transcript()
  {
    return $local_hl_transcript$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 8922L)
  public static SubLObject mark_local_hl_transcript(final SubLObject mark)
  {
    final SubLObject oldname = $local_hl_transcript$.getGlobalValue();
    if( NIL != oldname )
    {
      final SubLObject newname = mark_transcript_filename( oldname, mark );
      if( NIL != Filesys.probe_file( oldname ) )
      {
        Filesys.rename_file( oldname, newname );
      }
      $local_hl_transcript$.setGlobalValue( newname );
      return newname;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 9352L)
  public static SubLObject roll_local_hl_transcript()
  {
    mark_local_hl_transcript( $str9$ROLLED );
    $local_hl_transcript$.setGlobalValue( NIL );
    new_local_hl_transcript_int();
    if( NIL == operation_queues.local_operation_storage_queue_empty() )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( local_hl_transcript(), ( NIL != Filesys.probe_file( local_hl_transcript() ) ) ? $kw10$APPEND : $kw11$OUTPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str12$Unable_to_open__S, local_hl_transcript() );
        }
        final SubLObject stream_$3 = stream;
        SubLObject cdolist_list_var = operation_queues.local_operation_storage_queue_contents();
        SubLObject op = NIL;
        op = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          PrintLow.format( stream_$3, $str13$_s__, op );
          cdolist_list_var = cdolist_list_var.rest();
          op = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 10450L)
  public static SubLObject new_local_hl_transcript()
  {
    operation_queues.clear_local_operation_storage_queue();
    return new_local_hl_transcript_int();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 10657L)
  public static SubLObject new_local_hl_transcript_int()
  {
    if( NIL != $local_hl_transcript$.getGlobalValue() && NIL != Filesys.probe_file( $local_hl_transcript$.getGlobalValue() ) )
    {
      local_hl_transcript_history_add( $local_hl_transcript$.getGlobalValue() );
      inc_local_hl_transcript_version();
    }
    $local_hl_transcript$.setGlobalValue( construct_transcript_filename( make_local_hl_transcript_filename( local_hl_transcript_version() ) ) );
    return $local_hl_transcript$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 11106L)
  public static SubLObject make_master_transcript_filename(SubLObject version)
  {
    if( version == UNPROVIDED )
    {
      version = control_vars.kb_loaded();
    }
    final SubLObject filename = PrintLow.format( NIL, $str17$cyc_kb__a, version );
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 11417L)
  public static SubLObject make_local_transcript_filename(final SubLObject version_number)
  {
    if( NIL == control_vars.cyc_image_id() )
    {
      control_vars.set_cyc_image_id();
    }
    final SubLObject filename = PrintLow.format( NIL, $str18$_a_local__a, control_vars.cyc_image_id(), version_number );
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 11729L)
  public static SubLObject make_local_hl_transcript_filename(final SubLObject version_number)
  {
    if( NIL == control_vars.cyc_image_id() )
    {
      control_vars.set_cyc_image_id();
    }
    final SubLObject filename = PrintLow.format( NIL, $str19$_a_local_hl__a, control_vars.cyc_image_id(), version_number );
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 12051L)
  public static SubLObject construct_transcript_filename(final SubLObject name)
  {
    final SubLObject filename = Sequences.cconcatenate( transcript_directory(), new SubLObject[] { name, $str20$_, transcript_suffix()
    } );
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 12275L)
  public static SubLObject transcript_directory()
  {
    return transcript_directory_int( control_vars.kb_loaded() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 12458L)
  public static SubLObject next_transcript_directory()
  {
    return transcript_directory_int( Numbers.add( ONE_INTEGER, control_vars.kb_loaded() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 12649L)
  public static SubLObject transcript_directory_int(final SubLObject kb_number)
  {
    final SubLObject directory = file_utilities.cyc_home_subdirectory( ConsesLow.list( $str21$transcripts, operation_communication.kb_number_string( kb_number ) ) );
    if( NIL == Filesys.directory_p( directory ) )
    {
      file_utilities.make_directory_recursive( directory, T, UNPROVIDED );
    }
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 13047L)
  public static SubLObject mark_transcript_filename(final SubLObject transcript, final SubLObject mark)
  {
    assert NIL != Types.stringp( transcript ) : transcript;
    assert NIL != Types.stringp( mark ) : mark;
    if( NIL != string_utilities.substringP( $str23$_TS, transcript, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED ) )
    {
      return string_utilities.replace_substring( transcript, $str23$_TS, Sequences.cconcatenate( $str24$_, new SubLObject[] { Strings.string_upcase( mark, UNPROVIDED, UNPROVIDED ), $str23$_TS
      } ) );
    }
    return string_utilities.replace_substring( transcript, $str25$_ts, Sequences.cconcatenate( $str24$_, new SubLObject[] { Strings.string_downcase( mark, UNPROVIDED, UNPROVIDED ), $str25$_ts
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 13767L)
  public static SubLObject get_count_ops_data(final SubLObject pathname)
  {
    final SubLObject data = conses_high.assoc( pathname, $count_ops_table$.getGlobalValue(), Symbols.symbol_function( EQUALP ), UNPROVIDED );
    if( NIL != data )
    {
      return data;
    }
    return ConsesLow.list( pathname, ZERO_INTEGER, ZERO_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 13933L)
  public static SubLObject get_current_op_count(final SubLObject pathname)
  {
    return conses_high.second( get_count_ops_data( pathname ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 14030L)
  public static SubLObject get_current_position(final SubLObject pathname)
  {
    return conses_high.third( get_count_ops_data( pathname ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 14126L)
  public static SubLObject update_count_ops_data(final SubLObject pathname, final SubLObject new_op_count, final SubLObject new_position)
  {
    SubLObject new_table = Sequences.remove( pathname, $count_ops_table$.getGlobalValue(), Symbols.symbol_function( EQUALP ), Symbols.symbol_function( $sym27$CAR ), UNPROVIDED, UNPROVIDED, UNPROVIDED );
    new_table = ConsesLow.cons( ConsesLow.list( pathname, new_op_count, new_position ), new_table );
    $count_ops_table$.setGlobalValue( new_table );
    return $count_ops_table$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 14409L)
  public static SubLObject really_count_ops(final SubLObject pathname)
  {
    SubLObject count = ZERO_INTEGER;
    if( pathname.isString() && NIL != Filesys.probe_file( pathname ) )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( pathname, $kw28$INPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str12$Unable_to_open__S, pathname );
        }
        SubLObject str;
        SubLObject expr;
        for( str = stream, expr = NIL, expr = reader.read_ignoring_errors( str, NIL, NIL ); NIL != expr; expr = reader.read_ignoring_errors( str, NIL, NIL ) )
        {
          if( NIL != expr )
          {
            count = Numbers.add( count, ONE_INTEGER );
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
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 14763L)
  public static SubLObject count_operations(final SubLObject pathname)
  {
    SubLObject op_count = get_current_op_count( pathname );
    SubLObject position = get_current_position( pathname );
    SubLObject lpc = ZERO_INTEGER;
    SubLObject rpc = ZERO_INTEGER;
    SubLObject inside_dqP = NIL;
    SubLObject preceding = NIL;
    if( pathname.isString() && NIL != Filesys.probe_file( pathname ) )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( pathname, $kw28$INPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str12$Unable_to_open__S, pathname );
        }
        final SubLObject str = stream;
        final SubLObject len = streams_high.file_length( str );
        compatibility.set_file_position( str, position );
        SubLObject ch;
        for( ch = NIL, ch = streams_high.read_char( str, NIL, $kw29$EOF, UNPROVIDED ); ch != $kw29$EOF; ch = streams_high.read_char( str, NIL, $kw29$EOF, UNPROVIDED ) )
        {
          if( NIL != Characters.charE( Characters.CHAR_quotation, ch ) && !preceding.eql( Characters.CHAR_backslash ) )
          {
            inside_dqP = makeBoolean( NIL == inside_dqP );
          }
          if( NIL == inside_dqP )
          {
            if( NIL != Characters.charE( Characters.CHAR_lparen, ch ) )
            {
              lpc = Numbers.add( lpc, ONE_INTEGER );
            }
            if( NIL != Characters.charE( Characters.CHAR_rparen, ch ) )
            {
              rpc = Numbers.add( rpc, ONE_INTEGER );
              if( rpc.numG( ZERO_INTEGER ) && rpc.numE( lpc ) )
              {
                op_count = Numbers.add( op_count, ONE_INTEGER );
              }
            }
          }
          preceding = ch;
        }
        position = compatibility.get_file_position( str );
        if( len.numG( $int30$100000 ) && pathname.equalp( master_transcript() ) )
        {
          set_approx_chars_per_op( Numbers.integerDivide( len, op_count ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
        try
        {
          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
    }
    update_count_ops_data( pathname, op_count, position );
    return op_count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 15761L)
  public static SubLObject estimate_number_of_ops(final SubLObject filename)
  {
    final SubLObject len = file_utilities.get_file_length( filename );
    return Numbers.integerDivide( len, approx_chars_per_op() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 15900L)
  public static SubLObject collect_ops_in_range(final SubLObject transcript_pathname, final SubLObject start_pos, SubLObject end_pos, SubLObject file_or_stream)
  {
    if( end_pos == UNPROVIDED )
    {
      end_pos = NIL;
    }
    if( file_or_stream == UNPROVIDED )
    {
      file_or_stream = T;
    }
    SubLObject actual_count = ZERO_INTEGER;
    SubLObject ops = NIL;
    if( transcript_pathname.isString() && NIL != Filesys.probe_file( transcript_pathname ) )
    {
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( transcript_pathname, $kw28$INPUT );
        if( !stream.isStream() )
        {
          Errors.error( $str12$Unable_to_open__S, transcript_pathname );
        }
        SubLObject str;
        SubLObject expr;
        for( str = stream, expr = NIL, expr = reader.read_ignoring_errors( str, NIL, $kw29$EOF ); expr != $kw29$EOF && ( !end_pos.isInteger() || !actual_count.numGE( end_pos ) ); expr = reader.read_ignoring_errors( str,
            NIL, $kw29$EOF ) )
        {
          if( NIL != expr )
          {
            actual_count = Numbers.add( actual_count, ONE_INTEGER );
          }
          if( actual_count.numGE( start_pos ) && ( NIL == end_pos || actual_count.numLE( end_pos ) ) )
          {
            ops = ConsesLow.cons( expr, ops );
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
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
        }
      }
      ops = Sequences.nreverse( ops );
      if( file_or_stream.isString() )
      {
        SubLObject stream_$4 = NIL;
        try
        {
          stream_$4 = compatibility.open_text( file_or_stream, $kw11$OUTPUT );
          if( !stream_$4.isStream() )
          {
            Errors.error( $str12$Unable_to_open__S, file_or_stream );
          }
          final SubLObject outstr = stream_$4;
          SubLObject cdolist_list_var = ops;
          SubLObject op = NIL;
          op = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            PrintLow.format( outstr, $str31$_____s, op );
            cdolist_list_var = cdolist_list_var.rest();
            op = cdolist_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
          try
          {
            Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
            final SubLObject _values2 = Values.getValuesAsVector();
            if( stream_$4.isStream() )
            {
              streams_high.close( stream_$4, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
          }
        }
      }
      else if( file_or_stream.isStream() || file_or_stream == T )
      {
        SubLObject cdolist_list_var2 = ops;
        SubLObject op2 = NIL;
        op2 = cdolist_list_var2.first();
        while ( NIL != cdolist_list_var2)
        {
          PrintLow.format( file_or_stream, $str31$_____s, op2 );
          cdolist_list_var2 = cdolist_list_var2.rest();
          op2 = cdolist_list_var2.first();
        }
      }
      else
      {
        Errors.error( $str32$_s_is_not_a_stream_or_pathname_st, file_or_stream );
      }
      return Sequences.length( ops );
    }
    PrintLow.format( T, $str33$__The_file__s_does_not_exist__or_, transcript_pathname );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 17161L)
  public static SubLObject total_master_transcript_operations(SubLObject kb)
  {
    if( kb == UNPROVIDED )
    {
      kb = control_vars.kb_loaded();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != transcript_server.use_transcript_server() )
    {
      return transcript_server.transcript_server_kb_ops_count( kb );
    }
    if( !master_transcript().isString() )
    {
      return ZERO_INTEGER;
    }
    if( NIL != system_parameters.$really_count_transcript_ops$.getDynamicValue( thread ) )
    {
      return count_operations( master_transcript() );
    }
    return estimate_number_of_ops( master_transcript() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 17668L)
  public static SubLObject constant_modifications_in_transcript(final SubLObject transcript_filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( transcript_filename ) : transcript_filename;
    reset_transcript_rename_hash();
    reset_transcript_create_hash();
    final SubLObject total_file_size = file_utilities.get_file_length( transcript_filename );
    SubLObject transcript_create_list = NIL;
    SubLObject transcript_rename_list = NIL;
    SubLObject transcript_kill_list = NIL;
    SubLObject op_count = ZERO_INTEGER;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym0$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          if( NIL != Filesys.probe_file( transcript_filename ) )
          {
            SubLObject stream = NIL;
            try
            {
              stream = compatibility.open_text( transcript_filename, $kw28$INPUT );
              if( !stream.isStream() )
              {
                Errors.error( $str12$Unable_to_open__S, transcript_filename );
              }
              final SubLObject transcript_stream = stream;
              final SubLObject _prev_bind_0_$5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
              final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
              final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
              final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
              try
              {
                utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                try
                {
                  utilities_macros.noting_percent_progress_preamble( PrintLow.format( NIL, $str34$Examining__A, transcript_filename ) );
                  SubLObject operation;
                  SubLObject current;
                  SubLObject datum;
                  SubLObject encapsulated_cyclist;
                  SubLObject cyc_image_id;
                  SubLObject when;
                  SubLObject temp;
                  SubLObject function;
                  SubLObject args;
                  SubLObject who;
                  SubLObject pcase_var;
                  SubLObject current_$7;
                  SubLObject datum_$6;
                  SubLObject name;
                  SubLObject external_id;
                  SubLObject current_$8;
                  SubLObject datum_$7;
                  SubLObject v_term;
                  SubLObject new_name;
                  SubLObject old_name;
                  SubLObject external_id2;
                  SubLObject current_$9;
                  SubLObject datum_$8;
                  SubLObject name2;
                  SubLObject external_id3;
                  for( operation = NIL, operation = operation_communication.read_one_transcript_operation( transcript_stream ); NIL != operation; operation = operation_communication.read_one_transcript_operation(
                      transcript_stream ) )
                  {
                    op_count = Numbers.add( op_count, ONE_INTEGER );
                    utilities_macros.note_percent_progress( compatibility.get_file_position( transcript_stream ), total_file_size );
                    datum = ( current = operation );
                    encapsulated_cyclist = NIL;
                    cyc_image_id = NIL;
                    when = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    encapsulated_cyclist = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    cyc_image_id = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    when = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    temp = current.rest();
                    current = current.first();
                    function = NIL;
                    args = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
                    function = current.first();
                    current = ( args = current.rest() );
                    current = temp;
                    if( NIL == current )
                    {
                      who = encapsulated_cyclist_string( encapsulated_cyclist );
                      pcase_var = function;
                      if( pcase_var.eql( $sym36$FI_CREATE ) )
                      {
                        datum_$6 = ( current_$7 = args );
                        name = NIL;
                        external_id = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp( current_$7, datum_$6, $list37 );
                        name = current_$7.first();
                        current_$7 = current_$7.rest();
                        cdestructuring_bind.destructuring_bind_must_consp( current_$7, datum_$6, $list37 );
                        external_id = current_$7.first();
                        current_$7 = current_$7.rest();
                        if( NIL == current_$7 )
                        {
                          name = list_utilities.unquotify( name );
                          external_id = list_utilities.unquotify( external_id );
                          if( name.isString() )
                          {
                            add_transcript_create_info( op_count, external_id, name, who, when );
                          }
                        }
                        else
                        {
                          cdestructuring_bind.cdestructuring_bind_error( datum_$6, $list37 );
                        }
                      }
                      else if( pcase_var.eql( $sym38$FI_RENAME ) )
                      {
                        datum_$7 = ( current_$8 = args );
                        v_term = NIL;
                        new_name = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list39 );
                        v_term = current_$8.first();
                        current_$8 = current_$8.rest();
                        cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list39 );
                        new_name = current_$8.first();
                        current_$8 = current_$8.rest();
                        if( NIL == current_$8 )
                        {
                          v_term = list_utilities.unquotify( v_term );
                          new_name = list_utilities.unquotify( new_name );
                          old_name = conses_high.second( v_term );
                          external_id2 = conses_high.third( v_term );
                          if( old_name.isString() && new_name.isString() )
                          {
                            add_transcript_rename_info( op_count, external_id2, old_name, new_name, who, when );
                          }
                        }
                        else
                        {
                          cdestructuring_bind.cdestructuring_bind_error( datum_$7, $list39 );
                        }
                      }
                      else if( pcase_var.eql( $sym40$FI_KILL ) )
                      {
                        datum_$8 = ( current_$9 = args );
                        v_term = NIL;
                        cdestructuring_bind.destructuring_bind_must_consp( current_$9, datum_$8, $list41 );
                        v_term = current_$9.first();
                        current_$9 = current_$9.rest();
                        if( NIL == current_$9 )
                        {
                          v_term = list_utilities.unquotify( v_term );
                          name2 = conses_high.second( v_term );
                          external_id3 = conses_high.third( v_term );
                          if( name2.isString() )
                          {
                            rem_transcript_rename_info( external_id3 );
                            if( NIL != constant_created_in_transcript( external_id3 ) )
                            {
                              rem_transcript_create_info( external_id3 );
                            }
                            else
                            {
                              transcript_kill_list = ConsesLow.cons( ConsesLow.list( op_count, external_id3, name2, who, when ), transcript_kill_list );
                            }
                          }
                        }
                        else
                        {
                          cdestructuring_bind.cdestructuring_bind_error( datum_$8, $list41 );
                        }
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
                    }
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
                  }
                }
              }
              finally
              {
                utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
                utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
                utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
                utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$5, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values2 = Values.getValuesAsVector();
                if( stream.isStream() )
                {
                  streams_high.close( stream, UNPROVIDED );
                }
                Values.restoreValuesFromVector( _values2 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
              }
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
      return ConsesLow.list( op_count, error_message );
    }
    transcript_kill_list = Sequences.nreverse( transcript_kill_list );
    transcript_rename_list = sort_transcript_renames();
    transcript_create_list = sort_transcript_creates();
    return ConsesLow.list( op_count, transcript_create_list, transcript_rename_list, transcript_kill_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 20510L)
  public static SubLObject report_constant_modifications_in_transcript(SubLObject transcript_filename, SubLObject stream)
  {
    if( transcript_filename == UNPROVIDED )
    {
      transcript_filename = NIL;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == transcript_filename )
    {
      transcript_filename = construct_transcript_filename( make_master_transcript_filename( UNPROVIDED ) );
    }
    if( transcript_filename.isString() && NIL != Filesys.probe_file( transcript_filename ) )
    {
      final SubLObject constant_modification_info = constant_modifications_in_transcript( transcript_filename );
      final SubLObject op_count = constant_modification_info.first();
      if( stream.eql( StreamsLow.$standard_output$.getDynamicValue( thread ) ) )
      {
        streams_high.terpri( stream );
      }
      PrintLow.format( stream, $str42$____Transcript____S, transcript_filename );
      PrintLow.format( stream, $str43$______Examined______A, numeric_date_utilities.timestring( UNPROVIDED ) );
      PrintLow.format( stream, $str44$______Total_Ops_____S, op_count );
      if( Sequences.length( constant_modification_info ).numE( TWO_INTEGER ) )
      {
        PrintLow.format( stream, $str45$______error_during_transcript_ana, op_count );
        PrintLow.format( stream, $str46$___A, conses_high.second( constant_modification_info ) );
      }
      else
      {
        SubLObject current;
        final SubLObject datum = current = constant_modification_info.rest();
        SubLObject transcript_create_list = NIL;
        SubLObject transcript_rename_list = NIL;
        SubLObject transcript_kill_list = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
        transcript_create_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
        transcript_rename_list = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list47 );
        transcript_kill_list = current.first();
        current = current.rest();
        if( NIL == current )
        {
          if( NIL != transcript_kill_list )
          {
            streams_high.terpri( stream );
            PrintLow.format( stream, $str48$_______S_KILLED, Sequences.length( transcript_kill_list ) );
            SubLObject cdolist_list_var = transcript_kill_list;
            SubLObject info = NIL;
            info = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current_$15;
              final SubLObject datum_$14 = current_$15 = info;
              SubLObject op_num = NIL;
              SubLObject external_id = NIL;
              SubLObject name = NIL;
              SubLObject who = NIL;
              SubLObject when = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$15, datum_$14, $list49 );
              op_num = current_$15.first();
              current_$15 = current_$15.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$15, datum_$14, $list49 );
              external_id = current_$15.first();
              current_$15 = current_$15.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$15, datum_$14, $list49 );
              name = current_$15.first();
              current_$15 = current_$15.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$15, datum_$14, $list49 );
              who = current_$15.first();
              current_$15 = current_$15.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$15, datum_$14, $list49 );
              when = current_$15.first();
              current_$15 = current_$15.rest();
              if( NIL == current_$15 )
              {
                PrintLow.format( stream, $str50$__EXTERNAL_ID__S____A_by__A_at__A, new SubLObject[] { external_id, name, who, when
                } );
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$14, $list49 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              info = cdolist_list_var.first();
            }
          }
          if( NIL != transcript_rename_list )
          {
            streams_high.terpri( stream );
            PrintLow.format( stream, $str51$_______S_RENAMED, Sequences.length( transcript_rename_list ) );
            SubLObject cdolist_list_var = transcript_rename_list;
            SubLObject info = NIL;
            info = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current_$16;
              final SubLObject datum_$15 = current_$16 = info;
              SubLObject op_num = NIL;
              SubLObject external_id = NIL;
              SubLObject old_name = NIL;
              SubLObject new_name = NIL;
              SubLObject who2 = NIL;
              SubLObject when2 = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list52 );
              op_num = current_$16.first();
              current_$16 = current_$16.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list52 );
              external_id = current_$16.first();
              current_$16 = current_$16.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list52 );
              old_name = current_$16.first();
              current_$16 = current_$16.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list52 );
              new_name = current_$16.first();
              current_$16 = current_$16.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list52 );
              who2 = current_$16.first();
              current_$16 = current_$16.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$16, datum_$15, $list52 );
              when2 = current_$16.first();
              current_$16 = current_$16.rest();
              if( NIL == current_$16 )
              {
                PrintLow.format( stream, $str53$__EXTERNAL_ID__S____A_to__A_by__A, new SubLObject[] { external_id, old_name, new_name, who2, when2
                } );
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$15, $list52 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              info = cdolist_list_var.first();
            }
          }
          if( NIL != transcript_create_list )
          {
            streams_high.terpri( stream );
            PrintLow.format( stream, $str54$_______S_CREATED, Sequences.length( transcript_create_list ) );
            SubLObject cdolist_list_var = transcript_create_list;
            SubLObject info = NIL;
            info = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              SubLObject current_$17;
              final SubLObject datum_$16 = current_$17 = info;
              SubLObject op_num = NIL;
              SubLObject external_id = NIL;
              SubLObject name = NIL;
              SubLObject who = NIL;
              SubLObject when = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current_$17, datum_$16, $list49 );
              op_num = current_$17.first();
              current_$17 = current_$17.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$17, datum_$16, $list49 );
              external_id = current_$17.first();
              current_$17 = current_$17.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$17, datum_$16, $list49 );
              name = current_$17.first();
              current_$17 = current_$17.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$17, datum_$16, $list49 );
              who = current_$17.first();
              current_$17 = current_$17.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current_$17, datum_$16, $list49 );
              when = current_$17.first();
              current_$17 = current_$17.rest();
              if( NIL == current_$17 )
              {
                PrintLow.format( stream, $str50$__EXTERNAL_ID__S____A_by__A_at__A, new SubLObject[] { external_id, name, who, when
                } );
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum_$16, $list49 );
              }
              cdolist_list_var = cdolist_list_var.rest();
              info = cdolist_list_var.first();
            }
          }
          return T;
        }
        cdestructuring_bind.cdestructuring_bind_error( datum, $list47 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 24678L)
  public static SubLObject report_constant_modifications_in_transcript_to_file(final SubLObject report_file, SubLObject transcript_filename)
  {
    if( transcript_filename == UNPROVIDED )
    {
      transcript_filename = NIL;
    }
    assert NIL != Types.stringp( report_file ) : report_file;
    SubLObject stream = NIL;
    try
    {
      stream = compatibility.open_text( report_file, $kw11$OUTPUT );
      if( !stream.isStream() )
      {
        Errors.error( $str12$Unable_to_open__S, report_file );
      }
      final SubLObject stream_$20 = stream;
      report_constant_modifications_in_transcript( transcript_filename, stream_$20 );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 25162L)
  public static SubLObject encapsulated_cyclist_string(final SubLObject encapsuated_cyclist)
  {
    final SubLObject v_term = encapsulation.unencapsulate_partial( encapsuated_cyclist );
    if( NIL != constant_handles.constant_p( v_term ) )
    {
      return constants_high.constant_name( v_term );
    }
    return print_high.princ_to_string( v_term );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 25675L)
  public static SubLObject reset_transcript_rename_hash()
  {
    if( !$transcript_rename_hash$.getGlobalValue().isHashtable() )
    {
      $transcript_rename_hash$.setGlobalValue( Hashtables.make_hash_table( $int56$100, UNPROVIDED, UNPROVIDED ) );
    }
    Hashtables.clrhash( $transcript_rename_hash$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 25885L)
  public static SubLObject sort_transcript_renames()
  {
    return hash_table_utilities.sort_hash_table_data( $transcript_rename_hash$.getGlobalValue(), Symbols.symbol_function( $sym57$_ ), Symbols.symbol_function( $sym58$FIRST ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 25998L)
  public static SubLObject add_transcript_rename_info(final SubLObject op_count, final SubLObject external_id, final SubLObject old_name, final SubLObject new_name, final SubLObject who, final SubLObject when)
  {
    Hashtables.sethash( external_id, $transcript_rename_hash$.getGlobalValue(), ConsesLow.list( op_count, external_id, old_name, new_name, who, when ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 26217L)
  public static SubLObject rem_transcript_rename_info(final SubLObject external_id)
  {
    Hashtables.remhash( external_id, $transcript_rename_hash$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 26388L)
  public static SubLObject reset_transcript_create_hash()
  {
    if( !$transcript_create_hash$.getGlobalValue().isHashtable() )
    {
      $transcript_create_hash$.setGlobalValue( Hashtables.make_hash_table( $int56$100, UNPROVIDED, UNPROVIDED ) );
    }
    Hashtables.clrhash( $transcript_create_hash$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 26598L)
  public static SubLObject sort_transcript_creates()
  {
    return hash_table_utilities.sort_hash_table_data( $transcript_create_hash$.getGlobalValue(), Symbols.symbol_function( $sym57$_ ), Symbols.symbol_function( $sym58$FIRST ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 26711L)
  public static SubLObject add_transcript_create_info(final SubLObject op_count, final SubLObject external_id, final SubLObject name, final SubLObject who, final SubLObject when)
  {
    Hashtables.sethash( external_id, $transcript_create_hash$.getGlobalValue(), ConsesLow.list( op_count, external_id, name, who, when ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 26904L)
  public static SubLObject constant_created_in_transcript(final SubLObject external_id)
  {
    return Types.consp( Hashtables.gethash( external_id, $transcript_create_hash$.getGlobalValue(), NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 27034L)
  public static SubLObject rem_transcript_create_info(final SubLObject external_id)
  {
    Hashtables.remhash( external_id, $transcript_create_hash$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 27154L)
  public static SubLObject write_specific_transcript_file_as_ke_text(final SubLObject transcript_filename, final SubLObject output_filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    enforceType( transcript_filename, $sym22$STRINGP );
    enforceType( output_filename, $sym22$STRINGP );
    if( NIL == Filesys.probe_file( transcript_filename ) )
    {
      return $str60$transcript_file_not_found;
    }
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym0$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          SubLObject stream = NIL;
          try
          {
            stream = compatibility.open_text( output_filename, $kw11$OUTPUT );
            if( !stream.isStream() )
            {
              Errors.error( $str12$Unable_to_open__S, output_filename );
            }
            final SubLObject output_stream = stream;
            SubLObject cdolist_list_var = transcript_file_to_ke_text( transcript_filename );
            SubLObject ke_text_string = NIL;
            ke_text_string = cdolist_list_var.first();
            while ( NIL != cdolist_list_var)
            {
              PrintLow.format( output_stream, $str61$_A__, ke_text_string );
              cdolist_list_var = cdolist_list_var.rest();
              ke_text_string = cdolist_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$21 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$21, thread );
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
      return error_message;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 31302L)
  public static SubLObject transcript_file_to_ke_text(final SubLObject transcript_filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current_mt = mt_vars.$default_assert_mt$.getGlobalValue();
    SubLObject force_mt_printP = NIL;
    SubLObject enter_mode = $kw66$ENTER;
    SubLObject current_constant = NIL;
    SubLObject out_string_list = NIL;
    SubLObject error_message = NIL;
    SubLObject last_operation = NIL;
    if( !transcript_filename.isString() || NIL == Filesys.probe_file( transcript_filename ) )
    {
      return NIL;
    }
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym0$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          SubLObject stream = NIL;
          try
          {
            stream = compatibility.open_text( transcript_filename, $kw28$INPUT );
            if( !stream.isStream() )
            {
              Errors.error( $str12$Unable_to_open__S, transcript_filename );
            }
            SubLObject transcript_stream;
            SubLObject raw_operation;
            SubLObject operations;
            SubLObject current;
            SubLObject datum;
            SubLObject encapsulated_cyclist;
            SubLObject cyc_image_id;
            SubLObject when;
            SubLObject temp;
            SubLObject function;
            SubLObject args;
            SubLObject current_$23;
            SubLObject datum_$22;
            SubLObject old_formula;
            SubLObject new_formula;
            SubLObject old_mt;
            SubLObject new_mt;
            SubLObject strength;
            SubLObject direction;
            SubLObject cdolist_list_var;
            SubLObject operation;
            SubLObject current2;
            SubLObject datum2;
            SubLObject encapsulated_cyclist2;
            SubLObject cyc_image_id2;
            SubLObject when2;
            SubLObject temp2;
            SubLObject function2;
            SubLObject args2;
            SubLObject pcase_var;
            SubLObject current_$24;
            SubLObject datum_$23;
            SubLObject name;
            SubLObject external_id;
            SubLObject current_$25;
            SubLObject datum_$24;
            SubLObject old_name;
            SubLObject new_name;
            SubLObject current_$26;
            SubLObject datum_$25;
            SubLObject kill_fort;
            SubLObject keep_fort;
            SubLObject current_$27;
            SubLObject datum_$26;
            SubLObject v_term;
            SubLObject pcase_var_$32;
            SubLObject assertion;
            SubLObject assertion_pred;
            SubLObject assertion_arg1;
            SubLObject assertion_arg2_;
            SubLObject assertion_string;
            SubLObject mt_string;
            SubLObject tv;
            SubLObject direction2;
            SubLObject ignore_errors_tag;
            SubLObject _prev_bind_0_$33;
            SubLObject pcase_var_$33;
            for( transcript_stream = stream, raw_operation = NIL, raw_operation = operation_communication.read_one_transcript_operation( transcript_stream ); NIL != raw_operation; raw_operation = operation_communication
                .read_one_transcript_operation( transcript_stream ) )
            {
              operations = ConsesLow.list( raw_operation );
              datum = ( current = raw_operation );
              encapsulated_cyclist = NIL;
              cyc_image_id = NIL;
              when = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
              encapsulated_cyclist = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
              cyc_image_id = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
              when = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
              temp = current.rest();
              current = current.first();
              function = NIL;
              args = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list35 );
              function = current.first();
              current = ( args = current.rest() );
              current = temp;
              if( NIL == current )
              {
                if( function == $sym67$FI_EDIT )
                {
                  datum_$22 = ( current_$23 = args );
                  old_formula = NIL;
                  new_formula = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp( current_$23, datum_$22, $list68 );
                  old_formula = current_$23.first();
                  current_$23 = current_$23.rest();
                  cdestructuring_bind.destructuring_bind_must_consp( current_$23, datum_$22, $list68 );
                  new_formula = current_$23.first();
                  current_$23 = current_$23.rest();
                  old_mt = current_$23.isCons() ? current_$23.first() : NIL;
                  cdestructuring_bind.destructuring_bind_must_listp( current_$23, datum_$22, $list68 );
                  current_$23 = current_$23.rest();
                  new_mt = ( current_$23.isCons() ? current_$23.first() : old_mt );
                  cdestructuring_bind.destructuring_bind_must_listp( current_$23, datum_$22, $list68 );
                  current_$23 = current_$23.rest();
                  strength = current_$23.isCons() ? current_$23.first() : $kw69$DEFAULT;
                  cdestructuring_bind.destructuring_bind_must_listp( current_$23, datum_$22, $list68 );
                  current_$23 = current_$23.rest();
                  direction = current_$23.isCons() ? current_$23.first() : NIL;
                  cdestructuring_bind.destructuring_bind_must_listp( current_$23, datum_$22, $list68 );
                  current_$23 = current_$23.rest();
                  if( NIL == current_$23 )
                  {
                    operations = ConsesLow.list( ConsesLow.list( encapsulated_cyclist, cyc_image_id, when, ConsesLow.list( $sym70$FI_UNASSERT, old_formula, old_mt ) ), ConsesLow.list( encapsulated_cyclist, cyc_image_id,
                        when, ConsesLow.list( $sym71$FI_ASSERT, new_formula, new_mt, strength, direction ) ) );
                  }
                  else
                  {
                    cdestructuring_bind.cdestructuring_bind_error( datum_$22, $list68 );
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list35 );
              }
              cdolist_list_var = operations;
              operation = NIL;
              operation = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                last_operation = operation;
                datum2 = ( current2 = operation );
                encapsulated_cyclist2 = NIL;
                cyc_image_id2 = NIL;
                when2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list35 );
                encapsulated_cyclist2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list35 );
                cyc_image_id2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list35 );
                when2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list35 );
                temp2 = current2.rest();
                current2 = current2.first();
                function2 = NIL;
                args2 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current2, datum2, $list35 );
                function2 = current2.first();
                current2 = ( args2 = current2.rest() );
                current2 = temp2;
                if( NIL == current2 )
                {
                  pcase_var = function2;
                  if( pcase_var.eql( $sym36$FI_CREATE ) || pcase_var.eql( $sym72$FI_FIND_OR_CREATE ) )
                  {
                    datum_$23 = ( current_$24 = args2 );
                    name = NIL;
                    external_id = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current_$24, datum_$23, $list37 );
                    name = current_$24.first();
                    current_$24 = current_$24.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current_$24, datum_$23, $list37 );
                    external_id = current_$24.first();
                    current_$24 = current_$24.rest();
                    if( NIL == current_$24 )
                    {
                      name = list_utilities.unquotify( name );
                      external_id = list_utilities.unquotify( external_id );
                      if( name.isString() )
                      {
                        out_string_list = ConsesLow.cons( $str73$, out_string_list );
                        out_string_list = ConsesLow.cons( Sequences.cconcatenate( $str74$Constant__, new SubLObject[] { name, $str20$_
                        } ), out_string_list );
                        current_constant = name;
                        force_mt_printP = T;
                      }
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum_$23, $list37 );
                    }
                  }
                  else if( pcase_var.eql( $sym38$FI_RENAME ) )
                  {
                    datum_$24 = ( current_$25 = args2 );
                    old_name = NIL;
                    new_name = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current_$25, datum_$24, $list75 );
                    old_name = current_$25.first();
                    current_$25 = current_$25.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current_$25, datum_$24, $list75 );
                    new_name = current_$25.first();
                    current_$25 = current_$25.rest();
                    if( NIL == current_$25 )
                    {
                      old_name = unencapsulate_to_string( list_utilities.unquotify( old_name ), UNPROVIDED );
                      new_name = unencapsulate_to_string( list_utilities.unquotify( new_name ), UNPROVIDED );
                      out_string_list = ConsesLow.cons( $str73$, out_string_list );
                      out_string_list = ConsesLow.cons( Sequences.cconcatenate( $str76$Rename__, new SubLObject[] { old_name, $str77$_, new_name, $str20$_
                      } ), out_string_list );
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum_$24, $list75 );
                    }
                  }
                  else if( pcase_var.eql( $sym78$FI_MERGE ) )
                  {
                    datum_$25 = ( current_$26 = args2 );
                    kill_fort = NIL;
                    keep_fort = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current_$26, datum_$25, $list79 );
                    kill_fort = current_$26.first();
                    current_$26 = current_$26.rest();
                    cdestructuring_bind.destructuring_bind_must_consp( current_$26, datum_$25, $list79 );
                    keep_fort = current_$26.first();
                    current_$26 = current_$26.rest();
                    if( NIL == current_$26 )
                    {
                      kill_fort = unencapsulate_to_string( list_utilities.unquotify( kill_fort ), UNPROVIDED );
                      keep_fort = unencapsulate_to_string( list_utilities.unquotify( keep_fort ), UNPROVIDED );
                      out_string_list = ConsesLow.cons( $str73$, out_string_list );
                      out_string_list = ConsesLow.cons( Sequences.cconcatenate( $str80$Merge__, new SubLObject[] { kill_fort, $str77$_, keep_fort, $str20$_
                      } ), out_string_list );
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum_$25, $list79 );
                    }
                  }
                  else if( pcase_var.eql( $sym40$FI_KILL ) )
                  {
                    datum_$26 = ( current_$27 = args2 );
                    v_term = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp( current_$27, datum_$26, $list41 );
                    v_term = current_$27.first();
                    current_$27 = current_$27.rest();
                    if( NIL == current_$27 )
                    {
                      v_term = unencapsulate_to_string( list_utilities.unquotify( v_term ), UNPROVIDED );
                      out_string_list = ConsesLow.cons( $str73$, out_string_list );
                      out_string_list = ConsesLow.cons( Sequences.cconcatenate( $str81$Kill__, new SubLObject[] { v_term, $str20$_
                      } ), out_string_list );
                    }
                    else
                    {
                      cdestructuring_bind.cdestructuring_bind_error( datum_$26, $list41 );
                    }
                  }
                  else if( pcase_var.eql( $sym71$FI_ASSERT ) || pcase_var.eql( $sym82$FI_REASSERT ) || pcase_var.eql( $sym70$FI_UNASSERT ) || pcase_var.eql( $sym83$FI_BLAST ) )
                  {
                    pcase_var_$32 = function2;
                    if( pcase_var_$32.eql( $sym71$FI_ASSERT ) )
                    {
                      if( !enter_mode.equal( $kw66$ENTER ) )
                      {
                        enter_mode = $kw66$ENTER;
                        out_string_list = ConsesLow.cons( $str73$, out_string_list );
                        out_string_list = ConsesLow.cons( $str84$Enter_, out_string_list );
                      }
                    }
                    else if( pcase_var_$32.eql( $sym82$FI_REASSERT ) )
                    {
                      if( !enter_mode.equal( $kw66$ENTER ) )
                      {
                        enter_mode = $kw66$ENTER;
                        out_string_list = ConsesLow.cons( $str73$, out_string_list );
                        out_string_list = ConsesLow.cons( $str84$Enter_, out_string_list );
                      }
                      out_string_list = ConsesLow.cons( $str73$, out_string_list );
                      out_string_list = ConsesLow.cons( $str85$___The_following_assertion_simula, out_string_list );
                    }
                    else if( pcase_var_$32.eql( $sym70$FI_UNASSERT ) )
                    {
                      if( !enter_mode.equal( $kw86$DELETE ) )
                      {
                        enter_mode = $kw86$DELETE;
                        out_string_list = ConsesLow.cons( $str73$, out_string_list );
                        out_string_list = ConsesLow.cons( $str87$Delete_, out_string_list );
                      }
                    }
                    else if( pcase_var_$32.eql( $sym83$FI_BLAST ) )
                    {
                      force_mt_printP = T;
                      if( !enter_mode.equal( $kw88$BLAST ) )
                      {
                        enter_mode = $kw88$BLAST;
                        out_string_list = ConsesLow.cons( $str73$, out_string_list );
                        out_string_list = ConsesLow.cons( $str89$Delete_____Simulate_an_fi_blast_, out_string_list );
                      }
                    }
                    assertion = list_utilities.unquotify( args2.first() );
                    assertion_pred = unencapsulate_to_string( assertion.first(), UNPROVIDED );
                    assertion_arg1 = unencapsulate_to_string( conses_high.second( assertion ), UNPROVIDED );
                    assertion_arg2_ = conses_high.cddr( assertion );
                    assertion_string = unencapsulate_to_string( list_utilities.unquotify( args2.first() ), UNPROVIDED );
                    mt_string = unencapsulate_to_string( list_utilities.unquotify( conses_high.second( args2 ) ), UNPROVIDED );
                    tv = list_utilities.unquotify( conses_high.third( args2 ) );
                    direction2 = list_utilities.unquotify( conses_high.fourth( args2 ) );
                    if( NIL != assertion_arg2_ )
                    {
                      if( !assertion_arg2_.isCons() || NIL != assertion_arg2_.rest() )
                      {
                        assertion_arg2_ = unencapsulate_to_string( assertion_arg2_, UNPROVIDED );
                      }
                      else
                      {
                        assertion_arg2_ = unencapsulate_to_string( assertion_arg2_.first(), UNPROVIDED );
                      }
                    }
                    ignore_errors_tag = NIL;
                    try
                    {
                      thread.throwStack.push( $kw90$IGNORE_ERRORS_TARGET );
                      _prev_bind_0_$33 = Errors.$error_handler$.currentBinding( thread );
                      try
                      {
                        Errors.$error_handler$.bind( Symbols.symbol_function( $sym91$IGNORE_ERRORS_HANDLER ), thread );
                        try
                        {
                          assertion = encapsulation.unencapsulate_partial( list_utilities.unquotify( args2.first() ) );
                        }
                        catch( final Throwable catch_var )
                        {
                          Errors.handleThrowable( catch_var, NIL );
                        }
                      }
                      finally
                      {
                        Errors.$error_handler$.rebind( _prev_bind_0_$33, thread );
                      }
                    }
                    catch( final Throwable ccatch_env_var )
                    {
                      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw90$IGNORE_ERRORS_TARGET );
                    }
                    finally
                    {
                      thread.throwStack.pop();
                    }
                    if( NIL != force_mt_printP || !mt_string.equal( current_mt ) )
                    {
                      force_mt_printP = NIL;
                      current_mt = mt_string;
                      out_string_list = ConsesLow.cons( $str73$, out_string_list );
                      out_string_list = ConsesLow.cons( Sequences.cconcatenate( $str92$In_Mt__, new SubLObject[] { mt_string, $str20$_
                      } ), out_string_list );
                    }
                    if( tv.equal( $kw93$UNKNOWN ) )
                    {
                      out_string_list = ConsesLow.cons( $str73$, out_string_list );
                      out_string_list = ConsesLow.cons( $str94$Truth_Value___unknown_, out_string_list );
                    }
                    else if( NIL != isa.isa_in_any_mtP( assertion.first(), $const95$DefaultMonotonicPredicate ) )
                    {
                      if( tv.equal( $kw69$DEFAULT ) )
                      {
                        out_string_list = ConsesLow.cons( $str73$, out_string_list );
                        out_string_list = ConsesLow.cons( $str96$Truth_Value___default_, out_string_list );
                      }
                    }
                    else if( tv.equal( $kw97$MONOTONIC ) )
                    {
                      out_string_list = ConsesLow.cons( $str73$, out_string_list );
                      out_string_list = ConsesLow.cons( $str98$Truth_Value___monotonic_, out_string_list );
                    }
                    pcase_var_$33 = direction2;
                    if( pcase_var_$33.eql( $kw99$FORWARD ) )
                    {
                      out_string_list = ConsesLow.cons( $str100$Direction___forward_, out_string_list );
                    }
                    else if( pcase_var_$33.eql( $kw101$BACKWARD ) )
                    {
                      out_string_list = ConsesLow.cons( $str102$Direction___backward_, out_string_list );
                    }
                    else if( pcase_var_$33.eql( $kw103$CODE ) )
                    {
                      out_string_list = ConsesLow.cons( $str104$Direction___code_, out_string_list );
                    }
                    if( assertion_arg1.equal( current_constant ) && NIL != assertion_arg2_ )
                    {
                      out_string_list = ConsesLow.cons( PrintLow.format( NIL, $str105$_A___A_, assertion_pred, assertion_arg2_ ), out_string_list );
                    }
                    else
                    {
                      out_string_list = ConsesLow.cons( PrintLow.format( NIL, $str106$f___A_, assertion_string ), out_string_list );
                    }
                  }
                  else if( !pcase_var.eql( $sym107$FI_TIMESTAMP_ASSERTION ) )
                  {
                    if( !pcase_var.eql( $sym108$FI_TIMESTAMP_CONSTANT ) )
                    {
                      if( pcase_var.eql( $sym109$FI_CREATE_SKOLEM ) )
                      {
                        out_string_list = ConsesLow.cons( $str73$, out_string_list );
                        out_string_list = ConsesLow.cons( $str110$___This_skolem_creation_should_be, out_string_list );
                        out_string_list = ConsesLow.cons( PrintLow.format( NIL, $str111$____S, encapsulation.unencapsulate_partial( operation ) ), out_string_list );
                      }
                      else
                      {
                        out_string_list = ConsesLow.cons( $str73$, out_string_list );
                        out_string_list = ConsesLow.cons( $str112$___Don_t_know_how_convert_next_li, out_string_list );
                        out_string_list = ConsesLow.cons( PrintLow.format( NIL, $str111$____S, encapsulation.unencapsulate_partial( operation ) ), out_string_list );
                      }
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum2, $list35 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                operation = cdolist_list_var.first();
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
            }
          }
        }
        catch( final Throwable catch_var2 )
        {
          Errors.handleThrowable( catch_var2, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var2 )
    {
      error_message = Errors.handleThrowable( ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      return PrintLow.format( NIL, $str113$Internal_Error____A__for_operatio, error_message, last_operation );
    }
    return Sequences.nreverse( out_string_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 38858L)
  public static SubLObject unencapsulate_to_string(final SubLObject v_object, SubLObject indent)
  {
    if( indent == UNPROVIDED )
    {
      indent = ZERO_INTEGER;
    }
    if( v_object.isKeyword() )
    {
      return Sequences.cconcatenate( $str114$_, string_utilities.string_from_keyword( v_object ) );
    }
    if( v_object.isSymbol() )
    {
      if( NIL != cycl_variables.el_varP( v_object ) )
      {
        return Symbols.symbol_name( v_object );
      }
      return Sequences.cconcatenate( $str115$_, Symbols.symbol_name( v_object ) );
    }
    else
    {
      if( v_object.isString() )
      {
        return unencapsulate_string( v_object );
      }
      if( v_object.isAtom() )
      {
        return format_nil.format_nil_a( v_object );
      }
      if( v_object.first() == $kw116$HP && NIL != list_utilities.proper_list_p( v_object ) && Sequences.length( v_object ).numE( THREE_INTEGER ) )
      {
        return conses_high.second( v_object );
      }
      if( v_object.first() == $kw117$NAT && NIL != list_utilities.proper_list_p( v_object ) && ( Sequences.length( v_object ).numE( TWO_INTEGER ) || Sequences.length( v_object ).numE( THREE_INTEGER ) ) )
      {
        return unencapsulate_to_string( conses_high.second( v_object ), UNPROVIDED );
      }
      if( v_object.first().isCons() && NIL != list_utilities.proper_list_p( v_object ) && conses_high.second( v_object.first() ).isString() && NIL != Strings.stringE( $str118$TLReifiedNatFn, conses_high.second( v_object
          .first() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return unencapsulate_to_string( conses_high.second( v_object ), UNPROVIDED );
      }
      if( v_object.first().isCons() && NIL != list_utilities.proper_list_p( v_object ) && conses_high.second( v_object.first() ).isString() && NIL != Strings.stringE( $str119$TLAssertionFn, conses_high.second( v_object
          .first() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return unencapsulate_to_string( ConsesLow.list( encapsulation.encapsulate( $const120$ist ), conses_high.second( v_object ), conses_high.third( v_object ) ), UNPROVIDED );
      }
      if( !v_object.first().isCons() || NIL == list_utilities.proper_list_p( v_object ) || !conses_high.second( v_object.first() ).isString() || NIL == Strings.stringE( $str121$TLVariableFn, conses_high.second( v_object
          .first() ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        SubLObject outlist = NIL;
        SubLObject count = ZERO_INTEGER;
        if( indent.numG( ZERO_INTEGER ) )
        {
          outlist = ConsesLow.cons( Strings.make_string( ONE_INTEGER, Characters.CHAR_newline ), outlist );
          outlist = ConsesLow.cons( Strings.make_string( Numbers.add( THREE_INTEGER, indent ), Characters.CHAR_space ), outlist );
        }
        outlist = ConsesLow.cons( $str123$_, outlist );
        if( NIL != list_utilities.dotted_list_p( v_object ) )
        {
          SubLObject cdolist_list_var = list_utilities.dotted_butlast( v_object );
          SubLObject v_this = NIL;
          v_this = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( count.numG( ZERO_INTEGER ) )
            {
              outlist = ConsesLow.cons( $str77$_, outlist );
            }
            outlist = ConsesLow.cons( unencapsulate_to_string( v_this, Numbers.add( indent, TWO_INTEGER ) ), outlist );
            count = Numbers.add( count, ONE_INTEGER );
            cdolist_list_var = cdolist_list_var.rest();
            v_this = cdolist_list_var.first();
          }
          outlist = ConsesLow.cons( $str124$___, outlist );
          outlist = ConsesLow.cons( unencapsulate_to_string( list_utilities.dotted_last( v_object ), Numbers.add( indent, TWO_INTEGER ) ), outlist );
        }
        else
        {
          SubLObject cdolist_list_var = v_object;
          SubLObject v_this = NIL;
          v_this = cdolist_list_var.first();
          while ( NIL != cdolist_list_var)
          {
            if( count.numG( ZERO_INTEGER ) )
            {
              outlist = ConsesLow.cons( $str77$_, outlist );
            }
            outlist = ConsesLow.cons( unencapsulate_to_string( v_this, Numbers.add( indent, TWO_INTEGER ) ), outlist );
            count = Numbers.add( count, ONE_INTEGER );
            cdolist_list_var = cdolist_list_var.rest();
            v_this = cdolist_list_var.first();
          }
        }
        outlist = ConsesLow.cons( $str125$_, outlist );
        return Functions.apply( $sym126$CCONCATENATE, Sequences.nreverse( outlist ) );
      }
      if( conses_high.third( v_object ).isString() )
      {
        return unencapsulate_to_string( Symbols.make_symbol( conses_high.third( v_object ) ), UNPROVIDED );
      }
      return unencapsulate_to_string( Symbols.make_symbol( Sequences.cconcatenate( $str122$_VAR, format_nil.format_nil_a_no_copy( conses_high.second( v_object ) ) ) ), UNPROVIDED );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/transcript-utilities.lisp", position = 41794L)
  public static SubLObject unencapsulate_string(final SubLObject string)
  {
    return Sequences.cconcatenate( $str127$_, new SubLObject[] { format_nil.format_nil_a_no_copy( string_utilities.string_substitute( $str128$__, $str129$___, string_utilities.string_substitute( $str128$__, $str127$_,
        string, UNPROVIDED ), UNPROVIDED ) ), $str127$_
    } );
  }

  public static SubLObject declare_transcript_utilities_file()
  {
    SubLFiles.declareFunction( me, "transcript_eval", "TRANSCRIPT-EVAL", 1, 1, false );
    SubLFiles.declareFunction( me, "transcript_form", "TRANSCRIPT-FORM", 1, 1, false );
    SubLFiles.declareFunction( me, "transcript_form_int", "TRANSCRIPT-FORM-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "form_to_transcript_form", "FORM-TO-TRANSCRIPT-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "initialize_transcript_handling", "INITIALIZE-TRANSCRIPT-HANDLING", 0, 0, false );
    SubLFiles.declareFunction( me, "transcript_suffix", "TRANSCRIPT-SUFFIX", 0, 0, false );
    SubLFiles.declareFunction( me, "master_transcript_already_exists", "MASTER-TRANSCRIPT-ALREADY-EXISTS", 0, 0, false );
    SubLFiles.declareFunction( me, "set_master_transcript_already_exists", "SET-MASTER-TRANSCRIPT-ALREADY-EXISTS", 1, 0, false );
    SubLFiles.declareFunction( me, "local_transcript_version", "LOCAL-TRANSCRIPT-VERSION", 0, 0, false );
    SubLFiles.declareFunction( me, "inc_local_transcript_version", "INC-LOCAL-TRANSCRIPT-VERSION", 0, 0, false );
    SubLFiles.declareFunction( me, "local_transcript_history", "LOCAL-TRANSCRIPT-HISTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "local_transcript_history_add", "LOCAL-TRANSCRIPT-HISTORY-ADD", 1, 0, false );
    SubLFiles.declareFunction( me, "local_hl_transcript_version", "LOCAL-HL-TRANSCRIPT-VERSION", 0, 0, false );
    SubLFiles.declareFunction( me, "inc_local_hl_transcript_version", "INC-LOCAL-HL-TRANSCRIPT-VERSION", 0, 0, false );
    SubLFiles.declareFunction( me, "local_hl_transcript_history", "LOCAL-HL-TRANSCRIPT-HISTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "local_hl_transcript_history_add", "LOCAL-HL-TRANSCRIPT-HISTORY-ADD", 1, 0, false );
    SubLFiles.declareFunction( me, "read_transcript_position", "READ-TRANSCRIPT-POSITION", 0, 0, false );
    SubLFiles.declareFunction( me, "set_read_transcript_position", "SET-READ-TRANSCRIPT-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "approx_chars_per_op", "APPROX-CHARS-PER-OP", 0, 0, false );
    SubLFiles.declareFunction( me, "set_approx_chars_per_op", "SET-APPROX-CHARS-PER-OP", 1, 0, false );
    SubLFiles.declareFunction( me, "local_transcript", "LOCAL-TRANSCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "mark_local_transcript", "MARK-LOCAL-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "roll_local_transcript", "ROLL-LOCAL-TRANSCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "new_local_transcript", "NEW-LOCAL-TRANSCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "new_local_transcript_int", "NEW-LOCAL-TRANSCRIPT-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "read_transcript", "READ-TRANSCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "set_read_transcript", "SET-READ-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "master_transcript", "MASTER-TRANSCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "set_master_transcript", "SET-MASTER-TRANSCRIPT", 0, 1, false );
    SubLFiles.declareFunction( me, "get_all_transcripts_image", "GET-ALL-TRANSCRIPTS-IMAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "local_hl_transcript", "LOCAL-HL-TRANSCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "mark_local_hl_transcript", "MARK-LOCAL-HL-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "roll_local_hl_transcript", "ROLL-LOCAL-HL-TRANSCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "new_local_hl_transcript", "NEW-LOCAL-HL-TRANSCRIPT", 0, 0, false );
    SubLFiles.declareFunction( me, "new_local_hl_transcript_int", "NEW-LOCAL-HL-TRANSCRIPT-INT", 0, 0, false );
    SubLFiles.declareFunction( me, "make_master_transcript_filename", "MAKE-MASTER-TRANSCRIPT-FILENAME", 0, 1, false );
    SubLFiles.declareFunction( me, "make_local_transcript_filename", "MAKE-LOCAL-TRANSCRIPT-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "make_local_hl_transcript_filename", "MAKE-LOCAL-HL-TRANSCRIPT-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "construct_transcript_filename", "CONSTRUCT-TRANSCRIPT-FILENAME", 1, 0, false );
    SubLFiles.declareFunction( me, "transcript_directory", "TRANSCRIPT-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "next_transcript_directory", "NEXT-TRANSCRIPT-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "transcript_directory_int", "TRANSCRIPT-DIRECTORY-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_transcript_filename", "MARK-TRANSCRIPT-FILENAME", 2, 0, false );
    SubLFiles.declareFunction( me, "get_count_ops_data", "GET-COUNT-OPS-DATA", 1, 0, false );
    SubLFiles.declareFunction( me, "get_current_op_count", "GET-CURRENT-OP-COUNT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_current_position", "GET-CURRENT-POSITION", 1, 0, false );
    SubLFiles.declareFunction( me, "update_count_ops_data", "UPDATE-COUNT-OPS-DATA", 3, 0, false );
    SubLFiles.declareFunction( me, "really_count_ops", "REALLY-COUNT-OPS", 1, 0, false );
    SubLFiles.declareFunction( me, "count_operations", "COUNT-OPERATIONS", 1, 0, false );
    SubLFiles.declareFunction( me, "estimate_number_of_ops", "ESTIMATE-NUMBER-OF-OPS", 1, 0, false );
    SubLFiles.declareFunction( me, "collect_ops_in_range", "COLLECT-OPS-IN-RANGE", 2, 2, false );
    SubLFiles.declareFunction( me, "total_master_transcript_operations", "TOTAL-MASTER-TRANSCRIPT-OPERATIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "constant_modifications_in_transcript", "CONSTANT-MODIFICATIONS-IN-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "report_constant_modifications_in_transcript", "REPORT-CONSTANT-MODIFICATIONS-IN-TRANSCRIPT", 0, 2, false );
    SubLFiles.declareFunction( me, "report_constant_modifications_in_transcript_to_file", "REPORT-CONSTANT-MODIFICATIONS-IN-TRANSCRIPT-TO-FILE", 1, 1, false );
    SubLFiles.declareFunction( me, "encapsulated_cyclist_string", "ENCAPSULATED-CYCLIST-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_transcript_rename_hash", "RESET-TRANSCRIPT-RENAME-HASH", 0, 0, false );
    SubLFiles.declareFunction( me, "sort_transcript_renames", "SORT-TRANSCRIPT-RENAMES", 0, 0, false );
    SubLFiles.declareFunction( me, "add_transcript_rename_info", "ADD-TRANSCRIPT-RENAME-INFO", 6, 0, false );
    SubLFiles.declareFunction( me, "rem_transcript_rename_info", "REM-TRANSCRIPT-RENAME-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "reset_transcript_create_hash", "RESET-TRANSCRIPT-CREATE-HASH", 0, 0, false );
    SubLFiles.declareFunction( me, "sort_transcript_creates", "SORT-TRANSCRIPT-CREATES", 0, 0, false );
    SubLFiles.declareFunction( me, "add_transcript_create_info", "ADD-TRANSCRIPT-CREATE-INFO", 5, 0, false );
    SubLFiles.declareFunction( me, "constant_created_in_transcript", "CONSTANT-CREATED-IN-TRANSCRIPT", 1, 0, false );
    SubLFiles.declareFunction( me, "rem_transcript_create_info", "REM-TRANSCRIPT-CREATE-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "write_specific_transcript_file_as_ke_text", "WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "transcript_file_to_ke_text", "TRANSCRIPT-FILE-TO-KE-TEXT", 1, 0, false );
    SubLFiles.declareFunction( me, "unencapsulate_to_string", "UNENCAPSULATE-TO-STRING", 1, 1, false );
    SubLFiles.declareFunction( me, "unencapsulate_string", "UNENCAPSULATE-STRING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_transcript_utilities_file()
  {
    $transcript_suffix$ = SubLFiles.defparameter( "*TRANSCRIPT-SUFFIX*", $str1$ts );
    $master_transcript_already_exists$ = SubLFiles.defparameter( "*MASTER-TRANSCRIPT-ALREADY-EXISTS*", NIL );
    $local_transcript_version$ = SubLFiles.deflexical( "*LOCAL-TRANSCRIPT-VERSION*", ( maybeDefault( $sym2$_LOCAL_TRANSCRIPT_VERSION_, $local_transcript_version$, ZERO_INTEGER ) ) );
    $local_transcript_history$ = SubLFiles.deflexical( "*LOCAL-TRANSCRIPT-HISTORY*", ( maybeDefault( $sym3$_LOCAL_TRANSCRIPT_HISTORY_, $local_transcript_history$, NIL ) ) );
    $local_hl_transcript_version$ = SubLFiles.deflexical( "*LOCAL-HL-TRANSCRIPT-VERSION*", ( maybeDefault( $sym4$_LOCAL_HL_TRANSCRIPT_VERSION_, $local_hl_transcript_version$, ZERO_INTEGER ) ) );
    $local_hl_transcript_history$ = SubLFiles.deflexical( "*LOCAL-HL-TRANSCRIPT-HISTORY*", ( maybeDefault( $sym5$_LOCAL_HL_TRANSCRIPT_HISTORY_, $local_hl_transcript_history$, NIL ) ) );
    $read_transcript_position$ = SubLFiles.deflexical( "*READ-TRANSCRIPT-POSITION*", ( maybeDefault( $sym6$_READ_TRANSCRIPT_POSITION_, $read_transcript_position$, ZERO_INTEGER ) ) );
    $approx_chars_per_op$ = SubLFiles.defparameter( "*APPROX-CHARS-PER-OP*", $int7$206 );
    $local_transcript$ = SubLFiles.deflexical( "*LOCAL-TRANSCRIPT*", ( maybeDefault( $sym8$_LOCAL_TRANSCRIPT_, $local_transcript$, NIL ) ) );
    $read_transcript$ = SubLFiles.deflexical( "*READ-TRANSCRIPT*", ( maybeDefault( $sym14$_READ_TRANSCRIPT_, $read_transcript$, NIL ) ) );
    $master_transcript$ = SubLFiles.deflexical( "*MASTER-TRANSCRIPT*", ( maybeDefault( $sym15$_MASTER_TRANSCRIPT_, $master_transcript$, NIL ) ) );
    $local_hl_transcript$ = SubLFiles.deflexical( "*LOCAL-HL-TRANSCRIPT*", ( maybeDefault( $sym16$_LOCAL_HL_TRANSCRIPT_, $local_hl_transcript$, NIL ) ) );
    $count_ops_table$ = SubLFiles.deflexical( "*COUNT-OPS-TABLE*", ( maybeDefault( $sym26$_COUNT_OPS_TABLE_, $count_ops_table$, NIL ) ) );
    $transcript_rename_hash$ = SubLFiles.deflexical( "*TRANSCRIPT-RENAME-HASH*", ( maybeDefault( $sym55$_TRANSCRIPT_RENAME_HASH_, $transcript_rename_hash$, NIL ) ) );
    $transcript_create_hash$ = SubLFiles.deflexical( "*TRANSCRIPT-CREATE-HASH*", ( maybeDefault( $sym59$_TRANSCRIPT_CREATE_HASH_, $transcript_create_hash$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_transcript_utilities_file()
  {
    subl_macro_promotions.declare_defglobal( $sym2$_LOCAL_TRANSCRIPT_VERSION_ );
    subl_macro_promotions.declare_defglobal( $sym3$_LOCAL_TRANSCRIPT_HISTORY_ );
    subl_macro_promotions.declare_defglobal( $sym4$_LOCAL_HL_TRANSCRIPT_VERSION_ );
    subl_macro_promotions.declare_defglobal( $sym5$_LOCAL_HL_TRANSCRIPT_HISTORY_ );
    subl_macro_promotions.declare_defglobal( $sym6$_READ_TRANSCRIPT_POSITION_ );
    subl_macro_promotions.declare_defglobal( $sym8$_LOCAL_TRANSCRIPT_ );
    subl_macro_promotions.declare_defglobal( $sym14$_READ_TRANSCRIPT_ );
    subl_macro_promotions.declare_defglobal( $sym15$_MASTER_TRANSCRIPT_ );
    subl_macro_promotions.declare_defglobal( $sym16$_LOCAL_HL_TRANSCRIPT_ );
    subl_macro_promotions.declare_defglobal( $sym26$_COUNT_OPS_TABLE_ );
    subl_macro_promotions.declare_defglobal( $sym55$_TRANSCRIPT_RENAME_HASH_ );
    subl_macro_promotions.declare_defglobal( $sym59$_TRANSCRIPT_CREATE_HASH_ );
    utilities_macros.register_cyc_api_function( $sym62$WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT, $list63, $str64$Generate_a_KE_Text_file_from_a_tr, $list65, NIL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_transcript_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_transcript_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_transcript_utilities_file();
  }
  static
  {
    me = new transcript_utilities();
    $transcript_suffix$ = null;
    $master_transcript_already_exists$ = null;
    $local_transcript_version$ = null;
    $local_transcript_history$ = null;
    $local_hl_transcript_version$ = null;
    $local_hl_transcript_history$ = null;
    $read_transcript_position$ = null;
    $approx_chars_per_op$ = null;
    $local_transcript$ = null;
    $read_transcript$ = null;
    $master_transcript$ = null;
    $local_hl_transcript$ = null;
    $count_ops_table$ = null;
    $transcript_rename_hash$ = null;
    $transcript_create_hash$ = null;
    $sym0$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str1$ts = makeString( "ts" );
    $sym2$_LOCAL_TRANSCRIPT_VERSION_ = makeSymbol( "*LOCAL-TRANSCRIPT-VERSION*" );
    $sym3$_LOCAL_TRANSCRIPT_HISTORY_ = makeSymbol( "*LOCAL-TRANSCRIPT-HISTORY*" );
    $sym4$_LOCAL_HL_TRANSCRIPT_VERSION_ = makeSymbol( "*LOCAL-HL-TRANSCRIPT-VERSION*" );
    $sym5$_LOCAL_HL_TRANSCRIPT_HISTORY_ = makeSymbol( "*LOCAL-HL-TRANSCRIPT-HISTORY*" );
    $sym6$_READ_TRANSCRIPT_POSITION_ = makeSymbol( "*READ-TRANSCRIPT-POSITION*" );
    $int7$206 = makeInteger( 206 );
    $sym8$_LOCAL_TRANSCRIPT_ = makeSymbol( "*LOCAL-TRANSCRIPT*" );
    $str9$ROLLED = makeString( "ROLLED" );
    $kw10$APPEND = makeKeyword( "APPEND" );
    $kw11$OUTPUT = makeKeyword( "OUTPUT" );
    $str12$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str13$_s__ = makeString( "~s~%" );
    $sym14$_READ_TRANSCRIPT_ = makeSymbol( "*READ-TRANSCRIPT*" );
    $sym15$_MASTER_TRANSCRIPT_ = makeSymbol( "*MASTER-TRANSCRIPT*" );
    $sym16$_LOCAL_HL_TRANSCRIPT_ = makeSymbol( "*LOCAL-HL-TRANSCRIPT*" );
    $str17$cyc_kb__a = makeString( "cyc-kb-~a" );
    $str18$_a_local__a = makeString( "~a-local-~a" );
    $str19$_a_local_hl__a = makeString( "~a-local-hl-~a" );
    $str20$_ = makeString( "." );
    $str21$transcripts = makeString( "transcripts" );
    $sym22$STRINGP = makeSymbol( "STRINGP" );
    $str23$_TS = makeString( ".TS" );
    $str24$_ = makeString( "-" );
    $str25$_ts = makeString( ".ts" );
    $sym26$_COUNT_OPS_TABLE_ = makeSymbol( "*COUNT-OPS-TABLE*" );
    $sym27$CAR = makeSymbol( "CAR" );
    $kw28$INPUT = makeKeyword( "INPUT" );
    $kw29$EOF = makeKeyword( "EOF" );
    $int30$100000 = makeInteger( 100000 );
    $str31$_____s = makeString( "~%~%~s" );
    $str32$_s_is_not_a_stream_or_pathname_st = makeString( "~s is not a stream or pathname string" );
    $str33$__The_file__s_does_not_exist__or_ = makeString( "~%The file ~s does not exist, or contains no operations." );
    $str34$Examining__A = makeString( "Examining ~A" );
    $list35 = ConsesLow.list( makeSymbol( "ENCAPSULATED-CYCLIST" ), makeSymbol( "CYC-IMAGE-ID" ), makeSymbol( "WHEN" ), ConsesLow.cons( makeSymbol( "FUNCTION" ), makeSymbol( "ARGS" ) ) );
    $sym36$FI_CREATE = makeSymbol( "FI-CREATE" );
    $list37 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "EXTERNAL-ID" ) );
    $sym38$FI_RENAME = makeSymbol( "FI-RENAME" );
    $list39 = ConsesLow.list( makeSymbol( "TERM" ), makeSymbol( "NEW-NAME" ) );
    $sym40$FI_KILL = makeSymbol( "FI-KILL" );
    $list41 = ConsesLow.list( makeSymbol( "TERM" ) );
    $str42$____Transcript____S = makeString( ";;; Transcript:  ~S" );
    $str43$______Examined______A = makeString( "~%;;; Examined:    ~A" );
    $str44$______Total_Ops_____S = makeString( "~%;;; Total Ops:   ~S" );
    $str45$______error_during_transcript_ana = makeString( "~%;;; error during transcript analysis: At operation: ~S" );
    $str46$___A = makeString( "~%~A" );
    $list47 = ConsesLow.list( makeSymbol( "TRANSCRIPT-CREATE-LIST" ), makeSymbol( "TRANSCRIPT-RENAME-LIST" ), makeSymbol( "TRANSCRIPT-KILL-LIST" ) );
    $str48$_______S_KILLED = makeString( "~%;;; ~S KILLED" );
    $list49 = ConsesLow.list( makeSymbol( "OP-NUM" ), makeSymbol( "EXTERNAL-ID" ), makeSymbol( "NAME" ), makeSymbol( "WHO" ), makeSymbol( "WHEN" ) );
    $str50$__EXTERNAL_ID__S____A_by__A_at__A = makeString( "~%EXTERNAL-ID ~S : ~A by ~A at ~A" );
    $str51$_______S_RENAMED = makeString( "~%;;; ~S RENAMED" );
    $list52 = ConsesLow.list( makeSymbol( "OP-NUM" ), makeSymbol( "EXTERNAL-ID" ), makeSymbol( "OLD-NAME" ), makeSymbol( "NEW-NAME" ), makeSymbol( "WHO" ), makeSymbol( "WHEN" ) );
    $str53$__EXTERNAL_ID__S____A_to__A_by__A = makeString( "~%EXTERNAL-ID ~S : ~A to ~A by ~A at ~A" );
    $str54$_______S_CREATED = makeString( "~%;;; ~S CREATED" );
    $sym55$_TRANSCRIPT_RENAME_HASH_ = makeSymbol( "*TRANSCRIPT-RENAME-HASH*" );
    $int56$100 = makeInteger( 100 );
    $sym57$_ = makeSymbol( "<" );
    $sym58$FIRST = makeSymbol( "FIRST" );
    $sym59$_TRANSCRIPT_CREATE_HASH_ = makeSymbol( "*TRANSCRIPT-CREATE-HASH*" );
    $str60$transcript_file_not_found = makeString( "transcript file not found" );
    $str61$_A__ = makeString( "~A~%" );
    $sym62$WRITE_SPECIFIC_TRANSCRIPT_FILE_AS_KE_TEXT = makeSymbol( "WRITE-SPECIFIC-TRANSCRIPT-FILE-AS-KE-TEXT" );
    $list63 = ConsesLow.list( makeSymbol( "TRANSCRIPT-FILENAME" ), makeSymbol( "OUTPUT-FILENAME" ) );
    $str64$Generate_a_KE_Text_file_from_a_tr = makeString( "Generate a KE Text file from a transcript and write it to a file." );
    $list65 = ConsesLow.list( ConsesLow.list( makeSymbol( "TRANSCRIPT-FILENAME" ), makeSymbol( "STRINGP" ) ), ConsesLow.list( makeSymbol( "OUTPUT-FILENAME" ), makeSymbol( "STRINGP" ) ) );
    $kw66$ENTER = makeKeyword( "ENTER" );
    $sym67$FI_EDIT = makeSymbol( "FI-EDIT" );
    $list68 = ConsesLow.list( makeSymbol( "OLD-FORMULA" ), makeSymbol( "NEW-FORMULA" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "OLD-MT" ), ConsesLow.list( makeSymbol( "NEW-MT" ), makeSymbol( "OLD-MT" ) ), ConsesLow.list(
        makeSymbol( "STRENGTH" ), makeKeyword( "DEFAULT" ) ), makeSymbol( "DIRECTION" ) );
    $kw69$DEFAULT = makeKeyword( "DEFAULT" );
    $sym70$FI_UNASSERT = makeSymbol( "FI-UNASSERT" );
    $sym71$FI_ASSERT = makeSymbol( "FI-ASSERT" );
    $sym72$FI_FIND_OR_CREATE = makeSymbol( "FI-FIND-OR-CREATE" );
    $str73$ = makeString( "" );
    $str74$Constant__ = makeString( "Constant: " );
    $list75 = ConsesLow.list( makeSymbol( "OLD-NAME" ), makeSymbol( "NEW-NAME" ) );
    $str76$Rename__ = makeString( "Rename: " );
    $str77$_ = makeString( " " );
    $sym78$FI_MERGE = makeSymbol( "FI-MERGE" );
    $list79 = ConsesLow.list( makeSymbol( "KILL-FORT" ), makeSymbol( "KEEP-FORT" ) );
    $str80$Merge__ = makeString( "Merge: " );
    $str81$Kill__ = makeString( "Kill: " );
    $sym82$FI_REASSERT = makeSymbol( "FI-REASSERT" );
    $sym83$FI_BLAST = makeSymbol( "FI-BLAST" );
    $str84$Enter_ = makeString( "Enter." );
    $str85$___The_following_assertion_simula = makeString( ";; The following assertion simulates an fi-reassert. (two of these simulate a repropagate)" );
    $kw86$DELETE = makeKeyword( "DELETE" );
    $str87$Delete_ = makeString( "Delete." );
    $kw88$BLAST = makeKeyword( "BLAST" );
    $str89$Delete_____Simulate_an_fi_blast_ = makeString( "Delete. ;; Simulate an fi-blast." );
    $kw90$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym91$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str92$In_Mt__ = makeString( "In Mt: " );
    $kw93$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str94$Truth_Value___unknown_ = makeString( "Truth Value: :unknown." );
    $const95$DefaultMonotonicPredicate = constant_handles.reader_make_constant_shell( makeString( "DefaultMonotonicPredicate" ) );
    $str96$Truth_Value___default_ = makeString( "Truth Value: :default." );
    $kw97$MONOTONIC = makeKeyword( "MONOTONIC" );
    $str98$Truth_Value___monotonic_ = makeString( "Truth Value: :monotonic." );
    $kw99$FORWARD = makeKeyword( "FORWARD" );
    $str100$Direction___forward_ = makeString( "Direction: :forward." );
    $kw101$BACKWARD = makeKeyword( "BACKWARD" );
    $str102$Direction___backward_ = makeString( "Direction: :backward." );
    $kw103$CODE = makeKeyword( "CODE" );
    $str104$Direction___code_ = makeString( "Direction: :code." );
    $str105$_A___A_ = makeString( "~A: ~A." );
    $str106$f___A_ = makeString( "f: ~A." );
    $sym107$FI_TIMESTAMP_ASSERTION = makeSymbol( "FI-TIMESTAMP-ASSERTION" );
    $sym108$FI_TIMESTAMP_CONSTANT = makeSymbol( "FI-TIMESTAMP-CONSTANT" );
    $sym109$FI_CREATE_SKOLEM = makeSymbol( "FI-CREATE-SKOLEM" );
    $str110$___This_skolem_creation_should_be = makeString( ";; This skolem creation should be implicit in the following assertion and can safely be deleted." );
    $str111$____S = makeString( ";; ~S" );
    $str112$___Don_t_know_how_convert_next_li = makeString( ";; Don't know how convert next line" );
    $str113$Internal_Error____A__for_operatio = makeString( "Internal Error: \"~A\" for operation: ~S" );
    $str114$_ = makeString( ":" );
    $str115$_ = makeString( "'" );
    $kw116$HP = makeKeyword( "HP" );
    $kw117$NAT = makeKeyword( "NAT" );
    $str118$TLReifiedNatFn = makeString( "TLReifiedNatFn" );
    $str119$TLAssertionFn = makeString( "TLAssertionFn" );
    $const120$ist = constant_handles.reader_make_constant_shell( makeString( "ist" ) );
    $str121$TLVariableFn = makeString( "TLVariableFn" );
    $str122$_VAR = makeString( "?VAR" );
    $str123$_ = makeString( "(" );
    $str124$___ = makeString( " . " );
    $str125$_ = makeString( ")" );
    $sym126$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $str127$_ = makeString( "\"" );
    $str128$__ = makeString( "\\\"" );
    $str129$___ = makeString( "\\\\\"" );
  }
}
/*
 * 
 * Total time: 996 ms
 * 
 */