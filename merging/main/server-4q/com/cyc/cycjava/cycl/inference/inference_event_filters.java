/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.event_broker;
import com.cyc.cycjava.cycl.event_model;
import com.cyc.cycjava.cycl.event_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inference_event_filters extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_event_filters();

 public static final String myName = "com.cyc.cycjava.cycl.inference.inference_event_filters";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $known_inference_events$ = makeSymbol("*KNOWN-INFERENCE-EVENTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $inference_event_filter_lock$ = makeSymbol("*INFERENCE-EVENT-FILTER-LOCK*");

    static private final SubLString $$$Inference_Event_Filter_Lock = makeString("Inference Event Filter Lock");

    public static final SubLSymbol $inference_event_filter_listeners$ = makeSymbol("*INFERENCE-EVENT-FILTER-LISTENERS*");

    static private final SubLList $list4 = list(makeSymbol("*INFERENCE-EVENT-FILTER-LOCK*"));

    public static final SubLSymbol $inference_event_filter_relayer$ = makeSymbol("*INFERENCE-EVENT-FILTER-RELAYER*");

    private static final SubLSymbol RELAY_INFERENCE_EVENT = makeSymbol("RELAY-INFERENCE-EVENT");

    private static final SubLSymbol EVENT_CLASS_SELF = makeSymbol("EVENT-CLASS-SELF");

    private static final SubLSymbol REGISTER_HANDLER_FOR_ALL_INFERENCE_EVENTS = makeSymbol("REGISTER-HANDLER-FOR-ALL-INFERENCE-EVENTS");

    private static final SubLSymbol REGISTER_HANDLER_FOR_INFERENCE_EVENT = makeSymbol("REGISTER-HANDLER-FOR-INFERENCE-EVENT");

    static private final SubLString $str14$Invalid_argument__A_does_not_deno = makeString("Invalid argument ~A does not denot an inference event.~%");

    private static final SubLSymbol DEREGISTER_HANDLER_FOR_INFERENCE_EVENT = makeSymbol("DEREGISTER-HANDLER-FOR-INFERENCE-EVENT");

    private static final SubLSymbol $INFERENCE_NEW_ANSWER = makeKeyword("INFERENCE-NEW-ANSWER");

    private static final SubLSymbol $INFERENCE_STATUS_CHANGE = makeKeyword("INFERENCE-STATUS-CHANGE");

    static private final SubLString $str19$Unknown_inference_event_message__ = makeString("Unknown inference event message ~A.");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLString $str22$__Inference__A__A_generated_answe = makeString("~%Inference ~A.~A generated answer ~S");

    private static final SubLSymbol PRINT_NEW_INFERENCE_ANSWER_MESSAGE = makeSymbol("PRINT-NEW-INFERENCE-ANSWER-MESSAGE");

    static private final SubLString $str31$__Inference__A__A_generated_SKSI_ = makeString("~%Inference ~A.~A generated SKSI QUERY message ~S");

    private static final SubLSymbol PRINT_SKSI_QUERY_MESSAGE = makeSymbol("PRINT-SKSI-QUERY-MESSAGE");

    public static final SubLObject with_inference_event_filter_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt4, append(body, NIL));
        }
    }

    public static SubLObject with_inference_event_filter_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list4, append(body, NIL));
    }

    public static final SubLObject rebuild_known_inference_events_alt() {
        $known_inference_events$.setGlobalValue(Mapping.mapcar(symbol_function(EVENT_CLASS_SELF), event_model.children_of_event_class_in_hierarchy($INFERENCE_EVENT, event_model.core_event_hierarchy())));
        return length($known_inference_events$.getGlobalValue());
    }

    public static SubLObject rebuild_known_inference_events() {
        $known_inference_events$.setGlobalValue(Mapping.mapcar(symbol_function(EVENT_CLASS_SELF), event_model.children_of_event_class_in_hierarchy($INFERENCE_EVENT, event_model.core_event_hierarchy())));
        return length($known_inference_events$.getGlobalValue());
    }

    /**
     * Register the handler method HANDLER for all inference events triggered by INFERENCE.
     * INFERENCE is assumed to be a continuable inference.
     */
    @LispMethod(comment = "Register the handler method HANDLER for all inference events triggered by INFERENCE.\r\nINFERENCE is assumed to be a continuable inference.\nRegister the handler method HANDLER for all inference events triggered by INFERENCE.\nINFERENCE is assumed to be a continuable inference.")
    public static final SubLObject register_handler_for_all_inference_events_alt(SubLObject inference, SubLObject handler) {
        SubLTrampolineFile.checkType(inference, INFERENCE_P);
        SubLTrampolineFile.checkType(handler, FUNCTION_SPEC_P);
        {
            SubLObject problem_store = inference_datastructures_inference.inference_problem_store(inference);
            SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(problem_store);
            SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
            com.cyc.cycjava.cycl.inference.inference_event_filters.register_inference_event_handlers_for_problem_store_and_inference($known_inference_events$.getGlobalValue(), handler, problem_store_id, inference_id);
            return inference_event.ensure_inference_event_dispatcher_running();
        }
    }

    /**
     * Register the handler method HANDLER for all inference events triggered by INFERENCE.
     * INFERENCE is assumed to be a continuable inference.
     */
    @LispMethod(comment = "Register the handler method HANDLER for all inference events triggered by INFERENCE.\r\nINFERENCE is assumed to be a continuable inference.\nRegister the handler method HANDLER for all inference events triggered by INFERENCE.\nINFERENCE is assumed to be a continuable inference.")
    public static SubLObject register_handler_for_all_inference_events(final SubLObject inference, final SubLObject handler) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        assert NIL != function_spec_p(handler) : "! function_spec_p(handler) " + ("Types.function_spec_p(handler) " + "CommonSymbols.NIL != Types.function_spec_p(handler) ") + handler;
        final SubLObject problem_store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(problem_store);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        register_inference_event_handlers_for_problem_store_and_inference($known_inference_events$.getGlobalValue(), handler, problem_store_id, inference_id);
        return inference_event.ensure_inference_event_dispatcher_running();
    }

    /**
     * Registe the handler method HANDLER for all inference events of the type event
     * triggered by INFERENCE. INFERENCE is assumed to be a continuable.
     */
    @LispMethod(comment = "Registe the handler method HANDLER for all inference events of the type event\r\ntriggered by INFERENCE. INFERENCE is assumed to be a continuable.\nRegiste the handler method HANDLER for all inference events of the type event\ntriggered by INFERENCE. INFERENCE is assumed to be a continuable.")
    public static final SubLObject register_handler_for_inference_event_alt(SubLObject inference, SubLObject handler, SubLObject event) {
        SubLTrampolineFile.checkType(inference, INFERENCE_P);
        SubLTrampolineFile.checkType(handler, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(event, KEYWORDP);
        if (NIL == subl_promotions.memberP(event, $known_inference_events$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            Errors.error($str_alt14$Invalid_argument__A_does_not_deno, event);
        }
        {
            SubLObject problem_store = inference_datastructures_inference.inference_problem_store(inference);
            SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(problem_store);
            SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
            com.cyc.cycjava.cycl.inference.inference_event_filters.register_inference_event_handler_for_problem_store_and_inference(event, handler, problem_store_id, inference_id);
        }
        return inference_event.ensure_inference_event_dispatcher_running();
    }

    /**
     * Registe the handler method HANDLER for all inference events of the type event
     * triggered by INFERENCE. INFERENCE is assumed to be a continuable.
     */
    @LispMethod(comment = "Registe the handler method HANDLER for all inference events of the type event\r\ntriggered by INFERENCE. INFERENCE is assumed to be a continuable.\nRegiste the handler method HANDLER for all inference events of the type event\ntriggered by INFERENCE. INFERENCE is assumed to be a continuable.")
    public static SubLObject register_handler_for_inference_event(final SubLObject inference, final SubLObject handler, final SubLObject event) {
        assert NIL != inference_datastructures_inference.inference_p(inference) : "! inference_datastructures_inference.inference_p(inference) " + ("inference_datastructures_inference.inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.inference_p(inference) ") + inference;
        assert NIL != function_spec_p(handler) : "! function_spec_p(handler) " + ("Types.function_spec_p(handler) " + "CommonSymbols.NIL != Types.function_spec_p(handler) ") + handler;
        assert NIL != keywordp(event) : "! keywordp(event) " + ("Types.keywordp(event) " + "CommonSymbols.NIL != Types.keywordp(event) ") + event;
        if (NIL == subl_promotions.memberP(event, $known_inference_events$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
            Errors.error($str14$Invalid_argument__A_does_not_deno, event);
        }
        final SubLObject problem_store = inference_datastructures_inference.inference_problem_store(inference);
        final SubLObject problem_store_id = inference_datastructures_problem_store.problem_store_suid(problem_store);
        final SubLObject inference_id = inference_datastructures_inference.inference_suid(inference);
        register_inference_event_handler_for_problem_store_and_inference(event, handler, problem_store_id, inference_id);
        return inference_event.ensure_inference_event_dispatcher_running();
    }

    /**
     *
     *
     * @unknown It is usally not necessary to call this method, because on inference death, the
    cleanup happens automatically. We only support deregistering for ALL events.
     */
    @LispMethod(comment = "@unknown It is usally not necessary to call this method, because on inference death, the\r\ncleanup happens automatically. We only support deregistering for ALL events.")
    public static final SubLObject deregister_handler_for_inference_event_alt(SubLObject problem_store_id, SubLObject inference_id, SubLObject handler) {
        com.cyc.cycjava.cycl.inference.inference_event_filters.deregister_inference_event_handlers_for_problem_store_and_inference(problem_store_id, inference_id, handler);
        return inference_event.ensure_inference_event_dispatcher_running();
    }

    /**
     *
     *
     * @unknown It is usally not necessary to call this method, because on inference death, the
    cleanup happens automatically. We only support deregistering for ALL events.
     */
    @LispMethod(comment = "@unknown It is usally not necessary to call this method, because on inference death, the\r\ncleanup happens automatically. We only support deregistering for ALL events.")
    public static SubLObject deregister_handler_for_inference_event(final SubLObject problem_store_id, final SubLObject inference_id, final SubLObject handler) {
        deregister_inference_event_handlers_for_problem_store_and_inference(problem_store_id, inference_id, handler);
        return inference_event.ensure_inference_event_dispatcher_running();
    }

    public static final SubLObject register_inference_event_handlers_for_problem_store_and_inference_alt(SubLObject events, SubLObject handler, SubLObject problem_store_id, SubLObject inference_id) {
        {
            SubLObject cdolist_list_var = events;
            SubLObject event = NIL;
            for (event = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , event = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.inference.inference_event_filters.register_inference_event_handler_for_problem_store_and_inference(event, handler, problem_store_id, inference_id);
            }
        }
        return problem_store_id;
    }

    public static SubLObject register_inference_event_handlers_for_problem_store_and_inference(final SubLObject events, final SubLObject handler, final SubLObject problem_store_id, final SubLObject inference_id) {
        SubLObject cdolist_list_var = events;
        SubLObject event = NIL;
        event = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_inference_event_handler_for_problem_store_and_inference(event, handler, problem_store_id, inference_id);
            cdolist_list_var = cdolist_list_var.rest();
            event = cdolist_list_var.first();
        } 
        return problem_store_id;
    }

    public static final SubLObject relay_inference_event_alt(SubLObject event, SubLObject my_params) {
        if (my_params == UNPROVIDED) {
            my_params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            {
                SubLObject pcase_var = event_model.event_class(event);
                if (pcase_var.eql($INFERENCE_NEW_ANSWER)) {
                    com.cyc.cycjava.cycl.inference.inference_event_filters.relay_inference_new_answer_event(event);
                } else {
                    if (pcase_var.eql($INFERENCE_STATUS_CHANGE)) {
                        com.cyc.cycjava.cycl.inference.inference_event_filters.relay_inference_status_change_event(event);
                    } else {
                        if (pcase_var.eql($SKSI_QUERY)) {
                            com.cyc.cycjava.cycl.inference.inference_event_filters.relay_sksi_query_event(event);
                        } else {
                            Errors.warn($str_alt19$Unknown_inference_event_message__, event_model.event_class(event));
                        }
                    }
                }
            }
        }
        return event;
    }

    public static SubLObject relay_inference_event(final SubLObject event, SubLObject my_params) {
        if (my_params == UNPROVIDED) {
            my_params = NIL;
        }
        if (NIL == event_utilities.event_is_handler_registration_eventP(event)) {
            final SubLObject pcase_var = event_model.event_class(event);
            if (pcase_var.eql($INFERENCE_NEW_ANSWER)) {
                relay_inference_new_answer_event(event);
            } else
                if (pcase_var.eql($INFERENCE_STATUS_CHANGE)) {
                    relay_inference_status_change_event(event);
                } else
                    if (pcase_var.eql($SKSI_QUERY)) {
                        relay_sksi_query_event(event);
                    } else {
                        Errors.warn($str19$Unknown_inference_event_message__, event_model.event_class(event));
                    }


        }
        return event;
    }

    public static final SubLObject relay_inference_new_answer_event_alt(SubLObject event) {
        {
            SubLObject problem_store_id = inference_event.inference_new_answer_retrieve_problem_store_id(event);
            SubLObject inference_id = inference_event.inference_new_answer_retrieve_inference_id(event);
            SubLObject new_answer_id = inference_event.inference_new_answer_retrieve_new_answer_id(event);
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.inference_event_filters.get_inference_event_listeners_on_problem_store_and_inference(event, problem_store_id, inference_id, UNPROVIDED);
            SubLObject listener = NIL;
            for (listener = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , listener = cdolist_list_var.first()) {
                {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                try {
                                    funcall(listener, problem_store_id, inference_id, new_answer_id);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    }
                }
            }
        }
        return event;
    }

    public static SubLObject relay_inference_new_answer_event(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store_id = inference_event.inference_new_answer_retrieve_problem_store_id(event);
        final SubLObject inference_id = inference_event.inference_new_answer_retrieve_inference_id(event);
        final SubLObject new_answer_id = inference_event.inference_new_answer_retrieve_new_answer_id(event);
        SubLObject cdolist_list_var = get_inference_event_listeners_on_problem_store_and_inference(event, problem_store_id, inference_id, UNPROVIDED);
        SubLObject listener = NIL;
        listener = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        funcall(listener, problem_store_id, inference_id, new_answer_id);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            cdolist_list_var = cdolist_list_var.rest();
            listener = cdolist_list_var.first();
        } 
        return event;
    }

    public static final SubLObject print_new_inference_answer_message_alt(SubLObject store_id, SubLObject inference_id, SubLObject answer_id) {
        format(T, $str_alt22$__Inference__A__A_generated_answe, new SubLObject[]{ store_id, inference_id, answer_id });
        return NIL;
    }

    public static SubLObject print_new_inference_answer_message(final SubLObject store_id, final SubLObject inference_id, final SubLObject answer_id) {
        format(T, $str22$__Inference__A__A_generated_answe, new SubLObject[]{ store_id, inference_id, answer_id });
        return NIL;
    }

    public static final SubLObject relay_inference_status_change_event_alt(SubLObject event) {
        {
            SubLObject problem_store_id = inference_event.inference_status_change_retrieve_problem_store_id(event);
            SubLObject inference_id = inference_event.inference_status_change_retrieve_inference_id(event);
            SubLObject new_status = inference_event.inference_status_change_retrieve_new_status(event);
            SubLObject removeP = eq(new_status, $DEAD);
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.inference_event_filters.get_inference_event_listeners_on_problem_store_and_inference(event, problem_store_id, inference_id, removeP);
            SubLObject listener = NIL;
            for (listener = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , listener = cdolist_list_var.first()) {
                {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                try {
                                    funcall(listener, problem_store_id, inference_id, new_status);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    }
                }
            }
        }
        return event;
    }

    public static SubLObject relay_inference_status_change_event(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store_id = inference_event.inference_status_change_retrieve_problem_store_id(event);
        final SubLObject inference_id = inference_event.inference_status_change_retrieve_inference_id(event);
        final SubLObject new_status = inference_event.inference_status_change_retrieve_new_status(event);
        final SubLObject removeP = eq(new_status, $DEAD);
        SubLObject cdolist_list_var = get_inference_event_listeners_on_problem_store_and_inference(event, problem_store_id, inference_id, removeP);
        SubLObject listener = NIL;
        listener = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        funcall(listener, problem_store_id, inference_id, new_status);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            cdolist_list_var = cdolist_list_var.rest();
            listener = cdolist_list_var.first();
        } 
        return event;
    }

    public static final SubLObject relay_sksi_query_event_alt(SubLObject event) {
        {
            SubLObject problem_store_id = inference_event.sksi_query_retrieve_problem_store_id(event);
            SubLObject inference_id = inference_event.sksi_query_retrieve_inference_id(event);
            SubLObject problem_id = inference_event.sksi_query_retrieve_problem_id(event);
            SubLObject tactic_id = inference_event.sksi_query_retrieve_tactic_id(event);
            SubLObject status = inference_event.sksi_query_retrieve_status(event);
            SubLObject start_time = inference_event.sksi_query_retrieve_start_time(event);
            SubLObject end_time = inference_event.sksi_query_retrieve_end_time(event);
            SubLObject v_properties = listS($CLASS, new SubLObject[]{ $SKSI_QUERY, $PROBLEM_ID, problem_id, $TACTIC_ID, tactic_id, $STATUS, status, append(NIL != start_time ? ((SubLObject) (list($START_TIME, start_time))) : NIL, NIL != end_time ? ((SubLObject) (list($END_TIME, end_time))) : NIL, NIL) });
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.inference.inference_event_filters.get_inference_event_listeners_on_problem_store_and_inference(event, problem_store_id, inference_id, UNPROVIDED);
            SubLObject listener = NIL;
            for (listener = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , listener = cdolist_list_var.first()) {
                {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                try {
                                    funcall(listener, problem_store_id, inference_id, v_properties);
                                } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                rebind(Errors.$error_handler$, _prev_bind_0);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                    }
                }
            }
        }
        return event;
    }

    public static SubLObject relay_sksi_query_event(final SubLObject event) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem_store_id = inference_event.sksi_query_retrieve_problem_store_id(event);
        final SubLObject inference_id = inference_event.sksi_query_retrieve_inference_id(event);
        final SubLObject problem_id = inference_event.sksi_query_retrieve_problem_id(event);
        final SubLObject tactic_id = inference_event.sksi_query_retrieve_tactic_id(event);
        final SubLObject status = inference_event.sksi_query_retrieve_status(event);
        final SubLObject start_time = inference_event.sksi_query_retrieve_start_time(event);
        final SubLObject end_time = inference_event.sksi_query_retrieve_end_time(event);
        final SubLObject v_properties = listS($CLASS, new SubLObject[]{ $SKSI_QUERY, $PROBLEM_ID, problem_id, $TACTIC_ID, tactic_id, $STATUS, status, append(NIL != start_time ? list($START_TIME, start_time) : NIL, NIL != end_time ? list($END_TIME, end_time) : NIL, NIL) });
        SubLObject cdolist_list_var = get_inference_event_listeners_on_problem_store_and_inference(event, problem_store_id, inference_id, UNPROVIDED);
        SubLObject listener = NIL;
        listener = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        funcall(listener, problem_store_id, inference_id, v_properties);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
            cdolist_list_var = cdolist_list_var.rest();
            listener = cdolist_list_var.first();
        } 
        return event;
    }

    public static final SubLObject print_sksi_query_message_alt(SubLObject store_id, SubLObject inference_id, SubLObject parameter) {
        format(T, $str_alt31$__Inference__A__A_generated_SKSI_, new SubLObject[]{ store_id, inference_id, parameter });
        return NIL;
    }

    public static SubLObject print_sksi_query_message(final SubLObject store_id, final SubLObject inference_id, final SubLObject parameter) {
        format(T, $str31$__Inference__A__A_generated_SKSI_, new SubLObject[]{ store_id, inference_id, parameter });
        return NIL;
    }

    /**
     * Auto-remove the entries after the triggering; this is in the case of the inference dying.
     */
    @LispMethod(comment = "Auto-remove the entries after the triggering; this is in the case of the inference dying.")
    public static final SubLObject get_inference_event_listeners_on_problem_store_and_inference_alt(SubLObject event, SubLObject problem_store_id, SubLObject inference_id, SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        {
            SubLObject event_type_listeners = $inference_event_filter_listeners$.getGlobalValue();
            SubLObject listeners = NIL;
            SubLObject lock = $inference_event_filter_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject problem_store_listeners = dictionary.dictionary_lookup(event_type_listeners, event_model.event_class(event), UNPROVIDED);
                    if (NIL != dictionary.dictionary_p(problem_store_listeners)) {
                        {
                            SubLObject inference_listeners = dictionary.dictionary_lookup(problem_store_listeners, problem_store_id, UNPROVIDED);
                            if (NIL != dictionary.dictionary_p(inference_listeners)) {
                                listeners = dictionary.dictionary_lookup(inference_listeners, inference_id, UNPROVIDED);
                                if ((NIL != removeP) && (NIL != listeners)) {
                                    com.cyc.cycjava.cycl.inference.inference_event_filters.deregister_inference_event_handlers_for_problem_store_and_inference(problem_store_id, inference_id, UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return listeners;
        }
    }

    /**
     * Auto-remove the entries after the triggering; this is in the case of the inference dying.
     */
    @LispMethod(comment = "Auto-remove the entries after the triggering; this is in the case of the inference dying.")
    public static SubLObject get_inference_event_listeners_on_problem_store_and_inference(final SubLObject event, final SubLObject problem_store_id, final SubLObject inference_id, SubLObject removeP) {
        if (removeP == UNPROVIDED) {
            removeP = NIL;
        }
        final SubLObject event_type_listeners = $inference_event_filter_listeners$.getGlobalValue();
        SubLObject listeners = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($inference_event_filter_lock$.getGlobalValue());
            final SubLObject problem_store_listeners = dictionary.dictionary_lookup(event_type_listeners, event_model.event_class(event), UNPROVIDED);
            if (NIL != dictionary.dictionary_p(problem_store_listeners)) {
                final SubLObject inference_listeners = dictionary.dictionary_lookup(problem_store_listeners, problem_store_id, UNPROVIDED);
                if (NIL != dictionary.dictionary_p(inference_listeners)) {
                    listeners = dictionary.dictionary_lookup(inference_listeners, inference_id, UNPROVIDED);
                    if ((NIL != removeP) && (NIL != listeners)) {
                        deregister_inference_event_handlers_for_problem_store_and_inference(problem_store_id, inference_id, UNPROVIDED);
                    }
                }
            }
        } finally {
            if (NIL != release) {
                release_lock($inference_event_filter_lock$.getGlobalValue());
            }
        }
        return listeners;
    }

    public static final SubLObject register_inference_event_handler_for_problem_store_and_inference_alt(SubLObject event, SubLObject handler, SubLObject problem_store_id, SubLObject inference_id) {
        {
            SubLObject event_type_listeners = $inference_event_filter_listeners$.getGlobalValue();
            SubLObject lock = $inference_event_filter_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject problem_store_listeners = dictionary.dictionary_lookup(event_type_listeners, event, UNPROVIDED);
                    if (NIL == dictionary.dictionary_p(problem_store_listeners)) {
                        problem_store_listeners = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                        dictionary.dictionary_enter(event_type_listeners, event, problem_store_listeners);
                    }
                    {
                        SubLObject inference_listeners = dictionary.dictionary_lookup(problem_store_listeners, problem_store_id, UNPROVIDED);
                        if (NIL == dictionary.dictionary_p(inference_listeners)) {
                            inference_listeners = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                            dictionary.dictionary_enter(problem_store_listeners, problem_store_id, inference_listeners);
                        }
                        dictionary_utilities.dictionary_push(inference_listeners, inference_id, handler);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return event;
    }

    public static SubLObject register_inference_event_handler_for_problem_store_and_inference(final SubLObject event, final SubLObject handler, final SubLObject problem_store_id, final SubLObject inference_id) {
        final SubLObject event_type_listeners = $inference_event_filter_listeners$.getGlobalValue();
        SubLObject release = NIL;
        try {
            release = seize_lock($inference_event_filter_lock$.getGlobalValue());
            SubLObject problem_store_listeners = dictionary.dictionary_lookup(event_type_listeners, event, UNPROVIDED);
            if (NIL == dictionary.dictionary_p(problem_store_listeners)) {
                problem_store_listeners = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                dictionary.dictionary_enter(event_type_listeners, event, problem_store_listeners);
            }
            SubLObject inference_listeners = dictionary.dictionary_lookup(problem_store_listeners, problem_store_id, UNPROVIDED);
            if (NIL == dictionary.dictionary_p(inference_listeners)) {
                inference_listeners = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                dictionary.dictionary_enter(problem_store_listeners, problem_store_id, inference_listeners);
            }
            dictionary_utilities.dictionary_push(inference_listeners, inference_id, handler);
        } finally {
            if (NIL != release) {
                release_lock($inference_event_filter_lock$.getGlobalValue());
            }
        }
        return event;
    }

    public static final SubLObject deregister_inference_event_handlers_for_problem_store_and_inference_alt(SubLObject problem_store_id, SubLObject inference_id, SubLObject handler) {
        if (handler == UNPROVIDED) {
            handler = NIL;
        }
        {
            SubLObject lock = $inference_event_filter_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject cdolist_list_var = $known_inference_events$.getGlobalValue();
                    SubLObject event = NIL;
                    for (event = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , event = cdolist_list_var.first()) {
                        {
                            SubLObject event_type_listeners = $inference_event_filter_listeners$.getGlobalValue();
                            SubLObject problem_store_listeners = dictionary.dictionary_lookup(event_type_listeners, event, UNPROVIDED);
                            if (NIL != dictionary.dictionary_p(problem_store_listeners)) {
                                {
                                    SubLObject inference_listeners = dictionary.dictionary_lookup(problem_store_listeners, problem_store_id, UNPROVIDED);
                                    if (NIL != dictionary.dictionary_p(inference_listeners)) {
                                        if (handler.isFunctionSpec()) {
                                            dictionary_utilities.dictionary_remove_from_value(inference_listeners, inference_id, handler, UNPROVIDED, UNPROVIDED);
                                        } else {
                                            dictionary.dictionary_remove(inference_listeners, inference_id);
                                        }
                                        if (dictionary.dictionary_length(inference_listeners).isZero() || (NIL == inference_datastructures_problem_store.valid_problem_store_p(inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id)))) {
                                            dictionary.dictionary_remove(problem_store_listeners, problem_store_id);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return $DEREGISTERED;
    }

    public static SubLObject deregister_inference_event_handlers_for_problem_store_and_inference(final SubLObject problem_store_id, final SubLObject inference_id, SubLObject handler) {
        if (handler == UNPROVIDED) {
            handler = NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($inference_event_filter_lock$.getGlobalValue());
            SubLObject cdolist_list_var = $known_inference_events$.getGlobalValue();
            SubLObject event = NIL;
            event = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject event_type_listeners = $inference_event_filter_listeners$.getGlobalValue();
                final SubLObject problem_store_listeners = dictionary.dictionary_lookup(event_type_listeners, event, UNPROVIDED);
                if (NIL != dictionary.dictionary_p(problem_store_listeners)) {
                    final SubLObject inference_listeners = dictionary.dictionary_lookup(problem_store_listeners, problem_store_id, UNPROVIDED);
                    if (NIL != dictionary.dictionary_p(inference_listeners)) {
                        if (handler.isFunctionSpec()) {
                            dictionary_utilities.dictionary_remove_from_value(inference_listeners, inference_id, handler, UNPROVIDED, UNPROVIDED);
                        } else {
                            dictionary.dictionary_remove(inference_listeners, inference_id);
                        }
                        if (dictionary.dictionary_length(inference_listeners).isZero() || (NIL == inference_datastructures_problem_store.valid_problem_store_p(inference_datastructures_problem_store.find_problem_store_by_id(problem_store_id)))) {
                            dictionary.dictionary_remove(problem_store_listeners, problem_store_id);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                event = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($inference_event_filter_lock$.getGlobalValue());
            }
        }
        return $DEREGISTERED;
    }

    public static SubLObject declare_inference_event_filters_file() {
        declareMacro("with_inference_event_filter_lock", "WITH-INFERENCE-EVENT-FILTER-LOCK");
        declareFunction("rebuild_known_inference_events", "REBUILD-KNOWN-INFERENCE-EVENTS", 0, 0, false);
        declareFunction("register_handler_for_all_inference_events", "REGISTER-HANDLER-FOR-ALL-INFERENCE-EVENTS", 2, 0, false);
        declareFunction("register_handler_for_inference_event", "REGISTER-HANDLER-FOR-INFERENCE-EVENT", 3, 0, false);
        declareFunction("deregister_handler_for_inference_event", "DEREGISTER-HANDLER-FOR-INFERENCE-EVENT", 3, 0, false);
        declareFunction("register_inference_event_handlers_for_problem_store_and_inference", "REGISTER-INFERENCE-EVENT-HANDLERS-FOR-PROBLEM-STORE-AND-INFERENCE", 4, 0, false);
        declareFunction("relay_inference_event", "RELAY-INFERENCE-EVENT", 1, 1, false);
        declareFunction("relay_inference_new_answer_event", "RELAY-INFERENCE-NEW-ANSWER-EVENT", 1, 0, false);
        declareFunction("print_new_inference_answer_message", "PRINT-NEW-INFERENCE-ANSWER-MESSAGE", 3, 0, false);
        declareFunction("relay_inference_status_change_event", "RELAY-INFERENCE-STATUS-CHANGE-EVENT", 1, 0, false);
        declareFunction("relay_sksi_query_event", "RELAY-SKSI-QUERY-EVENT", 1, 0, false);
        declareFunction("print_sksi_query_message", "PRINT-SKSI-QUERY-MESSAGE", 3, 0, false);
        declareFunction("get_inference_event_listeners_on_problem_store_and_inference", "GET-INFERENCE-EVENT-LISTENERS-ON-PROBLEM-STORE-AND-INFERENCE", 3, 1, false);
        declareFunction("register_inference_event_handler_for_problem_store_and_inference", "REGISTER-INFERENCE-EVENT-HANDLER-FOR-PROBLEM-STORE-AND-INFERENCE", 4, 0, false);
        declareFunction("deregister_inference_event_handlers_for_problem_store_and_inference", "DEREGISTER-INFERENCE-EVENT-HANDLERS-FOR-PROBLEM-STORE-AND-INFERENCE", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_inference_event_filters_file_alt() {
        deflexical("*INFERENCE-EVENT-FILTER-LOCK*", NIL != boundp($inference_event_filter_lock$) ? ((SubLObject) ($inference_event_filter_lock$.getGlobalValue())) : make_lock($$$Inference_Event_Filter_Lock));
        deflexical("*INFERENCE-EVENT-FILTER-LISTENERS*", NIL != boundp($inference_event_filter_listeners$) ? ((SubLObject) ($inference_event_filter_listeners$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*INFERENCE-EVENT-FILTER-RELAYER*", NIL != boundp($inference_event_filter_relayer$) ? ((SubLObject) ($inference_event_filter_relayer$.getGlobalValue())) : event_broker.describe_funcall_listener($INFERENCE_EVENT, RELAY_INFERENCE_EVENT, UNPROVIDED, UNPROVIDED));
        deflexical("*KNOWN-INFERENCE-EVENTS*", Mapping.mapcar(symbol_function(EVENT_CLASS_SELF), event_model.children_of_event_class_in_hierarchy($INFERENCE_EVENT, event_model.core_event_hierarchy())));
        return NIL;
    }

    public static SubLObject init_inference_event_filters_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*INFERENCE-EVENT-FILTER-LOCK*", SubLTrampolineFile.maybeDefault($inference_event_filter_lock$, $inference_event_filter_lock$, () -> make_lock($$$Inference_Event_Filter_Lock)));
            deflexical("*INFERENCE-EVENT-FILTER-LISTENERS*", SubLTrampolineFile.maybeDefault($inference_event_filter_listeners$, $inference_event_filter_listeners$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            deflexical("*INFERENCE-EVENT-FILTER-RELAYER*", SubLTrampolineFile.maybeDefault($inference_event_filter_relayer$, $inference_event_filter_relayer$, () -> event_broker.describe_funcall_listener($INFERENCE_EVENT, RELAY_INFERENCE_EVENT, UNPROVIDED, UNPROVIDED)));
            deflexical("*KNOWN-INFERENCE-EVENTS*", Mapping.mapcar(symbol_function(EVENT_CLASS_SELF), event_model.children_of_event_class_in_hierarchy($INFERENCE_EVENT, event_model.core_event_hierarchy())));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*INFERENCE-EVENT-FILTER-LOCK*", NIL != boundp($inference_event_filter_lock$) ? ((SubLObject) ($inference_event_filter_lock$.getGlobalValue())) : make_lock($$$Inference_Event_Filter_Lock));
            deflexical("*INFERENCE-EVENT-FILTER-LISTENERS*", NIL != boundp($inference_event_filter_listeners$) ? ((SubLObject) ($inference_event_filter_listeners$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*INFERENCE-EVENT-FILTER-RELAYER*", NIL != boundp($inference_event_filter_relayer$) ? ((SubLObject) ($inference_event_filter_relayer$.getGlobalValue())) : event_broker.describe_funcall_listener($INFERENCE_EVENT, RELAY_INFERENCE_EVENT, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_inference_event_filters_file_Previous() {
        deflexical("*INFERENCE-EVENT-FILTER-LOCK*", SubLTrampolineFile.maybeDefault($inference_event_filter_lock$, $inference_event_filter_lock$, () -> make_lock($$$Inference_Event_Filter_Lock)));
        deflexical("*INFERENCE-EVENT-FILTER-LISTENERS*", SubLTrampolineFile.maybeDefault($inference_event_filter_listeners$, $inference_event_filter_listeners$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*INFERENCE-EVENT-FILTER-RELAYER*", SubLTrampolineFile.maybeDefault($inference_event_filter_relayer$, $inference_event_filter_relayer$, () -> event_broker.describe_funcall_listener($INFERENCE_EVENT, RELAY_INFERENCE_EVENT, UNPROVIDED, UNPROVIDED)));
        deflexical("*KNOWN-INFERENCE-EVENTS*", Mapping.mapcar(symbol_function(EVENT_CLASS_SELF), event_model.children_of_event_class_in_hierarchy($INFERENCE_EVENT, event_model.core_event_hierarchy())));
        return NIL;
    }

    public static SubLObject setup_inference_event_filters_file() {
        declare_defglobal($inference_event_filter_lock$);
        declare_defglobal($inference_event_filter_listeners$);
        declare_defglobal($inference_event_filter_relayer$);
        inference_event.register_listener_with_inference_event_dispatcher($inference_event_filter_relayer$.getGlobalValue());
        register_external_symbol(REGISTER_HANDLER_FOR_ALL_INFERENCE_EVENTS);
        register_external_symbol(REGISTER_HANDLER_FOR_INFERENCE_EVENT);
        register_external_symbol(DEREGISTER_HANDLER_FOR_INFERENCE_EVENT);
        note_funcall_helper_function(PRINT_NEW_INFERENCE_ANSWER_MESSAGE);
        note_funcall_helper_function(PRINT_SKSI_QUERY_MESSAGE);
        return NIL;
    }

    static private final SubLList $list_alt4 = list(makeSymbol("*INFERENCE-EVENT-FILTER-LOCK*"));

    @Override
    public void declareFunctions() {
        declare_inference_event_filters_file();
    }

    static private final SubLString $str_alt14$Invalid_argument__A_does_not_deno = makeString("Invalid argument ~A does not denot an inference event.~%");

    @Override
    public void initializeVariables() {
        init_inference_event_filters_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_event_filters_file();
    }

    

    static private final SubLString $str_alt19$Unknown_inference_event_message__ = makeString("Unknown inference event message ~A.");

    static private final SubLString $str_alt22$__Inference__A__A_generated_answe = makeString("~%Inference ~A.~A generated answer ~S");

    static private final SubLString $str_alt31$__Inference__A__A_generated_SKSI_ = makeString("~%Inference ~A.~A generated SKSI QUERY message ~S");
}

/**
 * Total time: 169 ms
 */
