/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
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
 *  module:      CYBLACK-AGENDA
 *  source file: /cyc/top/cycl/cyblack/cyblack-agenda.lisp
 *  created:     2019/07/03 17:38:48
 */
public final class cyblack_agenda extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_agenda() {
    }

    public static final SubLFile me = new cyblack_agenda();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_agenda";

    // // Definitions
    public static final SubLObject cyblack_agenda_p(SubLObject v_cyblack_agenda) {
        return interfaces.subloop_instanceof_interface(v_cyblack_agenda, CYBLACK_AGENDA);
    }

    public static final SubLObject get_cyblack_basic_simple_agenda_executable_ksi_queue(SubLObject cyblack_basic_simple_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_simple_agenda, TEN_INTEGER, EXECUTABLE_KSI_QUEUE);
    }

    public static final SubLObject set_cyblack_basic_simple_agenda_executable_ksi_queue(SubLObject cyblack_basic_simple_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_simple_agenda, value, TEN_INTEGER, EXECUTABLE_KSI_QUEUE);
    }

    public static final SubLObject get_cyblack_basic_simple_agenda_active_proposals(SubLObject cyblack_basic_simple_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_simple_agenda, NINE_INTEGER, ACTIVE_PROPOSALS);
    }

    public static final SubLObject set_cyblack_basic_simple_agenda_active_proposals(SubLObject cyblack_basic_simple_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_simple_agenda, value, NINE_INTEGER, ACTIVE_PROPOSALS);
    }

    public static final SubLObject get_cyblack_basic_simple_agenda_suspended_proposals(SubLObject cyblack_basic_simple_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_simple_agenda, EIGHT_INTEGER, SUSPENDED_PROPOSALS);
    }

    public static final SubLObject set_cyblack_basic_simple_agenda_suspended_proposals(SubLObject cyblack_basic_simple_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_simple_agenda, value, EIGHT_INTEGER, SUSPENDED_PROPOSALS);
    }

    public static final SubLObject get_cyblack_basic_simple_agenda_is_passive(SubLObject cyblack_basic_simple_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_simple_agenda, SEVEN_INTEGER, IS_PASSIVE);
    }

    public static final SubLObject set_cyblack_basic_simple_agenda_is_passive(SubLObject cyblack_basic_simple_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_simple_agenda, value, SEVEN_INTEGER, IS_PASSIVE);
    }

    public static final SubLObject get_cyblack_basic_simple_agenda_queue_prioritizer(SubLObject cyblack_basic_simple_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_simple_agenda, SIX_INTEGER, QUEUE_PRIORITIZER);
    }

    public static final SubLObject set_cyblack_basic_simple_agenda_queue_prioritizer(SubLObject cyblack_basic_simple_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_simple_agenda, value, SIX_INTEGER, QUEUE_PRIORITIZER);
    }

    public static final SubLObject get_cyblack_basic_simple_agenda_queue_list(SubLObject cyblack_basic_simple_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_simple_agenda, FIVE_INTEGER, QUEUE_LIST);
    }

    public static final SubLObject set_cyblack_basic_simple_agenda_queue_list(SubLObject cyblack_basic_simple_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_simple_agenda, value, FIVE_INTEGER, QUEUE_LIST);
    }

    public static final SubLObject cyblack_basic_simple_agenda_on_quiescence_method(SubLObject self) {
        {
            SubLObject template_application = cyblack_object.cyblack_object_get_application_method(self);
            if (NIL != template_application) {
                methods.funcall_instance_method_with_0_args(template_application, ON_QUIESCENCE);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_quiescence_p_method(SubLObject self) {
        if (NIL == cyblack_basic_simple_agenda_empty_p_method(self)) {
            return NIL;
        }
        {
            SubLObject template_suspended_proposals = cyblack_basic_simple_agenda_get_suspended_proposals_method(self);
            SubLObject template_active_proposals = cyblack_basic_simple_agenda_get_active_proposals_method(self);
            SubLObject template_queue = cyblack_basic_simple_agenda_get_executable_ksi_queue_method(self);
            return makeBoolean(((NIL != (NIL != template_suspended_proposals ? ((SubLObject) (subloop_collections.basic_doubly_linked_list_empty_p_method(template_suspended_proposals))) : T)) && (NIL != (NIL != template_active_proposals ? ((SubLObject) (subloop_queues.basic_doubly_linked_queue_empty_p_method(template_active_proposals))) : T))) && (NIL != (NIL != template_queue ? ((SubLObject) (subloop_queues.basic_doubly_linked_queue_empty_p_method(template_queue))) : T)));
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_dequeue_executable_ksi_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_queue = cyblack_basic_simple_agenda_get_executable_ksi_queue_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_queue) {
                        Errors.error($str_alt50$_DEQUEUE_EXECUTABLE_KSI__S___No_e, self);
                    }
                }
                return subloop_queues.basic_doubly_linked_queue_dequeue_method(template_queue);
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_remove_executable_ksi_method(SubLObject self, SubLObject old_ksi) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ksi.cyblack_knowledge_source_instantiation_p(old_ksi)) {
                    Errors.error($str_alt52$_REMOVE_EXECUTABLE_KSI__S___S_is_, self, old_ksi);
                }
            }
            {
                SubLObject template_queue = cyblack_basic_simple_agenda_get_executable_ksi_queue_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_queue) {
                        Errors.error($str_alt53$_REMOVE_EXECUTABLE_KSI__S___No_ex, self);
                    }
                }
                subloop_queues.basic_doubly_linked_queue_remove_method(template_queue, old_ksi);
                if (NIL != cyblack_basic_simple_agenda_quiescence_p_method(self)) {
                    methods.funcall_instance_method_with_0_args(self, ON_QUIESCENCE);
                }
                return old_ksi;
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_add_executable_ksi_method(SubLObject self, SubLObject new_ksi) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_ksi.cyblack_knowledge_source_instantiation_p(new_ksi)) {
                    Errors.error($str_alt55$_ADD_EXECUTABLE_KSI__S___S_is_not, self, new_ksi);
                }
            }
            {
                SubLObject template_queue = cyblack_basic_simple_agenda_get_executable_ksi_queue_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_queue) {
                        Errors.error($str_alt56$_ADD_EXECUTABLE_KSI__S___No_execu, self);
                    }
                }
                subloop_queues.basic_doubly_linked_queue_enqueue_method(template_queue, new_ksi);
                return new_ksi;
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_dequeue_active_proposal_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject template_activate_proposals = cyblack_basic_simple_agenda_get_active_proposals_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_activate_proposals) {
                        Errors.error($str_alt58$_DEQUEUE_ACTIVE_PROPOSAL__S___No_, self);
                    }
                }
                return subloop_queues.basic_doubly_linked_queue_dequeue_method(template_activate_proposals);
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_remove_active_proposal_method(SubLObject self, SubLObject old_active_proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal.cyblack_proposal_p(old_active_proposal)) {
                    Errors.error($str_alt60$_REMOVE_ACTIVE_PROPOSAL__S____S_i, self, old_active_proposal);
                }
            }
            {
                SubLObject template_activate_proposals = cyblack_basic_simple_agenda_get_active_proposals_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_activate_proposals) {
                        Errors.error($str_alt61$_REMOVE_ACTIVE_PROPOSAL__S___No_a, self);
                    }
                }
                if (NIL != cyblack_proposal.cyblack_basic_proposal_p(old_active_proposal)) {
                    cyblack_proposal.cyblack_basic_proposal_delete_self_from_collection_method(old_active_proposal, template_activate_proposals);
                } else {
                    methods.funcall_instance_method_with_1_args(old_active_proposal, DELETE_SELF_FROM_COLLECTION, template_activate_proposals);
                }
            }
            if (NIL != cyblack_basic_simple_agenda_quiescence_p_method(self)) {
                methods.funcall_instance_method_with_0_args(self, ON_QUIESCENCE);
            }
            return old_active_proposal;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_add_active_proposal_method(SubLObject self, SubLObject new_active_proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal.cyblack_proposal_p(new_active_proposal)) {
                    Errors.error($str_alt64$_ADD_ACTIVE_PROPOSAL__S____S_is_n, self, new_active_proposal);
                }
            }
            {
                SubLObject template_activate_proposals = cyblack_basic_simple_agenda_get_active_proposals_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_activate_proposals) {
                        Errors.error($str_alt65$_ADD_ACTIVE_PROPOSAL__S___No_acti, self);
                    }
                }
                if (NIL != cyblack_proposal.cyblack_basic_proposal_p(new_active_proposal)) {
                    subloop_queues.basic_doubly_linked_queue_enqueue_method(template_activate_proposals, new_active_proposal);
                } else {
                    methods.funcall_instance_method_with_1_args(template_activate_proposals, ENQUEUE, new_active_proposal);
                }
                return new_active_proposal;
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_reactivate_suspended_proposal_method(SubLObject self, SubLObject old_suspended_proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal.cyblack_proposal_p(old_suspended_proposal)) {
                    Errors.error($str_alt68$_REACTIVATE_SUSPENDED_PROPOSAL__S, self, old_suspended_proposal);
                }
            }
            {
                SubLObject template_suspended_proposals = cyblack_basic_simple_agenda_get_suspended_proposals_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_suspended_proposals) {
                        Errors.error($str_alt69$_REACTIVATE_SUSPENDED_PROPOSAL__S, self);
                    }
                }
                {
                    SubLObject template_activate_proposals = cyblack_basic_simple_agenda_get_active_proposals_method(self);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == template_activate_proposals) {
                            Errors.error($str_alt70$_REACTIVATE_SUSPENDED_PROPOSAL__S, self);
                        }
                    }
                    if (NIL != cyblack_proposal.cyblack_basic_proposal_p(old_suspended_proposal)) {
                        cyblack_proposal.cyblack_basic_proposal_delete_self_from_collection_method(old_suspended_proposal, template_suspended_proposals);
                        subloop_queues.basic_doubly_linked_queue_enqueue_method(template_activate_proposals, old_suspended_proposal);
                    } else {
                        methods.funcall_instance_method_with_1_args(old_suspended_proposal, DELETE_SELF_FROM_COLLECTION, old_suspended_proposal);
                        subloop_queues.basic_doubly_linked_queue_enqueue_method(template_activate_proposals, old_suspended_proposal);
                    }
                    return old_suspended_proposal;
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_remove_suspended_proposal_method(SubLObject self, SubLObject old_suspended_proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal.cyblack_proposal_p(old_suspended_proposal)) {
                    Errors.error($str_alt72$_REMOVE_SUSPENDED_PROPOSAL__S____, self, old_suspended_proposal);
                }
            }
            {
                SubLObject template_suspended_proposals = cyblack_basic_simple_agenda_get_suspended_proposals_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_suspended_proposals) {
                        Errors.error($str_alt73$_REMOVE_SUSPENDED_PROPOSAL__S___N, self);
                    }
                }
                if (NIL != cyblack_proposal.cyblack_basic_proposal_p(old_suspended_proposal)) {
                    cyblack_proposal.cyblack_basic_proposal_delete_self_from_collection_method(old_suspended_proposal, template_suspended_proposals);
                } else {
                    methods.funcall_instance_method_with_1_args(old_suspended_proposal, DELETE_SELF_FROM_COLLECTION, template_suspended_proposals);
                }
                if (NIL != cyblack_basic_simple_agenda_quiescence_p_method(self)) {
                    methods.funcall_instance_method_with_0_args(self, ON_QUIESCENCE);
                }
                return old_suspended_proposal;
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_add_suspended_proposal_method(SubLObject self, SubLObject new_suspended_proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal.cyblack_proposal_p(new_suspended_proposal)) {
                    Errors.error($str_alt75$_ADD_SUSPENDED_PROPOSAL__S____S_i, self, new_suspended_proposal);
                }
            }
            {
                SubLObject template_suspended_proposals = cyblack_basic_simple_agenda_get_suspended_proposals_method(self);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == template_suspended_proposals) {
                        Errors.error($str_alt76$_ADD_SUSPENDED_PROPOSAL__S___No_s, self);
                    }
                }
                subloop_collections.basic_doubly_linked_list_add_method(template_suspended_proposals, new_suspended_proposal);
                return new_suspended_proposal;
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_initialize_qua_cyblack_agenda_method(SubLObject self) {
        cyblack_basic_simple_agenda_set_suspended_proposals_method(self, object.object_new_method(BASIC_DOUBLY_LINKED_LIST));
        cyblack_basic_simple_agenda_set_active_proposals_method(self, object.object_new_method(BASIC_DOUBLY_LINKED_QUEUE));
        cyblack_basic_simple_agenda_set_executable_ksi_queue_method(self, object.object_new_method(BASIC_DOUBLY_LINKED_QUEUE));
        return self;
    }

    public static final SubLObject cyblack_basic_simple_agenda_peek_method(SubLObject self) {
        {
            SubLObject template_list = cyblack_basic_simple_agenda_get_list_internal_method(self);
            if (NIL != template_list) {
                if (!subloop_collections.basic_doubly_linked_list_get_element_count_method(template_list).numE(ZERO_INTEGER)) {
                    return NIL;
                }
                {
                    SubLObject next_item = subloop_collections.basic_doubly_linked_list_nth_method(template_list, ZERO_INTEGER);
                    return next_item;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_reorder_contents_method(SubLObject self, SubLObject ordered_contents) {
        {
            SubLObject resolved_list = cyblack_basic_simple_agenda_get_list_method(self);
            subloop_collections.basic_doubly_linked_list_set_contents_method(resolved_list, ordered_contents);
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_clear_method(SubLObject self) {
        {
            SubLObject template_list = cyblack_basic_simple_agenda_get_list_internal_method(self);
            if (NIL != template_list) {
                {
                    SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_list);
                    SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method(template_enumerator);
                    if ((NIL == cyblack_basic_simple_agenda_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(template_current_item))) {
                        methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
                    }
                    while (NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method(template_enumerator)) {
                        template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method(template_enumerator);
                        if ((NIL == cyblack_basic_simple_agenda_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(template_current_item))) {
                            methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
                        }
                    } 
                    subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_list, template_enumerator);
                }
                subloop_collections.basic_doubly_linked_list_clear_method(template_list);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_set_contents_method(SubLObject self, SubLObject new_contents) {
        {
            SubLObject template_resolved_list = cyblack_basic_simple_agenda_get_list_method(self);
            SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_resolved_list);
            if (NIL == subloop_collections.basic_doubly_linked_list_enumerator_empty_p_method(template_enumerator)) {
                {
                    SubLObject template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_first_method(template_enumerator);
                    if ((NIL == cyblack_basic_simple_agenda_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(template_current_item))) {
                        methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
                    }
                    while (NIL == subloop_collections.basic_doubly_linked_list_enumerator_last_p_method(template_enumerator)) {
                        template_current_item = subloop_collections.basic_doubly_linked_list_enumerator_next_method(template_enumerator);
                        if ((NIL == cyblack_basic_simple_agenda_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(template_current_item))) {
                            methods.funcall_instance_method_with_0_args(template_current_item, DEQUEUE_NOTIFY);
                        }
                    } 
                }
                subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_resolved_list, template_enumerator);
            }
            if (NIL != new_contents) {
                subloop_collections.basic_doubly_linked_list_set_contents_method(template_resolved_list, new_contents);
                {
                    SubLObject cdolist_list_var = new_contents;
                    SubLObject new_item = NIL;
                    for (new_item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_item = cdolist_list_var.first()) {
                        if ((NIL == cyblack_basic_simple_agenda_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(new_item))) {
                            methods.funcall_instance_method_with_1_args(new_item, ENQUEUE_NOTIFY, self);
                        }
                    }
                }
            }
            return new_contents;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_get_contents_method(SubLObject self) {
        {
            SubLObject template_list = cyblack_basic_simple_agenda_get_list_internal_method(self);
            if (NIL != template_list) {
                return subloop_collections.basic_doubly_linked_list_get_contents_method(template_list);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_get_element_count_method(SubLObject self) {
        {
            SubLObject template_list = cyblack_basic_simple_agenda_get_list_internal_method(self);
            if (NIL != template_list) {
                return subloop_collections.basic_doubly_linked_list_get_element_count_method(template_list);
            }
            return ZERO_INTEGER;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_dequeue_method(SubLObject self) {
        {
            SubLObject template_list = cyblack_basic_simple_agenda_get_list_internal_method(self);
            if (NIL != template_list) {
                {
                    SubLObject template_prioritizer = cyblack_basic_simple_agenda_get_prioritizer_method(self);
                    if (NIL != template_prioritizer) {
                        methods.funcall_instance_method_with_1_args(template_prioritizer, ORDER_QUEUE, self);
                    }
                }
                {
                    SubLObject dequeued_item = subloop_collections.basic_doubly_linked_list_pop_method(template_list);
                    if ((NIL == cyblack_basic_simple_agenda_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(dequeued_item))) {
                        methods.funcall_instance_method_with_1_args(dequeued_item, DEQUEUE_NOTIFY, self);
                    }
                    return dequeued_item;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_remove_method(SubLObject self, SubLObject old_element) {
        {
            SubLObject template_resolved_list = cyblack_basic_simple_agenda_get_list_method(self);
            subloop_collections.basic_doubly_linked_list_remove_method(template_resolved_list, old_element);
            if ((NIL == cyblack_basic_simple_agenda_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(old_element))) {
                methods.funcall_instance_method_with_1_args(old_element, REMOVE_NOTIFY, self);
            }
            return old_element;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_on_enqueue_method(SubLObject self, SubLObject new_element) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_simple_agenda_enqueue_method(SubLObject self, SubLObject new_element) {
        {
            SubLObject template_resolved_list = cyblack_basic_simple_agenda_get_list_method(self);
            subloop_collections.basic_doubly_linked_list_add_method(template_resolved_list, new_element);
            if ((NIL == cyblack_basic_simple_agenda_passive_p_method(self)) && (NIL != subloop_queues.queue_element_interface_p(new_element))) {
                methods.funcall_instance_method_with_1_args(new_element, ENQUEUE_NOTIFY, self);
            }
            methods.funcall_instance_method_with_1_args(self, ON_ENQUEUE, new_element);
            return new_element;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_set_prioritizer_method(SubLObject self, SubLObject new_prioritizer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == new_prioritizer) {
                cyblack_basic_simple_agenda_set_prioritizer_internal_method(self, NIL);
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_queues.queue_prioritizer_interface_p(new_prioritizer)) {
                    Errors.error($str_alt121$_SET_PRIORITIZER__S____S_is_not_a, self, new_prioritizer);
                }
            }
            cyblack_basic_simple_agenda_set_prioritizer_internal_method(self, new_prioritizer);
            return new_prioritizer;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_get_prioritizer_method(SubLObject self) {
        return cyblack_basic_simple_agenda_get_prioritizer_internal_method(self);
    }

    public static final SubLObject cyblack_basic_simple_agenda_get_list_method(SubLObject self) {
        {
            SubLObject template_list = cyblack_basic_simple_agenda_get_list_internal_method(self);
            if (NIL == cyblack_basic_simple_agenda_get_list_internal_method(self)) {
                template_list = object.object_new_method(BASIC_DOUBLY_LINKED_LIST);
                cyblack_basic_simple_agenda_set_list_internal_method(self, template_list);
            }
            return template_list;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_initialize_qua_doubly_linked_queue_method(SubLObject self) {
        cyblack_basic_simple_agenda_set_list_internal_method(self, NIL);
        cyblack_basic_simple_agenda_set_prioritizer_internal_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_simple_agenda_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_simple_agenda_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, SUSPENDED_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, ACTIVE_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, EXECUTABLE_KSI_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_simple_agenda_p(SubLObject cyblack_basic_simple_agenda) {
        return classes.subloop_instanceof_class(cyblack_basic_simple_agenda, CYBLACK_BASIC_SIMPLE_AGENDA);
    }

    public static final SubLObject cyblack_basic_simple_agenda_initialize_method(SubLObject self) {
        cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
        cyblack_basic_simple_agenda_initialize_qua_doubly_linked_queue_method(self);
        cyblack_basic_simple_agenda_initialize_qua_cyblack_agenda_method(self);
        return self;
    }

    public static final SubLObject cyblack_basic_simple_agenda_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject template_list = cyblack_basic_simple_agenda_get_list_internal_method(self);
            if (NIL == template_list) {
                format(stream, $str_alt149$SIMPLE_AGENDA___);
                return self;
            }
            {
                SubLObject template_enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(template_list);
                if (NIL == template_enumerator) {
                    format(stream, $str_alt150$___S_Class_is_not_correctly_imple, object.object_class_of_method(self));
                    return self;
                } else
                    if (NIL != methods.funcall_instance_method_with_0_args(template_enumerator, EMPTY_P)) {
                        format(stream, $str_alt149$SIMPLE_AGENDA___);
                    } else {
                        format(stream, $str_alt152$SIMPLE_AGENDA___S, methods.funcall_instance_method_with_0_args(template_enumerator, FIRST));
                        while (NIL == methods.funcall_instance_method_with_0_args(template_enumerator, LAST_P)) {
                            format(stream, $str_alt155$___S, methods.funcall_instance_method_with_0_args(template_enumerator, NEXT));
                        } 
                        format(stream, $str_alt157$_);
                    }

                subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(template_list, template_enumerator);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_empty_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject executable_ksi_queue = get_cyblack_basic_simple_agenda_executable_ksi_queue(self);
            SubLObject active_proposals = get_cyblack_basic_simple_agenda_active_proposals(self);
            SubLObject suspended_proposals = get_cyblack_basic_simple_agenda_suspended_proposals(self);
            SubLObject queue_list = get_cyblack_basic_simple_agenda_queue_list(self);
            try {
                try {
                    sublisp_throw($sym160$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, makeBoolean(((((NIL == queue_list) || (NIL != subloop_collections.collection_template_empty_p(queue_list))) && ((NIL == suspended_proposals) || (NIL != subloop_collections.basic_doubly_linked_list_empty_p_method(suspended_proposals)))) && ((NIL == active_proposals) || (NIL != subloop_queues.basic_doubly_linked_queue_empty_p_method(active_proposals)))) && ((NIL == executable_ksi_queue) || (NIL != subloop_queues.basic_doubly_linked_queue_empty_p_method(executable_ksi_queue)))));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_executable_ksi_queue(self, executable_ksi_queue);
                            set_cyblack_basic_simple_agenda_active_proposals(self, active_proposals);
                            set_cyblack_basic_simple_agenda_suspended_proposals(self, suspended_proposals);
                            set_cyblack_basic_simple_agenda_queue_list(self, queue_list);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym160$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_application) || (NIL != cyblack_application.cyblack_application_p(new_application)))) {
                                Errors.error($str_alt166$_SET_APPLICATION__S____S_is_not_a);
                            }
                        }
                        application = new_application;
                        sublisp_throw($sym165$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, new_application);
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
                    catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym165$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
                }
                return catch_var_for_cyblack_basic_simple_agenda_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_on_startup_method(SubLObject self) {
        cyblack_object.cyblack_object_on_startup_method(self);
        cyblack_basic_simple_agenda_clear_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_basic_simple_agenda_enqueued_p_method(SubLObject self, SubLObject v_object) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject queue_list = get_cyblack_basic_simple_agenda_queue_list(self);
            try {
                try {
                    sublisp_throw($sym174$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, NIL != queue_list ? ((SubLObject) (subloop_collections.basic_doubly_linked_list_member_p_method(queue_list, v_object))) : NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_queue_list(self, queue_list);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym174$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_find_method(SubLObject self, SubLObject key_value, SubLObject equality_pred, SubLObject key_accessor_function) {
        if (equality_pred == UNPROVIDED) {
            equality_pred = symbol_function(EQL);
        }
        if (key_accessor_function == UNPROVIDED) {
            key_accessor_function = symbol_function(IDENTITY);
        }
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject queue_list = get_cyblack_basic_simple_agenda_queue_list(self);
            try {
                try {
                    if (NIL != queue_list) {
                        {
                            SubLObject enumerator = subloop_collections.basic_doubly_linked_list_allocate_enumerator_method(queue_list);
                            if (NIL != enumerator) {
                                {
                                    SubLObject current_element = methods.funcall_instance_method_with_0_args(enumerator, FIRST);
                                    while (NIL != current_element) {
                                        {
                                            SubLObject target = funcall(key_accessor_function, current_element);
                                            if (NIL != funcall(equality_pred, key_value, target)) {
                                                subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(queue_list, enumerator);
                                                sublisp_throw($sym179$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, current_element);
                                            }
                                        }
                                        current_element = methods.funcall_instance_method_with_0_args(enumerator, NEXT);
                                    } 
                                }
                                subloop_collections.basic_doubly_linked_list_deallocate_enumerator_method(queue_list, enumerator);
                            }
                        }
                    }
                    sublisp_throw($sym179$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_queue_list(self, queue_list);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym179$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_passive_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject is_passive = get_cyblack_basic_simple_agenda_is_passive(self);
            try {
                try {
                    sublisp_throw($sym183$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, is_passive);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_is_passive(self, is_passive);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym183$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_set_passive_method(SubLObject self, SubLObject flag) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject is_passive = get_cyblack_basic_simple_agenda_is_passive(self);
            try {
                try {
                    is_passive = flag;
                    sublisp_throw($sym188$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, flag);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_is_passive(self, is_passive);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym188$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_get_list_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject queue_list = get_cyblack_basic_simple_agenda_queue_list(self);
            try {
                try {
                    sublisp_throw($sym192$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, queue_list);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_queue_list(self, queue_list);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym192$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_set_list_internal_method(SubLObject self, SubLObject new_list) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject queue_list = get_cyblack_basic_simple_agenda_queue_list(self);
            try {
                try {
                    queue_list = new_list;
                    sublisp_throw($sym197$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, new_list);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_queue_list(self, queue_list);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym197$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_get_prioritizer_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject queue_prioritizer = get_cyblack_basic_simple_agenda_queue_prioritizer(self);
            try {
                try {
                    sublisp_throw($sym201$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, queue_prioritizer);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_queue_prioritizer(self, queue_prioritizer);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym201$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_set_prioritizer_internal_method(SubLObject self, SubLObject new_prioritizer) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject queue_prioritizer = get_cyblack_basic_simple_agenda_queue_prioritizer(self);
            try {
                try {
                    queue_prioritizer = new_prioritizer;
                    sublisp_throw($sym205$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, new_prioritizer);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_queue_prioritizer(self, queue_prioritizer);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym205$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_propose_method(SubLObject self, SubLObject proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal.cyblack_proposal_p(proposal)) {
                    Errors.error($str_alt210$_PROPOSE__S____S_is_not_an_instan, self, proposal);
                }
            }
            cyblack_basic_simple_agenda_enqueue_method(self, proposal);
            return proposal;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_retract_method(SubLObject self, SubLObject proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal.cyblack_proposal_p(proposal)) {
                    Errors.error($str_alt214$_RETRACT__S____S_is_not_an_instan, self, proposal);
                }
            }
            cyblack_basic_simple_agenda_remove_method(self, proposal);
            return proposal;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_check_proposal_method(SubLObject self, SubLObject proposal) {
        if ((NIL != proposal) && (NIL != methods.funcall_instance_method_with_0_args(proposal, GET_KNOWLEDGE_SOURCE))) {
            return T;
        } else {
            Errors.warn($str_alt219$_CHECK_PROPOSAL__S___Proposal__S_, self, proposal);
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_execute_internal_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject executable_ksi_queue = get_cyblack_basic_simple_agenda_executable_ksi_queue(self);
            try {
                try {
                    cyblack_basic_simple_agenda_check_proposal_method(self, proposal);
                    if ((NIL != cyblack_proposal.cyblack_external_proposal_p(proposal)) && (cyblack_proposal.cyblack_proposal_get_execution_mode(proposal) == $ASYNCHRONOUS)) {
                        cyblack_basic_simple_agenda_add_suspended_proposal_method(self, proposal);
                    } else {
                        if (NIL != methods.funcall_instance_method_with_0_args(proposal, VALIDITY_RECONFIRMED_P)) {
                            {
                                SubLObject ksi = methods.funcall_instance_method_with_0_args(proposal, GENERATE_KSI);
                                if (NIL != ksi) {
                                    subloop_queues.basic_doubly_linked_queue_enqueue_method(executable_ksi_queue, ksi);
                                    object.object_isolate_method(proposal);
                                    sublisp_throw($sym223$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, NIL);
                                }
                            }
                        }
                    }
                    sublisp_throw($sym223$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_executable_ksi_queue(self, executable_ksi_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym223$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_execute_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
                SubLObject executable_ksi_queue = get_cyblack_basic_simple_agenda_executable_ksi_queue(self);
                SubLObject active_proposals = get_cyblack_basic_simple_agenda_active_proposals(self);
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        {
                            SubLObject ksi = NIL;
                            SubLObject proposal = NIL;
                            if (NIL != subloop_queues.basic_doubly_linked_queue_empty_p_method(executable_ksi_queue)) {
                                if (NIL != subloop_queues.basic_doubly_linked_queue_empty_p_method(active_proposals)) {
                                    proposal = cyblack_basic_simple_agenda_dequeue_method(self);
                                    if (NIL != proposal) {
                                        sublisp_throw($sym230$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, cyblack_basic_simple_agenda_execute_internal_method(self, proposal));
                                    }
                                } else {
                                    proposal = subloop_queues.basic_doubly_linked_queue_dequeue_method(active_proposals);
                                    if (NIL != proposal) {
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (NIL == application) {
                                                Errors.error($str_alt231$_EXECUTE__S___No_application_is_a, self);
                                            }
                                        }
                                        if ((NIL != cyblack_proposal.cyblack_external_proposal_p(proposal)) && (cyblack_proposal.cyblack_proposal_get_execution_mode(proposal) == $SYNCHRONOUS)) {
                                            methods.funcall_instance_method_with_0_args(proposal, GENERATE_KSI);
                                            sublisp_throw($sym230$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, NIL);
                                        }
                                        {
                                            SubLObject message_broker = cyblack_application.cyblack_application_get_message_broker(application);
                                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                                if (NIL == message_broker) {
                                                    Errors.error($str_alt233$_EXECUTE__S___No_message_broker_i, self, application);
                                                }
                                            }
                                            cyblack_message_broker.cyblack_message_broker_execute_method(message_broker, proposal);
                                            sublisp_throw($sym230$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, NIL);
                                        }
                                    }
                                }
                            } else {
                                ksi = subloop_queues.basic_doubly_linked_queue_dequeue_method(executable_ksi_queue);
                                if (NIL != ksi) {
                                    {
                                        SubLObject result = methods.funcall_instance_method_with_0_args(ksi, EXECUTE);
                                        if (NIL != cyblack_basic_simple_agenda_quiescence_p_method(self)) {
                                            methods.funcall_instance_method_with_0_args(self, ON_QUIESCENCE);
                                        }
                                        sublisp_throw($sym230$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, result);
                                    }
                                }
                            }
                            sublisp_throw($sym230$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_simple_agenda_executable_ksi_queue(self, executable_ksi_queue);
                                set_cyblack_basic_simple_agenda_active_proposals(self, active_proposals);
                                cyblack_object.set_cyblack_object_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym230$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
                }
                return catch_var_for_cyblack_basic_simple_agenda_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_get_pending_proposal_count_method(SubLObject self) {
        return cyblack_basic_simple_agenda_get_element_count_method(self);
    }

    public static final SubLObject cyblack_basic_simple_agenda_get_suspended_proposals_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject suspended_proposals = get_cyblack_basic_simple_agenda_suspended_proposals(self);
            try {
                try {
                    sublisp_throw($sym240$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, suspended_proposals);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_suspended_proposals(self, suspended_proposals);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym240$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_set_suspended_proposals_method(SubLObject self, SubLObject new_suspended_proposals) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
                SubLObject suspended_proposals = get_cyblack_basic_simple_agenda_suspended_proposals(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_suspended_proposals) || (NIL != subloop_collections.basic_doubly_linked_list_p(new_suspended_proposals)))) {
                                Errors.error($str_alt246$_SET_SUSPENDED_PROPOSALS__S____S_, self, new_suspended_proposals);
                            }
                        }
                        suspended_proposals = new_suspended_proposals;
                        sublisp_throw($sym245$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, new_suspended_proposals);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_simple_agenda_suspended_proposals(self, suspended_proposals);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym245$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
                }
                return catch_var_for_cyblack_basic_simple_agenda_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_get_active_proposals_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject active_proposals = get_cyblack_basic_simple_agenda_active_proposals(self);
            try {
                try {
                    sublisp_throw($sym250$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, active_proposals);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_active_proposals(self, active_proposals);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym250$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_set_active_proposals_method(SubLObject self, SubLObject new_active_proposals) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
                SubLObject active_proposals = get_cyblack_basic_simple_agenda_active_proposals(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_active_proposals) || (NIL != subloop_queues.basic_doubly_linked_queue_p(new_active_proposals)))) {
                                Errors.error($str_alt256$_SET_ACTIVE_PROPOSALS__S____S_is_, self, new_active_proposals);
                            }
                        }
                        active_proposals = new_active_proposals;
                        sublisp_throw($sym255$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, new_active_proposals);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_simple_agenda_active_proposals(self, active_proposals);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym255$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
                }
                return catch_var_for_cyblack_basic_simple_agenda_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_get_executable_ksi_queue_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
            SubLObject executable_ksi_queue = get_cyblack_basic_simple_agenda_executable_ksi_queue(self);
            try {
                try {
                    sublisp_throw($sym260$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, executable_ksi_queue);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_simple_agenda_executable_ksi_queue(self, executable_ksi_queue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym260$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_simple_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_set_executable_ksi_queue_method(SubLObject self, SubLObject new_queue) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_simple_agenda_method = NIL;
                SubLObject executable_ksi_queue = get_cyblack_basic_simple_agenda_executable_ksi_queue(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_queue) || (NIL != subloop_queues.basic_doubly_linked_queue_p(new_queue)))) {
                                Errors.error($str_alt266$_SET_EXECUTABLE_KSI_QUEUE__S____S, self, new_queue);
                            }
                        }
                        executable_ksi_queue = new_queue;
                        sublisp_throw($sym265$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD, new_queue);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_simple_agenda_executable_ksi_queue(self, executable_ksi_queue);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym265$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD);
                }
                return catch_var_for_cyblack_basic_simple_agenda_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_simple_agenda_reset_method(SubLObject self) {
        {
            SubLObject template_suspended_proposals = cyblack_basic_simple_agenda_get_suspended_proposals_method(self);
            if (NIL != template_suspended_proposals) {
                subloop_collections.basic_doubly_linked_list_clear_method(template_suspended_proposals);
            }
            {
                SubLObject template_active_proposals = cyblack_basic_simple_agenda_get_active_proposals_method(self);
                if (NIL != template_active_proposals) {
                    subloop_queues.basic_doubly_linked_queue_clear_method(template_active_proposals);
                }
            }
            {
                SubLObject template_executable_ksi_queue = cyblack_basic_simple_agenda_get_executable_ksi_queue_method(self);
                if (NIL != template_executable_ksi_queue) {
                    subloop_queues.basic_doubly_linked_queue_clear_method(template_executable_ksi_queue);
                }
            }
            cyblack_basic_simple_agenda_clear_method(self);
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_auto_locking_simple_agenda_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_auto_locking_simple_agenda_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, SUSPENDED_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, ACTIVE_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, EXECUTABLE_KSI_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_auto_locking_simple_agenda_p(SubLObject cyblack_basic_auto_locking_simple_agenda) {
        return classes.subloop_instanceof_class(cyblack_basic_auto_locking_simple_agenda, CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA);
    }

    public static final SubLObject cyblack_basic_auto_locking_simple_agenda_propose_method(SubLObject self, SubLObject proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_auto_locking_simple_agenda_method = NIL;
                SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_proposal.cyblack_proposal_p(proposal)) {
                                Errors.error($str_alt210$_PROPOSE__S____S_is_not_an_instan, self, proposal);
                            }
                        }
                        {
                            SubLObject lock_1 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_1);
                                cyblack_basic_simple_agenda_enqueue_method(self, proposal);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_1);
                                }
                            }
                        }
                        sublisp_throw($sym275$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA_METHOD, proposal);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_auto_locking_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym275$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA_METHOD);
                }
                return catch_var_for_cyblack_basic_auto_locking_simple_agenda_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_auto_locking_simple_agenda_retract_method(SubLObject self, SubLObject proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_auto_locking_simple_agenda_method = NIL;
                SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_proposal.cyblack_proposal_p(proposal)) {
                                Errors.error($str_alt214$_RETRACT__S____S_is_not_an_instan, self, proposal);
                            }
                        }
                        {
                            SubLObject lock_2 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_2);
                                cyblack_basic_simple_agenda_remove_method(self, proposal);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_2);
                                }
                            }
                        }
                        sublisp_throw($sym278$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA_METHOD, proposal);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_auto_locking_simple_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym278$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA_METHOD);
                }
                return catch_var_for_cyblack_basic_auto_locking_simple_agenda_method;
            }
        }
    }

    public static final SubLObject get_cyblack_basic_ipc_agenda_semaphore(SubLObject cyblack_basic_ipc_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_ipc_agenda, TWELVE_INTEGER, SEMAPHORE);
    }

    public static final SubLObject set_cyblack_basic_ipc_agenda_semaphore(SubLObject cyblack_basic_ipc_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_ipc_agenda, value, TWELVE_INTEGER, SEMAPHORE);
    }

    public static final SubLObject get_cyblack_basic_ipc_agenda_semaphore_name(SubLObject cyblack_basic_ipc_agenda) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_ipc_agenda, ELEVEN_INTEGER, SEMAPHORE_NAME);
    }

    public static final SubLObject set_cyblack_basic_ipc_agenda_semaphore_name(SubLObject cyblack_basic_ipc_agenda, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_ipc_agenda, value, ELEVEN_INTEGER, SEMAPHORE_NAME);
    }

    public static final SubLObject get_cyblack_basic_ipc_agenda_base_suffix_counter(SubLObject cyblack_basic_ipc_agenda) {
        {
            SubLObject v_class = (cyblack_basic_ipc_agenda.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_basic_ipc_agenda))) : NIL != subloop_structures.class_p(cyblack_basic_ipc_agenda) ? ((SubLObject) (cyblack_basic_ipc_agenda)) : NIL != subloop_structures.instance_p(cyblack_basic_ipc_agenda) ? ((SubLObject) (subloop_structures.instance_class(cyblack_basic_ipc_agenda))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_cyblack_basic_ipc_agenda_base_suffix_counter(SubLObject cyblack_basic_ipc_agenda, SubLObject value) {
        {
            SubLObject v_class = (cyblack_basic_ipc_agenda.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_basic_ipc_agenda))) : NIL != subloop_structures.class_p(cyblack_basic_ipc_agenda) ? ((SubLObject) (cyblack_basic_ipc_agenda)) : NIL != subloop_structures.instance_p(cyblack_basic_ipc_agenda) ? ((SubLObject) (subloop_structures.instance_class(cyblack_basic_ipc_agenda))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_SUFFIX_COUNTER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject get_cyblack_basic_ipc_agenda_base_name(SubLObject cyblack_basic_ipc_agenda) {
        {
            SubLObject v_class = (cyblack_basic_ipc_agenda.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_basic_ipc_agenda))) : NIL != subloop_structures.class_p(cyblack_basic_ipc_agenda) ? ((SubLObject) (cyblack_basic_ipc_agenda)) : NIL != subloop_structures.instance_p(cyblack_basic_ipc_agenda) ? ((SubLObject) (subloop_structures.instance_class(cyblack_basic_ipc_agenda))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_cyblack_basic_ipc_agenda_base_name(SubLObject cyblack_basic_ipc_agenda, SubLObject value) {
        {
            SubLObject v_class = (cyblack_basic_ipc_agenda.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(cyblack_basic_ipc_agenda))) : NIL != subloop_structures.class_p(cyblack_basic_ipc_agenda) ? ((SubLObject) (cyblack_basic_ipc_agenda)) : NIL != subloop_structures.instance_p(cyblack_basic_ipc_agenda) ? ((SubLObject) (subloop_structures.instance_class(cyblack_basic_ipc_agenda))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(BASE_NAME, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_ipc_agenda_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_IPC_AGENDA, BASE_NAME, $str_alt286$CYBLACK_BASIC_IPC_AGENDA);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_IPC_AGENDA, BASE_SUFFIX_COUNTER, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_ipc_agenda_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, QUEUE_PRIORITIZER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, IS_PASSIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, SUSPENDED_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, ACTIVE_PROPOSALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SIMPLE_AGENDA, EXECUTABLE_KSI_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_IPC_AGENDA, SEMAPHORE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_IPC_AGENDA, SEMAPHORE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_ipc_agenda_p(SubLObject cyblack_basic_ipc_agenda) {
        return classes.subloop_instanceof_class(cyblack_basic_ipc_agenda, CYBLACK_BASIC_IPC_AGENDA);
    }

    public static final SubLObject cyblack_basic_ipc_agenda_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_ipc_agenda_method = NIL;
            SubLObject base_suffix_counter = get_cyblack_basic_ipc_agenda_base_suffix_counter(self);
            SubLObject base_name = get_cyblack_basic_ipc_agenda_base_name(self);
            SubLObject semaphore = get_cyblack_basic_ipc_agenda_semaphore(self);
            SubLObject semaphore_name = get_cyblack_basic_ipc_agenda_semaphore_name(self);
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            try {
                try {
                    cyblack_basic_simple_agenda_initialize_method(self);
                    semaphore_name = cconcatenate(base_name, new SubLObject[]{ $str_alt291$_, string_utilities.to_string(base_suffix_counter) });
                    base_suffix_counter = add(base_suffix_counter, ONE_INTEGER);
                    lock = cconcatenate($str_alt292$Lock_for_Queue_, semaphore_name);
                    semaphore = Semaphores.new_semaphore(semaphore_name, ZERO_INTEGER);
                    sublisp_throw($sym290$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_ipc_agenda_base_suffix_counter(self, base_suffix_counter);
                            set_cyblack_basic_ipc_agenda_base_name(self, base_name);
                            set_cyblack_basic_ipc_agenda_semaphore(self, semaphore);
                            set_cyblack_basic_ipc_agenda_semaphore_name(self, semaphore_name);
                            cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ipc_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym290$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_ipc_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_ipc_agenda_propose_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject catch_var_for_cyblack_basic_ipc_agenda_method = NIL;
            SubLObject semaphore = get_cyblack_basic_ipc_agenda_semaphore(self);
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        SubLObject lock_3 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_3);
                            result = cyblack_basic_simple_agenda_propose_method(self, proposal);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_3);
                            }
                        }
                        semaphores.v_semaphore(semaphore);
                        sublisp_throw($sym295$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_ipc_agenda_semaphore(self, semaphore);
                            cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ipc_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym295$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_ipc_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_ipc_agenda_retract_method(SubLObject self, SubLObject proposal) {
        {
            SubLObject catch_var_for_cyblack_basic_ipc_agenda_method = NIL;
            SubLObject semaphore = get_cyblack_basic_ipc_agenda_semaphore(self);
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        semaphores.p_semaphore(semaphore);
                        {
                            SubLObject lock_4 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_4);
                                result = cyblack_basic_simple_agenda_retract_method(self, proposal);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_4);
                                }
                            }
                        }
                        sublisp_throw($sym298$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_ipc_agenda_semaphore(self, semaphore);
                            cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ipc_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym298$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_ipc_agenda_method;
        }
    }

    public static final SubLObject cyblack_basic_ipc_agenda_execute_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_ipc_agenda_method = NIL;
            SubLObject semaphore = get_cyblack_basic_ipc_agenda_semaphore(self);
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        semaphores.p_semaphore(semaphore);
                        {
                            SubLObject lock_5 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_5);
                                result = cyblack_basic_simple_agenda_execute_method(self);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_5);
                                }
                            }
                        }
                        sublisp_throw($sym301$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_ipc_agenda_semaphore(self, semaphore);
                            cyblack_lockable.set_cyblack_basic_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_ipc_agenda_method = Errors.handleThrowable(ccatch_env_var, $sym301$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD);
            }
            return catch_var_for_cyblack_basic_ipc_agenda_method;
        }
    }

    public static final SubLObject cyblack_agenda_get_suspended_proposals(SubLObject v_cyblack_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_agenda_p(v_cyblack_agenda)) {
                    Errors.error($str_alt303$CYBLACK_AGENDA_GET_SUSPENDED_PROP, v_cyblack_agenda);
                }
            }
            if (NIL != cyblack_basic_auto_locking_simple_agenda_p(v_cyblack_agenda)) {
                return cyblack_basic_simple_agenda_get_suspended_proposals_method(v_cyblack_agenda);
            } else
                if (NIL != cyblack_basic_simple_agenda_p(v_cyblack_agenda)) {
                    return cyblack_basic_simple_agenda_get_suspended_proposals_method(v_cyblack_agenda);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_agenda, GET_SUSPENDED_PROPOSALS);
                }

        }
    }

    public static final SubLObject cyblack_agenda_get_active_proposals(SubLObject v_cyblack_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_agenda_p(v_cyblack_agenda)) {
                    Errors.error($str_alt304$CYBLACK_AGENDA_GET_ACTIVE_PROPOSA, v_cyblack_agenda);
                }
            }
            if (NIL != cyblack_basic_auto_locking_simple_agenda_p(v_cyblack_agenda)) {
                return cyblack_basic_simple_agenda_get_active_proposals_method(v_cyblack_agenda);
            } else
                if (NIL != cyblack_basic_simple_agenda_p(v_cyblack_agenda)) {
                    return cyblack_basic_simple_agenda_get_active_proposals_method(v_cyblack_agenda);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_agenda, GET_ACTIVE_PROPOSALS);
                }

        }
    }

    public static final SubLObject cyblack_agenda_get_executable_ksi_queue(SubLObject v_cyblack_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_agenda_p(v_cyblack_agenda)) {
                    Errors.error($str_alt305$CYBLACK_AGENDA_GET_EXECUTABLE_KSI, v_cyblack_agenda);
                }
            }
            if (NIL != cyblack_basic_auto_locking_simple_agenda_p(v_cyblack_agenda)) {
                return cyblack_basic_simple_agenda_get_executable_ksi_queue_method(v_cyblack_agenda);
            } else
                if (NIL != cyblack_basic_simple_agenda_p(v_cyblack_agenda)) {
                    return cyblack_basic_simple_agenda_get_executable_ksi_queue_method(v_cyblack_agenda);
                } else {
                    return methods.funcall_instance_method_with_0_args(v_cyblack_agenda, GET_EXECUTABLE_KSI_QUEUE);
                }

        }
    }

    public static final SubLObject declare_cyblack_agenda_file() {
        declareFunction("cyblack_agenda_p", "CYBLACK-AGENDA-P", 1, 0, false);
        declareFunction("get_cyblack_basic_simple_agenda_executable_ksi_queue", "GET-CYBLACK-BASIC-SIMPLE-AGENDA-EXECUTABLE-KSI-QUEUE", 1, 0, false);
        declareFunction("set_cyblack_basic_simple_agenda_executable_ksi_queue", "SET-CYBLACK-BASIC-SIMPLE-AGENDA-EXECUTABLE-KSI-QUEUE", 2, 0, false);
        declareFunction("get_cyblack_basic_simple_agenda_active_proposals", "GET-CYBLACK-BASIC-SIMPLE-AGENDA-ACTIVE-PROPOSALS", 1, 0, false);
        declareFunction("set_cyblack_basic_simple_agenda_active_proposals", "SET-CYBLACK-BASIC-SIMPLE-AGENDA-ACTIVE-PROPOSALS", 2, 0, false);
        declareFunction("get_cyblack_basic_simple_agenda_suspended_proposals", "GET-CYBLACK-BASIC-SIMPLE-AGENDA-SUSPENDED-PROPOSALS", 1, 0, false);
        declareFunction("set_cyblack_basic_simple_agenda_suspended_proposals", "SET-CYBLACK-BASIC-SIMPLE-AGENDA-SUSPENDED-PROPOSALS", 2, 0, false);
        declareFunction("get_cyblack_basic_simple_agenda_is_passive", "GET-CYBLACK-BASIC-SIMPLE-AGENDA-IS-PASSIVE", 1, 0, false);
        declareFunction("set_cyblack_basic_simple_agenda_is_passive", "SET-CYBLACK-BASIC-SIMPLE-AGENDA-IS-PASSIVE", 2, 0, false);
        declareFunction("get_cyblack_basic_simple_agenda_queue_prioritizer", "GET-CYBLACK-BASIC-SIMPLE-AGENDA-QUEUE-PRIORITIZER", 1, 0, false);
        declareFunction("set_cyblack_basic_simple_agenda_queue_prioritizer", "SET-CYBLACK-BASIC-SIMPLE-AGENDA-QUEUE-PRIORITIZER", 2, 0, false);
        declareFunction("get_cyblack_basic_simple_agenda_queue_list", "GET-CYBLACK-BASIC-SIMPLE-AGENDA-QUEUE-LIST", 1, 0, false);
        declareFunction("set_cyblack_basic_simple_agenda_queue_list", "SET-CYBLACK-BASIC-SIMPLE-AGENDA-QUEUE-LIST", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_on_quiescence_method", "CYBLACK-BASIC-SIMPLE-AGENDA-ON-QUIESCENCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_quiescence_p_method", "CYBLACK-BASIC-SIMPLE-AGENDA-QUIESCENCE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_dequeue_executable_ksi_method", "CYBLACK-BASIC-SIMPLE-AGENDA-DEQUEUE-EXECUTABLE-KSI-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_remove_executable_ksi_method", "CYBLACK-BASIC-SIMPLE-AGENDA-REMOVE-EXECUTABLE-KSI-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_add_executable_ksi_method", "CYBLACK-BASIC-SIMPLE-AGENDA-ADD-EXECUTABLE-KSI-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_dequeue_active_proposal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-DEQUEUE-ACTIVE-PROPOSAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_remove_active_proposal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-REMOVE-ACTIVE-PROPOSAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_add_active_proposal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-ADD-ACTIVE-PROPOSAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_reactivate_suspended_proposal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-REACTIVATE-SUSPENDED-PROPOSAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_remove_suspended_proposal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-REMOVE-SUSPENDED-PROPOSAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_add_suspended_proposal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-ADD-SUSPENDED-PROPOSAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_initialize_qua_cyblack_agenda_method", "CYBLACK-BASIC-SIMPLE-AGENDA-INITIALIZE-QUA-CYBLACK-AGENDA-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_peek_method", "CYBLACK-BASIC-SIMPLE-AGENDA-PEEK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_reorder_contents_method", "CYBLACK-BASIC-SIMPLE-AGENDA-REORDER-CONTENTS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_clear_method", "CYBLACK-BASIC-SIMPLE-AGENDA-CLEAR-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_set_contents_method", "CYBLACK-BASIC-SIMPLE-AGENDA-SET-CONTENTS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_get_contents_method", "CYBLACK-BASIC-SIMPLE-AGENDA-GET-CONTENTS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_get_element_count_method", "CYBLACK-BASIC-SIMPLE-AGENDA-GET-ELEMENT-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_dequeue_method", "CYBLACK-BASIC-SIMPLE-AGENDA-DEQUEUE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_remove_method", "CYBLACK-BASIC-SIMPLE-AGENDA-REMOVE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_on_enqueue_method", "CYBLACK-BASIC-SIMPLE-AGENDA-ON-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_enqueue_method", "CYBLACK-BASIC-SIMPLE-AGENDA-ENQUEUE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_set_prioritizer_method", "CYBLACK-BASIC-SIMPLE-AGENDA-SET-PRIORITIZER-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_get_prioritizer_method", "CYBLACK-BASIC-SIMPLE-AGENDA-GET-PRIORITIZER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_get_list_method", "CYBLACK-BASIC-SIMPLE-AGENDA-GET-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_initialize_qua_doubly_linked_queue_method", "CYBLACK-BASIC-SIMPLE-AGENDA-INITIALIZE-QUA-DOUBLY-LINKED-QUEUE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_simple_agenda_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SIMPLE-AGENDA-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_simple_agenda_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SIMPLE-AGENDA-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_p", "CYBLACK-BASIC-SIMPLE-AGENDA-P", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_initialize_method", "CYBLACK-BASIC-SIMPLE-AGENDA-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_print_method", "CYBLACK-BASIC-SIMPLE-AGENDA-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_simple_agenda_empty_p_method", "CYBLACK-BASIC-SIMPLE-AGENDA-EMPTY-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_set_application_method", "CYBLACK-BASIC-SIMPLE-AGENDA-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_on_startup_method", "CYBLACK-BASIC-SIMPLE-AGENDA-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_enqueued_p_method", "CYBLACK-BASIC-SIMPLE-AGENDA-ENQUEUED-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_find_method", "CYBLACK-BASIC-SIMPLE-AGENDA-FIND-METHOD", 2, 2, false);
        declareFunction("cyblack_basic_simple_agenda_passive_p_method", "CYBLACK-BASIC-SIMPLE-AGENDA-PASSIVE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_set_passive_method", "CYBLACK-BASIC-SIMPLE-AGENDA-SET-PASSIVE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_get_list_internal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-GET-LIST-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_set_list_internal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-SET-LIST-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_get_prioritizer_internal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-GET-PRIORITIZER-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_set_prioritizer_internal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-SET-PRIORITIZER-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_propose_method", "CYBLACK-BASIC-SIMPLE-AGENDA-PROPOSE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_retract_method", "CYBLACK-BASIC-SIMPLE-AGENDA-RETRACT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_check_proposal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-CHECK-PROPOSAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_execute_internal_method", "CYBLACK-BASIC-SIMPLE-AGENDA-EXECUTE-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_execute_method", "CYBLACK-BASIC-SIMPLE-AGENDA-EXECUTE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_get_pending_proposal_count_method", "CYBLACK-BASIC-SIMPLE-AGENDA-GET-PENDING-PROPOSAL-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_get_suspended_proposals_method", "CYBLACK-BASIC-SIMPLE-AGENDA-GET-SUSPENDED-PROPOSALS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_set_suspended_proposals_method", "CYBLACK-BASIC-SIMPLE-AGENDA-SET-SUSPENDED-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_get_active_proposals_method", "CYBLACK-BASIC-SIMPLE-AGENDA-GET-ACTIVE-PROPOSALS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_set_active_proposals_method", "CYBLACK-BASIC-SIMPLE-AGENDA-SET-ACTIVE-PROPOSALS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_get_executable_ksi_queue_method", "CYBLACK-BASIC-SIMPLE-AGENDA-GET-EXECUTABLE-KSI-QUEUE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_simple_agenda_set_executable_ksi_queue_method", "CYBLACK-BASIC-SIMPLE-AGENDA-SET-EXECUTABLE-KSI-QUEUE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_simple_agenda_reset_method", "CYBLACK-BASIC-SIMPLE-AGENDA-RESET-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_auto_locking_simple_agenda_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_auto_locking_simple_agenda_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_auto_locking_simple_agenda_p", "CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA-P", 1, 0, false);
        declareFunction("cyblack_basic_auto_locking_simple_agenda_propose_method", "CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA-PROPOSE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_auto_locking_simple_agenda_retract_method", "CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA-RETRACT-METHOD", 2, 0, false);
        declareFunction("get_cyblack_basic_ipc_agenda_semaphore", "GET-CYBLACK-BASIC-IPC-AGENDA-SEMAPHORE", 1, 0, false);
        declareFunction("set_cyblack_basic_ipc_agenda_semaphore", "SET-CYBLACK-BASIC-IPC-AGENDA-SEMAPHORE", 2, 0, false);
        declareFunction("get_cyblack_basic_ipc_agenda_semaphore_name", "GET-CYBLACK-BASIC-IPC-AGENDA-SEMAPHORE-NAME", 1, 0, false);
        declareFunction("set_cyblack_basic_ipc_agenda_semaphore_name", "SET-CYBLACK-BASIC-IPC-AGENDA-SEMAPHORE-NAME", 2, 0, false);
        declareFunction("get_cyblack_basic_ipc_agenda_base_suffix_counter", "GET-CYBLACK-BASIC-IPC-AGENDA-BASE-SUFFIX-COUNTER", 1, 0, false);
        declareFunction("set_cyblack_basic_ipc_agenda_base_suffix_counter", "SET-CYBLACK-BASIC-IPC-AGENDA-BASE-SUFFIX-COUNTER", 2, 0, false);
        declareFunction("get_cyblack_basic_ipc_agenda_base_name", "GET-CYBLACK-BASIC-IPC-AGENDA-BASE-NAME", 1, 0, false);
        declareFunction("set_cyblack_basic_ipc_agenda_base_name", "SET-CYBLACK-BASIC-IPC-AGENDA-BASE-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_ipc_agenda_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-IPC-AGENDA-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_ipc_agenda_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-IPC-AGENDA-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_ipc_agenda_p", "CYBLACK-BASIC-IPC-AGENDA-P", 1, 0, false);
        declareFunction("cyblack_basic_ipc_agenda_initialize_method", "CYBLACK-BASIC-IPC-AGENDA-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_ipc_agenda_propose_method", "CYBLACK-BASIC-IPC-AGENDA-PROPOSE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_ipc_agenda_retract_method", "CYBLACK-BASIC-IPC-AGENDA-RETRACT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_ipc_agenda_execute_method", "CYBLACK-BASIC-IPC-AGENDA-EXECUTE-METHOD", 1, 0, false);
        declareFunction("cyblack_agenda_get_suspended_proposals", "CYBLACK-AGENDA-GET-SUSPENDED-PROPOSALS", 1, 0, false);
        declareFunction("cyblack_agenda_get_active_proposals", "CYBLACK-AGENDA-GET-ACTIVE-PROPOSALS", 1, 0, false);
        declareFunction("cyblack_agenda_get_executable_ksi_queue", "CYBLACK-AGENDA-GET-EXECUTABLE-KSI-QUEUE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_agenda_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_agenda_file() {
                interfaces.new_interface(CYBLACK_AGENDA, $list_alt1, $list_alt2, $list_alt3);
        interfaces.interfaces_add_interface_instance_method(INITIALIZE_QUA_CYBLACK_AGENDA, CYBLACK_AGENDA, $list_alt5, NIL, $list_alt6);
        interfaces.interfaces_add_interface_instance_method(ADD_SUSPENDED_PROPOSAL, CYBLACK_AGENDA, $list_alt8, $list_alt9, $list_alt10);
        interfaces.interfaces_add_interface_instance_method(REMOVE_SUSPENDED_PROPOSAL, CYBLACK_AGENDA, $list_alt8, $list_alt12, $list_alt13);
        interfaces.interfaces_add_interface_instance_method(REACTIVATE_SUSPENDED_PROPOSAL, CYBLACK_AGENDA, $list_alt8, $list_alt12, $list_alt15);
        interfaces.interfaces_add_interface_instance_method(ADD_ACTIVE_PROPOSAL, CYBLACK_AGENDA, $list_alt8, $list_alt17, $list_alt18);
        interfaces.interfaces_add_interface_instance_method(REMOVE_ACTIVE_PROPOSAL, CYBLACK_AGENDA, $list_alt8, $list_alt20, $list_alt21);
        interfaces.interfaces_add_interface_instance_method(DEQUEUE_ACTIVE_PROPOSAL, CYBLACK_AGENDA, $list_alt8, NIL, $list_alt23);
        interfaces.interfaces_add_interface_instance_method(ADD_EXECUTABLE_KSI, CYBLACK_AGENDA, $list_alt8, $list_alt25, $list_alt26);
        interfaces.interfaces_add_interface_instance_method(REMOVE_EXECUTABLE_KSI, CYBLACK_AGENDA, $list_alt8, $list_alt28, $list_alt29);
        interfaces.interfaces_add_interface_instance_method(DEQUEUE_EXECUTABLE_KSI, CYBLACK_AGENDA, $list_alt8, NIL, $list_alt31);
        interfaces.interfaces_add_interface_instance_method(QUIESCENCE_P, CYBLACK_AGENDA, $list_alt8, NIL, $list_alt33);
        interfaces.interfaces_add_interface_instance_method(ON_QUIESCENCE, CYBLACK_AGENDA, $list_alt8, NIL, $list_alt35);
        interfaces.interfaces_add_interface_instance_method(RESET, CYBLACK_AGENDA, $list_alt8, NIL, $list_alt37);
        classes.subloop_new_class(CYBLACK_BASIC_SIMPLE_AGENDA, CYBLACK_BASIC_LOCKABLE, $list_alt40, NIL, $list_alt41);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_SIMPLE_AGENDA, NIL);
        methods.methods_incorporate_instance_method(ON_QUIESCENCE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, ON_QUIESCENCE, CYBLACK_BASIC_SIMPLE_AGENDA_ON_QUIESCENCE_METHOD);
        methods.methods_incorporate_instance_method(QUIESCENCE_P, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt33);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, QUIESCENCE_P, CYBLACK_BASIC_SIMPLE_AGENDA_QUIESCENCE_P_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE_EXECUTABLE_KSI, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, DEQUEUE_EXECUTABLE_KSI, CYBLACK_BASIC_SIMPLE_AGENDA_DEQUEUE_EXECUTABLE_KSI_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_EXECUTABLE_KSI, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt28, $list_alt29);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, REMOVE_EXECUTABLE_KSI, CYBLACK_BASIC_SIMPLE_AGENDA_REMOVE_EXECUTABLE_KSI_METHOD);
        methods.methods_incorporate_instance_method(ADD_EXECUTABLE_KSI, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt25, $list_alt26);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, ADD_EXECUTABLE_KSI, CYBLACK_BASIC_SIMPLE_AGENDA_ADD_EXECUTABLE_KSI_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE_ACTIVE_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, DEQUEUE_ACTIVE_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA_DEQUEUE_ACTIVE_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ACTIVE_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt20, $list_alt21);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, REMOVE_ACTIVE_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA_REMOVE_ACTIVE_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(ADD_ACTIVE_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt17, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, ADD_ACTIVE_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA_ADD_ACTIVE_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(REACTIVATE_SUSPENDED_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt12, $list_alt15);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, REACTIVATE_SUSPENDED_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA_REACTIVATE_SUSPENDED_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_SUSPENDED_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt12, $list_alt13);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, REMOVE_SUSPENDED_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA_REMOVE_SUSPENDED_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUSPENDED_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt9, $list_alt10);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, ADD_SUSPENDED_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA_ADD_SUSPENDED_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_AGENDA, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt5, NIL, $list_alt6);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, INITIALIZE_QUA_CYBLACK_AGENDA, CYBLACK_BASIC_SIMPLE_AGENDA_INITIALIZE_QUA_CYBLACK_AGENDA_METHOD);
        methods.methods_incorporate_instance_method(PEEK, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt82);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, PEEK, CYBLACK_BASIC_SIMPLE_AGENDA_PEEK_METHOD);
        methods.methods_incorporate_instance_method(REORDER_CONTENTS, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt85, $list_alt86);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, REORDER_CONTENTS, CYBLACK_BASIC_SIMPLE_AGENDA_REORDER_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(CLEAR, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt89);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, CLEAR, CYBLACK_BASIC_SIMPLE_AGENDA_CLEAR_METHOD);
        methods.methods_incorporate_instance_method(SET_CONTENTS, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt93, $list_alt94);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, SET_CONTENTS, CYBLACK_BASIC_SIMPLE_AGENDA_SET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENTS, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt98);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, GET_CONTENTS, CYBLACK_BASIC_SIMPLE_AGENDA_GET_CONTENTS_METHOD);
        methods.methods_incorporate_instance_method(GET_ELEMENT_COUNT, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt101);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, GET_ELEMENT_COUNT, CYBLACK_BASIC_SIMPLE_AGENDA_GET_ELEMENT_COUNT_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt104);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, DEQUEUE, CYBLACK_BASIC_SIMPLE_AGENDA_DEQUEUE_METHOD);
        methods.methods_incorporate_instance_method(REMOVE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt108, $list_alt109);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, REMOVE, CYBLACK_BASIC_SIMPLE_AGENDA_REMOVE_METHOD);
        methods.methods_incorporate_instance_method(ON_ENQUEUE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt113, $list_alt114);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, ON_ENQUEUE, CYBLACK_BASIC_SIMPLE_AGENDA_ON_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt113, $list_alt116);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, ENQUEUE, CYBLACK_BASIC_SIMPLE_AGENDA_ENQUEUE_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt119, $list_alt120);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, SET_PRIORITIZER, CYBLACK_BASIC_SIMPLE_AGENDA_SET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITIZER, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt124);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, GET_PRIORITIZER, CYBLACK_BASIC_SIMPLE_AGENDA_GET_PRIORITIZER_METHOD);
        methods.methods_incorporate_instance_method(GET_LIST, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt5, NIL, $list_alt127);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, GET_LIST, CYBLACK_BASIC_SIMPLE_AGENDA_GET_LIST_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt5, NIL, $list_alt130);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, INITIALIZE_QUA_DOUBLY_LINKED_QUEUE, $sym131$CYBLACK_BASIC_SIMPLE_AGENDA_INITIALIZE_QUA_DOUBLY_LINKED_QUEUE_ME);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_SIMPLE_AGENDA, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SIMPLE_AGENDA_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_SIMPLE_AGENDA, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SIMPLE_AGENDA_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_simple_agenda_class(CYBLACK_BASIC_SIMPLE_AGENDA);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt5, NIL, $list_alt144);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, INITIALIZE, CYBLACK_BASIC_SIMPLE_AGENDA_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt147, $list_alt148);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, PRINT, CYBLACK_BASIC_SIMPLE_AGENDA_PRINT_METHOD);
        methods.methods_incorporate_instance_method(EMPTY_P, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt159);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, EMPTY_P, CYBLACK_BASIC_SIMPLE_AGENDA_EMPTY_P_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt163, $list_alt164);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, SET_APPLICATION, CYBLACK_BASIC_SIMPLE_AGENDA_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt169);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, ON_STARTUP, CYBLACK_BASIC_SIMPLE_AGENDA_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUED_P, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt172, $list_alt173);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, ENQUEUED_P, CYBLACK_BASIC_SIMPLE_AGENDA_ENQUEUED_P_METHOD);
        methods.methods_incorporate_instance_method(FIND, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt177, $list_alt178);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, FIND, CYBLACK_BASIC_SIMPLE_AGENDA_FIND_METHOD);
        methods.methods_incorporate_instance_method(PASSIVE_P, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt182);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, PASSIVE_P, CYBLACK_BASIC_SIMPLE_AGENDA_PASSIVE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_PASSIVE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt186, $list_alt187);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, SET_PASSIVE, CYBLACK_BASIC_SIMPLE_AGENDA_SET_PASSIVE_METHOD);
        methods.methods_incorporate_instance_method(GET_LIST_INTERNAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt5, NIL, $list_alt191);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, GET_LIST_INTERNAL, CYBLACK_BASIC_SIMPLE_AGENDA_GET_LIST_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_LIST_INTERNAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt5, $list_alt195, $list_alt196);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, SET_LIST_INTERNAL, CYBLACK_BASIC_SIMPLE_AGENDA_SET_LIST_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITIZER_INTERNAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt5, NIL, $list_alt200);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, GET_PRIORITIZER_INTERNAL, CYBLACK_BASIC_SIMPLE_AGENDA_GET_PRIORITIZER_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_PRIORITIZER_INTERNAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt5, $list_alt119, $list_alt204);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, SET_PRIORITIZER_INTERNAL, CYBLACK_BASIC_SIMPLE_AGENDA_SET_PRIORITIZER_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(PROPOSE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt208, $list_alt209);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, PROPOSE, CYBLACK_BASIC_SIMPLE_AGENDA_PROPOSE_METHOD);
        methods.methods_incorporate_instance_method(RETRACT, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt208, $list_alt213);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, RETRACT, CYBLACK_BASIC_SIMPLE_AGENDA_RETRACT_METHOD);
        methods.methods_incorporate_instance_method(CHECK_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt5, $list_alt208, $list_alt217);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, CHECK_PROPOSAL, CYBLACK_BASIC_SIMPLE_AGENDA_CHECK_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE_INTERNAL, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt5, $list_alt208, $list_alt222);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, EXECUTE_INTERNAL, CYBLACK_BASIC_SIMPLE_AGENDA_EXECUTE_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt229);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, EXECUTE, CYBLACK_BASIC_SIMPLE_AGENDA_EXECUTE_METHOD);
        methods.methods_incorporate_instance_method(GET_PENDING_PROPOSAL_COUNT, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt236);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, GET_PENDING_PROPOSAL_COUNT, CYBLACK_BASIC_SIMPLE_AGENDA_GET_PENDING_PROPOSAL_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_SUSPENDED_PROPOSALS, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt239);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, GET_SUSPENDED_PROPOSALS, CYBLACK_BASIC_SIMPLE_AGENDA_GET_SUSPENDED_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(SET_SUSPENDED_PROPOSALS, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt243, $list_alt244);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, SET_SUSPENDED_PROPOSALS, CYBLACK_BASIC_SIMPLE_AGENDA_SET_SUSPENDED_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTIVE_PROPOSALS, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt249);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, GET_ACTIVE_PROPOSALS, CYBLACK_BASIC_SIMPLE_AGENDA_GET_ACTIVE_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVE_PROPOSALS, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt253, $list_alt254);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, SET_ACTIVE_PROPOSALS, CYBLACK_BASIC_SIMPLE_AGENDA_SET_ACTIVE_PROPOSALS_METHOD);
        methods.methods_incorporate_instance_method(GET_EXECUTABLE_KSI_QUEUE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt259);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, GET_EXECUTABLE_KSI_QUEUE, CYBLACK_BASIC_SIMPLE_AGENDA_GET_EXECUTABLE_KSI_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(SET_EXECUTABLE_KSI_QUEUE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, $list_alt263, $list_alt264);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, SET_EXECUTABLE_KSI_QUEUE, CYBLACK_BASIC_SIMPLE_AGENDA_SET_EXECUTABLE_KSI_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(RESET, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt8, NIL, $list_alt268);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SIMPLE_AGENDA, RESET, CYBLACK_BASIC_SIMPLE_AGENDA_RESET_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA, CYBLACK_BASIC_SIMPLE_AGENDA, NIL, NIL, $list_alt271);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA, $sym272$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGE);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA, $sym273$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGE);
        subloop_reserved_initialize_cyblack_basic_auto_locking_simple_agenda_class(CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA);
        methods.methods_incorporate_instance_method(PROPOSE, CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA, $list_alt8, $list_alt208, $list_alt274);
        methods.subloop_register_instance_method(CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA, PROPOSE, CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA_PROPOSE_METHOD);
        methods.methods_incorporate_instance_method(RETRACT, CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA, $list_alt8, $list_alt208, $list_alt277);
        methods.subloop_register_instance_method(CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA, RETRACT, CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA_RETRACT_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_IPC_AGENDA, CYBLACK_BASIC_SIMPLE_AGENDA, NIL, NIL, $list_alt281);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_IPC_AGENDA, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_IPC_AGENDA, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_IPC_AGENDA_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_IPC_AGENDA, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_IPC_AGENDA_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_ipc_agenda_class(CYBLACK_BASIC_IPC_AGENDA);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_IPC_AGENDA, $list_alt5, NIL, $list_alt289);
        methods.subloop_register_instance_method(CYBLACK_BASIC_IPC_AGENDA, INITIALIZE, CYBLACK_BASIC_IPC_AGENDA_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PROPOSE, CYBLACK_BASIC_IPC_AGENDA, $list_alt8, $list_alt208, $list_alt294);
        methods.subloop_register_instance_method(CYBLACK_BASIC_IPC_AGENDA, PROPOSE, CYBLACK_BASIC_IPC_AGENDA_PROPOSE_METHOD);
        methods.methods_incorporate_instance_method(RETRACT, CYBLACK_BASIC_IPC_AGENDA, $list_alt8, $list_alt208, $list_alt297);
        methods.subloop_register_instance_method(CYBLACK_BASIC_IPC_AGENDA, RETRACT, CYBLACK_BASIC_IPC_AGENDA_RETRACT_METHOD);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_BASIC_IPC_AGENDA, $list_alt8, NIL, $list_alt300);
        methods.subloop_register_instance_method(CYBLACK_BASIC_IPC_AGENDA, EXECUTE, CYBLACK_BASIC_IPC_AGENDA_EXECUTE_METHOD);
        return NIL;
    }



    static private final SubLList $list_alt1 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-AGENDA"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPOSE"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRACT"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PENDING-PROPOSAL-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUSPENDED-PROPOSALS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUSPENDED-PROPOSALS"), list(makeSymbol("NEW-SUSPENDED-PROPOSALS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUSPENDED-PROPOSAL"), list(makeSymbol("NEW-SUSPENDED-PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUSPENDED-PROPOSAL"), list(makeSymbol("OLD-SUSPENDED-PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REACTIVATE-SUSPENDED-PROPOSAL"), list(makeSymbol("OLD-SUSPENDED-PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVE-PROPOSALS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVE-PROPOSALS"), list(makeSymbol("NEW-ACTIVE-PROPOSALS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-ACTIVE-PROPOSAL"), list(makeSymbol("NEW-ACTIVE-PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ACTIVE-PROPOSAL"), list(makeSymbol("OLD-ACTIVE-PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-ACTIVE-PROPOSAL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXECUTABLE-KSI-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXECUTABLE-KSI-QUEUE"), list(makeSymbol("NEW-QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-EXECUTABLE-KSI"), list(makeSymbol("NEW-KSI")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-EXECUTABLE-KSI"), list(makeSymbol("OLD-KSI")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-EXECUTABLE-KSI"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUIESCENCE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-QUIESCENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol INITIALIZE_QUA_CYBLACK_AGENDA = makeSymbol("INITIALIZE-QUA-CYBLACK-AGENDA");

    static private final SubLList $list_alt5 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt6 = list(list(makeSymbol("SET-SUSPENDED-PROPOSALS"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST")))), list(makeSymbol("SET-ACTIVE-PROPOSALS"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("SET-EXECUTABLE-KSI-QUEUE"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol ADD_SUSPENDED_PROPOSAL = makeSymbol("ADD-SUSPENDED-PROPOSAL");

    static private final SubLList $list_alt8 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt9 = list(makeSymbol("NEW-SUSPENDED-PROPOSAL"));

    static private final SubLList $list_alt10 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("NEW-SUSPENDED-PROPOSAL")), makeString("(ADD-SUSPENDED-PROPOSAL ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("NEW-SUSPENDED-PROPOSAL")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), list(makeSymbol("GET-SUSPENDED-PROPOSALS"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), makeString("(ADD-SUSPENDED-PROPOSAL ~S): No suspended proposal list is associated with this agenda."), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), makeSymbol("NEW-SUSPENDED-PROPOSAL")), list(RET, makeSymbol("NEW-SUSPENDED-PROPOSAL"))));

    private static final SubLSymbol REMOVE_SUSPENDED_PROPOSAL = makeSymbol("REMOVE-SUSPENDED-PROPOSAL");

    static private final SubLList $list_alt12 = list(makeSymbol("OLD-SUSPENDED-PROPOSAL"));

    static private final SubLList $list_alt13 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("OLD-SUSPENDED-PROPOSAL")), makeString("(REMOVE-SUSPENDED-PROPOSAL ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("OLD-SUSPENDED-PROPOSAL")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), list(makeSymbol("GET-SUSPENDED-PROPOSALS"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), makeString("(REMOVE-SUSPENDED-PROPOSAL ~S): No suspended proposal list is associated with this agenda."), makeSymbol("SELF")), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-BASIC-PROPOSAL-P"), makeSymbol("OLD-SUSPENDED-PROPOSAL")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DELETE-SELF-FROM-COLLECTION"), makeSymbol("CYBLACK-BASIC-PROPOSAL")), makeSymbol("OLD-SUSPENDED-PROPOSAL"), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-SUSPENDED-PROPOSAL"), list(QUOTE, makeSymbol("DELETE-SELF-FROM-COLLECTION")), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"))), list(makeSymbol("PWHEN"), list(makeSymbol("QUIESCENCE-P"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-QUIESCENCE")))), list(RET, makeSymbol("OLD-SUSPENDED-PROPOSAL"))));

    private static final SubLSymbol REACTIVATE_SUSPENDED_PROPOSAL = makeSymbol("REACTIVATE-SUSPENDED-PROPOSAL");

    static private final SubLList $list_alt15 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("OLD-SUSPENDED-PROPOSAL")), makeString("(REACTIVATE-SUSPENDED-PROPOSAL ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("OLD-SUSPENDED-PROPOSAL")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), list(makeSymbol("GET-SUSPENDED-PROPOSALS"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), makeString("(REACTIVATE-SUSPENDED-PROPOSAL ~S): No suspended proposal list is associated with this agenda."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), list(makeSymbol("GET-ACTIVE-PROPOSALS"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), makeString("(REACTIVATE-SUSPENDED-PROPOSAL ~S): No active proposal queue is associated with this agenda."), makeSymbol("SELF")), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-BASIC-PROPOSAL-P"), makeSymbol("OLD-SUSPENDED-PROPOSAL")), list(makeSymbol("PROGN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DELETE-SELF-FROM-COLLECTION"), makeSymbol("CYBLACK-BASIC-PROPOSAL")), makeSymbol("OLD-SUSPENDED-PROPOSAL"), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), makeSymbol("OLD-SUSPENDED-PROPOSAL"))), list(makeSymbol("PROGN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-SUSPENDED-PROPOSAL"), list(QUOTE, makeSymbol("DELETE-SELF-FROM-COLLECTION")), makeSymbol("OLD-SUSPENDED-PROPOSAL")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), makeSymbol("OLD-SUSPENDED-PROPOSAL")))), list(RET, makeSymbol("OLD-SUSPENDED-PROPOSAL")))));

    private static final SubLSymbol ADD_ACTIVE_PROPOSAL = makeSymbol("ADD-ACTIVE-PROPOSAL");

    static private final SubLList $list_alt17 = list(makeSymbol("NEW-ACTIVE-PROPOSAL"));

    static private final SubLList $list_alt18 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("NEW-ACTIVE-PROPOSAL")), makeString("(ADD-ACTIVE-PROPOSAL ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("NEW-ACTIVE-PROPOSAL")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), list(makeSymbol("GET-ACTIVE-PROPOSALS"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), makeString("(ADD-ACTIVE-PROPOSAL ~S): No active proposal queue is associated with this agenda."), makeSymbol("SELF")), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-BASIC-PROPOSAL-P"), makeSymbol("NEW-ACTIVE-PROPOSAL")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), makeSymbol("NEW-ACTIVE-PROPOSAL")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), list(QUOTE, makeSymbol("ENQUEUE")), makeSymbol("NEW-ACTIVE-PROPOSAL"))), list(RET, makeSymbol("NEW-ACTIVE-PROPOSAL"))));

    private static final SubLSymbol REMOVE_ACTIVE_PROPOSAL = makeSymbol("REMOVE-ACTIVE-PROPOSAL");

    static private final SubLList $list_alt20 = list(makeSymbol("OLD-ACTIVE-PROPOSAL"));

    static private final SubLList $list_alt21 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("OLD-ACTIVE-PROPOSAL")), makeString("(REMOVE-ACTIVE-PROPOSAL ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("OLD-ACTIVE-PROPOSAL")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), list(makeSymbol("GET-ACTIVE-PROPOSALS"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), makeString("(REMOVE-ACTIVE-PROPOSAL ~S): No active proposal queue is associated with this agenda."), makeSymbol("SELF")), list(makeSymbol("PIF"), list(makeSymbol("CYBLACK-BASIC-PROPOSAL-P"), makeSymbol("OLD-ACTIVE-PROPOSAL")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DELETE-SELF-FROM-COLLECTION"), makeSymbol("CYBLACK-BASIC-PROPOSAL")), makeSymbol("OLD-ACTIVE-PROPOSAL"), makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ACTIVE-PROPOSAL"), list(QUOTE, makeSymbol("DELETE-SELF-FROM-COLLECTION")), makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS")))), list(makeSymbol("PWHEN"), list(makeSymbol("QUIESCENCE-P"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-QUIESCENCE")))), list(RET, makeSymbol("OLD-ACTIVE-PROPOSAL")));

    private static final SubLSymbol DEQUEUE_ACTIVE_PROPOSAL = makeSymbol("DEQUEUE-ACTIVE-PROPOSAL");

    static private final SubLList $list_alt23 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), list(makeSymbol("GET-ACTIVE-PROPOSALS"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS"), makeString("(DEQUEUE-ACTIVE-PROPOSAL ~S): No active proposal queue is associated with this agenda."), makeSymbol("SELF")), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-ACTIVATE-PROPOSALS")))));

    private static final SubLSymbol ADD_EXECUTABLE_KSI = makeSymbol("ADD-EXECUTABLE-KSI");

    static private final SubLList $list_alt25 = list(makeSymbol("NEW-KSI"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION-P"), makeSymbol("NEW-KSI")), makeString("(ADD-EXECUTABLE-KSI ~S) ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION."), makeSymbol("SELF"), makeSymbol("NEW-KSI")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-QUEUE"), list(makeSymbol("GET-EXECUTABLE-KSI-QUEUE"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-QUEUE"), makeString("(ADD-EXECUTABLE-KSI ~S): No executable knowledge source instantiation queue is associated with this agenda."), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-QUEUE"), makeSymbol("NEW-KSI")), list(RET, makeSymbol("NEW-KSI"))));

    private static final SubLSymbol REMOVE_EXECUTABLE_KSI = makeSymbol("REMOVE-EXECUTABLE-KSI");

    static private final SubLList $list_alt28 = list(makeSymbol("OLD-KSI"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION-P"), makeSymbol("OLD-KSI")), makeString("(REMOVE-EXECUTABLE-KSI ~S) ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION."), makeSymbol("SELF"), makeSymbol("OLD-KSI")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-QUEUE"), list(makeSymbol("GET-EXECUTABLE-KSI-QUEUE"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-QUEUE"), makeString("(REMOVE-EXECUTABLE-KSI ~S): No executable knowledge source instantiation queue is associated with this agenda."), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-QUEUE"), makeSymbol("OLD-KSI")), list(makeSymbol("PWHEN"), list(makeSymbol("QUIESCENCE-P"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-QUIESCENCE")))), list(RET, makeSymbol("OLD-KSI"))));

    private static final SubLSymbol DEQUEUE_EXECUTABLE_KSI = makeSymbol("DEQUEUE-EXECUTABLE-KSI");

    static private final SubLList $list_alt31 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-QUEUE"), list(makeSymbol("GET-EXECUTABLE-KSI-QUEUE"), makeSymbol("SELF")))), list(makeSymbol("MUST"), makeSymbol("TEMPLATE-QUEUE"), makeString("(DEQUEUE-EXECUTABLE-KSI ~S): No executable knowledge source instantiation queue is associated with this agenda."), makeSymbol("SELF")), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-QUEUE")))));

    private static final SubLSymbol QUIESCENCE_P = makeSymbol("QUIESCENCE-P");

    static private final SubLList $list_alt33 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("EMPTY-P"), makeSymbol("SELF")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), list(makeSymbol("GET-SUSPENDED-PROPOSALS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-ACTIVE-PROPOSALS"), list(makeSymbol("GET-ACTIVE-PROPOSALS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-QUEUE"), list(makeSymbol("GET-EXECUTABLE-KSI-QUEUE"), makeSymbol("SELF")))), list(RET, list(makeSymbol("CAND"), list(makeSymbol("FIF"), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS")), T), list(makeSymbol("FIF"), makeSymbol("TEMPLATE-ACTIVE-PROPOSALS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-ACTIVE-PROPOSALS")), T), list(makeSymbol("FIF"), makeSymbol("TEMPLATE-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-QUEUE")), T)))));



    static private final SubLList $list_alt35 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-APPLICATION"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-APPLICATION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-APPLICATION"), list(QUOTE, makeSymbol("ON-QUIESCENCE"))))), list(RET, NIL));



    static private final SubLList $list_alt37 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), list(makeSymbol("GET-SUSPENDED-PROPOSALS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ACTIVE-PROPOSALS"), list(makeSymbol("GET-ACTIVE-PROPOSALS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ACTIVE-PROPOSALS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-ACTIVE-PROPOSALS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-EXECUTABLE-KSI-QUEUE"), list(makeSymbol("GET-EXECUTABLE-KSI-QUEUE"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-EXECUTABLE-KSI-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-EXECUTABLE-KSI-QUEUE")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA");



    static private final SubLList $list_alt40 = list(makeSymbol("CYBLACK-AGENDA"), makeSymbol("DOUBLY-LINKED-QUEUE-TEMPLATE"));

    static private final SubLList $list_alt41 = list(new SubLObject[]{ list(makeSymbol("QUEUE-LIST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("QUEUE-PRIORITIZER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IS-PASSIVE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LIST-INTERNAL"), list(makeSymbol("NEW-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER-INTERNAL"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EMPTY-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUED-P"), list(makeSymbol("OBJECT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND"), list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PASSIVE"), list(makeSymbol("FLAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LIST"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITIZER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRIORITIZER"), list(makeSymbol("NEW-PRIORITIZER")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ENQUEUE"), list(makeSymbol("NEW-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE"), list(makeSymbol("OLD-ELEMENT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ELEMENT-COUNT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONTENTS"), list(makeSymbol("NEW-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEAR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REORDER-CONTENTS"), list(makeSymbol("ORDERED-CONTENTS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PEEK"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("SUSPENDED-PROPOSALS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ACTIVE-PROPOSALS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXECUTABLE-KSI-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPOSE"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRACT"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-PROPOSAL"), list(makeSymbol("PROPOSAL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE-INTERNAL"), list(makeSymbol("PROPOSAL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PENDING-PROPOSAL-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUSPENDED-PROPOSALS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUSPENDED-PROPOSALS"), list(makeSymbol("NEW-SUSPENDED-PROPOSALS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVE-PROPOSALS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVE-PROPOSALS"), list(makeSymbol("NEW-ACTIVE-PROPOSALS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXECUTABLE-KSI-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXECUTABLE-KSI-QUEUE"), list(makeSymbol("NEW-QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-AGENDA"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUSPENDED-PROPOSAL"), list(makeSymbol("NEW-SUSPENDED-PROPOSAL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-SUSPENDED-PROPOSAL"), list(makeSymbol("OLD-SUSPENDED-PROPOSAL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REACTIVATE-SUSPENDED-PROPOSAL"), list(makeSymbol("OLD-SUSPENDED-PROPOSAL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-ACTIVE-PROPOSAL"), list(makeSymbol("NEW-ACTIVE-PROPOSAL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ACTIVE-PROPOSAL"), list(makeSymbol("OLD-ACTIVE-PROPOSAL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-ACTIVE-PROPOSAL"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-EXECUTABLE-KSI"), list(makeSymbol("NEW-KSI")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-EXECUTABLE-KSI"), list(makeSymbol("OLD-KSI")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-EXECUTABLE-KSI"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUIESCENCE-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-QUIESCENCE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET"), NIL, makeKeyword("PUBLIC")) });









    private static final SubLSymbol QUEUE_PRIORITIZER = makeSymbol("QUEUE-PRIORITIZER");



    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_ON_QUIESCENCE_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-ON-QUIESCENCE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_QUIESCENCE_P_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-QUIESCENCE-P-METHOD");

    static private final SubLString $str_alt50$_DEQUEUE_EXECUTABLE_KSI__S___No_e = makeString("(DEQUEUE-EXECUTABLE-KSI ~S): No executable knowledge source instantiation queue is associated with this agenda.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_DEQUEUE_EXECUTABLE_KSI_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-DEQUEUE-EXECUTABLE-KSI-METHOD");

    static private final SubLString $str_alt52$_REMOVE_EXECUTABLE_KSI__S___S_is_ = makeString("(REMOVE-EXECUTABLE-KSI ~S) ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION.");

    static private final SubLString $str_alt53$_REMOVE_EXECUTABLE_KSI__S___No_ex = makeString("(REMOVE-EXECUTABLE-KSI ~S): No executable knowledge source instantiation queue is associated with this agenda.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_REMOVE_EXECUTABLE_KSI_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-REMOVE-EXECUTABLE-KSI-METHOD");

    static private final SubLString $str_alt55$_ADD_EXECUTABLE_KSI__S___S_is_not = makeString("(ADD-EXECUTABLE-KSI ~S) ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE-INSTANTIATION.");

    static private final SubLString $str_alt56$_ADD_EXECUTABLE_KSI__S___No_execu = makeString("(ADD-EXECUTABLE-KSI ~S): No executable knowledge source instantiation queue is associated with this agenda.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_ADD_EXECUTABLE_KSI_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-ADD-EXECUTABLE-KSI-METHOD");

    static private final SubLString $str_alt58$_DEQUEUE_ACTIVE_PROPOSAL__S___No_ = makeString("(DEQUEUE-ACTIVE-PROPOSAL ~S): No active proposal queue is associated with this agenda.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_DEQUEUE_ACTIVE_PROPOSAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-DEQUEUE-ACTIVE-PROPOSAL-METHOD");

    static private final SubLString $str_alt60$_REMOVE_ACTIVE_PROPOSAL__S____S_i = makeString("(REMOVE-ACTIVE-PROPOSAL ~S): ~S is not an instance of CYBLACK-PROPOSAL.");

    static private final SubLString $str_alt61$_REMOVE_ACTIVE_PROPOSAL__S___No_a = makeString("(REMOVE-ACTIVE-PROPOSAL ~S): No active proposal queue is associated with this agenda.");



    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_REMOVE_ACTIVE_PROPOSAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-REMOVE-ACTIVE-PROPOSAL-METHOD");

    static private final SubLString $str_alt64$_ADD_ACTIVE_PROPOSAL__S____S_is_n = makeString("(ADD-ACTIVE-PROPOSAL ~S): ~S is not an instance of CYBLACK-PROPOSAL.");

    static private final SubLString $str_alt65$_ADD_ACTIVE_PROPOSAL__S___No_acti = makeString("(ADD-ACTIVE-PROPOSAL ~S): No active proposal queue is associated with this agenda.");



    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_ADD_ACTIVE_PROPOSAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-ADD-ACTIVE-PROPOSAL-METHOD");

    static private final SubLString $str_alt68$_REACTIVATE_SUSPENDED_PROPOSAL__S = makeString("(REACTIVATE-SUSPENDED-PROPOSAL ~S): ~S is not an instance of CYBLACK-PROPOSAL.");

    static private final SubLString $str_alt69$_REACTIVATE_SUSPENDED_PROPOSAL__S = makeString("(REACTIVATE-SUSPENDED-PROPOSAL ~S): No suspended proposal list is associated with this agenda.");

    static private final SubLString $str_alt70$_REACTIVATE_SUSPENDED_PROPOSAL__S = makeString("(REACTIVATE-SUSPENDED-PROPOSAL ~S): No active proposal queue is associated with this agenda.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_REACTIVATE_SUSPENDED_PROPOSAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-REACTIVATE-SUSPENDED-PROPOSAL-METHOD");

    static private final SubLString $str_alt72$_REMOVE_SUSPENDED_PROPOSAL__S____ = makeString("(REMOVE-SUSPENDED-PROPOSAL ~S): ~S is not an instance of CYBLACK-PROPOSAL.");

    static private final SubLString $str_alt73$_REMOVE_SUSPENDED_PROPOSAL__S___N = makeString("(REMOVE-SUSPENDED-PROPOSAL ~S): No suspended proposal list is associated with this agenda.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_REMOVE_SUSPENDED_PROPOSAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-REMOVE-SUSPENDED-PROPOSAL-METHOD");

    static private final SubLString $str_alt75$_ADD_SUSPENDED_PROPOSAL__S____S_i = makeString("(ADD-SUSPENDED-PROPOSAL ~S): ~S is not an instance of CYBLACK-PROPOSAL.");

    static private final SubLString $str_alt76$_ADD_SUSPENDED_PROPOSAL__S___No_s = makeString("(ADD-SUSPENDED-PROPOSAL ~S): No suspended proposal list is associated with this agenda.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_ADD_SUSPENDED_PROPOSAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-ADD-SUSPENDED-PROPOSAL-METHOD");





    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_INITIALIZE_QUA_CYBLACK_AGENDA_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-INITIALIZE-QUA-CYBLACK-AGENDA-METHOD");



    static private final SubLList $list_alt82 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("PUNLESS"), list(makeSymbol("="), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")), ZERO_INTEGER), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NTH"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), ZERO_INTEGER))), list(RET, makeSymbol("NEXT-ITEM"))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_PEEK_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-PEEK-METHOD");



    static private final SubLList $list_alt85 = list(makeSymbol("ORDERED-CONTENTS"));

    static private final SubLList $list_alt86 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("RESOLVED-LIST"), makeSymbol("ORDERED-CONTENTS")), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_REORDER_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-REORDER-CONTENTS-METHOD");



    static private final SubLList $list_alt89 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIRST"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LAST-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEXT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(RET, NIL));



    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_CLEAR_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-CLEAR-METHOD");



    static private final SubLList $list_alt93 = list(makeSymbol("NEW-CONTENTS"));

    static private final SubLList $list_alt94 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST")))), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("FIRST"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LAST-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEXT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST-ENUMERATOR")), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("TEMPLATE-CURRENT-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("TEMPLATE-ENUMERATOR"))), list(makeSymbol("PWHEN"), makeSymbol("NEW-CONTENTS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("CDOLIST"), list(makeSymbol("NEW-ITEM"), makeSymbol("NEW-CONTENTS")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ITEM"), list(QUOTE, makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF")))))), list(RET, makeSymbol("NEW-CONTENTS")));



    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_SET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-SET-CONTENTS-METHOD");



    static private final SubLList $list_alt98 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-CONTENTS"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_GET_CONTENTS_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-GET-CONTENTS-METHOD");



    static private final SubLList $list_alt101 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"))))), list(RET, ZERO_INTEGER));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_GET_ELEMENT_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-GET-ELEMENT-COUNT-METHOD");



    static private final SubLList $list_alt104 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("GET-PRIORITIZER"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PRIORITIZER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PRIORITIZER"), list(QUOTE, makeSymbol("ORDER-QUEUE")), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("DEQUEUED-ITEM"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("POP"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("DEQUEUED-ITEM"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DEQUEUED-ITEM"), list(QUOTE, makeSymbol("DEQUEUE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("DEQUEUED-ITEM"))))), list(RET, NIL));

    private static final SubLSymbol ORDER_QUEUE = makeSymbol("ORDER-QUEUE");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_DEQUEUE_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-DEQUEUE-METHOD");



    static private final SubLList $list_alt108 = list(makeSymbol("OLD-ELEMENT"));

    static private final SubLList $list_alt109 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("REMOVE"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("OLD-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("OLD-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-ELEMENT"), list(QUOTE, makeSymbol("REMOVE-NOTIFY")), makeSymbol("SELF"))), list(RET, makeSymbol("OLD-ELEMENT"))));



    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_REMOVE_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-REMOVE-METHOD");



    static private final SubLList $list_alt113 = list(makeSymbol("NEW-ELEMENT"));

    static private final SubLList $list_alt114 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-ELEMENT")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_ON_ENQUEUE_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-ON-ENQUEUE-METHOD");

    static private final SubLList $list_alt116 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-RESOLVED-LIST"), list(makeSymbol("GET-LIST"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-RESOLVED-LIST"), makeSymbol("NEW-ELEMENT")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("PASSIVE-P"), makeSymbol("SELF"))), list(makeSymbol("QUEUE-ELEMENT-INTERFACE-P"), makeSymbol("NEW-ELEMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-ELEMENT"), list(QUOTE, makeSymbol("ENQUEUE-NOTIFY")), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ENQUEUE")), makeSymbol("NEW-ELEMENT")), list(RET, makeSymbol("NEW-ELEMENT"))));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_ENQUEUE_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-ENQUEUE-METHOD");



    static private final SubLList $list_alt119 = list(makeSymbol("NEW-PRIORITIZER"));

    static private final SubLList $list_alt120 = list(list(makeSymbol("PUNLESS"), makeSymbol("NEW-PRIORITIZER"), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, NIL)), list(makeSymbol("MUST"), list(makeSymbol("QUEUE-PRIORITIZER-INTERFACE-P"), makeSymbol("NEW-PRIORITIZER")), makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE."), makeSymbol("SELF"), makeSymbol("NEW-PRIORITIZER")), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), makeSymbol("NEW-PRIORITIZER")), list(RET, makeSymbol("NEW-PRIORITIZER")));

    static private final SubLString $str_alt121$_SET_PRIORITIZER__S____S_is_not_a = makeString("(SET-PRIORITIZER ~S): ~S is not an instance of QUEUE-PRIORITIZER-INTERFACE.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_SET_PRIORITIZER_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-SET-PRIORITIZER-METHOD");



    static private final SubLList $list_alt124 = list(list(RET, list(makeSymbol("GET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_GET_PRIORITIZER_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-GET-PRIORITIZER-METHOD");



    static private final SubLList $list_alt127 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST")))), list(makeSymbol("SET-LIST-INTERNAL"), makeSymbol("SELF"), makeSymbol("TEMPLATE-LIST"))), list(RET, makeSymbol("TEMPLATE-LIST"))));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_GET_LIST_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-GET-LIST-METHOD");

    private static final SubLSymbol INITIALIZE_QUA_DOUBLY_LINKED_QUEUE = makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE");

    static private final SubLList $list_alt130 = list(list(makeSymbol("SET-LIST-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PRIORITIZER-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym131$CYBLACK_BASIC_SIMPLE_AGENDA_INITIALIZE_QUA_DOUBLY_LINKED_QUEUE_ME = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-INITIALIZE-QUA-DOUBLY-LINKED-QUEUE-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SIMPLE_AGENDA_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SIMPLE-AGENDA-CLASS");















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SIMPLE_AGENDA_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SIMPLE-AGENDA-INSTANCE");



    static private final SubLList $list_alt144 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-DOUBLY-LINKED-QUEUE"), makeSymbol("SELF")), list(makeSymbol("INITIALIZE-QUA-CYBLACK-AGENDA"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-INITIALIZE-METHOD");



    static private final SubLList $list_alt147 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt148 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LIST"), list(makeSymbol("GET-LIST-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-LIST"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("SIMPLE-AGENDA:{}")), list(RET, makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST")))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("TEMPLATE-ENUMERATOR")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>"), list(makeSymbol("CLASS-OF"), makeSymbol("SELF"))), list(RET, makeSymbol("SELF"))), list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("SIMPLE-AGENDA:{}"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("SIMPLE-AGENDA:{~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("FIRST")))), list(makeSymbol("WHILE"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("LAST-P")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("<-~S"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-ENUMERATOR"), list(QUOTE, makeSymbol("NEXT"))))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("}")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-LIST"), makeSymbol("TEMPLATE-ENUMERATOR")))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt149$SIMPLE_AGENDA___ = makeString("SIMPLE-AGENDA:{}");

    static private final SubLString $str_alt150$___S_Class_is_not_correctly_imple = makeString("#<~S Class is not correctly implemented.  ALLOCATE-ENUMERATOR failed.>");



    static private final SubLString $str_alt152$SIMPLE_AGENDA___S = makeString("SIMPLE-AGENDA:{~S");





    static private final SubLString $str_alt155$___S = makeString("<-~S");



    static private final SubLString $str_alt157$_ = makeString("}");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-PRINT-METHOD");

    static private final SubLList $list_alt159 = list(list(RET, list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("QUEUE-LIST")), list(makeSymbol("COLLECTION-TEMPLATE-EMPTY-P"), makeSymbol("QUEUE-LIST"))), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("SUSPENDED-PROPOSALS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("SUSPENDED-PROPOSALS"))), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("ACTIVE-PROPOSALS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("ACTIVE-PROPOSALS"))), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("EXECUTABLE-KSI-QUEUE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("EXECUTABLE-KSI-QUEUE"))))));

    static private final SubLSymbol $sym160$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_EMPTY_P_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-EMPTY-P-METHOD");



    static private final SubLList $list_alt163 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt164 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION.")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym165$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    static private final SubLString $str_alt166$_SET_APPLICATION__S____S_is_not_a = makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-APPLICATION.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt169 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("CLEAR"), makeSymbol("SELF")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_ON_STARTUP_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-ON-STARTUP-METHOD");



    static private final SubLList $list_alt172 = list(makeSymbol("OBJECT"));

    static private final SubLList $list_alt173 = list(list(RET, list(makeSymbol("FIF"), makeSymbol("QUEUE-LIST"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("MEMBER-P"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("QUEUE-LIST"), makeSymbol("OBJECT")), NIL)));

    static private final SubLSymbol $sym174$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_ENQUEUED_P_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-ENQUEUED-P-METHOD");



    static private final SubLList $list_alt177 = list(makeSymbol("KEY-VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("EQUALITY-PRED"), list(makeSymbol("FUNCTION"), EQL)), list(makeSymbol("KEY-ACCESSOR-FUNCTION"), list(makeSymbol("FUNCTION"), IDENTITY)));

    static private final SubLList $list_alt178 = list(list(makeSymbol("PWHEN"), makeSymbol("QUEUE-LIST"), list(makeSymbol("CLET"), list(list(makeSymbol("ENUMERATOR"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("QUEUE-LIST")))), list(makeSymbol("PWHEN"), makeSymbol("ENUMERATOR"), list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("FIRST"))))), list(makeSymbol("WHILE"), makeSymbol("CURRENT-ELEMENT"), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET"), list(makeSymbol("FUNCALL"), makeSymbol("KEY-ACCESSOR-FUNCTION"), makeSymbol("CURRENT-ELEMENT")))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL"), makeSymbol("EQUALITY-PRED"), makeSymbol("KEY-VALUE"), makeSymbol("TARGET")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("QUEUE-LIST"), makeSymbol("ENUMERATOR")), list(RET, makeSymbol("CURRENT-ELEMENT")))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-ELEMENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ENUMERATOR"), list(QUOTE, makeSymbol("NEXT")))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEALLOCATE-ENUMERATOR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("QUEUE-LIST"), makeSymbol("ENUMERATOR"))))), list(RET, NIL));

    static private final SubLSymbol $sym179$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_FIND_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-FIND-METHOD");



    static private final SubLList $list_alt182 = list(list(RET, makeSymbol("IS-PASSIVE")));

    static private final SubLSymbol $sym183$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_PASSIVE_P_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-PASSIVE-P-METHOD");



    static private final SubLList $list_alt186 = list(makeSymbol("FLAG"));

    static private final SubLList $list_alt187 = list(list(makeSymbol("CSETQ"), makeSymbol("IS-PASSIVE"), makeSymbol("FLAG")), list(RET, makeSymbol("FLAG")));

    static private final SubLSymbol $sym188$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_SET_PASSIVE_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-SET-PASSIVE-METHOD");



    static private final SubLList $list_alt191 = list(list(RET, makeSymbol("QUEUE-LIST")));

    static private final SubLSymbol $sym192$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_GET_LIST_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-GET-LIST-INTERNAL-METHOD");



    static private final SubLList $list_alt195 = list(makeSymbol("NEW-LIST"));

    static private final SubLList $list_alt196 = list(list(makeSymbol("CSETQ"), makeSymbol("QUEUE-LIST"), makeSymbol("NEW-LIST")), list(RET, makeSymbol("NEW-LIST")));

    static private final SubLSymbol $sym197$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_SET_LIST_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-SET-LIST-INTERNAL-METHOD");



    static private final SubLList $list_alt200 = list(list(RET, makeSymbol("QUEUE-PRIORITIZER")));

    static private final SubLSymbol $sym201$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_GET_PRIORITIZER_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-GET-PRIORITIZER-INTERNAL-METHOD");



    static private final SubLList $list_alt204 = list(list(makeSymbol("CSETQ"), makeSymbol("QUEUE-PRIORITIZER"), makeSymbol("NEW-PRIORITIZER")), list(RET, makeSymbol("NEW-PRIORITIZER")));

    static private final SubLSymbol $sym205$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_SET_PRIORITIZER_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-SET-PRIORITIZER-INTERNAL-METHOD");



    static private final SubLList $list_alt208 = list(makeSymbol("PROPOSAL"));

    static private final SubLList $list_alt209 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), makeString("(PROPOSE ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("ENQUEUE"), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("PROPOSAL")));

    static private final SubLString $str_alt210$_PROPOSE__S____S_is_not_an_instan = makeString("(PROPOSE ~S): ~S is not an instance of CYBLACK-PROPOSAL.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_PROPOSE_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-PROPOSE-METHOD");



    static private final SubLList $list_alt213 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), makeString("(RETRACT ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(RET, makeSymbol("PROPOSAL")));

    static private final SubLString $str_alt214$_RETRACT__S____S_is_not_an_instan = makeString("(RETRACT ~S): ~S is not an instance of CYBLACK-PROPOSAL.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_RETRACT_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-RETRACT-METHOD");

    private static final SubLSymbol CHECK_PROPOSAL = makeSymbol("CHECK-PROPOSAL");

    static private final SubLList $list_alt217 = list(list(makeSymbol("PIF"), list(makeSymbol("CAND"), makeSymbol("PROPOSAL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROPOSAL"), list(QUOTE, makeSymbol("GET-KNOWLEDGE-SOURCE")))), list(RET, T), list(makeSymbol("PROGN"), list(makeSymbol("WARN"), makeString("(CHECK-PROPOSAL ~S): Proposal ~S is not well formed."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(RET, NIL))));



    static private final SubLString $str_alt219$_CHECK_PROPOSAL__S___Proposal__S_ = makeString("(CHECK-PROPOSAL ~S): Proposal ~S is not well formed.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_CHECK_PROPOSAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-CHECK-PROPOSAL-METHOD");

    private static final SubLSymbol EXECUTE_INTERNAL = makeSymbol("EXECUTE-INTERNAL");

    static private final SubLList $list_alt222 = list(list(makeSymbol("CHECK-PROPOSAL"), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-P"), makeSymbol("PROPOSAL")), list(makeSymbol("CYBLACK-ASYNCHRONOUS-P"), list(makeSymbol("CYBLACK-PROPOSAL-GET-EXECUTION-MODE"), makeSymbol("PROPOSAL")))), list(makeSymbol("PROGN"), list(makeSymbol("ADD-SUSPENDED-PROPOSAL"), makeSymbol("SELF"), makeSymbol("PROPOSAL"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROPOSAL"), list(QUOTE, makeSymbol("VALIDITY-RECONFIRMED-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROPOSAL"), list(QUOTE, makeSymbol("GENERATE-KSI"))))), list(makeSymbol("PWHEN"), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("EXECUTABLE-KSI-QUEUE"), makeSymbol("KSI")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ISOLATE"), makeSymbol("OBJECT")), makeSymbol("PROPOSAL")), list(RET, NIL))))), list(RET, NIL));

    static private final SubLSymbol $sym223$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol $ASYNCHRONOUS = makeKeyword("ASYNCHRONOUS");

    private static final SubLSymbol VALIDITY_RECONFIRMED_P = makeSymbol("VALIDITY-RECONFIRMED-P");



    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_EXECUTE_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-EXECUTE-INTERNAL-METHOD");



    static private final SubLList $list_alt229 = list(list(makeSymbol("CLET"), list(makeSymbol("KSI"), makeSymbol("PROPOSAL")), list(makeSymbol("PIF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("EXECUTABLE-KSI-QUEUE")), list(makeSymbol("PIF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("ACTIVE-PROPOSALS")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL"), list(makeSymbol("DEQUEUE"), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), makeSymbol("PROPOSAL"), list(RET, list(makeSymbol("EXECUTE-INTERNAL"), makeSymbol("SELF"), makeSymbol("PROPOSAL"))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("PROPOSAL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("ACTIVE-PROPOSALS"))), list(makeSymbol("PWHEN"), makeSymbol("PROPOSAL"), list(makeSymbol("MUST"), makeSymbol("APPLICATION"), makeString("(EXECUTE ~S): No application is associated with this agenda."), makeSymbol("SELF")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-P"), makeSymbol("PROPOSAL")), list(makeSymbol("CYBLACK-SYNCHRONOUS-P"), list(makeSymbol("CYBLACK-PROPOSAL-GET-EXECUTION-MODE"), makeSymbol("PROPOSAL")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROPOSAL"), list(QUOTE, makeSymbol("GENERATE-KSI"))), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("CYBLACK-APPLICATION-GET-MESSAGE-BROKER"), makeSymbol("APPLICATION")))), list(makeSymbol("MUST"), makeSymbol("MESSAGE-BROKER"), makeString("(EXECUTE ~S): No message broker is associated with application ~S."), makeSymbol("SELF"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EXECUTE"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("MESSAGE-BROKER"), makeSymbol("PROPOSAL")), list(RET, NIL))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("KSI"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("DEQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("EXECUTABLE-KSI-QUEUE"))), list(makeSymbol("PWHEN"), makeSymbol("KSI"), list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KSI"), list(QUOTE, makeSymbol("EXECUTE"))))), list(makeSymbol("PWHEN"), list(makeSymbol("QUIESCENCE-P"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-QUIESCENCE")))), list(RET, makeSymbol("RESULT")))))), list(RET, NIL)));

    static private final SubLSymbol $sym230$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    static private final SubLString $str_alt231$_EXECUTE__S___No_application_is_a = makeString("(EXECUTE ~S): No application is associated with this agenda.");

    private static final SubLSymbol $SYNCHRONOUS = makeKeyword("SYNCHRONOUS");

    static private final SubLString $str_alt233$_EXECUTE__S___No_message_broker_i = makeString("(EXECUTE ~S): No message broker is associated with application ~S.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_EXECUTE_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-EXECUTE-METHOD");

    private static final SubLSymbol GET_PENDING_PROPOSAL_COUNT = makeSymbol("GET-PENDING-PROPOSAL-COUNT");

    static private final SubLList $list_alt236 = list(list(RET, list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_GET_PENDING_PROPOSAL_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-GET-PENDING-PROPOSAL-COUNT-METHOD");



    static private final SubLList $list_alt239 = list(list(RET, makeSymbol("SUSPENDED-PROPOSALS")));

    static private final SubLSymbol $sym240$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_GET_SUSPENDED_PROPOSALS_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-GET-SUSPENDED-PROPOSALS-METHOD");

    private static final SubLSymbol SET_SUSPENDED_PROPOSALS = makeSymbol("SET-SUSPENDED-PROPOSALS");

    static private final SubLList $list_alt243 = list(makeSymbol("NEW-SUSPENDED-PROPOSALS"));

    static private final SubLList $list_alt244 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-SUSPENDED-PROPOSALS")), list(makeSymbol("BASIC-DOUBLY-LINKED-LIST-P"), makeSymbol("NEW-SUSPENDED-PROPOSALS"))), makeString("(SET-SUSPENDED-PROPOSALS ~S): ~S is not an instance of BASIC-DOUBLY-LINKED-LIST."), makeSymbol("SELF"), makeSymbol("NEW-SUSPENDED-PROPOSALS")), list(makeSymbol("CSETQ"), makeSymbol("SUSPENDED-PROPOSALS"), makeSymbol("NEW-SUSPENDED-PROPOSALS")), list(RET, makeSymbol("NEW-SUSPENDED-PROPOSALS")));

    static private final SubLSymbol $sym245$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    static private final SubLString $str_alt246$_SET_SUSPENDED_PROPOSALS__S____S_ = makeString("(SET-SUSPENDED-PROPOSALS ~S): ~S is not an instance of BASIC-DOUBLY-LINKED-LIST.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_SET_SUSPENDED_PROPOSALS_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-SET-SUSPENDED-PROPOSALS-METHOD");



    static private final SubLList $list_alt249 = list(list(RET, makeSymbol("ACTIVE-PROPOSALS")));

    static private final SubLSymbol $sym250$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_GET_ACTIVE_PROPOSALS_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-GET-ACTIVE-PROPOSALS-METHOD");

    private static final SubLSymbol SET_ACTIVE_PROPOSALS = makeSymbol("SET-ACTIVE-PROPOSALS");

    static private final SubLList $list_alt253 = list(makeSymbol("NEW-ACTIVE-PROPOSALS"));

    static private final SubLList $list_alt254 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-ACTIVE-PROPOSALS")), list(makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-P"), makeSymbol("NEW-ACTIVE-PROPOSALS"))), makeString("(SET-ACTIVE-PROPOSALS ~S): ~S is not an instance of BASIC-DOUBLY-LINKED-QUEUE."), makeSymbol("SELF"), makeSymbol("NEW-ACTIVE-PROPOSALS")), list(makeSymbol("CSETQ"), makeSymbol("ACTIVE-PROPOSALS"), makeSymbol("NEW-ACTIVE-PROPOSALS")), list(RET, makeSymbol("NEW-ACTIVE-PROPOSALS")));

    static private final SubLSymbol $sym255$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    static private final SubLString $str_alt256$_SET_ACTIVE_PROPOSALS__S____S_is_ = makeString("(SET-ACTIVE-PROPOSALS ~S): ~S is not an instance of BASIC-DOUBLY-LINKED-QUEUE.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_SET_ACTIVE_PROPOSALS_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-SET-ACTIVE-PROPOSALS-METHOD");



    static private final SubLList $list_alt259 = list(list(RET, makeSymbol("EXECUTABLE-KSI-QUEUE")));

    static private final SubLSymbol $sym260$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_GET_EXECUTABLE_KSI_QUEUE_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-GET-EXECUTABLE-KSI-QUEUE-METHOD");

    private static final SubLSymbol SET_EXECUTABLE_KSI_QUEUE = makeSymbol("SET-EXECUTABLE-KSI-QUEUE");

    static private final SubLList $list_alt263 = list(makeSymbol("NEW-QUEUE"));

    static private final SubLList $list_alt264 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-QUEUE")), list(makeSymbol("BASIC-DOUBLY-LINKED-QUEUE-P"), makeSymbol("NEW-QUEUE"))), makeString("(SET-EXECUTABLE-KSI-QUEUE ~S): ~S is not an instance of BASIC-DOUBLY-LINKED-QUEUE."), makeSymbol("SELF"), makeSymbol("NEW-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("EXECUTABLE-KSI-QUEUE"), makeSymbol("NEW-QUEUE")), list(RET, makeSymbol("NEW-QUEUE")));

    static private final SubLSymbol $sym265$OUTER_CATCH_FOR_CYBLACK_BASIC_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SIMPLE-AGENDA-METHOD");

    static private final SubLString $str_alt266$_SET_EXECUTABLE_KSI_QUEUE__S____S = makeString("(SET-EXECUTABLE-KSI-QUEUE ~S): ~S is not an instance of BASIC-DOUBLY-LINKED-QUEUE.");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_SET_EXECUTABLE_KSI_QUEUE_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-SET-EXECUTABLE-KSI-QUEUE-METHOD");

    static private final SubLList $list_alt268 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), list(makeSymbol("GET-SUSPENDED-PROPOSALS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), makeSymbol("TEMPLATE-SUSPENDED-PROPOSALS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-ACTIVE-PROPOSALS"), list(makeSymbol("GET-ACTIVE-PROPOSALS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-ACTIVE-PROPOSALS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-ACTIVE-PROPOSALS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-EXECUTABLE-KSI-QUEUE"), list(makeSymbol("GET-EXECUTABLE-KSI-QUEUE"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-EXECUTABLE-KSI-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLEAR"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("TEMPLATE-EXECUTABLE-KSI-QUEUE")))), list(makeSymbol("CLEAR"), makeSymbol("SELF")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA_RESET_METHOD = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA-RESET-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA = makeSymbol("CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA");

    static private final SubLList $list_alt271 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPOSE"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRACT"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym272$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA-CLASS");

    static private final SubLSymbol $sym273$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA-INSTANCE");

    static private final SubLList $list_alt274 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), makeString("(PROPOSE ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("ENQUEUE"), makeSymbol("SELF"), makeSymbol("PROPOSAL"))), list(RET, makeSymbol("PROPOSAL")));

    static private final SubLSymbol $sym275$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA_PROPOSE_METHOD = makeSymbol("CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA-PROPOSE-METHOD");

    static private final SubLList $list_alt277 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PROPOSAL-P"), makeSymbol("PROPOSAL")), makeString("(RETRACT ~S): ~S is not an instance of CYBLACK-PROPOSAL."), makeSymbol("SELF"), makeSymbol("PROPOSAL")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("REMOVE"), makeSymbol("SELF"), makeSymbol("PROPOSAL"))), list(RET, makeSymbol("PROPOSAL")));

    static private final SubLSymbol $sym278$OUTER_CATCH_FOR_CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_AUTO_LOCKING_SIMPLE_AGENDA_RETRACT_METHOD = makeSymbol("CYBLACK-BASIC-AUTO-LOCKING-SIMPLE-AGENDA-RETRACT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_IPC_AGENDA = makeSymbol("CYBLACK-BASIC-IPC-AGENDA");

    static private final SubLList $list_alt281 = list(list(makeSymbol("BASE-NAME"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), makeString("CYBLACK-BASIC-IPC-AGENDA")), list(makeSymbol("BASE-SUFFIX-COUNTER"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), ZERO_INTEGER), list(makeSymbol("SEMAPHORE-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SEMAPHORE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPOSE"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRACT"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")));









    static private final SubLString $str_alt286$CYBLACK_BASIC_IPC_AGENDA = makeString("CYBLACK-BASIC-IPC-AGENDA");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_IPC_AGENDA_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-IPC-AGENDA-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_IPC_AGENDA_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-IPC-AGENDA-INSTANCE");

    static private final SubLList $list_alt289 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SEMAPHORE-NAME"), list(makeSymbol("FORMAT-TO-STRING"), makeKeyword("A"), makeSymbol("BASE-NAME"), makeKeyword("A"), makeString("-"), makeKeyword("D"), makeSymbol("BASE-SUFFIX-COUNTER"))), list(makeSymbol("CINC"), makeSymbol("BASE-SUFFIX-COUNTER")), list(makeSymbol("CSETQ"), makeSymbol("LOCK"), list(makeSymbol("CCONCATENATE"), makeString("Lock for Queue "), makeSymbol("SEMAPHORE-NAME"))), list(makeSymbol("CSETQ"), makeSymbol("SEMAPHORE"), list(makeSymbol("NEW-SEMAPHORE"), makeSymbol("SEMAPHORE-NAME"), ZERO_INTEGER)), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym290$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-IPC-AGENDA-METHOD");

    static private final SubLString $str_alt291$_ = makeString("-");

    static private final SubLString $str_alt292$Lock_for_Queue_ = makeString("Lock for Queue ");

    private static final SubLSymbol CYBLACK_BASIC_IPC_AGENDA_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-IPC-AGENDA-INITIALIZE-METHOD");

    static private final SubLList $list_alt294 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("PROPOSE"), makeSymbol("SUPER"), makeSymbol("PROPOSAL")))), list(makeSymbol("V-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym295$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-IPC-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_IPC_AGENDA_PROPOSE_METHOD = makeSymbol("CYBLACK-BASIC-IPC-AGENDA-PROPOSE-METHOD");

    static private final SubLList $list_alt297 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("RETRACT"), makeSymbol("SUPER"), makeSymbol("PROPOSAL")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym298$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-IPC-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_IPC_AGENDA_RETRACT_METHOD = makeSymbol("CYBLACK-BASIC-IPC-AGENDA-RETRACT-METHOD");

    static private final SubLList $list_alt300 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("P-SEMAPHORE"), makeSymbol("SEMAPHORE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("EXECUTE"), makeSymbol("SUPER")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym301$OUTER_CATCH_FOR_CYBLACK_BASIC_IPC_AGENDA_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-IPC-AGENDA-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_IPC_AGENDA_EXECUTE_METHOD = makeSymbol("CYBLACK-BASIC-IPC-AGENDA-EXECUTE-METHOD");

    static private final SubLString $str_alt303$CYBLACK_AGENDA_GET_SUSPENDED_PROP = makeString("CYBLACK-AGENDA-GET-SUSPENDED-PROPOSALS: ~S is not an instance of CYBLACK-AGENDA.");

    static private final SubLString $str_alt304$CYBLACK_AGENDA_GET_ACTIVE_PROPOSA = makeString("CYBLACK-AGENDA-GET-ACTIVE-PROPOSALS: ~S is not an instance of CYBLACK-AGENDA.");

    static private final SubLString $str_alt305$CYBLACK_AGENDA_GET_EXECUTABLE_KSI = makeString("CYBLACK-AGENDA-GET-EXECUTABLE-KSI-QUEUE: ~S is not an instance of CYBLACK-AGENDA.");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_agenda_file();
    }

    public void initializeVariables() {
        init_cyblack_agenda_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_agenda_file();
    }
}

