/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_collections;
import com.cyc.cycjava.cycl.subloop_structures;
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
 *  module:      CYBLACK-LIST-ELEMENT-OBJECT
 *  source file: /cyc/top/cycl/cyblack/cyblack-list-element-object.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_list_element_object extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_list_element_object() {
    }

    public static final SubLFile me = new cyblack_list_element_object();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_list_element_object";

    // // Definitions
    public static final SubLObject get_cyblack_list_element_object_qua_list_element_parent_links(SubLObject v_cyblack_list_element_object) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_list_element_object, THREE_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject set_cyblack_list_element_object_qua_list_element_parent_links(SubLObject v_cyblack_list_element_object, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_list_element_object, value, THREE_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject get_cyblack_list_element_object_qua_list_element_self_deletion_mode(SubLObject v_cyblack_list_element_object) {
        {
            SubLObject v_class = subloop_structures.instance_class(v_cyblack_list_element_object);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, v_cyblack_list_element_object, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(v_cyblack_list_element_object));
    }

    public static final SubLObject set_cyblack_list_element_object_qua_list_element_self_deletion_mode(SubLObject v_cyblack_list_element_object, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(v_cyblack_list_element_object);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, v_cyblack_list_element_object, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(v_cyblack_list_element_object, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(v_cyblack_list_element_object)));
        return value;
    }

    public static final SubLObject cyblack_list_element_object_perform_action_method(SubLObject self, SubLObject action, SubLObject parameters) {
        return NIL;
    }

    public static final SubLObject cyblack_list_element_object_on_delete_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_list_element_object_on_add_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_list_element_object_get_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_list_element_object_get_parent_links_method(self);
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

    public static final SubLObject cyblack_list_element_object_member_p_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_list_element_object_get_parent_links_method(self);
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

    public static final SubLObject cyblack_list_element_object_delete_self_from_all_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_list_element_object_get_parent_links_method(self);
            try {
                cyblack_list_element_object_set_self_deletion_mode_method(self, T);
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
                        cyblack_list_element_object_set_self_deletion_mode_method(self, NIL);
                        cyblack_list_element_object_set_parent_links_method(self, NIL);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_list_element_object_transfer_self_method(SubLObject self, SubLObject current_collection, SubLObject new_collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.collection_template_p(current_collection)) {
                    Errors.error($str_alt31$_TRANSFER_SELF__S____S_is_not_an_, self, current_collection);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.collection_template_p(current_collection)) {
                    Errors.error($str_alt31$_TRANSFER_SELF__S____S_is_not_an_, self, new_collection);
                }
            }
            {
                SubLObject template_parent_links = cyblack_list_element_object_get_parent_links_method(self);
                SubLObject template_parent_link = NIL;
                SubLObject template_target_link = NIL;
                if (NIL != template_parent_links) {
                    if (subloop_collections.dlc_owner(template_parent_links.first()) == current_collection) {
                        template_target_link = template_parent_links.first();
                        cyblack_list_element_object_set_parent_links_method(self, template_parent_links.rest());
                    } else {
                        {
                            SubLObject template_previous = template_parent_links;
                            SubLObject template_sublinks = template_previous.rest();
                            while (NIL != template_sublinks) {
                                template_parent_link = template_sublinks.first();
                                if (subloop_collections.dlc_owner(template_parent_link) == current_collection) {
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
                            cyblack_list_element_object_set_self_deletion_mode_method(self, T);
                            subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_target_link), template_target_link);
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    subloop_collections._csetf_dlc_owner(template_target_link, NIL);
                                    methods.funcall_instance_method_with_1_args(new_collection, ADD, self);
                                    cyblack_list_element_object_set_self_deletion_mode_method(self, NIL);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                return self;
            }
        }
    }

    public static final SubLObject cyblack_list_element_object_delete_self_from_collection_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_list_element_object_get_parent_links_method(self);
            SubLObject template_parent_link = NIL;
            SubLObject template_target_link = NIL;
            if (NIL != template_parent_links) {
                if (subloop_collections.dlc_owner(template_parent_links.first()) == collection) {
                    template_target_link = template_parent_links.first();
                    cyblack_list_element_object_set_parent_links_method(self, template_parent_links.rest());
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
                        cyblack_list_element_object_set_self_deletion_mode_method(self, T);
                        subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_target_link), template_target_link);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                subloop_collections._csetf_dlc_owner(template_target_link, NIL);
                                methods.funcall_instance_method_with_1_args(self, ON_DELETE, collection);
                                cyblack_list_element_object_set_self_deletion_mode_method(self, NIL);
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

    public static final SubLObject cyblack_list_element_object_delete_parent_link_method(SubLObject self, SubLObject old_parent_link) {
        {
            SubLObject template_parent_links = cyblack_list_element_object_get_parent_links_method(self);
            if (NIL != template_parent_links) {
                if (old_parent_link == template_parent_links) {
                    cyblack_list_element_object_set_parent_links_method(self, template_parent_links.rest());
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

    public static final SubLObject cyblack_list_element_object_add_parent_link_method(SubLObject self, SubLObject new_parent_link) {
        cyblack_list_element_object_set_parent_links_method(self, cons(new_parent_link, cyblack_list_element_object_get_parent_links_method(self)));
        methods.funcall_instance_method_with_1_args(self, ON_ADD, subloop_collections.dlc_owner(new_parent_link));
        return new_parent_link;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_list_element_object_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_list_element_object_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_LIST_ELEMENT_OBJECT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_LIST_ELEMENT_OBJECT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_list_element_object_p(SubLObject v_cyblack_list_element_object) {
        return classes.subloop_instanceof_class(v_cyblack_list_element_object, CYBLACK_LIST_ELEMENT_OBJECT);
    }

    public static final SubLObject cyblack_list_element_object_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_list_element_object_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_list_element_object_qua_list_element_parent_links(self);
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_list_element_object_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    qua_list_element_self_deletion_mode = NIL;
                    qua_list_element_parent_links = NIL;
                    sublisp_throw($sym56$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_list_element_object_qua_list_element_parent_links(self, qua_list_element_parent_links);
                            set_cyblack_list_element_object_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_list_element_object_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD);
            }
            return catch_var_for_cyblack_list_element_object_method;
        }
    }

    public static final SubLObject cyblack_list_element_object_get_parent_links_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_list_element_object_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_list_element_object_qua_list_element_parent_links(self);
            try {
                try {
                    sublisp_throw($sym60$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD, qua_list_element_parent_links);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_list_element_object_qua_list_element_parent_links(self, qua_list_element_parent_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_list_element_object_method = Errors.handleThrowable(ccatch_env_var, $sym60$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD);
            }
            return catch_var_for_cyblack_list_element_object_method;
        }
    }

    public static final SubLObject cyblack_list_element_object_set_parent_links_method(SubLObject self, SubLObject new_parent_links) {
        {
            SubLObject catch_var_for_cyblack_list_element_object_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_list_element_object_qua_list_element_parent_links(self);
            try {
                try {
                    qua_list_element_parent_links = new_parent_links;
                    sublisp_throw($sym65$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD, new_parent_links);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_list_element_object_qua_list_element_parent_links(self, qua_list_element_parent_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_list_element_object_method = Errors.handleThrowable(ccatch_env_var, $sym65$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD);
            }
            return catch_var_for_cyblack_list_element_object_method;
        }
    }

    public static final SubLObject cyblack_list_element_object_get_self_deletion_mode_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_list_element_object_method = NIL;
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_list_element_object_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    sublisp_throw($sym69$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD, qua_list_element_self_deletion_mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_list_element_object_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_list_element_object_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD);
            }
            return catch_var_for_cyblack_list_element_object_method;
        }
    }

    public static final SubLObject cyblack_list_element_object_set_self_deletion_mode_method(SubLObject self, SubLObject mode) {
        {
            SubLObject catch_var_for_cyblack_list_element_object_method = NIL;
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_list_element_object_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    qua_list_element_self_deletion_mode = mode;
                    sublisp_throw($sym74$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD, mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_list_element_object_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_list_element_object_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD);
            }
            return catch_var_for_cyblack_list_element_object_method;
        }
    }

    public static final SubLObject declare_cyblack_list_element_object_file() {
        declareFunction("get_cyblack_list_element_object_qua_list_element_parent_links", "GET-CYBLACK-LIST-ELEMENT-OBJECT-QUA-LIST-ELEMENT-PARENT-LINKS", 1, 0, false);
        declareFunction("set_cyblack_list_element_object_qua_list_element_parent_links", "SET-CYBLACK-LIST-ELEMENT-OBJECT-QUA-LIST-ELEMENT-PARENT-LINKS", 2, 0, false);
        declareFunction("get_cyblack_list_element_object_qua_list_element_self_deletion_mode", "GET-CYBLACK-LIST-ELEMENT-OBJECT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 1, 0, false);
        declareFunction("set_cyblack_list_element_object_qua_list_element_self_deletion_mode", "SET-CYBLACK-LIST-ELEMENT-OBJECT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 2, 0, false);
        declareFunction("cyblack_list_element_object_perform_action_method", "CYBLACK-LIST-ELEMENT-OBJECT-PERFORM-ACTION-METHOD", 3, 0, false);
        declareFunction("cyblack_list_element_object_on_delete_method", "CYBLACK-LIST-ELEMENT-OBJECT-ON-DELETE-METHOD", 2, 0, false);
        declareFunction("cyblack_list_element_object_on_add_method", "CYBLACK-LIST-ELEMENT-OBJECT-ON-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_list_element_object_get_collections_method", "CYBLACK-LIST-ELEMENT-OBJECT-GET-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_list_element_object_member_p_method", "CYBLACK-LIST-ELEMENT-OBJECT-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_list_element_object_delete_self_from_all_collections_method", "CYBLACK-LIST-ELEMENT-OBJECT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_list_element_object_transfer_self_method", "CYBLACK-LIST-ELEMENT-OBJECT-TRANSFER-SELF-METHOD", 3, 0, false);
        declareFunction("cyblack_list_element_object_delete_self_from_collection_method", "CYBLACK-LIST-ELEMENT-OBJECT-DELETE-SELF-FROM-COLLECTION-METHOD", 2, 0, false);
        declareFunction("cyblack_list_element_object_delete_parent_link_method", "CYBLACK-LIST-ELEMENT-OBJECT-DELETE-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_list_element_object_add_parent_link_method", "CYBLACK-LIST-ELEMENT-OBJECT-ADD-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_list_element_object_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-LIST-ELEMENT-OBJECT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_list_element_object_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-LIST-ELEMENT-OBJECT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_list_element_object_p", "CYBLACK-LIST-ELEMENT-OBJECT-P", 1, 0, false);
        declareFunction("cyblack_list_element_object_initialize_method", "CYBLACK-LIST-ELEMENT-OBJECT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_list_element_object_get_parent_links_method", "CYBLACK-LIST-ELEMENT-OBJECT-GET-PARENT-LINKS-METHOD", 1, 0, false);
        declareFunction("cyblack_list_element_object_set_parent_links_method", "CYBLACK-LIST-ELEMENT-OBJECT-SET-PARENT-LINKS-METHOD", 2, 0, false);
        declareFunction("cyblack_list_element_object_get_self_deletion_mode_method", "CYBLACK-LIST-ELEMENT-OBJECT-GET-SELF-DELETION-MODE-METHOD", 1, 0, false);
        declareFunction("cyblack_list_element_object_set_self_deletion_mode_method", "CYBLACK-LIST-ELEMENT-OBJECT-SET-SELF-DELETION-MODE-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_list_element_object_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_list_element_object_file() {
                classes.subloop_new_class(CYBLACK_LIST_ELEMENT_OBJECT, CYBLACK_OBJECT, $list_alt2, NIL, $list_alt3);
        classes.class_set_implements_slot_listeners(CYBLACK_LIST_ELEMENT_OBJECT, NIL);
        methods.methods_incorporate_instance_method(PERFORM_ACTION, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt8, $list_alt9, $list_alt10);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, PERFORM_ACTION, CYBLACK_LIST_ELEMENT_OBJECT_PERFORM_ACTION_METHOD);
        methods.methods_incorporate_instance_method(ON_DELETE, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt8, $list_alt13, $list_alt14);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, ON_DELETE, CYBLACK_LIST_ELEMENT_OBJECT_ON_DELETE_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt8, $list_alt13, $list_alt14);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, ON_ADD, CYBLACK_LIST_ELEMENT_OBJECT_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_COLLECTIONS, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt8, NIL, $list_alt19);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, GET_COLLECTIONS, CYBLACK_LIST_ELEMENT_OBJECT_GET_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt8, $list_alt22, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, MEMBER_P, CYBLACK_LIST_ELEMENT_OBJECT_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_ALL_COLLECTIONS, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt8, NIL, $list_alt26);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, DELETE_SELF_FROM_ALL_COLLECTIONS, $sym27$CYBLACK_LIST_ELEMENT_OBJECT_DELETE_SELF_FROM_ALL_COLLECTIONS_METH);
        methods.methods_incorporate_instance_method(TRANSFER_SELF, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt8, $list_alt29, $list_alt30);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, TRANSFER_SELF, CYBLACK_LIST_ELEMENT_OBJECT_TRANSFER_SELF_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_COLLECTION, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt8, $list_alt22, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, DELETE_SELF_FROM_COLLECTION, CYBLACK_LIST_ELEMENT_OBJECT_DELETE_SELF_FROM_COLLECTION_METHOD);
        methods.methods_incorporate_instance_method(DELETE_PARENT_LINK, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt8, $list_alt38, $list_alt39);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, DELETE_PARENT_LINK, CYBLACK_LIST_ELEMENT_OBJECT_DELETE_PARENT_LINK_METHOD);
        methods.methods_incorporate_instance_method(ADD_PARENT_LINK, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt8, $list_alt42, $list_alt43);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, ADD_PARENT_LINK, CYBLACK_LIST_ELEMENT_OBJECT_ADD_PARENT_LINK_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_LIST_ELEMENT_OBJECT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_LIST_ELEMENT_OBJECT_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_LIST_ELEMENT_OBJECT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_LIST_ELEMENT_OBJECT_INSTANCE);
        subloop_reserved_initialize_cyblack_list_element_object_class(CYBLACK_LIST_ELEMENT_OBJECT);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt54, NIL, $list_alt55);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, INITIALIZE, CYBLACK_LIST_ELEMENT_OBJECT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_PARENT_LINKS, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt54, NIL, $list_alt59);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, GET_PARENT_LINKS, CYBLACK_LIST_ELEMENT_OBJECT_GET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT_LINKS, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt54, $list_alt63, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, SET_PARENT_LINKS, CYBLACK_LIST_ELEMENT_OBJECT_SET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_SELF_DELETION_MODE, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt54, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, GET_SELF_DELETION_MODE, CYBLACK_LIST_ELEMENT_OBJECT_GET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method(SET_SELF_DELETION_MODE, CYBLACK_LIST_ELEMENT_OBJECT, $list_alt54, $list_alt72, $list_alt73);
        methods.subloop_register_instance_method(CYBLACK_LIST_ELEMENT_OBJECT, SET_SELF_DELETION_MODE, CYBLACK_LIST_ELEMENT_OBJECT_SET_SELF_DELETION_MODE_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT");



    static private final SubLList $list_alt2 = list(makeSymbol("LIST-ELEMENT-TEMPLATE"));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT-LINKS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT-LINKS"), list(makeSymbol("NEW-PARENT-LINKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PARENT-LINK"), list(makeSymbol("NEW-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-PARENT-LINK"), list(makeSymbol("OLD-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SELF-DELETION-MODE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SELF-DELETION-MODE"), list(makeSymbol("MODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-COLLECTION"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSFER-SELF"), list(makeSymbol("CURRENT-COLLECTION"), makeSymbol("NEW-COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTION"), makeSymbol("PARAMETERS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });





    public static final SubLInteger $int$4097 = makeInteger(4097);



    static private final SubLList $list_alt8 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt9 = list(makeSymbol("ACTION"), makeSymbol("PARAMETERS"));

    static private final SubLList $list_alt10 = list(list(makeSymbol("IGNORE"), makeSymbol("ACTION"), makeSymbol("PARAMETERS")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_PERFORM_ACTION_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-PERFORM-ACTION-METHOD");



    static private final SubLList $list_alt13 = list(makeSymbol("PARENT-LIST"));

    static private final SubLList $list_alt14 = list(list(makeSymbol("IGNORE"), makeSymbol("PARENT-LIST")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_ON_DELETE_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-ON-DELETE-METHOD");



    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_ON_ADD_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-ON-ADD-METHOD");



    static private final SubLList $list_alt19 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-COLLECTIONS"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS"), makeSymbol("TEMPLATE-COLLECTIONS")), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK"))), list(RET, list(makeSymbol("UNIQUE-ELEMENTS"), makeSymbol("TEMPLATE-COLLECTIONS")))));

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_GET_COLLECTIONS_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-GET-COLLECTIONS-METHOD");



    static private final SubLList $list_alt22 = list(makeSymbol("COLLECTION"));

    static private final SubLList $list_alt23 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(RET, T))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_MEMBER_P_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-MEMBER-P-METHOD");



    static private final SubLList $list_alt26 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), NIL))), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), NIL)), list(RET, makeSymbol("SELF"))));

    static private final SubLSymbol $sym27$CYBLACK_LIST_ELEMENT_OBJECT_DELETE_SELF_FROM_ALL_COLLECTIONS_METH = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD");



    static private final SubLList $list_alt29 = list(makeSymbol("CURRENT-COLLECTION"), makeSymbol("NEW-COLLECTION"));

    static private final SubLList $list_alt30 = list(list(makeSymbol("MUST"), list(makeSymbol("COLLECTION-TEMPLATE-P"), makeSymbol("CURRENT-COLLECTION")), makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE."), makeSymbol("SELF"), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("MUST"), list(makeSymbol("COLLECTION-TEMPLATE-P"), makeSymbol("CURRENT-COLLECTION")), makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE."), makeSymbol("SELF"), makeSymbol("NEW-COLLECTION")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-COLLECTION"), list(QUOTE, makeSymbol("ADD")), makeSymbol("SELF")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(RET, makeSymbol("SELF"))));

    static private final SubLString $str_alt31$_TRANSFER_SELF__S____S_is_not_an_ = makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE.");



    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_TRANSFER_SELF_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-TRANSFER-SELF-METHOD");



    static private final SubLList $list_alt35 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), makeSymbol("COLLECTION")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_DELETE_SELF_FROM_COLLECTION_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-DELETE-SELF-FROM-COLLECTION-METHOD");



    static private final SubLList $list_alt38 = list(makeSymbol("OLD-PARENT-LINK"));

    static private final SubLList $list_alt39 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OLD-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), list(makeSymbol("DLC-OWNER"), makeSymbol("OLD-PARENT-LINK"))), list(RET, makeSymbol("OLD-PARENT-LINK"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))))))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_DELETE_PARENT_LINK_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-DELETE-PARENT-LINK-METHOD");



    static private final SubLList $list_alt42 = list(makeSymbol("NEW-PARENT-LINK"));

    static private final SubLList $list_alt43 = list(list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("NEW-PARENT-LINK"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ADD")), list(makeSymbol("DLC-OWNER"), makeSymbol("NEW-PARENT-LINK"))), list(RET, makeSymbol("NEW-PARENT-LINK")));

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_ADD_PARENT_LINK_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-ADD-PARENT-LINK-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_LIST_ELEMENT_OBJECT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-LIST-ELEMENT-OBJECT-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_LIST_ELEMENT_OBJECT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-LIST-ELEMENT-OBJECT-INSTANCE");



    static private final SubLList $list_alt54 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt55 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym56$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LIST-ELEMENT-OBJECT-METHOD");

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_INITIALIZE_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-INITIALIZE-METHOD");



    static private final SubLList $list_alt59 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS")));

    static private final SubLSymbol $sym60$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LIST-ELEMENT-OBJECT-METHOD");

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_GET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-GET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt63 = list(makeSymbol("NEW-PARENT-LINKS"));

    static private final SubLList $list_alt64 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeSymbol("NEW-PARENT-LINKS")), list(RET, makeSymbol("NEW-PARENT-LINKS")));

    static private final SubLSymbol $sym65$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LIST-ELEMENT-OBJECT-METHOD");

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_SET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-SET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt68 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE")));

    static private final SubLSymbol $sym69$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LIST-ELEMENT-OBJECT-METHOD");

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_GET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-GET-SELF-DELETION-MODE-METHOD");



    static private final SubLList $list_alt72 = list(makeSymbol("MODE"));

    static private final SubLList $list_alt73 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeSymbol("MODE")), list(RET, makeSymbol("MODE")));

    static private final SubLSymbol $sym74$OUTER_CATCH_FOR_CYBLACK_LIST_ELEMENT_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-LIST-ELEMENT-OBJECT-METHOD");

    private static final SubLSymbol CYBLACK_LIST_ELEMENT_OBJECT_SET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-LIST-ELEMENT-OBJECT-SET-SELF-DELETION-MODE-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_list_element_object_file();
    }

    public void initializeVariables() {
        init_cyblack_list_element_object_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_list_element_object_file();
    }
}

