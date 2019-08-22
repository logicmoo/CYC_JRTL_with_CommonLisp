/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
 *  module:      CYBLACK-DERIVED-PANELS
 *  source file: /cyc/top/cycl/cyblack/cyblack-derived-panels.lisp
 *  created:     2019/07/03 17:38:47
 */
public final class cyblack_derived_panels extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_derived_panels() {
    }

    public static final SubLFile me = new cyblack_derived_panels();


    // // Definitions
    public static final SubLObject get_cyblack_partitioned_panel_deactivated_postings(SubLObject cyblack_partitioned_panel) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_partitioned_panel, SIXTEEN_INTEGER, DEACTIVATED_POSTINGS);
    }

    public static final SubLObject set_cyblack_partitioned_panel_deactivated_postings(SubLObject cyblack_partitioned_panel, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_partitioned_panel, value, SIXTEEN_INTEGER, DEACTIVATED_POSTINGS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_partitioned_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_partitioned_panel_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_PARTITIONED_PANEL, DEACTIVATED_POSTINGS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_partitioned_panel_p(SubLObject cyblack_partitioned_panel) {
        return classes.subloop_instanceof_class(cyblack_partitioned_panel, CYBLACK_PARTITIONED_PANEL);
    }

    public static final SubLObject cyblack_partitioned_panel_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_partitioned_panel_method = NIL;
            SubLObject deactivated_postings = get_cyblack_partitioned_panel_deactivated_postings(self);
            try {
                try {
                    cyblack_panel.cyblack_basic_panel_initialize_method(self);
                    deactivated_postings = object.new_object_instance(BASIC_DOUBLY_LINKED_LIST);
                    sublisp_throw($sym30$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_PANEL_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_partitioned_panel_deactivated_postings(self, deactivated_postings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_partitioned_panel_method = Errors.handleThrowable(ccatch_env_var, $sym30$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_PANEL_METHOD);
            }
            return catch_var_for_cyblack_partitioned_panel_method;
        }
    }

    public static final SubLObject cyblack_partitioned_panel_iterate_over_all_direct_postings_method(SubLObject self, SubLObject posting_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_visitor_p(posting_visitor)) {
                    Errors.error($str_alt37$_ITERATE_OVER_ALL_DIRECT_POSTINGS, self, posting_visitor);
                }
            }
            if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt38$___ITERATE_OVER_ALL_DIRECT_POSTIN, self, posting_visitor);
            }
            {
                SubLObject iterator_direct_postings = cyblack_panel.cyblack_basic_panel_get_direct_postings_method(self);
                SubLObject cdolist_list_var = iterator_direct_postings;
                SubLObject iterator_posting = NIL;
                for (iterator_posting = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , iterator_posting = cdolist_list_var.first()) {
                    methods.funcall_instance_method_with_1_args(posting_visitor, VISIT, iterator_posting);
                    if (NIL == methods.funcall_instance_method_with_1_args(posting_visitor, CONTINUE_P, iterator_posting)) {
                        return posting_visitor;
                    }
                }
            }
            return posting_visitor;
        }
    }

    public static final SubLObject cyblack_partitioned_panel_iterate_over_all_postings_method(SubLObject self, SubLObject posting_visitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_posting.cyblack_posting_visitor_p(posting_visitor)) {
                    Errors.error($str_alt44$_ITERATE_OVER_ALL_POSTINGS__S____, self, posting_visitor);
                }
            }
            {
                SubLObject iterator_panel_queue = list(self);
                SubLObject iterator_visited_panels = NIL;
                SubLObject iterator_current_panel = NIL;
                if (NIL != cyblack_globals.$cyblack_tracing_on$.getDynamicValue(thread)) {
                    format(cyblack_globals.$cyblack_tracing_output_stream$.getDynamicValue(thread), $str_alt45$___ITERATE_OVER_ALL_POSTINGS__S__, new SubLObject[]{ self, self, posting_visitor });
                }
                while (NIL != iterator_panel_queue) {
                    iterator_current_panel = iterator_panel_queue.first();
                    iterator_panel_queue = iterator_panel_queue.rest();
                    if (NIL == subl_promotions.memberP(iterator_current_panel, iterator_visited_panels, UNPROVIDED, UNPROVIDED)) {
                        iterator_visited_panels = cons(iterator_current_panel, iterator_visited_panels);
                        iterator_panel_queue = nconc(iterator_panel_queue, methods.funcall_instance_method_with_0_args(iterator_current_panel, GET_SUB_PANELS));
                        cyblack_panel_dispatch_functions.cyblack_panel_iterate_over_all_direct_postings(iterator_current_panel, posting_visitor);
                    }
                } 
                return posting_visitor;
            }
        }
    }

    public static final SubLObject cyblack_partitioned_panel_deactivate_posting_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_partitioned_panel_method = NIL;
                SubLObject deactivated_postings = get_cyblack_partitioned_panel_deactivated_postings(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                                Errors.error($str_alt52$_DEACTIVATE_POSTING__S____S_is_no, self, posting);
                            }
                        }
                        methods.funcall_instance_method_with_2_args(posting, TRANSFER_SELF, self, deactivated_postings);
                        sublisp_throw($sym51$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_PANEL_METHOD, posting);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_partitioned_panel_deactivated_postings(self, deactivated_postings);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_partitioned_panel_method = Errors.handleThrowable(ccatch_env_var, $sym51$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_PANEL_METHOD);
                }
                return catch_var_for_cyblack_partitioned_panel_method;
            }
        }
    }

    public static final SubLObject cyblack_partitioned_panel_activate_posting_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_partitioned_panel_method = NIL;
                SubLObject deactivated_postings = get_cyblack_partitioned_panel_deactivated_postings(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                                Errors.error($str_alt58$_ACTIVATE_POSTING__S____S_is_not_, self, posting);
                            }
                        }
                        methods.funcall_instance_method_with_2_args(posting, TRANSFER_SELF, deactivated_postings, self);
                        sublisp_throw($sym57$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_PANEL_METHOD, posting);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_partitioned_panel_deactivated_postings(self, deactivated_postings);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_partitioned_panel_method = Errors.handleThrowable(ccatch_env_var, $sym57$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_PANEL_METHOD);
                }
                return catch_var_for_cyblack_partitioned_panel_method;
            }
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_partitioned_stack_panel_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_partitioned_stack_panel_instance(SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_PARTITIONED_PANEL, DEACTIVATED_POSTINGS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_partitioned_stack_panel_p(SubLObject cyblack_partitioned_stack_panel) {
        return classes.subloop_instanceof_class(cyblack_partitioned_stack_panel, CYBLACK_PARTITIONED_STACK_PANEL);
    }

    public static final SubLObject cyblack_partitioned_stack_panel_add_posting_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_partitioned_stack_panel_method = NIL;
                SubLObject application = cyblack_object.get_cyblack_object_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_posting.cyblack_posting_p(posting)) {
                                Errors.error($str_alt67$_ADD_POSTING__S____S_is_not_an_in, self, posting);
                            }
                        }
                        if (NIL != posting) {
                            format(T, $str_alt68$__Adding_the_posting__S_to_panel_, posting, self);
                            cyblack_panel.cyblack_basic_panel_push_method(self, posting);
                            methods.funcall_instance_method_with_0_args(posting, ON_POST);
                            {
                                SubLObject environment = cyblack_precondition_pattern.create_top_level_environment($ADD_POSTING, $sym71$_THE_POSTING, cyblack_application.cyblack_application_get_root_datatype(application), posting);
                                cyblack_panel.cyblack_basic_panel_stimulate_all_knowledge_sources_method(self, environment);
                            }
                            methods.funcall_instance_method_with_0_args(posting, AFTER_STIMULATION);
                            sublisp_throw($sym66$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_STACK_PANEL_METHOD, posting);
                        }
                        sublisp_throw($sym66$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_STACK_PANEL_METHOD, NIL);
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
                    catch_var_for_cyblack_partitioned_stack_panel_method = Errors.handleThrowable(ccatch_env_var, $sym66$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_STACK_PANEL_METHOD);
                }
                return catch_var_for_cyblack_partitioned_stack_panel_method;
            }
        }
    }

    public static final SubLObject declare_cyblack_derived_panels_file() {
        declareFunction("get_cyblack_partitioned_panel_deactivated_postings", "GET-CYBLACK-PARTITIONED-PANEL-DEACTIVATED-POSTINGS", 1, 0, false);
        declareFunction("set_cyblack_partitioned_panel_deactivated_postings", "SET-CYBLACK-PARTITIONED-PANEL-DEACTIVATED-POSTINGS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_partitioned_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PARTITIONED-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_partitioned_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PARTITIONED-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_partitioned_panel_p", "CYBLACK-PARTITIONED-PANEL-P", 1, 0, false);
        declareFunction("cyblack_partitioned_panel_initialize_method", "CYBLACK-PARTITIONED-PANEL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_partitioned_panel_iterate_over_all_direct_postings_method", "CYBLACK-PARTITIONED-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_partitioned_panel_iterate_over_all_postings_method", "CYBLACK-PARTITIONED-PANEL-ITERATE-OVER-ALL-POSTINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_partitioned_panel_deactivate_posting_method", "CYBLACK-PARTITIONED-PANEL-DEACTIVATE-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_partitioned_panel_activate_posting_method", "CYBLACK-PARTITIONED-PANEL-ACTIVATE-POSTING-METHOD", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_partitioned_stack_panel_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PARTITIONED-STACK-PANEL-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_partitioned_stack_panel_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PARTITIONED-STACK-PANEL-INSTANCE", 1, 0, false);
        declareFunction("cyblack_partitioned_stack_panel_p", "CYBLACK-PARTITIONED-STACK-PANEL-P", 1, 0, false);
        declareFunction("cyblack_partitioned_stack_panel_add_posting_method", "CYBLACK-PARTITIONED-STACK-PANEL-ADD-POSTING-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_derived_panels_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_derived_panels_file() {
                classes.subloop_new_class(CYBLACK_PARTITIONED_PANEL, CYBLACK_BASIC_PANEL, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(CYBLACK_PARTITIONED_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_PARTITIONED_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PARTITIONED_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_PARTITIONED_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PARTITIONED_PANEL_INSTANCE);
        subloop_reserved_initialize_cyblack_partitioned_panel_class(CYBLACK_PARTITIONED_PANEL);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_PARTITIONED_PANEL, $list_alt28, NIL, $list_alt29);
        methods.subloop_register_instance_method(CYBLACK_PARTITIONED_PANEL, INITIALIZE, CYBLACK_PARTITIONED_PANEL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_DIRECT_POSTINGS, CYBLACK_PARTITIONED_PANEL, $list_alt34, $list_alt35, $list_alt36);
        methods.subloop_register_instance_method(CYBLACK_PARTITIONED_PANEL, ITERATE_OVER_ALL_DIRECT_POSTINGS, CYBLACK_PARTITIONED_PANEL_ITERATE_OVER_ALL_DIRECT_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(ITERATE_OVER_ALL_POSTINGS, CYBLACK_PARTITIONED_PANEL, $list_alt34, $list_alt35, $list_alt43);
        methods.subloop_register_instance_method(CYBLACK_PARTITIONED_PANEL, ITERATE_OVER_ALL_POSTINGS, CYBLACK_PARTITIONED_PANEL_ITERATE_OVER_ALL_POSTINGS_METHOD);
        methods.methods_incorporate_instance_method(DEACTIVATE_POSTING, CYBLACK_PARTITIONED_PANEL, $list_alt34, $list_alt49, $list_alt50);
        methods.subloop_register_instance_method(CYBLACK_PARTITIONED_PANEL, DEACTIVATE_POSTING, CYBLACK_PARTITIONED_PANEL_DEACTIVATE_POSTING_METHOD);
        methods.methods_incorporate_instance_method(ACTIVATE_POSTING, CYBLACK_PARTITIONED_PANEL, $list_alt34, $list_alt49, $list_alt56);
        methods.subloop_register_instance_method(CYBLACK_PARTITIONED_PANEL, ACTIVATE_POSTING, CYBLACK_PARTITIONED_PANEL_ACTIVATE_POSTING_METHOD);
        classes.subloop_new_class(CYBLACK_PARTITIONED_STACK_PANEL, CYBLACK_PARTITIONED_PANEL, NIL, NIL, $list_alt61);
        classes.class_set_implements_slot_listeners(CYBLACK_PARTITIONED_STACK_PANEL, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_PARTITIONED_STACK_PANEL, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PARTITIONED_STACK_PANEL_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_PARTITIONED_STACK_PANEL, $sym63$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PARTITIONED_STACK_PANEL_INSTA);
        subloop_reserved_initialize_cyblack_partitioned_stack_panel_class(CYBLACK_PARTITIONED_STACK_PANEL);
        methods.methods_incorporate_instance_method(ADD_POSTING, CYBLACK_PARTITIONED_STACK_PANEL, $list_alt28, $list_alt49, $list_alt65);
        methods.subloop_register_instance_method(CYBLACK_PARTITIONED_STACK_PANEL, ADD_POSTING, CYBLACK_PARTITIONED_STACK_PANEL_ADD_POSTING_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_PARTITIONED_PANEL = makeSymbol("CYBLACK-PARTITIONED-PANEL");



    static private final SubLList $list_alt2 = list(list(makeSymbol("DEACTIVATED-POSTINGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ITERATE-OVER-ALL-POSTINGS"), list(makeSymbol("POSTING-VISITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ACTIVATE-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")));

    private static final SubLSymbol DEACTIVATED_POSTINGS = makeSymbol("DEACTIVATED-POSTINGS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PARTITIONED_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PARTITIONED-PANEL-CLASS");







































    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PARTITIONED_PANEL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PARTITIONED-PANEL-INSTANCE");



    static private final SubLList $list_alt28 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt29 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DEACTIVATED-POSTINGS"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("BASIC-DOUBLY-LINKED-LIST")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym30$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PARTITIONED-PANEL-METHOD");



    private static final SubLSymbol CYBLACK_PARTITIONED_PANEL_INITIALIZE_METHOD = makeSymbol("CYBLACK-PARTITIONED-PANEL-INITIALIZE-METHOD");

    private static final SubLSymbol ITERATE_OVER_ALL_DIRECT_POSTINGS = makeSymbol("ITERATE-OVER-ALL-DIRECT-POSTINGS");

    static private final SubLList $list_alt34 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt35 = list(makeSymbol("POSTING-VISITOR"));

    static private final SubLList $list_alt36 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-VISITOR-P"), makeSymbol("POSTING-VISITOR")), makeString("(ITERATE-OVER-ALL-DIRECT-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR."), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(ITERATE-OVER-ALL-DIRECT-POSTINGS ~S): posting-visitor -> ~S."), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("ITERATOR-DIRECT-POSTINGS"), list(makeSymbol("GET-DIRECT-POSTINGS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ITERATOR-POSTING"), makeSymbol("ITERATOR-DIRECT-POSTINGS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-VISITOR"), list(QUOTE, makeSymbol("VISIT")), makeSymbol("ITERATOR-POSTING")), list(makeSymbol("PUNLESS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING-VISITOR"), list(QUOTE, makeSymbol("CONTINUE-P")), makeSymbol("ITERATOR-POSTING")), list(RET, makeSymbol("POSTING-VISITOR"))))), list(RET, makeSymbol("POSTING-VISITOR")));

    static private final SubLString $str_alt37$_ITERATE_OVER_ALL_DIRECT_POSTINGS = makeString("(ITERATE-OVER-ALL-DIRECT-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR.");

    static private final SubLString $str_alt38$___ITERATE_OVER_ALL_DIRECT_POSTIN = makeString("~%(ITERATE-OVER-ALL-DIRECT-POSTINGS ~S): posting-visitor -> ~S.");





    private static final SubLSymbol CYBLACK_PARTITIONED_PANEL_ITERATE_OVER_ALL_DIRECT_POSTINGS_METHOD = makeSymbol("CYBLACK-PARTITIONED-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS-METHOD");



    static private final SubLList $list_alt43 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-VISITOR-P"), makeSymbol("POSTING-VISITOR")), makeString("(ITERATE-OVER-ALL-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR."), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CLET"), list(list(makeSymbol("ITERATOR-PANEL-QUEUE"), list(makeSymbol("LIST"), makeSymbol("SELF"))), list(makeSymbol("ITERATOR-VISITED-PANELS"), NIL), makeSymbol("ITERATOR-CURRENT-PANEL")), list(makeSymbol("CYBLACK-TRACING-FORMAT"), makeString("~%(ITERATE-OVER-ALL-POSTINGS ~S): Iterating over panel ~S with visitor ~S."), makeSymbol("SELF"), makeSymbol("SELF"), makeSymbol("POSTING-VISITOR")), list(makeSymbol("CUNWIND-PROTECT"), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("ITERATOR-PANEL-QUEUE")), list(makeSymbol("CSETQ"), makeSymbol("ITERATOR-CURRENT-PANEL"), list(makeSymbol("CAR"), makeSymbol("ITERATOR-PANEL-QUEUE"))), list(makeSymbol("CSETQ"), makeSymbol("ITERATOR-PANEL-QUEUE"), list(makeSymbol("CDR"), makeSymbol("ITERATOR-PANEL-QUEUE"))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("ITERATOR-CURRENT-PANEL"), makeSymbol("ITERATOR-VISITED-PANELS")), list(makeSymbol("CPUSH"), makeSymbol("ITERATOR-CURRENT-PANEL"), makeSymbol("ITERATOR-VISITED-PANELS")), list(makeSymbol("CSETQ"), makeSymbol("ITERATOR-PANEL-QUEUE"), list(makeSymbol("NCONC"), makeSymbol("ITERATOR-PANEL-QUEUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ITERATOR-CURRENT-PANEL"), list(QUOTE, makeSymbol("GET-SUB-PANELS"))))), list(makeSymbol("CYBLACK-PANEL-ITERATE-OVER-ALL-DIRECT-POSTINGS"), makeSymbol("ITERATOR-CURRENT-PANEL"), makeSymbol("POSTING-VISITOR"))))), list(RET, makeSymbol("POSTING-VISITOR"))));

    static private final SubLString $str_alt44$_ITERATE_OVER_ALL_POSTINGS__S____ = makeString("(ITERATE-OVER-ALL-POSTINGS ~S): ~S is not an instance of CYBLACK-POSTING-VISITOR.");

    static private final SubLString $str_alt45$___ITERATE_OVER_ALL_POSTINGS__S__ = makeString("~%(ITERATE-OVER-ALL-POSTINGS ~S): Iterating over panel ~S with visitor ~S.");



    private static final SubLSymbol CYBLACK_PARTITIONED_PANEL_ITERATE_OVER_ALL_POSTINGS_METHOD = makeSymbol("CYBLACK-PARTITIONED-PANEL-ITERATE-OVER-ALL-POSTINGS-METHOD");



    static private final SubLList $list_alt49 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt50 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(DEACTIVATE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("TRANSFER-SELF")), makeSymbol("SELF"), makeSymbol("DEACTIVATED-POSTINGS")), list(RET, makeSymbol("POSTING")));

    static private final SubLSymbol $sym51$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PARTITIONED-PANEL-METHOD");

    static private final SubLString $str_alt52$_DEACTIVATE_POSTING__S____S_is_no = makeString("(DEACTIVATE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING.");



    private static final SubLSymbol CYBLACK_PARTITIONED_PANEL_DEACTIVATE_POSTING_METHOD = makeSymbol("CYBLACK-PARTITIONED-PANEL-DEACTIVATE-POSTING-METHOD");



    static private final SubLList $list_alt56 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ACTIVATE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("TRANSFER-SELF")), makeSymbol("DEACTIVATED-POSTINGS"), makeSymbol("SELF")), list(RET, makeSymbol("POSTING")));

    static private final SubLSymbol $sym57$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PARTITIONED-PANEL-METHOD");

    static private final SubLString $str_alt58$_ACTIVATE_POSTING__S____S_is_not_ = makeString("(ACTIVATE-POSTING ~S): ~S is not an instance of CYBLACK-POSTING.");

    private static final SubLSymbol CYBLACK_PARTITIONED_PANEL_ACTIVATE_POSTING_METHOD = makeSymbol("CYBLACK-PARTITIONED-PANEL-ACTIVATE-POSTING-METHOD");

    private static final SubLSymbol CYBLACK_PARTITIONED_STACK_PANEL = makeSymbol("CYBLACK-PARTITIONED-STACK-PANEL");

    static private final SubLList $list_alt61 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PARTITIONED_STACK_PANEL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PARTITIONED-STACK-PANEL-CLASS");

    static private final SubLSymbol $sym63$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PARTITIONED_STACK_PANEL_INSTA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PARTITIONED-STACK-PANEL-INSTANCE");



    static private final SubLList $list_alt65 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-POSTING-P"), makeSymbol("POSTING")), makeString("(ADD-POSTING ~S): ~S is not an instance of CYBLACK-POSTING."), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("PWHEN"), makeSymbol("POSTING"), list(makeSymbol("FORMAT"), T, makeString("~%Adding the posting ~S to panel ~S."), makeSymbol("POSTING"), makeSymbol("SELF")), list(makeSymbol("PUSH"), makeSymbol("SELF"), makeSymbol("POSTING")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("ON-POST"))), list(makeSymbol("CLET"), list(list(makeSymbol("ENVIRONMENT"), list(makeSymbol("CREATE-TOP-LEVEL-ENVIRONMENT"), makeKeyword("ADD-POSTING"), list(QUOTE, makeSymbol("?THE-POSTING")), list(makeSymbol("CYBLACK-APPLICATION-GET-ROOT-DATATYPE"), makeSymbol("APPLICATION")), makeSymbol("POSTING")))), list(makeSymbol("STIMULATE-ALL-KNOWLEDGE-SOURCES"), makeSymbol("SELF"), makeSymbol("ENVIRONMENT"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("POSTING"), list(QUOTE, makeSymbol("AFTER-STIMULATION"))), list(RET, makeSymbol("POSTING"))), list(RET, NIL));

    static private final SubLSymbol $sym66$OUTER_CATCH_FOR_CYBLACK_PARTITIONED_STACK_PANEL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PARTITIONED-STACK-PANEL-METHOD");

    static private final SubLString $str_alt67$_ADD_POSTING__S____S_is_not_an_in = makeString("(ADD-POSTING ~S): ~S is not an instance of CYBLACK-POSTING.");

    static private final SubLString $str_alt68$__Adding_the_posting__S_to_panel_ = makeString("~%Adding the posting ~S to panel ~S.");



    private static final SubLSymbol $ADD_POSTING = makeKeyword("ADD-POSTING");

    static private final SubLSymbol $sym71$_THE_POSTING = makeSymbol("?THE-POSTING");



    private static final SubLSymbol CYBLACK_PARTITIONED_STACK_PANEL_ADD_POSTING_METHOD = makeSymbol("CYBLACK-PARTITIONED-STACK-PANEL-ADD-POSTING-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_derived_panels_file();
    }

    public void initializeVariables() {
        init_cyblack_derived_panels_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_derived_panels_file();
    }
}

