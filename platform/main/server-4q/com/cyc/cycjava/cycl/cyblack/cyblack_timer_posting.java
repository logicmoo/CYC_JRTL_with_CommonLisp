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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-TIMER-POSTING
 *  source file: /cyc/top/cycl/cyblack/cyblack-timer-posting.lisp
 *  created:     2019/07/03 17:38:44
 */
public final class cyblack_timer_posting extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_timer_posting() {
    }

    public static final SubLFile me = new cyblack_timer_posting();


    // // Definitions
    public static final SubLObject get_cyblack_timer_posting_interval(SubLObject v_cyblack_timer_posting) {
        return classes.subloop_get_instance_slot(v_cyblack_timer_posting, $int$21);
    }

    public static final SubLObject set_cyblack_timer_posting_interval(SubLObject v_cyblack_timer_posting, SubLObject value) {
        return classes.subloop_set_instance_slot(v_cyblack_timer_posting, value, $int$21);
    }

    public static final SubLObject get_cyblack_timer_posting_universal_time(SubLObject v_cyblack_timer_posting) {
        return classes.subloop_get_instance_slot(v_cyblack_timer_posting, TWENTY_INTEGER);
    }

    public static final SubLObject set_cyblack_timer_posting_universal_time(SubLObject v_cyblack_timer_posting, SubLObject value) {
        return classes.subloop_set_instance_slot(v_cyblack_timer_posting, value, TWENTY_INTEGER);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_timer_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_timer_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_timer_posting_p(SubLObject v_cyblack_timer_posting) {
        return classes.subloop_instanceof_class(v_cyblack_timer_posting, CYBLACK_TIMER_POSTING);
    }

    public static final SubLObject cyblack_timer_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_timer_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            SubLObject universal_time = get_cyblack_timer_posting_universal_time(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_initialize_method(self);
                    universal_time = get_universal_time();
                    interval = NIL;
                    sublisp_throw($sym41$OUTER_CATCH_FOR_CYBLACK_TIMER_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                            set_cyblack_timer_posting_universal_time(self, universal_time);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_timer_posting_method = Errors.handleThrowable(ccatch_env_var, $sym41$OUTER_CATCH_FOR_CYBLACK_TIMER_POSTING_METHOD);
            }
            return catch_var_for_cyblack_timer_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_second_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_second_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_second_posting_p(SubLObject cyblack_second_posting) {
        return classes.subloop_instanceof_class(cyblack_second_posting, CYBLACK_SECOND_POSTING);
    }

    public static final SubLObject cyblack_second_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_second_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $SECOND;
                    sublisp_throw($sym48$OUTER_CATCH_FOR_CYBLACK_SECOND_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_second_posting_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_CYBLACK_SECOND_POSTING_METHOD);
            }
            return catch_var_for_cyblack_second_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_quarter_minute_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_quarter_minute_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_quarter_minute_posting_p(SubLObject cyblack_quarter_minute_posting) {
        return classes.subloop_instanceof_class(cyblack_quarter_minute_posting, CYBLACK_QUARTER_MINUTE_POSTING);
    }

    public static final SubLObject cyblack_quarter_minute_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_quarter_minute_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $QUARTER_MINUTE;
                    sublisp_throw($sym55$OUTER_CATCH_FOR_CYBLACK_QUARTER_MINUTE_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_quarter_minute_posting_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_CYBLACK_QUARTER_MINUTE_POSTING_METHOD);
            }
            return catch_var_for_cyblack_quarter_minute_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_minute_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_minute_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_half_minute_posting_p(SubLObject cyblack_half_minute_posting) {
        return classes.subloop_instanceof_class(cyblack_half_minute_posting, CYBLACK_HALF_MINUTE_POSTING);
    }

    public static final SubLObject cyblack_half_minute_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_half_minute_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $HALF_MINUTE;
                    sublisp_throw($sym62$OUTER_CATCH_FOR_CYBLACK_HALF_MINUTE_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_half_minute_posting_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_CYBLACK_HALF_MINUTE_POSTING_METHOD);
            }
            return catch_var_for_cyblack_half_minute_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_minute_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_minute_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_minute_posting_p(SubLObject cyblack_minute_posting) {
        return classes.subloop_instanceof_class(cyblack_minute_posting, CYBLACK_MINUTE_POSTING);
    }

    public static final SubLObject cyblack_minute_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_minute_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $MINUTE;
                    sublisp_throw($sym69$OUTER_CATCH_FOR_CYBLACK_MINUTE_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_minute_posting_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_CYBLACK_MINUTE_POSTING_METHOD);
            }
            return catch_var_for_cyblack_minute_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_quarter_hour_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_quarter_hour_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_quarter_hour_posting_p(SubLObject cyblack_quarter_hour_posting) {
        return classes.subloop_instanceof_class(cyblack_quarter_hour_posting, CYBLACK_QUARTER_HOUR_POSTING);
    }

    public static final SubLObject cyblack_quarter_hour_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_quarter_hour_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $QUARTER_HOUR;
                    sublisp_throw($sym76$OUTER_CATCH_FOR_CYBLACK_QUARTER_HOUR_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_quarter_hour_posting_method = Errors.handleThrowable(ccatch_env_var, $sym76$OUTER_CATCH_FOR_CYBLACK_QUARTER_HOUR_POSTING_METHOD);
            }
            return catch_var_for_cyblack_quarter_hour_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_hour_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_hour_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_half_hour_posting_p(SubLObject cyblack_half_hour_posting) {
        return classes.subloop_instanceof_class(cyblack_half_hour_posting, CYBLACK_HALF_HOUR_POSTING);
    }

    public static final SubLObject cyblack_half_hour_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_half_hour_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $HALF_HOUR;
                    sublisp_throw($sym83$OUTER_CATCH_FOR_CYBLACK_HALF_HOUR_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_half_hour_posting_method = Errors.handleThrowable(ccatch_env_var, $sym83$OUTER_CATCH_FOR_CYBLACK_HALF_HOUR_POSTING_METHOD);
            }
            return catch_var_for_cyblack_half_hour_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_hour_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_hour_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_hour_posting_p(SubLObject cyblack_hour_posting) {
        return classes.subloop_instanceof_class(cyblack_hour_posting, CYBLACK_HOUR_POSTING);
    }

    public static final SubLObject cyblack_hour_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_hour_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $HOUR;
                    sublisp_throw($sym90$OUTER_CATCH_FOR_CYBLACK_HOUR_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_hour_posting_method = Errors.handleThrowable(ccatch_env_var, $sym90$OUTER_CATCH_FOR_CYBLACK_HOUR_POSTING_METHOD);
            }
            return catch_var_for_cyblack_hour_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_two_hours_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_two_hours_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_two_hours_posting_p(SubLObject cyblack_two_hours_posting) {
        return classes.subloop_instanceof_class(cyblack_two_hours_posting, CYBLACK_TWO_HOURS_POSTING);
    }

    public static final SubLObject cyblack_two_hours_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_two_hours_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $TWO_HOURS;
                    sublisp_throw($sym97$OUTER_CATCH_FOR_CYBLACK_TWO_HOURS_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_two_hours_posting_method = Errors.handleThrowable(ccatch_env_var, $sym97$OUTER_CATCH_FOR_CYBLACK_TWO_HOURS_POSTING_METHOD);
            }
            return catch_var_for_cyblack_two_hours_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_three_hours_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_three_hours_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_three_hours_posting_p(SubLObject cyblack_three_hours_posting) {
        return classes.subloop_instanceof_class(cyblack_three_hours_posting, CYBLACK_THREE_HOURS_POSTING);
    }

    public static final SubLObject cyblack_three_hours_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_three_hours_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $THREE_HOURS;
                    sublisp_throw($sym104$OUTER_CATCH_FOR_CYBLACK_THREE_HOURS_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_three_hours_posting_method = Errors.handleThrowable(ccatch_env_var, $sym104$OUTER_CATCH_FOR_CYBLACK_THREE_HOURS_POSTING_METHOD);
            }
            return catch_var_for_cyblack_three_hours_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_four_hours_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_four_hours_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_four_hours_posting_p(SubLObject cyblack_four_hours_posting) {
        return classes.subloop_instanceof_class(cyblack_four_hours_posting, CYBLACK_FOUR_HOURS_POSTING);
    }

    public static final SubLObject cyblack_four_hours_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_four_hours_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $FOUR_HOURS;
                    sublisp_throw($sym111$OUTER_CATCH_FOR_CYBLACK_FOUR_HOURS_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_four_hours_posting_method = Errors.handleThrowable(ccatch_env_var, $sym111$OUTER_CATCH_FOR_CYBLACK_FOUR_HOURS_POSTING_METHOD);
            }
            return catch_var_for_cyblack_four_hours_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_five_hours_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_five_hours_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_five_hours_posting_p(SubLObject cyblack_five_hours_posting) {
        return classes.subloop_instanceof_class(cyblack_five_hours_posting, CYBLACK_FIVE_HOURS_POSTING);
    }

    public static final SubLObject cyblack_five_hours_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_five_hours_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $FIVE_HOURS;
                    sublisp_throw($sym118$OUTER_CATCH_FOR_CYBLACK_FIVE_HOURS_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_five_hours_posting_method = Errors.handleThrowable(ccatch_env_var, $sym118$OUTER_CATCH_FOR_CYBLACK_FIVE_HOURS_POSTING_METHOD);
            }
            return catch_var_for_cyblack_five_hours_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_six_hours_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_six_hours_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_six_hours_posting_p(SubLObject cyblack_six_hours_posting) {
        return classes.subloop_instanceof_class(cyblack_six_hours_posting, CYBLACK_SIX_HOURS_POSTING);
    }

    public static final SubLObject cyblack_six_hours_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_six_hours_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $SIX_HOURS;
                    sublisp_throw($sym125$OUTER_CATCH_FOR_CYBLACK_SIX_HOURS_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_six_hours_posting_method = Errors.handleThrowable(ccatch_env_var, $sym125$OUTER_CATCH_FOR_CYBLACK_SIX_HOURS_POSTING_METHOD);
            }
            return catch_var_for_cyblack_six_hours_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_seven_hours_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_seven_hours_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_seven_hours_posting_p(SubLObject cyblack_seven_hours_posting) {
        return classes.subloop_instanceof_class(cyblack_seven_hours_posting, CYBLACK_SEVEN_HOURS_POSTING);
    }

    public static final SubLObject cyblack_seven_hours_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_seven_hours_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $SEVEN_HOURS;
                    sublisp_throw($sym132$OUTER_CATCH_FOR_CYBLACK_SEVEN_HOURS_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_seven_hours_posting_method = Errors.handleThrowable(ccatch_env_var, $sym132$OUTER_CATCH_FOR_CYBLACK_SEVEN_HOURS_POSTING_METHOD);
            }
            return catch_var_for_cyblack_seven_hours_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_eight_hours_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_eight_hours_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_eight_hours_posting_p(SubLObject cyblack_eight_hours_posting) {
        return classes.subloop_instanceof_class(cyblack_eight_hours_posting, CYBLACK_EIGHT_HOURS_POSTING);
    }

    public static final SubLObject cyblack_eight_hours_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_eight_hours_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $EIGHT_HOURS;
                    sublisp_throw($sym139$OUTER_CATCH_FOR_CYBLACK_EIGHT_HOURS_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_eight_hours_posting_method = Errors.handleThrowable(ccatch_env_var, $sym139$OUTER_CATCH_FOR_CYBLACK_EIGHT_HOURS_POSTING_METHOD);
            }
            return catch_var_for_cyblack_eight_hours_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_nine_hours_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_nine_hours_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_nine_hours_posting_p(SubLObject cyblack_nine_hours_posting) {
        return classes.subloop_instanceof_class(cyblack_nine_hours_posting, CYBLACK_NINE_HOURS_POSTING);
    }

    public static final SubLObject cyblack_nine_hours_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_nine_hours_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $NINE_HOURS;
                    sublisp_throw($sym146$OUTER_CATCH_FOR_CYBLACK_NINE_HOURS_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_nine_hours_posting_method = Errors.handleThrowable(ccatch_env_var, $sym146$OUTER_CATCH_FOR_CYBLACK_NINE_HOURS_POSTING_METHOD);
            }
            return catch_var_for_cyblack_nine_hours_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_ten_hours_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_ten_hours_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_ten_hours_posting_p(SubLObject cyblack_ten_hours_posting) {
        return classes.subloop_instanceof_class(cyblack_ten_hours_posting, CYBLACK_TEN_HOURS_POSTING);
    }

    public static final SubLObject cyblack_ten_hours_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ten_hours_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $TEN_HOURS;
                    sublisp_throw($sym153$OUTER_CATCH_FOR_CYBLACK_TEN_HOURS_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ten_hours_posting_method = Errors.handleThrowable(ccatch_env_var, $sym153$OUTER_CATCH_FOR_CYBLACK_TEN_HOURS_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ten_hours_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_eleven_hours_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_eleven_hours_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_eleven_hours_posting_p(SubLObject cyblack_eleven_hours_posting) {
        return classes.subloop_instanceof_class(cyblack_eleven_hours_posting, CYBLACK_ELEVEN_HOURS_POSTING);
    }

    public static final SubLObject cyblack_eleven_hours_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_eleven_hours_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $ELEVEN_HOURS;
                    sublisp_throw($sym160$OUTER_CATCH_FOR_CYBLACK_ELEVEN_HOURS_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_eleven_hours_posting_method = Errors.handleThrowable(ccatch_env_var, $sym160$OUTER_CATCH_FOR_CYBLACK_ELEVEN_HOURS_POSTING_METHOD);
            }
            return catch_var_for_cyblack_eleven_hours_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_day_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_half_day_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_half_day_posting_p(SubLObject cyblack_half_day_posting) {
        return classes.subloop_instanceof_class(cyblack_half_day_posting, CYBLACK_HALF_DAY_POSTING);
    }

    public static final SubLObject cyblack_half_day_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_half_day_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $HALF_DAY;
                    sublisp_throw($sym167$OUTER_CATCH_FOR_CYBLACK_HALF_DAY_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_half_day_posting_method = Errors.handleThrowable(ccatch_env_var, $sym167$OUTER_CATCH_FOR_CYBLACK_HALF_DAY_POSTING_METHOD);
            }
            return catch_var_for_cyblack_half_day_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_day_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_day_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_day_posting_p(SubLObject cyblack_day_posting) {
        return classes.subloop_instanceof_class(cyblack_day_posting, CYBLACK_DAY_POSTING);
    }

    public static final SubLObject cyblack_day_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_day_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $DAY;
                    sublisp_throw($sym174$OUTER_CATCH_FOR_CYBLACK_DAY_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_day_posting_method = Errors.handleThrowable(ccatch_env_var, $sym174$OUTER_CATCH_FOR_CYBLACK_DAY_POSTING_METHOD);
            }
            return catch_var_for_cyblack_day_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_week_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_week_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_week_posting_p(SubLObject cyblack_week_posting) {
        return classes.subloop_instanceof_class(cyblack_week_posting, CYBLACK_WEEK_POSTING);
    }

    public static final SubLObject cyblack_week_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_week_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $WEEK;
                    sublisp_throw($sym181$OUTER_CATCH_FOR_CYBLACK_WEEK_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_week_posting_method = Errors.handleThrowable(ccatch_env_var, $sym181$OUTER_CATCH_FOR_CYBLACK_WEEK_POSTING_METHOD);
            }
            return catch_var_for_cyblack_week_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_month_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_month_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_month_posting_p(SubLObject cyblack_month_posting) {
        return classes.subloop_instanceof_class(cyblack_month_posting, CYBLACK_MONTH_POSTING);
    }

    public static final SubLObject cyblack_month_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_month_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $MONTH;
                    sublisp_throw($sym188$OUTER_CATCH_FOR_CYBLACK_MONTH_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_month_posting_method = Errors.handleThrowable(ccatch_env_var, $sym188$OUTER_CATCH_FOR_CYBLACK_MONTH_POSTING_METHOD);
            }
            return catch_var_for_cyblack_month_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_year_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_year_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TIMER_POSTING, INTERVAL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_year_posting_p(SubLObject cyblack_year_posting) {
        return classes.subloop_instanceof_class(cyblack_year_posting, CYBLACK_YEAR_POSTING);
    }

    public static final SubLObject cyblack_year_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_year_posting_method = NIL;
            SubLObject interval = get_cyblack_timer_posting_interval(self);
            try {
                try {
                    cyblack_timer_posting_initialize_method(self);
                    interval = $YEAR;
                    sublisp_throw($sym195$OUTER_CATCH_FOR_CYBLACK_YEAR_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_timer_posting_interval(self, interval);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_year_posting_method = Errors.handleThrowable(ccatch_env_var, $sym195$OUTER_CATCH_FOR_CYBLACK_YEAR_POSTING_METHOD);
            }
            return catch_var_for_cyblack_year_posting_method;
        }
    }

    public static final SubLObject declare_cyblack_timer_posting_file() {
        declareFunction("get_cyblack_timer_posting_interval", "GET-CYBLACK-TIMER-POSTING-INTERVAL", 1, 0, false);
        declareFunction("set_cyblack_timer_posting_interval", "SET-CYBLACK-TIMER-POSTING-INTERVAL", 2, 0, false);
        declareFunction("get_cyblack_timer_posting_universal_time", "GET-CYBLACK-TIMER-POSTING-UNIVERSAL-TIME", 1, 0, false);
        declareFunction("set_cyblack_timer_posting_universal_time", "SET-CYBLACK-TIMER-POSTING-UNIVERSAL-TIME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_timer_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TIMER-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_timer_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TIMER-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_timer_posting_p", "CYBLACK-TIMER-POSTING-P", 1, 0, false);
        declareFunction("cyblack_timer_posting_initialize_method", "CYBLACK-TIMER-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_second_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SECOND-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_second_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SECOND-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_second_posting_p", "CYBLACK-SECOND-POSTING-P", 1, 0, false);
        declareFunction("cyblack_second_posting_initialize_method", "CYBLACK-SECOND-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_quarter_minute_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-MINUTE-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_quarter_minute_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-MINUTE-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_quarter_minute_posting_p", "CYBLACK-QUARTER-MINUTE-POSTING-P", 1, 0, false);
        declareFunction("cyblack_quarter_minute_posting_initialize_method", "CYBLACK-QUARTER-MINUTE-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_minute_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-MINUTE-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_minute_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-MINUTE-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_half_minute_posting_p", "CYBLACK-HALF-MINUTE-POSTING-P", 1, 0, false);
        declareFunction("cyblack_half_minute_posting_initialize_method", "CYBLACK-HALF-MINUTE-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_minute_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MINUTE-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_minute_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MINUTE-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_minute_posting_p", "CYBLACK-MINUTE-POSTING-P", 1, 0, false);
        declareFunction("cyblack_minute_posting_initialize_method", "CYBLACK-MINUTE-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_quarter_hour_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-HOUR-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_quarter_hour_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-HOUR-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_quarter_hour_posting_p", "CYBLACK-QUARTER-HOUR-POSTING-P", 1, 0, false);
        declareFunction("cyblack_quarter_hour_posting_initialize_method", "CYBLACK-QUARTER-HOUR-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_hour_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-HOUR-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_hour_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-HOUR-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_half_hour_posting_p", "CYBLACK-HALF-HOUR-POSTING-P", 1, 0, false);
        declareFunction("cyblack_half_hour_posting_initialize_method", "CYBLACK-HALF-HOUR-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_hour_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HOUR-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_hour_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HOUR-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_hour_posting_p", "CYBLACK-HOUR-POSTING-P", 1, 0, false);
        declareFunction("cyblack_hour_posting_initialize_method", "CYBLACK-HOUR-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_two_hours_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TWO-HOURS-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_two_hours_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TWO-HOURS-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_two_hours_posting_p", "CYBLACK-TWO-HOURS-POSTING-P", 1, 0, false);
        declareFunction("cyblack_two_hours_posting_initialize_method", "CYBLACK-TWO-HOURS-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_three_hours_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-THREE-HOURS-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_three_hours_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-THREE-HOURS-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_three_hours_posting_p", "CYBLACK-THREE-HOURS-POSTING-P", 1, 0, false);
        declareFunction("cyblack_three_hours_posting_initialize_method", "CYBLACK-THREE-HOURS-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_four_hours_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FOUR-HOURS-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_four_hours_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FOUR-HOURS-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_four_hours_posting_p", "CYBLACK-FOUR-HOURS-POSTING-P", 1, 0, false);
        declareFunction("cyblack_four_hours_posting_initialize_method", "CYBLACK-FOUR-HOURS-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_five_hours_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FIVE-HOURS-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_five_hours_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FIVE-HOURS-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_five_hours_posting_p", "CYBLACK-FIVE-HOURS-POSTING-P", 1, 0, false);
        declareFunction("cyblack_five_hours_posting_initialize_method", "CYBLACK-FIVE-HOURS-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_six_hours_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SIX-HOURS-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_six_hours_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SIX-HOURS-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_six_hours_posting_p", "CYBLACK-SIX-HOURS-POSTING-P", 1, 0, false);
        declareFunction("cyblack_six_hours_posting_initialize_method", "CYBLACK-SIX-HOURS-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_seven_hours_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEVEN-HOURS-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_seven_hours_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEVEN-HOURS-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_seven_hours_posting_p", "CYBLACK-SEVEN-HOURS-POSTING-P", 1, 0, false);
        declareFunction("cyblack_seven_hours_posting_initialize_method", "CYBLACK-SEVEN-HOURS-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_eight_hours_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EIGHT-HOURS-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_eight_hours_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EIGHT-HOURS-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_eight_hours_posting_p", "CYBLACK-EIGHT-HOURS-POSTING-P", 1, 0, false);
        declareFunction("cyblack_eight_hours_posting_initialize_method", "CYBLACK-EIGHT-HOURS-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_nine_hours_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-NINE-HOURS-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_nine_hours_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-NINE-HOURS-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_nine_hours_posting_p", "CYBLACK-NINE-HOURS-POSTING-P", 1, 0, false);
        declareFunction("cyblack_nine_hours_posting_initialize_method", "CYBLACK-NINE-HOURS-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_ten_hours_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TEN-HOURS-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_ten_hours_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TEN-HOURS-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_ten_hours_posting_p", "CYBLACK-TEN-HOURS-POSTING-P", 1, 0, false);
        declareFunction("cyblack_ten_hours_posting_initialize_method", "CYBLACK-TEN-HOURS-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_eleven_hours_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ELEVEN-HOURS-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_eleven_hours_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ELEVEN-HOURS-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_eleven_hours_posting_p", "CYBLACK-ELEVEN-HOURS-POSTING-P", 1, 0, false);
        declareFunction("cyblack_eleven_hours_posting_initialize_method", "CYBLACK-ELEVEN-HOURS-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_day_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-DAY-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_half_day_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-DAY-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_half_day_posting_p", "CYBLACK-HALF-DAY-POSTING-P", 1, 0, false);
        declareFunction("cyblack_half_day_posting_initialize_method", "CYBLACK-HALF-DAY-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_day_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DAY-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_day_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DAY-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_day_posting_p", "CYBLACK-DAY-POSTING-P", 1, 0, false);
        declareFunction("cyblack_day_posting_initialize_method", "CYBLACK-DAY-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_week_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-WEEK-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_week_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-WEEK-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_week_posting_p", "CYBLACK-WEEK-POSTING-P", 1, 0, false);
        declareFunction("cyblack_week_posting_initialize_method", "CYBLACK-WEEK-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_month_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONTH-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_month_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONTH-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_month_posting_p", "CYBLACK-MONTH-POSTING-P", 1, 0, false);
        declareFunction("cyblack_month_posting_initialize_method", "CYBLACK-MONTH-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_year_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-YEAR-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_year_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-YEAR-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_year_posting_p", "CYBLACK-YEAR-POSTING-P", 1, 0, false);
        declareFunction("cyblack_year_posting_initialize_method", "CYBLACK-YEAR-POSTING-INITIALIZE-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_timer_posting_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_timer_posting_file() {
                classes.subloop_new_class(CYBLACK_TIMER_POSTING, CYBLACK_BASIC_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_TIMER_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_TIMER_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TIMER_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_TIMER_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TIMER_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_timer_posting_class(CYBLACK_TIMER_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_TIMER_POSTING, $list_alt39, NIL, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_TIMER_POSTING, INITIALIZE, CYBLACK_TIMER_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_SECOND_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_SECOND_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SECOND_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SECOND_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SECOND_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SECOND_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_second_posting_class(CYBLACK_SECOND_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SECOND_POSTING, $list_alt39, NIL, $list_alt47);
        methods.subloop_register_instance_method(CYBLACK_SECOND_POSTING, INITIALIZE, CYBLACK_SECOND_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_QUARTER_MINUTE_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_QUARTER_MINUTE_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_QUARTER_MINUTE_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_MINUTE_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_QUARTER_MINUTE_POSTING, $sym53$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_MINUTE_POSTING_INSTAN);
        subloop_reserved_initialize_cyblack_quarter_minute_posting_class(CYBLACK_QUARTER_MINUTE_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_QUARTER_MINUTE_POSTING, $list_alt39, NIL, $list_alt54);
        methods.subloop_register_instance_method(CYBLACK_QUARTER_MINUTE_POSTING, INITIALIZE, CYBLACK_QUARTER_MINUTE_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_HALF_MINUTE_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_HALF_MINUTE_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_HALF_MINUTE_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_MINUTE_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_HALF_MINUTE_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_MINUTE_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_half_minute_posting_class(CYBLACK_HALF_MINUTE_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_HALF_MINUTE_POSTING, $list_alt39, NIL, $list_alt61);
        methods.subloop_register_instance_method(CYBLACK_HALF_MINUTE_POSTING, INITIALIZE, CYBLACK_HALF_MINUTE_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_MINUTE_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_MINUTE_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_MINUTE_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MINUTE_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_MINUTE_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MINUTE_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_minute_posting_class(CYBLACK_MINUTE_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_MINUTE_POSTING, $list_alt39, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_MINUTE_POSTING, INITIALIZE, CYBLACK_MINUTE_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_QUARTER_HOUR_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_QUARTER_HOUR_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_QUARTER_HOUR_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_HOUR_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_QUARTER_HOUR_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_HOUR_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_quarter_hour_posting_class(CYBLACK_QUARTER_HOUR_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_QUARTER_HOUR_POSTING, $list_alt39, NIL, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_QUARTER_HOUR_POSTING, INITIALIZE, CYBLACK_QUARTER_HOUR_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_HALF_HOUR_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_HALF_HOUR_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_HALF_HOUR_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_HOUR_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_HALF_HOUR_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_HOUR_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_half_hour_posting_class(CYBLACK_HALF_HOUR_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_HALF_HOUR_POSTING, $list_alt39, NIL, $list_alt82);
        methods.subloop_register_instance_method(CYBLACK_HALF_HOUR_POSTING, INITIALIZE, CYBLACK_HALF_HOUR_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_HOUR_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_HOUR_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_HOUR_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HOUR_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_HOUR_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HOUR_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_hour_posting_class(CYBLACK_HOUR_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_HOUR_POSTING, $list_alt39, NIL, $list_alt89);
        methods.subloop_register_instance_method(CYBLACK_HOUR_POSTING, INITIALIZE, CYBLACK_HOUR_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_TWO_HOURS_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_TWO_HOURS_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_TWO_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TWO_HOURS_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_TWO_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TWO_HOURS_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_two_hours_posting_class(CYBLACK_TWO_HOURS_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_TWO_HOURS_POSTING, $list_alt39, NIL, $list_alt96);
        methods.subloop_register_instance_method(CYBLACK_TWO_HOURS_POSTING, INITIALIZE, CYBLACK_TWO_HOURS_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_THREE_HOURS_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_THREE_HOURS_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_THREE_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_THREE_HOURS_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_THREE_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_THREE_HOURS_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_three_hours_posting_class(CYBLACK_THREE_HOURS_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_THREE_HOURS_POSTING, $list_alt39, NIL, $list_alt103);
        methods.subloop_register_instance_method(CYBLACK_THREE_HOURS_POSTING, INITIALIZE, CYBLACK_THREE_HOURS_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_FOUR_HOURS_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_FOUR_HOURS_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_FOUR_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FOUR_HOURS_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_FOUR_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FOUR_HOURS_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_four_hours_posting_class(CYBLACK_FOUR_HOURS_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_FOUR_HOURS_POSTING, $list_alt39, NIL, $list_alt110);
        methods.subloop_register_instance_method(CYBLACK_FOUR_HOURS_POSTING, INITIALIZE, CYBLACK_FOUR_HOURS_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_FIVE_HOURS_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_FIVE_HOURS_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_FIVE_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FIVE_HOURS_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_FIVE_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FIVE_HOURS_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_five_hours_posting_class(CYBLACK_FIVE_HOURS_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_FIVE_HOURS_POSTING, $list_alt39, NIL, $list_alt117);
        methods.subloop_register_instance_method(CYBLACK_FIVE_HOURS_POSTING, INITIALIZE, CYBLACK_FIVE_HOURS_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_SIX_HOURS_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_SIX_HOURS_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SIX_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SIX_HOURS_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SIX_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SIX_HOURS_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_six_hours_posting_class(CYBLACK_SIX_HOURS_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SIX_HOURS_POSTING, $list_alt39, NIL, $list_alt124);
        methods.subloop_register_instance_method(CYBLACK_SIX_HOURS_POSTING, INITIALIZE, CYBLACK_SIX_HOURS_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_SEVEN_HOURS_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_SEVEN_HOURS_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SEVEN_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEVEN_HOURS_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SEVEN_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEVEN_HOURS_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_seven_hours_posting_class(CYBLACK_SEVEN_HOURS_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SEVEN_HOURS_POSTING, $list_alt39, NIL, $list_alt131);
        methods.subloop_register_instance_method(CYBLACK_SEVEN_HOURS_POSTING, INITIALIZE, CYBLACK_SEVEN_HOURS_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_EIGHT_HOURS_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_EIGHT_HOURS_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EIGHT_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EIGHT_HOURS_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EIGHT_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EIGHT_HOURS_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_eight_hours_posting_class(CYBLACK_EIGHT_HOURS_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EIGHT_HOURS_POSTING, $list_alt39, NIL, $list_alt138);
        methods.subloop_register_instance_method(CYBLACK_EIGHT_HOURS_POSTING, INITIALIZE, CYBLACK_EIGHT_HOURS_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_NINE_HOURS_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_NINE_HOURS_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_NINE_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_NINE_HOURS_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_NINE_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_NINE_HOURS_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_nine_hours_posting_class(CYBLACK_NINE_HOURS_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_NINE_HOURS_POSTING, $list_alt39, NIL, $list_alt145);
        methods.subloop_register_instance_method(CYBLACK_NINE_HOURS_POSTING, INITIALIZE, CYBLACK_NINE_HOURS_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_TEN_HOURS_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_TEN_HOURS_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_TEN_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TEN_HOURS_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_TEN_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TEN_HOURS_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_ten_hours_posting_class(CYBLACK_TEN_HOURS_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_TEN_HOURS_POSTING, $list_alt39, NIL, $list_alt152);
        methods.subloop_register_instance_method(CYBLACK_TEN_HOURS_POSTING, INITIALIZE, CYBLACK_TEN_HOURS_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_ELEVEN_HOURS_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_ELEVEN_HOURS_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_ELEVEN_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ELEVEN_HOURS_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_ELEVEN_HOURS_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ELEVEN_HOURS_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_eleven_hours_posting_class(CYBLACK_ELEVEN_HOURS_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ELEVEN_HOURS_POSTING, $list_alt39, NIL, $list_alt159);
        methods.subloop_register_instance_method(CYBLACK_ELEVEN_HOURS_POSTING, INITIALIZE, CYBLACK_ELEVEN_HOURS_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_HALF_DAY_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_HALF_DAY_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_HALF_DAY_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_DAY_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_HALF_DAY_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_DAY_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_half_day_posting_class(CYBLACK_HALF_DAY_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_HALF_DAY_POSTING, $list_alt39, NIL, $list_alt166);
        methods.subloop_register_instance_method(CYBLACK_HALF_DAY_POSTING, INITIALIZE, CYBLACK_HALF_DAY_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_DAY_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_DAY_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DAY_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DAY_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DAY_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DAY_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_day_posting_class(CYBLACK_DAY_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DAY_POSTING, $list_alt39, NIL, $list_alt173);
        methods.subloop_register_instance_method(CYBLACK_DAY_POSTING, INITIALIZE, CYBLACK_DAY_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_WEEK_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_WEEK_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_WEEK_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_WEEK_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_WEEK_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_WEEK_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_week_posting_class(CYBLACK_WEEK_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_WEEK_POSTING, $list_alt39, NIL, $list_alt180);
        methods.subloop_register_instance_method(CYBLACK_WEEK_POSTING, INITIALIZE, CYBLACK_WEEK_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_MONTH_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_MONTH_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_MONTH_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONTH_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_MONTH_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONTH_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_month_posting_class(CYBLACK_MONTH_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_MONTH_POSTING, $list_alt39, NIL, $list_alt187);
        methods.subloop_register_instance_method(CYBLACK_MONTH_POSTING, INITIALIZE, CYBLACK_MONTH_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_YEAR_POSTING, CYBLACK_TIMER_POSTING, NIL, NIL, $list_alt44);
        classes.class_set_implements_slot_listeners(CYBLACK_YEAR_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_YEAR_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_YEAR_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_YEAR_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_YEAR_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_year_posting_class(CYBLACK_YEAR_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_YEAR_POSTING, $list_alt39, NIL, $list_alt194);
        methods.subloop_register_instance_method(CYBLACK_YEAR_POSTING, INITIALIZE, CYBLACK_YEAR_POSTING_INITIALIZE_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_TIMER_POSTING = makeSymbol("CYBLACK-TIMER-POSTING");



    static private final SubLList $list_alt2 = list(list(makeSymbol("UNIVERSAL-TIME"), makeKeyword("ESSENTIAL"), makeKeyword("PUBLIC")), list(makeSymbol("INTERVAL"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    public static final SubLInteger $int$21 = makeInteger(21);





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TIMER_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TIMER-POSTING-CLASS");



























    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");

































    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TIMER_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TIMER-POSTING-INSTANCE");



    static private final SubLList $list_alt39 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt40 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("UNIVERSAL-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym41$OUTER_CATCH_FOR_CYBLACK_TIMER_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TIMER-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_TIMER_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-TIMER-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_SECOND_POSTING = makeSymbol("CYBLACK-SECOND-POSTING");

    static private final SubLList $list_alt44 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SECOND_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SECOND-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SECOND_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SECOND-POSTING-INSTANCE");

    static private final SubLList $list_alt47 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("SECOND")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym48$OUTER_CATCH_FOR_CYBLACK_SECOND_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SECOND-POSTING-METHOD");



    private static final SubLSymbol CYBLACK_SECOND_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-SECOND-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_QUARTER_MINUTE_POSTING = makeSymbol("CYBLACK-QUARTER-MINUTE-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_MINUTE_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-MINUTE-POSTING-CLASS");

    static private final SubLSymbol $sym53$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_MINUTE_POSTING_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-MINUTE-POSTING-INSTANCE");

    static private final SubLList $list_alt54 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("QUARTER-MINUTE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym55$OUTER_CATCH_FOR_CYBLACK_QUARTER_MINUTE_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUARTER-MINUTE-POSTING-METHOD");

    private static final SubLSymbol $QUARTER_MINUTE = makeKeyword("QUARTER-MINUTE");

    private static final SubLSymbol CYBLACK_QUARTER_MINUTE_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-QUARTER-MINUTE-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_HALF_MINUTE_POSTING = makeSymbol("CYBLACK-HALF-MINUTE-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_MINUTE_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-MINUTE-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_MINUTE_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-MINUTE-POSTING-INSTANCE");

    static private final SubLList $list_alt61 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("HALF-MINUTE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym62$OUTER_CATCH_FOR_CYBLACK_HALF_MINUTE_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-HALF-MINUTE-POSTING-METHOD");

    private static final SubLSymbol $HALF_MINUTE = makeKeyword("HALF-MINUTE");

    private static final SubLSymbol CYBLACK_HALF_MINUTE_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-HALF-MINUTE-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_MINUTE_POSTING = makeSymbol("CYBLACK-MINUTE-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MINUTE_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MINUTE-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MINUTE_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MINUTE-POSTING-INSTANCE");

    static private final SubLList $list_alt68 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("MINUTE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym69$OUTER_CATCH_FOR_CYBLACK_MINUTE_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MINUTE-POSTING-METHOD");



    private static final SubLSymbol CYBLACK_MINUTE_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-MINUTE-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_QUARTER_HOUR_POSTING = makeSymbol("CYBLACK-QUARTER-HOUR-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_HOUR_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-HOUR-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_QUARTER_HOUR_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-QUARTER-HOUR-POSTING-INSTANCE");

    static private final SubLList $list_alt75 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("QUARTER-HOUR")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym76$OUTER_CATCH_FOR_CYBLACK_QUARTER_HOUR_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-QUARTER-HOUR-POSTING-METHOD");

    private static final SubLSymbol $QUARTER_HOUR = makeKeyword("QUARTER-HOUR");

    private static final SubLSymbol CYBLACK_QUARTER_HOUR_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-QUARTER-HOUR-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_HALF_HOUR_POSTING = makeSymbol("CYBLACK-HALF-HOUR-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_HOUR_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-HOUR-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_HOUR_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-HOUR-POSTING-INSTANCE");

    static private final SubLList $list_alt82 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("HALF-HOUR")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym83$OUTER_CATCH_FOR_CYBLACK_HALF_HOUR_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-HALF-HOUR-POSTING-METHOD");

    private static final SubLSymbol $HALF_HOUR = makeKeyword("HALF-HOUR");

    private static final SubLSymbol CYBLACK_HALF_HOUR_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-HALF-HOUR-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_HOUR_POSTING = makeSymbol("CYBLACK-HOUR-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HOUR_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HOUR-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HOUR_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HOUR-POSTING-INSTANCE");

    static private final SubLList $list_alt89 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), $HOUR), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym90$OUTER_CATCH_FOR_CYBLACK_HOUR_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-HOUR-POSTING-METHOD");



    private static final SubLSymbol CYBLACK_HOUR_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-HOUR-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_TWO_HOURS_POSTING = makeSymbol("CYBLACK-TWO-HOURS-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TWO_HOURS_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TWO-HOURS-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TWO_HOURS_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TWO-HOURS-POSTING-INSTANCE");

    static private final SubLList $list_alt96 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("TWO-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym97$OUTER_CATCH_FOR_CYBLACK_TWO_HOURS_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TWO-HOURS-POSTING-METHOD");

    private static final SubLSymbol $TWO_HOURS = makeKeyword("TWO-HOURS");

    private static final SubLSymbol CYBLACK_TWO_HOURS_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-TWO-HOURS-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_THREE_HOURS_POSTING = makeSymbol("CYBLACK-THREE-HOURS-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_THREE_HOURS_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-THREE-HOURS-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_THREE_HOURS_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-THREE-HOURS-POSTING-INSTANCE");

    static private final SubLList $list_alt103 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("THREE-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym104$OUTER_CATCH_FOR_CYBLACK_THREE_HOURS_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-THREE-HOURS-POSTING-METHOD");

    private static final SubLSymbol $THREE_HOURS = makeKeyword("THREE-HOURS");

    private static final SubLSymbol CYBLACK_THREE_HOURS_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-THREE-HOURS-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_FOUR_HOURS_POSTING = makeSymbol("CYBLACK-FOUR-HOURS-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FOUR_HOURS_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FOUR-HOURS-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FOUR_HOURS_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FOUR-HOURS-POSTING-INSTANCE");

    static private final SubLList $list_alt110 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("FOUR-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym111$OUTER_CATCH_FOR_CYBLACK_FOUR_HOURS_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FOUR-HOURS-POSTING-METHOD");

    private static final SubLSymbol $FOUR_HOURS = makeKeyword("FOUR-HOURS");

    private static final SubLSymbol CYBLACK_FOUR_HOURS_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-FOUR-HOURS-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_FIVE_HOURS_POSTING = makeSymbol("CYBLACK-FIVE-HOURS-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FIVE_HOURS_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FIVE-HOURS-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FIVE_HOURS_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FIVE-HOURS-POSTING-INSTANCE");

    static private final SubLList $list_alt117 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("FIVE-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym118$OUTER_CATCH_FOR_CYBLACK_FIVE_HOURS_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FIVE-HOURS-POSTING-METHOD");

    private static final SubLSymbol $FIVE_HOURS = makeKeyword("FIVE-HOURS");

    private static final SubLSymbol CYBLACK_FIVE_HOURS_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-FIVE-HOURS-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_SIX_HOURS_POSTING = makeSymbol("CYBLACK-SIX-HOURS-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SIX_HOURS_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SIX-HOURS-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SIX_HOURS_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SIX-HOURS-POSTING-INSTANCE");

    static private final SubLList $list_alt124 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("SIX-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym125$OUTER_CATCH_FOR_CYBLACK_SIX_HOURS_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SIX-HOURS-POSTING-METHOD");

    private static final SubLSymbol $SIX_HOURS = makeKeyword("SIX-HOURS");

    private static final SubLSymbol CYBLACK_SIX_HOURS_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-SIX-HOURS-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_SEVEN_HOURS_POSTING = makeSymbol("CYBLACK-SEVEN-HOURS-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEVEN_HOURS_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEVEN-HOURS-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SEVEN_HOURS_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SEVEN-HOURS-POSTING-INSTANCE");

    static private final SubLList $list_alt131 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("SEVEN-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym132$OUTER_CATCH_FOR_CYBLACK_SEVEN_HOURS_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SEVEN-HOURS-POSTING-METHOD");

    private static final SubLSymbol $SEVEN_HOURS = makeKeyword("SEVEN-HOURS");

    private static final SubLSymbol CYBLACK_SEVEN_HOURS_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-SEVEN-HOURS-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_EIGHT_HOURS_POSTING = makeSymbol("CYBLACK-EIGHT-HOURS-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EIGHT_HOURS_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EIGHT-HOURS-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EIGHT_HOURS_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EIGHT-HOURS-POSTING-INSTANCE");

    static private final SubLList $list_alt138 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("EIGHT-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym139$OUTER_CATCH_FOR_CYBLACK_EIGHT_HOURS_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EIGHT-HOURS-POSTING-METHOD");

    private static final SubLSymbol $EIGHT_HOURS = makeKeyword("EIGHT-HOURS");

    private static final SubLSymbol CYBLACK_EIGHT_HOURS_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-EIGHT-HOURS-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_NINE_HOURS_POSTING = makeSymbol("CYBLACK-NINE-HOURS-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_NINE_HOURS_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-NINE-HOURS-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_NINE_HOURS_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-NINE-HOURS-POSTING-INSTANCE");

    static private final SubLList $list_alt145 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("NINE-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym146$OUTER_CATCH_FOR_CYBLACK_NINE_HOURS_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-NINE-HOURS-POSTING-METHOD");

    private static final SubLSymbol $NINE_HOURS = makeKeyword("NINE-HOURS");

    private static final SubLSymbol CYBLACK_NINE_HOURS_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-NINE-HOURS-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_TEN_HOURS_POSTING = makeSymbol("CYBLACK-TEN-HOURS-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TEN_HOURS_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TEN-HOURS-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TEN_HOURS_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TEN-HOURS-POSTING-INSTANCE");

    static private final SubLList $list_alt152 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("TEN-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym153$OUTER_CATCH_FOR_CYBLACK_TEN_HOURS_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TEN-HOURS-POSTING-METHOD");

    private static final SubLSymbol $TEN_HOURS = makeKeyword("TEN-HOURS");

    private static final SubLSymbol CYBLACK_TEN_HOURS_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-TEN-HOURS-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_ELEVEN_HOURS_POSTING = makeSymbol("CYBLACK-ELEVEN-HOURS-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ELEVEN_HOURS_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ELEVEN-HOURS-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ELEVEN_HOURS_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ELEVEN-HOURS-POSTING-INSTANCE");

    static private final SubLList $list_alt159 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("ELEVEN-HOURS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym160$OUTER_CATCH_FOR_CYBLACK_ELEVEN_HOURS_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ELEVEN-HOURS-POSTING-METHOD");

    private static final SubLSymbol $ELEVEN_HOURS = makeKeyword("ELEVEN-HOURS");

    private static final SubLSymbol CYBLACK_ELEVEN_HOURS_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-ELEVEN-HOURS-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_HALF_DAY_POSTING = makeSymbol("CYBLACK-HALF-DAY-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_DAY_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-DAY-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_HALF_DAY_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-HALF-DAY-POSTING-INSTANCE");

    static private final SubLList $list_alt166 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("HALF-DAY")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym167$OUTER_CATCH_FOR_CYBLACK_HALF_DAY_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-HALF-DAY-POSTING-METHOD");

    private static final SubLSymbol $HALF_DAY = makeKeyword("HALF-DAY");

    private static final SubLSymbol CYBLACK_HALF_DAY_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-HALF-DAY-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_DAY_POSTING = makeSymbol("CYBLACK-DAY-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DAY_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DAY-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DAY_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DAY-POSTING-INSTANCE");

    static private final SubLList $list_alt173 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("DAY")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym174$OUTER_CATCH_FOR_CYBLACK_DAY_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DAY-POSTING-METHOD");



    private static final SubLSymbol CYBLACK_DAY_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-DAY-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_WEEK_POSTING = makeSymbol("CYBLACK-WEEK-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_WEEK_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-WEEK-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_WEEK_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-WEEK-POSTING-INSTANCE");

    static private final SubLList $list_alt180 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), $WEEK), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym181$OUTER_CATCH_FOR_CYBLACK_WEEK_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-WEEK-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_WEEK_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-WEEK-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_MONTH_POSTING = makeSymbol("CYBLACK-MONTH-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONTH_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONTH-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONTH_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONTH-POSTING-INSTANCE");

    static private final SubLList $list_alt187 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), makeKeyword("MONTH")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym188$OUTER_CATCH_FOR_CYBLACK_MONTH_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-MONTH-POSTING-METHOD");



    private static final SubLSymbol CYBLACK_MONTH_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-MONTH-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_YEAR_POSTING = makeSymbol("CYBLACK-YEAR-POSTING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_YEAR_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-YEAR-POSTING-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_YEAR_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-YEAR-POSTING-INSTANCE");

    static private final SubLList $list_alt194 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERVAL"), $YEAR), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym195$OUTER_CATCH_FOR_CYBLACK_YEAR_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-YEAR-POSTING-METHOD");



    private static final SubLSymbol CYBLACK_YEAR_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-YEAR-POSTING-INITIALIZE-METHOD");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cyblack_timer_posting_file();
    }

    @Override
    public void initializeVariables() {
        init_cyblack_timer_posting_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyblack_timer_posting_file();
    }
}

