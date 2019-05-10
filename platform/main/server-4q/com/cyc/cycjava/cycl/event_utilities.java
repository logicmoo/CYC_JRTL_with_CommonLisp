package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class event_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.event_utilities";
  public static final String myFingerPrint = "3b30838fbe1de9ef766645eb900981ff4d9f27bb6cfaa17c7a4fd3228b7e3b0f";
  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 1102L)
  private static SubLSymbol $generic_event_dispatcher_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 1320L)
  private static SubLSymbol $generic_event_dispatcher_applications$;
  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 1594L)
  private static SubLSymbol $generic_event_dispatcher_process$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$PARENT;
  private static final SubLSymbol $kw4$DOCSTRING;
  private static final SubLSymbol $kw5$HIERARCHY;
  private static final SubLString $str6$Must_specify_a_parent_class_;
  private static final SubLSymbol $sym7$REGISTER_EVENT_CLASS;
  private static final SubLSymbol $sym8$_GENERIC_EVENT_DISPATCHER_LOCK_;
  private static final SubLString $str9$Generic_Event_Dispatcher_Process_;
  private static final SubLSymbol $sym10$_GENERIC_EVENT_DISPATCHER_APPLICATIONS_;
  private static final SubLSymbol $sym11$_GENERIC_EVENT_DISPATCHER_PROCESS_;
  private static final SubLString $str12$Generic_Event_Dispatcher_Process;
  private static final SubLSymbol $sym13$DISPATCH_EVENTS_FOR_GENERIC_EVENT_DISPATCHER;
  private static final SubLSymbol $kw14$TERMINATED;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLSymbol $kw17$BROKER;
  private static final SubLSymbol $kw18$POSTFIX;
  private static final SubLString $str19$_EVENT_DISPATCHER;
  private static final SubLString $str20$;
  private static final SubLString $str21$_LOCK;
  private static final SubLString $str22$_Lock;
  private static final SubLString $str23$START_;
  private static final SubLString $str24$STOP_;
  private static final SubLString $str25$_RUNNING_;
  private static final SubLString $str26$ENSURE_;
  private static final SubLString $str27$_RUNNING;
  private static final SubLString $str28$_LISTENERS;
  private static final SubLString $str29$REGISTER_LISTENER_WITH_;
  private static final SubLString $str30$DEREGISTER_LISTENER_WITH_;
  private static final SubLSymbol $sym31$PROGN;
  private static final SubLSymbol $sym32$DEFLEXICAL_PRIVATE;
  private static final SubLSymbol $sym33$MAKE_LOCK;
  private static final SubLSymbol $sym34$DEFGLOBAL_PRIVATE;
  private static final SubLSymbol $sym35$DEFINE_PUBLIC;
  private static final SubLSymbol $sym36$RET;
  private static final SubLSymbol $sym37$START_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION;
  private static final SubLSymbol $sym38$QUOTE;
  private static final SubLSymbol $sym39$STOP_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION;
  private static final SubLSymbol $sym40$GENERIC_EVENT_DISPATCHER_PROCESS_RUNNING_FOR_APPLICATION_P;
  private static final SubLSymbol $sym41$PUNLESS;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$LISTENER_VAR;
  private static final SubLSymbol $sym44$WITH_LOCK_HELD;
  private static final SubLSymbol $sym45$FIND;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$CPUSH;
  private static final SubLSymbol $sym48$PWHEN;
  private static final SubLSymbol $sym49$REGISTER_EVENT_LISTENER;
  private static final SubLSymbol $sym50$LISTENER_VAR;
  private static final SubLSymbol $sym51$CSETQ;
  private static final SubLSymbol $sym52$REMOVE;
  private static final SubLSymbol $sym53$DEREGISTER_EVENT_LISTENER;
  private static final SubLString $str54$_;
  private static final SubLSymbol $kw55$PROTECTED;
  private static final SubLSymbol $sym56$DEFINE_PROTECTED;
  private static final SubLSymbol $kw57$PUBLIC;
  private static final SubLSymbol $kw58$PRIVATE;
  private static final SubLSymbol $sym59$DEFINE_PRIVATE;
  private static final SubLString $str60$Unknown_privacy_level__S____not_o;
  private static final SubLString $str61$_RETRIEVE_;
  private static final SubLSymbol $kw62$EVENT_HANDLER_REGISTERED;
  private static final SubLSymbol $kw63$EVENT_HANDLER_DEREGISTERED;
  private static final SubLList $list64;
  private static final SubLSymbol $sym65$CHECK_TYPE;
  private static final SubLList $list66;
  private static final SubLSymbol $sym67$EVENT_CLASS;
  private static final SubLSymbol $sym68$EVENT_IS_HANDLER_REGISTRATION_EVENT_;
  private static final SubLSymbol $sym69$ERROR;
  private static final SubLString $str70$Event__S_is_of_type__S__not__S_;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLSymbol $kw73$PRIVACY_LEVEL;
  private static final SubLSymbol $sym74$EVENT;
  private static final SubLSymbol $sym75$WITH_VALIDATED_EVENT_TYPE;
  private static final SubLSymbol $sym76$GETF;
  private static final SubLSymbol $sym77$EVENT_MESSAGE;

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 811L)
  public static SubLObject declare_event_class(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject class_key = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    class_key = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject parent_tail = cdestructuring_bind.property_list_member( $kw3$PARENT, current );
    final SubLObject parent = ( NIL != parent_tail ) ? conses_high.cadr( parent_tail ) : NIL;
    final SubLObject docstring_tail = cdestructuring_bind.property_list_member( $kw4$DOCSTRING, current );
    final SubLObject docstring = ( NIL != docstring_tail ) ? conses_high.cadr( docstring_tail ) : NIL;
    final SubLObject hierarchy_tail = cdestructuring_bind.property_list_member( $kw5$HIERARCHY, current );
    final SubLObject hierarchy = ( NIL != hierarchy_tail ) ? conses_high.cadr( hierarchy_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    if( NIL == parent )
    {
      Errors.error( $str6$Must_specify_a_parent_class_ );
    }
    return ConsesLow.list( $sym7$REGISTER_EVENT_CLASS, class_key, parent, hierarchy );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 1654L)
  public static SubLObject generic_event_dispatcher_process_running_for_application_p(final SubLObject app_symbol)
  {
    if( NIL != generic_event_dispatcher_process_running_p() )
    {
      SubLObject known_applicationP = NIL;
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $generic_event_dispatcher_lock$.getGlobalValue() );
        known_applicationP = bag.bag_memberP( app_symbol, $generic_event_dispatcher_applications$.getGlobalValue() );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $generic_event_dispatcher_lock$.getGlobalValue() );
        }
      }
      return known_applicationP;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 2048L)
  public static SubLObject generic_event_dispatcher_process()
  {
    return $generic_event_dispatcher_process$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 2147L)
  public static SubLObject start_generic_event_dispatcher_process_for_application(final SubLObject app_symbol)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $generic_event_dispatcher_lock$.getGlobalValue() );
      if( NIL == bag.bag_add( app_symbol, $generic_event_dispatcher_applications$.getGlobalValue() ) )
      {
        generic_event_dispatcher_register_application_listeners( Symbols.symbol_value( app_symbol ), event_broker.core_event_broker() );
      }
      if( NIL == generic_event_dispatcher_process_running_p() )
      {
        start_generic_event_dispatcher_process();
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $generic_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return $generic_event_dispatcher_process$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 2629L)
  public static SubLObject stop_generic_event_dispatcher_process_for_application(final SubLObject app_symbol)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $generic_event_dispatcher_lock$.getGlobalValue() );
      bag.bag_remove( app_symbol, $generic_event_dispatcher_applications$.getGlobalValue() );
      if( NIL == bag.bag_memberP( app_symbol, $generic_event_dispatcher_applications$.getGlobalValue() ) )
      {
        generic_event_dispatcher_deregister_application_listeners( Symbols.symbol_value( app_symbol ), event_broker.core_event_broker() );
      }
      if( NIL != bag.bag_emptyP( $generic_event_dispatcher_applications$.getGlobalValue() ) )
      {
        stop_generic_event_dispatcher_process();
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $generic_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return $generic_event_dispatcher_process$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 3191L)
  public static SubLObject ensure_generic_event_dispatcher_process_running_for_application(final SubLObject app_symbol)
  {
    if( NIL == generic_event_dispatcher_process_running_for_application_p( app_symbol ) )
    {
      start_generic_event_dispatcher_process_for_application( app_symbol );
    }
    return $generic_event_dispatcher_process$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 3487L)
  public static SubLObject generic_event_dispatcher_process_running_p()
  {
    return makeBoolean( NIL != $generic_event_dispatcher_process$.getGlobalValue() && NIL != Threads.valid_process_p( $generic_event_dispatcher_process$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 3689L)
  public static SubLObject start_generic_event_dispatcher_process()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $generic_event_dispatcher_lock$.getGlobalValue() );
      if( NIL != generic_event_dispatcher_process_running_p() )
      {
        stop_generic_event_dispatcher_process();
      }
      $generic_event_dispatcher_process$.setGlobalValue( process_utilities.make_cyc_server_process( $str12$Generic_Event_Dispatcher_Process, $sym13$DISPATCH_EVENTS_FOR_GENERIC_EVENT_DISPATCHER ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $generic_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return $generic_event_dispatcher_process$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 4122L)
  public static SubLObject stop_generic_event_dispatcher_process()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $generic_event_dispatcher_lock$.getGlobalValue() );
      if( NIL != generic_event_dispatcher_process_running_p() )
      {
        Threads.kill_process( $generic_event_dispatcher_process$.getGlobalValue() );
        $generic_event_dispatcher_process$.setGlobalValue( NIL );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $generic_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return $generic_event_dispatcher_process$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 4443L)
  public static SubLObject ensure_generic_event_dispatcher_process_running()
  {
    if( NIL == generic_event_dispatcher_process_running_p() )
    {
      start_generic_event_dispatcher_process();
    }
    return $generic_event_dispatcher_process$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 4657L)
  public static SubLObject dispatch_events_for_generic_event_dispatcher()
  {
    final SubLObject lock = $generic_event_dispatcher_lock$.getGlobalValue();
    final SubLObject broker = event_broker.core_event_broker();
    SubLObject release = NIL;
    Label_0114:
    {
      try
      {
        release = Locks.seize_lock( lock );
        SubLObject cdolist_list_var = bag.bag_unique_element_list( $generic_event_dispatcher_applications$.getGlobalValue() );
        SubLObject app_symbol = NIL;
        app_symbol = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          generic_event_dispatcher_register_application_listeners( Symbols.symbol_value( app_symbol ), broker );
          cdolist_list_var = cdolist_list_var.rest();
          app_symbol = cdolist_list_var.first();
        }
        break Label_0114;
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
    }
    try
    {
      while ( true)
      {
        event_broker.receive_event( broker );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        SubLObject release_$2 = NIL;
        try
        {
          release_$2 = Locks.seize_lock( lock );
          SubLObject cdolist_list_var2 = bag.bag_unique_element_list( $generic_event_dispatcher_applications$.getGlobalValue() );
          SubLObject app_symbol2 = NIL;
          app_symbol2 = cdolist_list_var2.first();
          while ( NIL != cdolist_list_var2)
          {
            generic_event_dispatcher_deregister_application_listeners( Symbols.symbol_value( app_symbol2 ), broker );
            cdolist_list_var2 = cdolist_list_var2.rest();
            app_symbol2 = cdolist_list_var2.first();
          }
        }
        finally
        {
          if( NIL != release_$2 )
          {
            Locks.release_lock( lock );
          }
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 5386L)
  public static SubLObject generic_event_dispatcher_register_application_listeners(final SubLObject listeners, final SubLObject broker)
  {
    SubLObject cdolist_list_var = listeners;
    SubLObject listener = NIL;
    listener = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      event_broker.register_event_listener( listener, broker );
      cdolist_list_var = cdolist_list_var.rest();
      listener = cdolist_list_var.first();
    }
    return broker;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 5577L)
  public static SubLObject generic_event_dispatcher_deregister_application_listeners(final SubLObject listeners, final SubLObject broker)
  {
    SubLObject cdolist_list_var = listeners;
    SubLObject listener = NIL;
    listener = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      event_broker.deregister_event_listener( listener, broker );
      cdolist_list_var = cdolist_list_var.rest();
      listener = cdolist_list_var.first();
    }
    return broker;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 5769L)
  public static SubLObject declare_simple_event_dispatcher_process(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject prefix = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list15 );
    prefix = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list15 );
      if( NIL == conses_high.member( current_$3, $list16, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list15 );
    }
    final SubLObject broker_tail = cdestructuring_bind.property_list_member( $kw17$BROKER, current );
    final SubLObject broker = ( NIL != broker_tail ) ? conses_high.cadr( broker_tail ) : NIL;
    final SubLObject docstring_tail = cdestructuring_bind.property_list_member( $kw4$DOCSTRING, current );
    final SubLObject docstring = ( NIL != docstring_tail ) ? conses_high.cadr( docstring_tail ) : NIL;
    final SubLObject postfix_tail = cdestructuring_bind.property_list_member( $kw18$POSTFIX, current );
    final SubLObject postfix = ( NIL != postfix_tail ) ? conses_high.cadr( postfix_tail ) : $str19$_EVENT_DISPATCHER;
    final SubLObject body;
    current = ( body = temp );
    return declare_simple_event_dispatcher_process_internal( prefix, postfix, broker, body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 6085L)
  public static SubLObject declare_simple_event_dispatcher_process_internal(final SubLObject prefix, final SubLObject postfix, final SubLObject broker, final SubLObject body)
  {
    final SubLObject lock = event_build_variable_symbol( $str20$, prefix, postfix, $str21$_LOCK );
    final SubLObject lockname = event_build_string_label( $str20$, prefix, postfix, $str22$_Lock );
    final SubLObject starter = event_build_function_symbol( $str23$START_, prefix, postfix, UNPROVIDED );
    final SubLObject stopper = event_build_function_symbol( $str24$STOP_, prefix, postfix, UNPROVIDED );
    final SubLObject running_p = event_build_function_symbol( $str20$, prefix, postfix, $str25$_RUNNING_ );
    final SubLObject ensure_running = event_build_function_symbol( $str26$ENSURE_, prefix, postfix, $str27$_RUNNING );
    final SubLObject listeners = event_build_variable_symbol( $str20$, prefix, postfix, $str28$_LISTENERS );
    final SubLObject register = event_build_function_symbol( $str29$REGISTER_LISTENER_WITH_, prefix, postfix, UNPROVIDED );
    final SubLObject deregister = event_build_function_symbol( $str30$DEREGISTER_LISTENER_WITH_, prefix, postfix, UNPROVIDED );
    return construct_event_dispatcher_process_declaration( lock, lockname, starter, stopper, running_p, ensure_running, listeners, register, deregister, broker, body );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 7107L)
  public static SubLObject construct_event_dispatcher_process_declaration(final SubLObject lock, final SubLObject lockname, final SubLObject starter, final SubLObject stopper, final SubLObject running_p,
      final SubLObject ensure_running, final SubLObject listeners, final SubLObject register, final SubLObject deregister, final SubLObject broker, final SubLObject body)
  {
    return ConsesLow.listS( $sym31$PROGN, new SubLObject[] { declare_event_lock( lock, lockname ), declare_event_code_running_p( running_p, listeners ), declare_event_code_ensure_running( ensure_running, starter,
        running_p ), declare_event_global( listeners, NIL ), declare_event_code_register( register, lock, listeners, broker, running_p ), declare_event_code_deregister( deregister, lock, listeners, broker, running_p ),
      declare_event_code_stopper( stopper, listeners ), declare_event_code_starter( starter, listeners ), ConsesLow.append( body, NIL )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 7862L)
  public static SubLObject declare_event_lexical(final SubLObject var, SubLObject initial_value)
  {
    if( initial_value == UNPROVIDED )
    {
      initial_value = NIL;
    }
    return ConsesLow.list( $sym32$DEFLEXICAL_PRIVATE, var, initial_value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 7991L)
  public static SubLObject declare_event_lock(final SubLObject lockvar, final SubLObject lockname)
  {
    return declare_event_lexical( lockvar, ConsesLow.list( $sym33$MAKE_LOCK, lockname ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 8110L)
  public static SubLObject declare_event_global(final SubLObject var, SubLObject initial_value)
  {
    if( initial_value == UNPROVIDED )
    {
      initial_value = NIL;
    }
    return ConsesLow.list( $sym34$DEFGLOBAL_PRIVATE, var, initial_value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 8228L)
  public static SubLObject declare_event_code_starter(final SubLObject starter, final SubLObject listeners)
  {
    return ConsesLow.list( $sym35$DEFINE_PUBLIC, starter, NIL, ConsesLow.list( $sym36$RET, ConsesLow.list( $sym37$START_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION, ConsesLow.list( $sym38$QUOTE, listeners ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 8422L)
  public static SubLObject declare_event_code_stopper(final SubLObject stopper, final SubLObject listeners)
  {
    return ConsesLow.list( $sym35$DEFINE_PUBLIC, stopper, NIL, ConsesLow.list( $sym36$RET, ConsesLow.list( $sym39$STOP_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION, ConsesLow.list( $sym38$QUOTE, listeners ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 8615L)
  public static SubLObject declare_event_code_running_p(final SubLObject running_p, final SubLObject listeners)
  {
    return ConsesLow.list( $sym35$DEFINE_PUBLIC, running_p, NIL, ConsesLow.list( $sym36$RET, ConsesLow.list( $sym40$GENERIC_EVENT_DISPATCHER_PROCESS_RUNNING_FOR_APPLICATION_P, ConsesLow.list( $sym38$QUOTE,
        listeners ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 8813L)
  public static SubLObject declare_event_code_ensure_running(final SubLObject ensure_running, final SubLObject starter, final SubLObject running_p)
  {
    return ConsesLow.listS( $sym35$DEFINE_PUBLIC, ensure_running, NIL, ConsesLow.list( $sym41$PUNLESS, ConsesLow.list( running_p ), ConsesLow.list( starter ) ), $list42 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 9084L)
  public static SubLObject declare_event_code_register(final SubLObject register, final SubLObject lock, final SubLObject listeners, final SubLObject broker, final SubLObject running_p)
  {
    final SubLObject listener_var = $sym43$LISTENER_VAR;
    return ConsesLow.list( $sym35$DEFINE_PUBLIC, register, ConsesLow.list( listener_var ), ConsesLow.list( $sym44$WITH_LOCK_HELD, ConsesLow.list( lock ), ConsesLow.list( $sym41$PUNLESS, ConsesLow.listS( $sym45$FIND,
        listener_var, listeners, $list46 ), ConsesLow.list( $sym47$CPUSH, listener_var, listeners ), ConsesLow.list( $sym48$PWHEN, ConsesLow.list( running_p ), ConsesLow.list( $sym49$REGISTER_EVENT_LISTENER,
            listener_var, broker ) ) ) ), ConsesLow.list( $sym36$RET, listener_var ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 9545L)
  public static SubLObject declare_event_code_deregister(final SubLObject deregister, final SubLObject lock, final SubLObject listeners, final SubLObject broker, final SubLObject running_p)
  {
    final SubLObject listener_var = $sym50$LISTENER_VAR;
    return ConsesLow.list( $sym35$DEFINE_PUBLIC, deregister, ConsesLow.list( listener_var ), ConsesLow.list( $sym44$WITH_LOCK_HELD, ConsesLow.list( lock ), ConsesLow.list( $sym51$CSETQ, listeners, ConsesLow.listS(
        $sym52$REMOVE, listener_var, listeners, $list46 ) ), ConsesLow.list( $sym48$PWHEN, ConsesLow.list( running_p ), ConsesLow.list( $sym53$DEREGISTER_EVENT_LISTENER, listener_var, broker ) ) ), ConsesLow.list(
            $sym36$RET, listener_var ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 9981L)
  public static SubLObject event_build_function_symbol(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail)
  {
    if( tail == UNPROVIDED )
    {
      tail = $str20$;
    }
    return Packages.intern( Sequences.cconcatenate( head, new SubLObject[] { prefix, postfix, tail
    } ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 10128L)
  public static SubLObject event_build_variable_symbol(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail)
  {
    if( tail == UNPROVIDED )
    {
      tail = $str20$;
    }
    return Packages.intern( Sequences.cconcatenate( $str54$_, new SubLObject[] { head, prefix, postfix, tail, $str54$_
    } ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 10282L)
  public static SubLObject event_build_string_label(final SubLObject head, final SubLObject prefix, final SubLObject postfix, SubLObject tail)
  {
    if( tail == UNPROVIDED )
    {
      tail = $str20$;
    }
    return Sequences.cconcatenate( head, new SubLObject[] { prefix, postfix, tail
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 10416L)
  public static SubLObject event_message_cracker_privacy(final SubLObject privacy_level)
  {
    if( privacy_level.eql( $kw55$PROTECTED ) )
    {
      return $sym56$DEFINE_PROTECTED;
    }
    if( privacy_level.eql( $kw57$PUBLIC ) )
    {
      return $sym35$DEFINE_PUBLIC;
    }
    if( privacy_level.eql( $kw58$PRIVATE ) )
    {
      return $sym59$DEFINE_PRIVATE;
    }
    Errors.error( $str60$Unknown_privacy_level__S____not_o, privacy_level );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 10931L)
  public static SubLObject event_construct_message_cracker_symbol(final SubLObject type, final SubLObject slot)
  {
    return Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( type ), new SubLObject[] { $str61$_RETRIEVE_, Symbols.symbol_name( slot )
    } ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 11215L)
  public static SubLObject event_is_handler_registration_eventP(final SubLObject event)
  {
    return makeBoolean( event_model.event_class( event ) == $kw62$EVENT_HANDLER_REGISTERED || event_model.event_class( event ) == $kw63$EVENT_HANDLER_DEREGISTERED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 11411L)
  public static SubLObject with_validated_event_type(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject event = NIL;
    SubLObject event_type = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    event = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list64 );
    event_type = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym31$PROGN, ConsesLow.listS( $sym65$CHECK_TYPE, event, $list66 ), ConsesLow.list( $sym41$PUNLESS, ConsesLow.list( EQ, ConsesLow.list( $sym67$EVENT_CLASS, event ), event_type ), ConsesLow
          .list( $sym41$PUNLESS, ConsesLow.list( $sym68$EVENT_IS_HANDLER_REGISTRATION_EVENT_, event ), ConsesLow.list( $sym69$ERROR, $str70$Event__S_is_of_type__S__not__S_, event, ConsesLow.list( $sym67$EVENT_CLASS,
              event ), event_type ) ) ), reader.bq_cons( $sym31$PROGN, ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list64 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/event-utilities.lisp", position = 11896L)
  public static SubLObject define_event_message_crackers(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject event_type = NIL;
    SubLObject slot_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    event_type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list71 );
    slot_list = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$4 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list71 );
      current_$4 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list71 );
      if( NIL == conses_high.member( current_$4, $list72, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$4 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
    }
    final SubLObject privacy_level_tail = cdestructuring_bind.property_list_member( $kw73$PRIVACY_LEVEL, current );
    final SubLObject privacy_level = ( NIL != privacy_level_tail ) ? conses_high.cadr( privacy_level_tail ) : $kw55$PROTECTED;
    current = temp;
    if( NIL == current )
    {
      SubLObject expansions = NIL;
      final SubLObject event = $sym74$EVENT;
      SubLObject cdolist_list_var = slot_list;
      SubLObject slot = NIL;
      slot = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        final SubLObject define_privacy = event_message_cracker_privacy( privacy_level );
        final SubLObject expansion = ConsesLow.list( define_privacy, event_construct_message_cracker_symbol( event_type, slot ), ConsesLow.list( event ), ConsesLow.list( $sym75$WITH_VALIDATED_EVENT_TYPE, ConsesLow.list(
            event, event_type ), ConsesLow.list( $sym36$RET, ConsesLow.list( $sym76$GETF, ConsesLow.list( $sym77$EVENT_MESSAGE, event ), slot ) ) ) );
        expansions = ConsesLow.cons( expansion, expansions );
        cdolist_list_var = cdolist_list_var.rest();
        slot = cdolist_list_var.first();
      }
      return reader.bq_cons( $sym31$PROGN, ConsesLow.append( expansions, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list71 );
    return NIL;
  }

  public static SubLObject declare_event_utilities_file()
  {
    SubLFiles.declareMacro( me, "declare_event_class", "DECLARE-EVENT-CLASS" );
    SubLFiles.declareFunction( me, "generic_event_dispatcher_process_running_for_application_p", "GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION-P", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_event_dispatcher_process", "GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( me, "start_generic_event_dispatcher_process_for_application", "START-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "stop_generic_event_dispatcher_process_for_application", "STOP-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_generic_event_dispatcher_process_running_for_application", "ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_event_dispatcher_process_running_p", "GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-P", 0, 0, false );
    SubLFiles.declareFunction( me, "start_generic_event_dispatcher_process", "START-GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( me, "stop_generic_event_dispatcher_process", "STOP-GENERIC-EVENT-DISPATCHER-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_generic_event_dispatcher_process_running", "ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING", 0, 0, false );
    SubLFiles.declareFunction( me, "dispatch_events_for_generic_event_dispatcher", "DISPATCH-EVENTS-FOR-GENERIC-EVENT-DISPATCHER", 0, 0, false );
    SubLFiles.declareFunction( me, "generic_event_dispatcher_register_application_listeners", "GENERIC-EVENT-DISPATCHER-REGISTER-APPLICATION-LISTENERS", 2, 0, false );
    SubLFiles.declareFunction( me, "generic_event_dispatcher_deregister_application_listeners", "GENERIC-EVENT-DISPATCHER-DEREGISTER-APPLICATION-LISTENERS", 2, 0, false );
    SubLFiles.declareMacro( me, "declare_simple_event_dispatcher_process", "DECLARE-SIMPLE-EVENT-DISPATCHER-PROCESS" );
    SubLFiles.declareFunction( me, "declare_simple_event_dispatcher_process_internal", "DECLARE-SIMPLE-EVENT-DISPATCHER-PROCESS-INTERNAL", 4, 0, false );
    SubLFiles.declareFunction( me, "construct_event_dispatcher_process_declaration", "CONSTRUCT-EVENT-DISPATCHER-PROCESS-DECLARATION", 11, 0, false );
    SubLFiles.declareFunction( me, "declare_event_lexical", "DECLARE-EVENT-LEXICAL", 1, 1, false );
    SubLFiles.declareFunction( me, "declare_event_lock", "DECLARE-EVENT-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "declare_event_global", "DECLARE-EVENT-GLOBAL", 1, 1, false );
    SubLFiles.declareFunction( me, "declare_event_code_starter", "DECLARE-EVENT-CODE-STARTER", 2, 0, false );
    SubLFiles.declareFunction( me, "declare_event_code_stopper", "DECLARE-EVENT-CODE-STOPPER", 2, 0, false );
    SubLFiles.declareFunction( me, "declare_event_code_running_p", "DECLARE-EVENT-CODE-RUNNING-P", 2, 0, false );
    SubLFiles.declareFunction( me, "declare_event_code_ensure_running", "DECLARE-EVENT-CODE-ENSURE-RUNNING", 3, 0, false );
    SubLFiles.declareFunction( me, "declare_event_code_register", "DECLARE-EVENT-CODE-REGISTER", 5, 0, false );
    SubLFiles.declareFunction( me, "declare_event_code_deregister", "DECLARE-EVENT-CODE-DEREGISTER", 5, 0, false );
    SubLFiles.declareFunction( me, "event_build_function_symbol", "EVENT-BUILD-FUNCTION-SYMBOL", 3, 1, false );
    SubLFiles.declareFunction( me, "event_build_variable_symbol", "EVENT-BUILD-VARIABLE-SYMBOL", 3, 1, false );
    SubLFiles.declareFunction( me, "event_build_string_label", "EVENT-BUILD-STRING-LABEL", 3, 1, false );
    SubLFiles.declareFunction( me, "event_message_cracker_privacy", "EVENT-MESSAGE-CRACKER-PRIVACY", 1, 0, false );
    SubLFiles.declareFunction( me, "event_construct_message_cracker_symbol", "EVENT-CONSTRUCT-MESSAGE-CRACKER-SYMBOL", 2, 0, false );
    SubLFiles.declareFunction( me, "event_is_handler_registration_eventP", "EVENT-IS-HANDLER-REGISTRATION-EVENT?", 1, 0, false );
    SubLFiles.declareMacro( me, "with_validated_event_type", "WITH-VALIDATED-EVENT-TYPE" );
    SubLFiles.declareMacro( me, "define_event_message_crackers", "DEFINE-EVENT-MESSAGE-CRACKERS" );
    return NIL;
  }

  public static SubLObject init_event_utilities_file()
  {
    $generic_event_dispatcher_lock$ = SubLFiles.deflexical( "*GENERIC-EVENT-DISPATCHER-LOCK*", maybeDefault( $sym8$_GENERIC_EVENT_DISPATCHER_LOCK_, $generic_event_dispatcher_lock$, () -> ( Locks.make_lock(
        $str9$Generic_Event_Dispatcher_Process_ ) ) ) );
    $generic_event_dispatcher_applications$ = SubLFiles.deflexical( "*GENERIC-EVENT-DISPATCHER-APPLICATIONS*", maybeDefault( $sym10$_GENERIC_EVENT_DISPATCHER_APPLICATIONS_, $generic_event_dispatcher_applications$,
        () -> ( bag.new_bag( UNPROVIDED, UNPROVIDED ) ) ) );
    $generic_event_dispatcher_process$ = SubLFiles.deflexical( "*GENERIC-EVENT-DISPATCHER-PROCESS*", ( maybeDefault( $sym11$_GENERIC_EVENT_DISPATCHER_PROCESS_, $generic_event_dispatcher_process$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_event_utilities_file()
  {
    subl_macro_promotions.declare_defglobal( $sym8$_GENERIC_EVENT_DISPATCHER_LOCK_ );
    subl_macro_promotions.declare_defglobal( $sym10$_GENERIC_EVENT_DISPATCHER_APPLICATIONS_ );
    subl_macro_promotions.declare_defglobal( $sym11$_GENERIC_EVENT_DISPATCHER_PROCESS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_event_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_event_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_event_utilities_file();
  }
  static
  {
    me = new event_utilities();
    $generic_event_dispatcher_lock$ = null;
    $generic_event_dispatcher_applications$ = null;
    $generic_event_dispatcher_process$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-KEY" ), makeSymbol( "&KEY" ), makeSymbol( "PARENT" ), makeSymbol( "DOCSTRING" ), makeSymbol( "HIERARCHY" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "PARENT" ), makeKeyword( "DOCSTRING" ), makeKeyword( "HIERARCHY" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$PARENT = makeKeyword( "PARENT" );
    $kw4$DOCSTRING = makeKeyword( "DOCSTRING" );
    $kw5$HIERARCHY = makeKeyword( "HIERARCHY" );
    $str6$Must_specify_a_parent_class_ = makeString( "Must specify a parent class." );
    $sym7$REGISTER_EVENT_CLASS = makeSymbol( "REGISTER-EVENT-CLASS" );
    $sym8$_GENERIC_EVENT_DISPATCHER_LOCK_ = makeSymbol( "*GENERIC-EVENT-DISPATCHER-LOCK*" );
    $str9$Generic_Event_Dispatcher_Process_ = makeString( "Generic Event Dispatcher Process Lock" );
    $sym10$_GENERIC_EVENT_DISPATCHER_APPLICATIONS_ = makeSymbol( "*GENERIC-EVENT-DISPATCHER-APPLICATIONS*" );
    $sym11$_GENERIC_EVENT_DISPATCHER_PROCESS_ = makeSymbol( "*GENERIC-EVENT-DISPATCHER-PROCESS*" );
    $str12$Generic_Event_Dispatcher_Process = makeString( "Generic Event Dispatcher Process" );
    $sym13$DISPATCH_EVENTS_FOR_GENERIC_EVENT_DISPATCHER = makeSymbol( "DISPATCH-EVENTS-FOR-GENERIC-EVENT-DISPATCHER" );
    $kw14$TERMINATED = makeKeyword( "TERMINATED" );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "PREFIX" ), makeSymbol( "&KEY" ), makeSymbol( "BROKER" ), makeSymbol( "DOCSTRING" ), ConsesLow.list( makeSymbol( "POSTFIX" ), makeString(
        "-EVENT-DISPATCHER" ) ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list16 = ConsesLow.list( makeKeyword( "BROKER" ), makeKeyword( "DOCSTRING" ), makeKeyword( "POSTFIX" ) );
    $kw17$BROKER = makeKeyword( "BROKER" );
    $kw18$POSTFIX = makeKeyword( "POSTFIX" );
    $str19$_EVENT_DISPATCHER = makeString( "-EVENT-DISPATCHER" );
    $str20$ = makeString( "" );
    $str21$_LOCK = makeString( "-LOCK" );
    $str22$_Lock = makeString( " Lock" );
    $str23$START_ = makeString( "START-" );
    $str24$STOP_ = makeString( "STOP-" );
    $str25$_RUNNING_ = makeString( "-RUNNING?" );
    $str26$ENSURE_ = makeString( "ENSURE-" );
    $str27$_RUNNING = makeString( "-RUNNING" );
    $str28$_LISTENERS = makeString( "-LISTENERS" );
    $str29$REGISTER_LISTENER_WITH_ = makeString( "REGISTER-LISTENER-WITH-" );
    $str30$DEREGISTER_LISTENER_WITH_ = makeString( "DEREGISTER-LISTENER-WITH-" );
    $sym31$PROGN = makeSymbol( "PROGN" );
    $sym32$DEFLEXICAL_PRIVATE = makeSymbol( "DEFLEXICAL-PRIVATE" );
    $sym33$MAKE_LOCK = makeSymbol( "MAKE-LOCK" );
    $sym34$DEFGLOBAL_PRIVATE = makeSymbol( "DEFGLOBAL-PRIVATE" );
    $sym35$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $sym36$RET = makeSymbol( "RET" );
    $sym37$START_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION = makeSymbol( "START-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION" );
    $sym38$QUOTE = makeSymbol( "QUOTE" );
    $sym39$STOP_GENERIC_EVENT_DISPATCHER_PROCESS_FOR_APPLICATION = makeSymbol( "STOP-GENERIC-EVENT-DISPATCHER-PROCESS-FOR-APPLICATION" );
    $sym40$GENERIC_EVENT_DISPATCHER_PROCESS_RUNNING_FOR_APPLICATION_P = makeSymbol( "GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-FOR-APPLICATION-P" );
    $sym41$PUNLESS = makeSymbol( "PUNLESS" );
    $list42 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), ConsesLow.list( makeSymbol( "GENERIC-EVENT-DISPATCHER-PROCESS" ) ) ) );
    $sym43$LISTENER_VAR = makeUninternedSymbol( "LISTENER-VAR" );
    $sym44$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym45$FIND = makeSymbol( "FIND" );
    $list46 = ConsesLow.list( ConsesLow.list( makeSymbol( "QUOTE" ), EQUALP ) );
    $sym47$CPUSH = makeSymbol( "CPUSH" );
    $sym48$PWHEN = makeSymbol( "PWHEN" );
    $sym49$REGISTER_EVENT_LISTENER = makeSymbol( "REGISTER-EVENT-LISTENER" );
    $sym50$LISTENER_VAR = makeUninternedSymbol( "LISTENER-VAR" );
    $sym51$CSETQ = makeSymbol( "CSETQ" );
    $sym52$REMOVE = makeSymbol( "REMOVE" );
    $sym53$DEREGISTER_EVENT_LISTENER = makeSymbol( "DEREGISTER-EVENT-LISTENER" );
    $str54$_ = makeString( "*" );
    $kw55$PROTECTED = makeKeyword( "PROTECTED" );
    $sym56$DEFINE_PROTECTED = makeSymbol( "DEFINE-PROTECTED" );
    $kw57$PUBLIC = makeKeyword( "PUBLIC" );
    $kw58$PRIVATE = makeKeyword( "PRIVATE" );
    $sym59$DEFINE_PRIVATE = makeSymbol( "DEFINE-PRIVATE" );
    $str60$Unknown_privacy_level__S____not_o = makeString( "Unknown privacy level ~S -- not one of :protected, :public, :private." );
    $str61$_RETRIEVE_ = makeString( "-RETRIEVE-" );
    $kw62$EVENT_HANDLER_REGISTERED = makeKeyword( "EVENT-HANDLER-REGISTERED" );
    $kw63$EVENT_HANDLER_DEREGISTERED = makeKeyword( "EVENT-HANDLER-DEREGISTERED" );
    $list64 = ConsesLow.list( ConsesLow.list( makeSymbol( "EVENT" ), makeSymbol( "EVENT-TYPE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym65$CHECK_TYPE = makeSymbol( "CHECK-TYPE" );
    $list66 = ConsesLow.list( makeSymbol( "EVENT-P" ) );
    $sym67$EVENT_CLASS = makeSymbol( "EVENT-CLASS" );
    $sym68$EVENT_IS_HANDLER_REGISTRATION_EVENT_ = makeSymbol( "EVENT-IS-HANDLER-REGISTRATION-EVENT?" );
    $sym69$ERROR = makeSymbol( "ERROR" );
    $str70$Event__S_is_of_type__S__not__S_ = makeString( "Event ~S is of type ~S, not ~S." );
    $list71 = ConsesLow.list( ConsesLow.list( makeSymbol( "EVENT-TYPE" ), makeSymbol( "SLOT-LIST" ), makeSymbol( "&KEY" ), ConsesLow.list( makeSymbol( "PRIVACY-LEVEL" ), makeKeyword( "PROTECTED" ) ) ) );
    $list72 = ConsesLow.list( makeKeyword( "PRIVACY-LEVEL" ) );
    $kw73$PRIVACY_LEVEL = makeKeyword( "PRIVACY-LEVEL" );
    $sym74$EVENT = makeUninternedSymbol( "EVENT" );
    $sym75$WITH_VALIDATED_EVENT_TYPE = makeSymbol( "WITH-VALIDATED-EVENT-TYPE" );
    $sym76$GETF = makeSymbol( "GETF" );
    $sym77$EVENT_MESSAGE = makeSymbol( "EVENT-MESSAGE" );
  }
}
/*
 * 
 * Total time: 122 ms
 * 
 */