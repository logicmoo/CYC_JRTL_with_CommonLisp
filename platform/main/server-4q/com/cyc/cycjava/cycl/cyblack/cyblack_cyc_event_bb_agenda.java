/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-CYC-EVENT-BB-AGENDA
 *  source file: /cyc/top/cycl/cyblack/cyblack-cyc-event-bb-agenda.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_cyc_event_bb_agenda extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_cyc_event_bb_agenda() {
    }

    public static final SubLFile me = new cyblack_cyc_event_bb_agenda();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_cyc_event_bb_agenda";

    // // Definitions
    // defvar
    public static final SubLSymbol $cyblack_cyc_event_blackboard_application$ = makeSymbol("*CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION*");

    // defvar
    public static final SubLSymbol $cyblack_cyc_event_bb_agenda$ = makeSymbol("*CYBLACK-CYC-EVENT-BB-AGENDA*");

    // defvar
    private static final SubLSymbol $cyblack_cyc_event_bb_obtain_semaphore_from_event_broker$ = makeSymbol("*CYBLACK-CYC-EVENT-BB-OBTAIN-SEMAPHORE-FROM-EVENT-BROKER*");

    public static final SubLObject set_cyblack_obtain_semaphore_from_event_broker_state(SubLObject state) {
        $cyblack_cyc_event_bb_obtain_semaphore_from_event_broker$.setDynamicValue(state);
        return state;
    }

    public static final SubLObject get_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue(SubLObject v_cyblack_cyc_event_bb_agenda) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_cyc_event_bb_agenda, THIRTEEN_INTEGER, CYC_SERIALIZED_EVENT_QUEUE);
    }

    public static final SubLObject set_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue(SubLObject v_cyblack_cyc_event_bb_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_cyc_event_bb_agenda, value, THIRTEEN_INTEGER, CYC_SERIALIZED_EVENT_QUEUE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_bb_agenda_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_bb_agenda_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, AGENDA_TRACE_ON, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, TERMINATE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, SUSPENDED_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, ACTIVE_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, EXECUTABLE_KSI_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, FUTILE_CYCLE_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, MAX_FUTILE_CYCLES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_AGENDA, CYC_SERIALIZED_EVENT_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_bb_agenda_p(SubLObject v_cyblack_cyc_event_bb_agenda) {
        return classes.subloop_instanceof_class(v_cyblack_cyc_event_bb_agenda, CYBLACK_CYC_EVENT_BB_AGENDA);
    }

    public static final SubLObject cyblack_cyc_event_bb_agenda_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_agenda_method = NIL;
            SubLObject cyc_serialized_event_queue = get_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue(self);
            try {
                try {
                    cyblack_defapp.cyblack_defapp_agenda_base_initialize_method(self);
                    cyc_serialized_event_queue = object.object_new_method(BASIC_DOUBLY_LINKED_QUEUE);
                    $cyblack_cyc_event_bb_agenda$.setDynamicValue(self);
                    sublisp_throw($sym30$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_AGENDA_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue(self, cyc_serialized_event_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym30$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_agenda_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_agenda_enqueue_serialized_event_method(SubLObject self, SubLObject serialized_event) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_agenda_method = NIL;
            SubLObject cyc_serialized_event_queue = get_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue(self);
            try {
                try {
                    subloop_queues.basic_doubly_linked_queue_enqueue_method(cyc_serialized_event_queue, serialized_event);
                    sublisp_throw($sym37$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_AGENDA_METHOD, serialized_event);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue(self, cyc_serialized_event_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_agenda_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_agenda_dequeue_serialized_event_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_agenda_method = NIL;
            SubLObject cyc_serialized_event_queue = get_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue(self);
            try {
                try {
                    if (NIL != subloop_queues.basic_doubly_linked_queue_empty_p_method(cyc_serialized_event_queue)) {
                        sublisp_throw($sym41$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_AGENDA_METHOD, NIL);
                    }
                    sublisp_throw($sym41$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_AGENDA_METHOD, subloop_queues.basic_doubly_linked_queue_dequeue_method(cyc_serialized_event_queue));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue(self, cyc_serialized_event_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_agenda_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_agenda_dequeue_event_method(SubLObject self) {
        {
            SubLObject serialized_event = methods.funcall_instance_method_with_0_args(self, DEQUEUE_SERIALIZED_EVENT);
            if (NIL == serialized_event) {
                return NIL;
            }
            {
                SubLObject datum = serialized_event;
                SubLObject current = datum;
                SubLObject cyblack_type_string = NIL;
                SubLObject value_plist = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt45);
                cyblack_type_string = current.first();
                current = current.rest();
                value_plist = current;
                {
                    SubLObject bb_app = cyblack_object.cyblack_object_get_application_method(self);
                    SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(bb_app);
                    SubLObject datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, cyblack_type_string, UNPROVIDED);
                    SubLObject posting = cyblack_datatype.cyblack_datatype_create_posting(datatype);
                    object.object_assimilate_method(posting, value_plist);
                    return posting;
                }
            }
        }
    }

    public static final SubLObject get_cyblack_cyc_event_bb_lazy_agenda_current_sleep_interval(SubLObject cyblack_cyc_event_bb_lazy_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cyc_event_bb_lazy_agenda, EIGHTEEN_INTEGER, CURRENT_SLEEP_INTERVAL);
    }

    public static final SubLObject set_cyblack_cyc_event_bb_lazy_agenda_current_sleep_interval(SubLObject cyblack_cyc_event_bb_lazy_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cyc_event_bb_lazy_agenda, value, EIGHTEEN_INTEGER, CURRENT_SLEEP_INTERVAL);
    }

    public static final SubLObject get_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration(SubLObject cyblack_cyc_event_bb_lazy_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cyc_event_bb_lazy_agenda, SEVENTEEN_INTEGER, MAXIMUM_ACCELERATION);
    }

    public static final SubLObject set_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration(SubLObject cyblack_cyc_event_bb_lazy_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cyc_event_bb_lazy_agenda, value, SEVENTEEN_INTEGER, MAXIMUM_ACCELERATION);
    }

    public static final SubLObject get_cyblack_cyc_event_bb_lazy_agenda_average_sleep_interval(SubLObject cyblack_cyc_event_bb_lazy_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cyc_event_bb_lazy_agenda, SIXTEEN_INTEGER, AVERAGE_SLEEP_INTERVAL);
    }

    public static final SubLObject set_cyblack_cyc_event_bb_lazy_agenda_average_sleep_interval(SubLObject cyblack_cyc_event_bb_lazy_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cyc_event_bb_lazy_agenda, value, SIXTEEN_INTEGER, AVERAGE_SLEEP_INTERVAL);
    }

    public static final SubLObject get_cyblack_cyc_event_bb_lazy_agenda_last_cycle_timestamp(SubLObject cyblack_cyc_event_bb_lazy_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cyc_event_bb_lazy_agenda, FIFTEEN_INTEGER, LAST_CYCLE_TIMESTAMP);
    }

    public static final SubLObject set_cyblack_cyc_event_bb_lazy_agenda_last_cycle_timestamp(SubLObject cyblack_cyc_event_bb_lazy_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cyc_event_bb_lazy_agenda, value, FIFTEEN_INTEGER, LAST_CYCLE_TIMESTAMP);
    }

    public static final SubLObject get_cyblack_cyc_event_bb_lazy_agenda_cycle_count(SubLObject cyblack_cyc_event_bb_lazy_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cyc_event_bb_lazy_agenda, FOURTEEN_INTEGER, CYCLE_COUNT);
    }

    public static final SubLObject set_cyblack_cyc_event_bb_lazy_agenda_cycle_count(SubLObject cyblack_cyc_event_bb_lazy_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cyc_event_bb_lazy_agenda, value, FOURTEEN_INTEGER, CYCLE_COUNT);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_bb_lazy_agenda_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_bb_lazy_agenda_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, AGENDA_TRACE_ON, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, TERMINATE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, SUSPENDED_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, ACTIVE_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, EXECUTABLE_KSI_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, FUTILE_CYCLE_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, MAX_FUTILE_CYCLES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_AGENDA, CYC_SERIALIZED_EVENT_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, CYCLE_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, LAST_CYCLE_TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, AVERAGE_SLEEP_INTERVAL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, MAXIMUM_ACCELERATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, CURRENT_SLEEP_INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_bb_lazy_agenda_p(SubLObject cyblack_cyc_event_bb_lazy_agenda) {
        return classes.subloop_instanceof_class(cyblack_cyc_event_bb_lazy_agenda, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA);
    }

    public static final SubLObject cyblack_cyc_event_bb_lazy_agenda_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method = NIL;
            SubLObject current_sleep_interval = get_cyblack_cyc_event_bb_lazy_agenda_current_sleep_interval(self);
            SubLObject maximum_acceleration = get_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration(self);
            SubLObject average_sleep_interval = get_cyblack_cyc_event_bb_lazy_agenda_average_sleep_interval(self);
            SubLObject last_cycle_timestamp = get_cyblack_cyc_event_bb_lazy_agenda_last_cycle_timestamp(self);
            SubLObject cycle_count = get_cyblack_cyc_event_bb_lazy_agenda_cycle_count(self);
            try {
                try {
                    cyblack_cyc_event_bb_agenda_initialize_method(self);
                    cycle_count = ZERO_INTEGER;
                    last_cycle_timestamp = ZERO_INTEGER;
                    average_sleep_interval = $float$5_0;
                    maximum_acceleration = $float$0_1;
                    current_sleep_interval = $float$5_0;
                    sublisp_throw($sym57$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_lazy_agenda_current_sleep_interval(self, current_sleep_interval);
                            set_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration(self, maximum_acceleration);
                            set_cyblack_cyc_event_bb_lazy_agenda_average_sleep_interval(self, average_sleep_interval);
                            set_cyblack_cyc_event_bb_lazy_agenda_last_cycle_timestamp(self, last_cycle_timestamp);
                            set_cyblack_cyc_event_bb_lazy_agenda_cycle_count(self, cycle_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_lazy_agenda_adjust_sleep_interval_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method = NIL;
            SubLObject current_sleep_interval = get_cyblack_cyc_event_bb_lazy_agenda_current_sleep_interval(self);
            SubLObject maximum_acceleration = get_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration(self);
            SubLObject average_sleep_interval = get_cyblack_cyc_event_bb_lazy_agenda_average_sleep_interval(self);
            SubLObject last_cycle_timestamp = get_cyblack_cyc_event_bb_lazy_agenda_last_cycle_timestamp(self);
            SubLObject cycle_count = get_cyblack_cyc_event_bb_lazy_agenda_cycle_count(self);
            try {
                try {
                    if (last_cycle_timestamp.isZero()) {
                        last_cycle_timestamp = get_universal_time();
                    } else {
                        {
                            SubLObject previous_cycle_timestamp = last_cycle_timestamp;
                            SubLObject current_delta = NIL;
                            last_cycle_timestamp = get_universal_time();
                            current_delta = subtract(last_cycle_timestamp, previous_cycle_timestamp);
                            cycle_count = add(cycle_count, ONE_INTEGER);
                            average_sleep_interval = divide(add(average_sleep_interval, current_delta), cycle_count);
                            if (subtract(current_delta, $float$0_1).numLE(average_sleep_interval)) {
                                current_sleep_interval = subtract(average_sleep_interval, multiply(average_sleep_interval, maximum_acceleration));
                            } else
                                if (add(current_delta, $float$0_1).numGE(average_sleep_interval)) {
                                    current_sleep_interval = add(average_sleep_interval, multiply(average_sleep_interval, maximum_acceleration));
                                }

                        }
                    }
                    sublisp_throw($sym63$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD, current_sleep_interval);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_lazy_agenda_current_sleep_interval(self, current_sleep_interval);
                            set_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration(self, maximum_acceleration);
                            set_cyblack_cyc_event_bb_lazy_agenda_average_sleep_interval(self, average_sleep_interval);
                            set_cyblack_cyc_event_bb_lazy_agenda_last_cycle_timestamp(self, last_cycle_timestamp);
                            set_cyblack_cyc_event_bb_lazy_agenda_cycle_count(self, cycle_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_lazy_agenda_slow_down_method(SubLObject self, SubLObject max) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method = NIL;
                SubLObject current_sleep_interval = get_cyblack_cyc_event_bb_lazy_agenda_current_sleep_interval(self);
                SubLObject maximum_acceleration = get_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(max.isNumber() && max.numG(ZERO_INTEGER))) {
                                Errors.error($str_alt69$_SLOW_DOWN__S____S_is_not_a_posit, self, max);
                            }
                        }
                        if (current_sleep_interval.numLE($float$0_0)) {
                            current_sleep_interval = $float$0_1;
                        } else {
                            current_sleep_interval = min(add(current_sleep_interval, multiply(current_sleep_interval, maximum_acceleration)), max);
                        }
                        sublisp_throw($sym68$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_cyc_event_bb_lazy_agenda_current_sleep_interval(self, current_sleep_interval);
                                set_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration(self, maximum_acceleration);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym68$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD);
                }
                return catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method;
            }
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_lazy_agenda_propose_method(SubLObject self, SubLObject proposal) {
        cyblack_cyc_event_bb_lazy_agenda_adjust_sleep_interval_method(self);
        return cyblack_defapp.cyblack_defapp_agenda_base_propose_method(self, proposal);
    }

    public static final SubLObject cyblack_cyc_event_bb_lazy_agenda_enqueue_serialized_event_method(SubLObject self, SubLObject serialized_event) {
        cyblack_cyc_event_bb_lazy_agenda_adjust_sleep_interval_method(self);
        return cyblack_cyc_event_bb_agenda_enqueue_serialized_event_method(self, serialized_event);
    }

    public static final SubLObject cyblack_cyc_event_bb_lazy_agenda_get_maximum_acceleration_method(SubLObject self) {
        {
            SubLObject maximum_acceleration = get_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration(self);
            return maximum_acceleration;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_lazy_agenda_set_maximum_acceleration_method(SubLObject self, SubLObject new_value) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method = NIL;
            SubLObject maximum_acceleration = get_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration(self);
            try {
                try {
                    maximum_acceleration = new_value;
                    sublisp_throw($sym85$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD, new_value);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration(self, maximum_acceleration);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym85$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_lazy_agenda_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_lazy_agenda_get_current_sleep_interval_method(SubLObject self) {
        {
            SubLObject current_sleep_interval = get_cyblack_cyc_event_bb_lazy_agenda_current_sleep_interval(self);
            return current_sleep_interval;
        }
    }

    public static final SubLObject get_cyblack_cyc_event_bb_ipc_agenda_semaphore(SubLObject cyblack_cyc_event_bb_ipc_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cyc_event_bb_ipc_agenda, FIFTEEN_INTEGER, SEMAPHORE);
    }

    public static final SubLObject set_cyblack_cyc_event_bb_ipc_agenda_semaphore(SubLObject cyblack_cyc_event_bb_ipc_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cyc_event_bb_ipc_agenda, value, FIFTEEN_INTEGER, SEMAPHORE);
    }

    public static final SubLObject get_cyblack_cyc_event_bb_ipc_agenda_semaphore_name(SubLObject cyblack_cyc_event_bb_ipc_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cyc_event_bb_ipc_agenda, FOURTEEN_INTEGER, SEMAPHORE_NAME);
    }

    public static final SubLObject set_cyblack_cyc_event_bb_ipc_agenda_semaphore_name(SubLObject cyblack_cyc_event_bb_ipc_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cyc_event_bb_ipc_agenda, value, FOURTEEN_INTEGER, SEMAPHORE_NAME);
    }

    public static final SubLObject get_cyblack_cyc_event_bb_ipc_agenda_base_suffix_counter(SubLObject cyblack_cyc_event_bb_ipc_agenda) {
        {
            SubLObject v_class = (cyblack_cyc_event_bb_ipc_agenda.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_cyc_event_bb_ipc_agenda))) : NIL != subloop_structures.class_p(cyblack_cyc_event_bb_ipc_agenda) ? ((SubLObject) (cyblack_cyc_event_bb_ipc_agenda)) : NIL != subloop_structures.instance_p(cyblack_cyc_event_bb_ipc_agenda) ? ((SubLObject) (subloop_structures.instance_class(cyblack_cyc_event_bb_ipc_agenda))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_cyblack_cyc_event_bb_ipc_agenda_base_suffix_counter(SubLObject cyblack_cyc_event_bb_ipc_agenda, SubLObject value) {
        {
            SubLObject v_class = (cyblack_cyc_event_bb_ipc_agenda.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_cyc_event_bb_ipc_agenda))) : NIL != subloop_structures.class_p(cyblack_cyc_event_bb_ipc_agenda) ? ((SubLObject) (cyblack_cyc_event_bb_ipc_agenda)) : NIL != subloop_structures.instance_p(cyblack_cyc_event_bb_ipc_agenda) ? ((SubLObject) (subloop_structures.instance_class(cyblack_cyc_event_bb_ipc_agenda))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject get_cyblack_cyc_event_bb_ipc_agenda_base_name(SubLObject cyblack_cyc_event_bb_ipc_agenda) {
        {
            SubLObject v_class = (cyblack_cyc_event_bb_ipc_agenda.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_cyc_event_bb_ipc_agenda))) : NIL != subloop_structures.class_p(cyblack_cyc_event_bb_ipc_agenda) ? ((SubLObject) (cyblack_cyc_event_bb_ipc_agenda)) : NIL != subloop_structures.instance_p(cyblack_cyc_event_bb_ipc_agenda) ? ((SubLObject) (subloop_structures.instance_class(cyblack_cyc_event_bb_ipc_agenda))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_cyblack_cyc_event_bb_ipc_agenda_base_name(SubLObject cyblack_cyc_event_bb_ipc_agenda, SubLObject value) {
        {
            SubLObject v_class = (cyblack_cyc_event_bb_ipc_agenda.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_cyc_event_bb_ipc_agenda))) : NIL != subloop_structures.class_p(cyblack_cyc_event_bb_ipc_agenda) ? ((SubLObject) (cyblack_cyc_event_bb_ipc_agenda)) : NIL != subloop_structures.instance_p(cyblack_cyc_event_bb_ipc_agenda) ? ((SubLObject) (subloop_structures.instance_class(cyblack_cyc_event_bb_ipc_agenda))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_bb_ipc_agenda_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_IPC_AGENDA, BASE_NAME, $str_alt96$CYBLACK_BASIC_IPC_AGENDA);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_IPC_AGENDA, BASE_SUFFIX_COUNTER, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_bb_ipc_agenda_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, AGENDA_TRACE_ON, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, TERMINATE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, SUSPENDED_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, ACTIVE_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, EXECUTABLE_KSI_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, FUTILE_CYCLE_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, MAX_FUTILE_CYCLES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_AGENDA, CYC_SERIALIZED_EVENT_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_IPC_AGENDA, SEMAPHORE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_BB_IPC_AGENDA, SEMAPHORE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_bb_ipc_agenda_p(SubLObject cyblack_cyc_event_bb_ipc_agenda) {
        return classes.subloop_instanceof_class(cyblack_cyc_event_bb_ipc_agenda, CYBLACK_CYC_EVENT_BB_IPC_AGENDA);
    }

    public static final SubLObject cyblack_cyc_event_bb_ipc_agenda_initialize_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = NIL;
                SubLObject base_suffix_counter = get_cyblack_cyc_event_bb_ipc_agenda_base_suffix_counter(self);
                SubLObject base_name = get_cyblack_cyc_event_bb_ipc_agenda_base_name(self);
                SubLObject semaphore = get_cyblack_cyc_event_bb_ipc_agenda_semaphore(self);
                SubLObject semaphore_name = get_cyblack_cyc_event_bb_ipc_agenda_semaphore_name(self);
                SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
                try {
                    try {
                        cyblack_cyc_event_bb_agenda_initialize_method(self);
                        if (NIL == base_name) {
                            base_name = $str_alt96$CYBLACK_BASIC_IPC_AGENDA;
                        }
                        if (NIL == base_suffix_counter) {
                            base_suffix_counter = ZERO_INTEGER;
                        }
                        semaphore_name = cconcatenate(base_name, string_utilities.to_string(base_suffix_counter));
                        base_suffix_counter = add(base_suffix_counter, ONE_INTEGER);
                        lock = make_lock(cconcatenate($str_alt101$Lock_for_Queue_, semaphore_name));
                        if (NIL != $cyblack_cyc_event_bb_obtain_semaphore_from_event_broker$.getDynamicValue(thread)) {
                            {
                                SubLObject v_event_broker = event_broker.core_event_broker();
                                SubLObject event_broker_ipc_queue = event_broker.event_broker_postings(v_event_broker);
                                semaphore = process_utilities.ipc_queue_semaphore(event_broker_ipc_queue);
                            }
                        } else {
                            semaphore = Semaphores.new_semaphore(semaphore_name, ZERO_INTEGER);
                        }
                        sublisp_throw($sym100$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD, self);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_cyc_event_bb_ipc_agenda_base_suffix_counter(self, base_suffix_counter);
                                set_cyblack_cyc_event_bb_ipc_agenda_base_name(self, base_name);
                                set_cyblack_cyc_event_bb_ipc_agenda_semaphore(self, semaphore);
                                set_cyblack_cyc_event_bb_ipc_agenda_semaphore_name(self, semaphore_name);
                                cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym100$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD);
                }
                return catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method;
            }
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_ipc_agenda_clear_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = NIL;
            SubLObject semaphore = get_cyblack_cyc_event_bb_ipc_agenda_semaphore(self);
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            try {
                try {
                    while (NIL == cyblack_agenda.cyblack_basic_simple_agenda_empty_p_method(self)) {
                        semaphores.p_semaphore(semaphore);
                        {
                            SubLObject lock_1 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_1);
                                cyblack_agenda.cyblack_basic_simple_agenda_dequeue_method(self);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_1);
                                }
                            }
                        }
                    } 
                    sublisp_throw($sym105$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_ipc_agenda_semaphore(self, semaphore);
                            cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_ipc_agenda_propose_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = NIL;
            SubLObject semaphore = get_cyblack_cyc_event_bb_ipc_agenda_semaphore(self);
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        SubLObject lock_2 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_2);
                            result = cyblack_defapp.cyblack_defapp_agenda_base_propose_method(self, proposal);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_2);
                            }
                        }
                        semaphores.v_semaphore(semaphore);
                        sublisp_throw($sym108$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_ipc_agenda_semaphore(self, semaphore);
                            cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym108$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_ipc_agenda_retract_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = NIL;
            SubLObject semaphore = get_cyblack_cyc_event_bb_ipc_agenda_semaphore(self);
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        semaphores.p_semaphore(semaphore);
                        {
                            SubLObject lock_3 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_3);
                                result = cyblack_agenda.cyblack_basic_simple_agenda_retract_method(self, proposal);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_3);
                                }
                            }
                        }
                        sublisp_throw($sym112$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_ipc_agenda_semaphore(self, semaphore);
                            cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym112$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_ipc_agenda_execute_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = NIL;
            SubLObject semaphore = get_cyblack_cyc_event_bb_ipc_agenda_semaphore(self);
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        semaphores.p_semaphore(semaphore);
                        {
                            SubLObject lock_4 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_4);
                                result = cyblack_defapp.cyblack_defapp_agenda_base_execute_method(self);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_4);
                                }
                            }
                        }
                        sublisp_throw($sym116$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_ipc_agenda_semaphore(self, semaphore);
                            cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym116$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_ipc_agenda_enqueue_serialized_event_method(SubLObject self, SubLObject serialized_event) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = NIL;
            SubLObject semaphore = get_cyblack_cyc_event_bb_ipc_agenda_semaphore(self);
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject lock_5 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_5);
                            cyblack_cyc_event_bb_agenda_enqueue_serialized_event_method(self, serialized_event);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_5);
                            }
                        }
                        semaphores.v_semaphore(semaphore);
                        sublisp_throw($sym119$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD, serialized_event);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_ipc_agenda_semaphore(self, semaphore);
                            cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym119$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_bb_ipc_agenda_dequeue_serialized_event_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = NIL;
            SubLObject semaphore = get_cyblack_cyc_event_bb_ipc_agenda_semaphore(self);
            SubLObject cyc_serialized_event_queue = get_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue(self);
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            try {
                try {
                    if (NIL != subloop_queues.basic_doubly_linked_queue_empty_p_method(cyc_serialized_event_queue)) {
                        sublisp_throw($sym122$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD, NIL);
                    }
                    semaphores.p_semaphore(semaphore);
                    {
                        SubLObject result = NIL;
                        SubLObject lock_6 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_6);
                            result = cyblack_cyc_event_bb_agenda_dequeue_serialized_event_method(self);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_6);
                            }
                        }
                        sublisp_throw($sym122$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_bb_ipc_agenda_semaphore(self, semaphore);
                            set_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue(self, cyc_serialized_event_queue);
                            cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym122$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_bb_ipc_agenda_method;
        }
    }

    public static final SubLObject declare_cyblack_cyc_event_bb_agenda_file() {
        declareFunction("set_cyblack_obtain_semaphore_from_event_broker_state", "SET-CYBLACK-OBTAIN-SEMAPHORE-FROM-EVENT-BROKER-STATE", 1, 0, false);
        declareFunction("get_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue", "GET-CYBLACK-CYC-EVENT-BB-AGENDA-CYC-SERIALIZED-EVENT-QUEUE", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_bb_agenda_cyc_serialized_event_queue", "SET-CYBLACK-CYC-EVENT-BB-AGENDA-CYC-SERIALIZED-EVENT-QUEUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_bb_agenda_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-AGENDA-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_bb_agenda_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-AGENDA-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_agenda_p", "CYBLACK-CYC-EVENT-BB-AGENDA-P", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_agenda_initialize_method", "CYBLACK-CYC-EVENT-BB-AGENDA-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_agenda_enqueue_serialized_event_method", "CYBLACK-CYC-EVENT-BB-AGENDA-ENQUEUE-SERIALIZED-EVENT-METHOD", 2, 0, false);
        declareFunction("cyblack_cyc_event_bb_agenda_dequeue_serialized_event_method", "CYBLACK-CYC-EVENT-BB-AGENDA-DEQUEUE-SERIALIZED-EVENT-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_agenda_dequeue_event_method", "CYBLACK-CYC-EVENT-BB-AGENDA-DEQUEUE-EVENT-METHOD", 1, 0, false);
        declareFunction("get_cyblack_cyc_event_bb_lazy_agenda_current_sleep_interval", "GET-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-CURRENT-SLEEP-INTERVAL", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_bb_lazy_agenda_current_sleep_interval", "SET-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-CURRENT-SLEEP-INTERVAL", 2, 0, false);
        declareFunction("get_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration", "GET-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-MAXIMUM-ACCELERATION", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_bb_lazy_agenda_maximum_acceleration", "SET-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-MAXIMUM-ACCELERATION", 2, 0, false);
        declareFunction("get_cyblack_cyc_event_bb_lazy_agenda_average_sleep_interval", "GET-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-AVERAGE-SLEEP-INTERVAL", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_bb_lazy_agenda_average_sleep_interval", "SET-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-AVERAGE-SLEEP-INTERVAL", 2, 0, false);
        declareFunction("get_cyblack_cyc_event_bb_lazy_agenda_last_cycle_timestamp", "GET-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-LAST-CYCLE-TIMESTAMP", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_bb_lazy_agenda_last_cycle_timestamp", "SET-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-LAST-CYCLE-TIMESTAMP", 2, 0, false);
        declareFunction("get_cyblack_cyc_event_bb_lazy_agenda_cycle_count", "GET-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-CYCLE-COUNT", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_bb_lazy_agenda_cycle_count", "SET-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-CYCLE-COUNT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_bb_lazy_agenda_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_bb_lazy_agenda_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_lazy_agenda_p", "CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-P", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_lazy_agenda_initialize_method", "CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_lazy_agenda_adjust_sleep_interval_method", "CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-ADJUST-SLEEP-INTERVAL-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_lazy_agenda_slow_down_method", "CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-SLOW-DOWN-METHOD", 2, 0, false);
        declareFunction("cyblack_cyc_event_bb_lazy_agenda_propose_method", "CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-PROPOSE-METHOD", 2, 0, false);
        declareFunction("cyblack_cyc_event_bb_lazy_agenda_enqueue_serialized_event_method", "CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-ENQUEUE-SERIALIZED-EVENT-METHOD", 2, 0, false);
        declareFunction("cyblack_cyc_event_bb_lazy_agenda_get_maximum_acceleration_method", "CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-GET-MAXIMUM-ACCELERATION-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_lazy_agenda_set_maximum_acceleration_method", "CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-SET-MAXIMUM-ACCELERATION-METHOD", 2, 0, false);
        declareFunction("cyblack_cyc_event_bb_lazy_agenda_get_current_sleep_interval_method", "CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-GET-CURRENT-SLEEP-INTERVAL-METHOD", 1, 0, false);
        declareFunction("get_cyblack_cyc_event_bb_ipc_agenda_semaphore", "GET-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-SEMAPHORE", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_bb_ipc_agenda_semaphore", "SET-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-SEMAPHORE", 2, 0, false);
        declareFunction("get_cyblack_cyc_event_bb_ipc_agenda_semaphore_name", "GET-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-SEMAPHORE-NAME", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_bb_ipc_agenda_semaphore_name", "SET-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-SEMAPHORE-NAME", 2, 0, false);
        declareFunction("get_cyblack_cyc_event_bb_ipc_agenda_base_suffix_counter", "GET-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-BASE-SUFFIX-COUNTER", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_bb_ipc_agenda_base_suffix_counter", "SET-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-BASE-SUFFIX-COUNTER", 2, 0, false);
        declareFunction("get_cyblack_cyc_event_bb_ipc_agenda_base_name", "GET-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-BASE-NAME", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_bb_ipc_agenda_base_name", "SET-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-BASE-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_bb_ipc_agenda_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_bb_ipc_agenda_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_ipc_agenda_p", "CYBLACK-CYC-EVENT-BB-IPC-AGENDA-P", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_ipc_agenda_initialize_method", "CYBLACK-CYC-EVENT-BB-IPC-AGENDA-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_ipc_agenda_clear_method", "CYBLACK-CYC-EVENT-BB-IPC-AGENDA-CLEAR-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_ipc_agenda_propose_method", "CYBLACK-CYC-EVENT-BB-IPC-AGENDA-PROPOSE-METHOD", 2, 0, false);
        declareFunction("cyblack_cyc_event_bb_ipc_agenda_retract_method", "CYBLACK-CYC-EVENT-BB-IPC-AGENDA-RETRACT-METHOD", 2, 0, false);
        declareFunction("cyblack_cyc_event_bb_ipc_agenda_execute_method", "CYBLACK-CYC-EVENT-BB-IPC-AGENDA-EXECUTE-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_bb_ipc_agenda_enqueue_serialized_event_method", "CYBLACK-CYC-EVENT-BB-IPC-AGENDA-ENQUEUE-SERIALIZED-EVENT-METHOD", 2, 0, false);
        declareFunction("cyblack_cyc_event_bb_ipc_agenda_dequeue_serialized_event_method", "CYBLACK-CYC-EVENT-BB-IPC-AGENDA-DEQUEUE-SERIALIZED-EVENT-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_cyc_event_bb_agenda_file() {
        defvar("*CYBLACK-CYC-EVENT-BLACKBOARD-APPLICATION*", NIL);
        defvar("*CYBLACK-CYC-EVENT-BB-AGENDA*", NIL);
        defvar("*CYBLACK-CYC-EVENT-BB-OBTAIN-SEMAPHORE-FROM-EVENT-BROKER*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cyblack_cyc_event_bb_agenda_file() {
                classes.subloop_new_class(CYBLACK_CYC_EVENT_BB_AGENDA, CYBLACK_DEFAPP_AGENDA_BASE, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_EVENT_BB_AGENDA, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_EVENT_BB_AGENDA, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_AGENDA_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_EVENT_BB_AGENDA, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_AGENDA_INSTANCE);
        subloop_reserved_initialize_cyblack_cyc_event_bb_agenda_class(CYBLACK_CYC_EVENT_BB_AGENDA);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CYC_EVENT_BB_AGENDA, $list_alt28, NIL, $list_alt29);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_AGENDA, INITIALIZE, CYBLACK_CYC_EVENT_BB_AGENDA_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE_SERIALIZED_EVENT, CYBLACK_CYC_EVENT_BB_AGENDA, $list_alt34, $list_alt35, $list_alt36);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_AGENDA, ENQUEUE_SERIALIZED_EVENT, CYBLACK_CYC_EVENT_BB_AGENDA_ENQUEUE_SERIALIZED_EVENT_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE_SERIALIZED_EVENT, CYBLACK_CYC_EVENT_BB_AGENDA, $list_alt28, NIL, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_AGENDA, DEQUEUE_SERIALIZED_EVENT, CYBLACK_CYC_EVENT_BB_AGENDA_DEQUEUE_SERIALIZED_EVENT_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE_EVENT, CYBLACK_CYC_EVENT_BB_AGENDA, $list_alt28, NIL, $list_alt44);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_AGENDA, DEQUEUE_EVENT, CYBLACK_CYC_EVENT_BB_AGENDA_DEQUEUE_EVENT_METHOD);
        classes.subloop_new_class(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, CYBLACK_CYC_EVENT_BB_AGENDA, NIL, NIL, $list_alt48);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, $sym54$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_CLAS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, $sym55$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_INST);
        subloop_reserved_initialize_cyblack_cyc_event_bb_lazy_agenda_class(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, $list_alt28, NIL, $list_alt56);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, INITIALIZE, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ADJUST_SLEEP_INTERVAL, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, $list_alt28, NIL, $list_alt62);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, ADJUST_SLEEP_INTERVAL, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_ADJUST_SLEEP_INTERVAL_METHOD);
        methods.methods_incorporate_instance_method(SLOW_DOWN, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, $list_alt34, $list_alt66, $list_alt67);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, SLOW_DOWN, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_SLOW_DOWN_METHOD);
        methods.methods_incorporate_instance_method(PROPOSE, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, $list_alt73, $list_alt74, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, PROPOSE, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_PROPOSE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE_SERIALIZED_EVENT, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, $list_alt34, $list_alt35, $list_alt77);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, ENQUEUE_SERIALIZED_EVENT, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_ENQUEUE_SERIALIZED_EVENT_METHOD);
        methods.methods_incorporate_instance_method(GET_MAXIMUM_ACCELERATION, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, $list_alt73, NIL, $list_alt80);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, GET_MAXIMUM_ACCELERATION, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_GET_MAXIMUM_ACCELERATION_METHOD);
        methods.methods_incorporate_instance_method(SET_MAXIMUM_ACCELERATION, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, $list_alt34, $list_alt83, $list_alt84);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, SET_MAXIMUM_ACCELERATION, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_SET_MAXIMUM_ACCELERATION_METHOD);
        methods.methods_incorporate_instance_method(GET_CURRENT_SLEEP_INTERVAL, CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, $list_alt73, NIL, $list_alt88);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_LAZY_AGENDA, GET_CURRENT_SLEEP_INTERVAL, $sym89$CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_GET_CURRENT_SLEEP_INTERVAL_METHO);
        classes.subloop_new_class(CYBLACK_CYC_EVENT_BB_IPC_AGENDA, CYBLACK_CYC_EVENT_BB_AGENDA, NIL, NIL, $list_alt91);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_EVENT_BB_IPC_AGENDA, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_EVENT_BB_IPC_AGENDA, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_EVENT_BB_IPC_AGENDA, $sym98$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_INSTA);
        subloop_reserved_initialize_cyblack_cyc_event_bb_ipc_agenda_class(CYBLACK_CYC_EVENT_BB_IPC_AGENDA);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CYC_EVENT_BB_IPC_AGENDA, $list_alt28, NIL, $list_alt99);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_IPC_AGENDA, INITIALIZE, CYBLACK_CYC_EVENT_BB_IPC_AGENDA_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, CYBLACK_CYC_EVENT_BB_IPC_AGENDA, $list_alt34, NIL, $list_alt104);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_IPC_AGENDA, CLEAR, CYBLACK_CYC_EVENT_BB_IPC_AGENDA_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(PROPOSE, CYBLACK_CYC_EVENT_BB_IPC_AGENDA, $list_alt34, $list_alt74, $list_alt107);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_IPC_AGENDA, PROPOSE, CYBLACK_CYC_EVENT_BB_IPC_AGENDA_PROPOSE_METHOD);
        methods.methods_incorporate_instance_method(RETRACT, CYBLACK_CYC_EVENT_BB_IPC_AGENDA, $list_alt34, $list_alt74, $list_alt111);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_IPC_AGENDA, RETRACT, CYBLACK_CYC_EVENT_BB_IPC_AGENDA_RETRACT_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_CYC_EVENT_BB_IPC_AGENDA, $list_alt34, NIL, $list_alt115);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_IPC_AGENDA, EXECUTE, CYBLACK_CYC_EVENT_BB_IPC_AGENDA_EXECUTE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE_SERIALIZED_EVENT, CYBLACK_CYC_EVENT_BB_IPC_AGENDA, $list_alt34, $list_alt35, $list_alt118);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_IPC_AGENDA, ENQUEUE_SERIALIZED_EVENT, CYBLACK_CYC_EVENT_BB_IPC_AGENDA_ENQUEUE_SERIALIZED_EVENT_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE_SERIALIZED_EVENT, CYBLACK_CYC_EVENT_BB_IPC_AGENDA, $list_alt28, NIL, $list_alt121);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_BB_IPC_AGENDA, DEQUEUE_SERIALIZED_EVENT, CYBLACK_CYC_EVENT_BB_IPC_AGENDA_DEQUEUE_SERIALIZED_EVENT_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_AGENDA = makeSymbol("CYBLACK-CYC-EVENT-BB-AGENDA");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE");

    static private final SubLList $list_alt2 = list(list(makeSymbol("CYC-SERIALIZED-EVENT-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-SERIALIZED-EVENT"), list(makeSymbol("SERIALIZED-EVENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-SERIALIZED-EVENT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-EVENT"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol CYC_SERIALIZED_EVENT_QUEUE = makeSymbol("CYC-SERIALIZED-EVENT-QUEUE");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_AGENDA_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-AGENDA-CLASS");



    private static final SubLSymbol AGENDA_TRACE_ON = makeSymbol("AGENDA-TRACE-ON");

















    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA");



    private static final SubLSymbol QUEUE_PRIORITIZER = makeSymbol("QUEUE-PRIORITIZER");









    private static final SubLSymbol FUTILE_CYCLE_COUNT = makeSymbol("FUTILE-CYCLE-COUNT");

    private static final SubLSymbol MAX_FUTILE_CYCLES = makeSymbol("MAX-FUTILE-CYCLES");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_AGENDA_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-AGENDA-INSTANCE");



    static private final SubLList $list_alt28 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CYC-SERIALIZED-EVENT-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-CYC-EVENT-BB-AGENDA*"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym30$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-AGENDA-METHOD");



    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_AGENDA_INITIALIZE_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-AGENDA-INITIALIZE-METHOD");



    static private final SubLList $list_alt34 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt35 = list(makeSymbol("SERIALIZED-EVENT"));

    static private final SubLList $list_alt36 = list(list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("CYC-SERIALIZED-EVENT-QUEUE"), makeSymbol("SERIALIZED-EVENT")), list(RET, makeSymbol("SERIALIZED-EVENT")));

    static private final SubLSymbol $sym37$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_AGENDA_ENQUEUE_SERIALIZED_EVENT_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-AGENDA-ENQUEUE-SERIALIZED-EVENT-METHOD");

    private static final SubLSymbol DEQUEUE_SERIALIZED_EVENT = makeSymbol("DEQUEUE-SERIALIZED-EVENT");

    static private final SubLList $list_alt40 = list(list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("CYC-SERIALIZED-EVENT-QUEUE")), list(RET, NIL)), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("CYC-SERIALIZED-EVENT-QUEUE"))));

    static private final SubLSymbol $sym41$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_AGENDA_DEQUEUE_SERIALIZED_EVENT_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-AGENDA-DEQUEUE-SERIALIZED-EVENT-METHOD");

    private static final SubLSymbol DEQUEUE_EVENT = makeSymbol("DEQUEUE-EVENT");

    static private final SubLList $list_alt44 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SERIALIZED-EVENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("DEQUEUE-SERIALIZED-EVENT"))))), list(makeSymbol("PUNLESS"), makeSymbol("SERIALIZED-EVENT"), list(RET, NIL)), list(makeSymbol("CDESTRUCTURING-BIND"), cons(makeSymbol("CYBLACK-TYPE-STRING"), makeSymbol("VALUE-PLIST")), makeSymbol("SERIALIZED-EVENT"), list(makeSymbol("CLET"), list(list(makeSymbol("BB-APP"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("BB-APP"), makeString("(DEQUEUE-EVENT ~S): No application is associated with this agenda."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeSymbol("BB-APP")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("DATATYPE-DICTIONARY"), makeString("(DEQUEUE-EVENT ~S): No datatype dictionary is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("BB-APP")), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeSymbol("DATATYPE-DICTIONARY"), makeSymbol("CYBLACK-TYPE-STRING"))), list(makeSymbol("POSTING"), list(makeSymbol("CYBLACK-DATATYPE-CREATE-POSTING"), makeSymbol("DATATYPE")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ASSIMILATE"), makeSymbol("CYBLACK-BASIC-POSTING")), makeSymbol("POSTING"), makeSymbol("VALUE-PLIST")), list(RET, makeSymbol("POSTING"))))))));

    static private final SubLList $list_alt45 = cons(makeSymbol("CYBLACK-TYPE-STRING"), makeSymbol("VALUE-PLIST"));

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_AGENDA_DEQUEUE_EVENT_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-AGENDA-DEQUEUE-EVENT-METHOD");



    static private final SubLList $list_alt48 = list(new SubLObject[]{ list(makeSymbol("CYCLE-COUNT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-CYCLE-TIMESTAMP"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AVERAGE-SLEEP-INTERVAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MAXIMUM-ACCELERATION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CURRENT-SLEEP-INTERVAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADJUST-SLEEP-INTERVAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SLOW-DOWN"), list(makeSymbol("MAX")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPOSE"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-SERIALIZED-EVENT"), list(makeSymbol("SERIALIZED-EVENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MAXIMUM-ACCELERATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MAXIMUM-ACCELERATION"), list(makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CURRENT-SLEEP-INTERVAL"), NIL, makeKeyword("PUBLIC")) });









    private static final SubLSymbol CYCLE_COUNT = makeSymbol("CYCLE-COUNT");

    static private final SubLSymbol $sym54$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_CLAS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-CLASS");

    static private final SubLSymbol $sym55$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_INST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-INSTANCE");

    static private final SubLList $list_alt56 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CYCLE-COUNT"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("LAST-CYCLE-TIMESTAMP"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("AVERAGE-SLEEP-INTERVAL"), makeDouble(5.0)), list(makeSymbol("CSETQ"), makeSymbol("MAXIMUM-ACCELERATION"), makeDouble(0.1)), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SLEEP-INTERVAL"), makeDouble(5.0)), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym57$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-METHOD");

    public static final SubLFloat $float$5_0 = makeDouble(5.0);

    public static final SubLFloat $float$0_1 = makeDouble(0.1);

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_INITIALIZE_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-INITIALIZE-METHOD");

    private static final SubLSymbol ADJUST_SLEEP_INTERVAL = makeSymbol("ADJUST-SLEEP-INTERVAL");

    static private final SubLList $list_alt62 = list(list(makeSymbol("PIF"), list(makeSymbol("ZEROP"), makeSymbol("LAST-CYCLE-TIMESTAMP")), list(makeSymbol("CSETQ"), makeSymbol("LAST-CYCLE-TIMESTAMP"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(makeSymbol("CLET"), list(list(makeSymbol("PREVIOUS-CYCLE-TIMESTAMP"), makeSymbol("LAST-CYCLE-TIMESTAMP")), list(makeSymbol("CURRENT-DELTA"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("LAST-CYCLE-TIMESTAMP"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-DELTA"), list(makeSymbol("-"), makeSymbol("LAST-CYCLE-TIMESTAMP"), makeSymbol("PREVIOUS-CYCLE-TIMESTAMP"))), list(makeSymbol("CINC"), makeSymbol("CYCLE-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("AVERAGE-SLEEP-INTERVAL"), list(makeSymbol("/"), list(makeSymbol("+"), makeSymbol("AVERAGE-SLEEP-INTERVAL"), makeSymbol("CURRENT-DELTA")), makeSymbol("CYCLE-COUNT"))), list(makeSymbol("PCOND"), list(list(makeSymbol("<="), list(makeSymbol("-"), makeSymbol("CURRENT-DELTA"), makeDouble(0.1)), makeSymbol("AVERAGE-SLEEP-INTERVAL")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SLEEP-INTERVAL"), list(makeSymbol("-"), makeSymbol("AVERAGE-SLEEP-INTERVAL"), list(makeSymbol("*"), makeSymbol("AVERAGE-SLEEP-INTERVAL"), makeSymbol("MAXIMUM-ACCELERATION"))))), list(list(makeSymbol(">="), list(makeSymbol("+"), makeSymbol("CURRENT-DELTA"), makeDouble(0.1)), makeSymbol("AVERAGE-SLEEP-INTERVAL")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SLEEP-INTERVAL"), list(makeSymbol("+"), makeSymbol("AVERAGE-SLEEP-INTERVAL"), list(makeSymbol("*"), makeSymbol("AVERAGE-SLEEP-INTERVAL"), makeSymbol("MAXIMUM-ACCELERATION")))))))), list(RET, makeSymbol("CURRENT-SLEEP-INTERVAL")));

    static private final SubLSymbol $sym63$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_ADJUST_SLEEP_INTERVAL_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-ADJUST-SLEEP-INTERVAL-METHOD");

    private static final SubLSymbol SLOW_DOWN = makeSymbol("SLOW-DOWN");

    static private final SubLList $list_alt66 = list(makeSymbol("MAX"));

    static private final SubLList $list_alt67 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("NUMBERP"), makeSymbol("MAX")), list(makeSymbol(">"), makeSymbol("MAX"), ZERO_INTEGER)), makeString("(SLOW-DOWN ~S): ~S is not a positive number."), makeSymbol("SELF"), makeSymbol("MAX")), list(makeSymbol("PIF"), list(makeSymbol("<="), makeSymbol("CURRENT-SLEEP-INTERVAL"), makeDouble(0.0)), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SLEEP-INTERVAL"), makeDouble(0.1)), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SLEEP-INTERVAL"), list(makeSymbol("MIN"), list(makeSymbol("+"), makeSymbol("CURRENT-SLEEP-INTERVAL"), list(makeSymbol("*"), makeSymbol("CURRENT-SLEEP-INTERVAL"), makeSymbol("MAXIMUM-ACCELERATION"))), makeSymbol("MAX")))), list(RET, NIL));

    static private final SubLSymbol $sym68$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-METHOD");

    static private final SubLString $str_alt69$_SLOW_DOWN__S____S_is_not_a_posit = makeString("(SLOW-DOWN ~S): ~S is not a positive number.");

    public static final SubLFloat $float$0_0 = makeDouble(0.0);

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_SLOW_DOWN_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-SLOW-DOWN-METHOD");



    static private final SubLList $list_alt73 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt74 = list(makeSymbol("PROPOSAL"));

    static private final SubLList $list_alt75 = list(list(makeSymbol("ADJUST-SLEEP-INTERVAL"), makeSymbol("SELF")), list(RET, list(makeSymbol("PROPOSE"), makeSymbol("SUPER"), makeSymbol("PROPOSAL"))));

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_PROPOSE_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-PROPOSE-METHOD");

    static private final SubLList $list_alt77 = list(list(makeSymbol("ADJUST-SLEEP-INTERVAL"), makeSymbol("SELF")), list(RET, list(makeSymbol("ENQUEUE-SERIALIZED-EVENT"), makeSymbol("SUPER"), makeSymbol("SERIALIZED-EVENT"))));

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_ENQUEUE_SERIALIZED_EVENT_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-ENQUEUE-SERIALIZED-EVENT-METHOD");

    private static final SubLSymbol GET_MAXIMUM_ACCELERATION = makeSymbol("GET-MAXIMUM-ACCELERATION");

    static private final SubLList $list_alt80 = list(list(RET, makeSymbol("MAXIMUM-ACCELERATION")));

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_GET_MAXIMUM_ACCELERATION_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-GET-MAXIMUM-ACCELERATION-METHOD");

    private static final SubLSymbol SET_MAXIMUM_ACCELERATION = makeSymbol("SET-MAXIMUM-ACCELERATION");

    static private final SubLList $list_alt83 = list(makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt84 = list(list(makeSymbol("CSETQ"), makeSymbol("MAXIMUM-ACCELERATION"), makeSymbol("NEW-VALUE")), list(RET, makeSymbol("NEW-VALUE")));

    static private final SubLSymbol $sym85$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_SET_MAXIMUM_ACCELERATION_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-SET-MAXIMUM-ACCELERATION-METHOD");

    private static final SubLSymbol GET_CURRENT_SLEEP_INTERVAL = makeSymbol("GET-CURRENT-SLEEP-INTERVAL");

    static private final SubLList $list_alt88 = list(list(RET, makeSymbol("CURRENT-SLEEP-INTERVAL")));

    static private final SubLSymbol $sym89$CYBLACK_CYC_EVENT_BB_LAZY_AGENDA_GET_CURRENT_SLEEP_INTERVAL_METHO = makeSymbol("CYBLACK-CYC-EVENT-BB-LAZY-AGENDA-GET-CURRENT-SLEEP-INTERVAL-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_IPC_AGENDA = makeSymbol("CYBLACK-CYC-EVENT-BB-IPC-AGENDA");

    static private final SubLList $list_alt91 = list(new SubLObject[]{ list(makeSymbol("BASE-NAME"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeString("CYBLACK-BASIC-IPC-AGENDA")), list(makeSymbol("BASE-SUFFIX-COUNTER"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), ZERO_INTEGER), list(makeSymbol("SEMAPHORE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SEMAPHORE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPOSE"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRACT"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-SERIALIZED-EVENT"), list(makeSymbol("SERIALIZED-EVENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-SERIALIZED-EVENT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-EVENT"), NIL, makeKeyword("PROTECTED")) });









    static private final SubLString $str_alt96$CYBLACK_BASIC_IPC_AGENDA = makeString("CYBLACK-BASIC-IPC-AGENDA");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-CLASS");

    static private final SubLSymbol $sym98$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-INSTANCE");

    static private final SubLList $list_alt99 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("PUNLESS"), makeSymbol("BASE-NAME"), list(makeSymbol("CSETQ"), makeSymbol("BASE-NAME"), makeString("CYBLACK-BASIC-IPC-AGENDA"))), list(makeSymbol("PUNLESS"), makeSymbol("BASE-SUFFIX-COUNTER"), list(makeSymbol("CSETQ"), makeSymbol("BASE-SUFFIX-COUNTER"), ZERO_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("SEMAPHORE-NAME"), list(makeSymbol("FORMAT-TO-STRING"), makeKeyword("A"), makeSymbol("BASE-NAME"), makeKeyword("D"), makeSymbol("BASE-SUFFIX-COUNTER"))), list(makeSymbol("CINC"), makeSymbol("BASE-SUFFIX-COUNTER")), list(makeSymbol("CSETQ"), makeSymbol("LOCK"), list(makeSymbol("MAKE-LOCK"), list(makeSymbol("CCONCATENATE"), makeString("Lock for Queue "), makeSymbol("SEMAPHORE-NAME")))), list(makeSymbol("PIF"), makeSymbol("*CYBLACK-CYC-EVENT-BB-OBTAIN-SEMAPHORE-FROM-EVENT-BROKER*"), list(makeSymbol("CLET"), list(list(makeSymbol("EVENT-BROKER"), list(makeSymbol("CORE-EVENT-BROKER"))), list(makeSymbol("EVENT-BROKER-IPC-QUEUE"), list(makeSymbol("EVENT-BROKER-POSTINGS"), makeSymbol("EVENT-BROKER")))), list(makeSymbol("CSETQ"), makeSymbol("SEMAPHORE"), list(makeSymbol("IPC-QUEUE-SEMAPHORE"), makeSymbol("EVENT-BROKER-IPC-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("SEMAPHORE"), list(makeSymbol("NEW-SEMAPHORE"), makeSymbol("SEMAPHORE-NAME"), ZERO_INTEGER))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym100$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-METHOD");

    static private final SubLString $str_alt101$Lock_for_Queue_ = makeString("Lock for Queue ");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_IPC_AGENDA_INITIALIZE_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-IPC-AGENDA-INITIALIZE-METHOD");



    static private final SubLList $list_alt104 = list(list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF"))), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("DEQUEUE"), makeSymbol("SELF")))), list(RET, NIL));

    static private final SubLSymbol $sym105$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_IPC_AGENDA_CLEAR_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-IPC-AGENDA-CLEAR-METHOD");

    static private final SubLList $list_alt107 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("PROPOSE"), makeSymbol("SUPER"), makeSymbol("PROPOSAL")))), list(makeSymbol("V-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym108$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_IPC_AGENDA_PROPOSE_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-IPC-AGENDA-PROPOSE-METHOD");



    static private final SubLList $list_alt111 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("RETRACT"), makeSymbol("SUPER"), makeSymbol("PROPOSAL")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym112$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_IPC_AGENDA_RETRACT_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-IPC-AGENDA-RETRACT-METHOD");



    static private final SubLList $list_alt115 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("EXECUTE"), makeSymbol("SUPER")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym116$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_IPC_AGENDA_EXECUTE_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-IPC-AGENDA-EXECUTE-METHOD");

    static private final SubLList $list_alt118 = list(list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("ENQUEUE-SERIALIZED-EVENT"), makeSymbol("SUPER"), makeSymbol("SERIALIZED-EVENT"))), list(makeSymbol("V-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(RET, makeSymbol("SERIALIZED-EVENT")));

    static private final SubLSymbol $sym119$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_IPC_AGENDA_ENQUEUE_SERIALIZED_EVENT_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-IPC-AGENDA-ENQUEUE-SERIALIZED-EVENT-METHOD");

    static private final SubLList $list_alt121 = list(list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("CYC-SERIALIZED-EVENT-QUEUE")), list(RET, NIL)), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("DEQUEUE-SERIALIZED-EVENT"), makeSymbol("SUPER")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym122$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_BB_IPC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-BB-IPC-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BB_IPC_AGENDA_DEQUEUE_SERIALIZED_EVENT_METHOD = makeSymbol("CYBLACK-CYC-EVENT-BB-IPC-AGENDA-DEQUEUE-SERIALIZED-EVENT-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_cyc_event_bb_agenda_file();
    }

    public void initializeVariables() {
        init_cyblack_cyc_event_bb_agenda_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_cyc_event_bb_agenda_file();
    }
}

