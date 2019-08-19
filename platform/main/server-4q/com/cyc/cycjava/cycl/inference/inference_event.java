package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.event_broker;
import com.cyc.cycjava.cycl.event_model;
import com.cyc.cycjava.cycl.event_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_event extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.inference_event";
    public static String myFingerPrint = "df150891dd5d0cfdffae7710426a52b716f7737ee92497148a050dd7440ec36d";
    @SubL(source = "cycl/inference/inference-event.lisp", position = 5000L)
    private static SubLSymbol $inference_event_dispatcher_lock$;
    @SubL(source = "cycl/inference/inference-event.lisp", position = 5000L)
    private static SubLSymbol $inference_event_dispatcher_listeners$;
    private static SubLSymbol $INFERENCE_NEW_ANSWER;
    private static SubLSymbol $INFERENCE_EVENT;
    private static SubLSymbol $INFERENCE_STATUS_CHANGE;
    private static SubLList $list3;
    private static SubLSymbol $SKSI_QUERY;
    private static SubLSymbol $PROBLEM_STORE_ID;
    private static SubLSymbol $INFERENCE_ID;
    private static SubLSymbol $NEW_ANSWER_ID;
    private static SubLSymbol $sym8$EVENT_P;
    private static SubLString $str9$Event__S_is_of_type__S__not__S_;
    private static SubLSymbol $NEW_STATUS;
    private static SubLSymbol $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED;
    private static SubLSymbol $NEW_DEPTH;
    private static SubLSymbol $PROBLEM_ID;
    private static SubLSymbol $TACTIC_ID;
    private static SubLSymbol $STATUS;
    private static SubLSymbol $END_TIME;
    private static SubLSymbol $START_TIME;
    private static SubLString $str18$INFERENCE_EVENT_DISPATCHER_Lock;
    private static SubLSymbol $sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_;

    @SubL(source = "cycl/inference/inference-event.lisp", position = 1700L)
    public static SubLObject post_inference_new_answer_event(SubLObject problem_store_id, SubLObject inference_id, SubLObject new_answer_id) {
        if (NIL != anyone_interested_in_inference_eventP($INFERENCE_NEW_ANSWER)) {
            return post_new_inference_event($INFERENCE_NEW_ANSWER, list($PROBLEM_STORE_ID, problem_store_id, $INFERENCE_ID, inference_id, $NEW_ANSWER_ID, new_answer_id));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 2200L)
    public static SubLObject inference_new_answer_retrieve_new_answer_id(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $INFERENCE_NEW_ANSWER && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_ANSWER);
        }
        return conses_high.getf(event_model.event_message(event), $NEW_ANSWER_ID, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 2200L)
    public static SubLObject inference_new_answer_retrieve_inference_id(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $INFERENCE_NEW_ANSWER && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_ANSWER);
        }
        return conses_high.getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 2200L)
    public static SubLObject inference_new_answer_retrieve_problem_store_id(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $INFERENCE_NEW_ANSWER && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_ANSWER);
        }
        return conses_high.getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 2400L)
    public static SubLObject post_inference_status_change_event(SubLObject problem_store_id, SubLObject inference_id, SubLObject new_status) {
        if (NIL != anyone_interested_in_inference_eventP($INFERENCE_STATUS_CHANGE)) {
            return post_new_inference_event($INFERENCE_STATUS_CHANGE, list($PROBLEM_STORE_ID, problem_store_id, $INFERENCE_ID, inference_id, $NEW_STATUS, new_status));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 2800L)
    public static SubLObject inference_status_change_retrieve_new_status(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $INFERENCE_STATUS_CHANGE && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_STATUS_CHANGE);
        }
        return conses_high.getf(event_model.event_message(event), $NEW_STATUS, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 2800L)
    public static SubLObject inference_status_change_retrieve_inference_id(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $INFERENCE_STATUS_CHANGE && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_STATUS_CHANGE);
        }
        return conses_high.getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 2800L)
    public static SubLObject inference_status_change_retrieve_problem_store_id(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $INFERENCE_STATUS_CHANGE && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_STATUS_CHANGE);
        }
        return conses_high.getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3000L)
    public static SubLObject post_inference_new_transformation_depth_reached_event(SubLObject problem_store_id, SubLObject inference_id, SubLObject new_depth) {
        if (NIL != anyone_interested_in_inference_eventP($INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED)) {
            return post_new_inference_event($INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED, list($PROBLEM_STORE_ID, problem_store_id, $INFERENCE_ID, inference_id, $NEW_DEPTH, new_depth));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3500L)
    public static SubLObject inference_new_transformation_depth_reached_retrieve_new_depth(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
        }
        return conses_high.getf(event_model.event_message(event), $NEW_DEPTH, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3500L)
    public static SubLObject inference_new_transformation_depth_reached_retrieve_inference_id(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
        }
        return conses_high.getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3500L)
    public static SubLObject inference_new_transformation_depth_reached_retrieve_problem_store_id(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
        }
        return conses_high.getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3600L)
    public static SubLObject post_sksi_query_event(SubLObject problem_store_id, SubLObject inference_id, SubLObject problem_id, SubLObject tactic_id, SubLObject status, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL != anyone_interested_in_inference_eventP($SKSI_QUERY)) {
            return post_new_inference_event($SKSI_QUERY, listS($PROBLEM_STORE_ID, new SubLObject[] { problem_store_id, $INFERENCE_ID, inference_id, $PROBLEM_ID, problem_id, $TACTIC_ID, tactic_id, $STATUS, status, v_properties }));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3600L)
    public static SubLObject sksi_query_retrieve_end_time(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), $END_TIME, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3600L)
    public static SubLObject sksi_query_retrieve_start_time(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), $START_TIME, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3600L)
    public static SubLObject sksi_query_retrieve_status(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), $STATUS, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3600L)
    public static SubLObject sksi_query_retrieve_tactic_id(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), $TACTIC_ID, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3600L)
    public static SubLObject sksi_query_retrieve_problem_id(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), $PROBLEM_ID, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3600L)
    public static SubLObject sksi_query_retrieve_inference_id(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 3600L)
    public static SubLObject sksi_query_retrieve_problem_store_id(SubLObject event) {
        assert NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != $SKSI_QUERY && NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 4300L)
    public static SubLObject post_new_inference_event(SubLObject event_class, SubLObject v_arguments) {
        return post_inference_event(new_inference_event(event_class, v_arguments));
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 4500L)
    public static SubLObject new_inference_event(SubLObject event_class, SubLObject v_arguments) {
        return event_model.new_event(event_class, v_arguments, control_vars.cyc_image_id());
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 4600L)
    public static SubLObject post_inference_event(SubLObject event) {
        return event_broker.post_event(event, current_inference_event_broker());
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 4700L)
    public static SubLObject anyone_interested_in_inference_eventP(SubLObject event_class) {
        return event_broker.fast_has_event_class_any_transitive_listenersP(event_class, current_inference_event_broker());
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 4900L)
    public static SubLObject current_inference_event_broker() {
        return event_broker.core_event_broker();
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 5000L)
    public static SubLObject inference_event_dispatcher_runningP() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p($sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 5000L)
    public static SubLObject ensure_inference_event_dispatcher_running() {
        if (NIL == inference_event_dispatcher_runningP()) {
            start_inference_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 5000L)
    public static SubLObject register_listener_with_inference_event_dispatcher(SubLObject listener_var) {
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock($inference_event_dispatcher_lock$.getGlobalValue());
            if (NIL == Sequences.find(listener_var, $inference_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                $inference_event_dispatcher_listeners$.setGlobalValue(cons(listener_var, $inference_event_dispatcher_listeners$.getGlobalValue()));
                if (NIL != inference_event_dispatcher_runningP()) {
                    event_broker.register_event_listener(listener_var, NIL);
                }
            }
        } finally {
            if (NIL != release) {
                Locks.release_lock($inference_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 5000L)
    public static SubLObject deregister_listener_with_inference_event_dispatcher(SubLObject listener_var) {
        SubLObject release = NIL;
        try {
            release = Locks.seize_lock($inference_event_dispatcher_lock$.getGlobalValue());
            $inference_event_dispatcher_listeners$.setGlobalValue(Sequences.remove(listener_var, $inference_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL != inference_event_dispatcher_runningP()) {
                event_broker.deregister_event_listener(listener_var, NIL);
            }
        } finally {
            if (NIL != release) {
                Locks.release_lock($inference_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 5000L)
    public static SubLObject stop_inference_event_dispatcher() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application($sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_);
    }

    @SubL(source = "cycl/inference/inference-event.lisp", position = 5000L)
    public static SubLObject start_inference_event_dispatcher() {
        return event_utilities.start_generic_event_dispatcher_process_for_application($sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_);
    }

    public static SubLObject declare_inference_event_file() {
        declareFunction(myName, "post_inference_new_answer_event", "POST-INFERENCE-NEW-ANSWER-EVENT", 3, 0, false);
        declareFunction(myName, "inference_new_answer_retrieve_new_answer_id", "INFERENCE-NEW-ANSWER-RETRIEVE-NEW-ANSWER-ID", 1, 0, false);
        declareFunction(myName, "inference_new_answer_retrieve_inference_id", "INFERENCE-NEW-ANSWER-RETRIEVE-INFERENCE-ID", 1, 0, false);
        declareFunction(myName, "inference_new_answer_retrieve_problem_store_id", "INFERENCE-NEW-ANSWER-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        declareFunction(myName, "post_inference_status_change_event", "POST-INFERENCE-STATUS-CHANGE-EVENT", 3, 0, false);
        declareFunction(myName, "inference_status_change_retrieve_new_status", "INFERENCE-STATUS-CHANGE-RETRIEVE-NEW-STATUS", 1, 0, false);
        declareFunction(myName, "inference_status_change_retrieve_inference_id", "INFERENCE-STATUS-CHANGE-RETRIEVE-INFERENCE-ID", 1, 0, false);
        declareFunction(myName, "inference_status_change_retrieve_problem_store_id", "INFERENCE-STATUS-CHANGE-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        declareFunction(myName, "post_inference_new_transformation_depth_reached_event", "POST-INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-EVENT", 3, 0, false);
        declareFunction(myName, "inference_new_transformation_depth_reached_retrieve_new_depth", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-NEW-DEPTH", 1, 0, false);
        declareFunction(myName, "inference_new_transformation_depth_reached_retrieve_inference_id", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-INFERENCE-ID", 1, 0, false);
        declareFunction(myName, "inference_new_transformation_depth_reached_retrieve_problem_store_id", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        declareFunction(myName, "post_sksi_query_event", "POST-SKSI-QUERY-EVENT", 5, 1, false);
        declareFunction(myName, "sksi_query_retrieve_end_time", "SKSI-QUERY-RETRIEVE-END-TIME", 1, 0, false);
        declareFunction(myName, "sksi_query_retrieve_start_time", "SKSI-QUERY-RETRIEVE-START-TIME", 1, 0, false);
        declareFunction(myName, "sksi_query_retrieve_status", "SKSI-QUERY-RETRIEVE-STATUS", 1, 0, false);
        declareFunction(myName, "sksi_query_retrieve_tactic_id", "SKSI-QUERY-RETRIEVE-TACTIC-ID", 1, 0, false);
        declareFunction(myName, "sksi_query_retrieve_problem_id", "SKSI-QUERY-RETRIEVE-PROBLEM-ID", 1, 0, false);
        declareFunction(myName, "sksi_query_retrieve_inference_id", "SKSI-QUERY-RETRIEVE-INFERENCE-ID", 1, 0, false);
        declareFunction(myName, "sksi_query_retrieve_problem_store_id", "SKSI-QUERY-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        declareFunction(myName, "post_new_inference_event", "POST-NEW-INFERENCE-EVENT", 2, 0, false);
        declareFunction(myName, "new_inference_event", "NEW-INFERENCE-EVENT", 2, 0, false);
        declareFunction(myName, "post_inference_event", "POST-INFERENCE-EVENT", 1, 0, false);
        declareFunction(myName, "anyone_interested_in_inference_eventP", "ANYONE-INTERESTED-IN-INFERENCE-EVENT?", 1, 0, false);
        declareFunction(myName, "current_inference_event_broker", "CURRENT-INFERENCE-EVENT-BROKER", 0, 0, false);
        declareFunction(myName, "inference_event_dispatcher_runningP", "INFERENCE-EVENT-DISPATCHER-RUNNING?", 0, 0, false);
        declareFunction(myName, "ensure_inference_event_dispatcher_running", "ENSURE-INFERENCE-EVENT-DISPATCHER-RUNNING", 0, 0, false);
        declareFunction(myName, "register_listener_with_inference_event_dispatcher", "REGISTER-LISTENER-WITH-INFERENCE-EVENT-DISPATCHER", 1, 0, false);
        declareFunction(myName, "deregister_listener_with_inference_event_dispatcher", "DEREGISTER-LISTENER-WITH-INFERENCE-EVENT-DISPATCHER", 1, 0, false);
        declareFunction(myName, "stop_inference_event_dispatcher", "STOP-INFERENCE-EVENT-DISPATCHER", 0, 0, false);
        declareFunction(myName, "start_inference_event_dispatcher", "START-INFERENCE-EVENT-DISPATCHER", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_event_file() {
        $inference_event_dispatcher_lock$ = deflexical("*INFERENCE-EVENT-DISPATCHER-LOCK*", Locks.make_lock($str18$INFERENCE_EVENT_DISPATCHER_Lock));
        $inference_event_dispatcher_listeners$ = deflexical("*INFERENCE-EVENT-DISPATCHER-LISTENERS*", (maybeDefault($sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_, $inference_event_dispatcher_listeners$, NIL)));
        return NIL;
    }

    public static SubLObject setup_inference_event_file() {
        event_model.register_event_class($INFERENCE_NEW_ANSWER, $INFERENCE_EVENT, NIL);
        inference_event_support.note_inference_event_class_properties($INFERENCE_NEW_ANSWER, NIL);
        event_model.register_event_class($INFERENCE_STATUS_CHANGE, $INFERENCE_EVENT, NIL);
        inference_event_support.note_inference_event_class_properties($INFERENCE_STATUS_CHANGE, $list3);
        event_model.register_event_class($SKSI_QUERY, $INFERENCE_EVENT, NIL);
        inference_event_support.note_inference_event_class_properties($SKSI_QUERY, NIL);
        subl_macro_promotions.declare_defglobal($sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_event_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_event_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_event_file();
    }

    static {
        me = new inference_event();
        $inference_event_dispatcher_lock$ = null;
        $inference_event_dispatcher_listeners$ = null;
        $INFERENCE_NEW_ANSWER = makeKeyword("INFERENCE-NEW-ANSWER");
        $INFERENCE_EVENT = makeKeyword("INFERENCE-EVENT");
        $INFERENCE_STATUS_CHANGE = makeKeyword("INFERENCE-STATUS-CHANGE");
        $list3 = list(makeKeyword("PROPERTY-CHANGE"));
        $SKSI_QUERY = makeKeyword("SKSI-QUERY");
        $PROBLEM_STORE_ID = makeKeyword("PROBLEM-STORE-ID");
        $INFERENCE_ID = makeKeyword("INFERENCE-ID");
        $NEW_ANSWER_ID = makeKeyword("NEW-ANSWER-ID");
        $sym8$EVENT_P = makeSymbol("EVENT-P");
        $str9$Event__S_is_of_type__S__not__S_ = makeString("Event ~S is of type ~S, not ~S.");
        $NEW_STATUS = makeKeyword("NEW-STATUS");
        $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED = makeKeyword("INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED");
        $NEW_DEPTH = makeKeyword("NEW-DEPTH");
        $PROBLEM_ID = makeKeyword("PROBLEM-ID");
        $TACTIC_ID = makeKeyword("TACTIC-ID");
        $STATUS = makeKeyword("STATUS");
        $END_TIME = makeKeyword("END-TIME");
        $START_TIME = makeKeyword("START-TIME");
        $str18$INFERENCE_EVENT_DISPATCHER_Lock = makeString("INFERENCE-EVENT-DISPATCHER Lock");
        $sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_ = makeSymbol("*INFERENCE-EVENT-DISPATCHER-LISTENERS*");
    }
}
/*
 *
 * Total time: 76 ms
 *
 */