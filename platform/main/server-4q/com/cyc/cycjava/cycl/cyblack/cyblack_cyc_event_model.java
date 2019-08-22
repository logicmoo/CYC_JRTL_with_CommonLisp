/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_structures;
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
 *  module:      CYBLACK-CYC-EVENT-MODEL
 *  source file: /cyc/top/cycl/cyblack/cyblack-cyc-event-model.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_cyc_event_model extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_cyc_event_model() {
    }

    public static final SubLFile me = new cyblack_cyc_event_model();


    // // Definitions
    public static final SubLObject get_cyblack_cem_event_root_posting_properties(SubLObject cyblack_cem_event_root_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cem_event_root_posting, $int$23, PROPERTIES);
    }

    public static final SubLObject set_cyblack_cem_event_root_posting_properties(SubLObject cyblack_cem_event_root_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cem_event_root_posting, value, $int$23, PROPERTIES);
    }

    public static final SubLObject get_cyblack_cem_event_root_posting_message(SubLObject cyblack_cem_event_root_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cem_event_root_posting, $int$22, MESSAGE);
    }

    public static final SubLObject set_cyblack_cem_event_root_posting_message(SubLObject cyblack_cem_event_root_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cem_event_root_posting, value, $int$22, MESSAGE);
    }

    public static final SubLObject get_cyblack_cem_event_root_posting_source(SubLObject cyblack_cem_event_root_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cem_event_root_posting, $int$21, SOURCE);
    }

    public static final SubLObject set_cyblack_cem_event_root_posting_source(SubLObject cyblack_cem_event_root_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cem_event_root_posting, value, $int$21, SOURCE);
    }

    public static final SubLObject get_cyblack_cem_event_root_posting_timestamp(SubLObject cyblack_cem_event_root_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cem_event_root_posting, TWENTY_INTEGER, TIMESTAMP);
    }

    public static final SubLObject set_cyblack_cem_event_root_posting_timestamp(SubLObject cyblack_cem_event_root_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cem_event_root_posting, value, TWENTY_INTEGER, TIMESTAMP);
    }

    public static final SubLObject get_cyblack_cem_event_root_posting_property_keys(SubLObject cyblack_cem_event_root_posting) {
        {
            SubLObject v_class = (cyblack_cem_event_root_posting.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_cem_event_root_posting))) : NIL != subloop_structures.class_p(cyblack_cem_event_root_posting) ? ((SubLObject) (cyblack_cem_event_root_posting)) : NIL != subloop_structures.instance_p(cyblack_cem_event_root_posting) ? ((SubLObject) (subloop_structures.instance_class(cyblack_cem_event_root_posting))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PROPERTY_KEYS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_cyblack_cem_event_root_posting_property_keys(SubLObject cyblack_cem_event_root_posting, SubLObject value) {
        {
            SubLObject v_class = (cyblack_cem_event_root_posting.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_cem_event_root_posting))) : NIL != subloop_structures.class_p(cyblack_cem_event_root_posting) ? ((SubLObject) (cyblack_cem_event_root_posting)) : NIL != subloop_structures.instance_p(cyblack_cem_event_root_posting) ? ((SubLObject) (subloop_structures.instance_class(cyblack_cem_event_root_posting))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PROPERTY_KEYS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_event_root_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_event_root_posting_instance(SubLObject new_instance) {
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
        return NIL;
    }

    public static final SubLObject cyblack_cem_event_root_posting_p(SubLObject cyblack_cem_event_root_posting) {
        return classes.subloop_instanceof_class(cyblack_cem_event_root_posting, CYBLACK_CEM_EVENT_ROOT_POSTING);
    }

    public static final SubLObject cyblack_cem_event_root_posting_new_method(SubLObject self, SubLObject new_message, SubLObject new_source) {
        if (new_message == UNPROVIDED) {
            new_message = NIL;
        }
        if (new_source == UNPROVIDED) {
            new_source = NIL;
        }
        {
            SubLObject new_instance = object.object_new_method(self);
            cyblack_cem_event_root_posting_set_message_method(new_instance, new_message);
            cyblack_cem_event_root_posting_set_source_method(new_instance, new_source);
            return new_instance;
        }
    }

    public static final SubLObject cyblack_cem_event_root_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_cem_event_root_posting_method = NIL;
            SubLObject v_properties = get_cyblack_cem_event_root_posting_properties(self);
            SubLObject timestamp = get_cyblack_cem_event_root_posting_timestamp(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_initialize_method(self);
                    timestamp = get_universal_time();
                    v_properties = NIL;
                    sublisp_throw($sym51$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cem_event_root_posting_properties(self, v_properties);
                            set_cyblack_cem_event_root_posting_timestamp(self, timestamp);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cem_event_root_posting_method = Errors.handleThrowable(ccatch_env_var, $sym51$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_cem_event_root_posting_method;
        }
    }

    public static final SubLObject cyblack_cem_event_root_posting_get_doc_method(SubLObject self) {
        return $str_alt56$The_root_class_of_all_events_in_t;
    }

    public static final SubLObject cyblack_cem_event_root_posting_abstract_p_method(SubLObject self) {
        return T;
    }

    public static final SubLObject cyblack_cem_event_root_posting_immutable_p_method(SubLObject self) {
        return T;
    }

    public static final SubLObject cyblack_cem_event_root_posting_instantiatable_p_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_cem_event_root_posting_get_timestamp_method(SubLObject self) {
        {
            SubLObject timestamp = get_cyblack_cem_event_root_posting_timestamp(self);
            return timestamp;
        }
    }

    public static final SubLObject cyblack_cem_event_root_posting_set_timestamp_method(SubLObject self, SubLObject new_timestamp) {
        {
            SubLObject catch_var_for_cyblack_cem_event_root_posting_method = NIL;
            SubLObject timestamp = get_cyblack_cem_event_root_posting_timestamp(self);
            try {
                try {
                    timestamp = new_timestamp;
                    sublisp_throw($sym72$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD, new_timestamp);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cem_event_root_posting_timestamp(self, timestamp);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cem_event_root_posting_method = Errors.handleThrowable(ccatch_env_var, $sym72$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_cem_event_root_posting_method;
        }
    }

    public static final SubLObject cyblack_cem_event_root_posting_get_source_method(SubLObject self) {
        {
            SubLObject source = get_cyblack_cem_event_root_posting_source(self);
            return source;
        }
    }

    public static final SubLObject cyblack_cem_event_root_posting_set_source_method(SubLObject self, SubLObject new_source) {
        {
            SubLObject catch_var_for_cyblack_cem_event_root_posting_method = NIL;
            SubLObject source = get_cyblack_cem_event_root_posting_source(self);
            try {
                try {
                    source = new_source;
                    sublisp_throw($sym80$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD, new_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cem_event_root_posting_source(self, source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cem_event_root_posting_method = Errors.handleThrowable(ccatch_env_var, $sym80$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_cem_event_root_posting_method;
        }
    }

    public static final SubLObject cyblack_cem_event_root_posting_get_message_method(SubLObject self) {
        {
            SubLObject message = get_cyblack_cem_event_root_posting_message(self);
            return message;
        }
    }

    public static final SubLObject cyblack_cem_event_root_posting_set_message_method(SubLObject self, SubLObject new_message) {
        {
            SubLObject catch_var_for_cyblack_cem_event_root_posting_method = NIL;
            SubLObject message = get_cyblack_cem_event_root_posting_message(self);
            try {
                try {
                    message = new_message;
                    sublisp_throw($sym88$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD, new_message);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cem_event_root_posting_message(self, message);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cem_event_root_posting_method = Errors.handleThrowable(ccatch_env_var, $sym88$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_cem_event_root_posting_method;
        }
    }

    public static final SubLObject cyblack_cem_event_root_posting_get_property_method(SubLObject self, SubLObject key) {
        {
            SubLObject catch_var_for_cyblack_cem_event_root_posting_method = NIL;
            SubLObject property_keys = get_cyblack_cem_event_root_posting_property_keys(self);
            SubLObject v_properties = get_cyblack_cem_event_root_posting_properties(self);
            try {
                try {
                    if (NIL == subl_promotions.memberP(key, property_keys, UNPROVIDED, UNPROVIDED)) {
                        property_keys = cons(key, property_keys);
                    }
                    sublisp_throw($sym93$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD, getf(v_properties, key, UNPROVIDED));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cem_event_root_posting_property_keys(self, property_keys);
                            set_cyblack_cem_event_root_posting_properties(self, v_properties);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cem_event_root_posting_method = Errors.handleThrowable(ccatch_env_var, $sym93$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_cem_event_root_posting_method;
        }
    }

    public static final SubLObject cyblack_cem_event_root_posting_set_property_method(SubLObject self, SubLObject key, SubLObject value) {
        {
            SubLObject catch_var_for_cyblack_cem_event_root_posting_method = NIL;
            SubLObject property_keys = get_cyblack_cem_event_root_posting_property_keys(self);
            SubLObject v_properties = get_cyblack_cem_event_root_posting_properties(self);
            try {
                try {
                    if (NIL == subl_promotions.memberP(key, property_keys, UNPROVIDED, UNPROVIDED)) {
                        property_keys = cons(key, property_keys);
                    }
                    v_properties = putf(v_properties, key, value);
                    sublisp_throw($sym98$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD, value);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cem_event_root_posting_property_keys(self, property_keys);
                            set_cyblack_cem_event_root_posting_properties(self, v_properties);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cem_event_root_posting_method = Errors.handleThrowable(ccatch_env_var, $sym98$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_cem_event_root_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_system_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_system_event_posting_instance(SubLObject new_instance) {
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
        return NIL;
    }

    public static final SubLObject cyblack_cem_system_event_posting_p(SubLObject cyblack_cem_system_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cem_system_event_posting, CYBLACK_CEM_SYSTEM_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cem_system_event_posting_get_doc_method(SubLObject self) {
        return $str_alt105$All_of_the_events_used_by_the_run;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_application_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_application_event_posting_instance(SubLObject new_instance) {
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
        return NIL;
    }

    public static final SubLObject cyblack_cem_application_event_posting_p(SubLObject cyblack_cem_application_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cem_application_event_posting, CYBLACK_CEM_APPLICATION_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cem_application_event_posting_get_doc_method(SubLObject self) {
        return $str_alt111$All_of_the_events_used_by_the_app;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_sublisp_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_sublisp_event_posting_instance(SubLObject new_instance) {
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
        return NIL;
    }

    public static final SubLObject cyblack_cem_sublisp_event_posting_p(SubLObject cyblack_cem_sublisp_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cem_sublisp_event_posting, CYBLACK_CEM_SUBLISP_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cem_sublisp_event_posting_get_doc_method(SubLObject self) {
        return $str_alt117$All_of_the_events_triggered_by_Su;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_cyc_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_cyc_event_posting_instance(SubLObject new_instance) {
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
        return NIL;
    }

    public static final SubLObject cyblack_cem_cyc_event_posting_p(SubLObject cyblack_cem_cyc_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cem_cyc_event_posting, CYBLACK_CEM_CYC_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cem_cyc_event_posting_get_doc_method(SubLObject self) {
        return $str_alt123$All_of_the_events_triggered_by_th;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_kb_store_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_kb_store_event_posting_instance(SubLObject new_instance) {
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
        return NIL;
    }

    public static final SubLObject cyblack_cem_kb_store_event_posting_p(SubLObject cyblack_cem_kb_store_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cem_kb_store_event_posting, CYBLACK_CEM_KB_STORE_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cem_kb_store_event_posting_get_doc_method(SubLObject self) {
        return $str_alt129$All_of_the_events_triggered_by_th;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_inference_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_inference_event_posting_instance(SubLObject new_instance) {
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
        return NIL;
    }

    public static final SubLObject cyblack_cem_inference_event_posting_p(SubLObject cyblack_cem_inference_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cem_inference_event_posting, CYBLACK_CEM_INFERENCE_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cem_inference_event_posting_get_doc_method(SubLObject self) {
        return $str_alt135$All_of_the_events_triggered_by_th;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_sbhl_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_sbhl_event_posting_instance(SubLObject new_instance) {
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
        return NIL;
    }

    public static final SubLObject cyblack_cem_sbhl_event_posting_p(SubLObject cyblack_cem_sbhl_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cem_sbhl_event_posting, CYBLACK_CEM_SBHL_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cem_sbhl_event_posting_get_doc_method(SubLObject self) {
        return $str_alt141$All_of_the_events_triggered_by_th;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_nl_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_nl_event_posting_instance(SubLObject new_instance) {
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
        return NIL;
    }

    public static final SubLObject cyblack_cem_nl_event_posting_p(SubLObject cyblack_cem_nl_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cem_nl_event_posting, CYBLACK_CEM_NL_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cem_nl_event_posting_get_doc_method(SubLObject self) {
        return $str_alt147$All_of_the_events_triggered_by_th;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_cyc_application_event_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CEM_EVENT_ROOT_POSTING, PROPERTY_KEYS, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cem_cyc_application_event_posting_instance(SubLObject new_instance) {
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
        return NIL;
    }

    public static final SubLObject cyblack_cem_cyc_application_event_posting_p(SubLObject cyblack_cem_cyc_application_event_posting) {
        return classes.subloop_instanceof_class(cyblack_cem_cyc_application_event_posting, CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING);
    }

    public static final SubLObject cyblack_cem_cyc_application_event_posting_get_doc_method(SubLObject self) {
        return $str_alt153$The_parent_for_all_events_that_ar;
    }

    public static final SubLObject declare_cyblack_cyc_event_model_file() {
        declareFunction("get_cyblack_cem_event_root_posting_properties", "GET-CYBLACK-CEM-EVENT-ROOT-POSTING-PROPERTIES", 1, 0, false);
        declareFunction("set_cyblack_cem_event_root_posting_properties", "SET-CYBLACK-CEM-EVENT-ROOT-POSTING-PROPERTIES", 2, 0, false);
        declareFunction("get_cyblack_cem_event_root_posting_message", "GET-CYBLACK-CEM-EVENT-ROOT-POSTING-MESSAGE", 1, 0, false);
        declareFunction("set_cyblack_cem_event_root_posting_message", "SET-CYBLACK-CEM-EVENT-ROOT-POSTING-MESSAGE", 2, 0, false);
        declareFunction("get_cyblack_cem_event_root_posting_source", "GET-CYBLACK-CEM-EVENT-ROOT-POSTING-SOURCE", 1, 0, false);
        declareFunction("set_cyblack_cem_event_root_posting_source", "SET-CYBLACK-CEM-EVENT-ROOT-POSTING-SOURCE", 2, 0, false);
        declareFunction("get_cyblack_cem_event_root_posting_timestamp", "GET-CYBLACK-CEM-EVENT-ROOT-POSTING-TIMESTAMP", 1, 0, false);
        declareFunction("set_cyblack_cem_event_root_posting_timestamp", "SET-CYBLACK-CEM-EVENT-ROOT-POSTING-TIMESTAMP", 2, 0, false);
        declareFunction("get_cyblack_cem_event_root_posting_property_keys", "GET-CYBLACK-CEM-EVENT-ROOT-POSTING-PROPERTY-KEYS", 1, 0, false);
        declareFunction("set_cyblack_cem_event_root_posting_property_keys", "SET-CYBLACK-CEM-EVENT-ROOT-POSTING-PROPERTY-KEYS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_event_root_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-EVENT-ROOT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_event_root_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-EVENT-ROOT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cem_event_root_posting_p", "CYBLACK-CEM-EVENT-ROOT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cem_event_root_posting_new_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-NEW-METHOD", 1, 2, false);
        declareFunction("cyblack_cem_event_root_posting_initialize_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_cem_event_root_posting_get_doc_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("cyblack_cem_event_root_posting_abstract_p_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-ABSTRACT-P-METHOD", 1, 0, false);
        declareFunction("cyblack_cem_event_root_posting_immutable_p_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-IMMUTABLE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_cem_event_root_posting_instantiatable_p_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-INSTANTIATABLE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_cem_event_root_posting_get_timestamp_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-GET-TIMESTAMP-METHOD", 1, 0, false);
        declareFunction("cyblack_cem_event_root_posting_set_timestamp_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-SET-TIMESTAMP-METHOD", 2, 0, false);
        declareFunction("cyblack_cem_event_root_posting_get_source_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-GET-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_cem_event_root_posting_set_source_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-SET-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_cem_event_root_posting_get_message_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-GET-MESSAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_cem_event_root_posting_set_message_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-SET-MESSAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_cem_event_root_posting_get_property_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-GET-PROPERTY-METHOD", 2, 0, false);
        declareFunction("cyblack_cem_event_root_posting_set_property_method", "CYBLACK-CEM-EVENT-ROOT-POSTING-SET-PROPERTY-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_system_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SYSTEM-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_system_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SYSTEM-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cem_system_event_posting_p", "CYBLACK-CEM-SYSTEM-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cem_system_event_posting_get_doc_method", "CYBLACK-CEM-SYSTEM-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_application_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-APPLICATION-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_application_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-APPLICATION-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cem_application_event_posting_p", "CYBLACK-CEM-APPLICATION-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cem_application_event_posting_get_doc_method", "CYBLACK-CEM-APPLICATION-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_sublisp_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SUBLISP-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_sublisp_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SUBLISP-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cem_sublisp_event_posting_p", "CYBLACK-CEM-SUBLISP-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cem_sublisp_event_posting_get_doc_method", "CYBLACK-CEM-SUBLISP-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_cyc_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-CYC-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_cyc_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-CYC-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cem_cyc_event_posting_p", "CYBLACK-CEM-CYC-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cem_cyc_event_posting_get_doc_method", "CYBLACK-CEM-CYC-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_kb_store_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-KB-STORE-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_kb_store_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-KB-STORE-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cem_kb_store_event_posting_p", "CYBLACK-CEM-KB-STORE-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cem_kb_store_event_posting_get_doc_method", "CYBLACK-CEM-KB-STORE-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_inference_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-INFERENCE-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_inference_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-INFERENCE-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cem_inference_event_posting_p", "CYBLACK-CEM-INFERENCE-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cem_inference_event_posting_get_doc_method", "CYBLACK-CEM-INFERENCE-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_sbhl_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SBHL-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_sbhl_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SBHL-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cem_sbhl_event_posting_p", "CYBLACK-CEM-SBHL-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cem_sbhl_event_posting_get_doc_method", "CYBLACK-CEM-SBHL-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_nl_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-NL-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_nl_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-NL-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cem_nl_event_posting_p", "CYBLACK-CEM-NL-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cem_nl_event_posting_get_doc_method", "CYBLACK-CEM-NL-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_cyc_application_event_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cem_cyc_application_event_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cem_cyc_application_event_posting_p", "CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cem_cyc_application_event_posting_get_doc_method", "CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING-GET-DOC-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_cyc_event_model_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_cyc_event_model_file() {
                classes.subloop_new_class(CYBLACK_CEM_EVENT_ROOT_POSTING, CYBLACK_BASIC_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_CEM_EVENT_ROOT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CEM_EVENT_ROOT_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_EVENT_ROOT_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CEM_EVENT_ROOT_POSTING, $sym42$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_EVENT_ROOT_POSTING_INSTAN);
        subloop_reserved_initialize_cyblack_cem_event_root_posting_class(CYBLACK_CEM_EVENT_ROOT_POSTING);
        methods.methods_incorporate_class_method(NEW, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt44, $list_alt45, $list_alt46);
        methods.subloop_register_class_method(CYBLACK_CEM_EVENT_ROOT_POSTING, NEW, CYBLACK_CEM_EVENT_ROOT_POSTING_NEW_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt49, NIL, $list_alt50);
        methods.subloop_register_instance_method(CYBLACK_CEM_EVENT_ROOT_POSTING, INITIALIZE, CYBLACK_CEM_EVENT_ROOT_POSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt54, NIL, $list_alt55);
        methods.subloop_register_class_method(CYBLACK_CEM_EVENT_ROOT_POSTING, GET_DOC, CYBLACK_CEM_EVENT_ROOT_POSTING_GET_DOC_METHOD);
        methods.methods_incorporate_class_method(ABSTRACT_P, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt54, NIL, $list_alt59);
        methods.subloop_register_class_method(CYBLACK_CEM_EVENT_ROOT_POSTING, ABSTRACT_P, CYBLACK_CEM_EVENT_ROOT_POSTING_ABSTRACT_P_METHOD);
        methods.methods_incorporate_class_method(IMMUTABLE_P, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt54, NIL, $list_alt59);
        methods.subloop_register_class_method(CYBLACK_CEM_EVENT_ROOT_POSTING, IMMUTABLE_P, CYBLACK_CEM_EVENT_ROOT_POSTING_IMMUTABLE_P_METHOD);
        methods.methods_incorporate_class_method(INSTANTIATABLE_P, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt44, NIL, $list_alt64);
        methods.subloop_register_class_method(CYBLACK_CEM_EVENT_ROOT_POSTING, INSTANTIATABLE_P, CYBLACK_CEM_EVENT_ROOT_POSTING_INSTANTIATABLE_P_METHOD);
        methods.methods_incorporate_instance_method(GET_TIMESTAMP, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt54, NIL, $list_alt67);
        methods.subloop_register_instance_method(CYBLACK_CEM_EVENT_ROOT_POSTING, GET_TIMESTAMP, CYBLACK_CEM_EVENT_ROOT_POSTING_GET_TIMESTAMP_METHOD);
        methods.methods_incorporate_instance_method(SET_TIMESTAMP, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt44, $list_alt70, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_CEM_EVENT_ROOT_POSTING, SET_TIMESTAMP, CYBLACK_CEM_EVENT_ROOT_POSTING_SET_TIMESTAMP_METHOD);
        methods.methods_incorporate_instance_method(GET_SOURCE, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt54, NIL, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_CEM_EVENT_ROOT_POSTING, GET_SOURCE, CYBLACK_CEM_EVENT_ROOT_POSTING_GET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(SET_SOURCE, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt44, $list_alt78, $list_alt79);
        methods.subloop_register_instance_method(CYBLACK_CEM_EVENT_ROOT_POSTING, SET_SOURCE, CYBLACK_CEM_EVENT_ROOT_POSTING_SET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_MESSAGE, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt54, NIL, $list_alt83);
        methods.subloop_register_instance_method(CYBLACK_CEM_EVENT_ROOT_POSTING, GET_MESSAGE, CYBLACK_CEM_EVENT_ROOT_POSTING_GET_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(SET_MESSAGE, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt44, $list_alt86, $list_alt87);
        methods.subloop_register_instance_method(CYBLACK_CEM_EVENT_ROOT_POSTING, SET_MESSAGE, CYBLACK_CEM_EVENT_ROOT_POSTING_SET_MESSAGE_METHOD);
        methods.methods_incorporate_instance_method(GET_PROPERTY, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt44, $list_alt91, $list_alt92);
        methods.subloop_register_instance_method(CYBLACK_CEM_EVENT_ROOT_POSTING, GET_PROPERTY, CYBLACK_CEM_EVENT_ROOT_POSTING_GET_PROPERTY_METHOD);
        methods.methods_incorporate_instance_method(SET_PROPERTY, CYBLACK_CEM_EVENT_ROOT_POSTING, $list_alt44, $list_alt96, $list_alt97);
        methods.subloop_register_instance_method(CYBLACK_CEM_EVENT_ROOT_POSTING, SET_PROPERTY, CYBLACK_CEM_EVENT_ROOT_POSTING_SET_PROPERTY_METHOD);
        classes.subloop_new_class(CYBLACK_CEM_SYSTEM_EVENT_POSTING, CYBLACK_CEM_EVENT_ROOT_POSTING, NIL, NIL, $list_alt101);
        classes.class_set_implements_slot_listeners(CYBLACK_CEM_SYSTEM_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CEM_SYSTEM_EVENT_POSTING, $sym102$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SYSTEM_EVENT_POSTING_CLAS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CEM_SYSTEM_EVENT_POSTING, $sym103$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SYSTEM_EVENT_POSTING_INST);
        subloop_reserved_initialize_cyblack_cem_system_event_posting_class(CYBLACK_CEM_SYSTEM_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CEM_SYSTEM_EVENT_POSTING, $list_alt44, NIL, $list_alt104);
        methods.subloop_register_class_method(CYBLACK_CEM_SYSTEM_EVENT_POSTING, GET_DOC, CYBLACK_CEM_SYSTEM_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CEM_APPLICATION_EVENT_POSTING, CYBLACK_CEM_EVENT_ROOT_POSTING, NIL, NIL, $list_alt101);
        classes.class_set_implements_slot_listeners(CYBLACK_CEM_APPLICATION_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CEM_APPLICATION_EVENT_POSTING, $sym108$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_APPLICATION_EVENT_POSTING);
        classes.subloop_note_instance_initialization_function(CYBLACK_CEM_APPLICATION_EVENT_POSTING, $sym109$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_APPLICATION_EVENT_POSTING);
        subloop_reserved_initialize_cyblack_cem_application_event_posting_class(CYBLACK_CEM_APPLICATION_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CEM_APPLICATION_EVENT_POSTING, $list_alt44, NIL, $list_alt110);
        methods.subloop_register_class_method(CYBLACK_CEM_APPLICATION_EVENT_POSTING, GET_DOC, CYBLACK_CEM_APPLICATION_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CEM_SUBLISP_EVENT_POSTING, CYBLACK_CEM_SYSTEM_EVENT_POSTING, NIL, NIL, $list_alt101);
        classes.class_set_implements_slot_listeners(CYBLACK_CEM_SUBLISP_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CEM_SUBLISP_EVENT_POSTING, $sym114$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SUBLISP_EVENT_POSTING_CLA);
        classes.subloop_note_instance_initialization_function(CYBLACK_CEM_SUBLISP_EVENT_POSTING, $sym115$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SUBLISP_EVENT_POSTING_INS);
        subloop_reserved_initialize_cyblack_cem_sublisp_event_posting_class(CYBLACK_CEM_SUBLISP_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CEM_SUBLISP_EVENT_POSTING, $list_alt44, NIL, $list_alt116);
        methods.subloop_register_class_method(CYBLACK_CEM_SUBLISP_EVENT_POSTING, GET_DOC, CYBLACK_CEM_SUBLISP_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CEM_CYC_EVENT_POSTING, CYBLACK_CEM_APPLICATION_EVENT_POSTING, NIL, NIL, $list_alt101);
        classes.class_set_implements_slot_listeners(CYBLACK_CEM_CYC_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CEM_CYC_EVENT_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_CYC_EVENT_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CEM_CYC_EVENT_POSTING, $sym121$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_CYC_EVENT_POSTING_INSTANC);
        subloop_reserved_initialize_cyblack_cem_cyc_event_posting_class(CYBLACK_CEM_CYC_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CEM_CYC_EVENT_POSTING, $list_alt44, NIL, $list_alt122);
        methods.subloop_register_class_method(CYBLACK_CEM_CYC_EVENT_POSTING, GET_DOC, CYBLACK_CEM_CYC_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CEM_KB_STORE_EVENT_POSTING, CYBLACK_CEM_CYC_EVENT_POSTING, NIL, NIL, $list_alt101);
        classes.class_set_implements_slot_listeners(CYBLACK_CEM_KB_STORE_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CEM_KB_STORE_EVENT_POSTING, $sym126$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_KB_STORE_EVENT_POSTING_CL);
        classes.subloop_note_instance_initialization_function(CYBLACK_CEM_KB_STORE_EVENT_POSTING, $sym127$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_KB_STORE_EVENT_POSTING_IN);
        subloop_reserved_initialize_cyblack_cem_kb_store_event_posting_class(CYBLACK_CEM_KB_STORE_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CEM_KB_STORE_EVENT_POSTING, $list_alt44, NIL, $list_alt128);
        methods.subloop_register_class_method(CYBLACK_CEM_KB_STORE_EVENT_POSTING, GET_DOC, CYBLACK_CEM_KB_STORE_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CEM_INFERENCE_EVENT_POSTING, CYBLACK_CEM_CYC_EVENT_POSTING, NIL, NIL, $list_alt101);
        classes.class_set_implements_slot_listeners(CYBLACK_CEM_INFERENCE_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CEM_INFERENCE_EVENT_POSTING, $sym132$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_INFERENCE_EVENT_POSTING_C);
        classes.subloop_note_instance_initialization_function(CYBLACK_CEM_INFERENCE_EVENT_POSTING, $sym133$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_INFERENCE_EVENT_POSTING_I);
        subloop_reserved_initialize_cyblack_cem_inference_event_posting_class(CYBLACK_CEM_INFERENCE_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CEM_INFERENCE_EVENT_POSTING, $list_alt44, NIL, $list_alt134);
        methods.subloop_register_class_method(CYBLACK_CEM_INFERENCE_EVENT_POSTING, GET_DOC, CYBLACK_CEM_INFERENCE_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CEM_SBHL_EVENT_POSTING, CYBLACK_CEM_CYC_EVENT_POSTING, NIL, NIL, $list_alt101);
        classes.class_set_implements_slot_listeners(CYBLACK_CEM_SBHL_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CEM_SBHL_EVENT_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SBHL_EVENT_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CEM_SBHL_EVENT_POSTING, $sym139$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SBHL_EVENT_POSTING_INSTAN);
        subloop_reserved_initialize_cyblack_cem_sbhl_event_posting_class(CYBLACK_CEM_SBHL_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CEM_SBHL_EVENT_POSTING, $list_alt44, NIL, $list_alt140);
        methods.subloop_register_class_method(CYBLACK_CEM_SBHL_EVENT_POSTING, GET_DOC, CYBLACK_CEM_SBHL_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CEM_NL_EVENT_POSTING, CYBLACK_CEM_CYC_EVENT_POSTING, NIL, NIL, $list_alt101);
        classes.class_set_implements_slot_listeners(CYBLACK_CEM_NL_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CEM_NL_EVENT_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_NL_EVENT_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CEM_NL_EVENT_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_NL_EVENT_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_cem_nl_event_posting_class(CYBLACK_CEM_NL_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CEM_NL_EVENT_POSTING, $list_alt44, NIL, $list_alt146);
        methods.subloop_register_class_method(CYBLACK_CEM_NL_EVENT_POSTING, GET_DOC, CYBLACK_CEM_NL_EVENT_POSTING_GET_DOC_METHOD);
        classes.subloop_new_class(CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING, CYBLACK_CEM_CYC_EVENT_POSTING, NIL, NIL, $list_alt101);
        classes.class_set_implements_slot_listeners(CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING, $sym150$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_CYC_APPLICATION_EVENT_POS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING, $sym151$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_CYC_APPLICATION_EVENT_POS);
        subloop_reserved_initialize_cyblack_cem_cyc_application_event_posting_class(CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING);
        methods.methods_incorporate_class_method(GET_DOC, CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING, $list_alt44, NIL, $list_alt152);
        methods.subloop_register_class_method(CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING, GET_DOC, CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING_GET_DOC_METHOD);
        return NIL;
    }





    static private final SubLList $list_alt2 = list(new SubLObject[]{ list(makeSymbol("TIMESTAMP"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SOURCE"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MESSAGE"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROPERTY-KEYS"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("PROPERTIES"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-MESSAGE"), NIL), list(makeSymbol("NEW-SOURCE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-DOC"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ABSTRACT-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("IMMUTABLE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("INSTANTIATABLE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMESTAMP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIMESTAMP"), list(makeSymbol("NEW-TIMESTAMP")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SOURCE"), list(makeSymbol("NEW-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MESSAGE"), list(makeSymbol("NEW-MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROPERTY"), list(makeSymbol("KEY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROPERTY"), list(makeSymbol("KEY"), makeSymbol("VALUE")), makeKeyword("PUBLIC")) });

    public static final SubLInteger $int$23 = makeInteger(23);



    public static final SubLInteger $int$22 = makeInteger(22);



    public static final SubLInteger $int$21 = makeInteger(21);











    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_EVENT_ROOT_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-EVENT-ROOT-POSTING-CLASS");



























    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");





























    static private final SubLSymbol $sym42$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_EVENT_ROOT_POSTING_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-EVENT-ROOT-POSTING-INSTANCE");



    static private final SubLList $list_alt44 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt45 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-MESSAGE"), NIL), list(makeSymbol("NEW-SOURCE"), NIL));

    static private final SubLList $list_alt46 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-INSTANCE"), list(makeSymbol("NEW"), makeSymbol("SUPER")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-MESSAGE"), makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING")), makeSymbol("NEW-INSTANCE"), makeSymbol("NEW-MESSAGE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SOURCE"), makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING")), makeSymbol("NEW-INSTANCE"), makeSymbol("NEW-SOURCE")), list(RET, makeSymbol("NEW-INSTANCE"))));

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_NEW_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-NEW-METHOD");



    static private final SubLList $list_alt49 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt50 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TIMESTAMP"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(makeSymbol("CSETQ"), makeSymbol("PROPERTIES"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym51$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CEM-EVENT-ROOT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-INITIALIZE-METHOD");



    static private final SubLList $list_alt54 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt55 = list(list(RET, makeString("The root class of all events in the hierarchy.")));

    static private final SubLString $str_alt56$The_root_class_of_all_events_in_t = makeString("The root class of all events in the hierarchy.");

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol ABSTRACT_P = makeSymbol("ABSTRACT-P");

    static private final SubLList $list_alt59 = list(list(RET, T));

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_ABSTRACT_P_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-ABSTRACT-P-METHOD");



    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_IMMUTABLE_P_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-IMMUTABLE-P-METHOD");

    private static final SubLSymbol INSTANTIATABLE_P = makeSymbol("INSTANTIATABLE-P");

    static private final SubLList $list_alt64 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_INSTANTIATABLE_P_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-INSTANTIATABLE-P-METHOD");



    static private final SubLList $list_alt67 = list(list(RET, makeSymbol("TIMESTAMP")));

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_GET_TIMESTAMP_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-GET-TIMESTAMP-METHOD");



    static private final SubLList $list_alt70 = list(makeSymbol("NEW-TIMESTAMP"));

    static private final SubLList $list_alt71 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-TIMESTAMP")), list(makeSymbol("INTEGERP"), makeSymbol("NEW-TIMESTAMP"))), makeString("(SET-TIMESTAMP ~S): ~S is neither a universal time nor NIL.  An integer was expected."), makeSymbol("SELF"), makeSymbol("NEW-TIMESTAMP")), list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("TIMESTAMP"), makeSymbol("NEW-TIMESTAMP")), list(RET, makeSymbol("NEW-TIMESTAMP")));

    static private final SubLSymbol $sym72$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CEM-EVENT-ROOT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_SET_TIMESTAMP_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-SET-TIMESTAMP-METHOD");



    static private final SubLList $list_alt75 = list(list(RET, makeSymbol("SOURCE")));

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_GET_SOURCE_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-GET-SOURCE-METHOD");



    static private final SubLList $list_alt78 = list(makeSymbol("NEW-SOURCE"));

    static private final SubLList $list_alt79 = list(list(makeSymbol("CSETQ"), makeSymbol("SOURCE"), makeSymbol("NEW-SOURCE")), list(RET, makeSymbol("NEW-SOURCE")));

    static private final SubLSymbol $sym80$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CEM-EVENT-ROOT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_SET_SOURCE_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-SET-SOURCE-METHOD");

    private static final SubLSymbol GET_MESSAGE = makeSymbol("GET-MESSAGE");

    static private final SubLList $list_alt83 = list(list(RET, makeSymbol("MESSAGE")));

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_GET_MESSAGE_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-GET-MESSAGE-METHOD");

    private static final SubLSymbol SET_MESSAGE = makeSymbol("SET-MESSAGE");

    static private final SubLList $list_alt86 = list(makeSymbol("NEW-MESSAGE"));

    static private final SubLList $list_alt87 = list(list(makeSymbol("CSETQ"), makeSymbol("MESSAGE"), makeSymbol("NEW-MESSAGE")), list(RET, makeSymbol("NEW-MESSAGE")));

    static private final SubLSymbol $sym88$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CEM-EVENT-ROOT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_SET_MESSAGE_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-SET-MESSAGE-METHOD");

    private static final SubLSymbol GET_PROPERTY = makeSymbol("GET-PROPERTY");

    static private final SubLList $list_alt91 = list(makeSymbol("KEY"));

    static private final SubLList $list_alt92 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("KEY"), makeSymbol("PROPERTY-KEYS")), list(makeSymbol("CPUSH"), makeSymbol("KEY"), makeSymbol("PROPERTY-KEYS"))), list(RET, list(makeSymbol("GETF"), makeSymbol("PROPERTIES"), makeSymbol("KEY"))));

    static private final SubLSymbol $sym93$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CEM-EVENT-ROOT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_GET_PROPERTY_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-GET-PROPERTY-METHOD");

    private static final SubLSymbol SET_PROPERTY = makeSymbol("SET-PROPERTY");

    static private final SubLList $list_alt96 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLList $list_alt97 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("KEY"), makeSymbol("PROPERTY-KEYS")), list(makeSymbol("CPUSH"), makeSymbol("KEY"), makeSymbol("PROPERTY-KEYS"))), list(makeSymbol("CSETQ"), makeSymbol("PROPERTIES"), list(makeSymbol("PUTF"), makeSymbol("PROPERTIES"), makeSymbol("KEY"), makeSymbol("VALUE"))), list(RET, makeSymbol("VALUE")));

    static private final SubLSymbol $sym98$OUTER_CATCH_FOR_CYBLACK_CEM_EVENT_ROOT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CEM-EVENT-ROOT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_CEM_EVENT_ROOT_POSTING_SET_PROPERTY_METHOD = makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING-SET-PROPERTY-METHOD");

    private static final SubLSymbol CYBLACK_CEM_SYSTEM_EVENT_POSTING = makeSymbol("CYBLACK-CEM-SYSTEM-EVENT-POSTING");

    static private final SubLList $list_alt101 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-DOC"), NIL, makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym102$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SYSTEM_EVENT_POSTING_CLAS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SYSTEM-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym103$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SYSTEM_EVENT_POSTING_INST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SYSTEM-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt104 = list(list(RET, makeString("All of the events used by the runtime support system itself.")));

    static private final SubLString $str_alt105$All_of_the_events_used_by_the_run = makeString("All of the events used by the runtime support system itself.");

    private static final SubLSymbol CYBLACK_CEM_SYSTEM_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CEM-SYSTEM-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CEM_APPLICATION_EVENT_POSTING = makeSymbol("CYBLACK-CEM-APPLICATION-EVENT-POSTING");

    static private final SubLSymbol $sym108$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_APPLICATION_EVENT_POSTING = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-APPLICATION-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym109$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_APPLICATION_EVENT_POSTING = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-APPLICATION-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt110 = list(list(RET, makeString("All of the events used by the applications written by the users.")));

    static private final SubLString $str_alt111$All_of_the_events_used_by_the_app = makeString("All of the events used by the applications written by the users.");

    private static final SubLSymbol CYBLACK_CEM_APPLICATION_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CEM-APPLICATION-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CEM_SUBLISP_EVENT_POSTING = makeSymbol("CYBLACK-CEM-SUBLISP-EVENT-POSTING");

    static private final SubLSymbol $sym114$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SUBLISP_EVENT_POSTING_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SUBLISP-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym115$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SUBLISP_EVENT_POSTING_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SUBLISP-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt116 = list(list(RET, makeString("All of the events triggered by SubLISP code.")));

    static private final SubLString $str_alt117$All_of_the_events_triggered_by_Su = makeString("All of the events triggered by SubLISP code.");

    private static final SubLSymbol CYBLACK_CEM_SUBLISP_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CEM-SUBLISP-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CEM_CYC_EVENT_POSTING = makeSymbol("CYBLACK-CEM-CYC-EVENT-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_CYC_EVENT_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-CYC-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym121$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_CYC_EVENT_POSTING_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-CYC-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt122 = list(list(RET, makeString("All of the events triggered by the CYC implementation.")));

    static private final SubLString $str_alt123$All_of_the_events_triggered_by_th = makeString("All of the events triggered by the CYC implementation.");

    private static final SubLSymbol CYBLACK_CEM_CYC_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CEM-CYC-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CEM_KB_STORE_EVENT_POSTING = makeSymbol("CYBLACK-CEM-KB-STORE-EVENT-POSTING");

    static private final SubLSymbol $sym126$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_KB_STORE_EVENT_POSTING_CL = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-KB-STORE-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym127$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_KB_STORE_EVENT_POSTING_IN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-KB-STORE-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt128 = list(list(RET, makeString("All of the events triggered by the KB implementation.")));

    static private final SubLString $str_alt129$All_of_the_events_triggered_by_th = makeString("All of the events triggered by the KB implementation.");

    private static final SubLSymbol CYBLACK_CEM_KB_STORE_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CEM-KB-STORE-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CEM_INFERENCE_EVENT_POSTING = makeSymbol("CYBLACK-CEM-INFERENCE-EVENT-POSTING");

    static private final SubLSymbol $sym132$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_INFERENCE_EVENT_POSTING_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-INFERENCE-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym133$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_INFERENCE_EVENT_POSTING_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-INFERENCE-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt134 = list(list(RET, makeString("All of the events triggered by the inference engine.")));

    static private final SubLString $str_alt135$All_of_the_events_triggered_by_th = makeString("All of the events triggered by the inference engine.");

    private static final SubLSymbol CYBLACK_CEM_INFERENCE_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CEM-INFERENCE-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CEM_SBHL_EVENT_POSTING = makeSymbol("CYBLACK-CEM-SBHL-EVENT-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SBHL_EVENT_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SBHL-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym139$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_SBHL_EVENT_POSTING_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-SBHL-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt140 = list(list(RET, makeString("All of the events triggered by the SBHL reasoning subsystem.")));

    static private final SubLString $str_alt141$All_of_the_events_triggered_by_th = makeString("All of the events triggered by the SBHL reasoning subsystem.");

    private static final SubLSymbol CYBLACK_CEM_SBHL_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CEM-SBHL-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CEM_NL_EVENT_POSTING = makeSymbol("CYBLACK-CEM-NL-EVENT-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_NL_EVENT_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-NL-EVENT-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_NL_EVENT_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-NL-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt146 = list(list(RET, makeString("All of the events triggered by the NL subsystem.")));

    static private final SubLString $str_alt147$All_of_the_events_triggered_by_th = makeString("All of the events triggered by the NL subsystem.");

    private static final SubLSymbol CYBLACK_CEM_NL_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CEM-NL-EVENT-POSTING-GET-DOC-METHOD");

    private static final SubLSymbol CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING = makeSymbol("CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING");

    static private final SubLSymbol $sym150$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_CYC_APPLICATION_EVENT_POS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING-CLASS");

    static private final SubLSymbol $sym151$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CEM_CYC_APPLICATION_EVENT_POS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING-INSTANCE");

    static private final SubLList $list_alt152 = list(list(RET, makeString("The parent for all events that are trigged by applications built on top of CYC.")));

    static private final SubLString $str_alt153$The_parent_for_all_events_that_ar = makeString("The parent for all events that are trigged by applications built on top of CYC.");

    private static final SubLSymbol CYBLACK_CEM_CYC_APPLICATION_EVENT_POSTING_GET_DOC_METHOD = makeSymbol("CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING-GET-DOC-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_cyc_event_model_file();
    }

    public void initializeVariables() {
        init_cyblack_cyc_event_model_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_cyc_event_model_file();
    }
}

