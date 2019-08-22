/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-UI-PANEL
 *  source file: /cyc/top/cycl/cyblack/cyblack-ui-panel.lisp
 *  created:     2019/07/03 17:38:49
 */
public final class cyblack_ui_panel extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_ui_panel() {
    }

    public static final SubLFile me = new cyblack_ui_panel();


    // // Definitions
    public static final SubLObject cyblack_user_interaction_panel_p(SubLObject cyblack_user_interaction_panel) {
        return interfaces.subloop_instanceof_interface(cyblack_user_interaction_panel, CYBLACK_USER_INTERACTION_PANEL);
    }

    public static final SubLObject get_cyblack_basic_user_interaction_panel_monitors(SubLObject cyblack_basic_user_interaction_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_user_interaction_panel, SIXTEEN_INTEGER, MONITORS);
    }

    public static final SubLObject set_cyblack_basic_user_interaction_panel_monitors(SubLObject cyblack_basic_user_interaction_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_user_interaction_panel, value, SIXTEEN_INTEGER, MONITORS);
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_iterate_over_all_monitors_internal_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_visited_panels = NIL;
            SubLObject template_panels = NIL;
            SubLObject template_current_panel = self;
            while (NIL != template_current_panel) {
                if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                    template_visited_panels = cons(template_current_panel, template_visited_panels);
                    methods.funcall_instance_method_with_1_args(template_current_panel, ITERATE_OVER_DIRECT_MONITORS_INTERNAL, monitor_visitor);
                    if (NIL == cyblack_monitor.cyblack_basic_monitor_visitor_continue_p_method(monitor_visitor, UNPROVIDED)) {
                        return monitor_visitor;
                    }
                }
                {
                    SubLObject cdolist_list_var = cyblack_panel_dispatch_functions.cyblack_panel_get_super_panels(template_current_panel);
                    SubLObject template_panel = NIL;
                    for (template_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_panel = cdolist_list_var.first()) {
                        if (NIL != cyblack_user_interaction_panel_p(template_panel)) {
                            template_panels = cons(template_panel, template_panels);
                        }
                    }
                }
                if (NIL != template_panels) {
                    template_current_panel = template_panels.first();
                    template_panels = template_panels.rest();
                } else {
                    template_current_panel = NIL;
                }
            } 
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_iterate_over_direct_monitors_internal_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_monitors = cyblack_basic_user_interaction_panel_get_monitors_method(self);
            if (NIL == template_monitors) {
            }
            {
                SubLObject cdolist_list_var = template_monitors;
                SubLObject template_monitor = NIL;
                for (template_monitor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_monitor = cdolist_list_var.first()) {
                    if (NIL != methods.funcall_instance_method_with_0_args(template_monitor, IS_ACTIVE)) {
                        methods.funcall_instance_method_with_1_args(monitor_visitor, VISIT, template_monitor);
                        if (NIL == cyblack_monitor.cyblack_basic_monitor_visitor_continue_p_method(monitor_visitor, UNPROVIDED)) {
                            return monitor_visitor;
                        }
                    }
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_iterate_over_all_monitors_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_lock = cyblack_basic_user_interaction_panel_get_lock_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                cyblack_basic_user_interaction_panel_iterate_over_all_monitors_internal_method(self, monitor_visitor);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_iterate_over_direct_monitors_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_lock = cyblack_basic_user_interaction_panel_get_lock_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                cyblack_basic_user_interaction_panel_iterate_over_direct_monitors_internal_method(self, monitor_visitor);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_remove_monitor_method(SubLObject self, SubLObject monitor) {
        {
            SubLObject template_lock = cyblack_basic_user_interaction_panel_get_lock_method(self);
            SubLObject template_monitors = cyblack_basic_user_interaction_panel_get_monitors_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                template_monitors = delete(monitor, template_monitors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cyblack_basic_user_interaction_panel_set_monitors_method(self, template_monitors);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_add_monitor_method(SubLObject self, SubLObject monitor) {
        {
            SubLObject template_lock = cyblack_basic_user_interaction_panel_get_lock_method(self);
            SubLObject template_monitors = cyblack_basic_user_interaction_panel_get_monitors_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == subl_promotions.memberP(monitor, template_monitors, UNPROVIDED, UNPROVIDED)) {
                    template_monitors = cons(monitor, template_monitors);
                    cyblack_basic_user_interaction_panel_set_monitors_method(self, template_monitors);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_user_interaction_panel_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject template_lock = cyblack_basic_user_interaction_panel_get_lock_method(self);
                        SubLObject lock = template_lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock);
                            {
                                SubLObject template_monitor_visitor = object.new_object_instance(CYBLACK_REPORT_POSTING_MONITOR_VISITOR);
                                cyblack_object.set_cyblack_object_application(template_monitor_visitor, application);
                                cyblack_monitor.cyblack_report_posting_monitor_visitor_set_initial_state_method(template_monitor_visitor, cyblack_object.cyblack_object_get_application_method(self), self, posting);
                                cyblack_basic_user_interaction_panel_iterate_over_all_monitors_method(self, template_monitor_visitor);
                                cyblack_panel.cyblack_basic_panel_add_posting_method(self, posting);
                            }
                        } finally {
                            if (NIL != release) {
                                release_lock(lock);
                            }
                        }
                        sublisp_throw($sym36$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_PANEL_METHOD, posting);
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
                catch_var_for_cyblack_basic_user_interaction_panel_method = Errors.handleThrowable(ccatch_env_var, $sym36$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_user_interaction_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_initialize_qua_cyblack_user_interaction_panel_method(SubLObject self) {
        cyblack_basic_user_interaction_panel_set_monitors_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_user_interaction_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_user_interaction_panel_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_USER_INTERACTION_PANEL, MONITORS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_p(SubLObject cyblack_basic_user_interaction_panel) {
        return classes.subloop_instanceof_class(cyblack_basic_user_interaction_panel, CYBLACK_BASIC_USER_INTERACTION_PANEL);
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_initialize_method(SubLObject self) {
        cyblack_panel.cyblack_basic_panel_initialize_method(self);
        cyblack_basic_user_interaction_panel_initialize_qua_cyblack_user_interaction_panel_method(self);
        return self;
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_get_lock_method(SubLObject self) {
        {
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            return lock;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_get_monitors_method(SubLObject self) {
        {
            SubLObject monitors = get_cyblack_basic_user_interaction_panel_monitors(self);
            return monitors;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_panel_set_monitors_method(SubLObject self, SubLObject new_monitors) {
        {
            SubLObject catch_var_for_cyblack_basic_user_interaction_panel_method = NIL;
            SubLObject monitors = get_cyblack_basic_user_interaction_panel_monitors(self);
            try {
                try {
                    monitors = new_monitors;
                    sublisp_throw($sym76$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_PANEL_METHOD, new_monitors);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_user_interaction_panel_monitors(self, monitors);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_user_interaction_panel_method = Errors.handleThrowable(ccatch_env_var, $sym76$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_PANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_user_interaction_panel_method;
        }
    }

    public static final SubLObject get_cyblack_basic_sequence_user_interaction_panel_monitors(SubLObject cyblack_basic_sequence_user_interaction_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_sequence_user_interaction_panel, EIGHTEEN_INTEGER, MONITORS);
    }

    public static final SubLObject set_cyblack_basic_sequence_user_interaction_panel_monitors(SubLObject cyblack_basic_sequence_user_interaction_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_sequence_user_interaction_panel, value, EIGHTEEN_INTEGER, MONITORS);
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_iterate_over_all_monitors_internal_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_visited_panels = NIL;
            SubLObject template_panels = NIL;
            SubLObject template_current_panel = self;
            while (NIL != template_current_panel) {
                if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                    template_visited_panels = cons(template_current_panel, template_visited_panels);
                    methods.funcall_instance_method_with_1_args(template_current_panel, ITERATE_OVER_DIRECT_MONITORS_INTERNAL, monitor_visitor);
                    if (NIL == cyblack_monitor.cyblack_basic_monitor_visitor_continue_p_method(monitor_visitor, UNPROVIDED)) {
                        return monitor_visitor;
                    }
                }
                {
                    SubLObject cdolist_list_var = cyblack_panel_dispatch_functions.cyblack_panel_get_super_panels(template_current_panel);
                    SubLObject template_panel = NIL;
                    for (template_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_panel = cdolist_list_var.first()) {
                        if (NIL != cyblack_user_interaction_panel_p(template_panel)) {
                            template_panels = cons(template_panel, template_panels);
                        }
                    }
                }
                if (NIL != template_panels) {
                    template_current_panel = template_panels.first();
                    template_panels = template_panels.rest();
                } else {
                    template_current_panel = NIL;
                }
            } 
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_iterate_over_direct_monitors_internal_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_monitors = cyblack_basic_sequence_user_interaction_panel_get_monitors_method(self);
            if (NIL == template_monitors) {
            }
            {
                SubLObject cdolist_list_var = template_monitors;
                SubLObject template_monitor = NIL;
                for (template_monitor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_monitor = cdolist_list_var.first()) {
                    if (NIL != methods.funcall_instance_method_with_0_args(template_monitor, IS_ACTIVE)) {
                        methods.funcall_instance_method_with_1_args(monitor_visitor, VISIT, template_monitor);
                        if (NIL == cyblack_monitor.cyblack_basic_monitor_visitor_continue_p_method(monitor_visitor, UNPROVIDED)) {
                            return monitor_visitor;
                        }
                    }
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_iterate_over_all_monitors_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_lock = cyblack_basic_sequence_user_interaction_panel_get_lock_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                cyblack_basic_sequence_user_interaction_panel_iterate_over_all_monitors_internal_method(self, monitor_visitor);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_iterate_over_direct_monitors_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_lock = cyblack_basic_sequence_user_interaction_panel_get_lock_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                cyblack_basic_sequence_user_interaction_panel_iterate_over_direct_monitors_internal_method(self, monitor_visitor);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_remove_monitor_method(SubLObject self, SubLObject monitor) {
        {
            SubLObject template_lock = cyblack_basic_sequence_user_interaction_panel_get_lock_method(self);
            SubLObject template_monitors = cyblack_basic_sequence_user_interaction_panel_get_monitors_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                template_monitors = delete(monitor, template_monitors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cyblack_basic_sequence_user_interaction_panel_set_monitors_method(self, template_monitors);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor;
        }
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_add_monitor_method(SubLObject self, SubLObject monitor) {
        {
            SubLObject template_lock = cyblack_basic_sequence_user_interaction_panel_get_lock_method(self);
            SubLObject template_monitors = cyblack_basic_sequence_user_interaction_panel_get_monitors_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == subl_promotions.memberP(monitor, template_monitors, UNPROVIDED, UNPROVIDED)) {
                    template_monitors = cons(monitor, template_monitors);
                    cyblack_basic_sequence_user_interaction_panel_set_monitors_method(self, template_monitors);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor;
        }
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_user_interaction_panel_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject template_lock = cyblack_basic_sequence_user_interaction_panel_get_lock_method(self);
                        SubLObject lock = template_lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock);
                            {
                                SubLObject template_monitor_visitor = object.new_object_instance(CYBLACK_REPORT_POSTING_MONITOR_VISITOR);
                                cyblack_object.set_cyblack_object_application(template_monitor_visitor, application);
                                cyblack_monitor.cyblack_report_posting_monitor_visitor_set_initial_state_method(template_monitor_visitor, cyblack_object.cyblack_object_get_application_method(self), self, posting);
                                cyblack_basic_sequence_user_interaction_panel_iterate_over_all_monitors_method(self, template_monitor_visitor);
                                cyblack_panel.cyblack_basic_sequence_panel_add_posting_method(self, posting);
                            }
                        } finally {
                            if (NIL != release) {
                                release_lock(lock);
                            }
                        }
                        sublisp_throw($sym87$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_MET, posting);
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
                catch_var_for_cyblack_basic_sequence_user_interaction_panel_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_MET);
            }
            return catch_var_for_cyblack_basic_sequence_user_interaction_panel_method;
        }
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_initialize_qua_cyblack_user_interaction_panel_method(SubLObject self) {
        cyblack_basic_sequence_user_interaction_panel_set_monitors_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_sequence_user_interaction_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_sequence_user_interaction_panel_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, MARKS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, INTERNAL_STORAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, STORAGE_SIZE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, LARGEST_INDEX, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, DEFAULT_VALUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, GROWTH_FACTOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, SEQUENCE_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, STIMULATION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, SUPER_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, SUB_PANELS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, DIRECT_KNOWLEDGE_SOURCES, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_PANEL, POSTING_DAEMONS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, MONITORS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_p(SubLObject cyblack_basic_sequence_user_interaction_panel) {
        return classes.subloop_instanceof_class(cyblack_basic_sequence_user_interaction_panel, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL);
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_initialize_method(SubLObject self) {
        cyblack_panel.cyblack_basic_sequence_panel_initialize_method(self);
        cyblack_basic_sequence_user_interaction_panel_initialize_qua_cyblack_user_interaction_panel_method(self);
        return self;
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt103$___CYBLACK_BASIC_SEQUENCE_USER_IN);
        return self;
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_get_lock_method(SubLObject self) {
        {
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            return lock;
        }
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_get_monitors_method(SubLObject self) {
        {
            SubLObject monitors = get_cyblack_basic_sequence_user_interaction_panel_monitors(self);
            return monitors;
        }
    }

    public static final SubLObject cyblack_basic_sequence_user_interaction_panel_set_monitors_method(SubLObject self, SubLObject new_monitors) {
        {
            SubLObject catch_var_for_cyblack_basic_sequence_user_interaction_panel_method = NIL;
            SubLObject monitors = get_cyblack_basic_sequence_user_interaction_panel_monitors(self);
            try {
                try {
                    monitors = new_monitors;
                    sublisp_throw($sym107$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_MET, new_monitors);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_sequence_user_interaction_panel_monitors(self, monitors);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_sequence_user_interaction_panel_method = Errors.handleThrowable(ccatch_env_var, $sym107$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_MET);
            }
            return catch_var_for_cyblack_basic_sequence_user_interaction_panel_method;
        }
    }

    public static final SubLObject get_cyblack_basic_user_interaction_cycpanel_monitors(SubLObject cyblack_basic_user_interaction_cycpanel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_user_interaction_cycpanel, EIGHTEEN_INTEGER, MONITORS);
    }

    public static final SubLObject set_cyblack_basic_user_interaction_cycpanel_monitors(SubLObject cyblack_basic_user_interaction_cycpanel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_user_interaction_cycpanel, value, EIGHTEEN_INTEGER, MONITORS);
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_iterate_over_all_monitors_internal_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_visited_panels = NIL;
            SubLObject template_panels = NIL;
            SubLObject template_current_panel = self;
            while (NIL != template_current_panel) {
                if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                    template_visited_panels = cons(template_current_panel, template_visited_panels);
                    methods.funcall_instance_method_with_1_args(template_current_panel, ITERATE_OVER_DIRECT_MONITORS_INTERNAL, monitor_visitor);
                    if (NIL == cyblack_monitor.cyblack_basic_monitor_visitor_continue_p_method(monitor_visitor, UNPROVIDED)) {
                        return monitor_visitor;
                    }
                }
                {
                    SubLObject cdolist_list_var = cyblack_panel_dispatch_functions.cyblack_panel_get_super_panels(template_current_panel);
                    SubLObject template_panel = NIL;
                    for (template_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_panel = cdolist_list_var.first()) {
                        if (NIL != cyblack_user_interaction_panel_p(template_panel)) {
                            template_panels = cons(template_panel, template_panels);
                        }
                    }
                }
                if (NIL != template_panels) {
                    template_current_panel = template_panels.first();
                    template_panels = template_panels.rest();
                } else {
                    template_current_panel = NIL;
                }
            } 
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_iterate_over_direct_monitors_internal_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_monitors = cyblack_basic_user_interaction_cycpanel_get_monitors_method(self);
            if (NIL == template_monitors) {
            }
            {
                SubLObject cdolist_list_var = template_monitors;
                SubLObject template_monitor = NIL;
                for (template_monitor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_monitor = cdolist_list_var.first()) {
                    if (NIL != methods.funcall_instance_method_with_0_args(template_monitor, IS_ACTIVE)) {
                        methods.funcall_instance_method_with_1_args(monitor_visitor, VISIT, template_monitor);
                        if (NIL == cyblack_monitor.cyblack_basic_monitor_visitor_continue_p_method(monitor_visitor, UNPROVIDED)) {
                            return monitor_visitor;
                        }
                    }
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_iterate_over_all_monitors_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_lock = cyblack_basic_user_interaction_cycpanel_get_lock_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                cyblack_basic_user_interaction_cycpanel_iterate_over_all_monitors_internal_method(self, monitor_visitor);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_iterate_over_direct_monitors_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_lock = cyblack_basic_user_interaction_cycpanel_get_lock_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                cyblack_basic_user_interaction_cycpanel_iterate_over_direct_monitors_internal_method(self, monitor_visitor);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_remove_monitor_method(SubLObject self, SubLObject monitor) {
        {
            SubLObject template_lock = cyblack_basic_user_interaction_cycpanel_get_lock_method(self);
            SubLObject template_monitors = cyblack_basic_user_interaction_cycpanel_get_monitors_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                template_monitors = delete(monitor, template_monitors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cyblack_basic_user_interaction_cycpanel_set_monitors_method(self, template_monitors);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_add_monitor_method(SubLObject self, SubLObject monitor) {
        {
            SubLObject template_lock = cyblack_basic_user_interaction_cycpanel_get_lock_method(self);
            SubLObject template_monitors = cyblack_basic_user_interaction_cycpanel_get_monitors_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == subl_promotions.memberP(monitor, template_monitors, UNPROVIDED, UNPROVIDED)) {
                    template_monitors = cons(monitor, template_monitors);
                    cyblack_basic_user_interaction_cycpanel_set_monitors_method(self, template_monitors);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_user_interaction_cycpanel_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject template_lock = cyblack_basic_user_interaction_cycpanel_get_lock_method(self);
                        SubLObject lock = template_lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock);
                            {
                                SubLObject template_monitor_visitor = object.new_object_instance(CYBLACK_REPORT_POSTING_MONITOR_VISITOR);
                                cyblack_object.set_cyblack_object_application(template_monitor_visitor, application);
                                cyblack_monitor.cyblack_report_posting_monitor_visitor_set_initial_state_method(template_monitor_visitor, cyblack_object.cyblack_object_get_application_method(self), self, posting);
                                cyblack_basic_user_interaction_cycpanel_iterate_over_all_monitors_method(self, template_monitor_visitor);
                                cyblack_panel.cyblack_basic_panel_add_posting_method(self, posting);
                            }
                        } finally {
                            if (NIL != release) {
                                release_lock(lock);
                            }
                        }
                        sublisp_throw($sym117$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_METHOD, posting);
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
                catch_var_for_cyblack_basic_user_interaction_cycpanel_method = Errors.handleThrowable(ccatch_env_var, $sym117$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_user_interaction_cycpanel_method;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_initialize_qua_cyblack_user_interaction_panel_method(SubLObject self) {
        cyblack_basic_user_interaction_cycpanel_set_monitors_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_user_interaction_cycpanel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_user_interaction_cycpanel_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, $sym121$USE_LOCAL_QUEUE_, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, DEFAULT_MT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, MONITORS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_p(SubLObject cyblack_basic_user_interaction_cycpanel) {
        return classes.subloop_instanceof_class(cyblack_basic_user_interaction_cycpanel, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL);
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_initialize_method(SubLObject self) {
        cyblack_cycpanel.cyblack_basic_cycpanel_initialize_method(self);
        cyblack_basic_user_interaction_cycpanel_initialize_qua_cyblack_user_interaction_panel_method(self);
        return self;
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_get_lock_method(SubLObject self) {
        {
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            return lock;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_get_monitors_method(SubLObject self) {
        {
            SubLObject monitors = get_cyblack_basic_user_interaction_cycpanel_monitors(self);
            return monitors;
        }
    }

    public static final SubLObject cyblack_basic_user_interaction_cycpanel_set_monitors_method(SubLObject self, SubLObject new_monitors) {
        {
            SubLObject catch_var_for_cyblack_basic_user_interaction_cycpanel_method = NIL;
            SubLObject monitors = get_cyblack_basic_user_interaction_cycpanel_monitors(self);
            try {
                try {
                    monitors = new_monitors;
                    sublisp_throw($sym127$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_METHOD, new_monitors);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_user_interaction_cycpanel_monitors(self, monitors);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_user_interaction_cycpanel_method = Errors.handleThrowable(ccatch_env_var, $sym127$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_METHOD);
            }
            return catch_var_for_cyblack_basic_user_interaction_cycpanel_method;
        }
    }

    public static final SubLObject get_cyblack_basic_forward_panel_user_interaction_cycpanel_monitors(SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_forward_panel_user_interaction_cycpanel, EIGHTEEN_INTEGER, MONITORS);
    }

    public static final SubLObject set_cyblack_basic_forward_panel_user_interaction_cycpanel_monitors(SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_forward_panel_user_interaction_cycpanel, value, EIGHTEEN_INTEGER, MONITORS);
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_iterate_over_all_monitors_internal_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_visited_panels = NIL;
            SubLObject template_panels = NIL;
            SubLObject template_current_panel = self;
            while (NIL != template_current_panel) {
                if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                    template_visited_panels = cons(template_current_panel, template_visited_panels);
                    methods.funcall_instance_method_with_1_args(template_current_panel, ITERATE_OVER_DIRECT_MONITORS_INTERNAL, monitor_visitor);
                    if (NIL == cyblack_monitor.cyblack_basic_monitor_visitor_continue_p_method(monitor_visitor, UNPROVIDED)) {
                        return monitor_visitor;
                    }
                }
                {
                    SubLObject cdolist_list_var = cyblack_panel_dispatch_functions.cyblack_panel_get_super_panels(template_current_panel);
                    SubLObject template_panel = NIL;
                    for (template_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_panel = cdolist_list_var.first()) {
                        if (NIL != cyblack_user_interaction_panel_p(template_panel)) {
                            template_panels = cons(template_panel, template_panels);
                        }
                    }
                }
                if (NIL != template_panels) {
                    template_current_panel = template_panels.first();
                    template_panels = template_panels.rest();
                } else {
                    template_current_panel = NIL;
                }
            } 
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_iterate_over_direct_monitors_internal_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_monitors = cyblack_basic_forward_panel_user_interaction_cycpanel_get_monitors_method(self);
            if (NIL == template_monitors) {
            }
            {
                SubLObject cdolist_list_var = template_monitors;
                SubLObject template_monitor = NIL;
                for (template_monitor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_monitor = cdolist_list_var.first()) {
                    if (NIL != methods.funcall_instance_method_with_0_args(template_monitor, IS_ACTIVE)) {
                        methods.funcall_instance_method_with_1_args(monitor_visitor, VISIT, template_monitor);
                        if (NIL == cyblack_monitor.cyblack_basic_monitor_visitor_continue_p_method(monitor_visitor, UNPROVIDED)) {
                            return monitor_visitor;
                        }
                    }
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_iterate_over_all_monitors_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_lock = cyblack_basic_forward_panel_user_interaction_cycpanel_get_lock_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                cyblack_basic_forward_panel_user_interaction_cycpanel_iterate_over_all_monitors_internal_method(self, monitor_visitor);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_iterate_over_direct_monitors_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_lock = cyblack_basic_forward_panel_user_interaction_cycpanel_get_lock_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                cyblack_basic_forward_panel_user_interaction_cycpanel_iterate_over_direct_monitors_internal_method(self, monitor_visitor);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_remove_monitor_method(SubLObject self, SubLObject monitor) {
        {
            SubLObject template_lock = cyblack_basic_forward_panel_user_interaction_cycpanel_get_lock_method(self);
            SubLObject template_monitors = cyblack_basic_forward_panel_user_interaction_cycpanel_get_monitors_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                template_monitors = delete(monitor, template_monitors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cyblack_basic_forward_panel_user_interaction_cycpanel_set_monitors_method(self, template_monitors);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor;
        }
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_add_monitor_method(SubLObject self, SubLObject monitor) {
        {
            SubLObject template_lock = cyblack_basic_forward_panel_user_interaction_cycpanel_get_lock_method(self);
            SubLObject template_monitors = cyblack_basic_forward_panel_user_interaction_cycpanel_get_monitors_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == subl_promotions.memberP(monitor, template_monitors, UNPROVIDED, UNPROVIDED)) {
                    template_monitors = cons(monitor, template_monitors);
                    cyblack_basic_forward_panel_user_interaction_cycpanel_set_monitors_method(self, template_monitors);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor;
        }
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_forward_panel_user_interaction_cycpanel_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject template_lock = cyblack_basic_forward_panel_user_interaction_cycpanel_get_lock_method(self);
                        SubLObject lock = template_lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock);
                            {
                                SubLObject template_monitor_visitor = object.new_object_instance(CYBLACK_REPORT_POSTING_MONITOR_VISITOR);
                                cyblack_object.set_cyblack_object_application(template_monitor_visitor, application);
                                cyblack_monitor.cyblack_report_posting_monitor_visitor_set_initial_state_method(template_monitor_visitor, cyblack_object.cyblack_object_get_application_method(self), self, posting);
                                cyblack_basic_forward_panel_user_interaction_cycpanel_iterate_over_all_monitors_method(self, template_monitor_visitor);
                                cyblack_panel.cyblack_basic_panel_add_posting_method(self, posting);
                            }
                        } finally {
                            if (NIL != release) {
                                release_lock(lock);
                            }
                        }
                        sublisp_throw($sym137$OUTER_CATCH_FOR_CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCP, posting);
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
                catch_var_for_cyblack_basic_forward_panel_user_interaction_cycpanel_method = Errors.handleThrowable(ccatch_env_var, $sym137$OUTER_CATCH_FOR_CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCP);
            }
            return catch_var_for_cyblack_basic_forward_panel_user_interaction_cycpanel_method;
        }
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_initialize_qua_cyblack_user_interaction_panel_method(SubLObject self) {
        cyblack_basic_forward_panel_user_interaction_cycpanel_set_monitors_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_forward_panel_user_interaction_cycpanel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_forward_panel_user_interaction_cycpanel_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, $sym121$USE_LOCAL_QUEUE_, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, DEFAULT_MT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, MONITORS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_p(SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel) {
        return classes.subloop_instanceof_class(cyblack_basic_forward_panel_user_interaction_cycpanel, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL);
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_initialize_method(SubLObject self) {
        cyblack_cycpanel.cyblack_basic_cycpanel_initialize_method(self);
        cyblack_basic_forward_panel_user_interaction_cycpanel_initialize_qua_cyblack_user_interaction_panel_method(self);
        return self;
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_get_lock_method(SubLObject self) {
        {
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            return lock;
        }
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_get_monitors_method(SubLObject self) {
        {
            SubLObject monitors = get_cyblack_basic_forward_panel_user_interaction_cycpanel_monitors(self);
            return monitors;
        }
    }

    public static final SubLObject cyblack_basic_forward_panel_user_interaction_cycpanel_set_monitors_method(SubLObject self, SubLObject new_monitors) {
        {
            SubLObject catch_var_for_cyblack_basic_forward_panel_user_interaction_cycpanel_method = NIL;
            SubLObject monitors = get_cyblack_basic_forward_panel_user_interaction_cycpanel_monitors(self);
            try {
                try {
                    monitors = new_monitors;
                    sublisp_throw($sym145$OUTER_CATCH_FOR_CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCP, new_monitors);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_forward_panel_user_interaction_cycpanel_monitors(self, monitors);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_forward_panel_user_interaction_cycpanel_method = Errors.handleThrowable(ccatch_env_var, $sym145$OUTER_CATCH_FOR_CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCP);
            }
            return catch_var_for_cyblack_basic_forward_panel_user_interaction_cycpanel_method;
        }
    }

    public static final SubLObject get_cyblack_basic_backward_panel_user_interaction_cycpanel_monitors(SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_backward_panel_user_interaction_cycpanel, $int$24, MONITORS);
    }

    public static final SubLObject set_cyblack_basic_backward_panel_user_interaction_cycpanel_monitors(SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_backward_panel_user_interaction_cycpanel, value, $int$24, MONITORS);
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_iterate_over_all_monitors_internal_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_visited_panels = NIL;
            SubLObject template_panels = NIL;
            SubLObject template_current_panel = self;
            while (NIL != template_current_panel) {
                if (NIL == subl_promotions.memberP(template_current_panel, template_visited_panels, UNPROVIDED, UNPROVIDED)) {
                    template_visited_panels = cons(template_current_panel, template_visited_panels);
                    methods.funcall_instance_method_with_1_args(template_current_panel, ITERATE_OVER_DIRECT_MONITORS_INTERNAL, monitor_visitor);
                    if (NIL == cyblack_monitor.cyblack_basic_monitor_visitor_continue_p_method(monitor_visitor, UNPROVIDED)) {
                        return monitor_visitor;
                    }
                }
                {
                    SubLObject cdolist_list_var = cyblack_panel_dispatch_functions.cyblack_panel_get_super_panels(template_current_panel);
                    SubLObject template_panel = NIL;
                    for (template_panel = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_panel = cdolist_list_var.first()) {
                        if (NIL != cyblack_user_interaction_panel_p(template_panel)) {
                            template_panels = cons(template_panel, template_panels);
                        }
                    }
                }
                if (NIL != template_panels) {
                    template_current_panel = template_panels.first();
                    template_panels = template_panels.rest();
                } else {
                    template_current_panel = NIL;
                }
            } 
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_iterate_over_direct_monitors_internal_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_monitors = cyblack_basic_backward_panel_user_interaction_cycpanel_get_monitors_method(self);
            if (NIL == template_monitors) {
            }
            {
                SubLObject cdolist_list_var = template_monitors;
                SubLObject template_monitor = NIL;
                for (template_monitor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_monitor = cdolist_list_var.first()) {
                    if (NIL != methods.funcall_instance_method_with_0_args(template_monitor, IS_ACTIVE)) {
                        methods.funcall_instance_method_with_1_args(monitor_visitor, VISIT, template_monitor);
                        if (NIL == cyblack_monitor.cyblack_basic_monitor_visitor_continue_p_method(monitor_visitor, UNPROVIDED)) {
                            return monitor_visitor;
                        }
                    }
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_iterate_over_all_monitors_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_lock = cyblack_basic_backward_panel_user_interaction_cycpanel_get_lock_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                cyblack_basic_backward_panel_user_interaction_cycpanel_iterate_over_all_monitors_internal_method(self, monitor_visitor);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_iterate_over_direct_monitors_method(SubLObject self, SubLObject monitor_visitor) {
        {
            SubLObject template_lock = cyblack_basic_backward_panel_user_interaction_cycpanel_get_lock_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                cyblack_basic_backward_panel_user_interaction_cycpanel_iterate_over_direct_monitors_internal_method(self, monitor_visitor);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor_visitor;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_remove_monitor_method(SubLObject self, SubLObject monitor) {
        {
            SubLObject template_lock = cyblack_basic_backward_panel_user_interaction_cycpanel_get_lock_method(self);
            SubLObject template_monitors = cyblack_basic_backward_panel_user_interaction_cycpanel_get_monitors_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                template_monitors = delete(monitor, template_monitors, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cyblack_basic_backward_panel_user_interaction_cycpanel_set_monitors_method(self, template_monitors);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_add_monitor_method(SubLObject self, SubLObject monitor) {
        {
            SubLObject template_lock = cyblack_basic_backward_panel_user_interaction_cycpanel_get_lock_method(self);
            SubLObject template_monitors = cyblack_basic_backward_panel_user_interaction_cycpanel_get_monitors_method(self);
            SubLObject lock = template_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == subl_promotions.memberP(monitor, template_monitors, UNPROVIDED, UNPROVIDED)) {
                    template_monitors = cons(monitor, template_monitors);
                    cyblack_basic_backward_panel_user_interaction_cycpanel_set_monitors_method(self, template_monitors);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return monitor;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            SubLObject catch_var_for_cyblack_basic_backward_panel_user_interaction_cycpanel_method = NIL;
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            try {
                try {
                    {
                        SubLObject template_lock = cyblack_basic_backward_panel_user_interaction_cycpanel_get_lock_method(self);
                        SubLObject lock = template_lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock);
                            {
                                SubLObject template_monitor_visitor = object.new_object_instance(CYBLACK_REPORT_POSTING_MONITOR_VISITOR);
                                cyblack_object.set_cyblack_object_application(template_monitor_visitor, application);
                                cyblack_monitor.cyblack_report_posting_monitor_visitor_set_initial_state_method(template_monitor_visitor, cyblack_object.cyblack_object_get_application_method(self), self, posting);
                                cyblack_basic_backward_panel_user_interaction_cycpanel_iterate_over_all_monitors_method(self, template_monitor_visitor);
                                cyblack_cycpanel.cyblack_basic_backward_panel_add_posting_method(self, posting);
                            }
                        } finally {
                            if (NIL != release) {
                                release_lock(lock);
                            }
                        }
                        sublisp_throw($sym156$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYC, posting);
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
                catch_var_for_cyblack_basic_backward_panel_user_interaction_cycpanel_method = Errors.handleThrowable(ccatch_env_var, $sym156$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYC);
            }
            return catch_var_for_cyblack_basic_backward_panel_user_interaction_cycpanel_method;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_initialize_qua_cyblack_user_interaction_panel_method(SubLObject self) {
        cyblack_basic_backward_panel_user_interaction_cycpanel_set_monitors_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_backward_panel_user_interaction_cycpanel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_backward_panel_user_interaction_cycpanel_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, $sym121$USE_LOCAL_QUEUE_, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_CYCPANEL, DEFAULT_MT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, CYC_BACKCHAIN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, CYC_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, CYC_TIME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, CYC_DEPTH, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, MOST_RECENT_QUERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL, QUERY_ACTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, MONITORS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_p(SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel) {
        return classes.subloop_instanceof_class(cyblack_basic_backward_panel_user_interaction_cycpanel, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL);
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_initialize_method(SubLObject self) {
        cyblack_cycpanel.cyblack_basic_backward_panel_initialize_method(self);
        cyblack_basic_backward_panel_user_interaction_cycpanel_initialize_qua_cyblack_user_interaction_panel_method(self);
        return self;
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_get_lock_method(SubLObject self) {
        {
            SubLObject lock = cyblack_lockable.get_cyblack_basic_lockable_lock(self);
            return lock;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_get_monitors_method(SubLObject self) {
        {
            SubLObject monitors = get_cyblack_basic_backward_panel_user_interaction_cycpanel_monitors(self);
            return monitors;
        }
    }

    public static final SubLObject cyblack_basic_backward_panel_user_interaction_cycpanel_set_monitors_method(SubLObject self, SubLObject new_monitors) {
        {
            SubLObject catch_var_for_cyblack_basic_backward_panel_user_interaction_cycpanel_method = NIL;
            SubLObject monitors = get_cyblack_basic_backward_panel_user_interaction_cycpanel_monitors(self);
            try {
                try {
                    monitors = new_monitors;
                    sublisp_throw($sym170$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYC, new_monitors);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_backward_panel_user_interaction_cycpanel_monitors(self, monitors);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_backward_panel_user_interaction_cycpanel_method = Errors.handleThrowable(ccatch_env_var, $sym170$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYC);
            }
            return catch_var_for_cyblack_basic_backward_panel_user_interaction_cycpanel_method;
        }
    }

    public static final SubLObject declare_cyblack_ui_panel_file() {
        declareFunction("cyblack_user_interaction_panel_p", "CYBLACK-USER-INTERACTION-PANEL-P", 1, 0, false);
        declareFunction("get_cyblack_basic_user_interaction_panel_monitors", "GET-CYBLACK-BASIC-USER-INTERACTION-PANEL-MONITORS", 1, 0, false);
        declareFunction("set_cyblack_basic_user_interaction_panel_monitors", "SET-CYBLACK-BASIC-USER-INTERACTION-PANEL-MONITORS", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_iterate_over_all_monitors_internal_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-ITERATE-OVER-ALL-MONITORS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_iterate_over_direct_monitors_internal_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-ITERATE-OVER-DIRECT-MONITORS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_iterate_over_all_monitors_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-ITERATE-OVER-ALL-MONITORS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_iterate_over_direct_monitors_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-ITERATE-OVER-DIRECT-MONITORS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_remove_monitor_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-REMOVE-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_add_monitor_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-ADD-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_add_posting_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_initialize_qua_cyblack_user_interaction_panel_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_user_interaction_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-USER-INTERACTION-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_user_interaction_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-USER-INTERACTION-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_p", "CYBLACK-BASIC-USER-INTERACTION-PANEL-P", 1, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_initialize_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_get_lock_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-GET-LOCK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_get_monitors_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-GET-MONITORS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_user_interaction_panel_set_monitors_method", "CYBLACK-BASIC-USER-INTERACTION-PANEL-SET-MONITORS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_basic_sequence_user_interaction_panel_monitors", "GET-CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-MONITORS", 1, 0, false);
        declareFunction("set_cyblack_basic_sequence_user_interaction_panel_monitors", "SET-CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-MONITORS", 2, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_iterate_over_all_monitors_internal_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ITERATE-OVER-ALL-MONITORS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_iterate_over_direct_monitors_internal_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ITERATE-OVER-DIRECT-MONITORS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_iterate_over_all_monitors_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ITERATE-OVER-ALL-MONITORS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_iterate_over_direct_monitors_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ITERATE-OVER-DIRECT-MONITORS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_remove_monitor_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-REMOVE-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_add_monitor_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ADD-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_add_posting_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_initialize_qua_cyblack_user_interaction_panel_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_sequence_user_interaction_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_sequence_user_interaction_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_p", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-P", 1, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_initialize_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_print_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_get_lock_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-GET-LOCK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_get_monitors_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-GET-MONITORS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_sequence_user_interaction_panel_set_monitors_method", "CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-SET-MONITORS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_basic_user_interaction_cycpanel_monitors", "GET-CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-MONITORS", 1, 0, false);
        declareFunction("set_cyblack_basic_user_interaction_cycpanel_monitors", "SET-CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-MONITORS", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_iterate_over_all_monitors_internal_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_iterate_over_direct_monitors_internal_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_iterate_over_all_monitors_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_iterate_over_direct_monitors_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_remove_monitor_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-REMOVE-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_add_monitor_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ADD-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_add_posting_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_initialize_qua_cyblack_user_interaction_panel_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_user_interaction_cycpanel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_user_interaction_cycpanel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_p", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-P", 1, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_initialize_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_get_lock_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-GET-LOCK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_get_monitors_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-GET-MONITORS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_user_interaction_cycpanel_set_monitors_method", "CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-SET-MONITORS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_basic_forward_panel_user_interaction_cycpanel_monitors", "GET-CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-MONITORS", 1, 0, false);
        declareFunction("set_cyblack_basic_forward_panel_user_interaction_cycpanel_monitors", "SET-CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-MONITORS", 2, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_iterate_over_all_monitors_internal_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_iterate_over_direct_monitors_internal_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_iterate_over_all_monitors_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_iterate_over_direct_monitors_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_remove_monitor_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-REMOVE-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_add_monitor_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ADD-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_add_posting_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_initialize_qua_cyblack_user_interaction_panel_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_forward_panel_user_interaction_cycpanel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_forward_panel_user_interaction_cycpanel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_p", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-P", 1, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_initialize_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_get_lock_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-GET-LOCK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_get_monitors_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-GET-MONITORS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_forward_panel_user_interaction_cycpanel_set_monitors_method", "CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-SET-MONITORS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_basic_backward_panel_user_interaction_cycpanel_monitors", "GET-CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-MONITORS", 1, 0, false);
        declareFunction("set_cyblack_basic_backward_panel_user_interaction_cycpanel_monitors", "SET-CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-MONITORS", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_iterate_over_all_monitors_internal_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_iterate_over_direct_monitors_internal_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_iterate_over_all_monitors_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_iterate_over_direct_monitors_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_remove_monitor_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-REMOVE-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_add_monitor_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ADD-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_add_posting_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ADD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_initialize_qua_cyblack_user_interaction_panel_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_backward_panel_user_interaction_cycpanel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_backward_panel_user_interaction_cycpanel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_p", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-P", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_initialize_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_get_lock_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-GET-LOCK-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_get_monitors_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-GET-MONITORS-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_backward_panel_user_interaction_cycpanel_set_monitors_method", "CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-SET-MONITORS-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_ui_panel_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_ui_panel_file() {
                interfaces.new_interface(CYBLACK_USER_INTERACTION_PANEL, NIL, NIL, $list_alt1);
        interfaces.interfaces_add_interface_instance_method(INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL, CYBLACK_USER_INTERACTION_PANEL, $list_alt3, NIL, $list_alt4);
        interfaces.interfaces_add_interface_instance_method(ADD_POSTING, CYBLACK_USER_INTERACTION_PANEL, $list_alt3, $list_alt6, $list_alt7);
        interfaces.interfaces_add_interface_instance_method(ADD_MONITOR, CYBLACK_USER_INTERACTION_PANEL, $list_alt9, $list_alt10, $list_alt11);
        interfaces.interfaces_add_interface_instance_method(REMOVE_MONITOR, CYBLACK_USER_INTERACTION_PANEL, $list_alt9, $list_alt10, $list_alt13);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_DIRECT_MONITORS, CYBLACK_USER_INTERACTION_PANEL, $list_alt9, $list_alt15, $list_alt16);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_MONITORS, CYBLACK_USER_INTERACTION_PANEL, $list_alt9, $list_alt15, $list_alt18);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_DIRECT_MONITORS_INTERNAL, CYBLACK_USER_INTERACTION_PANEL, $list_alt3, $list_alt15, $list_alt20);
        interfaces.interfaces_add_interface_instance_method(ITERATE_OVER_ALL_MONITORS_INTERNAL, CYBLACK_USER_INTERACTION_PANEL, $list_alt3, $list_alt15, $list_alt22);
        classes.subloop_new_class(CYBLACK_BASIC_USER_INTERACTION_PANEL, CYBLACK_BASIC_PANEL, $list_alt25, NIL, $list_alt26);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_USER_INTERACTION_PANEL, NIL);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_MONITORS_INTERNAL, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt3, $list_alt15, $list_alt22);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, ITERATE_OVER_ALL_MONITORS_INTERNAL, $sym28$CYBLACK_BASIC_USER_INTERACTION_PANEL_ITERATE_OVER_ALL_MONITORS_IN);
        methods.methods_incorporate_instance_method(ITERATE_OVER_DIRECT_MONITORS_INTERNAL, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt3, $list_alt15, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, ITERATE_OVER_DIRECT_MONITORS_INTERNAL, $sym31$CYBLACK_BASIC_USER_INTERACTION_PANEL_ITERATE_OVER_DIRECT_MONITORS);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_MONITORS, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt9, $list_alt15, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, ITERATE_OVER_ALL_MONITORS, $sym32$CYBLACK_BASIC_USER_INTERACTION_PANEL_ITERATE_OVER_ALL_MONITORS_ME);
        methods.methods_incorporate_instance_method(ITERATE_OVER_DIRECT_MONITORS, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt9, $list_alt15, $list_alt16);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, ITERATE_OVER_DIRECT_MONITORS, $sym33$CYBLACK_BASIC_USER_INTERACTION_PANEL_ITERATE_OVER_DIRECT_MONITORS);
        methods.methods_incorporate_instance_method(REMOVE_MONITOR, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt9, $list_alt10, $list_alt13);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, REMOVE_MONITOR, CYBLACK_BASIC_USER_INTERACTION_PANEL_REMOVE_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(ADD_MONITOR, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt9, $list_alt10, $list_alt11);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, ADD_MONITOR, CYBLACK_BASIC_USER_INTERACTION_PANEL_ADD_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt3, $list_alt6, $list_alt7);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, ADD_POSTING, CYBLACK_BASIC_USER_INTERACTION_PANEL_ADD_POSTING_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt3, NIL, $list_alt4);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL, $sym39$CYBLACK_BASIC_USER_INTERACTION_PANEL_INITIALIZE_QUA_CYBLACK_USER_);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_USER_INTERACTION_PANEL, $sym42$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_USER_INTERACTION_PANEL_);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_USER_INTERACTION_PANEL, $sym62$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_USER_INTERACTION_PANEL_);
        subloop_reserved_initialize_cyblack_basic_user_interaction_panel_class(CYBLACK_BASIC_USER_INTERACTION_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt3, NIL, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, INITIALIZE, CYBLACK_BASIC_USER_INTERACTION_PANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_LOCK, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt67, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, GET_LOCK, CYBLACK_BASIC_USER_INTERACTION_PANEL_GET_LOCK_METHOD);
        methods.methods_incorporate_instance_method(GET_MONITORS, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt67, NIL, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, GET_MONITORS, CYBLACK_BASIC_USER_INTERACTION_PANEL_GET_MONITORS_METHOD);
        methods.methods_incorporate_instance_method(SET_MONITORS, CYBLACK_BASIC_USER_INTERACTION_PANEL, $list_alt3, $list_alt74, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_PANEL, SET_MONITORS, CYBLACK_BASIC_USER_INTERACTION_PANEL_SET_MONITORS_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, CYBLACK_BASIC_SEQUENCE_PANEL, $list_alt25, NIL, $list_alt80);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, NIL);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_MONITORS_INTERNAL, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt3, $list_alt15, $list_alt22);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, ITERATE_OVER_ALL_MONITORS_INTERNAL, $sym81$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ITERATE_OVER_ALL_MO);
        methods.methods_incorporate_instance_method(ITERATE_OVER_DIRECT_MONITORS_INTERNAL, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt3, $list_alt15, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, ITERATE_OVER_DIRECT_MONITORS_INTERNAL, $sym82$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ITERATE_OVER_DIRECT);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_MONITORS, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt9, $list_alt15, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, ITERATE_OVER_ALL_MONITORS, $sym83$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ITERATE_OVER_ALL_MO);
        methods.methods_incorporate_instance_method(ITERATE_OVER_DIRECT_MONITORS, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt9, $list_alt15, $list_alt16);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, ITERATE_OVER_DIRECT_MONITORS, $sym84$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ITERATE_OVER_DIRECT);
        methods.methods_incorporate_instance_method(REMOVE_MONITOR, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt9, $list_alt10, $list_alt13);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, REMOVE_MONITOR, $sym85$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_REMOVE_MONITOR_METH);
        methods.methods_incorporate_instance_method(ADD_MONITOR, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt9, $list_alt10, $list_alt11);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, ADD_MONITOR, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ADD_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt3, $list_alt6, $list_alt7);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, ADD_POSTING, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ADD_POSTING_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt3, NIL, $list_alt4);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL, $sym89$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_INITIALIZE_QUA_CYBL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $sym90$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SEQUENCE_USER_INTERACTI);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $sym97$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SEQUENCE_USER_INTERACTI);
        subloop_reserved_initialize_cyblack_basic_sequence_user_interaction_panel_class(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt98, NIL, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, INITIALIZE, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt9, $list_alt101, $list_alt102);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, PRINT, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_LOCK, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt67, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, GET_LOCK, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_GET_LOCK_METHOD);
        methods.methods_incorporate_instance_method(GET_MONITORS, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt67, NIL, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, GET_MONITORS, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_GET_MONITORS_METHOD);
        methods.methods_incorporate_instance_method(SET_MONITORS, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, $list_alt3, $list_alt74, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL, SET_MONITORS, CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_SET_MONITORS_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, CYBLACK_BASIC_CYCPANEL, $list_alt25, NIL, $list_alt26);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, NIL);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_MONITORS_INTERNAL, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt15, $list_alt22);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, ITERATE_OVER_ALL_MONITORS_INTERNAL, $sym111$CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ITERATE_OVER_ALL_MONITORS);
        methods.methods_incorporate_instance_method(ITERATE_OVER_DIRECT_MONITORS_INTERNAL, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt15, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, ITERATE_OVER_DIRECT_MONITORS_INTERNAL, $sym112$CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ITERATE_OVER_DIRECT_MONIT);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_MONITORS, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt15, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, ITERATE_OVER_ALL_MONITORS, $sym113$CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ITERATE_OVER_ALL_MONITORS);
        methods.methods_incorporate_instance_method(ITERATE_OVER_DIRECT_MONITORS, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt15, $list_alt16);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, ITERATE_OVER_DIRECT_MONITORS, $sym114$CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ITERATE_OVER_DIRECT_MONIT);
        methods.methods_incorporate_instance_method(REMOVE_MONITOR, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt10, $list_alt13);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, REMOVE_MONITOR, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_REMOVE_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(ADD_MONITOR, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt10, $list_alt11);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, ADD_MONITOR, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ADD_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt6, $list_alt7);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, ADD_POSTING, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ADD_POSTING_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt3, NIL, $list_alt4);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL, $sym119$CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_INITIALIZE_QUA_CYBLACK_US);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $sym120$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_USER_INTERACTION_CYCPAN);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $sym123$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_USER_INTERACTION_CYCPAN);
        subloop_reserved_initialize_cyblack_basic_user_interaction_cycpanel_class(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt3, NIL, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, INITIALIZE, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_LOCK, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt67, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, GET_LOCK, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_GET_LOCK_METHOD);
        methods.methods_incorporate_instance_method(GET_MONITORS, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt67, NIL, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, GET_MONITORS, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_GET_MONITORS_METHOD);
        methods.methods_incorporate_instance_method(SET_MONITORS, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt74, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_BASIC_USER_INTERACTION_CYCPANEL, SET_MONITORS, CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_SET_MONITORS_METHOD);
        classes.subloop_new_class(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, CYBLACK_BASIC_FORWARD_PANEL, $list_alt25, NIL, $list_alt26);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, NIL);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_MONITORS_INTERNAL, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt15, $list_alt22);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, ITERATE_OVER_ALL_MONITORS_INTERNAL, $sym131$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OVE);
        methods.methods_incorporate_instance_method(ITERATE_OVER_DIRECT_MONITORS_INTERNAL, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt15, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, ITERATE_OVER_DIRECT_MONITORS_INTERNAL, $sym132$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OVE);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_MONITORS, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt15, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, ITERATE_OVER_ALL_MONITORS, $sym133$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OVE);
        methods.methods_incorporate_instance_method(ITERATE_OVER_DIRECT_MONITORS, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt15, $list_alt16);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, ITERATE_OVER_DIRECT_MONITORS, $sym134$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OVE);
        methods.methods_incorporate_instance_method(REMOVE_MONITOR, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt10, $list_alt13);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, REMOVE_MONITOR, $sym135$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_REMOVE_MONI);
        methods.methods_incorporate_instance_method(ADD_MONITOR, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt10, $list_alt11);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, ADD_MONITOR, $sym136$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ADD_MONITOR);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt6, $list_alt7);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, ADD_POSTING, $sym138$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ADD_POSTING);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, NIL, $list_alt4);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL, $sym139$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_INITIALIZE_);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $sym140$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_FORWARD_PANEL_USER_INTE);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $sym141$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_FORWARD_PANEL_USER_INTE);
        subloop_reserved_initialize_cyblack_basic_forward_panel_user_interaction_cycpanel_class(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, NIL, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, INITIALIZE, $sym142$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_INITIALIZE_);
        methods.methods_incorporate_instance_method(GET_LOCK, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt67, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, GET_LOCK, $sym143$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_GET_LOCK_ME);
        methods.methods_incorporate_instance_method(GET_MONITORS, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt67, NIL, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, GET_MONITORS, $sym144$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_GET_MONITOR);
        methods.methods_incorporate_instance_method(SET_MONITORS, CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt74, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL, SET_MONITORS, $sym146$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_SET_MONITOR);
        classes.subloop_new_class(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, CYBLACK_BASIC_BACKWARD_PANEL, $list_alt25, NIL, $list_alt26);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, NIL);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_MONITORS_INTERNAL, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt15, $list_alt22);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, ITERATE_OVER_ALL_MONITORS_INTERNAL, $sym150$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OV);
        methods.methods_incorporate_instance_method(ITERATE_OVER_DIRECT_MONITORS_INTERNAL, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt15, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, ITERATE_OVER_DIRECT_MONITORS_INTERNAL, $sym151$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OV);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_MONITORS, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt15, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, ITERATE_OVER_ALL_MONITORS, $sym152$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OV);
        methods.methods_incorporate_instance_method(ITERATE_OVER_DIRECT_MONITORS, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt15, $list_alt16);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, ITERATE_OVER_DIRECT_MONITORS, $sym153$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OV);
        methods.methods_incorporate_instance_method(REMOVE_MONITOR, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt10, $list_alt13);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, REMOVE_MONITOR, $sym154$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_REMOVE_MON);
        methods.methods_incorporate_instance_method(ADD_MONITOR, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt9, $list_alt10, $list_alt11);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, ADD_MONITOR, $sym155$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ADD_MONITO);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt6, $list_alt7);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, ADD_POSTING, $sym157$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ADD_POSTIN);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, NIL, $list_alt4);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL, $sym158$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_INITIALIZE);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $sym159$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BACKWARD_PANEL_USER_INT);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $sym166$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BACKWARD_PANEL_USER_INT);
        subloop_reserved_initialize_cyblack_basic_backward_panel_user_interaction_cycpanel_class(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, NIL, $list_alt64);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, INITIALIZE, $sym167$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_INITIALIZE);
        methods.methods_incorporate_instance_method(GET_LOCK, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt67, NIL, $list_alt68);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, GET_LOCK, $sym168$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_GET_LOCK_M);
        methods.methods_incorporate_instance_method(GET_MONITORS, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt67, NIL, $list_alt71);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, GET_MONITORS, $sym169$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_GET_MONITO);
        methods.methods_incorporate_instance_method(SET_MONITORS, CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, $list_alt3, $list_alt74, $list_alt75);
        methods.subloop_register_instance_method(CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL, SET_MONITORS, $sym171$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_SET_MONITO);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_USER_INTERACTION_PANEL = makeSymbol("CYBLACK-USER-INTERACTION-PANEL");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LOCK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MONITORS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MONITORS"), list(makeSymbol("NEW-MONITORS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MONITOR"), list(makeSymbol("MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-MONITOR"), list(makeSymbol("MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-DIRECT-MONITORS"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-MONITORS"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-DIRECT-MONITORS-INTERNAL"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-MONITORS-INTERNAL"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("PROTECTED")) });

    private static final SubLSymbol INITIALIZE_QUA_CYBLACK_USER_INTERACTION_PANEL = makeSymbol("INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL");

    static private final SubLList $list_alt3 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt4 = list(list(makeSymbol("SET-MONITORS"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));



    static private final SubLList $list_alt6 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt7 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LOCK"), list(makeSymbol("GET-LOCK"), makeSymbol("SELF")))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("TEMPLATE-LOCK")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-MONITOR-VISITOR"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-REPORT-POSTING-MONITOR-VISITOR"))))), list(makeSymbol("SET-CYBLACK-OBJECT-APPLICATION"), makeSymbol("TEMPLATE-MONITOR-VISITOR"), makeSymbol("APPLICATION")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-INITIAL-STATE"), makeSymbol("CYBLACK-REPORT-POSTING-MONITOR-VISITOR")), makeSymbol("TEMPLATE-MONITOR-VISITOR"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("ITERATE-OVER-ALL-MONITORS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-MONITOR-VISITOR")), list(makeSymbol("ADD-POSTING"), makeSymbol("SUPER"), makeSymbol("POSTING"))))), list(RET, makeSymbol("POSTING")));

    private static final SubLSymbol ADD_MONITOR = makeSymbol("ADD-MONITOR");

    static private final SubLList $list_alt9 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt10 = list(makeSymbol("MONITOR"));

    static private final SubLList $list_alt11 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-MONITOR-P"), makeSymbol("MONITOR")), makeString("(ADD-MONITOR ~S): ~S is not an instance of CYBLACK-MONITOR."), makeSymbol("SELF"), makeSymbol("MONITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LOCK"), list(makeSymbol("GET-LOCK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-MONITORS"), list(makeSymbol("GET-MONITORS"), makeSymbol("SELF")))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("TEMPLATE-LOCK")), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("MONITOR"), makeSymbol("TEMPLATE-MONITORS")), list(makeSymbol("CPUSH"), makeSymbol("MONITOR"), makeSymbol("TEMPLATE-MONITORS")), list(makeSymbol("SET-MONITORS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-MONITORS"))))), list(RET, makeSymbol("MONITOR")));

    private static final SubLSymbol REMOVE_MONITOR = makeSymbol("REMOVE-MONITOR");

    static private final SubLList $list_alt13 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-MONITOR-P"), makeSymbol("MONITOR")), makeString("(REMOVE-MONITOR ~S): ~S is not an instance of CYBLACK-MONITOR."), makeSymbol("SELF"), makeSymbol("MONITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LOCK"), list(makeSymbol("GET-LOCK"), makeSymbol("SELF"))), list(makeSymbol("TEMPLATE-MONITORS"), list(makeSymbol("GET-MONITORS"), makeSymbol("SELF")))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("TEMPLATE-LOCK")), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-MONITORS"), list(makeSymbol("DELETE"), makeSymbol("MONITOR"), makeSymbol("TEMPLATE-MONITORS"))), list(makeSymbol("SET-MONITORS"), makeSymbol("SELF"), makeSymbol("TEMPLATE-MONITORS")))), list(RET, makeSymbol("MONITOR")));

    private static final SubLSymbol ITERATE_OVER_DIRECT_MONITORS = makeSymbol("ITERATE-OVER-DIRECT-MONITORS");

    static private final SubLList $list_alt15 = list(makeSymbol("MONITOR-VISITOR"));

    static private final SubLList $list_alt16 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-MONITOR-VISITOR-P"), makeSymbol("MONITOR-VISITOR")), makeString("(ITERATE-OVER-DIRECT-MONITORS ~S): ~S is not an instance of CYBLACK-MONITOR-VISITOR."), makeSymbol("SELF"), makeSymbol("MONITOR-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LOCK"), list(makeSymbol("GET-LOCK"), makeSymbol("SELF")))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("TEMPLATE-LOCK")), list(makeSymbol("ITERATE-OVER-DIRECT-MONITORS-INTERNAL"), makeSymbol("SELF"), makeSymbol("MONITOR-VISITOR")))), list(RET, makeSymbol("MONITOR-VISITOR")));

    private static final SubLSymbol ITERATE_OVER_ALL_MONITORS = makeSymbol("ITERATE-OVER-ALL-MONITORS");

    static private final SubLList $list_alt18 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-MONITOR-VISITOR-P"), makeSymbol("MONITOR-VISITOR")), makeString("(ITERATE-OVER-ALL-MONITORS ~S): ~S is not an instance of CYBLACK-MONITOR-VISITOR."), makeSymbol("SELF"), makeSymbol("MONITOR-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-LOCK"), list(makeSymbol("GET-LOCK"), makeSymbol("SELF")))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("TEMPLATE-LOCK")), list(makeSymbol("ITERATE-OVER-ALL-MONITORS-INTERNAL"), makeSymbol("SELF"), makeSymbol("MONITOR-VISITOR"))), list(RET, makeSymbol("MONITOR-VISITOR"))));

    private static final SubLSymbol ITERATE_OVER_DIRECT_MONITORS_INTERNAL = makeSymbol("ITERATE-OVER-DIRECT-MONITORS-INTERNAL");

    static private final SubLList $list_alt20 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-MONITORS"), list(makeSymbol("GET-MONITORS"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("TEMPLATE-MONITORS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-MONITOR"), makeSymbol("TEMPLATE-MONITORS")), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-MONITOR"), list(QUOTE, makeSymbol("IS-ACTIVE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("MONITOR-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("TEMPLATE-MONITOR")), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CONTINUE-P"), makeSymbol("CYBLACK-BASIC-MONITOR-VISITOR")), makeSymbol("MONITOR-VISITOR")), list(RET, makeSymbol("MONITOR-VISITOR")))))), list(RET, makeSymbol("MONITOR-VISITOR")));

    private static final SubLSymbol ITERATE_OVER_ALL_MONITORS_INTERNAL = makeSymbol("ITERATE-OVER-ALL-MONITORS-INTERNAL");

    static private final SubLList $list_alt22 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-VISITED-PANELS"), NIL), list(makeSymbol("TEMPLATE-PANELS"), NIL), list(makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("SELF"))), list(makeSymbol("WHILE"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-CURRENT-PANEL"), makeSymbol("TEMPLATE-VISITED-PANELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(QUOTE, makeSymbol("ITERATE-OVER-DIRECT-MONITORS-INTERNAL")), makeSymbol("MONITOR-VISITOR")), list(makeSymbol("PUNLESS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("CONTINUE-P"), makeSymbol("CYBLACK-BASIC-MONITOR-VISITOR")), makeSymbol("MONITOR-VISITOR")), list(RET, makeSymbol("MONITOR-VISITOR")))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-PANEL"), list(makeSymbol("CYBLACK-PANEL-GET-SUPER-PANELS"), makeSymbol("TEMPLATE-CURRENT-PANEL"))), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-USER-INTERACTION-PANEL-P"), makeSymbol("TEMPLATE-PANEL")), list(makeSymbol("CPUSH"), makeSymbol("TEMPLATE-PANEL"), makeSymbol("TEMPLATE-PANELS")))), list(makeSymbol("PIF"), makeSymbol("TEMPLATE-PANELS"), list(makeSymbol("PROGN"), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("TEMPLATE-PANELS"))), list(makeSymbol("CPOP"), makeSymbol("TEMPLATE-PANELS"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-CURRENT-PANEL"), NIL)))), list(RET, makeSymbol("MONITOR-VISITOR")));

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_PANEL = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL");



    static private final SubLList $list_alt25 = list(makeSymbol("CYBLACK-USER-INTERACTION-PANEL"));

    static private final SubLList $list_alt26 = list(new SubLObject[]{ list(makeSymbol("MONITORS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LOCK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MONITORS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MONITORS"), list(makeSymbol("NEW-MONITORS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MONITOR"), list(makeSymbol("MONITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-MONITOR"), list(makeSymbol("MONITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-DIRECT-MONITORS"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-MONITORS"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-DIRECT-MONITORS-INTERNAL"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-MONITORS-INTERNAL"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")) });

    private static final SubLSymbol MONITORS = makeSymbol("MONITORS");

    static private final SubLSymbol $sym28$CYBLACK_BASIC_USER_INTERACTION_PANEL_ITERATE_OVER_ALL_MONITORS_IN = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-ITERATE-OVER-ALL-MONITORS-INTERNAL-METHOD");





    static private final SubLSymbol $sym31$CYBLACK_BASIC_USER_INTERACTION_PANEL_ITERATE_OVER_DIRECT_MONITORS = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-ITERATE-OVER-DIRECT-MONITORS-INTERNAL-METHOD");

    static private final SubLSymbol $sym32$CYBLACK_BASIC_USER_INTERACTION_PANEL_ITERATE_OVER_ALL_MONITORS_ME = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-ITERATE-OVER-ALL-MONITORS-METHOD");

    static private final SubLSymbol $sym33$CYBLACK_BASIC_USER_INTERACTION_PANEL_ITERATE_OVER_DIRECT_MONITORS = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-ITERATE-OVER-DIRECT-MONITORS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_PANEL_REMOVE_MONITOR_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-REMOVE-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_PANEL_ADD_MONITOR_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-ADD-MONITOR-METHOD");

    static private final SubLSymbol $sym36$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-USER-INTERACTION-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_REPORT_POSTING_MONITOR_VISITOR = makeSymbol("CYBLACK-REPORT-POSTING-MONITOR-VISITOR");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_PANEL_ADD_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-ADD-POSTING-METHOD");

    static private final SubLSymbol $sym39$CYBLACK_BASIC_USER_INTERACTION_PANEL_INITIALIZE_QUA_CYBLACK_USER_ = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL-METHOD");





    static private final SubLSymbol $sym42$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_USER_INTERACTION_PANEL_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-USER-INTERACTION-PANEL-CLASS");







































    static private final SubLSymbol $sym62$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_USER_INTERACTION_PANEL_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-USER-INTERACTION-PANEL-INSTANCE");



    static private final SubLList $list_alt64 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-INITIALIZE-METHOD");



    static private final SubLList $list_alt67 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt68 = list(list(RET, makeSymbol("LOCK")));

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_PANEL_GET_LOCK_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-GET-LOCK-METHOD");

    private static final SubLSymbol GET_MONITORS = makeSymbol("GET-MONITORS");

    static private final SubLList $list_alt71 = list(list(RET, makeSymbol("MONITORS")));

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_PANEL_GET_MONITORS_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-GET-MONITORS-METHOD");

    private static final SubLSymbol SET_MONITORS = makeSymbol("SET-MONITORS");

    static private final SubLList $list_alt74 = list(makeSymbol("NEW-MONITORS"));

    static private final SubLList $list_alt75 = list(list(makeSymbol("CSETQ"), makeSymbol("MONITORS"), makeSymbol("NEW-MONITORS")), list(RET, makeSymbol("NEW-MONITORS")));

    static private final SubLSymbol $sym76$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-USER-INTERACTION-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_PANEL_SET_MONITORS_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL-SET-MONITORS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL");



    static private final SubLList $list_alt80 = list(new SubLObject[]{ list(makeSymbol("MONITORS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LOCK"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MONITORS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MONITORS"), list(makeSymbol("NEW-MONITORS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MONITOR"), list(makeSymbol("MONITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-MONITOR"), list(makeSymbol("MONITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-DIRECT-MONITORS"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-MONITORS"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-DIRECT-MONITORS-INTERNAL"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-MONITORS-INTERNAL"), list(makeSymbol("MONITOR-VISITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")) });

    static private final SubLSymbol $sym81$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ITERATE_OVER_ALL_MO = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ITERATE-OVER-ALL-MONITORS-INTERNAL-METHOD");

    static private final SubLSymbol $sym82$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ITERATE_OVER_DIRECT = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ITERATE-OVER-DIRECT-MONITORS-INTERNAL-METHOD");

    static private final SubLSymbol $sym83$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ITERATE_OVER_ALL_MO = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ITERATE-OVER-ALL-MONITORS-METHOD");

    static private final SubLSymbol $sym84$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ITERATE_OVER_DIRECT = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ITERATE-OVER-DIRECT-MONITORS-METHOD");

    static private final SubLSymbol $sym85$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_REMOVE_MONITOR_METH = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-REMOVE-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ADD_MONITOR_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ADD-MONITOR-METHOD");

    static private final SubLSymbol $sym87$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_MET = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_ADD_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-ADD-POSTING-METHOD");

    static private final SubLSymbol $sym89$CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_INITIALIZE_QUA_CYBL = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL-METHOD");

    static private final SubLSymbol $sym90$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SEQUENCE_USER_INTERACTI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-CLASS");













    static private final SubLSymbol $sym97$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_SEQUENCE_USER_INTERACTI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-INSTANCE");

    static private final SubLList $list_alt98 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-INITIALIZE-METHOD");



    static private final SubLList $list_alt101 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt102 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%<CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL>")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt103$___CYBLACK_BASIC_SEQUENCE_USER_IN = makeString("~%<CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL>");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_PRINT_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_GET_LOCK_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-GET-LOCK-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_GET_MONITORS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-GET-MONITORS-METHOD");

    static private final SubLSymbol $sym107$OUTER_CATCH_FOR_CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_MET = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL_SET_MONITORS_METHOD = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL-SET-MONITORS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_CYCPANEL = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL");

    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL = makeSymbol("CYBLACK-BASIC-CYCPANEL");

    static private final SubLSymbol $sym111$CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ITERATE_OVER_ALL_MONITORS = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-INTERNAL-METHOD");

    static private final SubLSymbol $sym112$CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ITERATE_OVER_DIRECT_MONIT = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-INTERNAL-METHOD");

    static private final SubLSymbol $sym113$CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ITERATE_OVER_ALL_MONITORS = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-METHOD");

    static private final SubLSymbol $sym114$CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ITERATE_OVER_DIRECT_MONIT = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_REMOVE_MONITOR_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-REMOVE-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ADD_MONITOR_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ADD-MONITOR-METHOD");

    static private final SubLSymbol $sym117$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_ADD_POSTING_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-ADD-POSTING-METHOD");

    static private final SubLSymbol $sym119$CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_INITIALIZE_QUA_CYBLACK_US = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL-METHOD");

    static private final SubLSymbol $sym120$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_USER_INTERACTION_CYCPAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-CLASS");

    static private final SubLSymbol $sym121$USE_LOCAL_QUEUE_ = makeSymbol("USE-LOCAL-QUEUE?");

    private static final SubLSymbol DEFAULT_MT = makeSymbol("DEFAULT-MT");

    static private final SubLSymbol $sym123$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_USER_INTERACTION_CYCPAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-INSTANCE");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_GET_LOCK_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-GET-LOCK-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_GET_MONITORS_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-GET-MONITORS-METHOD");

    static private final SubLSymbol $sym127$OUTER_CATCH_FOR_CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_CYCPANEL_SET_MONITORS_METHOD = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL-SET-MONITORS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL");

    private static final SubLSymbol CYBLACK_BASIC_FORWARD_PANEL = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL");

    static private final SubLSymbol $sym131$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OVE = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-INTERNAL-METHOD");

    static private final SubLSymbol $sym132$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OVE = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-INTERNAL-METHOD");

    static private final SubLSymbol $sym133$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OVE = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-METHOD");

    static private final SubLSymbol $sym134$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OVE = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-METHOD");

    static private final SubLSymbol $sym135$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_REMOVE_MONI = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-REMOVE-MONITOR-METHOD");

    static private final SubLSymbol $sym136$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ADD_MONITOR = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ADD-MONITOR-METHOD");

    static private final SubLSymbol $sym137$OUTER_CATCH_FOR_CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCP = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-METHOD");

    static private final SubLSymbol $sym138$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_ADD_POSTING = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-ADD-POSTING-METHOD");

    static private final SubLSymbol $sym139$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_INITIALIZE_ = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL-METHOD");

    static private final SubLSymbol $sym140$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_FORWARD_PANEL_USER_INTE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-CLASS");

    static private final SubLSymbol $sym141$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_FORWARD_PANEL_USER_INTE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-INSTANCE");

    static private final SubLSymbol $sym142$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_INITIALIZE_ = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym143$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_GET_LOCK_ME = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-GET-LOCK-METHOD");

    static private final SubLSymbol $sym144$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_GET_MONITOR = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-GET-MONITORS-METHOD");

    static private final SubLSymbol $sym145$OUTER_CATCH_FOR_CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCP = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-METHOD");

    static private final SubLSymbol $sym146$CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL_SET_MONITOR = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL-SET-MONITORS-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL");

    public static final SubLInteger $int$24 = makeInteger(24);

    static private final SubLSymbol $sym150$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OV = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-INTERNAL-METHOD");

    static private final SubLSymbol $sym151$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OV = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-INTERNAL-METHOD");

    static private final SubLSymbol $sym152$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OV = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-ALL-MONITORS-METHOD");

    static private final SubLSymbol $sym153$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ITERATE_OV = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ITERATE-OVER-DIRECT-MONITORS-METHOD");

    static private final SubLSymbol $sym154$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_REMOVE_MON = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-REMOVE-MONITOR-METHOD");

    static private final SubLSymbol $sym155$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ADD_MONITO = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ADD-MONITOR-METHOD");

    static private final SubLSymbol $sym156$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYC = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-METHOD");

    static private final SubLSymbol $sym157$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_ADD_POSTIN = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-ADD-POSTING-METHOD");

    static private final SubLSymbol $sym158$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_INITIALIZE = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-INITIALIZE-QUA-CYBLACK-USER-INTERACTION-PANEL-METHOD");

    static private final SubLSymbol $sym159$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BACKWARD_PANEL_USER_INT = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-CLASS");

    private static final SubLSymbol CYC_BACKCHAIN = makeSymbol("CYC-BACKCHAIN");

    private static final SubLSymbol CYC_NUMBER = makeSymbol("CYC-NUMBER");

    private static final SubLSymbol CYC_TIME = makeSymbol("CYC-TIME");

    private static final SubLSymbol CYC_DEPTH = makeSymbol("CYC-DEPTH");

    private static final SubLSymbol MOST_RECENT_QUERY = makeSymbol("MOST-RECENT-QUERY");

    private static final SubLSymbol QUERY_ACTION = makeSymbol("QUERY-ACTION");

    static private final SubLSymbol $sym166$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_BACKWARD_PANEL_USER_INT = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-INSTANCE");

    static private final SubLSymbol $sym167$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_INITIALIZE = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-INITIALIZE-METHOD");

    static private final SubLSymbol $sym168$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_GET_LOCK_M = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-GET-LOCK-METHOD");

    static private final SubLSymbol $sym169$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_GET_MONITO = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-GET-MONITORS-METHOD");

    static private final SubLSymbol $sym170$OUTER_CATCH_FOR_CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYC = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-METHOD");

    static private final SubLSymbol $sym171$CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL_SET_MONITO = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL-SET-MONITORS-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_ui_panel_file();
    }

    public void initializeVariables() {
        init_cyblack_ui_panel_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_ui_panel_file();
    }
}

