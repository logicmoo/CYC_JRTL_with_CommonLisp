package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class subl_macro_promotions
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.subl_macro_promotions";
  public static final String myFingerPrint = "2d74906a9eae326f593826ff5f5661436bd73add795d00b96421e3d974f9d190";
  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 1480L)
  public static SubLSymbol $catch_error_message_target$;
  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 3664L)
  public static SubLSymbol $within_with_timeout$;
  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 3818L)
  public static SubLSymbol $with_timeout_nesting_depth$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$PROGN;
  private static final SubLSymbol $sym2$DEFLEXICAL;
  private static final SubLSymbol $sym3$FIF;
  private static final SubLSymbol $sym4$BOUNDP;
  private static final SubLSymbol $sym5$QUOTE;
  private static final SubLSymbol $sym6$DECLARE_DEFGLOBAL;
  private static final SubLSymbol $kw7$INITIALIZATION_TYPE;
  private static final SubLSymbol $kw8$WORLD;
  private static final SubLSymbol $sym9$_CATCH_ERROR_MESSAGE_TARGET_;
  private static final SubLString $str10$ERROR;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$CCATCH;
  private static final SubLSymbol $sym13$WITH_ERROR_HANDLER;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $sym16$WITH_TIMEOUT_VIA_INTERRUPT;
  private static final SubLSymbol $sym17$TAG;
  private static final SubLSymbol $sym18$TIMER;
  private static final SubLSymbol $sym19$CLET;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$CUNWIND_PROTECT;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$CSETQ;
  private static final SubLSymbol $sym25$WITH_TIMEOUT_START_TIMER;
  private static final SubLSymbol $sym26$WITH_TIMEOUT_STOP_TIMER;
  private static final SubLSymbol $sym27$WITH_TIMEOUT_MAKE_TAG;
  private static final SubLSymbol $sym28$WITH_TIMEOUT;
  private static final SubLSymbol $sym29$WITH_TIMEOUT_THROW;
  private static final SubLList $list30;
  private static final SubLList $list31;
  private static final SubLSymbol $kw32$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw33$TIMEOUT;
  private static final SubLSymbol $kw34$ACCESS_MODE;
  private static final SubLSymbol $kw35$PUBLIC;
  private static final SubLSymbol $sym36$OPEN_TCP_STREAM_WITH_TIMEOUT;
  private static final SubLSymbol $sym37$PWHEN;
  private static final SubLSymbol $sym38$VALIDATE_TCP_CONNECTION;
  private static final SubLSymbol $sym39$CLOSE;
  private static final SubLSymbol $sym40$WITH_TCP_CONNECTION_WITH_TIMEOUT;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$WITH_TCP_CONNECTION;
  private static final SubLString $str43$Connection_to__A__A_timed_out_;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$LISTP;
  private static final SubLSymbol $sym46$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym47$CMULTIPLE_VALUE_SETQ;
  private static final SubLList $list48;
  private static final SubLSymbol $sym49$WITH_SPACE_PROFILING;
  private static final SubLList $list50;
  private static final SubLList $list51;
  private static final SubLSymbol $kw52$STREAM;
  private static final SubLSymbol $sym53$_STANDARD_OUTPUT_;
  private static final SubLSymbol $sym54$WITH_SPACE_PROFILING_SL2C;
  private static final SubLSymbol $sym55$SPACE_INFO;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$REMOVE_SPACE_PROBE;
  private static final SubLSymbol $sym58$_INTERPRET_CSPACE_RESULTS;
  private static final SubLList $list59;
  private static final SubLSymbol $sym60$STRINGP;
  private static final SubLList $list61;

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 848L)
  public static SubLObject defglobal(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject variable = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    variable = current.first();
    current = current.rest();
    final SubLObject initialization = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list0 );
    current = current.rest();
    final SubLObject documentation = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list0 );
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym2$DEFLEXICAL, variable, ConsesLow.list( $sym3$FIF, ConsesLow.list( $sym4$BOUNDP, ConsesLow.list( $sym5$QUOTE, variable ) ), variable, initialization ),
          ConsesLow.append( ( NIL != documentation ) ? ConsesLow.list( documentation ) : NIL, NIL ) ), ConsesLow.list( $sym6$DECLARE_DEFGLOBAL, ConsesLow.list( $sym5$QUOTE, variable ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 1266L)
  public static SubLObject declare_defglobal(final SubLObject global)
  {
    Symbols.put( global, $kw7$INITIALIZATION_TYPE, $kw8$WORLD );
    return global;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 1712L)
  public static SubLObject catch_error_message(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list11 );
    var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym12$CCATCH, $sym9$_CATCH_ERROR_MESSAGE_TARGET_, var, ConsesLow.listS( $sym13$WITH_ERROR_HANDLER, $list14, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list11 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 2030L)
  public static SubLObject catch_error_message_handler()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Dynamic.sublisp_throw( $catch_error_message_target$.getGlobalValue(), Errors.$error_message$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 2200L)
  public static SubLObject with_timeout(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject time = NIL;
    SubLObject timed_out_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    time = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    timed_out_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym16$WITH_TIMEOUT_VIA_INTERRUPT, ConsesLow.list( time, timed_out_var ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 3028L)
  public static SubLObject with_timeout_via_interrupt(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject time = NIL;
    SubLObject timed_out_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    time = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    timed_out_var = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return with_timeout_internal( time, timed_out_var, body );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 3205L)
  public static SubLObject with_timeout_internal(final SubLObject time, final SubLObject timed_out_var, final SubLObject body)
  {
    final SubLObject tag = $sym17$TAG;
    final SubLObject timer = $sym18$TIMER;
    return ConsesLow.list( $sym19$CLET, ConsesLow.list( reader.bq_cons( tag, $list20 ) ), ConsesLow.list( $sym12$CCATCH, tag, timed_out_var, ConsesLow.list( $sym19$CLET, ConsesLow.list( $list21, timer ), ConsesLow.list(
        $sym22$CUNWIND_PROTECT, ConsesLow.listS( $sym19$CLET, $list23, ConsesLow.list( $sym24$CSETQ, timer, ConsesLow.list( $sym25$WITH_TIMEOUT_START_TIMER, time, tag ) ), ConsesLow.append( body, NIL ) ), ConsesLow.list(
            $sym26$WITH_TIMEOUT_STOP_TIMER, timer ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 3904L)
  public static SubLObject with_timeout_make_tag()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return ConsesLow.cons( $sym28$WITH_TIMEOUT, $with_timeout_nesting_depth$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 4034L)
  public static SubLObject with_timeout_start_timer(final SubLObject time, final SubLObject tag)
  {
    Time.schedule_current_process_for_timeout( tag, time );
    return tag;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 5290L)
  public static SubLObject timeout_tag_nesting_depth(final SubLObject tag)
  {
    return tag.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 5358L)
  public static SubLObject with_timeout_stop_timer(final SubLObject timer)
  {
    Time.ensure_current_process_timeout_is_cancelled();
    return timer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 5650L)
  public static SubLObject with_timeout_timer_thread(final SubLObject client, final SubLObject time, final SubLObject tag, final SubLObject client_semaphore, final SubLObject timer_semaphore)
  {
    Semaphores.semaphore_signal( timer_semaphore );
    Semaphores.semaphore_wait( client_semaphore );
    Threads.sleep( time );
    with_timeout_signal_timeout( client, tag );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 6118L)
  public static SubLObject with_timeout_signal_timeout(final SubLObject client, final SubLObject tag)
  {
    if( NIL != Threads.valid_process_p( client ) )
    {
      return subl_promotions.interrupt_process_with_args( client, $sym29$WITH_TIMEOUT_THROW, ConsesLow.list( tag ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 6313L)
  public static SubLObject with_timeout_throw(final SubLObject tag)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $within_with_timeout$.getDynamicValue( thread ) )
    {
      Dynamic.sublisp_throw( tag, T );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 6418L)
  public static SubLObject with_tcp_connection(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject bi_stream = NIL;
    SubLObject host = NIL;
    SubLObject port = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    bi_stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    host = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    port = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list30 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list30 );
      if( NIL == conses_high.member( current_$1, $list31, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw32$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list30 );
    }
    final SubLObject timeout_tail = cdestructuring_bind.property_list_member( $kw33$TIMEOUT, current );
    final SubLObject timeout = ( NIL != timeout_tail ) ? conses_high.cadr( timeout_tail ) : NIL;
    final SubLObject access_mode_tail = cdestructuring_bind.property_list_member( $kw34$ACCESS_MODE, current );
    final SubLObject access_mode = ( NIL != access_mode_tail ) ? conses_high.cadr( access_mode_tail ) : $kw35$PUBLIC;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.list( $sym19$CLET, ConsesLow.list( bi_stream ), ConsesLow.list( $sym22$CUNWIND_PROTECT, ConsesLow.list( $sym1$PROGN, ConsesLow.list( $sym24$CSETQ, bi_stream, ConsesLow.list(
        $sym36$OPEN_TCP_STREAM_WITH_TIMEOUT, host, port, timeout, access_mode ) ), ConsesLow.listS( $sym37$PWHEN, ConsesLow.list( $sym38$VALIDATE_TCP_CONNECTION, bi_stream, host, port ), ConsesLow.append( body,
            NIL ) ) ), ConsesLow.list( $sym37$PWHEN, bi_stream, ConsesLow.list( $sym39$CLOSE, bi_stream ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 7115L)
  public static SubLObject with_tcp_connection_with_timeout(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject bi_stream = NIL;
    SubLObject host = NIL;
    SubLObject port = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    bi_stream = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    host = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list30 );
    port = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list30 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list30 );
      if( NIL == conses_high.member( current_$2, $list31, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw32$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list30 );
    }
    final SubLObject timeout_tail = cdestructuring_bind.property_list_member( $kw33$TIMEOUT, current );
    final SubLObject timeout = ( NIL != timeout_tail ) ? conses_high.cadr( timeout_tail ) : NIL;
    final SubLObject access_mode_tail = cdestructuring_bind.property_list_member( $kw34$ACCESS_MODE, current );
    final SubLObject access_mode = ( NIL != access_mode_tail ) ? conses_high.cadr( access_mode_tail ) : $kw35$PUBLIC;
    final SubLObject body;
    current = ( body = temp );
    access_macros.defmacro_obsolete_warning( $sym40$WITH_TCP_CONNECTION_WITH_TIMEOUT, $list41 );
    return ConsesLow.listS( $sym42$WITH_TCP_CONNECTION, ConsesLow.list( bi_stream, host, port, $kw33$TIMEOUT, timeout, $kw34$ACCESS_MODE, access_mode ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 7402L)
  public static SubLObject validate_tcp_connection(final SubLObject channel, final SubLObject host, final SubLObject port)
  {
    if( NIL == channel )
    {
      return Errors.error( $str43$Connection_to__A__A_timed_out_, host, port );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 7656L)
  public static SubLObject cmultiple_value_setq(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject v_variables = NIL;
    SubLObject expression = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    v_variables = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list44 );
    expression = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list44 );
      return NIL;
    }
    assert NIL != Types.listp( v_variables ) : v_variables;
    if( NIL == v_variables )
    {
      return ConsesLow.list( $sym1$PROGN, expression );
    }
    SubLObject parallel_variables = NIL;
    SubLObject variable_assignments = NIL;
    SubLObject cdolist_list_var = v_variables;
    SubLObject variable = NIL;
    variable = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      variable_assignments = ConsesLow.cons( variable, variable_assignments );
      final SubLObject parallel_variable = meta_macros.make_temp_var( variable );
      parallel_variables = ConsesLow.cons( parallel_variable, parallel_variables );
      variable_assignments = ConsesLow.cons( parallel_variable, variable_assignments );
      cdolist_list_var = cdolist_list_var.rest();
      variable = cdolist_list_var.first();
    }
    return ConsesLow.list( $sym46$CMULTIPLE_VALUE_BIND, Sequences.nreverse( parallel_variables ), expression, reader.bq_cons( $sym24$CSETQ, ConsesLow.append( Sequences.nreverse( variable_assignments ), NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 8742L)
  public static SubLObject with_space_profiling(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list50 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list50 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list50 );
      if( NIL == conses_high.member( current_$3, $list51, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw32$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list50 );
    }
    final SubLObject stream_tail = cdestructuring_bind.property_list_member( $kw52$STREAM, current );
    final SubLObject stream = ( NIL != stream_tail ) ? conses_high.cadr( stream_tail ) : $sym53$_STANDARD_OUTPUT_;
    final SubLObject body;
    current = ( body = temp );
    return with_space_profiling_sl2c( stream, body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 9444L)
  public static SubLObject with_space_profiling_sl2c(final SubLObject stream, final SubLObject body)
  {
    final SubLObject space_info = $sym55$SPACE_INFO;
    return ConsesLow.list( $sym19$CLET, ConsesLow.list( space_info ), ConsesLow.list( $sym22$CUNWIND_PROTECT, ConsesLow.list( $sym1$PROGN, ConsesLow.listS( $sym24$CSETQ, space_info, $list56 ), reader.bq_cons(
        $sym1$PROGN, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym37$PWHEN, space_info, ConsesLow.list( $sym57$REMOVE_SPACE_PROBE, space_info ), ConsesLow.list( $sym58$_INTERPRET_CSPACE_RESULTS, space_info,
            stream ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/subl-macro-promotions.lisp", position = 9964L)
  public static SubLObject code_comment(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject comment_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list59 );
    comment_string = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list59 );
      return NIL;
    }
    assert NIL != Types.stringp( comment_string ) : comment_string;
    return $list61;
  }

  public static SubLObject declare_subl_macro_promotions_file()
  {
    SubLFiles.declareMacro( me, "defglobal", "DEFGLOBAL" );
    SubLFiles.declareFunction( me, "declare_defglobal", "DECLARE-DEFGLOBAL", 1, 0, false );
    SubLFiles.declareMacro( me, "catch_error_message", "CATCH-ERROR-MESSAGE" );
    SubLFiles.declareFunction( me, "catch_error_message_handler", "CATCH-ERROR-MESSAGE-HANDLER", 0, 0, false );
    SubLFiles.declareMacro( me, "with_timeout", "WITH-TIMEOUT" );
    SubLFiles.declareMacro( me, "with_timeout_via_interrupt", "WITH-TIMEOUT-VIA-INTERRUPT" );
    SubLFiles.declareFunction( me, "with_timeout_internal", "WITH-TIMEOUT-INTERNAL", 3, 0, false );
    SubLFiles.declareFunction( me, "with_timeout_make_tag", "WITH-TIMEOUT-MAKE-TAG", 0, 0, false );
    SubLFiles.declareFunction( me, "with_timeout_start_timer", "WITH-TIMEOUT-START-TIMER", 2, 0, false );
    SubLFiles.declareFunction( me, "timeout_tag_nesting_depth", "TIMEOUT-TAG-NESTING-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "with_timeout_stop_timer", "WITH-TIMEOUT-STOP-TIMER", 1, 0, false );
    SubLFiles.declareFunction( me, "with_timeout_timer_thread", "WITH-TIMEOUT-TIMER-THREAD", 5, 0, false );
    SubLFiles.declareFunction( me, "with_timeout_signal_timeout", "WITH-TIMEOUT-SIGNAL-TIMEOUT", 2, 0, false );
    SubLFiles.declareFunction( me, "with_timeout_throw", "WITH-TIMEOUT-THROW", 1, 0, false );
    SubLFiles.declareMacro( me, "with_tcp_connection", "WITH-TCP-CONNECTION" );
    SubLFiles.declareMacro( me, "with_tcp_connection_with_timeout", "WITH-TCP-CONNECTION-WITH-TIMEOUT" );
    SubLFiles.declareFunction( me, "validate_tcp_connection", "VALIDATE-TCP-CONNECTION", 3, 0, false );
    SubLFiles.declareMacro( me, "cmultiple_value_setq", "CMULTIPLE-VALUE-SETQ" );
    SubLFiles.declareMacro( me, "with_space_profiling", "WITH-SPACE-PROFILING" );
    SubLFiles.declareFunction( me, "with_space_profiling_sl2c", "WITH-SPACE-PROFILING-SL2C", 2, 0, false );
    SubLFiles.declareMacro( me, "code_comment", "CODE-COMMENT" );
    return NIL;
  }

  public static SubLObject init_subl_macro_promotions_file()
  {
    $catch_error_message_target$ = SubLFiles.deflexical( "*CATCH-ERROR-MESSAGE-TARGET*", maybeDefault( $sym9$_CATCH_ERROR_MESSAGE_TARGET_, $catch_error_message_target$, () -> ( Symbols.make_symbol( $str10$ERROR ) ) ) );
    $within_with_timeout$ = SubLFiles.defparameter( "*WITHIN-WITH-TIMEOUT*", NIL );
    $with_timeout_nesting_depth$ = SubLFiles.defparameter( "*WITH-TIMEOUT-NESTING-DEPTH*", ZERO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_subl_macro_promotions_file()
  {
    declare_defglobal( $sym9$_CATCH_ERROR_MESSAGE_TARGET_ );
    access_macros.register_macro_helper( $sym27$WITH_TIMEOUT_MAKE_TAG, $sym28$WITH_TIMEOUT );
    access_macros.register_macro_helper( $sym25$WITH_TIMEOUT_START_TIMER, $sym28$WITH_TIMEOUT );
    access_macros.register_macro_helper( $sym26$WITH_TIMEOUT_STOP_TIMER, $sym28$WITH_TIMEOUT );
    access_macros.register_macro_helper( $sym38$VALIDATE_TCP_CONNECTION, $sym42$WITH_TCP_CONNECTION );
    meta_macros.declare_indention_pattern( $sym47$CMULTIPLE_VALUE_SETQ, $list48 );
    access_macros.register_external_symbol( $sym49$WITH_SPACE_PROFILING );
    access_macros.register_macro_helper( $sym54$WITH_SPACE_PROFILING_SL2C, $sym49$WITH_SPACE_PROFILING );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_subl_macro_promotions_file();
  }

  @Override
  public void initializeVariables()
  {
    init_subl_macro_promotions_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_subl_macro_promotions_file();
  }
  static
  {
    me = new subl_macro_promotions();
    $catch_error_message_target$ = null;
    $within_with_timeout$ = null;
    $with_timeout_nesting_depth$ = null;
    $list0 = ConsesLow.list( makeSymbol( "VARIABLE" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "INITIALIZATION" ), makeSymbol( "DOCUMENTATION" ) );
    $sym1$PROGN = makeSymbol( "PROGN" );
    $sym2$DEFLEXICAL = makeSymbol( "DEFLEXICAL" );
    $sym3$FIF = makeSymbol( "FIF" );
    $sym4$BOUNDP = makeSymbol( "BOUNDP" );
    $sym5$QUOTE = makeSymbol( "QUOTE" );
    $sym6$DECLARE_DEFGLOBAL = makeSymbol( "DECLARE-DEFGLOBAL" );
    $kw7$INITIALIZATION_TYPE = makeKeyword( "INITIALIZATION-TYPE" );
    $kw8$WORLD = makeKeyword( "WORLD" );
    $sym9$_CATCH_ERROR_MESSAGE_TARGET_ = makeSymbol( "*CATCH-ERROR-MESSAGE-TARGET*" );
    $str10$ERROR = makeString( "ERROR" );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym12$CCATCH = makeSymbol( "CCATCH" );
    $sym13$WITH_ERROR_HANDLER = makeSymbol( "WITH-ERROR-HANDLER" );
    $list14 = ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" ) );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "TIME" ), makeSymbol( "TIMED-OUT-VAR" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym16$WITH_TIMEOUT_VIA_INTERRUPT = makeSymbol( "WITH-TIMEOUT-VIA-INTERRUPT" );
    $sym17$TAG = makeUninternedSymbol( "TAG" );
    $sym18$TIMER = makeUninternedSymbol( "TIMER" );
    $sym19$CLET = makeSymbol( "CLET" );
    $list20 = ConsesLow.list( ConsesLow.list( makeSymbol( "WITH-TIMEOUT-MAKE-TAG" ) ) );
    $list21 = ConsesLow.list( makeSymbol( "*WITHIN-WITH-TIMEOUT*" ), T );
    $sym22$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $list23 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITH-TIMEOUT-NESTING-DEPTH*" ), ConsesLow.list( makeSymbol( "+" ), ONE_INTEGER, makeSymbol( "*WITH-TIMEOUT-NESTING-DEPTH*" ) ) ) );
    $sym24$CSETQ = makeSymbol( "CSETQ" );
    $sym25$WITH_TIMEOUT_START_TIMER = makeSymbol( "WITH-TIMEOUT-START-TIMER" );
    $sym26$WITH_TIMEOUT_STOP_TIMER = makeSymbol( "WITH-TIMEOUT-STOP-TIMER" );
    $sym27$WITH_TIMEOUT_MAKE_TAG = makeSymbol( "WITH-TIMEOUT-MAKE-TAG" );
    $sym28$WITH_TIMEOUT = makeSymbol( "WITH-TIMEOUT" );
    $sym29$WITH_TIMEOUT_THROW = makeSymbol( "WITH-TIMEOUT-THROW" );
    $list30 = ConsesLow.list( ConsesLow.list( makeSymbol( "BI-STREAM" ), makeSymbol( "HOST" ), makeSymbol( "PORT" ), makeSymbol( "&KEY" ), makeSymbol( "TIMEOUT" ), ConsesLow.list( makeSymbol( "ACCESS-MODE" ),
        makeKeyword( "PUBLIC" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list31 = ConsesLow.list( makeKeyword( "TIMEOUT" ), makeKeyword( "ACCESS-MODE" ) );
    $kw32$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw33$TIMEOUT = makeKeyword( "TIMEOUT" );
    $kw34$ACCESS_MODE = makeKeyword( "ACCESS-MODE" );
    $kw35$PUBLIC = makeKeyword( "PUBLIC" );
    $sym36$OPEN_TCP_STREAM_WITH_TIMEOUT = makeSymbol( "OPEN-TCP-STREAM-WITH-TIMEOUT" );
    $sym37$PWHEN = makeSymbol( "PWHEN" );
    $sym38$VALIDATE_TCP_CONNECTION = makeSymbol( "VALIDATE-TCP-CONNECTION" );
    $sym39$CLOSE = makeSymbol( "CLOSE" );
    $sym40$WITH_TCP_CONNECTION_WITH_TIMEOUT = makeSymbol( "WITH-TCP-CONNECTION-WITH-TIMEOUT" );
    $list41 = ConsesLow.list( makeSymbol( "WITH-TCP-CONNECTION" ) );
    $sym42$WITH_TCP_CONNECTION = makeSymbol( "WITH-TCP-CONNECTION" );
    $str43$Connection_to__A__A_timed_out_ = makeString( "Connection to ~A:~A timed out." );
    $list44 = ConsesLow.list( makeSymbol( "VARIABLES" ), makeSymbol( "EXPRESSION" ) );
    $sym45$LISTP = makeSymbol( "LISTP" );
    $sym46$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym47$CMULTIPLE_VALUE_SETQ = makeSymbol( "CMULTIPLE-VALUE-SETQ" );
    $list48 = ConsesLow.list( makeSymbol( "VARIABLES" ), makeSymbol( "EXPRESSION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym49$WITH_SPACE_PROFILING = makeSymbol( "WITH-SPACE-PROFILING" );
    $list50 = ConsesLow.list( ConsesLow.list( makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "STREAM" ), ConsesLow.list( makeSymbol( "QUOTE" ), makeSymbol( "*STANDARD-OUTPUT*" ) ) ) ), makeSymbol( "&BODY" ),
        makeSymbol( "BODY" ) );
    $list51 = ConsesLow.list( makeKeyword( "STREAM" ) );
    $kw52$STREAM = makeKeyword( "STREAM" );
    $sym53$_STANDARD_OUTPUT_ = makeSymbol( "*STANDARD-OUTPUT*" );
    $sym54$WITH_SPACE_PROFILING_SL2C = makeSymbol( "WITH-SPACE-PROFILING-SL2C" );
    $sym55$SPACE_INFO = makeUninternedSymbol( "SPACE-INFO" );
    $list56 = ConsesLow.list( ConsesLow.list( makeSymbol( "ADD-SPACE-PROBE", "SUBLISP" ) ) );
    $sym57$REMOVE_SPACE_PROBE = makeSymbol( "REMOVE-SPACE-PROBE", "SUBLISP" );
    $sym58$_INTERPRET_CSPACE_RESULTS = makeSymbol( "%INTERPRET-CSPACE-RESULTS", "SUBLISP" );
    $list59 = ConsesLow.list( makeSymbol( "COMMENT-STRING" ) );
    $sym60$STRINGP = makeSymbol( "STRINGP" );
    $list61 = ConsesLow.list( makeSymbol( "PROGN" ) );
  }
}
/*
 * 
 * Total time: 255 ms
 * 
 */