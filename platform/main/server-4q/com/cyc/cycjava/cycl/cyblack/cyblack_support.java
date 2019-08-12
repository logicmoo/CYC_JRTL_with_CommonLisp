/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 *  module:      CYBLACK-SUPPORT
 *  source file: /cyc/top/cycl/cyblack/cyblack-support.lisp
 *  created:     2019/07/03 17:38:44
 */
public final class cyblack_support extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_support() {
    }

    public static final SubLFile me = new cyblack_support();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_support";

    // // Definitions
    public static final SubLObject cyblack_support_p(SubLObject v_cyblack_support) {
        return interfaces.subloop_instanceof_interface(v_cyblack_support, CYBLACK_SUPPORT);
    }

    public static final SubLObject cyblack_support_template_p(SubLObject cyblack_support_template) {
        return interfaces.subloop_instanceof_interface(cyblack_support_template, CYBLACK_SUPPORT_TEMPLATE);
    }

    public static final SubLObject cyblack_dependent_p(SubLObject cyblack_dependent) {
        return interfaces.subloop_instanceof_interface(cyblack_dependent, CYBLACK_DEPENDENT);
    }

    public static final SubLObject cyblack_dependent_template_p(SubLObject cyblack_dependent_template) {
        return interfaces.subloop_instanceof_interface(cyblack_dependent_template, CYBLACK_DEPENDENT_TEMPLATE);
    }

    public static final SubLObject get_cyblack_basic_support_qua_list_element_parent_links(SubLObject cyblack_basic_support) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_support, FIVE_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject set_cyblack_basic_support_qua_list_element_parent_links(SubLObject cyblack_basic_support, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_support, value, FIVE_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject get_cyblack_basic_support_qua_list_element_self_deletion_mode(SubLObject cyblack_basic_support) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_support);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_support, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_basic_support));
    }

    public static final SubLObject set_cyblack_basic_support_qua_list_element_self_deletion_mode(SubLObject cyblack_basic_support, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_support);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_support, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_basic_support, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_basic_support)));
        return value;
    }

    public static final SubLObject cyblack_basic_support_propagate_notify_method(SubLObject self) {
        {
            SubLObject collections = cyblack_basic_support_get_collections_method(self);
            SubLObject cdolist_list_var = collections;
            SubLObject collection = NIL;
            for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collection = cdolist_list_var.first()) {
                if (NIL != cyblack_dependent_p(collection)) {
                    methods.funcall_instance_method_with_0_args(collection, SUPPORT_STATE_CHANGE);
                }
                {
                    SubLObject contents = methods.funcall_instance_method_with_0_args(collection, GET_CONTENTS);
                    SubLObject cdolist_list_var_1 = contents;
                    SubLObject element = NIL;
                    for (element = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , element = cdolist_list_var_1.first()) {
                        if (NIL != cyblack_support_p(element)) {
                            methods.funcall_instance_method_with_0_args(element, PROPAGATE_NOTIFY);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_remove_all_dependents_method(SubLObject self) {
        cyblack_basic_support_delete_self_from_all_collections_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_basic_support_get_all_dependents_method(SubLObject self) {
        return cyblack_basic_support_get_collections_method(self);
    }

    public static final SubLObject cyblack_basic_support_remove_dependent_method(SubLObject self, SubLObject old_dependent) {
        methods.funcall_instance_method_with_1_args(old_dependent, REMOVE_SUPPORT_NOTIFY, self);
        cyblack_basic_support_delete_self_from_collection_method(self, old_dependent);
        return old_dependent;
    }

    public static final SubLObject cyblack_basic_support_add_dependent_method(SubLObject self, SubLObject new_dependent) {
        methods.funcall_instance_method_with_1_args(new_dependent, ADD, self);
        methods.funcall_instance_method_with_1_args(new_dependent, ADD_SUPPORT_NOTIFY, self);
        return new_dependent;
    }

    public static final SubLObject cyblack_basic_support_perform_action_method(SubLObject self, SubLObject action, SubLObject parameters) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_support_on_delete_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_support_on_add_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_support_get_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_basic_support_get_parent_links_method(self);
            SubLObject template_collections = NIL;
            SubLObject list_expression = template_parent_links;
            if (NIL == list_expression) {
                template_collections = NIL;
            } else
                if (list_expression.isAtom()) {
                    template_collections = list(list_expression);
                } else
                    if (NIL == list_expression.rest()) {
                        {
                            SubLObject template_parent_link = list_expression.first();
                            template_collections = list(subloop_collections.dlc_owner(template_parent_link));
                        }
                    } else {
                        {
                            SubLObject tail_cons = NIL;
                            SubLObject result = NIL;
                            {
                                SubLObject template_parent_link = list_expression.first();
                                template_collections = list(subloop_collections.dlc_owner(template_parent_link));
                                tail_cons = template_collections;
                            }
                            {
                                SubLObject cdolist_list_var = list_expression.rest();
                                SubLObject template_parent_link = NIL;
                                for (template_parent_link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_parent_link = cdolist_list_var.first()) {
                                    result = list(subloop_collections.dlc_owner(template_parent_link));
                                    rplacd(tail_cons, result);
                                    tail_cons = result;
                                }
                            }
                        }
                    }


            return list_utilities.unique_elements(template_collections, UNPROVIDED);
        }
    }

    public static final SubLObject cyblack_basic_support_member_p_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_basic_support_get_parent_links_method(self);
            SubLObject cdolist_list_var = template_parent_links;
            SubLObject template_parent_link = NIL;
            for (template_parent_link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_parent_link = cdolist_list_var.first()) {
                if (subloop_collections.dlc_owner(template_parent_link) == collection) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_delete_self_from_all_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_basic_support_get_parent_links_method(self);
            try {
                cyblack_basic_support_set_self_deletion_mode_method(self, T);
                {
                    SubLObject cdolist_list_var = template_parent_links;
                    SubLObject template_parent_link = NIL;
                    for (template_parent_link = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_parent_link = cdolist_list_var.first()) {
                        subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_parent_link), template_parent_link);
                        subloop_collections._csetf_dlc_owner(template_parent_link, NIL);
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        cyblack_basic_support_set_self_deletion_mode_method(self, NIL);
                        cyblack_basic_support_set_parent_links_method(self, NIL);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_support_delete_self_from_collection_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_basic_support_get_parent_links_method(self);
            SubLObject template_parent_link = NIL;
            SubLObject template_target_link = NIL;
            if (NIL != template_parent_links) {
                if (subloop_collections.dlc_owner(template_parent_links.first()) == collection) {
                    template_target_link = template_parent_links.first();
                    cyblack_basic_support_set_parent_links_method(self, template_parent_links.rest());
                } else {
                    {
                        SubLObject template_previous = template_parent_links;
                        SubLObject template_sublinks = template_previous.rest();
                        while (NIL != template_sublinks) {
                            template_parent_link = template_sublinks.first();
                            if (subloop_collections.dlc_owner(template_parent_link) == collection) {
                                template_target_link = template_parent_link;
                                rplacd(template_previous, template_sublinks.rest());
                                template_sublinks = NIL;
                            } else {
                                template_previous = template_sublinks;
                                template_sublinks = template_sublinks.rest();
                            }
                        } 
                    }
                }
                if (NIL != template_target_link) {
                    try {
                        cyblack_basic_support_set_self_deletion_mode_method(self, T);
                        subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_target_link), template_target_link);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                subloop_collections._csetf_dlc_owner(template_target_link, NIL);
                                methods.funcall_instance_method_with_1_args(self, ON_DELETE, collection);
                                cyblack_basic_support_set_self_deletion_mode_method(self, NIL);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_support_delete_parent_link_method(SubLObject self, SubLObject old_parent_link) {
        {
            SubLObject template_parent_links = cyblack_basic_support_get_parent_links_method(self);
            if (NIL != template_parent_links) {
                if (old_parent_link == template_parent_links) {
                    cyblack_basic_support_set_parent_links_method(self, template_parent_links.rest());
                } else {
                    {
                        SubLObject template_previous_cons = template_parent_links;
                        SubLObject template_current_cons = template_parent_links.rest();
                        while (NIL != template_current_cons) {
                            if (old_parent_link == template_current_cons.first()) {
                                rplacd(template_previous_cons, template_current_cons.rest());
                                methods.funcall_instance_method_with_1_args(self, ON_DELETE, subloop_collections.dlc_owner(old_parent_link));
                                return old_parent_link;
                            }
                            template_previous_cons = template_current_cons;
                            template_current_cons = template_current_cons.rest();
                        } 
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_add_parent_link_method(SubLObject self, SubLObject new_parent_link) {
        cyblack_basic_support_set_parent_links_method(self, cons(new_parent_link, cyblack_basic_support_get_parent_links_method(self)));
        methods.funcall_instance_method_with_1_args(self, ON_ADD, subloop_collections.dlc_owner(new_parent_link));
        return new_parent_link;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_support_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_support_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_support_p(SubLObject cyblack_basic_support) {
        return classes.subloop_instanceof_class(cyblack_basic_support, CYBLACK_BASIC_SUPPORT);
    }

    public static final SubLObject cyblack_basic_support_get_parent_links_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_support_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_basic_support_qua_list_element_parent_links(self);
            try {
                try {
                    sublisp_throw($sym94$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD, qua_list_element_parent_links);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_qua_list_element_parent_links(self, qua_list_element_parent_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_method = Errors.handleThrowable(ccatch_env_var, $sym94$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_method;
        }
    }

    public static final SubLObject cyblack_basic_support_set_parent_links_method(SubLObject self, SubLObject new_parent_links) {
        {
            SubLObject catch_var_for_cyblack_basic_support_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_basic_support_qua_list_element_parent_links(self);
            try {
                try {
                    qua_list_element_parent_links = new_parent_links;
                    sublisp_throw($sym99$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD, new_parent_links);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_qua_list_element_parent_links(self, qua_list_element_parent_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_method = Errors.handleThrowable(ccatch_env_var, $sym99$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_method;
        }
    }

    public static final SubLObject cyblack_basic_support_get_self_deletion_mode_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_support_method = NIL;
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_basic_support_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    sublisp_throw($sym103$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD, qua_list_element_self_deletion_mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_method = Errors.handleThrowable(ccatch_env_var, $sym103$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_method;
        }
    }

    public static final SubLObject cyblack_basic_support_set_self_deletion_mode_method(SubLObject self, SubLObject mode) {
        {
            SubLObject catch_var_for_cyblack_basic_support_method = NIL;
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_basic_support_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    qua_list_element_self_deletion_mode = mode;
                    sublisp_throw($sym108$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD, mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_method = Errors.handleThrowable(ccatch_env_var, $sym108$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_method;
        }
    }

    public static final SubLObject cyblack_basic_support_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_support_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_basic_support_qua_list_element_parent_links(self);
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_basic_support_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
                    qua_list_element_self_deletion_mode = NIL;
                    qua_list_element_parent_links = NIL;
                    sublisp_throw($sym112$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_qua_list_element_parent_links(self, qua_list_element_parent_links);
                            set_cyblack_basic_support_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_method = Errors.handleThrowable(ccatch_env_var, $sym112$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_method;
        }
    }

    public static final SubLObject get_cyblack_basic_dependent_dll_last_link(SubLObject cyblack_basic_dependent) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_dependent, EIGHT_INTEGER, DLL_LAST_LINK);
    }

    public static final SubLObject set_cyblack_basic_dependent_dll_last_link(SubLObject cyblack_basic_dependent, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_dependent, value, EIGHT_INTEGER, DLL_LAST_LINK);
    }

    public static final SubLObject get_cyblack_basic_dependent_dll_first_link(SubLObject cyblack_basic_dependent) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_dependent, SEVEN_INTEGER, DLL_FIRST_LINK);
    }

    public static final SubLObject set_cyblack_basic_dependent_dll_first_link(SubLObject cyblack_basic_dependent, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_dependent, value, SEVEN_INTEGER, DLL_FIRST_LINK);
    }

    public static final SubLObject get_cyblack_basic_dependent_dll_element_count(SubLObject cyblack_basic_dependent) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_dependent, SIX_INTEGER, DLL_ELEMENT_COUNT);
    }

    public static final SubLObject set_cyblack_basic_dependent_dll_element_count(SubLObject cyblack_basic_dependent, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_dependent, value, SIX_INTEGER, DLL_ELEMENT_COUNT);
    }

    public static final SubLObject get_cyblack_basic_dependent_dll_element_equality_predicate(SubLObject cyblack_basic_dependent) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_dependent, FIVE_INTEGER, DLL_ELEMENT_EQUALITY_PREDICATE);
    }

    public static final SubLObject set_cyblack_basic_dependent_dll_element_equality_predicate(SubLObject cyblack_basic_dependent, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_dependent, value, FIVE_INTEGER, DLL_ELEMENT_EQUALITY_PREDICATE);
    }

    public static final SubLObject cyblack_basic_dependent_support_state_change_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_dependent_remove_all_supports_method(SubLObject self) {
        {
            SubLObject contents = cyblack_basic_dependent_get_all_supports_method(self);
            SubLObject cdolist_list_var = contents;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                methods.funcall_instance_method_with_1_args(element, REMOVE_DEPENDENT, self);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_dependent_get_all_supports_method(SubLObject self) {
        return cyblack_basic_dependent_get_contents_method(self);
    }

    public static final SubLObject cyblack_basic_dependent_remove_support_notify_method(SubLObject self, SubLObject support) {
        return support;
    }

    public static final SubLObject cyblack_basic_dependent_add_support_notify_method(SubLObject self, SubLObject support) {
        return support;
    }

    public static final SubLObject cyblack_basic_dependent_swap_method(SubLObject self, SubLObject element1, SubLObject element2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (element1 == element2) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != element1) && (NIL != element2))) {
                    Errors.error($str_alt129$_SWAP__S___Cannot_swap_NIL_elemen, self);
                }
            }
            {
                SubLObject link1 = cyblack_basic_dependent_find_link_method(self, element1);
                SubLObject link2 = cyblack_basic_dependent_find_link_method(self, element2);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == link1) {
                        Errors.error($str_alt130$_SWAP__S____S_is_not_an_element_o, self, element1);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == link2) {
                        Errors.error($str_alt130$_SWAP__S____S_is_not_an_element_o, self, element2);
                    }
                }
                if (NIL != subloop_collections.list_element_template_p(element1)) {
                    methods.funcall_instance_method_with_1_args(element1, DELETE_PARENT_LINK, link1);
                    methods.funcall_instance_method_with_1_args(element1, ADD_PARENT_LINK, link2);
                }
                if (NIL != subloop_collections.list_element_template_p(element2)) {
                    methods.funcall_instance_method_with_1_args(element2, DELETE_PARENT_LINK, link2);
                    methods.funcall_instance_method_with_1_args(element2, ADD_PARENT_LINK, link1);
                }
                subloop_collections._csetf_dlc_contents(link1, element2);
                subloop_collections._csetf_dlc_contents(link2, element1);
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_basic_dependent_empty_p_method(SubLObject self) {
        return sublisp_null(cyblack_basic_dependent_get_first_link_method(self));
    }

    public static final SubLObject cyblack_basic_dependent_reverse_method(SubLObject self) {
        {
            SubLObject template_first_link = cyblack_basic_dependent_get_first_link_method(self);
            SubLObject template_last_link = cyblack_basic_dependent_get_last_link_method(self);
            if (NIL == template_first_link) {
                return self;
            }
            if (template_first_link == template_last_link) {
                return self;
            }
            {
                SubLObject template_current_link = template_first_link;
                SubLObject template_next_link = NIL;
                while (NIL != template_current_link) {
                    template_next_link = subloop_collections.dlc_next(template_current_link);
                    cyblack_basic_dependent_reverse_link_method(self, template_current_link);
                    template_current_link = template_next_link;
                } 
                cyblack_basic_dependent_set_first_link_method(self, template_last_link);
                cyblack_basic_dependent_set_last_link_method(self, template_first_link);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_dependent_append_method(SubLObject self, SubLObject other_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == other_list) {
                return self;
            }
            if (other_list.isCons()) {
                {
                    SubLObject cdolist_list_var = other_list;
                    SubLObject template_element = NIL;
                    for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                        cyblack_basic_dependent_add_method(self, template_element);
                    }
                }
                return self;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.list_template_p(other_list)) {
                    Errors.error($str_alt141$_APPEND__S___Cannot_append_non_li, self, other_list);
                }
            }
            {
                SubLObject template_enumerator = methods.funcall_instance_method_with_0_args(other_list, ALLOCATE_ENUMERATOR);
                if (NIL != template_enumerator) {
                    if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
                        return self;
                    }
                    {
                        SubLObject template_element = methods.funcall_instance_method_with_0_args(template_enumerator, FIRST);
                        while (NIL != template_element) {
                            cyblack_basic_dependent_add_method(self, template_element);
                            template_element = methods.funcall_instance_method_with_0_args(template_enumerator, NEXT);
                        } 
                        return self;
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_dependent_position_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_links = cyblack_basic_dependent_get_first_link_method(self);
            SubLObject count = ZERO_INTEGER;
            if (NIL == template_links) {
                return NIL;
            }
            while (NIL != template_links) {
                if (NIL != cyblack_basic_dependent_element_equal_p_method(self, element, subloop_collections.dlc_contents(template_links))) {
                    return count;
                }
                count = add(count, ONE_INTEGER);
                template_links = subloop_collections.dlc_next(template_links);
            } 
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_dependent_set_nth_method(SubLObject self, SubLObject index, SubLObject new_element) {
        {
            SubLObject template_link = cyblack_basic_dependent_find_nth_link_method(self, index);
            if (NIL != template_link) {
                {
                    SubLObject template_content = subloop_collections.dlc_contents(template_link);
                    if (NIL != subloop_collections.list_element_template_p(template_content)) {
                        subloop_collections.generic_dllt_delete_parent_link_function(template_content, template_link);
                    }
                    subloop_collections._csetf_dlc_contents(template_link, new_element);
                    if (NIL != subloop_collections.list_element_template_p(new_element)) {
                        subloop_collections.generic_dllt_add_parent_link_function(new_element, template_link);
                    }
                }
                return new_element;
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_dependent_nth_method(SubLObject self, SubLObject index) {
        {
            SubLObject template_link = cyblack_basic_dependent_find_nth_link_method(self, index);
            if (NIL != template_link) {
                return subloop_collections.dlc_contents(template_link);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_dependent_but_last_method(SubLObject self) {
        {
            SubLObject template_last_link = cyblack_basic_dependent_get_last_link_method(self);
            if (NIL != template_last_link) {
                {
                    SubLObject template_contents = subloop_collections.dlc_contents(template_last_link);
                    cyblack_basic_dependent_delete_link_method(self, template_last_link);
                    return template_contents;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_dependent_pop_method(SubLObject self) {
        {
            SubLObject template_first_link = cyblack_basic_dependent_get_first_link_method(self);
            if (NIL != template_first_link) {
                {
                    SubLObject template_contents = subloop_collections.dlc_contents(template_first_link);
                    cyblack_basic_dependent_delete_link_method(self, template_first_link);
                    return template_contents;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_dependent_push_method(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_first_link = cyblack_basic_dependent_get_first_link_method(self);
            SubLObject template_new_link = subloop_collections.make_double_link_cell(UNPROVIDED);
            subloop_collections._csetf_dlc_contents(template_new_link, new_element);
            subloop_collections._csetf_dlc_owner(template_new_link, self);
            if (NIL != template_first_link) {
                subloop_collections._csetf_dlc_next(template_new_link, template_first_link);
                subloop_collections._csetf_dlc_previous(template_first_link, template_new_link);
                cyblack_basic_dependent_set_first_link_method(self, template_new_link);
            } else {
                cyblack_basic_dependent_set_first_link_method(self, template_new_link);
                cyblack_basic_dependent_set_last_link_method(self, template_new_link);
            }
            if (NIL != subloop_collections.list_element_template_p(new_element)) {
                subloop_collections.generic_dllt_add_parent_link_function(new_element, template_new_link);
            }
            cyblack_basic_dependent_inc_element_count_method(self);
            return new_element;
        }
    }

    public static final SubLObject cyblack_basic_dependent_member_p_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_link = cyblack_basic_dependent_find_link_method(self, element);
            return NIL != template_link ? ((SubLObject) (T)) : NIL;
        }
    }

    public static final SubLObject cyblack_basic_dependent_remove_method(SubLObject self, SubLObject old_element) {
        if (NIL != subloop_collections.list_element_template_p(old_element)) {
            subloop_collections.generic_dllt_delete_self_from_collection_function(old_element, self);
        } else {
            {
                SubLObject template_link = cyblack_basic_dependent_find_link_method(self, old_element);
                if (NIL != template_link) {
                    cyblack_basic_dependent_delete_link_method(self, template_link);
                }
            }
        }
        return old_element;
    }

    public static final SubLObject cyblack_basic_dependent_add_method(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_new_link = subloop_collections.make_double_link_cell(UNPROVIDED);
            SubLObject template_last_link = cyblack_basic_dependent_get_last_link_method(self);
            subloop_collections._csetf_dlc_contents(template_new_link, new_element);
            subloop_collections._csetf_dlc_owner(template_new_link, self);
            if (NIL != template_last_link) {
                subloop_collections._csetf_dlc_next(template_last_link, template_new_link);
                subloop_collections._csetf_dlc_previous(template_new_link, template_last_link);
            } else {
                cyblack_basic_dependent_set_first_link_method(self, template_new_link);
            }
            cyblack_basic_dependent_set_last_link_method(self, template_new_link);
            if (NIL != subloop_collections.list_element_template_p(new_element)) {
                subloop_collections.generic_dllt_add_parent_link_function(new_element, template_new_link);
            }
            cyblack_basic_dependent_inc_element_count_method(self);
            return new_element;
        }
    }

    public static final SubLObject cyblack_basic_dependent_clear_method(SubLObject self) {
        {
            SubLObject template_contents = cyblack_basic_dependent_get_contents_method(self);
            SubLObject cdolist_list_var = template_contents;
            SubLObject template_element = NIL;
            for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                cyblack_basic_dependent_remove_method(self, template_element);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_dependent_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject template_enumerator = cyblack_basic_dependent_allocate_enumerator_method(self);
            if (NIL == template_enumerator) {
                format(stream, $str_alt182$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
                return self;
            } else
                if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
                    format(stream, $str_alt183$DLIST__);
                } else {
                    format(stream, $str_alt184$DLIST__S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
                    while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                        format(stream, $str_alt186$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
                    } 
                    format(stream, $str_alt187$_);
                }

            cyblack_basic_dependent_deallocate_enumerator_method(self, template_enumerator);
            return self;
        }
    }

    public static final SubLObject cyblack_basic_dependent_find_nth_link_method(SubLObject self, SubLObject index) {
        {
            SubLObject template_links = cyblack_basic_dependent_get_first_link_method(self);
            SubLObject count = ZERO_INTEGER;
            while (NIL != template_links) {
                if (count.numE(index)) {
                    return template_links;
                }
                count = add(count, ONE_INTEGER);
                template_links = subloop_collections.dlc_next(template_links);
            } 
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_dependent_find_link_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_links = cyblack_basic_dependent_get_first_link_method(self);
            while (NIL != template_links) {
                if (NIL != cyblack_basic_dependent_element_equal_p_method(self, element, subloop_collections.dlc_contents(template_links))) {
                    return template_links;
                }
                template_links = subloop_collections.dlc_next(template_links);
            } 
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_dependent_reverse_link_method(SubLObject self, SubLObject link) {
        {
            SubLObject template_previous = subloop_collections.dlc_previous(link);
            SubLObject template_next = subloop_collections.dlc_next(link);
            subloop_collections._csetf_dlc_previous(link, template_next);
            subloop_collections._csetf_dlc_next(link, template_previous);
            return link;
        }
    }

    public static final SubLObject cyblack_basic_dependent_delete_link_method(SubLObject self, SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.double_link_cell_p(link)) {
                    Errors.error($str_alt201$_DELETE_LINK__S____S_is_not_a_val, self, link);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (subloop_collections.dlc_owner(link) != self) {
                    Errors.error($str_alt202$_DELETE_LINK__S___Link__S_is_not_, self, link, self);
                }
            }
            cyblack_basic_dependent_dec_element_count_method(self);
            {
                SubLObject template_first_link = cyblack_basic_dependent_get_first_link_method(self);
                SubLObject template_last_link = cyblack_basic_dependent_get_last_link_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!(((NIL != template_first_link) && (NIL != template_last_link)) || ((NIL == template_first_link) && (NIL == template_last_link)))) {
                        Errors.error($str_alt203$_DELETE_LINK__S___Detected_incons, self);
                    }
                }
                if (template_first_link == link) {
                    if (template_last_link == link) {
                        cyblack_basic_dependent_set_first_link_method(self, NIL);
                        cyblack_basic_dependent_set_last_link_method(self, NIL);
                        subloop_collections._csetf_dlc_previous(link, NIL);
                        subloop_collections._csetf_dlc_next(link, NIL);
                        return subloop_collections.dlc_contents(link);
                    } else {
                        {
                            SubLObject template_second_link = subloop_collections.dlc_next(link);
                            subloop_collections._csetf_dlc_previous(template_second_link, NIL);
                            cyblack_basic_dependent_set_first_link_method(self, template_second_link);
                            subloop_collections._csetf_dlc_next(link, NIL);
                            subloop_collections._csetf_dlc_previous(link, NIL);
                            return subloop_collections.dlc_contents(link);
                        }
                    }
                } else {
                    if (template_last_link == link) {
                        {
                            SubLObject template_second_link = subloop_collections.dlc_previous(link);
                            subloop_collections._csetf_dlc_next(template_second_link, NIL);
                            cyblack_basic_dependent_set_last_link_method(self, template_second_link);
                            subloop_collections._csetf_dlc_next(link, NIL);
                            subloop_collections._csetf_dlc_previous(link, NIL);
                            return subloop_collections.dlc_contents(link);
                        }
                    } else {
                        {
                            SubLObject template_before_link = subloop_collections.dlc_previous(link);
                            SubLObject template_after_link = subloop_collections.dlc_next(link);
                            subloop_collections._csetf_dlc_next(template_before_link, template_after_link);
                            subloop_collections._csetf_dlc_previous(template_after_link, template_before_link);
                            subloop_collections._csetf_dlc_next(link, NIL);
                            subloop_collections._csetf_dlc_previous(link, NIL);
                            return subloop_collections.dlc_contents(link);
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_dependent_set_contents_method(SubLObject self, SubLObject new_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!new_contents.isList()) {
                    Errors.error($str_alt208$_SET_CONTENTS__S___Cannot_set_the, self, new_contents);
                }
            }
            {
                SubLObject template_contents = cyblack_basic_dependent_get_contents_method(self);
                SubLObject cdolist_list_var = template_contents;
                SubLObject template_element = NIL;
                for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                    cyblack_basic_dependent_remove_method(self, template_element);
                }
            }
            {
                SubLObject cdolist_list_var = new_contents;
                SubLObject template_element = NIL;
                for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                    cyblack_basic_dependent_add_method(self, template_element);
                }
            }
            return new_contents;
        }
    }

    public static final SubLObject cyblack_basic_dependent_get_contents_method(SubLObject self) {
        {
            SubLObject template_contents = NIL;
            SubLObject template_first_link = cyblack_basic_dependent_get_first_link_method(self);
            if (NIL != template_first_link) {
                {
                    SubLObject template_current_link = template_first_link;
                    while (NIL != template_current_link) {
                        template_contents = cons(subloop_collections.dlc_contents(template_current_link), template_contents);
                        template_current_link = subloop_collections.dlc_next(template_current_link);
                    } 
                }
            }
            return nreverse(template_contents);
        }
    }

    public static final SubLObject cyblack_basic_dependent_element_equal_p_method(SubLObject self, SubLObject element1, SubLObject element2) {
        return equal(element1, element2);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_dependent_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_dependent_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DEPENDENT, DLL_ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DEPENDENT, DLL_ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DEPENDENT, DLL_FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DEPENDENT, DLL_LAST_LINK, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_dependent_p(SubLObject cyblack_basic_dependent) {
        return classes.subloop_instanceof_class(cyblack_basic_dependent, CYBLACK_BASIC_DEPENDENT);
    }

    public static final SubLObject cyblack_basic_dependent_get_element_equality_predicate_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
            SubLObject dll_element_equality_predicate = get_cyblack_basic_dependent_dll_element_equality_predicate(self);
            try {
                try {
                    sublisp_throw($sym219$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, dll_element_equality_predicate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_dependent_dll_element_equality_predicate(self, dll_element_equality_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym219$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_dependent_set_element_equality_predicate_method(SubLObject self, SubLObject new_predicate) {
        {
            SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
            SubLObject dll_element_equality_predicate = get_cyblack_basic_dependent_dll_element_equality_predicate(self);
            try {
                try {
                    dll_element_equality_predicate = new_predicate;
                    sublisp_throw($sym224$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, new_predicate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_dependent_dll_element_equality_predicate(self, dll_element_equality_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym224$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_dependent_set_element_count_method(SubLObject self, SubLObject new_element_count) {
        {
            SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
            SubLObject dll_element_count = get_cyblack_basic_dependent_dll_element_count(self);
            try {
                try {
                    dll_element_count = new_element_count;
                    sublisp_throw($sym229$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, new_element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_dependent_dll_element_count(self, dll_element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym229$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_dependent_inc_element_count_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
            SubLObject dll_element_count = get_cyblack_basic_dependent_dll_element_count(self);
            try {
                try {
                    if (NIL == dll_element_count) {
                        dll_element_count = ONE_INTEGER;
                    } else {
                        dll_element_count = add(dll_element_count, ONE_INTEGER);
                    }
                    sublisp_throw($sym233$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, dll_element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_dependent_dll_element_count(self, dll_element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym233$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_dependent_dec_element_count_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
            SubLObject dll_element_count = get_cyblack_basic_dependent_dll_element_count(self);
            try {
                try {
                    if (NIL == dll_element_count) {
                        dll_element_count = ZERO_INTEGER;
                    } else {
                        dll_element_count = subtract(dll_element_count, ONE_INTEGER);
                    }
                    sublisp_throw($sym237$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, dll_element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_dependent_dll_element_count(self, dll_element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym237$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_dependent_get_first_link_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
            SubLObject dll_first_link = get_cyblack_basic_dependent_dll_first_link(self);
            try {
                try {
                    sublisp_throw($sym241$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, dll_first_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_dependent_dll_first_link(self, dll_first_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym241$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_dependent_set_first_link_method(SubLObject self, SubLObject new_first_link) {
        {
            SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
            SubLObject dll_first_link = get_cyblack_basic_dependent_dll_first_link(self);
            try {
                try {
                    dll_first_link = new_first_link;
                    sublisp_throw($sym246$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, new_first_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_dependent_dll_first_link(self, dll_first_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym246$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_dependent_get_last_link_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
            SubLObject dll_last_link = get_cyblack_basic_dependent_dll_last_link(self);
            try {
                try {
                    sublisp_throw($sym250$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, dll_last_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_dependent_dll_last_link(self, dll_last_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym250$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_dependent_set_last_link_method(SubLObject self, SubLObject new_last_link) {
        {
            SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
            SubLObject dll_last_link = get_cyblack_basic_dependent_dll_last_link(self);
            try {
                try {
                    dll_last_link = new_last_link;
                    sublisp_throw($sym255$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, new_last_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_dependent_dll_last_link(self, dll_last_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym255$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_dependent_get_element_count_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
            SubLObject dll_element_count = get_cyblack_basic_dependent_dll_element_count(self);
            try {
                try {
                    sublisp_throw($sym259$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, dll_element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_dependent_dll_element_count(self, dll_element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym259$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_dependent_allocate_enumerator_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
                SubLObject dll_first_link = get_cyblack_basic_dependent_dll_first_link(self);
                try {
                    try {
                        {
                            SubLObject new_enumerator = object.object_new_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR);
                            thread.resetMultipleValues();
                            {
                                SubLObject new_first_link = subloop_collections.dlc_copy_links(dll_first_link, new_enumerator);
                                SubLObject new_last_link = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                subloop_collections.basic_doubly_linked_list_enumerator_set_initial_state_method(new_enumerator, new_first_link, new_last_link);
                                sublisp_throw($sym262$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, new_enumerator);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_dependent_dll_first_link(self, dll_first_link);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym262$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
                }
                return catch_var_for_cyblack_basic_dependent_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_dependent_deallocate_enumerator_method(SubLObject self, SubLObject enumerator) {
        if (NIL != subloop_collections.basic_doubly_linked_list_enumerator_p(enumerator)) {
            subloop_collections.basic_doubly_linked_list_enumerator_isolate_method(enumerator);
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_dependent_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_dependent_method = NIL;
            SubLObject dll_last_link = get_cyblack_basic_dependent_dll_last_link(self);
            SubLObject dll_first_link = get_cyblack_basic_dependent_dll_first_link(self);
            SubLObject dll_element_count = get_cyblack_basic_dependent_dll_element_count(self);
            SubLObject dll_element_equality_predicate = get_cyblack_basic_dependent_dll_element_equality_predicate(self);
            try {
                try {
                    cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
                    dll_element_equality_predicate = EQUAL;
                    dll_element_count = ZERO_INTEGER;
                    dll_first_link = NIL;
                    dll_last_link = NIL;
                    sublisp_throw($sym270$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_dependent_dll_last_link(self, dll_last_link);
                            set_cyblack_basic_dependent_dll_first_link(self, dll_first_link);
                            set_cyblack_basic_dependent_dll_element_count(self, dll_element_count);
                            set_cyblack_basic_dependent_dll_element_equality_predicate(self, dll_element_equality_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym270$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_dependent_method;
        }
    }

    public static final SubLObject get_cyblack_basic_support_dependent_dll_last_link(SubLObject cyblack_basic_support_dependent) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_support_dependent, NINE_INTEGER, DLL_LAST_LINK);
    }

    public static final SubLObject set_cyblack_basic_support_dependent_dll_last_link(SubLObject cyblack_basic_support_dependent, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_support_dependent, value, NINE_INTEGER, DLL_LAST_LINK);
    }

    public static final SubLObject get_cyblack_basic_support_dependent_dll_first_link(SubLObject cyblack_basic_support_dependent) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_support_dependent, EIGHT_INTEGER, DLL_FIRST_LINK);
    }

    public static final SubLObject set_cyblack_basic_support_dependent_dll_first_link(SubLObject cyblack_basic_support_dependent, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_support_dependent, value, EIGHT_INTEGER, DLL_FIRST_LINK);
    }

    public static final SubLObject get_cyblack_basic_support_dependent_dll_element_count(SubLObject cyblack_basic_support_dependent) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_support_dependent, SEVEN_INTEGER, DLL_ELEMENT_COUNT);
    }

    public static final SubLObject set_cyblack_basic_support_dependent_dll_element_count(SubLObject cyblack_basic_support_dependent, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_support_dependent, value, SEVEN_INTEGER, DLL_ELEMENT_COUNT);
    }

    public static final SubLObject get_cyblack_basic_support_dependent_dll_element_equality_predicate(SubLObject cyblack_basic_support_dependent) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_support_dependent, SIX_INTEGER, DLL_ELEMENT_EQUALITY_PREDICATE);
    }

    public static final SubLObject set_cyblack_basic_support_dependent_dll_element_equality_predicate(SubLObject cyblack_basic_support_dependent, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_support_dependent, value, SIX_INTEGER, DLL_ELEMENT_EQUALITY_PREDICATE);
    }

    public static final SubLObject cyblack_basic_support_dependent_support_state_change_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_support_dependent_remove_all_supports_method(SubLObject self) {
        {
            SubLObject contents = cyblack_basic_support_dependent_get_all_supports_method(self);
            SubLObject cdolist_list_var = contents;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                methods.funcall_instance_method_with_1_args(element, REMOVE_DEPENDENT, self);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_get_all_supports_method(SubLObject self) {
        return cyblack_basic_support_dependent_get_contents_method(self);
    }

    public static final SubLObject cyblack_basic_support_dependent_remove_support_notify_method(SubLObject self, SubLObject support) {
        return support;
    }

    public static final SubLObject cyblack_basic_support_dependent_add_support_notify_method(SubLObject self, SubLObject support) {
        return support;
    }

    public static final SubLObject cyblack_basic_support_dependent_swap_method(SubLObject self, SubLObject element1, SubLObject element2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (element1 == element2) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != element1) && (NIL != element2))) {
                    Errors.error($str_alt129$_SWAP__S___Cannot_swap_NIL_elemen, self);
                }
            }
            {
                SubLObject link1 = cyblack_basic_support_dependent_find_link_method(self, element1);
                SubLObject link2 = cyblack_basic_support_dependent_find_link_method(self, element2);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == link1) {
                        Errors.error($str_alt130$_SWAP__S____S_is_not_an_element_o, self, element1);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == link2) {
                        Errors.error($str_alt130$_SWAP__S____S_is_not_an_element_o, self, element2);
                    }
                }
                if (NIL != subloop_collections.list_element_template_p(element1)) {
                    methods.funcall_instance_method_with_1_args(element1, DELETE_PARENT_LINK, link1);
                    methods.funcall_instance_method_with_1_args(element1, ADD_PARENT_LINK, link2);
                }
                if (NIL != subloop_collections.list_element_template_p(element2)) {
                    methods.funcall_instance_method_with_1_args(element2, DELETE_PARENT_LINK, link2);
                    methods.funcall_instance_method_with_1_args(element2, ADD_PARENT_LINK, link1);
                }
                subloop_collections._csetf_dlc_contents(link1, element2);
                subloop_collections._csetf_dlc_contents(link2, element1);
                return NIL;
            }
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_reverse_method(SubLObject self) {
        {
            SubLObject template_first_link = cyblack_basic_support_dependent_get_first_link_method(self);
            SubLObject template_last_link = cyblack_basic_support_dependent_get_last_link_method(self);
            if (NIL == template_first_link) {
                return self;
            }
            if (template_first_link == template_last_link) {
                return self;
            }
            {
                SubLObject template_current_link = template_first_link;
                SubLObject template_next_link = NIL;
                while (NIL != template_current_link) {
                    template_next_link = subloop_collections.dlc_next(template_current_link);
                    cyblack_basic_support_dependent_reverse_link_method(self, template_current_link);
                    template_current_link = template_next_link;
                } 
                cyblack_basic_support_dependent_set_first_link_method(self, template_last_link);
                cyblack_basic_support_dependent_set_last_link_method(self, template_first_link);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_append_method(SubLObject self, SubLObject other_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == other_list) {
                return self;
            }
            if (other_list.isCons()) {
                {
                    SubLObject cdolist_list_var = other_list;
                    SubLObject template_element = NIL;
                    for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                        cyblack_basic_support_dependent_add_method(self, template_element);
                    }
                }
                return self;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.list_template_p(other_list)) {
                    Errors.error($str_alt141$_APPEND__S___Cannot_append_non_li, self, other_list);
                }
            }
            {
                SubLObject template_enumerator = methods.funcall_instance_method_with_0_args(other_list, ALLOCATE_ENUMERATOR);
                if (NIL != template_enumerator) {
                    if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
                        return self;
                    }
                    {
                        SubLObject template_element = methods.funcall_instance_method_with_0_args(template_enumerator, FIRST);
                        while (NIL != template_element) {
                            cyblack_basic_support_dependent_add_method(self, template_element);
                            template_element = methods.funcall_instance_method_with_0_args(template_enumerator, NEXT);
                        } 
                        return self;
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_position_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_links = cyblack_basic_support_dependent_get_first_link_method(self);
            SubLObject count = ZERO_INTEGER;
            if (NIL == template_links) {
                return NIL;
            }
            while (NIL != template_links) {
                if (NIL != cyblack_basic_support_dependent_element_equal_p_method(self, element, subloop_collections.dlc_contents(template_links))) {
                    return count;
                }
                count = add(count, ONE_INTEGER);
                template_links = subloop_collections.dlc_next(template_links);
            } 
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_set_nth_method(SubLObject self, SubLObject index, SubLObject new_element) {
        {
            SubLObject template_link = cyblack_basic_support_dependent_find_nth_link_method(self, index);
            if (NIL != template_link) {
                {
                    SubLObject template_content = subloop_collections.dlc_contents(template_link);
                    if (NIL != subloop_collections.list_element_template_p(template_content)) {
                        subloop_collections.generic_dllt_delete_parent_link_function(template_content, template_link);
                    }
                    subloop_collections._csetf_dlc_contents(template_link, new_element);
                    if (NIL != subloop_collections.list_element_template_p(new_element)) {
                        subloop_collections.generic_dllt_add_parent_link_function(new_element, template_link);
                    }
                }
                return new_element;
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_nth_method(SubLObject self, SubLObject index) {
        {
            SubLObject template_link = cyblack_basic_support_dependent_find_nth_link_method(self, index);
            if (NIL != template_link) {
                return subloop_collections.dlc_contents(template_link);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_but_last_method(SubLObject self) {
        {
            SubLObject template_last_link = cyblack_basic_support_dependent_get_last_link_method(self);
            if (NIL != template_last_link) {
                {
                    SubLObject template_contents = subloop_collections.dlc_contents(template_last_link);
                    cyblack_basic_support_dependent_delete_link_method(self, template_last_link);
                    return template_contents;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_pop_method(SubLObject self) {
        {
            SubLObject template_first_link = cyblack_basic_support_dependent_get_first_link_method(self);
            if (NIL != template_first_link) {
                {
                    SubLObject template_contents = subloop_collections.dlc_contents(template_first_link);
                    cyblack_basic_support_dependent_delete_link_method(self, template_first_link);
                    return template_contents;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_push_method(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_first_link = cyblack_basic_support_dependent_get_first_link_method(self);
            SubLObject template_new_link = subloop_collections.make_double_link_cell(UNPROVIDED);
            subloop_collections._csetf_dlc_contents(template_new_link, new_element);
            subloop_collections._csetf_dlc_owner(template_new_link, self);
            if (NIL != template_first_link) {
                subloop_collections._csetf_dlc_next(template_new_link, template_first_link);
                subloop_collections._csetf_dlc_previous(template_first_link, template_new_link);
                cyblack_basic_support_dependent_set_first_link_method(self, template_new_link);
            } else {
                cyblack_basic_support_dependent_set_first_link_method(self, template_new_link);
                cyblack_basic_support_dependent_set_last_link_method(self, template_new_link);
            }
            if (NIL != subloop_collections.list_element_template_p(new_element)) {
                subloop_collections.generic_dllt_add_parent_link_function(new_element, template_new_link);
            }
            cyblack_basic_support_dependent_inc_element_count_method(self);
            return new_element;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_member_p_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_link = cyblack_basic_support_dependent_find_link_method(self, element);
            return NIL != template_link ? ((SubLObject) (T)) : NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_remove_method(SubLObject self, SubLObject old_element) {
        if (NIL != subloop_collections.list_element_template_p(old_element)) {
            subloop_collections.generic_dllt_delete_self_from_collection_function(old_element, self);
        } else {
            {
                SubLObject template_link = cyblack_basic_support_dependent_find_link_method(self, old_element);
                if (NIL != template_link) {
                    cyblack_basic_support_dependent_delete_link_method(self, template_link);
                }
            }
        }
        return old_element;
    }

    public static final SubLObject cyblack_basic_support_dependent_add_method(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_new_link = subloop_collections.make_double_link_cell(UNPROVIDED);
            SubLObject template_last_link = cyblack_basic_support_dependent_get_last_link_method(self);
            subloop_collections._csetf_dlc_contents(template_new_link, new_element);
            subloop_collections._csetf_dlc_owner(template_new_link, self);
            if (NIL != template_last_link) {
                subloop_collections._csetf_dlc_next(template_last_link, template_new_link);
                subloop_collections._csetf_dlc_previous(template_new_link, template_last_link);
            } else {
                cyblack_basic_support_dependent_set_first_link_method(self, template_new_link);
            }
            cyblack_basic_support_dependent_set_last_link_method(self, template_new_link);
            if (NIL != subloop_collections.list_element_template_p(new_element)) {
                subloop_collections.generic_dllt_add_parent_link_function(new_element, template_new_link);
            }
            cyblack_basic_support_dependent_inc_element_count_method(self);
            return new_element;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_clear_method(SubLObject self) {
        {
            SubLObject template_contents = cyblack_basic_support_dependent_get_contents_method(self);
            SubLObject cdolist_list_var = template_contents;
            SubLObject template_element = NIL;
            for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                cyblack_basic_support_dependent_remove_method(self, template_element);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject template_enumerator = cyblack_basic_support_dependent_allocate_enumerator_method(self);
            if (NIL == template_enumerator) {
                format(stream, $str_alt182$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
                return self;
            } else
                if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
                    format(stream, $str_alt183$DLIST__);
                } else {
                    format(stream, $str_alt184$DLIST__S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
                    while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                        format(stream, $str_alt186$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
                    } 
                    format(stream, $str_alt187$_);
                }

            cyblack_basic_support_dependent_deallocate_enumerator_method(self, template_enumerator);
            return self;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_find_nth_link_method(SubLObject self, SubLObject index) {
        {
            SubLObject template_links = cyblack_basic_support_dependent_get_first_link_method(self);
            SubLObject count = ZERO_INTEGER;
            while (NIL != template_links) {
                if (count.numE(index)) {
                    return template_links;
                }
                count = add(count, ONE_INTEGER);
                template_links = subloop_collections.dlc_next(template_links);
            } 
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_find_link_method(SubLObject self, SubLObject element) {
        {
            SubLObject template_links = cyblack_basic_support_dependent_get_first_link_method(self);
            while (NIL != template_links) {
                if (NIL != cyblack_basic_support_dependent_element_equal_p_method(self, element, subloop_collections.dlc_contents(template_links))) {
                    return template_links;
                }
                template_links = subloop_collections.dlc_next(template_links);
            } 
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_reverse_link_method(SubLObject self, SubLObject link) {
        {
            SubLObject template_previous = subloop_collections.dlc_previous(link);
            SubLObject template_next = subloop_collections.dlc_next(link);
            subloop_collections._csetf_dlc_previous(link, template_next);
            subloop_collections._csetf_dlc_next(link, template_previous);
            return link;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_delete_link_method(SubLObject self, SubLObject link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.double_link_cell_p(link)) {
                    Errors.error($str_alt201$_DELETE_LINK__S____S_is_not_a_val, self, link);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (subloop_collections.dlc_owner(link) != self) {
                    Errors.error($str_alt202$_DELETE_LINK__S___Link__S_is_not_, self, link, self);
                }
            }
            cyblack_basic_support_dependent_dec_element_count_method(self);
            {
                SubLObject template_first_link = cyblack_basic_support_dependent_get_first_link_method(self);
                SubLObject template_last_link = cyblack_basic_support_dependent_get_last_link_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!(((NIL != template_first_link) && (NIL != template_last_link)) || ((NIL == template_first_link) && (NIL == template_last_link)))) {
                        Errors.error($str_alt203$_DELETE_LINK__S___Detected_incons, self);
                    }
                }
                if (template_first_link == link) {
                    if (template_last_link == link) {
                        cyblack_basic_support_dependent_set_first_link_method(self, NIL);
                        cyblack_basic_support_dependent_set_last_link_method(self, NIL);
                        subloop_collections._csetf_dlc_previous(link, NIL);
                        subloop_collections._csetf_dlc_next(link, NIL);
                        return subloop_collections.dlc_contents(link);
                    } else {
                        {
                            SubLObject template_second_link = subloop_collections.dlc_next(link);
                            subloop_collections._csetf_dlc_previous(template_second_link, NIL);
                            cyblack_basic_support_dependent_set_first_link_method(self, template_second_link);
                            subloop_collections._csetf_dlc_next(link, NIL);
                            subloop_collections._csetf_dlc_previous(link, NIL);
                            return subloop_collections.dlc_contents(link);
                        }
                    }
                } else {
                    if (template_last_link == link) {
                        {
                            SubLObject template_second_link = subloop_collections.dlc_previous(link);
                            subloop_collections._csetf_dlc_next(template_second_link, NIL);
                            cyblack_basic_support_dependent_set_last_link_method(self, template_second_link);
                            subloop_collections._csetf_dlc_next(link, NIL);
                            subloop_collections._csetf_dlc_previous(link, NIL);
                            return subloop_collections.dlc_contents(link);
                        }
                    } else {
                        {
                            SubLObject template_before_link = subloop_collections.dlc_previous(link);
                            SubLObject template_after_link = subloop_collections.dlc_next(link);
                            subloop_collections._csetf_dlc_next(template_before_link, template_after_link);
                            subloop_collections._csetf_dlc_previous(template_after_link, template_before_link);
                            subloop_collections._csetf_dlc_next(link, NIL);
                            subloop_collections._csetf_dlc_previous(link, NIL);
                            return subloop_collections.dlc_contents(link);
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_set_contents_method(SubLObject self, SubLObject new_contents) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!new_contents.isList()) {
                    Errors.error($str_alt208$_SET_CONTENTS__S___Cannot_set_the, self, new_contents);
                }
            }
            {
                SubLObject template_contents = cyblack_basic_support_dependent_get_contents_method(self);
                SubLObject cdolist_list_var = template_contents;
                SubLObject template_element = NIL;
                for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                    cyblack_basic_support_dependent_remove_method(self, template_element);
                }
            }
            {
                SubLObject cdolist_list_var = new_contents;
                SubLObject template_element = NIL;
                for (template_element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_element = cdolist_list_var.first()) {
                    cyblack_basic_support_dependent_add_method(self, template_element);
                }
            }
            return new_contents;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_get_contents_method(SubLObject self) {
        {
            SubLObject template_contents = NIL;
            SubLObject template_first_link = cyblack_basic_support_dependent_get_first_link_method(self);
            if (NIL != template_first_link) {
                {
                    SubLObject template_current_link = template_first_link;
                    while (NIL != template_current_link) {
                        template_contents = cons(subloop_collections.dlc_contents(template_current_link), template_contents);
                        template_current_link = subloop_collections.dlc_next(template_current_link);
                    } 
                }
            }
            return nreverse(template_contents);
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_element_equal_p_method(SubLObject self, SubLObject element1, SubLObject element2) {
        return equal(element1, element2);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_support_dependent_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_support_dependent_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
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
        return NIL;
    }

    public static final SubLObject cyblack_basic_support_dependent_p(SubLObject cyblack_basic_support_dependent) {
        return classes.subloop_instanceof_class(cyblack_basic_support_dependent, CYBLACK_BASIC_SUPPORT_DEPENDENT);
    }

    public static final SubLObject cyblack_basic_support_dependent_get_element_equality_predicate_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
            SubLObject dll_element_equality_predicate = get_cyblack_basic_support_dependent_dll_element_equality_predicate(self);
            try {
                try {
                    sublisp_throw($sym302$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, dll_element_equality_predicate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_dependent_dll_element_equality_predicate(self, dll_element_equality_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym302$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_set_element_equality_predicate_method(SubLObject self, SubLObject new_predicate) {
        {
            SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
            SubLObject dll_element_equality_predicate = get_cyblack_basic_support_dependent_dll_element_equality_predicate(self);
            try {
                try {
                    dll_element_equality_predicate = new_predicate;
                    sublisp_throw($sym304$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, new_predicate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_dependent_dll_element_equality_predicate(self, dll_element_equality_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym304$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_set_element_count_method(SubLObject self, SubLObject new_element_count) {
        {
            SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
            SubLObject dll_element_count = get_cyblack_basic_support_dependent_dll_element_count(self);
            try {
                try {
                    dll_element_count = new_element_count;
                    sublisp_throw($sym306$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, new_element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_dependent_dll_element_count(self, dll_element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym306$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_inc_element_count_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
            SubLObject dll_element_count = get_cyblack_basic_support_dependent_dll_element_count(self);
            try {
                try {
                    if (NIL == dll_element_count) {
                        dll_element_count = ONE_INTEGER;
                    } else {
                        dll_element_count = add(dll_element_count, ONE_INTEGER);
                    }
                    sublisp_throw($sym308$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, dll_element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_dependent_dll_element_count(self, dll_element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym308$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_dec_element_count_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
            SubLObject dll_element_count = get_cyblack_basic_support_dependent_dll_element_count(self);
            try {
                try {
                    if (NIL == dll_element_count) {
                        dll_element_count = ZERO_INTEGER;
                    } else {
                        dll_element_count = subtract(dll_element_count, ONE_INTEGER);
                    }
                    sublisp_throw($sym310$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, dll_element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_dependent_dll_element_count(self, dll_element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym310$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_get_first_link_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
            SubLObject dll_first_link = get_cyblack_basic_support_dependent_dll_first_link(self);
            try {
                try {
                    sublisp_throw($sym312$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, dll_first_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_dependent_dll_first_link(self, dll_first_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym312$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_set_first_link_method(SubLObject self, SubLObject new_first_link) {
        {
            SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
            SubLObject dll_first_link = get_cyblack_basic_support_dependent_dll_first_link(self);
            try {
                try {
                    dll_first_link = new_first_link;
                    sublisp_throw($sym314$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, new_first_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_dependent_dll_first_link(self, dll_first_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym314$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_get_last_link_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
            SubLObject dll_last_link = get_cyblack_basic_support_dependent_dll_last_link(self);
            try {
                try {
                    sublisp_throw($sym316$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, dll_last_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_dependent_dll_last_link(self, dll_last_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym316$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_set_last_link_method(SubLObject self, SubLObject new_last_link) {
        {
            SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
            SubLObject dll_last_link = get_cyblack_basic_support_dependent_dll_last_link(self);
            try {
                try {
                    dll_last_link = new_last_link;
                    sublisp_throw($sym318$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, new_last_link);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_dependent_dll_last_link(self, dll_last_link);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym318$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_get_element_count_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
            SubLObject dll_element_count = get_cyblack_basic_support_dependent_dll_element_count(self);
            try {
                try {
                    sublisp_throw($sym320$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, dll_element_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_dependent_dll_element_count(self, dll_element_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym320$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_dependent_method;
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_allocate_enumerator_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
                SubLObject dll_first_link = get_cyblack_basic_support_dependent_dll_first_link(self);
                try {
                    try {
                        {
                            SubLObject new_enumerator = object.object_new_method(BASIC_DOUBLY_LINKED_LIST_ENUMERATOR);
                            thread.resetMultipleValues();
                            {
                                SubLObject new_first_link = subloop_collections.dlc_copy_links(dll_first_link, new_enumerator);
                                SubLObject new_last_link = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                subloop_collections.basic_doubly_linked_list_enumerator_set_initial_state_method(new_enumerator, new_first_link, new_last_link);
                                sublisp_throw($sym322$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, new_enumerator);
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_support_dependent_dll_first_link(self, dll_first_link);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym322$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
                }
                return catch_var_for_cyblack_basic_support_dependent_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_support_dependent_deallocate_enumerator_method(SubLObject self, SubLObject enumerator) {
        if (NIL != subloop_collections.basic_doubly_linked_list_enumerator_p(enumerator)) {
            subloop_collections.basic_doubly_linked_list_enumerator_isolate_method(enumerator);
        }
        return NIL;
    }

    public static final SubLObject cyblack_basic_support_dependent_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_support_dependent_method = NIL;
            SubLObject dll_last_link = get_cyblack_basic_support_dependent_dll_last_link(self);
            SubLObject dll_first_link = get_cyblack_basic_support_dependent_dll_first_link(self);
            SubLObject dll_element_count = get_cyblack_basic_support_dependent_dll_element_count(self);
            SubLObject dll_element_equality_predicate = get_cyblack_basic_support_dependent_dll_element_equality_predicate(self);
            try {
                try {
                    cyblack_basic_support_initialize_method(self);
                    dll_element_equality_predicate = EQUAL;
                    dll_element_count = ZERO_INTEGER;
                    dll_first_link = NIL;
                    dll_last_link = NIL;
                    sublisp_throw($sym325$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_support_dependent_dll_last_link(self, dll_last_link);
                            set_cyblack_basic_support_dependent_dll_first_link(self, dll_first_link);
                            set_cyblack_basic_support_dependent_dll_element_count(self, dll_element_count);
                            set_cyblack_basic_support_dependent_dll_element_equality_predicate(self, dll_element_equality_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_support_dependent_method = Errors.handleThrowable(ccatch_env_var, $sym325$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD);
            }
            return catch_var_for_cyblack_basic_support_dependent_method;
        }
    }

    public static final SubLObject declare_cyblack_support_file() {
        declareFunction("cyblack_support_p", "CYBLACK-SUPPORT-P", 1, 0, false);
        declareFunction("cyblack_support_template_p", "CYBLACK-SUPPORT-TEMPLATE-P", 1, 0, false);
        declareFunction("cyblack_dependent_p", "CYBLACK-DEPENDENT-P", 1, 0, false);
        declareFunction("cyblack_dependent_template_p", "CYBLACK-DEPENDENT-TEMPLATE-P", 1, 0, false);
        declareFunction("get_cyblack_basic_support_qua_list_element_parent_links", "GET-CYBLACK-BASIC-SUPPORT-QUA-LIST-ELEMENT-PARENT-LINKS", 1, 0, false);
        declareFunction("set_cyblack_basic_support_qua_list_element_parent_links", "SET-CYBLACK-BASIC-SUPPORT-QUA-LIST-ELEMENT-PARENT-LINKS", 2, 0, false);
        declareFunction("get_cyblack_basic_support_qua_list_element_self_deletion_mode", "GET-CYBLACK-BASIC-SUPPORT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 1, 0, false);
        declareFunction("set_cyblack_basic_support_qua_list_element_self_deletion_mode", "SET-CYBLACK-BASIC-SUPPORT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 2, 0, false);
        declareFunction("cyblack_basic_support_propagate_notify_method", "CYBLACK-BASIC-SUPPORT-PROPAGATE-NOTIFY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_remove_all_dependents_method", "CYBLACK-BASIC-SUPPORT-REMOVE-ALL-DEPENDENTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_get_all_dependents_method", "CYBLACK-BASIC-SUPPORT-GET-ALL-DEPENDENTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_remove_dependent_method", "CYBLACK-BASIC-SUPPORT-REMOVE-DEPENDENT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_add_dependent_method", "CYBLACK-BASIC-SUPPORT-ADD-DEPENDENT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_perform_action_method", "CYBLACK-BASIC-SUPPORT-PERFORM-ACTION-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_support_on_delete_method", "CYBLACK-BASIC-SUPPORT-ON-DELETE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_on_add_method", "CYBLACK-BASIC-SUPPORT-ON-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_get_collections_method", "CYBLACK-BASIC-SUPPORT-GET-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_member_p_method", "CYBLACK-BASIC-SUPPORT-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_delete_self_from_all_collections_method", "CYBLACK-BASIC-SUPPORT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_delete_self_from_collection_method", "CYBLACK-BASIC-SUPPORT-DELETE-SELF-FROM-COLLECTION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_delete_parent_link_method", "CYBLACK-BASIC-SUPPORT-DELETE-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_add_parent_link_method", "CYBLACK-BASIC-SUPPORT-ADD-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_support_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SUPPORT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_support_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SUPPORT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_support_p", "CYBLACK-BASIC-SUPPORT-P", 1, 0, false);
        declareFunction("cyblack_basic_support_get_parent_links_method", "CYBLACK-BASIC-SUPPORT-GET-PARENT-LINKS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_set_parent_links_method", "CYBLACK-BASIC-SUPPORT-SET-PARENT-LINKS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_get_self_deletion_mode_method", "CYBLACK-BASIC-SUPPORT-GET-SELF-DELETION-MODE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_set_self_deletion_mode_method", "CYBLACK-BASIC-SUPPORT-SET-SELF-DELETION-MODE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_initialize_method", "CYBLACK-BASIC-SUPPORT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_basic_dependent_dll_last_link", "GET-CYBLACK-BASIC-DEPENDENT-DLL-LAST-LINK", 1, 0, false);
        declareFunction("set_cyblack_basic_dependent_dll_last_link", "SET-CYBLACK-BASIC-DEPENDENT-DLL-LAST-LINK", 2, 0, false);
        declareFunction("get_cyblack_basic_dependent_dll_first_link", "GET-CYBLACK-BASIC-DEPENDENT-DLL-FIRST-LINK", 1, 0, false);
        declareFunction("set_cyblack_basic_dependent_dll_first_link", "SET-CYBLACK-BASIC-DEPENDENT-DLL-FIRST-LINK", 2, 0, false);
        declareFunction("get_cyblack_basic_dependent_dll_element_count", "GET-CYBLACK-BASIC-DEPENDENT-DLL-ELEMENT-COUNT", 1, 0, false);
        declareFunction("set_cyblack_basic_dependent_dll_element_count", "SET-CYBLACK-BASIC-DEPENDENT-DLL-ELEMENT-COUNT", 2, 0, false);
        declareFunction("get_cyblack_basic_dependent_dll_element_equality_predicate", "GET-CYBLACK-BASIC-DEPENDENT-DLL-ELEMENT-EQUALITY-PREDICATE", 1, 0, false);
        declareFunction("set_cyblack_basic_dependent_dll_element_equality_predicate", "SET-CYBLACK-BASIC-DEPENDENT-DLL-ELEMENT-EQUALITY-PREDICATE", 2, 0, false);
        declareFunction("cyblack_basic_dependent_support_state_change_method", "CYBLACK-BASIC-DEPENDENT-SUPPORT-STATE-CHANGE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_remove_all_supports_method", "CYBLACK-BASIC-DEPENDENT-REMOVE-ALL-SUPPORTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_get_all_supports_method", "CYBLACK-BASIC-DEPENDENT-GET-ALL-SUPPORTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_remove_support_notify_method", "CYBLACK-BASIC-DEPENDENT-REMOVE-SUPPORT-NOTIFY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_add_support_notify_method", "CYBLACK-BASIC-DEPENDENT-ADD-SUPPORT-NOTIFY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_swap_method", "CYBLACK-BASIC-DEPENDENT-SWAP-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_dependent_empty_p_method", "CYBLACK-BASIC-DEPENDENT-EMPTY-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_reverse_method", "CYBLACK-BASIC-DEPENDENT-REVERSE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_append_method", "CYBLACK-BASIC-DEPENDENT-APPEND-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_position_method", "CYBLACK-BASIC-DEPENDENT-POSITION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_set_nth_method", "CYBLACK-BASIC-DEPENDENT-SET-NTH-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_dependent_nth_method", "CYBLACK-BASIC-DEPENDENT-NTH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_but_last_method", "CYBLACK-BASIC-DEPENDENT-BUT-LAST-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_pop_method", "CYBLACK-BASIC-DEPENDENT-POP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_push_method", "CYBLACK-BASIC-DEPENDENT-PUSH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_member_p_method", "CYBLACK-BASIC-DEPENDENT-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_remove_method", "CYBLACK-BASIC-DEPENDENT-REMOVE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_add_method", "CYBLACK-BASIC-DEPENDENT-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_clear_method", "CYBLACK-BASIC-DEPENDENT-CLEAR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_print_method", "CYBLACK-BASIC-DEPENDENT-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_dependent_find_nth_link_method", "CYBLACK-BASIC-DEPENDENT-FIND-NTH-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_find_link_method", "CYBLACK-BASIC-DEPENDENT-FIND-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_reverse_link_method", "CYBLACK-BASIC-DEPENDENT-REVERSE-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_delete_link_method", "CYBLACK-BASIC-DEPENDENT-DELETE-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_set_contents_method", "CYBLACK-BASIC-DEPENDENT-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_get_contents_method", "CYBLACK-BASIC-DEPENDENT-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_element_equal_p_method", "CYBLACK-BASIC-DEPENDENT-ELEMENT-EQUAL-P-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_dependent_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DEPENDENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_dependent_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DEPENDENT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_dependent_p", "CYBLACK-BASIC-DEPENDENT-P", 1, 0, false);
        declareFunction("cyblack_basic_dependent_get_element_equality_predicate_method", "CYBLACK-BASIC-DEPENDENT-GET-ELEMENT-EQUALITY-PREDICATE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_set_element_equality_predicate_method", "CYBLACK-BASIC-DEPENDENT-SET-ELEMENT-EQUALITY-PREDICATE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_set_element_count_method", "CYBLACK-BASIC-DEPENDENT-SET-ELEMENT-COUNT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_inc_element_count_method", "CYBLACK-BASIC-DEPENDENT-INC-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_dec_element_count_method", "CYBLACK-BASIC-DEPENDENT-DEC-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_get_first_link_method", "CYBLACK-BASIC-DEPENDENT-GET-FIRST-LINK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_set_first_link_method", "CYBLACK-BASIC-DEPENDENT-SET-FIRST-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_get_last_link_method", "CYBLACK-BASIC-DEPENDENT-GET-LAST-LINK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_set_last_link_method", "CYBLACK-BASIC-DEPENDENT-SET-LAST-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_get_element_count_method", "CYBLACK-BASIC-DEPENDENT-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_allocate_enumerator_method", "CYBLACK-BASIC-DEPENDENT-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_dependent_deallocate_enumerator_method", "CYBLACK-BASIC-DEPENDENT-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_dependent_initialize_method", "CYBLACK-BASIC-DEPENDENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_basic_support_dependent_dll_last_link", "GET-CYBLACK-BASIC-SUPPORT-DEPENDENT-DLL-LAST-LINK", 1, 0, false);
        declareFunction("set_cyblack_basic_support_dependent_dll_last_link", "SET-CYBLACK-BASIC-SUPPORT-DEPENDENT-DLL-LAST-LINK", 2, 0, false);
        declareFunction("get_cyblack_basic_support_dependent_dll_first_link", "GET-CYBLACK-BASIC-SUPPORT-DEPENDENT-DLL-FIRST-LINK", 1, 0, false);
        declareFunction("set_cyblack_basic_support_dependent_dll_first_link", "SET-CYBLACK-BASIC-SUPPORT-DEPENDENT-DLL-FIRST-LINK", 2, 0, false);
        declareFunction("get_cyblack_basic_support_dependent_dll_element_count", "GET-CYBLACK-BASIC-SUPPORT-DEPENDENT-DLL-ELEMENT-COUNT", 1, 0, false);
        declareFunction("set_cyblack_basic_support_dependent_dll_element_count", "SET-CYBLACK-BASIC-SUPPORT-DEPENDENT-DLL-ELEMENT-COUNT", 2, 0, false);
        declareFunction("get_cyblack_basic_support_dependent_dll_element_equality_predicate", "GET-CYBLACK-BASIC-SUPPORT-DEPENDENT-DLL-ELEMENT-EQUALITY-PREDICATE", 1, 0, false);
        declareFunction("set_cyblack_basic_support_dependent_dll_element_equality_predicate", "SET-CYBLACK-BASIC-SUPPORT-DEPENDENT-DLL-ELEMENT-EQUALITY-PREDICATE", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_support_state_change_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-SUPPORT-STATE-CHANGE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_remove_all_supports_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-REMOVE-ALL-SUPPORTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_get_all_supports_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-ALL-SUPPORTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_remove_support_notify_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-REMOVE-SUPPORT-NOTIFY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_add_support_notify_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-ADD-SUPPORT-NOTIFY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_swap_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-SWAP-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_support_dependent_reverse_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-REVERSE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_append_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-APPEND-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_position_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-POSITION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_set_nth_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-NTH-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_support_dependent_nth_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-NTH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_but_last_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-BUT-LAST-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_pop_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-POP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_push_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-PUSH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_member_p_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_remove_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-REMOVE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_add_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_clear_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-CLEAR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_print_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_support_dependent_find_nth_link_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-FIND-NTH-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_find_link_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-FIND-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_reverse_link_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-REVERSE-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_delete_link_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-DELETE-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_set_contents_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_get_contents_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_element_equal_p_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-ELEMENT-EQUAL-P-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_support_dependent_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SUPPORT-DEPENDENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_support_dependent_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SUPPORT-DEPENDENT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_p", "CYBLACK-BASIC-SUPPORT-DEPENDENT-P", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_get_element_equality_predicate_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-ELEMENT-EQUALITY-PREDICATE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_set_element_equality_predicate_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-ELEMENT-EQUALITY-PREDICATE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_set_element_count_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-ELEMENT-COUNT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_inc_element_count_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-INC-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_dec_element_count_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-DEC-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_get_first_link_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-FIRST-LINK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_set_first_link_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-FIRST-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_get_last_link_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-LAST-LINK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_set_last_link_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-LAST-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_get_element_count_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_allocate_enumerator_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-ALLOCATE-ENUMERATOR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_support_dependent_deallocate_enumerator_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-DEALLOCATE-ENUMERATOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_support_dependent_initialize_method", "CYBLACK-BASIC-SUPPORT-DEPENDENT-INITIALIZE-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_support_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_support_file() {
                interfaces.new_interface(CYBLACK_SUPPORT, NIL, NIL, $list_alt1);
        interfaces.new_interface(CYBLACK_SUPPORT_TEMPLATE, $list_alt3, $list_alt4, $list_alt1);
        interfaces.interfaces_add_interface_instance_method(ADD_DEPENDENT, CYBLACK_SUPPORT_TEMPLATE, $list_alt6, $list_alt7, $list_alt8);
        interfaces.interfaces_add_interface_instance_method(REMOVE_DEPENDENT, CYBLACK_SUPPORT_TEMPLATE, $list_alt6, $list_alt10, $list_alt11);
        interfaces.interfaces_add_interface_instance_method(GET_ALL_DEPENDENTS, CYBLACK_SUPPORT_TEMPLATE, $list_alt6, NIL, $list_alt13);
        interfaces.interfaces_add_interface_instance_method(REMOVE_ALL_DEPENDENTS, CYBLACK_SUPPORT_TEMPLATE, $list_alt6, NIL, $list_alt15);
        interfaces.interfaces_add_interface_instance_method(PROPAGATE_NOTIFY, CYBLACK_SUPPORT_TEMPLATE, $list_alt6, NIL, $list_alt17);
        interfaces.new_interface(CYBLACK_DEPENDENT, $list_alt19, $list_alt20, $list_alt21);
        interfaces.new_interface(CYBLACK_DEPENDENT_TEMPLATE, $list_alt23, $list_alt24, $list_alt21);
        interfaces.interfaces_add_interface_instance_method(ADD_SUPPORT_NOTIFY, CYBLACK_DEPENDENT_TEMPLATE, $list_alt6, $list_alt26, $list_alt27);
        interfaces.interfaces_add_interface_instance_method(REMOVE_SUPPORT_NOTIFY, CYBLACK_DEPENDENT_TEMPLATE, $list_alt6, $list_alt26, $list_alt27);
        interfaces.interfaces_add_interface_instance_method(GET_ALL_SUPPORTS, CYBLACK_DEPENDENT_TEMPLATE, $list_alt6, NIL, $list_alt30);
        interfaces.interfaces_add_interface_instance_method(REMOVE_ALL_SUPPORTS, CYBLACK_DEPENDENT_TEMPLATE, $list_alt6, NIL, $list_alt32);
        interfaces.interfaces_add_interface_instance_method(SUPPORT_STATE_CHANGE, CYBLACK_DEPENDENT_TEMPLATE, $list_alt6, NIL, $list_alt34);
        classes.subloop_new_class(CYBLACK_BASIC_SUPPORT, CYBLACK_BASIC_LOCKABLE, $list_alt37, NIL, $list_alt38);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_SUPPORT, NIL);
        methods.methods_incorporate_instance_method(PROPAGATE_NOTIFY, CYBLACK_BASIC_SUPPORT, $list_alt6, NIL, $list_alt17);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, PROPAGATE_NOTIFY, CYBLACK_BASIC_SUPPORT_PROPAGATE_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_DEPENDENTS, CYBLACK_BASIC_SUPPORT, $list_alt6, NIL, $list_alt15);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, REMOVE_ALL_DEPENDENTS, CYBLACK_BASIC_SUPPORT_REMOVE_ALL_DEPENDENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_DEPENDENTS, CYBLACK_BASIC_SUPPORT, $list_alt6, NIL, $list_alt13);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, GET_ALL_DEPENDENTS, CYBLACK_BASIC_SUPPORT_GET_ALL_DEPENDENTS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DEPENDENT, CYBLACK_BASIC_SUPPORT, $list_alt6, $list_alt10, $list_alt11);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, REMOVE_DEPENDENT, CYBLACK_BASIC_SUPPORT_REMOVE_DEPENDENT_METHOD);
        methods.methods_incorporate_instance_method(ADD_DEPENDENT, CYBLACK_BASIC_SUPPORT, $list_alt6, $list_alt7, $list_alt8);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, ADD_DEPENDENT, CYBLACK_BASIC_SUPPORT_ADD_DEPENDENT_METHOD);
        methods.methods_incorporate_instance_method(PERFORM_ACTION, CYBLACK_BASIC_SUPPORT, $list_alt6, $list_alt50, $list_alt51);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, PERFORM_ACTION, CYBLACK_BASIC_SUPPORT_PERFORM_ACTION_METHOD);
        methods.methods_incorporate_instance_method(ON_DELETE, CYBLACK_BASIC_SUPPORT, $list_alt6, $list_alt54, $list_alt55);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, ON_DELETE, CYBLACK_BASIC_SUPPORT_ON_DELETE_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD, CYBLACK_BASIC_SUPPORT, $list_alt6, $list_alt54, $list_alt55);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, ON_ADD, CYBLACK_BASIC_SUPPORT_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_COLLECTIONS, CYBLACK_BASIC_SUPPORT, $list_alt6, NIL, $list_alt60);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, GET_COLLECTIONS, CYBLACK_BASIC_SUPPORT_GET_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_BASIC_SUPPORT, $list_alt6, $list_alt63, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, MEMBER_P, CYBLACK_BASIC_SUPPORT_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_ALL_COLLECTIONS, CYBLACK_BASIC_SUPPORT, $list_alt6, NIL, $list_alt67);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, DELETE_SELF_FROM_ALL_COLLECTIONS, CYBLACK_BASIC_SUPPORT_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_COLLECTION, CYBLACK_BASIC_SUPPORT, $list_alt6, $list_alt63, $list_alt70);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, DELETE_SELF_FROM_COLLECTION, CYBLACK_BASIC_SUPPORT_DELETE_SELF_FROM_COLLECTION_METHOD);
        methods.methods_incorporate_instance_method(DELETE_PARENT_LINK, CYBLACK_BASIC_SUPPORT, $list_alt6, $list_alt73, $list_alt74);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, DELETE_PARENT_LINK, CYBLACK_BASIC_SUPPORT_DELETE_PARENT_LINK_METHOD);
        methods.methods_incorporate_instance_method(ADD_PARENT_LINK, CYBLACK_BASIC_SUPPORT, $list_alt6, $list_alt77, $list_alt78);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, ADD_PARENT_LINK, CYBLACK_BASIC_SUPPORT_ADD_PARENT_LINK_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_SUPPORT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SUPPORT_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_SUPPORT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SUPPORT_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_support_class(CYBLACK_BASIC_SUPPORT);
        methods.methods_incorporate_instance_method(GET_PARENT_LINKS, CYBLACK_BASIC_SUPPORT, $list_alt92, NIL, $list_alt93);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, GET_PARENT_LINKS, CYBLACK_BASIC_SUPPORT_GET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT_LINKS, CYBLACK_BASIC_SUPPORT, $list_alt92, $list_alt97, $list_alt98);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, SET_PARENT_LINKS, CYBLACK_BASIC_SUPPORT_SET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_SELF_DELETION_MODE, CYBLACK_BASIC_SUPPORT, $list_alt92, NIL, $list_alt102);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, GET_SELF_DELETION_MODE, CYBLACK_BASIC_SUPPORT_GET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method(SET_SELF_DELETION_MODE, CYBLACK_BASIC_SUPPORT, $list_alt92, $list_alt106, $list_alt107);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, SET_SELF_DELETION_MODE, CYBLACK_BASIC_SUPPORT_SET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_SUPPORT, $list_alt92, NIL, $list_alt111);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT, INITIALIZE, CYBLACK_BASIC_SUPPORT_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_DEPENDENT, CYBLACK_BASIC_LOCKABLE, $list_alt115, NIL, $list_alt116);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_DEPENDENT, NIL);
        methods.methods_incorporate_instance_method(SUPPORT_STATE_CHANGE, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt34);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, SUPPORT_STATE_CHANGE, CYBLACK_BASIC_DEPENDENT_SUPPORT_STATE_CHANGE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_SUPPORTS, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt32);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, REMOVE_ALL_SUPPORTS, CYBLACK_BASIC_DEPENDENT_REMOVE_ALL_SUPPORTS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_SUPPORTS, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt30);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, GET_ALL_SUPPORTS, CYBLACK_BASIC_DEPENDENT_GET_ALL_SUPPORTS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SUPPORT_NOTIFY, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt26, $list_alt27);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, REMOVE_SUPPORT_NOTIFY, CYBLACK_BASIC_DEPENDENT_REMOVE_SUPPORT_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUPPORT_NOTIFY, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt26, $list_alt27);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, ADD_SUPPORT_NOTIFY, CYBLACK_BASIC_DEPENDENT_ADD_SUPPORT_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method(SWAP, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt127, $list_alt128);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, SWAP, CYBLACK_BASIC_DEPENDENT_SWAP_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt133);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, EMPTY_P, CYBLACK_BASIC_DEPENDENT_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(REVERSE, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt136);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, REVERSE, CYBLACK_BASIC_DEPENDENT_REVERSE_METHOD);
        methods.methods_incorporate_instance_method(APPEND, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt139, $list_alt140);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, APPEND, CYBLACK_BASIC_DEPENDENT_APPEND_METHOD);
        methods.methods_incorporate_instance_method(POSITION, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt147, $list_alt148);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, POSITION, CYBLACK_BASIC_DEPENDENT_POSITION_METHOD);
        methods.methods_incorporate_instance_method(SET_NTH, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt151, $list_alt152);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, SET_NTH, CYBLACK_BASIC_DEPENDENT_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method(NTH, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt155, $list_alt156);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, NTH, CYBLACK_BASIC_DEPENDENT_NTH_METHOD);
        methods.methods_incorporate_instance_method(BUT_LAST, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt159);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, BUT_LAST, CYBLACK_BASIC_DEPENDENT_BUT_LAST_METHOD);
        methods.methods_incorporate_instance_method(POP, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt162);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, POP, CYBLACK_BASIC_DEPENDENT_POP_METHOD);
        methods.methods_incorporate_instance_method(PUSH, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt165, $list_alt166);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, PUSH, CYBLACK_BASIC_DEPENDENT_PUSH_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt147, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, MEMBER_P, CYBLACK_BASIC_DEPENDENT_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt171, $list_alt172);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, REMOVE, CYBLACK_BASIC_DEPENDENT_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ADD, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt165, $list_alt174);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, ADD, CYBLACK_BASIC_DEPENDENT_ADD_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt177);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, CLEAR, CYBLACK_BASIC_DEPENDENT_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt180, $list_alt181);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, PRINT, CYBLACK_BASIC_DEPENDENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(FIND_NTH_LINK, CYBLACK_BASIC_DEPENDENT, $list_alt92, $list_alt155, $list_alt190);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, FIND_NTH_LINK, CYBLACK_BASIC_DEPENDENT_FIND_NTH_LINK_METHOD);
        methods.methods_incorporate_instance_method(FIND_LINK, CYBLACK_BASIC_DEPENDENT, $list_alt92, $list_alt147, $list_alt193);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, FIND_LINK, CYBLACK_BASIC_DEPENDENT_FIND_LINK_METHOD);
        methods.methods_incorporate_instance_method(REVERSE_LINK, CYBLACK_BASIC_DEPENDENT, $list_alt92, $list_alt196, $list_alt197);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, REVERSE_LINK, CYBLACK_BASIC_DEPENDENT_REVERSE_LINK_METHOD);
        methods.methods_incorporate_instance_method(DELETE_LINK, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt196, $list_alt200);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, DELETE_LINK, CYBLACK_BASIC_DEPENDENT_DELETE_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt206, $list_alt207);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, SET_CONTENTS, CYBLACK_BASIC_DEPENDENT_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt210);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, GET_CONTENTS, CYBLACK_BASIC_DEPENDENT_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(ELEMENT_EQUAL_P, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt127, $list_alt213);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, ELEMENT_EQUAL_P, CYBLACK_BASIC_DEPENDENT_ELEMENT_EQUAL_P_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_DEPENDENT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DEPENDENT_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_DEPENDENT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DEPENDENT_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_dependent_class(CYBLACK_BASIC_DEPENDENT);
        methods.methods_incorporate_instance_method(GET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt218);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, GET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_DEPENDENT_GET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(SET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt222, $list_alt223);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, SET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_DEPENDENT_SET_ELEMENT_EQUALITY_PREDICATE_METHOD);
        methods.methods_incorporate_instance_method(SET_ELEMENT_COUNT, CYBLACK_BASIC_DEPENDENT, $list_alt92, $list_alt227, $list_alt228);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, SET_ELEMENT_COUNT, CYBLACK_BASIC_DEPENDENT_SET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(INC_ELEMENT_COUNT, CYBLACK_BASIC_DEPENDENT, $list_alt92, NIL, $list_alt232);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, INC_ELEMENT_COUNT, CYBLACK_BASIC_DEPENDENT_INC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(DEC_ELEMENT_COUNT, CYBLACK_BASIC_DEPENDENT, $list_alt92, NIL, $list_alt236);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, DEC_ELEMENT_COUNT, CYBLACK_BASIC_DEPENDENT_DEC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_FIRST_LINK, CYBLACK_BASIC_DEPENDENT, $list_alt92, NIL, $list_alt240);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, GET_FIRST_LINK, CYBLACK_BASIC_DEPENDENT_GET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_FIRST_LINK, CYBLACK_BASIC_DEPENDENT, $list_alt92, $list_alt244, $list_alt245);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, SET_FIRST_LINK, CYBLACK_BASIC_DEPENDENT_SET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method(GET_LAST_LINK, CYBLACK_BASIC_DEPENDENT, $list_alt92, NIL, $list_alt249);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, GET_LAST_LINK, CYBLACK_BASIC_DEPENDENT_GET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_LAST_LINK, CYBLACK_BASIC_DEPENDENT, $list_alt92, $list_alt253, $list_alt254);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, SET_LAST_LINK, CYBLACK_BASIC_DEPENDENT_SET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt258);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, GET_ELEMENT_COUNT, CYBLACK_BASIC_DEPENDENT_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(ALLOCATE_ENUMERATOR, CYBLACK_BASIC_DEPENDENT, $list_alt6, NIL, $list_alt261);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, ALLOCATE_ENUMERATOR, CYBLACK_BASIC_DEPENDENT_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(DEALLOCATE_ENUMERATOR, CYBLACK_BASIC_DEPENDENT, $list_alt6, $list_alt266, $list_alt267);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, DEALLOCATE_ENUMERATOR, CYBLACK_BASIC_DEPENDENT_DEALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_DEPENDENT, $list_alt92, NIL, $list_alt269);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DEPENDENT, INITIALIZE, CYBLACK_BASIC_DEPENDENT_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_SUPPORT_DEPENDENT, CYBLACK_BASIC_SUPPORT, $list_alt115, NIL, $list_alt273);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_SUPPORT_DEPENDENT, NIL);
        methods.methods_incorporate_instance_method(SUPPORT_STATE_CHANGE, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, NIL, $list_alt34);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, SUPPORT_STATE_CHANGE, CYBLACK_BASIC_SUPPORT_DEPENDENT_SUPPORT_STATE_CHANGE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_SUPPORTS, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, NIL, $list_alt32);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, REMOVE_ALL_SUPPORTS, CYBLACK_BASIC_SUPPORT_DEPENDENT_REMOVE_ALL_SUPPORTS_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_SUPPORTS, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, NIL, $list_alt30);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, GET_ALL_SUPPORTS, CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_ALL_SUPPORTS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SUPPORT_NOTIFY, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt26, $list_alt27);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, REMOVE_SUPPORT_NOTIFY, CYBLACK_BASIC_SUPPORT_DEPENDENT_REMOVE_SUPPORT_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUPPORT_NOTIFY, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt26, $list_alt27);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, ADD_SUPPORT_NOTIFY, CYBLACK_BASIC_SUPPORT_DEPENDENT_ADD_SUPPORT_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method(SWAP, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt127, $list_alt128);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, SWAP, CYBLACK_BASIC_SUPPORT_DEPENDENT_SWAP_METHOD);
        methods.methods_incorporate_instance_method(REVERSE, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, NIL, $list_alt136);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, REVERSE, CYBLACK_BASIC_SUPPORT_DEPENDENT_REVERSE_METHOD);
        methods.methods_incorporate_instance_method(APPEND, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt139, $list_alt140);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, APPEND, CYBLACK_BASIC_SUPPORT_DEPENDENT_APPEND_METHOD);
        methods.methods_incorporate_instance_method(POSITION, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt147, $list_alt148);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, POSITION, CYBLACK_BASIC_SUPPORT_DEPENDENT_POSITION_METHOD);
        methods.methods_incorporate_instance_method(SET_NTH, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt151, $list_alt152);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, SET_NTH, CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method(NTH, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt155, $list_alt156);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, NTH, CYBLACK_BASIC_SUPPORT_DEPENDENT_NTH_METHOD);
        methods.methods_incorporate_instance_method(BUT_LAST, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, NIL, $list_alt159);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, BUT_LAST, CYBLACK_BASIC_SUPPORT_DEPENDENT_BUT_LAST_METHOD);
        methods.methods_incorporate_instance_method(POP, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, NIL, $list_alt162);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, POP, CYBLACK_BASIC_SUPPORT_DEPENDENT_POP_METHOD);
        methods.methods_incorporate_instance_method(PUSH, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt165, $list_alt166);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, PUSH, CYBLACK_BASIC_SUPPORT_DEPENDENT_PUSH_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt147, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, MEMBER_P, CYBLACK_BASIC_SUPPORT_DEPENDENT_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt171, $list_alt172);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, REMOVE, CYBLACK_BASIC_SUPPORT_DEPENDENT_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ADD, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt165, $list_alt174);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, ADD, CYBLACK_BASIC_SUPPORT_DEPENDENT_ADD_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, NIL, $list_alt177);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, CLEAR, CYBLACK_BASIC_SUPPORT_DEPENDENT_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt180, $list_alt181);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, PRINT, CYBLACK_BASIC_SUPPORT_DEPENDENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(FIND_NTH_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt92, $list_alt155, $list_alt190);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, FIND_NTH_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT_FIND_NTH_LINK_METHOD);
        methods.methods_incorporate_instance_method(FIND_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt92, $list_alt147, $list_alt193);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, FIND_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT_FIND_LINK_METHOD);
        methods.methods_incorporate_instance_method(REVERSE_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt92, $list_alt196, $list_alt197);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, REVERSE_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT_REVERSE_LINK_METHOD);
        methods.methods_incorporate_instance_method(DELETE_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt196, $list_alt200);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, DELETE_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT_DELETE_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt206, $list_alt207);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, SET_CONTENTS, CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, NIL, $list_alt210);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, GET_CONTENTS, CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(ELEMENT_EQUAL_P, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt127, $list_alt213);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, ELEMENT_EQUAL_P, CYBLACK_BASIC_SUPPORT_DEPENDENT_ELEMENT_EQUAL_P_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_SUPPORT_DEPENDENT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SUPPORT_DEPENDENT_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_SUPPORT_DEPENDENT, $sym301$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SUPPORT_DEPENDENT_INSTA);
        subloop_reserved_initialize_cyblack_basic_support_dependent_class(CYBLACK_BASIC_SUPPORT_DEPENDENT);
        methods.methods_incorporate_instance_method(GET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, NIL, $list_alt218);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, GET_ELEMENT_EQUALITY_PREDICATE, $sym303$CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_ELEMENT_EQUALITY_PREDICATE_ME);
        methods.methods_incorporate_instance_method(SET_ELEMENT_EQUALITY_PREDICATE, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt222, $list_alt223);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, SET_ELEMENT_EQUALITY_PREDICATE, $sym305$CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_ELEMENT_EQUALITY_PREDICATE_ME);
        methods.methods_incorporate_instance_method(SET_ELEMENT_COUNT, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt92, $list_alt227, $list_alt228);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, SET_ELEMENT_COUNT, CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(INC_ELEMENT_COUNT, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt92, NIL, $list_alt232);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, INC_ELEMENT_COUNT, CYBLACK_BASIC_SUPPORT_DEPENDENT_INC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(DEC_ELEMENT_COUNT, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt92, NIL, $list_alt236);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, DEC_ELEMENT_COUNT, CYBLACK_BASIC_SUPPORT_DEPENDENT_DEC_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_FIRST_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt92, NIL, $list_alt240);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, GET_FIRST_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_FIRST_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt92, $list_alt244, $list_alt245);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, SET_FIRST_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_FIRST_LINK_METHOD);
        methods.methods_incorporate_instance_method(GET_LAST_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt92, NIL, $list_alt249);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, GET_LAST_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method(SET_LAST_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt92, $list_alt253, $list_alt254);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, SET_LAST_LINK, CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_LAST_LINK_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, NIL, $list_alt258);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, GET_ELEMENT_COUNT, CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(ALLOCATE_ENUMERATOR, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, NIL, $list_alt261);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, ALLOCATE_ENUMERATOR, CYBLACK_BASIC_SUPPORT_DEPENDENT_ALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(DEALLOCATE_ENUMERATOR, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt6, $list_alt266, $list_alt267);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, DEALLOCATE_ENUMERATOR, CYBLACK_BASIC_SUPPORT_DEPENDENT_DEALLOCATE_ENUMERATOR_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_SUPPORT_DEPENDENT, $list_alt92, NIL, $list_alt269);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SUPPORT_DEPENDENT, INITIALIZE, CYBLACK_BASIC_SUPPORT_DEPENDENT_INITIALIZE_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_SUPPORT = makeSymbol("CYBLACK-SUPPORT");

    static private final SubLList $list_alt1 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DEPENDENT"), list(makeSymbol("NEW-DEPENDENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DEPENDENT"), list(makeSymbol("OLD-DEPENDENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-DEPENDENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-DEPENDENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPAGATE-NOTIFY"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_SUPPORT_TEMPLATE = makeSymbol("CYBLACK-SUPPORT-TEMPLATE");

    static private final SubLList $list_alt3 = list(makeSymbol("LIST-ELEMENT-TEMPLATE"), makeSymbol("CYBLACK-SUPPORT"));

    static private final SubLList $list_alt4 = list(makeKeyword("EXTENDS"), list(makeSymbol("LIST-ELEMENT-TEMPLATE"), makeSymbol("CYBLACK-SUPPORT")));

    private static final SubLSymbol ADD_DEPENDENT = makeSymbol("ADD-DEPENDENT");

    static private final SubLList $list_alt6 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt7 = list(makeSymbol("NEW-DEPENDENT"));

    static private final SubLList $list_alt8 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-DEPENDENT-TEMPLATE-P"), makeSymbol("NEW-DEPENDENT")), makeString("(ADD-DEPENDENT ~S): ~S is not a valid instance of CYBLACK-DEPENDENT-TEMPLATE."), makeSymbol("SELF"), makeSymbol("NEW-DEPENDENT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-DEPENDENT"), list(QUOTE, makeSymbol("ADD")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-DEPENDENT"), list(QUOTE, makeSymbol("ADD-SUPPORT-NOTIFY")), makeSymbol("SELF")), list(RET, makeSymbol("NEW-DEPENDENT")));



    static private final SubLList $list_alt10 = list(makeSymbol("OLD-DEPENDENT"));

    static private final SubLList $list_alt11 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-DEPENDENT-TEMPLATE-P"), makeSymbol("OLD-DEPENDENT")), makeString("(REMOVE-DEPENDENT ~S): ~S is not a valid instance of CYBLACK-DEPENDENT-TEMPLATE."), makeSymbol("SELF"), makeSymbol("OLD-DEPENDENT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-DEPENDENT"), list(QUOTE, makeSymbol("REMOVE-SUPPORT-NOTIFY")), makeSymbol("SELF")), list(makeSymbol("DELETE-SELF-FROM-COLLECTION"), makeSymbol("SELF"), makeSymbol("OLD-DEPENDENT")), list(RET, makeSymbol("OLD-DEPENDENT")));

    private static final SubLSymbol GET_ALL_DEPENDENTS = makeSymbol("GET-ALL-DEPENDENTS");

    static private final SubLList $list_alt13 = list(list(RET, list(makeSymbol("GET-COLLECTIONS"), makeSymbol("SELF"))));



    static private final SubLList $list_alt15 = list(list(makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), makeSymbol("SELF")), list(RET, NIL));

    private static final SubLSymbol PROPAGATE_NOTIFY = makeSymbol("PROPAGATE-NOTIFY");

    static private final SubLList $list_alt17 = list(list(makeSymbol("CLET"), list(list(makeSymbol("COLLECTIONS"), list(makeSymbol("GET-COLLECTIONS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("COLLECTION"), makeSymbol("COLLECTIONS")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-DEPENDENT-P"), makeSymbol("COLLECTION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("COLLECTION"), list(QUOTE, makeSymbol("SUPPORT-STATE-CHANGE")))), list(makeSymbol("CLET"), list(list(makeSymbol("CONTENTS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("COLLECTION"), list(QUOTE, makeSymbol("GET-CONTENTS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), makeSymbol("CONTENTS")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-SUPPORT-P"), makeSymbol("ELEMENT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT"), list(QUOTE, makeSymbol("PROPAGATE-NOTIFY")))))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_DEPENDENT = makeSymbol("CYBLACK-DEPENDENT");

    static private final SubLList $list_alt19 = list(makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE"));

    static private final SubLList $list_alt20 = list(makeKeyword("EXTENDS"), list(makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE")));

    static private final SubLList $list_alt21 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUPPORT-NOTIFY"), list(makeSymbol("SUPPORT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUPPORT-NOTIFY"), list(makeSymbol("SUPPORT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-SUPPORTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-SUPPORTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUPPORT-STATE-CHANGE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_DEPENDENT_TEMPLATE = makeSymbol("CYBLACK-DEPENDENT-TEMPLATE");

    static private final SubLList $list_alt23 = list(makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE"), makeSymbol("CYBLACK-DEPENDENT"));

    static private final SubLList $list_alt24 = list(makeKeyword("EXTENDS"), list(makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE"), makeSymbol("CYBLACK-DEPENDENT")));



    static private final SubLList $list_alt26 = list(makeSymbol("SUPPORT"));

    static private final SubLList $list_alt27 = list(list(RET, makeSymbol("SUPPORT")));



    private static final SubLSymbol GET_ALL_SUPPORTS = makeSymbol("GET-ALL-SUPPORTS");

    static private final SubLList $list_alt30 = list(list(RET, list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF"))));

    private static final SubLSymbol REMOVE_ALL_SUPPORTS = makeSymbol("REMOVE-ALL-SUPPORTS");

    static private final SubLList $list_alt32 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONTENTS"), list(makeSymbol("GET-ALL-SUPPORTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), makeSymbol("CONTENTS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT"), list(QUOTE, makeSymbol("REMOVE-DEPENDENT")), makeSymbol("SELF")))), list(RET, NIL));

    private static final SubLSymbol SUPPORT_STATE_CHANGE = makeSymbol("SUPPORT-STATE-CHANGE");

    static private final SubLList $list_alt34 = list(list(RET, NIL));





    static private final SubLList $list_alt37 = list(makeSymbol("CYBLACK-SUPPORT-TEMPLATE"));

    static private final SubLList $list_alt38 = list(new SubLObject[]{ list(makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT-LINKS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT-LINKS"), list(makeSymbol("NEW-PARENT-LINKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PARENT-LINK"), list(makeSymbol("NEW-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-PARENT-LINK"), list(makeSymbol("OLD-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SELF-DELETION-MODE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SELF-DELETION-MODE"), list(makeSymbol("MODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-COLLECTION"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTION"), makeSymbol("PARAMETERS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DEPENDENT"), list(makeSymbol("NEW-DEPENDENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DEPENDENT"), list(makeSymbol("OLD-DEPENDENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-DEPENDENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-DEPENDENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPAGATE-NOTIFY"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")) });





    public static final SubLInteger $int$4097 = makeInteger(4097);



    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_PROPAGATE_NOTIFY_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-PROPAGATE-NOTIFY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_REMOVE_ALL_DEPENDENTS_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-REMOVE-ALL-DEPENDENTS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_GET_ALL_DEPENDENTS_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-GET-ALL-DEPENDENTS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_REMOVE_DEPENDENT_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-REMOVE-DEPENDENT-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_ADD_DEPENDENT_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-ADD-DEPENDENT-METHOD");



    static private final SubLList $list_alt50 = list(makeSymbol("ACTION"), makeSymbol("PARAMETERS"));

    static private final SubLList $list_alt51 = list(list(makeSymbol("IGNORE"), makeSymbol("ACTION"), makeSymbol("PARAMETERS")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_PERFORM_ACTION_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-PERFORM-ACTION-METHOD");



    static private final SubLList $list_alt54 = list(makeSymbol("PARENT-LIST"));

    static private final SubLList $list_alt55 = list(list(makeSymbol("IGNORE"), makeSymbol("PARENT-LIST")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_ON_DELETE_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-ON-DELETE-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_ON_ADD_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-ON-ADD-METHOD");



    static private final SubLList $list_alt60 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-COLLECTIONS"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS"), makeSymbol("TEMPLATE-COLLECTIONS")), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK"))), list(RET, list(makeSymbol("UNIQUE-ELEMENTS"), makeSymbol("TEMPLATE-COLLECTIONS")))));

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_GET_COLLECTIONS_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-GET-COLLECTIONS-METHOD");



    static private final SubLList $list_alt63 = list(makeSymbol("COLLECTION"));

    static private final SubLList $list_alt64 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(RET, T))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_MEMBER_P_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-MEMBER-P-METHOD");



    static private final SubLList $list_alt67 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), NIL))), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), NIL)), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD");



    static private final SubLList $list_alt70 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), makeSymbol("COLLECTION")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DELETE_SELF_FROM_COLLECTION_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DELETE-SELF-FROM-COLLECTION-METHOD");



    static private final SubLList $list_alt73 = list(makeSymbol("OLD-PARENT-LINK"));

    static private final SubLList $list_alt74 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OLD-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), list(makeSymbol("DLC-OWNER"), makeSymbol("OLD-PARENT-LINK"))), list(RET, makeSymbol("OLD-PARENT-LINK"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))))))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DELETE_PARENT_LINK_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DELETE-PARENT-LINK-METHOD");



    static private final SubLList $list_alt77 = list(makeSymbol("NEW-PARENT-LINK"));

    static private final SubLList $list_alt78 = list(list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("NEW-PARENT-LINK"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ADD")), list(makeSymbol("DLC-OWNER"), makeSymbol("NEW-PARENT-LINK"))), list(RET, makeSymbol("NEW-PARENT-LINK")));

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_ADD_PARENT_LINK_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-ADD-PARENT-LINK-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SUPPORT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SUPPORT-CLASS");















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SUPPORT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SUPPORT-INSTANCE");



    static private final SubLList $list_alt92 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt93 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS")));

    static private final SubLSymbol $sym94$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_GET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-GET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt97 = list(makeSymbol("NEW-PARENT-LINKS"));

    static private final SubLList $list_alt98 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeSymbol("NEW-PARENT-LINKS")), list(RET, makeSymbol("NEW-PARENT-LINKS")));

    static private final SubLSymbol $sym99$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_SET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-SET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt102 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE")));

    static private final SubLSymbol $sym103$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_GET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-GET-SELF-DELETION-MODE-METHOD");



    static private final SubLList $list_alt106 = list(makeSymbol("MODE"));

    static private final SubLList $list_alt107 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeSymbol("MODE")), list(RET, makeSymbol("MODE")));

    static private final SubLSymbol $sym108$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_SET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-SET-SELF-DELETION-MODE-METHOD");



    static private final SubLList $list_alt111 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym112$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT = makeSymbol("CYBLACK-BASIC-DEPENDENT");

    static private final SubLList $list_alt115 = list(makeSymbol("CYBLACK-DEPENDENT-TEMPLATE"));

    static private final SubLList $list_alt116 = list(new SubLObject[]{ list(makeSymbol("DLL-ELEMENT-EQUALITY-PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DLL-ELEMENT-COUNT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DLL-FIRST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DLL-LAST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-EQUALITY-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ELEMENT-EQUAL-P"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-COUNT"), list(makeSymbol("NEW-ELEMENT-COUNT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-LINK"), list(makeSymbol("NEW-FIRST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LAST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LAST-LINK"), list(makeSymbol("NEW-LAST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-LINK"), list(makeSymbol("LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE-LINK"), list(makeSymbol("LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-LINK"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-NTH-LINK"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PUSH"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BUT-LAST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NTH"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSITION"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPEND"), list(makeSymbol("OTHER-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SWAP"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("ENUMERATOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUPPORT-NOTIFY"), list(makeSymbol("SUPPORT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUPPORT-NOTIFY"), list(makeSymbol("SUPPORT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-SUPPORTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-SUPPORTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUPPORT-STATE-CHANGE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")) });









    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_SUPPORT_STATE_CHANGE_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-SUPPORT-STATE-CHANGE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_REMOVE_ALL_SUPPORTS_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-REMOVE-ALL-SUPPORTS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_GET_ALL_SUPPORTS_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-GET-ALL-SUPPORTS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_REMOVE_SUPPORT_NOTIFY_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-REMOVE-SUPPORT-NOTIFY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_ADD_SUPPORT_NOTIFY_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-ADD-SUPPORT-NOTIFY-METHOD");



    static private final SubLList $list_alt127 = list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2"));

    static private final SubLList $list_alt128 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), list(RET, NIL)), list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeString("(SWAP ~S): Cannot swap NIL elements."), makeSymbol("SELF")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LINK1"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT1"))), list(makeSymbol("LINK2"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT2")))), list(makeSymbol("MUST"), makeSymbol("LINK1"), makeString("(SWAP ~S): ~S is not an element of this list."), makeSymbol("SELF"), makeSymbol("ELEMENT1")), list(makeSymbol("MUST"), makeSymbol("LINK2"), makeString("(SWAP ~S): ~S is not an element of this list."), makeSymbol("SELF"), makeSymbol("ELEMENT2")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("ELEMENT1")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT1"), list(QUOTE, makeSymbol("DELETE-PARENT-LINK")), makeSymbol("LINK1")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT1"), list(QUOTE, makeSymbol("ADD-PARENT-LINK")), makeSymbol("LINK2"))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("ELEMENT2")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT2"), list(QUOTE, makeSymbol("DELETE-PARENT-LINK")), makeSymbol("LINK2")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ELEMENT2"), list(QUOTE, makeSymbol("ADD-PARENT-LINK")), makeSymbol("LINK1"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK1")), makeSymbol("ELEMENT2")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK2")), makeSymbol("ELEMENT1")), list(RET, NIL) }));

    static private final SubLString $str_alt129$_SWAP__S___Cannot_swap_NIL_elemen = makeString("(SWAP ~S): Cannot swap NIL elements.");

    static private final SubLString $str_alt130$_SWAP__S____S_is_not_an_element_o = makeString("(SWAP ~S): ~S is not an element of this list.");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_SWAP_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-SWAP-METHOD");



    static private final SubLList $list_alt133 = list(list(RET, list(makeSymbol("NULL"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_EMPTY_P_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-EMPTY-P-METHOD");



    static private final SubLList $list_alt136 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-FIRST-LINK"), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("TEMPLATE-LAST-LINK")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-FIRST-LINK")), makeSymbol("TEMPLATE-NEXT-LINK")), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-NEXT-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-CURRENT-LINK"))), list(makeSymbol("REVERSE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-CURRENT-LINK")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-NEXT-LINK"))), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LAST-LINK")), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-FIRST-LINK"))), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_REVERSE_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-REVERSE-METHOD");



    static private final SubLList $list_alt139 = list(makeSymbol("OTHER-LIST"));

    static private final SubLList $list_alt140 = list(list(makeSymbol("PUNLESS"), makeSymbol("OTHER-LIST"), list(RET, makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("CONSP"), makeSymbol("OTHER-LIST")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("OTHER-LIST")), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(RET, makeSymbol("SELF"))), list(makeSymbol("MUST"), list(makeSymbol("LIST-TEMPLATE-P"), makeSymbol("OTHER-LIST")), makeString("(APPEND ~S): Cannot append non list ~S."), makeSymbol("SELF"), makeSymbol("OTHER-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OTHER-LIST"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(RET, makeSymbol("SELF"))))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt141$_APPEND__S___Cannot_append_non_li = makeString("(APPEND ~S): Cannot append non list ~S.");







    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_APPEND_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-APPEND-METHOD");



    static private final SubLList $list_alt147 = list(makeSymbol("ELEMENT"));

    static private final SubLList $list_alt148 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("COUNT"), ZERO_INTEGER)), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-LINKS"), list(RET, NIL)), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("ELEMENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINKS"))), list(RET, makeSymbol("COUNT"))), list(makeSymbol("CINC"), makeSymbol("COUNT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_POSITION_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-POSITION-METHOD");



    static private final SubLList $list_alt151 = list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt152 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-NTH-LINK"), makeSymbol("SELF"), makeSymbol("INDEX")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("TEMPLATE-CONTENT")), list(makeSymbol("GENERIC-DLLT-DELETE-PARENT-LINK-FUNCTION"), makeSymbol("TEMPLATE-CONTENT"), makeSymbol("TEMPLATE-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-LINK")))), list(RET, makeSymbol("NEW-ELEMENT")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_SET_NTH_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-SET-NTH-METHOD");



    static private final SubLList $list_alt155 = list(makeSymbol("INDEX"));

    static private final SubLList $list_alt156 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-NTH-LINK"), makeSymbol("SELF"), makeSymbol("INDEX")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINK")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_NTH_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-NTH-METHOD");



    static private final SubLList $list_alt159 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LAST-LINK")))), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LAST-LINK")), list(RET, makeSymbol("TEMPLATE-CONTENTS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_BUT_LAST_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-BUT-LAST-METHOD");



    static private final SubLList $list_alt162 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-FIRST-LINK")))), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-FIRST-LINK")), list(RET, makeSymbol("TEMPLATE-CONTENTS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_POP_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-POP-METHOD");



    static private final SubLList $list_alt165 = list(makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt166 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-NEW-LINK"), list(makeSymbol("MAKE-DOUBLE-LINK-CELL")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("SELF")), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("PROGN"), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("TEMPLATE-FIRST-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-FIRST-LINK")), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")))), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("INC-ELEMENT-COUNT"), makeSymbol("SELF")), list(RET, makeSymbol("NEW-ELEMENT"))));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_PUSH_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-PUSH-METHOD");

    static private final SubLList $list_alt168 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("ELEMENT")))), list(RET, list(makeSymbol("FIF"), makeSymbol("TEMPLATE-LINK"), T, NIL))));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_MEMBER_P_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-MEMBER-P-METHOD");



    static private final SubLList $list_alt171 = list(makeSymbol("OLD-ELEMENT"));

    static private final SubLList $list_alt172 = list(list(makeSymbol("PIF"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("OLD-ELEMENT")), list(makeSymbol("GENERIC-DLLT-DELETE-SELF-FROM-COLLECTION-FUNCTION"), makeSymbol("OLD-ELEMENT"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINK"), list(makeSymbol("FIND-LINK"), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LINK"), list(makeSymbol("DELETE-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LINK"))))), list(RET, makeSymbol("OLD-ELEMENT")));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_REMOVE_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-REMOVE-METHOD");

    static private final SubLList $list_alt174 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-NEW-LINK"), list(makeSymbol("MAKE-DOUBLE-LINK-CELL"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("NEW-ELEMENT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("SELF")), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("PROGN"), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LAST-LINK")), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-NEW-LINK")), makeSymbol("TEMPLATE-LAST-LINK"))), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK"))), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-NEW-LINK")), list(makeSymbol("PWHEN"), list(makeSymbol("LIST-ELEMENT-TEMPLATE-P"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("GENERIC-DLLT-ADD-PARENT-LINK-FUNCTION"), makeSymbol("NEW-ELEMENT"), makeSymbol("TEMPLATE-NEW-LINK")))), list(makeSymbol("INC-ELEMENT-COUNT"), makeSymbol("SELF")), list(RET, makeSymbol("NEW-ELEMENT")));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_ADD_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-ADD-METHOD");



    static private final SubLList $list_alt177 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_CLEAR_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-CLEAR-METHOD");



    static private final SubLList $list_alt180 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt181 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), list(makeSymbol("CLASS-OF"), makeSymbol("SELF"))), list(RET, makeSymbol("SELF"))), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DLIST[]"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("DLIST[~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("FIRST")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]")))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt182$___S_Class_is_not_correctly_imple = makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>");

    static private final SubLString $str_alt183$DLIST__ = makeString("DLIST[]");

    static private final SubLString $str_alt184$DLIST__S = makeString("DLIST[~S");



    static private final SubLString $str_alt186$___S = makeString(", ~S");

    static private final SubLString $str_alt187$_ = makeString("]");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-PRINT-METHOD");



    static private final SubLList $list_alt190 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("COUNT"), ZERO_INTEGER)), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("COUNT"), makeSymbol("INDEX")), list(RET, makeSymbol("TEMPLATE-LINKS"))), list(makeSymbol("CINC"), makeSymbol("COUNT")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_FIND_NTH_LINK_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-FIND-NTH-LINK-METHOD");



    static private final SubLList $list_alt193 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("PWHEN"), list(makeSymbol("ELEMENT-EQUAL-P"), makeSymbol("SELF"), makeSymbol("ELEMENT"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-LINKS"))), list(RET, makeSymbol("TEMPLATE-LINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LINKS"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-LINKS")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_FIND_LINK_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-FIND-LINK-METHOD");



    static private final SubLList $list_alt196 = list(makeSymbol("LINK"));

    static private final SubLList $list_alt197 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK"))), list(makeSymbol("TEMPLATE-NEXT"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), makeSymbol("TEMPLATE-NEXT")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), makeSymbol("TEMPLATE-PREVIOUS")), list(RET, makeSymbol("LINK"))));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_REVERSE_LINK_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-REVERSE-LINK-METHOD");



    static private final SubLList $list_alt200 = list(list(makeSymbol("MUST"), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("LINK")), makeString("(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("LINK")), list(makeSymbol("MUST"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("LINK")), makeSymbol("SELF")), makeString("(DELETE-LINK ~S): Link ~S is not owned by list ~S."), makeSymbol("SELF"), makeSymbol("LINK"), makeSymbol("SELF")), list(makeSymbol("DEC-ELEMENT-COUNT"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-LAST-LINK"), list(makeSymbol("GET-LAST-LINK"), makeSymbol("SELF")))), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("TEMPLATE-LAST-LINK")), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("TEMPLATE-FIRST-LINK")), list(makeSymbol("CNOT"), makeSymbol("TEMPLATE-LAST-LINK")))), makeString("(DELETE-LINK ~S): Detected inconsistancy in list."), makeSymbol("SELF")), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-FIRST-LINK"), makeSymbol("LINK")), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-LAST-LINK"), makeSymbol("LINK")), list(makeSymbol("PROGN"), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SECOND-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-SECOND-LINK")), NIL), list(makeSymbol("SET-FIRST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-SECOND-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK"))))), list(makeSymbol("PIF"), list(EQ, makeSymbol("TEMPLATE-LAST-LINK"), makeSymbol("LINK")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SECOND-LINK"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-SECOND-LINK")), NIL), list(makeSymbol("SET-LAST-LINK"), makeSymbol("SELF"), makeSymbol("TEMPLATE-SECOND-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-BEFORE-LINK"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK"))), list(makeSymbol("TEMPLATE-AFTER-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-BEFORE-LINK")), makeSymbol("TEMPLATE-AFTER-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("TEMPLATE-AFTER-LINK")), makeSymbol("TEMPLATE-BEFORE-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-NEXT"), makeSymbol("LINK")), NIL), list(makeSymbol("CSETF"), list(makeSymbol("DLC-PREVIOUS"), makeSymbol("LINK")), NIL), list(RET, list(makeSymbol("DLC-CONTENTS"), makeSymbol("LINK"))))))));

    static private final SubLString $str_alt201$_DELETE_LINK__S____S_is_not_a_val = makeString("(DELETE-LINK ~S): ~S is not a valid link.  Expecting an instance of DOUBLE-LINK-CELL.");

    static private final SubLString $str_alt202$_DELETE_LINK__S___Link__S_is_not_ = makeString("(DELETE-LINK ~S): Link ~S is not owned by list ~S.");

    static private final SubLString $str_alt203$_DELETE_LINK__S___Detected_incons = makeString("(DELETE-LINK ~S): Detected inconsistancy in list.");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_DELETE_LINK_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-DELETE-LINK-METHOD");



    static private final SubLList $list_alt206 = list(makeSymbol("NEW-CONTENTS"));

    static private final SubLList $list_alt207 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list."), makeSymbol("SELF"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), list(makeSymbol("GET-CONTENTS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-ELEMENT"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("ADD"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ELEMENT"))), list(RET, makeSymbol("NEW-CONTENTS")));

    static private final SubLString $str_alt208$_SET_CONTENTS__S___Cannot_set_the = makeString("(SET-CONTENTS ~S): Cannot set the contents of the list to ~S.  ~S is not a LISP list.");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_SET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-SET-CONTENTS-METHOD");

    static private final SubLList $list_alt210 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CONTENTS"), NIL), list(makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("GET-FIRST-LINK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-FIRST-LINK"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-LINK"), makeSymbol("TEMPLATE-FIRST-LINK"))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("CPUSH"), list(makeSymbol("DLC-CONTENTS"), makeSymbol("TEMPLATE-CURRENT-LINK")), makeSymbol("TEMPLATE-CONTENTS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-LINK"), list(makeSymbol("DLC-NEXT"), makeSymbol("TEMPLATE-CURRENT-LINK")))))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("TEMPLATE-CONTENTS")))));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_GET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-GET-CONTENTS-METHOD");



    static private final SubLList $list_alt213 = list(list(RET, list(EQUAL, makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2"))));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_ELEMENT_EQUAL_P_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-ELEMENT-EQUAL-P-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DEPENDENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DEPENDENT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DEPENDENT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DEPENDENT-INSTANCE");



    static private final SubLList $list_alt218 = list(list(RET, makeSymbol("DLL-ELEMENT-EQUALITY-PREDICATE")));

    static private final SubLSymbol $sym219$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_GET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-GET-ELEMENT-EQUALITY-PREDICATE-METHOD");



    static private final SubLList $list_alt222 = list(makeSymbol("NEW-PREDICATE"));

    static private final SubLList $list_alt223 = list(list(makeSymbol("CSETQ"), makeSymbol("DLL-ELEMENT-EQUALITY-PREDICATE"), makeSymbol("NEW-PREDICATE")), list(RET, makeSymbol("NEW-PREDICATE")));

    static private final SubLSymbol $sym224$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_SET_ELEMENT_EQUALITY_PREDICATE_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-SET-ELEMENT-EQUALITY-PREDICATE-METHOD");



    static private final SubLList $list_alt227 = list(makeSymbol("NEW-ELEMENT-COUNT"));

    static private final SubLList $list_alt228 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-ELEMENT-COUNT")), makeString("(SET-ELEMENT-COUNT ~S): ~S is not a legal element count value.  Expecting an integer."), makeSymbol("SELF"), makeSymbol("NEW-ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("DLL-ELEMENT-COUNT"), makeSymbol("NEW-ELEMENT-COUNT")), list(RET, makeSymbol("NEW-ELEMENT-COUNT")));

    static private final SubLSymbol $sym229$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_SET_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-SET-ELEMENT-COUNT-METHOD");



    static private final SubLList $list_alt232 = list(list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("DLL-ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("DLL-ELEMENT-COUNT"), ONE_INTEGER), list(makeSymbol("CINC"), makeSymbol("DLL-ELEMENT-COUNT"))), list(RET, makeSymbol("DLL-ELEMENT-COUNT")));

    static private final SubLSymbol $sym233$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_INC_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-INC-ELEMENT-COUNT-METHOD");



    static private final SubLList $list_alt236 = list(list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("DLL-ELEMENT-COUNT")), list(makeSymbol("CSETQ"), makeSymbol("DLL-ELEMENT-COUNT"), ZERO_INTEGER), list(makeSymbol("CDEC"), makeSymbol("DLL-ELEMENT-COUNT"))), list(RET, makeSymbol("DLL-ELEMENT-COUNT")));

    static private final SubLSymbol $sym237$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_DEC_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-DEC-ELEMENT-COUNT-METHOD");



    static private final SubLList $list_alt240 = list(list(RET, makeSymbol("DLL-FIRST-LINK")));

    static private final SubLSymbol $sym241$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_GET_FIRST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-GET-FIRST-LINK-METHOD");



    static private final SubLList $list_alt244 = list(makeSymbol("NEW-FIRST-LINK"));

    static private final SubLList $list_alt245 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-FIRST-LINK")), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("NEW-FIRST-LINK"))), makeString("(SET-FIRST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("NEW-FIRST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("DLL-FIRST-LINK"), makeSymbol("NEW-FIRST-LINK")), list(RET, makeSymbol("NEW-FIRST-LINK")));

    static private final SubLSymbol $sym246$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_SET_FIRST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-SET-FIRST-LINK-METHOD");



    static private final SubLList $list_alt249 = list(list(RET, makeSymbol("DLL-LAST-LINK")));

    static private final SubLSymbol $sym250$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_GET_LAST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-GET-LAST-LINK-METHOD");



    static private final SubLList $list_alt253 = list(makeSymbol("NEW-LAST-LINK"));

    static private final SubLList $list_alt254 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("DOUBLE-LINK-CELL-P"), makeSymbol("NEW-LAST-LINK"))), makeString("(SET-LAST-LINK ~S): ~S is not an instance of DOUBLE-LINK-CELL."), makeSymbol("SELF"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("CSETQ"), makeSymbol("DLL-LAST-LINK"), makeSymbol("NEW-LAST-LINK")), list(RET, makeSymbol("NEW-LAST-LINK")));

    static private final SubLSymbol $sym255$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_SET_LAST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-SET-LAST-LINK-METHOD");



    static private final SubLList $list_alt258 = list(list(RET, makeSymbol("DLL-ELEMENT-COUNT")));

    static private final SubLSymbol $sym259$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_GET_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-GET-ELEMENT-COUNT-METHOD");

    static private final SubLList $list_alt261 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR"))))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NEW-FIRST-LINK"), makeSymbol("NEW-LAST-LINK")), list(makeSymbol("DLC-COPY-LINKS"), makeSymbol("DLL-FIRST-LINK"), makeSymbol("NEW-ENUMERATOR")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("NEW-ENUMERATOR"), makeSymbol("NEW-FIRST-LINK"), makeSymbol("NEW-LAST-LINK")), list(RET, makeSymbol("NEW-ENUMERATOR")))));

    static private final SubLSymbol $sym262$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_ALLOCATE_ENUMERATOR_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-ALLOCATE-ENUMERATOR-METHOD");



    static private final SubLList $list_alt266 = list(makeSymbol("ENUMERATOR"));

    static private final SubLList $list_alt267 = list(list(makeSymbol("PWHEN"), list(makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR-P"), makeSymbol("ENUMERATOR")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ISOLATE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("ENUMERATOR"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-DEALLOCATE-ENUMERATOR-METHOD");

    static private final SubLList $list_alt269 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DLL-ELEMENT-EQUALITY-PREDICATE"), list(QUOTE, EQUAL)), list(makeSymbol("CSETQ"), makeSymbol("DLL-ELEMENT-COUNT"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("DLL-FIRST-LINK"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DLL-LAST-LINK"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym270$OUTER_CATCH_FOR_CYBLACK_BASIC_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DEPENDENT_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-DEPENDENT-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");

    static private final SubLList $list_alt273 = list(new SubLObject[]{ list(makeSymbol("DLL-ELEMENT-EQUALITY-PREDICATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DLL-ELEMENT-COUNT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DLL-FIRST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DLL-LAST-LINK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-EQUALITY-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-EQUALITY-PREDICATE"), list(makeSymbol("NEW-PREDICATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ELEMENT-EQUAL-P"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ELEMENT-COUNT"), list(makeSymbol("NEW-ELEMENT-COUNT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEC-ELEMENT-COUNT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FIRST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FIRST-LINK"), list(makeSymbol("NEW-FIRST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LAST-LINK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LAST-LINK"), list(makeSymbol("NEW-LAST-LINK")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-LINK"), list(makeSymbol("LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE-LINK"), list(makeSymbol("LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-LINK"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-NTH-LINK"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PUSH"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BUT-LAST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NTH"), list(makeSymbol("INDEX")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSITION"), list(makeSymbol("ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPEND"), list(makeSymbol("OTHER-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REVERSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SWAP"), list(makeSymbol("ELEMENT1"), makeSymbol("ELEMENT2")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALLOCATE-ENUMERATOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEALLOCATE-ENUMERATOR"), list(makeSymbol("ENUMERATOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUPPORT-NOTIFY"), list(makeSymbol("SUPPORT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUPPORT-NOTIFY"), list(makeSymbol("SUPPORT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-SUPPORTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-SUPPORTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUPPORT-STATE-CHANGE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_SUPPORT_STATE_CHANGE_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-SUPPORT-STATE-CHANGE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_REMOVE_ALL_SUPPORTS_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-REMOVE-ALL-SUPPORTS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_ALL_SUPPORTS_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-ALL-SUPPORTS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_REMOVE_SUPPORT_NOTIFY_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-REMOVE-SUPPORT-NOTIFY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_ADD_SUPPORT_NOTIFY_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-ADD-SUPPORT-NOTIFY-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_SWAP_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-SWAP-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_REVERSE_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-REVERSE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_APPEND_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-APPEND-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_POSITION_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-POSITION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_NTH_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-NTH-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_NTH_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-NTH-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_BUT_LAST_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-BUT-LAST-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_POP_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-POP-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_PUSH_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-PUSH-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_MEMBER_P_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-MEMBER-P-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_REMOVE_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-REMOVE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_ADD_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-ADD-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_CLEAR_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-CLEAR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_FIND_NTH_LINK_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-FIND-NTH-LINK-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_FIND_LINK_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-FIND-LINK-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_REVERSE_LINK_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-REVERSE-LINK-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_DELETE_LINK_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-DELETE-LINK-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-CONTENTS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-CONTENTS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_ELEMENT_EQUAL_P_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-ELEMENT-EQUAL-P-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SUPPORT_DEPENDENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SUPPORT-DEPENDENT-CLASS");

    static private final SubLSymbol $sym301$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SUPPORT_DEPENDENT_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SUPPORT-DEPENDENT-INSTANCE");

    static private final SubLSymbol $sym302$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    static private final SubLSymbol $sym303$CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_ELEMENT_EQUALITY_PREDICATE_ME = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-ELEMENT-EQUALITY-PREDICATE-METHOD");

    static private final SubLSymbol $sym304$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    static private final SubLSymbol $sym305$CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_ELEMENT_EQUALITY_PREDICATE_ME = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-ELEMENT-EQUALITY-PREDICATE-METHOD");

    static private final SubLSymbol $sym306$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-ELEMENT-COUNT-METHOD");

    static private final SubLSymbol $sym308$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_INC_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-INC-ELEMENT-COUNT-METHOD");

    static private final SubLSymbol $sym310$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_DEC_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-DEC-ELEMENT-COUNT-METHOD");

    static private final SubLSymbol $sym312$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_FIRST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-FIRST-LINK-METHOD");

    static private final SubLSymbol $sym314$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_FIRST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-FIRST-LINK-METHOD");

    static private final SubLSymbol $sym316$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_LAST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-LAST-LINK-METHOD");

    static private final SubLSymbol $sym318$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_SET_LAST_LINK_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-SET-LAST-LINK-METHOD");

    static private final SubLSymbol $sym320$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_GET_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-GET-ELEMENT-COUNT-METHOD");

    static private final SubLSymbol $sym322$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_ALLOCATE_ENUMERATOR_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-ALLOCATE-ENUMERATOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_DEALLOCATE_ENUMERATOR_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-DEALLOCATE-ENUMERATOR-METHOD");

    static private final SubLSymbol $sym325$OUTER_CATCH_FOR_CYBLACK_BASIC_SUPPORT_DEPENDENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SUPPORT-DEPENDENT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT-INITIALIZE-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_support_file();
    }

    public void initializeVariables() {
        init_cyblack_support_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_support_file();
    }
}

