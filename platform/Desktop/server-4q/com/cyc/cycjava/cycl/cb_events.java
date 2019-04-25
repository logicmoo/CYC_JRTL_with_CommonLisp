package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cb_events
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cb_events";
  public static final String myFingerPrint = "eb47c84b8f93319fc78f71268d48c644aae8af693e461a3f26548fa071032e54";
  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 2158L)
  private static SubLSymbol $cb_event_dispatcher_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 2158L)
  private static SubLSymbol $cb_event_dispatcher_listeners$;
  private static final SubLSymbol $kw0$CYC_BROWSER_BASE_EVENT;
  private static final SubLSymbol $kw1$CYC_APPLICATION_EVENT;
  private static final SubLSymbol $kw2$CYC_BROWSER_LOGIN_EVENT;
  private static final SubLSymbol $kw3$CYC_BROWSER_SELECTION_EVENT;
  private static final SubLSymbol $kw4$CYC_BROWSER_FORT_SELECTION_EVENT;
  private static final SubLSymbol $kw5$CYC_BROWSER_CONSTANT_SELECTION_EVENT;
  private static final SubLSymbol $kw6$CYC_BROWSER_ASK_EVENT;
  private static final SubLSymbol $kw7$CYC_BROWSER_QUERY_EVENT;
  private static final SubLString $str8$CB_EVENT_DISPATCHER_Lock;
  private static final SubLSymbol $sym9$_CB_EVENT_DISPATCHER_LISTENERS_;
  private static final SubLSymbol $sym10$CONSTANT_P;
  private static final SubLSymbol $sym11$POSSIBLY_SENTENCE_P;
  private static final SubLSymbol $sym12$HLMT_P;
  private static final SubLSymbol $sym13$POSSIBLY_INFERENCE_SENTENCE_P;
  private static final SubLSymbol $sym14$POSSIBLY_MT_P;
  private static final SubLSymbol $sym15$PROPERTY_LIST_P;
  private static final SubLSymbol $sym16$QUERY_PROPERTY_P;

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 2158L)
  public static SubLObject cb_event_dispatcher_runningP()
  {
    return event_utilities.generic_event_dispatcher_process_running_for_application_p( $sym9$_CB_EVENT_DISPATCHER_LISTENERS_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 2158L)
  public static SubLObject ensure_cb_event_dispatcher_running()
  {
    if( NIL == cb_event_dispatcher_runningP() )
    {
      start_cb_event_dispatcher();
    }
    return event_utilities.generic_event_dispatcher_process();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 2158L)
  public static SubLObject register_listener_with_cb_event_dispatcher(final SubLObject listener_var)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $cb_event_dispatcher_lock$.getGlobalValue() );
      if( NIL == Sequences.find( listener_var, $cb_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        $cb_event_dispatcher_listeners$.setGlobalValue( ConsesLow.cons( listener_var, $cb_event_dispatcher_listeners$.getGlobalValue() ) );
        if( NIL != cb_event_dispatcher_runningP() )
        {
          event_broker.register_event_listener( listener_var, NIL );
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $cb_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return listener_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 2158L)
  public static SubLObject deregister_listener_with_cb_event_dispatcher(final SubLObject listener_var)
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $cb_event_dispatcher_lock$.getGlobalValue() );
      $cb_event_dispatcher_listeners$.setGlobalValue( Sequences.remove( listener_var, $cb_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      if( NIL != cb_event_dispatcher_runningP() )
      {
        event_broker.deregister_event_listener( listener_var, NIL );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $cb_event_dispatcher_lock$.getGlobalValue() );
      }
    }
    return listener_var;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 2158L)
  public static SubLObject stop_cb_event_dispatcher()
  {
    return event_utilities.stop_generic_event_dispatcher_process_for_application( $sym9$_CB_EVENT_DISPATCHER_LISTENERS_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 2158L)
  public static SubLObject start_cb_event_dispatcher()
  {
    return event_utilities.start_generic_event_dispatcher_process_for_application( $sym9$_CB_EVENT_DISPATCHER_LISTENERS_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 2442L)
  public static SubLObject cb_post_login_event(final SubLObject cyclist)
  {
    if( NIL != cb_event_posting_requestedP() )
    {
      event_broker.post_event( new_cb_login_event( cyclist ), cb_event_broker() );
    }
    return cyclist;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 2639L)
  public static SubLObject cb_post_constant_selection_event(final SubLObject constant)
  {
    assert NIL != constant_handles.constant_p( constant ) : constant;
    if( NIL != cb_event_posting_requestedP() )
    {
      event_broker.post_event( new_cb_constant_selection_event( constant ), cb_event_broker() );
    }
    return constant;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 2881L)
  public static SubLObject cb_post_ask_event(final SubLObject query_formula, final SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth)
  {
    if( backchain == UNPROVIDED )
    {
      backchain = NIL;
    }
    if( number == UNPROVIDED )
    {
      number = NIL;
    }
    if( time == UNPROVIDED )
    {
      time = NIL;
    }
    if( depth == UNPROVIDED )
    {
      depth = NIL;
    }
    assert NIL != el_utilities.possibly_sentence_p( query_formula ) : query_formula;
    assert NIL != hlmt.hlmt_p( mt ) : mt;
    if( NIL != cb_event_posting_requestedP() )
    {
      event_broker.post_event( new_cb_ask_event( query_formula, mt, backchain, number, time, depth ), cb_event_broker() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 3252L)
  public static SubLObject cb_post_query_event(final SubLObject query_sentence, SubLObject mt, SubLObject v_properties)
  {
    if( mt == UNPROVIDED )
    {
      mt = NIL;
    }
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    assert NIL != el_utilities.possibly_inference_sentence_p( query_sentence ) : query_sentence;
    if( NIL != mt && !assertionsDisabledInClass && NIL == hlmt.possibly_mt_p( mt ) )
    {
      throw new AssertionError( mt );
    }
    final SubLObject plist_var = v_properties;
    assert NIL != list_utilities.property_list_p( plist_var ) : plist_var;
    SubLObject remainder;
    SubLObject property;
    SubLObject value;
    for( remainder = NIL, remainder = plist_var; NIL != remainder; remainder = conses_high.cddr( remainder ) )
    {
      property = remainder.first();
      value = conses_high.cadr( remainder );
      assert NIL != inference_datastructures_enumerated_types.query_property_p( property ) : property;
    }
    if( NIL != cb_event_posting_requestedP() )
    {
      event_broker.post_event( new_cb_query_event( query_sentence, mt, v_properties ), cb_event_broker() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 3629L)
  public static SubLObject new_cb_login_event(final SubLObject cyclist)
  {
    return event_model.new_event( $kw2$CYC_BROWSER_LOGIN_EVENT, cyclist, html_kernel.http_state_key_for_request() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 3801L)
  public static SubLObject new_cb_constant_selection_event(final SubLObject constant)
  {
    return event_model.new_event( $kw5$CYC_BROWSER_CONSTANT_SELECTION_EVENT, constant, html_kernel.http_state_key_for_request() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 3978L)
  public static SubLObject new_cb_ask_event(final SubLObject query_formula, final SubLObject mt, final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth)
  {
    return event_model.new_event( $kw6$CYC_BROWSER_ASK_EVENT, ConsesLow.list( query_formula, mt, backchain, number, time, depth ), html_kernel.http_state_key_for_request() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 4193L)
  public static SubLObject new_cb_query_event(final SubLObject query_sentence, final SubLObject mt, final SubLObject v_properties)
  {
    return event_model.new_event( $kw7$CYC_BROWSER_QUERY_EVENT, ConsesLow.list( query_sentence, mt, v_properties ), html_kernel.http_state_key_for_request() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 4379L)
  public static SubLObject cb_event_broker()
  {
    return event_broker.core_event_broker();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cb-events.lisp", position = 4455L)
  public static SubLObject cb_event_posting_requestedP()
  {
    if( NIL != system_info.cycorp_execution_context_p() )
    {
      ensure_cb_event_dispatcher_running();
      return T;
    }
    return NIL;
  }

  public static SubLObject declare_cb_events_file()
  {
    SubLFiles.declareFunction( me, "cb_event_dispatcher_runningP", "CB-EVENT-DISPATCHER-RUNNING?", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_cb_event_dispatcher_running", "ENSURE-CB-EVENT-DISPATCHER-RUNNING", 0, 0, false );
    SubLFiles.declareFunction( me, "register_listener_with_cb_event_dispatcher", "REGISTER-LISTENER-WITH-CB-EVENT-DISPATCHER", 1, 0, false );
    SubLFiles.declareFunction( me, "deregister_listener_with_cb_event_dispatcher", "DEREGISTER-LISTENER-WITH-CB-EVENT-DISPATCHER", 1, 0, false );
    SubLFiles.declareFunction( me, "stop_cb_event_dispatcher", "STOP-CB-EVENT-DISPATCHER", 0, 0, false );
    SubLFiles.declareFunction( me, "start_cb_event_dispatcher", "START-CB-EVENT-DISPATCHER", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_post_login_event", "CB-POST-LOGIN-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_post_constant_selection_event", "CB-POST-CONSTANT-SELECTION-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "cb_post_ask_event", "CB-POST-ASK-EVENT", 2, 4, false );
    SubLFiles.declareFunction( me, "cb_post_query_event", "CB-POST-QUERY-EVENT", 1, 2, false );
    SubLFiles.declareFunction( me, "new_cb_login_event", "NEW-CB-LOGIN-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cb_constant_selection_event", "NEW-CB-CONSTANT-SELECTION-EVENT", 1, 0, false );
    SubLFiles.declareFunction( me, "new_cb_ask_event", "NEW-CB-ASK-EVENT", 6, 0, false );
    SubLFiles.declareFunction( me, "new_cb_query_event", "NEW-CB-QUERY-EVENT", 3, 0, false );
    SubLFiles.declareFunction( me, "cb_event_broker", "CB-EVENT-BROKER", 0, 0, false );
    SubLFiles.declareFunction( me, "cb_event_posting_requestedP", "CB-EVENT-POSTING-REQUESTED?", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_cb_events_file()
  {
    $cb_event_dispatcher_lock$ = SubLFiles.deflexical( "*CB-EVENT-DISPATCHER-LOCK*", Locks.make_lock( $str8$CB_EVENT_DISPATCHER_Lock ) );
    $cb_event_dispatcher_listeners$ = SubLFiles.deflexical( "*CB-EVENT-DISPATCHER-LISTENERS*", ( maybeDefault( $sym9$_CB_EVENT_DISPATCHER_LISTENERS_, $cb_event_dispatcher_listeners$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_cb_events_file()
  {
    event_model.register_event_class( $kw0$CYC_BROWSER_BASE_EVENT, $kw1$CYC_APPLICATION_EVENT, NIL );
    event_model.register_event_class( $kw2$CYC_BROWSER_LOGIN_EVENT, $kw0$CYC_BROWSER_BASE_EVENT, NIL );
    event_model.register_event_class( $kw3$CYC_BROWSER_SELECTION_EVENT, $kw0$CYC_BROWSER_BASE_EVENT, NIL );
    event_model.register_event_class( $kw4$CYC_BROWSER_FORT_SELECTION_EVENT, $kw3$CYC_BROWSER_SELECTION_EVENT, NIL );
    event_model.register_event_class( $kw5$CYC_BROWSER_CONSTANT_SELECTION_EVENT, $kw4$CYC_BROWSER_FORT_SELECTION_EVENT, NIL );
    event_model.register_event_class( $kw6$CYC_BROWSER_ASK_EVENT, $kw0$CYC_BROWSER_BASE_EVENT, NIL );
    event_model.register_event_class( $kw7$CYC_BROWSER_QUERY_EVENT, $kw0$CYC_BROWSER_BASE_EVENT, NIL );
    subl_macro_promotions.declare_defglobal( $sym9$_CB_EVENT_DISPATCHER_LISTENERS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_cb_events_file();
  }

  @Override
  public void initializeVariables()
  {
    init_cb_events_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_cb_events_file();
  }
  static
  {
    me = new cb_events();
    $cb_event_dispatcher_lock$ = null;
    $cb_event_dispatcher_listeners$ = null;
    $kw0$CYC_BROWSER_BASE_EVENT = makeKeyword( "CYC-BROWSER-BASE-EVENT" );
    $kw1$CYC_APPLICATION_EVENT = makeKeyword( "CYC-APPLICATION-EVENT" );
    $kw2$CYC_BROWSER_LOGIN_EVENT = makeKeyword( "CYC-BROWSER-LOGIN-EVENT" );
    $kw3$CYC_BROWSER_SELECTION_EVENT = makeKeyword( "CYC-BROWSER-SELECTION-EVENT" );
    $kw4$CYC_BROWSER_FORT_SELECTION_EVENT = makeKeyword( "CYC-BROWSER-FORT-SELECTION-EVENT" );
    $kw5$CYC_BROWSER_CONSTANT_SELECTION_EVENT = makeKeyword( "CYC-BROWSER-CONSTANT-SELECTION-EVENT" );
    $kw6$CYC_BROWSER_ASK_EVENT = makeKeyword( "CYC-BROWSER-ASK-EVENT" );
    $kw7$CYC_BROWSER_QUERY_EVENT = makeKeyword( "CYC-BROWSER-QUERY-EVENT" );
    $str8$CB_EVENT_DISPATCHER_Lock = makeString( "CB-EVENT-DISPATCHER Lock" );
    $sym9$_CB_EVENT_DISPATCHER_LISTENERS_ = makeSymbol( "*CB-EVENT-DISPATCHER-LISTENERS*" );
    $sym10$CONSTANT_P = makeSymbol( "CONSTANT-P" );
    $sym11$POSSIBLY_SENTENCE_P = makeSymbol( "POSSIBLY-SENTENCE-P" );
    $sym12$HLMT_P = makeSymbol( "HLMT-P" );
    $sym13$POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol( "POSSIBLY-INFERENCE-SENTENCE-P" );
    $sym14$POSSIBLY_MT_P = makeSymbol( "POSSIBLY-MT-P" );
    $sym15$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $sym16$QUERY_PROPERTY_P = makeSymbol( "QUERY-PROPERTY-P" );
  }
}
/*
 * 
 * Total time: 101 ms synthetic
 */