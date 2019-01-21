package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class inference_event extends SubLTranslatedFile
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
    public static SubLObject post_inference_new_answer_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject new_answer_id) {
        if (inference_event.NIL != anyone_interested_in_inference_eventP((SubLObject)inference_event.$kw0$INFERENCE_NEW_ANSWER)) {
            return post_new_inference_event((SubLObject)inference_event.$kw0$INFERENCE_NEW_ANSWER, (SubLObject)ConsesLow.list((SubLObject)inference_event.$kw5$PROBLEM_STORE_ID, problem_store_id, (SubLObject)inference_event.$kw6$INFERENCE_ID, inference_id, (SubLObject)inference_event.$kw7$NEW_ANSWER_ID, new_answer_id));
        }
        return (SubLObject)inference_event.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2286L)
    public static SubLObject inference_new_answer_retrieve_new_answer_id(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw0$INFERENCE_NEW_ANSWER && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw0$INFERENCE_NEW_ANSWER);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw7$NEW_ANSWER_ID, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2286L)
    public static SubLObject inference_new_answer_retrieve_inference_id(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw0$INFERENCE_NEW_ANSWER && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw0$INFERENCE_NEW_ANSWER);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw6$INFERENCE_ID, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2286L)
    public static SubLObject inference_new_answer_retrieve_problem_store_id(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw0$INFERENCE_NEW_ANSWER && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw0$INFERENCE_NEW_ANSWER);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw5$PROBLEM_STORE_ID, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2430L)
    public static SubLObject post_inference_status_change_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject new_status) {
        if (inference_event.NIL != anyone_interested_in_inference_eventP((SubLObject)inference_event.$kw2$INFERENCE_STATUS_CHANGE)) {
            return post_new_inference_event((SubLObject)inference_event.$kw2$INFERENCE_STATUS_CHANGE, (SubLObject)ConsesLow.list((SubLObject)inference_event.$kw5$PROBLEM_STORE_ID, problem_store_id, (SubLObject)inference_event.$kw6$INFERENCE_ID, inference_id, (SubLObject)inference_event.$kw10$NEW_STATUS, new_status));
        }
        return (SubLObject)inference_event.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2868L)
    public static SubLObject inference_status_change_retrieve_new_status(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw2$INFERENCE_STATUS_CHANGE && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw2$INFERENCE_STATUS_CHANGE);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw10$NEW_STATUS, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2868L)
    public static SubLObject inference_status_change_retrieve_inference_id(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw2$INFERENCE_STATUS_CHANGE && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw2$INFERENCE_STATUS_CHANGE);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw6$INFERENCE_ID, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 2868L)
    public static SubLObject inference_status_change_retrieve_problem_store_id(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw2$INFERENCE_STATUS_CHANGE && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw2$INFERENCE_STATUS_CHANGE);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw5$PROBLEM_STORE_ID, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3012L)
    public static SubLObject post_inference_new_transformation_depth_reached_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject new_depth) {
        if (inference_event.NIL != anyone_interested_in_inference_eventP((SubLObject)inference_event.$kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED)) {
            return post_new_inference_event((SubLObject)inference_event.$kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED, (SubLObject)ConsesLow.list((SubLObject)inference_event.$kw5$PROBLEM_STORE_ID, problem_store_id, (SubLObject)inference_event.$kw6$INFERENCE_ID, inference_id, (SubLObject)inference_event.$kw12$NEW_DEPTH, new_depth));
        }
        return (SubLObject)inference_event.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3505L)
    public static SubLObject inference_new_transformation_depth_reached_retrieve_new_depth(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw12$NEW_DEPTH, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3505L)
    public static SubLObject inference_new_transformation_depth_reached_retrieve_inference_id(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw6$INFERENCE_ID, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3505L)
    public static SubLObject inference_new_transformation_depth_reached_retrieve_problem_store_id(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw5$PROBLEM_STORE_ID, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
    public static SubLObject post_sksi_query_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject problem_id, final SubLObject tactic_id, final SubLObject status, SubLObject v_properties) {
        if (v_properties == inference_event.UNPROVIDED) {
            v_properties = (SubLObject)inference_event.NIL;
        }
        if (inference_event.NIL != anyone_interested_in_inference_eventP((SubLObject)inference_event.$kw4$SKSI_QUERY)) {
            return post_new_inference_event((SubLObject)inference_event.$kw4$SKSI_QUERY, (SubLObject)ConsesLow.listS((SubLObject)inference_event.$kw5$PROBLEM_STORE_ID, new SubLObject[] { problem_store_id, inference_event.$kw6$INFERENCE_ID, inference_id, inference_event.$kw13$PROBLEM_ID, problem_id, inference_event.$kw14$TACTIC_ID, tactic_id, inference_event.$kw15$STATUS, status, v_properties }));
        }
        return (SubLObject)inference_event.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
    public static SubLObject sksi_query_retrieve_end_time(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw4$SKSI_QUERY && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw4$SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw16$END_TIME, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
    public static SubLObject sksi_query_retrieve_start_time(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw4$SKSI_QUERY && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw4$SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw17$START_TIME, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
    public static SubLObject sksi_query_retrieve_status(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw4$SKSI_QUERY && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw4$SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw15$STATUS, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
    public static SubLObject sksi_query_retrieve_tactic_id(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw4$SKSI_QUERY && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw4$SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw14$TACTIC_ID, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
    public static SubLObject sksi_query_retrieve_problem_id(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw4$SKSI_QUERY && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw4$SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw13$PROBLEM_ID, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
    public static SubLObject sksi_query_retrieve_inference_id(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw4$SKSI_QUERY && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw4$SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw6$INFERENCE_ID, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 3666L)
    public static SubLObject sksi_query_retrieve_problem_store_id(final SubLObject event) {
        assert inference_event.NIL != event_model.event_p(event) : event;
        if (event_model.event_class(event) != inference_event.$kw4$SKSI_QUERY && inference_event.NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            Errors.error((SubLObject)inference_event.$str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), (SubLObject)inference_event.$kw4$SKSI_QUERY);
        }
        return conses_high.getf(event_model.event_message(event), (SubLObject)inference_event.$kw5$PROBLEM_STORE_ID, (SubLObject)inference_event.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 4386L)
    public static SubLObject post_new_inference_event(final SubLObject event_class, final SubLObject v_arguments) {
        return post_inference_event(new_inference_event(event_class, v_arguments));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 4566L)
    public static SubLObject new_inference_event(final SubLObject event_class, final SubLObject v_arguments) {
        return event_model.new_event(event_class, v_arguments, control_vars.cyc_image_id());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 4685L)
    public static SubLObject post_inference_event(final SubLObject event) {
        return event_broker.post_event(event, current_inference_event_broker());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 4792L)
    public static SubLObject anyone_interested_in_inference_eventP(final SubLObject event_class) {
        return event_broker.fast_has_event_class_any_transitive_listenersP(event_class, current_inference_event_broker());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 4964L)
    public static SubLObject current_inference_event_broker() {
        return event_broker.core_event_broker();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
    public static SubLObject inference_event_dispatcher_runningP() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p((SubLObject)inference_event.$sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
    public static SubLObject ensure_inference_event_dispatcher_running() {
        if (inference_event.NIL == inference_event_dispatcher_runningP()) {
            start_inference_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
    public static SubLObject register_listener_with_inference_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = (SubLObject)inference_event.NIL;
        try {
            release = Locks.seize_lock(inference_event.$inference_event_dispatcher_lock$.getGlobalValue());
            if (inference_event.NIL == Sequences.find(listener_var, inference_event.$inference_event_dispatcher_listeners$.getGlobalValue(), (SubLObject)inference_event.EQUALP, (SubLObject)inference_event.UNPROVIDED, (SubLObject)inference_event.UNPROVIDED, (SubLObject)inference_event.UNPROVIDED)) {
                inference_event.$inference_event_dispatcher_listeners$.setGlobalValue((SubLObject)ConsesLow.cons(listener_var, inference_event.$inference_event_dispatcher_listeners$.getGlobalValue()));
                if (inference_event.NIL != inference_event_dispatcher_runningP()) {
                    event_broker.register_event_listener(listener_var, (SubLObject)inference_event.NIL);
                }
            }
        }
        finally {
            if (inference_event.NIL != release) {
                Locks.release_lock(inference_event.$inference_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
    public static SubLObject deregister_listener_with_inference_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = (SubLObject)inference_event.NIL;
        try {
            release = Locks.seize_lock(inference_event.$inference_event_dispatcher_lock$.getGlobalValue());
            inference_event.$inference_event_dispatcher_listeners$.setGlobalValue(Sequences.remove(listener_var, inference_event.$inference_event_dispatcher_listeners$.getGlobalValue(), (SubLObject)inference_event.EQUALP, (SubLObject)inference_event.UNPROVIDED, (SubLObject)inference_event.UNPROVIDED, (SubLObject)inference_event.UNPROVIDED, (SubLObject)inference_event.UNPROVIDED));
            if (inference_event.NIL != inference_event_dispatcher_runningP()) {
                event_broker.deregister_event_listener(listener_var, (SubLObject)inference_event.NIL);
            }
        }
        finally {
            if (inference_event.NIL != release) {
                Locks.release_lock(inference_event.$inference_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
    public static SubLObject stop_inference_event_dispatcher() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application((SubLObject)inference_event.$sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-event.lisp", position = 5042L)
    public static SubLObject start_inference_event_dispatcher() {
        return event_utilities.start_generic_event_dispatcher_process_for_application((SubLObject)inference_event.$sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_);
    }
    
    public static SubLObject declare_inference_event_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "post_inference_new_answer_event", "POST-INFERENCE-NEW-ANSWER-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "inference_new_answer_retrieve_new_answer_id", "INFERENCE-NEW-ANSWER-RETRIEVE-NEW-ANSWER-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "inference_new_answer_retrieve_inference_id", "INFERENCE-NEW-ANSWER-RETRIEVE-INFERENCE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "inference_new_answer_retrieve_problem_store_id", "INFERENCE-NEW-ANSWER-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "post_inference_status_change_event", "POST-INFERENCE-STATUS-CHANGE-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "inference_status_change_retrieve_new_status", "INFERENCE-STATUS-CHANGE-RETRIEVE-NEW-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "inference_status_change_retrieve_inference_id", "INFERENCE-STATUS-CHANGE-RETRIEVE-INFERENCE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "inference_status_change_retrieve_problem_store_id", "INFERENCE-STATUS-CHANGE-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "post_inference_new_transformation_depth_reached_event", "POST-INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-EVENT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "inference_new_transformation_depth_reached_retrieve_new_depth", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-NEW-DEPTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "inference_new_transformation_depth_reached_retrieve_inference_id", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-INFERENCE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "inference_new_transformation_depth_reached_retrieve_problem_store_id", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "post_sksi_query_event", "POST-SKSI-QUERY-EVENT", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "sksi_query_retrieve_end_time", "SKSI-QUERY-RETRIEVE-END-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "sksi_query_retrieve_start_time", "SKSI-QUERY-RETRIEVE-START-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "sksi_query_retrieve_status", "SKSI-QUERY-RETRIEVE-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "sksi_query_retrieve_tactic_id", "SKSI-QUERY-RETRIEVE-TACTIC-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "sksi_query_retrieve_problem_id", "SKSI-QUERY-RETRIEVE-PROBLEM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "sksi_query_retrieve_inference_id", "SKSI-QUERY-RETRIEVE-INFERENCE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "sksi_query_retrieve_problem_store_id", "SKSI-QUERY-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "post_new_inference_event", "POST-NEW-INFERENCE-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "new_inference_event", "NEW-INFERENCE-EVENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "post_inference_event", "POST-INFERENCE-EVENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "anyone_interested_in_inference_eventP", "ANYONE-INTERESTED-IN-INFERENCE-EVENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "current_inference_event_broker", "CURRENT-INFERENCE-EVENT-BROKER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "inference_event_dispatcher_runningP", "INFERENCE-EVENT-DISPATCHER-RUNNING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "ensure_inference_event_dispatcher_running", "ENSURE-INFERENCE-EVENT-DISPATCHER-RUNNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "register_listener_with_inference_event_dispatcher", "REGISTER-LISTENER-WITH-INFERENCE-EVENT-DISPATCHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "deregister_listener_with_inference_event_dispatcher", "DEREGISTER-LISTENER-WITH-INFERENCE-EVENT-DISPATCHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "stop_inference_event_dispatcher", "STOP-INFERENCE-EVENT-DISPATCHER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_event", "start_inference_event_dispatcher", "START-INFERENCE-EVENT-DISPATCHER", 0, 0, false);
        return (SubLObject)inference_event.NIL;
    }
    
    public static SubLObject init_inference_event_file() {
        inference_event.$inference_event_dispatcher_lock$ = SubLFiles.deflexical("*INFERENCE-EVENT-DISPATCHER-LOCK*", Locks.make_lock((SubLObject)inference_event.$str18$INFERENCE_EVENT_DISPATCHER_Lock));
        inference_event.$inference_event_dispatcher_listeners$ = SubLFiles.deflexical("*INFERENCE-EVENT-DISPATCHER-LISTENERS*", (SubLObject)((inference_event.NIL != Symbols.boundp((SubLObject)inference_event.$sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_)) ? inference_event.$inference_event_dispatcher_listeners$.getGlobalValue() : inference_event.NIL));
        return (SubLObject)inference_event.NIL;
    }
    
    public static SubLObject setup_inference_event_file() {
        event_model.register_event_class((SubLObject)inference_event.$kw0$INFERENCE_NEW_ANSWER, (SubLObject)inference_event.$kw1$INFERENCE_EVENT, (SubLObject)inference_event.NIL);
        inference_event_support.note_inference_event_class_properties((SubLObject)inference_event.$kw0$INFERENCE_NEW_ANSWER, (SubLObject)inference_event.NIL);
        event_model.register_event_class((SubLObject)inference_event.$kw2$INFERENCE_STATUS_CHANGE, (SubLObject)inference_event.$kw1$INFERENCE_EVENT, (SubLObject)inference_event.NIL);
        inference_event_support.note_inference_event_class_properties((SubLObject)inference_event.$kw2$INFERENCE_STATUS_CHANGE, (SubLObject)inference_event.$list3);
        event_model.register_event_class((SubLObject)inference_event.$kw4$SKSI_QUERY, (SubLObject)inference_event.$kw1$INFERENCE_EVENT, (SubLObject)inference_event.NIL);
        inference_event_support.note_inference_event_class_properties((SubLObject)inference_event.$kw4$SKSI_QUERY, (SubLObject)inference_event.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)inference_event.$sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_);
        return (SubLObject)inference_event.NIL;
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
        me = (SubLFile)new inference_event();
        inference_event.$inference_event_dispatcher_lock$ = null;
        inference_event.$inference_event_dispatcher_listeners$ = null;
        $kw0$INFERENCE_NEW_ANSWER = SubLObjectFactory.makeKeyword("INFERENCE-NEW-ANSWER");
        $kw1$INFERENCE_EVENT = SubLObjectFactory.makeKeyword("INFERENCE-EVENT");
        $kw2$INFERENCE_STATUS_CHANGE = SubLObjectFactory.makeKeyword("INFERENCE-STATUS-CHANGE");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROPERTY-CHANGE"));
        $kw4$SKSI_QUERY = SubLObjectFactory.makeKeyword("SKSI-QUERY");
        $kw5$PROBLEM_STORE_ID = SubLObjectFactory.makeKeyword("PROBLEM-STORE-ID");
        $kw6$INFERENCE_ID = SubLObjectFactory.makeKeyword("INFERENCE-ID");
        $kw7$NEW_ANSWER_ID = SubLObjectFactory.makeKeyword("NEW-ANSWER-ID");
        $sym8$EVENT_P = SubLObjectFactory.makeSymbol("EVENT-P");
        $str9$Event__S_is_of_type__S__not__S_ = SubLObjectFactory.makeString("Event ~S is of type ~S, not ~S.");
        $kw10$NEW_STATUS = SubLObjectFactory.makeKeyword("NEW-STATUS");
        $kw11$INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED = SubLObjectFactory.makeKeyword("INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED");
        $kw12$NEW_DEPTH = SubLObjectFactory.makeKeyword("NEW-DEPTH");
        $kw13$PROBLEM_ID = SubLObjectFactory.makeKeyword("PROBLEM-ID");
        $kw14$TACTIC_ID = SubLObjectFactory.makeKeyword("TACTIC-ID");
        $kw15$STATUS = SubLObjectFactory.makeKeyword("STATUS");
        $kw16$END_TIME = SubLObjectFactory.makeKeyword("END-TIME");
        $kw17$START_TIME = SubLObjectFactory.makeKeyword("START-TIME");
        $str18$INFERENCE_EVENT_DISPATCHER_Lock = SubLObjectFactory.makeString("INFERENCE-EVENT-DISPATCHER Lock");
        $sym19$_INFERENCE_EVENT_DISPATCHER_LISTENERS_ = SubLObjectFactory.makeSymbol("*INFERENCE-EVENT-DISPATCHER-LISTENERS*");
    }
}

/*

	Total time: 76 ms
	
*/