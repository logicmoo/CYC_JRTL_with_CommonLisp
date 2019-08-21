package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cb_events;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.cb_events.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cb_events extends SubLTranslatedFile {
    public static final SubLFile me = new cb_events();

    public static final String myName = "com.cyc.cycjava.cycl.cb_events";

    public static final String myFingerPrint = "eb47c84b8f93319fc78f71268d48c644aae8af693e461a3f26548fa071032e54";

    // deflexical
    private static final SubLSymbol $cb_event_dispatcher_lock$ = makeSymbol("*CB-EVENT-DISPATCHER-LOCK*");



    private static final SubLSymbol $CYC_BROWSER_BASE_EVENT = makeKeyword("CYC-BROWSER-BASE-EVENT");

    private static final SubLSymbol $CYC_APPLICATION_EVENT = makeKeyword("CYC-APPLICATION-EVENT");

    private static final SubLSymbol $CYC_BROWSER_LOGIN_EVENT = makeKeyword("CYC-BROWSER-LOGIN-EVENT");

    private static final SubLSymbol $CYC_BROWSER_SELECTION_EVENT = makeKeyword("CYC-BROWSER-SELECTION-EVENT");

    private static final SubLSymbol $CYC_BROWSER_FORT_SELECTION_EVENT = makeKeyword("CYC-BROWSER-FORT-SELECTION-EVENT");

    private static final SubLSymbol $CYC_BROWSER_CONSTANT_SELECTION_EVENT = makeKeyword("CYC-BROWSER-CONSTANT-SELECTION-EVENT");

    private static final SubLSymbol $CYC_BROWSER_ASK_EVENT = makeKeyword("CYC-BROWSER-ASK-EVENT");

    private static final SubLSymbol $CYC_BROWSER_QUERY_EVENT = makeKeyword("CYC-BROWSER-QUERY-EVENT");

    public static final SubLString $str8$CB_EVENT_DISPATCHER_Lock = makeString("CB-EVENT-DISPATCHER Lock");

    public static final SubLSymbol $cb_event_dispatcher_listeners$ = makeSymbol("*CB-EVENT-DISPATCHER-LISTENERS*");







    public static final SubLSymbol POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P");







    public static SubLObject cb_event_dispatcher_runningP() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p($cb_event_dispatcher_listeners$);
    }

    public static SubLObject ensure_cb_event_dispatcher_running() {
        if (NIL == cb_event_dispatcher_runningP()) {
            start_cb_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }

    public static SubLObject register_listener_with_cb_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = NIL;
        try {
            release = seize_lock($cb_event_dispatcher_lock$.getGlobalValue());
            if (NIL == find(listener_var, $cb_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                $cb_event_dispatcher_listeners$.setGlobalValue(cons(listener_var, $cb_event_dispatcher_listeners$.getGlobalValue()));
                if (NIL != cb_event_dispatcher_runningP()) {
                    event_broker.register_event_listener(listener_var, NIL);
                }
            }
        } finally {
            if (NIL != release) {
                release_lock($cb_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }

    public static SubLObject deregister_listener_with_cb_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = NIL;
        try {
            release = seize_lock($cb_event_dispatcher_lock$.getGlobalValue());
            $cb_event_dispatcher_listeners$.setGlobalValue(remove(listener_var, $cb_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL != cb_event_dispatcher_runningP()) {
                event_broker.deregister_event_listener(listener_var, NIL);
            }
        } finally {
            if (NIL != release) {
                release_lock($cb_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }

    public static SubLObject stop_cb_event_dispatcher() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application($cb_event_dispatcher_listeners$);
    }

    public static SubLObject start_cb_event_dispatcher() {
        return event_utilities.start_generic_event_dispatcher_process_for_application($cb_event_dispatcher_listeners$);
    }

    public static SubLObject cb_post_login_event(final SubLObject cyclist) {
        if (NIL != cb_event_posting_requestedP()) {
            event_broker.post_event(new_cb_login_event(cyclist), cb_event_broker());
        }
        return cyclist;
    }

    public static SubLObject cb_post_constant_selection_event(final SubLObject constant) {
        assert NIL != constant_p(constant) : "constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) " + constant;
        if (NIL != cb_event_posting_requestedP()) {
            event_broker.post_event(new_cb_constant_selection_event(constant), cb_event_broker());
        }
        return constant;
    }

    public static SubLObject cb_post_ask_event(final SubLObject query_formula, final SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        assert NIL != possibly_sentence_p(query_formula) : "el_utilities.possibly_sentence_p(query_formula) " + "CommonSymbols.NIL != el_utilities.possibly_sentence_p(query_formula) " + query_formula;
        assert NIL != hlmt.hlmt_p(mt) : "hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) " + mt;
        if (NIL != cb_event_posting_requestedP()) {
            event_broker.post_event(new_cb_ask_event(query_formula, mt, backchain, number, time, depth), cb_event_broker());
        }
        return NIL;
    }

    public static SubLObject cb_post_query_event(final SubLObject query_sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        assert NIL != possibly_inference_sentence_p(query_sentence) : "el_utilities.possibly_inference_sentence_p(query_sentence) " + "CommonSymbols.NIL != el_utilities.possibly_inference_sentence_p(query_sentence) " + query_sentence;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.possibly_mt_p(mt))) {
            throw new AssertionError(mt);
        }
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) " + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) " + property;
        }
        if (NIL != cb_event_posting_requestedP()) {
            event_broker.post_event(new_cb_query_event(query_sentence, mt, v_properties), cb_event_broker());
        }
        return NIL;
    }

    public static SubLObject new_cb_login_event(final SubLObject cyclist) {
        return event_model.new_event($CYC_BROWSER_LOGIN_EVENT, cyclist, html_kernel.http_state_key_for_request());
    }

    public static SubLObject new_cb_constant_selection_event(final SubLObject constant) {
        return event_model.new_event($CYC_BROWSER_CONSTANT_SELECTION_EVENT, constant, html_kernel.http_state_key_for_request());
    }

    public static SubLObject new_cb_ask_event(final SubLObject query_formula, final SubLObject mt, final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth) {
        return event_model.new_event($CYC_BROWSER_ASK_EVENT, list(query_formula, mt, backchain, number, time, depth), html_kernel.http_state_key_for_request());
    }

    public static SubLObject new_cb_query_event(final SubLObject query_sentence, final SubLObject mt, final SubLObject v_properties) {
        return event_model.new_event($CYC_BROWSER_QUERY_EVENT, list(query_sentence, mt, v_properties), html_kernel.http_state_key_for_request());
    }

    public static SubLObject cb_event_broker() {
        return event_broker.core_event_broker();
    }

    public static SubLObject cb_event_posting_requestedP() {
        if (NIL != system_info.cycorp_execution_context_p()) {
            ensure_cb_event_dispatcher_running();
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_cb_events_file() {
        declareFunction(me, "cb_event_dispatcher_runningP", "CB-EVENT-DISPATCHER-RUNNING?", 0, 0, false);
        declareFunction(me, "ensure_cb_event_dispatcher_running", "ENSURE-CB-EVENT-DISPATCHER-RUNNING", 0, 0, false);
        declareFunction(me, "register_listener_with_cb_event_dispatcher", "REGISTER-LISTENER-WITH-CB-EVENT-DISPATCHER", 1, 0, false);
        declareFunction(me, "deregister_listener_with_cb_event_dispatcher", "DEREGISTER-LISTENER-WITH-CB-EVENT-DISPATCHER", 1, 0, false);
        declareFunction(me, "stop_cb_event_dispatcher", "STOP-CB-EVENT-DISPATCHER", 0, 0, false);
        declareFunction(me, "start_cb_event_dispatcher", "START-CB-EVENT-DISPATCHER", 0, 0, false);
        declareFunction(me, "cb_post_login_event", "CB-POST-LOGIN-EVENT", 1, 0, false);
        declareFunction(me, "cb_post_constant_selection_event", "CB-POST-CONSTANT-SELECTION-EVENT", 1, 0, false);
        declareFunction(me, "cb_post_ask_event", "CB-POST-ASK-EVENT", 2, 4, false);
        declareFunction(me, "cb_post_query_event", "CB-POST-QUERY-EVENT", 1, 2, false);
        declareFunction(me, "new_cb_login_event", "NEW-CB-LOGIN-EVENT", 1, 0, false);
        declareFunction(me, "new_cb_constant_selection_event", "NEW-CB-CONSTANT-SELECTION-EVENT", 1, 0, false);
        declareFunction(me, "new_cb_ask_event", "NEW-CB-ASK-EVENT", 6, 0, false);
        declareFunction(me, "new_cb_query_event", "NEW-CB-QUERY-EVENT", 3, 0, false);
        declareFunction(me, "cb_event_broker", "CB-EVENT-BROKER", 0, 0, false);
        declareFunction(me, "cb_event_posting_requestedP", "CB-EVENT-POSTING-REQUESTED?", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_cb_events_file() {
        deflexical("*CB-EVENT-DISPATCHER-LOCK*", make_lock($str8$CB_EVENT_DISPATCHER_Lock));
        deflexical("*CB-EVENT-DISPATCHER-LISTENERS*", SubLTrampolineFile.maybeDefault($cb_event_dispatcher_listeners$, $cb_event_dispatcher_listeners$, NIL));
        return NIL;
    }

    public static SubLObject setup_cb_events_file() {
        event_model.register_event_class($CYC_BROWSER_BASE_EVENT, $CYC_APPLICATION_EVENT, NIL);
        event_model.register_event_class($CYC_BROWSER_LOGIN_EVENT, $CYC_BROWSER_BASE_EVENT, NIL);
        event_model.register_event_class($CYC_BROWSER_SELECTION_EVENT, $CYC_BROWSER_BASE_EVENT, NIL);
        event_model.register_event_class($CYC_BROWSER_FORT_SELECTION_EVENT, $CYC_BROWSER_SELECTION_EVENT, NIL);
        event_model.register_event_class($CYC_BROWSER_CONSTANT_SELECTION_EVENT, $CYC_BROWSER_FORT_SELECTION_EVENT, NIL);
        event_model.register_event_class($CYC_BROWSER_ASK_EVENT, $CYC_BROWSER_BASE_EVENT, NIL);
        event_model.register_event_class($CYC_BROWSER_QUERY_EVENT, $CYC_BROWSER_BASE_EVENT, NIL);
        declare_defglobal($cb_event_dispatcher_listeners$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cb_events_file();
    }

    @Override
    public void initializeVariables() {
        init_cb_events_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cb_events_file();
    }

    static {




















    }
}

/**
 * Total time: 101 ms synthetic
 */
