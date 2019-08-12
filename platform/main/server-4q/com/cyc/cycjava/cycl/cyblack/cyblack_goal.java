/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.enumerations;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-GOAL
 *  source file: /cyc/top/cycl/cyblack/cyblack-goal.lisp
 *  created:     2019/07/03 17:38:45
 */
public final class cyblack_goal extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_goal() {
    }

    public static final SubLFile me = new cyblack_goal();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_goal";

    // // Definitions
    /**
     * Enumerated values of type CYBLACK-GOAL-SATISFACTION-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_goal_satisfaction_types$ = makeSymbol("*VALID-CYBLACK-GOAL-SATISFACTION-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-GOAL-SATISFACTION-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_goal_satisfaction_types() {
        return $valid_cyblack_goal_satisfaction_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-GOAL-SATISFACTION-TYPE enumeration.
     */
    public static final SubLObject cyblack_goal_satisfaction_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_goal_satisfaction_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-GOAL-SATISFACTION-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_goal_satisfaction_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_goal_satisfaction_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_GOAL_SATISFACTION_TYPE, value, CYBLACK_GOAL_SATISFACTION_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-GOAL-SATISFACTION-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_goal_satisfaction_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_goal_satisfaction_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_GOAL_SATISFACTION_TYPE, value, CYBLACK_GOAL_SATISFACTION_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-GOAL-SATISFACTION-TYPE enumeration.
     */
    public static final SubLObject cyblack_goal_satisfaction_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_satisfaction_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_GOAL_SATISFACTION_TYPE_P, value1, CYBLACK_GOAL_SATISFACTION_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_satisfaction_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_GOAL_SATISFACTION_TYPE_P, value2, CYBLACK_GOAL_SATISFACTION_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_goal_satisfaction_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-GOAL-SATISFACTION-TYPE enumeration.
     */
    public static final SubLObject cyblack_goal_satisfaction_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_satisfaction_type_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_GOAL_SATISFACTION_TYPE_P, value1, CYBLACK_GOAL_SATISFACTION_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_satisfaction_type_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_GOAL_SATISFACTION_TYPE_P, value2, CYBLACK_GOAL_SATISFACTION_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_goal_satisfaction_types$.getGlobalValue();
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

    // defconstant
    public static final SubLSymbol $cyblack_goal_default_satisfaction_type$ = makeSymbol("*CYBLACK-GOAL-DEFAULT-SATISFACTION-TYPE*");

    public static final SubLObject cyblack_goal_posting_p(SubLObject cyblack_goal_posting) {
        return interfaces.subloop_instanceof_interface(cyblack_goal_posting, CYBLACK_GOAL_POSTING);
    }

    public static final SubLObject cyblack_goal_posting_template_p(SubLObject cyblack_goal_posting_template) {
        return interfaces.subloop_instanceof_interface(cyblack_goal_posting_template, CYBLACK_GOAL_POSTING_TEMPLATE);
    }

    public static final SubLObject get_cyblack_basic_goal_posting_posting_daemon(SubLObject cyblack_basic_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_goal_posting, $int$26, POSTING_DAEMON);
    }

    public static final SubLObject set_cyblack_basic_goal_posting_posting_daemon(SubLObject cyblack_basic_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_goal_posting, value, $int$26, POSTING_DAEMON);
    }

    public static final SubLObject get_cyblack_basic_goal_posting_matches(SubLObject cyblack_basic_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_goal_posting, $int$25, MATCHES);
    }

    public static final SubLObject set_cyblack_basic_goal_posting_matches(SubLObject cyblack_basic_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_goal_posting, value, $int$25, MATCHES);
    }

    public static final SubLObject get_cyblack_basic_goal_posting_goal_pattern(SubLObject cyblack_basic_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_goal_posting, $int$24, GOAL_PATTERN);
    }

    public static final SubLObject set_cyblack_basic_goal_posting_goal_pattern(SubLObject cyblack_basic_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_goal_posting, value, $int$24, GOAL_PATTERN);
    }

    public static final SubLObject get_cyblack_basic_goal_posting_unparsed_goal_pattern(SubLObject cyblack_basic_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_goal_posting, $int$23, UNPARSED_GOAL_PATTERN);
    }

    public static final SubLObject set_cyblack_basic_goal_posting_unparsed_goal_pattern(SubLObject cyblack_basic_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_goal_posting, value, $int$23, UNPARSED_GOAL_PATTERN);
    }

    public static final SubLObject get_cyblack_basic_goal_posting_timeout(SubLObject cyblack_basic_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_goal_posting, $int$22, TIMEOUT);
    }

    public static final SubLObject set_cyblack_basic_goal_posting_timeout(SubLObject cyblack_basic_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_goal_posting, value, $int$22, TIMEOUT);
    }

    public static final SubLObject get_cyblack_basic_goal_posting_count(SubLObject cyblack_basic_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_goal_posting, $int$21, COUNT);
    }

    public static final SubLObject set_cyblack_basic_goal_posting_count(SubLObject cyblack_basic_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_goal_posting, value, $int$21, COUNT);
    }

    public static final SubLObject get_cyblack_basic_goal_posting_satisfaction_type(SubLObject cyblack_basic_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_goal_posting, TWENTY_INTEGER, SATISFACTION_TYPE);
    }

    public static final SubLObject set_cyblack_basic_goal_posting_satisfaction_type(SubLObject cyblack_basic_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_goal_posting, value, TWENTY_INTEGER, SATISFACTION_TYPE);
    }

    public static final SubLObject cyblack_basic_goal_posting_get_matches_method(SubLObject self) {
        {
            SubLObject template_matches = cyblack_basic_goal_posting_get_matches_internal_method(self);
            if (NIL != template_matches) {
                return NIL;
            } else {
                return subloop_collections.doubly_linked_list_template_get_contents(template_matches);
            }
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_add_match_method(SubLObject self, SubLObject new_instantiated_pattern) {
        {
            SubLObject template_matches = cyblack_basic_goal_posting_get_matches_internal_method(self);
            if (NIL == template_matches) {
                template_matches = object.object_new_method(BASIC_DOUBLY_LINKED_LIST);
            }
            subloop_collections.doubly_linked_list_template_add(template_matches, new_instantiated_pattern);
            cyblack_basic_goal_posting_set_matches_internal_method(self, template_matches);
            if (NIL != cyblack_basic_goal_posting_satisfied_p_method(self)) {
                methods.funcall_instance_method_with_0_args(self, ON_SATISFIED);
            }
            {
                SubLObject template_posting_daemon = cyblack_basic_goal_posting_get_posting_daemon_method(self);
                SubLObject template_panel = (NIL != template_posting_daemon) ? ((SubLObject) (cyblack_blackboard_daemon.cyblack_basic_posting_daemon_get_panel_method(template_posting_daemon))) : NIL;
                if ((NIL != template_posting_daemon) && (NIL != template_panel)) {
                    methods.funcall_instance_method_with_1_args(template_panel, REMOVE_POSTING_DAEMON, template_posting_daemon);
                }
            }
            return new_instantiated_pattern;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_set_goal_pattern_method(SubLObject self, SubLObject new_goal_pattern) {
        if (NIL != cyblack_precondition_pattern.cyblack_satisfaction_expression_p(new_goal_pattern)) {
            cyblack_basic_goal_posting_set_goal_pattern_internal_method(self, new_goal_pattern);
            return new_goal_pattern;
        }
        {
            SubLObject template_application = cyblack_object.cyblack_object_get_application_method(self);
            if (NIL != template_application) {
                {
                    SubLObject template_parser = methods.funcall_instance_method_with_0_args(template_application, GET_PARSER);
                    if (NIL != template_parser) {
                        {
                            SubLObject template_goal_pattern = methods.funcall_instance_method_with_1_args(template_parser, PARSE, new_goal_pattern);
                            if (NIL == template_goal_pattern) {
                                Errors.warn($str_alt73$_SET_GOAL_PATTERN__S___Failed_to_, self, new_goal_pattern);
                                return NIL;
                            }
                            cyblack_basic_goal_posting_set_unparsed_goal_pattern_internal_method(self, copy_tree(new_goal_pattern));
                            cyblack_basic_goal_posting_set_goal_pattern_internal_method(self, template_goal_pattern);
                            return template_goal_pattern;
                        }
                    }
                }
            }
        }
        cyblack_basic_goal_posting_set_unparsed_goal_pattern_internal_method(self, copy_tree(new_goal_pattern));
        cyblack_basic_goal_posting_set_goal_pattern_internal_method(self, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_goal_posting_get_goal_pattern_method(SubLObject self) {
        return cyblack_basic_goal_posting_get_goal_pattern_internal_method(self);
    }

    public static final SubLObject cyblack_basic_goal_posting_set_timeout_method(SubLObject self, SubLObject universal_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == universal_time) || (universal_time.isInteger() && universal_time.numGE(ZERO_INTEGER)))) {
                    Errors.error($str_alt76$_SET_TIMEOUT__S____S_is_not_a_val, self, universal_time);
                }
            }
            cyblack_basic_goal_posting_set_timeout_internal_method(self, universal_time);
            return universal_time;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_get_timeout_method(SubLObject self) {
        return cyblack_basic_goal_posting_get_timeout_internal_method(self);
    }

    public static final SubLObject cyblack_basic_goal_posting_set_count_method(SubLObject self, SubLObject new_count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_count) || (new_count.isInteger() && new_count.numG(ZERO_INTEGER)))) {
                    Errors.error($str_alt79$_SET_COUNT__S____S_is_not_a_valid, new_count);
                }
            }
            cyblack_basic_goal_posting_set_count_internal_method(self, new_count);
            return new_count;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_get_count_method(SubLObject self) {
        return cyblack_basic_goal_posting_get_count_internal_method(self);
    }

    public static final SubLObject cyblack_basic_goal_posting_set_satisfaction_type_method(SubLObject self, SubLObject new_satisfaction_type, SubLObject new_count) {
        if (new_count == UNPROVIDED) {
            new_count = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_satisfaction_type) || (NIL != cyblack_goal_satisfaction_type_p(new_satisfaction_type)))) {
                    Errors.error($str_alt82$_SET_SATISFACTION_TYPE__S____S_is, self, new_satisfaction_type);
                }
            }
            cyblack_basic_goal_posting_set_satisfaction_type_internal_method(self, new_satisfaction_type);
            cyblack_basic_goal_posting_set_count_method(self, new_count);
            return new_satisfaction_type;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_get_satisfaction_type_method(SubLObject self) {
        return cyblack_basic_goal_posting_get_satisfaction_type_internal_method(self);
    }

    public static final SubLObject cyblack_basic_goal_posting_initialize_qua_cyblack_goal_posting_template_method(SubLObject self) {
        cyblack_basic_goal_posting_set_satisfaction_type_internal_method(self, $cyblack_goal_default_satisfaction_type$.getGlobalValue());
        cyblack_basic_goal_posting_set_count_internal_method(self, NIL);
        cyblack_basic_goal_posting_set_timeout_internal_method(self, NIL);
        cyblack_basic_goal_posting_set_goal_pattern_internal_method(self, NIL);
        cyblack_basic_goal_posting_set_matches_internal_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_goal_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_goal_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_GOAL_POSTING, SATISFACTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_GOAL_POSTING, COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_GOAL_POSTING, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_GOAL_POSTING, UNPARSED_GOAL_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_GOAL_POSTING, GOAL_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_GOAL_POSTING, MATCHES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_GOAL_POSTING, POSTING_DAEMON, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_goal_posting_p(SubLObject cyblack_basic_goal_posting) {
        return classes.subloop_instanceof_class(cyblack_basic_goal_posting, CYBLACK_BASIC_GOAL_POSTING);
    }

    public static final SubLObject cyblack_basic_goal_posting_initialize_method(SubLObject self) {
        cyblack_posting.cyblack_basic_posting_initialize_method(self);
        cyblack_basic_goal_posting_initialize_qua_cyblack_goal_posting_template_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_basic_goal_posting_get_satisfaction_type_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject satisfaction_type = get_cyblack_basic_goal_posting_satisfaction_type(self);
            try {
                try {
                    sublisp_throw($sym123$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, satisfaction_type);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_satisfaction_type(self, satisfaction_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym123$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_set_satisfaction_type_internal_method(SubLObject self, SubLObject new_satisfaction_type) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject satisfaction_type = get_cyblack_basic_goal_posting_satisfaction_type(self);
            try {
                try {
                    satisfaction_type = new_satisfaction_type;
                    sublisp_throw($sym128$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, new_satisfaction_type);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_satisfaction_type(self, satisfaction_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_satisfied_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject matches = get_cyblack_basic_goal_posting_matches(self);
            SubLObject satisfaction_type = get_cyblack_basic_goal_posting_satisfaction_type(self);
            try {
                try {
                    {
                        SubLObject pcase_var = satisfaction_type;
                        if (pcase_var.eql($ANY)) {
                            sublisp_throw($sym132$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, NIL != matches ? ((SubLObject) (T)) : NIL);
                        } else
                            if (pcase_var.eql($ALL)) {
                                sublisp_throw($sym132$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, NIL);
                            } else {
                                if (satisfaction_type.isCons()) {
                                    {
                                        SubLObject type = satisfaction_type.first();
                                        SubLObject args = satisfaction_type.rest();
                                        SubLObject pcase_var_1 = type;
                                        if (pcase_var_1.eql($AT_LEAST)) {
                                            {
                                                SubLObject minimum_match_count = (args.isCons()) ? ((SubLObject) (args.first())) : NIL;
                                                if (minimum_match_count.isInteger()) {
                                                    sublisp_throw($sym132$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, list_utilities.lengthGE(matches, minimum_match_count, UNPROVIDED));
                                                }
                                            }
                                        } else {
                                            sublisp_throw($sym132$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, NIL);
                                        }
                                    }
                                } else {
                                    sublisp_throw($sym132$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, NIL);
                                }
                            }

                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_matches(self, matches);
                            set_cyblack_basic_goal_posting_satisfaction_type(self, satisfaction_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym132$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_on_satisfied_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_basic_goal_posting_get_count_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject count = get_cyblack_basic_goal_posting_count(self);
            try {
                try {
                    sublisp_throw($sym140$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_count(self, count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym140$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_set_count_internal_method(SubLObject self, SubLObject new_count) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject count = get_cyblack_basic_goal_posting_count(self);
            try {
                try {
                    count = new_count;
                    sublisp_throw($sym144$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, new_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_count(self, count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym144$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_get_timeout_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject timeout = get_cyblack_basic_goal_posting_timeout(self);
            try {
                try {
                    sublisp_throw($sym148$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, timeout);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_timeout(self, timeout);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym148$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_set_timeout_internal_method(SubLObject self, SubLObject universal_time) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject timeout = get_cyblack_basic_goal_posting_timeout(self);
            try {
                try {
                    timeout = universal_time;
                    sublisp_throw($sym152$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, universal_time);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_timeout(self, timeout);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym152$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_get_unparsed_goal_pattern_internal_method(SubLObject self) {
        {
            SubLObject unparsed_goal_pattern = get_cyblack_basic_goal_posting_unparsed_goal_pattern(self);
            return unparsed_goal_pattern;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_set_unparsed_goal_pattern_internal_method(SubLObject self, SubLObject new_unparsed_goal_pattern) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject unparsed_goal_pattern = get_cyblack_basic_goal_posting_unparsed_goal_pattern(self);
            try {
                try {
                    unparsed_goal_pattern = new_unparsed_goal_pattern;
                    sublisp_throw($sym161$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, new_unparsed_goal_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_unparsed_goal_pattern(self, unparsed_goal_pattern);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym161$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_get_goal_pattern_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject goal_pattern = get_cyblack_basic_goal_posting_goal_pattern(self);
            try {
                try {
                    sublisp_throw($sym165$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, goal_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_goal_pattern(self, goal_pattern);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym165$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_set_goal_pattern_internal_method(SubLObject self, SubLObject new_goal_pattern) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject goal_pattern = get_cyblack_basic_goal_posting_goal_pattern(self);
            try {
                try {
                    goal_pattern = new_goal_pattern;
                    sublisp_throw($sym169$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, new_goal_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_goal_pattern(self, goal_pattern);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym169$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_get_matches_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject matches = get_cyblack_basic_goal_posting_matches(self);
            try {
                try {
                    sublisp_throw($sym173$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, matches);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_matches(self, matches);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym173$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_set_matches_internal_method(SubLObject self, SubLObject new_matches) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject matches = get_cyblack_basic_goal_posting_matches(self);
            try {
                try {
                    matches = new_matches;
                    sublisp_throw($sym178$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, new_matches);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_matches(self, matches);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym178$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_on_post_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_goal_posting_method = NIL;
            SubLObject posting_daemon = get_cyblack_basic_goal_posting_posting_daemon(self);
            SubLObject goal_pattern = get_cyblack_basic_goal_posting_goal_pattern(self);
            SubLObject datatype = cyblack_posting.get_cyblack_basic_posting_datatype(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_on_post_method(self);
                    posting_daemon = object.new_class_instance(CYBLACK_GOAL_SATISFACTION_DAEMON);
                    cyblack_blackboard_daemon.cyblack_basic_posting_daemon_set_application_method(posting_daemon, application);
                    methods.funcall_instance_method_with_1_args(posting_daemon, SET_GOAL_POSTING, self);
                    {
                        SubLObject new_local_environment = object.new_class_instance(CYBLACK_ENVIRONMENT);
                        cyblack_precondition_pattern.cyblack_environment_push_typed_local_binding_method(new_local_environment, $sym186$_SELF, cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(self), self, T);
                        cyblack_precondition_pattern.cyblack_environment_push_local_binding_method(new_local_environment, $sym187$_THE_POSTING, NIL, T);
                        methods.funcall_instance_method_with_1_args(posting_daemon, SET_LOCAL_ENVIRONMENT, new_local_environment);
                    }
                    if (NIL != goal_pattern) {
                        {
                            SubLObject datatype_bag = methods.funcall_instance_method_with_0_args(goal_pattern, GET_DATATYPE_BAG);
                            if (NIL != datatype_bag) {
                                {
                                    SubLObject unique_datatypes = methods.funcall_instance_method_with_0_args(datatype_bag, GET_UNIQUE_ELEMENTS);
                                    if (NIL != unique_datatypes) {
                                        {
                                            SubLObject blackboard = (NIL != application) ? ((SubLObject) (cyblack_application.cyblack_application_get_blackboard(application))) : NIL;
                                            if (NIL != blackboard) {
                                                {
                                                    SubLObject panels = NIL;
                                                    SubLObject list_expression = unique_datatypes;
                                                    if (NIL == list_expression) {
                                                        panels = NIL;
                                                    } else
                                                        if (list_expression.isAtom()) {
                                                            panels = list(list_expression);
                                                        } else
                                                            if (NIL == list_expression.rest()) {
                                                                {
                                                                    SubLObject datatype_2 = list_expression.first();
                                                                    panels = list(cyblack_datatype.cyblack_datatype_get_panel(datatype_2, blackboard, UNPROVIDED));
                                                                }
                                                            } else {
                                                                {
                                                                    SubLObject tail_cons = NIL;
                                                                    SubLObject result = NIL;
                                                                    {
                                                                        SubLObject datatype_3 = list_expression.first();
                                                                        panels = list(cyblack_datatype.cyblack_datatype_get_panel(datatype_3, blackboard, UNPROVIDED));
                                                                        tail_cons = panels;
                                                                    }
                                                                    {
                                                                        SubLObject cdolist_list_var = list_expression.rest();
                                                                        SubLObject datatype_4 = NIL;
                                                                        for (datatype_4 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datatype_4 = cdolist_list_var.first()) {
                                                                            result = list(cyblack_datatype.cyblack_datatype_get_panel(datatype_4, blackboard, UNPROVIDED));
                                                                            rplacd(tail_cons, result);
                                                                            tail_cons = result;
                                                                        }
                                                                    }
                                                                }
                                                            }


                                                    {
                                                        SubLObject cdolist_list_var = panels;
                                                        SubLObject current_panel = NIL;
                                                        for (current_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_panel = cdolist_list_var.first()) {
                                                            methods.funcall_instance_method_with_1_args(current_panel, ADD_POSTING_DAEMON, posting_daemon);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    sublisp_throw($sym182$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_goal_posting_posting_daemon(self, posting_daemon);
                            set_cyblack_basic_goal_posting_goal_pattern(self, goal_pattern);
                            cyblack_posting.set_cyblack_basic_posting_datatype(self, datatype);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym182$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_basic_goal_posting_get_posting_daemon_method(SubLObject self) {
        {
            SubLObject posting_daemon = get_cyblack_basic_goal_posting_posting_daemon(self);
            return posting_daemon;
        }
    }

    public static final SubLObject get_cyblack_ordinal_goal_posting_posting_daemon(SubLObject cyblack_ordinal_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_ordinal_goal_posting, $int$27, POSTING_DAEMON);
    }

    public static final SubLObject set_cyblack_ordinal_goal_posting_posting_daemon(SubLObject cyblack_ordinal_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_ordinal_goal_posting, value, $int$27, POSTING_DAEMON);
    }

    public static final SubLObject get_cyblack_ordinal_goal_posting_matches(SubLObject cyblack_ordinal_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_ordinal_goal_posting, $int$26, MATCHES);
    }

    public static final SubLObject set_cyblack_ordinal_goal_posting_matches(SubLObject cyblack_ordinal_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_ordinal_goal_posting, value, $int$26, MATCHES);
    }

    public static final SubLObject get_cyblack_ordinal_goal_posting_goal_pattern(SubLObject cyblack_ordinal_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_ordinal_goal_posting, $int$25, GOAL_PATTERN);
    }

    public static final SubLObject set_cyblack_ordinal_goal_posting_goal_pattern(SubLObject cyblack_ordinal_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_ordinal_goal_posting, value, $int$25, GOAL_PATTERN);
    }

    public static final SubLObject get_cyblack_ordinal_goal_posting_unparsed_goal_pattern(SubLObject cyblack_ordinal_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_ordinal_goal_posting, $int$24, UNPARSED_GOAL_PATTERN);
    }

    public static final SubLObject set_cyblack_ordinal_goal_posting_unparsed_goal_pattern(SubLObject cyblack_ordinal_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_ordinal_goal_posting, value, $int$24, UNPARSED_GOAL_PATTERN);
    }

    public static final SubLObject get_cyblack_ordinal_goal_posting_timeout(SubLObject cyblack_ordinal_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_ordinal_goal_posting, $int$23, TIMEOUT);
    }

    public static final SubLObject set_cyblack_ordinal_goal_posting_timeout(SubLObject cyblack_ordinal_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_ordinal_goal_posting, value, $int$23, TIMEOUT);
    }

    public static final SubLObject get_cyblack_ordinal_goal_posting_count(SubLObject cyblack_ordinal_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_ordinal_goal_posting, $int$22, COUNT);
    }

    public static final SubLObject set_cyblack_ordinal_goal_posting_count(SubLObject cyblack_ordinal_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_ordinal_goal_posting, value, $int$22, COUNT);
    }

    public static final SubLObject get_cyblack_ordinal_goal_posting_satisfaction_type(SubLObject cyblack_ordinal_goal_posting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_ordinal_goal_posting, $int$21, SATISFACTION_TYPE);
    }

    public static final SubLObject set_cyblack_ordinal_goal_posting_satisfaction_type(SubLObject cyblack_ordinal_goal_posting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_ordinal_goal_posting, value, $int$21, SATISFACTION_TYPE);
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_matches_method(SubLObject self) {
        {
            SubLObject template_matches = cyblack_ordinal_goal_posting_get_matches_internal_method(self);
            if (NIL != template_matches) {
                return NIL;
            } else {
                return subloop_collections.doubly_linked_list_template_get_contents(template_matches);
            }
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_add_match_method(SubLObject self, SubLObject new_instantiated_pattern) {
        {
            SubLObject template_matches = cyblack_ordinal_goal_posting_get_matches_internal_method(self);
            if (NIL == template_matches) {
                template_matches = object.object_new_method(BASIC_DOUBLY_LINKED_LIST);
            }
            subloop_collections.doubly_linked_list_template_add(template_matches, new_instantiated_pattern);
            cyblack_ordinal_goal_posting_set_matches_internal_method(self, template_matches);
            if (NIL != cyblack_ordinal_goal_posting_satisfied_p_method(self)) {
                methods.funcall_instance_method_with_0_args(self, ON_SATISFIED);
            }
            {
                SubLObject template_posting_daemon = cyblack_ordinal_goal_posting_get_posting_daemon_method(self);
                SubLObject template_panel = (NIL != template_posting_daemon) ? ((SubLObject) (cyblack_blackboard_daemon.cyblack_basic_posting_daemon_get_panel_method(template_posting_daemon))) : NIL;
                if ((NIL != template_posting_daemon) && (NIL != template_panel)) {
                    methods.funcall_instance_method_with_1_args(template_panel, REMOVE_POSTING_DAEMON, template_posting_daemon);
                }
            }
            return new_instantiated_pattern;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_set_goal_pattern_method(SubLObject self, SubLObject new_goal_pattern) {
        if (NIL != cyblack_precondition_pattern.cyblack_satisfaction_expression_p(new_goal_pattern)) {
            cyblack_ordinal_goal_posting_set_goal_pattern_internal_method(self, new_goal_pattern);
            return new_goal_pattern;
        }
        {
            SubLObject template_application = cyblack_object.cyblack_object_get_application_method(self);
            if (NIL != template_application) {
                {
                    SubLObject template_parser = methods.funcall_instance_method_with_0_args(template_application, GET_PARSER);
                    if (NIL != template_parser) {
                        {
                            SubLObject template_goal_pattern = methods.funcall_instance_method_with_1_args(template_parser, PARSE, new_goal_pattern);
                            if (NIL == template_goal_pattern) {
                                Errors.warn($str_alt73$_SET_GOAL_PATTERN__S___Failed_to_, self, new_goal_pattern);
                                return NIL;
                            }
                            cyblack_ordinal_goal_posting_set_unparsed_goal_pattern_internal_method(self, copy_tree(new_goal_pattern));
                            cyblack_ordinal_goal_posting_set_goal_pattern_internal_method(self, template_goal_pattern);
                            return template_goal_pattern;
                        }
                    }
                }
            }
        }
        cyblack_ordinal_goal_posting_set_unparsed_goal_pattern_internal_method(self, copy_tree(new_goal_pattern));
        cyblack_ordinal_goal_posting_set_goal_pattern_internal_method(self, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_goal_pattern_method(SubLObject self) {
        return cyblack_ordinal_goal_posting_get_goal_pattern_internal_method(self);
    }

    public static final SubLObject cyblack_ordinal_goal_posting_set_timeout_method(SubLObject self, SubLObject universal_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == universal_time) || (universal_time.isInteger() && universal_time.numGE(ZERO_INTEGER)))) {
                    Errors.error($str_alt76$_SET_TIMEOUT__S____S_is_not_a_val, self, universal_time);
                }
            }
            cyblack_ordinal_goal_posting_set_timeout_internal_method(self, universal_time);
            return universal_time;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_timeout_method(SubLObject self) {
        return cyblack_ordinal_goal_posting_get_timeout_internal_method(self);
    }

    public static final SubLObject cyblack_ordinal_goal_posting_set_count_method(SubLObject self, SubLObject new_count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_count) || (new_count.isInteger() && new_count.numG(ZERO_INTEGER)))) {
                    Errors.error($str_alt79$_SET_COUNT__S____S_is_not_a_valid, new_count);
                }
            }
            cyblack_ordinal_goal_posting_set_count_internal_method(self, new_count);
            return new_count;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_count_method(SubLObject self) {
        return cyblack_ordinal_goal_posting_get_count_internal_method(self);
    }

    public static final SubLObject cyblack_ordinal_goal_posting_set_satisfaction_type_method(SubLObject self, SubLObject new_satisfaction_type, SubLObject new_count) {
        if (new_count == UNPROVIDED) {
            new_count = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_satisfaction_type) || (NIL != cyblack_goal_satisfaction_type_p(new_satisfaction_type)))) {
                    Errors.error($str_alt82$_SET_SATISFACTION_TYPE__S____S_is, self, new_satisfaction_type);
                }
            }
            cyblack_ordinal_goal_posting_set_satisfaction_type_internal_method(self, new_satisfaction_type);
            cyblack_ordinal_goal_posting_set_count_method(self, new_count);
            return new_satisfaction_type;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_satisfaction_type_method(SubLObject self) {
        return cyblack_ordinal_goal_posting_get_satisfaction_type_internal_method(self);
    }

    public static final SubLObject cyblack_ordinal_goal_posting_initialize_qua_cyblack_goal_posting_template_method(SubLObject self) {
        cyblack_ordinal_goal_posting_set_satisfaction_type_internal_method(self, $cyblack_goal_default_satisfaction_type$.getGlobalValue());
        cyblack_ordinal_goal_posting_set_count_internal_method(self, NIL);
        cyblack_ordinal_goal_posting_set_timeout_internal_method(self, NIL);
        cyblack_ordinal_goal_posting_set_goal_pattern_internal_method(self, NIL);
        cyblack_ordinal_goal_posting_set_matches_internal_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_ordinal_goal_posting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_ordinal_goal_posting_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SUPPORT, QUA_LIST_ELEMENT_SELF_DELETION_MODE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IMMUTABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, STRINGIFY_GUIDS, NIL);
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, PANEL, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, SUPPORT_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVATION_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, KSI, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, IS_VALID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, INTERNAL_PID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_POSTING, ATTRIBUTE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ORDINAL_POSTING, ORD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ORDINAL_GOAL_POSTING, SATISFACTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ORDINAL_GOAL_POSTING, COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ORDINAL_GOAL_POSTING, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ORDINAL_GOAL_POSTING, UNPARSED_GOAL_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ORDINAL_GOAL_POSTING, GOAL_PATTERN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ORDINAL_GOAL_POSTING, MATCHES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_ORDINAL_GOAL_POSTING, POSTING_DAEMON, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_ordinal_goal_posting_p(SubLObject cyblack_ordinal_goal_posting) {
        return classes.subloop_instanceof_class(cyblack_ordinal_goal_posting, CYBLACK_ORDINAL_GOAL_POSTING);
    }

    public static final SubLObject cyblack_ordinal_goal_posting_initialize_method(SubLObject self) {
        cyblack_posting.cyblack_ordinal_posting_initialize_method(self);
        cyblack_ordinal_goal_posting_initialize_qua_cyblack_goal_posting_template_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_satisfaction_type_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject satisfaction_type = get_cyblack_ordinal_goal_posting_satisfaction_type(self);
            try {
                try {
                    sublisp_throw($sym214$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, satisfaction_type);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_satisfaction_type(self, satisfaction_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym214$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_set_satisfaction_type_internal_method(SubLObject self, SubLObject new_satisfaction_type) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject satisfaction_type = get_cyblack_ordinal_goal_posting_satisfaction_type(self);
            try {
                try {
                    satisfaction_type = new_satisfaction_type;
                    sublisp_throw($sym216$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, new_satisfaction_type);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_satisfaction_type(self, satisfaction_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym216$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_satisfied_p_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject matches = get_cyblack_ordinal_goal_posting_matches(self);
            SubLObject satisfaction_type = get_cyblack_ordinal_goal_posting_satisfaction_type(self);
            try {
                try {
                    {
                        SubLObject pcase_var = satisfaction_type;
                        if (pcase_var.eql($ANY)) {
                            sublisp_throw($sym218$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, NIL != matches ? ((SubLObject) (T)) : NIL);
                        } else
                            if (pcase_var.eql($ALL)) {
                                sublisp_throw($sym218$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, NIL);
                            } else {
                                if (satisfaction_type.isCons()) {
                                    {
                                        SubLObject type = satisfaction_type.first();
                                        SubLObject args = satisfaction_type.rest();
                                        SubLObject pcase_var_5 = type;
                                        if (pcase_var_5.eql($AT_LEAST)) {
                                            {
                                                SubLObject minimum_match_count = (args.isCons()) ? ((SubLObject) (args.first())) : NIL;
                                                if (minimum_match_count.isInteger()) {
                                                    sublisp_throw($sym218$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, list_utilities.lengthGE(matches, minimum_match_count, UNPROVIDED));
                                                }
                                            }
                                        } else {
                                            sublisp_throw($sym218$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, NIL);
                                        }
                                    }
                                } else {
                                    sublisp_throw($sym218$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, NIL);
                                }
                            }

                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_matches(self, matches);
                            set_cyblack_ordinal_goal_posting_satisfaction_type(self, satisfaction_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym218$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_on_satisfied_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_count_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject count = get_cyblack_ordinal_goal_posting_count(self);
            try {
                try {
                    sublisp_throw($sym221$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_count(self, count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym221$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_set_count_internal_method(SubLObject self, SubLObject new_count) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject count = get_cyblack_ordinal_goal_posting_count(self);
            try {
                try {
                    count = new_count;
                    sublisp_throw($sym223$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, new_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_count(self, count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym223$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_timeout_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject timeout = get_cyblack_ordinal_goal_posting_timeout(self);
            try {
                try {
                    sublisp_throw($sym225$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, timeout);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_timeout(self, timeout);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym225$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_set_timeout_internal_method(SubLObject self, SubLObject universal_time) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject timeout = get_cyblack_ordinal_goal_posting_timeout(self);
            try {
                try {
                    timeout = universal_time;
                    sublisp_throw($sym227$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, universal_time);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_timeout(self, timeout);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym227$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_unparsed_goal_pattern_internal_method(SubLObject self) {
        {
            SubLObject unparsed_goal_pattern = get_cyblack_ordinal_goal_posting_unparsed_goal_pattern(self);
            return unparsed_goal_pattern;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_set_unparsed_goal_pattern_internal_method(SubLObject self, SubLObject new_unparsed_goal_pattern) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject unparsed_goal_pattern = get_cyblack_ordinal_goal_posting_unparsed_goal_pattern(self);
            try {
                try {
                    unparsed_goal_pattern = new_unparsed_goal_pattern;
                    sublisp_throw($sym230$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, new_unparsed_goal_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_unparsed_goal_pattern(self, unparsed_goal_pattern);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym230$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_goal_pattern_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject goal_pattern = get_cyblack_ordinal_goal_posting_goal_pattern(self);
            try {
                try {
                    sublisp_throw($sym232$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, goal_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_goal_pattern(self, goal_pattern);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym232$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_set_goal_pattern_internal_method(SubLObject self, SubLObject new_goal_pattern) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject goal_pattern = get_cyblack_ordinal_goal_posting_goal_pattern(self);
            try {
                try {
                    goal_pattern = new_goal_pattern;
                    sublisp_throw($sym234$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, new_goal_pattern);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_goal_pattern(self, goal_pattern);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym234$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_matches_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject matches = get_cyblack_ordinal_goal_posting_matches(self);
            try {
                try {
                    sublisp_throw($sym236$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, matches);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_matches(self, matches);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym236$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_set_matches_internal_method(SubLObject self, SubLObject new_matches) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject matches = get_cyblack_ordinal_goal_posting_matches(self);
            try {
                try {
                    matches = new_matches;
                    sublisp_throw($sym238$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, new_matches);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_matches(self, matches);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym238$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_on_post_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_ordinal_goal_posting_method = NIL;
            SubLObject posting_daemon = get_cyblack_ordinal_goal_posting_posting_daemon(self);
            SubLObject goal_pattern = get_cyblack_ordinal_goal_posting_goal_pattern(self);
            SubLObject datatype = cyblack_posting.get_cyblack_basic_posting_datatype(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_on_post_method(self);
                    posting_daemon = object.new_class_instance(CYBLACK_GOAL_SATISFACTION_DAEMON);
                    cyblack_blackboard_daemon.cyblack_basic_posting_daemon_set_application_method(posting_daemon, application);
                    methods.funcall_instance_method_with_1_args(posting_daemon, SET_GOAL_POSTING, self);
                    {
                        SubLObject new_local_environment = object.new_class_instance(CYBLACK_ENVIRONMENT);
                        cyblack_precondition_pattern.cyblack_environment_push_typed_local_binding_method(new_local_environment, $sym186$_SELF, cyblack_posting_dispatch_functions.cyblack_posting_get_datatype(self), self, T);
                        cyblack_precondition_pattern.cyblack_environment_push_local_binding_method(new_local_environment, $sym187$_THE_POSTING, NIL, T);
                        methods.funcall_instance_method_with_1_args(posting_daemon, SET_LOCAL_ENVIRONMENT, new_local_environment);
                    }
                    if (NIL != goal_pattern) {
                        {
                            SubLObject datatype_bag = methods.funcall_instance_method_with_0_args(goal_pattern, GET_DATATYPE_BAG);
                            if (NIL != datatype_bag) {
                                {
                                    SubLObject unique_datatypes = methods.funcall_instance_method_with_0_args(datatype_bag, GET_UNIQUE_ELEMENTS);
                                    if (NIL != unique_datatypes) {
                                        {
                                            SubLObject blackboard = (NIL != application) ? ((SubLObject) (cyblack_application.cyblack_application_get_blackboard(application))) : NIL;
                                            if (NIL != blackboard) {
                                                {
                                                    SubLObject panels = NIL;
                                                    SubLObject list_expression = unique_datatypes;
                                                    if (NIL == list_expression) {
                                                        panels = NIL;
                                                    } else
                                                        if (list_expression.isAtom()) {
                                                            panels = list(list_expression);
                                                        } else
                                                            if (NIL == list_expression.rest()) {
                                                                {
                                                                    SubLObject datatype_6 = list_expression.first();
                                                                    panels = list(cyblack_datatype.cyblack_datatype_get_panel(datatype_6, blackboard, UNPROVIDED));
                                                                }
                                                            } else {
                                                                {
                                                                    SubLObject tail_cons = NIL;
                                                                    SubLObject result = NIL;
                                                                    {
                                                                        SubLObject datatype_7 = list_expression.first();
                                                                        panels = list(cyblack_datatype.cyblack_datatype_get_panel(datatype_7, blackboard, UNPROVIDED));
                                                                        tail_cons = panels;
                                                                    }
                                                                    {
                                                                        SubLObject cdolist_list_var = list_expression.rest();
                                                                        SubLObject datatype_8 = NIL;
                                                                        for (datatype_8 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datatype_8 = cdolist_list_var.first()) {
                                                                            result = list(cyblack_datatype.cyblack_datatype_get_panel(datatype_8, blackboard, UNPROVIDED));
                                                                            rplacd(tail_cons, result);
                                                                            tail_cons = result;
                                                                        }
                                                                    }
                                                                }
                                                            }


                                                    {
                                                        SubLObject cdolist_list_var = panels;
                                                        SubLObject current_panel = NIL;
                                                        for (current_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_panel = cdolist_list_var.first()) {
                                                            methods.funcall_instance_method_with_1_args(current_panel, ADD_POSTING_DAEMON, posting_daemon);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    sublisp_throw($sym241$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_ordinal_goal_posting_posting_daemon(self, posting_daemon);
                            set_cyblack_ordinal_goal_posting_goal_pattern(self, goal_pattern);
                            cyblack_posting.set_cyblack_basic_posting_datatype(self, datatype);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_ordinal_goal_posting_method = Errors.handleThrowable(ccatch_env_var, $sym241$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD);
            }
            return catch_var_for_cyblack_ordinal_goal_posting_method;
        }
    }

    public static final SubLObject cyblack_ordinal_goal_posting_get_posting_daemon_method(SubLObject self) {
        {
            SubLObject posting_daemon = get_cyblack_ordinal_goal_posting_posting_daemon(self);
            return posting_daemon;
        }
    }

    public static final SubLObject cyblack_goal_posting_get_satisfaction_type(SubLObject cyblack_goal_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt244$CYBLACK_GOAL_POSTING_GET_SATISFAC, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_get_satisfaction_type_method(cyblack_goal_posting);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_get_satisfaction_type_method(cyblack_goal_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_goal_posting, GET_SATISFACTION_TYPE);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_set_satisfaction_type(SubLObject cyblack_goal_posting, SubLObject new_satisfaction_type, SubLObject new_count) {
        if (new_count == UNPROVIDED) {
            new_count = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt245$CYBLACK_GOAL_POSTING_SET_SATISFAC, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_set_satisfaction_type_method(cyblack_goal_posting, new_satisfaction_type, new_count);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_set_satisfaction_type_method(cyblack_goal_posting, new_satisfaction_type, new_count);
                } else {
                    return methods.funcall_instance_method_with_2_args(cyblack_goal_posting, SET_SATISFACTION_TYPE, new_satisfaction_type, new_count);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_satisfied_p(SubLObject cyblack_goal_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt246$CYBLACK_GOAL_POSTING_SATISFIED_P_, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_satisfied_p_method(cyblack_goal_posting);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_satisfied_p_method(cyblack_goal_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_goal_posting, SATISFIED_P);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_on_satisfied(SubLObject cyblack_goal_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt247$CYBLACK_GOAL_POSTING_ON_SATISFIED, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_on_satisfied_method(cyblack_goal_posting);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_on_satisfied_method(cyblack_goal_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_goal_posting, ON_SATISFIED);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_get_count(SubLObject cyblack_goal_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt248$CYBLACK_GOAL_POSTING_GET_COUNT___, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_get_count_method(cyblack_goal_posting);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_get_count_method(cyblack_goal_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_goal_posting, GET_COUNT);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_set_count(SubLObject cyblack_goal_posting, SubLObject new_count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt249$CYBLACK_GOAL_POSTING_SET_COUNT___, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_set_count_method(cyblack_goal_posting, new_count);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_set_count_method(cyblack_goal_posting, new_count);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_goal_posting, SET_COUNT, new_count);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_get_timeout(SubLObject cyblack_goal_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt250$CYBLACK_GOAL_POSTING_GET_TIMEOUT_, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_get_timeout_method(cyblack_goal_posting);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_get_timeout_method(cyblack_goal_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_goal_posting, GET_TIMEOUT);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_set_timeout(SubLObject cyblack_goal_posting, SubLObject univeral_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt251$CYBLACK_GOAL_POSTING_SET_TIMEOUT_, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_set_timeout_method(cyblack_goal_posting, univeral_time);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_set_timeout_method(cyblack_goal_posting, univeral_time);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_goal_posting, SET_TIMEOUT, univeral_time);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_set_delta_timeout(SubLObject cyblack_goal_posting, SubLObject time_delta_in_seconds) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt252$CYBLACK_GOAL_POSTING_SET_DELTA_TI, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return methods.funcall_instance_method_with_1_args(cyblack_goal_posting, SET_DELTA_TIMEOUT, time_delta_in_seconds);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return methods.funcall_instance_method_with_1_args(cyblack_goal_posting, SET_DELTA_TIMEOUT, time_delta_in_seconds);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_goal_posting, SET_DELTA_TIMEOUT, time_delta_in_seconds);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_get_goal_pattern(SubLObject cyblack_goal_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt253$CYBLACK_GOAL_POSTING_GET_GOAL_PAT, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_get_goal_pattern_method(cyblack_goal_posting);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_get_goal_pattern_method(cyblack_goal_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_goal_posting, GET_GOAL_PATTERN);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_set_goal_pattern(SubLObject cyblack_goal_posting, SubLObject new_goal_pattern) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt254$CYBLACK_GOAL_POSTING_SET_GOAL_PAT, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_set_goal_pattern_method(cyblack_goal_posting, new_goal_pattern);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_set_goal_pattern_method(cyblack_goal_posting, new_goal_pattern);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_goal_posting, SET_GOAL_PATTERN, new_goal_pattern);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_add_match(SubLObject cyblack_goal_posting, SubLObject new_instantiated_pattern) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt255$CYBLACK_GOAL_POSTING_ADD_MATCH___, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_add_match_method(cyblack_goal_posting, new_instantiated_pattern);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_add_match_method(cyblack_goal_posting, new_instantiated_pattern);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_goal_posting, ADD_MATCH, new_instantiated_pattern);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_get_matches(SubLObject cyblack_goal_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt256$CYBLACK_GOAL_POSTING_GET_MATCHES_, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return cyblack_ordinal_goal_posting_get_matches_method(cyblack_goal_posting);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return cyblack_basic_goal_posting_get_matches_method(cyblack_goal_posting);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_goal_posting, GET_MATCHES);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_get_local_environment(SubLObject cyblack_goal_posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt257$CYBLACK_GOAL_POSTING_GET_LOCAL_EN, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return methods.funcall_instance_method_with_0_args(cyblack_goal_posting, GET_LOCAL_ENVIRONMENT);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return methods.funcall_instance_method_with_0_args(cyblack_goal_posting, GET_LOCAL_ENVIRONMENT);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_goal_posting, GET_LOCAL_ENVIRONMENT);
                }

        }
    }

    public static final SubLObject cyblack_goal_posting_set_local_environment(SubLObject cyblack_goal_posting, SubLObject new_local_environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_goal_posting_p(cyblack_goal_posting)) {
                    Errors.error($str_alt259$CYBLACK_GOAL_POSTING_SET_LOCAL_EN, cyblack_goal_posting);
                }
            }
            if (NIL != cyblack_ordinal_goal_posting_p(cyblack_goal_posting)) {
                return methods.funcall_instance_method_with_1_args(cyblack_goal_posting, SET_LOCAL_ENVIRONMENT, new_local_environment);
            } else
                if (NIL != cyblack_basic_goal_posting_p(cyblack_goal_posting)) {
                    return methods.funcall_instance_method_with_1_args(cyblack_goal_posting, SET_LOCAL_ENVIRONMENT, new_local_environment);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_goal_posting, SET_LOCAL_ENVIRONMENT, new_local_environment);
                }

        }
    }

    public static final SubLObject declare_cyblack_goal_file() {
        declareFunction("valid_cyblack_goal_satisfaction_types", "VALID-CYBLACK-GOAL-SATISFACTION-TYPES", 0, 0, false);
        declareFunction("cyblack_goal_satisfaction_type_p", "CYBLACK-GOAL-SATISFACTION-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_goal_satisfaction_type", "ENCODE-CYBLACK-GOAL-SATISFACTION-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_goal_satisfaction_type", "DECODE-CYBLACK-GOAL-SATISFACTION-TYPE", 1, 0, false);
        declareFunction("cyblack_goal_satisfaction_type_less_p", "CYBLACK-GOAL-SATISFACTION-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_goal_satisfaction_type_greater_p", "CYBLACK-GOAL-SATISFACTION-TYPE-GREATER-P", 2, 0, false);
        declareFunction("cyblack_goal_posting_p", "CYBLACK-GOAL-POSTING-P", 1, 0, false);
        declareFunction("cyblack_goal_posting_template_p", "CYBLACK-GOAL-POSTING-TEMPLATE-P", 1, 0, false);
        declareFunction("get_cyblack_basic_goal_posting_posting_daemon", "GET-CYBLACK-BASIC-GOAL-POSTING-POSTING-DAEMON", 1, 0, false);
        declareFunction("set_cyblack_basic_goal_posting_posting_daemon", "SET-CYBLACK-BASIC-GOAL-POSTING-POSTING-DAEMON", 2, 0, false);
        declareFunction("get_cyblack_basic_goal_posting_matches", "GET-CYBLACK-BASIC-GOAL-POSTING-MATCHES", 1, 0, false);
        declareFunction("set_cyblack_basic_goal_posting_matches", "SET-CYBLACK-BASIC-GOAL-POSTING-MATCHES", 2, 0, false);
        declareFunction("get_cyblack_basic_goal_posting_goal_pattern", "GET-CYBLACK-BASIC-GOAL-POSTING-GOAL-PATTERN", 1, 0, false);
        declareFunction("set_cyblack_basic_goal_posting_goal_pattern", "SET-CYBLACK-BASIC-GOAL-POSTING-GOAL-PATTERN", 2, 0, false);
        declareFunction("get_cyblack_basic_goal_posting_unparsed_goal_pattern", "GET-CYBLACK-BASIC-GOAL-POSTING-UNPARSED-GOAL-PATTERN", 1, 0, false);
        declareFunction("set_cyblack_basic_goal_posting_unparsed_goal_pattern", "SET-CYBLACK-BASIC-GOAL-POSTING-UNPARSED-GOAL-PATTERN", 2, 0, false);
        declareFunction("get_cyblack_basic_goal_posting_timeout", "GET-CYBLACK-BASIC-GOAL-POSTING-TIMEOUT", 1, 0, false);
        declareFunction("set_cyblack_basic_goal_posting_timeout", "SET-CYBLACK-BASIC-GOAL-POSTING-TIMEOUT", 2, 0, false);
        declareFunction("get_cyblack_basic_goal_posting_count", "GET-CYBLACK-BASIC-GOAL-POSTING-COUNT", 1, 0, false);
        declareFunction("set_cyblack_basic_goal_posting_count", "SET-CYBLACK-BASIC-GOAL-POSTING-COUNT", 2, 0, false);
        declareFunction("get_cyblack_basic_goal_posting_satisfaction_type", "GET-CYBLACK-BASIC-GOAL-POSTING-SATISFACTION-TYPE", 1, 0, false);
        declareFunction("set_cyblack_basic_goal_posting_satisfaction_type", "SET-CYBLACK-BASIC-GOAL-POSTING-SATISFACTION-TYPE", 2, 0, false);
        declareFunction("cyblack_basic_goal_posting_get_matches_method", "CYBLACK-BASIC-GOAL-POSTING-GET-MATCHES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_add_match_method", "CYBLACK-BASIC-GOAL-POSTING-ADD-MATCH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_goal_posting_set_goal_pattern_method", "CYBLACK-BASIC-GOAL-POSTING-SET-GOAL-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_goal_posting_get_goal_pattern_method", "CYBLACK-BASIC-GOAL-POSTING-GET-GOAL-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_set_timeout_method", "CYBLACK-BASIC-GOAL-POSTING-SET-TIMEOUT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_goal_posting_get_timeout_method", "CYBLACK-BASIC-GOAL-POSTING-GET-TIMEOUT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_set_count_method", "CYBLACK-BASIC-GOAL-POSTING-SET-COUNT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_goal_posting_get_count_method", "CYBLACK-BASIC-GOAL-POSTING-GET-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_set_satisfaction_type_method", "CYBLACK-BASIC-GOAL-POSTING-SET-SATISFACTION-TYPE-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_goal_posting_get_satisfaction_type_method", "CYBLACK-BASIC-GOAL-POSTING-GET-SATISFACTION-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_initialize_qua_cyblack_goal_posting_template_method", "CYBLACK-BASIC-GOAL-POSTING-INITIALIZE-QUA-CYBLACK-GOAL-POSTING-TEMPLATE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_goal_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-GOAL-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_goal_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-GOAL-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_p", "CYBLACK-BASIC-GOAL-POSTING-P", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_initialize_method", "CYBLACK-BASIC-GOAL-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_get_satisfaction_type_internal_method", "CYBLACK-BASIC-GOAL-POSTING-GET-SATISFACTION-TYPE-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_set_satisfaction_type_internal_method", "CYBLACK-BASIC-GOAL-POSTING-SET-SATISFACTION-TYPE-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_goal_posting_satisfied_p_method", "CYBLACK-BASIC-GOAL-POSTING-SATISFIED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_on_satisfied_method", "CYBLACK-BASIC-GOAL-POSTING-ON-SATISFIED-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_get_count_internal_method", "CYBLACK-BASIC-GOAL-POSTING-GET-COUNT-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_set_count_internal_method", "CYBLACK-BASIC-GOAL-POSTING-SET-COUNT-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_goal_posting_get_timeout_internal_method", "CYBLACK-BASIC-GOAL-POSTING-GET-TIMEOUT-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_set_timeout_internal_method", "CYBLACK-BASIC-GOAL-POSTING-SET-TIMEOUT-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_goal_posting_get_unparsed_goal_pattern_internal_method", "CYBLACK-BASIC-GOAL-POSTING-GET-UNPARSED-GOAL-PATTERN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_set_unparsed_goal_pattern_internal_method", "CYBLACK-BASIC-GOAL-POSTING-SET-UNPARSED-GOAL-PATTERN-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_goal_posting_get_goal_pattern_internal_method", "CYBLACK-BASIC-GOAL-POSTING-GET-GOAL-PATTERN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_set_goal_pattern_internal_method", "CYBLACK-BASIC-GOAL-POSTING-SET-GOAL-PATTERN-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_goal_posting_get_matches_internal_method", "CYBLACK-BASIC-GOAL-POSTING-GET-MATCHES-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_set_matches_internal_method", "CYBLACK-BASIC-GOAL-POSTING-SET-MATCHES-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_goal_posting_on_post_method", "CYBLACK-BASIC-GOAL-POSTING-ON-POST-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_goal_posting_get_posting_daemon_method", "CYBLACK-BASIC-GOAL-POSTING-GET-POSTING-DAEMON-METHOD", 1, 0, false);
        declareFunction("get_cyblack_ordinal_goal_posting_posting_daemon", "GET-CYBLACK-ORDINAL-GOAL-POSTING-POSTING-DAEMON", 1, 0, false);
        declareFunction("set_cyblack_ordinal_goal_posting_posting_daemon", "SET-CYBLACK-ORDINAL-GOAL-POSTING-POSTING-DAEMON", 2, 0, false);
        declareFunction("get_cyblack_ordinal_goal_posting_matches", "GET-CYBLACK-ORDINAL-GOAL-POSTING-MATCHES", 1, 0, false);
        declareFunction("set_cyblack_ordinal_goal_posting_matches", "SET-CYBLACK-ORDINAL-GOAL-POSTING-MATCHES", 2, 0, false);
        declareFunction("get_cyblack_ordinal_goal_posting_goal_pattern", "GET-CYBLACK-ORDINAL-GOAL-POSTING-GOAL-PATTERN", 1, 0, false);
        declareFunction("set_cyblack_ordinal_goal_posting_goal_pattern", "SET-CYBLACK-ORDINAL-GOAL-POSTING-GOAL-PATTERN", 2, 0, false);
        declareFunction("get_cyblack_ordinal_goal_posting_unparsed_goal_pattern", "GET-CYBLACK-ORDINAL-GOAL-POSTING-UNPARSED-GOAL-PATTERN", 1, 0, false);
        declareFunction("set_cyblack_ordinal_goal_posting_unparsed_goal_pattern", "SET-CYBLACK-ORDINAL-GOAL-POSTING-UNPARSED-GOAL-PATTERN", 2, 0, false);
        declareFunction("get_cyblack_ordinal_goal_posting_timeout", "GET-CYBLACK-ORDINAL-GOAL-POSTING-TIMEOUT", 1, 0, false);
        declareFunction("set_cyblack_ordinal_goal_posting_timeout", "SET-CYBLACK-ORDINAL-GOAL-POSTING-TIMEOUT", 2, 0, false);
        declareFunction("get_cyblack_ordinal_goal_posting_count", "GET-CYBLACK-ORDINAL-GOAL-POSTING-COUNT", 1, 0, false);
        declareFunction("set_cyblack_ordinal_goal_posting_count", "SET-CYBLACK-ORDINAL-GOAL-POSTING-COUNT", 2, 0, false);
        declareFunction("get_cyblack_ordinal_goal_posting_satisfaction_type", "GET-CYBLACK-ORDINAL-GOAL-POSTING-SATISFACTION-TYPE", 1, 0, false);
        declareFunction("set_cyblack_ordinal_goal_posting_satisfaction_type", "SET-CYBLACK-ORDINAL-GOAL-POSTING-SATISFACTION-TYPE", 2, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_get_matches_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-MATCHES-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_add_match_method", "CYBLACK-ORDINAL-GOAL-POSTING-ADD-MATCH-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_set_goal_pattern_method", "CYBLACK-ORDINAL-GOAL-POSTING-SET-GOAL-PATTERN-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_get_goal_pattern_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-GOAL-PATTERN-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_set_timeout_method", "CYBLACK-ORDINAL-GOAL-POSTING-SET-TIMEOUT-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_get_timeout_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-TIMEOUT-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_set_count_method", "CYBLACK-ORDINAL-GOAL-POSTING-SET-COUNT-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_get_count_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-COUNT-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_set_satisfaction_type_method", "CYBLACK-ORDINAL-GOAL-POSTING-SET-SATISFACTION-TYPE-METHOD", 2, 1, false);
        declareFunction("cyblack_ordinal_goal_posting_get_satisfaction_type_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-SATISFACTION-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_initialize_qua_cyblack_goal_posting_template_method", "CYBLACK-ORDINAL-GOAL-POSTING-INITIALIZE-QUA-CYBLACK-GOAL-POSTING-TEMPLATE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_ordinal_goal_posting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ORDINAL-GOAL-POSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_ordinal_goal_posting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ORDINAL-GOAL-POSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_p", "CYBLACK-ORDINAL-GOAL-POSTING-P", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_initialize_method", "CYBLACK-ORDINAL-GOAL-POSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_get_satisfaction_type_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-SATISFACTION-TYPE-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_set_satisfaction_type_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-SET-SATISFACTION-TYPE-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_satisfied_p_method", "CYBLACK-ORDINAL-GOAL-POSTING-SATISFIED-P-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_on_satisfied_method", "CYBLACK-ORDINAL-GOAL-POSTING-ON-SATISFIED-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_get_count_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-COUNT-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_set_count_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-SET-COUNT-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_get_timeout_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-TIMEOUT-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_set_timeout_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-SET-TIMEOUT-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_get_unparsed_goal_pattern_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-UNPARSED-GOAL-PATTERN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_set_unparsed_goal_pattern_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-SET-UNPARSED-GOAL-PATTERN-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_get_goal_pattern_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-GOAL-PATTERN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_set_goal_pattern_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-SET-GOAL-PATTERN-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_get_matches_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-MATCHES-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_set_matches_internal_method", "CYBLACK-ORDINAL-GOAL-POSTING-SET-MATCHES-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_on_post_method", "CYBLACK-ORDINAL-GOAL-POSTING-ON-POST-METHOD", 1, 0, false);
        declareFunction("cyblack_ordinal_goal_posting_get_posting_daemon_method", "CYBLACK-ORDINAL-GOAL-POSTING-GET-POSTING-DAEMON-METHOD", 1, 0, false);
        declareFunction("cyblack_goal_posting_get_satisfaction_type", "CYBLACK-GOAL-POSTING-GET-SATISFACTION-TYPE", 1, 0, false);
        declareFunction("cyblack_goal_posting_set_satisfaction_type", "CYBLACK-GOAL-POSTING-SET-SATISFACTION-TYPE", 2, 1, false);
        declareFunction("cyblack_goal_posting_satisfied_p", "CYBLACK-GOAL-POSTING-SATISFIED-P", 1, 0, false);
        declareFunction("cyblack_goal_posting_on_satisfied", "CYBLACK-GOAL-POSTING-ON-SATISFIED", 1, 0, false);
        declareFunction("cyblack_goal_posting_get_count", "CYBLACK-GOAL-POSTING-GET-COUNT", 1, 0, false);
        declareFunction("cyblack_goal_posting_set_count", "CYBLACK-GOAL-POSTING-SET-COUNT", 2, 0, false);
        declareFunction("cyblack_goal_posting_get_timeout", "CYBLACK-GOAL-POSTING-GET-TIMEOUT", 1, 0, false);
        declareFunction("cyblack_goal_posting_set_timeout", "CYBLACK-GOAL-POSTING-SET-TIMEOUT", 2, 0, false);
        declareFunction("cyblack_goal_posting_set_delta_timeout", "CYBLACK-GOAL-POSTING-SET-DELTA-TIMEOUT", 2, 0, false);
        declareFunction("cyblack_goal_posting_get_goal_pattern", "CYBLACK-GOAL-POSTING-GET-GOAL-PATTERN", 1, 0, false);
        declareFunction("cyblack_goal_posting_set_goal_pattern", "CYBLACK-GOAL-POSTING-SET-GOAL-PATTERN", 2, 0, false);
        declareFunction("cyblack_goal_posting_add_match", "CYBLACK-GOAL-POSTING-ADD-MATCH", 2, 0, false);
        declareFunction("cyblack_goal_posting_get_matches", "CYBLACK-GOAL-POSTING-GET-MATCHES", 1, 0, false);
        declareFunction("cyblack_goal_posting_get_local_environment", "CYBLACK-GOAL-POSTING-GET-LOCAL-ENVIRONMENT", 1, 0, false);
        declareFunction("cyblack_goal_posting_set_local_environment", "CYBLACK-GOAL-POSTING-SET-LOCAL-ENVIRONMENT", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_goal_file() {
        defconstant("*VALID-CYBLACK-GOAL-SATISFACTION-TYPES*", $list_alt0);
        defconstant("*CYBLACK-GOAL-DEFAULT-SATISFACTION-TYPE*", $ANY);
        return NIL;
    }

    public static final SubLObject setup_cyblack_goal_file() {
                enumerations.enumerations_incorporate_definition(CYBLACK_GOAL_SATISFACTION_TYPE, $list_alt0);
        interfaces.new_interface(CYBLACK_GOAL_POSTING, $list_alt10, $list_alt11, $list_alt12);
        interfaces.new_interface(CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt14, $list_alt15, $list_alt16);
        interfaces.interfaces_add_interface_instance_method(INITIALIZE_QUA_CYBLACK_GOAL_POSTING_TEMPLATE, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt18, NIL, $list_alt19);
        interfaces.interfaces_add_interface_instance_method(GET_SATISFACTION_TYPE, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt21, NIL, $list_alt22);
        interfaces.interfaces_add_interface_instance_method(SET_SATISFACTION_TYPE, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt18, $list_alt24, $list_alt25);
        interfaces.interfaces_add_interface_instance_method(GET_COUNT, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt21, NIL, $list_alt27);
        interfaces.interfaces_add_interface_instance_method(SET_COUNT, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt21, $list_alt29, $list_alt30);
        interfaces.interfaces_add_interface_instance_method(GET_TIMEOUT, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt21, NIL, $list_alt32);
        interfaces.interfaces_add_interface_instance_method(SET_TIMEOUT, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt21, $list_alt34, $list_alt35);
        interfaces.interfaces_add_interface_instance_method(SET_DELTA_TIMEOUT, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt21, $list_alt37, $list_alt38);
        interfaces.interfaces_add_interface_instance_method(GET_GOAL_PATTERN, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt21, NIL, $list_alt40);
        interfaces.interfaces_add_interface_instance_method(SET_GOAL_PATTERN, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt21, $list_alt42, $list_alt43);
        interfaces.interfaces_add_interface_instance_method(ADD_MATCH, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt21, $list_alt45, $list_alt46);
        interfaces.interfaces_add_interface_instance_method(GET_MATCHES, CYBLACK_GOAL_POSTING_TEMPLATE, $list_alt21, NIL, $list_alt48);
        classes.subloop_new_class(CYBLACK_BASIC_GOAL_POSTING, CYBLACK_BASIC_POSTING, $list_alt51, NIL, $list_alt52);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_GOAL_POSTING, NIL);
        methods.methods_incorporate_instance_method(GET_MATCHES, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, NIL, $list_alt48);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_MATCHES, CYBLACK_BASIC_GOAL_POSTING_GET_MATCHES_METHOD);
        methods.methods_incorporate_instance_method(ADD_MATCH, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, $list_alt45, $list_alt46);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, ADD_MATCH, CYBLACK_BASIC_GOAL_POSTING_ADD_MATCH_METHOD);
        methods.methods_incorporate_instance_method(SET_GOAL_PATTERN, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, $list_alt42, $list_alt43);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, SET_GOAL_PATTERN, CYBLACK_BASIC_GOAL_POSTING_SET_GOAL_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_GOAL_PATTERN, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, NIL, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_GOAL_PATTERN, CYBLACK_BASIC_GOAL_POSTING_GET_GOAL_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_TIMEOUT, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, $list_alt34, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, SET_TIMEOUT, CYBLACK_BASIC_GOAL_POSTING_SET_TIMEOUT_METHOD);
        methods.methods_incorporate_instance_method(GET_TIMEOUT, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, NIL, $list_alt32);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_TIMEOUT, CYBLACK_BASIC_GOAL_POSTING_GET_TIMEOUT_METHOD);
        methods.methods_incorporate_instance_method(SET_COUNT, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, $list_alt29, $list_alt30);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, SET_COUNT, CYBLACK_BASIC_GOAL_POSTING_SET_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_COUNT, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, NIL, $list_alt27);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_COUNT, CYBLACK_BASIC_GOAL_POSTING_GET_COUNT_METHOD);
        methods.methods_incorporate_instance_method(SET_SATISFACTION_TYPE, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, $list_alt24, $list_alt25);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, SET_SATISFACTION_TYPE, CYBLACK_BASIC_GOAL_POSTING_SET_SATISFACTION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_SATISFACTION_TYPE, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, NIL, $list_alt22);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_SATISFACTION_TYPE, CYBLACK_BASIC_GOAL_POSTING_GET_SATISFACTION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_GOAL_POSTING_TEMPLATE, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, NIL, $list_alt19);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, INITIALIZE_QUA_CYBLACK_GOAL_POSTING_TEMPLATE, $sym85$CYBLACK_BASIC_GOAL_POSTING_INITIALIZE_QUA_CYBLACK_GOAL_POSTING_TE);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_GOAL_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_GOAL_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_GOAL_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_GOAL_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_goal_posting_class(CYBLACK_BASIC_GOAL_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, NIL, $list_alt119);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, INITIALIZE, CYBLACK_BASIC_GOAL_POSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_SATISFACTION_TYPE_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, NIL, $list_alt122);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_SATISFACTION_TYPE_INTERNAL, CYBLACK_BASIC_GOAL_POSTING_GET_SATISFACTION_TYPE_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_SATISFACTION_TYPE_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, $list_alt126, $list_alt127);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, SET_SATISFACTION_TYPE_INTERNAL, CYBLACK_BASIC_GOAL_POSTING_SET_SATISFACTION_TYPE_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SATISFIED_P, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, NIL, $list_alt131);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, SATISFIED_P, CYBLACK_BASIC_GOAL_POSTING_SATISFIED_P_METHOD);
        methods.methods_incorporate_instance_method(ON_SATISFIED, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, NIL, $list_alt136);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, ON_SATISFIED, CYBLACK_BASIC_GOAL_POSTING_ON_SATISFIED_METHOD);
        methods.methods_incorporate_instance_method(GET_COUNT_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, NIL, $list_alt139);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_COUNT_INTERNAL, CYBLACK_BASIC_GOAL_POSTING_GET_COUNT_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_COUNT_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, $list_alt29, $list_alt143);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, SET_COUNT_INTERNAL, CYBLACK_BASIC_GOAL_POSTING_SET_COUNT_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_TIMEOUT_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, NIL, $list_alt147);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_TIMEOUT_INTERNAL, CYBLACK_BASIC_GOAL_POSTING_GET_TIMEOUT_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_TIMEOUT_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, $list_alt34, $list_alt151);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, SET_TIMEOUT_INTERNAL, CYBLACK_BASIC_GOAL_POSTING_SET_TIMEOUT_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_UNPARSED_GOAL_PATTERN_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt155, NIL, $list_alt156);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_UNPARSED_GOAL_PATTERN_INTERNAL, $sym157$CYBLACK_BASIC_GOAL_POSTING_GET_UNPARSED_GOAL_PATTERN_INTERNAL_MET);
        methods.methods_incorporate_instance_method(SET_UNPARSED_GOAL_PATTERN_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, $list_alt159, $list_alt160);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, SET_UNPARSED_GOAL_PATTERN_INTERNAL, $sym162$CYBLACK_BASIC_GOAL_POSTING_SET_UNPARSED_GOAL_PATTERN_INTERNAL_MET);
        methods.methods_incorporate_instance_method(GET_GOAL_PATTERN_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, NIL, $list_alt164);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_GOAL_PATTERN_INTERNAL, CYBLACK_BASIC_GOAL_POSTING_GET_GOAL_PATTERN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_GOAL_PATTERN_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, $list_alt42, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, SET_GOAL_PATTERN_INTERNAL, CYBLACK_BASIC_GOAL_POSTING_SET_GOAL_PATTERN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_MATCHES_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, NIL, $list_alt172);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_MATCHES_INTERNAL, CYBLACK_BASIC_GOAL_POSTING_GET_MATCHES_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_MATCHES_INTERNAL, CYBLACK_BASIC_GOAL_POSTING, $list_alt18, $list_alt176, $list_alt177);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, SET_MATCHES_INTERNAL, CYBLACK_BASIC_GOAL_POSTING_SET_MATCHES_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(ON_POST, CYBLACK_BASIC_GOAL_POSTING, $list_alt21, NIL, $list_alt181);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, ON_POST, CYBLACK_BASIC_GOAL_POSTING_ON_POST_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING_DAEMON, CYBLACK_BASIC_GOAL_POSTING, $list_alt155, NIL, $list_alt194);
        methods.subloop_register_instance_method(CYBLACK_BASIC_GOAL_POSTING, GET_POSTING_DAEMON, CYBLACK_BASIC_GOAL_POSTING_GET_POSTING_DAEMON_METHOD);
        classes.subloop_new_class(CYBLACK_ORDINAL_GOAL_POSTING, CYBLACK_ORDINAL_POSTING, $list_alt51, NIL, $list_alt52);
        classes.class_set_implements_slot_listeners(CYBLACK_ORDINAL_GOAL_POSTING, NIL);
        methods.methods_incorporate_instance_method(GET_MATCHES, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, NIL, $list_alt48);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_MATCHES, CYBLACK_ORDINAL_GOAL_POSTING_GET_MATCHES_METHOD);
        methods.methods_incorporate_instance_method(ADD_MATCH, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, $list_alt45, $list_alt46);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, ADD_MATCH, CYBLACK_ORDINAL_GOAL_POSTING_ADD_MATCH_METHOD);
        methods.methods_incorporate_instance_method(SET_GOAL_PATTERN, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, $list_alt42, $list_alt43);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, SET_GOAL_PATTERN, CYBLACK_ORDINAL_GOAL_POSTING_SET_GOAL_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(GET_GOAL_PATTERN, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, NIL, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_GOAL_PATTERN, CYBLACK_ORDINAL_GOAL_POSTING_GET_GOAL_PATTERN_METHOD);
        methods.methods_incorporate_instance_method(SET_TIMEOUT, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, $list_alt34, $list_alt35);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, SET_TIMEOUT, CYBLACK_ORDINAL_GOAL_POSTING_SET_TIMEOUT_METHOD);
        methods.methods_incorporate_instance_method(GET_TIMEOUT, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, NIL, $list_alt32);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_TIMEOUT, CYBLACK_ORDINAL_GOAL_POSTING_GET_TIMEOUT_METHOD);
        methods.methods_incorporate_instance_method(SET_COUNT, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, $list_alt29, $list_alt30);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, SET_COUNT, CYBLACK_ORDINAL_GOAL_POSTING_SET_COUNT_METHOD);
        methods.methods_incorporate_instance_method(GET_COUNT, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, NIL, $list_alt27);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_COUNT, CYBLACK_ORDINAL_GOAL_POSTING_GET_COUNT_METHOD);
        methods.methods_incorporate_instance_method(SET_SATISFACTION_TYPE, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, $list_alt24, $list_alt25);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, SET_SATISFACTION_TYPE, CYBLACK_ORDINAL_GOAL_POSTING_SET_SATISFACTION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(GET_SATISFACTION_TYPE, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, NIL, $list_alt22);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_SATISFACTION_TYPE, CYBLACK_ORDINAL_GOAL_POSTING_GET_SATISFACTION_TYPE_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_GOAL_POSTING_TEMPLATE, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, NIL, $list_alt19);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, INITIALIZE_QUA_CYBLACK_GOAL_POSTING_TEMPLATE, $sym209$CYBLACK_ORDINAL_GOAL_POSTING_INITIALIZE_QUA_CYBLACK_GOAL_POSTING_);
        classes.subloop_note_class_initialization_function(CYBLACK_ORDINAL_GOAL_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ORDINAL_GOAL_POSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_ORDINAL_GOAL_POSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ORDINAL_GOAL_POSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_ordinal_goal_posting_class(CYBLACK_ORDINAL_GOAL_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, NIL, $list_alt119);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, INITIALIZE, CYBLACK_ORDINAL_GOAL_POSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_SATISFACTION_TYPE_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, NIL, $list_alt122);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_SATISFACTION_TYPE_INTERNAL, $sym215$CYBLACK_ORDINAL_GOAL_POSTING_GET_SATISFACTION_TYPE_INTERNAL_METHO);
        methods.methods_incorporate_instance_method(SET_SATISFACTION_TYPE_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, $list_alt126, $list_alt127);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, SET_SATISFACTION_TYPE_INTERNAL, $sym217$CYBLACK_ORDINAL_GOAL_POSTING_SET_SATISFACTION_TYPE_INTERNAL_METHO);
        methods.methods_incorporate_instance_method(SATISFIED_P, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, NIL, $list_alt131);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, SATISFIED_P, CYBLACK_ORDINAL_GOAL_POSTING_SATISFIED_P_METHOD);
        methods.methods_incorporate_instance_method(ON_SATISFIED, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, NIL, $list_alt136);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, ON_SATISFIED, CYBLACK_ORDINAL_GOAL_POSTING_ON_SATISFIED_METHOD);
        methods.methods_incorporate_instance_method(GET_COUNT_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, NIL, $list_alt139);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_COUNT_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING_GET_COUNT_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_COUNT_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, $list_alt29, $list_alt143);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, SET_COUNT_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING_SET_COUNT_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_TIMEOUT_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, NIL, $list_alt147);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_TIMEOUT_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING_GET_TIMEOUT_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_TIMEOUT_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, $list_alt34, $list_alt151);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, SET_TIMEOUT_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING_SET_TIMEOUT_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_UNPARSED_GOAL_PATTERN_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt155, NIL, $list_alt156);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_UNPARSED_GOAL_PATTERN_INTERNAL, $sym229$CYBLACK_ORDINAL_GOAL_POSTING_GET_UNPARSED_GOAL_PATTERN_INTERNAL_M);
        methods.methods_incorporate_instance_method(SET_UNPARSED_GOAL_PATTERN_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, $list_alt159, $list_alt160);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, SET_UNPARSED_GOAL_PATTERN_INTERNAL, $sym231$CYBLACK_ORDINAL_GOAL_POSTING_SET_UNPARSED_GOAL_PATTERN_INTERNAL_M);
        methods.methods_incorporate_instance_method(GET_GOAL_PATTERN_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, NIL, $list_alt164);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_GOAL_PATTERN_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING_GET_GOAL_PATTERN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_GOAL_PATTERN_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, $list_alt42, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, SET_GOAL_PATTERN_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING_SET_GOAL_PATTERN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_MATCHES_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, NIL, $list_alt172);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_MATCHES_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING_GET_MATCHES_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_MATCHES_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt18, $list_alt176, $list_alt177);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, SET_MATCHES_INTERNAL, CYBLACK_ORDINAL_GOAL_POSTING_SET_MATCHES_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(ON_POST, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt21, NIL, $list_alt240);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, ON_POST, CYBLACK_ORDINAL_GOAL_POSTING_ON_POST_METHOD);
        methods.methods_incorporate_instance_method(GET_POSTING_DAEMON, CYBLACK_ORDINAL_GOAL_POSTING, $list_alt155, NIL, $list_alt194);
        methods.subloop_register_instance_method(CYBLACK_ORDINAL_GOAL_POSTING, GET_POSTING_DAEMON, CYBLACK_ORDINAL_GOAL_POSTING_GET_POSTING_DAEMON_METHOD);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeKeyword("ANY"), makeKeyword("ALL"), makeKeyword("AT-LEAST"), makeKeyword("UNTIL-TIMEOUT"));

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_TYPE = makeSymbol("CYBLACK-GOAL-SATISFACTION-TYPE");

    static private final SubLString $str_alt2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_GOAL_SATISFACTION_TYPE = makeSymbol("ENCODE-CYBLACK-GOAL-SATISFACTION-TYPE");

    static private final SubLString $str_alt4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_GOAL_SATISFACTION_TYPE = makeSymbol("DECODE-CYBLACK-GOAL-SATISFACTION-TYPE");

    static private final SubLString $str_alt6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_TYPE_P = makeSymbol("CYBLACK-GOAL-SATISFACTION-TYPE-P");



    private static final SubLSymbol CYBLACK_GOAL_POSTING = makeSymbol("CYBLACK-GOAL-POSTING");

    static private final SubLList $list_alt10 = list(makeSymbol("CYBLACK-POSTING"));

    static private final SubLList $list_alt11 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-POSTING")));

    static private final SubLList $list_alt12 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SATISFACTION-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SATISFACTION-TYPE"), list(makeSymbol("NEW-SATISFACTION-TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-COUNT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SATISFIED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SATISFIED"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-COUNT"), list(makeSymbol("NEW-COUNT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMEOUT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIMEOUT"), list(makeSymbol("UNIVERSAL-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DELTA-TIMEOUT"), list(makeSymbol("TIME-DELTA-IN-SECONDS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GOAL-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GOAL-PATTERN"), list(makeSymbol("NEW-GOAL-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MATCH"), list(makeSymbol("NEW-INSTANTIATED-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MATCHES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LOCAL-ENVIRONMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LOCAL-ENVIRONMENT"), list(makeSymbol("NEW-LOCAL-ENVIRONMENT")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol CYBLACK_GOAL_POSTING_TEMPLATE = makeSymbol("CYBLACK-GOAL-POSTING-TEMPLATE");

    static private final SubLList $list_alt14 = list(makeSymbol("CYBLACK-GOAL-POSTING"));

    static private final SubLList $list_alt15 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-GOAL-POSTING")));

    static private final SubLList $list_alt16 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-GOAL-POSTING-TEMPLATE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SATISFACTION-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SATISFACTION-TYPE"), list(makeSymbol("NEW-SATISFACTION-TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-COUNT"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SATISFACTION-TYPE-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SATISFACTION-TYPE-INTERNAL"), list(makeSymbol("NEW-SATISFACTION-TYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COUNT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-COUNT"), list(makeSymbol("NEW-COUNT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COUNT-INTERNAL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-COUNT-INTERNAL"), list(makeSymbol("NEW-COUNT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMEOUT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIMEOUT"), list(makeSymbol("UNIVERSAL-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMEOUT-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIMEOUT-INTERNAL"), list(makeSymbol("UNIVERSAL-TIME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNPARSED-GOAL-PATTERN-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-UNPARSED-GOAL-PATTERN-INTERNAL"), list(makeSymbol("NEW-UNPARSED-GOAL-PATTERN")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GOAL-PATTERN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GOAL-PATTERN"), list(makeSymbol("NEW-GOAL-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GOAL-PATTERN-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GOAL-PATTERN-INTERNAL"), list(makeSymbol("NEW-GOAL-PATTERN")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MATCH"), list(makeSymbol("NEW-INSTANTIATED-PATTERN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MATCHES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MATCHES-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MATCHES-INTERNAL"), list(makeSymbol("NEW-MATCHES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-DAEMON"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol INITIALIZE_QUA_CYBLACK_GOAL_POSTING_TEMPLATE = makeSymbol("INITIALIZE-QUA-CYBLACK-GOAL-POSTING-TEMPLATE");

    static private final SubLList $list_alt18 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt19 = list(list(makeSymbol("SET-SATISFACTION-TYPE-INTERNAL"), makeSymbol("SELF"), makeSymbol("*CYBLACK-GOAL-DEFAULT-SATISFACTION-TYPE*")), list(makeSymbol("SET-COUNT-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-TIMEOUT-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-GOAL-PATTERN-INTERNAL"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-MATCHES-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol GET_SATISFACTION_TYPE = makeSymbol("GET-SATISFACTION-TYPE");

    static private final SubLList $list_alt21 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt22 = list(list(RET, list(makeSymbol("GET-SATISFACTION-TYPE-INTERNAL"), makeSymbol("SELF"))));

    private static final SubLSymbol SET_SATISFACTION_TYPE = makeSymbol("SET-SATISFACTION-TYPE");

    static private final SubLList $list_alt24 = list(makeSymbol("NEW-SATISFACTION-TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-COUNT"), NIL));

    static private final SubLList $list_alt25 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-SATISFACTION-TYPE")), list(makeSymbol("CYBLACK-GOAL-SATISFACTION-TYPE-P"), makeSymbol("NEW-SATISFACTION-TYPE"))), makeString("(SET-SATISFACTION-TYPE ~S): ~S is not a member of the CYBLACK-GOAL-SATISFACTION-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-SATISFACTION-TYPE")), list(makeSymbol("SET-SATISFACTION-TYPE-INTERNAL"), makeSymbol("SELF"), makeSymbol("NEW-SATISFACTION-TYPE")), list(makeSymbol("SET-COUNT"), makeSymbol("SELF"), makeSymbol("NEW-COUNT")), list(RET, makeSymbol("NEW-SATISFACTION-TYPE")));

    private static final SubLSymbol GET_COUNT = makeSymbol("GET-COUNT");

    static private final SubLList $list_alt27 = list(list(RET, list(makeSymbol("GET-COUNT-INTERNAL"), makeSymbol("SELF"))));

    private static final SubLSymbol SET_COUNT = makeSymbol("SET-COUNT");

    static private final SubLList $list_alt29 = list(makeSymbol("NEW-COUNT"));

    static private final SubLList $list_alt30 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-COUNT")), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-COUNT")), list(makeSymbol(">"), makeSymbol("NEW-COUNT"), ZERO_INTEGER))), makeString("(SET-COUNT ~S): ~S is not a valid count.  Count values must be positive integers."), makeSymbol("NEW-COUNT")), list(makeSymbol("SET-COUNT-INTERNAL"), makeSymbol("SELF"), makeSymbol("NEW-COUNT")), list(RET, makeSymbol("NEW-COUNT")));

    private static final SubLSymbol GET_TIMEOUT = makeSymbol("GET-TIMEOUT");

    static private final SubLList $list_alt32 = list(list(RET, list(makeSymbol("GET-TIMEOUT-INTERNAL"), makeSymbol("SELF"))));

    private static final SubLSymbol SET_TIMEOUT = makeSymbol("SET-TIMEOUT");

    static private final SubLList $list_alt34 = list(makeSymbol("UNIVERSAL-TIME"));

    static private final SubLList $list_alt35 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("UNIVERSAL-TIME")), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("UNIVERSAL-TIME")), list(makeSymbol(">="), makeSymbol("UNIVERSAL-TIME"), ZERO_INTEGER))), makeString("(SET-TIMEOUT ~S): ~S is not a valid universal time."), makeSymbol("SELF"), makeSymbol("UNIVERSAL-TIME")), list(makeSymbol("SET-TIMEOUT-INTERNAL"), makeSymbol("SELF"), makeSymbol("UNIVERSAL-TIME")), list(RET, makeSymbol("UNIVERSAL-TIME")));

    private static final SubLSymbol SET_DELTA_TIMEOUT = makeSymbol("SET-DELTA-TIMEOUT");

    static private final SubLList $list_alt37 = list(makeSymbol("TIME-DELTA-IN-SECONDS"));

    static private final SubLList $list_alt38 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("TIME-DELTA-IN-SECONDS")), list(makeSymbol(">="), makeSymbol("TIME-DELTA-IN-SECONDS"), ZERO_INTEGER)), makeString("(SET-DELTA-TIMEOUT ~S): ~S is not a valid time delta."), makeSymbol("SELF"), makeSymbol("TIME-DELTA-IN-SECONDS")), list(makeSymbol("SET-TIMEOUT-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("+"), list(makeSymbol("GET-UNIVERSAL-TIME")), makeSymbol("TIME-DELTA-IN-SECONDS"))), list(RET, makeSymbol("TIME-DELTA-IN-SECONDS")));

    private static final SubLSymbol GET_GOAL_PATTERN = makeSymbol("GET-GOAL-PATTERN");

    static private final SubLList $list_alt40 = list(list(RET, list(makeSymbol("GET-GOAL-PATTERN-INTERNAL"), makeSymbol("SELF"))));

    private static final SubLSymbol SET_GOAL_PATTERN = makeSymbol("SET-GOAL-PATTERN");

    static private final SubLList $list_alt42 = list(makeSymbol("NEW-GOAL-PATTERN"));

    static private final SubLList $list_alt43 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-SATISFACTION-EXPRESSION-P"), makeSymbol("NEW-GOAL-PATTERN")), list(makeSymbol("SET-GOAL-PATTERN-INTERNAL"), makeSymbol("SELF"), makeSymbol("NEW-GOAL-PATTERN")), list(RET, makeSymbol("NEW-GOAL-PATTERN"))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-APPLICATION"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-APPLICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PARSER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-APPLICATION"), list(QUOTE, makeSymbol("GET-PARSER"))))), list(makeSymbol("CYBLACK-MUST"), makeSymbol("TEMPLATE-PARSER"), makeString("(SET-GOAL-PATTERN ~S): No parser is associated with the application ~S."), makeSymbol("SELF"), makeSymbol("TEMPLATE-PARSER")), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PARSER"), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-GOAL-PATTERN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PARSER"), list(QUOTE, makeSymbol("PARSE")), makeSymbol("NEW-GOAL-PATTERN")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-GOAL-PATTERN"), list(makeSymbol("WARN"), makeString("(SET-GOAL-PATTERN ~S): Failed to parse ~S."), makeSymbol("SELF"), makeSymbol("NEW-GOAL-PATTERN")), list(RET, NIL)), list(makeSymbol("SET-UNPARSED-GOAL-PATTERN-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-GOAL-PATTERN"))), list(makeSymbol("SET-GOAL-PATTERN-INTERNAL"), makeSymbol("SELF"), makeSymbol("TEMPLATE-GOAL-PATTERN")), list(RET, makeSymbol("TEMPLATE-GOAL-PATTERN"))))))), list(makeSymbol("SET-UNPARSED-GOAL-PATTERN-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-GOAL-PATTERN"))), list(makeSymbol("SET-GOAL-PATTERN-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, NIL));

    private static final SubLSymbol ADD_MATCH = makeSymbol("ADD-MATCH");

    static private final SubLList $list_alt45 = list(makeSymbol("NEW-INSTANTIATED-PATTERN"));

    static private final SubLList $list_alt46 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-MATCHES"), list(makeSymbol("GET-MATCHES-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("TEMPLATE-MATCHES"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-MATCHES"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("BASIC-DOUBLY-LINKED-LIST")), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST"))))), list(makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE-ADD"), makeSymbol("TEMPLATE-MATCHES"), makeSymbol("NEW-INSTANTIATED-PATTERN")), list(makeSymbol("SET-MATCHES-INTERNAL"), makeSymbol("SELF"), makeSymbol("TEMPLATE-MATCHES")), list(makeSymbol("PWHEN"), list(makeSymbol("SATISFIED-P"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-SATISFIED")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-POSTING-DAEMON"), list(makeSymbol("GET-POSTING-DAEMON"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-PANEL"), list(makeSymbol("FIF"), makeSymbol("TEMPLATE-POSTING-DAEMON"), list(makeSymbol("CYBLACK-BASIC-POSTING-DAEMON-GET-PANEL-METHOD"), makeSymbol("TEMPLATE-POSTING-DAEMON")), NIL))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TEMPLATE-POSTING-DAEMON"), makeSymbol("TEMPLATE-PANEL")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PANEL"), list(QUOTE, makeSymbol("REMOVE-POSTING-DAEMON")), makeSymbol("TEMPLATE-POSTING-DAEMON")))), list(RET, makeSymbol("NEW-INSTANTIATED-PATTERN"))));

    private static final SubLSymbol GET_MATCHES = makeSymbol("GET-MATCHES");

    static private final SubLList $list_alt48 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-MATCHES"), list(makeSymbol("GET-MATCHES-INTERNAL"), makeSymbol("SELF")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-MATCHES"), list(RET, NIL), list(RET, list(makeSymbol("DOUBLY-LINKED-LIST-TEMPLATE-GET-CONTENTS"), makeSymbol("TEMPLATE-MATCHES"))))));

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING = makeSymbol("CYBLACK-BASIC-GOAL-POSTING");



    static private final SubLList $list_alt51 = list(makeSymbol("CYBLACK-GOAL-POSTING-TEMPLATE"));

    static private final SubLList $list_alt52 = list(new SubLObject[]{ list(makeSymbol("SATISFACTION-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("COUNT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TIMEOUT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("UNPARSED-GOAL-PATTERN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("GOAL-PATTERN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MATCHES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("POSTING-DAEMON"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SATISFACTION-TYPE-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SATISFACTION-TYPE-INTERNAL"), list(makeSymbol("NEW-SATISFACTION-TYPE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SATISFIED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SATISFIED"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COUNT-INTERNAL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-COUNT-INTERNAL"), list(makeSymbol("NEW-COUNT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMEOUT-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIMEOUT-INTERNAL"), list(makeSymbol("UNIVERSAL-TIME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-UNPARSED-GOAL-PATTERN-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-UNPARSED-GOAL-PATTERN-INTERNAL"), list(makeSymbol("NEW-UNPARSED-GOAL-PATTERN")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GOAL-PATTERN-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GOAL-PATTERN-INTERNAL"), list(makeSymbol("NEW-GOAL-PATTERN")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MATCHES-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MATCHES-INTERNAL"), list(makeSymbol("NEW-MATCHES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-POST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSTING-DAEMON"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-GOAL-POSTING-TEMPLATE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SATISFACTION-TYPE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SATISFACTION-TYPE"), list(makeSymbol("NEW-SATISFACTION-TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-COUNT"), NIL)), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COUNT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-COUNT"), list(makeSymbol("NEW-COUNT")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIMEOUT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIMEOUT"), list(makeSymbol("UNIVERSAL-TIME")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GOAL-PATTERN"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GOAL-PATTERN"), list(makeSymbol("NEW-GOAL-PATTERN")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MATCH"), list(makeSymbol("NEW-INSTANTIATED-PATTERN")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MATCHES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });

    public static final SubLInteger $int$26 = makeInteger(26);



    public static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLSymbol MATCHES = makeSymbol("MATCHES");

    public static final SubLInteger $int$24 = makeInteger(24);



    public static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLSymbol UNPARSED_GOAL_PATTERN = makeSymbol("UNPARSED-GOAL-PATTERN");

    public static final SubLInteger $int$22 = makeInteger(22);



    public static final SubLInteger $int$21 = makeInteger(21);





    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_GET_MATCHES_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-MATCHES-METHOD");



    private static final SubLSymbol ON_SATISFIED = makeSymbol("ON-SATISFIED");



    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_ADD_MATCH_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-ADD-MATCH-METHOD");





    static private final SubLString $str_alt73$_SET_GOAL_PATTERN__S___Failed_to_ = makeString("(SET-GOAL-PATTERN ~S): Failed to parse ~S.");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_SET_GOAL_PATTERN_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-SET-GOAL-PATTERN-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_GET_GOAL_PATTERN_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-GOAL-PATTERN-METHOD");

    static private final SubLString $str_alt76$_SET_TIMEOUT__S____S_is_not_a_val = makeString("(SET-TIMEOUT ~S): ~S is not a valid universal time.");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_SET_TIMEOUT_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-SET-TIMEOUT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_GET_TIMEOUT_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-TIMEOUT-METHOD");

    static private final SubLString $str_alt79$_SET_COUNT__S____S_is_not_a_valid = makeString("(SET-COUNT ~S): ~S is not a valid count.  Count values must be positive integers.");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_SET_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-SET-COUNT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_GET_COUNT_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-COUNT-METHOD");

    static private final SubLString $str_alt82$_SET_SATISFACTION_TYPE__S____S_is = makeString("(SET-SATISFACTION-TYPE ~S): ~S is not a member of the CYBLACK-GOAL-SATISFACTION-TYPE enumeration.");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_SET_SATISFACTION_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-SET-SATISFACTION-TYPE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_GET_SATISFACTION_TYPE_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-SATISFACTION-TYPE-METHOD");

    static private final SubLSymbol $sym85$CYBLACK_BASIC_GOAL_POSTING_INITIALIZE_QUA_CYBLACK_GOAL_POSTING_TE = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-INITIALIZE-QUA-CYBLACK-GOAL-POSTING-TEMPLATE-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_GOAL_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-GOAL-POSTING-CLASS");



























    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");





























    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_GOAL_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-GOAL-POSTING-INSTANCE");



    static private final SubLList $list_alt119 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-CYBLACK-GOAL-POSTING-TEMPLATE"), makeSymbol("SELF")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-INITIALIZE-METHOD");

    private static final SubLSymbol GET_SATISFACTION_TYPE_INTERNAL = makeSymbol("GET-SATISFACTION-TYPE-INTERNAL");

    static private final SubLList $list_alt122 = list(list(RET, makeSymbol("SATISFACTION-TYPE")));

    static private final SubLSymbol $sym123$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_GET_SATISFACTION_TYPE_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-SATISFACTION-TYPE-INTERNAL-METHOD");

    private static final SubLSymbol SET_SATISFACTION_TYPE_INTERNAL = makeSymbol("SET-SATISFACTION-TYPE-INTERNAL");

    static private final SubLList $list_alt126 = list(makeSymbol("NEW-SATISFACTION-TYPE"));

    static private final SubLList $list_alt127 = list(list(makeSymbol("CSETQ"), makeSymbol("SATISFACTION-TYPE"), makeSymbol("NEW-SATISFACTION-TYPE")), list(RET, makeSymbol("NEW-SATISFACTION-TYPE")));

    static private final SubLSymbol $sym128$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_SET_SATISFACTION_TYPE_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-SET-SATISFACTION-TYPE-INTERNAL-METHOD");



    static private final SubLList $list_alt131 = list(list(makeSymbol("PCASE"), makeSymbol("SATISFACTION-TYPE"), list(makeKeyword("ANY"), list(RET, list(makeSymbol("FIF"), makeSymbol("MATCHES"), T, NIL))), list(makeKeyword("ALL"), list(RET, NIL)), list(makeSymbol("OTHERWISE"), list(makeSymbol("PIF"), list(makeSymbol("CONSP"), makeSymbol("SATISFACTION-TYPE")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPE"), list(makeSymbol("CAR"), makeSymbol("SATISFACTION-TYPE"))), list(makeSymbol("ARGS"), list(makeSymbol("CDR"), makeSymbol("SATISFACTION-TYPE")))), list(makeSymbol("PCASE"), makeSymbol("TYPE"), list(makeKeyword("AT-LEAST"), list(makeSymbol("CLET"), list(list(makeSymbol("MINIMUM-MATCH-COUNT"), list(makeSymbol("FIF"), list(makeSymbol("CONSP"), makeSymbol("ARGS")), list(makeSymbol("CAR"), makeSymbol("ARGS")), NIL))), list(makeSymbol("PWHEN"), list(makeSymbol("INTEGERP"), makeSymbol("MINIMUM-MATCH-COUNT")), list(RET, list(makeSymbol("LENGTH>="), makeSymbol("MATCHES"), makeSymbol("MINIMUM-MATCH-COUNT")))))), list(makeSymbol("OTHERWISE"), list(RET, NIL)))), list(RET, NIL)))));

    static private final SubLSymbol $sym132$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");



    private static final SubLSymbol $AT_LEAST = makeKeyword("AT-LEAST");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_SATISFIED_P_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-SATISFIED-P-METHOD");

    static private final SubLList $list_alt136 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_ON_SATISFIED_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-ON-SATISFIED-METHOD");

    private static final SubLSymbol GET_COUNT_INTERNAL = makeSymbol("GET-COUNT-INTERNAL");

    static private final SubLList $list_alt139 = list(list(RET, makeSymbol("COUNT")));

    static private final SubLSymbol $sym140$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_GET_COUNT_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-COUNT-INTERNAL-METHOD");

    private static final SubLSymbol SET_COUNT_INTERNAL = makeSymbol("SET-COUNT-INTERNAL");

    static private final SubLList $list_alt143 = list(list(makeSymbol("CSETQ"), makeSymbol("COUNT"), makeSymbol("NEW-COUNT")), list(RET, makeSymbol("NEW-COUNT")));

    static private final SubLSymbol $sym144$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_SET_COUNT_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-SET-COUNT-INTERNAL-METHOD");

    private static final SubLSymbol GET_TIMEOUT_INTERNAL = makeSymbol("GET-TIMEOUT-INTERNAL");

    static private final SubLList $list_alt147 = list(list(RET, makeSymbol("TIMEOUT")));

    static private final SubLSymbol $sym148$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_GET_TIMEOUT_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-TIMEOUT-INTERNAL-METHOD");

    private static final SubLSymbol SET_TIMEOUT_INTERNAL = makeSymbol("SET-TIMEOUT-INTERNAL");

    static private final SubLList $list_alt151 = list(list(makeSymbol("CSETQ"), makeSymbol("TIMEOUT"), makeSymbol("UNIVERSAL-TIME")), list(RET, makeSymbol("UNIVERSAL-TIME")));

    static private final SubLSymbol $sym152$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_SET_TIMEOUT_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-SET-TIMEOUT-INTERNAL-METHOD");

    private static final SubLSymbol GET_UNPARSED_GOAL_PATTERN_INTERNAL = makeSymbol("GET-UNPARSED-GOAL-PATTERN-INTERNAL");

    static private final SubLList $list_alt155 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt156 = list(list(RET, makeSymbol("UNPARSED-GOAL-PATTERN")));

    static private final SubLSymbol $sym157$CYBLACK_BASIC_GOAL_POSTING_GET_UNPARSED_GOAL_PATTERN_INTERNAL_MET = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-UNPARSED-GOAL-PATTERN-INTERNAL-METHOD");

    private static final SubLSymbol SET_UNPARSED_GOAL_PATTERN_INTERNAL = makeSymbol("SET-UNPARSED-GOAL-PATTERN-INTERNAL");

    static private final SubLList $list_alt159 = list(makeSymbol("NEW-UNPARSED-GOAL-PATTERN"));

    static private final SubLList $list_alt160 = list(list(makeSymbol("CSETQ"), makeSymbol("UNPARSED-GOAL-PATTERN"), makeSymbol("NEW-UNPARSED-GOAL-PATTERN")), list(RET, makeSymbol("NEW-UNPARSED-GOAL-PATTERN")));

    static private final SubLSymbol $sym161$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    static private final SubLSymbol $sym162$CYBLACK_BASIC_GOAL_POSTING_SET_UNPARSED_GOAL_PATTERN_INTERNAL_MET = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-SET-UNPARSED-GOAL-PATTERN-INTERNAL-METHOD");

    private static final SubLSymbol GET_GOAL_PATTERN_INTERNAL = makeSymbol("GET-GOAL-PATTERN-INTERNAL");

    static private final SubLList $list_alt164 = list(list(RET, makeSymbol("GOAL-PATTERN")));

    static private final SubLSymbol $sym165$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_GET_GOAL_PATTERN_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-GOAL-PATTERN-INTERNAL-METHOD");

    private static final SubLSymbol SET_GOAL_PATTERN_INTERNAL = makeSymbol("SET-GOAL-PATTERN-INTERNAL");

    static private final SubLList $list_alt168 = list(list(makeSymbol("CSETQ"), makeSymbol("GOAL-PATTERN"), makeSymbol("NEW-GOAL-PATTERN")), list(RET, makeSymbol("NEW-GOAL-PATTERN")));

    static private final SubLSymbol $sym169$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_SET_GOAL_PATTERN_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-SET-GOAL-PATTERN-INTERNAL-METHOD");

    private static final SubLSymbol GET_MATCHES_INTERNAL = makeSymbol("GET-MATCHES-INTERNAL");

    static private final SubLList $list_alt172 = list(list(RET, makeSymbol("MATCHES")));

    static private final SubLSymbol $sym173$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_GET_MATCHES_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-MATCHES-INTERNAL-METHOD");

    private static final SubLSymbol SET_MATCHES_INTERNAL = makeSymbol("SET-MATCHES-INTERNAL");

    static private final SubLList $list_alt176 = list(makeSymbol("NEW-MATCHES"));

    static private final SubLList $list_alt177 = list(list(makeSymbol("CSETQ"), makeSymbol("MATCHES"), makeSymbol("NEW-MATCHES")), list(RET, makeSymbol("NEW-MATCHES")));

    static private final SubLSymbol $sym178$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_SET_MATCHES_INTERNAL_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-SET-MATCHES-INTERNAL-METHOD");



    static private final SubLList $list_alt181 = list(list(makeSymbol("ON-POST"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("POSTING-DAEMON"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON")), makeSymbol("POSTING-DAEMON"), makeSymbol("APPLICATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-DAEMON"), list(QUOTE, makeSymbol("SET-GOAL-POSTING")), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-LOCAL-ENVIRONMENT"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-ENVIRONMENT"))))), list(makeSymbol("CYBLACK-ENVIRONMENT-PUSH-TYPED-LOCAL-BINDING-METHOD"), makeSymbol("NEW-LOCAL-ENVIRONMENT"), list(QUOTE, makeSymbol("?SELF")), list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("SELF")), makeSymbol("SELF"), T), list(makeSymbol("CYBLACK-ENVIRONMENT-PUSH-LOCAL-BINDING-METHOD"), makeSymbol("NEW-LOCAL-ENVIRONMENT"), list(QUOTE, makeSymbol("?THE-POSTING")), NIL, T), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-DAEMON"), list(QUOTE, makeSymbol("SET-LOCAL-ENVIRONMENT")), makeSymbol("NEW-LOCAL-ENVIRONMENT"))), list(makeSymbol("PWHEN"), makeSymbol("GOAL-PATTERN"), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-BAG"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("GOAL-PATTERN"), list(QUOTE, makeSymbol("GET-DATATYPE-BAG"))))), list(makeSymbol("PWHEN"), makeSymbol("DATATYPE-BAG"), list(makeSymbol("CLET"), list(list(makeSymbol("UNIQUE-DATATYPES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE-BAG"), list(QUOTE, makeSymbol("GET-UNIQUE-ELEMENTS"))))), list(makeSymbol("PWHEN"), makeSymbol("UNIQUE-DATATYPES"), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("FIF"), makeSymbol("APPLICATION"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("BLACKBOARD"), list(makeSymbol("CLET"), list(list(makeSymbol("PANELS"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("DATATYPE"), makeSymbol("UNIQUE-DATATYPES"), makeSymbol("PANELS")), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CURRENT-PANEL"), makeSymbol("PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-PANEL"), list(QUOTE, makeSymbol("ADD-POSTING-DAEMON")), makeSymbol("POSTING-DAEMON"))))))))))), list(RET, NIL));

    static private final SubLSymbol $sym182$OUTER_CATCH_FOR_CYBLACK_BASIC_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_GOAL_SATISFACTION_DAEMON = makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON");

    private static final SubLSymbol SET_GOAL_POSTING = makeSymbol("SET-GOAL-POSTING");



    static private final SubLSymbol $sym186$_SELF = makeSymbol("?SELF");

    static private final SubLSymbol $sym187$_THE_POSTING = makeSymbol("?THE-POSTING");

    private static final SubLSymbol SET_LOCAL_ENVIRONMENT = makeSymbol("SET-LOCAL-ENVIRONMENT");







    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_ON_POST_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-ON-POST-METHOD");

    private static final SubLSymbol GET_POSTING_DAEMON = makeSymbol("GET-POSTING-DAEMON");

    static private final SubLList $list_alt194 = list(list(RET, makeSymbol("POSTING-DAEMON")));

    private static final SubLSymbol CYBLACK_BASIC_GOAL_POSTING_GET_POSTING_DAEMON_METHOD = makeSymbol("CYBLACK-BASIC-GOAL-POSTING-GET-POSTING-DAEMON-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING");



    public static final SubLInteger $int$27 = makeInteger(27);

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_GET_MATCHES_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-MATCHES-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_ADD_MATCH_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-ADD-MATCH-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_SET_GOAL_PATTERN_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-SET-GOAL-PATTERN-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_GET_GOAL_PATTERN_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-GOAL-PATTERN-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_SET_TIMEOUT_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-SET-TIMEOUT-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_GET_TIMEOUT_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-TIMEOUT-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_SET_COUNT_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-SET-COUNT-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_GET_COUNT_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-COUNT-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_SET_SATISFACTION_TYPE_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-SET-SATISFACTION-TYPE-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_GET_SATISFACTION_TYPE_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-SATISFACTION-TYPE-METHOD");

    static private final SubLSymbol $sym209$CYBLACK_ORDINAL_GOAL_POSTING_INITIALIZE_QUA_CYBLACK_GOAL_POSTING_ = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-INITIALIZE-QUA-CYBLACK-GOAL-POSTING-TEMPLATE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ORDINAL_GOAL_POSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ORDINAL-GOAL-POSTING-CLASS");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_ORDINAL_GOAL_POSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-ORDINAL-GOAL-POSTING-INSTANCE");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-INITIALIZE-METHOD");

    static private final SubLSymbol $sym214$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    static private final SubLSymbol $sym215$CYBLACK_ORDINAL_GOAL_POSTING_GET_SATISFACTION_TYPE_INTERNAL_METHO = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-SATISFACTION-TYPE-INTERNAL-METHOD");

    static private final SubLSymbol $sym216$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    static private final SubLSymbol $sym217$CYBLACK_ORDINAL_GOAL_POSTING_SET_SATISFACTION_TYPE_INTERNAL_METHO = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-SET-SATISFACTION-TYPE-INTERNAL-METHOD");

    static private final SubLSymbol $sym218$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_SATISFIED_P_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-SATISFIED-P-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_ON_SATISFIED_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-ON-SATISFIED-METHOD");

    static private final SubLSymbol $sym221$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_GET_COUNT_INTERNAL_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-COUNT-INTERNAL-METHOD");

    static private final SubLSymbol $sym223$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_SET_COUNT_INTERNAL_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-SET-COUNT-INTERNAL-METHOD");

    static private final SubLSymbol $sym225$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_GET_TIMEOUT_INTERNAL_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-TIMEOUT-INTERNAL-METHOD");

    static private final SubLSymbol $sym227$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_SET_TIMEOUT_INTERNAL_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-SET-TIMEOUT-INTERNAL-METHOD");

    static private final SubLSymbol $sym229$CYBLACK_ORDINAL_GOAL_POSTING_GET_UNPARSED_GOAL_PATTERN_INTERNAL_M = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-UNPARSED-GOAL-PATTERN-INTERNAL-METHOD");

    static private final SubLSymbol $sym230$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    static private final SubLSymbol $sym231$CYBLACK_ORDINAL_GOAL_POSTING_SET_UNPARSED_GOAL_PATTERN_INTERNAL_M = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-SET-UNPARSED-GOAL-PATTERN-INTERNAL-METHOD");

    static private final SubLSymbol $sym232$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_GET_GOAL_PATTERN_INTERNAL_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-GOAL-PATTERN-INTERNAL-METHOD");

    static private final SubLSymbol $sym234$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_SET_GOAL_PATTERN_INTERNAL_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-SET-GOAL-PATTERN-INTERNAL-METHOD");

    static private final SubLSymbol $sym236$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_GET_MATCHES_INTERNAL_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-MATCHES-INTERNAL-METHOD");

    static private final SubLSymbol $sym238$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_SET_MATCHES_INTERNAL_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-SET-MATCHES-INTERNAL-METHOD");

    static private final SubLList $list_alt240 = list(list(makeSymbol("ON-POST"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("POSTING-DAEMON"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-GOAL-SATISFACTION-DAEMON")), makeSymbol("POSTING-DAEMON"), makeSymbol("APPLICATION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-DAEMON"), list(QUOTE, makeSymbol("SET-GOAL-POSTING")), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-LOCAL-ENVIRONMENT"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-ENVIRONMENT"))))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PUSH-TYPED-LOCAL-BINDING"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("NEW-LOCAL-ENVIRONMENT"), list(QUOTE, makeSymbol("?SELF")), list(makeSymbol("CYBLACK-POSTING-GET-DATATYPE"), makeSymbol("SELF")), makeSymbol("SELF"), T), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("PUSH-LOCAL-BINDING"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("NEW-LOCAL-ENVIRONMENT"), list(QUOTE, makeSymbol("?THE-POSTING")), NIL, T), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-DAEMON"), list(QUOTE, makeSymbol("SET-LOCAL-ENVIRONMENT")), makeSymbol("NEW-LOCAL-ENVIRONMENT"))), list(makeSymbol("PWHEN"), makeSymbol("GOAL-PATTERN"), list(makeSymbol("CLET"), list(list(makeSymbol("DATATYPE-BAG"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("GOAL-PATTERN"), list(QUOTE, makeSymbol("GET-DATATYPE-BAG"))))), list(makeSymbol("PWHEN"), makeSymbol("DATATYPE-BAG"), list(makeSymbol("CLET"), list(list(makeSymbol("UNIQUE-DATATYPES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE-BAG"), list(QUOTE, makeSymbol("GET-UNIQUE-ELEMENTS"))))), list(makeSymbol("PWHEN"), makeSymbol("UNIQUE-DATATYPES"), list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD"), list(makeSymbol("FIF"), makeSymbol("APPLICATION"), list(makeSymbol("CYBLACK-APPLICATION-GET-BLACKBOARD"), makeSymbol("APPLICATION")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("BLACKBOARD"), list(makeSymbol("CLET"), list(list(makeSymbol("PANELS"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("DATATYPE"), makeSymbol("UNIQUE-DATATYPES"), makeSymbol("PANELS")), list(makeSymbol("CYBLACK-DATATYPE-GET-PANEL"), makeSymbol("DATATYPE"), makeSymbol("BLACKBOARD"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CURRENT-PANEL"), makeSymbol("PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-PANEL"), list(QUOTE, makeSymbol("ADD-POSTING-DAEMON")), makeSymbol("POSTING-DAEMON"))))))))))), list(RET, NIL));

    static private final SubLSymbol $sym241$OUTER_CATCH_FOR_CYBLACK_ORDINAL_GOAL_POSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-ORDINAL-GOAL-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_ON_POST_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-ON-POST-METHOD");

    private static final SubLSymbol CYBLACK_ORDINAL_GOAL_POSTING_GET_POSTING_DAEMON_METHOD = makeSymbol("CYBLACK-ORDINAL-GOAL-POSTING-GET-POSTING-DAEMON-METHOD");

    static private final SubLString $str_alt244$CYBLACK_GOAL_POSTING_GET_SATISFAC = makeString("CYBLACK-GOAL-POSTING-GET-SATISFACTION-TYPE: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt245$CYBLACK_GOAL_POSTING_SET_SATISFAC = makeString("CYBLACK-GOAL-POSTING-SET-SATISFACTION-TYPE: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt246$CYBLACK_GOAL_POSTING_SATISFIED_P_ = makeString("CYBLACK-GOAL-POSTING-SATISFIED-P: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt247$CYBLACK_GOAL_POSTING_ON_SATISFIED = makeString("CYBLACK-GOAL-POSTING-ON-SATISFIED: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt248$CYBLACK_GOAL_POSTING_GET_COUNT___ = makeString("CYBLACK-GOAL-POSTING-GET-COUNT: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt249$CYBLACK_GOAL_POSTING_SET_COUNT___ = makeString("CYBLACK-GOAL-POSTING-SET-COUNT: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt250$CYBLACK_GOAL_POSTING_GET_TIMEOUT_ = makeString("CYBLACK-GOAL-POSTING-GET-TIMEOUT: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt251$CYBLACK_GOAL_POSTING_SET_TIMEOUT_ = makeString("CYBLACK-GOAL-POSTING-SET-TIMEOUT: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt252$CYBLACK_GOAL_POSTING_SET_DELTA_TI = makeString("CYBLACK-GOAL-POSTING-SET-DELTA-TIMEOUT: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt253$CYBLACK_GOAL_POSTING_GET_GOAL_PAT = makeString("CYBLACK-GOAL-POSTING-GET-GOAL-PATTERN: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt254$CYBLACK_GOAL_POSTING_SET_GOAL_PAT = makeString("CYBLACK-GOAL-POSTING-SET-GOAL-PATTERN: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt255$CYBLACK_GOAL_POSTING_ADD_MATCH___ = makeString("CYBLACK-GOAL-POSTING-ADD-MATCH: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt256$CYBLACK_GOAL_POSTING_GET_MATCHES_ = makeString("CYBLACK-GOAL-POSTING-GET-MATCHES: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    static private final SubLString $str_alt257$CYBLACK_GOAL_POSTING_GET_LOCAL_EN = makeString("CYBLACK-GOAL-POSTING-GET-LOCAL-ENVIRONMENT: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    private static final SubLSymbol GET_LOCAL_ENVIRONMENT = makeSymbol("GET-LOCAL-ENVIRONMENT");

    static private final SubLString $str_alt259$CYBLACK_GOAL_POSTING_SET_LOCAL_EN = makeString("CYBLACK-GOAL-POSTING-SET-LOCAL-ENVIRONMENT: ~S is not an instance of CYBLACK-GOAL-POSTING.");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_goal_file();
    }

    public void initializeVariables() {
        init_cyblack_goal_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_goal_file();
    }
}

