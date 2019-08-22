/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_inference_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_sentence_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cb_events extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new cb_events();

 public static final String myName = "com.cyc.cycjava.cycl.cb_events";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cb_event_dispatcher_lock$ = makeSymbol("*CB-EVENT-DISPATCHER-LOCK*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $CYC_BROWSER_BASE_EVENT = makeKeyword("CYC-BROWSER-BASE-EVENT");

    private static final SubLSymbol $CYC_APPLICATION_EVENT = makeKeyword("CYC-APPLICATION-EVENT");

    private static final SubLSymbol $CYC_BROWSER_LOGIN_EVENT = makeKeyword("CYC-BROWSER-LOGIN-EVENT");

    private static final SubLSymbol $CYC_BROWSER_SELECTION_EVENT = makeKeyword("CYC-BROWSER-SELECTION-EVENT");

    private static final SubLSymbol $CYC_BROWSER_FORT_SELECTION_EVENT = makeKeyword("CYC-BROWSER-FORT-SELECTION-EVENT");

    private static final SubLSymbol $CYC_BROWSER_CONSTANT_SELECTION_EVENT = makeKeyword("CYC-BROWSER-CONSTANT-SELECTION-EVENT");

    private static final SubLSymbol $CYC_BROWSER_ASK_EVENT = makeKeyword("CYC-BROWSER-ASK-EVENT");

    private static final SubLSymbol $CYC_BROWSER_QUERY_EVENT = makeKeyword("CYC-BROWSER-QUERY-EVENT");

    static private final SubLString $str8$CB_EVENT_DISPATCHER_Lock = makeString("CB-EVENT-DISPATCHER Lock");

    public static final SubLSymbol $cb_event_dispatcher_listeners$ = makeSymbol("*CB-EVENT-DISPATCHER-LISTENERS*");

    private static final SubLSymbol POSSIBLY_INFERENCE_SENTENCE_P = makeSymbol("POSSIBLY-INFERENCE-SENTENCE-P");

    public static final SubLObject cb_event_dispatcher_runningP_alt() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p($cb_event_dispatcher_listeners$);
    }

    public static SubLObject cb_event_dispatcher_runningP() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p($cb_event_dispatcher_listeners$);
    }

    public static final SubLObject ensure_cb_event_dispatcher_running_alt() {
        if (NIL == com.cyc.cycjava.cycl.cb_events.cb_event_dispatcher_runningP()) {
            com.cyc.cycjava.cycl.cb_events.start_cb_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }

    public static SubLObject ensure_cb_event_dispatcher_running() {
        if (NIL == cb_event_dispatcher_runningP()) {
            start_cb_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }

    public static final SubLObject register_listener_with_cb_event_dispatcher_alt(SubLObject listener_var) {
        {
            SubLObject lock = $cb_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == find(listener_var, $cb_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    $cb_event_dispatcher_listeners$.setGlobalValue(cons(listener_var, $cb_event_dispatcher_listeners$.getGlobalValue()));
                    if (NIL != com.cyc.cycjava.cycl.cb_events.cb_event_dispatcher_runningP()) {
                        event_broker.register_event_listener(listener_var, NIL);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return listener_var;
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

    public static final SubLObject deregister_listener_with_cb_event_dispatcher_alt(SubLObject listener_var) {
        {
            SubLObject lock = $cb_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $cb_event_dispatcher_listeners$.setGlobalValue(remove(listener_var, $cb_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL != com.cyc.cycjava.cycl.cb_events.cb_event_dispatcher_runningP()) {
                    event_broker.deregister_event_listener(listener_var, NIL);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
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

    public static final SubLObject stop_cb_event_dispatcher_alt() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application($cb_event_dispatcher_listeners$);
    }

    public static SubLObject stop_cb_event_dispatcher() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application($cb_event_dispatcher_listeners$);
    }

    public static final SubLObject start_cb_event_dispatcher_alt() {
        return event_utilities.start_generic_event_dispatcher_process_for_application($cb_event_dispatcher_listeners$);
    }

    public static SubLObject start_cb_event_dispatcher() {
        return event_utilities.start_generic_event_dispatcher_process_for_application($cb_event_dispatcher_listeners$);
    }

    public static final SubLObject cb_post_login_event_alt(SubLObject cyclist) {
        if (NIL != com.cyc.cycjava.cycl.cb_events.cb_event_posting_requestedP()) {
            event_broker.post_event(com.cyc.cycjava.cycl.cb_events.new_cb_login_event(cyclist), com.cyc.cycjava.cycl.cb_events.cb_event_broker());
        }
        return cyclist;
    }

    public static SubLObject cb_post_login_event(final SubLObject cyclist) {
        if (NIL != cb_event_posting_requestedP()) {
            event_broker.post_event(new_cb_login_event(cyclist), cb_event_broker());
        }
        return cyclist;
    }

    public static final SubLObject cb_post_constant_selection_event_alt(SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        if (NIL != com.cyc.cycjava.cycl.cb_events.cb_event_posting_requestedP()) {
            event_broker.post_event(com.cyc.cycjava.cycl.cb_events.new_cb_constant_selection_event(constant), com.cyc.cycjava.cycl.cb_events.cb_event_broker());
        }
        return constant;
    }

    public static SubLObject cb_post_constant_selection_event(final SubLObject constant) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        if (NIL != cb_event_posting_requestedP()) {
            event_broker.post_event(new_cb_constant_selection_event(constant), cb_event_broker());
        }
        return constant;
    }

    public static final SubLObject cb_post_ask_event_alt(SubLObject query_formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
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
        SubLTrampolineFile.checkType(query_formula, POSSIBLY_SENTENCE_P);
        SubLTrampolineFile.checkType(mt, HLMT_P);
        if (NIL != com.cyc.cycjava.cycl.cb_events.cb_event_posting_requestedP()) {
            event_broker.post_event(com.cyc.cycjava.cycl.cb_events.new_cb_ask_event(query_formula, mt, backchain, number, time, depth), com.cyc.cycjava.cycl.cb_events.cb_event_broker());
        }
        return NIL;
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
        assert NIL != possibly_sentence_p(query_formula) : "! el_utilities.possibly_sentence_p(query_formula) " + ("el_utilities.possibly_sentence_p(query_formula) " + "CommonSymbols.NIL != el_utilities.possibly_sentence_p(query_formula) ") + query_formula;
        assert NIL != hlmt.hlmt_p(mt) : "! hlmt.hlmt_p(mt) " + ("hlmt.hlmt_p(mt) " + "CommonSymbols.NIL != hlmt.hlmt_p(mt) ") + mt;
        if (NIL != cb_event_posting_requestedP()) {
            event_broker.post_event(new_cb_ask_event(query_formula, mt, backchain, number, time, depth), cb_event_broker());
        }
        return NIL;
    }

    public static final SubLObject cb_post_query_event_alt(SubLObject query_sentence, SubLObject mt, SubLObject v_properties) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLTrampolineFile.checkType(query_sentence, POSSIBLY_INFERENCE_SENTENCE_P);
        if (NIL != mt) {
            SubLTrampolineFile.checkType(mt, POSSIBLY_MT_P);
        }
        {
            SubLObject plist_var = v_properties;
            SubLTrampolineFile.checkType(plist_var, PROPERTY_LIST_P);
            {
                SubLObject remainder = NIL;
                for (remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
                    {
                        SubLObject property = remainder.first();
                        SubLObject value = cadr(remainder);
                        SubLTrampolineFile.checkType(property, QUERY_PROPERTY_P);
                    }
                }
            }
        }
        if (NIL != com.cyc.cycjava.cycl.cb_events.cb_event_posting_requestedP()) {
            event_broker.post_event(com.cyc.cycjava.cycl.cb_events.new_cb_query_event(query_sentence, mt, v_properties), com.cyc.cycjava.cycl.cb_events.cb_event_broker());
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
        assert NIL != possibly_inference_sentence_p(query_sentence) : "! el_utilities.possibly_inference_sentence_p(query_sentence) " + ("el_utilities.possibly_inference_sentence_p(query_sentence) " + "CommonSymbols.NIL != el_utilities.possibly_inference_sentence_p(query_sentence) ") + query_sentence;
        if (((NIL != mt) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == hlmt.possibly_mt_p(mt))) {
            throw new AssertionError(mt);
        }
        final SubLObject plist_var = v_properties;
        assert NIL != list_utilities.property_list_p(plist_var) : "! list_utilities.property_list_p(plist_var) " + ("list_utilities.property_list_p(plist_var) " + "CommonSymbols.NIL != list_utilities.property_list_p(plist_var) ") + plist_var;
        SubLObject remainder;
        SubLObject property;
        SubLObject value;
        for (remainder = NIL, remainder = plist_var; NIL != remainder; remainder = cddr(remainder)) {
            property = remainder.first();
            value = cadr(remainder);
            assert NIL != inference_datastructures_enumerated_types.query_property_p(property) : "! inference_datastructures_enumerated_types.query_property_p(property) " + ("inference_datastructures_enumerated_types.query_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.query_property_p(property) ") + property;
        }
        if (NIL != cb_event_posting_requestedP()) {
            event_broker.post_event(new_cb_query_event(query_sentence, mt, v_properties), cb_event_broker());
        }
        return NIL;
    }

    public static final SubLObject new_cb_login_event_alt(SubLObject cyclist) {
        return event_model.new_event($CYC_BROWSER_LOGIN_EVENT, cyclist, html_kernel.http_state_key_for_request());
    }

    public static SubLObject new_cb_login_event(final SubLObject cyclist) {
        return event_model.new_event($CYC_BROWSER_LOGIN_EVENT, cyclist, html_kernel.http_state_key_for_request());
    }

    public static final SubLObject new_cb_constant_selection_event_alt(SubLObject constant) {
        return event_model.new_event($CYC_BROWSER_CONSTANT_SELECTION_EVENT, constant, html_kernel.http_state_key_for_request());
    }

    public static SubLObject new_cb_constant_selection_event(final SubLObject constant) {
        return event_model.new_event($CYC_BROWSER_CONSTANT_SELECTION_EVENT, constant, html_kernel.http_state_key_for_request());
    }

    public static final SubLObject new_cb_ask_event_alt(SubLObject query_formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        return event_model.new_event($CYC_BROWSER_ASK_EVENT, list(query_formula, mt, backchain, number, time, depth), html_kernel.http_state_key_for_request());
    }

    public static SubLObject new_cb_ask_event(final SubLObject query_formula, final SubLObject mt, final SubLObject backchain, final SubLObject number, final SubLObject time, final SubLObject depth) {
        return event_model.new_event($CYC_BROWSER_ASK_EVENT, list(query_formula, mt, backchain, number, time, depth), html_kernel.http_state_key_for_request());
    }

    public static final SubLObject new_cb_query_event_alt(SubLObject query_sentence, SubLObject mt, SubLObject v_properties) {
        return event_model.new_event($CYC_BROWSER_QUERY_EVENT, list(query_sentence, mt, v_properties), html_kernel.http_state_key_for_request());
    }

    public static SubLObject new_cb_query_event(final SubLObject query_sentence, final SubLObject mt, final SubLObject v_properties) {
        return event_model.new_event($CYC_BROWSER_QUERY_EVENT, list(query_sentence, mt, v_properties), html_kernel.http_state_key_for_request());
    }

    public static final SubLObject cb_event_broker_alt() {
        return event_broker.core_event_broker();
    }

    public static SubLObject cb_event_broker() {
        return event_broker.core_event_broker();
    }

    public static final SubLObject cb_event_posting_requestedP_alt() {
        if (NIL != system_info.cycorp_execution_context_p()) {
            com.cyc.cycjava.cycl.cb_events.ensure_cb_event_dispatcher_running();
            return T;
        }
        return NIL;
    }

    public static SubLObject cb_event_posting_requestedP() {
        if (NIL != system_info.cycorp_execution_context_p()) {
            ensure_cb_event_dispatcher_running();
            return T;
        }
        return NIL;
    }

    public static SubLObject declare_cb_events_file() {
        declareFunction("cb_event_dispatcher_runningP", "CB-EVENT-DISPATCHER-RUNNING?", 0, 0, false);
        declareFunction("ensure_cb_event_dispatcher_running", "ENSURE-CB-EVENT-DISPATCHER-RUNNING", 0, 0, false);
        declareFunction("register_listener_with_cb_event_dispatcher", "REGISTER-LISTENER-WITH-CB-EVENT-DISPATCHER", 1, 0, false);
        declareFunction("deregister_listener_with_cb_event_dispatcher", "DEREGISTER-LISTENER-WITH-CB-EVENT-DISPATCHER", 1, 0, false);
        declareFunction("stop_cb_event_dispatcher", "STOP-CB-EVENT-DISPATCHER", 0, 0, false);
        declareFunction("start_cb_event_dispatcher", "START-CB-EVENT-DISPATCHER", 0, 0, false);
        declareFunction("cb_post_login_event", "CB-POST-LOGIN-EVENT", 1, 0, false);
        declareFunction("cb_post_constant_selection_event", "CB-POST-CONSTANT-SELECTION-EVENT", 1, 0, false);
        declareFunction("cb_post_ask_event", "CB-POST-ASK-EVENT", 2, 4, false);
        declareFunction("cb_post_query_event", "CB-POST-QUERY-EVENT", 1, 2, false);
        declareFunction("new_cb_login_event", "NEW-CB-LOGIN-EVENT", 1, 0, false);
        declareFunction("new_cb_constant_selection_event", "NEW-CB-CONSTANT-SELECTION-EVENT", 1, 0, false);
        declareFunction("new_cb_ask_event", "NEW-CB-ASK-EVENT", 6, 0, false);
        declareFunction("new_cb_query_event", "NEW-CB-QUERY-EVENT", 3, 0, false);
        declareFunction("cb_event_broker", "CB-EVENT-BROKER", 0, 0, false);
        declareFunction("cb_event_posting_requestedP", "CB-EVENT-POSTING-REQUESTED?", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_cb_events_file_alt() {
        deflexical("*CB-EVENT-DISPATCHER-LOCK*", make_lock($str_alt8$CB_EVENT_DISPATCHER_Lock));
        deflexical("*CB-EVENT-DISPATCHER-LISTENERS*", NIL != boundp($cb_event_dispatcher_listeners$) ? ((SubLObject) ($cb_event_dispatcher_listeners$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_cb_events_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CB-EVENT-DISPATCHER-LOCK*", make_lock($str8$CB_EVENT_DISPATCHER_Lock));
            deflexical("*CB-EVENT-DISPATCHER-LISTENERS*", SubLTrampolineFile.maybeDefault($cb_event_dispatcher_listeners$, $cb_event_dispatcher_listeners$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CB-EVENT-DISPATCHER-LISTENERS*", NIL != boundp($cb_event_dispatcher_listeners$) ? ((SubLObject) ($cb_event_dispatcher_listeners$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_cb_events_file_Previous() {
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

    static private final SubLString $str_alt8$CB_EVENT_DISPATCHER_Lock = makeString("CB-EVENT-DISPATCHER Lock");

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

    
}

/**
 * Total time: 101 ms synthetic
 */
