/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
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
 *  module:      CYBLACK-CYCPOSTING
 *  source file: /cyc/top/cycl/cyblack/cyblack-cycposting.lisp
 *  created:     2019/07/03 17:38:44
 */
public final class cyblack_cycposting extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_cycposting() {
    }

    public static final SubLFile me = new cyblack_cycposting();


    // // Definitions
    public static final SubLObject cyblack_cycposting_p(SubLObject v_cyblack_cycposting) {
        return interfaces.subloop_instanceof_interface(v_cyblack_cycposting, CYBLACK_CYCPOSTING);
    }

    public static final SubLObject get_cyblack_basic_cycposting_formula(SubLObject cyblack_basic_cycposting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_cycposting, $int$24, FORMULA);
    }

    public static final SubLObject set_cyblack_basic_cycposting_formula(SubLObject cyblack_basic_cycposting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_cycposting, value, $int$24, FORMULA);
    }

    public static final SubLObject get_cyblack_basic_cycposting_direction(SubLObject cyblack_basic_cycposting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_cycposting, $int$23, DIRECTION);
    }

    public static final SubLObject set_cyblack_basic_cycposting_direction(SubLObject cyblack_basic_cycposting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_cycposting, value, $int$23, DIRECTION);
    }

    public static final SubLObject get_cyblack_basic_cycposting_strength(SubLObject cyblack_basic_cycposting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_cycposting, $int$22, STRENGTH);
    }

    public static final SubLObject set_cyblack_basic_cycposting_strength(SubLObject cyblack_basic_cycposting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_cycposting, value, $int$22, STRENGTH);
    }

    public static final SubLObject get_cyblack_basic_cycposting_mt(SubLObject cyblack_basic_cycposting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_cycposting, $int$21, MT);
    }

    public static final SubLObject set_cyblack_basic_cycposting_mt(SubLObject cyblack_basic_cycposting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_cycposting, value, $int$21, MT);
    }

    public static final SubLObject get_cyblack_basic_cycposting_is_query(SubLObject cyblack_basic_cycposting) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_cycposting, TWENTY_INTEGER, IS_QUERY);
    }

    public static final SubLObject set_cyblack_basic_cycposting_is_query(SubLObject cyblack_basic_cycposting, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_cycposting, value, TWENTY_INTEGER, IS_QUERY);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_cycposting_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_cycposting_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPOSTING, IS_QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPOSTING, MT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPOSTING, STRENGTH, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPOSTING, DIRECTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPOSTING, FORMULA, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_cycposting_p(SubLObject cyblack_basic_cycposting) {
        return classes.subloop_instanceof_class(cyblack_basic_cycposting, CYBLACK_BASIC_CYCPOSTING);
    }

    public static final SubLObject cyblack_basic_cycposting_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_cycposting_method = NIL;
            SubLObject formula = get_cyblack_basic_cycposting_formula(self);
            SubLObject direction = get_cyblack_basic_cycposting_direction(self);
            SubLObject strength = get_cyblack_basic_cycposting_strength(self);
            SubLObject mt = get_cyblack_basic_cycposting_mt(self);
            SubLObject is_query = get_cyblack_basic_cycposting_is_query(self);
            try {
                try {
                    cyblack_posting.cyblack_basic_posting_initialize_method(self);
                    is_query = NIL;
                    mt = NIL;
                    strength = $DEFAULT;
                    direction = $FORWARD;
                    formula = NIL;
                    sublisp_throw($sym52$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_cycposting_formula(self, formula);
                            set_cyblack_basic_cycposting_direction(self, direction);
                            set_cyblack_basic_cycposting_strength(self, strength);
                            set_cyblack_basic_cycposting_mt(self, mt);
                            set_cyblack_basic_cycposting_is_query(self, is_query);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_cycposting_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_cycposting_method;
        }
    }

    public static final SubLObject cyblack_basic_cycposting_is_query_method(SubLObject self) {
        {
            SubLObject is_query = get_cyblack_basic_cycposting_is_query(self);
            return is_query;
        }
    }

    public static final SubLObject cyblack_basic_cycposting_set_is_query_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_basic_cycposting_method = NIL;
            SubLObject is_query = get_cyblack_basic_cycposting_is_query(self);
            try {
                try {
                    is_query = (NIL != new_state) ? ((SubLObject) (T)) : NIL;
                    sublisp_throw($sym63$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, is_query);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_cycposting_is_query(self, is_query);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_cycposting_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_cycposting_method;
        }
    }

    public static final SubLObject cyblack_basic_cycposting_get_mt_method(SubLObject self) {
        {
            SubLObject mt = get_cyblack_basic_cycposting_mt(self);
            SubLObject panel = cyblack_posting.get_cyblack_basic_posting_panel(self);
            if (NIL != mt) {
                return mt;
            } else {
                if ((NIL != panel) && (NIL != instances.instance_of_p(panel, CYBLACK_CYCPANEL))) {
                    return methods.funcall_instance_method_with_0_args(panel, GET_DEFAULT_MT);
                } else {
                    return NIL;
                }
            }
        }
    }

    public static final SubLObject cyblack_basic_cycposting_set_mt_method(SubLObject self, SubLObject new_mt) {
        {
            SubLObject catch_var_for_cyblack_basic_cycposting_method = NIL;
            SubLObject mt = get_cyblack_basic_cycposting_mt(self);
            try {
                try {
                    mt = new_mt;
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_cycposting_mt(self, mt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_cycposting_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_cycposting_method;
        }
    }

    public static final SubLObject cyblack_basic_cycposting_get_formula_method(SubLObject self) {
        {
            SubLObject formula = get_cyblack_basic_cycposting_formula(self);
            return formula;
        }
    }

    public static final SubLObject cyblack_basic_cycposting_set_formula_method(SubLObject self, SubLObject new_formula) {
        {
            SubLObject catch_var_for_cyblack_basic_cycposting_method = NIL;
            SubLObject formula = get_cyblack_basic_cycposting_formula(self);
            try {
                try {
                    formula = copy_tree(new_formula);
                    sublisp_throw($sym81$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, new_formula);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_cycposting_formula(self, formula);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_cycposting_method = Errors.handleThrowable(ccatch_env_var, $sym81$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_cycposting_method;
        }
    }

    public static final SubLObject cyblack_basic_cycposting_get_strength_method(SubLObject self) {
        {
            SubLObject strength = get_cyblack_basic_cycposting_strength(self);
            return strength;
        }
    }

    public static final SubLObject cyblack_basic_cycposting_set_strength_method(SubLObject self, SubLObject new_strength) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_cycposting_method = NIL;
                SubLObject strength = get_cyblack_basic_cycposting_strength(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_strength) || (NIL != enumeration_types.el_strength_p(new_strength)))) {
                                Errors.error($str_alt90$_SET_STRENGTH__S____S_is_not_a_va, self, new_strength);
                            }
                        }
                        strength = (NIL != new_strength) ? ((SubLObject) (new_strength)) : $DEFAULT;
                        sublisp_throw($sym89$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, new_strength);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_cycposting_strength(self, strength);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_cycposting_method = Errors.handleThrowable(ccatch_env_var, $sym89$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD);
                }
                return catch_var_for_cyblack_basic_cycposting_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_cycposting_get_direction_method(SubLObject self) {
        {
            SubLObject direction = get_cyblack_basic_cycposting_direction(self);
            return direction;
        }
    }

    public static final SubLObject cyblack_basic_cycposting_set_direction_method(SubLObject self, SubLObject new_direction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_cycposting_method = NIL;
                SubLObject direction = get_cyblack_basic_cycposting_direction(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_direction) || (NIL != enumeration_types.direction_p(new_direction)))) {
                                Errors.error($str_alt99$_SET_DIRECTION__S____S_is_not_a_v, self, new_direction);
                            }
                        }
                        direction = (NIL != new_direction) ? ((SubLObject) (new_direction)) : $FORWARD;
                        sublisp_throw($sym98$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, new_direction);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_cycposting_direction(self, direction);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_cycposting_method = Errors.handleThrowable(ccatch_env_var, $sym98$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD);
                }
                return catch_var_for_cyblack_basic_cycposting_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_cycposting_perform_query_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_basic_cycposting_method = NIL;
                SubLObject formula = get_cyblack_basic_cycposting_formula(self);
                SubLObject is_query = get_cyblack_basic_cycposting_is_query(self);
                SubLObject panel = cyblack_posting.get_cyblack_basic_posting_panel(self);
                try {
                    try {
                        if ((((NIL != is_query) && (NIL != formula)) && (NIL != panel)) && (NIL != cyblack_cycpanel.cyblack_backward_panel_p(panel))) {
                            {
                                SubLObject ask_result = NIL;
                                SubLObject local_mt = cyblack_basic_cycposting_get_mt_method(self);
                                {
                                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                                    try {
                                        api_control_vars.$use_local_queueP$.bind(methods.funcall_instance_method_with_0_args(panel, $sym104$GET_USE_LOCAL_QUEUE_), thread);
                                        {
                                            SubLObject backchain = methods.funcall_instance_method_with_0_args(panel, GET_CYC_BACKCHAIN);
                                            SubLObject number = methods.funcall_instance_method_with_0_args(panel, GET_CYC_NUMBER);
                                            SubLObject time = methods.funcall_instance_method_with_0_args(panel, GET_CYC_TIME);
                                            SubLObject depth = methods.funcall_instance_method_with_0_args(panel, GET_CYC_DEPTH);
                                            ask_result = fi.fi_ask(formula, local_mt, backchain, number, time, depth);
                                        }
                                    } finally {
                                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                                {
                                    SubLObject new_posting = NIL;
                                    if (ask_result.equal($list_alt109)) {
                                        new_posting = methods.funcall_instance_method_with_0_args(panel, NEW_POSTING);
                                        methods.funcall_instance_method_with_1_args(new_posting, SET_IS_QUERY, NIL);
                                        methods.funcall_instance_method_with_1_args(new_posting, SET_MT, local_mt);
                                        methods.funcall_instance_method_with_1_args(new_posting, SET_FORMULA, $$True);
                                        cyblack_panel_dispatch_functions.cyblack_panel_add_posting(panel, new_posting);
                                        sublisp_throw($sym103$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, T);
                                    }
                                    {
                                        SubLObject cdolist_list_var = ask_result;
                                        SubLObject v_bindings = NIL;
                                        for (v_bindings = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_bindings = cdolist_list_var.first()) {
                                            new_posting = methods.funcall_instance_method_with_0_args(panel, NEW_POSTING);
                                            methods.funcall_instance_method_with_1_args(new_posting, SET_IS_QUERY, NIL);
                                            methods.funcall_instance_method_with_1_args(new_posting, SET_MT, local_mt);
                                            methods.funcall_instance_method_with_1_args(new_posting, SET_FORMULA, sublis(v_bindings, formula, UNPROVIDED, UNPROVIDED));
                                            cyblack_panel_dispatch_functions.cyblack_panel_add_posting(panel, new_posting);
                                        }
                                    }
                                    sublisp_throw($sym103$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, NIL != ask_result ? ((SubLObject) (T)) : NIL);
                                }
                            }
                        }
                        sublisp_throw($sym103$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_basic_cycposting_formula(self, formula);
                                set_cyblack_basic_cycposting_is_query(self, is_query);
                                cyblack_posting.set_cyblack_basic_posting_panel(self, panel);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_basic_cycposting_method = Errors.handleThrowable(ccatch_env_var, $sym103$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD);
                }
                return catch_var_for_cyblack_basic_cycposting_method;
            }
        }
    }

    public static final SubLObject cyblack_basic_cycposting_assert_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_cycposting_method = NIL;
            SubLObject formula = get_cyblack_basic_cycposting_formula(self);
            SubLObject direction = get_cyblack_basic_cycposting_direction(self);
            SubLObject strength = get_cyblack_basic_cycposting_strength(self);
            SubLObject mt = get_cyblack_basic_cycposting_mt(self);
            SubLObject is_query = get_cyblack_basic_cycposting_is_query(self);
            try {
                try {
                    if (NIL != is_query) {
                        Errors.warn($str_alt116$_ASSERT__S___Attempt_to_assert_qu, self, formula);
                        sublisp_throw($sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, NIL);
                    }
                    if (NIL == formula) {
                        Errors.warn($str_alt117$_ASSERT__S___Averted_assert_due_t, self);
                        sublisp_throw($sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, NIL);
                    }
                    if (NIL == mt) {
                        Errors.warn($str_alt118$_ASSERT__S___Averted_assert_due_t, self);
                        sublisp_throw($sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, NIL);
                    }
                    sublisp_throw($sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD, fi.fi_assert(formula, mt, strength, direction));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_cycposting_formula(self, formula);
                            set_cyblack_basic_cycposting_direction(self, direction);
                            set_cyblack_basic_cycposting_strength(self, strength);
                            set_cyblack_basic_cycposting_mt(self, mt);
                            set_cyblack_basic_cycposting_is_query(self, is_query);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_cycposting_method = Errors.handleThrowable(ccatch_env_var, $sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD);
            }
            return catch_var_for_cyblack_basic_cycposting_method;
        }
    }

    public static final SubLObject cyblack_query_posting_p(SubLObject v_object) {
        return makeBoolean((NIL != cyblack_cycposting_p(v_object)) && (NIL != methods.funcall_instance_method_with_0_args(v_object, IS_QUERY)));
    }

    public static final SubLObject declare_cyblack_cycposting_file() {
        declareFunction("cyblack_cycposting_p", "CYBLACK-CYCPOSTING-P", 1, 0, false);
        declareFunction("get_cyblack_basic_cycposting_formula", "GET-CYBLACK-BASIC-CYCPOSTING-FORMULA", 1, 0, false);
        declareFunction("set_cyblack_basic_cycposting_formula", "SET-CYBLACK-BASIC-CYCPOSTING-FORMULA", 2, 0, false);
        declareFunction("get_cyblack_basic_cycposting_direction", "GET-CYBLACK-BASIC-CYCPOSTING-DIRECTION", 1, 0, false);
        declareFunction("set_cyblack_basic_cycposting_direction", "SET-CYBLACK-BASIC-CYCPOSTING-DIRECTION", 2, 0, false);
        declareFunction("get_cyblack_basic_cycposting_strength", "GET-CYBLACK-BASIC-CYCPOSTING-STRENGTH", 1, 0, false);
        declareFunction("set_cyblack_basic_cycposting_strength", "SET-CYBLACK-BASIC-CYCPOSTING-STRENGTH", 2, 0, false);
        declareFunction("get_cyblack_basic_cycposting_mt", "GET-CYBLACK-BASIC-CYCPOSTING-MT", 1, 0, false);
        declareFunction("set_cyblack_basic_cycposting_mt", "SET-CYBLACK-BASIC-CYCPOSTING-MT", 2, 0, false);
        declareFunction("get_cyblack_basic_cycposting_is_query", "GET-CYBLACK-BASIC-CYCPOSTING-IS-QUERY", 1, 0, false);
        declareFunction("set_cyblack_basic_cycposting_is_query", "SET-CYBLACK-BASIC-CYCPOSTING-IS-QUERY", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_cycposting_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-CYCPOSTING-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_cycposting_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-CYCPOSTING-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_cycposting_p", "CYBLACK-BASIC-CYCPOSTING-P", 1, 0, false);
        declareFunction("cyblack_basic_cycposting_initialize_method", "CYBLACK-BASIC-CYCPOSTING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycposting_is_query_method", "CYBLACK-BASIC-CYCPOSTING-IS-QUERY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycposting_set_is_query_method", "CYBLACK-BASIC-CYCPOSTING-SET-IS-QUERY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_cycposting_get_mt_method", "CYBLACK-BASIC-CYCPOSTING-GET-MT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycposting_set_mt_method", "CYBLACK-BASIC-CYCPOSTING-SET-MT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_cycposting_get_formula_method", "CYBLACK-BASIC-CYCPOSTING-GET-FORMULA-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycposting_set_formula_method", "CYBLACK-BASIC-CYCPOSTING-SET-FORMULA-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_cycposting_get_strength_method", "CYBLACK-BASIC-CYCPOSTING-GET-STRENGTH-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycposting_set_strength_method", "CYBLACK-BASIC-CYCPOSTING-SET-STRENGTH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_cycposting_get_direction_method", "CYBLACK-BASIC-CYCPOSTING-GET-DIRECTION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycposting_set_direction_method", "CYBLACK-BASIC-CYCPOSTING-SET-DIRECTION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_cycposting_perform_query_method", "CYBLACK-BASIC-CYCPOSTING-PERFORM-QUERY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycposting_assert_method", "CYBLACK-BASIC-CYCPOSTING-ASSERT-METHOD", 1, 0, false);
        declareFunction("cyblack_query_posting_p", "CYBLACK-QUERY-POSTING-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_cycposting_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_cycposting_file() {
                interfaces.new_interface(CYBLACK_CYCPOSTING, CYBLACK_POSTING, $list_alt2, $list_alt3);
        classes.subloop_new_class(CYBLACK_BASIC_CYCPOSTING, CYBLACK_BASIC_POSTING, $list_alt6, NIL, $list_alt7);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_CYCPOSTING, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_CYCPOSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_CYCPOSTING_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_CYCPOSTING, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_CYCPOSTING_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_cycposting_class(CYBLACK_BASIC_CYCPOSTING);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_CYCPOSTING, $list_alt50, NIL, $list_alt51);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, INITIALIZE, CYBLACK_BASIC_CYCPOSTING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(IS_QUERY, CYBLACK_BASIC_CYCPOSTING, $list_alt56, NIL, $list_alt57);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, IS_QUERY, CYBLACK_BASIC_CYCPOSTING_IS_QUERY_METHOD);
        methods.methods_incorporate_instance_method(SET_IS_QUERY, CYBLACK_BASIC_CYCPOSTING, $list_alt60, $list_alt61, $list_alt62);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, SET_IS_QUERY, CYBLACK_BASIC_CYCPOSTING_SET_IS_QUERY_METHOD);
        methods.methods_incorporate_instance_method(GET_MT, CYBLACK_BASIC_CYCPOSTING, $list_alt56, NIL, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, GET_MT, CYBLACK_BASIC_CYCPOSTING_GET_MT_METHOD);
        methods.methods_incorporate_instance_method(SET_MT, CYBLACK_BASIC_CYCPOSTING, $list_alt60, $list_alt71, $list_alt72);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, SET_MT, CYBLACK_BASIC_CYCPOSTING_SET_MT_METHOD);
        methods.methods_incorporate_instance_method(GET_FORMULA, CYBLACK_BASIC_CYCPOSTING, $list_alt56, NIL, $list_alt76);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, GET_FORMULA, CYBLACK_BASIC_CYCPOSTING_GET_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(SET_FORMULA, CYBLACK_BASIC_CYCPOSTING, $list_alt60, $list_alt79, $list_alt80);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, SET_FORMULA, CYBLACK_BASIC_CYCPOSTING_SET_FORMULA_METHOD);
        methods.methods_incorporate_instance_method(GET_STRENGTH, CYBLACK_BASIC_CYCPOSTING, $list_alt56, NIL, $list_alt84);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, GET_STRENGTH, CYBLACK_BASIC_CYCPOSTING_GET_STRENGTH_METHOD);
        methods.methods_incorporate_instance_method(SET_STRENGTH, CYBLACK_BASIC_CYCPOSTING, $list_alt60, $list_alt87, $list_alt88);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, SET_STRENGTH, CYBLACK_BASIC_CYCPOSTING_SET_STRENGTH_METHOD);
        methods.methods_incorporate_instance_method(GET_DIRECTION, CYBLACK_BASIC_CYCPOSTING, $list_alt56, NIL, $list_alt93);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, GET_DIRECTION, CYBLACK_BASIC_CYCPOSTING_GET_DIRECTION_METHOD);
        methods.methods_incorporate_instance_method(SET_DIRECTION, CYBLACK_BASIC_CYCPOSTING, $list_alt60, $list_alt96, $list_alt97);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, SET_DIRECTION, CYBLACK_BASIC_CYCPOSTING_SET_DIRECTION_METHOD);
        methods.methods_incorporate_instance_method(PERFORM_QUERY, CYBLACK_BASIC_CYCPOSTING, $list_alt60, NIL, $list_alt102);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, PERFORM_QUERY, CYBLACK_BASIC_CYCPOSTING_PERFORM_QUERY_METHOD);
        methods.methods_incorporate_instance_method(ASSERT, CYBLACK_BASIC_CYCPOSTING, $list_alt60, NIL, $list_alt114);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPOSTING, ASSERT, CYBLACK_BASIC_CYCPOSTING_ASSERT_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_CYCPOSTING = makeSymbol("CYBLACK-CYCPOSTING");



    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), makeSymbol("CYBLACK-POSTING"));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IS-QUERY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-IS-QUERY"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MT"), list(makeSymbol("NEW-MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FORMULA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FORMULA"), list(makeSymbol("NEW-FORMULA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STRENGTH"), list(makeSymbol("NEW-STRENGTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECTION"), list(makeSymbol("NEW-DIRECTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-QUERY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASSERT"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING = makeSymbol("CYBLACK-BASIC-CYCPOSTING");



    static private final SubLList $list_alt6 = list(makeSymbol("CYBLACK-CYCPOSTING"));

    static private final SubLList $list_alt7 = list(new SubLObject[]{ list(makeSymbol("IS-QUERY"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MT"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STRENGTH"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DIRECTION"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("FORMULA"), makeKeyword("ESSENTIAL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IS-QUERY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-IS-QUERY"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MT"), list(makeSymbol("NEW-MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FORMULA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FORMULA"), list(makeSymbol("NEW-FORMULA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRENGTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STRENGTH"), list(makeSymbol("NEW-STRENGTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DIRECTION"), list(makeSymbol("NEW-DIRECTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-QUERY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASSERT"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLInteger $int$24 = makeInteger(24);



    public static final SubLInteger $int$23 = makeInteger(23);



    public static final SubLInteger $int$22 = makeInteger(22);



    public static final SubLInteger $int$21 = makeInteger(21);









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_CYCPOSTING_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-CYCPOSTING-CLASS");



























    private static final SubLSymbol CYBLACK_BASIC_SUPPORT_DEPENDENT = makeSymbol("CYBLACK-BASIC-SUPPORT-DEPENDENT");





























    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_CYCPOSTING_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-CYCPOSTING-INSTANCE");



    static private final SubLList $list_alt50 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt51 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("IS-QUERY"), NIL), list(makeSymbol("CSETQ"), makeSymbol("MT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("STRENGTH"), makeKeyword("DEFAULT")), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), makeKeyword("FORWARD")), list(makeSymbol("CSETQ"), makeSymbol("FORMULA"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym52$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPOSTING-METHOD");





    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-INITIALIZE-METHOD");

    static private final SubLList $list_alt56 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt57 = list(list(RET, makeSymbol("IS-QUERY")));

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_IS_QUERY_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-IS-QUERY-METHOD");

    private static final SubLSymbol SET_IS_QUERY = makeSymbol("SET-IS-QUERY");

    static private final SubLList $list_alt60 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt61 = list(makeSymbol("NEW-STATE"));

    static private final SubLList $list_alt62 = list(list(makeSymbol("CSETQ"), makeSymbol("IS-QUERY"), list(makeSymbol("FIF"), makeSymbol("NEW-STATE"), T, NIL)), list(RET, makeSymbol("IS-QUERY")));

    static private final SubLSymbol $sym63$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPOSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_SET_IS_QUERY_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-SET-IS-QUERY-METHOD");



    static private final SubLList $list_alt66 = list(list(makeSymbol("PIF"), makeSymbol("MT"), list(RET, makeSymbol("MT")), list(makeSymbol("PIF"), list(makeSymbol("CAND"), makeSymbol("PANEL"), list(makeSymbol("INSTANCE-OF-P"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("CYBLACK-CYCPANEL")))), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("GET-DEFAULT-MT")))), list(RET, NIL))));

    private static final SubLSymbol CYBLACK_CYCPANEL = makeSymbol("CYBLACK-CYCPANEL");

    private static final SubLSymbol GET_DEFAULT_MT = makeSymbol("GET-DEFAULT-MT");

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_GET_MT_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-GET-MT-METHOD");



    static private final SubLList $list_alt71 = list(makeSymbol("NEW-MT"));

    static private final SubLList $list_alt72 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-MT")), list(makeSymbol("CONSTANT-P"), makeSymbol("NEW-MT"))), makeString("(SET-MT ~S): ~S is not a legal value for an MT.  A Cyc constant was expected."), makeSymbol("SELF"), makeSymbol("NEW-MT")), list(makeSymbol("CSETQ"), makeSymbol("MT"), makeSymbol("NEW-MT")));

    static private final SubLSymbol $sym73$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPOSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_SET_MT_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-SET-MT-METHOD");



    static private final SubLList $list_alt76 = list(list(RET, makeSymbol("FORMULA")));

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_GET_FORMULA_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-GET-FORMULA-METHOD");

    private static final SubLSymbol SET_FORMULA = makeSymbol("SET-FORMULA");

    static private final SubLList $list_alt79 = list(makeSymbol("NEW-FORMULA"));

    static private final SubLList $list_alt80 = list(list(makeSymbol("CSETQ"), makeSymbol("FORMULA"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-FORMULA"))), list(RET, makeSymbol("NEW-FORMULA")));

    static private final SubLSymbol $sym81$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPOSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_SET_FORMULA_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-SET-FORMULA-METHOD");

    private static final SubLSymbol GET_STRENGTH = makeSymbol("GET-STRENGTH");

    static private final SubLList $list_alt84 = list(list(RET, makeSymbol("STRENGTH")));

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_GET_STRENGTH_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-GET-STRENGTH-METHOD");

    private static final SubLSymbol SET_STRENGTH = makeSymbol("SET-STRENGTH");

    static private final SubLList $list_alt87 = list(makeSymbol("NEW-STRENGTH"));

    static private final SubLList $list_alt88 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-STRENGTH")), list(makeSymbol("EL-STRENGTH-P"), makeSymbol("NEW-STRENGTH"))), makeString("(SET-STRENGTH ~S): ~S is not a valid value for an assertion stength."), makeSymbol("SELF"), makeSymbol("NEW-STRENGTH")), list(makeSymbol("CSETQ"), makeSymbol("STRENGTH"), list(makeSymbol("FIF"), makeSymbol("NEW-STRENGTH"), makeSymbol("NEW-STRENGTH"), makeKeyword("DEFAULT"))), list(RET, makeSymbol("NEW-STRENGTH")));

    static private final SubLSymbol $sym89$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPOSTING-METHOD");

    static private final SubLString $str_alt90$_SET_STRENGTH__S____S_is_not_a_va = makeString("(SET-STRENGTH ~S): ~S is not a valid value for an assertion stength.");

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_SET_STRENGTH_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-SET-STRENGTH-METHOD");



    static private final SubLList $list_alt93 = list(list(RET, makeSymbol("DIRECTION")));

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_GET_DIRECTION_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-GET-DIRECTION-METHOD");



    static private final SubLList $list_alt96 = list(makeSymbol("NEW-DIRECTION"));

    static private final SubLList $list_alt97 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-DIRECTION")), list(makeSymbol("DIRECTION-P"), makeSymbol("NEW-DIRECTION"))), makeString("(SET-DIRECTION ~S): ~S is not a valid direction."), makeSymbol("SELF"), makeSymbol("NEW-DIRECTION")), list(makeSymbol("CSETQ"), makeSymbol("DIRECTION"), list(makeSymbol("FIF"), makeSymbol("NEW-DIRECTION"), makeSymbol("NEW-DIRECTION"), makeKeyword("FORWARD"))), list(RET, makeSymbol("NEW-DIRECTION")));

    static private final SubLSymbol $sym98$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPOSTING-METHOD");

    static private final SubLString $str_alt99$_SET_DIRECTION__S____S_is_not_a_v = makeString("(SET-DIRECTION ~S): ~S is not a valid direction.");

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_SET_DIRECTION_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-SET-DIRECTION-METHOD");

    private static final SubLSymbol PERFORM_QUERY = makeSymbol("PERFORM-QUERY");

    static private final SubLList $list_alt102 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("IS-QUERY"), makeSymbol("FORMULA"), makeSymbol("PANEL"), list(makeSymbol("CYBLACK-BACKWARD-PANEL-P"), makeSymbol("PANEL"))), list(makeSymbol("CLET"), list(list(makeSymbol("ASK-RESULT"), NIL), list(makeSymbol("LOCAL-MT"), list(makeSymbol("GET-MT"), makeSymbol("SELF")))), list(makeSymbol("CLET"), list(list(makeSymbol("*USE-LOCAL-QUEUE?*"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("GET-USE-LOCAL-QUEUE?")))), list(makeSymbol("BACKCHAIN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("GET-CYC-BACKCHAIN")))), list(makeSymbol("NUMBER"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("GET-CYC-NUMBER")))), list(makeSymbol("TIME"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("GET-CYC-TIME")))), list(makeSymbol("DEPTH"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("GET-CYC-DEPTH"))))), list(makeSymbol("CSETQ"), makeSymbol("ASK-RESULT"), list(makeSymbol("FI-ASK"), makeSymbol("FORMULA"), makeSymbol("LOCAL-MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH")))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-POSTING"), NIL)), list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("ASK-RESULT"), list(QUOTE, list(list(cons(T, T))))), list(makeSymbol("CSETQ"), makeSymbol("NEW-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("NEW-POSTING")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-POSTING"), list(QUOTE, makeSymbol("SET-IS-QUERY")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-POSTING"), list(QUOTE, makeSymbol("SET-MT")), makeSymbol("LOCAL-MT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-POSTING"), list(QUOTE, makeSymbol("SET-FORMULA")), constant_handles.reader_make_constant_shell(makeString("True"))), list(makeSymbol("CYBLACK-PANEL-ADD-POSTING"), makeSymbol("PANEL"), makeSymbol("NEW-POSTING")), list(RET, T)), list(makeSymbol("CDOLIST"), list(makeSymbol("BINDINGS"), makeSymbol("ASK-RESULT")), list(makeSymbol("CSETQ"), makeSymbol("NEW-POSTING"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PANEL"), list(QUOTE, makeSymbol("NEW-POSTING")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-POSTING"), list(QUOTE, makeSymbol("SET-IS-QUERY")), NIL), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-POSTING"), list(QUOTE, makeSymbol("SET-MT")), makeSymbol("LOCAL-MT")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-POSTING"), list(QUOTE, makeSymbol("SET-FORMULA")), list(makeSymbol("SUBLIS"), makeSymbol("BINDINGS"), makeSymbol("FORMULA"))), list(makeSymbol("CYBLACK-PANEL-ADD-POSTING"), makeSymbol("PANEL"), makeSymbol("NEW-POSTING"))), list(RET, list(makeSymbol("FIF"), makeSymbol("ASK-RESULT"), T, NIL))))), list(RET, NIL));

    static private final SubLSymbol $sym103$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPOSTING-METHOD");

    static private final SubLSymbol $sym104$GET_USE_LOCAL_QUEUE_ = makeSymbol("GET-USE-LOCAL-QUEUE?");

    private static final SubLSymbol GET_CYC_BACKCHAIN = makeSymbol("GET-CYC-BACKCHAIN");

    private static final SubLSymbol GET_CYC_NUMBER = makeSymbol("GET-CYC-NUMBER");

    private static final SubLSymbol GET_CYC_TIME = makeSymbol("GET-CYC-TIME");

    private static final SubLSymbol GET_CYC_DEPTH = makeSymbol("GET-CYC-DEPTH");

    static private final SubLList $list_alt109 = list(list(cons(T, T)));



    public static final SubLObject $$True = constant_handles.reader_make_constant_shell(makeString("True"));

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_PERFORM_QUERY_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-PERFORM-QUERY-METHOD");

    private static final SubLSymbol ASSERT = makeSymbol("ASSERT");

    static private final SubLList $list_alt114 = list(list(makeSymbol("PWHEN"), makeSymbol("IS-QUERY"), list(makeSymbol("WARN"), makeString("(ASSERT ~S): Attempt to assert query ~S was averted."), makeSymbol("SELF"), makeSymbol("FORMULA")), list(RET, NIL)), list(makeSymbol("PUNLESS"), makeSymbol("FORMULA"), list(makeSymbol("WARN"), makeString("(ASSERT ~S): Averted assert due to null formula."), makeSymbol("SELF")), list(RET, NIL)), list(makeSymbol("PUNLESS"), makeSymbol("MT"), list(makeSymbol("WARN"), makeString("(ASSERT ~S): Averted assert due to absense of micro theory."), makeSymbol("SELF")), list(RET, NIL)), list(RET, list(makeSymbol("FI-ASSERT"), makeSymbol("FORMULA"), makeSymbol("MT"), makeSymbol("STRENGTH"), makeSymbol("DIRECTION"))));

    static private final SubLSymbol $sym115$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPOSTING_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPOSTING-METHOD");

    static private final SubLString $str_alt116$_ASSERT__S___Attempt_to_assert_qu = makeString("(ASSERT ~S): Attempt to assert query ~S was averted.");

    static private final SubLString $str_alt117$_ASSERT__S___Averted_assert_due_t = makeString("(ASSERT ~S): Averted assert due to null formula.");

    static private final SubLString $str_alt118$_ASSERT__S___Averted_assert_due_t = makeString("(ASSERT ~S): Averted assert due to absense of micro theory.");

    private static final SubLSymbol CYBLACK_BASIC_CYCPOSTING_ASSERT_METHOD = makeSymbol("CYBLACK-BASIC-CYCPOSTING-ASSERT-METHOD");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_cyblack_cycposting_file();
    }

    @Override
    public void initializeVariables() {
        init_cyblack_cycposting_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyblack_cycposting_file();
    }
}

