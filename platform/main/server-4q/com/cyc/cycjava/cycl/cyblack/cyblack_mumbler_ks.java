/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-MUMBLER-KS
 *  source file: /cyc/top/cycl/cyblack/cyblack-mumbler-ks.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_mumbler_ks extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_mumbler_ks() {
    }

    public static final SubLFile me = new cyblack_mumbler_ks();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_mumbler_ks";

    // // Definitions
    public static final SubLObject get_cyblack_rkf_tool_queue_manager_most_recent_source(SubLObject cyblack_rkf_tool_queue_manager) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_rkf_tool_queue_manager, SEVEN_INTEGER, MOST_RECENT_SOURCE);
    }

    public static final SubLObject set_cyblack_rkf_tool_queue_manager_most_recent_source(SubLObject cyblack_rkf_tool_queue_manager, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_rkf_tool_queue_manager, value, SEVEN_INTEGER, MOST_RECENT_SOURCE);
    }

    public static final SubLObject get_cyblack_rkf_tool_queue_manager_queues_by_source(SubLObject cyblack_rkf_tool_queue_manager) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_rkf_tool_queue_manager, SIX_INTEGER, QUEUES_BY_SOURCE);
    }

    public static final SubLObject set_cyblack_rkf_tool_queue_manager_queues_by_source(SubLObject cyblack_rkf_tool_queue_manager, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_rkf_tool_queue_manager, value, SIX_INTEGER, QUEUES_BY_SOURCE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_rkf_tool_queue_manager_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_rkf_tool_queue_manager_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, LAST_EVENT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, LAST_CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RKF_TOOL_QUEUE_MANAGER, QUEUES_BY_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RKF_TOOL_QUEUE_MANAGER, MOST_RECENT_SOURCE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_rkf_tool_queue_manager_p(SubLObject cyblack_rkf_tool_queue_manager) {
        return classes.subloop_instanceof_class(cyblack_rkf_tool_queue_manager, CYBLACK_RKF_TOOL_QUEUE_MANAGER);
    }

    public static final SubLObject cyblack_rkf_tool_queue_manager_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_rkf_tool_queue_manager_method = NIL;
            SubLObject queues_by_source = get_cyblack_rkf_tool_queue_manager_queues_by_source(self);
            try {
                try {
                    cyblack_state_change_listener.cyblack_basic_state_change_listener_initialize_method(self);
                    queues_by_source = make_hash_table($int$25, symbol_function(EQUAL), UNPROVIDED);
                    sublisp_throw($sym21$OUTER_CATCH_FOR_CYBLACK_RKF_TOOL_QUEUE_MANAGER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_rkf_tool_queue_manager_queues_by_source(self, queues_by_source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_rkf_tool_queue_manager_method = Errors.handleThrowable(ccatch_env_var, $sym21$OUTER_CATCH_FOR_CYBLACK_RKF_TOOL_QUEUE_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_rkf_tool_queue_manager_method;
        }
    }

    public static final SubLObject cyblack_rkf_tool_queue_manager_enqueue_by_source_method(SubLObject self, SubLObject rkf_event_posting) {
        {
            SubLObject catch_var_for_cyblack_rkf_tool_queue_manager_method = NIL;
            SubLObject most_recent_source = get_cyblack_rkf_tool_queue_manager_most_recent_source(self);
            SubLObject queues_by_source = get_cyblack_rkf_tool_queue_manager_queues_by_source(self);
            try {
                try {
                    cyblack_utilities.cyblack_silence(self);
                    {
                        SubLObject source = cyblack_cyc_event_model.cyblack_cem_event_root_posting_get_source_method(rkf_event_posting);
                        SubLObject queue = gethash(source, queues_by_source, UNPROVIDED);
                        most_recent_source = source;
                        if (NIL == queue) {
                            queue = object.new_class_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
                            sethash(source, queues_by_source, queue);
                        }
                        subloop_queues.asynch_basic_doubly_linked_queue_enqueue_method(queue, rkf_event_posting);
                        sublisp_throw($sym27$OUTER_CATCH_FOR_CYBLACK_RKF_TOOL_QUEUE_MANAGER_METHOD, rkf_event_posting);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_rkf_tool_queue_manager_most_recent_source(self, most_recent_source);
                            set_cyblack_rkf_tool_queue_manager_queues_by_source(self, queues_by_source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_rkf_tool_queue_manager_method = Errors.handleThrowable(ccatch_env_var, $sym27$OUTER_CATCH_FOR_CYBLACK_RKF_TOOL_QUEUE_MANAGER_METHOD);
            }
            return catch_var_for_cyblack_rkf_tool_queue_manager_method;
        }
    }

    public static final SubLObject cyblack_rkf_tool_queue_manager_transmit_state_change_internal_method(SubLObject self) {
        {
            SubLObject last_contents = cyblack_state_change_listener.get_cyblack_basic_state_change_listener_last_contents(self);
            if (NIL != last_contents) {
                {
                    SubLObject posting = last_contents.first();
                    if (NIL != cyblack_rkf_events.cyblack_rkf_base_event_posting_p(posting)) {
                        cyblack_rkf_tool_queue_manager_enqueue_by_source_method(self, posting);
                        return posting;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_rkf_tool_queue_manager_get_most_recent_source_method(SubLObject self) {
        {
            SubLObject most_recent_source = get_cyblack_rkf_tool_queue_manager_most_recent_source(self);
            return most_recent_source;
        }
    }

    public static final SubLObject cyblack_rkf_tool_queue_manager_get_next_method(SubLObject self, SubLObject source) {
        if (source == UNPROVIDED) {
            source = NIL;
        }
        {
            SubLObject most_recent_source = get_cyblack_rkf_tool_queue_manager_most_recent_source(self);
            SubLObject queues_by_source = get_cyblack_rkf_tool_queue_manager_queues_by_source(self);
            if (NIL == source) {
                source = most_recent_source;
            }
            if (NIL == source) {
                return NIL;
            }
            {
                SubLObject queue = gethash(source, queues_by_source, UNPROVIDED);
                if (NIL != queue) {
                    if (NIL == subloop_queues.basic_doubly_linked_queue_empty_p_method(queue)) {
                        return subloop_queues.asynch_basic_doubly_linked_queue_dequeue_method(queue);
                    }
                }
            }
            return NIL;
        }
    }

    // defparameter
    private static final SubLSymbol $cyblack_rkf_mumbler_queue_manager$ = makeSymbol("*CYBLACK-RKF-MUMBLER-QUEUE-MANAGER*");

    public static final SubLObject subloop_reserved_initialize_cyblack_rkf_mumbler_queue_manager_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_rkf_mumbler_queue_manager_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, LAST_EVENT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_STATE_CHANGE_LISTENER, LAST_CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RKF_TOOL_QUEUE_MANAGER, QUEUES_BY_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RKF_TOOL_QUEUE_MANAGER, MOST_RECENT_SOURCE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_rkf_mumbler_queue_manager_p(SubLObject cyblack_rkf_mumbler_queue_manager) {
        return classes.subloop_instanceof_class(cyblack_rkf_mumbler_queue_manager, CYBLACK_RKF_MUMBLER_QUEUE_MANAGER);
    }

    public static final SubLObject cyblack_rkf_mumbler_queue_manager_initialize_method(SubLObject self) {
        cyblack_rkf_tool_queue_manager_initialize_method(self);
        $cyblack_rkf_mumbler_queue_manager$.setDynamicValue(self);
        return self;
    }

    public static final SubLObject get_cyblack_rkf_mumbler_queue_manager() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $cyblack_rkf_mumbler_queue_manager$.getDynamicValue(thread);
        }
    }

    public static final SubLObject get_next_mumbler_posting(SubLObject source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $cyblack_rkf_mumbler_queue_manager$.getDynamicValue(thread)) {
                return cyblack_rkf_tool_queue_manager_get_next_method($cyblack_rkf_mumbler_queue_manager$.getDynamicValue(thread), source);
            }
            return NIL;
        }
    }

    public static final SubLObject get_next_mumbler_message(SubLObject source) {
        {
            SubLObject next_posting = get_next_mumbler_posting(source);
            if (NIL != next_posting) {
                return cyblack_cyc_event_model.cyblack_cem_event_root_posting_get_message_method(next_posting);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_mumbler_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_mumbler_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_MONITORING_KS, ACTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_MONITORING_KS, ACTION_QUALIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_MONITORING_KS, STATE_CHANGE_LISTENER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_MONITORING_KS, STATE_CHANGE_LISTENER, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_mumbler_ks_p(SubLObject v_cyblack_mumbler_ks) {
        return classes.subloop_instanceof_class(v_cyblack_mumbler_ks, CYBLACK_MUMBLER_KS);
    }

    public static final SubLObject cyblack_mumbler_ks_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_mumbler_ks_method = NIL;
            SubLObject state_change_listener_class = cyblack_ks.get_cyblack_internal_monitoring_ks_state_change_listener_class(self);
            try {
                try {
                    cyblack_ks.cyblack_internal_monitoring_ks_initialize_method(self);
                    state_change_listener_class = CYBLACK_RKF_MUMBLER_QUEUE_MANAGER;
                    cyblack_ks.cyblack_internal_monitoring_ks_set_precondition_pattern_method(self, copy_tree($list_alt83));
                    sublisp_throw($sym82$OUTER_CATCH_FOR_CYBLACK_MUMBLER_KS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_ks.set_cyblack_internal_monitoring_ks_state_change_listener_class(self, state_change_listener_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_mumbler_ks_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_CYBLACK_MUMBLER_KS_METHOD);
            }
            return catch_var_for_cyblack_mumbler_ks_method;
        }
    }

    public static final SubLObject declare_cyblack_mumbler_ks_file() {
        declareFunction("get_cyblack_rkf_tool_queue_manager_most_recent_source", "GET-CYBLACK-RKF-TOOL-QUEUE-MANAGER-MOST-RECENT-SOURCE", 1, 0, false);
        declareFunction("set_cyblack_rkf_tool_queue_manager_most_recent_source", "SET-CYBLACK-RKF-TOOL-QUEUE-MANAGER-MOST-RECENT-SOURCE", 2, 0, false);
        declareFunction("get_cyblack_rkf_tool_queue_manager_queues_by_source", "GET-CYBLACK-RKF-TOOL-QUEUE-MANAGER-QUEUES-BY-SOURCE", 1, 0, false);
        declareFunction("set_cyblack_rkf_tool_queue_manager_queues_by_source", "SET-CYBLACK-RKF-TOOL-QUEUE-MANAGER-QUEUES-BY-SOURCE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_rkf_tool_queue_manager_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-TOOL-QUEUE-MANAGER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_rkf_tool_queue_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-TOOL-QUEUE-MANAGER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_rkf_tool_queue_manager_p", "CYBLACK-RKF-TOOL-QUEUE-MANAGER-P", 1, 0, false);
        declareFunction("cyblack_rkf_tool_queue_manager_initialize_method", "CYBLACK-RKF-TOOL-QUEUE-MANAGER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_rkf_tool_queue_manager_enqueue_by_source_method", "CYBLACK-RKF-TOOL-QUEUE-MANAGER-ENQUEUE-BY-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_rkf_tool_queue_manager_transmit_state_change_internal_method", "CYBLACK-RKF-TOOL-QUEUE-MANAGER-TRANSMIT-STATE-CHANGE-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_rkf_tool_queue_manager_get_most_recent_source_method", "CYBLACK-RKF-TOOL-QUEUE-MANAGER-GET-MOST-RECENT-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_rkf_tool_queue_manager_get_next_method", "CYBLACK-RKF-TOOL-QUEUE-MANAGER-GET-NEXT-METHOD", 1, 1, false);
        declareFunction("subloop_reserved_initialize_cyblack_rkf_mumbler_queue_manager_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-MUMBLER-QUEUE-MANAGER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_rkf_mumbler_queue_manager_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-MUMBLER-QUEUE-MANAGER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_rkf_mumbler_queue_manager_p", "CYBLACK-RKF-MUMBLER-QUEUE-MANAGER-P", 1, 0, false);
        declareFunction("cyblack_rkf_mumbler_queue_manager_initialize_method", "CYBLACK-RKF-MUMBLER-QUEUE-MANAGER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_rkf_mumbler_queue_manager", "GET-CYBLACK-RKF-MUMBLER-QUEUE-MANAGER", 0, 0, false);
        declareFunction("get_next_mumbler_posting", "GET-NEXT-MUMBLER-POSTING", 1, 0, false);
        declareFunction("get_next_mumbler_message", "GET-NEXT-MUMBLER-MESSAGE", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_mumbler_ks_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MUMBLER-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_mumbler_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MUMBLER-KS-INSTANCE", 1, 0, false);
        declareFunction("cyblack_mumbler_ks_p", "CYBLACK-MUMBLER-KS-P", 1, 0, false);
        declareFunction("cyblack_mumbler_ks_initialize_method", "CYBLACK-MUMBLER-KS-INITIALIZE-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_mumbler_ks_file() {
        defparameter("*CYBLACK-RKF-MUMBLER-QUEUE-MANAGER*", NIL);
        return NIL;
    }

    public static final SubLObject setup_cyblack_mumbler_ks_file() {
                classes.subloop_new_class(CYBLACK_RKF_TOOL_QUEUE_MANAGER, CYBLACK_INTERNAL_STATE_CHANGE_LISTENER, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_RKF_TOOL_QUEUE_MANAGER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_RKF_TOOL_QUEUE_MANAGER, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_TOOL_QUEUE_MANAGER_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_RKF_TOOL_QUEUE_MANAGER, $sym17$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_TOOL_QUEUE_MANAGER_INSTAN);
        subloop_reserved_initialize_cyblack_rkf_tool_queue_manager_class(CYBLACK_RKF_TOOL_QUEUE_MANAGER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_RKF_TOOL_QUEUE_MANAGER, $list_alt19, NIL, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_RKF_TOOL_QUEUE_MANAGER, INITIALIZE, CYBLACK_RKF_TOOL_QUEUE_MANAGER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE_BY_SOURCE, CYBLACK_RKF_TOOL_QUEUE_MANAGER, $list_alt19, $list_alt25, $list_alt26);
        methods.subloop_register_instance_method(CYBLACK_RKF_TOOL_QUEUE_MANAGER, ENQUEUE_BY_SOURCE, CYBLACK_RKF_TOOL_QUEUE_MANAGER_ENQUEUE_BY_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(TRANSMIT_STATE_CHANGE_INTERNAL, CYBLACK_RKF_TOOL_QUEUE_MANAGER, $list_alt31, NIL, $list_alt32);
        methods.subloop_register_instance_method(CYBLACK_RKF_TOOL_QUEUE_MANAGER, TRANSMIT_STATE_CHANGE_INTERNAL, $sym33$CYBLACK_RKF_TOOL_QUEUE_MANAGER_TRANSMIT_STATE_CHANGE_INTERNAL_MET);
        methods.methods_incorporate_instance_method(GET_MOST_RECENT_SOURCE, CYBLACK_RKF_TOOL_QUEUE_MANAGER, $list_alt35, NIL, $list_alt36);
        methods.subloop_register_instance_method(CYBLACK_RKF_TOOL_QUEUE_MANAGER, GET_MOST_RECENT_SOURCE, CYBLACK_RKF_TOOL_QUEUE_MANAGER_GET_MOST_RECENT_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_NEXT, CYBLACK_RKF_TOOL_QUEUE_MANAGER, $list_alt35, $list_alt39, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_RKF_TOOL_QUEUE_MANAGER, GET_NEXT, CYBLACK_RKF_TOOL_QUEUE_MANAGER_GET_NEXT_METHOD);
        classes.subloop_new_class(CYBLACK_RKF_MUMBLER_QUEUE_MANAGER, CYBLACK_RKF_TOOL_QUEUE_MANAGER, NIL, NIL, $list_alt43);
        classes.class_set_implements_slot_listeners(CYBLACK_RKF_MUMBLER_QUEUE_MANAGER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_RKF_MUMBLER_QUEUE_MANAGER, $sym44$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_MUMBLER_QUEUE_MANAGER_CLA);
        classes.subloop_note_instance_initialization_function(CYBLACK_RKF_MUMBLER_QUEUE_MANAGER, $sym45$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_MUMBLER_QUEUE_MANAGER_INS);
        subloop_reserved_initialize_cyblack_rkf_mumbler_queue_manager_class(CYBLACK_RKF_MUMBLER_QUEUE_MANAGER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_RKF_MUMBLER_QUEUE_MANAGER, $list_alt19, NIL, $list_alt46);
        methods.subloop_register_instance_method(CYBLACK_RKF_MUMBLER_QUEUE_MANAGER, INITIALIZE, CYBLACK_RKF_MUMBLER_QUEUE_MANAGER_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_MUMBLER_KS, CYBLACK_INTERNAL_MONITORING_KS, NIL, NIL, $list_alt43);
        classes.class_set_implements_slot_listeners(CYBLACK_MUMBLER_KS, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_MUMBLER_KS, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MUMBLER_KS_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_MUMBLER_KS, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MUMBLER_KS_INSTANCE);
        subloop_reserved_initialize_cyblack_mumbler_ks_class(CYBLACK_MUMBLER_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_MUMBLER_KS, $list_alt19, NIL, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_MUMBLER_KS, INITIALIZE, CYBLACK_MUMBLER_KS_INITIALIZE_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_RKF_TOOL_QUEUE_MANAGER = makeSymbol("CYBLACK-RKF-TOOL-QUEUE-MANAGER");

    private static final SubLSymbol CYBLACK_INTERNAL_STATE_CHANGE_LISTENER = makeSymbol("CYBLACK-INTERNAL-STATE-CHANGE-LISTENER");

    static private final SubLList $list_alt2 = list(list(makeSymbol("QUEUES-BY-SOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MOST-RECENT-SOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-BY-SOURCE"), list(makeSymbol("RKF-EVENT-POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSMIT-STATE-CHANGE-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MOST-RECENT-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NEXT"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("SOURCE"), NIL)), makeKeyword("PUBLIC")));

    private static final SubLSymbol MOST_RECENT_SOURCE = makeSymbol("MOST-RECENT-SOURCE");

    private static final SubLSymbol QUEUES_BY_SOURCE = makeSymbol("QUEUES-BY-SOURCE");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_TOOL_QUEUE_MANAGER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-TOOL-QUEUE-MANAGER-CLASS");











    private static final SubLSymbol CYBLACK_BASIC_STATE_CHANGE_LISTENER = makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER");



    private static final SubLSymbol LAST_EVENT_TYPE = makeSymbol("LAST-EVENT-TYPE");



    static private final SubLSymbol $sym17$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_TOOL_QUEUE_MANAGER_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-TOOL-QUEUE-MANAGER-INSTANCE");



    static private final SubLList $list_alt19 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt20 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("QUEUES-BY-SOURCE"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(25), list(makeSymbol("FUNCTION"), EQUAL))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym21$OUTER_CATCH_FOR_CYBLACK_RKF_TOOL_QUEUE_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-RKF-TOOL-QUEUE-MANAGER-METHOD");

    public static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLSymbol CYBLACK_RKF_TOOL_QUEUE_MANAGER_INITIALIZE_METHOD = makeSymbol("CYBLACK-RKF-TOOL-QUEUE-MANAGER-INITIALIZE-METHOD");

    private static final SubLSymbol ENQUEUE_BY_SOURCE = makeSymbol("ENQUEUE-BY-SOURCE");

    static private final SubLList $list_alt25 = list(makeSymbol("RKF-EVENT-POSTING"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-RKF-BASE-EVENT-POSTING-P"), makeSymbol("RKF-EVENT-POSTING")), makeString("(ENQUEUE-BY-SOURCE ~S): ~S is not an instance of CYBLACK-RKF-BASE-EVENT-POSTING."), makeSymbol("SELF"), makeSymbol("RKF-EVENT-POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("SOURCE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SOURCE"), makeSymbol("CYBLACK-RKF-BASE-EVENT-POSTING")), makeSymbol("RKF-EVENT-POSTING"))), list(makeSymbol("QUEUE"), list(makeSymbol("GETHASH"), makeSymbol("SOURCE"), makeSymbol("QUEUES-BY-SOURCE")))), list(makeSymbol("CSETQ"), makeSymbol("MOST-RECENT-SOURCE"), makeSymbol("SOURCE")), list(makeSymbol("PUNLESS"), makeSymbol("QUEUE"), list(makeSymbol("CSETQ"), makeSymbol("QUEUE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("CSETF"), list(makeSymbol("GETHASH"), makeSymbol("SOURCE"), makeSymbol("QUEUES-BY-SOURCE")), makeSymbol("QUEUE"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("QUEUE"), makeSymbol("RKF-EVENT-POSTING")), list(RET, makeSymbol("RKF-EVENT-POSTING"))));

    static private final SubLSymbol $sym27$OUTER_CATCH_FOR_CYBLACK_RKF_TOOL_QUEUE_MANAGER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-RKF-TOOL-QUEUE-MANAGER-METHOD");



    private static final SubLSymbol CYBLACK_RKF_TOOL_QUEUE_MANAGER_ENQUEUE_BY_SOURCE_METHOD = makeSymbol("CYBLACK-RKF-TOOL-QUEUE-MANAGER-ENQUEUE-BY-SOURCE-METHOD");



    static private final SubLList $list_alt31 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt32 = list(list(makeSymbol("PWHEN"), makeSymbol("LAST-CONTENTS"), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING"), list(makeSymbol("CAR"), makeSymbol("LAST-CONTENTS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-RKF-BASE-EVENT-POSTING-P"), makeSymbol("POSTING")), list(makeSymbol("ENQUEUE-BY-SOURCE"), makeSymbol("SELF"), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING"))))), list(RET, NIL));

    static private final SubLSymbol $sym33$CYBLACK_RKF_TOOL_QUEUE_MANAGER_TRANSMIT_STATE_CHANGE_INTERNAL_MET = makeSymbol("CYBLACK-RKF-TOOL-QUEUE-MANAGER-TRANSMIT-STATE-CHANGE-INTERNAL-METHOD");

    private static final SubLSymbol GET_MOST_RECENT_SOURCE = makeSymbol("GET-MOST-RECENT-SOURCE");

    static private final SubLList $list_alt35 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt36 = list(list(RET, makeSymbol("MOST-RECENT-SOURCE")));

    private static final SubLSymbol CYBLACK_RKF_TOOL_QUEUE_MANAGER_GET_MOST_RECENT_SOURCE_METHOD = makeSymbol("CYBLACK-RKF-TOOL-QUEUE-MANAGER-GET-MOST-RECENT-SOURCE-METHOD");

    private static final SubLSymbol GET_NEXT = makeSymbol("GET-NEXT");

    static private final SubLList $list_alt39 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("SOURCE"), NIL));

    static private final SubLList $list_alt40 = list(list(makeSymbol("PUNLESS"), makeSymbol("SOURCE"), list(makeSymbol("CSETQ"), makeSymbol("SOURCE"), makeSymbol("MOST-RECENT-SOURCE"))), list(makeSymbol("PUNLESS"), makeSymbol("SOURCE"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("QUEUE"), list(makeSymbol("GETHASH"), makeSymbol("SOURCE"), makeSymbol("QUEUES-BY-SOURCE")))), list(makeSymbol("PWHEN"), makeSymbol("QUEUE"), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("QUEUE")), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("QUEUE")))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_RKF_TOOL_QUEUE_MANAGER_GET_NEXT_METHOD = makeSymbol("CYBLACK-RKF-TOOL-QUEUE-MANAGER-GET-NEXT-METHOD");

    private static final SubLSymbol CYBLACK_RKF_MUMBLER_QUEUE_MANAGER = makeSymbol("CYBLACK-RKF-MUMBLER-QUEUE-MANAGER");

    static private final SubLList $list_alt43 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym44$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_MUMBLER_QUEUE_MANAGER_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-MUMBLER-QUEUE-MANAGER-CLASS");

    static private final SubLSymbol $sym45$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_MUMBLER_QUEUE_MANAGER_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-MUMBLER-QUEUE-MANAGER-INSTANCE");

    static private final SubLList $list_alt46 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-RKF-MUMBLER-QUEUE-MANAGER*"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_RKF_MUMBLER_QUEUE_MANAGER_INITIALIZE_METHOD = makeSymbol("CYBLACK-RKF-MUMBLER-QUEUE-MANAGER-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_MUMBLER_KS = makeSymbol("CYBLACK-MUMBLER-KS");

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MUMBLER_KS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MUMBLER-KS-CLASS");

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE");















    private static final SubLSymbol REMOVE_KNOWLEDGE_SOURCES_AT_WILL = makeSymbol("REMOVE-KNOWLEDGE-SOURCES-AT-WILL");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE");























    private static final SubLSymbol RANGE_SET = makeSymbol("RANGE-SET");

    private static final SubLSymbol CYBLACK_INTERNAL_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE");













    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MUMBLER_KS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MUMBLER-KS-INSTANCE");

    static private final SubLList $list_alt81 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER-CLASS"), list(QUOTE, makeSymbol("CYBLACK-RKF-MUMBLER-QUEUE-MANAGER"))), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(makeSymbol("COPY-TREE"), list(QUOTE, list(makeKeyword("MONITOR"), list(list(makeSymbol("?POSTING"), makeString("RKF-TRACE-EVENT-POSTING"))), $SEND, makeKeyword("NEW-POSTING"), makeKeyword("BINDINGS"), NIL, makeKeyword("WHERE"), $TRUE)))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym82$OUTER_CATCH_FOR_CYBLACK_MUMBLER_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MUMBLER-KS-METHOD");

    static private final SubLList $list_alt83 = list(makeKeyword("MONITOR"), list(list(makeSymbol("?POSTING"), makeString("RKF-TRACE-EVENT-POSTING"))), $SEND, makeKeyword("NEW-POSTING"), makeKeyword("BINDINGS"), NIL, makeKeyword("WHERE"), $TRUE);

    private static final SubLSymbol CYBLACK_MUMBLER_KS_INITIALIZE_METHOD = makeSymbol("CYBLACK-MUMBLER-KS-INITIALIZE-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_mumbler_ks_file();
    }

    public void initializeVariables() {
        init_cyblack_mumbler_ks_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_mumbler_ks_file();
    }
}

