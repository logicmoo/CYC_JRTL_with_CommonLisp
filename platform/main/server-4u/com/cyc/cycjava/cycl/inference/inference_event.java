/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.event_broker;
import com.cyc.cycjava.cycl.event_model;
import com.cyc.cycjava.cycl.event_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-EVENT
 * source file: /cyc/top/cycl/inference/inference-event.lisp
 * created:     2019/07/03 17:37:37
 */
public final class inference_event extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_event();

 public static final String myName = "com.cyc.cycjava.cycl.inference.inference_event";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $inference_event_dispatcher_lock$ = makeSymbol("*INFERENCE-EVENT-DISPATCHER-LOCK*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLSymbol $INFERENCE_NEW_ANSWER = makeKeyword("INFERENCE-NEW-ANSWER");

    private static final SubLSymbol $INFERENCE_STATUS_CHANGE = makeKeyword("INFERENCE-STATUS-CHANGE");

    static private final SubLList $list3 = list(makeKeyword("PROPERTY-CHANGE"));

    private static final SubLSymbol $PROBLEM_STORE_ID = makeKeyword("PROBLEM-STORE-ID");

    private static final SubLSymbol $NEW_ANSWER_ID = makeKeyword("NEW-ANSWER-ID");

    private static final SubLSymbol EVENT_P = makeSymbol("EVENT-P");

    static private final SubLString $str9$Event__S_is_of_type__S__not__S_ = makeString("Event ~S is of type ~S, not ~S.");

    private static final SubLSymbol $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED = makeKeyword("INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED");

    static private final SubLString $str18$INFERENCE_EVENT_DISPATCHER_Lock = makeString("INFERENCE-EVENT-DISPATCHER Lock");

    public static final SubLSymbol $inference_event_dispatcher_listeners$ = makeSymbol("*INFERENCE-EVENT-DISPATCHER-LISTENERS*");

    // Definitions
    /**
     * This assumes that the recipient of the event can get a hold of the inference via its ids.
     */
    @LispMethod(comment = "This assumes that the recipient of the event can get a hold of the inference via its ids.")
    public static final SubLObject post_inference_new_answer_event_alt(SubLObject problem_store_id, SubLObject inference_id, SubLObject new_answer_id) {
        if (NIL != com.cyc.cycjava.cycl.inference.inference_event.anyone_interested_in_inference_eventP($INFERENCE_NEW_ANSWER)) {
            return com.cyc.cycjava.cycl.inference.inference_event.post_new_inference_event($INFERENCE_NEW_ANSWER, list($PROBLEM_STORE_ID, problem_store_id, $INFERENCE_ID, inference_id, $NEW_ANSWER_ID, new_answer_id));
        }
        return NIL;
    }

    // Definitions
    /**
     * This assumes that the recipient of the event can get a hold of the inference via its ids.
     */
    @LispMethod(comment = "This assumes that the recipient of the event can get a hold of the inference via its ids.")
    public static SubLObject post_inference_new_answer_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject new_answer_id) {
        if (NIL != anyone_interested_in_inference_eventP($INFERENCE_NEW_ANSWER)) {
            return post_new_inference_event($INFERENCE_NEW_ANSWER, list($PROBLEM_STORE_ID, problem_store_id, $INFERENCE_ID, inference_id, $NEW_ANSWER_ID, new_answer_id));
        }
        return NIL;
    }

    public static final SubLObject inference_new_answer_retrieve_new_answer_id_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $INFERENCE_NEW_ANSWER) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_ANSWER);
            }
        }
        return getf(event_model.event_message(event), $NEW_ANSWER_ID, UNPROVIDED);
    }

    public static SubLObject inference_new_answer_retrieve_new_answer_id(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $INFERENCE_NEW_ANSWER) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_ANSWER);
        }
        return getf(event_model.event_message(event), $NEW_ANSWER_ID, UNPROVIDED);
    }

    public static final SubLObject inference_new_answer_retrieve_inference_id_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $INFERENCE_NEW_ANSWER) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_ANSWER);
            }
        }
        return getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    public static SubLObject inference_new_answer_retrieve_inference_id(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $INFERENCE_NEW_ANSWER) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_ANSWER);
        }
        return getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    public static final SubLObject inference_new_answer_retrieve_problem_store_id_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $INFERENCE_NEW_ANSWER) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_ANSWER);
            }
        }
        return getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    public static SubLObject inference_new_answer_retrieve_problem_store_id(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $INFERENCE_NEW_ANSWER) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_ANSWER);
        }
        return getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    /**
     * This assumes that the recipient of the event can get a hold of the inference via its ids.
     */
    @LispMethod(comment = "This assumes that the recipient of the event can get a hold of the inference via its ids.")
    public static final SubLObject post_inference_status_change_event_alt(SubLObject problem_store_id, SubLObject inference_id, SubLObject new_status) {
        if (NIL != com.cyc.cycjava.cycl.inference.inference_event.anyone_interested_in_inference_eventP($INFERENCE_STATUS_CHANGE)) {
            return com.cyc.cycjava.cycl.inference.inference_event.post_new_inference_event($INFERENCE_STATUS_CHANGE, list($PROBLEM_STORE_ID, problem_store_id, $INFERENCE_ID, inference_id, $NEW_STATUS, new_status));
        }
        return NIL;
    }

    /**
     * This assumes that the recipient of the event can get a hold of the inference via its ids.
     */
    @LispMethod(comment = "This assumes that the recipient of the event can get a hold of the inference via its ids.")
    public static SubLObject post_inference_status_change_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject new_status) {
        if (NIL != anyone_interested_in_inference_eventP($INFERENCE_STATUS_CHANGE)) {
            return post_new_inference_event($INFERENCE_STATUS_CHANGE, list($PROBLEM_STORE_ID, problem_store_id, $INFERENCE_ID, inference_id, $NEW_STATUS, new_status));
        }
        return NIL;
    }

    public static final SubLObject inference_status_change_retrieve_new_status_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $INFERENCE_STATUS_CHANGE) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_STATUS_CHANGE);
            }
        }
        return getf(event_model.event_message(event), $NEW_STATUS, UNPROVIDED);
    }

    public static SubLObject inference_status_change_retrieve_new_status(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $INFERENCE_STATUS_CHANGE) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_STATUS_CHANGE);
        }
        return getf(event_model.event_message(event), $NEW_STATUS, UNPROVIDED);
    }

    public static final SubLObject inference_status_change_retrieve_inference_id_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $INFERENCE_STATUS_CHANGE) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_STATUS_CHANGE);
            }
        }
        return getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    public static SubLObject inference_status_change_retrieve_inference_id(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $INFERENCE_STATUS_CHANGE) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_STATUS_CHANGE);
        }
        return getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    public static final SubLObject inference_status_change_retrieve_problem_store_id_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $INFERENCE_STATUS_CHANGE) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_STATUS_CHANGE);
            }
        }
        return getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    public static SubLObject inference_status_change_retrieve_problem_store_id(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $INFERENCE_STATUS_CHANGE) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_STATUS_CHANGE);
        }
        return getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    /**
     * This assumes that the recipient of the event can get a hold of the inference via its ids.
     */
    @LispMethod(comment = "This assumes that the recipient of the event can get a hold of the inference via its ids.")
    public static final SubLObject post_inference_new_transformation_depth_reached_event_alt(SubLObject problem_store_id, SubLObject inference_id, SubLObject new_depth) {
        if (NIL != com.cyc.cycjava.cycl.inference.inference_event.anyone_interested_in_inference_eventP($INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED)) {
            return com.cyc.cycjava.cycl.inference.inference_event.post_new_inference_event($INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED, list($PROBLEM_STORE_ID, problem_store_id, $INFERENCE_ID, inference_id, $NEW_DEPTH, new_depth));
        }
        return NIL;
    }

    /**
     * This assumes that the recipient of the event can get a hold of the inference via its ids.
     */
    @LispMethod(comment = "This assumes that the recipient of the event can get a hold of the inference via its ids.")
    public static SubLObject post_inference_new_transformation_depth_reached_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject new_depth) {
        if (NIL != anyone_interested_in_inference_eventP($INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED)) {
            return post_new_inference_event($INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED, list($PROBLEM_STORE_ID, problem_store_id, $INFERENCE_ID, inference_id, $NEW_DEPTH, new_depth));
        }
        return NIL;
    }

    public static final SubLObject inference_new_transformation_depth_reached_retrieve_new_depth_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
            }
        }
        return getf(event_model.event_message(event), $NEW_DEPTH, UNPROVIDED);
    }

    public static SubLObject inference_new_transformation_depth_reached_retrieve_new_depth(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
        }
        return getf(event_model.event_message(event), $NEW_DEPTH, UNPROVIDED);
    }

    public static final SubLObject inference_new_transformation_depth_reached_retrieve_inference_id_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
            }
        }
        return getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    public static SubLObject inference_new_transformation_depth_reached_retrieve_inference_id(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
        }
        return getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    public static final SubLObject inference_new_transformation_depth_reached_retrieve_problem_store_id_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
            }
        }
        return getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    public static SubLObject inference_new_transformation_depth_reached_retrieve_problem_store_id(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $INFERENCE_NEW_TRANSFORMATION_DEPTH_REACHED);
        }
        return getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    /**
     * This assumes that the recipient of the event can get a hold of the tactic via its ids.
     */
    @LispMethod(comment = "This assumes that the recipient of the event can get a hold of the tactic via its ids.")
    public static final SubLObject post_sksi_query_event_alt(SubLObject problem_store_id, SubLObject inference_id, SubLObject problem_id, SubLObject tactic_id, SubLObject status, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.inference.inference_event.anyone_interested_in_inference_eventP($SKSI_QUERY)) {
            return com.cyc.cycjava.cycl.inference.inference_event.post_new_inference_event($SKSI_QUERY, listS($PROBLEM_STORE_ID, new SubLObject[]{ problem_store_id, $INFERENCE_ID, inference_id, $PROBLEM_ID, problem_id, $TACTIC_ID, tactic_id, $STATUS, status, v_properties }));
        }
        return NIL;
    }

    /**
     * This assumes that the recipient of the event can get a hold of the tactic via its ids.
     */
    @LispMethod(comment = "This assumes that the recipient of the event can get a hold of the tactic via its ids.")
    public static SubLObject post_sksi_query_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject problem_id, final SubLObject tactic_id, final SubLObject status, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        if (NIL != anyone_interested_in_inference_eventP($SKSI_QUERY)) {
            return post_new_inference_event($SKSI_QUERY, listS($PROBLEM_STORE_ID, new SubLObject[]{ problem_store_id, $INFERENCE_ID, inference_id, $PROBLEM_ID, problem_id, $TACTIC_ID, tactic_id, $STATUS, status, v_properties }));
        }
        return NIL;
    }

    public static final SubLObject sksi_query_retrieve_end_time_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $SKSI_QUERY) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
            }
        }
        return getf(event_model.event_message(event), $END_TIME, UNPROVIDED);
    }

    public static SubLObject sksi_query_retrieve_end_time(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $SKSI_QUERY) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return getf(event_model.event_message(event), $END_TIME, UNPROVIDED);
    }

    public static final SubLObject sksi_query_retrieve_start_time_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $SKSI_QUERY) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
            }
        }
        return getf(event_model.event_message(event), $START_TIME, UNPROVIDED);
    }

    public static SubLObject sksi_query_retrieve_start_time(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $SKSI_QUERY) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return getf(event_model.event_message(event), $START_TIME, UNPROVIDED);
    }

    public static final SubLObject sksi_query_retrieve_status_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $SKSI_QUERY) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
            }
        }
        return getf(event_model.event_message(event), $STATUS, UNPROVIDED);
    }

    public static SubLObject sksi_query_retrieve_status(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $SKSI_QUERY) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return getf(event_model.event_message(event), $STATUS, UNPROVIDED);
    }

    public static final SubLObject sksi_query_retrieve_tactic_id_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $SKSI_QUERY) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
            }
        }
        return getf(event_model.event_message(event), $TACTIC_ID, UNPROVIDED);
    }

    public static SubLObject sksi_query_retrieve_tactic_id(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $SKSI_QUERY) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return getf(event_model.event_message(event), $TACTIC_ID, UNPROVIDED);
    }

    public static final SubLObject sksi_query_retrieve_problem_id_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $SKSI_QUERY) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
            }
        }
        return getf(event_model.event_message(event), $PROBLEM_ID, UNPROVIDED);
    }

    public static SubLObject sksi_query_retrieve_problem_id(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $SKSI_QUERY) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return getf(event_model.event_message(event), $PROBLEM_ID, UNPROVIDED);
    }

    public static final SubLObject sksi_query_retrieve_inference_id_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $SKSI_QUERY) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
            }
        }
        return getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    public static SubLObject sksi_query_retrieve_inference_id(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $SKSI_QUERY) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return getf(event_model.event_message(event), $INFERENCE_ID, UNPROVIDED);
    }

    public static final SubLObject sksi_query_retrieve_problem_store_id_alt(SubLObject event) {
        SubLTrampolineFile.checkType(event, EVENT_P);
        if (event_model.event_class(event) != $SKSI_QUERY) {
            if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
                Errors.error($str_alt9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
            }
        }
        return getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    public static SubLObject sksi_query_retrieve_problem_store_id(final SubLObject event) {
        assert NIL != event_model.event_p(event) : "! event_model.event_p(event) " + ("event_model.event_p(event) " + "CommonSymbols.NIL != event_model.event_p(event) ") + event;
        if ((event_model.event_class(event) != $SKSI_QUERY) && (NIL == event_utilities.event_is_handler_registration_eventP(event))) {
            Errors.error($str9$Event__S_is_of_type__S__not__S_, event, event_model.event_class(event), $SKSI_QUERY);
        }
        return getf(event_model.event_message(event), $PROBLEM_STORE_ID, UNPROVIDED);
    }

    public static final SubLObject post_new_inference_event_alt(SubLObject event_class, SubLObject v_arguments) {
        return com.cyc.cycjava.cycl.inference.inference_event.post_inference_event(com.cyc.cycjava.cycl.inference.inference_event.new_inference_event(event_class, v_arguments));
    }

    public static SubLObject post_new_inference_event(final SubLObject event_class, final SubLObject v_arguments) {
        return post_inference_event(new_inference_event(event_class, v_arguments));
    }

    public static final SubLObject new_inference_event_alt(SubLObject event_class, SubLObject v_arguments) {
        return event_model.new_event(event_class, v_arguments, cyc_image_id());
    }

    public static SubLObject new_inference_event(final SubLObject event_class, final SubLObject v_arguments) {
        return event_model.new_event(event_class, v_arguments, cyc_image_id());
    }

    public static final SubLObject post_inference_event_alt(SubLObject event) {
        return event_broker.post_event(event, com.cyc.cycjava.cycl.inference.inference_event.current_inference_event_broker());
    }

    public static SubLObject post_inference_event(final SubLObject event) {
        return event_broker.post_event(event, current_inference_event_broker());
    }

    public static final SubLObject anyone_interested_in_inference_eventP_alt(SubLObject event_class) {
        return event_broker.fast_has_event_class_any_transitive_listenersP(event_class, com.cyc.cycjava.cycl.inference.inference_event.current_inference_event_broker());
    }

    public static SubLObject anyone_interested_in_inference_eventP(final SubLObject event_class) {
        return event_broker.fast_has_event_class_any_transitive_listenersP(event_class, current_inference_event_broker());
    }

    public static final SubLObject current_inference_event_broker_alt() {
        return event_broker.core_event_broker();
    }

    public static SubLObject current_inference_event_broker() {
        return event_broker.core_event_broker();
    }

    public static final SubLObject inference_event_dispatcher_runningP_alt() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p($inference_event_dispatcher_listeners$);
    }

    public static SubLObject inference_event_dispatcher_runningP() {
        return event_utilities.generic_event_dispatcher_process_running_for_application_p($inference_event_dispatcher_listeners$);
    }

    public static final SubLObject ensure_inference_event_dispatcher_running_alt() {
        if (NIL == com.cyc.cycjava.cycl.inference.inference_event.inference_event_dispatcher_runningP()) {
            com.cyc.cycjava.cycl.inference.inference_event.start_inference_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }

    public static SubLObject ensure_inference_event_dispatcher_running() {
        if (NIL == inference_event_dispatcher_runningP()) {
            start_inference_event_dispatcher();
        }
        return event_utilities.generic_event_dispatcher_process();
    }

    public static final SubLObject register_listener_with_inference_event_dispatcher_alt(SubLObject listener_var) {
        {
            SubLObject lock = $inference_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == find(listener_var, $inference_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    $inference_event_dispatcher_listeners$.setGlobalValue(cons(listener_var, $inference_event_dispatcher_listeners$.getGlobalValue()));
                    if (NIL != com.cyc.cycjava.cycl.inference.inference_event.inference_event_dispatcher_runningP()) {
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

    public static SubLObject register_listener_with_inference_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = NIL;
        try {
            release = seize_lock($inference_event_dispatcher_lock$.getGlobalValue());
            if (NIL == find(listener_var, $inference_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                $inference_event_dispatcher_listeners$.setGlobalValue(cons(listener_var, $inference_event_dispatcher_listeners$.getGlobalValue()));
                if (NIL != inference_event_dispatcher_runningP()) {
                    event_broker.register_event_listener(listener_var, NIL);
                }
            }
        } finally {
            if (NIL != release) {
                release_lock($inference_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }

    public static final SubLObject deregister_listener_with_inference_event_dispatcher_alt(SubLObject listener_var) {
        {
            SubLObject lock = $inference_event_dispatcher_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $inference_event_dispatcher_listeners$.setGlobalValue(remove(listener_var, $inference_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                if (NIL != com.cyc.cycjava.cycl.inference.inference_event.inference_event_dispatcher_runningP()) {
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

    public static SubLObject deregister_listener_with_inference_event_dispatcher(final SubLObject listener_var) {
        SubLObject release = NIL;
        try {
            release = seize_lock($inference_event_dispatcher_lock$.getGlobalValue());
            $inference_event_dispatcher_listeners$.setGlobalValue(remove(listener_var, $inference_event_dispatcher_listeners$.getGlobalValue(), EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            if (NIL != inference_event_dispatcher_runningP()) {
                event_broker.deregister_event_listener(listener_var, NIL);
            }
        } finally {
            if (NIL != release) {
                release_lock($inference_event_dispatcher_lock$.getGlobalValue());
            }
        }
        return listener_var;
    }

    public static final SubLObject stop_inference_event_dispatcher_alt() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application($inference_event_dispatcher_listeners$);
    }

    public static SubLObject stop_inference_event_dispatcher() {
        return event_utilities.stop_generic_event_dispatcher_process_for_application($inference_event_dispatcher_listeners$);
    }

    public static final SubLObject start_inference_event_dispatcher_alt() {
        return event_utilities.start_generic_event_dispatcher_process_for_application($inference_event_dispatcher_listeners$);
    }

    public static SubLObject start_inference_event_dispatcher() {
        return event_utilities.start_generic_event_dispatcher_process_for_application($inference_event_dispatcher_listeners$);
    }

    public static SubLObject declare_inference_event_file() {
        declareFunction("post_inference_new_answer_event", "POST-INFERENCE-NEW-ANSWER-EVENT", 3, 0, false);
        declareFunction("inference_new_answer_retrieve_new_answer_id", "INFERENCE-NEW-ANSWER-RETRIEVE-NEW-ANSWER-ID", 1, 0, false);
        declareFunction("inference_new_answer_retrieve_inference_id", "INFERENCE-NEW-ANSWER-RETRIEVE-INFERENCE-ID", 1, 0, false);
        declareFunction("inference_new_answer_retrieve_problem_store_id", "INFERENCE-NEW-ANSWER-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        declareFunction("post_inference_status_change_event", "POST-INFERENCE-STATUS-CHANGE-EVENT", 3, 0, false);
        declareFunction("inference_status_change_retrieve_new_status", "INFERENCE-STATUS-CHANGE-RETRIEVE-NEW-STATUS", 1, 0, false);
        declareFunction("inference_status_change_retrieve_inference_id", "INFERENCE-STATUS-CHANGE-RETRIEVE-INFERENCE-ID", 1, 0, false);
        declareFunction("inference_status_change_retrieve_problem_store_id", "INFERENCE-STATUS-CHANGE-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        declareFunction("post_inference_new_transformation_depth_reached_event", "POST-INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-EVENT", 3, 0, false);
        declareFunction("inference_new_transformation_depth_reached_retrieve_new_depth", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-NEW-DEPTH", 1, 0, false);
        declareFunction("inference_new_transformation_depth_reached_retrieve_inference_id", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-INFERENCE-ID", 1, 0, false);
        declareFunction("inference_new_transformation_depth_reached_retrieve_problem_store_id", "INFERENCE-NEW-TRANSFORMATION-DEPTH-REACHED-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        declareFunction("post_sksi_query_event", "POST-SKSI-QUERY-EVENT", 5, 1, false);
        declareFunction("sksi_query_retrieve_end_time", "SKSI-QUERY-RETRIEVE-END-TIME", 1, 0, false);
        declareFunction("sksi_query_retrieve_start_time", "SKSI-QUERY-RETRIEVE-START-TIME", 1, 0, false);
        declareFunction("sksi_query_retrieve_status", "SKSI-QUERY-RETRIEVE-STATUS", 1, 0, false);
        declareFunction("sksi_query_retrieve_tactic_id", "SKSI-QUERY-RETRIEVE-TACTIC-ID", 1, 0, false);
        declareFunction("sksi_query_retrieve_problem_id", "SKSI-QUERY-RETRIEVE-PROBLEM-ID", 1, 0, false);
        declareFunction("sksi_query_retrieve_inference_id", "SKSI-QUERY-RETRIEVE-INFERENCE-ID", 1, 0, false);
        declareFunction("sksi_query_retrieve_problem_store_id", "SKSI-QUERY-RETRIEVE-PROBLEM-STORE-ID", 1, 0, false);
        declareFunction("post_new_inference_event", "POST-NEW-INFERENCE-EVENT", 2, 0, false);
        declareFunction("new_inference_event", "NEW-INFERENCE-EVENT", 2, 0, false);
        declareFunction("post_inference_event", "POST-INFERENCE-EVENT", 1, 0, false);
        declareFunction("anyone_interested_in_inference_eventP", "ANYONE-INTERESTED-IN-INFERENCE-EVENT?", 1, 0, false);
        declareFunction("current_inference_event_broker", "CURRENT-INFERENCE-EVENT-BROKER", 0, 0, false);
        declareFunction("inference_event_dispatcher_runningP", "INFERENCE-EVENT-DISPATCHER-RUNNING?", 0, 0, false);
        declareFunction("ensure_inference_event_dispatcher_running", "ENSURE-INFERENCE-EVENT-DISPATCHER-RUNNING", 0, 0, false);
        declareFunction("register_listener_with_inference_event_dispatcher", "REGISTER-LISTENER-WITH-INFERENCE-EVENT-DISPATCHER", 1, 0, false);
        declareFunction("deregister_listener_with_inference_event_dispatcher", "DEREGISTER-LISTENER-WITH-INFERENCE-EVENT-DISPATCHER", 1, 0, false);
        declareFunction("stop_inference_event_dispatcher", "STOP-INFERENCE-EVENT-DISPATCHER", 0, 0, false);
        declareFunction("start_inference_event_dispatcher", "START-INFERENCE-EVENT-DISPATCHER", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_inference_event_file_alt() {
        deflexical("*INFERENCE-EVENT-DISPATCHER-LOCK*", make_lock($str_alt18$INFERENCE_EVENT_DISPATCHER_Lock));
        deflexical("*INFERENCE-EVENT-DISPATCHER-LISTENERS*", NIL != boundp($inference_event_dispatcher_listeners$) ? ((SubLObject) ($inference_event_dispatcher_listeners$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_inference_event_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*INFERENCE-EVENT-DISPATCHER-LOCK*", make_lock($str18$INFERENCE_EVENT_DISPATCHER_Lock));
            deflexical("*INFERENCE-EVENT-DISPATCHER-LISTENERS*", SubLTrampolineFile.maybeDefault($inference_event_dispatcher_listeners$, $inference_event_dispatcher_listeners$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*INFERENCE-EVENT-DISPATCHER-LISTENERS*", NIL != boundp($inference_event_dispatcher_listeners$) ? ((SubLObject) ($inference_event_dispatcher_listeners$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_inference_event_file_Previous() {
        deflexical("*INFERENCE-EVENT-DISPATCHER-LOCK*", make_lock($str18$INFERENCE_EVENT_DISPATCHER_Lock));
        deflexical("*INFERENCE-EVENT-DISPATCHER-LISTENERS*", SubLTrampolineFile.maybeDefault($inference_event_dispatcher_listeners$, $inference_event_dispatcher_listeners$, NIL));
        return NIL;
    }

    static private final SubLList $list_alt3 = list(makeKeyword("PROPERTY-CHANGE"));

    public static SubLObject setup_inference_event_file() {
        event_model.register_event_class($INFERENCE_NEW_ANSWER, $INFERENCE_EVENT, NIL);
        inference_event_support.note_inference_event_class_properties($INFERENCE_NEW_ANSWER, NIL);
        event_model.register_event_class($INFERENCE_STATUS_CHANGE, $INFERENCE_EVENT, NIL);
        inference_event_support.note_inference_event_class_properties($INFERENCE_STATUS_CHANGE, $list3);
        event_model.register_event_class($SKSI_QUERY, $INFERENCE_EVENT, NIL);
        inference_event_support.note_inference_event_class_properties($SKSI_QUERY, NIL);
        declare_defglobal($inference_event_dispatcher_listeners$);
        return NIL;
    }

    static private final SubLString $str_alt9$Event__S_is_of_type__S__not__S_ = makeString("Event ~S is of type ~S, not ~S.");

    static private final SubLString $str_alt18$INFERENCE_EVENT_DISPATCHER_Lock = makeString("INFERENCE-EVENT-DISPATCHER Lock");

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
    }
}

/**
 * Total time: 76 ms
 */
