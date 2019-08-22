/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-RKF-EVENTS
 *  source file: /cyc/top/cycl/cyblack/cyblack-rkf-events.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_rkf_events extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_rkf_events() {
    }

    public static final SubLFile me = new cyblack_rkf_events();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_rkf_events";

    // // Definitions
    public static final SubLObject get_cyblack_rkf_base_event_posting_hierarchy(SubLObject cyblack_rkf_base_event_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_rkf_base_event_posting, $int$24, HIERARCHY);
    }

    public static final SubLObject set_cyblack_rkf_base_event_posting_hierarchy(SubLObject cyblack_rkf_base_event_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_rkf_base_event_posting, value, $int$24, HIERARCHY);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_rkf_base_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_rkf_base_event_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTIES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RKF_BASE_EVENT_POSTING, HIERARCHY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_rkf_base_event_posting_p(SubLObject cyblack_rkf_base_event_posting) {
        return classes.subloop_instanceof_class(cyblack_rkf_base_event_posting, CYBLACK_RKF_BASE_EVENT_POSTING);
    }

    public static final SubLObject cyblack_rkf_base_event_posting_get_doc_method(SubLObject self) {
        return $str_alt47$The_base_class_for_the_RKF_applic;
    }

    public static final SubLObject cyblack_rkf_base_event_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_rkf_base_event_posting_method = NIL;
            SubLObject hierarchy = get_cyblack_rkf_base_event_posting_hierarchy(self);
            try {
                try {
                    cyblack_cyc_event_model.cyblack_cem_event_root_posting_initialize_method(self);
                    hierarchy = NIL;
                    sublisp_throw($sym52$OUTER_CATCH_FOR_CYBLACK_RKF_BASE_EVENT_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_rkf_base_event_posting_hierarchy(self, hierarchy);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_rkf_base_event_posting_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_CYBLACK_RKF_BASE_EVENT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_rkf_base_event_posting_method;
        }
    }

    public static final SubLObject cyblack_rkf_base_event_posting_get_hierarchy_method(SubLObject self) {
        {
            SubLObject hierarchy = get_cyblack_rkf_base_event_posting_hierarchy(self);
            return hierarchy;
        }
    }

    public static final SubLObject cyblack_rkf_base_event_posting_set_hierarchy_method(SubLObject self, SubLObject new_hierarchy) {
        {
            SubLObject catch_var_for_cyblack_rkf_base_event_posting_method = NIL;
            SubLObject hierarchy = get_cyblack_rkf_base_event_posting_hierarchy(self);
            try {
                try {
                    hierarchy = new_hierarchy;
                    sublisp_throw($sym61$OUTER_CATCH_FOR_CYBLACK_RKF_BASE_EVENT_POSTING_METHOD, new_hierarchy);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_rkf_base_event_posting_hierarchy(self, hierarchy);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_rkf_base_event_posting_method = Errors.handleThrowable(ccatch_env_var, $sym61$OUTER_CATCH_FOR_CYBLACK_RKF_BASE_EVENT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_rkf_base_event_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_rkf_trace_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_rkf_trace_event_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTIES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RKF_BASE_EVENT_POSTING, HIERARCHY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_rkf_trace_event_posting_p(SubLObject cyblack_rkf_trace_event_posting) {
        return classes.subloop_instanceof_class(cyblack_rkf_trace_event_posting, CYBLACK_RKF_TRACE_EVENT_POSTING);
    }

    public static final SubLObject cyblack_rkf_trace_event_posting_get_doc_method(SubLObject self) {
        return $str_alt68$The_base_class_for_all_RKF_tracin;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_uia_blue_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_uia_blue_event_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT_DEPENDENT, DLL_LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTIES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_RKF_BASE_EVENT_POSTING, HIERARCHY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_uia_blue_event_posting_p(SubLObject cyblack_uia_blue_event_posting) {
        return classes.subloop_instanceof_class(cyblack_uia_blue_event_posting, CYBLACK_UIA_BLUE_EVENT_POSTING);
    }

    public static final SubLObject cyblack_uia_blue_event_posting_get_doc_method(SubLObject self) {
        return $str_alt74$Events_from_the_uia_to_running_bl;
    }

    public static final SubLObject declare_cyblack_rkf_events_file() {
        declareFunction("get_cyblack_rkf_base_event_posting_hierarchy", "GET-CYBLACK-RKF-BASE-EVENT-POSTING-HIERARCHY", 1, 0, false);
        declareFunction("set_cyblack_rkf_base_event_posting_hierarchy", "SET-CYBLACK-RKF-BASE-EVENT-POSTING-HIERARCHY", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_rkf_base_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-BASE-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_rkf_base_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-BASE-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_rkf_base_event_posting_p", "CYBLACK-RKF-BASE-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_rkf_base_event_posting_get_doc_method", "CYBLACK-RKF-BASE-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("cyblack_rkf_base_event_posting_initialize_method", "CYBLACK-RKF-BASE-EVENT-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_rkf_base_event_posting_get_hierarchy_method", "CYBLACK-RKF-BASE-EVENT-POSTING-GET-HIERARCHY-METHOD", 1, 0, false);
        declareFunction("cyblack_rkf_base_event_posting_set_hierarchy_method", "CYBLACK-RKF-BASE-EVENT-POSTING-SET-HIERARCHY-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_rkf_trace_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-TRACE-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_rkf_trace_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-TRACE-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_rkf_trace_event_posting_p", "CYBLACK-RKF-TRACE-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_rkf_trace_event_posting_get_doc_method", "CYBLACK-RKF-TRACE-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_uia_blue_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UIA-BLUE-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_uia_blue_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UIA-BLUE-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_uia_blue_event_posting_p", "CYBLACK-UIA-BLUE-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_uia_blue_event_posting_get_doc_method", "CYBLACK-UIA-BLUE-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_rkf_events_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_rkf_events_file() {
                classes.subloop_new_class(CYBLACK_RKF_BASE_EVENT_POSTING, CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_RKF_BASE_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_RKF_BASE_EVENT_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_BASE_EVENT_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_RKF_BASE_EVENT_POSTING, $sym43$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_BASE_EVENT_POSTING_INSTAN);
        subloop_reserved_initialize_cyblack_rkf_base_event_posting_class(CYBLACK_RKF_BASE_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_RKF_BASE_EVENT_POSTING, $list_alt45, NIL, $list_alt46);
        methods.subloop_register_class_method(CYBLACK_RKF_BASE_EVENT_POSTING, GET_DOC, CYBLACK_RKF_BASE_EVENT_POSTING_GET_DOC_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_RKF_BASE_EVENT_POSTING, $list_alt50, NIL, $list_alt51);
        methods.subloop_register_instance_method(CYBLACK_RKF_BASE_EVENT_POSTING, INITIALIZE, CYBLACK_RKF_BASE_EVENT_POSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_HIERARCHY, CYBLACK_RKF_BASE_EVENT_POSTING, $list_alt55, NIL, $list_alt56);
        methods.subloop_register_instance_method(CYBLACK_RKF_BASE_EVENT_POSTING, GET_HIERARCHY, CYBLACK_RKF_BASE_EVENT_POSTING_GET_HIERARCHY_METHOD);
        methods.methods_incorporate_instance_method(SET_HIERARCHY, CYBLACK_RKF_BASE_EVENT_POSTING, $list_alt45, $list_alt59, $list_alt60);
        methods.subloop_register_instance_method(CYBLACK_RKF_BASE_EVENT_POSTING, SET_HIERARCHY, CYBLACK_RKF_BASE_EVENT_POSTING_SET_HIERARCHY_METHOD);
        classes.subloop_new_class(CYBLACK_RKF_TRACE_EVENT_POSTING, CYBLACK_RKF_BASE_EVENT_POSTING, NIL, NIL, $list_alt64);
        classes.class_set_implements_slot_listeners(CYBLACK_RKF_TRACE_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_RKF_TRACE_EVENT_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_TRACE_EVENT_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_RKF_TRACE_EVENT_POSTING, $sym66$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_TRACE_EVENT_POSTING_INSTA);
        subloop_reserved_initialize_cyblack_rkf_trace_event_posting_class(CYBLACK_RKF_TRACE_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_RKF_TRACE_EVENT_POSTING, $list_alt45, NIL, $list_alt67);
        methods.subloop_register_class_method(CYBLACK_RKF_TRACE_EVENT_POSTING, GET_DOC, CYBLACK_RKF_TRACE_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_UIA_BLUE_EVENT_POSTING, CYBLACK_RKF_BASE_EVENT_POSTING, NIL, NIL, $list_alt64);
        classes.class_set_implements_slot_listeners(CYBLACK_UIA_BLUE_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_UIA_BLUE_EVENT_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UIA_BLUE_EVENT_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_UIA_BLUE_EVENT_POSTING, $sym72$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UIA_BLUE_EVENT_POSTING_INSTAN);
        subloop_reserved_initialize_cyblack_uia_blue_event_posting_class(CYBLACK_UIA_BLUE_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_UIA_BLUE_EVENT_POSTING, $list_alt45, NIL, $list_alt73);
        methods.subloop_register_class_method(CYBLACK_UIA_BLUE_EVENT_POSTING, GET_DOC, CYBLACK_UIA_BLUE_EVENT_POSTING_GET_DOC_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_RKF_BASE_EVENT_POSTING = makeSymbol("CYBLACK-RKF-BASE-EVENT-POSTING");

    private static final SubLSymbol CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING = makeSymbol("CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING");

    static private final SubLList $list_alt2 = list(list(makeSymbol("HIERARCHY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-DOC"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HIERARCHY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-HIERARCHY"), list(makeSymbol("NEW-HIERARCHY")), makeKeyword("PUBLIC")));

    public static final SubLInteger $int$24 = makeInteger(24);











    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_BASE_EVENT_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-BASE-EVENT-POSTING-CLASS");





























    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");





































    static private final SubLSymbol $sym43$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_BASE_EVENT_POSTING_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-BASE-EVENT-POSTING-INSTANCE");



    static private final SubLList $list_alt45 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt46 = list(list(RET, makeString("The base class for the RKF application.")));

    static private final SubLString $str_alt47$The_base_class_for_the_RKF_applic = makeString("The base class for the RKF application.");

    private static final SubLSymbol CYBLACK_RKF_BASE_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-RKF-BASE-EVENT-POSTING-GET-DOC-METHOD");



    static private final SubLList $list_alt50 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt51 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("HIERARCHY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym52$OUTER_CATCH_FOR_CYBLACK_RKF_BASE_EVENT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-RKF-BASE-EVENT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_RKF_BASE_EVENT_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-RKF-BASE-EVENT-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol GET_HIERARCHY = makeSymbol("GET-HIERARCHY");

    static private final SubLList $list_alt55 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt56 = list(list(RET, makeSymbol("HIERARCHY")));

    private static final SubLSymbol CYBLACK_RKF_BASE_EVENT_POSTING_GET_HIERARCHY_METHOD = makeSymbol("CYBLACK-RKF-BASE-EVENT-POSTING-GET-HIERARCHY-METHOD");

    private static final SubLSymbol SET_HIERARCHY = makeSymbol("SET-HIERARCHY");

    static private final SubLList $list_alt59 = list(makeSymbol("NEW-HIERARCHY"));

    static private final SubLList $list_alt60 = list(list(makeSymbol("CSETQ"), makeSymbol("HIERARCHY"), makeSymbol("NEW-HIERARCHY")), list(RET, makeSymbol("NEW-HIERARCHY")));

    static private final SubLSymbol $sym61$OUTER_CATCH_FOR_CYBLACK_RKF_BASE_EVENT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-RKF-BASE-EVENT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_RKF_BASE_EVENT_POSTING_SET_HIERARCHY_METHOD = makeSymbol("CYBLACK-RKF-BASE-EVENT-POSTING-SET-HIERARCHY-METHOD");

    private static final SubLSymbol CYBLACK_RKF_TRACE_EVENT_POSTING = makeSymbol("CYBLACK-RKF-TRACE-EVENT-POSTING");

    static private final SubLList $list_alt64 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-DOC"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_TRACE_EVENT_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-TRACE-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym66$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_RKF_TRACE_EVENT_POSTING_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-RKF-TRACE-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt67 = list(list(RET, makeString("The base class for all RKF tracing activity.")));

    static private final SubLString $str_alt68$The_base_class_for_all_RKF_tracin = makeString("The base class for all RKF tracing activity.");

    private static final SubLSymbol CYBLACK_RKF_TRACE_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-RKF-TRACE-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_UIA_BLUE_EVENT_POSTING = makeSymbol("CYBLACK-UIA-BLUE-EVENT-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UIA_BLUE_EVENT_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UIA-BLUE-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym72$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UIA_BLUE_EVENT_POSTING_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UIA-BLUE-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt73 = list(list(RET, makeString("Events from the uia to running blue graphers listening to the uia-blue event broker")));

    static private final SubLString $str_alt74$Events_from_the_uia_to_running_bl = makeString("Events from the uia to running blue graphers listening to the uia-blue event broker");

    private static final SubLSymbol CYBLACK_UIA_BLUE_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-UIA-BLUE-EVENT-POSTING-GET-DOC-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_rkf_events_file();
    }

    public void initializeVariables() {
        init_cyblack_rkf_events_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_rkf_events_file();
    }
}

