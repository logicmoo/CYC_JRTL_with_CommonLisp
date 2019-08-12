/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.subloop_queues;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 *  module:      CYBLACK-UI-MONITOR
 *  source file: /cyc/top/cycl/cyblack/cyblack-ui-monitor.lisp
 *  created:     2019/07/03 17:38:49
 */
public final class cyblack_ui_monitor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_ui_monitor() {
    }

    public static final SubLFile me = new cyblack_ui_monitor();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_ui_monitor";

    // // Definitions
    // defparameter
    private static final SubLSymbol $cyblack_internal_ui_monitor_default_incoming_sleep_interval$ = makeSymbol("*CYBLACK-INTERNAL-UI-MONITOR-DEFAULT-INCOMING-SLEEP-INTERVAL*");

    // defparameter
    private static final SubLSymbol $cyblack_internal_ui_monitor_default_outgoing_sleep_interval$ = makeSymbol("*CYBLACK-INTERNAL-UI-MONITOR-DEFAULT-OUTGOING-SLEEP-INTERVAL*");

    // defparameter
    private static final SubLSymbol $cyblack_internal_ui_monitor_default_blackboard_connection_sleep_interval$ = makeSymbol("*CYBLACK-INTERNAL-UI-MONITOR-DEFAULT-BLACKBOARD-CONNECTION-SLEEP-INTERVAL*");

    public static final SubLObject get_cyblack_internal_ui_monitor_blackboard_connection_sleep_interval(SubLObject cyblack_internal_ui_monitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_ui_monitor, FOURTEEN_INTEGER, BLACKBOARD_CONNECTION_SLEEP_INTERVAL);
    }

    public static final SubLObject set_cyblack_internal_ui_monitor_blackboard_connection_sleep_interval(SubLObject cyblack_internal_ui_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_ui_monitor, value, FOURTEEN_INTEGER, BLACKBOARD_CONNECTION_SLEEP_INTERVAL);
    }

    public static final SubLObject get_cyblack_internal_ui_monitor_outgoing_sleep_interval(SubLObject cyblack_internal_ui_monitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_ui_monitor, THIRTEEN_INTEGER, OUTGOING_SLEEP_INTERVAL);
    }

    public static final SubLObject set_cyblack_internal_ui_monitor_outgoing_sleep_interval(SubLObject cyblack_internal_ui_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_ui_monitor, value, THIRTEEN_INTEGER, OUTGOING_SLEEP_INTERVAL);
    }

    public static final SubLObject get_cyblack_internal_ui_monitor_incoming_sleep_interval(SubLObject cyblack_internal_ui_monitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_ui_monitor, TWELVE_INTEGER, INCOMING_SLEEP_INTERVAL);
    }

    public static final SubLObject set_cyblack_internal_ui_monitor_incoming_sleep_interval(SubLObject cyblack_internal_ui_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_ui_monitor, value, TWELVE_INTEGER, INCOMING_SLEEP_INTERVAL);
    }

    public static final SubLObject get_cyblack_internal_ui_monitor_spawn_connection_function(SubLObject cyblack_internal_ui_monitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_ui_monitor, ELEVEN_INTEGER, SPAWN_CONNECTION_FUNCTION);
    }

    public static final SubLObject set_cyblack_internal_ui_monitor_spawn_connection_function(SubLObject cyblack_internal_ui_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_ui_monitor, value, ELEVEN_INTEGER, SPAWN_CONNECTION_FUNCTION);
    }

    public static final SubLObject get_cyblack_internal_ui_monitor_outgoing_posting_queue(SubLObject cyblack_internal_ui_monitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_ui_monitor, TEN_INTEGER, OUTGOING_POSTING_QUEUE);
    }

    public static final SubLObject set_cyblack_internal_ui_monitor_outgoing_posting_queue(SubLObject cyblack_internal_ui_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_ui_monitor, value, TEN_INTEGER, OUTGOING_POSTING_QUEUE);
    }

    public static final SubLObject get_cyblack_internal_ui_monitor_incoming_posting_queue(SubLObject cyblack_internal_ui_monitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_ui_monitor, NINE_INTEGER, INCOMING_POSTING_QUEUE);
    }

    public static final SubLObject set_cyblack_internal_ui_monitor_incoming_posting_queue(SubLObject cyblack_internal_ui_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_ui_monitor, value, NINE_INTEGER, INCOMING_POSTING_QUEUE);
    }

    public static final SubLObject get_cyblack_internal_ui_monitor_outgoing_raw_queue(SubLObject cyblack_internal_ui_monitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_ui_monitor, EIGHT_INTEGER, OUTGOING_RAW_QUEUE);
    }

    public static final SubLObject set_cyblack_internal_ui_monitor_outgoing_raw_queue(SubLObject cyblack_internal_ui_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_ui_monitor, value, EIGHT_INTEGER, OUTGOING_RAW_QUEUE);
    }

    public static final SubLObject get_cyblack_internal_ui_monitor_incoming_raw_queue(SubLObject cyblack_internal_ui_monitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_ui_monitor, SEVEN_INTEGER, INCOMING_RAW_QUEUE);
    }

    public static final SubLObject set_cyblack_internal_ui_monitor_incoming_raw_queue(SubLObject cyblack_internal_ui_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_ui_monitor, value, SEVEN_INTEGER, INCOMING_RAW_QUEUE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_ui_monitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_ui_monitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_MONITOR, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_MONITOR, PANEL_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_MONITOR, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, INCOMING_RAW_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, OUTGOING_RAW_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, INCOMING_POSTING_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, OUTGOING_POSTING_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, SPAWN_CONNECTION_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, INCOMING_SLEEP_INTERVAL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, OUTGOING_SLEEP_INTERVAL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_UI_MONITOR, BLACKBOARD_CONNECTION_SLEEP_INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_internal_ui_monitor_p(SubLObject cyblack_internal_ui_monitor) {
        return classes.subloop_instanceof_class(cyblack_internal_ui_monitor, CYBLACK_INTERNAL_UI_MONITOR);
    }

    public static final SubLObject cyblack_internal_ui_monitor_initialize_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
                SubLObject blackboard_connection_sleep_interval = get_cyblack_internal_ui_monitor_blackboard_connection_sleep_interval(self);
                SubLObject outgoing_sleep_interval = get_cyblack_internal_ui_monitor_outgoing_sleep_interval(self);
                SubLObject incoming_sleep_interval = get_cyblack_internal_ui_monitor_incoming_sleep_interval(self);
                SubLObject spawn_connection_function = get_cyblack_internal_ui_monitor_spawn_connection_function(self);
                SubLObject outgoing_posting_queue = get_cyblack_internal_ui_monitor_outgoing_posting_queue(self);
                SubLObject incoming_posting_queue = get_cyblack_internal_ui_monitor_incoming_posting_queue(self);
                SubLObject outgoing_raw_queue = get_cyblack_internal_ui_monitor_outgoing_raw_queue(self);
                SubLObject incoming_raw_queue = get_cyblack_internal_ui_monitor_incoming_raw_queue(self);
                try {
                    try {
                        cyblack_monitor.cyblack_basic_monitor_initialize_method(self);
                        incoming_raw_queue = object.new_object_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
                        outgoing_raw_queue = object.new_object_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
                        incoming_posting_queue = object.new_object_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
                        outgoing_posting_queue = object.new_object_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
                        spawn_connection_function = NIL;
                        incoming_sleep_interval = $cyblack_internal_ui_monitor_default_incoming_sleep_interval$.getDynamicValue(thread);
                        outgoing_sleep_interval = $cyblack_internal_ui_monitor_default_outgoing_sleep_interval$.getDynamicValue(thread);
                        blackboard_connection_sleep_interval = $cyblack_internal_ui_monitor_default_blackboard_connection_sleep_interval$.getDynamicValue(thread);
                        sublisp_throw($sym32$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, self);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_internal_ui_monitor_blackboard_connection_sleep_interval(self, blackboard_connection_sleep_interval);
                                set_cyblack_internal_ui_monitor_outgoing_sleep_interval(self, outgoing_sleep_interval);
                                set_cyblack_internal_ui_monitor_incoming_sleep_interval(self, incoming_sleep_interval);
                                set_cyblack_internal_ui_monitor_spawn_connection_function(self, spawn_connection_function);
                                set_cyblack_internal_ui_monitor_outgoing_posting_queue(self, outgoing_posting_queue);
                                set_cyblack_internal_ui_monitor_incoming_posting_queue(self, incoming_posting_queue);
                                set_cyblack_internal_ui_monitor_outgoing_raw_queue(self, outgoing_raw_queue);
                                set_cyblack_internal_ui_monitor_incoming_raw_queue(self, incoming_raw_queue);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym32$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
                }
                return catch_var_for_cyblack_internal_ui_monitor_method;
            }
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_get_spawn_connection_function_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject spawn_connection_function = get_cyblack_internal_ui_monitor_spawn_connection_function(self);
            try {
                try {
                    sublisp_throw($sym38$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, spawn_connection_function);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_spawn_connection_function(self, spawn_connection_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym38$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_set_spawn_connection_function_method(SubLObject self, SubLObject function) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject spawn_connection_function = get_cyblack_internal_ui_monitor_spawn_connection_function(self);
            try {
                try {
                    if (NIL == symbol_function(function)) {
                        Errors.warn($str_alt44$_SET_SPAWN_CONNECTION_FUNCTION__S, self, function);
                    }
                    spawn_connection_function = function;
                    sublisp_throw($sym43$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, function);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_spawn_connection_function(self, spawn_connection_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_spawn_connection_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject spawn_connection_function = get_cyblack_internal_ui_monitor_spawn_connection_function(self);
            try {
                try {
                    if ((NIL != spawn_connection_function) && (NIL != symbol_function(spawn_connection_function))) {
                        sublisp_throw($sym48$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, funcall(spawn_connection_function));
                    } else {
                        Errors.warn($str_alt49$_SPAWN_CONNECTION__S___Could_not_, self, spawn_connection_function);
                        sublisp_throw($sym48$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_spawn_connection_function(self, spawn_connection_function);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_incoming_raw_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject incoming_raw_queue = get_cyblack_internal_ui_monitor_incoming_raw_queue(self);
            try {
                try {
                    sublisp_throw($sym53$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, makeBoolean(NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(incoming_raw_queue)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_incoming_raw_queue(self, incoming_raw_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym53$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_outgoing_raw_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject outgoing_raw_queue = get_cyblack_internal_ui_monitor_outgoing_raw_queue(self);
            try {
                try {
                    sublisp_throw($sym57$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, makeBoolean(NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(outgoing_raw_queue)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_outgoing_raw_queue(self, outgoing_raw_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_incoming_posting_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject incoming_posting_queue = get_cyblack_internal_ui_monitor_incoming_posting_queue(self);
            try {
                try {
                    sublisp_throw($sym61$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, makeBoolean(NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(incoming_posting_queue)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_incoming_posting_queue(self, incoming_posting_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym61$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_outgoing_posting_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject outgoing_posting_queue = get_cyblack_internal_ui_monitor_outgoing_posting_queue(self);
            try {
                try {
                    sublisp_throw($sym65$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, makeBoolean(NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(outgoing_posting_queue)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_outgoing_posting_queue(self, outgoing_posting_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym65$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_add_incoming_raw_method(SubLObject self, SubLObject v_object) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject incoming_raw_queue = get_cyblack_internal_ui_monitor_incoming_raw_queue(self);
            try {
                try {
                    subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method(incoming_raw_queue, v_object);
                    sublisp_throw($sym70$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, v_object);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_incoming_raw_queue(self, incoming_raw_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym70$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_add_outgoing_raw_method(SubLObject self, SubLObject v_object) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject outgoing_raw_queue = get_cyblack_internal_ui_monitor_outgoing_raw_queue(self);
            try {
                try {
                    subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method(outgoing_raw_queue, v_object);
                    sublisp_throw($sym74$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, v_object);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_outgoing_raw_queue(self, outgoing_raw_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_add_incoming_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject incoming_posting_queue = get_cyblack_internal_ui_monitor_incoming_posting_queue(self);
            try {
                try {
                    if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                        Errors.warn($str_alt80$_ADD_INCOMING_POSTING__S____S_is_, self, posting);
                        sublisp_throw($sym79$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, NIL);
                    }
                    subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method(incoming_posting_queue, posting);
                    sublisp_throw($sym79$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_incoming_posting_queue(self, incoming_posting_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym79$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_add_outgoing_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject outgoing_posting_queue = get_cyblack_internal_ui_monitor_outgoing_posting_queue(self);
            try {
                try {
                    if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                        Errors.warn($str_alt85$_ADD_OUTGOING_POSTING__S____S_is_, self, posting);
                        sublisp_throw($sym84$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, NIL);
                    }
                    subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method(outgoing_posting_queue, posting);
                    sublisp_throw($sym84$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_outgoing_posting_queue(self, outgoing_posting_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym84$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_get_incoming_raw_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject incoming_raw_queue = get_cyblack_internal_ui_monitor_incoming_raw_queue(self);
            try {
                try {
                    if (NIL != cyblack_internal_ui_monitor_incoming_raw_p_method(self)) {
                        sublisp_throw($sym89$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(incoming_raw_queue));
                    }
                    sublisp_throw($sym89$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_incoming_raw_queue(self, incoming_raw_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym89$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_get_outgoing_raw_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject outgoing_raw_queue = get_cyblack_internal_ui_monitor_outgoing_raw_queue(self);
            try {
                try {
                    if (NIL != cyblack_internal_ui_monitor_outgoing_raw_p_method(self)) {
                        sublisp_throw($sym93$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(outgoing_raw_queue));
                    }
                    sublisp_throw($sym93$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_outgoing_raw_queue(self, outgoing_raw_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym93$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_get_incoming_posting_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject incoming_posting_queue = get_cyblack_internal_ui_monitor_incoming_posting_queue(self);
            try {
                try {
                    if (NIL != cyblack_internal_ui_monitor_incoming_posting_p_method(self)) {
                        sublisp_throw($sym97$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(incoming_posting_queue));
                    }
                    sublisp_throw($sym97$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_incoming_posting_queue(self, incoming_posting_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym97$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_get_outgoing_posting_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject outgoing_posting_queue = get_cyblack_internal_ui_monitor_outgoing_posting_queue(self);
            try {
                try {
                    if (NIL != cyblack_internal_ui_monitor_outgoing_posting_p_method(self)) {
                        sublisp_throw($sym101$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(outgoing_posting_queue));
                    }
                    sublisp_throw($sym101$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_ui_monitor_outgoing_posting_queue(self, outgoing_posting_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_raw_to_posting_method(SubLObject self, SubLObject v_object) {
        return NIL;
    }

    public static final SubLObject cyblack_internal_ui_monitor_posting_to_raw_method(SubLObject self, SubLObject posting) {
        return NIL;
    }

    public static final SubLObject cyblack_internal_ui_monitor_on_set_active_method(SubLObject self, SubLObject old_active_status, SubLObject new_active_status) {
        if ((NIL != new_active_status) && (old_active_status != new_active_status)) {
            methods.funcall_instance_method_with_0_args(self, SPAWN_CONNECTION);
        }
        return new_active_status;
    }

    public static final SubLObject cyblack_internal_ui_monitor_external_to_internal_increment_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self)) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread))) {
                while (((NIL != cyblack_internal_ui_monitor_incoming_raw_p_method(self)) && (NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self))) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread))) {
                    {
                        SubLObject raw_input = cyblack_internal_ui_monitor_get_incoming_raw_method(self);
                        SubLObject posting = (NIL != raw_input) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(self, RAW_TO_POSTING, raw_input))) : NIL;
                        if (NIL != posting) {
                            cyblack_internal_ui_monitor_add_incoming_posting_method(self, posting);
                        }
                    }
                } 
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_external_to_internal_process_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
                SubLObject incoming_sleep_interval = get_cyblack_internal_ui_monitor_incoming_sleep_interval(self);
                try {
                    try {
                        {
                            SubLObject incoming_sleep_interval_1 = get_cyblack_internal_ui_monitor_incoming_sleep_interval(self);
                            while ((NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self)) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread))) {
                                while (((NIL != cyblack_internal_ui_monitor_incoming_raw_p_method(self)) && (NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self))) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread))) {
                                    {
                                        SubLObject raw_input = cyblack_internal_ui_monitor_get_incoming_raw_method(self);
                                        SubLObject posting = (NIL != raw_input) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(self, RAW_TO_POSTING, raw_input))) : NIL;
                                        if (NIL != posting) {
                                            cyblack_internal_ui_monitor_add_incoming_posting_method(self, posting);
                                        }
                                    }
                                } 
                                sleep(incoming_sleep_interval_1);
                            } 
                            sublisp_throw($sym119$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_internal_ui_monitor_incoming_sleep_interval(self, incoming_sleep_interval);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym119$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
                }
                return catch_var_for_cyblack_internal_ui_monitor_method;
            }
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_internal_to_external_increment_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self)) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread))) {
                while (((NIL != cyblack_internal_ui_monitor_outgoing_posting_p_method(self)) && (NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self))) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread))) {
                    {
                        SubLObject posting = cyblack_internal_ui_monitor_get_outgoing_posting_method(self);
                        SubLObject raw_output = (NIL != posting) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(self, POSTING_TO_RAW, posting))) : NIL;
                        if (NIL != raw_output) {
                            cyblack_internal_ui_monitor_add_outgoing_raw_method(self, raw_output);
                        }
                    }
                } 
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_internal_to_external_process_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
                SubLObject outgoing_sleep_interval = get_cyblack_internal_ui_monitor_outgoing_sleep_interval(self);
                try {
                    try {
                        {
                            SubLObject outgoing_sleep_interval_2 = get_cyblack_internal_ui_monitor_outgoing_sleep_interval(self);
                            while ((NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self)) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread))) {
                                while (((NIL != cyblack_internal_ui_monitor_outgoing_posting_p_method(self)) && (NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self))) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread))) {
                                    {
                                        SubLObject posting = cyblack_internal_ui_monitor_get_outgoing_posting_method(self);
                                        SubLObject raw_output = (NIL != posting) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(self, POSTING_TO_RAW, posting))) : NIL;
                                        if (NIL != raw_output) {
                                            cyblack_internal_ui_monitor_add_outgoing_raw_method(self, raw_output);
                                        }
                                    }
                                } 
                                sleep(outgoing_sleep_interval_2);
                            } 
                            sublisp_throw($sym126$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_internal_ui_monitor_outgoing_sleep_interval(self, outgoing_sleep_interval);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym126$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
                }
                return catch_var_for_cyblack_internal_ui_monitor_method;
            }
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_blackboard_connection_increment_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self)) && (NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread))) {
                while (((NIL != cyblack_internal_ui_monitor_incoming_posting_p_method(self)) && (NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self))) && (NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread))) {
                    {
                        SubLObject posting = cyblack_internal_ui_monitor_get_incoming_posting_method(self);
                        if (NIL != posting) {
                            cyblack_monitor.cyblack_basic_monitor_post_method(self, posting);
                        }
                    }
                } 
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_blackboard_connection_process_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject sleep_interval = get_cyblack_internal_ui_monitor_blackboard_connection_sleep_interval(self);
                while ((NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self)) && (NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread))) {
                    while (((NIL != cyblack_internal_ui_monitor_incoming_posting_p_method(self)) && (NIL != cyblack_monitor.cyblack_basic_monitor_is_active_method(self))) && (NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread))) {
                        {
                            SubLObject posting = cyblack_internal_ui_monitor_get_incoming_posting_method(self);
                            if (NIL != posting) {
                                cyblack_monitor.cyblack_basic_monitor_post_method(self, posting);
                            }
                        }
                    } 
                    sleep(sleep_interval);
                } 
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_internal_ui_monitor_report_posting_method(SubLObject self, SubLObject panel, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_internal_ui_monitor_method = NIL;
            SubLObject active = cyblack_monitor.get_cyblack_basic_monitor_active(self);
            try {
                try {
                    if (NIL != active) {
                        cyblack_internal_ui_monitor_add_outgoing_posting_method(self, posting);
                    }
                    sublisp_throw($sym137$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD, posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_monitor.set_cyblack_basic_monitor_active(self, active);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_ui_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym137$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_internal_ui_monitor_method;
        }
    }

    public static final SubLObject declare_cyblack_ui_monitor_file() {
        declareFunction("get_cyblack_internal_ui_monitor_blackboard_connection_sleep_interval", "GET-CYBLACK-INTERNAL-UI-MONITOR-BLACKBOARD-CONNECTION-SLEEP-INTERVAL", 1, 0, false);
        declareFunction("set_cyblack_internal_ui_monitor_blackboard_connection_sleep_interval", "SET-CYBLACK-INTERNAL-UI-MONITOR-BLACKBOARD-CONNECTION-SLEEP-INTERVAL", 2, 0, false);
        declareFunction("get_cyblack_internal_ui_monitor_outgoing_sleep_interval", "GET-CYBLACK-INTERNAL-UI-MONITOR-OUTGOING-SLEEP-INTERVAL", 1, 0, false);
        declareFunction("set_cyblack_internal_ui_monitor_outgoing_sleep_interval", "SET-CYBLACK-INTERNAL-UI-MONITOR-OUTGOING-SLEEP-INTERVAL", 2, 0, false);
        declareFunction("get_cyblack_internal_ui_monitor_incoming_sleep_interval", "GET-CYBLACK-INTERNAL-UI-MONITOR-INCOMING-SLEEP-INTERVAL", 1, 0, false);
        declareFunction("set_cyblack_internal_ui_monitor_incoming_sleep_interval", "SET-CYBLACK-INTERNAL-UI-MONITOR-INCOMING-SLEEP-INTERVAL", 2, 0, false);
        declareFunction("get_cyblack_internal_ui_monitor_spawn_connection_function", "GET-CYBLACK-INTERNAL-UI-MONITOR-SPAWN-CONNECTION-FUNCTION", 1, 0, false);
        declareFunction("set_cyblack_internal_ui_monitor_spawn_connection_function", "SET-CYBLACK-INTERNAL-UI-MONITOR-SPAWN-CONNECTION-FUNCTION", 2, 0, false);
        declareFunction("get_cyblack_internal_ui_monitor_outgoing_posting_queue", "GET-CYBLACK-INTERNAL-UI-MONITOR-OUTGOING-POSTING-QUEUE", 1, 0, false);
        declareFunction("set_cyblack_internal_ui_monitor_outgoing_posting_queue", "SET-CYBLACK-INTERNAL-UI-MONITOR-OUTGOING-POSTING-QUEUE", 2, 0, false);
        declareFunction("get_cyblack_internal_ui_monitor_incoming_posting_queue", "GET-CYBLACK-INTERNAL-UI-MONITOR-INCOMING-POSTING-QUEUE", 1, 0, false);
        declareFunction("set_cyblack_internal_ui_monitor_incoming_posting_queue", "SET-CYBLACK-INTERNAL-UI-MONITOR-INCOMING-POSTING-QUEUE", 2, 0, false);
        declareFunction("get_cyblack_internal_ui_monitor_outgoing_raw_queue", "GET-CYBLACK-INTERNAL-UI-MONITOR-OUTGOING-RAW-QUEUE", 1, 0, false);
        declareFunction("set_cyblack_internal_ui_monitor_outgoing_raw_queue", "SET-CYBLACK-INTERNAL-UI-MONITOR-OUTGOING-RAW-QUEUE", 2, 0, false);
        declareFunction("get_cyblack_internal_ui_monitor_incoming_raw_queue", "GET-CYBLACK-INTERNAL-UI-MONITOR-INCOMING-RAW-QUEUE", 1, 0, false);
        declareFunction("set_cyblack_internal_ui_monitor_incoming_raw_queue", "SET-CYBLACK-INTERNAL-UI-MONITOR-INCOMING-RAW-QUEUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_ui_monitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-UI-MONITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_ui_monitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-UI-MONITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_p", "CYBLACK-INTERNAL-UI-MONITOR-P", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_initialize_method", "CYBLACK-INTERNAL-UI-MONITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_get_spawn_connection_function_method", "CYBLACK-INTERNAL-UI-MONITOR-GET-SPAWN-CONNECTION-FUNCTION-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_set_spawn_connection_function_method", "CYBLACK-INTERNAL-UI-MONITOR-SET-SPAWN-CONNECTION-FUNCTION-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_ui_monitor_spawn_connection_method", "CYBLACK-INTERNAL-UI-MONITOR-SPAWN-CONNECTION-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_incoming_raw_p_method", "CYBLACK-INTERNAL-UI-MONITOR-INCOMING-RAW-P-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_outgoing_raw_p_method", "CYBLACK-INTERNAL-UI-MONITOR-OUTGOING-RAW-P-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_incoming_posting_p_method", "CYBLACK-INTERNAL-UI-MONITOR-INCOMING-POSTING-P-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_outgoing_posting_p_method", "CYBLACK-INTERNAL-UI-MONITOR-OUTGOING-POSTING-P-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_add_incoming_raw_method", "CYBLACK-INTERNAL-UI-MONITOR-ADD-INCOMING-RAW-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_ui_monitor_add_outgoing_raw_method", "CYBLACK-INTERNAL-UI-MONITOR-ADD-OUTGOING-RAW-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_ui_monitor_add_incoming_posting_method", "CYBLACK-INTERNAL-UI-MONITOR-ADD-INCOMING-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_ui_monitor_add_outgoing_posting_method", "CYBLACK-INTERNAL-UI-MONITOR-ADD-OUTGOING-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_ui_monitor_get_incoming_raw_method", "CYBLACK-INTERNAL-UI-MONITOR-GET-INCOMING-RAW-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_get_outgoing_raw_method", "CYBLACK-INTERNAL-UI-MONITOR-GET-OUTGOING-RAW-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_get_incoming_posting_method", "CYBLACK-INTERNAL-UI-MONITOR-GET-INCOMING-POSTING-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_get_outgoing_posting_method", "CYBLACK-INTERNAL-UI-MONITOR-GET-OUTGOING-POSTING-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_raw_to_posting_method", "CYBLACK-INTERNAL-UI-MONITOR-RAW-TO-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_ui_monitor_posting_to_raw_method", "CYBLACK-INTERNAL-UI-MONITOR-POSTING-TO-RAW-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_ui_monitor_on_set_active_method", "CYBLACK-INTERNAL-UI-MONITOR-ON-SET-ACTIVE-METHOD", 3, 0, false);
        declareFunction("cyblack_internal_ui_monitor_external_to_internal_increment_method", "CYBLACK-INTERNAL-UI-MONITOR-EXTERNAL-TO-INTERNAL-INCREMENT-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_external_to_internal_process_method", "CYBLACK-INTERNAL-UI-MONITOR-EXTERNAL-TO-INTERNAL-PROCESS-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_internal_to_external_increment_method", "CYBLACK-INTERNAL-UI-MONITOR-INTERNAL-TO-EXTERNAL-INCREMENT-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_internal_to_external_process_method", "CYBLACK-INTERNAL-UI-MONITOR-INTERNAL-TO-EXTERNAL-PROCESS-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_blackboard_connection_increment_method", "CYBLACK-INTERNAL-UI-MONITOR-BLACKBOARD-CONNECTION-INCREMENT-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_blackboard_connection_process_method", "CYBLACK-INTERNAL-UI-MONITOR-BLACKBOARD-CONNECTION-PROCESS-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_ui_monitor_report_posting_method", "CYBLACK-INTERNAL-UI-MONITOR-REPORT-POSTING-METHOD", 3, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_ui_monitor_file() {
        defparameter("*CYBLACK-INTERNAL-UI-MONITOR-DEFAULT-INCOMING-SLEEP-INTERVAL*", $float$0_25);
        defparameter("*CYBLACK-INTERNAL-UI-MONITOR-DEFAULT-OUTGOING-SLEEP-INTERVAL*", $float$0_1);
        defparameter("*CYBLACK-INTERNAL-UI-MONITOR-DEFAULT-BLACKBOARD-CONNECTION-SLEEP-INTERVAL*", $float$0_15);
        return NIL;
    }

    public static final SubLObject setup_cyblack_ui_monitor_file() {
                classes.subloop_new_class(CYBLACK_INTERNAL_UI_MONITOR, CYBLACK_BASIC_MONITOR, NIL, NIL, $list_alt5);
        classes.class_set_implements_slot_listeners(CYBLACK_INTERNAL_UI_MONITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_INTERNAL_UI_MONITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_UI_MONITOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_INTERNAL_UI_MONITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_UI_MONITOR_INSTANCE);
        subloop_reserved_initialize_cyblack_internal_ui_monitor_class(CYBLACK_INTERNAL_UI_MONITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, INITIALIZE, CYBLACK_INTERNAL_UI_MONITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_SPAWN_CONNECTION_FUNCTION, CYBLACK_INTERNAL_UI_MONITOR, $list_alt36, NIL, $list_alt37);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, GET_SPAWN_CONNECTION_FUNCTION, CYBLACK_INTERNAL_UI_MONITOR_GET_SPAWN_CONNECTION_FUNCTION_METHOD);
        methods.methods_incorporate_instance_method(SET_SPAWN_CONNECTION_FUNCTION, CYBLACK_INTERNAL_UI_MONITOR, $list_alt36, $list_alt41, $list_alt42);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, SET_SPAWN_CONNECTION_FUNCTION, CYBLACK_INTERNAL_UI_MONITOR_SET_SPAWN_CONNECTION_FUNCTION_METHOD);
        methods.methods_incorporate_instance_method(SPAWN_CONNECTION, CYBLACK_INTERNAL_UI_MONITOR, $list_alt36, NIL, $list_alt47);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, SPAWN_CONNECTION, CYBLACK_INTERNAL_UI_MONITOR_SPAWN_CONNECTION_METHOD);
        methods.methods_incorporate_instance_method(INCOMING_RAW_P, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, NIL, $list_alt52);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, INCOMING_RAW_P, CYBLACK_INTERNAL_UI_MONITOR_INCOMING_RAW_P_METHOD);
        methods.methods_incorporate_instance_method(OUTGOING_RAW_P, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, NIL, $list_alt56);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, OUTGOING_RAW_P, CYBLACK_INTERNAL_UI_MONITOR_OUTGOING_RAW_P_METHOD);
        methods.methods_incorporate_instance_method(INCOMING_POSTING_P, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, NIL, $list_alt60);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, INCOMING_POSTING_P, CYBLACK_INTERNAL_UI_MONITOR_INCOMING_POSTING_P_METHOD);
        methods.methods_incorporate_instance_method(OUTGOING_POSTING_P, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, NIL, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, OUTGOING_POSTING_P, CYBLACK_INTERNAL_UI_MONITOR_OUTGOING_POSTING_P_METHOD);
        methods.methods_incorporate_instance_method(ADD_INCOMING_RAW, CYBLACK_INTERNAL_UI_MONITOR, $list_alt36, $list_alt68, $list_alt69);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, ADD_INCOMING_RAW, CYBLACK_INTERNAL_UI_MONITOR_ADD_INCOMING_RAW_METHOD);
        methods.methods_incorporate_instance_method(ADD_OUTGOING_RAW, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, $list_alt68, $list_alt73);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, ADD_OUTGOING_RAW, CYBLACK_INTERNAL_UI_MONITOR_ADD_OUTGOING_RAW_METHOD);
        methods.methods_incorporate_instance_method(ADD_INCOMING_POSTING, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, $list_alt77, $list_alt78);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, ADD_INCOMING_POSTING, CYBLACK_INTERNAL_UI_MONITOR_ADD_INCOMING_POSTING_METHOD);
        methods.methods_incorporate_instance_method(ADD_OUTGOING_POSTING, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, $list_alt77, $list_alt83);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, ADD_OUTGOING_POSTING, CYBLACK_INTERNAL_UI_MONITOR_ADD_OUTGOING_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET_INCOMING_RAW, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, NIL, $list_alt88);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, GET_INCOMING_RAW, CYBLACK_INTERNAL_UI_MONITOR_GET_INCOMING_RAW_METHOD);
        methods.methods_incorporate_instance_method(GET_OUTGOING_RAW, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, NIL, $list_alt92);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, GET_OUTGOING_RAW, CYBLACK_INTERNAL_UI_MONITOR_GET_OUTGOING_RAW_METHOD);
        methods.methods_incorporate_instance_method(GET_INCOMING_POSTING, CYBLACK_INTERNAL_UI_MONITOR, $list_alt36, NIL, $list_alt96);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, GET_INCOMING_POSTING, CYBLACK_INTERNAL_UI_MONITOR_GET_INCOMING_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET_OUTGOING_POSTING, CYBLACK_INTERNAL_UI_MONITOR, $list_alt36, NIL, $list_alt100);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, GET_OUTGOING_POSTING, CYBLACK_INTERNAL_UI_MONITOR_GET_OUTGOING_POSTING_METHOD);
        methods.methods_incorporate_instance_method(RAW_TO_POSTING, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, $list_alt68, $list_alt104);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, RAW_TO_POSTING, CYBLACK_INTERNAL_UI_MONITOR_RAW_TO_POSTING_METHOD);
        methods.methods_incorporate_instance_method(POSTING_TO_RAW, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, $list_alt77, $list_alt107);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, POSTING_TO_RAW, CYBLACK_INTERNAL_UI_MONITOR_POSTING_TO_RAW_METHOD);
        methods.methods_incorporate_instance_method(ON_SET_ACTIVE, CYBLACK_INTERNAL_UI_MONITOR, $list_alt30, $list_alt110, $list_alt111);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, ON_SET_ACTIVE, CYBLACK_INTERNAL_UI_MONITOR_ON_SET_ACTIVE_METHOD);
        methods.methods_incorporate_instance_method(EXTERNAL_TO_INTERNAL_INCREMENT, CYBLACK_INTERNAL_UI_MONITOR, $list_alt114, NIL, $list_alt115);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, EXTERNAL_TO_INTERNAL_INCREMENT, CYBLACK_INTERNAL_UI_MONITOR_EXTERNAL_TO_INTERNAL_INCREMENT_METHOD);
        methods.methods_incorporate_instance_method(EXTERNAL_TO_INTERNAL_PROCESS, CYBLACK_INTERNAL_UI_MONITOR, $list_alt114, NIL, $list_alt118);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, EXTERNAL_TO_INTERNAL_PROCESS, CYBLACK_INTERNAL_UI_MONITOR_EXTERNAL_TO_INTERNAL_PROCESS_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_TO_EXTERNAL_INCREMENT, CYBLACK_INTERNAL_UI_MONITOR, $list_alt114, NIL, $list_alt122);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, INTERNAL_TO_EXTERNAL_INCREMENT, CYBLACK_INTERNAL_UI_MONITOR_INTERNAL_TO_EXTERNAL_INCREMENT_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_TO_EXTERNAL_PROCESS, CYBLACK_INTERNAL_UI_MONITOR, $list_alt114, NIL, $list_alt125);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, INTERNAL_TO_EXTERNAL_PROCESS, CYBLACK_INTERNAL_UI_MONITOR_INTERNAL_TO_EXTERNAL_PROCESS_METHOD);
        methods.methods_incorporate_instance_method(BLACKBOARD_CONNECTION_INCREMENT, CYBLACK_INTERNAL_UI_MONITOR, $list_alt114, NIL, $list_alt129);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, BLACKBOARD_CONNECTION_INCREMENT, $sym130$CYBLACK_INTERNAL_UI_MONITOR_BLACKBOARD_CONNECTION_INCREMENT_METHO);
        methods.methods_incorporate_instance_method(BLACKBOARD_CONNECTION_PROCESS, CYBLACK_INTERNAL_UI_MONITOR, $list_alt114, NIL, $list_alt132);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, BLACKBOARD_CONNECTION_PROCESS, CYBLACK_INTERNAL_UI_MONITOR_BLACKBOARD_CONNECTION_PROCESS_METHOD);
        methods.methods_incorporate_instance_method(REPORT_POSTING, CYBLACK_INTERNAL_UI_MONITOR, $list_alt36, $list_alt135, $list_alt136);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_UI_MONITOR, REPORT_POSTING, CYBLACK_INTERNAL_UI_MONITOR_REPORT_POSTING_METHOD);
        return NIL;
    }

    // // Internal Constants
    public static final SubLFloat $float$0_25 = makeDouble(0.25);

    public static final SubLFloat $float$0_1 = makeDouble(0.1);

    public static final SubLFloat $float$0_15 = makeDouble(0.15);

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR = makeSymbol("CYBLACK-BASIC-MONITOR");

    static private final SubLList $list_alt5 = list(new SubLObject[]{ list(makeSymbol("INCOMING-RAW-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OUTGOING-RAW-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INCOMING-POSTING-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OUTGOING-POSTING-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SPAWN-CONNECTION-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INCOMING-SLEEP-INTERVAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OUTGOING-SLEEP-INTERVAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("BLACKBOARD-CONNECTION-SLEEP-INTERVAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPAWN-CONNECTION-FUNCTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SPAWN-CONNECTION-FUNCTION"), list(makeSymbol("FUNCTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SPAWN-CONNECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INCOMING-RAW-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OUTGOING-RAW-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INCOMING-POSTING-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OUTGOING-POSTING-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-INCOMING-RAW"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-OUTGOING-RAW"), list(makeSymbol("OBJECT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-INCOMING-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-OUTGOING-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INCOMING-RAW"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OUTGOING-RAW"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INCOMING-POSTING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OUTGOING-POSTING"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RAW-TO-POSTING"), list(makeSymbol("OBJECT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSTING-TO-RAW"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SET-ACTIVE"), list(makeSymbol("OLD-ACTIVE-STATUS"), makeSymbol("NEW-ACTIVE-STATUS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNAL-TO-INTERNAL-INCREMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTERNAL-TO-INTERNAL-PROCESS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-TO-EXTERNAL-INCREMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-TO-EXTERNAL-PROCESS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BLACKBOARD-CONNECTION-PROCESS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REPORT-POSTING"), list(makeSymbol("PANEL"), makeSymbol("POSTING")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol BLACKBOARD_CONNECTION_SLEEP_INTERVAL = makeSymbol("BLACKBOARD-CONNECTION-SLEEP-INTERVAL");

    private static final SubLSymbol OUTGOING_SLEEP_INTERVAL = makeSymbol("OUTGOING-SLEEP-INTERVAL");

    private static final SubLSymbol INCOMING_SLEEP_INTERVAL = makeSymbol("INCOMING-SLEEP-INTERVAL");















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_UI_MONITOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-UI-MONITOR-CLASS");



















    private static final SubLSymbol PANEL_LIST = makeSymbol("PANEL-LIST");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_UI_MONITOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-UI-MONITOR-INSTANCE");



    static private final SubLList $list_alt30 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt31 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-RAW-QUEUE"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("OUTGOING-RAW-QUEUE"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-POSTING-QUEUE"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("OUTGOING-POSTING-QUEUE"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("SPAWN-CONNECTION-FUNCTION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-SLEEP-INTERVAL"), makeSymbol("*CYBLACK-INTERNAL-UI-MONITOR-DEFAULT-INCOMING-SLEEP-INTERVAL*")), list(makeSymbol("CSETQ"), makeSymbol("OUTGOING-SLEEP-INTERVAL"), makeSymbol("*CYBLACK-INTERNAL-UI-MONITOR-DEFAULT-OUTGOING-SLEEP-INTERVAL*")), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD-CONNECTION-SLEEP-INTERVAL"), makeSymbol("*CYBLACK-INTERNAL-UI-MONITOR-DEFAULT-BLACKBOARD-CONNECTION-SLEEP-INTERVAL*")), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym32$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");



    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-INITIALIZE-METHOD");

    private static final SubLSymbol GET_SPAWN_CONNECTION_FUNCTION = makeSymbol("GET-SPAWN-CONNECTION-FUNCTION");

    static private final SubLList $list_alt36 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt37 = list(list(RET, makeSymbol("SPAWN-CONNECTION-FUNCTION")));

    static private final SubLSymbol $sym38$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_GET_SPAWN_CONNECTION_FUNCTION_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-GET-SPAWN-CONNECTION-FUNCTION-METHOD");

    private static final SubLSymbol SET_SPAWN_CONNECTION_FUNCTION = makeSymbol("SET-SPAWN-CONNECTION-FUNCTION");

    static private final SubLList $list_alt41 = list(makeSymbol("FUNCTION"));

    static private final SubLList $list_alt42 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("FUNCTION"), list(makeSymbol("SYMBOLP"), makeSymbol("FUNCTION"))), makeString("(SET-SPAWN-CONNECTION-FUNCTION ~S): The spawn function must be a non-nil symbol.  ~S is not a valid value."), makeSymbol("SELF"), makeSymbol("FUNCTION")), list(makeSymbol("PUNLESS"), list(makeSymbol("SYMBOL-FUNCTION"), makeSymbol("FUNCTION")), list(makeSymbol("WARN"), makeString("(SET-SPAWN-CONNECTION-FUNCTION ~S): ~S is not currently defined as a function."), makeSymbol("SELF"), makeSymbol("FUNCTION"))), list(makeSymbol("CSETQ"), makeSymbol("SPAWN-CONNECTION-FUNCTION"), makeSymbol("FUNCTION")), list(RET, makeSymbol("FUNCTION")));

    static private final SubLSymbol $sym43$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    static private final SubLString $str_alt44$_SET_SPAWN_CONNECTION_FUNCTION__S = makeString("(SET-SPAWN-CONNECTION-FUNCTION ~S): ~S is not currently defined as a function.");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_SET_SPAWN_CONNECTION_FUNCTION_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-SET-SPAWN-CONNECTION-FUNCTION-METHOD");

    private static final SubLSymbol SPAWN_CONNECTION = makeSymbol("SPAWN-CONNECTION");

    static private final SubLList $list_alt47 = list(list(makeSymbol("PIF"), list(makeSymbol("CAND"), makeSymbol("SPAWN-CONNECTION-FUNCTION"), list(makeSymbol("SYMBOL-FUNCTION"), makeSymbol("SPAWN-CONNECTION-FUNCTION"))), list(RET, list(makeSymbol("FUNCALL"), makeSymbol("SPAWN-CONNECTION-FUNCTION"))), list(makeSymbol("PROGN"), list(makeSymbol("WARN"), makeString("(SPAWN-CONNECTION ~S): Could not spawn a connection.  ~S is not funcallable."), makeSymbol("SELF"), makeSymbol("SPAWN-CONNECTION-FUNCTION")), list(RET, NIL))));

    static private final SubLSymbol $sym48$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    static private final SubLString $str_alt49$_SPAWN_CONNECTION__S___Could_not_ = makeString("(SPAWN-CONNECTION ~S): Could not spawn a connection.  ~S is not funcallable.");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_SPAWN_CONNECTION_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-SPAWN-CONNECTION-METHOD");

    private static final SubLSymbol INCOMING_RAW_P = makeSymbol("INCOMING-RAW-P");

    static private final SubLList $list_alt52 = list(list(RET, list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("INCOMING-RAW-QUEUE")))));

    static private final SubLSymbol $sym53$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_INCOMING_RAW_P_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-INCOMING-RAW-P-METHOD");

    private static final SubLSymbol OUTGOING_RAW_P = makeSymbol("OUTGOING-RAW-P");

    static private final SubLList $list_alt56 = list(list(RET, list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("OUTGOING-RAW-QUEUE")))));

    static private final SubLSymbol $sym57$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_OUTGOING_RAW_P_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-OUTGOING-RAW-P-METHOD");

    private static final SubLSymbol INCOMING_POSTING_P = makeSymbol("INCOMING-POSTING-P");

    static private final SubLList $list_alt60 = list(list(RET, list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("INCOMING-POSTING-QUEUE")))));

    static private final SubLSymbol $sym61$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_INCOMING_POSTING_P_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-INCOMING-POSTING-P-METHOD");



    static private final SubLList $list_alt64 = list(list(RET, list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("OUTGOING-POSTING-QUEUE")))));

    static private final SubLSymbol $sym65$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_OUTGOING_POSTING_P_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-OUTGOING-POSTING-P-METHOD");

    private static final SubLSymbol ADD_INCOMING_RAW = makeSymbol("ADD-INCOMING-RAW");

    static private final SubLList $list_alt68 = list(makeSymbol("OBJECT"));

    static private final SubLList $list_alt69 = list(list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("INCOMING-RAW-QUEUE"), makeSymbol("OBJECT")), list(RET, makeSymbol("OBJECT")));

    static private final SubLSymbol $sym70$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_ADD_INCOMING_RAW_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-ADD-INCOMING-RAW-METHOD");

    private static final SubLSymbol ADD_OUTGOING_RAW = makeSymbol("ADD-OUTGOING-RAW");

    static private final SubLList $list_alt73 = list(list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("OUTGOING-RAW-QUEUE"), makeSymbol("OBJECT")), list(RET, makeSymbol("OBJECT")));

    static private final SubLSymbol $sym74$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_ADD_OUTGOING_RAW_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-ADD-OUTGOING-RAW-METHOD");

    private static final SubLSymbol ADD_INCOMING_POSTING = makeSymbol("ADD-INCOMING-POSTING");

    static private final SubLList $list_alt77 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt78 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), list(makeSymbol("WARN"), makeString("(ADD-INCOMING-POSTING ~S): ~S is not an instance of CYBLACK-INCOMING-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(RET, NIL)), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("INCOMING-POSTING-QUEUE"), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING")));

    static private final SubLSymbol $sym79$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    static private final SubLString $str_alt80$_ADD_INCOMING_POSTING__S____S_is_ = makeString("(ADD-INCOMING-POSTING ~S): ~S is not an instance of CYBLACK-INCOMING-POSTING.");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_ADD_INCOMING_POSTING_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-ADD-INCOMING-POSTING-METHOD");

    private static final SubLSymbol ADD_OUTGOING_POSTING = makeSymbol("ADD-OUTGOING-POSTING");

    static private final SubLList $list_alt83 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), list(makeSymbol("WARN"), makeString("(ADD-OUTGOING-POSTING ~S): ~S is not an instance of CYBLACK-OUTGOING-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(RET, NIL)), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("OUTGOING-POSTING-QUEUE"), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING")));

    static private final SubLSymbol $sym84$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    static private final SubLString $str_alt85$_ADD_OUTGOING_POSTING__S____S_is_ = makeString("(ADD-OUTGOING-POSTING ~S): ~S is not an instance of CYBLACK-OUTGOING-POSTING.");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_ADD_OUTGOING_POSTING_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-ADD-OUTGOING-POSTING-METHOD");

    private static final SubLSymbol GET_INCOMING_RAW = makeSymbol("GET-INCOMING-RAW");

    static private final SubLList $list_alt88 = list(list(makeSymbol("PWHEN"), list(makeSymbol("INCOMING-RAW-P"), makeSymbol("SELF")), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("INCOMING-RAW-QUEUE")))), list(RET, NIL));

    static private final SubLSymbol $sym89$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_GET_INCOMING_RAW_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-GET-INCOMING-RAW-METHOD");

    private static final SubLSymbol GET_OUTGOING_RAW = makeSymbol("GET-OUTGOING-RAW");

    static private final SubLList $list_alt92 = list(list(makeSymbol("PWHEN"), list(makeSymbol("OUTGOING-RAW-P"), makeSymbol("SELF")), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("OUTGOING-RAW-QUEUE")))), list(RET, NIL));

    static private final SubLSymbol $sym93$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_GET_OUTGOING_RAW_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-GET-OUTGOING-RAW-METHOD");

    private static final SubLSymbol GET_INCOMING_POSTING = makeSymbol("GET-INCOMING-POSTING");

    static private final SubLList $list_alt96 = list(list(makeSymbol("PWHEN"), list(makeSymbol("INCOMING-POSTING-P"), makeSymbol("SELF")), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("INCOMING-POSTING-QUEUE")))), list(RET, NIL));

    static private final SubLSymbol $sym97$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_GET_INCOMING_POSTING_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-GET-INCOMING-POSTING-METHOD");

    private static final SubLSymbol GET_OUTGOING_POSTING = makeSymbol("GET-OUTGOING-POSTING");

    static private final SubLList $list_alt100 = list(list(makeSymbol("PWHEN"), list(makeSymbol("OUTGOING-POSTING-P"), makeSymbol("SELF")), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("OUTGOING-POSTING-QUEUE")))), list(RET, NIL));

    static private final SubLSymbol $sym101$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_GET_OUTGOING_POSTING_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-GET-OUTGOING-POSTING-METHOD");

    private static final SubLSymbol RAW_TO_POSTING = makeSymbol("RAW-TO-POSTING");

    static private final SubLList $list_alt104 = list(list(makeSymbol("IGNORE"), makeSymbol("OBJECT")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_RAW_TO_POSTING_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-RAW-TO-POSTING-METHOD");

    private static final SubLSymbol POSTING_TO_RAW = makeSymbol("POSTING-TO-RAW");

    static private final SubLList $list_alt107 = list(list(makeSymbol("IGNORE"), makeSymbol("POSTING")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_POSTING_TO_RAW_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-POSTING-TO-RAW-METHOD");

    private static final SubLSymbol ON_SET_ACTIVE = makeSymbol("ON-SET-ACTIVE");

    static private final SubLList $list_alt110 = list(makeSymbol("OLD-ACTIVE-STATUS"), makeSymbol("NEW-ACTIVE-STATUS"));

    static private final SubLList $list_alt111 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("NEW-ACTIVE-STATUS"), list(makeSymbol("CNOT"), list(EQ, makeSymbol("OLD-ACTIVE-STATUS"), makeSymbol("NEW-ACTIVE-STATUS")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SPAWN-CONNECTION")))), list(RET, makeSymbol("NEW-ACTIVE-STATUS")));

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_ON_SET_ACTIVE_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-ON-SET-ACTIVE-METHOD");

    private static final SubLSymbol EXTERNAL_TO_INTERNAL_INCREMENT = makeSymbol("EXTERNAL-TO-INTERNAL-INCREMENT");

    static private final SubLList $list_alt114 = list(makeKeyword("NO-INSTANCE-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt115 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*")), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("INCOMING-RAW-P"), makeSymbol("SELF")), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*")), list(makeSymbol("CLET"), list(list(makeSymbol("RAW-INPUT"), list(makeSymbol("GET-INCOMING-RAW"), makeSymbol("SELF"))), list(makeSymbol("POSTING"), list(makeSymbol("FIF"), makeSymbol("RAW-INPUT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RAW-TO-POSTING")), makeSymbol("RAW-INPUT")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("ADD-INCOMING-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING")))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_EXTERNAL_TO_INTERNAL_INCREMENT_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-EXTERNAL-TO-INTERNAL-INCREMENT-METHOD");

    private static final SubLSymbol EXTERNAL_TO_INTERNAL_PROCESS = makeSymbol("EXTERNAL-TO-INTERNAL-PROCESS");

    static private final SubLList $list_alt118 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INCOMING-SLEEP-INTERVAL"), list(makeSymbol("GET-CYBLACK-INTERNAL-UI-MONITOR-INCOMING-SLEEP-INTERVAL"), makeSymbol("SELF")))), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*")), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("INCOMING-RAW-P"), makeSymbol("SELF")), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*")), list(makeSymbol("CLET"), list(list(makeSymbol("RAW-INPUT"), list(makeSymbol("GET-INCOMING-RAW"), makeSymbol("SELF"))), list(makeSymbol("POSTING"), list(makeSymbol("FIF"), makeSymbol("RAW-INPUT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RAW-TO-POSTING")), makeSymbol("RAW-INPUT")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("ADD-INCOMING-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING"))))), list(makeSymbol("SLEEP"), makeSymbol("INCOMING-SLEEP-INTERVAL")))), list(RET, NIL));

    static private final SubLSymbol $sym119$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_EXTERNAL_TO_INTERNAL_PROCESS_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-EXTERNAL-TO-INTERNAL-PROCESS-METHOD");

    private static final SubLSymbol INTERNAL_TO_EXTERNAL_INCREMENT = makeSymbol("INTERNAL-TO-EXTERNAL-INCREMENT");

    static private final SubLList $list_alt122 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*")), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("OUTGOING-POSTING-P"), makeSymbol("SELF")), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*")), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING"), list(makeSymbol("GET-OUTGOING-POSTING"), makeSymbol("SELF"))), list(makeSymbol("RAW-OUTPUT"), list(makeSymbol("FIF"), makeSymbol("POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POSTING-TO-RAW")), makeSymbol("POSTING")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("RAW-OUTPUT"), list(makeSymbol("ADD-OUTGOING-RAW"), makeSymbol("SELF"), makeSymbol("RAW-OUTPUT")))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_INTERNAL_TO_EXTERNAL_INCREMENT_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-INTERNAL-TO-EXTERNAL-INCREMENT-METHOD");

    private static final SubLSymbol INTERNAL_TO_EXTERNAL_PROCESS = makeSymbol("INTERNAL-TO-EXTERNAL-PROCESS");

    static private final SubLList $list_alt125 = list(list(makeSymbol("CLET"), list(list(makeSymbol("OUTGOING-SLEEP-INTERVAL"), list(makeSymbol("GET-CYBLACK-INTERNAL-UI-MONITOR-OUTGOING-SLEEP-INTERVAL"), makeSymbol("SELF")))), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*")), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("OUTGOING-POSTING-P"), makeSymbol("SELF")), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*")), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING"), list(makeSymbol("GET-OUTGOING-POSTING"), makeSymbol("SELF"))), list(makeSymbol("RAW-OUTPUT"), list(makeSymbol("FIF"), makeSymbol("POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POSTING-TO-RAW")), makeSymbol("POSTING")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("RAW-OUTPUT"), list(makeSymbol("ADD-OUTGOING-RAW"), makeSymbol("SELF"), makeSymbol("RAW-OUTPUT"))))), list(makeSymbol("SLEEP"), makeSymbol("OUTGOING-SLEEP-INTERVAL")))), list(RET, NIL));

    static private final SubLSymbol $sym126$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_INTERNAL_TO_EXTERNAL_PROCESS_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-INTERNAL-TO-EXTERNAL-PROCESS-METHOD");

    private static final SubLSymbol BLACKBOARD_CONNECTION_INCREMENT = makeSymbol("BLACKBOARD-CONNECTION-INCREMENT");

    static private final SubLList $list_alt129 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*")), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("INCOMING-POSTING-P"), makeSymbol("SELF")), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*")), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING"), list(makeSymbol("GET-INCOMING-POSTING"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("POST"), makeSymbol("SELF"), makeSymbol("POSTING")))))), list(RET, NIL));

    static private final SubLSymbol $sym130$CYBLACK_INTERNAL_UI_MONITOR_BLACKBOARD_CONNECTION_INCREMENT_METHO = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-BLACKBOARD-CONNECTION-INCREMENT-METHOD");

    private static final SubLSymbol BLACKBOARD_CONNECTION_PROCESS = makeSymbol("BLACKBOARD-CONNECTION-PROCESS");

    static private final SubLList $list_alt132 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SLEEP-INTERVAL"), list(makeSymbol("GET-CYBLACK-INTERNAL-UI-MONITOR-BLACKBOARD-CONNECTION-SLEEP-INTERVAL"), makeSymbol("SELF")))), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*")), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), list(makeSymbol("INCOMING-POSTING-P"), makeSymbol("SELF")), list(makeSymbol("IS-ACTIVE"), makeSymbol("SELF")), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*")), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING"), list(makeSymbol("GET-INCOMING-POSTING"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("POST"), makeSymbol("SELF"), makeSymbol("POSTING"))))), list(makeSymbol("SLEEP"), makeSymbol("SLEEP-INTERVAL")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_BLACKBOARD_CONNECTION_PROCESS_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-BLACKBOARD-CONNECTION-PROCESS-METHOD");

    private static final SubLSymbol REPORT_POSTING = makeSymbol("REPORT-POSTING");

    static private final SubLList $list_alt135 = list(makeSymbol("PANEL"), makeSymbol("POSTING"));

    static private final SubLList $list_alt136 = list(list(makeSymbol("IGNORE"), makeSymbol("PANEL")), list(makeSymbol("PWHEN"), makeSymbol("ACTIVE"), list(makeSymbol("ADD-OUTGOING-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING"))), list(RET, makeSymbol("POSTING")));

    static private final SubLSymbol $sym137$OUTER_CATCH_FOR_CYBLACK_INTERNAL_UI_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-UI-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_UI_MONITOR_REPORT_POSTING_METHOD = makeSymbol("CYBLACK-INTERNAL-UI-MONITOR-REPORT-POSTING-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_ui_monitor_file();
    }

    public void initializeVariables() {
        init_cyblack_ui_monitor_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_ui_monitor_file();
    }
}

