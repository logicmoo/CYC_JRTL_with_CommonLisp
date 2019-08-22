/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.subloop_structures;
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
 *  module:      CYBLACK-FUNCTION-OBJECT-POSTING
 *  source file: /cyc/top/cycl/cyblack/cyblack-function-object-posting.lisp
 *  created:     2019/07/03 17:38:44
 */
public final class cyblack_function_object_posting extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_function_object_posting() {
    }

    public static final SubLFile me = new cyblack_function_object_posting();


    // // Definitions
    public static final SubLObject get_cyblack_function_object_posting_domain_tuple(SubLObject v_cyblack_function_object_posting) {
        return classes.subloop_get_instance_slot(v_cyblack_function_object_posting, TWENTY_INTEGER);
    }

    public static final SubLObject set_cyblack_function_object_posting_domain_tuple(SubLObject v_cyblack_function_object_posting, SubLObject value) {
        return classes.subloop_set_instance_slot(v_cyblack_function_object_posting, value, TWENTY_INTEGER);
    }

    public static final SubLObject get_cyblack_function_object_posting_symbolic_function_name(SubLObject v_cyblack_function_object_posting) {
        {
            SubLObject v_class = (v_cyblack_function_object_posting.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_cyblack_function_object_posting))) : NIL != subloop_structures.class_p(v_cyblack_function_object_posting) ? ((SubLObject) (v_cyblack_function_object_posting)) : NIL != subloop_structures.instance_p(v_cyblack_function_object_posting) ? ((SubLObject) (subloop_structures.instance_class(v_cyblack_function_object_posting))) : NIL;
            if (NIL != v_class) {
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_cyblack_function_object_posting_symbolic_function_name(SubLObject v_cyblack_function_object_posting, SubLObject value) {
        {
            SubLObject v_class = (v_cyblack_function_object_posting.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_cyblack_function_object_posting))) : NIL != subloop_structures.class_p(v_cyblack_function_object_posting) ? ((SubLObject) (v_cyblack_function_object_posting)) : NIL != subloop_structures.instance_p(v_cyblack_function_object_posting) ? ((SubLObject) (subloop_structures.instance_class(v_cyblack_function_object_posting))) : NIL;
            if (NIL != v_class) {
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_function_object_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_FUNCTION_OBJECT_POSTING, SYMBOLIC_FUNCTION_NAME, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_function_object_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_FUNCTION_OBJECT_POSTING, DOMAIN_TUPLE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_function_object_posting_p(SubLObject v_cyblack_function_object_posting) {
        return classes.subloop_instanceof_class(v_cyblack_function_object_posting, CYBLACK_FUNCTION_OBJECT_POSTING);
    }

    public static final SubLObject cyblack_function_object_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_function_object_posting_method = NIL;
            SubLObject symbolic_function_name = get_cyblack_function_object_posting_symbolic_function_name(self);
            SubLObject domain_tuple = get_cyblack_function_object_posting_domain_tuple(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_initialize_method(self);
                    if (NIL == symbolic_function_name) {
                        symbolic_function_name = GENERIC_FUNCTION;
                    }
                    domain_tuple = NIL;
                    sublisp_throw($sym40$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_object_posting_symbolic_function_name(self, symbolic_function_name);
                            set_cyblack_function_object_posting_domain_tuple(self, domain_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_object_posting_method = Errors.handleThrowable(ccatch_env_var, $sym40$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_function_object_posting_method;
        }
    }

    public static final SubLObject cyblack_function_object_posting_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_function_object_posting_method = NIL;
            SubLObject symbolic_function_name = get_cyblack_function_object_posting_symbolic_function_name(self);
            SubLObject domain_tuple = get_cyblack_function_object_posting_domain_tuple(self);
            try {
                try {
                    if (NIL != domain_tuple) {
                        format(stream, $str_alt48$_S_S, symbolic_function_name, domain_tuple);
                    } else {
                        format(stream, $str_alt49$_S__, symbolic_function_name);
                    }
                    sublisp_throw($sym47$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_object_posting_symbolic_function_name(self, symbolic_function_name);
                            set_cyblack_function_object_posting_domain_tuple(self, domain_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_object_posting_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_function_object_posting_method;
        }
    }

    public static final SubLObject cyblack_function_object_posting_domain_tuple_length_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_function_object_posting_method = NIL;
            SubLObject domain_tuple = get_cyblack_function_object_posting_domain_tuple(self);
            try {
                try {
                    sublisp_throw($sym53$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD, length(domain_tuple));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_object_posting_domain_tuple(self, domain_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_object_posting_method = Errors.handleThrowable(ccatch_env_var, $sym53$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_function_object_posting_method;
        }
    }

    public static final SubLObject cyblack_function_object_posting_get_arg_method(SubLObject self, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_function_object_posting_method = NIL;
                SubLObject domain_tuple = get_cyblack_function_object_posting_domain_tuple(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((n.isInteger() && n.numGE(ZERO_INTEGER)) && n.numL(length(domain_tuple)))) {
                                Errors.error($str_alt59$_GET_ARG__S___Invalid_index__S___, self, n, length(domain_tuple));
                            }
                        }
                        sublisp_throw($sym58$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD, nth(n, domain_tuple));
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_function_object_posting_domain_tuple(self, domain_tuple);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_function_object_posting_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD);
                }
                return catch_var_for_cyblack_function_object_posting_method;
            }
        }
    }

    public static final SubLObject cyblack_function_object_posting_set_arg_method(SubLObject self, SubLObject n, SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_function_object_posting_method = NIL;
                SubLObject domain_tuple = get_cyblack_function_object_posting_domain_tuple(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((n.isInteger() && n.numGE(ZERO_INTEGER)) && n.numL(length(domain_tuple)))) {
                                Errors.error($str_alt65$_SET_ARG__S___Invalid_index__S___, self, n, length(domain_tuple));
                            }
                        }
                        set_nth(n, domain_tuple, new_value);
                        sublisp_throw($sym64$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD, new_value);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_function_object_posting_domain_tuple(self, domain_tuple);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_function_object_posting_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD);
                }
                return catch_var_for_cyblack_function_object_posting_method;
            }
        }
    }

    public static final SubLObject cyblack_function_object_posting_get_args_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_function_object_posting_method = NIL;
            SubLObject domain_tuple = get_cyblack_function_object_posting_domain_tuple(self);
            try {
                try {
                    sublisp_throw($sym69$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD, copy_list(domain_tuple));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_object_posting_domain_tuple(self, domain_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_object_posting_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD);
            }
            return catch_var_for_cyblack_function_object_posting_method;
        }
    }

    public static final SubLObject cyblack_function_object_posting_set_args_method(SubLObject self, SubLObject new_args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_function_object_posting_method = NIL;
                SubLObject domain_tuple = get_cyblack_function_object_posting_domain_tuple(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_args.isList()) {
                                Errors.error($str_alt75$_SET_ARGS__S____S_is_not_a_valid_, self, new_args);
                            }
                        }
                        domain_tuple = copy_list(new_args);
                        sublisp_throw($sym74$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD, new_args);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_function_object_posting_domain_tuple(self, domain_tuple);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_function_object_posting_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD);
                }
                return catch_var_for_cyblack_function_object_posting_method;
            }
        }
    }

    public static final SubLObject get_cyblack_function_map_posting_range_tuple(SubLObject cyblack_function_map_posting) {
        return classes.subloop_get_instance_slot(cyblack_function_map_posting, $int$21);
    }

    public static final SubLObject set_cyblack_function_map_posting_range_tuple(SubLObject cyblack_function_map_posting, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_function_map_posting, value, $int$21);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_function_map_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_FUNCTION_OBJECT_POSTING, SYMBOLIC_FUNCTION_NAME, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_function_map_posting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_FUNCTION_OBJECT_POSTING, DOMAIN_TUPLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_FUNCTION_MAP_POSTING, RANGE_TUPLE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_function_map_posting_p(SubLObject cyblack_function_map_posting) {
        return classes.subloop_instanceof_class(cyblack_function_map_posting, CYBLACK_FUNCTION_MAP_POSTING);
    }

    public static final SubLObject cyblack_function_map_posting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_function_map_posting_method = NIL;
            SubLObject range_tuple = get_cyblack_function_map_posting_range_tuple(self);
            try {
                try {
                    cyblack_function_object_posting_initialize_method(self);
                    range_tuple = NIL;
                    sublisp_throw($sym84$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_map_posting_range_tuple(self, range_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_map_posting_method = Errors.handleThrowable(ccatch_env_var, $sym84$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD);
            }
            return catch_var_for_cyblack_function_map_posting_method;
        }
    }

    public static final SubLObject cyblack_function_map_posting_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_function_map_posting_method = NIL;
            SubLObject range_tuple = get_cyblack_function_map_posting_range_tuple(self);
            try {
                try {
                    cyblack_function_object_posting_print_method(self, stream, depth);
                    if (NIL != range_tuple) {
                        format(stream, $str_alt88$__S, range_tuple);
                    } else {
                        format(stream, $str_alt89$___);
                    }
                    sublisp_throw($sym87$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_map_posting_range_tuple(self, range_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_map_posting_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD);
            }
            return catch_var_for_cyblack_function_map_posting_method;
        }
    }

    public static final SubLObject cyblack_function_map_posting_range_tuple_length_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_function_map_posting_method = NIL;
            SubLObject range_tuple = get_cyblack_function_map_posting_range_tuple(self);
            try {
                try {
                    sublisp_throw($sym93$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD, length(range_tuple));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_map_posting_range_tuple(self, range_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_map_posting_method = Errors.handleThrowable(ccatch_env_var, $sym93$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD);
            }
            return catch_var_for_cyblack_function_map_posting_method;
        }
    }

    public static final SubLObject cyblack_function_map_posting_get_value_method(SubLObject self, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_function_map_posting_method = NIL;
                SubLObject range_tuple = get_cyblack_function_map_posting_range_tuple(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((n.isInteger() && n.numGE(ZERO_INTEGER)) && n.numL(length(range_tuple)))) {
                                Errors.error($str_alt98$_GET_VALUE__S___Invalid_index__S_, self, n, length(range_tuple));
                            }
                        }
                        sublisp_throw($sym97$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD, nth(n, range_tuple));
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_function_map_posting_range_tuple(self, range_tuple);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_function_map_posting_method = Errors.handleThrowable(ccatch_env_var, $sym97$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD);
                }
                return catch_var_for_cyblack_function_map_posting_method;
            }
        }
    }

    public static final SubLObject cyblack_function_map_posting_set_value_method(SubLObject self, SubLObject n, SubLObject new_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_function_map_posting_method = NIL;
                SubLObject range_tuple = get_cyblack_function_map_posting_range_tuple(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((n.isInteger() && n.numGE(ZERO_INTEGER)) && n.numL(length(range_tuple)))) {
                                Errors.error($str_alt103$_SET_VALUE__S___Invalid_index__S_, self, n, length(range_tuple));
                            }
                        }
                        set_nth(n, range_tuple, new_value);
                        sublisp_throw($sym102$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD, new_value);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_function_map_posting_range_tuple(self, range_tuple);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_function_map_posting_method = Errors.handleThrowable(ccatch_env_var, $sym102$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD);
                }
                return catch_var_for_cyblack_function_map_posting_method;
            }
        }
    }

    public static final SubLObject cyblack_function_map_posting_get_values_method(SubLObject self, SubLObject copy) {
        if (copy == UNPROVIDED) {
            copy = T;
        }
        {
            SubLObject catch_var_for_cyblack_function_map_posting_method = NIL;
            SubLObject range_tuple = get_cyblack_function_map_posting_range_tuple(self);
            try {
                try {
                    sublisp_throw($sym108$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD, NIL != copy ? ((SubLObject) (copy_list(range_tuple))) : range_tuple);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_map_posting_range_tuple(self, range_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_map_posting_method = Errors.handleThrowable(ccatch_env_var, $sym108$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD);
            }
            return catch_var_for_cyblack_function_map_posting_method;
        }
    }

    public static final SubLObject cyblack_function_map_posting_set_values_method(SubLObject self, SubLObject new_values) {
        {
            SubLObject catch_var_for_cyblack_function_map_posting_method = NIL;
            SubLObject range_tuple = get_cyblack_function_map_posting_range_tuple(self);
            try {
                try {
                    range_tuple = copy_list(new_values);
                    sublisp_throw($sym113$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD, new_values);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_map_posting_range_tuple(self, range_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_map_posting_method = Errors.handleThrowable(ccatch_env_var, $sym113$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD);
            }
            return catch_var_for_cyblack_function_map_posting_method;
        }
    }

    public static final SubLObject get_cyblack_function_object_posting_visitor_postings(SubLObject cyblack_function_object_posting_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_function_object_posting_visitor, FIVE_INTEGER, POSTINGS);
    }

    public static final SubLObject set_cyblack_function_object_posting_visitor_postings(SubLObject cyblack_function_object_posting_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_function_object_posting_visitor, value, FIVE_INTEGER, POSTINGS);
    }

    public static final SubLObject get_cyblack_function_object_posting_visitor_domain_tuple(SubLObject cyblack_function_object_posting_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_function_object_posting_visitor, FOUR_INTEGER, DOMAIN_TUPLE);
    }

    public static final SubLObject set_cyblack_function_object_posting_visitor_domain_tuple(SubLObject cyblack_function_object_posting_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_function_object_posting_visitor, value, FOUR_INTEGER, DOMAIN_TUPLE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_function_object_posting_visitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_function_object_posting_visitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, DOMAIN_TUPLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, POSTINGS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_function_object_posting_visitor_p(SubLObject cyblack_function_object_posting_visitor) {
        return classes.subloop_instanceof_class(cyblack_function_object_posting_visitor, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR);
    }

    public static final SubLObject cyblack_function_object_posting_visitor_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_function_object_posting_visitor_method = NIL;
            SubLObject postings = get_cyblack_function_object_posting_visitor_postings(self);
            SubLObject domain_tuple = get_cyblack_function_object_posting_visitor_domain_tuple(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_visitor_initialize_method(self);
                    domain_tuple = NIL;
                    postings = NIL;
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_object_posting_visitor_postings(self, postings);
                            set_cyblack_function_object_posting_visitor_domain_tuple(self, domain_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_object_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym123$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_function_object_posting_visitor_method;
        }
    }

    public static final SubLObject cyblack_function_object_posting_visitor_set_initial_state_method(SubLObject self, SubLObject new_application, SubLObject new_state) {
        if (new_state == UNPROVIDED) {
            new_state = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_function_object_posting_visitor_method = NIL;
            SubLObject postings = get_cyblack_function_object_posting_visitor_postings(self);
            SubLObject domain_tuple = get_cyblack_function_object_posting_visitor_domain_tuple(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_visitor_set_initial_state_method(self, new_application, UNPROVIDED);
                    domain_tuple = copy_list(new_state);
                    postings = NIL;
                    sublisp_throw($sym128$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_METHOD, new_state);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_object_posting_visitor_postings(self, postings);
                            set_cyblack_function_object_posting_visitor_domain_tuple(self, domain_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_object_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_function_object_posting_visitor_method;
        }
    }

    public static final SubLObject cyblack_function_object_posting_visitor_visit_method(SubLObject self, SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_function_object_posting_visitor_method = NIL;
                SubLObject postings = get_cyblack_function_object_posting_visitor_postings(self);
                SubLObject domain_tuple = get_cyblack_function_object_posting_visitor_domain_tuple(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == instances.instance_of_p(v_cyblack_posting, CYBLACK_FUNCTION_OBJECT_POSTING)) {
                                Errors.error($str_alt134$_VISIT__S____S_is_not_an_instance, self, v_cyblack_posting);
                            }
                        }
                        {
                            SubLObject posting_domain_tuple = get_cyblack_function_object_posting_domain_tuple(v_cyblack_posting);
                            if (domain_tuple.equal(posting_domain_tuple)) {
                                postings = cons(v_cyblack_posting, postings);
                            }
                        }
                        sublisp_throw($sym133$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_METHOD, v_cyblack_posting);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_function_object_posting_visitor_postings(self, postings);
                                set_cyblack_function_object_posting_visitor_domain_tuple(self, domain_tuple);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_function_object_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym133$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_METHOD);
                }
                return catch_var_for_cyblack_function_object_posting_visitor_method;
            }
        }
    }

    public static final SubLObject cyblack_function_object_posting_visitor_get_final_state_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_function_object_posting_visitor_method = NIL;
            SubLObject postings = get_cyblack_function_object_posting_visitor_postings(self);
            try {
                try {
                    sublisp_throw($sym138$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_METHOD, reverse(postings));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_object_posting_visitor_postings(self, postings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_object_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym138$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_function_object_posting_visitor_method;
        }
    }

    /**
     * Enumerated values of type CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_function_map_posting_visitor_operations$ = makeSymbol("*VALID-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATIONS*");

    /**
     * Returns a list of all valid members of the CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION enumeration.
     */
    public static final SubLObject valid_cyblack_function_map_posting_visitor_operations() {
        return $valid_cyblack_function_map_posting_visitor_operations$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION enumeration.
     */
    public static final SubLObject cyblack_function_map_posting_visitor_operation_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_function_map_posting_visitor_operations$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_function_map_posting_visitor_operation(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_function_map_posting_visitor_operations$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt142$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION, value, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION enumeration.
     */
    public static final SubLObject decode_cyblack_function_map_posting_visitor_operation(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_function_map_posting_visitor_operations$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt144$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION, value, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION enumeration.
     */
    public static final SubLObject cyblack_function_map_posting_visitor_operation_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_function_map_posting_visitor_operation_p(value1)) {
                    Errors.error($str_alt146$_S___S_was_expected_to_be_a_membe, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION_P, value1, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_function_map_posting_visitor_operation_p(value2)) {
                    Errors.error($str_alt146$_S___S_was_expected_to_be_a_membe, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION_P, value2, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_function_map_posting_visitor_operations$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION enumeration.
     */
    public static final SubLObject cyblack_function_map_posting_visitor_operation_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_function_map_posting_visitor_operation_p(value1)) {
                    Errors.error($str_alt146$_S___S_was_expected_to_be_a_membe, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION_P, value1, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_function_map_posting_visitor_operation_p(value2)) {
                    Errors.error($str_alt146$_S___S_was_expected_to_be_a_membe, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION_P, value2, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_function_map_posting_visitor_operations$.getGlobalValue();
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

    public static final SubLObject get_cyblack_function_map_posting_visitor_range_tuple(SubLObject cyblack_function_map_posting_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_function_map_posting_visitor, SEVEN_INTEGER, RANGE_TUPLE);
    }

    public static final SubLObject set_cyblack_function_map_posting_visitor_range_tuple(SubLObject cyblack_function_map_posting_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_function_map_posting_visitor, value, SEVEN_INTEGER, RANGE_TUPLE);
    }

    public static final SubLObject get_cyblack_function_map_posting_visitor_operation_type(SubLObject cyblack_function_map_posting_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_function_map_posting_visitor, SIX_INTEGER, OPERATION_TYPE);
    }

    public static final SubLObject set_cyblack_function_map_posting_visitor_operation_type(SubLObject cyblack_function_map_posting_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_function_map_posting_visitor, value, SIX_INTEGER, OPERATION_TYPE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_function_map_posting_visitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_function_map_posting_visitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, DOMAIN_TUPLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, POSTINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_FUNCTION_MAP_POSTING_VISITOR, OPERATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_FUNCTION_MAP_POSTING_VISITOR, RANGE_TUPLE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_function_map_posting_visitor_p(SubLObject cyblack_function_map_posting_visitor) {
        return classes.subloop_instanceof_class(cyblack_function_map_posting_visitor, CYBLACK_FUNCTION_MAP_POSTING_VISITOR);
    }

    public static final SubLObject cyblack_function_map_posting_visitor_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_function_map_posting_visitor_method = NIL;
            SubLObject range_tuple = get_cyblack_function_map_posting_visitor_range_tuple(self);
            SubLObject operation_type = get_cyblack_function_map_posting_visitor_operation_type(self);
            try {
                try {
                    cyblack_function_object_posting_visitor_initialize_method(self);
                    operation_type = $MATCH_MAP;
                    range_tuple = NIL;
                    sublisp_throw($sym154$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_map_posting_visitor_range_tuple(self, range_tuple);
                            set_cyblack_function_map_posting_visitor_operation_type(self, operation_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_map_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym154$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_function_map_posting_visitor_method;
        }
    }

    public static final SubLObject cyblack_function_map_posting_visitor_get_operation_type_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_function_map_posting_visitor_method = NIL;
            SubLObject operation_type = get_cyblack_function_map_posting_visitor_operation_type(self);
            try {
                try {
                    sublisp_throw($sym159$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD, operation_type);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_map_posting_visitor_operation_type(self, operation_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_map_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym159$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_function_map_posting_visitor_method;
        }
    }

    public static final SubLObject cyblack_function_map_posting_visitor_set_operation_type_method(SubLObject self, SubLObject new_operation_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_function_map_posting_visitor_method = NIL;
                SubLObject operation_type = get_cyblack_function_map_posting_visitor_operation_type(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_function_map_posting_visitor_operation_p(new_operation_type)) {
                                Errors.error($str_alt165$_SET_OPERATION_TYPE__S____S_is_no, self, new_operation_type);
                            }
                        }
                        operation_type = new_operation_type;
                        sublisp_throw($sym164$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD, new_operation_type);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_function_map_posting_visitor_operation_type(self, operation_type);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_function_map_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD);
                }
                return catch_var_for_cyblack_function_map_posting_visitor_method;
            }
        }
    }

    public static final SubLObject cyblack_function_map_posting_visitor_set_initial_state_method(SubLObject self, SubLObject new_application, SubLObject new_domain, SubLObject new_range) {
        if (new_domain == UNPROVIDED) {
            new_domain = NIL;
        }
        if (new_range == UNPROVIDED) {
            new_range = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_function_map_posting_visitor_method = NIL;
            SubLObject range_tuple = get_cyblack_function_map_posting_visitor_range_tuple(self);
            try {
                try {
                    cyblack_function_object_posting_visitor_set_initial_state_method(self, new_application, new_domain);
                    range_tuple = copy_list(new_range);
                    sublisp_throw($sym169$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD, new_range);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_function_map_posting_visitor_range_tuple(self, range_tuple);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_function_map_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym169$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_function_map_posting_visitor_method;
        }
    }

    public static final SubLObject cyblack_function_map_posting_visitor_visit_method(SubLObject self, SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_function_map_posting_visitor_method = NIL;
                SubLObject range_tuple = get_cyblack_function_map_posting_visitor_range_tuple(self);
                SubLObject operation_type = get_cyblack_function_map_posting_visitor_operation_type(self);
                SubLObject postings = get_cyblack_function_object_posting_visitor_postings(self);
                SubLObject domain_tuple = get_cyblack_function_object_posting_visitor_domain_tuple(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == instances.instance_of_p(v_cyblack_posting, CYBLACK_FUNCTION_MAP_POSTING)) {
                                Errors.error($str_alt173$_VISIT__S____S_is_not_an_instance, self, v_cyblack_posting);
                            }
                        }
                        {
                            SubLObject pcase_var = operation_type;
                            if (pcase_var.eql($MATCH_DOMAIN)) {
                                sublisp_throw($sym172$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD, cyblack_function_object_posting_visitor_visit_method(self, v_cyblack_posting));
                            } else
                                if (pcase_var.eql($MATCH_RANGE)) {
                                    {
                                        SubLObject posting_range_tuple = get_cyblack_function_map_posting_visitor_range_tuple(v_cyblack_posting);
                                        if (range_tuple.equal(posting_range_tuple)) {
                                            postings = cons(v_cyblack_posting, postings);
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($MATCH_MAP)) {
                                        {
                                            SubLObject posting_domain_tuple = get_cyblack_function_object_posting_domain_tuple(v_cyblack_posting);
                                            SubLObject posting_range_tuple = get_cyblack_function_map_posting_visitor_range_tuple(v_cyblack_posting);
                                            if (domain_tuple.equal(posting_domain_tuple) && range_tuple.equal(posting_range_tuple)) {
                                                postings = cons(v_cyblack_posting, postings);
                                            }
                                        }
                                    }


                        }
                        sublisp_throw($sym172$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD, v_cyblack_posting);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_function_map_posting_visitor_range_tuple(self, range_tuple);
                                set_cyblack_function_map_posting_visitor_operation_type(self, operation_type);
                                set_cyblack_function_object_posting_visitor_postings(self, postings);
                                set_cyblack_function_object_posting_visitor_domain_tuple(self, domain_tuple);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_function_map_posting_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym172$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD);
                }
                return catch_var_for_cyblack_function_map_posting_visitor_method;
            }
        }
    }

    public static final SubLObject declare_cyblack_function_object_posting_file() {
        declareFunction("get_cyblack_function_object_posting_domain_tuple", "GET-CYBLACK-FUNCTION-OBJECT-POSTING-DOMAIN-TUPLE", 1, 0, false);
        declareFunction("set_cyblack_function_object_posting_domain_tuple", "SET-CYBLACK-FUNCTION-OBJECT-POSTING-DOMAIN-TUPLE", 2, 0, false);
        declareFunction("get_cyblack_function_object_posting_symbolic_function_name", "GET-CYBLACK-FUNCTION-OBJECT-POSTING-SYMBOLIC-FUNCTION-NAME", 1, 0, false);
        declareFunction("set_cyblack_function_object_posting_symbolic_function_name", "SET-CYBLACK-FUNCTION-OBJECT-POSTING-SYMBOLIC-FUNCTION-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_function_object_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_function_object_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_function_object_posting_p", "CYBLACK-FUNCTION-OBJECT-POSTING-P", 1, 0, false);
        declareFunction("cyblack_function_object_posting_initialize_method", "CYBLACK-FUNCTION-OBJECT-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_function_object_posting_print_method", "CYBLACK-FUNCTION-OBJECT-POSTING-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_function_object_posting_domain_tuple_length_method", "CYBLACK-FUNCTION-OBJECT-POSTING-DOMAIN-TUPLE-LENGTH-METHOD", 1, 0, false);
        declareFunction("cyblack_function_object_posting_get_arg_method", "CYBLACK-FUNCTION-OBJECT-POSTING-GET-ARG-METHOD", 2, 0, false);
        declareFunction("cyblack_function_object_posting_set_arg_method", "CYBLACK-FUNCTION-OBJECT-POSTING-SET-ARG-METHOD", 3, 0, false);
        declareFunction("cyblack_function_object_posting_get_args_method", "CYBLACK-FUNCTION-OBJECT-POSTING-GET-ARGS-METHOD", 1, 0, false);
        declareFunction("cyblack_function_object_posting_set_args_method", "CYBLACK-FUNCTION-OBJECT-POSTING-SET-ARGS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_function_map_posting_range_tuple", "GET-CYBLACK-FUNCTION-MAP-POSTING-RANGE-TUPLE", 1, 0, false);
        declareFunction("set_cyblack_function_map_posting_range_tuple", "SET-CYBLACK-FUNCTION-MAP-POSTING-RANGE-TUPLE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_function_map_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_function_map_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_function_map_posting_p", "CYBLACK-FUNCTION-MAP-POSTING-P", 1, 0, false);
        declareFunction("cyblack_function_map_posting_initialize_method", "CYBLACK-FUNCTION-MAP-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_function_map_posting_print_method", "CYBLACK-FUNCTION-MAP-POSTING-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_function_map_posting_range_tuple_length_method", "CYBLACK-FUNCTION-MAP-POSTING-RANGE-TUPLE-LENGTH-METHOD", 1, 0, false);
        declareFunction("cyblack_function_map_posting_get_value_method", "CYBLACK-FUNCTION-MAP-POSTING-GET-VALUE-METHOD", 2, 0, false);
        declareFunction("cyblack_function_map_posting_set_value_method", "CYBLACK-FUNCTION-MAP-POSTING-SET-VALUE-METHOD", 3, 0, false);
        declareFunction("cyblack_function_map_posting_get_values_method", "CYBLACK-FUNCTION-MAP-POSTING-GET-VALUES-METHOD", 1, 1, false);
        declareFunction("cyblack_function_map_posting_set_values_method", "CYBLACK-FUNCTION-MAP-POSTING-SET-VALUES-METHOD", 2, 0, false);
        declareFunction("get_cyblack_function_object_posting_visitor_postings", "GET-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-POSTINGS", 1, 0, false);
        declareFunction("set_cyblack_function_object_posting_visitor_postings", "SET-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-POSTINGS", 2, 0, false);
        declareFunction("get_cyblack_function_object_posting_visitor_domain_tuple", "GET-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-DOMAIN-TUPLE", 1, 0, false);
        declareFunction("set_cyblack_function_object_posting_visitor_domain_tuple", "SET-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-DOMAIN-TUPLE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_function_object_posting_visitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_function_object_posting_visitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_function_object_posting_visitor_p", "CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-P", 1, 0, false);
        declareFunction("cyblack_function_object_posting_visitor_initialize_method", "CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_function_object_posting_visitor_set_initial_state_method", "CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-SET-INITIAL-STATE-METHOD", 2, 1, false);
        declareFunction("cyblack_function_object_posting_visitor_visit_method", "CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-VISIT-METHOD", 2, 0, false);
        declareFunction("cyblack_function_object_posting_visitor_get_final_state_method", "CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-GET-FINAL-STATE-METHOD", 1, 0, false);
        declareFunction("valid_cyblack_function_map_posting_visitor_operations", "VALID-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATIONS", 0, 0, false);
        declareFunction("cyblack_function_map_posting_visitor_operation_p", "CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION-P", 1, 0, false);
        declareFunction("encode_cyblack_function_map_posting_visitor_operation", "ENCODE-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION", 1, 0, false);
        declareFunction("decode_cyblack_function_map_posting_visitor_operation", "DECODE-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION", 1, 0, false);
        declareFunction("cyblack_function_map_posting_visitor_operation_less_p", "CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION-LESS-P", 2, 0, false);
        declareFunction("cyblack_function_map_posting_visitor_operation_greater_p", "CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_function_map_posting_visitor_range_tuple", "GET-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-RANGE-TUPLE", 1, 0, false);
        declareFunction("set_cyblack_function_map_posting_visitor_range_tuple", "SET-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-RANGE-TUPLE", 2, 0, false);
        declareFunction("get_cyblack_function_map_posting_visitor_operation_type", "GET-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION-TYPE", 1, 0, false);
        declareFunction("set_cyblack_function_map_posting_visitor_operation_type", "SET-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION-TYPE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_function_map_posting_visitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_function_map_posting_visitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_function_map_posting_visitor_p", "CYBLACK-FUNCTION-MAP-POSTING-VISITOR-P", 1, 0, false);
        declareFunction("cyblack_function_map_posting_visitor_initialize_method", "CYBLACK-FUNCTION-MAP-POSTING-VISITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_function_map_posting_visitor_get_operation_type_method", "CYBLACK-FUNCTION-MAP-POSTING-VISITOR-GET-OPERATION-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_function_map_posting_visitor_set_operation_type_method", "CYBLACK-FUNCTION-MAP-POSTING-VISITOR-SET-OPERATION-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_function_map_posting_visitor_set_initial_state_method", "CYBLACK-FUNCTION-MAP-POSTING-VISITOR-SET-INITIAL-STATE-METHOD", 2, 2, false);
        declareFunction("cyblack_function_map_posting_visitor_visit_method", "CYBLACK-FUNCTION-MAP-POSTING-VISITOR-VISIT-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_function_object_posting_file() {
        defconstant("*VALID-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATIONS*", $list_alt140);
        return NIL;
    }

    public static final SubLObject setup_cyblack_function_object_posting_file() {
                classes.subloop_new_class(CYBLACK_FUNCTION_OBJECT_POSTING, CYBLACK_BASIC_POSTING, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_FUNCTION_OBJECT_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_FUNCTION_OBJECT_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_FUNCTION_OBJECT_POSTING, $sym36$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_POSTING_INSTA);
        subloop_reserved_initialize_cyblack_function_object_posting_class(CYBLACK_FUNCTION_OBJECT_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_FUNCTION_OBJECT_POSTING, $list_alt38, NIL, $list_alt39);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_POSTING, INITIALIZE, CYBLACK_FUNCTION_OBJECT_POSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_FUNCTION_OBJECT_POSTING, $list_alt44, $list_alt45, $list_alt46);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_POSTING, PRINT, CYBLACK_FUNCTION_OBJECT_POSTING_PRINT_METHOD);
        methods.methods_incorporate_instance_method(DOMAIN_TUPLE_LENGTH, CYBLACK_FUNCTION_OBJECT_POSTING, $list_alt44, NIL, $list_alt52);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_POSTING, DOMAIN_TUPLE_LENGTH, CYBLACK_FUNCTION_OBJECT_POSTING_DOMAIN_TUPLE_LENGTH_METHOD);
        methods.methods_incorporate_instance_method(GET_ARG, CYBLACK_FUNCTION_OBJECT_POSTING, $list_alt44, $list_alt56, $list_alt57);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_POSTING, GET_ARG, CYBLACK_FUNCTION_OBJECT_POSTING_GET_ARG_METHOD);
        methods.methods_incorporate_instance_method(SET_ARG, CYBLACK_FUNCTION_OBJECT_POSTING, $list_alt44, $list_alt62, $list_alt63);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_POSTING, SET_ARG, CYBLACK_FUNCTION_OBJECT_POSTING_SET_ARG_METHOD);
        methods.methods_incorporate_instance_method(GET_ARGS, CYBLACK_FUNCTION_OBJECT_POSTING, $list_alt44, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_POSTING, GET_ARGS, CYBLACK_FUNCTION_OBJECT_POSTING_GET_ARGS_METHOD);
        methods.methods_incorporate_instance_method(SET_ARGS, CYBLACK_FUNCTION_OBJECT_POSTING, $list_alt44, $list_alt72, $list_alt73);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_POSTING, SET_ARGS, CYBLACK_FUNCTION_OBJECT_POSTING_SET_ARGS_METHOD);
        classes.subloop_new_class(CYBLACK_FUNCTION_MAP_POSTING, CYBLACK_FUNCTION_OBJECT_POSTING, NIL, NIL, $list_alt78);
        classes.class_set_implements_slot_listeners(CYBLACK_FUNCTION_MAP_POSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_FUNCTION_MAP_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_FUNCTION_MAP_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_function_map_posting_class(CYBLACK_FUNCTION_MAP_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_FUNCTION_MAP_POSTING, $list_alt38, NIL, $list_alt83);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING, INITIALIZE, CYBLACK_FUNCTION_MAP_POSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_FUNCTION_MAP_POSTING, $list_alt44, $list_alt45, $list_alt86);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING, PRINT, CYBLACK_FUNCTION_MAP_POSTING_PRINT_METHOD);
        methods.methods_incorporate_instance_method(RANGE_TUPLE_LENGTH, CYBLACK_FUNCTION_MAP_POSTING, $list_alt44, NIL, $list_alt92);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING, RANGE_TUPLE_LENGTH, CYBLACK_FUNCTION_MAP_POSTING_RANGE_TUPLE_LENGTH_METHOD);
        methods.methods_incorporate_instance_method(GET_VALUE, CYBLACK_FUNCTION_MAP_POSTING, $list_alt44, $list_alt56, $list_alt96);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING, GET_VALUE, CYBLACK_FUNCTION_MAP_POSTING_GET_VALUE_METHOD);
        methods.methods_incorporate_instance_method(SET_VALUE, CYBLACK_FUNCTION_MAP_POSTING, $list_alt44, $list_alt62, $list_alt101);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING, SET_VALUE, CYBLACK_FUNCTION_MAP_POSTING_SET_VALUE_METHOD);
        methods.methods_incorporate_instance_method(GET_VALUES, CYBLACK_FUNCTION_MAP_POSTING, $list_alt44, $list_alt106, $list_alt107);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING, GET_VALUES, CYBLACK_FUNCTION_MAP_POSTING_GET_VALUES_METHOD);
        methods.methods_incorporate_instance_method(SET_VALUES, CYBLACK_FUNCTION_MAP_POSTING, $list_alt44, $list_alt111, $list_alt112);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING, SET_VALUES, CYBLACK_FUNCTION_MAP_POSTING_SET_VALUES_METHOD);
        classes.subloop_new_class(CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, CYBLACK_BASIC_POSTING_VISITOR, NIL, NIL, $list_alt117);
        classes.class_set_implements_slot_listeners(CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, $sym119$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_POSTING_VISIT);
        classes.subloop_note_instance_initialization_function(CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, $sym121$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_POSTING_VISIT);
        subloop_reserved_initialize_cyblack_function_object_posting_visitor_class(CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, $list_alt38, NIL, $list_alt122);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, INITIALIZE, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, $list_alt44, $list_alt126, $list_alt127);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, SET_INITIAL_STATE, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, $list_alt44, $list_alt131, $list_alt132);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, VISIT, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_VISIT_METHOD);
        methods.methods_incorporate_instance_method(GET_FINAL_STATE, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, $list_alt44, NIL, $list_alt137);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, GET_FINAL_STATE, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_GET_FINAL_STATE_METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION, $list_alt140);
        classes.subloop_new_class(CYBLACK_FUNCTION_MAP_POSTING_VISITOR, CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR, NIL, NIL, $list_alt149);
        classes.class_set_implements_slot_listeners(CYBLACK_FUNCTION_MAP_POSTING_VISITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_FUNCTION_MAP_POSTING_VISITOR, $sym151$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_);
        classes.subloop_note_instance_initialization_function(CYBLACK_FUNCTION_MAP_POSTING_VISITOR, $sym152$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_);
        subloop_reserved_initialize_cyblack_function_map_posting_visitor_class(CYBLACK_FUNCTION_MAP_POSTING_VISITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_FUNCTION_MAP_POSTING_VISITOR, $list_alt38, NIL, $list_alt153);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING_VISITOR, INITIALIZE, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_OPERATION_TYPE, CYBLACK_FUNCTION_MAP_POSTING_VISITOR, $list_alt44, NIL, $list_alt158);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING_VISITOR, GET_OPERATION_TYPE, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_GET_OPERATION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_OPERATION_TYPE, CYBLACK_FUNCTION_MAP_POSTING_VISITOR, $list_alt44, $list_alt162, $list_alt163);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING_VISITOR, SET_OPERATION_TYPE, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_SET_OPERATION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, CYBLACK_FUNCTION_MAP_POSTING_VISITOR, $list_alt44, $list_alt167, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING_VISITOR, SET_INITIAL_STATE, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_FUNCTION_MAP_POSTING_VISITOR, $list_alt44, $list_alt131, $list_alt171);
        methods.subloop_register_instance_method(CYBLACK_FUNCTION_MAP_POSTING_VISITOR, VISIT, CYBLACK_FUNCTION_MAP_POSTING_VISITOR_VISIT_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING");



    static private final SubLList $list_alt2 = list(new SubLObject[]{ list(makeSymbol("SYMBOLIC-FUNCTION-NAME"), makeKeyword("CLASS"), makeKeyword("PUBLIC")), list(makeSymbol("DOMAIN-TUPLE"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DOMAIN-TUPLE-LENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ARG"), list(makeSymbol("N")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ARG"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ARGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ARGS"), list(makeSymbol("NEW-ARGS")), makeKeyword("PUBLIC")) });





    private static final SubLSymbol SYMBOLIC_FUNCTION_NAME = makeSymbol("SYMBOLIC-FUNCTION-NAME");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-POSTING-CLASS");



























    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");































    static private final SubLSymbol $sym36$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_POSTING_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-POSTING-INSTANCE");



    static private final SubLList $list_alt38 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt39 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("PUNLESS"), makeSymbol("SYMBOLIC-FUNCTION-NAME"), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-FUNCTION-NAME"), list(QUOTE, makeSymbol("GENERIC-FUNCTION")))), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN-TUPLE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym40$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-OBJECT-POSTING-METHOD");

    private static final SubLSymbol GENERIC_FUNCTION = makeSymbol("GENERIC-FUNCTION");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-INITIALIZE-METHOD");



    static private final SubLList $list_alt44 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt45 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt46 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), makeSymbol("DOMAIN-TUPLE"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S~S"), makeSymbol("SYMBOLIC-FUNCTION-NAME"), makeSymbol("DOMAIN-TUPLE")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S()"), makeSymbol("SYMBOLIC-FUNCTION-NAME"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym47$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-OBJECT-POSTING-METHOD");

    static private final SubLString $str_alt48$_S_S = makeString("~S~S");

    static private final SubLString $str_alt49$_S__ = makeString("~S()");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_PRINT_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-PRINT-METHOD");

    private static final SubLSymbol DOMAIN_TUPLE_LENGTH = makeSymbol("DOMAIN-TUPLE-LENGTH");

    static private final SubLList $list_alt52 = list(list(RET, list(makeSymbol("LENGTH"), makeSymbol("DOMAIN-TUPLE"))));

    static private final SubLSymbol $sym53$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-OBJECT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_DOMAIN_TUPLE_LENGTH_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-DOMAIN-TUPLE-LENGTH-METHOD");



    static private final SubLList $list_alt56 = list(makeSymbol("N"));

    static private final SubLList $list_alt57 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("N")), list(makeSymbol(">="), makeSymbol("N"), ZERO_INTEGER), list(makeSymbol("<"), makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("DOMAIN-TUPLE")))), makeString("(GET-ARG ~S): Invalid index ~S.  Index must be an integer in the interval [0 ~S)."), makeSymbol("SELF"), makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("DOMAIN-TUPLE"))), list(RET, list(makeSymbol("NTH"), makeSymbol("N"), makeSymbol("DOMAIN-TUPLE"))));

    static private final SubLSymbol $sym58$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-OBJECT-POSTING-METHOD");

    static private final SubLString $str_alt59$_GET_ARG__S___Invalid_index__S___ = makeString("(GET-ARG ~S): Invalid index ~S.  Index must be an integer in the interval [0 ~S).");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_GET_ARG_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-GET-ARG-METHOD");

    private static final SubLSymbol SET_ARG = makeSymbol("SET-ARG");

    static private final SubLList $list_alt62 = list(makeSymbol("N"), makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt63 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("N")), list(makeSymbol(">="), makeSymbol("N"), ZERO_INTEGER), list(makeSymbol("<"), makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("DOMAIN-TUPLE")))), makeString("(SET-ARG ~S): Invalid index ~S.  Index must be an integer in the interval [0 ~S)."), makeSymbol("SELF"), makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("DOMAIN-TUPLE"))), list(makeSymbol("SET-NTH"), makeSymbol("N"), makeSymbol("DOMAIN-TUPLE"), makeSymbol("NEW-VALUE")), list(RET, makeSymbol("NEW-VALUE")));

    static private final SubLSymbol $sym64$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-OBJECT-POSTING-METHOD");

    static private final SubLString $str_alt65$_SET_ARG__S___Invalid_index__S___ = makeString("(SET-ARG ~S): Invalid index ~S.  Index must be an integer in the interval [0 ~S).");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_SET_ARG_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-SET-ARG-METHOD");



    static private final SubLList $list_alt68 = list(list(RET, list(makeSymbol("COPY-LIST"), makeSymbol("DOMAIN-TUPLE"))));

    static private final SubLSymbol $sym69$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-OBJECT-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_GET_ARGS_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-GET-ARGS-METHOD");



    static private final SubLList $list_alt72 = list(makeSymbol("NEW-ARGS"));

    static private final SubLList $list_alt73 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-ARGS")), makeString("(SET-ARGS ~S): ~S is not a valid tuple.  A list was expected."), makeSymbol("SELF"), makeSymbol("NEW-ARGS")), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN-TUPLE"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-ARGS"))), list(RET, makeSymbol("NEW-ARGS")));

    static private final SubLSymbol $sym74$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-OBJECT-POSTING-METHOD");

    static private final SubLString $str_alt75$_SET_ARGS__S____S_is_not_a_valid_ = makeString("(SET-ARGS ~S): ~S is not a valid tuple.  A list was expected.");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_SET_ARGS_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-SET-ARGS-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING");

    static private final SubLList $list_alt78 = list(list(makeSymbol("RANGE-TUPLE"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RANGE-TUPLE-LENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VALUE"), list(makeSymbol("N")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VALUE"), list(makeSymbol("N"), makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VALUES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VALUES"), list(makeSymbol("NEW-VALUES")), makeKeyword("PUBLIC")));

    public static final SubLInteger $int$21 = makeInteger(21);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-POSTING-CLASS");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-POSTING-INSTANCE");

    static private final SubLList $list_alt83 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("RANGE-TUPLE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym84$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-INITIALIZE-METHOD");

    static private final SubLList $list_alt86 = list(list(makeSymbol("PRINT"), makeSymbol("SUPER"), makeSymbol("STREAM"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), makeSymbol("RANGE-TUPLE"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("=~S"), makeSymbol("RANGE-TUPLE")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("=()"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym87$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-METHOD");

    static private final SubLString $str_alt88$__S = makeString("=~S");

    static private final SubLString $str_alt89$___ = makeString("=()");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_PRINT_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-PRINT-METHOD");

    private static final SubLSymbol RANGE_TUPLE_LENGTH = makeSymbol("RANGE-TUPLE-LENGTH");

    static private final SubLList $list_alt92 = list(list(RET, list(makeSymbol("LENGTH"), makeSymbol("RANGE-TUPLE"))));

    static private final SubLSymbol $sym93$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_RANGE_TUPLE_LENGTH_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-RANGE-TUPLE-LENGTH-METHOD");



    static private final SubLList $list_alt96 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("N")), list(makeSymbol(">="), makeSymbol("N"), ZERO_INTEGER), list(makeSymbol("<"), makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("RANGE-TUPLE")))), makeString("(GET-VALUE ~S): Invalid index ~S.  Index must be an integer in the interval [0 ~S)."), makeSymbol("SELF"), makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("RANGE-TUPLE"))), list(RET, list(makeSymbol("NTH"), makeSymbol("N"), makeSymbol("RANGE-TUPLE"))));

    static private final SubLSymbol $sym97$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-METHOD");

    static private final SubLString $str_alt98$_GET_VALUE__S___Invalid_index__S_ = makeString("(GET-VALUE ~S): Invalid index ~S.  Index must be an integer in the interval [0 ~S).");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_GET_VALUE_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-GET-VALUE-METHOD");



    static private final SubLList $list_alt101 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("N")), list(makeSymbol(">="), makeSymbol("N"), ZERO_INTEGER), list(makeSymbol("<"), makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("RANGE-TUPLE")))), makeString("(SET-VALUE ~S): Invalid index ~S.  Index must be an integer in the interval [0 ~S)."), makeSymbol("SELF"), makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("RANGE-TUPLE"))), list(makeSymbol("SET-NTH"), makeSymbol("N"), makeSymbol("RANGE-TUPLE"), makeSymbol("NEW-VALUE")), list(RET, makeSymbol("NEW-VALUE")));

    static private final SubLSymbol $sym102$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-METHOD");

    static private final SubLString $str_alt103$_SET_VALUE__S___Invalid_index__S_ = makeString("(SET-VALUE ~S): Invalid index ~S.  Index must be an integer in the interval [0 ~S).");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_SET_VALUE_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-SET-VALUE-METHOD");



    static private final SubLList $list_alt106 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("COPY"), T));

    static private final SubLList $list_alt107 = list(list(RET, list(makeSymbol("FIF"), makeSymbol("COPY"), list(makeSymbol("COPY-LIST"), makeSymbol("RANGE-TUPLE")), makeSymbol("RANGE-TUPLE"))));

    static private final SubLSymbol $sym108$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_GET_VALUES_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-GET-VALUES-METHOD");

    private static final SubLSymbol SET_VALUES = makeSymbol("SET-VALUES");

    static private final SubLList $list_alt111 = list(makeSymbol("NEW-VALUES"));

    static private final SubLList $list_alt112 = list(list(makeSymbol("CSETQ"), makeSymbol("RANGE-TUPLE"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-VALUES"))), list(RET, makeSymbol("NEW-VALUES")));

    static private final SubLSymbol $sym113$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_SET_VALUES_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-SET-VALUES-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_VISITOR = makeSymbol("CYBLACK-BASIC-POSTING-VISITOR");

    static private final SubLList $list_alt117 = list(list(makeSymbol("DOMAIN-TUPLE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("POSTINGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE"))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym119$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_POSTING_VISIT = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-CLASS");



    static private final SubLSymbol $sym121$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_OBJECT_POSTING_VISIT = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-INSTANCE");

    static private final SubLList $list_alt122 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN-TUPLE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), NIL));

    static private final SubLSymbol $sym123$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-INITIALIZE-METHOD");



    static private final SubLList $list_alt126 = list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE")));

    static private final SubLList $list_alt127 = list(list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("DOMAIN-TUPLE"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-STATE"))), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), NIL), list(RET, makeSymbol("NEW-STATE")));

    static private final SubLSymbol $sym128$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_SET_INITIAL_STATE_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-SET-INITIAL-STATE-METHOD");



    static private final SubLList $list_alt131 = list(makeSymbol("CYBLACK-POSTING"));

    static private final SubLList $list_alt132 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-OF-P"), makeSymbol("CYBLACK-POSTING"), list(QUOTE, makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING"))), makeString("(VISIT ~S): ~S is not an instance of CYBLACK-FUNCTION-OBJECT-POSTING."), makeSymbol("SELF"), makeSymbol("CYBLACK-POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING-DOMAIN-TUPLE"), list(makeSymbol("GET-CYBLACK-FUNCTION-OBJECT-POSTING-DOMAIN-TUPLE"), makeSymbol("CYBLACK-POSTING")))), list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("DOMAIN-TUPLE"), makeSymbol("POSTING-DOMAIN-TUPLE")), list(makeSymbol("CPUSH"), makeSymbol("CYBLACK-POSTING"), makeSymbol("POSTINGS")))), list(RET, makeSymbol("CYBLACK-POSTING")));

    static private final SubLSymbol $sym133$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-METHOD");

    static private final SubLString $str_alt134$_VISIT__S____S_is_not_an_instance = makeString("(VISIT ~S): ~S is not an instance of CYBLACK-FUNCTION-OBJECT-POSTING.");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_VISIT_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-VISIT-METHOD");



    static private final SubLList $list_alt137 = list(list(RET, list(makeSymbol("REVERSE"), makeSymbol("POSTINGS"))));

    static private final SubLSymbol $sym138$OUTER_CATCH_FOR_CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_OBJECT_POSTING_VISITOR_GET_FINAL_STATE_METHOD = makeSymbol("CYBLACK-FUNCTION-OBJECT-POSTING-VISITOR-GET-FINAL-STATE-METHOD");

    static private final SubLList $list_alt140 = list(makeKeyword("MATCH-DOMAIN"), makeKeyword("MATCH-RANGE"), makeKeyword("MATCH-MAP"));

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION");

    static private final SubLString $str_alt142$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION = makeSymbol("ENCODE-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION");

    static private final SubLString $str_alt144$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION = makeSymbol("DECODE-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION");

    static private final SubLString $str_alt146$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_VISITOR_OPERATION_P = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION-P");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_VISITOR = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-VISITOR");

    static private final SubLList $list_alt149 = list(list(makeSymbol("OPERATION-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RANGE-TUPLE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OPERATION-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-OPERATION-TYPE"), list(makeSymbol("NEW-OPERATION-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-DOMAIN"), NIL), list(makeSymbol("NEW-RANGE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-POSTING")), makeKeyword("PUBLIC")));

    private static final SubLSymbol OPERATION_TYPE = makeSymbol("OPERATION-TYPE");

    static private final SubLSymbol $sym151$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-CLASS");

    static private final SubLSymbol $sym152$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-INSTANCE");

    static private final SubLList $list_alt153 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("OPERATION-TYPE"), makeKeyword("MATCH-MAP")), list(makeSymbol("CSETQ"), makeSymbol("RANGE-TUPLE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym154$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-METHOD");

    private static final SubLSymbol $MATCH_MAP = makeKeyword("MATCH-MAP");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_VISITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-VISITOR-INITIALIZE-METHOD");

    private static final SubLSymbol GET_OPERATION_TYPE = makeSymbol("GET-OPERATION-TYPE");

    static private final SubLList $list_alt158 = list(list(RET, makeSymbol("OPERATION-TYPE")));

    static private final SubLSymbol $sym159$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_VISITOR_GET_OPERATION_TYPE_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-VISITOR-GET-OPERATION-TYPE-METHOD");

    private static final SubLSymbol SET_OPERATION_TYPE = makeSymbol("SET-OPERATION-TYPE");

    static private final SubLList $list_alt162 = list(makeSymbol("NEW-OPERATION-TYPE"));

    static private final SubLList $list_alt163 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION-P"), makeSymbol("NEW-OPERATION-TYPE")), makeString("(SET-OPERATION-TYPE ~S): ~S is not a member of ~\n     the CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION enumeration."), makeSymbol("SELF"), makeSymbol("NEW-OPERATION-TYPE")), list(makeSymbol("CSETQ"), makeSymbol("OPERATION-TYPE"), makeSymbol("NEW-OPERATION-TYPE")), list(RET, makeSymbol("NEW-OPERATION-TYPE")));

    static private final SubLSymbol $sym164$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-METHOD");

    static private final SubLString $str_alt165$_SET_OPERATION_TYPE__S____S_is_no = makeString("(SET-OPERATION-TYPE ~S): ~S is not a member of ~\n     the CYBLACK-FUNCTION-MAP-POSTING-VISITOR-OPERATION enumeration.");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_VISITOR_SET_OPERATION_TYPE_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-VISITOR-SET-OPERATION-TYPE-METHOD");

    static private final SubLList $list_alt167 = list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-DOMAIN"), NIL), list(makeSymbol("NEW-RANGE"), NIL));

    static private final SubLList $list_alt168 = list(list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION"), makeSymbol("NEW-DOMAIN")), list(makeSymbol("CSETQ"), makeSymbol("RANGE-TUPLE"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-RANGE"))), list(RET, makeSymbol("NEW-RANGE")));

    static private final SubLSymbol $sym169$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_VISITOR_SET_INITIAL_STATE_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-VISITOR-SET-INITIAL-STATE-METHOD");

    static private final SubLList $list_alt171 = list(list(makeSymbol("MUST"), list(makeSymbol("INSTANCE-OF-P"), makeSymbol("CYBLACK-POSTING"), list(QUOTE, makeSymbol("CYBLACK-FUNCTION-MAP-POSTING"))), makeString("(VISIT ~S): ~S is not an instance of CYBLACK-FUNCTION-MAP-POSTING."), makeSymbol("SELF"), makeSymbol("CYBLACK-POSTING")), list(makeSymbol("PCASE"), makeSymbol("OPERATION-TYPE"), list(makeKeyword("MATCH-DOMAIN"), list(RET, list(makeSymbol("VISIT"), makeSymbol("SUPER"), makeSymbol("CYBLACK-POSTING")))), list(makeKeyword("MATCH-RANGE"), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING-RANGE-TUPLE"), list(makeSymbol("GET-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-RANGE-TUPLE"), makeSymbol("CYBLACK-POSTING")))), list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("RANGE-TUPLE"), makeSymbol("POSTING-RANGE-TUPLE")), list(makeSymbol("CPUSH"), makeSymbol("CYBLACK-POSTING"), makeSymbol("POSTINGS"))))), list(makeKeyword("MATCH-MAP"), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING-DOMAIN-TUPLE"), list(makeSymbol("GET-CYBLACK-FUNCTION-OBJECT-POSTING-DOMAIN-TUPLE"), makeSymbol("CYBLACK-POSTING"))), list(makeSymbol("POSTING-RANGE-TUPLE"), list(makeSymbol("GET-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-RANGE-TUPLE"), makeSymbol("CYBLACK-POSTING")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(EQUAL, makeSymbol("DOMAIN-TUPLE"), makeSymbol("POSTING-DOMAIN-TUPLE")), list(EQUAL, makeSymbol("RANGE-TUPLE"), makeSymbol("POSTING-RANGE-TUPLE"))), list(makeSymbol("CPUSH"), makeSymbol("CYBLACK-POSTING"), makeSymbol("POSTINGS")))))), list(RET, makeSymbol("CYBLACK-POSTING")));

    static private final SubLSymbol $sym172$OUTER_CATCH_FOR_CYBLACK_FUNCTION_MAP_POSTING_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-FUNCTION-MAP-POSTING-VISITOR-METHOD");

    static private final SubLString $str_alt173$_VISIT__S____S_is_not_an_instance = makeString("(VISIT ~S): ~S is not an instance of CYBLACK-FUNCTION-MAP-POSTING.");

    private static final SubLSymbol $MATCH_DOMAIN = makeKeyword("MATCH-DOMAIN");

    private static final SubLSymbol $MATCH_RANGE = makeKeyword("MATCH-RANGE");

    private static final SubLSymbol CYBLACK_FUNCTION_MAP_POSTING_VISITOR_VISIT_METHOD = makeSymbol("CYBLACK-FUNCTION-MAP-POSTING-VISITOR-VISIT-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_function_object_posting_file();
    }

    public void initializeVariables() {
        init_cyblack_function_object_posting_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_function_object_posting_file();
    }
}

