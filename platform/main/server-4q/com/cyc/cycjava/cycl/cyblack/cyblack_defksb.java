/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.subl_promotions;
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
 *  module:      CYBLACK-DEFKSB
 *  source file: /cyc/top/cycl/cyblack/cyblack-defksb.lisp
 *  created:     2019/07/03 17:38:50
 */
public final class cyblack_defksb extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_defksb() {
    }

    public static final SubLFile me = new cyblack_defksb();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_defksb";

    // // Definitions
    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_base_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_base_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, KSB_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, INTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, KNOWLEDGE_SOURCES_WAITING_FOR_APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, EKSC_TO_PORT_ID_MAP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, STORED_INTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, STORED_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defksb_base_p(SubLObject cyblack_defksb_base) {
        return classes.subloop_instanceof_class(cyblack_defksb_base, CYBLACK_DEFKSB_BASE);
    }

    public static final SubLObject cyblack_defksb_base_on_startup_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defksb_base_method = NIL;
                SubLObject external_knowledge_source_classes = cyblack_ksb.get_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes(self);
                SubLObject internal_knowledge_source_classes = cyblack_ksb.get_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == application) {
                                Errors.error($str_alt27$_ON_STARTUP__S___No_application_i, self);
                            }
                        }
                        {
                            SubLObject ks = NIL;
                            SubLObject port_id = NIL;
                            {
                                SubLObject cdolist_list_var = reverse(internal_knowledge_source_classes);
                                SubLObject ks_class = NIL;
                                for (ks_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks_class = cdolist_list_var.first()) {
                                    ks = object.new_object_instance(ks_class);
                                    methods.funcall_instance_method_with_1_args(ks, SET_APPLICATION, application);
                                    cyblack_ksb.cyblack_basic_knowledge_source_battery_register_knowledge_source_method(self, ks);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = reverse(external_knowledge_source_classes);
                                SubLObject ks_class = NIL;
                                for (ks_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ks_class = cdolist_list_var.first()) {
                                    ks = object.new_object_instance(ks_class);
                                    port_id = cyblack_ksb.cyblack_basic_knowledge_source_battery_port_id_given_eksc_method(self, ks_class);
                                    cyblack_ks.cyblack_external_knowledge_source_set_port_id_method(ks, port_id);
                                    methods.funcall_instance_method_with_1_args(ks, SET_APPLICATION, application);
                                    cyblack_ksb.cyblack_basic_knowledge_source_battery_register_knowledge_source_method(self, ks);
                                }
                            }
                        }
                        cyblack_ksb.cyblack_basic_knowledge_source_battery_on_startup_method(self);
                        cyblack_ksb.cyblack_basic_knowledge_source_battery_link_knowledge_sources_to_panels_method(self);
                        sublisp_throw($sym26$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BASE_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                cyblack_ksb.set_cyblack_basic_knowledge_source_battery_external_knowledge_source_classes(self, external_knowledge_source_classes);
                                cyblack_ksb.set_cyblack_basic_knowledge_source_battery_internal_knowledge_source_classes(self, internal_knowledge_source_classes);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defksb_base_method = Errors.handleThrowable(ccatch_env_var, $sym26$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BASE_METHOD);
                }
                return catch_var_for_cyblack_defksb_base_method;
            }
        }
    }

    public static final SubLObject get_cyblack_defksb_expression_children(SubLObject cyblack_defksb_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_expression, TWO_INTEGER, CHILDREN);
    }

    public static final SubLObject set_cyblack_defksb_expression_children(SubLObject cyblack_defksb_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_expression, value, TWO_INTEGER, CHILDREN);
    }

    public static final SubLObject get_cyblack_defksb_expression_parent(SubLObject cyblack_defksb_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_expression, ONE_INTEGER, PARENT);
    }

    public static final SubLObject set_cyblack_defksb_expression_parent(SubLObject cyblack_defksb_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_expression, value, ONE_INTEGER, PARENT);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, CHILDREN, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defksb_expression_p(SubLObject cyblack_defksb_expression) {
        return classes.subloop_instanceof_class(cyblack_defksb_expression, CYBLACK_DEFKSB_EXPRESSION);
    }

    public static final SubLObject cyblack_defksb_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_expression_method = NIL;
            SubLObject children = get_cyblack_defksb_expression_children(self);
            SubLObject parent = get_cyblack_defksb_expression_parent(self);
            try {
                try {
                    object.object_initialize_method(self);
                    parent = NIL;
                    children = NIL;
                    sublisp_throw($sym39$OUTER_CATCH_FOR_CYBLACK_DEFKSB_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_expression_children(self, children);
                            set_cyblack_defksb_expression_parent(self, parent);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_expression_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_CYBLACK_DEFKSB_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defksb_expression_method;
        }
    }

    public static final SubLObject cyblack_defksb_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject cdolist_list_var = cyblack_defksb_expression_get_children_method(self);
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                print(child, stream);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_defksb_expression_get_parent_method(SubLObject self) {
        {
            SubLObject parent = get_cyblack_defksb_expression_parent(self);
            return parent;
        }
    }

    public static final SubLObject cyblack_defksb_expression_set_parent_method(SubLObject self, SubLObject new_parent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defksb_expression_method = NIL;
                SubLObject parent = get_cyblack_defksb_expression_parent(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_parent) || (NIL != cyblack_defksb_expression_p(new_parent)))) {
                                Errors.error($str_alt53$_SET_PARENT__S____S_is_not_an_ins, self, new_parent);
                            }
                        }
                        parent = new_parent;
                        if (NIL != parent) {
                            cyblack_defksb_expression_add_child_method(parent, self);
                        }
                        sublisp_throw($sym52$OUTER_CATCH_FOR_CYBLACK_DEFKSB_EXPRESSION_METHOD, parent);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defksb_expression_parent(self, parent);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defksb_expression_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_CYBLACK_DEFKSB_EXPRESSION_METHOD);
                }
                return catch_var_for_cyblack_defksb_expression_method;
            }
        }
    }

    public static final SubLObject cyblack_defksb_expression_add_child_method(SubLObject self, SubLObject new_child) {
        {
            SubLObject children = get_cyblack_defksb_expression_children(self);
            if (NIL == subl_promotions.memberP(new_child, children, UNPROVIDED, UNPROVIDED)) {
                children = nconc(children, list(new_child));
                set_cyblack_defksb_expression_children(self, children);
            }
            return new_child;
        }
    }

    public static final SubLObject cyblack_defksb_expression_get_children_method(SubLObject self) {
        {
            SubLObject children = get_cyblack_defksb_expression_children(self);
            return children;
        }
    }

    public static final SubLObject get_cyblack_defksb_body_on_shutdown_body(SubLObject cyblack_defksb_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_body, SIX_INTEGER, ON_SHUTDOWN_BODY);
    }

    public static final SubLObject set_cyblack_defksb_body_on_shutdown_body(SubLObject cyblack_defksb_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_body, value, SIX_INTEGER, ON_SHUTDOWN_BODY);
    }

    public static final SubLObject get_cyblack_defksb_body_on_startup_body(SubLObject cyblack_defksb_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_body, FIVE_INTEGER, ON_STARTUP_BODY);
    }

    public static final SubLObject set_cyblack_defksb_body_on_startup_body(SubLObject cyblack_defksb_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_body, value, FIVE_INTEGER, ON_STARTUP_BODY);
    }

    public static final SubLObject get_cyblack_defksb_body_external_knowledge_source_expressions(SubLObject cyblack_defksb_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_body, FOUR_INTEGER, EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS);
    }

    public static final SubLObject set_cyblack_defksb_body_external_knowledge_source_expressions(SubLObject cyblack_defksb_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_body, value, FOUR_INTEGER, EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS);
    }

    public static final SubLObject get_cyblack_defksb_body_internal_knowledge_source_expressions(SubLObject cyblack_defksb_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_body, THREE_INTEGER, INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS);
    }

    public static final SubLObject set_cyblack_defksb_body_internal_knowledge_source_expressions(SubLObject cyblack_defksb_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_body, value, THREE_INTEGER, INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_body_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_body_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_BODY, INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_BODY, EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_BODY, ON_STARTUP_BODY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_BODY, ON_SHUTDOWN_BODY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defksb_body_p(SubLObject cyblack_defksb_body) {
        return classes.subloop_instanceof_class(cyblack_defksb_body, CYBLACK_DEFKSB_BODY);
    }

    public static final SubLObject cyblack_defksb_body_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
            SubLObject external_knowledge_source_expressions = get_cyblack_defksb_body_external_knowledge_source_expressions(self);
            SubLObject internal_knowledge_source_expressions = get_cyblack_defksb_body_internal_knowledge_source_expressions(self);
            try {
                try {
                    cyblack_defksb_expression_initialize_method(self);
                    internal_knowledge_source_expressions = NIL;
                    external_knowledge_source_expressions = NIL;
                    sublisp_throw($sym71$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_body_external_knowledge_source_expressions(self, external_knowledge_source_expressions);
                            set_cyblack_defksb_body_internal_knowledge_source_expressions(self, internal_knowledge_source_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym71$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defksb_body_method;
        }
    }

    public static final SubLObject cyblack_defksb_body_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
            SubLObject on_shutdown_body = get_cyblack_defksb_body_on_shutdown_body(self);
            SubLObject on_startup_body = get_cyblack_defksb_body_on_startup_body(self);
            SubLObject external_knowledge_source_expressions = get_cyblack_defksb_body_external_knowledge_source_expressions(self);
            SubLObject internal_knowledge_source_expressions = get_cyblack_defksb_body_internal_knowledge_source_expressions(self);
            try {
                try {
                    {
                        SubLObject first_output = T;
                        if (NIL != internal_knowledge_source_expressions) {
                            format(stream, $str_alt75$__INTERNAL_KNOWLEDGE_SOURCES);
                            {
                                SubLObject cdolist_list_var = internal_knowledge_source_expressions;
                                SubLObject internal_ks = NIL;
                                for (internal_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , internal_ks = cdolist_list_var.first()) {
                                    format(stream, $str_alt76$__S, internal_ks);
                                }
                            }
                            format(stream, $str_alt77$_);
                            first_output = NIL;
                        }
                        if (NIL != external_knowledge_source_expressions) {
                            if (NIL == first_output) {
                                format(stream, $str_alt78$_);
                            }
                            format(stream, $str_alt79$__EXTERNAL_KNOWLEDGE_SOURCES);
                            {
                                SubLObject cdolist_list_var = external_knowledge_source_expressions;
                                SubLObject external_ks = NIL;
                                for (external_ks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , external_ks = cdolist_list_var.first()) {
                                    format(stream, $str_alt76$__S, external_ks);
                                }
                            }
                            format(stream, $str_alt77$_);
                            first_output = NIL;
                        }
                        if (NIL != on_startup_body) {
                            if (NIL == first_output) {
                                format(stream, $str_alt78$_);
                            }
                            format(stream, $str_alt80$__ON_STARTUP);
                            {
                                SubLObject cdolist_list_var = on_startup_body;
                                SubLObject expression = NIL;
                                for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                                    format(stream, $str_alt76$__S, expression);
                                }
                            }
                            format(stream, $str_alt77$_);
                            first_output = NIL;
                        }
                        if (NIL != on_shutdown_body) {
                            if (NIL == first_output) {
                                format(stream, $str_alt78$_);
                            }
                            format(stream, $str_alt81$__ON_SHUTDOWN);
                            {
                                SubLObject cdolist_list_var = on_shutdown_body;
                                SubLObject expression = NIL;
                                for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                                    format(stream, $str_alt76$__S, expression);
                                }
                            }
                            format(stream, $str_alt77$_);
                        }
                        first_output = NIL;
                        sublisp_throw($sym74$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, self);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_body_on_shutdown_body(self, on_shutdown_body);
                            set_cyblack_defksb_body_on_startup_body(self, on_startup_body);
                            set_cyblack_defksb_body_external_knowledge_source_expressions(self, external_knowledge_source_expressions);
                            set_cyblack_defksb_body_internal_knowledge_source_expressions(self, internal_knowledge_source_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defksb_body_method;
        }
    }

    public static final SubLObject cyblack_defksb_body_get_internal_knowledge_source_expressions_method(SubLObject self) {
        {
            SubLObject internal_knowledge_source_expressions = get_cyblack_defksb_body_internal_knowledge_source_expressions(self);
            return internal_knowledge_source_expressions;
        }
    }

    public static final SubLObject cyblack_defksb_body_set_internal_knowledge_source_expressions_method(SubLObject self, SubLObject new_expressions) {
        {
            SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
            SubLObject internal_knowledge_source_expressions = get_cyblack_defksb_body_internal_knowledge_source_expressions(self);
            try {
                try {
                    internal_knowledge_source_expressions = copy_tree(new_expressions);
                    sublisp_throw($sym89$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, new_expressions);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_body_internal_knowledge_source_expressions(self, internal_knowledge_source_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym89$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defksb_body_method;
        }
    }

    public static final SubLObject cyblack_defksb_body_get_external_knowledge_source_expressions_method(SubLObject self) {
        {
            SubLObject external_knowledge_source_expressions = get_cyblack_defksb_body_external_knowledge_source_expressions(self);
            return external_knowledge_source_expressions;
        }
    }

    public static final SubLObject cyblack_defksb_body_set_external_knowledge_source_expressions_method(SubLObject self, SubLObject new_expressions) {
        {
            SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
            SubLObject external_knowledge_source_expressions = get_cyblack_defksb_body_external_knowledge_source_expressions(self);
            try {
                try {
                    external_knowledge_source_expressions = copy_tree(new_expressions);
                    sublisp_throw($sym96$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, new_expressions);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_body_external_knowledge_source_expressions(self, external_knowledge_source_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym96$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defksb_body_method;
        }
    }

    public static final SubLObject cyblack_defksb_body_get_on_startup_body_method(SubLObject self) {
        {
            SubLObject on_startup_body = get_cyblack_defksb_body_on_startup_body(self);
            return on_startup_body;
        }
    }

    public static final SubLObject cyblack_defksb_body_set_on_startup_body_method(SubLObject self, SubLObject implicit_progn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
                SubLObject on_startup_body = get_cyblack_defksb_body_on_startup_body(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!implicit_progn.isList()) {
                                Errors.error($str_alt105$_SET_ON_STARTUP_BODY__S____S_is_n, self, implicit_progn);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = implicit_progn;
                            SubLObject expression = NIL;
                            for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (!(((expression.isSymbol() || expression.isNumber()) || expression.isString()) || (expression.isCons() && expression.first().isSymbol()))) {
                                        Errors.error($str_alt106$_SET_ON_STARTUP_BODY__S____S_is_n, self, expression);
                                    }
                                }
                            }
                        }
                        on_startup_body = copy_tree(implicit_progn);
                        sublisp_throw($sym104$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, implicit_progn);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defksb_body_on_startup_body(self, on_startup_body);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym104$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
                }
                return catch_var_for_cyblack_defksb_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defksb_body_get_on_shutdown_body_method(SubLObject self) {
        {
            SubLObject on_shutdown_body = get_cyblack_defksb_body_on_shutdown_body(self);
            return on_shutdown_body;
        }
    }

    public static final SubLObject cyblack_defksb_body_set_on_shutdown_body_method(SubLObject self, SubLObject implicit_progn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
                SubLObject on_shutdown_body = get_cyblack_defksb_body_on_shutdown_body(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!implicit_progn.isList()) {
                                Errors.error($str_alt114$_SET_ON_SHUTDOWN_BODY__S____S_is_, self, implicit_progn);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = implicit_progn;
                            SubLObject expression = NIL;
                            for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (!(((expression.isSymbol() || expression.isNumber()) || expression.isString()) || (expression.isCons() && expression.first().isSymbol()))) {
                                        Errors.error($str_alt115$_SET_ON_SHUTDOWN_BODY__S____S_is_, self, expression);
                                    }
                                }
                            }
                        }
                        on_shutdown_body = copy_tree(implicit_progn);
                        sublisp_throw($sym113$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, implicit_progn);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defksb_body_on_shutdown_body(self, on_shutdown_body);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym113$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
                }
                return catch_var_for_cyblack_defksb_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defksb_body_get_internal_knowledge_source_classes_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
            SubLObject internal_knowledge_source_expressions = get_cyblack_defksb_body_internal_knowledge_source_expressions(self);
            try {
                try {
                    {
                        SubLObject v_classes = NIL;
                        SubLObject list_expression = internal_knowledge_source_expressions;
                        if (NIL == list_expression) {
                            v_classes = NIL;
                        } else
                            if (list_expression.isAtom()) {
                                v_classes = list(list_expression);
                            } else
                                if (NIL == list_expression.rest()) {
                                    {
                                        SubLObject iks_reference = list_expression.first();
                                        v_classes = methods.funcall_instance_method_with_0_args(iks_reference, GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES);
                                    }
                                } else {
                                    {
                                        SubLObject tail_cons = NIL;
                                        SubLObject result = NIL;
                                        v_classes = NIL;
                                        {
                                            SubLObject cdolist_list_var = list_expression;
                                            SubLObject iks_reference = NIL;
                                            for (iks_reference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , iks_reference = cdolist_list_var.first()) {
                                                result = methods.funcall_instance_method_with_0_args(iks_reference, GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES);
                                                if (NIL != result) {
                                                    if (NIL != tail_cons) {
                                                        rplacd(tail_cons, result);
                                                        tail_cons = last(result, UNPROVIDED);
                                                    } else {
                                                        v_classes = methods.funcall_instance_method_with_0_args(iks_reference, GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES);
                                                        tail_cons = last(v_classes, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }


                        sublisp_throw($sym119$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, v_classes);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_body_internal_knowledge_source_expressions(self, internal_knowledge_source_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym119$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defksb_body_method;
        }
    }

    public static final SubLObject cyblack_defksb_body_get_external_knowledge_source_classes_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
            SubLObject external_knowledge_source_expressions = get_cyblack_defksb_body_external_knowledge_source_expressions(self);
            try {
                try {
                    {
                        SubLObject v_classes = NIL;
                        SubLObject list_expression = external_knowledge_source_expressions;
                        if (NIL == list_expression) {
                            v_classes = NIL;
                        } else
                            if (list_expression.isAtom()) {
                                v_classes = list(list_expression);
                            } else
                                if (NIL == list_expression.rest()) {
                                    {
                                        SubLObject eks_reference = list_expression.first();
                                        v_classes = methods.funcall_instance_method_with_0_args(eks_reference, GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES);
                                    }
                                } else {
                                    {
                                        SubLObject tail_cons = NIL;
                                        SubLObject result = NIL;
                                        v_classes = NIL;
                                        {
                                            SubLObject cdolist_list_var = list_expression;
                                            SubLObject eks_reference = NIL;
                                            for (eks_reference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , eks_reference = cdolist_list_var.first()) {
                                                result = methods.funcall_instance_method_with_0_args(eks_reference, GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES);
                                                if (NIL != result) {
                                                    if (NIL != tail_cons) {
                                                        rplacd(tail_cons, result);
                                                        tail_cons = last(result, UNPROVIDED);
                                                    } else {
                                                        v_classes = methods.funcall_instance_method_with_0_args(eks_reference, GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES);
                                                        tail_cons = last(v_classes, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }


                        sublisp_throw($sym123$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, v_classes);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_body_external_knowledge_source_expressions(self, external_knowledge_source_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym123$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defksb_body_method;
        }
    }

    public static final SubLObject cyblack_defksb_body_get_knowledge_source_classes_method(SubLObject self) {
        return nconc(cyblack_defksb_body_get_internal_knowledge_source_classes_method(self), cyblack_defksb_body_get_external_knowledge_source_classes_method(self));
    }

    public static final SubLObject cyblack_defksb_body_get_port_id_given_external_knowledge_source_method(SubLObject self, SubLObject eks_class) {
        {
            SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
            SubLObject external_knowledge_source_expressions = get_cyblack_defksb_body_external_knowledge_source_expressions(self);
            try {
                try {
                    {
                        SubLObject port_id = NIL;
                        SubLObject cdolist_list_var = external_knowledge_source_expressions;
                        SubLObject eks_reference = NIL;
                        for (eks_reference = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , eks_reference = cdolist_list_var.first()) {
                            port_id = methods.funcall_instance_method_with_1_args(eks_reference, GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE, eks_class);
                            if (NIL != port_id) {
                                sublisp_throw($sym131$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, port_id);
                            }
                        }
                        sublisp_throw($sym131$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_body_external_knowledge_source_expressions(self, external_knowledge_source_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym131$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defksb_body_method;
        }
    }

    public static final SubLObject cyblack_defksb_body_get_default_application_base_class_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
            SubLObject external_knowledge_source_expressions = get_cyblack_defksb_body_external_knowledge_source_expressions(self);
            try {
                try {
                    if (NIL != external_knowledge_source_expressions) {
                        sublisp_throw($sym135$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, CYBLACK_DEFAPP_EXTERNAL_BASE);
                    } else {
                        sublisp_throw($sym135$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, CYBLACK_DEFAPP_BASE);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_body_external_knowledge_source_expressions(self, external_knowledge_source_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym135$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defksb_body_method;
        }
    }

    public static final SubLObject cyblack_defksb_body_get_internal_module_info_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
            SubLObject internal_knowledge_source_expressions = get_cyblack_defksb_body_internal_knowledge_source_expressions(self);
            try {
                try {
                    if (NIL != internal_knowledge_source_expressions) {
                        {
                            SubLObject info_list = NIL;
                            SubLObject list_expression = internal_knowledge_source_expressions;
                            if (NIL == list_expression) {
                                info_list = NIL;
                            } else
                                if (list_expression.isAtom()) {
                                    info_list = list(list_expression);
                                } else
                                    if (NIL == list_expression.rest()) {
                                        {
                                            SubLObject iks = list_expression.first();
                                            info_list = list(methods.funcall_instance_method_with_0_args(iks, GET_INFO));
                                        }
                                    } else {
                                        {
                                            SubLObject tail_cons = NIL;
                                            SubLObject result = NIL;
                                            {
                                                SubLObject iks = list_expression.first();
                                                info_list = list(methods.funcall_instance_method_with_0_args(iks, GET_INFO));
                                                tail_cons = info_list;
                                            }
                                            {
                                                SubLObject cdolist_list_var = list_expression.rest();
                                                SubLObject iks = NIL;
                                                for (iks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , iks = cdolist_list_var.first()) {
                                                    result = list(methods.funcall_instance_method_with_0_args(iks, GET_INFO));
                                                    rplacd(tail_cons, result);
                                                    tail_cons = result;
                                                }
                                            }
                                        }
                                    }


                            sublisp_throw($sym141$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, info_list);
                        }
                    }
                    sublisp_throw($sym141$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_body_internal_knowledge_source_expressions(self, internal_knowledge_source_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym141$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defksb_body_method;
        }
    }

    public static final SubLObject cyblack_defksb_body_get_external_module_info_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_body_method = NIL;
            SubLObject external_knowledge_source_expressions = get_cyblack_defksb_body_external_knowledge_source_expressions(self);
            try {
                try {
                    if (NIL != external_knowledge_source_expressions) {
                        {
                            SubLObject info_list = NIL;
                            SubLObject list_expression = external_knowledge_source_expressions;
                            if (NIL == list_expression) {
                                info_list = NIL;
                            } else
                                if (list_expression.isAtom()) {
                                    info_list = list(list_expression);
                                } else
                                    if (NIL == list_expression.rest()) {
                                        {
                                            SubLObject eks = list_expression.first();
                                            info_list = list(methods.funcall_instance_method_with_0_args(eks, GET_INFO));
                                        }
                                    } else {
                                        {
                                            SubLObject tail_cons = NIL;
                                            SubLObject result = NIL;
                                            {
                                                SubLObject eks = list_expression.first();
                                                info_list = list(methods.funcall_instance_method_with_0_args(eks, GET_INFO));
                                                tail_cons = info_list;
                                            }
                                            {
                                                SubLObject cdolist_list_var = list_expression.rest();
                                                SubLObject eks = NIL;
                                                for (eks = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , eks = cdolist_list_var.first()) {
                                                    result = list(methods.funcall_instance_method_with_0_args(eks, GET_INFO));
                                                    rplacd(tail_cons, result);
                                                    tail_cons = result;
                                                }
                                            }
                                        }
                                    }


                            sublisp_throw($sym146$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, info_list);
                        }
                    }
                    sublisp_throw($sym146$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_body_external_knowledge_source_expressions(self, external_knowledge_source_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_body_method = Errors.handleThrowable(ccatch_env_var, $sym146$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defksb_body_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_ks_reference_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_ks_reference_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, CHILDREN, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defksb_ks_reference_p(SubLObject cyblack_defksb_ks_reference) {
        return classes.subloop_instanceof_class(cyblack_defksb_ks_reference, CYBLACK_DEFKSB_KS_REFERENCE);
    }

    public static final SubLObject cyblack_defksb_ks_reference_get_internal_knowledge_source_classes_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_defksb_ks_reference_get_external_knowledge_source_classes_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_defksb_ks_reference_get_info_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_iks_reference_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_iks_reference_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, CHILDREN, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defksb_iks_reference_p(SubLObject cyblack_defksb_iks_reference) {
        return classes.subloop_instanceof_class(cyblack_defksb_iks_reference, CYBLACK_DEFKSB_IKS_REFERENCE);
    }

    public static final SubLObject cyblack_defksb_defks_ks_reference_p(SubLObject cyblack_defksb_defks_ks_reference) {
        return interfaces.subloop_instanceof_interface(cyblack_defksb_defks_ks_reference, CYBLACK_DEFKSB_DEFKS_KS_REFERENCE);
    }

    public static final SubLObject cyblack_defksb_native_ks_reference_p(SubLObject cyblack_defksb_native_ks_reference) {
        return interfaces.subloop_instanceof_interface(cyblack_defksb_native_ks_reference, CYBLACK_DEFKSB_NATIVE_KS_REFERENCE);
    }

    public static final SubLObject get_cyblack_defksb_defks_iks_reference_ks_name(SubLObject cyblack_defksb_defks_iks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_defks_iks_reference, THREE_INTEGER, KS_NAME);
    }

    public static final SubLObject set_cyblack_defksb_defks_iks_reference_ks_name(SubLObject cyblack_defksb_defks_iks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_defks_iks_reference, value, THREE_INTEGER, KS_NAME);
    }

    public static final SubLObject cyblack_defksb_defks_iks_reference_set_ks_method(SubLObject self, SubLObject new_ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != new_ks) && new_ks.isSymbol())) {
                    Errors.error($str_alt179$_SET_KS__S____S_is_not_a_valid_kn, self, new_ks);
                }
            }
            if (NIL == cyblack_defks.cyblack_get_ks_assistant(new_ks)) {
                Errors.warn($str_alt180$_SET_KS__S____S_has_not_been_defi, self, new_ks);
            }
            cyblack_defksb_defks_iks_reference_internal_set_ks_method(self, new_ks);
            return new_ks;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_defks_iks_reference_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_defks_iks_reference_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, KS_NAME, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defksb_defks_iks_reference_p(SubLObject cyblack_defksb_defks_iks_reference) {
        return classes.subloop_instanceof_class(cyblack_defksb_defks_iks_reference, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE);
    }

    public static final SubLObject cyblack_defksb_defks_iks_reference_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_defks_iks_reference_method = NIL;
            SubLObject ks_name = get_cyblack_defksb_defks_iks_reference_ks_name(self);
            try {
                try {
                    cyblack_defksb_expression_initialize_method(self);
                    ks_name = NIL;
                    sublisp_throw($sym185$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_defks_iks_reference_ks_name(self, ks_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_defks_iks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym185$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_defks_iks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_defks_iks_reference_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject ks_name = get_cyblack_defksb_defks_iks_reference_ks_name(self);
            format(stream, $str_alt189$__KS__S_, ks_name);
            return self;
        }
    }

    public static final SubLObject cyblack_defksb_defks_iks_reference_internal_set_ks_method(SubLObject self, SubLObject new_ks) {
        {
            SubLObject catch_var_for_cyblack_defksb_defks_iks_reference_method = NIL;
            SubLObject ks_name = get_cyblack_defksb_defks_iks_reference_ks_name(self);
            try {
                try {
                    ks_name = new_ks;
                    sublisp_throw($sym193$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD, new_ks);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_defks_iks_reference_ks_name(self, ks_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_defks_iks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym193$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_defks_iks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_defks_iks_reference_get_ks_method(SubLObject self) {
        {
            SubLObject ks_name = get_cyblack_defksb_defks_iks_reference_ks_name(self);
            return ks_name;
        }
    }

    public static final SubLObject cyblack_defksb_defks_iks_reference_get_internal_knowledge_source_class_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_defks_iks_reference_method = NIL;
            SubLObject ks_name = get_cyblack_defksb_defks_iks_reference_ks_name(self);
            try {
                try {
                    if (NIL != ks_name) {
                        {
                            SubLObject assistant = cyblack_defks.cyblack_get_ks_assistant(ks_name);
                            if (NIL != assistant) {
                                sublisp_throw($sym200$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD, cyblack_defks.cyblack_auto_generated_ks_assistant_get_knowledge_source_class_method(assistant));
                            }
                        }
                    }
                    sublisp_throw($sym200$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_defks_iks_reference_ks_name(self, ks_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_defks_iks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym200$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_defks_iks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_defks_iks_reference_get_internal_knowledge_source_classes_method(SubLObject self) {
        {
            SubLObject class_name = cyblack_defksb_defks_iks_reference_get_internal_knowledge_source_class_method(self);
            if (NIL != class_name) {
                return list(class_name);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_defksb_defks_iks_reference_get_info_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_defks_iks_reference_method = NIL;
            SubLObject ks_name = get_cyblack_defksb_defks_iks_reference_ks_name(self);
            try {
                try {
                    sublisp_throw($sym205$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD, list(symbol_name(ks_name), cyblack_defksb_defks_iks_reference_get_internal_knowledge_source_class_method(self)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_defks_iks_reference_ks_name(self, ks_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_defks_iks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym205$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_defks_iks_reference_method;
        }
    }

    public static final SubLObject get_cyblack_defksb_native_iks_reference_ksi_class(SubLObject cyblack_defksb_native_iks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_native_iks_reference, FIVE_INTEGER, KSI_CLASS);
    }

    public static final SubLObject set_cyblack_defksb_native_iks_reference_ksi_class(SubLObject cyblack_defksb_native_iks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_native_iks_reference, value, FIVE_INTEGER, KSI_CLASS);
    }

    public static final SubLObject get_cyblack_defksb_native_iks_reference_proposal_class(SubLObject cyblack_defksb_native_iks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_native_iks_reference, FOUR_INTEGER, PROPOSAL_CLASS);
    }

    public static final SubLObject set_cyblack_defksb_native_iks_reference_proposal_class(SubLObject cyblack_defksb_native_iks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_native_iks_reference, value, FOUR_INTEGER, PROPOSAL_CLASS);
    }

    public static final SubLObject get_cyblack_defksb_native_iks_reference_ks_class(SubLObject cyblack_defksb_native_iks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_native_iks_reference, THREE_INTEGER, KS_CLASS);
    }

    public static final SubLObject set_cyblack_defksb_native_iks_reference_ks_class(SubLObject cyblack_defksb_native_iks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_native_iks_reference, value, THREE_INTEGER, KS_CLASS);
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_set_ksi_class_method(SubLObject self, SubLObject new_ksi_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!new_ksi_class.isSymbol()) {
                    Errors.error($str_alt213$_SET_KSI_CLASS__S____S_is_not_a_v, self, new_ksi_class);
                }
            }
            if (!((NIL == new_ksi_class) || (NIL != classes.classes_implements_p(new_ksi_class, CYBLACK_KNOWLEDGE_SOURCE_INSTANTIATION)))) {
                Errors.warn($str_alt215$_SET_KSI_CLASS__S____S_does_not_i, self, new_ksi_class);
            }
            cyblack_defksb_native_iks_reference_internal_set_ksi_class_method(self, new_ksi_class);
            return new_ksi_class;
        }
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_set_proposal_class_method(SubLObject self, SubLObject new_proposal_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!new_proposal_class.isSymbol()) {
                    Errors.error($str_alt217$_SET_PROPOSAL_CLASS__S____S_is_no, self, new_proposal_class);
                }
            }
            if (!((NIL == new_proposal_class) || (NIL != classes.classes_implements_p(new_proposal_class, CYBLACK_PROPOSAL)))) {
                Errors.warn($str_alt219$_SET_PROPOSAL_CLASS__S____S_does_, self, new_proposal_class);
            }
            cyblack_defksb_native_iks_reference_internal_set_proposal_class_method(self, new_proposal_class);
            return new_proposal_class;
        }
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_set_ks_class_method(SubLObject self, SubLObject new_ks_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != new_ks_class) && new_ks_class.isSymbol())) {
                    Errors.error($str_alt221$_SET_KS_CLASS__S____S_is_not_a_va, self, new_ks_class);
                }
            }
            if (NIL == classes.classes_implements_p(new_ks_class, CYBLACK_KNOWLEDGE_SOURCE)) {
                Errors.warn($str_alt223$_SET_KS_CLASS__S____S_does_not_im, self, new_ks_class);
            }
            cyblack_defksb_native_iks_reference_internal_set_ks_class_method(self, new_ks_class);
            return new_ks_class;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_native_iks_reference_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_native_iks_reference_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, KS_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, PROPOSAL_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, KSI_CLASS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_p(SubLObject cyblack_defksb_native_iks_reference) {
        return classes.subloop_instanceof_class(cyblack_defksb_native_iks_reference, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE);
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_iks_reference_method = NIL;
            SubLObject ksi_class = get_cyblack_defksb_native_iks_reference_ksi_class(self);
            SubLObject proposal_class = get_cyblack_defksb_native_iks_reference_proposal_class(self);
            SubLObject ks_class = get_cyblack_defksb_native_iks_reference_ks_class(self);
            try {
                try {
                    cyblack_defksb_expression_initialize_method(self);
                    ks_class = CYBLACK_BASIC_KNOWLEDGE_SOURCE;
                    proposal_class = CYBLACK_BASIC_PROPOSAL;
                    ksi_class = CYBLACK_BASIC_KSI;
                    sublisp_throw($sym228$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_iks_reference_ksi_class(self, ksi_class);
                            set_cyblack_defksb_native_iks_reference_proposal_class(self, proposal_class);
                            set_cyblack_defksb_native_iks_reference_ks_class(self, ks_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_iks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym228$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_iks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_iks_reference_method = NIL;
            SubLObject ksi_class = get_cyblack_defksb_native_iks_reference_ksi_class(self);
            SubLObject proposal_class = get_cyblack_defksb_native_iks_reference_proposal_class(self);
            SubLObject ks_class = get_cyblack_defksb_native_iks_reference_ks_class(self);
            try {
                try {
                    format(stream, $str_alt235$__KS_CLASS__S, ks_class);
                    if (NIL != proposal_class) {
                        format(stream, $str_alt236$__PROPOSAL_CLASS__S, proposal_class);
                    }
                    if (NIL != ksi_class) {
                        format(stream, $str_alt237$__KSI_CLASS__S, ksi_class);
                    }
                    format(stream, $str_alt77$_);
                    sublisp_throw($sym234$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_iks_reference_ksi_class(self, ksi_class);
                            set_cyblack_defksb_native_iks_reference_proposal_class(self, proposal_class);
                            set_cyblack_defksb_native_iks_reference_ks_class(self, ks_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_iks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym234$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_iks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_internal_set_ks_class_method(SubLObject self, SubLObject new_ks_class) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_iks_reference_method = NIL;
            SubLObject ks_class = get_cyblack_defksb_native_iks_reference_ks_class(self);
            try {
                try {
                    ks_class = new_ks_class;
                    sublisp_throw($sym241$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD, new_ks_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_iks_reference_ks_class(self, ks_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_iks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym241$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_iks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_internal_set_proposal_class_method(SubLObject self, SubLObject new_proposal_class) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_iks_reference_method = NIL;
            SubLObject proposal_class = get_cyblack_defksb_native_iks_reference_proposal_class(self);
            try {
                try {
                    proposal_class = new_proposal_class;
                    sublisp_throw($sym245$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD, new_proposal_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_iks_reference_proposal_class(self, proposal_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_iks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym245$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_iks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_internal_set_ksi_class_method(SubLObject self, SubLObject new_ksi_class) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_iks_reference_method = NIL;
            SubLObject ksi_class = get_cyblack_defksb_native_iks_reference_ksi_class(self);
            try {
                try {
                    ksi_class = new_ksi_class;
                    sublisp_throw($sym249$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD, new_ksi_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_iks_reference_ksi_class(self, ksi_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_iks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym249$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_iks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_get_ks_class_method(SubLObject self) {
        {
            SubLObject ks_class = get_cyblack_defksb_native_iks_reference_ks_class(self);
            return ks_class;
        }
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_get_proposal_class_method(SubLObject self) {
        {
            SubLObject proposal_class = get_cyblack_defksb_native_iks_reference_proposal_class(self);
            return proposal_class;
        }
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_get_ksi_class_method(SubLObject self) {
        {
            SubLObject ksi_class = get_cyblack_defksb_native_iks_reference_ksi_class(self);
            return ksi_class;
        }
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_get_internal_knowledge_source_classes_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_iks_reference_method = NIL;
            SubLObject ks_class = get_cyblack_defksb_native_iks_reference_ks_class(self);
            try {
                try {
                    if (NIL != ks_class) {
                        sublisp_throw($sym261$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD, list(ks_class));
                    }
                    sublisp_throw($sym261$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_iks_reference_ks_class(self, ks_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_iks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym261$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_iks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_iks_reference_get_info_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_iks_reference_method = NIL;
            SubLObject ks_class = get_cyblack_defksb_native_iks_reference_ks_class(self);
            try {
                try {
                    if (NIL != ks_class) {
                        sublisp_throw($sym264$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD, list(symbol_name(ks_class), ks_class));
                    }
                    sublisp_throw($sym264$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_iks_reference_ks_class(self, ks_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_iks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym264$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_iks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_external_ks_reference_p(SubLObject cyblack_defksb_external_ks_reference) {
        return interfaces.subloop_instanceof_interface(cyblack_defksb_external_ks_reference, CYBLACK_DEFKSB_EXTERNAL_KS_REFERENCE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_eks_reference_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_eks_reference_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, CHILDREN, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defksb_eks_reference_p(SubLObject cyblack_defksb_eks_reference) {
        return classes.subloop_instanceof_class(cyblack_defksb_eks_reference, CYBLACK_DEFKSB_EKS_REFERENCE);
    }

    public static final SubLObject cyblack_defksb_eks_reference_get_port_id_given_external_knowledge_source_method(SubLObject self, SubLObject eks_class) {
        return NIL;
    }

    public static final SubLObject get_cyblack_defksb_defks_eks_reference_ks_name(SubLObject cyblack_defksb_defks_eks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_defks_eks_reference, FIVE_INTEGER, KS_NAME);
    }

    public static final SubLObject set_cyblack_defksb_defks_eks_reference_ks_name(SubLObject cyblack_defksb_defks_eks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_defks_eks_reference, value, FIVE_INTEGER, KS_NAME);
    }

    public static final SubLObject get_cyblack_defksb_defks_eks_reference_port_id(SubLObject cyblack_defksb_defks_eks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_defks_eks_reference, FOUR_INTEGER, PORT_ID);
    }

    public static final SubLObject set_cyblack_defksb_defks_eks_reference_port_id(SubLObject cyblack_defksb_defks_eks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_defks_eks_reference, value, FOUR_INTEGER, PORT_ID);
    }

    public static final SubLObject get_cyblack_defksb_defks_eks_reference_external_module_name(SubLObject cyblack_defksb_defks_eks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_defks_eks_reference, THREE_INTEGER, EXTERNAL_MODULE_NAME);
    }

    public static final SubLObject set_cyblack_defksb_defks_eks_reference_external_module_name(SubLObject cyblack_defksb_defks_eks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_defks_eks_reference, value, THREE_INTEGER, EXTERNAL_MODULE_NAME);
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_set_ks_method(SubLObject self, SubLObject new_ks) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != new_ks) && new_ks.isSymbol())) {
                    Errors.error($str_alt179$_SET_KS__S____S_is_not_a_valid_kn, self, new_ks);
                }
            }
            if (NIL == cyblack_defks.cyblack_get_ks_assistant(new_ks)) {
                Errors.warn($str_alt180$_SET_KS__S____S_has_not_been_defi, self, new_ks);
            }
            cyblack_defksb_defks_eks_reference_internal_set_ks_method(self, new_ks);
            return new_ks;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_set_port_id_method(SubLObject self, SubLObject new_port_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_port_id) || (NIL != cyblack_message_broker.cyblack_port_id_p(new_port_id)))) {
                    Errors.error($str_alt286$_SET_PORT_ID__S____S_is_not_a_val, self, new_port_id);
                }
            }
            cyblack_defksb_defks_eks_reference_internal_set_port_id_method(self, new_port_id);
            return new_port_id;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_set_external_module_name_method(SubLObject self, SubLObject new_external_module_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_external_module_name) || (NIL != cyblack_message_broker.cyblack_external_module_name_p(new_external_module_name)))) {
                    Errors.error($str_alt288$_SET_EXTERNAL_MODULE_NAME__S____S, self, new_external_module_name);
                }
            }
            cyblack_defksb_defks_eks_reference_internal_set_external_module_name_method(self, new_external_module_name);
            return new_external_module_name;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_defks_eks_reference_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_defks_eks_reference_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, PORT_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, KS_NAME, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_p(SubLObject cyblack_defksb_defks_eks_reference) {
        return classes.subloop_instanceof_class(cyblack_defksb_defks_eks_reference, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE);
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_defks_eks_reference_method = NIL;
            SubLObject ks_name = get_cyblack_defksb_defks_eks_reference_ks_name(self);
            SubLObject port_id = get_cyblack_defksb_defks_eks_reference_port_id(self);
            SubLObject external_module_name = get_cyblack_defksb_defks_eks_reference_external_module_name(self);
            try {
                try {
                    cyblack_defksb_expression_initialize_method(self);
                    external_module_name = NIL;
                    port_id = NIL;
                    ks_name = NIL;
                    sublisp_throw($sym293$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_defks_eks_reference_ks_name(self, ks_name);
                            set_cyblack_defksb_defks_eks_reference_port_id(self, port_id);
                            set_cyblack_defksb_defks_eks_reference_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_defks_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym293$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_defks_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject ks_name = get_cyblack_defksb_defks_eks_reference_ks_name(self);
            SubLObject port_id = get_cyblack_defksb_defks_eks_reference_port_id(self);
            SubLObject external_module_name = get_cyblack_defksb_defks_eks_reference_external_module_name(self);
            if (NIL != port_id) {
                format(stream, $str_alt296$__KS__S__EXTERNAL_MODULE_NAME__S_, new SubLObject[]{ ks_name, external_module_name, port_id });
            } else {
                format(stream, $str_alt297$__KS__S__EXTERNAL_MODULE_NAME__S_, ks_name, external_module_name);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_get_external_knowledge_source_class_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_defks_eks_reference_method = NIL;
            SubLObject ks_name = get_cyblack_defksb_defks_eks_reference_ks_name(self);
            try {
                try {
                    if (NIL != ks_name) {
                        {
                            SubLObject assistant = cyblack_defks.cyblack_get_ks_assistant(ks_name);
                            if (NIL != assistant) {
                                sublisp_throw($sym300$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD, cyblack_defks.cyblack_auto_generated_ks_assistant_get_knowledge_source_class_method(assistant));
                            }
                        }
                    }
                    sublisp_throw($sym300$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_defks_eks_reference_ks_name(self, ks_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_defks_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym300$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_defks_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_get_external_knowledge_source_classes_method(SubLObject self) {
        {
            SubLObject class_name = cyblack_defksb_defks_eks_reference_get_external_knowledge_source_class_method(self);
            if (NIL != class_name) {
                return list(class_name);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_get_port_id_given_external_knowledge_source_method(SubLObject self, SubLObject eks_class) {
        {
            SubLObject catch_var_for_cyblack_defksb_defks_eks_reference_method = NIL;
            SubLObject ks_name = get_cyblack_defksb_defks_eks_reference_ks_name(self);
            SubLObject port_id = get_cyblack_defksb_defks_eks_reference_port_id(self);
            try {
                try {
                    if ((NIL != ks_name) && (NIL != port_id)) {
                        {
                            SubLObject assistant = cyblack_defks.cyblack_get_ks_assistant(ks_name);
                            if (NIL != assistant) {
                                {
                                    SubLObject class_name = cyblack_defks.cyblack_auto_generated_ks_assistant_get_knowledge_source_class_method(assistant);
                                    if (eks_class == class_name) {
                                        sublisp_throw($sym305$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD, port_id);
                                    }
                                }
                            }
                        }
                    }
                    sublisp_throw($sym305$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_defks_eks_reference_ks_name(self, ks_name);
                            set_cyblack_defksb_defks_eks_reference_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_defks_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym305$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_defks_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_get_info_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_defks_eks_reference_method = NIL;
            SubLObject port_id = get_cyblack_defksb_defks_eks_reference_port_id(self);
            SubLObject external_module_name = get_cyblack_defksb_defks_eks_reference_external_module_name(self);
            try {
                try {
                    sublisp_throw($sym308$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD, list(external_module_name, cyblack_defksb_defks_eks_reference_get_external_knowledge_source_class_method(self), port_id));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_defks_eks_reference_port_id(self, port_id);
                            set_cyblack_defksb_defks_eks_reference_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_defks_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym308$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_defks_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_internal_set_external_module_name_method(SubLObject self, SubLObject new_external_module_name) {
        {
            SubLObject catch_var_for_cyblack_defksb_defks_eks_reference_method = NIL;
            SubLObject external_module_name = get_cyblack_defksb_defks_eks_reference_external_module_name(self);
            try {
                try {
                    external_module_name = new_external_module_name;
                    sublisp_throw($sym312$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD, new_external_module_name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_defks_eks_reference_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_defks_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym312$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_defks_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_internal_set_port_id_method(SubLObject self, SubLObject new_port_id) {
        {
            SubLObject catch_var_for_cyblack_defksb_defks_eks_reference_method = NIL;
            SubLObject port_id = get_cyblack_defksb_defks_eks_reference_port_id(self);
            try {
                try {
                    port_id = new_port_id;
                    sublisp_throw($sym316$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD, new_port_id);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_defks_eks_reference_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_defks_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym316$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_defks_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_get_external_module_name_method(SubLObject self) {
        {
            SubLObject external_module_name = get_cyblack_defksb_defks_eks_reference_external_module_name(self);
            return external_module_name;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_get_port_id_method(SubLObject self) {
        {
            SubLObject port_id = get_cyblack_defksb_defks_eks_reference_port_id(self);
            return port_id;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_internal_set_ks_method(SubLObject self, SubLObject new_ks) {
        {
            SubLObject catch_var_for_cyblack_defksb_defks_eks_reference_method = NIL;
            SubLObject ks_name = get_cyblack_defksb_defks_eks_reference_ks_name(self);
            try {
                try {
                    ks_name = new_ks;
                    sublisp_throw($sym324$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD, new_ks);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_defks_eks_reference_ks_name(self, ks_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_defks_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym324$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_defks_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_defks_eks_reference_get_ks_method(SubLObject self) {
        {
            SubLObject ks_name = get_cyblack_defksb_defks_eks_reference_ks_name(self);
            return ks_name;
        }
    }

    public static final SubLObject get_cyblack_defksb_native_eks_reference_ksi_class(SubLObject cyblack_defksb_native_eks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_native_eks_reference, SEVEN_INTEGER, KSI_CLASS);
    }

    public static final SubLObject set_cyblack_defksb_native_eks_reference_ksi_class(SubLObject cyblack_defksb_native_eks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_native_eks_reference, value, SEVEN_INTEGER, KSI_CLASS);
    }

    public static final SubLObject get_cyblack_defksb_native_eks_reference_proposal_class(SubLObject cyblack_defksb_native_eks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_native_eks_reference, SIX_INTEGER, PROPOSAL_CLASS);
    }

    public static final SubLObject set_cyblack_defksb_native_eks_reference_proposal_class(SubLObject cyblack_defksb_native_eks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_native_eks_reference, value, SIX_INTEGER, PROPOSAL_CLASS);
    }

    public static final SubLObject get_cyblack_defksb_native_eks_reference_ks_class(SubLObject cyblack_defksb_native_eks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_native_eks_reference, FIVE_INTEGER, KS_CLASS);
    }

    public static final SubLObject set_cyblack_defksb_native_eks_reference_ks_class(SubLObject cyblack_defksb_native_eks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_native_eks_reference, value, FIVE_INTEGER, KS_CLASS);
    }

    public static final SubLObject get_cyblack_defksb_native_eks_reference_port_id(SubLObject cyblack_defksb_native_eks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_native_eks_reference, FOUR_INTEGER, PORT_ID);
    }

    public static final SubLObject set_cyblack_defksb_native_eks_reference_port_id(SubLObject cyblack_defksb_native_eks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_native_eks_reference, value, FOUR_INTEGER, PORT_ID);
    }

    public static final SubLObject get_cyblack_defksb_native_eks_reference_external_module_name(SubLObject cyblack_defksb_native_eks_reference) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defksb_native_eks_reference, THREE_INTEGER, EXTERNAL_MODULE_NAME);
    }

    public static final SubLObject set_cyblack_defksb_native_eks_reference_external_module_name(SubLObject cyblack_defksb_native_eks_reference, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defksb_native_eks_reference, value, THREE_INTEGER, EXTERNAL_MODULE_NAME);
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_set_ksi_class_method(SubLObject self, SubLObject new_ksi_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!new_ksi_class.isSymbol()) {
                    Errors.error($str_alt213$_SET_KSI_CLASS__S____S_is_not_a_v, self, new_ksi_class);
                }
            }
            if (!((NIL == new_ksi_class) || (NIL != classes.classes_implements_p(new_ksi_class, CYBLACK_KNOWLEDGE_SOURCE_INSTANTIATION)))) {
                Errors.warn($str_alt215$_SET_KSI_CLASS__S____S_does_not_i, self, new_ksi_class);
            }
            cyblack_defksb_native_eks_reference_internal_set_ksi_class_method(self, new_ksi_class);
            return new_ksi_class;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_set_proposal_class_method(SubLObject self, SubLObject new_proposal_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!new_proposal_class.isSymbol()) {
                    Errors.error($str_alt217$_SET_PROPOSAL_CLASS__S____S_is_no, self, new_proposal_class);
                }
            }
            if (!((NIL == new_proposal_class) || (NIL != classes.classes_implements_p(new_proposal_class, CYBLACK_PROPOSAL)))) {
                Errors.warn($str_alt219$_SET_PROPOSAL_CLASS__S____S_does_, self, new_proposal_class);
            }
            cyblack_defksb_native_eks_reference_internal_set_proposal_class_method(self, new_proposal_class);
            return new_proposal_class;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_set_ks_class_method(SubLObject self, SubLObject new_ks_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != new_ks_class) && new_ks_class.isSymbol())) {
                    Errors.error($str_alt221$_SET_KS_CLASS__S____S_is_not_a_va, self, new_ks_class);
                }
            }
            if (NIL == classes.classes_implements_p(new_ks_class, CYBLACK_KNOWLEDGE_SOURCE)) {
                Errors.warn($str_alt223$_SET_KS_CLASS__S____S_does_not_im, self, new_ks_class);
            }
            cyblack_defksb_native_eks_reference_internal_set_ks_class_method(self, new_ks_class);
            return new_ks_class;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_set_port_id_method(SubLObject self, SubLObject new_port_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_port_id) || (NIL != cyblack_message_broker.cyblack_port_id_p(new_port_id)))) {
                    Errors.error($str_alt286$_SET_PORT_ID__S____S_is_not_a_val, self, new_port_id);
                }
            }
            cyblack_defksb_native_eks_reference_internal_set_port_id_method(self, new_port_id);
            return new_port_id;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_set_external_module_name_method(SubLObject self, SubLObject new_external_module_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_external_module_name) || (NIL != cyblack_message_broker.cyblack_external_module_name_p(new_external_module_name)))) {
                    Errors.error($str_alt288$_SET_EXTERNAL_MODULE_NAME__S____S, self, new_external_module_name);
                }
            }
            cyblack_defksb_native_eks_reference_internal_set_external_module_name_method(self, new_external_module_name);
            return new_external_module_name;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_native_eks_reference_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defksb_native_eks_reference_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, EXTERNAL_MODULE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, PORT_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, KS_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, PROPOSAL_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, KSI_CLASS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_p(SubLObject cyblack_defksb_native_eks_reference) {
        return classes.subloop_instanceof_class(cyblack_defksb_native_eks_reference, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE);
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_eks_reference_method = NIL;
            SubLObject ksi_class = get_cyblack_defksb_native_eks_reference_ksi_class(self);
            SubLObject proposal_class = get_cyblack_defksb_native_eks_reference_proposal_class(self);
            SubLObject ks_class = get_cyblack_defksb_native_eks_reference_ks_class(self);
            SubLObject port_id = get_cyblack_defksb_native_eks_reference_port_id(self);
            SubLObject external_module_name = get_cyblack_defksb_native_eks_reference_external_module_name(self);
            try {
                try {
                    cyblack_defksb_expression_initialize_method(self);
                    external_module_name = NIL;
                    port_id = NIL;
                    ks_class = CYBLACK_BASIC_KNOWLEDGE_SOURCE;
                    proposal_class = CYBLACK_BASIC_PROPOSAL;
                    ksi_class = CYBLACK_BASIC_KSI;
                    sublisp_throw($sym338$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_eks_reference_ksi_class(self, ksi_class);
                            set_cyblack_defksb_native_eks_reference_proposal_class(self, proposal_class);
                            set_cyblack_defksb_native_eks_reference_ks_class(self, ks_class);
                            set_cyblack_defksb_native_eks_reference_port_id(self, port_id);
                            set_cyblack_defksb_native_eks_reference_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym338$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_eks_reference_method = NIL;
            SubLObject ksi_class = get_cyblack_defksb_native_eks_reference_ksi_class(self);
            SubLObject proposal_class = get_cyblack_defksb_native_eks_reference_proposal_class(self);
            SubLObject ks_class = get_cyblack_defksb_native_eks_reference_ks_class(self);
            SubLObject port_id = get_cyblack_defksb_native_eks_reference_port_id(self);
            SubLObject external_module_name = get_cyblack_defksb_native_eks_reference_external_module_name(self);
            try {
                try {
                    format(stream, $str_alt235$__KS_CLASS__S, ks_class);
                    if (NIL != proposal_class) {
                        format(stream, $str_alt236$__PROPOSAL_CLASS__S, proposal_class);
                    }
                    if (NIL != ksi_class) {
                        format(stream, $str_alt237$__KSI_CLASS__S, ksi_class);
                    }
                    if (NIL != external_module_name) {
                        format(stream, $str_alt342$__EXTERNAL_MODULE_NAME__S, external_module_name);
                    }
                    if (NIL != port_id) {
                        format(stream, $str_alt343$__PORT_ID__S, port_id);
                    }
                    format(stream, $str_alt77$_);
                    sublisp_throw($sym341$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_eks_reference_ksi_class(self, ksi_class);
                            set_cyblack_defksb_native_eks_reference_proposal_class(self, proposal_class);
                            set_cyblack_defksb_native_eks_reference_ks_class(self, ks_class);
                            set_cyblack_defksb_native_eks_reference_port_id(self, port_id);
                            set_cyblack_defksb_native_eks_reference_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym341$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_get_external_knowledge_source_classes_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_eks_reference_method = NIL;
            SubLObject ks_class = get_cyblack_defksb_native_eks_reference_ks_class(self);
            try {
                try {
                    if (NIL != ks_class) {
                        sublisp_throw($sym345$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, list(ks_class));
                    }
                    sublisp_throw($sym345$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_eks_reference_ks_class(self, ks_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym345$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_get_port_id_given_external_knowledge_source_method(SubLObject self, SubLObject eks_class) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_eks_reference_method = NIL;
            SubLObject ks_class = get_cyblack_defksb_native_eks_reference_ks_class(self);
            SubLObject port_id = get_cyblack_defksb_native_eks_reference_port_id(self);
            try {
                try {
                    if (ks_class == eks_class) {
                        sublisp_throw($sym348$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, port_id);
                    }
                    sublisp_throw($sym348$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_eks_reference_ks_class(self, ks_class);
                            set_cyblack_defksb_native_eks_reference_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym348$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_internal_set_external_module_name_method(SubLObject self, SubLObject new_external_module_name) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_eks_reference_method = NIL;
            SubLObject external_module_name = get_cyblack_defksb_native_eks_reference_external_module_name(self);
            try {
                try {
                    external_module_name = new_external_module_name;
                    sublisp_throw($sym350$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, new_external_module_name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_eks_reference_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym350$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_internal_set_port_id_method(SubLObject self, SubLObject new_port_id) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_eks_reference_method = NIL;
            SubLObject port_id = get_cyblack_defksb_native_eks_reference_port_id(self);
            try {
                try {
                    port_id = new_port_id;
                    sublisp_throw($sym352$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, new_port_id);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_eks_reference_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym352$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_get_external_module_name_method(SubLObject self) {
        {
            SubLObject external_module_name = get_cyblack_defksb_native_eks_reference_external_module_name(self);
            return external_module_name;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_get_port_id_method(SubLObject self) {
        {
            SubLObject port_id = get_cyblack_defksb_native_eks_reference_port_id(self);
            return port_id;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_internal_set_ks_class_method(SubLObject self, SubLObject new_ks_class) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_eks_reference_method = NIL;
            SubLObject ks_class = get_cyblack_defksb_native_eks_reference_ks_class(self);
            try {
                try {
                    ks_class = new_ks_class;
                    sublisp_throw($sym356$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, new_ks_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_eks_reference_ks_class(self, ks_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym356$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_internal_set_proposal_class_method(SubLObject self, SubLObject new_proposal_class) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_eks_reference_method = NIL;
            SubLObject proposal_class = get_cyblack_defksb_native_eks_reference_proposal_class(self);
            try {
                try {
                    proposal_class = new_proposal_class;
                    sublisp_throw($sym358$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, new_proposal_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_eks_reference_proposal_class(self, proposal_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym358$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_internal_set_ksi_class_method(SubLObject self, SubLObject new_ksi_class) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_eks_reference_method = NIL;
            SubLObject ksi_class = get_cyblack_defksb_native_eks_reference_ksi_class(self);
            try {
                try {
                    ksi_class = new_ksi_class;
                    sublisp_throw($sym360$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, new_ksi_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_eks_reference_ksi_class(self, ksi_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym360$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_eks_reference_method;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_get_ks_class_method(SubLObject self) {
        {
            SubLObject ks_class = get_cyblack_defksb_native_eks_reference_ks_class(self);
            return ks_class;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_get_proposal_class_method(SubLObject self) {
        {
            SubLObject proposal_class = get_cyblack_defksb_native_eks_reference_proposal_class(self);
            return proposal_class;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_get_ksi_class_method(SubLObject self) {
        {
            SubLObject ksi_class = get_cyblack_defksb_native_eks_reference_ksi_class(self);
            return ksi_class;
        }
    }

    public static final SubLObject cyblack_defksb_native_eks_reference_get_info_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defksb_native_eks_reference_method = NIL;
            SubLObject ks_class = get_cyblack_defksb_native_eks_reference_ks_class(self);
            SubLObject port_id = get_cyblack_defksb_native_eks_reference_port_id(self);
            SubLObject external_module_name = get_cyblack_defksb_native_eks_reference_external_module_name(self);
            try {
                try {
                    sublisp_throw($sym366$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD, list(external_module_name, ks_class, port_id));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defksb_native_eks_reference_ks_class(self, ks_class);
                            set_cyblack_defksb_native_eks_reference_port_id(self, port_id);
                            set_cyblack_defksb_native_eks_reference_external_module_name(self, external_module_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defksb_native_eks_reference_method = Errors.handleThrowable(ccatch_env_var, $sym366$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD);
            }
            return catch_var_for_cyblack_defksb_native_eks_reference_method;
        }
    }

    /**
     * Enumerated values of type CYBLACK-DEFKSB-BODY-KEY.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_defksb_body_keys$ = makeSymbol("*VALID-CYBLACK-DEFKSB-BODY-KEYS*");

    /**
     * Returns a list of all valid members of the CYBLACK-DEFKSB-BODY-KEY enumeration.
     */
    public static final SubLObject valid_cyblack_defksb_body_keys() {
        return $valid_cyblack_defksb_body_keys$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-DEFKSB-BODY-KEY enumeration.
     */
    public static final SubLObject cyblack_defksb_body_key_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_defksb_body_keys$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-DEFKSB-BODY-KEY enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_defksb_body_key(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_defksb_body_keys$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt370$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_DEFKSB_BODY_KEY, value, CYBLACK_DEFKSB_BODY_KEY);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-DEFKSB-BODY-KEY enumeration.
     */
    public static final SubLObject decode_cyblack_defksb_body_key(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_defksb_body_keys$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt372$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_DEFKSB_BODY_KEY, value, CYBLACK_DEFKSB_BODY_KEY);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-DEFKSB-BODY-KEY enumeration.
     */
    public static final SubLObject cyblack_defksb_body_key_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defksb_body_key_p(value1)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKSB_BODY_KEY_P, value1, CYBLACK_DEFKSB_BODY_KEY);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defksb_body_key_p(value2)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKSB_BODY_KEY_P, value2, CYBLACK_DEFKSB_BODY_KEY);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defksb_body_keys$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-DEFKSB-BODY-KEY enumeration.
     */
    public static final SubLObject cyblack_defksb_body_key_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defksb_body_key_p(value1)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKSB_BODY_KEY_P, value1, CYBLACK_DEFKSB_BODY_KEY);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defksb_body_key_p(value2)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKSB_BODY_KEY_P, value2, CYBLACK_DEFKSB_BODY_KEY);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defksb_body_keys$.getGlobalValue();
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

    public static final SubLObject cyblack_defksb_body_alist_p(SubLObject list) {
        if (!list.isList()) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = list;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (!(element.isCons() && (NIL != cyblack_defksb_body_key_p(element.first())))) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static final SubLObject parse_cyblack_defksb_body(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defksb_body_alist_p(v_object)) {
                    Errors.error($str_alt376$PARSE_CYBLACK_DEFKSB_BODY___S_is_, v_object);
                }
            }
            {
                SubLObject internal_knowledge_sources_expression = assoc($INTERNAL_KNOWLEDGE_SOURCES, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject parsed_internal_knowledge_sources_expression = parse_cyblack_defksb_internal_ks_expressions(internal_knowledge_sources_expression);
                SubLObject external_knowledge_sources_expression = assoc($EXTERNAL_KNOWLEDGE_SOURCES, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject parsed_external_knowledge_sources_expression = parse_cyblack_defksb_external_ks_expressions(external_knowledge_sources_expression);
                SubLObject on_startup_association = assoc($ON_STARTUP, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject on_shutdown_association = assoc($ON_SHUTDOWN, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject parsed_body = object.new_class_instance(CYBLACK_DEFKSB_BODY);
                {
                    SubLObject cdolist_list_var = parsed_internal_knowledge_sources_expression;
                    SubLObject internal_ks_expression = NIL;
                    for (internal_ks_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , internal_ks_expression = cdolist_list_var.first()) {
                        cyblack_defksb_expression_set_parent_method(internal_ks_expression, parsed_body);
                    }
                }
                {
                    SubLObject cdolist_list_var = parsed_external_knowledge_sources_expression;
                    SubLObject external_ks_expression = NIL;
                    for (external_ks_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , external_ks_expression = cdolist_list_var.first()) {
                        cyblack_defksb_expression_set_parent_method(external_ks_expression, parsed_body);
                    }
                }
                cyblack_defksb_body_set_internal_knowledge_source_expressions_method(parsed_body, parsed_internal_knowledge_sources_expression);
                cyblack_defksb_body_set_external_knowledge_source_expressions_method(parsed_body, parsed_external_knowledge_sources_expression);
                if (NIL != on_startup_association) {
                    cyblack_defksb_body_set_on_startup_body_method(parsed_body, on_startup_association.rest());
                }
                if (NIL != on_shutdown_association) {
                    cyblack_defksb_body_set_on_shutdown_body_method(parsed_body, on_shutdown_association.rest());
                }
                return parsed_body;
            }
        }
    }

    public static final SubLObject parse_cyblack_defksb_internal_ks_expressions(SubLObject v_object) {
        if (NIL == v_object) {
            return NIL;
        } else
            if (v_object.isCons() && (v_object.first() == $INTERNAL_KNOWLEDGE_SOURCES)) {
                {
                    SubLObject parsed_internal_knowledge_source_expressions = NIL;
                    SubLObject list_expression = v_object.rest();
                    if (NIL == list_expression) {
                        parsed_internal_knowledge_source_expressions = NIL;
                    } else
                        if (list_expression.isAtom()) {
                            parsed_internal_knowledge_source_expressions = list(list_expression);
                        } else
                            if (NIL == list_expression.rest()) {
                                {
                                    SubLObject internal_ks_expression = list_expression.first();
                                    parsed_internal_knowledge_source_expressions = list(parse_cyblack_defksb_iks_reference(internal_ks_expression));
                                }
                            } else {
                                {
                                    SubLObject tail_cons = NIL;
                                    SubLObject result = NIL;
                                    {
                                        SubLObject internal_ks_expression = list_expression.first();
                                        parsed_internal_knowledge_source_expressions = list(parse_cyblack_defksb_iks_reference(internal_ks_expression));
                                        tail_cons = parsed_internal_knowledge_source_expressions;
                                    }
                                    {
                                        SubLObject cdolist_list_var = list_expression.rest();
                                        SubLObject internal_ks_expression = NIL;
                                        for (internal_ks_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , internal_ks_expression = cdolist_list_var.first()) {
                                            result = list(parse_cyblack_defksb_iks_reference(internal_ks_expression));
                                            rplacd(tail_cons, result);
                                            tail_cons = result;
                                        }
                                    }
                                }
                            }


                    return parsed_internal_knowledge_source_expressions;
                }
            } else {
                Errors.error($str_alt381$PARSE_CYBLACK_DEFKSB_INTERNAL_KS_, v_object);
            }

        return NIL;
    }

    public static final SubLObject parse_cyblack_defksb_iks_reference(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(v_object.isCons() && (NIL != member(v_object.first(), $list_alt382, UNPROVIDED, UNPROVIDED)))) {
                    Errors.error($str_alt383$PARSE_CYBLACK_DEFKSB_IKS_REFERENC, v_object);
                }
            }
            {
                SubLObject pcase_var = v_object.first();
                if (pcase_var.eql($KS)) {
                    return parse_cyblack_defksb_defks_iks_reference(v_object);
                } else
                    if (pcase_var.eql($KS_CLASS)) {
                        return parse_cyblack_defksb_native_iks_reference(v_object);
                    }

            }
            return NIL;
        }
    }

    public static final SubLObject parse_cyblack_defksb_defks_iks_reference(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(((((v_object.isCons() && (v_object.first() == $KS)) && v_object.rest().isCons()) && (NIL != cadr(v_object))) && cadr(v_object).isSymbol()) && (NIL == cddr(v_object)))) {
                    Errors.error($str_alt386$PARSE_CYBLACK_DEFKSB_DEFKS_IKS_RE, v_object);
                }
            }
            {
                SubLObject parsed_iks_reference = object.new_class_instance(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE);
                cyblack_defksb_defks_iks_reference_set_ks_method(parsed_iks_reference, cadr(v_object));
                return parsed_iks_reference;
            }
        }
    }

    /**
     * Enumerated values of type CYBLACK-NATIVE-IKS-REFERENCE-KEY.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_native_iks_reference_keys$ = makeSymbol("*VALID-CYBLACK-NATIVE-IKS-REFERENCE-KEYS*");

    /**
     * Returns a list of all valid members of the CYBLACK-NATIVE-IKS-REFERENCE-KEY enumeration.
     */
    public static final SubLObject valid_cyblack_native_iks_reference_keys() {
        return $valid_cyblack_native_iks_reference_keys$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-NATIVE-IKS-REFERENCE-KEY enumeration.
     */
    public static final SubLObject cyblack_native_iks_reference_key_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_native_iks_reference_keys$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-NATIVE-IKS-REFERENCE-KEY enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_native_iks_reference_key(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_native_iks_reference_keys$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt370$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_NATIVE_IKS_REFERENCE_KEY, value, CYBLACK_NATIVE_IKS_REFERENCE_KEY);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-NATIVE-IKS-REFERENCE-KEY enumeration.
     */
    public static final SubLObject decode_cyblack_native_iks_reference_key(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_native_iks_reference_keys$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt372$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_NATIVE_IKS_REFERENCE_KEY, value, CYBLACK_NATIVE_IKS_REFERENCE_KEY);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-NATIVE-IKS-REFERENCE-KEY enumeration.
     */
    public static final SubLObject cyblack_native_iks_reference_key_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_native_iks_reference_key_p(value1)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_NATIVE_IKS_REFERENCE_KEY_P, value1, CYBLACK_NATIVE_IKS_REFERENCE_KEY);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_native_iks_reference_key_p(value2)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_NATIVE_IKS_REFERENCE_KEY_P, value2, CYBLACK_NATIVE_IKS_REFERENCE_KEY);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_native_iks_reference_keys$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-NATIVE-IKS-REFERENCE-KEY enumeration.
     */
    public static final SubLObject cyblack_native_iks_reference_key_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_native_iks_reference_key_p(value1)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_NATIVE_IKS_REFERENCE_KEY_P, value1, CYBLACK_NATIVE_IKS_REFERENCE_KEY);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_native_iks_reference_key_p(value2)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_NATIVE_IKS_REFERENCE_KEY_P, value2, CYBLACK_NATIVE_IKS_REFERENCE_KEY);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_native_iks_reference_keys$.getGlobalValue();
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

    public static final SubLObject cyblack_native_iks_reference_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_native_iks_reference_key_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject parse_cyblack_defksb_native_iks_reference(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_native_iks_reference_plist_p(v_object)) {
                    Errors.error($str_alt392$PARSE_CYBLACK_DEFKSB_NATIVE_IKS_R, v_object);
                }
            }
            {
                SubLObject ks_class = getf(v_object, $KS_CLASS, UNPROVIDED);
                SubLObject proposal_class = getf(v_object, $PROPOSAL_CLASS, UNPROVIDED);
                SubLObject ksi_class = getf(v_object, $KSI_CLASS, UNPROVIDED);
                SubLObject parsed_cyblack_defksb_native_iks_reference = object.new_class_instance(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE);
                cyblack_defksb_native_iks_reference_set_ks_class_method(parsed_cyblack_defksb_native_iks_reference, ks_class);
                cyblack_defksb_native_iks_reference_set_proposal_class_method(parsed_cyblack_defksb_native_iks_reference, proposal_class);
                cyblack_defksb_native_iks_reference_set_ksi_class_method(parsed_cyblack_defksb_native_iks_reference, ksi_class);
                return parsed_cyblack_defksb_native_iks_reference;
            }
        }
    }

    public static final SubLObject parse_cyblack_defksb_external_ks_expressions(SubLObject v_object) {
        if (NIL == v_object) {
            return NIL;
        } else
            if (v_object.isCons() && (v_object.first() == $EXTERNAL_KNOWLEDGE_SOURCES)) {
                {
                    SubLObject parsed_external_knowledge_source_expressions = NIL;
                    SubLObject list_expression = v_object.rest();
                    if (NIL == list_expression) {
                        parsed_external_knowledge_source_expressions = NIL;
                    } else
                        if (list_expression.isAtom()) {
                            parsed_external_knowledge_source_expressions = list(list_expression);
                        } else
                            if (NIL == list_expression.rest()) {
                                {
                                    SubLObject external_ks_expression = list_expression.first();
                                    parsed_external_knowledge_source_expressions = list(parse_cyblack_defksb_eks_reference(external_ks_expression));
                                }
                            } else {
                                {
                                    SubLObject tail_cons = NIL;
                                    SubLObject result = NIL;
                                    {
                                        SubLObject external_ks_expression = list_expression.first();
                                        parsed_external_knowledge_source_expressions = list(parse_cyblack_defksb_eks_reference(external_ks_expression));
                                        tail_cons = parsed_external_knowledge_source_expressions;
                                    }
                                    {
                                        SubLObject cdolist_list_var = list_expression.rest();
                                        SubLObject external_ks_expression = NIL;
                                        for (external_ks_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , external_ks_expression = cdolist_list_var.first()) {
                                            result = list(parse_cyblack_defksb_eks_reference(external_ks_expression));
                                            rplacd(tail_cons, result);
                                            tail_cons = result;
                                        }
                                    }
                                }
                            }


                    return parsed_external_knowledge_source_expressions;
                }
            } else {
                Errors.error($str_alt395$PARSE_CYBLACK_DEFKSB_EXTERNAL_KS_, v_object);
            }

        return NIL;
    }

    public static final SubLObject parse_cyblack_defksb_eks_reference(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(v_object.isCons() && (NIL != member(v_object.first(), $list_alt382, UNPROVIDED, UNPROVIDED)))) {
                    Errors.error($str_alt396$PARSE_CYBLACK_DEFKSB_EKS_REFERENC, v_object);
                }
            }
            {
                SubLObject pcase_var = v_object.first();
                if (pcase_var.eql($KS)) {
                    return parse_cyblack_defksb_defks_eks_reference(v_object);
                } else
                    if (pcase_var.eql($KS_CLASS)) {
                        return parse_cyblack_defksb_native_eks_reference(v_object);
                    }

            }
            return NIL;
        }
    }

    /**
     * Enumerated values of type CYBLACK-DEFKS-EKS-KEY.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_defks_eks_keys$ = makeSymbol("*VALID-CYBLACK-DEFKS-EKS-KEYS*");

    /**
     * Returns a list of all valid members of the CYBLACK-DEFKS-EKS-KEY enumeration.
     */
    public static final SubLObject valid_cyblack_defks_eks_keys() {
        return $valid_cyblack_defks_eks_keys$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-DEFKS-EKS-KEY enumeration.
     */
    public static final SubLObject cyblack_defks_eks_key_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_defks_eks_keys$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-DEFKS-EKS-KEY enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_defks_eks_key(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_defks_eks_keys$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt370$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_DEFKS_EKS_KEY, value, CYBLACK_DEFKS_EKS_KEY);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-DEFKS-EKS-KEY enumeration.
     */
    public static final SubLObject decode_cyblack_defks_eks_key(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_defks_eks_keys$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt372$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_DEFKS_EKS_KEY, value, CYBLACK_DEFKS_EKS_KEY);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-DEFKS-EKS-KEY enumeration.
     */
    public static final SubLObject cyblack_defks_eks_key_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defks_eks_key_p(value1)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKS_EKS_KEY_P, value1, CYBLACK_DEFKS_EKS_KEY);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defks_eks_key_p(value2)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKS_EKS_KEY_P, value2, CYBLACK_DEFKS_EKS_KEY);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defks_eks_keys$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-DEFKS-EKS-KEY enumeration.
     */
    public static final SubLObject cyblack_defks_eks_key_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defks_eks_key_p(value1)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKS_EKS_KEY_P, value1, CYBLACK_DEFKS_EKS_KEY);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defks_eks_key_p(value2)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKS_EKS_KEY_P, value2, CYBLACK_DEFKS_EKS_KEY);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defks_eks_keys$.getGlobalValue();
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

    public static final SubLObject cyblack_defks_eks_reference_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_defks_eks_key_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject parse_cyblack_defksb_defks_eks_reference(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(((NIL != cyblack_defks_eks_reference_plist_p(v_object)) && (NIL != list_utilities.member_plist_key_p($KS, v_object))) && (NIL != list_utilities.member_plist_key_p($EXTERNAL_MODULE_NAME, v_object)))) {
                    Errors.error($str_alt403$PARSE_CYBLACK_DEFKSB_DEFKS_EKS_RE, v_object);
                }
            }
            {
                SubLObject ks = getf(v_object, $KS, UNPROVIDED);
                SubLObject external_module = getf(v_object, $EXTERNAL_MODULE_NAME, UNPROVIDED);
                SubLObject port = getf(v_object, $PORT, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL != ks) && ks.isSymbol())) {
                        Errors.error($str_alt405$PARSE_CYBLACK_DEFKSB_DEFKS_EKS_RE, ks);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL != external_module) && (NIL != cyblack_message_broker.cyblack_external_module_name_p(external_module)))) {
                        Errors.error($str_alt406$PARSE_CYBLACK_DEFKSB_DEFKS_EKS_RE, external_module);
                    }
                }
                if (NIL == cyblack_defks.cyblack_get_ks_assistant(ks)) {
                    Errors.warn($str_alt407$PARSE_CYBLACK_DEFKSB_DEFKS_EKS_RE, ks);
                }
                {
                    SubLObject eks_reference = object.new_class_instance(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE);
                    cyblack_defksb_defks_eks_reference_set_ks_method(eks_reference, ks);
                    cyblack_defksb_defks_eks_reference_set_external_module_name_method(eks_reference, external_module);
                    cyblack_defksb_defks_eks_reference_set_port_id_method(eks_reference, port);
                    return eks_reference;
                }
            }
        }
    }

    /**
     * Enumerated values of type CYBLACK-NATIVE-EKS-KEY.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_native_eks_keys$ = makeSymbol("*VALID-CYBLACK-NATIVE-EKS-KEYS*");

    /**
     * Returns a list of all valid members of the CYBLACK-NATIVE-EKS-KEY enumeration.
     */
    public static final SubLObject valid_cyblack_native_eks_keys() {
        return $valid_cyblack_native_eks_keys$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-NATIVE-EKS-KEY enumeration.
     */
    public static final SubLObject cyblack_native_eks_key_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_native_eks_keys$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-NATIVE-EKS-KEY enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_native_eks_key(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_native_eks_keys$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt370$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_NATIVE_EKS_KEY, value, CYBLACK_NATIVE_EKS_KEY);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-NATIVE-EKS-KEY enumeration.
     */
    public static final SubLObject decode_cyblack_native_eks_key(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_native_eks_keys$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt372$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_NATIVE_EKS_KEY, value, CYBLACK_NATIVE_EKS_KEY);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-NATIVE-EKS-KEY enumeration.
     */
    public static final SubLObject cyblack_native_eks_key_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_native_eks_key_p(value1)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_NATIVE_EKS_KEY_P, value1, CYBLACK_NATIVE_EKS_KEY);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_native_eks_key_p(value2)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_NATIVE_EKS_KEY_P, value2, CYBLACK_NATIVE_EKS_KEY);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_native_eks_keys$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-NATIVE-EKS-KEY enumeration.
     */
    public static final SubLObject cyblack_native_eks_key_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_native_eks_key_p(value1)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_NATIVE_EKS_KEY_P, value1, CYBLACK_NATIVE_EKS_KEY);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_native_eks_key_p(value2)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_NATIVE_EKS_KEY_P, value2, CYBLACK_NATIVE_EKS_KEY);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_native_eks_keys$.getGlobalValue();
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

    public static final SubLObject cyblack_native_eks_reference_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_native_eks_key_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject parse_cyblack_defksb_native_eks_reference(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != cyblack_native_eks_reference_plist_p(v_object)) && (NIL != list_utilities.member_plist_key_p($KS_CLASS, v_object)))) {
                    Errors.error($str_alt413$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R, v_object);
                }
            }
            {
                SubLObject ks_class = getf(v_object, $KS_CLASS, UNPROVIDED);
                SubLObject proposal_class = getf(v_object, $PROPOSAL_CLASS, UNPROVIDED);
                SubLObject ksi_class = getf(v_object, $KSI_CLASS, UNPROVIDED);
                SubLObject external_module_name = getf(v_object, $EXTERNAL_MODULE_NAME, UNPROVIDED);
                SubLObject port = getf(v_object, $PORT, UNPROVIDED);
                SubLObject cdolist_list_var = $list_alt415;
                SubLObject current_class = NIL;
                for (current_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_class = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!((NIL != current_class) && current_class.isSymbol())) {
                            Errors.error($str_alt414$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R, current_class);
                        }
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL == external_module_name) || (NIL != cyblack_message_broker.cyblack_external_module_name_p(external_module_name)))) {
                        Errors.error($str_alt416$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R, external_module_name);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL == port) || (NIL != cyblack_message_broker.cyblack_port_id_p(port)))) {
                        Errors.error($str_alt417$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R, port);
                    }
                }
                if (NIL == classes.classes_implements_p(ks_class, CYBLACK_KNOWLEDGE_SOURCE)) {
                    Errors.warn($str_alt418$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R, ks_class);
                }
                if (!((NIL == proposal_class) || (NIL != classes.classes_implements_p(proposal_class, CYBLACK_PROPOSAL)))) {
                    Errors.warn($str_alt419$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R, proposal_class);
                }
                if (!((NIL == ksi_class) || (NIL != classes.classes_implements_p(ksi_class, CYBLACK_KNOWLEDGE_SOURCE_INSTANTIATION)))) {
                    Errors.warn($str_alt420$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R, ksi_class);
                }
                {
                    SubLObject native_eks_reference = object.new_class_instance(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE);
                    cyblack_defksb_native_eks_reference_set_ks_class_method(native_eks_reference, ks_class);
                    cyblack_defksb_native_eks_reference_set_proposal_class_method(native_eks_reference, proposal_class);
                    cyblack_defksb_native_eks_reference_set_ksi_class_method(native_eks_reference, ksi_class);
                    cyblack_defksb_native_eks_reference_set_external_module_name_method(native_eks_reference, external_module_name);
                    cyblack_defksb_native_eks_reference_set_port_id_method(native_eks_reference, port);
                    return native_eks_reference;
                }
            }
        }
    }

    /**
     * Enumerated values of type CYBLACK-DEFKSB-OPTIONS.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_defksb_optionss$ = makeSymbol("*VALID-CYBLACK-DEFKSB-OPTIONSS*");

    /**
     * Returns a list of all valid members of the CYBLACK-DEFKSB-OPTIONS enumeration.
     */
    public static final SubLObject valid_cyblack_defksb_optionss() {
        return $valid_cyblack_defksb_optionss$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-DEFKSB-OPTIONS enumeration.
     */
    public static final SubLObject cyblack_defksb_options_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_defksb_optionss$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-DEFKSB-OPTIONS enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_defksb_options(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_defksb_optionss$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt370$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_DEFKSB_OPTIONS, value, CYBLACK_DEFKSB_OPTIONS);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-DEFKSB-OPTIONS enumeration.
     */
    public static final SubLObject decode_cyblack_defksb_options(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_defksb_optionss$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt372$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_DEFKSB_OPTIONS, value, CYBLACK_DEFKSB_OPTIONS);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-DEFKSB-OPTIONS enumeration.
     */
    public static final SubLObject cyblack_defksb_options_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defksb_options_p(value1)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKSB_OPTIONS_P, value1, CYBLACK_DEFKSB_OPTIONS);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defksb_options_p(value2)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKSB_OPTIONS_P, value2, CYBLACK_DEFKSB_OPTIONS);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defksb_optionss$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-DEFKSB-OPTIONS enumeration.
     */
    public static final SubLObject cyblack_defksb_options_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defksb_options_p(value1)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKSB_OPTIONS_P, value1, CYBLACK_DEFKSB_OPTIONS);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defksb_options_p(value2)) {
                    Errors.error($str_alt374$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFKSB_OPTIONS_P, value2, CYBLACK_DEFKSB_OPTIONS);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defksb_optionss$.getGlobalValue();
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

    public static final SubLObject cyblack_defksb_options_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_defksb_options_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject get_cyblack_ksb_info_ksb_body(SubLObject cyblack_ksb_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_ksb_info, THREE_INTEGER, KSB_BODY);
    }

    public static final SubLObject set_cyblack_ksb_info_ksb_body(SubLObject cyblack_ksb_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_ksb_info, value, THREE_INTEGER, KSB_BODY);
    }

    public static final SubLObject get_cyblack_ksb_info_ksb_class_name(SubLObject cyblack_ksb_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_ksb_info, TWO_INTEGER, KSB_CLASS_NAME);
    }

    public static final SubLObject set_cyblack_ksb_info_ksb_class_name(SubLObject cyblack_ksb_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_ksb_info, value, TWO_INTEGER, KSB_CLASS_NAME);
    }

    public static final SubLObject get_cyblack_ksb_info_ksb_name(SubLObject cyblack_ksb_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_ksb_info, ONE_INTEGER, KSB_NAME);
    }

    public static final SubLObject set_cyblack_ksb_info_ksb_name(SubLObject cyblack_ksb_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_ksb_info, value, ONE_INTEGER, KSB_NAME);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_ksb_info_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_ksb_info_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_KSB_INFO, KSB_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_KSB_INFO, KSB_CLASS_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_KSB_INFO, KSB_BODY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_ksb_info_p(SubLObject cyblack_ksb_info) {
        return classes.subloop_instanceof_class(cyblack_ksb_info, CYBLACK_KSB_INFO);
    }

    public static final SubLObject cyblack_ksb_info_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ksb_info_method = NIL;
            SubLObject ksb_body = get_cyblack_ksb_info_ksb_body(self);
            SubLObject ksb_class_name = get_cyblack_ksb_info_ksb_class_name(self);
            SubLObject ksb_name = get_cyblack_ksb_info_ksb_name(self);
            try {
                try {
                    object.object_initialize_method(self);
                    ksb_name = NIL;
                    ksb_class_name = NIL;
                    ksb_body = NIL;
                    sublisp_throw($sym434$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ksb_info_ksb_body(self, ksb_body);
                            set_cyblack_ksb_info_ksb_class_name(self, ksb_class_name);
                            set_cyblack_ksb_info_ksb_name(self, ksb_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ksb_info_method = Errors.handleThrowable(ccatch_env_var, $sym434$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD);
            }
            return catch_var_for_cyblack_ksb_info_method;
        }
    }

    public static final SubLObject cyblack_ksb_info_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject ksb_body = get_cyblack_ksb_info_ksb_body(self);
            SubLObject ksb_name = get_cyblack_ksb_info_ksb_name(self);
            format(stream, $str_alt437$__CYBLACK_KSB_INFO__S___S_, ksb_name, ksb_body);
            return self;
        }
    }

    public static final SubLObject cyblack_ksb_info_get_ksb_name_method(SubLObject self) {
        {
            SubLObject ksb_name = get_cyblack_ksb_info_ksb_name(self);
            return ksb_name;
        }
    }

    public static final SubLObject cyblack_ksb_info_set_ksb_name_method(SubLObject self, SubLObject new_ksb_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_ksb_info_method = NIL;
                SubLObject ksb_name = get_cyblack_ksb_info_ksb_name(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_ksb_name.isSymbol()) {
                                Errors.error($str_alt446$_SET_KSB_NAME__S____S_is_not_a_va, self, new_ksb_name);
                            }
                        }
                        ksb_name = new_ksb_name;
                        sublisp_throw($sym445$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, new_ksb_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_ksb_info_ksb_name(self, ksb_name);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_ksb_info_method = Errors.handleThrowable(ccatch_env_var, $sym445$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD);
                }
                return catch_var_for_cyblack_ksb_info_method;
            }
        }
    }

    public static final SubLObject cyblack_ksb_info_get_ksb_class_name_method(SubLObject self) {
        {
            SubLObject ksb_class_name = get_cyblack_ksb_info_ksb_class_name(self);
            return ksb_class_name;
        }
    }

    public static final SubLObject cyblack_ksb_info_set_ksb_class_name_method(SubLObject self, SubLObject new_ksb_class_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_ksb_info_method = NIL;
                SubLObject ksb_class_name = get_cyblack_ksb_info_ksb_class_name(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_ksb_class_name.isSymbol()) {
                                Errors.error($str_alt455$_SET_KSB_CLASS_NAME__S____S_is_no, self, new_ksb_class_name);
                            }
                        }
                        ksb_class_name = new_ksb_class_name;
                        sublisp_throw($sym454$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, new_ksb_class_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_ksb_info_ksb_class_name(self, ksb_class_name);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_ksb_info_method = Errors.handleThrowable(ccatch_env_var, $sym454$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD);
                }
                return catch_var_for_cyblack_ksb_info_method;
            }
        }
    }

    public static final SubLObject cyblack_ksb_info_get_ksb_body_method(SubLObject self) {
        {
            SubLObject ksb_body = get_cyblack_ksb_info_ksb_body(self);
            return ksb_body;
        }
    }

    public static final SubLObject cyblack_ksb_info_set_ksb_body_method(SubLObject self, SubLObject new_ksb_body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_ksb_info_method = NIL;
                SubLObject ksb_body = get_cyblack_ksb_info_ksb_body(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_ksb_body) || (NIL != cyblack_defksb_body_p(new_ksb_body)))) {
                                Errors.error($str_alt464$_SET_KSB_BODY__S____S_is_not_a_va, self, new_ksb_body);
                            }
                        }
                        ksb_body = new_ksb_body;
                        sublisp_throw($sym463$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, self);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_ksb_info_ksb_body(self, ksb_body);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_ksb_info_method = Errors.handleThrowable(ccatch_env_var, $sym463$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD);
                }
                return catch_var_for_cyblack_ksb_info_method;
            }
        }
    }

    public static final SubLObject cyblack_ksb_info_get_default_application_base_class_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ksb_info_method = NIL;
            SubLObject ksb_body = get_cyblack_ksb_info_ksb_body(self);
            try {
                try {
                    if (NIL != ksb_body) {
                        sublisp_throw($sym467$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, cyblack_defksb_body_get_default_application_base_class_method(ksb_body));
                    }
                    sublisp_throw($sym467$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ksb_info_ksb_body(self, ksb_body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ksb_info_method = Errors.handleThrowable(ccatch_env_var, $sym467$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD);
            }
            return catch_var_for_cyblack_ksb_info_method;
        }
    }

    public static final SubLObject cyblack_ksb_info_get_connection_class_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ksb_info_method = NIL;
            SubLObject ksb_body = get_cyblack_ksb_info_ksb_body(self);
            try {
                try {
                    if (NIL != ksb_body) {
                        if (NIL != cyblack_defksb_body_get_external_knowledge_source_classes_method(ksb_body)) {
                            sublisp_throw($sym471$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, CYBLACK_STANDARD_EXTERNAL_CONNECTION);
                        }
                    }
                    sublisp_throw($sym471$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ksb_info_ksb_body(self, ksb_body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ksb_info_method = Errors.handleThrowable(ccatch_env_var, $sym471$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD);
            }
            return catch_var_for_cyblack_ksb_info_method;
        }
    }

    public static final SubLObject cyblack_ksb_info_get_internal_module_info_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ksb_info_method = NIL;
            SubLObject ksb_body = get_cyblack_ksb_info_ksb_body(self);
            try {
                try {
                    if (NIL != ksb_body) {
                        sublisp_throw($sym475$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, cyblack_defksb_body_get_internal_module_info_list_method(ksb_body));
                    }
                    sublisp_throw($sym475$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ksb_info_ksb_body(self, ksb_body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ksb_info_method = Errors.handleThrowable(ccatch_env_var, $sym475$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD);
            }
            return catch_var_for_cyblack_ksb_info_method;
        }
    }

    public static final SubLObject cyblack_ksb_info_get_external_module_info_list_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ksb_info_method = NIL;
            SubLObject ksb_body = get_cyblack_ksb_info_ksb_body(self);
            try {
                try {
                    if (NIL != ksb_body) {
                        sublisp_throw($sym478$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, cyblack_defksb_body_get_external_module_info_list_method(ksb_body));
                    }
                    sublisp_throw($sym478$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ksb_info_ksb_body(self, ksb_body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ksb_info_method = Errors.handleThrowable(ccatch_env_var, $sym478$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD);
            }
            return catch_var_for_cyblack_ksb_info_method;
        }
    }

    public static final SubLObject cyblack_ksb_info_compile_to_ksb_installation_expressions_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ksb_info_method = NIL;
            SubLObject ksb_class_name = get_cyblack_ksb_info_ksb_class_name(self);
            try {
                try {
                    {
                        SubLObject connection_class = cyblack_ksb_info_get_connection_class_method(self);
                        SubLObject connection_class_expressions = (NIL != connection_class) ? ((SubLObject) (copy_tree(list(list(SET_CONNECTION_CLASS, SELF, list(QUOTE, connection_class)))))) : NIL;
                        SubLObject message_broker_expressions = (NIL != connection_class) ? ((SubLObject) (copy_tree($list_alt486))) : NIL;
                        SubLObject internal_module_info_list = cyblack_ksb_info_get_internal_module_info_list_method(self);
                        SubLObject external_module_info_list = cyblack_ksb_info_get_external_module_info_list_method(self);
                        SubLObject ksb_var = make_symbol($$$ksb);
                        SubLObject name_var = make_symbol($$$name);
                        SubLObject ks_class_var = make_symbol($str_alt489$ks_class);
                        SubLObject port_var = make_symbol($$$port);
                        SubLObject triplet_var = make_symbol($$$triplet);
                        SubLObject pair_var = make_symbol($str_alt492$pair_var);
                        sublisp_throw($sym482$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD, append(connection_class_expressions, message_broker_expressions, list(listS(CLET, list(list(ksb_var, list(NEW_OBJECT_INSTANCE, list(QUOTE, ksb_class_name))), bq_cons(name_var, $list_alt495), bq_cons(ks_class_var, $list_alt495), bq_cons(port_var, $list_alt495)), list(CYBLACK_SILENCE, name_var), append(NIL != external_module_info_list ? ((SubLObject) (NIL)) : copy_tree(list(list(IGNORE, port_var))), NIL != external_module_info_list ? ((SubLObject) (copy_tree(list(list(CDOLIST, list(triplet_var, list(QUOTE, external_module_info_list)), list(CSETQ, name_var, list(FIRST, triplet_var)), list(CSETQ, ks_class_var, list(SECOND, triplet_var)), list(CSETQ, port_var, list(THIRD, triplet_var)), list(INLINE_METHOD, $list_alt504, ksb_var, ks_class_var), list(INLINE_METHOD, $list_alt505, ksb_var, ks_class_var, port_var)))))) : NIL, NIL != internal_module_info_list ? ((SubLObject) (copy_tree(list(list(CDOLIST, list(pair_var, list(QUOTE, internal_module_info_list)), list(CSETQ, name_var, list(FIRST, pair_var)), list(CSETQ, ks_class_var, list(SECOND, pair_var)), list(FUNCALL_INSTANCE_METHOD, ksb_var, $list_alt507, ks_class_var)))))) : NIL, list(list(INSTALL_KNOWLEDGE_SOURCE_BATTERY, SELF, ksb_var)))))));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ksb_info_ksb_class_name(self, ksb_class_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ksb_info_method = Errors.handleThrowable(ccatch_env_var, $sym482$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD);
            }
            return catch_var_for_cyblack_ksb_info_method;
        }
    }

    public static final SubLObject cyblack_set_ksb_info(SubLObject symbol, SubLObject ksb_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != symbol) && symbol.isSymbol())) {
                    Errors.error($str_alt510$CYBLACK_SET_KSB_INFO___S_is_not_a, symbol);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == ksb_info) || (NIL != cyblack_ksb_info_p(ksb_info)))) {
                    Errors.error($str_alt511$CYBLACK_SET_KSB_INFO___S_is_not_a, ksb_info);
                }
            }
            put(symbol, $CYBLACK_KSB_INFO, ksb_info);
            return ksb_info;
        }
    }

    public static final SubLObject cyblack_get_ksb_info(SubLObject symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != symbol) && symbol.isSymbol())) {
                    Errors.error($str_alt513$CYBLACK_GET_KSB_INFO___S_is_not_a, symbol);
                }
            }
            {
                SubLObject ksb_info = get(symbol, $CYBLACK_KSB_INFO, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL == ksb_info) || (NIL != cyblack_ksb_info_p(ksb_info)))) {
                        Errors.error($str_alt514$CYBLACK_GET_KSB_INFO___S_refers_t, symbol, ksb_info);
                    }
                }
                return ksb_info;
            }
        }
    }

    public static final SubLObject cyblack_parse_and_set_ksb_info(SubLObject battery_name, SubLObject defksb_body) {
        {
            SubLObject parsed_body = parse_cyblack_defksb_body(defksb_body);
            SubLObject ksb_info = object.new_class_instance(CYBLACK_KSB_INFO);
            cyblack_ksb_info_set_ksb_name_method(ksb_info, battery_name);
            cyblack_ksb_info_set_ksb_class_name_method(ksb_info, battery_name);
            cyblack_ksb_info_set_ksb_body_method(ksb_info, parsed_body);
            cyblack_set_ksb_info(battery_name, ksb_info);
            return ksb_info;
        }
    }

    public static final SubLObject define_knowledge_source_battery(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt515);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject battery_name = NIL;
                        SubLObject options = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt515);
                        battery_name = current.first();
                        current = current.rest();
                        options = current;
                        current = temp;
                        {
                            SubLObject defksb_body = current;
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (!((NIL != battery_name) && battery_name.isSymbol())) {
                                    Errors.error($str_alt516$DEFINE_KNOWLEDGE_SOURCE_BATTERY__, battery_name);
                                }
                            }
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == cyblack_defksb_options_plist_p(options)) {
                                    Errors.error($str_alt517$DEFINE_KNOWLEDGE_SOURCE_BATTERY__, options);
                                }
                            }
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == cyblack_defksb_body_alist_p(defksb_body)) {
                                    Errors.error($str_alt518$DEFINE_KNOWLEDGE_SOURCE_BATTERY__, defksb_body);
                                }
                            }
                            {
                                SubLObject ksb_info = cyblack_parse_and_set_ksb_info(battery_name, defksb_body);
                                SubLObject parsed_ksb_body = (NIL != ksb_info) ? ((SubLObject) (cyblack_ksb_info_get_ksb_body_method(ksb_info))) : NIL;
                                SubLObject v_extends = getf(options, $EXTENDS, UNPROVIDED);
                                SubLObject v_implements = getf(options, $IMPLEMENTS, UNPROVIDED);
                                SubLObject internal_knowledge_sources = (NIL != parsed_ksb_body) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(parsed_ksb_body, GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES))) : NIL;
                                SubLObject external_knowledge_sources = (NIL != parsed_ksb_body) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(parsed_ksb_body, GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES))) : NIL;
                                SubLObject internal_knowledge_source_additions = NIL;
                                SubLObject external_knowledge_source_additions = NIL;
                                SubLObject eks_port_id_associations = NIL;
                                SubLObject current_port_id = NIL;
                                if (!((NIL == v_extends) || (NIL != classes.subclassp(v_extends, CYBLACK_DEFKSB_BASE)))) {
                                    Errors.warn($str_alt521$DEFINE_KNOWLEDGE_SOURCE_BATTERY__, v_extends);
                                }
                                {
                                    SubLObject list_expression = internal_knowledge_sources;
                                    if (NIL == list_expression) {
                                        internal_knowledge_source_additions = NIL;
                                    } else
                                        if (list_expression.isAtom()) {
                                            internal_knowledge_source_additions = list(list_expression);
                                        } else
                                            if (NIL == list_expression.rest()) {
                                                {
                                                    SubLObject knowledge_source = list_expression.first();
                                                    internal_knowledge_source_additions = list(copy_tree(list(ADD_INTERNAL_KNOWLEDGE_SOURCE_CLASS, SELF, list(QUOTE, knowledge_source))));
                                                }
                                            } else {
                                                {
                                                    SubLObject tail_cons = NIL;
                                                    SubLObject result = NIL;
                                                    {
                                                        SubLObject knowledge_source = list_expression.first();
                                                        internal_knowledge_source_additions = list(copy_tree(list(ADD_INTERNAL_KNOWLEDGE_SOURCE_CLASS, SELF, list(QUOTE, knowledge_source))));
                                                        tail_cons = internal_knowledge_source_additions;
                                                    }
                                                    {
                                                        SubLObject cdolist_list_var = list_expression.rest();
                                                        SubLObject knowledge_source = NIL;
                                                        for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                                                            result = list(copy_tree(list(ADD_INTERNAL_KNOWLEDGE_SOURCE_CLASS, SELF, list(QUOTE, knowledge_source))));
                                                            rplacd(tail_cons, result);
                                                            tail_cons = result;
                                                        }
                                                    }
                                                }
                                            }


                                }
                                {
                                    SubLObject list_expression = external_knowledge_sources;
                                    if (NIL == list_expression) {
                                        external_knowledge_source_additions = NIL;
                                    } else
                                        if (list_expression.isAtom()) {
                                            external_knowledge_source_additions = list(list_expression);
                                        } else
                                            if (NIL == list_expression.rest()) {
                                                {
                                                    SubLObject knowledge_source = list_expression.first();
                                                    external_knowledge_source_additions = list(copy_tree(list(ADD_EXTERNAL_KNOWLEDGE_SOURCE_CLASS, SELF, list(QUOTE, knowledge_source))));
                                                }
                                            } else {
                                                {
                                                    SubLObject tail_cons = NIL;
                                                    SubLObject result = NIL;
                                                    {
                                                        SubLObject knowledge_source = list_expression.first();
                                                        external_knowledge_source_additions = list(copy_tree(list(ADD_EXTERNAL_KNOWLEDGE_SOURCE_CLASS, SELF, list(QUOTE, knowledge_source))));
                                                        tail_cons = external_knowledge_source_additions;
                                                    }
                                                    {
                                                        SubLObject cdolist_list_var = list_expression.rest();
                                                        SubLObject knowledge_source = NIL;
                                                        for (knowledge_source = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , knowledge_source = cdolist_list_var.first()) {
                                                            result = list(copy_tree(list(ADD_EXTERNAL_KNOWLEDGE_SOURCE_CLASS, SELF, list(QUOTE, knowledge_source))));
                                                            rplacd(tail_cons, result);
                                                            tail_cons = result;
                                                        }
                                                    }
                                                }
                                            }


                                }
                                {
                                    SubLObject cdolist_list_var = external_knowledge_sources;
                                    SubLObject eks_class = NIL;
                                    for (eks_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , eks_class = cdolist_list_var.first()) {
                                        current_port_id = methods.funcall_instance_method_with_1_args(parsed_ksb_body, GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE, eks_class);
                                        if (NIL != current_port_id) {
                                            eks_port_id_associations = cons(copy_tree(list(ADD_EKSC_TO_PORT_ID_ASSOCIATION, SELF, list(QUOTE, eks_class), list(QUOTE, current_port_id))), eks_port_id_associations);
                                        }
                                    }
                                }
                                return list(PROGN, listS(DEFINE_CLASS, list(battery_name, $EXTENDS, NIL != v_extends ? ((SubLObject) (v_extends)) : CYBLACK_DEFKSB_BASE, $IMPLEMENTS, copy_list(v_implements)), $list_alt527), listS(DEF_INSTANCE_METHOD, listS(INITIALIZE, battery_name, $list_alt37), NIL, $list_alt529, append(internal_knowledge_source_additions, external_knowledge_source_additions, nreverse(eks_port_id_associations), $list_alt530)), listS(DEF_INSTANCE_METHOD, listS(ON_STARTUP, battery_name, $list_alt24), NIL, $list_alt531, append(cyblack_defksb_body_get_on_startup_body_method(parsed_ksb_body), $list_alt152)), listS(DEF_INSTANCE_METHOD, listS(ON_SHUTDOWN, battery_name, $list_alt24), NIL, $list_alt533, append(cyblack_defksb_body_get_on_shutdown_body_method(parsed_ksb_body), $list_alt152)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject declare_cyblack_defksb_file() {
        declareFunction("subloop_reserved_initialize_cyblack_defksb_base_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-BASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_base_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-BASE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defksb_base_p", "CYBLACK-DEFKSB-BASE-P", 1, 0, false);
        declareFunction("cyblack_defksb_base_on_startup_method", "CYBLACK-DEFKSB-BASE-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defksb_expression_children", "GET-CYBLACK-DEFKSB-EXPRESSION-CHILDREN", 1, 0, false);
        declareFunction("set_cyblack_defksb_expression_children", "SET-CYBLACK-DEFKSB-EXPRESSION-CHILDREN", 2, 0, false);
        declareFunction("get_cyblack_defksb_expression_parent", "GET-CYBLACK-DEFKSB-EXPRESSION-PARENT", 1, 0, false);
        declareFunction("set_cyblack_defksb_expression_parent", "SET-CYBLACK-DEFKSB-EXPRESSION-PARENT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defksb_expression_p", "CYBLACK-DEFKSB-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defksb_expression_initialize_method", "CYBLACK-DEFKSB-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_expression_print_method", "CYBLACK-DEFKSB-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defksb_expression_get_parent_method", "CYBLACK-DEFKSB-EXPRESSION-GET-PARENT-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_expression_set_parent_method", "CYBLACK-DEFKSB-EXPRESSION-SET-PARENT-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_expression_add_child_method", "CYBLACK-DEFKSB-EXPRESSION-ADD-CHILD-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_expression_get_children_method", "CYBLACK-DEFKSB-EXPRESSION-GET-CHILDREN-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defksb_body_on_shutdown_body", "GET-CYBLACK-DEFKSB-BODY-ON-SHUTDOWN-BODY", 1, 0, false);
        declareFunction("set_cyblack_defksb_body_on_shutdown_body", "SET-CYBLACK-DEFKSB-BODY-ON-SHUTDOWN-BODY", 2, 0, false);
        declareFunction("get_cyblack_defksb_body_on_startup_body", "GET-CYBLACK-DEFKSB-BODY-ON-STARTUP-BODY", 1, 0, false);
        declareFunction("set_cyblack_defksb_body_on_startup_body", "SET-CYBLACK-DEFKSB-BODY-ON-STARTUP-BODY", 2, 0, false);
        declareFunction("get_cyblack_defksb_body_external_knowledge_source_expressions", "GET-CYBLACK-DEFKSB-BODY-EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS", 1, 0, false);
        declareFunction("set_cyblack_defksb_body_external_knowledge_source_expressions", "SET-CYBLACK-DEFKSB-BODY-EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS", 2, 0, false);
        declareFunction("get_cyblack_defksb_body_internal_knowledge_source_expressions", "GET-CYBLACK-DEFKSB-BODY-INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS", 1, 0, false);
        declareFunction("set_cyblack_defksb_body_internal_knowledge_source_expressions", "SET-CYBLACK-DEFKSB-BODY-INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_body_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-BODY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_body_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-BODY-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defksb_body_p", "CYBLACK-DEFKSB-BODY-P", 1, 0, false);
        declareFunction("cyblack_defksb_body_initialize_method", "CYBLACK-DEFKSB-BODY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_body_print_method", "CYBLACK-DEFKSB-BODY-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defksb_body_get_internal_knowledge_source_expressions_method", "CYBLACK-DEFKSB-BODY-GET-INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_body_set_internal_knowledge_source_expressions_method", "CYBLACK-DEFKSB-BODY-SET-INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_body_get_external_knowledge_source_expressions_method", "CYBLACK-DEFKSB-BODY-GET-EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_body_set_external_knowledge_source_expressions_method", "CYBLACK-DEFKSB-BODY-SET-EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_body_get_on_startup_body_method", "CYBLACK-DEFKSB-BODY-GET-ON-STARTUP-BODY-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_body_set_on_startup_body_method", "CYBLACK-DEFKSB-BODY-SET-ON-STARTUP-BODY-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_body_get_on_shutdown_body_method", "CYBLACK-DEFKSB-BODY-GET-ON-SHUTDOWN-BODY-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_body_set_on_shutdown_body_method", "CYBLACK-DEFKSB-BODY-SET-ON-SHUTDOWN-BODY-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_body_get_internal_knowledge_source_classes_method", "CYBLACK-DEFKSB-BODY-GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_body_get_external_knowledge_source_classes_method", "CYBLACK-DEFKSB-BODY-GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_body_get_knowledge_source_classes_method", "CYBLACK-DEFKSB-BODY-GET-KNOWLEDGE-SOURCE-CLASSES-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_body_get_port_id_given_external_knowledge_source_method", "CYBLACK-DEFKSB-BODY-GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_body_get_default_application_base_class_method", "CYBLACK-DEFKSB-BODY-GET-DEFAULT-APPLICATION-BASE-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_body_get_internal_module_info_list_method", "CYBLACK-DEFKSB-BODY-GET-INTERNAL-MODULE-INFO-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_body_get_external_module_info_list_method", "CYBLACK-DEFKSB-BODY-GET-EXTERNAL-MODULE-INFO-LIST-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_ks_reference_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-KS-REFERENCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_ks_reference_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-KS-REFERENCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defksb_ks_reference_p", "CYBLACK-DEFKSB-KS-REFERENCE-P", 1, 0, false);
        declareFunction("cyblack_defksb_ks_reference_get_internal_knowledge_source_classes_method", "CYBLACK-DEFKSB-KS-REFERENCE-GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_ks_reference_get_external_knowledge_source_classes_method", "CYBLACK-DEFKSB-KS-REFERENCE-GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_ks_reference_get_info_method", "CYBLACK-DEFKSB-KS-REFERENCE-GET-INFO-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_iks_reference_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-IKS-REFERENCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_iks_reference_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-IKS-REFERENCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defksb_iks_reference_p", "CYBLACK-DEFKSB-IKS-REFERENCE-P", 1, 0, false);
        declareFunction("cyblack_defksb_defks_ks_reference_p", "CYBLACK-DEFKSB-DEFKS-KS-REFERENCE-P", 1, 0, false);
        declareFunction("cyblack_defksb_native_ks_reference_p", "CYBLACK-DEFKSB-NATIVE-KS-REFERENCE-P", 1, 0, false);
        declareFunction("get_cyblack_defksb_defks_iks_reference_ks_name", "GET-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-KS-NAME", 1, 0, false);
        declareFunction("set_cyblack_defksb_defks_iks_reference_ks_name", "SET-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-KS-NAME", 2, 0, false);
        declareFunction("cyblack_defksb_defks_iks_reference_set_ks_method", "CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-SET-KS-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_defks_iks_reference_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_defks_iks_reference_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defksb_defks_iks_reference_p", "CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-P", 1, 0, false);
        declareFunction("cyblack_defksb_defks_iks_reference_initialize_method", "CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_defks_iks_reference_print_method", "CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defksb_defks_iks_reference_internal_set_ks_method", "CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-INTERNAL-SET-KS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_defks_iks_reference_get_ks_method", "CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-GET-KS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_defks_iks_reference_get_internal_knowledge_source_class_method", "CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-GET-INTERNAL-KNOWLEDGE-SOURCE-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_defks_iks_reference_get_internal_knowledge_source_classes_method", "CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_defks_iks_reference_get_info_method", "CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-GET-INFO-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defksb_native_iks_reference_ksi_class", "GET-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-KSI-CLASS", 1, 0, false);
        declareFunction("set_cyblack_defksb_native_iks_reference_ksi_class", "SET-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-KSI-CLASS", 2, 0, false);
        declareFunction("get_cyblack_defksb_native_iks_reference_proposal_class", "GET-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("set_cyblack_defksb_native_iks_reference_proposal_class", "SET-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-PROPOSAL-CLASS", 2, 0, false);
        declareFunction("get_cyblack_defksb_native_iks_reference_ks_class", "GET-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-KS-CLASS", 1, 0, false);
        declareFunction("set_cyblack_defksb_native_iks_reference_ks_class", "SET-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-KS-CLASS", 2, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_set_ksi_class_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-SET-KSI-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_set_proposal_class_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-SET-PROPOSAL-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_set_ks_class_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-SET-KS-CLASS-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_native_iks_reference_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_native_iks_reference_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_p", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-P", 1, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_initialize_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_print_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_internal_set_ks_class_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-INTERNAL-SET-KS-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_internal_set_proposal_class_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-INTERNAL-SET-PROPOSAL-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_internal_set_ksi_class_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-INTERNAL-SET-KSI-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_get_ks_class_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-GET-KS-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_get_proposal_class_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-GET-PROPOSAL-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_get_ksi_class_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-GET-KSI-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_get_internal_knowledge_source_classes_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_iks_reference_get_info_method", "CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-GET-INFO-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_external_ks_reference_p", "CYBLACK-DEFKSB-EXTERNAL-KS-REFERENCE-P", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_eks_reference_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-EKS-REFERENCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_eks_reference_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-EKS-REFERENCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defksb_eks_reference_p", "CYBLACK-DEFKSB-EKS-REFERENCE-P", 1, 0, false);
        declareFunction("cyblack_defksb_eks_reference_get_port_id_given_external_knowledge_source_method", "CYBLACK-DEFKSB-EKS-REFERENCE-GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("get_cyblack_defksb_defks_eks_reference_ks_name", "GET-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-KS-NAME", 1, 0, false);
        declareFunction("set_cyblack_defksb_defks_eks_reference_ks_name", "SET-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-KS-NAME", 2, 0, false);
        declareFunction("get_cyblack_defksb_defks_eks_reference_port_id", "GET-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-PORT-ID", 1, 0, false);
        declareFunction("set_cyblack_defksb_defks_eks_reference_port_id", "SET-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-PORT-ID", 2, 0, false);
        declareFunction("get_cyblack_defksb_defks_eks_reference_external_module_name", "GET-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-EXTERNAL-MODULE-NAME", 1, 0, false);
        declareFunction("set_cyblack_defksb_defks_eks_reference_external_module_name", "SET-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-EXTERNAL-MODULE-NAME", 2, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_set_ks_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-SET-KS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_set_port_id_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-SET-PORT-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_set_external_module_name_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-SET-EXTERNAL-MODULE-NAME-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_defks_eks_reference_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_defks_eks_reference_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_p", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-P", 1, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_initialize_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_print_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_get_external_knowledge_source_class_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_get_external_knowledge_source_classes_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_get_port_id_given_external_knowledge_source_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_get_info_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-INFO-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_internal_set_external_module_name_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-INTERNAL-SET-EXTERNAL-MODULE-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_internal_set_port_id_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-INTERNAL-SET-PORT-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_get_external_module_name_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-EXTERNAL-MODULE-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_get_port_id_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-PORT-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_internal_set_ks_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-INTERNAL-SET-KS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_defks_eks_reference_get_ks_method", "CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-KS-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defksb_native_eks_reference_ksi_class", "GET-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-KSI-CLASS", 1, 0, false);
        declareFunction("set_cyblack_defksb_native_eks_reference_ksi_class", "SET-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-KSI-CLASS", 2, 0, false);
        declareFunction("get_cyblack_defksb_native_eks_reference_proposal_class", "GET-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("set_cyblack_defksb_native_eks_reference_proposal_class", "SET-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-PROPOSAL-CLASS", 2, 0, false);
        declareFunction("get_cyblack_defksb_native_eks_reference_ks_class", "GET-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-KS-CLASS", 1, 0, false);
        declareFunction("set_cyblack_defksb_native_eks_reference_ks_class", "SET-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-KS-CLASS", 2, 0, false);
        declareFunction("get_cyblack_defksb_native_eks_reference_port_id", "GET-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-PORT-ID", 1, 0, false);
        declareFunction("set_cyblack_defksb_native_eks_reference_port_id", "SET-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-PORT-ID", 2, 0, false);
        declareFunction("get_cyblack_defksb_native_eks_reference_external_module_name", "GET-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-EXTERNAL-MODULE-NAME", 1, 0, false);
        declareFunction("set_cyblack_defksb_native_eks_reference_external_module_name", "SET-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-EXTERNAL-MODULE-NAME", 2, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_set_ksi_class_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-SET-KSI-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_set_proposal_class_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-SET-PROPOSAL-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_set_ks_class_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-SET-KS-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_set_port_id_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-SET-PORT-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_set_external_module_name_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-SET-EXTERNAL-MODULE-NAME-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_native_eks_reference_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defksb_native_eks_reference_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_p", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-P", 1, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_initialize_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_print_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_get_external_knowledge_source_classes_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_get_port_id_given_external_knowledge_source_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_internal_set_external_module_name_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INTERNAL-SET-EXTERNAL-MODULE-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_internal_set_port_id_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INTERNAL-SET-PORT-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_get_external_module_name_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-EXTERNAL-MODULE-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_get_port_id_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-PORT-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_internal_set_ks_class_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INTERNAL-SET-KS-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_internal_set_proposal_class_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INTERNAL-SET-PROPOSAL-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_internal_set_ksi_class_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INTERNAL-SET-KSI-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_get_ks_class_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-KS-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_get_proposal_class_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-PROPOSAL-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_get_ksi_class_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-KSI-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defksb_native_eks_reference_get_info_method", "CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-INFO-METHOD", 1, 0, false);
        declareFunction("valid_cyblack_defksb_body_keys", "VALID-CYBLACK-DEFKSB-BODY-KEYS", 0, 0, false);
        declareFunction("cyblack_defksb_body_key_p", "CYBLACK-DEFKSB-BODY-KEY-P", 1, 0, false);
        declareFunction("encode_cyblack_defksb_body_key", "ENCODE-CYBLACK-DEFKSB-BODY-KEY", 1, 0, false);
        declareFunction("decode_cyblack_defksb_body_key", "DECODE-CYBLACK-DEFKSB-BODY-KEY", 1, 0, false);
        declareFunction("cyblack_defksb_body_key_less_p", "CYBLACK-DEFKSB-BODY-KEY-LESS-P", 2, 0, false);
        declareFunction("cyblack_defksb_body_key_greater_p", "CYBLACK-DEFKSB-BODY-KEY-GREATER-P", 2, 0, false);
        declareFunction("cyblack_defksb_body_alist_p", "CYBLACK-DEFKSB-BODY-ALIST-P", 1, 0, false);
        declareFunction("parse_cyblack_defksb_body", "PARSE-CYBLACK-DEFKSB-BODY", 1, 0, false);
        declareFunction("parse_cyblack_defksb_internal_ks_expressions", "PARSE-CYBLACK-DEFKSB-INTERNAL-KS-EXPRESSIONS", 1, 0, false);
        declareFunction("parse_cyblack_defksb_iks_reference", "PARSE-CYBLACK-DEFKSB-IKS-REFERENCE", 1, 0, false);
        declareFunction("parse_cyblack_defksb_defks_iks_reference", "PARSE-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE", 1, 0, false);
        declareFunction("valid_cyblack_native_iks_reference_keys", "VALID-CYBLACK-NATIVE-IKS-REFERENCE-KEYS", 0, 0, false);
        declareFunction("cyblack_native_iks_reference_key_p", "CYBLACK-NATIVE-IKS-REFERENCE-KEY-P", 1, 0, false);
        declareFunction("encode_cyblack_native_iks_reference_key", "ENCODE-CYBLACK-NATIVE-IKS-REFERENCE-KEY", 1, 0, false);
        declareFunction("decode_cyblack_native_iks_reference_key", "DECODE-CYBLACK-NATIVE-IKS-REFERENCE-KEY", 1, 0, false);
        declareFunction("cyblack_native_iks_reference_key_less_p", "CYBLACK-NATIVE-IKS-REFERENCE-KEY-LESS-P", 2, 0, false);
        declareFunction("cyblack_native_iks_reference_key_greater_p", "CYBLACK-NATIVE-IKS-REFERENCE-KEY-GREATER-P", 2, 0, false);
        declareFunction("cyblack_native_iks_reference_plist_p", "CYBLACK-NATIVE-IKS-REFERENCE-PLIST-P", 1, 0, false);
        declareFunction("parse_cyblack_defksb_native_iks_reference", "PARSE-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE", 1, 0, false);
        declareFunction("parse_cyblack_defksb_external_ks_expressions", "PARSE-CYBLACK-DEFKSB-EXTERNAL-KS-EXPRESSIONS", 1, 0, false);
        declareFunction("parse_cyblack_defksb_eks_reference", "PARSE-CYBLACK-DEFKSB-EKS-REFERENCE", 1, 0, false);
        declareFunction("valid_cyblack_defks_eks_keys", "VALID-CYBLACK-DEFKS-EKS-KEYS", 0, 0, false);
        declareFunction("cyblack_defks_eks_key_p", "CYBLACK-DEFKS-EKS-KEY-P", 1, 0, false);
        declareFunction("encode_cyblack_defks_eks_key", "ENCODE-CYBLACK-DEFKS-EKS-KEY", 1, 0, false);
        declareFunction("decode_cyblack_defks_eks_key", "DECODE-CYBLACK-DEFKS-EKS-KEY", 1, 0, false);
        declareFunction("cyblack_defks_eks_key_less_p", "CYBLACK-DEFKS-EKS-KEY-LESS-P", 2, 0, false);
        declareFunction("cyblack_defks_eks_key_greater_p", "CYBLACK-DEFKS-EKS-KEY-GREATER-P", 2, 0, false);
        declareFunction("cyblack_defks_eks_reference_plist_p", "CYBLACK-DEFKS-EKS-REFERENCE-PLIST-P", 1, 0, false);
        declareFunction("parse_cyblack_defksb_defks_eks_reference", "PARSE-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE", 1, 0, false);
        declareFunction("valid_cyblack_native_eks_keys", "VALID-CYBLACK-NATIVE-EKS-KEYS", 0, 0, false);
        declareFunction("cyblack_native_eks_key_p", "CYBLACK-NATIVE-EKS-KEY-P", 1, 0, false);
        declareFunction("encode_cyblack_native_eks_key", "ENCODE-CYBLACK-NATIVE-EKS-KEY", 1, 0, false);
        declareFunction("decode_cyblack_native_eks_key", "DECODE-CYBLACK-NATIVE-EKS-KEY", 1, 0, false);
        declareFunction("cyblack_native_eks_key_less_p", "CYBLACK-NATIVE-EKS-KEY-LESS-P", 2, 0, false);
        declareFunction("cyblack_native_eks_key_greater_p", "CYBLACK-NATIVE-EKS-KEY-GREATER-P", 2, 0, false);
        declareFunction("cyblack_native_eks_reference_plist_p", "CYBLACK-NATIVE-EKS-REFERENCE-PLIST-P", 1, 0, false);
        declareFunction("parse_cyblack_defksb_native_eks_reference", "PARSE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE", 1, 0, false);
        declareFunction("valid_cyblack_defksb_optionss", "VALID-CYBLACK-DEFKSB-OPTIONSS", 0, 0, false);
        declareFunction("cyblack_defksb_options_p", "CYBLACK-DEFKSB-OPTIONS-P", 1, 0, false);
        declareFunction("encode_cyblack_defksb_options", "ENCODE-CYBLACK-DEFKSB-OPTIONS", 1, 0, false);
        declareFunction("decode_cyblack_defksb_options", "DECODE-CYBLACK-DEFKSB-OPTIONS", 1, 0, false);
        declareFunction("cyblack_defksb_options_less_p", "CYBLACK-DEFKSB-OPTIONS-LESS-P", 2, 0, false);
        declareFunction("cyblack_defksb_options_greater_p", "CYBLACK-DEFKSB-OPTIONS-GREATER-P", 2, 0, false);
        declareFunction("cyblack_defksb_options_plist_p", "CYBLACK-DEFKSB-OPTIONS-PLIST-P", 1, 0, false);
        declareFunction("get_cyblack_ksb_info_ksb_body", "GET-CYBLACK-KSB-INFO-KSB-BODY", 1, 0, false);
        declareFunction("set_cyblack_ksb_info_ksb_body", "SET-CYBLACK-KSB-INFO-KSB-BODY", 2, 0, false);
        declareFunction("get_cyblack_ksb_info_ksb_class_name", "GET-CYBLACK-KSB-INFO-KSB-CLASS-NAME", 1, 0, false);
        declareFunction("set_cyblack_ksb_info_ksb_class_name", "SET-CYBLACK-KSB-INFO-KSB-CLASS-NAME", 2, 0, false);
        declareFunction("get_cyblack_ksb_info_ksb_name", "GET-CYBLACK-KSB-INFO-KSB-NAME", 1, 0, false);
        declareFunction("set_cyblack_ksb_info_ksb_name", "SET-CYBLACK-KSB-INFO-KSB-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_ksb_info_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-KSB-INFO-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_ksb_info_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-KSB-INFO-INSTANCE", 1, 0, false);
        declareFunction("cyblack_ksb_info_p", "CYBLACK-KSB-INFO-P", 1, 0, false);
        declareFunction("cyblack_ksb_info_initialize_method", "CYBLACK-KSB-INFO-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_ksb_info_print_method", "CYBLACK-KSB-INFO-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_ksb_info_get_ksb_name_method", "CYBLACK-KSB-INFO-GET-KSB-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_ksb_info_set_ksb_name_method", "CYBLACK-KSB-INFO-SET-KSB-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_ksb_info_get_ksb_class_name_method", "CYBLACK-KSB-INFO-GET-KSB-CLASS-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_ksb_info_set_ksb_class_name_method", "CYBLACK-KSB-INFO-SET-KSB-CLASS-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_ksb_info_get_ksb_body_method", "CYBLACK-KSB-INFO-GET-KSB-BODY-METHOD", 1, 0, false);
        declareFunction("cyblack_ksb_info_set_ksb_body_method", "CYBLACK-KSB-INFO-SET-KSB-BODY-METHOD", 2, 0, false);
        declareFunction("cyblack_ksb_info_get_default_application_base_class_method", "CYBLACK-KSB-INFO-GET-DEFAULT-APPLICATION-BASE-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_ksb_info_get_connection_class_method", "CYBLACK-KSB-INFO-GET-CONNECTION-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_ksb_info_get_internal_module_info_list_method", "CYBLACK-KSB-INFO-GET-INTERNAL-MODULE-INFO-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_ksb_info_get_external_module_info_list_method", "CYBLACK-KSB-INFO-GET-EXTERNAL-MODULE-INFO-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_ksb_info_compile_to_ksb_installation_expressions_method", "CYBLACK-KSB-INFO-COMPILE-TO-KSB-INSTALLATION-EXPRESSIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_set_ksb_info", "CYBLACK-SET-KSB-INFO", 2, 0, false);
        declareFunction("cyblack_get_ksb_info", "CYBLACK-GET-KSB-INFO", 1, 0, false);
        declareFunction("cyblack_parse_and_set_ksb_info", "CYBLACK-PARSE-AND-SET-KSB-INFO", 2, 0, false);
        declareMacro("define_knowledge_source_battery", "DEFINE-KNOWLEDGE-SOURCE-BATTERY");
        return NIL;
    }

    public static final SubLObject init_cyblack_defksb_file() {
        defconstant("*VALID-CYBLACK-DEFKSB-BODY-KEYS*", $list_alt368);
        defconstant("*VALID-CYBLACK-NATIVE-IKS-REFERENCE-KEYS*", $list_alt387);
        defconstant("*VALID-CYBLACK-DEFKS-EKS-KEYS*", $list_alt397);
        defconstant("*VALID-CYBLACK-NATIVE-EKS-KEYS*", $list_alt408);
        defconstant("*VALID-CYBLACK-DEFKSB-OPTIONSS*", $list_alt421);
        return NIL;
    }

    public static final SubLObject setup_cyblack_defksb_file() {
                classes.subloop_new_class(CYBLACK_DEFKSB_BASE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_BATTERY, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFKSB_BASE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFKSB_BASE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_BASE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFKSB_BASE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_BASE_INSTANCE);
        subloop_reserved_initialize_cyblack_defksb_base_class(CYBLACK_DEFKSB_BASE);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_DEFKSB_BASE, $list_alt24, NIL, $list_alt25);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BASE, ON_STARTUP, CYBLACK_DEFKSB_BASE_ON_STARTUP_METHOD);
        classes.subloop_new_class(CYBLACK_DEFKSB_EXPRESSION, OBJECT, NIL, NIL, $list_alt31);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFKSB_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFKSB_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_EXPRESSION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFKSB_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_EXPRESSION_INSTANCE);
        subloop_reserved_initialize_cyblack_defksb_expression_class(CYBLACK_DEFKSB_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFKSB_EXPRESSION, $list_alt37, NIL, $list_alt38);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_EXPRESSION, INITIALIZE, CYBLACK_DEFKSB_EXPRESSION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFKSB_EXPRESSION, $list_alt42, $list_alt43, $list_alt44);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_EXPRESSION, PRINT, CYBLACK_DEFKSB_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PARENT, CYBLACK_DEFKSB_EXPRESSION, $list_alt42, NIL, $list_alt47);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_EXPRESSION, GET_PARENT, CYBLACK_DEFKSB_EXPRESSION_GET_PARENT_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT, CYBLACK_DEFKSB_EXPRESSION, $list_alt24, $list_alt50, $list_alt51);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_EXPRESSION, SET_PARENT, CYBLACK_DEFKSB_EXPRESSION_SET_PARENT_METHOD);
        methods.methods_incorporate_instance_method(ADD_CHILD, CYBLACK_DEFKSB_EXPRESSION, $list_alt42, $list_alt56, $list_alt57);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_EXPRESSION, ADD_CHILD, CYBLACK_DEFKSB_EXPRESSION_ADD_CHILD_METHOD);
        methods.methods_incorporate_instance_method(GET_CHILDREN, CYBLACK_DEFKSB_EXPRESSION, $list_alt42, NIL, $list_alt60);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_EXPRESSION, GET_CHILDREN, CYBLACK_DEFKSB_EXPRESSION_GET_CHILDREN_METHOD);
        classes.subloop_new_class(CYBLACK_DEFKSB_BODY, CYBLACK_DEFKSB_EXPRESSION, NIL, NIL, $list_alt63);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFKSB_BODY, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFKSB_BODY, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_BODY_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFKSB_BODY, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_BODY_INSTANCE);
        subloop_reserved_initialize_cyblack_defksb_body_class(CYBLACK_DEFKSB_BODY);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFKSB_BODY, $list_alt37, NIL, $list_alt70);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, INITIALIZE, CYBLACK_DEFKSB_BODY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFKSB_BODY, $list_alt24, $list_alt43, $list_alt73);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, PRINT, CYBLACK_DEFKSB_BODY_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS, CYBLACK_DEFKSB_BODY, $list_alt42, NIL, $list_alt84);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, GET_INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS, $sym85$CYBLACK_DEFKSB_BODY_GET_INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS_MET);
        methods.methods_incorporate_instance_method(SET_INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS, CYBLACK_DEFKSB_BODY, $list_alt24, $list_alt87, $list_alt88);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, SET_INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS, $sym90$CYBLACK_DEFKSB_BODY_SET_INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS_MET);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS, CYBLACK_DEFKSB_BODY, $list_alt42, NIL, $list_alt92);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, GET_EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS, $sym93$CYBLACK_DEFKSB_BODY_GET_EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS_MET);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS, CYBLACK_DEFKSB_BODY, $list_alt24, $list_alt87, $list_alt95);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, SET_EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS, $sym97$CYBLACK_DEFKSB_BODY_SET_EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS_MET);
        methods.methods_incorporate_instance_method(GET_ON_STARTUP_BODY, CYBLACK_DEFKSB_BODY, $list_alt42, NIL, $list_alt99);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, GET_ON_STARTUP_BODY, CYBLACK_DEFKSB_BODY_GET_ON_STARTUP_BODY_METHOD);
        methods.methods_incorporate_instance_method(SET_ON_STARTUP_BODY, CYBLACK_DEFKSB_BODY, $list_alt24, $list_alt102, $list_alt103);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, SET_ON_STARTUP_BODY, CYBLACK_DEFKSB_BODY_SET_ON_STARTUP_BODY_METHOD);
        methods.methods_incorporate_instance_method(GET_ON_SHUTDOWN_BODY, CYBLACK_DEFKSB_BODY, $list_alt42, NIL, $list_alt109);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, GET_ON_SHUTDOWN_BODY, CYBLACK_DEFKSB_BODY_GET_ON_SHUTDOWN_BODY_METHOD);
        methods.methods_incorporate_instance_method(SET_ON_SHUTDOWN_BODY, CYBLACK_DEFKSB_BODY, $list_alt24, $list_alt102, $list_alt112);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, SET_ON_SHUTDOWN_BODY, CYBLACK_DEFKSB_BODY_SET_ON_SHUTDOWN_BODY_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_BODY, $list_alt24, NIL, $list_alt118);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_BODY_GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_BODY, $list_alt24, NIL, $list_alt122);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_BODY_GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES_METHOD);
        methods.methods_incorporate_instance_method(GET_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_BODY, $list_alt24, NIL, $list_alt126);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, GET_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_BODY_GET_KNOWLEDGE_SOURCE_CLASSES_METHOD);
        methods.methods_incorporate_instance_method(GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_DEFKSB_BODY, $list_alt24, $list_alt129, $list_alt130);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE, $sym132$CYBLACK_DEFKSB_BODY_GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE_M);
        methods.methods_incorporate_instance_method(GET_DEFAULT_APPLICATION_BASE_CLASS, CYBLACK_DEFKSB_BODY, $list_alt24, NIL, $list_alt134);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, GET_DEFAULT_APPLICATION_BASE_CLASS, CYBLACK_DEFKSB_BODY_GET_DEFAULT_APPLICATION_BASE_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERNAL_MODULE_INFO_LIST, CYBLACK_DEFKSB_BODY, $list_alt24, NIL, $list_alt140);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, GET_INTERNAL_MODULE_INFO_LIST, CYBLACK_DEFKSB_BODY_GET_INTERNAL_MODULE_INFO_LIST_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_INFO_LIST, CYBLACK_DEFKSB_BODY, $list_alt24, NIL, $list_alt145);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_BODY, GET_EXTERNAL_MODULE_INFO_LIST, CYBLACK_DEFKSB_BODY_GET_EXTERNAL_MODULE_INFO_LIST_METHOD);
        classes.subloop_new_class(CYBLACK_DEFKSB_KS_REFERENCE, CYBLACK_DEFKSB_EXPRESSION, NIL, NIL, $list_alt149);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFKSB_KS_REFERENCE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFKSB_KS_REFERENCE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_KS_REFERENCE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFKSB_KS_REFERENCE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_KS_REFERENCE_INSTANCE);
        subloop_reserved_initialize_cyblack_defksb_ks_reference_class(CYBLACK_DEFKSB_KS_REFERENCE);
        methods.methods_incorporate_instance_method(GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_KS_REFERENCE, $list_alt24, NIL, $list_alt152);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_KS_REFERENCE, GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES, $sym153$CYBLACK_DEFKSB_KS_REFERENCE_GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_KS_REFERENCE, $list_alt24, NIL, $list_alt152);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_KS_REFERENCE, GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, $sym154$CYBLACK_DEFKSB_KS_REFERENCE_GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES);
        methods.methods_incorporate_instance_method(GET_INFO, CYBLACK_DEFKSB_KS_REFERENCE, $list_alt24, NIL, $list_alt152);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_KS_REFERENCE, GET_INFO, CYBLACK_DEFKSB_KS_REFERENCE_GET_INFO_METHOD);
        classes.subloop_new_class(CYBLACK_DEFKSB_IKS_REFERENCE, CYBLACK_DEFKSB_KS_REFERENCE, NIL, NIL, NIL);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFKSB_IKS_REFERENCE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFKSB_IKS_REFERENCE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_IKS_REFERENCE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFKSB_IKS_REFERENCE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_IKS_REFERENCE_INSTANCE);
        subloop_reserved_initialize_cyblack_defksb_iks_reference_class(CYBLACK_DEFKSB_IKS_REFERENCE);
        interfaces.new_interface(CYBLACK_DEFKSB_DEFKS_KS_REFERENCE, NIL, NIL, $list_alt160);
        interfaces.interfaces_add_interface_instance_method(SET_KS, CYBLACK_DEFKSB_DEFKS_KS_REFERENCE, $list_alt24, $list_alt162, $list_alt163);
        interfaces.new_interface(CYBLACK_DEFKSB_NATIVE_KS_REFERENCE, NIL, NIL, $list_alt165);
        interfaces.interfaces_add_interface_instance_method(SET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_KS_REFERENCE, $list_alt24, $list_alt167, $list_alt168);
        interfaces.interfaces_add_interface_instance_method(SET_PROPOSAL_CLASS, CYBLACK_DEFKSB_NATIVE_KS_REFERENCE, $list_alt24, $list_alt170, $list_alt171);
        interfaces.interfaces_add_interface_instance_method(SET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_KS_REFERENCE, $list_alt24, $list_alt173, $list_alt174);
        classes.subloop_new_class(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, CYBLACK_DEFKSB_IKS_REFERENCE, $list_alt176, NIL, $list_alt177);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, NIL);
        methods.methods_incorporate_instance_method(SET_KS, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, $list_alt24, $list_alt162, $list_alt163);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, SET_KS, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_SET_KS_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, $sym182$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_CL);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, $sym183$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_IN);
        subloop_reserved_initialize_cyblack_defksb_defks_iks_reference_class(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, $list_alt37, NIL, $list_alt184);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, INITIALIZE, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, $list_alt187, $list_alt43, $list_alt188);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, PRINT, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_SET_KS, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, $list_alt37, $list_alt162, $list_alt192);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, INTERNAL_SET_KS, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_INTERNAL_SET_KS_METHOD);
        methods.methods_incorporate_instance_method(GET_KS, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, $list_alt42, NIL, $list_alt196);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, GET_KS, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_GET_KS_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERNAL_KNOWLEDGE_SOURCE_CLASS, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, $list_alt24, NIL, $list_alt199);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, GET_INTERNAL_KNOWLEDGE_SOURCE_CLASS, $sym201$CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_GET_INTERNAL_KNOWLEDGE_SOURCE_);
        methods.methods_incorporate_instance_method(GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, $list_alt24, NIL, $list_alt202);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES, $sym203$CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_GET_INTERNAL_KNOWLEDGE_SOURCE_);
        methods.methods_incorporate_instance_method(GET_INFO, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, $list_alt24, NIL, $list_alt204);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE, GET_INFO, CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_GET_INFO_METHOD);
        classes.subloop_new_class(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, CYBLACK_DEFKSB_IKS_REFERENCE, $list_alt208, NIL, $list_alt209);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, NIL);
        methods.methods_incorporate_instance_method(SET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt24, $list_alt173, $list_alt174);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, SET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_SET_KSI_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_PROPOSAL_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt24, $list_alt170, $list_alt171);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, SET_PROPOSAL_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_SET_PROPOSAL_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt24, $list_alt167, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, SET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_SET_KS_CLASS_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $sym225$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_C);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $sym226$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_I);
        subloop_reserved_initialize_cyblack_defksb_native_iks_reference_class(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt37, NIL, $list_alt227);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, INITIALIZE, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt24, $list_alt43, $list_alt233);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, PRINT, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_SET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt37, $list_alt167, $list_alt240);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, INTERNAL_SET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_INTERNAL_SET_KS_CLASS_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_SET_PROPOSAL_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt37, $list_alt170, $list_alt244);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, INTERNAL_SET_PROPOSAL_CLASS, $sym246$CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_INTERNAL_SET_PROPOSAL_CLASS_M);
        methods.methods_incorporate_instance_method(INTERNAL_SET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt37, $list_alt173, $list_alt248);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, INTERNAL_SET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_INTERNAL_SET_KSI_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt42, NIL, $list_alt252);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, GET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_GET_KS_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_PROPOSAL_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt42, NIL, $list_alt255);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, GET_PROPOSAL_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_GET_PROPOSAL_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt42, NIL, $list_alt258);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, GET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_GET_KSI_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt24, NIL, $list_alt260);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES, $sym262$CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_GET_INTERNAL_KNOWLEDGE_SOURCE);
        methods.methods_incorporate_instance_method(GET_INFO, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, $list_alt24, NIL, $list_alt263);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE, GET_INFO, CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_GET_INFO_METHOD);
        interfaces.new_interface(CYBLACK_DEFKSB_EXTERNAL_KS_REFERENCE, NIL, NIL, $list_alt267);
        interfaces.interfaces_add_interface_instance_method(SET_EXTERNAL_MODULE_NAME, CYBLACK_DEFKSB_EXTERNAL_KS_REFERENCE, $list_alt24, $list_alt269, $list_alt270);
        interfaces.interfaces_add_interface_instance_method(SET_PORT_ID, CYBLACK_DEFKSB_EXTERNAL_KS_REFERENCE, $list_alt24, $list_alt272, $list_alt273);
        classes.subloop_new_class(CYBLACK_DEFKSB_EKS_REFERENCE, CYBLACK_DEFKSB_KS_REFERENCE, NIL, NIL, $list_alt275);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFKSB_EKS_REFERENCE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFKSB_EKS_REFERENCE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_EKS_REFERENCE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFKSB_EKS_REFERENCE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_EKS_REFERENCE_INSTANCE);
        subloop_reserved_initialize_cyblack_defksb_eks_reference_class(CYBLACK_DEFKSB_EKS_REFERENCE);
        methods.methods_incorporate_instance_method(GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_DEFKSB_EKS_REFERENCE, $list_alt24, $list_alt129, $list_alt278);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_EKS_REFERENCE, GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE, $sym279$CYBLACK_DEFKSB_EKS_REFERENCE_GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE);
        classes.subloop_new_class(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, CYBLACK_DEFKSB_EKS_REFERENCE, $list_alt281, NIL, $list_alt282);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, NIL);
        methods.methods_incorporate_instance_method(SET_KS, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt24, $list_alt162, $list_alt163);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, SET_KS, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_SET_KS_METHOD);
        methods.methods_incorporate_instance_method(SET_PORT_ID, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt24, $list_alt272, $list_alt273);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, SET_PORT_ID, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_SET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_MODULE_NAME, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt24, $list_alt269, $list_alt270);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, SET_EXTERNAL_MODULE_NAME, $sym289$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_SET_EXTERNAL_MODULE_NAME_METHO);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $sym290$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_CL);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $sym291$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_IN);
        subloop_reserved_initialize_cyblack_defksb_defks_eks_reference_class(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt37, NIL, $list_alt292);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, INITIALIZE, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt187, $list_alt43, $list_alt295);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, PRINT, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASS, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt24, NIL, $list_alt199);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASS, $sym301$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_EXTERNAL_KNOWLEDGE_SOURCE_);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt24, NIL, $list_alt302);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, $sym303$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_EXTERNAL_KNOWLEDGE_SOURCE_);
        methods.methods_incorporate_instance_method(GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt24, $list_alt129, $list_alt304);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE, $sym306$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_PORT_ID_GIVEN_EXTERNAL_KNO);
        methods.methods_incorporate_instance_method(GET_INFO, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt24, NIL, $list_alt307);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, GET_INFO, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_INFO_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_SET_EXTERNAL_MODULE_NAME, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt37, $list_alt269, $list_alt311);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, INTERNAL_SET_EXTERNAL_MODULE_NAME, $sym313$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_INTERNAL_SET_EXTERNAL_MODULE_N);
        methods.methods_incorporate_instance_method(INTERNAL_SET_PORT_ID, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt37, $list_alt272, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, INTERNAL_SET_PORT_ID, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_INTERNAL_SET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_NAME, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt42, NIL, $list_alt319);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, GET_EXTERNAL_MODULE_NAME, $sym320$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_EXTERNAL_MODULE_NAME_METHO);
        methods.methods_incorporate_instance_method(GET_PORT_ID, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt42, NIL, $list_alt322);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, GET_PORT_ID, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_SET_KS, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt37, $list_alt162, $list_alt192);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, INTERNAL_SET_KS, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_INTERNAL_SET_KS_METHOD);
        methods.methods_incorporate_instance_method(GET_KS, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, $list_alt42, NIL, $list_alt196);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE, GET_KS, CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_KS_METHOD);
        classes.subloop_new_class(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, CYBLACK_DEFKSB_EKS_REFERENCE, $list_alt328, NIL, $list_alt329);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, NIL);
        methods.methods_incorporate_instance_method(SET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt24, $list_alt173, $list_alt174);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, SET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_SET_KSI_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_PROPOSAL_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt24, $list_alt170, $list_alt171);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, SET_PROPOSAL_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_SET_PROPOSAL_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt24, $list_alt167, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, SET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_SET_KS_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_PORT_ID, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt24, $list_alt272, $list_alt273);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, SET_PORT_ID, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_SET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_MODULE_NAME, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt24, $list_alt269, $list_alt270);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, SET_EXTERNAL_MODULE_NAME, $sym334$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_SET_EXTERNAL_MODULE_NAME_METH);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $sym335$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_C);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $sym336$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_I);
        subloop_reserved_initialize_cyblack_defksb_native_eks_reference_class(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt37, NIL, $list_alt337);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, INITIALIZE, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt24, $list_alt43, $list_alt340);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, PRINT, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt24, NIL, $list_alt260);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES, $sym346$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_EXTERNAL_KNOWLEDGE_SOURCE);
        methods.methods_incorporate_instance_method(GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt24, $list_alt129, $list_alt347);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE, $sym349$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_PORT_ID_GIVEN_EXTERNAL_KN);
        methods.methods_incorporate_instance_method(INTERNAL_SET_EXTERNAL_MODULE_NAME, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt37, $list_alt269, $list_alt311);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, INTERNAL_SET_EXTERNAL_MODULE_NAME, $sym351$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INTERNAL_SET_EXTERNAL_MODULE_);
        methods.methods_incorporate_instance_method(INTERNAL_SET_PORT_ID, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt37, $list_alt272, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, INTERNAL_SET_PORT_ID, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INTERNAL_SET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_NAME, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt42, NIL, $list_alt319);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, GET_EXTERNAL_MODULE_NAME, $sym354$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_EXTERNAL_MODULE_NAME_METH);
        methods.methods_incorporate_instance_method(GET_PORT_ID, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt42, NIL, $list_alt322);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, GET_PORT_ID, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_SET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt37, $list_alt167, $list_alt240);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, INTERNAL_SET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INTERNAL_SET_KS_CLASS_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_SET_PROPOSAL_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt37, $list_alt170, $list_alt244);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, INTERNAL_SET_PROPOSAL_CLASS, $sym359$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INTERNAL_SET_PROPOSAL_CLASS_M);
        methods.methods_incorporate_instance_method(INTERNAL_SET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt37, $list_alt173, $list_alt248);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, INTERNAL_SET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INTERNAL_SET_KSI_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt42, NIL, $list_alt252);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, GET_KS_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_KS_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_PROPOSAL_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt42, NIL, $list_alt255);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, GET_PROPOSAL_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_PROPOSAL_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt42, NIL, $list_alt258);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, GET_KSI_CLASS, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_KSI_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_INFO, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, $list_alt24, NIL, $list_alt365);
        methods.subloop_register_instance_method(CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE, GET_INFO, CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_INFO_METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_DEFKSB_BODY_KEY, $list_alt368);
        enumerations.enumerations_incorporate_definition(CYBLACK_NATIVE_IKS_REFERENCE_KEY, $list_alt387);
        enumerations.enumerations_incorporate_definition(CYBLACK_DEFKS_EKS_KEY, $list_alt397);
        enumerations.enumerations_incorporate_definition(CYBLACK_NATIVE_EKS_KEY, $list_alt408);
        enumerations.enumerations_incorporate_definition(CYBLACK_DEFKSB_OPTIONS, $list_alt421);
        classes.subloop_new_class(CYBLACK_KSB_INFO, OBJECT, NIL, NIL, $list_alt427);
        classes.class_set_implements_slot_listeners(CYBLACK_KSB_INFO, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_KSB_INFO, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_KSB_INFO_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_KSB_INFO, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_KSB_INFO_INSTANCE);
        subloop_reserved_initialize_cyblack_ksb_info_class(CYBLACK_KSB_INFO);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_KSB_INFO, $list_alt37, NIL, $list_alt433);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, INITIALIZE, CYBLACK_KSB_INFO_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_KSB_INFO, $list_alt42, $list_alt43, $list_alt436);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, PRINT, CYBLACK_KSB_INFO_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_KSB_NAME, CYBLACK_KSB_INFO, $list_alt42, NIL, $list_alt440);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, GET_KSB_NAME, CYBLACK_KSB_INFO_GET_KSB_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_KSB_NAME, CYBLACK_KSB_INFO, $list_alt24, $list_alt443, $list_alt444);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, SET_KSB_NAME, CYBLACK_KSB_INFO_SET_KSB_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_KSB_CLASS_NAME, CYBLACK_KSB_INFO, $list_alt42, NIL, $list_alt449);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, GET_KSB_CLASS_NAME, CYBLACK_KSB_INFO_GET_KSB_CLASS_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_KSB_CLASS_NAME, CYBLACK_KSB_INFO, $list_alt24, $list_alt452, $list_alt453);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, SET_KSB_CLASS_NAME, CYBLACK_KSB_INFO_SET_KSB_CLASS_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_KSB_BODY, CYBLACK_KSB_INFO, $list_alt42, NIL, $list_alt458);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, GET_KSB_BODY, CYBLACK_KSB_INFO_GET_KSB_BODY_METHOD);
        methods.methods_incorporate_instance_method(SET_KSB_BODY, CYBLACK_KSB_INFO, $list_alt24, $list_alt461, $list_alt462);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, SET_KSB_BODY, CYBLACK_KSB_INFO_SET_KSB_BODY_METHOD);
        methods.methods_incorporate_instance_method(GET_DEFAULT_APPLICATION_BASE_CLASS, CYBLACK_KSB_INFO, $list_alt24, NIL, $list_alt466);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, GET_DEFAULT_APPLICATION_BASE_CLASS, CYBLACK_KSB_INFO_GET_DEFAULT_APPLICATION_BASE_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONNECTION_CLASS, CYBLACK_KSB_INFO, $list_alt24, NIL, $list_alt470);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, GET_CONNECTION_CLASS, CYBLACK_KSB_INFO_GET_CONNECTION_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERNAL_MODULE_INFO_LIST, CYBLACK_KSB_INFO, $list_alt24, NIL, $list_alt474);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, GET_INTERNAL_MODULE_INFO_LIST, CYBLACK_KSB_INFO_GET_INTERNAL_MODULE_INFO_LIST_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_MODULE_INFO_LIST, CYBLACK_KSB_INFO, $list_alt24, NIL, $list_alt477);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, GET_EXTERNAL_MODULE_INFO_LIST, CYBLACK_KSB_INFO_GET_EXTERNAL_MODULE_INFO_LIST_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_KSB_INSTALLATION_EXPRESSIONS, CYBLACK_KSB_INFO, $list_alt24, NIL, $list_alt481);
        methods.subloop_register_instance_method(CYBLACK_KSB_INFO, COMPILE_TO_KSB_INSTALLATION_EXPRESSIONS, CYBLACK_KSB_INFO_COMPILE_TO_KSB_INSTALLATION_EXPRESSIONS_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_DEFKSB_BASE = makeSymbol("CYBLACK-DEFKSB-BASE");



    static private final SubLList $list_alt2 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")));





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_BASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-BASE-CLASS");



















    private static final SubLSymbol KSB_DICTIONARY = makeSymbol("KSB-DICTIONARY");

    private static final SubLSymbol INTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    private static final SubLSymbol EXTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    private static final SubLSymbol KNOWLEDGE_SOURCES_WAITING_FOR_APPLICATION = makeSymbol("KNOWLEDGE-SOURCES-WAITING-FOR-APPLICATION");



    private static final SubLSymbol STORED_INTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("STORED-INTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    private static final SubLSymbol STORED_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("STORED-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_BASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-BASE-INSTANCE");



    static private final SubLList $list_alt24 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt25 = list(list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(ON-STARTUP ~S): No application is associated with this knowledge source battery."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("KS"), NIL), list(makeSymbol("PORT-ID"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("KS-CLASS"), list(makeSymbol("REVERSE"), makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-CLASSES"))), list(makeSymbol("CSETQ"), makeSymbol("KS"), list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("KS-CLASS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("REGISTER-KNOWLEDGE-SOURCE"), makeSymbol("SELF"), makeSymbol("KS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("KS-CLASS"), list(makeSymbol("REVERSE"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"))), list(makeSymbol("CSETQ"), makeSymbol("KS"), list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("KS-CLASS"))), list(makeSymbol("CSETQ"), makeSymbol("PORT-ID"), list(makeSymbol("PORT-ID-GIVEN-EKSC"), makeSymbol("SELF"), makeSymbol("KS-CLASS"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PORT-ID"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("KS"), makeSymbol("PORT-ID")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("REGISTER-KNOWLEDGE-SOURCE"), makeSymbol("SELF"), makeSymbol("KS")))), list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("LINK-KNOWLEDGE-SOURCES-TO-PANELS"), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLSymbol $sym26$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BASE-METHOD");

    static private final SubLString $str_alt27$_ON_STARTUP__S___No_application_i = makeString("(ON-STARTUP ~S): No application is associated with this knowledge source battery.");



    private static final SubLSymbol CYBLACK_DEFKSB_BASE_ON_STARTUP_METHOD = makeSymbol("CYBLACK-DEFKSB-BASE-ON-STARTUP-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_EXPRESSION = makeSymbol("CYBLACK-DEFKSB-EXPRESSION");

    static private final SubLList $list_alt31 = list(list(makeSymbol("PARENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CHILDREN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT"), list(makeSymbol("NEW-PARENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-CHILD"), list(makeSymbol("NEW-CHILD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CHILDREN"), NIL, makeKeyword("PUBLIC")));





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_EXPRESSION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-EXPRESSION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_EXPRESSION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-EXPRESSION-INSTANCE");



    static private final SubLList $list_alt37 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PARENT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CHILDREN"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym39$OUTER_CATCH_FOR_CYBLACK_DEFKSB_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFKSB-EXPRESSION-INITIALIZE-METHOD");



    static private final SubLList $list_alt42 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt43 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt44 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CDOLIST"), list(makeSymbol("CHILD"), list(makeSymbol("GET-CHILDREN"), makeSymbol("SELF"))), list(makeSymbol("PRINT"), makeSymbol("CHILD"), makeSymbol("STREAM"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_DEFKSB_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFKSB-EXPRESSION-PRINT-METHOD");



    static private final SubLList $list_alt47 = list(list(RET, makeSymbol("PARENT")));

    private static final SubLSymbol CYBLACK_DEFKSB_EXPRESSION_GET_PARENT_METHOD = makeSymbol("CYBLACK-DEFKSB-EXPRESSION-GET-PARENT-METHOD");



    static private final SubLList $list_alt50 = list(makeSymbol("NEW-PARENT"));

    static private final SubLList $list_alt51 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PARENT")), list(makeSymbol("CYBLACK-DEFKSB-EXPRESSION-P"), makeSymbol("NEW-PARENT"))), makeString("(SET-PARENT ~S): ~S is not an instance of CYBLACK-DEFKSB-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-PARENT")), list(makeSymbol("CSETQ"), makeSymbol("PARENT"), makeSymbol("NEW-PARENT")), list(makeSymbol("PWHEN"), makeSymbol("PARENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-CHILD"), makeSymbol("CYBLACK-DEFKSB-EXPRESSION")), makeSymbol("PARENT"), makeSymbol("SELF"))), list(RET, makeSymbol("PARENT")));

    static private final SubLSymbol $sym52$OUTER_CATCH_FOR_CYBLACK_DEFKSB_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-EXPRESSION-METHOD");

    static private final SubLString $str_alt53$_SET_PARENT__S____S_is_not_an_ins = makeString("(SET-PARENT ~S): ~S is not an instance of CYBLACK-DEFKSB-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFKSB_EXPRESSION_SET_PARENT_METHOD = makeSymbol("CYBLACK-DEFKSB-EXPRESSION-SET-PARENT-METHOD");



    static private final SubLList $list_alt56 = list(makeSymbol("NEW-CHILD"));

    static private final SubLList $list_alt57 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-CHILD"), makeSymbol("CHILDREN")), list(makeSymbol("CSETQ"), makeSymbol("CHILDREN"), list(makeSymbol("NCONC"), makeSymbol("CHILDREN"), list(makeSymbol("LIST"), makeSymbol("NEW-CHILD")))), list(makeSymbol("SET-CYBLACK-DEFKSB-EXPRESSION-CHILDREN"), makeSymbol("SELF"), makeSymbol("CHILDREN"))), list(RET, makeSymbol("NEW-CHILD")));

    private static final SubLSymbol CYBLACK_DEFKSB_EXPRESSION_ADD_CHILD_METHOD = makeSymbol("CYBLACK-DEFKSB-EXPRESSION-ADD-CHILD-METHOD");



    static private final SubLList $list_alt60 = list(list(RET, makeSymbol("CHILDREN")));

    private static final SubLSymbol CYBLACK_DEFKSB_EXPRESSION_GET_CHILDREN_METHOD = makeSymbol("CYBLACK-DEFKSB-EXPRESSION-GET-CHILDREN-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_BODY = makeSymbol("CYBLACK-DEFKSB-BODY");

    static private final SubLList $list_alt63 = list(new SubLObject[]{ list(makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ON-STARTUP-BODY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ON-SHUTDOWN-BODY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), list(makeSymbol("NEW-EXPRESSIONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), list(makeSymbol("NEW-EXPRESSIONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ON-STARTUP-BODY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ON-STARTUP-BODY"), list(makeSymbol("IMPLICIT-PROGN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ON-SHUTDOWN-BODY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ON-SHUTDOWN-BODY"), list(makeSymbol("IMPLICIT-PROGN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("EKS-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-APPLICATION-BASE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-MODULE-INFO-LIST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-INFO-LIST"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol ON_SHUTDOWN_BODY = makeSymbol("ON-SHUTDOWN-BODY");

    private static final SubLSymbol ON_STARTUP_BODY = makeSymbol("ON-STARTUP-BODY");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_BODY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-BODY-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_BODY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-BODY-INSTANCE");

    static private final SubLList $list_alt70 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym71$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-INITIALIZE-METHOD");

    static private final SubLList $list_alt73 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("FIRST-OUTPUT"), T)), list(makeSymbol("PWHEN"), makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:INTERNAL-KNOWLEDGE-SOURCES")), list(makeSymbol("CDOLIST"), list(makeSymbol("INTERNAL-KS"), makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("INTERNAL-KS"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-OUTPUT"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), list(makeSymbol("PUNLESS"), makeSymbol("FIRST-OUTPUT"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" "))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:EXTERNAL-KNOWLEDGE-SOURCES")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXTERNAL-KS"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("EXTERNAL-KS"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-OUTPUT"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("ON-STARTUP-BODY"), list(makeSymbol("PUNLESS"), makeSymbol("FIRST-OUTPUT"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" "))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:ON-STARTUP")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXPRESSION"), makeSymbol("ON-STARTUP-BODY")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("EXPRESSION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-OUTPUT"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("ON-SHUTDOWN-BODY"), list(makeSymbol("PUNLESS"), makeSymbol("FIRST-OUTPUT"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" "))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:ON-SHUTDOWN")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXPRESSION"), makeSymbol("ON-SHUTDOWN-BODY")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("EXPRESSION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")"))), list(makeSymbol("CSETQ"), makeSymbol("FIRST-OUTPUT"), NIL)), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym74$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");

    static private final SubLString $str_alt75$__INTERNAL_KNOWLEDGE_SOURCES = makeString("(:INTERNAL-KNOWLEDGE-SOURCES");

    static private final SubLString $str_alt76$__S = makeString(" ~S");

    static private final SubLString $str_alt77$_ = makeString(")");

    static private final SubLString $str_alt78$_ = makeString(" ");

    static private final SubLString $str_alt79$__EXTERNAL_KNOWLEDGE_SOURCES = makeString("(:EXTERNAL-KNOWLEDGE-SOURCES");

    static private final SubLString $str_alt80$__ON_STARTUP = makeString("(:ON-STARTUP");

    static private final SubLString $str_alt81$__ON_SHUTDOWN = makeString("(:ON-SHUTDOWN");

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_PRINT_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-PRINT-METHOD");

    private static final SubLSymbol GET_INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS = makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS");

    static private final SubLList $list_alt84 = list(list(RET, makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS")));

    static private final SubLSymbol $sym85$CYBLACK_DEFKSB_BODY_GET_INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS_MET = makeSymbol("CYBLACK-DEFKSB-BODY-GET-INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS-METHOD");

    private static final SubLSymbol SET_INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS = makeSymbol("SET-INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS");

    static private final SubLList $list_alt87 = list(makeSymbol("NEW-EXPRESSIONS"));

    static private final SubLList $list_alt88 = list(list(makeSymbol("CSETQ"), makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-EXPRESSIONS"))), list(RET, makeSymbol("NEW-EXPRESSIONS")));

    static private final SubLSymbol $sym89$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");

    static private final SubLSymbol $sym90$CYBLACK_DEFKSB_BODY_SET_INTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS_MET = makeSymbol("CYBLACK-DEFKSB-BODY-SET-INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS-METHOD");

    private static final SubLSymbol GET_EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS = makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS");

    static private final SubLList $list_alt92 = list(list(RET, makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS")));

    static private final SubLSymbol $sym93$CYBLACK_DEFKSB_BODY_GET_EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS_MET = makeSymbol("CYBLACK-DEFKSB-BODY-GET-EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS-METHOD");

    private static final SubLSymbol SET_EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS = makeSymbol("SET-EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS");

    static private final SubLList $list_alt95 = list(list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-EXPRESSIONS"))), list(RET, makeSymbol("NEW-EXPRESSIONS")));

    static private final SubLSymbol $sym96$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");

    static private final SubLSymbol $sym97$CYBLACK_DEFKSB_BODY_SET_EXTERNAL_KNOWLEDGE_SOURCE_EXPRESSIONS_MET = makeSymbol("CYBLACK-DEFKSB-BODY-SET-EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS-METHOD");

    private static final SubLSymbol GET_ON_STARTUP_BODY = makeSymbol("GET-ON-STARTUP-BODY");

    static private final SubLList $list_alt99 = list(list(RET, makeSymbol("ON-STARTUP-BODY")));

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_GET_ON_STARTUP_BODY_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-GET-ON-STARTUP-BODY-METHOD");

    private static final SubLSymbol SET_ON_STARTUP_BODY = makeSymbol("SET-ON-STARTUP-BODY");

    static private final SubLList $list_alt102 = list(makeSymbol("IMPLICIT-PROGN"));

    static private final SubLList $list_alt103 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("IMPLICIT-PROGN")), makeString("(SET-ON-STARTUP-BODY ~S): ~S is not a valid implicit progn body."), makeSymbol("SELF"), makeSymbol("IMPLICIT-PROGN")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXPRESSION"), makeSymbol("IMPLICIT-PROGN")), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("SYMBOLP"), makeSymbol("EXPRESSION")), list(makeSymbol("NUMBERP"), makeSymbol("EXPRESSION")), list(makeSymbol("STRINGP"), makeSymbol("EXPRESSION")), list(makeSymbol("CAND"), list(makeSymbol("CONSP"), makeSymbol("EXPRESSION")), list(makeSymbol("SYMBOLP"), list(makeSymbol("CAR"), makeSymbol("EXPRESSION"))))), makeString("(SET-ON-STARTUP-BODY ~S): ~S is not a valid lisp expression."), makeSymbol("SELF"), makeSymbol("EXPRESSION"))), list(makeSymbol("CSETQ"), makeSymbol("ON-STARTUP-BODY"), list(makeSymbol("COPY-TREE"), makeSymbol("IMPLICIT-PROGN"))), list(RET, makeSymbol("IMPLICIT-PROGN")));

    static private final SubLSymbol $sym104$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");

    static private final SubLString $str_alt105$_SET_ON_STARTUP_BODY__S____S_is_n = makeString("(SET-ON-STARTUP-BODY ~S): ~S is not a valid implicit progn body.");

    static private final SubLString $str_alt106$_SET_ON_STARTUP_BODY__S____S_is_n = makeString("(SET-ON-STARTUP-BODY ~S): ~S is not a valid lisp expression.");

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_SET_ON_STARTUP_BODY_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-SET-ON-STARTUP-BODY-METHOD");

    private static final SubLSymbol GET_ON_SHUTDOWN_BODY = makeSymbol("GET-ON-SHUTDOWN-BODY");

    static private final SubLList $list_alt109 = list(list(RET, makeSymbol("ON-SHUTDOWN-BODY")));

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_GET_ON_SHUTDOWN_BODY_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-GET-ON-SHUTDOWN-BODY-METHOD");

    private static final SubLSymbol SET_ON_SHUTDOWN_BODY = makeSymbol("SET-ON-SHUTDOWN-BODY");

    static private final SubLList $list_alt112 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("IMPLICIT-PROGN")), makeString("(SET-ON-SHUTDOWN-BODY ~S): ~S is not a valid implicit progn body."), makeSymbol("SELF"), makeSymbol("IMPLICIT-PROGN")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXPRESSION"), makeSymbol("IMPLICIT-PROGN")), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("SYMBOLP"), makeSymbol("EXPRESSION")), list(makeSymbol("NUMBERP"), makeSymbol("EXPRESSION")), list(makeSymbol("STRINGP"), makeSymbol("EXPRESSION")), list(makeSymbol("CAND"), list(makeSymbol("CONSP"), makeSymbol("EXPRESSION")), list(makeSymbol("SYMBOLP"), list(makeSymbol("CAR"), makeSymbol("EXPRESSION"))))), makeString("(SET-ON-SHUTDOWN-BODY ~S): ~S is not a valid lisp expression."), makeSymbol("SELF"), makeSymbol("EXPRESSION"))), list(makeSymbol("CSETQ"), makeSymbol("ON-SHUTDOWN-BODY"), list(makeSymbol("COPY-TREE"), makeSymbol("IMPLICIT-PROGN"))), list(RET, makeSymbol("IMPLICIT-PROGN")));

    static private final SubLSymbol $sym113$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");

    static private final SubLString $str_alt114$_SET_ON_SHUTDOWN_BODY__S____S_is_ = makeString("(SET-ON-SHUTDOWN-BODY ~S): ~S is not a valid implicit progn body.");

    static private final SubLString $str_alt115$_SET_ON_SHUTDOWN_BODY__S____S_is_ = makeString("(SET-ON-SHUTDOWN-BODY ~S): ~S is not a valid lisp expression.");

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_SET_ON_SHUTDOWN_BODY_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-SET-ON-SHUTDOWN-BODY-METHOD");

    private static final SubLSymbol GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    static private final SubLList $list_alt118 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CLASSES"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("IKS-REFERENCE"), makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), makeSymbol("CLASSES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("IKS-REFERENCE"), list(QUOTE, makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES")))), list(RET, makeSymbol("CLASSES"))));

    static private final SubLSymbol $sym119$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD");

    private static final SubLSymbol GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES");

    static private final SubLList $list_alt122 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CLASSES"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("EKS-REFERENCE"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), makeSymbol("CLASSES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("EKS-REFERENCE"), list(QUOTE, makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES")))), list(RET, makeSymbol("CLASSES"))));

    static private final SubLSymbol $sym123$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD");

    private static final SubLSymbol GET_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("GET-KNOWLEDGE-SOURCE-CLASSES");

    static private final SubLList $list_alt126 = list(list(RET, list(makeSymbol("NCONC"), list(makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), makeSymbol("SELF")), list(makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), makeSymbol("SELF")))));

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_GET_KNOWLEDGE_SOURCE_CLASSES_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-GET-KNOWLEDGE-SOURCE-CLASSES-METHOD");

    private static final SubLSymbol GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE = makeSymbol("GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt129 = list(makeSymbol("EKS-CLASS"));

    static private final SubLList $list_alt130 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PORT-ID"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("EKS-REFERENCE"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS")), list(makeSymbol("CSETQ"), makeSymbol("PORT-ID"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("EKS-REFERENCE"), list(QUOTE, makeSymbol("GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("EKS-CLASS"))), list(makeSymbol("PWHEN"), makeSymbol("PORT-ID"), list(RET, makeSymbol("PORT-ID")))), list(RET, NIL)));

    static private final SubLSymbol $sym131$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");

    static private final SubLSymbol $sym132$CYBLACK_DEFKSB_BODY_GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE_SOURCE_M = makeSymbol("CYBLACK-DEFKSB-BODY-GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol GET_DEFAULT_APPLICATION_BASE_CLASS = makeSymbol("GET-DEFAULT-APPLICATION-BASE-CLASS");

    static private final SubLList $list_alt134 = list(list(makeSymbol("PIF"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), list(RET, list(QUOTE, makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE"))), list(RET, list(QUOTE, makeSymbol("CYBLACK-DEFAPP-BASE")))));

    static private final SubLSymbol $sym135$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_EXTERNAL_BASE = makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE");

    private static final SubLSymbol CYBLACK_DEFAPP_BASE = makeSymbol("CYBLACK-DEFAPP-BASE");

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_GET_DEFAULT_APPLICATION_BASE_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-GET-DEFAULT-APPLICATION-BASE-CLASS-METHOD");

    private static final SubLSymbol GET_INTERNAL_MODULE_INFO_LIST = makeSymbol("GET-INTERNAL-MODULE-INFO-LIST");

    static private final SubLList $list_alt140 = list(list(makeSymbol("PWHEN"), makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), list(makeSymbol("CLET"), list(list(makeSymbol("INFO-LIST"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("IKS"), makeSymbol("INTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), makeSymbol("INFO-LIST")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("IKS"), list(QUOTE, makeSymbol("GET-INFO")))), list(RET, makeSymbol("INFO-LIST")))), list(RET, NIL));

    static private final SubLSymbol $sym141$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");



    private static final SubLSymbol CYBLACK_DEFKSB_BODY_GET_INTERNAL_MODULE_INFO_LIST_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-GET-INTERNAL-MODULE-INFO-LIST-METHOD");

    private static final SubLSymbol GET_EXTERNAL_MODULE_INFO_LIST = makeSymbol("GET-EXTERNAL-MODULE-INFO-LIST");

    static private final SubLList $list_alt145 = list(list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), list(makeSymbol("CLET"), list(list(makeSymbol("INFO-LIST"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("EKS"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-EXPRESSIONS"), makeSymbol("INFO-LIST")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("EKS"), list(QUOTE, makeSymbol("GET-INFO")))), list(RET, makeSymbol("INFO-LIST")))), list(RET, NIL));

    static private final SubLSymbol $sym146$OUTER_CATCH_FOR_CYBLACK_DEFKSB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_GET_EXTERNAL_MODULE_INFO_LIST_METHOD = makeSymbol("CYBLACK-DEFKSB-BODY-GET-EXTERNAL-MODULE-INFO-LIST-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_KS_REFERENCE = makeSymbol("CYBLACK-DEFKSB-KS-REFERENCE");

    static private final SubLList $list_alt149 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INFO"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_KS_REFERENCE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-KS-REFERENCE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_KS_REFERENCE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-KS-REFERENCE-INSTANCE");

    static private final SubLList $list_alt152 = list(list(RET, NIL));

    static private final SubLSymbol $sym153$CYBLACK_DEFKSB_KS_REFERENCE_GET_INTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("CYBLACK-DEFKSB-KS-REFERENCE-GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD");

    static private final SubLSymbol $sym154$CYBLACK_DEFKSB_KS_REFERENCE_GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASSES = makeSymbol("CYBLACK-DEFKSB-KS-REFERENCE-GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_KS_REFERENCE_GET_INFO_METHOD = makeSymbol("CYBLACK-DEFKSB-KS-REFERENCE-GET-INFO-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_IKS_REFERENCE = makeSymbol("CYBLACK-DEFKSB-IKS-REFERENCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_IKS_REFERENCE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-IKS-REFERENCE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_IKS_REFERENCE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-IKS-REFERENCE-INSTANCE");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_KS_REFERENCE = makeSymbol("CYBLACK-DEFKSB-DEFKS-KS-REFERENCE");

    static private final SubLList $list_alt160 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-KS"), list(makeSymbol("NEW-KS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KS"), list(makeSymbol("NEW-KS")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SET_KS = makeSymbol("SET-KS");

    static private final SubLList $list_alt162 = list(makeSymbol("NEW-KS"));

    static private final SubLList $list_alt163 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-KS"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-KS"))), makeString("(SET-KS ~S): ~S is not a valid knowledge source."), makeSymbol("SELF"), makeSymbol("NEW-KS")), list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-GET-KS-ASSISTANT"), makeSymbol("NEW-KS")), list(makeSymbol("WARN"), makeString("(SET-KS ~S): ~S has not been defined by DEFINE-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("NEW-KS"))), list(makeSymbol("INTERNAL-SET-KS"), makeSymbol("SELF"), makeSymbol("NEW-KS")), list(RET, makeSymbol("NEW-KS")));

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_KS_REFERENCE = makeSymbol("CYBLACK-DEFKSB-NATIVE-KS-REFERENCE");

    static private final SubLList $list_alt165 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-KS-CLASS"), list(makeSymbol("NEW-KS-CLASS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-PROPOSAL-CLASS"), list(makeSymbol("NEW-PROPOSAL-CLASS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-KSI-CLASS"), list(makeSymbol("NEW-KSI-CLASS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KS-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KS-CLASS"), list(makeSymbol("NEW-KS-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROPOSAL-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROPOSAL-CLASS"), list(makeSymbol("NEW-PROPOSAL-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSI-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSI-CLASS"), list(makeSymbol("NEW-KSI-CLASS")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol SET_KS_CLASS = makeSymbol("SET-KS-CLASS");

    static private final SubLList $list_alt167 = list(makeSymbol("NEW-KS-CLASS"));

    static private final SubLList $list_alt168 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-KS-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-KS-CLASS"))), makeString("(SET-KS-CLASS ~S): ~S is not a valid knowledge source class."), makeSymbol("SELF"), makeSymbol("NEW-KS-CLASS")), list(makeSymbol("PUNLESS"), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("NEW-KS-CLASS"), list(QUOTE, makeSymbol("CYBLACK-KNOWLEDGE-SOURCE"))), list(makeSymbol("WARN"), makeString("(SET-KS-CLASS ~S): ~S does not implement the CYBLACK-KNOWLEDGE-SOURCE interface."), makeSymbol("SELF"), makeSymbol("NEW-KS-CLASS"))), list(makeSymbol("INTERNAL-SET-KS-CLASS"), makeSymbol("SELF"), makeSymbol("NEW-KS-CLASS")), list(RET, makeSymbol("NEW-KS-CLASS")));



    static private final SubLList $list_alt170 = list(makeSymbol("NEW-PROPOSAL-CLASS"));

    static private final SubLList $list_alt171 = list(list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-PROPOSAL-CLASS")), makeString("(SET-PROPOSAL-CLASS ~S): ~S is not a valid proposal class."), makeSymbol("SELF"), makeSymbol("NEW-PROPOSAL-CLASS")), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PROPOSAL-CLASS")), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("NEW-PROPOSAL-CLASS"), list(QUOTE, makeSymbol("CYBLACK-PROPOSAL")))), list(makeSymbol("WARN"), makeString("(SET-PROPOSAL-CLASS ~S): ~S does not implement the CYBLACK-PROPOSAL interface."), makeSymbol("SELF"), makeSymbol("NEW-PROPOSAL-CLASS"))), list(makeSymbol("INTERNAL-SET-PROPOSAL-CLASS"), makeSymbol("SELF"), makeSymbol("NEW-PROPOSAL-CLASS")), list(RET, makeSymbol("NEW-PROPOSAL-CLASS")));

    private static final SubLSymbol SET_KSI_CLASS = makeSymbol("SET-KSI-CLASS");

    static private final SubLList $list_alt173 = list(makeSymbol("NEW-KSI-CLASS"));

    static private final SubLList $list_alt174 = list(list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-KSI-CLASS")), makeString("(SET-KSI-CLASS ~S): ~S is not a valid knowledge source instantiation class."), makeSymbol("SELF"), makeSymbol("NEW-KSI-CLASS")), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-KSI-CLASS")), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("NEW-KSI-CLASS"), list(QUOTE, makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION")))), list(makeSymbol("WARN"), makeString("(SET-KSI-CLASS ~S): ~S does not implement the CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION interface."), makeSymbol("SELF"), makeSymbol("NEW-KSI-CLASS"))), list(makeSymbol("INTERNAL-SET-KSI-CLASS"), makeSymbol("SELF"), makeSymbol("NEW-KSI-CLASS")), list(RET, makeSymbol("NEW-KSI-CLASS")));

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE = makeSymbol("CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE");

    static private final SubLList $list_alt176 = list(makeSymbol("CYBLACK-DEFKSB-DEFKS-KS-REFERENCE"));

    static private final SubLList $list_alt177 = list(new SubLObject[]{ list(makeSymbol("KS-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-KS"), list(makeSymbol("NEW-KS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KS"), list(makeSymbol("NEW-KS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INFO"), NIL, makeKeyword("PUBLIC")) });



    static private final SubLString $str_alt179$_SET_KS__S____S_is_not_a_valid_kn = makeString("(SET-KS ~S): ~S is not a valid knowledge source.");

    static private final SubLString $str_alt180$_SET_KS__S____S_has_not_been_defi = makeString("(SET-KS ~S): ~S has not been defined by DEFINE-KNOWLEDGE-SOURCE.");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_SET_KS_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-SET-KS-METHOD");

    static private final SubLSymbol $sym182$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_CL = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-CLASS");

    static private final SubLSymbol $sym183$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_IN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-INSTANCE");

    static private final SubLList $list_alt184 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("KS-NAME"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym185$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-INITIALIZE-METHOD");

    static private final SubLList $list_alt187 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt188 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:KS ~S)"), makeSymbol("KS-NAME")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt189$__KS__S_ = makeString("(:KS ~S)");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_PRINT_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-PRINT-METHOD");

    private static final SubLSymbol INTERNAL_SET_KS = makeSymbol("INTERNAL-SET-KS");

    static private final SubLList $list_alt192 = list(list(makeSymbol("CSETQ"), makeSymbol("KS-NAME"), makeSymbol("NEW-KS")), list(RET, makeSymbol("NEW-KS")));

    static private final SubLSymbol $sym193$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_INTERNAL_SET_KS_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-INTERNAL-SET-KS-METHOD");



    static private final SubLList $list_alt196 = list(list(RET, makeSymbol("KS-NAME")));

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_GET_KS_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-GET-KS-METHOD");

    private static final SubLSymbol GET_INTERNAL_KNOWLEDGE_SOURCE_CLASS = makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLList $list_alt199 = list(list(makeSymbol("PWHEN"), makeSymbol("KS-NAME"), list(makeSymbol("CLET"), list(list(makeSymbol("ASSISTANT"), list(makeSymbol("CYBLACK-GET-KS-ASSISTANT"), makeSymbol("KS-NAME")))), list(makeSymbol("PWHEN"), makeSymbol("ASSISTANT"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("CYBLACK-AUTO-GENERATED-KS-ASSISTANT")), makeSymbol("ASSISTANT")))))), list(RET, NIL));

    static private final SubLSymbol $sym200$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-METHOD");

    static private final SubLSymbol $sym201$CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_GET_INTERNAL_KNOWLEDGE_SOURCE_ = makeSymbol("CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-GET-INTERNAL-KNOWLEDGE-SOURCE-CLASS-METHOD");

    static private final SubLList $list_alt202 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-NAME"), list(makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("CLASS-NAME"), list(RET, list(makeSymbol("LIST"), makeSymbol("CLASS-NAME")))), list(RET, NIL)));

    static private final SubLSymbol $sym203$CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_GET_INTERNAL_KNOWLEDGE_SOURCE_ = makeSymbol("CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD");

    static private final SubLList $list_alt204 = list(list(RET, list(makeSymbol("LIST"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("KS-NAME")), list(makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("SELF")))));

    static private final SubLSymbol $sym205$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_IKS_REFERENCE_GET_INFO_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE-GET-INFO-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE");

    static private final SubLList $list_alt208 = list(makeSymbol("CYBLACK-DEFKSB-NATIVE-KS-REFERENCE"));

    static private final SubLList $list_alt209 = list(new SubLObject[]{ list(makeSymbol("KS-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROPOSAL-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KSI-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-KS-CLASS"), list(makeSymbol("NEW-KS-CLASS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-PROPOSAL-CLASS"), list(makeSymbol("NEW-PROPOSAL-CLASS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-KSI-CLASS"), list(makeSymbol("NEW-KSI-CLASS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KS-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KS-CLASS"), list(makeSymbol("NEW-KS-CLASS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROPOSAL-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROPOSAL-CLASS"), list(makeSymbol("NEW-PROPOSAL-CLASS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSI-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSI-CLASS"), list(makeSymbol("NEW-KSI-CLASS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INFO"), NIL, makeKeyword("PUBLIC")) });







    static private final SubLString $str_alt213$_SET_KSI_CLASS__S____S_is_not_a_v = makeString("(SET-KSI-CLASS ~S): ~S is not a valid knowledge source instantiation class.");

    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE_INSTANTIATION = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION");

    static private final SubLString $str_alt215$_SET_KSI_CLASS__S____S_does_not_i = makeString("(SET-KSI-CLASS ~S): ~S does not implement the CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION interface.");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_SET_KSI_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-SET-KSI-CLASS-METHOD");

    static private final SubLString $str_alt217$_SET_PROPOSAL_CLASS__S____S_is_no = makeString("(SET-PROPOSAL-CLASS ~S): ~S is not a valid proposal class.");

    private static final SubLSymbol CYBLACK_PROPOSAL = makeSymbol("CYBLACK-PROPOSAL");

    static private final SubLString $str_alt219$_SET_PROPOSAL_CLASS__S____S_does_ = makeString("(SET-PROPOSAL-CLASS ~S): ~S does not implement the CYBLACK-PROPOSAL interface.");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_SET_PROPOSAL_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-SET-PROPOSAL-CLASS-METHOD");

    static private final SubLString $str_alt221$_SET_KS_CLASS__S____S_is_not_a_va = makeString("(SET-KS-CLASS ~S): ~S is not a valid knowledge source class.");

    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE");

    static private final SubLString $str_alt223$_SET_KS_CLASS__S____S_does_not_im = makeString("(SET-KS-CLASS ~S): ~S does not implement the CYBLACK-KNOWLEDGE-SOURCE interface.");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_SET_KS_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-SET-KS-CLASS-METHOD");

    static private final SubLSymbol $sym225$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-CLASS");

    static private final SubLSymbol $sym226$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-INSTANCE");

    static private final SubLList $list_alt227 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("KS-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE"))), list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-PROPOSAL"))), list(makeSymbol("CSETQ"), makeSymbol("KSI-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-KSI"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym228$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE");





    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-INITIALIZE-METHOD");

    static private final SubLList $list_alt233 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:KS-CLASS ~S"), makeSymbol("KS-CLASS")), list(makeSymbol("PWHEN"), makeSymbol("PROPOSAL-CLASS"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :PROPOSAL-CLASS ~S"), makeSymbol("PROPOSAL-CLASS"))), list(makeSymbol("PWHEN"), makeSymbol("KSI-CLASS"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :KSI-CLASS ~S"), makeSymbol("KSI-CLASS"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym234$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-METHOD");

    static private final SubLString $str_alt235$__KS_CLASS__S = makeString("(:KS-CLASS ~S");

    static private final SubLString $str_alt236$__PROPOSAL_CLASS__S = makeString(" :PROPOSAL-CLASS ~S");

    static private final SubLString $str_alt237$__KSI_CLASS__S = makeString(" :KSI-CLASS ~S");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_PRINT_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-PRINT-METHOD");

    private static final SubLSymbol INTERNAL_SET_KS_CLASS = makeSymbol("INTERNAL-SET-KS-CLASS");

    static private final SubLList $list_alt240 = list(list(makeSymbol("CSETQ"), makeSymbol("KS-CLASS"), makeSymbol("NEW-KS-CLASS")), list(RET, makeSymbol("NEW-KS-CLASS")));

    static private final SubLSymbol $sym241$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_INTERNAL_SET_KS_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-INTERNAL-SET-KS-CLASS-METHOD");

    private static final SubLSymbol INTERNAL_SET_PROPOSAL_CLASS = makeSymbol("INTERNAL-SET-PROPOSAL-CLASS");

    static private final SubLList $list_alt244 = list(list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL-CLASS"), makeSymbol("NEW-PROPOSAL-CLASS")), list(RET, makeSymbol("NEW-PROPOSAL-CLASS")));

    static private final SubLSymbol $sym245$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-METHOD");

    static private final SubLSymbol $sym246$CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_INTERNAL_SET_PROPOSAL_CLASS_M = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-INTERNAL-SET-PROPOSAL-CLASS-METHOD");

    private static final SubLSymbol INTERNAL_SET_KSI_CLASS = makeSymbol("INTERNAL-SET-KSI-CLASS");

    static private final SubLList $list_alt248 = list(list(makeSymbol("CSETQ"), makeSymbol("KSI-CLASS"), makeSymbol("NEW-KSI-CLASS")), list(RET, makeSymbol("NEW-KSI-CLASS")));

    static private final SubLSymbol $sym249$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_INTERNAL_SET_KSI_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-INTERNAL-SET-KSI-CLASS-METHOD");

    private static final SubLSymbol GET_KS_CLASS = makeSymbol("GET-KS-CLASS");

    static private final SubLList $list_alt252 = list(list(RET, makeSymbol("KS-CLASS")));

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_GET_KS_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-GET-KS-CLASS-METHOD");



    static private final SubLList $list_alt255 = list(list(RET, makeSymbol("PROPOSAL-CLASS")));

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_GET_PROPOSAL_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-GET-PROPOSAL-CLASS-METHOD");

    private static final SubLSymbol GET_KSI_CLASS = makeSymbol("GET-KSI-CLASS");

    static private final SubLList $list_alt258 = list(list(RET, makeSymbol("KSI-CLASS")));

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_GET_KSI_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-GET-KSI-CLASS-METHOD");

    static private final SubLList $list_alt260 = list(list(makeSymbol("PWHEN"), makeSymbol("KS-CLASS"), list(RET, list(makeSymbol("LIST"), makeSymbol("KS-CLASS")))), list(RET, NIL));

    static private final SubLSymbol $sym261$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-METHOD");

    static private final SubLSymbol $sym262$CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_GET_INTERNAL_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-GET-INTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD");

    static private final SubLList $list_alt263 = list(list(makeSymbol("PWHEN"), makeSymbol("KS-CLASS"), list(RET, list(makeSymbol("LIST"), list(makeSymbol("SYMBOL-NAME"), makeSymbol("KS-CLASS")), makeSymbol("KS-CLASS")))), list(RET, NIL));

    static private final SubLSymbol $sym264$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_IKS_REFERENCE_GET_INFO_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE-GET-INFO-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_EXTERNAL_KS_REFERENCE = makeSymbol("CYBLACK-DEFKSB-EXTERNAL-KS-REFERENCE");

    static private final SubLList $list_alt267 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-EXTERNAL-MODULE-NAME"), list(makeSymbol("NEW-EXTERNAL-MODULE-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-PORT-ID"), list(makeSymbol("NEW-PORT-ID")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-MODULE-NAME"), list(makeSymbol("NEW-EXTERNAL-MODULE-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PORT-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PORT-ID"), list(makeSymbol("NEW-PORT-ID")), makeKeyword("PUBLIC")));



    static private final SubLList $list_alt269 = list(makeSymbol("NEW-EXTERNAL-MODULE-NAME"));

    static private final SubLList $list_alt270 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(makeSymbol("CYBLACK-EXTERNAL-MODULE-NAME-P"), makeSymbol("NEW-EXTERNAL-MODULE-NAME"))), makeString("(SET-EXTERNAL-MODULE-NAME ~S): ~S is not a valid external module name."), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(makeSymbol("INTERNAL-SET-EXTERNAL-MODULE-NAME"), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(RET, makeSymbol("NEW-EXTERNAL-MODULE-NAME")));



    static private final SubLList $list_alt272 = list(makeSymbol("NEW-PORT-ID"));

    static private final SubLList $list_alt273 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PORT-ID")), list(makeSymbol("CYBLACK-PORT-ID-P"), makeSymbol("NEW-PORT-ID"))), makeString("(SET-PORT-ID ~S): ~S is not a valid port id."), makeSymbol("SELF"), makeSymbol("NEW-PORT-ID")), list(makeSymbol("INTERNAL-SET-PORT-ID"), makeSymbol("SELF"), makeSymbol("NEW-PORT-ID")), list(RET, makeSymbol("NEW-PORT-ID")));

    private static final SubLSymbol CYBLACK_DEFKSB_EKS_REFERENCE = makeSymbol("CYBLACK-DEFKSB-EKS-REFERENCE");

    static private final SubLList $list_alt275 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("EKS-CLASS")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_EKS_REFERENCE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-EKS-REFERENCE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_EKS_REFERENCE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-EKS-REFERENCE-INSTANCE");

    static private final SubLList $list_alt278 = list(list(makeSymbol("IGNORE"), makeSymbol("EKS-CLASS")), list(RET, NIL));

    static private final SubLSymbol $sym279$CYBLACK_DEFKSB_EKS_REFERENCE_GET_PORT_ID_GIVEN_EXTERNAL_KNOWLEDGE = makeSymbol("CYBLACK-DEFKSB-EKS-REFERENCE-GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE");

    static private final SubLList $list_alt281 = list(makeSymbol("CYBLACK-DEFKSB-DEFKS-KS-REFERENCE"), makeSymbol("CYBLACK-DEFKSB-EXTERNAL-KS-REFERENCE"));

    static private final SubLList $list_alt282 = list(new SubLObject[]{ list(makeSymbol("EXTERNAL-MODULE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PORT-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-EXTERNAL-MODULE-NAME"), list(makeSymbol("NEW-EXTERNAL-MODULE-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-PORT-ID"), list(makeSymbol("NEW-PORT-ID")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-MODULE-NAME"), list(makeSymbol("NEW-EXTERNAL-MODULE-NAME")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PORT-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PORT-ID"), list(makeSymbol("NEW-PORT-ID")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("KS-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-KS"), list(makeSymbol("NEW-KS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KS"), list(makeSymbol("NEW-KS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("EKS-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INFO"), NIL, makeKeyword("PUBLIC")) });





    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_SET_KS_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-SET-KS-METHOD");

    static private final SubLString $str_alt286$_SET_PORT_ID__S____S_is_not_a_val = makeString("(SET-PORT-ID ~S): ~S is not a valid port id.");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_SET_PORT_ID_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-SET-PORT-ID-METHOD");

    static private final SubLString $str_alt288$_SET_EXTERNAL_MODULE_NAME__S____S = makeString("(SET-EXTERNAL-MODULE-NAME ~S): ~S is not a valid external module name.");

    static private final SubLSymbol $sym289$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_SET_EXTERNAL_MODULE_NAME_METHO = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-SET-EXTERNAL-MODULE-NAME-METHOD");

    static private final SubLSymbol $sym290$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_CL = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-CLASS");

    static private final SubLSymbol $sym291$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_IN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-INSTANCE");

    static private final SubLList $list_alt292 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PORT-ID"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KS-NAME"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym293$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-INITIALIZE-METHOD");

    static private final SubLList $list_alt295 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("PIF"), makeSymbol("PORT-ID"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:KS ~S :EXTERNAL-MODULE-NAME ~S :PORT ~S)"), makeSymbol("KS-NAME"), makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("PORT-ID")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:KS ~S :EXTERNAL-MODULE-NAME ~S)"), makeSymbol("KS-NAME"), makeSymbol("EXTERNAL-MODULE-NAME"))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt296$__KS__S__EXTERNAL_MODULE_NAME__S_ = makeString("(:KS ~S :EXTERNAL-MODULE-NAME ~S :PORT ~S)");

    static private final SubLString $str_alt297$__KS__S__EXTERNAL_MODULE_NAME__S_ = makeString("(:KS ~S :EXTERNAL-MODULE-NAME ~S)");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_PRINT_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-PRINT-METHOD");

    private static final SubLSymbol GET_EXTERNAL_KNOWLEDGE_SOURCE_CLASS = makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLSymbol $sym300$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-METHOD");

    static private final SubLSymbol $sym301$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_EXTERNAL_KNOWLEDGE_SOURCE_ = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASS-METHOD");

    static private final SubLList $list_alt302 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-NAME"), list(makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("CLASS-NAME"), list(RET, list(makeSymbol("LIST"), makeSymbol("CLASS-NAME")))), list(RET, NIL)));

    static private final SubLSymbol $sym303$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_EXTERNAL_KNOWLEDGE_SOURCE_ = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD");

    static private final SubLList $list_alt304 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("KS-NAME"), makeSymbol("PORT-ID")), list(makeSymbol("CLET"), list(list(makeSymbol("ASSISTANT"), list(makeSymbol("CYBLACK-GET-KS-ASSISTANT"), makeSymbol("KS-NAME")))), list(makeSymbol("PWHEN"), makeSymbol("ASSISTANT"), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-NAME"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("CYBLACK-AUTO-GENERATED-KS-ASSISTANT")), makeSymbol("ASSISTANT")))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("EKS-CLASS"), makeSymbol("CLASS-NAME")), list(RET, makeSymbol("PORT-ID"))))))), list(RET, NIL));

    static private final SubLSymbol $sym305$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-METHOD");

    static private final SubLSymbol $sym306$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_PORT_ID_GIVEN_EXTERNAL_KNO = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLList $list_alt307 = list(list(RET, list(makeSymbol("LIST"), makeSymbol("EXTERNAL-MODULE-NAME"), list(makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("SELF")), makeSymbol("PORT-ID"))));

    static private final SubLSymbol $sym308$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_INFO_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-INFO-METHOD");

    private static final SubLSymbol INTERNAL_SET_EXTERNAL_MODULE_NAME = makeSymbol("INTERNAL-SET-EXTERNAL-MODULE-NAME");

    static private final SubLList $list_alt311 = list(list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("NEW-EXTERNAL-MODULE-NAME")), list(RET, makeSymbol("NEW-EXTERNAL-MODULE-NAME")));

    static private final SubLSymbol $sym312$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-METHOD");

    static private final SubLSymbol $sym313$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_INTERNAL_SET_EXTERNAL_MODULE_N = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-INTERNAL-SET-EXTERNAL-MODULE-NAME-METHOD");

    private static final SubLSymbol INTERNAL_SET_PORT_ID = makeSymbol("INTERNAL-SET-PORT-ID");

    static private final SubLList $list_alt315 = list(list(makeSymbol("CSETQ"), makeSymbol("PORT-ID"), makeSymbol("NEW-PORT-ID")), list(RET, makeSymbol("NEW-PORT-ID")));

    static private final SubLSymbol $sym316$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_INTERNAL_SET_PORT_ID_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-INTERNAL-SET-PORT-ID-METHOD");



    static private final SubLList $list_alt319 = list(list(RET, makeSymbol("EXTERNAL-MODULE-NAME")));

    static private final SubLSymbol $sym320$CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_EXTERNAL_MODULE_NAME_METHO = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-EXTERNAL-MODULE-NAME-METHOD");



    static private final SubLList $list_alt322 = list(list(RET, makeSymbol("PORT-ID")));

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_PORT_ID_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-PORT-ID-METHOD");

    static private final SubLSymbol $sym324$OUTER_CATCH_FOR_CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_INTERNAL_SET_KS_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-INTERNAL-SET-KS-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_DEFKS_EKS_REFERENCE_GET_KS_METHOD = makeSymbol("CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE-GET-KS-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE");

    static private final SubLList $list_alt328 = list(makeSymbol("CYBLACK-DEFKSB-NATIVE-KS-REFERENCE"), makeSymbol("CYBLACK-DEFKSB-EXTERNAL-KS-REFERENCE"));

    static private final SubLList $list_alt329 = list(new SubLObject[]{ list(makeSymbol("EXTERNAL-MODULE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PORT-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-EXTERNAL-MODULE-NAME"), list(makeSymbol("NEW-EXTERNAL-MODULE-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-PORT-ID"), list(makeSymbol("NEW-PORT-ID")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-MODULE-NAME"), list(makeSymbol("NEW-EXTERNAL-MODULE-NAME")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PORT-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PORT-ID"), list(makeSymbol("NEW-PORT-ID")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("KS-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROPOSAL-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KSI-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-KS-CLASS"), list(makeSymbol("NEW-KS-CLASS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-PROPOSAL-CLASS"), list(makeSymbol("NEW-PROPOSAL-CLASS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-KSI-CLASS"), list(makeSymbol("NEW-KSI-CLASS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KS-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KS-CLASS"), list(makeSymbol("NEW-KS-CLASS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROPOSAL-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROPOSAL-CLASS"), list(makeSymbol("NEW-PROPOSAL-CLASS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSI-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSI-CLASS"), list(makeSymbol("NEW-KSI-CLASS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("EKS-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INFO"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_SET_KSI_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-SET-KSI-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_SET_PROPOSAL_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-SET-PROPOSAL-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_SET_KS_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-SET-KS-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_SET_PORT_ID_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-SET-PORT-ID-METHOD");

    static private final SubLSymbol $sym334$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_SET_EXTERNAL_MODULE_NAME_METH = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-SET-EXTERNAL-MODULE-NAME-METHOD");

    static private final SubLSymbol $sym335$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-CLASS");

    static private final SubLSymbol $sym336$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INSTANCE");

    static private final SubLList $list_alt337 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PORT-ID"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KS-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE"))), list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-PROPOSAL"))), list(makeSymbol("CSETQ"), makeSymbol("KSI-CLASS"), list(QUOTE, makeSymbol("CYBLACK-BASIC-KSI"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym338$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INITIALIZE-METHOD");

    static private final SubLList $list_alt340 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:KS-CLASS ~S"), makeSymbol("KS-CLASS")), list(makeSymbol("PWHEN"), makeSymbol("PROPOSAL-CLASS"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :PROPOSAL-CLASS ~S"), makeSymbol("PROPOSAL-CLASS"))), list(makeSymbol("PWHEN"), makeSymbol("KSI-CLASS"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :KSI-CLASS ~S"), makeSymbol("KSI-CLASS"))), list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-MODULE-NAME"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :EXTERNAL-MODULE-NAME ~S"), makeSymbol("EXTERNAL-MODULE-NAME"))), list(makeSymbol("PWHEN"), makeSymbol("PORT-ID"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" :PORT-ID ~S"), makeSymbol("PORT-ID"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym341$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-METHOD");

    static private final SubLString $str_alt342$__EXTERNAL_MODULE_NAME__S = makeString(" :EXTERNAL-MODULE-NAME ~S");

    static private final SubLString $str_alt343$__PORT_ID__S = makeString(" :PORT-ID ~S");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_PRINT_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-PRINT-METHOD");

    static private final SubLSymbol $sym345$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-METHOD");

    static private final SubLSymbol $sym346$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_EXTERNAL_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES-METHOD");

    static private final SubLList $list_alt347 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(EQ, makeSymbol("KS-CLASS"), makeSymbol("EKS-CLASS"))), list(RET, makeSymbol("PORT-ID"))), list(RET, NIL));

    static private final SubLSymbol $sym348$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-METHOD");

    static private final SubLSymbol $sym349$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_PORT_ID_GIVEN_EXTERNAL_KN = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-PORT-ID-GIVEN-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym350$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-METHOD");

    static private final SubLSymbol $sym351$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INTERNAL_SET_EXTERNAL_MODULE_ = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INTERNAL-SET-EXTERNAL-MODULE-NAME-METHOD");

    static private final SubLSymbol $sym352$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INTERNAL_SET_PORT_ID_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INTERNAL-SET-PORT-ID-METHOD");

    static private final SubLSymbol $sym354$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_EXTERNAL_MODULE_NAME_METH = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-EXTERNAL-MODULE-NAME-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_PORT_ID_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-PORT-ID-METHOD");

    static private final SubLSymbol $sym356$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INTERNAL_SET_KS_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INTERNAL-SET-KS-CLASS-METHOD");

    static private final SubLSymbol $sym358$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-METHOD");

    static private final SubLSymbol $sym359$CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INTERNAL_SET_PROPOSAL_CLASS_M = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INTERNAL-SET-PROPOSAL-CLASS-METHOD");

    static private final SubLSymbol $sym360$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_INTERNAL_SET_KSI_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-INTERNAL-SET-KSI-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_KS_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-KS-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_PROPOSAL_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-PROPOSAL-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_KSI_CLASS_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-KSI-CLASS-METHOD");

    static private final SubLList $list_alt365 = list(list(RET, list(makeSymbol("LIST"), makeSymbol("EXTERNAL-MODULE-NAME"), makeSymbol("KS-CLASS"), makeSymbol("PORT-ID"))));

    static private final SubLSymbol $sym366$OUTER_CATCH_FOR_CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-METHOD");

    private static final SubLSymbol CYBLACK_DEFKSB_NATIVE_EKS_REFERENCE_GET_INFO_METHOD = makeSymbol("CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE-GET-INFO-METHOD");

    static private final SubLList $list_alt368 = list(makeKeyword("INTERNAL-KNOWLEDGE-SOURCES"), makeKeyword("EXTERNAL-KNOWLEDGE-SOURCES"), makeKeyword("ON-STARTUP"), makeKeyword("ON-SHUTDOWN"));

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_KEY = makeSymbol("CYBLACK-DEFKSB-BODY-KEY");

    static private final SubLString $str_alt370$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_DEFKSB_BODY_KEY = makeSymbol("ENCODE-CYBLACK-DEFKSB-BODY-KEY");

    static private final SubLString $str_alt372$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_DEFKSB_BODY_KEY = makeSymbol("DECODE-CYBLACK-DEFKSB-BODY-KEY");

    static private final SubLString $str_alt374$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_DEFKSB_BODY_KEY_P = makeSymbol("CYBLACK-DEFKSB-BODY-KEY-P");

    static private final SubLString $str_alt376$PARSE_CYBLACK_DEFKSB_BODY___S_is_ = makeString("PARSE-CYBLACK-DEFKSB-BODY: ~S is not a valid KSB body. ~\n     A list of the form ((:INTERNAL-KNOWLEDGE-SOURCES <IKS>*) (:EXTERNAL-KNOWLEDGE-SOURCES <EKS>*)) ~\n     was expected.");

    private static final SubLSymbol $INTERNAL_KNOWLEDGE_SOURCES = makeKeyword("INTERNAL-KNOWLEDGE-SOURCES");

    private static final SubLSymbol $EXTERNAL_KNOWLEDGE_SOURCES = makeKeyword("EXTERNAL-KNOWLEDGE-SOURCES");

    private static final SubLSymbol $ON_STARTUP = makeKeyword("ON-STARTUP");

    private static final SubLSymbol $ON_SHUTDOWN = makeKeyword("ON-SHUTDOWN");

    static private final SubLString $str_alt381$PARSE_CYBLACK_DEFKSB_INTERNAL_KS_ = makeString("PARSE-CYBLACK-DEFKSB-INTERNAL-KS-EXPRESSIONS: ~S is not a valid ~\n                    internal knowledge sources expression.  A list of the form ~\n                    (:INTERNAL-KNOWLEDGE-SOURCES <IKS>*) was expected.");

    static private final SubLList $list_alt382 = list(makeKeyword("KS"), makeKeyword("KS-CLASS"));

    static private final SubLString $str_alt383$PARSE_CYBLACK_DEFKSB_IKS_REFERENC = makeString("PARSE-CYBLACK-DEFKSB-IKS-REFERENCE: ~S is not a valid internal knowledge source reference. ~\n     A list of the form (:KS <knowledge source name>) or ~\n     (:KS-CLASS <knowledge source class> :PROPOSAL-CLASS <proposal class name> ~\n      :KSI-CLASS <knowledge source instantiation class name>) was expected.");



    private static final SubLSymbol $KS_CLASS = makeKeyword("KS-CLASS");

    static private final SubLString $str_alt386$PARSE_CYBLACK_DEFKSB_DEFKS_IKS_RE = makeString("PARSE-CYBLACK-DEFKSB-DEFKS-IKS-REFERENCE: ~S is not a valid internal knowledge source reference. ~\n     A list of the form (:KS <knowledge source name>), where <knowledge source name> is a non nil ~\n     symbol naming a knowledge source defined by the DEFINE-KNOWLEDGE-SOURCE special form ~\n     was expected.");

    static private final SubLList $list_alt387 = list(makeKeyword("KS-CLASS"), makeKeyword("PROPOSAL-CLASS"), makeKeyword("KSI-CLASS"));

    private static final SubLSymbol CYBLACK_NATIVE_IKS_REFERENCE_KEY = makeSymbol("CYBLACK-NATIVE-IKS-REFERENCE-KEY");

    private static final SubLSymbol ENCODE_CYBLACK_NATIVE_IKS_REFERENCE_KEY = makeSymbol("ENCODE-CYBLACK-NATIVE-IKS-REFERENCE-KEY");

    private static final SubLSymbol DECODE_CYBLACK_NATIVE_IKS_REFERENCE_KEY = makeSymbol("DECODE-CYBLACK-NATIVE-IKS-REFERENCE-KEY");

    private static final SubLSymbol CYBLACK_NATIVE_IKS_REFERENCE_KEY_P = makeSymbol("CYBLACK-NATIVE-IKS-REFERENCE-KEY-P");

    static private final SubLString $str_alt392$PARSE_CYBLACK_DEFKSB_NATIVE_IKS_R = makeString("PARSE-CYBLACK-DEFKSB-NATIVE-IKS-REFERENCE: ~S is not a valid native internal ~\n     knowledge source reference.  A list of the form (:KS-CLASS <ks class> ~\n     :PROPOSAL-CLASS <proposal class> :KSI-CLASS <ksi class>) was expected.");

    private static final SubLSymbol $PROPOSAL_CLASS = makeKeyword("PROPOSAL-CLASS");

    private static final SubLSymbol $KSI_CLASS = makeKeyword("KSI-CLASS");

    static private final SubLString $str_alt395$PARSE_CYBLACK_DEFKSB_EXTERNAL_KS_ = makeString("PARSE-CYBLACK-DEFKSB-EXTERNAL-KS-EXPRESSIONS: ~S is not a valid ~\n                    external knowledge sources expression.  A list of the form ~\n                    (:EXTERNAL-KNOWLEDGE-SOURCES <IKS>*) was expected.");

    static private final SubLString $str_alt396$PARSE_CYBLACK_DEFKSB_EKS_REFERENC = makeString("PARSE-CYBLACK-DEFKSB-EKS-REFERENCE: ~S is not a valid internal knowledge source reference. ~\n     A list of the form (:KS <knowledge source name> :EXTERNAL-MODULE-NAME <em name> ~\n     [:PORT <id>]) or ~\n     (:KS-CLASS <knowledge source class> :PROPOSAL-CLASS <proposal class name> ~\n      :KSI-CLASS <knowledge source instantiation class name> ~\n      :EXTERNAL-MODULE-NAME <em name> [:PORT <port id>]) was expected.");

    static private final SubLList $list_alt397 = list(makeKeyword("KS"), makeKeyword("EXTERNAL-MODULE-NAME"), $PORT);

    private static final SubLSymbol CYBLACK_DEFKS_EKS_KEY = makeSymbol("CYBLACK-DEFKS-EKS-KEY");

    private static final SubLSymbol ENCODE_CYBLACK_DEFKS_EKS_KEY = makeSymbol("ENCODE-CYBLACK-DEFKS-EKS-KEY");

    private static final SubLSymbol DECODE_CYBLACK_DEFKS_EKS_KEY = makeSymbol("DECODE-CYBLACK-DEFKS-EKS-KEY");

    private static final SubLSymbol CYBLACK_DEFKS_EKS_KEY_P = makeSymbol("CYBLACK-DEFKS-EKS-KEY-P");

    private static final SubLSymbol $EXTERNAL_MODULE_NAME = makeKeyword("EXTERNAL-MODULE-NAME");

    static private final SubLString $str_alt403$PARSE_CYBLACK_DEFKSB_DEFKS_EKS_RE = makeString("PARSE-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE: ~S is not a valid external knowledge source reference. ~\n     A list of the form (:KS <knowledge source name> :EXTERNAL-MODULE-NAME <em name> ~\n     [:PORT <port id>]) was expected.");



    static private final SubLString $str_alt405$PARSE_CYBLACK_DEFKSB_DEFKS_EKS_RE = makeString("PARSE-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE: ~S is not a valid knowledge source name.");

    static private final SubLString $str_alt406$PARSE_CYBLACK_DEFKSB_DEFKS_EKS_RE = makeString("PARSE-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE: ~S is not a valid external module name.");

    static private final SubLString $str_alt407$PARSE_CYBLACK_DEFKSB_DEFKS_EKS_RE = makeString("PARSE-CYBLACK-DEFKSB-DEFKS-EKS-REFERENCE: ~S is an unknown knowledge source.");

    static private final SubLList $list_alt408 = list(makeKeyword("KS-CLASS"), makeKeyword("PROPOSAL-CLASS"), makeKeyword("KSI-CLASS"), makeKeyword("EXTERNAL-MODULE-NAME"), $PORT);

    private static final SubLSymbol CYBLACK_NATIVE_EKS_KEY = makeSymbol("CYBLACK-NATIVE-EKS-KEY");

    private static final SubLSymbol ENCODE_CYBLACK_NATIVE_EKS_KEY = makeSymbol("ENCODE-CYBLACK-NATIVE-EKS-KEY");

    private static final SubLSymbol DECODE_CYBLACK_NATIVE_EKS_KEY = makeSymbol("DECODE-CYBLACK-NATIVE-EKS-KEY");

    private static final SubLSymbol CYBLACK_NATIVE_EKS_KEY_P = makeSymbol("CYBLACK-NATIVE-EKS-KEY-P");

    static private final SubLString $str_alt413$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R = makeString("PARSE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE: ~S is not a valid external module reference. ~\n     A list of the form (:KS-CLASS <ks class> [:PROPOSAL-CLASS <proposal class> :KSI-CLASS <ksi class> ~\n     :EXTERNAL-MODULE-NAME <em name> :PORT <port id>]) was expected.");

    static private final SubLString $str_alt414$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R = makeString("PARSE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE: ~S is not a valid class name.");

    static private final SubLList $list_alt415 = list(makeSymbol("KS-CLASS"), makeSymbol("PROPOSAL-CLASS"), makeSymbol("KSI-CLASS"));

    static private final SubLString $str_alt416$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R = makeString("PARSE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE: ~S is not a valid external module name.");

    static private final SubLString $str_alt417$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R = makeString("PARSE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE: ~S is not a valid port id.");

    static private final SubLString $str_alt418$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R = makeString("PARSE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE: ~S does not implement CYBLACK-KNOWLEDGE-SOURCE.");

    static private final SubLString $str_alt419$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R = makeString("PARSE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE: ~S does not implement CYBLACK-PROPOSAL.");

    static private final SubLString $str_alt420$PARSE_CYBLACK_DEFKSB_NATIVE_EKS_R = makeString("PARSE-CYBLACK-DEFKSB-NATIVE-EKS-REFERENCE: ~S does not implement CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION.");

    static private final SubLList $list_alt421 = list(makeKeyword("EXTENDS"), makeKeyword("IMPLEMENTS"));

    private static final SubLSymbol CYBLACK_DEFKSB_OPTIONS = makeSymbol("CYBLACK-DEFKSB-OPTIONS");

    private static final SubLSymbol ENCODE_CYBLACK_DEFKSB_OPTIONS = makeSymbol("ENCODE-CYBLACK-DEFKSB-OPTIONS");

    private static final SubLSymbol DECODE_CYBLACK_DEFKSB_OPTIONS = makeSymbol("DECODE-CYBLACK-DEFKSB-OPTIONS");

    private static final SubLSymbol CYBLACK_DEFKSB_OPTIONS_P = makeSymbol("CYBLACK-DEFKSB-OPTIONS-P");

    private static final SubLSymbol CYBLACK_KSB_INFO = makeSymbol("CYBLACK-KSB-INFO");

    static private final SubLList $list_alt427 = list(new SubLObject[]{ list(makeSymbol("KSB-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KSB-CLASS-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KSB-BODY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSB-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSB-NAME"), list(makeSymbol("NEW-KSB-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSB-CLASS-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSB-CLASS-NAME"), list(makeSymbol("NEW-KSB-CLASS-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSB-BODY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSB-BODY"), list(makeSymbol("NEW-KSB-BODY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-APPLICATION-BASE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONNECTION-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERNAL-MODULE-INFO-LIST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-MODULE-INFO-LIST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-KSB-INSTALLATION-EXPRESSIONS"), NIL, makeKeyword("PUBLIC")) });



    private static final SubLSymbol KSB_CLASS_NAME = makeSymbol("KSB-CLASS-NAME");

    private static final SubLSymbol KSB_NAME = makeSymbol("KSB-NAME");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_KSB_INFO_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-KSB-INFO-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_KSB_INFO_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-KSB-INFO-INSTANCE");

    static private final SubLList $list_alt433 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("KSB-NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KSB-CLASS-NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KSB-BODY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym434$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KSB-INFO-METHOD");

    private static final SubLSymbol CYBLACK_KSB_INFO_INITIALIZE_METHOD = makeSymbol("CYBLACK-KSB-INFO-INITIALIZE-METHOD");

    static private final SubLList $list_alt436 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-KSB-INFO(~S) ~S>"), makeSymbol("KSB-NAME"), makeSymbol("KSB-BODY")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt437$__CYBLACK_KSB_INFO__S___S_ = makeString("#<CYBLACK-KSB-INFO(~S) ~S>");

    private static final SubLSymbol CYBLACK_KSB_INFO_PRINT_METHOD = makeSymbol("CYBLACK-KSB-INFO-PRINT-METHOD");

    private static final SubLSymbol GET_KSB_NAME = makeSymbol("GET-KSB-NAME");

    static private final SubLList $list_alt440 = list(list(RET, makeSymbol("KSB-NAME")));

    private static final SubLSymbol CYBLACK_KSB_INFO_GET_KSB_NAME_METHOD = makeSymbol("CYBLACK-KSB-INFO-GET-KSB-NAME-METHOD");

    private static final SubLSymbol SET_KSB_NAME = makeSymbol("SET-KSB-NAME");

    static private final SubLList $list_alt443 = list(makeSymbol("NEW-KSB-NAME"));

    static private final SubLList $list_alt444 = list(list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-KSB-NAME")), makeString("(SET-KSB-NAME ~S): ~S is not a valid KSB name.  A symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-KSB-NAME")), list(makeSymbol("CSETQ"), makeSymbol("KSB-NAME"), makeSymbol("NEW-KSB-NAME")), list(RET, makeSymbol("NEW-KSB-NAME")));

    static private final SubLSymbol $sym445$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KSB-INFO-METHOD");

    static private final SubLString $str_alt446$_SET_KSB_NAME__S____S_is_not_a_va = makeString("(SET-KSB-NAME ~S): ~S is not a valid KSB name.  A symbol was expected.");

    private static final SubLSymbol CYBLACK_KSB_INFO_SET_KSB_NAME_METHOD = makeSymbol("CYBLACK-KSB-INFO-SET-KSB-NAME-METHOD");

    private static final SubLSymbol GET_KSB_CLASS_NAME = makeSymbol("GET-KSB-CLASS-NAME");

    static private final SubLList $list_alt449 = list(list(RET, makeSymbol("KSB-CLASS-NAME")));

    private static final SubLSymbol CYBLACK_KSB_INFO_GET_KSB_CLASS_NAME_METHOD = makeSymbol("CYBLACK-KSB-INFO-GET-KSB-CLASS-NAME-METHOD");

    private static final SubLSymbol SET_KSB_CLASS_NAME = makeSymbol("SET-KSB-CLASS-NAME");

    static private final SubLList $list_alt452 = list(makeSymbol("NEW-KSB-CLASS-NAME"));

    static private final SubLList $list_alt453 = list(list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-KSB-CLASS-NAME")), makeString("(SET-KSB-CLASS-NAME ~S): ~S is not a valid KSB class name.  A symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-KSB-CLASS-NAME")), list(makeSymbol("CSETQ"), makeSymbol("KSB-CLASS-NAME"), makeSymbol("NEW-KSB-CLASS-NAME")), list(RET, makeSymbol("NEW-KSB-CLASS-NAME")));

    static private final SubLSymbol $sym454$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KSB-INFO-METHOD");

    static private final SubLString $str_alt455$_SET_KSB_CLASS_NAME__S____S_is_no = makeString("(SET-KSB-CLASS-NAME ~S): ~S is not a valid KSB class name.  A symbol was expected.");

    private static final SubLSymbol CYBLACK_KSB_INFO_SET_KSB_CLASS_NAME_METHOD = makeSymbol("CYBLACK-KSB-INFO-SET-KSB-CLASS-NAME-METHOD");

    private static final SubLSymbol GET_KSB_BODY = makeSymbol("GET-KSB-BODY");

    static private final SubLList $list_alt458 = list(list(RET, makeSymbol("KSB-BODY")));

    private static final SubLSymbol CYBLACK_KSB_INFO_GET_KSB_BODY_METHOD = makeSymbol("CYBLACK-KSB-INFO-GET-KSB-BODY-METHOD");

    private static final SubLSymbol SET_KSB_BODY = makeSymbol("SET-KSB-BODY");

    static private final SubLList $list_alt461 = list(makeSymbol("NEW-KSB-BODY"));

    static private final SubLList $list_alt462 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-KSB-BODY")), list(makeSymbol("CYBLACK-DEFKSB-BODY-P"), makeSymbol("NEW-KSB-BODY"))), makeString("(SET-KSB-BODY ~S): ~S is not a valid KSB body."), makeSymbol("SELF"), makeSymbol("NEW-KSB-BODY")), list(makeSymbol("CSETQ"), makeSymbol("KSB-BODY"), makeSymbol("NEW-KSB-BODY")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym463$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KSB-INFO-METHOD");

    static private final SubLString $str_alt464$_SET_KSB_BODY__S____S_is_not_a_va = makeString("(SET-KSB-BODY ~S): ~S is not a valid KSB body.");

    private static final SubLSymbol CYBLACK_KSB_INFO_SET_KSB_BODY_METHOD = makeSymbol("CYBLACK-KSB-INFO-SET-KSB-BODY-METHOD");

    static private final SubLList $list_alt466 = list(list(makeSymbol("PWHEN"), makeSymbol("KSB-BODY"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DEFAULT-APPLICATION-BASE-CLASS"), makeSymbol("CYBLACK-DEFKSB-BODY")), makeSymbol("KSB-BODY")))), list(RET, NIL));

    static private final SubLSymbol $sym467$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KSB-INFO-METHOD");

    private static final SubLSymbol CYBLACK_KSB_INFO_GET_DEFAULT_APPLICATION_BASE_CLASS_METHOD = makeSymbol("CYBLACK-KSB-INFO-GET-DEFAULT-APPLICATION-BASE-CLASS-METHOD");

    private static final SubLSymbol GET_CONNECTION_CLASS = makeSymbol("GET-CONNECTION-CLASS");

    static private final SubLList $list_alt470 = list(list(makeSymbol("PWHEN"), makeSymbol("KSB-BODY"), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE-CLASSES"), makeSymbol("CYBLACK-DEFKSB-BODY")), makeSymbol("KSB-BODY")), list(RET, list(QUOTE, makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION"))))), list(RET, NIL));

    static private final SubLSymbol $sym471$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KSB-INFO-METHOD");

    private static final SubLSymbol CYBLACK_STANDARD_EXTERNAL_CONNECTION = makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION");

    private static final SubLSymbol CYBLACK_KSB_INFO_GET_CONNECTION_CLASS_METHOD = makeSymbol("CYBLACK-KSB-INFO-GET-CONNECTION-CLASS-METHOD");

    static private final SubLList $list_alt474 = list(list(makeSymbol("PWHEN"), makeSymbol("KSB-BODY"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-INTERNAL-MODULE-INFO-LIST"), makeSymbol("CYBLACK-DEFKSB-BODY")), makeSymbol("KSB-BODY")))), list(RET, NIL));

    static private final SubLSymbol $sym475$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KSB-INFO-METHOD");

    private static final SubLSymbol CYBLACK_KSB_INFO_GET_INTERNAL_MODULE_INFO_LIST_METHOD = makeSymbol("CYBLACK-KSB-INFO-GET-INTERNAL-MODULE-INFO-LIST-METHOD");

    static private final SubLList $list_alt477 = list(list(makeSymbol("PWHEN"), makeSymbol("KSB-BODY"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-MODULE-INFO-LIST"), makeSymbol("CYBLACK-DEFKSB-BODY")), makeSymbol("KSB-BODY")))), list(RET, NIL));

    static private final SubLSymbol $sym478$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KSB-INFO-METHOD");

    private static final SubLSymbol CYBLACK_KSB_INFO_GET_EXTERNAL_MODULE_INFO_LIST_METHOD = makeSymbol("CYBLACK-KSB-INFO-GET-EXTERNAL-MODULE-INFO-LIST-METHOD");

    private static final SubLSymbol COMPILE_TO_KSB_INSTALLATION_EXPRESSIONS = makeSymbol("COMPILE-TO-KSB-INSTALLATION-EXPRESSIONS");

    static private final SubLList $list_alt481 = list(list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("CONNECTION-CLASS"), list(makeSymbol("GET-CONNECTION-CLASS"), makeSymbol("SELF"))), list(makeSymbol("CONNECTION-CLASS-EXPRESSIONS"), list(makeSymbol("FIF"), makeSymbol("CONNECTION-CLASS"), list(makeSymbol("COPY-TREE"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("SET-CONNECTION-CLASS")), list(QUOTE, makeSymbol("SELF")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("CONNECTION-CLASS"))))), NIL)), list(makeSymbol("MESSAGE-BROKER-EXPRESSIONS"), list(makeSymbol("FIF"), makeSymbol("CONNECTION-CLASS"), list(makeSymbol("COPY-TREE"), list(QUOTE, list(list(makeSymbol("SET-MESSAGE-BROKER-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-MESSAGE-BROKER")))))), NIL)), list(makeSymbol("INTERNAL-MODULE-INFO-LIST"), list(makeSymbol("GET-INTERNAL-MODULE-INFO-LIST"), makeSymbol("SELF"))), list(makeSymbol("EXTERNAL-MODULE-INFO-LIST"), list(makeSymbol("GET-EXTERNAL-MODULE-INFO-LIST"), makeSymbol("SELF"))), list(makeSymbol("KSB-VAR"), list(makeSymbol("MAKE-SYMBOL"), makeString("ksb"))), list(makeSymbol("NAME-VAR"), list(makeSymbol("MAKE-SYMBOL"), makeString("name"))), list(makeSymbol("KS-CLASS-VAR"), list(makeSymbol("MAKE-SYMBOL"), makeString("ks-class"))), list(makeSymbol("PORT-VAR"), list(makeSymbol("MAKE-SYMBOL"), makeString("port"))), list(makeSymbol("TRIPLET-VAR"), list(makeSymbol("MAKE-SYMBOL"), makeString("triplet"))), list(makeSymbol("PAIR-VAR"), list(makeSymbol("MAKE-SYMBOL"), makeString("pair-var"))) }), list(RET, list(makeSymbol("BQ-APPEND"), makeSymbol("CONNECTION-CLASS-EXPRESSIONS"), makeSymbol("MESSAGE-BROKER-EXPRESSIONS"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("CLET")), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), makeSymbol("KSB-VAR"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("NEW-OBJECT-INSTANCE")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("KSB-CLASS-NAME")))), list(makeSymbol("BQ-CONS"), makeSymbol("NAME-VAR"), list(QUOTE, list(NIL))), list(makeSymbol("BQ-CONS"), makeSymbol("KS-CLASS-VAR"), list(QUOTE, list(NIL))), list(makeSymbol("BQ-CONS"), makeSymbol("PORT-VAR"), list(QUOTE, list(NIL)))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("CYBLACK-SILENCE")), makeSymbol("NAME-VAR")), list(makeSymbol("BQ-APPEND"), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE-INFO-LIST"), NIL, list(makeSymbol("COPY-TREE"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("IGNORE")), makeSymbol("PORT-VAR"))))), list(makeSymbol("FIF"), makeSymbol("EXTERNAL-MODULE-INFO-LIST"), list(makeSymbol("COPY-TREE"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("CDOLIST")), list(makeSymbol("BQ-LIST"), makeSymbol("TRIPLET-VAR"), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("EXTERNAL-MODULE-INFO-LIST"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("CSETQ")), makeSymbol("NAME-VAR"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("FIRST")), makeSymbol("TRIPLET-VAR"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("CSETQ")), makeSymbol("KS-CLASS-VAR"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("SECOND")), makeSymbol("TRIPLET-VAR"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("CSETQ")), makeSymbol("PORT-VAR"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("THIRD")), makeSymbol("TRIPLET-VAR"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("INLINE-METHOD")), list(QUOTE, list(makeSymbol("ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY"))), makeSymbol("KSB-VAR"), makeSymbol("KS-CLASS-VAR")), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("INLINE-METHOD")), list(QUOTE, list(makeSymbol("ADD-EKSC-TO-PORT-ID-ASSOCIATION"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY"))), makeSymbol("KSB-VAR"), makeSymbol("KS-CLASS-VAR"), makeSymbol("PORT-VAR"))))), NIL), list(makeSymbol("FIF"), makeSymbol("INTERNAL-MODULE-INFO-LIST"), list(makeSymbol("COPY-TREE"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("CDOLIST")), list(makeSymbol("BQ-LIST"), makeSymbol("PAIR-VAR"), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("INTERNAL-MODULE-INFO-LIST"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("CSETQ")), makeSymbol("NAME-VAR"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("FIRST")), makeSymbol("PAIR-VAR"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("CSETQ")), makeSymbol("KS-CLASS-VAR"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("SECOND")), makeSymbol("PAIR-VAR"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("FUNCALL-INSTANCE-METHOD")), makeSymbol("KSB-VAR"), list(QUOTE, list(QUOTE, makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS"))), makeSymbol("KS-CLASS-VAR"))))), NIL), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("INSTALL-KNOWLEDGE-SOURCE-BATTERY")), list(QUOTE, makeSymbol("SELF")), makeSymbol("KSB-VAR"))))))))));

    static private final SubLSymbol $sym482$OUTER_CATCH_FOR_CYBLACK_KSB_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-KSB-INFO-METHOD");

    private static final SubLSymbol SET_CONNECTION_CLASS = makeSymbol("SET-CONNECTION-CLASS");





    static private final SubLList $list_alt486 = list(list(makeSymbol("SET-MESSAGE-BROKER-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-MESSAGE-BROKER"))));

    static private final SubLString $$$ksb = makeString("ksb");

    static private final SubLString $$$name = makeString("name");

    static private final SubLString $str_alt489$ks_class = makeString("ks-class");

    static private final SubLString $$$port = makeString("port");

    static private final SubLString $$$triplet = makeString("triplet");

    static private final SubLString $str_alt492$pair_var = makeString("pair-var");





    static private final SubLList $list_alt495 = list(NIL);

















    static private final SubLList $list_alt504 = list(makeSymbol("ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY"));

    static private final SubLList $list_alt505 = list(makeSymbol("ADD-EKSC-TO-PORT-ID-ASSOCIATION"), makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-BATTERY"));



    static private final SubLList $list_alt507 = list(QUOTE, makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS"));

    private static final SubLSymbol INSTALL_KNOWLEDGE_SOURCE_BATTERY = makeSymbol("INSTALL-KNOWLEDGE-SOURCE-BATTERY");

    private static final SubLSymbol CYBLACK_KSB_INFO_COMPILE_TO_KSB_INSTALLATION_EXPRESSIONS_METHOD = makeSymbol("CYBLACK-KSB-INFO-COMPILE-TO-KSB-INSTALLATION-EXPRESSIONS-METHOD");

    static private final SubLString $str_alt510$CYBLACK_SET_KSB_INFO___S_is_not_a = makeString("CYBLACK-SET-KSB-INFO: ~S is not a non nil symbol.");

    static private final SubLString $str_alt511$CYBLACK_SET_KSB_INFO___S_is_not_a = makeString("CYBLACK-SET-KSB-INFO: ~S is not an instance of CYBLACK-KSB-INFO.");

    private static final SubLSymbol $CYBLACK_KSB_INFO = makeKeyword("CYBLACK-KSB-INFO");

    static private final SubLString $str_alt513$CYBLACK_GET_KSB_INFO___S_is_not_a = makeString("CYBLACK-GET-KSB-INFO: ~S is not a non nil symbol.");

    static private final SubLString $str_alt514$CYBLACK_GET_KSB_INFO___S_refers_t = makeString("CYBLACK-GET-KSB-INFO: ~S refers to invalid KSB info object ~S.");

    static private final SubLList $list_alt515 = list(cons(makeSymbol("BATTERY-NAME"), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("DEFKSB-BODY"));

    static private final SubLString $str_alt516$DEFINE_KNOWLEDGE_SOURCE_BATTERY__ = makeString("DEFINE-KNOWLEDGE-SOURCE-BATTERY: ~S is not a valid knowledge source battery name. ~\n     A symbol was expected.");

    static private final SubLString $str_alt517$DEFINE_KNOWLEDGE_SOURCE_BATTERY__ = makeString("DEFINE-KNOWLEDGE-SOURCE-BATTERY: ~S is a valid knowledge source battery options list.");

    static private final SubLString $str_alt518$DEFINE_KNOWLEDGE_SOURCE_BATTERY__ = makeString("DEFINE-KNOWLEDGE-SOURCE-BATTERY: ~S is not a valid DEFINE-KNOWLEDGE-SOURCE-BATTERY body.");





    static private final SubLString $str_alt521$DEFINE_KNOWLEDGE_SOURCE_BATTERY__ = makeString("DEFINE-KNOWLEDGE-SOURCE-BATTERY: ~S is not a subclass of CYBLACK-DEFKSB-BASE.");

    private static final SubLSymbol ADD_INTERNAL_KNOWLEDGE_SOURCE_CLASS = makeSymbol("ADD-INTERNAL-KNOWLEDGE-SOURCE-CLASS");

    private static final SubLSymbol ADD_EXTERNAL_KNOWLEDGE_SOURCE_CLASS = makeSymbol("ADD-EXTERNAL-KNOWLEDGE-SOURCE-CLASS");

    private static final SubLSymbol ADD_EKSC_TO_PORT_ID_ASSOCIATION = makeSymbol("ADD-EKSC-TO-PORT-ID-ASSOCIATION");





    static private final SubLList $list_alt527 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")));



    static private final SubLList $list_alt529 = list(makeSymbol("INITIALIZE"), makeSymbol("SUPER"));

    static private final SubLList $list_alt530 = list(list(RET, makeSymbol("SELF")));

    static private final SubLList $list_alt531 = list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER"));



    static private final SubLList $list_alt533 = list(makeSymbol("ON-SHUTDOWN"), makeSymbol("SUPER"));

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_defksb_file();
    }

    public void initializeVariables() {
        init_cyblack_defksb_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_defksb_file();
    }
}

