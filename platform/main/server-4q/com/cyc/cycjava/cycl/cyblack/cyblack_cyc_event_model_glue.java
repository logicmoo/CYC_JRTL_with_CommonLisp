/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.event_broker;
import com.cyc.cycjava.cycl.event_model;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.rkf_event_dispatcher;
import com.cyc.cycjava.cycl.subloop_queues;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-CYC-EVENT-MODEL-GLUE
 *  source file: /cyc/top/cycl/cyblack/cyblack-cyc-event-model-glue.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_cyc_event_model_glue extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_cyc_event_model_glue() {
    }

    public static final SubLFile me = new cyblack_cyc_event_model_glue();


    // // Definitions
    public static final SubLObject cyblack_event_class_to_cyblack_type(SubLObject event_class) {
        {
            SubLObject pcase_var = event_class;
            if (pcase_var.eql($UIA_BLUE_EVENT)) {
                return $str_alt1$UIA_BLUE_EVENT_POSTING;
            } else
                if (pcase_var.eql($RKF_TRACE_EVENT)) {
                    return $str_alt3$RKF_TRACE_EVENT_POSTING;
                } else
                    if (pcase_var.eql($RKF_BASE_EVENT)) {
                        return $str_alt5$RKF_BASE_EVENT_POSTING;
                    } else
                        if (pcase_var.eql($CYC_BROWSER_CONSTANT_SELECTION_EVENT)) {
                            return $str_alt7$CYC_BROWSER_CONSTANT_SELECTION_EV;
                        } else
                            if (pcase_var.eql($CYC_BROWSER_FORT_SELECTION_EVENT)) {
                                return $str_alt9$CYC_BROWSER_FORT_SELECTION_EVENT;
                            } else
                                if (pcase_var.eql($CYC_BROWSER_SELECTION_EVENT)) {
                                    return $str_alt11$CYC_BROWSER_SELECTION_EVENT;
                                } else
                                    if (pcase_var.eql($CYC_BROWSER_LOGIN_EVENT)) {
                                        return $str_alt13$CYC_BROWSER_LOGIN_EVENT;
                                    } else
                                        if (pcase_var.eql($CYC_BROWSER_BASE_EVENT)) {
                                            return $str_alt15$CYC_BROWSER_BASE_EVENT;
                                        } else
                                            if (pcase_var.eql($UNLEXIFIED_TERM_DISCOVERY_EVENT)) {
                                                return $str_alt17$UNLEXIFIED_TERM_DISCOVERY_EVENT_P;
                                            } else
                                                if (pcase_var.eql($MISSING_KNOWLEDGE_DISCOVERY_EVENT)) {
                                                    return $str_alt19$MISSING_KNOWLEDGE_DISCOVERY_EVENT;
                                                } else
                                                    if (pcase_var.eql($CYC_APPLICATION_EVENT)) {
                                                        return $str_alt21$CYC_APPLICATION_EVENT_POSTING;
                                                    } else
                                                        if (pcase_var.eql($NL_EVENT)) {
                                                            return $str_alt23$NL_EVENT_POSTING;
                                                        } else
                                                            if (pcase_var.eql($SBHL_EVENT)) {
                                                                return $str_alt25$SBHL_EVENT_POSTING;
                                                            } else
                                                                if (pcase_var.eql($INFERENCE_EVENT)) {
                                                                    return $str_alt27$INFERENCE_EVENT_POSTING;
                                                                } else
                                                                    if (pcase_var.eql($KB_STORE_EVENT)) {
                                                                        return $str_alt29$KB_STORE_EVENT_POSTING;
                                                                    } else
                                                                        if (pcase_var.eql($CYC_EVENT)) {
                                                                            return $str_alt31$CYC_EVENT_POSTING;
                                                                        } else
                                                                            if (pcase_var.eql($SUBLISP_EVENT)) {
                                                                                return $str_alt33$SUBLISP_EVENT_POSTING;
                                                                            } else
                                                                                if (pcase_var.eql($APPLICATION_EVENT)) {
                                                                                    return $str_alt35$APPLICATION_EVENT_POSTING;
                                                                                } else
                                                                                    if (pcase_var.eql($SYSTEM_EVENT)) {
                                                                                        return $str_alt37$SYSTEM_EVENT_POSTING;
                                                                                    } else
                                                                                        if (pcase_var.eql($EVENT_ROOT)) {
                                                                                            return $str_alt39$EVENT_ROOT_POSTING;
                                                                                        } else {
                                                                                            return NIL;
                                                                                        }



















        }
    }

    public static final SubLObject serialize_event(SubLObject event) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == event_model.event_p(event)) {
                    Errors.error($str_alt40$SERIALIZE_EVENT___S_is_not_an_ins, event);
                }
            }
            {
                SubLObject event_class = event_model.event_class(event);
                SubLObject cyblack_type = (NIL != event_class) ? ((SubLObject) (cyblack_event_class_to_cyblack_type(event_class))) : NIL;
                SubLObject v_class = event_model.find_in_event_hierarchy(event_model.core_event_hierarchy(), event_class);
                if (NIL == cyblack_type) {
                    return NIL;
                }
                if (NIL == v_class) {
                    return NIL;
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == event_model.event_class_p(v_class)) {
                        Errors.error($str_alt41$SERIALIZE_EVENT__The_event_class_, v_class, event_class);
                    }
                }
                {
                    SubLObject v_properties = event_model.event_class_properties(v_class);
                    SubLObject reversed_plist = NIL;
                    SubLObject reversed_properties_and_values = NIL;
                    if (NIL != v_properties) {
                        {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_properties));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject value = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    reversed_properties_and_values = nconc(list(value, key), reversed_properties_and_values);
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    }
                    reversed_plist = cons($PROPERTIES, reversed_plist);
                    reversed_plist = cons(nreverse(reversed_properties_and_values), reversed_plist);
                    reversed_plist = cons($MESSAGE, reversed_plist);
                    reversed_plist = cons(event_model.event_message(event), reversed_plist);
                    reversed_plist = cons($SOURCE, reversed_plist);
                    reversed_plist = cons(event_model.event_source(event), reversed_plist);
                    reversed_plist = cons($TIMESTAMP, reversed_plist);
                    reversed_plist = cons(event_model.event_timestamp(event), reversed_plist);
                    return cons(cyblack_type, nreverse(reversed_plist));
                }
            }
        }
    }

    // defparameter
    private static final SubLSymbol $cyblack_supress_cem_enqueue_event$ = makeSymbol("*CYBLACK-SUPRESS-CEM-ENQUEUE-EVENT*");

    // defparameter
    public static final SubLSymbol $cyblack_buffered_event_postings$ = makeSymbol("*CYBLACK-BUFFERED-EVENT-POSTINGS*");

    public static final SubLObject set_cyblack_cem_enqueue_event_supression_state(SubLObject state) {
        $cyblack_supress_cem_enqueue_event$.setDynamicValue(state);
        return state;
    }

    public static final SubLObject cyblack_cem_enqueue_event(SubLObject event) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $cyblack_supress_cem_enqueue_event$.getDynamicValue(thread)) {
                return event;
            }
            if (NIL == $cyblack_buffered_event_postings$.getDynamicValue(thread)) {
                $cyblack_buffered_event_postings$.setDynamicValue(object.new_class_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE), thread);
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == event_model.event_p(event)) {
                    Errors.error($str_alt47$CYBLACK_CEM_ENQUEUE_EVENT___S_is_, event);
                }
            }
            {
                SubLObject serialized_event = serialize_event(event);
                SubLObject buffered_event_p = NIL;
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == serialized_event) {
                        Errors.error($str_alt48$CYBLACK_CEM_ENQUEUE_EVENT__Failed, event);
                    }
                }
                if (NIL == cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.getDynamicValue(thread)) {
                    subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method($cyblack_buffered_event_postings$.getDynamicValue(thread), serialized_event);
                    buffered_event_p = T;
                }
                cyblack_cyc_event_knowledge_sources.ensure_cyblack_cyc_event_blackboard_application_is_running();
                if (NIL == cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_blackboard_application$.getDynamicValue(thread)) {
                    Errors.warn($str_alt49$CYBLACK_CEM_ENQUEUE_EVENT__While_, event);
                    return NIL;
                }
                if (NIL == cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.getDynamicValue(thread)) {
                    Errors.warn($str_alt50$CYBLACK_CEM_ENQUEUE_EVENT__While_, event);
                    return NIL;
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == cyblack_cyc_event_bb_agenda.cyblack_cyc_event_bb_lazy_agenda_p(cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.getDynamicValue(thread))) {
                        Errors.error($str_alt51$CYBLACK_CEM_ENQUEUE_EVENT__The_ag, cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.getDynamicValue(thread));
                    }
                }
                if (NIL == buffered_event_p) {
                    cyblack_cyc_event_bb_agenda.cyblack_cyc_event_bb_lazy_agenda_enqueue_serialized_event_method(cyblack_cyc_event_bb_agenda.$cyblack_cyc_event_bb_agenda$.getDynamicValue(thread), serialized_event);
                }
                return event;
            }
        }
    }

    public static final SubLObject cyblack_cyc_map_event_to_cyblack(SubLObject event, SubLObject params) {
        if (params == UNPROVIDED) {
            params = NIL;
        }
        cyblack_cem_enqueue_event(event);
        return event;
    }

    // deflexical
    private static final SubLSymbol $cyblack_cyc_event_to_cyblack_listener$ = makeSymbol("*CYBLACK-CYC-EVENT-TO-CYBLACK-LISTENER*");

    public static final SubLObject declare_cyblack_cyc_event_model_glue_file() {
        declareFunction("cyblack_event_class_to_cyblack_type", "CYBLACK-EVENT-CLASS-TO-CYBLACK-TYPE", 1, 0, false);
        declareFunction("serialize_event", "SERIALIZE-EVENT", 1, 0, false);
        declareFunction("set_cyblack_cem_enqueue_event_supression_state", "SET-CYBLACK-CEM-ENQUEUE-EVENT-SUPRESSION-STATE", 1, 0, false);
        declareFunction("cyblack_cem_enqueue_event", "CYBLACK-CEM-ENQUEUE-EVENT", 1, 0, false);
        declareFunction("cyblack_cyc_map_event_to_cyblack", "CYBLACK-CYC-MAP-EVENT-TO-CYBLACK", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_cyc_event_model_glue_file() {
        defparameter("*CYBLACK-SUPRESS-CEM-ENQUEUE-EVENT*", T);
        defparameter("*CYBLACK-BUFFERED-EVENT-POSTINGS*", NIL);
        deflexical("*CYBLACK-CYC-EVENT-TO-CYBLACK-LISTENER*", event_broker.describe_funcall_listener($EVENT_ROOT, CYBLACK_CYC_MAP_EVENT_TO_CYBLACK, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_cyblack_cyc_event_model_glue_file() {
                rkf_event_dispatcher.register_listener_with_rkf_event_dispatcher($cyblack_cyc_event_to_cyblack_listener$.getGlobalValue());
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol $UIA_BLUE_EVENT = makeKeyword("UIA-BLUE-EVENT");

    static private final SubLString $str_alt1$UIA_BLUE_EVENT_POSTING = makeString("UIA-BLUE-EVENT-POSTING");

    private static final SubLSymbol $RKF_TRACE_EVENT = makeKeyword("RKF-TRACE-EVENT");

    static private final SubLString $str_alt3$RKF_TRACE_EVENT_POSTING = makeString("RKF-TRACE-EVENT-POSTING");

    private static final SubLSymbol $RKF_BASE_EVENT = makeKeyword("RKF-BASE-EVENT");

    static private final SubLString $str_alt5$RKF_BASE_EVENT_POSTING = makeString("RKF-BASE-EVENT-POSTING");

    private static final SubLSymbol $CYC_BROWSER_CONSTANT_SELECTION_EVENT = makeKeyword("CYC-BROWSER-CONSTANT-SELECTION-EVENT");

    static private final SubLString $str_alt7$CYC_BROWSER_CONSTANT_SELECTION_EV = makeString("CYC-BROWSER-CONSTANT-SELECTION-EVENT");

    private static final SubLSymbol $CYC_BROWSER_FORT_SELECTION_EVENT = makeKeyword("CYC-BROWSER-FORT-SELECTION-EVENT");

    static private final SubLString $str_alt9$CYC_BROWSER_FORT_SELECTION_EVENT = makeString("CYC-BROWSER-FORT-SELECTION-EVENT");

    private static final SubLSymbol $CYC_BROWSER_SELECTION_EVENT = makeKeyword("CYC-BROWSER-SELECTION-EVENT");

    static private final SubLString $str_alt11$CYC_BROWSER_SELECTION_EVENT = makeString("CYC-BROWSER-SELECTION-EVENT");

    private static final SubLSymbol $CYC_BROWSER_LOGIN_EVENT = makeKeyword("CYC-BROWSER-LOGIN-EVENT");

    static private final SubLString $str_alt13$CYC_BROWSER_LOGIN_EVENT = makeString("CYC-BROWSER-LOGIN-EVENT");

    private static final SubLSymbol $CYC_BROWSER_BASE_EVENT = makeKeyword("CYC-BROWSER-BASE-EVENT");

    static private final SubLString $str_alt15$CYC_BROWSER_BASE_EVENT = makeString("CYC-BROWSER-BASE-EVENT");

    private static final SubLSymbol $UNLEXIFIED_TERM_DISCOVERY_EVENT = makeKeyword("UNLEXIFIED-TERM-DISCOVERY-EVENT");

    static private final SubLString $str_alt17$UNLEXIFIED_TERM_DISCOVERY_EVENT_P = makeString("UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING");

    private static final SubLSymbol $MISSING_KNOWLEDGE_DISCOVERY_EVENT = makeKeyword("MISSING-KNOWLEDGE-DISCOVERY-EVENT");

    static private final SubLString $str_alt19$MISSING_KNOWLEDGE_DISCOVERY_EVENT = makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING");

    private static final SubLSymbol $CYC_APPLICATION_EVENT = makeKeyword("CYC-APPLICATION-EVENT");

    static private final SubLString $str_alt21$CYC_APPLICATION_EVENT_POSTING = makeString("CYC-APPLICATION-EVENT-POSTING");



    static private final SubLString $str_alt23$NL_EVENT_POSTING = makeString("NL-EVENT-POSTING");



    static private final SubLString $str_alt25$SBHL_EVENT_POSTING = makeString("SBHL-EVENT-POSTING");



    static private final SubLString $str_alt27$INFERENCE_EVENT_POSTING = makeString("INFERENCE-EVENT-POSTING");

    private static final SubLSymbol $KB_STORE_EVENT = makeKeyword("KB-STORE-EVENT");

    static private final SubLString $str_alt29$KB_STORE_EVENT_POSTING = makeString("KB-STORE-EVENT-POSTING");



    static private final SubLString $str_alt31$CYC_EVENT_POSTING = makeString("CYC-EVENT-POSTING");



    static private final SubLString $str_alt33$SUBLISP_EVENT_POSTING = makeString("SUBLISP-EVENT-POSTING");



    static private final SubLString $str_alt35$APPLICATION_EVENT_POSTING = makeString("APPLICATION-EVENT-POSTING");



    static private final SubLString $str_alt37$SYSTEM_EVENT_POSTING = makeString("SYSTEM-EVENT-POSTING");



    static private final SubLString $str_alt39$EVENT_ROOT_POSTING = makeString("EVENT-ROOT-POSTING");

    static private final SubLString $str_alt40$SERIALIZE_EVENT___S_is_not_an_ins = makeString("SERIALIZE-EVENT: ~S is not an instance of the EVENT structure.");

    static private final SubLString $str_alt41$SERIALIZE_EVENT__The_event_class_ = makeString("SERIALIZE-EVENT: The event class ~S associated with ~S is not an instance of the EVENT-CLASS structure.");











    static private final SubLString $str_alt47$CYBLACK_CEM_ENQUEUE_EVENT___S_is_ = makeString("CYBLACK-CEM-ENQUEUE-EVENT: ~S is not an instance of the EVENT structure.");

    static private final SubLString $str_alt48$CYBLACK_CEM_ENQUEUE_EVENT__Failed = makeString("CYBLACK-CEM-ENQUEUE-EVENT: Failed to serialize the event ~S.");

    static private final SubLString $str_alt49$CYBLACK_CEM_ENQUEUE_EVENT__While_ = makeString("CYBLACK-CEM-ENQUEUE-EVENT: While processing the event ~S, no blackboard application was found.");

    static private final SubLString $str_alt50$CYBLACK_CEM_ENQUEUE_EVENT__While_ = makeString("CYBLACK-CEM-ENQUEUE-EVENT: While processing the event ~S, no agenda was found.");

    static private final SubLString $str_alt51$CYBLACK_CEM_ENQUEUE_EVENT__The_ag = makeString("CYBLACK-CEM-ENQUEUE-EVENT: The agenda ~S is not an instance of the class CYBLACK-CYC-EVENT-BB-AGENDA.");

    private static final SubLSymbol CYBLACK_CYC_MAP_EVENT_TO_CYBLACK = makeSymbol("CYBLACK-CYC-MAP-EVENT-TO-CYBLACK");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_cyc_event_model_glue_file();
    }

    public void initializeVariables() {
        init_cyblack_cyc_event_model_glue_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_cyc_event_model_glue_file();
    }
}

