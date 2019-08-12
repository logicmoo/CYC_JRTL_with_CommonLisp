/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
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
 *  module:      CYBLACK-KS
 *  source file: /cyc/top/cycl/cyblack/cyblack-ks.lisp
 *  created:     2019/07/03 17:38:46
 */
public final class cyblack_ks extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_ks() {
    }

    public static final SubLFile me = new cyblack_ks();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_ks";

    // // Definitions
    public static final SubLObject cyblack_knowledge_source_p(SubLObject cyblack_knowledge_source) {
        return interfaces.subloop_instanceof_interface(cyblack_knowledge_source, CYBLACK_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject get_cyblack_proto_knowledge_source_knowledge_source_battery(SubLObject cyblack_proto_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_proto_knowledge_source, SEVEN_INTEGER, KNOWLEDGE_SOURCE_BATTERY);
    }

    public static final SubLObject set_cyblack_proto_knowledge_source_knowledge_source_battery(SubLObject cyblack_proto_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_proto_knowledge_source, value, SEVEN_INTEGER, KNOWLEDGE_SOURCE_BATTERY);
    }

    public static final SubLObject get_cyblack_proto_knowledge_source_author_names(SubLObject cyblack_proto_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_proto_knowledge_source, SIX_INTEGER, AUTHOR_NAMES);
    }

    public static final SubLObject set_cyblack_proto_knowledge_source_author_names(SubLObject cyblack_proto_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_proto_knowledge_source, value, SIX_INTEGER, AUTHOR_NAMES);
    }

    public static final SubLObject get_cyblack_proto_knowledge_source_qua_list_element_parent_links(SubLObject cyblack_proto_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_proto_knowledge_source, FIVE_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject set_cyblack_proto_knowledge_source_qua_list_element_parent_links(SubLObject cyblack_proto_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_proto_knowledge_source, value, FIVE_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject get_cyblack_proto_knowledge_source_remove_knowledge_sources_at_will(SubLObject cyblack_proto_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(REMOVE_KNOWLEDGE_SOURCES_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        return classes.ldb_test($int$4104, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source));
    }

    public static final SubLObject set_cyblack_proto_knowledge_source_remove_knowledge_sources_at_will(SubLObject cyblack_proto_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(REMOVE_KNOWLEDGE_SOURCES_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_proto_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4104, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source)));
        return value;
    }

    public static final SubLObject get_cyblack_proto_knowledge_source_add_knowledge_sources_at_will(SubLObject cyblack_proto_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(ADD_KNOWLEDGE_SOURCES_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        return classes.ldb_test($int$4103, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source));
    }

    public static final SubLObject set_cyblack_proto_knowledge_source_add_knowledge_sources_at_will(SubLObject cyblack_proto_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(ADD_KNOWLEDGE_SOURCES_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_proto_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4103, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source)));
        return value;
    }

    public static final SubLObject get_cyblack_proto_knowledge_source_add_posting_classes_at_will(SubLObject cyblack_proto_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(ADD_POSTING_CLASSES_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        return classes.ldb_test($int$4102, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source));
    }

    public static final SubLObject set_cyblack_proto_knowledge_source_add_posting_classes_at_will(SubLObject cyblack_proto_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(ADD_POSTING_CLASSES_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_proto_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4102, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source)));
        return value;
    }

    public static final SubLObject get_cyblack_proto_knowledge_source_remove_panels_at_will(SubLObject cyblack_proto_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(REMOVE_PANELS_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        return classes.ldb_test($int$4101, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source));
    }

    public static final SubLObject set_cyblack_proto_knowledge_source_remove_panels_at_will(SubLObject cyblack_proto_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(REMOVE_PANELS_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_proto_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4101, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source)));
        return value;
    }

    public static final SubLObject get_cyblack_proto_knowledge_source_add_panels_at_will(SubLObject cyblack_proto_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(ADD_PANELS_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        return classes.ldb_test($int$4100, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source));
    }

    public static final SubLObject set_cyblack_proto_knowledge_source_add_panels_at_will(SubLObject cyblack_proto_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(ADD_PANELS_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_proto_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4100, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source)));
        return value;
    }

    public static final SubLObject get_cyblack_proto_knowledge_source_post_at_will(SubLObject cyblack_proto_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(POST_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        return classes.ldb_test($int$4099, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source));
    }

    public static final SubLObject set_cyblack_proto_knowledge_source_post_at_will(SubLObject cyblack_proto_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(POST_AT_WILL, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_proto_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4099, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source)));
        return value;
    }

    public static final SubLObject get_cyblack_proto_knowledge_source_is_a_monitor(SubLObject cyblack_proto_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(IS_A_MONITOR, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        return classes.ldb_test($int$4098, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source));
    }

    public static final SubLObject set_cyblack_proto_knowledge_source_is_a_monitor(SubLObject cyblack_proto_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(IS_A_MONITOR, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_proto_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4098, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source)));
        return value;
    }

    public static final SubLObject get_cyblack_proto_knowledge_source_qua_list_element_self_deletion_mode(SubLObject cyblack_proto_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source));
    }

    public static final SubLObject set_cyblack_proto_knowledge_source_qua_list_element_self_deletion_mode(SubLObject cyblack_proto_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_proto_knowledge_source);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_proto_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_proto_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_proto_knowledge_source)));
        return value;
    }

    public static final SubLObject cyblack_proto_knowledge_source_on_delete_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_proto_knowledge_source_on_add_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_proto_knowledge_source_get_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_proto_knowledge_source_get_parent_links_method(self);
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

    public static final SubLObject cyblack_proto_knowledge_source_member_p_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_proto_knowledge_source_get_parent_links_method(self);
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

    public static final SubLObject cyblack_proto_knowledge_source_delete_self_from_all_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_proto_knowledge_source_get_parent_links_method(self);
            try {
                cyblack_proto_knowledge_source_set_self_deletion_mode_method(self, T);
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
                        cyblack_proto_knowledge_source_set_self_deletion_mode_method(self, NIL);
                        cyblack_proto_knowledge_source_set_parent_links_method(self, NIL);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_delete_self_from_collection_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_proto_knowledge_source_get_parent_links_method(self);
            SubLObject template_parent_link = NIL;
            SubLObject template_target_link = NIL;
            if (NIL != template_parent_links) {
                if (subloop_collections.dlc_owner(template_parent_links.first()) == collection) {
                    template_target_link = template_parent_links.first();
                    cyblack_proto_knowledge_source_set_parent_links_method(self, template_parent_links.rest());
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
                        cyblack_proto_knowledge_source_set_self_deletion_mode_method(self, T);
                        subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_target_link), template_target_link);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                subloop_collections._csetf_dlc_owner(template_target_link, NIL);
                                methods.funcall_instance_method_with_1_args(self, ON_DELETE, collection);
                                cyblack_proto_knowledge_source_set_self_deletion_mode_method(self, NIL);
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

    public static final SubLObject cyblack_proto_knowledge_source_delete_parent_link_method(SubLObject self, SubLObject old_parent_link) {
        {
            SubLObject template_parent_links = cyblack_proto_knowledge_source_get_parent_links_method(self);
            if (NIL != template_parent_links) {
                if (old_parent_link == template_parent_links) {
                    cyblack_proto_knowledge_source_set_parent_links_method(self, template_parent_links.rest());
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

    public static final SubLObject cyblack_proto_knowledge_source_add_parent_link_method(SubLObject self, SubLObject new_parent_link) {
        cyblack_proto_knowledge_source_set_parent_links_method(self, cons(new_parent_link, cyblack_proto_knowledge_source_get_parent_links_method(self)));
        methods.funcall_instance_method_with_1_args(self, ON_ADD, subloop_collections.dlc_owner(new_parent_link));
        return new_parent_link;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_proto_knowledge_source_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_proto_knowledge_source_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_proto_knowledge_source_p(SubLObject cyblack_proto_knowledge_source) {
        return classes.subloop_instanceof_class(cyblack_proto_knowledge_source, CYBLACK_PROTO_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject cyblack_proto_knowledge_source_get_parent_links_method(SubLObject self) {
        {
            SubLObject qua_list_element_parent_links = get_cyblack_proto_knowledge_source_qua_list_element_parent_links(self);
            return qua_list_element_parent_links;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_set_parent_links_method(SubLObject self, SubLObject new_parent_links) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_proto_knowledge_source_qua_list_element_parent_links(self);
            try {
                try {
                    qua_list_element_parent_links = new_parent_links;
                    sublisp_throw($sym74$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, new_parent_links);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_qua_list_element_parent_links(self, qua_list_element_parent_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_get_self_deletion_mode_method(SubLObject self) {
        {
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_proto_knowledge_source_qua_list_element_self_deletion_mode(self);
            return qua_list_element_self_deletion_mode;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_set_self_deletion_mode_method(SubLObject self, SubLObject mode) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_proto_knowledge_source_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    qua_list_element_self_deletion_mode = mode;
                    sublisp_throw($sym82$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_get_author_names_method(SubLObject self) {
        {
            SubLObject author_names = get_cyblack_proto_knowledge_source_author_names(self);
            return author_names;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_set_author_names_method(SubLObject self, SubLObject new_author_names) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject author_names = get_cyblack_proto_knowledge_source_author_names(self);
            try {
                try {
                    author_names = copy_list(new_author_names);
                    sublisp_throw($sym91$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, new_author_names);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_author_names(self, author_names);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_monitor_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject is_a_monitor = get_cyblack_proto_knowledge_source_is_a_monitor(self);
            try {
                try {
                    sublisp_throw($sym95$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, is_a_monitor);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_is_a_monitor(self, is_a_monitor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym95$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_post_at_will_p_method(SubLObject self) {
        return get_cyblack_proto_knowledge_source_post_at_will(self);
    }

    public static final SubLObject cyblack_proto_knowledge_source_set_post_at_will_method(SubLObject self, SubLObject new_state) {
        return set_cyblack_proto_knowledge_source_post_at_will(self, NIL != new_state ? ((SubLObject) (T)) : NIL);
    }

    public static final SubLObject cyblack_proto_knowledge_source_add_panels_at_will_p_method(SubLObject self) {
        {
            SubLObject add_panels_at_will = get_cyblack_proto_knowledge_source_add_panels_at_will(self);
            return add_panels_at_will;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_set_add_panels_at_will_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject add_panels_at_will = get_cyblack_proto_knowledge_source_add_panels_at_will(self);
            try {
                try {
                    add_panels_at_will = new_state;
                    sublisp_throw($sym110$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, new_state);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_add_panels_at_will(self, add_panels_at_will);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym110$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_remove_panels_at_will_p_method(SubLObject self) {
        {
            SubLObject remove_panels_at_will = get_cyblack_proto_knowledge_source_remove_panels_at_will(self);
            return remove_panels_at_will;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_get_knowledge_source_battery_method(SubLObject self) {
        {
            SubLObject knowledge_source_battery = get_cyblack_proto_knowledge_source_knowledge_source_battery(self);
            return knowledge_source_battery;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_set_knowledge_source_battery_method(SubLObject self, SubLObject new_knowledge_source_battery) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject knowledge_source_battery = get_cyblack_proto_knowledge_source_knowledge_source_battery(self);
            try {
                try {
                    knowledge_source_battery = new_knowledge_source_battery;
                    sublisp_throw($sym121$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, new_knowledge_source_battery);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_knowledge_source_battery(self, knowledge_source_battery);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym121$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_set_remove_panels_at_will_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject remove_panels_at_will = get_cyblack_proto_knowledge_source_remove_panels_at_will(self);
            try {
                try {
                    remove_panels_at_will = new_state;
                    sublisp_throw($sym125$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, new_state);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_remove_panels_at_will(self, remove_panels_at_will);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym125$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_add_posting_classes_at_will_p_method(SubLObject self) {
        {
            SubLObject add_posting_classes_at_will = get_cyblack_proto_knowledge_source_add_posting_classes_at_will(self);
            return add_posting_classes_at_will;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_set_add_posting_classes_at_will_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject add_posting_classes_at_will = get_cyblack_proto_knowledge_source_add_posting_classes_at_will(self);
            try {
                try {
                    add_posting_classes_at_will = new_state;
                    sublisp_throw($sym132$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, new_state);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_add_posting_classes_at_will(self, add_posting_classes_at_will);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym132$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_add_knowledge_sources_at_will_p_method(SubLObject self) {
        {
            SubLObject add_knowledge_sources_at_will = get_cyblack_proto_knowledge_source_add_knowledge_sources_at_will(self);
            return add_knowledge_sources_at_will;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_set_add_knowledge_sources_at_will_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject add_knowledge_sources_at_will = get_cyblack_proto_knowledge_source_add_knowledge_sources_at_will(self);
            try {
                try {
                    add_knowledge_sources_at_will = new_state;
                    sublisp_throw($sym139$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, new_state);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_add_knowledge_sources_at_will(self, add_knowledge_sources_at_will);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym139$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_remove_knowledge_sources_at_will_p_method(SubLObject self) {
        {
            SubLObject remove_knowledge_sources_at_will = get_cyblack_proto_knowledge_source_remove_knowledge_sources_at_will(self);
            return remove_knowledge_sources_at_will;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_set_remove_knowledge_sources_at_will_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject remove_knowledge_sources_at_will = get_cyblack_proto_knowledge_source_remove_knowledge_sources_at_will(self);
            try {
                try {
                    remove_knowledge_sources_at_will = new_state;
                    sublisp_throw($sym146$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, new_state);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_remove_knowledge_sources_at_will(self, remove_knowledge_sources_at_will);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym146$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_on_activate_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        return T;
    }

    public static final SubLObject cyblack_proto_knowledge_source_create_proposal_method(SubLObject self, SubLObject activation_pattern, SubLObject arg_if_on_startup) {
        if (arg_if_on_startup == UNPROVIDED) {
            arg_if_on_startup = NIL;
        }
        cyblack_utilities.cyblack_silence(activation_pattern);
        cyblack_utilities.cyblack_silence(self);
        return NIL;
    }

    public static final SubLObject cyblack_proto_knowledge_source_post_proposal_method(SubLObject self, SubLObject proposal, SubLObject v_agenda) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject post_at_will = get_cyblack_proto_knowledge_source_post_at_will(self);
            try {
                try {
                    if (NIL != post_at_will) {
                        {
                            SubLObject ksi = methods.funcall_instance_method_with_1_args(self, GENERATE_KSI, proposal);
                            if (NIL != ksi) {
                                methods.funcall_instance_method_with_0_args(ksi, EXECUTE);
                            }
                        }
                    } else {
                        methods.funcall_instance_method_with_1_args(v_agenda, PROPOSE, proposal);
                    }
                    sublisp_throw($sym159$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_post_at_will(self, post_at_will);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym159$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_generate_ksi_method(SubLObject self, SubLObject proposal) {
        return NIL;
    }

    public static final SubLObject cyblack_proto_knowledge_source_on_startup_method(SubLObject self) {
        cyblack_object.cyblack_object_on_startup_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_proto_knowledge_source_on_shutdown_method(SubLObject self) {
        cyblack_object.cyblack_object_on_shutdown_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_proto_knowledge_source_link_ksi_method(SubLObject self, SubLObject knowledge_source_instantiation) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    methods.funcall_instance_method_with_1_args(knowledge_source_instantiation, SET_APPLICATION, application);
                    methods.funcall_instance_method_with_1_args(knowledge_source_instantiation, SET_KNOWLEDGE_SOURCE, self);
                    sublisp_throw($sym176$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, knowledge_source_instantiation);
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
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym176$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
            SubLObject knowledge_source_battery = get_cyblack_proto_knowledge_source_knowledge_source_battery(self);
            SubLObject author_names = get_cyblack_proto_knowledge_source_author_names(self);
            SubLObject qua_list_element_parent_links = get_cyblack_proto_knowledge_source_qua_list_element_parent_links(self);
            SubLObject is_a_monitor = get_cyblack_proto_knowledge_source_is_a_monitor(self);
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_proto_knowledge_source_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
                    author_names = NIL;
                    qua_list_element_self_deletion_mode = NIL;
                    qua_list_element_parent_links = NIL;
                    knowledge_source_battery = NIL;
                    is_a_monitor = NIL;
                    sublisp_throw($sym182$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_knowledge_source_battery(self, knowledge_source_battery);
                            set_cyblack_proto_knowledge_source_author_names(self, author_names);
                            set_cyblack_proto_knowledge_source_qua_list_element_parent_links(self, qua_list_element_parent_links);
                            set_cyblack_proto_knowledge_source_is_a_monitor(self, is_a_monitor);
                            set_cyblack_proto_knowledge_source_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym182$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_proto_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_proto_knowledge_source_post_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_proto_knowledge_source_method = NIL;
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                SubLObject post_at_will = get_cyblack_proto_knowledge_source_post_at_will(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == post_at_will) {
                                Errors.error($str_alt188$_POST__S___This_knowledge_source_, self);
                            }
                        }
                        {
                            SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                            sublisp_throw($sym187$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD, cyblack_blackboard.cyblack_blackboard_post(blackboard, posting));
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                cyblack_object.set_cyblack_object_application(self, application);
                                set_cyblack_proto_knowledge_source_post_at_will(self, post_at_will);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_proto_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym187$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD);
                }
                return catch_var_for_cyblack_proto_knowledge_source_method;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_self_motivated_knowledge_source_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_self_motivated_knowledge_source_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_self_motivated_knowledge_source_p(SubLObject cyblack_self_motivated_knowledge_source) {
        return classes.subloop_instanceof_class(cyblack_self_motivated_knowledge_source, CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject cyblack_self_motivated_knowledge_source_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_self_motivated_knowledge_source_method = NIL;
            SubLObject post_at_will = get_cyblack_proto_knowledge_source_post_at_will(self);
            try {
                try {
                    cyblack_proto_knowledge_source_initialize_method(self);
                    post_at_will = T;
                    sublisp_throw($sym195$OUTER_CATCH_FOR_CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_proto_knowledge_source_post_at_will(self, post_at_will);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_self_motivated_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym195$OUTER_CATCH_FOR_CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_self_motivated_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_pattern_based_knowledge_source_p(SubLObject cyblack_pattern_based_knowledge_source) {
        return interfaces.subloop_instanceof_interface(cyblack_pattern_based_knowledge_source, CYBLACK_PATTERN_BASED_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject cyblack_panel_linked_pattern_based_knowledge_source_p(SubLObject cyblack_panel_linked_pattern_based_knowledge_source) {
        return interfaces.subloop_instanceof_interface(cyblack_panel_linked_pattern_based_knowledge_source, CYBLACK_PANEL_LINKED_PATTERN_BASED_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject cyblack_removal_knowledge_source_p(SubLObject cyblack_removal_knowledge_source) {
        return interfaces.subloop_instanceof_interface(cyblack_removal_knowledge_source, CYBLACK_REMOVAL_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_range_set(SubLObject cyblack_basic_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source, ELEVEN_INTEGER, RANGE_SET);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_range_set(SubLObject cyblack_basic_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source, value, ELEVEN_INTEGER, RANGE_SET);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_cached_domain(SubLObject cyblack_basic_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source, TEN_INTEGER, CACHED_DOMAIN);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_cached_domain(SubLObject cyblack_basic_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source, value, TEN_INTEGER, CACHED_DOMAIN);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_unification_robot_class(SubLObject cyblack_basic_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source, NINE_INTEGER, UNIFICATION_ROBOT_CLASS);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_unification_robot_class(SubLObject cyblack_basic_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source, value, NINE_INTEGER, UNIFICATION_ROBOT_CLASS);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_uncompiled_precondition_pattern(SubLObject cyblack_basic_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_knowledge_source, EIGHT_INTEGER, UNCOMPILED_PRECONDITION_PATTERN);
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_uncompiled_precondition_pattern(SubLObject cyblack_basic_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_knowledge_source, value, EIGHT_INTEGER, UNCOMPILED_PRECONDITION_PATTERN);
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_has_cached_domain_p(SubLObject cyblack_basic_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_knowledge_source);
            SubLObject slot = slots.slot_assoc(HAS_CACHED_DOMAIN_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_knowledge_source, slot);
        }
        return classes.ldb_test($int$4106, subloop_structures.instance_boolean_slots(cyblack_basic_knowledge_source));
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_has_cached_domain_p(SubLObject cyblack_basic_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_knowledge_source);
            SubLObject slot = slots.slot_assoc(HAS_CACHED_DOMAIN_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_basic_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4106, subloop_structures.instance_boolean_slots(cyblack_basic_knowledge_source)));
        return value;
    }

    public static final SubLObject get_cyblack_basic_knowledge_source_linked_to_panels(SubLObject cyblack_basic_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_knowledge_source);
            SubLObject slot = slots.slot_assoc(LINKED_TO_PANELS, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_knowledge_source, slot);
        }
        return classes.ldb_test($int$4105, subloop_structures.instance_boolean_slots(cyblack_basic_knowledge_source));
    }

    public static final SubLObject set_cyblack_basic_knowledge_source_linked_to_panels(SubLObject cyblack_basic_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_knowledge_source);
            SubLObject slot = slots.slot_assoc(LINKED_TO_PANELS, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_basic_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4105, subloop_structures.instance_boolean_slots(cyblack_basic_knowledge_source)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_knowledge_source_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_knowledge_source_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_p(SubLObject cyblack_basic_knowledge_source) {
        return classes.subloop_instanceof_class(cyblack_basic_knowledge_source, CYBLACK_BASIC_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject cyblack_basic_knowledge_source_get_precondition_pattern_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_set_precondition_pattern_method(SubLObject self, SubLObject new_precondition_pattern) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_get_precondition_datatypes_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_stimulate_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_method = NIL;
            SubLObject unification_robot_class = get_cyblack_basic_knowledge_source_unification_robot_class(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject blackboard = methods.funcall_instance_method_with_0_args(application, GET_BLACKBOARD);
                        SubLObject v_agenda = methods.funcall_instance_method_with_0_args(application, GET_AGENDA);
                        SubLObject precondition_pattern = methods.funcall_instance_method_with_0_args(self, GET_PRECONDITION_PATTERN);
                        if (NIL != precondition_pattern) {
                            cyblack_precondition_pattern.cyblack_pattern_set_environment(precondition_pattern, environment);
                            {
                                SubLObject activation_patterns = methods.funcall_instance_method_with_2_args(blackboard, UNIFY, precondition_pattern, unification_robot_class);
                                SubLObject proposal = NIL;
                                if (NIL != activation_patterns) {
                                    if (NIL != cyblack_monitoring_ks_p(self)) {
                                        methods.funcall_instance_method_with_1_args(self, PERFORM_ACTION, activation_patterns);
                                    } else {
                                        {
                                            SubLObject enumerator = methods.funcall_instance_method_with_0_args(activation_patterns, ALLOCATE_ENUMERATOR);
                                            if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                                                {
                                                    SubLObject activation_pattern = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                                    if (NIL != methods.funcall_instance_method_with_1_args(self, ON_ACTIVATE, activation_pattern)) {
                                                        proposal = methods.funcall_instance_method_with_1_args(self, CREATE_PROPOSAL, activation_pattern);
                                                        if (NIL != proposal) {
                                                            methods.funcall_instance_method_with_2_args(self, POST_PROPOSAL, proposal, v_agenda);
                                                        }
                                                    }
                                                    while (NIL == methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                                                        activation_pattern = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                                        if (NIL != methods.funcall_instance_method_with_1_args(self, ON_ACTIVATE, activation_pattern)) {
                                                            proposal = methods.funcall_instance_method_with_1_args(self, CREATE_PROPOSAL, activation_pattern);
                                                            if (NIL != proposal) {
                                                                methods.funcall_instance_method_with_2_args(self, POST_PROPOSAL, proposal, v_agenda);
                                                            }
                                                        }
                                                    } 
                                                }
                                            }
                                            methods.funcall_instance_method_with_1_args(activation_patterns, DEALLOCATE_ENUMERATOR, enumerator);
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym232$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_unification_robot_class(self, unification_robot_class);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym232$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_link_to_panels_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_method = NIL;
            SubLObject linked_to_panels = get_cyblack_basic_knowledge_source_linked_to_panels(self);
            try {
                try {
                    linked_to_panels = T;
                    sublisp_throw($sym246$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, T);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_linked_to_panels(self, linked_to_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym246$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_unlink_from_panels_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            SubLObject linked_to_panels = get_cyblack_basic_knowledge_source_linked_to_panels(self);
            try {
                try {
                    if (NIL == linked_to_panels) {
                        sublisp_throw($sym250$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, NIL);
                    }
                    {
                        SubLObject datatype_bag = methods.funcall_instance_method_with_0_args(self, GET_PRECONDITION_DATATYPES);
                        if (NIL != datatype_bag) {
                            {
                                SubLObject blackboard = (NIL != application) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(application, GET_BLACKBOARD))) : NIL;
                                if (NIL != blackboard) {
                                    {
                                        SubLObject unique_elements = subloop_collections.basic_bag_get_unique_elements_method(datatype_bag);
                                        SubLObject panel = NIL;
                                        SubLObject cdolist_list_var = unique_elements;
                                        SubLObject datatype = NIL;
                                        for (datatype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datatype = cdolist_list_var.first()) {
                                            panel = cyblack_datatype.cyblack_datatype_get_panel(datatype, blackboard, UNPROVIDED);
                                            if (NIL != panel) {
                                                methods.funcall_instance_method_with_1_args(panel, REMOVE_DIRECT_KNOWLEDGE_SOURCE, self);
                                            }
                                        }
                                        linked_to_panels = NIL;
                                        sublisp_throw($sym250$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, T);
                                    }
                                } else {
                                    Errors.warn($str_alt252$_UNLINK_FROM_PANELS__S___Unable_t, self, self);
                                }
                            }
                        } else {
                            Errors.warn($str_alt253$_UNLINK_FROM_PANELS__S___Unable_t, self, self);
                        }
                        sublisp_throw($sym250$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_object.set_cyblack_object_application(self, application);
                            set_cyblack_basic_knowledge_source_linked_to_panels(self, linked_to_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym250$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_linked_to_panels_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_method = NIL;
            SubLObject linked_to_panels = get_cyblack_basic_knowledge_source_linked_to_panels(self);
            try {
                try {
                    sublisp_throw($sym257$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, linked_to_panels);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_linked_to_panels(self, linked_to_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym257$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_get_unification_robot_class_method(SubLObject self) {
        {
            SubLObject unification_robot_class = get_cyblack_basic_knowledge_source_unification_robot_class(self);
            return unification_robot_class;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_set_unification_robot_class_method(SubLObject self, SubLObject new_unification_robot_class) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_method = NIL;
            SubLObject unification_robot_class = get_cyblack_basic_knowledge_source_unification_robot_class(self);
            try {
                try {
                    unification_robot_class = new_unification_robot_class;
                    sublisp_throw($sym265$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, new_unification_robot_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_unification_robot_class(self, unification_robot_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym265$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_method = NIL;
            SubLObject range_set = get_cyblack_basic_knowledge_source_range_set(self);
            SubLObject unification_robot_class = get_cyblack_basic_knowledge_source_unification_robot_class(self);
            SubLObject has_cached_domain_p = get_cyblack_basic_knowledge_source_has_cached_domain_p(self);
            SubLObject linked_to_panels = get_cyblack_basic_knowledge_source_linked_to_panels(self);
            try {
                try {
                    cyblack_proto_knowledge_source_initialize_method(self);
                    linked_to_panels = NIL;
                    unification_robot_class = CYBLACK_UNIFICATION_ROBOT;
                    has_cached_domain_p = NIL;
                    range_set = NIL;
                    sublisp_throw($sym268$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_range_set(self, range_set);
                            set_cyblack_basic_knowledge_source_unification_robot_class(self, unification_robot_class);
                            set_cyblack_basic_knowledge_source_has_cached_domain_p(self, has_cached_domain_p);
                            set_cyblack_basic_knowledge_source_linked_to_panels(self, linked_to_panels);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym268$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_get_application_method(SubLObject self) {
        {
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            return application;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_set_application_method(SubLObject self, SubLObject new_application) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    application = new_application;
                    sublisp_throw($sym276$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, new_application);
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
                catch_var_for_cyblack_basic_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym276$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_on_startup_method(SubLObject self) {
        cyblack_proto_knowledge_source_on_startup_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_on_shutdown_method(SubLObject self) {
        cyblack_proto_knowledge_source_on_shutdown_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_get_panels_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL == application) {
                        sublisp_throw($sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, NIL);
                    }
                    {
                        SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                        if (NIL == blackboard) {
                            sublisp_throw($sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, NIL);
                        }
                        {
                            SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                            if (NIL == datatype_dictionary) {
                                sublisp_throw($sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, NIL);
                            }
                            {
                                SubLObject datatype_bag = cyblack_basic_knowledge_source_get_precondition_datatypes_method(self);
                                if (NIL != datatype_bag) {
                                    {
                                        SubLObject unique_datatypes = subloop_collections.basic_bag_get_unique_elements_method(datatype_bag);
                                        if (NIL != unique_datatypes) {
                                            {
                                                SubLObject panels = NIL;
                                                SubLObject panel = NIL;
                                                SubLObject cdolist_list_var = unique_datatypes;
                                                SubLObject datatype = NIL;
                                                for (datatype = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datatype = cdolist_list_var.first()) {
                                                    panel = cyblack_datatype.cyblack_datatype_get_panel(datatype, blackboard, UNPROVIDED);
                                                    if (NIL != panel) {
                                                        panels = cons(panel, panels);
                                                    }
                                                }
                                                sublisp_throw($sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, panels);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    sublisp_throw($sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, NIL);
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
                catch_var_for_cyblack_basic_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_get_domain_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_knowledge_source_method = NIL;
            SubLObject cached_domain = get_cyblack_basic_knowledge_source_cached_domain(self);
            SubLObject has_cached_domain_p = get_cyblack_basic_knowledge_source_has_cached_domain_p(self);
            try {
                try {
                    if (NIL != has_cached_domain_p) {
                        sublisp_throw($sym286$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, cached_domain);
                    }
                    {
                        SubLObject datatype_bag = methods.funcall_instance_method_with_0_args(self, GET_PRECONDITION_DATATYPES);
                        if (NIL != datatype_bag) {
                            cached_domain = methods.funcall_instance_method_with_0_args(datatype_bag, GET_UNIQUE_ELEMENTS);
                            has_cached_domain_p = T;
                            sublisp_throw($sym286$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, cached_domain);
                        }
                        sublisp_throw($sym286$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_cached_domain(self, cached_domain);
                            set_cyblack_basic_knowledge_source_has_cached_domain_p(self, has_cached_domain_p);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym286$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_basic_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_get_range_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject get_cyblack_internal_knowledge_source_precondition_datatypes(SubLObject cyblack_internal_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_knowledge_source, THIRTEEN_INTEGER, PRECONDITION_DATATYPES);
    }

    public static final SubLObject set_cyblack_internal_knowledge_source_precondition_datatypes(SubLObject cyblack_internal_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_knowledge_source, value, THIRTEEN_INTEGER, PRECONDITION_DATATYPES);
    }

    public static final SubLObject get_cyblack_internal_knowledge_source_precondition_pattern(SubLObject cyblack_internal_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_knowledge_source, TWELVE_INTEGER, PRECONDITION_PATTERN);
    }

    public static final SubLObject set_cyblack_internal_knowledge_source_precondition_pattern(SubLObject cyblack_internal_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_knowledge_source, value, TWELVE_INTEGER, PRECONDITION_PATTERN);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_knowledge_source_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_knowledge_source_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_internal_knowledge_source_p(SubLObject cyblack_internal_knowledge_source) {
        return classes.subloop_instanceof_class(cyblack_internal_knowledge_source, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject cyblack_internal_knowledge_source_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_knowledge_source_method = NIL;
            SubLObject precondition_datatypes = get_cyblack_internal_knowledge_source_precondition_datatypes(self);
            SubLObject precondition_pattern = get_cyblack_internal_knowledge_source_precondition_pattern(self);
            SubLObject knowledge_source_battery = get_cyblack_proto_knowledge_source_knowledge_source_battery(self);
            try {
                try {
                    cyblack_basic_knowledge_source_initialize_method(self);
                    precondition_pattern = NIL;
                    precondition_datatypes = NIL;
                    knowledge_source_battery = NIL;
                    sublisp_throw($sym298$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_knowledge_source_precondition_datatypes(self, precondition_datatypes);
                            set_cyblack_internal_knowledge_source_precondition_pattern(self, precondition_pattern);
                            set_cyblack_proto_knowledge_source_knowledge_source_battery(self, knowledge_source_battery);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym298$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_internal_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_internal_knowledge_source_link_to_panels_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_knowledge_source_method = NIL;
            SubLObject precondition_pattern = get_cyblack_internal_knowledge_source_precondition_pattern(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    cyblack_basic_knowledge_source_link_to_panels_method(self);
                    {
                        SubLObject datatype_bag = methods.funcall_instance_method_with_0_args(precondition_pattern, GET_DATATYPE_BAG);
                        SubLObject blackboard = methods.funcall_instance_method_with_0_args(application, GET_BLACKBOARD);
                        if (NIL != datatype_bag) {
                            {
                                SubLObject enumerator = methods.funcall_instance_method_with_0_args(datatype_bag, ALLOCATE_ENUMERATOR);
                                SubLObject datatype = NIL;
                                SubLObject panel = NIL;
                                if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                                    datatype = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                    panel = methods.funcall_instance_method_with_1_args(datatype, GET_PANEL, blackboard);
                                    methods.funcall_instance_method_with_1_args(panel, ADD_DIRECT_KNOWLEDGE_SOURCE, self);
                                    while (NIL == methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                                        datatype = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                        panel = methods.funcall_instance_method_with_1_args(datatype, GET_PANEL, blackboard);
                                        methods.funcall_instance_method_with_1_args(panel, ADD_DIRECT_KNOWLEDGE_SOURCE, self);
                                    } 
                                }
                                methods.funcall_instance_method_with_1_args(datatype_bag, DEALLOCATE_ENUMERATOR, enumerator);
                            }
                        }
                    }
                    sublisp_throw($sym301$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_knowledge_source_precondition_pattern(self, precondition_pattern);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym301$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_internal_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_internal_knowledge_source_on_startup_method(SubLObject self) {
        {
            SubLObject precondition_pattern = get_cyblack_internal_knowledge_source_precondition_pattern(self);
            SubLObject uncompiled_precondition_pattern = get_cyblack_basic_knowledge_source_uncompiled_precondition_pattern(self);
            cyblack_basic_knowledge_source_on_startup_method(self);
            if (NIL != uncompiled_precondition_pattern) {
                cyblack_internal_knowledge_source_set_precondition_pattern_method(self, uncompiled_precondition_pattern);
            } else
                if (NIL != precondition_pattern) {
                    cyblack_internal_knowledge_source_set_precondition_pattern_method(self, precondition_pattern);
                }

            cyblack_internal_knowledge_source_link_to_panels_method(self);
            return NIL;
        }
    }

    public static final SubLObject cyblack_internal_knowledge_source_on_shutdown_method(SubLObject self) {
        cyblack_basic_knowledge_source_on_shutdown_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_internal_knowledge_source_get_precondition_pattern_method(SubLObject self) {
        {
            SubLObject precondition_pattern = get_cyblack_internal_knowledge_source_precondition_pattern(self);
            return precondition_pattern;
        }
    }

    public static final SubLObject cyblack_internal_knowledge_source_set_precondition_pattern_method(SubLObject self, SubLObject new_precondition_pattern) {
        {
            SubLObject catch_var_for_cyblack_internal_knowledge_source_method = NIL;
            SubLObject precondition_datatypes = get_cyblack_internal_knowledge_source_precondition_datatypes(self);
            SubLObject precondition_pattern = get_cyblack_internal_knowledge_source_precondition_pattern(self);
            SubLObject uncompiled_precondition_pattern = get_cyblack_basic_knowledge_source_uncompiled_precondition_pattern(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            SubLObject is_a_monitor = get_cyblack_proto_knowledge_source_is_a_monitor(self);
            try {
                try {
                    if (NIL != cyblack_precondition_pattern.cyblack_precon_pattern_p(new_precondition_pattern)) {
                        precondition_pattern = new_precondition_pattern;
                        precondition_datatypes = methods.funcall_instance_method_with_0_args(precondition_pattern, GET_DATATYPE_BAG);
                        is_a_monitor = NIL;
                        sublisp_throw($sym312$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD, new_precondition_pattern);
                    }
                    if (NIL != cyblack_precondition_pattern.cyblack_monitoring_pattern_p(new_precondition_pattern)) {
                        precondition_pattern = new_precondition_pattern;
                        precondition_datatypes = methods.funcall_instance_method_with_0_args(precondition_pattern, GET_DATATYPE_BAG);
                        is_a_monitor = T;
                        sublisp_throw($sym312$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD, new_precondition_pattern);
                    }
                    if (NIL != application) {
                        {
                            SubLObject v_parser = methods.funcall_instance_method_with_0_args(application, GET_PARSER);
                            if (NIL != v_parser) {
                                precondition_pattern = methods.funcall_instance_method_with_1_args(v_parser, PARSE, new_precondition_pattern);
                                if (NIL != precondition_pattern) {
                                    is_a_monitor = cyblack_precondition_pattern.cyblack_monitoring_pattern_p(precondition_pattern);
                                } else {
                                    Errors.warn($str_alt315$_SET_PRECONDITION_PATTERN__S___Fa, self, new_precondition_pattern);
                                    sublisp_throw($sym312$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD, NIL);
                                }
                                precondition_datatypes = methods.funcall_instance_method_with_0_args(precondition_pattern, GET_DATATYPE_BAG);
                                uncompiled_precondition_pattern = copy_tree(new_precondition_pattern);
                                sublisp_throw($sym312$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD, precondition_pattern);
                            }
                        }
                    }
                    precondition_pattern = NIL;
                    uncompiled_precondition_pattern = copy_tree(new_precondition_pattern);
                    precondition_datatypes = NIL;
                    sublisp_throw($sym312$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_knowledge_source_precondition_datatypes(self, precondition_datatypes);
                            set_cyblack_internal_knowledge_source_precondition_pattern(self, precondition_pattern);
                            set_cyblack_basic_knowledge_source_uncompiled_precondition_pattern(self, uncompiled_precondition_pattern);
                            cyblack_object.set_cyblack_object_application(self, application);
                            set_cyblack_proto_knowledge_source_is_a_monitor(self, is_a_monitor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym312$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_internal_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_internal_knowledge_source_complete_precondition_pattern_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_knowledge_source_method = NIL;
            SubLObject precondition_pattern = get_cyblack_internal_knowledge_source_precondition_pattern(self);
            SubLObject uncompiled_precondition_pattern = get_cyblack_basic_knowledge_source_uncompiled_precondition_pattern(self);
            try {
                try {
                    if ((NIL == precondition_pattern) && (NIL != uncompiled_precondition_pattern)) {
                        precondition_pattern = cyblack_internal_knowledge_source_set_precondition_pattern_method(self, uncompiled_precondition_pattern);
                    }
                    sublisp_throw($sym319$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD, precondition_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_knowledge_source_precondition_pattern(self, precondition_pattern);
                            set_cyblack_basic_knowledge_source_uncompiled_precondition_pattern(self, uncompiled_precondition_pattern);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym319$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_internal_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_internal_knowledge_source_get_precondition_datatypes_method(SubLObject self) {
        {
            SubLObject precondition_datatypes = get_cyblack_internal_knowledge_source_precondition_datatypes(self);
            return precondition_datatypes;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_constrained_knowledge_source_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_constrained_knowledge_source_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_constrained_knowledge_source_p(SubLObject cyblack_constrained_knowledge_source) {
        return classes.subloop_instanceof_class(cyblack_constrained_knowledge_source, CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject cyblack_constrained_knowledge_source_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_constrained_knowledge_source_method = NIL;
            SubLObject unification_robot_class = get_cyblack_basic_knowledge_source_unification_robot_class(self);
            try {
                try {
                    cyblack_internal_knowledge_source_initialize_method(self);
                    unification_robot_class = CYBLACK_CONSTRAINED_UNIFICATION_ROBOT;
                    sublisp_throw($sym327$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_unification_robot_class(self, unification_robot_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_constrained_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym327$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_constrained_knowledge_source_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_single_match_constrained_knowledge_source_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_single_match_constrained_knowledge_source_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_single_match_constrained_knowledge_source_p(SubLObject cyblack_single_match_constrained_knowledge_source) {
        return classes.subloop_instanceof_class(cyblack_single_match_constrained_knowledge_source, CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject cyblack_single_match_constrained_knowledge_source_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_single_match_constrained_knowledge_source_method = NIL;
            SubLObject unification_robot_class = get_cyblack_basic_knowledge_source_unification_robot_class(self);
            try {
                try {
                    cyblack_constrained_knowledge_source_initialize_method(self);
                    unification_robot_class = CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION;
                    sublisp_throw($sym334$OUTER_CATCH_FOR_CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_unification_robot_class(self, unification_robot_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_single_match_constrained_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym334$OUTER_CATCH_FOR_CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE);
            }
            return catch_var_for_cyblack_single_match_constrained_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_monitoring_ks_p(SubLObject cyblack_monitoring_ks) {
        return interfaces.subloop_instanceof_interface(cyblack_monitoring_ks, CYBLACK_MONITORING_KS);
    }

    public static final SubLObject get_cyblack_internal_monitoring_ks_state_change_listener(SubLObject cyblack_internal_monitoring_ks) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_monitoring_ks, SEVENTEEN_INTEGER, STATE_CHANGE_LISTENER);
    }

    public static final SubLObject set_cyblack_internal_monitoring_ks_state_change_listener(SubLObject cyblack_internal_monitoring_ks, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_monitoring_ks, value, SEVENTEEN_INTEGER, STATE_CHANGE_LISTENER);
    }

    public static final SubLObject get_cyblack_internal_monitoring_ks_state_change_listener_class(SubLObject cyblack_internal_monitoring_ks) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_monitoring_ks, SIXTEEN_INTEGER, STATE_CHANGE_LISTENER_CLASS);
    }

    public static final SubLObject set_cyblack_internal_monitoring_ks_state_change_listener_class(SubLObject cyblack_internal_monitoring_ks, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_monitoring_ks, value, SIXTEEN_INTEGER, STATE_CHANGE_LISTENER_CLASS);
    }

    public static final SubLObject get_cyblack_internal_monitoring_ks_action_qualifiers(SubLObject cyblack_internal_monitoring_ks) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_monitoring_ks, FIFTEEN_INTEGER, ACTION_QUALIFIERS);
    }

    public static final SubLObject set_cyblack_internal_monitoring_ks_action_qualifiers(SubLObject cyblack_internal_monitoring_ks, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_monitoring_ks, value, FIFTEEN_INTEGER, ACTION_QUALIFIERS);
    }

    public static final SubLObject get_cyblack_internal_monitoring_ks_action(SubLObject cyblack_internal_monitoring_ks) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_monitoring_ks, FOURTEEN_INTEGER, ACTION);
    }

    public static final SubLObject set_cyblack_internal_monitoring_ks_action(SubLObject cyblack_internal_monitoring_ks, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_monitoring_ks, value, FOURTEEN_INTEGER, ACTION);
    }

    public static final SubLObject cyblack_internal_monitoring_ks_perform_action_method(SubLObject self, SubLObject activation_patterns) {
        if (!((NIL != activation_patterns) && (NIL == subloop_collections.basic_end_pointer_list_empty_p_method(activation_patterns)))) {
            return NIL;
        }
        if (NIL != activation_patterns) {
            {
                SubLObject template_first_activation_pattern = subloop_collections.basic_end_pointer_list_nth_method(activation_patterns, ZERO_INTEGER);
                SubLObject template_the_posting_binding = cyblack_precondition_pattern.cyblack_environment_get_binding_method(template_first_activation_pattern, $sym348$_THE_POSTING);
                SubLObject template_the_posting = (NIL != template_the_posting_binding) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_binding_get_value_method(template_the_posting_binding))) : NIL;
                SubLObject template_most_local_binding = (NIL != template_the_posting_binding) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_environment_get_binding_by_value_method(template_first_activation_pattern, template_the_posting))) : NIL;
                SubLObject template_the_posting_binding_type = (NIL != template_most_local_binding) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_binding_get_type_method(template_most_local_binding))) : NIL;
                SubLObject pcase_var = cyblack_internal_monitoring_ks_get_action_method(self);
                if (pcase_var.eql($SEND)) {
                    {
                        SubLObject cdolist_list_var = cyblack_internal_monitoring_ks_get_action_qualifiers_method(self);
                        SubLObject action_qualifier = NIL;
                        for (action_qualifier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action_qualifier = cdolist_list_var.first()) {
                            {
                                SubLObject pcase_var_1 = action_qualifier;
                                if (pcase_var_1.eql($ALL_POSTINGS)) {
                                    cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_internal_monitoring_ks_get_state_change_listener_method(self), $POST, cyblack_internal_monitoring_ks_gather_all_postings_method(self, template_the_posting_binding_type));
                                } else
                                    if (pcase_var_1.eql($ALL_DIRECT_POSTINGS)) {
                                        cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_internal_monitoring_ks_get_state_change_listener_method(self), $POST, cyblack_internal_monitoring_ks_gather_all_direct_postings_method(self, template_the_posting_binding_type));
                                    } else
                                        if (pcase_var_1.eql($NEW_POSTING)) {
                                            cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_internal_monitoring_ks_get_state_change_listener_method(self), $POST, list(template_the_posting));
                                        } else
                                            if (pcase_var_1.eql($NEW_DIRECT_POSTING)) {
                                                {
                                                    SubLObject template_posting_type = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(template_the_posting);
                                                    if (template_posting_type == template_the_posting_binding) {
                                                        cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_internal_monitoring_ks_get_state_change_listener_method(self), $POST, list(template_the_posting));
                                                    }
                                                }
                                            } else
                                                if (pcase_var_1.eql($ADDED_OR_INACTIVATED_POSTING)) {
                                                    if (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(template_the_posting)) {
                                                        cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_internal_monitoring_ks_get_state_change_listener_method(self), $POST, list(template_the_posting));
                                                    } else {
                                                        cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_internal_monitoring_ks_get_state_change_listener_method(self), $REMOVE_POST, list(template_the_posting));
                                                    }
                                                } else
                                                    if (pcase_var_1.eql($ADDED_OR_INACTIVATED_DIRECT_POSTING)) {
                                                        {
                                                            SubLObject template_posting_type = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(template_the_posting);
                                                            if (template_posting_type == template_the_posting_binding) {
                                                                if (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(template_the_posting)) {
                                                                    cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_internal_monitoring_ks_get_state_change_listener_method(self), $POST, list(template_the_posting));
                                                                } else {
                                                                    cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_internal_monitoring_ks_get_state_change_listener_method(self), $POST, list(template_the_posting));
                                                                }
                                                            }
                                                        }
                                                    }





                            }
                        }
                    }
                } else {
                    Errors.warn($str_alt358$_PERFORM_ACTION__S____S_is_not_a_, self, cyblack_internal_monitoring_ks_get_action_method(self));
                }
            }
        }
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_monitoring_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_monitoring_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, PRECONDITION_DATATYPES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_MONITORING_KS, ACTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_MONITORING_KS, ACTION_QUALIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_MONITORING_KS, STATE_CHANGE_LISTENER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_MONITORING_KS, STATE_CHANGE_LISTENER, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_internal_monitoring_ks_p(SubLObject cyblack_internal_monitoring_ks) {
        return classes.subloop_instanceof_class(cyblack_internal_monitoring_ks, CYBLACK_INTERNAL_MONITORING_KS);
    }

    public static final SubLObject cyblack_internal_monitoring_ks_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_monitoring_ks_method = NIL;
            SubLObject state_change_listener = get_cyblack_internal_monitoring_ks_state_change_listener(self);
            SubLObject state_change_listener_class = get_cyblack_internal_monitoring_ks_state_change_listener_class(self);
            SubLObject action_qualifiers = get_cyblack_internal_monitoring_ks_action_qualifiers(self);
            SubLObject action = get_cyblack_internal_monitoring_ks_action(self);
            SubLObject unification_robot_class = get_cyblack_basic_knowledge_source_unification_robot_class(self);
            try {
                try {
                    cyblack_internal_knowledge_source_initialize_method(self);
                    action = $SEND;
                    action_qualifiers = list($NEW_POSTING);
                    state_change_listener_class = CYBLACK_INTERNAL_STATE_CHANGE_LISTENER;
                    state_change_listener = NIL;
                    unification_robot_class = CYBLACK_MONITORING_UNIFICATION_ROBOT;
                    sublisp_throw($sym363$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_monitoring_ks_state_change_listener(self, state_change_listener);
                            set_cyblack_internal_monitoring_ks_state_change_listener_class(self, state_change_listener_class);
                            set_cyblack_internal_monitoring_ks_action_qualifiers(self, action_qualifiers);
                            set_cyblack_internal_monitoring_ks_action(self, action);
                            set_cyblack_basic_knowledge_source_unification_robot_class(self, unification_robot_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym363$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_internal_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_set_precondition_pattern_method(SubLObject self, SubLObject new_precondition_pattern) {
        {
            SubLObject catch_var_for_cyblack_internal_monitoring_ks_method = NIL;
            SubLObject action_qualifiers = get_cyblack_internal_monitoring_ks_action_qualifiers(self);
            SubLObject action = get_cyblack_internal_monitoring_ks_action(self);
            try {
                try {
                    if (new_precondition_pattern.isCons()) {
                        {
                            SubLObject third_element = nth(TWO_INTEGER, new_precondition_pattern);
                            action = third_element;
                        }
                        {
                            SubLObject fourth_element = nth(THREE_INTEGER, new_precondition_pattern);
                            if (NIL != cyblack_precondition_pattern.cyblack_monitoring_pattern_action_qualifier_type_p(fourth_element)) {
                                action_qualifiers = list(fourth_element);
                            } else {
                                action_qualifiers = copy_list(fourth_element);
                            }
                        }
                        sublisp_throw($sym368$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, cyblack_internal_knowledge_source_set_precondition_pattern_method(self, new_precondition_pattern));
                    } else
                        if (NIL != cyblack_precondition_pattern.cyblack_monitoring_pattern_p(new_precondition_pattern)) {
                            action = cyblack_precondition_pattern.cyblack_monitoring_pattern_get_action_method(new_precondition_pattern);
                            action_qualifiers = copy_tree(cyblack_precondition_pattern.cyblack_monitoring_pattern_get_action_qualifiers_method(new_precondition_pattern));
                            sublisp_throw($sym368$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, cyblack_internal_knowledge_source_set_precondition_pattern_method(self, new_precondition_pattern));
                        } else {
                            Errors.error($str_alt369$_SET_PRECONDITION_PATTERN__S____S, self, new_precondition_pattern);
                        }

                    sublisp_throw($sym368$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_monitoring_ks_action_qualifiers(self, action_qualifiers);
                            set_cyblack_internal_monitoring_ks_action(self, action);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym368$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_internal_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_get_state_change_listener_class_method(SubLObject self) {
        {
            SubLObject state_change_listener_class = get_cyblack_internal_monitoring_ks_state_change_listener_class(self);
            return state_change_listener_class;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_set_state_change_listener_class_method(SubLObject self, SubLObject new_class) {
        {
            SubLObject catch_var_for_cyblack_internal_monitoring_ks_method = NIL;
            SubLObject state_change_listener_class = get_cyblack_internal_monitoring_ks_state_change_listener_class(self);
            try {
                try {
                    state_change_listener_class = new_class;
                    sublisp_throw($sym377$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, new_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_monitoring_ks_state_change_listener_class(self, state_change_listener_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym377$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_internal_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_get_state_change_listener_method(SubLObject self) {
        {
            SubLObject state_change_listener = get_cyblack_internal_monitoring_ks_state_change_listener(self);
            return state_change_listener;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_set_state_change_listener_method(SubLObject self, SubLObject new_state_change_listener) {
        {
            SubLObject catch_var_for_cyblack_internal_monitoring_ks_method = NIL;
            SubLObject state_change_listener = get_cyblack_internal_monitoring_ks_state_change_listener(self);
            try {
                try {
                    state_change_listener = new_state_change_listener;
                    sublisp_throw($sym385$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, new_state_change_listener);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_monitoring_ks_state_change_listener(self, state_change_listener);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym385$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_internal_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_get_action_method(SubLObject self) {
        {
            SubLObject action = get_cyblack_internal_monitoring_ks_action(self);
            return action;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_set_action_method(SubLObject self, SubLObject new_action) {
        {
            SubLObject catch_var_for_cyblack_internal_monitoring_ks_method = NIL;
            SubLObject action = get_cyblack_internal_monitoring_ks_action(self);
            try {
                try {
                    action = new_action;
                    sublisp_throw($sym393$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, new_action);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_monitoring_ks_action(self, action);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym393$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_internal_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_get_action_qualifiers_method(SubLObject self) {
        {
            SubLObject action_qualifiers = get_cyblack_internal_monitoring_ks_action_qualifiers(self);
            return action_qualifiers;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_set_action_qualifiers_method(SubLObject self, SubLObject new_action_qualifiers) {
        {
            SubLObject catch_var_for_cyblack_internal_monitoring_ks_method = NIL;
            SubLObject action_qualifiers = get_cyblack_internal_monitoring_ks_action_qualifiers(self);
            try {
                try {
                    action_qualifiers = new_action_qualifiers;
                    sublisp_throw($sym401$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, new_action_qualifiers);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_monitoring_ks_action_qualifiers(self, action_qualifiers);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym401$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_internal_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_gather_all_postings_method(SubLObject self, SubLObject datatype) {
        {
            SubLObject catch_var_for_cyblack_internal_monitoring_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if ((NIL != datatype) && (NIL != application)) {
                        {
                            SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                            if (NIL != blackboard) {
                                {
                                    SubLObject panel = cyblack_datatype.cyblack_datatype_get_panel(datatype, blackboard, UNPROVIDED);
                                    sublisp_throw($sym406$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, cyblack_panel_dispatch_functions.cyblack_panel_get_all_postings(panel));
                                }
                            }
                        }
                    }
                    sublisp_throw($sym406$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, NIL);
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
                catch_var_for_cyblack_internal_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym406$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_internal_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_gather_all_direct_postings_method(SubLObject self, SubLObject datatype) {
        {
            SubLObject catch_var_for_cyblack_internal_monitoring_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if ((NIL != datatype) && (NIL != application)) {
                        {
                            SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                            if (NIL != blackboard) {
                                {
                                    SubLObject panel = cyblack_datatype.cyblack_datatype_get_panel(datatype, blackboard, UNPROVIDED);
                                    sublisp_throw($sym410$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, cyblack_panel_dispatch_functions.cyblack_panel_get_direct_postings(panel));
                                }
                            }
                        }
                    }
                    sublisp_throw($sym410$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD, NIL);
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
                catch_var_for_cyblack_internal_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym410$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_internal_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_internal_monitoring_ks_on_startup_method(SubLObject self) {
        cyblack_internal_knowledge_source_on_startup_method(self);
        {
            SubLObject state_change_listener_class = cyblack_internal_monitoring_ks_get_state_change_listener_class_method(self);
            SubLObject state_change_listener = cyblack_internal_monitoring_ks_get_state_change_listener_method(self);
            if (NIL == state_change_listener) {
                state_change_listener = object.new_object_instance(NIL != state_change_listener_class ? ((SubLObject) (state_change_listener_class)) : CYBLACK_INTERNAL_STATE_CHANGE_LISTENER);
                cyblack_internal_monitoring_ks_set_state_change_listener_method(self, state_change_listener);
            }
            cyblack_object.set_cyblack_object_application(state_change_listener, cyblack_basic_knowledge_source_get_application_method(self));
            cyblack_state_change_listener.cyblack_basic_state_change_listener_set_knowledge_source_method(state_change_listener, self);
            return NIL;
        }
    }

    public static final SubLObject new_external_knowledge_source(SubLObject new_internals, SubLObject new_precondition_pattern, SubLObject new_stimulation_function, SubLObject new_post_proposal_function, SubLObject new_generate_ksi_function) {
        if (new_internals == UNPROVIDED) {
            new_internals = NIL;
        }
        if (new_precondition_pattern == UNPROVIDED) {
            new_precondition_pattern = NIL;
        }
        if (new_stimulation_function == UNPROVIDED) {
            new_stimulation_function = NIL;
        }
        if (new_post_proposal_function == UNPROVIDED) {
            new_post_proposal_function = NIL;
        }
        if (new_generate_ksi_function == UNPROVIDED) {
            new_generate_ksi_function = NIL;
        }
        {
            SubLObject new_instance = cyblack_structures.make_external_knowledge_source(UNPROVIDED);
            SubLObject eks = new_instance;
            SubLObject lock = cyblack_structures.eks_lock(eks);
            SubLObject internals = cyblack_structures.eks_internals(eks);
            SubLObject v_cyblack_application = cyblack_structures.eks_cyblack_application(eks);
            SubLObject precondition_pattern = cyblack_structures.eks_precondition_pattern(eks);
            SubLObject stimulation_function = cyblack_structures.eks_stimulation_function(eks);
            SubLObject post_proposal_function = cyblack_structures.eks_post_proposal_function(eks);
            SubLObject generate_ksi_function = cyblack_structures.eks_generate_ksi_function(eks);
            try {
                lock = make_lock(format(NIL, $str_alt414$Lock_for___S, new_instance));
                internals = new_internals;
                v_cyblack_application = NIL;
                precondition_pattern = new_precondition_pattern;
                stimulation_function = new_stimulation_function;
                post_proposal_function = new_post_proposal_function;
                generate_ksi_function = new_generate_ksi_function;
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        cyblack_structures._csetf_eks_lock(eks, lock);
                        cyblack_structures._csetf_eks_internals(eks, internals);
                        cyblack_structures._csetf_eks_cyblack_application(eks, v_cyblack_application);
                        cyblack_structures._csetf_eks_precondition_pattern(eks, precondition_pattern);
                        cyblack_structures._csetf_eks_stimulation_function(eks, stimulation_function);
                        cyblack_structures._csetf_eks_post_proposal_function(eks, post_proposal_function);
                        cyblack_structures._csetf_eks_generate_ksi_function(eks, generate_ksi_function);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return new_instance;
        }
    }

    public static final SubLObject get_cyblack_external_knowledge_source_port_id(SubLObject cyblack_external_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_knowledge_source, TWENTY_INTEGER, PORT_ID);
    }

    public static final SubLObject set_cyblack_external_knowledge_source_port_id(SubLObject cyblack_external_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_knowledge_source, value, TWENTY_INTEGER, PORT_ID);
    }

    public static final SubLObject get_cyblack_external_knowledge_source_rejection_excuses(SubLObject cyblack_external_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_knowledge_source, NINETEEN_INTEGER, REJECTION_EXCUSES);
    }

    public static final SubLObject set_cyblack_external_knowledge_source_rejection_excuses(SubLObject cyblack_external_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_knowledge_source, value, NINETEEN_INTEGER, REJECTION_EXCUSES);
    }

    public static final SubLObject get_cyblack_external_knowledge_source_guid_as_string(SubLObject cyblack_external_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_knowledge_source, EIGHTEEN_INTEGER, GUID_AS_STRING);
    }

    public static final SubLObject set_cyblack_external_knowledge_source_guid_as_string(SubLObject cyblack_external_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_knowledge_source, value, EIGHTEEN_INTEGER, GUID_AS_STRING);
    }

    public static final SubLObject get_cyblack_external_knowledge_source_invitation_transaction_id(SubLObject cyblack_external_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_knowledge_source, SEVENTEEN_INTEGER, INVITATION_TRANSACTION_ID);
    }

    public static final SubLObject set_cyblack_external_knowledge_source_invitation_transaction_id(SubLObject cyblack_external_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_knowledge_source, value, SEVENTEEN_INTEGER, INVITATION_TRANSACTION_ID);
    }

    public static final SubLObject get_cyblack_external_knowledge_source_proposal_class(SubLObject cyblack_external_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_knowledge_source, SIXTEEN_INTEGER, PROPOSAL_CLASS);
    }

    public static final SubLObject set_cyblack_external_knowledge_source_proposal_class(SubLObject cyblack_external_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_knowledge_source, value, SIXTEEN_INTEGER, PROPOSAL_CLASS);
    }

    public static final SubLObject get_cyblack_external_knowledge_source_cached_proposal_class(SubLObject cyblack_external_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_knowledge_source, FIFTEEN_INTEGER, CACHED_PROPOSAL_CLASS);
    }

    public static final SubLObject set_cyblack_external_knowledge_source_cached_proposal_class(SubLObject cyblack_external_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_knowledge_source, value, FIFTEEN_INTEGER, CACHED_PROPOSAL_CLASS);
    }

    public static final SubLObject get_cyblack_external_knowledge_source_cached_message_broker(SubLObject cyblack_external_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_knowledge_source, FOURTEEN_INTEGER, CACHED_MESSAGE_BROKER);
    }

    public static final SubLObject set_cyblack_external_knowledge_source_cached_message_broker(SubLObject cyblack_external_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_knowledge_source, value, FOURTEEN_INTEGER, CACHED_MESSAGE_BROKER);
    }

    public static final SubLObject get_cyblack_external_knowledge_source_external_knowledge_source(SubLObject cyblack_external_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_knowledge_source, THIRTEEN_INTEGER, EXTERNAL_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject set_cyblack_external_knowledge_source_external_knowledge_source(SubLObject cyblack_external_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_knowledge_source, value, THIRTEEN_INTEGER, EXTERNAL_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject get_cyblack_external_knowledge_source_name(SubLObject cyblack_external_knowledge_source) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_knowledge_source, TWELVE_INTEGER, NAME);
    }

    public static final SubLObject set_cyblack_external_knowledge_source_name(SubLObject cyblack_external_knowledge_source, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_knowledge_source, value, TWELVE_INTEGER, NAME);
    }

    public static final SubLObject get_cyblack_external_knowledge_source_rejected(SubLObject cyblack_external_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_external_knowledge_source);
            SubLObject slot = slots.slot_assoc(REJECTED, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_external_knowledge_source, slot);
        }
        return classes.ldb_test($int$4108, subloop_structures.instance_boolean_slots(cyblack_external_knowledge_source));
    }

    public static final SubLObject set_cyblack_external_knowledge_source_rejected(SubLObject cyblack_external_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_external_knowledge_source);
            SubLObject slot = slots.slot_assoc(REJECTED, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_external_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_external_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4108, subloop_structures.instance_boolean_slots(cyblack_external_knowledge_source)));
        return value;
    }

    public static final SubLObject get_cyblack_external_knowledge_source_waiting_on_link_callback(SubLObject cyblack_external_knowledge_source) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_external_knowledge_source);
            SubLObject slot = slots.slot_assoc(WAITING_ON_LINK_CALLBACK, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_external_knowledge_source, slot);
        }
        return classes.ldb_test($int$4107, subloop_structures.instance_boolean_slots(cyblack_external_knowledge_source));
    }

    public static final SubLObject set_cyblack_external_knowledge_source_waiting_on_link_callback(SubLObject cyblack_external_knowledge_source, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_external_knowledge_source);
            SubLObject slot = slots.slot_assoc(WAITING_ON_LINK_CALLBACK, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_external_knowledge_source, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_external_knowledge_source, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4107, subloop_structures.instance_boolean_slots(cyblack_external_knowledge_source)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_knowledge_source_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_knowledge_source_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, WAITING_ON_LINK_CALLBACK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, REJECTED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, EXTERNAL_KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, CACHED_MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, CACHED_PROPOSAL_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, PROPOSAL_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, INVITATION_TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GUID_AS_STRING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, REJECTION_EXCUSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, PORT_ID, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_external_knowledge_source_p(SubLObject cyblack_external_knowledge_source) {
        return classes.subloop_instanceof_class(cyblack_external_knowledge_source, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject cyblack_external_knowledge_source_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject invitation_transaction_id = get_cyblack_external_knowledge_source_invitation_transaction_id(self);
            SubLObject proposal_class = get_cyblack_external_knowledge_source_proposal_class(self);
            SubLObject cached_proposal_class = get_cyblack_external_knowledge_source_cached_proposal_class(self);
            SubLObject external_knowledge_source = get_cyblack_external_knowledge_source_external_knowledge_source(self);
            SubLObject name = get_cyblack_external_knowledge_source_name(self);
            SubLObject rejected = get_cyblack_external_knowledge_source_rejected(self);
            SubLObject waiting_on_link_callback = get_cyblack_external_knowledge_source_waiting_on_link_callback(self);
            try {
                try {
                    cyblack_basic_knowledge_source_initialize_method(self);
                    name = $str_alt434$;
                    external_knowledge_source = new_external_knowledge_source(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    cyblack_structures._csetf_eks_knowledge_source(external_knowledge_source, self);
                    proposal_class = CYBLACK_EXTERNAL_PROPOSAL;
                    cached_proposal_class = NIL;
                    waiting_on_link_callback = NIL;
                    invitation_transaction_id = NIL;
                    rejected = NIL;
                    sublisp_throw($sym433$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_invitation_transaction_id(self, invitation_transaction_id);
                            set_cyblack_external_knowledge_source_proposal_class(self, proposal_class);
                            set_cyblack_external_knowledge_source_cached_proposal_class(self, cached_proposal_class);
                            set_cyblack_external_knowledge_source_external_knowledge_source(self, external_knowledge_source);
                            set_cyblack_external_knowledge_source_name(self, name);
                            set_cyblack_external_knowledge_source_rejected(self, rejected);
                            set_cyblack_external_knowledge_source_waiting_on_link_callback(self, waiting_on_link_callback);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym433$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_get_name_method(SubLObject self) {
        {
            SubLObject name = get_cyblack_external_knowledge_source_name(self);
            return name;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_set_name_method(SubLObject self, SubLObject new_name) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject name = get_cyblack_external_knowledge_source_name(self);
            try {
                try {
                    name = new_name;
                    sublisp_throw($sym443$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, new_name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym443$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_inflate_method(SubLObject self, SubLObject new_internals, SubLObject new_precondition_pattern, SubLObject new_stimulation_function, SubLObject new_post_proposal_function, SubLObject new_generate_ksi_function) {
        if (new_internals == UNPROVIDED) {
            new_internals = NIL;
        }
        if (new_precondition_pattern == UNPROVIDED) {
            new_precondition_pattern = NIL;
        }
        if (new_stimulation_function == UNPROVIDED) {
            new_stimulation_function = NIL;
        }
        if (new_post_proposal_function == UNPROVIDED) {
            new_post_proposal_function = NIL;
        }
        if (new_generate_ksi_function == UNPROVIDED) {
            new_generate_ksi_function = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject external_knowledge_source = get_cyblack_external_knowledge_source_external_knowledge_source(self);
            try {
                try {
                    if (NIL == external_knowledge_source) {
                        external_knowledge_source = new_external_knowledge_source(new_internals, new_precondition_pattern, new_stimulation_function, new_post_proposal_function, new_generate_ksi_function);
                        {
                            SubLObject eks = external_knowledge_source;
                            SubLObject lock = cyblack_structures.eks_lock(eks);
                            SubLObject knowledge_source = cyblack_structures.eks_knowledge_source(eks);
                            SubLObject v_cyblack_application = cyblack_structures.eks_cyblack_application(eks);
                            try {
                                {
                                    SubLObject lock_2 = lock;
                                    SubLObject release = NIL;
                                    try {
                                        release = seize_lock(lock_2);
                                        knowledge_source = self;
                                        v_cyblack_application = cyblack_basic_knowledge_source_get_application_method(self);
                                    } finally {
                                        if (NIL != release) {
                                            release_lock(lock_2);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        cyblack_structures._csetf_eks_lock(eks, lock);
                                        cyblack_structures._csetf_eks_knowledge_source(eks, knowledge_source);
                                        cyblack_structures._csetf_eks_cyblack_application(eks, v_cyblack_application);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                        }
                    }
                    sublisp_throw($sym448$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, external_knowledge_source);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_external_knowledge_source(self, external_knowledge_source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym448$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_get_proposal_class_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject proposal_class = get_cyblack_external_knowledge_source_proposal_class(self);
            SubLObject cached_proposal_class = get_cyblack_external_knowledge_source_cached_proposal_class(self);
            try {
                try {
                    if (NIL != cached_proposal_class) {
                        sublisp_throw($sym452$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, cached_proposal_class);
                    }
                    if (NIL != proposal_class) {
                        cached_proposal_class = classes.classes_retrieve_class(proposal_class);
                    }
                    sublisp_throw($sym452$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, cached_proposal_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_proposal_class(self, proposal_class);
                            set_cyblack_external_knowledge_source_cached_proposal_class(self, cached_proposal_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym452$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_set_proposal_class_method(SubLObject self, SubLObject new_class) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject proposal_class = get_cyblack_external_knowledge_source_proposal_class(self);
            SubLObject cached_proposal_class = get_cyblack_external_knowledge_source_cached_proposal_class(self);
            try {
                try {
                    if (NIL == new_class) {
                        proposal_class = NIL;
                        cached_proposal_class = NIL;
                        sublisp_throw($sym456$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, NIL);
                    }
                    if (new_class.isSymbol()) {
                        proposal_class = new_class;
                        cached_proposal_class = NIL;
                        sublisp_throw($sym456$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, new_class);
                    }
                    proposal_class = subloop_structures.class_name(new_class);
                    cached_proposal_class = new_class;
                    sublisp_throw($sym456$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, new_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_proposal_class(self, proposal_class);
                            set_cyblack_external_knowledge_source_cached_proposal_class(self, cached_proposal_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym456$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_generate_new_proposal_method(SubLObject self) {
        {
            SubLObject v_class = cyblack_external_knowledge_source_get_proposal_class_method(self);
            if (NIL != v_class) {
                return object.new_object_instance(v_class);
            }
            return object.new_object_instance(CYBLACK_EXTERNAL_PROPOSAL);
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_get_external_knowledge_source_method(SubLObject self) {
        {
            SubLObject external_knowledge_source = get_cyblack_external_knowledge_source_external_knowledge_source(self);
            return external_knowledge_source;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_get_precondition_pattern_method(SubLObject self) {
        {
            SubLObject external_knowledge_source = get_cyblack_external_knowledge_source_external_knowledge_source(self);
            return NIL != cyblack_structures.external_knowledge_source_p(external_knowledge_source) ? ((SubLObject) (cyblack_structures.eks_precondition_pattern(external_knowledge_source))) : NIL;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_set_precondition_pattern_method(SubLObject self, SubLObject new_precondition_pattern) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject external_knowledge_source = get_cyblack_external_knowledge_source_external_knowledge_source(self);
            SubLObject uncompiled_precondition_pattern = get_cyblack_basic_knowledge_source_uncompiled_precondition_pattern(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            SubLObject is_a_monitor = get_cyblack_proto_knowledge_source_is_a_monitor(self);
            try {
                try {
                    if (NIL != external_knowledge_source) {
                        {
                            SubLObject eks = external_knowledge_source;
                            SubLObject precondition_pattern = cyblack_structures.eks_precondition_pattern(eks);
                            SubLObject uncompiled_precondition_pattern_3 = cyblack_structures.eks_uncompiled_precondition_pattern(eks);
                            SubLObject precondition_datatypes = cyblack_structures.eks_precondition_datatypes(eks);
                            try {
                                if (NIL != cyblack_precondition_pattern.cyblack_precon_pattern_p(new_precondition_pattern)) {
                                    precondition_pattern = new_precondition_pattern;
                                    precondition_datatypes = cyblack_precondition_pattern.cyblack_pattern_get_datatype_bag_method(precondition_pattern);
                                    is_a_monitor = NIL;
                                    sublisp_throw($sym467$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, new_precondition_pattern);
                                }
                                if (NIL != cyblack_precondition_pattern.cyblack_monitoring_pattern_p(new_precondition_pattern)) {
                                    precondition_pattern = new_precondition_pattern;
                                    precondition_datatypes = cyblack_precondition_pattern.cyblack_pattern_get_datatype_bag_method(precondition_pattern);
                                    is_a_monitor = T;
                                    sublisp_throw($sym467$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, new_precondition_pattern);
                                }
                                if (NIL != application) {
                                    {
                                        SubLObject v_parser = methods.funcall_instance_method_with_0_args(application, GET_PARSER);
                                        if (NIL != v_parser) {
                                            precondition_pattern = methods.funcall_instance_method_with_1_args(v_parser, PARSE, new_precondition_pattern);
                                            if (NIL != precondition_pattern) {
                                                is_a_monitor = cyblack_precondition_pattern.cyblack_monitoring_pattern_p(precondition_pattern);
                                            }
                                            precondition_datatypes = cyblack_precondition_pattern.cyblack_pattern_get_datatype_bag_method(precondition_pattern);
                                            uncompiled_precondition_pattern_3 = copy_tree(new_precondition_pattern);
                                            sublisp_throw($sym467$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, precondition_pattern);
                                        }
                                    }
                                }
                                precondition_pattern = NIL;
                                uncompiled_precondition_pattern_3 = copy_tree(new_precondition_pattern);
                                precondition_datatypes = NIL;
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                    try {
                                        bind($is_thread_performing_cleanupP$, T);
                                        cyblack_structures._csetf_eks_precondition_pattern(eks, precondition_pattern);
                                        cyblack_structures._csetf_eks_uncompiled_precondition_pattern(eks, uncompiled_precondition_pattern_3);
                                        cyblack_structures._csetf_eks_precondition_datatypes(eks, precondition_datatypes);
                                    } finally {
                                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                    }
                                }
                            }
                        }
                    }
                    sublisp_throw($sym467$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, new_precondition_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_external_knowledge_source(self, external_knowledge_source);
                            set_cyblack_basic_knowledge_source_uncompiled_precondition_pattern(self, uncompiled_precondition_pattern);
                            cyblack_object.set_cyblack_object_application(self, application);
                            set_cyblack_proto_knowledge_source_is_a_monitor(self, is_a_monitor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym467$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_get_precondition_datatypes_method(SubLObject self) {
        {
            SubLObject external_knowledge_source = get_cyblack_external_knowledge_source_external_knowledge_source(self);
            return NIL != external_knowledge_source ? ((SubLObject) (cyblack_structures.eks_precondition_datatypes(external_knowledge_source))) : NIL;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_stimulate_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject external_knowledge_source = get_cyblack_external_knowledge_source_external_knowledge_source(self);
            SubLObject unification_robot_class = get_cyblack_basic_knowledge_source_unification_robot_class(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL != cyblack_structures.external_knowledge_source_p(external_knowledge_source)) {
                        {
                            SubLObject eks = external_knowledge_source;
                            SubLObject precondition_pattern = cyblack_structures.eks_precondition_pattern(eks);
                            SubLObject blackboard = methods.funcall_instance_method_with_0_args(application, GET_BLACKBOARD);
                            if (NIL != precondition_pattern) {
                                cyblack_precondition_pattern.cyblack_pattern_set_environment(precondition_pattern, environment);
                                {
                                    SubLObject activation_patterns = methods.funcall_instance_method_with_2_args(blackboard, UNIFY, precondition_pattern, unification_robot_class);
                                    if (NIL != activation_patterns) {
                                        if (NIL != cyblack_monitoring_ks_p(self)) {
                                            methods.funcall_instance_method_with_1_args(self, PERFORM_ACTION, activation_patterns);
                                        } else {
                                            {
                                                SubLObject enumerator = methods.funcall_instance_method_with_0_args(activation_patterns, ALLOCATE_ENUMERATOR);
                                                if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                                                    {
                                                        SubLObject activation_pattern = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                                        if (NIL != methods.funcall_instance_method_with_0_args(self, ON_ACTIVATE)) {
                                                            methods.funcall_instance_method_with_1_args(self, CREATE_PROPOSAL, activation_pattern);
                                                        }
                                                        while (NIL == methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                                                            activation_pattern = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                                            if (NIL != methods.funcall_instance_method_with_1_args(self, ON_ACTIVATE, activation_pattern)) {
                                                                methods.funcall_instance_method_with_1_args(self, CREATE_PROPOSAL, activation_pattern);
                                                            }
                                                        } 
                                                    }
                                                }
                                                methods.funcall_instance_method_with_1_args(activation_patterns, DEALLOCATE_ENUMERATOR, enumerator);
                                            }
                                        }
                                    }
                                }
                            }
                            sublisp_throw($sym472$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, NIL);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_external_knowledge_source(self, external_knowledge_source);
                            set_cyblack_basic_knowledge_source_unification_robot_class(self, unification_robot_class);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym472$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_on_activate_method(SubLObject self, SubLObject environment) {
        if (environment == UNPROVIDED) {
            environment = NIL;
        }
        return T;
    }

    public static final SubLObject cyblack_external_knowledge_source_create_proposal_method(SubLObject self, SubLObject activation_pattern, SubLObject arg_if_on_startup) {
        if (arg_if_on_startup == UNPROVIDED) {
            arg_if_on_startup = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject external_knowledge_source = get_cyblack_external_knowledge_source_external_knowledge_source(self);
            try {
                try {
                    {
                        SubLObject message_broker = cyblack_external_knowledge_source_get_message_broker_method(self);
                        if ((NIL != message_broker) && (NIL != external_knowledge_source)) {
                            cyblack_message_broker.cyblack_message_broker_stimulate_method(message_broker, external_knowledge_source, activation_pattern);
                        }
                        sublisp_throw($sym476$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_external_knowledge_source(self, external_knowledge_source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym476$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_create_proposal_callback_method(SubLObject self, SubLObject proposal_message) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject cause = methods.funcall_instance_method_with_0_args(proposal_message, GET_CAUSE);
                        SubLObject v_agenda = cyblack_application.cyblack_application_get_agenda(application);
                        SubLObject proposal = cyblack_external_knowledge_source_generate_new_proposal_method(self);
                        SubLObject cause_activation_pattern = (NIL != cyblack_messages.cyblack_stimulate_message_p(cause)) ? ((SubLObject) (cyblack_messages.cyblack_activation_arglist_transmit_message_get_activation_pattern_method(cause))) : NIL;
                        SubLObject message_broker = cyblack_external_knowledge_source_get_message_broker_method(self);
                        if (NIL != message_broker) {
                            {
                                SubLObject guid_manager = cyblack_message_broker.cyblack_message_broker_get_guid_manager_method(message_broker);
                                if (NIL != guid_manager) {
                                    cyblack_message_broker.cyblack_guid_manager_intern_method(guid_manager, cyblack_messages.cyblack_embedded_propid_receive_message_get_propid_method(proposal_message), $PROPOSAL, proposal);
                                }
                            }
                        }
                        cyblack_proposal.cyblack_proposal_set_knowledge_source(proposal, self);
                        cyblack_proposal.cyblack_proposal_set_application(proposal, application);
                        cyblack_proposal.cyblack_proposal_set_activation_pattern(proposal, NIL != cyblack_precondition_pattern.cyblack_environment_p(cause_activation_pattern) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_environment_clone_method(cause_activation_pattern))) : NIL);
                        cyblack_proposal.cyblack_proposal_set_agenda(proposal, v_agenda);
                        if (NIL != cyblack_proposal.cyblack_external_proposal_p(proposal)) {
                            cyblack_proposal.cyblack_external_proposal_set_proposed_contributions_method(proposal, cyblack_messages.cyblack_propose_message_get_datatype_bag_method(proposal_message));
                        }
                        cyblack_proposal.cyblack_proposal_set_reasons(proposal, cyblack_messages.cyblack_embedded_propid_conf_reasons_receive_message_get_reasons_method(proposal_message));
                        cyblack_proto_knowledge_source_post_proposal_method(self, proposal, v_agenda);
                        sublisp_throw($sym481$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, proposal);
                    }
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
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym481$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_get_message_broker_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject cached_message_broker = get_cyblack_external_knowledge_source_cached_message_broker(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if (NIL != cached_message_broker) {
                        sublisp_throw($sym487$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, cached_message_broker);
                    }
                    {
                        SubLObject message_broker = methods.funcall_instance_method_with_0_args(application, GET_MESSAGE_BROKER);
                        cached_message_broker = message_broker;
                    }
                    sublisp_throw($sym487$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, cached_message_broker);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_cached_message_broker(self, cached_message_broker);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym487$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_link_to_panels_method(SubLObject self) {
        {
            SubLObject guid_as_string = get_cyblack_external_knowledge_source_guid_as_string(self);
            SubLObject invitation_transaction_id = get_cyblack_external_knowledge_source_invitation_transaction_id(self);
            SubLObject external_knowledge_source = get_cyblack_external_knowledge_source_external_knowledge_source(self);
            SubLObject name = get_cyblack_external_knowledge_source_name(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            SubLObject waiting_on_link_callback = get_cyblack_external_knowledge_source_waiting_on_link_callback(self);
            SubLObject message_broker = cyblack_application.cyblack_application_get_message_broker(application);
            SubLObject guid_manager = cyblack_message_broker.cyblack_message_broker_get_guid_manager_method(message_broker);
            guid_as_string = cyblack_message_broker.cyblack_message_broker_get_external_module_id_method(message_broker, name);
            set_cyblack_external_knowledge_source_guid_as_string(self, guid_as_string);
            cyblack_message_broker.cyblack_guid_manager_intern_method(guid_manager, guid_as_string, $EMID, external_knowledge_source);
            waiting_on_link_callback = T;
            set_cyblack_external_knowledge_source_waiting_on_link_callback(self, waiting_on_link_callback);
            invitation_transaction_id = cyblack_message_broker.cyblack_message_broker_invite_method(message_broker, name, guid_as_string);
            set_cyblack_external_knowledge_source_invitation_transaction_id(self, invitation_transaction_id);
            return NIL;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_link_to_panels_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject external_knowledge_source = get_cyblack_external_knowledge_source_external_knowledge_source(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            SubLObject rejected = get_cyblack_external_knowledge_source_rejected(self);
            SubLObject waiting_on_link_callback = get_cyblack_external_knowledge_source_waiting_on_link_callback(self);
            try {
                try {
                    {
                        SubLObject eks = external_knowledge_source;
                        SubLObject lock = cyblack_structures.eks_lock(eks);
                        SubLObject precondition_pattern = cyblack_structures.eks_precondition_pattern(eks);
                        try {
                            {
                                SubLObject lock_4 = lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock_4);
                                    cyblack_basic_knowledge_source_link_to_panels_method(self);
                                    {
                                        SubLObject datatype_bag = methods.funcall_instance_method_with_0_args(precondition_pattern, GET_DATATYPE_BAG);
                                        SubLObject blackboard = methods.funcall_instance_method_with_0_args(application, GET_BLACKBOARD);
                                        if (NIL != datatype_bag) {
                                            {
                                                SubLObject enumerator = methods.funcall_instance_method_with_0_args(datatype_bag, ALLOCATE_ENUMERATOR);
                                                SubLObject datatype = NIL;
                                                SubLObject panel = NIL;
                                                if (NIL == methods.funcall_instance_method_with_0_args(enumerator, EMPTY_P)) {
                                                    datatype = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                                    panel = methods.funcall_instance_method_with_1_args(datatype, GET_PANEL, blackboard);
                                                    methods.funcall_instance_method_with_1_args(panel, ADD_DIRECT_KNOWLEDGE_SOURCE, self);
                                                    while (NIL == methods.funcall_instance_method_with_0_args(enumerator, LAST_P)) {
                                                        datatype = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                                        panel = methods.funcall_instance_method_with_1_args(datatype, GET_PANEL, blackboard);
                                                        methods.funcall_instance_method_with_1_args(panel, ADD_DIRECT_KNOWLEDGE_SOURCE, self);
                                                    } 
                                                }
                                                methods.funcall_instance_method_with_1_args(datatype_bag, DEALLOCATE_ENUMERATOR, enumerator);
                                            }
                                        }
                                    }
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock_4);
                                    }
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    cyblack_structures._csetf_eks_lock(eks, lock);
                                    cyblack_structures._csetf_eks_precondition_pattern(eks, precondition_pattern);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        waiting_on_link_callback = NIL;
                        rejected = NIL;
                        sublisp_throw($sym495$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_external_knowledge_source(self, external_knowledge_source);
                            cyblack_object.set_cyblack_object_application(self, application);
                            set_cyblack_external_knowledge_source_rejected(self, rejected);
                            set_cyblack_external_knowledge_source_waiting_on_link_callback(self, waiting_on_link_callback);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym495$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_link_to_panels_callback_method(SubLObject self, SubLObject message) {
        if (NIL == message) {
            Errors.warn($str_alt500$_LINK_TO_PANELS_CALLBACK__S___Res, self, cyblack_external_knowledge_source_get_invitation_transaction_id_method(self));
        } else
            if (NIL != cyblack_messages.cyblack_accept_message_p(message)) {
                cyblack_external_knowledge_source_set_precondition_pattern_method(self, cyblack_messages.cyblack_accept_message_get_precondition_pattern_method(message));
                if (NIL == cyblack_external_knowledge_source_get_precondition_pattern_method(self)) {
                    Errors.warn($str_alt501$_LINK_TO_PANELS_CALLBACK__S___Fai, self, message);
                }
                return cyblack_external_knowledge_source_link_to_panels_internal_method(self);
            } else
                if (NIL != cyblack_messages.cyblack_reject_message_p(message)) {
                    cyblack_external_knowledge_source_set_rejected_method(self, T);
                    cyblack_external_knowledge_source_set_waiting_on_link_callback_method(self, NIL);
                    return NIL;
                } else {
                    Errors.warn($str_alt502$_LINK_TO_PANELS_CALLBACK__S___Res, self, cyblack_external_knowledge_source_get_invitation_transaction_id_method(self), message);
                }


        return NIL;
    }

    public static final SubLObject cyblack_external_knowledge_source_waiting_on_link_callback_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject waiting_on_link_callback = get_cyblack_external_knowledge_source_waiting_on_link_callback(self);
            try {
                try {
                    sublisp_throw($sym506$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, waiting_on_link_callback);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_waiting_on_link_callback(self, waiting_on_link_callback);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym506$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_set_waiting_on_link_callback_method(SubLObject self, SubLObject new_status) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject waiting_on_link_callback = get_cyblack_external_knowledge_source_waiting_on_link_callback(self);
            try {
                try {
                    waiting_on_link_callback = new_status;
                    sublisp_throw($sym511$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, NIL != new_status ? ((SubLObject) (T)) : NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_waiting_on_link_callback(self, waiting_on_link_callback);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym511$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_get_invitation_transaction_id_method(SubLObject self) {
        {
            SubLObject invitation_transaction_id = get_cyblack_external_knowledge_source_invitation_transaction_id(self);
            return invitation_transaction_id;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_set_invitation_transaction_id_method(SubLObject self, SubLObject new_id) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject invitation_transaction_id = get_cyblack_external_knowledge_source_invitation_transaction_id(self);
            try {
                try {
                    invitation_transaction_id = new_id;
                    sublisp_throw($sym519$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, new_id);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_invitation_transaction_id(self, invitation_transaction_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym519$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_rejected_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject rejected = get_cyblack_external_knowledge_source_rejected(self);
            try {
                try {
                    sublisp_throw($sym523$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, rejected);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_rejected(self, rejected);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym523$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_set_rejected_method(SubLObject self, SubLObject new_status) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject rejected = get_cyblack_external_knowledge_source_rejected(self);
            try {
                try {
                    rejected = new_status;
                    sublisp_throw($sym527$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, NIL != new_status ? ((SubLObject) (T)) : NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_rejected(self, rejected);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym527$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_get_rejection_excuses_method(SubLObject self) {
        {
            SubLObject rejection_excuses = get_cyblack_external_knowledge_source_rejection_excuses(self);
            return rejection_excuses;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_set_rejection_excuses_method(SubLObject self, SubLObject list_of_excuses) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject rejection_excuses = get_cyblack_external_knowledge_source_rejection_excuses(self);
            try {
                try {
                    rejection_excuses = copy_tree(list_of_excuses);
                    sublisp_throw($sym535$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, list_of_excuses);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_rejection_excuses(self, rejection_excuses);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym535$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_generate_ksi_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject external_knowledge_source = get_cyblack_external_knowledge_source_external_knowledge_source(self);
            try {
                try {
                    if (NIL != cyblack_structures.external_knowledge_source_p(external_knowledge_source)) {
                        {
                            SubLObject eks = external_knowledge_source;
                            SubLObject generate_ksi_function = cyblack_structures.eks_generate_ksi_function(eks);
                            if (NIL != generate_ksi_function) {
                                sublisp_throw($sym538$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, funcall(generate_ksi_function, external_knowledge_source, proposal));
                            }
                        }
                    }
                    sublisp_throw($sym538$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_external_knowledge_source(self, external_knowledge_source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym538$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_get_guid_as_string_method(SubLObject self) {
        {
            SubLObject guid_as_string = get_cyblack_external_knowledge_source_guid_as_string(self);
            return guid_as_string;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_set_guid_as_string_method(SubLObject self, SubLObject new_guid_as_string) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject guid_as_string = get_cyblack_external_knowledge_source_guid_as_string(self);
            try {
                try {
                    guid_as_string = new_guid_as_string;
                    sublisp_throw($sym546$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, new_guid_as_string);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_guid_as_string(self, guid_as_string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym546$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_get_port_id_method(SubLObject self) {
        {
            SubLObject port_id = get_cyblack_external_knowledge_source_port_id(self);
            return port_id;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_set_port_id_method(SubLObject self, SubLObject new_port_id) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject port_id = get_cyblack_external_knowledge_source_port_id(self);
            try {
                try {
                    port_id = new_port_id;
                    sublisp_throw($sym554$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD, new_port_id);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_port_id(self, port_id);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym554$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject cyblack_external_knowledge_source_on_startup_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_knowledge_source_method = NIL;
            SubLObject cached_message_broker = get_cyblack_external_knowledge_source_cached_message_broker(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    cyblack_basic_knowledge_source_on_startup_method(self);
                    if (NIL != application) {
                        {
                            SubLObject message_broker = methods.funcall_instance_method_with_0_args(application, GET_MESSAGE_BROKER);
                            cached_message_broker = message_broker;
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_knowledge_source_cached_message_broker(self, cached_message_broker);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym557$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
            }
            return catch_var_for_cyblack_external_knowledge_source_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_constrained_external_knowledge_source_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_constrained_external_knowledge_source_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, WAITING_ON_LINK_CALLBACK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, REJECTED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, EXTERNAL_KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, CACHED_MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, CACHED_PROPOSAL_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, PROPOSAL_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, INVITATION_TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GUID_AS_STRING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, REJECTION_EXCUSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, PORT_ID, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_constrained_external_knowledge_source_p(SubLObject cyblack_constrained_external_knowledge_source) {
        return classes.subloop_instanceof_class(cyblack_constrained_external_knowledge_source, CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE);
    }

    public static final SubLObject cyblack_constrained_external_knowledge_source_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_constrained_external_knowledge_source_method = NIL;
            SubLObject unification_robot_class = get_cyblack_basic_knowledge_source_unification_robot_class(self);
            try {
                try {
                    cyblack_external_knowledge_source_initialize_method(self);
                    unification_robot_class = CYBLACK_CONSTRAINED_UNIFICATION_ROBOT;
                    sublisp_throw($sym562$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE_MET, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_knowledge_source_unification_robot_class(self, unification_robot_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_constrained_external_knowledge_source_method = Errors.handleThrowable(ccatch_env_var, $sym562$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE_MET);
            }
            return catch_var_for_cyblack_constrained_external_knowledge_source_method;
        }
    }

    public static final SubLObject get_cyblack_external_monitoring_ks_state_change_listener(SubLObject cyblack_external_monitoring_ks) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_monitoring_ks, $int$24, STATE_CHANGE_LISTENER);
    }

    public static final SubLObject set_cyblack_external_monitoring_ks_state_change_listener(SubLObject cyblack_external_monitoring_ks, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_monitoring_ks, value, $int$24, STATE_CHANGE_LISTENER);
    }

    public static final SubLObject get_cyblack_external_monitoring_ks_state_change_listener_class(SubLObject cyblack_external_monitoring_ks) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_monitoring_ks, $int$23, STATE_CHANGE_LISTENER_CLASS);
    }

    public static final SubLObject set_cyblack_external_monitoring_ks_state_change_listener_class(SubLObject cyblack_external_monitoring_ks, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_monitoring_ks, value, $int$23, STATE_CHANGE_LISTENER_CLASS);
    }

    public static final SubLObject get_cyblack_external_monitoring_ks_action_qualifiers(SubLObject cyblack_external_monitoring_ks) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_monitoring_ks, $int$22, ACTION_QUALIFIERS);
    }

    public static final SubLObject set_cyblack_external_monitoring_ks_action_qualifiers(SubLObject cyblack_external_monitoring_ks, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_monitoring_ks, value, $int$22, ACTION_QUALIFIERS);
    }

    public static final SubLObject get_cyblack_external_monitoring_ks_action(SubLObject cyblack_external_monitoring_ks) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_monitoring_ks, $int$21, ACTION);
    }

    public static final SubLObject set_cyblack_external_monitoring_ks_action(SubLObject cyblack_external_monitoring_ks, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_monitoring_ks, value, $int$21, ACTION);
    }

    public static final SubLObject cyblack_external_monitoring_ks_perform_action_method(SubLObject self, SubLObject activation_patterns) {
        if (!((NIL != activation_patterns) && (NIL == subloop_collections.basic_end_pointer_list_empty_p_method(activation_patterns)))) {
            return NIL;
        }
        if (NIL != activation_patterns) {
            {
                SubLObject template_first_activation_pattern = subloop_collections.basic_end_pointer_list_nth_method(activation_patterns, ZERO_INTEGER);
                SubLObject template_the_posting_binding = cyblack_precondition_pattern.cyblack_environment_get_binding_method(template_first_activation_pattern, $sym348$_THE_POSTING);
                SubLObject template_the_posting = (NIL != template_the_posting_binding) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_binding_get_value_method(template_the_posting_binding))) : NIL;
                SubLObject template_most_local_binding = (NIL != template_the_posting_binding) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_environment_get_binding_by_value_method(template_first_activation_pattern, template_the_posting))) : NIL;
                SubLObject template_the_posting_binding_type = (NIL != template_most_local_binding) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_binding_get_type_method(template_most_local_binding))) : NIL;
                SubLObject pcase_var = cyblack_external_monitoring_ks_get_action_method(self);
                if (pcase_var.eql($SEND)) {
                    {
                        SubLObject cdolist_list_var = cyblack_external_monitoring_ks_get_action_qualifiers_method(self);
                        SubLObject action_qualifier = NIL;
                        for (action_qualifier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , action_qualifier = cdolist_list_var.first()) {
                            {
                                SubLObject pcase_var_5 = action_qualifier;
                                if (pcase_var_5.eql($ALL_POSTINGS)) {
                                    cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_external_monitoring_ks_get_state_change_listener_method(self), $POST, cyblack_external_monitoring_ks_gather_all_postings_method(self, template_the_posting_binding_type));
                                } else
                                    if (pcase_var_5.eql($ALL_DIRECT_POSTINGS)) {
                                        cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_external_monitoring_ks_get_state_change_listener_method(self), $POST, cyblack_external_monitoring_ks_gather_all_direct_postings_method(self, template_the_posting_binding_type));
                                    } else
                                        if (pcase_var_5.eql($NEW_POSTING)) {
                                            cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_external_monitoring_ks_get_state_change_listener_method(self), $POST, list(template_the_posting));
                                        } else
                                            if (pcase_var_5.eql($NEW_DIRECT_POSTING)) {
                                                {
                                                    SubLObject template_posting_type = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(template_the_posting);
                                                    if (template_posting_type == template_the_posting_binding) {
                                                        cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_external_monitoring_ks_get_state_change_listener_method(self), $POST, list(template_the_posting));
                                                    }
                                                }
                                            } else
                                                if (pcase_var_5.eql($ADDED_OR_INACTIVATED_POSTING)) {
                                                    if (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(template_the_posting)) {
                                                        cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_external_monitoring_ks_get_state_change_listener_method(self), $POST, list(template_the_posting));
                                                    } else {
                                                        cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_external_monitoring_ks_get_state_change_listener_method(self), $REMOVE_POST, list(template_the_posting));
                                                    }
                                                } else
                                                    if (pcase_var_5.eql($ADDED_OR_INACTIVATED_DIRECT_POSTING)) {
                                                        {
                                                            SubLObject template_posting_type = cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(template_the_posting);
                                                            if (template_posting_type == template_the_posting_binding) {
                                                                if (NIL != cyblack_posting_dispatch_functions.cyblack_posting_active_p(template_the_posting)) {
                                                                    cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_external_monitoring_ks_get_state_change_listener_method(self), $POST, list(template_the_posting));
                                                                } else {
                                                                    cyblack_state_change_listener.cyblack_basic_state_change_listener_transmit_state_change_method(cyblack_external_monitoring_ks_get_state_change_listener_method(self), $POST, list(template_the_posting));
                                                                }
                                                            }
                                                        }
                                                    }





                            }
                        }
                    }
                } else {
                    Errors.warn($str_alt358$_PERFORM_ACTION__S____S_is_not_a_, self, cyblack_external_monitoring_ks_get_action_method(self));
                }
            }
        }
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_monitoring_ks_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_monitoring_ks_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, IS_A_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, HAS_CACHED_DOMAIN_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, WAITING_ON_LINK_CALLBACK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, REJECTED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, AUTHOR_NAMES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PROTO_KNOWLEDGE_SOURCE, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNCOMPILED_PRECONDITION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNIFICATION_ROBOT_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, CACHED_DOMAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KNOWLEDGE_SOURCE, RANGE_SET, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, EXTERNAL_KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, CACHED_MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, CACHED_PROPOSAL_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, PROPOSAL_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, INVITATION_TRANSACTION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GUID_AS_STRING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, REJECTION_EXCUSES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, PORT_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_MONITORING_KS, ACTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_MONITORING_KS, ACTION_QUALIFIERS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_MONITORING_KS, STATE_CHANGE_LISTENER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_MONITORING_KS, STATE_CHANGE_LISTENER, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_external_monitoring_ks_p(SubLObject cyblack_external_monitoring_ks) {
        return classes.subloop_instanceof_class(cyblack_external_monitoring_ks, CYBLACK_EXTERNAL_MONITORING_KS);
    }

    public static final SubLObject cyblack_external_monitoring_ks_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_monitoring_ks_method = NIL;
            SubLObject state_change_listener = get_cyblack_external_monitoring_ks_state_change_listener(self);
            SubLObject state_change_listener_class = get_cyblack_external_monitoring_ks_state_change_listener_class(self);
            SubLObject action_qualifiers = get_cyblack_external_monitoring_ks_action_qualifiers(self);
            SubLObject action = get_cyblack_external_monitoring_ks_action(self);
            SubLObject unification_robot_class = get_cyblack_basic_knowledge_source_unification_robot_class(self);
            try {
                try {
                    cyblack_external_knowledge_source_initialize_method(self);
                    action = $SEND;
                    action_qualifiers = list($NEW_POSTING);
                    state_change_listener_class = CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER;
                    state_change_listener = NIL;
                    unification_robot_class = CYBLACK_MONITORING_UNIFICATION_ROBOT;
                    sublisp_throw($sym573$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_monitoring_ks_state_change_listener(self, state_change_listener);
                            set_cyblack_external_monitoring_ks_state_change_listener_class(self, state_change_listener_class);
                            set_cyblack_external_monitoring_ks_action_qualifiers(self, action_qualifiers);
                            set_cyblack_external_monitoring_ks_action(self, action);
                            set_cyblack_basic_knowledge_source_unification_robot_class(self, unification_robot_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym573$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_external_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_set_precondition_pattern_method(SubLObject self, SubLObject new_precondition_pattern) {
        {
            SubLObject catch_var_for_cyblack_external_monitoring_ks_method = NIL;
            SubLObject action_qualifiers = get_cyblack_external_monitoring_ks_action_qualifiers(self);
            SubLObject action = get_cyblack_external_monitoring_ks_action(self);
            try {
                try {
                    if (new_precondition_pattern.isCons()) {
                        {
                            SubLObject third_element = nth(TWO_INTEGER, new_precondition_pattern);
                            action = third_element;
                        }
                        {
                            SubLObject fourth_element = nth(THREE_INTEGER, new_precondition_pattern);
                            if (NIL != cyblack_precondition_pattern.cyblack_monitoring_pattern_action_qualifier_type_p(fourth_element)) {
                                action_qualifiers = list(fourth_element);
                            } else {
                                action_qualifiers = copy_list(fourth_element);
                            }
                        }
                        sublisp_throw($sym576$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, cyblack_external_knowledge_source_set_precondition_pattern_method(self, new_precondition_pattern));
                    } else
                        if (NIL != cyblack_precondition_pattern.cyblack_monitoring_pattern_p(new_precondition_pattern)) {
                            action = cyblack_precondition_pattern.cyblack_monitoring_pattern_get_action_method(new_precondition_pattern);
                            action_qualifiers = copy_tree(cyblack_precondition_pattern.cyblack_monitoring_pattern_get_action_qualifiers_method(new_precondition_pattern));
                            sublisp_throw($sym576$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, cyblack_external_knowledge_source_set_precondition_pattern_method(self, new_precondition_pattern));
                        } else {
                            Errors.error($str_alt369$_SET_PRECONDITION_PATTERN__S____S, self, new_precondition_pattern);
                        }

                    sublisp_throw($sym576$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_monitoring_ks_action_qualifiers(self, action_qualifiers);
                            set_cyblack_external_monitoring_ks_action(self, action);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym576$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_external_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_get_state_change_listener_class_method(SubLObject self) {
        {
            SubLObject state_change_listener_class = get_cyblack_external_monitoring_ks_state_change_listener_class(self);
            return state_change_listener_class;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_set_state_change_listener_class_method(SubLObject self, SubLObject new_class) {
        {
            SubLObject catch_var_for_cyblack_external_monitoring_ks_method = NIL;
            SubLObject state_change_listener_class = get_cyblack_external_monitoring_ks_state_change_listener_class(self);
            try {
                try {
                    state_change_listener_class = new_class;
                    sublisp_throw($sym579$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, new_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_monitoring_ks_state_change_listener_class(self, state_change_listener_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym579$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_external_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_get_state_change_listener_method(SubLObject self) {
        {
            SubLObject state_change_listener = get_cyblack_external_monitoring_ks_state_change_listener(self);
            return state_change_listener;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_set_state_change_listener_method(SubLObject self, SubLObject new_state_change_listener) {
        {
            SubLObject catch_var_for_cyblack_external_monitoring_ks_method = NIL;
            SubLObject state_change_listener = get_cyblack_external_monitoring_ks_state_change_listener(self);
            try {
                try {
                    state_change_listener = new_state_change_listener;
                    sublisp_throw($sym583$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, new_state_change_listener);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_monitoring_ks_state_change_listener(self, state_change_listener);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym583$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_external_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_get_action_method(SubLObject self) {
        {
            SubLObject action = get_cyblack_external_monitoring_ks_action(self);
            return action;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_set_action_method(SubLObject self, SubLObject new_action) {
        {
            SubLObject catch_var_for_cyblack_external_monitoring_ks_method = NIL;
            SubLObject action = get_cyblack_external_monitoring_ks_action(self);
            try {
                try {
                    action = new_action;
                    sublisp_throw($sym586$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, new_action);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_monitoring_ks_action(self, action);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym586$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_external_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_get_action_qualifiers_method(SubLObject self) {
        {
            SubLObject action_qualifiers = get_cyblack_external_monitoring_ks_action_qualifiers(self);
            return action_qualifiers;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_set_action_qualifiers_method(SubLObject self, SubLObject new_action_qualifiers) {
        {
            SubLObject catch_var_for_cyblack_external_monitoring_ks_method = NIL;
            SubLObject action_qualifiers = get_cyblack_external_monitoring_ks_action_qualifiers(self);
            try {
                try {
                    action_qualifiers = new_action_qualifiers;
                    sublisp_throw($sym589$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, new_action_qualifiers);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_monitoring_ks_action_qualifiers(self, action_qualifiers);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym589$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_external_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_gather_all_postings_method(SubLObject self, SubLObject datatype) {
        {
            SubLObject catch_var_for_cyblack_external_monitoring_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if ((NIL != datatype) && (NIL != application)) {
                        {
                            SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                            if (NIL != blackboard) {
                                {
                                    SubLObject panel = cyblack_datatype.cyblack_datatype_get_panel(datatype, blackboard, UNPROVIDED);
                                    sublisp_throw($sym591$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, cyblack_panel_dispatch_functions.cyblack_panel_get_all_postings(panel));
                                }
                            }
                        }
                    }
                    sublisp_throw($sym591$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, NIL);
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
                catch_var_for_cyblack_external_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym591$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_external_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_gather_all_direct_postings_method(SubLObject self, SubLObject datatype) {
        {
            SubLObject catch_var_for_cyblack_external_monitoring_ks_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    if ((NIL != datatype) && (NIL != application)) {
                        {
                            SubLObject blackboard = cyblack_application.cyblack_application_get_blackboard(application);
                            if (NIL != blackboard) {
                                {
                                    SubLObject panel = cyblack_datatype.cyblack_datatype_get_panel(datatype, blackboard, UNPROVIDED);
                                    sublisp_throw($sym593$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, cyblack_panel_dispatch_functions.cyblack_panel_get_direct_postings(panel));
                                }
                            }
                        }
                    }
                    sublisp_throw($sym593$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD, NIL);
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
                catch_var_for_cyblack_external_monitoring_ks_method = Errors.handleThrowable(ccatch_env_var, $sym593$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD);
            }
            return catch_var_for_cyblack_external_monitoring_ks_method;
        }
    }

    public static final SubLObject cyblack_external_monitoring_ks_on_startup_method(SubLObject self) {
        cyblack_external_knowledge_source_on_startup_method(self);
        {
            SubLObject state_change_listener_class = cyblack_external_monitoring_ks_get_state_change_listener_class_method(self);
            SubLObject state_change_listener = cyblack_external_monitoring_ks_get_state_change_listener_method(self);
            if (NIL == state_change_listener) {
                state_change_listener = object.new_object_instance(NIL != state_change_listener_class ? ((SubLObject) (state_change_listener_class)) : CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER);
                cyblack_external_monitoring_ks_set_state_change_listener_method(self, state_change_listener);
            }
            cyblack_object.set_cyblack_object_application(state_change_listener, cyblack_basic_knowledge_source_get_application_method(self));
            cyblack_state_change_listener.cyblack_basic_state_change_listener_set_knowledge_source_method(state_change_listener, self);
            return NIL;
        }
    }

    public static final SubLObject check_stimulation_function_definition(SubLObject function_name, SubLObject lambda_list) {
        cyblack_utilities.cyblack_silence(lambda_list);
        cyblack_utilities.cyblack_silence(function_name);
        return T;
    }

    public static final SubLObject def_stimulation_function(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject stimulation_function_name = NIL;
            SubLObject lambda_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt597);
            stimulation_function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt597);
            lambda_list = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                check_stimulation_function_definition(stimulation_function_name, lambda_list);
                return listS(DEFINE_PUBLIC, stimulation_function_name, lambda_list, body);
            }
        }
    }

    public static final SubLObject check_post_proposal_function_definition(SubLObject function_name, SubLObject lambda_list) {
        cyblack_utilities.cyblack_silence(lambda_list);
        cyblack_utilities.cyblack_silence(function_name);
        return T;
    }

    public static final SubLObject def_post_proposal_function(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject post_proposal_function_name = NIL;
            SubLObject lambda_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt599);
            post_proposal_function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt599);
            lambda_list = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                check_post_proposal_function_definition(post_proposal_function_name, lambda_list);
                return listS(DEFINE_PUBLIC, post_proposal_function_name, lambda_list, body);
            }
        }
    }

    public static final SubLObject check_generate_ksi_function_definition(SubLObject function_name, SubLObject lambda_list) {
        cyblack_utilities.cyblack_silence(lambda_list);
        cyblack_utilities.cyblack_silence(function_name);
        return T;
    }

    public static final SubLObject def_generate_ksi_function(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject generate_ksi_function_name = NIL;
            SubLObject lambda_list = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt600);
            generate_ksi_function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt600);
            lambda_list = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                check_generate_ksi_function_definition(generate_ksi_function_name, lambda_list);
                return listS(DEFINE_PUBLIC, generate_ksi_function_name, lambda_list, body);
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_knowledge_source_list_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_knowledge_source_list_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_DOUBLY_LINKED_LIST, LAST_LINK, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_knowledge_source_list_p(SubLObject cyblack_basic_knowledge_source_list) {
        return classes.subloop_instanceof_class(cyblack_basic_knowledge_source_list, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST);
    }

    public static final SubLObject cyblack_basic_knowledge_source_list_initialize_method(SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static final SubLObject cyblack_basic_knowledge_source_list_set_contents_method(SubLObject self, SubLObject new_contents) {
        return subloop_collections.basic_doubly_linked_list_set_contents_method(self, new_contents);
    }

    public static final SubLObject cyblack_basic_knowledge_source_list_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(self);
            if (NIL == template_enumerator) {
                format(stream, $str_alt619$___S_Class_is_not_correctly_imple, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST);
                return self;
            } else
                if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
                    format(stream, $str_alt620$KS_LIST__);
                } else {
                    format(stream, $str_alt621$KS_LIST__S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
                    while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                        format(stream, $str_alt622$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
                    } 
                    format(stream, $str_alt623$_);
                }

            subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(self, template_enumerator);
            return self;
        }
    }

    public static final SubLObject cyblack_basic_knowledge_source_list_add_method(SubLObject self, SubLObject new_element) {
        return subloop_collections.basic_doubly_linked_list_add_method(self, new_element);
    }

    public static final SubLObject cyblack_basic_knowledge_source_list_remove_method(SubLObject self, SubLObject old_element) {
        return subloop_collections.basic_doubly_linked_list_remove_method(self, old_element);
    }

    public static final SubLObject cyblack_basic_knowledge_source_list_member_p_method(SubLObject self, SubLObject element) {
        return subloop_collections.basic_doubly_linked_list_member_p_method(self, element);
    }

    public static final SubLObject cyblack_basic_knowledge_source_list_push_method(SubLObject self, SubLObject new_element) {
        return subloop_collections.basic_doubly_linked_list_push_method(self, new_element);
    }

    public static final SubLObject cyblack_basic_knowledge_source_list_set_nth_method(SubLObject self, SubLObject index, SubLObject new_element) {
        return subloop_collections.basic_doubly_linked_list_set_nth_method(self, index, new_element);
    }

    public static final SubLObject cyblack_basic_knowledge_source_list_position_method(SubLObject self, SubLObject element) {
        return subloop_collections.basic_doubly_linked_list_position_method(self, element);
    }

    public static final SubLObject cyblack_basic_knowledge_source_list_append_method(SubLObject self, SubLObject other_list) {
        return subloop_collections.basic_doubly_linked_list_append_method(self, other_list);
    }

    public static final SubLObject cyblack_ks_visitor_p(SubLObject cyblack_ks_visitor) {
        return interfaces.subloop_instanceof_interface(cyblack_ks_visitor, CYBLACK_KS_VISITOR);
    }

    public static final SubLObject get_cyblack_basic_ks_visitor_continue(SubLObject cyblack_basic_ks_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_ks_visitor, THREE_INTEGER, CONTINUE);
    }

    public static final SubLObject set_cyblack_basic_ks_visitor_continue(SubLObject cyblack_basic_ks_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_ks_visitor, value, THREE_INTEGER, CONTINUE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_ks_visitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_ks_visitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KS_VISITOR, CONTINUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_ks_visitor_p(SubLObject cyblack_basic_ks_visitor) {
        return classes.subloop_instanceof_class(cyblack_basic_ks_visitor, CYBLACK_BASIC_KS_VISITOR);
    }

    public static final SubLObject cyblack_basic_ks_visitor_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_ks_visitor_method = NIL;
            SubLObject v_continue = get_cyblack_basic_ks_visitor_continue(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    v_continue = T;
                    sublisp_throw($sym661$OUTER_CATCH_FOR_CYBLACK_BASIC_KS_VISITOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_ks_visitor_continue(self, v_continue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ks_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym661$OUTER_CATCH_FOR_CYBLACK_BASIC_KS_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_ks_visitor_method;
        }
    }

    public static final SubLObject cyblack_basic_ks_visitor_clone_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_ks_visitor_method = NIL;
            SubLObject v_continue = get_cyblack_basic_ks_visitor_continue(self);
            try {
                try {
                    {
                        SubLObject new_ks_visitor = object.object_clone_method(self);
                        instances.set_slot(new_ks_visitor, CONTINUE, v_continue);
                        sublisp_throw($sym665$OUTER_CATCH_FOR_CYBLACK_BASIC_KS_VISITOR_METHOD, new_ks_visitor);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_ks_visitor_continue(self, v_continue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ks_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym665$OUTER_CATCH_FOR_CYBLACK_BASIC_KS_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_ks_visitor_method;
        }
    }

    public static final SubLObject cyblack_basic_ks_visitor_set_initial_state_method(SubLObject self, SubLObject new_application, SubLObject new_state1, SubLObject new_state2) {
        if (new_state1 == UNPROVIDED) {
            new_state1 = NIL;
        }
        if (new_state2 == UNPROVIDED) {
            new_state2 = NIL;
        }
        cyblack_object.cyblack_object_set_application_method(self, new_application);
        return self;
    }

    public static final SubLObject cyblack_basic_ks_visitor_visit_method(SubLObject self, SubLObject v_cyblack_ks) {
        return v_cyblack_ks;
    }

    public static final SubLObject cyblack_basic_ks_visitor_continue_p_method(SubLObject self, SubLObject v_cyblack_ks) {
        if (v_cyblack_ks == UNPROVIDED) {
            v_cyblack_ks = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_basic_ks_visitor_method = NIL;
            SubLObject v_continue = get_cyblack_basic_ks_visitor_continue(self);
            try {
                try {
                    sublisp_throw($sym678$OUTER_CATCH_FOR_CYBLACK_BASIC_KS_VISITOR_METHOD, v_continue);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_ks_visitor_continue(self, v_continue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ks_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym678$OUTER_CATCH_FOR_CYBLACK_BASIC_KS_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_ks_visitor_method;
        }
    }

    public static final SubLObject cyblack_basic_ks_visitor_get_final_state_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject get_cyblack_state_change_ks_visitor_event_type(SubLObject cyblack_state_change_ks_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_state_change_ks_visitor, SIX_INTEGER, EVENT_TYPE);
    }

    public static final SubLObject set_cyblack_state_change_ks_visitor_event_type(SubLObject cyblack_state_change_ks_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_state_change_ks_visitor, value, SIX_INTEGER, EVENT_TYPE);
    }

    public static final SubLObject get_cyblack_state_change_ks_visitor_posting(SubLObject cyblack_state_change_ks_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_state_change_ks_visitor, FIVE_INTEGER, POSTING);
    }

    public static final SubLObject set_cyblack_state_change_ks_visitor_posting(SubLObject cyblack_state_change_ks_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_state_change_ks_visitor, value, FIVE_INTEGER, POSTING);
    }

    public static final SubLObject get_cyblack_state_change_ks_visitor_panel(SubLObject cyblack_state_change_ks_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_state_change_ks_visitor, FOUR_INTEGER, PANEL);
    }

    public static final SubLObject set_cyblack_state_change_ks_visitor_panel(SubLObject cyblack_state_change_ks_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_state_change_ks_visitor, value, FOUR_INTEGER, PANEL);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_state_change_ks_visitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_state_change_ks_visitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_KS_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_STATE_CHANGE_KS_VISITOR, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_STATE_CHANGE_KS_VISITOR, POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_STATE_CHANGE_KS_VISITOR, EVENT_TYPE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_state_change_ks_visitor_p(SubLObject cyblack_state_change_ks_visitor) {
        return classes.subloop_instanceof_class(cyblack_state_change_ks_visitor, CYBLACK_STATE_CHANGE_KS_VISITOR);
    }

    public static final SubLObject cyblack_state_change_ks_visitor_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_state_change_ks_visitor_method = NIL;
            SubLObject event_type = get_cyblack_state_change_ks_visitor_event_type(self);
            SubLObject posting = get_cyblack_state_change_ks_visitor_posting(self);
            try {
                try {
                    cyblack_basic_ks_visitor_initialize_method(self);
                    posting = NIL;
                    event_type = NIL;
                    sublisp_throw($sym690$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_state_change_ks_visitor_event_type(self, event_type);
                            set_cyblack_state_change_ks_visitor_posting(self, posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_state_change_ks_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym690$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_state_change_ks_visitor_method;
        }
    }

    public static final SubLObject cyblack_state_change_ks_visitor_get_panel_method(SubLObject self) {
        {
            SubLObject panel = get_cyblack_state_change_ks_visitor_panel(self);
            return panel;
        }
    }

    public static final SubLObject cyblack_state_change_ks_visitor_set_panel_method(SubLObject self, SubLObject new_panel) {
        {
            SubLObject catch_var_for_cyblack_state_change_ks_visitor_method = NIL;
            SubLObject panel = get_cyblack_state_change_ks_visitor_panel(self);
            try {
                try {
                    panel = new_panel;
                    sublisp_throw($sym697$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD, new_panel);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_state_change_ks_visitor_panel(self, panel);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_state_change_ks_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym697$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_state_change_ks_visitor_method;
        }
    }

    public static final SubLObject cyblack_state_change_ks_visitor_clone_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_state_change_ks_visitor_method = NIL;
            SubLObject event_type = get_cyblack_state_change_ks_visitor_event_type(self);
            SubLObject posting = get_cyblack_state_change_ks_visitor_posting(self);
            try {
                try {
                    {
                        SubLObject new_visitor = cyblack_basic_ks_visitor_clone_method(self);
                        instances.set_slot(self, POSTING, posting);
                        instances.set_slot(self, EVENT_TYPE, event_type);
                        sublisp_throw($sym700$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD, new_visitor);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_state_change_ks_visitor_event_type(self, event_type);
                            set_cyblack_state_change_ks_visitor_posting(self, posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_state_change_ks_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym700$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_state_change_ks_visitor_method;
        }
    }

    public static final SubLObject cyblack_state_change_ks_visitor_set_initial_state_method(SubLObject self, SubLObject new_application, SubLObject new_state1, SubLObject new_state2) {
        if (new_state1 == UNPROVIDED) {
            new_state1 = NIL;
        }
        if (new_state2 == UNPROVIDED) {
            new_state2 = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_state_change_ks_visitor_method = NIL;
            SubLObject event_type = get_cyblack_state_change_ks_visitor_event_type(self);
            SubLObject posting = get_cyblack_state_change_ks_visitor_posting(self);
            try {
                try {
                    cyblack_basic_ks_visitor_set_initial_state_method(self, new_application, UNPROVIDED, UNPROVIDED);
                    posting = new_state1;
                    event_type = new_state2;
                    sublisp_throw($sym703$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_state_change_ks_visitor_event_type(self, event_type);
                            set_cyblack_state_change_ks_visitor_posting(self, posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_state_change_ks_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym703$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_state_change_ks_visitor_method;
        }
    }

    public static final SubLObject cyblack_state_change_ks_visitor_visit_method(SubLObject self, SubLObject v_cyblack_ks) {
        {
            SubLObject catch_var_for_cyblack_state_change_ks_visitor_method = NIL;
            SubLObject event_type = get_cyblack_state_change_ks_visitor_event_type(self);
            SubLObject posting = get_cyblack_state_change_ks_visitor_posting(self);
            SubLObject panel = get_cyblack_state_change_ks_visitor_panel(self);
            try {
                try {
                    if ((NIL != v_cyblack_ks) && (NIL != cyblack_monitoring_ks_p(v_cyblack_ks))) {
                        {
                            SubLObject action = cyblack_ks_dispatch_functions.cyblack_mks_get_action(v_cyblack_ks);
                            SubLObject action_qualifiers = cyblack_ks_dispatch_functions.cyblack_mks_get_action_qualifiers(v_cyblack_ks);
                            SubLObject state_change_listener = NIL;
                            SubLObject pcase_var = action;
                            if (pcase_var.eql($SEND)) {
                                {
                                    SubLObject pcase_var_6 = event_type;
                                    if (pcase_var_6.eql($POST)) {
                                        {
                                            SubLObject contents = NIL;
                                            SubLObject postings = NIL;
                                            SubLObject cdolist_list_var = action_qualifiers;
                                            SubLObject qualifier = NIL;
                                            for (qualifier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , qualifier = cdolist_list_var.first()) {
                                                {
                                                    SubLObject pcase_var_7 = qualifier;
                                                    if (pcase_var_7.eql($ALL_POSTINGS)) {
                                                        postings = cyblack_panel_dispatch_functions.cyblack_panel_get_all_postings(panel);
                                                    } else
                                                        if (pcase_var_7.eql($ALL_DIRECT_POSTINGS)) {
                                                            postings = cyblack_panel_dispatch_functions.cyblack_panel_get_direct_postings(panel);
                                                        } else
                                                            if (pcase_var_7.eql($NEW_POSTING)) {
                                                                postings = list(posting);
                                                            } else
                                                                if (pcase_var_7.eql($NEW_DIRECT_POSTING)) {
                                                                    if (cyblack_posting_dispatch_functions.cyblack_posting_get_panel(posting) == panel) {
                                                                        postings = list(posting);
                                                                    } else {
                                                                        postings = NIL;
                                                                    }
                                                                } else
                                                                    if (pcase_var_7.eql($ADDED_OR_INACTIVATED_POSTING)) {
                                                                        postings = list(posting);
                                                                    } else
                                                                        if (pcase_var_7.eql($ADDED_OR_INACTIVATED_DIRECT_POSTING)) {
                                                                            if (cyblack_posting_dispatch_functions.cyblack_posting_get_panel(posting) == panel) {
                                                                                postings = list(posting);
                                                                            } else {
                                                                                postings = NIL;
                                                                            }
                                                                        }





                                                }
                                                contents = union(contents, postings, UNPROVIDED, UNPROVIDED);
                                            }
                                            state_change_listener = cyblack_ks_dispatch_functions.cyblack_mks_get_state_change_listener(v_cyblack_ks);
                                            if (NIL != state_change_listener) {
                                                methods.funcall_instance_method_with_2_args(state_change_listener, TRANSMIT_STATE_CHANGE, $POST, contents);
                                            }
                                        }
                                    } else
                                        if (pcase_var_6.eql($REMOVE_POST)) {
                                            {
                                                SubLObject contents = NIL;
                                                SubLObject postings = NIL;
                                                SubLObject cdolist_list_var = action_qualifiers;
                                                SubLObject qualifier = NIL;
                                                for (qualifier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , qualifier = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject pcase_var_8 = qualifier;
                                                        if (pcase_var_8.eql($ADDED_OR_INACTIVATED_POSTING)) {
                                                            postings = list(posting);
                                                        } else
                                                            if (pcase_var_8.eql($ADDED_OR_INACTIVATED_DIRECT_POSTING)) {
                                                                if (cyblack_posting_dispatch_functions.cyblack_posting_get_panel(posting) == panel) {
                                                                    postings = list(posting);
                                                                } else {
                                                                    postings = NIL;
                                                                }
                                                            }

                                                    }
                                                    contents = union(contents, postings, UNPROVIDED, UNPROVIDED);
                                                }
                                                state_change_listener = cyblack_ks_dispatch_functions.cyblack_mks_get_state_change_listener(v_cyblack_ks);
                                                if (NIL != state_change_listener) {
                                                    methods.funcall_instance_method_with_2_args(state_change_listener, TRANSMIT_STATE_CHANGE, $REMOVE_POST, contents);
                                                }
                                            }
                                        }

                                }
                            }
                        }
                    }
                    sublisp_throw($sym706$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_state_change_ks_visitor_event_type(self, event_type);
                            set_cyblack_state_change_ks_visitor_posting(self, posting);
                            set_cyblack_state_change_ks_visitor_panel(self, panel);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_state_change_ks_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym706$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_state_change_ks_visitor_method;
        }
    }

    public static final SubLObject declare_cyblack_ks_file() {
        declareFunction("cyblack_knowledge_source_p", "CYBLACK-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("get_cyblack_proto_knowledge_source_knowledge_source_battery", "GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-KNOWLEDGE-SOURCE-BATTERY", 1, 0, false);
        declareFunction("set_cyblack_proto_knowledge_source_knowledge_source_battery", "SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-KNOWLEDGE-SOURCE-BATTERY", 2, 0, false);
        declareFunction("get_cyblack_proto_knowledge_source_author_names", "GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-AUTHOR-NAMES", 1, 0, false);
        declareFunction("set_cyblack_proto_knowledge_source_author_names", "SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-AUTHOR-NAMES", 2, 0, false);
        declareFunction("get_cyblack_proto_knowledge_source_qua_list_element_parent_links", "GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-QUA-LIST-ELEMENT-PARENT-LINKS", 1, 0, false);
        declareFunction("set_cyblack_proto_knowledge_source_qua_list_element_parent_links", "SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-QUA-LIST-ELEMENT-PARENT-LINKS", 2, 0, false);
        declareFunction("get_cyblack_proto_knowledge_source_remove_knowledge_sources_at_will", "GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-REMOVE-KNOWLEDGE-SOURCES-AT-WILL", 1, 0, false);
        declareFunction("set_cyblack_proto_knowledge_source_remove_knowledge_sources_at_will", "SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-REMOVE-KNOWLEDGE-SOURCES-AT-WILL", 2, 0, false);
        declareFunction("get_cyblack_proto_knowledge_source_add_knowledge_sources_at_will", "GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-KNOWLEDGE-SOURCES-AT-WILL", 1, 0, false);
        declareFunction("set_cyblack_proto_knowledge_source_add_knowledge_sources_at_will", "SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-KNOWLEDGE-SOURCES-AT-WILL", 2, 0, false);
        declareFunction("get_cyblack_proto_knowledge_source_add_posting_classes_at_will", "GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-POSTING-CLASSES-AT-WILL", 1, 0, false);
        declareFunction("set_cyblack_proto_knowledge_source_add_posting_classes_at_will", "SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-POSTING-CLASSES-AT-WILL", 2, 0, false);
        declareFunction("get_cyblack_proto_knowledge_source_remove_panels_at_will", "GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-REMOVE-PANELS-AT-WILL", 1, 0, false);
        declareFunction("set_cyblack_proto_knowledge_source_remove_panels_at_will", "SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-REMOVE-PANELS-AT-WILL", 2, 0, false);
        declareFunction("get_cyblack_proto_knowledge_source_add_panels_at_will", "GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-PANELS-AT-WILL", 1, 0, false);
        declareFunction("set_cyblack_proto_knowledge_source_add_panels_at_will", "SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-PANELS-AT-WILL", 2, 0, false);
        declareFunction("get_cyblack_proto_knowledge_source_post_at_will", "GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-POST-AT-WILL", 1, 0, false);
        declareFunction("set_cyblack_proto_knowledge_source_post_at_will", "SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-POST-AT-WILL", 2, 0, false);
        declareFunction("get_cyblack_proto_knowledge_source_is_a_monitor", "GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-IS-A-MONITOR", 1, 0, false);
        declareFunction("set_cyblack_proto_knowledge_source_is_a_monitor", "SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-IS-A-MONITOR", 2, 0, false);
        declareFunction("get_cyblack_proto_knowledge_source_qua_list_element_self_deletion_mode", "GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 1, 0, false);
        declareFunction("set_cyblack_proto_knowledge_source_qua_list_element_self_deletion_mode", "SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_on_delete_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-ON-DELETE-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_on_add_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-ON-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_get_collections_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-GET-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_member_p_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_delete_self_from_all_collections_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_delete_self_from_collection_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-DELETE-SELF-FROM-COLLECTION-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_delete_parent_link_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-DELETE-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_add_parent_link_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_proto_knowledge_source_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PROTO-KNOWLEDGE-SOURCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_proto_knowledge_source_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PROTO-KNOWLEDGE-SOURCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_p", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_get_parent_links_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-GET-PARENT-LINKS-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_set_parent_links_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-PARENT-LINKS-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_get_self_deletion_mode_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-GET-SELF-DELETION-MODE-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_set_self_deletion_mode_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-SELF-DELETION-MODE-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_get_author_names_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-GET-AUTHOR-NAMES-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_set_author_names_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-AUTHOR-NAMES-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_monitor_p_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-MONITOR-P-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_post_at_will_p_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-POST-AT-WILL-P-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_set_post_at_will_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-POST-AT-WILL-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_add_panels_at_will_p_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-PANELS-AT-WILL-P-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_set_add_panels_at_will_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-ADD-PANELS-AT-WILL-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_remove_panels_at_will_p_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-REMOVE-PANELS-AT-WILL-P-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_get_knowledge_source_battery_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-GET-KNOWLEDGE-SOURCE-BATTERY-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_set_knowledge_source_battery_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-KNOWLEDGE-SOURCE-BATTERY-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_set_remove_panels_at_will_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-REMOVE-PANELS-AT-WILL-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_add_posting_classes_at_will_p_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-POSTING-CLASSES-AT-WILL-P-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_set_add_posting_classes_at_will_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-ADD-POSTING-CLASSES-AT-WILL-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_add_knowledge_sources_at_will_p_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-KNOWLEDGE-SOURCES-AT-WILL-P-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_set_add_knowledge_sources_at_will_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-ADD-KNOWLEDGE-SOURCES-AT-WILL-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_remove_knowledge_sources_at_will_p_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-REMOVE-KNOWLEDGE-SOURCES-AT-WILL-P-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_set_remove_knowledge_sources_at_will_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-REMOVE-KNOWLEDGE-SOURCES-AT-WILL-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_on_activate_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-ON-ACTIVATE-METHOD", 1, 1, false);
        declareFunction("cyblack_proto_knowledge_source_create_proposal_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-CREATE-PROPOSAL-METHOD", 2, 1, false);
        declareFunction("cyblack_proto_knowledge_source_post_proposal_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-POST-PROPOSAL-METHOD", 3, 0, false);
        declareFunction("cyblack_proto_knowledge_source_generate_ksi_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_on_startup_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_on_shutdown_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_link_ksi_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-LINK-KSI-METHOD", 2, 0, false);
        declareFunction("cyblack_proto_knowledge_source_initialize_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_proto_knowledge_source_post_method", "CYBLACK-PROTO-KNOWLEDGE-SOURCE-POST-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_self_motivated_knowledge_source_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SELF-MOTIVATED-KNOWLEDGE-SOURCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_self_motivated_knowledge_source_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SELF-MOTIVATED-KNOWLEDGE-SOURCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_self_motivated_knowledge_source_p", "CYBLACK-SELF-MOTIVATED-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("cyblack_self_motivated_knowledge_source_initialize_method", "CYBLACK-SELF-MOTIVATED-KNOWLEDGE-SOURCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_pattern_based_knowledge_source_p", "CYBLACK-PATTERN-BASED-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("cyblack_panel_linked_pattern_based_knowledge_source_p", "CYBLACK-PANEL-LINKED-PATTERN-BASED-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("cyblack_removal_knowledge_source_p", "CYBLACK-REMOVAL-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_range_set", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-RANGE-SET", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_range_set", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-RANGE-SET", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_cached_domain", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-CACHED-DOMAIN", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_cached_domain", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-CACHED-DOMAIN", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_unification_robot_class", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-UNIFICATION-ROBOT-CLASS", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_unification_robot_class", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-UNIFICATION-ROBOT-CLASS", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_uncompiled_precondition_pattern", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-UNCOMPILED-PRECONDITION-PATTERN", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_uncompiled_precondition_pattern", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-UNCOMPILED-PRECONDITION-PATTERN", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_has_cached_domain_p", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-HAS-CACHED-DOMAIN-P", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_has_cached_domain_p", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-HAS-CACHED-DOMAIN-P", 2, 0, false);
        declareFunction("get_cyblack_basic_knowledge_source_linked_to_panels", "GET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-LINKED-TO-PANELS", 1, 0, false);
        declareFunction("set_cyblack_basic_knowledge_source_linked_to_panels", "SET-CYBLACK-BASIC-KNOWLEDGE-SOURCE-LINKED-TO-PANELS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_knowledge_source_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_knowledge_source_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_p", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_get_precondition_pattern_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-PRECONDITION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_set_precondition_pattern_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-SET-PRECONDITION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_get_precondition_datatypes_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-PRECONDITION-DATATYPES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_stimulate_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-STIMULATE-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_knowledge_source_link_to_panels_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LINK-TO-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_unlink_from_panels_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-UNLINK-FROM-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_linked_to_panels_p_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LINKED-TO-PANELS-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_get_unification_robot_class_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-UNIFICATION-ROBOT-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_set_unification_robot_class_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-SET-UNIFICATION-ROBOT-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_initialize_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_get_application_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_set_application_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_on_startup_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_on_shutdown_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_get_panels_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_get_domain_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-DOMAIN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_get_range_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-RANGE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_internal_knowledge_source_precondition_datatypes", "GET-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-PRECONDITION-DATATYPES", 1, 0, false);
        declareFunction("set_cyblack_internal_knowledge_source_precondition_datatypes", "SET-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-PRECONDITION-DATATYPES", 2, 0, false);
        declareFunction("get_cyblack_internal_knowledge_source_precondition_pattern", "GET-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-PRECONDITION-PATTERN", 1, 0, false);
        declareFunction("set_cyblack_internal_knowledge_source_precondition_pattern", "SET-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-PRECONDITION-PATTERN", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_knowledge_source_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_knowledge_source_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_internal_knowledge_source_p", "CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("cyblack_internal_knowledge_source_initialize_method", "CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_knowledge_source_link_to_panels_method", "CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-LINK-TO-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_knowledge_source_on_startup_method", "CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_knowledge_source_on_shutdown_method", "CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_knowledge_source_get_precondition_pattern_method", "CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-GET-PRECONDITION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_knowledge_source_set_precondition_pattern_method", "CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-SET-PRECONDITION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_knowledge_source_complete_precondition_pattern_method", "CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-COMPLETE-PRECONDITION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_knowledge_source_get_precondition_datatypes_method", "CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-GET-PRECONDITION-DATATYPES-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_constrained_knowledge_source_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-KNOWLEDGE-SOURCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_constrained_knowledge_source_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-KNOWLEDGE-SOURCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_constrained_knowledge_source_p", "CYBLACK-CONSTRAINED-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("cyblack_constrained_knowledge_source_initialize_method", "CYBLACK-CONSTRAINED-KNOWLEDGE-SOURCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_single_match_constrained_knowledge_source_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SINGLE-MATCH-CONSTRAINED-KNOWLEDGE-SOURCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_single_match_constrained_knowledge_source_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SINGLE-MATCH-CONSTRAINED-KNOWLEDGE-SOURCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_single_match_constrained_knowledge_source_p", "CYBLACK-SINGLE-MATCH-CONSTRAINED-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("cyblack_single_match_constrained_knowledge_source_initialize_method", "CYBLACK-SINGLE-MATCH-CONSTRAINED-KNOWLEDGE-SOURCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_monitoring_ks_p", "CYBLACK-MONITORING-KS-P", 1, 0, false);
        declareFunction("get_cyblack_internal_monitoring_ks_state_change_listener", "GET-CYBLACK-INTERNAL-MONITORING-KS-STATE-CHANGE-LISTENER", 1, 0, false);
        declareFunction("set_cyblack_internal_monitoring_ks_state_change_listener", "SET-CYBLACK-INTERNAL-MONITORING-KS-STATE-CHANGE-LISTENER", 2, 0, false);
        declareFunction("get_cyblack_internal_monitoring_ks_state_change_listener_class", "GET-CYBLACK-INTERNAL-MONITORING-KS-STATE-CHANGE-LISTENER-CLASS", 1, 0, false);
        declareFunction("set_cyblack_internal_monitoring_ks_state_change_listener_class", "SET-CYBLACK-INTERNAL-MONITORING-KS-STATE-CHANGE-LISTENER-CLASS", 2, 0, false);
        declareFunction("get_cyblack_internal_monitoring_ks_action_qualifiers", "GET-CYBLACK-INTERNAL-MONITORING-KS-ACTION-QUALIFIERS", 1, 0, false);
        declareFunction("set_cyblack_internal_monitoring_ks_action_qualifiers", "SET-CYBLACK-INTERNAL-MONITORING-KS-ACTION-QUALIFIERS", 2, 0, false);
        declareFunction("get_cyblack_internal_monitoring_ks_action", "GET-CYBLACK-INTERNAL-MONITORING-KS-ACTION", 1, 0, false);
        declareFunction("set_cyblack_internal_monitoring_ks_action", "SET-CYBLACK-INTERNAL-MONITORING-KS-ACTION", 2, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_perform_action_method", "CYBLACK-INTERNAL-MONITORING-KS-PERFORM-ACTION-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_monitoring_ks_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-MONITORING-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_monitoring_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-MONITORING-KS-INSTANCE", 1, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_p", "CYBLACK-INTERNAL-MONITORING-KS-P", 1, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_initialize_method", "CYBLACK-INTERNAL-MONITORING-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_set_precondition_pattern_method", "CYBLACK-INTERNAL-MONITORING-KS-SET-PRECONDITION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_get_state_change_listener_class_method", "CYBLACK-INTERNAL-MONITORING-KS-GET-STATE-CHANGE-LISTENER-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_set_state_change_listener_class_method", "CYBLACK-INTERNAL-MONITORING-KS-SET-STATE-CHANGE-LISTENER-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_get_state_change_listener_method", "CYBLACK-INTERNAL-MONITORING-KS-GET-STATE-CHANGE-LISTENER-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_set_state_change_listener_method", "CYBLACK-INTERNAL-MONITORING-KS-SET-STATE-CHANGE-LISTENER-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_get_action_method", "CYBLACK-INTERNAL-MONITORING-KS-GET-ACTION-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_set_action_method", "CYBLACK-INTERNAL-MONITORING-KS-SET-ACTION-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_get_action_qualifiers_method", "CYBLACK-INTERNAL-MONITORING-KS-GET-ACTION-QUALIFIERS-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_set_action_qualifiers_method", "CYBLACK-INTERNAL-MONITORING-KS-SET-ACTION-QUALIFIERS-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_gather_all_postings_method", "CYBLACK-INTERNAL-MONITORING-KS-GATHER-ALL-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_gather_all_direct_postings_method", "CYBLACK-INTERNAL-MONITORING-KS-GATHER-ALL-DIRECT-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_monitoring_ks_on_startup_method", "CYBLACK-INTERNAL-MONITORING-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("new_external_knowledge_source", "NEW-EXTERNAL-KNOWLEDGE-SOURCE", 0, 5, false);
        declareFunction("get_cyblack_external_knowledge_source_port_id", "GET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-PORT-ID", 1, 0, false);
        declareFunction("set_cyblack_external_knowledge_source_port_id", "SET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-PORT-ID", 2, 0, false);
        declareFunction("get_cyblack_external_knowledge_source_rejection_excuses", "GET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-REJECTION-EXCUSES", 1, 0, false);
        declareFunction("set_cyblack_external_knowledge_source_rejection_excuses", "SET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-REJECTION-EXCUSES", 2, 0, false);
        declareFunction("get_cyblack_external_knowledge_source_guid_as_string", "GET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GUID-AS-STRING", 1, 0, false);
        declareFunction("set_cyblack_external_knowledge_source_guid_as_string", "SET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GUID-AS-STRING", 2, 0, false);
        declareFunction("get_cyblack_external_knowledge_source_invitation_transaction_id", "GET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-INVITATION-TRANSACTION-ID", 1, 0, false);
        declareFunction("set_cyblack_external_knowledge_source_invitation_transaction_id", "SET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-INVITATION-TRANSACTION-ID", 2, 0, false);
        declareFunction("get_cyblack_external_knowledge_source_proposal_class", "GET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("set_cyblack_external_knowledge_source_proposal_class", "SET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-PROPOSAL-CLASS", 2, 0, false);
        declareFunction("get_cyblack_external_knowledge_source_cached_proposal_class", "GET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-CACHED-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("set_cyblack_external_knowledge_source_cached_proposal_class", "SET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-CACHED-PROPOSAL-CLASS", 2, 0, false);
        declareFunction("get_cyblack_external_knowledge_source_cached_message_broker", "GET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-CACHED-MESSAGE-BROKER", 1, 0, false);
        declareFunction("set_cyblack_external_knowledge_source_cached_message_broker", "SET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-CACHED-MESSAGE-BROKER", 2, 0, false);
        declareFunction("get_cyblack_external_knowledge_source_external_knowledge_source", "GET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-EXTERNAL-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction("set_cyblack_external_knowledge_source_external_knowledge_source", "SET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-EXTERNAL-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("get_cyblack_external_knowledge_source_name", "GET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-NAME", 1, 0, false);
        declareFunction("set_cyblack_external_knowledge_source_name", "SET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-NAME", 2, 0, false);
        declareFunction("get_cyblack_external_knowledge_source_rejected", "GET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-REJECTED", 1, 0, false);
        declareFunction("set_cyblack_external_knowledge_source_rejected", "SET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-REJECTED", 2, 0, false);
        declareFunction("get_cyblack_external_knowledge_source_waiting_on_link_callback", "GET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-WAITING-ON-LINK-CALLBACK", 1, 0, false);
        declareFunction("set_cyblack_external_knowledge_source_waiting_on_link_callback", "SET-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-WAITING-ON-LINK-CALLBACK", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_knowledge_source_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_knowledge_source_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_p", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_initialize_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_get_name_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_set_name_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_inflate_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-INFLATE-METHOD", 1, 5, false);
        declareFunction("cyblack_external_knowledge_source_get_proposal_class_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-PROPOSAL-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_set_proposal_class_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-PROPOSAL-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_generate_new_proposal_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GENERATE-NEW-PROPOSAL-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_get_external_knowledge_source_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-EXTERNAL-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_get_precondition_pattern_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-PRECONDITION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_set_precondition_pattern_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-PRECONDITION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_get_precondition_datatypes_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-PRECONDITION-DATATYPES-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_stimulate_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-STIMULATE-METHOD", 1, 1, false);
        declareFunction("cyblack_external_knowledge_source_on_activate_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-ON-ACTIVATE-METHOD", 1, 1, false);
        declareFunction("cyblack_external_knowledge_source_create_proposal_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-CREATE-PROPOSAL-METHOD", 2, 1, false);
        declareFunction("cyblack_external_knowledge_source_create_proposal_callback_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-CREATE-PROPOSAL-CALLBACK-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_get_message_broker_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-MESSAGE-BROKER-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_link_to_panels_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-LINK-TO-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_link_to_panels_internal_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-LINK-TO-PANELS-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_link_to_panels_callback_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-LINK-TO-PANELS-CALLBACK-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_waiting_on_link_callback_p_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-WAITING-ON-LINK-CALLBACK-P-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_set_waiting_on_link_callback_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-WAITING-ON-LINK-CALLBACK-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_get_invitation_transaction_id_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-INVITATION-TRANSACTION-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_set_invitation_transaction_id_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-INVITATION-TRANSACTION-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_rejected_p_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-REJECTED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_set_rejected_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-REJECTED-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_get_rejection_excuses_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-REJECTION-EXCUSES-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_set_rejection_excuses_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-REJECTION-EXCUSES-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_generate_ksi_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GENERATE-KSI-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_get_guid_as_string_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-GUID-AS-STRING-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_set_guid_as_string_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-GUID-AS-STRING-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_get_port_id_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-PORT-ID-METHOD", 1, 0, false);
        declareFunction("cyblack_external_knowledge_source_set_port_id_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-PORT-ID-METHOD", 2, 0, false);
        declareFunction("cyblack_external_knowledge_source_on_startup_method", "CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_constrained_external_knowledge_source_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-EXTERNAL-KNOWLEDGE-SOURCE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_constrained_external_knowledge_source_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-EXTERNAL-KNOWLEDGE-SOURCE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_constrained_external_knowledge_source_p", "CYBLACK-CONSTRAINED-EXTERNAL-KNOWLEDGE-SOURCE-P", 1, 0, false);
        declareFunction("cyblack_constrained_external_knowledge_source_initialize_method", "CYBLACK-CONSTRAINED-EXTERNAL-KNOWLEDGE-SOURCE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_external_monitoring_ks_state_change_listener", "GET-CYBLACK-EXTERNAL-MONITORING-KS-STATE-CHANGE-LISTENER", 1, 0, false);
        declareFunction("set_cyblack_external_monitoring_ks_state_change_listener", "SET-CYBLACK-EXTERNAL-MONITORING-KS-STATE-CHANGE-LISTENER", 2, 0, false);
        declareFunction("get_cyblack_external_monitoring_ks_state_change_listener_class", "GET-CYBLACK-EXTERNAL-MONITORING-KS-STATE-CHANGE-LISTENER-CLASS", 1, 0, false);
        declareFunction("set_cyblack_external_monitoring_ks_state_change_listener_class", "SET-CYBLACK-EXTERNAL-MONITORING-KS-STATE-CHANGE-LISTENER-CLASS", 2, 0, false);
        declareFunction("get_cyblack_external_monitoring_ks_action_qualifiers", "GET-CYBLACK-EXTERNAL-MONITORING-KS-ACTION-QUALIFIERS", 1, 0, false);
        declareFunction("set_cyblack_external_monitoring_ks_action_qualifiers", "SET-CYBLACK-EXTERNAL-MONITORING-KS-ACTION-QUALIFIERS", 2, 0, false);
        declareFunction("get_cyblack_external_monitoring_ks_action", "GET-CYBLACK-EXTERNAL-MONITORING-KS-ACTION", 1, 0, false);
        declareFunction("set_cyblack_external_monitoring_ks_action", "SET-CYBLACK-EXTERNAL-MONITORING-KS-ACTION", 2, 0, false);
        declareFunction("cyblack_external_monitoring_ks_perform_action_method", "CYBLACK-EXTERNAL-MONITORING-KS-PERFORM-ACTION-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_monitoring_ks_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MONITORING-KS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_monitoring_ks_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MONITORING-KS-INSTANCE", 1, 0, false);
        declareFunction("cyblack_external_monitoring_ks_p", "CYBLACK-EXTERNAL-MONITORING-KS-P", 1, 0, false);
        declareFunction("cyblack_external_monitoring_ks_initialize_method", "CYBLACK-EXTERNAL-MONITORING-KS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_monitoring_ks_set_precondition_pattern_method", "CYBLACK-EXTERNAL-MONITORING-KS-SET-PRECONDITION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_external_monitoring_ks_get_state_change_listener_class_method", "CYBLACK-EXTERNAL-MONITORING-KS-GET-STATE-CHANGE-LISTENER-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_external_monitoring_ks_set_state_change_listener_class_method", "CYBLACK-EXTERNAL-MONITORING-KS-SET-STATE-CHANGE-LISTENER-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_external_monitoring_ks_get_state_change_listener_method", "CYBLACK-EXTERNAL-MONITORING-KS-GET-STATE-CHANGE-LISTENER-METHOD", 1, 0, false);
        declareFunction("cyblack_external_monitoring_ks_set_state_change_listener_method", "CYBLACK-EXTERNAL-MONITORING-KS-SET-STATE-CHANGE-LISTENER-METHOD", 2, 0, false);
        declareFunction("cyblack_external_monitoring_ks_get_action_method", "CYBLACK-EXTERNAL-MONITORING-KS-GET-ACTION-METHOD", 1, 0, false);
        declareFunction("cyblack_external_monitoring_ks_set_action_method", "CYBLACK-EXTERNAL-MONITORING-KS-SET-ACTION-METHOD", 2, 0, false);
        declareFunction("cyblack_external_monitoring_ks_get_action_qualifiers_method", "CYBLACK-EXTERNAL-MONITORING-KS-GET-ACTION-QUALIFIERS-METHOD", 1, 0, false);
        declareFunction("cyblack_external_monitoring_ks_set_action_qualifiers_method", "CYBLACK-EXTERNAL-MONITORING-KS-SET-ACTION-QUALIFIERS-METHOD", 2, 0, false);
        declareFunction("cyblack_external_monitoring_ks_gather_all_postings_method", "CYBLACK-EXTERNAL-MONITORING-KS-GATHER-ALL-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_external_monitoring_ks_gather_all_direct_postings_method", "CYBLACK-EXTERNAL-MONITORING-KS-GATHER-ALL-DIRECT-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_external_monitoring_ks_on_startup_method", "CYBLACK-EXTERNAL-MONITORING-KS-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("check_stimulation_function_definition", "CHECK-STIMULATION-FUNCTION-DEFINITION", 2, 0, false);
        declareMacro("def_stimulation_function", "DEF-STIMULATION-FUNCTION");
        declareFunction("check_post_proposal_function_definition", "CHECK-POST-PROPOSAL-FUNCTION-DEFINITION", 2, 0, false);
        declareMacro("def_post_proposal_function", "DEF-POST-PROPOSAL-FUNCTION");
        declareFunction("check_generate_ksi_function_definition", "CHECK-GENERATE-KSI-FUNCTION-DEFINITION", 2, 0, false);
        declareMacro("def_generate_ksi_function", "DEF-GENERATE-KSI-FUNCTION");
        declareFunction("subloop_reserved_initialize_cyblack_basic_knowledge_source_list_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_knowledge_source_list_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_list_p", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-P", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_list_initialize_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_knowledge_source_list_set_contents_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_list_print_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_knowledge_source_list_add_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_list_remove_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-REMOVE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_list_member_p_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_list_push_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-PUSH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_list_set_nth_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-SET-NTH-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_knowledge_source_list_position_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-POSITION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_knowledge_source_list_append_method", "CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-APPEND-METHOD", 2, 0, false);
        declareFunction("cyblack_ks_visitor_p", "CYBLACK-KS-VISITOR-P", 1, 0, false);
        declareFunction("get_cyblack_basic_ks_visitor_continue", "GET-CYBLACK-BASIC-KS-VISITOR-CONTINUE", 1, 0, false);
        declareFunction("set_cyblack_basic_ks_visitor_continue", "SET-CYBLACK-BASIC-KS-VISITOR-CONTINUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_ks_visitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KS-VISITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_ks_visitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KS-VISITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_ks_visitor_p", "CYBLACK-BASIC-KS-VISITOR-P", 1, 0, false);
        declareFunction("cyblack_basic_ks_visitor_initialize_method", "CYBLACK-BASIC-KS-VISITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_ks_visitor_clone_method", "CYBLACK-BASIC-KS-VISITOR-CLONE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_ks_visitor_set_initial_state_method", "CYBLACK-BASIC-KS-VISITOR-SET-INITIAL-STATE-METHOD", 2, 2, false);
        declareFunction("cyblack_basic_ks_visitor_visit_method", "CYBLACK-BASIC-KS-VISITOR-VISIT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_ks_visitor_continue_p_method", "CYBLACK-BASIC-KS-VISITOR-CONTINUE-P-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_ks_visitor_get_final_state_method", "CYBLACK-BASIC-KS-VISITOR-GET-FINAL-STATE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_state_change_ks_visitor_event_type", "GET-CYBLACK-STATE-CHANGE-KS-VISITOR-EVENT-TYPE", 1, 0, false);
        declareFunction("set_cyblack_state_change_ks_visitor_event_type", "SET-CYBLACK-STATE-CHANGE-KS-VISITOR-EVENT-TYPE", 2, 0, false);
        declareFunction("get_cyblack_state_change_ks_visitor_posting", "GET-CYBLACK-STATE-CHANGE-KS-VISITOR-POSTING", 1, 0, false);
        declareFunction("set_cyblack_state_change_ks_visitor_posting", "SET-CYBLACK-STATE-CHANGE-KS-VISITOR-POSTING", 2, 0, false);
        declareFunction("get_cyblack_state_change_ks_visitor_panel", "GET-CYBLACK-STATE-CHANGE-KS-VISITOR-PANEL", 1, 0, false);
        declareFunction("set_cyblack_state_change_ks_visitor_panel", "SET-CYBLACK-STATE-CHANGE-KS-VISITOR-PANEL", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_state_change_ks_visitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STATE-CHANGE-KS-VISITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_state_change_ks_visitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STATE-CHANGE-KS-VISITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_state_change_ks_visitor_p", "CYBLACK-STATE-CHANGE-KS-VISITOR-P", 1, 0, false);
        declareFunction("cyblack_state_change_ks_visitor_initialize_method", "CYBLACK-STATE-CHANGE-KS-VISITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_state_change_ks_visitor_get_panel_method", "CYBLACK-STATE-CHANGE-KS-VISITOR-GET-PANEL-METHOD", 1, 0, false);
        declareFunction("cyblack_state_change_ks_visitor_set_panel_method", "CYBLACK-STATE-CHANGE-KS-VISITOR-SET-PANEL-METHOD", 2, 0, false);
        declareFunction("cyblack_state_change_ks_visitor_clone_method", "CYBLACK-STATE-CHANGE-KS-VISITOR-CLONE-METHOD", 1, 0, false);
        declareFunction("cyblack_state_change_ks_visitor_set_initial_state_method", "CYBLACK-STATE-CHANGE-KS-VISITOR-SET-INITIAL-STATE-METHOD", 2, 2, false);
        declareFunction("cyblack_state_change_ks_visitor_visit_method", "CYBLACK-STATE-CHANGE-KS-VISITOR-VISIT-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_ks_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_ks_file() {
                interfaces.new_interface(CYBLACK_KNOWLEDGE_SOURCE, $list_alt1, $list_alt2, $list_alt3);
        classes.subloop_new_class(CYBLACK_PROTO_KNOWLEDGE_SOURCE, CYBLACK_BASIC_LOCKABLE, $list_alt6, NIL, $list_alt7);
        classes.class_set_implements_slot_listeners(CYBLACK_PROTO_KNOWLEDGE_SOURCE, NIL);
        methods.methods_incorporate_instance_method(ON_DELETE, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt29, $list_alt30);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, ON_DELETE, CYBLACK_PROTO_KNOWLEDGE_SOURCE_ON_DELETE_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt29, $list_alt30);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, ON_ADD, CYBLACK_PROTO_KNOWLEDGE_SOURCE_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_COLLECTIONS, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, GET_COLLECTIONS, CYBLACK_PROTO_KNOWLEDGE_SOURCE_GET_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt38, $list_alt39);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, MEMBER_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_ALL_COLLECTIONS, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt42);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, DELETE_SELF_FROM_ALL_COLLECTIONS, $sym43$CYBLACK_PROTO_KNOWLEDGE_SOURCE_DELETE_SELF_FROM_ALL_COLLECTIONS_M);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_COLLECTION, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt38, $list_alt45);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, DELETE_SELF_FROM_COLLECTION, CYBLACK_PROTO_KNOWLEDGE_SOURCE_DELETE_SELF_FROM_COLLECTION_METHOD);
        methods.methods_incorporate_instance_method(DELETE_PARENT_LINK, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt48, $list_alt49);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, DELETE_PARENT_LINK, CYBLACK_PROTO_KNOWLEDGE_SOURCE_DELETE_PARENT_LINK_METHOD);
        methods.methods_incorporate_instance_method(ADD_PARENT_LINK, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt52, $list_alt53);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PARENT_LINK, CYBLACK_PROTO_KNOWLEDGE_SOURCE_ADD_PARENT_LINK_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_PROTO_KNOWLEDGE_SOURCE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PROTO_KNOWLEDGE_SOURCE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_PROTO_KNOWLEDGE_SOURCE, $sym65$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PROTO_KNOWLEDGE_SOURCE_INSTAN);
        subloop_reserved_initialize_cyblack_proto_knowledge_source_class(CYBLACK_PROTO_KNOWLEDGE_SOURCE);
        methods.methods_incorporate_instance_method(GET_PARENT_LINKS, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt67, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, GET_PARENT_LINKS, CYBLACK_PROTO_KNOWLEDGE_SOURCE_GET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT_LINKS, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt71, $list_alt72, $list_alt73);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, SET_PARENT_LINKS, CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_SELF_DELETION_MODE, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt67, NIL, $list_alt77);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, GET_SELF_DELETION_MODE, CYBLACK_PROTO_KNOWLEDGE_SOURCE_GET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method(SET_SELF_DELETION_MODE, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt71, $list_alt80, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, SET_SELF_DELETION_MODE, CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method(GET_AUTHOR_NAMES, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt86);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, GET_AUTHOR_NAMES, CYBLACK_PROTO_KNOWLEDGE_SOURCE_GET_AUTHOR_NAMES_METHOD);
        methods.methods_incorporate_instance_method(SET_AUTHOR_NAMES, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt89, $list_alt90);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, SET_AUTHOR_NAMES, CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_AUTHOR_NAMES_METHOD);
        methods.methods_incorporate_instance_method(MONITOR_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt94);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, MONITOR_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE_MONITOR_P_METHOD);
        methods.methods_incorporate_instance_method(POST_AT_WILL_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt98, NIL, $list_alt99);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_AT_WILL_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE_POST_AT_WILL_P_METHOD);
        methods.methods_incorporate_instance_method(SET_POST_AT_WILL, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt98, $list_alt102, $list_alt103);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, SET_POST_AT_WILL, CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_POST_AT_WILL_METHOD);
        methods.methods_incorporate_instance_method(ADD_PANELS_AT_WILL_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt106);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_PANELS_AT_WILL_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE_ADD_PANELS_AT_WILL_P_METHOD);
        methods.methods_incorporate_instance_method(SET_ADD_PANELS_AT_WILL, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt102, $list_alt109);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, SET_ADD_PANELS_AT_WILL, CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_ADD_PANELS_AT_WILL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_PANELS_AT_WILL_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt113);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_PANELS_AT_WILL_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE_REMOVE_PANELS_AT_WILL_P_METHOD);
        methods.methods_incorporate_instance_method(GET_KNOWLEDGE_SOURCE_BATTERY, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt116);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, GET_KNOWLEDGE_SOURCE_BATTERY, $sym117$CYBLACK_PROTO_KNOWLEDGE_SOURCE_GET_KNOWLEDGE_SOURCE_BATTERY_METHO);
        methods.methods_incorporate_instance_method(SET_KNOWLEDGE_SOURCE_BATTERY, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt119, $list_alt120);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, SET_KNOWLEDGE_SOURCE_BATTERY, $sym122$CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_KNOWLEDGE_SOURCE_BATTERY_METHO);
        methods.methods_incorporate_instance_method(SET_REMOVE_PANELS_AT_WILL, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt102, $list_alt124);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, SET_REMOVE_PANELS_AT_WILL, CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_REMOVE_PANELS_AT_WILL_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING_CLASSES_AT_WILL_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt128);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_POSTING_CLASSES_AT_WILL_P, $sym129$CYBLACK_PROTO_KNOWLEDGE_SOURCE_ADD_POSTING_CLASSES_AT_WILL_P_METH);
        methods.methods_incorporate_instance_method(SET_ADD_POSTING_CLASSES_AT_WILL, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt102, $list_alt131);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, SET_ADD_POSTING_CLASSES_AT_WILL, $sym133$CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_ADD_POSTING_CLASSES_AT_WILL_ME);
        methods.methods_incorporate_instance_method(ADD_KNOWLEDGE_SOURCES_AT_WILL_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt135);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, ADD_KNOWLEDGE_SOURCES_AT_WILL_P, $sym136$CYBLACK_PROTO_KNOWLEDGE_SOURCE_ADD_KNOWLEDGE_SOURCES_AT_WILL_P_ME);
        methods.methods_incorporate_instance_method(SET_ADD_KNOWLEDGE_SOURCES_AT_WILL, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt102, $list_alt138);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, SET_ADD_KNOWLEDGE_SOURCES_AT_WILL, $sym140$CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_ADD_KNOWLEDGE_SOURCES_AT_WILL_);
        methods.methods_incorporate_instance_method(REMOVE_KNOWLEDGE_SOURCES_AT_WILL_P, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt142);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, REMOVE_KNOWLEDGE_SOURCES_AT_WILL_P, $sym143$CYBLACK_PROTO_KNOWLEDGE_SOURCE_REMOVE_KNOWLEDGE_SOURCES_AT_WILL_P);
        methods.methods_incorporate_instance_method(SET_REMOVE_KNOWLEDGE_SOURCES_AT_WILL, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt102, $list_alt145);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, SET_REMOVE_KNOWLEDGE_SOURCES_AT_WILL, $sym147$CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_REMOVE_KNOWLEDGE_SOURCES_AT_WI);
        methods.methods_incorporate_instance_method(ON_ACTIVATE, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt149, $list_alt150);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, ON_ACTIVATE, CYBLACK_PROTO_KNOWLEDGE_SOURCE_ON_ACTIVATE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSAL, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt71, $list_alt153, $list_alt154);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, CREATE_PROPOSAL, CYBLACK_PROTO_KNOWLEDGE_SOURCE_CREATE_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(POST_PROPOSAL, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt71, $list_alt157, $list_alt158);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST_PROPOSAL, CYBLACK_PROTO_KNOWLEDGE_SOURCE_POST_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, CYBLACK_PROTO_KNOWLEDGE_SOURCE, NIL, $list_alt164, $list_alt165);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, GENERATE_KSI, CYBLACK_PROTO_KNOWLEDGE_SOURCE_GENERATE_KSI_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, ON_STARTUP, CYBLACK_PROTO_KNOWLEDGE_SOURCE_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt171);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, ON_SHUTDOWN, CYBLACK_PROTO_KNOWLEDGE_SOURCE_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(LINK_KSI, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt174, $list_alt175);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, LINK_KSI, CYBLACK_PROTO_KNOWLEDGE_SOURCE_LINK_KSI_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt71, NIL, $list_alt181);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, INITIALIZE, CYBLACK_PROTO_KNOWLEDGE_SOURCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(POST, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt28, $list_alt185, $list_alt186);
        methods.subloop_register_instance_method(CYBLACK_PROTO_KNOWLEDGE_SOURCE, POST, CYBLACK_PROTO_KNOWLEDGE_SOURCE_POST_METHOD);
        classes.subloop_new_class(CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE, CYBLACK_PROTO_KNOWLEDGE_SOURCE, NIL, NIL, $list_alt191);
        classes.class_set_implements_slot_listeners(CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE, $sym192$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOUR);
        classes.subloop_note_instance_initialization_function(CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE, $sym193$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOUR);
        subloop_reserved_initialize_cyblack_self_motivated_knowledge_source_class(CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE, $list_alt71, NIL, $list_alt194);
        methods.subloop_register_instance_method(CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE, INITIALIZE, CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE_INITIALIZE_METHOD);
        interfaces.new_interface(CYBLACK_PATTERN_BASED_KNOWLEDGE_SOURCE, $list_alt198, $list_alt199, $list_alt200);
        interfaces.new_interface(CYBLACK_PANEL_LINKED_PATTERN_BASED_KNOWLEDGE_SOURCE, $list_alt202, $list_alt203, $list_alt204);
        interfaces.new_interface(CYBLACK_REMOVAL_KNOWLEDGE_SOURCE, $list_alt6, $list_alt206, $list_alt207);
        classes.subloop_new_class(CYBLACK_BASIC_KNOWLEDGE_SOURCE, CYBLACK_PROTO_KNOWLEDGE_SOURCE, $list_alt209, NIL, $list_alt210);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_KNOWLEDGE_SOURCE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_KNOWLEDGE_SOURCE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_KNOWLEDGE_SOURCE, $sym220$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_INSTAN);
        subloop_reserved_initialize_cyblack_basic_knowledge_source_class(CYBLACK_BASIC_KNOWLEDGE_SOURCE);
        methods.methods_incorporate_instance_method(GET_PRECONDITION_PATTERN, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt222);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, GET_PRECONDITION_PATTERN, CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_PRECONDITION_PATTERN, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, $list_alt225, $list_alt226);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, SET_PRECONDITION_PATTERN, CYBLACK_BASIC_KNOWLEDGE_SOURCE_SET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_PRECONDITION_DATATYPES, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt222);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, GET_PRECONDITION_DATATYPES, CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_PRECONDITION_DATATYPES_METHOD);
        methods.methods_incorporate_instance_method(STIMULATE, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, $list_alt149, $list_alt231);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, STIMULATE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_STIMULATE_METHOD);
        methods.methods_incorporate_instance_method(LINK_TO_PANELS, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt245);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINK_TO_PANELS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LINK_TO_PANELS_METHOD);
        methods.methods_incorporate_instance_method(UNLINK_FROM_PANELS, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt249);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, UNLINK_FROM_PANELS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_UNLINK_FROM_PANELS_METHOD);
        methods.methods_incorporate_instance_method(LINKED_TO_PANELS_P, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt256);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, LINKED_TO_PANELS_P, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LINKED_TO_PANELS_P_METHOD);
        methods.methods_incorporate_instance_method(GET_UNIFICATION_ROBOT_CLASS, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt260);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, GET_UNIFICATION_ROBOT_CLASS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_UNIFICATION_ROBOT_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_UNIFICATION_ROBOT_CLASS, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, $list_alt263, $list_alt264);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, SET_UNIFICATION_ROBOT_CLASS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_SET_UNIFICATION_ROBOT_CLASS_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt71, NIL, $list_alt267);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, INITIALIZE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt272);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, GET_APPLICATION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, $list_alt274, $list_alt275);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, SET_APPLICATION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, ON_STARTUP, CYBLACK_BASIC_KNOWLEDGE_SOURCE_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt171);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, ON_SHUTDOWN, CYBLACK_BASIC_KNOWLEDGE_SOURCE_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(GET_PANELS, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt281);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, GET_PANELS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_PANELS_METHOD);
        methods.methods_incorporate_instance_method(GET_DOMAIN, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt285);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, GET_DOMAIN, CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_DOMAIN_METHOD);
        methods.methods_incorporate_instance_method(GET_RANGE, CYBLACK_BASIC_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt222);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE, GET_RANGE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_RANGE_METHOD);
        classes.subloop_new_class(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KNOWLEDGE_SOURCE, NIL, NIL, $list_alt292);
        classes.class_set_implements_slot_listeners(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, $sym295$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_CLA);
        classes.subloop_note_instance_initialization_function(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, $sym296$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_INS);
        subloop_reserved_initialize_cyblack_internal_knowledge_source_class(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, $list_alt71, NIL, $list_alt297);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, INITIALIZE, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(LINK_TO_PANELS, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt300);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, LINK_TO_PANELS, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_LINK_TO_PANELS_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt306);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, ON_STARTUP, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt171);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, ON_SHUTDOWN, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(GET_PRECONDITION_PATTERN, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt309);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, GET_PRECONDITION_PATTERN, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_GET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_PRECONDITION_PATTERN, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt225, $list_alt311);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, SET_PRECONDITION_PATTERN, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_SET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(COMPLETE_PRECONDITION_PATTERN, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt318);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, COMPLETE_PRECONDITION_PATTERN, $sym320$CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_COMPLETE_PRECONDITION_PATTERN_M);
        methods.methods_incorporate_instance_method(GET_PRECONDITION_DATATYPES, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt321);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, GET_PRECONDITION_DATATYPES, $sym322$CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_GET_PRECONDITION_DATATYPES_METH);
        classes.subloop_new_class(CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, NIL, NIL, $list_alt191);
        classes.class_set_implements_slot_listeners(CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE, $sym324$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE_);
        classes.subloop_note_instance_initialization_function(CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE, $sym325$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE_);
        subloop_reserved_initialize_cyblack_constrained_knowledge_source_class(CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE, $list_alt71, NIL, $list_alt326);
        methods.subloop_register_instance_method(CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE, INITIALIZE, CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE, CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE, NIL, NIL, $list_alt191);
        classes.class_set_implements_slot_listeners(CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE, $sym331$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOW);
        classes.subloop_note_instance_initialization_function(CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE, $sym332$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOW);
        subloop_reserved_initialize_cyblack_single_match_constrained_knowledge_source_class(CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE, $list_alt71, NIL, $list_alt333);
        methods.subloop_register_instance_method(CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE, INITIALIZE, $sym336$CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE_INITIALIZE_METH);
        interfaces.new_interface(CYBLACK_MONITORING_KS, $list_alt6, $list_alt206, $list_alt338);
        interfaces.interfaces_add_interface_instance_method(PERFORM_ACTION, CYBLACK_MONITORING_KS, $list_alt71, $list_alt339, $list_alt340);
        classes.subloop_new_class(CYBLACK_INTERNAL_MONITORING_KS, CYBLACK_INTERNAL_KNOWLEDGE_SOURCE, $list_alt342, NIL, $list_alt343);
        classes.class_set_implements_slot_listeners(CYBLACK_INTERNAL_MONITORING_KS, NIL);
        methods.methods_incorporate_instance_method(PERFORM_ACTION, CYBLACK_INTERNAL_MONITORING_KS, $list_alt71, $list_alt339, $list_alt340);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, PERFORM_ACTION, CYBLACK_INTERNAL_MONITORING_KS_PERFORM_ACTION_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_INTERNAL_MONITORING_KS, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_MONITORING_KS_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_INTERNAL_MONITORING_KS, $sym361$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_MONITORING_KS_INSTAN);
        subloop_reserved_initialize_cyblack_internal_monitoring_ks_class(CYBLACK_INTERNAL_MONITORING_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_INTERNAL_MONITORING_KS, $list_alt71, NIL, $list_alt362);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, INITIALIZE, CYBLACK_INTERNAL_MONITORING_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_PRECONDITION_PATTERN, CYBLACK_INTERNAL_MONITORING_KS, $list_alt28, $list_alt225, $list_alt367);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, SET_PRECONDITION_PATTERN, CYBLACK_INTERNAL_MONITORING_KS_SET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_STATE_CHANGE_LISTENER_CLASS, CYBLACK_INTERNAL_MONITORING_KS, $list_alt85, NIL, $list_alt372);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, GET_STATE_CHANGE_LISTENER_CLASS, $sym373$CYBLACK_INTERNAL_MONITORING_KS_GET_STATE_CHANGE_LISTENER_CLASS_ME);
        methods.methods_incorporate_instance_method(SET_STATE_CHANGE_LISTENER_CLASS, CYBLACK_INTERNAL_MONITORING_KS, $list_alt28, $list_alt375, $list_alt376);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, SET_STATE_CHANGE_LISTENER_CLASS, $sym378$CYBLACK_INTERNAL_MONITORING_KS_SET_STATE_CHANGE_LISTENER_CLASS_ME);
        methods.methods_incorporate_instance_method(GET_STATE_CHANGE_LISTENER, CYBLACK_INTERNAL_MONITORING_KS, $list_alt85, NIL, $list_alt380);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, GET_STATE_CHANGE_LISTENER, CYBLACK_INTERNAL_MONITORING_KS_GET_STATE_CHANGE_LISTENER_METHOD);
        methods.methods_incorporate_instance_method(SET_STATE_CHANGE_LISTENER, CYBLACK_INTERNAL_MONITORING_KS, $list_alt28, $list_alt383, $list_alt384);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, SET_STATE_CHANGE_LISTENER, CYBLACK_INTERNAL_MONITORING_KS_SET_STATE_CHANGE_LISTENER_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTION, CYBLACK_INTERNAL_MONITORING_KS, $list_alt85, NIL, $list_alt388);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, GET_ACTION, CYBLACK_INTERNAL_MONITORING_KS_GET_ACTION_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTION, CYBLACK_INTERNAL_MONITORING_KS, $list_alt28, $list_alt391, $list_alt392);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, SET_ACTION, CYBLACK_INTERNAL_MONITORING_KS_SET_ACTION_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTION_QUALIFIERS, CYBLACK_INTERNAL_MONITORING_KS, $list_alt85, NIL, $list_alt396);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, GET_ACTION_QUALIFIERS, CYBLACK_INTERNAL_MONITORING_KS_GET_ACTION_QUALIFIERS_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTION_QUALIFIERS, CYBLACK_INTERNAL_MONITORING_KS, $list_alt28, $list_alt399, $list_alt400);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, SET_ACTION_QUALIFIERS, CYBLACK_INTERNAL_MONITORING_KS_SET_ACTION_QUALIFIERS_METHOD);
        methods.methods_incorporate_instance_method(GATHER_ALL_POSTINGS, CYBLACK_INTERNAL_MONITORING_KS, $list_alt71, $list_alt404, $list_alt405);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, GATHER_ALL_POSTINGS, CYBLACK_INTERNAL_MONITORING_KS_GATHER_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GATHER_ALL_DIRECT_POSTINGS, CYBLACK_INTERNAL_MONITORING_KS, $list_alt71, $list_alt404, $list_alt409);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, GATHER_ALL_DIRECT_POSTINGS, CYBLACK_INTERNAL_MONITORING_KS_GATHER_ALL_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_INTERNAL_MONITORING_KS, $list_alt98, NIL, $list_alt412);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_MONITORING_KS, ON_STARTUP, CYBLACK_INTERNAL_MONITORING_KS_ON_STARTUP_METHOD);
        classes.subloop_new_class(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_BASIC_KNOWLEDGE_SOURCE, NIL, NIL, $list_alt416);
        classes.class_set_implements_slot_listeners(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $sym430$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_CLA);
        classes.subloop_note_instance_initialization_function(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $sym431$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_INS);
        subloop_reserved_initialize_cyblack_external_knowledge_source_class(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt71, NIL, $list_alt432);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, INITIALIZE, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_NAME, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt438);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GET_NAME, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_NAME, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt441, $list_alt442);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, SET_NAME, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_NAME_METHOD);
        methods.methods_incorporate_instance_method(INFLATE, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt71, $list_alt446, $list_alt447);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, INFLATE, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_INFLATE_METHOD);
        methods.methods_incorporate_instance_method(GET_PROPOSAL_CLASS, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt451);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GET_PROPOSAL_CLASS, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_PROPOSAL_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_PROPOSAL_CLASS, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt375, $list_alt455);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, SET_PROPOSAL_CLASS, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_PROPOSAL_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_NEW_PROPOSAL, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt71, NIL, $list_alt459);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GENERATE_NEW_PROPOSAL, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GENERATE_NEW_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt462);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GET_EXTERNAL_KNOWLEDGE_SOURCE, $sym463$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_EXTERNAL_KNOWLEDGE_SOURCE_M);
        methods.methods_incorporate_instance_method(GET_PRECONDITION_PATTERN, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt464);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GET_PRECONDITION_PATTERN, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_PRECONDITION_PATTERN, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt225, $list_alt466);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, SET_PRECONDITION_PATTERN, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_PRECONDITION_DATATYPES, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt469);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GET_PRECONDITION_DATATYPES, $sym470$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_PRECONDITION_DATATYPES_METH);
        methods.methods_incorporate_instance_method(STIMULATE, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt149, $list_alt471);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, STIMULATE, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_STIMULATE_METHOD);
        methods.methods_incorporate_instance_method(ON_ACTIVATE, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt149, $list_alt150);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, ON_ACTIVATE, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_ON_ACTIVATE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSAL, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt71, $list_alt153, $list_alt475);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, CREATE_PROPOSAL, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_CREATE_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(CREATE_PROPOSAL_CALLBACK, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt479, $list_alt480);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, CREATE_PROPOSAL_CALLBACK, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_CREATE_PROPOSAL_CALLBACK_METHOD);
        methods.methods_incorporate_instance_method(GET_MESSAGE_BROKER, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt71, NIL, $list_alt486);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GET_MESSAGE_BROKER, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_MESSAGE_BROKER_METHOD);
        methods.methods_incorporate_instance_method(LINK_TO_PANELS, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt489, NIL, $list_alt490);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, LINK_TO_PANELS, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_LINK_TO_PANELS_METHOD);
        methods.methods_incorporate_instance_method(LINK_TO_PANELS_INTERNAL, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt71, NIL, $list_alt494);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, LINK_TO_PANELS_INTERNAL, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_LINK_TO_PANELS_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(LINK_TO_PANELS_CALLBACK, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt98, $list_alt498, $list_alt499);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, LINK_TO_PANELS_CALLBACK, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_LINK_TO_PANELS_CALLBACK_METHOD);
        methods.methods_incorporate_instance_method(WAITING_ON_LINK_CALLBACK_P, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt505);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, WAITING_ON_LINK_CALLBACK_P, $sym507$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_WAITING_ON_LINK_CALLBACK_P_METH);
        methods.methods_incorporate_instance_method(SET_WAITING_ON_LINK_CALLBACK, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt509, $list_alt510);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, SET_WAITING_ON_LINK_CALLBACK, $sym512$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_WAITING_ON_LINK_CALLBACK_ME);
        methods.methods_incorporate_instance_method(GET_INVITATION_TRANSACTION_ID, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt514);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GET_INVITATION_TRANSACTION_ID, $sym515$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_INVITATION_TRANSACTION_ID_M);
        methods.methods_incorporate_instance_method(SET_INVITATION_TRANSACTION_ID, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt71, $list_alt517, $list_alt518);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, SET_INVITATION_TRANSACTION_ID, $sym520$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_INVITATION_TRANSACTION_ID_M);
        methods.methods_incorporate_instance_method(REJECTED_P, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt522);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, REJECTED_P, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_REJECTED_P_METHOD);
        methods.methods_incorporate_instance_method(SET_REJECTED, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt71, $list_alt509, $list_alt526);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, SET_REJECTED, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_REJECTED_METHOD);
        methods.methods_incorporate_instance_method(GET_REJECTION_EXCUSES, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt530);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GET_REJECTION_EXCUSES, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_REJECTION_EXCUSES_METHOD);
        methods.methods_incorporate_instance_method(SET_REJECTION_EXCUSES, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt533, $list_alt534);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, SET_REJECTION_EXCUSES, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_REJECTION_EXCUSES_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt164, $list_alt537);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GENERATE_KSI, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GENERATE_KSI_METHOD);
        methods.methods_incorporate_instance_method(GET_GUID_AS_STRING, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt541);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GET_GUID_AS_STRING, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_GUID_AS_STRING_METHOD);
        methods.methods_incorporate_instance_method(SET_GUID_AS_STRING, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt544, $list_alt545);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, SET_GUID_AS_STRING, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_GUID_AS_STRING_METHOD);
        methods.methods_incorporate_instance_method(GET_PORT_ID, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt85, NIL, $list_alt549);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, GET_PORT_ID, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_PORT_ID, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, $list_alt552, $list_alt553);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, SET_PORT_ID, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_PORT_ID_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt28, NIL, $list_alt556);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, ON_STARTUP, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_ON_STARTUP_METHOD);
        classes.subloop_new_class(CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, NIL, NIL, $list_alt191);
        classes.class_set_implements_slot_listeners(CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE, $sym560$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDG);
        classes.subloop_note_instance_initialization_function(CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE, $sym561$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDG);
        subloop_reserved_initialize_cyblack_constrained_external_knowledge_source_class(CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt71, NIL, $list_alt326);
        methods.subloop_register_instance_method(CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE, INITIALIZE, CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_EXTERNAL_MONITORING_KS, CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE, $list_alt342, NIL, $list_alt343);
        classes.class_set_implements_slot_listeners(CYBLACK_EXTERNAL_MONITORING_KS, NIL);
        methods.methods_incorporate_instance_method(PERFORM_ACTION, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt71, $list_alt339, $list_alt340);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, PERFORM_ACTION, CYBLACK_EXTERNAL_MONITORING_KS_PERFORM_ACTION_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_EXTERNAL_MONITORING_KS, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MONITORING_KS_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EXTERNAL_MONITORING_KS, $sym571$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MONITORING_KS_INSTAN);
        subloop_reserved_initialize_cyblack_external_monitoring_ks_class(CYBLACK_EXTERNAL_MONITORING_KS);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt71, NIL, $list_alt572);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, INITIALIZE, CYBLACK_EXTERNAL_MONITORING_KS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_PRECONDITION_PATTERN, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt28, $list_alt225, $list_alt367);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, SET_PRECONDITION_PATTERN, CYBLACK_EXTERNAL_MONITORING_KS_SET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_STATE_CHANGE_LISTENER_CLASS, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt85, NIL, $list_alt372);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, GET_STATE_CHANGE_LISTENER_CLASS, $sym578$CYBLACK_EXTERNAL_MONITORING_KS_GET_STATE_CHANGE_LISTENER_CLASS_ME);
        methods.methods_incorporate_instance_method(SET_STATE_CHANGE_LISTENER_CLASS, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt28, $list_alt375, $list_alt376);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, SET_STATE_CHANGE_LISTENER_CLASS, $sym580$CYBLACK_EXTERNAL_MONITORING_KS_SET_STATE_CHANGE_LISTENER_CLASS_ME);
        methods.methods_incorporate_instance_method(GET_STATE_CHANGE_LISTENER, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt85, NIL, $list_alt380);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, GET_STATE_CHANGE_LISTENER, CYBLACK_EXTERNAL_MONITORING_KS_GET_STATE_CHANGE_LISTENER_METHOD);
        methods.methods_incorporate_instance_method(SET_STATE_CHANGE_LISTENER, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt28, $list_alt383, $list_alt582);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, SET_STATE_CHANGE_LISTENER, CYBLACK_EXTERNAL_MONITORING_KS_SET_STATE_CHANGE_LISTENER_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTION, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt85, NIL, $list_alt388);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, GET_ACTION, CYBLACK_EXTERNAL_MONITORING_KS_GET_ACTION_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTION, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt28, $list_alt391, $list_alt392);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, SET_ACTION, CYBLACK_EXTERNAL_MONITORING_KS_SET_ACTION_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTION_QUALIFIERS, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt85, NIL, $list_alt396);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, GET_ACTION_QUALIFIERS, CYBLACK_EXTERNAL_MONITORING_KS_GET_ACTION_QUALIFIERS_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTION_QUALIFIERS, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt28, $list_alt399, $list_alt400);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, SET_ACTION_QUALIFIERS, CYBLACK_EXTERNAL_MONITORING_KS_SET_ACTION_QUALIFIERS_METHOD);
        methods.methods_incorporate_instance_method(GATHER_ALL_POSTINGS, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt71, $list_alt404, $list_alt405);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, GATHER_ALL_POSTINGS, CYBLACK_EXTERNAL_MONITORING_KS_GATHER_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(GATHER_ALL_DIRECT_POSTINGS, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt71, $list_alt404, $list_alt409);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, GATHER_ALL_DIRECT_POSTINGS, CYBLACK_EXTERNAL_MONITORING_KS_GATHER_ALL_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_EXTERNAL_MONITORING_KS, $list_alt98, NIL, $list_alt595);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_MONITORING_KS, ON_STARTUP, CYBLACK_EXTERNAL_MONITORING_KS_ON_STARTUP_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, BASIC_DOUBLY_LINKED_LIST, NIL, NIL, $list_alt603);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $sym604$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_C);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $sym609$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_I);
        subloop_reserved_initialize_cyblack_basic_knowledge_source_list_class(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $list_alt71, NIL, $list_alt610);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, INITIALIZE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $list_alt28, $list_alt613, $list_alt614);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, SET_CONTENTS, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $list_alt28, $list_alt617, $list_alt618);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, PRINT, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_PRINT_METHOD);
        methods.methods_incorporate_instance_method(ADD, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $list_alt28, $list_alt626, $list_alt627);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, ADD, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_ADD_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $list_alt28, $list_alt630, $list_alt631);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, REMOVE, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $list_alt28, $list_alt633, $list_alt634);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, MEMBER_P, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(PUSH, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $list_alt28, $list_alt626, $list_alt637);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, PUSH, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_PUSH_METHOD);
        methods.methods_incorporate_instance_method(SET_NTH, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $list_alt28, $list_alt640, $list_alt641);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, SET_NTH, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_SET_NTH_METHOD);
        methods.methods_incorporate_instance_method(POSITION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $list_alt28, $list_alt633, $list_alt644);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, POSITION, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_POSITION_METHOD);
        methods.methods_incorporate_instance_method(APPEND, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, $list_alt28, $list_alt647, $list_alt648);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST, APPEND, CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_APPEND_METHOD);
        interfaces.new_interface(CYBLACK_KS_VISITOR, $list_alt651, $list_alt652, $list_alt653);
        classes.subloop_new_class(CYBLACK_BASIC_KS_VISITOR, CYBLACK_OBJECT, $list_alt655, NIL, $list_alt656);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_KS_VISITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_KS_VISITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KS_VISITOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_KS_VISITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KS_VISITOR_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_ks_visitor_class(CYBLACK_BASIC_KS_VISITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_KS_VISITOR, $list_alt71, NIL, $list_alt660);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KS_VISITOR, INITIALIZE, CYBLACK_BASIC_KS_VISITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CLONE, CYBLACK_BASIC_KS_VISITOR, $list_alt28, NIL, $list_alt664);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KS_VISITOR, CLONE, CYBLACK_BASIC_KS_VISITOR_CLONE_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, CYBLACK_BASIC_KS_VISITOR, $list_alt28, $list_alt668, $list_alt669);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KS_VISITOR, SET_INITIAL_STATE, CYBLACK_BASIC_KS_VISITOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_BASIC_KS_VISITOR, $list_alt28, $list_alt672, $list_alt673);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KS_VISITOR, VISIT, CYBLACK_BASIC_KS_VISITOR_VISIT_METHOD);
        methods.methods_incorporate_instance_method(CONTINUE_P, CYBLACK_BASIC_KS_VISITOR, $list_alt28, $list_alt676, $list_alt677);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KS_VISITOR, CONTINUE_P, CYBLACK_BASIC_KS_VISITOR_CONTINUE_P_METHOD);
        methods.methods_incorporate_instance_method(GET_FINAL_STATE, CYBLACK_BASIC_KS_VISITOR, $list_alt85, NIL, $list_alt222);
        methods.subloop_register_instance_method(CYBLACK_BASIC_KS_VISITOR, GET_FINAL_STATE, CYBLACK_BASIC_KS_VISITOR_GET_FINAL_STATE_METHOD);
        classes.subloop_new_class(CYBLACK_STATE_CHANGE_KS_VISITOR, CYBLACK_BASIC_KS_VISITOR, NIL, NIL, $list_alt683);
        classes.class_set_implements_slot_listeners(CYBLACK_STATE_CHANGE_KS_VISITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_STATE_CHANGE_KS_VISITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STATE_CHANGE_KS_VISITOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_STATE_CHANGE_KS_VISITOR, $sym688$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STATE_CHANGE_KS_VISITOR_INSTA);
        subloop_reserved_initialize_cyblack_state_change_ks_visitor_class(CYBLACK_STATE_CHANGE_KS_VISITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_STATE_CHANGE_KS_VISITOR, $list_alt71, NIL, $list_alt689);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_KS_VISITOR, INITIALIZE, CYBLACK_STATE_CHANGE_KS_VISITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_PANEL, CYBLACK_STATE_CHANGE_KS_VISITOR, $list_alt85, NIL, $list_alt692);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_KS_VISITOR, GET_PANEL, CYBLACK_STATE_CHANGE_KS_VISITOR_GET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(SET_PANEL, CYBLACK_STATE_CHANGE_KS_VISITOR, $list_alt28, $list_alt695, $list_alt696);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_KS_VISITOR, SET_PANEL, CYBLACK_STATE_CHANGE_KS_VISITOR_SET_PANEL_METHOD);
        methods.methods_incorporate_instance_method(CLONE, CYBLACK_STATE_CHANGE_KS_VISITOR, $list_alt28, NIL, $list_alt699);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_KS_VISITOR, CLONE, CYBLACK_STATE_CHANGE_KS_VISITOR_CLONE_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, CYBLACK_STATE_CHANGE_KS_VISITOR, $list_alt28, $list_alt668, $list_alt702);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_KS_VISITOR, SET_INITIAL_STATE, CYBLACK_STATE_CHANGE_KS_VISITOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_STATE_CHANGE_KS_VISITOR, $list_alt28, $list_alt672, $list_alt705);
        methods.subloop_register_instance_method(CYBLACK_STATE_CHANGE_KS_VISITOR, VISIT, CYBLACK_STATE_CHANGE_KS_VISITOR_VISIT_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt1 = list(makeSymbol("CYBLACK-BLACKBOARD-DAEMON"));

    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-BLACKBOARD-DAEMON")));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AUTHOR-NAMES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-AUTHOR-NAMES"), list(makeSymbol("NEW-AUTHOR-NAMES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-POST-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PANELS-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ADD-PANELS-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-PANELS-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REMOVE-PANELS-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING-CLASSES-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ADD-POSTING-CLASSES-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-KNOWLEDGE-SOURCES-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ADD-KNOWLEDGE-SOURCES-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-KNOWLEDGE-SOURCES-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REMOVE-KNOWLEDGE-SOURCES-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KNOWLEDGE-SOURCE-BATTERY"), list(makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ACTIVATE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-PROPOSAL"), list(makeSymbol("ACTIVATION-PATTERN"), makeSymbol("&OPTIONAL"), list(makeSymbol("ARG-IF-ON-STARTUP"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST-PROPOSAL"), list(makeSymbol("PROPOSAL"), makeSymbol("AGENDA")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-KSI"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE");



    static private final SubLList $list_alt6 = list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE"));

    static private final SubLList $list_alt7 = list(new SubLObject[]{ list(makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT-LINKS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT-LINKS"), list(makeSymbol("NEW-PARENT-LINKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PARENT-LINK"), list(makeSymbol("NEW-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-PARENT-LINK"), list(makeSymbol("OLD-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SELF-DELETION-MODE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SELF-DELETION-MODE"), list(makeSymbol("MODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-COLLECTION"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("AUTHOR-NAMES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-A-MONITOR"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("POST-AT-WILL"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("ADD-PANELS-AT-WILL"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("REMOVE-PANELS-AT-WILL"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("ADD-POSTING-CLASSES-AT-WILL"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("ADD-KNOWLEDGE-SOURCES-AT-WILL"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("REMOVE-KNOWLEDGE-SOURCES-AT-WILL"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AUTHOR-NAMES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-AUTHOR-NAMES"), list(makeSymbol("NEW-AUTHOR-NAMES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-POST-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PANELS-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ADD-PANELS-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-PANELS-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REMOVE-PANELS-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING-CLASSES-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ADD-POSTING-CLASSES-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-KNOWLEDGE-SOURCES-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ADD-KNOWLEDGE-SOURCES-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-KNOWLEDGE-SOURCES-AT-WILL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REMOVE-KNOWLEDGE-SOURCES-AT-WILL"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE-BATTERY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KNOWLEDGE-SOURCE-BATTERY"), list(makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ACTIVATE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-PROPOSAL"), list(makeSymbol("ACTIVATION-PATTERN"), makeSymbol("&OPTIONAL"), list(makeSymbol("ARG-IF-ON-STARTUP"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST-PROPOSAL"), list(makeSymbol("PROPOSAL"), makeSymbol("AGENDA")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-KSI"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LINK-KSI"), list(makeSymbol("KNOWLEDGE-SOURCE-INSTANTIATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")) });







    private static final SubLSymbol REMOVE_KNOWLEDGE_SOURCES_AT_WILL = makeSymbol("REMOVE-KNOWLEDGE-SOURCES-AT-WILL");

    public static final SubLInteger $int$4104 = makeInteger(4104);



    public static final SubLInteger $int$4103 = makeInteger(4103);



    public static final SubLInteger $int$4102 = makeInteger(4102);



    public static final SubLInteger $int$4101 = makeInteger(4101);



    public static final SubLInteger $int$4100 = makeInteger(4100);



    public static final SubLInteger $int$4099 = makeInteger(4099);



    public static final SubLInteger $int$4098 = makeInteger(4098);



    public static final SubLInteger $int$4097 = makeInteger(4097);



    static private final SubLList $list_alt28 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt29 = list(makeSymbol("PARENT-LIST"));

    static private final SubLList $list_alt30 = list(list(makeSymbol("IGNORE"), makeSymbol("PARENT-LIST")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_ON_DELETE_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-ON-DELETE-METHOD");



    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_ON_ADD_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-ON-ADD-METHOD");



    static private final SubLList $list_alt35 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-COLLECTIONS"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS"), makeSymbol("TEMPLATE-COLLECTIONS")), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK"))), list(RET, list(makeSymbol("UNIQUE-ELEMENTS"), makeSymbol("TEMPLATE-COLLECTIONS")))));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_GET_COLLECTIONS_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-GET-COLLECTIONS-METHOD");



    static private final SubLList $list_alt38 = list(makeSymbol("COLLECTION"));

    static private final SubLList $list_alt39 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(RET, T))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_MEMBER_P_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-MEMBER-P-METHOD");



    static private final SubLList $list_alt42 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), NIL))), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), NIL)), list(RET, makeSymbol("SELF"))));

    static private final SubLSymbol $sym43$CYBLACK_PROTO_KNOWLEDGE_SOURCE_DELETE_SELF_FROM_ALL_COLLECTIONS_M = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD");



    static private final SubLList $list_alt45 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), makeSymbol("COLLECTION")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_DELETE_SELF_FROM_COLLECTION_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-DELETE-SELF-FROM-COLLECTION-METHOD");



    static private final SubLList $list_alt48 = list(makeSymbol("OLD-PARENT-LINK"));

    static private final SubLList $list_alt49 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OLD-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), list(makeSymbol("DLC-OWNER"), makeSymbol("OLD-PARENT-LINK"))), list(RET, makeSymbol("OLD-PARENT-LINK"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))))))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_DELETE_PARENT_LINK_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-DELETE-PARENT-LINK-METHOD");



    static private final SubLList $list_alt52 = list(makeSymbol("NEW-PARENT-LINK"));

    static private final SubLList $list_alt53 = list(list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("NEW-PARENT-LINK"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ADD")), list(makeSymbol("DLC-OWNER"), makeSymbol("NEW-PARENT-LINK"))), list(RET, makeSymbol("NEW-PARENT-LINK")));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_ADD_PARENT_LINK_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-PARENT-LINK-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PROTO_KNOWLEDGE_SOURCE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PROTO-KNOWLEDGE-SOURCE-CLASS");















    static private final SubLSymbol $sym65$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PROTO_KNOWLEDGE_SOURCE_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PROTO-KNOWLEDGE-SOURCE-INSTANCE");



    static private final SubLList $list_alt67 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt68 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS")));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_GET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-GET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt71 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt72 = list(makeSymbol("NEW-PARENT-LINKS"));

    static private final SubLList $list_alt73 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeSymbol("NEW-PARENT-LINKS")), list(RET, makeSymbol("NEW-PARENT-LINKS")));

    static private final SubLSymbol $sym74$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt77 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE")));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_GET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-GET-SELF-DELETION-MODE-METHOD");



    static private final SubLList $list_alt80 = list(makeSymbol("MODE"));

    static private final SubLList $list_alt81 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeSymbol("MODE")), list(RET, makeSymbol("MODE")));

    static private final SubLSymbol $sym82$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-SELF-DELETION-MODE-METHOD");

    private static final SubLSymbol GET_AUTHOR_NAMES = makeSymbol("GET-AUTHOR-NAMES");

    static private final SubLList $list_alt85 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt86 = list(list(RET, makeSymbol("AUTHOR-NAMES")));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_GET_AUTHOR_NAMES_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-GET-AUTHOR-NAMES-METHOD");

    private static final SubLSymbol SET_AUTHOR_NAMES = makeSymbol("SET-AUTHOR-NAMES");

    static private final SubLList $list_alt89 = list(makeSymbol("NEW-AUTHOR-NAMES"));

    static private final SubLList $list_alt90 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-AUTHOR-NAMES")), makeString("(SET-AUTHOR-NAMES ~S): ~S is not a valid list of author names."), makeSymbol("SELF"), makeSymbol("NEW-AUTHOR-NAMES")), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), makeSymbol("NEW-AUTHOR-NAMES")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("STRINGP"), makeSymbol("ELEMENT")), makeString("(SET-AUTHOR-NAMES ~S): ~S is not a valid author name.  Author names must be lists."), makeSymbol("SELF"), makeSymbol("ELEMENT")))), list(makeSymbol("CSETQ"), makeSymbol("AUTHOR-NAMES"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-AUTHOR-NAMES"))), list(RET, makeSymbol("NEW-AUTHOR-NAMES")));

    static private final SubLSymbol $sym91$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_AUTHOR_NAMES_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-AUTHOR-NAMES-METHOD");

    private static final SubLSymbol MONITOR_P = makeSymbol("MONITOR-P");

    static private final SubLList $list_alt94 = list(list(RET, makeSymbol("IS-A-MONITOR")));

    static private final SubLSymbol $sym95$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_MONITOR_P_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-MONITOR-P-METHOD");

    private static final SubLSymbol POST_AT_WILL_P = makeSymbol("POST-AT-WILL-P");

    static private final SubLList $list_alt98 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt99 = list(list(RET, list(makeSymbol("GET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-POST-AT-WILL"), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_POST_AT_WILL_P_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-POST-AT-WILL-P-METHOD");



    static private final SubLList $list_alt102 = list(makeSymbol("NEW-STATE"));

    static private final SubLList $list_alt103 = list(list(RET, list(makeSymbol("SET-CYBLACK-PROTO-KNOWLEDGE-SOURCE-POST-AT-WILL"), makeSymbol("SELF"), list(makeSymbol("FIF"), makeSymbol("NEW-STATE"), T, NIL))));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_POST_AT_WILL_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-POST-AT-WILL-METHOD");

    private static final SubLSymbol ADD_PANELS_AT_WILL_P = makeSymbol("ADD-PANELS-AT-WILL-P");

    static private final SubLList $list_alt106 = list(list(RET, makeSymbol("ADD-PANELS-AT-WILL")));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_ADD_PANELS_AT_WILL_P_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-PANELS-AT-WILL-P-METHOD");

    private static final SubLSymbol SET_ADD_PANELS_AT_WILL = makeSymbol("SET-ADD-PANELS-AT-WILL");

    static private final SubLList $list_alt109 = list(list(makeSymbol("CSETQ"), makeSymbol("ADD-PANELS-AT-WILL"), makeSymbol("NEW-STATE")), list(RET, makeSymbol("NEW-STATE")));

    static private final SubLSymbol $sym110$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_ADD_PANELS_AT_WILL_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-ADD-PANELS-AT-WILL-METHOD");

    private static final SubLSymbol REMOVE_PANELS_AT_WILL_P = makeSymbol("REMOVE-PANELS-AT-WILL-P");

    static private final SubLList $list_alt113 = list(list(RET, makeSymbol("REMOVE-PANELS-AT-WILL")));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_REMOVE_PANELS_AT_WILL_P_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-REMOVE-PANELS-AT-WILL-P-METHOD");



    static private final SubLList $list_alt116 = list(list(RET, makeSymbol("KNOWLEDGE-SOURCE-BATTERY")));

    static private final SubLSymbol $sym117$CYBLACK_PROTO_KNOWLEDGE_SOURCE_GET_KNOWLEDGE_SOURCE_BATTERY_METHO = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-GET-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol SET_KNOWLEDGE_SOURCE_BATTERY = makeSymbol("SET-KNOWLEDGE-SOURCE-BATTERY");

    static private final SubLList $list_alt119 = list(makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY"));

    static private final SubLList $list_alt120 = list(list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY")), list(RET, makeSymbol("NEW-KNOWLEDGE-SOURCE-BATTERY")));

    static private final SubLSymbol $sym121$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym122$CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_KNOWLEDGE_SOURCE_BATTERY_METHO = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-KNOWLEDGE-SOURCE-BATTERY-METHOD");

    private static final SubLSymbol SET_REMOVE_PANELS_AT_WILL = makeSymbol("SET-REMOVE-PANELS-AT-WILL");

    static private final SubLList $list_alt124 = list(list(makeSymbol("CSETQ"), makeSymbol("REMOVE-PANELS-AT-WILL"), makeSymbol("NEW-STATE")), list(RET, makeSymbol("NEW-STATE")));

    static private final SubLSymbol $sym125$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_REMOVE_PANELS_AT_WILL_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-REMOVE-PANELS-AT-WILL-METHOD");

    private static final SubLSymbol ADD_POSTING_CLASSES_AT_WILL_P = makeSymbol("ADD-POSTING-CLASSES-AT-WILL-P");

    static private final SubLList $list_alt128 = list(list(RET, makeSymbol("ADD-POSTING-CLASSES-AT-WILL")));

    static private final SubLSymbol $sym129$CYBLACK_PROTO_KNOWLEDGE_SOURCE_ADD_POSTING_CLASSES_AT_WILL_P_METH = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-POSTING-CLASSES-AT-WILL-P-METHOD");

    private static final SubLSymbol SET_ADD_POSTING_CLASSES_AT_WILL = makeSymbol("SET-ADD-POSTING-CLASSES-AT-WILL");

    static private final SubLList $list_alt131 = list(list(makeSymbol("CSETQ"), makeSymbol("ADD-POSTING-CLASSES-AT-WILL"), makeSymbol("NEW-STATE")), list(RET, makeSymbol("NEW-STATE")));

    static private final SubLSymbol $sym132$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym133$CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_ADD_POSTING_CLASSES_AT_WILL_ME = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-ADD-POSTING-CLASSES-AT-WILL-METHOD");

    private static final SubLSymbol ADD_KNOWLEDGE_SOURCES_AT_WILL_P = makeSymbol("ADD-KNOWLEDGE-SOURCES-AT-WILL-P");

    static private final SubLList $list_alt135 = list(list(RET, makeSymbol("ADD-KNOWLEDGE-SOURCES-AT-WILL")));

    static private final SubLSymbol $sym136$CYBLACK_PROTO_KNOWLEDGE_SOURCE_ADD_KNOWLEDGE_SOURCES_AT_WILL_P_ME = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-ADD-KNOWLEDGE-SOURCES-AT-WILL-P-METHOD");

    private static final SubLSymbol SET_ADD_KNOWLEDGE_SOURCES_AT_WILL = makeSymbol("SET-ADD-KNOWLEDGE-SOURCES-AT-WILL");

    static private final SubLList $list_alt138 = list(list(makeSymbol("CSETQ"), makeSymbol("ADD-KNOWLEDGE-SOURCES-AT-WILL"), makeSymbol("NEW-STATE")), list(RET, makeSymbol("NEW-STATE")));

    static private final SubLSymbol $sym139$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym140$CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_ADD_KNOWLEDGE_SOURCES_AT_WILL_ = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-ADD-KNOWLEDGE-SOURCES-AT-WILL-METHOD");

    private static final SubLSymbol REMOVE_KNOWLEDGE_SOURCES_AT_WILL_P = makeSymbol("REMOVE-KNOWLEDGE-SOURCES-AT-WILL-P");

    static private final SubLList $list_alt142 = list(list(RET, makeSymbol("REMOVE-KNOWLEDGE-SOURCES-AT-WILL")));

    static private final SubLSymbol $sym143$CYBLACK_PROTO_KNOWLEDGE_SOURCE_REMOVE_KNOWLEDGE_SOURCES_AT_WILL_P = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-REMOVE-KNOWLEDGE-SOURCES-AT-WILL-P-METHOD");

    private static final SubLSymbol SET_REMOVE_KNOWLEDGE_SOURCES_AT_WILL = makeSymbol("SET-REMOVE-KNOWLEDGE-SOURCES-AT-WILL");

    static private final SubLList $list_alt145 = list(list(makeSymbol("CSETQ"), makeSymbol("REMOVE-KNOWLEDGE-SOURCES-AT-WILL"), makeSymbol("NEW-STATE")), list(RET, makeSymbol("NEW-STATE")));

    static private final SubLSymbol $sym146$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym147$CYBLACK_PROTO_KNOWLEDGE_SOURCE_SET_REMOVE_KNOWLEDGE_SOURCES_AT_WI = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-SET-REMOVE-KNOWLEDGE-SOURCES-AT-WILL-METHOD");



    static private final SubLList $list_alt149 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL));

    static private final SubLList $list_alt150 = list(list(makeSymbol("IGNORE"), makeSymbol("ENVIRONMENT")), list(RET, T));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_ON_ACTIVATE_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-ON-ACTIVATE-METHOD");



    static private final SubLList $list_alt153 = list(makeSymbol("ACTIVATION-PATTERN"), makeSymbol("&OPTIONAL"), list(makeSymbol("ARG-IF-ON-STARTUP"), NIL));

    static private final SubLList $list_alt154 = list(list(makeSymbol("IGNORE"), makeSymbol("ARG-IF-ON-STARTUP")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("ACTIVATION-PATTERN")), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("ACTIVATION-PATTERN"))), makeString("(CREATE-PROPOSAL ~S): ~S is not an instance of CYBLACK-ENVIRONMENT."), makeSymbol("SELF"), makeSymbol("ACTIVATION-PATTERN")), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("ACTIVATION-PATTERN")), list(makeSymbol("CYBLACK-SILENCE"), makeSymbol("SELF")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_CREATE_PROPOSAL_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-CREATE-PROPOSAL-METHOD");

    private static final SubLSymbol POST_PROPOSAL = makeSymbol("POST-PROPOSAL");

    static private final SubLList $list_alt157 = list(makeSymbol("PROPOSAL"), makeSymbol("AGENDA"));

    static private final SubLList $list_alt158 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), makeString("(POST-PROPOSAL ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-AGENDA-P"), makeSymbol("AGENDA")), makeString("(POST-PROPOSAL ~S): ~S is not an instance of CYBLACK-AGENDA."), makeSymbol("SELF"), makeSymbol("AGENDA")), list(makeSymbol("PIF"), makeSymbol("POST-AT-WILL"), list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GENERATE-KSI")), makeSymbol("PROPOSAL")))), list(makeSymbol("PWHEN"), makeSymbol("KSI"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KSI"), list(QUOTE, makeSymbol("EXECUTE"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("AGENDA"), list(QUOTE, makeSymbol("PROPOSE")), makeSymbol("PROPOSAL"))), list(RET, NIL));

    static private final SubLSymbol $sym159$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");







    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_POST_PROPOSAL_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-POST-PROPOSAL-METHOD");

    static private final SubLList $list_alt164 = list(makeSymbol("PROPOSAL"));

    static private final SubLList $list_alt165 = list(list(makeSymbol("IGNORE"), makeSymbol("PROPOSAL")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_GENERATE_KSI_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-GENERATE-KSI-METHOD");



    static private final SubLList $list_alt168 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_ON_STARTUP_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-ON-STARTUP-METHOD");



    static private final SubLList $list_alt171 = list(list(makeSymbol("ON-SHUTDOWN"), makeSymbol("SUPER")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-ON-SHUTDOWN-METHOD");



    static private final SubLList $list_alt174 = list(makeSymbol("KNOWLEDGE-SOURCE-INSTANTIATION"));

    static private final SubLList $list_alt175 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION-P"), makeSymbol("KNOWLEDGE-SOURCE-INSTANTIATION")), makeString("(LINK-KSI ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION."), makeSymbol("SELF"), makeSymbol("KNOWLEDGE-SOURCE-INSTANTIATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE-INSTANTIATION"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KNOWLEDGE-SOURCE-INSTANTIATION"), list(QUOTE, makeSymbol("SET-KNOWLEDGE-SOURCE")), makeSymbol("SELF")), list(RET, makeSymbol("KNOWLEDGE-SOURCE-INSTANTIATION")));

    static private final SubLSymbol $sym176$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");





    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_LINK_KSI_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-LINK-KSI-METHOD");



    static private final SubLList $list_alt181 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("AUTHOR-NAMES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), NIL), list(makeSymbol("CSETQ"), makeSymbol("IS-A-MONITOR"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym182$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-INITIALIZE-METHOD");



    static private final SubLList $list_alt185 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt186 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(POST ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("MUST"), makeSymbol("POST-AT-WILL"), makeString("(POST ~S): This knowledge source does not have permission to post at will."), makeSymbol("SELF")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(POST ~S): This knowledge source is not associated with an application."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("BLACKBOARD"), makeString("(POST ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(RET, list(makeSymbol("CYBLACK-BLACKBOARD-POST"), makeSymbol("BLACKBOARD"), makeSymbol("POSTING")))));

    static private final SubLSymbol $sym187$OUTER_CATCH_FOR_CYBLACK_PROTO_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PROTO-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLString $str_alt188$_POST__S___This_knowledge_source_ = makeString("(POST ~S): This knowledge source does not have permission to post at will.");

    private static final SubLSymbol CYBLACK_PROTO_KNOWLEDGE_SOURCE_POST_METHOD = makeSymbol("CYBLACK-PROTO-KNOWLEDGE-SOURCE-POST-METHOD");

    private static final SubLSymbol CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-SELF-MOTIVATED-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt191 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym192$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOUR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SELF-MOTIVATED-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLSymbol $sym193$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOUR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SELF-MOTIVATED-KNOWLEDGE-SOURCE-INSTANCE");

    static private final SubLList $list_alt194 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("POST-AT-WILL"), T), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym195$OUTER_CATCH_FOR_CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SELF-MOTIVATED-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_SELF_MOTIVATED_KNOWLEDGE_SOURCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-SELF-MOTIVATED-KNOWLEDGE-SOURCE-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_PATTERN_BASED_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-PATTERN-BASED-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt198 = list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE"), makeSymbol("CYBLACK-PATTERN-BASED-BLACKBOARD-DAEMON"));

    static private final SubLList $list_alt199 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE"), makeSymbol("CYBLACK-PATTERN-BASED-BLACKBOARD-DAEMON")));

    static private final SubLList $list_alt200 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRECONDITION-PATTERN"), list(makeSymbol("NEW-PRECONDITION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-DATATYPES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_PANEL_LINKED_PATTERN_BASED_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-PANEL-LINKED-PATTERN-BASED-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt202 = list(makeSymbol("CYBLACK-PATTERN-BASED-KNOWLEDGE-SOURCE"));

    static private final SubLList $list_alt203 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-PATTERN-BASED-KNOWLEDGE-SOURCE")));

    static private final SubLList $list_alt204 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LINK-TO-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNLINK-FROM-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LINKED-TO-PANELS-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNIFICATION-ROBOT-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), list(makeSymbol("NEW-UNIFICATION-ROBOT-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DOMAIN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RANGE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_REMOVAL_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-REMOVAL-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt206 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE")));

    static private final SubLList $list_alt207 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REMOVAL-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REMOVAL-PATTERN"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt209 = list(makeSymbol("CYBLACK-PANEL-LINKED-PATTERN-BASED-KNOWLEDGE-SOURCE"));

    static private final SubLList $list_alt210 = list(new SubLObject[]{ list(makeSymbol("UNCOMPILED-PRECONDITION-PATTERN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LINKED-TO-PANELS"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("UNIFICATION-ROBOT-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRECONDITION-PATTERN"), list(makeSymbol("NEW-PRECONDITION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-DATATYPES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LINK-TO-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNLINK-FROM-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LINKED-TO-PANELS-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNIFICATION-ROBOT-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-UNIFICATION-ROBOT-CLASS"), list(makeSymbol("NEW-UNIFICATION-ROBOT-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("CACHED-DOMAIN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("HAS-CACHED-DOMAIN-P"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RANGE-SET"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol RANGE_SET = makeSymbol("RANGE-SET");









    public static final SubLInteger $int$4106 = makeInteger(4106);



    public static final SubLInteger $int$4105 = makeInteger(4105);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLSymbol $sym220$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-INSTANCE");



    static private final SubLList $list_alt222 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-PRECONDITION-PATTERN-METHOD");



    static private final SubLList $list_alt225 = list(makeSymbol("NEW-PRECONDITION-PATTERN"));

    static private final SubLList $list_alt226 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_SET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-SET-PRECONDITION-PATTERN-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_PRECONDITION_DATATYPES_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-PRECONDITION-DATATYPES-METHOD");



    static private final SubLList $list_alt231 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(STIMULATE ~S): No application is associated with knowledge source ~S."), makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-BLACKBOARD")))), list(makeSymbol("AGENDA"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-AGENDA"))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("BLACKBOARD"), makeString("(STIMULATE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("AGENDA"), makeString("(STIMULATE ~S): No agenda is associated with application ~S."), makeSymbol("SELF"), makeSymbol("AGENDA")), list(makeSymbol("CLET"), list(list(makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PRECONDITION-PATTERN"))))), list(makeSymbol("PWHEN"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("CYBLACK-PATTERN-SET-ENVIRONMENT"), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("ACTIVATION-PATTERNS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("BLACKBOARD"), list(QUOTE, makeSymbol("UNIFY")), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("UNIFICATION-ROBOT-CLASS"))), makeSymbol("PROPOSAL")), list(makeSymbol("PWHEN"), makeSymbol("ACTIVATION-PATTERNS"), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-MONITORING-KS-P"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PERFORM-ACTION")), makeSymbol("ACTIVATION-PATTERNS")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ACTIVATION-PATTERNS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("ACTIVATION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ACTIVATE")), makeSymbol("ACTIVATION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-PROPOSAL")), makeSymbol("ACTIVATION-PATTERN"))), list(makeSymbol("PWHEN"), makeSymbol("PROPOSAL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POST-PROPOSAL")), makeSymbol("PROPOSAL"), makeSymbol("AGENDA")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ACTIVATE")), makeSymbol("ACTIVATION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-PROPOSAL")), makeSymbol("ACTIVATION-PATTERN"))), list(makeSymbol("PWHEN"), makeSymbol("PROPOSAL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POST-PROPOSAL")), makeSymbol("PROPOSAL"), makeSymbol("AGENDA"))))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ACTIVATION-PATTERNS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR"))))))))), list(RET, NIL));

    static private final SubLSymbol $sym232$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-METHOD");





















    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_STIMULATE_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-STIMULATE-METHOD");



    static private final SubLList $list_alt245 = list(list(makeSymbol("CSETQ"), makeSymbol("LINKED-TO-PANELS"), T), list(RET, T));

    static private final SubLSymbol $sym246$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LINK_TO_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LINK-TO-PANELS-METHOD");

    private static final SubLSymbol UNLINK_FROM_PANELS = makeSymbol("UNLINK-FROM-PANELS");

    static private final SubLList $list_alt249 = list(list(makeSymbol("PUNLESS"), makeSymbol("LINKED-TO-PANELS"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-BAG"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PRECONDITION-DATATYPES"))))), list(makeSymbol("PIF"), makeSymbol("DATATYPE-BAG"), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("FIF"), makeSymbol("APPLICATION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-BLACKBOARD"))), NIL))), list(makeSymbol("PIF"), makeSymbol("BLACKBOARD"), list(makeSymbol("CLET"), list(list(makeSymbol("UNIQUE-ELEMENTS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-UNIQUE-ELEMENTS"), makeSymbol("BASIC-BAG")), makeSymbol("DATATYPE-BAG"))), list(makeSymbol("PANEL"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("DATATYPE"), makeSymbol("UNIQUE-ELEMENTS")), list(makeSymbol("CSETQ"), makeSymbol("PANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD"))), list(makeSymbol("PWHEN"), makeSymbol("PANEL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("REMOVE-DIRECT-KNOWLEDGE-SOURCE")), makeSymbol("SELF")))), list(makeSymbol("CSETQ"), makeSymbol("LINKED-TO-PANELS"), NIL), list(RET, T)), list(makeSymbol("WARN"), makeString("(UNLINK-FROM-PANELS ~S): Unable to unlink ~S from panels (No associated blackboard)."), makeSymbol("SELF"), makeSymbol("SELF")))), list(makeSymbol("WARN"), makeString("(UNLINK-FROM-PANELS ~S): Unable to unlink ~S from panels (No datatypes mentioned in precondition)."), makeSymbol("SELF"), makeSymbol("SELF"))), list(RET, NIL)));

    static private final SubLSymbol $sym250$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLString $str_alt252$_UNLINK_FROM_PANELS__S___Unable_t = makeString("(UNLINK-FROM-PANELS ~S): Unable to unlink ~S from panels (No associated blackboard).");

    static private final SubLString $str_alt253$_UNLINK_FROM_PANELS__S___Unable_t = makeString("(UNLINK-FROM-PANELS ~S): Unable to unlink ~S from panels (No datatypes mentioned in precondition).");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_UNLINK_FROM_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-UNLINK-FROM-PANELS-METHOD");

    private static final SubLSymbol LINKED_TO_PANELS_P = makeSymbol("LINKED-TO-PANELS-P");

    static private final SubLList $list_alt256 = list(list(RET, makeSymbol("LINKED-TO-PANELS")));

    static private final SubLSymbol $sym257$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LINKED_TO_PANELS_P_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LINKED-TO-PANELS-P-METHOD");

    private static final SubLSymbol GET_UNIFICATION_ROBOT_CLASS = makeSymbol("GET-UNIFICATION-ROBOT-CLASS");

    static private final SubLList $list_alt260 = list(list(RET, makeSymbol("UNIFICATION-ROBOT-CLASS")));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_UNIFICATION_ROBOT_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-UNIFICATION-ROBOT-CLASS-METHOD");



    static private final SubLList $list_alt263 = list(makeSymbol("NEW-UNIFICATION-ROBOT-CLASS"));

    static private final SubLList $list_alt264 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-UNIFICATION-ROBOT-CLASS")), makeString("(SET-UNIFICATION-ROBOT-CLASS ~S): ~S is not a potential symbolic name for a class.  A symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-UNIFICATION-ROBOT-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("UNIFICATION-ROBOT-CLASS"), makeSymbol("NEW-UNIFICATION-ROBOT-CLASS")), list(RET, makeSymbol("NEW-UNIFICATION-ROBOT-CLASS")));

    static private final SubLSymbol $sym265$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_SET_UNIFICATION_ROBOT_CLASS_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-SET-UNIFICATION-ROBOT-CLASS-METHOD");

    static private final SubLList $list_alt267 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("LINKED-TO-PANELS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("UNIFICATION-ROBOT-CLASS"), list(QUOTE, makeSymbol("CYBLACK-UNIFICATION-ROBOT"))), list(makeSymbol("CSETQ"), makeSymbol("HAS-CACHED-DOMAIN-P"), NIL), list(makeSymbol("CSETQ"), makeSymbol("RANGE-SET"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym268$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-INITIALIZE-METHOD");



    static private final SubLList $list_alt272 = list(list(RET, makeSymbol("APPLICATION")));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-APPLICATION-METHOD");

    static private final SubLList $list_alt274 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt275 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym276$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-SET-APPLICATION-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_ON_STARTUP_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-ON-STARTUP-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-ON-SHUTDOWN-METHOD");



    static private final SubLList $list_alt281 = list(list(makeSymbol("PUNLESS"), makeSymbol("APPLICATION"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION")))), list(makeSymbol("PUNLESS"), makeSymbol("BLACKBOARD"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeSymbol("APPLICATION")))), list(makeSymbol("PUNLESS"), makeSymbol("DATATYPE-DICTIONARY"), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-BAG"), list(makeSymbol("GET-PRECONDITION-DATATYPES"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("DATATYPE-BAG"), list(makeSymbol("CLET"), list(list(makeSymbol("UNIQUE-DATATYPES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-UNIQUE-ELEMENTS"), makeSymbol("BASIC-BAG")), makeSymbol("DATATYPE-BAG")))), list(makeSymbol("PWHEN"), makeSymbol("UNIQUE-DATATYPES"), list(makeSymbol("CLET"), list(list(makeSymbol("PANELS"), NIL), list(makeSymbol("PANEL"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("DATATYPE"), makeSymbol("UNIQUE-DATATYPES")), list(makeSymbol("CSETQ"), makeSymbol("PANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD"))), list(makeSymbol("PWHEN"), makeSymbol("PANEL"), list(makeSymbol("CPUSH"), makeSymbol("PANEL"), makeSymbol("PANELS")))), list(RET, makeSymbol("PANELS"))))))))), list(RET, NIL));

    static private final SubLSymbol $sym282$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-PANELS-METHOD");



    static private final SubLList $list_alt285 = list(list(makeSymbol("PWHEN"), makeSymbol("HAS-CACHED-DOMAIN-P"), list(RET, makeSymbol("CACHED-DOMAIN"))), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-BAG"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PRECONDITION-DATATYPES"))))), list(makeSymbol("PWHEN"), makeSymbol("DATATYPE-BAG"), list(makeSymbol("CSETQ"), makeSymbol("CACHED-DOMAIN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE-BAG"), list(QUOTE, makeSymbol("GET-UNIQUE-ELEMENTS")))), list(makeSymbol("CSETQ"), makeSymbol("HAS-CACHED-DOMAIN-P"), T), list(RET, makeSymbol("CACHED-DOMAIN"))), list(RET, NIL)));

    static private final SubLSymbol $sym286$OUTER_CATCH_FOR_CYBLACK_BASIC_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KNOWLEDGE-SOURCE-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_DOMAIN_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-DOMAIN-METHOD");

    private static final SubLSymbol GET_RANGE = makeSymbol("GET-RANGE");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_GET_RANGE_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-GET-RANGE-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE");

    static private final SubLList $list_alt292 = list(new SubLObject[]{ list(makeSymbol("PRECONDITION-PATTERN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRECONDITION-DATATYPES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRECONDITION-PATTERN"), list(makeSymbol("NEW-PRECONDITION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPLETE-PRECONDITION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-DATATYPES"), NIL, makeKeyword("PUBLIC")) });





    static private final SubLSymbol $sym295$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLSymbol $sym296$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-INSTANCE");

    static private final SubLList $list_alt297 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-PATTERN"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-DATATYPES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym298$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-INITIALIZE-METHOD");

    static private final SubLList $list_alt300 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("CYBLACK-PRECON-OR-MONITORING-PATTERN-P"), makeSymbol("PRECONDITION-PATTERN"))), makeString("(LINK-TO-PANELS ~S): No precondition pattern is associated with this knowledge source."), makeSymbol("SELF")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(LINK-TO-PANELS ~S): No application is associated with this knowledge source."), makeSymbol("SELF")), list(makeSymbol("LINK-TO-PANELS"), makeSymbol("SUPER")), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-BAG"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PRECONDITION-PATTERN"), list(QUOTE, makeSymbol("GET-DATATYPE-BAG")))), list(makeSymbol("BLACKBOARD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-BLACKBOARD"))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("BLACKBOARD"), makeString("(LINK-TO-PANELS ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("PWHEN"), makeSymbol("DATATYPE-BAG"), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE-BAG"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR")))), makeSymbol("DATATYPE"), makeSymbol("PANEL")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST")))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("DATATYPE"))), makeString("(LINK-TO-PANELS ~S): ~S is not a valid datatype."), makeSymbol("SELF"), makeSymbol("DATATYPE")), list(makeSymbol("CSETQ"), makeSymbol("PANEL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE"), list(QUOTE, makeSymbol("GET-PANEL")), makeSymbol("BLACKBOARD"))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("PANEL"), makeString("(LINK-TO-PANELS ~S): No panel is associated with datatype ~S and blackboard ~S."), makeSymbol("SELF"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE")), makeSymbol("SELF")), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("DATATYPE"))), makeString("(LINK-TO-PANELS ~S): ~S is not a valid datatype."), makeSymbol("SELF"), makeSymbol("DATATYPE")), list(makeSymbol("CSETQ"), makeSymbol("PANEL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE"), list(QUOTE, makeSymbol("GET-PANEL")), makeSymbol("BLACKBOARD"))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("PANEL"), makeString("(LINK-TO-PANELS ~S): No panel is associated with datatype ~S and blackboard ~S."), makeSymbol("SELF"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE")), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE-BAG"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR"))))), list(RET, NIL));

    static private final SubLSymbol $sym301$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-METHOD");







    private static final SubLSymbol CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_LINK_TO_PANELS_METHOD = makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-LINK-TO-PANELS-METHOD");

    static private final SubLList $list_alt306 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("PCOND"), list(makeSymbol("UNCOMPILED-PRECONDITION-PATTERN"), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), makeSymbol("UNCOMPILED-PRECONDITION-PATTERN"))), list(makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), makeSymbol("PRECONDITION-PATTERN")))), list(makeSymbol("LINK-TO-PANELS"), makeSymbol("SELF")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_ON_STARTUP_METHOD = makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-ON-STARTUP-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-ON-SHUTDOWN-METHOD");

    static private final SubLList $list_alt309 = list(list(RET, makeSymbol("PRECONDITION-PATTERN")));

    private static final SubLSymbol CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_GET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-GET-PRECONDITION-PATTERN-METHOD");

    static private final SubLList $list_alt311 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-PRECON-PATTERN-P"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-DATATYPES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PRECONDITION-PATTERN"), list(QUOTE, makeSymbol("GET-DATATYPE-BAG")))), list(makeSymbol("CSETQ"), makeSymbol("IS-A-MONITOR"), NIL), list(RET, makeSymbol("NEW-PRECONDITION-PATTERN"))), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-MONITORING-PATTERN-P"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-DATATYPES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PRECONDITION-PATTERN"), list(QUOTE, makeSymbol("GET-DATATYPE-BAG")))), list(makeSymbol("CSETQ"), makeSymbol("IS-A-MONITOR"), T), list(RET, makeSymbol("NEW-PRECONDITION-PATTERN"))), list(makeSymbol("PWHEN"), makeSymbol("APPLICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("PARSER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-PARSER"))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("PARSER"), makeString("(SET-PRECONDITION-PATTERN ~S): No parser is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("PARSER")), list(makeSymbol("PWHEN"), makeSymbol("PARSER"), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PARSER"), list(QUOTE, makeSymbol("PARSE")), makeSymbol("NEW-PRECONDITION-PATTERN"))), list(makeSymbol("PIF"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("CSETQ"), makeSymbol("IS-A-MONITOR"), list(makeSymbol("CYBLACK-MONITORING-PATTERN-P"), makeSymbol("PRECONDITION-PATTERN"))), list(makeSymbol("PROGN"), list(makeSymbol("WARN"), makeString("(SET-PRECONDITION-PATTERN ~S): Failed to parse ~S."), makeSymbol("SELF"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(RET, NIL))), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-DATATYPES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PRECONDITION-PATTERN"), list(QUOTE, makeSymbol("GET-DATATYPE-BAG")))), list(makeSymbol("CSETQ"), makeSymbol("UNCOMPILED-PRECONDITION-PATTERN"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-PRECONDITION-PATTERN"))), list(RET, makeSymbol("PRECONDITION-PATTERN"))))), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-PATTERN"), NIL), list(makeSymbol("CSETQ"), makeSymbol("UNCOMPILED-PRECONDITION-PATTERN"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-PRECONDITION-PATTERN"))), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-DATATYPES"), NIL), list(RET, NIL));

    static private final SubLSymbol $sym312$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-METHOD");





    static private final SubLString $str_alt315$_SET_PRECONDITION_PATTERN__S___Fa = makeString("(SET-PRECONDITION-PATTERN ~S): Failed to parse ~S.");

    private static final SubLSymbol CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_SET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-SET-PRECONDITION-PATTERN-METHOD");

    private static final SubLSymbol COMPLETE_PRECONDITION_PATTERN = makeSymbol("COMPLETE-PRECONDITION-PATTERN");

    static private final SubLList $list_alt318 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NULL"), makeSymbol("PRECONDITION-PATTERN")), makeSymbol("UNCOMPILED-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), makeSymbol("UNCOMPILED-PRECONDITION-PATTERN")))), list(RET, makeSymbol("PRECONDITION-PATTERN")));

    static private final SubLSymbol $sym319$OUTER_CATCH_FOR_CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym320$CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_COMPLETE_PRECONDITION_PATTERN_M = makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-COMPLETE-PRECONDITION-PATTERN-METHOD");

    static private final SubLList $list_alt321 = list(list(RET, makeSymbol("PRECONDITION-DATATYPES")));

    static private final SubLSymbol $sym322$CYBLACK_INTERNAL_KNOWLEDGE_SOURCE_GET_PRECONDITION_DATATYPES_METH = makeSymbol("CYBLACK-INTERNAL-KNOWLEDGE-SOURCE-GET-PRECONDITION-DATATYPES-METHOD");

    private static final SubLSymbol CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-CONSTRAINED-KNOWLEDGE-SOURCE");

    static private final SubLSymbol $sym324$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLSymbol $sym325$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-KNOWLEDGE-SOURCE-INSTANCE");

    static private final SubLList $list_alt326 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("UNIFICATION-ROBOT-CLASS"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym327$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CONSTRAINED-KNOWLEDGE-SOURCE-METHOD");



    private static final SubLSymbol CYBLACK_CONSTRAINED_KNOWLEDGE_SOURCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-CONSTRAINED-KNOWLEDGE-SOURCE-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-SINGLE-MATCH-CONSTRAINED-KNOWLEDGE-SOURCE");

    static private final SubLSymbol $sym331$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOW = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SINGLE-MATCH-CONSTRAINED-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLSymbol $sym332$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOW = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SINGLE-MATCH-CONSTRAINED-KNOWLEDGE-SOURCE-INSTANCE");

    static private final SubLList $list_alt333 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("UNIFICATION-ROBOT-CLASS"), list(QUOTE, makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym334$OUTER_CATCH_FOR_CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SINGLE-MATCH-CONSTRAINED-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLSymbol $sym336$CYBLACK_SINGLE_MATCH_CONSTRAINED_KNOWLEDGE_SOURCE_INITIALIZE_METH = makeSymbol("CYBLACK-SINGLE-MATCH-CONSTRAINED-KNOWLEDGE-SOURCE-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_MONITORING_KS = makeSymbol("CYBLACK-MONITORING-KS");

    static private final SubLList $list_alt338 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATE-CHANGE-LISTENER-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STATE-CHANGE-LISTENER-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATE-CHANGE-LISTENER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STATE-CHANGE-LISTENER"), list(makeSymbol("NEW-STATE-CHANGE-LISTENER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTION-QUALIFIERS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GATHER-ALL-POSTINGS"), list(makeSymbol("DATATYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GATHER-ALL-DIRECT-POSTINGS"), list(makeSymbol("DATATYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTIVATION-PATTERNS")), makeKeyword("PROTECTED")) });

    static private final SubLList $list_alt339 = list(makeSymbol("ACTIVATION-PATTERNS"));

    static private final SubLList $list_alt340 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), makeSymbol("ACTIVATION-PATTERNS"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("ACTIVATION-PATTERNS")))), list(RET, NIL)), list(makeSymbol("PWHEN"), makeSymbol("ACTIVATION-PATTERNS"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-FIRST-ACTIVATION-PATTERN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NTH"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("ACTIVATION-PATTERNS"), ZERO_INTEGER)), list(makeSymbol("TEMPLATE-THE-POSTING-BINDING"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-BINDING"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("TEMPLATE-FIRST-ACTIVATION-PATTERN"), list(QUOTE, makeSymbol("?THE-POSTING")))), list(makeSymbol("TEMPLATE-THE-POSTING"), list(makeSymbol("FIF"), makeSymbol("TEMPLATE-THE-POSTING-BINDING"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-VALUE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("TEMPLATE-THE-POSTING-BINDING")), NIL)), list(makeSymbol("TEMPLATE-MOST-LOCAL-BINDING"), list(makeSymbol("FIF"), makeSymbol("TEMPLATE-THE-POSTING-BINDING"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-BINDING-BY-VALUE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("TEMPLATE-FIRST-ACTIVATION-PATTERN"), makeSymbol("TEMPLATE-THE-POSTING")), NIL)), list(makeSymbol("TEMPLATE-THE-POSTING-BINDING-TYPE"), list(makeSymbol("FIF"), makeSymbol("TEMPLATE-MOST-LOCAL-BINDING"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TYPE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("TEMPLATE-MOST-LOCAL-BINDING")), NIL))), list(makeSymbol("PCASE"), list(makeSymbol("GET-ACTION"), makeSymbol("SELF")), list($SEND, list(makeSymbol("CDOLIST"), list(makeSymbol("ACTION-QUALIFIER"), list(makeSymbol("GET-ACTION-QUALIFIERS"), makeSymbol("SELF"))), list(makeSymbol("PCASE"), makeSymbol("ACTION-QUALIFIER"), list(makeKeyword("ALL-POSTINGS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TRANSMIT-STATE-CHANGE"), makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER")), list(makeSymbol("GET-STATE-CHANGE-LISTENER"), makeSymbol("SELF")), $POST, list(makeSymbol("GATHER-ALL-POSTINGS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-THE-POSTING-BINDING-TYPE")))), list(makeKeyword("ALL-DIRECT-POSTINGS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TRANSMIT-STATE-CHANGE"), makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER")), list(makeSymbol("GET-STATE-CHANGE-LISTENER"), makeSymbol("SELF")), $POST, list(makeSymbol("GATHER-ALL-DIRECT-POSTINGS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-THE-POSTING-BINDING-TYPE")))), list(makeKeyword("NEW-POSTING"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TRANSMIT-STATE-CHANGE"), makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER")), list(makeSymbol("GET-STATE-CHANGE-LISTENER"), makeSymbol("SELF")), $POST, list(makeSymbol("LIST"), makeSymbol("TEMPLATE-THE-POSTING")))), list(makeKeyword("NEW-DIRECT-POSTING"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-POSTING-TYPE"), list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("TEMPLATE-THE-POSTING")))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("TEMPLATE-POSTING-TYPE"), makeSymbol("TEMPLATE-THE-POSTING-BINDING")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TRANSMIT-STATE-CHANGE"), makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER")), list(makeSymbol("GET-STATE-CHANGE-LISTENER"), makeSymbol("SELF")), $POST, list(makeSymbol("LIST"), makeSymbol("TEMPLATE-THE-POSTING")))))), list(makeKeyword("ADDED-OR-INACTIVATED-POSTING"), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-POSTING-ACTIVE-P"), makeSymbol("TEMPLATE-THE-POSTING")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TRANSMIT-STATE-CHANGE"), makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER")), list(makeSymbol("GET-STATE-CHANGE-LISTENER"), makeSymbol("SELF")), $POST, list(makeSymbol("LIST"), makeSymbol("TEMPLATE-THE-POSTING"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TRANSMIT-STATE-CHANGE"), makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER")), list(makeSymbol("GET-STATE-CHANGE-LISTENER"), makeSymbol("SELF")), makeKeyword("REMOVE-POST"), list(makeSymbol("LIST"), makeSymbol("TEMPLATE-THE-POSTING"))))), list(makeKeyword("ADDED-OR-INACTIVATED-DIRECT-POSTING"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-POSTING-TYPE"), list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("TEMPLATE-THE-POSTING")))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("TEMPLATE-POSTING-TYPE"), makeSymbol("TEMPLATE-THE-POSTING-BINDING")), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-POSTING-ACTIVE-P"), makeSymbol("TEMPLATE-THE-POSTING")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TRANSMIT-STATE-CHANGE"), makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER")), list(makeSymbol("GET-STATE-CHANGE-LISTENER"), makeSymbol("SELF")), $POST, list(makeSymbol("LIST"), makeSymbol("TEMPLATE-THE-POSTING"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("TRANSMIT-STATE-CHANGE"), makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER")), list(makeSymbol("GET-STATE-CHANGE-LISTENER"), makeSymbol("SELF")), $POST, list(makeSymbol("LIST"), makeSymbol("TEMPLATE-THE-POSTING")))))))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("WARN"), makeString("(PERFORM-ACTION ~S): ~S is not a member of the CYBLACK-MONITORING-PATTERN-ACTION-TYPE ~\n            enumeration."), makeSymbol("SELF"), list(makeSymbol("GET-ACTION"), makeSymbol("SELF"))))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS");

    static private final SubLList $list_alt342 = list(makeSymbol("CYBLACK-MONITORING-KS"));

    static private final SubLList $list_alt343 = list(new SubLObject[]{ list(makeSymbol("ACTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ACTION-QUALIFIERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STATE-CHANGE-LISTENER-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STATE-CHANGE-LISTENER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRECONDITION-PATTERN"), list(makeSymbol("NEW-PRECONDITION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATE-CHANGE-LISTENER-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STATE-CHANGE-LISTENER-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATE-CHANGE-LISTENER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STATE-CHANGE-LISTENER"), list(makeSymbol("NEW-STATE-CHANGE-LISTENER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTION"), list(makeSymbol("NEW-ACTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTION-QUALIFIERS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTION-QUALIFIERS"), list(makeSymbol("NEW-ACTION-QUALIFIERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GATHER-ALL-POSTINGS"), list(makeSymbol("DATATYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GATHER-ALL-DIRECT-POSTINGS"), list(makeSymbol("DATATYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTIVATION-PATTERNS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")) });









    static private final SubLSymbol $sym348$_THE_POSTING = makeSymbol("?THE-POSTING");

    private static final SubLSymbol $ALL_POSTINGS = makeKeyword("ALL-POSTINGS");



    private static final SubLSymbol $ALL_DIRECT_POSTINGS = makeKeyword("ALL-DIRECT-POSTINGS");

    private static final SubLSymbol $NEW_POSTING = makeKeyword("NEW-POSTING");

    private static final SubLSymbol $NEW_DIRECT_POSTING = makeKeyword("NEW-DIRECT-POSTING");

    private static final SubLSymbol $ADDED_OR_INACTIVATED_POSTING = makeKeyword("ADDED-OR-INACTIVATED-POSTING");

    private static final SubLSymbol $REMOVE_POST = makeKeyword("REMOVE-POST");

    private static final SubLSymbol $ADDED_OR_INACTIVATED_DIRECT_POSTING = makeKeyword("ADDED-OR-INACTIVATED-DIRECT-POSTING");

    static private final SubLString $str_alt358$_PERFORM_ACTION__S____S_is_not_a_ = makeString("(PERFORM-ACTION ~S): ~S is not a member of the CYBLACK-MONITORING-PATTERN-ACTION-TYPE ~\n            enumeration.");

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_PERFORM_ACTION_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-PERFORM-ACTION-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_MONITORING_KS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-MONITORING-KS-CLASS");

    static private final SubLSymbol $sym361$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_MONITORING_KS_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-MONITORING-KS-INSTANCE");

    static private final SubLList $list_alt362 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ACTION"), $SEND), list(makeSymbol("CSETQ"), makeSymbol("ACTION-QUALIFIERS"), list(makeSymbol("LIST"), makeKeyword("NEW-POSTING"))), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER-CLASS"), list(QUOTE, makeSymbol("CYBLACK-INTERNAL-STATE-CHANGE-LISTENER"))), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("UNIFICATION-ROBOT-CLASS"), list(QUOTE, makeSymbol("CYBLACK-MONITORING-UNIFICATION-ROBOT"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym363$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_STATE_CHANGE_LISTENER = makeSymbol("CYBLACK-INTERNAL-STATE-CHANGE-LISTENER");

    private static final SubLSymbol CYBLACK_MONITORING_UNIFICATION_ROBOT = makeSymbol("CYBLACK-MONITORING-UNIFICATION-ROBOT");

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_INITIALIZE_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-INITIALIZE-METHOD");

    static private final SubLList $list_alt367 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("CONSP"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("="), list(makeSymbol("LENGTH"), makeSymbol("NEW-PRECONDITION-PATTERN")), EIGHT_INTEGER), makeString("(SET-PRECONDITION-PATTERN ~S): ~S is not a valid monitoring pattern."), makeSymbol("SELF"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CLET"), list(list(makeSymbol("THIRD-ELEMENT"), list(makeSymbol("NTH"), TWO_INTEGER, makeSymbol("NEW-PRECONDITION-PATTERN")))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-MONITORING-PATTERN-ACTION-TYPE-P"), makeSymbol("THIRD-ELEMENT")), makeString("(SET-PRECONDITION-PATTERN ~S): ~S is not a member of the ~\n               CYBLACK-MONITORING-PATTERN-ACTION-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("THIRD-ELEMENT")), list(makeSymbol("CSETQ"), makeSymbol("ACTION"), makeSymbol("THIRD-ELEMENT"))), list(makeSymbol("CLET"), list(list(makeSymbol("FOURTH-ELEMENT"), list(makeSymbol("NTH"), THREE_INTEGER, makeSymbol("NEW-PRECONDITION-PATTERN")))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("CYBLACK-MONITORING-PATTERN-ACTION-QUALIFIER-TYPE-P"), makeSymbol("FOURTH-ELEMENT")), list(makeSymbol("CYBLACK-MONITORING-PATTERN-ACTION-QUALIFIER-TYPE-LIST-P"), makeSymbol("FOURTH-ELEMENT"))), makeString("(SET-PRECONDITION-PATTERN ~S): ~S is neither an action qualifier nor ~\n               a list of action qualifiers."), makeSymbol("SELF"), makeSymbol("FOURTH-ELEMENT")), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-MONITORING-PATTERN-ACTION-QUALIFIER-TYPE-P"), makeSymbol("FOURTH-ELEMENT")), list(makeSymbol("CSETQ"), makeSymbol("ACTION-QUALIFIERS"), list(makeSymbol("LIST"), makeSymbol("FOURTH-ELEMENT"))), list(makeSymbol("CSETQ"), makeSymbol("ACTION-QUALIFIERS"), list(makeSymbol("COPY-LIST"), makeSymbol("FOURTH-ELEMENT"))))), list(RET, list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SUPER"), makeSymbol("NEW-PRECONDITION-PATTERN")))), list(list(makeSymbol("CYBLACK-MONITORING-PATTERN-P"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("ACTION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ACTION"), makeSymbol("CYBLACK-MONITORING-PATTERN")), makeSymbol("NEW-PRECONDITION-PATTERN"))), list(makeSymbol("CSETQ"), makeSymbol("ACTION-QUALIFIERS"), list(makeSymbol("COPY-TREE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ACTION-QUALIFIERS"), makeSymbol("CYBLACK-MONITORING-PATTERN")), makeSymbol("NEW-PRECONDITION-PATTERN")))), list(RET, list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SUPER"), makeSymbol("NEW-PRECONDITION-PATTERN")))), list(T, list(makeSymbol("ERROR"), makeString("(SET-PRECONDITION-PATTERN ~S): ~S is not a valid monitoring pattern."), makeSymbol("SELF"), makeSymbol("NEW-PRECONDITION-PATTERN")))), list(RET, NIL));

    static private final SubLSymbol $sym368$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-MONITORING-KS-METHOD");

    static private final SubLString $str_alt369$_SET_PRECONDITION_PATTERN__S____S = makeString("(SET-PRECONDITION-PATTERN ~S): ~S is not a valid monitoring pattern.");

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_SET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-SET-PRECONDITION-PATTERN-METHOD");

    private static final SubLSymbol GET_STATE_CHANGE_LISTENER_CLASS = makeSymbol("GET-STATE-CHANGE-LISTENER-CLASS");

    static private final SubLList $list_alt372 = list(list(RET, makeSymbol("STATE-CHANGE-LISTENER-CLASS")));

    static private final SubLSymbol $sym373$CYBLACK_INTERNAL_MONITORING_KS_GET_STATE_CHANGE_LISTENER_CLASS_ME = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-GET-STATE-CHANGE-LISTENER-CLASS-METHOD");

    private static final SubLSymbol SET_STATE_CHANGE_LISTENER_CLASS = makeSymbol("SET-STATE-CHANGE-LISTENER-CLASS");

    static private final SubLList $list_alt375 = list(makeSymbol("NEW-CLASS"));

    static private final SubLList $list_alt376 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-CLASS")), list(makeSymbol("CAND"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-CLASS")), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("NEW-CLASS"), list(QUOTE, makeSymbol("CYBLACK-STATE-CHANGE-LISTENER"))))), makeString("(SET-STATE-CHANGE-LISTENER-CLASS ~S): ~S is not a class implementing CYBLACK-STATE-CHANGE-LISTENER."), makeSymbol("SELF"), makeSymbol("NEW-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER-CLASS"), makeSymbol("NEW-CLASS")), list(RET, makeSymbol("NEW-CLASS")));

    static private final SubLSymbol $sym377$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-MONITORING-KS-METHOD");

    static private final SubLSymbol $sym378$CYBLACK_INTERNAL_MONITORING_KS_SET_STATE_CHANGE_LISTENER_CLASS_ME = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-SET-STATE-CHANGE-LISTENER-CLASS-METHOD");



    static private final SubLList $list_alt380 = list(list(RET, makeSymbol("STATE-CHANGE-LISTENER")));

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_GET_STATE_CHANGE_LISTENER_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-GET-STATE-CHANGE-LISTENER-METHOD");

    private static final SubLSymbol SET_STATE_CHANGE_LISTENER = makeSymbol("SET-STATE-CHANGE-LISTENER");

    static private final SubLList $list_alt383 = list(makeSymbol("NEW-STATE-CHANGE-LISTENER"));

    static private final SubLList $list_alt384 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-STATE-CHANGE-LISTENER")), list(makeSymbol("CYBLACK-INTERNAL-STATE-CHANGE-LISTENER-P"), makeSymbol("NEW-STATE-CHANGE-LISTENER"))), makeString("(SET-STATE-CHANGE-LISTENER ~S): ~S is not an instance of CYBLACK-INTERNAL-STATE-CHANGE-LISTENER."), makeSymbol("SELF"), makeSymbol("NEW-STATE-CHANGE-LISTENER")), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER"), makeSymbol("NEW-STATE-CHANGE-LISTENER")), list(RET, makeSymbol("NEW-STATE-CHANGE-LISTENER")));

    static private final SubLSymbol $sym385$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_SET_STATE_CHANGE_LISTENER_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-SET-STATE-CHANGE-LISTENER-METHOD");



    static private final SubLList $list_alt388 = list(list(RET, makeSymbol("ACTION")));

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_GET_ACTION_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-GET-ACTION-METHOD");

    private static final SubLSymbol SET_ACTION = makeSymbol("SET-ACTION");

    static private final SubLList $list_alt391 = list(makeSymbol("NEW-ACTION"));

    static private final SubLList $list_alt392 = list(list(makeSymbol("CSETQ"), makeSymbol("ACTION"), makeSymbol("NEW-ACTION")), list(RET, makeSymbol("NEW-ACTION")));

    static private final SubLSymbol $sym393$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_SET_ACTION_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-SET-ACTION-METHOD");



    static private final SubLList $list_alt396 = list(list(RET, makeSymbol("ACTION-QUALIFIERS")));

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_GET_ACTION_QUALIFIERS_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-GET-ACTION-QUALIFIERS-METHOD");

    private static final SubLSymbol SET_ACTION_QUALIFIERS = makeSymbol("SET-ACTION-QUALIFIERS");

    static private final SubLList $list_alt399 = list(makeSymbol("NEW-ACTION-QUALIFIERS"));

    static private final SubLList $list_alt400 = list(list(makeSymbol("CSETQ"), makeSymbol("ACTION-QUALIFIERS"), makeSymbol("NEW-ACTION-QUALIFIERS")), list(RET, makeSymbol("NEW-ACTION-QUALIFIERS")));

    static private final SubLSymbol $sym401$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_SET_ACTION_QUALIFIERS_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-SET-ACTION-QUALIFIERS-METHOD");

    private static final SubLSymbol GATHER_ALL_POSTINGS = makeSymbol("GATHER-ALL-POSTINGS");

    static private final SubLList $list_alt404 = list(makeSymbol("DATATYPE"));

    static private final SubLList $list_alt405 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DATATYPE"), makeSymbol("APPLICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION")))), list(makeSymbol("PWHEN"), makeSymbol("BLACKBOARD"), list(makeSymbol("CLET"), list(list(makeSymbol("PANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD")))), list(RET, list(makeSymbol("CYBLACK-PANEL-GET-ALL-POSTINGS"), makeSymbol("PANEL"))))))), list(RET, NIL));

    static private final SubLSymbol $sym406$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_GATHER_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-GATHER-ALL-POSTINGS-METHOD");

    private static final SubLSymbol GATHER_ALL_DIRECT_POSTINGS = makeSymbol("GATHER-ALL-DIRECT-POSTINGS");

    static private final SubLList $list_alt409 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DATATYPE"), makeSymbol("APPLICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION")))), list(makeSymbol("PWHEN"), makeSymbol("BLACKBOARD"), list(makeSymbol("CLET"), list(list(makeSymbol("PANEL"), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD")))), list(RET, list(makeSymbol("CYBLACK-PANEL-GET-DIRECT-POSTINGS"), makeSymbol("PANEL"))))))), list(RET, NIL));

    static private final SubLSymbol $sym410$OUTER_CATCH_FOR_CYBLACK_INTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_GATHER_ALL_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-GATHER-ALL-DIRECT-POSTINGS-METHOD");

    static private final SubLList $list_alt412 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("CLET"), list(list(makeSymbol("STATE-CHANGE-LISTENER-CLASS"), list(makeSymbol("GET-STATE-CHANGE-LISTENER-CLASS"), makeSymbol("SELF"))), list(makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("GET-STATE-CHANGE-LISTENER"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(makeSymbol("FIF"), makeSymbol("STATE-CHANGE-LISTENER-CLASS"), makeSymbol("STATE-CHANGE-LISTENER-CLASS"), list(QUOTE, makeSymbol("CYBLACK-INTERNAL-STATE-CHANGE-LISTENER"))))), list(makeSymbol("SET-STATE-CHANGE-LISTENER"), makeSymbol("SELF"), makeSymbol("STATE-CHANGE-LISTENER"))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("APPLICATION"), makeSymbol("CYBLACK-INTERNAL-STATE-CHANGE-LISTENER")), makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER-SET-KNOWLEDGE-SOURCE-METHOD"), makeSymbol("STATE-CHANGE-LISTENER"), makeSymbol("SELF")), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_INTERNAL_MONITORING_KS_ON_STARTUP_METHOD = makeSymbol("CYBLACK-INTERNAL-MONITORING-KS-ON-STARTUP-METHOD");

    static private final SubLString $str_alt414$Lock_for___S = makeString("Lock for: ~S");



    static private final SubLList $list_alt416 = list(new SubLObject[]{ list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CACHED-MESSAGE-BROKER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CACHED-PROPOSAL-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROPOSAL-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("WAITING-ON-LINK-CALLBACK"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INVITATION-TRANSACTION-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("GUID-AS-STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("REJECTED"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("REJECTION-EXCUSES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PORT-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NAME"), list(makeSymbol("NEW-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INFLATE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-INTERNALS"), NIL), list(makeSymbol("NEW-PRECONDITION-PATTERN"), NIL), list(makeSymbol("NEW-STIMULATION-FUNCTION"), NIL), list(makeSymbol("NEW-POST-PROPOSAL-FUNCTION"), NIL), list(makeSymbol("NEW-GENERATE-KSI-FUNCTION"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROPOSAL-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROPOSAL-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-PROPOSAL-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRECONDITION-PATTERN"), list(makeSymbol("NEW-PRECONDITION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-DATATYPES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STIMULATE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ACTIVATE"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("ENVIRONMENT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-PROPOSAL"), list(makeSymbol("ACTIVATION-PATTERN"), makeSymbol("&OPTIONAL"), list(makeSymbol("ARG-IF-ON-STARTUP"), NIL)), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-PROPOSAL-CALLBACK"), list(makeSymbol("PROPOSAL-MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MESSAGE-BROKER"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LINK-TO-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LINK-TO-PANELS-CALLBACK"), list(makeSymbol("MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WAITING-ON-LINK-CALLBACK-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-WAITING-ON-LINK-CALLBACK"), list(makeSymbol("NEW-STATUS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INVITATION-TRANSACTION-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INVITATION-TRANSACTION-ID"), list(makeSymbol("NEW-ID")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REJECTED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REJECTED"), list(makeSymbol("NEW-STATUS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REJECTION-EXCUSES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REJECTION-EXCUSES"), list(makeSymbol("LIST-OF-EXCUSES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-KSI"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GUID-AS-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GUID-AS-STRING"), list(makeSymbol("NEW-GUID-AS-STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PORT-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PORT-ID"), list(makeSymbol("NEW-PORT-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")) });



    private static final SubLSymbol REJECTION_EXCUSES = makeSymbol("REJECTION-EXCUSES");

















    public static final SubLInteger $int$4108 = makeInteger(4108);



    public static final SubLInteger $int$4107 = makeInteger(4107);

    static private final SubLSymbol $sym430$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLSymbol $sym431$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-INSTANCE");

    static private final SubLList $list_alt432 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeString("")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("NEW-EXTERNAL-KNOWLEDGE-SOURCE"))), list(makeSymbol("CSETF"), list(makeSymbol("EKS-KNOWLEDGE-SOURCE"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL-CLASS"), list(QUOTE, makeSymbol("CYBLACK-EXTERNAL-PROPOSAL"))), list(makeSymbol("CSETQ"), makeSymbol("CACHED-PROPOSAL-CLASS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("WAITING-ON-LINK-CALLBACK"), NIL), list(makeSymbol("CSETQ"), makeSymbol("INVITATION-TRANSACTION-ID"), NIL), list(makeSymbol("CSETQ"), makeSymbol("REJECTED"), NIL), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym433$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLString $str_alt434$ = makeString("");



    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-INITIALIZE-METHOD");



    static private final SubLList $list_alt438 = list(list(RET, makeSymbol("NAME")));

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_NAME_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-NAME-METHOD");



    static private final SubLList $list_alt441 = list(makeSymbol("NEW-NAME"));

    static private final SubLList $list_alt442 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-NAME")), list(makeSymbol("STRINGP"), makeSymbol("NAME"))), makeString("(SET-NAME ~S): ~S is not a valid external module name.  A string was expected."), makeSymbol("SELF"), makeSymbol("NEW-NAME")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeSymbol("NEW-NAME")), list(RET, makeSymbol("NEW-NAME")));

    static private final SubLSymbol $sym443$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_NAME_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-NAME-METHOD");

    private static final SubLSymbol INFLATE = makeSymbol("INFLATE");

    static private final SubLList $list_alt446 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-INTERNALS"), NIL), list(makeSymbol("NEW-PRECONDITION-PATTERN"), NIL), list(makeSymbol("NEW-STIMULATION-FUNCTION"), NIL), list(makeSymbol("NEW-POST-PROPOSAL-FUNCTION"), NIL), list(makeSymbol("NEW-GENERATE-KSI-FUNCTION"), NIL));

    static private final SubLList $list_alt447 = list(list(makeSymbol("PUNLESS"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("NEW-EXTERNAL-KNOWLEDGE-SOURCE"), makeSymbol("NEW-INTERNALS"), makeSymbol("NEW-PRECONDITION-PATTERN"), makeSymbol("NEW-STIMULATION-FUNCTION"), makeSymbol("NEW-POST-PROPOSAL-FUNCTION"), makeSymbol("NEW-GENERATE-KSI-FUNCTION"))), list(makeSymbol("WITH-LOCKED-EKS-READ-WRITE"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CYBLACK-APPLICATION"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))))), list(RET, makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym448$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_INFLATE_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-INFLATE-METHOD");



    static private final SubLList $list_alt451 = list(list(makeSymbol("PWHEN"), makeSymbol("CACHED-PROPOSAL-CLASS"), list(RET, makeSymbol("CACHED-PROPOSAL-CLASS"))), list(makeSymbol("PWHEN"), makeSymbol("PROPOSAL-CLASS"), list(makeSymbol("CSETQ"), makeSymbol("CACHED-PROPOSAL-CLASS"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("PROPOSAL-CLASS")))), list(RET, makeSymbol("CACHED-PROPOSAL-CLASS")));

    static private final SubLSymbol $sym452$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_PROPOSAL_CLASS_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-PROPOSAL-CLASS-METHOD");



    static private final SubLList $list_alt455 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-CLASS")), list(makeSymbol("CLASS-P"), makeSymbol("NEW-CLASS"))), makeString("(SET-PROPOSAL-CLASS ~S): ~S is neither a class nor the symbolic name of a class."), makeSymbol("SELF"), makeSymbol("NEW-CLASS")), list(makeSymbol("PUNLESS"), makeSymbol("NEW-CLASS"), list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL-CLASS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CACHED-PROPOSAL-CLASS"), NIL), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL-CLASS"), makeSymbol("NEW-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("CACHED-PROPOSAL-CLASS"), NIL), list(RET, makeSymbol("NEW-CLASS"))), list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL-CLASS"), list(makeSymbol("CLASS-NAME"), makeSymbol("NEW-CLASS"))), list(makeSymbol("CSETQ"), makeSymbol("CACHED-PROPOSAL-CLASS"), makeSymbol("NEW-CLASS")), list(RET, makeSymbol("NEW-CLASS")));

    static private final SubLSymbol $sym456$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_PROPOSAL_CLASS_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-PROPOSAL-CLASS-METHOD");

    private static final SubLSymbol GENERATE_NEW_PROPOSAL = makeSymbol("GENERATE-NEW-PROPOSAL");

    static private final SubLList $list_alt459 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CLASS"), list(makeSymbol("GET-PROPOSAL-CLASS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("CLASS"), list(RET, list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("CLASS"))))), list(RET, list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-EXTERNAL-PROPOSAL")))));

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GENERATE_NEW_PROPOSAL_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GENERATE-NEW-PROPOSAL-METHOD");



    static private final SubLList $list_alt462 = list(list(RET, makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym463$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_EXTERNAL_KNOWLEDGE_SOURCE_M = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLList $list_alt464 = list(list(RET, list(makeSymbol("FIF"), list(makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE")), list(makeSymbol("EKS-PRECONDITION-PATTERN"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE")), NIL)));

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-PRECONDITION-PATTERN-METHOD");

    static private final SubLList $list_alt466 = list(list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("WITH-EKS-READ-WRITE"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-PRECON-PATTERN-P"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-DATATYPES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DATATYPE-BAG"), makeSymbol("CYBLACK-PRECON-PATTERN")), makeSymbol("PRECONDITION-PATTERN"))), list(makeSymbol("CSETQ"), makeSymbol("IS-A-MONITOR"), NIL), list(RET, makeSymbol("NEW-PRECONDITION-PATTERN"))), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-MONITORING-PATTERN-P"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-DATATYPES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DATATYPE-BAG"), makeSymbol("CYBLACK-MONITORING-PATTERN")), makeSymbol("PRECONDITION-PATTERN"))), list(makeSymbol("CSETQ"), makeSymbol("IS-A-MONITOR"), T), list(RET, makeSymbol("NEW-PRECONDITION-PATTERN"))), list(makeSymbol("PWHEN"), makeSymbol("APPLICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("PARSER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-PARSER"))))), list(makeSymbol("PWHEN"), makeSymbol("PARSER"), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PARSER"), list(QUOTE, makeSymbol("PARSE")), makeSymbol("NEW-PRECONDITION-PATTERN"))), list(makeSymbol("PWHEN"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("CSETQ"), makeSymbol("IS-A-MONITOR"), list(makeSymbol("CYBLACK-MONITORING-PATTERN-P"), makeSymbol("PRECONDITION-PATTERN")))), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-DATATYPES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DATATYPE-BAG"), makeSymbol("CYBLACK-PRECON-PATTERN")), makeSymbol("PRECONDITION-PATTERN"))), list(makeSymbol("CSETQ"), makeSymbol("UNCOMPILED-PRECONDITION-PATTERN"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-PRECONDITION-PATTERN"))), list(RET, makeSymbol("PRECONDITION-PATTERN"))))), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-PATTERN"), NIL), list(makeSymbol("CSETQ"), makeSymbol("UNCOMPILED-PRECONDITION-PATTERN"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-PRECONDITION-PATTERN"))), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION-DATATYPES"), NIL))), list(RET, makeSymbol("NEW-PRECONDITION-PATTERN")));

    static private final SubLSymbol $sym467$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-PRECONDITION-PATTERN-METHOD");

    static private final SubLList $list_alt469 = list(list(RET, list(makeSymbol("FIF"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("EKS-PRECONDITION-DATATYPES"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE")), NIL)));

    static private final SubLSymbol $sym470$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_PRECONDITION_DATATYPES_METH = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-PRECONDITION-DATATYPES-METHOD");

    static private final SubLList $list_alt471 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(STIMULATE ~S): No application is associated with knowledge source ~S."), makeSymbol("SELF"), makeSymbol("SELF")), list(makeSymbol("PWHEN"), list(makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE")), list(makeSymbol("WITH-EKS-READ-ONLY"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-BLACKBOARD"))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("BLACKBOARD"), makeString("(STIMULATE ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("PWHEN"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("CYBLACK-PATTERN-SET-ENVIRONMENT"), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("ACTIVATION-PATTERNS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("BLACKBOARD"), list(QUOTE, makeSymbol("UNIFY")), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("UNIFICATION-ROBOT-CLASS")))), list(makeSymbol("PWHEN"), makeSymbol("ACTIVATION-PATTERNS"), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-MONITORING-KS-P"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PERFORM-ACTION")), makeSymbol("ACTIVATION-PATTERNS")), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ACTIVATION-PATTERNS"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("ACTIVATION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ACTIVATE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-PROPOSAL")), makeSymbol("ACTIVATION-PATTERN"))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ACTIVATE")), makeSymbol("ACTIVATION-PATTERN")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-PROPOSAL")), makeSymbol("ACTIVATION-PATTERN")))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ACTIVATION-PATTERNS"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")))))))), list(RET, NIL))));

    static private final SubLSymbol $sym472$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_STIMULATE_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-STIMULATE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_ON_ACTIVATE_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-ON-ACTIVATE-METHOD");

    static private final SubLList $list_alt475 = list(list(makeSymbol("IGNORE"), makeSymbol("ARG-IF-ON-STARTUP")), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("GET-MESSAGE-BROKER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MESSAGE-BROKER"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("STIMULATE"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("MESSAGE-BROKER"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), makeSymbol("ACTIVATION-PATTERN")))), list(RET, NIL));

    static private final SubLSymbol $sym476$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_CREATE_PROPOSAL_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-CREATE-PROPOSAL-METHOD");

    private static final SubLSymbol CREATE_PROPOSAL_CALLBACK = makeSymbol("CREATE-PROPOSAL-CALLBACK");

    static private final SubLList $list_alt479 = list(makeSymbol("PROPOSAL-MESSAGE"));

    static private final SubLList $list_alt480 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("PROPOSAL-MESSAGE")), list(makeSymbol("CYBLACK-PROPOSE-MESSAGE-P"), makeSymbol("PROPOSAL-MESSAGE"))), makeString("(CREATE-PROPOSAL-CALLBACK ~S): ~S is not an instance of CYBLACK-PROPOSAL-MESSAGE."), makeSymbol("SELF"), makeSymbol("PROPOSAL-MESSAGE")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(CREATE-PROPOSAL-CALLBACK ~S): No application is associated with this knowledge source."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("CAUSE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CAUSE"), makeSymbol("CYBLACK-PROPOSAL-MESSAGE")), makeSymbol("PROPOSAL-MESSAGE"))), list(makeSymbol("AGENDA"), list(makeSymbol("CYBLACK-APPLICATION-GET-AGENDA"), makeSymbol("APPLICATION")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("CAUSE"), makeString("(CREATE-PROPOSAL-CALLBACK ~S): The proposal message ~S has no cause."), makeSymbol("SELF"), makeSymbol("PROPOSAL-MESSAGE")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("AGENDA"), makeString("(CREATE-PROPOSAL-CALLBACK ~S): The ~S application has no associated agenda."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("PROPOSAL"), list(makeSymbol("GENERATE-NEW-PROPOSAL"), makeSymbol("SELF"))), list(makeSymbol("CAUSE-ACTIVATION-PATTERN"), list(makeSymbol("FIF"), list(makeSymbol("CYBLACK-STIMULATE-MESSAGE-P"), makeSymbol("CAUSE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ACTIVATION-PATTERN"), makeSymbol("CYBLACK-STIMULATE-MESSAGE")), makeSymbol("CAUSE")), NIL)), list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("GET-MESSAGE-BROKER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("MESSAGE-BROKER"), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-MANAGER"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("MESSAGE-BROKER")))), list(makeSymbol("PWHEN"), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INTERN"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROPID"), makeSymbol("CYBLACK-PROPOSE-MESSAGE")), makeSymbol("PROPOSAL-MESSAGE")), makeKeyword("PROPOSAL"), makeSymbol("PROPOSAL"))))), list(makeSymbol("CYBLACK-PROPOSAL-SET-KNOWLEDGE-SOURCE"), makeSymbol("PROPOSAL"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-PROPOSAL-SET-APPLICATION"), makeSymbol("PROPOSAL"), makeSymbol("APPLICATION")), list(makeSymbol("CYBLACK-PROPOSAL-SET-ACTIVATION-PATTERN"), makeSymbol("PROPOSAL"), list(makeSymbol("FIF"), list(makeSymbol("CYBLACK-ENVIRONMENT-P"), makeSymbol("CAUSE-ACTIVATION-PATTERN")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLONE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("CAUSE-ACTIVATION-PATTERN")), NIL)), list(makeSymbol("CYBLACK-PROPOSAL-SET-AGENDA"), makeSymbol("PROPOSAL"), makeSymbol("AGENDA")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-P"), makeSymbol("PROPOSAL")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), makeSymbol("CYBLACK-EXTERNAL-PROPOSAL")), makeSymbol("PROPOSAL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DATATYPE-BAG"), makeSymbol("CYBLACK-PROPOSE-MESSAGE")), makeSymbol("PROPOSAL-MESSAGE")))), list(makeSymbol("CYBLACK-PROPOSAL-SET-REASONS"), makeSymbol("PROPOSAL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-REASONS"), makeSymbol("CYBLACK-PROPOSE-MESSAGE")), makeSymbol("PROPOSAL-MESSAGE"))), list(makeSymbol("POST-PROPOSAL"), makeSymbol("SELF"), makeSymbol("PROPOSAL"), makeSymbol("AGENDA")), list(RET, makeSymbol("PROPOSAL")) })));

    static private final SubLSymbol $sym481$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");



    private static final SubLSymbol $PROPOSAL = makeKeyword("PROPOSAL");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_CREATE_PROPOSAL_CALLBACK_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-CREATE-PROPOSAL-CALLBACK-METHOD");



    static private final SubLList $list_alt486 = list(list(makeSymbol("PWHEN"), makeSymbol("CACHED-MESSAGE-BROKER"), list(RET, makeSymbol("CACHED-MESSAGE-BROKER"))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(CREATE-PROPOSAL-CALLBACK ~S): No application is associated with this knowledge source."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-MESSAGE-BROKER"))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("MESSAGE-BROKER"), makeString("(CREATE-PROPOSAL-CALLBACK ~S): No message broker is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("CACHED-MESSAGE-BROKER"), makeSymbol("MESSAGE-BROKER"))), list(RET, makeSymbol("CACHED-MESSAGE-BROKER")));

    static private final SubLSymbol $sym487$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_MESSAGE_BROKER_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-MESSAGE-BROKER-METHOD");

    static private final SubLList $list_alt489 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt490 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(LINK-TO-PANELS ~S): Could not communicate with external module ~S due to inability to access the application."), makeSymbol("SELF"), makeSymbol("NAME")), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("CYBLACK-APPLICATION-GET-MESSAGE-BROKER"), makeSymbol("APPLICATION")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("MESSAGE-BROKER"), makeString("(LINK-TO-PANELS ~S): Could not communicate with external module ~S due to inability to access the message broker of application ~S."), makeSymbol("SELF"), makeSymbol("NAME"), makeSymbol("APPLICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("GUID-MANAGER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-GUID-MANAGER"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("MESSAGE-BROKER")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("GUID-MANAGER"), makeString("(LINK-TO-PANELS ~S): No GUID manager is associated with message broker ~S."), makeSymbol("SELF"), makeSymbol("MESSAGE-BROKER")), list(makeSymbol("CSETQ"), makeSymbol("GUID-AS-STRING"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-MODULE-ID"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("MESSAGE-BROKER"), makeSymbol("NAME"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INTERN"), makeSymbol("CYBLACK-GUID-MANAGER")), makeSymbol("GUID-MANAGER"), makeSymbol("GUID-AS-STRING"), $EMID, makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"))), list(makeSymbol("CSETQ"), makeSymbol("WAITING-ON-LINK-CALLBACK"), T), list(makeSymbol("CSETQ"), makeSymbol("INVITATION-TRANSACTION-ID"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INVITE"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("MESSAGE-BROKER"), makeSymbol("NAME"), makeSymbol("GUID-AS-STRING")))), list(RET, NIL));



    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_LINK_TO_PANELS_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-LINK-TO-PANELS-METHOD");

    private static final SubLSymbol LINK_TO_PANELS_INTERNAL = makeSymbol("LINK-TO-PANELS-INTERNAL");

    static private final SubLList $list_alt494 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), makeString("(LINK-TO-PANELS ~S): No external knowledge source is associated."), makeSymbol("SELF")), list(makeSymbol("WITH-LOCKED-EKS-READ-WRITE"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("PRECONDITION-PATTERN")), list(makeSymbol("CYBLACK-PRECON-OR-MONITORING-PATTERN-P"), makeSymbol("PRECONDITION-PATTERN"))), makeString("(LINK-TO-PANELS ~S): ~S is not a valid precondition-pattern."), makeSymbol("SELF"), makeSymbol("PRECONDITION-PATTERN")), list(makeSymbol("CYBLACK-MUST"), makeSymbol("APPLICATION"), makeString("(LINK-TO-PANELS ~S): No application is associated with this knowledge source."), makeSymbol("SELF")), list(makeSymbol("LINK-TO-PANELS"), makeSymbol("SUPER")), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-BAG"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PRECONDITION-PATTERN"), list(QUOTE, makeSymbol("GET-DATATYPE-BAG")))), list(makeSymbol("BLACKBOARD"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-BLACKBOARD"))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("BLACKBOARD"), makeString("(LINK-TO-PANELS ~S): No blackboard is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("PWHEN"), makeSymbol("DATATYPE-BAG"), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE-BAG"), list(QUOTE, makeSymbol("ALLOCATE-ENUMERATOR")))), makeSymbol("DATATYPE"), makeSymbol("PANEL")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST")))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("DATATYPE"))), makeString("(LINK-TO-PANELS ~S): ~S is not a valid datatype."), makeSymbol("SELF"), makeSymbol("DATATYPE")), list(makeSymbol("CSETQ"), makeSymbol("PANEL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE"), list(QUOTE, makeSymbol("GET-PANEL")), makeSymbol("BLACKBOARD"))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("PANEL"), makeString("(LINK-TO-PANELS ~S): No panel is associated with datatype ~S and blackboard ~S."), makeSymbol("SELF"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE")), makeSymbol("SELF")), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CAND"), makeSymbol("DATATYPE"), list(makeSymbol("CYBLACK-DATATYPE-P"), makeSymbol("DATATYPE"))), makeString("(LINK-TO-PANELS ~S): ~S is not a valid datatype."), makeSymbol("SELF"), makeSymbol("DATATYPE")), list(makeSymbol("CSETQ"), makeSymbol("PANEL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE"), list(QUOTE, makeSymbol("GET-PANEL")), makeSymbol("BLACKBOARD"))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("PANEL"), makeString("(LINK-TO-PANELS ~S): No panel is associated with datatype ~S and blackboard ~S."), makeSymbol("SELF"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("ADD-DIRECT-KNOWLEDGE-SOURCE")), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE-BAG"), list(QUOTE, makeSymbol("DEALLOCATE-ENUMERATOR")), makeSymbol("ENUMERATOR")))))), list(makeSymbol("CSETQ"), makeSymbol("WAITING-ON-LINK-CALLBACK"), NIL), list(makeSymbol("CSETQ"), makeSymbol("REJECTED"), NIL), list(RET, NIL));

    static private final SubLSymbol $sym495$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_LINK_TO_PANELS_INTERNAL_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-LINK-TO-PANELS-INTERNAL-METHOD");

    private static final SubLSymbol LINK_TO_PANELS_CALLBACK = makeSymbol("LINK-TO-PANELS-CALLBACK");

    static private final SubLList $list_alt498 = list(makeSymbol("MESSAGE"));

    static private final SubLList $list_alt499 = list(list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("MESSAGE")), list(makeSymbol("WARN"), makeString("(LINK-TO-PANELS-CALLBACK ~S): Response to invitation ~S was null."), makeSymbol("SELF"), list(makeSymbol("GET-INVITATION-TRANSACTION-ID"), makeSymbol("SELF")))), list(list(makeSymbol("CYBLACK-ACCEPT-MESSAGE-P"), makeSymbol("MESSAGE")), list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PRECONDITION-PATTERN"), makeSymbol("CYBLACK-ACCEPT-MESSAGE")), makeSymbol("MESSAGE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-PRECONDITION-PATTERN"), makeSymbol("SELF")), list(makeSymbol("WARN"), makeString("(LINK-TO-PANELS-CALLBACK ~S): Failed to obtain a precondition pattern from message ~S."), makeSymbol("SELF"), makeSymbol("MESSAGE"))), list(RET, list(makeSymbol("LINK-TO-PANELS-INTERNAL"), makeSymbol("SELF")))), list(list(makeSymbol("CYBLACK-REJECT-MESSAGE-P"), makeSymbol("MESSAGE")), list(makeSymbol("SET-REJECTED"), makeSymbol("SELF"), T), list(makeSymbol("SET-WAITING-ON-LINK-CALLBACK"), makeSymbol("SELF"), NIL), list(RET, NIL)), list(T, list(makeSymbol("WARN"), makeString("(LINK-TO-PANELS-CALLBACK ~S): Response to invitation ~S was of unknown message type: ~S."), makeSymbol("SELF"), list(makeSymbol("GET-INVITATION-TRANSACTION-ID"), makeSymbol("SELF")), makeSymbol("MESSAGE")))), list(RET, NIL));

    static private final SubLString $str_alt500$_LINK_TO_PANELS_CALLBACK__S___Res = makeString("(LINK-TO-PANELS-CALLBACK ~S): Response to invitation ~S was null.");

    static private final SubLString $str_alt501$_LINK_TO_PANELS_CALLBACK__S___Fai = makeString("(LINK-TO-PANELS-CALLBACK ~S): Failed to obtain a precondition pattern from message ~S.");

    static private final SubLString $str_alt502$_LINK_TO_PANELS_CALLBACK__S___Res = makeString("(LINK-TO-PANELS-CALLBACK ~S): Response to invitation ~S was of unknown message type: ~S.");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_LINK_TO_PANELS_CALLBACK_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-LINK-TO-PANELS-CALLBACK-METHOD");

    private static final SubLSymbol WAITING_ON_LINK_CALLBACK_P = makeSymbol("WAITING-ON-LINK-CALLBACK-P");

    static private final SubLList $list_alt505 = list(list(RET, makeSymbol("WAITING-ON-LINK-CALLBACK")));

    static private final SubLSymbol $sym506$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym507$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_WAITING_ON_LINK_CALLBACK_P_METH = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-WAITING-ON-LINK-CALLBACK-P-METHOD");

    private static final SubLSymbol SET_WAITING_ON_LINK_CALLBACK = makeSymbol("SET-WAITING-ON-LINK-CALLBACK");

    static private final SubLList $list_alt509 = list(makeSymbol("NEW-STATUS"));

    static private final SubLList $list_alt510 = list(list(makeSymbol("CSETQ"), makeSymbol("WAITING-ON-LINK-CALLBACK"), makeSymbol("NEW-STATUS")), list(RET, list(makeSymbol("FIF"), makeSymbol("NEW-STATUS"), T, NIL)));

    static private final SubLSymbol $sym511$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym512$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_WAITING_ON_LINK_CALLBACK_ME = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-WAITING-ON-LINK-CALLBACK-METHOD");

    private static final SubLSymbol GET_INVITATION_TRANSACTION_ID = makeSymbol("GET-INVITATION-TRANSACTION-ID");

    static private final SubLList $list_alt514 = list(list(RET, makeSymbol("INVITATION-TRANSACTION-ID")));

    static private final SubLSymbol $sym515$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_INVITATION_TRANSACTION_ID_M = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-INVITATION-TRANSACTION-ID-METHOD");

    private static final SubLSymbol SET_INVITATION_TRANSACTION_ID = makeSymbol("SET-INVITATION-TRANSACTION-ID");

    static private final SubLList $list_alt517 = list(makeSymbol("NEW-ID"));

    static private final SubLList $list_alt518 = list(list(makeSymbol("CSETQ"), makeSymbol("INVITATION-TRANSACTION-ID"), makeSymbol("NEW-ID")), list(RET, makeSymbol("NEW-ID")));

    static private final SubLSymbol $sym519$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLSymbol $sym520$CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_INVITATION_TRANSACTION_ID_M = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-INVITATION-TRANSACTION-ID-METHOD");

    private static final SubLSymbol REJECTED_P = makeSymbol("REJECTED-P");

    static private final SubLList $list_alt522 = list(list(RET, makeSymbol("REJECTED")));

    static private final SubLSymbol $sym523$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_REJECTED_P_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-REJECTED-P-METHOD");

    private static final SubLSymbol SET_REJECTED = makeSymbol("SET-REJECTED");

    static private final SubLList $list_alt526 = list(list(makeSymbol("CSETQ"), makeSymbol("REJECTED"), makeSymbol("NEW-STATUS")), list(RET, list(makeSymbol("FIF"), makeSymbol("NEW-STATUS"), T, NIL)));

    static private final SubLSymbol $sym527$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_REJECTED_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-REJECTED-METHOD");

    private static final SubLSymbol GET_REJECTION_EXCUSES = makeSymbol("GET-REJECTION-EXCUSES");

    static private final SubLList $list_alt530 = list(list(RET, makeSymbol("REJECTION-EXCUSES")));

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_REJECTION_EXCUSES_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-REJECTION-EXCUSES-METHOD");

    private static final SubLSymbol SET_REJECTION_EXCUSES = makeSymbol("SET-REJECTION-EXCUSES");

    static private final SubLList $list_alt533 = list(makeSymbol("LIST-OF-EXCUSES"));

    static private final SubLList $list_alt534 = list(list(makeSymbol("CSETQ"), makeSymbol("REJECTION-EXCUSES"), list(makeSymbol("COPY-TREE"), makeSymbol("LIST-OF-EXCUSES"))), list(RET, makeSymbol("LIST-OF-EXCUSES")));

    static private final SubLSymbol $sym535$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_REJECTION_EXCUSES_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-REJECTION-EXCUSES-METHOD");

    static private final SubLList $list_alt537 = list(list(makeSymbol("PWHEN"), list(makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE")), list(makeSymbol("WITH-EKS-READ-ONLY"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), list(makeSymbol("PWHEN"), makeSymbol("GENERATE-KSI-FUNCTION"), list(RET, list(makeSymbol("FUNCALL"), makeSymbol("GENERATE-KSI-FUNCTION"), makeSymbol("EXTERNAL-KNOWLEDGE-SOURCE"), makeSymbol("PROPOSAL")))))), list(RET, NIL));

    static private final SubLSymbol $sym538$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GENERATE_KSI_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GENERATE-KSI-METHOD");

    private static final SubLSymbol GET_GUID_AS_STRING = makeSymbol("GET-GUID-AS-STRING");

    static private final SubLList $list_alt541 = list(list(RET, makeSymbol("GUID-AS-STRING")));

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_GUID_AS_STRING_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-GUID-AS-STRING-METHOD");

    private static final SubLSymbol SET_GUID_AS_STRING = makeSymbol("SET-GUID-AS-STRING");

    static private final SubLList $list_alt544 = list(makeSymbol("NEW-GUID-AS-STRING"));

    static private final SubLList $list_alt545 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-GUID-AS-STRING")), list(makeSymbol("STRINGP"), makeSymbol("NEW-GUID-AS-STRING"))), makeString("(SET-GUID-AS-STRING ~S): ~S is not a legal GUID string."), makeSymbol("SELF"), makeSymbol("NEW-GUID-AS-STRING")), list(makeSymbol("CSETQ"), makeSymbol("GUID-AS-STRING"), makeSymbol("NEW-GUID-AS-STRING")), list(RET, makeSymbol("NEW-GUID-AS-STRING")));

    static private final SubLSymbol $sym546$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_GUID_AS_STRING_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-GUID-AS-STRING-METHOD");



    static private final SubLList $list_alt549 = list(list(RET, makeSymbol("PORT-ID")));

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_GET_PORT_ID_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-GET-PORT-ID-METHOD");



    static private final SubLList $list_alt552 = list(makeSymbol("NEW-PORT-ID"));

    static private final SubLList $list_alt553 = list(list(makeSymbol("CSETQ"), makeSymbol("PORT-ID"), makeSymbol("NEW-PORT-ID")), list(RET, makeSymbol("NEW-PORT-ID")));

    static private final SubLSymbol $sym554$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_SET_PORT_ID_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-SET-PORT-ID-METHOD");

    static private final SubLList $list_alt556 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("PWHEN"), makeSymbol("APPLICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("GET-MESSAGE-BROKER"))))), list(makeSymbol("CSETQ"), makeSymbol("CACHED-MESSAGE-BROKER"), makeSymbol("MESSAGE-BROKER")))));

    static private final SubLSymbol $sym557$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_KNOWLEDGE_SOURCE_ON_STARTUP_METHOD = makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-ON-STARTUP-METHOD");

    private static final SubLSymbol CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE = makeSymbol("CYBLACK-CONSTRAINED-EXTERNAL-KNOWLEDGE-SOURCE");

    static private final SubLSymbol $sym560$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDG = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-EXTERNAL-KNOWLEDGE-SOURCE-CLASS");

    static private final SubLSymbol $sym561$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDG = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-EXTERNAL-KNOWLEDGE-SOURCE-INSTANCE");

    static private final SubLSymbol $sym562$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE_MET = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CONSTRAINED-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_CONSTRAINED_EXTERNAL_KNOWLEDGE_SOURCE_INITIALIZE_METHOD = makeSymbol("CYBLACK-CONSTRAINED-EXTERNAL-KNOWLEDGE-SOURCE-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS");

    public static final SubLInteger $int$24 = makeInteger(24);

    public static final SubLInteger $int$23 = makeInteger(23);

    public static final SubLInteger $int$22 = makeInteger(22);

    public static final SubLInteger $int$21 = makeInteger(21);

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_PERFORM_ACTION_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-PERFORM-ACTION-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MONITORING_KS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MONITORING-KS-CLASS");

    static private final SubLSymbol $sym571$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_MONITORING_KS_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-MONITORING-KS-INSTANCE");

    static private final SubLList $list_alt572 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ACTION"), $SEND), list(makeSymbol("CSETQ"), makeSymbol("ACTION-QUALIFIERS"), list(makeSymbol("LIST"), makeKeyword("NEW-POSTING"))), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER-CLASS"), list(QUOTE, makeSymbol("CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER"))), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("UNIFICATION-ROBOT-CLASS"), list(QUOTE, makeSymbol("CYBLACK-MONITORING-UNIFICATION-ROBOT"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym573$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_STATE_CHANGE_LISTENER = makeSymbol("CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER");

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_INITIALIZE_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-INITIALIZE-METHOD");

    static private final SubLSymbol $sym576$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_SET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-SET-PRECONDITION-PATTERN-METHOD");

    static private final SubLSymbol $sym578$CYBLACK_EXTERNAL_MONITORING_KS_GET_STATE_CHANGE_LISTENER_CLASS_ME = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-GET-STATE-CHANGE-LISTENER-CLASS-METHOD");

    static private final SubLSymbol $sym579$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MONITORING-KS-METHOD");

    static private final SubLSymbol $sym580$CYBLACK_EXTERNAL_MONITORING_KS_SET_STATE_CHANGE_LISTENER_CLASS_ME = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-SET-STATE-CHANGE-LISTENER-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_GET_STATE_CHANGE_LISTENER_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-GET-STATE-CHANGE-LISTENER-METHOD");

    static private final SubLList $list_alt582 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-STATE-CHANGE-LISTENER")), list(makeSymbol("CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER-P"), makeSymbol("NEW-STATE-CHANGE-LISTENER"))), makeString("(SET-STATE-CHANGE-LISTENER ~S): ~S is not an instance of CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER."), makeSymbol("SELF"), makeSymbol("NEW-STATE-CHANGE-LISTENER")), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER"), makeSymbol("NEW-STATE-CHANGE-LISTENER")), list(RET, makeSymbol("NEW-STATE-CHANGE-LISTENER")));

    static private final SubLSymbol $sym583$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_SET_STATE_CHANGE_LISTENER_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-SET-STATE-CHANGE-LISTENER-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_GET_ACTION_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-GET-ACTION-METHOD");

    static private final SubLSymbol $sym586$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_SET_ACTION_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-SET-ACTION-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_GET_ACTION_QUALIFIERS_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-GET-ACTION-QUALIFIERS-METHOD");

    static private final SubLSymbol $sym589$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_SET_ACTION_QUALIFIERS_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-SET-ACTION-QUALIFIERS-METHOD");

    static private final SubLSymbol $sym591$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_GATHER_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-GATHER-ALL-POSTINGS-METHOD");

    static private final SubLSymbol $sym593$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_MONITORING_KS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-MONITORING-KS-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_GATHER_ALL_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-GATHER-ALL-DIRECT-POSTINGS-METHOD");

    static private final SubLList $list_alt595 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("CLET"), list(list(makeSymbol("STATE-CHANGE-LISTENER-CLASS"), list(makeSymbol("GET-STATE-CHANGE-LISTENER-CLASS"), makeSymbol("SELF"))), list(makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("GET-STATE-CHANGE-LISTENER"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(makeSymbol("FIF"), makeSymbol("STATE-CHANGE-LISTENER-CLASS"), makeSymbol("STATE-CHANGE-LISTENER-CLASS"), list(QUOTE, makeSymbol("CYBLACK-EXTERNAL-STATE-CHANGE-LISTENER"))))), list(makeSymbol("SET-STATE-CHANGE-LISTENER"), makeSymbol("SELF"), makeSymbol("STATE-CHANGE-LISTENER"))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("APPLICATION"), makeSymbol("CYBLACK-INTERNAL-STATE-CHANGE-LISTENER")), makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeSymbol("CYBLACK-BASIC-STATE-CHANGE-LISTENER-SET-KNOWLEDGE-SOURCE-METHOD"), makeSymbol("STATE-CHANGE-LISTENER"), makeSymbol("SELF")), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_EXTERNAL_MONITORING_KS_ON_STARTUP_METHOD = makeSymbol("CYBLACK-EXTERNAL-MONITORING-KS-ON-STARTUP-METHOD");

    static private final SubLList $list_alt597 = list(makeSymbol("STIMULATION-FUNCTION-NAME"), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));



    static private final SubLList $list_alt599 = list(makeSymbol("POST-PROPOSAL-FUNCTION-NAME"), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt600 = list(makeSymbol("GENERATE-KSI-FUNCTION-NAME"), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));





    static private final SubLList $list_alt603 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PUSH"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NTH"), list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSITION"), list(makeSymbol("ELEMENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("APPEND"), list(makeSymbol("OTHER-LIST")), makeKeyword("PUBLIC")) });

    static private final SubLSymbol $sym604$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-CLASS");









    static private final SubLSymbol $sym609$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-INSTANCE");

    static private final SubLList $list_alt610 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-INITIALIZE-METHOD");



    static private final SubLList $list_alt613 = list(makeSymbol("NEW-CONTENTS"));

    static private final SubLList $list_alt614 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-CONTENTS")), makeString("(SET-CONTENTS ~S): ~S is not a valid LISP list."), makeSymbol("SELF"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CDOLIST"), list(makeSymbol("ELEMENT"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("ELEMENT")), makeString("(SET-CONTENTS ~S): ~S is not a valid instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("ELEMENT")))), list(RET, list(makeSymbol("SET-CONTENTS"), makeSymbol("SUPER"), makeSymbol("NEW-CONTENTS"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_SET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-SET-CONTENTS-METHOD");



    static private final SubLList $list_alt617 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt618 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("SELF")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), list(QUOTE, makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST"))), list(RET, makeSymbol("SELF"))), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("KS-LIST[]"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("KS-LIST[~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("FIRST")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(", ~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("]")))), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("SELF"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt619$___S_Class_is_not_correctly_imple = makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>");

    static private final SubLString $str_alt620$KS_LIST__ = makeString("KS-LIST[]");

    static private final SubLString $str_alt621$KS_LIST__S = makeString("KS-LIST[~S");

    static private final SubLString $str_alt622$___S = makeString(", ~S");

    static private final SubLString $str_alt623$_ = makeString("]");

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-PRINT-METHOD");



    static private final SubLList $list_alt626 = list(makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt627 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("NEW-ELEMENT")), makeString("(ADD ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("NEW-ELEMENT")), list(RET, list(makeSymbol("ADD"), makeSymbol("SUPER"), makeSymbol("NEW-ELEMENT"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_ADD_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-ADD-METHOD");



    static private final SubLList $list_alt630 = list(makeSymbol("OLD-ELEMENT"));

    static private final SubLList $list_alt631 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("OLD-ELEMENT")), makeString("(REMOVE ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("OLD-ELEMENT")), list(RET, list(makeSymbol("REMOVE"), makeSymbol("SUPER"), makeSymbol("OLD-ELEMENT"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_REMOVE_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-REMOVE-METHOD");

    static private final SubLList $list_alt633 = list(makeSymbol("ELEMENT"));

    static private final SubLList $list_alt634 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("ELEMENT")), makeString("(MEMBER-P ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("ELEMENT")), list(RET, list(makeSymbol("MEMBER-P"), makeSymbol("SUPER"), makeSymbol("ELEMENT"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_MEMBER_P_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-MEMBER-P-METHOD");



    static private final SubLList $list_alt637 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("NEW-ELEMENT")), makeString("(PUSH ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("NEW-ELEMENT")), list(RET, list(makeSymbol("PUSH"), makeSymbol("SUPER"), makeSymbol("NEW-ELEMENT"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_PUSH_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-PUSH-METHOD");



    static private final SubLList $list_alt640 = list(makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt641 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("NEW-ELEMENT")), makeString("(SET-NTH ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("NEW-ELEMENT")), list(RET, list(makeSymbol("SET-NTH"), makeSymbol("SUPER"), makeSymbol("INDEX"), makeSymbol("NEW-ELEMENT"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_SET_NTH_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-SET-NTH-METHOD");



    static private final SubLList $list_alt644 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("ELEMENT")), makeString("(POSITION ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("ELEMENT")), list(RET, list(makeSymbol("POSITION"), makeSymbol("SUPER"), makeSymbol("ELEMENT"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_POSITION_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-POSITION-METHOD");



    static private final SubLList $list_alt647 = list(makeSymbol("OTHER-LIST"));

    static private final SubLList $list_alt648 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-P"), makeSymbol("OTHER-LIST")), makeString("(APPEND ~S): ~S is not an instance of CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST."), makeSymbol("SELF"), makeSymbol("OTHER-LIST")), list(RET, list(makeSymbol("APPEND"), makeSymbol("SUPER"), makeSymbol("OTHER-LIST"))));

    private static final SubLSymbol CYBLACK_BASIC_KNOWLEDGE_SOURCE_LIST_APPEND_METHOD = makeSymbol("CYBLACK-BASIC-KNOWLEDGE-SOURCE-LIST-APPEND-METHOD");

    private static final SubLSymbol CYBLACK_KS_VISITOR = makeSymbol("CYBLACK-KS-VISITOR");

    static private final SubLList $list_alt651 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt652 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt653 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE1"), NIL), list(makeSymbol("NEW-STATE2"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-KS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTINUE-P"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("CYBLACK-KS"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_BASIC_KS_VISITOR = makeSymbol("CYBLACK-BASIC-KS-VISITOR");

    static private final SubLList $list_alt655 = list(makeSymbol("CYBLACK-KS-VISITOR"));

    static private final SubLList $list_alt656 = list(list(makeSymbol("CONTINUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLONE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE1"), NIL), list(makeSymbol("NEW-STATE2"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-KS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTINUE-P"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("CYBLACK-KS"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KS_VISITOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KS-VISITOR-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_KS_VISITOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-KS-VISITOR-INSTANCE");

    static private final SubLList $list_alt660 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CONTINUE"), T), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym661$OUTER_CATCH_FOR_CYBLACK_BASIC_KS_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KS-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KS_VISITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-KS-VISITOR-INITIALIZE-METHOD");



    static private final SubLList $list_alt664 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-KS-VISITOR"), list(makeSymbol("CLONE"), makeSymbol("SUPER")))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-KS-VISITOR"), list(QUOTE, makeSymbol("CONTINUE")), makeSymbol("CONTINUE")), list(RET, makeSymbol("NEW-KS-VISITOR"))));

    static private final SubLSymbol $sym665$OUTER_CATCH_FOR_CYBLACK_BASIC_KS_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KS-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KS_VISITOR_CLONE_METHOD = makeSymbol("CYBLACK-BASIC-KS-VISITOR-CLONE-METHOD");



    static private final SubLList $list_alt668 = list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE1"), NIL), list(makeSymbol("NEW-STATE2"), NIL));

    static private final SubLList $list_alt669 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-STATE1")), list(makeSymbol("IGNORE"), makeSymbol("NEW-STATE2")), list(makeSymbol("SET-APPLICATION"), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_KS_VISITOR_SET_INITIAL_STATE_METHOD = makeSymbol("CYBLACK-BASIC-KS-VISITOR-SET-INITIAL-STATE-METHOD");



    static private final SubLList $list_alt672 = list(makeSymbol("CYBLACK-KS"));

    static private final SubLList $list_alt673 = list(list(RET, makeSymbol("CYBLACK-KS")));

    private static final SubLSymbol CYBLACK_BASIC_KS_VISITOR_VISIT_METHOD = makeSymbol("CYBLACK-BASIC-KS-VISITOR-VISIT-METHOD");



    static private final SubLList $list_alt676 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("CYBLACK-KS"), NIL));

    static private final SubLList $list_alt677 = list(list(makeSymbol("IGNORE"), makeSymbol("CYBLACK-KS")), list(RET, makeSymbol("CONTINUE")));

    static private final SubLSymbol $sym678$OUTER_CATCH_FOR_CYBLACK_BASIC_KS_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-KS-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_KS_VISITOR_CONTINUE_P_METHOD = makeSymbol("CYBLACK-BASIC-KS-VISITOR-CONTINUE-P-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_KS_VISITOR_GET_FINAL_STATE_METHOD = makeSymbol("CYBLACK-BASIC-KS-VISITOR-GET-FINAL-STATE-METHOD");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_KS_VISITOR = makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR");

    static private final SubLList $list_alt683 = list(new SubLObject[]{ list(makeSymbol("PANEL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("POSTING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EVENT-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANEL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANEL"), list(makeSymbol("NEW-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLONE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE1"), NIL), list(makeSymbol("NEW-STATE2"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-KS")), makeKeyword("PUBLIC")) });







    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STATE_CHANGE_KS_VISITOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STATE-CHANGE-KS-VISITOR-CLASS");

    static private final SubLSymbol $sym688$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_STATE_CHANGE_KS_VISITOR_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-STATE-CHANGE-KS-VISITOR-INSTANCE");

    static private final SubLList $list_alt689 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("POSTING"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EVENT-TYPE"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym690$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STATE-CHANGE-KS-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_KS_VISITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR-INITIALIZE-METHOD");

    static private final SubLList $list_alt692 = list(list(RET, makeSymbol("PANEL")));

    private static final SubLSymbol CYBLACK_STATE_CHANGE_KS_VISITOR_GET_PANEL_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR-GET-PANEL-METHOD");



    static private final SubLList $list_alt695 = list(makeSymbol("NEW-PANEL"));

    static private final SubLList $list_alt696 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PANEL")), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("NEW-PANEL"))), makeString("(SET-PANEL ~S): ~S is not an instance of CYBLACK-PANEL."), makeSymbol("SELF"), makeSymbol("NEW-PANEL")), list(makeSymbol("CSETQ"), makeSymbol("PANEL"), makeSymbol("NEW-PANEL")), list(RET, makeSymbol("NEW-PANEL")));

    static private final SubLSymbol $sym697$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STATE-CHANGE-KS-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_KS_VISITOR_SET_PANEL_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR-SET-PANEL-METHOD");

    static private final SubLList $list_alt699 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-VISITOR"), list(makeSymbol("CLONE"), makeSymbol("SUPER")))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POSTING")), makeSymbol("POSTING")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("EVENT-TYPE")), makeSymbol("EVENT-TYPE")), list(RET, makeSymbol("NEW-VISITOR"))));

    static private final SubLSymbol $sym700$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STATE-CHANGE-KS-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_KS_VISITOR_CLONE_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR-CLONE-METHOD");

    static private final SubLList $list_alt702 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("NEW-STATE1")), makeString("(SET-INITIAL-STATE ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("NEW-STATE1")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-EVENT-TYPE-P"), makeSymbol("NEW-STATE2")), makeString("(SET-INITIAL-STATE ~S): ~S is not a member of the enumeration CYBLACK-EVENT-TYPE."), makeSymbol("SELF"), makeSymbol("NEW-STATE2")), list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("POSTING"), makeSymbol("NEW-STATE1")), list(makeSymbol("CSETQ"), makeSymbol("EVENT-TYPE"), makeSymbol("NEW-STATE2")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym703$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STATE-CHANGE-KS-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_STATE_CHANGE_KS_VISITOR_SET_INITIAL_STATE_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR-SET-INITIAL-STATE-METHOD");

    static private final SubLList $list_alt705 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CYBLACK-KS"), list(makeSymbol("CYBLACK-MONITORING-KS-P"), makeSymbol("CYBLACK-KS"))), list(makeSymbol("CLET"), list(list(makeSymbol("ACTION"), list(makeSymbol("CYBLACK-MKS-GET-ACTION"), makeSymbol("CYBLACK-KS"))), list(makeSymbol("ACTION-QUALIFIERS"), list(makeSymbol("CYBLACK-MKS-GET-ACTION-QUALIFIERS"), makeSymbol("CYBLACK-KS"))), makeSymbol("STATE-CHANGE-LISTENER")), list(makeSymbol("PCASE"), makeSymbol("ACTION"), list($SEND, list(makeSymbol("PCASE"), makeSymbol("EVENT-TYPE"), list($POST, list(makeSymbol("CLET"), list(list(makeSymbol("CONTENTS"), NIL), makeSymbol("POSTINGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("QUALIFIER"), makeSymbol("ACTION-QUALIFIERS")), list(makeSymbol("PCASE"), makeSymbol("QUALIFIER"), list(makeKeyword("ALL-POSTINGS"), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), list(makeSymbol("CYBLACK-PANEL-GET-ALL-POSTINGS"), makeSymbol("PANEL")))), list(makeKeyword("ALL-DIRECT-POSTINGS"), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), list(makeSymbol("CYBLACK-PANEL-GET-DIRECT-POSTINGS"), makeSymbol("PANEL")))), list(makeKeyword("NEW-POSTING"), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), list(makeSymbol("LIST"), makeSymbol("POSTING")))), list(makeKeyword("NEW-DIRECT-POSTING"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("CYBLACK-POSTING-GET-PANEL"), makeSymbol("POSTING")), makeSymbol("PANEL")), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), list(makeSymbol("LIST"), makeSymbol("POSTING"))), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), NIL))), list(makeKeyword("ADDED-OR-INACTIVATED-POSTING"), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), list(makeSymbol("LIST"), makeSymbol("POSTING")))), list(makeKeyword("ADDED-OR-INACTIVATED-DIRECT-POSTING"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("CYBLACK-POSTING-GET-PANEL"), makeSymbol("POSTING")), makeSymbol("PANEL")), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), list(makeSymbol("LIST"), makeSymbol("POSTING"))), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), NIL)))), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), list(makeSymbol("UNION"), makeSymbol("CONTENTS"), makeSymbol("POSTINGS")))), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("CYBLACK-MKS-GET-STATE-CHANGE-LISTENER"), makeSymbol("CYBLACK-KS"))), list(makeSymbol("PWHEN"), makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATE-CHANGE-LISTENER"), list(QUOTE, makeSymbol("TRANSMIT-STATE-CHANGE")), $POST, makeSymbol("CONTENTS"))))), list(makeKeyword("REMOVE-POST"), list(makeSymbol("CLET"), list(list(makeSymbol("CONTENTS"), NIL), makeSymbol("POSTINGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("QUALIFIER"), makeSymbol("ACTION-QUALIFIERS")), list(makeSymbol("PCASE"), makeSymbol("QUALIFIER"), list(makeKeyword("ADDED-OR-INACTIVATED-POSTING"), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), list(makeSymbol("LIST"), makeSymbol("POSTING")))), list(makeKeyword("ADDED-OR-INACTIVATED-DIRECT-POSTING"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("CYBLACK-POSTING-GET-PANEL"), makeSymbol("POSTING")), makeSymbol("PANEL")), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), list(makeSymbol("LIST"), makeSymbol("POSTING"))), list(makeSymbol("CSETQ"), makeSymbol("POSTINGS"), NIL)))), list(makeSymbol("CSETQ"), makeSymbol("CONTENTS"), list(makeSymbol("UNION"), makeSymbol("CONTENTS"), makeSymbol("POSTINGS")))), list(makeSymbol("CSETQ"), makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("CYBLACK-MKS-GET-STATE-CHANGE-LISTENER"), makeSymbol("CYBLACK-KS"))), list(makeSymbol("PWHEN"), makeSymbol("STATE-CHANGE-LISTENER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("STATE-CHANGE-LISTENER"), list(QUOTE, makeSymbol("TRANSMIT-STATE-CHANGE")), makeKeyword("REMOVE-POST"), makeSymbol("CONTENTS")))))))))), list(RET, NIL));

    static private final SubLSymbol $sym706$OUTER_CATCH_FOR_CYBLACK_STATE_CHANGE_KS_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-STATE-CHANGE-KS-VISITOR-METHOD");



    private static final SubLSymbol CYBLACK_STATE_CHANGE_KS_VISITOR_VISIT_METHOD = makeSymbol("CYBLACK-STATE-CHANGE-KS-VISITOR-VISIT-METHOD");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cyblack_ks_file();
    }

    @Override
    public void initializeVariables() {
        init_cyblack_ks_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyblack_ks_file();
    }
}

