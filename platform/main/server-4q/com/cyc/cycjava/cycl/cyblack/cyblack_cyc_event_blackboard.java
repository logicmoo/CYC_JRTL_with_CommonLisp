/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

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
 *  module:      CYBLACK-CYC-EVENT-BLACKBOARD
 *  source file: /cyc/top/cycl/cyblack/cyblack-cyc-event-blackboard.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_cyc_event_blackboard extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_cyc_event_blackboard() {
    }

    public static final SubLFile me = new cyblack_cyc_event_blackboard();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_cyc_event_blackboard";

    // // Definitions
    public static final SubLObject get_cyblack_cyc_event_test_root_posting_timestamp(SubLObject cyblack_cyc_event_test_root_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cyc_event_test_root_posting, $int$22, TIMESTAMP);
    }

    public static final SubLObject set_cyblack_cyc_event_test_root_posting_timestamp(SubLObject cyblack_cyc_event_test_root_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cyc_event_test_root_posting, value, $int$22, TIMESTAMP);
    }

    public static final SubLObject get_cyblack_cyc_event_test_root_posting_responsible_posting(SubLObject cyblack_cyc_event_test_root_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cyc_event_test_root_posting, $int$21, RESPONSIBLE_POSTING);
    }

    public static final SubLObject set_cyblack_cyc_event_test_root_posting_responsible_posting(SubLObject cyblack_cyc_event_test_root_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cyc_event_test_root_posting, value, $int$21, RESPONSIBLE_POSTING);
    }

    public static final SubLObject get_cyblack_cyc_event_test_root_posting_responsible_ks(SubLObject cyblack_cyc_event_test_root_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cyc_event_test_root_posting, TWENTY_INTEGER, RESPONSIBLE_KS);
    }

    public static final SubLObject set_cyblack_cyc_event_test_root_posting_responsible_ks(SubLObject cyblack_cyc_event_test_root_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cyc_event_test_root_posting, value, TWENTY_INTEGER, RESPONSIBLE_KS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_test_root_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_test_root_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, RESPONSIBLE_KS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, RESPONSIBLE_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, TIMESTAMP, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_test_root_posting_p(SubLObject cyblack_cyc_event_test_root_posting) {
        return classes.subloop_instanceof_class(cyblack_cyc_event_test_root_posting, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING);
    }

    public static final SubLObject cyblack_cyc_event_test_root_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_test_root_posting_method = NIL;
            SubLObject timestamp = get_cyblack_cyc_event_test_root_posting_timestamp(self);
            SubLObject responsible_ks = get_cyblack_cyc_event_test_root_posting_responsible_ks(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_initialize_method(self);
                    responsible_ks = NIL;
                    timestamp = get_universal_time();
                    sublisp_throw($sym43$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_test_root_posting_timestamp(self, timestamp);
                            set_cyblack_cyc_event_test_root_posting_responsible_ks(self, responsible_ks);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_test_root_posting_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_test_root_posting_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_test_root_posting_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject timestamp = get_cyblack_cyc_event_test_root_posting_timestamp(self);
            format(stream, $str_alt49$___A__KS__S__TIME__S_, new SubLObject[]{ NIL != cyblack_posting.cyblack_basic_posting_get_datatype_method(self) ? ((SubLObject) (cyblack_datatype.cyblack_datatype_get_typename(cyblack_posting.cyblack_basic_posting_get_datatype_method(self)))) : $$$Unknown, cyblack_posting.cyblack_basic_posting_get_ks_method(self), timestamp });
            return self;
        }
    }

    public static final SubLObject cyblack_cyc_event_test_root_posting_get_responsible_ks_method(SubLObject self) {
        {
            SubLObject responsible_ks = get_cyblack_cyc_event_test_root_posting_responsible_ks(self);
            return responsible_ks;
        }
    }

    public static final SubLObject cyblack_cyc_event_test_root_posting_set_responsible_ks_method(SubLObject self, SubLObject new_responsible_ks) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_test_root_posting_method = NIL;
            SubLObject responsible_ks = get_cyblack_cyc_event_test_root_posting_responsible_ks(self);
            try {
                try {
                    responsible_ks = new_responsible_ks;
                    sublisp_throw($sym59$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_METHOD, new_responsible_ks);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_test_root_posting_responsible_ks(self, responsible_ks);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_test_root_posting_method = Errors.handleThrowable(ccatch_env_var, $sym59$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_test_root_posting_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_test_root_posting_get_responsible_posting_method(SubLObject self) {
        {
            SubLObject responsible_posting = get_cyblack_cyc_event_test_root_posting_responsible_posting(self);
            return responsible_posting;
        }
    }

    public static final SubLObject cyblack_cyc_event_test_root_posting_set_responsible_posting_method(SubLObject self, SubLObject new_responsible_posting) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_test_root_posting_method = NIL;
            SubLObject responsible_posting = get_cyblack_cyc_event_test_root_posting_responsible_posting(self);
            try {
                try {
                    responsible_posting = new_responsible_posting;
                    sublisp_throw($sym67$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_METHOD, new_responsible_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_test_root_posting_responsible_posting(self, responsible_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_test_root_posting_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_cyc_event_test_root_posting_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_test_root_posting_get_timestamp_method(SubLObject self) {
        {
            SubLObject timestamp = get_cyblack_cyc_event_test_root_posting_timestamp(self);
            return timestamp;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_test_acknowledge_stimilation_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_test_acknowledge_stimilation_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, RESPONSIBLE_KS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, RESPONSIBLE_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, TIMESTAMP, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_test_acknowledge_stimilation_posting_p(SubLObject cyblack_cyc_event_test_acknowledge_stimilation_posting) {
        return classes.subloop_instanceof_class(cyblack_cyc_event_test_acknowledge_stimilation_posting, CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_STIMILATION_POSTING);
    }

    public static final SubLObject get_cyblack_cyc_event_test_acknowledge_posting_removal_posting_removed_posting(SubLObject cyblack_cyc_event_test_acknowledge_posting_removal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_cyc_event_test_acknowledge_posting_removal_posting, $int$23, REMOVED_POSTING);
    }

    public static final SubLObject set_cyblack_cyc_event_test_acknowledge_posting_removal_posting_removed_posting(SubLObject cyblack_cyc_event_test_acknowledge_posting_removal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_cyc_event_test_acknowledge_posting_removal_posting, value, $int$23, REMOVED_POSTING);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_test_acknowledge_posting_removal_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_test_acknowledge_posting_removal_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, RESPONSIBLE_KS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, RESPONSIBLE_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, TIMESTAMP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, REMOVED_POSTING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_test_acknowledge_posting_removal_posting_p(SubLObject cyblack_cyc_event_test_acknowledge_posting_removal_posting) {
        return classes.subloop_instanceof_class(cyblack_cyc_event_test_acknowledge_posting_removal_posting, CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING);
    }

    public static final SubLObject cyblack_cyc_event_test_acknowledge_posting_removal_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_test_acknowledge_posting_removal_posting_method = NIL;
            SubLObject removed_posting = get_cyblack_cyc_event_test_acknowledge_posting_removal_posting_removed_posting(self);
            try {
                try {
                    cyblack_cyc_event_test_root_posting_initialize_method(self);
                    removed_posting = NIL;
                    sublisp_throw($sym82$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVA, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_test_acknowledge_posting_removal_posting_removed_posting(self, removed_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_test_acknowledge_posting_removal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVA);
            }
            return catch_var_for_cyblack_cyc_event_test_acknowledge_posting_removal_posting_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_test_acknowledge_posting_removal_posting_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_test_acknowledge_posting_removal_posting_method = NIL;
            SubLObject removed_posting = get_cyblack_cyc_event_test_acknowledge_posting_removal_posting_removed_posting(self);
            SubLObject timestamp = get_cyblack_cyc_event_test_root_posting_timestamp(self);
            try {
                try {
                    format(stream, $str_alt86$___A__KS__S__TIME__S__POSTING__S_, new SubLObject[]{ NIL != cyblack_posting.cyblack_basic_posting_get_datatype_method(self) ? ((SubLObject) (cyblack_datatype.cyblack_datatype_get_typename(cyblack_posting.cyblack_basic_posting_get_datatype_method(self)))) : $$$Unknown, cyblack_posting.cyblack_basic_posting_get_ks_method(self), timestamp, removed_posting });
                    sublisp_throw($sym85$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVA, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_test_acknowledge_posting_removal_posting_removed_posting(self, removed_posting);
                            set_cyblack_cyc_event_test_root_posting_timestamp(self, timestamp);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_test_acknowledge_posting_removal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym85$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVA);
            }
            return catch_var_for_cyblack_cyc_event_test_acknowledge_posting_removal_posting_method;
        }
    }

    public static final SubLObject cyblack_cyc_event_test_acknowledge_posting_removal_posting_get_removed_posting_method(SubLObject self) {
        {
            SubLObject removed_posting = get_cyblack_cyc_event_test_acknowledge_posting_removal_posting_removed_posting(self);
            return removed_posting;
        }
    }

    public static final SubLObject cyblack_cyc_event_test_acknowledge_posting_removal_posting_set_removed_posting_method(SubLObject self, SubLObject new_removed_posting) {
        {
            SubLObject catch_var_for_cyblack_cyc_event_test_acknowledge_posting_removal_posting_method = NIL;
            SubLObject removed_posting = get_cyblack_cyc_event_test_acknowledge_posting_removal_posting_removed_posting(self);
            try {
                try {
                    removed_posting = new_removed_posting;
                    sublisp_throw($sym94$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVA, new_removed_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_cyc_event_test_acknowledge_posting_removal_posting_removed_posting(self, removed_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_cyc_event_test_acknowledge_posting_removal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym94$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVA);
            }
            return catch_var_for_cyblack_cyc_event_test_acknowledge_posting_removal_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_blackboard_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_cyc_event_blackboard_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BLACKBOARD, CACHED_DATATYPE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BLACKBOARD, ROOT_PANELS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_cyc_event_blackboard_p(SubLObject v_cyblack_cyc_event_blackboard) {
        return classes.subloop_instanceof_class(v_cyblack_cyc_event_blackboard, CYBLACK_CYC_EVENT_BLACKBOARD);
    }

    public static final SubLObject declare_cyblack_cyc_event_blackboard_file() {
        declareFunction("get_cyblack_cyc_event_test_root_posting_timestamp", "GET-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-TIMESTAMP", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_test_root_posting_timestamp", "SET-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-TIMESTAMP", 2, 0, false);
        declareFunction("get_cyblack_cyc_event_test_root_posting_responsible_posting", "GET-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-RESPONSIBLE-POSTING", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_test_root_posting_responsible_posting", "SET-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-RESPONSIBLE-POSTING", 2, 0, false);
        declareFunction("get_cyblack_cyc_event_test_root_posting_responsible_ks", "GET-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-RESPONSIBLE-KS", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_test_root_posting_responsible_ks", "SET-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-RESPONSIBLE-KS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_test_root_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_test_root_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_root_posting_p", "CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_root_posting_initialize_method", "CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_root_posting_print_method", "CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_cyc_event_test_root_posting_get_responsible_ks_method", "CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-GET-RESPONSIBLE-KS-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_root_posting_set_responsible_ks_method", "CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-SET-RESPONSIBLE-KS-METHOD", 2, 0, false);
        declareFunction("cyblack_cyc_event_test_root_posting_get_responsible_posting_method", "CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-GET-RESPONSIBLE-POSTING-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_root_posting_set_responsible_posting_method", "CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-SET-RESPONSIBLE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_cyc_event_test_root_posting_get_timestamp_method", "CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-GET-TIMESTAMP-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_test_acknowledge_stimilation_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-STIMILATION-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_test_acknowledge_stimilation_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-STIMILATION-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_acknowledge_stimilation_posting_p", "CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-STIMILATION-POSTING-P", 1, 0, false);
        declareFunction("get_cyblack_cyc_event_test_acknowledge_posting_removal_posting_removed_posting", "GET-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-REMOVED-POSTING", 1, 0, false);
        declareFunction("set_cyblack_cyc_event_test_acknowledge_posting_removal_posting_removed_posting", "SET-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-REMOVED-POSTING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_test_acknowledge_posting_removal_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_test_acknowledge_posting_removal_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_acknowledge_posting_removal_posting_p", "CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-P", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_acknowledge_posting_removal_posting_initialize_method", "CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_acknowledge_posting_removal_posting_print_method", "CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_cyc_event_test_acknowledge_posting_removal_posting_get_removed_posting_method", "CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-GET-REMOVED-POSTING-METHOD", 1, 0, false);
        declareFunction("cyblack_cyc_event_test_acknowledge_posting_removal_posting_set_removed_posting_method", "CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-SET-REMOVED-POSTING-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_blackboard_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BLACKBOARD-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_cyc_event_blackboard_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BLACKBOARD-INSTANCE", 1, 0, false);
        declareFunction("cyblack_cyc_event_blackboard_p", "CYBLACK-CYC-EVENT-BLACKBOARD-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_cyc_event_blackboard_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_cyc_event_blackboard_file() {
                classes.subloop_new_class(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, CYBLACK_BASIC_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, $sym10$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_C);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, $sym39$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_I);
        subloop_reserved_initialize_cyblack_cyc_event_test_root_posting_class(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, $list_alt41, NIL, $list_alt42);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, INITIALIZE, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, $list_alt46, $list_alt47, $list_alt48);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, PRINT, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_RESPONSIBLE_KS, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, $list_alt46, NIL, $list_alt53);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, GET_RESPONSIBLE_KS, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_GET_RESPONSIBLE_KS_METHOD);
        methods.methods_incorporate_instance_method(SET_RESPONSIBLE_KS, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, $list_alt56, $list_alt57, $list_alt58);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, SET_RESPONSIBLE_KS, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_SET_RESPONSIBLE_KS_METHOD);
        methods.methods_incorporate_instance_method(GET_RESPONSIBLE_POSTING, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, $list_alt46, NIL, $list_alt62);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, GET_RESPONSIBLE_POSTING, $sym63$CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_GET_RESPONSIBLE_POSTING_METHO);
        methods.methods_incorporate_instance_method(SET_RESPONSIBLE_POSTING, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, $list_alt56, $list_alt65, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, SET_RESPONSIBLE_POSTING, $sym68$CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_SET_RESPONSIBLE_POSTING_METHO);
        methods.methods_incorporate_instance_method(GET_TIMESTAMP, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, $list_alt46, NIL, $list_alt70);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, GET_TIMESTAMP, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_GET_TIMESTAMP_METHOD);
        classes.subloop_new_class(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_STIMILATION_POSTING, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_STIMILATION_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_STIMILATION_POSTING, $sym73$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_ST);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_STIMILATION_POSTING, $sym74$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_ST);
        subloop_reserved_initialize_cyblack_cyc_event_test_acknowledge_stimilation_posting_class(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_STIMILATION_POSTING);
        classes.subloop_new_class(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, CYBLACK_CYC_EVENT_TEST_ROOT_POSTING, NIL, NIL, $list_alt76);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, $sym79$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_PO);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, $sym80$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_PO);
        subloop_reserved_initialize_cyblack_cyc_event_test_acknowledge_posting_removal_posting_class(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, $list_alt41, NIL, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, INITIALIZE, $sym83$CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING_INITIA);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, $list_alt56, $list_alt47, $list_alt84);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, PRINT, $sym87$CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING_PRINT_);
        methods.methods_incorporate_instance_method(GET_REMOVED_POSTING, CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, $list_alt46, NIL, $list_alt89);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, GET_REMOVED_POSTING, $sym90$CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING_GET_RE);
        methods.methods_incorporate_instance_method(SET_REMOVED_POSTING, CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, $list_alt56, $list_alt92, $list_alt93);
        methods.subloop_register_instance_method(CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING, SET_REMOVED_POSTING, $sym95$CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING_SET_RE);
        cyblack_defbb.cyblack_record_blackboard_info(CYBLACK_CYC_EVENT_BLACKBOARD, $list_alt97);
        classes.subloop_new_class(CYBLACK_CYC_EVENT_BLACKBOARD, CYBLACK_BASIC_BLACKBOARD, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(CYBLACK_CYC_EVENT_BLACKBOARD, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CYC_EVENT_BLACKBOARD, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BLACKBOARD_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_CYC_EVENT_BLACKBOARD, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BLACKBOARD_INSTANCE);
        subloop_reserved_initialize_cyblack_cyc_event_blackboard_class(CYBLACK_CYC_EVENT_BLACKBOARD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_ROOT_POSTING = makeSymbol("CYBLACK-CYC-EVENT-TEST-ROOT-POSTING");



    static private final SubLList $list_alt2 = list(new SubLObject[]{ list(makeSymbol("RESPONSIBLE-KS"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RESPONSIBLE-POSTING"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TIMESTAMP"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RESPONSIBLE-KS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-RESPONSIBLE-KS"), list(makeSymbol("NEW-RESPONSIBLE-KS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RESPONSIBLE-POSTING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-RESPONSIBLE-POSTING"), list(makeSymbol("NEW-RESPONSIBLE-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMESTAMP"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLInteger $int$22 = makeInteger(22);



    public static final SubLInteger $int$21 = makeInteger(21);

    private static final SubLSymbol RESPONSIBLE_POSTING = makeSymbol("RESPONSIBLE-POSTING");

    private static final SubLSymbol RESPONSIBLE_KS = makeSymbol("RESPONSIBLE-KS");





    static private final SubLSymbol $sym10$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-CLASS");



























    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");





























    static private final SubLSymbol $sym39$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-INSTANCE");



    static private final SubLList $list_alt41 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt42 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("RESPONSIBLE-KS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TIMESTAMP"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym43$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-INITIALIZE-METHOD");



    static private final SubLList $list_alt46 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt47 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt48 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~A: KS=~S, TIME=~S>"), list(makeSymbol("FIF"), list(makeSymbol("GET-DATATYPE"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-DATATYPE-GET-TYPENAME"), list(makeSymbol("GET-DATATYPE"), makeSymbol("SELF"))), list(QUOTE, makeString("Unknown"))), list(makeSymbol("GET-KS"), makeSymbol("SELF")), makeSymbol("TIMESTAMP")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt49$___A__KS__S__TIME__S_ = makeString("#<~A: KS=~S, TIME=~S>");

    static private final SubLString $$$Unknown = makeString("Unknown");

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_PRINT_METHOD = makeSymbol("CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-PRINT-METHOD");

    private static final SubLSymbol GET_RESPONSIBLE_KS = makeSymbol("GET-RESPONSIBLE-KS");

    static private final SubLList $list_alt53 = list(list(RET, makeSymbol("RESPONSIBLE-KS")));

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_GET_RESPONSIBLE_KS_METHOD = makeSymbol("CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-GET-RESPONSIBLE-KS-METHOD");

    private static final SubLSymbol SET_RESPONSIBLE_KS = makeSymbol("SET-RESPONSIBLE-KS");

    static private final SubLList $list_alt56 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt57 = list(makeSymbol("NEW-RESPONSIBLE-KS"));

    static private final SubLList $list_alt58 = list(list(makeSymbol("CSETQ"), makeSymbol("RESPONSIBLE-KS"), makeSymbol("NEW-RESPONSIBLE-KS")), list(RET, makeSymbol("NEW-RESPONSIBLE-KS")));

    static private final SubLSymbol $sym59$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_SET_RESPONSIBLE_KS_METHOD = makeSymbol("CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-SET-RESPONSIBLE-KS-METHOD");

    private static final SubLSymbol GET_RESPONSIBLE_POSTING = makeSymbol("GET-RESPONSIBLE-POSTING");

    static private final SubLList $list_alt62 = list(list(RET, makeSymbol("RESPONSIBLE-POSTING")));

    static private final SubLSymbol $sym63$CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_GET_RESPONSIBLE_POSTING_METHO = makeSymbol("CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-GET-RESPONSIBLE-POSTING-METHOD");

    private static final SubLSymbol SET_RESPONSIBLE_POSTING = makeSymbol("SET-RESPONSIBLE-POSTING");

    static private final SubLList $list_alt65 = list(makeSymbol("NEW-RESPONSIBLE-POSTING"));

    static private final SubLList $list_alt66 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("NEW-RESPONSIBLE-POSTING")), makeString("(SET-RESPONSIBLE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("NEW-RESPONSIBLE-POSTING")), list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("RESPONSIBLE-POSTING"), makeSymbol("NEW-RESPONSIBLE-POSTING")), list(RET, makeSymbol("NEW-RESPONSIBLE-POSTING")));

    static private final SubLSymbol $sym67$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-METHOD");

    static private final SubLSymbol $sym68$CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_SET_RESPONSIBLE_POSTING_METHO = makeSymbol("CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-SET-RESPONSIBLE-POSTING-METHOD");



    static private final SubLList $list_alt70 = list(list(RET, makeSymbol("TIMESTAMP")));

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_ROOT_POSTING_GET_TIMESTAMP_METHOD = makeSymbol("CYBLACK-CYC-EVENT-TEST-ROOT-POSTING-GET-TIMESTAMP-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_STIMILATION_POSTING = makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-STIMILATION-POSTING");

    static private final SubLSymbol $sym73$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_ST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-STIMILATION-POSTING-CLASS");

    static private final SubLSymbol $sym74$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_ST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-STIMILATION-POSTING-INSTANCE");

    private static final SubLSymbol CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING = makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING");

    static private final SubLList $list_alt76 = list(list(makeSymbol("REMOVED-POSTING"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REMOVED-POSTING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REMOVED-POSTING"), list(makeSymbol("NEW-REMOVED-POSTING")), makeKeyword("PUBLIC")));

    public static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLSymbol REMOVED_POSTING = makeSymbol("REMOVED-POSTING");

    static private final SubLSymbol $sym79$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-CLASS");

    static private final SubLSymbol $sym80$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_PO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-INSTANCE");

    static private final SubLList $list_alt81 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("REMOVED-POSTING"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym82$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVA = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-METHOD");

    static private final SubLSymbol $sym83$CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING_INITIA = makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-INITIALIZE-METHOD");

    static private final SubLList $list_alt84 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~A: KS=~S, TIME=~S, POSTING=~S>"), list(makeSymbol("FIF"), list(makeSymbol("GET-DATATYPE"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-DATATYPE-GET-TYPENAME"), list(makeSymbol("GET-DATATYPE"), makeSymbol("SELF"))), list(QUOTE, makeString("Unknown"))), list(makeSymbol("GET-KS"), makeSymbol("SELF")), makeSymbol("TIMESTAMP"), makeSymbol("REMOVED-POSTING")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym85$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVA = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-METHOD");

    static private final SubLString $str_alt86$___A__KS__S__TIME__S__POSTING__S_ = makeString("#<~A: KS=~S, TIME=~S, POSTING=~S>");

    static private final SubLSymbol $sym87$CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING_PRINT_ = makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-PRINT-METHOD");

    private static final SubLSymbol GET_REMOVED_POSTING = makeSymbol("GET-REMOVED-POSTING");

    static private final SubLList $list_alt89 = list(list(RET, makeSymbol("REMOVED-POSTING")));

    static private final SubLSymbol $sym90$CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING_GET_RE = makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-GET-REMOVED-POSTING-METHOD");

    private static final SubLSymbol SET_REMOVED_POSTING = makeSymbol("SET-REMOVED-POSTING");

    static private final SubLList $list_alt92 = list(makeSymbol("NEW-REMOVED-POSTING"));

    static private final SubLList $list_alt93 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("NEW-REMOVED-POSTING")), makeString("(SET-REMOVED-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("NEW-REMOVED-POSTING")), list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("REMOVED-POSTING"), makeSymbol("NEW-REMOVED-POSTING")), list(RET, makeSymbol("NEW-REMOVED-POSTING")));

    static private final SubLSymbol $sym94$OUTER_CATCH_FOR_CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVA = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-METHOD");

    static private final SubLSymbol $sym95$CYBLACK_CYC_EVENT_TEST_ACKNOWLEDGE_POSTING_REMOVAL_POSTING_SET_RE = makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING-SET-REMOVED-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_CYC_EVENT_BLACKBOARD = makeSymbol("CYBLACK-CYC-EVENT-BLACKBOARD");

    static private final SubLList $list_alt97 = list(list(new SubLObject[]{ makeKeyword("TYPE-GRAPH"), list(makeKeyword("ROOT-TYPE"), makeString("EVENT-ROOT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("SYSTEM-EVENT-POSTING"), makeString("EVENT-ROOT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("SUBLISP-EVENT-POSTING"), makeString("SYSTEM-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("APPLICATION-EVENT-POSTING"), makeString("EVENT-ROOT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("CYC-EVENT-POSTING"), makeString("APPLICATION-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("KB-STORE-EVENT-POSTING"), makeString("CYC-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("INFERENCE-EVENT-POSTING"), makeString("CYC-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("SBHL-EVENT-POSTING"), makeString("CYC-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("NL-EVENT-POSTING"), makeString("CYC-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("CYC-APPLICATION-EVENT-POSTING"), makeString("CYC-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING"), makeString("CYC-APPLICATION-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING"), makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("CYC-BROWSER-BASE-EVENT-POSTING"), makeString("CYC-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("CYC-BROWSER-LOGIN-EVENT-POSTING"), makeString("CYC-BROWSER-BASE-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("CYC-BROWSER-SELECTION-EVENT-POSTING"), makeString("CYC-BROWSER-BASE-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("CYC-BROWSER-FORT-SELECTION-EVENT-POSTING"), makeString("CYC-BROWSER-SELECTION-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING"), makeString("CYC-BROWSER-FORT-SELECTION-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("RKF-BASE-EVENT-POSTING"), makeString("CYC-APPLICATION-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("RKF-TRACE-EVENT-POSTING"), makeString("RKF-BASE-EVENT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("UIA-BLUE-EVENT-POSTING"), makeString("RKF-BASE-EVENT-POSTING")), list(makeKeyword("ROOT-TYPE"), makeString("TEST-ROOT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"), makeString("TEST-ROOT-POSTING")), list(makeKeyword("SUBTYPE"), makeString("ACKNOWLEDGE-POSTING-REMOVAL-POSTING"), makeString("TEST-ROOT-POSTING")), list(makeKeyword("ROOT-TYPE"), makeString("ISI-ROOT")), list(makeKeyword("SUBTYPE"), makeString("ISI-DATUM"), makeString("ISI-ROOT")), list(makeKeyword("SUBTYPE"), makeString("FAILED-QUERY"), makeString("ISI-DATUM")), list(makeKeyword("SUBTYPE"), makeString("QUERY-IMPROVEMENT-PROPOSAL"), makeString("ISI-DATUM")) }), list(new SubLObject[]{ makeKeyword("TYPE-TO-POSTING-CLASS-MAP"), list(makeKeyword("POSTING-CLASS"), makeString("EVENT-ROOT-POSTING"), makeSymbol("CYBLACK-CEM-EVENT-ROOT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("SYSTEM-EVENT-POSTING"), makeSymbol("CYBLACK-CEM-SYSTEM-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("SUBLISP-EVENT-POSTING"), makeSymbol("CYBLACK-CEM-SUBLISP-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("APPLICATION-EVENT-POSTING"), makeSymbol("CYBLACK-CEM-APPLICATION-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("CYC-EVENT-POSTING"), makeSymbol("CYBLACK-CEM-CYC-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("KB-STORE-EVENT-POSTING"), makeSymbol("CYBLACK-CEM-KB-STORE-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("INFERENCE-EVENT-POSTING"), makeSymbol("CYBLACK-CEM-INFERENCE-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("SBHL-EVENT-POSTING"), makeSymbol("CYBLACK-CEM-SBHL-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("NL-EVENT-POSTING"), makeSymbol("CYBLACK-CEM-NL-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("CYC-APPLICATION-EVENT-POSTING"), makeSymbol("CYBLACK-CEM-CYC-APPLICATION-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING"), makeSymbol("CYBLACK-MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING"), makeSymbol("CYBLACK-UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("CYC-BROWSER-BASE-EVENT-POSTING"), makeSymbol("CYBLACK-CYC-BROWSER-BASE-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("CYC-BROWSER-LOGIN-EVENT-POSTING"), makeSymbol("CYBLACK-CYC-BROWSER-LOGIN-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("CYC-BROWSER-SELECTION-EVENT-POSTING"), makeSymbol("CYBLACK-CYC-BROWSER-SELECTION-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("CYC-BROWSER-FORT-SELECTION-EVENT-POSTING"), makeSymbol("CYBLACK-CYC-BROWSER-FORT-SELECTION-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING"), makeSymbol("CYBLACK-CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("RKF-BASE-EVENT-POSTING"), makeSymbol("CYBLACK-RKF-BASE-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("RKF-TRACE-EVENT-POSTING"), makeSymbol("CYBLACK-RKF-TRACE-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("UIA-BLUE-EVENT-POSTING"), makeSymbol("CYBLACK-UIA-BLUE-EVENT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("TEST-ROOT-POSTING"), makeSymbol("CYBLACK-CYC-EVENT-TEST-ROOT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"), makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-STIMILATION-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("ACKNOWLEDGE-POSTING-REMOVAL-POSTING"), makeSymbol("CYBLACK-CYC-EVENT-TEST-ACKNOWLEDGE-POSTING-REMOVAL-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("ISI-ROOT"), makeSymbol("ISI-ROOT-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("ISI-DATUM"), makeSymbol("ISI-DATUM-POSTING")), list(makeKeyword("POSTING-CLASS"), makeString("FAILED-QUERY"), makeSymbol("ISI-PROBLEM")), list(makeKeyword("POSTING-CLASS"), makeString("QUERY-IMPROVEMENT-PROPOSAL"), makeSymbol("ISI-QUERY-IMPROVEMENT-PROPOSAL")) }), list(new SubLObject[]{ makeKeyword("TYPE-TO-PANEL-CLASS-MAP"), list(makeKeyword("PANEL-CLASS"), makeString("EVENT-ROOT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("SYSTEM-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("SUBLISP-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("APPLICATION-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("CYC-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("KB-STORE-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("INFERENCE-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("SBHL-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("NL-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("CYC-APPLICATION-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("MISSING-KNOWLEDGE-DISCOVERY-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("UNLEXIFIED-TERM-DISCOVERY-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("CYC-BROWSER-BASE-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("CYC-BROWSER-LOGIN-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("CYC-BROWSER-SELECTION-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("CYC-BROWSER-FORT-SELECTION-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("CYC-BROWSER-CONSTANT-SELECTION-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("RKF-BASE-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("RKF-TRACE-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("UIA-BLUE-EVENT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("TEST-ROOT-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("ACKNOWLEDGE-STIMULATION-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("ACKNOWLEDGE-POSTING-REMOVAL-POSTING"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("ISI-ROOT"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("ISI-DATUM"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("FAILED-QUERY"), makeSymbol("CYBLACK-BASIC-PANEL")), list(makeKeyword("PANEL-CLASS"), makeString("QUERY-IMPROVEMENT-PROPOSAL"), makeSymbol("CYBLACK-BASIC-PANEL")) }));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BLACKBOARD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BLACKBOARD-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CYC_EVENT_BLACKBOARD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CYC-EVENT-BLACKBOARD-INSTANCE");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_cyc_event_blackboard_file();
    }

    public void initializeVariables() {
        init_cyblack_cyc_event_blackboard_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_cyc_event_blackboard_file();
    }
}

