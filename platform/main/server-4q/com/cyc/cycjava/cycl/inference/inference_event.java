package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.event_broker;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.event_utilities;
import com.cyc.cycjava.cycl.event_model;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_event
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.inference.inference_event";
  public static final String myFingerPrint = "df150891dd5d0cfdffae7710426a52b716f7737ee92497148a050dd7440ec36d";
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
  private static SubLSymbol $inference_event_dispatcher_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
  private static SubLSymbol $inference_event_dispatcher_listeners$;
  private static final SubLSymbol $kw0$INFERENCE_NEW_ANSWER;
  private static final SubLSymbol $kw1$INFERENCE_EVENT;
  private static final SubLSymbol $kw2$INFERENCE_STATUS_CHANGE;
  private static final SubLList $list3;
  private static final SubLSymbol $kw4$SKSI_QUERY;
  private static final SubLSymbol $kw5$PROBLEM_STORE_ID;
  private static final SubLSymbol $kw6$INFERENCE_ID;
  private static final SubLSymbol $kw7$NEW_ANSWER_ID;
  private static final SubLSymbol $sym8$EVENT_P;
  private static final SubLString $str9$Event__S_is_of_type__S__not__S_;
  private static final SubLSymbol $kw10$NEW_STATUS;
  private static final SubLSymbol $kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED;
  private static final SubLSymbol $kw12$NEW_DEPTH;
  private static final SubLSymbol $kw13$PROBLEM_ID;
  private static final SubLSymbol $kw14$TACTIC_ID;
  private static final SubLSymbol $kw15$STATUS;
  private static final SubLSymbol $kw16$END_TIME;
  private static final SubLSymbol $kw17$START_TIME;
  private static final SubLString $str18$INFERENCE_EVENT_DISPATCHER_Lock;
  private static final SubLSymbol $sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_;

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 1761L)
  public static SubLObject post_inference_new_answer_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject new_answer_id)
  {
    if( NIL != anyone_interested_in_inference_eventP( $kw0$INFERENCE_NEW_ANSWER ) )
    {
      return post_new_inference_event( $kw0$INFERENCE_NEW_ANSWER, ConsesLow.list( $kw5$PROBLEM_STORE_ID, problem_store_id, $kw6$INFERENCE_ID, inference_id, $kw7$NEW_ANSWER_ID, new_answer_id ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2286L)
  public static SubLObject inference_new_answer_retrieve_new_answer_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw0$INFERENCE_NEW_ANSWER && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw0$INFERENCE_NEW_ANSWER );
    }
    return conses_high.getf( event_model.event_message( event ), $kw7$NEW_ANSWER_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2286L)
  public static SubLObject inference_new_answer_retrieve_inference_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw0$INFERENCE_NEW_ANSWER && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw0$INFERENCE_NEW_ANSWER );
    }
    return conses_high.getf( event_model.event_message( event ), $kw6$INFERENCE_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2286L)
  public static SubLObject inference_new_answer_retrieve_problem_store_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw0$INFERENCE_NEW_ANSWER && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw0$INFERENCE_NEW_ANSWER );
    }
    return conses_high.getf( event_model.event_message( event ), $kw5$PROBLEM_STORE_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2430L)
  public static SubLObject post_inference_status_change_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject new_status)
  {
    if( NIL != anyone_interested_in_inference_eventP( $kw2$INFERENCE_STATUS_CHANGE ) )
    {
      return post_new_inference_event( $kw2$INFERENCE_STATUS_CHANGE, ConsesLow.list( $kw5$PROBLEM_STORE_ID, problem_store_id, $kw6$INFERENCE_ID, inference_id, $kw10$NEW_STATUS, new_status ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2868L)
  public static SubLObject inference_status_change_retrieve_new_status(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw2$INFERENCE_STATUS_CHANGE && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw2$INFERENCE_STATUS_CHANGE );
    }
    return conses_high.getf( event_model.event_message( event ), $kw10$NEW_STATUS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2868L)
  public static SubLObject inference_status_change_retrieve_inference_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw2$INFERENCE_STATUS_CHANGE && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw2$INFERENCE_STATUS_CHANGE );
    }
    return conses_high.getf( event_model.event_message( event ), $kw6$INFERENCE_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2868L)
  public static SubLObject inference_status_change_retrieve_problem_store_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw2$INFERENCE_STATUS_CHANGE && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw2$INFERENCE_STATUS_CHANGE );
    }
    return conses_high.getf( event_model.event_message( event ), $kw5$PROBLEM_STORE_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3012L)
  public static SubLObject post_inference_new_transformation_depth_reached_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject new_depth)
  {
    if( NIL != anyone_interested_in_inference_eventP( $kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED ) )
    {
      return post_new_inference_event( $kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED, ConsesLow.list( $kw5$PROBLEM_STORE_ID, problem_store_id, $kw6$INFERENCE_ID, inference_id, $kw12$NEW_DEPTH, new_depth ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3505L)
  public static SubLObject inference_new_transformation_depth_reached_retrieve_new_depth(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED );
    }
    return conses_high.getf( event_model.event_message( event ), $kw12$NEW_DEPTH, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3505L)
  public static SubLObject inference_new_transformation_depth_reached_retrieve_inference_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED );
    }
    return conses_high.getf( event_model.event_message( event ), $kw6$INFERENCE_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3505L)
  public static SubLObject inference_new_transformation_depth_reached_retrieve_problem_store_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED );
    }
    return conses_high.getf( event_model.event_message( event ), $kw5$PROBLEM_STORE_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
  public static SubLObject post_sksi_query_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject problem_id, final SubLObject tactic_id, final SubLObject status,
      SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    if( NIL != anyone_interested_in_inference_eventP( $kw4$SKSI_QUERY ) )
    {
      return post_new_inference_event( $kw4$SKSI_QUERY, ConsesLow.listS( $kw5$PROBLEM_STORE_ID, new SubLObject[] { problem_store_id, $kw6$INFERENCE_ID, inference_id, $kw13$PROBLEM_ID, problem_id, $kw14$TACTIC_ID,
        tactic_id, $kw15$STATUS, status, v_properties
      } ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
  public static SubLObject sksi_query_retrieve_end_time(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw4$SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw4$SKSI_QUERY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw16$END_TIME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
  public static SubLObject sksi_query_retrieve_start_time(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw4$SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw4$SKSI_QUERY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw17$START_TIME, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
  public static SubLObject sksi_query_retrieve_status(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw4$SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw4$SKSI_QUERY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw15$STATUS, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
  public static SubLObject sksi_query_retrieve_tactic_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw4$SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw4$SKSI_QUERY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw14$TACTIC_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
  public static SubLObject sksi_query_retrieve_problem_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw4$SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw4$SKSI_QUERY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw13$PROBLEM_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
  public static SubLObject sksi_query_retrieve_inference_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw4$SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw4$SKSI_QUERY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw6$INFERENCE_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
  public static SubLObject sksi_query_retrieve_problem_store_id(final SubLObject event)
  {
    assert NIL != event_model.event_p( event ) : event;
    if( event_model.event_class( event ) != $kw4$SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP( event ) )
    {
      Errors.error( $str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class( event ), $kw4$SKSI_QUERY );
    }
    return conses_high.getf( event_model.event_message( event ), $kw5$PROBLEM_STORE_ID, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 4386L)
  public static SubLObject post_new_inference_event(final SubLObject event_class, final SubLObject v_arguments)
  {
    return post_inference_event( new_inference_event( event_class, v_arguments ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 4566L)
  public static SubLObject new_inference_event(final SubLObject event_class, final SubLObject v_arguments)
  {
    return event_model.new_event( event_class, v_arguments, control_vars.cyc_image_id() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 4685L)
  public static SubLObject post_inference_event(final SubLObject event)
  {
    return event_broker.post_event( event, current_inference_event_broker() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 4792L)
  public static SubLObject anyone_interested_in_inference_eventP(final SubLObject event_class)
  {
    return event_broker.fast_has_event_class_any_transitive_listenersP( event_class, current_inference_event_broker() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 4964L)
  public static SubLObject current_inference_event_broker()
  {
    return event_broker.core_event_broker();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
  public static SubLObject inference_event_dispatcher_runningP()
  {
    return event_utilities.generic_event_dispatcher_process_running_for_application_p( $sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
  public static SubLObject ensure_inference_event_dispatcher_running()
  {
    if( NIL == inference_event_dispatcher_runningP() )
    {
      start_inference_event_dispatcher();
    }
    return event_utilities.generic_event_dispatcher_process();
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
  public static SubLObject register_listener_with_inference_event_dispatcher(final SubLObject listener_var)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $inference_event_dispatcher_lock$.getGlobalValue() );
      if( NIL == Sequences.find( listener_var, $inference_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        $inference_event_dispatcher_listeners$.setGlobalValue( ConsesLow.cons( listener_var, $inference_event_dispatcher_listeners$.getGlobalValue() ) );
        if( NIL != inference_event_dispatcher_runningP() )
        {
          event_broker.register_event_listener( listener_var, NIL );
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $inference_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return listener_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
  public static SubLObject deregister_listener_with_inference_event_dispatcher(final SubLObject listener_var)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $inference_event_dispatcher_lock$.getGlobalValue() );
      $inference_event_dispatcher_listeners$.setGlobalValue( Sequences.remove( listener_var, $inference_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      if( NIL != inference_event_dispatcher_runningP() )
      {
        event_broker.deregister_event_listener( listener_var, NIL );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $inference_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return listener_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
  public static SubLObject stop_inference_event_dispatcher()
  {
    return event_utilities.stop_generic_event_dispatcher_process_for_application( $sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
  public static SubLObject start_inference_event_dispatcher()
  {
    return event_utilities.start_generic_event_dispatcher_process_for_application( $sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_ );
  }

  public static SubLObject declare_inference_event_file()
  {
    SubLFiles.declareFunction( me, "post_inference_new_answer_event", "POST-INFERENCE-NEW-ANSWER-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_new_answer_retrieve_new_answer_id", "INFERENCE-NEW-ANSWER-RETRIEVE-NEW-ANSWER-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_new_answer_retrieve_inference_id", "INFERENCE-NEW-ANSWER-RETRIEVE-INFERENCE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_new_answer_retrieve_problem_store_id", "INFERENCE-NEW-ANSWER-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "post_inference_status_change_event", "POST-INFERENCE-STATUS-CHANGE-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_status_change_retrieve_new_status", "INFERENCE-STATUS-CHANGE-RETRIEVE-NEW-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_status_change_retrieve_inference_id", "INFERENCE-STATUS-CHANGE-RETRIEVE-INFERENCE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_status_change_retrieve_problem_store_id", "INFERENCE-STATUS-CHANGE-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "post_inference_new_transformation_depth_reached_event", "POST-INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "inference_new_transformation_depth_reached_retrieve_new_depth", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-NEW-DEPTH", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_new_transformation_depth_reached_retrieve_inference_id", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-INFERENCE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "inference_new_transformation_depth_reached_retrieve_problem_store_id", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "post_sksi_query_event", "POST-SKSI-QUERY-EVENT", 5, 1, false );
    SubLFiles.declareFunction( me, "sksi_query_retrieve_end_time", "SKSI-QUERY-RETRIEVE-END-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_query_retrieve_start_time", "SKSI-QUERY-RETRIEVE-START-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_query_retrieve_status", "SKSI-QUERY-RETRIEVE-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_query_retrieve_tactic_id", "SKSI-QUERY-RETRIEVE-TACTIC-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_query_retrieve_problem_id", "SKSI-QUERY-RETRIEVE-PROBLEM-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_query_retrieve_inference_id", "SKSI-QUERY-RETRIEVE-INFERENCE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_query_retrieve_problem_store_id", "SKSI-QUERY-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "post_new_inference_event", "POST-NEW-INFERENCE-EVENT", 2, 0, false );
    SubLFiles.declareFunction( me, "new_inference_event", "NEW-INFERENCE-EVENT", 2, 0, false );
    SubLFiles.declareFunction( me, "post_inference_event", "POST-INFERENCE-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "anyone_interested_in_inference_eventP", "ANYONE-INTERESTED-IN-INFERENCE-EVENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "current_inference_event_broker", "CURRENT-INFERENCE-EVENT-BROKER", 0, 0, false );
    SubLFiles.declareFunction( me, "inference_event_dispatcher_runningP", "INFERENCE-EVENT-DISPATCHER-RUNNING?", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_inference_event_dispatcher_running", "ENSURE-INFERENCE-EVENT-DISPATCHER-RUNNING", 0, 0, false );
    SubLFiles.declareFunction( me, "register_listener_with_inference_event_dispatcher", "REGISTER-LISTENER-WITH-INFERENCE-EVENT-DISPATCHER", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_listener_with_inference_event_dispatcher", "DEREGISTER-LISTENER-WITH-INFERENCE-EVENT-DISPATCHER", 1, 0, false );
    SubLFiles.declareFunction( me, "stop_inference_event_dispatcher", "STOP-INFERENCE-EVENT-DISPATCHER", 0, 0, false );
    SubLFiles.declareFunction( me, "start_inference_event_dispatcher", "START-INFERENCE-EVENT-DISPATCHER", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_inference_event_file()
  {
    $inference_event_dispatcher_lock$ = SubLFiles.deflexical( "*INFERENCE-EVENT-DISPATCHER-LOCK*", Locks.make_lock( $str18$INFERENCE_EVENT_DISPATCHER_Lock ) );
    $inference_event_dispatcher_listeners$ = SubLFiles.deflexical( "*INFERENCE-EVENT-DISPATCHER-LISTENERS*", ( maybeDefault( $sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_, $inference_event_dispatcher_listeners$,
        NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_inference_event_file()
  {
    event_model.register_event_class( $kw0$INFERENCE_NEW_ANSWER, $kw1$INFERENCE_EVENT, NIL );
    inference_event_support.note_inference_event_class_properties( $kw0$INFERENCE_NEW_ANSWER, NIL );
    event_model.register_event_class( $kw2$INFERENCE_STATUS_CHANGE, $kw1$INFERENCE_EVENT, NIL );
    inference_event_support.note_inference_event_class_properties( $kw2$INFERENCE_STATUS_CHANGE, $list3 );
    event_model.register_event_class( $kw4$SKSI_QUERY, $kw1$INFERENCE_EVENT, NIL );
    inference_event_support.note_inference_event_class_properties( $kw4$SKSI_QUERY, NIL );
    subl_macro_promotions.declare_defglobal( $sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_inference_event_file();
  }

  @Override
  public void initializeVariables()
  {
    init_inference_event_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_inference_event_file();
  }
  static
  {
    me = new inference_event();
    $inference_event_dispatcher_lock$ = null;
    $inference_event_dispatcher_listeners$ = null;
    $kw0$INFERENCE_NEW_ANSWER = makeKeyword( "INFERENCE-NEW-ANSWER" );
    $kw1$INFERENCE_EVENT = makeKeyword( "INFERENCE-EVENT" );
    $kw2$INFERENCE_STATUS_CHANGE = makeKeyword( "INFERENCE-STATUS-CHANGE" );
    $list3 = ConsesLow.list( makeKeyword( "PROPERTY-CHANGE" ) );
    $kw4$SKSI_QUERY = makeKeyword( "SKSI-QUERY" );
    $kw5$PROBLEM_STORE_ID = makeKeyword( "PROBLEM-STORE-ID" );
    $kw6$INFERENCE_ID = makeKeyword( "INFERENCE-ID" );
    $kw7$NEW_ANSWER_ID = makeKeyword( "NEW-ANSWER-ID" );
    $sym8$EVENT_P = makeSymbol( "EVENT-P" );
    $str9$Event__S_is_of_type__S__not__S_ = makeString( "Event ~S is of type ~S, not ~S." );
    $kw10$NEW_STATUS = makeKeyword( "NEW-STATUS" );
    $kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED = makeKeyword( "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED" );
    $kw12$NEW_DEPTH = makeKeyword( "NEW-DEPTH" );
    $kw13$PROBLEM_ID = makeKeyword( "PROBLEM-ID" );
    $kw14$TACTIC_ID = makeKeyword( "TACTIC-ID" );
    $kw15$STATUS = makeKeyword( "STATUS" );
    $kw16$END_TIME = makeKeyword( "END-TIME" );
    $kw17$START_TIME = makeKeyword( "START-TIME" );
    $str18$INFERENCE_EVENT_DISPATCHER_Lock = makeString( "INFERENCE-EVENT-DISPATCHER Lock" );
    $sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_ = makeSymbol( "*INFERENCE-EVENT-DISPATCHER-LISTENERS*" );
  }
}
/*
 *
 * Total time: 76 ms
 *
 */