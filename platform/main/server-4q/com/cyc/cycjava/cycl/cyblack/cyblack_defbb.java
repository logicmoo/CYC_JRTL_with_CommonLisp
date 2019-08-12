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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-DEFBB
 *  source file: /cyc/top/cycl/cyblack/cyblack-defbb.lisp
 *  created:     2019/07/03 17:38:50
 */
public final class cyblack_defbb extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_defbb() {
    }

    public static final SubLFile me = new cyblack_defbb();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_defbb";

    // // Definitions
    /**
     * Enumerated values of type CYBLACK-DEFBB-OPTION-KEYWORD.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_defbb_option_keywords$ = makeSymbol("*VALID-CYBLACK-DEFBB-OPTION-KEYWORDS*");

    /**
     * Returns a list of all valid members of the CYBLACK-DEFBB-OPTION-KEYWORD enumeration.
     */
    public static final SubLObject valid_cyblack_defbb_option_keywords() {
        return $valid_cyblack_defbb_option_keywords$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-DEFBB-OPTION-KEYWORD enumeration.
     */
    public static final SubLObject cyblack_defbb_option_keyword_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_defbb_option_keywords$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-DEFBB-OPTION-KEYWORD enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_defbb_option_keyword(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_defbb_option_keywords$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_DEFBB_OPTION_KEYWORD, value, CYBLACK_DEFBB_OPTION_KEYWORD);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-DEFBB-OPTION-KEYWORD enumeration.
     */
    public static final SubLObject decode_cyblack_defbb_option_keyword(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_defbb_option_keywords$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_DEFBB_OPTION_KEYWORD, value, CYBLACK_DEFBB_OPTION_KEYWORD);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-DEFBB-OPTION-KEYWORD enumeration.
     */
    public static final SubLObject cyblack_defbb_option_keyword_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_option_keyword_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_OPTION_KEYWORD_P, value1, CYBLACK_DEFBB_OPTION_KEYWORD);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_option_keyword_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_OPTION_KEYWORD_P, value2, CYBLACK_DEFBB_OPTION_KEYWORD);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defbb_option_keywords$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-DEFBB-OPTION-KEYWORD enumeration.
     */
    public static final SubLObject cyblack_defbb_option_keyword_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_option_keyword_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_OPTION_KEYWORD_P, value1, CYBLACK_DEFBB_OPTION_KEYWORD);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_option_keyword_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_OPTION_KEYWORD_P, value2, CYBLACK_DEFBB_OPTION_KEYWORD);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defbb_option_keywords$.getGlobalValue();
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

    /**
     * Enumerated values of type CYBLACK-DEFBB-BODY-KEYWORD.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_defbb_body_keywords$ = makeSymbol("*VALID-CYBLACK-DEFBB-BODY-KEYWORDS*");

    /**
     * Returns a list of all valid members of the CYBLACK-DEFBB-BODY-KEYWORD enumeration.
     */
    public static final SubLObject valid_cyblack_defbb_body_keywords() {
        return $valid_cyblack_defbb_body_keywords$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-DEFBB-BODY-KEYWORD enumeration.
     */
    public static final SubLObject cyblack_defbb_body_keyword_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_defbb_body_keywords$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-DEFBB-BODY-KEYWORD enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_defbb_body_keyword(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_defbb_body_keywords$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_DEFBB_BODY_KEYWORD, value, CYBLACK_DEFBB_BODY_KEYWORD);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-DEFBB-BODY-KEYWORD enumeration.
     */
    public static final SubLObject decode_cyblack_defbb_body_keyword(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_defbb_body_keywords$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_DEFBB_BODY_KEYWORD, value, CYBLACK_DEFBB_BODY_KEYWORD);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-DEFBB-BODY-KEYWORD enumeration.
     */
    public static final SubLObject cyblack_defbb_body_keyword_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_body_keyword_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_BODY_KEYWORD_P, value1, CYBLACK_DEFBB_BODY_KEYWORD);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_body_keyword_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_BODY_KEYWORD_P, value2, CYBLACK_DEFBB_BODY_KEYWORD);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defbb_body_keywords$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-DEFBB-BODY-KEYWORD enumeration.
     */
    public static final SubLObject cyblack_defbb_body_keyword_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_body_keyword_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_BODY_KEYWORD_P, value1, CYBLACK_DEFBB_BODY_KEYWORD);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_body_keyword_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_BODY_KEYWORD_P, value2, CYBLACK_DEFBB_BODY_KEYWORD);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defbb_body_keywords$.getGlobalValue();
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

    public static final SubLObject cyblack_valid_body_p(SubLObject list) {
        if (!list.isList()) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = list;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (!(element.isCons() && (NIL != cyblack_defbb_body_keyword_p(element.first())))) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static final SubLObject get_cyblack_defbb_expression_children(SubLObject cyblack_defbb_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_expression, TWO_INTEGER, CHILDREN);
    }

    public static final SubLObject set_cyblack_defbb_expression_children(SubLObject cyblack_defbb_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_expression, value, TWO_INTEGER, CHILDREN);
    }

    public static final SubLObject get_cyblack_defbb_expression_parent(SubLObject cyblack_defbb_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_expression, ONE_INTEGER, PARENT);
    }

    public static final SubLObject set_cyblack_defbb_expression_parent(SubLObject cyblack_defbb_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_expression, value, ONE_INTEGER, PARENT);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_expression_p(SubLObject cyblack_defbb_expression) {
        return classes.subloop_instanceof_class(cyblack_defbb_expression, CYBLACK_DEFBB_EXPRESSION);
    }

    public static final SubLObject cyblack_defbb_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_expression_method = NIL;
            SubLObject children = get_cyblack_defbb_expression_children(self);
            SubLObject parent = get_cyblack_defbb_expression_parent(self);
            try {
                try {
                    object.object_initialize_method(self);
                    parent = NIL;
                    children = NIL;
                    sublisp_throw($sym26$OUTER_CATCH_FOR_CYBLACK_DEFBB_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_expression_children(self, children);
                            set_cyblack_defbb_expression_parent(self, parent);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_expression_method = Errors.handleThrowable(ccatch_env_var, $sym26$OUTER_CATCH_FOR_CYBLACK_DEFBB_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defbb_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject cdolist_list_var = cyblack_defbb_expression_get_children_method(self);
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                print(child, stream);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_defbb_expression_get_parent_method(SubLObject self) {
        {
            SubLObject parent = get_cyblack_defbb_expression_parent(self);
            return parent;
        }
    }

    public static final SubLObject cyblack_defbb_expression_set_parent_method(SubLObject self, SubLObject new_parent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defbb_expression_method = NIL;
                SubLObject parent = get_cyblack_defbb_expression_parent(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_parent) || (NIL != cyblack_defbb_expression_p(new_parent)))) {
                                Errors.error($str_alt41$_SET_PARENT__S____S_is_not_an_ins, self, new_parent);
                            }
                        }
                        parent = new_parent;
                        if (NIL != parent) {
                            cyblack_defbb_expression_add_child_method(parent, self);
                        }
                        sublisp_throw($sym40$OUTER_CATCH_FOR_CYBLACK_DEFBB_EXPRESSION_METHOD, parent);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defbb_expression_parent(self, parent);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defbb_expression_method = Errors.handleThrowable(ccatch_env_var, $sym40$OUTER_CATCH_FOR_CYBLACK_DEFBB_EXPRESSION_METHOD);
                }
                return catch_var_for_cyblack_defbb_expression_method;
            }
        }
    }

    public static final SubLObject cyblack_defbb_expression_add_child_method(SubLObject self, SubLObject new_child) {
        {
            SubLObject children = get_cyblack_defbb_expression_children(self);
            if (NIL == subl_promotions.memberP(new_child, children, UNPROVIDED, UNPROVIDED)) {
                children = nconc(children, list(new_child));
                set_cyblack_defbb_expression_children(self, children);
            }
            return new_child;
        }
    }

    public static final SubLObject cyblack_defbb_expression_get_children_method(SubLObject self) {
        {
            SubLObject children = get_cyblack_defbb_expression_children(self);
            return children;
        }
    }

    public static final SubLObject get_cyblack_defbb_type_graph_expression_type_declarations(SubLObject cyblack_defbb_type_graph_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_type_graph_expression, THREE_INTEGER, TYPE_DECLARATIONS);
    }

    public static final SubLObject set_cyblack_defbb_type_graph_expression_type_declarations(SubLObject cyblack_defbb_type_graph_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_type_graph_expression, value, THREE_INTEGER, TYPE_DECLARATIONS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_type_graph_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_type_graph_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, TYPE_DECLARATIONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_type_graph_expression_p(SubLObject cyblack_defbb_type_graph_expression) {
        return classes.subloop_instanceof_class(cyblack_defbb_type_graph_expression, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION);
    }

    public static final SubLObject cyblack_defbb_type_graph_expression_intialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_graph_expression_method = NIL;
            SubLObject type_declarations = get_cyblack_defbb_type_graph_expression_type_declarations(self);
            try {
                try {
                    object.object_initialize_method(self);
                    type_declarations = NIL;
                    sublisp_throw($sym57$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_graph_expression_type_declarations(self, type_declarations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_graph_expression_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defbb_type_graph_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_graph_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_graph_expression_method = NIL;
            SubLObject type_declarations = get_cyblack_defbb_type_graph_expression_type_declarations(self);
            try {
                try {
                    format(stream, $str_alt61$__TYPE_GRAPH);
                    {
                        SubLObject cdolist_list_var = type_declarations;
                        SubLObject type_decl = NIL;
                        for (type_decl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type_decl = cdolist_list_var.first()) {
                            format(stream, $str_alt62$__S, type_decl);
                        }
                    }
                    format(stream, $str_alt63$_);
                    sublisp_throw($sym60$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_graph_expression_type_declarations(self, type_declarations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_graph_expression_method = Errors.handleThrowable(ccatch_env_var, $sym60$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defbb_type_graph_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_graph_expression_get_type_declarations_method(SubLObject self) {
        {
            SubLObject type_declarations = get_cyblack_defbb_type_graph_expression_type_declarations(self);
            return type_declarations;
        }
    }

    public static final SubLObject cyblack_defbb_type_graph_expression_set_type_declarations_method(SubLObject self, SubLObject new_declarations) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_deffbb_type_declaration_list_p(new_declarations)) {
                    Errors.error($str_alt72$_SET_TYPE_DECLARATIONS__S____S_is, self, new_declarations);
                }
            }
            set_cyblack_defbb_type_graph_expression_type_declarations(self, copy_list(new_declarations));
            {
                SubLObject cdolist_list_var = new_declarations;
                SubLObject declaration = NIL;
                for (declaration = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , declaration = cdolist_list_var.first()) {
                    cyblack_defbb_expression_add_child_method(self, declaration);
                }
            }
            return new_declarations;
        }
    }

    public static final SubLObject cyblack_defbb_type_graph_expression_add_type_declaration_method(SubLObject self, SubLObject new_declaration) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defbb_type_graph_expression_method = NIL;
                SubLObject type_declarations = get_cyblack_defbb_type_graph_expression_type_declarations(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_declaration) || (NIL != cyblack_deffbb_type_declaration_p(new_declaration)))) {
                                Errors.error($str_alt78$_ADD_TYPE_DECLARATION__S____S_is_, self, new_declaration);
                            }
                        }
                        type_declarations = nconc(type_declarations, list(new_declaration));
                        sublisp_throw($sym77$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_METHOD, new_declaration);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defbb_type_graph_expression_type_declarations(self, type_declarations);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defbb_type_graph_expression_method = Errors.handleThrowable(ccatch_env_var, $sym77$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_METHOD);
                }
                return catch_var_for_cyblack_defbb_type_graph_expression_method;
            }
        }
    }

    public static final SubLObject get_cyblack_deffbb_type_declaration_type_string(SubLObject cyblack_deffbb_type_declaration) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_deffbb_type_declaration, THREE_INTEGER, TYPE_STRING);
    }

    public static final SubLObject set_cyblack_deffbb_type_declaration_type_string(SubLObject cyblack_deffbb_type_declaration, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_deffbb_type_declaration, value, THREE_INTEGER, TYPE_STRING);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_deffbb_type_declaration_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_deffbb_type_declaration_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFFBB_TYPE_DECLARATION, TYPE_STRING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_deffbb_type_declaration_p(SubLObject cyblack_deffbb_type_declaration) {
        return classes.subloop_instanceof_class(cyblack_deffbb_type_declaration, CYBLACK_DEFFBB_TYPE_DECLARATION);
    }

    public static final SubLObject cyblack_deffbb_type_declaration_list_p(SubLObject list) {
        if (!list.isList()) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = list;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (NIL == cyblack_deffbb_type_declaration_p(element)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static final SubLObject cyblack_deffbb_type_declaration_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_deffbb_type_declaration_method = NIL;
            SubLObject type_string = get_cyblack_deffbb_type_declaration_type_string(self);
            try {
                try {
                    cyblack_defbb_expression_initialize_method(self);
                    type_string = NIL;
                    sublisp_throw($sym86$OUTER_CATCH_FOR_CYBLACK_DEFFBB_TYPE_DECLARATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_deffbb_type_declaration_type_string(self, type_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_deffbb_type_declaration_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_CYBLACK_DEFFBB_TYPE_DECLARATION_METHOD);
            }
            return catch_var_for_cyblack_deffbb_type_declaration_method;
        }
    }

    public static final SubLObject cyblack_deffbb_type_declaration_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt89$__CYBLACK_DEFFBB_TYPE_DECLARATION);
        return self;
    }

    public static final SubLObject cyblack_deffbb_type_declaration_get_type_string_method(SubLObject self) {
        {
            SubLObject type_string = get_cyblack_deffbb_type_declaration_type_string(self);
            return type_string;
        }
    }

    public static final SubLObject cyblack_deffbb_type_declaration_set_type_string_method(SubLObject self, SubLObject new_type_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_deffbb_type_declaration_method = NIL;
                SubLObject type_string = get_cyblack_deffbb_type_declaration_type_string(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_type_string) || (NIL != cyblack_defks.cyblack_datatype_string_p(new_type_string)))) {
                                Errors.error($str_alt98$_SET_TYPE_STRING__S____S_is_not_a, self, new_type_string);
                            }
                        }
                        type_string = new_type_string;
                        sublisp_throw($sym97$OUTER_CATCH_FOR_CYBLACK_DEFFBB_TYPE_DECLARATION_METHOD, type_string);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_deffbb_type_declaration_type_string(self, type_string);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_deffbb_type_declaration_method = Errors.handleThrowable(ccatch_env_var, $sym97$OUTER_CATCH_FOR_CYBLACK_DEFFBB_TYPE_DECLARATION_METHOD);
                }
                return catch_var_for_cyblack_deffbb_type_declaration_method;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_root_type_declaration_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_root_type_declaration_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFFBB_TYPE_DECLARATION, TYPE_STRING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_root_type_declaration_p(SubLObject cyblack_defbb_root_type_declaration) {
        return classes.subloop_instanceof_class(cyblack_defbb_root_type_declaration, CYBLACK_DEFBB_ROOT_TYPE_DECLARATION);
    }

    public static final SubLObject cyblack_defbb_root_type_declaration_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defbb_root_type_declaration_method = NIL;
            SubLObject type_string = get_cyblack_deffbb_type_declaration_type_string(self);
            try {
                try {
                    format(stream, $str_alt106$__ROOT_TYPE__S_, type_string);
                    sublisp_throw($sym105$OUTER_CATCH_FOR_CYBLACK_DEFBB_ROOT_TYPE_DECLARATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_deffbb_type_declaration_type_string(self, type_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_root_type_declaration_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_CYBLACK_DEFBB_ROOT_TYPE_DECLARATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_root_type_declaration_method;
        }
    }

    public static final SubLObject get_cyblack_deffbb_subtype_declaration_supertype_string(SubLObject cyblack_deffbb_subtype_declaration) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_deffbb_subtype_declaration, FOUR_INTEGER, SUPERTYPE_STRING);
    }

    public static final SubLObject set_cyblack_deffbb_subtype_declaration_supertype_string(SubLObject cyblack_deffbb_subtype_declaration, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_deffbb_subtype_declaration, value, FOUR_INTEGER, SUPERTYPE_STRING);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_deffbb_subtype_declaration_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_deffbb_subtype_declaration_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFFBB_TYPE_DECLARATION, TYPE_STRING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFFBB_SUBTYPE_DECLARATION, SUPERTYPE_STRING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_deffbb_subtype_declaration_p(SubLObject cyblack_deffbb_subtype_declaration) {
        return classes.subloop_instanceof_class(cyblack_deffbb_subtype_declaration, CYBLACK_DEFFBB_SUBTYPE_DECLARATION);
    }

    public static final SubLObject cyblack_deffbb_subtype_declaration_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_deffbb_subtype_declaration_method = NIL;
            SubLObject supertype_string = get_cyblack_deffbb_subtype_declaration_supertype_string(self);
            try {
                try {
                    cyblack_deffbb_type_declaration_initialize_method(self);
                    supertype_string = NIL;
                    sublisp_throw($sym114$OUTER_CATCH_FOR_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_deffbb_subtype_declaration_supertype_string(self, supertype_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_deffbb_subtype_declaration_method = Errors.handleThrowable(ccatch_env_var, $sym114$OUTER_CATCH_FOR_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_METHOD);
            }
            return catch_var_for_cyblack_deffbb_subtype_declaration_method;
        }
    }

    public static final SubLObject cyblack_deffbb_subtype_declaration_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_deffbb_subtype_declaration_method = NIL;
            SubLObject supertype_string = get_cyblack_deffbb_subtype_declaration_supertype_string(self);
            SubLObject type_string = get_cyblack_deffbb_type_declaration_type_string(self);
            try {
                try {
                    format(stream, $str_alt118$__SUBTYPE__S__S_, type_string, supertype_string);
                    sublisp_throw($sym117$OUTER_CATCH_FOR_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_deffbb_subtype_declaration_supertype_string(self, supertype_string);
                            set_cyblack_deffbb_type_declaration_type_string(self, type_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_deffbb_subtype_declaration_method = Errors.handleThrowable(ccatch_env_var, $sym117$OUTER_CATCH_FOR_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_METHOD);
            }
            return catch_var_for_cyblack_deffbb_subtype_declaration_method;
        }
    }

    public static final SubLObject cyblack_deffbb_subtype_declaration_get_supertype_string_method(SubLObject self) {
        {
            SubLObject supertype_string = get_cyblack_deffbb_subtype_declaration_supertype_string(self);
            return supertype_string;
        }
    }

    public static final SubLObject cyblack_deffbb_subtype_declaration_set_supertype_string_method(SubLObject self, SubLObject new_supertype_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_deffbb_subtype_declaration_method = NIL;
                SubLObject supertype_string = get_cyblack_deffbb_subtype_declaration_supertype_string(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_supertype_string) || (NIL != cyblack_defks.cyblack_datatype_string_p(new_supertype_string)))) {
                                Errors.error($str_alt98$_SET_TYPE_STRING__S____S_is_not_a, self, new_supertype_string);
                            }
                        }
                        supertype_string = new_supertype_string;
                        sublisp_throw($sym126$OUTER_CATCH_FOR_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_METHOD, new_supertype_string);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_deffbb_subtype_declaration_supertype_string(self, supertype_string);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_deffbb_subtype_declaration_method = Errors.handleThrowable(ccatch_env_var, $sym126$OUTER_CATCH_FOR_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_METHOD);
                }
                return catch_var_for_cyblack_deffbb_subtype_declaration_method;
            }
        }
    }

    public static final SubLObject get_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(SubLObject cyblack_defbb_type_to_posting_class_map_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_type_to_posting_class_map_expression, THREE_INTEGER, POSTING_CLASS_ASSOCIATIONS);
    }

    public static final SubLObject set_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(SubLObject cyblack_defbb_type_to_posting_class_map_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_type_to_posting_class_map_expression, value, THREE_INTEGER, POSTING_CLASS_ASSOCIATIONS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_type_to_posting_class_map_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_type_to_posting_class_map_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, POSTING_CLASS_ASSOCIATIONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_type_to_posting_class_map_expression_p(SubLObject cyblack_defbb_type_to_posting_class_map_expression) {
        return classes.subloop_instanceof_class(cyblack_defbb_type_to_posting_class_map_expression, CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION);
    }

    public static final SubLObject cyblack_defbb_type_to_posting_class_map_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method = NIL;
            SubLObject posting_class_associations = get_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(self);
            try {
                try {
                    cyblack_defbb_expression_initialize_method(self);
                    posting_class_associations = NIL;
                    sublisp_throw($sym134$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(self, posting_class_associations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method = Errors.handleThrowable(ccatch_env_var, $sym134$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO);
            }
            return catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_to_posting_class_map_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method = NIL;
            SubLObject posting_class_associations = get_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(self);
            try {
                try {
                    format(stream, $str_alt138$__TYPE_TO_POSTING_CLASS_MAP);
                    {
                        SubLObject cdolist_list_var = posting_class_associations;
                        SubLObject association = NIL;
                        for (association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , association = cdolist_list_var.first()) {
                            format(stream, $str_alt62$__S, association);
                        }
                    }
                    format(stream, $str_alt63$_);
                    sublisp_throw($sym137$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(self, posting_class_associations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method = Errors.handleThrowable(ccatch_env_var, $sym137$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO);
            }
            return catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_to_posting_class_map_expression_get_posting_class_associations_method(SubLObject self) {
        {
            SubLObject posting_class_associations = get_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(self);
            return posting_class_associations;
        }
    }

    public static final SubLObject cyblack_defbb_type_to_posting_class_map_expression_set_posting_class_associations_method(SubLObject self, SubLObject new_posting_class_associations) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method = NIL;
            SubLObject posting_class_associations = get_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(self);
            try {
                try {
                    posting_class_associations = copy_list(new_posting_class_associations);
                    sublisp_throw($sym146$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO, new_posting_class_associations);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(self, posting_class_associations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method = Errors.handleThrowable(ccatch_env_var, $sym146$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO);
            }
            return catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_to_posting_class_map_expression_add_posting_class_association_method(SubLObject self, SubLObject new_posting_class_association) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method = NIL;
            SubLObject posting_class_associations = get_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(self);
            try {
                try {
                    posting_class_associations = nconc(posting_class_associations, list(new_posting_class_association));
                    sublisp_throw($sym151$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO, new_posting_class_association);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(self, posting_class_associations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method = Errors.handleThrowable(ccatch_env_var, $sym151$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO);
            }
            return catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_to_posting_class_map_expression_get_posting_class_given_type_string_method(SubLObject self, SubLObject type_string) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method = NIL;
            SubLObject posting_class_associations = get_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(self);
            try {
                try {
                    {
                        SubLObject cdolist_list_var = posting_class_associations;
                        SubLObject association = NIL;
                        for (association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , association = cdolist_list_var.first()) {
                            if (cyblack_defbb_type_association_get_type_string_method(association).equal(type_string)) {
                                sublisp_throw($sym156$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO, cyblack_defbb_posting_class_association_get_posting_class_method(association));
                            }
                        }
                        sublisp_throw($sym156$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations(self, posting_class_associations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method = Errors.handleThrowable(ccatch_env_var, $sym156$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO);
            }
            return catch_var_for_cyblack_defbb_type_to_posting_class_map_expression_method;
        }
    }

    public static final SubLObject get_cyblack_defbb_type_association_type_string(SubLObject cyblack_defbb_type_association) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_type_association, THREE_INTEGER, TYPE_STRING);
    }

    public static final SubLObject set_cyblack_defbb_type_association_type_string(SubLObject cyblack_defbb_type_association, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_type_association, value, THREE_INTEGER, TYPE_STRING);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_type_association_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_type_association_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_TYPE_ASSOCIATION, TYPE_STRING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_type_association_p(SubLObject cyblack_defbb_type_association) {
        return classes.subloop_instanceof_class(cyblack_defbb_type_association, CYBLACK_DEFBB_TYPE_ASSOCIATION);
    }

    public static final SubLObject cyblack_defbb_type_association_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_association_method = NIL;
            SubLObject type_string = get_cyblack_defbb_type_association_type_string(self);
            try {
                try {
                    cyblack_defbb_expression_initialize_method(self);
                    type_string = NIL;
                    sublisp_throw($sym161$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_ASSOCIATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_association_type_string(self, type_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_association_method = Errors.handleThrowable(ccatch_env_var, $sym161$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_ASSOCIATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_type_association_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_association_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt164$__CYBLACK_DEFBB_TYPE_ASSOCIATION_);
        return self;
    }

    public static final SubLObject cyblack_defbb_type_association_get_type_string_method(SubLObject self) {
        {
            SubLObject type_string = get_cyblack_defbb_type_association_type_string(self);
            return type_string;
        }
    }

    public static final SubLObject cyblack_defbb_type_association_set_type_string_method(SubLObject self, SubLObject new_type_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defbb_type_association_method = NIL;
                SubLObject type_string = get_cyblack_defbb_type_association_type_string(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_type_string) || (NIL != cyblack_defks.cyblack_datatype_string_p(new_type_string)))) {
                                Errors.error($str_alt169$_SET_TYPE_STRING__S____S_is_not_a, self, new_type_string);
                            }
                        }
                        type_string = new_type_string;
                        sublisp_throw($sym168$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_ASSOCIATION_METHOD, new_type_string);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defbb_type_association_type_string(self, type_string);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defbb_type_association_method = Errors.handleThrowable(ccatch_env_var, $sym168$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_ASSOCIATION_METHOD);
                }
                return catch_var_for_cyblack_defbb_type_association_method;
            }
        }
    }

    public static final SubLObject get_cyblack_defbb_posting_class_association_posting_class(SubLObject cyblack_defbb_posting_class_association) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_posting_class_association, FOUR_INTEGER, POSTING_CLASS);
    }

    public static final SubLObject set_cyblack_defbb_posting_class_association_posting_class(SubLObject cyblack_defbb_posting_class_association, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_posting_class_association, value, FOUR_INTEGER, POSTING_CLASS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_posting_class_association_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_posting_class_association_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_TYPE_ASSOCIATION, TYPE_STRING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, POSTING_CLASS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_posting_class_association_p(SubLObject cyblack_defbb_posting_class_association) {
        return classes.subloop_instanceof_class(cyblack_defbb_posting_class_association, CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION);
    }

    public static final SubLObject cyblack_defbb_posting_class_association_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_posting_class_association_method = NIL;
            SubLObject posting_class = get_cyblack_defbb_posting_class_association_posting_class(self);
            try {
                try {
                    cyblack_defbb_type_association_initialize_method(self);
                    posting_class = NIL;
                    sublisp_throw($sym177$OUTER_CATCH_FOR_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_posting_class_association_posting_class(self, posting_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_posting_class_association_method = Errors.handleThrowable(ccatch_env_var, $sym177$OUTER_CATCH_FOR_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_posting_class_association_method;
        }
    }

    public static final SubLObject cyblack_defbb_posting_class_association_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defbb_posting_class_association_method = NIL;
            SubLObject posting_class = get_cyblack_defbb_posting_class_association_posting_class(self);
            SubLObject type_string = get_cyblack_defbb_type_association_type_string(self);
            try {
                try {
                    format(stream, $str_alt181$__POSTING_CLASS__S__S_, type_string, posting_class);
                    sublisp_throw($sym180$OUTER_CATCH_FOR_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_posting_class_association_posting_class(self, posting_class);
                            set_cyblack_defbb_type_association_type_string(self, type_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_posting_class_association_method = Errors.handleThrowable(ccatch_env_var, $sym180$OUTER_CATCH_FOR_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_posting_class_association_method;
        }
    }

    public static final SubLObject cyblack_defbb_posting_class_association_get_posting_class_method(SubLObject self) {
        {
            SubLObject posting_class = get_cyblack_defbb_posting_class_association_posting_class(self);
            return posting_class;
        }
    }

    public static final SubLObject cyblack_defbb_posting_class_association_set_posting_class_method(SubLObject self, SubLObject new_posting_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defbb_posting_class_association_method = NIL;
                SubLObject posting_class = get_cyblack_defbb_posting_class_association_posting_class(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL != new_posting_class) && posting_class.isSymbol())) {
                                Errors.error($str_alt190$_SET_POSTING_CLASS__S____S_is_not, self, posting_class);
                            }
                        }
                        if (NIL == classes.classes_implements_p(new_posting_class, CYBLACK_POSTING)) {
                            Errors.warn($str_alt192$_SET_POSTING_CLASS__S____S_does_n, self, new_posting_class);
                        }
                        posting_class = new_posting_class;
                        sublisp_throw($sym189$OUTER_CATCH_FOR_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_METHOD, new_posting_class);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defbb_posting_class_association_posting_class(self, posting_class);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defbb_posting_class_association_method = Errors.handleThrowable(ccatch_env_var, $sym189$OUTER_CATCH_FOR_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_METHOD);
                }
                return catch_var_for_cyblack_defbb_posting_class_association_method;
            }
        }
    }

    public static final SubLObject get_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(SubLObject cyblack_defbb_type_to_panel_class_map_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_type_to_panel_class_map_expression, THREE_INTEGER, PANEL_CLASS_ASSOCIATIONS);
    }

    public static final SubLObject set_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(SubLObject cyblack_defbb_type_to_panel_class_map_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_type_to_panel_class_map_expression, value, THREE_INTEGER, PANEL_CLASS_ASSOCIATIONS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_type_to_panel_class_map_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_type_to_panel_class_map_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, PANEL_CLASS_ASSOCIATIONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_type_to_panel_class_map_expression_p(SubLObject cyblack_defbb_type_to_panel_class_map_expression) {
        return classes.subloop_instanceof_class(cyblack_defbb_type_to_panel_class_map_expression, CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION);
    }

    public static final SubLObject cyblack_defbb_type_to_panel_class_map_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method = NIL;
            SubLObject panel_class_associations = get_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(self);
            try {
                try {
                    cyblack_defbb_expression_initialize_method(self);
                    panel_class_associations = NIL;
                    sublisp_throw($sym200$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(self, panel_class_associations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method = Errors.handleThrowable(ccatch_env_var, $sym200$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_);
            }
            return catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_to_panel_class_map_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method = NIL;
            SubLObject panel_class_associations = get_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(self);
            try {
                try {
                    format(stream, $str_alt204$__TYPE_TO_PANEL_CLASS_MAP);
                    {
                        SubLObject cdolist_list_var = panel_class_associations;
                        SubLObject association = NIL;
                        for (association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , association = cdolist_list_var.first()) {
                            format(stream, $str_alt62$__S, association);
                        }
                    }
                    format(stream, $str_alt63$_);
                    sublisp_throw($sym203$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(self, panel_class_associations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method = Errors.handleThrowable(ccatch_env_var, $sym203$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_);
            }
            return catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_to_panel_class_map_expression_get_panel_class_associations_method(SubLObject self) {
        {
            SubLObject panel_class_associations = get_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(self);
            return panel_class_associations;
        }
    }

    public static final SubLObject cyblack_defbb_type_to_panel_class_map_expression_set_panel_class_associations_method(SubLObject self, SubLObject new_panel_class_associations) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method = NIL;
            SubLObject panel_class_associations = get_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(self);
            try {
                try {
                    panel_class_associations = copy_list(new_panel_class_associations);
                    sublisp_throw($sym212$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_, new_panel_class_associations);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(self, panel_class_associations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method = Errors.handleThrowable(ccatch_env_var, $sym212$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_);
            }
            return catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_to_panel_class_map_expression_add_panel_class_association_method(SubLObject self, SubLObject new_panel_class_association) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method = NIL;
            SubLObject panel_class_associations = get_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(self);
            try {
                try {
                    panel_class_associations = nconc(panel_class_associations, list(new_panel_class_association));
                    sublisp_throw($sym217$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_, new_panel_class_association);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(self, panel_class_associations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method = Errors.handleThrowable(ccatch_env_var, $sym217$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_);
            }
            return catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_to_panel_class_map_expression_get_panel_class_given_type_string_method(SubLObject self, SubLObject type_string) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method = NIL;
            SubLObject panel_class_associations = get_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(self);
            try {
                try {
                    {
                        SubLObject cdolist_list_var = panel_class_associations;
                        SubLObject association = NIL;
                        for (association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , association = cdolist_list_var.first()) {
                            if (cyblack_defbb_type_association_get_type_string_method(association).equal(type_string)) {
                                sublisp_throw($sym221$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_, cyblack_defbb_panel_class_association_get_panel_class_method(association));
                            }
                        }
                        sublisp_throw($sym221$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations(self, panel_class_associations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method = Errors.handleThrowable(ccatch_env_var, $sym221$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_);
            }
            return catch_var_for_cyblack_defbb_type_to_panel_class_map_expression_method;
        }
    }

    public static final SubLObject get_cyblack_defbb_panel_class_association_panel_class(SubLObject cyblack_defbb_panel_class_association) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_panel_class_association, FOUR_INTEGER, PANEL_CLASS);
    }

    public static final SubLObject set_cyblack_defbb_panel_class_association_panel_class(SubLObject cyblack_defbb_panel_class_association, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_panel_class_association, value, FOUR_INTEGER, PANEL_CLASS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_panel_class_association_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_panel_class_association_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_TYPE_ASSOCIATION, TYPE_STRING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, PANEL_CLASS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_panel_class_association_p(SubLObject cyblack_defbb_panel_class_association) {
        return classes.subloop_instanceof_class(cyblack_defbb_panel_class_association, CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION);
    }

    public static final SubLObject cyblack_defbb_panel_class_association_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_panel_class_association_method = NIL;
            SubLObject panel_class = get_cyblack_defbb_panel_class_association_panel_class(self);
            try {
                try {
                    cyblack_defbb_type_association_initialize_method(self);
                    panel_class = NIL;
                    sublisp_throw($sym229$OUTER_CATCH_FOR_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_panel_class_association_panel_class(self, panel_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_panel_class_association_method = Errors.handleThrowable(ccatch_env_var, $sym229$OUTER_CATCH_FOR_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_panel_class_association_method;
        }
    }

    public static final SubLObject cyblack_defbb_panel_class_association_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defbb_panel_class_association_method = NIL;
            SubLObject panel_class = get_cyblack_defbb_panel_class_association_panel_class(self);
            SubLObject type_string = get_cyblack_defbb_type_association_type_string(self);
            try {
                try {
                    format(stream, $str_alt233$__PANEL_CLASS__S__S_, type_string, panel_class);
                    sublisp_throw($sym232$OUTER_CATCH_FOR_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_panel_class_association_panel_class(self, panel_class);
                            set_cyblack_defbb_type_association_type_string(self, type_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_panel_class_association_method = Errors.handleThrowable(ccatch_env_var, $sym232$OUTER_CATCH_FOR_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_panel_class_association_method;
        }
    }

    public static final SubLObject cyblack_defbb_panel_class_association_get_panel_class_method(SubLObject self) {
        {
            SubLObject panel_class = get_cyblack_defbb_panel_class_association_panel_class(self);
            return panel_class;
        }
    }

    public static final SubLObject cyblack_defbb_panel_class_association_set_panel_class_method(SubLObject self, SubLObject new_panel_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defbb_panel_class_association_method = NIL;
                SubLObject panel_class = get_cyblack_defbb_panel_class_association_panel_class(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL != new_panel_class) && panel_class.isSymbol())) {
                                Errors.error($str_alt242$_SET_PANEL_CLASS__S____S_is_not_a, self, panel_class);
                            }
                        }
                        if (NIL == classes.classes_implements_p(new_panel_class, CYBLACK_PANEL)) {
                            Errors.warn($str_alt244$_SET_PANEL_CLASS__S____S_does_not, self, new_panel_class);
                        }
                        panel_class = new_panel_class;
                        sublisp_throw($sym241$OUTER_CATCH_FOR_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_METHOD, new_panel_class);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defbb_panel_class_association_panel_class(self, panel_class);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defbb_panel_class_association_method = Errors.handleThrowable(ccatch_env_var, $sym241$OUTER_CATCH_FOR_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_METHOD);
                }
                return catch_var_for_cyblack_defbb_panel_class_association_method;
            }
        }
    }

    public static final SubLObject get_cyblack_defbb_method_expression_symbolic_expressions(SubLObject cyblack_defbb_method_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_method_expression, FOUR_INTEGER, SYMBOLIC_EXPRESSIONS);
    }

    public static final SubLObject set_cyblack_defbb_method_expression_symbolic_expressions(SubLObject cyblack_defbb_method_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_method_expression, value, FOUR_INTEGER, SYMBOLIC_EXPRESSIONS);
    }

    public static final SubLObject get_cyblack_defbb_method_expression_method_name_key(SubLObject cyblack_defbb_method_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_method_expression, THREE_INTEGER, METHOD_NAME_KEY);
    }

    public static final SubLObject set_cyblack_defbb_method_expression_method_name_key(SubLObject cyblack_defbb_method_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_method_expression, value, THREE_INTEGER, METHOD_NAME_KEY);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_method_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_method_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_METHOD_EXPRESSION, METHOD_NAME_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_METHOD_EXPRESSION, SYMBOLIC_EXPRESSIONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_method_expression_p(SubLObject cyblack_defbb_method_expression) {
        return classes.subloop_instanceof_class(cyblack_defbb_method_expression, CYBLACK_DEFBB_METHOD_EXPRESSION);
    }

    public static final SubLObject cyblack_defbb_method_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_method_expression_method = NIL;
            SubLObject symbolic_expressions = get_cyblack_defbb_method_expression_symbolic_expressions(self);
            try {
                try {
                    cyblack_defbb_expression_initialize_method(self);
                    symbolic_expressions = NIL;
                    sublisp_throw($sym253$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_method_expression_symbolic_expressions(self, symbolic_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_method_expression_method = Errors.handleThrowable(ccatch_env_var, $sym253$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defbb_method_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_method_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defbb_method_expression_method = NIL;
            SubLObject symbolic_expressions = get_cyblack_defbb_method_expression_symbolic_expressions(self);
            SubLObject method_name_key = get_cyblack_defbb_method_expression_method_name_key(self);
            try {
                try {
                    format(stream, $str_alt257$__S, method_name_key);
                    {
                        SubLObject cdolist_list_var = symbolic_expressions;
                        SubLObject symbolic_expression = NIL;
                        for (symbolic_expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , symbolic_expression = cdolist_list_var.first()) {
                            format(stream, $str_alt62$__S, symbolic_expression);
                        }
                    }
                    format(stream, $str_alt63$_);
                    sublisp_throw($sym256$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_method_expression_symbolic_expressions(self, symbolic_expressions);
                            set_cyblack_defbb_method_expression_method_name_key(self, method_name_key);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_method_expression_method = Errors.handleThrowable(ccatch_env_var, $sym256$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defbb_method_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_method_expression_get_symbolic_expressions_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_method_expression_method = NIL;
            SubLObject symbolic_expressions = get_cyblack_defbb_method_expression_symbolic_expressions(self);
            try {
                try {
                    sublisp_throw($sym261$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD, symbolic_expressions);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_method_expression_symbolic_expressions(self, symbolic_expressions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_method_expression_method = Errors.handleThrowable(ccatch_env_var, $sym261$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defbb_method_expression_method;
        }
    }

    public static final SubLObject cyblack_defbb_method_expression_set_symbolic_expressions_method(SubLObject self, SubLObject new_symbolic_expressions) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defbb_method_expression_method = NIL;
                SubLObject symbolic_expressions = get_cyblack_defbb_method_expression_symbolic_expressions(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!(new_symbolic_expressions.isSymbol() || new_symbolic_expressions.isCons())) {
                                Errors.error($str_alt267$_SET_SYMBOLIC_EXPRESSION__S____S_, self, new_symbolic_expressions);
                            }
                        }
                        symbolic_expressions = copy_tree(new_symbolic_expressions);
                        sublisp_throw($sym266$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD, new_symbolic_expressions);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defbb_method_expression_symbolic_expressions(self, symbolic_expressions);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defbb_method_expression_method = Errors.handleThrowable(ccatch_env_var, $sym266$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD);
                }
                return catch_var_for_cyblack_defbb_method_expression_method;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_on_startup_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_on_startup_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_METHOD_EXPRESSION, METHOD_NAME_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_METHOD_EXPRESSION, SYMBOLIC_EXPRESSIONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_on_startup_expression_p(SubLObject cyblack_defbb_on_startup_expression) {
        return classes.subloop_instanceof_class(cyblack_defbb_on_startup_expression, CYBLACK_DEFBB_ON_STARTUP_EXPRESSION);
    }

    public static final SubLObject cyblack_defbb_on_startup_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_on_startup_expression_method = NIL;
            SubLObject symbolic_expressions = get_cyblack_defbb_method_expression_symbolic_expressions(self);
            SubLObject method_name_key = get_cyblack_defbb_method_expression_method_name_key(self);
            try {
                try {
                    cyblack_defbb_method_expression_initialize_method(self);
                    method_name_key = $ON_STARTUP;
                    symbolic_expressions = NIL;
                    sublisp_throw($sym274$OUTER_CATCH_FOR_CYBLACK_DEFBB_ON_STARTUP_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_method_expression_symbolic_expressions(self, symbolic_expressions);
                            set_cyblack_defbb_method_expression_method_name_key(self, method_name_key);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_on_startup_expression_method = Errors.handleThrowable(ccatch_env_var, $sym274$OUTER_CATCH_FOR_CYBLACK_DEFBB_ON_STARTUP_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defbb_on_startup_expression_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_on_shutdown_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_on_shutdown_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_METHOD_EXPRESSION, METHOD_NAME_KEY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_METHOD_EXPRESSION, SYMBOLIC_EXPRESSIONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_on_shutdown_expression_p(SubLObject cyblack_defbb_on_shutdown_expression) {
        return classes.subloop_instanceof_class(cyblack_defbb_on_shutdown_expression, CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION);
    }

    public static final SubLObject cyblack_defbb_on_shutdown_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_on_shutdown_expression_method = NIL;
            SubLObject symbolic_expressions = get_cyblack_defbb_method_expression_symbolic_expressions(self);
            SubLObject method_name_key = get_cyblack_defbb_method_expression_method_name_key(self);
            try {
                try {
                    cyblack_defbb_method_expression_initialize_method(self);
                    method_name_key = $ON_SHUTDOWN;
                    symbolic_expressions = NIL;
                    sublisp_throw($sym281$OUTER_CATCH_FOR_CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_method_expression_symbolic_expressions(self, symbolic_expressions);
                            set_cyblack_defbb_method_expression_method_name_key(self, method_name_key);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_on_shutdown_expression_method = Errors.handleThrowable(ccatch_env_var, $sym281$OUTER_CATCH_FOR_CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defbb_on_shutdown_expression_method;
        }
    }

    public static final SubLObject get_cyblack_defbb_body_on_shutdown_expression(SubLObject cyblack_defbb_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_body, SEVEN_INTEGER, ON_SHUTDOWN_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defbb_body_on_shutdown_expression(SubLObject cyblack_defbb_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_body, value, SEVEN_INTEGER, ON_SHUTDOWN_EXPRESSION);
    }

    public static final SubLObject get_cyblack_defbb_body_on_startup_expression(SubLObject cyblack_defbb_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_body, SIX_INTEGER, ON_STARTUP_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defbb_body_on_startup_expression(SubLObject cyblack_defbb_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_body, value, SIX_INTEGER, ON_STARTUP_EXPRESSION);
    }

    public static final SubLObject get_cyblack_defbb_body_type_to_panel_class_map(SubLObject cyblack_defbb_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_body, FIVE_INTEGER, TYPE_TO_PANEL_CLASS_MAP);
    }

    public static final SubLObject set_cyblack_defbb_body_type_to_panel_class_map(SubLObject cyblack_defbb_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_body, value, FIVE_INTEGER, TYPE_TO_PANEL_CLASS_MAP);
    }

    public static final SubLObject get_cyblack_defbb_body_type_to_posting_class_map(SubLObject cyblack_defbb_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_body, FOUR_INTEGER, TYPE_TO_POSTING_CLASS_MAP);
    }

    public static final SubLObject set_cyblack_defbb_body_type_to_posting_class_map(SubLObject cyblack_defbb_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_body, value, FOUR_INTEGER, TYPE_TO_POSTING_CLASS_MAP);
    }

    public static final SubLObject get_cyblack_defbb_body_type_graph_expression(SubLObject cyblack_defbb_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_body, THREE_INTEGER, TYPE_GRAPH_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defbb_body_type_graph_expression(SubLObject cyblack_defbb_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_body, value, THREE_INTEGER, TYPE_GRAPH_EXPRESSION);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_body_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_body_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_BODY, TYPE_GRAPH_EXPRESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_BODY, TYPE_TO_POSTING_CLASS_MAP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_BODY, TYPE_TO_PANEL_CLASS_MAP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_BODY, ON_STARTUP_EXPRESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_BODY, ON_SHUTDOWN_EXPRESSION, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_body_p(SubLObject cyblack_defbb_body) {
        return classes.subloop_instanceof_class(cyblack_defbb_body, CYBLACK_DEFBB_BODY);
    }

    public static final SubLObject cyblack_defbb_body_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
            SubLObject on_shutdown_expression = get_cyblack_defbb_body_on_shutdown_expression(self);
            SubLObject on_startup_expression = get_cyblack_defbb_body_on_startup_expression(self);
            SubLObject type_to_panel_class_map = get_cyblack_defbb_body_type_to_panel_class_map(self);
            SubLObject type_to_posting_class_map = get_cyblack_defbb_body_type_to_posting_class_map(self);
            SubLObject type_graph_expression = get_cyblack_defbb_body_type_graph_expression(self);
            try {
                try {
                    cyblack_defbb_expression_initialize_method(self);
                    type_graph_expression = NIL;
                    type_to_posting_class_map = NIL;
                    type_to_panel_class_map = NIL;
                    on_startup_expression = NIL;
                    on_shutdown_expression = NIL;
                    sublisp_throw($sym294$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_body_on_shutdown_expression(self, on_shutdown_expression);
                            set_cyblack_defbb_body_on_startup_expression(self, on_startup_expression);
                            set_cyblack_defbb_body_type_to_panel_class_map(self, type_to_panel_class_map);
                            set_cyblack_defbb_body_type_to_posting_class_map(self, type_to_posting_class_map);
                            set_cyblack_defbb_body_type_graph_expression(self, type_graph_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym294$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defbb_body_method;
        }
    }

    public static final SubLObject cyblack_defbb_body_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
            SubLObject on_shutdown_expression = get_cyblack_defbb_body_on_shutdown_expression(self);
            SubLObject on_startup_expression = get_cyblack_defbb_body_on_startup_expression(self);
            SubLObject type_to_panel_class_map = get_cyblack_defbb_body_type_to_panel_class_map(self);
            SubLObject type_to_posting_class_map = get_cyblack_defbb_body_type_to_posting_class_map(self);
            SubLObject type_graph_expression = get_cyblack_defbb_body_type_graph_expression(self);
            try {
                try {
                    format(stream, $str_alt298$_S__S__S, new SubLObject[]{ type_graph_expression, type_to_posting_class_map, type_to_panel_class_map });
                    if (NIL != on_startup_expression) {
                        format(stream, $str_alt62$__S, on_startup_expression);
                    }
                    if (NIL != on_shutdown_expression) {
                        format(stream, $str_alt62$__S, on_shutdown_expression);
                    }
                    sublisp_throw($sym297$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_body_on_shutdown_expression(self, on_shutdown_expression);
                            set_cyblack_defbb_body_on_startup_expression(self, on_startup_expression);
                            set_cyblack_defbb_body_type_to_panel_class_map(self, type_to_panel_class_map);
                            set_cyblack_defbb_body_type_to_posting_class_map(self, type_to_posting_class_map);
                            set_cyblack_defbb_body_type_graph_expression(self, type_graph_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym297$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defbb_body_method;
        }
    }

    public static final SubLObject cyblack_defbb_body_get_type_graph_expression_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
            SubLObject type_graph_expression = get_cyblack_defbb_body_type_graph_expression(self);
            try {
                try {
                    sublisp_throw($sym302$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, type_graph_expression);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_body_type_graph_expression(self, type_graph_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym302$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defbb_body_method;
        }
    }

    public static final SubLObject cyblack_defbb_body_set_type_graph_expression_method(SubLObject self, SubLObject new_type_graph_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
                SubLObject type_graph_expression = get_cyblack_defbb_body_type_graph_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_type_graph_expression) || (NIL != cyblack_defbb_type_graph_expression_p(new_type_graph_expression)))) {
                                Errors.error($str_alt308$_SET_TYPE_GRAPH_EXPRESSION__S____, self, new_type_graph_expression);
                            }
                        }
                        type_graph_expression = new_type_graph_expression;
                        sublisp_throw($sym307$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, new_type_graph_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defbb_body_type_graph_expression(self, type_graph_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym307$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
                }
                return catch_var_for_cyblack_defbb_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defbb_body_get_type_to_posting_class_map_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
            SubLObject type_to_posting_class_map = get_cyblack_defbb_body_type_to_posting_class_map(self);
            try {
                try {
                    sublisp_throw($sym312$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, type_to_posting_class_map);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_body_type_to_posting_class_map(self, type_to_posting_class_map);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym312$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defbb_body_method;
        }
    }

    public static final SubLObject cyblack_defbb_body_set_type_to_posting_class_map_method(SubLObject self, SubLObject new_type_to_posting_class_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
                SubLObject type_to_posting_class_map = get_cyblack_defbb_body_type_to_posting_class_map(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_type_to_posting_class_map) || (NIL != cyblack_defbb_type_to_posting_class_map_expression_p(new_type_to_posting_class_map)))) {
                                Errors.error($str_alt318$_SET_TYPE_TO_POSTING_CLASS_MAP__S, self, new_type_to_posting_class_map);
                            }
                        }
                        type_to_posting_class_map = new_type_to_posting_class_map;
                        sublisp_throw($sym317$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, self);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defbb_body_type_to_posting_class_map(self, type_to_posting_class_map);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym317$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
                }
                return catch_var_for_cyblack_defbb_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defbb_body_get_type_to_panel_class_map_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
            SubLObject type_to_panel_class_map = get_cyblack_defbb_body_type_to_panel_class_map(self);
            try {
                try {
                    sublisp_throw($sym322$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, type_to_panel_class_map);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_body_type_to_panel_class_map(self, type_to_panel_class_map);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym322$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defbb_body_method;
        }
    }

    public static final SubLObject cyblack_defbb_body_set_type_to_panel_class_map_method(SubLObject self, SubLObject new_type_to_panel_class_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
                SubLObject type_to_panel_class_map = get_cyblack_defbb_body_type_to_panel_class_map(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_type_to_panel_class_map) || (NIL != cyblack_defbb_type_to_panel_class_map_expression_p(new_type_to_panel_class_map)))) {
                                Errors.error($str_alt328$_SET_TYPE_TO_PANEL_CLASS_MAP__S__, self, new_type_to_panel_class_map);
                            }
                        }
                        type_to_panel_class_map = new_type_to_panel_class_map;
                        sublisp_throw($sym327$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, new_type_to_panel_class_map);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defbb_body_type_to_panel_class_map(self, type_to_panel_class_map);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym327$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
                }
                return catch_var_for_cyblack_defbb_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defbb_body_get_on_startup_expression_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
            SubLObject on_startup_expression = get_cyblack_defbb_body_on_startup_expression(self);
            try {
                try {
                    sublisp_throw($sym332$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, on_startup_expression);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_body_on_startup_expression(self, on_startup_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym332$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defbb_body_method;
        }
    }

    public static final SubLObject cyblack_defbb_body_set_on_startup_expression_method(SubLObject self, SubLObject new_on_startup_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
                SubLObject on_startup_expression = get_cyblack_defbb_body_on_startup_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_on_startup_expression) || (NIL != cyblack_defbb_on_startup_expression_p(new_on_startup_expression)))) {
                                Errors.error($str_alt338$_SET_ON_STARTUP_EXPRESSION__S____, self, new_on_startup_expression);
                            }
                        }
                        on_startup_expression = new_on_startup_expression;
                        sublisp_throw($sym337$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, new_on_startup_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defbb_body_on_startup_expression(self, on_startup_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym337$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
                }
                return catch_var_for_cyblack_defbb_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defbb_body_get_on_shutdown_expression_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
            SubLObject on_shutdown_expression = get_cyblack_defbb_body_on_shutdown_expression(self);
            try {
                try {
                    sublisp_throw($sym342$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, on_shutdown_expression);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_body_on_shutdown_expression(self, on_shutdown_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym342$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defbb_body_method;
        }
    }

    public static final SubLObject cyblack_defbb_body_set_on_shutdown_expression_method(SubLObject self, SubLObject new_on_shutdown_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
                SubLObject on_shutdown_expression = get_cyblack_defbb_body_on_shutdown_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_on_shutdown_expression) || (NIL != cyblack_defbb_on_shutdown_expression_p(new_on_shutdown_expression)))) {
                                Errors.error($str_alt348$_SET_ON_SHUTDOWN_EXPRESSION__S___, self, new_on_shutdown_expression);
                            }
                        }
                        on_shutdown_expression = new_on_shutdown_expression;
                        sublisp_throw($sym347$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, new_on_shutdown_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defbb_body_on_shutdown_expression(self, on_shutdown_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym347$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
                }
                return catch_var_for_cyblack_defbb_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defbb_body_compile_to_subtype_expressions_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_body_method = NIL;
            SubLObject type_to_panel_class_map = get_cyblack_defbb_body_type_to_panel_class_map(self);
            SubLObject type_to_posting_class_map = get_cyblack_defbb_body_type_to_posting_class_map(self);
            SubLObject type_graph_expression = get_cyblack_defbb_body_type_graph_expression(self);
            try {
                try {
                    if (NIL != type_graph_expression) {
                        {
                            SubLObject type_declarations = (NIL != type_graph_expression) ? ((SubLObject) (cyblack_defbb_type_graph_expression_get_type_declarations_method(type_graph_expression))) : NIL;
                            SubLObject type_string = NIL;
                            SubLObject posting_class = NIL;
                            SubLObject panel_class = NIL;
                            SubLObject subtype_expressions = NIL;
                            SubLObject cdolist_list_var = type_declarations;
                            SubLObject type_declaration = NIL;
                            for (type_declaration = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type_declaration = cdolist_list_var.first()) {
                                type_string = cyblack_deffbb_type_declaration_get_type_string_method(type_declaration);
                                posting_class = (NIL != type_to_posting_class_map) ? ((SubLObject) (cyblack_defbb_type_to_posting_class_map_expression_get_posting_class_given_type_string_method(type_to_posting_class_map, type_string))) : NIL;
                                panel_class = (NIL != type_to_panel_class_map) ? ((SubLObject) (cyblack_defbb_type_to_panel_class_map_expression_get_panel_class_given_type_string_method(type_to_panel_class_map, type_string))) : NIL;
                                if (NIL != instances.instance_of_p(type_declaration, CYBLACK_DEFBB_ROOT_TYPE_DECLARATION)) {
                                    subtype_expressions = cons(copy_tree(list(DECLARE_SUBTYPE, SELF, type_string, $$$POSTING, NIL != posting_class ? ((SubLObject) (list(QUOTE, posting_class))) : list(QUOTE, CYBLACK_BASIC_POSTING), NIL != panel_class ? ((SubLObject) (list(QUOTE, panel_class))) : list(QUOTE, CYBLACK_BASIC_PANEL))), subtype_expressions);
                                } else {
                                    subtype_expressions = cons(copy_tree(list(DECLARE_SUBTYPE, SELF, type_string, cyblack_deffbb_subtype_declaration_get_supertype_string_method(type_declaration), NIL != posting_class ? ((SubLObject) (list(QUOTE, posting_class))) : list(QUOTE, CYBLACK_BASIC_POSTING), NIL != panel_class ? ((SubLObject) (list(QUOTE, panel_class))) : list(QUOTE, CYBLACK_BASIC_PANEL))), subtype_expressions);
                                }
                            }
                            sublisp_throw($sym352$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, nreverse(subtype_expressions));
                        }
                    }
                    sublisp_throw($sym352$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_body_type_to_panel_class_map(self, type_to_panel_class_map);
                            set_cyblack_defbb_body_type_to_posting_class_map(self, type_to_posting_class_map);
                            set_cyblack_defbb_body_type_graph_expression(self, type_graph_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_body_method = Errors.handleThrowable(ccatch_env_var, $sym352$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD);
            }
            return catch_var_for_cyblack_defbb_body_method;
        }
    }

    public static final SubLObject get_cyblack_defbb_type_relation_supertype(SubLObject cyblack_defbb_type_relation) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_type_relation, TWO_INTEGER, SUPERTYPE);
    }

    public static final SubLObject set_cyblack_defbb_type_relation_supertype(SubLObject cyblack_defbb_type_relation, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_type_relation, value, TWO_INTEGER, SUPERTYPE);
    }

    public static final SubLObject get_cyblack_defbb_type_relation_subtype(SubLObject cyblack_defbb_type_relation) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defbb_type_relation, ONE_INTEGER, SUBTYPE);
    }

    public static final SubLObject set_cyblack_defbb_type_relation_subtype(SubLObject cyblack_defbb_type_relation, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defbb_type_relation, value, ONE_INTEGER, SUBTYPE);
    }

    public static final SubLObject get_cyblack_defbb_type_relation_mark(SubLObject cyblack_defbb_type_relation) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defbb_type_relation);
            SubLObject slot = slots.slot_assoc(MARK, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defbb_type_relation, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_defbb_type_relation));
    }

    public static final SubLObject set_cyblack_defbb_type_relation_mark(SubLObject cyblack_defbb_type_relation, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defbb_type_relation);
            SubLObject slot = slots.slot_assoc(MARK, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defbb_type_relation, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_defbb_type_relation, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_defbb_type_relation)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_type_relation_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defbb_type_relation_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_TYPE_RELATION, MARK, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_TYPE_RELATION, SUBTYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFBB_TYPE_RELATION, SUPERTYPE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defbb_type_relation_p(SubLObject cyblack_defbb_type_relation) {
        return classes.subloop_instanceof_class(cyblack_defbb_type_relation, CYBLACK_DEFBB_TYPE_RELATION);
    }

    public static final SubLObject cyblack_defbb_type_relation_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_relation_method = NIL;
            SubLObject supertype = get_cyblack_defbb_type_relation_supertype(self);
            SubLObject subtype = get_cyblack_defbb_type_relation_subtype(self);
            SubLObject mark = get_cyblack_defbb_type_relation_mark(self);
            try {
                try {
                    object.object_initialize_method(self);
                    subtype = NIL;
                    supertype = NIL;
                    mark = NIL;
                    sublisp_throw($sym369$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_relation_supertype(self, supertype);
                            set_cyblack_defbb_type_relation_subtype(self, subtype);
                            set_cyblack_defbb_type_relation_mark(self, mark);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_relation_method = Errors.handleThrowable(ccatch_env_var, $sym369$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_type_relation_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_relation_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_relation_method = NIL;
            SubLObject supertype = get_cyblack_defbb_type_relation_supertype(self);
            SubLObject subtype = get_cyblack_defbb_type_relation_subtype(self);
            SubLObject mark = get_cyblack_defbb_type_relation_mark(self);
            try {
                try {
                    format(stream, $str_alt373$__TYPE_RELATION___S___S__S__, new SubLObject[]{ subtype, supertype, mark });
                    sublisp_throw($sym372$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_relation_supertype(self, supertype);
                            set_cyblack_defbb_type_relation_subtype(self, subtype);
                            set_cyblack_defbb_type_relation_mark(self, mark);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_relation_method = Errors.handleThrowable(ccatch_env_var, $sym372$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_type_relation_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_relation_get_subtype_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_relation_method = NIL;
            SubLObject subtype = get_cyblack_defbb_type_relation_subtype(self);
            try {
                try {
                    sublisp_throw($sym377$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD, subtype);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_relation_subtype(self, subtype);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_relation_method = Errors.handleThrowable(ccatch_env_var, $sym377$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_type_relation_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_relation_set_subtype_method(SubLObject self, SubLObject new_subtype) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_relation_method = NIL;
            SubLObject subtype = get_cyblack_defbb_type_relation_subtype(self);
            try {
                try {
                    subtype = new_subtype;
                    sublisp_throw($sym382$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD, new_subtype);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_relation_subtype(self, subtype);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_relation_method = Errors.handleThrowable(ccatch_env_var, $sym382$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_type_relation_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_relation_get_supertype_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_relation_method = NIL;
            SubLObject supertype = get_cyblack_defbb_type_relation_supertype(self);
            try {
                try {
                    sublisp_throw($sym386$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD, supertype);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_relation_supertype(self, supertype);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_relation_method = Errors.handleThrowable(ccatch_env_var, $sym386$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_type_relation_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_relation_set_supertype_method(SubLObject self, SubLObject new_supertype) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_relation_method = NIL;
            SubLObject supertype = get_cyblack_defbb_type_relation_supertype(self);
            try {
                try {
                    supertype = new_supertype;
                    sublisp_throw($sym391$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD, new_supertype);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_relation_supertype(self, supertype);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_relation_method = Errors.handleThrowable(ccatch_env_var, $sym391$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_type_relation_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_relation_get_mark_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_relation_method = NIL;
            SubLObject mark = get_cyblack_defbb_type_relation_mark(self);
            try {
                try {
                    sublisp_throw($sym395$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD, mark);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_relation_mark(self, mark);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_relation_method = Errors.handleThrowable(ccatch_env_var, $sym395$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_type_relation_method;
        }
    }

    public static final SubLObject cyblack_defbb_type_relation_set_mark_method(SubLObject self, SubLObject new_mark) {
        {
            SubLObject catch_var_for_cyblack_defbb_type_relation_method = NIL;
            SubLObject mark = get_cyblack_defbb_type_relation_mark(self);
            try {
                try {
                    mark = new_mark;
                    sublisp_throw($sym400$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD, new_mark);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defbb_type_relation_mark(self, mark);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defbb_type_relation_method = Errors.handleThrowable(ccatch_env_var, $sym400$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD);
            }
            return catch_var_for_cyblack_defbb_type_relation_method;
        }
    }

    /**
     * Enumerated values of type CYBLACK-DEFBB-CHECK-RELATION-ERROR.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_defbb_check_relation_errors$ = makeSymbol("*VALID-CYBLACK-DEFBB-CHECK-RELATION-ERRORS*");

    /**
     * Returns a list of all valid members of the CYBLACK-DEFBB-CHECK-RELATION-ERROR enumeration.
     */
    public static final SubLObject valid_cyblack_defbb_check_relation_errors() {
        return $valid_cyblack_defbb_check_relation_errors$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-DEFBB-CHECK-RELATION-ERROR enumeration.
     */
    public static final SubLObject cyblack_defbb_check_relation_error_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_defbb_check_relation_errors$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-DEFBB-CHECK-RELATION-ERROR enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_defbb_check_relation_error(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_defbb_check_relation_errors$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_DEFBB_CHECK_RELATION_ERROR, value, CYBLACK_DEFBB_CHECK_RELATION_ERROR);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-DEFBB-CHECK-RELATION-ERROR enumeration.
     */
    public static final SubLObject decode_cyblack_defbb_check_relation_error(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_defbb_check_relation_errors$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_DEFBB_CHECK_RELATION_ERROR, value, CYBLACK_DEFBB_CHECK_RELATION_ERROR);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-DEFBB-CHECK-RELATION-ERROR enumeration.
     */
    public static final SubLObject cyblack_defbb_check_relation_error_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_check_relation_error_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_CHECK_RELATION_ERROR_P, value1, CYBLACK_DEFBB_CHECK_RELATION_ERROR);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_check_relation_error_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_CHECK_RELATION_ERROR_P, value2, CYBLACK_DEFBB_CHECK_RELATION_ERROR);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defbb_check_relation_errors$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-DEFBB-CHECK-RELATION-ERROR enumeration.
     */
    public static final SubLObject cyblack_defbb_check_relation_error_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_check_relation_error_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_CHECK_RELATION_ERROR_P, value1, CYBLACK_DEFBB_CHECK_RELATION_ERROR);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defbb_check_relation_error_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFBB_CHECK_RELATION_ERROR_P, value2, CYBLACK_DEFBB_CHECK_RELATION_ERROR);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defbb_check_relation_errors$.getGlobalValue();
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

    public static final SubLObject get_cyblack_type_relation_table_relations(SubLObject cyblack_type_relation_table) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_type_relation_table, ONE_INTEGER, RELATIONS);
    }

    public static final SubLObject set_cyblack_type_relation_table_relations(SubLObject cyblack_type_relation_table, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_type_relation_table, value, ONE_INTEGER, RELATIONS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_type_relation_table_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_type_relation_table_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_TYPE_RELATION_TABLE, RELATIONS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_type_relation_table_p(SubLObject cyblack_type_relation_table) {
        return classes.subloop_instanceof_class(cyblack_type_relation_table, CYBLACK_TYPE_RELATION_TABLE);
    }

    public static final SubLObject cyblack_type_relation_table_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_type_relation_table_method = NIL;
            SubLObject relations = get_cyblack_type_relation_table_relations(self);
            try {
                try {
                    object.object_initialize_method(self);
                    relations = NIL;
                    sublisp_throw($sym413$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_type_relation_table_relations(self, relations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_type_relation_table_method = Errors.handleThrowable(ccatch_env_var, $sym413$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD);
            }
            return catch_var_for_cyblack_type_relation_table_method;
        }
    }

    public static final SubLObject cyblack_type_relation_table_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_type_relation_table_method = NIL;
            SubLObject relations = get_cyblack_type_relation_table_relations(self);
            try {
                try {
                    format(stream, $str_alt417$__TYPE_RELATION_TABLE_);
                    {
                        SubLObject cdolist_list_var = relations;
                        SubLObject relation = NIL;
                        for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                            format(stream, $str_alt418$______S, relation);
                        }
                    }
                    format(stream, $str_alt419$_);
                    sublisp_throw($sym416$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_type_relation_table_relations(self, relations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_type_relation_table_method = Errors.handleThrowable(ccatch_env_var, $sym416$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD);
            }
            return catch_var_for_cyblack_type_relation_table_method;
        }
    }

    public static final SubLObject cyblack_type_relation_table_clear_all_marks_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_type_relation_table_method = NIL;
            SubLObject relations = get_cyblack_type_relation_table_relations(self);
            try {
                try {
                    {
                        SubLObject cdolist_list_var = relations;
                        SubLObject relation = NIL;
                        for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                            cyblack_defbb_type_relation_set_mark_method(relation, NIL);
                        }
                        sublisp_throw($sym423$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD, self);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_type_relation_table_relations(self, relations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_type_relation_table_method = Errors.handleThrowable(ccatch_env_var, $sym423$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD);
            }
            return catch_var_for_cyblack_type_relation_table_method;
        }
    }

    public static final SubLObject cyblack_type_relation_table_has_relation_method(SubLObject self, SubLObject subtype, SubLObject supertype) {
        {
            SubLObject catch_var_for_cyblack_type_relation_table_method = NIL;
            SubLObject relations = get_cyblack_type_relation_table_relations(self);
            try {
                try {
                    {
                        SubLObject cdolist_list_var = relations;
                        SubLObject relation = NIL;
                        for (relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , relation = cdolist_list_var.first()) {
                            if ((NIL != Strings.string_equal(cyblack_defbb_type_relation_get_subtype_method(relation), subtype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != Strings.string_equal(cyblack_defbb_type_relation_get_supertype_method(relation), supertype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                sublisp_throw($sym428$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD, T);
                            }
                        }
                        sublisp_throw($sym428$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_type_relation_table_relations(self, relations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_type_relation_table_method = Errors.handleThrowable(ccatch_env_var, $sym428$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD);
            }
            return catch_var_for_cyblack_type_relation_table_method;
        }
    }

    public static final SubLObject cyblack_type_relation_table_extend_super_method(SubLObject self, SubLObject relation_or_type) {
        {
            SubLObject catch_var_for_cyblack_type_relation_table_method = NIL;
            SubLObject relations = get_cyblack_type_relation_table_relations(self);
            try {
                try {
                    {
                        SubLObject supers = NIL;
                        SubLObject supertype = (relation_or_type.isString()) ? ((SubLObject) (relation_or_type)) : cyblack_defbb_type_relation_get_supertype_method(relation_or_type);
                        SubLObject list_expression = relations;
                        if (NIL == list_expression) {
                            supers = NIL;
                        } else
                            if (list_expression.isAtom()) {
                                supers = list(list_expression);
                            } else
                                if (NIL == list_expression.rest()) {
                                    {
                                        SubLObject some_relation = list_expression.first();
                                        supers = (NIL != Strings.string_equal(cyblack_defbb_type_relation_get_subtype_method(some_relation), supertype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (list(some_relation))) : NIL;
                                    }
                                } else {
                                    {
                                        SubLObject tail_cons = NIL;
                                        SubLObject result = NIL;
                                        supers = NIL;
                                        {
                                            SubLObject cdolist_list_var = list_expression;
                                            SubLObject some_relation = NIL;
                                            for (some_relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , some_relation = cdolist_list_var.first()) {
                                                result = (NIL != Strings.string_equal(cyblack_defbb_type_relation_get_subtype_method(some_relation), supertype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (list(some_relation))) : NIL;
                                                if (NIL != result) {
                                                    if (NIL != tail_cons) {
                                                        rplacd(tail_cons, result);
                                                        tail_cons = last(result, UNPROVIDED);
                                                    } else {
                                                        supers = (NIL != Strings.string_equal(cyblack_defbb_type_relation_get_subtype_method(some_relation), supertype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (list(some_relation))) : NIL;
                                                        tail_cons = last(supers, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }


                        sublisp_throw($sym433$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD, supers);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_type_relation_table_relations(self, relations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_type_relation_table_method = Errors.handleThrowable(ccatch_env_var, $sym433$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD);
            }
            return catch_var_for_cyblack_type_relation_table_method;
        }
    }

    public static final SubLObject cyblack_type_relation_table_extend_sub_method(SubLObject self, SubLObject relation_or_type) {
        {
            SubLObject catch_var_for_cyblack_type_relation_table_method = NIL;
            SubLObject relations = get_cyblack_type_relation_table_relations(self);
            try {
                try {
                    {
                        SubLObject subs = NIL;
                        SubLObject subtype = (relation_or_type.isString()) ? ((SubLObject) (relation_or_type)) : cyblack_defbb_type_relation_get_subtype_method(relation_or_type);
                        SubLObject list_expression = relations;
                        if (NIL == list_expression) {
                            subs = NIL;
                        } else
                            if (list_expression.isAtom()) {
                                subs = list(list_expression);
                            } else
                                if (NIL == list_expression.rest()) {
                                    {
                                        SubLObject some_relation = list_expression.first();
                                        subs = (NIL != Strings.string_equal(cyblack_defbb_type_relation_get_supertype_method(some_relation), subtype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (list(some_relation))) : NIL;
                                    }
                                } else {
                                    {
                                        SubLObject tail_cons = NIL;
                                        SubLObject result = NIL;
                                        subs = NIL;
                                        {
                                            SubLObject cdolist_list_var = list_expression;
                                            SubLObject some_relation = NIL;
                                            for (some_relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , some_relation = cdolist_list_var.first()) {
                                                result = (NIL != Strings.string_equal(cyblack_defbb_type_relation_get_supertype_method(some_relation), subtype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (list(some_relation))) : NIL;
                                                if (NIL != result) {
                                                    if (NIL != tail_cons) {
                                                        rplacd(tail_cons, result);
                                                        tail_cons = last(result, UNPROVIDED);
                                                    } else {
                                                        subs = (NIL != Strings.string_equal(cyblack_defbb_type_relation_get_supertype_method(some_relation), subtype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (list(some_relation))) : NIL;
                                                        tail_cons = last(subs, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }


                        sublisp_throw($sym437$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD, subs);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_type_relation_table_relations(self, relations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_type_relation_table_method = Errors.handleThrowable(ccatch_env_var, $sym437$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD);
            }
            return catch_var_for_cyblack_type_relation_table_method;
        }
    }

    public static final SubLObject cyblack_type_relation_table_get_relations_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_type_relation_table_method = NIL;
            SubLObject relations = get_cyblack_type_relation_table_relations(self);
            try {
                try {
                    sublisp_throw($sym441$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD, relations);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_type_relation_table_relations(self, relations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_type_relation_table_method = Errors.handleThrowable(ccatch_env_var, $sym441$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD);
            }
            return catch_var_for_cyblack_type_relation_table_method;
        }
    }

    public static final SubLObject cyblack_type_relation_table_set_relations_method(SubLObject self, SubLObject new_relations) {
        {
            SubLObject catch_var_for_cyblack_type_relation_table_method = NIL;
            SubLObject relations = get_cyblack_type_relation_table_relations(self);
            try {
                try {
                    relations = copy_list(new_relations);
                    sublisp_throw($sym446$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD, relations);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_type_relation_table_relations(self, relations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_type_relation_table_method = Errors.handleThrowable(ccatch_env_var, $sym446$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD);
            }
            return catch_var_for_cyblack_type_relation_table_method;
        }
    }

    public static final SubLObject cyblack_type_relation_table_check_relation_method(SubLObject self, SubLObject subtype, SubLObject supertype) {
        if (NIL != Strings.string_equal(subtype, supertype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return cons($CANNOT_SUBTYPE_SELF, subtype);
        }
        if (NIL != cyblack_type_relation_table_has_relation_method(self, subtype, supertype)) {
            return cons($ALREADY_A_RELATION, subtype);
        }
        cyblack_type_relation_table_clear_all_marks_method(self);
        {
            SubLObject stack = cyblack_type_relation_table_extend_super_method(self, supertype);
            SubLObject current = NIL;
            while (NIL != stack) {
                current = stack.first();
                stack = stack.rest();
                if (NIL == cyblack_defbb_type_relation_get_mark_method(current)) {
                    cyblack_defbb_type_relation_set_mark_method(current, T);
                    if (NIL != Strings.string_equal(cyblack_defbb_type_relation_get_supertype_method(current), subtype, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return cons($ANCESTOR_OF_SELF, subtype);
                    }
                }
                stack = nconc(cyblack_type_relation_table_extend_super_method(self, current), stack);
            } 
            return T;
        }
    }

    public static final SubLObject cyblack_type_relation_table_add_relation_method(SubLObject self, SubLObject subtype, SubLObject supertype) {
        {
            SubLObject catch_var_for_cyblack_type_relation_table_method = NIL;
            SubLObject relations = get_cyblack_type_relation_table_relations(self);
            try {
                try {
                    {
                        SubLObject check_result = cyblack_type_relation_table_check_relation_method(self, subtype, supertype);
                        if (check_result.isCons()) {
                            {
                                SubLObject pcase_var = check_result.first();
                                if (pcase_var.eql($CANNOT_SUBTYPE_SELF)) {
                                    Errors.warn($str_alt457$_ADD_RELATION__S____S_cannot_subt, self, subtype, supertype);
                                } else
                                    if (pcase_var.eql($ALREADY_A_RELATION)) {
                                        Errors.warn($str_alt458$_ADD_RELATION__S___Relation__S___, self, subtype, supertype);
                                    } else
                                        if (pcase_var.eql($ANCESTOR_OF_SELF)) {
                                            Errors.warn($str_alt459$_ADD_RELATION__S____S_is_an_ances, self, subtype, supertype);
                                        }


                            }
                            sublisp_throw($sym456$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD, NIL);
                        }
                        {
                            SubLObject new_relation = object.new_class_instance(CYBLACK_DEFBB_TYPE_RELATION);
                            cyblack_defbb_type_relation_set_subtype_method(new_relation, subtype);
                            cyblack_defbb_type_relation_set_supertype_method(new_relation, supertype);
                            relations = cons(new_relation, relations);
                            sublisp_throw($sym456$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD, new_relation);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_type_relation_table_relations(self, relations);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_type_relation_table_method = Errors.handleThrowable(ccatch_env_var, $sym456$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD);
            }
            return catch_var_for_cyblack_type_relation_table_method;
        }
    }

    public static final SubLObject parse_cyblack_defbb_body(SubLObject v_object, SubLObject subset_type_graph, SubLObject subset_posting_decls, SubLObject subset_panel_decls) {
        if (subset_type_graph == UNPROVIDED) {
            subset_type_graph = NIL;
        }
        if (subset_posting_decls == UNPROVIDED) {
            subset_posting_decls = NIL;
        }
        if (subset_panel_decls == UNPROVIDED) {
            subset_panel_decls = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_valid_body_p(v_object)) {
                    Errors.error($str_alt461$PARSE_CYBLACK_DEFBB_BODY___S_is_n, v_object);
                }
            }
            {
                SubLObject type_graph = assoc($TYPE_GRAPH, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject type_to_posting_class_map = assoc($TYPE_TO_POSTING_CLASS_MAP, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject type_to_panel_class_map = assoc($TYPE_TO_PANEL_CLASS_MAP, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject on_startup = assoc($ON_STARTUP, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject on_shutdown = assoc($ON_SHUTDOWN, v_object, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!(((NIL != type_graph) && (NIL != type_to_posting_class_map)) && (NIL != type_to_panel_class_map))) {
                        Errors.error($str_alt465$PARSE_CYBLACK_DEFBB_BODY___S_is_n, v_object);
                    }
                }
                if ((NIL == type_graph) || (type_graph.isCons() && (type_graph.first() == $TYPE_GRAPH))) {
                    if (NIL != type_graph) {
                        type_graph = cons($TYPE_GRAPH, nconc(subset_type_graph, type_graph.rest()));
                    } else {
                        type_graph = cons($TYPE_GRAPH, subset_type_graph);
                    }
                }
                if ((NIL == type_to_posting_class_map) || (type_to_posting_class_map.isCons() && (type_to_posting_class_map.first() == $TYPE_TO_POSTING_CLASS_MAP))) {
                    if (NIL != type_to_posting_class_map) {
                        type_to_posting_class_map = cons($TYPE_TO_POSTING_CLASS_MAP, nconc(subset_posting_decls, type_to_posting_class_map.rest()));
                    } else {
                        type_to_posting_class_map = cons($TYPE_TO_POSTING_CLASS_MAP, subset_posting_decls);
                    }
                }
                if ((NIL == type_to_panel_class_map) || (type_to_panel_class_map.isCons() && (type_to_panel_class_map.first() == $TYPE_TO_PANEL_CLASS_MAP))) {
                    if (NIL != type_to_panel_class_map) {
                        type_to_panel_class_map = cons($TYPE_TO_PANEL_CLASS_MAP, nconc(subset_panel_decls, type_to_panel_class_map.rest()));
                    } else {
                        type_to_panel_class_map = cons($TYPE_TO_PANEL_CLASS_MAP, subset_panel_decls);
                    }
                }
                {
                    SubLObject parsed_type_graph = parse_cyblack_defbb_type_graph(type_graph);
                    SubLObject parsed_type_to_posting_class_map = parse_cyblack_defbb_type_to_posting_class_map(type_to_posting_class_map);
                    SubLObject parsed_type_to_panel_class_map = parse_cyblack_defbb_type_to_panel_class_map(type_to_panel_class_map);
                    SubLObject parsed_on_startup = (NIL != on_startup) ? ((SubLObject) (parse_cyblack_defbb_on_startup(on_startup))) : NIL;
                    SubLObject parsed_on_shutdown = (NIL != on_shutdown) ? ((SubLObject) (parse_cyblack_defbb_on_shutdown(on_shutdown))) : NIL;
                    SubLObject body = object.new_class_instance(CYBLACK_DEFBB_BODY);
                    cyblack_defbb_body_set_type_graph_expression_method(body, parsed_type_graph);
                    cyblack_defbb_body_set_type_to_posting_class_map_method(body, parsed_type_to_posting_class_map);
                    cyblack_defbb_body_set_type_to_panel_class_map_method(body, parsed_type_to_panel_class_map);
                    cyblack_defbb_body_set_on_startup_expression_method(body, parsed_on_startup);
                    cyblack_defbb_body_set_on_shutdown_expression_method(body, parsed_on_shutdown);
                    if (NIL != parsed_type_graph) {
                        cyblack_defbb_expression_set_parent_method(parsed_type_graph, body);
                    }
                    if (NIL != parsed_type_to_posting_class_map) {
                        cyblack_defbb_expression_set_parent_method(parsed_type_to_posting_class_map, body);
                    }
                    if (NIL != parsed_type_to_panel_class_map) {
                        cyblack_defbb_expression_set_parent_method(parsed_type_to_panel_class_map, body);
                    }
                    if (NIL != parsed_on_startup) {
                        cyblack_defbb_expression_set_parent_method(parsed_on_startup, body);
                    }
                    if (NIL != parsed_on_shutdown) {
                        cyblack_defbb_expression_set_parent_method(parsed_on_shutdown, body);
                    }
                    return values(body, append(new SubLObject[]{ NIL != type_graph ? ((SubLObject) (list(type_graph))) : NIL, NIL != type_to_posting_class_map ? ((SubLObject) (list(type_to_posting_class_map))) : NIL, NIL != type_to_panel_class_map ? ((SubLObject) (list(type_to_panel_class_map))) : NIL, NIL != on_startup ? ((SubLObject) (list(on_startup))) : NIL, NIL != on_shutdown ? ((SubLObject) (list(on_shutdown))) : NIL }));
                }
            }
        }
    }

    public static final SubLObject parse_cyblack_defbb_type_graph(SubLObject type_graph) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((type_graph.isCons() && (type_graph.first() == $TYPE_GRAPH)) && type_graph.rest().isList())) {
                    Errors.error($str_alt466$PARSE_CYBLACK_DEFBB_TYPE_GRAPH___, type_graph);
                }
            }
            {
                SubLObject table = object.new_class_instance(CYBLACK_TYPE_RELATION_TABLE);
                SubLObject type_declarations = NIL;
                SubLObject subtype = NIL;
                SubLObject supertype = NIL;
                SubLObject list_expression = type_graph.rest();
                if (NIL == list_expression) {
                    type_declarations = NIL;
                } else
                    if (list_expression.isAtom()) {
                        type_declarations = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject unparsed_declaration = list_expression.first();
                                type_declarations = list(parse_cyblack_deffbb_type_declaration(unparsed_declaration));
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                {
                                    SubLObject unparsed_declaration = list_expression.first();
                                    type_declarations = list(parse_cyblack_deffbb_type_declaration(unparsed_declaration));
                                    tail_cons = type_declarations;
                                }
                                {
                                    SubLObject cdolist_list_var = list_expression.rest();
                                    SubLObject unparsed_declaration = NIL;
                                    for (unparsed_declaration = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , unparsed_declaration = cdolist_list_var.first()) {
                                        result = list(parse_cyblack_deffbb_type_declaration(unparsed_declaration));
                                        rplacd(tail_cons, result);
                                        tail_cons = result;
                                    }
                                }
                            }
                        }


                {
                    SubLObject cdolist_list_var = type_declarations;
                    SubLObject parsed_declaration = NIL;
                    for (parsed_declaration = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parsed_declaration = cdolist_list_var.first()) {
                        subtype = cyblack_deffbb_type_declaration_get_type_string_method(parsed_declaration);
                        supertype = (NIL != cyblack_deffbb_subtype_declaration_p(parsed_declaration)) ? ((SubLObject) (cyblack_deffbb_subtype_declaration_get_supertype_string_method(parsed_declaration))) : $$$POSTING;
                        cyblack_type_relation_table_add_relation_method(table, subtype, supertype);
                    }
                }
                {
                    SubLObject type_graph_1 = object.new_class_instance(CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION);
                    SubLObject cdolist_list_var = type_declarations;
                    SubLObject parsed_declaration = NIL;
                    for (parsed_declaration = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parsed_declaration = cdolist_list_var.first()) {
                        cyblack_defbb_type_graph_expression_add_type_declaration_method(type_graph_1, parsed_declaration);
                        cyblack_defbb_expression_set_parent_method(parsed_declaration, type_graph_1);
                    }
                    return type_graph_1;
                }
            }
        }
    }

    public static final SubLObject parse_cyblack_deffbb_type_declaration(SubLObject type_declaration) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(type_declaration.isCons() && (((((type_declaration.first() == $ROOT_TYPE) && type_declaration.rest().isCons()) && cadr(type_declaration).isString()) && (NIL == cddr(type_declaration))) || ((((((type_declaration.first() == $SUBTYPE) && type_declaration.rest().isCons()) && cadr(type_declaration).isString()) && cddr(type_declaration).isCons()) && cddr(type_declaration).first().isString()) && (NIL == cddr(type_declaration).rest()))))) {
                    Errors.error($str_alt469$PARSE_CYBLACK_DEFFBB_TYPE_DECLARA, type_declaration);
                }
            }
            {
                SubLObject head = type_declaration.first();
                SubLObject args = type_declaration.rest();
                SubLObject pcase_var = head;
                if (pcase_var.eql($ROOT_TYPE)) {
                    {
                        SubLObject type = args.first();
                        SubLObject root_type_declaration = object.new_class_instance(CYBLACK_DEFBB_ROOT_TYPE_DECLARATION);
                        cyblack_deffbb_type_declaration_set_type_string_method(root_type_declaration, type);
                        return root_type_declaration;
                    }
                } else
                    if (pcase_var.eql($SUBTYPE)) {
                        {
                            SubLObject subtype = args.first();
                            SubLObject supertype = cadr(args);
                            SubLObject subtype_declaration = object.new_class_instance(CYBLACK_DEFFBB_SUBTYPE_DECLARATION);
                            cyblack_deffbb_type_declaration_set_type_string_method(subtype_declaration, subtype);
                            cyblack_deffbb_subtype_declaration_set_supertype_string_method(subtype_declaration, supertype);
                            return subtype_declaration;
                        }
                    } else {
                        return NIL;
                    }

            }
        }
    }

    public static final SubLObject parse_cyblack_defbb_type_to_posting_class_map(SubLObject type_to_posting_class_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((type_to_posting_class_map.isCons() && (type_to_posting_class_map.first() == $TYPE_TO_POSTING_CLASS_MAP)) && type_to_posting_class_map.rest().isList())) {
                    Errors.error($str_alt470$PARSE_CYBLACK_DEFBB_TYPE_TO_POSTI, type_to_posting_class_map);
                }
            }
            {
                SubLObject parsed_posting_class_associations = NIL;
                SubLObject list_expression = type_to_posting_class_map.rest();
                if (NIL == list_expression) {
                    parsed_posting_class_associations = NIL;
                } else
                    if (list_expression.isAtom()) {
                        parsed_posting_class_associations = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject posting_class_association = list_expression.first();
                                parsed_posting_class_associations = list(parse_cyblack_defbb_posting_class_association(posting_class_association));
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                {
                                    SubLObject posting_class_association = list_expression.first();
                                    parsed_posting_class_associations = list(parse_cyblack_defbb_posting_class_association(posting_class_association));
                                    tail_cons = parsed_posting_class_associations;
                                }
                                {
                                    SubLObject cdolist_list_var = list_expression.rest();
                                    SubLObject posting_class_association = NIL;
                                    for (posting_class_association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting_class_association = cdolist_list_var.first()) {
                                        result = list(parse_cyblack_defbb_posting_class_association(posting_class_association));
                                        rplacd(tail_cons, result);
                                        tail_cons = result;
                                    }
                                }
                            }
                        }


                {
                    SubLObject parsed_posting_class_map = object.new_class_instance(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION);
                    SubLObject cdolist_list_var = parsed_posting_class_associations;
                    SubLObject parsed_posting_class_association = NIL;
                    for (parsed_posting_class_association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parsed_posting_class_association = cdolist_list_var.first()) {
                        cyblack_defbb_expression_set_parent_method(parsed_posting_class_association, parsed_posting_class_map);
                    }
                    cyblack_defbb_type_to_posting_class_map_expression_set_posting_class_associations_method(parsed_posting_class_map, parsed_posting_class_associations);
                    return parsed_posting_class_map;
                }
            }
        }
    }

    public static final SubLObject parse_cyblack_defbb_posting_class_association(SubLObject posting_class_association) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((((((posting_class_association.isCons() && (posting_class_association.first() == $POSTING_CLASS)) && posting_class_association.rest().isCons()) && cadr(posting_class_association).isString()) && cddr(posting_class_association).isCons()) && cddr(posting_class_association).first().isSymbol()) && (NIL == cddr(posting_class_association).rest()))) {
                    Errors.error($str_alt472$PARSE_CYBLACK_DEFBB_POSTING_CLASS, posting_class_association);
                }
            }
            {
                SubLObject datum = posting_class_association;
                SubLObject current = datum;
                SubLObject tag = NIL;
                SubLObject type_string = NIL;
                SubLObject class_name = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt473);
                tag = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt473);
                type_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt473);
                class_name = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == classes.classes_implements_p(class_name, CYBLACK_POSTING)) {
                        Errors.warn($str_alt474$PARSE_CYBLACK_DEFBB_POSTING_CLASS, class_name);
                    }
                    {
                        SubLObject parsed_posting_class_association = object.new_class_instance(CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION);
                        cyblack_defbb_type_association_set_type_string_method(parsed_posting_class_association, type_string);
                        cyblack_defbb_posting_class_association_set_posting_class_method(parsed_posting_class_association, class_name);
                        return parsed_posting_class_association;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt473);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject parse_cyblack_defbb_type_to_panel_class_map(SubLObject type_to_panel_class_map) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((type_to_panel_class_map.isCons() && (type_to_panel_class_map.first() == $TYPE_TO_PANEL_CLASS_MAP)) && type_to_panel_class_map.rest().isList())) {
                    Errors.error($str_alt475$PARSE_CYBLACK_DEFBB_TYPE_TO_PANEL, type_to_panel_class_map);
                }
            }
            {
                SubLObject parsed_panel_class_associations = NIL;
                SubLObject list_expression = type_to_panel_class_map.rest();
                if (NIL == list_expression) {
                    parsed_panel_class_associations = NIL;
                } else
                    if (list_expression.isAtom()) {
                        parsed_panel_class_associations = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject panel_class_association = list_expression.first();
                                parsed_panel_class_associations = list(parse_cyblack_defbb_panel_class_association(panel_class_association));
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                {
                                    SubLObject panel_class_association = list_expression.first();
                                    parsed_panel_class_associations = list(parse_cyblack_defbb_panel_class_association(panel_class_association));
                                    tail_cons = parsed_panel_class_associations;
                                }
                                {
                                    SubLObject cdolist_list_var = list_expression.rest();
                                    SubLObject panel_class_association = NIL;
                                    for (panel_class_association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel_class_association = cdolist_list_var.first()) {
                                        result = list(parse_cyblack_defbb_panel_class_association(panel_class_association));
                                        rplacd(tail_cons, result);
                                        tail_cons = result;
                                    }
                                }
                            }
                        }


                {
                    SubLObject parsed_panel_class_map = object.new_class_instance(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION);
                    SubLObject cdolist_list_var = parsed_panel_class_associations;
                    SubLObject parsed_panel_class_association = NIL;
                    for (parsed_panel_class_association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parsed_panel_class_association = cdolist_list_var.first()) {
                        cyblack_defbb_expression_set_parent_method(parsed_panel_class_association, parsed_panel_class_map);
                    }
                    cyblack_defbb_type_to_panel_class_map_expression_set_panel_class_associations_method(parsed_panel_class_map, parsed_panel_class_associations);
                    return parsed_panel_class_map;
                }
            }
        }
    }

    public static final SubLObject parse_cyblack_defbb_panel_class_association(SubLObject panel_class_association) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((((((panel_class_association.isCons() && (panel_class_association.first() == $PANEL_CLASS)) && panel_class_association.rest().isCons()) && cadr(panel_class_association).isString()) && cddr(panel_class_association).isCons()) && cddr(panel_class_association).first().isSymbol()) && (NIL == cddr(panel_class_association).rest()))) {
                    Errors.error($str_alt477$PARSE_CYBLACK_DEFBB_PANEL_CLASS_A, panel_class_association);
                }
            }
            {
                SubLObject datum = panel_class_association;
                SubLObject current = datum;
                SubLObject tag = NIL;
                SubLObject type_string = NIL;
                SubLObject class_name = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt473);
                tag = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt473);
                type_string = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt473);
                class_name = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL == classes.classes_implements_p(class_name, CYBLACK_PANEL)) {
                        Errors.warn($str_alt478$PARSE_CYBLACK_DEFBB_PANEL_CLASS_A, class_name);
                    }
                    {
                        SubLObject parsed_panel_class_association = object.new_class_instance(CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION);
                        cyblack_defbb_type_association_set_type_string_method(parsed_panel_class_association, type_string);
                        cyblack_defbb_panel_class_association_set_panel_class_method(parsed_panel_class_association, class_name);
                        return parsed_panel_class_association;
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt473);
                }
            }
            return NIL;
        }
    }

    public static final SubLObject parse_cyblack_defbb_on_startup(SubLObject on_startup) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == on_startup) || ((on_startup.isCons() && (on_startup.first() == $ON_STARTUP)) && on_startup.rest().isList()))) {
                    Errors.error($str_alt479$PARSE_CYBLACK_DEFBB_ON_STARTUP___, on_startup);
                }
            }
            if (NIL == on_startup) {
                return NIL;
            }
            {
                SubLObject parsed_on_startup = object.new_class_instance(CYBLACK_DEFBB_ON_STARTUP_EXPRESSION);
                cyblack_defbb_method_expression_set_symbolic_expressions_method(parsed_on_startup, on_startup.rest());
                return parsed_on_startup;
            }
        }
    }

    public static final SubLObject parse_cyblack_defbb_on_shutdown(SubLObject on_shutdown) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == on_shutdown) || ((on_shutdown.isCons() && (on_shutdown.first() == $ON_SHUTDOWN)) && on_shutdown.rest().isList()))) {
                    Errors.error($str_alt480$PARSE_CYBLACK_DEFBB_ON_SHUTDOWN__, on_shutdown);
                }
            }
            if (NIL == on_shutdown) {
                return NIL;
            }
            {
                SubLObject parsed_on_shutdown = object.new_class_instance(CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION);
                cyblack_defbb_method_expression_set_symbolic_expressions_method(parsed_on_shutdown, on_shutdown.rest());
                return parsed_on_shutdown;
            }
        }
    }

    public static final SubLObject cyblack_set_blackboard_info(SubLObject symbol, SubLObject blackboard_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != symbol) && symbol.isSymbol())) {
                    Errors.error($str_alt481$CYBLACK_SET_BLACKBOARD_INFO___S_i, symbol);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == blackboard_info) || (NIL != cyblack_blackboard_info_p(blackboard_info)))) {
                    Errors.error($str_alt482$CYBLACK_SET_BLACKBOARD_INFO___S_i, blackboard_info);
                }
            }
            put(symbol, $CYBLACK_BLACKBOARD_INFO, blackboard_info);
            return blackboard_info;
        }
    }

    public static final SubLObject cyblack_get_blackboard_info(SubLObject symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != symbol) && symbol.isSymbol())) {
                    Errors.error($str_alt484$CYBLACK_GET_BLACKBOARD_INFO___S_i, symbol);
                }
            }
            {
                SubLObject blackboard_info = get(symbol, $CYBLACK_BLACKBOARD_INFO, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL == blackboard_info) || (NIL != cyblack_blackboard_info_p(blackboard_info)))) {
                        Errors.error($str_alt485$CYBLACK_GET_BLACKBOARD_INFO___S_i, blackboard_info);
                    }
                }
                return blackboard_info;
            }
        }
    }

    public static final SubLObject get_cyblack_blackboard_info_parsed_body(SubLObject cyblack_blackboard_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_blackboard_info, TWO_INTEGER, PARSED_BODY);
    }

    public static final SubLObject set_cyblack_blackboard_info_parsed_body(SubLObject cyblack_blackboard_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_blackboard_info, value, TWO_INTEGER, PARSED_BODY);
    }

    public static final SubLObject get_cyblack_blackboard_info_blackboard_class_name(SubLObject cyblack_blackboard_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_blackboard_info, ONE_INTEGER, BLACKBOARD_CLASS_NAME);
    }

    public static final SubLObject set_cyblack_blackboard_info_blackboard_class_name(SubLObject cyblack_blackboard_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_blackboard_info, value, ONE_INTEGER, BLACKBOARD_CLASS_NAME);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_blackboard_info_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_blackboard_info_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BLACKBOARD_INFO, BLACKBOARD_CLASS_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BLACKBOARD_INFO, PARSED_BODY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_blackboard_info_p(SubLObject cyblack_blackboard_info) {
        return classes.subloop_instanceof_class(cyblack_blackboard_info, CYBLACK_BLACKBOARD_INFO);
    }

    public static final SubLObject cyblack_blackboard_info_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_blackboard_info_method = NIL;
            SubLObject parsed_body = get_cyblack_blackboard_info_parsed_body(self);
            SubLObject blackboard_class_name = get_cyblack_blackboard_info_blackboard_class_name(self);
            try {
                try {
                    object.object_initialize_method(self);
                    blackboard_class_name = NIL;
                    parsed_body = NIL;
                    sublisp_throw($sym493$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_blackboard_info_parsed_body(self, parsed_body);
                            set_cyblack_blackboard_info_blackboard_class_name(self, blackboard_class_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_blackboard_info_method = Errors.handleThrowable(ccatch_env_var, $sym493$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD);
            }
            return catch_var_for_cyblack_blackboard_info_method;
        }
    }

    public static final SubLObject cyblack_blackboard_info_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_blackboard_info_method = NIL;
            SubLObject parsed_body = get_cyblack_blackboard_info_parsed_body(self);
            SubLObject blackboard_class_name = get_cyblack_blackboard_info_blackboard_class_name(self);
            try {
                try {
                    format(stream, $str_alt497$__CYBLACK_BLACKBOARD_INFO___S___S, blackboard_class_name, parsed_body);
                    sublisp_throw($sym496$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_blackboard_info_parsed_body(self, parsed_body);
                            set_cyblack_blackboard_info_blackboard_class_name(self, blackboard_class_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_blackboard_info_method = Errors.handleThrowable(ccatch_env_var, $sym496$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD);
            }
            return catch_var_for_cyblack_blackboard_info_method;
        }
    }

    public static final SubLObject cyblack_blackboard_info_get_blackboard_class_name_method(SubLObject self) {
        {
            SubLObject blackboard_class_name = get_cyblack_blackboard_info_blackboard_class_name(self);
            return blackboard_class_name;
        }
    }

    public static final SubLObject cyblack_blackboard_info_set_blackboard_class_name_method(SubLObject self, SubLObject new_class_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_blackboard_info_method = NIL;
                SubLObject blackboard_class_name = get_cyblack_blackboard_info_blackboard_class_name(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_class_name.isSymbol()) {
                                Errors.error($str_alt506$_SET_BLACKBOARD_CLASS_NAME___S_is, self, new_class_name);
                            }
                        }
                        blackboard_class_name = new_class_name;
                        sublisp_throw($sym505$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD, new_class_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_blackboard_info_blackboard_class_name(self, blackboard_class_name);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_blackboard_info_method = Errors.handleThrowable(ccatch_env_var, $sym505$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD);
                }
                return catch_var_for_cyblack_blackboard_info_method;
            }
        }
    }

    public static final SubLObject cyblack_blackboard_info_get_parsed_body_method(SubLObject self) {
        {
            SubLObject parsed_body = get_cyblack_blackboard_info_parsed_body(self);
            return parsed_body;
        }
    }

    public static final SubLObject cyblack_blackboard_info_set_parsed_body_method(SubLObject self, SubLObject new_parsed_body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_blackboard_info_method = NIL;
                SubLObject parsed_body = get_cyblack_blackboard_info_parsed_body(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_parsed_body) || (NIL != cyblack_defbb_body_p(new_parsed_body)))) {
                                Errors.error($str_alt515$_SET_PARSED_BODY__S____S_is_not_a, self, new_parsed_body);
                            }
                        }
                        parsed_body = new_parsed_body;
                        sublisp_throw($sym514$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD, new_parsed_body);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_blackboard_info_parsed_body(self, parsed_body);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_blackboard_info_method = Errors.handleThrowable(ccatch_env_var, $sym514$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD);
                }
                return catch_var_for_cyblack_blackboard_info_method;
            }
        }
    }

    public static final SubLObject cyblack_blackboard_info_compile_to_subtype_expressions_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_blackboard_info_method = NIL;
            SubLObject parsed_body = get_cyblack_blackboard_info_parsed_body(self);
            try {
                try {
                    if (NIL != parsed_body) {
                        sublisp_throw($sym518$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD, cyblack_defbb_body_compile_to_subtype_expressions_method(parsed_body));
                    }
                    sublisp_throw($sym518$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_blackboard_info_parsed_body(self, parsed_body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_blackboard_info_method = Errors.handleThrowable(ccatch_env_var, $sym518$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD);
            }
            return catch_var_for_cyblack_blackboard_info_method;
        }
    }

    public static final SubLObject cyblack_set_blackboard_info_given_parsed_body(SubLObject blackboard_class_name, SubLObject parsed_body) {
        {
            SubLObject blackboard_info = object.new_class_instance(CYBLACK_BLACKBOARD_INFO);
            cyblack_blackboard_info_set_blackboard_class_name_method(blackboard_info, blackboard_class_name);
            cyblack_blackboard_info_set_parsed_body_method(blackboard_info, parsed_body);
            cyblack_set_blackboard_info(blackboard_class_name, blackboard_info);
            return blackboard_info;
        }
    }

    public static final SubLObject cyblack_record_blackboard_info(SubLObject blackboard_class_name, SubLObject unparsed_body) {
        {
            SubLObject parsed_body = parse_cyblack_defbb_body(unparsed_body, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return cyblack_set_blackboard_info_given_parsed_body(blackboard_class_name, parsed_body);
        }
    }

    public static final SubLObject cyblack_defbb_filter_body(SubLObject body) {
        if (body.isCons()) {
            {
                SubLObject class_items = NIL;
                SubLObject defbb_items = NIL;
                SubLObject cdolist_list_var = body;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    if (item.isCons()) {
                        if (NIL != cyblack_defbb_body_keyword_p(item.first())) {
                            defbb_items = cons(item, defbb_items);
                        } else {
                            class_items = cons(item, class_items);
                        }
                    } else {
                        class_items = cons(item, class_items);
                    }
                }
                return values(nreverse(class_items), nreverse(defbb_items));
            }
        }
        return values(NIL, NIL);
    }

    /**
     * Returns two values.  The first value is a list of options to provide
     * to the class definition of the blackboard.  The second list is a list
     * of bb-subset names.
     */
    public static final SubLObject cyblack_defbb_filter_options(SubLObject options) {
        {
            SubLObject class_options = NIL;
            SubLObject bb_subset_names = NIL;
            SubLObject remainder = NIL;
            for (remainder = options; NIL != remainder; remainder = cddr(remainder)) {
                {
                    SubLObject key = remainder.first();
                    SubLObject value = cadr(remainder);
                    if (NIL != classes.classes_valid_class_property_p(key)) {
                        class_options = cons(value, cons(key, class_options));
                    } else
                        if (key == $UNION) {
                            bb_subset_names = copy_list(value);
                        }

                }
            }
            return values(nreverse(class_options), bb_subset_names);
        }
    }

    public static final SubLObject expand_define_blackboard(SubLObject blackboard_name, SubLObject options, SubLObject body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject class_options = cyblack_defbb_filter_options(options);
                SubLObject bb_subsets = thread.secondMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject subset_type_graph = cyblack_defbbsubset.merge_bbsubsets(bb_subsets);
                    SubLObject subset_posting_decls = thread.secondMultipleValue();
                    SubLObject subset_panel_decls = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject class_body = cyblack_defbb_filter_body(body);
                        SubLObject defbb_body = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        thread.resetMultipleValues();
                        {
                            SubLObject parsed_body = parse_cyblack_defbb_body(defbb_body, subset_type_graph, subset_posting_decls, subset_panel_decls);
                            SubLObject processed_body = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            cyblack_set_blackboard_info_given_parsed_body(blackboard_name, parsed_body);
                            return list(PROGN, list(CYBLACK_RECORD_BLACKBOARD_INFO, list(QUOTE, blackboard_name), list(QUOTE, processed_body)), listS(DEFINE_CLASS, bq_cons(blackboard_name, class_options), append(class_body, NIL)));
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject define_blackboard(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt524);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject blackboard_name = NIL;
                    SubLObject options = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt524);
                    blackboard_name = current.first();
                    current = current.rest();
                    options = current;
                    current = temp;
                    {
                        SubLObject body = current;
                        return expand_define_blackboard(blackboard_name, options, body);
                    }
                }
            }
        }
    }

    public static final SubLObject declare_cyblack_defbb_file() {
        declareFunction("valid_cyblack_defbb_option_keywords", "VALID-CYBLACK-DEFBB-OPTION-KEYWORDS", 0, 0, false);
        declareFunction("cyblack_defbb_option_keyword_p", "CYBLACK-DEFBB-OPTION-KEYWORD-P", 1, 0, false);
        declareFunction("encode_cyblack_defbb_option_keyword", "ENCODE-CYBLACK-DEFBB-OPTION-KEYWORD", 1, 0, false);
        declareFunction("decode_cyblack_defbb_option_keyword", "DECODE-CYBLACK-DEFBB-OPTION-KEYWORD", 1, 0, false);
        declareFunction("cyblack_defbb_option_keyword_less_p", "CYBLACK-DEFBB-OPTION-KEYWORD-LESS-P", 2, 0, false);
        declareFunction("cyblack_defbb_option_keyword_greater_p", "CYBLACK-DEFBB-OPTION-KEYWORD-GREATER-P", 2, 0, false);
        declareFunction("valid_cyblack_defbb_body_keywords", "VALID-CYBLACK-DEFBB-BODY-KEYWORDS", 0, 0, false);
        declareFunction("cyblack_defbb_body_keyword_p", "CYBLACK-DEFBB-BODY-KEYWORD-P", 1, 0, false);
        declareFunction("encode_cyblack_defbb_body_keyword", "ENCODE-CYBLACK-DEFBB-BODY-KEYWORD", 1, 0, false);
        declareFunction("decode_cyblack_defbb_body_keyword", "DECODE-CYBLACK-DEFBB-BODY-KEYWORD", 1, 0, false);
        declareFunction("cyblack_defbb_body_keyword_less_p", "CYBLACK-DEFBB-BODY-KEYWORD-LESS-P", 2, 0, false);
        declareFunction("cyblack_defbb_body_keyword_greater_p", "CYBLACK-DEFBB-BODY-KEYWORD-GREATER-P", 2, 0, false);
        declareFunction("cyblack_valid_body_p", "CYBLACK-VALID-BODY-P", 1, 0, false);
        declareFunction("get_cyblack_defbb_expression_children", "GET-CYBLACK-DEFBB-EXPRESSION-CHILDREN", 1, 0, false);
        declareFunction("set_cyblack_defbb_expression_children", "SET-CYBLACK-DEFBB-EXPRESSION-CHILDREN", 2, 0, false);
        declareFunction("get_cyblack_defbb_expression_parent", "GET-CYBLACK-DEFBB-EXPRESSION-PARENT", 1, 0, false);
        declareFunction("set_cyblack_defbb_expression_parent", "SET-CYBLACK-DEFBB-EXPRESSION-PARENT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_expression_p", "CYBLACK-DEFBB-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defbb_expression_initialize_method", "CYBLACK-DEFBB-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_expression_print_method", "CYBLACK-DEFBB-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defbb_expression_get_parent_method", "CYBLACK-DEFBB-EXPRESSION-GET-PARENT-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_expression_set_parent_method", "CYBLACK-DEFBB-EXPRESSION-SET-PARENT-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_expression_add_child_method", "CYBLACK-DEFBB-EXPRESSION-ADD-CHILD-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_expression_get_children_method", "CYBLACK-DEFBB-EXPRESSION-GET-CHILDREN-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defbb_type_graph_expression_type_declarations", "GET-CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-TYPE-DECLARATIONS", 1, 0, false);
        declareFunction("set_cyblack_defbb_type_graph_expression_type_declarations", "SET-CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-TYPE-DECLARATIONS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_type_graph_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_type_graph_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_type_graph_expression_p", "CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defbb_type_graph_expression_intialize_method", "CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-INTIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_graph_expression_print_method", "CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defbb_type_graph_expression_get_type_declarations_method", "CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-GET-TYPE-DECLARATIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_graph_expression_set_type_declarations_method", "CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-SET-TYPE-DECLARATIONS-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_type_graph_expression_add_type_declaration_method", "CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-ADD-TYPE-DECLARATION-METHOD", 2, 0, false);
        declareFunction("get_cyblack_deffbb_type_declaration_type_string", "GET-CYBLACK-DEFFBB-TYPE-DECLARATION-TYPE-STRING", 1, 0, false);
        declareFunction("set_cyblack_deffbb_type_declaration_type_string", "SET-CYBLACK-DEFFBB-TYPE-DECLARATION-TYPE-STRING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_deffbb_type_declaration_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFFBB-TYPE-DECLARATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_deffbb_type_declaration_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFFBB-TYPE-DECLARATION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_deffbb_type_declaration_p", "CYBLACK-DEFFBB-TYPE-DECLARATION-P", 1, 0, false);
        declareFunction("cyblack_deffbb_type_declaration_list_p", "CYBLACK-DEFFBB-TYPE-DECLARATION-LIST-P", 1, 0, false);
        declareFunction("cyblack_deffbb_type_declaration_initialize_method", "CYBLACK-DEFFBB-TYPE-DECLARATION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_deffbb_type_declaration_print_method", "CYBLACK-DEFFBB-TYPE-DECLARATION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_deffbb_type_declaration_get_type_string_method", "CYBLACK-DEFFBB-TYPE-DECLARATION-GET-TYPE-STRING-METHOD", 1, 0, false);
        declareFunction("cyblack_deffbb_type_declaration_set_type_string_method", "CYBLACK-DEFFBB-TYPE-DECLARATION-SET-TYPE-STRING-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_root_type_declaration_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ROOT-TYPE-DECLARATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_root_type_declaration_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ROOT-TYPE-DECLARATION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_root_type_declaration_p", "CYBLACK-DEFBB-ROOT-TYPE-DECLARATION-P", 1, 0, false);
        declareFunction("cyblack_defbb_root_type_declaration_print_method", "CYBLACK-DEFBB-ROOT-TYPE-DECLARATION-PRINT-METHOD", 3, 0, false);
        declareFunction("get_cyblack_deffbb_subtype_declaration_supertype_string", "GET-CYBLACK-DEFFBB-SUBTYPE-DECLARATION-SUPERTYPE-STRING", 1, 0, false);
        declareFunction("set_cyblack_deffbb_subtype_declaration_supertype_string", "SET-CYBLACK-DEFFBB-SUBTYPE-DECLARATION-SUPERTYPE-STRING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_deffbb_subtype_declaration_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFFBB-SUBTYPE-DECLARATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_deffbb_subtype_declaration_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFFBB-SUBTYPE-DECLARATION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_deffbb_subtype_declaration_p", "CYBLACK-DEFFBB-SUBTYPE-DECLARATION-P", 1, 0, false);
        declareFunction("cyblack_deffbb_subtype_declaration_initialize_method", "CYBLACK-DEFFBB-SUBTYPE-DECLARATION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_deffbb_subtype_declaration_print_method", "CYBLACK-DEFFBB-SUBTYPE-DECLARATION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_deffbb_subtype_declaration_get_supertype_string_method", "CYBLACK-DEFFBB-SUBTYPE-DECLARATION-GET-SUPERTYPE-STRING-METHOD", 1, 0, false);
        declareFunction("cyblack_deffbb_subtype_declaration_set_supertype_string_method", "CYBLACK-DEFFBB-SUBTYPE-DECLARATION-SET-SUPERTYPE-STRING-METHOD", 2, 0, false);
        declareFunction("get_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations", "GET-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-POSTING-CLASS-ASSOCIATIONS", 1, 0, false);
        declareFunction("set_cyblack_defbb_type_to_posting_class_map_expression_posting_class_associations", "SET-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-POSTING-CLASS-ASSOCIATIONS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_type_to_posting_class_map_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_type_to_posting_class_map_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_type_to_posting_class_map_expression_p", "CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defbb_type_to_posting_class_map_expression_initialize_method", "CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_to_posting_class_map_expression_print_method", "CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defbb_type_to_posting_class_map_expression_get_posting_class_associations_method", "CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-GET-POSTING-CLASS-ASSOCIATIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_to_posting_class_map_expression_set_posting_class_associations_method", "CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-SET-POSTING-CLASS-ASSOCIATIONS-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_type_to_posting_class_map_expression_add_posting_class_association_method", "CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-ADD-POSTING-CLASS-ASSOCIATION-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_type_to_posting_class_map_expression_get_posting_class_given_type_string_method", "CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-GET-POSTING-CLASS-GIVEN-TYPE-STRING-METHOD", 2, 0, false);
        declareFunction("get_cyblack_defbb_type_association_type_string", "GET-CYBLACK-DEFBB-TYPE-ASSOCIATION-TYPE-STRING", 1, 0, false);
        declareFunction("set_cyblack_defbb_type_association_type_string", "SET-CYBLACK-DEFBB-TYPE-ASSOCIATION-TYPE-STRING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_type_association_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-ASSOCIATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_type_association_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-ASSOCIATION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_type_association_p", "CYBLACK-DEFBB-TYPE-ASSOCIATION-P", 1, 0, false);
        declareFunction("cyblack_defbb_type_association_initialize_method", "CYBLACK-DEFBB-TYPE-ASSOCIATION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_association_print_method", "CYBLACK-DEFBB-TYPE-ASSOCIATION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defbb_type_association_get_type_string_method", "CYBLACK-DEFBB-TYPE-ASSOCIATION-GET-TYPE-STRING-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_association_set_type_string_method", "CYBLACK-DEFBB-TYPE-ASSOCIATION-SET-TYPE-STRING-METHOD", 2, 0, false);
        declareFunction("get_cyblack_defbb_posting_class_association_posting_class", "GET-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-POSTING-CLASS", 1, 0, false);
        declareFunction("set_cyblack_defbb_posting_class_association_posting_class", "SET-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-POSTING-CLASS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_posting_class_association_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_posting_class_association_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_posting_class_association_p", "CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-P", 1, 0, false);
        declareFunction("cyblack_defbb_posting_class_association_initialize_method", "CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_posting_class_association_print_method", "CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defbb_posting_class_association_get_posting_class_method", "CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-GET-POSTING-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_posting_class_association_set_posting_class_method", "CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-SET-POSTING-CLASS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations", "GET-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-PANEL-CLASS-ASSOCIATIONS", 1, 0, false);
        declareFunction("set_cyblack_defbb_type_to_panel_class_map_expression_panel_class_associations", "SET-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-PANEL-CLASS-ASSOCIATIONS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_type_to_panel_class_map_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_type_to_panel_class_map_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_type_to_panel_class_map_expression_p", "CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defbb_type_to_panel_class_map_expression_initialize_method", "CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_to_panel_class_map_expression_print_method", "CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defbb_type_to_panel_class_map_expression_get_panel_class_associations_method", "CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-GET-PANEL-CLASS-ASSOCIATIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_to_panel_class_map_expression_set_panel_class_associations_method", "CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-SET-PANEL-CLASS-ASSOCIATIONS-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_type_to_panel_class_map_expression_add_panel_class_association_method", "CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-ADD-PANEL-CLASS-ASSOCIATION-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_type_to_panel_class_map_expression_get_panel_class_given_type_string_method", "CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-GET-PANEL-CLASS-GIVEN-TYPE-STRING-METHOD", 2, 0, false);
        declareFunction("get_cyblack_defbb_panel_class_association_panel_class", "GET-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-PANEL-CLASS", 1, 0, false);
        declareFunction("set_cyblack_defbb_panel_class_association_panel_class", "SET-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-PANEL-CLASS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_panel_class_association_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_panel_class_association_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_panel_class_association_p", "CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-P", 1, 0, false);
        declareFunction("cyblack_defbb_panel_class_association_initialize_method", "CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_panel_class_association_print_method", "CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defbb_panel_class_association_get_panel_class_method", "CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-GET-PANEL-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_panel_class_association_set_panel_class_method", "CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-SET-PANEL-CLASS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_defbb_method_expression_symbolic_expressions", "GET-CYBLACK-DEFBB-METHOD-EXPRESSION-SYMBOLIC-EXPRESSIONS", 1, 0, false);
        declareFunction("set_cyblack_defbb_method_expression_symbolic_expressions", "SET-CYBLACK-DEFBB-METHOD-EXPRESSION-SYMBOLIC-EXPRESSIONS", 2, 0, false);
        declareFunction("get_cyblack_defbb_method_expression_method_name_key", "GET-CYBLACK-DEFBB-METHOD-EXPRESSION-METHOD-NAME-KEY", 1, 0, false);
        declareFunction("set_cyblack_defbb_method_expression_method_name_key", "SET-CYBLACK-DEFBB-METHOD-EXPRESSION-METHOD-NAME-KEY", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_method_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-METHOD-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_method_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-METHOD-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_method_expression_p", "CYBLACK-DEFBB-METHOD-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defbb_method_expression_initialize_method", "CYBLACK-DEFBB-METHOD-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_method_expression_print_method", "CYBLACK-DEFBB-METHOD-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defbb_method_expression_get_symbolic_expressions_method", "CYBLACK-DEFBB-METHOD-EXPRESSION-GET-SYMBOLIC-EXPRESSIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_method_expression_set_symbolic_expressions_method", "CYBLACK-DEFBB-METHOD-EXPRESSION-SET-SYMBOLIC-EXPRESSIONS-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_on_startup_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ON-STARTUP-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_on_startup_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ON-STARTUP-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_on_startup_expression_p", "CYBLACK-DEFBB-ON-STARTUP-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defbb_on_startup_expression_initialize_method", "CYBLACK-DEFBB-ON-STARTUP-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_on_shutdown_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_on_shutdown_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_on_shutdown_expression_p", "CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defbb_on_shutdown_expression_initialize_method", "CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defbb_body_on_shutdown_expression", "GET-CYBLACK-DEFBB-BODY-ON-SHUTDOWN-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defbb_body_on_shutdown_expression", "SET-CYBLACK-DEFBB-BODY-ON-SHUTDOWN-EXPRESSION", 2, 0, false);
        declareFunction("get_cyblack_defbb_body_on_startup_expression", "GET-CYBLACK-DEFBB-BODY-ON-STARTUP-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defbb_body_on_startup_expression", "SET-CYBLACK-DEFBB-BODY-ON-STARTUP-EXPRESSION", 2, 0, false);
        declareFunction("get_cyblack_defbb_body_type_to_panel_class_map", "GET-CYBLACK-DEFBB-BODY-TYPE-TO-PANEL-CLASS-MAP", 1, 0, false);
        declareFunction("set_cyblack_defbb_body_type_to_panel_class_map", "SET-CYBLACK-DEFBB-BODY-TYPE-TO-PANEL-CLASS-MAP", 2, 0, false);
        declareFunction("get_cyblack_defbb_body_type_to_posting_class_map", "GET-CYBLACK-DEFBB-BODY-TYPE-TO-POSTING-CLASS-MAP", 1, 0, false);
        declareFunction("set_cyblack_defbb_body_type_to_posting_class_map", "SET-CYBLACK-DEFBB-BODY-TYPE-TO-POSTING-CLASS-MAP", 2, 0, false);
        declareFunction("get_cyblack_defbb_body_type_graph_expression", "GET-CYBLACK-DEFBB-BODY-TYPE-GRAPH-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defbb_body_type_graph_expression", "SET-CYBLACK-DEFBB-BODY-TYPE-GRAPH-EXPRESSION", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_body_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-BODY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_body_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-BODY-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_body_p", "CYBLACK-DEFBB-BODY-P", 1, 0, false);
        declareFunction("cyblack_defbb_body_initialize_method", "CYBLACK-DEFBB-BODY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_body_print_method", "CYBLACK-DEFBB-BODY-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defbb_body_get_type_graph_expression_method", "CYBLACK-DEFBB-BODY-GET-TYPE-GRAPH-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_body_set_type_graph_expression_method", "CYBLACK-DEFBB-BODY-SET-TYPE-GRAPH-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_body_get_type_to_posting_class_map_method", "CYBLACK-DEFBB-BODY-GET-TYPE-TO-POSTING-CLASS-MAP-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_body_set_type_to_posting_class_map_method", "CYBLACK-DEFBB-BODY-SET-TYPE-TO-POSTING-CLASS-MAP-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_body_get_type_to_panel_class_map_method", "CYBLACK-DEFBB-BODY-GET-TYPE-TO-PANEL-CLASS-MAP-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_body_set_type_to_panel_class_map_method", "CYBLACK-DEFBB-BODY-SET-TYPE-TO-PANEL-CLASS-MAP-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_body_get_on_startup_expression_method", "CYBLACK-DEFBB-BODY-GET-ON-STARTUP-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_body_set_on_startup_expression_method", "CYBLACK-DEFBB-BODY-SET-ON-STARTUP-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_body_get_on_shutdown_expression_method", "CYBLACK-DEFBB-BODY-GET-ON-SHUTDOWN-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_body_set_on_shutdown_expression_method", "CYBLACK-DEFBB-BODY-SET-ON-SHUTDOWN-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_body_compile_to_subtype_expressions_method", "CYBLACK-DEFBB-BODY-COMPILE-TO-SUBTYPE-EXPRESSIONS-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defbb_type_relation_supertype", "GET-CYBLACK-DEFBB-TYPE-RELATION-SUPERTYPE", 1, 0, false);
        declareFunction("set_cyblack_defbb_type_relation_supertype", "SET-CYBLACK-DEFBB-TYPE-RELATION-SUPERTYPE", 2, 0, false);
        declareFunction("get_cyblack_defbb_type_relation_subtype", "GET-CYBLACK-DEFBB-TYPE-RELATION-SUBTYPE", 1, 0, false);
        declareFunction("set_cyblack_defbb_type_relation_subtype", "SET-CYBLACK-DEFBB-TYPE-RELATION-SUBTYPE", 2, 0, false);
        declareFunction("get_cyblack_defbb_type_relation_mark", "GET-CYBLACK-DEFBB-TYPE-RELATION-MARK", 1, 0, false);
        declareFunction("set_cyblack_defbb_type_relation_mark", "SET-CYBLACK-DEFBB-TYPE-RELATION-MARK", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_type_relation_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-RELATION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defbb_type_relation_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-RELATION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defbb_type_relation_p", "CYBLACK-DEFBB-TYPE-RELATION-P", 1, 0, false);
        declareFunction("cyblack_defbb_type_relation_initialize_method", "CYBLACK-DEFBB-TYPE-RELATION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_relation_print_method", "CYBLACK-DEFBB-TYPE-RELATION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defbb_type_relation_get_subtype_method", "CYBLACK-DEFBB-TYPE-RELATION-GET-SUBTYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_relation_set_subtype_method", "CYBLACK-DEFBB-TYPE-RELATION-SET-SUBTYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_type_relation_get_supertype_method", "CYBLACK-DEFBB-TYPE-RELATION-GET-SUPERTYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_relation_set_supertype_method", "CYBLACK-DEFBB-TYPE-RELATION-SET-SUPERTYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_defbb_type_relation_get_mark_method", "CYBLACK-DEFBB-TYPE-RELATION-GET-MARK-METHOD", 1, 0, false);
        declareFunction("cyblack_defbb_type_relation_set_mark_method", "CYBLACK-DEFBB-TYPE-RELATION-SET-MARK-METHOD", 2, 0, false);
        declareFunction("valid_cyblack_defbb_check_relation_errors", "VALID-CYBLACK-DEFBB-CHECK-RELATION-ERRORS", 0, 0, false);
        declareFunction("cyblack_defbb_check_relation_error_p", "CYBLACK-DEFBB-CHECK-RELATION-ERROR-P", 1, 0, false);
        declareFunction("encode_cyblack_defbb_check_relation_error", "ENCODE-CYBLACK-DEFBB-CHECK-RELATION-ERROR", 1, 0, false);
        declareFunction("decode_cyblack_defbb_check_relation_error", "DECODE-CYBLACK-DEFBB-CHECK-RELATION-ERROR", 1, 0, false);
        declareFunction("cyblack_defbb_check_relation_error_less_p", "CYBLACK-DEFBB-CHECK-RELATION-ERROR-LESS-P", 2, 0, false);
        declareFunction("cyblack_defbb_check_relation_error_greater_p", "CYBLACK-DEFBB-CHECK-RELATION-ERROR-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_type_relation_table_relations", "GET-CYBLACK-TYPE-RELATION-TABLE-RELATIONS", 1, 0, false);
        declareFunction("set_cyblack_type_relation_table_relations", "SET-CYBLACK-TYPE-RELATION-TABLE-RELATIONS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_type_relation_table_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TYPE-RELATION-TABLE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_type_relation_table_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TYPE-RELATION-TABLE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_type_relation_table_p", "CYBLACK-TYPE-RELATION-TABLE-P", 1, 0, false);
        declareFunction("cyblack_type_relation_table_initialize_method", "CYBLACK-TYPE-RELATION-TABLE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_type_relation_table_print_method", "CYBLACK-TYPE-RELATION-TABLE-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_type_relation_table_clear_all_marks_method", "CYBLACK-TYPE-RELATION-TABLE-CLEAR-ALL-MARKS-METHOD", 1, 0, false);
        declareFunction("cyblack_type_relation_table_has_relation_method", "CYBLACK-TYPE-RELATION-TABLE-HAS-RELATION-METHOD", 3, 0, false);
        declareFunction("cyblack_type_relation_table_extend_super_method", "CYBLACK-TYPE-RELATION-TABLE-EXTEND-SUPER-METHOD", 2, 0, false);
        declareFunction("cyblack_type_relation_table_extend_sub_method", "CYBLACK-TYPE-RELATION-TABLE-EXTEND-SUB-METHOD", 2, 0, false);
        declareFunction("cyblack_type_relation_table_get_relations_method", "CYBLACK-TYPE-RELATION-TABLE-GET-RELATIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_type_relation_table_set_relations_method", "CYBLACK-TYPE-RELATION-TABLE-SET-RELATIONS-METHOD", 2, 0, false);
        declareFunction("cyblack_type_relation_table_check_relation_method", "CYBLACK-TYPE-RELATION-TABLE-CHECK-RELATION-METHOD", 3, 0, false);
        declareFunction("cyblack_type_relation_table_add_relation_method", "CYBLACK-TYPE-RELATION-TABLE-ADD-RELATION-METHOD", 3, 0, false);
        declareFunction("parse_cyblack_defbb_body", "PARSE-CYBLACK-DEFBB-BODY", 1, 3, false);
        declareFunction("parse_cyblack_defbb_type_graph", "PARSE-CYBLACK-DEFBB-TYPE-GRAPH", 1, 0, false);
        declareFunction("parse_cyblack_deffbb_type_declaration", "PARSE-CYBLACK-DEFFBB-TYPE-DECLARATION", 1, 0, false);
        declareFunction("parse_cyblack_defbb_type_to_posting_class_map", "PARSE-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP", 1, 0, false);
        declareFunction("parse_cyblack_defbb_posting_class_association", "PARSE-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION", 1, 0, false);
        declareFunction("parse_cyblack_defbb_type_to_panel_class_map", "PARSE-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP", 1, 0, false);
        declareFunction("parse_cyblack_defbb_panel_class_association", "PARSE-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION", 1, 0, false);
        declareFunction("parse_cyblack_defbb_on_startup", "PARSE-CYBLACK-DEFBB-ON-STARTUP", 1, 0, false);
        declareFunction("parse_cyblack_defbb_on_shutdown", "PARSE-CYBLACK-DEFBB-ON-SHUTDOWN", 1, 0, false);
        declareFunction("cyblack_set_blackboard_info", "CYBLACK-SET-BLACKBOARD-INFO", 2, 0, false);
        declareFunction("cyblack_get_blackboard_info", "CYBLACK-GET-BLACKBOARD-INFO", 1, 0, false);
        declareFunction("get_cyblack_blackboard_info_parsed_body", "GET-CYBLACK-BLACKBOARD-INFO-PARSED-BODY", 1, 0, false);
        declareFunction("set_cyblack_blackboard_info_parsed_body", "SET-CYBLACK-BLACKBOARD-INFO-PARSED-BODY", 2, 0, false);
        declareFunction("get_cyblack_blackboard_info_blackboard_class_name", "GET-CYBLACK-BLACKBOARD-INFO-BLACKBOARD-CLASS-NAME", 1, 0, false);
        declareFunction("set_cyblack_blackboard_info_blackboard_class_name", "SET-CYBLACK-BLACKBOARD-INFO-BLACKBOARD-CLASS-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_blackboard_info_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BLACKBOARD-INFO-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_blackboard_info_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BLACKBOARD-INFO-INSTANCE", 1, 0, false);
        declareFunction("cyblack_blackboard_info_p", "CYBLACK-BLACKBOARD-INFO-P", 1, 0, false);
        declareFunction("cyblack_blackboard_info_initialize_method", "CYBLACK-BLACKBOARD-INFO-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_blackboard_info_print_method", "CYBLACK-BLACKBOARD-INFO-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_blackboard_info_get_blackboard_class_name_method", "CYBLACK-BLACKBOARD-INFO-GET-BLACKBOARD-CLASS-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_blackboard_info_set_blackboard_class_name_method", "CYBLACK-BLACKBOARD-INFO-SET-BLACKBOARD-CLASS-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_blackboard_info_get_parsed_body_method", "CYBLACK-BLACKBOARD-INFO-GET-PARSED-BODY-METHOD", 1, 0, false);
        declareFunction("cyblack_blackboard_info_set_parsed_body_method", "CYBLACK-BLACKBOARD-INFO-SET-PARSED-BODY-METHOD", 2, 0, false);
        declareFunction("cyblack_blackboard_info_compile_to_subtype_expressions_method", "CYBLACK-BLACKBOARD-INFO-COMPILE-TO-SUBTYPE-EXPRESSIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_set_blackboard_info_given_parsed_body", "CYBLACK-SET-BLACKBOARD-INFO-GIVEN-PARSED-BODY", 2, 0, false);
        declareFunction("cyblack_record_blackboard_info", "CYBLACK-RECORD-BLACKBOARD-INFO", 2, 0, false);
        declareFunction("cyblack_defbb_filter_body", "CYBLACK-DEFBB-FILTER-BODY", 1, 0, false);
        declareFunction("cyblack_defbb_filter_options", "CYBLACK-DEFBB-FILTER-OPTIONS", 1, 0, false);
        declareFunction("expand_define_blackboard", "EXPAND-DEFINE-BLACKBOARD", 3, 0, false);
        declareMacro("define_blackboard", "DEFINE-BLACKBOARD");
        return NIL;
    }

    public static final SubLObject init_cyblack_defbb_file() {
        defconstant("*VALID-CYBLACK-DEFBB-OPTION-KEYWORDS*", $list_alt0);
        defconstant("*VALID-CYBLACK-DEFBB-BODY-KEYWORDS*", $list_alt8);
        defconstant("*VALID-CYBLACK-DEFBB-CHECK-RELATION-ERRORS*", $list_alt402);
        return NIL;
    }

    public static final SubLObject setup_cyblack_defbb_file() {
                enumerations.enumerations_incorporate_definition(CYBLACK_DEFBB_OPTION_KEYWORD, $list_alt0);
        enumerations.enumerations_incorporate_definition(CYBLACK_DEFBB_BODY_KEYWORD, $list_alt8);
        classes.subloop_new_class(CYBLACK_DEFBB_EXPRESSION, OBJECT, NIL, NIL, $list_alt15);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_EXPRESSION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_EXPRESSION_INSTANCE);
        subloop_reserved_initialize_cyblack_defbb_expression_class(CYBLACK_DEFBB_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFBB_EXPRESSION, $list_alt24, NIL, $list_alt25);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_EXPRESSION, INITIALIZE, CYBLACK_DEFBB_EXPRESSION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFBB_EXPRESSION, $list_alt29, $list_alt30, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_EXPRESSION, PRINT, CYBLACK_DEFBB_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PARENT, CYBLACK_DEFBB_EXPRESSION, $list_alt29, NIL, $list_alt34);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_EXPRESSION, GET_PARENT, CYBLACK_DEFBB_EXPRESSION_GET_PARENT_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT, CYBLACK_DEFBB_EXPRESSION, $list_alt37, $list_alt38, $list_alt39);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_EXPRESSION, SET_PARENT, CYBLACK_DEFBB_EXPRESSION_SET_PARENT_METHOD);
        methods.methods_incorporate_instance_method(ADD_CHILD, CYBLACK_DEFBB_EXPRESSION, $list_alt29, $list_alt44, $list_alt45);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_EXPRESSION, ADD_CHILD, CYBLACK_DEFBB_EXPRESSION_ADD_CHILD_METHOD);
        methods.methods_incorporate_instance_method(GET_CHILDREN, CYBLACK_DEFBB_EXPRESSION, $list_alt29, NIL, $list_alt48);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_EXPRESSION, GET_CHILDREN, CYBLACK_DEFBB_EXPRESSION_GET_CHILDREN_METHOD);
        classes.subloop_new_class(CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, CYBLACK_DEFBB_EXPRESSION, NIL, NIL, $list_alt51);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, $sym53$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_C);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, $sym54$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_I);
        subloop_reserved_initialize_cyblack_defbb_type_graph_expression_class(CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION);
        methods.methods_incorporate_instance_method(INTIALIZE, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, $list_alt24, NIL, $list_alt56);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, INTIALIZE, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_INTIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, $list_alt37, $list_alt30, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, PRINT, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE_DECLARATIONS, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, $list_alt29, NIL, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, GET_TYPE_DECLARATIONS, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_GET_TYPE_DECLARATIONS_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE_DECLARATIONS, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, $list_alt69, $list_alt70, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, SET_TYPE_DECLARATIONS, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_SET_TYPE_DECLARATIONS_METHOD);
        methods.methods_incorporate_instance_method(ADD_TYPE_DECLARATION, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, $list_alt37, $list_alt75, $list_alt76);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION, ADD_TYPE_DECLARATION, CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_ADD_TYPE_DECLARATION_METHOD);
        classes.subloop_new_class(CYBLACK_DEFFBB_TYPE_DECLARATION, CYBLACK_DEFBB_EXPRESSION, NIL, NIL, $list_alt81);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFFBB_TYPE_DECLARATION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFFBB_TYPE_DECLARATION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFFBB_TYPE_DECLARATION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFFBB_TYPE_DECLARATION, $sym84$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFFBB_TYPE_DECLARATION_INSTA);
        subloop_reserved_initialize_cyblack_deffbb_type_declaration_class(CYBLACK_DEFFBB_TYPE_DECLARATION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFFBB_TYPE_DECLARATION, $list_alt24, NIL, $list_alt85);
        methods.subloop_register_instance_method(CYBLACK_DEFFBB_TYPE_DECLARATION, INITIALIZE, CYBLACK_DEFFBB_TYPE_DECLARATION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFFBB_TYPE_DECLARATION, $list_alt37, $list_alt30, $list_alt88);
        methods.subloop_register_instance_method(CYBLACK_DEFFBB_TYPE_DECLARATION, PRINT, CYBLACK_DEFFBB_TYPE_DECLARATION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE_STRING, CYBLACK_DEFFBB_TYPE_DECLARATION, $list_alt29, NIL, $list_alt92);
        methods.subloop_register_instance_method(CYBLACK_DEFFBB_TYPE_DECLARATION, GET_TYPE_STRING, CYBLACK_DEFFBB_TYPE_DECLARATION_GET_TYPE_STRING_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE_STRING, CYBLACK_DEFFBB_TYPE_DECLARATION, $list_alt37, $list_alt95, $list_alt96);
        methods.subloop_register_instance_method(CYBLACK_DEFFBB_TYPE_DECLARATION, SET_TYPE_STRING, CYBLACK_DEFFBB_TYPE_DECLARATION_SET_TYPE_STRING_METHOD);
        classes.subloop_new_class(CYBLACK_DEFBB_ROOT_TYPE_DECLARATION, CYBLACK_DEFFBB_TYPE_DECLARATION, NIL, NIL, $list_alt101);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_ROOT_TYPE_DECLARATION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_ROOT_TYPE_DECLARATION, $sym102$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ROOT_TYPE_DECLARATION_C);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_ROOT_TYPE_DECLARATION, $sym103$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ROOT_TYPE_DECLARATION_I);
        subloop_reserved_initialize_cyblack_defbb_root_type_declaration_class(CYBLACK_DEFBB_ROOT_TYPE_DECLARATION);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFBB_ROOT_TYPE_DECLARATION, $list_alt37, $list_alt30, $list_alt104);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_ROOT_TYPE_DECLARATION, PRINT, CYBLACK_DEFBB_ROOT_TYPE_DECLARATION_PRINT_METHOD);
        classes.subloop_new_class(CYBLACK_DEFFBB_SUBTYPE_DECLARATION, CYBLACK_DEFFBB_TYPE_DECLARATION, NIL, NIL, $list_alt109);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFFBB_SUBTYPE_DECLARATION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFFBB_SUBTYPE_DECLARATION, $sym111$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_CL);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFFBB_SUBTYPE_DECLARATION, $sym112$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_IN);
        subloop_reserved_initialize_cyblack_deffbb_subtype_declaration_class(CYBLACK_DEFFBB_SUBTYPE_DECLARATION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFFBB_SUBTYPE_DECLARATION, $list_alt24, NIL, $list_alt113);
        methods.subloop_register_instance_method(CYBLACK_DEFFBB_SUBTYPE_DECLARATION, INITIALIZE, CYBLACK_DEFFBB_SUBTYPE_DECLARATION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFFBB_SUBTYPE_DECLARATION, $list_alt37, $list_alt30, $list_alt116);
        methods.subloop_register_instance_method(CYBLACK_DEFFBB_SUBTYPE_DECLARATION, PRINT, CYBLACK_DEFFBB_SUBTYPE_DECLARATION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPERTYPE_STRING, CYBLACK_DEFFBB_SUBTYPE_DECLARATION, $list_alt29, NIL, $list_alt121);
        methods.subloop_register_instance_method(CYBLACK_DEFFBB_SUBTYPE_DECLARATION, GET_SUPERTYPE_STRING, CYBLACK_DEFFBB_SUBTYPE_DECLARATION_GET_SUPERTYPE_STRING_METHOD);
        methods.methods_incorporate_instance_method(SET_SUPERTYPE_STRING, CYBLACK_DEFFBB_SUBTYPE_DECLARATION, $list_alt37, $list_alt124, $list_alt125);
        methods.subloop_register_instance_method(CYBLACK_DEFFBB_SUBTYPE_DECLARATION, SET_SUPERTYPE_STRING, CYBLACK_DEFFBB_SUBTYPE_DECLARATION_SET_SUPERTYPE_STRING_METHOD);
        classes.subloop_new_class(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, CYBLACK_DEFBB_EXPRESSION, NIL, NIL, $list_alt129);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, $sym131$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_M);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, $sym132$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_M);
        subloop_reserved_initialize_cyblack_defbb_type_to_posting_class_map_expression_class(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, $list_alt24, NIL, $list_alt133);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, INITIALIZE, $sym135$CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_INITIALIZE_MET);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, $list_alt37, $list_alt30, $list_alt136);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, PRINT, CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING_CLASS_ASSOCIATIONS, CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, $list_alt29, NIL, $list_alt141);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, GET_POSTING_CLASS_ASSOCIATIONS, $sym142$CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_GET_POSTING_CL);
        methods.methods_incorporate_instance_method(SET_POSTING_CLASS_ASSOCIATIONS, CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, $list_alt37, $list_alt144, $list_alt145);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, SET_POSTING_CLASS_ASSOCIATIONS, $sym147$CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_SET_POSTING_CL);
        methods.methods_incorporate_instance_method(ADD_POSTING_CLASS_ASSOCIATION, CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, $list_alt37, $list_alt149, $list_alt150);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, ADD_POSTING_CLASS_ASSOCIATION, $sym152$CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_ADD_POSTING_CL);
        methods.methods_incorporate_instance_method(GET_POSTING_CLASS_GIVEN_TYPE_STRING, CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, $list_alt37, $list_alt154, $list_alt155);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION, GET_POSTING_CLASS_GIVEN_TYPE_STRING, $sym157$CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_GET_POSTING_CL);
        classes.subloop_new_class(CYBLACK_DEFBB_TYPE_ASSOCIATION, CYBLACK_DEFBB_EXPRESSION, NIL, NIL, $list_alt81);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_TYPE_ASSOCIATION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_TYPE_ASSOCIATION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_ASSOCIATION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_TYPE_ASSOCIATION, $sym160$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_ASSOCIATION_INSTAN);
        subloop_reserved_initialize_cyblack_defbb_type_association_class(CYBLACK_DEFBB_TYPE_ASSOCIATION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFBB_TYPE_ASSOCIATION, $list_alt24, NIL, $list_alt85);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_ASSOCIATION, INITIALIZE, CYBLACK_DEFBB_TYPE_ASSOCIATION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFBB_TYPE_ASSOCIATION, $list_alt37, $list_alt30, $list_alt163);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_ASSOCIATION, PRINT, CYBLACK_DEFBB_TYPE_ASSOCIATION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE_STRING, CYBLACK_DEFBB_TYPE_ASSOCIATION, $list_alt29, NIL, $list_alt92);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_ASSOCIATION, GET_TYPE_STRING, CYBLACK_DEFBB_TYPE_ASSOCIATION_GET_TYPE_STRING_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE_STRING, CYBLACK_DEFBB_TYPE_ASSOCIATION, $list_alt37, $list_alt95, $list_alt167);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_ASSOCIATION, SET_TYPE_STRING, CYBLACK_DEFBB_TYPE_ASSOCIATION_SET_TYPE_STRING_METHOD);
        classes.subloop_new_class(CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, CYBLACK_DEFBB_TYPE_ASSOCIATION, NIL, NIL, $list_alt172);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, $sym174$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATI);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, $sym175$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATI);
        subloop_reserved_initialize_cyblack_defbb_posting_class_association_class(CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, $list_alt24, NIL, $list_alt176);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, INITIALIZE, CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, $list_alt37, $list_alt30, $list_alt179);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, PRINT, CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING_CLASS, CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, $list_alt29, NIL, $list_alt184);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, GET_POSTING_CLASS, CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_GET_POSTING_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_POSTING_CLASS, CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, $list_alt37, $list_alt187, $list_alt188);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION, SET_POSTING_CLASS, CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_SET_POSTING_CLASS_METHOD);
        classes.subloop_new_class(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, CYBLACK_DEFBB_EXPRESSION, NIL, NIL, $list_alt195);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, $sym197$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, $sym198$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP);
        subloop_reserved_initialize_cyblack_defbb_type_to_panel_class_map_expression_class(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, $list_alt24, NIL, $list_alt199);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, INITIALIZE, $sym201$CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_INITIALIZE_METHO);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, $list_alt37, $list_alt30, $list_alt202);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, PRINT, CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL_CLASS_ASSOCIATIONS, CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, $list_alt29, NIL, $list_alt207);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, GET_PANEL_CLASS_ASSOCIATIONS, $sym208$CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_GET_PANEL_CLASS_);
        methods.methods_incorporate_instance_method(SET_PANEL_CLASS_ASSOCIATIONS, CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, $list_alt37, $list_alt210, $list_alt211);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, SET_PANEL_CLASS_ASSOCIATIONS, $sym213$CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_SET_PANEL_CLASS_);
        methods.methods_incorporate_instance_method(ADD_PANEL_CLASS_ASSOCIATION, CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, $list_alt37, $list_alt215, $list_alt216);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, ADD_PANEL_CLASS_ASSOCIATION, $sym218$CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_ADD_PANEL_CLASS_);
        methods.methods_incorporate_instance_method(GET_PANEL_CLASS_GIVEN_TYPE_STRING, CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, $list_alt37, $list_alt154, $list_alt220);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION, GET_PANEL_CLASS_GIVEN_TYPE_STRING, $sym222$CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_GET_PANEL_CLASS_);
        classes.subloop_new_class(CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, CYBLACK_DEFBB_TYPE_ASSOCIATION, NIL, NIL, $list_alt224);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, $sym226$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, $sym227$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION);
        subloop_reserved_initialize_cyblack_defbb_panel_class_association_class(CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, $list_alt24, NIL, $list_alt228);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, INITIALIZE, CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, $list_alt37, $list_alt30, $list_alt231);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, PRINT, CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL_CLASS, CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, $list_alt29, NIL, $list_alt236);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, GET_PANEL_CLASS, CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_GET_PANEL_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_PANEL_CLASS, CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, $list_alt37, $list_alt239, $list_alt240);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION, SET_PANEL_CLASS, CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_SET_PANEL_CLASS_METHOD);
        classes.subloop_new_class(CYBLACK_DEFBB_METHOD_EXPRESSION, CYBLACK_DEFBB_EXPRESSION, NIL, NIL, $list_alt247);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_METHOD_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_METHOD_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_METHOD_EXPRESSION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_METHOD_EXPRESSION, $sym251$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_METHOD_EXPRESSION_INSTA);
        subloop_reserved_initialize_cyblack_defbb_method_expression_class(CYBLACK_DEFBB_METHOD_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFBB_METHOD_EXPRESSION, $list_alt24, NIL, $list_alt252);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_METHOD_EXPRESSION, INITIALIZE, CYBLACK_DEFBB_METHOD_EXPRESSION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFBB_METHOD_EXPRESSION, $list_alt37, $list_alt30, $list_alt255);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_METHOD_EXPRESSION, PRINT, CYBLACK_DEFBB_METHOD_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_SYMBOLIC_EXPRESSIONS, CYBLACK_DEFBB_METHOD_EXPRESSION, $list_alt37, NIL, $list_alt260);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_METHOD_EXPRESSION, GET_SYMBOLIC_EXPRESSIONS, CYBLACK_DEFBB_METHOD_EXPRESSION_GET_SYMBOLIC_EXPRESSIONS_METHOD);
        methods.methods_incorporate_instance_method(SET_SYMBOLIC_EXPRESSIONS, CYBLACK_DEFBB_METHOD_EXPRESSION, $list_alt37, $list_alt264, $list_alt265);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_METHOD_EXPRESSION, SET_SYMBOLIC_EXPRESSIONS, CYBLACK_DEFBB_METHOD_EXPRESSION_SET_SYMBOLIC_EXPRESSIONS_METHOD);
        classes.subloop_new_class(CYBLACK_DEFBB_ON_STARTUP_EXPRESSION, CYBLACK_DEFBB_METHOD_EXPRESSION, NIL, NIL, $list_alt270);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_ON_STARTUP_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_ON_STARTUP_EXPRESSION, $sym271$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ON_STARTUP_EXPRESSION_C);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_ON_STARTUP_EXPRESSION, $sym272$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ON_STARTUP_EXPRESSION_I);
        subloop_reserved_initialize_cyblack_defbb_on_startup_expression_class(CYBLACK_DEFBB_ON_STARTUP_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFBB_ON_STARTUP_EXPRESSION, $list_alt24, NIL, $list_alt273);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_ON_STARTUP_EXPRESSION, INITIALIZE, CYBLACK_DEFBB_ON_STARTUP_EXPRESSION_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION, CYBLACK_DEFBB_METHOD_EXPRESSION, NIL, NIL, $list_alt270);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION, $sym278$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION_);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION, $sym279$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION_);
        subloop_reserved_initialize_cyblack_defbb_on_shutdown_expression_class(CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION, $list_alt24, NIL, $list_alt280);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION, INITIALIZE, CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_DEFBB_BODY, CYBLACK_DEFBB_EXPRESSION, NIL, NIL, $list_alt285);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_BODY, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_BODY, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_BODY_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_BODY, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_BODY_INSTANCE);
        subloop_reserved_initialize_cyblack_defbb_body_class(CYBLACK_DEFBB_BODY);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFBB_BODY, $list_alt24, NIL, $list_alt293);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, INITIALIZE, CYBLACK_DEFBB_BODY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFBB_BODY, $list_alt37, $list_alt30, $list_alt296);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, PRINT, CYBLACK_DEFBB_BODY_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE_GRAPH_EXPRESSION, CYBLACK_DEFBB_BODY, $list_alt37, NIL, $list_alt301);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, GET_TYPE_GRAPH_EXPRESSION, CYBLACK_DEFBB_BODY_GET_TYPE_GRAPH_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE_GRAPH_EXPRESSION, CYBLACK_DEFBB_BODY, $list_alt37, $list_alt305, $list_alt306);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, SET_TYPE_GRAPH_EXPRESSION, CYBLACK_DEFBB_BODY_SET_TYPE_GRAPH_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE_TO_POSTING_CLASS_MAP, CYBLACK_DEFBB_BODY, $list_alt37, NIL, $list_alt311);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, GET_TYPE_TO_POSTING_CLASS_MAP, CYBLACK_DEFBB_BODY_GET_TYPE_TO_POSTING_CLASS_MAP_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE_TO_POSTING_CLASS_MAP, CYBLACK_DEFBB_BODY, $list_alt37, $list_alt315, $list_alt316);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, SET_TYPE_TO_POSTING_CLASS_MAP, CYBLACK_DEFBB_BODY_SET_TYPE_TO_POSTING_CLASS_MAP_METHOD);
        methods.methods_incorporate_instance_method(GET_TYPE_TO_PANEL_CLASS_MAP, CYBLACK_DEFBB_BODY, $list_alt37, NIL, $list_alt321);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, GET_TYPE_TO_PANEL_CLASS_MAP, CYBLACK_DEFBB_BODY_GET_TYPE_TO_PANEL_CLASS_MAP_METHOD);
        methods.methods_incorporate_instance_method(SET_TYPE_TO_PANEL_CLASS_MAP, CYBLACK_DEFBB_BODY, $list_alt37, $list_alt325, $list_alt326);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, SET_TYPE_TO_PANEL_CLASS_MAP, CYBLACK_DEFBB_BODY_SET_TYPE_TO_PANEL_CLASS_MAP_METHOD);
        methods.methods_incorporate_instance_method(GET_ON_STARTUP_EXPRESSION, CYBLACK_DEFBB_BODY, $list_alt37, NIL, $list_alt331);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, GET_ON_STARTUP_EXPRESSION, CYBLACK_DEFBB_BODY_GET_ON_STARTUP_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_ON_STARTUP_EXPRESSION, CYBLACK_DEFBB_BODY, $list_alt37, $list_alt335, $list_alt336);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, SET_ON_STARTUP_EXPRESSION, CYBLACK_DEFBB_BODY_SET_ON_STARTUP_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_ON_SHUTDOWN_EXPRESSION, CYBLACK_DEFBB_BODY, $list_alt37, NIL, $list_alt341);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, GET_ON_SHUTDOWN_EXPRESSION, CYBLACK_DEFBB_BODY_GET_ON_SHUTDOWN_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_ON_SHUTDOWN_EXPRESSION, CYBLACK_DEFBB_BODY, $list_alt37, $list_alt345, $list_alt346);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, SET_ON_SHUTDOWN_EXPRESSION, CYBLACK_DEFBB_BODY_SET_ON_SHUTDOWN_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_SUBTYPE_EXPRESSIONS, CYBLACK_DEFBB_BODY, $list_alt37, NIL, $list_alt351);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_BODY, COMPILE_TO_SUBTYPE_EXPRESSIONS, CYBLACK_DEFBB_BODY_COMPILE_TO_SUBTYPE_EXPRESSIONS_METHOD);
        classes.subloop_new_class(CYBLACK_DEFBB_TYPE_RELATION, OBJECT, NIL, NIL, $list_alt361);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFBB_TYPE_RELATION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFBB_TYPE_RELATION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_RELATION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFBB_TYPE_RELATION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_RELATION_INSTANCE);
        subloop_reserved_initialize_cyblack_defbb_type_relation_class(CYBLACK_DEFBB_TYPE_RELATION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFBB_TYPE_RELATION, $list_alt24, NIL, $list_alt368);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_RELATION, INITIALIZE, CYBLACK_DEFBB_TYPE_RELATION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFBB_TYPE_RELATION, $list_alt37, $list_alt30, $list_alt371);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_RELATION, PRINT, CYBLACK_DEFBB_TYPE_RELATION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_SUBTYPE, CYBLACK_DEFBB_TYPE_RELATION, $list_alt37, NIL, $list_alt376);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_RELATION, GET_SUBTYPE, CYBLACK_DEFBB_TYPE_RELATION_GET_SUBTYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_SUBTYPE, CYBLACK_DEFBB_TYPE_RELATION, $list_alt37, $list_alt380, $list_alt381);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_RELATION, SET_SUBTYPE, CYBLACK_DEFBB_TYPE_RELATION_SET_SUBTYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPERTYPE, CYBLACK_DEFBB_TYPE_RELATION, $list_alt37, NIL, $list_alt385);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_RELATION, GET_SUPERTYPE, CYBLACK_DEFBB_TYPE_RELATION_GET_SUPERTYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_SUPERTYPE, CYBLACK_DEFBB_TYPE_RELATION, $list_alt37, $list_alt389, $list_alt390);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_RELATION, SET_SUPERTYPE, CYBLACK_DEFBB_TYPE_RELATION_SET_SUPERTYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_MARK, CYBLACK_DEFBB_TYPE_RELATION, $list_alt37, NIL, $list_alt394);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_RELATION, GET_MARK, CYBLACK_DEFBB_TYPE_RELATION_GET_MARK_METHOD);
        methods.methods_incorporate_instance_method(SET_MARK, CYBLACK_DEFBB_TYPE_RELATION, $list_alt37, $list_alt398, $list_alt399);
        methods.subloop_register_instance_method(CYBLACK_DEFBB_TYPE_RELATION, SET_MARK, CYBLACK_DEFBB_TYPE_RELATION_SET_MARK_METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_DEFBB_CHECK_RELATION_ERROR, $list_alt402);
        classes.subloop_new_class(CYBLACK_TYPE_RELATION_TABLE, OBJECT, NIL, NIL, $list_alt408);
        classes.class_set_implements_slot_listeners(CYBLACK_TYPE_RELATION_TABLE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_TYPE_RELATION_TABLE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TYPE_RELATION_TABLE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_TYPE_RELATION_TABLE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TYPE_RELATION_TABLE_INSTANCE);
        subloop_reserved_initialize_cyblack_type_relation_table_class(CYBLACK_TYPE_RELATION_TABLE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_TYPE_RELATION_TABLE, $list_alt24, NIL, $list_alt412);
        methods.subloop_register_instance_method(CYBLACK_TYPE_RELATION_TABLE, INITIALIZE, CYBLACK_TYPE_RELATION_TABLE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_TYPE_RELATION_TABLE, $list_alt37, $list_alt30, $list_alt415);
        methods.subloop_register_instance_method(CYBLACK_TYPE_RELATION_TABLE, PRINT, CYBLACK_TYPE_RELATION_TABLE_PRINT_METHOD);
        methods.methods_incorporate_instance_method(CLEAR_ALL_MARKS, CYBLACK_TYPE_RELATION_TABLE, $list_alt24, NIL, $list_alt422);
        methods.subloop_register_instance_method(CYBLACK_TYPE_RELATION_TABLE, CLEAR_ALL_MARKS, CYBLACK_TYPE_RELATION_TABLE_CLEAR_ALL_MARKS_METHOD);
        methods.methods_incorporate_instance_method(HAS_RELATION, CYBLACK_TYPE_RELATION_TABLE, $list_alt24, $list_alt426, $list_alt427);
        methods.subloop_register_instance_method(CYBLACK_TYPE_RELATION_TABLE, HAS_RELATION, CYBLACK_TYPE_RELATION_TABLE_HAS_RELATION_METHOD);
        methods.methods_incorporate_instance_method(EXTEND_SUPER, CYBLACK_TYPE_RELATION_TABLE, $list_alt37, $list_alt431, $list_alt432);
        methods.subloop_register_instance_method(CYBLACK_TYPE_RELATION_TABLE, EXTEND_SUPER, CYBLACK_TYPE_RELATION_TABLE_EXTEND_SUPER_METHOD);
        methods.methods_incorporate_instance_method(EXTEND_SUB, CYBLACK_TYPE_RELATION_TABLE, $list_alt37, $list_alt431, $list_alt436);
        methods.subloop_register_instance_method(CYBLACK_TYPE_RELATION_TABLE, EXTEND_SUB, CYBLACK_TYPE_RELATION_TABLE_EXTEND_SUB_METHOD);
        methods.methods_incorporate_instance_method(GET_RELATIONS, CYBLACK_TYPE_RELATION_TABLE, $list_alt37, NIL, $list_alt440);
        methods.subloop_register_instance_method(CYBLACK_TYPE_RELATION_TABLE, GET_RELATIONS, CYBLACK_TYPE_RELATION_TABLE_GET_RELATIONS_METHOD);
        methods.methods_incorporate_instance_method(SET_RELATIONS, CYBLACK_TYPE_RELATION_TABLE, $list_alt37, $list_alt444, $list_alt445);
        methods.subloop_register_instance_method(CYBLACK_TYPE_RELATION_TABLE, SET_RELATIONS, CYBLACK_TYPE_RELATION_TABLE_SET_RELATIONS_METHOD);
        methods.methods_incorporate_instance_method(CHECK_RELATION, CYBLACK_TYPE_RELATION_TABLE, $list_alt24, $list_alt426, $list_alt449);
        methods.subloop_register_instance_method(CYBLACK_TYPE_RELATION_TABLE, CHECK_RELATION, CYBLACK_TYPE_RELATION_TABLE_CHECK_RELATION_METHOD);
        methods.methods_incorporate_instance_method(ADD_RELATION, CYBLACK_TYPE_RELATION_TABLE, $list_alt37, $list_alt426, $list_alt455);
        methods.subloop_register_instance_method(CYBLACK_TYPE_RELATION_TABLE, ADD_RELATION, CYBLACK_TYPE_RELATION_TABLE_ADD_RELATION_METHOD);
        classes.subloop_new_class(CYBLACK_BLACKBOARD_INFO, OBJECT, NIL, NIL, $list_alt487);
        classes.class_set_implements_slot_listeners(CYBLACK_BLACKBOARD_INFO, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BLACKBOARD_INFO, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BLACKBOARD_INFO_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BLACKBOARD_INFO, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BLACKBOARD_INFO_INSTANCE);
        subloop_reserved_initialize_cyblack_blackboard_info_class(CYBLACK_BLACKBOARD_INFO);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BLACKBOARD_INFO, $list_alt24, NIL, $list_alt492);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_INFO, INITIALIZE, CYBLACK_BLACKBOARD_INFO_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BLACKBOARD_INFO, $list_alt37, $list_alt30, $list_alt495);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_INFO, PRINT, CYBLACK_BLACKBOARD_INFO_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_BLACKBOARD_CLASS_NAME, CYBLACK_BLACKBOARD_INFO, $list_alt29, NIL, $list_alt500);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_INFO, GET_BLACKBOARD_CLASS_NAME, CYBLACK_BLACKBOARD_INFO_GET_BLACKBOARD_CLASS_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_BLACKBOARD_CLASS_NAME, CYBLACK_BLACKBOARD_INFO, $list_alt37, $list_alt503, $list_alt504);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_INFO, SET_BLACKBOARD_CLASS_NAME, CYBLACK_BLACKBOARD_INFO_SET_BLACKBOARD_CLASS_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_PARSED_BODY, CYBLACK_BLACKBOARD_INFO, $list_alt29, NIL, $list_alt509);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_INFO, GET_PARSED_BODY, CYBLACK_BLACKBOARD_INFO_GET_PARSED_BODY_METHOD);
        methods.methods_incorporate_instance_method(SET_PARSED_BODY, CYBLACK_BLACKBOARD_INFO, $list_alt37, $list_alt512, $list_alt513);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_INFO, SET_PARSED_BODY, CYBLACK_BLACKBOARD_INFO_SET_PARSED_BODY_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_SUBTYPE_EXPRESSIONS, CYBLACK_BLACKBOARD_INFO, $list_alt37, NIL, $list_alt517);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_INFO, COMPILE_TO_SUBTYPE_EXPRESSIONS, CYBLACK_BLACKBOARD_INFO_COMPILE_TO_SUBTYPE_EXPRESSIONS_METHOD);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("EXTENDS"), makeKeyword("IMPLEMENTS"), makeKeyword("UNION"));

    private static final SubLSymbol CYBLACK_DEFBB_OPTION_KEYWORD = makeSymbol("CYBLACK-DEFBB-OPTION-KEYWORD");

    static private final SubLString $str_alt2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_DEFBB_OPTION_KEYWORD = makeSymbol("ENCODE-CYBLACK-DEFBB-OPTION-KEYWORD");

    static private final SubLString $str_alt4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_DEFBB_OPTION_KEYWORD = makeSymbol("DECODE-CYBLACK-DEFBB-OPTION-KEYWORD");

    static private final SubLString $str_alt6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_DEFBB_OPTION_KEYWORD_P = makeSymbol("CYBLACK-DEFBB-OPTION-KEYWORD-P");

    static private final SubLList $list_alt8 = list(makeKeyword("TYPE-GRAPH"), makeKeyword("TYPE-TO-POSTING-CLASS-MAP"), makeKeyword("TYPE-TO-PANEL-CLASS-MAP"), makeKeyword("ON-STARTUP"), makeKeyword("ON-SHUTDOWN"));

    private static final SubLSymbol CYBLACK_DEFBB_BODY_KEYWORD = makeSymbol("CYBLACK-DEFBB-BODY-KEYWORD");

    private static final SubLSymbol ENCODE_CYBLACK_DEFBB_BODY_KEYWORD = makeSymbol("ENCODE-CYBLACK-DEFBB-BODY-KEYWORD");

    private static final SubLSymbol DECODE_CYBLACK_DEFBB_BODY_KEYWORD = makeSymbol("DECODE-CYBLACK-DEFBB-BODY-KEYWORD");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_KEYWORD_P = makeSymbol("CYBLACK-DEFBB-BODY-KEYWORD-P");

    private static final SubLSymbol CYBLACK_DEFBB_EXPRESSION = makeSymbol("CYBLACK-DEFBB-EXPRESSION");



    static private final SubLList $list_alt15 = list(list(makeSymbol("PARENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CHILDREN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT"), list(makeSymbol("NEW-PARENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-CHILD"), list(makeSymbol("NEW-CHILD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CHILDREN"), NIL, makeKeyword("PUBLIC")));







    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_EXPRESSION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-EXPRESSION-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_EXPRESSION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-EXPRESSION-INSTANCE");



    static private final SubLList $list_alt24 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt25 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PARENT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CHILDREN"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym26$OUTER_CATCH_FOR_CYBLACK_DEFBB_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFBB-EXPRESSION-INITIALIZE-METHOD");



    static private final SubLList $list_alt29 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt30 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt31 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CDOLIST"), list(makeSymbol("CHILD"), list(makeSymbol("GET-CHILDREN"), makeSymbol("SELF"))), list(makeSymbol("PRINT"), makeSymbol("CHILD"), makeSymbol("STREAM"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_DEFBB_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFBB-EXPRESSION-PRINT-METHOD");



    static private final SubLList $list_alt34 = list(list(RET, makeSymbol("PARENT")));

    private static final SubLSymbol CYBLACK_DEFBB_EXPRESSION_GET_PARENT_METHOD = makeSymbol("CYBLACK-DEFBB-EXPRESSION-GET-PARENT-METHOD");



    static private final SubLList $list_alt37 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt38 = list(makeSymbol("NEW-PARENT"));

    static private final SubLList $list_alt39 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PARENT")), list(makeSymbol("CYBLACK-DEFBB-EXPRESSION-P"), makeSymbol("NEW-PARENT"))), makeString("(SET-PARENT ~S): ~S is not an instance of CYBLACK-DEFBB-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-PARENT")), list(makeSymbol("CSETQ"), makeSymbol("PARENT"), makeSymbol("NEW-PARENT")), list(makeSymbol("PWHEN"), makeSymbol("PARENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-CHILD"), makeSymbol("CYBLACK-DEFBB-EXPRESSION")), makeSymbol("PARENT"), makeSymbol("SELF"))), list(RET, makeSymbol("PARENT")));

    static private final SubLSymbol $sym40$OUTER_CATCH_FOR_CYBLACK_DEFBB_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-EXPRESSION-METHOD");

    static private final SubLString $str_alt41$_SET_PARENT__S____S_is_not_an_ins = makeString("(SET-PARENT ~S): ~S is not an instance of CYBLACK-DEFBB-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFBB_EXPRESSION_SET_PARENT_METHOD = makeSymbol("CYBLACK-DEFBB-EXPRESSION-SET-PARENT-METHOD");



    static private final SubLList $list_alt44 = list(makeSymbol("NEW-CHILD"));

    static private final SubLList $list_alt45 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-CHILD"), makeSymbol("CHILDREN")), list(makeSymbol("CSETQ"), makeSymbol("CHILDREN"), list(makeSymbol("NCONC"), makeSymbol("CHILDREN"), list(makeSymbol("LIST"), makeSymbol("NEW-CHILD")))), list(makeSymbol("SET-CYBLACK-DEFBB-EXPRESSION-CHILDREN"), makeSymbol("SELF"), makeSymbol("CHILDREN"))), list(RET, makeSymbol("NEW-CHILD")));

    private static final SubLSymbol CYBLACK_DEFBB_EXPRESSION_ADD_CHILD_METHOD = makeSymbol("CYBLACK-DEFBB-EXPRESSION-ADD-CHILD-METHOD");



    static private final SubLList $list_alt48 = list(list(RET, makeSymbol("CHILDREN")));

    private static final SubLSymbol CYBLACK_DEFBB_EXPRESSION_GET_CHILDREN_METHOD = makeSymbol("CYBLACK-DEFBB-EXPRESSION-GET-CHILDREN-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION = makeSymbol("CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION");

    static private final SubLList $list_alt51 = list(list(makeSymbol("TYPE-DECLARATIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE-DECLARATIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPE-DECLARATIONS"), list(makeSymbol("NEW-DECLARATIONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TYPE-DECLARATION"), list(makeSymbol("NEW-DECLARATION")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym53$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-CLASS");

    static private final SubLSymbol $sym54$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-INSTANCE");

    private static final SubLSymbol INTIALIZE = makeSymbol("INTIALIZE");

    static private final SubLList $list_alt56 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-DECLARATIONS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym57$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_INTIALIZE_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-INTIALIZE-METHOD");

    static private final SubLList $list_alt59 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:TYPE-GRAPH")), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE-DECL"), makeSymbol("TYPE-DECLARATIONS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("TYPE-DECL"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym60$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-METHOD");

    static private final SubLString $str_alt61$__TYPE_GRAPH = makeString("(:TYPE-GRAPH");

    static private final SubLString $str_alt62$__S = makeString(" ~S");

    static private final SubLString $str_alt63$_ = makeString(")");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol GET_TYPE_DECLARATIONS = makeSymbol("GET-TYPE-DECLARATIONS");

    static private final SubLList $list_alt66 = list(list(RET, makeSymbol("TYPE-DECLARATIONS")));

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_GET_TYPE_DECLARATIONS_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-GET-TYPE-DECLARATIONS-METHOD");

    private static final SubLSymbol SET_TYPE_DECLARATIONS = makeSymbol("SET-TYPE-DECLARATIONS");

    static private final SubLList $list_alt69 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt70 = list(makeSymbol("NEW-DECLARATIONS"));

    static private final SubLList $list_alt71 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-DEFFBB-TYPE-DECLARATION-LIST-P"), makeSymbol("NEW-DECLARATIONS")), makeString("(SET-TYPE-DECLARATIONS ~S): ~S is not a valid list of CYBLACK-DEFFBB-TYPE-DECLARATION-LIST instances."), makeSymbol("SELF"), makeSymbol("NEW-DECLARATIONS")), list(makeSymbol("SET-CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-TYPE-DECLARATIONS"), makeSymbol("SELF"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-DECLARATIONS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("DECLARATION"), makeSymbol("NEW-DECLARATIONS")), list(makeSymbol("ADD-CHILD"), makeSymbol("SELF"), makeSymbol("DECLARATION"))), list(RET, makeSymbol("NEW-DECLARATIONS")));

    static private final SubLString $str_alt72$_SET_TYPE_DECLARATIONS__S____S_is = makeString("(SET-TYPE-DECLARATIONS ~S): ~S is not a valid list of CYBLACK-DEFFBB-TYPE-DECLARATION-LIST instances.");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_SET_TYPE_DECLARATIONS_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-SET-TYPE-DECLARATIONS-METHOD");

    private static final SubLSymbol ADD_TYPE_DECLARATION = makeSymbol("ADD-TYPE-DECLARATION");

    static private final SubLList $list_alt75 = list(makeSymbol("NEW-DECLARATION"));

    static private final SubLList $list_alt76 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-DECLARATION")), list(makeSymbol("CYBLACK-DEFFBB-TYPE-DECLARATION-P"), makeSymbol("NEW-DECLARATION"))), makeString("(ADD-TYPE-DECLARATION ~S): ~S is not an instance of CYBLACK-DEFFBB-TYPE-DECLARATION."), makeSymbol("SELF"), makeSymbol("NEW-DECLARATION")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-DECLARATIONS"), list(makeSymbol("NCONC"), makeSymbol("TYPE-DECLARATIONS"), list(makeSymbol("LIST"), makeSymbol("NEW-DECLARATION")))), list(RET, makeSymbol("NEW-DECLARATION")));

    static private final SubLSymbol $sym77$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-METHOD");

    static private final SubLString $str_alt78$_ADD_TYPE_DECLARATION__S____S_is_ = makeString("(ADD-TYPE-DECLARATION ~S): ~S is not an instance of CYBLACK-DEFFBB-TYPE-DECLARATION.");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_GRAPH_EXPRESSION_ADD_TYPE_DECLARATION_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-ADD-TYPE-DECLARATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFFBB_TYPE_DECLARATION = makeSymbol("CYBLACK-DEFFBB-TYPE-DECLARATION");

    static private final SubLList $list_alt81 = list(list(makeSymbol("TYPE-STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPE-STRING"), list(makeSymbol("NEW-TYPE-STRING")), makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFFBB_TYPE_DECLARATION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFFBB-TYPE-DECLARATION-CLASS");

    static private final SubLSymbol $sym84$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFFBB_TYPE_DECLARATION_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFFBB-TYPE-DECLARATION-INSTANCE");

    static private final SubLList $list_alt85 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-STRING"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym86$OUTER_CATCH_FOR_CYBLACK_DEFFBB_TYPE_DECLARATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFFBB-TYPE-DECLARATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFFBB_TYPE_DECLARATION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFFBB-TYPE-DECLARATION-INITIALIZE-METHOD");

    static private final SubLList $list_alt88 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-DEFFBB-TYPE-DECLARATION: Abstract Class>")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt89$__CYBLACK_DEFFBB_TYPE_DECLARATION = makeString("#<CYBLACK-DEFFBB-TYPE-DECLARATION: Abstract Class>");

    private static final SubLSymbol CYBLACK_DEFFBB_TYPE_DECLARATION_PRINT_METHOD = makeSymbol("CYBLACK-DEFFBB-TYPE-DECLARATION-PRINT-METHOD");

    private static final SubLSymbol GET_TYPE_STRING = makeSymbol("GET-TYPE-STRING");

    static private final SubLList $list_alt92 = list(list(RET, makeSymbol("TYPE-STRING")));

    private static final SubLSymbol CYBLACK_DEFFBB_TYPE_DECLARATION_GET_TYPE_STRING_METHOD = makeSymbol("CYBLACK-DEFFBB-TYPE-DECLARATION-GET-TYPE-STRING-METHOD");



    static private final SubLList $list_alt95 = list(makeSymbol("NEW-TYPE-STRING"));

    static private final SubLList $list_alt96 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-TYPE-STRING")), list(makeSymbol("CYBLACK-DATATYPE-STRING-P"), makeSymbol("NEW-TYPE-STRING"))), makeString("(SET-TYPE-STRING ~S): ~S is not a valid type string."), makeSymbol("SELF"), makeSymbol("NEW-TYPE-STRING")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-STRING"), makeSymbol("NEW-TYPE-STRING")), list(RET, makeSymbol("TYPE-STRING")));

    static private final SubLSymbol $sym97$OUTER_CATCH_FOR_CYBLACK_DEFFBB_TYPE_DECLARATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFFBB-TYPE-DECLARATION-METHOD");

    static private final SubLString $str_alt98$_SET_TYPE_STRING__S____S_is_not_a = makeString("(SET-TYPE-STRING ~S): ~S is not a valid type string.");

    private static final SubLSymbol CYBLACK_DEFFBB_TYPE_DECLARATION_SET_TYPE_STRING_METHOD = makeSymbol("CYBLACK-DEFFBB-TYPE-DECLARATION-SET-TYPE-STRING-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_ROOT_TYPE_DECLARATION = makeSymbol("CYBLACK-DEFBB-ROOT-TYPE-DECLARATION");

    static private final SubLList $list_alt101 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym102$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ROOT_TYPE_DECLARATION_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ROOT-TYPE-DECLARATION-CLASS");

    static private final SubLSymbol $sym103$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ROOT_TYPE_DECLARATION_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ROOT-TYPE-DECLARATION-INSTANCE");

    static private final SubLList $list_alt104 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:ROOT-TYPE ~S)"), makeSymbol("TYPE-STRING")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym105$OUTER_CATCH_FOR_CYBLACK_DEFBB_ROOT_TYPE_DECLARATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-ROOT-TYPE-DECLARATION-METHOD");

    static private final SubLString $str_alt106$__ROOT_TYPE__S_ = makeString("(:ROOT-TYPE ~S)");

    private static final SubLSymbol CYBLACK_DEFBB_ROOT_TYPE_DECLARATION_PRINT_METHOD = makeSymbol("CYBLACK-DEFBB-ROOT-TYPE-DECLARATION-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_DEFFBB_SUBTYPE_DECLARATION = makeSymbol("CYBLACK-DEFFBB-SUBTYPE-DECLARATION");

    static private final SubLList $list_alt109 = list(list(makeSymbol("SUPERTYPE-STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPERTYPE-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUPERTYPE-STRING"), list(makeSymbol("NEW-SUPERTYPE-STRING")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUPERTYPE_STRING = makeSymbol("SUPERTYPE-STRING");

    static private final SubLSymbol $sym111$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_CL = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFFBB-SUBTYPE-DECLARATION-CLASS");

    static private final SubLSymbol $sym112$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_IN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFFBB-SUBTYPE-DECLARATION-INSTANCE");

    static private final SubLList $list_alt113 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SUPERTYPE-STRING"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym114$OUTER_CATCH_FOR_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFFBB-SUBTYPE-DECLARATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFFBB_SUBTYPE_DECLARATION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFFBB-SUBTYPE-DECLARATION-INITIALIZE-METHOD");

    static private final SubLList $list_alt116 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:SUBTYPE ~S ~S)"), makeSymbol("TYPE-STRING"), makeSymbol("SUPERTYPE-STRING")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym117$OUTER_CATCH_FOR_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFFBB-SUBTYPE-DECLARATION-METHOD");

    static private final SubLString $str_alt118$__SUBTYPE__S__S_ = makeString("(:SUBTYPE ~S ~S)");

    private static final SubLSymbol CYBLACK_DEFFBB_SUBTYPE_DECLARATION_PRINT_METHOD = makeSymbol("CYBLACK-DEFFBB-SUBTYPE-DECLARATION-PRINT-METHOD");

    private static final SubLSymbol GET_SUPERTYPE_STRING = makeSymbol("GET-SUPERTYPE-STRING");

    static private final SubLList $list_alt121 = list(list(RET, makeSymbol("SUPERTYPE-STRING")));

    private static final SubLSymbol CYBLACK_DEFFBB_SUBTYPE_DECLARATION_GET_SUPERTYPE_STRING_METHOD = makeSymbol("CYBLACK-DEFFBB-SUBTYPE-DECLARATION-GET-SUPERTYPE-STRING-METHOD");

    private static final SubLSymbol SET_SUPERTYPE_STRING = makeSymbol("SET-SUPERTYPE-STRING");

    static private final SubLList $list_alt124 = list(makeSymbol("NEW-SUPERTYPE-STRING"));

    static private final SubLList $list_alt125 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-SUPERTYPE-STRING")), list(makeSymbol("CYBLACK-DATATYPE-STRING-P"), makeSymbol("NEW-SUPERTYPE-STRING"))), makeString("(SET-TYPE-STRING ~S): ~S is not a valid type string."), makeSymbol("SELF"), makeSymbol("NEW-SUPERTYPE-STRING")), list(makeSymbol("CSETQ"), makeSymbol("SUPERTYPE-STRING"), makeSymbol("NEW-SUPERTYPE-STRING")), list(RET, makeSymbol("NEW-SUPERTYPE-STRING")));

    static private final SubLSymbol $sym126$OUTER_CATCH_FOR_CYBLACK_DEFFBB_SUBTYPE_DECLARATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFFBB-SUBTYPE-DECLARATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFFBB_SUBTYPE_DECLARATION_SET_SUPERTYPE_STRING_METHOD = makeSymbol("CYBLACK-DEFFBB-SUBTYPE-DECLARATION-SET-SUPERTYPE-STRING-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION = makeSymbol("CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION");

    static private final SubLList $list_alt129 = list(list(makeSymbol("POSTING-CLASS-ASSOCIATIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-CLASS-ASSOCIATIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-POSTING-CLASS-ASSOCIATIONS"), list(makeSymbol("NEW-POSTING-CLASS-ASSOCIATIONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING-CLASS-ASSOCIATION"), list(makeSymbol("NEW-POSTING-CLASS-ASSOCIATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-CLASS-GIVEN-TYPE-STRING"), list(makeSymbol("TYPE-STRING")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym131$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_M = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-CLASS");

    static private final SubLSymbol $sym132$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_M = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt133 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("POSTING-CLASS-ASSOCIATIONS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym134$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-METHOD");

    static private final SubLSymbol $sym135$CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_INITIALIZE_MET = makeSymbol("CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-INITIALIZE-METHOD");

    static private final SubLList $list_alt136 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:TYPE-TO-POSTING-CLASS-MAP")), list(makeSymbol("CDOLIST"), list(makeSymbol("ASSOCIATION"), makeSymbol("POSTING-CLASS-ASSOCIATIONS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("ASSOCIATION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym137$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-METHOD");

    static private final SubLString $str_alt138$__TYPE_TO_POSTING_CLASS_MAP = makeString("(:TYPE-TO-POSTING-CLASS-MAP");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol GET_POSTING_CLASS_ASSOCIATIONS = makeSymbol("GET-POSTING-CLASS-ASSOCIATIONS");

    static private final SubLList $list_alt141 = list(list(RET, makeSymbol("POSTING-CLASS-ASSOCIATIONS")));

    static private final SubLSymbol $sym142$CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_GET_POSTING_CL = makeSymbol("CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-GET-POSTING-CLASS-ASSOCIATIONS-METHOD");

    private static final SubLSymbol SET_POSTING_CLASS_ASSOCIATIONS = makeSymbol("SET-POSTING-CLASS-ASSOCIATIONS");

    static private final SubLList $list_alt144 = list(makeSymbol("NEW-POSTING-CLASS-ASSOCIATIONS"));

    static private final SubLList $list_alt145 = list(list(makeSymbol("CSETQ"), makeSymbol("POSTING-CLASS-ASSOCIATIONS"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-POSTING-CLASS-ASSOCIATIONS"))), list(RET, makeSymbol("NEW-POSTING-CLASS-ASSOCIATIONS")));

    static private final SubLSymbol $sym146$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-METHOD");

    static private final SubLSymbol $sym147$CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_SET_POSTING_CL = makeSymbol("CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-SET-POSTING-CLASS-ASSOCIATIONS-METHOD");

    private static final SubLSymbol ADD_POSTING_CLASS_ASSOCIATION = makeSymbol("ADD-POSTING-CLASS-ASSOCIATION");

    static private final SubLList $list_alt149 = list(makeSymbol("NEW-POSTING-CLASS-ASSOCIATION"));

    static private final SubLList $list_alt150 = list(list(makeSymbol("CSETQ"), makeSymbol("POSTING-CLASS-ASSOCIATIONS"), list(makeSymbol("NCONC"), makeSymbol("POSTING-CLASS-ASSOCIATIONS"), list(makeSymbol("LIST"), makeSymbol("NEW-POSTING-CLASS-ASSOCIATION")))), list(RET, makeSymbol("NEW-POSTING-CLASS-ASSOCIATION")));

    static private final SubLSymbol $sym151$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-METHOD");

    static private final SubLSymbol $sym152$CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_ADD_POSTING_CL = makeSymbol("CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-ADD-POSTING-CLASS-ASSOCIATION-METHOD");

    private static final SubLSymbol GET_POSTING_CLASS_GIVEN_TYPE_STRING = makeSymbol("GET-POSTING-CLASS-GIVEN-TYPE-STRING");

    static private final SubLList $list_alt154 = list(makeSymbol("TYPE-STRING"));

    static private final SubLList $list_alt155 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("ASSOCIATION"), makeSymbol("POSTING-CLASS-ASSOCIATIONS")), list(makeSymbol("PWHEN"), list(EQUAL, list(makeSymbol("CYBLACK-DEFBB-TYPE-ASSOCIATION-GET-TYPE-STRING-METHOD"), makeSymbol("ASSOCIATION")), makeSymbol("TYPE-STRING")), list(RET, list(makeSymbol("CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-GET-POSTING-CLASS-METHOD"), makeSymbol("ASSOCIATION"))))), list(RET, NIL));

    static private final SubLSymbol $sym156$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSIO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-METHOD");

    static private final SubLSymbol $sym157$CYBLACK_DEFBB_TYPE_TO_POSTING_CLASS_MAP_EXPRESSION_GET_POSTING_CL = makeSymbol("CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-GET-POSTING-CLASS-GIVEN-TYPE-STRING-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_ASSOCIATION = makeSymbol("CYBLACK-DEFBB-TYPE-ASSOCIATION");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_ASSOCIATION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-ASSOCIATION-CLASS");

    static private final SubLSymbol $sym160$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_ASSOCIATION_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-ASSOCIATION-INSTANCE");

    static private final SubLSymbol $sym161$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_ASSOCIATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-ASSOCIATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_ASSOCIATION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-ASSOCIATION-INITIALIZE-METHOD");

    static private final SubLList $list_alt163 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-DEFBB-TYPE-ASSOCIATION: Abstract Class>")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt164$__CYBLACK_DEFBB_TYPE_ASSOCIATION_ = makeString("#<CYBLACK-DEFBB-TYPE-ASSOCIATION: Abstract Class>");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_ASSOCIATION_PRINT_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-ASSOCIATION-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_ASSOCIATION_GET_TYPE_STRING_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-ASSOCIATION-GET-TYPE-STRING-METHOD");

    static private final SubLList $list_alt167 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-TYPE-STRING")), list(makeSymbol("CYBLACK-DATATYPE-STRING-P"), makeSymbol("NEW-TYPE-STRING"))), makeString("(SET-TYPE-STRING ~S): ~S is not a valid datatype string."), makeSymbol("SELF"), makeSymbol("NEW-TYPE-STRING")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-STRING"), makeSymbol("NEW-TYPE-STRING")), list(RET, makeSymbol("NEW-TYPE-STRING")));

    static private final SubLSymbol $sym168$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_ASSOCIATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-ASSOCIATION-METHOD");

    static private final SubLString $str_alt169$_SET_TYPE_STRING__S____S_is_not_a = makeString("(SET-TYPE-STRING ~S): ~S is not a valid datatype string.");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_ASSOCIATION_SET_TYPE_STRING_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-ASSOCIATION-SET-TYPE-STRING-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION = makeSymbol("CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION");

    static private final SubLList $list_alt172 = list(list(makeSymbol("POSTING-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-POSTING-CLASS"), list(makeSymbol("NEW-POSTING-CLASS")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym174$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-CLASS");

    static private final SubLSymbol $sym175$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-INSTANCE");

    static private final SubLList $list_alt176 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("POSTING-CLASS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym177$OUTER_CATCH_FOR_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-INITIALIZE-METHOD");

    static private final SubLList $list_alt179 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:POSTING-CLASS ~S ~S)"), makeSymbol("TYPE-STRING"), makeSymbol("POSTING-CLASS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym180$OUTER_CATCH_FOR_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-METHOD");

    static private final SubLString $str_alt181$__POSTING_CLASS__S__S_ = makeString("(:POSTING-CLASS ~S ~S)");

    private static final SubLSymbol CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_PRINT_METHOD = makeSymbol("CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-PRINT-METHOD");

    private static final SubLSymbol GET_POSTING_CLASS = makeSymbol("GET-POSTING-CLASS");

    static private final SubLList $list_alt184 = list(list(RET, makeSymbol("POSTING-CLASS")));

    private static final SubLSymbol CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_GET_POSTING_CLASS_METHOD = makeSymbol("CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-GET-POSTING-CLASS-METHOD");

    private static final SubLSymbol SET_POSTING_CLASS = makeSymbol("SET-POSTING-CLASS");

    static private final SubLList $list_alt187 = list(makeSymbol("NEW-POSTING-CLASS"));

    static private final SubLList $list_alt188 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-POSTING-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("POSTING-CLASS"))), makeString("(SET-POSTING-CLASS ~S): ~S is not a valid posting class name.  A non nil symbol was expected."), makeSymbol("SELF"), makeSymbol("POSTING-CLASS")), list(makeSymbol("PUNLESS"), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("NEW-POSTING-CLASS"), list(QUOTE, makeSymbol("CYBLACK-POSTING"))), list(makeSymbol("WARN"), makeString("(SET-POSTING-CLASS ~S): ~S does not implement the CYBLACK-POSTING interface."), makeSymbol("SELF"), makeSymbol("NEW-POSTING-CLASS"))), list(makeSymbol("CSETQ"), makeSymbol("POSTING-CLASS"), makeSymbol("NEW-POSTING-CLASS")), list(RET, makeSymbol("NEW-POSTING-CLASS")));

    static private final SubLSymbol $sym189$OUTER_CATCH_FOR_CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-METHOD");

    static private final SubLString $str_alt190$_SET_POSTING_CLASS__S____S_is_not = makeString("(SET-POSTING-CLASS ~S): ~S is not a valid posting class name.  A non nil symbol was expected.");



    static private final SubLString $str_alt192$_SET_POSTING_CLASS__S____S_does_n = makeString("(SET-POSTING-CLASS ~S): ~S does not implement the CYBLACK-POSTING interface.");

    private static final SubLSymbol CYBLACK_DEFBB_POSTING_CLASS_ASSOCIATION_SET_POSTING_CLASS_METHOD = makeSymbol("CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION-SET-POSTING-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION = makeSymbol("CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION");

    static private final SubLList $list_alt195 = list(list(makeSymbol("PANEL-CLASS-ASSOCIATIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL-CLASS-ASSOCIATIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL-CLASS-ASSOCIATIONS"), list(makeSymbol("NEW-PANEL-CLASS-ASSOCIATIONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PANEL-CLASS-ASSOCIATION"), list(makeSymbol("NEW-PANEL-CLASS-ASSOCIATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL-CLASS-GIVEN-TYPE-STRING"), list(makeSymbol("TYPE-STRING")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym197$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-CLASS");

    static private final SubLSymbol $sym198$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt199 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PANEL-CLASS-ASSOCIATIONS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym200$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-METHOD");

    static private final SubLSymbol $sym201$CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_INITIALIZE_METHO = makeSymbol("CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-INITIALIZE-METHOD");

    static private final SubLList $list_alt202 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:TYPE-TO-PANEL-CLASS-MAP")), list(makeSymbol("CDOLIST"), list(makeSymbol("ASSOCIATION"), makeSymbol("PANEL-CLASS-ASSOCIATIONS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("ASSOCIATION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym203$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-METHOD");

    static private final SubLString $str_alt204$__TYPE_TO_PANEL_CLASS_MAP = makeString("(:TYPE-TO-PANEL-CLASS-MAP");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol GET_PANEL_CLASS_ASSOCIATIONS = makeSymbol("GET-PANEL-CLASS-ASSOCIATIONS");

    static private final SubLList $list_alt207 = list(list(RET, makeSymbol("PANEL-CLASS-ASSOCIATIONS")));

    static private final SubLSymbol $sym208$CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_GET_PANEL_CLASS_ = makeSymbol("CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-GET-PANEL-CLASS-ASSOCIATIONS-METHOD");

    private static final SubLSymbol SET_PANEL_CLASS_ASSOCIATIONS = makeSymbol("SET-PANEL-CLASS-ASSOCIATIONS");

    static private final SubLList $list_alt210 = list(makeSymbol("NEW-PANEL-CLASS-ASSOCIATIONS"));

    static private final SubLList $list_alt211 = list(list(makeSymbol("CSETQ"), makeSymbol("PANEL-CLASS-ASSOCIATIONS"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-PANEL-CLASS-ASSOCIATIONS"))), list(RET, makeSymbol("NEW-PANEL-CLASS-ASSOCIATIONS")));

    static private final SubLSymbol $sym212$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-METHOD");

    static private final SubLSymbol $sym213$CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_SET_PANEL_CLASS_ = makeSymbol("CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-SET-PANEL-CLASS-ASSOCIATIONS-METHOD");

    private static final SubLSymbol ADD_PANEL_CLASS_ASSOCIATION = makeSymbol("ADD-PANEL-CLASS-ASSOCIATION");

    static private final SubLList $list_alt215 = list(makeSymbol("NEW-PANEL-CLASS-ASSOCIATION"));

    static private final SubLList $list_alt216 = list(list(makeSymbol("CSETQ"), makeSymbol("PANEL-CLASS-ASSOCIATIONS"), list(makeSymbol("NCONC"), makeSymbol("PANEL-CLASS-ASSOCIATIONS"), list(makeSymbol("LIST"), makeSymbol("NEW-PANEL-CLASS-ASSOCIATION")))), list(RET, makeSymbol("NEW-PANEL-CLASS-ASSOCIATION")));

    static private final SubLSymbol $sym217$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-METHOD");

    static private final SubLSymbol $sym218$CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_ADD_PANEL_CLASS_ = makeSymbol("CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-ADD-PANEL-CLASS-ASSOCIATION-METHOD");

    private static final SubLSymbol GET_PANEL_CLASS_GIVEN_TYPE_STRING = makeSymbol("GET-PANEL-CLASS-GIVEN-TYPE-STRING");

    static private final SubLList $list_alt220 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("ASSOCIATION"), makeSymbol("PANEL-CLASS-ASSOCIATIONS")), list(makeSymbol("PWHEN"), list(EQUAL, list(makeSymbol("CYBLACK-DEFBB-TYPE-ASSOCIATION-GET-TYPE-STRING-METHOD"), makeSymbol("ASSOCIATION")), makeSymbol("TYPE-STRING")), list(RET, list(makeSymbol("CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-GET-PANEL-CLASS-METHOD"), makeSymbol("ASSOCIATION"))))), list(RET, NIL));

    static private final SubLSymbol $sym221$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-METHOD");

    static private final SubLSymbol $sym222$CYBLACK_DEFBB_TYPE_TO_PANEL_CLASS_MAP_EXPRESSION_GET_PANEL_CLASS_ = makeSymbol("CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-GET-PANEL-CLASS-GIVEN-TYPE-STRING-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION = makeSymbol("CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION");

    static private final SubLList $list_alt224 = list(list(makeSymbol("PANEL-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL-CLASS"), list(makeSymbol("NEW-POSTING-CLASS")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym226$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-CLASS");

    static private final SubLSymbol $sym227$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-INSTANCE");

    static private final SubLList $list_alt228 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PANEL-CLASS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym229$OUTER_CATCH_FOR_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-INITIALIZE-METHOD");

    static private final SubLList $list_alt231 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:PANEL-CLASS ~S ~S)"), makeSymbol("TYPE-STRING"), makeSymbol("PANEL-CLASS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym232$OUTER_CATCH_FOR_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-METHOD");

    static private final SubLString $str_alt233$__PANEL_CLASS__S__S_ = makeString("(:PANEL-CLASS ~S ~S)");

    private static final SubLSymbol CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_PRINT_METHOD = makeSymbol("CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-PRINT-METHOD");

    private static final SubLSymbol GET_PANEL_CLASS = makeSymbol("GET-PANEL-CLASS");

    static private final SubLList $list_alt236 = list(list(RET, makeSymbol("PANEL-CLASS")));

    private static final SubLSymbol CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_GET_PANEL_CLASS_METHOD = makeSymbol("CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-GET-PANEL-CLASS-METHOD");

    private static final SubLSymbol SET_PANEL_CLASS = makeSymbol("SET-PANEL-CLASS");

    static private final SubLList $list_alt239 = list(makeSymbol("NEW-PANEL-CLASS"));

    static private final SubLList $list_alt240 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("NEW-PANEL-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("PANEL-CLASS"))), makeString("(SET-PANEL-CLASS ~S): ~S is not a valid panel class name.  A non nil symbol was expected."), makeSymbol("SELF"), makeSymbol("PANEL-CLASS")), list(makeSymbol("PUNLESS"), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("NEW-PANEL-CLASS"), list(QUOTE, makeSymbol("CYBLACK-PANEL"))), list(makeSymbol("WARN"), makeString("(SET-PANEL-CLASS ~S): ~S does not implement the CYBLACK-PANEL interface."), makeSymbol("SELF"), makeSymbol("NEW-PANEL-CLASS"))), list(makeSymbol("CSETQ"), makeSymbol("PANEL-CLASS"), makeSymbol("NEW-PANEL-CLASS")), list(RET, makeSymbol("NEW-PANEL-CLASS")));

    static private final SubLSymbol $sym241$OUTER_CATCH_FOR_CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-METHOD");

    static private final SubLString $str_alt242$_SET_PANEL_CLASS__S____S_is_not_a = makeString("(SET-PANEL-CLASS ~S): ~S is not a valid panel class name.  A non nil symbol was expected.");



    static private final SubLString $str_alt244$_SET_PANEL_CLASS__S____S_does_not = makeString("(SET-PANEL-CLASS ~S): ~S does not implement the CYBLACK-PANEL interface.");

    private static final SubLSymbol CYBLACK_DEFBB_PANEL_CLASS_ASSOCIATION_SET_PANEL_CLASS_METHOD = makeSymbol("CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION-SET-PANEL-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_METHOD_EXPRESSION = makeSymbol("CYBLACK-DEFBB-METHOD-EXPRESSION");

    static private final SubLList $list_alt247 = list(list(makeSymbol("METHOD-NAME-KEY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SYMBOLIC-EXPRESSIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SYMBOLIC-EXPRESSIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SYMBOLIC-EXPRESSIONS"), list(makeSymbol("NEW-SYMBOLIC-EXPRESSIONS")), makeKeyword("PUBLIC")));



    private static final SubLSymbol METHOD_NAME_KEY = makeSymbol("METHOD-NAME-KEY");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_METHOD_EXPRESSION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-METHOD-EXPRESSION-CLASS");

    static private final SubLSymbol $sym251$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_METHOD_EXPRESSION_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-METHOD-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt252 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-EXPRESSIONS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym253$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-METHOD-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_METHOD_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFBB-METHOD-EXPRESSION-INITIALIZE-METHOD");

    static private final SubLList $list_alt255 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(~S"), makeSymbol("METHOD-NAME-KEY")), list(makeSymbol("CDOLIST"), list(makeSymbol("SYMBOLIC-EXPRESSION"), makeSymbol("SYMBOLIC-EXPRESSIONS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("SYMBOLIC-EXPRESSION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym256$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-METHOD-EXPRESSION-METHOD");

    static private final SubLString $str_alt257$__S = makeString("(~S");

    private static final SubLSymbol CYBLACK_DEFBB_METHOD_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFBB-METHOD-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol GET_SYMBOLIC_EXPRESSIONS = makeSymbol("GET-SYMBOLIC-EXPRESSIONS");

    static private final SubLList $list_alt260 = list(list(RET, makeSymbol("SYMBOLIC-EXPRESSIONS")));

    static private final SubLSymbol $sym261$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-METHOD-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_METHOD_EXPRESSION_GET_SYMBOLIC_EXPRESSIONS_METHOD = makeSymbol("CYBLACK-DEFBB-METHOD-EXPRESSION-GET-SYMBOLIC-EXPRESSIONS-METHOD");

    private static final SubLSymbol SET_SYMBOLIC_EXPRESSIONS = makeSymbol("SET-SYMBOLIC-EXPRESSIONS");

    static private final SubLList $list_alt264 = list(makeSymbol("NEW-SYMBOLIC-EXPRESSIONS"));

    static private final SubLList $list_alt265 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-SYMBOLIC-EXPRESSIONS")), list(makeSymbol("CONSP"), makeSymbol("NEW-SYMBOLIC-EXPRESSIONS"))), makeString("(SET-SYMBOLIC-EXPRESSION ~S): ~S is not a valid list of symbolic expressions."), makeSymbol("SELF"), makeSymbol("NEW-SYMBOLIC-EXPRESSIONS")), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-EXPRESSIONS"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-SYMBOLIC-EXPRESSIONS"))), list(RET, makeSymbol("NEW-SYMBOLIC-EXPRESSIONS")));

    static private final SubLSymbol $sym266$OUTER_CATCH_FOR_CYBLACK_DEFBB_METHOD_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-METHOD-EXPRESSION-METHOD");

    static private final SubLString $str_alt267$_SET_SYMBOLIC_EXPRESSION__S____S_ = makeString("(SET-SYMBOLIC-EXPRESSION ~S): ~S is not a valid list of symbolic expressions.");

    private static final SubLSymbol CYBLACK_DEFBB_METHOD_EXPRESSION_SET_SYMBOLIC_EXPRESSIONS_METHOD = makeSymbol("CYBLACK-DEFBB-METHOD-EXPRESSION-SET-SYMBOLIC-EXPRESSIONS-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_ON_STARTUP_EXPRESSION = makeSymbol("CYBLACK-DEFBB-ON-STARTUP-EXPRESSION");

    static private final SubLList $list_alt270 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym271$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ON_STARTUP_EXPRESSION_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ON-STARTUP-EXPRESSION-CLASS");

    static private final SubLSymbol $sym272$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ON_STARTUP_EXPRESSION_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ON-STARTUP-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt273 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("METHOD-NAME-KEY"), makeKeyword("ON-STARTUP")), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-EXPRESSIONS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym274$OUTER_CATCH_FOR_CYBLACK_DEFBB_ON_STARTUP_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-ON-STARTUP-EXPRESSION-METHOD");

    private static final SubLSymbol $ON_STARTUP = makeKeyword("ON-STARTUP");

    private static final SubLSymbol CYBLACK_DEFBB_ON_STARTUP_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFBB-ON-STARTUP-EXPRESSION-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION = makeSymbol("CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION");

    static private final SubLSymbol $sym278$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION-CLASS");

    static private final SubLSymbol $sym279$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt280 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("METHOD-NAME-KEY"), makeKeyword("ON-SHUTDOWN")), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-EXPRESSIONS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym281$OUTER_CATCH_FOR_CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION-METHOD");

    private static final SubLSymbol $ON_SHUTDOWN = makeKeyword("ON-SHUTDOWN");

    private static final SubLSymbol CYBLACK_DEFBB_ON_SHUTDOWN_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_BODY = makeSymbol("CYBLACK-DEFBB-BODY");

    static private final SubLList $list_alt285 = list(new SubLObject[]{ list(makeSymbol("TYPE-GRAPH-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TYPE-TO-POSTING-CLASS-MAP"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TYPE-TO-PANEL-CLASS-MAP"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ON-STARTUP-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ON-SHUTDOWN-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE-GRAPH-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPE-GRAPH-EXPRESSION"), list(makeSymbol("NEW-TYPE-GRAPH-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE-TO-POSTING-CLASS-MAP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPE-TO-POSTING-CLASS-MAP"), list(makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TYPE-TO-PANEL-CLASS-MAP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TYPE-TO-PANEL-CLASS-MAP"), list(makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ON-STARTUP-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ON-STARTUP-EXPRESSION"), list(makeSymbol("NEW-ON-STARTUP-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ON-SHUTDOWN-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ON-SHUTDOWN-EXPRESSION"), list(makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-SUBTYPE-EXPRESSIONS"), NIL, makeKeyword("PUBLIC")) });











    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_BODY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-BODY-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_BODY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-BODY-INSTANCE");

    static private final SubLList $list_alt293 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-GRAPH-EXPRESSION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TYPE-TO-POSTING-CLASS-MAP"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TYPE-TO-PANEL-CLASS-MAP"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ON-STARTUP-EXPRESSION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ON-SHUTDOWN-EXPRESSION"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym294$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-INITIALIZE-METHOD");

    static private final SubLList $list_alt296 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S ~S ~S"), makeSymbol("TYPE-GRAPH-EXPRESSION"), makeSymbol("TYPE-TO-POSTING-CLASS-MAP"), makeSymbol("TYPE-TO-PANEL-CLASS-MAP")), list(makeSymbol("PWHEN"), makeSymbol("ON-STARTUP-EXPRESSION"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("ON-STARTUP-EXPRESSION"))), list(makeSymbol("PWHEN"), makeSymbol("ON-SHUTDOWN-EXPRESSION"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("ON-SHUTDOWN-EXPRESSION"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym297$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    static private final SubLString $str_alt298$_S__S__S = makeString("~S ~S ~S");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_PRINT_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-PRINT-METHOD");

    private static final SubLSymbol GET_TYPE_GRAPH_EXPRESSION = makeSymbol("GET-TYPE-GRAPH-EXPRESSION");

    static private final SubLList $list_alt301 = list(list(RET, makeSymbol("TYPE-GRAPH-EXPRESSION")));

    static private final SubLSymbol $sym302$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_GET_TYPE_GRAPH_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-GET-TYPE-GRAPH-EXPRESSION-METHOD");

    private static final SubLSymbol SET_TYPE_GRAPH_EXPRESSION = makeSymbol("SET-TYPE-GRAPH-EXPRESSION");

    static private final SubLList $list_alt305 = list(makeSymbol("NEW-TYPE-GRAPH-EXPRESSION"));

    static private final SubLList $list_alt306 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-TYPE-GRAPH-EXPRESSION")), list(makeSymbol("CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION-P"), makeSymbol("NEW-TYPE-GRAPH-EXPRESSION"))), makeString("(SET-TYPE-GRAPH-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-TYPE-GRAPH-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-GRAPH-EXPRESSION"), makeSymbol("NEW-TYPE-GRAPH-EXPRESSION")), list(RET, makeSymbol("NEW-TYPE-GRAPH-EXPRESSION")));

    static private final SubLSymbol $sym307$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    static private final SubLString $str_alt308$_SET_TYPE_GRAPH_EXPRESSION__S____ = makeString("(SET-TYPE-GRAPH-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_SET_TYPE_GRAPH_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-SET-TYPE-GRAPH-EXPRESSION-METHOD");

    private static final SubLSymbol GET_TYPE_TO_POSTING_CLASS_MAP = makeSymbol("GET-TYPE-TO-POSTING-CLASS-MAP");

    static private final SubLList $list_alt311 = list(list(RET, makeSymbol("TYPE-TO-POSTING-CLASS-MAP")));

    static private final SubLSymbol $sym312$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_GET_TYPE_TO_POSTING_CLASS_MAP_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-GET-TYPE-TO-POSTING-CLASS-MAP-METHOD");

    private static final SubLSymbol SET_TYPE_TO_POSTING_CLASS_MAP = makeSymbol("SET-TYPE-TO-POSTING-CLASS-MAP");

    static private final SubLList $list_alt315 = list(makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP"));

    static private final SubLList $list_alt316 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP")), list(makeSymbol("CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION-P"), makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP"))), makeString("(SET-TYPE-TO-POSTING-CLASS-MAP ~S): ~S is not an instance of CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-TO-POSTING-CLASS-MAP"), makeSymbol("NEW-TYPE-TO-POSTING-CLASS-MAP")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym317$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    static private final SubLString $str_alt318$_SET_TYPE_TO_POSTING_CLASS_MAP__S = makeString("(SET-TYPE-TO-POSTING-CLASS-MAP ~S): ~S is not an instance of CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_SET_TYPE_TO_POSTING_CLASS_MAP_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-SET-TYPE-TO-POSTING-CLASS-MAP-METHOD");

    private static final SubLSymbol GET_TYPE_TO_PANEL_CLASS_MAP = makeSymbol("GET-TYPE-TO-PANEL-CLASS-MAP");

    static private final SubLList $list_alt321 = list(list(RET, makeSymbol("TYPE-TO-PANEL-CLASS-MAP")));

    static private final SubLSymbol $sym322$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_GET_TYPE_TO_PANEL_CLASS_MAP_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-GET-TYPE-TO-PANEL-CLASS-MAP-METHOD");

    private static final SubLSymbol SET_TYPE_TO_PANEL_CLASS_MAP = makeSymbol("SET-TYPE-TO-PANEL-CLASS-MAP");

    static private final SubLList $list_alt325 = list(makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP"));

    static private final SubLList $list_alt326 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP")), list(makeSymbol("CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION-P"), makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP"))), makeString("(SET-TYPE-TO-PANEL-CLASS-MAP ~S): ~S is not an instance of CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-TO-PANEL-CLASS-MAP"), makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP")), list(RET, makeSymbol("NEW-TYPE-TO-PANEL-CLASS-MAP")));

    static private final SubLSymbol $sym327$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    static private final SubLString $str_alt328$_SET_TYPE_TO_PANEL_CLASS_MAP__S__ = makeString("(SET-TYPE-TO-PANEL-CLASS-MAP ~S): ~S is not an instance of CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_SET_TYPE_TO_PANEL_CLASS_MAP_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-SET-TYPE-TO-PANEL-CLASS-MAP-METHOD");

    private static final SubLSymbol GET_ON_STARTUP_EXPRESSION = makeSymbol("GET-ON-STARTUP-EXPRESSION");

    static private final SubLList $list_alt331 = list(list(RET, makeSymbol("ON-STARTUP-EXPRESSION")));

    static private final SubLSymbol $sym332$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_GET_ON_STARTUP_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-GET-ON-STARTUP-EXPRESSION-METHOD");

    private static final SubLSymbol SET_ON_STARTUP_EXPRESSION = makeSymbol("SET-ON-STARTUP-EXPRESSION");

    static private final SubLList $list_alt335 = list(makeSymbol("NEW-ON-STARTUP-EXPRESSION"));

    static private final SubLList $list_alt336 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-ON-STARTUP-EXPRESSION")), list(makeSymbol("CYBLACK-DEFBB-ON-STARTUP-EXPRESSION-P"), makeSymbol("NEW-ON-STARTUP-EXPRESSION"))), makeString("(SET-ON-STARTUP-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFBB-ON-STARTUP-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-ON-STARTUP-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("ON-STARTUP-EXPRESSION"), makeSymbol("NEW-ON-STARTUP-EXPRESSION")), list(RET, makeSymbol("NEW-ON-STARTUP-EXPRESSION")));

    static private final SubLSymbol $sym337$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    static private final SubLString $str_alt338$_SET_ON_STARTUP_EXPRESSION__S____ = makeString("(SET-ON-STARTUP-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFBB-ON-STARTUP-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_SET_ON_STARTUP_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-SET-ON-STARTUP-EXPRESSION-METHOD");

    private static final SubLSymbol GET_ON_SHUTDOWN_EXPRESSION = makeSymbol("GET-ON-SHUTDOWN-EXPRESSION");

    static private final SubLList $list_alt341 = list(list(RET, makeSymbol("ON-SHUTDOWN-EXPRESSION")));

    static private final SubLSymbol $sym342$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_GET_ON_SHUTDOWN_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-GET-ON-SHUTDOWN-EXPRESSION-METHOD");

    private static final SubLSymbol SET_ON_SHUTDOWN_EXPRESSION = makeSymbol("SET-ON-SHUTDOWN-EXPRESSION");

    static private final SubLList $list_alt345 = list(makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION"));

    static private final SubLList $list_alt346 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION")), list(makeSymbol("CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION-P"), makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION"))), makeString("(SET-ON-SHUTDOWN-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("ON-SHUTDOWN-EXPRESSION"), makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION")), list(RET, makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION")));

    static private final SubLSymbol $sym347$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");

    static private final SubLString $str_alt348$_SET_ON_SHUTDOWN_EXPRESSION__S___ = makeString("(SET-ON-SHUTDOWN-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFBB-ON-SHUTDOWN-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFBB_BODY_SET_ON_SHUTDOWN_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-SET-ON-SHUTDOWN-EXPRESSION-METHOD");

    private static final SubLSymbol COMPILE_TO_SUBTYPE_EXPRESSIONS = makeSymbol("COMPILE-TO-SUBTYPE-EXPRESSIONS");

    static private final SubLList $list_alt351 = list(list(makeSymbol("PWHEN"), makeSymbol("TYPE-GRAPH-EXPRESSION"), list(makeSymbol("CLET"), list(list(makeSymbol("TYPE-DECLARATIONS"), list(makeSymbol("FIF"), makeSymbol("TYPE-GRAPH-EXPRESSION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TYPE-DECLARATIONS"), makeSymbol("CYBLACK-DEFBB-TYPE-GRAPH-EXPRESSION")), makeSymbol("TYPE-GRAPH-EXPRESSION")), NIL)), list(makeSymbol("TYPE-STRING"), NIL), list(makeSymbol("POSTING-CLASS"), NIL), list(makeSymbol("PANEL-CLASS"), NIL), list(makeSymbol("SUBTYPE-EXPRESSIONS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE-DECLARATION"), makeSymbol("TYPE-DECLARATIONS")), list(makeSymbol("CSETQ"), makeSymbol("TYPE-STRING"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TYPE-STRING"), makeSymbol("CYBLACK-DEFFBB-TYPE-DECLARATION")), makeSymbol("TYPE-DECLARATION"))), list(makeSymbol("CSETQ"), makeSymbol("POSTING-CLASS"), list(makeSymbol("FIF"), makeSymbol("TYPE-TO-POSTING-CLASS-MAP"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-POSTING-CLASS-GIVEN-TYPE-STRING"), makeSymbol("CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP-EXPRESSION")), makeSymbol("TYPE-TO-POSTING-CLASS-MAP"), makeSymbol("TYPE-STRING")), NIL)), list(makeSymbol("CSETQ"), makeSymbol("PANEL-CLASS"), list(makeSymbol("FIF"), makeSymbol("TYPE-TO-PANEL-CLASS-MAP"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PANEL-CLASS-GIVEN-TYPE-STRING"), makeSymbol("CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP-EXPRESSION")), makeSymbol("TYPE-TO-PANEL-CLASS-MAP"), makeSymbol("TYPE-STRING")), NIL)), list(makeSymbol("PIF"), list(makeSymbol("INSTANCE-OF-P"), makeSymbol("TYPE-DECLARATION"), list(QUOTE, makeSymbol("CYBLACK-DEFBB-ROOT-TYPE-DECLARATION"))), list(makeSymbol("CPUSH"), list(makeSymbol("COPY-TREE"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("DECLARE-SUBTYPE")), list(QUOTE, makeSymbol("SELF")), makeSymbol("TYPE-STRING"), makeString("POSTING"), list(makeSymbol("FIF"), makeSymbol("POSTING-CLASS"), list(makeSymbol("LIST"), list(QUOTE, QUOTE), makeSymbol("POSTING-CLASS")), list(makeSymbol("LIST"), list(QUOTE, QUOTE), list(QUOTE, makeSymbol("CYBLACK-BASIC-POSTING")))), list(makeSymbol("FIF"), makeSymbol("PANEL-CLASS"), list(makeSymbol("LIST"), list(QUOTE, QUOTE), makeSymbol("PANEL-CLASS")), list(makeSymbol("LIST"), list(QUOTE, QUOTE), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL")))))), makeSymbol("SUBTYPE-EXPRESSIONS")), list(makeSymbol("CPUSH"), list(makeSymbol("COPY-TREE"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("DECLARE-SUBTYPE")), list(QUOTE, makeSymbol("SELF")), makeSymbol("TYPE-STRING"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SUPERTYPE-STRING"), makeSymbol("CYBLACK-DEFFBB-SUBTYPE-DECLARATION")), makeSymbol("TYPE-DECLARATION")), list(makeSymbol("FIF"), makeSymbol("POSTING-CLASS"), list(makeSymbol("LIST"), list(QUOTE, QUOTE), makeSymbol("POSTING-CLASS")), list(makeSymbol("LIST"), list(QUOTE, QUOTE), list(QUOTE, makeSymbol("CYBLACK-BASIC-POSTING")))), list(makeSymbol("FIF"), makeSymbol("PANEL-CLASS"), list(makeSymbol("LIST"), list(QUOTE, QUOTE), makeSymbol("PANEL-CLASS")), list(makeSymbol("LIST"), list(QUOTE, QUOTE), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL")))))), makeSymbol("SUBTYPE-EXPRESSIONS")))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("SUBTYPE-EXPRESSIONS"))))), list(RET, NIL));

    static private final SubLSymbol $sym352$OUTER_CATCH_FOR_CYBLACK_DEFBB_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-BODY-METHOD");





    static private final SubLString $$$POSTING = makeString("POSTING");







    private static final SubLSymbol CYBLACK_DEFBB_BODY_COMPILE_TO_SUBTYPE_EXPRESSIONS_METHOD = makeSymbol("CYBLACK-DEFBB-BODY-COMPILE-TO-SUBTYPE-EXPRESSIONS-METHOD");



    static private final SubLList $list_alt361 = list(new SubLObject[]{ list(makeSymbol("SUBTYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUPERTYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MARK"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBTYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUBTYPE"), list(makeSymbol("NEW-SUBTYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPERTYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUPERTYPE"), list(makeSymbol("NEW-SUPERTYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MARK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MARK"), list(makeSymbol("NEW-MARK")), makeKeyword("PUBLIC")) });







    public static final SubLInteger $int$4097 = makeInteger(4097);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_RELATION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-RELATION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFBB_TYPE_RELATION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFBB-TYPE-RELATION-INSTANCE");

    static private final SubLList $list_alt368 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SUBTYPE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SUPERTYPE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("MARK"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym369$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-RELATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_RELATION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-RELATION-INITIALIZE-METHOD");

    static private final SubLList $list_alt371 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<TYPE-RELATION: ~S->~S(~S)>"), makeSymbol("SUBTYPE"), makeSymbol("SUPERTYPE"), makeSymbol("MARK")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym372$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-RELATION-METHOD");

    static private final SubLString $str_alt373$__TYPE_RELATION___S___S__S__ = makeString("#<TYPE-RELATION: ~S->~S(~S)>");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_RELATION_PRINT_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-RELATION-PRINT-METHOD");

    private static final SubLSymbol GET_SUBTYPE = makeSymbol("GET-SUBTYPE");

    static private final SubLList $list_alt376 = list(list(RET, makeSymbol("SUBTYPE")));

    static private final SubLSymbol $sym377$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-RELATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_RELATION_GET_SUBTYPE_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-RELATION-GET-SUBTYPE-METHOD");

    private static final SubLSymbol SET_SUBTYPE = makeSymbol("SET-SUBTYPE");

    static private final SubLList $list_alt380 = list(makeSymbol("NEW-SUBTYPE"));

    static private final SubLList $list_alt381 = list(list(makeSymbol("CSETQ"), makeSymbol("SUBTYPE"), makeSymbol("NEW-SUBTYPE")), list(RET, makeSymbol("NEW-SUBTYPE")));

    static private final SubLSymbol $sym382$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-RELATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_RELATION_SET_SUBTYPE_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-RELATION-SET-SUBTYPE-METHOD");

    private static final SubLSymbol GET_SUPERTYPE = makeSymbol("GET-SUPERTYPE");

    static private final SubLList $list_alt385 = list(list(RET, makeSymbol("SUPERTYPE")));

    static private final SubLSymbol $sym386$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-RELATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_RELATION_GET_SUPERTYPE_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-RELATION-GET-SUPERTYPE-METHOD");

    private static final SubLSymbol SET_SUPERTYPE = makeSymbol("SET-SUPERTYPE");

    static private final SubLList $list_alt389 = list(makeSymbol("NEW-SUPERTYPE"));

    static private final SubLList $list_alt390 = list(list(makeSymbol("CSETQ"), makeSymbol("SUPERTYPE"), makeSymbol("NEW-SUPERTYPE")), list(RET, makeSymbol("NEW-SUPERTYPE")));

    static private final SubLSymbol $sym391$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-RELATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_RELATION_SET_SUPERTYPE_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-RELATION-SET-SUPERTYPE-METHOD");

    private static final SubLSymbol GET_MARK = makeSymbol("GET-MARK");

    static private final SubLList $list_alt394 = list(list(RET, makeSymbol("MARK")));

    static private final SubLSymbol $sym395$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-RELATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_RELATION_GET_MARK_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-RELATION-GET-MARK-METHOD");

    private static final SubLSymbol SET_MARK = makeSymbol("SET-MARK");

    static private final SubLList $list_alt398 = list(makeSymbol("NEW-MARK"));

    static private final SubLList $list_alt399 = list(list(makeSymbol("CSETQ"), makeSymbol("MARK"), makeSymbol("NEW-MARK")), list(RET, makeSymbol("NEW-MARK")));

    static private final SubLSymbol $sym400$OUTER_CATCH_FOR_CYBLACK_DEFBB_TYPE_RELATION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFBB-TYPE-RELATION-METHOD");

    private static final SubLSymbol CYBLACK_DEFBB_TYPE_RELATION_SET_MARK_METHOD = makeSymbol("CYBLACK-DEFBB-TYPE-RELATION-SET-MARK-METHOD");

    static private final SubLList $list_alt402 = list(makeKeyword("CANNOT-SUBTYPE-SELF"), makeKeyword("ALREADY-A-RELATION"), makeKeyword("ANCESTOR-OF-SELF"));

    private static final SubLSymbol CYBLACK_DEFBB_CHECK_RELATION_ERROR = makeSymbol("CYBLACK-DEFBB-CHECK-RELATION-ERROR");

    private static final SubLSymbol ENCODE_CYBLACK_DEFBB_CHECK_RELATION_ERROR = makeSymbol("ENCODE-CYBLACK-DEFBB-CHECK-RELATION-ERROR");

    private static final SubLSymbol DECODE_CYBLACK_DEFBB_CHECK_RELATION_ERROR = makeSymbol("DECODE-CYBLACK-DEFBB-CHECK-RELATION-ERROR");

    private static final SubLSymbol CYBLACK_DEFBB_CHECK_RELATION_ERROR_P = makeSymbol("CYBLACK-DEFBB-CHECK-RELATION-ERROR-P");

    private static final SubLSymbol CYBLACK_TYPE_RELATION_TABLE = makeSymbol("CYBLACK-TYPE-RELATION-TABLE");

    static private final SubLList $list_alt408 = list(new SubLObject[]{ list(makeSymbol("RELATIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR-ALL-MARKS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-RELATION"), list(makeSymbol("SUBTYPE"), makeSymbol("SUPERTYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTEND-SUPER"), list(makeSymbol("RELATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTEND-SUB"), list(makeSymbol("RELATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RELATIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-RELATIONS"), list(makeSymbol("NEW-RELATIONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-RELATION"), list(makeSymbol("SUBTYPE"), makeSymbol("SUPERTYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-RELATION"), list(makeSymbol("SUBTYPE"), makeSymbol("SUPERTYPE")), makeKeyword("PUBLIC")) });



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TYPE_RELATION_TABLE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TYPE-RELATION-TABLE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_TYPE_RELATION_TABLE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-TYPE-RELATION-TABLE-INSTANCE");

    static private final SubLList $list_alt412 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("RELATIONS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym413$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TYPE-RELATION-TABLE-METHOD");

    private static final SubLSymbol CYBLACK_TYPE_RELATION_TABLE_INITIALIZE_METHOD = makeSymbol("CYBLACK-TYPE-RELATION-TABLE-INITIALIZE-METHOD");

    static private final SubLList $list_alt415 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<TYPE-RELATION-TABLE:")), list(makeSymbol("CDOLIST"), list(makeSymbol("RELATION"), makeSymbol("RELATIONS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%   ~S"), makeSymbol("RELATION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(">")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym416$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TYPE-RELATION-TABLE-METHOD");

    static private final SubLString $str_alt417$__TYPE_RELATION_TABLE_ = makeString("#<TYPE-RELATION-TABLE:");

    static private final SubLString $str_alt418$______S = makeString("~%   ~S");

    static private final SubLString $str_alt419$_ = makeString(">");

    private static final SubLSymbol CYBLACK_TYPE_RELATION_TABLE_PRINT_METHOD = makeSymbol("CYBLACK-TYPE-RELATION-TABLE-PRINT-METHOD");



    static private final SubLList $list_alt422 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("RELATION"), makeSymbol("RELATIONS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-MARK"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("RELATION"), NIL)), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym423$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TYPE-RELATION-TABLE-METHOD");

    private static final SubLSymbol CYBLACK_TYPE_RELATION_TABLE_CLEAR_ALL_MARKS_METHOD = makeSymbol("CYBLACK-TYPE-RELATION-TABLE-CLEAR-ALL-MARKS-METHOD");

    private static final SubLSymbol HAS_RELATION = makeSymbol("HAS-RELATION");

    static private final SubLList $list_alt426 = list(makeSymbol("SUBTYPE"), makeSymbol("SUPERTYPE"));

    static private final SubLList $list_alt427 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("RELATION"), makeSymbol("RELATIONS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("STRING-EQUAL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SUBTYPE"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("RELATION")), makeSymbol("SUBTYPE")), list(makeSymbol("STRING-EQUAL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SUPERTYPE"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("RELATION")), makeSymbol("SUPERTYPE"))), list(RET, T))), list(RET, NIL));

    static private final SubLSymbol $sym428$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TYPE-RELATION-TABLE-METHOD");

    private static final SubLSymbol CYBLACK_TYPE_RELATION_TABLE_HAS_RELATION_METHOD = makeSymbol("CYBLACK-TYPE-RELATION-TABLE-HAS-RELATION-METHOD");

    private static final SubLSymbol EXTEND_SUPER = makeSymbol("EXTEND-SUPER");

    static private final SubLList $list_alt431 = list(makeSymbol("RELATION-OR-TYPE"));

    static private final SubLList $list_alt432 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SUPERS"), NIL), list(makeSymbol("SUPERTYPE"), list(makeSymbol("FIF"), list(makeSymbol("STRINGP"), makeSymbol("RELATION-OR-TYPE")), makeSymbol("RELATION-OR-TYPE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SUPERTYPE"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("RELATION-OR-TYPE"))))), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("SOME-RELATION"), makeSymbol("RELATIONS"), makeSymbol("SUPERS")), list(makeSymbol("FIF"), list(makeSymbol("STRING-EQUAL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SUBTYPE"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("SOME-RELATION")), makeSymbol("SUPERTYPE")), list(makeSymbol("LIST"), makeSymbol("SOME-RELATION")), NIL)), list(RET, makeSymbol("SUPERS"))));

    static private final SubLSymbol $sym433$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TYPE-RELATION-TABLE-METHOD");

    private static final SubLSymbol CYBLACK_TYPE_RELATION_TABLE_EXTEND_SUPER_METHOD = makeSymbol("CYBLACK-TYPE-RELATION-TABLE-EXTEND-SUPER-METHOD");

    private static final SubLSymbol EXTEND_SUB = makeSymbol("EXTEND-SUB");

    static private final SubLList $list_alt436 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SUBS"), NIL), list(makeSymbol("SUBTYPE"), list(makeSymbol("FIF"), list(makeSymbol("STRINGP"), makeSymbol("RELATION-OR-TYPE")), makeSymbol("RELATION-OR-TYPE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SUBTYPE"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("RELATION-OR-TYPE"))))), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("SOME-RELATION"), makeSymbol("RELATIONS"), makeSymbol("SUBS")), list(makeSymbol("FIF"), list(makeSymbol("STRING-EQUAL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SUPERTYPE"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("SOME-RELATION")), makeSymbol("SUBTYPE")), list(makeSymbol("LIST"), makeSymbol("SOME-RELATION")), NIL)), list(RET, makeSymbol("SUBS"))));

    static private final SubLSymbol $sym437$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TYPE-RELATION-TABLE-METHOD");

    private static final SubLSymbol CYBLACK_TYPE_RELATION_TABLE_EXTEND_SUB_METHOD = makeSymbol("CYBLACK-TYPE-RELATION-TABLE-EXTEND-SUB-METHOD");

    private static final SubLSymbol GET_RELATIONS = makeSymbol("GET-RELATIONS");

    static private final SubLList $list_alt440 = list(list(RET, makeSymbol("RELATIONS")));

    static private final SubLSymbol $sym441$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TYPE-RELATION-TABLE-METHOD");

    private static final SubLSymbol CYBLACK_TYPE_RELATION_TABLE_GET_RELATIONS_METHOD = makeSymbol("CYBLACK-TYPE-RELATION-TABLE-GET-RELATIONS-METHOD");

    private static final SubLSymbol SET_RELATIONS = makeSymbol("SET-RELATIONS");

    static private final SubLList $list_alt444 = list(makeSymbol("NEW-RELATIONS"));

    static private final SubLList $list_alt445 = list(list(makeSymbol("CSETQ"), makeSymbol("RELATIONS"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-RELATIONS"))), list(RET, makeSymbol("RELATIONS")));

    static private final SubLSymbol $sym446$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TYPE-RELATION-TABLE-METHOD");

    private static final SubLSymbol CYBLACK_TYPE_RELATION_TABLE_SET_RELATIONS_METHOD = makeSymbol("CYBLACK-TYPE-RELATION-TABLE-SET-RELATIONS-METHOD");

    private static final SubLSymbol CHECK_RELATION = makeSymbol("CHECK-RELATION");

    static private final SubLList $list_alt449 = list(list(makeSymbol("PWHEN"), list(makeSymbol("STRING-EQUAL"), makeSymbol("SUBTYPE"), makeSymbol("SUPERTYPE")), list(RET, list(makeSymbol("CONS"), makeKeyword("CANNOT-SUBTYPE-SELF"), makeSymbol("SUBTYPE")))), list(makeSymbol("PWHEN"), list(makeSymbol("HAS-RELATION"), makeSymbol("SELF"), makeSymbol("SUBTYPE"), makeSymbol("SUPERTYPE")), list(RET, list(makeSymbol("CONS"), makeKeyword("ALREADY-A-RELATION"), makeSymbol("SUBTYPE")))), list(makeSymbol("CLEAR-ALL-MARKS"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("STACK"), list(makeSymbol("EXTEND-SUPER"), makeSymbol("SELF"), makeSymbol("SUPERTYPE"))), list(makeSymbol("CURRENT"), NIL)), list(makeSymbol("WHILE"), makeSymbol("STACK"), list(makeSymbol("CSETQ"), makeSymbol("CURRENT"), list(makeSymbol("CAR"), makeSymbol("STACK"))), list(makeSymbol("CSETQ"), makeSymbol("STACK"), list(makeSymbol("CDR"), makeSymbol("STACK"))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-MARK"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("CURRENT")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-MARK"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("CURRENT"), T), list(makeSymbol("PWHEN"), list(makeSymbol("STRING-EQUAL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-SUPERTYPE"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("CURRENT")), makeSymbol("SUBTYPE")), list(RET, list(makeSymbol("CONS"), makeKeyword("ANCESTOR-OF-SELF"), makeSymbol("SUBTYPE"))))), list(makeSymbol("CSETQ"), makeSymbol("STACK"), list(makeSymbol("NCONC"), list(makeSymbol("EXTEND-SUPER"), makeSymbol("SELF"), makeSymbol("CURRENT")), makeSymbol("STACK")))), list(RET, T)));

    private static final SubLSymbol $CANNOT_SUBTYPE_SELF = makeKeyword("CANNOT-SUBTYPE-SELF");

    private static final SubLSymbol $ALREADY_A_RELATION = makeKeyword("ALREADY-A-RELATION");

    private static final SubLSymbol $ANCESTOR_OF_SELF = makeKeyword("ANCESTOR-OF-SELF");

    private static final SubLSymbol CYBLACK_TYPE_RELATION_TABLE_CHECK_RELATION_METHOD = makeSymbol("CYBLACK-TYPE-RELATION-TABLE-CHECK-RELATION-METHOD");

    private static final SubLSymbol ADD_RELATION = makeSymbol("ADD-RELATION");

    static private final SubLList $list_alt455 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CHECK-RESULT"), list(makeSymbol("CHECK-RELATION"), makeSymbol("SELF"), makeSymbol("SUBTYPE"), makeSymbol("SUPERTYPE")))), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("CHECK-RESULT")), list(makeSymbol("PCASE"), list(makeSymbol("CAR"), makeSymbol("CHECK-RESULT")), list(makeKeyword("CANNOT-SUBTYPE-SELF"), list(makeSymbol("WARN"), makeString("(ADD-RELATION ~S): ~S cannot subtype ~S.  A type cannot subtype itself."), makeSymbol("SELF"), makeSymbol("SUBTYPE"), makeSymbol("SUPERTYPE"))), list(makeKeyword("ALREADY-A-RELATION"), list(makeSymbol("WARN"), makeString("(ADD-RELATION ~S): Relation ~S->~S is already defined."), makeSymbol("SELF"), makeSymbol("SUBTYPE"), makeSymbol("SUPERTYPE"))), list(makeKeyword("ANCESTOR-OF-SELF"), list(makeSymbol("WARN"), makeString("(ADD-RELATION ~S): ~S is an ancestor of ~S and cannot be a subtype."), makeSymbol("SELF"), makeSymbol("SUBTYPE"), makeSymbol("SUPERTYPE")))), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-RELATION"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-DEFBB-TYPE-RELATION"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SUBTYPE"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("NEW-RELATION"), makeSymbol("SUBTYPE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-SUPERTYPE"), makeSymbol("CYBLACK-DEFBB-TYPE-RELATION")), makeSymbol("NEW-RELATION"), makeSymbol("SUPERTYPE")), list(makeSymbol("CPUSH"), makeSymbol("NEW-RELATION"), makeSymbol("RELATIONS")), list(RET, makeSymbol("NEW-RELATION")))));

    static private final SubLSymbol $sym456$OUTER_CATCH_FOR_CYBLACK_TYPE_RELATION_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-TYPE-RELATION-TABLE-METHOD");

    static private final SubLString $str_alt457$_ADD_RELATION__S____S_cannot_subt = makeString("(ADD-RELATION ~S): ~S cannot subtype ~S.  A type cannot subtype itself.");

    static private final SubLString $str_alt458$_ADD_RELATION__S___Relation__S___ = makeString("(ADD-RELATION ~S): Relation ~S->~S is already defined.");

    static private final SubLString $str_alt459$_ADD_RELATION__S____S_is_an_ances = makeString("(ADD-RELATION ~S): ~S is an ancestor of ~S and cannot be a subtype.");

    private static final SubLSymbol CYBLACK_TYPE_RELATION_TABLE_ADD_RELATION_METHOD = makeSymbol("CYBLACK-TYPE-RELATION-TABLE-ADD-RELATION-METHOD");

    static private final SubLString $str_alt461$PARSE_CYBLACK_DEFBB_BODY___S_is_n = makeString("PARSE-CYBLACK-DEFBB-BODY: ~S is not a valid DEFINE-BLACKBOARD body.");

    private static final SubLSymbol $TYPE_GRAPH = makeKeyword("TYPE-GRAPH");

    private static final SubLSymbol $TYPE_TO_POSTING_CLASS_MAP = makeKeyword("TYPE-TO-POSTING-CLASS-MAP");

    private static final SubLSymbol $TYPE_TO_PANEL_CLASS_MAP = makeKeyword("TYPE-TO-PANEL-CLASS-MAP");

    static private final SubLString $str_alt465$PARSE_CYBLACK_DEFBB_BODY___S_is_n = makeString("PARSE-CYBLACK-DEFBB-BODY: ~S is not a valid DEFINE-BLACKBOARD body. ~\n       No type graph information has been provided.");

    static private final SubLString $str_alt466$PARSE_CYBLACK_DEFBB_TYPE_GRAPH___ = makeString("PARSE-CYBLACK-DEFBB-TYPE-GRAPH: ~S is not a valid type graph expression.");

    private static final SubLSymbol $ROOT_TYPE = makeKeyword("ROOT-TYPE");



    static private final SubLString $str_alt469$PARSE_CYBLACK_DEFFBB_TYPE_DECLARA = makeString("PARSE-CYBLACK-DEFFBB-TYPE-DECLARATION: ~S is not a valid type declaration. ~\n     Expected a list of the form (:ROOT-TYPE <type string>) or ~\n     (:SUBTYPE <type string> <type string>).");

    static private final SubLString $str_alt470$PARSE_CYBLACK_DEFBB_TYPE_TO_POSTI = makeString("PARSE-CYBLACK-DEFBB-TYPE-TO-POSTING-CLASS-MAP: ~S is not a valid \'type to posting class\' map. ~\n     A list of the form (:TYPE-TO-POSTING-CLASS-MAP <posting class association>*) was expected.");

    private static final SubLSymbol $POSTING_CLASS = makeKeyword("POSTING-CLASS");

    static private final SubLString $str_alt472$PARSE_CYBLACK_DEFBB_POSTING_CLASS = makeString("PARSE-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION: ~S is not a valid posting class association. ~\n     A list of the form (:POSTING-CLASS <type string> <class name>) was expected.");

    static private final SubLList $list_alt473 = list(makeSymbol("TAG"), makeSymbol("TYPE-STRING"), makeSymbol("CLASS-NAME"));

    static private final SubLString $str_alt474$PARSE_CYBLACK_DEFBB_POSTING_CLASS = makeString("PARSE-CYBLACK-DEFBB-POSTING-CLASS-ASSOCIATION: Class ~S does not implement interface CYBLACK-POSTING.");

    static private final SubLString $str_alt475$PARSE_CYBLACK_DEFBB_TYPE_TO_PANEL = makeString("PARSE-CYBLACK-DEFBB-TYPE-TO-PANEL-CLASS-MAP: ~S is not a valid \'type to panel class\' map. ~\n     A list of the form (:TYPE-TO-PANEL-CLASS-MAP <panel class association>*) was expected.");

    private static final SubLSymbol $PANEL_CLASS = makeKeyword("PANEL-CLASS");

    static private final SubLString $str_alt477$PARSE_CYBLACK_DEFBB_PANEL_CLASS_A = makeString("PARSE-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION: ~S is not a valid \'panel class association.\' ~\n     A list of the form (:PANEL-CLASS <type string> <class name>) was expected.");

    static private final SubLString $str_alt478$PARSE_CYBLACK_DEFBB_PANEL_CLASS_A = makeString("PARSE-CYBLACK-DEFBB-PANEL-CLASS-ASSOCIATION: Class ~S does not implement interface CYBLACK-PANEL.");

    static private final SubLString $str_alt479$PARSE_CYBLACK_DEFBB_ON_STARTUP___ = makeString("PARSE-CYBLACK-DEFBB-ON-STARTUP: ~S is not a valid on-startup expression. ~\n     A list of the form (:ON-STARTUP <sexpr>*) was expected.");

    static private final SubLString $str_alt480$PARSE_CYBLACK_DEFBB_ON_SHUTDOWN__ = makeString("PARSE-CYBLACK-DEFBB-ON-SHUTDOWN: ~S is not a valid on-shutdown expression. ~\n     A list of the form (:ON-SHUTDOWN <sexpr>*) was expected.");

    static private final SubLString $str_alt481$CYBLACK_SET_BLACKBOARD_INFO___S_i = makeString("CYBLACK-SET-BLACKBOARD-INFO: ~S is not a non nil symbol.");

    static private final SubLString $str_alt482$CYBLACK_SET_BLACKBOARD_INFO___S_i = makeString("CYBLACK-SET-BLACKBOARD-INFO: ~S is not an instance of CYBLACK-BLACKBOARD-INFO.");

    private static final SubLSymbol $CYBLACK_BLACKBOARD_INFO = makeKeyword("CYBLACK-BLACKBOARD-INFO");

    static private final SubLString $str_alt484$CYBLACK_GET_BLACKBOARD_INFO___S_i = makeString("CYBLACK-GET-BLACKBOARD-INFO: ~S is not a non nil symbol.");

    static private final SubLString $str_alt485$CYBLACK_GET_BLACKBOARD_INFO___S_i = makeString("CYBLACK-GET-BLACKBOARD-INFO: ~S is not an instance of CYBLACK-BLACKBOARD-INFO.");

    private static final SubLSymbol CYBLACK_BLACKBOARD_INFO = makeSymbol("CYBLACK-BLACKBOARD-INFO");

    static private final SubLList $list_alt487 = list(new SubLObject[]{ list(makeSymbol("BLACKBOARD-CLASS-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSED-BODY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BLACKBOARD-CLASS-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BLACKBOARD-CLASS-NAME"), list(makeSymbol("NEW-CLASS-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSED-BODY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARSED-BODY"), list(makeSymbol("NEW-PARSED-BODY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-SUBTYPE-EXPRESSIONS"), NIL, makeKeyword("PUBLIC")) });





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BLACKBOARD_INFO_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BLACKBOARD-INFO-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BLACKBOARD_INFO_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BLACKBOARD-INFO-INSTANCE");

    static private final SubLList $list_alt492 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD-CLASS-NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PARSED-BODY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym493$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BLACKBOARD-INFO-METHOD");

    private static final SubLSymbol CYBLACK_BLACKBOARD_INFO_INITIALIZE_METHOD = makeSymbol("CYBLACK-BLACKBOARD-INFO-INITIALIZE-METHOD");

    static private final SubLList $list_alt495 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-BLACKBOARD-INFO: ~S, ~S>"), makeSymbol("BLACKBOARD-CLASS-NAME"), makeSymbol("PARSED-BODY")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym496$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BLACKBOARD-INFO-METHOD");

    static private final SubLString $str_alt497$__CYBLACK_BLACKBOARD_INFO___S___S = makeString("#<CYBLACK-BLACKBOARD-INFO: ~S, ~S>");

    private static final SubLSymbol CYBLACK_BLACKBOARD_INFO_PRINT_METHOD = makeSymbol("CYBLACK-BLACKBOARD-INFO-PRINT-METHOD");

    private static final SubLSymbol GET_BLACKBOARD_CLASS_NAME = makeSymbol("GET-BLACKBOARD-CLASS-NAME");

    static private final SubLList $list_alt500 = list(list(RET, makeSymbol("BLACKBOARD-CLASS-NAME")));

    private static final SubLSymbol CYBLACK_BLACKBOARD_INFO_GET_BLACKBOARD_CLASS_NAME_METHOD = makeSymbol("CYBLACK-BLACKBOARD-INFO-GET-BLACKBOARD-CLASS-NAME-METHOD");

    private static final SubLSymbol SET_BLACKBOARD_CLASS_NAME = makeSymbol("SET-BLACKBOARD-CLASS-NAME");

    static private final SubLList $list_alt503 = list(makeSymbol("NEW-CLASS-NAME"));

    static private final SubLList $list_alt504 = list(list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-CLASS-NAME")), makeString("(SET-BLACKBOARD-CLASS-NAME: ~S is not a symbol.  Class names must be symbols."), makeSymbol("SELF"), makeSymbol("NEW-CLASS-NAME")), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD-CLASS-NAME"), makeSymbol("NEW-CLASS-NAME")), list(RET, makeSymbol("NEW-CLASS-NAME")));

    static private final SubLSymbol $sym505$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BLACKBOARD-INFO-METHOD");

    static private final SubLString $str_alt506$_SET_BLACKBOARD_CLASS_NAME___S_is = makeString("(SET-BLACKBOARD-CLASS-NAME: ~S is not a symbol.  Class names must be symbols.");

    private static final SubLSymbol CYBLACK_BLACKBOARD_INFO_SET_BLACKBOARD_CLASS_NAME_METHOD = makeSymbol("CYBLACK-BLACKBOARD-INFO-SET-BLACKBOARD-CLASS-NAME-METHOD");

    private static final SubLSymbol GET_PARSED_BODY = makeSymbol("GET-PARSED-BODY");

    static private final SubLList $list_alt509 = list(list(RET, makeSymbol("PARSED-BODY")));

    private static final SubLSymbol CYBLACK_BLACKBOARD_INFO_GET_PARSED_BODY_METHOD = makeSymbol("CYBLACK-BLACKBOARD-INFO-GET-PARSED-BODY-METHOD");

    private static final SubLSymbol SET_PARSED_BODY = makeSymbol("SET-PARSED-BODY");

    static private final SubLList $list_alt512 = list(makeSymbol("NEW-PARSED-BODY"));

    static private final SubLList $list_alt513 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PARSED-BODY")), list(makeSymbol("CYBLACK-DEFBB-BODY-P"), makeSymbol("NEW-PARSED-BODY"))), makeString("(SET-PARSED-BODY ~S): ~S is not an instance of CYBLACK-DEFBB-BODY."), makeSymbol("SELF"), makeSymbol("NEW-PARSED-BODY")), list(makeSymbol("CSETQ"), makeSymbol("PARSED-BODY"), makeSymbol("NEW-PARSED-BODY")), list(RET, makeSymbol("NEW-PARSED-BODY")));

    static private final SubLSymbol $sym514$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BLACKBOARD-INFO-METHOD");

    static private final SubLString $str_alt515$_SET_PARSED_BODY__S____S_is_not_a = makeString("(SET-PARSED-BODY ~S): ~S is not an instance of CYBLACK-DEFBB-BODY.");

    private static final SubLSymbol CYBLACK_BLACKBOARD_INFO_SET_PARSED_BODY_METHOD = makeSymbol("CYBLACK-BLACKBOARD-INFO-SET-PARSED-BODY-METHOD");

    static private final SubLList $list_alt517 = list(list(makeSymbol("PWHEN"), makeSymbol("PARSED-BODY"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("COMPILE-TO-SUBTYPE-EXPRESSIONS"), makeSymbol("CYBLACK-DEFBB-BODY")), makeSymbol("PARSED-BODY")))), list(RET, NIL));

    static private final SubLSymbol $sym518$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BLACKBOARD-INFO-METHOD");

    private static final SubLSymbol CYBLACK_BLACKBOARD_INFO_COMPILE_TO_SUBTYPE_EXPRESSIONS_METHOD = makeSymbol("CYBLACK-BLACKBOARD-INFO-COMPILE-TO-SUBTYPE-EXPRESSIONS-METHOD");





    private static final SubLSymbol CYBLACK_RECORD_BLACKBOARD_INFO = makeSymbol("CYBLACK-RECORD-BLACKBOARD-INFO");



    static private final SubLList $list_alt524 = list(cons(makeSymbol("BLACKBOARD-NAME"), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_defbb_file();
    }

    public void initializeVariables() {
        init_cyblack_defbb_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_defbb_file();
    }
}

