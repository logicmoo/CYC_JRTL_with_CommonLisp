/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.enumerations;
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
 *  module:      CYBLACK-CYCPANEL
 *  source file: /cyc/top/cycl/cyblack/cyblack-cycpanel.lisp
 *  created:     2019/07/03 17:38:47
 */
public final class cyblack_cycpanel extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_cycpanel() {
    }

    public static final SubLFile me = new cyblack_cycpanel();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_cycpanel";

    // // Definitions
    /**
     * Enumerated values of type CYBLACK-CYCPANEL-QUERY-ACTION.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_cycpanel_query_actions$ = makeSymbol("*VALID-CYBLACK-CYCPANEL-QUERY-ACTIONS*");

    /**
     * Returns a list of all valid members of the CYBLACK-CYCPANEL-QUERY-ACTION enumeration.
     */
    public static final SubLObject valid_cyblack_cycpanel_query_actions() {
        return $valid_cyblack_cycpanel_query_actions$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-CYCPANEL-QUERY-ACTION enumeration.
     */
    public static final SubLObject cyblack_cycpanel_query_action_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_cycpanel_query_actions$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-CYCPANEL-QUERY-ACTION enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_cycpanel_query_action(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_cycpanel_query_actions$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt2$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_CYCPANEL_QUERY_ACTION, value, CYBLACK_CYCPANEL_QUERY_ACTION);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-CYCPANEL-QUERY-ACTION enumeration.
     */
    public static final SubLObject decode_cyblack_cycpanel_query_action(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_cycpanel_query_actions$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt4$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_CYCPANEL_QUERY_ACTION, value, CYBLACK_CYCPANEL_QUERY_ACTION);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-CYCPANEL-QUERY-ACTION enumeration.
     */
    public static final SubLObject cyblack_cycpanel_query_action_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_cycpanel_query_action_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CYCPANEL_QUERY_ACTION_P, value1, CYBLACK_CYCPANEL_QUERY_ACTION);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_cycpanel_query_action_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CYCPANEL_QUERY_ACTION_P, value2, CYBLACK_CYCPANEL_QUERY_ACTION);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_cycpanel_query_actions$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-CYCPANEL-QUERY-ACTION enumeration.
     */
    public static final SubLObject cyblack_cycpanel_query_action_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_cycpanel_query_action_p(value1)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CYCPANEL_QUERY_ACTION_P, value1, CYBLACK_CYCPANEL_QUERY_ACTION);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_cycpanel_query_action_p(value2)) {
                    Errors.error($str_alt6$_S___S_was_expected_to_be_a_membe, CYBLACK_CYCPANEL_QUERY_ACTION_P, value2, CYBLACK_CYCPANEL_QUERY_ACTION);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_cycpanel_query_actions$.getGlobalValue();
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

    public static final SubLObject cyblack_cycpanel_p(SubLObject v_cyblack_cycpanel) {
        return interfaces.subloop_instanceof_interface(v_cyblack_cycpanel, CYBLACK_CYCPANEL);
    }

    public static final SubLObject cyblack_forward_panel_p(SubLObject cyblack_forward_panel) {
        return interfaces.subloop_instanceof_interface(cyblack_forward_panel, CYBLACK_FORWARD_PANEL);
    }

    public static final SubLObject cyblack_backward_panel_p(SubLObject cyblack_backward_panel) {
        return interfaces.subloop_instanceof_interface(cyblack_backward_panel, CYBLACK_BACKWARD_PANEL);
    }

    public static final SubLObject get_cyblack_basic_cycpanel_default_mt(SubLObject cyblack_basic_cycpanel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_cycpanel, SEVENTEEN_INTEGER, DEFAULT_MT);
    }

    public static final SubLObject set_cyblack_basic_cycpanel_default_mt(SubLObject cyblack_basic_cycpanel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_cycpanel, value, SEVENTEEN_INTEGER, DEFAULT_MT);
    }

    public static final SubLObject get_cyblack_basic_cycpanel_use_local_queueP(SubLObject cyblack_basic_cycpanel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_cycpanel, SIXTEEN_INTEGER, $sym21$USE_LOCAL_QUEUE_);
    }

    public static final SubLObject set_cyblack_basic_cycpanel_use_local_queueP(SubLObject cyblack_basic_cycpanel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_cycpanel, value, SIXTEEN_INTEGER, $sym21$USE_LOCAL_QUEUE_);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_cycpanel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_cycpanel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, $sym21$USE_LOCAL_QUEUE_, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, DEFAULT_MT, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_cycpanel_p(SubLObject cyblack_basic_cycpanel) {
        return classes.subloop_instanceof_class(cyblack_basic_cycpanel, CYBLACK_BASIC_CYCPANEL);
    }

    public static final SubLObject cyblack_basic_cycpanel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_cycpanel_method = NIL;
            SubLObject default_mt = get_cyblack_basic_cycpanel_default_mt(self);
            try {
                try {
                    cyblack_panel.cyblack_basic_panel_initialize_method(self);
                    default_mt = $$BaseKB;
                    sublisp_throw($sym48$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_cycpanel_default_mt(self, default_mt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_cycpanel_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_cycpanel_method;
        }
    }

    public static final SubLObject cyblack_basic_cycpanel_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        cyblack_panel.cyblack_basic_panel_print_method(self, stream, depth);
        return self;
    }

    public static final SubLObject cyblack_basic_cycpanel_get_use_local_queueP_method(SubLObject self) {
        {
            SubLObject use_local_queueP = get_cyblack_basic_cycpanel_use_local_queueP(self);
            return use_local_queueP;
        }
    }

    public static final SubLObject cyblack_basic_cycpanel_set_use_local_queueP_method(SubLObject self, SubLObject new_value) {
        {
            SubLObject catch_var_for_cyblack_basic_cycpanel_method = NIL;
            SubLObject use_local_queueP = get_cyblack_basic_cycpanel_use_local_queueP(self);
            try {
                try {
                    use_local_queueP = (NIL != new_value) ? ((SubLObject) (T)) : NIL;
                    sublisp_throw($sym63$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD, use_local_queueP);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_cycpanel_use_local_queueP(self, use_local_queueP);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_cycpanel_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_cycpanel_method;
        }
    }

    public static final SubLObject cyblack_basic_cycpanel_get_default_mt_method(SubLObject self) {
        {
            SubLObject default_mt = get_cyblack_basic_cycpanel_default_mt(self);
            return default_mt;
        }
    }

    public static final SubLObject cyblack_basic_cycpanel_set_default_mt_method(SubLObject self, SubLObject new_mt) {
        {
            SubLObject catch_var_for_cyblack_basic_cycpanel_method = NIL;
            SubLObject default_mt = get_cyblack_basic_cycpanel_default_mt(self);
            try {
                try {
                    default_mt = new_mt;
                    sublisp_throw($sym71$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD, new_mt);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_cycpanel_default_mt(self, default_mt);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_cycpanel_method = Errors.handleThrowable(ccatch_env_var, $sym71$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_cycpanel_method;
        }
    }

    public static final SubLObject cyblack_basic_cycpanel_get_all_formulae_method(SubLObject self) {
        {
            SubLObject all_postings = cyblack_panel.cyblack_basic_panel_get_all_postings_method(self);
            SubLObject all_formulae = NIL;
            SubLObject list_expression = all_postings;
            if (NIL == list_expression) {
                all_formulae = NIL;
            } else
                if (list_expression.isAtom()) {
                    all_formulae = list(list_expression);
                } else
                    if (NIL == list_expression.rest()) {
                        {
                            SubLObject posting = list_expression.first();
                            all_formulae = (NIL != cyblack_cycposting.cyblack_cycposting_p(posting)) ? ((SubLObject) (list(methods.funcall_instance_method_with_0_args(posting, GET_FORMULA)))) : NIL;
                        }
                    } else {
                        {
                            SubLObject tail_cons = NIL;
                            SubLObject result = NIL;
                            all_formulae = NIL;
                            {
                                SubLObject cdolist_list_var = list_expression;
                                SubLObject posting = NIL;
                                for (posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting = cdolist_list_var.first()) {
                                    result = (NIL != cyblack_cycposting.cyblack_cycposting_p(posting)) ? ((SubLObject) (list(methods.funcall_instance_method_with_0_args(posting, GET_FORMULA)))) : NIL;
                                    if (NIL != result) {
                                        if (NIL != tail_cons) {
                                            rplacd(tail_cons, result);
                                            tail_cons = last(result, UNPROVIDED);
                                        } else {
                                            all_formulae = (NIL != cyblack_cycposting.cyblack_cycposting_p(posting)) ? ((SubLObject) (list(methods.funcall_instance_method_with_0_args(posting, GET_FORMULA)))) : NIL;
                                            tail_cons = last(all_formulae, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }


            return all_formulae;
        }
    }

    public static final SubLObject cyblack_basic_cycpanel_get_all_active_formulae_method(SubLObject self) {
        {
            SubLObject all_postings = cyblack_panel.cyblack_basic_panel_get_all_active_postings_method(self);
            SubLObject all_formulae = NIL;
            SubLObject list_expression = all_postings;
            if (NIL == list_expression) {
                all_formulae = NIL;
            } else
                if (list_expression.isAtom()) {
                    all_formulae = list(list_expression);
                } else
                    if (NIL == list_expression.rest()) {
                        {
                            SubLObject posting = list_expression.first();
                            all_formulae = (NIL != cyblack_cycposting.cyblack_cycposting_p(posting)) ? ((SubLObject) (list(methods.funcall_instance_method_with_0_args(posting, GET_FORMULA)))) : NIL;
                        }
                    } else {
                        {
                            SubLObject tail_cons = NIL;
                            SubLObject result = NIL;
                            all_formulae = NIL;
                            {
                                SubLObject cdolist_list_var = list_expression;
                                SubLObject posting = NIL;
                                for (posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting = cdolist_list_var.first()) {
                                    result = (NIL != cyblack_cycposting.cyblack_cycposting_p(posting)) ? ((SubLObject) (list(methods.funcall_instance_method_with_0_args(posting, GET_FORMULA)))) : NIL;
                                    if (NIL != result) {
                                        if (NIL != tail_cons) {
                                            rplacd(tail_cons, result);
                                            tail_cons = last(result, UNPROVIDED);
                                        } else {
                                            all_formulae = (NIL != cyblack_cycposting.cyblack_cycposting_p(posting)) ? ((SubLObject) (list(methods.funcall_instance_method_with_0_args(posting, GET_FORMULA)))) : NIL;
                                            tail_cons = last(all_formulae, UNPROVIDED);
                                        }
                                    }
                                }
                            }
                        }
                    }


            return all_formulae;
        }
    }

    public static final SubLObject cyblack_basic_cycpanel_deactivate_all_postings_method(SubLObject self) {
        {
            SubLObject all_active_postings = cyblack_panel.cyblack_basic_panel_get_all_active_postings_method(self);
            SubLObject cdolist_list_var = all_active_postings;
            SubLObject posting = NIL;
            for (posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting = cdolist_list_var.first()) {
                cyblack_posting_dispatch_functions.cyblack_posting_set_active(posting, NIL);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_cycpanel_remove_all_postings_method(SubLObject self) {
        {
            SubLObject all_postings = cyblack_panel.cyblack_basic_panel_get_all_postings_method(self);
            SubLObject cdolist_list_var = all_postings;
            SubLObject posting = NIL;
            for (posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , posting = cdolist_list_var.first()) {
                cyblack_panel.cyblack_basic_panel_remove_posting_method(self, posting);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_cycpanel_new_posting_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_cycpanel_method = NIL;
            SubLObject datatype = cyblack_panel.get_cyblack_basic_panel_datatype(self);
            try {
                try {
                    if (NIL != datatype) {
                        sublisp_throw($sym88$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD, cyblack_datatype.cyblack_datatype_create_posting(datatype));
                    }
                    sublisp_throw($sym88$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_panel.set_cyblack_basic_panel_datatype(self, datatype);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_cycpanel_method = Errors.handleThrowable(ccatch_env_var, $sym88$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_cycpanel_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_forward_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_forward_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, $sym21$USE_LOCAL_QUEUE_, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, DEFAULT_MT, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_forward_panel_p(SubLObject cyblack_basic_forward_panel) {
        return classes.subloop_instanceof_class(cyblack_basic_forward_panel, CYBLACK_BASIC_FORWARD_PANEL);
    }

    public static final SubLObject get_cyblack_basic_backward_panel_query_action(SubLObject cyblack_basic_backward_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_backward_panel, $int$23, QUERY_ACTION);
    }

    public static final SubLObject set_cyblack_basic_backward_panel_query_action(SubLObject cyblack_basic_backward_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_backward_panel, value, $int$23, QUERY_ACTION);
    }

    public static final SubLObject get_cyblack_basic_backward_panel_most_recent_query(SubLObject cyblack_basic_backward_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_backward_panel, $int$22, MOST_RECENT_QUERY);
    }

    public static final SubLObject set_cyblack_basic_backward_panel_most_recent_query(SubLObject cyblack_basic_backward_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_backward_panel, value, $int$22, MOST_RECENT_QUERY);
    }

    public static final SubLObject get_cyblack_basic_backward_panel_cyc_depth(SubLObject cyblack_basic_backward_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_backward_panel, $int$21, CYC_DEPTH);
    }

    public static final SubLObject set_cyblack_basic_backward_panel_cyc_depth(SubLObject cyblack_basic_backward_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_backward_panel, value, $int$21, CYC_DEPTH);
    }

    public static final SubLObject get_cyblack_basic_backward_panel_cyc_time(SubLObject cyblack_basic_backward_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_backward_panel, TWENTY_INTEGER, CYC_TIME);
    }

    public static final SubLObject set_cyblack_basic_backward_panel_cyc_time(SubLObject cyblack_basic_backward_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_backward_panel, value, TWENTY_INTEGER, CYC_TIME);
    }

    public static final SubLObject get_cyblack_basic_backward_panel_cyc_number(SubLObject cyblack_basic_backward_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_backward_panel, NINETEEN_INTEGER, CYC_NUMBER);
    }

    public static final SubLObject set_cyblack_basic_backward_panel_cyc_number(SubLObject cyblack_basic_backward_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_backward_panel, value, NINETEEN_INTEGER, CYC_NUMBER);
    }

    public static final SubLObject get_cyblack_basic_backward_panel_cyc_backchain(SubLObject cyblack_basic_backward_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_backward_panel, EIGHTEEN_INTEGER, CYC_BACKCHAIN);
    }

    public static final SubLObject set_cyblack_basic_backward_panel_cyc_backchain(SubLObject cyblack_basic_backward_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_backward_panel, value, EIGHTEEN_INTEGER, CYC_BACKCHAIN);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_backward_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_backward_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_EQUALITY_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, ELEMENT_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, FIRST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, LAST_LINK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, $sym21$USE_LOCAL_QUEUE_, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, DEFAULT_MT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, CYC_BACKCHAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, CYC_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, CYC_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, CYC_DEPTH, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, MOST_RECENT_QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, QUERY_ACTION, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_backward_panel_p(SubLObject cyblack_basic_backward_panel) {
        return classes.subloop_instanceof_class(cyblack_basic_backward_panel, CYBLACK_BASIC_BACKWARD_PANEL);
    }

    public static final SubLObject cyblack_basic_backward_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_backward_panel_method = NIL;
            SubLObject most_recent_query = get_cyblack_basic_backward_panel_most_recent_query(self);
            SubLObject cyc_depth = get_cyblack_basic_backward_panel_cyc_depth(self);
            SubLObject cyc_time = get_cyblack_basic_backward_panel_cyc_time(self);
            SubLObject cyc_number = get_cyblack_basic_backward_panel_cyc_number(self);
            SubLObject cyc_backchain = get_cyblack_basic_backward_panel_cyc_backchain(self);
            try {
                try {
                    cyblack_basic_cycpanel_initialize_method(self);
                    cyc_backchain = NIL;
                    cyc_number = NIL;
                    cyc_time = NIL;
                    cyc_depth = NIL;
                    most_recent_query = NIL;
                    sublisp_throw($sym109$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_backward_panel_most_recent_query(self, most_recent_query);
                            set_cyblack_basic_backward_panel_cyc_depth(self, cyc_depth);
                            set_cyblack_basic_backward_panel_cyc_time(self, cyc_time);
                            set_cyblack_basic_backward_panel_cyc_number(self, cyc_number);
                            set_cyblack_basic_backward_panel_cyc_backchain(self, cyc_backchain);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_backward_panel_method = Errors.handleThrowable(ccatch_env_var, $sym109$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_backward_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_get_cyc_backchain_method(SubLObject self) {
        {
            SubLObject cyc_backchain = get_cyblack_basic_backward_panel_cyc_backchain(self);
            return cyc_backchain;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_set_cyc_backchain_method(SubLObject self, SubLObject new_backchain) {
        {
            SubLObject catch_var_for_cyblack_basic_backward_panel_method = NIL;
            SubLObject cyc_backchain = get_cyblack_basic_backward_panel_cyc_backchain(self);
            try {
                try {
                    cyc_backchain = new_backchain;
                    sublisp_throw($sym117$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD, new_backchain);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_backward_panel_cyc_backchain(self, cyc_backchain);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_backward_panel_method = Errors.handleThrowable(ccatch_env_var, $sym117$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_backward_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_get_cyc_number_method(SubLObject self) {
        {
            SubLObject cyc_number = get_cyblack_basic_backward_panel_cyc_number(self);
            return cyc_number;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_set_cyc_number_method(SubLObject self, SubLObject new_number) {
        {
            SubLObject catch_var_for_cyblack_basic_backward_panel_method = NIL;
            SubLObject cyc_number = get_cyblack_basic_backward_panel_cyc_number(self);
            try {
                try {
                    cyc_number = new_number;
                    sublisp_throw($sym125$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD, new_number);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_backward_panel_cyc_number(self, cyc_number);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_backward_panel_method = Errors.handleThrowable(ccatch_env_var, $sym125$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_backward_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_get_cyc_time_method(SubLObject self) {
        {
            SubLObject cyc_time = get_cyblack_basic_backward_panel_cyc_time(self);
            return cyc_time;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_set_cyc_time_method(SubLObject self, SubLObject new_time) {
        {
            SubLObject catch_var_for_cyblack_basic_backward_panel_method = NIL;
            SubLObject cyc_time = get_cyblack_basic_backward_panel_cyc_time(self);
            try {
                try {
                    cyc_time = new_time;
                    sublisp_throw($sym133$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD, new_time);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_backward_panel_cyc_time(self, cyc_time);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_backward_panel_method = Errors.handleThrowable(ccatch_env_var, $sym133$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_backward_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_get_cyc_depth_method(SubLObject self) {
        {
            SubLObject cyc_depth = get_cyblack_basic_backward_panel_cyc_depth(self);
            return cyc_depth;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_set_cyc_depth_method(SubLObject self, SubLObject new_depth) {
        {
            SubLObject catch_var_for_cyblack_basic_backward_panel_method = NIL;
            SubLObject cyc_depth = get_cyblack_basic_backward_panel_cyc_depth(self);
            try {
                try {
                    cyc_depth = new_depth;
                    sublisp_throw($sym141$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD, new_depth);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_backward_panel_cyc_depth(self, cyc_depth);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_backward_panel_method = Errors.handleThrowable(ccatch_env_var, $sym141$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_backward_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_get_most_recent_query_method(SubLObject self) {
        {
            SubLObject most_recent_query = get_cyblack_basic_backward_panel_most_recent_query(self);
            return most_recent_query;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_set_most_recent_query_method(SubLObject self, SubLObject query_posting) {
        {
            SubLObject catch_var_for_cyblack_basic_backward_panel_method = NIL;
            SubLObject most_recent_query = get_cyblack_basic_backward_panel_most_recent_query(self);
            try {
                try {
                    most_recent_query = query_posting;
                    sublisp_throw($sym149$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD, query_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_backward_panel_most_recent_query(self, most_recent_query);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_backward_panel_method = Errors.handleThrowable(ccatch_env_var, $sym149$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_backward_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_get_query_action_method(SubLObject self) {
        {
            SubLObject query_action = get_cyblack_basic_backward_panel_query_action(self);
            return query_action;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_set_query_action_method(SubLObject self, SubLObject new_query_action) {
        {
            SubLObject catch_var_for_cyblack_basic_backward_panel_method = NIL;
            SubLObject query_action = get_cyblack_basic_backward_panel_query_action(self);
            try {
                try {
                    query_action = new_query_action;
                    sublisp_throw($sym157$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD, new_query_action);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_backward_panel_query_action(self, query_action);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_backward_panel_method = Errors.handleThrowable(ccatch_env_var, $sym157$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_backward_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_backward_panel_method = NIL;
            SubLObject query_action = get_cyblack_basic_backward_panel_query_action(self);
            try {
                try {
                    if (NIL != cyblack_cycposting.cyblack_query_posting_p(posting)) {
                        cyblack_basic_backward_panel_set_most_recent_query_method(self, posting);
                        {
                            SubLObject pcase_var = query_action;
                            if (pcase_var.eql($DEACTIVATE)) {
                                cyblack_basic_cycpanel_deactivate_all_postings_method(self);
                            } else
                                if (pcase_var.eql($REMOVE)) {
                                    cyblack_basic_cycpanel_remove_all_postings_method(self);
                                }

                        }
                        cyblack_panel.cyblack_basic_panel_add_posting_method(self, posting);
                        methods.funcall_instance_method_with_0_args(posting, PERFORM_QUERY);
                        sublisp_throw($sym162$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD, posting);
                    }
                    sublisp_throw($sym162$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD, cyblack_panel.cyblack_basic_panel_add_posting_method(self, posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_backward_panel_query_action(self, query_action);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_backward_panel_method = Errors.handleThrowable(ccatch_env_var, $sym162$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_backward_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_add_direct_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_backward_panel_method = NIL;
            SubLObject query_action = get_cyblack_basic_backward_panel_query_action(self);
            try {
                try {
                    if (NIL != cyblack_cycposting.cyblack_query_posting_p(posting)) {
                        cyblack_basic_backward_panel_set_most_recent_query_method(self, posting);
                        {
                            SubLObject pcase_var = query_action;
                            if (pcase_var.eql($DEACTIVATE)) {
                                cyblack_basic_cycpanel_deactivate_all_postings_method(self);
                            } else
                                if (pcase_var.eql($REMOVE)) {
                                    cyblack_basic_cycpanel_remove_all_postings_method(self);
                                }

                        }
                        cyblack_panel.cyblack_basic_panel_add_direct_posting_method(self, posting);
                        methods.funcall_instance_method_with_0_args(posting, PERFORM_QUERY);
                        sublisp_throw($sym169$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD, posting);
                    }
                    sublisp_throw($sym169$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD, cyblack_panel.cyblack_basic_panel_add_posting_method(self, posting));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_backward_panel_query_action(self, query_action);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_backward_panel_method = Errors.handleThrowable(ccatch_env_var, $sym169$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_backward_panel_method;
        }
    }

    public static final SubLObject declare_cyblack_cycpanel_file() {
        declareFunction("valid_cyblack_cycpanel_query_actions", "VALID-CYBLACK-CYCPANEL-QUERY-ACTIONS", 0, 0, false);
        declareFunction("cyblack_cycpanel_query_action_p", "CYBLACK-CYCPANEL-QUERY-ACTION-P", 1, 0, false);
        declareFunction("encode_cyblack_cycpanel_query_action", "ENCODE-CYBLACK-CYCPANEL-QUERY-ACTION", 1, 0, false);
        declareFunction("decode_cyblack_cycpanel_query_action", "DECODE-CYBLACK-CYCPANEL-QUERY-ACTION", 1, 0, false);
        declareFunction("cyblack_cycpanel_query_action_less_p", "CYBLACK-CYCPANEL-QUERY-ACTION-LESS-P", 2, 0, false);
        declareFunction("cyblack_cycpanel_query_action_greater_p", "CYBLACK-CYCPANEL-QUERY-ACTION-GREATER-P", 2, 0, false);
        declareFunction("cyblack_cycpanel_p", "CYBLACK-CYCPANEL-P", 1, 0, false);
        declareFunction("cyblack_forward_panel_p", "CYBLACK-FORWARD-PANEL-P", 1, 0, false);
        declareFunction("cyblack_backward_panel_p", "CYBLACK-BACKWARD-PANEL-P", 1, 0, false);
        declareFunction("get_cyblack_basic_cycpanel_default_mt", "GET-CYBLACK-BASIC-CYCPANEL-DEFAULT-MT", 1, 0, false);
        declareFunction("set_cyblack_basic_cycpanel_default_mt", "SET-CYBLACK-BASIC-CYCPANEL-DEFAULT-MT", 2, 0, false);
        declareFunction("get_cyblack_basic_cycpanel_use_local_queueP", "GET-CYBLACK-BASIC-CYCPANEL-USE-LOCAL-QUEUE?", 1, 0, false);
        declareFunction("set_cyblack_basic_cycpanel_use_local_queueP", "SET-CYBLACK-BASIC-CYCPANEL-USE-LOCAL-QUEUE?", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_cycpanel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-CYCPANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_cycpanel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-CYCPANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_cycpanel_p", "CYBLACK-BASIC-CYCPANEL-P", 1, 0, false);
        declareFunction("cyblack_basic_cycpanel_initialize_method", "CYBLACK-BASIC-CYCPANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycpanel_print_method", "CYBLACK-BASIC-CYCPANEL-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_cycpanel_get_use_local_queueP_method", "CYBLACK-BASIC-CYCPANEL-GET-USE-LOCAL-QUEUE?-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycpanel_set_use_local_queueP_method", "CYBLACK-BASIC-CYCPANEL-SET-USE-LOCAL-QUEUE?-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_cycpanel_get_default_mt_method", "CYBLACK-BASIC-CYCPANEL-GET-DEFAULT-MT-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycpanel_set_default_mt_method", "CYBLACK-BASIC-CYCPANEL-SET-DEFAULT-MT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_cycpanel_get_all_formulae_method", "CYBLACK-BASIC-CYCPANEL-GET-ALL-FORMULAE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycpanel_get_all_active_formulae_method", "CYBLACK-BASIC-CYCPANEL-GET-ALL-ACTIVE-FORMULAE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycpanel_deactivate_all_postings_method", "CYBLACK-BASIC-CYCPANEL-DEACTIVATE-ALL-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycpanel_remove_all_postings_method", "CYBLACK-BASIC-CYCPANEL-REMOVE-ALL-POSTINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_cycpanel_new_posting_method", "CYBLACK-BASIC-CYCPANEL-NEW-POSTING-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_forward_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-FORWARD-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_forward_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-FORWARD-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_forward_panel_p", "CYBLACK-BASIC-FORWARD-PANEL-P", 1, 0, false);
        declareFunction("get_cyblack_basic_backward_panel_query_action", "GET-CYBLACK-BASIC-BACKWARD-PANEL-QUERY-ACTION", 1, 0, false);
        declareFunction("set_cyblack_basic_backward_panel_query_action", "SET-CYBLACK-BASIC-BACKWARD-PANEL-QUERY-ACTION", 2, 0, false);
        declareFunction("get_cyblack_basic_backward_panel_most_recent_query", "GET-CYBLACK-BASIC-BACKWARD-PANEL-MOST-RECENT-QUERY", 1, 0, false);
        declareFunction("set_cyblack_basic_backward_panel_most_recent_query", "SET-CYBLACK-BASIC-BACKWARD-PANEL-MOST-RECENT-QUERY", 2, 0, false);
        declareFunction("get_cyblack_basic_backward_panel_cyc_depth", "GET-CYBLACK-BASIC-BACKWARD-PANEL-CYC-DEPTH", 1, 0, false);
        declareFunction("set_cyblack_basic_backward_panel_cyc_depth", "SET-CYBLACK-BASIC-BACKWARD-PANEL-CYC-DEPTH", 2, 0, false);
        declareFunction("get_cyblack_basic_backward_panel_cyc_time", "GET-CYBLACK-BASIC-BACKWARD-PANEL-CYC-TIME", 1, 0, false);
        declareFunction("set_cyblack_basic_backward_panel_cyc_time", "SET-CYBLACK-BASIC-BACKWARD-PANEL-CYC-TIME", 2, 0, false);
        declareFunction("get_cyblack_basic_backward_panel_cyc_number", "GET-CYBLACK-BASIC-BACKWARD-PANEL-CYC-NUMBER", 1, 0, false);
        declareFunction("set_cyblack_basic_backward_panel_cyc_number", "SET-CYBLACK-BASIC-BACKWARD-PANEL-CYC-NUMBER", 2, 0, false);
        declareFunction("get_cyblack_basic_backward_panel_cyc_backchain", "GET-CYBLACK-BASIC-BACKWARD-PANEL-CYC-BACKCHAIN", 1, 0, false);
        declareFunction("set_cyblack_basic_backward_panel_cyc_backchain", "SET-CYBLACK-BASIC-BACKWARD-PANEL-CYC-BACKCHAIN", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_backward_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BACKWARD-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_backward_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BACKWARD-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_p", "CYBLACK-BASIC-BACKWARD-PANEL-P", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_initialize_method", "CYBLACK-BASIC-BACKWARD-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_get_cyc_backchain_method", "CYBLACK-BASIC-BACKWARD-PANEL-GET-CYC-BACKCHAIN-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_set_cyc_backchain_method", "CYBLACK-BASIC-BACKWARD-PANEL-SET-CYC-BACKCHAIN-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_get_cyc_number_method", "CYBLACK-BASIC-BACKWARD-PANEL-GET-CYC-NUMBER-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_set_cyc_number_method", "CYBLACK-BASIC-BACKWARD-PANEL-SET-CYC-NUMBER-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_get_cyc_time_method", "CYBLACK-BASIC-BACKWARD-PANEL-GET-CYC-TIME-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_set_cyc_time_method", "CYBLACK-BASIC-BACKWARD-PANEL-SET-CYC-TIME-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_get_cyc_depth_method", "CYBLACK-BASIC-BACKWARD-PANEL-GET-CYC-DEPTH-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_set_cyc_depth_method", "CYBLACK-BASIC-BACKWARD-PANEL-SET-CYC-DEPTH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_get_most_recent_query_method", "CYBLACK-BASIC-BACKWARD-PANEL-GET-MOST-RECENT-QUERY-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_set_most_recent_query_method", "CYBLACK-BASIC-BACKWARD-PANEL-SET-MOST-RECENT-QUERY-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_get_query_action_method", "CYBLACK-BASIC-BACKWARD-PANEL-GET-QUERY-ACTION-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_set_query_action_method", "CYBLACK-BASIC-BACKWARD-PANEL-SET-QUERY-ACTION-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_add_posting_method", "CYBLACK-BASIC-BACKWARD-PANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_add_direct_posting_method", "CYBLACK-BASIC-BACKWARD-PANEL-ADD-DIRECT-POSTING-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_cycpanel_file() {
        defconstant("*VALID-CYBLACK-CYCPANEL-QUERY-ACTIONS*", $list_alt0);
        return NIL;
    }

    public static final SubLObject setup_cyblack_cycpanel_file() {
                enumerations.enumerations_incorporate_definition(CYBLACK_CYCPANEL_QUERY_ACTION, $list_alt0);
        interfaces.new_interface(CYBLACK_CYCPANEL, $list_alt9, $list_alt10, $list_alt11);
        interfaces.new_interface(CYBLACK_FORWARD_PANEL, $list_alt13, $list_alt14, NIL);
        interfaces.new_interface(CYBLACK_BACKWARD_PANEL, $list_alt13, $list_alt14, $list_alt16);
        classes.subloop_new_class(CYBLACK_BASIC_CYCPANEL, CYBLACK_BASIC_PANEL, $list_alt13, NIL, $list_alt19);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_CYCPANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_CYCPANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_CYCPANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_CYCPANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_CYCPANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_cycpanel_class(CYBLACK_BASIC_CYCPANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_CYCPANEL, $list_alt46, NIL, $list_alt47);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPANEL, INITIALIZE, CYBLACK_BASIC_CYCPANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_CYCPANEL, $list_alt52, $list_alt53, $list_alt54);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPANEL, PRINT, CYBLACK_BASIC_CYCPANEL_PRINT_METHOD);
        methods.methods_incorporate_instance_method($sym56$GET_USE_LOCAL_QUEUE_, CYBLACK_BASIC_CYCPANEL, $list_alt57, NIL, $list_alt58);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPANEL, $sym56$GET_USE_LOCAL_QUEUE_, $sym59$CYBLACK_BASIC_CYCPANEL_GET_USE_LOCAL_QUEUE__METHOD);
        methods.methods_incorporate_instance_method($sym60$SET_USE_LOCAL_QUEUE_, CYBLACK_BASIC_CYCPANEL, $list_alt52, $list_alt61, $list_alt62);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPANEL, $sym60$SET_USE_LOCAL_QUEUE_, $sym64$CYBLACK_BASIC_CYCPANEL_SET_USE_LOCAL_QUEUE__METHOD);
        methods.methods_incorporate_instance_method(GET_DEFAULT_MT, CYBLACK_BASIC_CYCPANEL, $list_alt57, NIL, $list_alt66);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPANEL, GET_DEFAULT_MT, CYBLACK_BASIC_CYCPANEL_GET_DEFAULT_MT_METHOD);
        methods.methods_incorporate_instance_method(SET_DEFAULT_MT, CYBLACK_BASIC_CYCPANEL, $list_alt52, $list_alt69, $list_alt70);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPANEL, SET_DEFAULT_MT, CYBLACK_BASIC_CYCPANEL_SET_DEFAULT_MT_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_FORMULAE, CYBLACK_BASIC_CYCPANEL, $list_alt52, NIL, $list_alt74);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPANEL, GET_ALL_FORMULAE, CYBLACK_BASIC_CYCPANEL_GET_ALL_FORMULAE_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_ACTIVE_FORMULAE, CYBLACK_BASIC_CYCPANEL, $list_alt52, NIL, $list_alt78);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPANEL, GET_ALL_ACTIVE_FORMULAE, CYBLACK_BASIC_CYCPANEL_GET_ALL_ACTIVE_FORMULAE_METHOD);
        methods.methods_incorporate_instance_method(DEACTIVATE_ALL_POSTINGS, CYBLACK_BASIC_CYCPANEL, $list_alt52, NIL, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPANEL, DEACTIVATE_ALL_POSTINGS, CYBLACK_BASIC_CYCPANEL_DEACTIVATE_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_POSTINGS, CYBLACK_BASIC_CYCPANEL, $list_alt52, NIL, $list_alt84);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPANEL, REMOVE_ALL_POSTINGS, CYBLACK_BASIC_CYCPANEL_REMOVE_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(NEW_POSTING, CYBLACK_BASIC_CYCPANEL, $list_alt52, NIL, $list_alt87);
        methods.subloop_register_instance_method(CYBLACK_BASIC_CYCPANEL, NEW_POSTING, CYBLACK_BASIC_CYCPANEL_NEW_POSTING_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_FORWARD_PANEL, CYBLACK_BASIC_CYCPANEL, $list_alt91, NIL, NIL);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_FORWARD_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_FORWARD_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_FORWARD_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_FORWARD_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_FORWARD_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_forward_panel_class(CYBLACK_BASIC_FORWARD_PANEL);
        classes.subloop_new_class(CYBLACK_BASIC_BACKWARD_PANEL, CYBLACK_BASIC_CYCPANEL, $list_alt95, NIL, $list_alt96);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_BACKWARD_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_BACKWARD_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BACKWARD_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_BACKWARD_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BACKWARD_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_backward_panel_class(CYBLACK_BASIC_BACKWARD_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt46, NIL, $list_alt108);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, INITIALIZE, CYBLACK_BASIC_BACKWARD_PANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_CYC_BACKCHAIN, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt57, NIL, $list_alt112);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, GET_CYC_BACKCHAIN, CYBLACK_BASIC_BACKWARD_PANEL_GET_CYC_BACKCHAIN_METHOD);
        methods.methods_incorporate_instance_method(SET_CYC_BACKCHAIN, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt52, $list_alt115, $list_alt116);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, SET_CYC_BACKCHAIN, CYBLACK_BASIC_BACKWARD_PANEL_SET_CYC_BACKCHAIN_METHOD);
        methods.methods_incorporate_instance_method(GET_CYC_NUMBER, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt57, NIL, $list_alt120);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, GET_CYC_NUMBER, CYBLACK_BASIC_BACKWARD_PANEL_GET_CYC_NUMBER_METHOD);
        methods.methods_incorporate_instance_method(SET_CYC_NUMBER, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt52, $list_alt123, $list_alt124);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, SET_CYC_NUMBER, CYBLACK_BASIC_BACKWARD_PANEL_SET_CYC_NUMBER_METHOD);
        methods.methods_incorporate_instance_method(GET_CYC_TIME, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt57, NIL, $list_alt128);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, GET_CYC_TIME, CYBLACK_BASIC_BACKWARD_PANEL_GET_CYC_TIME_METHOD);
        methods.methods_incorporate_instance_method(SET_CYC_TIME, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt52, $list_alt131, $list_alt132);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, SET_CYC_TIME, CYBLACK_BASIC_BACKWARD_PANEL_SET_CYC_TIME_METHOD);
        methods.methods_incorporate_instance_method(GET_CYC_DEPTH, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt57, NIL, $list_alt136);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, GET_CYC_DEPTH, CYBLACK_BASIC_BACKWARD_PANEL_GET_CYC_DEPTH_METHOD);
        methods.methods_incorporate_instance_method(SET_CYC_DEPTH, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt52, $list_alt139, $list_alt140);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, SET_CYC_DEPTH, CYBLACK_BASIC_BACKWARD_PANEL_SET_CYC_DEPTH_METHOD);
        methods.methods_incorporate_instance_method(GET_MOST_RECENT_QUERY, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt57, NIL, $list_alt144);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, GET_MOST_RECENT_QUERY, CYBLACK_BASIC_BACKWARD_PANEL_GET_MOST_RECENT_QUERY_METHOD);
        methods.methods_incorporate_instance_method(SET_MOST_RECENT_QUERY, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt52, $list_alt147, $list_alt148);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, SET_MOST_RECENT_QUERY, CYBLACK_BASIC_BACKWARD_PANEL_SET_MOST_RECENT_QUERY_METHOD);
        methods.methods_incorporate_instance_method(GET_QUERY_ACTION, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt57, NIL, $list_alt152);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, GET_QUERY_ACTION, CYBLACK_BASIC_BACKWARD_PANEL_GET_QUERY_ACTION_METHOD);
        methods.methods_incorporate_instance_method(SET_QUERY_ACTION, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt52, $list_alt155, $list_alt156);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, SET_QUERY_ACTION, CYBLACK_BASIC_BACKWARD_PANEL_SET_QUERY_ACTION_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt52, $list_alt160, $list_alt161);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, ADD_POSTING, CYBLACK_BASIC_BACKWARD_PANEL_ADD_POSTING_METHOD);
        methods.methods_incorporate_instance_method(ADD_DIRECT_POSTING, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt52, $list_alt160, $list_alt168);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL, ADD_DIRECT_POSTING, CYBLACK_BASIC_BACKWARD_PANEL_ADD_DIRECT_POSTING_METHOD);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list($NONE, makeKeyword("DEACTIVATE"), makeKeyword("REMOVE"));

    private static final SubLSymbol CYBLACK_CYCPANEL_QUERY_ACTION = makeSymbol("CYBLACK-CYCPANEL-QUERY-ACTION");

    static private final SubLString $str_alt2$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_CYCPANEL_QUERY_ACTION = makeSymbol("ENCODE-CYBLACK-CYCPANEL-QUERY-ACTION");

    static private final SubLString $str_alt4$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_CYCPANEL_QUERY_ACTION = makeSymbol("DECODE-CYBLACK-CYCPANEL-QUERY-ACTION");

    static private final SubLString $str_alt6$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_CYCPANEL_QUERY_ACTION_P = makeSymbol("CYBLACK-CYCPANEL-QUERY-ACTION-P");

    private static final SubLSymbol CYBLACK_CYCPANEL = makeSymbol("CYBLACK-CYCPANEL");

    static private final SubLList $list_alt9 = list(makeSymbol("CYBLACK-PANEL"));

    static private final SubLList $list_alt10 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-PANEL")));

    static private final SubLList $list_alt11 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-USE-LOCAL-QUEUE?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-USE-LOCAL-QUEUE?"), list(makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-MT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-MT"), list(makeSymbol("NEW-MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-FORMULAE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-ACTIVE-FORMULAE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEACTIVATE-ALL-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-POSTING"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol CYBLACK_FORWARD_PANEL = makeSymbol("CYBLACK-FORWARD-PANEL");

    static private final SubLList $list_alt13 = list(makeSymbol("CYBLACK-CYCPANEL"));

    static private final SubLList $list_alt14 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-CYCPANEL")));

    private static final SubLSymbol CYBLACK_BACKWARD_PANEL = makeSymbol("CYBLACK-BACKWARD-PANEL");

    static private final SubLList $list_alt16 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYC-BACKCHAIN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CYC-BACKCHAIN"), list(makeSymbol("NEW-BACKCHAIN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYC-NUMBER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CYC-NUMBER"), list(makeSymbol("NEW-NUMBER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYC-TIME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CYC-TIME"), list(makeSymbol("NEW-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYC-DEPTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CYC-DEPTH"), list(makeSymbol("NEW-DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MOST-RECENT-QUERY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MOST-RECENT-QUERY"), list(makeSymbol("QUERY-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUERY-ACTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-QUERY-ACTION"), list(makeSymbol("NEW-QUERY-ACTION")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL = makeSymbol("CYBLACK-BASIC-CYCPANEL");



    static private final SubLList $list_alt19 = list(new SubLObject[]{ list(makeSymbol("USE-LOCAL-QUEUE?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEFAULT-MT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-USE-LOCAL-QUEUE?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-USE-LOCAL-QUEUE?"), list(makeSymbol("NEW-VALUE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-MT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT-MT"), list(makeSymbol("NEW-MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-FORMULAE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-ACTIVE-FORMULAE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEACTIVATE-ALL-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-ALL-POSTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-POSTING"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol DEFAULT_MT = makeSymbol("DEFAULT-MT");

    static private final SubLSymbol $sym21$USE_LOCAL_QUEUE_ = makeSymbol("USE-LOCAL-QUEUE?");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_CYCPANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-CYCPANEL-CLASS");







































    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_CYCPANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-CYCPANEL-INSTANCE");



    static private final SubLList $list_alt46 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt47 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT-MT"), constant_handles.reader_make_constant_shell(makeString("BaseKB"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym48$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPANEL-METHOD");

    public static final SubLObject $$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-CYCPANEL-INITIALIZE-METHOD");



    static private final SubLList $list_alt52 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt53 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt54 = list(list(makeSymbol("PRINT"), makeSymbol("SUPER"), makeSymbol("STREAM"), makeSymbol("DEPTH")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-CYCPANEL-PRINT-METHOD");

    static private final SubLSymbol $sym56$GET_USE_LOCAL_QUEUE_ = makeSymbol("GET-USE-LOCAL-QUEUE?");

    static private final SubLList $list_alt57 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt58 = list(list(RET, makeSymbol("USE-LOCAL-QUEUE?")));

    static private final SubLSymbol $sym59$CYBLACK_BASIC_CYCPANEL_GET_USE_LOCAL_QUEUE__METHOD = makeSymbol("CYBLACK-BASIC-CYCPANEL-GET-USE-LOCAL-QUEUE?-METHOD");

    static private final SubLSymbol $sym60$SET_USE_LOCAL_QUEUE_ = makeSymbol("SET-USE-LOCAL-QUEUE?");

    static private final SubLList $list_alt61 = list(makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt62 = list(list(makeSymbol("CSETQ"), makeSymbol("USE-LOCAL-QUEUE?"), list(makeSymbol("FIF"), makeSymbol("NEW-VALUE"), T, NIL)), list(RET, makeSymbol("USE-LOCAL-QUEUE?")));

    static private final SubLSymbol $sym63$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPANEL-METHOD");

    static private final SubLSymbol $sym64$CYBLACK_BASIC_CYCPANEL_SET_USE_LOCAL_QUEUE__METHOD = makeSymbol("CYBLACK-BASIC-CYCPANEL-SET-USE-LOCAL-QUEUE?-METHOD");

    private static final SubLSymbol GET_DEFAULT_MT = makeSymbol("GET-DEFAULT-MT");

    static private final SubLList $list_alt66 = list(list(RET, makeSymbol("DEFAULT-MT")));

    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL_GET_DEFAULT_MT_METHOD = makeSymbol("CYBLACK-BASIC-CYCPANEL-GET-DEFAULT-MT-METHOD");

    private static final SubLSymbol SET_DEFAULT_MT = makeSymbol("SET-DEFAULT-MT");

    static private final SubLList $list_alt69 = list(makeSymbol("NEW-MT"));

    static private final SubLList $list_alt70 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-MT")), list(makeSymbol("FORT-P"), makeSymbol("NEW-MT"))), makeString("(SET-DEFAULT-MT ~S): ~S is not a valid MT.  A FORT was expected."), makeSymbol("SELF"), makeSymbol("NEW-MT")), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT-MT"), makeSymbol("NEW-MT")), list(RET, makeSymbol("NEW-MT")));

    static private final SubLSymbol $sym71$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL_SET_DEFAULT_MT_METHOD = makeSymbol("CYBLACK-BASIC-CYCPANEL-SET-DEFAULT-MT-METHOD");

    private static final SubLSymbol GET_ALL_FORMULAE = makeSymbol("GET-ALL-FORMULAE");

    static private final SubLList $list_alt74 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-POSTINGS"), list(makeSymbol("GET-ALL-POSTINGS"), makeSymbol("SELF"))), list(makeSymbol("ALL-FORMULAE"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("POSTING"), makeSymbol("ALL-POSTINGS"), makeSymbol("ALL-FORMULAE")), list(makeSymbol("FIF"), list(makeSymbol("CYBLACK-CYCPOSTING-P"), makeSymbol("POSTING")), list(makeSymbol("LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("GET-FORMULA")))), NIL)), list(RET, makeSymbol("ALL-FORMULAE"))));



    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL_GET_ALL_FORMULAE_METHOD = makeSymbol("CYBLACK-BASIC-CYCPANEL-GET-ALL-FORMULAE-METHOD");

    private static final SubLSymbol GET_ALL_ACTIVE_FORMULAE = makeSymbol("GET-ALL-ACTIVE-FORMULAE");

    static private final SubLList $list_alt78 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-POSTINGS"), list(makeSymbol("GET-ALL-ACTIVE-POSTINGS"), makeSymbol("SELF"))), list(makeSymbol("ALL-FORMULAE"), NIL)), list(makeSymbol("CDOLIST-APPENDING"), list(makeSymbol("POSTING"), makeSymbol("ALL-POSTINGS"), makeSymbol("ALL-FORMULAE")), list(makeSymbol("FIF"), list(makeSymbol("CYBLACK-CYCPOSTING-P"), makeSymbol("POSTING")), list(makeSymbol("LIST"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("GET-FORMULA")))), NIL)), list(RET, makeSymbol("ALL-FORMULAE"))));

    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL_GET_ALL_ACTIVE_FORMULAE_METHOD = makeSymbol("CYBLACK-BASIC-CYCPANEL-GET-ALL-ACTIVE-FORMULAE-METHOD");

    private static final SubLSymbol DEACTIVATE_ALL_POSTINGS = makeSymbol("DEACTIVATE-ALL-POSTINGS");

    static private final SubLList $list_alt81 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-ACTIVE-POSTINGS"), list(makeSymbol("GET-ALL-ACTIVE-POSTINGS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("POSTING"), makeSymbol("ALL-ACTIVE-POSTINGS")), list(makeSymbol("CYBLACK-POSTING-SET-ACTIVE"), makeSymbol("POSTING"), NIL)), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL_DEACTIVATE_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-CYCPANEL-DEACTIVATE-ALL-POSTINGS-METHOD");

    private static final SubLSymbol REMOVE_ALL_POSTINGS = makeSymbol("REMOVE-ALL-POSTINGS");

    static private final SubLList $list_alt84 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ALL-POSTINGS"), list(makeSymbol("GET-ALL-POSTINGS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("POSTING"), makeSymbol("ALL-POSTINGS")), list(makeSymbol("REMOVE-POSTING"), makeSymbol("SELF"), makeSymbol("POSTING"))), list(RET, NIL)));

    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL_REMOVE_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-BASIC-CYCPANEL-REMOVE-ALL-POSTINGS-METHOD");



    static private final SubLList $list_alt87 = list(list(makeSymbol("PWHEN"), makeSymbol("DATATYPE"), list(RET, list(makeSymbol("CYBLACK-DATATYPE-CREATE-POSTING"), makeSymbol("DATATYPE")))), list(RET, NIL));

    static private final SubLSymbol $sym88$OUTER_CATCH_FOR_CYBLACK_BASIC_CYCPANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-CYCPANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL_NEW_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-CYCPANEL-NEW-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_FORWARD_PANEL = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL");

    static private final SubLList $list_alt91 = list(makeSymbol("CYBLACK-FORWARD-PANEL"));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_FORWARD_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-FORWARD-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_FORWARD_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-FORWARD-PANEL-INSTANCE");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL");

    static private final SubLList $list_alt95 = list(makeSymbol("CYBLACK-BACKWARD-PANEL"));

    static private final SubLList $list_alt96 = list(new SubLObject[]{ list(makeSymbol("CYC-BACKCHAIN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CYC-NUMBER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CYC-TIME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CYC-DEPTH"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MOST-RECENT-QUERY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("QUERY-ACTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYC-BACKCHAIN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CYC-BACKCHAIN"), list(makeSymbol("NEW-BACKCHAIN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYC-NUMBER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CYC-NUMBER"), list(makeSymbol("NEW-NUMBER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYC-TIME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CYC-TIME"), list(makeSymbol("NEW-TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYC-DEPTH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CYC-DEPTH"), list(makeSymbol("NEW-DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MOST-RECENT-QUERY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MOST-RECENT-QUERY"), list(makeSymbol("QUERY-POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUERY-ACTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-QUERY-ACTION"), list(makeSymbol("NEW-QUERY-ACTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DIRECT-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")) });

    public static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLSymbol QUERY_ACTION = makeSymbol("QUERY-ACTION");

    public static final SubLInteger $int$22 = makeInteger(22);

    private static final SubLSymbol MOST_RECENT_QUERY = makeSymbol("MOST-RECENT-QUERY");

    public static final SubLInteger $int$21 = makeInteger(21);

    private static final SubLSymbol CYC_DEPTH = makeSymbol("CYC-DEPTH");

    private static final SubLSymbol CYC_TIME = makeSymbol("CYC-TIME");

    private static final SubLSymbol CYC_NUMBER = makeSymbol("CYC-NUMBER");

    private static final SubLSymbol CYC_BACKCHAIN = makeSymbol("CYC-BACKCHAIN");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BACKWARD_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BACKWARD-PANEL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BACKWARD_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BACKWARD-PANEL-INSTANCE");

    static private final SubLList $list_alt108 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CYC-BACKCHAIN"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CYC-NUMBER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CYC-TIME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CYC-DEPTH"), NIL), list(makeSymbol("CSETQ"), makeSymbol("MOST-RECENT-QUERY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym109$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BACKWARD-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol GET_CYC_BACKCHAIN = makeSymbol("GET-CYC-BACKCHAIN");

    static private final SubLList $list_alt112 = list(list(RET, makeSymbol("CYC-BACKCHAIN")));

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_GET_CYC_BACKCHAIN_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-GET-CYC-BACKCHAIN-METHOD");

    private static final SubLSymbol SET_CYC_BACKCHAIN = makeSymbol("SET-CYC-BACKCHAIN");

    static private final SubLList $list_alt115 = list(makeSymbol("NEW-BACKCHAIN"));

    static private final SubLList $list_alt116 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-BACKCHAIN")), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-BACKCHAIN")), list(makeSymbol(">="), makeSymbol("NEW-BACKCHAIN"), ZERO_INTEGER))), makeString("(SET-CYC-BACKCHAIN ~S): ~S is not a valid backchain option.  NIL or a non negative integer were expected."), makeSymbol("SELF"), makeSymbol("NEW-BACKCHAIN")), list(makeSymbol("CSETQ"), makeSymbol("CYC-BACKCHAIN"), makeSymbol("NEW-BACKCHAIN")), list(RET, makeSymbol("NEW-BACKCHAIN")));

    static private final SubLSymbol $sym117$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BACKWARD-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_SET_CYC_BACKCHAIN_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-SET-CYC-BACKCHAIN-METHOD");

    private static final SubLSymbol GET_CYC_NUMBER = makeSymbol("GET-CYC-NUMBER");

    static private final SubLList $list_alt120 = list(list(RET, makeSymbol("CYC-NUMBER")));

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_GET_CYC_NUMBER_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-GET-CYC-NUMBER-METHOD");

    private static final SubLSymbol SET_CYC_NUMBER = makeSymbol("SET-CYC-NUMBER");

    static private final SubLList $list_alt123 = list(makeSymbol("NEW-NUMBER"));

    static private final SubLList $list_alt124 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-NUMBER")), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-NUMBER")), list(makeSymbol(">="), makeSymbol("NEW-NUMBER"), ZERO_INTEGER))), makeString("(SET-CYC-NUMBER ~S): ~S is not a valid number option.  NIL or a non negative integer were expected."), makeSymbol("SELF"), makeSymbol("NEW-BACKCHAIN")), list(makeSymbol("CSETQ"), makeSymbol("CYC-NUMBER"), makeSymbol("NEW-NUMBER")), list(RET, makeSymbol("NEW-NUMBER")));

    static private final SubLSymbol $sym125$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BACKWARD-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_SET_CYC_NUMBER_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-SET-CYC-NUMBER-METHOD");

    private static final SubLSymbol GET_CYC_TIME = makeSymbol("GET-CYC-TIME");

    static private final SubLList $list_alt128 = list(list(RET, makeSymbol("CYC-TIME")));

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_GET_CYC_TIME_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-GET-CYC-TIME-METHOD");

    private static final SubLSymbol SET_CYC_TIME = makeSymbol("SET-CYC-TIME");

    static private final SubLList $list_alt131 = list(makeSymbol("NEW-TIME"));

    static private final SubLList $list_alt132 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-TIME")), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-TIME")), list(makeSymbol(">="), makeSymbol("NEW-TIME"), ZERO_INTEGER))), makeString("(SET-CYC-TIME ~S): ~S is not a valid time option.  NIL or a non negative integer were expected."), makeSymbol("SELF"), makeSymbol("NEW-TIME")), list(makeSymbol("CSETQ"), makeSymbol("CYC-TIME"), makeSymbol("NEW-TIME")), list(RET, makeSymbol("NEW-TIME")));

    static private final SubLSymbol $sym133$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BACKWARD-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_SET_CYC_TIME_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-SET-CYC-TIME-METHOD");

    private static final SubLSymbol GET_CYC_DEPTH = makeSymbol("GET-CYC-DEPTH");

    static private final SubLList $list_alt136 = list(list(RET, makeSymbol("CYC-DEPTH")));

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_GET_CYC_DEPTH_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-GET-CYC-DEPTH-METHOD");

    private static final SubLSymbol SET_CYC_DEPTH = makeSymbol("SET-CYC-DEPTH");

    static private final SubLList $list_alt139 = list(makeSymbol("NEW-DEPTH"));

    static private final SubLList $list_alt140 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-DEPTH")), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-DEPTH")), list(makeSymbol(">="), makeSymbol("NEW-DEPTH"), ZERO_INTEGER))), makeString("(SET-CYC-DEPTH ~S): ~S is not a valid depth option.  NIL or a non negative integer were expected."), makeSymbol("SELF"), makeSymbol("NEW-DEPTH")), list(makeSymbol("CSETQ"), makeSymbol("CYC-DEPTH"), makeSymbol("NEW-DEPTH")), list(RET, makeSymbol("NEW-DEPTH")));

    static private final SubLSymbol $sym141$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BACKWARD-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_SET_CYC_DEPTH_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-SET-CYC-DEPTH-METHOD");

    private static final SubLSymbol GET_MOST_RECENT_QUERY = makeSymbol("GET-MOST-RECENT-QUERY");

    static private final SubLList $list_alt144 = list(list(RET, makeSymbol("MOST-RECENT-QUERY")));

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_GET_MOST_RECENT_QUERY_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-GET-MOST-RECENT-QUERY-METHOD");

    private static final SubLSymbol SET_MOST_RECENT_QUERY = makeSymbol("SET-MOST-RECENT-QUERY");

    static private final SubLList $list_alt147 = list(makeSymbol("QUERY-POSTING"));

    static private final SubLList $list_alt148 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("QUERY-POSTING")), list(makeSymbol("CYBLACK-QUERY-POSTING-P"), makeSymbol("QUERY-POSTING"))), makeString("(SET-MOST-RECENT-QUERY ~S): ~S is either not an instance of CYBLACK-CYCPOSTING or ~\n    is an instance of CYBLACK-CYCPOSTING but not a query."), makeSymbol("SELF"), makeSymbol("QUERY-POSTING")), list(makeSymbol("CSETQ"), makeSymbol("MOST-RECENT-QUERY"), makeSymbol("QUERY-POSTING")), list(RET, makeSymbol("QUERY-POSTING")));

    static private final SubLSymbol $sym149$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BACKWARD-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_SET_MOST_RECENT_QUERY_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-SET-MOST-RECENT-QUERY-METHOD");

    private static final SubLSymbol GET_QUERY_ACTION = makeSymbol("GET-QUERY-ACTION");

    static private final SubLList $list_alt152 = list(list(RET, makeSymbol("QUERY-ACTION")));

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_GET_QUERY_ACTION_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-GET-QUERY-ACTION-METHOD");

    private static final SubLSymbol SET_QUERY_ACTION = makeSymbol("SET-QUERY-ACTION");

    static private final SubLList $list_alt155 = list(makeSymbol("NEW-QUERY-ACTION"));

    static private final SubLList $list_alt156 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-CYCPANEL-QUERY-ACTION-P"), makeSymbol("NEW-QUERY-ACTION")), makeString("(SET-QUERY-ACTION ~S): ~S is not a member of the CYBLACK-CYCPANEL-QUERY-ACTION enumeration."), makeSymbol("SELF"), makeSymbol("NEW-QUERY-ACTION")), list(makeSymbol("CSETQ"), makeSymbol("QUERY-ACTION"), makeSymbol("NEW-QUERY-ACTION")), list(RET, makeSymbol("NEW-QUERY-ACTION")));

    static private final SubLSymbol $sym157$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BACKWARD-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_SET_QUERY_ACTION_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-SET-QUERY-ACTION-METHOD");



    static private final SubLList $list_alt160 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt161 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-QUERY-POSTING-P"), makeSymbol("POSTING")), list(makeSymbol("SET-MOST-RECENT-QUERY"), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PCASE"), makeSymbol("QUERY-ACTION"), list(makeKeyword("DEACTIVATE"), list(makeSymbol("DEACTIVATE-ALL-POSTINGS"), makeSymbol("SELF"))), list(makeKeyword("REMOVE"), list(makeSymbol("REMOVE-ALL-POSTINGS"), makeSymbol("SELF")))), list(makeSymbol("ADD-POSTING"), makeSymbol("SUPER"), makeSymbol("POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("PERFORM-QUERY"))), list(RET, makeSymbol("POSTING"))), list(RET, list(makeSymbol("ADD-POSTING"), makeSymbol("SUPER"), makeSymbol("POSTING"))));

    static private final SubLSymbol $sym162$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BACKWARD-PANEL-METHOD");

    private static final SubLSymbol $DEACTIVATE = makeKeyword("DEACTIVATE");



    private static final SubLSymbol PERFORM_QUERY = makeSymbol("PERFORM-QUERY");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_ADD_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-ADD-POSTING-METHOD");



    static private final SubLList $list_alt168 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-DIRECT-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-QUERY-POSTING-P"), makeSymbol("POSTING")), list(makeSymbol("SET-MOST-RECENT-QUERY"), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PCASE"), makeSymbol("QUERY-ACTION"), list(makeKeyword("DEACTIVATE"), list(makeSymbol("DEACTIVATE-ALL-POSTINGS"), makeSymbol("SELF"))), list(makeKeyword("REMOVE"), list(makeSymbol("REMOVE-ALL-POSTINGS"), makeSymbol("SELF")))), list(makeSymbol("ADD-DIRECT-POSTING"), makeSymbol("SUPER"), makeSymbol("POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("PERFORM-QUERY"))), list(RET, makeSymbol("POSTING"))), list(RET, list(makeSymbol("ADD-POSTING"), makeSymbol("SUPER"), makeSymbol("POSTING"))));

    static private final SubLSymbol $sym169$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BACKWARD-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_ADD_DIRECT_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-ADD-DIRECT-POSTING-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_cycpanel_file();
    }

    public void initializeVariables() {
        init_cyblack_cycpanel_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_cycpanel_file();
    }
}

