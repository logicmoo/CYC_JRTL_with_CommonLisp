package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_event_dispatcher
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.rkf_event_dispatcher";
  public static final String myFingerPrint = "e362bd68869a2c315afae96a206ee64a00b03a8448fd9ff1f1f4ed60b0c4a57b";
  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4579L)
  private static SubLSymbol $rkf_event_dispatcher_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4579L)
  private static SubLSymbol $rkf_event_dispatcher_listeners$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$PARENT;
  private static final SubLSymbol $kw4$DOCSTRING;
  private static final SubLSymbol $kw5$HIERARCHY;
  private static final SubLSymbol $sym6$DECLARE_EVENT_CLASS;
  private static final SubLSymbol $kw7$RKF_BASE_EVENT;
  private static final SubLSymbol $kw8$CYC_APPLICATION_EVENT;
  private static final SubLSymbol $kw9$RKF_KB_MODIFICATION_EVENT;
  private static final SubLSymbol $kw10$RKF_ASSERT_EVENT;
  private static final SubLSymbol $kw11$RKF_UNASSERT_EVENT;
  private static final SubLSymbol $kw12$RKF_CREATE_TERM_EVENT;
  private static final SubLSymbol $kw13$RKF_KILL_TERM_EVENT;
  private static final SubLSymbol $kw14$SENTENCE;
  private static final SubLSymbol $kw15$MT;
  private static final SubLSymbol $kw16$AGENDA;
  private static final SubLSymbol $sym17$EVENT_P;
  private static final SubLString $str18$Event__S_is_of_type__S__not__S_;
  private static final SubLSymbol $kw19$TERM_NAME;
  private static final SubLSymbol $kw20$TERM_GUID;
  private static final SubLSymbol $kw21$TERM_SUID;
  private static final SubLString $str22$RKF_EVENT_DISPATCHER_Lock;
  private static final SubLSymbol $sym23$_RKF_EVENT_DISPATCHER_LISTENERS_;

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 889L)
  public static SubLObject rkf_declare_event_class(final SubLObject macroform, final SubLObject environment)
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
    return ConsesLow.listS( $sym6$DECLARE_EVENT_CLASS, ConsesLow.list( class_key, $kw3$PARENT, parent, $kw4$DOCSTRING, docstring, $kw5$HIERARCHY, hierarchy ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 2242L)
  public static SubLObject rkf_post_assert_event(final SubLObject sentence, final SubLObject mt, SubLObject v_agenda, SubLObject source)
  {
    if( v_agenda == UNPROVIDED )
    {
      v_agenda = NIL;
    }
    if( source == UNPROVIDED )
    {
      source = NIL;
    }
    if( NIL == source )
    {
      source = operation_communication.the_cyclist();
    }
    final SubLObject my_agenda = ( NIL != v_agenda ) ? v_agenda : NIL;
    final SubLObject event = event_model.new_event( $kw10$RKF_ASSERT_EVENT, ConsesLow.list( $kw14$SENTENCE, sentence, $kw15$MT, mt, $kw16$AGENDA, my_agenda ), source );
    return event_broker.post_event( event, current_rkf_event_broker() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 2676L)
  public static SubLObject rkf_assert_event_retrieve_agenda(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw10$RKF_ASSERT_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw10$RKF_ASSERT_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw16$AGENDA, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 2676L)
  public static SubLObject rkf_assert_event_retrieve_mt(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw10$RKF_ASSERT_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw10$RKF_ASSERT_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw15$MT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 2676L)
  public static SubLObject rkf_assert_event_retrieve_sentence(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw10$RKF_ASSERT_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw10$RKF_ASSERT_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw14$SENTENCE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 2781L)
  public static SubLObject rkf_post_unassert_event(final SubLObject sentence, final SubLObject mt, SubLObject v_agenda, SubLObject source)
  {
    if( v_agenda == UNPROVIDED )
    {
      v_agenda = NIL;
    }
    if( source == UNPROVIDED )
    {
      source = NIL;
    }
    if( NIL == source )
    {
      source = operation_communication.the_cyclist();
    }
    final SubLObject my_agenda = ( NIL != v_agenda ) ? v_agenda : NIL;
    final SubLObject event = event_model.new_event( $kw11$RKF_UNASSERT_EVENT, ConsesLow.list( $kw14$SENTENCE, sentence, $kw15$MT, mt, $kw16$AGENDA, my_agenda ), source );
    return event_broker.post_event( event, current_rkf_event_broker() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 3181L)
  public static SubLObject rkf_unassert_event_retrieve_agenda(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw11$RKF_UNASSERT_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw11$RKF_UNASSERT_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw16$AGENDA, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 3181L)
  public static SubLObject rkf_unassert_event_retrieve_mt(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw11$RKF_UNASSERT_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw11$RKF_UNASSERT_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw15$MT, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 3181L)
  public static SubLObject rkf_unassert_event_retrieve_sentence(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw11$RKF_UNASSERT_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw11$RKF_UNASSERT_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw14$SENTENCE, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 3289L)
  public static SubLObject rkf_post_create_term_event(final SubLObject v_term, SubLObject source)
  {
    if( source == UNPROVIDED )
    {
      source = NIL;
    }
    if( NIL == source )
    {
      source = operation_communication.the_cyclist();
    }
    final SubLObject event = event_model.new_event( $kw12$RKF_CREATE_TERM_EVENT, ConsesLow.list( $kw19$TERM_NAME, constants_high.constant_name( v_term ), $kw20$TERM_GUID, constants_high.constant_guid( v_term ),
        $kw21$TERM_SUID, constant_handles.constant_suid( v_term ), $kw16$AGENDA, NIL ), source );
    return event_broker.post_event( event, current_rkf_event_broker() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 3724L)
  public static SubLObject rkf_create_term_event_retrieve_agenda(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw12$RKF_CREATE_TERM_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw12$RKF_CREATE_TERM_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw16$AGENDA, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 3724L)
  public static SubLObject rkf_create_term_event_retrieve_term_suid(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw12$RKF_CREATE_TERM_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw12$RKF_CREATE_TERM_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw21$TERM_SUID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 3724L)
  public static SubLObject rkf_create_term_event_retrieve_term_guid(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw12$RKF_CREATE_TERM_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw12$RKF_CREATE_TERM_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw20$TERM_GUID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 3724L)
  public static SubLObject rkf_create_term_event_retrieve_term_name(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw12$RKF_CREATE_TERM_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw12$RKF_CREATE_TERM_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw19$TERM_NAME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 3864L)
  public static SubLObject rkf_post_kill_term_event(final SubLObject v_term, SubLObject source)
  {
    if( source == UNPROVIDED )
    {
      source = NIL;
    }
    if( NIL == source )
    {
      source = operation_communication.the_cyclist();
    }
    if( NIL == constant_handles.constant_p( v_term ) )
    {
      return NIL;
    }
    final SubLObject event = event_model.new_event( $kw13$RKF_KILL_TERM_EVENT, ConsesLow.list( $kw19$TERM_NAME, constants_high.constant_name( v_term ), $kw20$TERM_GUID, constants_high.constant_guid( v_term ),
        $kw21$TERM_SUID, constant_handles.constant_suid( v_term ), $kw16$AGENDA, NIL ), source );
    return event_broker.post_event( event, current_rkf_event_broker() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4327L)
  public static SubLObject rkf_kill_term_event_retrieve_agenda(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw13$RKF_KILL_TERM_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw13$RKF_KILL_TERM_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw16$AGENDA, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4327L)
  public static SubLObject rkf_kill_term_event_retrieve_term_suid(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw13$RKF_KILL_TERM_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw13$RKF_KILL_TERM_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw21$TERM_SUID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4327L)
  public static SubLObject rkf_kill_term_event_retrieve_term_guid(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw13$RKF_KILL_TERM_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw13$RKF_KILL_TERM_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw20$TERM_GUID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4327L)
  public static SubLObject rkf_kill_term_event_retrieve_term_name(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw13$RKF_KILL_TERM_EVENT && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str18$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw13$RKF_KILL_TERM_EVENT );
    }
    return conses_high.getf( event_model.event_message( event ), $kw19$TERM_NAME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4466L)
  public static SubLObject current_rkf_event_broker()
  {
    return event_broker.core_event_broker();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4579L)
  public static SubLObject rkf_event_dispatcher_runningP()
  {
    return event_utilities.generic_event_dispatcher_process_running_for_application_p( $sym23$_RKF_EVENT_DISPATCHER_LISTENERS_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4579L)
  public static SubLObject ensure_rkf_event_dispatcher_running()
  {
    if( NIL == rkf_event_dispatcher_runningP() )
    {
      start_rkf_event_dispatcher();
    }
    return event_utilities.generic_event_dispatcher_process();
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4579L)
  public static SubLObject register_listener_with_rkf_event_dispatcher(final SubLObject listener_var)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rkf_event_dispatcher_lock$.getGlobalValue() );
      if( NIL == Sequences.find( listener_var, $rkf_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        $rkf_event_dispatcher_listeners$.setGlobalValue( ConsesLow.cons( listener_var, $rkf_event_dispatcher_listeners$.getGlobalValue() ) );
        if( NIL != rkf_event_dispatcher_runningP() )
        {
          event_broker.register_event_listener( listener_var, NIL );
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rkf_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return listener_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4579L)
  public static SubLObject deregister_listener_with_rkf_event_dispatcher(final SubLObject listener_var)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $rkf_event_dispatcher_lock$.getGlobalValue() );
      $rkf_event_dispatcher_listeners$.setGlobalValue( Sequences.remove( listener_var, $rkf_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      if( NIL != rkf_event_dispatcher_runningP() )
      {
        event_broker.deregister_event_listener( listener_var, NIL );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $rkf_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return listener_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4579L)
  public static SubLObject stop_rkf_event_dispatcher()
  {
    return event_utilities.stop_generic_event_dispatcher_process_for_application( $sym23$_RKF_EVENT_DISPATCHER_LISTENERS_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/rkf-event-dispatcher.lisp", position = 4579L)
  public static SubLObject start_rkf_event_dispatcher()
  {
    return event_utilities.start_generic_event_dispatcher_process_for_application( $sym23$_RKF_EVENT_DISPATCHER_LISTENERS_ );
  }

  public static SubLObject declare_rkf_event_dispatcher_file()
  {
    SubLFiles.declareMacro( me, "rkf_declare_event_class", "RKF-DECLARE-EVENT-CLASS" );
    SubLFiles.declareFunction( me, "rkf_post_assert_event", "RKF-POST-ASSERT-EVENT", 2, 2, false );
    SubLFiles.declareFunction( me, "rkf_assert_event_retrieve_agenda", "RKF-ASSERT-EVENT-RETRIEVE-AGENDA", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_assert_event_retrieve_mt", "RKF-ASSERT-EVENT-RETRIEVE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_assert_event_retrieve_sentence", "RKF-ASSERT-EVENT-RETRIEVE-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_post_unassert_event", "RKF-POST-UNASSERT-EVENT", 2, 2, false );
    SubLFiles.declareFunction( me, "rkf_unassert_event_retrieve_agenda", "RKF-UNASSERT-EVENT-RETRIEVE-AGENDA", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_unassert_event_retrieve_mt", "RKF-UNASSERT-EVENT-RETRIEVE-MT", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_unassert_event_retrieve_sentence", "RKF-UNASSERT-EVENT-RETRIEVE-SENTENCE", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_post_create_term_event", "RKF-POST-CREATE-TERM-EVENT", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_create_term_event_retrieve_agenda", "RKF-CREATE-TERM-EVENT-RETRIEVE-AGENDA", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_create_term_event_retrieve_term_suid", "RKF-CREATE-TERM-EVENT-RETRIEVE-TERM-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_create_term_event_retrieve_term_guid", "RKF-CREATE-TERM-EVENT-RETRIEVE-TERM-GUID", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_create_term_event_retrieve_term_name", "RKF-CREATE-TERM-EVENT-RETRIEVE-TERM-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_post_kill_term_event", "RKF-POST-KILL-TERM-EVENT", 1, 1, false );
    SubLFiles.declareFunction( me, "rkf_kill_term_event_retrieve_agenda", "RKF-KILL-TERM-EVENT-RETRIEVE-AGENDA", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_kill_term_event_retrieve_term_suid", "RKF-KILL-TERM-EVENT-RETRIEVE-TERM-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_kill_term_event_retrieve_term_guid", "RKF-KILL-TERM-EVENT-RETRIEVE-TERM-GUID", 1, 0, false );
    SubLFiles.declareFunction( me, "rkf_kill_term_event_retrieve_term_name", "RKF-KILL-TERM-EVENT-RETRIEVE-TERM-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "current_rkf_event_broker", "CURRENT-RKF-EVENT-BROKER", 0, 0, false );
    SubLFiles.declareFunction( me, "rkf_event_dispatcher_runningP", "RKF-EVENT-DISPATCHER-RUNNING?", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_rkf_event_dispatcher_running", "ENSURE-RKF-EVENT-DISPATCHER-RUNNING", 0, 0, false );
    SubLFiles.declareFunction( me, "register_listener_with_rkf_event_dispatcher", "REGISTER-LISTENER-WITH-RKF-EVENT-DISPATCHER", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_listener_with_rkf_event_dispatcher", "DEREGISTER-LISTENER-WITH-RKF-EVENT-DISPATCHER", 1, 0, false );
    SubLFiles.declareFunction( me, "stop_rkf_event_dispatcher", "STOP-RKF-EVENT-DISPATCHER", 0, 0, false );
    SubLFiles.declareFunction( me, "start_rkf_event_dispatcher", "START-RKF-EVENT-DISPATCHER", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_rkf_event_dispatcher_file()
  {
    $rkf_event_dispatcher_lock$ = SubLFiles.deflexical( "*RKF-EVENT-DISPATCHER-LOCK*", Locks.make_lock( $str22$RKF_EVENT_DISPATCHER_Lock ) );
    $rkf_event_dispatcher_listeners$ = SubLFiles.deflexical( "*RKF-EVENT-DISPATCHER-LISTENERS*", ( maybeDefault( $sym23$_RKF_EVENT_DISPATCHER_LISTENERS_, $rkf_event_dispatcher_listeners$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_rkf_event_dispatcher_file()
  {
    event_model.register_event_class( $kw7$RKF_BASE_EVENT, $kw8$CYC_APPLICATION_EVENT, NIL );
    event_model.register_event_class( $kw9$RKF_KB_MODIFICATION_EVENT, $kw7$RKF_BASE_EVENT, NIL );
    event_model.register_event_class( $kw10$RKF_ASSERT_EVENT, $kw9$RKF_KB_MODIFICATION_EVENT, NIL );
    event_model.register_event_class( $kw11$RKF_UNASSERT_EVENT, $kw9$RKF_KB_MODIFICATION_EVENT, NIL );
    event_model.register_event_class( $kw12$RKF_CREATE_TERM_EVENT, $kw9$RKF_KB_MODIFICATION_EVENT, NIL );
    event_model.register_event_class( $kw13$RKF_KILL_TERM_EVENT, $kw9$RKF_KB_MODIFICATION_EVENT, NIL );
    subl_macro_promotions.declare_defglobal( $sym23$_RKF_EVENT_DISPATCHER_LISTENERS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_rkf_event_dispatcher_file();
  }

  @Override
  public void initializeVariables()
  {
    init_rkf_event_dispatcher_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_rkf_event_dispatcher_file();
  }
  static
  {
    me = new rkf_event_dispatcher();
    $rkf_event_dispatcher_lock$ = null;
    $rkf_event_dispatcher_listeners$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "CLASS-KEY" ), makeSymbol( "&KEY" ), makeSymbol( "PARENT" ), makeSymbol( "DOCSTRING" ), makeSymbol( "HIERARCHY" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "PARENT" ), makeKeyword( "DOCSTRING" ), makeKeyword( "HIERARCHY" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$PARENT = makeKeyword( "PARENT" );
    $kw4$DOCSTRING = makeKeyword( "DOCSTRING" );
    $kw5$HIERARCHY = makeKeyword( "HIERARCHY" );
    $sym6$DECLARE_EVENT_CLASS = makeSymbol( "DECLARE-EVENT-CLASS" );
    $kw7$RKF_BASE_EVENT = makeKeyword( "RKF-BASE-EVENT" );
    $kw8$CYC_APPLICATION_EVENT = makeKeyword( "CYC-APPLICATION-EVENT" );
    $kw9$RKF_KB_MODIFICATION_EVENT = makeKeyword( "RKF-KB-MODIFICATION-EVENT" );
    $kw10$RKF_ASSERT_EVENT = makeKeyword( "RKF-ASSERT-EVENT" );
    $kw11$RKF_UNASSERT_EVENT = makeKeyword( "RKF-UNASSERT-EVENT" );
    $kw12$RKF_CREATE_TERM_EVENT = makeKeyword( "RKF-CREATE-TERM-EVENT" );
    $kw13$RKF_KILL_TERM_EVENT = makeKeyword( "RKF-KILL-TERM-EVENT" );
    $kw14$SENTENCE = makeKeyword( "SENTENCE" );
    $kw15$MT = makeKeyword( "MT" );
    $kw16$AGENDA = makeKeyword( "AGENDA" );
    $sym17$EVENT_P = makeSymbol( "EVENT-P" );
    $str18$Event__S_is_of_type__S__not__S_ = makeString( "Event ~S is of type ~S, not ~S." );
    $kw19$TERM_NAME = makeKeyword( "TERM-NAME" );
    $kw20$TERM_GUID = makeKeyword( "TERM-GUID" );
    $kw21$TERM_SUID = makeKeyword( "TERM-SUID" );
    $str22$RKF_EVENT_DISPATCHER_Lock = makeString( "RKF-EVENT-DISPATCHER Lock" );
    $sym23$_RKF_EVENT_DISPATCHER_LISTENERS_ = makeSymbol( "*RKF-EVENT-DISPATCHER-LISTENERS*" );
  }
}
/*
 * 
 * Total time: 80 ms
 * 
 */