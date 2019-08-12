/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-SYSTEM-POSTINGS
 *  source file: /cyc/top/cycl/cyblack/cyblack-system-postings.lisp
 *  created:     2019/07/03 17:38:49
 */
public final class cyblack_system_postings extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_system_postings() {
    }

    public static final SubLFile me = new cyblack_system_postings();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_system_postings";

    // // Definitions
    /**
     * Enumerated values of type CYBLACK-INTERNAL-STATE-CATEGORIES.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_internal_state_categoriess$ = makeSymbol("*VALID-CYBLACK-INTERNAL-STATE-CATEGORIESS*");

    /**
     * Returns a list of all valid members of the CYBLACK-INTERNAL-STATE-CATEGORIES enumeration.
     */
    public static final SubLObject valid_cyblack_internal_state_categoriess() {
        return $valid_cyblack_internal_state_categoriess$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-INTERNAL-STATE-CATEGORIES enumeration.
     */
    public static final SubLObject cyblack_internal_state_categories_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_internal_state_categoriess$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-INTERNAL-STATE-CATEGORIES enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_internal_state_categories(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_internal_state_categoriess$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_INTERNAL_STATE_CATEGORIES, value, CYBLACK_INTERNAL_STATE_CATEGORIES);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-INTERNAL-STATE-CATEGORIES enumeration.
     */
    public static final SubLObject decode_cyblack_internal_state_categories(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_internal_state_categoriess$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_INTERNAL_STATE_CATEGORIES, value, CYBLACK_INTERNAL_STATE_CATEGORIES);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-INTERNAL-STATE-CATEGORIES enumeration.
     */
    public static final SubLObject cyblack_internal_state_categories_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_internal_state_categories_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_INTERNAL_STATE_CATEGORIES_P, value1, CYBLACK_INTERNAL_STATE_CATEGORIES);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_internal_state_categories_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_INTERNAL_STATE_CATEGORIES_P, value2, CYBLACK_INTERNAL_STATE_CATEGORIES);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_internal_state_categoriess$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value1) {
                        return makeBoolean(value != value2);
                    } else
                        if (value == value2) {
                            return NIL;
                        }

                }
            }
            return NIL;
        }
    }

    /**
     * Provides a GREATERP predicate for members of the CYBLACK-INTERNAL-STATE-CATEGORIES enumeration.
     */
    public static final SubLObject cyblack_internal_state_categories_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_internal_state_categories_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_INTERNAL_STATE_CATEGORIES_P, value1, CYBLACK_INTERNAL_STATE_CATEGORIES);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_internal_state_categories_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_INTERNAL_STATE_CATEGORIES_P, value2, CYBLACK_INTERNAL_STATE_CATEGORIES);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_internal_state_categoriess$.getGlobalValue();
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (value == value2) {
                        return makeBoolean(value != value1);
                    } else
                        if (value == value1) {
                            return NIL;
                        }

                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_internal_state_posting_p(SubLObject cyblack_internal_state_posting) {
        return interfaces.subloop_instanceof_interface(cyblack_internal_state_posting, CYBLACK_INTERNAL_STATE_POSTING);
    }

    public static final SubLObject get_cyblack_basic_internal_state_posting_source(SubLObject cyblack_basic_internal_state_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_internal_state_posting, $int$22, SOURCE);
    }

    public static final SubLObject set_cyblack_basic_internal_state_posting_source(SubLObject cyblack_basic_internal_state_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_internal_state_posting, value, $int$22, SOURCE);
    }

    public static final SubLObject get_cyblack_basic_internal_state_posting_category(SubLObject cyblack_basic_internal_state_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_internal_state_posting, $int$21, CATEGORY);
    }

    public static final SubLObject set_cyblack_basic_internal_state_posting_category(SubLObject cyblack_basic_internal_state_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_internal_state_posting, value, $int$21, CATEGORY);
    }

    public static final SubLObject get_cyblack_basic_internal_state_posting_universal_time(SubLObject cyblack_basic_internal_state_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_internal_state_posting, TWENTY_INTEGER, UNIVERSAL_TIME);
    }

    public static final SubLObject set_cyblack_basic_internal_state_posting_universal_time(SubLObject cyblack_basic_internal_state_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_internal_state_posting, value, TWENTY_INTEGER, UNIVERSAL_TIME);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_internal_state_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_internal_state_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_INTERNAL_STATE_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_INTERNAL_STATE_POSTING, CATEGORY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_INTERNAL_STATE_POSTING, SOURCE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_internal_state_posting_p(SubLObject cyblack_basic_internal_state_posting) {
        return classes.subloop_instanceof_class(cyblack_basic_internal_state_posting, CYBLACK_BASIC_INTERNAL_STATE_POSTING);
    }

    public static final SubLObject cyblack_basic_internal_state_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_internal_state_posting_method = NIL;
            SubLObject source = get_cyblack_basic_internal_state_posting_source(self);
            SubLObject category = get_cyblack_basic_internal_state_posting_category(self);
            SubLObject universal_time = get_cyblack_basic_internal_state_posting_universal_time(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_initialize_method(self);
                    universal_time = get_universal_time();
                    category = $INTERNAL_STATE;
                    source = NIL;
                    sublisp_throw($sym56$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_internal_state_posting_source(self, source);
                            set_cyblack_basic_internal_state_posting_category(self, category);
                            set_cyblack_basic_internal_state_posting_universal_time(self, universal_time);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_internal_state_posting_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_internal_state_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_internal_state_posting_get_universal_time_method(SubLObject self) {
        {
            SubLObject universal_time = get_cyblack_basic_internal_state_posting_universal_time(self);
            return universal_time;
        }
    }

    public static final SubLObject cyblack_basic_internal_state_posting_set_universal_time_method(SubLObject self, SubLObject new_universal_time) {
        {
            SubLObject catch_var_for_cyblack_basic_internal_state_posting_method = NIL;
            SubLObject universal_time = get_cyblack_basic_internal_state_posting_universal_time(self);
            try {
                try {
                    universal_time = new_universal_time;
                    sublisp_throw($sym67$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD, new_universal_time);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_internal_state_posting_universal_time(self, universal_time);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_internal_state_posting_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_internal_state_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_internal_state_posting_get_category_method(SubLObject self) {
        {
            SubLObject category = get_cyblack_basic_internal_state_posting_category(self);
            return category;
        }
    }

    public static final SubLObject cyblack_basic_internal_state_posting_set_category_method(SubLObject self, SubLObject new_category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_internal_state_posting_method = NIL;
                SubLObject category = get_cyblack_basic_internal_state_posting_category(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_internal_state_categories_p(new_category)) {
                                Errors.error($str_alt76$_SET_CATEGORY__S____S_is_not_a_me, self, new_category);
                            }
                        }
                        category = new_category;
                        sublisp_throw($sym75$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD, new_category);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_internal_state_posting_category(self, category);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_internal_state_posting_method = Errors.handleThrowable(ccatch_env_var, $sym75$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD);
                }
                return catch_var_for_cyblack_basic_internal_state_posting_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_internal_state_posting_get_source_method(SubLObject self) {
        {
            SubLObject source = get_cyblack_basic_internal_state_posting_source(self);
            return source;
        }
    }

    public static final SubLObject cyblack_basic_internal_state_posting_set_source_method(SubLObject self, SubLObject new_source) {
        {
            SubLObject catch_var_for_cyblack_basic_internal_state_posting_method = NIL;
            SubLObject source = get_cyblack_basic_internal_state_posting_source(self);
            try {
                try {
                    source = new_source;
                    sublisp_throw($sym84$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD, new_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_internal_state_posting_source(self, source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_internal_state_posting_method = Errors.handleThrowable(ccatch_env_var, $sym84$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_internal_state_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_activity_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_activity_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_INTERNAL_STATE_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_INTERNAL_STATE_POSTING, CATEGORY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_INTERNAL_STATE_POSTING, SOURCE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_internal_activity_posting_p(SubLObject cyblack_internal_activity_posting) {
        return classes.subloop_instanceof_class(cyblack_internal_activity_posting, CYBLACK_INTERNAL_ACTIVITY_POSTING);
    }

    public static final SubLObject cyblack_internal_activity_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_activity_posting_method = NIL;
            SubLObject category = get_cyblack_basic_internal_state_posting_category(self);
            try {
                try {
                    cyblack_basic_internal_state_posting_initialize_method(self);
                    category = $ACTIVITY;
                    sublisp_throw($sym91$OUTER_CATCH_FOR_CYBLACK_INTERNAL_ACTIVITY_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_internal_state_posting_category(self, category);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_activity_posting_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_CYBLACK_INTERNAL_ACTIVITY_POSTING_METHOD);
            }
            return catch_var_for_cyblack_internal_activity_posting_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_quiescence_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_quiescence_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_INTERNAL_STATE_POSTING, UNIVERSAL_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_INTERNAL_STATE_POSTING, CATEGORY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_INTERNAL_STATE_POSTING, SOURCE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_internal_quiescence_posting_p(SubLObject cyblack_internal_quiescence_posting) {
        return classes.subloop_instanceof_class(cyblack_internal_quiescence_posting, CYBLACK_INTERNAL_QUIESCENCE_POSTING);
    }

    public static final SubLObject cyblack_internal_quiescence_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_quiescence_posting_method = NIL;
            SubLObject category = get_cyblack_basic_internal_state_posting_category(self);
            try {
                try {
                    cyblack_internal_activity_posting_initialize_method(self);
                    category = $QUIESCENCE;
                    sublisp_throw($sym99$OUTER_CATCH_FOR_CYBLACK_INTERNAL_QUIESCENCE_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_internal_state_posting_category(self, category);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_quiescence_posting_method = Errors.handleThrowable(ccatch_env_var, $sym99$OUTER_CATCH_FOR_CYBLACK_INTERNAL_QUIESCENCE_POSTING_METHOD);
            }
            return catch_var_for_cyblack_internal_quiescence_posting_method;
        }
    }

    public static final SubLObject cyblack_internal_quiescence_posting_set_application_method(SubLObject self, SubLObject new_application) {
        cyblack_object.cyblack_object_set_application_method(self, new_application);
        cyblack_basic_internal_state_posting_set_source_method(self, new_application);
        return self;
    }

    public static final SubLObject declare_cyblack_system_postings_file() {
        declareFunction("valid_cyblack_internal_state_categoriess", "VALID-CYBLACK-INTERNAL-STATE-CATEGORIESS", 0, 0, false);
        declareFunction("cyblack_internal_state_categories_p", "CYBLACK-INTERNAL-STATE-CATEGORIES-P", 1, 0, false);
        declareFunction("encode_cyblack_internal_state_categories", "ENCODE-CYBLACK-INTERNAL-STATE-CATEGORIES", 1, 0, false);
        declareFunction("decode_cyblack_internal_state_categories", "DECODE-CYBLACK-INTERNAL-STATE-CATEGORIES", 1, 0, false);
        declareFunction("cyblack_internal_state_categories_less_p", "CYBLACK-INTERNAL-STATE-CATEGORIES-LESS-P", 2, 0, false);
        declareFunction("cyblack_internal_state_categories_greater_p", "CYBLACK-INTERNAL-STATE-CATEGORIES-GREATER-P", 2, 0, false);
        declareFunction("cyblack_internal_state_posting_p", "CYBLACK-INTERNAL-STATE-POSTING-P", 1, 0, false);
        declareFunction("get_cyblack_basic_internal_state_posting_source", "GET-CYBLACK-BASIC-INTERNAL-STATE-POSTING-SOURCE", 1, 0, false);
        declareFunction("set_cyblack_basic_internal_state_posting_source", "SET-CYBLACK-BASIC-INTERNAL-STATE-POSTING-SOURCE", 2, 0, false);
        declareFunction("get_cyblack_basic_internal_state_posting_category", "GET-CYBLACK-BASIC-INTERNAL-STATE-POSTING-CATEGORY", 1, 0, false);
        declareFunction("set_cyblack_basic_internal_state_posting_category", "SET-CYBLACK-BASIC-INTERNAL-STATE-POSTING-CATEGORY", 2, 0, false);
        declareFunction("get_cyblack_basic_internal_state_posting_universal_time", "GET-CYBLACK-BASIC-INTERNAL-STATE-POSTING-UNIVERSAL-TIME", 1, 0, false);
        declareFunction("set_cyblack_basic_internal_state_posting_universal_time", "SET-CYBLACK-BASIC-INTERNAL-STATE-POSTING-UNIVERSAL-TIME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_internal_state_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-INTERNAL-STATE-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_internal_state_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-INTERNAL-STATE-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_internal_state_posting_p", "CYBLACK-BASIC-INTERNAL-STATE-POSTING-P", 1, 0, false);
        declareFunction("cyblack_basic_internal_state_posting_initialize_method", "CYBLACK-BASIC-INTERNAL-STATE-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_internal_state_posting_get_universal_time_method", "CYBLACK-BASIC-INTERNAL-STATE-POSTING-GET-UNIVERSAL-TIME-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_internal_state_posting_set_universal_time_method", "CYBLACK-BASIC-INTERNAL-STATE-POSTING-SET-UNIVERSAL-TIME-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_internal_state_posting_get_category_method", "CYBLACK-BASIC-INTERNAL-STATE-POSTING-GET-CATEGORY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_internal_state_posting_set_category_method", "CYBLACK-BASIC-INTERNAL-STATE-POSTING-SET-CATEGORY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_internal_state_posting_get_source_method", "CYBLACK-BASIC-INTERNAL-STATE-POSTING-GET-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_internal_state_posting_set_source_method", "CYBLACK-BASIC-INTERNAL-STATE-POSTING-SET-SOURCE-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_activity_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-ACTIVITY-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_activity_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-ACTIVITY-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_internal_activity_posting_p", "CYBLACK-INTERNAL-ACTIVITY-POSTING-P", 1, 0, false);
        declareFunction("cyblack_internal_activity_posting_initialize_method", "CYBLACK-INTERNAL-ACTIVITY-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_quiescence_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-QUIESCENCE-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_quiescence_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-QUIESCENCE-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_internal_quiescence_posting_p", "CYBLACK-INTERNAL-QUIESCENCE-POSTING-P", 1, 0, false);
        declareFunction("cyblack_internal_quiescence_posting_initialize_method", "CYBLACK-INTERNAL-QUIESCENCE-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_quiescence_posting_set_application_method", "CYBLACK-INTERNAL-QUIESCENCE-POSTING-SET-APPLICATION-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_system_postings_file() {
        defconstant("*VALID-CYBLACK-INTERNAL-STATE-CATEGORIESS*", $list_alt0);
        return NIL;
    }

    public static final SubLObject setup_cyblack_system_postings_file() {
                enumerations.enumerations_incorporate_definition(CYBLACK_INTERNAL_STATE_CATEGORIES, $list_alt0);
        interfaces.new_interface(CYBLACK_INTERNAL_STATE_POSTING, $list_alt9, $list_alt10, $list_alt11);
        classes.subloop_new_class(CYBLACK_BASIC_INTERNAL_STATE_POSTING, CYBLACK_BASIC_POSTING, $list_alt14, NIL, $list_alt15);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_INTERNAL_STATE_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_INTERNAL_STATE_POSTING, $sym23$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_INTERNAL_STATE_POSTING_);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_INTERNAL_STATE_POSTING, $sym52$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_INTERNAL_STATE_POSTING_);
        subloop_reserved_initialize_cyblack_basic_internal_state_posting_class(CYBLACK_BASIC_INTERNAL_STATE_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_INTERNAL_STATE_POSTING, $list_alt54, NIL, $list_alt55);
        methods.subloop_register_instance_method(CYBLACK_BASIC_INTERNAL_STATE_POSTING, INITIALIZE, CYBLACK_BASIC_INTERNAL_STATE_POSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_UNIVERSAL_TIME, CYBLACK_BASIC_INTERNAL_STATE_POSTING, $list_alt60, NIL, $list_alt61);
        methods.subloop_register_instance_method(CYBLACK_BASIC_INTERNAL_STATE_POSTING, GET_UNIVERSAL_TIME, CYBLACK_BASIC_INTERNAL_STATE_POSTING_GET_UNIVERSAL_TIME_METHOD);
        methods.methods_incorporate_instance_method(SET_UNIVERSAL_TIME, CYBLACK_BASIC_INTERNAL_STATE_POSTING, $list_alt64, $list_alt65, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_BASIC_INTERNAL_STATE_POSTING, SET_UNIVERSAL_TIME, CYBLACK_BASIC_INTERNAL_STATE_POSTING_SET_UNIVERSAL_TIME_METHOD);
        methods.methods_incorporate_instance_method(GET_CATEGORY, CYBLACK_BASIC_INTERNAL_STATE_POSTING, $list_alt60, NIL, $list_alt70);
        methods.subloop_register_instance_method(CYBLACK_BASIC_INTERNAL_STATE_POSTING, GET_CATEGORY, CYBLACK_BASIC_INTERNAL_STATE_POSTING_GET_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method(SET_CATEGORY, CYBLACK_BASIC_INTERNAL_STATE_POSTING, $list_alt64, $list_alt73, $list_alt74);
        methods.subloop_register_instance_method(CYBLACK_BASIC_INTERNAL_STATE_POSTING, SET_CATEGORY, CYBLACK_BASIC_INTERNAL_STATE_POSTING_SET_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method(GET_SOURCE, CYBLACK_BASIC_INTERNAL_STATE_POSTING, $list_alt60, NIL, $list_alt79);
        methods.subloop_register_instance_method(CYBLACK_BASIC_INTERNAL_STATE_POSTING, GET_SOURCE, CYBLACK_BASIC_INTERNAL_STATE_POSTING_GET_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(SET_SOURCE, CYBLACK_BASIC_INTERNAL_STATE_POSTING, $list_alt64, $list_alt82, $list_alt83);
        methods.subloop_register_instance_method(CYBLACK_BASIC_INTERNAL_STATE_POSTING, SET_SOURCE, CYBLACK_BASIC_INTERNAL_STATE_POSTING_SET_SOURCE_METHOD);
        classes.subloop_new_class(CYBLACK_INTERNAL_ACTIVITY_POSTING, CYBLACK_BASIC_INTERNAL_STATE_POSTING, NIL, NIL, $list_alt87);
        classes.class_set_implements_slot_listeners(CYBLACK_INTERNAL_ACTIVITY_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_INTERNAL_ACTIVITY_POSTING, $sym88$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_ACTIVITY_POSTING_CLA);
        classes.subloop_note_instance_initialization_function(CYBLACK_INTERNAL_ACTIVITY_POSTING, $sym89$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_ACTIVITY_POSTING_INS);
        subloop_reserved_initialize_cyblack_internal_activity_posting_class(CYBLACK_INTERNAL_ACTIVITY_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_INTERNAL_ACTIVITY_POSTING, $list_alt54, NIL, $list_alt90);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_ACTIVITY_POSTING, INITIALIZE, CYBLACK_INTERNAL_ACTIVITY_POSTING_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_INTERNAL_QUIESCENCE_POSTING, CYBLACK_INTERNAL_ACTIVITY_POSTING, NIL, NIL, $list_alt95);
        classes.class_set_implements_slot_listeners(CYBLACK_INTERNAL_QUIESCENCE_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_INTERNAL_QUIESCENCE_POSTING, $sym96$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_QUIESCENCE_POSTING_C);
        classes.subloop_note_instance_initialization_function(CYBLACK_INTERNAL_QUIESCENCE_POSTING, $sym97$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_QUIESCENCE_POSTING_I);
        subloop_reserved_initialize_cyblack_internal_quiescence_posting_class(CYBLACK_INTERNAL_QUIESCENCE_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_INTERNAL_QUIESCENCE_POSTING, $list_alt54, NIL, $list_alt98);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_QUIESCENCE_POSTING, INITIALIZE, CYBLACK_INTERNAL_QUIESCENCE_POSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_INTERNAL_QUIESCENCE_POSTING, $list_alt103, $list_alt104, $list_alt105);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_QUIESCENCE_POSTING, SET_APPLICATION, CYBLACK_INTERNAL_QUIESCENCE_POSTING_SET_APPLICATION_METHOD);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("INTERNAL-STATE"), $TIME, makeKeyword("ACTIVITY"), makeKeyword("QUIESCENCE"), makeKeyword("EXTENDED"));

    private static final SubLSymbol CYBLACK_INTERNAL_STATE_CATEGORIES = makeSymbol("CYBLACK-INTERNAL-STATE-CATEGORIES");

    static private final SubLString $str_alt2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_INTERNAL_STATE_CATEGORIES = makeSymbol("ENCODE-CYBLACK-INTERNAL-STATE-CATEGORIES");

    static private final SubLString $str_alt4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_INTERNAL_STATE_CATEGORIES = makeSymbol("DECODE-CYBLACK-INTERNAL-STATE-CATEGORIES");

    static private final SubLString $str_alt6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_INTERNAL_STATE_CATEGORIES_P = makeSymbol("CYBLACK-INTERNAL-STATE-CATEGORIES-P");

    private static final SubLSymbol CYBLACK_INTERNAL_STATE_POSTING = makeSymbol("CYBLACK-INTERNAL-STATE-POSTING");

    static private final SubLList $list_alt9 = list(makeSymbol("CYBLACK-POSTING"));

    static private final SubLList $list_alt10 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-POSTING")));

    static private final SubLList $list_alt11 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNIVERSAL-TIME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-UNIVERSAL-TIME"), list(makeSymbol("NEW-UNIVERSAL-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CATEGORY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CATEGORY"), list(makeSymbol("NEW-CATEGORY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SOURCE"), list(makeSymbol("NEW-SOURCE")), makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_BASIC_INTERNAL_STATE_POSTING = makeSymbol("CYBLACK-BASIC-INTERNAL-STATE-POSTING");



    static private final SubLList $list_alt14 = list(makeSymbol("CYBLACK-INTERNAL-STATE-POSTING"));

    static private final SubLList $list_alt15 = list(new SubLObject[]{ list(makeSymbol("UNIVERSAL-TIME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("ESSENTIAL")), list(makeSymbol("CATEGORY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("ESSENTIAL")), list(makeSymbol("SOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("ESSENTIAL")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNIVERSAL-TIME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-UNIVERSAL-TIME"), list(makeSymbol("NEW-UNIVERSAL-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CATEGORY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CATEGORY"), list(makeSymbol("NEW-CATEGORY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SOURCE"), list(makeSymbol("NEW-SOURCE")), makeKeyword("PUBLIC")) });

    public static final SubLInteger $int$22 = makeInteger(22);



    public static final SubLInteger $int$21 = makeInteger(21);









    static private final SubLSymbol $sym23$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_INTERNAL_STATE_POSTING_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-INTERNAL-STATE-POSTING-CLASS");



























    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");





























    static private final SubLSymbol $sym52$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_INTERNAL_STATE_POSTING_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-INTERNAL-STATE-POSTING-INSTANCE");



    static private final SubLList $list_alt54 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt55 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("UNIVERSAL-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(makeSymbol("CSETQ"), makeSymbol("CATEGORY"), makeKeyword("INTERNAL-STATE")), list(makeSymbol("CSETQ"), makeSymbol("SOURCE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym56$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-INTERNAL-STATE-POSTING-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_INTERNAL_STATE_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-INTERNAL-STATE-POSTING-INITIALIZE-METHOD");



    static private final SubLList $list_alt60 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt61 = list(list(RET, makeSymbol("UNIVERSAL-TIME")));

    private static final SubLSymbol CYBLACK_BASIC_INTERNAL_STATE_POSTING_GET_UNIVERSAL_TIME_METHOD = makeSymbol("CYBLACK-BASIC-INTERNAL-STATE-POSTING-GET-UNIVERSAL-TIME-METHOD");

    private static final SubLSymbol SET_UNIVERSAL_TIME = makeSymbol("SET-UNIVERSAL-TIME");

    static private final SubLList $list_alt64 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt65 = list(makeSymbol("NEW-UNIVERSAL-TIME"));

    static private final SubLList $list_alt66 = list(list(makeSymbol("CSETQ"), makeSymbol("UNIVERSAL-TIME"), makeSymbol("NEW-UNIVERSAL-TIME")), list(RET, makeSymbol("NEW-UNIVERSAL-TIME")));

    static private final SubLSymbol $sym67$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-INTERNAL-STATE-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_INTERNAL_STATE_POSTING_SET_UNIVERSAL_TIME_METHOD = makeSymbol("CYBLACK-BASIC-INTERNAL-STATE-POSTING-SET-UNIVERSAL-TIME-METHOD");



    static private final SubLList $list_alt70 = list(list(RET, makeSymbol("CATEGORY")));

    private static final SubLSymbol CYBLACK_BASIC_INTERNAL_STATE_POSTING_GET_CATEGORY_METHOD = makeSymbol("CYBLACK-BASIC-INTERNAL-STATE-POSTING-GET-CATEGORY-METHOD");

    private static final SubLSymbol SET_CATEGORY = makeSymbol("SET-CATEGORY");

    static private final SubLList $list_alt73 = list(makeSymbol("NEW-CATEGORY"));

    static private final SubLList $list_alt74 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-INTERNAL-STATE-CATEGORIES-P"), makeSymbol("NEW-CATEGORY")), makeString("(SET-CATEGORY ~S): ~S is not a member of the INTERNAL-STATE-CATEGORIES enumeration."), makeSymbol("SELF"), makeSymbol("NEW-CATEGORY")), list(makeSymbol("CSETQ"), makeSymbol("CATEGORY"), makeSymbol("NEW-CATEGORY")), list(RET, makeSymbol("NEW-CATEGORY")));

    static private final SubLSymbol $sym75$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-INTERNAL-STATE-POSTING-METHOD");

    static private final SubLString $str_alt76$_SET_CATEGORY__S____S_is_not_a_me = makeString("(SET-CATEGORY ~S): ~S is not a member of the INTERNAL-STATE-CATEGORIES enumeration.");

    private static final SubLSymbol CYBLACK_BASIC_INTERNAL_STATE_POSTING_SET_CATEGORY_METHOD = makeSymbol("CYBLACK-BASIC-INTERNAL-STATE-POSTING-SET-CATEGORY-METHOD");



    static private final SubLList $list_alt79 = list(list(RET, makeSymbol("SOURCE")));

    private static final SubLSymbol CYBLACK_BASIC_INTERNAL_STATE_POSTING_GET_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-INTERNAL-STATE-POSTING-GET-SOURCE-METHOD");



    static private final SubLList $list_alt82 = list(makeSymbol("NEW-SOURCE"));

    static private final SubLList $list_alt83 = list(list(makeSymbol("CSETQ"), makeSymbol("SOURCE"), makeSymbol("NEW-SOURCE")), list(RET, makeSymbol("NEW-SOURCE")));

    static private final SubLSymbol $sym84$OUTER_CATCH_FOR_CYBLACK_BASIC_INTERNAL_STATE_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-INTERNAL-STATE-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_INTERNAL_STATE_POSTING_SET_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-INTERNAL-STATE-POSTING-SET-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_ACTIVITY_POSTING = makeSymbol("CYBLACK-INTERNAL-ACTIVITY-POSTING");

    static private final SubLList $list_alt87 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym88$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_ACTIVITY_POSTING_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-ACTIVITY-POSTING-CLASS");

    static private final SubLSymbol $sym89$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_ACTIVITY_POSTING_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-ACTIVITY-POSTING-INSTANCE");

    static private final SubLList $list_alt90 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CATEGORY"), makeKeyword("ACTIVITY")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym91$OUTER_CATCH_FOR_CYBLACK_INTERNAL_ACTIVITY_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-ACTIVITY-POSTING-METHOD");

    private static final SubLSymbol $ACTIVITY = makeKeyword("ACTIVITY");

    private static final SubLSymbol CYBLACK_INTERNAL_ACTIVITY_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-INTERNAL-ACTIVITY-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_QUIESCENCE_POSTING = makeSymbol("CYBLACK-INTERNAL-QUIESCENCE-POSTING");

    static private final SubLList $list_alt95 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym96$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_QUIESCENCE_POSTING_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-QUIESCENCE-POSTING-CLASS");

    static private final SubLSymbol $sym97$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_QUIESCENCE_POSTING_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-QUIESCENCE-POSTING-INSTANCE");

    static private final SubLList $list_alt98 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CATEGORY"), makeKeyword("QUIESCENCE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym99$OUTER_CATCH_FOR_CYBLACK_INTERNAL_QUIESCENCE_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-QUIESCENCE-POSTING-METHOD");



    private static final SubLSymbol CYBLACK_INTERNAL_QUIESCENCE_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-INTERNAL-QUIESCENCE-POSTING-INITIALIZE-METHOD");



    static private final SubLList $list_alt103 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt104 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt105 = list(list(makeSymbol("SET-APPLICATION"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("SET-SOURCE"), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_INTERNAL_QUIESCENCE_POSTING_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-INTERNAL-QUIESCENCE-POSTING-SET-APPLICATION-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_system_postings_file();
    }

    public void initializeVariables() {
        init_cyblack_system_postings_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_system_postings_file();
    }
}

