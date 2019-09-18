/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subloop_collections;
import com.cyc.cycjava.cycl.subloop_queues;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-PROPOSAL
 *  source file: /cyc/top/cycl/cyblack/cyblack-proposal.lisp
 *  created:     2019/07/03 17:38:48
 */
public final class cyblack_proposal extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_proposal() {
    }

    public static final SubLFile me = new cyblack_proposal();


    // // Definitions
    public static final SubLObject cyblack_proposal_p(SubLObject v_cyblack_proposal) {
        return interfaces.subloop_instanceof_interface(v_cyblack_proposal, CYBLACK_PROPOSAL);
    }

    public static final SubLObject get_cyblack_basic_proposal_qua_list_element_parent_links(SubLObject cyblack_basic_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_proposal, TEN_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject set_cyblack_basic_proposal_qua_list_element_parent_links(SubLObject cyblack_basic_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_proposal, value, TEN_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject get_cyblack_basic_proposal_verified(SubLObject cyblack_basic_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_proposal, NINE_INTEGER, VERIFIED);
    }

    public static final SubLObject set_cyblack_basic_proposal_verified(SubLObject cyblack_basic_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_proposal, value, NINE_INTEGER, VERIFIED);
    }

    public static final SubLObject get_cyblack_basic_proposal_execution_mode(SubLObject cyblack_basic_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_proposal, EIGHT_INTEGER, EXECUTION_MODE);
    }

    public static final SubLObject set_cyblack_basic_proposal_execution_mode(SubLObject cyblack_basic_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_proposal, value, EIGHT_INTEGER, EXECUTION_MODE);
    }

    public static final SubLObject get_cyblack_basic_proposal_proposed_removals(SubLObject cyblack_basic_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_proposal, SEVEN_INTEGER, PROPOSED_REMOVALS);
    }

    public static final SubLObject set_cyblack_basic_proposal_proposed_removals(SubLObject cyblack_basic_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_proposal, value, SEVEN_INTEGER, PROPOSED_REMOVALS);
    }

    public static final SubLObject get_cyblack_basic_proposal_proposed_contributions(SubLObject cyblack_basic_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_proposal, SIX_INTEGER, PROPOSED_CONTRIBUTIONS);
    }

    public static final SubLObject set_cyblack_basic_proposal_proposed_contributions(SubLObject cyblack_basic_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_proposal, value, SIX_INTEGER, PROPOSED_CONTRIBUTIONS);
    }

    public static final SubLObject get_cyblack_basic_proposal_agenda(SubLObject cyblack_basic_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_proposal, FIVE_INTEGER, AGENDA);
    }

    public static final SubLObject set_cyblack_basic_proposal_agenda(SubLObject cyblack_basic_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_proposal, value, FIVE_INTEGER, AGENDA);
    }

    public static final SubLObject get_cyblack_basic_proposal_qua_list_element_self_deletion_mode(SubLObject cyblack_basic_proposal) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_proposal);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_proposal, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_basic_proposal));
    }

    public static final SubLObject set_cyblack_basic_proposal_qua_list_element_self_deletion_mode(SubLObject cyblack_basic_proposal, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_proposal);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_proposal, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_basic_proposal, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_basic_proposal)));
        return value;
    }

    public static final SubLObject cyblack_basic_proposal_perform_action_method(SubLObject self, SubLObject action, SubLObject parameters) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_on_delete_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_on_add_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_get_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_basic_proposal_get_parent_links_method(self);
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

    public static final SubLObject cyblack_basic_proposal_member_p_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_basic_proposal_get_parent_links_method(self);
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

    public static final SubLObject cyblack_basic_proposal_delete_self_from_all_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_basic_proposal_get_parent_links_method(self);
            try {
                cyblack_basic_proposal_set_self_deletion_mode_method(self, T);
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
                        cyblack_basic_proposal_set_self_deletion_mode_method(self, NIL);
                        cyblack_basic_proposal_set_parent_links_method(self, NIL);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_basic_proposal_delete_self_from_collection_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_basic_proposal_get_parent_links_method(self);
            SubLObject template_parent_link = NIL;
            SubLObject template_target_link = NIL;
            if (NIL != template_parent_links) {
                if (subloop_collections.dlc_owner(template_parent_links.first()) == collection) {
                    template_target_link = template_parent_links.first();
                    cyblack_basic_proposal_set_parent_links_method(self, template_parent_links.rest());
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
                        cyblack_basic_proposal_set_self_deletion_mode_method(self, T);
                        subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_target_link), template_target_link);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                subloop_collections._csetf_dlc_owner(template_target_link, NIL);
                                methods.funcall_instance_method_with_1_args(self, ON_DELETE, collection);
                                cyblack_basic_proposal_set_self_deletion_mode_method(self, NIL);
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

    public static final SubLObject cyblack_basic_proposal_delete_parent_link_method(SubLObject self, SubLObject old_parent_link) {
        {
            SubLObject template_parent_links = cyblack_basic_proposal_get_parent_links_method(self);
            if (NIL != template_parent_links) {
                if (old_parent_link == template_parent_links) {
                    cyblack_basic_proposal_set_parent_links_method(self, template_parent_links.rest());
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

    public static final SubLObject cyblack_basic_proposal_add_parent_link_method(SubLObject self, SubLObject new_parent_link) {
        cyblack_basic_proposal_set_parent_links_method(self, cons(new_parent_link, cyblack_basic_proposal_get_parent_links_method(self)));
        methods.funcall_instance_method_with_1_args(self, ON_ADD, subloop_collections.dlc_owner(new_parent_link));
        return new_parent_link;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_p(SubLObject cyblack_basic_proposal) {
        return classes.subloop_instanceof_class(cyblack_basic_proposal, CYBLACK_BASIC_PROPOSAL);
    }

    public static final SubLObject cyblack_basic_proposal_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_proposal_method = NIL;
            SubLObject verified = get_cyblack_basic_proposal_verified(self);
            SubLObject execution_mode = get_cyblack_basic_proposal_execution_mode(self);
            SubLObject proposed_removals = get_cyblack_basic_proposal_proposed_removals(self);
            SubLObject proposed_contributions = get_cyblack_basic_proposal_proposed_contributions(self);
            try {
                try {
                    cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
                    cyblack_basic_proposal_initialize_qua_list_element_template_method(self);
                    proposed_contributions = NIL;
                    proposed_removals = NIL;
                    execution_mode = $SYNCHRONOUS;
                    verified = NIL;
                    sublisp_throw($sym62$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_proposal_verified(self, verified);
                            set_cyblack_basic_proposal_execution_mode(self, execution_mode);
                            set_cyblack_basic_proposal_proposed_removals(self, proposed_removals);
                            set_cyblack_basic_proposal_proposed_contributions(self, proposed_contributions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym62$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_basic_proposal_method;
        }
    }

    public static final SubLObject cyblack_basic_proposal_get_knowledge_source_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_set_knowledge_source_method(SubLObject self, SubLObject new_knowledge_source) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_get_external_knowledge_source_method(SubLObject self) {
        {
            SubLObject associated_knowledge_source = methods.funcall_instance_method_with_0_args(self, GET_KNOWLEDGE_SOURCE);
            if ((NIL != associated_knowledge_source) && (NIL != cyblack_ks.cyblack_external_knowledge_source_p(associated_knowledge_source))) {
                return cyblack_ks.cyblack_external_knowledge_source_get_external_knowledge_source_method(associated_knowledge_source);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_proposal_get_activation_pattern_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_set_activation_pattern_method(SubLObject self, SubLObject new_activation_pattern) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_get_agenda_method(SubLObject self) {
        {
            SubLObject v_agenda = get_cyblack_basic_proposal_agenda(self);
            return v_agenda;
        }
    }

    public static final SubLObject cyblack_basic_proposal_set_agenda_method(SubLObject self, SubLObject new_agenda) {
        {
            SubLObject catch_var_for_cyblack_basic_proposal_method = NIL;
            SubLObject v_agenda = get_cyblack_basic_proposal_agenda(self);
            try {
                try {
                    v_agenda = new_agenda;
                    sublisp_throw($sym89$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD, new_agenda);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_proposal_agenda(self, v_agenda);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym89$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_basic_proposal_method;
        }
    }

    public static final SubLObject cyblack_basic_proposal_get_reasons_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_set_reasons_method(SubLObject self, SubLObject new_reasons) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_validity_reconfirmed_p_method(SubLObject self) {
        return T;
    }

    public static final SubLObject cyblack_basic_proposal_withdraw_method(SubLObject self) {
        cyblack_basic_proposal_delete_self_from_all_collections_method(self);
        return self;
    }

    public static final SubLObject cyblack_basic_proposal_get_timestamp_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_set_timestamp_method(SubLObject self, SubLObject universal_time) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_get_execution_mode_method(SubLObject self) {
        {
            SubLObject execution_mode = get_cyblack_basic_proposal_execution_mode(self);
            return execution_mode;
        }
    }

    public static final SubLObject cyblack_basic_proposal_set_execution_mode_method(SubLObject self, SubLObject new_execution_mode) {
        {
            SubLObject catch_var_for_cyblack_basic_proposal_method = NIL;
            SubLObject execution_mode = get_cyblack_basic_proposal_execution_mode(self);
            try {
                try {
                    execution_mode = new_execution_mode;
                    sublisp_throw($sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD, new_execution_mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_proposal_execution_mode(self, execution_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_basic_proposal_method;
        }
    }

    public static final SubLObject cyblack_basic_proposal_generate_ksi_method(SubLObject self) {
        {
            SubLObject ks = methods.funcall_instance_method_with_0_args(self, GET_KNOWLEDGE_SOURCE);
            return methods.funcall_instance_method_with_1_args(ks, GENERATE_KSI, self);
        }
    }

    public static final SubLObject cyblack_basic_proposal_get_proposed_contributions_method(SubLObject self) {
        {
            SubLObject proposed_contributions = get_cyblack_basic_proposal_proposed_contributions(self);
            return proposed_contributions;
        }
    }

    public static final SubLObject cyblack_basic_proposal_set_proposed_contributions_method(SubLObject self, SubLObject new_contributions_bag) {
        {
            SubLObject catch_var_for_cyblack_basic_proposal_method = NIL;
            SubLObject proposed_contributions = get_cyblack_basic_proposal_proposed_contributions(self);
            try {
                try {
                    proposed_contributions = new_contributions_bag;
                    sublisp_throw($sym126$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD, new_contributions_bag);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_proposal_proposed_contributions(self, proposed_contributions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym126$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_basic_proposal_method;
        }
    }

    public static final SubLObject cyblack_basic_proposal_get_proposed_removals_method(SubLObject self) {
        {
            SubLObject proposed_removals = get_cyblack_basic_proposal_proposed_removals(self);
            return proposed_removals;
        }
    }

    public static final SubLObject cyblack_basic_proposal_set_proposed_removals_method(SubLObject self, SubLObject new_removals_bag) {
        {
            SubLObject catch_var_for_cyblack_basic_proposal_method = NIL;
            SubLObject proposed_removals = get_cyblack_basic_proposal_proposed_removals(self);
            try {
                try {
                    proposed_removals = new_removals_bag;
                    sublisp_throw($sym134$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD, new_removals_bag);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_proposal_proposed_removals(self, proposed_removals);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym134$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_basic_proposal_method;
        }
    }

    public static final SubLObject cyblack_basic_proposal_create_datatype_bag_method(SubLObject self, SubLObject typestrings) {
        {
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            if (NIL != application) {
                {
                    SubLObject datatype_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(application);
                    if (NIL != datatype_dictionary) {
                        {
                            SubLObject v_bag = object.object_new_method(BASIC_BAG);
                            SubLObject cdolist_list_var = typestrings;
                            SubLObject typestring = NIL;
                            for (typestring = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , typestring = cdolist_list_var.first()) {
                                subloop_collections.basic_bag_add_method(v_bag, cyblack_datatype_dictionary.cyblack_datatype_dictionary_intern(datatype_dictionary, typestring, UNPROVIDED));
                            }
                            return v_bag;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_proposal_verified_p_method(SubLObject self) {
        {
            SubLObject verified = get_cyblack_basic_proposal_verified(self);
            return verified;
        }
    }

    public static final SubLObject cyblack_basic_proposal_set_verified_method(SubLObject self, SubLObject new_verified_value) {
        {
            SubLObject catch_var_for_cyblack_basic_proposal_method = NIL;
            SubLObject verified = get_cyblack_basic_proposal_verified(self);
            try {
                try {
                    verified = (NIL != new_verified_value) ? ((SubLObject) (T)) : NIL;
                    sublisp_throw($sym148$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD, verified);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_proposal_verified(self, verified);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym148$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_basic_proposal_method;
        }
    }

    public static final SubLObject cyblack_basic_proposal_initialize_qua_list_element_template_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_proposal_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_basic_proposal_qua_list_element_parent_links(self);
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_basic_proposal_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    qua_list_element_self_deletion_mode = NIL;
                    qua_list_element_parent_links = NIL;
                    sublisp_throw($sym152$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_proposal_qua_list_element_parent_links(self, qua_list_element_parent_links);
                            set_cyblack_basic_proposal_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym152$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_basic_proposal_method;
        }
    }

    public static final SubLObject cyblack_basic_proposal_get_parent_links_method(SubLObject self) {
        {
            SubLObject qua_list_element_parent_links = get_cyblack_basic_proposal_qua_list_element_parent_links(self);
            return qua_list_element_parent_links;
        }
    }

    public static final SubLObject cyblack_basic_proposal_set_parent_links_method(SubLObject self, SubLObject new_parent_links) {
        {
            SubLObject catch_var_for_cyblack_basic_proposal_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_basic_proposal_qua_list_element_parent_links(self);
            try {
                try {
                    qua_list_element_parent_links = new_parent_links;
                    sublisp_throw($sym160$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD, new_parent_links);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_proposal_qua_list_element_parent_links(self, qua_list_element_parent_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym160$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_basic_proposal_method;
        }
    }

    public static final SubLObject cyblack_basic_proposal_get_self_deletion_mode_method(SubLObject self) {
        {
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_basic_proposal_qua_list_element_self_deletion_mode(self);
            return qua_list_element_self_deletion_mode;
        }
    }

    public static final SubLObject cyblack_basic_proposal_set_self_deletion_mode_method(SubLObject self, SubLObject mode) {
        {
            SubLObject catch_var_for_cyblack_basic_proposal_method = NIL;
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_basic_proposal_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    qua_list_element_self_deletion_mode = mode;
                    sublisp_throw($sym168$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD, mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_proposal_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym168$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_basic_proposal_method;
        }
    }

    public static final SubLObject cyblack_basic_proposal_enqueue_notify_method(SubLObject self, SubLObject queue) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_dequeue_notify_method(SubLObject self, SubLObject queue) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_proposal_remove_notify_method(SubLObject self, SubLObject queue) {
        return NIL;
    }

    public static final SubLObject get_cyblack_internal_proposal_timestamp(SubLObject cyblack_internal_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_proposal, FOURTEEN_INTEGER, TIMESTAMP);
    }

    public static final SubLObject set_cyblack_internal_proposal_timestamp(SubLObject cyblack_internal_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_proposal, value, FOURTEEN_INTEGER, TIMESTAMP);
    }

    public static final SubLObject get_cyblack_internal_proposal_reasons(SubLObject cyblack_internal_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_proposal, THIRTEEN_INTEGER, REASONS);
    }

    public static final SubLObject set_cyblack_internal_proposal_reasons(SubLObject cyblack_internal_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_proposal, value, THIRTEEN_INTEGER, REASONS);
    }

    public static final SubLObject get_cyblack_internal_proposal_activation_pattern(SubLObject cyblack_internal_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_proposal, TWELVE_INTEGER, ACTIVATION_PATTERN);
    }

    public static final SubLObject set_cyblack_internal_proposal_activation_pattern(SubLObject cyblack_internal_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_proposal, value, TWELVE_INTEGER, ACTIVATION_PATTERN);
    }

    public static final SubLObject get_cyblack_internal_proposal_knowledge_source(SubLObject cyblack_internal_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_internal_proposal, ELEVEN_INTEGER, KNOWLEDGE_SOURCE);
    }

    public static final SubLObject set_cyblack_internal_proposal_knowledge_source(SubLObject cyblack_internal_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_internal_proposal, value, ELEVEN_INTEGER, KNOWLEDGE_SOURCE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_internal_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, KNOWLEDGE_SOURCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, REASONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_INTERNAL_PROPOSAL, TIMESTAMP, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_internal_proposal_p(SubLObject cyblack_internal_proposal) {
        return classes.subloop_instanceof_class(cyblack_internal_proposal, CYBLACK_INTERNAL_PROPOSAL);
    }

    public static final SubLObject cyblack_internal_proposal_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_internal_proposal_method = NIL;
            SubLObject timestamp = get_cyblack_internal_proposal_timestamp(self);
            SubLObject reasons = get_cyblack_internal_proposal_reasons(self);
            SubLObject activation_pattern = get_cyblack_internal_proposal_activation_pattern(self);
            SubLObject knowledge_source = get_cyblack_internal_proposal_knowledge_source(self);
            try {
                try {
                    cyblack_basic_proposal_initialize_method(self);
                    knowledge_source = NIL;
                    activation_pattern = NIL;
                    reasons = NIL;
                    timestamp = NIL;
                    sublisp_throw($sym187$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_proposal_timestamp(self, timestamp);
                            set_cyblack_internal_proposal_reasons(self, reasons);
                            set_cyblack_internal_proposal_activation_pattern(self, activation_pattern);
                            set_cyblack_internal_proposal_knowledge_source(self, knowledge_source);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym187$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_internal_proposal_method;
        }
    }

    public static final SubLObject cyblack_internal_proposal_get_knowledge_source_method(SubLObject self) {
        {
            SubLObject knowledge_source = get_cyblack_internal_proposal_knowledge_source(self);
            return knowledge_source;
        }
    }

    public static final SubLObject cyblack_internal_proposal_set_knowledge_source_method(SubLObject self, SubLObject new_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_internal_proposal_method = NIL;
                SubLObject knowledge_source = get_cyblack_internal_proposal_knowledge_source(self);
                try {
                    try {
                        if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                            format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt193$___SET_KNOWLEDGE_SOURCE__S___sett, self, new_knowledge_source);
                        }
                        knowledge_source = new_knowledge_source;
                        sublisp_throw($sym192$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD, new_knowledge_source);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_internal_proposal_knowledge_source(self, knowledge_source);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_internal_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym192$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD);
                }
                return catch_var_for_cyblack_internal_proposal_method;
            }
        }
    }

    public static final SubLObject cyblack_internal_proposal_get_external_knowledge_source_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_internal_proposal_get_activation_pattern_method(SubLObject self) {
        {
            SubLObject activation_pattern = get_cyblack_internal_proposal_activation_pattern(self);
            return activation_pattern;
        }
    }

    public static final SubLObject cyblack_internal_proposal_set_activation_pattern_method(SubLObject self, SubLObject new_activation_pattern) {
        {
            SubLObject catch_var_for_cyblack_internal_proposal_method = NIL;
            SubLObject activation_pattern = get_cyblack_internal_proposal_activation_pattern(self);
            try {
                try {
                    activation_pattern = new_activation_pattern;
                    sublisp_throw($sym199$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD, new_activation_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_proposal_activation_pattern(self, activation_pattern);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym199$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_internal_proposal_method;
        }
    }

    public static final SubLObject cyblack_internal_proposal_get_reasons_method(SubLObject self) {
        {
            SubLObject reasons = get_cyblack_internal_proposal_reasons(self);
            return reasons;
        }
    }

    public static final SubLObject cyblack_internal_proposal_set_reasons_method(SubLObject self, SubLObject new_reasons) {
        {
            SubLObject catch_var_for_cyblack_internal_proposal_method = NIL;
            SubLObject reasons = get_cyblack_internal_proposal_reasons(self);
            try {
                try {
                    reasons = new_reasons;
                    sublisp_throw($sym204$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD, new_reasons);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_proposal_reasons(self, reasons);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym204$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_internal_proposal_method;
        }
    }

    public static final SubLObject cyblack_internal_proposal_get_timestamp_method(SubLObject self) {
        {
            SubLObject timestamp = get_cyblack_internal_proposal_timestamp(self);
            return timestamp;
        }
    }

    public static final SubLObject cyblack_internal_proposal_set_timestamp_method(SubLObject self, SubLObject universal_time) {
        {
            SubLObject catch_var_for_cyblack_internal_proposal_method = NIL;
            SubLObject timestamp = get_cyblack_internal_proposal_timestamp(self);
            try {
                try {
                    timestamp = universal_time;
                    sublisp_throw($sym209$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD, universal_time);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_internal_proposal_timestamp(self, timestamp);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_internal_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym209$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_internal_proposal_method;
        }
    }

    public static final class $external_proposal_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cyblack_proposal.$external_proposal_native.structDecl;
        }

        public SubLObject getField2() {
            return $cyblack_external_proposal;
        }

        public SubLObject getField3() {
            return $internals;
        }

        public SubLObject getField4() {
            return $knowledge_source;
        }

        public SubLObject getField5() {
            return $activation_pattern;
        }

        public SubLObject getField6() {
            return $reasons;
        }

        public SubLObject getField7() {
            return $timestamp;
        }

        public SubLObject getField8() {
            return $before_withdraw_function;
        }

        public SubLObject getField9() {
            return $before_validity_reconfirmed_function;
        }

        public SubLObject getField10() {
            return $before_generate_ksi_function;
        }

        public SubLObject setField2(SubLObject value) {
            return $cyblack_external_proposal = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $internals = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $knowledge_source = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $activation_pattern = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $reasons = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $timestamp = value;
        }

        public SubLObject setField8(SubLObject value) {
            return $before_withdraw_function = value;
        }

        public SubLObject setField9(SubLObject value) {
            return $before_validity_reconfirmed_function = value;
        }

        public SubLObject setField10(SubLObject value) {
            return $before_generate_ksi_function = value;
        }

        public SubLObject $cyblack_external_proposal = Lisp.NIL;

        public SubLObject $internals = Lisp.NIL;

        public SubLObject $knowledge_source = Lisp.NIL;

        public SubLObject $activation_pattern = Lisp.NIL;

        public SubLObject $reasons = Lisp.NIL;

        public SubLObject $timestamp = Lisp.NIL;

        public SubLObject $before_withdraw_function = Lisp.NIL;

        public SubLObject $before_validity_reconfirmed_function = Lisp.NIL;

        public SubLObject $before_generate_ksi_function = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cyblack_proposal.$external_proposal_native.class, EXTERNAL_PROPOSAL, EXTERNAL_PROPOSAL_P, $list_alt213, $list_alt214, new String[]{ "$cyblack_external_proposal", "$internals", "$knowledge_source", "$activation_pattern", "$reasons", "$timestamp", "$before_withdraw_function", "$before_validity_reconfirmed_function", "$before_generate_ksi_function" }, $list_alt215, $list_alt216, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_external_proposal$ = makeSymbol("*DTP-EXTERNAL-PROPOSAL*");

    public static final SubLObject external_proposal_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject external_proposal_p(SubLObject v_object) {
        return v_object.getJavaClass() ==cyblack_proposal.$external_proposal_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $external_proposal_p$UnaryFunction extends UnaryFunction {
        public $external_proposal_p$UnaryFunction() {
            super(extractFunctionNamed("EXTERNAL-PROPOSAL-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return external_proposal_p(arg1);
        }
    }

    public static final SubLObject exprop_cyblack_external_proposal(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.getField2();
    }

    public static final SubLObject exprop_internals(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.getField3();
    }

    public static final SubLObject exprop_knowledge_source(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.getField4();
    }

    public static final SubLObject exprop_activation_pattern(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.getField5();
    }

    public static final SubLObject exprop_reasons(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.getField6();
    }

    public static final SubLObject exprop_timestamp(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.getField7();
    }

    public static final SubLObject exprop_before_withdraw_function(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.getField8();
    }

    public static final SubLObject exprop_before_validity_reconfirmed_function(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.getField9();
    }

    public static final SubLObject exprop_before_generate_ksi_function(SubLObject v_object) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.getField10();
    }

    public static final SubLObject _csetf_exprop_cyblack_external_proposal(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_exprop_internals(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_exprop_knowledge_source(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_exprop_activation_pattern(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_exprop_reasons(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_exprop_timestamp(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_exprop_before_withdraw_function(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_exprop_before_validity_reconfirmed_function(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_exprop_before_generate_ksi_function(SubLObject v_object, SubLObject value) {
        SubLSystemTrampolineFile.checkType(v_object, EXTERNAL_PROPOSAL_P);
        return v_object.setField10(value);
    }

    public static final SubLObject make_external_proposal(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cyblack_proposal.$external_proposal_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYBLACK_EXTERNAL_PROPOSAL)) {
                        _csetf_exprop_cyblack_external_proposal(v_new, current_value);
                    } else
                        if (pcase_var.eql($INTERNALS)) {
                            _csetf_exprop_internals(v_new, current_value);
                        } else
                            if (pcase_var.eql($KNOWLEDGE_SOURCE)) {
                                _csetf_exprop_knowledge_source(v_new, current_value);
                            } else
                                if (pcase_var.eql($ACTIVATION_PATTERN)) {
                                    _csetf_exprop_activation_pattern(v_new, current_value);
                                } else
                                    if (pcase_var.eql($REASONS)) {
                                        _csetf_exprop_reasons(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($TIMESTAMP)) {
                                            _csetf_exprop_timestamp(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($BEFORE_WITHDRAW_FUNCTION)) {
                                                _csetf_exprop_before_withdraw_function(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($BEFORE_VALIDITY_RECONFIRMED_FUNCTION)) {
                                                    _csetf_exprop_before_validity_reconfirmed_function(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($BEFORE_GENERATE_KSI_FUNCTION)) {
                                                        _csetf_exprop_before_generate_ksi_function(v_new, current_value);
                                                    } else {
                                                        Errors.error($str_alt246$Invalid_slot__S_for_construction_, current_arg);
                                                    }








                }
            }
            return v_new;
        }
    }

    public static final SubLObject with_exprop_read_only(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject exprop = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt247);
            exprop = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject exprop_var = make_symbol($$$exprop);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(exprop_var, exprop, EXPROP_, $list_alt213, forms, UNPROVIDED);
            }
        }
    }

    public static final SubLObject with_exprop_read_write(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject exprop = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt247);
            exprop = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject exprop_var = make_symbol($$$exprop);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(exprop_var, exprop, EXPROP_, $list_alt213, forms, NIL);
            }
        }
    }

    public static final SubLObject with_locked_exprop(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject exprop = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt247);
            exprop = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject exprop_var = make_symbol($$$exprop);
                SubLObject cexprop_var = make_symbol($$$cexprop);
                return list(CLET, list(list(exprop_var, exprop), list(cexprop_var, list(EXPROP_CYBLACK_EXTERNAL_PROPOSAL, exprop_var))), listS(WITH_CYBLACK_BASIC_LOCKABLE, list(cexprop_var, exprop_var), forms));
            }
        }
    }

    public static final SubLObject with_locked_exprop_read_only(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject exprop = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt247);
            exprop = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject exprop_var = make_symbol($$$exprop);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(exprop_var, exprop, EXPROP_, $list_alt213, listS(WITH_CYBLACK_BASIC_LOCKABLE, list(CYBLACK_EXTERNAL_PROPOSAL, exprop_var), forms), UNPROVIDED);
            }
        }
    }

    public static final SubLObject with_locked_exprop_read_write(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject exprop = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt247);
            exprop = current.first();
            current = current.rest();
            {
                SubLObject forms = current;
                SubLObject exprop_var = make_symbol($$$exprop);
                return utilities_macros.generate_instance_variable_bindings_for_structure_slots(exprop_var, exprop, EXPROP_, $list_alt213, listS(WITH_CYBLACK_BASIC_LOCKABLE, list(CYBLACK_EXTERNAL_PROPOSAL, exprop_var), forms), NIL);
            }
        }
    }

    public static final SubLObject get_cyblack_external_proposal_ksi_class(SubLObject cyblack_external_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_proposal, THIRTEEN_INTEGER, KSI_CLASS);
    }

    public static final SubLObject set_cyblack_external_proposal_ksi_class(SubLObject cyblack_external_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_proposal, value, THIRTEEN_INTEGER, KSI_CLASS);
    }

    public static final SubLObject get_cyblack_external_proposal_cached_ksi_class(SubLObject cyblack_external_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_proposal, TWELVE_INTEGER, CACHED_KSI_CLASS);
    }

    public static final SubLObject set_cyblack_external_proposal_cached_ksi_class(SubLObject cyblack_external_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_proposal, value, TWELVE_INTEGER, CACHED_KSI_CLASS);
    }

    public static final SubLObject get_cyblack_external_proposal_external_proposal(SubLObject cyblack_external_proposal) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_external_proposal, ELEVEN_INTEGER, EXTERNAL_PROPOSAL);
    }

    public static final SubLObject set_cyblack_external_proposal_external_proposal(SubLObject cyblack_external_proposal, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_external_proposal, value, ELEVEN_INTEGER, EXTERNAL_PROPOSAL);
    }

    public static final SubLObject get_cyblack_external_proposal_already_reconfirmed(SubLObject cyblack_external_proposal) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_external_proposal);
            SubLObject slot = slots.slot_assoc(ALREADY_RECONFIRMED, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_external_proposal, slot);
        }
        return classes.ldb_test($int$4098, subloop_structures.instance_boolean_slots(cyblack_external_proposal));
    }

    public static final SubLObject set_cyblack_external_proposal_already_reconfirmed(SubLObject cyblack_external_proposal, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_external_proposal);
            SubLObject slot = slots.slot_assoc(ALREADY_RECONFIRMED, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_external_proposal, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_external_proposal, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4098, subloop_structures.instance_boolean_slots(cyblack_external_proposal)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_proposal_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_external_proposal_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_PROPOSAL, ALREADY_RECONFIRMED, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_CONTRIBUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, PROPOSED_REMOVALS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, EXECUTION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, VERIFIED, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PROPOSAL, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_PROPOSAL, EXTERNAL_PROPOSAL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_PROPOSAL, CACHED_KSI_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_EXTERNAL_PROPOSAL, KSI_CLASS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_external_proposal_p(SubLObject cyblack_external_proposal) {
        return classes.subloop_instanceof_class(cyblack_external_proposal, CYBLACK_EXTERNAL_PROPOSAL);
    }

    public static final SubLObject cyblack_external_proposal_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_proposal_method = NIL;
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            SubLObject execution_mode = get_cyblack_basic_proposal_execution_mode(self);
            SubLObject already_reconfirmed = get_cyblack_external_proposal_already_reconfirmed(self);
            try {
                try {
                    cyblack_basic_proposal_initialize_method(self);
                    external_proposal = make_external_proposal(UNPROVIDED);
                    already_reconfirmed = NIL;
                    execution_mode = $ASYNCHRONOUS;
                    {
                        SubLObject exprop = external_proposal;
                        SubLObject cyblack_external_proposal = exprop_cyblack_external_proposal(exprop);
                        SubLObject internals = exprop_internals(exprop);
                        SubLObject knowledge_source = exprop_knowledge_source(exprop);
                        SubLObject activation_pattern = exprop_activation_pattern(exprop);
                        SubLObject reasons = exprop_reasons(exprop);
                        SubLObject timestamp = exprop_timestamp(exprop);
                        SubLObject before_withdraw_function = exprop_before_withdraw_function(exprop);
                        SubLObject before_validity_reconfirmed_function = exprop_before_validity_reconfirmed_function(exprop);
                        SubLObject before_generate_ksi_function = exprop_before_generate_ksi_function(exprop);
                        try {
                            cyblack_external_proposal = self;
                            internals = NIL;
                            knowledge_source = NIL;
                            activation_pattern = NIL;
                            reasons = NIL;
                            timestamp = NIL;
                            before_withdraw_function = NIL;
                            before_validity_reconfirmed_function = NIL;
                            before_generate_ksi_function = NIL;
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    _csetf_exprop_cyblack_external_proposal(exprop, cyblack_external_proposal);
                                    _csetf_exprop_internals(exprop, internals);
                                    _csetf_exprop_knowledge_source(exprop, knowledge_source);
                                    _csetf_exprop_activation_pattern(exprop, activation_pattern);
                                    _csetf_exprop_reasons(exprop, reasons);
                                    _csetf_exprop_timestamp(exprop, timestamp);
                                    _csetf_exprop_before_withdraw_function(exprop, before_withdraw_function);
                                    _csetf_exprop_before_validity_reconfirmed_function(exprop, before_validity_reconfirmed_function);
                                    _csetf_exprop_before_generate_ksi_function(exprop, before_generate_ksi_function);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                    sublisp_throw($sym262$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_proposal_external_proposal(self, external_proposal);
                            set_cyblack_basic_proposal_execution_mode(self, execution_mode);
                            set_cyblack_external_proposal_already_reconfirmed(self, already_reconfirmed);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym262$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_external_proposal_method;
        }
    }

    public static final SubLObject cyblack_external_proposal_get_external_proposal_method(SubLObject self) {
        {
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            return external_proposal;
        }
    }

    public static final SubLObject cyblack_external_proposal_set_external_proposal_method(SubLObject self, SubLObject new_external_proposal) {
        {
            SubLObject catch_var_for_cyblack_external_proposal_method = NIL;
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            try {
                try {
                    external_proposal = new_external_proposal;
                    sublisp_throw($sym271$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, new_external_proposal);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_proposal_external_proposal(self, external_proposal);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym271$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_external_proposal_method;
        }
    }

    public static final SubLObject cyblack_external_proposal_get_knowledge_source_method(SubLObject self) {
        {
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            if (NIL != external_proposal) {
                {
                    SubLObject exprop = external_proposal;
                    SubLObject knowledge_source = exprop_knowledge_source(exprop);
                    return knowledge_source;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_external_proposal_set_knowledge_source_method(SubLObject self, SubLObject new_knowledge_source) {
        {
            SubLObject catch_var_for_cyblack_external_proposal_method = NIL;
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            try {
                try {
                    {
                        SubLObject exprop = external_proposal;
                        SubLObject knowledge_source = exprop_knowledge_source(exprop);
                        try {
                            knowledge_source = new_knowledge_source;
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    _csetf_exprop_knowledge_source(exprop, knowledge_source);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        sublisp_throw($sym276$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, new_knowledge_source);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_proposal_external_proposal(self, external_proposal);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym276$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_external_proposal_method;
        }
    }

    public static final SubLObject cyblack_external_proposal_get_external_knowledge_source_method(SubLObject self) {
        {
            SubLObject associated_knowledge_source = cyblack_external_proposal_get_knowledge_source_method(self);
            if ((NIL != associated_knowledge_source) && (NIL != cyblack_ks.cyblack_external_knowledge_source_p(associated_knowledge_source))) {
                return cyblack_ks.cyblack_external_knowledge_source_get_external_knowledge_source_method(associated_knowledge_source);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_external_proposal_get_activation_pattern_method(SubLObject self) {
        {
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            if (NIL != external_proposal) {
                {
                    SubLObject exprop = external_proposal;
                    SubLObject activation_pattern = exprop_activation_pattern(exprop);
                    return activation_pattern;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_external_proposal_set_activation_pattern_method(SubLObject self, SubLObject new_activation_pattern) {
        {
            SubLObject catch_var_for_cyblack_external_proposal_method = NIL;
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            try {
                try {
                    {
                        SubLObject exprop = external_proposal;
                        SubLObject activation_pattern = exprop_activation_pattern(exprop);
                        try {
                            activation_pattern = new_activation_pattern;
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    _csetf_exprop_activation_pattern(exprop, activation_pattern);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        sublisp_throw($sym283$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, new_activation_pattern);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_proposal_external_proposal(self, external_proposal);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym283$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_external_proposal_method;
        }
    }

    public static final SubLObject cyblack_external_proposal_get_reasons_method(SubLObject self) {
        {
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            if (NIL != external_proposal) {
                {
                    SubLObject exprop = external_proposal;
                    SubLObject reasons = exprop_reasons(exprop);
                    return reasons;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_external_proposal_set_reasons_method(SubLObject self, SubLObject new_reasons) {
        {
            SubLObject catch_var_for_cyblack_external_proposal_method = NIL;
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            try {
                try {
                    {
                        SubLObject exprop = external_proposal;
                        SubLObject reasons = exprop_reasons(exprop);
                        try {
                            reasons = new_reasons;
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    _csetf_exprop_reasons(exprop, reasons);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        sublisp_throw($sym288$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, new_reasons);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_proposal_external_proposal(self, external_proposal);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym288$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_external_proposal_method;
        }
    }

    public static final SubLObject cyblack_external_proposal_get_timestamp_method(SubLObject self) {
        {
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            if (NIL != external_proposal) {
                {
                    SubLObject exprop = external_proposal;
                    SubLObject timestamp = exprop_timestamp(exprop);
                    return timestamp;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_external_proposal_set_timestamp_method(SubLObject self, SubLObject universal_time) {
        {
            SubLObject catch_var_for_cyblack_external_proposal_method = NIL;
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            try {
                try {
                    {
                        SubLObject exprop = external_proposal;
                        SubLObject timestamp = exprop_timestamp(exprop);
                        try {
                            timestamp = universal_time;
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    _csetf_exprop_timestamp(exprop, timestamp);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        sublisp_throw($sym293$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, universal_time);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_proposal_external_proposal(self, external_proposal);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym293$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_external_proposal_method;
        }
    }

    public static final SubLObject cyblack_external_proposal_validity_reconfirmed_p_method(SubLObject self) {
        {
            SubLObject already_reconfirmed = get_cyblack_external_proposal_already_reconfirmed(self);
            return already_reconfirmed;
        }
    }

    public static final SubLObject cyblack_external_proposal_withdraw_method(SubLObject self) {
        {
            SubLObject external_proposal = get_cyblack_external_proposal_external_proposal(self);
            SubLObject exprop = external_proposal;
            SubLObject before_withdraw_function = exprop_before_withdraw_function(exprop);
            if (NIL != before_withdraw_function) {
                funcall(before_withdraw_function, external_proposal);
            }
            return cyblack_basic_proposal_withdraw_method(self);
        }
    }

    public static final SubLObject cyblack_external_proposal_generate_ksi_method(SubLObject self, SubLObject dispatch) {
        if (dispatch == UNPROVIDED) {
            dispatch = T;
        }
        {
            SubLObject ksi = cyblack_basic_proposal_generate_ksi_method(self);
            if (NIL != dispatch) {
                cyblack_external_proposal_dispatch_ksi_method(self, ksi);
            }
            return ksi;
        }
    }

    public static final SubLObject cyblack_external_proposal_dispatch_ksi_method(SubLObject self, SubLObject ksi) {
        if (NIL != ksi) {
            {
                SubLObject exectutable_ksi_queue = cyblack_external_proposal_get_executable_ksi_queue_method(self);
                if (NIL != exectutable_ksi_queue) {
                    subloop_queues.basic_doubly_linked_queue_enqueue_method(exectutable_ksi_queue, ksi);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_external_proposal_already_reconfirmed_p_method(SubLObject self) {
        {
            SubLObject already_reconfirmed = get_cyblack_external_proposal_already_reconfirmed(self);
            return already_reconfirmed;
        }
    }

    public static final SubLObject cyblack_external_proposal_confirm_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_proposal_method = NIL;
            SubLObject already_reconfirmed = get_cyblack_external_proposal_already_reconfirmed(self);
            try {
                try {
                    already_reconfirmed = T;
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_proposal_already_reconfirmed(self, already_reconfirmed);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym311$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_external_proposal_method;
        }
    }

    public static final SubLObject cyblack_external_proposal_get_ksi_class_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_external_proposal_method = NIL;
            SubLObject ksi_class = get_cyblack_external_proposal_ksi_class(self);
            SubLObject cached_ksi_class = get_cyblack_external_proposal_cached_ksi_class(self);
            try {
                try {
                    if (NIL != cached_ksi_class) {
                        sublisp_throw($sym315$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, cached_ksi_class);
                    }
                    if (NIL != ksi_class) {
                        cached_ksi_class = classes.classes_retrieve_class(ksi_class);
                        sublisp_throw($sym315$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, cached_ksi_class);
                    }
                    sublisp_throw($sym315$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_proposal_ksi_class(self, ksi_class);
                            set_cyblack_external_proposal_cached_ksi_class(self, cached_ksi_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym315$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_external_proposal_method;
        }
    }

    public static final SubLObject cyblack_external_proposal_set_ksi_class_method(SubLObject self, SubLObject new_class) {
        {
            SubLObject catch_var_for_cyblack_external_proposal_method = NIL;
            SubLObject ksi_class = get_cyblack_external_proposal_ksi_class(self);
            SubLObject cached_ksi_class = get_cyblack_external_proposal_cached_ksi_class(self);
            try {
                try {
                    if (NIL == new_class) {
                        cached_ksi_class = NIL;
                        ksi_class = NIL;
                    }
                    if (new_class.isSymbol()) {
                        cached_ksi_class = NIL;
                        ksi_class = new_class;
                    }
                    if (NIL != subloop_structures.class_p(new_class)) {
                        cached_ksi_class = new_class;
                        ksi_class = subloop_structures.class_name(new_class);
                    }
                    sublisp_throw($sym320$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, new_class);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_external_proposal_ksi_class(self, ksi_class);
                            set_cyblack_external_proposal_cached_ksi_class(self, cached_ksi_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym320$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_external_proposal_method;
        }
    }

    public static final SubLObject cyblack_external_proposal_new_ksi_method(SubLObject self) {
        {
            SubLObject v_class = cyblack_external_proposal_get_ksi_class_method(self);
            if (NIL != v_class) {
                return object.new_object_instance(v_class);
            }
            return object.new_object_instance(CYBLACK_EXTERNAL_KSI);
        }
    }

    public static final SubLObject cyblack_external_proposal_get_suspended_proposal_list_method(SubLObject self) {
        {
            SubLObject v_agenda = get_cyblack_basic_proposal_agenda(self);
            return cyblack_agenda.cyblack_agenda_get_suspended_proposals(v_agenda);
        }
    }

    public static final SubLObject cyblack_external_proposal_get_active_proposals_queue_method(SubLObject self) {
        {
            SubLObject v_agenda = get_cyblack_basic_proposal_agenda(self);
            return cyblack_agenda.cyblack_agenda_get_active_proposals(v_agenda);
        }
    }

    public static final SubLObject cyblack_external_proposal_get_executable_ksi_queue_method(SubLObject self) {
        {
            SubLObject v_agenda = get_cyblack_basic_proposal_agenda(self);
            return cyblack_agenda.cyblack_agenda_get_executable_ksi_queue(v_agenda);
        }
    }

    public static final SubLObject cyblack_external_proposal_on_add_method(SubLObject self, SubLObject parent_list) {
        {
            SubLObject catch_var_for_cyblack_external_proposal_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject suspended_proposal_list = cyblack_external_proposal_get_suspended_proposal_list_method(self);
                        if (NIL == suspended_proposal_list) {
                            Errors.warn($str_alt337$_ON_ADD__S___No_suspended_proposa, self);
                        }
                        if (suspended_proposal_list == parent_list) {
                            if (NIL != application) {
                                {
                                    SubLObject message_broker = cyblack_application.cyblack_application_get_message_broker(application);
                                    if (NIL != message_broker) {
                                        cyblack_message_broker.cyblack_message_broker_verify_method(message_broker, self, cyblack_external_proposal_get_activation_pattern_method(self));
                                    } else {
                                        Errors.warn($str_alt338$_ON_ADD__S___Could_not_find_the_m, self);
                                    }
                                }
                            } else {
                                Errors.warn($str_alt339$_ON_ADD__S___Could_not_find_the_a, self);
                            }
                        }
                        sublisp_throw($sym336$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, NIL);
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
                catch_var_for_cyblack_external_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym336$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_external_proposal_method;
        }
    }

    public static final SubLObject cyblack_external_proposal_transfer_self_from_suspended_to_activated_method(SubLObject self) {
        {
            SubLObject suspended_proposal_list = cyblack_external_proposal_get_suspended_proposal_list_method(self);
            SubLObject active_proposals_queue = cyblack_external_proposal_get_active_proposals_queue_method(self);
            if (NIL != suspended_proposal_list) {
                cyblack_basic_proposal_delete_self_from_collection_method(self, suspended_proposal_list);
            }
            if (NIL != active_proposals_queue) {
                subloop_queues.basic_doubly_linked_queue_enqueue_method(active_proposals_queue, self);
            }
            return T;
        }
    }

    public static final SubLObject cyblack_external_proposal_get_proposed_contributions_method(SubLObject self) {
        {
            SubLObject proposed_contributions = get_cyblack_basic_proposal_proposed_contributions(self);
            return proposed_contributions;
        }
    }

    public static final SubLObject cyblack_external_proposal_set_proposed_contributions_method(SubLObject self, SubLObject new_contributions) {
        {
            SubLObject catch_var_for_cyblack_external_proposal_method = NIL;
            SubLObject proposed_contributions = get_cyblack_basic_proposal_proposed_contributions(self);
            try {
                try {
                    proposed_contributions = new_contributions;
                    sublisp_throw($sym347$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD, new_contributions);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_proposal_proposed_contributions(self, proposed_contributions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_external_proposal_method = Errors.handleThrowable(ccatch_env_var, $sym347$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD);
            }
            return catch_var_for_cyblack_external_proposal_method;
        }
    }

    public static final SubLObject exprop_get_knowledge_source(SubLObject exprop) {
        return exprop_knowledge_source(exprop);
    }

    public static final SubLObject exprop_set_knowledge_source(SubLObject exprop, SubLObject new_knowledge_source) {
        _csetf_exprop_knowledge_source(exprop, new_knowledge_source);
        return new_knowledge_source;
    }

    public static final SubLObject exprop_get_activation_pattern(SubLObject exprop) {
        return exprop_activation_pattern(exprop);
    }

    public static final SubLObject exprop_set_activation_pattern(SubLObject exprop, SubLObject new_activation_pattern) {
        _csetf_exprop_activation_pattern(exprop, new_activation_pattern);
        return new_activation_pattern;
    }

    public static final SubLObject exprop_get_agenda(SubLObject exprop) {
        {
            SubLObject exprop_1 = exprop;
            SubLObject cyblack_external_proposal = exprop_cyblack_external_proposal(exprop_1);
            return cyblack_basic_proposal_get_agenda_method(cyblack_external_proposal);
        }
    }

    public static final SubLObject exprop_get_reasons(SubLObject exprop) {
        return exprop_reasons(exprop);
    }

    public static final SubLObject exprop_set_reasons(SubLObject exprop, SubLObject new_reasons) {
        _csetf_exprop_reasons(exprop, new_reasons);
        return new_reasons;
    }

    public static final SubLObject exprop_validity_reconfirmed_p(SubLObject exprop) {
        {
            SubLObject exprop_2 = exprop;
            SubLObject cyblack_external_proposal = exprop_cyblack_external_proposal(exprop_2);
            return cyblack_external_proposal_validity_reconfirmed_p_method(cyblack_external_proposal);
        }
    }

    public static final SubLObject exprop_withdraw(SubLObject exprop) {
        {
            SubLObject exprop_3 = exprop;
            SubLObject cyblack_external_proposal = exprop_cyblack_external_proposal(exprop_3);
            return cyblack_external_proposal_withdraw_method(cyblack_external_proposal);
        }
    }

    public static final SubLObject exprop_get_timestamp(SubLObject exprop) {
        return exprop_timestamp(exprop);
    }

    public static final SubLObject exprop_set_timestamp(SubLObject exprop, SubLObject universal_time) {
        _csetf_exprop_timestamp(exprop, universal_time);
        return universal_time;
    }

    public static final SubLObject exprop_generate_ksi(SubLObject exprop) {
        {
            SubLObject exprop_4 = exprop;
            SubLObject cyblack_external_proposal = exprop_cyblack_external_proposal(exprop_4);
            return cyblack_external_proposal_generate_ksi_method(cyblack_external_proposal, UNPROVIDED);
        }
    }

    public static final SubLObject new_external_proposal(SubLObject internals, SubLObject knowledge_source, SubLObject activation_pattern, SubLObject reasons, SubLObject timestamp, SubLObject before_withdraw_function, SubLObject before_validity_reconfirmed_function, SubLObject before_generate_ksi_function) {
        if (internals == UNPROVIDED) {
            internals = NIL;
        }
        if (knowledge_source == UNPROVIDED) {
            knowledge_source = NIL;
        }
        if (activation_pattern == UNPROVIDED) {
            activation_pattern = NIL;
        }
        if (reasons == UNPROVIDED) {
            reasons = NIL;
        }
        if (timestamp == UNPROVIDED) {
            timestamp = NIL;
        }
        if (before_withdraw_function == UNPROVIDED) {
            before_withdraw_function = NIL;
        }
        if (before_validity_reconfirmed_function == UNPROVIDED) {
            before_validity_reconfirmed_function = NIL;
        }
        if (before_generate_ksi_function == UNPROVIDED) {
            before_generate_ksi_function = NIL;
        }
        {
            SubLObject external_proposal = make_external_proposal(UNPROVIDED);
            SubLObject cyblack_external_proposal = object.object_new_method(CYBLACK_EXTERNAL_PROPOSAL);
            _csetf_exprop_cyblack_external_proposal(external_proposal, cyblack_external_proposal);
            _csetf_exprop_internals(external_proposal, internals);
            cyblack_external_proposal_set_external_proposal_method(cyblack_external_proposal, external_proposal);
            exprop_set_knowledge_source(external_proposal, knowledge_source);
            exprop_set_activation_pattern(external_proposal, activation_pattern);
            exprop_set_reasons(external_proposal, reasons);
            exprop_set_timestamp(external_proposal, timestamp);
            _csetf_exprop_before_withdraw_function(external_proposal, before_withdraw_function);
            _csetf_exprop_before_validity_reconfirmed_function(external_proposal, before_validity_reconfirmed_function);
            _csetf_exprop_before_generate_ksi_function(external_proposal, before_generate_ksi_function);
            return external_proposal;
        }
    }

    public static final SubLObject cyblack_proposal_set_activation_pattern(SubLObject v_cyblack_proposal, SubLObject new_activation_pattern) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal_p(v_cyblack_proposal)) {
                    Errors.error($str_alt349$CYBLACK_PROPOSAL_SET_ACTIVATION_P, v_cyblack_proposal);
                }
            }
            if (NIL != cyblack_internal_proposal_p(v_cyblack_proposal)) {
                return cyblack_internal_proposal_set_activation_pattern_method(v_cyblack_proposal, new_activation_pattern);
            } else
                if (NIL != cyblack_external_proposal_p(v_cyblack_proposal)) {
                    return cyblack_external_proposal_set_activation_pattern_method(v_cyblack_proposal, new_activation_pattern);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_proposal, SET_ACTIVATION_PATTERN, new_activation_pattern);
                }

        }
    }

    public static final SubLObject cyblack_proposal_set_reasons(SubLObject v_cyblack_proposal, SubLObject new_reasons) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal_p(v_cyblack_proposal)) {
                    Errors.error($str_alt350$CYBLACK_PROPOSAL_SET_REASONS___S_, v_cyblack_proposal);
                }
            }
            if (NIL != cyblack_internal_proposal_p(v_cyblack_proposal)) {
                return cyblack_internal_proposal_set_reasons_method(v_cyblack_proposal, new_reasons);
            } else
                if (NIL != cyblack_external_proposal_p(v_cyblack_proposal)) {
                    return cyblack_external_proposal_set_reasons_method(v_cyblack_proposal, new_reasons);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_proposal, SET_REASONS, new_reasons);
                }

        }
    }

    public static final SubLObject cyblack_proposal_set_agenda(SubLObject v_cyblack_proposal, SubLObject new_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal_p(v_cyblack_proposal)) {
                    Errors.error($str_alt351$CYBLACK_PROPOSAL_SET_AGENDA___S_i, v_cyblack_proposal);
                }
            }
            if (NIL != cyblack_internal_proposal_p(v_cyblack_proposal)) {
                return cyblack_basic_proposal_set_agenda_method(v_cyblack_proposal, new_agenda);
            } else
                if (NIL != cyblack_external_proposal_p(v_cyblack_proposal)) {
                    return cyblack_basic_proposal_set_agenda_method(v_cyblack_proposal, new_agenda);
                } else {
                    return methods.funcall_instance_method_with_1_args(v_cyblack_proposal, SET_AGENDA, new_agenda);
                }

        }
    }

    public static final SubLObject cyblack_proposal_set_application(SubLObject v_cyblack_proposal, SubLObject new_agenda) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal_p(v_cyblack_proposal)) {
                    Errors.error($str_alt352$CYBLACK_PROPOSAL_SET_APPLICATION_, v_cyblack_proposal);
                }
            }
            if (NIL != cyblack_internal_proposal_p(v_cyblack_proposal)) {
                return cyblack_object.cyblack_object_set_application_method(v_cyblack_proposal, new_agenda);
            } else
                if (NIL != cyblack_external_proposal_p(v_cyblack_proposal)) {
                    return cyblack_object.cyblack_object_set_application_method(v_cyblack_proposal, new_agenda);
                } else
                    if (NIL != cyblack_basic_proposal_p(v_cyblack_proposal)) {
                        return cyblack_object.cyblack_object_set_application_method(v_cyblack_proposal, new_agenda);
                    } else {
                        return methods.funcall_instance_method_with_1_args(v_cyblack_proposal, SET_APPLICATION, new_agenda);
                    }


        }
    }

    public static final SubLObject cyblack_proposal_get_execution_mode(SubLObject v_cyblack_proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal_p(v_cyblack_proposal)) {
                    Errors.error($str_alt354$CYBLACK_PROPOSAL_GET_EXECUTION_MO, v_cyblack_proposal);
                }
            }
            if (NIL != cyblack_internal_proposal_p(v_cyblack_proposal)) {
                return cyblack_basic_proposal_get_execution_mode_method(v_cyblack_proposal);
            } else
                if (NIL != cyblack_external_proposal_p(v_cyblack_proposal)) {
                    return cyblack_basic_proposal_get_execution_mode_method(v_cyblack_proposal);
                } else
                    if (NIL != cyblack_basic_proposal_p(v_cyblack_proposal)) {
                        return cyblack_basic_proposal_get_execution_mode_method(v_cyblack_proposal);
                    } else {
                        return methods.funcall_instance_method_with_0_args(v_cyblack_proposal, GET_EXECUTION_MODE);
                    }


        }
    }

    public static final SubLObject cyblack_proposal_set_knowledge_source(SubLObject v_cyblack_proposal, SubLObject new_knowledge_source) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_proposal_p(v_cyblack_proposal)) {
                    Errors.error($str_alt355$CYBLACK_PROPOSAL_SET_KNOWLEDGE_SO, v_cyblack_proposal);
                }
            }
            if (NIL != cyblack_internal_proposal_p(v_cyblack_proposal)) {
                return cyblack_internal_proposal_set_knowledge_source_method(v_cyblack_proposal, new_knowledge_source);
            } else
                if (NIL != cyblack_external_proposal_p(v_cyblack_proposal)) {
                    return cyblack_external_proposal_set_knowledge_source_method(v_cyblack_proposal, new_knowledge_source);
                } else
                    if (NIL != cyblack_basic_proposal_p(v_cyblack_proposal)) {
                        return cyblack_basic_proposal_set_knowledge_source_method(v_cyblack_proposal, new_knowledge_source);
                    } else {
                        return methods.funcall_instance_method_with_1_args(v_cyblack_proposal, SET_KNOWLEDGE_SOURCE, new_knowledge_source);
                    }


        }
    }

    public static final SubLObject declare_cyblack_proposal_file() {
        declareFunction("cyblack_proposal_p", "CYBLACK-PROPOSAL-P", 1, 0, false);
        declareFunction("get_cyblack_basic_proposal_qua_list_element_parent_links", "GET-CYBLACK-BASIC-PROPOSAL-QUA-LIST-ELEMENT-PARENT-LINKS", 1, 0, false);
        declareFunction("set_cyblack_basic_proposal_qua_list_element_parent_links", "SET-CYBLACK-BASIC-PROPOSAL-QUA-LIST-ELEMENT-PARENT-LINKS", 2, 0, false);
        declareFunction("get_cyblack_basic_proposal_verified", "GET-CYBLACK-BASIC-PROPOSAL-VERIFIED", 1, 0, false);
        declareFunction("set_cyblack_basic_proposal_verified", "SET-CYBLACK-BASIC-PROPOSAL-VERIFIED", 2, 0, false);
        declareFunction("get_cyblack_basic_proposal_execution_mode", "GET-CYBLACK-BASIC-PROPOSAL-EXECUTION-MODE", 1, 0, false);
        declareFunction("set_cyblack_basic_proposal_execution_mode", "SET-CYBLACK-BASIC-PROPOSAL-EXECUTION-MODE", 2, 0, false);
        declareFunction("get_cyblack_basic_proposal_proposed_removals", "GET-CYBLACK-BASIC-PROPOSAL-PROPOSED-REMOVALS", 1, 0, false);
        declareFunction("set_cyblack_basic_proposal_proposed_removals", "SET-CYBLACK-BASIC-PROPOSAL-PROPOSED-REMOVALS", 2, 0, false);
        declareFunction("get_cyblack_basic_proposal_proposed_contributions", "GET-CYBLACK-BASIC-PROPOSAL-PROPOSED-CONTRIBUTIONS", 1, 0, false);
        declareFunction("set_cyblack_basic_proposal_proposed_contributions", "SET-CYBLACK-BASIC-PROPOSAL-PROPOSED-CONTRIBUTIONS", 2, 0, false);
        declareFunction("get_cyblack_basic_proposal_agenda", "GET-CYBLACK-BASIC-PROPOSAL-AGENDA", 1, 0, false);
        declareFunction("set_cyblack_basic_proposal_agenda", "SET-CYBLACK-BASIC-PROPOSAL-AGENDA", 2, 0, false);
        declareFunction("get_cyblack_basic_proposal_qua_list_element_self_deletion_mode", "GET-CYBLACK-BASIC-PROPOSAL-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 1, 0, false);
        declareFunction("set_cyblack_basic_proposal_qua_list_element_self_deletion_mode", "SET-CYBLACK-BASIC-PROPOSAL-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 2, 0, false);
        declareFunction("cyblack_basic_proposal_perform_action_method", "CYBLACK-BASIC-PROPOSAL-PERFORM-ACTION-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_proposal_on_delete_method", "CYBLACK-BASIC-PROPOSAL-ON-DELETE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_on_add_method", "CYBLACK-BASIC-PROPOSAL-ON-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_get_collections_method", "CYBLACK-BASIC-PROPOSAL-GET-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_member_p_method", "CYBLACK-BASIC-PROPOSAL-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_delete_self_from_all_collections_method", "CYBLACK-BASIC-PROPOSAL-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_delete_self_from_collection_method", "CYBLACK-BASIC-PROPOSAL-DELETE-SELF-FROM-COLLECTION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_delete_parent_link_method", "CYBLACK-BASIC-PROPOSAL-DELETE-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_add_parent_link_method", "CYBLACK-BASIC-PROPOSAL-ADD-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_proposal_p", "CYBLACK-BASIC-PROPOSAL-P", 1, 0, false);
        declareFunction("cyblack_basic_proposal_initialize_method", "CYBLACK-BASIC-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_get_knowledge_source_method", "CYBLACK-BASIC-PROPOSAL-GET-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_set_knowledge_source_method", "CYBLACK-BASIC-PROPOSAL-SET-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_get_external_knowledge_source_method", "CYBLACK-BASIC-PROPOSAL-GET-EXTERNAL-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_get_activation_pattern_method", "CYBLACK-BASIC-PROPOSAL-GET-ACTIVATION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_set_activation_pattern_method", "CYBLACK-BASIC-PROPOSAL-SET-ACTIVATION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_get_agenda_method", "CYBLACK-BASIC-PROPOSAL-GET-AGENDA-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_set_agenda_method", "CYBLACK-BASIC-PROPOSAL-SET-AGENDA-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_get_reasons_method", "CYBLACK-BASIC-PROPOSAL-GET-REASONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_set_reasons_method", "CYBLACK-BASIC-PROPOSAL-SET-REASONS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_validity_reconfirmed_p_method", "CYBLACK-BASIC-PROPOSAL-VALIDITY-RECONFIRMED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_withdraw_method", "CYBLACK-BASIC-PROPOSAL-WITHDRAW-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_get_timestamp_method", "CYBLACK-BASIC-PROPOSAL-GET-TIMESTAMP-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_set_timestamp_method", "CYBLACK-BASIC-PROPOSAL-SET-TIMESTAMP-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_get_execution_mode_method", "CYBLACK-BASIC-PROPOSAL-GET-EXECUTION-MODE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_set_execution_mode_method", "CYBLACK-BASIC-PROPOSAL-SET-EXECUTION-MODE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_generate_ksi_method", "CYBLACK-BASIC-PROPOSAL-GENERATE-KSI-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_get_proposed_contributions_method", "CYBLACK-BASIC-PROPOSAL-GET-PROPOSED-CONTRIBUTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_set_proposed_contributions_method", "CYBLACK-BASIC-PROPOSAL-SET-PROPOSED-CONTRIBUTIONS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_get_proposed_removals_method", "CYBLACK-BASIC-PROPOSAL-GET-PROPOSED-REMOVALS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_set_proposed_removals_method", "CYBLACK-BASIC-PROPOSAL-SET-PROPOSED-REMOVALS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_create_datatype_bag_method", "CYBLACK-BASIC-PROPOSAL-CREATE-DATATYPE-BAG-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_verified_p_method", "CYBLACK-BASIC-PROPOSAL-VERIFIED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_set_verified_method", "CYBLACK-BASIC-PROPOSAL-SET-VERIFIED-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_initialize_qua_list_element_template_method", "CYBLACK-BASIC-PROPOSAL-INITIALIZE-QUA-LIST-ELEMENT-TEMPLATE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_get_parent_links_method", "CYBLACK-BASIC-PROPOSAL-GET-PARENT-LINKS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_set_parent_links_method", "CYBLACK-BASIC-PROPOSAL-SET-PARENT-LINKS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_get_self_deletion_mode_method", "CYBLACK-BASIC-PROPOSAL-GET-SELF-DELETION-MODE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_proposal_set_self_deletion_mode_method", "CYBLACK-BASIC-PROPOSAL-SET-SELF-DELETION-MODE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_enqueue_notify_method", "CYBLACK-BASIC-PROPOSAL-ENQUEUE-NOTIFY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_dequeue_notify_method", "CYBLACK-BASIC-PROPOSAL-DEQUEUE-NOTIFY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_proposal_remove_notify_method", "CYBLACK-BASIC-PROPOSAL-REMOVE-NOTIFY-METHOD", 2, 0, false);
        declareFunction("get_cyblack_internal_proposal_timestamp", "GET-CYBLACK-INTERNAL-PROPOSAL-TIMESTAMP", 1, 0, false);
        declareFunction("set_cyblack_internal_proposal_timestamp", "SET-CYBLACK-INTERNAL-PROPOSAL-TIMESTAMP", 2, 0, false);
        declareFunction("get_cyblack_internal_proposal_reasons", "GET-CYBLACK-INTERNAL-PROPOSAL-REASONS", 1, 0, false);
        declareFunction("set_cyblack_internal_proposal_reasons", "SET-CYBLACK-INTERNAL-PROPOSAL-REASONS", 2, 0, false);
        declareFunction("get_cyblack_internal_proposal_activation_pattern", "GET-CYBLACK-INTERNAL-PROPOSAL-ACTIVATION-PATTERN", 1, 0, false);
        declareFunction("set_cyblack_internal_proposal_activation_pattern", "SET-CYBLACK-INTERNAL-PROPOSAL-ACTIVATION-PATTERN", 2, 0, false);
        declareFunction("get_cyblack_internal_proposal_knowledge_source", "GET-CYBLACK-INTERNAL-PROPOSAL-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction("set_cyblack_internal_proposal_knowledge_source", "SET-CYBLACK-INTERNAL-PROPOSAL-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_internal_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_internal_proposal_p", "CYBLACK-INTERNAL-PROPOSAL-P", 1, 0, false);
        declareFunction("cyblack_internal_proposal_initialize_method", "CYBLACK-INTERNAL-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_proposal_get_knowledge_source_method", "CYBLACK-INTERNAL-PROPOSAL-GET-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_proposal_set_knowledge_source_method", "CYBLACK-INTERNAL-PROPOSAL-SET-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_proposal_get_external_knowledge_source_method", "CYBLACK-INTERNAL-PROPOSAL-GET-EXTERNAL-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_proposal_get_activation_pattern_method", "CYBLACK-INTERNAL-PROPOSAL-GET-ACTIVATION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_proposal_set_activation_pattern_method", "CYBLACK-INTERNAL-PROPOSAL-SET-ACTIVATION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_proposal_get_reasons_method", "CYBLACK-INTERNAL-PROPOSAL-GET-REASONS-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_proposal_set_reasons_method", "CYBLACK-INTERNAL-PROPOSAL-SET-REASONS-METHOD", 2, 0, false);
        declareFunction("cyblack_internal_proposal_get_timestamp_method", "CYBLACK-INTERNAL-PROPOSAL-GET-TIMESTAMP-METHOD", 1, 0, false);
        declareFunction("cyblack_internal_proposal_set_timestamp_method", "CYBLACK-INTERNAL-PROPOSAL-SET-TIMESTAMP-METHOD", 2, 0, false);
        declareFunction("external_proposal_print_function_trampoline", "EXTERNAL-PROPOSAL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("external_proposal_p", "EXTERNAL-PROPOSAL-P", 1, 0, false);
        new cyblack_proposal.$external_proposal_p$UnaryFunction();
        declareFunction("exprop_cyblack_external_proposal", "EXPROP-CYBLACK-EXTERNAL-PROPOSAL", 1, 0, false);
        declareFunction("exprop_internals", "EXPROP-INTERNALS", 1, 0, false);
        declareFunction("exprop_knowledge_source", "EXPROP-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction("exprop_activation_pattern", "EXPROP-ACTIVATION-PATTERN", 1, 0, false);
        declareFunction("exprop_reasons", "EXPROP-REASONS", 1, 0, false);
        declareFunction("exprop_timestamp", "EXPROP-TIMESTAMP", 1, 0, false);
        declareFunction("exprop_before_withdraw_function", "EXPROP-BEFORE-WITHDRAW-FUNCTION", 1, 0, false);
        declareFunction("exprop_before_validity_reconfirmed_function", "EXPROP-BEFORE-VALIDITY-RECONFIRMED-FUNCTION", 1, 0, false);
        declareFunction("exprop_before_generate_ksi_function", "EXPROP-BEFORE-GENERATE-KSI-FUNCTION", 1, 0, false);
        declareFunction("_csetf_exprop_cyblack_external_proposal", "_CSETF-EXPROP-CYBLACK-EXTERNAL-PROPOSAL", 2, 0, false);
        declareFunction("_csetf_exprop_internals", "_CSETF-EXPROP-INTERNALS", 2, 0, false);
        declareFunction("_csetf_exprop_knowledge_source", "_CSETF-EXPROP-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("_csetf_exprop_activation_pattern", "_CSETF-EXPROP-ACTIVATION-PATTERN", 2, 0, false);
        declareFunction("_csetf_exprop_reasons", "_CSETF-EXPROP-REASONS", 2, 0, false);
        declareFunction("_csetf_exprop_timestamp", "_CSETF-EXPROP-TIMESTAMP", 2, 0, false);
        declareFunction("_csetf_exprop_before_withdraw_function", "_CSETF-EXPROP-BEFORE-WITHDRAW-FUNCTION", 2, 0, false);
        declareFunction("_csetf_exprop_before_validity_reconfirmed_function", "_CSETF-EXPROP-BEFORE-VALIDITY-RECONFIRMED-FUNCTION", 2, 0, false);
        declareFunction("_csetf_exprop_before_generate_ksi_function", "_CSETF-EXPROP-BEFORE-GENERATE-KSI-FUNCTION", 2, 0, false);
        declareFunction("make_external_proposal", "MAKE-EXTERNAL-PROPOSAL", 0, 1, false);
        declareMacro("with_exprop_read_only", "WITH-EXPROP-READ-ONLY");
        declareMacro("with_exprop_read_write", "WITH-EXPROP-READ-WRITE");
        declareMacro("with_locked_exprop", "WITH-LOCKED-EXPROP");
        declareMacro("with_locked_exprop_read_only", "WITH-LOCKED-EXPROP-READ-ONLY");
        declareMacro("with_locked_exprop_read_write", "WITH-LOCKED-EXPROP-READ-WRITE");
        declareFunction("get_cyblack_external_proposal_ksi_class", "GET-CYBLACK-EXTERNAL-PROPOSAL-KSI-CLASS", 1, 0, false);
        declareFunction("set_cyblack_external_proposal_ksi_class", "SET-CYBLACK-EXTERNAL-PROPOSAL-KSI-CLASS", 2, 0, false);
        declareFunction("get_cyblack_external_proposal_cached_ksi_class", "GET-CYBLACK-EXTERNAL-PROPOSAL-CACHED-KSI-CLASS", 1, 0, false);
        declareFunction("set_cyblack_external_proposal_cached_ksi_class", "SET-CYBLACK-EXTERNAL-PROPOSAL-CACHED-KSI-CLASS", 2, 0, false);
        declareFunction("get_cyblack_external_proposal_external_proposal", "GET-CYBLACK-EXTERNAL-PROPOSAL-EXTERNAL-PROPOSAL", 1, 0, false);
        declareFunction("set_cyblack_external_proposal_external_proposal", "SET-CYBLACK-EXTERNAL-PROPOSAL-EXTERNAL-PROPOSAL", 2, 0, false);
        declareFunction("get_cyblack_external_proposal_already_reconfirmed", "GET-CYBLACK-EXTERNAL-PROPOSAL-ALREADY-RECONFIRMED", 1, 0, false);
        declareFunction("set_cyblack_external_proposal_already_reconfirmed", "SET-CYBLACK-EXTERNAL-PROPOSAL-ALREADY-RECONFIRMED", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_proposal_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-PROPOSAL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_external_proposal_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-PROPOSAL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_external_proposal_p", "CYBLACK-EXTERNAL-PROPOSAL-P", 1, 0, false);
        declareFunction("cyblack_external_proposal_initialize_method", "CYBLACK-EXTERNAL-PROPOSAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_get_external_proposal_method", "CYBLACK-EXTERNAL-PROPOSAL-GET-EXTERNAL-PROPOSAL-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_set_external_proposal_method", "CYBLACK-EXTERNAL-PROPOSAL-SET-EXTERNAL-PROPOSAL-METHOD", 2, 0, false);
        declareFunction("cyblack_external_proposal_get_knowledge_source_method", "CYBLACK-EXTERNAL-PROPOSAL-GET-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_set_knowledge_source_method", "CYBLACK-EXTERNAL-PROPOSAL-SET-KNOWLEDGE-SOURCE-METHOD", 2, 0, false);
        declareFunction("cyblack_external_proposal_get_external_knowledge_source_method", "CYBLACK-EXTERNAL-PROPOSAL-GET-EXTERNAL-KNOWLEDGE-SOURCE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_get_activation_pattern_method", "CYBLACK-EXTERNAL-PROPOSAL-GET-ACTIVATION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_set_activation_pattern_method", "CYBLACK-EXTERNAL-PROPOSAL-SET-ACTIVATION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_external_proposal_get_reasons_method", "CYBLACK-EXTERNAL-PROPOSAL-GET-REASONS-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_set_reasons_method", "CYBLACK-EXTERNAL-PROPOSAL-SET-REASONS-METHOD", 2, 0, false);
        declareFunction("cyblack_external_proposal_get_timestamp_method", "CYBLACK-EXTERNAL-PROPOSAL-GET-TIMESTAMP-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_set_timestamp_method", "CYBLACK-EXTERNAL-PROPOSAL-SET-TIMESTAMP-METHOD", 2, 0, false);
        declareFunction("cyblack_external_proposal_validity_reconfirmed_p_method", "CYBLACK-EXTERNAL-PROPOSAL-VALIDITY-RECONFIRMED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_withdraw_method", "CYBLACK-EXTERNAL-PROPOSAL-WITHDRAW-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_generate_ksi_method", "CYBLACK-EXTERNAL-PROPOSAL-GENERATE-KSI-METHOD", 1, 1, false);
        declareFunction("cyblack_external_proposal_dispatch_ksi_method", "CYBLACK-EXTERNAL-PROPOSAL-DISPATCH-KSI-METHOD", 2, 0, false);
        declareFunction("cyblack_external_proposal_already_reconfirmed_p_method", "CYBLACK-EXTERNAL-PROPOSAL-ALREADY-RECONFIRMED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_confirm_method", "CYBLACK-EXTERNAL-PROPOSAL-CONFIRM-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_get_ksi_class_method", "CYBLACK-EXTERNAL-PROPOSAL-GET-KSI-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_set_ksi_class_method", "CYBLACK-EXTERNAL-PROPOSAL-SET-KSI-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_external_proposal_new_ksi_method", "CYBLACK-EXTERNAL-PROPOSAL-NEW-KSI-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_get_suspended_proposal_list_method", "CYBLACK-EXTERNAL-PROPOSAL-GET-SUSPENDED-PROPOSAL-LIST-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_get_active_proposals_queue_method", "CYBLACK-EXTERNAL-PROPOSAL-GET-ACTIVE-PROPOSALS-QUEUE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_get_executable_ksi_queue_method", "CYBLACK-EXTERNAL-PROPOSAL-GET-EXECUTABLE-KSI-QUEUE-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_on_add_method", "CYBLACK-EXTERNAL-PROPOSAL-ON-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_external_proposal_transfer_self_from_suspended_to_activated_method", "CYBLACK-EXTERNAL-PROPOSAL-TRANSFER-SELF-FROM-SUSPENDED-TO-ACTIVATED-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_get_proposed_contributions_method", "CYBLACK-EXTERNAL-PROPOSAL-GET-PROPOSED-CONTRIBUTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_external_proposal_set_proposed_contributions_method", "CYBLACK-EXTERNAL-PROPOSAL-SET-PROPOSED-CONTRIBUTIONS-METHOD", 2, 0, false);
        declareFunction("exprop_get_knowledge_source", "EXPROP-GET-KNOWLEDGE-SOURCE", 1, 0, false);
        declareFunction("exprop_set_knowledge_source", "EXPROP-SET-KNOWLEDGE-SOURCE", 2, 0, false);
        declareFunction("exprop_get_activation_pattern", "EXPROP-GET-ACTIVATION-PATTERN", 1, 0, false);
        declareFunction("exprop_set_activation_pattern", "EXPROP-SET-ACTIVATION-PATTERN", 2, 0, false);
        declareFunction("exprop_get_agenda", "EXPROP-GET-AGENDA", 1, 0, false);
        declareFunction("exprop_get_reasons", "EXPROP-GET-REASONS", 1, 0, false);
        declareFunction("exprop_set_reasons", "EXPROP-SET-REASONS", 2, 0, false);
        declareFunction("exprop_validity_reconfirmed_p", "EXPROP-VALIDITY-RECONFIRMED-P", 1, 0, false);
        declareFunction("exprop_withdraw", "EXPROP-WITHDRAW", 1, 0, false);
        declareFunction("exprop_get_timestamp", "EXPROP-GET-TIMESTAMP", 1, 0, false);
        declareFunction("exprop_set_timestamp", "EXPROP-SET-TIMESTAMP", 2, 0, false);
        declareFunction("exprop_generate_ksi", "EXPROP-GENERATE-KSI", 1, 0, false);
        declareFunction("new_external_proposal", "NEW-EXTERNAL-PROPOSAL", 0, 8, false);
        declareFunction("cyblack_proposal_set_activation_pattern", "CYBLACK-PROPOSAL-SET-ACTIVATION-PATTERN", 2, 0, false);
        declareFunction("cyblack_proposal_set_reasons", "CYBLACK-PROPOSAL-SET-REASONS", 2, 0, false);
        declareFunction("cyblack_proposal_set_agenda", "CYBLACK-PROPOSAL-SET-AGENDA", 2, 0, false);
        declareFunction("cyblack_proposal_set_application", "CYBLACK-PROPOSAL-SET-APPLICATION", 2, 0, false);
        declareFunction("cyblack_proposal_get_execution_mode", "CYBLACK-PROPOSAL-GET-EXECUTION-MODE", 1, 0, false);
        declareFunction("cyblack_proposal_set_knowledge_source", "CYBLACK-PROPOSAL-SET-KNOWLEDGE-SOURCE", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_proposal_file() {
        defconstant("*DTP-EXTERNAL-PROPOSAL*", EXTERNAL_PROPOSAL);
        return NIL;
    }

    public static final SubLObject setup_cyblack_proposal_file() {
                interfaces.new_interface(CYBLACK_PROPOSAL, $list_alt1, $list_alt2, $list_alt3);
        classes.subloop_new_class(CYBLACK_BASIC_PROPOSAL, CYBLACK_BASIC_LOCKABLE, $list_alt6, NIL, $list_alt7);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_PROPOSAL, NIL);
        methods.methods_incorporate_instance_method(PERFORM_ACTION, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt18, $list_alt19);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, PERFORM_ACTION, CYBLACK_BASIC_PROPOSAL_PERFORM_ACTION_METHOD);
        methods.methods_incorporate_instance_method(ON_DELETE, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt22, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, ON_DELETE, CYBLACK_BASIC_PROPOSAL_ON_DELETE_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt22, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, ON_ADD, CYBLACK_BASIC_PROPOSAL_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_COLLECTIONS, CYBLACK_BASIC_PROPOSAL, $list_alt17, NIL, $list_alt28);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_COLLECTIONS, CYBLACK_BASIC_PROPOSAL_GET_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt31, $list_alt32);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, MEMBER_P, CYBLACK_BASIC_PROPOSAL_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_ALL_COLLECTIONS, CYBLACK_BASIC_PROPOSAL, $list_alt17, NIL, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, DELETE_SELF_FROM_ALL_COLLECTIONS, CYBLACK_BASIC_PROPOSAL_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_COLLECTION, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt31, $list_alt38);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, DELETE_SELF_FROM_COLLECTION, CYBLACK_BASIC_PROPOSAL_DELETE_SELF_FROM_COLLECTION_METHOD);
        methods.methods_incorporate_instance_method(DELETE_PARENT_LINK, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt41, $list_alt42);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, DELETE_PARENT_LINK, CYBLACK_BASIC_PROPOSAL_DELETE_PARENT_LINK_METHOD);
        methods.methods_incorporate_instance_method(ADD_PARENT_LINK, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt45, $list_alt46);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, ADD_PARENT_LINK, CYBLACK_BASIC_PROPOSAL_ADD_PARENT_LINK_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_PROPOSAL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PROPOSAL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_PROPOSAL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PROPOSAL_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_proposal_class(CYBLACK_BASIC_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_PROPOSAL, $list_alt60, NIL, $list_alt61);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, INITIALIZE, CYBLACK_BASIC_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PROPOSAL, $list_alt66, NIL, $list_alt67);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PROPOSAL_GET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(SET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt70, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, SET_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PROPOSAL_SET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PROPOSAL, $list_alt74, NIL, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_BASIC_PROPOSAL_GET_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTIVATION_PATTERN, CYBLACK_BASIC_PROPOSAL, $list_alt74, NIL, $list_alt67);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_ACTIVATION_PATTERN, CYBLACK_BASIC_PROPOSAL_GET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVATION_PATTERN, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt80, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, SET_ACTIVATION_PATTERN, CYBLACK_BASIC_PROPOSAL_SET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_AGENDA, CYBLACK_BASIC_PROPOSAL, $list_alt74, NIL, $list_alt84);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_AGENDA, CYBLACK_BASIC_PROPOSAL_GET_AGENDA_METHOD);
        methods.methods_incorporate_instance_method(SET_AGENDA, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt87, $list_alt88);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, SET_AGENDA, CYBLACK_BASIC_PROPOSAL_SET_AGENDA_METHOD);
        methods.methods_incorporate_instance_method(GET_REASONS, CYBLACK_BASIC_PROPOSAL, $list_alt66, NIL, $list_alt67);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_REASONS, CYBLACK_BASIC_PROPOSAL_GET_REASONS_METHOD);
        methods.methods_incorporate_instance_method(SET_REASONS, CYBLACK_BASIC_PROPOSAL, $list_alt66, $list_alt94, $list_alt95);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, SET_REASONS, CYBLACK_BASIC_PROPOSAL_SET_REASONS_METHOD);
        methods.methods_incorporate_instance_method(VALIDITY_RECONFIRMED_P, CYBLACK_BASIC_PROPOSAL, $list_alt66, NIL, $list_alt98);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, VALIDITY_RECONFIRMED_P, CYBLACK_BASIC_PROPOSAL_VALIDITY_RECONFIRMED_P_METHOD);
        methods.methods_incorporate_instance_method(WITHDRAW, CYBLACK_BASIC_PROPOSAL, $list_alt66, NIL, $list_alt101);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, WITHDRAW, CYBLACK_BASIC_PROPOSAL_WITHDRAW_METHOD);
        methods.methods_incorporate_instance_method(GET_TIMESTAMP, CYBLACK_BASIC_PROPOSAL, $list_alt66, NIL, $list_alt67);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_TIMESTAMP, CYBLACK_BASIC_PROPOSAL_GET_TIMESTAMP_METHOD);
        methods.methods_incorporate_instance_method(SET_TIMESTAMP, CYBLACK_BASIC_PROPOSAL, $list_alt66, $list_alt106, $list_alt107);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, SET_TIMESTAMP, CYBLACK_BASIC_PROPOSAL_SET_TIMESTAMP_METHOD);
        methods.methods_incorporate_instance_method(GET_EXECUTION_MODE, CYBLACK_BASIC_PROPOSAL, $list_alt74, NIL, $list_alt110);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_EXECUTION_MODE, CYBLACK_BASIC_PROPOSAL_GET_EXECUTION_MODE_METHOD);
        methods.methods_incorporate_instance_method(SET_EXECUTION_MODE, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt113, $list_alt114);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, SET_EXECUTION_MODE, CYBLACK_BASIC_PROPOSAL_SET_EXECUTION_MODE_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, CYBLACK_BASIC_PROPOSAL, $list_alt66, NIL, $list_alt118);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GENERATE_KSI, CYBLACK_BASIC_PROPOSAL_GENERATE_KSI_METHOD);
        methods.methods_incorporate_instance_method(GET_PROPOSED_CONTRIBUTIONS, CYBLACK_BASIC_PROPOSAL, $list_alt74, NIL, $list_alt121);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_PROPOSED_CONTRIBUTIONS, CYBLACK_BASIC_PROPOSAL_GET_PROPOSED_CONTRIBUTIONS_METHOD);
        methods.methods_incorporate_instance_method(SET_PROPOSED_CONTRIBUTIONS, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt124, $list_alt125);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, SET_PROPOSED_CONTRIBUTIONS, CYBLACK_BASIC_PROPOSAL_SET_PROPOSED_CONTRIBUTIONS_METHOD);
        methods.methods_incorporate_instance_method(GET_PROPOSED_REMOVALS, CYBLACK_BASIC_PROPOSAL, $list_alt74, NIL, $list_alt129);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_PROPOSED_REMOVALS, CYBLACK_BASIC_PROPOSAL_GET_PROPOSED_REMOVALS_METHOD);
        methods.methods_incorporate_instance_method(SET_PROPOSED_REMOVALS, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt132, $list_alt133);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, SET_PROPOSED_REMOVALS, CYBLACK_BASIC_PROPOSAL_SET_PROPOSED_REMOVALS_METHOD);
        methods.methods_incorporate_instance_method(CREATE_DATATYPE_BAG, CYBLACK_BASIC_PROPOSAL, $list_alt137, $list_alt138, $list_alt139);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, CREATE_DATATYPE_BAG, CYBLACK_BASIC_PROPOSAL_CREATE_DATATYPE_BAG_METHOD);
        methods.methods_incorporate_instance_method(VERIFIED_P, CYBLACK_BASIC_PROPOSAL, $list_alt74, NIL, $list_alt143);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, VERIFIED_P, CYBLACK_BASIC_PROPOSAL_VERIFIED_P_METHOD);
        methods.methods_incorporate_instance_method(SET_VERIFIED, CYBLACK_BASIC_PROPOSAL, $list_alt17, $list_alt146, $list_alt147);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, SET_VERIFIED, CYBLACK_BASIC_PROPOSAL_SET_VERIFIED_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_LIST_ELEMENT_TEMPLATE, CYBLACK_BASIC_PROPOSAL, $list_alt60, NIL, $list_alt151);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, INITIALIZE_QUA_LIST_ELEMENT_TEMPLATE, $sym153$CYBLACK_BASIC_PROPOSAL_INITIALIZE_QUA_LIST_ELEMENT_TEMPLATE_METHO);
        methods.methods_incorporate_instance_method(GET_PARENT_LINKS, CYBLACK_BASIC_PROPOSAL, $list_alt137, NIL, $list_alt155);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_PARENT_LINKS, CYBLACK_BASIC_PROPOSAL_GET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT_LINKS, CYBLACK_BASIC_PROPOSAL, $list_alt60, $list_alt158, $list_alt159);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, SET_PARENT_LINKS, CYBLACK_BASIC_PROPOSAL_SET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_SELF_DELETION_MODE, CYBLACK_BASIC_PROPOSAL, $list_alt137, NIL, $list_alt163);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, GET_SELF_DELETION_MODE, CYBLACK_BASIC_PROPOSAL_GET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method(SET_SELF_DELETION_MODE, CYBLACK_BASIC_PROPOSAL, $list_alt60, $list_alt166, $list_alt167);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, SET_SELF_DELETION_MODE, CYBLACK_BASIC_PROPOSAL_SET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method(ENQUEUE_NOTIFY, CYBLACK_BASIC_PROPOSAL, $list_alt66, $list_alt171, $list_alt172);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, ENQUEUE_NOTIFY, CYBLACK_BASIC_PROPOSAL_ENQUEUE_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method(DEQUEUE_NOTIFY, CYBLACK_BASIC_PROPOSAL, $list_alt66, $list_alt171, $list_alt172);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, DEQUEUE_NOTIFY, CYBLACK_BASIC_PROPOSAL_DEQUEUE_NOTIFY_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_NOTIFY, CYBLACK_BASIC_PROPOSAL, $list_alt66, $list_alt171, $list_alt172);
        methods.subloop_register_instance_method(CYBLACK_BASIC_PROPOSAL, REMOVE_NOTIFY, CYBLACK_BASIC_PROPOSAL_REMOVE_NOTIFY_METHOD);
        classes.subloop_new_class(CYBLACK_INTERNAL_PROPOSAL, CYBLACK_BASIC_PROPOSAL, NIL, NIL, $list_alt179);
        classes.class_set_implements_slot_listeners(CYBLACK_INTERNAL_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_INTERNAL_PROPOSAL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_PROPOSAL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_INTERNAL_PROPOSAL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_PROPOSAL_INSTANCE);
        subloop_reserved_initialize_cyblack_internal_proposal_class(CYBLACK_INTERNAL_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_INTERNAL_PROPOSAL, $list_alt60, NIL, $list_alt186);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_PROPOSAL, INITIALIZE, CYBLACK_INTERNAL_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_KNOWLEDGE_SOURCE, CYBLACK_INTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt189);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_PROPOSAL, GET_KNOWLEDGE_SOURCE, CYBLACK_INTERNAL_PROPOSAL_GET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(SET_KNOWLEDGE_SOURCE, CYBLACK_INTERNAL_PROPOSAL, $list_alt17, $list_alt70, $list_alt191);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_PROPOSAL, SET_KNOWLEDGE_SOURCE, CYBLACK_INTERNAL_PROPOSAL_SET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_INTERNAL_PROPOSAL, $list_alt66, NIL, $list_alt67);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_PROPOSAL, GET_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_INTERNAL_PROPOSAL_GET_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTIVATION_PATTERN, CYBLACK_INTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt196);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_PROPOSAL, GET_ACTIVATION_PATTERN, CYBLACK_INTERNAL_PROPOSAL_GET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVATION_PATTERN, CYBLACK_INTERNAL_PROPOSAL, $list_alt17, $list_alt80, $list_alt198);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_PROPOSAL, SET_ACTIVATION_PATTERN, CYBLACK_INTERNAL_PROPOSAL_SET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_REASONS, CYBLACK_INTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt201);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_PROPOSAL, GET_REASONS, CYBLACK_INTERNAL_PROPOSAL_GET_REASONS_METHOD);
        methods.methods_incorporate_instance_method(SET_REASONS, CYBLACK_INTERNAL_PROPOSAL, $list_alt17, $list_alt94, $list_alt203);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_PROPOSAL, SET_REASONS, CYBLACK_INTERNAL_PROPOSAL_SET_REASONS_METHOD);
        methods.methods_incorporate_instance_method(GET_TIMESTAMP, CYBLACK_INTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt206);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_PROPOSAL, GET_TIMESTAMP, CYBLACK_INTERNAL_PROPOSAL_GET_TIMESTAMP_METHOD);
        methods.methods_incorporate_instance_method(SET_TIMESTAMP, CYBLACK_INTERNAL_PROPOSAL, $list_alt17, $list_alt106, $list_alt208);
        methods.subloop_register_instance_method(CYBLACK_INTERNAL_PROPOSAL, SET_TIMESTAMP, CYBLACK_INTERNAL_PROPOSAL_SET_TIMESTAMP_METHOD);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_external_proposal$.getGlobalValue(), symbol_function(EXTERNAL_PROPOSAL_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(EXPROP_CYBLACK_EXTERNAL_PROPOSAL, _CSETF_EXPROP_CYBLACK_EXTERNAL_PROPOSAL);
        def_csetf(EXPROP_INTERNALS, _CSETF_EXPROP_INTERNALS);
        def_csetf(EXPROP_KNOWLEDGE_SOURCE, _CSETF_EXPROP_KNOWLEDGE_SOURCE);
        def_csetf(EXPROP_ACTIVATION_PATTERN, _CSETF_EXPROP_ACTIVATION_PATTERN);
        def_csetf(EXPROP_REASONS, _CSETF_EXPROP_REASONS);
        def_csetf(EXPROP_TIMESTAMP, _CSETF_EXPROP_TIMESTAMP);
        def_csetf(EXPROP_BEFORE_WITHDRAW_FUNCTION, _CSETF_EXPROP_BEFORE_WITHDRAW_FUNCTION);
        def_csetf(EXPROP_BEFORE_VALIDITY_RECONFIRMED_FUNCTION, _CSETF_EXPROP_BEFORE_VALIDITY_RECONFIRMED_FUNCTION);
        def_csetf(EXPROP_BEFORE_GENERATE_KSI_FUNCTION, _CSETF_EXPROP_BEFORE_GENERATE_KSI_FUNCTION);
        identity(EXTERNAL_PROPOSAL);
        classes.subloop_new_class(CYBLACK_EXTERNAL_PROPOSAL, CYBLACK_BASIC_PROPOSAL, NIL, NIL, $list_alt254);
        classes.class_set_implements_slot_listeners(CYBLACK_EXTERNAL_PROPOSAL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_EXTERNAL_PROPOSAL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_PROPOSAL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_EXTERNAL_PROPOSAL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_PROPOSAL_INSTANCE);
        subloop_reserved_initialize_cyblack_external_proposal_class(CYBLACK_EXTERNAL_PROPOSAL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_EXTERNAL_PROPOSAL, $list_alt60, NIL, $list_alt261);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, INITIALIZE, CYBLACK_EXTERNAL_PROPOSAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_PROPOSAL, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt266);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GET_EXTERNAL_PROPOSAL, CYBLACK_EXTERNAL_PROPOSAL_GET_EXTERNAL_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(SET_EXTERNAL_PROPOSAL, CYBLACK_EXTERNAL_PROPOSAL, $list_alt17, $list_alt269, $list_alt270);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, SET_EXTERNAL_PROPOSAL, CYBLACK_EXTERNAL_PROPOSAL_SET_EXTERNAL_PROPOSAL_METHOD);
        methods.methods_incorporate_instance_method(GET_KNOWLEDGE_SOURCE, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt273);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GET_KNOWLEDGE_SOURCE, CYBLACK_EXTERNAL_PROPOSAL_GET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(SET_KNOWLEDGE_SOURCE, CYBLACK_EXTERNAL_PROPOSAL, $list_alt17, $list_alt70, $list_alt275);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, SET_KNOWLEDGE_SOURCE, CYBLACK_EXTERNAL_PROPOSAL_SET_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_EXTERNAL_PROPOSAL, $list_alt66, NIL, $list_alt278);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GET_EXTERNAL_KNOWLEDGE_SOURCE, CYBLACK_EXTERNAL_PROPOSAL_GET_EXTERNAL_KNOWLEDGE_SOURCE_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTIVATION_PATTERN, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt280);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GET_ACTIVATION_PATTERN, CYBLACK_EXTERNAL_PROPOSAL_GET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVATION_PATTERN, CYBLACK_EXTERNAL_PROPOSAL, $list_alt17, $list_alt80, $list_alt282);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, SET_ACTIVATION_PATTERN, CYBLACK_EXTERNAL_PROPOSAL_SET_ACTIVATION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_REASONS, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt285);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GET_REASONS, CYBLACK_EXTERNAL_PROPOSAL_GET_REASONS_METHOD);
        methods.methods_incorporate_instance_method(SET_REASONS, CYBLACK_EXTERNAL_PROPOSAL, $list_alt17, $list_alt94, $list_alt287);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, SET_REASONS, CYBLACK_EXTERNAL_PROPOSAL_SET_REASONS_METHOD);
        methods.methods_incorporate_instance_method(GET_TIMESTAMP, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt290);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GET_TIMESTAMP, CYBLACK_EXTERNAL_PROPOSAL_GET_TIMESTAMP_METHOD);
        methods.methods_incorporate_instance_method(SET_TIMESTAMP, CYBLACK_EXTERNAL_PROPOSAL, $list_alt17, $list_alt106, $list_alt292);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, SET_TIMESTAMP, CYBLACK_EXTERNAL_PROPOSAL_SET_TIMESTAMP_METHOD);
        methods.methods_incorporate_instance_method(VALIDITY_RECONFIRMED_P, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt295);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, VALIDITY_RECONFIRMED_P, CYBLACK_EXTERNAL_PROPOSAL_VALIDITY_RECONFIRMED_P_METHOD);
        methods.methods_incorporate_instance_method(WITHDRAW, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt297);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, WITHDRAW, CYBLACK_EXTERNAL_PROPOSAL_WITHDRAW_METHOD);
        methods.methods_incorporate_instance_method(GENERATE_KSI, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, $list_alt299, $list_alt300);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GENERATE_KSI, CYBLACK_EXTERNAL_PROPOSAL_GENERATE_KSI_METHOD);
        methods.methods_incorporate_instance_method(DISPATCH_KSI, CYBLACK_EXTERNAL_PROPOSAL, $list_alt303, $list_alt304, $list_alt305);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, DISPATCH_KSI, CYBLACK_EXTERNAL_PROPOSAL_DISPATCH_KSI_METHOD);
        methods.methods_incorporate_instance_method(ALREADY_RECONFIRMED_P, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt295);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, ALREADY_RECONFIRMED_P, CYBLACK_EXTERNAL_PROPOSAL_ALREADY_RECONFIRMED_P_METHOD);
        methods.methods_incorporate_instance_method(CONFIRM, CYBLACK_EXTERNAL_PROPOSAL, $list_alt17, NIL, $list_alt310);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, CONFIRM, CYBLACK_EXTERNAL_PROPOSAL_CONFIRM_METHOD);
        methods.methods_incorporate_instance_method(GET_KSI_CLASS, CYBLACK_EXTERNAL_PROPOSAL, $list_alt17, NIL, $list_alt314);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GET_KSI_CLASS, CYBLACK_EXTERNAL_PROPOSAL_GET_KSI_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_KSI_CLASS, CYBLACK_EXTERNAL_PROPOSAL, $list_alt17, $list_alt318, $list_alt319);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, SET_KSI_CLASS, CYBLACK_EXTERNAL_PROPOSAL_SET_KSI_CLASS_METHOD);
        methods.methods_incorporate_instance_method(NEW_KSI, CYBLACK_EXTERNAL_PROPOSAL, $list_alt66, NIL, $list_alt323);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, NEW_KSI, CYBLACK_EXTERNAL_PROPOSAL_NEW_KSI_METHOD);
        methods.methods_incorporate_instance_method(GET_SUSPENDED_PROPOSAL_LIST, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt327);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GET_SUSPENDED_PROPOSAL_LIST, CYBLACK_EXTERNAL_PROPOSAL_GET_SUSPENDED_PROPOSAL_LIST_METHOD);
        methods.methods_incorporate_instance_method(GET_ACTIVE_PROPOSALS_QUEUE, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt330);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GET_ACTIVE_PROPOSALS_QUEUE, CYBLACK_EXTERNAL_PROPOSAL_GET_ACTIVE_PROPOSALS_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(GET_EXECUTABLE_KSI_QUEUE, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt333);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GET_EXECUTABLE_KSI_QUEUE, CYBLACK_EXTERNAL_PROPOSAL_GET_EXECUTABLE_KSI_QUEUE_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD, CYBLACK_EXTERNAL_PROPOSAL, $list_alt17, $list_alt22, $list_alt335);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, ON_ADD, CYBLACK_EXTERNAL_PROPOSAL_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method(TRANSFER_SELF_FROM_SUSPENDED_TO_ACTIVATED, CYBLACK_EXTERNAL_PROPOSAL, $list_alt66, NIL, $list_alt342);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, TRANSFER_SELF_FROM_SUSPENDED_TO_ACTIVATED, $sym343$CYBLACK_EXTERNAL_PROPOSAL_TRANSFER_SELF_FROM_SUSPENDED_TO_ACTIVAT);
        methods.methods_incorporate_instance_method(GET_PROPOSED_CONTRIBUTIONS, CYBLACK_EXTERNAL_PROPOSAL, $list_alt74, NIL, $list_alt121);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, GET_PROPOSED_CONTRIBUTIONS, CYBLACK_EXTERNAL_PROPOSAL_GET_PROPOSED_CONTRIBUTIONS_METHOD);
        methods.methods_incorporate_instance_method(SET_PROPOSED_CONTRIBUTIONS, CYBLACK_EXTERNAL_PROPOSAL, $list_alt17, $list_alt345, $list_alt346);
        methods.subloop_register_instance_method(CYBLACK_EXTERNAL_PROPOSAL, SET_PROPOSED_CONTRIBUTIONS, CYBLACK_EXTERNAL_PROPOSAL_SET_PROPOSED_CONTRIBUTIONS_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_PROPOSAL = makeSymbol("CYBLACK-PROPOSAL");

    static private final SubLList $list_alt1 = list(makeSymbol("LIST-ELEMENT-TEMPLATE"), makeSymbol("QUEUE-ELEMENT-INTERFACE"), makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), list(makeSymbol("LIST-ELEMENT-TEMPLATE"), makeSymbol("QUEUE-ELEMENT-INTERFACE"), makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KNOWLEDGE-SOURCE"), list(makeSymbol("NEW-KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-PATTERN"), list(makeSymbol("NEW-ACTIVATION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-AGENDA"), list(makeSymbol("NEW-AGENDA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REASONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REASONS"), list(makeSymbol("NEW-REASONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALIDITY-RECONFIRMED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WITHDRAW"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMESTAMP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXECUTION-MODE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXECUTION-MODE"), list(makeSymbol("NEW-EXECUTION-MODE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-KSI"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROPOSED-CONTRIBUTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROPOSED-REMOVALS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VERIFIED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VERIFIED"), list(makeSymbol("NEW-VERIFIED-VALUE")), makeKeyword("PUBLIC")) });





    static private final SubLList $list_alt6 = list(makeSymbol("CYBLACK-PROPOSAL"));

    static private final SubLList $list_alt7 = list(new SubLObject[]{ list(makeSymbol("AGENDA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROPOSED-CONTRIBUTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROPOSED-REMOVALS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXECUTION-MODE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VERIFIED"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KNOWLEDGE-SOURCE"), list(makeSymbol("NEW-KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-PATTERN"), list(makeSymbol("NEW-ACTIVATION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-AGENDA"), list(makeSymbol("NEW-AGENDA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REASONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REASONS"), list(makeSymbol("NEW-REASONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALIDITY-RECONFIRMED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WITHDRAW"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMESTAMP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIMESTAMP"), list(makeSymbol("UNIVERSAL-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-KSI"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROPOSED-CONTRIBUTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), list(makeSymbol("NEW-CONTRIBUTIONS-BAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROPOSED-REMOVALS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROPOSED-REMOVALS"), list(makeSymbol("NEW-REMOVALS-BAG")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-DATATYPE-BAG"), list(makeSymbol("TYPESTRINGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VERIFIED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-VERIFIED"), list(makeSymbol("NEW-VERIFIED-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-LIST-ELEMENT-TEMPLATE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT-LINKS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT-LINKS"), list(makeSymbol("NEW-PARENT-LINKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SELF-DELETION-MODE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SELF-DELETION-MODE"), list(makeSymbol("MODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PARENT-LINK"), list(makeSymbol("NEW-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-PARENT-LINK"), list(makeSymbol("OLD-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-COLLECTION"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTION"), makeSymbol("PARAMETERS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEQUEUE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-NOTIFY"), list(makeSymbol("QUEUE")), makeKeyword("PUBLIC")) });















    public static final SubLInteger $int$4097 = makeInteger(4097);



    static private final SubLList $list_alt17 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt18 = list(makeSymbol("ACTION"), makeSymbol("PARAMETERS"));

    static private final SubLList $list_alt19 = list(list(makeSymbol("IGNORE"), makeSymbol("ACTION"), makeSymbol("PARAMETERS")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_PERFORM_ACTION_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-PERFORM-ACTION-METHOD");



    static private final SubLList $list_alt22 = list(makeSymbol("PARENT-LIST"));

    static private final SubLList $list_alt23 = list(list(makeSymbol("IGNORE"), makeSymbol("PARENT-LIST")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_ON_DELETE_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-ON-DELETE-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_ON_ADD_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-ON-ADD-METHOD");



    static private final SubLList $list_alt28 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-COLLECTIONS"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS"), makeSymbol("TEMPLATE-COLLECTIONS")), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK"))), list(RET, list(makeSymbol("UNIQUE-ELEMENTS"), makeSymbol("TEMPLATE-COLLECTIONS")))));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_COLLECTIONS_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-COLLECTIONS-METHOD");



    static private final SubLList $list_alt31 = list(makeSymbol("COLLECTION"));

    static private final SubLList $list_alt32 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(RET, T))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_MEMBER_P_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-MEMBER-P-METHOD");



    static private final SubLList $list_alt35 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), NIL))), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), NIL)), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD");



    static private final SubLList $list_alt38 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), makeSymbol("COLLECTION")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_DELETE_SELF_FROM_COLLECTION_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-DELETE-SELF-FROM-COLLECTION-METHOD");



    static private final SubLList $list_alt41 = list(makeSymbol("OLD-PARENT-LINK"));

    static private final SubLList $list_alt42 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OLD-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), list(makeSymbol("DLC-OWNER"), makeSymbol("OLD-PARENT-LINK"))), list(RET, makeSymbol("OLD-PARENT-LINK"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))))))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_DELETE_PARENT_LINK_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-DELETE-PARENT-LINK-METHOD");



    static private final SubLList $list_alt45 = list(makeSymbol("NEW-PARENT-LINK"));

    static private final SubLList $list_alt46 = list(list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("NEW-PARENT-LINK"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ADD")), list(makeSymbol("DLC-OWNER"), makeSymbol("NEW-PARENT-LINK"))), list(RET, makeSymbol("NEW-PARENT-LINK")));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_ADD_PARENT_LINK_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-ADD-PARENT-LINK-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PROPOSAL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PROPOSAL-CLASS");















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_PROPOSAL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-PROPOSAL-INSTANCE");



    static private final SubLList $list_alt60 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt61 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-LIST-ELEMENT-TEMPLATE"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("PROPOSED-CONTRIBUTIONS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PROPOSED-REMOVALS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EXECUTION-MODE"), makeKeyword("SYNCHRONOUS")), list(makeSymbol("CSETQ"), makeSymbol("VERIFIED"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym62$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PROPOSAL-METHOD");

    private static final SubLSymbol $SYNCHRONOUS = makeKeyword("SYNCHRONOUS");

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-INITIALIZE-METHOD");



    static private final SubLList $list_alt66 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt67 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt70 = list(makeSymbol("NEW-KNOWLEDGE-SOURCE"));

    static private final SubLList $list_alt71 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_SET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-SET-KNOWLEDGE-SOURCE-METHOD");



    static private final SubLList $list_alt74 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt75 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ASSOCIATED-KNOWLEDGE-SOURCE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KNOWLEDGE-SOURCE"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("ASSOCIATED-KNOWLEDGE-SOURCE"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("ASSOCIATED-KNOWLEDGE-SOURCE"))), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("ASSOCIATED-KNOWLEDGE-SOURCE"))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-ACTIVATION-PATTERN-METHOD");



    static private final SubLList $list_alt80 = list(makeSymbol("NEW-ACTIVATION-PATTERN"));

    static private final SubLList $list_alt81 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-ACTIVATION-PATTERN")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_SET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-SET-ACTIVATION-PATTERN-METHOD");



    static private final SubLList $list_alt84 = list(list(RET, makeSymbol("AGENDA")));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_AGENDA_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-AGENDA-METHOD");

    private static final SubLSymbol SET_AGENDA = makeSymbol("SET-AGENDA");

    static private final SubLList $list_alt87 = list(makeSymbol("NEW-AGENDA"));

    static private final SubLList $list_alt88 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-AGENDA")), list(makeSymbol("CYBLACK-AGENDA-P"), makeSymbol("NEW-AGENDA"))), makeString("(SET-AGENDA ~S): ~S is not an instance of CYBLACK-AGENDA."), makeSymbol("SELF"), makeSymbol("NEW-AGENDA")), list(makeSymbol("CSETQ"), makeSymbol("AGENDA"), makeSymbol("NEW-AGENDA")), list(RET, makeSymbol("NEW-AGENDA")));

    static private final SubLSymbol $sym89$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_SET_AGENDA_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-SET-AGENDA-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_REASONS_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-REASONS-METHOD");



    static private final SubLList $list_alt94 = list(makeSymbol("NEW-REASONS"));

    static private final SubLList $list_alt95 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-REASONS")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_SET_REASONS_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-SET-REASONS-METHOD");

    private static final SubLSymbol VALIDITY_RECONFIRMED_P = makeSymbol("VALIDITY-RECONFIRMED-P");

    static private final SubLList $list_alt98 = list(list(RET, T));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_VALIDITY_RECONFIRMED_P_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-VALIDITY-RECONFIRMED-P-METHOD");

    private static final SubLSymbol WITHDRAW = makeSymbol("WITHDRAW");

    static private final SubLList $list_alt101 = list(list(makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_WITHDRAW_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-WITHDRAW-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_TIMESTAMP_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-TIMESTAMP-METHOD");



    static private final SubLList $list_alt106 = list(makeSymbol("UNIVERSAL-TIME"));

    static private final SubLList $list_alt107 = list(list(makeSymbol("IGNORE"), makeSymbol("UNIVERSAL-TIME")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_SET_TIMESTAMP_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-SET-TIMESTAMP-METHOD");

    private static final SubLSymbol GET_EXECUTION_MODE = makeSymbol("GET-EXECUTION-MODE");

    static private final SubLList $list_alt110 = list(list(RET, makeSymbol("EXECUTION-MODE")));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_EXECUTION_MODE_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-EXECUTION-MODE-METHOD");



    static private final SubLList $list_alt113 = list(makeSymbol("NEW-EXECUTION-MODE"));

    static private final SubLList $list_alt114 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-EXECUTION-MODE-TYPE-P"), makeSymbol("NEW-EXECUTION-MODE")), makeString("(SET-EXECUTION-MODE ~S): ~S is not a member of the CYBLACK-EXECUTION-MODE-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-EXECUTION-MODE")), list(makeSymbol("CSETQ"), makeSymbol("EXECUTION-MODE"), makeSymbol("NEW-EXECUTION-MODE")), list(RET, makeSymbol("NEW-EXECUTION-MODE")));

    static private final SubLSymbol $sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_SET_EXECUTION_MODE_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-SET-EXECUTION-MODE-METHOD");



    static private final SubLList $list_alt118 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KNOWLEDGE-SOURCE"))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("KS"), makeString("(GENERATE-KSI ~S): No knowledge source is associated with this proposal."), makeSymbol("SELF")), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("KS"), list(QUOTE, makeSymbol("GENERATE-KSI")), makeSymbol("SELF")))));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GENERATE_KSI_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GENERATE-KSI-METHOD");

    private static final SubLSymbol GET_PROPOSED_CONTRIBUTIONS = makeSymbol("GET-PROPOSED-CONTRIBUTIONS");

    static private final SubLList $list_alt121 = list(list(RET, makeSymbol("PROPOSED-CONTRIBUTIONS")));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_PROPOSED_CONTRIBUTIONS_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-PROPOSED-CONTRIBUTIONS-METHOD");



    static private final SubLList $list_alt124 = list(makeSymbol("NEW-CONTRIBUTIONS-BAG"));

    static private final SubLList $list_alt125 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-CONTRIBUTIONS-BAG")), list(makeSymbol("BASIC-BAG-P"), makeSymbol("NEW-CONTRIBUTIONS-BAG"))), makeString("(SET-PROPOSED-CONTRIBUTIONS ~S): ~S is not an instance of BASIC-BAG."), makeSymbol("SELF"), makeSymbol("NEW-CONTRIBUTIONS-BAG")), list(makeSymbol("CSETQ"), makeSymbol("PROPOSED-CONTRIBUTIONS"), makeSymbol("NEW-CONTRIBUTIONS-BAG")), list(RET, makeSymbol("NEW-CONTRIBUTIONS-BAG")));

    static private final SubLSymbol $sym126$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_SET_PROPOSED_CONTRIBUTIONS_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-SET-PROPOSED-CONTRIBUTIONS-METHOD");

    private static final SubLSymbol GET_PROPOSED_REMOVALS = makeSymbol("GET-PROPOSED-REMOVALS");

    static private final SubLList $list_alt129 = list(list(RET, makeSymbol("PROPOSED-REMOVALS")));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_PROPOSED_REMOVALS_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-PROPOSED-REMOVALS-METHOD");

    private static final SubLSymbol SET_PROPOSED_REMOVALS = makeSymbol("SET-PROPOSED-REMOVALS");

    static private final SubLList $list_alt132 = list(makeSymbol("NEW-REMOVALS-BAG"));

    static private final SubLList $list_alt133 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-REMOVALS-BAG")), list(makeSymbol("BASIC-BAG-P"), makeSymbol("NEW-REMOVALS-BAG"))), makeString("(SET-PROPOSED-CONTRIBUTIONS ~S): ~S is not an instance of BASIC-BAG."), makeSymbol("SELF"), makeSymbol("NEW-REMOVALS-BAG")), list(makeSymbol("CSETQ"), makeSymbol("PROPOSED-REMOVALS"), makeSymbol("NEW-REMOVALS-BAG")), list(RET, makeSymbol("NEW-REMOVALS-BAG")));

    static private final SubLSymbol $sym134$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_SET_PROPOSED_REMOVALS_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-SET-PROPOSED-REMOVALS-METHOD");



    static private final SubLList $list_alt137 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt138 = list(makeSymbol("TYPESTRINGS"));

    static private final SubLList $list_alt139 = list(list(makeSymbol("PWHEN"), makeSymbol("APPLICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeSymbol("APPLICATION")))), list(makeSymbol("PWHEN"), makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("CLET"), list(list(makeSymbol("BAG"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-BAG")), list(QUOTE, makeSymbol("BASIC-BAG"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPESTRING"), makeSymbol("TYPESTRINGS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-BAG")), makeSymbol("BAG"), list(makeSymbol("CYBLACK-DATATYPE-DICTIONARY-INTERN"), makeSymbol("DATATYPE-DICTIONARY"), makeSymbol("TYPESTRING")))), list(RET, makeSymbol("BAG")))))), list(RET, NIL));



    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_CREATE_DATATYPE_BAG_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-CREATE-DATATYPE-BAG-METHOD");

    private static final SubLSymbol VERIFIED_P = makeSymbol("VERIFIED-P");

    static private final SubLList $list_alt143 = list(list(RET, makeSymbol("VERIFIED")));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_VERIFIED_P_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-VERIFIED-P-METHOD");

    private static final SubLSymbol SET_VERIFIED = makeSymbol("SET-VERIFIED");

    static private final SubLList $list_alt146 = list(makeSymbol("NEW-VERIFIED-VALUE"));

    static private final SubLList $list_alt147 = list(list(makeSymbol("CSETQ"), makeSymbol("VERIFIED"), list(makeSymbol("FIF"), makeSymbol("NEW-VERIFIED-VALUE"), T, NIL)), list(RET, makeSymbol("VERIFIED")));

    static private final SubLSymbol $sym148$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_SET_VERIFIED_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-SET-VERIFIED-METHOD");

    private static final SubLSymbol INITIALIZE_QUA_LIST_ELEMENT_TEMPLATE = makeSymbol("INITIALIZE-QUA-LIST-ELEMENT-TEMPLATE");

    static private final SubLList $list_alt151 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym152$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PROPOSAL-METHOD");

    static private final SubLSymbol $sym153$CYBLACK_BASIC_PROPOSAL_INITIALIZE_QUA_LIST_ELEMENT_TEMPLATE_METHO = makeSymbol("CYBLACK-BASIC-PROPOSAL-INITIALIZE-QUA-LIST-ELEMENT-TEMPLATE-METHOD");



    static private final SubLList $list_alt155 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS")));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt158 = list(makeSymbol("NEW-PARENT-LINKS"));

    static private final SubLList $list_alt159 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeSymbol("NEW-PARENT-LINKS")), list(RET, makeSymbol("NEW-PARENT-LINKS")));

    static private final SubLSymbol $sym160$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_SET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-SET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt163 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE")));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_GET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-GET-SELF-DELETION-MODE-METHOD");



    static private final SubLList $list_alt166 = list(makeSymbol("MODE"));

    static private final SubLList $list_alt167 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeSymbol("MODE")), list(RET, makeSymbol("MODE")));

    static private final SubLSymbol $sym168$OUTER_CATCH_FOR_CYBLACK_BASIC_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_SET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-SET-SELF-DELETION-MODE-METHOD");



    static private final SubLList $list_alt171 = list(makeSymbol("QUEUE"));

    static private final SubLList $list_alt172 = list(list(makeSymbol("IGNORE"), makeSymbol("QUEUE")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_ENQUEUE_NOTIFY_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-ENQUEUE-NOTIFY-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_DEQUEUE_NOTIFY_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-DEQUEUE-NOTIFY-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_PROPOSAL_REMOVE_NOTIFY_METHOD = makeSymbol("CYBLACK-BASIC-PROPOSAL-REMOVE-NOTIFY-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL = makeSymbol("CYBLACK-INTERNAL-PROPOSAL");

    static private final SubLList $list_alt179 = list(new SubLObject[]{ list(makeSymbol("KNOWLEDGE-SOURCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ACTIVATION-PATTERN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("REASONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TIMESTAMP"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KNOWLEDGE-SOURCE"), list(makeSymbol("NEW-KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-PATTERN"), list(makeSymbol("NEW-ACTIVATION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REASONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REASONS"), list(makeSymbol("NEW-REASONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMESTAMP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIMESTAMP"), list(makeSymbol("UNIVERSAL-TIME")), makeKeyword("PUBLIC")) });









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_PROPOSAL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-PROPOSAL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_INTERNAL_PROPOSAL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-INTERNAL-PROPOSAL-INSTANCE");

    static private final SubLList $list_alt186 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), NIL), list(makeSymbol("CSETQ"), makeSymbol("REASONS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TIMESTAMP"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym187$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL_INITIALIZE_METHOD = makeSymbol("CYBLACK-INTERNAL-PROPOSAL-INITIALIZE-METHOD");

    static private final SubLList $list_alt189 = list(list(RET, makeSymbol("KNOWLEDGE-SOURCE")));

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL_GET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-INTERNAL-PROPOSAL-GET-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLList $list_alt191 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-KNOWLEDGE-SOURCE-P"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), makeString("(SET-KNOWLEDGE-SOURCE ~S): ~S is not an instance of CYBLACK-KNOWLEDGE-SOURCE."), makeSymbol("SELF"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(SET-KNOWLEDGE-SOURCE ~S): setting knowledge source to ~S."), makeSymbol("SELF"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("NEW-KNOWLEDGE-SOURCE")), list(RET, makeSymbol("NEW-KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym192$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-PROPOSAL-METHOD");

    static private final SubLString $str_alt193$___SET_KNOWLEDGE_SOURCE__S___sett = makeString("~%(SET-KNOWLEDGE-SOURCE ~S): setting knowledge source to ~S.");

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL_SET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-INTERNAL-PROPOSAL-SET-KNOWLEDGE-SOURCE-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL_GET_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-INTERNAL-PROPOSAL-GET-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLList $list_alt196 = list(list(RET, makeSymbol("ACTIVATION-PATTERN")));

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL_GET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-INTERNAL-PROPOSAL-GET-ACTIVATION-PATTERN-METHOD");

    static private final SubLList $list_alt198 = list(list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), makeSymbol("NEW-ACTIVATION-PATTERN")), list(RET, makeSymbol("NEW-ACTIVATION-PATTERN")));

    static private final SubLSymbol $sym199$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL_SET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-INTERNAL-PROPOSAL-SET-ACTIVATION-PATTERN-METHOD");

    static private final SubLList $list_alt201 = list(list(RET, makeSymbol("REASONS")));

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL_GET_REASONS_METHOD = makeSymbol("CYBLACK-INTERNAL-PROPOSAL-GET-REASONS-METHOD");

    static private final SubLList $list_alt203 = list(list(makeSymbol("CSETQ"), makeSymbol("REASONS"), makeSymbol("NEW-REASONS")), list(RET, makeSymbol("NEW-REASONS")));

    static private final SubLSymbol $sym204$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL_SET_REASONS_METHOD = makeSymbol("CYBLACK-INTERNAL-PROPOSAL-SET-REASONS-METHOD");

    static private final SubLList $list_alt206 = list(list(RET, makeSymbol("TIMESTAMP")));

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL_GET_TIMESTAMP_METHOD = makeSymbol("CYBLACK-INTERNAL-PROPOSAL-GET-TIMESTAMP-METHOD");

    static private final SubLList $list_alt208 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("UNIVERSAL-TIME")), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("UNIVERSAL-TIME")), list(makeSymbol(">="), makeSymbol("UNIVERSAL-TIME"), ZERO_INTEGER))), makeString("(SET-TIMESTAMP ~S): ~S is not a valid universal time value."), makeSymbol("SELF"), makeSymbol("UNIVERSAL-TIME")), list(makeSymbol("CSETQ"), makeSymbol("TIMESTAMP"), makeSymbol("UNIVERSAL-TIME")), list(RET, makeSymbol("UNIVERSAL-TIME")));

    static private final SubLSymbol $sym209$OUTER_CATCH_FOR_CYBLACK_INTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-INTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_INTERNAL_PROPOSAL_SET_TIMESTAMP_METHOD = makeSymbol("CYBLACK-INTERNAL-PROPOSAL-SET-TIMESTAMP-METHOD");



    private static final SubLSymbol EXTERNAL_PROPOSAL_P = makeSymbol("EXTERNAL-PROPOSAL-P");

    static private final SubLList $list_alt213 = list(new SubLObject[]{ makeSymbol("CYBLACK-EXTERNAL-PROPOSAL"), makeSymbol("INTERNALS"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("ACTIVATION-PATTERN"), makeSymbol("REASONS"), makeSymbol("TIMESTAMP"), makeSymbol("BEFORE-WITHDRAW-FUNCTION"), makeSymbol("BEFORE-VALIDITY-RECONFIRMED-FUNCTION"), makeSymbol("BEFORE-GENERATE-KSI-FUNCTION") });

    static private final SubLList $list_alt214 = list(new SubLObject[]{ makeKeyword("CYBLACK-EXTERNAL-PROPOSAL"), makeKeyword("INTERNALS"), makeKeyword("KNOWLEDGE-SOURCE"), makeKeyword("ACTIVATION-PATTERN"), makeKeyword("REASONS"), makeKeyword("TIMESTAMP"), makeKeyword("BEFORE-WITHDRAW-FUNCTION"), makeKeyword("BEFORE-VALIDITY-RECONFIRMED-FUNCTION"), makeKeyword("BEFORE-GENERATE-KSI-FUNCTION") });

    static private final SubLList $list_alt215 = list(new SubLObject[]{ makeSymbol("EXPROP-CYBLACK-EXTERNAL-PROPOSAL"), makeSymbol("EXPROP-INTERNALS"), makeSymbol("EXPROP-KNOWLEDGE-SOURCE"), makeSymbol("EXPROP-ACTIVATION-PATTERN"), makeSymbol("EXPROP-REASONS"), makeSymbol("EXPROP-TIMESTAMP"), makeSymbol("EXPROP-BEFORE-WITHDRAW-FUNCTION"), makeSymbol("EXPROP-BEFORE-VALIDITY-RECONFIRMED-FUNCTION"), makeSymbol("EXPROP-BEFORE-GENERATE-KSI-FUNCTION") });

    static private final SubLList $list_alt216 = list(new SubLObject[]{ makeSymbol("_CSETF-EXPROP-CYBLACK-EXTERNAL-PROPOSAL"), makeSymbol("_CSETF-EXPROP-INTERNALS"), makeSymbol("_CSETF-EXPROP-KNOWLEDGE-SOURCE"), makeSymbol("_CSETF-EXPROP-ACTIVATION-PATTERN"), makeSymbol("_CSETF-EXPROP-REASONS"), makeSymbol("_CSETF-EXPROP-TIMESTAMP"), makeSymbol("_CSETF-EXPROP-BEFORE-WITHDRAW-FUNCTION"), makeSymbol("_CSETF-EXPROP-BEFORE-VALIDITY-RECONFIRMED-FUNCTION"), makeSymbol("_CSETF-EXPROP-BEFORE-GENERATE-KSI-FUNCTION") });



    private static final SubLSymbol EXTERNAL_PROPOSAL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EXTERNAL-PROPOSAL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol EXPROP_CYBLACK_EXTERNAL_PROPOSAL = makeSymbol("EXPROP-CYBLACK-EXTERNAL-PROPOSAL");

    public static final SubLSymbol _CSETF_EXPROP_CYBLACK_EXTERNAL_PROPOSAL = makeSymbol("_CSETF-EXPROP-CYBLACK-EXTERNAL-PROPOSAL");

    private static final SubLSymbol EXPROP_INTERNALS = makeSymbol("EXPROP-INTERNALS");

    public static final SubLSymbol _CSETF_EXPROP_INTERNALS = makeSymbol("_CSETF-EXPROP-INTERNALS");

    private static final SubLSymbol EXPROP_KNOWLEDGE_SOURCE = makeSymbol("EXPROP-KNOWLEDGE-SOURCE");

    public static final SubLSymbol _CSETF_EXPROP_KNOWLEDGE_SOURCE = makeSymbol("_CSETF-EXPROP-KNOWLEDGE-SOURCE");

    private static final SubLSymbol EXPROP_ACTIVATION_PATTERN = makeSymbol("EXPROP-ACTIVATION-PATTERN");

    public static final SubLSymbol _CSETF_EXPROP_ACTIVATION_PATTERN = makeSymbol("_CSETF-EXPROP-ACTIVATION-PATTERN");

    private static final SubLSymbol EXPROP_REASONS = makeSymbol("EXPROP-REASONS");

    public static final SubLSymbol _CSETF_EXPROP_REASONS = makeSymbol("_CSETF-EXPROP-REASONS");

    private static final SubLSymbol EXPROP_TIMESTAMP = makeSymbol("EXPROP-TIMESTAMP");

    public static final SubLSymbol _CSETF_EXPROP_TIMESTAMP = makeSymbol("_CSETF-EXPROP-TIMESTAMP");

    private static final SubLSymbol EXPROP_BEFORE_WITHDRAW_FUNCTION = makeSymbol("EXPROP-BEFORE-WITHDRAW-FUNCTION");

    public static final SubLSymbol _CSETF_EXPROP_BEFORE_WITHDRAW_FUNCTION = makeSymbol("_CSETF-EXPROP-BEFORE-WITHDRAW-FUNCTION");

    private static final SubLSymbol EXPROP_BEFORE_VALIDITY_RECONFIRMED_FUNCTION = makeSymbol("EXPROP-BEFORE-VALIDITY-RECONFIRMED-FUNCTION");

    public static final SubLSymbol _CSETF_EXPROP_BEFORE_VALIDITY_RECONFIRMED_FUNCTION = makeSymbol("_CSETF-EXPROP-BEFORE-VALIDITY-RECONFIRMED-FUNCTION");

    private static final SubLSymbol EXPROP_BEFORE_GENERATE_KSI_FUNCTION = makeSymbol("EXPROP-BEFORE-GENERATE-KSI-FUNCTION");

    public static final SubLSymbol _CSETF_EXPROP_BEFORE_GENERATE_KSI_FUNCTION = makeSymbol("_CSETF-EXPROP-BEFORE-GENERATE-KSI-FUNCTION");

    private static final SubLSymbol $CYBLACK_EXTERNAL_PROPOSAL = makeKeyword("CYBLACK-EXTERNAL-PROPOSAL");

    private static final SubLSymbol $INTERNALS = makeKeyword("INTERNALS");

    private static final SubLSymbol $KNOWLEDGE_SOURCE = makeKeyword("KNOWLEDGE-SOURCE");

    private static final SubLSymbol $ACTIVATION_PATTERN = makeKeyword("ACTIVATION-PATTERN");

    private static final SubLSymbol $REASONS = makeKeyword("REASONS");



    private static final SubLSymbol $BEFORE_WITHDRAW_FUNCTION = makeKeyword("BEFORE-WITHDRAW-FUNCTION");

    private static final SubLSymbol $BEFORE_VALIDITY_RECONFIRMED_FUNCTION = makeKeyword("BEFORE-VALIDITY-RECONFIRMED-FUNCTION");

    private static final SubLSymbol $BEFORE_GENERATE_KSI_FUNCTION = makeKeyword("BEFORE-GENERATE-KSI-FUNCTION");

    static private final SubLString $str_alt246$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt247 = list(makeSymbol("EXPROP"), makeSymbol("&BODY"), makeSymbol("FORMS"));

    static private final SubLString $$$exprop = makeString("exprop");

    private static final SubLSymbol EXPROP_ = makeSymbol("EXPROP-");

    static private final SubLString $$$cexprop = makeString("cexprop");



    private static final SubLSymbol WITH_CYBLACK_BASIC_LOCKABLE = makeSymbol("WITH-CYBLACK-BASIC-LOCKABLE");



    static private final SubLList $list_alt254 = list(new SubLObject[]{ list(makeSymbol("EXTERNAL-PROPOSAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ALREADY-RECONFIRMED"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("CACHED-KSI-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KSI-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-PROPOSAL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXTERNAL-PROPOSAL"), list(makeSymbol("NEW-EXTERNAL-PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KNOWLEDGE-SOURCE"), list(makeSymbol("NEW-KNOWLEDGE-SOURCE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVATION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVATION-PATTERN"), list(makeSymbol("NEW-ACTIVATION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REASONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REASONS"), list(makeSymbol("NEW-REASONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMESTAMP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIMESTAMP"), list(makeSymbol("UNIVERSAL-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALIDITY-RECONFIRMED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("WITHDRAW"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATE-KSI"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("DISPATCH"), T)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPATCH-KSI"), list(makeSymbol("KSI")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ALREADY-RECONFIRMED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONFIRM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSI-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSI-CLASS"), list(makeSymbol("NEW-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-KSI"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUSPENDED-PROPOSAL-LIST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ACTIVE-PROPOSALS-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXECUTABLE-KSI-QUEUE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSFER-SELF-FROM-SUSPENDED-TO-ACTIVATED"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROPOSED-CONTRIBUTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROPOSED-CONTRIBUTIONS"), list(makeSymbol("NEW-CONTRIBUTIONS")), makeKeyword("PUBLIC")) });





    private static final SubLSymbol ALREADY_RECONFIRMED = makeSymbol("ALREADY-RECONFIRMED");

    public static final SubLInteger $int$4098 = makeInteger(4098);

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_PROPOSAL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-PROPOSAL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_EXTERNAL_PROPOSAL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-EXTERNAL-PROPOSAL-INSTANCE");

    static private final SubLList $list_alt261 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-PROPOSAL"), list(makeSymbol("MAKE-EXTERNAL-PROPOSAL"))), list(makeSymbol("CSETQ"), makeSymbol("ALREADY-RECONFIRMED"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EXECUTION-MODE"), makeKeyword("ASYNCHRONOUS")), list(new SubLObject[]{ makeSymbol("WITH-EXPROP-READ-WRITE"), makeSymbol("EXTERNAL-PROPOSAL"), list(makeSymbol("CSETQ"), makeSymbol("CYBLACK-EXTERNAL-PROPOSAL"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("INTERNALS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), NIL), list(makeSymbol("CSETQ"), makeSymbol("REASONS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TIMESTAMP"), NIL), list(makeSymbol("CSETQ"), makeSymbol("BEFORE-WITHDRAW-FUNCTION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("BEFORE-VALIDITY-RECONFIRMED-FUNCTION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("BEFORE-GENERATE-KSI-FUNCTION"), NIL) }), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym262$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol $ASYNCHRONOUS = makeKeyword("ASYNCHRONOUS");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_INITIALIZE_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-INITIALIZE-METHOD");

    private static final SubLSymbol GET_EXTERNAL_PROPOSAL = makeSymbol("GET-EXTERNAL-PROPOSAL");

    static private final SubLList $list_alt266 = list(list(RET, makeSymbol("EXTERNAL-PROPOSAL")));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GET_EXTERNAL_PROPOSAL_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GET-EXTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol SET_EXTERNAL_PROPOSAL = makeSymbol("SET-EXTERNAL-PROPOSAL");

    static private final SubLList $list_alt269 = list(makeSymbol("NEW-EXTERNAL-PROPOSAL"));

    static private final SubLList $list_alt270 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("EXTERNAL-PROPOSAL-P"), makeSymbol("NEW-EXTERNAL-PROPOSAL")), makeString("(SET-EXTERNAL-PROPOSAL ~S): ~S is not a valid EXTERNAL-PROPOSAL instance."), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-PROPOSAL")), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-PROPOSAL"), makeSymbol("NEW-EXTERNAL-PROPOSAL")), list(RET, makeSymbol("NEW-EXTERNAL-PROPOSAL")));

    static private final SubLSymbol $sym271$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_SET_EXTERNAL_PROPOSAL_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-SET-EXTERNAL-PROPOSAL-METHOD");

    static private final SubLList $list_alt273 = list(list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-PROPOSAL"), list(makeSymbol("WITH-EXPROP-READ-ONLY"), makeSymbol("EXTERNAL-PROPOSAL"), list(RET, makeSymbol("KNOWLEDGE-SOURCE")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GET-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLList $list_alt275 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("EXTERNAL-PROPOSAL"), makeString("(SET-KNOWLEDGE-SOURCE ~S): No external proposal instance is associated with this proposal."), makeSymbol("SELF")), list(makeSymbol("WITH-EXPROP-READ-WRITE"), makeSymbol("EXTERNAL-PROPOSAL"), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE"), makeSymbol("NEW-KNOWLEDGE-SOURCE"))), list(RET, makeSymbol("NEW-KNOWLEDGE-SOURCE")));

    static private final SubLSymbol $sym276$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_SET_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-SET-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLList $list_alt278 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ASSOCIATED-KNOWLEDGE-SOURCE"), list(makeSymbol("GET-KNOWLEDGE-SOURCE"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("ASSOCIATED-KNOWLEDGE-SOURCE"), list(makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE-P"), makeSymbol("ASSOCIATED-KNOWLEDGE-SOURCE"))), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-KNOWLEDGE-SOURCE"), makeSymbol("CYBLACK-EXTERNAL-KNOWLEDGE-SOURCE")), makeSymbol("ASSOCIATED-KNOWLEDGE-SOURCE"))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GET_EXTERNAL_KNOWLEDGE_SOURCE_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GET-EXTERNAL-KNOWLEDGE-SOURCE-METHOD");

    static private final SubLList $list_alt280 = list(list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-PROPOSAL"), list(makeSymbol("WITH-EXPROP-READ-ONLY"), makeSymbol("EXTERNAL-PROPOSAL"), list(RET, makeSymbol("ACTIVATION-PATTERN")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GET-ACTIVATION-PATTERN-METHOD");

    static private final SubLList $list_alt282 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("EXTERNAL-PROPOSAL"), makeString("(SET-ACTIVATION-PATTERN ~S): No external proposal instance is associated with this proposal."), makeSymbol("SELF")), list(makeSymbol("WITH-EXPROP-READ-WRITE"), makeSymbol("EXTERNAL-PROPOSAL"), list(makeSymbol("CSETQ"), makeSymbol("ACTIVATION-PATTERN"), makeSymbol("NEW-ACTIVATION-PATTERN"))), list(RET, makeSymbol("NEW-ACTIVATION-PATTERN")));

    static private final SubLSymbol $sym283$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_SET_ACTIVATION_PATTERN_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-SET-ACTIVATION-PATTERN-METHOD");

    static private final SubLList $list_alt285 = list(list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-PROPOSAL"), list(makeSymbol("WITH-EXPROP-READ-ONLY"), makeSymbol("EXTERNAL-PROPOSAL"), list(RET, makeSymbol("REASONS")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GET_REASONS_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GET-REASONS-METHOD");

    static private final SubLList $list_alt287 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("EXTERNAL-PROPOSAL"), makeString("(SET-REASONS ~S): No external proposal instance is associated with this proposal."), makeSymbol("SELF")), list(makeSymbol("WITH-EXPROP-READ-WRITE"), makeSymbol("EXTERNAL-PROPOSAL"), list(makeSymbol("CSETQ"), makeSymbol("REASONS"), makeSymbol("NEW-REASONS"))), list(RET, makeSymbol("NEW-REASONS")));

    static private final SubLSymbol $sym288$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_SET_REASONS_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-SET-REASONS-METHOD");

    static private final SubLList $list_alt290 = list(list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-PROPOSAL"), list(makeSymbol("WITH-EXPROP-READ-ONLY"), makeSymbol("EXTERNAL-PROPOSAL"), list(RET, makeSymbol("TIMESTAMP")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GET_TIMESTAMP_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GET-TIMESTAMP-METHOD");

    static private final SubLList $list_alt292 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("EXTERNAL-PROPOSAL"), makeString("(SET-TIMESTAMP ~S): No external proposal instance is associated with this proposal."), makeSymbol("SELF")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("UNIVERSAL-TIME")), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("UNIVERSAL-TIME")), list(makeSymbol(">="), makeSymbol("UNIVERSAL-TIME"), ZERO_INTEGER))), makeString("(SET-TIMESTAMP ~S): ~S is not a valid universal time."), makeSymbol("SELF"), makeSymbol("UNIVERSAL-TIME")), list(makeSymbol("WITH-EXPROP-READ-WRITE"), makeSymbol("EXTERNAL-PROPOSAL"), list(makeSymbol("CSETQ"), makeSymbol("TIMESTAMP"), makeSymbol("UNIVERSAL-TIME"))), list(RET, makeSymbol("UNIVERSAL-TIME")));

    static private final SubLSymbol $sym293$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_SET_TIMESTAMP_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-SET-TIMESTAMP-METHOD");

    static private final SubLList $list_alt295 = list(list(RET, makeSymbol("ALREADY-RECONFIRMED")));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_VALIDITY_RECONFIRMED_P_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-VALIDITY-RECONFIRMED-P-METHOD");

    static private final SubLList $list_alt297 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("EXTERNAL-PROPOSAL"), makeString("(WITHDRAW ~S): No external proposal instance is associated with this proposal."), makeSymbol("SELF")), list(makeSymbol("WITH-EXPROP-READ-ONLY"), makeSymbol("EXTERNAL-PROPOSAL"), list(makeSymbol("PWHEN"), makeSymbol("BEFORE-WITHDRAW-FUNCTION"), list(makeSymbol("FUNCALL"), makeSymbol("BEFORE-WITHDRAW-FUNCTION"), makeSymbol("EXTERNAL-PROPOSAL")))), list(RET, list(makeSymbol("WITHDRAW"), makeSymbol("SUPER"))));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_WITHDRAW_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-WITHDRAW-METHOD");

    static private final SubLList $list_alt299 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("DISPATCH"), T));

    static private final SubLList $list_alt300 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSI"), list(makeSymbol("GENERATE-KSI"), makeSymbol("SUPER")))), list(makeSymbol("PWHEN"), makeSymbol("DISPATCH"), list(makeSymbol("DISPATCH-KSI"), makeSymbol("SELF"), makeSymbol("KSI"))), list(RET, makeSymbol("KSI"))));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GENERATE_KSI_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GENERATE-KSI-METHOD");

    private static final SubLSymbol DISPATCH_KSI = makeSymbol("DISPATCH-KSI");

    static private final SubLList $list_alt303 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt304 = list(makeSymbol("KSI"));

    static private final SubLList $list_alt305 = list(list(makeSymbol("PWHEN"), makeSymbol("KSI"), list(makeSymbol("CLET"), list(list(makeSymbol("EXECTUTABLE-KSI-QUEUE"), list(makeSymbol("GET-EXECUTABLE-KSI-QUEUE"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("EXECTUTABLE-KSI-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("EXECTUTABLE-KSI-QUEUE"), makeSymbol("KSI"))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_DISPATCH_KSI_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-DISPATCH-KSI-METHOD");

    private static final SubLSymbol ALREADY_RECONFIRMED_P = makeSymbol("ALREADY-RECONFIRMED-P");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_ALREADY_RECONFIRMED_P_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-ALREADY-RECONFIRMED-P-METHOD");

    private static final SubLSymbol CONFIRM = makeSymbol("CONFIRM");

    static private final SubLList $list_alt310 = list(list(makeSymbol("CSETQ"), makeSymbol("ALREADY-RECONFIRMED"), T));

    static private final SubLSymbol $sym311$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_CONFIRM_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-CONFIRM-METHOD");

    private static final SubLSymbol GET_KSI_CLASS = makeSymbol("GET-KSI-CLASS");

    static private final SubLList $list_alt314 = list(list(makeSymbol("PWHEN"), makeSymbol("CACHED-KSI-CLASS"), list(RET, makeSymbol("CACHED-KSI-CLASS"))), list(makeSymbol("PWHEN"), makeSymbol("KSI-CLASS"), list(makeSymbol("CSETQ"), makeSymbol("CACHED-KSI-CLASS"), list(makeSymbol("CLASSES-RETRIEVE-CLASS"), makeSymbol("KSI-CLASS"))), list(RET, makeSymbol("CACHED-KSI-CLASS"))), list(RET, NIL));

    static private final SubLSymbol $sym315$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GET_KSI_CLASS_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GET-KSI-CLASS-METHOD");

    private static final SubLSymbol SET_KSI_CLASS = makeSymbol("SET-KSI-CLASS");

    static private final SubLList $list_alt318 = list(makeSymbol("NEW-CLASS"));

    static private final SubLList $list_alt319 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-CLASS")), list(makeSymbol("CLASS-P"), makeSymbol("NEW-CLASS"))), makeString("(SET-KSI-CLASS ~S): ~S is neither a class nor the symbolic name of a class."), makeSymbol("SELF"), makeSymbol("NEW-CLASS")), list(makeSymbol("PUNLESS"), makeSymbol("NEW-CLASS"), list(makeSymbol("CSETQ"), makeSymbol("CACHED-KSI-CLASS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KSI-CLASS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("CACHED-KSI-CLASS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KSI-CLASS"), makeSymbol("NEW-CLASS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CLASS-P"), makeSymbol("NEW-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("CACHED-KSI-CLASS"), makeSymbol("NEW-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("KSI-CLASS"), list(makeSymbol("CLASS-NAME"), makeSymbol("NEW-CLASS")))), list(RET, makeSymbol("NEW-CLASS")));

    static private final SubLSymbol $sym320$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_SET_KSI_CLASS_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-SET-KSI-CLASS-METHOD");



    static private final SubLList $list_alt323 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CLASS"), list(makeSymbol("GET-KSI-CLASS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("CLASS"), list(RET, list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("CLASS")))), list(RET, list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-EXTERNAL-KSI"))))));

    private static final SubLSymbol CYBLACK_EXTERNAL_KSI = makeSymbol("CYBLACK-EXTERNAL-KSI");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_NEW_KSI_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-NEW-KSI-METHOD");

    private static final SubLSymbol GET_SUSPENDED_PROPOSAL_LIST = makeSymbol("GET-SUSPENDED-PROPOSAL-LIST");

    static private final SubLList $list_alt327 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("AGENDA"), makeString("(GET-SUSPENDED-PROPOSAL-LIST ~S): No agenda is associated with this proposal."), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-AGENDA-GET-SUSPENDED-PROPOSALS"), makeSymbol("AGENDA"))));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GET_SUSPENDED_PROPOSAL_LIST_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GET-SUSPENDED-PROPOSAL-LIST-METHOD");

    private static final SubLSymbol GET_ACTIVE_PROPOSALS_QUEUE = makeSymbol("GET-ACTIVE-PROPOSALS-QUEUE");

    static private final SubLList $list_alt330 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("AGENDA"), makeString("(GET-ACTIVE-PROPOSALS-QUEUE ~S): No agenda is associated with this proposal."), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-AGENDA-GET-ACTIVE-PROPOSALS"), makeSymbol("AGENDA"))));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GET_ACTIVE_PROPOSALS_QUEUE_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GET-ACTIVE-PROPOSALS-QUEUE-METHOD");



    static private final SubLList $list_alt333 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("AGENDA"), makeString("(GET-EXECUTABLE-KSI-QUEUE ~S): No agenda is associated with this proposal."), makeSymbol("SELF")), list(RET, list(makeSymbol("CYBLACK-AGENDA-GET-EXECUTABLE-KSI-QUEUE"), makeSymbol("AGENDA"))));

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GET_EXECUTABLE_KSI_QUEUE_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GET-EXECUTABLE-KSI-QUEUE-METHOD");

    static private final SubLList $list_alt335 = list(list(makeSymbol("CYBLACK-MUST"), makeSymbol("PARENT-LIST"), makeString("(ON-ADD ~S): The parent list is NIL."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("SUSPENDED-PROPOSAL-LIST"), list(makeSymbol("GET-SUSPENDED-PROPOSAL-LIST"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("SUSPENDED-PROPOSAL-LIST"), list(makeSymbol("WARN"), makeString("(ON-ADD ~S): No suspended proposal list could be found."), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("SUSPENDED-PROPOSAL-LIST"), makeSymbol("PARENT-LIST")), list(makeSymbol("PIF"), makeSymbol("APPLICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE-BROKER"), list(makeSymbol("CYBLACK-APPLICATION-GET-MESSAGE-BROKER"), makeSymbol("APPLICATION")))), list(makeSymbol("PIF"), makeSymbol("MESSAGE-BROKER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("VERIFY"), makeSymbol("CYBLACK-MESSAGE-BROKER")), makeSymbol("MESSAGE-BROKER"), makeSymbol("SELF"), list(makeSymbol("GET-ACTIVATION-PATTERN"), makeSymbol("SELF"))), list(makeSymbol("WARN"), makeString("(ON-ADD ~S): Could not find the message broker."), makeSymbol("SELF")))), list(makeSymbol("WARN"), makeString("(ON-ADD ~S): Could not find the application"), makeSymbol("SELF"))))), list(RET, NIL));

    static private final SubLSymbol $sym336$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-PROPOSAL-METHOD");

    static private final SubLString $str_alt337$_ON_ADD__S___No_suspended_proposa = makeString("(ON-ADD ~S): No suspended proposal list could be found.");

    static private final SubLString $str_alt338$_ON_ADD__S___Could_not_find_the_m = makeString("(ON-ADD ~S): Could not find the message broker.");

    static private final SubLString $str_alt339$_ON_ADD__S___Could_not_find_the_a = makeString("(ON-ADD ~S): Could not find the application");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_ON_ADD_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-ON-ADD-METHOD");

    private static final SubLSymbol TRANSFER_SELF_FROM_SUSPENDED_TO_ACTIVATED = makeSymbol("TRANSFER-SELF-FROM-SUSPENDED-TO-ACTIVATED");

    static private final SubLList $list_alt342 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SUSPENDED-PROPOSAL-LIST"), list(makeSymbol("GET-SUSPENDED-PROPOSAL-LIST"), makeSymbol("SELF"))), list(makeSymbol("ACTIVE-PROPOSALS-QUEUE"), list(makeSymbol("GET-ACTIVE-PROPOSALS-QUEUE"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("SUSPENDED-PROPOSAL-LIST"), list(makeSymbol("DELETE-SELF-FROM-COLLECTION"), makeSymbol("SELF"), makeSymbol("SUSPENDED-PROPOSAL-LIST"))), list(makeSymbol("PWHEN"), makeSymbol("ACTIVE-PROPOSALS-QUEUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ENQUEUE"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("ACTIVE-PROPOSALS-QUEUE"), makeSymbol("SELF"))), list(RET, T)));

    static private final SubLSymbol $sym343$CYBLACK_EXTERNAL_PROPOSAL_TRANSFER_SELF_FROM_SUSPENDED_TO_ACTIVAT = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-TRANSFER-SELF-FROM-SUSPENDED-TO-ACTIVATED-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_GET_PROPOSED_CONTRIBUTIONS_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-GET-PROPOSED-CONTRIBUTIONS-METHOD");

    static private final SubLList $list_alt345 = list(makeSymbol("NEW-CONTRIBUTIONS"));

    static private final SubLList $list_alt346 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-CONTRIBUTIONS")), list(makeSymbol("BASIC-BAG-P"), makeSymbol("NEW-CONTRIBUTIONS"))), makeString("(SET-PROPOSED-CONTRIBUTIONS ~S): ~S is not an instance of BASIC-BAG."), makeSymbol("SELF"), makeSymbol("NEW-CONTRIBUTIONS")), list(makeSymbol("CSETQ"), makeSymbol("PROPOSED-CONTRIBUTIONS"), makeSymbol("NEW-CONTRIBUTIONS")), list(RET, makeSymbol("NEW-CONTRIBUTIONS")));

    static private final SubLSymbol $sym347$OUTER_CATCH_FOR_CYBLACK_EXTERNAL_PROPOSAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-EXTERNAL-PROPOSAL-METHOD");

    private static final SubLSymbol CYBLACK_EXTERNAL_PROPOSAL_SET_PROPOSED_CONTRIBUTIONS_METHOD = makeSymbol("CYBLACK-EXTERNAL-PROPOSAL-SET-PROPOSED-CONTRIBUTIONS-METHOD");

    static private final SubLString $str_alt349$CYBLACK_PROPOSAL_SET_ACTIVATION_P = makeString("CYBLACK-PROPOSAL-SET-ACTIVATION-PATTERN: ~S is not an instance of CYBLACK-PROPOSAL.");

    static private final SubLString $str_alt350$CYBLACK_PROPOSAL_SET_REASONS___S_ = makeString("CYBLACK-PROPOSAL-SET-REASONS: ~S is not an instance of CYBLACK-PROPOSAL.");

    static private final SubLString $str_alt351$CYBLACK_PROPOSAL_SET_AGENDA___S_i = makeString("CYBLACK-PROPOSAL-SET-AGENDA: ~S is not an instance of CYBLACK-PROPOSAL.");

    static private final SubLString $str_alt352$CYBLACK_PROPOSAL_SET_APPLICATION_ = makeString("CYBLACK-PROPOSAL-SET-APPLICATION: ~S is not an instance of CYBLACK-PROPOSAL.");



    static private final SubLString $str_alt354$CYBLACK_PROPOSAL_GET_EXECUTION_MO = makeString("CYBLACK-PROPOSAL-GET-EXECUTION-MODE: ~S is not an instance of CYBLACK-PROPOSAL.");

    static private final SubLString $str_alt355$CYBLACK_PROPOSAL_SET_KNOWLEDGE_SO = makeString("CYBLACK-PROPOSAL-SET-KNOWLEDGE-SOURCE: ~S is not an instance of CYBLACK-PROPOSAL.");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_proposal_file();
    }

    public void initializeVariables() {
        init_cyblack_proposal_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_proposal_file();
    }
}

