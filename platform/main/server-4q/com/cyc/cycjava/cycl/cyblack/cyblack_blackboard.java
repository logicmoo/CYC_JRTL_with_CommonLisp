/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
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
 *  module:      CYBLACK-BLACKBOARD
 *  source file: /cyc/top/cycl/cyblack/cyblack-blackboard.lisp
 *  created:     2019/07/03 17:38:44
 */
public final class cyblack_blackboard extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_blackboard() {
    }

    public static final SubLFile me = new cyblack_blackboard();


    // // Definitions
    public static final SubLObject cyblack_blackboard_p(SubLObject v_cyblack_blackboard) {
        return interfaces.subloop_instanceof_interface(v_cyblack_blackboard, CYBLACK_BLACKBOARD);
    }

    public static final SubLObject get_cyblack_basic_blackboard_root_panels(SubLObject cyblack_basic_blackboard) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_blackboard, FOUR_INTEGER, ROOT_PANELS);
    }

    public static final SubLObject set_cyblack_basic_blackboard_root_panels(SubLObject cyblack_basic_blackboard, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_blackboard, value, FOUR_INTEGER, ROOT_PANELS);
    }

    public static final SubLObject get_cyblack_basic_blackboard_cached_datatype_dictionary(SubLObject cyblack_basic_blackboard) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_blackboard, THREE_INTEGER, CACHED_DATATYPE_DICTIONARY);
    }

    public static final SubLObject set_cyblack_basic_blackboard_cached_datatype_dictionary(SubLObject cyblack_basic_blackboard, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_blackboard, value, THREE_INTEGER, CACHED_DATATYPE_DICTIONARY);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_blackboard_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_blackboard_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BLACKBOARD, CACHED_DATATYPE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BLACKBOARD, ROOT_PANELS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_blackboard_p(SubLObject cyblack_basic_blackboard) {
        return classes.subloop_instanceof_class(cyblack_basic_blackboard, CYBLACK_BASIC_BLACKBOARD);
    }

    public static final SubLObject cyblack_basic_blackboard_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_blackboard_method = NIL;
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_application) || (NIL != cyblack_application.cyblack_application_p(new_application)))) {
                                Errors.error($str_alt23$_SET_APPLICATION__S____S_is_not_a, self, new_application);
                            }
                        }
                        application = new_application;
                        sublisp_throw($sym22$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD, new_application);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_blackboard_method = Errors.handleThrowable(ccatch_env_var, $sym22$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD);
                }
                return catch_var_for_cyblack_basic_blackboard_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_blackboard_get_datatype_dictionary_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_blackboard_method = NIL;
            SubLObject cached_datatype_dictionary = get_cyblack_basic_blackboard_cached_datatype_dictionary(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            SubLObject isolated_p = object.get_object_isolated_p(self);
            try {
                try {
                    if (NIL != cached_datatype_dictionary) {
                        if (NIL != instances.get_slot(cached_datatype_dictionary, ISOLATED_P)) {
                            {
                                SubLObject application_1 = cyblack_object.cyblack_object_get_application_method(self);
                                if (NIL != application_1) {
                                    cached_datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application_1);
                                    sublisp_throw($sym28$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD, cached_datatype_dictionary);
                                }
                            }
                        } else {
                            sublisp_throw($sym28$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD, cached_datatype_dictionary);
                        }
                    } else {
                        {
                            SubLObject application_2 = cyblack_object.cyblack_object_get_application_method(self);
                            if (NIL != application_2) {
                                cached_datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application_2);
                                sublisp_throw($sym28$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD, cached_datatype_dictionary);
                            }
                        }
                    }
                    sublisp_throw($sym28$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_blackboard_cached_datatype_dictionary(self, cached_datatype_dictionary);
                            cyblack_object.set_cyblack_object_application(self, application);
                            object.set_object_isolated_p(self, isolated_p);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_blackboard_method = Errors.handleThrowable(ccatch_env_var, $sym28$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD);
            }
            return catch_var_for_cyblack_basic_blackboard_method;
        }
    }

    public static final SubLObject cyblack_basic_blackboard_post_method(SubLObject self, SubLObject internal_or_external_posting_representation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt33$___POST__S___Posting__S_, self, internal_or_external_posting_representation);
            }
            if (NIL != cyblack_posting.cyblack_posting_p(internal_or_external_posting_representation)) {
                return cyblack_basic_blackboard_post_internal_method(self, internal_or_external_posting_representation);
            } else {
                {
                    SubLObject posting = cyblack_basic_blackboard_parse_external_posting_method(self, internal_or_external_posting_representation);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == posting) {
                            Errors.error($str_alt34$_POST__S___Unable_to_parse_extern, self, internal_or_external_posting_representation);
                        }
                    }
                    return cyblack_basic_blackboard_post_internal_method(self, posting);
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_blackboard_post_internal_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                    Errors.error($str_alt39$_POST_INTERNAL__S____S_is_not_a_v, self, posting);
                }
            }
            {
                SubLObject posting_datatype = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(posting);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == posting_datatype) {
                        Errors.error($str_alt40$_POST_INTERNAL__S___No_datatype_i, self, posting);
                    }
                }
                {
                    SubLObject panel = cyblack_datatype.cyblack_datatype_get_panel(posting_datatype, self, UNPROVIDED);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == panel) {
                            Errors.error($str_alt41$_POST_INTERNAL__S___No_panel_is_a, self, posting_datatype, posting);
                        }
                    }
                    cyblack_panel_dispatch_functions.cyblack_panel_add_posting(panel, posting);
                    return posting;
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_blackboard_parse_external_posting_method(SubLObject self, SubLObject external_posting_representation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((external_posting_representation.isCons() && (external_posting_representation.first() == $POSTING)) && external_posting_representation.rest().isCons())) {
                    Errors.error($str_alt47$_PARSE_EXTERNAL_POSTING__S____S_i, self, external_posting_representation);
                }
            }
            {
                SubLObject datatype_name = cadr(external_posting_representation);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!datatype_name.isString()) {
                        Errors.error($str_alt48$_PARSE_EXTERNAL_POSTING__S____S_i, self, datatype_name);
                    }
                }
                {
                    SubLObject datatype_dictionary = cyblack_basic_blackboard_get_datatype_dictionary_method(self);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == datatype_dictionary) {
                            Errors.error($str_alt49$_PARSE_EXTERNAL_POSTING__S___No_d, self, self);
                        }
                    }
                    {
                        SubLObject datatype = cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, datatype_name, UNPROVIDED);
                        SubLObject posting = cyblack_datatype.cyblack_datatype_create_panel(datatype, self);
                        cyblack_posting_dispatch_functions.cyblack_posting_internalize_external_representation(posting, cddr(external_posting_representation));
                        return posting;
                    }
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_blackboard_unpost_method(SubLObject self, SubLObject internal_or_external_posting_representation) {
        {
            SubLObject posting = (NIL != cyblack_global_posting_table.cyblack_posting_id_p(internal_or_external_posting_representation)) ? ((SubLObject) (cyblack_basic_blackboard_get_posting_method(self, internal_or_external_posting_representation))) : NIL != cyblack_posting.cyblack_posting_p(internal_or_external_posting_representation) ? ((SubLObject) (internal_or_external_posting_representation)) : cyblack_basic_blackboard_parse_external_posting_method(self, internal_or_external_posting_representation);
            if (NIL != cyblack_posting.cyblack_posting_p(posting)) {
                return cyblack_basic_blackboard_unpost_internal_method(self, posting);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_blackboard_unpost_internal_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject posting_datatype = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(posting);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == posting_datatype) {
                        Errors.error($str_alt56$_UNPOST_INTERNAL__S___No_datatype, self, posting);
                    }
                }
                {
                    SubLObject panel = cyblack_datatype.cyblack_datatype_get_panel(posting_datatype, self, UNPROVIDED);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == panel) {
                            Errors.error($str_alt57$_UNPOST_INTERNAL__S___No_panel_is, self, posting_datatype, posting);
                        }
                    }
                    cyblack_panel_dispatch_functions.cyblack_panel_remove_posting(panel, posting);
                    return posting;
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_blackboard_get_posting_method(SubLObject self, SubLObject posting_id) {
        {
            SubLObject catch_var_for_cyblack_basic_blackboard_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL != application) {
                        sublisp_throw($sym62$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD, cyblack_application.cyblack_application_get_posting(application, posting_id));
                    }
                    sublisp_throw($sym62$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_blackboard_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD);
            }
            return catch_var_for_cyblack_basic_blackboard_method;
        }
    }

    public static final SubLObject cyblack_basic_blackboard_get_panel_method(SubLObject self, SubLObject datatype) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype.cyblack_datatype_p(datatype)) {
                    Errors.error($str_alt67$_GET_PANEL__S____S_is_not_a_valid, self, datatype);
                }
            }
            return cyblack_datatype.cyblack_datatype_get_panel(datatype, self, UNPROVIDED);
        }
    }

    public static final SubLObject cyblack_basic_blackboard_get_panels_method(SubLObject self, SubLObject datatype_bag) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_datatype.cyblack_datatype_bag_p(datatype_bag)) {
                    Errors.error($str_alt72$_GET_PANELS__S____S_is_not_an_ins, self, datatype_bag);
                }
            }
            {
                SubLObject panels = NIL;
                SubLObject bag_contents = subloop_collections.basic_bag_get_unique_elements_method(datatype_bag);
                SubLObject list_expression = bag_contents;
                if (NIL == list_expression) {
                    panels = NIL;
                } else
                    if (list_expression.isAtom()) {
                        panels = list(list_expression);
                    } else
                        if (NIL == list_expression.rest()) {
                            {
                                SubLObject datatype = list_expression.first();
                                panels = list_utilities.list_if(cyblack_datatype.cyblack_datatype_get_panel(datatype, self, UNPROVIDED));
                            }
                        } else {
                            {
                                SubLObject tail_cons = NIL;
                                SubLObject result = NIL;
                                panels = NIL;
                                {
                                    SubLObject cdolist_list_var = list_expression;
                                    SubLObject datatype = NIL;
                                    for (datatype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datatype = cdolist_list_var.first()) {
                                        result = list_utilities.list_if(cyblack_datatype.cyblack_datatype_get_panel(datatype, self, UNPROVIDED));
                                        if (NIL != result) {
                                            if (NIL != tail_cons) {
                                                rplacd(tail_cons, result);
                                                tail_cons = last(result, UNPROVIDED);
                                            } else {
                                                panels = list_utilities.list_if(cyblack_datatype.cyblack_datatype_get_panel(datatype, self, UNPROVIDED));
                                                tail_cons = last(panels, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }


                return bag_contents;
            }
        }
    }

    public static final SubLObject cyblack_basic_blackboard_get_all_panels_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_blackboard_method = NIL;
            SubLObject root_panels = get_cyblack_basic_blackboard_root_panels(self);
            try {
                try {
                    {
                        SubLObject root_panels_3 = cyblack_basic_blackboard_get_root_panels_method(self);
                        SubLObject collected_panels = copy_list(root_panels_3);
                        SubLObject cdolist_list_var = root_panels_3;
                        SubLObject root_panel = NIL;
                        for (root_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , root_panel = cdolist_list_var.first()) {
                            collected_panels = nconc(methods.funcall_instance_method_with_1_args(root_panel, GET_ALL_SUB_PANELS, collected_panels), collected_panels);
                        }
                        sublisp_throw($sym76$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD, collected_panels);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_blackboard_root_panels(self, root_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_blackboard_method = Errors.handleThrowable(ccatch_env_var, $sym76$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD);
            }
            return catch_var_for_cyblack_basic_blackboard_method;
        }
    }

    public static final SubLObject cyblack_basic_blackboard_get_root_panels_method(SubLObject self) {
        {
            SubLObject root_panels = get_cyblack_basic_blackboard_root_panels(self);
            return root_panels;
        }
    }

    public static final SubLObject cyblack_basic_blackboard_set_root_panels_method(SubLObject self, SubLObject new_root_panels) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_blackboard_method = NIL;
                SubLObject root_panels = get_cyblack_basic_blackboard_root_panels(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_root_panels.isList()) {
                                Errors.error($str_alt87$_SET_ROOT_PANELS__S____S_is_not_a, self, new_root_panels);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = new_root_panels;
                            SubLObject v_object = NIL;
                            for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == cyblack_panel.cyblack_panel_p(v_object)) {
                                        Errors.error($str_alt88$_SET_ROOT_PANELS__S____S_is_not_a, self, v_object);
                                    }
                                }
                            }
                        }
                        root_panels = new_root_panels;
                        sublisp_throw($sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD, new_root_panels);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_blackboard_root_panels(self, root_panels);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_blackboard_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD);
                }
                return catch_var_for_cyblack_basic_blackboard_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_blackboard_instantiate_panels_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datatype_dictionary = cyblack_basic_blackboard_get_datatype_dictionary_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == datatype_dictionary) {
                        Errors.error($str_alt93$_INSTANTIATE_PANELS__S___No_datat, self);
                    }
                }
                return cyblack_basic_blackboard_set_root_panels_method(self, cyblack_datatype_dictionary.cyblack_datatype_dictionary_instantiate_panels(datatype_dictionary));
            }
        }
    }

    public static final SubLObject cyblack_basic_blackboard_unify_method(SubLObject self, SubLObject precondition_pattern, SubLObject unification_robot_class) {
        if (unification_robot_class == UNPROVIDED) {
            unification_robot_class = CYBLACK_UNIFICATION_ROBOT;
        }
        {
            SubLObject unification_robot = object.new_object_instance(unification_robot_class);
            cyblack_unification.cyblack_ur_install(unification_robot, cyblack_object.cyblack_object_get_application_method(self));
            cyblack_unification.cyblack_ur_set_precondition_pattern(unification_robot, precondition_pattern);
            cyblack_unification.cyblack_ur_unify(unification_robot);
            return cyblack_unification.cyblack_ur_get_solutions(unification_robot);
        }
    }

    public static final SubLObject cyblack_basic_blackboard_unify_for_goal_satisfaction_daemon_method(SubLObject self, SubLObject satisfaction_expression) {
        {
            SubLObject unification_robot = object.new_class_instance(CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS);
            cyblack_unification.cyblack_ur_install(unification_robot, cyblack_object.cyblack_object_get_application_method(self));
            cyblack_unification.cyblack_ur_set_precondition_pattern(unification_robot, satisfaction_expression);
            cyblack_unification.cyblack_ur_unify(unification_robot);
            return cyblack_unification.cyblack_ur_get_solutions(unification_robot);
        }
    }

    public static final SubLObject cyblack_basic_blackboard_reset_method(SubLObject self) {
        {
            SubLObject all_panels = cyblack_basic_blackboard_get_all_panels_method(self);
            SubLObject cdolist_list_var = all_panels;
            SubLObject panel = NIL;
            for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                methods.funcall_instance_method_with_0_args(panel, REMOVE_DIRECT_POSTINGS);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_blackboard_on_startup_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                cyblack_object.cyblack_object_on_startup_method(self);
                if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                    format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt111$___ON_STARTUP__S___application___, application);
                }
                {
                    SubLObject new_root_panels = cyblack_basic_blackboard_instantiate_panels_method(self);
                    cyblack_basic_blackboard_set_root_panels_method(self, new_root_panels);
                    {
                        SubLObject cdolist_list_var = new_root_panels;
                        SubLObject panel = NIL;
                        for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                            methods.funcall_instance_method_with_1_args(panel, SET_APPLICATION, application);
                            methods.funcall_instance_method_with_0_args(panel, ON_STARTUP);
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_basic_blackboard_on_shutdown_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_blackboard_method = NIL;
            SubLObject root_panels = get_cyblack_basic_blackboard_root_panels(self);
            try {
                try {
                    {
                        SubLObject cdolist_list_var = root_panels;
                        SubLObject panel = NIL;
                        for (panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , panel = cdolist_list_var.first()) {
                            methods.funcall_instance_method_with_0_args(panel, ON_SHUTDOWN);
                        }
                        cyblack_object.cyblack_object_on_shutdown_method(self);
                        sublisp_throw($sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_blackboard_root_panels(self, root_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_blackboard_method = Errors.handleThrowable(ccatch_env_var, $sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD);
            }
            return catch_var_for_cyblack_basic_blackboard_method;
        }
    }

    public static final SubLObject cyblack_blackboard_get_root_panels(SubLObject v_cyblack_blackboard) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard_p(v_cyblack_blackboard)) {
                    Errors.error($str_alt117$CYBLACK_BLACKBOARD_GET_ROOT_PANEL, v_cyblack_blackboard);
                }
            }
            if (NIL != cyblack_basic_blackboard_p(v_cyblack_blackboard)) {
                return cyblack_basic_blackboard_get_root_panels_method(v_cyblack_blackboard);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_blackboard, GET_ROOT_PANELS);
            }
        }
    }

    public static final SubLObject cyblack_blackboard_instantiate_panels(SubLObject v_cyblack_blackboard) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard_p(v_cyblack_blackboard)) {
                    Errors.error($str_alt118$CYBLACK_BLACKBOARD_INSTANTIATE_PA, v_cyblack_blackboard);
                }
            }
            if (NIL != cyblack_basic_blackboard_p(v_cyblack_blackboard)) {
                return cyblack_basic_blackboard_instantiate_panels_method(v_cyblack_blackboard);
            } else {
                return methods.funcall_instance_method_with_0_args(v_cyblack_blackboard, INSTANTIATE_PANELS);
            }
        }
    }

    public static final SubLObject cyblack_blackboard_post(SubLObject v_cyblack_blackboard, SubLObject internal_or_external_posting_representation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard_p(v_cyblack_blackboard)) {
                    Errors.error($str_alt119$CYBLACK_BLACKBOARD_POST___S_is_no, v_cyblack_blackboard);
                }
            }
            if (NIL != cyblack_basic_blackboard_p(v_cyblack_blackboard)) {
                return cyblack_basic_blackboard_post_method(v_cyblack_blackboard, internal_or_external_posting_representation);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_blackboard, POST, internal_or_external_posting_representation);
            }
        }
    }

    public static final SubLObject cyblack_blackboard_unpost(SubLObject v_cyblack_blackboard, SubLObject internal_or_external_posting_representation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard_p(v_cyblack_blackboard)) {
                    Errors.error($str_alt120$CYBLACK_BLACKBOARD_UNPOST___S_is_, v_cyblack_blackboard);
                }
            }
            if (NIL != cyblack_basic_blackboard_p(v_cyblack_blackboard)) {
                return cyblack_basic_blackboard_unpost_method(v_cyblack_blackboard, internal_or_external_posting_representation);
            } else {
                return methods.funcall_instance_method_with_1_args(v_cyblack_blackboard, UNPOST, internal_or_external_posting_representation);
            }
        }
    }

    public static final SubLObject declare_cyblack_blackboard_file() {
        declareFunction("cyblack_blackboard_p", "CYBLACK-BLACKBOARD-P", 1, 0, false);
        declareFunction("get_cyblack_basic_blackboard_root_panels", "GET-CYBLACK-BASIC-BLACKBOARD-ROOT-PANELS", 1, 0, false);
        declareFunction("set_cyblack_basic_blackboard_root_panels", "SET-CYBLACK-BASIC-BLACKBOARD-ROOT-PANELS", 2, 0, false);
        declareFunction("get_cyblack_basic_blackboard_cached_datatype_dictionary", "GET-CYBLACK-BASIC-BLACKBOARD-CACHED-DATATYPE-DICTIONARY", 1, 0, false);
        declareFunction("set_cyblack_basic_blackboard_cached_datatype_dictionary", "SET-CYBLACK-BASIC-BLACKBOARD-CACHED-DATATYPE-DICTIONARY", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_blackboard_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BLACKBOARD-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_blackboard_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BLACKBOARD-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_blackboard_p", "CYBLACK-BASIC-BLACKBOARD-P", 1, 0, false);
        declareFunction("cyblack_basic_blackboard_set_application_method", "CYBLACK-BASIC-BLACKBOARD-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_blackboard_get_datatype_dictionary_method", "CYBLACK-BASIC-BLACKBOARD-GET-DATATYPE-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_blackboard_post_method", "CYBLACK-BASIC-BLACKBOARD-POST-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_blackboard_post_internal_method", "CYBLACK-BASIC-BLACKBOARD-POST-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_blackboard_parse_external_posting_method", "CYBLACK-BASIC-BLACKBOARD-PARSE-EXTERNAL-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_blackboard_unpost_method", "CYBLACK-BASIC-BLACKBOARD-UNPOST-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_blackboard_unpost_internal_method", "CYBLACK-BASIC-BLACKBOARD-UNPOST-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_blackboard_get_posting_method", "CYBLACK-BASIC-BLACKBOARD-GET-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_blackboard_get_panel_method", "CYBLACK-BASIC-BLACKBOARD-GET-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_blackboard_get_panels_method", "CYBLACK-BASIC-BLACKBOARD-GET-PANELS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_blackboard_get_all_panels_method", "CYBLACK-BASIC-BLACKBOARD-GET-ALL-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_blackboard_get_root_panels_method", "CYBLACK-BASIC-BLACKBOARD-GET-ROOT-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_blackboard_set_root_panels_method", "CYBLACK-BASIC-BLACKBOARD-SET-ROOT-PANELS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_blackboard_instantiate_panels_method", "CYBLACK-BASIC-BLACKBOARD-INSTANTIATE-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_blackboard_unify_method", "CYBLACK-BASIC-BLACKBOARD-UNIFY-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_blackboard_unify_for_goal_satisfaction_daemon_method", "CYBLACK-BASIC-BLACKBOARD-UNIFY-FOR-GOAL-SATISFACTION-DAEMON-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_blackboard_reset_method", "CYBLACK-BASIC-BLACKBOARD-RESET-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_blackboard_on_startup_method", "CYBLACK-BASIC-BLACKBOARD-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_blackboard_on_shutdown_method", "CYBLACK-BASIC-BLACKBOARD-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_blackboard_get_root_panels", "CYBLACK-BLACKBOARD-GET-ROOT-PANELS", 1, 0, false);
        declareFunction("cyblack_blackboard_instantiate_panels", "CYBLACK-BLACKBOARD-INSTANTIATE-PANELS", 1, 0, false);
        declareFunction("cyblack_blackboard_post", "CYBLACK-BLACKBOARD-POST", 2, 0, false);
        declareFunction("cyblack_blackboard_unpost", "CYBLACK-BLACKBOARD-UNPOST", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_blackboard_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_blackboard_file() {
                interfaces.new_interface(CYBLACK_BLACKBOARD, CYBLACK_COMPONENT, $list_alt2, $list_alt3);
        classes.subloop_new_class(CYBLACK_BASIC_BLACKBOARD, CYBLACK_OBJECT, $list_alt6, NIL, $list_alt7);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_BLACKBOARD, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_BLACKBOARD, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BLACKBOARD_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_BLACKBOARD, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BLACKBOARD_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_blackboard_class(CYBLACK_BASIC_BLACKBOARD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_BASIC_BLACKBOARD, $list_alt19, $list_alt20, $list_alt21);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, SET_APPLICATION, CYBLACK_BASIC_BLACKBOARD_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE_DICTIONARY, CYBLACK_BASIC_BLACKBOARD, $list_alt26, NIL, $list_alt27);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, GET_DATATYPE_DICTIONARY, CYBLACK_BASIC_BLACKBOARD_GET_DATATYPE_DICTIONARY_METHOD);
        methods.methods_incorporate_instance_method(POST, CYBLACK_BASIC_BLACKBOARD, $list_alt19, $list_alt31, $list_alt32);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, POST, CYBLACK_BASIC_BLACKBOARD_POST_METHOD);
        methods.methods_incorporate_instance_method(POST_INTERNAL, CYBLACK_BASIC_BLACKBOARD, $list_alt26, $list_alt37, $list_alt38);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, POST_INTERNAL, CYBLACK_BASIC_BLACKBOARD_POST_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(PARSE_EXTERNAL_POSTING, CYBLACK_BASIC_BLACKBOARD, $list_alt26, $list_alt44, $list_alt45);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, PARSE_EXTERNAL_POSTING, CYBLACK_BASIC_BLACKBOARD_PARSE_EXTERNAL_POSTING_METHOD);
        methods.methods_incorporate_instance_method(UNPOST, CYBLACK_BASIC_BLACKBOARD, $list_alt19, $list_alt31, $list_alt52);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, UNPOST, CYBLACK_BASIC_BLACKBOARD_UNPOST_METHOD);
        methods.methods_incorporate_instance_method(UNPOST_INTERNAL, CYBLACK_BASIC_BLACKBOARD, $list_alt26, $list_alt37, $list_alt55);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, UNPOST_INTERNAL, CYBLACK_BASIC_BLACKBOARD_UNPOST_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING, CYBLACK_BASIC_BLACKBOARD, $list_alt19, $list_alt60, $list_alt61);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, GET_POSTING, CYBLACK_BASIC_BLACKBOARD_GET_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL, CYBLACK_BASIC_BLACKBOARD, $list_alt19, $list_alt65, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, GET_PANEL, CYBLACK_BASIC_BLACKBOARD_GET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(GET_PANELS, CYBLACK_BASIC_BLACKBOARD, $list_alt19, $list_alt70, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, GET_PANELS, CYBLACK_BASIC_BLACKBOARD_GET_PANELS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_PANELS, CYBLACK_BASIC_BLACKBOARD, $list_alt19, NIL, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, GET_ALL_PANELS, CYBLACK_BASIC_BLACKBOARD_GET_ALL_PANELS_METHOD);
        methods.methods_incorporate_instance_method(GET_ROOT_PANELS, CYBLACK_BASIC_BLACKBOARD, $list_alt80, NIL, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, GET_ROOT_PANELS, CYBLACK_BASIC_BLACKBOARD_GET_ROOT_PANELS_METHOD);
        methods.methods_incorporate_instance_method(SET_ROOT_PANELS, CYBLACK_BASIC_BLACKBOARD, $list_alt19, $list_alt84, $list_alt85);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, SET_ROOT_PANELS, CYBLACK_BASIC_BLACKBOARD_SET_ROOT_PANELS_METHOD);
        methods.methods_incorporate_instance_method(INSTANTIATE_PANELS, CYBLACK_BASIC_BLACKBOARD, $list_alt91, NIL, $list_alt92);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, INSTANTIATE_PANELS, CYBLACK_BASIC_BLACKBOARD_INSTANTIATE_PANELS_METHOD);
        methods.methods_incorporate_instance_method(UNIFY, CYBLACK_BASIC_BLACKBOARD, $list_alt19, $list_alt96, $list_alt97);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, UNIFY, CYBLACK_BASIC_BLACKBOARD_UNIFY_METHOD);
        methods.methods_incorporate_instance_method(UNIFY_FOR_GOAL_SATISFACTION_DAEMON, CYBLACK_BASIC_BLACKBOARD, $list_alt19, $list_alt101, $list_alt102);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, UNIFY_FOR_GOAL_SATISFACTION_DAEMON, $sym104$CYBLACK_BASIC_BLACKBOARD_UNIFY_FOR_GOAL_SATISFACTION_DAEMON_METHO);
        methods.methods_incorporate_instance_method(RESET, CYBLACK_BASIC_BLACKBOARD, $list_alt19, NIL, $list_alt106);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, RESET, CYBLACK_BASIC_BLACKBOARD_RESET_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_BASIC_BLACKBOARD, $list_alt80, NIL, $list_alt110);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, ON_STARTUP, CYBLACK_BASIC_BLACKBOARD_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_BASIC_BLACKBOARD, $list_alt19, NIL, $list_alt114);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BLACKBOARD, ON_SHUTDOWN, CYBLACK_BASIC_BLACKBOARD_ON_SHUTDOWN_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_BLACKBOARD = makeSymbol("CYBLACK-BLACKBOARD");



    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST"), list(makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNPOST"), list(makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL"), list(makeSymbol("DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANELS"), list(makeSymbol("DATATYPE-BAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ROOT-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ROOT-PANELS"), list(makeSymbol("NEW-ROOT-PANELS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTANTIATE-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNIFY"), list(makeSymbol("PRECONDITION-PATTERN"), makeSymbol("&OPTIONAL"), list(makeSymbol("UNIFICATION-ROBOT-CLASS"), list(QUOTE, makeSymbol("CYBLACK-UNIFICATION-ROBOT")))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNIFY-FOR-GOAL-SATISFACTION-DAEMON"), list(makeSymbol("SATISFACTION-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET"), NIL, makeKeyword("PUBLIC")) });





    static private final SubLList $list_alt6 = list(makeSymbol("CYBLACK-BLACKBOARD"));

    static private final SubLList $list_alt7 = list(new SubLObject[]{ list(makeSymbol("CACHED-DATATYPE-DICTIONARY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ROOT-PANELS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE-DICTIONARY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST"), list(makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST-INTERNAL"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARSE-EXTERNAL-POSTING"), list(makeSymbol("EXTERNAL-POSTING-REPRESENTATION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNPOST"), list(makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNPOST-INTERNAL"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING"), list(makeSymbol("POSTING-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL"), list(makeSymbol("DATATYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANELS"), list(makeSymbol("DATATYPE-BAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ROOT-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ROOT-PANELS"), list(makeSymbol("NEW-ROOT-PANELS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTANTIATE-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNIFY"), list(makeSymbol("PRECONDITION-PATTERN"), makeSymbol("&OPTIONAL"), list(makeSymbol("UNIFICATION-ROBOT-CLASS"), list(QUOTE, makeSymbol("CYBLACK-UNIFICATION-ROBOT")))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNIFY-FOR-GOAL-SATISFACTION-DAEMON"), list(makeSymbol("SATISFACTION-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")) });









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BLACKBOARD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BLACKBOARD-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BLACKBOARD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BLACKBOARD-INSTANCE");



    static private final SubLList $list_alt19 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt20 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt21 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym22$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BLACKBOARD-METHOD");

    static private final SubLString $str_alt23$_SET_APPLICATION__S____S_is_not_a = makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION.");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt26 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt27 = list(list(makeSymbol("PIF"), makeSymbol("CACHED-DATATYPE-DICTIONARY"), list(makeSymbol("PIF"), list(makeSymbol("GET-SLOT"), makeSymbol("CACHED-DATATYPE-DICTIONARY"), list(QUOTE, makeSymbol("ISOLATED-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("APPLICATION"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("APPLICATION"), list(makeSymbol("CSETQ"), makeSymbol("CACHED-DATATYPE-DICTIONARY"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeSymbol("APPLICATION"))), list(RET, makeSymbol("CACHED-DATATYPE-DICTIONARY")))), list(RET, makeSymbol("CACHED-DATATYPE-DICTIONARY"))), list(makeSymbol("CLET"), list(list(makeSymbol("APPLICATION"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("APPLICATION"), list(makeSymbol("CSETQ"), makeSymbol("CACHED-DATATYPE-DICTIONARY"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeSymbol("APPLICATION"))), list(RET, makeSymbol("CACHED-DATATYPE-DICTIONARY"))))), list(RET, NIL));

    static private final SubLSymbol $sym28$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BLACKBOARD-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_GET_DATATYPE_DICTIONARY_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-GET-DATATYPE-DICTIONARY-METHOD");



    static private final SubLList $list_alt31 = list(makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION"));

    static private final SubLList $list_alt32 = list(list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(POST ~S): Posting ~S."), makeSymbol("SELF"), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%(POST ~S): Posting ~S."), makeSymbol("SELF"), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION"))), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")), list(RET, list(makeSymbol("POST-INTERNAL"), makeSymbol("SELF"), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION"))), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING"), list(makeSymbol("PARSE-EXTERNAL-POSTING"), makeSymbol("SELF"), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")))), list(makeSymbol("MUST"), makeSymbol("POSTING"), makeString("(POST ~S): Unable to parse external posting ~S."), makeSymbol("SELF"), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")), list(RET, list(makeSymbol("POST-INTERNAL"), makeSymbol("SELF"), makeSymbol("POSTING"))))));

    static private final SubLString $str_alt33$___POST__S___Posting__S_ = makeString("~%(POST ~S): Posting ~S.");

    static private final SubLString $str_alt34$_POST__S___Unable_to_parse_extern = makeString("(POST ~S): Unable to parse external posting ~S.");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_POST_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-POST-METHOD");

    private static final SubLSymbol POST_INTERNAL = makeSymbol("POST-INTERNAL");

    static private final SubLList $list_alt37 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(POST-INTERNAL ~S): ~S is not a valid posting."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING-DATATYPE"), list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("POSTING")))), list(makeSymbol("MUST"), makeSymbol("POSTING-DATATYPE"), makeString("(POST-INTERNAL ~S): No datatype is associated with posting ~S."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("PANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("POSTING-DATATYPE"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("PANEL"), makeString("(POST-INTERNAL ~S): No panel is associated with datatype ~S of posting ~S."), makeSymbol("SELF"), makeSymbol("POSTING-DATATYPE"), makeSymbol("POSTING")), list(makeSymbol("CYBLACK-PANEL-ADD-POSTING"), makeSymbol("PANEL"), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING")))));

    static private final SubLString $str_alt39$_POST_INTERNAL__S____S_is_not_a_v = makeString("(POST-INTERNAL ~S): ~S is not a valid posting.");

    static private final SubLString $str_alt40$_POST_INTERNAL__S___No_datatype_i = makeString("(POST-INTERNAL ~S): No datatype is associated with posting ~S.");

    static private final SubLString $str_alt41$_POST_INTERNAL__S___No_panel_is_a = makeString("(POST-INTERNAL ~S): No panel is associated with datatype ~S of posting ~S.");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_POST_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-POST-INTERNAL-METHOD");

    private static final SubLSymbol PARSE_EXTERNAL_POSTING = makeSymbol("PARSE-EXTERNAL-POSTING");

    static private final SubLList $list_alt44 = list(makeSymbol("EXTERNAL-POSTING-REPRESENTATION"));

    static private final SubLList $list_alt45 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("CONSP"), makeSymbol("EXTERNAL-POSTING-REPRESENTATION")), list(EQ, list(makeSymbol("CAR"), makeSymbol("EXTERNAL-POSTING-REPRESENTATION")), makeKeyword("POSTING")), list(makeSymbol("CONSP"), list(makeSymbol("CDR"), makeSymbol("EXTERNAL-POSTING-REPRESENTATION")))), makeString("(PARSE-EXTERNAL-POSTING ~S): ~S is not a valid external posting."), makeSymbol("SELF"), makeSymbol("EXTERNAL-POSTING-REPRESENTATION")), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-NAME"), list(makeSymbol("CADR"), makeSymbol("EXTERNAL-POSTING-REPRESENTATION")))), list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("DATATYPE-NAME")), makeString("(PARSE-EXTERNAL-POSTING ~S): ~S is not a valid datatype name.  A string was expected."), makeSymbol("SELF"), makeSymbol("DATATYPE-NAME")), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("DATATYPE-DICTIONARY"), makeString("(PARSE-EXTERNAL-POSTING ~S): No datatype dictionary is associated with blackboard ~S."), makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeSymbol("DATATYPE-DICTIONARY"), makeSymbol("DATATYPE-NAME"))), list(makeSymbol("POSTING"), list(makeSymbol("CYBLACK-DATATYPE-CREATE-PANEL"), makeSymbol("DATATYPE"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-POSTING-INTERNALIZE-EXTERNAL-REPRESENTATION"), makeSymbol("POSTING"), list(makeSymbol("CDDR"), makeSymbol("EXTERNAL-POSTING-REPRESENTATION"))), list(RET, makeSymbol("POSTING"))))));

    private static final SubLSymbol $POSTING = makeKeyword("POSTING");

    static private final SubLString $str_alt47$_PARSE_EXTERNAL_POSTING__S____S_i = makeString("(PARSE-EXTERNAL-POSTING ~S): ~S is not a valid external posting.");

    static private final SubLString $str_alt48$_PARSE_EXTERNAL_POSTING__S____S_i = makeString("(PARSE-EXTERNAL-POSTING ~S): ~S is not a valid datatype name.  A string was expected.");

    static private final SubLString $str_alt49$_PARSE_EXTERNAL_POSTING__S___No_d = makeString("(PARSE-EXTERNAL-POSTING ~S): No datatype dictionary is associated with blackboard ~S.");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_PARSE_EXTERNAL_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-PARSE-EXTERNAL-POSTING-METHOD");

    private static final SubLSymbol UNPOST = makeSymbol("UNPOST");

    static private final SubLList $list_alt52 = list(list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%(UNPOST ~S): posting=~S."), makeSymbol("SELF"), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION"))), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING"), list(makeSymbol("FIF"), list(makeSymbol("CYBLACK-POSTING-ID-P"), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")), list(makeSymbol("GET-POSTING"), makeSymbol("SELF"), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")), list(makeSymbol("FIF"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION"), list(makeSymbol("PARSE-EXTERNAL-POSTING"), makeSymbol("SELF"), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("POSTING"), makeString("(UNPOST ~S): ~S is neither a posting, posting representation, nor a posting id corresponding to a posting."), makeSymbol("INTERNAL-OR-EXTERNAL-POSTING-REPRESENTATION")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), list(RET, list(makeSymbol("UNPOST-INTERNAL"), makeSymbol("SELF"), makeSymbol("POSTING")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_UNPOST_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-UNPOST-METHOD");

    private static final SubLSymbol UNPOST_INTERNAL = makeSymbol("UNPOST-INTERNAL");

    static private final SubLList $list_alt55 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(UNPOST-INTERNAL ~S): ~S is not a valid posting."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("POSTING-DATATYPE"), list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("POSTING")))), list(makeSymbol("MUST"), makeSymbol("POSTING-DATATYPE"), makeString("(UNPOST-INTERNAL ~S): No datatype is associated with posting ~S."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("PANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("POSTING-DATATYPE"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("PANEL"), makeString("(UNPOST-INTERNAL ~S): No panel is associated with datatype ~S of posting ~S."), makeSymbol("SELF"), makeSymbol("POSTING-DATATYPE"), makeSymbol("POSTING")), list(makeSymbol("CYBLACK-PANEL-REMOVE-POSTING"), makeSymbol("PANEL"), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING")))));

    static private final SubLString $str_alt56$_UNPOST_INTERNAL__S___No_datatype = makeString("(UNPOST-INTERNAL ~S): No datatype is associated with posting ~S.");

    static private final SubLString $str_alt57$_UNPOST_INTERNAL__S___No_panel_is = makeString("(UNPOST-INTERNAL ~S): No panel is associated with datatype ~S of posting ~S.");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_UNPOST_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-UNPOST-INTERNAL-METHOD");

    private static final SubLSymbol GET_POSTING = makeSymbol("GET-POSTING");

    static private final SubLList $list_alt60 = list(makeSymbol("POSTING-ID"));

    static private final SubLList $list_alt61 = list(list(makeSymbol("PWHEN"), makeSymbol("APPLICATION"), list(RET, list(makeSymbol("CYBLACK-APPLICATION-GET-POSTING"), makeSymbol("APPLICATION"), makeSymbol("POSTING-ID")))), list(RET, NIL));

    static private final SubLSymbol $sym62$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BLACKBOARD-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_GET_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-GET-POSTING-METHOD");



    static private final SubLList $list_alt65 = list(makeSymbol("DATATYPE"));

    static private final SubLList $list_alt66 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("DATATYPE")), makeString("(GET-PANEL ~S): ~S is not a valid datatype."), makeSymbol("SELF"), makeSymbol("DATATYPE")), list(RET, list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("DATATYPE"), makeSymbol("SELF"))));

    static private final SubLString $str_alt67$_GET_PANEL__S____S_is_not_a_valid = makeString("(GET-PANEL ~S): ~S is not a valid datatype.");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_GET_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-GET-PANEL-METHOD");



    static private final SubLList $list_alt70 = list(makeSymbol("DATATYPE-BAG"));

    static private final SubLList $list_alt71 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-DATATYPE-BAG-P"), makeSymbol("DATATYPE-BAG")), makeString("(GET-PANELS ~S): ~S is not an instance of CYBLACK-DATATYPE-BAG."), makeSymbol("SELF"), makeSymbol("DATATYPE-BAG")), list(makeSymbol("CLET"), list(list(makeSymbol("PANELS"), NIL), list(makeSymbol("BAG-CONTENTS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-UNIQUE-ELEMENTS"), makeSymbol("CYBLACK-DATATYPE-BAG")), makeSymbol("DATATYPE-BAG")))), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("DATATYPE"), makeSymbol("BAG-CONTENTS"), makeSymbol("PANELS")), list(makeSymbol("LIST-IF"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("DATATYPE"), makeSymbol("SELF")))), list(RET, makeSymbol("BAG-CONTENTS"))));

    static private final SubLString $str_alt72$_GET_PANELS__S____S_is_not_an_ins = makeString("(GET-PANELS ~S): ~S is not an instance of CYBLACK-DATATYPE-BAG.");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_GET_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-GET-PANELS-METHOD");

    private static final SubLSymbol GET_ALL_PANELS = makeSymbol("GET-ALL-PANELS");

    static private final SubLList $list_alt75 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ROOT-PANELS"), list(makeSymbol("GET-ROOT-PANELS"), makeSymbol("SELF"))), list(makeSymbol("COLLECTED-PANELS"), list(makeSymbol("COPY-LIST"), makeSymbol("ROOT-PANELS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ROOT-PANEL"), makeSymbol("ROOT-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("COLLECTED-PANELS"), list(makeSymbol("NCONC"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ROOT-PANEL"), list(QUOTE, makeSymbol("GET-ALL-SUB-PANELS")), makeSymbol("COLLECTED-PANELS")), makeSymbol("COLLECTED-PANELS")))), list(RET, makeSymbol("COLLECTED-PANELS"))));

    static private final SubLSymbol $sym76$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BLACKBOARD-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_GET_ALL_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-GET-ALL-PANELS-METHOD");

    private static final SubLSymbol GET_ROOT_PANELS = makeSymbol("GET-ROOT-PANELS");

    static private final SubLList $list_alt80 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt81 = list(list(RET, makeSymbol("ROOT-PANELS")));

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_GET_ROOT_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-GET-ROOT-PANELS-METHOD");

    private static final SubLSymbol SET_ROOT_PANELS = makeSymbol("SET-ROOT-PANELS");

    static private final SubLList $list_alt84 = list(makeSymbol("NEW-ROOT-PANELS"));

    static private final SubLList $list_alt85 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-ROOT-PANELS")), makeString("(SET-ROOT-PANELS ~S): ~S is not a valid list of panels."), makeSymbol("SELF"), makeSymbol("NEW-ROOT-PANELS")), list(makeSymbol("CDOLIST"), list(makeSymbol("OBJECT"), makeSymbol("NEW-ROOT-PANELS")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("OBJECT")), makeString("(SET-ROOT-PANELS ~S): ~S is not an instance of CYBLACK-PANEL."), makeSymbol("SELF"), makeSymbol("OBJECT"))), list(makeSymbol("CSETQ"), makeSymbol("ROOT-PANELS"), makeSymbol("NEW-ROOT-PANELS")), list(RET, makeSymbol("NEW-ROOT-PANELS")));

    static private final SubLSymbol $sym86$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BLACKBOARD-METHOD");

    static private final SubLString $str_alt87$_SET_ROOT_PANELS__S____S_is_not_a = makeString("(SET-ROOT-PANELS ~S): ~S is not a valid list of panels.");

    static private final SubLString $str_alt88$_SET_ROOT_PANELS__S____S_is_not_a = makeString("(SET-ROOT-PANELS ~S): ~S is not an instance of CYBLACK-PANEL.");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_SET_ROOT_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-SET-ROOT-PANELS-METHOD");

    private static final SubLSymbol INSTANTIATE_PANELS = makeSymbol("INSTANTIATE-PANELS");

    static private final SubLList $list_alt91 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt92 = list(list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("GET-DATATYPE-DICTIONARY"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("DATATYPE-DICTIONARY"), makeString("(INSTANTIATE-PANELS ~S): No datatype dictionary is associated with this blackboard."), makeSymbol("SELF")), list(RET, list(makeSymbol("SET-ROOT-PANELS"), makeSymbol("SELF"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INSTANTIATE-PANELS"), makeSymbol("DATATYPE-DICTIONARY"))))));

    static private final SubLString $str_alt93$_INSTANTIATE_PANELS__S___No_datat = makeString("(INSTANTIATE-PANELS ~S): No datatype dictionary is associated with this blackboard.");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_INSTANTIATE_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-INSTANTIATE-PANELS-METHOD");



    static private final SubLList $list_alt96 = list(makeSymbol("PRECONDITION-PATTERN"), makeSymbol("&OPTIONAL"), list(makeSymbol("UNIFICATION-ROBOT-CLASS"), list(QUOTE, makeSymbol("CYBLACK-UNIFICATION-ROBOT"))));

    static private final SubLList $list_alt97 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-PRECON-OR-MONITORING-PATTERN-P"), makeSymbol("PRECONDITION-PATTERN")), makeString("(UNIFY ~S): ~S is neither an instance of CYBLACK-PRECON-PATTERN nor an instance of CYBLACK-MONITOR-PATTERN."), makeSymbol("SELF"), makeSymbol("PRECONDITION-PATTERN")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("UNIFICATION-ROBOT-CLASS"), list(makeSymbol("SYMBOLP"), makeSymbol("UNIFICATION-ROBOT-CLASS"))), makeString("(UNIFY ~S): ~S is not a potential symbolic class name.  A non-nil symbol was expected."), makeSymbol("SELF"), makeSymbol("UNIFICATION-ROBOT-CLASS")), list(makeSymbol("CLET"), list(list(makeSymbol("UNIFICATION-ROBOT"), list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("UNIFICATION-ROBOT-CLASS")))), list(makeSymbol("CYBLACK-UR-INSTALL"), makeSymbol("UNIFICATION-ROBOT"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-UR-SET-PRECONDITION-PATTERN"), makeSymbol("UNIFICATION-ROBOT"), makeSymbol("PRECONDITION-PATTERN")), list(makeSymbol("CYBLACK-UR-UNIFY"), makeSymbol("UNIFICATION-ROBOT")), list(RET, list(makeSymbol("CYBLACK-UR-GET-SOLUTIONS"), makeSymbol("UNIFICATION-ROBOT")))));



    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_UNIFY_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-UNIFY-METHOD");

    private static final SubLSymbol UNIFY_FOR_GOAL_SATISFACTION_DAEMON = makeSymbol("UNIFY-FOR-GOAL-SATISFACTION-DAEMON");

    static private final SubLList $list_alt101 = list(makeSymbol("SATISFACTION-EXPRESSION"));

    static private final SubLList $list_alt102 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-SATISFACTION-EXPRESSION-P"), makeSymbol("SATISFACTION-EXPRESSION")), makeString("(UNIFY-FOR-GOAL-SATISFACTION-DAEMON ~S): ~S is not an instance of CYBLACK-SATISFACTION-EXPRESSION."), makeSymbol("SELF"), makeSymbol("SATISFACTION-EXPRESSION")), list(makeSymbol("CLET"), list(list(makeSymbol("UNIFICATION-ROBOT"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS"))))), list(makeSymbol("CYBLACK-UR-INSTALL"), makeSymbol("UNIFICATION-ROBOT"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-UR-SET-PRECONDITION-PATTERN"), makeSymbol("UNIFICATION-ROBOT"), makeSymbol("SATISFACTION-EXPRESSION")), list(makeSymbol("CYBLACK-UR-UNIFY"), makeSymbol("UNIFICATION-ROBOT")), list(RET, list(makeSymbol("CYBLACK-UR-GET-SOLUTIONS"), makeSymbol("UNIFICATION-ROBOT")))));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS = makeSymbol("CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS");

    static private final SubLSymbol $sym104$CYBLACK_BASIC_BLACKBOARD_UNIFY_FOR_GOAL_SATISFACTION_DAEMON_METHO = makeSymbol("CYBLACK-BASIC-BLACKBOARD-UNIFY-FOR-GOAL-SATISFACTION-DAEMON-METHOD");



    static private final SubLList $list_alt106 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-PANELS"), list(makeSymbol("GET-ALL-PANELS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("PANEL"), makeSymbol("ALL-PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("REMOVE-DIRECT-POSTINGS"))))), list(RET, NIL));



    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_RESET_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-RESET-METHOD");



    static private final SubLList $list_alt110 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(ON-STARTUP ~S): application -> ~S"), makeSymbol("APPLICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-ROOT-PANELS"), list(makeSymbol("INSTANTIATE-PANELS"), makeSymbol("SELF")))), list(makeSymbol("SET-ROOT-PANELS"), makeSymbol("SELF"), makeSymbol("NEW-ROOT-PANELS")), list(makeSymbol("CDOLIST"), list(makeSymbol("PANEL"), makeSymbol("NEW-ROOT-PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("ON-STARTUP"))))), list(RET, NIL));

    static private final SubLString $str_alt111$___ON_STARTUP__S___application___ = makeString("~%(ON-STARTUP ~S): application -> ~S");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_ON_STARTUP_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-ON-STARTUP-METHOD");



    static private final SubLList $list_alt114 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("PANEL"), makeSymbol("ROOT-PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("ON-SHUTDOWN")))), list(makeSymbol("ON-SHUTDOWN"), makeSymbol("SUPER")), list(RET, NIL));

    static private final SubLSymbol $sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_BLACKBOARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BLACKBOARD-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BLACKBOARD_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-BASIC-BLACKBOARD-ON-SHUTDOWN-METHOD");

    static private final SubLString $str_alt117$CYBLACK_BLACKBOARD_GET_ROOT_PANEL = makeString("CYBLACK-BLACKBOARD-GET-ROOT-PANELS: ~S is not an instance of CYBLACK-BLACKBOARD.");

    static private final SubLString $str_alt118$CYBLACK_BLACKBOARD_INSTANTIATE_PA = makeString("CYBLACK-BLACKBOARD-INSTANTIATE-PANELS: ~S is not an instance of CYBLACK-BLACKBOARD.");

    static private final SubLString $str_alt119$CYBLACK_BLACKBOARD_POST___S_is_no = makeString("CYBLACK-BLACKBOARD-POST: ~S is not an instance of CYBLACK-BLACKBOARD.");

    static private final SubLString $str_alt120$CYBLACK_BLACKBOARD_UNPOST___S_is_ = makeString("CYBLACK-BLACKBOARD-UNPOST: ~S is not an instance of CYBLACK-BLACKBOARD.");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_blackboard_file();
    }

    public void initializeVariables() {
        init_cyblack_blackboard_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_blackboard_file();
    }
}

