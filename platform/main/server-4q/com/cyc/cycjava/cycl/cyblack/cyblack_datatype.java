/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.method_listeners;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_collections;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-DATATYPE
 *  source file: /cyc/top/cycl/cyblack/cyblack-datatype.lisp
 *  created:     2019/07/03 17:38:45
 */
public final class cyblack_datatype extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_datatype() {
    }

    public static final SubLFile me = new cyblack_datatype();


    // // Definitions
    public static final SubLObject cyblack_datatype_p(SubLObject v_cyblack_datatype) {
        return interfaces.subloop_instanceof_interface(v_cyblack_datatype, CYBLACK_DATATYPE);
    }

    // defparameter
    private static final SubLSymbol $cyblack_datatype_invalid_datatype_message$ = makeSymbol("*CYBLACK-DATATYPE-INVALID-DATATYPE-MESSAGE*");

    public static final SubLObject cyblack_declare_subtype_relation(SubLObject sub_datatype, SubLObject super_datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(sub_datatype)) {
                    Errors.error($cyblack_datatype_invalid_datatype_message$.getDynamicValue(thread), CYBLACK_DECLARE_SUBTYPE_RELATION, sub_datatype);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(super_datatype)) {
                    Errors.error($cyblack_datatype_invalid_datatype_message$.getDynamicValue(thread), CYBLACK_DECLARE_SUBTYPE_RELATION, super_datatype);
                }
            }
            if (sub_datatype != super_datatype) {
                {
                    SubLObject sub_datatype_supertypes = methods.funcall_instance_method_with_0_args(sub_datatype, GET_SUPERTYPES);
                    SubLObject super_datatype_subtypes = methods.funcall_instance_method_with_0_args(super_datatype, GET_SUBTYPES);
                    if (NIL == subl_promotions.memberP(super_datatype, sub_datatype_supertypes, UNPROVIDED, UNPROVIDED)) {
                        methods.funcall_instance_method_with_1_args(sub_datatype, SET_SUPERTYPES, cons(super_datatype, sub_datatype_supertypes));
                    }
                    if (NIL == subl_promotions.memberP(sub_datatype, super_datatype_subtypes, UNPROVIDED, UNPROVIDED)) {
                        methods.funcall_instance_method_with_1_args(super_datatype, SET_SUBTYPES, cons(sub_datatype, super_datatype_subtypes));
                    }
                    return T;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject get_cyblack_basic_datatype_panel_dictionary(SubLObject cyblack_basic_datatype) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_datatype, ELEVEN_INTEGER, PANEL_DICTIONARY);
    }

    public static final SubLObject set_cyblack_basic_datatype_panel_dictionary(SubLObject cyblack_basic_datatype, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_datatype, value, ELEVEN_INTEGER, PANEL_DICTIONARY);
    }

    public static final SubLObject get_cyblack_basic_datatype_cyblack_basic_datatype_marks(SubLObject cyblack_basic_datatype) {
        return classes.subloop_get_instance_slot(cyblack_basic_datatype, TEN_INTEGER);
    }

    public static final SubLObject set_cyblack_basic_datatype_cyblack_basic_datatype_marks(SubLObject cyblack_basic_datatype, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_basic_datatype, value, TEN_INTEGER);
    }

    public static final SubLObject get_cyblack_basic_datatype_posting_type(SubLObject cyblack_basic_datatype) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_datatype, NINE_INTEGER, POSTING_TYPE);
    }

    public static final SubLObject set_cyblack_basic_datatype_posting_type(SubLObject cyblack_basic_datatype, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_datatype, value, NINE_INTEGER, POSTING_TYPE);
    }

    public static final SubLObject get_cyblack_basic_datatype_panel_type(SubLObject cyblack_basic_datatype) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_datatype, EIGHT_INTEGER, PANEL_TYPE);
    }

    public static final SubLObject set_cyblack_basic_datatype_panel_type(SubLObject cyblack_basic_datatype, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_datatype, value, EIGHT_INTEGER, PANEL_TYPE);
    }

    public static final SubLObject get_cyblack_basic_datatype_subtypes(SubLObject cyblack_basic_datatype) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_datatype, SEVEN_INTEGER, SUBTYPES);
    }

    public static final SubLObject set_cyblack_basic_datatype_subtypes(SubLObject cyblack_basic_datatype, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_datatype, value, SEVEN_INTEGER, SUBTYPES);
    }

    public static final SubLObject get_cyblack_basic_datatype_supertypes(SubLObject cyblack_basic_datatype) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_datatype, SIX_INTEGER, SUPERTYPES);
    }

    public static final SubLObject set_cyblack_basic_datatype_supertypes(SubLObject cyblack_basic_datatype, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_datatype, value, SIX_INTEGER, SUPERTYPES);
    }

    public static final SubLObject get_cyblack_basic_datatype_typename(SubLObject cyblack_basic_datatype) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_datatype, FIVE_INTEGER, TYPENAME);
    }

    public static final SubLObject set_cyblack_basic_datatype_typename(SubLObject cyblack_basic_datatype, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_datatype, value, FIVE_INTEGER, TYPENAME);
    }

    public static final SubLObject cyblack_basic_datatype_has_mark_p_method(SubLObject self, SubLObject mark) {
        return NIL != member(mark, cyblack_basic_datatype_get_marks_internal_method(self), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    public static final SubLObject cyblack_basic_datatype_remove_mark_method(SubLObject self, SubLObject mark) {
        cyblack_basic_datatype_set_marks_internal_method(self, delete(mark, cyblack_basic_datatype_get_marks_internal_method(self), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return mark;
    }

    public static final SubLObject cyblack_basic_datatype_add_mark_method(SubLObject self, SubLObject mark) {
        {
            SubLObject list_of_marks = cyblack_basic_datatype_get_marks_internal_method(self);
            if (NIL == subl_promotions.memberP(mark, list_of_marks, UNPROVIDED, UNPROVIDED)) {
                list_of_marks = cons(mark, list_of_marks);
                cyblack_basic_datatype_set_marks_internal_method(self, list_of_marks);
            }
            return mark;
        }
    }

    public static final SubLObject cyblack_basic_datatype_clear_all_marks_method(SubLObject self) {
        cyblack_basic_datatype_set_marks_internal_method(self, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_datatype_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt35$__A_, cyblack_basic_datatype_get_typename_method(self));
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_datatype_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_datatype_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DATATYPE, TYPENAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DATATYPE, SUPERTYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DATATYPE, SUBTYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DATATYPE, PANEL_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DATATYPE, POSTING_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DATATYPE, CYBLACK_BASIC_DATATYPE_MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DATATYPE, PANEL_DICTIONARY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_datatype_p(SubLObject cyblack_basic_datatype) {
        return classes.subloop_instanceof_class(cyblack_basic_datatype, CYBLACK_BASIC_DATATYPE);
    }

    public static final SubLObject cyblack_basic_datatype_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject panel_dictionary = get_cyblack_basic_datatype_panel_dictionary(self);
            SubLObject cyblack_basic_datatype_marks = get_cyblack_basic_datatype_cyblack_basic_datatype_marks(self);
            SubLObject posting_type = get_cyblack_basic_datatype_posting_type(self);
            SubLObject panel_type = get_cyblack_basic_datatype_panel_type(self);
            SubLObject subtypes = get_cyblack_basic_datatype_subtypes(self);
            SubLObject supertypes = get_cyblack_basic_datatype_supertypes(self);
            try {
                try {
                    cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
                    panel_type = CYBLACK_BASIC_PANEL;
                    posting_type = NIL;
                    supertypes = NIL;
                    subtypes = NIL;
                    cyblack_basic_datatype_marks = NIL;
                    panel_dictionary = NIL;
                    sublisp_throw($sym52$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_panel_dictionary(self, panel_dictionary);
                            set_cyblack_basic_datatype_cyblack_basic_datatype_marks(self, cyblack_basic_datatype_marks);
                            set_cyblack_basic_datatype_posting_type(self, posting_type);
                            set_cyblack_basic_datatype_panel_type(self, panel_type);
                            set_cyblack_basic_datatype_subtypes(self, subtypes);
                            set_cyblack_basic_datatype_supertypes(self, supertypes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_get_marks_internal_method(SubLObject self) {
        return get_cyblack_basic_datatype_cyblack_basic_datatype_marks(self);
    }

    public static final SubLObject cyblack_basic_datatype_set_marks_internal_method(SubLObject self, SubLObject new_marks) {
        set_cyblack_basic_datatype_cyblack_basic_datatype_marks(self, new_marks);
        return new_marks;
    }

    public static final SubLObject cyblack_basic_datatype_get_typename_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject typename = get_cyblack_basic_datatype_typename(self);
            try {
                try {
                    sublisp_throw($sym65$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, typename);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_typename(self, typename);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym65$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_set_typename_method(SubLObject self, SubLObject new_typename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
                SubLObject listed_args = list(new_typename);
                SubLObject typename = get_cyblack_basic_datatype_typename(self);
                try {
                    try {
                        method_listeners.method_listeners_invoke_before_listeners(SET_TYPENAME, self, listed_args);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_typename.isString()) {
                                Errors.error($str_alt72$_SET_TYPENAME__S___Typename__S_is, self, new_typename);
                            }
                        }
                        typename = new_typename;
                        sublisp_throw($sym71$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, new_typename);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_datatype_typename(self, typename);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym71$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
                }
                method_listeners.method_listeners_invoke_after_listeners(SET_TYPENAME, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
                return catch_var_for_cyblack_basic_datatype_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_datatype_get_supertypes_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject listed_args = NIL;
            SubLObject supertypes = get_cyblack_basic_datatype_supertypes(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(GET_SUPERTYPES, self, listed_args);
                    sublisp_throw($sym75$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, supertypes);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_supertypes(self, supertypes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym75$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(GET_SUPERTYPES, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_set_supertypes_method(SubLObject self, SubLObject new_supertypes) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject listed_args = list(new_supertypes);
            SubLObject supertypes = get_cyblack_basic_datatype_supertypes(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(SET_SUPERTYPES, self, listed_args);
                    supertypes = new_supertypes;
                    sublisp_throw($sym79$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, new_supertypes);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_supertypes(self, supertypes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym79$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(SET_SUPERTYPES, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_get_subtypes_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject listed_args = NIL;
            SubLObject subtypes = get_cyblack_basic_datatype_subtypes(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(GET_SUBTYPES, self, listed_args);
                    sublisp_throw($sym82$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, subtypes);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_subtypes(self, subtypes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(GET_SUBTYPES, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_set_subtypes_method(SubLObject self, SubLObject new_subtypes) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject listed_args = list(new_subtypes);
            SubLObject subtypes = get_cyblack_basic_datatype_subtypes(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(SET_SUBTYPES, self, listed_args);
                    subtypes = new_subtypes;
                    sublisp_throw($sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, new_subtypes);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_subtypes(self, subtypes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(SET_SUBTYPES, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_subtype_p_method(SubLObject self, SubLObject other_datatype) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject listed_args = list(other_datatype);
            SubLObject supertypes = get_cyblack_basic_datatype_supertypes(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(SUBTYPE_P, self, listed_args);
                    if (other_datatype == self) {
                        sublisp_throw($sym91$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, T);
                    }
                    if (NIL == cyblack_basic_datatype_has_mark_p_method(self, $SUBTYPE_P)) {
                        try {
                            cyblack_basic_datatype_add_mark_method(self, $SUBTYPE_P);
                            {
                                SubLObject cdolist_list_var = supertypes;
                                SubLObject supertype = NIL;
                                for (supertype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supertype = cdolist_list_var.first()) {
                                    if (NIL != cyblack_basic_datatype_subtype_p_method(supertype, other_datatype)) {
                                        sublisp_throw($sym91$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, T);
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    cyblack_basic_datatype_remove_mark_method(self, $SUBTYPE_P);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                    sublisp_throw($sym91$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_supertypes(self, supertypes);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(SUBTYPE_P, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_instance_of_p_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject listed_args = list(posting);
            SubLObject posting_type = get_cyblack_basic_datatype_posting_type(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(INSTANCE_OF_P, self, listed_args);
                    if (NIL != cyblack_posting.cyblack_posting_p(posting)) {
                        {
                            SubLObject posting_type_1 = methods.funcall_instance_method_with_0_args(posting, GET_DATATYPE);
                            if (NIL != posting_type_1) {
                                sublisp_throw($sym97$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, methods.funcall_instance_method_with_1_args(posting_type_1, SUBTYPE_P, self));
                            }
                        }
                    }
                    sublisp_throw($sym97$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_posting_type(self, posting_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym97$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(INSTANCE_OF_P, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_get_panel_type_method(SubLObject self) {
        {
            SubLObject panel_type = get_cyblack_basic_datatype_panel_type(self);
            return panel_type;
        }
    }

    public static final SubLObject cyblack_basic_datatype_set_panel_type_method(SubLObject self, SubLObject new_panel_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
                SubLObject listed_args = list(new_panel_type);
                SubLObject panel_type = get_cyblack_basic_datatype_panel_type(self);
                try {
                    try {
                        method_listeners.method_listeners_invoke_before_listeners(SET_PANEL_TYPE, self, listed_args);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL != new_panel_type) && new_panel_type.isSymbol())) {
                                Errors.error($str_alt108$_SET_PANEL_TYPE__S____S_is_not_a_, self, new_panel_type);
                            }
                        }
                        if (NIL == classes.classes_retrieve_class(new_panel_type)) {
                            Errors.warn($str_alt109$_SET_PANEL_TYPE__S____S_is_not_ye, self, new_panel_type);
                        }
                        panel_type = new_panel_type;
                        sublisp_throw($sym107$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, new_panel_type);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_datatype_panel_type(self, panel_type);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym107$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
                }
                method_listeners.method_listeners_invoke_after_listeners(SET_PANEL_TYPE, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
                return catch_var_for_cyblack_basic_datatype_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_datatype_get_posting_type_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject posting_type = get_cyblack_basic_datatype_posting_type(self);
            try {
                try {
                    sublisp_throw($sym113$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, posting_type);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_posting_type(self, posting_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym113$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_set_posting_type_method(SubLObject self, SubLObject new_posting_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
                SubLObject listed_args = list(new_posting_type);
                SubLObject posting_type = get_cyblack_basic_datatype_posting_type(self);
                try {
                    try {
                        method_listeners.method_listeners_invoke_before_listeners(SET_POSTING_TYPE, self, listed_args);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL != new_posting_type) && new_posting_type.isSymbol())) {
                                Errors.error($str_alt119$_SET_POSTING_TYPE__S____S_is_not_, self, new_posting_type);
                            }
                        }
                        if (NIL == classes.classes_retrieve_class(new_posting_type)) {
                            Errors.warn($str_alt120$_SET_POSTING_TYPE__S____S_is_not_, self, new_posting_type);
                        }
                        posting_type = new_posting_type;
                        sublisp_throw($sym118$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, new_posting_type);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_datatype_posting_type(self, posting_type);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym118$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
                }
                method_listeners.method_listeners_invoke_after_listeners(SET_POSTING_TYPE, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
                return catch_var_for_cyblack_basic_datatype_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_datatype_create_panel_method(SubLObject self, SubLObject blackboard) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject listed_args = list(blackboard);
            SubLObject panel_dictionary = get_cyblack_basic_datatype_panel_dictionary(self);
            SubLObject panel_type = get_cyblack_basic_datatype_panel_type(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(CREATE_PANEL, self, listed_args);
                    if (NIL != panel_type) {
                        {
                            SubLObject new_panel = methods.funcall_class_method_with_0_args(panel_type, NEW);
                            if (NIL == panel_dictionary) {
                                panel_dictionary = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
                            }
                            cyblack_panel_dispatch_functions.cyblack_panel_set_datatype(new_panel, self);
                            dictionary.dictionary_enter(panel_dictionary, blackboard, new_panel);
                            sublisp_throw($sym125$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, new_panel);
                        }
                    }
                    sublisp_throw($sym125$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_panel_dictionary(self, panel_dictionary);
                            set_cyblack_basic_datatype_panel_type(self, panel_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym125$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(CREATE_PANEL, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_get_panel_method(SubLObject self, SubLObject blackboard, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject listed_args = list(blackboard, environment);
            SubLObject panel_dictionary = get_cyblack_basic_datatype_panel_dictionary(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(GET_PANEL, self, listed_args);
                    if (NIL != panel_dictionary) {
                        sublisp_throw($sym132$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, dictionary.dictionary_lookup(panel_dictionary, blackboard, NIL));
                    } else {
                        sublisp_throw($sym132$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_panel_dictionary(self, panel_dictionary);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym132$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(GET_PANEL, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_basic_datatype_create_posting_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_datatype_method = NIL;
            SubLObject listed_args = NIL;
            SubLObject posting_type = get_cyblack_basic_datatype_posting_type(self);
            try {
                try {
                    method_listeners.method_listeners_invoke_before_listeners(CREATE_POSTING, self, listed_args);
                    if (NIL != posting_type) {
                        {
                            SubLObject new_posting = methods.funcall_class_method_with_0_args(posting_type, NEW);
                            cyblack_posting_dispatch_functions.cyblack_posting_set_datatype(new_posting, self);
                            sublisp_throw($sym136$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, new_posting);
                        }
                    }
                    sublisp_throw($sym136$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_datatype_posting_type(self, posting_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_datatype_method = Errors.handleThrowable(ccatch_env_var, $sym136$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD);
            }
            method_listeners.method_listeners_invoke_after_listeners(CREATE_POSTING, self, listed_args, catch_var_for_cyblack_basic_datatype_method);
            return catch_var_for_cyblack_basic_datatype_method;
        }
    }

    public static final SubLObject cyblack_datatype_get_subtypes_internal(SubLObject type) {
        if (NIL != cyblack_basic_datatype_p(type)) {
            return cyblack_basic_datatype_get_subtypes_method(type);
        } else
            if (NIL != cyblack_datatype_p(type)) {
                return methods.funcall_instance_method_with_0_args(type, GET_SUBTYPES);
            } else {
                return NIL;
            }

    }

    public static final SubLObject cyblack_datatype_get_supertypes_internal(SubLObject type) {
        if (NIL != cyblack_basic_datatype_p(type)) {
            return cyblack_basic_datatype_get_supertypes_method(type);
        } else
            if (NIL != cyblack_datatype_p(type)) {
                return methods.funcall_instance_method_with_0_args(type, GET_SUPERTYPES);
            } else {
                return NIL;
            }

    }

    public static final SubLObject cyblack_do_subtypes_in_order(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt138);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject stack_var = make_symbol($$$stack);
                            SubLObject visited_var = make_symbol($$$visited);
                            return list(CLET, list(list(var, type), list(stack_var, list(LIST, var)), bq_cons(visited_var, $list_alt143)), list(WHILE, stack_var, list(CSETQ, var, list(CAR, stack_var)), list(CPOP, stack_var), listS(PUNLESS, list($sym149$MEMBER_, var, visited_var), list(CPUSH, var, visited_var), list(CSETQ, stack_var, list(NCONC, list(COPY_LIST, list(CYBLACK_DATATYPE_GET_SUBTYPES_INTERNAL, var)), stack_var)), body)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt138);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_do_supertypes_in_order(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt138);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject stack_var = make_symbol($$$stack);
                            SubLObject visited_var = make_symbol($$$visited);
                            return list(CLET, list(list(var, type), list(stack_var, list(LIST, var)), bq_cons(visited_var, $list_alt143)), list(WHILE, stack_var, list(CSETQ, var, list(CAR, stack_var)), list(CPOP, stack_var), listS(PUNLESS, list($sym149$MEMBER_, var, visited_var), list(CPUSH, var, visited_var), list(CSETQ, stack_var, list(NCONC, list(COPY_LIST, list(CYBLACK_DATATYPE_GET_SUPERTYPES_INTERNAL, var)), stack_var)), body)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt138);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_do_subtypes_breadth_first_in_order(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt138);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject queue_var = make_symbol($$$queue);
                            SubLObject visited_var = make_symbol($$$visited);
                            return list(CLET, list(list(var, type), list(queue_var, list(LIST, var)), bq_cons(visited_var, $list_alt143)), list(WHILE, queue_var, list(CSETQ, var, list(CAR, queue_var)), list(CPOP, queue_var), listS(PUNLESS, list($sym149$MEMBER_, var, visited_var), list(CPUSH, var, visited_var), list(CSETQ, queue_var, list(NCONC, queue_var, list(COPY_LIST, list(CYBLACK_DATATYPE_GET_SUBTYPES_INTERNAL, var)))), body)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt138);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_do_supertypes_breadth_first_in_order(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt138);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt138);
                    type = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject queue_var = make_symbol($$$queue);
                            SubLObject visited_var = make_symbol($$$visited);
                            return list(CLET, list(list(var, type), list(queue_var, list(LIST, var)), bq_cons(visited_var, $list_alt143)), list(WHILE, queue_var, list(CSETQ, var, list(CAR, queue_var)), list(CPOP, queue_var), listS(PUNLESS, list($sym149$MEMBER_, var, visited_var), list(CPUSH, var, visited_var), list(CSETQ, queue_var, list(NCONC, queue_var, list(COPY_LIST, list(CYBLACK_DATATYPE_GET_SUPERTYPES_INTERNAL, var)))), body)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt138);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_datatype_set_panel_and_posting_types(SubLObject datatype, SubLObject panel_type, SubLObject posting_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(datatype)) {
                    Errors.error($str_alt156$CYBLACK_DATATYPE_SET_PANEL_AND_PO, datatype);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_utilities.non_null_symbol_p(panel_type)) {
                    Errors.error($str_alt157$CYBLACK_DATATYPE_SET_PANEL_AND_PO, panel_type);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_utilities.non_null_symbol_p(posting_type)) {
                    Errors.error($str_alt158$CYBLACK_DATATYPE_SET_PANEL_AND_PO, posting_type);
                }
            }
            if (NIL != cyblack_basic_datatype_p(datatype)) {
                cyblack_basic_datatype_set_panel_type_method(datatype, panel_type);
                cyblack_basic_datatype_set_posting_type_method(datatype, posting_type);
            } else {
                methods.funcall_instance_method_with_1_args(datatype, SET_PANEL_TYPE, panel_type);
                methods.funcall_instance_method_with_1_args(datatype, SET_POSTING_TYPE, posting_type);
            }
            return values(panel_type, posting_type);
        }
    }

    public static final SubLObject cyblack_datatype_get_typename(SubLObject v_cyblack_datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt159$CYBLACK_DATATYPE_GET_TYPENAME___S, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_get_typename_method(v_cyblack_datatype);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_datatype, GET_TYPENAME);
            }
        }
    }

    public static final SubLObject cyblack_get_typename_if_not_null(SubLObject datatype) {
        if (NIL != cyblack_datatype_p(datatype)) {
            return cyblack_datatype_get_typename(datatype);
        } else
            if (NIL == datatype) {
                return NIL;
            } else {
                return NIL;
            }

    }

    public static final SubLObject cyblack_datatype_get_supertypes(SubLObject v_cyblack_datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt160$CYBLACK_DATATYPE_GET_SUPERTYPES__, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_get_supertypes_method(v_cyblack_datatype);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_datatype, GET_SUPERTYPES);
            }
        }
    }

    public static final SubLObject cyblack_datatype_set_supertypes(SubLObject v_cyblack_datatype, SubLObject new_supertypes) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt161$CYBLACK_DATATYPE_SET_SUPERTYPES__, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_set_supertypes_method(v_cyblack_datatype, new_supertypes);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_datatype, SET_SUPERTYPES, new_supertypes);
            }
        }
    }

    public static final SubLObject cyblack_datatype_get_subtypes(SubLObject v_cyblack_datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt162$CYBLACK_DATATYPE_GET_SUBTYPES___S, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_get_subtypes_method(v_cyblack_datatype);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_datatype, GET_SUBTYPES);
            }
        }
    }

    public static final SubLObject cyblack_datatype_set_subtypes(SubLObject v_cyblack_datatype, SubLObject new_subtypes) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt163$CYBLACK_DATATYPE_SET_SUBTYPES___S, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_set_subtypes_method(v_cyblack_datatype, new_subtypes);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_datatype, SET_SUBTYPES, new_subtypes);
            }
        }
    }

    public static final SubLObject cyblack_datatype_subtype_p(SubLObject v_cyblack_datatype, SubLObject other_datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt164$CYBLACK_DATATYPE_SUBTYPE_P___S_is, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_subtype_p_method(v_cyblack_datatype, other_datatype);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_datatype, SUBTYPE_P, other_datatype);
            }
        }
    }

    public static final SubLObject cyblack_datatype_instance_of_p(SubLObject v_cyblack_datatype, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt165$CYBLACK_DATATYPE_INSTANCE_OF_P___, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_instance_of_p_method(v_cyblack_datatype, posting);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_datatype, INSTANCE_OF_P, posting);
            }
        }
    }

    public static final SubLObject cyblack_datatype_get_panel_type(SubLObject v_cyblack_datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt166$CYBLACK_DATATYPE_GET_PANEL_TYPE__, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_get_panel_type_method(v_cyblack_datatype);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_datatype, GET_PANEL_TYPE);
            }
        }
    }

    public static final SubLObject cyblack_datatype_set_panel_type(SubLObject v_cyblack_datatype, SubLObject new_panel_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt167$CYBLACK_DATATYPE_SET_PANEL_TYPE__, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_set_panel_type_method(v_cyblack_datatype, new_panel_type);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_datatype, SET_PANEL_TYPE, new_panel_type);
            }
        }
    }

    public static final SubLObject cyblack_datatype_get_posting_type(SubLObject v_cyblack_datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt168$CYBLACK_DATATYPE_GET_POSTING_TYPE, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_get_posting_type_method(v_cyblack_datatype);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_datatype, GET_POSTING_TYPE);
            }
        }
    }

    public static final SubLObject cyblack_datatype_set_posting_type(SubLObject v_cyblack_datatype, SubLObject new_posting_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt169$CYBLACK_DATATYPE_SET_POSTING_TYPE, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_set_posting_type_method(v_cyblack_datatype, new_posting_type);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_datatype, SET_POSTING_TYPE, new_posting_type);
            }
        }
    }

    public static final SubLObject cyblack_datatype_create_panel(SubLObject v_cyblack_datatype, SubLObject blackboard) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt170$CYBLACK_DATATYPE_CREATE_PANEL___S, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_create_panel_method(v_cyblack_datatype, blackboard);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_datatype, CREATE_PANEL, blackboard);
            }
        }
    }

    public static final SubLObject cyblack_datatype_get_panel(SubLObject v_cyblack_datatype, SubLObject blackboard, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt171$CYBLACK_DATATYPE_GET_PANEL___S_is, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_get_panel_method(v_cyblack_datatype, blackboard, environment);
            } else {
                return methods.funcall_instance_method_with_2_args(v_cyblack_datatype, GET_PANEL, blackboard, environment);
            }
        }
    }

    public static final SubLObject cyblack_datatype_create_posting(SubLObject v_cyblack_datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(v_cyblack_datatype)) {
                    Errors.error($str_alt172$CYBLACK_DATATYPE_CREATE_POSTING__, v_cyblack_datatype);
                }
            }
            if (NIL != cyblack_basic_datatype_p(v_cyblack_datatype)) {
                return cyblack_basic_datatype_create_posting_method(v_cyblack_datatype);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_datatype, CREATE_POSTING);
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_datatype_bag_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_datatype_bag_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, CONTENTS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_COLLECTION, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_BAG, BAG_REPRESENTATION, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_datatype_bag_p(SubLObject cyblack_datatype_bag) {
        return classes.subloop_instanceof_class(cyblack_datatype_bag, CYBLACK_DATATYPE_BAG);
    }

    public static final SubLObject cyblack_datatype_bag_set_contents_method(SubLObject self, SubLObject new_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!new_contents.isList()) {
                    Errors.error($str_alt185$_SET_CONTENTS__S____S_is_not_a_va, self, new_contents);
                }
            }
            {
                SubLObject cdolist_list_var = new_contents;
                SubLObject v_object = NIL;
                for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == cyblack_datatype_p(v_object)) {
                            Errors.error($str_alt186$_SET_CONTENTS__S____S_is_not_an_i, self, v_object);
                        }
                    }
                }
            }
            return subloop_collections.basic_bag_set_contents_method(self, new_contents);
        }
    }

    public static final SubLObject cyblack_datatype_bag_add_method(SubLObject self, SubLObject new_element) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(new_element)) {
                    Errors.error($str_alt191$_ADD__S____S_is_not_an_instance_o, self, new_element);
                }
            }
            return subloop_collections.basic_bag_add_method(self, new_element);
        }
    }

    public static final SubLObject cyblack_datatype_bag_remove_method(SubLObject self, SubLObject old_element) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(old_element)) {
                    Errors.error($str_alt196$_REMOVE__S____S_is_not_an_instanc, self, old_element);
                }
            }
            return subloop_collections.basic_bag_remove_method(self, old_element);
        }
    }

    public static final SubLObject cyblack_datatype_bag_member_p_method(SubLObject self, SubLObject element) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(element)) {
                    Errors.error($str_alt201$_MEMBER_P__S____S_is_not_an_insta, self, element);
                }
            }
            return subloop_collections.basic_bag_member_p_method(self, element);
        }
    }

    public static final SubLObject cyblack_datatype_bag_occurences_method(SubLObject self, SubLObject element) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype_p(element)) {
                    Errors.error($str_alt205$_OCCURENCES__S____S_is_not_an_ins, self, element);
                }
            }
            return subloop_collections.basic_bag_occurences_method(self, element);
        }
    }

    public static final SubLObject declare_cyblack_datatype_file() {
        declareFunction("cyblack_datatype_p", "CYBLACK-DATATYPE-P", 1, 0, false);
        declareFunction("cyblack_declare_subtype_relation", "CYBLACK-DECLARE-SUBTYPE-RELATION", 2, 0, false);
        declareFunction("get_cyblack_basic_datatype_panel_dictionary", "GET-CYBLACK-BASIC-DATATYPE-PANEL-DICTIONARY", 1, 0, false);
        declareFunction("set_cyblack_basic_datatype_panel_dictionary", "SET-CYBLACK-BASIC-DATATYPE-PANEL-DICTIONARY", 2, 0, false);
        declareFunction("get_cyblack_basic_datatype_cyblack_basic_datatype_marks", "GET-CYBLACK-BASIC-DATATYPE-CYBLACK-BASIC-DATATYPE-MARKS", 1, 0, false);
        declareFunction("set_cyblack_basic_datatype_cyblack_basic_datatype_marks", "SET-CYBLACK-BASIC-DATATYPE-CYBLACK-BASIC-DATATYPE-MARKS", 2, 0, false);
        declareFunction("get_cyblack_basic_datatype_posting_type", "GET-CYBLACK-BASIC-DATATYPE-POSTING-TYPE", 1, 0, false);
        declareFunction("set_cyblack_basic_datatype_posting_type", "SET-CYBLACK-BASIC-DATATYPE-POSTING-TYPE", 2, 0, false);
        declareFunction("get_cyblack_basic_datatype_panel_type", "GET-CYBLACK-BASIC-DATATYPE-PANEL-TYPE", 1, 0, false);
        declareFunction("set_cyblack_basic_datatype_panel_type", "SET-CYBLACK-BASIC-DATATYPE-PANEL-TYPE", 2, 0, false);
        declareFunction("get_cyblack_basic_datatype_subtypes", "GET-CYBLACK-BASIC-DATATYPE-SUBTYPES", 1, 0, false);
        declareFunction("set_cyblack_basic_datatype_subtypes", "SET-CYBLACK-BASIC-DATATYPE-SUBTYPES", 2, 0, false);
        declareFunction("get_cyblack_basic_datatype_supertypes", "GET-CYBLACK-BASIC-DATATYPE-SUPERTYPES", 1, 0, false);
        declareFunction("set_cyblack_basic_datatype_supertypes", "SET-CYBLACK-BASIC-DATATYPE-SUPERTYPES", 2, 0, false);
        declareFunction("get_cyblack_basic_datatype_typename", "GET-CYBLACK-BASIC-DATATYPE-TYPENAME", 1, 0, false);
        declareFunction("set_cyblack_basic_datatype_typename", "SET-CYBLACK-BASIC-DATATYPE-TYPENAME", 2, 0, false);
        declareFunction("cyblack_basic_datatype_has_mark_p_method", "CYBLACK-BASIC-DATATYPE-HAS-MARK-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_remove_mark_method", "CYBLACK-BASIC-DATATYPE-REMOVE-MARK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_add_mark_method", "CYBLACK-BASIC-DATATYPE-ADD-MARK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_clear_all_marks_method", "CYBLACK-BASIC-DATATYPE-CLEAR-ALL-MARKS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_datatype_print_method", "CYBLACK-BASIC-DATATYPE-PRINT-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_datatype_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DATATYPE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_datatype_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DATATYPE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_datatype_p", "CYBLACK-BASIC-DATATYPE-P", 1, 0, false);
        declareFunction("cyblack_basic_datatype_initialize_method", "CYBLACK-BASIC-DATATYPE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_datatype_get_marks_internal_method", "CYBLACK-BASIC-DATATYPE-GET-MARKS-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_datatype_set_marks_internal_method", "CYBLACK-BASIC-DATATYPE-SET-MARKS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_get_typename_method", "CYBLACK-BASIC-DATATYPE-GET-TYPENAME-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_datatype_set_typename_method", "CYBLACK-BASIC-DATATYPE-SET-TYPENAME-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_get_supertypes_method", "CYBLACK-BASIC-DATATYPE-GET-SUPERTYPES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_datatype_set_supertypes_method", "CYBLACK-BASIC-DATATYPE-SET-SUPERTYPES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_get_subtypes_method", "CYBLACK-BASIC-DATATYPE-GET-SUBTYPES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_datatype_set_subtypes_method", "CYBLACK-BASIC-DATATYPE-SET-SUBTYPES-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_subtype_p_method", "CYBLACK-BASIC-DATATYPE-SUBTYPE-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_instance_of_p_method", "CYBLACK-BASIC-DATATYPE-INSTANCE-OF-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_get_panel_type_method", "CYBLACK-BASIC-DATATYPE-GET-PANEL-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_datatype_set_panel_type_method", "CYBLACK-BASIC-DATATYPE-SET-PANEL-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_get_posting_type_method", "CYBLACK-BASIC-DATATYPE-GET-POSTING-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_datatype_set_posting_type_method", "CYBLACK-BASIC-DATATYPE-SET-POSTING-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_create_panel_method", "CYBLACK-BASIC-DATATYPE-CREATE-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_datatype_get_panel_method", "CYBLACK-BASIC-DATATYPE-GET-PANEL-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_datatype_create_posting_method", "CYBLACK-BASIC-DATATYPE-CREATE-POSTING-METHOD", 1, 0, false);
        declareFunction("cyblack_datatype_get_subtypes_internal", "CYBLACK-DATATYPE-GET-SUBTYPES-INTERNAL", 1, 0, false);
        declareFunction("cyblack_datatype_get_supertypes_internal", "CYBLACK-DATATYPE-GET-SUPERTYPES-INTERNAL", 1, 0, false);
        declareMacro("cyblack_do_subtypes_in_order", "CYBLACK-DO-SUBTYPES-IN-ORDER");
        declareMacro("cyblack_do_supertypes_in_order", "CYBLACK-DO-SUPERTYPES-IN-ORDER");
        declareMacro("cyblack_do_subtypes_breadth_first_in_order", "CYBLACK-DO-SUBTYPES-BREADTH-FIRST-IN-ORDER");
        declareMacro("cyblack_do_supertypes_breadth_first_in_order", "CYBLACK-DO-SUPERTYPES-BREADTH-FIRST-IN-ORDER");
        declareFunction("cyblack_datatype_set_panel_and_posting_types", "CYBLACK-DATATYPE-SET-PANEL-AND-POSTING-TYPES", 3, 0, false);
        declareFunction("cyblack_datatype_get_typename", "CYBLACK-DATATYPE-GET-TYPENAME", 1, 0, false);
        declareFunction("cyblack_get_typename_if_not_null", "CYBLACK-GET-TYPENAME-IF-NOT-NULL", 1, 0, false);
        declareFunction("cyblack_datatype_get_supertypes", "CYBLACK-DATATYPE-GET-SUPERTYPES", 1, 0, false);
        declareFunction("cyblack_datatype_set_supertypes", "CYBLACK-DATATYPE-SET-SUPERTYPES", 2, 0, false);
        declareFunction("cyblack_datatype_get_subtypes", "CYBLACK-DATATYPE-GET-SUBTYPES", 1, 0, false);
        declareFunction("cyblack_datatype_set_subtypes", "CYBLACK-DATATYPE-SET-SUBTYPES", 2, 0, false);
        declareFunction("cyblack_datatype_subtype_p", "CYBLACK-DATATYPE-SUBTYPE-P", 2, 0, false);
        declareFunction("cyblack_datatype_instance_of_p", "CYBLACK-DATATYPE-INSTANCE-OF-P", 2, 0, false);
        declareFunction("cyblack_datatype_get_panel_type", "CYBLACK-DATATYPE-GET-PANEL-TYPE", 1, 0, false);
        declareFunction("cyblack_datatype_set_panel_type", "CYBLACK-DATATYPE-SET-PANEL-TYPE", 2, 0, false);
        declareFunction("cyblack_datatype_get_posting_type", "CYBLACK-DATATYPE-GET-POSTING-TYPE", 1, 0, false);
        declareFunction("cyblack_datatype_set_posting_type", "CYBLACK-DATATYPE-SET-POSTING-TYPE", 2, 0, false);
        declareFunction("cyblack_datatype_create_panel", "CYBLACK-DATATYPE-CREATE-PANEL", 2, 0, false);
        declareFunction("cyblack_datatype_get_panel", "CYBLACK-DATATYPE-GET-PANEL", 2, 1, false);
        declareFunction("cyblack_datatype_create_posting", "CYBLACK-DATATYPE-CREATE-POSTING", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_datatype_bag_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DATATYPE-BAG-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_datatype_bag_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DATATYPE-BAG-INSTANCE", 1, 0, false);
        declareFunction("cyblack_datatype_bag_p", "CYBLACK-DATATYPE-BAG-P", 1, 0, false);
        declareFunction("cyblack_datatype_bag_set_contents_method", "CYBLACK-DATATYPE-BAG-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("cyblack_datatype_bag_add_method", "CYBLACK-DATATYPE-BAG-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_datatype_bag_remove_method", "CYBLACK-DATATYPE-BAG-REMOVE-METHOD", 2, 0, false);
        declareFunction("cyblack_datatype_bag_member_p_method", "CYBLACK-DATATYPE-BAG-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_datatype_bag_occurences_method", "CYBLACK-DATATYPE-BAG-OCCURENCES-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_datatype_file() {
        defparameter("*CYBLACK-DATATYPE-INVALID-DATATYPE-MESSAGE*", $str_alt6$_S___S_is_not_a_valid_datatype_);
        return NIL;
    }

    public static final SubLObject setup_cyblack_datatype_file() {
                interfaces.new_interface(CYBLACK_DATATYPE, NIL, NIL, $list_alt1);
        interfaces.interfaces_add_interface_instance_method(PRINT, CYBLACK_DATATYPE, $list_alt3, $list_alt4, $list_alt5);
        classes.subloop_new_class(CYBLACK_BASIC_DATATYPE, CYBLACK_BASIC_LOCKABLE, $list_alt14, NIL, $list_alt15);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_DATATYPE, NIL);
        methods.methods_incorporate_instance_method(HAS_MARK_P, CYBLACK_BASIC_DATATYPE, $list_alt3, $list_alt23, $list_alt24);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, HAS_MARK_P, CYBLACK_BASIC_DATATYPE_HAS_MARK_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_MARK, CYBLACK_BASIC_DATATYPE, $list_alt3, $list_alt23, $list_alt27);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, REMOVE_MARK, CYBLACK_BASIC_DATATYPE_REMOVE_MARK_METHOD);
        methods.methods_incorporate_instance_method(ADD_MARK, CYBLACK_BASIC_DATATYPE, $list_alt3, $list_alt23, $list_alt30);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, ADD_MARK, CYBLACK_BASIC_DATATYPE_ADD_MARK_METHOD);
        methods.methods_incorporate_instance_method(CLEAR_ALL_MARKS, CYBLACK_BASIC_DATATYPE, $list_alt3, NIL, $list_alt33);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, CLEAR_ALL_MARKS, CYBLACK_BASIC_DATATYPE_CLEAR_ALL_MARKS_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_DATATYPE, $list_alt3, $list_alt4, $list_alt5);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, PRINT, CYBLACK_BASIC_DATATYPE_PRINT_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_DATATYPE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DATATYPE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_DATATYPE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DATATYPE_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_datatype_class(CYBLACK_BASIC_DATATYPE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_DATATYPE, $list_alt50, NIL, $list_alt51);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, INITIALIZE, CYBLACK_BASIC_DATATYPE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_MARKS_INTERNAL, CYBLACK_BASIC_DATATYPE, $list_alt56, NIL, $list_alt57);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, GET_MARKS_INTERNAL, CYBLACK_BASIC_DATATYPE_GET_MARKS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_MARKS_INTERNAL, CYBLACK_BASIC_DATATYPE, $list_alt56, $list_alt60, $list_alt61);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, SET_MARKS_INTERNAL, CYBLACK_BASIC_DATATYPE_SET_MARKS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPENAME, CYBLACK_BASIC_DATATYPE, $list_alt3, NIL, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, GET_TYPENAME, CYBLACK_BASIC_DATATYPE_GET_TYPENAME_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPENAME, CYBLACK_BASIC_DATATYPE, $list_alt68, $list_alt69, $list_alt70);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, SET_TYPENAME, CYBLACK_BASIC_DATATYPE_SET_TYPENAME_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPERTYPES, CYBLACK_BASIC_DATATYPE, $list_alt68, NIL, $list_alt74);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, GET_SUPERTYPES, CYBLACK_BASIC_DATATYPE_GET_SUPERTYPES_METHOD);
        methods.methods_incorporate_instance_method(SET_SUPERTYPES, CYBLACK_BASIC_DATATYPE, $list_alt68, $list_alt77, $list_alt78);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, SET_SUPERTYPES, CYBLACK_BASIC_DATATYPE_SET_SUPERTYPES_METHOD);
        methods.methods_incorporate_instance_method(GET_SUBTYPES, CYBLACK_BASIC_DATATYPE, $list_alt68, NIL, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, GET_SUBTYPES, CYBLACK_BASIC_DATATYPE_GET_SUBTYPES_METHOD);
        methods.methods_incorporate_instance_method(SET_SUBTYPES, CYBLACK_BASIC_DATATYPE, $list_alt68, $list_alt84, $list_alt85);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, SET_SUBTYPES, CYBLACK_BASIC_DATATYPE_SET_SUBTYPES_METHOD);
        methods.methods_incorporate_instance_method(SUBTYPE_P, CYBLACK_BASIC_DATATYPE, $list_alt68, $list_alt89, $list_alt90);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, SUBTYPE_P, CYBLACK_BASIC_DATATYPE_SUBTYPE_P_METHOD);
        methods.methods_incorporate_instance_method(INSTANCE_OF_P, CYBLACK_BASIC_DATATYPE, $list_alt68, $list_alt95, $list_alt96);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, INSTANCE_OF_P, CYBLACK_BASIC_DATATYPE_INSTANCE_OF_P_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL_TYPE, CYBLACK_BASIC_DATATYPE, $list_alt101, NIL, $list_alt102);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, GET_PANEL_TYPE, CYBLACK_BASIC_DATATYPE_GET_PANEL_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_PANEL_TYPE, CYBLACK_BASIC_DATATYPE, $list_alt68, $list_alt105, $list_alt106);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, SET_PANEL_TYPE, CYBLACK_BASIC_DATATYPE_SET_PANEL_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING_TYPE, CYBLACK_BASIC_DATATYPE, $list_alt3, NIL, $list_alt112);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, GET_POSTING_TYPE, CYBLACK_BASIC_DATATYPE_GET_POSTING_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_POSTING_TYPE, CYBLACK_BASIC_DATATYPE, $list_alt68, $list_alt116, $list_alt117);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, SET_POSTING_TYPE, CYBLACK_BASIC_DATATYPE_SET_POSTING_TYPE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PANEL, CYBLACK_BASIC_DATATYPE, $list_alt68, $list_alt123, $list_alt124);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, CREATE_PANEL, CYBLACK_BASIC_DATATYPE_CREATE_PANEL_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL, CYBLACK_BASIC_DATATYPE, $list_alt129, $list_alt130, $list_alt131);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, GET_PANEL, CYBLACK_BASIC_DATATYPE_GET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(CREATE_POSTING, CYBLACK_BASIC_DATATYPE, $list_alt129, NIL, $list_alt135);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DATATYPE, CREATE_POSTING, CYBLACK_BASIC_DATATYPE_CREATE_POSTING_METHOD);
        classes.subloop_new_class(CYBLACK_DATATYPE_BAG, BASIC_BAG, NIL, NIL, $list_alt175);
        classes.class_set_implements_slot_listeners(CYBLACK_DATATYPE_BAG, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DATATYPE_BAG, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DATATYPE_BAG_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DATATYPE_BAG, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DATATYPE_BAG_INSTANCE);
        subloop_reserved_initialize_cyblack_datatype_bag_class(CYBLACK_DATATYPE_BAG);
        methods.methods_incorporate_instance_method(SET_CONTENTS, CYBLACK_DATATYPE_BAG, $list_alt3, $list_alt183, $list_alt184);
        methods.subloop_register_instance_method(CYBLACK_DATATYPE_BAG, SET_CONTENTS, CYBLACK_DATATYPE_BAG_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(ADD, CYBLACK_DATATYPE_BAG, $list_alt3, $list_alt189, $list_alt190);
        methods.subloop_register_instance_method(CYBLACK_DATATYPE_BAG, ADD, CYBLACK_DATATYPE_BAG_ADD_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, CYBLACK_DATATYPE_BAG, $list_alt3, $list_alt194, $list_alt195);
        methods.subloop_register_instance_method(CYBLACK_DATATYPE_BAG, REMOVE, CYBLACK_DATATYPE_BAG_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_DATATYPE_BAG, $list_alt3, $list_alt199, $list_alt200);
        methods.subloop_register_instance_method(CYBLACK_DATATYPE_BAG, MEMBER_P, CYBLACK_DATATYPE_BAG_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(OCCURENCES, CYBLACK_DATATYPE_BAG, $list_alt3, $list_alt199, $list_alt204);
        methods.subloop_register_instance_method(CYBLACK_DATATYPE_BAG, OCCURENCES, CYBLACK_DATATYPE_BAG_OCCURENCES_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_DATATYPE = makeSymbol("CYBLACK-DATATYPE");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPENAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPERTYPES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUPERTYPES"), list(makeSymbol("NEW-SUPERTYPES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBTYPES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUBTYPES"), list(makeSymbol("NEW-SUBTYPES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUBTYPE-P"), list(makeSymbol("OTHER-DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTANCE-OF-P"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL-TYPE"), list(makeSymbol("NEW-PANEL-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-POSTING-TYPE"), list(makeSymbol("NEW-POSTING-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-PANEL"), list(makeSymbol("BLACKBOARD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL"), list(makeSymbol("BLACKBOARD"), makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-POSTING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")) });



    static private final SubLList $list_alt3 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt4 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt5 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("[~A]"), list(makeSymbol("GET-TYPENAME"), makeSymbol("SELF"))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt6$_S___S_is_not_a_valid_datatype_ = makeString("~S: ~S is not a valid datatype.");

    private static final SubLSymbol CYBLACK_DECLARE_SUBTYPE_RELATION = makeSymbol("CYBLACK-DECLARE-SUBTYPE-RELATION");



    private static final SubLSymbol GET_SUBTYPES = makeSymbol("GET-SUBTYPES");

    private static final SubLSymbol SET_SUPERTYPES = makeSymbol("SET-SUPERTYPES");

    private static final SubLSymbol SET_SUBTYPES = makeSymbol("SET-SUBTYPES");





    static private final SubLList $list_alt14 = list(makeSymbol("CYBLACK-MARKABLE-TEMPLATE"), makeSymbol("CYBLACK-DATATYPE"));

    static private final SubLList $list_alt15 = list(new SubLObject[]{ list(makeSymbol("TYPENAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUPERTYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUBTYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PANEL-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("POSTING-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CYBLACK-BASIC-DATATYPE-MARKS"), makeKeyword("INSTANCE"), makeKeyword("FILE-SCOPE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MARKS-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MARKS-INTERNAL"), list(makeSymbol("NEW-MARKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-ALL-MARKS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MARK"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-MARK"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-MARK-P"), list(makeSymbol("MARK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("PANEL-DICTIONARY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPENAME"), list(makeSymbol("NEW-TYPE-NAME")), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPENAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPERTYPES"), NIL, makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUPERTYPES"), list(makeSymbol("NEW-SUPERTYPES")), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBTYPES"), NIL, makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUBTYPES"), list(makeSymbol("NEW-SUBTYPES")), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUBTYPE-P"), list(makeSymbol("OTHER-DATATYPE")), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTANCE-OF-P"), list(makeSymbol("POSTING")), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL-TYPE"), list(makeSymbol("NEW-PANEL-TYPE")), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-POSTING-TYPE"), list(makeSymbol("NEW-POSTING-TYPE")), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-PANEL"), list(makeSymbol("BLACKBOARD")), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL"), list(makeSymbol("BLACKBOARD"), makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-POSTING"), NIL, makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC")) });





    private static final SubLSymbol PANEL_TYPE = makeSymbol("PANEL-TYPE");









    static private final SubLList $list_alt23 = list(makeSymbol("MARK"));

    static private final SubLList $list_alt24 = list(list(RET, list(makeSymbol("FIF"), list(makeSymbol("MEMBER"), makeSymbol("MARK"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF"))), T, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_HAS_MARK_P_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-HAS-MARK-P-METHOD");



    static private final SubLList $list_alt27 = list(list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("DELETE"), makeSymbol("MARK"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF")))), list(RET, makeSymbol("MARK")));

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_REMOVE_MARK_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-REMOVE-MARK-METHOD");



    static private final SubLList $list_alt30 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LIST-OF-MARKS"), list(makeSymbol("GET-MARKS-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("MARK"), makeSymbol("LIST-OF-MARKS")), list(makeSymbol("CPUSH"), makeSymbol("MARK"), makeSymbol("LIST-OF-MARKS")), list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), makeSymbol("LIST-OF-MARKS")))), list(RET, makeSymbol("MARK")));

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_ADD_MARK_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-ADD-MARK-METHOD");



    static private final SubLList $list_alt33 = list(list(makeSymbol("SET-MARKS-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_CLEAR_ALL_MARKS_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-CLEAR-ALL-MARKS-METHOD");

    static private final SubLString $str_alt35$__A_ = makeString("[~A]");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-PRINT-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DATATYPE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DATATYPE-CLASS");















    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_MARKS = makeSymbol("CYBLACK-BASIC-DATATYPE-MARKS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DATATYPE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DATATYPE-INSTANCE");



    static private final SubLList $list_alt50 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt51 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PANEL-TYPE"), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(makeSymbol("CSETQ"), makeSymbol("POSTING-TYPE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SUPERTYPES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SUBTYPES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CYBLACK-BASIC-DATATYPE-MARKS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PANEL-DICTIONARY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym52$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-INITIALIZE-METHOD");



    static private final SubLList $list_alt56 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt57 = list(list(RET, list(makeSymbol("GET-CYBLACK-BASIC-DATATYPE-CYBLACK-BASIC-DATATYPE-MARKS"), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_GET_MARKS_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-GET-MARKS-INTERNAL-METHOD");



    static private final SubLList $list_alt60 = list(makeSymbol("NEW-MARKS"));

    static private final SubLList $list_alt61 = list(list(makeSymbol("SET-CYBLACK-BASIC-DATATYPE-CYBLACK-BASIC-DATATYPE-MARKS"), makeSymbol("SELF"), makeSymbol("NEW-MARKS")), list(RET, makeSymbol("NEW-MARKS")));

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_SET_MARKS_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-SET-MARKS-INTERNAL-METHOD");



    static private final SubLList $list_alt64 = list(list(RET, makeSymbol("TYPENAME")));

    static private final SubLSymbol $sym65$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_GET_TYPENAME_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-GET-TYPENAME-METHOD");

    private static final SubLSymbol SET_TYPENAME = makeSymbol("SET-TYPENAME");

    static private final SubLList $list_alt68 = list(makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt69 = list(makeSymbol("NEW-TYPENAME"));

    static private final SubLList $list_alt70 = list(list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("NEW-TYPENAME")), makeString("(SET-TYPENAME ~S): Typename ~S is not a string."), makeSymbol("SELF"), makeSymbol("NEW-TYPENAME")), list(makeSymbol("CSETQ"), makeSymbol("TYPENAME"), makeSymbol("NEW-TYPENAME")), list(RET, makeSymbol("NEW-TYPENAME")));

    static private final SubLSymbol $sym71$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    static private final SubLString $str_alt72$_SET_TYPENAME__S___Typename__S_is = makeString("(SET-TYPENAME ~S): Typename ~S is not a string.");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_SET_TYPENAME_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-SET-TYPENAME-METHOD");

    static private final SubLList $list_alt74 = list(list(RET, makeSymbol("SUPERTYPES")));

    static private final SubLSymbol $sym75$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_GET_SUPERTYPES_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-GET-SUPERTYPES-METHOD");

    static private final SubLList $list_alt77 = list(makeSymbol("NEW-SUPERTYPES"));

    static private final SubLList $list_alt78 = list(list(makeSymbol("CSETQ"), makeSymbol("SUPERTYPES"), makeSymbol("NEW-SUPERTYPES")), list(RET, makeSymbol("NEW-SUPERTYPES")));

    static private final SubLSymbol $sym79$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_SET_SUPERTYPES_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-SET-SUPERTYPES-METHOD");

    static private final SubLList $list_alt81 = list(list(RET, makeSymbol("SUBTYPES")));

    static private final SubLSymbol $sym82$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_GET_SUBTYPES_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-GET-SUBTYPES-METHOD");

    static private final SubLList $list_alt84 = list(makeSymbol("NEW-SUBTYPES"));

    static private final SubLList $list_alt85 = list(list(makeSymbol("CSETQ"), makeSymbol("SUBTYPES"), makeSymbol("NEW-SUBTYPES")), list(RET, makeSymbol("NEW-SUBTYPES")));

    static private final SubLSymbol $sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_SET_SUBTYPES_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-SET-SUBTYPES-METHOD");



    static private final SubLList $list_alt89 = list(makeSymbol("OTHER-DATATYPE"));

    static private final SubLList $list_alt90 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OTHER-DATATYPE"), makeSymbol("SELF")), list(RET, T)), list(makeSymbol("PUNLESS"), list(makeSymbol("HAS-MARK-P"), makeSymbol("SELF"), makeKeyword("SUBTYPE-P")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("ADD-MARK"), makeSymbol("SELF"), makeKeyword("SUBTYPE-P")), list(makeSymbol("CDOLIST"), list(makeSymbol("SUPERTYPE"), makeSymbol("SUPERTYPES")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SUBTYPE-P"), makeSymbol("CYBLACK-BASIC-DATATYPE")), makeSymbol("SUPERTYPE"), makeSymbol("OTHER-DATATYPE")), list(RET, T)))), list(makeSymbol("REMOVE-MARK"), makeSymbol("SELF"), makeKeyword("SUBTYPE-P")))), list(RET, NIL));

    static private final SubLSymbol $sym91$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    private static final SubLSymbol $SUBTYPE_P = makeKeyword("SUBTYPE-P");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_SUBTYPE_P_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-SUBTYPE-P-METHOD");



    static private final SubLList $list_alt95 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt96 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING-TYPE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("GET-DATATYPE"))))), list(makeSymbol("PWHEN"), makeSymbol("POSTING-TYPE"), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-TYPE"), list(QUOTE, makeSymbol("SUBTYPE-P")), makeSymbol("SELF")))))), list(RET, NIL));

    static private final SubLSymbol $sym97$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_INSTANCE_OF_P_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-INSTANCE-OF-P-METHOD");

    private static final SubLSymbol GET_PANEL_TYPE = makeSymbol("GET-PANEL-TYPE");

    static private final SubLList $list_alt101 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt102 = list(list(RET, makeSymbol("PANEL-TYPE")));

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_GET_PANEL_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-GET-PANEL-TYPE-METHOD");

    private static final SubLSymbol SET_PANEL_TYPE = makeSymbol("SET-PANEL-TYPE");

    static private final SubLList $list_alt105 = list(makeSymbol("NEW-PANEL-TYPE"));

    static private final SubLList $list_alt106 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-PANEL-TYPE"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-PANEL-TYPE"))), makeString("(SET-PANEL-TYPE ~S): ~S is not a legal panel type."), makeSymbol("SELF"), makeSymbol("NEW-PANEL-TYPE")), list(makeSymbol("PUNLESS"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("NEW-PANEL-TYPE")), list(makeSymbol("WARN"), makeString("(SET-PANEL-TYPE ~S): ~S is not yet known to be a legal panel type."), makeSymbol("SELF"), makeSymbol("NEW-PANEL-TYPE"))), list(makeSymbol("CSETQ"), makeSymbol("PANEL-TYPE"), makeSymbol("NEW-PANEL-TYPE")), list(RET, makeSymbol("NEW-PANEL-TYPE")));

    static private final SubLSymbol $sym107$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    static private final SubLString $str_alt108$_SET_PANEL_TYPE__S____S_is_not_a_ = makeString("(SET-PANEL-TYPE ~S): ~S is not a legal panel type.");

    static private final SubLString $str_alt109$_SET_PANEL_TYPE__S____S_is_not_ye = makeString("(SET-PANEL-TYPE ~S): ~S is not yet known to be a legal panel type.");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_SET_PANEL_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-SET-PANEL-TYPE-METHOD");

    private static final SubLSymbol GET_POSTING_TYPE = makeSymbol("GET-POSTING-TYPE");

    static private final SubLList $list_alt112 = list(list(RET, makeSymbol("POSTING-TYPE")));

    static private final SubLSymbol $sym113$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_GET_POSTING_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-GET-POSTING-TYPE-METHOD");

    private static final SubLSymbol SET_POSTING_TYPE = makeSymbol("SET-POSTING-TYPE");

    static private final SubLList $list_alt116 = list(makeSymbol("NEW-POSTING-TYPE"));

    static private final SubLList $list_alt117 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-POSTING-TYPE"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-POSTING-TYPE"))), makeString("(SET-POSTING-TYPE ~S): ~S is not a legal posting type."), makeSymbol("SELF"), makeSymbol("NEW-POSTING-TYPE")), list(makeSymbol("PUNLESS"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("NEW-POSTING-TYPE")), list(makeSymbol("WARN"), makeString("(SET-POSTING-TYPE ~S): ~S is not yet known to be a legal posting type."), makeSymbol("SELF"), makeSymbol("NEW-POSTING-TYPE"))), list(makeSymbol("CSETQ"), makeSymbol("POSTING-TYPE"), makeSymbol("NEW-POSTING-TYPE")), list(RET, makeSymbol("NEW-POSTING-TYPE")));

    static private final SubLSymbol $sym118$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    static private final SubLString $str_alt119$_SET_POSTING_TYPE__S____S_is_not_ = makeString("(SET-POSTING-TYPE ~S): ~S is not a legal posting type.");

    static private final SubLString $str_alt120$_SET_POSTING_TYPE__S____S_is_not_ = makeString("(SET-POSTING-TYPE ~S): ~S is not yet known to be a legal posting type.");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_SET_POSTING_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-SET-POSTING-TYPE-METHOD");

    private static final SubLSymbol CREATE_PANEL = makeSymbol("CREATE-PANEL");

    static private final SubLList $list_alt123 = list(makeSymbol("BLACKBOARD"));

    static private final SubLList $list_alt124 = list(list(makeSymbol("PWHEN"), makeSymbol("PANEL-TYPE"), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-PANEL"), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("PANEL-TYPE"), list(QUOTE, makeSymbol("NEW"))))), list(makeSymbol("PUNLESS"), makeSymbol("PANEL-DICTIONARY"), list(makeSymbol("CSETQ"), makeSymbol("PANEL-DICTIONARY"), list(makeSymbol("NEW-DICTIONARY")))), list(makeSymbol("CYBLACK-PANEL-SET-DATATYPE"), makeSymbol("NEW-PANEL"), makeSymbol("SELF")), list(makeSymbol("DICTIONARY-ENTER"), makeSymbol("PANEL-DICTIONARY"), makeSymbol("BLACKBOARD"), makeSymbol("NEW-PANEL")), list(RET, makeSymbol("NEW-PANEL")))), list(RET, NIL));

    static private final SubLSymbol $sym125$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_CREATE_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-CREATE-PANEL-METHOD");



    static private final SubLList $list_alt129 = list(makeKeyword("BEFORE-LISTENERS"), makeKeyword("AFTER-LISTENERS"));

    static private final SubLList $list_alt130 = list(makeSymbol("BLACKBOARD"), makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL));

    static private final SubLList $list_alt131 = list(list(makeSymbol("IGNORE"), makeSymbol("ENVIRONMENT")), list(makeSymbol("PIF"), makeSymbol("PANEL-DICTIONARY"), list(RET, list(makeSymbol("DICTIONARY-LOOKUP"), makeSymbol("PANEL-DICTIONARY"), makeSymbol("BLACKBOARD"), NIL)), list(RET, NIL)));

    static private final SubLSymbol $sym132$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_GET_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-GET-PANEL-METHOD");



    static private final SubLList $list_alt135 = list(list(makeSymbol("PWHEN"), makeSymbol("POSTING-TYPE"), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-POSTING"), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("POSTING-TYPE"), list(QUOTE, makeSymbol("NEW"))))), list(makeSymbol("CYBLACK-POSTING-SET-DATATYPE"), makeSymbol("NEW-POSTING"), makeSymbol("SELF")), list(RET, makeSymbol("NEW-POSTING")))), list(RET, NIL));

    static private final SubLSymbol $sym136$OUTER_CATCH_FOR_CYBLACK_BASIC_DATATYPE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DATATYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_CREATE_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-DATATYPE-CREATE-POSTING-METHOD");

    static private final SubLList $list_alt138 = list(list(makeSymbol("VAR"), makeSymbol("TYPE")), makeSymbol("&REST"), makeSymbol("BODY"));

    static private final SubLString $$$stack = makeString("stack");

    static private final SubLString $$$visited = makeString("visited");





    static private final SubLList $list_alt143 = list(NIL);











    static private final SubLSymbol $sym149$MEMBER_ = makeSymbol("MEMBER?");







    private static final SubLSymbol CYBLACK_DATATYPE_GET_SUBTYPES_INTERNAL = makeSymbol("CYBLACK-DATATYPE-GET-SUBTYPES-INTERNAL");

    private static final SubLSymbol CYBLACK_DATATYPE_GET_SUPERTYPES_INTERNAL = makeSymbol("CYBLACK-DATATYPE-GET-SUPERTYPES-INTERNAL");

    static private final SubLString $$$queue = makeString("queue");

    static private final SubLString $str_alt156$CYBLACK_DATATYPE_SET_PANEL_AND_PO = makeString("CYBLACK-DATATYPE-SET-PANEL-AND-POSTING-TYPES: ~S is not a legal datatype.");

    static private final SubLString $str_alt157$CYBLACK_DATATYPE_SET_PANEL_AND_PO = makeString("CYBLACK-DATATYPE-SET-PANEL-AND-POSTING-TYPES: ~S is not a legal panel type.  A non null symbol was expected.");

    static private final SubLString $str_alt158$CYBLACK_DATATYPE_SET_PANEL_AND_PO = makeString("CYBLACK-DATATYPE-SET-PANEL-AND-POSTING-TYPES: ~S is not a legal posting type.  A non null symbol was expected.");

    static private final SubLString $str_alt159$CYBLACK_DATATYPE_GET_TYPENAME___S = makeString("CYBLACK-DATATYPE-GET-TYPENAME: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt160$CYBLACK_DATATYPE_GET_SUPERTYPES__ = makeString("CYBLACK-DATATYPE-GET-SUPERTYPES: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt161$CYBLACK_DATATYPE_SET_SUPERTYPES__ = makeString("CYBLACK-DATATYPE-SET-SUPERTYPES: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt162$CYBLACK_DATATYPE_GET_SUBTYPES___S = makeString("CYBLACK-DATATYPE-GET-SUBTYPES: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt163$CYBLACK_DATATYPE_SET_SUBTYPES___S = makeString("CYBLACK-DATATYPE-SET-SUBTYPES: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt164$CYBLACK_DATATYPE_SUBTYPE_P___S_is = makeString("CYBLACK-DATATYPE-SUBTYPE-P: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt165$CYBLACK_DATATYPE_INSTANCE_OF_P___ = makeString("CYBLACK-DATATYPE-INSTANCE-OF-P: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt166$CYBLACK_DATATYPE_GET_PANEL_TYPE__ = makeString("CYBLACK-DATATYPE-GET-PANEL-TYPE: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt167$CYBLACK_DATATYPE_SET_PANEL_TYPE__ = makeString("CYBLACK-DATATYPE-SET-PANEL-TYPE: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt168$CYBLACK_DATATYPE_GET_POSTING_TYPE = makeString("CYBLACK-DATATYPE-GET-POSTING-TYPE: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt169$CYBLACK_DATATYPE_SET_POSTING_TYPE = makeString("CYBLACK-DATATYPE-SET-POSTING-TYPE: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt170$CYBLACK_DATATYPE_CREATE_PANEL___S = makeString("CYBLACK-DATATYPE-CREATE-PANEL: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt171$CYBLACK_DATATYPE_GET_PANEL___S_is = makeString("CYBLACK-DATATYPE-GET-PANEL: ~S is not an instance of CYBLACK-DATATYPE.");

    static private final SubLString $str_alt172$CYBLACK_DATATYPE_CREATE_POSTING__ = makeString("CYBLACK-DATATYPE-CREATE-POSTING: ~S is not an instance of CYBLACK-DATATYPE.");

    private static final SubLSymbol CYBLACK_DATATYPE_BAG = makeSymbol("CYBLACK-DATATYPE-BAG");



    static private final SubLList $list_alt175 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OCCURENCES"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DATATYPE_BAG_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DATATYPE-BAG-CLASS");

    private static final SubLSymbol BASIC_COLLECTION = makeSymbol("BASIC-COLLECTION");





    private static final SubLSymbol BAG_REPRESENTATION = makeSymbol("BAG-REPRESENTATION");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DATATYPE_BAG_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DATATYPE-BAG-INSTANCE");



    static private final SubLList $list_alt183 = list(makeSymbol("NEW-CONTENTS"));

    static private final SubLList $list_alt184 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): ~S is not a valid list of CYBLACK-DATATYPE instances."), makeSymbol("SELF"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("OBJECT"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("OBJECT")), makeString("(SET-CONTENTS ~S): ~S is not an instance of CYBLACK-DATATYPE."), makeSymbol("SELF"), makeSymbol("OBJECT"))), list(RET, list(makeSymbol("SET-CONTENTS"), makeSymbol("SUPER"), makeSymbol("NEW-CONTENTS"))));

    static private final SubLString $str_alt185$_SET_CONTENTS__S____S_is_not_a_va = makeString("(SET-CONTENTS ~S): ~S is not a valid list of CYBLACK-DATATYPE instances.");

    static private final SubLString $str_alt186$_SET_CONTENTS__S____S_is_not_an_i = makeString("(SET-CONTENTS ~S): ~S is not an instance of CYBLACK-DATATYPE.");

    private static final SubLSymbol CYBLACK_DATATYPE_BAG_SET_CONTENTS_METHOD = makeSymbol("CYBLACK-DATATYPE-BAG-SET-CONTENTS-METHOD");



    static private final SubLList $list_alt189 = list(makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt190 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("NEW-ELEMENT")), makeString("(ADD ~S): ~S is not an instance of CYBLACK-DATATYPE."), makeSymbol("SELF"), makeSymbol("NEW-ELEMENT")), list(RET, list(makeSymbol("ADD"), makeSymbol("SUPER"), makeSymbol("NEW-ELEMENT"))));

    static private final SubLString $str_alt191$_ADD__S____S_is_not_an_instance_o = makeString("(ADD ~S): ~S is not an instance of CYBLACK-DATATYPE.");

    private static final SubLSymbol CYBLACK_DATATYPE_BAG_ADD_METHOD = makeSymbol("CYBLACK-DATATYPE-BAG-ADD-METHOD");



    static private final SubLList $list_alt194 = list(makeSymbol("OLD-ELEMENT"));

    static private final SubLList $list_alt195 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("OLD-ELEMENT")), makeString("(REMOVE ~S): ~S is not an instance of CYBLACK-DATATYPE."), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT")), list(RET, list(makeSymbol("REMOVE"), makeSymbol("SUPER"), makeSymbol("OLD-ELEMENT"))));

    static private final SubLString $str_alt196$_REMOVE__S____S_is_not_an_instanc = makeString("(REMOVE ~S): ~S is not an instance of CYBLACK-DATATYPE.");

    private static final SubLSymbol CYBLACK_DATATYPE_BAG_REMOVE_METHOD = makeSymbol("CYBLACK-DATATYPE-BAG-REMOVE-METHOD");



    static private final SubLList $list_alt199 = list(makeSymbol("ELEMENT"));

    static private final SubLList $list_alt200 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("ELEMENT")), makeString("(MEMBER-P ~S): ~S is not an instance of CYBLACK-DATATYPE."), makeSymbol("SELF"), makeSymbol("ELEMENT")), list(RET, list(makeSymbol("MEMBER-P"), makeSymbol("SUPER"), makeSymbol("ELEMENT"))));

    static private final SubLString $str_alt201$_MEMBER_P__S____S_is_not_an_insta = makeString("(MEMBER-P ~S): ~S is not an instance of CYBLACK-DATATYPE.");

    private static final SubLSymbol CYBLACK_DATATYPE_BAG_MEMBER_P_METHOD = makeSymbol("CYBLACK-DATATYPE-BAG-MEMBER-P-METHOD");

    private static final SubLSymbol OCCURENCES = makeSymbol("OCCURENCES");

    static private final SubLList $list_alt204 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("ELEMENT")), makeString("(OCCURENCES ~S): ~S is not an instance of CYBLACK-DATATYPE."), makeSymbol("SELF"), makeSymbol("ELEMENT")), list(RET, list(makeSymbol("OCCURENCES"), makeSymbol("SUPER"), makeSymbol("ELEMENT"))));

    static private final SubLString $str_alt205$_OCCURENCES__S____S_is_not_an_ins = makeString("(OCCURENCES ~S): ~S is not an instance of CYBLACK-DATATYPE.");

    private static final SubLSymbol CYBLACK_DATATYPE_BAG_OCCURENCES_METHOD = makeSymbol("CYBLACK-DATATYPE-BAG-OCCURENCES-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_datatype_file();
    }

    public void initializeVariables() {
        init_cyblack_datatype_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_datatype_file();
    }
}

