/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.instances;
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
 *  module:      CYBLACK-UNIFICATION
 *  source file: /cyc/top/cycl/cyblack/cyblack-unification.lisp
 *  created:     2019/07/03 17:38:48
 */
public final class cyblack_unification extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_unification() {
    }

    public static final SubLFile me = new cyblack_unification();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_unification";

    // // Definitions
    /**
     * Enumerated values of type CYBLACK-UNIFICATION-SATISFACTION-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_unification_satisfaction_types$ = makeSymbol("*VALID-CYBLACK-UNIFICATION-SATISFACTION-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-UNIFICATION-SATISFACTION-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_unification_satisfaction_types() {
        return $valid_cyblack_unification_satisfaction_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-UNIFICATION-SATISFACTION-TYPE enumeration.
     */
    public static final SubLObject cyblack_unification_satisfaction_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_unification_satisfaction_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-UNIFICATION-SATISFACTION-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_unification_satisfaction_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_unification_satisfaction_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_UNIFICATION_SATISFACTION_TYPE, value, CYBLACK_UNIFICATION_SATISFACTION_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-UNIFICATION-SATISFACTION-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_unification_satisfaction_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_unification_satisfaction_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_UNIFICATION_SATISFACTION_TYPE, value, CYBLACK_UNIFICATION_SATISFACTION_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-UNIFICATION-SATISFACTION-TYPE enumeration.
     */
    public static final SubLObject cyblack_unification_satisfaction_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_satisfaction_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_UNIFICATION_SATISFACTION_TYPE_P, value1, CYBLACK_UNIFICATION_SATISFACTION_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_satisfaction_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_UNIFICATION_SATISFACTION_TYPE_P, value2, CYBLACK_UNIFICATION_SATISFACTION_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_unification_satisfaction_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-UNIFICATION-SATISFACTION-TYPE enumeration.
     */
    public static final SubLObject cyblack_unification_satisfaction_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_satisfaction_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_UNIFICATION_SATISFACTION_TYPE_P, value1, CYBLACK_UNIFICATION_SATISFACTION_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_satisfaction_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_UNIFICATION_SATISFACTION_TYPE_P, value2, CYBLACK_UNIFICATION_SATISFACTION_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_unification_satisfaction_types$.getGlobalValue();
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

    public static final SubLObject get_cyblack_unification_robot_parent_robot(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, FIFTEEN_INTEGER, PARENT_ROBOT);
    }

    public static final SubLObject set_cyblack_unification_robot_parent_robot(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, FIFTEEN_INTEGER, PARENT_ROBOT);
    }

    public static final SubLObject get_cyblack_unification_robot_target_binding(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, FOURTEEN_INTEGER, TARGET_BINDING);
    }

    public static final SubLObject set_cyblack_unification_robot_target_binding(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, FOURTEEN_INTEGER, TARGET_BINDING);
    }

    public static final SubLObject get_cyblack_unification_robot_min_solution_count(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, THIRTEEN_INTEGER, MIN_SOLUTION_COUNT);
    }

    public static final SubLObject set_cyblack_unification_robot_min_solution_count(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, THIRTEEN_INTEGER, MIN_SOLUTION_COUNT);
    }

    public static final SubLObject get_cyblack_unification_robot_timeout(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, TWELVE_INTEGER, TIMEOUT);
    }

    public static final SubLObject set_cyblack_unification_robot_timeout(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, TWELVE_INTEGER, TIMEOUT);
    }

    public static final SubLObject get_cyblack_unification_robot_satisfaction_type(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, ELEVEN_INTEGER, SATISFACTION_TYPE);
    }

    public static final SubLObject set_cyblack_unification_robot_satisfaction_type(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, ELEVEN_INTEGER, SATISFACTION_TYPE);
    }

    public static final SubLObject get_cyblack_unification_robot_solutions(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, TEN_INTEGER, SOLUTIONS);
    }

    public static final SubLObject set_cyblack_unification_robot_solutions(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, TEN_INTEGER, SOLUTIONS);
    }

    public static final SubLObject get_cyblack_unification_robot_unbound_bindings(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, NINE_INTEGER, UNBOUND_BINDINGS);
    }

    public static final SubLObject set_cyblack_unification_robot_unbound_bindings(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, NINE_INTEGER, UNBOUND_BINDINGS);
    }

    public static final SubLObject get_cyblack_unification_robot_bound_bindings(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, EIGHT_INTEGER, BOUND_BINDINGS);
    }

    public static final SubLObject set_cyblack_unification_robot_bound_bindings(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, EIGHT_INTEGER, BOUND_BINDINGS);
    }

    public static final SubLObject get_cyblack_unification_robot_precondition(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, SEVEN_INTEGER, PRECONDITION);
    }

    public static final SubLObject set_cyblack_unification_robot_precondition(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, SEVEN_INTEGER, PRECONDITION);
    }

    public static final SubLObject get_cyblack_unification_robot_cached_blackboard(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, SIX_INTEGER, CACHED_BLACKBOARD);
    }

    public static final SubLObject set_cyblack_unification_robot_cached_blackboard(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, SIX_INTEGER, CACHED_BLACKBOARD);
    }

    public static final SubLObject get_cyblack_unification_robot_cached_dictionary(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, FIVE_INTEGER, CACHED_DICTIONARY);
    }

    public static final SubLObject set_cyblack_unification_robot_cached_dictionary(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, FIVE_INTEGER, CACHED_DICTIONARY);
    }

    public static final SubLObject get_cyblack_unification_robot_qua_list_element_parent_links(SubLObject cyblack_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_unification_robot, FOUR_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject set_cyblack_unification_robot_qua_list_element_parent_links(SubLObject cyblack_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_unification_robot, value, FOUR_INTEGER, QUA_LIST_ELEMENT_PARENT_LINKS);
    }

    public static final SubLObject get_cyblack_unification_robot_instigator_bound(SubLObject cyblack_unification_robot) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_unification_robot);
            SubLObject slot = slots.slot_assoc(INSTIGATOR_BOUND, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_unification_robot, slot);
        }
        return classes.ldb_test($int$4098, subloop_structures.instance_boolean_slots(cyblack_unification_robot));
    }

    public static final SubLObject set_cyblack_unification_robot_instigator_bound(SubLObject cyblack_unification_robot, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_unification_robot);
            SubLObject slot = slots.slot_assoc(INSTIGATOR_BOUND, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_unification_robot, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_unification_robot, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4098, subloop_structures.instance_boolean_slots(cyblack_unification_robot)));
        return value;
    }

    public static final SubLObject get_cyblack_unification_robot_qua_list_element_self_deletion_mode(SubLObject cyblack_unification_robot) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_unification_robot);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_unification_robot, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_unification_robot));
    }

    public static final SubLObject set_cyblack_unification_robot_qua_list_element_self_deletion_mode(SubLObject cyblack_unification_robot, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_unification_robot);
            SubLObject slot = slots.slot_assoc(QUA_LIST_ELEMENT_SELF_DELETION_MODE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_unification_robot, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_unification_robot, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_unification_robot)));
        return value;
    }

    public static final SubLObject cyblack_unification_robot_perform_action_method(SubLObject self, SubLObject action, SubLObject parameters) {
        return NIL;
    }

    public static final SubLObject cyblack_unification_robot_on_delete_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_unification_robot_on_add_method(SubLObject self, SubLObject parent_list) {
        return NIL;
    }

    public static final SubLObject cyblack_unification_robot_get_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_unification_robot_get_parent_links_method(self);
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

    public static final SubLObject cyblack_unification_robot_member_p_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_unification_robot_get_parent_links_method(self);
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

    public static final SubLObject cyblack_unification_robot_transfer_self_method(SubLObject self, SubLObject current_collection, SubLObject new_collection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.collection_template_p(current_collection)) {
                    Errors.error($str_alt49$_TRANSFER_SELF__S____S_is_not_an_, self, current_collection);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == subloop_collections.collection_template_p(current_collection)) {
                    Errors.error($str_alt49$_TRANSFER_SELF__S____S_is_not_an_, self, new_collection);
                }
            }
            {
                SubLObject template_parent_links = cyblack_unification_robot_get_parent_links_method(self);
                SubLObject template_parent_link = NIL;
                SubLObject template_target_link = NIL;
                if (NIL != template_parent_links) {
                    if (subloop_collections.dlc_owner(template_parent_links.first()) == current_collection) {
                        template_target_link = template_parent_links.first();
                        cyblack_unification_robot_set_parent_links_method(self, template_parent_links.rest());
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
                            cyblack_unification_robot_set_self_deletion_mode_method(self, T);
                            subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_target_link), template_target_link);
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    subloop_collections._csetf_dlc_owner(template_target_link, NIL);
                                    methods.funcall_instance_method_with_1_args(new_collection, ADD, self);
                                    cyblack_unification_robot_set_self_deletion_mode_method(self, NIL);
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

    public static final SubLObject cyblack_unification_robot_delete_self_from_all_collections_method(SubLObject self) {
        {
            SubLObject template_parent_links = cyblack_unification_robot_get_parent_links_method(self);
            try {
                cyblack_unification_robot_set_self_deletion_mode_method(self, T);
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
                        cyblack_unification_robot_set_self_deletion_mode_method(self, NIL);
                        cyblack_unification_robot_set_parent_links_method(self, NIL);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return self;
        }
    }

    public static final SubLObject cyblack_unification_robot_delete_self_from_collection_method(SubLObject self, SubLObject collection) {
        {
            SubLObject template_parent_links = cyblack_unification_robot_get_parent_links_method(self);
            SubLObject template_parent_link = NIL;
            SubLObject template_target_link = NIL;
            if (NIL != template_parent_links) {
                if (subloop_collections.dlc_owner(template_parent_links.first()) == collection) {
                    template_target_link = template_parent_links.first();
                    cyblack_unification_robot_set_parent_links_method(self, template_parent_links.rest());
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
                        cyblack_unification_robot_set_self_deletion_mode_method(self, T);
                        subloop_collections.generic_dllt_delete_link_function(subloop_collections.dlc_owner(template_target_link), template_target_link);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                subloop_collections._csetf_dlc_owner(template_target_link, NIL);
                                methods.funcall_instance_method_with_1_args(self, ON_DELETE, collection);
                                cyblack_unification_robot_set_self_deletion_mode_method(self, NIL);
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

    public static final SubLObject cyblack_unification_robot_delete_parent_link_method(SubLObject self, SubLObject old_parent_link) {
        {
            SubLObject template_parent_links = cyblack_unification_robot_get_parent_links_method(self);
            if (NIL != template_parent_links) {
                if (old_parent_link == template_parent_links) {
                    cyblack_unification_robot_set_parent_links_method(self, template_parent_links.rest());
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

    public static final SubLObject cyblack_unification_robot_add_parent_link_method(SubLObject self, SubLObject new_parent_link) {
        cyblack_unification_robot_set_parent_links_method(self, cons(new_parent_link, cyblack_unification_robot_get_parent_links_method(self)));
        methods.funcall_instance_method_with_1_args(self, ON_ADD, subloop_collections.dlc_owner(new_parent_link));
        return new_parent_link;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_unification_robot_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_unification_robot_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, INSTIGATOR_BOUND, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PRECONDITION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, BOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, UNBOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SOLUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SATISFACTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, MIN_SOLUTION_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TARGET_BINDING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PARENT_ROBOT, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_unification_robot_p(SubLObject cyblack_unification_robot) {
        return classes.subloop_instanceof_class(cyblack_unification_robot, CYBLACK_UNIFICATION_ROBOT);
    }

    public static final SubLObject cyblack_unification_robot_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject parent_robot = get_cyblack_unification_robot_parent_robot(self);
            SubLObject target_binding = get_cyblack_unification_robot_target_binding(self);
            SubLObject min_solution_count = get_cyblack_unification_robot_min_solution_count(self);
            SubLObject timeout = get_cyblack_unification_robot_timeout(self);
            SubLObject satisfaction_type = get_cyblack_unification_robot_satisfaction_type(self);
            SubLObject solutions = get_cyblack_unification_robot_solutions(self);
            SubLObject unbound_bindings = get_cyblack_unification_robot_unbound_bindings(self);
            SubLObject bound_bindings = get_cyblack_unification_robot_bound_bindings(self);
            SubLObject precondition = get_cyblack_unification_robot_precondition(self);
            SubLObject cached_dictionary = get_cyblack_unification_robot_cached_dictionary(self);
            SubLObject qua_list_element_parent_links = get_cyblack_unification_robot_qua_list_element_parent_links(self);
            SubLObject instigator_bound = get_cyblack_unification_robot_instigator_bound(self);
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_unification_robot_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_visitor_initialize_method(self);
                    qua_list_element_self_deletion_mode = NIL;
                    qua_list_element_parent_links = NIL;
                    cached_dictionary = NIL;
                    precondition = NIL;
                    bound_bindings = NIL;
                    unbound_bindings = NIL;
                    solutions = object.object_new_method(BASIC_END_POINTER_LIST);
                    satisfaction_type = $ALL;
                    timeout = NIL;
                    min_solution_count = NIL;
                    target_binding = NIL;
                    parent_robot = NIL;
                    instigator_bound = NIL;
                    sublisp_throw($sym79$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_parent_robot(self, parent_robot);
                            set_cyblack_unification_robot_target_binding(self, target_binding);
                            set_cyblack_unification_robot_min_solution_count(self, min_solution_count);
                            set_cyblack_unification_robot_timeout(self, timeout);
                            set_cyblack_unification_robot_satisfaction_type(self, satisfaction_type);
                            set_cyblack_unification_robot_solutions(self, solutions);
                            set_cyblack_unification_robot_unbound_bindings(self, unbound_bindings);
                            set_cyblack_unification_robot_bound_bindings(self, bound_bindings);
                            set_cyblack_unification_robot_precondition(self, precondition);
                            set_cyblack_unification_robot_cached_dictionary(self, cached_dictionary);
                            set_cyblack_unification_robot_qua_list_element_parent_links(self, qua_list_element_parent_links);
                            set_cyblack_unification_robot_instigator_bound(self, instigator_bound);
                            set_cyblack_unification_robot_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym79$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_get_parent_links_method(SubLObject self) {
        {
            SubLObject qua_list_element_parent_links = get_cyblack_unification_robot_qua_list_element_parent_links(self);
            return qua_list_element_parent_links;
        }
    }

    public static final SubLObject cyblack_unification_robot_set_parent_links_method(SubLObject self, SubLObject new_parent_links) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject qua_list_element_parent_links = get_cyblack_unification_robot_qua_list_element_parent_links(self);
            try {
                try {
                    qua_list_element_parent_links = new_parent_links;
                    sublisp_throw($sym90$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, new_parent_links);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_qua_list_element_parent_links(self, qua_list_element_parent_links);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym90$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_get_self_deletion_mode_method(SubLObject self) {
        {
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_unification_robot_qua_list_element_self_deletion_mode(self);
            return qua_list_element_self_deletion_mode;
        }
    }

    public static final SubLObject cyblack_unification_robot_set_self_deletion_mode_method(SubLObject self, SubLObject mode) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject qua_list_element_self_deletion_mode = get_cyblack_unification_robot_qua_list_element_self_deletion_mode(self);
            try {
                try {
                    qua_list_element_self_deletion_mode = mode;
                    sublisp_throw($sym98$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, mode);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_qua_list_element_self_deletion_mode(self, qua_list_element_self_deletion_mode);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym98$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_install_method(SubLObject self, SubLObject new_application) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject cached_blackboard = get_cyblack_unification_robot_cached_blackboard(self);
            SubLObject cached_dictionary = get_cyblack_unification_robot_cached_dictionary(self);
            try {
                try {
                    cyblack_object.cyblack_object_set_application_method(self, new_application);
                    if (NIL != new_application) {
                        cached_dictionary = cyblack_application.cyblack_application_get_datatype_dictionary(new_application);
                        cached_blackboard = cyblack_application.cyblack_application_get_blackboard(new_application);
                    }
                    sublisp_throw($sym103$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_cached_blackboard(self, cached_blackboard);
                            set_cyblack_unification_robot_cached_dictionary(self, cached_dictionary);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym103$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        return object.object_print_method(self, stream, depth);
    }

    public static final SubLObject cyblack_unification_robot_clone_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt112$___CLONE__S_, self);
            }
            {
                SubLObject new_robot = cyblack_posting.cyblack_basic_posting_visitor_clone_method(self);
                cyblack_object.cyblack_object_set_application_method(new_robot, cyblack_object.cyblack_object_get_application_method(self));
                instances.set_slot(new_robot, CACHED_DICTIONARY, cyblack_unification_robot_get_cached_dictionary_method(self));
                instances.set_slot(new_robot, CACHED_BLACKBOARD, cyblack_unification_robot_get_cached_blackboard_method(self));
                instances.set_slot(new_robot, SATISFACTION_TYPE, $ALL);
                instances.set_slot(new_robot, PRECONDITION, cyblack_unification_robot_get_precondition_pattern_method(self));
                instances.set_slot(new_robot, BOUND_BINDINGS, copy_list(cyblack_unification_robot_get_bound_bindings_method(self)));
                instances.set_slot(new_robot, UNBOUND_BINDINGS, copy_list(cyblack_unification_robot_get_unbound_bindings_method(self)));
                instances.set_slot(new_robot, SOLUTIONS, cyblack_unification_robot_get_solutions_method(self));
                instances.set_slot(new_robot, TIMEOUT, get_cyblack_unification_robot_timeout(self));
                instances.set_slot(new_robot, MIN_SOLUTION_COUNT, get_cyblack_unification_robot_min_solution_count(self));
                instances.set_slot(new_robot, TARGET_BINDING, get_cyblack_unification_robot_target_binding(self));
                return new_robot;
            }
        }
    }

    public static final SubLObject cyblack_unification_robot_get_cached_dictionary_method(SubLObject self) {
        {
            SubLObject cached_dictionary = get_cyblack_unification_robot_cached_dictionary(self);
            return cached_dictionary;
        }
    }

    public static final SubLObject cyblack_unification_robot_get_cached_blackboard_method(SubLObject self) {
        {
            SubLObject cached_blackboard = get_cyblack_unification_robot_cached_blackboard(self);
            return cached_blackboard;
        }
    }

    public static final SubLObject cyblack_unification_robot_get_precondition_pattern_method(SubLObject self) {
        {
            SubLObject precondition = get_cyblack_unification_robot_precondition(self);
            return precondition;
        }
    }

    public static final SubLObject cyblack_unification_robot_set_precondition_pattern_method(SubLObject self, SubLObject new_precondition_pattern) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject unbound_bindings = get_cyblack_unification_robot_unbound_bindings(self);
            SubLObject bound_bindings = get_cyblack_unification_robot_bound_bindings(self);
            SubLObject precondition = get_cyblack_unification_robot_precondition(self);
            try {
                try {
                    precondition = new_precondition_pattern;
                    {
                        SubLObject precon_environment = cyblack_precondition_pattern.cyblack_pattern_get_local_bindings(new_precondition_pattern);
                        if (NIL != precon_environment) {
                            unbound_bindings = cyblack_precondition_pattern.cyblack_environment_get_unique_non_apriori_bindings_method(precon_environment, $ADD_POSTING);
                        } else {
                            unbound_bindings = NIL;
                        }
                    }
                    bound_bindings = NIL;
                    sublisp_throw($sym127$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, new_precondition_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_unbound_bindings(self, unbound_bindings);
                            set_cyblack_unification_robot_bound_bindings(self, bound_bindings);
                            set_cyblack_unification_robot_precondition(self, precondition);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym127$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_get_bound_bindings_method(SubLObject self) {
        {
            SubLObject bound_bindings = get_cyblack_unification_robot_bound_bindings(self);
            return bound_bindings;
        }
    }

    public static final SubLObject cyblack_unification_robot_set_bound_bindings_method(SubLObject self, SubLObject new_bindings) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject bound_bindings = get_cyblack_unification_robot_bound_bindings(self);
            try {
                try {
                    bound_bindings = new_bindings;
                    sublisp_throw($sym136$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, new_bindings);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_bound_bindings(self, bound_bindings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym136$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_get_unbound_bindings_method(SubLObject self) {
        {
            SubLObject unbound_bindings = get_cyblack_unification_robot_unbound_bindings(self);
            return unbound_bindings;
        }
    }

    public static final SubLObject cyblack_unification_robot_set_unbound_bindings_method(SubLObject self, SubLObject new_bindings) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject unbound_bindings = get_cyblack_unification_robot_unbound_bindings(self);
            try {
                try {
                    unbound_bindings = new_bindings;
                    sublisp_throw($sym143$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, new_bindings);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_unbound_bindings(self, unbound_bindings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym143$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_get_solutions_method(SubLObject self) {
        {
            SubLObject solutions = get_cyblack_unification_robot_solutions(self);
            return solutions;
        }
    }

    public static final SubLObject cyblack_unification_robot_set_solutions_method(SubLObject self, SubLObject new_binding_lists) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject solutions = get_cyblack_unification_robot_solutions(self);
            try {
                try {
                    solutions = new_binding_lists;
                    sublisp_throw($sym151$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, new_binding_lists);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_solutions(self, solutions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym151$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_get_satisfaction_type_method(SubLObject self) {
        {
            SubLObject satisfaction_type = get_cyblack_unification_robot_satisfaction_type(self);
            return satisfaction_type;
        }
    }

    public static final SubLObject cyblack_unification_robot_set_satisfaction_type_method(SubLObject self, SubLObject new_satisfaction_type) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject satisfaction_type = get_cyblack_unification_robot_satisfaction_type(self);
            try {
                try {
                    satisfaction_type = new_satisfaction_type;
                    sublisp_throw($sym159$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, new_satisfaction_type);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_satisfaction_type(self, satisfaction_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym159$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_satisfied_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject parent_robot = get_cyblack_unification_robot_parent_robot(self);
            SubLObject min_solution_count = get_cyblack_unification_robot_min_solution_count(self);
            SubLObject timeout = get_cyblack_unification_robot_timeout(self);
            SubLObject satisfaction_type = get_cyblack_unification_robot_satisfaction_type(self);
            try {
                try {
                    if ((NIL != parent_robot) && (NIL != cyblack_unification_robot_satisfied_p_method(parent_robot))) {
                        sublisp_throw($sym163$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, T);
                    }
                    {
                        SubLObject local_solutions = cyblack_unification_robot_get_solutions_method(self);
                        SubLObject element_count = subloop_collections.basic_collection_get_element_count_method(local_solutions);
                        SubLObject satisfied = NIL;
                        SubLObject pcase_var = satisfaction_type;
                        if (pcase_var.eql($ANY)) {
                            satisfied = numG(element_count, ZERO_INTEGER);
                        } else
                            if (pcase_var.eql($ALL)) {
                                satisfied = NIL;
                            } else
                                if (pcase_var.eql($AT_LEAST)) {
                                    satisfied = makeBoolean((NIL != min_solution_count) && element_count.numGE(min_solution_count));
                                } else
                                    if (pcase_var.eql($UNTIL_TIMEOUT)) {
                                        satisfied = makeBoolean((NIL != timeout) && get_universal_time().numGE(timeout));
                                    }



                        sublisp_throw($sym163$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, satisfied);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_parent_robot(self, parent_robot);
                            set_cyblack_unification_robot_min_solution_count(self, min_solution_count);
                            set_cyblack_unification_robot_timeout(self, timeout);
                            set_cyblack_unification_robot_satisfaction_type(self, satisfaction_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym163$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_unify_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt170$___UNIFY__S___Entered_, self);
            }
            {
                SubLObject cached_blackboard = get_cyblack_unification_robot_cached_blackboard(self);
                SubLObject unbound_bindings = get_cyblack_unification_robot_unbound_bindings(self);
                if (NIL == unbound_bindings) {
                    {
                        SubLObject precondition_pattern = cyblack_unification_robot_get_precondition_pattern_method(self);
                        SubLObject logical_form = (NIL != precondition_pattern) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_pattern_get_logical_form(precondition_pattern))) : NIL;
                        if (NIL != logical_form) {
                            {
                                SubLObject environment = cyblack_precondition_pattern.cyblack_pattern_get_local_bindings(precondition_pattern);
                                if (NIL != methods.funcall_instance_method_with_1_args(logical_form, GET_VALUE, environment)) {
                                    {
                                        SubLObject solutions = cyblack_unification_robot_get_solutions_method(self);
                                        SubLObject copy_of_environment = (NIL != environment) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_environment_clone_method(environment))) : NIL;
                                        if (NIL != copy_of_environment) {
                                            subloop_collections.basic_end_pointer_list_add_method(solutions, copy_of_environment);
                                        }
                                        if (NIL != cyblack_unification_robot_satisfied_p_method(self)) {
                                            cyblack_posting.set_cyblack_basic_posting_visitor_continue(self, NIL);
                                        }
                                        return NIL;
                                    }
                                }
                            }
                        } else {
                            cyblack_posting.set_cyblack_basic_posting_visitor_continue(self, NIL);
                            return NIL;
                        }
                    }
                    return NIL;
                }
                if (NIL != cyblack_unification_robot_satisfied_p_method(self)) {
                    cyblack_posting.set_cyblack_basic_posting_visitor_continue(self, NIL);
                    return NIL;
                }
                {
                    SubLObject target_binding = unbound_bindings.first();
                    SubLObject datatype = cyblack_precondition_pattern.cyblack_binding_get_type_method(target_binding);
                    SubLObject panel = cyblack_blackboard.cyblack_basic_blackboard_get_panel_method(cached_blackboard, datatype);
                    if (NIL != panel) {
                        set_cyblack_unification_robot_target_binding(self, target_binding);
                        set_cyblack_unification_robot_unbound_bindings(self, unbound_bindings.rest());
                        set_cyblack_unification_robot_bound_bindings(self, cons(target_binding, get_cyblack_unification_robot_bound_bindings(self)));
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_postings(panel, self);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_unification_robot_visit_method(SubLObject self, SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt176$___VISIT__S__S___Unbound_bindings, new SubLObject[]{ self, v_cyblack_posting, get_cyblack_unification_robot_unbound_bindings(self) });
            }
            {
                SubLObject target_binding = get_cyblack_unification_robot_target_binding(self);
                if (NIL != target_binding) {
                    if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                        format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt177$___VISIT__S___Binding__S_to__S_, new SubLObject[]{ self, cyblack_precondition_pattern.cyblack_binding_get_variable_method(target_binding), v_cyblack_posting });
                    }
                    cyblack_precondition_pattern.cyblack_binding_set_value_method(target_binding, v_cyblack_posting);
                    if (NIL == cyblack_posting.cyblack_basic_posting_visitor_continue_p_method(self, UNPROVIDED)) {
                        return NIL;
                    }
                    {
                        SubLObject cloned_robot = cyblack_unification_robot_clone_method(self);
                        cyblack_ur_set_parent_robot(cloned_robot, self);
                        cyblack_ur_unify(cloned_robot);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_unification_robot_get_parent_robot_method(SubLObject self) {
        {
            SubLObject parent_robot = get_cyblack_unification_robot_parent_robot(self);
            return parent_robot;
        }
    }

    public static final SubLObject cyblack_unification_robot_set_parent_robot_method(SubLObject self, SubLObject new_parent_robot) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject parent_robot = get_cyblack_unification_robot_parent_robot(self);
            try {
                try {
                    parent_robot = new_parent_robot;
                    sublisp_throw($sym185$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, new_parent_robot);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_parent_robot(self, parent_robot);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym185$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_get_instigator_bound_method(SubLObject self) {
        {
            SubLObject instigator_bound = get_cyblack_unification_robot_instigator_bound(self);
            return instigator_bound;
        }
    }

    public static final SubLObject cyblack_unification_robot_set_instigator_bound_method(SubLObject self, SubLObject is_bound) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_method = NIL;
            SubLObject instigator_bound = get_cyblack_unification_robot_instigator_bound(self);
            try {
                try {
                    instigator_bound = is_bound;
                    sublisp_throw($sym193$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD, is_bound);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_instigator_bound(self, instigator_bound);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym193$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_instigator_bound_p_method(SubLObject self) {
        {
            SubLObject current_robot = self;
            while (NIL != current_robot) {
                if (NIL != cyblack_ur_get_instigator_bound(current_robot)) {
                    return T;
                }
                current_robot = cyblack_ur_get_parent_robot(current_robot);
            } 
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_unification_robot_satisfied_by_any_solution_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_unification_robot_satisfied_by_any_solution_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, INSTIGATOR_BOUND, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PRECONDITION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, BOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, UNBOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SOLUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SATISFACTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, MIN_SOLUTION_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TARGET_BINDING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PARENT_ROBOT, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_unification_robot_satisfied_by_any_solution_p(SubLObject cyblack_unification_robot_satisfied_by_any_solution) {
        return classes.subloop_instanceof_class(cyblack_unification_robot_satisfied_by_any_solution, CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
    }

    public static final SubLObject cyblack_unification_robot_satisfied_by_any_solution_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_satisfied_by_any_solution_method = NIL;
            SubLObject satisfaction_type = get_cyblack_unification_robot_satisfaction_type(self);
            try {
                try {
                    cyblack_unification_robot_initialize_method(self);
                    satisfaction_type = $ANY;
                    sublisp_throw($sym203$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTI, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_satisfaction_type(self, satisfaction_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_satisfied_by_any_solution_method = Errors.handleThrowable(ccatch_env_var, $sym203$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTI);
            }
            return catch_var_for_cyblack_unification_robot_satisfied_by_any_solution_method;
        }
    }

    public static final SubLObject get_cyblack_constrained_unification_robot_the_posting(SubLObject cyblack_constrained_unification_robot) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_constrained_unification_robot, SIXTEEN_INTEGER, THE_POSTING);
    }

    public static final SubLObject set_cyblack_constrained_unification_robot_the_posting(SubLObject cyblack_constrained_unification_robot, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_constrained_unification_robot, value, SIXTEEN_INTEGER, THE_POSTING);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_constrained_unification_robot_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_constrained_unification_robot_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, INSTIGATOR_BOUND, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PRECONDITION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, BOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, UNBOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SOLUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SATISFACTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, MIN_SOLUTION_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TARGET_BINDING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PARENT_ROBOT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, THE_POSTING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_constrained_unification_robot_p(SubLObject cyblack_constrained_unification_robot) {
        return classes.subloop_instanceof_class(cyblack_constrained_unification_robot, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT);
    }

    public static final SubLObject cyblack_constrained_unification_robot_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_constrained_unification_robot_method = NIL;
            SubLObject the_posting = get_cyblack_constrained_unification_robot_the_posting(self);
            try {
                try {
                    cyblack_unification_robot_initialize_method(self);
                    the_posting = NIL;
                    sublisp_throw($sym211$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_constrained_unification_robot_the_posting(self, the_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_constrained_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym211$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_constrained_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_constrained_unification_robot_clone_method(SubLObject self) {
        {
            SubLObject cloned_self = cyblack_unification_robot_clone_method(self);
            cyblack_constrained_unification_robot_set_the_posting_method(cloned_self, cyblack_constrained_unification_robot_get_the_posting_method(self));
            return cloned_self;
        }
    }

    public static final SubLObject cyblack_constrained_unification_robot_get_the_posting_method(SubLObject self) {
        {
            SubLObject the_posting = get_cyblack_constrained_unification_robot_the_posting(self);
            return the_posting;
        }
    }

    public static final SubLObject cyblack_constrained_unification_robot_set_the_posting_method(SubLObject self, SubLObject new_posting) {
        {
            SubLObject catch_var_for_cyblack_constrained_unification_robot_method = NIL;
            SubLObject the_posting = get_cyblack_constrained_unification_robot_the_posting(self);
            try {
                try {
                    the_posting = new_posting;
                    sublisp_throw($sym221$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_METHOD, new_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_constrained_unification_robot_the_posting(self, the_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_constrained_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym221$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_constrained_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_constrained_unification_robot_find_the_posting_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_constrained_unification_robot_method = NIL;
            SubLObject the_posting = get_cyblack_constrained_unification_robot_the_posting(self);
            SubLObject precondition = get_cyblack_unification_robot_precondition(self);
            try {
                try {
                    if (NIL != the_posting) {
                        sublisp_throw($sym225$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_METHOD, the_posting);
                    }
                    if (NIL != precondition) {
                        {
                            SubLObject environment = cyblack_precondition_pattern.cyblack_pattern_get_environment(precondition);
                            if (NIL != environment) {
                                {
                                    SubLObject value = cyblack_precondition_pattern.cyblack_environment_get_method(environment, $sym226$_THE_POSTING, UNPROVIDED);
                                    if ((NIL != value) && (NIL == cyblack_precondition_pattern.cyblack_unbound_value_p(value))) {
                                        the_posting = value;
                                        sublisp_throw($sym225$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_METHOD, value);
                                    }
                                }
                            }
                        }
                    }
                    sublisp_throw($sym225$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_constrained_unification_robot_the_posting(self, the_posting);
                            set_cyblack_unification_robot_precondition(self, precondition);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_constrained_unification_robot_method = Errors.handleThrowable(ccatch_env_var, $sym225$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_METHOD);
            }
            return catch_var_for_cyblack_constrained_unification_robot_method;
        }
    }

    public static final SubLObject cyblack_constrained_unification_robot_unify_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt170$___UNIFY__S___Entered_, self);
            }
            {
                SubLObject cached_blackboard = get_cyblack_unification_robot_cached_blackboard(self);
                SubLObject unbound_bindings = get_cyblack_unification_robot_unbound_bindings(self);
                SubLObject target_posting = cyblack_constrained_unification_robot_find_the_posting_method(self);
                SubLObject target_posting_type = (NIL != target_posting) ? ((SubLObject) (cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(target_posting))) : NIL;
                if (NIL == unbound_bindings) {
                    {
                        SubLObject precondition_pattern = cyblack_unification_robot_get_precondition_pattern_method(self);
                        SubLObject logical_form = (NIL != precondition_pattern) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_pattern_get_logical_form(precondition_pattern))) : NIL;
                        if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                            format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt229$___UNIFY__S___precondition_patter, new SubLObject[]{ self, precondition_pattern, logical_form });
                        }
                        if (NIL != logical_form) {
                            {
                                SubLObject environment = cyblack_precondition_pattern.cyblack_pattern_get_local_bindings(precondition_pattern);
                                if (NIL != methods.funcall_instance_method_with_1_args(logical_form, GET_VALUE, environment)) {
                                    {
                                        SubLObject solutions = cyblack_unification_robot_get_solutions_method(self);
                                        SubLObject copy_of_environment = (NIL != environment) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_environment_clone_method(environment))) : NIL;
                                        if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                                            format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt230$___UNIFY__S___solutions_____S_, self, solutions);
                                        }
                                        if (NIL != copy_of_environment) {
                                            subloop_collections.basic_end_pointer_list_add_method(solutions, copy_of_environment);
                                        }
                                        if (NIL != cyblack_unification_robot_satisfied_p_method(self)) {
                                            cyblack_posting.set_cyblack_basic_posting_visitor_continue(self, NIL);
                                        }
                                        return NIL;
                                    }
                                }
                            }
                        } else {
                            cyblack_posting.set_cyblack_basic_posting_visitor_continue(self, NIL);
                            return NIL;
                        }
                    }
                    return NIL;
                }
                if (NIL != cyblack_unification_robot_satisfied_p_method(self)) {
                    cyblack_posting.set_cyblack_basic_posting_visitor_continue(self, NIL);
                    return NIL;
                }
                {
                    SubLObject target_binding = unbound_bindings.first();
                    SubLObject datatype = cyblack_precondition_pattern.cyblack_binding_get_type_method(target_binding);
                    SubLObject panel = (NIL != datatype) ? ((SubLObject) (cyblack_blackboard.cyblack_basic_blackboard_get_panel_method(cached_blackboard, datatype))) : NIL;
                    if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                        format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt231$___UNIFY__S___Found_panel__S_asso, new SubLObject[]{ self, panel, datatype });
                    }
                    if (NIL != panel) {
                        if (NIL != cyblack_unification_robot_instigator_bound_p_method(self)) {
                            set_cyblack_unification_robot_target_binding(self, target_binding);
                            set_cyblack_unification_robot_unbound_bindings(self, unbound_bindings.rest());
                            set_cyblack_unification_robot_bound_bindings(self, cons(target_binding, get_cyblack_unification_robot_bound_bindings(self)));
                            cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_postings(panel, self);
                        } else
                            if ((NIL != target_posting_type) && (NIL != cyblack_datatype.cyblack_datatype_subtype_p(datatype, target_posting_type))) {
                                cyblack_unification_robot_set_instigator_bound_method(self, T);
                                cyblack_precondition_pattern.cyblack_binding_set_value_method(target_binding, target_posting);
                                cyblack_unification_robot_set_unbound_bindings_method(self, unbound_bindings.rest());
                                cyblack_constrained_unification_robot_unify_method(self);
                                cyblack_unification_robot_set_instigator_bound_method(self, NIL);
                                if (NIL != cyblack_precondition_pattern.cyblack_type_mentioned_in_bindings_p(unbound_bindings.rest(), target_posting_type)) {
                                    cyblack_unification_robot_set_unbound_bindings_method(self, unbound_bindings);
                                    set_cyblack_unification_robot_target_binding(self, target_binding);
                                    set_cyblack_unification_robot_unbound_bindings(self, unbound_bindings.rest());
                                    set_cyblack_unification_robot_bound_bindings(self, cons(target_binding, get_cyblack_unification_robot_bound_bindings(self)));
                                    cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_postings(panel, self);
                                }
                            } else {
                                set_cyblack_unification_robot_target_binding(self, target_binding);
                                set_cyblack_unification_robot_unbound_bindings(self, unbound_bindings.rest());
                                set_cyblack_unification_robot_bound_bindings(self, cons(target_binding, get_cyblack_unification_robot_bound_bindings(self)));
                                cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_postings(panel, self);
                            }

                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_constrained_unification_robot_visit_method(SubLObject self, SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt176$___VISIT__S__S___Unbound_bindings, new SubLObject[]{ self, v_cyblack_posting, get_cyblack_unification_robot_unbound_bindings(self) });
            }
            {
                SubLObject target_binding = get_cyblack_unification_robot_target_binding(self);
                if (NIL != target_binding) {
                    if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                        format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt177$___VISIT__S___Binding__S_to__S_, new SubLObject[]{ self, cyblack_precondition_pattern.cyblack_binding_get_variable_method(target_binding), v_cyblack_posting });
                    }
                    cyblack_precondition_pattern.cyblack_binding_set_value_method(target_binding, v_cyblack_posting);
                    {
                        SubLObject cloned_robot = cyblack_constrained_unification_robot_clone_method(self);
                        cyblack_unification_robot_set_parent_robot_method(cloned_robot, self);
                        cyblack_constrained_unification_robot_unify_method(cloned_robot);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_constrained_unification_robot_satisfied_by_any_solution_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_constrained_unification_robot_satisfied_by_any_solution_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, INSTIGATOR_BOUND, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PRECONDITION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, BOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, UNBOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SOLUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SATISFACTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, MIN_SOLUTION_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TARGET_BINDING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PARENT_ROBOT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, THE_POSTING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_constrained_unification_robot_satisfied_by_any_solution_p(SubLObject cyblack_constrained_unification_robot_satisfied_by_any_solution) {
        return classes.subloop_instanceof_class(cyblack_constrained_unification_robot_satisfied_by_any_solution, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
    }

    public static final SubLObject cyblack_constrained_unification_robot_satisfied_by_any_solution_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_constrained_unification_robot_satisfied_by_any_solution_method = NIL;
            SubLObject satisfaction_type = get_cyblack_unification_robot_satisfaction_type(self);
            try {
                try {
                    cyblack_constrained_unification_robot_initialize_method(self);
                    satisfaction_type = $ANY;
                    sublisp_throw($sym238$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_B, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_satisfaction_type(self, satisfaction_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_constrained_unification_robot_satisfied_by_any_solution_method = Errors.handleThrowable(ccatch_env_var, $sym238$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_B);
            }
            return catch_var_for_cyblack_constrained_unification_robot_satisfied_by_any_solution_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_monitoring_unification_robot_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_monitoring_unification_robot_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, INSTIGATOR_BOUND, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PRECONDITION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, BOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, UNBOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SOLUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SATISFACTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, MIN_SOLUTION_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TARGET_BINDING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PARENT_ROBOT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, THE_POSTING, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_monitoring_unification_robot_p(SubLObject cyblack_monitoring_unification_robot) {
        return classes.subloop_instanceof_class(cyblack_monitoring_unification_robot, CYBLACK_MONITORING_UNIFICATION_ROBOT);
    }

    public static final SubLObject cyblack_monitoring_unification_robot_initialize_method(SubLObject self) {
        cyblack_constrained_unification_robot_satisfied_by_any_solution_initialize_method(self);
        return self;
    }

    public static final SubLObject cyblack_monitoring_unification_robot_get_precondition_pattern_method(SubLObject self) {
        {
            SubLObject precondition = get_cyblack_unification_robot_precondition(self);
            return precondition;
        }
    }

    public static final SubLObject cyblack_monitoring_unification_robot_set_precondition_pattern_method(SubLObject self, SubLObject new_precondition_pattern) {
        return cyblack_unification_robot_set_precondition_pattern_method(self, new_precondition_pattern);
    }

    public static final SubLObject cyblack_monitoring_unification_robot_get_monitoring_pattern_method(SubLObject self) {
        {
            SubLObject precondition = get_cyblack_unification_robot_precondition(self);
            return precondition;
        }
    }

    public static final SubLObject cyblack_monitoring_unification_robot_set_monitoring_pattern_method(SubLObject self, SubLObject new_monitoring_pattern) {
        return cyblack_unification_robot_set_precondition_pattern_method(self, new_monitoring_pattern);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_unification_robot_for_goal_satisfaction_daemons_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_unification_robot_for_goal_satisfaction_daemons_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, INSTIGATOR_BOUND, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, QUA_LIST_ELEMENT_PARENT_LINKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, CACHED_BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PRECONDITION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, BOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, UNBOUND_BINDINGS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SOLUTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, SATISFACTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, MIN_SOLUTION_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, TARGET_BINDING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIFICATION_ROBOT, PARENT_ROBOT, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_unification_robot_for_goal_satisfaction_daemons_p(SubLObject cyblack_unification_robot_for_goal_satisfaction_daemons) {
        return classes.subloop_instanceof_class(cyblack_unification_robot_for_goal_satisfaction_daemons, CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS);
    }

    public static final SubLObject cyblack_unification_robot_for_goal_satisfaction_daemons_set_precondition_pattern_method(SubLObject self, SubLObject new_precondition_pattern) {
        {
            SubLObject catch_var_for_cyblack_unification_robot_for_goal_satisfaction_daemons_method = NIL;
            SubLObject unbound_bindings = get_cyblack_unification_robot_unbound_bindings(self);
            SubLObject bound_bindings = get_cyblack_unification_robot_bound_bindings(self);
            SubLObject precondition = get_cyblack_unification_robot_precondition(self);
            try {
                try {
                    precondition = new_precondition_pattern;
                    {
                        SubLObject precon_environment = cyblack_precondition_pattern.cyblack_satisfaction_expression_get_local_bindings_method(new_precondition_pattern);
                        if (NIL != precon_environment) {
                            unbound_bindings = cyblack_precondition_pattern.cyblack_environment_get_unique_non_apriori_bindings_method(precon_environment, $ADD_POSTING);
                        } else {
                            unbound_bindings = NIL;
                        }
                    }
                    bound_bindings = NIL;
                    sublisp_throw($sym260$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_D, new_precondition_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_unification_robot_unbound_bindings(self, unbound_bindings);
                            set_cyblack_unification_robot_bound_bindings(self, bound_bindings);
                            set_cyblack_unification_robot_precondition(self, precondition);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_unification_robot_for_goal_satisfaction_daemons_method = Errors.handleThrowable(ccatch_env_var, $sym260$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_D);
            }
            return catch_var_for_cyblack_unification_robot_for_goal_satisfaction_daemons_method;
        }
    }

    public static final SubLObject cyblack_unification_robot_for_goal_satisfaction_daemons_unify_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_unification_robot_for_goal_satisfaction_daemons_method = NIL;
                SubLObject target_binding = get_cyblack_unification_robot_target_binding(self);
                SubLObject solutions = get_cyblack_unification_robot_solutions(self);
                SubLObject unbound_bindings = get_cyblack_unification_robot_unbound_bindings(self);
                SubLObject cached_blackboard = get_cyblack_unification_robot_cached_blackboard(self);
                SubLObject v_continue = cyblack_posting.get_cyblack_basic_posting_visitor_continue(self);
                try {
                    try {
                        {
                            SubLObject cached_blackboard_1 = get_cyblack_unification_robot_cached_blackboard(self);
                            SubLObject unbound_bindings_2 = get_cyblack_unification_robot_unbound_bindings(self);
                            if (NIL == unbound_bindings_2) {
                                {
                                    SubLObject precondition_pattern = cyblack_unification_robot_get_precondition_pattern_method(self);
                                    SubLObject logical_form = (NIL != precondition_pattern) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_satisfaction_expression_get_logical_expression_method(precondition_pattern))) : NIL;
                                    if (NIL != logical_form) {
                                        {
                                            SubLObject environment = cyblack_precondition_pattern.cyblack_satisfaction_expression_get_local_bindings_method(precondition_pattern);
                                            if (NIL != methods.funcall_instance_method_with_1_args(logical_form, GET_VALUE, environment)) {
                                                {
                                                    SubLObject solutions_3 = cyblack_unification_robot_get_solutions_method(self);
                                                    SubLObject copy_of_environment = (NIL != environment) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_environment_clone_method(environment))) : NIL;
                                                    if (NIL != copy_of_environment) {
                                                        subloop_collections.basic_end_pointer_list_add_method(solutions_3, copy_of_environment);
                                                    }
                                                    if (NIL != cyblack_unification_robot_satisfied_p_method(self)) {
                                                        cyblack_posting.set_cyblack_basic_posting_visitor_continue(self, NIL);
                                                    }
                                                    sublisp_throw($sym263$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_D, NIL);
                                                }
                                            }
                                        }
                                    } else {
                                        cyblack_posting.set_cyblack_basic_posting_visitor_continue(self, NIL);
                                        sublisp_throw($sym263$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_D, NIL);
                                    }
                                }
                                sublisp_throw($sym263$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_D, NIL);
                            }
                            if (NIL != cyblack_unification_robot_satisfied_p_method(self)) {
                                cyblack_posting.set_cyblack_basic_posting_visitor_continue(self, NIL);
                                sublisp_throw($sym263$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_D, NIL);
                            }
                            {
                                SubLObject target_binding_4 = unbound_bindings_2.first();
                                SubLObject target_binding_value = cyblack_precondition_pattern.cyblack_binding_get_value_method(target_binding_4);
                                SubLObject datatype = cyblack_precondition_pattern.cyblack_binding_get_type_method(target_binding_4);
                                SubLObject panel = (NIL != datatype) ? ((SubLObject) (cyblack_blackboard.cyblack_basic_blackboard_get_panel_method(cached_blackboard_1, datatype))) : NIL != cyblack_posting.cyblack_posting_p(target_binding_value) ? ((SubLObject) (cyblack_blackboard.cyblack_basic_blackboard_get_panel_method(cached_blackboard_1, cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(target_binding_value)))) : NIL;
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == panel) {
                                        Errors.error($str_alt264$_Target_binding__S_has_datatype__, target_binding_4, datatype);
                                    }
                                }
                                if (NIL != panel) {
                                    set_cyblack_unification_robot_target_binding(self, target_binding_4);
                                    set_cyblack_unification_robot_unbound_bindings(self, unbound_bindings_2.rest());
                                    set_cyblack_unification_robot_bound_bindings(self, cons(target_binding_4, get_cyblack_unification_robot_bound_bindings(self)));
                                    cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_postings(panel, self);
                                }
                            }
                            sublisp_throw($sym263$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_D, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_unification_robot_target_binding(self, target_binding);
                                set_cyblack_unification_robot_solutions(self, solutions);
                                set_cyblack_unification_robot_unbound_bindings(self, unbound_bindings);
                                set_cyblack_unification_robot_cached_blackboard(self, cached_blackboard);
                                cyblack_posting.set_cyblack_basic_posting_visitor_continue(self, v_continue);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_unification_robot_for_goal_satisfaction_daemons_method = Errors.handleThrowable(ccatch_env_var, $sym263$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_D);
                }
                return catch_var_for_cyblack_unification_robot_for_goal_satisfaction_daemons_method;
            }
        }
    }

    public static final SubLObject cyblack_ur_clone(SubLObject cyblack_unification_robot) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt266$CYBLACK_UR_CLONE___S_is_not_an_in, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_monitoring_unification_robot_p(cyblack_unification_robot)) {
                return cyblack_constrained_unification_robot_clone_method(cyblack_unification_robot);
            } else
                if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                    return cyblack_constrained_unification_robot_clone_method(cyblack_unification_robot);
                } else
                    if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                        return cyblack_unification_robot_clone_method(cyblack_unification_robot);
                    } else {
                        return methods.funcall_instance_method_with_0_args(cyblack_unification_robot, CLONE);
                    }


        }
    }

    public static final SubLObject cyblack_ur_install(SubLObject cyblack_unification_robot, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt267$CYBLACK_UR_INSTALL___S_is_not_an_, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_monitoring_unification_robot_p(cyblack_unification_robot)) {
                return cyblack_unification_robot_install_method(cyblack_unification_robot, new_application);
            } else
                if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                    return cyblack_unification_robot_install_method(cyblack_unification_robot, new_application);
                } else
                    if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                        return cyblack_unification_robot_install_method(cyblack_unification_robot, new_application);
                    } else {
                        return methods.funcall_instance_method_with_1_args(cyblack_unification_robot, INSTALL, new_application);
                    }


        }
    }

    public static final SubLObject cyblack_ur_get_parent_robot(SubLObject cyblack_unification_robot) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt268$CYBLACK_UR_GET_PARENT_ROBOT___S_i, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_monitoring_unification_robot_p(cyblack_unification_robot)) {
                return cyblack_unification_robot_get_parent_robot_method(cyblack_unification_robot);
            } else
                if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                    return cyblack_unification_robot_get_parent_robot_method(cyblack_unification_robot);
                } else
                    if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                        return cyblack_unification_robot_get_parent_robot_method(cyblack_unification_robot);
                    } else {
                        return methods.funcall_instance_method_with_0_args(cyblack_unification_robot, GET_PARENT_ROBOT);
                    }


        }
    }

    public static final SubLObject cyblack_ur_set_parent_robot(SubLObject cyblack_unification_robot, SubLObject new_parent_robot) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt269$CYBLACK_UR_SET_PARENT_ROBOT___S_i, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_monitoring_unification_robot_p(cyblack_unification_robot)) {
                return cyblack_unification_robot_set_parent_robot_method(cyblack_unification_robot, new_parent_robot);
            } else
                if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                    return cyblack_unification_robot_set_parent_robot_method(cyblack_unification_robot, new_parent_robot);
                } else
                    if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                        return cyblack_unification_robot_set_parent_robot_method(cyblack_unification_robot, new_parent_robot);
                    } else {
                        return methods.funcall_instance_method_with_1_args(cyblack_unification_robot, SET_PARENT_ROBOT, new_parent_robot);
                    }


        }
    }

    public static final SubLObject cyblack_ur_get_precondition_pattern(SubLObject cyblack_unification_robot) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt270$CYBLACK_UR_GET_PRECONDITION_PATTE, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_monitoring_unification_robot_p(cyblack_unification_robot)) {
                return cyblack_monitoring_unification_robot_get_precondition_pattern_method(cyblack_unification_robot);
            } else
                if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                    return cyblack_unification_robot_get_precondition_pattern_method(cyblack_unification_robot);
                } else
                    if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                        return cyblack_unification_robot_get_precondition_pattern_method(cyblack_unification_robot);
                    } else {
                        return methods.funcall_instance_method_with_0_args(cyblack_unification_robot, GET_PRECONDITION_PATTERN);
                    }


        }
    }

    public static final SubLObject cyblack_ur_set_precondition_pattern(SubLObject cyblack_unification_robot, SubLObject new_precondition_pattern) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt271$CYBLACK_UR_SET_PRECONDITION_PATTE, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_unification_robot_for_goal_satisfaction_daemons_p(cyblack_unification_robot)) {
                return cyblack_unification_robot_for_goal_satisfaction_daemons_set_precondition_pattern_method(cyblack_unification_robot, new_precondition_pattern);
            } else
                if (NIL != cyblack_monitoring_unification_robot_p(cyblack_unification_robot)) {
                    return cyblack_monitoring_unification_robot_set_precondition_pattern_method(cyblack_unification_robot, new_precondition_pattern);
                } else
                    if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                        return cyblack_unification_robot_set_precondition_pattern_method(cyblack_unification_robot, new_precondition_pattern);
                    } else
                        if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                            return cyblack_unification_robot_set_precondition_pattern_method(cyblack_unification_robot, new_precondition_pattern);
                        } else {
                            return methods.funcall_instance_method_with_1_args(cyblack_unification_robot, SET_PRECONDITION_PATTERN, new_precondition_pattern);
                        }



        }
    }

    public static final SubLObject cyblack_ur_get_solutions(SubLObject cyblack_unification_robot) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt272$CYBLACK_UR_GET_SOLUTIONS___S_is_n, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_monitoring_unification_robot_p(cyblack_unification_robot)) {
                return cyblack_unification_robot_get_solutions_method(cyblack_unification_robot);
            } else
                if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                    return cyblack_unification_robot_get_solutions_method(cyblack_unification_robot);
                } else
                    if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                        return cyblack_unification_robot_get_solutions_method(cyblack_unification_robot);
                    } else {
                        return methods.funcall_instance_method_with_0_args(cyblack_unification_robot, GET_SOLUTIONS);
                    }


        }
    }

    public static final SubLObject cyblack_ur_set_solutions(SubLObject cyblack_unification_robot, SubLObject new_binding_lists) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt273$CYBLACK_UR_SET_SOLUTIONS___S_is_n, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_monitoring_unification_robot_p(cyblack_unification_robot)) {
                return cyblack_unification_robot_set_solutions_method(cyblack_unification_robot, new_binding_lists);
            } else
                if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                    return cyblack_unification_robot_set_solutions_method(cyblack_unification_robot, new_binding_lists);
                } else
                    if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                        return cyblack_unification_robot_set_solutions_method(cyblack_unification_robot, new_binding_lists);
                    } else {
                        return methods.funcall_instance_method_with_1_args(cyblack_unification_robot, SET_SOLUTIONS, new_binding_lists);
                    }


        }
    }

    public static final SubLObject cyblack_ur_get_instigator_bound(SubLObject cyblack_unification_robot) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt274$CYBLACK_UR_GET_INSTIGATOR_BOUND__, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_monitoring_unification_robot_p(cyblack_unification_robot)) {
                return cyblack_unification_robot_get_instigator_bound_method(cyblack_unification_robot);
            } else
                if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                    return cyblack_unification_robot_get_instigator_bound_method(cyblack_unification_robot);
                } else
                    if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                        return cyblack_unification_robot_get_instigator_bound_method(cyblack_unification_robot);
                    } else {
                        return methods.funcall_instance_method_with_0_args(cyblack_unification_robot, GET_INSTIGATOR_BOUND);
                    }


        }
    }

    public static final SubLObject cyblack_ur_set_instigator_bound(SubLObject cyblack_unification_robot, SubLObject is_bound) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt275$CYBLACK_UR_SET_INSTIGATOR_BOUND__, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_monitoring_unification_robot_p(cyblack_unification_robot)) {
                return cyblack_unification_robot_set_instigator_bound_method(cyblack_unification_robot, is_bound);
            } else
                if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                    return cyblack_unification_robot_set_instigator_bound_method(cyblack_unification_robot, is_bound);
                } else
                    if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                        return cyblack_unification_robot_set_instigator_bound_method(cyblack_unification_robot, is_bound);
                    } else {
                        return methods.funcall_instance_method_with_1_args(cyblack_unification_robot, SET_INSTIGATOR_BOUND, is_bound);
                    }


        }
    }

    public static final SubLObject cyblack_ur_unify(SubLObject cyblack_unification_robot) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt276$CYBLACK_UR_UNIFY___S_is_not_an_in, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_unification_robot_for_goal_satisfaction_daemons_p(cyblack_unification_robot)) {
                return cyblack_unification_robot_for_goal_satisfaction_daemons_unify_method(cyblack_unification_robot);
            } else
                if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                    return cyblack_constrained_unification_robot_unify_method(cyblack_unification_robot);
                } else
                    if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                        return cyblack_unification_robot_unify_method(cyblack_unification_robot);
                    } else {
                        return methods.funcall_instance_method_with_0_args(cyblack_unification_robot, UNIFY);
                    }


        }
    }

    public static final SubLObject cyblack_ur_verify(SubLObject cyblack_unification_robot, SubLObject v_cyblack_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_unification_robot_p(cyblack_unification_robot)) {
                    Errors.error($str_alt277$CYBLACK_UR_VERIFY___S_is_not_an_i, cyblack_unification_robot);
                }
            }
            if (NIL != cyblack_monitoring_unification_robot_p(cyblack_unification_robot)) {
                return methods.funcall_instance_method_with_1_args(cyblack_unification_robot, VERIFY, v_cyblack_posting);
            } else
                if (NIL != cyblack_constrained_unification_robot_p(cyblack_unification_robot)) {
                    return methods.funcall_instance_method_with_1_args(cyblack_unification_robot, VERIFY, v_cyblack_posting);
                } else
                    if (NIL != cyblack_unification_robot_p(cyblack_unification_robot)) {
                        return methods.funcall_instance_method_with_1_args(cyblack_unification_robot, VERIFY, v_cyblack_posting);
                    } else {
                        return methods.funcall_instance_method_with_1_args(cyblack_unification_robot, VERIFY, v_cyblack_posting);
                    }


        }
    }

    public static final SubLObject declare_cyblack_unification_file() {
        declareFunction("valid_cyblack_unification_satisfaction_types", "VALID-CYBLACK-UNIFICATION-SATISFACTION-TYPES", 0, 0, false);
        declareFunction("cyblack_unification_satisfaction_type_p", "CYBLACK-UNIFICATION-SATISFACTION-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_unification_satisfaction_type", "ENCODE-CYBLACK-UNIFICATION-SATISFACTION-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_unification_satisfaction_type", "DECODE-CYBLACK-UNIFICATION-SATISFACTION-TYPE", 1, 0, false);
        declareFunction("cyblack_unification_satisfaction_type_less_p", "CYBLACK-UNIFICATION-SATISFACTION-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_unification_satisfaction_type_greater_p", "CYBLACK-UNIFICATION-SATISFACTION-TYPE-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_parent_robot", "GET-CYBLACK-UNIFICATION-ROBOT-PARENT-ROBOT", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_parent_robot", "SET-CYBLACK-UNIFICATION-ROBOT-PARENT-ROBOT", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_target_binding", "GET-CYBLACK-UNIFICATION-ROBOT-TARGET-BINDING", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_target_binding", "SET-CYBLACK-UNIFICATION-ROBOT-TARGET-BINDING", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_min_solution_count", "GET-CYBLACK-UNIFICATION-ROBOT-MIN-SOLUTION-COUNT", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_min_solution_count", "SET-CYBLACK-UNIFICATION-ROBOT-MIN-SOLUTION-COUNT", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_timeout", "GET-CYBLACK-UNIFICATION-ROBOT-TIMEOUT", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_timeout", "SET-CYBLACK-UNIFICATION-ROBOT-TIMEOUT", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_satisfaction_type", "GET-CYBLACK-UNIFICATION-ROBOT-SATISFACTION-TYPE", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_satisfaction_type", "SET-CYBLACK-UNIFICATION-ROBOT-SATISFACTION-TYPE", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_solutions", "GET-CYBLACK-UNIFICATION-ROBOT-SOLUTIONS", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_solutions", "SET-CYBLACK-UNIFICATION-ROBOT-SOLUTIONS", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_unbound_bindings", "GET-CYBLACK-UNIFICATION-ROBOT-UNBOUND-BINDINGS", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_unbound_bindings", "SET-CYBLACK-UNIFICATION-ROBOT-UNBOUND-BINDINGS", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_bound_bindings", "GET-CYBLACK-UNIFICATION-ROBOT-BOUND-BINDINGS", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_bound_bindings", "SET-CYBLACK-UNIFICATION-ROBOT-BOUND-BINDINGS", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_precondition", "GET-CYBLACK-UNIFICATION-ROBOT-PRECONDITION", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_precondition", "SET-CYBLACK-UNIFICATION-ROBOT-PRECONDITION", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_cached_blackboard", "GET-CYBLACK-UNIFICATION-ROBOT-CACHED-BLACKBOARD", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_cached_blackboard", "SET-CYBLACK-UNIFICATION-ROBOT-CACHED-BLACKBOARD", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_cached_dictionary", "GET-CYBLACK-UNIFICATION-ROBOT-CACHED-DICTIONARY", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_cached_dictionary", "SET-CYBLACK-UNIFICATION-ROBOT-CACHED-DICTIONARY", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_qua_list_element_parent_links", "GET-CYBLACK-UNIFICATION-ROBOT-QUA-LIST-ELEMENT-PARENT-LINKS", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_qua_list_element_parent_links", "SET-CYBLACK-UNIFICATION-ROBOT-QUA-LIST-ELEMENT-PARENT-LINKS", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_instigator_bound", "GET-CYBLACK-UNIFICATION-ROBOT-INSTIGATOR-BOUND", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_instigator_bound", "SET-CYBLACK-UNIFICATION-ROBOT-INSTIGATOR-BOUND", 2, 0, false);
        declareFunction("get_cyblack_unification_robot_qua_list_element_self_deletion_mode", "GET-CYBLACK-UNIFICATION-ROBOT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 1, 0, false);
        declareFunction("set_cyblack_unification_robot_qua_list_element_self_deletion_mode", "SET-CYBLACK-UNIFICATION-ROBOT-QUA-LIST-ELEMENT-SELF-DELETION-MODE", 2, 0, false);
        declareFunction("cyblack_unification_robot_perform_action_method", "CYBLACK-UNIFICATION-ROBOT-PERFORM-ACTION-METHOD", 3, 0, false);
        declareFunction("cyblack_unification_robot_on_delete_method", "CYBLACK-UNIFICATION-ROBOT-ON-DELETE-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_on_add_method", "CYBLACK-UNIFICATION-ROBOT-ON-ADD-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_get_collections_method", "CYBLACK-UNIFICATION-ROBOT-GET-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_member_p_method", "CYBLACK-UNIFICATION-ROBOT-MEMBER-P-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_transfer_self_method", "CYBLACK-UNIFICATION-ROBOT-TRANSFER-SELF-METHOD", 3, 0, false);
        declareFunction("cyblack_unification_robot_delete_self_from_all_collections_method", "CYBLACK-UNIFICATION-ROBOT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_delete_self_from_collection_method", "CYBLACK-UNIFICATION-ROBOT-DELETE-SELF-FROM-COLLECTION-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_delete_parent_link_method", "CYBLACK-UNIFICATION-ROBOT-DELETE-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_add_parent_link_method", "CYBLACK-UNIFICATION-ROBOT-ADD-PARENT-LINK-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_unification_robot_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_unification_robot_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_unification_robot_p", "CYBLACK-UNIFICATION-ROBOT-P", 1, 0, false);
        declareFunction("cyblack_unification_robot_initialize_method", "CYBLACK-UNIFICATION-ROBOT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_get_parent_links_method", "CYBLACK-UNIFICATION-ROBOT-GET-PARENT-LINKS-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_set_parent_links_method", "CYBLACK-UNIFICATION-ROBOT-SET-PARENT-LINKS-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_get_self_deletion_mode_method", "CYBLACK-UNIFICATION-ROBOT-GET-SELF-DELETION-MODE-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_set_self_deletion_mode_method", "CYBLACK-UNIFICATION-ROBOT-SET-SELF-DELETION-MODE-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_install_method", "CYBLACK-UNIFICATION-ROBOT-INSTALL-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_print_method", "CYBLACK-UNIFICATION-ROBOT-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_unification_robot_clone_method", "CYBLACK-UNIFICATION-ROBOT-CLONE-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_get_cached_dictionary_method", "CYBLACK-UNIFICATION-ROBOT-GET-CACHED-DICTIONARY-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_get_cached_blackboard_method", "CYBLACK-UNIFICATION-ROBOT-GET-CACHED-BLACKBOARD-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_get_precondition_pattern_method", "CYBLACK-UNIFICATION-ROBOT-GET-PRECONDITION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_set_precondition_pattern_method", "CYBLACK-UNIFICATION-ROBOT-SET-PRECONDITION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_get_bound_bindings_method", "CYBLACK-UNIFICATION-ROBOT-GET-BOUND-BINDINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_set_bound_bindings_method", "CYBLACK-UNIFICATION-ROBOT-SET-BOUND-BINDINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_get_unbound_bindings_method", "CYBLACK-UNIFICATION-ROBOT-GET-UNBOUND-BINDINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_set_unbound_bindings_method", "CYBLACK-UNIFICATION-ROBOT-SET-UNBOUND-BINDINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_get_solutions_method", "CYBLACK-UNIFICATION-ROBOT-GET-SOLUTIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_set_solutions_method", "CYBLACK-UNIFICATION-ROBOT-SET-SOLUTIONS-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_get_satisfaction_type_method", "CYBLACK-UNIFICATION-ROBOT-GET-SATISFACTION-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_set_satisfaction_type_method", "CYBLACK-UNIFICATION-ROBOT-SET-SATISFACTION-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_satisfied_p_method", "CYBLACK-UNIFICATION-ROBOT-SATISFIED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_unify_method", "CYBLACK-UNIFICATION-ROBOT-UNIFY-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_visit_method", "CYBLACK-UNIFICATION-ROBOT-VISIT-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_get_parent_robot_method", "CYBLACK-UNIFICATION-ROBOT-GET-PARENT-ROBOT-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_set_parent_robot_method", "CYBLACK-UNIFICATION-ROBOT-SET-PARENT-ROBOT-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_get_instigator_bound_method", "CYBLACK-UNIFICATION-ROBOT-GET-INSTIGATOR-BOUND-METHOD", 1, 0, false);
        declareFunction("cyblack_unification_robot_set_instigator_bound_method", "CYBLACK-UNIFICATION-ROBOT-SET-INSTIGATOR-BOUND-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_instigator_bound_p_method", "CYBLACK-UNIFICATION-ROBOT-INSTIGATOR-BOUND-P-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_unification_robot_satisfied_by_any_solution_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_unification_robot_satisfied_by_any_solution_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_unification_robot_satisfied_by_any_solution_p", "CYBLACK-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-P", 1, 0, false);
        declareFunction("cyblack_unification_robot_satisfied_by_any_solution_initialize_method", "CYBLACK-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_constrained_unification_robot_the_posting", "GET-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-THE-POSTING", 1, 0, false);
        declareFunction("set_cyblack_constrained_unification_robot_the_posting", "SET-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-THE-POSTING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_constrained_unification_robot_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_constrained_unification_robot_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_constrained_unification_robot_p", "CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-P", 1, 0, false);
        declareFunction("cyblack_constrained_unification_robot_initialize_method", "CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_constrained_unification_robot_clone_method", "CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-CLONE-METHOD", 1, 0, false);
        declareFunction("cyblack_constrained_unification_robot_get_the_posting_method", "CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-GET-THE-POSTING-METHOD", 1, 0, false);
        declareFunction("cyblack_constrained_unification_robot_set_the_posting_method", "CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SET-THE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_constrained_unification_robot_find_the_posting_method", "CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-FIND-THE-POSTING-METHOD", 1, 0, false);
        declareFunction("cyblack_constrained_unification_robot_unify_method", "CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-UNIFY-METHOD", 1, 0, false);
        declareFunction("cyblack_constrained_unification_robot_visit_method", "CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-VISIT-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_constrained_unification_robot_satisfied_by_any_solution_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_constrained_unification_robot_satisfied_by_any_solution_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_constrained_unification_robot_satisfied_by_any_solution_p", "CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-P", 1, 0, false);
        declareFunction("cyblack_constrained_unification_robot_satisfied_by_any_solution_initialize_method", "CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_monitoring_unification_robot_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONITORING-UNIFICATION-ROBOT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_monitoring_unification_robot_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONITORING-UNIFICATION-ROBOT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_monitoring_unification_robot_p", "CYBLACK-MONITORING-UNIFICATION-ROBOT-P", 1, 0, false);
        declareFunction("cyblack_monitoring_unification_robot_initialize_method", "CYBLACK-MONITORING-UNIFICATION-ROBOT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_monitoring_unification_robot_get_precondition_pattern_method", "CYBLACK-MONITORING-UNIFICATION-ROBOT-GET-PRECONDITION-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_monitoring_unification_robot_set_precondition_pattern_method", "CYBLACK-MONITORING-UNIFICATION-ROBOT-SET-PRECONDITION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_monitoring_unification_robot_get_monitoring_pattern_method", "CYBLACK-MONITORING-UNIFICATION-ROBOT-GET-MONITORING-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_monitoring_unification_robot_set_monitoring_pattern_method", "CYBLACK-MONITORING-UNIFICATION-ROBOT-SET-MONITORING-PATTERN-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_unification_robot_for_goal_satisfaction_daemons_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_unification_robot_for_goal_satisfaction_daemons_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS-INSTANCE", 1, 0, false);
        declareFunction("cyblack_unification_robot_for_goal_satisfaction_daemons_p", "CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS-P", 1, 0, false);
        declareFunction("cyblack_unification_robot_for_goal_satisfaction_daemons_set_precondition_pattern_method", "CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS-SET-PRECONDITION-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_unification_robot_for_goal_satisfaction_daemons_unify_method", "CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS-UNIFY-METHOD", 1, 0, false);
        declareFunction("cyblack_ur_clone", "CYBLACK-UR-CLONE", 1, 0, false);
        declareFunction("cyblack_ur_install", "CYBLACK-UR-INSTALL", 2, 0, false);
        declareFunction("cyblack_ur_get_parent_robot", "CYBLACK-UR-GET-PARENT-ROBOT", 1, 0, false);
        declareFunction("cyblack_ur_set_parent_robot", "CYBLACK-UR-SET-PARENT-ROBOT", 2, 0, false);
        declareFunction("cyblack_ur_get_precondition_pattern", "CYBLACK-UR-GET-PRECONDITION-PATTERN", 1, 0, false);
        declareFunction("cyblack_ur_set_precondition_pattern", "CYBLACK-UR-SET-PRECONDITION-PATTERN", 2, 0, false);
        declareFunction("cyblack_ur_get_solutions", "CYBLACK-UR-GET-SOLUTIONS", 1, 0, false);
        declareFunction("cyblack_ur_set_solutions", "CYBLACK-UR-SET-SOLUTIONS", 2, 0, false);
        declareFunction("cyblack_ur_get_instigator_bound", "CYBLACK-UR-GET-INSTIGATOR-BOUND", 1, 0, false);
        declareFunction("cyblack_ur_set_instigator_bound", "CYBLACK-UR-SET-INSTIGATOR-BOUND", 2, 0, false);
        declareFunction("cyblack_ur_unify", "CYBLACK-UR-UNIFY", 1, 0, false);
        declareFunction("cyblack_ur_verify", "CYBLACK-UR-VERIFY", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_unification_file() {
        defconstant("*VALID-CYBLACK-UNIFICATION-SATISFACTION-TYPES*", $list_alt0);
        return NIL;
    }

    public static final SubLObject setup_cyblack_unification_file() {
                enumerations.enumerations_incorporate_definition(CYBLACK_UNIFICATION_SATISFACTION_TYPE, $list_alt0);
        classes.subloop_new_class(CYBLACK_UNIFICATION_ROBOT, CYBLACK_BASIC_POSTING_VISITOR, $list_alt10, NIL, $list_alt11);
        classes.class_set_implements_slot_listeners(CYBLACK_UNIFICATION_ROBOT, NIL);
        methods.methods_incorporate_instance_method(PERFORM_ACTION, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt30, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, PERFORM_ACTION, CYBLACK_UNIFICATION_ROBOT_PERFORM_ACTION_METHOD);
        methods.methods_incorporate_instance_method(ON_DELETE, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt34, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, ON_DELETE, CYBLACK_UNIFICATION_ROBOT_ON_DELETE_METHOD);
        methods.methods_incorporate_instance_method(ON_ADD, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt34, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, ON_ADD, CYBLACK_UNIFICATION_ROBOT_ON_ADD_METHOD);
        methods.methods_incorporate_instance_method(GET_COLLECTIONS, CYBLACK_UNIFICATION_ROBOT, $list_alt29, NIL, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_COLLECTIONS, CYBLACK_UNIFICATION_ROBOT_GET_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(MEMBER_P, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt43, $list_alt44);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, MEMBER_P, CYBLACK_UNIFICATION_ROBOT_MEMBER_P_METHOD);
        methods.methods_incorporate_instance_method(TRANSFER_SELF, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt47, $list_alt48);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, TRANSFER_SELF, CYBLACK_UNIFICATION_ROBOT_TRANSFER_SELF_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_ALL_COLLECTIONS, CYBLACK_UNIFICATION_ROBOT, $list_alt29, NIL, $list_alt53);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, DELETE_SELF_FROM_ALL_COLLECTIONS, CYBLACK_UNIFICATION_ROBOT_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SELF_FROM_COLLECTION, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt43, $list_alt56);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, DELETE_SELF_FROM_COLLECTION, CYBLACK_UNIFICATION_ROBOT_DELETE_SELF_FROM_COLLECTION_METHOD);
        methods.methods_incorporate_instance_method(DELETE_PARENT_LINK, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt59, $list_alt60);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, DELETE_PARENT_LINK, CYBLACK_UNIFICATION_ROBOT_DELETE_PARENT_LINK_METHOD);
        methods.methods_incorporate_instance_method(ADD_PARENT_LINK, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt63, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, ADD_PARENT_LINK, CYBLACK_UNIFICATION_ROBOT_ADD_PARENT_LINK_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_UNIFICATION_ROBOT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_UNIFICATION_ROBOT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_INSTANCE);
        subloop_reserved_initialize_cyblack_unification_robot_class(CYBLACK_UNIFICATION_ROBOT);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_UNIFICATION_ROBOT, $list_alt77, NIL, $list_alt78);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, INITIALIZE, CYBLACK_UNIFICATION_ROBOT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_PARENT_LINKS, CYBLACK_UNIFICATION_ROBOT, $list_alt84, NIL, $list_alt85);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_PARENT_LINKS, CYBLACK_UNIFICATION_ROBOT_GET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT_LINKS, CYBLACK_UNIFICATION_ROBOT, $list_alt77, $list_alt88, $list_alt89);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, SET_PARENT_LINKS, CYBLACK_UNIFICATION_ROBOT_SET_PARENT_LINKS_METHOD);
        methods.methods_incorporate_instance_method(GET_SELF_DELETION_MODE, CYBLACK_UNIFICATION_ROBOT, $list_alt84, NIL, $list_alt93);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_SELF_DELETION_MODE, CYBLACK_UNIFICATION_ROBOT_GET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method(SET_SELF_DELETION_MODE, CYBLACK_UNIFICATION_ROBOT, $list_alt77, $list_alt96, $list_alt97);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, SET_SELF_DELETION_MODE, CYBLACK_UNIFICATION_ROBOT_SET_SELF_DELETION_MODE_METHOD);
        methods.methods_incorporate_instance_method(INSTALL, CYBLACK_UNIFICATION_ROBOT, $list_alt77, $list_alt101, $list_alt102);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, INSTALL, CYBLACK_UNIFICATION_ROBOT_INSTALL_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt106, $list_alt107);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, PRINT, CYBLACK_UNIFICATION_ROBOT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(CLONE, CYBLACK_UNIFICATION_ROBOT, $list_alt110, NIL, $list_alt111);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, CLONE, CYBLACK_UNIFICATION_ROBOT_CLONE_METHOD);
        methods.methods_incorporate_instance_method(GET_CACHED_DICTIONARY, CYBLACK_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt116);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_CACHED_DICTIONARY, CYBLACK_UNIFICATION_ROBOT_GET_CACHED_DICTIONARY_METHOD);
        methods.methods_incorporate_instance_method(GET_CACHED_BLACKBOARD, CYBLACK_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt119);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_CACHED_BLACKBOARD, CYBLACK_UNIFICATION_ROBOT_GET_CACHED_BLACKBOARD_METHOD);
        methods.methods_incorporate_instance_method(GET_PRECONDITION_PATTERN, CYBLACK_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt122);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_PRECONDITION_PATTERN, CYBLACK_UNIFICATION_ROBOT_GET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_PRECONDITION_PATTERN, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt125, $list_alt126);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, SET_PRECONDITION_PATTERN, CYBLACK_UNIFICATION_ROBOT_SET_PRECONDITION_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_BOUND_BINDINGS, CYBLACK_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt131);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_BOUND_BINDINGS, CYBLACK_UNIFICATION_ROBOT_GET_BOUND_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method(SET_BOUND_BINDINGS, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt134, $list_alt135);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, SET_BOUND_BINDINGS, CYBLACK_UNIFICATION_ROBOT_SET_BOUND_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_UNBOUND_BINDINGS, CYBLACK_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt139);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_UNBOUND_BINDINGS, CYBLACK_UNIFICATION_ROBOT_GET_UNBOUND_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method(SET_UNBOUND_BINDINGS, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt134, $list_alt142);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, SET_UNBOUND_BINDINGS, CYBLACK_UNIFICATION_ROBOT_SET_UNBOUND_BINDINGS_METHOD);
        methods.methods_incorporate_instance_method(GET_SOLUTIONS, CYBLACK_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt146);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_SOLUTIONS, CYBLACK_UNIFICATION_ROBOT_GET_SOLUTIONS_METHOD);
        methods.methods_incorporate_instance_method(SET_SOLUTIONS, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt149, $list_alt150);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, SET_SOLUTIONS, CYBLACK_UNIFICATION_ROBOT_SET_SOLUTIONS_METHOD);
        methods.methods_incorporate_instance_method(GET_SATISFACTION_TYPE, CYBLACK_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt154);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_SATISFACTION_TYPE, CYBLACK_UNIFICATION_ROBOT_GET_SATISFACTION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SET_SATISFACTION_TYPE, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt157, $list_alt158);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, SET_SATISFACTION_TYPE, CYBLACK_UNIFICATION_ROBOT_SET_SATISFACTION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(SATISFIED_P, CYBLACK_UNIFICATION_ROBOT, $list_alt77, NIL, $list_alt162);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, SATISFIED_P, CYBLACK_UNIFICATION_ROBOT_SATISFIED_P_METHOD);
        methods.methods_incorporate_instance_method(UNIFY, CYBLACK_UNIFICATION_ROBOT, $list_alt110, NIL, $list_alt169);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, UNIFY, CYBLACK_UNIFICATION_ROBOT_UNIFY_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_UNIFICATION_ROBOT, $list_alt110, $list_alt174, $list_alt175);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, VISIT, CYBLACK_UNIFICATION_ROBOT_VISIT_METHOD);
        methods.methods_incorporate_instance_method(GET_PARENT_ROBOT, CYBLACK_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt180);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_PARENT_ROBOT, CYBLACK_UNIFICATION_ROBOT_GET_PARENT_ROBOT_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT_ROBOT, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt183, $list_alt184);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, SET_PARENT_ROBOT, CYBLACK_UNIFICATION_ROBOT_SET_PARENT_ROBOT_METHOD);
        methods.methods_incorporate_instance_method(GET_INSTIGATOR_BOUND, CYBLACK_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt188);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, GET_INSTIGATOR_BOUND, CYBLACK_UNIFICATION_ROBOT_GET_INSTIGATOR_BOUND_METHOD);
        methods.methods_incorporate_instance_method(SET_INSTIGATOR_BOUND, CYBLACK_UNIFICATION_ROBOT, $list_alt29, $list_alt191, $list_alt192);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, SET_INSTIGATOR_BOUND, CYBLACK_UNIFICATION_ROBOT_SET_INSTIGATOR_BOUND_METHOD);
        methods.methods_incorporate_instance_method(INSTIGATOR_BOUND_P, CYBLACK_UNIFICATION_ROBOT, $list_alt29, NIL, $list_alt196);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT, INSTIGATOR_BOUND_P, CYBLACK_UNIFICATION_ROBOT_INSTIGATOR_BOUND_P_METHOD);
        classes.subloop_new_class(CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, CYBLACK_UNIFICATION_ROBOT, NIL, NIL, $list_alt199);
        classes.class_set_implements_slot_listeners(CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, $sym200$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_SATISFIED_B);
        classes.subloop_note_instance_initialization_function(CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, $sym201$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_SATISFIED_B);
        subloop_reserved_initialize_cyblack_unification_robot_satisfied_by_any_solution_class(CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, $list_alt77, NIL, $list_alt202);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, INITIALIZE, $sym204$CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION_INITIALIZE_ME);
        classes.subloop_new_class(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, CYBLACK_UNIFICATION_ROBOT, NIL, NIL, $list_alt206);
        classes.class_set_implements_slot_listeners(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, $sym208$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT);
        classes.subloop_note_instance_initialization_function(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, $sym209$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT);
        subloop_reserved_initialize_cyblack_constrained_unification_robot_class(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, $list_alt77, NIL, $list_alt210);
        methods.subloop_register_instance_method(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, INITIALIZE, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CLONE, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, $list_alt110, NIL, $list_alt213);
        methods.subloop_register_instance_method(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, CLONE, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_CLONE_METHOD);
        methods.methods_incorporate_instance_method(GET_THE_POSTING, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt216);
        methods.subloop_register_instance_method(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, GET_THE_POSTING, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_GET_THE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(SET_THE_POSTING, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, $list_alt29, $list_alt219, $list_alt220);
        methods.subloop_register_instance_method(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, SET_THE_POSTING, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SET_THE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(FIND_THE_POSTING, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, $list_alt29, NIL, $list_alt224);
        methods.subloop_register_instance_method(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, FIND_THE_POSTING, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_FIND_THE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(UNIFY, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, $list_alt110, NIL, $list_alt228);
        methods.subloop_register_instance_method(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, UNIFY, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_UNIFY_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, $list_alt110, $list_alt174, $list_alt233);
        methods.subloop_register_instance_method(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, VISIT, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_VISIT_METHOD);
        classes.subloop_new_class(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT, NIL, NIL, $list_alt199);
        classes.class_set_implements_slot_listeners(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, $sym236$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT);
        classes.subloop_note_instance_initialization_function(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, $sym237$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT);
        subloop_reserved_initialize_cyblack_constrained_unification_robot_satisfied_by_any_solution_class(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, $list_alt77, NIL, $list_alt202);
        methods.subloop_register_instance_method(CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, INITIALIZE, $sym239$CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION_I);
        classes.subloop_new_class(CYBLACK_MONITORING_UNIFICATION_ROBOT, CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION, NIL, NIL, $list_alt241);
        classes.class_set_implements_slot_listeners(CYBLACK_MONITORING_UNIFICATION_ROBOT, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_MONITORING_UNIFICATION_ROBOT, $sym242$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONITORING_UNIFICATION_ROBOT_);
        classes.subloop_note_instance_initialization_function(CYBLACK_MONITORING_UNIFICATION_ROBOT, $sym243$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONITORING_UNIFICATION_ROBOT_);
        subloop_reserved_initialize_cyblack_monitoring_unification_robot_class(CYBLACK_MONITORING_UNIFICATION_ROBOT);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_MONITORING_UNIFICATION_ROBOT, $list_alt77, NIL, $list_alt244);
        methods.subloop_register_instance_method(CYBLACK_MONITORING_UNIFICATION_ROBOT, INITIALIZE, CYBLACK_MONITORING_UNIFICATION_ROBOT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_PRECONDITION_PATTERN, CYBLACK_MONITORING_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt122);
        methods.subloop_register_instance_method(CYBLACK_MONITORING_UNIFICATION_ROBOT, GET_PRECONDITION_PATTERN, $sym246$CYBLACK_MONITORING_UNIFICATION_ROBOT_GET_PRECONDITION_PATTERN_MET);
        methods.methods_incorporate_instance_method(SET_PRECONDITION_PATTERN, CYBLACK_MONITORING_UNIFICATION_ROBOT, $list_alt29, $list_alt125, $list_alt247);
        methods.subloop_register_instance_method(CYBLACK_MONITORING_UNIFICATION_ROBOT, SET_PRECONDITION_PATTERN, $sym248$CYBLACK_MONITORING_UNIFICATION_ROBOT_SET_PRECONDITION_PATTERN_MET);
        methods.methods_incorporate_instance_method(GET_MONITORING_PATTERN, CYBLACK_MONITORING_UNIFICATION_ROBOT, $list_alt115, NIL, $list_alt122);
        methods.subloop_register_instance_method(CYBLACK_MONITORING_UNIFICATION_ROBOT, GET_MONITORING_PATTERN, $sym250$CYBLACK_MONITORING_UNIFICATION_ROBOT_GET_MONITORING_PATTERN_METHO);
        methods.methods_incorporate_instance_method(SET_MONITORING_PATTERN, CYBLACK_MONITORING_UNIFICATION_ROBOT, $list_alt29, $list_alt252, $list_alt253);
        methods.subloop_register_instance_method(CYBLACK_MONITORING_UNIFICATION_ROBOT, SET_MONITORING_PATTERN, $sym254$CYBLACK_MONITORING_UNIFICATION_ROBOT_SET_MONITORING_PATTERN_METHO);
        classes.subloop_new_class(CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS, CYBLACK_UNIFICATION_ROBOT, NIL, NIL, $list_alt256);
        classes.class_set_implements_slot_listeners(CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS, $sym257$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SA);
        classes.subloop_note_instance_initialization_function(CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS, $sym258$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SA);
        subloop_reserved_initialize_cyblack_unification_robot_for_goal_satisfaction_daemons_class(CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS);
        methods.methods_incorporate_instance_method(SET_PRECONDITION_PATTERN, CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS, $list_alt29, $list_alt125, $list_alt259);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS, SET_PRECONDITION_PATTERN, $sym261$CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS_SET_PRECO);
        methods.methods_incorporate_instance_method(UNIFY, CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS, $list_alt29, NIL, $list_alt262);
        methods.subloop_register_instance_method(CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS, UNIFY, $sym265$CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS_UNIFY_MET);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("ANY"), makeKeyword("ALL"), makeKeyword("AT-LEAST"), makeKeyword("UNTIL-TIMEOUT"));

    private static final SubLSymbol CYBLACK_UNIFICATION_SATISFACTION_TYPE = makeSymbol("CYBLACK-UNIFICATION-SATISFACTION-TYPE");

    static private final SubLString $str_alt2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_UNIFICATION_SATISFACTION_TYPE = makeSymbol("ENCODE-CYBLACK-UNIFICATION-SATISFACTION-TYPE");

    static private final SubLString $str_alt4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_UNIFICATION_SATISFACTION_TYPE = makeSymbol("DECODE-CYBLACK-UNIFICATION-SATISFACTION-TYPE");

    static private final SubLString $str_alt6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_UNIFICATION_SATISFACTION_TYPE_P = makeSymbol("CYBLACK-UNIFICATION-SATISFACTION-TYPE-P");



    private static final SubLSymbol CYBLACK_BASIC_POSTING_VISITOR = makeSymbol("CYBLACK-BASIC-POSTING-VISITOR");

    static private final SubLList $list_alt10 = list(makeSymbol("LIST-ELEMENT-TEMPLATE"));

    static private final SubLList $list_alt11 = list(new SubLObject[]{ list(makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT-LINKS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT-LINKS"), list(makeSymbol("NEW-PARENT-LINKS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PARENT-LINK"), list(makeSymbol("NEW-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-PARENT-LINK"), list(makeSymbol("OLD-PARENT-LINK")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SELF-DELETION-MODE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SELF-DELETION-MODE"), list(makeSymbol("MODE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-COLLECTION"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SELF-FROM-ALL-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRANSFER-SELF"), list(makeSymbol("CURRENT-COLLECTION"), makeSymbol("NEW-COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MEMBER-P"), list(makeSymbol("COLLECTION")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COLLECTIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ADD"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DELETE"), list(makeSymbol("PARENT-LIST")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-ACTION"), list(makeSymbol("ACTION"), makeSymbol("PARAMETERS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("CACHED-DICTIONARY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CACHED-BLACKBOARD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PRECONDITION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("BOUND-BINDINGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("UNBOUND-BINDINGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SOLUTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SATISFACTION-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TIMEOUT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MIN-SOLUTION-COUNT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TARGET-BINDING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARENT-ROBOT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INSTIGATOR-BOUND"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLONE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CACHED-DICTIONARY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CACHED-BLACKBOARD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRECONDITION-PATTERN"), list(makeSymbol("NEW-PRECONDITION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BOUND-BINDINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BOUND-BINDINGS"), list(makeSymbol("NEW-BINDINGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNBOUND-BINDINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-UNBOUND-BINDINGS"), list(makeSymbol("NEW-BINDINGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SOLUTIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SOLUTIONS"), list(makeSymbol("NEW-BINDING-LISTS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SATISFACTION-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SATISFACTION-TYPE"), list(makeSymbol("NEW-SATISFACTION-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SATISFIED-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT-ROBOT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT-ROBOT"), list(makeSymbol("NEW-PARENT-ROBOT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INSTIGATOR-BOUND"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INSTIGATOR-BOUND"), list(makeSymbol("IS-BOUND")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTIGATOR-BOUND-P"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol PARENT_ROBOT = makeSymbol("PARENT-ROBOT");



    private static final SubLSymbol MIN_SOLUTION_COUNT = makeSymbol("MIN-SOLUTION-COUNT");















    private static final SubLSymbol CACHED_DICTIONARY = makeSymbol("CACHED-DICTIONARY");



    private static final SubLSymbol INSTIGATOR_BOUND = makeSymbol("INSTIGATOR-BOUND");

    public static final SubLInteger $int$4098 = makeInteger(4098);



    public static final SubLInteger $int$4097 = makeInteger(4097);



    static private final SubLList $list_alt29 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt30 = list(makeSymbol("ACTION"), makeSymbol("PARAMETERS"));

    static private final SubLList $list_alt31 = list(list(makeSymbol("IGNORE"), makeSymbol("ACTION"), makeSymbol("PARAMETERS")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_PERFORM_ACTION_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-PERFORM-ACTION-METHOD");



    static private final SubLList $list_alt34 = list(makeSymbol("PARENT-LIST"));

    static private final SubLList $list_alt35 = list(list(makeSymbol("IGNORE"), makeSymbol("PARENT-LIST")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_ON_DELETE_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-ON-DELETE-METHOD");



    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_ON_ADD_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-ON-ADD-METHOD");



    static private final SubLList $list_alt40 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-COLLECTIONS"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS"), makeSymbol("TEMPLATE-COLLECTIONS")), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK"))), list(RET, list(makeSymbol("UNIQUE-ELEMENTS"), makeSymbol("TEMPLATE-COLLECTIONS")))));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_COLLECTIONS_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-COLLECTIONS-METHOD");



    static private final SubLList $list_alt43 = list(makeSymbol("COLLECTION"));

    static private final SubLList $list_alt44 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(RET, T))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_MEMBER_P_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-MEMBER-P-METHOD");



    static private final SubLList $list_alt47 = list(makeSymbol("CURRENT-COLLECTION"), makeSymbol("NEW-COLLECTION"));

    static private final SubLList $list_alt48 = list(list(makeSymbol("MUST"), list(makeSymbol("COLLECTION-TEMPLATE-P"), makeSymbol("CURRENT-COLLECTION")), makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE."), makeSymbol("SELF"), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("MUST"), list(makeSymbol("COLLECTION-TEMPLATE-P"), makeSymbol("CURRENT-COLLECTION")), makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE."), makeSymbol("SELF"), makeSymbol("NEW-COLLECTION")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("CURRENT-COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-COLLECTION"), list(QUOTE, makeSymbol("ADD")), makeSymbol("SELF")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(RET, makeSymbol("SELF"))));

    static private final SubLString $str_alt49$_TRANSFER_SELF__S____S_is_not_an_ = makeString("(TRANSFER-SELF ~S): ~S is not an instance of COLLECTION-TEMPLATE.");



    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_TRANSFER_SELF_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-TRANSFER-SELF-METHOD");



    static private final SubLList $list_alt53 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), NIL))), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), NIL)), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_DELETE_SELF_FROM_ALL_COLLECTIONS_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-DELETE-SELF-FROM-ALL-COLLECTIONS-METHOD");



    static private final SubLList $list_alt56 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PARENT-LINK"), NIL), list(makeSymbol("TEMPLATE-TARGET-LINK"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PREVIOUS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("PIF"), list(EQ, list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-PARENT-LINK")), makeSymbol("COLLECTION")), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-TARGET-LINK"), makeSymbol("TEMPLATE-PARENT-LINK")), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), NIL)), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS"), makeSymbol("TEMPLATE-SUBLINKS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-SUBLINKS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-SUBLINKS")))))))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-TARGET-LINK"), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("PROGN"), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), T), list(makeSymbol("GENERIC-DLLT-DELETE-LINK-FUNCTION"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), makeSymbol("TEMPLATE-TARGET-LINK"))), list(makeSymbol("CSETF"), list(makeSymbol("DLC-OWNER"), makeSymbol("TEMPLATE-TARGET-LINK")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), makeSymbol("COLLECTION")), list(makeSymbol("SET-SELF-DELETION-MODE"), makeSymbol("SELF"), NIL)))), list(RET, makeSymbol("SELF"))));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_DELETE_SELF_FROM_COLLECTION_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-DELETE-SELF-FROM-COLLECTION-METHOD");



    static private final SubLList $list_alt59 = list(makeSymbol("OLD-PARENT-LINK"));

    static private final SubLList $list_alt60 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARENT-LINKS"), list(makeSymbol("PIF"), list(EQ, makeSymbol("OLD-PARENT-LINK"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-PARENT-LINKS")), list(makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-PARENT-LINKS")))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("OLD-PARENT-LINK"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("RPLACD"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DELETE")), list(makeSymbol("DLC-OWNER"), makeSymbol("OLD-PARENT-LINK"))), list(RET, makeSymbol("OLD-PARENT-LINK"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PREVIOUS-CONS"), makeSymbol("TEMPLATE-CURRENT-CONS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-CONS"), list(makeSymbol("CDR"), makeSymbol("TEMPLATE-CURRENT-CONS"))))))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_DELETE_PARENT_LINK_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-DELETE-PARENT-LINK-METHOD");



    static private final SubLList $list_alt63 = list(makeSymbol("NEW-PARENT-LINK"));

    static private final SubLList $list_alt64 = list(list(makeSymbol("SET-PARENT-LINKS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("NEW-PARENT-LINK"), list(makeSymbol("GET-PARENT-LINKS"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ADD")), list(makeSymbol("DLC-OWNER"), makeSymbol("NEW-PARENT-LINK"))), list(RET, makeSymbol("NEW-PARENT-LINK")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_ADD_PARENT_LINK_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-ADD-PARENT-LINK-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-CLASS");













    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-INSTANCE");



    static private final SubLList $list_alt77 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt78 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CACHED-DICTIONARY"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("BOUND-BINDINGS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("UNBOUND-BINDINGS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SOLUTIONS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-END-POINTER-LIST")), list(QUOTE, makeSymbol("BASIC-END-POINTER-LIST")))), list(makeSymbol("CSETQ"), makeSymbol("SATISFACTION-TYPE"), makeKeyword("ALL")), list(makeSymbol("CSETQ"), makeSymbol("TIMEOUT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("MIN-SOLUTION-COUNT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TARGET-BINDING"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PARENT-ROBOT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("INSTIGATOR-BOUND"), NIL), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym79$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");





    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_INITIALIZE_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-INITIALIZE-METHOD");



    static private final SubLList $list_alt84 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt85 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt88 = list(makeSymbol("NEW-PARENT-LINKS"));

    static private final SubLList $list_alt89 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-PARENT-LINKS"), makeSymbol("NEW-PARENT-LINKS")), list(RET, makeSymbol("NEW-PARENT-LINKS")));

    static private final SubLSymbol $sym90$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_SET_PARENT_LINKS_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SET-PARENT-LINKS-METHOD");



    static private final SubLList $list_alt93 = list(list(RET, makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-SELF-DELETION-MODE-METHOD");



    static private final SubLList $list_alt96 = list(makeSymbol("MODE"));

    static private final SubLList $list_alt97 = list(list(makeSymbol("CSETQ"), makeSymbol("QUA-LIST-ELEMENT-SELF-DELETION-MODE"), makeSymbol("MODE")), list(RET, makeSymbol("MODE")));

    static private final SubLSymbol $sym98$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_SET_SELF_DELETION_MODE_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SET-SELF-DELETION-MODE-METHOD");

    private static final SubLSymbol INSTALL = makeSymbol("INSTALL");

    static private final SubLList $list_alt101 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt102 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(INSTALL ~S): ~S is not an instance of CYBLACK-APPLICATION."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("SET-APPLICATION"), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("PWHEN"), makeSymbol("NEW-APPLICATION"), list(makeSymbol("CSETQ"), makeSymbol("CACHED-DICTIONARY"), list(makeSymbol("CYBLACK-APPLICATION-GET-DATATYPE-DICTIONARY"), makeSymbol("NEW-APPLICATION"))), list(makeSymbol("CSETQ"), makeSymbol("CACHED-BLACKBOARD"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("NEW-APPLICATION")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym103$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_INSTALL_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-INSTALL-METHOD");



    static private final SubLList $list_alt106 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt107 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(RET, list(makeSymbol("PRINT"), makeSymbol("SUPER"), makeSymbol("STREAM"), makeSymbol("DEPTH"))));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_PRINT_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-PRINT-METHOD");



    static private final SubLList $list_alt110 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt111 = list(list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(CLONE ~S)"), makeSymbol("SELF")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("NEW-ROBOT"), list(makeSymbol("CLONE"), makeSymbol("SUPER")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-UNIFICATION-ROBOT")), makeSymbol("NEW-ROBOT"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ROBOT"), list(QUOTE, makeSymbol("CACHED-DICTIONARY")), list(makeSymbol("GET-CACHED-DICTIONARY"), makeSymbol("SELF"))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ROBOT"), list(QUOTE, makeSymbol("CACHED-BLACKBOARD")), list(makeSymbol("GET-CACHED-BLACKBOARD"), makeSymbol("SELF"))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ROBOT"), list(QUOTE, makeSymbol("SATISFACTION-TYPE")), makeKeyword("ALL")), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ROBOT"), list(QUOTE, makeSymbol("PRECONDITION")), list(makeSymbol("GET-PRECONDITION-PATTERN"), makeSymbol("SELF"))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ROBOT"), list(QUOTE, makeSymbol("BOUND-BINDINGS")), list(makeSymbol("COPY-LIST"), list(makeSymbol("GET-BOUND-BINDINGS"), makeSymbol("SELF")))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ROBOT"), list(QUOTE, makeSymbol("UNBOUND-BINDINGS")), list(makeSymbol("COPY-LIST"), list(makeSymbol("GET-UNBOUND-BINDINGS"), makeSymbol("SELF")))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ROBOT"), list(QUOTE, makeSymbol("SOLUTIONS")), list(makeSymbol("GET-SOLUTIONS"), makeSymbol("SELF"))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ROBOT"), list(QUOTE, makeSymbol("TIMEOUT")), list(makeSymbol("GET-CYBLACK-UNIFICATION-ROBOT-TIMEOUT"), makeSymbol("SELF"))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ROBOT"), list(QUOTE, makeSymbol("MIN-SOLUTION-COUNT")), list(makeSymbol("GET-CYBLACK-UNIFICATION-ROBOT-MIN-SOLUTION-COUNT"), makeSymbol("SELF"))), list(makeSymbol("SET-SLOT"), makeSymbol("NEW-ROBOT"), list(QUOTE, makeSymbol("TARGET-BINDING")), list(makeSymbol("GET-CYBLACK-UNIFICATION-ROBOT-TARGET-BINDING"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-ROBOT")) }));

    static private final SubLString $str_alt112$___CLONE__S_ = makeString("~%(CLONE ~S)");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_CLONE_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-CLONE-METHOD");

    private static final SubLSymbol GET_CACHED_DICTIONARY = makeSymbol("GET-CACHED-DICTIONARY");

    static private final SubLList $list_alt115 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt116 = list(list(RET, makeSymbol("CACHED-DICTIONARY")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_CACHED_DICTIONARY_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-CACHED-DICTIONARY-METHOD");

    private static final SubLSymbol GET_CACHED_BLACKBOARD = makeSymbol("GET-CACHED-BLACKBOARD");

    static private final SubLList $list_alt119 = list(list(RET, makeSymbol("CACHED-BLACKBOARD")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_CACHED_BLACKBOARD_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-CACHED-BLACKBOARD-METHOD");



    static private final SubLList $list_alt122 = list(list(RET, makeSymbol("PRECONDITION")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-PRECONDITION-PATTERN-METHOD");



    static private final SubLList $list_alt125 = list(makeSymbol("NEW-PRECONDITION-PATTERN"));

    static private final SubLList $list_alt126 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CYBLACK-PRECON-OR-MONITORING-PATTERN-P"), makeSymbol("NEW-PRECONDITION-PATTERN"))), makeString("(SET-PRECONDITION-PATTERN ~S): ~S is not an instance of CYBLACK-PRECON-PATTERN."), makeSymbol("SELF"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CLET"), list(list(makeSymbol("PRECON-ENVIRONMENT"), list(makeSymbol("CYBLACK-PATTERN-GET-LOCAL-BINDINGS"), makeSymbol("NEW-PRECONDITION-PATTERN")))), list(makeSymbol("PIF"), makeSymbol("PRECON-ENVIRONMENT"), list(makeSymbol("CSETQ"), makeSymbol("UNBOUND-BINDINGS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-UNIQUE-NON-APRIORI-BINDINGS"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("PRECON-ENVIRONMENT"), makeKeyword("ADD-POSTING"))), list(makeSymbol("CSETQ"), makeSymbol("UNBOUND-BINDINGS"), NIL))), list(makeSymbol("CSETQ"), makeSymbol("BOUND-BINDINGS"), NIL), list(RET, makeSymbol("NEW-PRECONDITION-PATTERN")));

    static private final SubLSymbol $sym127$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol $ADD_POSTING = makeKeyword("ADD-POSTING");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_SET_PRECONDITION_PATTERN_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SET-PRECONDITION-PATTERN-METHOD");

    private static final SubLSymbol GET_BOUND_BINDINGS = makeSymbol("GET-BOUND-BINDINGS");

    static private final SubLList $list_alt131 = list(list(RET, makeSymbol("BOUND-BINDINGS")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_BOUND_BINDINGS_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-BOUND-BINDINGS-METHOD");

    private static final SubLSymbol SET_BOUND_BINDINGS = makeSymbol("SET-BOUND-BINDINGS");

    static private final SubLList $list_alt134 = list(makeSymbol("NEW-BINDINGS"));

    static private final SubLList $list_alt135 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-BINDINGS-P"), makeSymbol("NEW-BINDINGS")), makeString("(SET-BOUND-BINDINGS ~S): ~S is not a valid CYBLACK-BINDING list."), makeSymbol("SELF"), makeSymbol("NEW-BINDINGS")), list(makeSymbol("CSETQ"), makeSymbol("BOUND-BINDINGS"), makeSymbol("NEW-BINDINGS")), list(RET, makeSymbol("NEW-BINDINGS")));

    static private final SubLSymbol $sym136$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_SET_BOUND_BINDINGS_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SET-BOUND-BINDINGS-METHOD");

    private static final SubLSymbol GET_UNBOUND_BINDINGS = makeSymbol("GET-UNBOUND-BINDINGS");

    static private final SubLList $list_alt139 = list(list(RET, makeSymbol("UNBOUND-BINDINGS")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_UNBOUND_BINDINGS_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-UNBOUND-BINDINGS-METHOD");

    private static final SubLSymbol SET_UNBOUND_BINDINGS = makeSymbol("SET-UNBOUND-BINDINGS");

    static private final SubLList $list_alt142 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-BINDINGS-P"), makeSymbol("NEW-BINDINGS")), makeString("(SET-UNBOUND-BINDINGS ~S): ~S is not a valid CYBLACK-BINDING list."), makeSymbol("SELF"), makeSymbol("NEW-BINDINGS")), list(makeSymbol("CSETQ"), makeSymbol("UNBOUND-BINDINGS"), makeSymbol("NEW-BINDINGS")), list(RET, makeSymbol("NEW-BINDINGS")));

    static private final SubLSymbol $sym143$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_SET_UNBOUND_BINDINGS_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SET-UNBOUND-BINDINGS-METHOD");

    private static final SubLSymbol GET_SOLUTIONS = makeSymbol("GET-SOLUTIONS");

    static private final SubLList $list_alt146 = list(list(RET, makeSymbol("SOLUTIONS")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_SOLUTIONS_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-SOLUTIONS-METHOD");

    private static final SubLSymbol SET_SOLUTIONS = makeSymbol("SET-SOLUTIONS");

    static private final SubLList $list_alt149 = list(makeSymbol("NEW-BINDING-LISTS"));

    static private final SubLList $list_alt150 = list(list(makeSymbol("CSETQ"), makeSymbol("SOLUTIONS"), makeSymbol("NEW-BINDING-LISTS")), list(RET, makeSymbol("NEW-BINDING-LISTS")));

    static private final SubLSymbol $sym151$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_SET_SOLUTIONS_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SET-SOLUTIONS-METHOD");

    private static final SubLSymbol GET_SATISFACTION_TYPE = makeSymbol("GET-SATISFACTION-TYPE");

    static private final SubLList $list_alt154 = list(list(RET, makeSymbol("SATISFACTION-TYPE")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_SATISFACTION_TYPE_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-SATISFACTION-TYPE-METHOD");

    private static final SubLSymbol SET_SATISFACTION_TYPE = makeSymbol("SET-SATISFACTION-TYPE");

    static private final SubLList $list_alt157 = list(makeSymbol("NEW-SATISFACTION-TYPE"));

    static private final SubLList $list_alt158 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-UNIFICATION-SATISFACTION-TYPE-P"), makeSymbol("NEW-SATISFACTION-TYPE")), makeString("(SET-SATISFACTION-TYPE ~S): ~S is not a valid CYBLACK-UNIFICATION-SATISFACTION-TYPE."), makeSymbol("SELF"), makeSymbol("NEW-SATISFACTION-TYPE")), list(makeSymbol("CSETQ"), makeSymbol("SATISFACTION-TYPE"), makeSymbol("NEW-SATISFACTION-TYPE")), list(RET, makeSymbol("NEW-SATISFACTION-TYPE")));

    static private final SubLSymbol $sym159$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_SET_SATISFACTION_TYPE_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SET-SATISFACTION-TYPE-METHOD");



    static private final SubLList $list_alt162 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("PARENT-ROBOT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SATISFIED-P"), makeSymbol("CYBLACK-UNIFICATION-ROBOT")), makeSymbol("PARENT-ROBOT"))), list(RET, T)), list(makeSymbol("CLET"), list(list(makeSymbol("LOCAL-SOLUTIONS"), list(makeSymbol("GET-SOLUTIONS"), makeSymbol("SELF"))), list(makeSymbol("ELEMENT-COUNT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("LOCAL-SOLUTIONS"))), list(makeSymbol("SATISFIED"), NIL)), list(makeSymbol("PCASE"), makeSymbol("SATISFACTION-TYPE"), list(makeKeyword("ANY"), list(makeSymbol("CSETQ"), makeSymbol("SATISFIED"), list(makeSymbol(">"), makeSymbol("ELEMENT-COUNT"), ZERO_INTEGER))), list(makeKeyword("ALL"), list(makeSymbol("CSETQ"), makeSymbol("SATISFIED"), NIL)), list(makeKeyword("AT-LEAST"), list(makeSymbol("CSETQ"), makeSymbol("SATISFIED"), list(makeSymbol("CAND"), makeSymbol("MIN-SOLUTION-COUNT"), list(makeSymbol(">="), makeSymbol("ELEMENT-COUNT"), makeSymbol("MIN-SOLUTION-COUNT"))))), list(makeKeyword("UNTIL-TIMEOUT"), list(makeSymbol("CSETQ"), makeSymbol("SATISFIED"), list(makeSymbol("CAND"), makeSymbol("TIMEOUT"), list(makeSymbol(">="), list(makeSymbol("GET-UNIVERSAL-TIME")), makeSymbol("TIMEOUT")))))), list(RET, makeSymbol("SATISFIED"))));

    static private final SubLSymbol $sym163$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");



    private static final SubLSymbol $AT_LEAST = makeKeyword("AT-LEAST");

    private static final SubLSymbol $UNTIL_TIMEOUT = makeKeyword("UNTIL-TIMEOUT");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_SATISFIED_P_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SATISFIED-P-METHOD");



    static private final SubLList $list_alt169 = list(list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(UNIFY ~S): Entered."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("CACHED-BLACKBOARD"), list(makeSymbol("GET-CYBLACK-UNIFICATION-ROBOT-CACHED-BLACKBOARD"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("CACHED-BLACKBOARD"), makeString("(UNIFY ~S): No blackboard is associated with this unification robot."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("UNBOUND-BINDINGS"), list(makeSymbol("GET-CYBLACK-UNIFICATION-ROBOT-UNBOUND-BINDINGS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("UNBOUND-BINDINGS"), list(makeSymbol("CLET"), list(list(makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("GET-PRECONDITION-PATTERN"), makeSymbol("SELF"))), list(makeSymbol("LOGICAL-FORM"), list(makeSymbol("FIF"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("CYBLACK-PATTERN-GET-LOGICAL-FORM"), makeSymbol("PRECONDITION-PATTERN")), NIL))), list(makeSymbol("PIF"), makeSymbol("LOGICAL-FORM"), list(makeSymbol("CLET"), list(list(makeSymbol("ENVIRONMENT"), list(makeSymbol("CYBLACK-PATTERN-GET-LOCAL-BINDINGS"), makeSymbol("PRECONDITION-PATTERN")))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-VALUE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("LOGICAL-FORM"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("SOLUTIONS"), list(makeSymbol("GET-SOLUTIONS"), makeSymbol("SELF"))), list(makeSymbol("COPY-OF-ENVIRONMENT"), list(makeSymbol("FIF"), makeSymbol("ENVIRONMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLONE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("ENVIRONMENT")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("COPY-OF-ENVIRONMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("SOLUTIONS"), makeSymbol("COPY-OF-ENVIRONMENT"))), list(makeSymbol("PWHEN"), list(makeSymbol("SATISFIED-P"), makeSymbol("SELF")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("CONTINUE"), makeSymbol("CYBLACK-UNIFICATION-ROBOT")), makeSymbol("SELF"), NIL)), list(RET, NIL)))), list(makeSymbol("PROGN"), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("CONTINUE"), makeSymbol("CYBLACK-UNIFICATION-ROBOT")), makeSymbol("SELF"), NIL), list(RET, NIL)))), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("SATISFIED-P"), makeSymbol("SELF")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("CONTINUE"), makeSymbol("CYBLACK-UNIFICATION-ROBOT")), makeSymbol("SELF"), NIL), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-BINDING"), list(makeSymbol("CAR"), makeSymbol("UNBOUND-BINDINGS"))), list(makeSymbol("DATATYPE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TYPE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("TARGET-BINDING"))), list(makeSymbol("PANEL"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PANEL"), makeSymbol("CYBLACK-BASIC-BLACKBOARD")), makeSymbol("CACHED-BLACKBOARD"), makeSymbol("DATATYPE")))), list(makeSymbol("PWHEN"), makeSymbol("PANEL"), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-TARGET-BINDING"), makeSymbol("SELF"), makeSymbol("TARGET-BINDING")), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-UNBOUND-BINDINGS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("UNBOUND-BINDINGS"))), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-BOUND-BINDINGS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("TARGET-BINDING"), list(makeSymbol("GET-CYBLACK-UNIFICATION-ROBOT-BOUND-BINDINGS"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-POSTINGS"), makeSymbol("PANEL"), makeSymbol("SELF")))))), list(RET, NIL));

    static private final SubLString $str_alt170$___UNIFY__S___Entered_ = makeString("~%(UNIFY ~S): Entered.");



    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_UNIFY_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-UNIFY-METHOD");



    static private final SubLList $list_alt174 = list(makeSymbol("CYBLACK-POSTING"));

    static private final SubLList $list_alt175 = list(list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(VISIT ~S ~S): Unbound bindings are: ~S"), makeSymbol("SELF"), makeSymbol("CYBLACK-POSTING"), list(makeSymbol("GET-CYBLACK-UNIFICATION-ROBOT-UNBOUND-BINDINGS"), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-BINDING"), list(makeSymbol("GET-CYBLACK-UNIFICATION-ROBOT-TARGET-BINDING"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TARGET-BINDING"), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(VISIT ~S): Binding ~S to ~S."), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-VARIABLE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("TARGET-BINDING")), makeSymbol("CYBLACK-POSTING")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-VALUE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("TARGET-BINDING"), makeSymbol("CYBLACK-POSTING")), list(makeSymbol("PUNLESS"), list(makeSymbol("CONTINUE-P"), makeSymbol("SELF")), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("CLONED-ROBOT"), list(makeSymbol("CLONE"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-UR-SET-PARENT-ROBOT"), makeSymbol("CLONED-ROBOT"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-UR-UNIFY"), makeSymbol("CLONED-ROBOT"))))), list(RET, NIL));

    static private final SubLString $str_alt176$___VISIT__S__S___Unbound_bindings = makeString("~%(VISIT ~S ~S): Unbound bindings are: ~S");

    static private final SubLString $str_alt177$___VISIT__S___Binding__S_to__S_ = makeString("~%(VISIT ~S): Binding ~S to ~S.");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_VISIT_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-VISIT-METHOD");

    private static final SubLSymbol GET_PARENT_ROBOT = makeSymbol("GET-PARENT-ROBOT");

    static private final SubLList $list_alt180 = list(list(RET, makeSymbol("PARENT-ROBOT")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_PARENT_ROBOT_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-PARENT-ROBOT-METHOD");

    private static final SubLSymbol SET_PARENT_ROBOT = makeSymbol("SET-PARENT-ROBOT");

    static private final SubLList $list_alt183 = list(makeSymbol("NEW-PARENT-ROBOT"));

    static private final SubLList $list_alt184 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-UNIFICATION-ROBOT-P"), makeSymbol("NEW-PARENT-ROBOT")), makeString("(SET-PARENT-ROBOT ~S): ~S is not an instance of CYBLACK-UNIFICATION-ROBOT."), makeSymbol("SELF"), makeSymbol("NEW-PARENT-ROBOT")), list(makeSymbol("CSETQ"), makeSymbol("PARENT-ROBOT"), makeSymbol("NEW-PARENT-ROBOT")), list(RET, makeSymbol("NEW-PARENT-ROBOT")));

    static private final SubLSymbol $sym185$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_SET_PARENT_ROBOT_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SET-PARENT-ROBOT-METHOD");

    private static final SubLSymbol GET_INSTIGATOR_BOUND = makeSymbol("GET-INSTIGATOR-BOUND");

    static private final SubLList $list_alt188 = list(list(RET, makeSymbol("INSTIGATOR-BOUND")));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_GET_INSTIGATOR_BOUND_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-GET-INSTIGATOR-BOUND-METHOD");

    private static final SubLSymbol SET_INSTIGATOR_BOUND = makeSymbol("SET-INSTIGATOR-BOUND");

    static private final SubLList $list_alt191 = list(makeSymbol("IS-BOUND"));

    static private final SubLList $list_alt192 = list(list(makeSymbol("CSETQ"), makeSymbol("INSTIGATOR-BOUND"), makeSymbol("IS-BOUND")), list(RET, makeSymbol("IS-BOUND")));

    static private final SubLSymbol $sym193$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_SET_INSTIGATOR_BOUND_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SET-INSTIGATOR-BOUND-METHOD");

    private static final SubLSymbol INSTIGATOR_BOUND_P = makeSymbol("INSTIGATOR-BOUND-P");

    static private final SubLList $list_alt196 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CURRENT-ROBOT"), makeSymbol("SELF"))), list(makeSymbol("WHILE"), makeSymbol("CURRENT-ROBOT"), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-UR-GET-INSTIGATOR-BOUND"), makeSymbol("CURRENT-ROBOT")), list(RET, T)), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-ROBOT"), list(makeSymbol("CYBLACK-UR-GET-PARENT-ROBOT"), makeSymbol("CURRENT-ROBOT")))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_INSTIGATOR_BOUND_P_METHOD = makeSymbol("CYBLACK-UNIFICATION-ROBOT-INSTIGATOR-BOUND-P-METHOD");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION");

    static private final SubLList $list_alt199 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym200$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_SATISFIED_B = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-CLASS");

    static private final SubLSymbol $sym201$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_SATISFIED_B = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-INSTANCE");

    static private final SubLList $list_alt202 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SATISFACTION-TYPE"), makeKeyword("ANY")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym203$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTI = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-METHOD");

    static private final SubLSymbol $sym204$CYBLACK_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION_INITIALIZE_ME = makeSymbol("CYBLACK-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-INITIALIZE-METHOD");



    static private final SubLList $list_alt206 = list(list(makeSymbol("THE-POSTING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLONE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-THE-POSTING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-THE-POSTING"), list(makeSymbol("NEW-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FIND-THE-POSTING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-POSTING")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym208$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-CLASS");

    static private final SubLSymbol $sym209$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-INSTANCE");

    static private final SubLList $list_alt210 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("THE-POSTING"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym211$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_INITIALIZE_METHOD = makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-INITIALIZE-METHOD");

    static private final SubLList $list_alt213 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CLONED-SELF"), list(makeSymbol("CLONE"), makeSymbol("SUPER")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-THE-POSTING"), makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT")), makeSymbol("CLONED-SELF"), list(makeSymbol("GET-THE-POSTING"), makeSymbol("SELF"))), list(RET, makeSymbol("CLONED-SELF"))));

    private static final SubLSymbol CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_CLONE_METHOD = makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-CLONE-METHOD");

    private static final SubLSymbol GET_THE_POSTING = makeSymbol("GET-THE-POSTING");

    static private final SubLList $list_alt216 = list(list(RET, makeSymbol("THE-POSTING")));

    private static final SubLSymbol CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_GET_THE_POSTING_METHOD = makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-GET-THE-POSTING-METHOD");

    private static final SubLSymbol SET_THE_POSTING = makeSymbol("SET-THE-POSTING");

    static private final SubLList $list_alt219 = list(makeSymbol("NEW-POSTING"));

    static private final SubLList $list_alt220 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-POSTING")), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("NEW-POSTING"))), makeString("(SET-THE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("NEW-POSTING")), list(makeSymbol("CSETQ"), makeSymbol("THE-POSTING"), makeSymbol("NEW-POSTING")), list(RET, makeSymbol("NEW-POSTING")));

    static private final SubLSymbol $sym221$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-METHOD");

    private static final SubLSymbol CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SET_THE_POSTING_METHOD = makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SET-THE-POSTING-METHOD");

    private static final SubLSymbol FIND_THE_POSTING = makeSymbol("FIND-THE-POSTING");

    static private final SubLList $list_alt224 = list(list(makeSymbol("PWHEN"), makeSymbol("THE-POSTING"), list(RET, makeSymbol("THE-POSTING"))), list(makeSymbol("PWHEN"), makeSymbol("PRECONDITION"), list(makeSymbol("CLET"), list(list(makeSymbol("ENVIRONMENT"), list(makeSymbol("CYBLACK-PATTERN-GET-ENVIRONMENT"), makeSymbol("PRECONDITION")))), list(makeSymbol("PWHEN"), makeSymbol("ENVIRONMENT"), list(makeSymbol("CLET"), list(list(makeSymbol("VALUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("ENVIRONMENT"), list(QUOTE, makeSymbol("?THE-POSTING"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("VALUE"), list(makeSymbol("CNOT"), list(makeSymbol("CYBLACK-UNBOUND-VALUE-P"), makeSymbol("VALUE")))), list(makeSymbol("CSETQ"), makeSymbol("THE-POSTING"), makeSymbol("VALUE")), list(RET, makeSymbol("VALUE"))))))), list(RET, NIL));

    static private final SubLSymbol $sym225$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-METHOD");

    static private final SubLSymbol $sym226$_THE_POSTING = makeSymbol("?THE-POSTING");

    private static final SubLSymbol CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_FIND_THE_POSTING_METHOD = makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-FIND-THE-POSTING-METHOD");

    static private final SubLList $list_alt228 = list(list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(UNIFY ~S): Entered."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("CACHED-BLACKBOARD"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("CACHED-BLACKBOARD"), makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT")), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("CACHED-BLACKBOARD"), makeString("(UNIFY ~S): No blackboard is associated with this unification robot."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("UNBOUND-BINDINGS"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("UNBOUND-BINDINGS"), makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT")), makeSymbol("SELF"))), list(makeSymbol("TARGET-POSTING"), list(makeSymbol("FIND-THE-POSTING"), makeSymbol("SELF"))), list(makeSymbol("TARGET-POSTING-TYPE"), list(makeSymbol("FIF"), makeSymbol("TARGET-POSTING"), list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("TARGET-POSTING")), NIL))), list(makeSymbol("PUNLESS"), makeSymbol("UNBOUND-BINDINGS"), list(makeSymbol("CLET"), list(list(makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("GET-PRECONDITION-PATTERN"), makeSymbol("SELF"))), list(makeSymbol("LOGICAL-FORM"), list(makeSymbol("FIF"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("CYBLACK-PATTERN-GET-LOGICAL-FORM"), makeSymbol("PRECONDITION-PATTERN")), NIL))), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(UNIFY ~S): precondition-pattern -> ~S logical-form -> ~S."), makeSymbol("SELF"), makeSymbol("PRECONDITION-PATTERN"), makeSymbol("LOGICAL-FORM")), list(makeSymbol("PIF"), makeSymbol("LOGICAL-FORM"), list(makeSymbol("CLET"), list(list(makeSymbol("ENVIRONMENT"), list(makeSymbol("CYBLACK-PATTERN-GET-LOCAL-BINDINGS"), makeSymbol("PRECONDITION-PATTERN")))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LOGICAL-FORM"), list(QUOTE, makeSymbol("GET-VALUE")), makeSymbol("ENVIRONMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("SOLUTIONS"), list(makeSymbol("GET-SOLUTIONS"), makeSymbol("SELF"))), list(makeSymbol("COPY-OF-ENVIRONMENT"), list(makeSymbol("FIF"), makeSymbol("ENVIRONMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLONE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("ENVIRONMENT")), NIL))), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(UNIFY ~S): solutions -> ~S."), makeSymbol("SELF"), makeSymbol("SOLUTIONS")), list(makeSymbol("PWHEN"), makeSymbol("COPY-OF-ENVIRONMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("SOLUTIONS"), makeSymbol("COPY-OF-ENVIRONMENT"))), list(makeSymbol("PWHEN"), list(makeSymbol("SATISFIED-P"), makeSymbol("SELF")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("CONTINUE"), makeSymbol("CYBLACK-UNIFICATION-ROBOT")), makeSymbol("SELF"), NIL)), list(RET, NIL)))), list(makeSymbol("PROGN"), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("CONTINUE"), makeSymbol("CYBLACK-UNIFICATION-ROBOT")), makeSymbol("SELF"), NIL), list(RET, NIL)))), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("SATISFIED-P"), makeSymbol("SELF")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("CONTINUE"), makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT")), makeSymbol("SELF"), NIL), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-BINDING"), list(makeSymbol("CAR"), makeSymbol("UNBOUND-BINDINGS"))), list(makeSymbol("DATATYPE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TYPE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("TARGET-BINDING"))), list(makeSymbol("PANEL"), list(makeSymbol("FIF"), makeSymbol("DATATYPE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PANEL"), makeSymbol("CYBLACK-BASIC-BLACKBOARD")), makeSymbol("CACHED-BLACKBOARD"), makeSymbol("DATATYPE")), NIL))), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(UNIFY ~S): Found panel ~S associated with datatype ~S."), makeSymbol("SELF"), makeSymbol("PANEL"), makeSymbol("DATATYPE")), list(makeSymbol("PWHEN"), makeSymbol("PANEL"), list(makeSymbol("PCOND"), list(list(makeSymbol("INSTIGATOR-BOUND-P"), makeSymbol("SELF")), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-TARGET-BINDING"), makeSymbol("SELF"), makeSymbol("TARGET-BINDING")), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-UNBOUND-BINDINGS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("UNBOUND-BINDINGS"))), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-BOUND-BINDINGS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("TARGET-BINDING"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("BOUND-BINDINGS"), makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT")), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-POSTINGS"), makeSymbol("PANEL"), makeSymbol("SELF"))), list(list(makeSymbol("CAND"), makeSymbol("TARGET-POSTING-TYPE"), list(makeSymbol("CYBLACK-DATATYPE-SUBTYPE-P"), makeSymbol("DATATYPE"), makeSymbol("TARGET-POSTING-TYPE"))), list(makeSymbol("SET-INSTIGATOR-BOUND"), makeSymbol("SELF"), T), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-VALUE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("TARGET-BINDING"), makeSymbol("TARGET-POSTING")), list(makeSymbol("SET-UNBOUND-BINDINGS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("UNBOUND-BINDINGS"))), list(makeSymbol("UNIFY"), makeSymbol("SELF")), list(makeSymbol("SET-INSTIGATOR-BOUND"), makeSymbol("SELF"), NIL), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-TYPE-MENTIONED-IN-BINDINGS-P"), list(makeSymbol("CDR"), makeSymbol("UNBOUND-BINDINGS")), makeSymbol("TARGET-POSTING-TYPE")), list(makeSymbol("SET-UNBOUND-BINDINGS"), makeSymbol("SELF"), makeSymbol("UNBOUND-BINDINGS")), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-TARGET-BINDING"), makeSymbol("SELF"), makeSymbol("TARGET-BINDING")), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-UNBOUND-BINDINGS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("UNBOUND-BINDINGS"))), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-BOUND-BINDINGS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("TARGET-BINDING"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("BOUND-BINDINGS"), makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT")), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-POSTINGS"), makeSymbol("PANEL"), makeSymbol("SELF")))), list(T, list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-TARGET-BINDING"), makeSymbol("SELF"), makeSymbol("TARGET-BINDING")), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-UNBOUND-BINDINGS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("UNBOUND-BINDINGS"))), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-BOUND-BINDINGS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("TARGET-BINDING"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("BOUND-BINDINGS"), makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT")), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-POSTINGS"), makeSymbol("PANEL"), makeSymbol("SELF")))))))), list(RET, NIL));

    static private final SubLString $str_alt229$___UNIFY__S___precondition_patter = makeString("~%(UNIFY ~S): precondition-pattern -> ~S logical-form -> ~S.");

    static private final SubLString $str_alt230$___UNIFY__S___solutions_____S_ = makeString("~%(UNIFY ~S): solutions -> ~S.");

    static private final SubLString $str_alt231$___UNIFY__S___Found_panel__S_asso = makeString("~%(UNIFY ~S): Found panel ~S associated with datatype ~S.");

    private static final SubLSymbol CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_UNIFY_METHOD = makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-UNIFY-METHOD");

    static private final SubLList $list_alt233 = list(list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(VISIT ~S ~S): Unbound bindings are: ~S"), makeSymbol("SELF"), makeSymbol("CYBLACK-POSTING"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("UNBOUND-BINDINGS"), makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT")), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-BINDING"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("TARGET-BINDING"), makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT")), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TARGET-BINDING"), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(VISIT ~S): Binding ~S to ~S."), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-VARIABLE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("TARGET-BINDING")), makeSymbol("CYBLACK-POSTING")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-VALUE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("TARGET-BINDING"), makeSymbol("CYBLACK-POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("CLONED-ROBOT"), list(makeSymbol("CLONE"), makeSymbol("SELF")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT-ROBOT"), makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT")), makeSymbol("CLONED-ROBOT"), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("UNIFY"), makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT")), makeSymbol("CLONED-ROBOT"))))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_VISIT_METHOD = makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-VISIT-METHOD");



    static private final SubLSymbol $sym236$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-CLASS");

    static private final SubLSymbol $sym237$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-INSTANCE");

    static private final SubLSymbol $sym238$OUTER_CATCH_FOR_CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_B = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-METHOD");

    static private final SubLSymbol $sym239$CYBLACK_CONSTRAINED_UNIFICATION_ROBOT_SATISFIED_BY_ANY_SOLUTION_I = makeSymbol("CYBLACK-CONSTRAINED-UNIFICATION-ROBOT-SATISFIED-BY-ANY-SOLUTION-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_MONITORING_UNIFICATION_ROBOT = makeSymbol("CYBLACK-MONITORING-UNIFICATION-ROBOT");

    static private final SubLList $list_alt241 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRECONDITION-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRECONDITION-PATTERN"), list(makeSymbol("NEW-PRECONDITION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MONITORING-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MONITORING-PATTERN"), list(makeSymbol("NEW-MONITORING-PATTERN")), makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym242$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONITORING_UNIFICATION_ROBOT_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONITORING-UNIFICATION-ROBOT-CLASS");

    static private final SubLSymbol $sym243$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_MONITORING_UNIFICATION_ROBOT_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-MONITORING-UNIFICATION-ROBOT-INSTANCE");

    static private final SubLList $list_alt244 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_MONITORING_UNIFICATION_ROBOT_INITIALIZE_METHOD = makeSymbol("CYBLACK-MONITORING-UNIFICATION-ROBOT-INITIALIZE-METHOD");

    static private final SubLSymbol $sym246$CYBLACK_MONITORING_UNIFICATION_ROBOT_GET_PRECONDITION_PATTERN_MET = makeSymbol("CYBLACK-MONITORING-UNIFICATION-ROBOT-GET-PRECONDITION-PATTERN-METHOD");

    static private final SubLList $list_alt247 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-MONITORING-PATTERN-P"), makeSymbol("NEW-PRECONDITION-PATTERN")), makeString("(SET-PRECONDITION-PATTERN ~S): ~S is not an instance of CYBLACK-MONITORING-PATTERN."), makeSymbol("SELF"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(RET, list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SUPER"), makeSymbol("NEW-PRECONDITION-PATTERN"))));

    static private final SubLSymbol $sym248$CYBLACK_MONITORING_UNIFICATION_ROBOT_SET_PRECONDITION_PATTERN_MET = makeSymbol("CYBLACK-MONITORING-UNIFICATION-ROBOT-SET-PRECONDITION-PATTERN-METHOD");

    private static final SubLSymbol GET_MONITORING_PATTERN = makeSymbol("GET-MONITORING-PATTERN");

    static private final SubLSymbol $sym250$CYBLACK_MONITORING_UNIFICATION_ROBOT_GET_MONITORING_PATTERN_METHO = makeSymbol("CYBLACK-MONITORING-UNIFICATION-ROBOT-GET-MONITORING-PATTERN-METHOD");

    private static final SubLSymbol SET_MONITORING_PATTERN = makeSymbol("SET-MONITORING-PATTERN");

    static private final SubLList $list_alt252 = list(makeSymbol("NEW-MONITORING-PATTERN"));

    static private final SubLList $list_alt253 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-MONITORING-PATTERN-P"), makeSymbol("NEW-MONITORING-PATTERN")), makeString("(SET-MONITORING-PATTERN ~S): ~S is not an instance of CYBLACK-MONITORING-PATTERN."), makeSymbol("SELF"), makeSymbol("NEW-MONITORING-PATTERN")), list(RET, list(makeSymbol("SET-PRECONDITION-PATTERN"), makeSymbol("SUPER"), makeSymbol("NEW-MONITORING-PATTERN"))));

    static private final SubLSymbol $sym254$CYBLACK_MONITORING_UNIFICATION_ROBOT_SET_MONITORING_PATTERN_METHO = makeSymbol("CYBLACK-MONITORING-UNIFICATION-ROBOT-SET-MONITORING-PATTERN-METHOD");

    private static final SubLSymbol CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS = makeSymbol("CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS");

    static private final SubLList $list_alt256 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PRECONDITION-PATTERN"), list(makeSymbol("NEW-PRECONDITION-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNIFY"), NIL, makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym257$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS-CLASS");

    static private final SubLSymbol $sym258$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS-INSTANCE");

    static private final SubLList $list_alt259 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-SATISFACTION-EXPRESSION-P"), makeSymbol("NEW-PRECONDITION-PATTERN")), makeString("(SET-PRECONDITION-PATTERN ~S): ~S is not an instance of CYBLACK-SATISFACTION-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CSETQ"), makeSymbol("PRECONDITION"), makeSymbol("NEW-PRECONDITION-PATTERN")), list(makeSymbol("CLET"), list(list(makeSymbol("PRECON-ENVIRONMENT"), list(makeSymbol("CYBLACK-SATISFACTION-EXPRESSION-GET-LOCAL-BINDINGS-METHOD"), makeSymbol("NEW-PRECONDITION-PATTERN")))), list(makeSymbol("PIF"), makeSymbol("PRECON-ENVIRONMENT"), list(makeSymbol("CSETQ"), makeSymbol("UNBOUND-BINDINGS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-UNIQUE-NON-APRIORI-BINDINGS"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("PRECON-ENVIRONMENT"), makeKeyword("ADD-POSTING"))), list(makeSymbol("CSETQ"), makeSymbol("UNBOUND-BINDINGS"), NIL))), list(makeSymbol("CSETQ"), makeSymbol("BOUND-BINDINGS"), NIL), list(RET, makeSymbol("NEW-PRECONDITION-PATTERN")));

    static private final SubLSymbol $sym260$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_D = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS-METHOD");

    static private final SubLSymbol $sym261$CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS_SET_PRECO = makeSymbol("CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS-SET-PRECONDITION-PATTERN-METHOD");

    static private final SubLList $list_alt262 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CACHED-BLACKBOARD"), list(makeSymbol("GET-CYBLACK-UNIFICATION-ROBOT-CACHED-BLACKBOARD"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("CACHED-BLACKBOARD"), makeString("(UNIFY ~S): No blackboard is associated with this unification robot."), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("UNBOUND-BINDINGS"), list(makeSymbol("GET-CYBLACK-UNIFICATION-ROBOT-UNBOUND-BINDINGS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("UNBOUND-BINDINGS"), list(makeSymbol("CLET"), list(list(makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("GET-PRECONDITION-PATTERN"), makeSymbol("SELF"))), list(makeSymbol("LOGICAL-FORM"), list(makeSymbol("FIF"), makeSymbol("PRECONDITION-PATTERN"), list(makeSymbol("CYBLACK-SATISFACTION-EXPRESSION-GET-LOGICAL-EXPRESSION-METHOD"), makeSymbol("PRECONDITION-PATTERN")), NIL))), list(makeSymbol("PIF"), makeSymbol("LOGICAL-FORM"), list(makeSymbol("CLET"), list(list(makeSymbol("ENVIRONMENT"), list(makeSymbol("CYBLACK-SATISFACTION-EXPRESSION-GET-LOCAL-BINDINGS-METHOD"), makeSymbol("PRECONDITION-PATTERN")))), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-VALUE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("LOGICAL-FORM"), makeSymbol("ENVIRONMENT")), list(makeSymbol("CLET"), list(list(makeSymbol("SOLUTIONS"), list(makeSymbol("GET-SOLUTIONS"), makeSymbol("SELF"))), list(makeSymbol("COPY-OF-ENVIRONMENT"), list(makeSymbol("FIF"), makeSymbol("ENVIRONMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CLONE"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("ENVIRONMENT")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("COPY-OF-ENVIRONMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD"), makeSymbol("BASIC-END-POINTER-LIST")), makeSymbol("SOLUTIONS"), makeSymbol("COPY-OF-ENVIRONMENT"))), list(makeSymbol("PWHEN"), list(makeSymbol("SATISFIED-P"), makeSymbol("SELF")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("CONTINUE"), makeSymbol("CYBLACK-UNIFICATION-ROBOT")), makeSymbol("SELF"), NIL)), list(RET, NIL)))), list(makeSymbol("PROGN"), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("CONTINUE"), makeSymbol("CYBLACK-UNIFICATION-ROBOT")), makeSymbol("SELF"), NIL), list(RET, NIL)))), list(RET, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("SATISFIED-P"), makeSymbol("SELF")), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("CONTINUE"), makeSymbol("CYBLACK-UNIFICATION-ROBOT")), makeSymbol("SELF"), NIL), list(RET, NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("TARGET-BINDING"), list(makeSymbol("CAR"), makeSymbol("UNBOUND-BINDINGS"))), list(makeSymbol("TARGET-BINDING-VALUE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-VALUE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("TARGET-BINDING"))), list(makeSymbol("DATATYPE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-TYPE"), makeSymbol("CYBLACK-BINDING")), makeSymbol("TARGET-BINDING"))), list(makeSymbol("PANEL"), list(makeSymbol("FIF"), makeSymbol("DATATYPE"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PANEL"), makeSymbol("CYBLACK-BASIC-BLACKBOARD")), makeSymbol("CACHED-BLACKBOARD"), makeSymbol("DATATYPE")), list(makeSymbol("FIF"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("TARGET-BINDING-VALUE")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PANEL"), makeSymbol("CYBLACK-BASIC-BLACKBOARD")), makeSymbol("CACHED-BLACKBOARD"), list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("TARGET-BINDING-VALUE"))), NIL)))), list(makeSymbol("MUST"), makeSymbol("PANEL"), makeString(" Target binding ~S has datatype ~S and no panel."), makeSymbol("TARGET-BINDING"), makeSymbol("DATATYPE")), list(makeSymbol("PWHEN"), makeSymbol("PANEL"), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-TARGET-BINDING"), makeSymbol("SELF"), makeSymbol("TARGET-BINDING")), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-UNBOUND-BINDINGS"), makeSymbol("SELF"), list(makeSymbol("CDR"), makeSymbol("UNBOUND-BINDINGS"))), list(makeSymbol("SET-CYBLACK-UNIFICATION-ROBOT-BOUND-BINDINGS"), makeSymbol("SELF"), list(makeSymbol("CONS"), makeSymbol("TARGET-BINDING"), list(makeSymbol("GET-CYBLACK-UNIFICATION-ROBOT-BOUND-BINDINGS"), makeSymbol("SELF")))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-POSTINGS"), makeSymbol("PANEL"), makeSymbol("SELF")))))), list(RET, NIL));

    static private final SubLSymbol $sym263$OUTER_CATCH_FOR_CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_D = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS-METHOD");

    static private final SubLString $str_alt264$_Target_binding__S_has_datatype__ = makeString(" Target binding ~S has datatype ~S and no panel.");

    static private final SubLSymbol $sym265$CYBLACK_UNIFICATION_ROBOT_FOR_GOAL_SATISFACTION_DAEMONS_UNIFY_MET = makeSymbol("CYBLACK-UNIFICATION-ROBOT-FOR-GOAL-SATISFACTION-DAEMONS-UNIFY-METHOD");

    static private final SubLString $str_alt266$CYBLACK_UR_CLONE___S_is_not_an_in = makeString("CYBLACK-UR-CLONE: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    static private final SubLString $str_alt267$CYBLACK_UR_INSTALL___S_is_not_an_ = makeString("CYBLACK-UR-INSTALL: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    static private final SubLString $str_alt268$CYBLACK_UR_GET_PARENT_ROBOT___S_i = makeString("CYBLACK-UR-GET-PARENT-ROBOT: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    static private final SubLString $str_alt269$CYBLACK_UR_SET_PARENT_ROBOT___S_i = makeString("CYBLACK-UR-SET-PARENT-ROBOT: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    static private final SubLString $str_alt270$CYBLACK_UR_GET_PRECONDITION_PATTE = makeString("CYBLACK-UR-GET-PRECONDITION-PATTERN: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    static private final SubLString $str_alt271$CYBLACK_UR_SET_PRECONDITION_PATTE = makeString("CYBLACK-UR-SET-PRECONDITION-PATTERN: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    static private final SubLString $str_alt272$CYBLACK_UR_GET_SOLUTIONS___S_is_n = makeString("CYBLACK-UR-GET-SOLUTIONS: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    static private final SubLString $str_alt273$CYBLACK_UR_SET_SOLUTIONS___S_is_n = makeString("CYBLACK-UR-SET-SOLUTIONS: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    static private final SubLString $str_alt274$CYBLACK_UR_GET_INSTIGATOR_BOUND__ = makeString("CYBLACK-UR-GET-INSTIGATOR-BOUND: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    static private final SubLString $str_alt275$CYBLACK_UR_SET_INSTIGATOR_BOUND__ = makeString("CYBLACK-UR-SET-INSTIGATOR-BOUND: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    static private final SubLString $str_alt276$CYBLACK_UR_UNIFY___S_is_not_an_in = makeString("CYBLACK-UR-UNIFY: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    static private final SubLString $str_alt277$CYBLACK_UR_VERIFY___S_is_not_an_i = makeString("CYBLACK-UR-VERIFY: ~S is not an instance of CYBLACK-UNIFICATION-ROBOT.");

    private static final SubLSymbol VERIFY = makeSymbol("VERIFY");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_unification_file();
    }

    public void initializeVariables() {
        init_cyblack_unification_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_unification_file();
    }
}

