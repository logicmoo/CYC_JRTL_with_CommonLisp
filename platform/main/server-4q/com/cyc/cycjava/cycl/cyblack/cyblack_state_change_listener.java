/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-STATE-CHANGE-LISTENER
 *  source file: /cyc/top/cycl/cyblack/cyblack-state-change-listener.lisp
 *  created:     2019/07/03 17:38:47
 */
public final class cyblack_state_change_listener extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_state_change_listener() {
    }

    public static final SubLFile me = new cyblack_state_change_listener();


    // // Definitions
    public static final SubLObject cyblack_state_change_listener_p(SubLObject v_cyblack_state_change_listener) {
        return interfaces.subloop_instanceof_interface(v_cyblack_state_change_listener, CYBLACK_STATE_CHANGE_LISTENER);
    }

    public static final SubLObject get_cyblack_basic_state_change_listener_last_contents(SubLObject cyblack_basic_state_change_listener) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_state_change_listener, FIVE_INTEGER, LAST_CONTENTS);
    }

    public static final SubLObject set_cyblack_basic_state_change_listener_last_contents(SubLObject cyblack_basic_state_change_listener, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_state_change_listener, value, FIVE_INTEGER, LAST_CONTENTS);
    }

    public static final SubLObject get_cyblack_basic_state_change_listener_last_event_type(SubLObject cyblack_basic_state_change_listener) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_state_change_listener, FOUR_INTEGER, LAST_EVENT_TYPE);
    }

    public static final SubLObject set_cyblack_basic_state_change_listener_last_event_type(SubLObject cyblack_basic_state_change_listener, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_state_change_listener, value, FOUR_INTEGER, LAST_EVENT_TYPE);
    }

    public static final SubLObject get_cyblack_basic_state_change_listener_knowledge_source(SubLObject cyblack_basic_state_change_listener) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_state_change_listener, THREE_INTEGER, KNOWLEDGE_SOURCE);
    }

    public static final SubLObject set_cyblack_basic_state_change_listener_knowledge_source(SubLObject cyblack_basic_state_change_listener, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_state_change_listener, value, THREE_INTEGER, KNOWLEDGE_SOURCE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_state_change_listener_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_state_change_listener_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, LAST_EVENT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, LAST_CONTENTS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_state_change_listener_p(SubLObject cyblack_basic_state_change_listener) {
        return classes.subloop_instanceof_class(cyblack_basic_state_change_listener, CYBLACK_BASIC_STATE_CHANGE_LISTENER);
    }

    public static final SubLObject cyblack_basic_state_change_listener_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_state_change_listener_method = NIL;
            SubLObject last_contents = get_cyblack_basic_state_change_listener_last_contents(self);
            SubLObject last_event_type = get_cyblack_basic_state_change_listener_last_event_type(self);
            SubLObject knowledge_source = get_cyblack_basic_state_change_listener_knowledge_source(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    knowledge_source = NIL;
                    last_event_type = NIL;
                    last_contents = NIL;
                    sublisp_throw($sym22$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_state_change_listener_last_contents(self, last_contents);
                            set_cyblack_basic_state_change_listener_last_event_type(self, last_event_type);
                            set_cyblack_basic_state_change_listener_knowledge_source(self, knowledge_source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_state_change_listener_method = Errors.handleThrowable(ccatch_env_var, $sym22$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD);
            }
            return catch_var_for_cyblack_basic_state_change_listener_method;
        }
    }

    public static final SubLObject cyblack_basic_state_change_listener_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_basic_state_change_listener_method = NIL;
            SubLObject knowledge_source = get_cyblack_basic_state_change_listener_knowledge_source(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    format(stream, $str_alt29$__STATE_CHANGE_LISTENER__APP__S__, NIL != application ? ((SubLObject) (methods.funcall_instance_method_with_0_args(application, GET_APPLICATION_NAME))) : NIL, NIL != knowledge_source ? ((SubLObject) (NIL != cyblack_ks.cyblack_external_knowledge_source_p(knowledge_source) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(knowledge_source, GET_NAME))) : knowledge_source)) : NIL);
                    sublisp_throw($sym28$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_state_change_listener_knowledge_source(self, knowledge_source);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_state_change_listener_method = Errors.handleThrowable(ccatch_env_var, $sym28$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD);
            }
            return catch_var_for_cyblack_basic_state_change_listener_method;
        }
    }

    public static final SubLObject cyblack_basic_state_change_listener_get_knowledge_source_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_state_change_listener_method = NIL;
            SubLObject knowledge_source = get_cyblack_basic_state_change_listener_knowledge_source(self);
            try {
                try {
                    sublisp_throw($sym35$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD, knowledge_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_state_change_listener_knowledge_source(self, knowledge_source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_state_change_listener_method = Errors.handleThrowable(ccatch_env_var, $sym35$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD);
            }
            return catch_var_for_cyblack_basic_state_change_listener_method;
        }
    }

    public static final SubLObject cyblack_basic_state_change_listener_set_knowledge_source_method(SubLObject self, SubLObject new_knowledge_source) {
        {
            SubLObject catch_var_for_cyblack_basic_state_change_listener_method = NIL;
            SubLObject knowledge_source = get_cyblack_basic_state_change_listener_knowledge_source(self);
            try {
                try {
                    knowledge_source = new_knowledge_source;
                    sublisp_throw($sym40$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD, new_knowledge_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_state_change_listener_knowledge_source(self, knowledge_source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_state_change_listener_method = Errors.handleThrowable(ccatch_env_var, $sym40$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD);
            }
            return catch_var_for_cyblack_basic_state_change_listener_method;
        }
    }

    public static final SubLObject cyblack_basic_state_change_listener_transmit_state_change_method(SubLObject self, SubLObject event_type, SubLObject contents) {
        {
            SubLObject last_contents = get_cyblack_basic_state_change_listener_last_contents(self);
            SubLObject last_event_type = get_cyblack_basic_state_change_listener_last_event_type(self);
            last_event_type = event_type;
            set_cyblack_basic_state_change_listener_last_event_type(self, last_event_type);
            last_contents = contents;
            set_cyblack_basic_state_change_listener_last_contents(self, last_contents);
            methods.funcall_instance_method_with_0_args(self, TRANSMIT_STATE_CHANGE_INTERNAL);
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_state_change_listener_retransmit_last_state_change_method(SubLObject self) {
        return methods.funcall_instance_method_with_0_args(self, TRANSMIT_STATE_CHANGE_INTERNAL);
    }

    public static final SubLObject cyblack_basic_state_change_listener_transmit_state_change_internal_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_state_change_listener_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_state_change_listener_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, LAST_EVENT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, LAST_CONTENTS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_internal_state_change_listener_p(SubLObject cyblack_internal_state_change_listener) {
        return classes.subloop_instanceof_class(cyblack_internal_state_change_listener, CYBLACK_INTERNAL_STATE_CHANGE_LISTENER);
    }

    public static final SubLObject cyblack_internal_state_change_listener_transmit_state_change_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_state_change_listener_method = NIL;
            SubLObject last_contents = get_cyblack_basic_state_change_listener_last_contents(self);
            SubLObject last_event_type = get_cyblack_basic_state_change_listener_last_event_type(self);
            SubLObject knowledge_source = get_cyblack_basic_state_change_listener_knowledge_source(self);
            try {
                try {
                    format(T, $str_alt59$__State_Change_Monitored_by__S, knowledge_source);
                    format(T, $str_alt60$____Event_Type___S, last_event_type);
                    format(T, $str_alt61$____Contents___S__, last_contents);
                    force_output(T);
                    sublisp_throw($sym58$OUTER_CATCH_FOR_CYBLACK_INTERNAL_STATE_CHANGE_LISTENER_METHOD, T);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_state_change_listener_last_contents(self, last_contents);
                            set_cyblack_basic_state_change_listener_last_event_type(self, last_event_type);
                            set_cyblack_basic_state_change_listener_knowledge_source(self, knowledge_source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_state_change_listener_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_CYBLACK_INTERNAL_STATE_CHANGE_LISTENER_METHOD);
            }
            return catch_var_for_cyblack_internal_state_change_listener_method;
        }
    }

    public static final SubLObject get_cyblack_external_state_change_listener_cached_external_module(SubLObject cyblack_external_state_change_listener) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_state_change_listener, EIGHT_INTEGER, CACHED_EXTERNAL_MODULE);
    }

    public static final SubLObject set_cyblack_external_state_change_listener_cached_external_module(SubLObject cyblack_external_state_change_listener, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_state_change_listener, value, EIGHT_INTEGER, CACHED_EXTERNAL_MODULE);
    }

    public static final SubLObject get_cyblack_external_state_change_listener_cached_external_connection(SubLObject cyblack_external_state_change_listener) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_state_change_listener, SEVEN_INTEGER, CACHED_EXTERNAL_CONNECTION);
    }

    public static final SubLObject set_cyblack_external_state_change_listener_cached_external_connection(SubLObject cyblack_external_state_change_listener, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_state_change_listener, value, SEVEN_INTEGER, CACHED_EXTERNAL_CONNECTION);
    }

    public static final SubLObject get_cyblack_external_state_change_listener_cached_message_broker(SubLObject cyblack_external_state_change_listener) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_state_change_listener, SIX_INTEGER, CACHED_MESSAGE_BROKER);
    }

    public static final SubLObject set_cyblack_external_state_change_listener_cached_message_broker(SubLObject cyblack_external_state_change_listener, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_state_change_listener, value, SIX_INTEGER, CACHED_MESSAGE_BROKER);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_state_change_listener_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_state_change_listener_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, LAST_EVENT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, LAST_CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, CACHED_MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, CACHED_EXTERNAL_CONNECTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, CACHED_EXTERNAL_MODULE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_external_state_change_listener_p(SubLObject cyblack_external_state_change_listener) {
        return classes.subloop_instanceof_class(cyblack_external_state_change_listener, CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER);
    }

    public static final SubLObject cyblack_external_state_change_listener_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_state_change_listener_method = NIL;
            SubLObject cached_external_module = get_cyblack_external_state_change_listener_cached_external_module(self);
            SubLObject cached_external_connection = get_cyblack_external_state_change_listener_cached_external_connection(self);
            SubLObject cached_message_broker = get_cyblack_external_state_change_listener_cached_message_broker(self);
            try {
                try {
                    cyblack_basic_state_change_listener_initialize_method(self);
                    cached_message_broker = NIL;
                    cached_external_connection = NIL;
                    cached_external_module = NIL;
                    sublisp_throw($sym71$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_state_change_listener_cached_external_module(self, cached_external_module);
                            set_cyblack_external_state_change_listener_cached_external_connection(self, cached_external_connection);
                            set_cyblack_external_state_change_listener_cached_message_broker(self, cached_message_broker);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_state_change_listener_method = Errors.handleThrowable(ccatch_env_var, $sym71$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD);
            }
            return catch_var_for_cyblack_external_state_change_listener_method;
        }
    }

    public static final SubLObject cyblack_external_state_change_listener_on_startup_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_state_change_listener_method = NIL;
            SubLObject cached_external_module = get_cyblack_external_state_change_listener_cached_external_module(self);
            SubLObject cached_external_connection = get_cyblack_external_state_change_listener_cached_external_connection(self);
            SubLObject cached_message_broker = get_cyblack_external_state_change_listener_cached_message_broker(self);
            SubLObject knowledge_source = get_cyblack_basic_state_change_listener_knowledge_source(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    cyblack_object.cyblack_object_on_startup_method(self);
                    if (NIL == application) {
                        Errors.warn($str_alt76$_ON_STARTUP__S___No_application_i, self);
                        sublisp_throw($sym75$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD, NIL);
                    }
                    cached_message_broker = methods.funcall_instance_method_with_0_args(application, GET_MESSAGE_BROKER);
                    if (NIL == cached_message_broker) {
                        Errors.warn($str_alt78$_ON_STARTUP__S___No_message_broke, self, application);
                    }
                    cached_external_connection = methods.funcall_instance_method_with_0_args(application, GET_EXTERNAL_CONNECTION);
                    if (NIL == cached_external_connection) {
                        Errors.warn($str_alt80$_ON_STARTUP__S___No_external_conn, self, cached_external_connection);
                    }
                    if (NIL == knowledge_source) {
                        Errors.warn($str_alt81$_ON_STARTUP__S___No_knowledge_sou, self);
                        sublisp_throw($sym75$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD, NIL);
                    }
                    if (NIL == cyblack_ks.cyblack_external_knowledge_source_p(knowledge_source)) {
                        Errors.warn($str_alt82$_ON_STARTUP__S___The_knowledge_so, self, knowledge_source);
                    }
                    cached_external_module = cyblack_ks.cyblack_external_knowledge_source_get_external_knowledge_source_method(knowledge_source);
                    if (NIL == cached_external_module) {
                        Errors.warn($str_alt83$_ON_STARTUP__S___No_external_modu, self, knowledge_source);
                    }
                    sublisp_throw($sym75$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD, T);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_state_change_listener_cached_external_module(self, cached_external_module);
                            set_cyblack_external_state_change_listener_cached_external_connection(self, cached_external_connection);
                            set_cyblack_external_state_change_listener_cached_message_broker(self, cached_message_broker);
                            set_cyblack_basic_state_change_listener_knowledge_source(self, knowledge_source);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_state_change_listener_method = Errors.handleThrowable(ccatch_env_var, $sym75$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD);
            }
            return catch_var_for_cyblack_external_state_change_listener_method;
        }
    }

    public static final SubLObject cyblack_external_state_change_listener_on_shutdown_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_state_change_listener_method = NIL;
            SubLObject cached_external_module = get_cyblack_external_state_change_listener_cached_external_module(self);
            SubLObject cached_external_connection = get_cyblack_external_state_change_listener_cached_external_connection(self);
            SubLObject cached_message_broker = get_cyblack_external_state_change_listener_cached_message_broker(self);
            try {
                try {
                    cyblack_object.cyblack_object_on_shutdown_method(self);
                    cached_message_broker = NIL;
                    cached_external_connection = NIL;
                    cached_external_module = NIL;
                    sublisp_throw($sym87$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD, T);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_state_change_listener_cached_external_module(self, cached_external_module);
                            set_cyblack_external_state_change_listener_cached_external_connection(self, cached_external_connection);
                            set_cyblack_external_state_change_listener_cached_message_broker(self, cached_message_broker);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_state_change_listener_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD);
            }
            return catch_var_for_cyblack_external_state_change_listener_method;
        }
    }

    public static final SubLObject cyblack_external_state_change_listener_transmit_state_change_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_state_change_listener_method = NIL;
            SubLObject cached_external_module = get_cyblack_external_state_change_listener_cached_external_module(self);
            SubLObject cached_message_broker = get_cyblack_external_state_change_listener_cached_message_broker(self);
            SubLObject last_contents = get_cyblack_basic_state_change_listener_last_contents(self);
            SubLObject last_event_type = get_cyblack_basic_state_change_listener_last_event_type(self);
            SubLObject knowledge_source = get_cyblack_basic_state_change_listener_knowledge_source(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL == cached_message_broker) {
                        cached_message_broker = methods.funcall_instance_method_with_0_args(application, GET_MESSAGE_BROKER);
                    }
                    if (NIL == cached_external_module) {
                        cached_external_module = cyblack_ks.cyblack_external_knowledge_source_get_external_knowledge_source_method(knowledge_source);
                    }
                    cyblack_message_broker.cyblack_message_broker_state_change_method(cached_message_broker, cached_external_module, last_event_type, last_contents);
                    sublisp_throw($sym90$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD, T);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_state_change_listener_cached_external_module(self, cached_external_module);
                            set_cyblack_external_state_change_listener_cached_message_broker(self, cached_message_broker);
                            set_cyblack_basic_state_change_listener_last_contents(self, last_contents);
                            set_cyblack_basic_state_change_listener_last_event_type(self, last_event_type);
                            set_cyblack_basic_state_change_listener_knowledge_source(self, knowledge_source);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_state_change_listener_method = Errors.handleThrowable(ccatch_env_var, $sym90$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD);
            }
            return catch_var_for_cyblack_external_state_change_listener_method;
        }
    }

    public static final SubLObject declare_cyblack_state_change_listener_file() {
        declareFunction("cyblack_state_change_listener_p", "CYBLACK-STATE-CHANGE-LISTENER-P", 1, 0, false);
        declareFunction("get_cyblack_basic_state_change_listener_last_contents", "GET-CYBLACK-BASIC-STATE-CHANGE-LISTENER-LAST-CONTENTS", 1, 0, false);
        declareFunction("set_cyblack_basic_state_change_listener_last_contents", "SET-CYBLACK-BASIC-STATE-CHANGE-LISTENER-LAST-CONTENTS", 2, 0, false);
        declareFunction("get_cyblack_basic_state_change_listener_last_event_type", "GET-CYBLACK-BASIC-STATE-CHANGE-LISTENER-LAST-EVENT-TYPE", 1, 0, false);
        declareFunction("set_cyblack_basic_state_change_listener_last_event_type", "SET-CYBLACK-BASIC-STATE-CHANGE-LISTENER-LAST-EVENT-TYPE", 2, 0, false);
        declareFunction("get_cyblack_basic_state_change_listener_knowledge_source", "GET-CYBLACK-BASIC-STATE-CHANGE-LISTENER-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction("set_cyblack_basic_state_change_listener_knowledge_source", "SET-CYBLACK-BASIC-STATE-CHANGE-LISTENER-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_state_change_listener_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-STATE-CHANGE-LISTENER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_state_change_listener_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-STATE-CHANGE-LISTENER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_state_change_listener_p", "CYBLACK-BASIC-STATE-CHANGE-LISTENER-P", 1, 0, false);
        declareFunction("cyblack_basic_state_change_listener_initialize_method", "CYBLACK-BASIC-STATE-CHANGE-LISTENER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_state_change_listener_print_method", "CYBLACK-BASIC-STATE-CHANGE-LISTENER-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_state_change_listener_get_knowledge_source_method", "CYBLACK-BASIC-STATE-CHANGE-LISTENER-GET-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_state_change_listener_set_knowledge_source_method", "CYBLACK-BASIC-STATE-CHANGE-LISTENER-SET-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_state_change_listener_transmit_state_change_method", "CYBLACK-BASIC-STATE-CHANGE-LISTENER-TRANSMIT-STATE-CHANGE-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_state_change_listener_retransmit_last_state_change_method", "CYBLACK-BASIC-STATE-CHANGE-LISTENER-RETRANSMIT-LAST-STATE-CHANGE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_state_change_listener_transmit_state_change_internal_method", "CYBLACK-BASIC-STATE-CHANGE-LISTENER-TRANSMIT-STATE-CHANGE-INTERNAL-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_state_change_listener_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-STATE-CHANGE-LISTENER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_state_change_listener_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-STATE-CHANGE-LISTENER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_internal_state_change_listener_p", "CYBLACK-INTERNAL-STATE-CHANGE-LISTENER-P", 1, 0, false);
        declareFunction("cyblack_internal_state_change_listener_transmit_state_change_internal_method", "CYBLACK-INTERNAL-STATE-CHANGE-LISTENER-TRANSMIT-STATE-CHANGE-INTERNAL-METHOD", 1, 0, false);
        declareFunction("get_cyblack_external_state_change_listener_cached_external_module", "GET-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-CACHED-EXTERNAL-MODULE", 1, 0, false);
        declareFunction("set_cyblack_external_state_change_listener_cached_external_module", "SET-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-CACHED-EXTERNAL-MODULE", 2, 0, false);
        declareFunction("get_cyblack_external_state_change_listener_cached_external_connection", "GET-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-CACHED-EXTERNAL-CONNECTION", 1, 0, false);
        declareFunction("set_cyblack_external_state_change_listener_cached_external_connection", "SET-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-CACHED-EXTERNAL-CONNECTION", 2, 0, false);
        declareFunction("get_cyblack_external_state_change_listener_cached_message_broker", "GET-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-CACHED-MESSAGE-BROKER", 1, 0, false);
        declareFunction("set_cyblack_external_state_change_listener_cached_message_broker", "SET-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-CACHED-MESSAGE-BROKER", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_state_change_listener_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_state_change_listener_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_external_state_change_listener_p", "CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-P", 1, 0, false);
        declareFunction("cyblack_external_state_change_listener_initialize_method", "CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_state_change_listener_on_startup_method", "CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_external_state_change_listener_on_shutdown_method", "CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_external_state_change_listener_transmit_state_change_internal_method", "CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-TRANSMIT-STATE-CHANGE-INTERNAL-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_state_change_listener_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_state_change_listener_file() {
                interfaces.new_interface(CYBLACK_STATE_CHANGE_LISTENER, $list_alt1, $list_alt2, $list_alt3);
        classes.subloop_new_class(CYBLACK_BASIC_STATE_CHANGE_LISTENER, CYBLACK_OBJECT, $list_alt6, NIL, $list_alt7);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_STATE_CHANGE_LISTENER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_STATE_CHANGE_LISTENER, $sym13$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_STATE_CHANGE_LISTENER_C);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_STATE_CHANGE_LISTENER, $sym18$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_STATE_CHANGE_LISTENER_I);
        subloop_reserved_initialize_cyblack_basic_state_change_listener_class(CYBLACK_BASIC_STATE_CHANGE_LISTENER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_STATE_CHANGE_LISTENER, $list_alt20, NIL, $list_alt21);
        methods.subloop_register_instance_method(CYBLACK_BASIC_STATE_CHANGE_LISTENER, INITIALIZE, CYBLACK_BASIC_STATE_CHANGE_LISTENER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_STATE_CHANGE_LISTENER, $list_alt25, $list_alt26, $list_alt27);
        methods.subloop_register_instance_method(CYBLACK_BASIC_STATE_CHANGE_LISTENER, PRINT, CYBLACK_BASIC_STATE_CHANGE_LISTENER_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_STATE_CHANGE_LISTENER, $list_alt25, NIL, $list_alt34);
        methods.subloop_register_instance_method(CYBLACK_BASIC_STATE_CHANGE_LISTENER, GET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_STATE_CHANGE_LISTENER_GET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(SET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_STATE_CHANGE_LISTENER, $list_alt25, $list_alt38, $list_alt39);
        methods.subloop_register_instance_method(CYBLACK_BASIC_STATE_CHANGE_LISTENER, SET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_STATE_CHANGE_LISTENER_SET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(TRANSMIT_STATE_CHANGE, CYBLACK_BASIC_STATE_CHANGE_LISTENER, $list_alt43, $list_alt44, $list_alt45);
        methods.subloop_register_instance_method(CYBLACK_BASIC_STATE_CHANGE_LISTENER, TRANSMIT_STATE_CHANGE, CYBLACK_BASIC_STATE_CHANGE_LISTENER_TRANSMIT_STATE_CHANGE_METHOD);
        methods.methods_incorporate_instance_method(RETRANSMIT_LAST_STATE_CHANGE, CYBLACK_BASIC_STATE_CHANGE_LISTENER, $list_alt25, NIL, $list_alt49);
        methods.subloop_register_instance_method(CYBLACK_BASIC_STATE_CHANGE_LISTENER, RETRANSMIT_LAST_STATE_CHANGE, $sym50$CYBLACK_BASIC_STATE_CHANGE_LISTENER_RETRANSMIT_LAST_STATE_CHANGE_);
        methods.methods_incorporate_instance_method(TRANSMIT_STATE_CHANGE_INTERNAL, CYBLACK_BASIC_STATE_CHANGE_LISTENER, $list_alt20, NIL, $list_alt51);
        methods.subloop_register_instance_method(CYBLACK_BASIC_STATE_CHANGE_LISTENER, TRANSMIT_STATE_CHANGE_INTERNAL, $sym52$CYBLACK_BASIC_STATE_CHANGE_LISTENER_TRANSMIT_STATE_CHANGE_INTERNA);
        classes.subloop_new_class(CYBLACK_INTERNAL_STATE_CHANGE_LISTENER, CYBLACK_BASIC_STATE_CHANGE_LISTENER, NIL, NIL, $list_alt54);
        classes.class_set_implements_slot_listeners(CYBLACK_INTERNAL_STATE_CHANGE_LISTENER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_INTERNAL_STATE_CHANGE_LISTENER, $sym55$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_STATE_CHANGE_LISTENE);
        classes.subloop_note_instance_initialization_function(CYBLACK_INTERNAL_STATE_CHANGE_LISTENER, $sym56$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_STATE_CHANGE_LISTENE);
        subloop_reserved_initialize_cyblack_internal_state_change_listener_class(CYBLACK_INTERNAL_STATE_CHANGE_LISTENER);
        methods.methods_incorporate_instance_method(TRANSMIT_STATE_CHANGE_INTERNAL, CYBLACK_INTERNAL_STATE_CHANGE_LISTENER, $list_alt20, NIL, $list_alt57);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_STATE_CHANGE_LISTENER, TRANSMIT_STATE_CHANGE_INTERNAL, $sym62$CYBLACK_INTERNAL_STATE_CHANGE_LISTENER_TRANSMIT_STATE_CHANGE_INTE);
        classes.subloop_new_class(CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, CYBLACK_BASIC_STATE_CHANGE_LISTENER, NIL, NIL, $list_alt64);
        classes.class_set_implements_slot_listeners(CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, $sym68$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENE);
        classes.subloop_note_instance_initialization_function(CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, $sym69$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENE);
        subloop_reserved_initialize_cyblack_external_state_change_listener_class(CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, $list_alt20, NIL, $list_alt70);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, INITIALIZE, CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, $list_alt25, NIL, $list_alt74);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, ON_STARTUP, CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, $list_alt25, NIL, $list_alt86);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, ON_SHUTDOWN, CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(TRANSMIT_STATE_CHANGE_INTERNAL, CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, $list_alt20, NIL, $list_alt89);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER, TRANSMIT_STATE_CHANGE_INTERNAL, $sym91$CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_TRANSMIT_STATE_CHANGE_INTE);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_STATE_CHANGE_LISTENER = makeSymbol("CYBLACK-STATE-CHANGE-LISTENER");

    static private final SubLList $list_alt1 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt3 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSMIT-STATE-CHANGE"), list(makeSymbol("EVENT-TYPE"), makeSymbol("CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRANSMIT-LAST-STATE-CHANGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSMIT-STATE-CHANGE-INTERNAL"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol CYBLACK_BASIC_STATE_CHANGE_LISTENER = makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER");



    static private final SubLList $list_alt6 = list(makeSymbol("CYBLACK-STATE-CHANGE-LISTENER"));

    static private final SubLList $list_alt7 = list(new SubLObject[]{ list(makeSymbol("KNOWLEDGE-SOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-EVENT-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LAST-CONTENTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KNOWLEDGE-SOURCE"), list(makeSymbol("NEW-KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSMIT-STATE-CHANGE"), list(makeSymbol("EVENT-TYPE"), makeSymbol("CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRANSMIT-LAST-STATE-CHANGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSMIT-STATE-CHANGE-INTERNAL"), NIL, makeKeyword("PROTECTED")) });



    private static final SubLSymbol LAST_EVENT_TYPE = makeSymbol("LAST-EVENT-TYPE");







    static private final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_STATE_CHANGE_LISTENER_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-STATE-CHANGE-LISTENER-CLASS");









    static private final SubLSymbol $sym18$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_STATE_CHANGE_LISTENER_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-STATE-CHANGE-LISTENER-INSTANCE");



    static private final SubLList $list_alt20 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt21 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("LAST-EVENT-TYPE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("LAST-CONTENTS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym22$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-STATE-CHANGE-LISTENER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_STATE_CHANGE_LISTENER_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER-INITIALIZE-METHOD");



    static private final SubLList $list_alt25 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt26 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt27 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<STATE-CHANGE-LISTENER: APP=~S; KS=~S>"), list(makeSymbol("FIF"), makeSymbol("APPLICATION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-APPLICATION-NAME"))), NIL), list(makeSymbol("FIF"), makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("FIF"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE"), list(QUOTE, makeSymbol("GET-NAME"))), makeSymbol("KNOWLEDGE-SOURCE")), NIL)), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym28$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-STATE-CHANGE-LISTENER-METHOD");

    static private final SubLString $str_alt29$__STATE_CHANGE_LISTENER__APP__S__ = makeString("#<STATE-CHANGE-LISTENER: APP=~S; KS=~S>");





    private static final SubLSymbol CYBLACK_BASIC_STATE_CHANGE_LISTENER_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER-PRINT-METHOD");



    static private final SubLList $list_alt34 = list(list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym35$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-STATE-CHANGE-LISTENER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_STATE_CHANGE_LISTENER_GET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER-GET-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt38 = list(makeSymbol("NEW-KNOWLEDGE-SOURCE"));

    static private final SubLList $list_alt39 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("NEW-KNOWLEDGE-SOURCE"))), makeString("(SET-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(RET, makeSymbol("NEW-KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym40$OUTER_CATCH_FOR_CYBLACK_BASIC_STATE_CHANGE_LISTENER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-STATE-CHANGE-LISTENER-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_STATE_CHANGE_LISTENER_SET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER-SET-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt43 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt44 = list(makeSymbol("EVENT-TYPE"), makeSymbol("CONTENTS"));

    static private final SubLList $list_alt45 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-EVENT-TYPE-P"), makeSymbol("EVENT-TYPE")), makeString("(TRANSMIT-STATE-CHANGE ~S): ~S is not a member of the CYBLACK-EVENT-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("EVENT-TYPE")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("CONTENTS")), makeString("(TRANSMIT-STATE-CHANGE ~S): ~S is not a list.  The contents of a state change must be a list."), makeSymbol("SELF"), makeSymbol("CONTENTS")), list(makeSymbol("CSETQ"), makeSymbol("LAST-EVENT-TYPE"), makeSymbol("EVENT-TYPE")), list(makeSymbol("CSETQ"), makeSymbol("LAST-CONTENTS"), makeSymbol("CONTENTS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TRANSMIT-STATE-CHANGE-INTERNAL"))), list(RET, NIL));



    private static final SubLSymbol CYBLACK_BASIC_STATE_CHANGE_LISTENER_TRANSMIT_STATE_CHANGE_METHOD = makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER-TRANSMIT-STATE-CHANGE-METHOD");

    private static final SubLSymbol RETRANSMIT_LAST_STATE_CHANGE = makeSymbol("RETRANSMIT-LAST-STATE-CHANGE");

    static private final SubLList $list_alt49 = list(list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TRANSMIT-STATE-CHANGE-INTERNAL")))));

    static private final SubLSymbol $sym50$CYBLACK_BASIC_STATE_CHANGE_LISTENER_RETRANSMIT_LAST_STATE_CHANGE_ = makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER-RETRANSMIT-LAST-STATE-CHANGE-METHOD");

    static private final SubLList $list_alt51 = list(list(RET, NIL));

    static private final SubLSymbol $sym52$CYBLACK_BASIC_STATE_CHANGE_LISTENER_TRANSMIT_STATE_CHANGE_INTERNA = makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER-TRANSMIT-STATE-CHANGE-INTERNAL-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_STATE_CHANGE_LISTENER = makeSymbol("CYBLACK-INTERNAL-STATE-CHANGE-LISTENER");

    static private final SubLList $list_alt54 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSMIT-STATE-CHANGE-INTERNAL"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym55$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_STATE_CHANGE_LISTENE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-STATE-CHANGE-LISTENER-CLASS");

    static private final SubLSymbol $sym56$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_STATE_CHANGE_LISTENE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-STATE-CHANGE-LISTENER-INSTANCE");

    static private final SubLList $list_alt57 = list(list(makeSymbol("FORMAT"), T, makeString("~%State Change Monitored by ~S"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("FORMAT"), T, makeString("~%  Event Type: ~S"), makeSymbol("LAST-EVENT-TYPE")), list(makeSymbol("FORMAT"), T, makeString("~%  Contents: ~S~%"), makeSymbol("LAST-CONTENTS")), list(makeSymbol("FORCE-OUTPUT"), T), list(RET, T));

    static private final SubLSymbol $sym58$OUTER_CATCH_FOR_CYBLACK_INTERNAL_STATE_CHANGE_LISTENER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-STATE-CHANGE-LISTENER-METHOD");

    static private final SubLString $str_alt59$__State_Change_Monitored_by__S = makeString("~%State Change Monitored by ~S");

    static private final SubLString $str_alt60$____Event_Type___S = makeString("~%  Event Type: ~S");

    static private final SubLString $str_alt61$____Contents___S__ = makeString("~%  Contents: ~S~%");

    static private final SubLSymbol $sym62$CYBLACK_INTERNAL_STATE_CHANGE_LISTENER_TRANSMIT_STATE_CHANGE_INTE = makeSymbol("CYBLACK-INTERNAL-STATE-CHANGE-LISTENER-TRANSMIT-STATE-CHANGE-INTERNAL-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER = makeSymbol("CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER");

    static private final SubLList $list_alt64 = list(list(makeSymbol("CACHED-MESSAGE-BROKER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CACHED-EXTERNAL-CONNECTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CACHED-EXTERNAL-MODULE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSMIT-STATE-CHANGE-INTERNAL"), NIL, makeKeyword("PROTECTED")));







    static private final SubLSymbol $sym68$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-CLASS");

    static private final SubLSymbol $sym69$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-INSTANCE");

    static private final SubLList $list_alt70 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CACHED-MESSAGE-BROKER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CACHED-EXTERNAL-CONNECTION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CACHED-EXTERNAL-MODULE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym71$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_INITIALIZE_METHOD = makeSymbol("CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-INITIALIZE-METHOD");



    static private final SubLList $list_alt74 = list(new SubLObject[]{ list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("PUNLESS"), makeSymbol("APPLICATION"), list(makeSymbol("WARN"), makeString("(ON-STARTUP ~S): No application is associated with this state change listener."), makeSymbol("SELF")), list(RET, NIL)), list(makeSymbol("CSETQ"), makeSymbol("CACHED-MESSAGE-BROKER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-MESSAGE-BROKER")))), list(makeSymbol("PUNLESS"), makeSymbol("CACHED-MESSAGE-BROKER"), list(makeSymbol("WARN"), makeString("(ON-STARTUP ~S): No message broker is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION"))), list(makeSymbol("CSETQ"), makeSymbol("CACHED-EXTERNAL-CONNECTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-EXTERNAL-CONNECTION")))), list(makeSymbol("PUNLESS"), makeSymbol("CACHED-EXTERNAL-CONNECTION"), list(makeSymbol("WARN"), makeString("(ON-STARTUP ~S): No external connection is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("CACHED-EXTERNAL-CONNECTION"))), list(makeSymbol("PUNLESS"), makeSymbol("KNOWLEDGE-SOURCE"), list(makeSymbol("WARN"), makeString("(ON-STARTUP ~S): No knowledge source is associated with this state change listener."), makeSymbol("SELF")), list(RET, NIL)), list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("KNOWLEDGE-SOURCE")), list(makeSymbol("WARN"), makeString("(ON-STARTUP ~S): The knowledge source ~S is not an external knowledge source."), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE"))), list(makeSymbol("CSETQ"), makeSymbol("CACHED-EXTERNAL-MODULE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("KNOWLEDGE-SOURCE"))), list(makeSymbol("PUNLESS"), makeSymbol("CACHED-EXTERNAL-MODULE"), list(makeSymbol("WARN"), makeString("(ON-STARTUP ~S): No external module is associated with external knowledge source ~S."), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE"))), list(RET, T) });

    static private final SubLSymbol $sym75$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-METHOD");

    static private final SubLString $str_alt76$_ON_STARTUP__S___No_application_i = makeString("(ON-STARTUP ~S): No application is associated with this state change listener.");



    static private final SubLString $str_alt78$_ON_STARTUP__S___No_message_broke = makeString("(ON-STARTUP ~S): No message broker is associated with the application ~S.");



    static private final SubLString $str_alt80$_ON_STARTUP__S___No_external_conn = makeString("(ON-STARTUP ~S): No external connection is associated with the application ~S.");

    static private final SubLString $str_alt81$_ON_STARTUP__S___No_knowledge_sou = makeString("(ON-STARTUP ~S): No knowledge source is associated with this state change listener.");

    static private final SubLString $str_alt82$_ON_STARTUP__S___The_knowledge_so = makeString("(ON-STARTUP ~S): The knowledge source ~S is not an external knowledge source.");

    static private final SubLString $str_alt83$_ON_STARTUP__S___No_external_modu = makeString("(ON-STARTUP ~S): No external module is associated with external knowledge source ~S.");

    private static final SubLSymbol CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_ON_STARTUP_METHOD = makeSymbol("CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-ON-STARTUP-METHOD");



    static private final SubLList $list_alt86 = list(list(makeSymbol("ON-SHUTDOWN"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CACHED-MESSAGE-BROKER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CACHED-EXTERNAL-CONNECTION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CACHED-EXTERNAL-MODULE"), NIL), list(RET, T));

    static private final SubLSymbol $sym87$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-ON-SHUTDOWN-METHOD");

    static private final SubLList $list_alt89 = list(list(makeSymbol("PUNLESS"), makeSymbol("CACHED-MESSAGE-BROKER"), list(makeSymbol("CSETQ"), makeSymbol("CACHED-MESSAGE-BROKER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-MESSAGE-BROKER"))))), list(makeSymbol("PUNLESS"), makeSymbol("CACHED-EXTERNAL-MODULE"), list(makeSymbol("CSETQ"), makeSymbol("CACHED-EXTERNAL-MODULE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("KNOWLEDGE-SOURCE")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("STATE-CHANGE"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("CACHED-MESSAGE-BROKER"), makeSymbol("CACHED-EXTERNAL-MODULE"), makeSymbol("LAST-EVENT-TYPE"), makeSymbol("LAST-CONTENTS")), list(RET, T));

    static private final SubLSymbol $sym90$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-METHOD");

    static private final SubLSymbol $sym91$CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER_TRANSMIT_STATE_CHANGE_INTE = makeSymbol("CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-TRANSMIT-STATE-CHANGE-INTERNAL-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_state_change_listener_file();
    }

    public void initializeVariables() {
        init_cyblack_state_change_listener_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_state_change_listener_file();
    }
}

