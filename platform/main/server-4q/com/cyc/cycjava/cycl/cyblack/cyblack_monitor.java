/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-MONITOR
 *  source file: /cyc/top/cycl/cyblack/cyblack-monitor.lisp
 *  created:     2019/07/03 17:38:48
 */
public final class cyblack_monitor extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_monitor() {
    }

    public static final SubLFile me = new cyblack_monitor();


    // // Definitions
    public static final SubLObject cyblack_monitor_p(SubLObject v_cyblack_monitor) {
        return interfaces.subloop_instanceof_interface(v_cyblack_monitor, CYBLACK_MONITOR);
    }

    public static final SubLObject get_cyblack_basic_monitor_name(SubLObject cyblack_basic_monitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_monitor, SIX_INTEGER, NAME);
    }

    public static final SubLObject set_cyblack_basic_monitor_name(SubLObject cyblack_basic_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_monitor, value, SIX_INTEGER, NAME);
    }

    public static final SubLObject get_cyblack_basic_monitor_panel_list(SubLObject cyblack_basic_monitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_monitor, FIVE_INTEGER, PANEL_LIST);
    }

    public static final SubLObject set_cyblack_basic_monitor_panel_list(SubLObject cyblack_basic_monitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_monitor, value, FIVE_INTEGER, PANEL_LIST);
    }

    public static final SubLObject get_cyblack_basic_monitor_active(SubLObject cyblack_basic_monitor) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_monitor);
            SubLObject slot = slots.slot_assoc(ACTIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_monitor, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_basic_monitor));
    }

    public static final SubLObject set_cyblack_basic_monitor_active(SubLObject cyblack_basic_monitor, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_basic_monitor);
            SubLObject slot = slots.slot_assoc(ACTIVE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_basic_monitor, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_basic_monitor, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_basic_monitor)));
        return value;
    }

    public static final SubLObject cyblack_basic_monitor_report_posting_method(SubLObject self, SubLObject panel, SubLObject posting) {
        return posting;
    }

    public static final SubLObject cyblack_basic_monitor_post_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_monitor_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject template_posting_class = subloop_structures.class_name(subloop_structures.instance_class(posting));
                        SubLObject template_panel_datatype = NIL;
                        SubLObject template_panel_datatype_posting_class = NIL;
                        SubLObject cdolist_list_var = cyblack_basic_monitor_get_panels_method(self);
                        SubLObject template_panel = NIL;
                        for (template_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_panel = cdolist_list_var.first()) {
                            template_panel_datatype = cyblack_panel_dispatch_functions.cyblack_panel_get_datatype(template_panel);
                            if (NIL != template_panel_datatype) {
                                template_panel_datatype_posting_class = cyblack_datatype.cyblack_datatype_get_posting_type(template_panel_datatype);
                                if (template_panel_datatype_posting_class == template_posting_class) {
                                    cyblack_posting_dispatch_functions.cyblack_posting_set_application(posting, application);
                                    cyblack_posting_dispatch_functions.cyblack_posting_set_active(posting, T);
                                    methods.funcall_instance_method_with_1_args(template_panel, ADD_POSTING, posting);
                                    sublisp_throw($sym42$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD, posting);
                                }
                            }
                        }
                        sublisp_throw($sym42$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD, posting);
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
                catch_var_for_cyblack_basic_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym42$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_monitor_method;
        }
    }

    public static final SubLObject cyblack_basic_monitor_on_set_active_method(SubLObject self, SubLObject old_active_status, SubLObject new_active_status) {
        return new_active_status;
    }

    public static final SubLObject cyblack_basic_monitor_on_detach_method(SubLObject self, SubLObject old_panel) {
        cyblack_basic_monitor_set_active_method(self, NIL);
        return old_panel;
    }

    public static final SubLObject cyblack_basic_monitor_detach_method(SubLObject self, SubLObject old_panel) {
        {
            SubLObject template_panels = cyblack_basic_monitor_get_panels_method(self);
            if (NIL != subl_promotions.memberP(old_panel, template_panels, UNPROVIDED, UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args(self, ON_DETACH, old_panel);
                template_panels = delete(old_panel, template_panels, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cyblack_basic_monitor_set_panels_method(self, template_panels);
                methods.funcall_instance_method_with_1_args(old_panel, REMOVE_MONITOR, self);
                return old_panel;
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_monitor_on_attach_method(SubLObject self, SubLObject new_panel) {
        cyblack_basic_monitor_set_active_method(self, T);
        return new_panel;
    }

    public static final SubLObject cyblack_basic_monitor_attach_method(SubLObject self, SubLObject new_panel) {
        {
            SubLObject template_panels = cyblack_basic_monitor_get_panels_method(self);
            if (NIL == subl_promotions.memberP(new_panel, template_panels, UNPROVIDED, UNPROVIDED)) {
                template_panels = cons(new_panel, template_panels);
                cyblack_basic_monitor_set_panels_method(self, template_panels);
                methods.funcall_instance_method_with_1_args(new_panel, ADD_MONITOR, self);
                methods.funcall_instance_method_with_1_args(self, ON_ATTACH, new_panel);
                return new_panel;
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_basic_monitor_install_method(SubLObject self, SubLObject new_application, SubLObject monitored_type_strings) {
        cyblack_object.set_cyblack_object_application(self, new_application);
        {
            SubLObject template_panel = NIL;
            SubLObject cdolist_list_var = monitored_type_strings;
            SubLObject template_type_string = NIL;
            for (template_type_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_type_string = cdolist_list_var.first()) {
                template_panel = methods.funcall_instance_method_with_1_args(new_application, FIND_PANEL, template_type_string);
                if (NIL != template_panel) {
                    methods.funcall_instance_method_with_1_args(self, ATTACH, template_panel);
                }
            }
        }
        return self;
    }

    public static final SubLObject cyblack_basic_monitor_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt54$__CYBLACK_MONITOR___S_, cyblack_basic_monitor_get_monitor_name_method(self));
        return self;
    }

    public static final SubLObject cyblack_basic_monitor_initialize_qua_cyblack_monitor_method(SubLObject self) {
        cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
        cyblack_basic_monitor_set_panels_method(self, NIL);
        cyblack_basic_monitor_set_monitor_name_method(self, NIL);
        cyblack_basic_monitor_set_active_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_monitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_monitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_MONITOR, ACTIVE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_MONITOR, PANEL_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_MONITOR, NAME, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_monitor_p(SubLObject cyblack_basic_monitor) {
        return classes.subloop_instanceof_class(cyblack_basic_monitor, CYBLACK_BASIC_MONITOR);
    }

    public static final SubLObject cyblack_basic_monitor_initialize_method(SubLObject self) {
        cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
        cyblack_basic_monitor_initialize_qua_cyblack_monitor_method(self);
        return self;
    }

    public static final SubLObject cyblack_basic_monitor_get_panels_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_monitor_method = NIL;
            SubLObject panel_list = get_cyblack_basic_monitor_panel_list(self);
            try {
                try {
                    sublisp_throw($sym73$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD, panel_list);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_monitor_panel_list(self, panel_list);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_monitor_method;
        }
    }

    public static final SubLObject cyblack_basic_monitor_set_panels_method(SubLObject self, SubLObject new_panel_list) {
        {
            SubLObject catch_var_for_cyblack_basic_monitor_method = NIL;
            SubLObject panel_list = get_cyblack_basic_monitor_panel_list(self);
            try {
                try {
                    panel_list = new_panel_list;
                    sublisp_throw($sym78$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD, new_panel_list);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_monitor_panel_list(self, panel_list);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym78$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_monitor_method;
        }
    }

    public static final SubLObject cyblack_basic_monitor_get_monitor_name_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_monitor_method = NIL;
            SubLObject name = get_cyblack_basic_monitor_name(self);
            try {
                try {
                    sublisp_throw($sym82$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD, name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_monitor_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_monitor_method;
        }
    }

    public static final SubLObject cyblack_basic_monitor_set_monitor_name_method(SubLObject self, SubLObject new_name) {
        {
            SubLObject catch_var_for_cyblack_basic_monitor_method = NIL;
            SubLObject name = get_cyblack_basic_monitor_name(self);
            try {
                try {
                    name = new_name;
                    sublisp_throw($sym87$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD, new_name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_monitor_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_monitor_method;
        }
    }

    public static final SubLObject cyblack_basic_monitor_is_active_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_monitor_method = NIL;
            SubLObject active = get_cyblack_basic_monitor_active(self);
            try {
                try {
                    sublisp_throw($sym91$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD, active);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_monitor_active(self, active);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym91$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_monitor_method;
        }
    }

    public static final SubLObject cyblack_basic_monitor_set_active_method(SubLObject self, SubLObject new_active_status) {
        {
            SubLObject catch_var_for_cyblack_basic_monitor_method = NIL;
            SubLObject active = get_cyblack_basic_monitor_active(self);
            try {
                try {
                    methods.funcall_instance_method_with_2_args(self, ON_SET_ACTIVE, active, new_active_status);
                    active = new_active_status;
                    sublisp_throw($sym96$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD, new_active_status);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_monitor_active(self, active);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym96$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_monitor_method;
        }
    }

    public static final SubLObject cyblack_monitor_visitor_p(SubLObject cyblack_monitor_visitor) {
        return interfaces.subloop_instanceof_interface(cyblack_monitor_visitor, CYBLACK_MONITOR_VISITOR);
    }

    public static final SubLObject get_cyblack_basic_monitor_visitor_continue(SubLObject cyblack_basic_monitor_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_monitor_visitor, THREE_INTEGER, CONTINUE);
    }

    public static final SubLObject set_cyblack_basic_monitor_visitor_continue(SubLObject cyblack_basic_monitor_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_monitor_visitor, value, THREE_INTEGER, CONTINUE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_monitor_visitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_monitor_visitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_MONITOR_VISITOR, CONTINUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_monitor_visitor_p(SubLObject cyblack_basic_monitor_visitor) {
        return classes.subloop_instanceof_class(cyblack_basic_monitor_visitor, CYBLACK_BASIC_MONITOR_VISITOR);
    }

    public static final SubLObject cyblack_basic_monitor_visitor_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_monitor_visitor_method = NIL;
            SubLObject v_continue = get_cyblack_basic_monitor_visitor_continue(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    v_continue = T;
                    sublisp_throw($sym109$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_VISITOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_monitor_visitor_continue(self, v_continue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_monitor_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym109$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_monitor_visitor_method;
        }
    }

    public static final SubLObject cyblack_basic_monitor_visitor_set_initial_state_method(SubLObject self, SubLObject new_application, SubLObject new_state) {
        if (new_state == UNPROVIDED) {
            new_state = NIL;
        }
        cyblack_object.cyblack_object_set_application_method(self, new_application);
        return self;
    }

    public static final SubLObject cyblack_basic_monitor_visitor_visit_method(SubLObject self, SubLObject v_cyblack_monitor) {
        return v_cyblack_monitor;
    }

    public static final SubLObject cyblack_basic_monitor_visitor_continue_p_method(SubLObject self, SubLObject v_cyblack_monitor) {
        if (v_cyblack_monitor == UNPROVIDED) {
            v_cyblack_monitor = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_basic_monitor_visitor_method = NIL;
            SubLObject v_continue = get_cyblack_basic_monitor_visitor_continue(self);
            try {
                try {
                    sublisp_throw($sym121$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_VISITOR_METHOD, v_continue);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_monitor_visitor_continue(self, v_continue);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_monitor_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym121$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_basic_monitor_visitor_method;
        }
    }

    public static final SubLObject cyblack_basic_monitor_visitor_get_final_state_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject get_cyblack_report_posting_monitor_visitor_target_panel(SubLObject cyblack_report_posting_monitor_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_report_posting_monitor_visitor, FIVE_INTEGER, TARGET_PANEL);
    }

    public static final SubLObject set_cyblack_report_posting_monitor_visitor_target_panel(SubLObject cyblack_report_posting_monitor_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_report_posting_monitor_visitor, value, FIVE_INTEGER, TARGET_PANEL);
    }

    public static final SubLObject get_cyblack_report_posting_monitor_visitor_target_posting(SubLObject cyblack_report_posting_monitor_visitor) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_report_posting_monitor_visitor, FOUR_INTEGER, TARGET_POSTING);
    }

    public static final SubLObject set_cyblack_report_posting_monitor_visitor_target_posting(SubLObject cyblack_report_posting_monitor_visitor, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_report_posting_monitor_visitor, value, FOUR_INTEGER, TARGET_POSTING);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_report_posting_monitor_visitor_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_report_posting_monitor_visitor_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_MONITOR_VISITOR, CONTINUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_REPORT_POSTING_MONITOR_VISITOR, TARGET_POSTING, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_REPORT_POSTING_MONITOR_VISITOR, TARGET_PANEL, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_report_posting_monitor_visitor_p(SubLObject cyblack_report_posting_monitor_visitor) {
        return classes.subloop_instanceof_class(cyblack_report_posting_monitor_visitor, CYBLACK_REPORT_POSTING_MONITOR_VISITOR);
    }

    public static final SubLObject cyblack_report_posting_monitor_visitor_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_report_posting_monitor_visitor_method = NIL;
            SubLObject target_panel = get_cyblack_report_posting_monitor_visitor_target_panel(self);
            SubLObject target_posting = get_cyblack_report_posting_monitor_visitor_target_posting(self);
            try {
                try {
                    cyblack_basic_monitor_visitor_initialize_method(self);
                    target_posting = NIL;
                    target_panel = NIL;
                    sublisp_throw($sym133$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_report_posting_monitor_visitor_target_panel(self, target_panel);
                            set_cyblack_report_posting_monitor_visitor_target_posting(self, target_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_report_posting_monitor_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym133$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_report_posting_monitor_visitor_method;
        }
    }

    public static final SubLObject cyblack_report_posting_monitor_visitor_set_initial_state_method(SubLObject self, SubLObject new_application, SubLObject new_panel, SubLObject new_posting) {
        if (new_panel == UNPROVIDED) {
            new_panel = NIL;
        }
        if (new_posting == UNPROVIDED) {
            new_posting = NIL;
        }
        {
            SubLObject catch_var_for_cyblack_report_posting_monitor_visitor_method = NIL;
            SubLObject target_panel = get_cyblack_report_posting_monitor_visitor_target_panel(self);
            SubLObject target_posting = get_cyblack_report_posting_monitor_visitor_target_posting(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    application = new_application;
                    target_panel = new_panel;
                    target_posting = new_posting;
                    sublisp_throw($sym137$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD, new_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_report_posting_monitor_visitor_target_panel(self, target_panel);
                            set_cyblack_report_posting_monitor_visitor_target_posting(self, target_posting);
                            cyblack_object.set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_report_posting_monitor_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym137$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_report_posting_monitor_visitor_method;
        }
    }

    public static final SubLObject cyblack_report_posting_monitor_visitor_visit_method(SubLObject self, SubLObject v_cyblack_monitor) {
        {
            SubLObject catch_var_for_cyblack_report_posting_monitor_visitor_method = NIL;
            SubLObject target_panel = get_cyblack_report_posting_monitor_visitor_target_panel(self);
            SubLObject target_posting = get_cyblack_report_posting_monitor_visitor_target_posting(self);
            try {
                try {
                    if (((NIL != target_posting) && (NIL != target_panel)) && (NIL != methods.funcall_instance_method_with_0_args(v_cyblack_monitor, IS_ACTIVE))) {
                        methods.funcall_instance_method_with_2_args(v_cyblack_monitor, REPORT_POSTING, target_panel, target_posting);
                    }
                    sublisp_throw($sym140$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD, v_cyblack_monitor);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_report_posting_monitor_visitor_target_panel(self, target_panel);
                            set_cyblack_report_posting_monitor_visitor_target_posting(self, target_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_report_posting_monitor_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym140$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_report_posting_monitor_visitor_method;
        }
    }

    public static final SubLObject cyblack_report_posting_monitor_visitor_get_final_state_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_report_posting_monitor_visitor_method = NIL;
            SubLObject target_posting = get_cyblack_report_posting_monitor_visitor_target_posting(self);
            try {
                try {
                    sublisp_throw($sym143$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD, target_posting);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_report_posting_monitor_visitor_target_posting(self, target_posting);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_report_posting_monitor_visitor_method = Errors.handleThrowable(ccatch_env_var, $sym143$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD);
            }
            return catch_var_for_cyblack_report_posting_monitor_visitor_method;
        }
    }

    public static final SubLObject declare_cyblack_monitor_file() {
        declareFunction("cyblack_monitor_p", "CYBLACK-MONITOR-P", 1, 0, false);
        declareFunction("get_cyblack_basic_monitor_name", "GET-CYBLACK-BASIC-MONITOR-NAME", 1, 0, false);
        declareFunction("set_cyblack_basic_monitor_name", "SET-CYBLACK-BASIC-MONITOR-NAME", 2, 0, false);
        declareFunction("get_cyblack_basic_monitor_panel_list", "GET-CYBLACK-BASIC-MONITOR-PANEL-LIST", 1, 0, false);
        declareFunction("set_cyblack_basic_monitor_panel_list", "SET-CYBLACK-BASIC-MONITOR-PANEL-LIST", 2, 0, false);
        declareFunction("get_cyblack_basic_monitor_active", "GET-CYBLACK-BASIC-MONITOR-ACTIVE", 1, 0, false);
        declareFunction("set_cyblack_basic_monitor_active", "SET-CYBLACK-BASIC-MONITOR-ACTIVE", 2, 0, false);
        declareFunction("cyblack_basic_monitor_report_posting_method", "CYBLACK-BASIC-MONITOR-REPORT-POSTING-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_monitor_post_method", "CYBLACK-BASIC-MONITOR-POST-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_monitor_on_set_active_method", "CYBLACK-BASIC-MONITOR-ON-SET-ACTIVE-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_monitor_on_detach_method", "CYBLACK-BASIC-MONITOR-ON-DETACH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_monitor_detach_method", "CYBLACK-BASIC-MONITOR-DETACH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_monitor_on_attach_method", "CYBLACK-BASIC-MONITOR-ON-ATTACH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_monitor_attach_method", "CYBLACK-BASIC-MONITOR-ATTACH-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_monitor_install_method", "CYBLACK-BASIC-MONITOR-INSTALL-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_monitor_print_method", "CYBLACK-BASIC-MONITOR-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_monitor_initialize_qua_cyblack_monitor_method", "CYBLACK-BASIC-MONITOR-INITIALIZE-QUA-CYBLACK-MONITOR-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_monitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-MONITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_monitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-MONITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_monitor_p", "CYBLACK-BASIC-MONITOR-P", 1, 0, false);
        declareFunction("cyblack_basic_monitor_initialize_method", "CYBLACK-BASIC-MONITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_monitor_get_panels_method", "CYBLACK-BASIC-MONITOR-GET-PANELS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_monitor_set_panels_method", "CYBLACK-BASIC-MONITOR-SET-PANELS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_monitor_get_monitor_name_method", "CYBLACK-BASIC-MONITOR-GET-MONITOR-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_monitor_set_monitor_name_method", "CYBLACK-BASIC-MONITOR-SET-MONITOR-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_monitor_is_active_method", "CYBLACK-BASIC-MONITOR-IS-ACTIVE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_monitor_set_active_method", "CYBLACK-BASIC-MONITOR-SET-ACTIVE-METHOD", 2, 0, false);
        declareFunction("cyblack_monitor_visitor_p", "CYBLACK-MONITOR-VISITOR-P", 1, 0, false);
        declareFunction("get_cyblack_basic_monitor_visitor_continue", "GET-CYBLACK-BASIC-MONITOR-VISITOR-CONTINUE", 1, 0, false);
        declareFunction("set_cyblack_basic_monitor_visitor_continue", "SET-CYBLACK-BASIC-MONITOR-VISITOR-CONTINUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_monitor_visitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-MONITOR-VISITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_monitor_visitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-MONITOR-VISITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_monitor_visitor_p", "CYBLACK-BASIC-MONITOR-VISITOR-P", 1, 0, false);
        declareFunction("cyblack_basic_monitor_visitor_initialize_method", "CYBLACK-BASIC-MONITOR-VISITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_monitor_visitor_set_initial_state_method", "CYBLACK-BASIC-MONITOR-VISITOR-SET-INITIAL-STATE-METHOD", 2, 1, false);
        declareFunction("cyblack_basic_monitor_visitor_visit_method", "CYBLACK-BASIC-MONITOR-VISITOR-VISIT-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_monitor_visitor_continue_p_method", "CYBLACK-BASIC-MONITOR-VISITOR-CONTINUE-P-METHOD", 1, 1, false);
        declareFunction("cyblack_basic_monitor_visitor_get_final_state_method", "CYBLACK-BASIC-MONITOR-VISITOR-GET-FINAL-STATE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_report_posting_monitor_visitor_target_panel", "GET-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-TARGET-PANEL", 1, 0, false);
        declareFunction("set_cyblack_report_posting_monitor_visitor_target_panel", "SET-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-TARGET-PANEL", 2, 0, false);
        declareFunction("get_cyblack_report_posting_monitor_visitor_target_posting", "GET-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-TARGET-POSTING", 1, 0, false);
        declareFunction("set_cyblack_report_posting_monitor_visitor_target_posting", "SET-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-TARGET-POSTING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_report_posting_monitor_visitor_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_report_posting_monitor_visitor_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-INSTANCE", 1, 0, false);
        declareFunction("cyblack_report_posting_monitor_visitor_p", "CYBLACK-REPORT-POSTING-MONITOR-VISITOR-P", 1, 0, false);
        declareFunction("cyblack_report_posting_monitor_visitor_initialize_method", "CYBLACK-REPORT-POSTING-MONITOR-VISITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_report_posting_monitor_visitor_set_initial_state_method", "CYBLACK-REPORT-POSTING-MONITOR-VISITOR-SET-INITIAL-STATE-METHOD", 2, 2, false);
        declareFunction("cyblack_report_posting_monitor_visitor_visit_method", "CYBLACK-REPORT-POSTING-MONITOR-VISITOR-VISIT-METHOD", 2, 0, false);
        declareFunction("cyblack_report_posting_monitor_visitor_get_final_state_method", "CYBLACK-REPORT-POSTING-MONITOR-VISITOR-GET-FINAL-STATE-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_monitor_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_monitor_file() {
                interfaces.new_interface(CYBLACK_MONITOR, $list_alt1, $list_alt2, $list_alt3);
        interfaces.interfaces_add_interface_instance_method(INITIALIZE_QUA_CYBLACK_MONITOR, CYBLACK_MONITOR, $list_alt5, NIL, $list_alt6);
        interfaces.interfaces_add_interface_instance_method(PRINT, CYBLACK_MONITOR, $list_alt8, $list_alt9, $list_alt10);
        interfaces.interfaces_add_interface_instance_method(INSTALL, CYBLACK_MONITOR, $list_alt8, $list_alt12, $list_alt13);
        interfaces.interfaces_add_interface_instance_method(ATTACH, CYBLACK_MONITOR, $list_alt8, $list_alt15, $list_alt16);
        interfaces.interfaces_add_interface_instance_method(ON_ATTACH, CYBLACK_MONITOR, $list_alt5, $list_alt15, $list_alt18);
        interfaces.interfaces_add_interface_instance_method(DETACH, CYBLACK_MONITOR, $list_alt8, $list_alt20, $list_alt21);
        interfaces.interfaces_add_interface_instance_method(ON_DETACH, CYBLACK_MONITOR, $list_alt5, $list_alt20, $list_alt23);
        interfaces.interfaces_add_interface_instance_method(ON_SET_ACTIVE, CYBLACK_MONITOR, $list_alt5, $list_alt25, $list_alt26);
        interfaces.interfaces_add_interface_instance_method(POST, CYBLACK_MONITOR, $list_alt8, $list_alt28, $list_alt29);
        interfaces.interfaces_add_interface_instance_method(REPORT_POSTING, CYBLACK_MONITOR, $list_alt8, $list_alt31, $list_alt32);
        classes.subloop_new_class(CYBLACK_BASIC_MONITOR, CYBLACK_BASIC_LOCKABLE, $list_alt35, NIL, $list_alt36);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_MONITOR, NIL);
        methods.methods_incorporate_instance_method(REPORT_POSTING, CYBLACK_BASIC_MONITOR, $list_alt8, $list_alt31, $list_alt32);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, REPORT_POSTING, CYBLACK_BASIC_MONITOR_REPORT_POSTING_METHOD);
        methods.methods_incorporate_instance_method(POST, CYBLACK_BASIC_MONITOR, $list_alt8, $list_alt28, $list_alt29);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, POST, CYBLACK_BASIC_MONITOR_POST_METHOD);
        methods.methods_incorporate_instance_method(ON_SET_ACTIVE, CYBLACK_BASIC_MONITOR, $list_alt5, $list_alt25, $list_alt26);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, ON_SET_ACTIVE, CYBLACK_BASIC_MONITOR_ON_SET_ACTIVE_METHOD);
        methods.methods_incorporate_instance_method(ON_DETACH, CYBLACK_BASIC_MONITOR, $list_alt5, $list_alt20, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, ON_DETACH, CYBLACK_BASIC_MONITOR_ON_DETACH_METHOD);
        methods.methods_incorporate_instance_method(DETACH, CYBLACK_BASIC_MONITOR, $list_alt8, $list_alt20, $list_alt21);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, DETACH, CYBLACK_BASIC_MONITOR_DETACH_METHOD);
        methods.methods_incorporate_instance_method(ON_ATTACH, CYBLACK_BASIC_MONITOR, $list_alt5, $list_alt15, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, ON_ATTACH, CYBLACK_BASIC_MONITOR_ON_ATTACH_METHOD);
        methods.methods_incorporate_instance_method(ATTACH, CYBLACK_BASIC_MONITOR, $list_alt8, $list_alt15, $list_alt16);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, ATTACH, CYBLACK_BASIC_MONITOR_ATTACH_METHOD);
        methods.methods_incorporate_instance_method(INSTALL, CYBLACK_BASIC_MONITOR, $list_alt8, $list_alt12, $list_alt13);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, INSTALL, CYBLACK_BASIC_MONITOR_INSTALL_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_MONITOR, $list_alt8, $list_alt9, $list_alt10);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, PRINT, CYBLACK_BASIC_MONITOR_PRINT_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_MONITOR, CYBLACK_BASIC_MONITOR, $list_alt5, NIL, $list_alt6);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, INITIALIZE_QUA_CYBLACK_MONITOR, CYBLACK_BASIC_MONITOR_INITIALIZE_QUA_CYBLACK_MONITOR_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_MONITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_MONITOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_MONITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_MONITOR_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_monitor_class(CYBLACK_BASIC_MONITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_MONITOR, $list_alt5, NIL, $list_alt69);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, INITIALIZE, CYBLACK_BASIC_MONITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_PANELS, CYBLACK_BASIC_MONITOR, $list_alt8, NIL, $list_alt72);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, GET_PANELS, CYBLACK_BASIC_MONITOR_GET_PANELS_METHOD);
        methods.methods_incorporate_instance_method(SET_PANELS, CYBLACK_BASIC_MONITOR, $list_alt5, $list_alt76, $list_alt77);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, SET_PANELS, CYBLACK_BASIC_MONITOR_SET_PANELS_METHOD);
        methods.methods_incorporate_instance_method(GET_MONITOR_NAME, CYBLACK_BASIC_MONITOR, $list_alt8, NIL, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, GET_MONITOR_NAME, CYBLACK_BASIC_MONITOR_GET_MONITOR_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_MONITOR_NAME, CYBLACK_BASIC_MONITOR, $list_alt8, $list_alt85, $list_alt86);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, SET_MONITOR_NAME, CYBLACK_BASIC_MONITOR_SET_MONITOR_NAME_METHOD);
        methods.methods_incorporate_instance_method(IS_ACTIVE, CYBLACK_BASIC_MONITOR, $list_alt8, NIL, $list_alt90);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, IS_ACTIVE, CYBLACK_BASIC_MONITOR_IS_ACTIVE_METHOD);
        methods.methods_incorporate_instance_method(SET_ACTIVE, CYBLACK_BASIC_MONITOR, $list_alt8, $list_alt94, $list_alt95);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR, SET_ACTIVE, CYBLACK_BASIC_MONITOR_SET_ACTIVE_METHOD);
        interfaces.new_interface(CYBLACK_MONITOR_VISITOR, $list_alt99, $list_alt100, $list_alt101);
        classes.subloop_new_class(CYBLACK_BASIC_MONITOR_VISITOR, CYBLACK_OBJECT, $list_alt103, NIL, $list_alt104);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_MONITOR_VISITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_MONITOR_VISITOR, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_MONITOR_VISITOR_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_MONITOR_VISITOR, $sym107$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_MONITOR_VISITOR_INSTANC);
        subloop_reserved_initialize_cyblack_basic_monitor_visitor_class(CYBLACK_BASIC_MONITOR_VISITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_MONITOR_VISITOR, $list_alt5, NIL, $list_alt108);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR_VISITOR, INITIALIZE, CYBLACK_BASIC_MONITOR_VISITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, CYBLACK_BASIC_MONITOR_VISITOR, $list_alt8, $list_alt112, $list_alt113);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR_VISITOR, SET_INITIAL_STATE, CYBLACK_BASIC_MONITOR_VISITOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_BASIC_MONITOR_VISITOR, $list_alt8, $list_alt35, $list_alt116);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR_VISITOR, VISIT, CYBLACK_BASIC_MONITOR_VISITOR_VISIT_METHOD);
        methods.methods_incorporate_instance_method(CONTINUE_P, CYBLACK_BASIC_MONITOR_VISITOR, $list_alt8, $list_alt119, $list_alt120);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR_VISITOR, CONTINUE_P, CYBLACK_BASIC_MONITOR_VISITOR_CONTINUE_P_METHOD);
        methods.methods_incorporate_instance_method(GET_FINAL_STATE, CYBLACK_BASIC_MONITOR_VISITOR, $list_alt8, NIL, $list_alt124);
        methods.subloop_register_instance_method(CYBLACK_BASIC_MONITOR_VISITOR, GET_FINAL_STATE, CYBLACK_BASIC_MONITOR_VISITOR_GET_FINAL_STATE_METHOD);
        classes.subloop_new_class(CYBLACK_REPORT_POSTING_MONITOR_VISITOR, CYBLACK_BASIC_MONITOR_VISITOR, NIL, NIL, $list_alt127);
        classes.class_set_implements_slot_listeners(CYBLACK_REPORT_POSTING_MONITOR_VISITOR, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_REPORT_POSTING_MONITOR_VISITOR, $sym130$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REPORT_POSTING_MONITOR_VISITO);
        classes.subloop_note_instance_initialization_function(CYBLACK_REPORT_POSTING_MONITOR_VISITOR, $sym131$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REPORT_POSTING_MONITOR_VISITO);
        subloop_reserved_initialize_cyblack_report_posting_monitor_visitor_class(CYBLACK_REPORT_POSTING_MONITOR_VISITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_REPORT_POSTING_MONITOR_VISITOR, $list_alt5, NIL, $list_alt132);
        methods.subloop_register_instance_method(CYBLACK_REPORT_POSTING_MONITOR_VISITOR, INITIALIZE, CYBLACK_REPORT_POSTING_MONITOR_VISITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_INITIAL_STATE, CYBLACK_REPORT_POSTING_MONITOR_VISITOR, $list_alt8, $list_alt135, $list_alt136);
        methods.subloop_register_instance_method(CYBLACK_REPORT_POSTING_MONITOR_VISITOR, SET_INITIAL_STATE, CYBLACK_REPORT_POSTING_MONITOR_VISITOR_SET_INITIAL_STATE_METHOD);
        methods.methods_incorporate_instance_method(VISIT, CYBLACK_REPORT_POSTING_MONITOR_VISITOR, $list_alt8, $list_alt35, $list_alt139);
        methods.subloop_register_instance_method(CYBLACK_REPORT_POSTING_MONITOR_VISITOR, VISIT, CYBLACK_REPORT_POSTING_MONITOR_VISITOR_VISIT_METHOD);
        methods.methods_incorporate_instance_method(GET_FINAL_STATE, CYBLACK_REPORT_POSTING_MONITOR_VISITOR, $list_alt8, NIL, $list_alt142);
        methods.subloop_register_instance_method(CYBLACK_REPORT_POSTING_MONITOR_VISITOR, GET_FINAL_STATE, CYBLACK_REPORT_POSTING_MONITOR_VISITOR_GET_FINAL_STATE_METHOD);
        return NIL;
    }



    static private final SubLList $list_alt1 = list(makeSymbol("CYBLACK-COMPONENT"), makeSymbol("CYBLACK-LOCKABLE"));

    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT"), makeSymbol("CYBLACK-LOCKABLE")));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-MONITOR"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("MONITORED-TYPE-STRINGS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ATTACH"), list(makeSymbol("NEW-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ATTACH"), list(makeSymbol("NEW-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DETACH"), list(makeSymbol("OLD-PANEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DETACH"), list(makeSymbol("OLD-PANEL")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANELS"), list(makeSymbol("NEW-PANEL-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MONITOR-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MONITOR-NAME"), list(makeSymbol("NEW-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IS-ACTIVE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVE"), list(makeSymbol("NEW-ACTIVE-STATUS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SET-ACTIVE"), list(makeSymbol("OLD-ACTIVE-STATUS"), makeSymbol("NEW-ACTIVE-STATUS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REPORT-POSTING"), list(makeSymbol("PANEL"), makeSymbol("POSTING")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol INITIALIZE_QUA_CYBLACK_MONITOR = makeSymbol("INITIALIZE-QUA-CYBLACK-MONITOR");

    static private final SubLList $list_alt5 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt6 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-PANELS"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-MONITOR-NAME"), makeSymbol("SELF"), NIL), list(makeSymbol("SET-ACTIVE"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));



    static private final SubLList $list_alt8 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt9 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt10 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-MONITOR: ~S>"), list(makeSymbol("GET-MONITOR-NAME"), makeSymbol("SELF"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol INSTALL = makeSymbol("INSTALL");

    static private final SubLList $list_alt12 = list(makeSymbol("NEW-APPLICATION"), makeSymbol("MONITORED-TYPE-STRINGS"));

    static private final SubLList $list_alt13 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION")), makeString("(INSTALL ~S): ~S is not an instance of CYBLACK-APPLICATION."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("LISTP"), makeSymbol("MONITORED-TYPE-STRINGS")), makeString("(INSTALL ~S): ~S is not a list of type strings."), makeSymbol("SELF"), makeSymbol("MONITORED-TYPE-STRINGS")), list(makeSymbol("WHEN-CYBLACK-TYPE-CHECKING-ON"), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-STRING"), makeSymbol("MONITORED-TYPE-STRINGS")), list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("TEMPLATE-STRING")), makeString("(INSTALL ~S): ~S is not a type string."), makeSymbol("SELF"), makeSymbol("TEMPLATE-STRING")))), list(makeSymbol("SET-CYBLACK-OBJECT-APPLICATION"), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PANEL"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-TYPE-STRING"), makeSymbol("MONITORED-TYPE-STRINGS")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-APPLICATION"), list(QUOTE, makeSymbol("FIND-PANEL")), makeSymbol("TEMPLATE-TYPE-STRING"))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PANEL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ATTACH")), makeSymbol("TEMPLATE-PANEL"))))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol ATTACH = makeSymbol("ATTACH");

    static private final SubLList $list_alt15 = list(makeSymbol("NEW-PANEL"));

    static private final SubLList $list_alt16 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-USER-INTERACTION-PANEL-P"), makeSymbol("NEW-PANEL")), makeString("(ATTACH ~S): Monitors may only be attached to CYBLACK-USER-INTERACTION-PANEL instances. ~\n     ~S is not an instance of CYBLACK-USER-INTERACTION-PANEL."), makeSymbol("SELF"), makeSymbol("NEW-PANEL")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PANELS"), list(makeSymbol("GET-PANELS"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-PANEL"), makeSymbol("TEMPLATE-PANELS")), list(makeSymbol("CPUSH"), makeSymbol("NEW-PANEL"), makeSymbol("TEMPLATE-PANELS")), list(makeSymbol("SET-PANELS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-PANEL"), list(QUOTE, makeSymbol("ADD-MONITOR")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-ATTACH")), makeSymbol("NEW-PANEL")), list(RET, makeSymbol("NEW-PANEL")))), list(RET, NIL));

    private static final SubLSymbol ON_ATTACH = makeSymbol("ON-ATTACH");

    static private final SubLList $list_alt18 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-USER-INTERACTION-PANEL-P"), makeSymbol("NEW-PANEL")), makeString("(ON-ATTACH ~S): Monitors may only be attached to CYBLACK-USER-INTERACTION-PANEL instances. ~\n     ~S is not an instance of CYBLACK-USER-INTERACTION-PANEL."), makeSymbol("SELF"), makeSymbol("NEW-PANEL")), list(makeSymbol("SET-ACTIVE"), makeSymbol("SELF"), T), list(RET, makeSymbol("NEW-PANEL")));

    private static final SubLSymbol DETACH = makeSymbol("DETACH");

    static private final SubLList $list_alt20 = list(makeSymbol("OLD-PANEL"));

    static private final SubLList $list_alt21 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-USER-INTERACTION-PANEL-P"), makeSymbol("OLD-PANEL")), makeString("(DETACH ~S): Monitors may only be attached to CYBLACK-USER-INTERACTION-PANEL instances. ~\n     ~S is not an instance of CYBLACK-USER-INTERACTION-PANEL."), makeSymbol("SELF"), makeSymbol("OLD-PANEL")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-PANELS"), list(makeSymbol("GET-PANELS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("OLD-PANEL"), makeSymbol("TEMPLATE-PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-DETACH")), makeSymbol("OLD-PANEL")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANELS"), list(makeSymbol("DELETE"), makeSymbol("OLD-PANEL"), makeSymbol("TEMPLATE-PANELS"))), list(makeSymbol("SET-PANELS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-PANEL"), list(QUOTE, makeSymbol("REMOVE-MONITOR")), makeSymbol("SELF")), list(RET, makeSymbol("OLD-PANEL")))), list(RET, NIL));

    private static final SubLSymbol ON_DETACH = makeSymbol("ON-DETACH");

    static private final SubLList $list_alt23 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-USER-INTERACTION-PANEL-P"), makeSymbol("OLD-PANEL")), makeString("(ON-DETACH ~S): Monitors may only be attached to CYBLACK-USER-INTERACTION-PANEL instances. ~\n     ~S is not an instance of CYBLACK-USER-INTERACTION-PANEL."), makeSymbol("SELF"), makeSymbol("OLD-PANEL")), list(makeSymbol("SET-ACTIVE"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("OLD-PANEL")));

    private static final SubLSymbol ON_SET_ACTIVE = makeSymbol("ON-SET-ACTIVE");

    static private final SubLList $list_alt25 = list(makeSymbol("OLD-ACTIVE-STATUS"), makeSymbol("NEW-ACTIVE-STATUS"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("IGNORE"), makeSymbol("OLD-ACTIVE-STATUS")), list(RET, makeSymbol("NEW-ACTIVE-STATUS")));



    static private final SubLList $list_alt28 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(POST ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-POSTING-CLASS"), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("POSTING")))), list(makeSymbol("TEMPLATE-PANEL-DATATYPE"), NIL), list(makeSymbol("TEMPLATE-PANEL-DATATYPE-POSTING-CLASS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PANEL"), list(makeSymbol("GET-PANELS"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-DATATYPE"), list(makeSymbol("CYBLACK-PANEL-GET-DATATYPE"), makeSymbol("TEMPLATE-PANEL"))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-PANEL-DATATYPE"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-DATATYPE-POSTING-CLASS"), list(makeSymbol("CYBLACK-DATATYPE-GET-POSTING-TYPE"), makeSymbol("TEMPLATE-PANEL-DATATYPE"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("TEMPLATE-PANEL-DATATYPE-POSTING-CLASS"), makeSymbol("TEMPLATE-POSTING-CLASS")), list(makeSymbol("CYBLACK-POSTING-SET-APPLICATION"), makeSymbol("POSTING"), makeSymbol("APPLICATION")), list(makeSymbol("CYBLACK-POSTING-SET-ACTIVE"), makeSymbol("POSTING"), T), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PANEL"), list(QUOTE, makeSymbol("ADD-POSTING")), makeSymbol("POSTING")), list(RET, makeSymbol("POSTING")))))), list(RET, makeSymbol("POSTING")));

    private static final SubLSymbol REPORT_POSTING = makeSymbol("REPORT-POSTING");

    static private final SubLList $list_alt31 = list(makeSymbol("PANEL"), makeSymbol("POSTING"));

    static private final SubLList $list_alt32 = list(list(makeSymbol("IGNORE"), makeSymbol("PANEL")), list(RET, makeSymbol("POSTING")));

    private static final SubLSymbol CYBLACK_BASIC_MONITOR = makeSymbol("CYBLACK-BASIC-MONITOR");



    static private final SubLList $list_alt35 = list(makeSymbol("CYBLACK-MONITOR"));

    static private final SubLList $list_alt36 = list(new SubLObject[]{ list(makeSymbol("PANEL-LIST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ACTIVE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-MONITOR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INSTALL"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("MONITORED-TYPE-STRINGS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ATTACH"), list(makeSymbol("NEW-PANEL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-ATTACH"), list(makeSymbol("NEW-PANEL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DETACH"), list(makeSymbol("OLD-PANEL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-DETACH"), list(makeSymbol("OLD-PANEL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PANELS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PANELS"), list(makeSymbol("NEW-PANEL-LIST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MONITOR-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MONITOR-NAME"), list(makeSymbol("NEW-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IS-ACTIVE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ACTIVE"), list(makeSymbol("NEW-ACTIVE-STATUS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SET-ACTIVE"), list(makeSymbol("OLD-ACTIVE-STATUS"), makeSymbol("NEW-ACTIVE-STATUS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST"), list(makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REPORT-POSTING"), list(makeSymbol("PANEL"), makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")) });



    private static final SubLSymbol PANEL_LIST = makeSymbol("PANEL-LIST");



    public static final SubLInteger $int$4097 = makeInteger(4097);

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_REPORT_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-REPORT-POSTING-METHOD");

    static private final SubLSymbol $sym42$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-MONITOR-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_MONITOR_POST_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-POST-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_ON_SET_ACTIVE_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-ON-SET-ACTIVE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_ON_DETACH_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-ON-DETACH-METHOD");

    private static final SubLSymbol REMOVE_MONITOR = makeSymbol("REMOVE-MONITOR");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_DETACH_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-DETACH-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_ON_ATTACH_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-ON-ATTACH-METHOD");

    private static final SubLSymbol ADD_MONITOR = makeSymbol("ADD-MONITOR");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_ATTACH_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-ATTACH-METHOD");

    private static final SubLSymbol FIND_PANEL = makeSymbol("FIND-PANEL");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_INSTALL_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-INSTALL-METHOD");

    static private final SubLString $str_alt54$__CYBLACK_MONITOR___S_ = makeString("#<CYBLACK-MONITOR: ~S>");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_INITIALIZE_QUA_CYBLACK_MONITOR_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-INITIALIZE-QUA-CYBLACK-MONITOR-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_MONITOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-MONITOR-CLASS");















    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_MONITOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-MONITOR-INSTANCE");



    static private final SubLList $list_alt69 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-CYBLACK-MONITOR"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-INITIALIZE-METHOD");



    static private final SubLList $list_alt72 = list(list(RET, makeSymbol("PANEL-LIST")));

    static private final SubLSymbol $sym73$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_GET_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-GET-PANELS-METHOD");

    private static final SubLSymbol SET_PANELS = makeSymbol("SET-PANELS");

    static private final SubLList $list_alt76 = list(makeSymbol("NEW-PANEL-LIST"));

    static private final SubLList $list_alt77 = list(list(makeSymbol("CSETQ"), makeSymbol("PANEL-LIST"), makeSymbol("NEW-PANEL-LIST")), list(RET, makeSymbol("NEW-PANEL-LIST")));

    static private final SubLSymbol $sym78$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_SET_PANELS_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-SET-PANELS-METHOD");

    private static final SubLSymbol GET_MONITOR_NAME = makeSymbol("GET-MONITOR-NAME");

    static private final SubLList $list_alt81 = list(list(RET, makeSymbol("NAME")));

    static private final SubLSymbol $sym82$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_GET_MONITOR_NAME_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-GET-MONITOR-NAME-METHOD");

    private static final SubLSymbol SET_MONITOR_NAME = makeSymbol("SET-MONITOR-NAME");

    static private final SubLList $list_alt85 = list(makeSymbol("NEW-NAME"));

    static private final SubLList $list_alt86 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-NAME")), list(makeSymbol("STRINGP"), makeSymbol("NEW-NAME"))), makeString("(SET-MONITOR-NAME ~S): The monitor name must be a string.  ~S is not a string."), makeSymbol("SELF"), makeSymbol("NEW-NAME")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeSymbol("NEW-NAME")), list(RET, makeSymbol("NEW-NAME")));

    static private final SubLSymbol $sym87$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_SET_MONITOR_NAME_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-SET-MONITOR-NAME-METHOD");



    static private final SubLList $list_alt90 = list(list(RET, makeSymbol("ACTIVE")));

    static private final SubLSymbol $sym91$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_IS_ACTIVE_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-IS-ACTIVE-METHOD");



    static private final SubLList $list_alt94 = list(makeSymbol("NEW-ACTIVE-STATUS"));

    static private final SubLList $list_alt95 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ON-SET-ACTIVE")), makeSymbol("ACTIVE"), makeSymbol("NEW-ACTIVE-STATUS")), list(makeSymbol("CSETQ"), makeSymbol("ACTIVE"), makeSymbol("NEW-ACTIVE-STATUS")), list(RET, makeSymbol("NEW-ACTIVE-STATUS")));

    static private final SubLSymbol $sym96$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_SET_ACTIVE_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-SET-ACTIVE-METHOD");

    private static final SubLSymbol CYBLACK_MONITOR_VISITOR = makeSymbol("CYBLACK-MONITOR-VISITOR");

    static private final SubLList $list_alt99 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt100 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt101 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE"))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTINUE-P"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("CYBLACK-MONITOR"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_VISITOR = makeSymbol("CYBLACK-BASIC-MONITOR-VISITOR");

    static private final SubLList $list_alt103 = list(makeSymbol("CYBLACK-MONITOR-VISITOR"));

    static private final SubLList $list_alt104 = list(list(makeSymbol("CONTINUE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE"))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTINUE-P"), list(makeSymbol("&OPTIONAL"), list(makeSymbol("CYBLACK-MONITOR"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_MONITOR_VISITOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-MONITOR-VISITOR-CLASS");

    static private final SubLSymbol $sym107$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_MONITOR_VISITOR_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-MONITOR-VISITOR-INSTANCE");

    static private final SubLList $list_alt108 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CONTINUE"), T), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym109$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-MONITOR-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_VISITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-VISITOR-INITIALIZE-METHOD");



    static private final SubLList $list_alt112 = list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-STATE")));

    static private final SubLList $list_alt113 = list(list(makeSymbol("IGNORE"), makeSymbol("NEW-STATE")), list(makeSymbol("SET-APPLICATION"), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_VISITOR_SET_INITIAL_STATE_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-VISITOR-SET-INITIAL-STATE-METHOD");



    static private final SubLList $list_alt116 = list(list(RET, makeSymbol("CYBLACK-MONITOR")));

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_VISITOR_VISIT_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-VISITOR-VISIT-METHOD");



    static private final SubLList $list_alt119 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("CYBLACK-MONITOR"), NIL));

    static private final SubLList $list_alt120 = list(list(makeSymbol("IGNORE"), makeSymbol("CYBLACK-MONITOR")), list(RET, makeSymbol("CONTINUE")));

    static private final SubLSymbol $sym121$OUTER_CATCH_FOR_CYBLACK_BASIC_MONITOR_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-MONITOR-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_VISITOR_CONTINUE_P_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-VISITOR-CONTINUE-P-METHOD");



    static private final SubLList $list_alt124 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_BASIC_MONITOR_VISITOR_GET_FINAL_STATE_METHOD = makeSymbol("CYBLACK-BASIC-MONITOR-VISITOR-GET-FINAL-STATE-METHOD");

    private static final SubLSymbol CYBLACK_REPORT_POSTING_MONITOR_VISITOR = makeSymbol("CYBLACK-REPORT-POSTING-MONITOR-VISITOR");

    static private final SubLList $list_alt127 = list(list(makeSymbol("TARGET-POSTING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TARGET-PANEL"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INITIAL-STATE"), list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-PANEL"), NIL), list(makeSymbol("NEW-POSTING"), NIL)), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VISIT"), list(makeSymbol("CYBLACK-MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FINAL-STATE"), NIL, makeKeyword("PUBLIC")));





    static private final SubLSymbol $sym130$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REPORT_POSTING_MONITOR_VISITO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-CLASS");

    static private final SubLSymbol $sym131$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_REPORT_POSTING_MONITOR_VISITO = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-INSTANCE");

    static private final SubLList $list_alt132 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TARGET-POSTING"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TARGET-PANEL"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym133$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_REPORT_POSTING_MONITOR_VISITOR_INITIALIZE_METHOD = makeSymbol("CYBLACK-REPORT-POSTING-MONITOR-VISITOR-INITIALIZE-METHOD");

    static private final SubLList $list_alt135 = list(makeSymbol("NEW-APPLICATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-PANEL"), NIL), list(makeSymbol("NEW-POSTING")));

    static private final SubLList $list_alt136 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION")), makeString("(SET-INITIAL-STATE ~S): ~S is not an instance of CYBLACK-APPLICATION."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-PANEL-P"), makeSymbol("NEW-PANEL")), makeString("(SET-INITIAL-STATE ~S): ~S is not an instance of CYBLACK-PANEL."), makeSymbol("SELF"), makeSymbol("NEW-PANEL")), list(makeSymbol("CSETQ"), makeSymbol("TARGET-PANEL"), makeSymbol("NEW-PANEL")), list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("NEW-POSTING")), makeString("(SET-INITIAL-STATE ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("NEW-POSTING")), list(makeSymbol("CSETQ"), makeSymbol("TARGET-POSTING"), makeSymbol("NEW-POSTING")), list(RET, makeSymbol("NEW-POSTING")));

    static private final SubLSymbol $sym137$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_REPORT_POSTING_MONITOR_VISITOR_SET_INITIAL_STATE_METHOD = makeSymbol("CYBLACK-REPORT-POSTING-MONITOR-VISITOR-SET-INITIAL-STATE-METHOD");

    static private final SubLList $list_alt139 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-MONITOR-P"), makeSymbol("CYBLACK-MONITOR")), makeString("(VISIT ~S): ~S is not an instance of CYBLACK-MONITOR."), makeSymbol("SELF"), makeSymbol("CYBLACK-MONITOR")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("TARGET-POSTING"), makeSymbol("TARGET-PANEL"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CYBLACK-MONITOR"), list(QUOTE, makeSymbol("IS-ACTIVE")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CYBLACK-MONITOR"), list(QUOTE, makeSymbol("REPORT-POSTING")), makeSymbol("TARGET-PANEL"), makeSymbol("TARGET-POSTING"))), list(RET, makeSymbol("CYBLACK-MONITOR")));

    static private final SubLSymbol $sym140$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_REPORT_POSTING_MONITOR_VISITOR_VISIT_METHOD = makeSymbol("CYBLACK-REPORT-POSTING-MONITOR-VISITOR-VISIT-METHOD");

    static private final SubLList $list_alt142 = list(list(RET, makeSymbol("TARGET-POSTING")));

    static private final SubLSymbol $sym143$OUTER_CATCH_FOR_CYBLACK_REPORT_POSTING_MONITOR_VISITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-REPORT-POSTING-MONITOR-VISITOR-METHOD");

    private static final SubLSymbol CYBLACK_REPORT_POSTING_MONITOR_VISITOR_GET_FINAL_STATE_METHOD = makeSymbol("CYBLACK-REPORT-POSTING-MONITOR-VISITOR-GET-FINAL-STATE-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_monitor_file();
    }

    public void initializeVariables() {
        init_cyblack_monitor_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_monitor_file();
    }
}

