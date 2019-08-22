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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
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
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
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
 *  module:      CYBLACK-BLACKBOARD-DAEMON
 *  source file: /cyc/top/cycl/cyblack/cyblack-blackboard-daemon.lisp
 *  created:     2019/07/03 17:38:46
 */
public final class cyblack_blackboard_daemon extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_blackboard_daemon() {
    }

    public static final SubLFile me = new cyblack_blackboard_daemon();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_blackboard_daemon";

    // // Definitions
    public static final SubLObject cyblack_blackboard_daemon_p(SubLObject v_cyblack_blackboard_daemon) {
        return interfaces.subloop_instanceof_interface(v_cyblack_blackboard_daemon, CYBLACK_BLACKBOARD_DAEMON);
    }

    public static final SubLObject cyblack_pattern_based_blackboard_daemon_p(SubLObject cyblack_pattern_based_blackboard_daemon) {
        return interfaces.subloop_instanceof_interface(cyblack_pattern_based_blackboard_daemon, CYBLACK_PATTERN_BASED_BLACKBOARD_DAEMON);
    }

    public static final SubLObject cyblack_actuator_p(SubLObject cyblack_actuator) {
        return interfaces.subloop_instanceof_interface(cyblack_actuator, CYBLACK_ACTUATOR);
    }

    public static final SubLObject cyblack_posting_daemon_p(SubLObject cyblack_posting_daemon) {
        return interfaces.subloop_instanceof_interface(cyblack_posting_daemon, CYBLACK_POSTING_DAEMON);
    }

    public static final SubLObject cyblack_posting_based_goal_satisfaction_daemon_p(SubLObject cyblack_posting_based_goal_satisfaction_daemon) {
        return interfaces.subloop_instanceof_interface(cyblack_posting_based_goal_satisfaction_daemon, CYBLACK_POSTING_BASED_GOAL_SATISFACTION_DAEMON);
    }

    public static final SubLObject get_cyblack_posting_daemon_qua_list_element_qua_list_element_parent_links(SubLObject cyblack_posting_daemon_qua_list_element) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_posting_daemon_qua_list_element, THREE_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject set_cyblack_posting_daemon_qua_list_element_qua_list_element_parent_links(SubLObject cyblack_posting_daemon_qua_list_element, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_posting_daemon_qua_list_element, value, THREE_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject get_cyblack_posting_daemon_qua_list_element_qua_list_element_self_deletion_mode(SubLObject cyblack_posting_daemon_qua_list_element) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_posting_daemon_qua_list_element);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_posting_daemon_qua_list_element, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_posting_daemon_qua_list_element));
    }

    public static final SubLObject set_cyblack_posting_daemon_qua_list_element_qua_list_element_self_deletion_mode(SubLObject cyblack_posting_daemon_qua_list_element, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_posting_daemon_qua_list_element);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_posting_daemon_qua_list_element, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_posting_daemon_qua_list_element, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_posting_daemon_qua_list_element)));
        return value;
    }

    public static final SubLObject cyblack_posting_daemon_qua_list_element_perform_action_method(SubLObject self, SubLObject action, SubLObject parameters) {
        return NIL;
    }

    public static final SubLObject cyblack_posting_daemon_qua_list_element_on_delete_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_posting_daemon_qua_list_element_on_add_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_posting_daemon_qua_list_element_get_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_posting_daemon_qua_list_element_get_parent_links_method(self);
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

    public static final SubLObject cyblack_posting_daemon_qua_list_element_member_p_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_posting_daemon_qua_list_element_get_parent_links_method(self);
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

    public static final SubLObject cyblack_posting_daemon_qua_list_element_delete_self_from_all_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_posting_daemon_qua_list_element_get_parent_links_method(self);
            try {
                cyblack_posting_daemon_qua_list_element_set_self_deletion_mode_method(self, T);
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
                        cyblack_posting_daemon_qua_list_element_set_self_deletion_mode_method(self, NIL);
                        cyblack_posting_daemon_qua_list_element_set_parent_links_method(self, NIL);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_posting_daemon_qua_list_element_delete_self_from_collection_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_posting_daemon_qua_list_element_get_parent_links_method(self);
            SubLObject template_parent_link = NIL;
            SubLObject template_target_link = NIL;
            if (NIL != template_parent_links) {
                if (subloop_collections.dlc_owner(template_parent_links.first()) == collection) {
                    template_target_link = template_parent_links.first();
                    cyblack_posting_daemon_qua_list_element_set_parent_links_method(self, template_parent_links.rest());
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
                        cyblack_posting_daemon_qua_list_element_set_self_deletion_mode_method(self, T);
                        subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_target_link), template_target_link);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                subloop_collections._csetf_dlc_owner(template_target_link, NIL);
                                methods.funcall_instance_method_with_1_args(self, ON_DELETE, collection);
                                cyblack_posting_daemon_qua_list_element_set_self_deletion_mode_method(self, NIL);
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

    public static final SubLObject cyblack_posting_daemon_qua_list_element_delete_parent_link_method(SubLObject self, SubLObject old_parent_link) {
        {
            SubLObject template_parent_links = cyblack_posting_daemon_qua_list_element_get_parent_links_method(self);
            if (NIL != template_parent_links) {
                if (old_parent_link == template_parent_links) {
                    cyblack_posting_daemon_qua_list_element_set_parent_links_method(self, template_parent_links.rest());
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

    public static final SubLObject cyblack_posting_daemon_qua_list_element_add_parent_link_method(SubLObject self, SubLObject new_parent_link) {
        cyblack_posting_daemon_qua_list_element_set_parent_links_method(self, cons(new_parent_link, cyblack_posting_daemon_qua_list_element_get_parent_links_method(self)));
        methods.funcall_instance_method_with_1_args(self, ON_ADD, subloop_collections.dlc_owner(new_parent_link));
        return new_parent_link;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_posting_daemon_qua_list_element_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_posting_daemon_qua_list_element_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_posting_daemon_qua_list_element_p(SubLObject cyblack_posting_daemon_qua_list_element) {
        return classes.subloop_instanceof_class(cyblack_posting_daemon_qua_list_element, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT);
    }

    public static final SubLObject cyblack_posting_daemon_qua_list_element_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_posting_daemon_qua_list_element_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_posting_daemon_qua_list_element_qua_list_element_parent_links(self);
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_posting_daemon_qua_list_element_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    qua_list_element_self_deletion_mode = NIL;
                    qua_list_element_parent_links = NIL;
                    sublisp_throw($sym69$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_posting_daemon_qua_list_element_qua_list_element_parent_links(self, qua_list_element_parent_links);
                            set_cyblack_posting_daemon_qua_list_element_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_posting_daemon_qua_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD);
            }
            return catch_var_for_cyblack_posting_daemon_qua_list_element_method;
        }
    }

    public static final SubLObject cyblack_posting_daemon_qua_list_element_get_parent_links_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_posting_daemon_qua_list_element_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_posting_daemon_qua_list_element_qua_list_element_parent_links(self);
            try {
                try {
                    sublisp_throw($sym73$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD, qua_list_element_parent_links);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_posting_daemon_qua_list_element_qua_list_element_parent_links(self, qua_list_element_parent_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_posting_daemon_qua_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD);
            }
            return catch_var_for_cyblack_posting_daemon_qua_list_element_method;
        }
    }

    public static final SubLObject cyblack_posting_daemon_qua_list_element_set_parent_links_method(SubLObject self, SubLObject new_parent_links) {
        {
            SubLObject catch_var_for_cyblack_posting_daemon_qua_list_element_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_posting_daemon_qua_list_element_qua_list_element_parent_links(self);
            try {
                try {
                    qua_list_element_parent_links = new_parent_links;
                    sublisp_throw($sym78$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD, new_parent_links);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_posting_daemon_qua_list_element_qua_list_element_parent_links(self, qua_list_element_parent_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_posting_daemon_qua_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym78$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD);
            }
            return catch_var_for_cyblack_posting_daemon_qua_list_element_method;
        }
    }

    public static final SubLObject cyblack_posting_daemon_qua_list_element_get_self_deletion_mode_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_posting_daemon_qua_list_element_method = NIL;
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_posting_daemon_qua_list_element_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    sublisp_throw($sym82$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD, qua_list_element_self_deletion_mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_posting_daemon_qua_list_element_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_posting_daemon_qua_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD);
            }
            return catch_var_for_cyblack_posting_daemon_qua_list_element_method;
        }
    }

    public static final SubLObject cyblack_posting_daemon_qua_list_element_set_self_deletion_mode_method(SubLObject self, SubLObject mode) {
        {
            SubLObject catch_var_for_cyblack_posting_daemon_qua_list_element_method = NIL;
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_posting_daemon_qua_list_element_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    qua_list_element_self_deletion_mode = mode;
                    sublisp_throw($sym87$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD, mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_posting_daemon_qua_list_element_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_posting_daemon_qua_list_element_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD);
            }
            return catch_var_for_cyblack_posting_daemon_qua_list_element_method;
        }
    }

    public static final SubLObject get_cyblack_basic_posting_daemon_stimulating_posting(SubLObject cyblack_basic_posting_daemon) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_posting_daemon, FIVE_INTEGER, STIMULATING_POSTING);
    }

    public static final SubLObject set_cyblack_basic_posting_daemon_stimulating_posting(SubLObject cyblack_basic_posting_daemon, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_posting_daemon, value, FIVE_INTEGER, STIMULATING_POSTING);
    }

    public static final SubLObject get_cyblack_basic_posting_daemon_panel(SubLObject cyblack_basic_posting_daemon) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_posting_daemon, FOUR_INTEGER, PANEL);
    }

    public static final SubLObject set_cyblack_basic_posting_daemon_panel(SubLObject cyblack_basic_posting_daemon, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_posting_daemon, value, FOUR_INTEGER, PANEL);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_posting_daemon_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_posting_daemon_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_DAEMON, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_DAEMON, STIMULATING_POSTING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_posting_daemon_p(SubLObject cyblack_basic_posting_daemon) {
        return classes.subloop_instanceof_class(cyblack_basic_posting_daemon, CYBLACK_BASIC_POSTING_DAEMON);
    }

    public static final SubLObject cyblack_basic_posting_daemon_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_daemon_method = NIL;
            SubLObject stimulating_posting = get_cyblack_basic_posting_daemon_stimulating_posting(self);
            try {
                try {
                    cyblack_posting_daemon_qua_list_element_initialize_method(self);
                    stimulating_posting = NIL;
                    sublisp_throw($sym96$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_daemon_stimulating_posting(self, stimulating_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym96$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_daemon_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_daemon_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_daemon_method = NIL;
            SubLObject stimulating_posting = get_cyblack_basic_posting_daemon_stimulating_posting(self);
            SubLObject instance_number = object.get_object_instance_number(self);
            try {
                try {
                    format(stream, $str_alt102$___S__S__S__, new SubLObject[]{ subloop_structures.class_name(subloop_structures.instance_class(self)), instance_number, stimulating_posting });
                    sublisp_throw($sym101$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_daemon_stimulating_posting(self, stimulating_posting);
                            object.set_object_instance_number(self, instance_number);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_daemon_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_daemon_get_application_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_daemon_method = NIL;
            SubLObject stimulating_posting = get_cyblack_basic_posting_daemon_stimulating_posting(self);
            try {
                try {
                    sublisp_throw($sym106$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD, stimulating_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_daemon_stimulating_posting(self, stimulating_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym106$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_daemon_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_daemon_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_posting_daemon_method = NIL;
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_application) || (NIL != cyblack_application.cyblack_application_p(new_application)))) {
                                Errors.error($str_alt112$_SET_APPLICATION__S____S_is_not_a, self, new_application);
                            }
                        }
                        application = new_application;
                        sublisp_throw($sym111$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD, new_application);
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
                    catch_var_for_cyblack_basic_posting_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym111$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD);
                }
                return catch_var_for_cyblack_basic_posting_daemon_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_posting_daemon_stimulate_method(SubLObject self, SubLObject posting) {
        if (posting == UNPROVIDED) {
            posting = NIL;
        }
        cyblack_basic_posting_daemon_set_stimulating_posting_method(self, posting);
        methods.funcall_instance_method_with_0_args(self, PERFORM_ACTION);
        return posting;
    }

    public static final SubLObject cyblack_basic_posting_daemon_perform_action_method(SubLObject self) {
        return self;
    }

    public static final SubLObject cyblack_basic_posting_daemon_get_panel_method(SubLObject self) {
        {
            SubLObject panel = get_cyblack_basic_posting_daemon_panel(self);
            return panel;
        }
    }

    public static final SubLObject cyblack_basic_posting_daemon_set_panel_method(SubLObject self, SubLObject new_panel) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_daemon_method = NIL;
            SubLObject panel = get_cyblack_basic_posting_daemon_panel(self);
            try {
                try {
                    panel = new_panel;
                    sublisp_throw($sym127$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD, new_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_daemon_panel(self, panel);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym127$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_daemon_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_daemon_get_stimulating_posting_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_posting_daemon_method = NIL;
            SubLObject stimulating_posting = get_cyblack_basic_posting_daemon_stimulating_posting(self);
            try {
                try {
                    sublisp_throw($sym130$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD, stimulating_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_posting_daemon_stimulating_posting(self, stimulating_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_posting_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym130$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD);
            }
            return catch_var_for_cyblack_basic_posting_daemon_method;
        }
    }

    public static final SubLObject cyblack_basic_posting_daemon_set_stimulating_posting_method(SubLObject self, SubLObject new_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_posting_daemon_method = NIL;
                SubLObject stimulating_posting = get_cyblack_basic_posting_daemon_stimulating_posting(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_posting) || (NIL != cyblack_posting.cyblack_posting_p(new_posting)))) {
                                Errors.error($str_alt136$_SET_STIMULATING_POSTING__S____S_, self, new_posting);
                            }
                        }
                        stimulating_posting = new_posting;
                        sublisp_throw($sym135$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD, new_posting);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_posting_daemon_stimulating_posting(self, stimulating_posting);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_posting_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym135$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD);
                }
                return catch_var_for_cyblack_basic_posting_daemon_method;
            }
        }
    }

    public static final SubLObject get_cyblack_goal_satisfaction_daemon_deactivated(SubLObject cyblack_goal_satisfaction_daemon) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_goal_satisfaction_daemon, EIGHT_INTEGER, DEACTIVATED);
    }

    public static final SubLObject set_cyblack_goal_satisfaction_daemon_deactivated(SubLObject cyblack_goal_satisfaction_daemon, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_goal_satisfaction_daemon, value, EIGHT_INTEGER, DEACTIVATED);
    }

    public static final SubLObject get_cyblack_goal_satisfaction_daemon_local_environment(SubLObject cyblack_goal_satisfaction_daemon) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_goal_satisfaction_daemon, SEVEN_INTEGER, LOCAL_ENVIRONMENT);
    }

    public static final SubLObject set_cyblack_goal_satisfaction_daemon_local_environment(SubLObject cyblack_goal_satisfaction_daemon, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_goal_satisfaction_daemon, value, SEVEN_INTEGER, LOCAL_ENVIRONMENT);
    }

    public static final SubLObject get_cyblack_goal_satisfaction_daemon_goal_posting(SubLObject cyblack_goal_satisfaction_daemon) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_goal_satisfaction_daemon, SIX_INTEGER, GOAL_POSTING);
    }

    public static final SubLObject set_cyblack_goal_satisfaction_daemon_goal_posting(SubLObject cyblack_goal_satisfaction_daemon, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_goal_satisfaction_daemon, value, SIX_INTEGER, GOAL_POSTING);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_goal_satisfaction_daemon_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_goal_satisfaction_daemon_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_DAEMON, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_DAEMON, STIMULATING_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GOAL_SATISFACTION_DAEMON, GOAL_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GOAL_SATISFACTION_DAEMON, LOCAL_ENVIRONMENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GOAL_SATISFACTION_DAEMON, DEACTIVATED, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_goal_satisfaction_daemon_p(SubLObject cyblack_goal_satisfaction_daemon) {
        return classes.subloop_instanceof_class(cyblack_goal_satisfaction_daemon, CYBLACK_GOAL_SATISFACTION_DAEMON);
    }

    public static final SubLObject cyblack_goal_satisfaction_daemon_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_goal_satisfaction_daemon_method = NIL;
            SubLObject deactivated = get_cyblack_goal_satisfaction_daemon_deactivated(self);
            try {
                try {
                    cyblack_basic_posting_daemon_initialize_method(self);
                    deactivated = NIL;
                    sublisp_throw($sym146$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_goal_satisfaction_daemon_deactivated(self, deactivated);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_goal_satisfaction_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym146$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD);
            }
            return catch_var_for_cyblack_goal_satisfaction_daemon_method;
        }
    }

    public static final SubLObject cyblack_goal_satisfaction_daemon_get_goal_posting_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_goal_satisfaction_daemon_method = NIL;
            SubLObject goal_posting = get_cyblack_goal_satisfaction_daemon_goal_posting(self);
            try {
                try {
                    sublisp_throw($sym150$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD, goal_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_goal_satisfaction_daemon_goal_posting(self, goal_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_goal_satisfaction_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym150$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD);
            }
            return catch_var_for_cyblack_goal_satisfaction_daemon_method;
        }
    }

    public static final SubLObject cyblack_goal_satisfaction_daemon_set_goal_posting_method(SubLObject self, SubLObject new_goal_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_goal_satisfaction_daemon_method = NIL;
                SubLObject local_environment = get_cyblack_goal_satisfaction_daemon_local_environment(self);
                SubLObject goal_posting = get_cyblack_goal_satisfaction_daemon_goal_posting(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_goal_posting) || (NIL != cyblack_goal.cyblack_goal_posting_p(new_goal_posting)))) {
                                Errors.error($str_alt156$_SET_GOAL_POSTING__S____S_is_not_, self, new_goal_posting);
                            }
                        }
                        goal_posting = new_goal_posting;
                        if ((NIL != goal_posting) && (NIL != local_environment)) {
                            {
                                SubLObject goal_posting_environment = methods.funcall_instance_method_with_0_args(goal_posting, GET_LOCAL_ENVIRONMENT);
                                cyblack_precondition_pattern.cyblack_environment_set_outer_scope_method(local_environment, goal_posting_environment);
                            }
                        }
                        sublisp_throw($sym155$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD, new_goal_posting);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_goal_satisfaction_daemon_local_environment(self, local_environment);
                                set_cyblack_goal_satisfaction_daemon_goal_posting(self, goal_posting);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_goal_satisfaction_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym155$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD);
                }
                return catch_var_for_cyblack_goal_satisfaction_daemon_method;
            }
        }
    }

    public static final SubLObject cyblack_goal_satisfaction_daemon_get_local_environment_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_goal_satisfaction_daemon_method = NIL;
            SubLObject local_environment = get_cyblack_goal_satisfaction_daemon_local_environment(self);
            try {
                try {
                    sublisp_throw($sym160$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD, local_environment);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_goal_satisfaction_daemon_local_environment(self, local_environment);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_goal_satisfaction_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym160$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD);
            }
            return catch_var_for_cyblack_goal_satisfaction_daemon_method;
        }
    }

    public static final SubLObject cyblack_goal_satisfaction_daemon_set_local_environment_method(SubLObject self, SubLObject new_local_environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_goal_satisfaction_daemon_method = NIL;
                SubLObject local_environment = get_cyblack_goal_satisfaction_daemon_local_environment(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_local_environment) || (NIL != cyblack_precondition_pattern.cyblack_environment_p(new_local_environment)))) {
                                Errors.error($str_alt166$_SET_LOCAL_ENVIRONMENT__S____S_is, self, new_local_environment);
                            }
                        }
                        local_environment = new_local_environment;
                        sublisp_throw($sym165$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD, new_local_environment);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_goal_satisfaction_daemon_local_environment(self, local_environment);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_goal_satisfaction_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym165$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD);
                }
                return catch_var_for_cyblack_goal_satisfaction_daemon_method;
            }
        }
    }

    public static final SubLObject cyblack_goal_satisfaction_daemon_bind_posting_method(SubLObject self, SubLObject new_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_goal_satisfaction_daemon_method = NIL;
                SubLObject local_environment = get_cyblack_goal_satisfaction_daemon_local_environment(self);
                SubLObject goal_posting = get_cyblack_goal_satisfaction_daemon_goal_posting(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_posting.cyblack_posting_p(new_posting)) {
                                Errors.error($str_alt171$_BIND_POSTING__S____S_is_not_an_i, self, new_posting);
                            }
                        }
                        if (((NIL != local_environment) && (NIL != goal_posting)) && (NIL != cyblack_goal.cyblack_goal_posting_p(goal_posting))) {
                            cyblack_precondition_pattern.cyblack_environment_set_method(local_environment, $sym172$_THE_POSTING, new_posting);
                            sublisp_throw($sym170$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD, new_posting);
                        }
                        sublisp_throw($sym170$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_goal_satisfaction_daemon_local_environment(self, local_environment);
                                set_cyblack_goal_satisfaction_daemon_goal_posting(self, goal_posting);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_goal_satisfaction_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym170$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD);
                }
                return catch_var_for_cyblack_goal_satisfaction_daemon_method;
            }
        }
    }

    public static final SubLObject cyblack_goal_satisfaction_daemon_stimulate_method(SubLObject self, SubLObject posting) {
        if (posting == UNPROVIDED) {
            posting = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_goal_satisfaction_daemon_method = NIL;
                SubLObject deactivated = get_cyblack_goal_satisfaction_daemon_deactivated(self);
                SubLObject local_environment = get_cyblack_goal_satisfaction_daemon_local_environment(self);
                SubLObject goal_posting = get_cyblack_goal_satisfaction_daemon_goal_posting(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL != deactivated) {
                            sublisp_throw($sym175$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD, NIL);
                        }
                        if ((NIL != posting) && (NIL != goal_posting)) {
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                                    Errors.error($str_alt176$_STIMULATE__S____S_is_not_an_inst, self, posting);
                                }
                            }
                            {
                                SubLObject goal_pattern = cyblack_goal.cyblack_goal_posting_get_goal_pattern(goal_posting);
                                if (NIL != goal_pattern) {
                                    cyblack_precondition_pattern.cyblack_environment_set_method(local_environment, $sym177$_SELF, goal_posting);
                                    cyblack_precondition_pattern.cyblack_environment_set_method(local_environment, $sym172$_THE_POSTING, posting);
                                    if (NIL != cyblack_precondition_pattern.cyblack_simple_satisfaction_expression_p(goal_pattern)) {
                                        {
                                            SubLObject logical_expression = methods.funcall_instance_method_with_0_args(goal_pattern, GET_LOGICAL_EXPRESSION);
                                            if (NIL != logical_expression) {
                                                cyblack_goal_satisfaction_daemon_bind_posting_method(self, posting);
                                                if (NIL != methods.funcall_instance_method_with_1_args(logical_expression, GET_VALUE, local_environment)) {
                                                    methods.funcall_instance_method_with_1_args(goal_posting, ADD_MATCH, cyblack_precondition_pattern.cyblack_environment_clone_method(local_environment));
                                                    cyblack_goal_satisfaction_daemon_perform_action_method(self);
                                                }
                                            }
                                        }
                                    } else
                                        if (NIL != cyblack_precondition_pattern.cyblack_satisfaction_expression_p(goal_pattern)) {
                                            cyblack_goal_satisfaction_daemon_bind_posting_method(self, posting);
                                            {
                                                SubLObject blackboard = methods.funcall_instance_method_with_0_args(application, GET_BLACKBOARD);
                                                SubLObject v_agenda = methods.funcall_instance_method_with_0_args(application, GET_AGENDA);
                                                cyblack_precondition_pattern.cyblack_pattern_set_environment(goal_pattern, local_environment);
                                                {
                                                    SubLObject activation_patterns = methods.funcall_instance_method_with_1_args(blackboard, UNIFY_FOR_GOAL_SATISFACTION_DAEMON, goal_pattern);
                                                    if (NIL != activation_patterns) {
                                                        {
                                                            SubLObject enumerator = methods.funcall_instance_method_with_0_args(activation_patterns, ALLOCATE_ENUMERATOR);
                                                            if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                                                                {
                                                                    SubLObject activation_pattern = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                                                    methods.funcall_instance_method_with_1_args(goal_posting, ADD_MATCH, cyblack_precondition_pattern.cyblack_environment_clone_method(activation_pattern));
                                                                    cyblack_goal_satisfaction_daemon_perform_action_method(self);
                                                                    while (NIL == methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                                                                        activation_pattern = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                                                        methods.funcall_instance_method_with_1_args(goal_posting, ADD_MATCH, cyblack_precondition_pattern.cyblack_environment_clone_method(activation_pattern));
                                                                        cyblack_goal_satisfaction_daemon_perform_action_method(self);
                                                                    } 
                                                                }
                                                            }
                                                            methods.funcall_instance_method_with_1_args(activation_patterns, DEALLOCATE_ENUMERATOR, enumerator);
                                                        }
                                                    }
                                                }
                                            }
                                        }

                                }
                            }
                        }
                        sublisp_throw($sym175$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_goal_satisfaction_daemon_deactivated(self, deactivated);
                                set_cyblack_goal_satisfaction_daemon_local_environment(self, local_environment);
                                set_cyblack_goal_satisfaction_daemon_goal_posting(self, goal_posting);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_goal_satisfaction_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym175$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD);
                }
                return catch_var_for_cyblack_goal_satisfaction_daemon_method;
            }
        }
    }

    public static final SubLObject cyblack_goal_satisfaction_daemon_perform_action_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_goal_satisfaction_daemon_deactivate_self_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_goal_satisfaction_daemon_method = NIL;
            SubLObject deactivated = get_cyblack_goal_satisfaction_daemon_deactivated(self);
            SubLObject local_environment = get_cyblack_goal_satisfaction_daemon_local_environment(self);
            try {
                try {
                    deactivated = T;
                    if (NIL != local_environment) {
                        cyblack_precondition_pattern.cyblack_environment_set_outer_scope_method(local_environment, NIL);
                    }
                    cyblack_posting_daemon_qua_list_element_delete_self_from_all_collections_method(self);
                    sublisp_throw($sym195$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_goal_satisfaction_daemon_deactivated(self, deactivated);
                            set_cyblack_goal_satisfaction_daemon_local_environment(self, local_environment);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_goal_satisfaction_daemon_method = Errors.handleThrowable(ccatch_env_var, $sym195$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD);
            }
            return catch_var_for_cyblack_goal_satisfaction_daemon_method;
        }
    }

    public static final SubLObject cyblack_daemon_visitor_p(SubLObject cyblack_daemon_visitor) {
        return interfaces.subloop_instanceof_interface(cyblack_daemon_visitor, CYBLACK_DAEMON_VISITOR);
    }

    public static final SubLObject get_cyblack_basic_daemon_visitor_continue(SubLObject cyblack_basic_daemon_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_daemon_visitor, THREE_INTEGER, CONTINUE);
    }

    public static final SubLObject set_cyblack_basic_daemon_visitor_continue(SubLObject cyblack_basic_daemon_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_daemon_visitor, value, THREE_INTEGER, CONTINUE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_daemon_visitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_daemon_visitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DAEMON_VISITOR, CONTINUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_daemon_visitor_p(SubLObject cyblack_basic_daemon_visitor) {
        return classes.subloop_instanceof_class(cyblack_basic_daemon_visitor, CYBLACK_BASIC_DAEMON_VISITOR);
    }

    public static final SubLObject cyblack_basic_daemon_visitor_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_daemon_visitor_method = NIL;
            SubLObject v_continue = get_cyblack_basic_daemon_visitor_continue(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    v_continue = T;
                    sublisp_throw($sym206$OUTER_CATCH_FOR_CYBLACK_BASIC_DAEMON_VISITOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_daemon_visitor_continue(self, v_continue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_daemon_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym206$OUTER_CATCH_FOR_CYBLACK_BASIC_DAEMON_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_daemon_visitor_method;
        }
    }

    public static final SubLObject cyblack_basic_daemon_visitor_set_initial_state_method(SubLObject self, SubLObject new_application, SubLObject new_state) {
        if (new_state == UNPROVIDED) {
            new_state = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_basic_daemon_visitor_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    application = new_application;
                    sublisp_throw($sym211$OUTER_CATCH_FOR_CYBLACK_BASIC_DAEMON_VISITOR_METHOD, new_state);
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
                catch_var_for_cyblack_basic_daemon_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym211$OUTER_CATCH_FOR_CYBLACK_BASIC_DAEMON_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_daemon_visitor_method;
        }
    }

    public static final SubLObject cyblack_basic_daemon_visitor_visit_method(SubLObject self, SubLObject daemon) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard_daemon_p(daemon)) {
                    Errors.error($str_alt216$_VISIT__S____S_is_not_an_instance, self, daemon);
                }
            }
            return daemon;
        }
    }

    public static final SubLObject cyblack_basic_daemon_visitor_continue_p_method(SubLObject self, SubLObject daemon) {
        if (daemon == UNPROVIDED) {
            daemon = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_basic_daemon_visitor_method = NIL;
            SubLObject v_continue = get_cyblack_basic_daemon_visitor_continue(self);
            try {
                try {
                    sublisp_throw($sym221$OUTER_CATCH_FOR_CYBLACK_BASIC_DAEMON_VISITOR_METHOD, v_continue);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_daemon_visitor_continue(self, v_continue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_daemon_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym221$OUTER_CATCH_FOR_CYBLACK_BASIC_DAEMON_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_daemon_visitor_method;
        }
    }

    public static final SubLObject cyblack_basic_daemon_visitor_get_final_state_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_posting_daemon_visitor_p(SubLObject cyblack_posting_daemon_visitor) {
        return interfaces.subloop_instanceof_interface(cyblack_posting_daemon_visitor, CYBLACK_POSTING_DAEMON_VISITOR);
    }

    public static final SubLObject get_cyblack_goal_satisfaction_visitor_the_posting(SubLObject cyblack_goal_satisfaction_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_goal_satisfaction_visitor, FIVE_INTEGER, THE_POSTING);
    }

    public static final SubLObject set_cyblack_goal_satisfaction_visitor_the_posting(SubLObject cyblack_goal_satisfaction_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_goal_satisfaction_visitor, value, FIVE_INTEGER, THE_POSTING);
    }

    public static final SubLObject get_cyblack_goal_satisfaction_visitor_environment(SubLObject cyblack_goal_satisfaction_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_goal_satisfaction_visitor, FOUR_INTEGER, ENVIRONMENT);
    }

    public static final SubLObject set_cyblack_goal_satisfaction_visitor_environment(SubLObject cyblack_goal_satisfaction_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_goal_satisfaction_visitor, value, FOUR_INTEGER, ENVIRONMENT);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_goal_satisfaction_visitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_goal_satisfaction_visitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_DAEMON_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GOAL_SATISFACTION_VISITOR, ENVIRONMENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GOAL_SATISFACTION_VISITOR, THE_POSTING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_goal_satisfaction_visitor_p(SubLObject cyblack_goal_satisfaction_visitor) {
        return classes.subloop_instanceof_class(cyblack_goal_satisfaction_visitor, CYBLACK_GOAL_SATISFACTION_VISITOR);
    }

    public static final SubLObject cyblack_goal_satisfaction_visitor_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_goal_satisfaction_visitor_method = NIL;
            SubLObject the_posting = get_cyblack_goal_satisfaction_visitor_the_posting(self);
            SubLObject environment = get_cyblack_goal_satisfaction_visitor_environment(self);
            try {
                try {
                    cyblack_basic_daemon_visitor_initialize_method(self);
                    environment = NIL;
                    the_posting = NIL;
                    sublisp_throw($sym236$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_VISITOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_goal_satisfaction_visitor_the_posting(self, the_posting);
                            set_cyblack_goal_satisfaction_visitor_environment(self, environment);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_goal_satisfaction_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym236$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_goal_satisfaction_visitor_method;
        }
    }

    public static final SubLObject cyblack_goal_satisfaction_visitor_set_initial_state_method(SubLObject self, SubLObject new_application, SubLObject new_environment, SubLObject new_posting) {
        if (new_environment == UNPROVIDED) {
            new_environment = NIL;
        }
        if (new_posting == UNPROVIDED) {
            new_posting = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_goal_satisfaction_visitor_method = NIL;
                SubLObject the_posting = get_cyblack_goal_satisfaction_visitor_the_posting(self);
                SubLObject environment = get_cyblack_goal_satisfaction_visitor_environment(self);
                try {
                    try {
                        cyblack_basic_daemon_visitor_set_initial_state_method(self, new_application, UNPROVIDED);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_environment) || (NIL != cyblack_precondition_pattern.cyblack_environment_p(new_environment)))) {
                                Errors.error($str_alt241$_SET_INITIAL_STATE__S____S_is_not, self, new_environment);
                            }
                        }
                        environment = new_environment;
                        the_posting = new_posting;
                        sublisp_throw($sym240$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_VISITOR_METHOD, environment);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_goal_satisfaction_visitor_the_posting(self, the_posting);
                                set_cyblack_goal_satisfaction_visitor_environment(self, environment);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_goal_satisfaction_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym240$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_VISITOR_METHOD);
                }
                return catch_var_for_cyblack_goal_satisfaction_visitor_method;
            }
        }
    }

    public static final SubLObject cyblack_goal_satisfaction_visitor_visit_method(SubLObject self, SubLObject daemon) {
        {
            SubLObject catch_var_for_cyblack_goal_satisfaction_visitor_method = NIL;
            SubLObject the_posting = get_cyblack_goal_satisfaction_visitor_the_posting(self);
            try {
                try {
                    if (NIL != instances.instance_of_p(daemon, CYBLACK_GOAL_SATISFACTION_DAEMON)) {
                        if (NIL != the_posting) {
                            cyblack_goal_satisfaction_daemon_stimulate_method(daemon, the_posting);
                        }
                    }
                    sublisp_throw($sym244$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_VISITOR_METHOD, daemon);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_goal_satisfaction_visitor_the_posting(self, the_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_goal_satisfaction_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym244$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_goal_satisfaction_visitor_method;
        }
    }

    public static final SubLObject cyblack_goal_satisfaction_visitor_get_final_state_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject declare_cyblack_blackboard_daemon_file() {
        declareFunction("cyblack_blackboard_daemon_p", "CYBLACK-BLACKBOARD-DAEMON-P", 1, 0, false);
        declareFunction("cyblack_pattern_based_blackboard_daemon_p", "CYBLACK-PATTERN-BASED-BLACKBOARD-DAEMON-P", 1, 0, false);
        declareFunction("cyblack_actuator_p", "CYBLACK-ACTUATOR-P", 1, 0, false);
        declareFunction("cyblack_posting_daemon_p", "CYBLACK-POSTING-DAEMON-P", 1, 0, false);
        declareFunction("cyblack_posting_based_goal_satisfaction_daemon_p", "CYBLACK-POSTING-BASED-GOAL-SATISFACTION-DAEMON-P", 1, 0, false);
        declareFunction("get_cyblack_posting_daemon_qua_list_element_qua_list_element_parent_links", "GET-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-QUA-LIST-ELEMENT-PARENT-LINKS", 1, 0, false);
        declareFunction("set_cyblack_posting_daemon_qua_list_element_qua_list_element_parent_links", "SET-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-QUA-LIST-ELEMENT-PARENT-LINKS", 2, 0, false);
        declareFunction("get_cyblack_posting_daemon_qua_list_element_qua_list_element_self_deletion_mode", "GET-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 1, 0, false);
        declareFunction("set_cyblack_posting_daemon_qua_list_element_qua_list_element_self_deletion_mode", "SET-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 2, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_perform_action_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-PERFORM-ACTION-METHOD", 3, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_on_delete_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-ON-DELETE-METHOD", 2, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_on_add_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-ON-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_get_collections_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-GET-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_member_p_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_delete_self_from_all_collections_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_delete_self_from_collection_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-DELETE-SELF-FROM-COLLECTION-METHOD", 2, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_delete_parent_link_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-DELETE-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_add_parent_link_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-ADD-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_posting_daemon_qua_list_element_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_posting_daemon_qua_list_element_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_p", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-P", 1, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_initialize_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_get_parent_links_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-GET-PARENT-LINKS-METHOD", 1, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_set_parent_links_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-SET-PARENT-LINKS-METHOD", 2, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_get_self_deletion_mode_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-GET-SELF-DELETION-MODE-METHOD", 1, 0, false);
        declareFunction("cyblack_posting_daemon_qua_list_element_set_self_deletion_mode_method", "CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-SET-SELF-DELETION-MODE-METHOD", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_daemon_stimulating_posting", "GET-CYBLACK-BASIC-POSTING-DAEMON-STIMULATING-POSTING", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_daemon_stimulating_posting", "SET-CYBLACK-BASIC-POSTING-DAEMON-STIMULATING-POSTING", 2, 0, false);
        declareFunction("get_cyblack_basic_posting_daemon_panel", "GET-CYBLACK-BASIC-POSTING-DAEMON-PANEL", 1, 0, false);
        declareFunction("set_cyblack_basic_posting_daemon_panel", "SET-CYBLACK-BASIC-POSTING-DAEMON-PANEL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_posting_daemon_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-DAEMON-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_posting_daemon_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-DAEMON-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_posting_daemon_p", "CYBLACK-BASIC-POSTING-DAEMON-P", 1, 0, false);
        declareFunction("cyblack_basic_posting_daemon_initialize_method", "CYBLACK-BASIC-POSTING-DAEMON-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_daemon_print_method", "CYBLACK-BASIC-POSTING-DAEMON-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_posting_daemon_get_application_method", "CYBLACK-BASIC-POSTING-DAEMON-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_daemon_set_application_method", "CYBLACK-BASIC-POSTING-DAEMON-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_daemon_stimulate_method", "CYBLACK-BASIC-POSTING-DAEMON-STIMULATE-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_posting_daemon_perform_action_method", "CYBLACK-BASIC-POSTING-DAEMON-PERFORM-ACTION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_daemon_get_panel_method", "CYBLACK-BASIC-POSTING-DAEMON-GET-PANEL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_daemon_set_panel_method", "CYBLACK-BASIC-POSTING-DAEMON-SET-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_posting_daemon_get_stimulating_posting_method", "CYBLACK-BASIC-POSTING-DAEMON-GET-STIMULATING-POSTING-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_posting_daemon_set_stimulating_posting_method", "CYBLACK-BASIC-POSTING-DAEMON-SET-STIMULATING-POSTING-METHOD", 2, 0, false);
        declareFunction("get_cyblack_goal_satisfaction_daemon_deactivated", "GET-CYBLACK-GOAL-SATISFACTION-DAEMON-DEACTIVATED", 1, 0, false);
        declareFunction("set_cyblack_goal_satisfaction_daemon_deactivated", "SET-CYBLACK-GOAL-SATISFACTION-DAEMON-DEACTIVATED", 2, 0, false);
        declareFunction("get_cyblack_goal_satisfaction_daemon_local_environment", "GET-CYBLACK-GOAL-SATISFACTION-DAEMON-LOCAL-ENVIRONMENT", 1, 0, false);
        declareFunction("set_cyblack_goal_satisfaction_daemon_local_environment", "SET-CYBLACK-GOAL-SATISFACTION-DAEMON-LOCAL-ENVIRONMENT", 2, 0, false);
        declareFunction("get_cyblack_goal_satisfaction_daemon_goal_posting", "GET-CYBLACK-GOAL-SATISFACTION-DAEMON-GOAL-POSTING", 1, 0, false);
        declareFunction("set_cyblack_goal_satisfaction_daemon_goal_posting", "SET-CYBLACK-GOAL-SATISFACTION-DAEMON-GOAL-POSTING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_goal_satisfaction_daemon_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GOAL-SATISFACTION-DAEMON-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_goal_satisfaction_daemon_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GOAL-SATISFACTION-DAEMON-INSTANCE", 1, 0, false);
        declareFunction("cyblack_goal_satisfaction_daemon_p", "CYBLACK-GOAL-SATISFACTION-DAEMON-P", 1, 0, false);
        declareFunction("cyblack_goal_satisfaction_daemon_initialize_method", "CYBLACK-GOAL-SATISFACTION-DAEMON-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_goal_satisfaction_daemon_get_goal_posting_method", "CYBLACK-GOAL-SATISFACTION-DAEMON-GET-GOAL-POSTING-METHOD", 1, 0, false);
        declareFunction("cyblack_goal_satisfaction_daemon_set_goal_posting_method", "CYBLACK-GOAL-SATISFACTION-DAEMON-SET-GOAL-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_goal_satisfaction_daemon_get_local_environment_method", "CYBLACK-GOAL-SATISFACTION-DAEMON-GET-LOCAL-ENVIRONMENT-METHOD", 1, 0, false);
        declareFunction("cyblack_goal_satisfaction_daemon_set_local_environment_method", "CYBLACK-GOAL-SATISFACTION-DAEMON-SET-LOCAL-ENVIRONMENT-METHOD", 2, 0, false);
        declareFunction("cyblack_goal_satisfaction_daemon_bind_posting_method", "CYBLACK-GOAL-SATISFACTION-DAEMON-BIND-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_goal_satisfaction_daemon_stimulate_method", "CYBLACK-GOAL-SATISFACTION-DAEMON-STIMULATE-METHOD", 1, 1, false);
        declareFunction("cyblack_goal_satisfaction_daemon_perform_action_method", "CYBLACK-GOAL-SATISFACTION-DAEMON-PERFORM-ACTION-METHOD", 1, 0, false);
        declareFunction("cyblack_goal_satisfaction_daemon_deactivate_self_method", "CYBLACK-GOAL-SATISFACTION-DAEMON-DEACTIVATE-SELF-METHOD", 1, 0, false);
        declareFunction("cyblack_daemon_visitor_p", "CYBLACK-DAEMON-VISITOR-P", 1, 0, false);
        declareFunction("get_cyblack_basic_daemon_visitor_continue", "GET-CYBLACK-BASIC-DAEMON-VISITOR-CONTINUE", 1, 0, false);
        declareFunction("set_cyblack_basic_daemon_visitor_continue", "SET-CYBLACK-BASIC-DAEMON-VISITOR-CONTINUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_daemon_visitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DAEMON-VISITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_daemon_visitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DAEMON-VISITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_daemon_visitor_p", "CYBLACK-BASIC-DAEMON-VISITOR-P", 1, 0, false);
        declareFunction("cyblack_basic_daemon_visitor_initialize_method", "CYBLACK-BASIC-DAEMON-VISITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_daemon_visitor_set_initial_state_method", "CYBLACK-BASIC-DAEMON-VISITOR-SET-INITIAL-STATE-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_daemon_visitor_visit_method", "CYBLACK-BASIC-DAEMON-VISITOR-VISIT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_daemon_visitor_continue_p_method", "CYBLACK-BASIC-DAEMON-VISITOR-CONTINUE-P-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_daemon_visitor_get_final_state_method", "CYBLACK-BASIC-DAEMON-VISITOR-GET-FINAL-STATE-METHOD", 1, 0, false);
        declareFunction("cyblack_posting_daemon_visitor_p", "CYBLACK-POSTING-DAEMON-VISITOR-P", 1, 0, false);
        declareFunction("get_cyblack_goal_satisfaction_visitor_the_posting", "GET-CYBLACK-GOAL-SATISFACTION-VISITOR-THE-POSTING", 1, 0, false);
        declareFunction("set_cyblack_goal_satisfaction_visitor_the_posting", "SET-CYBLACK-GOAL-SATISFACTION-VISITOR-THE-POSTING", 2, 0, false);
        declareFunction("get_cyblack_goal_satisfaction_visitor_environment", "GET-CYBLACK-GOAL-SATISFACTION-VISITOR-ENVIRONMENT", 1, 0, false);
        declareFunction("set_cyblack_goal_satisfaction_visitor_environment", "SET-CYBLACK-GOAL-SATISFACTION-VISITOR-ENVIRONMENT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_goal_satisfaction_visitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GOAL-SATISFACTION-VISITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_goal_satisfaction_visitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GOAL-SATISFACTION-VISITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_goal_satisfaction_visitor_p", "CYBLACK-GOAL-SATISFACTION-VISITOR-P", 1, 0, false);
        declareFunction("cyblack_goal_satisfaction_visitor_initialize_method", "CYBLACK-GOAL-SATISFACTION-VISITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_goal_satisfaction_visitor_set_initial_state_method", "CYBLACK-GOAL-SATISFACTION-VISITOR-SET-INITIAL-STATE-METHOD", 2, 2, false);
        declareFunction("cyblack_goal_satisfaction_visitor_visit_method", "CYBLACK-GOAL-SATISFACTION-VISITOR-VISIT-METHOD", 2, 0, false);
        declareFunction("cyblack_goal_satisfaction_visitor_get_final_state_method", "CYBLACK-GOAL-SATISFACTION-VISITOR-GET-FINAL-STATE-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_blackboard_daemon_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_blackboard_daemon_file() {
                interfaces.new_interface(CYBLACK_BLACKBOARD_DAEMON, $list_alt1, $list_alt2, $list_alt3);
        interfaces.new_interface(CYBLACK_PATTERN_BASED_BLACKBOARD_DAEMON, $list_alt5, $list_alt6, $list_alt7);
        interfaces.new_interface(CYBLACK_ACTUATOR, $list_alt9, $list_alt10, $list_alt11);
        interfaces.new_interface(CYBLACK_POSTING_DAEMON, $list_alt13, $list_alt14, $list_alt15);
        interfaces.new_interface(CYBLACK_POSTING_BASED_GOAL_SATISFACTION_DAEMON, $list_alt17, $list_alt18, $list_alt19);
        classes.subloop_new_class(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, CYBLACK_OBJECT, $list_alt17, NIL, $list_alt22);
        classes.class_set_implements_slot_listeners(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, NIL);
        methods.methods_incorporate_instance_method(PERFORM_ACTION, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt27, $list_alt28, $list_alt29);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, PERFORM_ACTION, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_PERFORM_ACTION_METHOD);
        methods.methods_incorporate_instance_method(ON_DELETE, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt27, $list_alt32, $list_alt33);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, ON_DELETE, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_ON_DELETE_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt27, $list_alt32, $list_alt33);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, ON_ADD, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_COLLECTIONS, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt27, NIL, $list_alt38);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, GET_COLLECTIONS, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_GET_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt27, $list_alt41, $list_alt42);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, MEMBER_P, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_ALL_COLLECTIONS, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt27, NIL, $list_alt45);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, DELETE_SELF_FROM_ALL_COLLECTIONS, $sym46$CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_DELETE_SELF_FROM_ALL_COLL);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_COLLECTION, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt27, $list_alt41, $list_alt48);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, DELETE_SELF_FROM_COLLECTION, $sym49$CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_DELETE_SELF_FROM_COLLECTI);
        methods.methods_incorporate_instance_method(DELETE_PARENT_LINK, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt27, $list_alt51, $list_alt52);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, DELETE_PARENT_LINK, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_DELETE_PARENT_LINK_METHOD);
        methods.methods_incorporate_instance_method(ADD_PARENT_LINK, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt27, $list_alt55, $list_alt56);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, ADD_PARENT_LINK, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_ADD_PARENT_LINK_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $sym60$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEME);
        classes.subloop_note_instance_initialization_function(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $sym65$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEME);
        subloop_reserved_initialize_cyblack_posting_daemon_qua_list_element_class(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt67, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, INITIALIZE, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_PARENT_LINKS, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt67, NIL, $list_alt72);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, GET_PARENT_LINKS, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_GET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT_LINKS, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt67, $list_alt76, $list_alt77);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, SET_PARENT_LINKS, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_SET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_SELF_DELETION_MODE, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt67, NIL, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, GET_SELF_DELETION_MODE, $sym83$CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_GET_SELF_DELETION_MODE_ME);
        methods.methods_incorporate_instance_method(SET_SELF_DELETION_MODE, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, $list_alt67, $list_alt85, $list_alt86);
        methods.subloop_register_instance_method(CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, SET_SELF_DELETION_MODE, $sym88$CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_SET_SELF_DELETION_MODE_ME);
        classes.subloop_new_class(CYBLACK_BASIC_POSTING_DAEMON, CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT, NIL, NIL, $list_alt90);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_POSTING_DAEMON, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_POSTING_DAEMON, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_DAEMON_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_POSTING_DAEMON, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_DAEMON_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_posting_daemon_class(CYBLACK_BASIC_POSTING_DAEMON);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_POSTING_DAEMON, $list_alt67, NIL, $list_alt95);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_DAEMON, INITIALIZE, CYBLACK_BASIC_POSTING_DAEMON_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_POSTING_DAEMON, $list_alt27, $list_alt99, $list_alt100);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_DAEMON, PRINT, CYBLACK_BASIC_POSTING_DAEMON_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_BASIC_POSTING_DAEMON, $list_alt27, NIL, $list_alt105);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_DAEMON, GET_APPLICATION, CYBLACK_BASIC_POSTING_DAEMON_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_BASIC_POSTING_DAEMON, $list_alt27, $list_alt109, $list_alt110);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_DAEMON, SET_APPLICATION, CYBLACK_BASIC_POSTING_DAEMON_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE, CYBLACK_BASIC_POSTING_DAEMON, $list_alt27, $list_alt115, $list_alt116);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_DAEMON, STIMULATE, CYBLACK_BASIC_POSTING_DAEMON_STIMULATE_METHOD);
        methods.methods_incorporate_instance_method(PERFORM_ACTION, CYBLACK_BASIC_POSTING_DAEMON, $list_alt27, NIL, $list_alt118);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_DAEMON, PERFORM_ACTION, CYBLACK_BASIC_POSTING_DAEMON_PERFORM_ACTION_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL, CYBLACK_BASIC_POSTING_DAEMON, $list_alt121, NIL, $list_alt122);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_DAEMON, GET_PANEL, CYBLACK_BASIC_POSTING_DAEMON_GET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(SET_PANEL, CYBLACK_BASIC_POSTING_DAEMON, $list_alt27, $list_alt125, $list_alt126);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_DAEMON, SET_PANEL, CYBLACK_BASIC_POSTING_DAEMON_SET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(GET_STIMULATING_POSTING, CYBLACK_BASIC_POSTING_DAEMON, $list_alt27, NIL, $list_alt105);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_DAEMON, GET_STIMULATING_POSTING, CYBLACK_BASIC_POSTING_DAEMON_GET_STIMULATING_POSTING_METHOD);
        methods.methods_incorporate_instance_method(SET_STIMULATING_POSTING, CYBLACK_BASIC_POSTING_DAEMON, $list_alt27, $list_alt133, $list_alt134);
        methods.subloop_register_instance_method(CYBLACK_BASIC_POSTING_DAEMON, SET_STIMULATING_POSTING, CYBLACK_BASIC_POSTING_DAEMON_SET_STIMULATING_POSTING_METHOD);
        classes.subloop_new_class(CYBLACK_GOAL_SATISFACTION_DAEMON, CYBLACK_BASIC_POSTING_DAEMON, NIL, NIL, $list_alt139);
        classes.class_set_implements_slot_listeners(CYBLACK_GOAL_SATISFACTION_DAEMON, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_GOAL_SATISFACTION_DAEMON, $sym143$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GOAL_SATISFACTION_DAEMON_CLAS);
        classes.subloop_note_instance_initialization_function(CYBLACK_GOAL_SATISFACTION_DAEMON, $sym144$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GOAL_SATISFACTION_DAEMON_INST);
        subloop_reserved_initialize_cyblack_goal_satisfaction_daemon_class(CYBLACK_GOAL_SATISFACTION_DAEMON);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_GOAL_SATISFACTION_DAEMON, $list_alt67, NIL, $list_alt145);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_DAEMON, INITIALIZE, CYBLACK_GOAL_SATISFACTION_DAEMON_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_GOAL_POSTING, CYBLACK_GOAL_SATISFACTION_DAEMON, $list_alt27, NIL, $list_alt149);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_DAEMON, GET_GOAL_POSTING, CYBLACK_GOAL_SATISFACTION_DAEMON_GET_GOAL_POSTING_METHOD);
        methods.methods_incorporate_instance_method(SET_GOAL_POSTING, CYBLACK_GOAL_SATISFACTION_DAEMON, $list_alt27, $list_alt153, $list_alt154);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_DAEMON, SET_GOAL_POSTING, CYBLACK_GOAL_SATISFACTION_DAEMON_SET_GOAL_POSTING_METHOD);
        methods.methods_incorporate_instance_method(GET_LOCAL_ENVIRONMENT, CYBLACK_GOAL_SATISFACTION_DAEMON, $list_alt27, NIL, $list_alt159);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_DAEMON, GET_LOCAL_ENVIRONMENT, CYBLACK_GOAL_SATISFACTION_DAEMON_GET_LOCAL_ENVIRONMENT_METHOD);
        methods.methods_incorporate_instance_method(SET_LOCAL_ENVIRONMENT, CYBLACK_GOAL_SATISFACTION_DAEMON, $list_alt27, $list_alt163, $list_alt164);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_DAEMON, SET_LOCAL_ENVIRONMENT, CYBLACK_GOAL_SATISFACTION_DAEMON_SET_LOCAL_ENVIRONMENT_METHOD);
        methods.methods_incorporate_instance_method(BIND_POSTING, CYBLACK_GOAL_SATISFACTION_DAEMON, $list_alt27, $list_alt133, $list_alt169);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_DAEMON, BIND_POSTING, CYBLACK_GOAL_SATISFACTION_DAEMON_BIND_POSTING_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE, CYBLACK_GOAL_SATISFACTION_DAEMON, $list_alt27, $list_alt115, $list_alt174);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_DAEMON, STIMULATE, CYBLACK_GOAL_SATISFACTION_DAEMON_STIMULATE_METHOD);
        methods.methods_incorporate_instance_method(PERFORM_ACTION, CYBLACK_GOAL_SATISFACTION_DAEMON, $list_alt27, NIL, $list_alt191);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_DAEMON, PERFORM_ACTION, CYBLACK_GOAL_SATISFACTION_DAEMON_PERFORM_ACTION_METHOD);
        methods.methods_incorporate_instance_method(DEACTIVATE_SELF, CYBLACK_GOAL_SATISFACTION_DAEMON, $list_alt27, NIL, $list_alt194);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_DAEMON, DEACTIVATE_SELF, CYBLACK_GOAL_SATISFACTION_DAEMON_DEACTIVATE_SELF_METHOD);
        interfaces.new_interface(CYBLACK_DAEMON_VISITOR, $list_alt9, $list_alt10, $list_alt198);
        classes.subloop_new_class(CYBLACK_BASIC_DAEMON_VISITOR, CYBLACK_OBJECT, $list_alt200, NIL, $list_alt201);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_DAEMON_VISITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_DAEMON_VISITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DAEMON_VISITOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_DAEMON_VISITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DAEMON_VISITOR_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_daemon_visitor_class(CYBLACK_BASIC_DAEMON_VISITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_DAEMON_VISITOR, $list_alt67, NIL, $list_alt205);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DAEMON_VISITOR, INITIALIZE, CYBLACK_BASIC_DAEMON_VISITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, CYBLACK_BASIC_DAEMON_VISITOR, $list_alt27, $list_alt209, $list_alt210);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DAEMON_VISITOR, SET_INITIAL_STATE, CYBLACK_BASIC_DAEMON_VISITOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_BASIC_DAEMON_VISITOR, $list_alt27, $list_alt214, $list_alt215);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DAEMON_VISITOR, VISIT, CYBLACK_BASIC_DAEMON_VISITOR_VISIT_METHOD);
        methods.methods_incorporate_instance_method(CONTINUE_P, CYBLACK_BASIC_DAEMON_VISITOR, $list_alt27, $list_alt219, $list_alt220);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DAEMON_VISITOR, CONTINUE_P, CYBLACK_BASIC_DAEMON_VISITOR_CONTINUE_P_METHOD);
        methods.methods_incorporate_instance_method(GET_FINAL_STATE, CYBLACK_BASIC_DAEMON_VISITOR, $list_alt27, NIL, $list_alt191);
        methods.subloop_register_instance_method(CYBLACK_BASIC_DAEMON_VISITOR, GET_FINAL_STATE, CYBLACK_BASIC_DAEMON_VISITOR_GET_FINAL_STATE_METHOD);
        interfaces.new_interface(CYBLACK_POSTING_DAEMON_VISITOR, $list_alt200, $list_alt226, $list_alt227);
        classes.subloop_new_class(CYBLACK_GOAL_SATISFACTION_VISITOR, CYBLACK_BASIC_DAEMON_VISITOR, $list_alt229, NIL, $list_alt230);
        classes.class_set_implements_slot_listeners(CYBLACK_GOAL_SATISFACTION_VISITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_GOAL_SATISFACTION_VISITOR, $sym233$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GOAL_SATISFACTION_VISITOR_CLA);
        classes.subloop_note_instance_initialization_function(CYBLACK_GOAL_SATISFACTION_VISITOR, $sym234$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GOAL_SATISFACTION_VISITOR_INS);
        subloop_reserved_initialize_cyblack_goal_satisfaction_visitor_class(CYBLACK_GOAL_SATISFACTION_VISITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_GOAL_SATISFACTION_VISITOR, $list_alt67, NIL, $list_alt235);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_VISITOR, INITIALIZE, CYBLACK_GOAL_SATISFACTION_VISITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, CYBLACK_GOAL_SATISFACTION_VISITOR, $list_alt27, $list_alt238, $list_alt239);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_VISITOR, SET_INITIAL_STATE, CYBLACK_GOAL_SATISFACTION_VISITOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_GOAL_SATISFACTION_VISITOR, $list_alt27, $list_alt214, $list_alt243);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_VISITOR, VISIT, CYBLACK_GOAL_SATISFACTION_VISITOR_VISIT_METHOD);
        methods.methods_incorporate_instance_method(GET_FINAL_STATE, CYBLACK_GOAL_SATISFACTION_VISITOR, $list_alt27, NIL, $list_alt191);
        methods.subloop_register_instance_method(CYBLACK_GOAL_SATISFACTION_VISITOR, GET_FINAL_STATE, CYBLACK_GOAL_SATISFACTION_VISITOR_GET_FINAL_STATE_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_BLACKBOARD_DAEMON = makeSymbol("CYBLACK-BLACKBOARD-DAEMON");

    static private final SubLList $list_alt1 = list(makeSymbol("CYBLACK-COMPONENT"), makeSymbol("LIST-ELEMENT-TEMPLATE"));

    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT"), makeSymbol("LIST-ELEMENT-TEMPLATE")));

    static private final SubLList $list_alt3 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("POSTING"), NIL)), makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_PATTERN_BASED_BLACKBOARD_DAEMON = makeSymbol("CYBLACK-PATTERN-BASED-BLACKBOARD-DAEMON");

    static private final SubLList $list_alt5 = list(makeSymbol("CYBLACK-BLACKBOARD-DAEMON"));

    static private final SubLList $list_alt6 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-BLACKBOARD-DAEMON")));

    static private final SubLList $list_alt7 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRECONDITION-PATTERN"), list(makeSymbol("NEW-PRECONDITION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPLETE-PRECONDITION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-DATATYPES"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_ACTUATOR = makeSymbol("CYBLACK-ACTUATOR");

    static private final SubLList $list_alt9 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt10 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt11 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_POSTING_DAEMON = makeSymbol("CYBLACK-POSTING-DAEMON");

    static private final SubLList $list_alt13 = list(makeSymbol("CYBLACK-BLACKBOARD-DAEMON"), makeSymbol("CYBLACK-ACTUATOR"));

    static private final SubLList $list_alt14 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-BLACKBOARD-DAEMON"), makeSymbol("CYBLACK-ACTUATOR")));

    static private final SubLList $list_alt15 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STIMULATING-POSTING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STIMULATING-POSTING"), list(makeSymbol("NEW-POSTING")), makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_POSTING_BASED_GOAL_SATISFACTION_DAEMON = makeSymbol("CYBLACK-POSTING-BASED-GOAL-SATISFACTION-DAEMON");

    static private final SubLList $list_alt17 = list(makeSymbol("CYBLACK-POSTING-DAEMON"));

    static private final SubLList $list_alt18 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-POSTING-DAEMON")));

    static private final SubLList $list_alt19 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GOAL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GOAL"), list(makeSymbol("NEW-GOAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SATISFY-GOAL"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT");



    static private final SubLList $list_alt22 = list(new SubLObject[]{ list(makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT-LINKS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT-LINKS"), list(makeSymbol("NEW-PARENT-LINKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SELF-DELETION-MODE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SELF-DELETION-MODE"), list(makeSymbol("MODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PARENT-LINK"), list(makeSymbol("NEW-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-PARENT-LINK"), list(makeSymbol("OLD-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-COLLECTION"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTION"), makeSymbol("PARAMETERS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });





    public static final SubLInteger $int$4097 = makeInteger(4097);



    static private final SubLList $list_alt27 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt28 = list(makeSymbol("ACTION"), makeSymbol("PARAMETERS"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("IGNORE"), makeSymbol("ACTION"), makeSymbol("PARAMETERS")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_PERFORM_ACTION_METHOD = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-PERFORM-ACTION-METHOD");



    static private final SubLList $list_alt32 = list(makeSymbol("PARENT-LIST"));

    static private final SubLList $list_alt33 = list(list(makeSymbol("IGNORE"), makeSymbol("PARENT-LIST")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_ON_DELETE_METHOD = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-ON-DELETE-METHOD");



    private static final SubLSymbol CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_ON_ADD_METHOD = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-ON-ADD-METHOD");



    static private final SubLList $list_alt38 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-COLLECTIONS"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS"), makeSymbol("TEMPLATE-COLLECTIONS")), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK"))), list(RET, list(makeSymbol("UNIQUE-ELEMENTS"), makeSymbol("TEMPLATE-COLLECTIONS")))));

    private static final SubLSymbol CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_GET_COLLECTIONS_METHOD = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-GET-COLLECTIONS-METHOD");



    static private final SubLList $list_alt41 = list(makeSymbol("COLLECTION"));

    static private final SubLList $list_alt42 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(RET, T))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_MEMBER_P_METHOD = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-MEMBER-P-METHOD");



    static private final SubLList $list_alt45 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), NIL))), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), NIL)), list(RET, makeSymbol("SELF"))));

    static private final SubLSymbol $sym46$CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_DELETE_SELF_FROM_ALL_COLL = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD");



    static private final SubLList $list_alt48 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), makeSymbol("COLLECTION")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(RET, makeSymbol("SELF"))));

    static private final SubLSymbol $sym49$CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_DELETE_SELF_FROM_COLLECTI = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-DELETE-SELF-FROM-COLLECTION-METHOD");



    static private final SubLList $list_alt51 = list(makeSymbol("OLD-PARENT-LINK"));

    static private final SubLList $list_alt52 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OLD-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), list(makeSymbol("DLC-OWNER"), makeSymbol("OLD-PARENT-LINK"))), list(RET, makeSymbol("OLD-PARENT-LINK"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))))))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_DELETE_PARENT_LINK_METHOD = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-DELETE-PARENT-LINK-METHOD");



    static private final SubLList $list_alt55 = list(makeSymbol("NEW-PARENT-LINK"));

    static private final SubLList $list_alt56 = list(list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("NEW-PARENT-LINK"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ADD")), list(makeSymbol("DLC-OWNER"), makeSymbol("NEW-PARENT-LINK"))), list(RET, makeSymbol("NEW-PARENT-LINK")));

    private static final SubLSymbol CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_ADD_PARENT_LINK_METHOD = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-ADD-PARENT-LINK-METHOD");





    static private final SubLSymbol $sym60$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEME = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-CLASS");









    static private final SubLSymbol $sym65$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEME = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-INSTANCE");



    static private final SubLList $list_alt67 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt68 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym69$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-METHOD");

    private static final SubLSymbol CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_INITIALIZE_METHOD = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-INITIALIZE-METHOD");



    static private final SubLList $list_alt72 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS")));

    static private final SubLSymbol $sym73$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-METHOD");

    private static final SubLSymbol CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_GET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-GET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt76 = list(makeSymbol("NEW-PARENT-LINKS"));

    static private final SubLList $list_alt77 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeSymbol("NEW-PARENT-LINKS")), list(RET, makeSymbol("NEW-PARENT-LINKS")));

    static private final SubLSymbol $sym78$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-METHOD");

    private static final SubLSymbol CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_SET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-SET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt81 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE")));

    static private final SubLSymbol $sym82$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-METHOD");

    static private final SubLSymbol $sym83$CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_GET_SELF_DELETION_MODE_ME = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-GET-SELF-DELETION-MODE-METHOD");



    static private final SubLList $list_alt85 = list(makeSymbol("MODE"));

    static private final SubLList $list_alt86 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeSymbol("MODE")), list(RET, makeSymbol("MODE")));

    static private final SubLSymbol $sym87$OUTER_CATCH_FOR_CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-METHOD");

    static private final SubLSymbol $sym88$CYBLACK_POSTING_DAEMON_QUA_LIST_ELEMENT_SET_SELF_DELETION_MODE_ME = makeSymbol("CYBLACK-POSTING-DAEMON-QUA-LIST-ELEMENT-SET-SELF-DELETION-MODE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_DAEMON = makeSymbol("CYBLACK-BASIC-POSTING-DAEMON");

    static private final SubLList $list_alt90 = list(new SubLObject[]{ list(makeSymbol("PANEL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STIMULATING-POSTING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("POSTING"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL"), list(makeSymbol("NEW-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STIMULATING-POSTING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STIMULATING-POSTING"), list(makeSymbol("NEW-POSTING")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol STIMULATING_POSTING = makeSymbol("STIMULATING-POSTING");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_DAEMON_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-DAEMON-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_POSTING_DAEMON_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-POSTING-DAEMON-INSTANCE");

    static private final SubLList $list_alt95 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("STIMULATING-POSTING"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym96$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-DAEMON-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_DAEMON_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-DAEMON-INITIALIZE-METHOD");



    static private final SubLList $list_alt99 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt100 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S-~S(~S)>"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("SELF"))), makeSymbol("INSTANCE-NUMBER"), makeSymbol("STIMULATING-POSTING")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym101$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-DAEMON-METHOD");

    static private final SubLString $str_alt102$___S__S__S__ = makeString("#<~S-~S(~S)>");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_DAEMON_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-DAEMON-PRINT-METHOD");



    static private final SubLList $list_alt105 = list(list(RET, makeSymbol("STIMULATING-POSTING")));

    static private final SubLSymbol $sym106$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-DAEMON-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_DAEMON_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-DAEMON-GET-APPLICATION-METHOD");



    static private final SubLList $list_alt109 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt110 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym111$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-DAEMON-METHOD");

    static private final SubLString $str_alt112$_SET_APPLICATION__S____S_is_not_a = makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION.");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_DAEMON_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-DAEMON-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt115 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("POSTING"), NIL));

    static private final SubLList $list_alt116 = list(list(makeSymbol("SET-STIMULATING-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PERFORM-ACTION"))), list(RET, makeSymbol("POSTING")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_DAEMON_STIMULATE_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-DAEMON-STIMULATE-METHOD");

    static private final SubLList $list_alt118 = list(list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_DAEMON_PERFORM_ACTION_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-DAEMON-PERFORM-ACTION-METHOD");



    static private final SubLList $list_alt121 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt122 = list(list(RET, makeSymbol("PANEL")));

    private static final SubLSymbol CYBLACK_BASIC_POSTING_DAEMON_GET_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-DAEMON-GET-PANEL-METHOD");



    static private final SubLList $list_alt125 = list(makeSymbol("NEW-PANEL"));

    static private final SubLList $list_alt126 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PANEL")), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("NEW-PANEL"))), makeString("~%(SET-PANEL ~S): ~S is not an instance of CYBLACK-PANEL."), makeSymbol("SELF"), makeSymbol("NEW-PANEL")), list(makeSymbol("CSETQ"), makeSymbol("PANEL"), makeSymbol("NEW-PANEL")), list(RET, makeSymbol("NEW-PANEL")));

    static private final SubLSymbol $sym127$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-DAEMON-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_DAEMON_SET_PANEL_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-DAEMON-SET-PANEL-METHOD");

    private static final SubLSymbol GET_STIMULATING_POSTING = makeSymbol("GET-STIMULATING-POSTING");

    static private final SubLSymbol $sym130$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-DAEMON-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_DAEMON_GET_STIMULATING_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-DAEMON-GET-STIMULATING-POSTING-METHOD");

    private static final SubLSymbol SET_STIMULATING_POSTING = makeSymbol("SET-STIMULATING-POSTING");

    static private final SubLList $list_alt133 = list(makeSymbol("NEW-POSTING"));

    static private final SubLList $list_alt134 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-POSTING")), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("NEW-POSTING"))), makeString("(SET-STIMULATING-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("NEW-POSTING")), list(makeSymbol("CSETQ"), makeSymbol("STIMULATING-POSTING"), makeSymbol("NEW-POSTING")), list(RET, makeSymbol("NEW-POSTING")));

    static private final SubLSymbol $sym135$OUTER_CATCH_FOR_CYBLACK_BASIC_POSTING_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-POSTING-DAEMON-METHOD");

    static private final SubLString $str_alt136$_SET_STIMULATING_POSTING__S____S_ = makeString("(SET-STIMULATING-POSTING ~S): ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol CYBLACK_BASIC_POSTING_DAEMON_SET_STIMULATING_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-POSTING-DAEMON-SET-STIMULATING-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_DAEMON = makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON");

    static private final SubLList $list_alt139 = list(new SubLObject[]{ list(makeSymbol("GOAL-POSTING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LOCAL-ENVIRONMENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEACTIVATED"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GOAL-POSTING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GOAL-POSTING"), list(makeSymbol("NEW-GOAL-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LOCAL-ENVIRONMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LOCAL-ENVIRONMENT"), list(makeSymbol("NEW-LOCAL-ENVIRONMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BIND-POSTING"), list(makeSymbol("NEW-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("POSTING"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEACTIVATE-SELF"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol DEACTIVATED = makeSymbol("DEACTIVATED");





    static private final SubLSymbol $sym143$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GOAL_SATISFACTION_DAEMON_CLAS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GOAL-SATISFACTION-DAEMON-CLASS");

    static private final SubLSymbol $sym144$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GOAL_SATISFACTION_DAEMON_INST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GOAL-SATISFACTION-DAEMON-INSTANCE");

    static private final SubLList $list_alt145 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DEACTIVATED"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym146$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GOAL-SATISFACTION-DAEMON-METHOD");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_DAEMON_INITIALIZE_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON-INITIALIZE-METHOD");

    private static final SubLSymbol GET_GOAL_POSTING = makeSymbol("GET-GOAL-POSTING");

    static private final SubLList $list_alt149 = list(list(RET, makeSymbol("GOAL-POSTING")));

    static private final SubLSymbol $sym150$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GOAL-SATISFACTION-DAEMON-METHOD");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_DAEMON_GET_GOAL_POSTING_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON-GET-GOAL-POSTING-METHOD");

    private static final SubLSymbol SET_GOAL_POSTING = makeSymbol("SET-GOAL-POSTING");

    static private final SubLList $list_alt153 = list(makeSymbol("NEW-GOAL-POSTING"));

    static private final SubLList $list_alt154 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-GOAL-POSTING")), list(makeSymbol("CYBLACK-GOAL-POSTING-P"), makeSymbol("NEW-GOAL-POSTING"))), makeString("(SET-GOAL-POSTING ~S): ~S is not an instance of CYBLACK-GOAL-POSTING."), makeSymbol("SELF"), makeSymbol("NEW-GOAL-POSTING")), list(makeSymbol("CSETQ"), makeSymbol("GOAL-POSTING"), makeSymbol("NEW-GOAL-POSTING")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("GOAL-POSTING"), makeSymbol("LOCAL-ENVIRONMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("GOAL-POSTING-ENVIRONMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("GOAL-POSTING"), list(QUOTE, makeSymbol("GET-LOCAL-ENVIRONMENT"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-OUTER-SCOPE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("LOCAL-ENVIRONMENT"), makeSymbol("GOAL-POSTING-ENVIRONMENT")))), list(RET, makeSymbol("NEW-GOAL-POSTING")));

    static private final SubLSymbol $sym155$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GOAL-SATISFACTION-DAEMON-METHOD");

    static private final SubLString $str_alt156$_SET_GOAL_POSTING__S____S_is_not_ = makeString("(SET-GOAL-POSTING ~S): ~S is not an instance of CYBLACK-GOAL-POSTING.");

    private static final SubLSymbol GET_LOCAL_ENVIRONMENT = makeSymbol("GET-LOCAL-ENVIRONMENT");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_DAEMON_SET_GOAL_POSTING_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON-SET-GOAL-POSTING-METHOD");

    static private final SubLList $list_alt159 = list(list(RET, makeSymbol("LOCAL-ENVIRONMENT")));

    static private final SubLSymbol $sym160$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GOAL-SATISFACTION-DAEMON-METHOD");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_DAEMON_GET_LOCAL_ENVIRONMENT_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON-GET-LOCAL-ENVIRONMENT-METHOD");

    private static final SubLSymbol SET_LOCAL_ENVIRONMENT = makeSymbol("SET-LOCAL-ENVIRONMENT");

    static private final SubLList $list_alt163 = list(makeSymbol("NEW-LOCAL-ENVIRONMENT"));

    static private final SubLList $list_alt164 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-LOCAL-ENVIRONMENT")), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("NEW-LOCAL-ENVIRONMENT"))), makeString("(SET-LOCAL-ENVIRONMENT ~S): ~S is not an instance of CYBLACK-ENVIRONMENT."), makeSymbol("SELF"), makeSymbol("NEW-LOCAL-ENVIRONMENT")), list(makeSymbol("CSETQ"), makeSymbol("LOCAL-ENVIRONMENT"), makeSymbol("NEW-LOCAL-ENVIRONMENT")), list(RET, makeSymbol("NEW-LOCAL-ENVIRONMENT")));

    static private final SubLSymbol $sym165$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GOAL-SATISFACTION-DAEMON-METHOD");

    static private final SubLString $str_alt166$_SET_LOCAL_ENVIRONMENT__S____S_is = makeString("(SET-LOCAL-ENVIRONMENT ~S): ~S is not an instance of CYBLACK-ENVIRONMENT.");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_DAEMON_SET_LOCAL_ENVIRONMENT_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON-SET-LOCAL-ENVIRONMENT-METHOD");

    private static final SubLSymbol BIND_POSTING = makeSymbol("BIND-POSTING");

    static private final SubLList $list_alt169 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("NEW-POSTING")), makeString("(BIND-POSTING ~S): ~S is not an instance of posting."), makeSymbol("SELF"), makeSymbol("NEW-POSTING")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("LOCAL-ENVIRONMENT"), makeSymbol("GOAL-POSTING"), list(makeSymbol("CYBLACK-GOAL-POSTING-P"), makeSymbol("GOAL-POSTING"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("LOCAL-ENVIRONMENT"), list(QUOTE, makeSymbol("?THE-POSTING")), makeSymbol("NEW-POSTING")), list(RET, makeSymbol("NEW-POSTING"))), list(RET, NIL));

    static private final SubLSymbol $sym170$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GOAL-SATISFACTION-DAEMON-METHOD");

    static private final SubLString $str_alt171$_BIND_POSTING__S____S_is_not_an_i = makeString("(BIND-POSTING ~S): ~S is not an instance of posting.");

    static private final SubLSymbol $sym172$_THE_POSTING = makeSymbol("?THE-POSTING");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_DAEMON_BIND_POSTING_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON-BIND-POSTING-METHOD");

    static private final SubLList $list_alt174 = list(list(makeSymbol("PWHEN"), makeSymbol("DEACTIVATED"), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("POSTING"), makeSymbol("GOAL-POSTING")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(STIMULATE ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("GOAL-PATTERN"), list(makeSymbol("CYBLACK-GOAL-POSTING-GET-GOAL-PATTERN"), makeSymbol("GOAL-POSTING")))), list(makeSymbol("PWHEN"), makeSymbol("GOAL-PATTERN"), list(makeSymbol("CYBLACK-ENVIRONMENT-SET-METHOD"), makeSymbol("LOCAL-ENVIRONMENT"), list(QUOTE, makeSymbol("?SELF")), makeSymbol("GOAL-POSTING")), list(makeSymbol("CYBLACK-ENVIRONMENT-SET-METHOD"), makeSymbol("LOCAL-ENVIRONMENT"), list(QUOTE, makeSymbol("?THE-POSTING")), makeSymbol("POSTING")), list(makeSymbol("PCOND"), list(list(makeSymbol("CYBLACK-SIMPLE-SATISFACTION-EXPRESSION-P"), makeSymbol("GOAL-PATTERN")), list(makeSymbol("CLET"), list(list(makeSymbol("LOGICAL-EXPRESSION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("GOAL-PATTERN"), list(QUOTE, makeSymbol("GET-LOGICAL-EXPRESSION"))))), list(makeSymbol("PWHEN"), makeSymbol("LOGICAL-EXPRESSION"), list(makeSymbol("BIND-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LOGICAL-EXPRESSION"), list(QUOTE, makeSymbol("GET-VALUE")), makeSymbol("LOCAL-ENVIRONMENT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("GOAL-POSTING"), list(QUOTE, makeSymbol("ADD-MATCH")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLONE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("LOCAL-ENVIRONMENT"))), list(makeSymbol("PERFORM-ACTION"), makeSymbol("SELF")))))), list(list(makeSymbol("CYBLACK-SATISFACTION-EXPRESSION-P"), makeSymbol("GOAL-PATTERN")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(STIMULATE ~S): No application is associated with goal satisfaction daemon ~S."), makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("BIND-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-BLACKBOARD")))), list(makeSymbol("AGENDA"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-AGENDA"))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("BLACKBOARD"), makeString("(STIMULATE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("AGENDA"), makeString("(STIMULATE ~S): No agenda is associated with application ~S."), makeSymbol("SELF"), makeSymbol("AGENDA")), list(makeSymbol("UNLESS-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("IGNORE"), makeSymbol("AGENDA"))), list(makeSymbol("CYBLACK-PATTERN-SET-ENVIRONMENT"), makeSymbol("GOAL-PATTERN"), makeSymbol("LOCAL-ENVIRONMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("ACTIVATION-PATTERNS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("BLACKBOARD"), list(QUOTE, makeSymbol("UNIFY-FOR-GOAL-SATISFACTION-DAEMON")), makeSymbol("GOAL-PATTERN")))), list(makeSymbol("PWHEN"), makeSymbol("ACTIVATION-PATTERNS"), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ACTIVATION-PATTERNS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("ACTIVATION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("GOAL-POSTING"), list(QUOTE, makeSymbol("ADD-MATCH")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLONE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("ACTIVATION-PATTERN"))), list(makeSymbol("PERFORM-ACTION"), makeSymbol("SELF")), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("GOAL-POSTING"), list(QUOTE, makeSymbol("ADD-MATCH")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLONE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("ACTIVATION-PATTERN"))), list(makeSymbol("PERFORM-ACTION"), makeSymbol("SELF"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ACTIVATION-PATTERNS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR"))))))), list(T))))), list(RET, NIL));

    static private final SubLSymbol $sym175$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GOAL-SATISFACTION-DAEMON-METHOD");

    static private final SubLString $str_alt176$_STIMULATE__S____S_is_not_an_inst = makeString("(STIMULATE ~S): ~S is not an instance of CYBLACK-POSTING.");

    static private final SubLSymbol $sym177$_SELF = makeSymbol("?SELF");

    private static final SubLSymbol GET_LOGICAL_EXPRESSION = makeSymbol("GET-LOGICAL-EXPRESSION");



    private static final SubLSymbol ADD_MATCH = makeSymbol("ADD-MATCH");





    private static final SubLSymbol UNIFY_FOR_GOAL_SATISFACTION_DAEMON = makeSymbol("UNIFY-FOR-GOAL-SATISFACTION-DAEMON");













    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_DAEMON_STIMULATE_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON-STIMULATE-METHOD");

    static private final SubLList $list_alt191 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_DAEMON_PERFORM_ACTION_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON-PERFORM-ACTION-METHOD");

    private static final SubLSymbol DEACTIVATE_SELF = makeSymbol("DEACTIVATE-SELF");

    static private final SubLList $list_alt194 = list(list(makeSymbol("CSETQ"), makeSymbol("DEACTIVATED"), T), list(makeSymbol("PWHEN"), makeSymbol("LOCAL-ENVIRONMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-OUTER-SCOPE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("LOCAL-ENVIRONMENT"), NIL)), list(makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLSymbol $sym195$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_DAEMON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GOAL-SATISFACTION-DAEMON-METHOD");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_DAEMON_DEACTIVATE_SELF_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON-DEACTIVATE-SELF-METHOD");

    private static final SubLSymbol CYBLACK_DAEMON_VISITOR = makeSymbol("CYBLACK-DAEMON-VISITOR");

    static private final SubLList $list_alt198 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTINUE-P"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("DAEMON"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_BASIC_DAEMON_VISITOR = makeSymbol("CYBLACK-BASIC-DAEMON-VISITOR");

    static private final SubLList $list_alt200 = list(makeSymbol("CYBLACK-DAEMON-VISITOR"));

    static private final SubLList $list_alt201 = list(list(makeSymbol("CONTINUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTINUE-P"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("DAEMON"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DAEMON_VISITOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DAEMON-VISITOR-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_DAEMON_VISITOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-DAEMON-VISITOR-INSTANCE");

    static private final SubLList $list_alt205 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CONTINUE"), T), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym206$OUTER_CATCH_FOR_CYBLACK_BASIC_DAEMON_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DAEMON-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DAEMON_VISITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-DAEMON-VISITOR-INITIALIZE-METHOD");



    static private final SubLList $list_alt209 = list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE"), NIL));

    static private final SubLList $list_alt210 = list(list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("NEW-STATE")));

    static private final SubLSymbol $sym211$OUTER_CATCH_FOR_CYBLACK_BASIC_DAEMON_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DAEMON-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DAEMON_VISITOR_SET_INITIAL_STATE_METHOD = makeSymbol("CYBLACK-BASIC-DAEMON-VISITOR-SET-INITIAL-STATE-METHOD");



    static private final SubLList $list_alt214 = list(makeSymbol("DAEMON"));

    static private final SubLList $list_alt215 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-BLACKBOARD-DAEMON-P"), makeSymbol("DAEMON")), makeString("(VISIT ~S): ~S is not an instance of CYBLACK-BLACKBOARD-DAEMON."), makeSymbol("SELF"), makeSymbol("DAEMON")), list(RET, makeSymbol("DAEMON")));

    static private final SubLString $str_alt216$_VISIT__S____S_is_not_an_instance = makeString("(VISIT ~S): ~S is not an instance of CYBLACK-BLACKBOARD-DAEMON.");

    private static final SubLSymbol CYBLACK_BASIC_DAEMON_VISITOR_VISIT_METHOD = makeSymbol("CYBLACK-BASIC-DAEMON-VISITOR-VISIT-METHOD");



    static private final SubLList $list_alt219 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("DAEMON"), NIL));

    static private final SubLList $list_alt220 = list(list(makeSymbol("IGNORE"), makeSymbol("DAEMON")), list(RET, makeSymbol("CONTINUE")));

    static private final SubLSymbol $sym221$OUTER_CATCH_FOR_CYBLACK_BASIC_DAEMON_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-DAEMON-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_DAEMON_VISITOR_CONTINUE_P_METHOD = makeSymbol("CYBLACK-BASIC-DAEMON-VISITOR-CONTINUE-P-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_DAEMON_VISITOR_GET_FINAL_STATE_METHOD = makeSymbol("CYBLACK-BASIC-DAEMON-VISITOR-GET-FINAL-STATE-METHOD");

    private static final SubLSymbol CYBLACK_POSTING_DAEMON_VISITOR = makeSymbol("CYBLACK-POSTING-DAEMON-VISITOR");

    static private final SubLList $list_alt226 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-DAEMON-VISITOR")));

    static private final SubLList $list_alt227 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-POSTING"), list(makeSymbol("NEW-POSTING")), makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_VISITOR = makeSymbol("CYBLACK-GOAL-SATISFACTION-VISITOR");

    static private final SubLList $list_alt229 = list(makeSymbol("CYBLACK-POSTING-DAEMON-VISITOR"));

    static private final SubLList $list_alt230 = list(list(makeSymbol("ENVIRONMENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("THE-POSTING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-ENVIRONMENT"), NIL), list(makeSymbol("NEW-POSTING"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("DAEMON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));





    static private final SubLSymbol $sym233$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GOAL_SATISFACTION_VISITOR_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GOAL-SATISFACTION-VISITOR-CLASS");

    static private final SubLSymbol $sym234$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GOAL_SATISFACTION_VISITOR_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GOAL-SATISFACTION-VISITOR-INSTANCE");

    static private final SubLList $list_alt235 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ENVIRONMENT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("THE-POSTING"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym236$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GOAL-SATISFACTION-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_VISITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-VISITOR-INITIALIZE-METHOD");

    static private final SubLList $list_alt238 = list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-ENVIRONMENT"), NIL), list(makeSymbol("NEW-POSTING"), NIL));

    static private final SubLList $list_alt239 = list(list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-ENVIRONMENT")), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("NEW-ENVIRONMENT"))), makeString("(SET-INITIAL-STATE ~S): ~S is not an instance of CYBLACK-ENVIRONMENT."), makeSymbol("SELF"), makeSymbol("NEW-ENVIRONMENT")), list(makeSymbol("CSETQ"), makeSymbol("ENVIRONMENT"), makeSymbol("NEW-ENVIRONMENT")), list(makeSymbol("CSETQ"), makeSymbol("THE-POSTING"), makeSymbol("NEW-POSTING")), list(RET, makeSymbol("ENVIRONMENT")));

    static private final SubLSymbol $sym240$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GOAL-SATISFACTION-VISITOR-METHOD");

    static private final SubLString $str_alt241$_SET_INITIAL_STATE__S____S_is_not = makeString("(SET-INITIAL-STATE ~S): ~S is not an instance of CYBLACK-ENVIRONMENT.");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_VISITOR_SET_INITIAL_STATE_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-VISITOR-SET-INITIAL-STATE-METHOD");

    static private final SubLList $list_alt243 = list(list(makeSymbol("PWHEN"), list(makeSymbol("INSTANCE-OF-P"), makeSymbol("DAEMON"), list(QUOTE, makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON"))), list(makeSymbol("PWHEN"), makeSymbol("THE-POSTING"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("STIMULATE"), makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON")), makeSymbol("DAEMON"), makeSymbol("THE-POSTING")))), list(RET, makeSymbol("DAEMON")));

    static private final SubLSymbol $sym244$OUTER_CATCH_FOR_CYBLACK_GOAL_SATISFACTION_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GOAL-SATISFACTION-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_VISITOR_VISIT_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-VISITOR-VISIT-METHOD");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_VISITOR_GET_FINAL_STATE_METHOD = makeSymbol("CYBLACK-GOAL-SATISFACTION-VISITOR-GET-FINAL-STATE-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_blackboard_daemon_file();
    }

    public void initializeVariables() {
        init_cyblack_blackboard_daemon_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_blackboard_daemon_file();
    }
}

