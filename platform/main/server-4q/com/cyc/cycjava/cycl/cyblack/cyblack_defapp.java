/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.enumerations;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_processes;
import com.cyc.cycjava.cycl.subloop_queues;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
 *  module:      CYBLACK-DEFAPP
 *  source file: /cyc/top/cycl/cyblack/cyblack-defapp.lisp
 *  created:     2019/07/03 17:38:51
 */
public final class cyblack_defapp extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_defapp() {
    }

    public static final SubLFile me = new cyblack_defapp();


    // // Definitions
    // defvar
    public static final SubLSymbol $cyblack_current_app$ = makeSymbol("*CYBLACK-CURRENT-APP*");

    public static final SubLObject cyblack_defapp_agenda_extension_p(SubLObject cyblack_defapp_agenda_extension) {
        return interfaces.subloop_instanceof_interface(cyblack_defapp_agenda_extension, CYBLACK_DEFAPP_AGENDA_EXTENSION);
    }

    public static final SubLObject get_cyblack_defapp_agenda_base_max_futile_cycles(SubLObject cyblack_defapp_agenda_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_agenda_base, TWELVE_INTEGER, MAX_FUTILE_CYCLES);
    }

    public static final SubLObject set_cyblack_defapp_agenda_base_max_futile_cycles(SubLObject cyblack_defapp_agenda_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_agenda_base, value, TWELVE_INTEGER, MAX_FUTILE_CYCLES);
    }

    public static final SubLObject get_cyblack_defapp_agenda_base_futile_cycle_count(SubLObject cyblack_defapp_agenda_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_agenda_base, ELEVEN_INTEGER, FUTILE_CYCLE_COUNT);
    }

    public static final SubLObject set_cyblack_defapp_agenda_base_futile_cycle_count(SubLObject cyblack_defapp_agenda_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_agenda_base, value, ELEVEN_INTEGER, FUTILE_CYCLE_COUNT);
    }

    public static final SubLObject get_cyblack_defapp_agenda_base_terminate(SubLObject cyblack_defapp_agenda_base) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_agenda_base);
            SubLObject slot = slots.slot_assoc(TERMINATE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_agenda_base, slot);
        }
        return classes.ldb_test($int$4098, subloop_structures.instance_boolean_slots(cyblack_defapp_agenda_base));
    }

    public static final SubLObject set_cyblack_defapp_agenda_base_terminate(SubLObject cyblack_defapp_agenda_base, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_agenda_base);
            SubLObject slot = slots.slot_assoc(TERMINATE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_agenda_base, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_defapp_agenda_base, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4098, subloop_structures.instance_boolean_slots(cyblack_defapp_agenda_base)));
        return value;
    }

    public static final SubLObject get_cyblack_defapp_agenda_base_agenda_trace_on(SubLObject cyblack_defapp_agenda_base) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_agenda_base);
            SubLObject slot = slots.slot_assoc(AGENDA_TRACE_ON, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_agenda_base, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_defapp_agenda_base));
    }

    public static final SubLObject set_cyblack_defapp_agenda_base_agenda_trace_on(SubLObject cyblack_defapp_agenda_base, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_agenda_base);
            SubLObject slot = slots.slot_assoc(AGENDA_TRACE_ON, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_agenda_base, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_defapp_agenda_base, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_defapp_agenda_base)));
        return value;
    }

    public static final SubLObject cyblack_defapp_agenda_base_execute_method(SubLObject self) {
        if (NIL != cyblack_defapp_agenda_base_get_terminate_internal_method(self)) {
            methods.funcall_instance_method_with_0_args(cyblack_object.cyblack_object_get_application_method(self), HALT);
        } else {
            if (NIL != cyblack_defapp_agenda_base_agenda_trace_on_p_method(self)) {
                {
                    SubLObject next_element = cyblack_agenda.cyblack_basic_simple_agenda_peek_method(self);
                    if (NIL != next_element) {
                        format(T, $str_alt40$__Executing___S__, next_element);
                        force_output(T);
                    }
                }
            }
            if (cyblack_agenda.cyblack_basic_simple_agenda_get_element_count_method(self).numE(ZERO_INTEGER)) {
                cyblack_defapp_agenda_base_count_futile_cycle_method(self);
            } else {
                cyblack_defapp_agenda_base_count_useful_cycle_method(self);
            }
        }
        return cyblack_agenda.cyblack_basic_simple_agenda_execute_method(self);
    }

    public static final SubLObject cyblack_defapp_agenda_base_propose_method(SubLObject self, SubLObject proposal) {
        if (NIL != cyblack_defapp_agenda_base_agenda_trace_on_p_method(self)) {
            format(T, $str_alt42$__Proposing___S__, proposal);
            force_output(T);
        }
        return cyblack_agenda.cyblack_basic_simple_agenda_propose_method(self, proposal);
    }

    public static final SubLObject cyblack_defapp_agenda_base_set_terminate_method(SubLObject self, SubLObject new_state) {
        cyblack_defapp_agenda_base_set_terminate_internal_method(self, NIL != new_state ? ((SubLObject) (T)) : NIL);
        return cyblack_defapp_agenda_base_get_terminate_internal_method(self);
    }

    public static final SubLObject cyblack_defapp_agenda_base_terminate_p_method(SubLObject self) {
        return cyblack_defapp_agenda_base_get_terminate_internal_method(self);
    }

    public static final SubLObject cyblack_defapp_agenda_base_toggle_agenda_trace_on_method(SubLObject self) {
        cyblack_defapp_agenda_base_set_agenda_trace_on_internal_method(self, makeBoolean(NIL == cyblack_defapp_agenda_base_get_agenda_trace_on_internal_method(self)));
        return cyblack_defapp_agenda_base_get_agenda_trace_on_internal_method(self);
    }

    public static final SubLObject cyblack_defapp_agenda_base_agenda_trace_on_p_method(SubLObject self) {
        return cyblack_defapp_agenda_base_get_agenda_trace_on_internal_method(self);
    }

    public static final SubLObject cyblack_defapp_agenda_base_count_useful_cycle_method(SubLObject self) {
        cyblack_defapp_agenda_base_set_futile_cycle_count_internal_method(self, ZERO_INTEGER);
        return ZERO_INTEGER;
    }

    public static final SubLObject cyblack_defapp_agenda_base_count_futile_cycle_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_defapp_agenda_base_set_futile_cycle_count_internal_method(self, add(cyblack_defapp_agenda_base_get_futile_cycle_count_internal_method(self), ONE_INTEGER));
            if (cyblack_defapp_agenda_base_get_futile_cycle_count_internal_method(self).numGE(cyblack_defapp_agenda_base_get_max_futile_cycles_internal_method(self))) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == cyblack_object.cyblack_object_get_application_method(self)) {
                        Errors.error($str_alt49$_COUNT_FUTILE_CYCLE__S___Attempte, self);
                    }
                }
                methods.funcall_instance_method_with_0_args(cyblack_object.cyblack_object_get_application_method(self), HALT);
                format(T, $str_alt50$__Halting_due_to__S_futile_cycles, cyblack_defapp_agenda_base_get_futile_cycle_count_internal_method(self));
                force_output(T);
            }
            return cyblack_defapp_agenda_base_get_futile_cycle_count_internal_method(self);
        }
    }

    public static final SubLObject cyblack_defapp_agenda_base_set_max_futile_cycles_method(SubLObject self, SubLObject new_max_futile_cycles) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(new_max_futile_cycles.isInteger() && new_max_futile_cycles.numGE(ZERO_INTEGER))) {
                    Errors.error($str_alt52$_SET_MAX_FUTILE_CYCLES__S____S_is, self, new_max_futile_cycles);
                }
            }
            cyblack_defapp_agenda_base_set_max_futile_cycles_internal_method(self, new_max_futile_cycles);
            return new_max_futile_cycles;
        }
    }

    public static final SubLObject cyblack_defapp_agenda_base_get_max_futile_cycles_method(SubLObject self) {
        return cyblack_defapp_agenda_base_get_max_futile_cycles_internal_method(self);
    }

    public static final SubLObject cyblack_defapp_agenda_base_initialize_qua_defapp_agenda_extension_method(SubLObject self) {
        cyblack_defapp_agenda_base_set_futile_cycle_count_internal_method(self, ZERO_INTEGER);
        cyblack_defapp_agenda_base_set_max_futile_cycles_internal_method(self, $int$1000000000);
        cyblack_defapp_agenda_base_set_agenda_trace_on_internal_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_agenda_base_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_agenda_base_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, AGENDA_TRACE_ON, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, TERMINATE, NIL);
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, FUTILE_CYCLE_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_AGENDA_BASE, MAX_FUTILE_CYCLES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_agenda_base_p(SubLObject cyblack_defapp_agenda_base) {
        return classes.subloop_instanceof_class(cyblack_defapp_agenda_base, CYBLACK_DEFAPP_AGENDA_BASE);
    }

    public static final SubLObject cyblack_defapp_agenda_base_get_futile_cycle_count_internal_method(SubLObject self) {
        {
            SubLObject futile_cycle_count = get_cyblack_defapp_agenda_base_futile_cycle_count(self);
            return futile_cycle_count;
        }
    }

    public static final SubLObject cyblack_defapp_agenda_base_set_futile_cycle_count_internal_method(SubLObject self, SubLObject new_count) {
        {
            SubLObject catch_var_for_cyblack_defapp_agenda_base_method = NIL;
            SubLObject futile_cycle_count = get_cyblack_defapp_agenda_base_futile_cycle_count(self);
            try {
                try {
                    futile_cycle_count = new_count;
                    sublisp_throw($sym82$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD, new_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_agenda_base_futile_cycle_count(self, futile_cycle_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_agenda_base_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_agenda_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_agenda_base_get_max_futile_cycles_internal_method(SubLObject self) {
        {
            SubLObject max_futile_cycles = get_cyblack_defapp_agenda_base_max_futile_cycles(self);
            return max_futile_cycles;
        }
    }

    public static final SubLObject cyblack_defapp_agenda_base_set_max_futile_cycles_internal_method(SubLObject self, SubLObject cycles) {
        {
            SubLObject catch_var_for_cyblack_defapp_agenda_base_method = NIL;
            SubLObject max_futile_cycles = get_cyblack_defapp_agenda_base_max_futile_cycles(self);
            try {
                try {
                    max_futile_cycles = cycles;
                    sublisp_throw($sym90$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD, cycles);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_agenda_base_max_futile_cycles(self, max_futile_cycles);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_agenda_base_method = Errors.handleThrowable(ccatch_env_var, $sym90$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_agenda_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_agenda_base_get_agenda_trace_on_internal_method(SubLObject self) {
        {
            SubLObject agenda_trace_on = get_cyblack_defapp_agenda_base_agenda_trace_on(self);
            return agenda_trace_on;
        }
    }

    public static final SubLObject cyblack_defapp_agenda_base_set_agenda_trace_on_internal_method(SubLObject self, SubLObject new_value) {
        {
            SubLObject catch_var_for_cyblack_defapp_agenda_base_method = NIL;
            SubLObject agenda_trace_on = get_cyblack_defapp_agenda_base_agenda_trace_on(self);
            try {
                try {
                    agenda_trace_on = new_value;
                    sublisp_throw($sym98$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD, new_value);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_agenda_base_agenda_trace_on(self, agenda_trace_on);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_agenda_base_method = Errors.handleThrowable(ccatch_env_var, $sym98$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_agenda_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_agenda_base_get_terminate_internal_method(SubLObject self) {
        {
            SubLObject terminate = get_cyblack_defapp_agenda_base_terminate(self);
            return terminate;
        }
    }

    public static final SubLObject cyblack_defapp_agenda_base_set_terminate_internal_method(SubLObject self, SubLObject new_value) {
        {
            SubLObject catch_var_for_cyblack_defapp_agenda_base_method = NIL;
            SubLObject terminate = get_cyblack_defapp_agenda_base_terminate(self);
            try {
                try {
                    terminate = new_value;
                    sublisp_throw($sym105$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD, new_value);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_agenda_base_terminate(self, terminate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_agenda_base_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_agenda_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_agenda_base_initialize_method(SubLObject self) {
        cyblack_agenda.cyblack_basic_simple_agenda_initialize_method(self);
        cyblack_defapp_agenda_base_initialize_qua_defapp_agenda_extension_method(self);
        return self;
    }

    public static final SubLObject get_cyblack_defapp_heuristic_agenda_base_max_futile_cycles(SubLObject cyblack_defapp_heuristic_agenda_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_heuristic_agenda_base, THIRTEEN_INTEGER, MAX_FUTILE_CYCLES);
    }

    public static final SubLObject set_cyblack_defapp_heuristic_agenda_base_max_futile_cycles(SubLObject cyblack_defapp_heuristic_agenda_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_heuristic_agenda_base, value, THIRTEEN_INTEGER, MAX_FUTILE_CYCLES);
    }

    public static final SubLObject get_cyblack_defapp_heuristic_agenda_base_futile_cycle_count(SubLObject cyblack_defapp_heuristic_agenda_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_heuristic_agenda_base, TWELVE_INTEGER, FUTILE_CYCLE_COUNT);
    }

    public static final SubLObject set_cyblack_defapp_heuristic_agenda_base_futile_cycle_count(SubLObject cyblack_defapp_heuristic_agenda_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_heuristic_agenda_base, value, TWELVE_INTEGER, FUTILE_CYCLE_COUNT);
    }

    public static final SubLObject get_cyblack_defapp_heuristic_agenda_base_terminate(SubLObject cyblack_defapp_heuristic_agenda_base) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_heuristic_agenda_base);
            SubLObject slot = slots.slot_assoc(TERMINATE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_heuristic_agenda_base, slot);
        }
        return classes.ldb_test($int$4098, subloop_structures.instance_boolean_slots(cyblack_defapp_heuristic_agenda_base));
    }

    public static final SubLObject set_cyblack_defapp_heuristic_agenda_base_terminate(SubLObject cyblack_defapp_heuristic_agenda_base, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_heuristic_agenda_base);
            SubLObject slot = slots.slot_assoc(TERMINATE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_heuristic_agenda_base, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_defapp_heuristic_agenda_base, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4098, subloop_structures.instance_boolean_slots(cyblack_defapp_heuristic_agenda_base)));
        return value;
    }

    public static final SubLObject get_cyblack_defapp_heuristic_agenda_base_agenda_trace_on(SubLObject cyblack_defapp_heuristic_agenda_base) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_heuristic_agenda_base);
            SubLObject slot = slots.slot_assoc(AGENDA_TRACE_ON, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_heuristic_agenda_base, slot);
        }
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(cyblack_defapp_heuristic_agenda_base));
    }

    public static final SubLObject set_cyblack_defapp_heuristic_agenda_base_agenda_trace_on(SubLObject cyblack_defapp_heuristic_agenda_base, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_heuristic_agenda_base);
            SubLObject slot = slots.slot_assoc(AGENDA_TRACE_ON, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_heuristic_agenda_base, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_defapp_heuristic_agenda_base, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(cyblack_defapp_heuristic_agenda_base)));
        return value;
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_execute_method(SubLObject self) {
        if (NIL != cyblack_defapp_heuristic_agenda_base_get_terminate_internal_method(self)) {
            methods.funcall_instance_method_with_0_args(cyblack_object.cyblack_object_get_application_method(self), HALT);
        } else {
            if (NIL != cyblack_defapp_heuristic_agenda_base_agenda_trace_on_p_method(self)) {
                {
                    SubLObject next_element = cyblack_agenda.cyblack_basic_simple_agenda_peek_method(self);
                    if (NIL != next_element) {
                        format(T, $str_alt40$__Executing___S__, next_element);
                        force_output(T);
                    }
                }
            }
            if (cyblack_agenda.cyblack_basic_simple_agenda_get_element_count_method(self).numE(ZERO_INTEGER)) {
                cyblack_defapp_heuristic_agenda_base_count_futile_cycle_method(self);
            } else {
                cyblack_defapp_heuristic_agenda_base_count_useful_cycle_method(self);
            }
        }
        return cyblack_agenda.cyblack_basic_simple_agenda_execute_method(self);
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_propose_method(SubLObject self, SubLObject proposal) {
        if (NIL != cyblack_defapp_heuristic_agenda_base_agenda_trace_on_p_method(self)) {
            format(T, $str_alt42$__Proposing___S__, proposal);
            force_output(T);
        }
        return cyblack_agenda.cyblack_basic_simple_agenda_propose_method(self, proposal);
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_set_terminate_method(SubLObject self, SubLObject new_state) {
        cyblack_defapp_heuristic_agenda_base_set_terminate_internal_method(self, NIL != new_state ? ((SubLObject) (T)) : NIL);
        return cyblack_defapp_heuristic_agenda_base_get_terminate_internal_method(self);
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_terminate_p_method(SubLObject self) {
        return cyblack_defapp_heuristic_agenda_base_get_terminate_internal_method(self);
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_toggle_agenda_trace_on_method(SubLObject self) {
        cyblack_defapp_heuristic_agenda_base_set_agenda_trace_on_internal_method(self, makeBoolean(NIL == cyblack_defapp_heuristic_agenda_base_get_agenda_trace_on_internal_method(self)));
        return cyblack_defapp_heuristic_agenda_base_get_agenda_trace_on_internal_method(self);
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_agenda_trace_on_p_method(SubLObject self) {
        return cyblack_defapp_heuristic_agenda_base_get_agenda_trace_on_internal_method(self);
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_count_useful_cycle_method(SubLObject self) {
        cyblack_defapp_heuristic_agenda_base_set_futile_cycle_count_internal_method(self, ZERO_INTEGER);
        return ZERO_INTEGER;
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_count_futile_cycle_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_defapp_heuristic_agenda_base_set_futile_cycle_count_internal_method(self, add(cyblack_defapp_heuristic_agenda_base_get_futile_cycle_count_internal_method(self), ONE_INTEGER));
            if (cyblack_defapp_heuristic_agenda_base_get_futile_cycle_count_internal_method(self).numGE(cyblack_defapp_heuristic_agenda_base_get_max_futile_cycles_internal_method(self))) {
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == cyblack_object.cyblack_object_get_application_method(self)) {
                        Errors.error($str_alt49$_COUNT_FUTILE_CYCLE__S___Attempte, self);
                    }
                }
                methods.funcall_instance_method_with_0_args(cyblack_object.cyblack_object_get_application_method(self), HALT);
                format(T, $str_alt50$__Halting_due_to__S_futile_cycles, cyblack_defapp_heuristic_agenda_base_get_futile_cycle_count_internal_method(self));
                force_output(T);
            }
            return cyblack_defapp_heuristic_agenda_base_get_futile_cycle_count_internal_method(self);
        }
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_set_max_futile_cycles_method(SubLObject self, SubLObject new_max_futile_cycles) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(new_max_futile_cycles.isInteger() && new_max_futile_cycles.numGE(ZERO_INTEGER))) {
                    Errors.error($str_alt52$_SET_MAX_FUTILE_CYCLES__S____S_is, self, new_max_futile_cycles);
                }
            }
            cyblack_defapp_heuristic_agenda_base_set_max_futile_cycles_internal_method(self, new_max_futile_cycles);
            return new_max_futile_cycles;
        }
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_get_max_futile_cycles_method(SubLObject self) {
        return cyblack_defapp_heuristic_agenda_base_get_max_futile_cycles_internal_method(self);
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_initialize_qua_defapp_agenda_extension_method(SubLObject self) {
        cyblack_defapp_heuristic_agenda_base_set_futile_cycle_count_internal_method(self, ZERO_INTEGER);
        cyblack_defapp_heuristic_agenda_base_set_max_futile_cycles_internal_method(self, $int$1000000000);
        cyblack_defapp_heuristic_agenda_base_set_agenda_trace_on_internal_method(self, NIL);
        return self;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_heuristic_agenda_base_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_HEURISTIC_AGENDA, HEURISTIC_EVALUATOR_CLASSES, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_heuristic_agenda_base_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, AGENDA_TRACE_ON, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, TERMINATE, NIL);
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
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_HEURISTIC_AGENDA, HEURISTIC_EVALUATOR_REGISTRY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, FUTILE_CYCLE_COUNT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, MAX_FUTILE_CYCLES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_p(SubLObject cyblack_defapp_heuristic_agenda_base) {
        return classes.subloop_instanceof_class(cyblack_defapp_heuristic_agenda_base, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE);
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_get_futile_cycle_count_internal_method(SubLObject self) {
        {
            SubLObject futile_cycle_count = get_cyblack_defapp_heuristic_agenda_base_futile_cycle_count(self);
            return futile_cycle_count;
        }
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_set_futile_cycle_count_internal_method(SubLObject self, SubLObject new_count) {
        {
            SubLObject catch_var_for_cyblack_defapp_heuristic_agenda_base_method = NIL;
            SubLObject futile_cycle_count = get_cyblack_defapp_heuristic_agenda_base_futile_cycle_count(self);
            try {
                try {
                    futile_cycle_count = new_count;
                    sublisp_throw($sym128$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD, new_count);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_heuristic_agenda_base_futile_cycle_count(self, futile_cycle_count);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_heuristic_agenda_base_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_heuristic_agenda_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_get_max_futile_cycles_internal_method(SubLObject self) {
        {
            SubLObject max_futile_cycles = get_cyblack_defapp_heuristic_agenda_base_max_futile_cycles(self);
            return max_futile_cycles;
        }
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_set_max_futile_cycles_internal_method(SubLObject self, SubLObject cycles) {
        {
            SubLObject catch_var_for_cyblack_defapp_heuristic_agenda_base_method = NIL;
            SubLObject max_futile_cycles = get_cyblack_defapp_heuristic_agenda_base_max_futile_cycles(self);
            try {
                try {
                    max_futile_cycles = cycles;
                    sublisp_throw($sym131$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD, cycles);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_heuristic_agenda_base_max_futile_cycles(self, max_futile_cycles);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_heuristic_agenda_base_method = Errors.handleThrowable(ccatch_env_var, $sym131$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_heuristic_agenda_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_get_agenda_trace_on_internal_method(SubLObject self) {
        {
            SubLObject agenda_trace_on = get_cyblack_defapp_heuristic_agenda_base_agenda_trace_on(self);
            return agenda_trace_on;
        }
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_set_agenda_trace_on_internal_method(SubLObject self, SubLObject new_value) {
        {
            SubLObject catch_var_for_cyblack_defapp_heuristic_agenda_base_method = NIL;
            SubLObject agenda_trace_on = get_cyblack_defapp_heuristic_agenda_base_agenda_trace_on(self);
            try {
                try {
                    agenda_trace_on = new_value;
                    sublisp_throw($sym134$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD, new_value);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_heuristic_agenda_base_agenda_trace_on(self, agenda_trace_on);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_heuristic_agenda_base_method = Errors.handleThrowable(ccatch_env_var, $sym134$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_heuristic_agenda_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_get_terminate_internal_method(SubLObject self) {
        {
            SubLObject terminate = get_cyblack_defapp_heuristic_agenda_base_terminate(self);
            return terminate;
        }
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_set_terminate_internal_method(SubLObject self, SubLObject new_value) {
        {
            SubLObject catch_var_for_cyblack_defapp_heuristic_agenda_base_method = NIL;
            SubLObject terminate = get_cyblack_defapp_heuristic_agenda_base_terminate(self);
            try {
                try {
                    terminate = new_value;
                    sublisp_throw($sym137$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD, new_value);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_heuristic_agenda_base_terminate(self, terminate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_heuristic_agenda_base_method = Errors.handleThrowable(ccatch_env_var, $sym137$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_heuristic_agenda_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_heuristic_agenda_base_initialize_method(SubLObject self) {
        cyblack_heuristic_agenda.cyblack_basic_heuristic_agenda_initialize_method(self);
        cyblack_defapp_heuristic_agenda_base_initialize_qua_defapp_agenda_extension_method(self);
        return self;
    }

    public static final SubLObject cyblack_defapp_agenda_get_max_futile_cycles(SubLObject cyblack_defapp_agenda_extension) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_extension_p(cyblack_defapp_agenda_extension)) {
                    Errors.error($str_alt140$CYBLACK_DEFAPP_AGENDA_GET_MAX_FUT, cyblack_defapp_agenda_extension);
                }
            }
            if (NIL != cyblack_defapp_heuristic_agenda_base_p(cyblack_defapp_agenda_extension)) {
                return cyblack_defapp_heuristic_agenda_base_get_max_futile_cycles_method(cyblack_defapp_agenda_extension);
            } else
                if (NIL != cyblack_defapp_agenda_base_p(cyblack_defapp_agenda_extension)) {
                    return cyblack_defapp_agenda_base_get_max_futile_cycles_method(cyblack_defapp_agenda_extension);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_defapp_agenda_extension, GET_MAX_FUTILE_CYCLES);
                }

        }
    }

    public static final SubLObject cyblack_defapp_agenda_set_max_futile_cycles(SubLObject cyblack_defapp_agenda_extension, SubLObject new_max_futile_cycles) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_extension_p(cyblack_defapp_agenda_extension)) {
                    Errors.error($str_alt141$CYBLACK_DEFAPP_AGENDA_SET_MAX_FUT, cyblack_defapp_agenda_extension);
                }
            }
            if (NIL != cyblack_defapp_heuristic_agenda_base_p(cyblack_defapp_agenda_extension)) {
                return cyblack_defapp_heuristic_agenda_base_set_max_futile_cycles_method(cyblack_defapp_agenda_extension, new_max_futile_cycles);
            } else
                if (NIL != cyblack_defapp_agenda_base_p(cyblack_defapp_agenda_extension)) {
                    return cyblack_defapp_agenda_base_set_max_futile_cycles_method(cyblack_defapp_agenda_extension, new_max_futile_cycles);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_defapp_agenda_extension, SET_MAX_FUTILE_CYCLES, new_max_futile_cycles);
                }

        }
    }

    public static final SubLObject cyblack_defapp_agenda_count_futile_cycle(SubLObject cyblack_defapp_agenda_extension) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_extension_p(cyblack_defapp_agenda_extension)) {
                    Errors.error($str_alt142$CYBLACK_DEFAPP_AGENDA_COUNT_FUTIL, cyblack_defapp_agenda_extension);
                }
            }
            if (NIL != cyblack_defapp_heuristic_agenda_base_p(cyblack_defapp_agenda_extension)) {
                return cyblack_defapp_heuristic_agenda_base_count_futile_cycle_method(cyblack_defapp_agenda_extension);
            } else
                if (NIL != cyblack_defapp_agenda_base_p(cyblack_defapp_agenda_extension)) {
                    return cyblack_defapp_agenda_base_count_futile_cycle_method(cyblack_defapp_agenda_extension);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_defapp_agenda_extension, COUNT_FUTILE_CYCLE);
                }

        }
    }

    public static final SubLObject cyblack_defapp_agenda_count_useful_cycle(SubLObject cyblack_defapp_agenda_extension) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_extension_p(cyblack_defapp_agenda_extension)) {
                    Errors.error($str_alt143$CYBLACK_DEFAPP_AGENDA_COUNT_USEFU, cyblack_defapp_agenda_extension);
                }
            }
            if (NIL != cyblack_defapp_heuristic_agenda_base_p(cyblack_defapp_agenda_extension)) {
                return cyblack_defapp_heuristic_agenda_base_count_useful_cycle_method(cyblack_defapp_agenda_extension);
            } else
                if (NIL != cyblack_defapp_agenda_base_p(cyblack_defapp_agenda_extension)) {
                    return cyblack_defapp_agenda_base_count_useful_cycle_method(cyblack_defapp_agenda_extension);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_defapp_agenda_extension, COUNT_USEFUL_CYCLE);
                }

        }
    }

    public static final SubLObject cyblack_defapp_agenda_agenda_trace_on_p(SubLObject cyblack_defapp_agenda_extension) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_extension_p(cyblack_defapp_agenda_extension)) {
                    Errors.error($str_alt144$CYBLACK_DEFAPP_AGENDA_AGENDA_TRAC, cyblack_defapp_agenda_extension);
                }
            }
            if (NIL != cyblack_defapp_heuristic_agenda_base_p(cyblack_defapp_agenda_extension)) {
                return cyblack_defapp_heuristic_agenda_base_agenda_trace_on_p_method(cyblack_defapp_agenda_extension);
            } else
                if (NIL != cyblack_defapp_agenda_base_p(cyblack_defapp_agenda_extension)) {
                    return cyblack_defapp_agenda_base_agenda_trace_on_p_method(cyblack_defapp_agenda_extension);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_defapp_agenda_extension, AGENDA_TRACE_ON_P);
                }

        }
    }

    public static final SubLObject cyblack_defapp_agenda_toggle_agenda_trace_on(SubLObject cyblack_defapp_agenda_extension) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_extension_p(cyblack_defapp_agenda_extension)) {
                    Errors.error($str_alt145$CYBLACK_DEFAPP_AGENDA_TOGGLE_AGEN, cyblack_defapp_agenda_extension);
                }
            }
            if (NIL != cyblack_defapp_heuristic_agenda_base_p(cyblack_defapp_agenda_extension)) {
                return cyblack_defapp_heuristic_agenda_base_toggle_agenda_trace_on_method(cyblack_defapp_agenda_extension);
            } else
                if (NIL != cyblack_defapp_agenda_base_p(cyblack_defapp_agenda_extension)) {
                    return cyblack_defapp_agenda_base_toggle_agenda_trace_on_method(cyblack_defapp_agenda_extension);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_defapp_agenda_extension, TOGGLE_AGENDA_TRACE_ON);
                }

        }
    }

    public static final SubLObject cyblack_defapp_agenda_terminate_p(SubLObject cyblack_defapp_agenda_extension) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_extension_p(cyblack_defapp_agenda_extension)) {
                    Errors.error($str_alt146$CYBLACK_DEFAPP_AGENDA_TERMINATE_P, cyblack_defapp_agenda_extension);
                }
            }
            if (NIL != cyblack_defapp_heuristic_agenda_base_p(cyblack_defapp_agenda_extension)) {
                return cyblack_defapp_heuristic_agenda_base_terminate_p_method(cyblack_defapp_agenda_extension);
            } else
                if (NIL != cyblack_defapp_agenda_base_p(cyblack_defapp_agenda_extension)) {
                    return cyblack_defapp_agenda_base_terminate_p_method(cyblack_defapp_agenda_extension);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_defapp_agenda_extension, TERMINATE_P);
                }

        }
    }

    public static final SubLObject cyblack_defapp_agenda_set_terminate(SubLObject cyblack_defapp_agenda_extension, SubLObject new_state) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_extension_p(cyblack_defapp_agenda_extension)) {
                    Errors.error($str_alt147$CYBLACK_DEFAPP_AGENDA_SET_TERMINA, cyblack_defapp_agenda_extension);
                }
            }
            if (NIL != cyblack_defapp_heuristic_agenda_base_p(cyblack_defapp_agenda_extension)) {
                return cyblack_defapp_heuristic_agenda_base_set_terminate_method(cyblack_defapp_agenda_extension, new_state);
            } else
                if (NIL != cyblack_defapp_agenda_base_p(cyblack_defapp_agenda_extension)) {
                    return cyblack_defapp_agenda_base_set_terminate_method(cyblack_defapp_agenda_extension, new_state);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_defapp_agenda_extension, SET_TERMINATE, new_state);
                }

        }
    }

    public static final SubLObject cyblack_defapp_agenda_propose(SubLObject cyblack_defapp_agenda_extension, SubLObject proposal) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_extension_p(cyblack_defapp_agenda_extension)) {
                    Errors.error($str_alt148$CYBLACK_DEFAPP_AGENDA_PROPOSE___S, cyblack_defapp_agenda_extension);
                }
            }
            if (NIL != cyblack_defapp_heuristic_agenda_base_p(cyblack_defapp_agenda_extension)) {
                return cyblack_defapp_heuristic_agenda_base_propose_method(cyblack_defapp_agenda_extension, proposal);
            } else
                if (NIL != cyblack_defapp_agenda_base_p(cyblack_defapp_agenda_extension)) {
                    return cyblack_defapp_agenda_base_propose_method(cyblack_defapp_agenda_extension, proposal);
                } else {
                    return methods.funcall_instance_method_with_1_args(cyblack_defapp_agenda_extension, PROPOSE, proposal);
                }

        }
    }

    public static final SubLObject cyblack_defapp_agenda_execute(SubLObject cyblack_defapp_agenda_extension) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_extension_p(cyblack_defapp_agenda_extension)) {
                    Errors.error($str_alt149$CYBLACK_DEFAPP_AGENDA_EXECUTE___S, cyblack_defapp_agenda_extension);
                }
            }
            if (NIL != cyblack_defapp_heuristic_agenda_base_p(cyblack_defapp_agenda_extension)) {
                return cyblack_defapp_heuristic_agenda_base_execute_method(cyblack_defapp_agenda_extension);
            } else
                if (NIL != cyblack_defapp_agenda_base_p(cyblack_defapp_agenda_extension)) {
                    return cyblack_defapp_agenda_base_execute_method(cyblack_defapp_agenda_extension);
                } else {
                    return methods.funcall_instance_method_with_0_args(cyblack_defapp_agenda_extension, EXECUTE);
                }

        }
    }

    public static final SubLObject get_cyblack_defapp_base_terminate(SubLObject cyblack_defapp_base) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_base);
            SubLObject slot = slots.slot_assoc(TERMINATE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_base, slot);
        }
        return classes.ldb_test($int$4099, subloop_structures.instance_boolean_slots(cyblack_defapp_base));
    }

    public static final SubLObject set_cyblack_defapp_base_terminate(SubLObject cyblack_defapp_base, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_base);
            SubLObject slot = slots.slot_assoc(TERMINATE, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_base, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_defapp_base, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4099, subloop_structures.instance_boolean_slots(cyblack_defapp_base)));
        return value;
    }

    public static final SubLObject get_cyblack_defapp_base_delay_standard_initialization_p(SubLObject cyblack_defapp_base) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_base);
            SubLObject slot = slots.slot_assoc(DELAY_STANDARD_INITIALIZATION_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_base, slot);
        }
        return classes.ldb_test($int$4098, subloop_structures.instance_boolean_slots(cyblack_defapp_base));
    }

    public static final SubLObject set_cyblack_defapp_base_delay_standard_initialization_p(SubLObject cyblack_defapp_base, SubLObject value) {
        {
            SubLObject v_class = subloop_structures.instance_class(cyblack_defapp_base);
            SubLObject slot = slots.slot_assoc(DELAY_STANDARD_INITIALIZATION_P, subloop_structures.class_compiled_instance_boolean_slot_access_alist(v_class));
            instances.instances_access_check_instance_slot(v_class, cyblack_defapp_base, slot);
        }
        subloop_structures._csetf_instance_boolean_slots(cyblack_defapp_base, bytes.dpb(NIL != value ? ((SubLObject) (ONE_INTEGER)) : ZERO_INTEGER, $int$4098, subloop_structures.instance_boolean_slots(cyblack_defapp_base)));
        return value;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_base_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_base_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, HALT_STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, DELAY_STANDARD_INITIALIZATION_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, TERMINATE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, DATATYPE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CURRENT_SESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_CONNECTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CONNECTION_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PORT_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_MODULE_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, INCOMING_MESSAGE_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_base_p(SubLObject cyblack_defapp_base) {
        return classes.subloop_instanceof_class(cyblack_defapp_base, CYBLACK_DEFAPP_BASE);
    }

    public static final SubLObject cyblack_defapp_base_initialize_method(SubLObject self) {
        {
            SubLObject incoming_message_queue = cyblack_application.get_cyblack_basic_application_incoming_message_queue(self);
            SubLObject external_module_table = cyblack_application.get_cyblack_basic_application_external_module_table(self);
            SubLObject root_datatype_name = cyblack_application.get_cyblack_basic_application_root_datatype_name(self);
            SubLObject root_datatype = cyblack_application.get_cyblack_basic_application_root_datatype(self);
            SubLObject current_session = cyblack_application.get_cyblack_basic_application_current_session(self);
            SubLObject datatype_dictionary = cyblack_application.get_cyblack_basic_application_datatype_dictionary(self);
            SubLObject v_agenda = cyblack_application.get_cyblack_basic_application_agenda(self);
            SubLObject blackboard = cyblack_application.get_cyblack_basic_application_blackboard(self);
            SubLObject knowledge_source_battery = cyblack_application.get_cyblack_basic_application_knowledge_source_battery(self);
            SubLObject application_name = cyblack_application.get_cyblack_basic_application_application_name(self);
            SubLObject application = cyblack_object.get_cyblack_object_application(self);
            SubLObject halt_status = cyblack_application.get_cyblack_basic_application_halt_status(self);
            cyblack_application.$cyblack_application$.setDynamicValue(self);
            cyblack_application.set_cyblack_basic_application_application_id(self, cyblack_processes.cyblack_allocate_application_id());
            cyblack_lockable.cyblack_basic_lockable_initialize_method(self);
            incoming_message_queue = object.new_class_instance(ASYNCH_BASIC_DOUBLY_LINKED_QUEUE);
            cyblack_application.set_cyblack_basic_application_incoming_message_queue(self, incoming_message_queue);
            external_module_table = cyblack_external_module_table.new_external_module_table(self);
            cyblack_application.set_cyblack_basic_application_external_module_table(self, external_module_table);
            halt_status = NIL;
            cyblack_application.set_cyblack_basic_application_halt_status(self, halt_status);
            application = self;
            cyblack_object.set_cyblack_object_application(self, application);
            application_name = $str_alt182$;
            cyblack_application.set_cyblack_basic_application_application_name(self, application_name);
            knowledge_source_battery = NIL;
            cyblack_application.set_cyblack_basic_application_knowledge_source_battery(self, knowledge_source_battery);
            blackboard = NIL;
            cyblack_application.set_cyblack_basic_application_blackboard(self, blackboard);
            v_agenda = NIL;
            cyblack_application.set_cyblack_basic_application_agenda(self, v_agenda);
            datatype_dictionary = methods.funcall_class_method_with_0_args(CYBLACK_BASIC_DATATYPE_DICTIONARY, NEW);
            cyblack_application.set_cyblack_basic_application_datatype_dictionary(self, datatype_dictionary);
            methods.funcall_instance_method_with_1_args(datatype_dictionary, SET_APPLICATION, self);
            root_datatype_name = $$$POSTING;
            cyblack_application.set_cyblack_basic_application_root_datatype_name(self, root_datatype_name);
            root_datatype = cyblack_datatype_dictionary.cyblack_declare_root_type(datatype_dictionary, root_datatype_name, CYBLACK_BASIC_POSTING, CYBLACK_BASIC_PANEL);
            cyblack_application.set_cyblack_basic_application_root_datatype(self, root_datatype);
            current_session = methods.funcall_class_method_with_0_args(CYBLACK_SESSION, NEW);
            cyblack_application.set_cyblack_basic_application_current_session(self, current_session);
            methods.funcall_instance_method_with_1_args(current_session, SET_APPLICATION, self);
            cyblack_application.cyblack_basic_application_set_agenda_class_method(self, CYBLACK_DEFAPP_AGENDA_BASE);
            cyblack_application.cyblack_basic_application_set_blackboard_class_method(self, CYBLACK_BASIC_BLACKBOARD);
            cyblack_application.cyblack_basic_application_set_parser_class_method(self, CYBLACK_PARSER);
            if (NIL == get_cyblack_defapp_base_delay_standard_initialization_p(self)) {
                cyblack_application.cyblack_basic_application_standard_initialization_method(self);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_defapp_base_generated_on_startup_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_defapp_base_user_on_startup_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_defapp_base_on_startup_method(SubLObject self) {
        cyblack_application.cyblack_basic_application_on_startup_method(self);
        methods.funcall_instance_method_with_0_args(self, GENERATED_ON_STARTUP);
        methods.funcall_instance_method_with_0_args(self, USER_ON_STARTUP);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_base_generated_on_shutdown_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_defapp_base_user_on_shutdown_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_defapp_base_on_shutdown_method(SubLObject self) {
        cyblack_application.cyblack_basic_application_on_shutdown_method(self);
        methods.funcall_instance_method_with_0_args(self, GENERATED_ON_SHUTDOWN);
        methods.funcall_instance_method_with_0_args(self, USER_ON_SHUTDOWN);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_base_terminate_p_method(SubLObject self) {
        {
            SubLObject terminate = get_cyblack_defapp_base_terminate(self);
            return terminate;
        }
    }

    public static final SubLObject cyblack_defapp_base_set_terminate_method(SubLObject self, SubLObject new_state) {
        {
            SubLObject catch_var_for_cyblack_defapp_base_method = NIL;
            SubLObject v_agenda = cyblack_application.get_cyblack_basic_application_agenda(self);
            SubLObject terminate = get_cyblack_defapp_base_terminate(self);
            try {
                try {
                    terminate = (NIL != new_state) ? ((SubLObject) (T)) : NIL;
                    if ((NIL != v_agenda) && (NIL != cyblack_defapp_agenda_extension_p(v_agenda))) {
                        cyblack_defapp_agenda_set_terminate(v_agenda, new_state);
                    }
                    sublisp_throw($sym211$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BASE_METHOD, terminate);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_application.set_cyblack_basic_application_agenda(self, v_agenda);
                            set_cyblack_defapp_base_terminate(self, terminate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_base_method = Errors.handleThrowable(ccatch_env_var, $sym211$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_base_method;
        }
    }

    public static final SubLObject get_cyblack_application_process_scheduler_application(SubLObject cyblack_application_process_scheduler) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_application_process_scheduler, THREE_INTEGER, APPLICATION);
    }

    public static final SubLObject set_cyblack_application_process_scheduler_application(SubLObject cyblack_application_process_scheduler, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_application_process_scheduler, value, THREE_INTEGER, APPLICATION);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_application_process_scheduler_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_application_process_scheduler_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, HALTED_P, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, TRACE_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, TRANSFER_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_MULTI_TASK_SCHEDULER, PROCESS_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_PROCESS_SCHEDULER, APPLICATION, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_application_process_scheduler_p(SubLObject cyblack_application_process_scheduler) {
        return classes.subloop_instanceof_class(cyblack_application_process_scheduler, CYBLACK_APPLICATION_PROCESS_SCHEDULER);
    }

    public static final SubLObject cyblack_application_process_scheduler_initialize_method(SubLObject self) {
        subloop_processes.basic_multi_task_scheduler_initialize_method(self);
        subloop_queues.basic_doubly_linked_queue_set_prioritizer_method(subloop_processes.get_basic_multi_task_scheduler_process_queue(self), object.new_class_instance(CYBLACK_APPLICATION_PROCESS_SORTER));
        subloop_processes.set_basic_multi_task_scheduler_trace_p(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_application_process_scheduler_get_application_method(SubLObject self) {
        {
            SubLObject application = get_cyblack_application_process_scheduler_application(self);
            return application;
        }
    }

    public static final SubLObject cyblack_application_process_scheduler_set_application_method(SubLObject self, SubLObject new_application) {
        {
            SubLObject catch_var_for_cyblack_application_process_scheduler_method = NIL;
            SubLObject application = get_cyblack_application_process_scheduler_application(self);
            try {
                try {
                    application = new_application;
                    {
                        SubLObject cdolist_list_var = subloop_processes.basic_multi_task_scheduler_get_all_tasks_method(self);
                        SubLObject task = NIL;
                        for (task = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , task = cdolist_list_var.first()) {
                            if (NIL != cyblack_application_uniprocess_p(task)) {
                                cyblack_application_uniprocess_set_application_method(task, new_application);
                            }
                        }
                    }
                    sublisp_throw($sym231$OUTER_CATCH_FOR_CYBLACK_APPLICATION_PROCESS_SCHEDULER_METHOD, new_application);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_application_process_scheduler_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_application_process_scheduler_method = Errors.handleThrowable(ccatch_env_var, $sym231$OUTER_CATCH_FOR_CYBLACK_APPLICATION_PROCESS_SCHEDULER_METHOD);
            }
            return catch_var_for_cyblack_application_process_scheduler_method;
        }
    }

    public static final SubLObject cyblack_application_process_scheduler_add_task_method(SubLObject self, SubLObject subloop_process) {
        subloop_processes.basic_multi_task_scheduler_add_task_method(self, subloop_process);
        methods.funcall_instance_method_with_1_args(subloop_process, SET_APPLICATION, cyblack_application_process_scheduler_get_application_method(self));
        return subloop_process;
    }

    public static final SubLObject cyblack_application_process_scheduler_perform_trace_method(SubLObject self, SubLObject process) {
        if ((NIL != process) && (NIL != cyblack_application_uniprocess_p(process))) {
            format(T, $str_alt240$_C, instances.get_slot(process, SYMBOLIC_REP));
            force_output(T);
        }
        return NIL;
    }

    public static final SubLObject cyblack_application_process_scheduler_on_nothing_to_do_method(SubLObject self) {
        subloop_processes.basic_multi_task_scheduler_on_nothing_to_do_method(self);
        return self;
    }

    public static final SubLObject get_cyblack_application_uniprocess_symbolic_rep(SubLObject cyblack_application_uniprocess) {
        return classes.subloop_get_instance_slot(cyblack_application_uniprocess, SEVEN_INTEGER);
    }

    public static final SubLObject set_cyblack_application_uniprocess_symbolic_rep(SubLObject cyblack_application_uniprocess, SubLObject value) {
        return classes.subloop_set_instance_slot(cyblack_application_uniprocess, value, SEVEN_INTEGER);
    }

    public static final SubLObject get_cyblack_application_uniprocess_process_scheduler(SubLObject cyblack_application_uniprocess) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_application_uniprocess, SIX_INTEGER, PROCESS_SCHEDULER);
    }

    public static final SubLObject set_cyblack_application_uniprocess_process_scheduler(SubLObject cyblack_application_uniprocess, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_application_uniprocess, value, SIX_INTEGER, PROCESS_SCHEDULER);
    }

    public static final SubLObject get_cyblack_application_uniprocess_application(SubLObject cyblack_application_uniprocess) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_application_uniprocess, FIVE_INTEGER, APPLICATION);
    }

    public static final SubLObject set_cyblack_application_uniprocess_application(SubLObject cyblack_application_uniprocess, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_application_uniprocess, value, FIVE_INTEGER, APPLICATION);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_application_uniprocess_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_application_uniprocess_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, PROCESS_SCHEDULER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, SYMBOLIC_REP, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_application_uniprocess_p(SubLObject cyblack_application_uniprocess) {
        return classes.subloop_instanceof_class(cyblack_application_uniprocess, CYBLACK_APPLICATION_UNIPROCESS);
    }

    public static final SubLObject cyblack_application_uniprocess_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_application_uniprocess_method = NIL;
            SubLObject symbolic_rep = get_cyblack_application_uniprocess_symbolic_rep(self);
            SubLObject process_scheduler = get_cyblack_application_uniprocess_process_scheduler(self);
            SubLObject application = get_cyblack_application_uniprocess_application(self);
            try {
                try {
                    subloop_processes.basic_subloop_process_initialize_method(self);
                    application = NIL;
                    process_scheduler = NIL;
                    symbolic_rep = CHAR_question;
                    sublisp_throw($sym256$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_application_uniprocess_symbolic_rep(self, symbolic_rep);
                            set_cyblack_application_uniprocess_process_scheduler(self, process_scheduler);
                            set_cyblack_application_uniprocess_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_application_uniprocess_method = Errors.handleThrowable(ccatch_env_var, $sym256$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD);
            }
            return catch_var_for_cyblack_application_uniprocess_method;
        }
    }

    public static final SubLObject cyblack_application_uniprocess_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_application_uniprocess_method = NIL;
            SubLObject status = subloop_processes.get_basic_subloop_process_status(self);
            SubLObject name = subloop_processes.get_basic_subloop_process_name(self);
            try {
                try {
                    format(stream, $str_alt262$__CYBLACK_APPLICATION_UNIPROCESS_, name, status);
                    sublisp_throw($sym261$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            subloop_processes.set_basic_subloop_process_status(self, status);
                            subloop_processes.set_basic_subloop_process_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_application_uniprocess_method = Errors.handleThrowable(ccatch_env_var, $sym261$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD);
            }
            return catch_var_for_cyblack_application_uniprocess_method;
        }
    }

    public static final SubLObject cyblack_application_uniprocess_get_application_method(SubLObject self) {
        {
            SubLObject application = get_cyblack_application_uniprocess_application(self);
            return application;
        }
    }

    public static final SubLObject cyblack_application_uniprocess_set_application_method(SubLObject self, SubLObject new_application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_application_uniprocess_method = NIL;
                SubLObject application = get_cyblack_application_uniprocess_application(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_application) || (NIL != cyblack_uniprocess_defapp_base_p(new_application)))) {
                                Errors.error($str_alt267$_SET_APPLICATION__S____S_is_not_a, self, new_application);
                            }
                        }
                        application = new_application;
                        if (NIL != application) {
                            cyblack_application_uniprocess_set_process_scheduler_method(self, cyblack_uniprocess_defapp_base_get_process_scheduler_method(application));
                        }
                        sublisp_throw($sym266$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD, new_application);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_application_uniprocess_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_application_uniprocess_method = Errors.handleThrowable(ccatch_env_var, $sym266$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD);
                }
                return catch_var_for_cyblack_application_uniprocess_method;
            }
        }
    }

    public static final SubLObject cyblack_application_uniprocess_get_process_scheduler_method(SubLObject self) {
        {
            SubLObject process_scheduler = get_cyblack_application_uniprocess_process_scheduler(self);
            SubLObject application = get_cyblack_application_uniprocess_application(self);
            if (NIL != process_scheduler) {
                return process_scheduler;
            } else {
                return NIL != application ? ((SubLObject) (cyblack_uniprocess_defapp_base_get_process_scheduler_method(application))) : NIL;
            }
        }
    }

    public static final SubLObject cyblack_application_uniprocess_set_process_scheduler_method(SubLObject self, SubLObject new_process_scheduler) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_application_uniprocess_method = NIL;
                SubLObject process_scheduler = get_cyblack_application_uniprocess_process_scheduler(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_process_scheduler) || (NIL != subloop_processes.basic_multi_task_scheduler_p(new_process_scheduler)))) {
                                Errors.error($str_alt276$_SET_PROCESS_SCHEDULER__S____S_is, self, new_process_scheduler);
                            }
                        }
                        process_scheduler = new_process_scheduler;
                        sublisp_throw($sym275$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD, new_process_scheduler);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_application_uniprocess_process_scheduler(self, process_scheduler);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_application_uniprocess_method = Errors.handleThrowable(ccatch_env_var, $sym275$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD);
                }
                return catch_var_for_cyblack_application_uniprocess_method;
            }
        }
    }

    public static final SubLObject cyblack_application_uniprocess_get_priority_method(SubLObject self) {
        return multiply(NIL != methods.funcall_instance_method_with_0_args(self, $sym280$NOTHING_TO_DO_) ? ((SubLObject) (ZERO_INTEGER)) : ONE_INTEGER, subloop_processes.basic_subloop_process_get_priority_method(self));
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_application_process_sorter_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_application_process_sorter_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE_SIMPLE_SORTER, SORT_PREDICATE, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_QUEUE_SIMPLE_SORTER, ELEMENT_KEY_FUNCTION, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_application_process_sorter_p(SubLObject cyblack_application_process_sorter) {
        return classes.subloop_instanceof_class(cyblack_application_process_sorter, CYBLACK_APPLICATION_PROCESS_SORTER);
    }

    public static final SubLObject cyblack_application_process_sorter_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_application_process_sorter_method = NIL;
            SubLObject element_key_function = subloop_queues.get_basic_queue_simple_sorter_element_key_function(self);
            SubLObject sort_predicate = subloop_queues.get_basic_queue_simple_sorter_sort_predicate(self);
            try {
                try {
                    subloop_queues.basic_queue_simple_sorter_initialize_method(self);
                    sort_predicate = symbol_function($sym290$_);
                    element_key_function = methods.resolve_method(GET_PRIORITY, CYBLACK_APPLICATION_UNIPROCESS);
                    sublisp_throw($sym289$OUTER_CATCH_FOR_CYBLACK_APPLICATION_PROCESS_SORTER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            subloop_queues.set_basic_queue_simple_sorter_element_key_function(self, element_key_function);
                            subloop_queues.set_basic_queue_simple_sorter_sort_predicate(self, sort_predicate);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_application_process_sorter_method = Errors.handleThrowable(ccatch_env_var, $sym289$OUTER_CATCH_FOR_CYBLACK_APPLICATION_PROCESS_SORTER_METHOD);
            }
            return catch_var_for_cyblack_application_process_sorter_method;
        }
    }

    /**
     * Enumerated values of type CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_uniprocess_application_main_loop_stage_types$ = makeSymbol("*VALID-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_uniprocess_application_main_loop_stage_types() {
        return $valid_cyblack_uniprocess_application_main_loop_stage_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_uniprocess_application_main_loop_stage_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_uniprocess_application_main_loop_stage_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_uniprocess_application_main_loop_stage_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_uniprocess_application_main_loop_stage_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt294$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE, value, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_uniprocess_application_main_loop_stage_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_uniprocess_application_main_loop_stage_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt296$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE, value, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_uniprocess_application_main_loop_stage_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_uniprocess_application_main_loop_stage_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE_P, value1, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_uniprocess_application_main_loop_stage_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE_P, value2, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_uniprocess_application_main_loop_stage_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_uniprocess_application_main_loop_stage_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_uniprocess_application_main_loop_stage_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE_P, value1, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_uniprocess_application_main_loop_stage_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE_P, value2, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_uniprocess_application_main_loop_stage_types$.getGlobalValue();
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

    public static final SubLObject get_cyblack_uniprocess_application_main_loop_agenda(SubLObject cyblack_uniprocess_application_main_loop) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_uniprocess_application_main_loop, NINE_INTEGER, AGENDA);
    }

    public static final SubLObject set_cyblack_uniprocess_application_main_loop_agenda(SubLObject cyblack_uniprocess_application_main_loop, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_uniprocess_application_main_loop, value, NINE_INTEGER, AGENDA);
    }

    public static final SubLObject get_cyblack_uniprocess_application_main_loop_processing_stage(SubLObject cyblack_uniprocess_application_main_loop) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_uniprocess_application_main_loop, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject set_cyblack_uniprocess_application_main_loop_processing_stage(SubLObject cyblack_uniprocess_application_main_loop, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_uniprocess_application_main_loop, value, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_uniprocess_application_main_loop_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_uniprocess_application_main_loop_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, PROCESS_SCHEDULER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, SYMBOLIC_REP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, PROCESSING_STAGE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, AGENDA, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_uniprocess_application_main_loop_p(SubLObject cyblack_uniprocess_application_main_loop) {
        return classes.subloop_instanceof_class(cyblack_uniprocess_application_main_loop, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP);
    }

    public static final SubLObject cyblack_uniprocess_application_main_loop_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_uniprocess_application_main_loop_method = NIL;
            SubLObject v_agenda = get_cyblack_uniprocess_application_main_loop_agenda(self);
            SubLObject processing_stage = get_cyblack_uniprocess_application_main_loop_processing_stage(self);
            SubLObject symbolic_rep = get_cyblack_application_uniprocess_symbolic_rep(self);
            SubLObject priority = subloop_processes.get_basic_subloop_process_priority(self);
            try {
                try {
                    cyblack_application_uniprocess_initialize_method(self);
                    priority = $int$100;
                    processing_stage = $UNINITIALIZED;
                    v_agenda = NIL;
                    symbolic_rep = CHAR_M;
                    sublisp_throw($sym306$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_uniprocess_application_main_loop_agenda(self, v_agenda);
                            set_cyblack_uniprocess_application_main_loop_processing_stage(self, processing_stage);
                            set_cyblack_application_uniprocess_symbolic_rep(self, symbolic_rep);
                            subloop_processes.set_basic_subloop_process_priority(self, priority);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_uniprocess_application_main_loop_method = Errors.handleThrowable(ccatch_env_var, $sym306$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD);
            }
            return catch_var_for_cyblack_uniprocess_application_main_loop_method;
        }
    }

    public static final SubLObject cyblack_uniprocess_application_main_loop_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_uniprocess_application_main_loop_method = NIL;
            SubLObject status = subloop_processes.get_basic_subloop_process_status(self);
            SubLObject name = subloop_processes.get_basic_subloop_process_name(self);
            try {
                try {
                    format(stream, $str_alt312$__CYBLACK_UNIPROCESS_APPLICATION_, name, status);
                    sublisp_throw($sym311$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            subloop_processes.set_basic_subloop_process_status(self, status);
                            subloop_processes.set_basic_subloop_process_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_uniprocess_application_main_loop_method = Errors.handleThrowable(ccatch_env_var, $sym311$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD);
            }
            return catch_var_for_cyblack_uniprocess_application_main_loop_method;
        }
    }

    public static final SubLObject cyblack_uniprocess_application_main_loop_get_processing_stage_method(SubLObject self) {
        {
            SubLObject processing_stage = get_cyblack_uniprocess_application_main_loop_processing_stage(self);
            return processing_stage;
        }
    }

    public static final SubLObject cyblack_uniprocess_application_main_loop_set_processing_stage_method(SubLObject self, SubLObject new_processing_stage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_uniprocess_application_main_loop_method = NIL;
                SubLObject processing_stage = get_cyblack_uniprocess_application_main_loop_processing_stage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_uniprocess_application_main_loop_stage_type_p(new_processing_stage)) {
                                Errors.error($str_alt321$_SET_PROCESSING_STAGE__S____S_is_, self, new_processing_stage);
                            }
                        }
                        processing_stage = new_processing_stage;
                        sublisp_throw($sym320$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD, new_processing_stage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_uniprocess_application_main_loop_processing_stage(self, processing_stage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_uniprocess_application_main_loop_method = Errors.handleThrowable(ccatch_env_var, $sym320$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD);
                }
                return catch_var_for_cyblack_uniprocess_application_main_loop_method;
            }
        }
    }

    public static final SubLObject cyblack_uniprocess_application_main_loop_get_agenda_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_uniprocess_application_main_loop_method = NIL;
            SubLObject v_agenda = get_cyblack_uniprocess_application_main_loop_agenda(self);
            SubLObject application = get_cyblack_application_uniprocess_application(self);
            try {
                try {
                    if (NIL != v_agenda) {
                        sublisp_throw($sym325$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD, v_agenda);
                    }
                    if (NIL != application) {
                        v_agenda = cyblack_application.cyblack_basic_application_get_agenda_method(application);
                    }
                    sublisp_throw($sym325$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD, v_agenda);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_uniprocess_application_main_loop_agenda(self, v_agenda);
                            set_cyblack_application_uniprocess_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_uniprocess_application_main_loop_method = Errors.handleThrowable(ccatch_env_var, $sym325$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD);
            }
            return catch_var_for_cyblack_uniprocess_application_main_loop_method;
        }
    }

    public static final SubLObject cyblack_uniprocess_application_main_loop_run_internal_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_uniprocess_application_main_loop_method = NIL;
                SubLObject processing_stage = get_cyblack_uniprocess_application_main_loop_processing_stage(self);
                SubLObject application = get_cyblack_application_uniprocess_application(self);
                try {
                    try {
                        {
                            SubLObject result = NIL;
                            SubLObject pcase_var = processing_stage;
                            if (pcase_var.eql($UNINITIALIZED)) {
                                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt330$__Running_Application_);
                                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                                cyblack_application.cyblack_reset_posting_management();
                                processing_stage = $STARTUP;
                            } else
                                if (pcase_var.eql($STARTUP)) {
                                    methods.funcall_instance_method_with_0_args(application, ON_STARTUP);
                                    methods.funcall_instance_method_with_0_args(application, AFTER_STARTUP);
                                    if (NIL != methods.funcall_instance_method_with_0_args(cyblack_uniprocess_application_main_loop_get_agenda_method(self), EMPTY_P)) {
                                        methods.funcall_instance_method_with_0_args(application, ON_EMPTY_AGENDA);
                                    }
                                    processing_stage = $PROCESSING;
                                } else
                                    if (pcase_var.eql($PROCESSING)) {
                                        if (NIL != cyblack_application.cyblack_basic_application_halted_p_method(application)) {
                                            processing_stage = $SHUTDOWN;
                                        } else {
                                            methods.funcall_instance_method_with_0_args(application, BEFORE_AGENDA_EXECUTE);
                                            methods.funcall_instance_method_with_0_args(cyblack_uniprocess_application_main_loop_get_agenda_method(self), EXECUTE);
                                            methods.funcall_instance_method_with_0_args(application, AFTER_AGENDA_EXECUTE);
                                            if (NIL != methods.funcall_instance_method_with_0_args(cyblack_uniprocess_application_main_loop_get_agenda_method(self), EMPTY_P)) {
                                                methods.funcall_instance_method_with_0_args(application, ON_EMPTY_AGENDA);
                                            }
                                        }
                                    } else
                                        if (pcase_var.eql($SHUTDOWN)) {
                                            methods.funcall_instance_method_with_0_args(application, ON_SHUTDOWN);
                                            result = $TERMINATED;
                                        }



                            sublisp_throw($sym329$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD, result);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_uniprocess_application_main_loop_processing_stage(self, processing_stage);
                                set_cyblack_application_uniprocess_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_uniprocess_application_main_loop_method = Errors.handleThrowable(ccatch_env_var, $sym329$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD);
                }
                return catch_var_for_cyblack_uniprocess_application_main_loop_method;
            }
        }
    }

    public static final SubLObject cyblack_uniprocess_application_main_loop_nothing_to_doP_method(SubLObject self) {
        return methods.funcall_instance_method_with_0_args(cyblack_uniprocess_application_main_loop_get_agenda_method(self), EMPTY_P);
    }

    /**
     * Enumerated values of type CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_server_output_increment_process_stage_types$ = makeSymbol("*VALID-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_server_output_increment_process_stage_types() {
        return $valid_cyblack_server_output_increment_process_stage_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_server_output_increment_process_stage_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_server_output_increment_process_stage_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_server_output_increment_process_stage_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_server_output_increment_process_stage_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt294$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE, value, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_server_output_increment_process_stage_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_server_output_increment_process_stage_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt296$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE, value, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_server_output_increment_process_stage_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_output_increment_process_stage_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE_P, value1, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_output_increment_process_stage_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE_P, value2, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_server_output_increment_process_stage_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_server_output_increment_process_stage_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_output_increment_process_stage_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE_P, value1, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_output_increment_process_stage_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE_P, value2, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_server_output_increment_process_stage_types$.getGlobalValue();
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

    public static final SubLObject get_cyblack_server_output_increment_process_processing_stage(SubLObject cyblack_server_output_increment_process) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_server_output_increment_process, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject set_cyblack_server_output_increment_process_processing_stage(SubLObject cyblack_server_output_increment_process, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_server_output_increment_process, value, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_server_output_increment_process_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_server_output_increment_process_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, PROCESS_SCHEDULER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, SYMBOLIC_REP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, PROCESSING_STAGE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_server_output_increment_process_p(SubLObject cyblack_server_output_increment_process) {
        return classes.subloop_instanceof_class(cyblack_server_output_increment_process, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS);
    }

    public static final SubLObject cyblack_server_output_increment_process_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_server_output_increment_process_method = NIL;
            SubLObject processing_stage = get_cyblack_server_output_increment_process_processing_stage(self);
            SubLObject symbolic_rep = get_cyblack_application_uniprocess_symbolic_rep(self);
            SubLObject priority = subloop_processes.get_basic_subloop_process_priority(self);
            try {
                try {
                    cyblack_application_uniprocess_initialize_method(self);
                    priority = $int$110;
                    processing_stage = $UNINITIALIZED;
                    symbolic_rep = CHAR_O;
                    sublisp_throw($sym353$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_server_output_increment_process_processing_stage(self, processing_stage);
                            set_cyblack_application_uniprocess_symbolic_rep(self, symbolic_rep);
                            subloop_processes.set_basic_subloop_process_priority(self, priority);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_server_output_increment_process_method = Errors.handleThrowable(ccatch_env_var, $sym353$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD);
            }
            return catch_var_for_cyblack_server_output_increment_process_method;
        }
    }

    public static final SubLObject cyblack_server_output_increment_process_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_server_output_increment_process_method = NIL;
            SubLObject status = subloop_processes.get_basic_subloop_process_status(self);
            SubLObject name = subloop_processes.get_basic_subloop_process_name(self);
            try {
                try {
                    format(stream, $str_alt358$__CYBLACK_SERVER_OUTPUT_INCREMENT, name, status);
                    sublisp_throw($sym357$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            subloop_processes.set_basic_subloop_process_status(self, status);
                            subloop_processes.set_basic_subloop_process_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_server_output_increment_process_method = Errors.handleThrowable(ccatch_env_var, $sym357$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD);
            }
            return catch_var_for_cyblack_server_output_increment_process_method;
        }
    }

    public static final SubLObject cyblack_server_output_increment_process_get_processing_stage_method(SubLObject self) {
        {
            SubLObject processing_stage = get_cyblack_server_output_increment_process_processing_stage(self);
            return processing_stage;
        }
    }

    public static final SubLObject cyblack_server_output_increment_process_set_processing_stage_method(SubLObject self, SubLObject new_processing_stage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_server_output_increment_process_method = NIL;
                SubLObject processing_stage = get_cyblack_server_output_increment_process_processing_stage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_server_output_increment_process_stage_type_p(new_processing_stage)) {
                                Errors.error($str_alt363$_SET_PROCESSING_STAGE__S____S_is_, self, new_processing_stage);
                            }
                        }
                        processing_stage = new_processing_stage;
                        sublisp_throw($sym362$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD, new_processing_stage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_server_output_increment_process_processing_stage(self, processing_stage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_server_output_increment_process_method = Errors.handleThrowable(ccatch_env_var, $sym362$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD);
                }
                return catch_var_for_cyblack_server_output_increment_process_method;
            }
        }
    }

    public static final SubLObject cyblack_server_output_increment_process_run_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_server_output_increment_process_method = NIL;
            SubLObject processing_stage = get_cyblack_server_output_increment_process_processing_stage(self);
            try {
                try {
                    if (processing_stage == $UNINITIALIZED) {
                        processing_stage = $PROCESSING;
                    }
                    if (NIL != cyblack_message_broker.cyblack_server_process_terminate_p()) {
                        processing_stage = $TERMINATED;
                        sublisp_throw($sym366$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD, $TERMINATED);
                    }
                    cyblack_message_broker.cyblack_server_output_increment();
                    sublisp_throw($sym366$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_server_output_increment_process_processing_stage(self, processing_stage);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_server_output_increment_process_method = Errors.handleThrowable(ccatch_env_var, $sym366$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD);
            }
            return catch_var_for_cyblack_server_output_increment_process_method;
        }
    }

    public static final SubLObject cyblack_server_output_increment_process_nothing_to_doP_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject port_manager = cyblack_message_broker.$cyblack_output_loop_current_port_manager$.getDynamicValue(thread);
                SubLObject outgoing_message_queue = cyblack_message_broker.cyblack_port_manager_get_outgoing_queue_method(port_manager);
                return subloop_queues.basic_doubly_linked_queue_empty_p_method(outgoing_message_queue);
            }
        }
    }

    /**
     * Enumerated values of type CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_server_command_process_stage_types$ = makeSymbol("*VALID-CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_server_command_process_stage_types() {
        return $valid_cyblack_server_command_process_stage_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_server_command_process_stage_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_server_command_process_stage_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_server_command_process_stage_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_server_command_process_stage_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt294$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE, value, CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_server_command_process_stage_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_server_command_process_stage_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt296$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE, value, CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_server_command_process_stage_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_command_process_stage_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE_P, value1, CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_command_process_stage_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE_P, value2, CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_server_command_process_stage_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_server_command_process_stage_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_command_process_stage_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE_P, value1, CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_server_command_process_stage_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE_P, value2, CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_server_command_process_stage_types$.getGlobalValue();
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

    public static final SubLObject get_cyblack_server_command_process_processing_stage(SubLObject cyblack_server_command_process) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_server_command_process, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject set_cyblack_server_command_process_processing_stage(SubLObject cyblack_server_command_process, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_server_command_process, value, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_server_command_process_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_server_command_process_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, PROCESS_SCHEDULER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, SYMBOLIC_REP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_SERVER_COMMAND_PROCESS, PROCESSING_STAGE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_server_command_process_p(SubLObject cyblack_server_command_process) {
        return classes.subloop_instanceof_class(cyblack_server_command_process, CYBLACK_SERVER_COMMAND_PROCESS);
    }

    public static final SubLObject cyblack_server_command_process_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_server_command_process_method = NIL;
            SubLObject processing_stage = get_cyblack_server_command_process_processing_stage(self);
            SubLObject symbolic_rep = get_cyblack_application_uniprocess_symbolic_rep(self);
            SubLObject priority = subloop_processes.get_basic_subloop_process_priority(self);
            try {
                try {
                    cyblack_application_uniprocess_initialize_method(self);
                    priority = $int$103;
                    processing_stage = $UNINITIALIZED;
                    symbolic_rep = CHAR_S;
                    sublisp_throw($sym378$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_server_command_process_processing_stage(self, processing_stage);
                            set_cyblack_application_uniprocess_symbolic_rep(self, symbolic_rep);
                            subloop_processes.set_basic_subloop_process_priority(self, priority);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_server_command_process_method = Errors.handleThrowable(ccatch_env_var, $sym378$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD);
            }
            return catch_var_for_cyblack_server_command_process_method;
        }
    }

    public static final SubLObject cyblack_server_command_process_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_server_command_process_method = NIL;
            SubLObject status = subloop_processes.get_basic_subloop_process_status(self);
            SubLObject name = subloop_processes.get_basic_subloop_process_name(self);
            try {
                try {
                    format(stream, $str_alt383$__CYBLACK_SERVER_COMMAND_PROCESS_, name, status);
                    sublisp_throw($sym382$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            subloop_processes.set_basic_subloop_process_status(self, status);
                            subloop_processes.set_basic_subloop_process_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_server_command_process_method = Errors.handleThrowable(ccatch_env_var, $sym382$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD);
            }
            return catch_var_for_cyblack_server_command_process_method;
        }
    }

    public static final SubLObject cyblack_server_command_process_get_processing_stage_method(SubLObject self) {
        {
            SubLObject processing_stage = get_cyblack_server_command_process_processing_stage(self);
            return processing_stage;
        }
    }

    public static final SubLObject cyblack_server_command_process_set_processing_stage_method(SubLObject self, SubLObject new_processing_stage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_server_command_process_method = NIL;
                SubLObject processing_stage = get_cyblack_server_command_process_processing_stage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_server_command_process_stage_type_p(new_processing_stage)) {
                                Errors.error($str_alt388$_SET_PROCESSING_STAGE__S____S_is_, self, new_processing_stage);
                            }
                        }
                        processing_stage = new_processing_stage;
                        sublisp_throw($sym387$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD, new_processing_stage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_server_command_process_processing_stage(self, processing_stage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_server_command_process_method = Errors.handleThrowable(ccatch_env_var, $sym387$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD);
                }
                return catch_var_for_cyblack_server_command_process_method;
            }
        }
    }

    public static final SubLObject cyblack_server_command_process_run_internal_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_server_command_process_method = NIL;
                SubLObject processing_stage = get_cyblack_server_command_process_processing_stage(self);
                SubLObject application = get_cyblack_application_uniprocess_application(self);
                try {
                    try {
                        if (processing_stage == $TERMINATED) {
                            sublisp_throw($sym391$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD, $TERMINATED);
                        }
                        if (processing_stage == $UNINITIALIZED) {
                            processing_stage = $PROCESSING;
                        }
                        if ((NIL != cyblack_globals.$virb3_server_process_terminate$.getDynamicValue(thread)) || (NIL != methods.funcall_instance_method_with_0_args(application, HALTED_P))) {
                            processing_stage = $TERMINATED;
                            sublisp_throw($sym391$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD, $TERMINATED);
                        }
                        cyblack_message_broker.cyblack_execute_server_commands();
                        sublisp_throw($sym391$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_server_command_process_processing_stage(self, processing_stage);
                                set_cyblack_application_uniprocess_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_server_command_process_method = Errors.handleThrowable(ccatch_env_var, $sym391$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD);
                }
                return catch_var_for_cyblack_server_command_process_method;
            }
        }
    }

    public static final SubLObject cyblack_server_command_process_nothing_to_doP_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != cyblack_globals.$cyblack_server_initialized$.getDynamicValue(thread)) && (NIL != subloop_queues.basic_doubly_linked_queue_empty_p_method(cyblack_globals.$virb3_command_queue$.getDynamicValue(thread))));
        }
    }

    /**
     * Enumerated values of type CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_port_manager_process_stage_types$ = makeSymbol("*VALID-CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_port_manager_process_stage_types() {
        return $valid_cyblack_port_manager_process_stage_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_port_manager_process_stage_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_port_manager_process_stage_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_port_manager_process_stage_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_port_manager_process_stage_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt294$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE, value, CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_port_manager_process_stage_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_port_manager_process_stage_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt296$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE, value, CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_port_manager_process_stage_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_port_manager_process_stage_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE_P, value1, CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_port_manager_process_stage_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE_P, value2, CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_port_manager_process_stage_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE enumeration.
     */
    public static final SubLObject cyblack_port_manager_process_stage_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_port_manager_process_stage_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE_P, value1, CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_port_manager_process_stage_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE_P, value2, CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_port_manager_process_stage_types$.getGlobalValue();
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

    public static final SubLObject get_cyblack_port_manager_process_processing_stage(SubLObject cyblack_port_manager_process) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_port_manager_process, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject set_cyblack_port_manager_process_processing_stage(SubLObject cyblack_port_manager_process, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_port_manager_process, value, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_port_manager_process_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_port_manager_process_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, PROCESS_SCHEDULER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, SYMBOLIC_REP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_PORT_MANAGER_PROCESS, PROCESSING_STAGE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_port_manager_process_p(SubLObject cyblack_port_manager_process) {
        return classes.subloop_instanceof_class(cyblack_port_manager_process, CYBLACK_PORT_MANAGER_PROCESS);
    }

    public static final SubLObject cyblack_port_manager_process_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_manager_process_method = NIL;
            SubLObject processing_stage = get_cyblack_port_manager_process_processing_stage(self);
            SubLObject symbolic_rep = get_cyblack_application_uniprocess_symbolic_rep(self);
            SubLObject priority = subloop_processes.get_basic_subloop_process_priority(self);
            try {
                try {
                    cyblack_application_uniprocess_initialize_method(self);
                    priority = $int$25;
                    processing_stage = $UNINITIALIZED;
                    symbolic_rep = CHAR_P;
                    sublisp_throw($sym403$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_process_processing_stage(self, processing_stage);
                            set_cyblack_application_uniprocess_symbolic_rep(self, symbolic_rep);
                            subloop_processes.set_basic_subloop_process_priority(self, priority);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_process_method = Errors.handleThrowable(ccatch_env_var, $sym403$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD);
            }
            return catch_var_for_cyblack_port_manager_process_method;
        }
    }

    public static final SubLObject cyblack_port_manager_process_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_port_manager_process_method = NIL;
            SubLObject status = subloop_processes.get_basic_subloop_process_status(self);
            SubLObject name = subloop_processes.get_basic_subloop_process_name(self);
            try {
                try {
                    format(stream, $str_alt408$__CYBLACK_PORT_MANAGER_PROCESS___, name, status);
                    sublisp_throw($sym407$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            subloop_processes.set_basic_subloop_process_status(self, status);
                            subloop_processes.set_basic_subloop_process_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_process_method = Errors.handleThrowable(ccatch_env_var, $sym407$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD);
            }
            return catch_var_for_cyblack_port_manager_process_method;
        }
    }

    public static final SubLObject cyblack_port_manager_process_get_processing_stage_method(SubLObject self) {
        {
            SubLObject processing_stage = get_cyblack_port_manager_process_processing_stage(self);
            return processing_stage;
        }
    }

    public static final SubLObject cyblack_port_manager_process_set_processing_stage_method(SubLObject self, SubLObject new_processing_stage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_port_manager_process_method = NIL;
                SubLObject processing_stage = get_cyblack_port_manager_process_processing_stage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_port_manager_process_stage_type_p(new_processing_stage)) {
                                Errors.error($str_alt413$_SET_PROCESSING_STAGE__S____S_is_, self, new_processing_stage);
                            }
                        }
                        processing_stage = new_processing_stage;
                        sublisp_throw($sym412$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD, new_processing_stage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_port_manager_process_processing_stage(self, processing_stage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_port_manager_process_method = Errors.handleThrowable(ccatch_env_var, $sym412$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD);
                }
                return catch_var_for_cyblack_port_manager_process_method;
            }
        }
    }

    public static final SubLObject cyblack_port_manager_process_run_internal_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_port_manager_process_method = NIL;
            SubLObject processing_stage = get_cyblack_port_manager_process_processing_stage(self);
            SubLObject application = get_cyblack_application_uniprocess_application(self);
            try {
                try {
                    if (NIL == cyblack_message_broker.cyblack_port_manager_continue_p()) {
                        processing_stage = $TERMINATED;
                    }
                    if (NIL != methods.funcall_instance_method_with_0_args(application, HALTED_P)) {
                        processing_stage = $TERMINATED;
                    }
                    if (processing_stage == $TERMINATED) {
                        sublisp_throw($sym416$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD, $TERMINATED);
                    }
                    if (processing_stage == $UNINITIALIZED) {
                        processing_stage = $PROCESSING;
                    }
                    if (processing_stage == $PROCESSING) {
                        cyblack_message_broker.cyblack_port_manager_increment();
                    }
                    sublisp_throw($sym416$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_port_manager_process_processing_stage(self, processing_stage);
                            set_cyblack_application_uniprocess_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_port_manager_process_method = Errors.handleThrowable(ccatch_env_var, $sym416$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD);
            }
            return catch_var_for_cyblack_port_manager_process_method;
        }
    }

    public static final SubLObject cyblack_port_manager_process_nothing_to_doP_method(SubLObject self) {
        return cyblack_message_broker.cyblack_commands_to_process_p();
    }

    /**
     * Enumerated values of type CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_io_stream_monitor_output_increment_types$ = makeSymbol("*VALID-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_io_stream_monitor_output_increment_types() {
        return $valid_cyblack_io_stream_monitor_output_increment_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_io_stream_monitor_output_increment_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_io_stream_monitor_output_increment_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_io_stream_monitor_output_increment_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_io_stream_monitor_output_increment_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt294$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE, value, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_io_stream_monitor_output_increment_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_io_stream_monitor_output_increment_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt296$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE, value, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_io_stream_monitor_output_increment_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_monitor_output_increment_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE_P, value1, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_monitor_output_increment_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE_P, value2, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_io_stream_monitor_output_increment_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_io_stream_monitor_output_increment_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_monitor_output_increment_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE_P, value1, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_monitor_output_increment_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE_P, value2, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_io_stream_monitor_output_increment_types$.getGlobalValue();
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

    public static final SubLObject get_cyblack_io_stream_monitor_output_increment_processing_stage(SubLObject cyblack_io_stream_monitor_output_increment) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_io_stream_monitor_output_increment, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject set_cyblack_io_stream_monitor_output_increment_processing_stage(SubLObject cyblack_io_stream_monitor_output_increment, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_io_stream_monitor_output_increment, value, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_io_stream_monitor_output_increment_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_io_stream_monitor_output_increment_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, PROCESS_SCHEDULER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, SYMBOLIC_REP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, PROCESSING_STAGE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_io_stream_monitor_output_increment_p(SubLObject cyblack_io_stream_monitor_output_increment) {
        return classes.subloop_instanceof_class(cyblack_io_stream_monitor_output_increment, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT);
    }

    public static final SubLObject cyblack_io_stream_monitor_output_increment_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_output_increment_method = NIL;
            SubLObject processing_stage = get_cyblack_io_stream_monitor_output_increment_processing_stage(self);
            SubLObject symbolic_rep = get_cyblack_application_uniprocess_symbolic_rep(self);
            SubLObject priority = subloop_processes.get_basic_subloop_process_priority(self);
            try {
                try {
                    cyblack_application_uniprocess_initialize_method(self);
                    priority = $int$50;
                    processing_stage = $UNINITIALIZED;
                    symbolic_rep = CHAR_I;
                    sublisp_throw($sym428$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_monitor_output_increment_processing_stage(self, processing_stage);
                            set_cyblack_application_uniprocess_symbolic_rep(self, symbolic_rep);
                            subloop_processes.set_basic_subloop_process_priority(self, priority);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_output_increment_method = Errors.handleThrowable(ccatch_env_var, $sym428$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_output_increment_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_output_increment_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_io_stream_monitor_output_increment_method = NIL;
            SubLObject status = subloop_processes.get_basic_subloop_process_status(self);
            SubLObject name = subloop_processes.get_basic_subloop_process_name(self);
            try {
                try {
                    format(stream, $str_alt433$__CYBLACK_IO_STREAM_MONITOR_OUTPU, name, status);
                    sublisp_throw($sym432$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            subloop_processes.set_basic_subloop_process_status(self, status);
                            subloop_processes.set_basic_subloop_process_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_monitor_output_increment_method = Errors.handleThrowable(ccatch_env_var, $sym432$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD);
            }
            return catch_var_for_cyblack_io_stream_monitor_output_increment_method;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_output_increment_get_processing_stage_method(SubLObject self) {
        {
            SubLObject processing_stage = get_cyblack_io_stream_monitor_output_increment_processing_stage(self);
            return processing_stage;
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_output_increment_set_processing_stage_method(SubLObject self, SubLObject new_processing_stage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_io_stream_monitor_output_increment_method = NIL;
                SubLObject processing_stage = get_cyblack_io_stream_monitor_output_increment_processing_stage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_io_stream_monitor_output_increment_type_p(new_processing_stage)) {
                                Errors.error($str_alt438$_SET_PROCESSING_STAGE__S____S_is_, self, new_processing_stage);
                            }
                        }
                        processing_stage = new_processing_stage;
                        sublisp_throw($sym437$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD, new_processing_stage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_io_stream_monitor_output_increment_processing_stage(self, processing_stage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_io_stream_monitor_output_increment_method = Errors.handleThrowable(ccatch_env_var, $sym437$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD);
                }
                return catch_var_for_cyblack_io_stream_monitor_output_increment_method;
            }
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_output_increment_run_internal_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_io_stream_monitor_output_increment_method = NIL;
                SubLObject processing_stage = get_cyblack_io_stream_monitor_output_increment_processing_stage(self);
                SubLObject application = get_cyblack_application_uniprocess_application(self);
                try {
                    try {
                        if (NIL == cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread)) {
                            processing_stage = $TERMINATED;
                        }
                        if (NIL != methods.funcall_instance_method_with_0_args(application, HALTED_P)) {
                            processing_stage = $TERMINATED;
                        }
                        if (processing_stage == $TERMINATED) {
                            sublisp_throw($sym441$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD, $TERMINATED);
                        }
                        if (processing_stage == $UNINITIALIZED) {
                            processing_stage = $PROCESSING;
                        }
                        {
                            SubLObject output = NIL;
                            if (NIL != methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), IS_ACTIVE)) {
                                output = methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), GET_OUTGOING_RAW);
                                if (NIL != output) {
                                    methods.funcall_instance_method_with_1_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), WRITE_RAW, output);
                                }
                            }
                        }
                        sublisp_throw($sym441$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_io_stream_monitor_output_increment_processing_stage(self, processing_stage);
                                set_cyblack_application_uniprocess_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_io_stream_monitor_output_increment_method = Errors.handleThrowable(ccatch_env_var, $sym441$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD);
                }
                return catch_var_for_cyblack_io_stream_monitor_output_increment_method;
            }
        }
    }

    public static final SubLObject cyblack_io_stream_monitor_output_increment_nothing_to_doP_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread)) && (NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread))) && (NIL == methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), OUTGOING_POSTING_P)));
        }
    }

    /**
     * Enumerated values of type CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_io_stream_internal_to_external_increment_types$ = makeSymbol("*VALID-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_io_stream_internal_to_external_increment_types() {
        return $valid_cyblack_io_stream_internal_to_external_increment_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_io_stream_internal_to_external_increment_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_io_stream_internal_to_external_increment_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_io_stream_internal_to_external_increment_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_io_stream_internal_to_external_increment_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt294$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE, value, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_io_stream_internal_to_external_increment_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_io_stream_internal_to_external_increment_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt296$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE, value, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_io_stream_internal_to_external_increment_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_internal_to_external_increment_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE_P, value1, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_internal_to_external_increment_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE_P, value2, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_io_stream_internal_to_external_increment_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_io_stream_internal_to_external_increment_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_internal_to_external_increment_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE_P, value1, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_internal_to_external_increment_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE_P, value2, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_io_stream_internal_to_external_increment_types$.getGlobalValue();
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

    public static final SubLObject get_cyblack_io_stream_internal_to_external_increment_processing_stage(SubLObject cyblack_io_stream_internal_to_external_increment) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_io_stream_internal_to_external_increment, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject set_cyblack_io_stream_internal_to_external_increment_processing_stage(SubLObject cyblack_io_stream_internal_to_external_increment, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_io_stream_internal_to_external_increment, value, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_io_stream_internal_to_external_increment_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_io_stream_internal_to_external_increment_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, PROCESS_SCHEDULER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, SYMBOLIC_REP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, PROCESSING_STAGE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_io_stream_internal_to_external_increment_p(SubLObject cyblack_io_stream_internal_to_external_increment) {
        return classes.subloop_instanceof_class(cyblack_io_stream_internal_to_external_increment, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT);
    }

    public static final SubLObject cyblack_io_stream_internal_to_external_increment_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_io_stream_internal_to_external_increment_method = NIL;
            SubLObject processing_stage = get_cyblack_io_stream_internal_to_external_increment_processing_stage(self);
            SubLObject symbolic_rep = get_cyblack_application_uniprocess_symbolic_rep(self);
            SubLObject priority = subloop_processes.get_basic_subloop_process_priority(self);
            try {
                try {
                    cyblack_application_uniprocess_initialize_method(self);
                    priority = $int$110;
                    processing_stage = $UNINITIALIZED;
                    symbolic_rep = CHAR_2;
                    sublisp_throw($sym457$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_internal_to_external_increment_processing_stage(self, processing_stage);
                            set_cyblack_application_uniprocess_symbolic_rep(self, symbolic_rep);
                            subloop_processes.set_basic_subloop_process_priority(self, priority);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_internal_to_external_increment_method = Errors.handleThrowable(ccatch_env_var, $sym457$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_);
            }
            return catch_var_for_cyblack_io_stream_internal_to_external_increment_method;
        }
    }

    public static final SubLObject cyblack_io_stream_internal_to_external_increment_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_io_stream_internal_to_external_increment_method = NIL;
            SubLObject status = subloop_processes.get_basic_subloop_process_status(self);
            SubLObject name = subloop_processes.get_basic_subloop_process_name(self);
            try {
                try {
                    format(stream, $str_alt461$__CYBLACK_IO_STREAM_INTERNAL_TO_E, name, status);
                    sublisp_throw($sym460$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            subloop_processes.set_basic_subloop_process_status(self, status);
                            subloop_processes.set_basic_subloop_process_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_internal_to_external_increment_method = Errors.handleThrowable(ccatch_env_var, $sym460$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_);
            }
            return catch_var_for_cyblack_io_stream_internal_to_external_increment_method;
        }
    }

    public static final SubLObject cyblack_io_stream_internal_to_external_increment_get_processing_stage_method(SubLObject self) {
        {
            SubLObject processing_stage = get_cyblack_io_stream_internal_to_external_increment_processing_stage(self);
            return processing_stage;
        }
    }

    public static final SubLObject cyblack_io_stream_internal_to_external_increment_set_processing_stage_method(SubLObject self, SubLObject new_processing_stage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_io_stream_internal_to_external_increment_method = NIL;
                SubLObject processing_stage = get_cyblack_io_stream_internal_to_external_increment_processing_stage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_io_stream_internal_to_external_increment_type_p(new_processing_stage)) {
                                Errors.error($str_alt466$_SET_PROCESSING_STAGE__S____S_is_, self, new_processing_stage);
                            }
                        }
                        processing_stage = new_processing_stage;
                        sublisp_throw($sym465$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_, new_processing_stage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_io_stream_internal_to_external_increment_processing_stage(self, processing_stage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_io_stream_internal_to_external_increment_method = Errors.handleThrowable(ccatch_env_var, $sym465$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_);
                }
                return catch_var_for_cyblack_io_stream_internal_to_external_increment_method;
            }
        }
    }

    public static final SubLObject cyblack_io_stream_internal_to_external_increment_run_internal_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_io_stream_internal_to_external_increment_method = NIL;
                SubLObject processing_stage = get_cyblack_io_stream_internal_to_external_increment_processing_stage(self);
                SubLObject application = get_cyblack_application_uniprocess_application(self);
                try {
                    try {
                        if (!((NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread)) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread)))) {
                            processing_stage = $TERMINATED;
                        }
                        if (NIL != methods.funcall_instance_method_with_0_args(application, HALTED_P)) {
                            processing_stage = $TERMINATED;
                        }
                        if (processing_stage == $TERMINATED) {
                            sublisp_throw($sym469$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_, $TERMINATED);
                        }
                        if (processing_stage == $UNINITIALIZED) {
                            processing_stage = $PROCESSING;
                        }
                        methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), INTERNAL_TO_EXTERNAL_INCREMENT);
                        sublisp_throw($sym469$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_io_stream_internal_to_external_increment_processing_stage(self, processing_stage);
                                set_cyblack_application_uniprocess_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_io_stream_internal_to_external_increment_method = Errors.handleThrowable(ccatch_env_var, $sym469$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_);
                }
                return catch_var_for_cyblack_io_stream_internal_to_external_increment_method;
            }
        }
    }

    public static final SubLObject cyblack_io_stream_internal_to_external_increment_nothing_to_doP_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread)) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread))) && (NIL == methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), OUTGOING_POSTING_P)));
        }
    }

    /**
     * Enumerated values of type CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_io_stream_external_to_internal_increment_types$ = makeSymbol("*VALID-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_io_stream_external_to_internal_increment_types() {
        return $valid_cyblack_io_stream_external_to_internal_increment_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_io_stream_external_to_internal_increment_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_io_stream_external_to_internal_increment_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_io_stream_external_to_internal_increment_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_io_stream_external_to_internal_increment_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt294$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE, value, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_io_stream_external_to_internal_increment_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_io_stream_external_to_internal_increment_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt296$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE, value, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_io_stream_external_to_internal_increment_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_external_to_internal_increment_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE_P, value1, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_external_to_internal_increment_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE_P, value2, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_io_stream_external_to_internal_increment_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_io_stream_external_to_internal_increment_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_external_to_internal_increment_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE_P, value1, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_io_stream_external_to_internal_increment_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE_P, value2, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_io_stream_external_to_internal_increment_types$.getGlobalValue();
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

    public static final SubLObject get_cyblack_io_stream_external_to_internal_increment_processing_stage(SubLObject cyblack_io_stream_external_to_internal_increment) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_io_stream_external_to_internal_increment, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject set_cyblack_io_stream_external_to_internal_increment_processing_stage(SubLObject cyblack_io_stream_external_to_internal_increment, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_io_stream_external_to_internal_increment, value, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_io_stream_external_to_internal_increment_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_io_stream_external_to_internal_increment_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, PROCESS_SCHEDULER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, SYMBOLIC_REP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, PROCESSING_STAGE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_io_stream_external_to_internal_increment_p(SubLObject cyblack_io_stream_external_to_internal_increment) {
        return classes.subloop_instanceof_class(cyblack_io_stream_external_to_internal_increment, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT);
    }

    public static final SubLObject cyblack_io_stream_external_to_internal_increment_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_io_stream_external_to_internal_increment_method = NIL;
            SubLObject processing_stage = get_cyblack_io_stream_external_to_internal_increment_processing_stage(self);
            SubLObject symbolic_rep = get_cyblack_application_uniprocess_symbolic_rep(self);
            SubLObject priority = subloop_processes.get_basic_subloop_process_priority(self);
            try {
                try {
                    cyblack_application_uniprocess_initialize_method(self);
                    priority = $int$110;
                    processing_stage = $UNINITIALIZED;
                    symbolic_rep = CHAR_1;
                    sublisp_throw($sym482$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_io_stream_external_to_internal_increment_processing_stage(self, processing_stage);
                            set_cyblack_application_uniprocess_symbolic_rep(self, symbolic_rep);
                            subloop_processes.set_basic_subloop_process_priority(self, priority);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_external_to_internal_increment_method = Errors.handleThrowable(ccatch_env_var, $sym482$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_);
            }
            return catch_var_for_cyblack_io_stream_external_to_internal_increment_method;
        }
    }

    public static final SubLObject cyblack_io_stream_external_to_internal_increment_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_io_stream_external_to_internal_increment_method = NIL;
            SubLObject status = subloop_processes.get_basic_subloop_process_status(self);
            SubLObject name = subloop_processes.get_basic_subloop_process_name(self);
            try {
                try {
                    format(stream, $str_alt486$__CYBLACK_IO_STREAM_EXTERNAL_TO_I, name, status);
                    sublisp_throw($sym485$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            subloop_processes.set_basic_subloop_process_status(self, status);
                            subloop_processes.set_basic_subloop_process_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_io_stream_external_to_internal_increment_method = Errors.handleThrowable(ccatch_env_var, $sym485$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_);
            }
            return catch_var_for_cyblack_io_stream_external_to_internal_increment_method;
        }
    }

    public static final SubLObject cyblack_io_stream_external_to_internal_increment_get_processing_stage_method(SubLObject self) {
        {
            SubLObject processing_stage = get_cyblack_io_stream_external_to_internal_increment_processing_stage(self);
            return processing_stage;
        }
    }

    public static final SubLObject cyblack_io_stream_external_to_internal_increment_set_processing_stage_method(SubLObject self, SubLObject new_processing_stage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_io_stream_external_to_internal_increment_method = NIL;
                SubLObject processing_stage = get_cyblack_io_stream_external_to_internal_increment_processing_stage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_io_stream_external_to_internal_increment_type_p(new_processing_stage)) {
                                Errors.error($str_alt491$_SET_PROCESSING_STAGE__S____S_is_, self, new_processing_stage);
                            }
                        }
                        processing_stage = new_processing_stage;
                        sublisp_throw($sym490$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_, new_processing_stage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_io_stream_external_to_internal_increment_processing_stage(self, processing_stage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_io_stream_external_to_internal_increment_method = Errors.handleThrowable(ccatch_env_var, $sym490$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_);
                }
                return catch_var_for_cyblack_io_stream_external_to_internal_increment_method;
            }
        }
    }

    public static final SubLObject cyblack_io_stream_external_to_internal_increment_run_internal_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_io_stream_external_to_internal_increment_method = NIL;
                SubLObject processing_stage = get_cyblack_io_stream_external_to_internal_increment_processing_stage(self);
                SubLObject application = get_cyblack_application_uniprocess_application(self);
                try {
                    try {
                        if (!((NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread)) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread)))) {
                            processing_stage = $TERMINATED;
                        }
                        if (NIL != methods.funcall_instance_method_with_0_args(application, HALTED_P)) {
                            processing_stage = $TERMINATED;
                        }
                        if (processing_stage == $TERMINATED) {
                            sublisp_throw($sym494$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_, $TERMINATED);
                        }
                        if (processing_stage == $UNINITIALIZED) {
                            processing_stage = $PROCESSING;
                        }
                        methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), EXTERNAL_TO_INTERNAL_INCREMENT);
                        sublisp_throw($sym494$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_io_stream_external_to_internal_increment_processing_stage(self, processing_stage);
                                set_cyblack_application_uniprocess_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_io_stream_external_to_internal_increment_method = Errors.handleThrowable(ccatch_env_var, $sym494$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_);
                }
                return catch_var_for_cyblack_io_stream_external_to_internal_increment_method;
            }
        }
    }

    public static final SubLObject cyblack_io_stream_external_to_internal_increment_nothing_to_doP_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread)) && (NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread))) && ((NIL == methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), INCOMING_RAW_P)) || (NIL == methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), IS_ACTIVE))));
        }
    }

    /**
     * Enumerated values of type CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_blackboard_connection_increment_types$ = makeSymbol("*VALID-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_blackboard_connection_increment_types() {
        return $valid_cyblack_blackboard_connection_increment_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_blackboard_connection_increment_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_blackboard_connection_increment_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_blackboard_connection_increment_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_blackboard_connection_increment_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt294$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE, value, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_blackboard_connection_increment_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_blackboard_connection_increment_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt296$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE, value, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_blackboard_connection_increment_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard_connection_increment_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE_P, value1, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard_connection_increment_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE_P, value2, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_blackboard_connection_increment_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE enumeration.
     */
    public static final SubLObject cyblack_blackboard_connection_increment_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard_connection_increment_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE_P, value1, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_blackboard_connection_increment_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE_P, value2, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_blackboard_connection_increment_types$.getGlobalValue();
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

    public static final SubLObject get_cyblack_blackboard_connection_increment_processing_stage(SubLObject cyblack_blackboard_connection_increment) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_blackboard_connection_increment, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject set_cyblack_blackboard_connection_increment_processing_stage(SubLObject cyblack_blackboard_connection_increment, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_blackboard_connection_increment, value, EIGHT_INTEGER, PROCESSING_STAGE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_blackboard_connection_increment_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_blackboard_connection_increment_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, PRIORITY, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, BASIC_SUBLOOP_PROCESS, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, PROCESS_SCHEDULER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APPLICATION_UNIPROCESS, SYMBOLIC_REP, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, PROCESSING_STAGE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_blackboard_connection_increment_p(SubLObject cyblack_blackboard_connection_increment) {
        return classes.subloop_instanceof_class(cyblack_blackboard_connection_increment, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT);
    }

    public static final SubLObject cyblack_blackboard_connection_increment_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_blackboard_connection_increment_method = NIL;
            SubLObject processing_stage = get_cyblack_blackboard_connection_increment_processing_stage(self);
            SubLObject symbolic_rep = get_cyblack_application_uniprocess_symbolic_rep(self);
            SubLObject priority = subloop_processes.get_basic_subloop_process_priority(self);
            try {
                try {
                    cyblack_application_uniprocess_initialize_method(self);
                    priority = $int$25;
                    processing_stage = $UNINITIALIZED;
                    symbolic_rep = CHAR_B;
                    sublisp_throw($sym508$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_blackboard_connection_increment_processing_stage(self, processing_stage);
                            set_cyblack_application_uniprocess_symbolic_rep(self, symbolic_rep);
                            subloop_processes.set_basic_subloop_process_priority(self, priority);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_blackboard_connection_increment_method = Errors.handleThrowable(ccatch_env_var, $sym508$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD);
            }
            return catch_var_for_cyblack_blackboard_connection_increment_method;
        }
    }

    public static final SubLObject cyblack_blackboard_connection_increment_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_blackboard_connection_increment_method = NIL;
            SubLObject status = subloop_processes.get_basic_subloop_process_status(self);
            SubLObject name = subloop_processes.get_basic_subloop_process_name(self);
            try {
                try {
                    format(stream, $str_alt512$__CYBLACK_BLACKBOARD_CONNECTION_I, name, status);
                    sublisp_throw($sym511$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            subloop_processes.set_basic_subloop_process_status(self, status);
                            subloop_processes.set_basic_subloop_process_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_blackboard_connection_increment_method = Errors.handleThrowable(ccatch_env_var, $sym511$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD);
            }
            return catch_var_for_cyblack_blackboard_connection_increment_method;
        }
    }

    public static final SubLObject cyblack_blackboard_connection_increment_get_processing_stage_method(SubLObject self) {
        {
            SubLObject processing_stage = get_cyblack_blackboard_connection_increment_processing_stage(self);
            return processing_stage;
        }
    }

    public static final SubLObject cyblack_blackboard_connection_increment_set_processing_stage_method(SubLObject self, SubLObject new_processing_stage) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_blackboard_connection_increment_method = NIL;
                SubLObject processing_stage = get_cyblack_blackboard_connection_increment_processing_stage(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_blackboard_connection_increment_type_p(new_processing_stage)) {
                                Errors.error($str_alt517$_SET_PROCESSING_STAGE__S____S_is_, self, new_processing_stage);
                            }
                        }
                        processing_stage = new_processing_stage;
                        sublisp_throw($sym516$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD, new_processing_stage);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_blackboard_connection_increment_processing_stage(self, processing_stage);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_blackboard_connection_increment_method = Errors.handleThrowable(ccatch_env_var, $sym516$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD);
                }
                return catch_var_for_cyblack_blackboard_connection_increment_method;
            }
        }
    }

    public static final SubLObject cyblack_blackboard_connection_increment_run_internal_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_blackboard_connection_increment_method = NIL;
                SubLObject processing_stage = get_cyblack_blackboard_connection_increment_processing_stage(self);
                SubLObject application = get_cyblack_application_uniprocess_application(self);
                try {
                    try {
                        if (!((NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread)) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread)))) {
                            processing_stage = $TERMINATED;
                        }
                        if (NIL != methods.funcall_instance_method_with_0_args(application, HALTED_P)) {
                            processing_stage = $TERMINATED;
                        }
                        if (processing_stage == $TERMINATED) {
                            sublisp_throw($sym520$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD, $TERMINATED);
                        }
                        if (processing_stage == $UNINITIALIZED) {
                            processing_stage = $PROCESSING;
                        }
                        methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), BLACKBOARD_CONNECTION_INCREMENT);
                        sublisp_throw($sym520$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_blackboard_connection_increment_processing_stage(self, processing_stage);
                                set_cyblack_application_uniprocess_application(self, application);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_blackboard_connection_increment_method = Errors.handleThrowable(ccatch_env_var, $sym520$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD);
                }
                return catch_var_for_cyblack_blackboard_connection_increment_method;
            }
        }
    }

    public static final SubLObject cyblack_blackboard_connection_increment_nothing_to_doP_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((((NIL != cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread)) && (NIL != cyblack_globals.$cyblack_io_loop_continue$.getDynamicValue(thread))) && (NIL != methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), IS_ACTIVE))) && (NIL == methods.funcall_instance_method_with_0_args(cyblack_globals.$cyblack_io_stream_monitor$.getDynamicValue(thread), INCOMING_POSTING_P)));
        }
    }

    public static final SubLObject cyblack_monitor_base_p(SubLObject cyblack_monitor_base) {
        return interfaces.subloop_instanceof_interface(cyblack_monitor_base, CYBLACK_MONITOR_BASE);
    }

    public static final SubLObject get_cyblack_defapp_monitor_base_monitored_type_type_strings(SubLObject cyblack_defapp_monitor_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_monitor_base, $int$27, MONITORED_TYPE_TYPE_STRINGS);
    }

    public static final SubLObject set_cyblack_defapp_monitor_base_monitored_type_type_strings(SubLObject cyblack_defapp_monitor_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_monitor_base, value, $int$27, MONITORED_TYPE_TYPE_STRINGS);
    }

    public static final SubLObject get_cyblack_defapp_monitor_base_io_monitor(SubLObject cyblack_defapp_monitor_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_monitor_base, $int$26, IO_MONITOR);
    }

    public static final SubLObject set_cyblack_defapp_monitor_base_io_monitor(SubLObject cyblack_defapp_monitor_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_monitor_base, value, $int$26, IO_MONITOR);
    }

    public static final SubLObject cyblack_defapp_monitor_base_after_startup_method(SubLObject self) {
        cyblack_application.cyblack_basic_application_after_startup_method(self);
        cyblack_io_stream_monitor.cyblack_io_stream_monitor_toplevel();
        return NIL;
    }

    public static final SubLObject cyblack_defapp_monitor_base_monitoring_on_startup_method(SubLObject self) {
        {
            SubLObject template_io_monitor = cyblack_defapp_monitor_base_internal_get_io_monitor_method(self);
            if (NIL != template_io_monitor) {
                methods.funcall_instance_method_with_2_args(template_io_monitor, INSTALL, self, cyblack_defapp_monitor_base_internal_get_monitored_type_type_strings_method(self));
            }
            return T;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_base_override_monitored_type_panel_associations_method(SubLObject self) {
        {
            SubLObject template_panel_type = NIL;
            SubLObject template_ui_panel_type = NIL;
            SubLObject cdolist_list_var = cyblack_defapp_monitor_base_internal_get_monitored_type_type_strings_method(self);
            SubLObject template_type_string = NIL;
            for (template_type_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_type_string = cdolist_list_var.first()) {
                template_panel_type = cyblack_application.cyblack_basic_application_get_panel_type_method(self, template_type_string);
                template_ui_panel_type = (NIL != template_panel_type) ? ((SubLObject) (NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_SEQUENCE_PANEL) ? ((SubLObject) (CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_BACKWARD_PANEL) ? ((SubLObject) (CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_FORWARD_PANEL) ? ((SubLObject) (CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_CYCPANEL) ? ((SubLObject) (CYBLACK_BASIC_USER_INTERACTION_CYCPANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_PANEL) ? ((SubLObject) (CYBLACK_BASIC_USER_INTERACTION_PANEL)) : NIL)) : NIL;
                if (NIL != template_ui_panel_type) {
                    cyblack_application.cyblack_basic_application_override_panel_type_method(self, template_type_string, template_ui_panel_type);
                }
            }
            return T;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_base_set_monitored_type_type_strings_method(SubLObject self, SubLObject type_strings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!type_strings.isList()) {
                    Errors.error($str_alt571$_SET_MONITORED_TYPE_TYPE_STRINGS_, self, type_strings);
                }
            }
            {
                SubLObject cdolist_list_var = type_strings;
                SubLObject type_string = NIL;
                for (type_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type_string = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!type_string.isString()) {
                            Errors.error($str_alt572$_SET_MONITORED_TYPE_TYPE_STRINGS_, self, type_string);
                        }
                    }
                }
            }
            cyblack_defapp_monitor_base_internal_set_monitored_type_type_strings_method(self, copy_list(type_strings));
            return type_strings;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_base_get_monitored_type_type_strings_method(SubLObject self) {
        return cyblack_defapp_monitor_base_internal_get_monitored_type_type_strings_method(self);
    }

    public static final SubLObject cyblack_defapp_monitor_base_kill_io_monitor_method(SubLObject self) {
        cyblack_globals.$cyblack_io_loop_continue$.setDynamicValue(NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_monitor_base_init_io_monitor_method(SubLObject self) {
        {
            SubLObject template_monitor = object.new_object_instance(CYBLACK_SEXPR_MONITOR);
            cyblack_defapp_monitor_base_set_io_monitor_method(self, template_monitor);
            methods.funcall_instance_method_with_1_args(template_monitor, SET_NORMAL_PROMPT, $str_alt578$_____);
            return template_monitor;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_base_set_io_monitor_method(SubLObject self, SubLObject new_io_monitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_io_monitor) || (NIL != cyblack_sexpr_monitor.cyblack_sexpr_monitor_p(new_io_monitor)))) {
                    Errors.error($str_alt580$_SET_IO_MONITOR__S____S_is_not_an, self, new_io_monitor);
                }
            }
            cyblack_defapp_monitor_base_internal_set_io_monitor_method(self, new_io_monitor);
            return new_io_monitor;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_base_get_io_monitor_method(SubLObject self) {
        return cyblack_defapp_monitor_base_internal_get_io_monitor_method(self);
    }

    public static final SubLObject cyblack_defapp_monitor_base_post_monitoring_initialize_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_defapp_monitor_base_init_io_monitor_method(self);
            cyblack_globals.$cyblack_io_stream_monitor_default_input$.setDynamicValue(StreamsLow.$standard_input$.getDynamicValue(thread), thread);
            cyblack_globals.$cyblack_io_stream_monitor_default_output$.setDynamicValue(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
            return T;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_base_pre_monitoring_initialize_method(SubLObject self) {
        cyblack_defapp_monitor_base_override_monitored_type_panel_associations_method(self);
        return T;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_monitor_base_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_monitor_base_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, HALT_STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, DELAY_STANDARD_INITIALIZATION_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, TERMINATE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, DATATYPE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CURRENT_SESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_CONNECTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CONNECTION_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PORT_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_MODULE_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, INCOMING_MESSAGE_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_MONITOR_BASE, IO_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_MONITOR_BASE, MONITORED_TYPE_TYPE_STRINGS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_monitor_base_p(SubLObject cyblack_defapp_monitor_base) {
        return classes.subloop_instanceof_class(cyblack_defapp_monitor_base, CYBLACK_DEFAPP_MONITOR_BASE);
    }

    public static final SubLObject cyblack_defapp_monitor_base_initialize_qua_cyblack_monitor_base_method(SubLObject self) {
        cyblack_defapp_monitor_base_internal_set_io_monitor_method(self, NIL);
        cyblack_defapp_monitor_base_internal_set_monitored_type_type_strings_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_defapp_monitor_base_internal_get_io_monitor_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_monitor_base_method = NIL;
            SubLObject io_monitor = get_cyblack_defapp_monitor_base_io_monitor(self);
            try {
                try {
                    sublisp_throw($sym592$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD, io_monitor);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_monitor_base_io_monitor(self, io_monitor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_monitor_base_method = Errors.handleThrowable(ccatch_env_var, $sym592$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_monitor_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_base_internal_set_io_monitor_method(SubLObject self, SubLObject new_io_monitor) {
        {
            SubLObject catch_var_for_cyblack_defapp_monitor_base_method = NIL;
            SubLObject io_monitor = get_cyblack_defapp_monitor_base_io_monitor(self);
            try {
                try {
                    io_monitor = new_io_monitor;
                    sublisp_throw($sym596$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD, new_io_monitor);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_monitor_base_io_monitor(self, io_monitor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_monitor_base_method = Errors.handleThrowable(ccatch_env_var, $sym596$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_monitor_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_base_internal_get_monitored_type_type_strings_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_monitor_base_method = NIL;
            SubLObject monitored_type_type_strings = get_cyblack_defapp_monitor_base_monitored_type_type_strings(self);
            try {
                try {
                    sublisp_throw($sym600$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD, monitored_type_type_strings);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_monitor_base_monitored_type_type_strings(self, monitored_type_type_strings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_monitor_base_method = Errors.handleThrowable(ccatch_env_var, $sym600$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_monitor_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_base_internal_set_monitored_type_type_strings_method(SubLObject self, SubLObject new_type_strings) {
        {
            SubLObject catch_var_for_cyblack_defapp_monitor_base_method = NIL;
            SubLObject monitored_type_type_strings = get_cyblack_defapp_monitor_base_monitored_type_type_strings(self);
            try {
                try {
                    monitored_type_type_strings = new_type_strings;
                    sublisp_throw($sym605$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD, new_type_strings);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_monitor_base_monitored_type_type_strings(self, monitored_type_type_strings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_monitor_base_method = Errors.handleThrowable(ccatch_env_var, $sym605$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_monitor_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_base_initialize_method(SubLObject self) {
        {
            SubLObject monitored_type_type_strings = get_cyblack_defapp_monitor_base_monitored_type_type_strings(self);
            SubLObject io_monitor = get_cyblack_defapp_monitor_base_io_monitor(self);
            SubLObject delay_standard_initialization_p = get_cyblack_defapp_base_delay_standard_initialization_p(self);
            delay_standard_initialization_p = T;
            set_cyblack_defapp_base_delay_standard_initialization_p(self, delay_standard_initialization_p);
            cyblack_defapp_base_initialize_method(self);
            io_monitor = NIL;
            set_cyblack_defapp_monitor_base_io_monitor(self, io_monitor);
            monitored_type_type_strings = NIL;
            set_cyblack_defapp_monitor_base_monitored_type_type_strings(self, monitored_type_type_strings);
            cyblack_application.cyblack_basic_application_standard_initialization_method(self);
            return self;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_external_base_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_external_base_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, HALT_STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, DELAY_STANDARD_INITIALIZATION_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, TERMINATE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, DATATYPE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CURRENT_SESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_CONNECTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CONNECTION_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PORT_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_MODULE_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, INCOMING_MESSAGE_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_external_base_p(SubLObject cyblack_defapp_external_base) {
        return classes.subloop_instanceof_class(cyblack_defapp_external_base, CYBLACK_DEFAPP_EXTERNAL_BASE);
    }

    public static final SubLObject cyblack_defapp_external_base_initialize_method(SubLObject self) {
        set_cyblack_defapp_base_delay_standard_initialization_p(self, T);
        cyblack_defapp_base_initialize_method(self);
        cyblack_application.cyblack_basic_application_set_connection_class_method(self, CYBLACK_STANDARD_EXTERNAL_CONNECTION);
        cyblack_application.cyblack_basic_application_set_message_broker_class_method(self, CYBLACK_MESSAGE_BROKER);
        cyblack_application.cyblack_basic_application_standard_initialization_method(self);
        return self;
    }

    public static final SubLObject cyblack_defapp_external_base_on_startup_method(SubLObject self) {
        cyblack_defapp_base_on_startup_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_external_base_on_shutdown_method(SubLObject self) {
        cyblack_defapp_base_on_shutdown_method(self);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_external_base_after_startup_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_external_base_method = NIL;
            SubLObject external_connection = cyblack_application.get_cyblack_basic_application_external_connection(self);
            try {
                try {
                    cyblack_application.cyblack_basic_application_after_startup_method(self);
                    if (NIL != external_connection) {
                        {
                            SubLObject session_connection = methods.funcall_instance_method_with_0_args(external_connection, GET_SESSION_CONNECTION);
                            if (NIL != session_connection) {
                                format(T, $str_alt624$__Processing_incoming_messages_);
                                methods.funcall_instance_method_with_1_args(session_connection, PROCESS_INCOMING_MESSAGES, T);
                            }
                        }
                    }
                    cyblack_application.cyblack_basic_application_report_outstanding_external_knowledge_sources_method(self);
                    sublisp_throw($sym622$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_application.set_cyblack_basic_application_external_connection(self, external_connection);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_external_base_method = Errors.handleThrowable(ccatch_env_var, $sym622$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_external_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_external_base_on_halt_and_abort_server_method(SubLObject self) {
        cyblack_application.cyblack_basic_application_on_halt_and_abort_server_method(self);
        cyblack_message_broker.cyblack_enqueue_server_command($Q);
        return T;
    }

    public static final SubLObject cyblack_defapp_external_base_on_empty_agenda_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_external_base_method = NIL;
            SubLObject external_connection = cyblack_application.get_cyblack_basic_application_external_connection(self);
            try {
                try {
                    if (NIL != external_connection) {
                        {
                            SubLObject session_connection = methods.funcall_instance_method_with_0_args(external_connection, GET_SESSION_CONNECTION);
                            if ((NIL != session_connection) && (NIL != methods.funcall_instance_method_with_0_args(session_connection, INCOMING_MESSAGES_AVAILABLE_P))) {
                                methods.funcall_instance_method_with_0_args(session_connection, PROCESS_INCOMING_MESSAGES);
                                sublisp_throw($sym632$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD, NIL);
                            }
                        }
                    }
                    sublisp_throw($sym632$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_application.set_cyblack_basic_application_external_connection(self, external_connection);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_external_base_method = Errors.handleThrowable(ccatch_env_var, $sym632$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_external_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_external_base_before_agenda_execute_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_external_base_method = NIL;
            SubLObject external_connection = cyblack_application.get_cyblack_basic_application_external_connection(self);
            try {
                try {
                    if (NIL != external_connection) {
                        {
                            SubLObject session_connection = methods.funcall_instance_method_with_0_args(external_connection, GET_SESSION_CONNECTION);
                            if (NIL != session_connection) {
                                methods.funcall_instance_method_with_0_args(session_connection, PROCESS_INCOMING_MESSAGES);
                            }
                        }
                    }
                    sublisp_throw($sym636$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_application.set_cyblack_basic_application_external_connection(self, external_connection);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_external_base_method = Errors.handleThrowable(ccatch_env_var, $sym636$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_external_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_external_base_after_agenda_execute_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_external_base_method = NIL;
            SubLObject external_connection = cyblack_application.get_cyblack_basic_application_external_connection(self);
            try {
                try {
                    if (NIL != external_connection) {
                        {
                            SubLObject session_connection = methods.funcall_instance_method_with_0_args(external_connection, GET_SESSION_CONNECTION);
                            if (NIL != session_connection) {
                                methods.funcall_instance_method_with_0_args(session_connection, PROCESS_INCOMING_MESSAGES);
                            }
                        }
                    }
                    sublisp_throw($sym638$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            cyblack_application.set_cyblack_basic_application_external_connection(self, external_connection);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_external_base_method = Errors.handleThrowable(ccatch_env_var, $sym638$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_external_base_method;
        }
    }

    public static final SubLObject get_cyblack_defapp_monitor_external_base_monitored_type_type_strings(SubLObject cyblack_defapp_monitor_external_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_monitor_external_base, $int$27, MONITORED_TYPE_TYPE_STRINGS);
    }

    public static final SubLObject set_cyblack_defapp_monitor_external_base_monitored_type_type_strings(SubLObject cyblack_defapp_monitor_external_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_monitor_external_base, value, $int$27, MONITORED_TYPE_TYPE_STRINGS);
    }

    public static final SubLObject get_cyblack_defapp_monitor_external_base_io_monitor(SubLObject cyblack_defapp_monitor_external_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_monitor_external_base, $int$26, IO_MONITOR);
    }

    public static final SubLObject set_cyblack_defapp_monitor_external_base_io_monitor(SubLObject cyblack_defapp_monitor_external_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_monitor_external_base, value, $int$26, IO_MONITOR);
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_after_startup_method(SubLObject self) {
        cyblack_defapp_external_base_after_startup_method(self);
        cyblack_io_stream_monitor.cyblack_io_stream_monitor_toplevel();
        return NIL;
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_monitoring_on_startup_method(SubLObject self) {
        {
            SubLObject template_io_monitor = cyblack_defapp_monitor_external_base_internal_get_io_monitor_method(self);
            if (NIL != template_io_monitor) {
                methods.funcall_instance_method_with_2_args(template_io_monitor, INSTALL, self, cyblack_defapp_monitor_external_base_internal_get_monitored_type_type_strings_method(self));
            }
            return T;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_override_monitored_type_panel_associations_method(SubLObject self) {
        {
            SubLObject template_panel_type = NIL;
            SubLObject template_ui_panel_type = NIL;
            SubLObject cdolist_list_var = cyblack_defapp_monitor_external_base_internal_get_monitored_type_type_strings_method(self);
            SubLObject template_type_string = NIL;
            for (template_type_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_type_string = cdolist_list_var.first()) {
                template_panel_type = cyblack_application.cyblack_basic_application_get_panel_type_method(self, template_type_string);
                template_ui_panel_type = (NIL != template_panel_type) ? ((SubLObject) (NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_SEQUENCE_PANEL) ? ((SubLObject) (CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_BACKWARD_PANEL) ? ((SubLObject) (CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_FORWARD_PANEL) ? ((SubLObject) (CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_CYCPANEL) ? ((SubLObject) (CYBLACK_BASIC_USER_INTERACTION_CYCPANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_PANEL) ? ((SubLObject) (CYBLACK_BASIC_USER_INTERACTION_PANEL)) : NIL)) : NIL;
                if (NIL != template_ui_panel_type) {
                    cyblack_application.cyblack_basic_application_override_panel_type_method(self, template_type_string, template_ui_panel_type);
                }
            }
            return T;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_set_monitored_type_type_strings_method(SubLObject self, SubLObject type_strings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!type_strings.isList()) {
                    Errors.error($str_alt571$_SET_MONITORED_TYPE_TYPE_STRINGS_, self, type_strings);
                }
            }
            {
                SubLObject cdolist_list_var = type_strings;
                SubLObject type_string = NIL;
                for (type_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type_string = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!type_string.isString()) {
                            Errors.error($str_alt572$_SET_MONITORED_TYPE_TYPE_STRINGS_, self, type_string);
                        }
                    }
                }
            }
            cyblack_defapp_monitor_external_base_internal_set_monitored_type_type_strings_method(self, copy_list(type_strings));
            return type_strings;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_get_monitored_type_type_strings_method(SubLObject self) {
        return cyblack_defapp_monitor_external_base_internal_get_monitored_type_type_strings_method(self);
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_kill_io_monitor_method(SubLObject self) {
        cyblack_globals.$cyblack_io_loop_continue$.setDynamicValue(NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_init_io_monitor_method(SubLObject self) {
        {
            SubLObject template_monitor = object.new_object_instance(CYBLACK_SEXPR_MONITOR);
            cyblack_defapp_monitor_external_base_set_io_monitor_method(self, template_monitor);
            methods.funcall_instance_method_with_1_args(template_monitor, SET_NORMAL_PROMPT, $str_alt578$_____);
            return template_monitor;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_set_io_monitor_method(SubLObject self, SubLObject new_io_monitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_io_monitor) || (NIL != cyblack_sexpr_monitor.cyblack_sexpr_monitor_p(new_io_monitor)))) {
                    Errors.error($str_alt580$_SET_IO_MONITOR__S____S_is_not_an, self, new_io_monitor);
                }
            }
            cyblack_defapp_monitor_external_base_internal_set_io_monitor_method(self, new_io_monitor);
            return new_io_monitor;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_get_io_monitor_method(SubLObject self) {
        return cyblack_defapp_monitor_external_base_internal_get_io_monitor_method(self);
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_post_monitoring_initialize_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_defapp_monitor_external_base_init_io_monitor_method(self);
            cyblack_globals.$cyblack_io_stream_monitor_default_input$.setDynamicValue(StreamsLow.$standard_input$.getDynamicValue(thread), thread);
            cyblack_globals.$cyblack_io_stream_monitor_default_output$.setDynamicValue(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
            return T;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_pre_monitoring_initialize_method(SubLObject self) {
        cyblack_defapp_monitor_external_base_override_monitored_type_panel_associations_method(self);
        return T;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_monitor_external_base_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_monitor_external_base_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, HALT_STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, DELAY_STANDARD_INITIALIZATION_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, TERMINATE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, DATATYPE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CURRENT_SESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_CONNECTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CONNECTION_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PORT_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_MODULE_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, INCOMING_MESSAGE_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, IO_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, MONITORED_TYPE_TYPE_STRINGS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_p(SubLObject cyblack_defapp_monitor_external_base) {
        return classes.subloop_instanceof_class(cyblack_defapp_monitor_external_base, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE);
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_initialize_qua_cyblack_monitor_base_method(SubLObject self) {
        cyblack_defapp_monitor_external_base_internal_set_io_monitor_method(self, NIL);
        cyblack_defapp_monitor_external_base_internal_set_monitored_type_type_strings_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_internal_get_io_monitor_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_monitor_external_base_method = NIL;
            SubLObject io_monitor = get_cyblack_defapp_monitor_external_base_io_monitor(self);
            try {
                try {
                    sublisp_throw($sym655$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD, io_monitor);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_monitor_external_base_io_monitor(self, io_monitor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_monitor_external_base_method = Errors.handleThrowable(ccatch_env_var, $sym655$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_monitor_external_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_internal_set_io_monitor_method(SubLObject self, SubLObject new_io_monitor) {
        {
            SubLObject catch_var_for_cyblack_defapp_monitor_external_base_method = NIL;
            SubLObject io_monitor = get_cyblack_defapp_monitor_external_base_io_monitor(self);
            try {
                try {
                    io_monitor = new_io_monitor;
                    sublisp_throw($sym657$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD, new_io_monitor);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_monitor_external_base_io_monitor(self, io_monitor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_monitor_external_base_method = Errors.handleThrowable(ccatch_env_var, $sym657$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_monitor_external_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_internal_get_monitored_type_type_strings_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_monitor_external_base_method = NIL;
            SubLObject monitored_type_type_strings = get_cyblack_defapp_monitor_external_base_monitored_type_type_strings(self);
            try {
                try {
                    sublisp_throw($sym659$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD, monitored_type_type_strings);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_monitor_external_base_monitored_type_type_strings(self, monitored_type_type_strings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_monitor_external_base_method = Errors.handleThrowable(ccatch_env_var, $sym659$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_monitor_external_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_internal_set_monitored_type_type_strings_method(SubLObject self, SubLObject new_type_strings) {
        {
            SubLObject catch_var_for_cyblack_defapp_monitor_external_base_method = NIL;
            SubLObject monitored_type_type_strings = get_cyblack_defapp_monitor_external_base_monitored_type_type_strings(self);
            try {
                try {
                    monitored_type_type_strings = new_type_strings;
                    sublisp_throw($sym661$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD, new_type_strings);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_monitor_external_base_monitored_type_type_strings(self, monitored_type_type_strings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_monitor_external_base_method = Errors.handleThrowable(ccatch_env_var, $sym661$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD);
            }
            return catch_var_for_cyblack_defapp_monitor_external_base_method;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_external_base_initialize_method(SubLObject self) {
        {
            SubLObject monitored_type_type_strings = get_cyblack_defapp_monitor_external_base_monitored_type_type_strings(self);
            SubLObject io_monitor = get_cyblack_defapp_monitor_external_base_io_monitor(self);
            SubLObject delay_standard_initialization_p = get_cyblack_defapp_base_delay_standard_initialization_p(self);
            delay_standard_initialization_p = T;
            set_cyblack_defapp_base_delay_standard_initialization_p(self, delay_standard_initialization_p);
            cyblack_defapp_external_base_initialize_method(self);
            io_monitor = NIL;
            set_cyblack_defapp_monitor_external_base_io_monitor(self, io_monitor);
            monitored_type_type_strings = NIL;
            set_cyblack_defapp_monitor_external_base_monitored_type_type_strings(self, monitored_type_type_strings);
            cyblack_application.cyblack_basic_application_standard_initialization_method(self);
            return self;
        }
    }

    public static final SubLObject get_cyblack_uniprocess_defapp_base_application_process(SubLObject cyblack_uniprocess_defapp_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_uniprocess_defapp_base, $int$27, APPLICATION_PROCESS);
    }

    public static final SubLObject set_cyblack_uniprocess_defapp_base_application_process(SubLObject cyblack_uniprocess_defapp_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_uniprocess_defapp_base, value, $int$27, APPLICATION_PROCESS);
    }

    public static final SubLObject get_cyblack_uniprocess_defapp_base_process_scheduler(SubLObject cyblack_uniprocess_defapp_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_uniprocess_defapp_base, $int$26, PROCESS_SCHEDULER);
    }

    public static final SubLObject set_cyblack_uniprocess_defapp_base_process_scheduler(SubLObject cyblack_uniprocess_defapp_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_uniprocess_defapp_base, value, $int$26, PROCESS_SCHEDULER);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_uniprocess_defapp_base_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_uniprocess_defapp_base_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, HALT_STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, DELAY_STANDARD_INITIALIZATION_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, TERMINATE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, DATATYPE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CURRENT_SESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_CONNECTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CONNECTION_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PORT_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_MODULE_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, INCOMING_MESSAGE_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIPROCESS_DEFAPP_BASE, PROCESS_SCHEDULER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIPROCESS_DEFAPP_BASE, APPLICATION_PROCESS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_uniprocess_defapp_base_p(SubLObject cyblack_uniprocess_defapp_base) {
        return classes.subloop_instanceof_class(cyblack_uniprocess_defapp_base, CYBLACK_UNIPROCESS_DEFAPP_BASE);
    }

    public static final SubLObject cyblack_uniprocess_defapp_base_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_uniprocess_defapp_base_method = NIL;
            SubLObject application_process = get_cyblack_uniprocess_defapp_base_application_process(self);
            SubLObject process_scheduler = get_cyblack_uniprocess_defapp_base_process_scheduler(self);
            try {
                try {
                    cyblack_defapp_base_initialize_method(self);
                    process_scheduler = object.new_class_instance(CYBLACK_APPLICATION_PROCESS_SCHEDULER);
                    application_process = object.new_class_instance(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP);
                    cyblack_application_uniprocess_set_application_method(application_process, cyblack_application.cyblack_basic_application_get_application_method(self));
                    sublisp_throw($sym670$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_uniprocess_defapp_base_application_process(self, application_process);
                            set_cyblack_uniprocess_defapp_base_process_scheduler(self, process_scheduler);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_uniprocess_defapp_base_method = Errors.handleThrowable(ccatch_env_var, $sym670$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD);
            }
            return catch_var_for_cyblack_uniprocess_defapp_base_method;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_base_set_application_method(SubLObject self, SubLObject new_application) {
        cyblack_application.cyblack_basic_application_set_application_method(self, new_application);
        if (NIL != get_cyblack_uniprocess_defapp_base_application_process(self)) {
            cyblack_application_uniprocess_set_application_method(get_cyblack_uniprocess_defapp_base_application_process(self), new_application);
        }
        return new_application;
    }

    public static final SubLObject cyblack_uniprocess_defapp_base_get_process_scheduler_method(SubLObject self) {
        {
            SubLObject process_scheduler = get_cyblack_uniprocess_defapp_base_process_scheduler(self);
            return process_scheduler;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_base_set_process_scheduler_method(SubLObject self, SubLObject new_process_scheduler) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_uniprocess_defapp_base_method = NIL;
                SubLObject process_scheduler = get_cyblack_uniprocess_defapp_base_process_scheduler(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_process_scheduler) || (NIL != cyblack_application_process_scheduler_p(new_process_scheduler)))) {
                                Errors.error($str_alt679$_SET_PROCESS_SCHEDULER__S____S_is, self, new_process_scheduler);
                            }
                        }
                        process_scheduler = new_process_scheduler;
                        sublisp_throw($sym678$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD, new_process_scheduler);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_uniprocess_defapp_base_process_scheduler(self, process_scheduler);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_uniprocess_defapp_base_method = Errors.handleThrowable(ccatch_env_var, $sym678$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD);
                }
                return catch_var_for_cyblack_uniprocess_defapp_base_method;
            }
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_base_run_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_uniprocess_defapp_base_method = NIL;
                SubLObject application_process = get_cyblack_uniprocess_defapp_base_application_process(self);
                SubLObject process_scheduler = get_cyblack_uniprocess_defapp_base_process_scheduler(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL != process_scheduler) && (NIL != application_process))) {
                                Errors.error($str_alt684$_RUN__S___This_application_is_not, self);
                            }
                        }
                        methods.funcall_instance_method_with_1_args(process_scheduler, SET_APPLICATION, self);
                        format(T, $str_alt685$__APPLICATION_____S__, methods.funcall_instance_method_with_0_args(process_scheduler, GET_APPLICATION));
                        force_output(T);
                        methods.funcall_instance_method_with_1_args(application_process, SET_APPLICATION, self);
                        cyblack_application_process_scheduler_add_task_method(process_scheduler, application_process);
                        cyblack_application_process_scheduler_add_task_method(process_scheduler, object.new_class_instance(CYBLACK_SERVER_COMMAND_PROCESS));
                        subloop_processes.basic_multi_task_scheduler_start_method(process_scheduler);
                        sublisp_throw($sym683$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_uniprocess_defapp_base_application_process(self, application_process);
                                set_cyblack_uniprocess_defapp_base_process_scheduler(self, process_scheduler);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_uniprocess_defapp_base_method = Errors.handleThrowable(ccatch_env_var, $sym683$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD);
                }
                return catch_var_for_cyblack_uniprocess_defapp_base_method;
            }
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_base_add_process_method(SubLObject self, SubLObject subloop_process) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_uniprocess_defapp_base_method = NIL;
                SubLObject process_scheduler = get_cyblack_uniprocess_defapp_base_process_scheduler(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == subloop_processes.basic_subloop_process_p(subloop_process)) {
                                Errors.error($str_alt690$_ADD_PROCESS__S____S_is_not_an_in, self, subloop_process);
                            }
                        }
                        if (NIL != cyblack_application_uniprocess_p(subloop_process)) {
                            methods.funcall_instance_method_with_1_args(subloop_process, SET_APPLICATION, self);
                        }
                        cyblack_application_process_scheduler_add_task_method(process_scheduler, subloop_process);
                        sublisp_throw($sym689$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD, subloop_process);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_uniprocess_defapp_base_process_scheduler(self, process_scheduler);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_uniprocess_defapp_base_method = Errors.handleThrowable(ccatch_env_var, $sym689$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD);
                }
                return catch_var_for_cyblack_uniprocess_defapp_base_method;
            }
        }
    }

    public static final SubLObject get_cyblack_uniprocess_defapp_monitor_base_monitored_type_type_strings(SubLObject cyblack_uniprocess_defapp_monitor_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_uniprocess_defapp_monitor_base, $int$29, MONITORED_TYPE_TYPE_STRINGS);
    }

    public static final SubLObject set_cyblack_uniprocess_defapp_monitor_base_monitored_type_type_strings(SubLObject cyblack_uniprocess_defapp_monitor_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_uniprocess_defapp_monitor_base, value, $int$29, MONITORED_TYPE_TYPE_STRINGS);
    }

    public static final SubLObject get_cyblack_uniprocess_defapp_monitor_base_io_monitor(SubLObject cyblack_uniprocess_defapp_monitor_base) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_uniprocess_defapp_monitor_base, $int$28, IO_MONITOR);
    }

    public static final SubLObject set_cyblack_uniprocess_defapp_monitor_base_io_monitor(SubLObject cyblack_uniprocess_defapp_monitor_base, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_uniprocess_defapp_monitor_base, value, $int$28, IO_MONITOR);
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_after_startup_method(SubLObject self) {
        cyblack_application.cyblack_basic_application_after_startup_method(self);
        cyblack_io_stream_monitor.cyblack_io_stream_monitor_toplevel();
        return NIL;
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_monitoring_on_startup_method(SubLObject self) {
        {
            SubLObject template_io_monitor = cyblack_uniprocess_defapp_monitor_base_internal_get_io_monitor_method(self);
            if (NIL != template_io_monitor) {
                methods.funcall_instance_method_with_2_args(template_io_monitor, INSTALL, self, cyblack_uniprocess_defapp_monitor_base_internal_get_monitored_type_type_strings_method(self));
            }
            return T;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_override_monitored_type_panel_associations_method(SubLObject self) {
        {
            SubLObject template_panel_type = NIL;
            SubLObject template_ui_panel_type = NIL;
            SubLObject cdolist_list_var = cyblack_uniprocess_defapp_monitor_base_internal_get_monitored_type_type_strings_method(self);
            SubLObject template_type_string = NIL;
            for (template_type_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , template_type_string = cdolist_list_var.first()) {
                template_panel_type = cyblack_application.cyblack_basic_application_get_panel_type_method(self, template_type_string);
                template_ui_panel_type = (NIL != template_panel_type) ? ((SubLObject) (NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_SEQUENCE_PANEL) ? ((SubLObject) (CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_BACKWARD_PANEL) ? ((SubLObject) (CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_FORWARD_PANEL) ? ((SubLObject) (CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_CYCPANEL) ? ((SubLObject) (CYBLACK_BASIC_USER_INTERACTION_CYCPANEL)) : NIL != classes.subclassp(template_panel_type, CYBLACK_BASIC_PANEL) ? ((SubLObject) (CYBLACK_BASIC_USER_INTERACTION_PANEL)) : NIL)) : NIL;
                if (NIL != template_ui_panel_type) {
                    cyblack_application.cyblack_basic_application_override_panel_type_method(self, template_type_string, template_ui_panel_type);
                }
            }
            return T;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_set_monitored_type_type_strings_method(SubLObject self, SubLObject type_strings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!type_strings.isList()) {
                    Errors.error($str_alt571$_SET_MONITORED_TYPE_TYPE_STRINGS_, self, type_strings);
                }
            }
            {
                SubLObject cdolist_list_var = type_strings;
                SubLObject type_string = NIL;
                for (type_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , type_string = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!type_string.isString()) {
                            Errors.error($str_alt572$_SET_MONITORED_TYPE_TYPE_STRINGS_, self, type_string);
                        }
                    }
                }
            }
            cyblack_uniprocess_defapp_monitor_base_internal_set_monitored_type_type_strings_method(self, copy_list(type_strings));
            return type_strings;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_get_monitored_type_type_strings_method(SubLObject self) {
        return cyblack_uniprocess_defapp_monitor_base_internal_get_monitored_type_type_strings_method(self);
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_kill_io_monitor_method(SubLObject self) {
        cyblack_globals.$cyblack_io_loop_continue$.setDynamicValue(NIL);
        return NIL;
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_init_io_monitor_method(SubLObject self) {
        {
            SubLObject template_monitor = object.new_object_instance(CYBLACK_SEXPR_MONITOR);
            cyblack_uniprocess_defapp_monitor_base_set_io_monitor_method(self, template_monitor);
            methods.funcall_instance_method_with_1_args(template_monitor, SET_NORMAL_PROMPT, $str_alt578$_____);
            return template_monitor;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_set_io_monitor_method(SubLObject self, SubLObject new_io_monitor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == new_io_monitor) || (NIL != cyblack_sexpr_monitor.cyblack_sexpr_monitor_p(new_io_monitor)))) {
                    Errors.error($str_alt580$_SET_IO_MONITOR__S____S_is_not_an, self, new_io_monitor);
                }
            }
            cyblack_uniprocess_defapp_monitor_base_internal_set_io_monitor_method(self, new_io_monitor);
            return new_io_monitor;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_get_io_monitor_method(SubLObject self) {
        return cyblack_uniprocess_defapp_monitor_base_internal_get_io_monitor_method(self);
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_post_monitoring_initialize_method(SubLObject self) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            cyblack_uniprocess_defapp_monitor_base_init_io_monitor_method(self);
            cyblack_globals.$cyblack_io_stream_monitor_default_input$.setDynamicValue(StreamsLow.$standard_input$.getDynamicValue(thread), thread);
            cyblack_globals.$cyblack_io_stream_monitor_default_output$.setDynamicValue(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
            return T;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_pre_monitoring_initialize_method(SubLObject self) {
        cyblack_uniprocess_defapp_monitor_base_override_monitored_type_panel_associations_method(self);
        return T;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_uniprocess_defapp_monitor_base_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_uniprocess_defapp_monitor_base_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, HALT_STATUS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, DELAY_STANDARD_INITIALIZATION_P, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BASE, TERMINATE, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, KNOWLEDGE_SOURCE_BATTERY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, DATATYPE_DICTIONARY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CURRENT_SESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_CONNECTION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, ROOT_DATATYPE_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, AGENDA_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, BLACKBOARD_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, CONNECTION_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PARSER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, MESSAGE_BROKER_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, PORT_MANAGER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, EXTERNAL_MODULE_TABLE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, APPLICATION_ID, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_APPLICATION, INCOMING_MESSAGE_QUEUE, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIPROCESS_DEFAPP_BASE, PROCESS_SCHEDULER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIPROCESS_DEFAPP_BASE, APPLICATION_PROCESS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, IO_MONITOR, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, MONITORED_TYPE_TYPE_STRINGS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_p(SubLObject cyblack_uniprocess_defapp_monitor_base) {
        return classes.subloop_instanceof_class(cyblack_uniprocess_defapp_monitor_base, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE);
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_initialize_qua_cyblack_monitor_base_method(SubLObject self) {
        cyblack_uniprocess_defapp_monitor_base_internal_set_io_monitor_method(self, NIL);
        cyblack_uniprocess_defapp_monitor_base_internal_set_monitored_type_type_strings_method(self, NIL);
        return self;
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_internal_get_io_monitor_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_uniprocess_defapp_monitor_base_method = NIL;
            SubLObject io_monitor = get_cyblack_uniprocess_defapp_monitor_base_io_monitor(self);
            try {
                try {
                    sublisp_throw($sym709$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD, io_monitor);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_uniprocess_defapp_monitor_base_io_monitor(self, io_monitor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_uniprocess_defapp_monitor_base_method = Errors.handleThrowable(ccatch_env_var, $sym709$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD);
            }
            return catch_var_for_cyblack_uniprocess_defapp_monitor_base_method;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_internal_set_io_monitor_method(SubLObject self, SubLObject new_io_monitor) {
        {
            SubLObject catch_var_for_cyblack_uniprocess_defapp_monitor_base_method = NIL;
            SubLObject io_monitor = get_cyblack_uniprocess_defapp_monitor_base_io_monitor(self);
            try {
                try {
                    io_monitor = new_io_monitor;
                    sublisp_throw($sym711$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD, new_io_monitor);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_uniprocess_defapp_monitor_base_io_monitor(self, io_monitor);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_uniprocess_defapp_monitor_base_method = Errors.handleThrowable(ccatch_env_var, $sym711$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD);
            }
            return catch_var_for_cyblack_uniprocess_defapp_monitor_base_method;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_internal_get_monitored_type_type_strings_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_uniprocess_defapp_monitor_base_method = NIL;
            SubLObject monitored_type_type_strings = get_cyblack_uniprocess_defapp_monitor_base_monitored_type_type_strings(self);
            try {
                try {
                    sublisp_throw($sym713$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD, monitored_type_type_strings);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_uniprocess_defapp_monitor_base_monitored_type_type_strings(self, monitored_type_type_strings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_uniprocess_defapp_monitor_base_method = Errors.handleThrowable(ccatch_env_var, $sym713$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD);
            }
            return catch_var_for_cyblack_uniprocess_defapp_monitor_base_method;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_internal_set_monitored_type_type_strings_method(SubLObject self, SubLObject new_type_strings) {
        {
            SubLObject catch_var_for_cyblack_uniprocess_defapp_monitor_base_method = NIL;
            SubLObject monitored_type_type_strings = get_cyblack_uniprocess_defapp_monitor_base_monitored_type_type_strings(self);
            try {
                try {
                    monitored_type_type_strings = new_type_strings;
                    sublisp_throw($sym715$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD, new_type_strings);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_uniprocess_defapp_monitor_base_monitored_type_type_strings(self, monitored_type_type_strings);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_uniprocess_defapp_monitor_base_method = Errors.handleThrowable(ccatch_env_var, $sym715$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD);
            }
            return catch_var_for_cyblack_uniprocess_defapp_monitor_base_method;
        }
    }

    public static final SubLObject cyblack_uniprocess_defapp_monitor_base_initialize_method(SubLObject self) {
        {
            SubLObject monitored_type_type_strings = get_cyblack_uniprocess_defapp_monitor_base_monitored_type_type_strings(self);
            SubLObject io_monitor = get_cyblack_uniprocess_defapp_monitor_base_io_monitor(self);
            SubLObject delay_standard_initialization_p = get_cyblack_defapp_base_delay_standard_initialization_p(self);
            delay_standard_initialization_p = T;
            set_cyblack_defapp_base_delay_standard_initialization_p(self, delay_standard_initialization_p);
            cyblack_uniprocess_defapp_base_initialize_method(self);
            io_monitor = NIL;
            set_cyblack_uniprocess_defapp_monitor_base_io_monitor(self, io_monitor);
            monitored_type_type_strings = NIL;
            set_cyblack_uniprocess_defapp_monitor_base_monitored_type_type_strings(self, monitored_type_type_strings);
            cyblack_application.cyblack_basic_application_standard_initialization_method(self);
            return self;
        }
    }

    public static final SubLObject get_cyblack_defapp_expression_children(SubLObject cyblack_defapp_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_expression, TWO_INTEGER, CHILDREN);
    }

    public static final SubLObject set_cyblack_defapp_expression_children(SubLObject cyblack_defapp_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_expression, value, TWO_INTEGER, CHILDREN);
    }

    public static final SubLObject get_cyblack_defapp_expression_parent(SubLObject cyblack_defapp_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_expression, ONE_INTEGER, PARENT);
    }

    public static final SubLObject set_cyblack_defapp_expression_parent(SubLObject cyblack_defapp_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_expression, value, ONE_INTEGER, PARENT);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_expression_p(SubLObject cyblack_defapp_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_expression, CYBLACK_DEFAPP_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_expression_method = NIL;
            SubLObject children = get_cyblack_defapp_expression_children(self);
            SubLObject parent = get_cyblack_defapp_expression_parent(self);
            try {
                try {
                    object.object_initialize_method(self);
                    parent = NIL;
                    children = NIL;
                    sublisp_throw($sym725$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_expression_children(self, children);
                            set_cyblack_defapp_expression_parent(self, parent);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_expression_method = Errors.handleThrowable(ccatch_env_var, $sym725$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_expression_method;
        }
    }

    public static final SubLObject cyblack_defapp_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject cdolist_list_var = cyblack_defapp_expression_get_children_method(self);
            SubLObject child = NIL;
            for (child = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , child = cdolist_list_var.first()) {
                print(child, stream);
            }
            return self;
        }
    }

    public static final SubLObject cyblack_defapp_expression_get_parent_method(SubLObject self) {
        {
            SubLObject parent = get_cyblack_defapp_expression_parent(self);
            return parent;
        }
    }

    public static final SubLObject cyblack_defapp_expression_set_parent_method(SubLObject self, SubLObject new_parent) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_expression_method = NIL;
                SubLObject parent = get_cyblack_defapp_expression_parent(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_parent) || (NIL != cyblack_defapp_expression_p(new_parent)))) {
                                Errors.error($str_alt736$_SET_PARENT__S____S_is_not_an_ins, self, new_parent);
                            }
                        }
                        parent = new_parent;
                        if (NIL != parent) {
                            cyblack_defapp_expression_add_child_method(parent, self);
                        }
                        sublisp_throw($sym735$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXPRESSION_METHOD, parent);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_expression_parent(self, parent);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_expression_method = Errors.handleThrowable(ccatch_env_var, $sym735$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXPRESSION_METHOD);
                }
                return catch_var_for_cyblack_defapp_expression_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_expression_add_child_method(SubLObject self, SubLObject new_child) {
        {
            SubLObject children = get_cyblack_defapp_expression_children(self);
            if (NIL == subl_promotions.memberP(new_child, children, UNPROVIDED, UNPROVIDED)) {
                children = nconc(children, list(new_child));
                set_cyblack_defapp_expression_children(self, children);
            }
            return new_child;
        }
    }

    public static final SubLObject cyblack_defapp_expression_get_children_method(SubLObject self) {
        {
            SubLObject children = get_cyblack_defapp_expression_children(self);
            return children;
        }
    }

    public static final SubLObject get_cyblack_defapp_body_on_quiescence_expression(SubLObject cyblack_defapp_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_body, TWELVE_INTEGER, ON_QUIESCENCE_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defapp_body_on_quiescence_expression(SubLObject cyblack_defapp_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_body, value, TWELVE_INTEGER, ON_QUIESCENCE_EXPRESSION);
    }

    public static final SubLObject get_cyblack_defapp_body_on_shutdown_expression(SubLObject cyblack_defapp_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_body, ELEVEN_INTEGER, ON_SHUTDOWN_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defapp_body_on_shutdown_expression(SubLObject cyblack_defapp_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_body, value, ELEVEN_INTEGER, ON_SHUTDOWN_EXPRESSION);
    }

    public static final SubLObject get_cyblack_defapp_body_on_startup_expression(SubLObject cyblack_defapp_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_body, TEN_INTEGER, ON_STARTUP_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defapp_body_on_startup_expression(SubLObject cyblack_defapp_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_body, value, TEN_INTEGER, ON_STARTUP_EXPRESSION);
    }

    public static final SubLObject get_cyblack_defapp_body_on_empty_agenda_expression(SubLObject cyblack_defapp_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_body, NINE_INTEGER, ON_EMPTY_AGENDA_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defapp_body_on_empty_agenda_expression(SubLObject cyblack_defapp_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_body, value, NINE_INTEGER, ON_EMPTY_AGENDA_EXPRESSION);
    }

    public static final SubLObject get_cyblack_defapp_body_after_agenda_execute_expression(SubLObject cyblack_defapp_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_body, EIGHT_INTEGER, AFTER_AGENDA_EXECUTE_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defapp_body_after_agenda_execute_expression(SubLObject cyblack_defapp_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_body, value, EIGHT_INTEGER, AFTER_AGENDA_EXECUTE_EXPRESSION);
    }

    public static final SubLObject get_cyblack_defapp_body_before_agenda_execute_expression(SubLObject cyblack_defapp_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_body, SEVEN_INTEGER, BEFORE_AGENDA_EXECUTE_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defapp_body_before_agenda_execute_expression(SubLObject cyblack_defapp_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_body, value, SEVEN_INTEGER, BEFORE_AGENDA_EXECUTE_EXPRESSION);
    }

    public static final SubLObject get_cyblack_defapp_body_monitor_expression(SubLObject cyblack_defapp_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_body, SIX_INTEGER, MONITOR_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defapp_body_monitor_expression(SubLObject cyblack_defapp_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_body, value, SIX_INTEGER, MONITOR_EXPRESSION);
    }

    public static final SubLObject get_cyblack_defapp_body_agenda_expression(SubLObject cyblack_defapp_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_body, FIVE_INTEGER, AGENDA_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defapp_body_agenda_expression(SubLObject cyblack_defapp_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_body, value, FIVE_INTEGER, AGENDA_EXPRESSION);
    }

    public static final SubLObject get_cyblack_defapp_body_ksb_expression(SubLObject cyblack_defapp_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_body, FOUR_INTEGER, KSB_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defapp_body_ksb_expression(SubLObject cyblack_defapp_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_body, value, FOUR_INTEGER, KSB_EXPRESSION);
    }

    public static final SubLObject get_cyblack_defapp_body_blackboard_expression(SubLObject cyblack_defapp_body) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_body, THREE_INTEGER, BLACKBOARD_EXPRESSION);
    }

    public static final SubLObject set_cyblack_defapp_body_blackboard_expression(SubLObject cyblack_defapp_body, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_body, value, THREE_INTEGER, BLACKBOARD_EXPRESSION);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_body_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_body_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BODY, BLACKBOARD_EXPRESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BODY, KSB_EXPRESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BODY, AGENDA_EXPRESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BODY, MONITOR_EXPRESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BODY, BEFORE_AGENDA_EXECUTE_EXPRESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BODY, AFTER_AGENDA_EXECUTE_EXPRESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BODY, ON_EMPTY_AGENDA_EXPRESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BODY, ON_STARTUP_EXPRESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BODY, ON_SHUTDOWN_EXPRESSION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BODY, ON_QUIESCENCE_EXPRESSION, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_body_p(SubLObject cyblack_defapp_body) {
        return classes.subloop_instanceof_class(cyblack_defapp_body, CYBLACK_DEFAPP_BODY);
    }

    public static final SubLObject cyblack_defapp_body_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
            SubLObject on_shutdown_expression = get_cyblack_defapp_body_on_shutdown_expression(self);
            SubLObject on_startup_expression = get_cyblack_defapp_body_on_startup_expression(self);
            SubLObject on_empty_agenda_expression = get_cyblack_defapp_body_on_empty_agenda_expression(self);
            SubLObject after_agenda_execute_expression = get_cyblack_defapp_body_after_agenda_execute_expression(self);
            SubLObject before_agenda_execute_expression = get_cyblack_defapp_body_before_agenda_execute_expression(self);
            SubLObject agenda_expression = get_cyblack_defapp_body_agenda_expression(self);
            SubLObject ksb_expression = get_cyblack_defapp_body_ksb_expression(self);
            SubLObject blackboard_expression = get_cyblack_defapp_body_blackboard_expression(self);
            try {
                try {
                    cyblack_defapp_expression_initialize_method(self);
                    blackboard_expression = NIL;
                    ksb_expression = NIL;
                    agenda_expression = NIL;
                    before_agenda_execute_expression = NIL;
                    after_agenda_execute_expression = NIL;
                    on_empty_agenda_expression = NIL;
                    on_startup_expression = NIL;
                    on_shutdown_expression = NIL;
                    sublisp_throw($sym760$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_body_on_shutdown_expression(self, on_shutdown_expression);
                            set_cyblack_defapp_body_on_startup_expression(self, on_startup_expression);
                            set_cyblack_defapp_body_on_empty_agenda_expression(self, on_empty_agenda_expression);
                            set_cyblack_defapp_body_after_agenda_execute_expression(self, after_agenda_execute_expression);
                            set_cyblack_defapp_body_before_agenda_execute_expression(self, before_agenda_execute_expression);
                            set_cyblack_defapp_body_agenda_expression(self, agenda_expression);
                            set_cyblack_defapp_body_ksb_expression(self, ksb_expression);
                            set_cyblack_defapp_body_blackboard_expression(self, blackboard_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym760$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
            }
            return catch_var_for_cyblack_defapp_body_method;
        }
    }

    public static final SubLObject cyblack_defapp_body_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject on_shutdown_expression = get_cyblack_defapp_body_on_shutdown_expression(self);
            SubLObject on_startup_expression = get_cyblack_defapp_body_on_startup_expression(self);
            SubLObject on_empty_agenda_expression = get_cyblack_defapp_body_on_empty_agenda_expression(self);
            SubLObject agenda_expression = get_cyblack_defapp_body_agenda_expression(self);
            SubLObject ksb_expression = get_cyblack_defapp_body_ksb_expression(self);
            SubLObject blackboard_expression = get_cyblack_defapp_body_blackboard_expression(self);
            SubLObject first_printed = T;
            if (NIL != blackboard_expression) {
                format(stream, $str_alt763$_S, blackboard_expression);
                first_printed = NIL;
            }
            if (NIL != ksb_expression) {
                if (NIL == first_printed) {
                    format(stream, $str_alt764$_);
                }
                format(stream, $str_alt763$_S, ksb_expression);
                first_printed = NIL;
            }
            if (NIL != agenda_expression) {
                if (NIL == first_printed) {
                    format(stream, $str_alt764$_);
                }
                format(stream, $str_alt763$_S, agenda_expression);
                first_printed = NIL;
            }
            if (NIL != on_empty_agenda_expression) {
                if (NIL == first_printed) {
                    format(stream, $str_alt764$_);
                }
                format(stream, $str_alt763$_S, on_empty_agenda_expression);
                first_printed = NIL;
            }
            if (NIL != on_startup_expression) {
                if (NIL == first_printed) {
                    format(stream, $str_alt764$_);
                }
                format(stream, $str_alt763$_S, on_startup_expression);
                first_printed = NIL;
            }
            if (NIL != on_shutdown_expression) {
                if (NIL == first_printed) {
                    format(stream, $str_alt764$_);
                }
                format(stream, $str_alt763$_S, on_shutdown_expression);
                first_printed = NIL;
            }
            return self;
        }
    }

    public static final SubLObject cyblack_defapp_body_get_blackboard_expression_method(SubLObject self) {
        {
            SubLObject blackboard_expression = get_cyblack_defapp_body_blackboard_expression(self);
            return blackboard_expression;
        }
    }

    public static final SubLObject cyblack_defapp_body_set_blackboard_expression_method(SubLObject self, SubLObject new_blackboard_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
                SubLObject blackboard_expression = get_cyblack_defapp_body_blackboard_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_blackboard_expression) || (NIL != cyblack_defapp_blackboard_expression_p(new_blackboard_expression)))) {
                                Errors.error($str_alt773$_SET_BLACKBOARD_EXPRESSION__S____, self, new_blackboard_expression);
                            }
                        }
                        blackboard_expression = new_blackboard_expression;
                        if (NIL != blackboard_expression) {
                            cyblack_defapp_expression_set_parent_method(blackboard_expression, self);
                        }
                        sublisp_throw($sym772$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, new_blackboard_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_body_blackboard_expression(self, blackboard_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym772$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
                }
                return catch_var_for_cyblack_defapp_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_body_get_ksb_expression_method(SubLObject self) {
        {
            SubLObject ksb_expression = get_cyblack_defapp_body_ksb_expression(self);
            return ksb_expression;
        }
    }

    public static final SubLObject cyblack_defapp_body_set_ksb_expression_method(SubLObject self, SubLObject new_ksb_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
                SubLObject ksb_expression = get_cyblack_defapp_body_ksb_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_ksb_expression) || (NIL != cyblack_defapp_ksb_expression_p(new_ksb_expression)))) {
                                Errors.error($str_alt782$_SET_KSB_EXPRESSION__S____S_is_no, self, new_ksb_expression);
                            }
                        }
                        ksb_expression = new_ksb_expression;
                        if (NIL != ksb_expression) {
                            cyblack_defapp_expression_set_parent_method(ksb_expression, self);
                        }
                        sublisp_throw($sym781$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, new_ksb_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_body_ksb_expression(self, ksb_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym781$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
                }
                return catch_var_for_cyblack_defapp_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_body_get_agenda_expression_method(SubLObject self) {
        {
            SubLObject agenda_expression = get_cyblack_defapp_body_agenda_expression(self);
            return agenda_expression;
        }
    }

    public static final SubLObject cyblack_defapp_body_set_agenda_expression_method(SubLObject self, SubLObject new_agenda_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
                SubLObject agenda_expression = get_cyblack_defapp_body_agenda_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_agenda_expression) || (NIL != cyblack_defapp_agenda_expression_p(new_agenda_expression)))) {
                                Errors.error($str_alt791$_SET_AGENDA_EXPRESSION__S____S_is, self, new_agenda_expression);
                            }
                        }
                        agenda_expression = new_agenda_expression;
                        if (NIL != agenda_expression) {
                            cyblack_defapp_expression_set_parent_method(agenda_expression, self);
                        }
                        sublisp_throw($sym790$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, new_agenda_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_body_agenda_expression(self, agenda_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym790$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
                }
                return catch_var_for_cyblack_defapp_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_body_get_monitor_expression_method(SubLObject self) {
        {
            SubLObject monitor_expression = get_cyblack_defapp_body_monitor_expression(self);
            return monitor_expression;
        }
    }

    public static final SubLObject cyblack_defapp_body_set_monitor_expression_method(SubLObject self, SubLObject new_monitor_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
                SubLObject monitor_expression = get_cyblack_defapp_body_monitor_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_monitor_expression) || (NIL != cyblack_defapp_monitor_expression_p(new_monitor_expression)))) {
                                Errors.error($str_alt800$_SET_MONITOR_EXPRESSION___S____S_, self, new_monitor_expression);
                            }
                        }
                        monitor_expression = new_monitor_expression;
                        if (NIL != monitor_expression) {
                            cyblack_defapp_expression_set_parent_method(monitor_expression, self);
                        }
                        sublisp_throw($sym799$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, new_monitor_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_body_monitor_expression(self, monitor_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym799$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
                }
                return catch_var_for_cyblack_defapp_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_body_get_monitored_datatypes_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
            SubLObject monitor_expression = get_cyblack_defapp_body_monitor_expression(self);
            try {
                try {
                    if (NIL != monitor_expression) {
                        sublisp_throw($sym804$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, cyblack_defapp_monitor_expression_get_datatype_names_method(monitor_expression));
                    }
                    sublisp_throw($sym804$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_body_monitor_expression(self, monitor_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym804$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
            }
            return catch_var_for_cyblack_defapp_body_method;
        }
    }

    public static final SubLObject cyblack_defapp_body_get_before_agenda_execute_expression_method(SubLObject self) {
        {
            SubLObject before_agenda_execute_expression = get_cyblack_defapp_body_before_agenda_execute_expression(self);
            return before_agenda_execute_expression;
        }
    }

    public static final SubLObject cyblack_defapp_body_set_before_agenda_execute_expression_method(SubLObject self, SubLObject new_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
                SubLObject before_agenda_execute_expression = get_cyblack_defapp_body_before_agenda_execute_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_expression) || (NIL != cyblack_defapp_after_agenda_execute_expression_p(new_expression)))) {
                                Errors.error($str_alt813$_SET_BEFORE_AGENDA_EXECUTE_EXPRES, self, new_expression);
                            }
                        }
                        before_agenda_execute_expression = new_expression;
                        if (NIL != before_agenda_execute_expression) {
                            cyblack_defapp_expression_set_parent_method(before_agenda_execute_expression, self);
                        }
                        sublisp_throw($sym812$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, new_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_body_before_agenda_execute_expression(self, before_agenda_execute_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym812$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
                }
                return catch_var_for_cyblack_defapp_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_body_get_after_agenda_execute_expression_method(SubLObject self) {
        {
            SubLObject after_agenda_execute_expression = get_cyblack_defapp_body_after_agenda_execute_expression(self);
            return after_agenda_execute_expression;
        }
    }

    public static final SubLObject cyblack_defapp_body_set_after_agenda_execute_expression_method(SubLObject self, SubLObject new_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
                SubLObject after_agenda_execute_expression = get_cyblack_defapp_body_after_agenda_execute_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_expression) || (NIL != cyblack_defapp_after_agenda_execute_expression_p(new_expression)))) {
                                Errors.error($str_alt821$_SET_AFTER_AGENDA_EXECUTE_EXPRESS, self, new_expression);
                            }
                        }
                        after_agenda_execute_expression = new_expression;
                        if (NIL != after_agenda_execute_expression) {
                            cyblack_defapp_expression_set_parent_method(after_agenda_execute_expression, self);
                        }
                        sublisp_throw($sym820$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, new_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_body_after_agenda_execute_expression(self, after_agenda_execute_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym820$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
                }
                return catch_var_for_cyblack_defapp_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_body_get_on_empty_agenda_expression_method(SubLObject self) {
        {
            SubLObject on_empty_agenda_expression = get_cyblack_defapp_body_on_empty_agenda_expression(self);
            return on_empty_agenda_expression;
        }
    }

    public static final SubLObject cyblack_defapp_body_set_on_empty_agenda_expression_method(SubLObject self, SubLObject new_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
                SubLObject on_empty_agenda_expression = get_cyblack_defapp_body_on_empty_agenda_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_expression) || (NIL != cyblack_defapp_on_empty_agenda_expression_p(new_expression)))) {
                                Errors.error($str_alt829$_SET_ON_EMPTY_AGENDA_EXPRESSION__, self, new_expression);
                            }
                        }
                        on_empty_agenda_expression = new_expression;
                        if (NIL != on_empty_agenda_expression) {
                            cyblack_defapp_expression_set_parent_method(on_empty_agenda_expression, self);
                        }
                        sublisp_throw($sym828$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, new_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_body_on_empty_agenda_expression(self, on_empty_agenda_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym828$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
                }
                return catch_var_for_cyblack_defapp_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_body_get_on_startup_expression_method(SubLObject self) {
        {
            SubLObject on_startup_expression = get_cyblack_defapp_body_on_startup_expression(self);
            return on_startup_expression;
        }
    }

    public static final SubLObject cyblack_defapp_body_set_on_startup_expression_method(SubLObject self, SubLObject new_on_startup_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
                SubLObject on_startup_expression = get_cyblack_defapp_body_on_startup_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_on_startup_expression) || (NIL != cyblack_defapp_on_startup_expression_p(new_on_startup_expression)))) {
                                Errors.error($str_alt838$_SET_ON_STARTUP_EXPRESSION__S____, self, new_on_startup_expression);
                            }
                        }
                        on_startup_expression = new_on_startup_expression;
                        if (NIL != on_startup_expression) {
                            cyblack_defapp_expression_set_parent_method(on_startup_expression, self);
                        }
                        sublisp_throw($sym837$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, new_on_startup_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_body_on_startup_expression(self, on_startup_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym837$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
                }
                return catch_var_for_cyblack_defapp_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_body_get_on_shutdown_expression_method(SubLObject self) {
        {
            SubLObject on_shutdown_expression = get_cyblack_defapp_body_on_shutdown_expression(self);
            return on_shutdown_expression;
        }
    }

    public static final SubLObject cyblack_defapp_body_set_on_shutdown_expression_method(SubLObject self, SubLObject new_on_shutdown_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
                SubLObject on_shutdown_expression = get_cyblack_defapp_body_on_shutdown_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_on_shutdown_expression) || (NIL != cyblack_defapp_on_shutdown_expression_p(new_on_shutdown_expression)))) {
                                Errors.error($str_alt847$_SET_ON_SHUTDOWN_EXPRESSION__S___, self, new_on_shutdown_expression);
                            }
                        }
                        on_shutdown_expression = new_on_shutdown_expression;
                        if (NIL != on_shutdown_expression) {
                            cyblack_defapp_expression_set_parent_method(on_shutdown_expression, self);
                        }
                        sublisp_throw($sym846$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, new_on_shutdown_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_body_on_shutdown_expression(self, on_shutdown_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym846$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
                }
                return catch_var_for_cyblack_defapp_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_body_get_on_quiescence_expression_method(SubLObject self) {
        {
            SubLObject on_quiescence_expression = get_cyblack_defapp_body_on_quiescence_expression(self);
            return on_quiescence_expression;
        }
    }

    public static final SubLObject cyblack_defapp_body_set_on_quiescence_expression_method(SubLObject self, SubLObject new_on_quiescence_expression) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
                SubLObject on_quiescence_expression = get_cyblack_defapp_body_on_quiescence_expression(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_on_quiescence_expression) || (NIL != cyblack_defapp_on_quiescence_expression_p(new_on_quiescence_expression)))) {
                                Errors.error($str_alt856$_SET_ON_QUIESCENCE_EXPRESSION__S_, self, new_on_quiescence_expression);
                            }
                        }
                        on_quiescence_expression = new_on_quiescence_expression;
                        if (NIL != on_quiescence_expression) {
                            cyblack_defapp_expression_set_parent_method(on_quiescence_expression, self);
                        }
                        sublisp_throw($sym855$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, new_on_quiescence_expression);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_body_on_quiescence_expression(self, on_quiescence_expression);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym855$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
                }
                return catch_var_for_cyblack_defapp_body_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_body_get_default_base_class_method(SubLObject self) {
        {
            SubLObject ksb_info = cyblack_defapp_body_get_ksb_info_method(self);
            if (NIL != ksb_info) {
                {
                    SubLObject base_class = cyblack_defksb.cyblack_ksb_info_get_default_application_base_class_method(ksb_info);
                    if (NIL != base_class) {
                        if (NIL != cyblack_defapp_body_get_monitored_datatypes_method(self)) {
                            if (base_class == CYBLACK_DEFAPP_BASE) {
                                return CYBLACK_DEFAPP_MONITOR_BASE;
                            } else {
                                if (base_class == CYBLACK_DEFAPP_EXTERNAL_BASE) {
                                    return CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE;
                                } else {
                                    return base_class;
                                }
                            }
                        } else {
                            return base_class;
                        }
                    }
                }
            }
            return CYBLACK_DEFAPP_EXTERNAL_BASE;
        }
    }

    public static final SubLObject cyblack_defapp_body_get_blackboard_info_method(SubLObject self) {
        {
            SubLObject blackboard_expression = get_cyblack_defapp_body_blackboard_expression(self);
            if (NIL != blackboard_expression) {
                return cyblack_defapp_blackboard_expression_get_blackboard_info_method(blackboard_expression);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_defapp_body_get_ksb_info_method(SubLObject self) {
        {
            SubLObject ksb_expression = get_cyblack_defapp_body_ksb_expression(self);
            if (NIL != ksb_expression) {
                return cyblack_defapp_ksb_expression_get_ksb_info_method(ksb_expression);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_defapp_body_compile_to_initialize_method_body_method(SubLObject self) {
        {
            SubLObject blackboard_info = cyblack_defapp_body_get_blackboard_info_method(self);
            SubLObject ksb_info = cyblack_defapp_body_get_ksb_info_method(self);
            return append(NIL != blackboard_info ? ((SubLObject) (cyblack_defbb.cyblack_blackboard_info_compile_to_subtype_expressions_method(blackboard_info))) : NIL, NIL != ksb_info ? ((SubLObject) (cyblack_defksb.cyblack_ksb_info_compile_to_ksb_installation_expressions_method(ksb_info))) : NIL, NIL);
        }
    }

    public static final SubLObject cyblack_defapp_body_compile_to_user_on_startup_method_body_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
            SubLObject on_startup_expression = get_cyblack_defapp_body_on_startup_expression(self);
            try {
                try {
                    if (NIL != on_startup_expression) {
                        sublisp_throw($sym872$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, methods.funcall_instance_method_with_0_args(on_startup_expression, COMPILE_TO_BODY));
                    }
                    sublisp_throw($sym872$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_body_on_startup_expression(self, on_startup_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym872$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
            }
            return catch_var_for_cyblack_defapp_body_method;
        }
    }

    public static final SubLObject cyblack_defapp_body_compile_to_user_on_shutdown_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
            SubLObject on_shutdown_expression = get_cyblack_defapp_body_on_shutdown_expression(self);
            try {
                try {
                    if (NIL != on_shutdown_expression) {
                        sublisp_throw($sym877$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, methods.funcall_instance_method_with_0_args(on_shutdown_expression, COMPILE_TO_BODY));
                    }
                    sublisp_throw($sym877$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_body_on_shutdown_expression(self, on_shutdown_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym877$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
            }
            return catch_var_for_cyblack_defapp_body_method;
        }
    }

    public static final SubLObject cyblack_defapp_body_compile_to_on_quiescence_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
            SubLObject on_quiescence_expression = get_cyblack_defapp_body_on_quiescence_expression(self);
            try {
                try {
                    if (NIL != on_quiescence_expression) {
                        sublisp_throw($sym881$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, methods.funcall_instance_method_with_0_args(on_quiescence_expression, COMPILE_TO_BODY));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_body_on_quiescence_expression(self, on_quiescence_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym881$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
            }
            return catch_var_for_cyblack_defapp_body_method;
        }
    }

    public static final SubLObject cyblack_defapp_body_compile_to_on_empty_agenda_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_body_method = NIL;
            SubLObject on_empty_agenda_expression = get_cyblack_defapp_body_on_empty_agenda_expression(self);
            try {
                try {
                    if (NIL != on_empty_agenda_expression) {
                        sublisp_throw($sym885$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, methods.funcall_instance_method_with_0_args(on_empty_agenda_expression, COMPILE_TO_BODY));
                    }
                    sublisp_throw($sym885$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_body_on_empty_agenda_expression(self, on_empty_agenda_expression);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_body_method = Errors.handleThrowable(ccatch_env_var, $sym885$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD);
            }
            return catch_var_for_cyblack_defapp_body_method;
        }
    }

    public static final SubLObject get_cyblack_defapp_blackboard_expression_blackboard_identifier(SubLObject cyblack_defapp_blackboard_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_blackboard_expression, THREE_INTEGER, BLACKBOARD_IDENTIFIER);
    }

    public static final SubLObject set_cyblack_defapp_blackboard_expression_blackboard_identifier(SubLObject cyblack_defapp_blackboard_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_blackboard_expression, value, THREE_INTEGER, BLACKBOARD_IDENTIFIER);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_blackboard_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_blackboard_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, BLACKBOARD_IDENTIFIER, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_blackboard_expression_p(SubLObject cyblack_defapp_blackboard_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_blackboard_expression, CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_blackboard_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_blackboard_expression_method = NIL;
            SubLObject blackboard_identifier = get_cyblack_defapp_blackboard_expression_blackboard_identifier(self);
            try {
                try {
                    cyblack_defapp_expression_initialize_method(self);
                    blackboard_identifier = NIL;
                    sublisp_throw($sym893$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_blackboard_expression_blackboard_identifier(self, blackboard_identifier);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_blackboard_expression_method = Errors.handleThrowable(ccatch_env_var, $sym893$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_blackboard_expression_method;
        }
    }

    public static final SubLObject cyblack_defapp_blackboard_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defapp_blackboard_expression_method = NIL;
            SubLObject blackboard_identifier = get_cyblack_defapp_blackboard_expression_blackboard_identifier(self);
            try {
                try {
                    format(stream, $str_alt897$__BLACKBOARD__S_, blackboard_identifier);
                    sublisp_throw($sym896$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_blackboard_expression_blackboard_identifier(self, blackboard_identifier);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_blackboard_expression_method = Errors.handleThrowable(ccatch_env_var, $sym896$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_blackboard_expression_method;
        }
    }

    public static final SubLObject cyblack_defapp_blackboard_expression_get_blackboard_identifier_method(SubLObject self) {
        {
            SubLObject blackboard_identifier = get_cyblack_defapp_blackboard_expression_blackboard_identifier(self);
            return blackboard_identifier;
        }
    }

    public static final SubLObject cyblack_defapp_blackboard_expression_set_blackboard_identifier_method(SubLObject self, SubLObject new_blackboard_identifier) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_blackboard_expression_method = NIL;
                SubLObject blackboard_identifier = get_cyblack_defapp_blackboard_expression_blackboard_identifier(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_blackboard_identifier.isSymbol()) {
                                Errors.error($str_alt906$_SET_BLACKBOARD_IDENTIFIER__S____, self, new_blackboard_identifier);
                            }
                        }
                        if (NIL != new_blackboard_identifier) {
                            if (NIL == cyblack_defbb.cyblack_get_blackboard_info(new_blackboard_identifier)) {
                                Errors.warn($str_alt907$_SET_BLACKBOARD_IDENTIFIER__S____, self, new_blackboard_identifier);
                            }
                        }
                        blackboard_identifier = new_blackboard_identifier;
                        sublisp_throw($sym905$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_METHOD, new_blackboard_identifier);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_blackboard_expression_blackboard_identifier(self, blackboard_identifier);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_blackboard_expression_method = Errors.handleThrowable(ccatch_env_var, $sym905$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_METHOD);
                }
                return catch_var_for_cyblack_defapp_blackboard_expression_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_blackboard_expression_get_blackboard_info_method(SubLObject self) {
        {
            SubLObject blackboard_identifier = get_cyblack_defapp_blackboard_expression_blackboard_identifier(self);
            if (NIL != blackboard_identifier) {
                return cyblack_defbb.cyblack_get_blackboard_info(blackboard_identifier);
            }
            return NIL;
        }
    }

    public static final SubLObject get_cyblack_defapp_ksb_expression_ksb_identifier(SubLObject cyblack_defapp_ksb_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_ksb_expression, THREE_INTEGER, KSB_IDENTIFIER);
    }

    public static final SubLObject set_cyblack_defapp_ksb_expression_ksb_identifier(SubLObject cyblack_defapp_ksb_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_ksb_expression, value, THREE_INTEGER, KSB_IDENTIFIER);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_ksb_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_ksb_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_KSB_EXPRESSION, KSB_IDENTIFIER, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_ksb_expression_p(SubLObject cyblack_defapp_ksb_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_ksb_expression, CYBLACK_DEFAPP_KSB_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_ksb_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_ksb_expression_method = NIL;
            SubLObject ksb_identifier = get_cyblack_defapp_ksb_expression_ksb_identifier(self);
            try {
                try {
                    cyblack_defapp_expression_initialize_method(self);
                    ksb_identifier = NIL;
                    sublisp_throw($sym917$OUTER_CATCH_FOR_CYBLACK_DEFAPP_KSB_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_ksb_expression_ksb_identifier(self, ksb_identifier);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_ksb_expression_method = Errors.handleThrowable(ccatch_env_var, $sym917$OUTER_CATCH_FOR_CYBLACK_DEFAPP_KSB_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_ksb_expression_method;
        }
    }

    public static final SubLObject cyblack_defapp_ksb_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject ksb_identifier = get_cyblack_defapp_ksb_expression_ksb_identifier(self);
            format(stream, $str_alt920$__KNOWLEDGE_SOURCE_BATTERY__S_, ksb_identifier);
            return self;
        }
    }

    public static final SubLObject cyblack_defapp_ksb_expression_get_ksb_identifier_method(SubLObject self) {
        {
            SubLObject ksb_identifier = get_cyblack_defapp_ksb_expression_ksb_identifier(self);
            return ksb_identifier;
        }
    }

    public static final SubLObject cyblack_defapp_ksb_expression_set_ksb_identifier_method(SubLObject self, SubLObject new_ksb_identifier) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_ksb_expression_method = NIL;
                SubLObject ksb_identifier = get_cyblack_defapp_ksb_expression_ksb_identifier(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_ksb_identifier.isSymbol()) {
                                Errors.error($str_alt929$_SET_KSB_IDENTIFIER__S____S_is_no, self, new_ksb_identifier);
                            }
                        }
                        ksb_identifier = new_ksb_identifier;
                        sublisp_throw($sym928$OUTER_CATCH_FOR_CYBLACK_DEFAPP_KSB_EXPRESSION_METHOD, new_ksb_identifier);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_ksb_expression_ksb_identifier(self, ksb_identifier);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_ksb_expression_method = Errors.handleThrowable(ccatch_env_var, $sym928$OUTER_CATCH_FOR_CYBLACK_DEFAPP_KSB_EXPRESSION_METHOD);
                }
                return catch_var_for_cyblack_defapp_ksb_expression_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_ksb_expression_get_ksb_info_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_ksb_expression_method = NIL;
            SubLObject ksb_identifier = get_cyblack_defapp_ksb_expression_ksb_identifier(self);
            try {
                try {
                    if (NIL != ksb_identifier) {
                        sublisp_throw($sym932$OUTER_CATCH_FOR_CYBLACK_DEFAPP_KSB_EXPRESSION_METHOD, cyblack_defksb.cyblack_get_ksb_info(ksb_identifier));
                    }
                    sublisp_throw($sym932$OUTER_CATCH_FOR_CYBLACK_DEFAPP_KSB_EXPRESSION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_ksb_expression_ksb_identifier(self, ksb_identifier);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_ksb_expression_method = Errors.handleThrowable(ccatch_env_var, $sym932$OUTER_CATCH_FOR_CYBLACK_DEFAPP_KSB_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_ksb_expression_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_agenda_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_agenda_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_agenda_expression_p(SubLObject cyblack_defapp_agenda_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_agenda_expression, CYBLACK_DEFAPP_AGENDA_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_agenda_expression_get_agenda_class_method(SubLObject self) {
        return NIL;
    }

    /**
     * Enumerated values of type CYBLACK-DEFAPP-AGENDA-TYPE.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_defapp_agenda_types$ = makeSymbol("*VALID-CYBLACK-DEFAPP-AGENDA-TYPES*");

    /**
     * Returns a list of all valid members of the CYBLACK-DEFAPP-AGENDA-TYPE enumeration.
     */
    public static final SubLObject valid_cyblack_defapp_agenda_types() {
        return $valid_cyblack_defapp_agenda_types$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-DEFAPP-AGENDA-TYPE enumeration.
     */
    public static final SubLObject cyblack_defapp_agenda_type_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_defapp_agenda_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-DEFAPP-AGENDA-TYPE enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_defapp_agenda_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_defapp_agenda_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt294$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_DEFAPP_AGENDA_TYPE, value, CYBLACK_DEFAPP_AGENDA_TYPE);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-DEFAPP-AGENDA-TYPE enumeration.
     */
    public static final SubLObject decode_cyblack_defapp_agenda_type(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_defapp_agenda_types$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt296$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_DEFAPP_AGENDA_TYPE, value, CYBLACK_DEFAPP_AGENDA_TYPE);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-DEFAPP-AGENDA-TYPE enumeration.
     */
    public static final SubLObject cyblack_defapp_agenda_type_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_AGENDA_TYPE_P, value1, CYBLACK_DEFAPP_AGENDA_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_AGENDA_TYPE_P, value2, CYBLACK_DEFAPP_AGENDA_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defapp_agenda_types$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-DEFAPP-AGENDA-TYPE enumeration.
     */
    public static final SubLObject cyblack_defapp_agenda_type_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_type_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_AGENDA_TYPE_P, value1, CYBLACK_DEFAPP_AGENDA_TYPE);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_agenda_type_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_AGENDA_TYPE_P, value2, CYBLACK_DEFAPP_AGENDA_TYPE);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defapp_agenda_types$.getGlobalValue();
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

    public static final SubLObject get_cyblack_defapp_predefined_agenda_expression_agenda_type(SubLObject cyblack_defapp_predefined_agenda_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_predefined_agenda_expression, THREE_INTEGER, AGENDA_TYPE);
    }

    public static final SubLObject set_cyblack_defapp_predefined_agenda_expression_agenda_type(SubLObject cyblack_defapp_predefined_agenda_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_predefined_agenda_expression, value, THREE_INTEGER, AGENDA_TYPE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_predefined_agenda_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_predefined_agenda_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, AGENDA_TYPE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_predefined_agenda_expression_p(SubLObject cyblack_defapp_predefined_agenda_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_predefined_agenda_expression, CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_predefined_agenda_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_predefined_agenda_expression_method = NIL;
            SubLObject agenda_type = get_cyblack_defapp_predefined_agenda_expression_agenda_type(self);
            try {
                try {
                    cyblack_defapp_expression_initialize_method(self);
                    agenda_type = $SIMPLE_QUEUE;
                    sublisp_throw($sym951$OUTER_CATCH_FOR_CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_METHO, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_predefined_agenda_expression_agenda_type(self, agenda_type);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_predefined_agenda_expression_method = Errors.handleThrowable(ccatch_env_var, $sym951$OUTER_CATCH_FOR_CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_METHO);
            }
            return catch_var_for_cyblack_defapp_predefined_agenda_expression_method;
        }
    }

    public static final SubLObject cyblack_defapp_predefined_agenda_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject agenda_type = get_cyblack_defapp_predefined_agenda_expression_agenda_type(self);
            format(stream, $str_alt955$__AGENDA__S_, agenda_type);
            return self;
        }
    }

    public static final SubLObject cyblack_defapp_predefined_agenda_expression_get_agenda_type_method(SubLObject self) {
        {
            SubLObject agenda_type = get_cyblack_defapp_predefined_agenda_expression_agenda_type(self);
            return agenda_type;
        }
    }

    public static final SubLObject cyblack_defapp_predefined_agenda_expression_set_agenda_type_method(SubLObject self, SubLObject new_agenda_type) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_predefined_agenda_expression_method = NIL;
                SubLObject agenda_type = get_cyblack_defapp_predefined_agenda_expression_agenda_type(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_agenda_type) || (NIL != cyblack_defapp_agenda_type_p(new_agenda_type)))) {
                                Errors.error($str_alt964$_SET_AGENDA_TYPE__S____S_is_not_a, self, new_agenda_type);
                            }
                        }
                        agenda_type = new_agenda_type;
                        sublisp_throw($sym963$OUTER_CATCH_FOR_CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_METHO, new_agenda_type);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_predefined_agenda_expression_agenda_type(self, agenda_type);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_predefined_agenda_expression_method = Errors.handleThrowable(ccatch_env_var, $sym963$OUTER_CATCH_FOR_CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_METHO);
                }
                return catch_var_for_cyblack_defapp_predefined_agenda_expression_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_predefined_agenda_expression_get_agenda_class_method(SubLObject self) {
        {
            SubLObject agenda_type = get_cyblack_defapp_predefined_agenda_expression_agenda_type(self);
            SubLObject pcase_var = agenda_type;
            if (pcase_var.eql($SIMPLE_QUEUE)) {
                return CYBLACK_DEFAPP_AGENDA_BASE;
            } else
                if (pcase_var.eql($SIMPLE_HEURISTIC_QUEUE)) {
                    return CYBLACK_DEFAPP_AGENDA_BASE;
                } else {
                    return NIL;
                }

        }
    }

    public static final SubLObject get_cyblack_defapp_custom_agenda_expression_agenda_class(SubLObject cyblack_defapp_custom_agenda_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_custom_agenda_expression, THREE_INTEGER, AGENDA_CLASS);
    }

    public static final SubLObject set_cyblack_defapp_custom_agenda_expression_agenda_class(SubLObject cyblack_defapp_custom_agenda_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_custom_agenda_expression, value, THREE_INTEGER, AGENDA_CLASS);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_custom_agenda_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_custom_agenda_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, AGENDA_CLASS, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_custom_agenda_expression_p(SubLObject cyblack_defapp_custom_agenda_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_custom_agenda_expression, CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_custom_agenda_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_custom_agenda_expression_method = NIL;
            SubLObject agenda_class = get_cyblack_defapp_custom_agenda_expression_agenda_class(self);
            try {
                try {
                    cyblack_defapp_expression_initialize_method(self);
                    agenda_class = CYBLACK_DEFAPP_AGENDA_BASE;
                    sublisp_throw($sym974$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_custom_agenda_expression_agenda_class(self, agenda_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_custom_agenda_expression_method = Errors.handleThrowable(ccatch_env_var, $sym974$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_custom_agenda_expression_method;
        }
    }

    public static final SubLObject cyblack_defapp_custom_agenda_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject agenda_class = get_cyblack_defapp_custom_agenda_expression_agenda_class(self);
            format(stream, $str_alt955$__AGENDA__S_, agenda_class);
            return self;
        }
    }

    public static final SubLObject cyblack_defapp_custom_agenda_expression_get_agenda_class_method(SubLObject self) {
        {
            SubLObject agenda_class = get_cyblack_defapp_custom_agenda_expression_agenda_class(self);
            return agenda_class;
        }
    }

    public static final SubLObject cyblack_defapp_custom_agenda_expression_set_agenda_class_method(SubLObject self, SubLObject new_agenda_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_custom_agenda_expression_method = NIL;
                SubLObject agenda_class = get_cyblack_defapp_custom_agenda_expression_agenda_class(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_agenda_class.isSymbol()) {
                                Errors.error($str_alt984$_SET_AGENDA_CLASS__S____S_is_not_, self, new_agenda_class);
                            }
                        }
                        if (!((NIL == new_agenda_class) || (NIL != classes.classes_implements_p(new_agenda_class, CYBLACK_AGENDA)))) {
                            Errors.warn($str_alt986$_SET_AGENDA_CLASS__S____S_does_no, self, new_agenda_class);
                        }
                        agenda_class = new_agenda_class;
                        sublisp_throw($sym983$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_METHOD, new_agenda_class);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_custom_agenda_expression_agenda_class(self, agenda_class);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_custom_agenda_expression_method = Errors.handleThrowable(ccatch_env_var, $sym983$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_METHOD);
                }
                return catch_var_for_cyblack_defapp_custom_agenda_expression_method;
            }
        }
    }

    public static final SubLObject get_cyblack_defapp_monitor_expression_datatype_names(SubLObject cyblack_defapp_monitor_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_monitor_expression, THREE_INTEGER, DATATYPE_NAMES);
    }

    public static final SubLObject set_cyblack_defapp_monitor_expression_datatype_names(SubLObject cyblack_defapp_monitor_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_monitor_expression, value, THREE_INTEGER, DATATYPE_NAMES);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_monitor_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_monitor_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_MONITOR_EXPRESSION, DATATYPE_NAMES, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_monitor_expression_p(SubLObject cyblack_defapp_monitor_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_monitor_expression, CYBLACK_DEFAPP_MONITOR_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_monitor_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_monitor_expression_method = NIL;
            SubLObject datatype_names = get_cyblack_defapp_monitor_expression_datatype_names(self);
            try {
                try {
                    cyblack_defapp_expression_initialize_method(self);
                    datatype_names = NIL;
                    sublisp_throw($sym994$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_monitor_expression_datatype_names(self, datatype_names);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_monitor_expression_method = Errors.handleThrowable(ccatch_env_var, $sym994$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_monitor_expression_method;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject datatype_names = get_cyblack_defapp_monitor_expression_datatype_names(self);
            format(stream, $str_alt997$__MONITOR__S_, datatype_names);
            return self;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_expression_get_datatype_names_method(SubLObject self) {
        {
            SubLObject datatype_names = get_cyblack_defapp_monitor_expression_datatype_names(self);
            return datatype_names;
        }
    }

    public static final SubLObject cyblack_defapp_monitor_expression_set_datatype_names_method(SubLObject self, SubLObject new_datatype_names) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_monitor_expression_method = NIL;
                SubLObject datatype_names = get_cyblack_defapp_monitor_expression_datatype_names(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_datatype_names.isList()) {
                                Errors.error($str_alt1006$_SET_DATATYPE_NAMES__S____S_is_no, self, new_datatype_names);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = new_datatype_names;
                            SubLObject datatype_name = NIL;
                            for (datatype_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , datatype_name = cdolist_list_var.first()) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == cyblack_defks.cyblack_datatype_string_p(datatype_name)) {
                                        Errors.error($str_alt1007$_SET_DATATYPE_NAMES__S____S_is_no, datatype_name);
                                    }
                                }
                            }
                        }
                        datatype_names = copy_list(new_datatype_names);
                        sublisp_throw($sym1005$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXPRESSION_METHOD, new_datatype_names);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_monitor_expression_datatype_names(self, datatype_names);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_monitor_expression_method = Errors.handleThrowable(ccatch_env_var, $sym1005$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXPRESSION_METHOD);
                }
                return catch_var_for_cyblack_defapp_monitor_expression_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_monitor_expression_add_datatype_name_method(SubLObject self, SubLObject new_datatype_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_monitor_expression_method = NIL;
                SubLObject datatype_names = get_cyblack_defapp_monitor_expression_datatype_names(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cyblack_defks.cyblack_datatype_string_p(new_datatype_name)) {
                                Errors.error($str_alt1013$_ADD_DATATYPE_NAME__S____S_is_not, self, new_datatype_name);
                            }
                        }
                        datatype_names = nconc(datatype_names, list(new_datatype_name));
                        sublisp_throw($sym1012$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXPRESSION_METHOD, new_datatype_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_monitor_expression_datatype_names(self, datatype_names);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_monitor_expression_method = Errors.handleThrowable(ccatch_env_var, $sym1012$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXPRESSION_METHOD);
                }
                return catch_var_for_cyblack_defapp_monitor_expression_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_monitor_expression_is_monitored_p_method(SubLObject self, SubLObject datatype_name) {
        {
            SubLObject datatype_names = get_cyblack_defapp_monitor_expression_datatype_names(self);
            SubLObject cdolist_list_var = datatype_names;
            SubLObject current_datatype_name = NIL;
            for (current_datatype_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , current_datatype_name = cdolist_list_var.first()) {
                if (datatype_name.equal(current_datatype_name)) {
                    return T;
                }
            }
            return NIL;
        }
    }

    public static final SubLObject get_cyblack_defapp_code_expression_body(SubLObject cyblack_defapp_code_expression) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_defapp_code_expression, THREE_INTEGER, BODY);
    }

    public static final SubLObject set_cyblack_defapp_code_expression_body(SubLObject cyblack_defapp_code_expression, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_defapp_code_expression, value, THREE_INTEGER, BODY);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_code_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_code_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_CODE_EXPRESSION, BODY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_code_expression_p(SubLObject cyblack_defapp_code_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_code_expression, CYBLACK_DEFAPP_CODE_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_code_expression_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_code_expression_method = NIL;
            SubLObject body = get_cyblack_defapp_code_expression_body(self);
            try {
                try {
                    cyblack_defapp_expression_initialize_method(self);
                    body = NIL;
                    sublisp_throw($sym1025$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CODE_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_code_expression_body(self, body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_code_expression_method = Errors.handleThrowable(ccatch_env_var, $sym1025$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CODE_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_code_expression_method;
        }
    }

    public static final SubLObject cyblack_defapp_code_expression_get_body_method(SubLObject self) {
        {
            SubLObject body = get_cyblack_defapp_code_expression_body(self);
            return body;
        }
    }

    public static final SubLObject cyblack_defapp_code_expression_set_body_method(SubLObject self, SubLObject new_body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_defapp_code_expression_method = NIL;
                SubLObject body = get_cyblack_defapp_code_expression_body(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_body.isList()) {
                                Errors.error($str_alt1034$_SET_BODY__S____S_is_not_a_valid_, self, new_body);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = new_body;
                            SubLObject expression = NIL;
                            for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (!(((expression.isSymbol() || expression.isNumber()) || expression.isString()) || (expression.isCons() && expression.first().isSymbol()))) {
                                        Errors.error($str_alt1035$_SET_BODY__S____S_is_not_a_valid_, self, expression);
                                    }
                                }
                            }
                        }
                        body = copy_tree(new_body);
                        sublisp_throw($sym1033$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CODE_EXPRESSION_METHOD, new_body);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_defapp_code_expression_body(self, body);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_defapp_code_expression_method = Errors.handleThrowable(ccatch_env_var, $sym1033$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CODE_EXPRESSION_METHOD);
                }
                return catch_var_for_cyblack_defapp_code_expression_method;
            }
        }
    }

    public static final SubLObject cyblack_defapp_code_expression_compile_to_body_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_defapp_code_expression_method = NIL;
            SubLObject body = get_cyblack_defapp_code_expression_body(self);
            try {
                try {
                    sublisp_throw($sym1038$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CODE_EXPRESSION_METHOD, copy_tree(body));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_code_expression_body(self, body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_code_expression_method = Errors.handleThrowable(ccatch_env_var, $sym1038$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CODE_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_code_expression_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_before_agenda_execute_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_before_agenda_execute_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_CODE_EXPRESSION, BODY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_before_agenda_execute_expression_p(SubLObject cyblack_defapp_before_agenda_execute_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_before_agenda_execute_expression, CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_before_agenda_execute_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defapp_before_agenda_execute_expression_method = NIL;
            SubLObject body = get_cyblack_defapp_code_expression_body(self);
            try {
                try {
                    format(stream, $str_alt1046$__BEFORE_AGENDA_EXECUTE);
                    {
                        SubLObject cdolist_list_var = body;
                        SubLObject expression = NIL;
                        for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                            format(stream, $str_alt1047$__S, expression);
                        }
                    }
                    format(stream, $str_alt1048$_);
                    sublisp_throw($sym1045$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION_M, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_code_expression_body(self, body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_before_agenda_execute_expression_method = Errors.handleThrowable(ccatch_env_var, $sym1045$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION_M);
            }
            return catch_var_for_cyblack_defapp_before_agenda_execute_expression_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_after_agenda_execute_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_after_agenda_execute_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_CODE_EXPRESSION, BODY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_after_agenda_execute_expression_p(SubLObject cyblack_defapp_after_agenda_execute_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_after_agenda_execute_expression, CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_after_agenda_execute_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defapp_after_agenda_execute_expression_method = NIL;
            SubLObject body = get_cyblack_defapp_code_expression_body(self);
            try {
                try {
                    format(stream, $str_alt1055$__AFTER_AGENDA_EXECUTE);
                    {
                        SubLObject cdolist_list_var = body;
                        SubLObject expression = NIL;
                        for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                            format(stream, $str_alt1047$__S, expression);
                        }
                    }
                    format(stream, $str_alt1048$_);
                    sublisp_throw($sym1054$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION_ME, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_code_expression_body(self, body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_after_agenda_execute_expression_method = Errors.handleThrowable(ccatch_env_var, $sym1054$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION_ME);
            }
            return catch_var_for_cyblack_defapp_after_agenda_execute_expression_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_on_empty_agenda_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_on_empty_agenda_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_CODE_EXPRESSION, BODY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_on_empty_agenda_expression_p(SubLObject cyblack_defapp_on_empty_agenda_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_on_empty_agenda_expression, CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_on_empty_agenda_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defapp_on_empty_agenda_expression_method = NIL;
            SubLObject body = get_cyblack_defapp_code_expression_body(self);
            try {
                try {
                    format(stream, $str_alt1062$__ON_EMPTY_AGENDA);
                    {
                        SubLObject cdolist_list_var = body;
                        SubLObject expression = NIL;
                        for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                            format(stream, $str_alt1047$__S, expression);
                        }
                    }
                    format(stream, $str_alt1048$_);
                    sublisp_throw($sym1061$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_code_expression_body(self, body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_on_empty_agenda_expression_method = Errors.handleThrowable(ccatch_env_var, $sym1061$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_on_empty_agenda_expression_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_on_startup_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_on_startup_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_CODE_EXPRESSION, BODY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_on_startup_expression_p(SubLObject cyblack_defapp_on_startup_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_on_startup_expression, CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_on_startup_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defapp_on_startup_expression_method = NIL;
            SubLObject body = get_cyblack_defapp_code_expression_body(self);
            try {
                try {
                    format(stream, $str_alt1069$__ON_STARTUP);
                    {
                        SubLObject cdolist_list_var = body;
                        SubLObject expression = NIL;
                        for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                            format(stream, $str_alt1047$__S, expression);
                        }
                    }
                    format(stream, $str_alt1048$_);
                    sublisp_throw($sym1068$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_code_expression_body(self, body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_on_startup_expression_method = Errors.handleThrowable(ccatch_env_var, $sym1068$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_on_startup_expression_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_on_shutdown_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_on_shutdown_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_CODE_EXPRESSION, BODY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_on_shutdown_expression_p(SubLObject cyblack_defapp_on_shutdown_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_on_shutdown_expression, CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_on_shutdown_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defapp_on_shutdown_expression_method = NIL;
            SubLObject body = get_cyblack_defapp_code_expression_body(self);
            try {
                try {
                    format(stream, $str_alt1076$__ON_SHUTDOWN);
                    {
                        SubLObject cdolist_list_var = body;
                        SubLObject expression = NIL;
                        for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                            format(stream, $str_alt1047$__S, expression);
                        }
                    }
                    format(stream, $str_alt1048$_);
                    sublisp_throw($sym1075$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_code_expression_body(self, body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_on_shutdown_expression_method = Errors.handleThrowable(ccatch_env_var, $sym1075$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_on_shutdown_expression_method;
        }
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_on_quiescence_expression_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_defapp_on_quiescence_expression_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, PARENT, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_EXPRESSION, CHILDREN, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_DEFAPP_CODE_EXPRESSION, BODY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_defapp_on_quiescence_expression_p(SubLObject cyblack_defapp_on_quiescence_expression) {
        return classes.subloop_instanceof_class(cyblack_defapp_on_quiescence_expression, CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION);
    }

    public static final SubLObject cyblack_defapp_on_quiescence_expression_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_cyblack_defapp_on_quiescence_expression_method = NIL;
            SubLObject body = get_cyblack_defapp_code_expression_body(self);
            try {
                try {
                    format(stream, $str_alt1083$__ON_QUIESCENCE);
                    {
                        SubLObject cdolist_list_var = body;
                        SubLObject expression = NIL;
                        for (expression = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , expression = cdolist_list_var.first()) {
                            format(stream, $str_alt1047$__S, expression);
                        }
                    }
                    format(stream, $str_alt1048$_);
                    sublisp_throw($sym1082$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_defapp_code_expression_body(self, body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_defapp_on_quiescence_expression_method = Errors.handleThrowable(ccatch_env_var, $sym1082$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION_METHOD);
            }
            return catch_var_for_cyblack_defapp_on_quiescence_expression_method;
        }
    }

    /**
     * Enumerated values of type CYBLACK-DEFAPP-BODY-KEY.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_defapp_body_keys$ = makeSymbol("*VALID-CYBLACK-DEFAPP-BODY-KEYS*");

    /**
     * Returns a list of all valid members of the CYBLACK-DEFAPP-BODY-KEY enumeration.
     */
    public static final SubLObject valid_cyblack_defapp_body_keys() {
        return $valid_cyblack_defapp_body_keys$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-DEFAPP-BODY-KEY enumeration.
     */
    public static final SubLObject cyblack_defapp_body_key_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_defapp_body_keys$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-DEFAPP-BODY-KEY enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_defapp_body_key(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_defapp_body_keys$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt294$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_DEFAPP_BODY_KEY, value, CYBLACK_DEFAPP_BODY_KEY);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-DEFAPP-BODY-KEY enumeration.
     */
    public static final SubLObject decode_cyblack_defapp_body_key(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_defapp_body_keys$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt296$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_DEFAPP_BODY_KEY, value, CYBLACK_DEFAPP_BODY_KEY);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-DEFAPP-BODY-KEY enumeration.
     */
    public static final SubLObject cyblack_defapp_body_key_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_body_key_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_BODY_KEY_P, value1, CYBLACK_DEFAPP_BODY_KEY);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_body_key_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_BODY_KEY_P, value2, CYBLACK_DEFAPP_BODY_KEY);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defapp_body_keys$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-DEFAPP-BODY-KEY enumeration.
     */
    public static final SubLObject cyblack_defapp_body_key_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_body_key_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_BODY_KEY_P, value1, CYBLACK_DEFAPP_BODY_KEY);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_body_key_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_BODY_KEY_P, value2, CYBLACK_DEFAPP_BODY_KEY);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defapp_body_keys$.getGlobalValue();
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

    public static final SubLObject cyblack_defapp_body_alist_p(SubLObject list) {
        if (!list.isList()) {
            return NIL;
        }
        {
            SubLObject cdolist_list_var = list;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                if (!(element.isCons() && (NIL != cyblack_defapp_body_key_p(element.first())))) {
                    return NIL;
                }
            }
        }
        return T;
    }

    // defconstant
    private static final SubLSymbol $parse_cyblack_defapp_body_message$ = makeSymbol("*PARSE-CYBLACK-DEFAPP-BODY-MESSAGE*");

    public static final SubLObject parse_cyblack_defapp_body(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_body_alist_p(v_object)) {
                    Errors.error($parse_cyblack_defapp_body_message$.getGlobalValue(), v_object);
                }
            }
            if (NIL == v_object) {
                return object.new_class_instance(CYBLACK_DEFAPP_BODY);
            }
            {
                SubLObject blackboard_association = assoc($BLACKBOARD, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject ksb_association = assoc($KNOWLEDGE_SOURCE_BATTERY, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject agenda_association = assoc($AGENDA, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject monitor_association = assoc($MONITOR, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject before_agenda_execute_association = assoc($BEFORE_AGENDA_EXECUTE, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject after_agenda_execute_association = assoc($AFTER_AGENDA_EXECUTE, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject on_empty_agenda_association = assoc($ON_EMPTY_AGENDA, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject on_startup_association = assoc($ON_STARTUP, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject on_shutdown_association = assoc($ON_SHUTDOWN, v_object, UNPROVIDED, UNPROVIDED);
                SubLObject on_quiescence_association = assoc($ON_QUIESCENCE, v_object, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!(((NIL != blackboard_association) && (NIL != ksb_association)) && (NIL != agenda_association))) {
                        Errors.error($parse_cyblack_defapp_body_message$.getGlobalValue(), v_object);
                    }
                }
                {
                    SubLObject parsed_blackboard_expression = parse_cyblack_defapp_blackboard_expression(blackboard_association);
                    SubLObject parsed_ksb_expression = parse_cyblack_defapp_ksb_expression(ksb_association);
                    SubLObject parsed_agenda_expression = parse_cyblack_defapp_agenda_expression(agenda_association);
                    SubLObject parsed_monitor_expression = parse_cyblack_defapp_monitor_expression(monitor_association);
                    SubLObject parsed_before_agenda_execute_expression = parse_cyblack_defapp_before_agenda_execute_expression(before_agenda_execute_association);
                    SubLObject parsed_after_agenda_execute_expression = parse_cyblack_defapp_after_agenda_execute_expression(after_agenda_execute_association);
                    SubLObject parsed_on_empty_agenda_expression = parse_cyblack_defapp_on_empty_agenda_expression(on_empty_agenda_association);
                    SubLObject parsed_on_startup_expression = parse_cyblack_defapp_on_startup_expression(on_startup_association);
                    SubLObject parsed_on_shutdown_expression = parse_cyblack_defapp_on_shutdown_expression(on_shutdown_association);
                    SubLObject parsed_on_quiescence_expression = parse_cyblack_defapp_on_quiescence_expression(on_quiescence_association);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!(((NIL != parsed_blackboard_expression) && (NIL != parsed_ksb_expression)) && (NIL != parsed_agenda_expression))) {
                            Errors.error($parse_cyblack_defapp_body_message$.getGlobalValue(), v_object);
                        }
                    }
                    {
                        SubLObject body = object.new_class_instance(CYBLACK_DEFAPP_BODY);
                        cyblack_defapp_body_set_blackboard_expression_method(body, parsed_blackboard_expression);
                        cyblack_defapp_body_set_ksb_expression_method(body, parsed_ksb_expression);
                        cyblack_defapp_body_set_agenda_expression_method(body, parsed_agenda_expression);
                        cyblack_defapp_body_set_monitor_expression_method(body, parsed_monitor_expression);
                        cyblack_defapp_body_set_before_agenda_execute_expression_method(body, parsed_before_agenda_execute_expression);
                        cyblack_defapp_body_set_after_agenda_execute_expression_method(body, parsed_after_agenda_execute_expression);
                        cyblack_defapp_body_set_on_empty_agenda_expression_method(body, parsed_on_empty_agenda_expression);
                        cyblack_defapp_body_set_on_startup_expression_method(body, parsed_on_startup_expression);
                        cyblack_defapp_body_set_on_shutdown_expression_method(body, parsed_on_shutdown_expression);
                        cyblack_defapp_body_set_on_quiescence_expression_method(body, parsed_on_quiescence_expression);
                        return body;
                    }
                }
            }
        }
    }

    public static final SubLObject cyblack_check_defapp_expression_arg(SubLObject key, SubLObject arg) {
        return makeBoolean(((((arg.isCons() && (arg.first() == key)) && arg.rest().isCons()) && (NIL != cadr(arg))) && cadr(arg).isSymbol()) && (NIL == cddr(arg)));
    }

    public static final SubLObject parse_cyblack_defapp_blackboard_expression(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_check_defapp_expression_arg($BLACKBOARD, v_object)) {
                    Errors.error($str_alt1101$PARSE_CYBLACK_DEFAPP_BLACKBOARD_E, v_object);
                }
            }
            {
                SubLObject blackboard_identifier = cadr(v_object);
                SubLObject expression = object.new_class_instance(CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION);
                cyblack_defapp_blackboard_expression_set_blackboard_identifier_method(expression, blackboard_identifier);
                return expression;
            }
        }
    }

    public static final SubLObject parse_cyblack_defapp_ksb_expression(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_check_defapp_expression_arg($KNOWLEDGE_SOURCE_BATTERY, v_object)) {
                    Errors.error($str_alt1102$PARSE_CYBLACK_DEFAPP_KSB_EXPRESSI, v_object);
                }
            }
            {
                SubLObject ksb_identifier = cadr(v_object);
                SubLObject expression = object.new_class_instance(CYBLACK_DEFAPP_KSB_EXPRESSION);
                cyblack_defapp_ksb_expression_set_ksb_identifier_method(expression, ksb_identifier);
                return expression;
            }
        }
    }

    public static final SubLObject parse_cyblack_defapp_agenda_expression(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_check_defapp_expression_arg($AGENDA, v_object)) {
                    Errors.error($str_alt1103$PARSE_CYBLACK_DEFAPP_AGENDA_EXPRE, v_object);
                }
            }
            {
                SubLObject agenda_arg = cadr(v_object);
                if (agenda_arg.isKeyword()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == cyblack_defapp_agenda_type_p(agenda_arg)) {
                            Errors.error($str_alt1104$PARSE_CYBLACK_DEFAPP_AGENDA_EXPRE, agenda_arg);
                        }
                    }
                    {
                        SubLObject agenda_type_expression = object.new_class_instance(CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION);
                        cyblack_defapp_predefined_agenda_expression_set_agenda_type_method(agenda_type_expression, agenda_arg);
                        return agenda_type_expression;
                    }
                } else {
                    {
                        SubLObject agenda_class_expression = object.new_class_instance(CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION);
                        if (NIL == classes.classes_implements_p(agenda_arg, CYBLACK_AGENDA)) {
                            Errors.warn($str_alt1105$PARSE_CYBLACK_DEFAPP_AGENDA_EXPRE, agenda_arg);
                        }
                        cyblack_defapp_custom_agenda_expression_set_agenda_class_method(agenda_class_expression, agenda_arg);
                        return agenda_class_expression;
                    }
                }
            }
        }
    }

    public static final SubLObject parse_cyblack_defapp_monitor_expression(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == v_object) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((((v_object.isCons() && (v_object.first() == $MONITOR)) && v_object.rest().isCons()) && cadr(v_object).isList()) && (NIL == cddr(v_object)))) {
                    Errors.error($str_alt1106$PARSE_CYBLACK_DEFAPP_MONITOR_EXPR, v_object);
                }
            }
            {
                SubLObject expression = object.new_class_instance(CYBLACK_DEFAPP_MONITOR_EXPRESSION);
                cyblack_defapp_monitor_expression_set_datatype_names_method(expression, cadr(v_object));
                return expression;
            }
        }
    }

    public static final SubLObject cyblack_check_defapp_code_expression_arg(SubLObject key, SubLObject arg) {
        return makeBoolean((arg.isCons() && (arg.first() == key)) && arg.rest().isList());
    }

    public static final SubLObject parse_cyblack_defapp_before_agenda_execute_expression(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == v_object) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_check_defapp_code_expression_arg($BEFORE_AGENDA_EXECUTE, v_object)) {
                    Errors.error($str_alt1107$PARSE_CYBLACK_DEFAPP_BEFORE_AGEND, v_object);
                }
            }
            {
                SubLObject expression = object.new_class_instance(CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION);
                cyblack_defapp_code_expression_set_body_method(expression, v_object.rest());
                return expression;
            }
        }
    }

    public static final SubLObject parse_cyblack_defapp_after_agenda_execute_expression(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == v_object) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_check_defapp_code_expression_arg($AFTER_AGENDA_EXECUTE, v_object)) {
                    Errors.error($str_alt1108$_PARSE_CYBLACK_DEFAPP_AFTER_AGEND, v_object);
                }
            }
            {
                SubLObject expression = object.new_class_instance(CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION);
                cyblack_defapp_code_expression_set_body_method(expression, v_object.rest());
                return expression;
            }
        }
    }

    public static final SubLObject parse_cyblack_defapp_on_empty_agenda_expression(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == v_object) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_check_defapp_code_expression_arg($ON_EMPTY_AGENDA, v_object)) {
                    Errors.error($str_alt1109$_PARSE_CYBLACK_DEFAPP_ON_EMPTY_AG, v_object);
                }
            }
            {
                SubLObject expression = object.new_class_instance(CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION);
                cyblack_defapp_code_expression_set_body_method(expression, v_object.rest());
                return expression;
            }
        }
    }

    public static final SubLObject parse_cyblack_defapp_on_startup_expression(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == v_object) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_check_defapp_code_expression_arg($ON_STARTUP, v_object)) {
                    Errors.error($str_alt1110$_PARSE_CYBLACK_DEFAPP_ON_STARTUP_, v_object);
                }
            }
            {
                SubLObject expression = object.new_class_instance(CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION);
                cyblack_defapp_code_expression_set_body_method(expression, v_object.rest());
                return expression;
            }
        }
    }

    public static final SubLObject parse_cyblack_defapp_on_shutdown_expression(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == v_object) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_check_defapp_code_expression_arg($ON_SHUTDOWN, v_object)) {
                    Errors.error($str_alt1111$_PARSE_CYBLACK_DEFAPP_ON_SHUTDOWN, v_object);
                }
            }
            {
                SubLObject expression = object.new_class_instance(CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION);
                cyblack_defapp_code_expression_set_body_method(expression, v_object.rest());
                return expression;
            }
        }
    }

    public static final SubLObject parse_cyblack_defapp_on_quiescence_expression(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == v_object) {
                return NIL;
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_check_defapp_code_expression_arg($ON_QUIESCENCE, v_object)) {
                    Errors.error($str_alt1112$_PARSE_CYBLACK_DEFAPP_ON_QUIESCEN, v_object);
                }
            }
            {
                SubLObject expression = object.new_class_instance(CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION);
                cyblack_defapp_code_expression_set_body_method(expression, v_object.rest());
                return expression;
            }
        }
    }

    public static final SubLObject get_cyblack_app_info_app_executable_function_name(SubLObject cyblack_app_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_app_info, FIVE_INTEGER, APP_EXECUTABLE_FUNCTION_NAME);
    }

    public static final SubLObject set_cyblack_app_info_app_executable_function_name(SubLObject cyblack_app_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_app_info, value, FIVE_INTEGER, APP_EXECUTABLE_FUNCTION_NAME);
    }

    public static final SubLObject get_cyblack_app_info_app_body(SubLObject cyblack_app_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_app_info, FOUR_INTEGER, APP_BODY);
    }

    public static final SubLObject set_cyblack_app_info_app_body(SubLObject cyblack_app_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_app_info, value, FOUR_INTEGER, APP_BODY);
    }

    public static final SubLObject get_cyblack_app_info_app_class(SubLObject cyblack_app_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_app_info, THREE_INTEGER, APP_CLASS);
    }

    public static final SubLObject set_cyblack_app_info_app_class(SubLObject cyblack_app_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_app_info, value, THREE_INTEGER, APP_CLASS);
    }

    public static final SubLObject get_cyblack_app_info_app_name(SubLObject cyblack_app_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_app_info, TWO_INTEGER, APP_NAME);
    }

    public static final SubLObject set_cyblack_app_info_app_name(SubLObject cyblack_app_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_app_info, value, TWO_INTEGER, APP_NAME);
    }

    public static final SubLObject get_cyblack_app_info_app_identifier(SubLObject cyblack_app_info) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_app_info, ONE_INTEGER, APP_IDENTIFIER);
    }

    public static final SubLObject set_cyblack_app_info_app_identifier(SubLObject cyblack_app_info, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_app_info, value, ONE_INTEGER, APP_IDENTIFIER);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_app_info_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_app_info_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APP_INFO, APP_IDENTIFIER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APP_INFO, APP_NAME, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APP_INFO, APP_CLASS, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APP_INFO, APP_BODY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_APP_INFO, APP_EXECUTABLE_FUNCTION_NAME, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_app_info_p(SubLObject cyblack_app_info) {
        return classes.subloop_instanceof_class(cyblack_app_info, CYBLACK_APP_INFO);
    }

    public static final SubLObject cyblack_app_info_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_app_info_method = NIL;
            SubLObject app_executable_function_name = get_cyblack_app_info_app_executable_function_name(self);
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            SubLObject app_class = get_cyblack_app_info_app_class(self);
            SubLObject app_name = get_cyblack_app_info_app_name(self);
            SubLObject app_identifier = get_cyblack_app_info_app_identifier(self);
            try {
                try {
                    object.object_initialize_method(self);
                    app_identifier = NIL;
                    app_name = NIL;
                    app_class = NIL;
                    app_body = NIL;
                    app_executable_function_name = NIL;
                    sublisp_throw($sym1123$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_app_info_app_executable_function_name(self, app_executable_function_name);
                            set_cyblack_app_info_app_body(self, app_body);
                            set_cyblack_app_info_app_class(self, app_class);
                            set_cyblack_app_info_app_name(self, app_name);
                            set_cyblack_app_info_app_identifier(self, app_identifier);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1123$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
            }
            return catch_var_for_cyblack_app_info_method;
        }
    }

    public static final SubLObject cyblack_app_info_print_method(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            SubLObject app_identifier = get_cyblack_app_info_app_identifier(self);
            format(stream, $str_alt1126$__CYBLACK_APP_INFO__S___S_, app_identifier, app_body);
            return self;
        }
    }

    public static final SubLObject cyblack_app_info_get_app_identifier_method(SubLObject self) {
        {
            SubLObject app_identifier = get_cyblack_app_info_app_identifier(self);
            return app_identifier;
        }
    }

    public static final SubLObject cyblack_app_info_set_app_identifier_method(SubLObject self, SubLObject new_app_identifier) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_app_info_method = NIL;
                SubLObject app_identifier = get_cyblack_app_info_app_identifier(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_app_identifier.isSymbol()) {
                                Errors.error($str_alt1135$_SET_APP_IDENTIFIER__S____S_is_no, self, new_app_identifier);
                            }
                        }
                        app_identifier = new_app_identifier;
                        sublisp_throw($sym1134$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, new_app_identifier);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_app_info_app_identifier(self, app_identifier);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1134$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
                }
                return catch_var_for_cyblack_app_info_method;
            }
        }
    }

    public static final SubLObject cyblack_app_info_get_app_name_method(SubLObject self) {
        {
            SubLObject app_name = get_cyblack_app_info_app_name(self);
            return app_name;
        }
    }

    public static final SubLObject cyblack_app_info_set_app_name_method(SubLObject self, SubLObject new_app_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_app_info_method = NIL;
                SubLObject app_name = get_cyblack_app_info_app_name(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_app_name) || new_app_name.isString())) {
                                Errors.error($str_alt1144$_SET_APP_NAME__S____S_is_not_a_va, self, new_app_name);
                            }
                        }
                        app_name = new_app_name;
                        sublisp_throw($sym1143$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, new_app_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_app_info_app_name(self, app_name);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1143$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
                }
                return catch_var_for_cyblack_app_info_method;
            }
        }
    }

    public static final SubLObject cyblack_app_info_get_app_class_method(SubLObject self) {
        {
            SubLObject app_class = get_cyblack_app_info_app_class(self);
            return app_class;
        }
    }

    public static final SubLObject cyblack_app_info_set_app_class_method(SubLObject self, SubLObject new_app_class) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_app_info_method = NIL;
                SubLObject app_class = get_cyblack_app_info_app_class(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_app_class) || new_app_class.isSymbol())) {
                                Errors.error($str_alt1153$_SET_APP_CLASS__S____S_is_not_a_v, self, new_app_class);
                            }
                        }
                        app_class = new_app_class;
                        sublisp_throw($sym1152$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, new_app_class);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_app_info_app_class(self, app_class);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1152$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
                }
                return catch_var_for_cyblack_app_info_method;
            }
        }
    }

    public static final SubLObject cyblack_app_info_get_app_body_method(SubLObject self) {
        {
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            return app_body;
        }
    }

    public static final SubLObject cyblack_app_info_set_app_body_method(SubLObject self, SubLObject new_app_body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_app_info_method = NIL;
                SubLObject app_body = get_cyblack_app_info_app_body(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!((NIL == new_app_body) || (NIL != cyblack_defapp_body_p(new_app_body)))) {
                                Errors.error($str_alt1162$_SET_APP_BODY__S____S_is_not_an_i, self, new_app_body);
                            }
                        }
                        app_body = new_app_body;
                        sublisp_throw($sym1161$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, new_app_body);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_app_info_app_body(self, app_body);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1161$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
                }
                return catch_var_for_cyblack_app_info_method;
            }
        }
    }

    public static final SubLObject cyblack_app_info_get_app_executable_function_name_method(SubLObject self) {
        {
            SubLObject app_executable_function_name = get_cyblack_app_info_app_executable_function_name(self);
            return app_executable_function_name;
        }
    }

    public static final SubLObject cyblack_app_info_set_app_executable_function_name_method(SubLObject self, SubLObject new_executable_function_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_app_info_method = NIL;
                SubLObject app_executable_function_name = get_cyblack_app_info_app_executable_function_name(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!new_executable_function_name.isSymbol()) {
                                Errors.error($str_alt1171$_SET_APP_EXECUTABLE_FUNCTION_NAME, self, new_executable_function_name);
                            }
                        }
                        app_executable_function_name = new_executable_function_name;
                        sublisp_throw($sym1170$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, new_executable_function_name);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_app_info_app_executable_function_name(self, app_executable_function_name);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1170$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
                }
                return catch_var_for_cyblack_app_info_method;
            }
        }
    }

    public static final SubLObject cyblack_app_info_get_monitored_datatypes_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_app_info_method = NIL;
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            try {
                try {
                    if (NIL != app_body) {
                        sublisp_throw($sym1174$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, cyblack_defapp_body_get_monitored_datatypes_method(app_body));
                    }
                    sublisp_throw($sym1174$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_app_info_app_body(self, app_body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1174$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
            }
            return catch_var_for_cyblack_app_info_method;
        }
    }

    public static final SubLObject cyblack_app_info_get_default_base_class_method(SubLObject self) {
        {
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            if (NIL != app_body) {
                return cyblack_defapp_body_get_default_base_class_method(app_body);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_app_info_get_ksb_info_method(SubLObject self) {
        {
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            if (NIL != app_body) {
                return cyblack_defapp_body_get_ksb_info_method(app_body);
            }
            return NIL;
        }
    }

    public static final SubLObject cyblack_app_info_get_blackboard_info_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_app_info_method = NIL;
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            try {
                try {
                    if (NIL != app_body) {
                        sublisp_throw($sym1181$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, cyblack_defapp_body_get_blackboard_info_method(app_body));
                    }
                    sublisp_throw($sym1181$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_app_info_app_body(self, app_body);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1181$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
            }
            return catch_var_for_cyblack_app_info_method;
        }
    }

    public static final SubLObject cyblack_app_info_has_external_modules_p_method(SubLObject self) {
        {
            SubLObject ksb_info = cyblack_app_info_get_ksb_info_method(self);
            return makeBoolean((NIL != ksb_info) && (NIL != cyblack_defksb.cyblack_ksb_info_get_external_module_info_list_method(ksb_info)));
        }
    }

    // defparameter
    public static final SubLSymbol $cyblack_default_connection_class$ = makeSymbol("*CYBLACK-DEFAULT-CONNECTION-CLASS*");

    public static final SubLObject cyblack_app_info_compile_to_initialize_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_app_info_method = NIL;
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            SubLObject app_class = get_cyblack_app_info_app_class(self);
            SubLObject app_name = get_cyblack_app_info_app_name(self);
            try {
                try {
                    {
                        SubLObject monitored_datatypes = cyblack_app_info_get_monitored_datatypes_method(self);
                        SubLObject blackboard_info = cyblack_app_info_get_blackboard_info_method(self);
                        SubLObject blackboard_class_name = (NIL != blackboard_info) ? ((SubLObject) (cyblack_defbb.cyblack_blackboard_info_get_blackboard_class_name_method(blackboard_info))) : NIL;
                        SubLObject agenda_expression = (NIL != app_body) ? ((SubLObject) (cyblack_defapp_body_get_agenda_expression_method(app_body))) : NIL;
                        SubLObject agenda_class = (NIL != agenda_expression) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(agenda_expression, GET_AGENDA_CLASS))) : CYBLACK_DEFAPP_AGENDA_BASE;
                        sublisp_throw($sym1188$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, listS(DEF_INSTANCE_METHOD, listS(INITIALIZE, app_class, $list_alt3), NIL, $list_alt1190, $list_alt1191, append(NIL != app_name ? ((SubLObject) (list(list(SET_APPLICATION_NAME, SELF, app_name)))) : NIL, listS(list(SET_AGENDA_CLASS, SELF, list(QUOTE, agenda_class)), list(CYBLACK_APP_INSTALL_AGENDA, SELF, list(NEW_CLASS_INSTANCE, list(QUOTE, agenda_class))), append(new SubLObject[]{ NIL != cyblack_app_info_has_external_modules_p_method(self) ? ((SubLObject) ($list_alt1197)) : NIL, NIL != blackboard_class_name ? ((SubLObject) (list(list(SET_BLACKBOARD_CLASS, SELF, list(QUOTE, blackboard_class_name))))) : NIL, NIL != app_body ? ((SubLObject) (cyblack_defapp_body_compile_to_initialize_method_body_method(app_body))) : NIL, NIL != monitored_datatypes ? ((SubLObject) (bq_cons(list(SET_MONITORED_TYPE_TYPE_STRINGS, SELF, list(QUOTE, monitored_datatypes)), $list_alt1199))) : NIL, $list_alt1200 })))));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_app_info_app_body(self, app_body);
                            set_cyblack_app_info_app_class(self, app_class);
                            set_cyblack_app_info_app_name(self, app_name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1188$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
            }
            return catch_var_for_cyblack_app_info_method;
        }
    }

    public static final SubLObject cyblack_app_info_compile_to_generated_on_startup_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_app_info_method = NIL;
            SubLObject app_class = get_cyblack_app_info_app_class(self);
            try {
                try {
                    {
                        SubLObject monitored_datatypes = cyblack_app_info_get_monitored_datatypes_method(self);
                        sublisp_throw($sym1204$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, listS(DEF_INSTANCE_METHOD, listS(GENERATED_ON_STARTUP, app_class, $list_alt6), NIL, $list_alt1205, append(NIL != monitored_datatypes ? ((SubLObject) ($list_alt1206)) : NIL, $list_alt194)));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_app_info_app_class(self, app_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1204$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
            }
            return catch_var_for_cyblack_app_info_method;
        }
    }

    public static final SubLObject cyblack_app_info_compile_to_user_on_startup_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_app_info_method = NIL;
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            SubLObject app_class = get_cyblack_app_info_app_class(self);
            try {
                try {
                    sublisp_throw($sym1210$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, listS(DEF_INSTANCE_METHOD, listS(USER_ON_STARTUP, app_class, $list_alt6), NIL, $list_alt1211, append(NIL != app_body ? ((SubLObject) (cyblack_defapp_body_compile_to_user_on_startup_method_body_method(app_body))) : NIL, $list_alt194)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_app_info_app_body(self, app_body);
                            set_cyblack_app_info_app_class(self, app_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1210$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
            }
            return catch_var_for_cyblack_app_info_method;
        }
    }

    public static final SubLObject cyblack_app_info_compile_to_generated_on_shutdown_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_app_info_method = NIL;
            SubLObject app_class = get_cyblack_app_info_app_class(self);
            try {
                try {
                    sublisp_throw($sym1215$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, listS(DEF_INSTANCE_METHOD, listS(GENERATED_ON_SHUTDOWN, app_class, $list_alt6), $list_alt1216));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_app_info_app_class(self, app_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1215$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
            }
            return catch_var_for_cyblack_app_info_method;
        }
    }

    public static final SubLObject cyblack_app_info_compile_to_user_on_shutdown_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_app_info_method = NIL;
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            SubLObject app_class = get_cyblack_app_info_app_class(self);
            try {
                try {
                    sublisp_throw($sym1219$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, listS(DEF_INSTANCE_METHOD, listS(USER_ON_SHUTDOWN, app_class, $list_alt6), NIL, $list_alt1220, append(NIL != app_body ? ((SubLObject) (cyblack_defapp_body_compile_to_user_on_shutdown_method_method(app_body))) : NIL, $list_alt194)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_app_info_app_body(self, app_body);
                            set_cyblack_app_info_app_class(self, app_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1219$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
            }
            return catch_var_for_cyblack_app_info_method;
        }
    }

    public static final SubLObject cyblack_app_info_compile_to_on_quiescence_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_app_info_method = NIL;
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            SubLObject app_class = get_cyblack_app_info_app_class(self);
            try {
                try {
                    sublisp_throw($sym1223$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, listS(DEF_INSTANCE_METHOD, listS(ON_QUIESCENCE, app_class, $list_alt6), NIL, $list_alt1225, append(NIL != app_body ? ((SubLObject) (cyblack_defapp_body_compile_to_on_quiescence_method_method(app_body))) : NIL, $list_alt194)));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_app_info_app_body(self, app_body);
                            set_cyblack_app_info_app_class(self, app_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1223$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
            }
            return catch_var_for_cyblack_app_info_method;
        }
    }

    public static final SubLObject cyblack_app_info_compile_to_on_empty_agenda_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_app_info_method = NIL;
            SubLObject app_body = get_cyblack_app_info_app_body(self);
            SubLObject app_class = get_cyblack_app_info_app_class(self);
            try {
                try {
                    {
                        SubLObject on_empty_agenda_method_body = cyblack_defapp_body_compile_to_on_empty_agenda_method_method(app_body);
                        if (NIL != on_empty_agenda_method_body) {
                            sublisp_throw($sym1228$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, listS(DEF_INSTANCE_METHOD, listS(ON_EMPTY_AGENDA, app_class, $list_alt6), NIL, append(on_empty_agenda_method_body, NIL)));
                        } else {
                            sublisp_throw($sym1228$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD, NIL);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_app_info_app_body(self, app_body);
                            set_cyblack_app_info_app_class(self, app_class);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_app_info_method = Errors.handleThrowable(ccatch_env_var, $sym1228$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD);
            }
            return catch_var_for_cyblack_app_info_method;
        }
    }

    public static final SubLObject cyblack_set_app_info(SubLObject symbol, SubLObject app_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != symbol) && symbol.isSymbol())) {
                    Errors.error($str_alt1230$CYBLACK_SET_APP_INFO___S_is_not_a, symbol);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL == app_info) || (NIL != cyblack_app_info_p(app_info)))) {
                    Errors.error($str_alt1231$CYBLACK_SET_APP_INFO___S_is_not_a, app_info);
                }
            }
            put(symbol, $CYBLACK_APP_INFO, app_info);
            return app_info;
        }
    }

    public static final SubLObject cyblack_get_app_info(SubLObject symbol) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != symbol) && symbol.isSymbol())) {
                    Errors.error($str_alt1233$CYBLACK_GET_APP_INFO___S_is_not_a, symbol);
                }
            }
            {
                SubLObject potential_app_info = get(symbol, $CYBLACK_APP_INFO, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL == potential_app_info) || (NIL != cyblack_app_info_p(potential_app_info)))) {
                        Errors.error($str_alt1234$CYBLACK_GET_APP_INFO__The_applica, potential_app_info, symbol);
                    }
                }
                return potential_app_info;
            }
        }
    }

    public static final SubLObject cyblack_parse_and_set_app_info(SubLObject app_identifier, SubLObject app_name, SubLObject app_executable_name, SubLObject defapp_body) {
        {
            SubLObject parsed_body = parse_cyblack_defapp_body(defapp_body);
            SubLObject app_info = object.new_class_instance(CYBLACK_APP_INFO);
            cyblack_app_info_set_app_identifier_method(app_info, app_identifier);
            cyblack_app_info_set_app_name_method(app_info, app_name);
            cyblack_app_info_set_app_class_method(app_info, app_identifier);
            cyblack_app_info_set_app_body_method(app_info, parsed_body);
            cyblack_app_info_set_app_executable_function_name_method(app_info, app_executable_name);
            cyblack_set_app_info(app_identifier, app_info);
            return app_info;
        }
    }

    /**
     * Enumerated values of type CYBLACK-DEFAPP-OPTION.
     */
    // defconstant
    private static final SubLSymbol $valid_cyblack_defapp_options$ = makeSymbol("*VALID-CYBLACK-DEFAPP-OPTIONS*");

    /**
     * Returns a list of all valid members of the CYBLACK-DEFAPP-OPTION enumeration.
     */
    public static final SubLObject valid_cyblack_defapp_options() {
        return $valid_cyblack_defapp_options$.getGlobalValue();
    }

    /**
     * Return T iff OBJECT is a member of the CYBLACK-DEFAPP-OPTION enumeration.
     */
    public static final SubLObject cyblack_defapp_option_p(SubLObject v_object) {
        return NIL != member(v_object, $valid_cyblack_defapp_options$.getGlobalValue(), UNPROVIDED, UNPROVIDED) ? ((SubLObject) (T)) : NIL;
    }

    /**
     * Maps a member of the CYBLACK-DEFAPP-OPTION enumeration to an integer encoding.
     */
    public static final SubLObject encode_cyblack_defapp_option(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pos = position(value, $valid_cyblack_defapp_options$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == pos) {
                        Errors.error($str_alt294$_S___S_is_not_a_member_of_the__S_, ENCODE_CYBLACK_DEFAPP_OPTION, value, CYBLACK_DEFAPP_OPTION);
                    }
                }
                return pos;
            }
        }
    }

    /**
     * Maps an encoded value to a member of the CYBLACK-DEFAPP-OPTION enumeration.
     */
    public static final SubLObject decode_cyblack_defapp_option(SubLObject value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject element = nth(value, $valid_cyblack_defapp_options$.getGlobalValue());
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == element) {
                        Errors.error($str_alt296$_S___S_is_not_a_valid_encoding_of, DECODE_CYBLACK_DEFAPP_OPTION, value, CYBLACK_DEFAPP_OPTION);
                    }
                }
                return element;
            }
        }
    }

    /**
     * Provides a LESSP predicate for members of the CYBLACK-DEFAPP-OPTION enumeration.
     */
    public static final SubLObject cyblack_defapp_option_less_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_option_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_OPTION_P, value1, CYBLACK_DEFAPP_OPTION);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_option_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_OPTION_P, value2, CYBLACK_DEFAPP_OPTION);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defapp_options$.getGlobalValue();
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
     * Provides a GREATERP predicate for members of the CYBLACK-DEFAPP-OPTION enumeration.
     */
    public static final SubLObject cyblack_defapp_option_greater_p(SubLObject value1, SubLObject value2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_option_p(value1)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_OPTION_P, value1, CYBLACK_DEFAPP_OPTION);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_option_p(value2)) {
                    Errors.error($str_alt298$_S___S_was_expected_to_be_a_membe, CYBLACK_DEFAPP_OPTION_P, value2, CYBLACK_DEFAPP_OPTION);
                }
            }
            {
                SubLObject cdolist_list_var = $valid_cyblack_defapp_options$.getGlobalValue();
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

    public static final SubLObject cyblack_defapp_option_plist_p(SubLObject v_object) {
        if (v_object.isList()) {
            if (NIL == v_object) {
                return T;
            }
            {
                SubLObject current_cons = v_object;
                SubLObject key = NIL;
                while (NIL != current_cons) {
                    key = current_cons.first();
                    if (NIL == cyblack_defapp_option_p(key)) {
                        return NIL;
                    }
                    if (current_cons.rest().isCons() && cddr(current_cons).isList()) {
                        current_cons = cddr(current_cons);
                    } else {
                        return NIL;
                    }
                } 
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject cyblack_defapp_base_class_is_consistentP(SubLObject base_class, SubLObject app_info) {
        if (NIL != cyblack_app_info_get_monitored_datatypes_method(app_info)) {
            if (NIL == classes.classes_implements_p(base_class, CYBLACK_MONITOR_BASE)) {
                Errors.warn($str_alt1240$DEFINE_BLACKBOARD_APPLICATION__Mo, base_class);
                return NIL;
            }
        }
        {
            SubLObject ksb_info = cyblack_app_info_get_ksb_info_method(app_info);
            if ((NIL != ksb_info) && (NIL != cyblack_defksb.cyblack_ksb_info_get_external_module_info_list_method(ksb_info))) {
                if (NIL == classes.subclassp(base_class, CYBLACK_DEFAPP_EXTERNAL_BASE)) {
                    Errors.warn($str_alt1241$DEFINE_BLACKBOARD_APPLICATION__Th, cyblack_defksb.cyblack_ksb_info_get_ksb_name_method(ksb_info), cyblack_app_info_get_app_identifier_method(app_info));
                    return NIL;
                }
            }
        }
        if (NIL == classes.subclassp(base_class, CYBLACK_DEFAPP_BASE)) {
            Errors.warn($str_alt1242$DEFINE_BLACKBOARD_APPLICATION__Th, base_class, cyblack_app_info_get_app_identifier_method(app_info));
            return NIL;
        }
        return T;
    }

    public static final SubLObject expand_define_blackboard_application(SubLObject app_identifier, SubLObject options, SubLObject body) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!((NIL != app_identifier) && app_identifier.isSymbol())) {
                    Errors.error($str_alt1243$DEFINE_BLACKBOARD_APPLICATION___S, app_identifier);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_defapp_option_plist_p(options)) {
                    Errors.error($str_alt1244$DEFINE_BLACKBOARD_APPLICATION__Op, options);
                }
            }
            {
                SubLObject v_extends = getf(options, $EXTENDS, UNPROVIDED);
                SubLObject v_implements = getf(options, $IMPLEMENTS, UNPROVIDED);
                SubLObject name = getf(options, $NAME, UNPROVIDED);
                SubLObject executable_name = getf(options, $EXECUTABLE_NAME, UNPROVIDED);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!v_extends.isSymbol()) {
                        Errors.error($str_alt1249$DEFINE_BLACKBOARD_APPLICATION___S, v_extends);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!v_implements.isList()) {
                        Errors.error($str_alt1250$DEFINE_BLACKBOARD_APPLICATION___S, v_implements);
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (!((NIL == name) || name.isString())) {
                        Errors.error($str_alt1251$DEFINE_BLACKBOARD_APPLICATION___S, name);
                    }
                }
                {
                    SubLObject app_info = cyblack_parse_and_set_app_info(app_identifier, name, executable_name, body);
                    SubLObject app_class = (NIL != app_info) ? ((SubLObject) (cyblack_app_info_get_app_class_method(app_info))) : NIL;
                    SubLObject parsed_body = (NIL != app_info) ? ((SubLObject) (cyblack_app_info_get_app_body_method(app_info))) : NIL;
                    SubLObject initialize_method = (NIL != app_info) ? ((SubLObject) (cyblack_app_info_compile_to_initialize_method_method(app_info))) : NIL;
                    SubLObject generated_on_startup_method = (NIL != app_info) ? ((SubLObject) (cyblack_app_info_compile_to_generated_on_startup_method_method(app_info))) : NIL;
                    SubLObject user_on_startup_method = (NIL != app_info) ? ((SubLObject) (cyblack_app_info_compile_to_user_on_startup_method_method(app_info))) : NIL;
                    SubLObject generated_on_shutdown_method = (NIL != app_info) ? ((SubLObject) (cyblack_app_info_compile_to_generated_on_shutdown_method_method(app_info))) : NIL;
                    SubLObject user_on_shutdown_method = (NIL != app_info) ? ((SubLObject) (cyblack_app_info_compile_to_user_on_shutdown_method_method(app_info))) : NIL;
                    SubLObject on_quiescence_method = (NIL != app_info) ? ((SubLObject) (cyblack_app_info_compile_to_on_quiescence_method_method(app_info))) : NIL;
                    SubLObject on_empty_agenda_method = (NIL != app_info) ? ((SubLObject) (cyblack_app_info_compile_to_on_empty_agenda_method_method(app_info))) : NIL;
                    SubLObject base_class = (NIL != parsed_body) ? ((SubLObject) (cyblack_app_info_get_default_base_class_method(app_info))) : CYBLACK_DEFAPP_BASE;
                    SubLObject executable_function_definition = NIL;
                    if (NIL != v_extends) {
                        base_class = v_extends;
                    }
                    if (NIL == executable_name) {
                        executable_name = intern(cconcatenate($str_alt1252$RUN_, symbol_name(app_identifier)), UNPROVIDED);
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == cyblack_defapp_base_class_is_consistentP(base_class, app_info)) {
                            Errors.error($str_alt1253$DEFINE_BLACKBOARD_APPLICATION__Th, base_class, cyblack_app_info_get_app_identifier_method(app_info));
                        }
                    }
                    executable_function_definition = list(DEFINE_PUBLIC, executable_name, NIL, listS(CLET, list(list(APP_INSTANCE, list(NEW_OBJECT_INSTANCE, list(QUOTE, app_class)))), listS(CUNWIND_PROTECT, list(PROGN, $list_alt1260, listS(INLINE_METHOD, list(RUN, app_class), $list_alt1262)), $list_alt1263), $list_alt1264));
                    return listS(PROGN, new SubLObject[]{ listS(DEFINE_CLASS, new SubLObject[]{ listS(app_class, $EXTENDS, base_class, append(NIL != v_implements ? ((SubLObject) (list($IMPLEMENTS, copy_list(v_implements)))) : NIL, NIL)), $list_alt1266, $list_alt1267, $list_alt1268, $list_alt1269, $list_alt1270, append(NIL != on_empty_agenda_method ? ((SubLObject) ($list_alt1271)) : NIL, NIL) }), initialize_method, generated_on_startup_method, user_on_startup_method, generated_on_shutdown_method, user_on_shutdown_method, on_quiescence_method, append(NIL != on_empty_agenda_method ? ((SubLObject) (list(on_empty_agenda_method))) : NIL, list(executable_function_definition)) });
                }
            }
        }
    }

    public static final SubLObject define_blackboard_application(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt1272);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject app_identifier = NIL;
                    SubLObject options = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt1272);
                    app_identifier = current.first();
                    current = current.rest();
                    options = current;
                    current = temp;
                    {
                        SubLObject defapp_body = current;
                        return expand_define_blackboard_application(app_identifier, options, defapp_body);
                    }
                }
            }
        }
    }

    public static final SubLObject declare_cyblack_defapp_file() {
        declareFunction("cyblack_defapp_agenda_extension_p", "CYBLACK-DEFAPP-AGENDA-EXTENSION-P", 1, 0, false);
        declareFunction("get_cyblack_defapp_agenda_base_max_futile_cycles", "GET-CYBLACK-DEFAPP-AGENDA-BASE-MAX-FUTILE-CYCLES", 1, 0, false);
        declareFunction("set_cyblack_defapp_agenda_base_max_futile_cycles", "SET-CYBLACK-DEFAPP-AGENDA-BASE-MAX-FUTILE-CYCLES", 2, 0, false);
        declareFunction("get_cyblack_defapp_agenda_base_futile_cycle_count", "GET-CYBLACK-DEFAPP-AGENDA-BASE-FUTILE-CYCLE-COUNT", 1, 0, false);
        declareFunction("set_cyblack_defapp_agenda_base_futile_cycle_count", "SET-CYBLACK-DEFAPP-AGENDA-BASE-FUTILE-CYCLE-COUNT", 2, 0, false);
        declareFunction("get_cyblack_defapp_agenda_base_terminate", "GET-CYBLACK-DEFAPP-AGENDA-BASE-TERMINATE", 1, 0, false);
        declareFunction("set_cyblack_defapp_agenda_base_terminate", "SET-CYBLACK-DEFAPP-AGENDA-BASE-TERMINATE", 2, 0, false);
        declareFunction("get_cyblack_defapp_agenda_base_agenda_trace_on", "GET-CYBLACK-DEFAPP-AGENDA-BASE-AGENDA-TRACE-ON", 1, 0, false);
        declareFunction("set_cyblack_defapp_agenda_base_agenda_trace_on", "SET-CYBLACK-DEFAPP-AGENDA-BASE-AGENDA-TRACE-ON", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_base_execute_method", "CYBLACK-DEFAPP-AGENDA-BASE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_propose_method", "CYBLACK-DEFAPP-AGENDA-BASE-PROPOSE-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_base_set_terminate_method", "CYBLACK-DEFAPP-AGENDA-BASE-SET-TERMINATE-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_base_terminate_p_method", "CYBLACK-DEFAPP-AGENDA-BASE-TERMINATE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_toggle_agenda_trace_on_method", "CYBLACK-DEFAPP-AGENDA-BASE-TOGGLE-AGENDA-TRACE-ON-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_agenda_trace_on_p_method", "CYBLACK-DEFAPP-AGENDA-BASE-AGENDA-TRACE-ON-P-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_count_useful_cycle_method", "CYBLACK-DEFAPP-AGENDA-BASE-COUNT-USEFUL-CYCLE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_count_futile_cycle_method", "CYBLACK-DEFAPP-AGENDA-BASE-COUNT-FUTILE-CYCLE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_set_max_futile_cycles_method", "CYBLACK-DEFAPP-AGENDA-BASE-SET-MAX-FUTILE-CYCLES-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_base_get_max_futile_cycles_method", "CYBLACK-DEFAPP-AGENDA-BASE-GET-MAX-FUTILE-CYCLES-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_initialize_qua_defapp_agenda_extension_method", "CYBLACK-DEFAPP-AGENDA-BASE-INITIALIZE-QUA-DEFAPP-AGENDA-EXTENSION-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_agenda_base_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AGENDA-BASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_agenda_base_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AGENDA-BASE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_p", "CYBLACK-DEFAPP-AGENDA-BASE-P", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_get_futile_cycle_count_internal_method", "CYBLACK-DEFAPP-AGENDA-BASE-GET-FUTILE-CYCLE-COUNT-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_set_futile_cycle_count_internal_method", "CYBLACK-DEFAPP-AGENDA-BASE-SET-FUTILE-CYCLE-COUNT-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_base_get_max_futile_cycles_internal_method", "CYBLACK-DEFAPP-AGENDA-BASE-GET-MAX-FUTILE-CYCLES-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_set_max_futile_cycles_internal_method", "CYBLACK-DEFAPP-AGENDA-BASE-SET-MAX-FUTILE-CYCLES-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_base_get_agenda_trace_on_internal_method", "CYBLACK-DEFAPP-AGENDA-BASE-GET-AGENDA-TRACE-ON-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_set_agenda_trace_on_internal_method", "CYBLACK-DEFAPP-AGENDA-BASE-SET-AGENDA-TRACE-ON-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_base_get_terminate_internal_method", "CYBLACK-DEFAPP-AGENDA-BASE-GET-TERMINATE-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_base_set_terminate_internal_method", "CYBLACK-DEFAPP-AGENDA-BASE-SET-TERMINATE-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_base_initialize_method", "CYBLACK-DEFAPP-AGENDA-BASE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defapp_heuristic_agenda_base_max_futile_cycles", "GET-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-MAX-FUTILE-CYCLES", 1, 0, false);
        declareFunction("set_cyblack_defapp_heuristic_agenda_base_max_futile_cycles", "SET-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-MAX-FUTILE-CYCLES", 2, 0, false);
        declareFunction("get_cyblack_defapp_heuristic_agenda_base_futile_cycle_count", "GET-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-FUTILE-CYCLE-COUNT", 1, 0, false);
        declareFunction("set_cyblack_defapp_heuristic_agenda_base_futile_cycle_count", "SET-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-FUTILE-CYCLE-COUNT", 2, 0, false);
        declareFunction("get_cyblack_defapp_heuristic_agenda_base_terminate", "GET-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-TERMINATE", 1, 0, false);
        declareFunction("set_cyblack_defapp_heuristic_agenda_base_terminate", "SET-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-TERMINATE", 2, 0, false);
        declareFunction("get_cyblack_defapp_heuristic_agenda_base_agenda_trace_on", "GET-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-AGENDA-TRACE-ON", 1, 0, false);
        declareFunction("set_cyblack_defapp_heuristic_agenda_base_agenda_trace_on", "SET-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-AGENDA-TRACE-ON", 2, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_execute_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-EXECUTE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_propose_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-PROPOSE-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_set_terminate_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-TERMINATE-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_terminate_p_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-TERMINATE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_toggle_agenda_trace_on_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-TOGGLE-AGENDA-TRACE-ON-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_agenda_trace_on_p_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-AGENDA-TRACE-ON-P-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_count_useful_cycle_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-COUNT-USEFUL-CYCLE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_count_futile_cycle_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-COUNT-FUTILE-CYCLE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_set_max_futile_cycles_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-MAX-FUTILE-CYCLES-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_get_max_futile_cycles_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-GET-MAX-FUTILE-CYCLES-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_initialize_qua_defapp_agenda_extension_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-INITIALIZE-QUA-DEFAPP-AGENDA-EXTENSION-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_heuristic_agenda_base_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_heuristic_agenda_base_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_p", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-P", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_get_futile_cycle_count_internal_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-GET-FUTILE-CYCLE-COUNT-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_set_futile_cycle_count_internal_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-FUTILE-CYCLE-COUNT-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_get_max_futile_cycles_internal_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-GET-MAX-FUTILE-CYCLES-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_set_max_futile_cycles_internal_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-MAX-FUTILE-CYCLES-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_get_agenda_trace_on_internal_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-GET-AGENDA-TRACE-ON-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_set_agenda_trace_on_internal_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-AGENDA-TRACE-ON-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_get_terminate_internal_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-GET-TERMINATE-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_set_terminate_internal_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-TERMINATE-INTERNAL-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_heuristic_agenda_base_initialize_method", "CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_get_max_futile_cycles", "CYBLACK-DEFAPP-AGENDA-GET-MAX-FUTILE-CYCLES", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_set_max_futile_cycles", "CYBLACK-DEFAPP-AGENDA-SET-MAX-FUTILE-CYCLES", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_count_futile_cycle", "CYBLACK-DEFAPP-AGENDA-COUNT-FUTILE-CYCLE", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_count_useful_cycle", "CYBLACK-DEFAPP-AGENDA-COUNT-USEFUL-CYCLE", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_agenda_trace_on_p", "CYBLACK-DEFAPP-AGENDA-AGENDA-TRACE-ON-P", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_toggle_agenda_trace_on", "CYBLACK-DEFAPP-AGENDA-TOGGLE-AGENDA-TRACE-ON", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_terminate_p", "CYBLACK-DEFAPP-AGENDA-TERMINATE-P", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_set_terminate", "CYBLACK-DEFAPP-AGENDA-SET-TERMINATE", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_propose", "CYBLACK-DEFAPP-AGENDA-PROPOSE", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_execute", "CYBLACK-DEFAPP-AGENDA-EXECUTE", 1, 0, false);
        declareFunction("get_cyblack_defapp_base_terminate", "GET-CYBLACK-DEFAPP-BASE-TERMINATE", 1, 0, false);
        declareFunction("set_cyblack_defapp_base_terminate", "SET-CYBLACK-DEFAPP-BASE-TERMINATE", 2, 0, false);
        declareFunction("get_cyblack_defapp_base_delay_standard_initialization_p", "GET-CYBLACK-DEFAPP-BASE-DELAY-STANDARD-INITIALIZATION-P", 1, 0, false);
        declareFunction("set_cyblack_defapp_base_delay_standard_initialization_p", "SET-CYBLACK-DEFAPP-BASE-DELAY-STANDARD-INITIALIZATION-P", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_base_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_base_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BASE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_base_p", "CYBLACK-DEFAPP-BASE-P", 1, 0, false);
        declareFunction("cyblack_defapp_base_initialize_method", "CYBLACK-DEFAPP-BASE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_base_generated_on_startup_method", "CYBLACK-DEFAPP-BASE-GENERATED-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_base_user_on_startup_method", "CYBLACK-DEFAPP-BASE-USER-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_base_on_startup_method", "CYBLACK-DEFAPP-BASE-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_base_generated_on_shutdown_method", "CYBLACK-DEFAPP-BASE-GENERATED-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_base_user_on_shutdown_method", "CYBLACK-DEFAPP-BASE-USER-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_base_on_shutdown_method", "CYBLACK-DEFAPP-BASE-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_base_terminate_p_method", "CYBLACK-DEFAPP-BASE-TERMINATE-P-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_base_set_terminate_method", "CYBLACK-DEFAPP-BASE-SET-TERMINATE-METHOD", 2, 0, false);
        declareFunction("get_cyblack_application_process_scheduler_application", "GET-CYBLACK-APPLICATION-PROCESS-SCHEDULER-APPLICATION", 1, 0, false);
        declareFunction("set_cyblack_application_process_scheduler_application", "SET-CYBLACK-APPLICATION-PROCESS-SCHEDULER-APPLICATION", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_application_process_scheduler_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-PROCESS-SCHEDULER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_application_process_scheduler_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-PROCESS-SCHEDULER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_application_process_scheduler_p", "CYBLACK-APPLICATION-PROCESS-SCHEDULER-P", 1, 0, false);
        declareFunction("cyblack_application_process_scheduler_initialize_method", "CYBLACK-APPLICATION-PROCESS-SCHEDULER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_application_process_scheduler_get_application_method", "CYBLACK-APPLICATION-PROCESS-SCHEDULER-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_application_process_scheduler_set_application_method", "CYBLACK-APPLICATION-PROCESS-SCHEDULER-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_application_process_scheduler_add_task_method", "CYBLACK-APPLICATION-PROCESS-SCHEDULER-ADD-TASK-METHOD", 2, 0, false);
        declareFunction("cyblack_application_process_scheduler_perform_trace_method", "CYBLACK-APPLICATION-PROCESS-SCHEDULER-PERFORM-TRACE-METHOD", 2, 0, false);
        declareFunction("cyblack_application_process_scheduler_on_nothing_to_do_method", "CYBLACK-APPLICATION-PROCESS-SCHEDULER-ON-NOTHING-TO-DO-METHOD", 1, 0, false);
        declareFunction("get_cyblack_application_uniprocess_symbolic_rep", "GET-CYBLACK-APPLICATION-UNIPROCESS-SYMBOLIC-REP", 1, 0, false);
        declareFunction("set_cyblack_application_uniprocess_symbolic_rep", "SET-CYBLACK-APPLICATION-UNIPROCESS-SYMBOLIC-REP", 2, 0, false);
        declareFunction("get_cyblack_application_uniprocess_process_scheduler", "GET-CYBLACK-APPLICATION-UNIPROCESS-PROCESS-SCHEDULER", 1, 0, false);
        declareFunction("set_cyblack_application_uniprocess_process_scheduler", "SET-CYBLACK-APPLICATION-UNIPROCESS-PROCESS-SCHEDULER", 2, 0, false);
        declareFunction("get_cyblack_application_uniprocess_application", "GET-CYBLACK-APPLICATION-UNIPROCESS-APPLICATION", 1, 0, false);
        declareFunction("set_cyblack_application_uniprocess_application", "SET-CYBLACK-APPLICATION-UNIPROCESS-APPLICATION", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_application_uniprocess_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-UNIPROCESS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_application_uniprocess_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-UNIPROCESS-INSTANCE", 1, 0, false);
        declareFunction("cyblack_application_uniprocess_p", "CYBLACK-APPLICATION-UNIPROCESS-P", 1, 0, false);
        declareFunction("cyblack_application_uniprocess_initialize_method", "CYBLACK-APPLICATION-UNIPROCESS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_application_uniprocess_print_method", "CYBLACK-APPLICATION-UNIPROCESS-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_application_uniprocess_get_application_method", "CYBLACK-APPLICATION-UNIPROCESS-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_application_uniprocess_set_application_method", "CYBLACK-APPLICATION-UNIPROCESS-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_application_uniprocess_get_process_scheduler_method", "CYBLACK-APPLICATION-UNIPROCESS-GET-PROCESS-SCHEDULER-METHOD", 1, 0, false);
        declareFunction("cyblack_application_uniprocess_set_process_scheduler_method", "CYBLACK-APPLICATION-UNIPROCESS-SET-PROCESS-SCHEDULER-METHOD", 2, 0, false);
        declareFunction("cyblack_application_uniprocess_get_priority_method", "CYBLACK-APPLICATION-UNIPROCESS-GET-PRIORITY-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_application_process_sorter_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-PROCESS-SORTER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_application_process_sorter_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-PROCESS-SORTER-INSTANCE", 1, 0, false);
        declareFunction("cyblack_application_process_sorter_p", "CYBLACK-APPLICATION-PROCESS-SORTER-P", 1, 0, false);
        declareFunction("cyblack_application_process_sorter_initialize_method", "CYBLACK-APPLICATION-PROCESS-SORTER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("valid_cyblack_uniprocess_application_main_loop_stage_types", "VALID-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPES", 0, 0, false);
        declareFunction("cyblack_uniprocess_application_main_loop_stage_type_p", "CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_uniprocess_application_main_loop_stage_type", "ENCODE-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_uniprocess_application_main_loop_stage_type", "DECODE-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE", 1, 0, false);
        declareFunction("cyblack_uniprocess_application_main_loop_stage_type_less_p", "CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_uniprocess_application_main_loop_stage_type_greater_p", "CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_uniprocess_application_main_loop_agenda", "GET-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-AGENDA", 1, 0, false);
        declareFunction("set_cyblack_uniprocess_application_main_loop_agenda", "SET-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-AGENDA", 2, 0, false);
        declareFunction("get_cyblack_uniprocess_application_main_loop_processing_stage", "GET-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-PROCESSING-STAGE", 1, 0, false);
        declareFunction("set_cyblack_uniprocess_application_main_loop_processing_stage", "SET-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-PROCESSING-STAGE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_uniprocess_application_main_loop_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_uniprocess_application_main_loop_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-INSTANCE", 1, 0, false);
        declareFunction("cyblack_uniprocess_application_main_loop_p", "CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-P", 1, 0, false);
        declareFunction("cyblack_uniprocess_application_main_loop_initialize_method", "CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_application_main_loop_print_method", "CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_uniprocess_application_main_loop_get_processing_stage_method", "CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-GET-PROCESSING-STAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_application_main_loop_set_processing_stage_method", "CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-SET-PROCESSING-STAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_uniprocess_application_main_loop_get_agenda_method", "CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-GET-AGENDA-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_application_main_loop_run_internal_method", "CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-RUN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_application_main_loop_nothing_to_doP_method", "CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-NOTHING-TO-DO?-METHOD", 1, 0, false);
        declareFunction("valid_cyblack_server_output_increment_process_stage_types", "VALID-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPES", 0, 0, false);
        declareFunction("cyblack_server_output_increment_process_stage_type_p", "CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_server_output_increment_process_stage_type", "ENCODE-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_server_output_increment_process_stage_type", "DECODE-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE", 1, 0, false);
        declareFunction("cyblack_server_output_increment_process_stage_type_less_p", "CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_server_output_increment_process_stage_type_greater_p", "CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_server_output_increment_process_processing_stage", "GET-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-PROCESSING-STAGE", 1, 0, false);
        declareFunction("set_cyblack_server_output_increment_process_processing_stage", "SET-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-PROCESSING-STAGE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_server_output_increment_process_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_server_output_increment_process_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-INSTANCE", 1, 0, false);
        declareFunction("cyblack_server_output_increment_process_p", "CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-P", 1, 0, false);
        declareFunction("cyblack_server_output_increment_process_initialize_method", "CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_server_output_increment_process_print_method", "CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_server_output_increment_process_get_processing_stage_method", "CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-GET-PROCESSING-STAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_server_output_increment_process_set_processing_stage_method", "CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-SET-PROCESSING-STAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_server_output_increment_process_run_internal_method", "CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-RUN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_server_output_increment_process_nothing_to_doP_method", "CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-NOTHING-TO-DO?-METHOD", 1, 0, false);
        declareFunction("valid_cyblack_server_command_process_stage_types", "VALID-CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPES", 0, 0, false);
        declareFunction("cyblack_server_command_process_stage_type_p", "CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_server_command_process_stage_type", "ENCODE-CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_server_command_process_stage_type", "DECODE-CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE", 1, 0, false);
        declareFunction("cyblack_server_command_process_stage_type_less_p", "CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_server_command_process_stage_type_greater_p", "CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_server_command_process_processing_stage", "GET-CYBLACK-SERVER-COMMAND-PROCESS-PROCESSING-STAGE", 1, 0, false);
        declareFunction("set_cyblack_server_command_process_processing_stage", "SET-CYBLACK-SERVER-COMMAND-PROCESS-PROCESSING-STAGE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_server_command_process_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERVER-COMMAND-PROCESS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_server_command_process_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERVER-COMMAND-PROCESS-INSTANCE", 1, 0, false);
        declareFunction("cyblack_server_command_process_p", "CYBLACK-SERVER-COMMAND-PROCESS-P", 1, 0, false);
        declareFunction("cyblack_server_command_process_initialize_method", "CYBLACK-SERVER-COMMAND-PROCESS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_server_command_process_print_method", "CYBLACK-SERVER-COMMAND-PROCESS-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_server_command_process_get_processing_stage_method", "CYBLACK-SERVER-COMMAND-PROCESS-GET-PROCESSING-STAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_server_command_process_set_processing_stage_method", "CYBLACK-SERVER-COMMAND-PROCESS-SET-PROCESSING-STAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_server_command_process_run_internal_method", "CYBLACK-SERVER-COMMAND-PROCESS-RUN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_server_command_process_nothing_to_doP_method", "CYBLACK-SERVER-COMMAND-PROCESS-NOTHING-TO-DO?-METHOD", 1, 0, false);
        declareFunction("valid_cyblack_port_manager_process_stage_types", "VALID-CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPES", 0, 0, false);
        declareFunction("cyblack_port_manager_process_stage_type_p", "CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_port_manager_process_stage_type", "ENCODE-CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_port_manager_process_stage_type", "DECODE-CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE", 1, 0, false);
        declareFunction("cyblack_port_manager_process_stage_type_less_p", "CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_port_manager_process_stage_type_greater_p", "CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_port_manager_process_processing_stage", "GET-CYBLACK-PORT-MANAGER-PROCESS-PROCESSING-STAGE", 1, 0, false);
        declareFunction("set_cyblack_port_manager_process_processing_stage", "SET-CYBLACK-PORT-MANAGER-PROCESS-PROCESSING-STAGE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_port_manager_process_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-MANAGER-PROCESS-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_port_manager_process_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-MANAGER-PROCESS-INSTANCE", 1, 0, false);
        declareFunction("cyblack_port_manager_process_p", "CYBLACK-PORT-MANAGER-PROCESS-P", 1, 0, false);
        declareFunction("cyblack_port_manager_process_initialize_method", "CYBLACK-PORT-MANAGER-PROCESS-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_process_print_method", "CYBLACK-PORT-MANAGER-PROCESS-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_port_manager_process_get_processing_stage_method", "CYBLACK-PORT-MANAGER-PROCESS-GET-PROCESSING-STAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_process_set_processing_stage_method", "CYBLACK-PORT-MANAGER-PROCESS-SET-PROCESSING-STAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_port_manager_process_run_internal_method", "CYBLACK-PORT-MANAGER-PROCESS-RUN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_port_manager_process_nothing_to_doP_method", "CYBLACK-PORT-MANAGER-PROCESS-NOTHING-TO-DO?-METHOD", 1, 0, false);
        declareFunction("valid_cyblack_io_stream_monitor_output_increment_types", "VALID-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPES", 0, 0, false);
        declareFunction("cyblack_io_stream_monitor_output_increment_type_p", "CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_io_stream_monitor_output_increment_type", "ENCODE-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_io_stream_monitor_output_increment_type", "DECODE-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_output_increment_type_less_p", "CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_io_stream_monitor_output_increment_type_greater_p", "CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_io_stream_monitor_output_increment_processing_stage", "GET-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-PROCESSING-STAGE", 1, 0, false);
        declareFunction("set_cyblack_io_stream_monitor_output_increment_processing_stage", "SET-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-PROCESSING-STAGE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_io_stream_monitor_output_increment_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_io_stream_monitor_output_increment_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_output_increment_p", "CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-P", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_output_increment_initialize_method", "CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_output_increment_print_method", "CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_io_stream_monitor_output_increment_get_processing_stage_method", "CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-GET-PROCESSING-STAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_output_increment_set_processing_stage_method", "CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-SET-PROCESSING-STAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_io_stream_monitor_output_increment_run_internal_method", "CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-RUN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_monitor_output_increment_nothing_to_doP_method", "CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-NOTHING-TO-DO?-METHOD", 1, 0, false);
        declareFunction("valid_cyblack_io_stream_internal_to_external_increment_types", "VALID-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPES", 0, 0, false);
        declareFunction("cyblack_io_stream_internal_to_external_increment_type_p", "CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_io_stream_internal_to_external_increment_type", "ENCODE-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_io_stream_internal_to_external_increment_type", "DECODE-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE", 1, 0, false);
        declareFunction("cyblack_io_stream_internal_to_external_increment_type_less_p", "CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_io_stream_internal_to_external_increment_type_greater_p", "CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_io_stream_internal_to_external_increment_processing_stage", "GET-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-PROCESSING-STAGE", 1, 0, false);
        declareFunction("set_cyblack_io_stream_internal_to_external_increment_processing_stage", "SET-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-PROCESSING-STAGE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_io_stream_internal_to_external_increment_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_io_stream_internal_to_external_increment_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_io_stream_internal_to_external_increment_p", "CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-P", 1, 0, false);
        declareFunction("cyblack_io_stream_internal_to_external_increment_initialize_method", "CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_internal_to_external_increment_print_method", "CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_io_stream_internal_to_external_increment_get_processing_stage_method", "CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-GET-PROCESSING-STAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_internal_to_external_increment_set_processing_stage_method", "CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-SET-PROCESSING-STAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_io_stream_internal_to_external_increment_run_internal_method", "CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-RUN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_internal_to_external_increment_nothing_to_doP_method", "CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-NOTHING-TO-DO?-METHOD", 1, 0, false);
        declareFunction("valid_cyblack_io_stream_external_to_internal_increment_types", "VALID-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPES", 0, 0, false);
        declareFunction("cyblack_io_stream_external_to_internal_increment_type_p", "CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_io_stream_external_to_internal_increment_type", "ENCODE-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_io_stream_external_to_internal_increment_type", "DECODE-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE", 1, 0, false);
        declareFunction("cyblack_io_stream_external_to_internal_increment_type_less_p", "CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_io_stream_external_to_internal_increment_type_greater_p", "CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_io_stream_external_to_internal_increment_processing_stage", "GET-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-PROCESSING-STAGE", 1, 0, false);
        declareFunction("set_cyblack_io_stream_external_to_internal_increment_processing_stage", "SET-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-PROCESSING-STAGE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_io_stream_external_to_internal_increment_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_io_stream_external_to_internal_increment_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_io_stream_external_to_internal_increment_p", "CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-P", 1, 0, false);
        declareFunction("cyblack_io_stream_external_to_internal_increment_initialize_method", "CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_external_to_internal_increment_print_method", "CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_io_stream_external_to_internal_increment_get_processing_stage_method", "CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-GET-PROCESSING-STAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_external_to_internal_increment_set_processing_stage_method", "CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-SET-PROCESSING-STAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_io_stream_external_to_internal_increment_run_internal_method", "CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-RUN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_io_stream_external_to_internal_increment_nothing_to_doP_method", "CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-NOTHING-TO-DO?-METHOD", 1, 0, false);
        declareFunction("valid_cyblack_blackboard_connection_increment_types", "VALID-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPES", 0, 0, false);
        declareFunction("cyblack_blackboard_connection_increment_type_p", "CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_blackboard_connection_increment_type", "ENCODE-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_blackboard_connection_increment_type", "DECODE-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE", 1, 0, false);
        declareFunction("cyblack_blackboard_connection_increment_type_less_p", "CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_blackboard_connection_increment_type_greater_p", "CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_blackboard_connection_increment_processing_stage", "GET-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-PROCESSING-STAGE", 1, 0, false);
        declareFunction("set_cyblack_blackboard_connection_increment_processing_stage", "SET-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-PROCESSING-STAGE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_blackboard_connection_increment_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_blackboard_connection_increment_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_blackboard_connection_increment_p", "CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-P", 1, 0, false);
        declareFunction("cyblack_blackboard_connection_increment_initialize_method", "CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_blackboard_connection_increment_print_method", "CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_blackboard_connection_increment_get_processing_stage_method", "CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-GET-PROCESSING-STAGE-METHOD", 1, 0, false);
        declareFunction("cyblack_blackboard_connection_increment_set_processing_stage_method", "CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-SET-PROCESSING-STAGE-METHOD", 2, 0, false);
        declareFunction("cyblack_blackboard_connection_increment_run_internal_method", "CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-RUN-INTERNAL-METHOD", 1, 0, false);
        declareFunction("cyblack_blackboard_connection_increment_nothing_to_doP_method", "CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-NOTHING-TO-DO?-METHOD", 1, 0, false);
        declareFunction("cyblack_monitor_base_p", "CYBLACK-MONITOR-BASE-P", 1, 0, false);
        declareFunction("get_cyblack_defapp_monitor_base_monitored_type_type_strings", "GET-CYBLACK-DEFAPP-MONITOR-BASE-MONITORED-TYPE-TYPE-STRINGS", 1, 0, false);
        declareFunction("set_cyblack_defapp_monitor_base_monitored_type_type_strings", "SET-CYBLACK-DEFAPP-MONITOR-BASE-MONITORED-TYPE-TYPE-STRINGS", 2, 0, false);
        declareFunction("get_cyblack_defapp_monitor_base_io_monitor", "GET-CYBLACK-DEFAPP-MONITOR-BASE-IO-MONITOR", 1, 0, false);
        declareFunction("set_cyblack_defapp_monitor_base_io_monitor", "SET-CYBLACK-DEFAPP-MONITOR-BASE-IO-MONITOR", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_base_after_startup_method", "CYBLACK-DEFAPP-MONITOR-BASE-AFTER-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_monitoring_on_startup_method", "CYBLACK-DEFAPP-MONITOR-BASE-MONITORING-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_override_monitored_type_panel_associations_method", "CYBLACK-DEFAPP-MONITOR-BASE-OVERRIDE-MONITORED-TYPE-PANEL-ASSOCIATIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_set_monitored_type_type_strings_method", "CYBLACK-DEFAPP-MONITOR-BASE-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_base_get_monitored_type_type_strings_method", "CYBLACK-DEFAPP-MONITOR-BASE-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_kill_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-BASE-KILL-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_init_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-BASE-INIT-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_set_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-BASE-SET-IO-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_base_get_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-BASE-GET-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_post_monitoring_initialize_method", "CYBLACK-DEFAPP-MONITOR-BASE-POST-MONITORING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_pre_monitoring_initialize_method", "CYBLACK-DEFAPP-MONITOR-BASE-PRE-MONITORING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_monitor_base_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-BASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_monitor_base_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-BASE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_p", "CYBLACK-DEFAPP-MONITOR-BASE-P", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_initialize_qua_cyblack_monitor_base_method", "CYBLACK-DEFAPP-MONITOR-BASE-INITIALIZE-QUA-CYBLACK-MONITOR-BASE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_internal_get_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-BASE-INTERNAL-GET-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_internal_set_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-BASE-INTERNAL-SET-IO-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_base_internal_get_monitored_type_type_strings_method", "CYBLACK-DEFAPP-MONITOR-BASE-INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_base_internal_set_monitored_type_type_strings_method", "CYBLACK-DEFAPP-MONITOR-BASE-INTERNAL-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_base_initialize_method", "CYBLACK-DEFAPP-MONITOR-BASE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_external_base_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-EXTERNAL-BASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_external_base_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-EXTERNAL-BASE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_external_base_p", "CYBLACK-DEFAPP-EXTERNAL-BASE-P", 1, 0, false);
        declareFunction("cyblack_defapp_external_base_initialize_method", "CYBLACK-DEFAPP-EXTERNAL-BASE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_external_base_on_startup_method", "CYBLACK-DEFAPP-EXTERNAL-BASE-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_external_base_on_shutdown_method", "CYBLACK-DEFAPP-EXTERNAL-BASE-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_external_base_after_startup_method", "CYBLACK-DEFAPP-EXTERNAL-BASE-AFTER-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_external_base_on_halt_and_abort_server_method", "CYBLACK-DEFAPP-EXTERNAL-BASE-ON-HALT-AND-ABORT-SERVER-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_external_base_on_empty_agenda_method", "CYBLACK-DEFAPP-EXTERNAL-BASE-ON-EMPTY-AGENDA-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_external_base_before_agenda_execute_method", "CYBLACK-DEFAPP-EXTERNAL-BASE-BEFORE-AGENDA-EXECUTE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_external_base_after_agenda_execute_method", "CYBLACK-DEFAPP-EXTERNAL-BASE-AFTER-AGENDA-EXECUTE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defapp_monitor_external_base_monitored_type_type_strings", "GET-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-MONITORED-TYPE-TYPE-STRINGS", 1, 0, false);
        declareFunction("set_cyblack_defapp_monitor_external_base_monitored_type_type_strings", "SET-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-MONITORED-TYPE-TYPE-STRINGS", 2, 0, false);
        declareFunction("get_cyblack_defapp_monitor_external_base_io_monitor", "GET-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-IO-MONITOR", 1, 0, false);
        declareFunction("set_cyblack_defapp_monitor_external_base_io_monitor", "SET-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-IO-MONITOR", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_after_startup_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-AFTER-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_monitoring_on_startup_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-MONITORING-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_override_monitored_type_panel_associations_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-OVERRIDE-MONITORED-TYPE-PANEL-ASSOCIATIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_set_monitored_type_type_strings_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_get_monitored_type_type_strings_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_kill_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-KILL-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_init_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INIT-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_set_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-SET-IO-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_get_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-GET-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_post_monitoring_initialize_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-POST-MONITORING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_pre_monitoring_initialize_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-PRE-MONITORING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_monitor_external_base_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_monitor_external_base_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_p", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-P", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_initialize_qua_cyblack_monitor_base_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INITIALIZE-QUA-CYBLACK-MONITOR-BASE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_internal_get_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INTERNAL-GET-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_internal_set_io_monitor_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INTERNAL-SET-IO-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_internal_get_monitored_type_type_strings_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_internal_set_monitored_type_type_strings_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INTERNAL-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_external_base_initialize_method", "CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_uniprocess_defapp_base_application_process", "GET-CYBLACK-UNIPROCESS-DEFAPP-BASE-APPLICATION-PROCESS", 1, 0, false);
        declareFunction("set_cyblack_uniprocess_defapp_base_application_process", "SET-CYBLACK-UNIPROCESS-DEFAPP-BASE-APPLICATION-PROCESS", 2, 0, false);
        declareFunction("get_cyblack_uniprocess_defapp_base_process_scheduler", "GET-CYBLACK-UNIPROCESS-DEFAPP-BASE-PROCESS-SCHEDULER", 1, 0, false);
        declareFunction("set_cyblack_uniprocess_defapp_base_process_scheduler", "SET-CYBLACK-UNIPROCESS-DEFAPP-BASE-PROCESS-SCHEDULER", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_uniprocess_defapp_base_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-DEFAPP-BASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_uniprocess_defapp_base_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-DEFAPP-BASE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_base_p", "CYBLACK-UNIPROCESS-DEFAPP-BASE-P", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_base_initialize_method", "CYBLACK-UNIPROCESS-DEFAPP-BASE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_base_set_application_method", "CYBLACK-UNIPROCESS-DEFAPP-BASE-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_uniprocess_defapp_base_get_process_scheduler_method", "CYBLACK-UNIPROCESS-DEFAPP-BASE-GET-PROCESS-SCHEDULER-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_base_set_process_scheduler_method", "CYBLACK-UNIPROCESS-DEFAPP-BASE-SET-PROCESS-SCHEDULER-METHOD", 2, 0, false);
        declareFunction("cyblack_uniprocess_defapp_base_run_method", "CYBLACK-UNIPROCESS-DEFAPP-BASE-RUN-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_base_add_process_method", "CYBLACK-UNIPROCESS-DEFAPP-BASE-ADD-PROCESS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_uniprocess_defapp_monitor_base_monitored_type_type_strings", "GET-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-MONITORED-TYPE-TYPE-STRINGS", 1, 0, false);
        declareFunction("set_cyblack_uniprocess_defapp_monitor_base_monitored_type_type_strings", "SET-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-MONITORED-TYPE-TYPE-STRINGS", 2, 0, false);
        declareFunction("get_cyblack_uniprocess_defapp_monitor_base_io_monitor", "GET-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-IO-MONITOR", 1, 0, false);
        declareFunction("set_cyblack_uniprocess_defapp_monitor_base_io_monitor", "SET-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-IO-MONITOR", 2, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_after_startup_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-AFTER-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_monitoring_on_startup_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-MONITORING-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_override_monitored_type_panel_associations_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-OVERRIDE-MONITORED-TYPE-PANEL-ASSOCIATIONS-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_set_monitored_type_type_strings_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_get_monitored_type_type_strings_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_kill_io_monitor_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-KILL-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_init_io_monitor_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INIT-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_set_io_monitor_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-SET-IO-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_get_io_monitor_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-GET-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_post_monitoring_initialize_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-POST-MONITORING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_pre_monitoring_initialize_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-PRE-MONITORING-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_uniprocess_defapp_monitor_base_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_uniprocess_defapp_monitor_base_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_p", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-P", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_initialize_qua_cyblack_monitor_base_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INITIALIZE-QUA-CYBLACK-MONITOR-BASE-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_internal_get_io_monitor_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INTERNAL-GET-IO-MONITOR-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_internal_set_io_monitor_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INTERNAL-SET-IO-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_internal_get_monitored_type_type_strings_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 1, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_internal_set_monitored_type_type_strings_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INTERNAL-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD", 2, 0, false);
        declareFunction("cyblack_uniprocess_defapp_monitor_base_initialize_method", "CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defapp_expression_children", "GET-CYBLACK-DEFAPP-EXPRESSION-CHILDREN", 1, 0, false);
        declareFunction("set_cyblack_defapp_expression_children", "SET-CYBLACK-DEFAPP-EXPRESSION-CHILDREN", 2, 0, false);
        declareFunction("get_cyblack_defapp_expression_parent", "GET-CYBLACK-DEFAPP-EXPRESSION-PARENT", 1, 0, false);
        declareFunction("set_cyblack_defapp_expression_parent", "SET-CYBLACK-DEFAPP-EXPRESSION-PARENT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_expression_p", "CYBLACK-DEFAPP-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_expression_initialize_method", "CYBLACK-DEFAPP-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_expression_print_method", "CYBLACK-DEFAPP-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defapp_expression_get_parent_method", "CYBLACK-DEFAPP-EXPRESSION-GET-PARENT-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_expression_set_parent_method", "CYBLACK-DEFAPP-EXPRESSION-SET-PARENT-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_expression_add_child_method", "CYBLACK-DEFAPP-EXPRESSION-ADD-CHILD-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_expression_get_children_method", "CYBLACK-DEFAPP-EXPRESSION-GET-CHILDREN-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defapp_body_on_quiescence_expression", "GET-CYBLACK-DEFAPP-BODY-ON-QUIESCENCE-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defapp_body_on_quiescence_expression", "SET-CYBLACK-DEFAPP-BODY-ON-QUIESCENCE-EXPRESSION", 2, 0, false);
        declareFunction("get_cyblack_defapp_body_on_shutdown_expression", "GET-CYBLACK-DEFAPP-BODY-ON-SHUTDOWN-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defapp_body_on_shutdown_expression", "SET-CYBLACK-DEFAPP-BODY-ON-SHUTDOWN-EXPRESSION", 2, 0, false);
        declareFunction("get_cyblack_defapp_body_on_startup_expression", "GET-CYBLACK-DEFAPP-BODY-ON-STARTUP-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defapp_body_on_startup_expression", "SET-CYBLACK-DEFAPP-BODY-ON-STARTUP-EXPRESSION", 2, 0, false);
        declareFunction("get_cyblack_defapp_body_on_empty_agenda_expression", "GET-CYBLACK-DEFAPP-BODY-ON-EMPTY-AGENDA-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defapp_body_on_empty_agenda_expression", "SET-CYBLACK-DEFAPP-BODY-ON-EMPTY-AGENDA-EXPRESSION", 2, 0, false);
        declareFunction("get_cyblack_defapp_body_after_agenda_execute_expression", "GET-CYBLACK-DEFAPP-BODY-AFTER-AGENDA-EXECUTE-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defapp_body_after_agenda_execute_expression", "SET-CYBLACK-DEFAPP-BODY-AFTER-AGENDA-EXECUTE-EXPRESSION", 2, 0, false);
        declareFunction("get_cyblack_defapp_body_before_agenda_execute_expression", "GET-CYBLACK-DEFAPP-BODY-BEFORE-AGENDA-EXECUTE-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defapp_body_before_agenda_execute_expression", "SET-CYBLACK-DEFAPP-BODY-BEFORE-AGENDA-EXECUTE-EXPRESSION", 2, 0, false);
        declareFunction("get_cyblack_defapp_body_monitor_expression", "GET-CYBLACK-DEFAPP-BODY-MONITOR-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defapp_body_monitor_expression", "SET-CYBLACK-DEFAPP-BODY-MONITOR-EXPRESSION", 2, 0, false);
        declareFunction("get_cyblack_defapp_body_agenda_expression", "GET-CYBLACK-DEFAPP-BODY-AGENDA-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defapp_body_agenda_expression", "SET-CYBLACK-DEFAPP-BODY-AGENDA-EXPRESSION", 2, 0, false);
        declareFunction("get_cyblack_defapp_body_ksb_expression", "GET-CYBLACK-DEFAPP-BODY-KSB-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defapp_body_ksb_expression", "SET-CYBLACK-DEFAPP-BODY-KSB-EXPRESSION", 2, 0, false);
        declareFunction("get_cyblack_defapp_body_blackboard_expression", "GET-CYBLACK-DEFAPP-BODY-BLACKBOARD-EXPRESSION", 1, 0, false);
        declareFunction("set_cyblack_defapp_body_blackboard_expression", "SET-CYBLACK-DEFAPP-BODY-BLACKBOARD-EXPRESSION", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_body_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BODY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_body_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BODY-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_body_p", "CYBLACK-DEFAPP-BODY-P", 1, 0, false);
        declareFunction("cyblack_defapp_body_initialize_method", "CYBLACK-DEFAPP-BODY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_print_method", "CYBLACK-DEFAPP-BODY-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defapp_body_get_blackboard_expression_method", "CYBLACK-DEFAPP-BODY-GET-BLACKBOARD-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_set_blackboard_expression_method", "CYBLACK-DEFAPP-BODY-SET-BLACKBOARD-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_body_get_ksb_expression_method", "CYBLACK-DEFAPP-BODY-GET-KSB-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_set_ksb_expression_method", "CYBLACK-DEFAPP-BODY-SET-KSB-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_body_get_agenda_expression_method", "CYBLACK-DEFAPP-BODY-GET-AGENDA-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_set_agenda_expression_method", "CYBLACK-DEFAPP-BODY-SET-AGENDA-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_body_get_monitor_expression_method", "CYBLACK-DEFAPP-BODY-GET-MONITOR-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_set_monitor_expression_method", "CYBLACK-DEFAPP-BODY-SET-MONITOR-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_body_get_monitored_datatypes_method", "CYBLACK-DEFAPP-BODY-GET-MONITORED-DATATYPES-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_get_before_agenda_execute_expression_method", "CYBLACK-DEFAPP-BODY-GET-BEFORE-AGENDA-EXECUTE-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_set_before_agenda_execute_expression_method", "CYBLACK-DEFAPP-BODY-SET-BEFORE-AGENDA-EXECUTE-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_body_get_after_agenda_execute_expression_method", "CYBLACK-DEFAPP-BODY-GET-AFTER-AGENDA-EXECUTE-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_set_after_agenda_execute_expression_method", "CYBLACK-DEFAPP-BODY-SET-AFTER-AGENDA-EXECUTE-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_body_get_on_empty_agenda_expression_method", "CYBLACK-DEFAPP-BODY-GET-ON-EMPTY-AGENDA-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_set_on_empty_agenda_expression_method", "CYBLACK-DEFAPP-BODY-SET-ON-EMPTY-AGENDA-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_body_get_on_startup_expression_method", "CYBLACK-DEFAPP-BODY-GET-ON-STARTUP-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_set_on_startup_expression_method", "CYBLACK-DEFAPP-BODY-SET-ON-STARTUP-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_body_get_on_shutdown_expression_method", "CYBLACK-DEFAPP-BODY-GET-ON-SHUTDOWN-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_set_on_shutdown_expression_method", "CYBLACK-DEFAPP-BODY-SET-ON-SHUTDOWN-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_body_get_on_quiescence_expression_method", "CYBLACK-DEFAPP-BODY-GET-ON-QUIESCENCE-EXPRESSION-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_set_on_quiescence_expression_method", "CYBLACK-DEFAPP-BODY-SET-ON-QUIESCENCE-EXPRESSION-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_body_get_default_base_class_method", "CYBLACK-DEFAPP-BODY-GET-DEFAULT-BASE-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_get_blackboard_info_method", "CYBLACK-DEFAPP-BODY-GET-BLACKBOARD-INFO-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_get_ksb_info_method", "CYBLACK-DEFAPP-BODY-GET-KSB-INFO-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_compile_to_initialize_method_body_method", "CYBLACK-DEFAPP-BODY-COMPILE-TO-INITIALIZE-METHOD-BODY-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_compile_to_user_on_startup_method_body_method", "CYBLACK-DEFAPP-BODY-COMPILE-TO-USER-ON-STARTUP-METHOD-BODY-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_compile_to_user_on_shutdown_method_method", "CYBLACK-DEFAPP-BODY-COMPILE-TO-USER-ON-SHUTDOWN-METHOD-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_compile_to_on_quiescence_method_method", "CYBLACK-DEFAPP-BODY-COMPILE-TO-ON-QUIESCENCE-METHOD-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_body_compile_to_on_empty_agenda_method_method", "CYBLACK-DEFAPP-BODY-COMPILE-TO-ON-EMPTY-AGENDA-METHOD-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defapp_blackboard_expression_blackboard_identifier", "GET-CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-BLACKBOARD-IDENTIFIER", 1, 0, false);
        declareFunction("set_cyblack_defapp_blackboard_expression_blackboard_identifier", "SET-CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-BLACKBOARD-IDENTIFIER", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_blackboard_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_blackboard_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_blackboard_expression_p", "CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_blackboard_expression_initialize_method", "CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_blackboard_expression_print_method", "CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defapp_blackboard_expression_get_blackboard_identifier_method", "CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-GET-BLACKBOARD-IDENTIFIER-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_blackboard_expression_set_blackboard_identifier_method", "CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-SET-BLACKBOARD-IDENTIFIER-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_blackboard_expression_get_blackboard_info_method", "CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-GET-BLACKBOARD-INFO-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defapp_ksb_expression_ksb_identifier", "GET-CYBLACK-DEFAPP-KSB-EXPRESSION-KSB-IDENTIFIER", 1, 0, false);
        declareFunction("set_cyblack_defapp_ksb_expression_ksb_identifier", "SET-CYBLACK-DEFAPP-KSB-EXPRESSION-KSB-IDENTIFIER", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_ksb_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-KSB-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_ksb_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-KSB-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_ksb_expression_p", "CYBLACK-DEFAPP-KSB-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_ksb_expression_initialize_method", "CYBLACK-DEFAPP-KSB-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_ksb_expression_print_method", "CYBLACK-DEFAPP-KSB-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defapp_ksb_expression_get_ksb_identifier_method", "CYBLACK-DEFAPP-KSB-EXPRESSION-GET-KSB-IDENTIFIER-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_ksb_expression_set_ksb_identifier_method", "CYBLACK-DEFAPP-KSB-EXPRESSION-SET-KSB-IDENTIFIER-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_ksb_expression_get_ksb_info_method", "CYBLACK-DEFAPP-KSB-EXPRESSION-GET-KSB-INFO-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_agenda_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AGENDA-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_agenda_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AGENDA-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_expression_p", "CYBLACK-DEFAPP-AGENDA-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_expression_get_agenda_class_method", "CYBLACK-DEFAPP-AGENDA-EXPRESSION-GET-AGENDA-CLASS-METHOD", 1, 0, false);
        declareFunction("valid_cyblack_defapp_agenda_types", "VALID-CYBLACK-DEFAPP-AGENDA-TYPES", 0, 0, false);
        declareFunction("cyblack_defapp_agenda_type_p", "CYBLACK-DEFAPP-AGENDA-TYPE-P", 1, 0, false);
        declareFunction("encode_cyblack_defapp_agenda_type", "ENCODE-CYBLACK-DEFAPP-AGENDA-TYPE", 1, 0, false);
        declareFunction("decode_cyblack_defapp_agenda_type", "DECODE-CYBLACK-DEFAPP-AGENDA-TYPE", 1, 0, false);
        declareFunction("cyblack_defapp_agenda_type_less_p", "CYBLACK-DEFAPP-AGENDA-TYPE-LESS-P", 2, 0, false);
        declareFunction("cyblack_defapp_agenda_type_greater_p", "CYBLACK-DEFAPP-AGENDA-TYPE-GREATER-P", 2, 0, false);
        declareFunction("get_cyblack_defapp_predefined_agenda_expression_agenda_type", "GET-CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-AGENDA-TYPE", 1, 0, false);
        declareFunction("set_cyblack_defapp_predefined_agenda_expression_agenda_type", "SET-CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-AGENDA-TYPE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_predefined_agenda_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_predefined_agenda_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_predefined_agenda_expression_p", "CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_predefined_agenda_expression_initialize_method", "CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_predefined_agenda_expression_print_method", "CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defapp_predefined_agenda_expression_get_agenda_type_method", "CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-GET-AGENDA-TYPE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_predefined_agenda_expression_set_agenda_type_method", "CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-SET-AGENDA-TYPE-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_predefined_agenda_expression_get_agenda_class_method", "CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-GET-AGENDA-CLASS-METHOD", 1, 0, false);
        declareFunction("get_cyblack_defapp_custom_agenda_expression_agenda_class", "GET-CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-AGENDA-CLASS", 1, 0, false);
        declareFunction("set_cyblack_defapp_custom_agenda_expression_agenda_class", "SET-CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-AGENDA-CLASS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_custom_agenda_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_custom_agenda_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_custom_agenda_expression_p", "CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_custom_agenda_expression_initialize_method", "CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_custom_agenda_expression_print_method", "CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defapp_custom_agenda_expression_get_agenda_class_method", "CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-GET-AGENDA-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_custom_agenda_expression_set_agenda_class_method", "CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-SET-AGENDA-CLASS-METHOD", 2, 0, false);
        declareFunction("get_cyblack_defapp_monitor_expression_datatype_names", "GET-CYBLACK-DEFAPP-MONITOR-EXPRESSION-DATATYPE-NAMES", 1, 0, false);
        declareFunction("set_cyblack_defapp_monitor_expression_datatype_names", "SET-CYBLACK-DEFAPP-MONITOR-EXPRESSION-DATATYPE-NAMES", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_monitor_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_monitor_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_expression_p", "CYBLACK-DEFAPP-MONITOR-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_expression_initialize_method", "CYBLACK-DEFAPP-MONITOR-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_expression_print_method", "CYBLACK-DEFAPP-MONITOR-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_defapp_monitor_expression_get_datatype_names_method", "CYBLACK-DEFAPP-MONITOR-EXPRESSION-GET-DATATYPE-NAMES-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_monitor_expression_set_datatype_names_method", "CYBLACK-DEFAPP-MONITOR-EXPRESSION-SET-DATATYPE-NAMES-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_expression_add_datatype_name_method", "CYBLACK-DEFAPP-MONITOR-EXPRESSION-ADD-DATATYPE-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_monitor_expression_is_monitored_p_method", "CYBLACK-DEFAPP-MONITOR-EXPRESSION-IS-MONITORED-P-METHOD", 2, 0, false);
        declareFunction("get_cyblack_defapp_code_expression_body", "GET-CYBLACK-DEFAPP-CODE-EXPRESSION-BODY", 1, 0, false);
        declareFunction("set_cyblack_defapp_code_expression_body", "SET-CYBLACK-DEFAPP-CODE-EXPRESSION-BODY", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_code_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-CODE-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_code_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-CODE-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_code_expression_p", "CYBLACK-DEFAPP-CODE-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_code_expression_initialize_method", "CYBLACK-DEFAPP-CODE-EXPRESSION-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_code_expression_get_body_method", "CYBLACK-DEFAPP-CODE-EXPRESSION-GET-BODY-METHOD", 1, 0, false);
        declareFunction("cyblack_defapp_code_expression_set_body_method", "CYBLACK-DEFAPP-CODE-EXPRESSION-SET-BODY-METHOD", 2, 0, false);
        declareFunction("cyblack_defapp_code_expression_compile_to_body_method", "CYBLACK-DEFAPP-CODE-EXPRESSION-COMPILE-TO-BODY-METHOD", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_before_agenda_execute_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BEFORE-AGENDA-EXECUTE-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_before_agenda_execute_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BEFORE-AGENDA-EXECUTE-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_before_agenda_execute_expression_p", "CYBLACK-DEFAPP-BEFORE-AGENDA-EXECUTE-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_before_agenda_execute_expression_print_method", "CYBLACK-DEFAPP-BEFORE-AGENDA-EXECUTE-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_after_agenda_execute_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_after_agenda_execute_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_after_agenda_execute_expression_p", "CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_after_agenda_execute_expression_print_method", "CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_on_empty_agenda_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_on_empty_agenda_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_on_empty_agenda_expression_p", "CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_on_empty_agenda_expression_print_method", "CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_on_startup_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_on_startup_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_on_startup_expression_p", "CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_on_startup_expression_print_method", "CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_on_shutdown_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_on_shutdown_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_on_shutdown_expression_p", "CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_on_shutdown_expression_print_method", "CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_on_quiescence_expression_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_defapp_on_quiescence_expression_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION-INSTANCE", 1, 0, false);
        declareFunction("cyblack_defapp_on_quiescence_expression_p", "CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION-P", 1, 0, false);
        declareFunction("cyblack_defapp_on_quiescence_expression_print_method", "CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION-PRINT-METHOD", 3, 0, false);
        declareFunction("valid_cyblack_defapp_body_keys", "VALID-CYBLACK-DEFAPP-BODY-KEYS", 0, 0, false);
        declareFunction("cyblack_defapp_body_key_p", "CYBLACK-DEFAPP-BODY-KEY-P", 1, 0, false);
        declareFunction("encode_cyblack_defapp_body_key", "ENCODE-CYBLACK-DEFAPP-BODY-KEY", 1, 0, false);
        declareFunction("decode_cyblack_defapp_body_key", "DECODE-CYBLACK-DEFAPP-BODY-KEY", 1, 0, false);
        declareFunction("cyblack_defapp_body_key_less_p", "CYBLACK-DEFAPP-BODY-KEY-LESS-P", 2, 0, false);
        declareFunction("cyblack_defapp_body_key_greater_p", "CYBLACK-DEFAPP-BODY-KEY-GREATER-P", 2, 0, false);
        declareFunction("cyblack_defapp_body_alist_p", "CYBLACK-DEFAPP-BODY-ALIST-P", 1, 0, false);
        declareFunction("parse_cyblack_defapp_body", "PARSE-CYBLACK-DEFAPP-BODY", 1, 0, false);
        declareFunction("cyblack_check_defapp_expression_arg", "CYBLACK-CHECK-DEFAPP-EXPRESSION-ARG", 2, 0, false);
        declareFunction("parse_cyblack_defapp_blackboard_expression", "PARSE-CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION", 1, 0, false);
        declareFunction("parse_cyblack_defapp_ksb_expression", "PARSE-CYBLACK-DEFAPP-KSB-EXPRESSION", 1, 0, false);
        declareFunction("parse_cyblack_defapp_agenda_expression", "PARSE-CYBLACK-DEFAPP-AGENDA-EXPRESSION", 1, 0, false);
        declareFunction("parse_cyblack_defapp_monitor_expression", "PARSE-CYBLACK-DEFAPP-MONITOR-EXPRESSION", 1, 0, false);
        declareFunction("cyblack_check_defapp_code_expression_arg", "CYBLACK-CHECK-DEFAPP-CODE-EXPRESSION-ARG", 2, 0, false);
        declareFunction("parse_cyblack_defapp_before_agenda_execute_expression", "PARSE-CYBLACK-DEFAPP-BEFORE-AGENDA-EXECUTE-EXPRESSION", 1, 0, false);
        declareFunction("parse_cyblack_defapp_after_agenda_execute_expression", "PARSE-CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION", 1, 0, false);
        declareFunction("parse_cyblack_defapp_on_empty_agenda_expression", "PARSE-CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION", 1, 0, false);
        declareFunction("parse_cyblack_defapp_on_startup_expression", "PARSE-CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION", 1, 0, false);
        declareFunction("parse_cyblack_defapp_on_shutdown_expression", "PARSE-CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION", 1, 0, false);
        declareFunction("parse_cyblack_defapp_on_quiescence_expression", "PARSE-CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION", 1, 0, false);
        declareFunction("get_cyblack_app_info_app_executable_function_name", "GET-CYBLACK-APP-INFO-APP-EXECUTABLE-FUNCTION-NAME", 1, 0, false);
        declareFunction("set_cyblack_app_info_app_executable_function_name", "SET-CYBLACK-APP-INFO-APP-EXECUTABLE-FUNCTION-NAME", 2, 0, false);
        declareFunction("get_cyblack_app_info_app_body", "GET-CYBLACK-APP-INFO-APP-BODY", 1, 0, false);
        declareFunction("set_cyblack_app_info_app_body", "SET-CYBLACK-APP-INFO-APP-BODY", 2, 0, false);
        declareFunction("get_cyblack_app_info_app_class", "GET-CYBLACK-APP-INFO-APP-CLASS", 1, 0, false);
        declareFunction("set_cyblack_app_info_app_class", "SET-CYBLACK-APP-INFO-APP-CLASS", 2, 0, false);
        declareFunction("get_cyblack_app_info_app_name", "GET-CYBLACK-APP-INFO-APP-NAME", 1, 0, false);
        declareFunction("set_cyblack_app_info_app_name", "SET-CYBLACK-APP-INFO-APP-NAME", 2, 0, false);
        declareFunction("get_cyblack_app_info_app_identifier", "GET-CYBLACK-APP-INFO-APP-IDENTIFIER", 1, 0, false);
        declareFunction("set_cyblack_app_info_app_identifier", "SET-CYBLACK-APP-INFO-APP-IDENTIFIER", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_app_info_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APP-INFO-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_app_info_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APP-INFO-INSTANCE", 1, 0, false);
        declareFunction("cyblack_app_info_p", "CYBLACK-APP-INFO-P", 1, 0, false);
        declareFunction("cyblack_app_info_initialize_method", "CYBLACK-APP-INFO-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_print_method", "CYBLACK-APP-INFO-PRINT-METHOD", 3, 0, false);
        declareFunction("cyblack_app_info_get_app_identifier_method", "CYBLACK-APP-INFO-GET-APP-IDENTIFIER-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_set_app_identifier_method", "CYBLACK-APP-INFO-SET-APP-IDENTIFIER-METHOD", 2, 0, false);
        declareFunction("cyblack_app_info_get_app_name_method", "CYBLACK-APP-INFO-GET-APP-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_set_app_name_method", "CYBLACK-APP-INFO-SET-APP-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_app_info_get_app_class_method", "CYBLACK-APP-INFO-GET-APP-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_set_app_class_method", "CYBLACK-APP-INFO-SET-APP-CLASS-METHOD", 2, 0, false);
        declareFunction("cyblack_app_info_get_app_body_method", "CYBLACK-APP-INFO-GET-APP-BODY-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_set_app_body_method", "CYBLACK-APP-INFO-SET-APP-BODY-METHOD", 2, 0, false);
        declareFunction("cyblack_app_info_get_app_executable_function_name_method", "CYBLACK-APP-INFO-GET-APP-EXECUTABLE-FUNCTION-NAME-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_set_app_executable_function_name_method", "CYBLACK-APP-INFO-SET-APP-EXECUTABLE-FUNCTION-NAME-METHOD", 2, 0, false);
        declareFunction("cyblack_app_info_get_monitored_datatypes_method", "CYBLACK-APP-INFO-GET-MONITORED-DATATYPES-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_get_default_base_class_method", "CYBLACK-APP-INFO-GET-DEFAULT-BASE-CLASS-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_get_ksb_info_method", "CYBLACK-APP-INFO-GET-KSB-INFO-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_get_blackboard_info_method", "CYBLACK-APP-INFO-GET-BLACKBOARD-INFO-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_has_external_modules_p_method", "CYBLACK-APP-INFO-HAS-EXTERNAL-MODULES-P-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_compile_to_initialize_method_method", "CYBLACK-APP-INFO-COMPILE-TO-INITIALIZE-METHOD-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_compile_to_generated_on_startup_method_method", "CYBLACK-APP-INFO-COMPILE-TO-GENERATED-ON-STARTUP-METHOD-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_compile_to_user_on_startup_method_method", "CYBLACK-APP-INFO-COMPILE-TO-USER-ON-STARTUP-METHOD-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_compile_to_generated_on_shutdown_method_method", "CYBLACK-APP-INFO-COMPILE-TO-GENERATED-ON-SHUTDOWN-METHOD-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_compile_to_user_on_shutdown_method_method", "CYBLACK-APP-INFO-COMPILE-TO-USER-ON-SHUTDOWN-METHOD-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_compile_to_on_quiescence_method_method", "CYBLACK-APP-INFO-COMPILE-TO-ON-QUIESCENCE-METHOD-METHOD", 1, 0, false);
        declareFunction("cyblack_app_info_compile_to_on_empty_agenda_method_method", "CYBLACK-APP-INFO-COMPILE-TO-ON-EMPTY-AGENDA-METHOD-METHOD", 1, 0, false);
        declareFunction("cyblack_set_app_info", "CYBLACK-SET-APP-INFO", 2, 0, false);
        declareFunction("cyblack_get_app_info", "CYBLACK-GET-APP-INFO", 1, 0, false);
        declareFunction("cyblack_parse_and_set_app_info", "CYBLACK-PARSE-AND-SET-APP-INFO", 4, 0, false);
        declareFunction("valid_cyblack_defapp_options", "VALID-CYBLACK-DEFAPP-OPTIONS", 0, 0, false);
        declareFunction("cyblack_defapp_option_p", "CYBLACK-DEFAPP-OPTION-P", 1, 0, false);
        declareFunction("encode_cyblack_defapp_option", "ENCODE-CYBLACK-DEFAPP-OPTION", 1, 0, false);
        declareFunction("decode_cyblack_defapp_option", "DECODE-CYBLACK-DEFAPP-OPTION", 1, 0, false);
        declareFunction("cyblack_defapp_option_less_p", "CYBLACK-DEFAPP-OPTION-LESS-P", 2, 0, false);
        declareFunction("cyblack_defapp_option_greater_p", "CYBLACK-DEFAPP-OPTION-GREATER-P", 2, 0, false);
        declareFunction("cyblack_defapp_option_plist_p", "CYBLACK-DEFAPP-OPTION-PLIST-P", 1, 0, false);
        declareFunction("cyblack_defapp_base_class_is_consistentP", "CYBLACK-DEFAPP-BASE-CLASS-IS-CONSISTENT?", 2, 0, false);
        declareFunction("expand_define_blackboard_application", "EXPAND-DEFINE-BLACKBOARD-APPLICATION", 3, 0, false);
        declareMacro("define_blackboard_application", "DEFINE-BLACKBOARD-APPLICATION");
        return NIL;
    }

    public static final SubLObject init_cyblack_defapp_file() {
        defvar("*CYBLACK-CURRENT-APP*", NIL);
        defconstant("*VALID-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPES*", $list_alt292);
        defconstant("*VALID-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPES*", $list_alt343);
        defconstant("*VALID-CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPES*", $list_alt343);
        defconstant("*VALID-CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPES*", $list_alt343);
        defconstant("*VALID-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPES*", $list_alt343);
        defconstant("*VALID-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPES*", $list_alt343);
        defconstant("*VALID-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPES*", $list_alt343);
        defconstant("*VALID-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPES*", $list_alt343);
        defconstant("*VALID-CYBLACK-DEFAPP-AGENDA-TYPES*", $list_alt940);
        defconstant("*VALID-CYBLACK-DEFAPP-BODY-KEYS*", $list_alt1085);
        defconstant("*PARSE-CYBLACK-DEFAPP-BODY-MESSAGE*", $str_alt1090$PARSE_CYBLACK_DEFAPP_BODY___S_is_);
        defparameter("*CYBLACK-DEFAULT-CONNECTION-CLASS*", CYBLACK_STANDARD_EXTERNAL_CONNECTION);
        defconstant("*VALID-CYBLACK-DEFAPP-OPTIONS*", $list_alt1235);
        return NIL;
    }

    public static final SubLObject setup_cyblack_defapp_file() {
                interfaces.new_interface(CYBLACK_DEFAPP_AGENDA_EXTENSION, NIL, NIL, $list_alt1);
        interfaces.interfaces_add_interface_instance_method(INITIALIZE_QUA_DEFAPP_AGENDA_EXTENSION, CYBLACK_DEFAPP_AGENDA_EXTENSION, $list_alt3, NIL, $list_alt4);
        interfaces.interfaces_add_interface_instance_method(GET_MAX_FUTILE_CYCLES, CYBLACK_DEFAPP_AGENDA_EXTENSION, $list_alt6, NIL, $list_alt7);
        interfaces.interfaces_add_interface_instance_method(SET_MAX_FUTILE_CYCLES, CYBLACK_DEFAPP_AGENDA_EXTENSION, $list_alt6, $list_alt9, $list_alt10);
        interfaces.interfaces_add_interface_instance_method(COUNT_FUTILE_CYCLE, CYBLACK_DEFAPP_AGENDA_EXTENSION, $list_alt3, NIL, $list_alt12);
        interfaces.interfaces_add_interface_instance_method(COUNT_USEFUL_CYCLE, CYBLACK_DEFAPP_AGENDA_EXTENSION, $list_alt3, NIL, $list_alt14);
        interfaces.interfaces_add_interface_instance_method(AGENDA_TRACE_ON_P, CYBLACK_DEFAPP_AGENDA_EXTENSION, $list_alt6, NIL, $list_alt16);
        interfaces.interfaces_add_interface_instance_method(TOGGLE_AGENDA_TRACE_ON, CYBLACK_DEFAPP_AGENDA_EXTENSION, $list_alt6, NIL, $list_alt18);
        interfaces.interfaces_add_interface_instance_method(TERMINATE_P, CYBLACK_DEFAPP_AGENDA_EXTENSION, $list_alt6, NIL, $list_alt20);
        interfaces.interfaces_add_interface_instance_method(SET_TERMINATE, CYBLACK_DEFAPP_AGENDA_EXTENSION, $list_alt6, $list_alt22, $list_alt23);
        interfaces.interfaces_add_interface_instance_method(PROPOSE, CYBLACK_DEFAPP_AGENDA_EXTENSION, $list_alt6, $list_alt25, $list_alt26);
        interfaces.interfaces_add_interface_instance_method(EXECUTE, CYBLACK_DEFAPP_AGENDA_EXTENSION, $list_alt6, NIL, $list_alt28);
        classes.subloop_new_class(CYBLACK_DEFAPP_AGENDA_BASE, CYBLACK_BASIC_SIMPLE_AGENDA, $list_alt31, NIL, $list_alt32);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_AGENDA_BASE, NIL);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt6, NIL, $list_alt28);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, EXECUTE, CYBLACK_DEFAPP_AGENDA_BASE_EXECUTE_METHOD);
        methods.methods_incorporate_instance_method(PROPOSE, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt6, $list_alt25, $list_alt26);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, PROPOSE, CYBLACK_DEFAPP_AGENDA_BASE_PROPOSE_METHOD);
        methods.methods_incorporate_instance_method(SET_TERMINATE, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt6, $list_alt22, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, SET_TERMINATE, CYBLACK_DEFAPP_AGENDA_BASE_SET_TERMINATE_METHOD);
        methods.methods_incorporate_instance_method(TERMINATE_P, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt6, NIL, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, TERMINATE_P, CYBLACK_DEFAPP_AGENDA_BASE_TERMINATE_P_METHOD);
        methods.methods_incorporate_instance_method(TOGGLE_AGENDA_TRACE_ON, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt6, NIL, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, TOGGLE_AGENDA_TRACE_ON, CYBLACK_DEFAPP_AGENDA_BASE_TOGGLE_AGENDA_TRACE_ON_METHOD);
        methods.methods_incorporate_instance_method(AGENDA_TRACE_ON_P, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt6, NIL, $list_alt16);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, AGENDA_TRACE_ON_P, CYBLACK_DEFAPP_AGENDA_BASE_AGENDA_TRACE_ON_P_METHOD);
        methods.methods_incorporate_instance_method(COUNT_USEFUL_CYCLE, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt3, NIL, $list_alt14);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, COUNT_USEFUL_CYCLE, CYBLACK_DEFAPP_AGENDA_BASE_COUNT_USEFUL_CYCLE_METHOD);
        methods.methods_incorporate_instance_method(COUNT_FUTILE_CYCLE, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt3, NIL, $list_alt12);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, COUNT_FUTILE_CYCLE, CYBLACK_DEFAPP_AGENDA_BASE_COUNT_FUTILE_CYCLE_METHOD);
        methods.methods_incorporate_instance_method(SET_MAX_FUTILE_CYCLES, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt6, $list_alt9, $list_alt10);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, SET_MAX_FUTILE_CYCLES, CYBLACK_DEFAPP_AGENDA_BASE_SET_MAX_FUTILE_CYCLES_METHOD);
        methods.methods_incorporate_instance_method(GET_MAX_FUTILE_CYCLES, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt6, NIL, $list_alt7);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, GET_MAX_FUTILE_CYCLES, CYBLACK_DEFAPP_AGENDA_BASE_GET_MAX_FUTILE_CYCLES_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_DEFAPP_AGENDA_EXTENSION, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt3, NIL, $list_alt4);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, INITIALIZE_QUA_DEFAPP_AGENDA_EXTENSION, $sym56$CYBLACK_DEFAPP_AGENDA_BASE_INITIALIZE_QUA_DEFAPP_AGENDA_EXTENSION);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_AGENDA_BASE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AGENDA_BASE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_AGENDA_BASE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AGENDA_BASE_INSTANCE);
        subloop_reserved_initialize_cyblack_defapp_agenda_base_class(CYBLACK_DEFAPP_AGENDA_BASE);
        methods.methods_incorporate_instance_method(GET_FUTILE_CYCLE_COUNT_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt76, NIL, $list_alt77);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, GET_FUTILE_CYCLE_COUNT_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE_GET_FUTILE_CYCLE_COUNT_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_FUTILE_CYCLE_COUNT_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt3, $list_alt80, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, SET_FUTILE_CYCLE_COUNT_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE_SET_FUTILE_CYCLE_COUNT_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_MAX_FUTILE_CYCLES_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt76, NIL, $list_alt85);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, GET_MAX_FUTILE_CYCLES_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE_GET_MAX_FUTILE_CYCLES_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_MAX_FUTILE_CYCLES_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt3, $list_alt88, $list_alt89);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, SET_MAX_FUTILE_CYCLES_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE_SET_MAX_FUTILE_CYCLES_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_AGENDA_TRACE_ON_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt76, NIL, $list_alt93);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, GET_AGENDA_TRACE_ON_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE_GET_AGENDA_TRACE_ON_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_AGENDA_TRACE_ON_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt3, $list_alt96, $list_alt97);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, SET_AGENDA_TRACE_ON_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE_SET_AGENDA_TRACE_ON_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(GET_TERMINATE_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt76, NIL, $list_alt101);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, GET_TERMINATE_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE_GET_TERMINATE_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(SET_TERMINATE_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt3, $list_alt96, $list_alt104);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, SET_TERMINATE_INTERNAL, CYBLACK_DEFAPP_AGENDA_BASE_SET_TERMINATE_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_AGENDA_BASE, $list_alt3, NIL, $list_alt108);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_BASE, INITIALIZE, CYBLACK_DEFAPP_AGENDA_BASE_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, CYBLACK_BASIC_HEURISTIC_AGENDA, $list_alt31, NIL, $list_alt32);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, NIL);
        methods.methods_incorporate_instance_method(EXECUTE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt6, NIL, $list_alt28);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, EXECUTE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_EXECUTE_METHOD);
        methods.methods_incorporate_instance_method(PROPOSE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt6, $list_alt25, $list_alt26);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, PROPOSE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_PROPOSE_METHOD);
        methods.methods_incorporate_instance_method(SET_TERMINATE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt6, $list_alt22, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, SET_TERMINATE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_TERMINATE_METHOD);
        methods.methods_incorporate_instance_method(TERMINATE_P, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt6, NIL, $list_alt20);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, TERMINATE_P, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_TERMINATE_P_METHOD);
        methods.methods_incorporate_instance_method(TOGGLE_AGENDA_TRACE_ON, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt6, NIL, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, TOGGLE_AGENDA_TRACE_ON, $sym116$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_TOGGLE_AGENDA_TRACE_ON_METHO);
        methods.methods_incorporate_instance_method(AGENDA_TRACE_ON_P, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt6, NIL, $list_alt16);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, AGENDA_TRACE_ON_P, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_AGENDA_TRACE_ON_P_METHOD);
        methods.methods_incorporate_instance_method(COUNT_USEFUL_CYCLE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt3, NIL, $list_alt14);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, COUNT_USEFUL_CYCLE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_COUNT_USEFUL_CYCLE_METHOD);
        methods.methods_incorporate_instance_method(COUNT_FUTILE_CYCLE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt3, NIL, $list_alt12);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, COUNT_FUTILE_CYCLE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_COUNT_FUTILE_CYCLE_METHOD);
        methods.methods_incorporate_instance_method(SET_MAX_FUTILE_CYCLES, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt6, $list_alt9, $list_alt10);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, SET_MAX_FUTILE_CYCLES, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_MAX_FUTILE_CYCLES_METHOD);
        methods.methods_incorporate_instance_method(GET_MAX_FUTILE_CYCLES, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt6, NIL, $list_alt7);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, GET_MAX_FUTILE_CYCLES, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_GET_MAX_FUTILE_CYCLES_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_DEFAPP_AGENDA_EXTENSION, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt3, NIL, $list_alt4);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, INITIALIZE_QUA_DEFAPP_AGENDA_EXTENSION, $sym122$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_INITIALIZE_QUA_DEFAPP_AGENDA);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $sym124$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $sym126$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_);
        subloop_reserved_initialize_cyblack_defapp_heuristic_agenda_base_class(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE);
        methods.methods_incorporate_instance_method(GET_FUTILE_CYCLE_COUNT_INTERNAL, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt76, NIL, $list_alt77);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, GET_FUTILE_CYCLE_COUNT_INTERNAL, $sym127$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_GET_FUTILE_CYCLE_COUNT_INTER);
        methods.methods_incorporate_instance_method(SET_FUTILE_CYCLE_COUNT_INTERNAL, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt3, $list_alt80, $list_alt81);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, SET_FUTILE_CYCLE_COUNT_INTERNAL, $sym129$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_FUTILE_CYCLE_COUNT_INTER);
        methods.methods_incorporate_instance_method(GET_MAX_FUTILE_CYCLES_INTERNAL, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt76, NIL, $list_alt85);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, GET_MAX_FUTILE_CYCLES_INTERNAL, $sym130$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_GET_MAX_FUTILE_CYCLES_INTERN);
        methods.methods_incorporate_instance_method(SET_MAX_FUTILE_CYCLES_INTERNAL, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt3, $list_alt88, $list_alt89);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, SET_MAX_FUTILE_CYCLES_INTERNAL, $sym132$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_MAX_FUTILE_CYCLES_INTERN);
        methods.methods_incorporate_instance_method(GET_AGENDA_TRACE_ON_INTERNAL, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt76, NIL, $list_alt93);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, GET_AGENDA_TRACE_ON_INTERNAL, $sym133$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_GET_AGENDA_TRACE_ON_INTERNAL);
        methods.methods_incorporate_instance_method(SET_AGENDA_TRACE_ON_INTERNAL, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt3, $list_alt96, $list_alt97);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, SET_AGENDA_TRACE_ON_INTERNAL, $sym135$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_AGENDA_TRACE_ON_INTERNAL);
        methods.methods_incorporate_instance_method(GET_TERMINATE_INTERNAL, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt76, NIL, $list_alt101);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, GET_TERMINATE_INTERNAL, $sym136$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_GET_TERMINATE_INTERNAL_METHO);
        methods.methods_incorporate_instance_method(SET_TERMINATE_INTERNAL, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt3, $list_alt96, $list_alt104);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, SET_TERMINATE_INTERNAL, $sym138$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_TERMINATE_INTERNAL_METHO);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, $list_alt3, NIL, $list_alt108);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE, INITIALIZE, CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_BASE, CYBLACK_BASIC_APPLICATION, NIL, NIL, $list_alt152);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_BASE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_BASE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BASE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_BASE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BASE_INSTANCE);
        subloop_reserved_initialize_cyblack_defapp_base_class(CYBLACK_DEFAPP_BASE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_BASE, $list_alt179, NIL, $list_alt180);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BASE, INITIALIZE, CYBLACK_DEFAPP_BASE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GENERATED_ON_STARTUP, CYBLACK_DEFAPP_BASE, $list_alt6, NIL, $list_alt194);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BASE, GENERATED_ON_STARTUP, CYBLACK_DEFAPP_BASE_GENERATED_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(USER_ON_STARTUP, CYBLACK_DEFAPP_BASE, $list_alt6, NIL, $list_alt194);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BASE, USER_ON_STARTUP, CYBLACK_DEFAPP_BASE_USER_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_DEFAPP_BASE, $list_alt6, NIL, $list_alt199);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BASE, ON_STARTUP, CYBLACK_DEFAPP_BASE_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(GENERATED_ON_SHUTDOWN, CYBLACK_DEFAPP_BASE, $list_alt6, NIL, $list_alt194);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BASE, GENERATED_ON_SHUTDOWN, CYBLACK_DEFAPP_BASE_GENERATED_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(USER_ON_SHUTDOWN, CYBLACK_DEFAPP_BASE, $list_alt6, NIL, $list_alt194);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BASE, USER_ON_SHUTDOWN, CYBLACK_DEFAPP_BASE_USER_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_DEFAPP_BASE, $list_alt6, NIL, $list_alt206);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BASE, ON_SHUTDOWN, CYBLACK_DEFAPP_BASE_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(TERMINATE_P, CYBLACK_DEFAPP_BASE, $list_alt208, NIL, $list_alt101);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BASE, TERMINATE_P, CYBLACK_DEFAPP_BASE_TERMINATE_P_METHOD);
        methods.methods_incorporate_instance_method(SET_TERMINATE, CYBLACK_DEFAPP_BASE, $list_alt6, $list_alt22, $list_alt210);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BASE, SET_TERMINATE, CYBLACK_DEFAPP_BASE_SET_TERMINATE_METHOD);
        classes.subloop_new_class(CYBLACK_APPLICATION_PROCESS_SCHEDULER, BASIC_MULTI_TASK_SCHEDULER, NIL, NIL, $list_alt215);
        classes.class_set_implements_slot_listeners(CYBLACK_APPLICATION_PROCESS_SCHEDULER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_APPLICATION_PROCESS_SCHEDULER, $sym216$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_PROCESS_SCHEDULER);
        classes.subloop_note_instance_initialization_function(CYBLACK_APPLICATION_PROCESS_SCHEDULER, $sym221$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_PROCESS_SCHEDULER);
        subloop_reserved_initialize_cyblack_application_process_scheduler_class(CYBLACK_APPLICATION_PROCESS_SCHEDULER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_APPLICATION_PROCESS_SCHEDULER, $list_alt222, NIL, $list_alt223);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_PROCESS_SCHEDULER, INITIALIZE, CYBLACK_APPLICATION_PROCESS_SCHEDULER_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_APPLICATION_PROCESS_SCHEDULER, $list_alt208, NIL, $list_alt227);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_PROCESS_SCHEDULER, GET_APPLICATION, CYBLACK_APPLICATION_PROCESS_SCHEDULER_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_APPLICATION_PROCESS_SCHEDULER, $list_alt6, $list_alt229, $list_alt230);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_PROCESS_SCHEDULER, SET_APPLICATION, CYBLACK_APPLICATION_PROCESS_SCHEDULER_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(ADD_TASK, CYBLACK_APPLICATION_PROCESS_SCHEDULER, $list_alt6, $list_alt234, $list_alt235);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_PROCESS_SCHEDULER, ADD_TASK, CYBLACK_APPLICATION_PROCESS_SCHEDULER_ADD_TASK_METHOD);
        methods.methods_incorporate_instance_method(PERFORM_TRACE, CYBLACK_APPLICATION_PROCESS_SCHEDULER, $list_alt6, $list_alt238, $list_alt239);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_PROCESS_SCHEDULER, PERFORM_TRACE, CYBLACK_APPLICATION_PROCESS_SCHEDULER_PERFORM_TRACE_METHOD);
        methods.methods_incorporate_instance_method(ON_NOTHING_TO_DO, CYBLACK_APPLICATION_PROCESS_SCHEDULER, $list_alt6, NIL, $list_alt244);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_PROCESS_SCHEDULER, ON_NOTHING_TO_DO, CYBLACK_APPLICATION_PROCESS_SCHEDULER_ON_NOTHING_TO_DO_METHOD);
        classes.subloop_new_class(CYBLACK_APPLICATION_UNIPROCESS, BASIC_SUBLOOP_PROCESS, NIL, NIL, $list_alt248);
        classes.class_set_implements_slot_listeners(CYBLACK_APPLICATION_UNIPROCESS, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_APPLICATION_UNIPROCESS, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_UNIPROCESS_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_APPLICATION_UNIPROCESS, $sym254$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_UNIPROCESS_INSTAN);
        subloop_reserved_initialize_cyblack_application_uniprocess_class(CYBLACK_APPLICATION_UNIPROCESS);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_APPLICATION_UNIPROCESS, $list_alt3, NIL, $list_alt255);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_UNIPROCESS, INITIALIZE, CYBLACK_APPLICATION_UNIPROCESS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_APPLICATION_UNIPROCESS, $list_alt6, $list_alt259, $list_alt260);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_UNIPROCESS, PRINT, CYBLACK_APPLICATION_UNIPROCESS_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_APPLICATION_UNIPROCESS, $list_alt208, NIL, $list_alt227);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_UNIPROCESS, GET_APPLICATION, CYBLACK_APPLICATION_UNIPROCESS_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_APPLICATION_UNIPROCESS, $list_alt6, $list_alt229, $list_alt265);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_UNIPROCESS, SET_APPLICATION, CYBLACK_APPLICATION_UNIPROCESS_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_PROCESS_SCHEDULER, CYBLACK_APPLICATION_UNIPROCESS, $list_alt208, NIL, $list_alt270);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_UNIPROCESS, GET_PROCESS_SCHEDULER, CYBLACK_APPLICATION_UNIPROCESS_GET_PROCESS_SCHEDULER_METHOD);
        methods.methods_incorporate_instance_method(SET_PROCESS_SCHEDULER, CYBLACK_APPLICATION_UNIPROCESS, $list_alt6, $list_alt273, $list_alt274);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_UNIPROCESS, SET_PROCESS_SCHEDULER, CYBLACK_APPLICATION_UNIPROCESS_SET_PROCESS_SCHEDULER_METHOD);
        methods.methods_incorporate_instance_method(GET_PRIORITY, CYBLACK_APPLICATION_UNIPROCESS, $list_alt6, NIL, $list_alt279);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_UNIPROCESS, GET_PRIORITY, CYBLACK_APPLICATION_UNIPROCESS_GET_PRIORITY_METHOD);
        classes.subloop_new_class(CYBLACK_APPLICATION_PROCESS_SORTER, BASIC_QUEUE_SIMPLE_SORTER, NIL, NIL, $list_alt283);
        classes.class_set_implements_slot_listeners(CYBLACK_APPLICATION_PROCESS_SORTER, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_APPLICATION_PROCESS_SORTER, $sym284$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_PROCESS_SORTER_CL);
        classes.subloop_note_instance_initialization_function(CYBLACK_APPLICATION_PROCESS_SORTER, $sym287$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_PROCESS_SORTER_IN);
        subloop_reserved_initialize_cyblack_application_process_sorter_class(CYBLACK_APPLICATION_PROCESS_SORTER);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_APPLICATION_PROCESS_SORTER, $list_alt3, NIL, $list_alt288);
        methods.subloop_register_instance_method(CYBLACK_APPLICATION_PROCESS_SORTER, INITIALIZE, CYBLACK_APPLICATION_PROCESS_SORTER_INITIALIZE_METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE, $list_alt292);
        classes.subloop_new_class(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, CYBLACK_APPLICATION_UNIPROCESS, NIL, NIL, $list_alt301);
        classes.class_set_implements_slot_listeners(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, $sym303$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_APPLICATION_MAIN_L);
        classes.subloop_note_instance_initialization_function(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, $sym304$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_APPLICATION_MAIN_L);
        subloop_reserved_initialize_cyblack_uniprocess_application_main_loop_class(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, $list_alt3, NIL, $list_alt305);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, INITIALIZE, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, $list_alt6, $list_alt259, $list_alt310);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, PRINT, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PROCESSING_STAGE, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, $list_alt76, NIL, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, GET_PROCESSING_STAGE, $sym316$CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_GET_PROCESSING_STAGE_MET);
        methods.methods_incorporate_instance_method(SET_PROCESSING_STAGE, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, $list_alt3, $list_alt318, $list_alt319);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, SET_PROCESSING_STAGE, $sym322$CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_SET_PROCESSING_STAGE_MET);
        methods.methods_incorporate_instance_method(GET_AGENDA, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, $list_alt3, NIL, $list_alt324);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, GET_AGENDA, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_GET_AGENDA_METHOD);
        methods.methods_incorporate_instance_method(RUN_INTERNAL, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, $list_alt3, NIL, $list_alt328);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, RUN_INTERNAL, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_RUN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method($sym280$NOTHING_TO_DO_, CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, $list_alt6, NIL, $list_alt341);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP, $sym280$NOTHING_TO_DO_, $sym342$CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_NOTHING_TO_DO__METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE, $list_alt343);
        classes.subloop_new_class(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, CYBLACK_APPLICATION_UNIPROCESS, NIL, NIL, $list_alt349);
        classes.class_set_implements_slot_listeners(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, $sym350$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCE);
        classes.subloop_note_instance_initialization_function(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, $sym351$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCE);
        subloop_reserved_initialize_cyblack_server_output_increment_process_class(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, $list_alt3, NIL, $list_alt352);
        methods.subloop_register_instance_method(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, INITIALIZE, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, $list_alt6, $list_alt259, $list_alt356);
        methods.subloop_register_instance_method(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, PRINT, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PROCESSING_STAGE, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, $list_alt76, NIL, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, GET_PROCESSING_STAGE, $sym360$CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_GET_PROCESSING_STAGE_METH);
        methods.methods_incorporate_instance_method(SET_PROCESSING_STAGE, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, $list_alt3, $list_alt318, $list_alt361);
        methods.subloop_register_instance_method(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, SET_PROCESSING_STAGE, $sym364$CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_SET_PROCESSING_STAGE_METH);
        methods.methods_incorporate_instance_method(RUN_INTERNAL, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, $list_alt3, NIL, $list_alt365);
        methods.subloop_register_instance_method(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, RUN_INTERNAL, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_RUN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method($sym280$NOTHING_TO_DO_, CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, $list_alt6, NIL, $list_alt368);
        methods.subloop_register_instance_method(CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS, $sym280$NOTHING_TO_DO_, $sym369$CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_NOTHING_TO_DO__METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE, $list_alt343);
        classes.subloop_new_class(CYBLACK_SERVER_COMMAND_PROCESS, CYBLACK_APPLICATION_UNIPROCESS, NIL, NIL, $list_alt349);
        classes.class_set_implements_slot_listeners(CYBLACK_SERVER_COMMAND_PROCESS, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_SERVER_COMMAND_PROCESS, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERVER_COMMAND_PROCESS_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_SERVER_COMMAND_PROCESS, $sym376$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERVER_COMMAND_PROCESS_INSTAN);
        subloop_reserved_initialize_cyblack_server_command_process_class(CYBLACK_SERVER_COMMAND_PROCESS);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_SERVER_COMMAND_PROCESS, $list_alt3, NIL, $list_alt377);
        methods.subloop_register_instance_method(CYBLACK_SERVER_COMMAND_PROCESS, INITIALIZE, CYBLACK_SERVER_COMMAND_PROCESS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_SERVER_COMMAND_PROCESS, $list_alt6, $list_alt259, $list_alt381);
        methods.subloop_register_instance_method(CYBLACK_SERVER_COMMAND_PROCESS, PRINT, CYBLACK_SERVER_COMMAND_PROCESS_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PROCESSING_STAGE, CYBLACK_SERVER_COMMAND_PROCESS, $list_alt76, NIL, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_SERVER_COMMAND_PROCESS, GET_PROCESSING_STAGE, CYBLACK_SERVER_COMMAND_PROCESS_GET_PROCESSING_STAGE_METHOD);
        methods.methods_incorporate_instance_method(SET_PROCESSING_STAGE, CYBLACK_SERVER_COMMAND_PROCESS, $list_alt3, $list_alt318, $list_alt386);
        methods.subloop_register_instance_method(CYBLACK_SERVER_COMMAND_PROCESS, SET_PROCESSING_STAGE, CYBLACK_SERVER_COMMAND_PROCESS_SET_PROCESSING_STAGE_METHOD);
        methods.methods_incorporate_instance_method(RUN_INTERNAL, CYBLACK_SERVER_COMMAND_PROCESS, $list_alt3, NIL, $list_alt390);
        methods.subloop_register_instance_method(CYBLACK_SERVER_COMMAND_PROCESS, RUN_INTERNAL, CYBLACK_SERVER_COMMAND_PROCESS_RUN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method($sym280$NOTHING_TO_DO_, CYBLACK_SERVER_COMMAND_PROCESS, $list_alt6, NIL, $list_alt393);
        methods.subloop_register_instance_method(CYBLACK_SERVER_COMMAND_PROCESS, $sym280$NOTHING_TO_DO_, $sym394$CYBLACK_SERVER_COMMAND_PROCESS_NOTHING_TO_DO__METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE, $list_alt343);
        classes.subloop_new_class(CYBLACK_PORT_MANAGER_PROCESS, CYBLACK_APPLICATION_UNIPROCESS, NIL, NIL, $list_alt349);
        classes.class_set_implements_slot_listeners(CYBLACK_PORT_MANAGER_PROCESS, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_PORT_MANAGER_PROCESS, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_MANAGER_PROCESS_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_PORT_MANAGER_PROCESS, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_MANAGER_PROCESS_INSTANCE);
        subloop_reserved_initialize_cyblack_port_manager_process_class(CYBLACK_PORT_MANAGER_PROCESS);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_PORT_MANAGER_PROCESS, $list_alt3, NIL, $list_alt402);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER_PROCESS, INITIALIZE, CYBLACK_PORT_MANAGER_PROCESS_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_PORT_MANAGER_PROCESS, $list_alt6, $list_alt259, $list_alt406);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER_PROCESS, PRINT, CYBLACK_PORT_MANAGER_PROCESS_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PROCESSING_STAGE, CYBLACK_PORT_MANAGER_PROCESS, $list_alt76, NIL, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER_PROCESS, GET_PROCESSING_STAGE, CYBLACK_PORT_MANAGER_PROCESS_GET_PROCESSING_STAGE_METHOD);
        methods.methods_incorporate_instance_method(SET_PROCESSING_STAGE, CYBLACK_PORT_MANAGER_PROCESS, $list_alt3, $list_alt318, $list_alt411);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER_PROCESS, SET_PROCESSING_STAGE, CYBLACK_PORT_MANAGER_PROCESS_SET_PROCESSING_STAGE_METHOD);
        methods.methods_incorporate_instance_method(RUN_INTERNAL, CYBLACK_PORT_MANAGER_PROCESS, $list_alt3, NIL, $list_alt415);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER_PROCESS, RUN_INTERNAL, CYBLACK_PORT_MANAGER_PROCESS_RUN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method($sym280$NOTHING_TO_DO_, CYBLACK_PORT_MANAGER_PROCESS, $list_alt6, NIL, $list_alt418);
        methods.subloop_register_instance_method(CYBLACK_PORT_MANAGER_PROCESS, $sym280$NOTHING_TO_DO_, $sym419$CYBLACK_PORT_MANAGER_PROCESS_NOTHING_TO_DO__METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE, $list_alt343);
        classes.subloop_new_class(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, CYBLACK_APPLICATION_UNIPROCESS, NIL, NIL, $list_alt349);
        classes.class_set_implements_slot_listeners(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, $sym425$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCR);
        classes.subloop_note_instance_initialization_function(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, $sym426$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCR);
        subloop_reserved_initialize_cyblack_io_stream_monitor_output_increment_class(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, $list_alt3, NIL, $list_alt427);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, INITIALIZE, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, $list_alt6, $list_alt259, $list_alt431);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, PRINT, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PROCESSING_STAGE, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, $list_alt76, NIL, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, GET_PROCESSING_STAGE, $sym435$CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_GET_PROCESSING_STAGE_M);
        methods.methods_incorporate_instance_method(SET_PROCESSING_STAGE, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, $list_alt3, $list_alt318, $list_alt436);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, SET_PROCESSING_STAGE, $sym439$CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_SET_PROCESSING_STAGE_M);
        methods.methods_incorporate_instance_method(RUN_INTERNAL, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, $list_alt3, NIL, $list_alt440);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, RUN_INTERNAL, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_RUN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method($sym280$NOTHING_TO_DO_, CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, $list_alt6, NIL, $list_alt446);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT, $sym280$NOTHING_TO_DO_, $sym448$CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_NOTHING_TO_DO__METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE, $list_alt343);
        classes.subloop_new_class(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, CYBLACK_APPLICATION_UNIPROCESS, NIL, NIL, $list_alt349);
        classes.class_set_implements_slot_listeners(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, $sym454$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNA);
        classes.subloop_note_instance_initialization_function(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, $sym455$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNA);
        subloop_reserved_initialize_cyblack_io_stream_internal_to_external_increment_class(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, $list_alt3, NIL, $list_alt456);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, INITIALIZE, $sym458$CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_INITIALIZE_METHO);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, $list_alt6, $list_alt259, $list_alt459);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, PRINT, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PROCESSING_STAGE, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, $list_alt76, NIL, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, GET_PROCESSING_STAGE, $sym463$CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_GET_PROCESSING_S);
        methods.methods_incorporate_instance_method(SET_PROCESSING_STAGE, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, $list_alt3, $list_alt318, $list_alt464);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, SET_PROCESSING_STAGE, $sym467$CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_SET_PROCESSING_S);
        methods.methods_incorporate_instance_method(RUN_INTERNAL, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, $list_alt3, NIL, $list_alt468);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, RUN_INTERNAL, $sym471$CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_RUN_INTERNAL_MET);
        methods.methods_incorporate_instance_method($sym280$NOTHING_TO_DO_, CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, $list_alt6, NIL, $list_alt472);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT, $sym280$NOTHING_TO_DO_, $sym473$CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_NOTHING_TO_DO__M);
        enumerations.enumerations_incorporate_definition(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE, $list_alt343);
        classes.subloop_new_class(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, CYBLACK_APPLICATION_UNIPROCESS, NIL, NIL, $list_alt349);
        classes.class_set_implements_slot_listeners(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, $sym479$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNA);
        classes.subloop_note_instance_initialization_function(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, $sym480$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNA);
        subloop_reserved_initialize_cyblack_io_stream_external_to_internal_increment_class(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, $list_alt3, NIL, $list_alt481);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, INITIALIZE, $sym483$CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_INITIALIZE_METHO);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, $list_alt6, $list_alt259, $list_alt484);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, PRINT, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PROCESSING_STAGE, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, $list_alt76, NIL, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, GET_PROCESSING_STAGE, $sym488$CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_GET_PROCESSING_S);
        methods.methods_incorporate_instance_method(SET_PROCESSING_STAGE, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, $list_alt3, $list_alt318, $list_alt489);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, SET_PROCESSING_STAGE, $sym492$CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_SET_PROCESSING_S);
        methods.methods_incorporate_instance_method(RUN_INTERNAL, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, $list_alt3, NIL, $list_alt493);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, RUN_INTERNAL, $sym496$CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_RUN_INTERNAL_MET);
        methods.methods_incorporate_instance_method($sym280$NOTHING_TO_DO_, CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, $list_alt6, NIL, $list_alt497);
        methods.subloop_register_instance_method(CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT, $sym280$NOTHING_TO_DO_, $sym499$CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_NOTHING_TO_DO__M);
        enumerations.enumerations_incorporate_definition(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE, $list_alt343);
        classes.subloop_new_class(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, CYBLACK_APPLICATION_UNIPROCESS, NIL, NIL, $list_alt349);
        classes.class_set_implements_slot_listeners(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, $sym505$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BLACKBOARD_CONNECTION_INCREME);
        classes.subloop_note_instance_initialization_function(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, $sym506$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BLACKBOARD_CONNECTION_INCREME);
        subloop_reserved_initialize_cyblack_blackboard_connection_increment_class(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, $list_alt3, NIL, $list_alt507);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, INITIALIZE, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, $list_alt6, $list_alt259, $list_alt510);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, PRINT, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PROCESSING_STAGE, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, $list_alt76, NIL, $list_alt315);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, GET_PROCESSING_STAGE, $sym514$CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_GET_PROCESSING_STAGE_METH);
        methods.methods_incorporate_instance_method(SET_PROCESSING_STAGE, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, $list_alt3, $list_alt318, $list_alt515);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, SET_PROCESSING_STAGE, $sym518$CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_SET_PROCESSING_STAGE_METH);
        methods.methods_incorporate_instance_method(RUN_INTERNAL, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, $list_alt3, NIL, $list_alt519);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, RUN_INTERNAL, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_RUN_INTERNAL_METHOD);
        methods.methods_incorporate_instance_method($sym280$NOTHING_TO_DO_, CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, $list_alt6, NIL, $list_alt523);
        methods.subloop_register_instance_method(CYBLACK_BLACKBOARD_CONNECTION_INCREMENT, $sym280$NOTHING_TO_DO_, $sym525$CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_NOTHING_TO_DO__METHOD);
        interfaces.new_interface(CYBLACK_MONITOR_BASE, NIL, NIL, $list_alt527);
        interfaces.interfaces_add_interface_instance_method(PRE_MONITORING_INITIALIZE, CYBLACK_MONITOR_BASE, $list_alt3, NIL, $list_alt529);
        interfaces.interfaces_add_interface_instance_method(POST_MONITORING_INITIALIZE, CYBLACK_MONITOR_BASE, $list_alt3, NIL, $list_alt531);
        interfaces.interfaces_add_interface_instance_method(GET_IO_MONITOR, CYBLACK_MONITOR_BASE, $list_alt3, NIL, $list_alt533);
        interfaces.interfaces_add_interface_instance_method(SET_IO_MONITOR, CYBLACK_MONITOR_BASE, $list_alt3, $list_alt535, $list_alt536);
        interfaces.interfaces_add_interface_instance_method(INIT_IO_MONITOR, CYBLACK_MONITOR_BASE, $list_alt3, NIL, $list_alt538);
        interfaces.interfaces_add_interface_instance_method(KILL_IO_MONITOR, CYBLACK_MONITOR_BASE, $list_alt3, NIL, $list_alt540);
        interfaces.interfaces_add_interface_instance_method(GET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_MONITOR_BASE, $list_alt3, NIL, $list_alt542);
        interfaces.interfaces_add_interface_instance_method(SET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_MONITOR_BASE, $list_alt3, $list_alt544, $list_alt545);
        interfaces.interfaces_add_interface_instance_method(OVERRIDE_MONITORED_TYPE_PANEL_ASSOCIATIONS, CYBLACK_MONITOR_BASE, $list_alt3, NIL, $list_alt547);
        interfaces.interfaces_add_interface_instance_method(MONITORING_ON_STARTUP, CYBLACK_MONITOR_BASE, $list_alt3, NIL, $list_alt549);
        interfaces.interfaces_add_interface_instance_method(AFTER_STARTUP, CYBLACK_MONITOR_BASE, $list_alt6, NIL, $list_alt550);
        classes.subloop_new_class(CYBLACK_DEFAPP_MONITOR_BASE, CYBLACK_DEFAPP_BASE, $list_alt552, NIL, $list_alt553);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_MONITOR_BASE, NIL);
        methods.methods_incorporate_instance_method(AFTER_STARTUP, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt6, NIL, $list_alt550);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, AFTER_STARTUP, CYBLACK_DEFAPP_MONITOR_BASE_AFTER_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(MONITORING_ON_STARTUP, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt549);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, MONITORING_ON_STARTUP, CYBLACK_DEFAPP_MONITOR_BASE_MONITORING_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(OVERRIDE_MONITORED_TYPE_PANEL_ASSOCIATIONS, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt547);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, OVERRIDE_MONITORED_TYPE_PANEL_ASSOCIATIONS, $sym570$CYBLACK_DEFAPP_MONITOR_BASE_OVERRIDE_MONITORED_TYPE_PANEL_ASSOCIA);
        methods.methods_incorporate_instance_method(SET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, $list_alt544, $list_alt545);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, SET_MONITORED_TYPE_TYPE_STRINGS, $sym573$CYBLACK_DEFAPP_MONITOR_BASE_SET_MONITORED_TYPE_TYPE_STRINGS_METHO);
        methods.methods_incorporate_instance_method(GET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt542);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, GET_MONITORED_TYPE_TYPE_STRINGS, $sym574$CYBLACK_DEFAPP_MONITOR_BASE_GET_MONITORED_TYPE_TYPE_STRINGS_METHO);
        methods.methods_incorporate_instance_method(KILL_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt540);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, KILL_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE_KILL_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(INIT_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt538);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, INIT_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE_INIT_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(SET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, $list_alt535, $list_alt536);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, SET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE_SET_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(GET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt533);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, GET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE_GET_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(POST_MONITORING_INITIALIZE, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt531);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, POST_MONITORING_INITIALIZE, CYBLACK_DEFAPP_MONITOR_BASE_POST_MONITORING_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRE_MONITORING_INITIALIZE, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt529);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, PRE_MONITORING_INITIALIZE, CYBLACK_DEFAPP_MONITOR_BASE_PRE_MONITORING_INITIALIZE_METHOD);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_MONITOR_BASE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_BASE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_MONITOR_BASE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_BASE_INSTANCE);
        subloop_reserved_initialize_cyblack_defapp_monitor_base_class(CYBLACK_DEFAPP_MONITOR_BASE);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_MONITOR_BASE, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt588);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, INITIALIZE_QUA_CYBLACK_MONITOR_BASE, $sym589$CYBLACK_DEFAPP_MONITOR_BASE_INITIALIZE_QUA_CYBLACK_MONITOR_BASE_M);
        methods.methods_incorporate_instance_method(INTERNAL_GET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt591);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, INTERNAL_GET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE_INTERNAL_GET_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_SET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, $list_alt535, $list_alt595);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, INTERNAL_SET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_BASE_INTERNAL_SET_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(INTERNAL_GET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt599);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, INTERNAL_GET_MONITORED_TYPE_TYPE_STRINGS, $sym601$CYBLACK_DEFAPP_MONITOR_BASE_INTERNAL_GET_MONITORED_TYPE_TYPE_STRI);
        methods.methods_incorporate_instance_method(INTERNAL_SET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt3, $list_alt603, $list_alt604);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, INTERNAL_SET_MONITORED_TYPE_TYPE_STRINGS, $sym606$CYBLACK_DEFAPP_MONITOR_BASE_INTERNAL_SET_MONITORED_TYPE_TYPE_STRI);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_MONITOR_BASE, $list_alt179, NIL, $list_alt607);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_BASE, INITIALIZE, CYBLACK_DEFAPP_MONITOR_BASE_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_EXTERNAL_BASE, CYBLACK_DEFAPP_BASE, NIL, NIL, $list_alt610);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_EXTERNAL_BASE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_EXTERNAL_BASE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_EXTERNAL_BASE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_EXTERNAL_BASE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_EXTERNAL_BASE_INSTANCE);
        subloop_reserved_initialize_cyblack_defapp_external_base_class(CYBLACK_DEFAPP_EXTERNAL_BASE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_EXTERNAL_BASE, $list_alt222, NIL, $list_alt613);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXTERNAL_BASE, INITIALIZE, CYBLACK_DEFAPP_EXTERNAL_BASE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_DEFAPP_EXTERNAL_BASE, $list_alt6, NIL, $list_alt617);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXTERNAL_BASE, ON_STARTUP, CYBLACK_DEFAPP_EXTERNAL_BASE_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_DEFAPP_EXTERNAL_BASE, $list_alt6, NIL, $list_alt619);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXTERNAL_BASE, ON_SHUTDOWN, CYBLACK_DEFAPP_EXTERNAL_BASE_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(AFTER_STARTUP, CYBLACK_DEFAPP_EXTERNAL_BASE, $list_alt6, NIL, $list_alt621);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXTERNAL_BASE, AFTER_STARTUP, CYBLACK_DEFAPP_EXTERNAL_BASE_AFTER_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_HALT_AND_ABORT_SERVER, CYBLACK_DEFAPP_EXTERNAL_BASE, $list_alt6, NIL, $list_alt628);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXTERNAL_BASE, ON_HALT_AND_ABORT_SERVER, CYBLACK_DEFAPP_EXTERNAL_BASE_ON_HALT_AND_ABORT_SERVER_METHOD);
        methods.methods_incorporate_instance_method(ON_EMPTY_AGENDA, CYBLACK_DEFAPP_EXTERNAL_BASE, $list_alt6, NIL, $list_alt631);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXTERNAL_BASE, ON_EMPTY_AGENDA, CYBLACK_DEFAPP_EXTERNAL_BASE_ON_EMPTY_AGENDA_METHOD);
        methods.methods_incorporate_instance_method(BEFORE_AGENDA_EXECUTE, CYBLACK_DEFAPP_EXTERNAL_BASE, $list_alt6, NIL, $list_alt635);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXTERNAL_BASE, BEFORE_AGENDA_EXECUTE, CYBLACK_DEFAPP_EXTERNAL_BASE_BEFORE_AGENDA_EXECUTE_METHOD);
        methods.methods_incorporate_instance_method(AFTER_AGENDA_EXECUTE, CYBLACK_DEFAPP_EXTERNAL_BASE, $list_alt6, NIL, $list_alt635);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXTERNAL_BASE, AFTER_AGENDA_EXECUTE, CYBLACK_DEFAPP_EXTERNAL_BASE_AFTER_AGENDA_EXECUTE_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, CYBLACK_DEFAPP_EXTERNAL_BASE, $list_alt552, NIL, $list_alt553);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, NIL);
        methods.methods_incorporate_instance_method(AFTER_STARTUP, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt6, NIL, $list_alt550);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, AFTER_STARTUP, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_AFTER_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(MONITORING_ON_STARTUP, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, NIL, $list_alt549);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, MONITORING_ON_STARTUP, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_MONITORING_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(OVERRIDE_MONITORED_TYPE_PANEL_ASSOCIATIONS, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, NIL, $list_alt547);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, OVERRIDE_MONITORED_TYPE_PANEL_ASSOCIATIONS, $sym643$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_OVERRIDE_MONITORED_TYPE_PANE);
        methods.methods_incorporate_instance_method(SET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, $list_alt544, $list_alt545);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, SET_MONITORED_TYPE_TYPE_STRINGS, $sym644$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_SET_MONITORED_TYPE_TYPE_STRI);
        methods.methods_incorporate_instance_method(GET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, NIL, $list_alt542);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, GET_MONITORED_TYPE_TYPE_STRINGS, $sym645$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_GET_MONITORED_TYPE_TYPE_STRI);
        methods.methods_incorporate_instance_method(KILL_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, NIL, $list_alt540);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, KILL_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_KILL_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(INIT_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, NIL, $list_alt538);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, INIT_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INIT_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(SET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, $list_alt535, $list_alt536);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, SET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_SET_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(GET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, NIL, $list_alt533);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, GET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_GET_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(POST_MONITORING_INITIALIZE, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, NIL, $list_alt531);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, POST_MONITORING_INITIALIZE, $sym650$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_POST_MONITORING_INITIALIZE_M);
        methods.methods_incorporate_instance_method(PRE_MONITORING_INITIALIZE, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, NIL, $list_alt529);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, PRE_MONITORING_INITIALIZE, $sym651$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_PRE_MONITORING_INITIALIZE_ME);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $sym652$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $sym653$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_);
        subloop_reserved_initialize_cyblack_defapp_monitor_external_base_class(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_MONITOR_BASE, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, NIL, $list_alt588);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, INITIALIZE_QUA_CYBLACK_MONITOR_BASE, $sym654$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INITIALIZE_QUA_CYBLACK_MONIT);
        methods.methods_incorporate_instance_method(INTERNAL_GET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, NIL, $list_alt591);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, INTERNAL_GET_IO_MONITOR, $sym656$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INTERNAL_GET_IO_MONITOR_METH);
        methods.methods_incorporate_instance_method(INTERNAL_SET_IO_MONITOR, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, $list_alt535, $list_alt595);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, INTERNAL_SET_IO_MONITOR, $sym658$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INTERNAL_SET_IO_MONITOR_METH);
        methods.methods_incorporate_instance_method(INTERNAL_GET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, NIL, $list_alt599);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, INTERNAL_GET_MONITORED_TYPE_TYPE_STRINGS, $sym660$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INTERNAL_GET_MONITORED_TYPE_);
        methods.methods_incorporate_instance_method(INTERNAL_SET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt3, $list_alt603, $list_alt604);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, INTERNAL_SET_MONITORED_TYPE_TYPE_STRINGS, $sym662$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INTERNAL_SET_MONITORED_TYPE_);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, $list_alt179, NIL, $list_alt607);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE, INITIALIZE, CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_UNIPROCESS_DEFAPP_BASE, CYBLACK_DEFAPP_BASE, NIL, NIL, $list_alt665);
        classes.class_set_implements_slot_listeners(CYBLACK_UNIPROCESS_DEFAPP_BASE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_UNIPROCESS_DEFAPP_BASE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_DEFAPP_BASE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_UNIPROCESS_DEFAPP_BASE, $sym668$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_DEFAPP_BASE_INSTAN);
        subloop_reserved_initialize_cyblack_uniprocess_defapp_base_class(CYBLACK_UNIPROCESS_DEFAPP_BASE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_UNIPROCESS_DEFAPP_BASE, $list_alt3, NIL, $list_alt669);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_BASE, INITIALIZE, CYBLACK_UNIPROCESS_DEFAPP_BASE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_UNIPROCESS_DEFAPP_BASE, $list_alt672, $list_alt229, $list_alt673);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_BASE, SET_APPLICATION, CYBLACK_UNIPROCESS_DEFAPP_BASE_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(GET_PROCESS_SCHEDULER, CYBLACK_UNIPROCESS_DEFAPP_BASE, $list_alt208, NIL, $list_alt675);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_BASE, GET_PROCESS_SCHEDULER, CYBLACK_UNIPROCESS_DEFAPP_BASE_GET_PROCESS_SCHEDULER_METHOD);
        methods.methods_incorporate_instance_method(SET_PROCESS_SCHEDULER, CYBLACK_UNIPROCESS_DEFAPP_BASE, $list_alt6, $list_alt273, $list_alt677);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_BASE, SET_PROCESS_SCHEDULER, CYBLACK_UNIPROCESS_DEFAPP_BASE_SET_PROCESS_SCHEDULER_METHOD);
        methods.methods_incorporate_instance_method(RUN, CYBLACK_UNIPROCESS_DEFAPP_BASE, $list_alt6, NIL, $list_alt682);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_BASE, RUN, CYBLACK_UNIPROCESS_DEFAPP_BASE_RUN_METHOD);
        methods.methods_incorporate_instance_method(ADD_PROCESS, CYBLACK_UNIPROCESS_DEFAPP_BASE, $list_alt6, $list_alt234, $list_alt688);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_BASE, ADD_PROCESS, CYBLACK_UNIPROCESS_DEFAPP_BASE_ADD_PROCESS_METHOD);
        classes.subloop_new_class(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, CYBLACK_UNIPROCESS_DEFAPP_BASE, $list_alt552, NIL, $list_alt553);
        classes.class_set_implements_slot_listeners(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, NIL);
        methods.methods_incorporate_instance_method(AFTER_STARTUP, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt6, NIL, $list_alt550);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, AFTER_STARTUP, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_AFTER_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(MONITORING_ON_STARTUP, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt549);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, MONITORING_ON_STARTUP, $sym696$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_MONITORING_ON_STARTUP_METH);
        methods.methods_incorporate_instance_method(OVERRIDE_MONITORED_TYPE_PANEL_ASSOCIATIONS, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt547);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, OVERRIDE_MONITORED_TYPE_PANEL_ASSOCIATIONS, $sym697$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_OVERRIDE_MONITORED_TYPE_PA);
        methods.methods_incorporate_instance_method(SET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, $list_alt544, $list_alt545);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, SET_MONITORED_TYPE_TYPE_STRINGS, $sym698$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_SET_MONITORED_TYPE_TYPE_ST);
        methods.methods_incorporate_instance_method(GET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt542);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, GET_MONITORED_TYPE_TYPE_STRINGS, $sym699$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_GET_MONITORED_TYPE_TYPE_ST);
        methods.methods_incorporate_instance_method(KILL_IO_MONITOR, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt540);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, KILL_IO_MONITOR, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_KILL_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(INIT_IO_MONITOR, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt538);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, INIT_IO_MONITOR, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INIT_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(SET_IO_MONITOR, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, $list_alt535, $list_alt536);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, SET_IO_MONITOR, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_SET_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(GET_IO_MONITOR, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt533);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, GET_IO_MONITOR, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_GET_IO_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(POST_MONITORING_INITIALIZE, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt531);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, POST_MONITORING_INITIALIZE, $sym704$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_POST_MONITORING_INITIALIZE);
        methods.methods_incorporate_instance_method(PRE_MONITORING_INITIALIZE, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt529);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, PRE_MONITORING_INITIALIZE, $sym705$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_PRE_MONITORING_INITIALIZE_);
        classes.subloop_note_class_initialization_function(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $sym706$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BAS);
        classes.subloop_note_instance_initialization_function(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $sym707$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BAS);
        subloop_reserved_initialize_cyblack_uniprocess_defapp_monitor_base_class(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE);
        methods.methods_incorporate_instance_method(INITIALIZE_QUA_CYBLACK_MONITOR_BASE, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt588);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, INITIALIZE_QUA_CYBLACK_MONITOR_BASE, $sym708$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INITIALIZE_QUA_CYBLACK_MON);
        methods.methods_incorporate_instance_method(INTERNAL_GET_IO_MONITOR, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt591);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, INTERNAL_GET_IO_MONITOR, $sym710$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INTERNAL_GET_IO_MONITOR_ME);
        methods.methods_incorporate_instance_method(INTERNAL_SET_IO_MONITOR, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, $list_alt535, $list_alt595);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, INTERNAL_SET_IO_MONITOR, $sym712$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INTERNAL_SET_IO_MONITOR_ME);
        methods.methods_incorporate_instance_method(INTERNAL_GET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, NIL, $list_alt599);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, INTERNAL_GET_MONITORED_TYPE_TYPE_STRINGS, $sym714$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INTERNAL_GET_MONITORED_TYP);
        methods.methods_incorporate_instance_method(INTERNAL_SET_MONITORED_TYPE_TYPE_STRINGS, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt3, $list_alt603, $list_alt604);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, INTERNAL_SET_MONITORED_TYPE_TYPE_STRINGS, $sym716$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INTERNAL_SET_MONITORED_TYP);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, $list_alt179, NIL, $list_alt607);
        methods.subloop_register_instance_method(CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE, INITIALIZE, CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INITIALIZE_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_EXPRESSION, OBJECT, NIL, NIL, $list_alt719);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_EXPRESSION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_EXPRESSION_INSTANCE);
        subloop_reserved_initialize_cyblack_defapp_expression_class(CYBLACK_DEFAPP_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_EXPRESSION, $list_alt3, NIL, $list_alt724);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXPRESSION, INITIALIZE, CYBLACK_DEFAPP_EXPRESSION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_EXPRESSION, $list_alt208, $list_alt259, $list_alt727);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXPRESSION, PRINT, CYBLACK_DEFAPP_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_PARENT, CYBLACK_DEFAPP_EXPRESSION, $list_alt208, NIL, $list_alt730);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXPRESSION, GET_PARENT, CYBLACK_DEFAPP_EXPRESSION_GET_PARENT_METHOD);
        methods.methods_incorporate_instance_method(SET_PARENT, CYBLACK_DEFAPP_EXPRESSION, $list_alt6, $list_alt733, $list_alt734);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXPRESSION, SET_PARENT, CYBLACK_DEFAPP_EXPRESSION_SET_PARENT_METHOD);
        methods.methods_incorporate_instance_method(ADD_CHILD, CYBLACK_DEFAPP_EXPRESSION, $list_alt208, $list_alt739, $list_alt740);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXPRESSION, ADD_CHILD, CYBLACK_DEFAPP_EXPRESSION_ADD_CHILD_METHOD);
        methods.methods_incorporate_instance_method(GET_CHILDREN, CYBLACK_DEFAPP_EXPRESSION, $list_alt208, NIL, $list_alt743);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_EXPRESSION, GET_CHILDREN, CYBLACK_DEFAPP_EXPRESSION_GET_CHILDREN_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_BODY, CYBLACK_DEFAPP_EXPRESSION, NIL, NIL, $list_alt746);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_BODY, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_BODY, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BODY_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_BODY, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BODY_INSTANCE);
        subloop_reserved_initialize_cyblack_defapp_body_class(CYBLACK_DEFAPP_BODY);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_BODY, $list_alt3, NIL, $list_alt759);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, INITIALIZE, CYBLACK_DEFAPP_BODY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_BODY, $list_alt208, $list_alt259, $list_alt762);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, PRINT, CYBLACK_DEFAPP_BODY_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_BLACKBOARD_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt767);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_BLACKBOARD_EXPRESSION, CYBLACK_DEFAPP_BODY_GET_BLACKBOARD_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_BLACKBOARD_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt6, $list_alt770, $list_alt771);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, SET_BLACKBOARD_EXPRESSION, CYBLACK_DEFAPP_BODY_SET_BLACKBOARD_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_KSB_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt776);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_KSB_EXPRESSION, CYBLACK_DEFAPP_BODY_GET_KSB_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_KSB_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt6, $list_alt779, $list_alt780);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, SET_KSB_EXPRESSION, CYBLACK_DEFAPP_BODY_SET_KSB_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_AGENDA_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt785);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_AGENDA_EXPRESSION, CYBLACK_DEFAPP_BODY_GET_AGENDA_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_AGENDA_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt6, $list_alt788, $list_alt789);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, SET_AGENDA_EXPRESSION, CYBLACK_DEFAPP_BODY_SET_AGENDA_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_MONITOR_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt794);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_MONITOR_EXPRESSION, CYBLACK_DEFAPP_BODY_GET_MONITOR_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_MONITOR_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt6, $list_alt797, $list_alt798);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, SET_MONITOR_EXPRESSION, CYBLACK_DEFAPP_BODY_SET_MONITOR_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_MONITORED_DATATYPES, CYBLACK_DEFAPP_BODY, $list_alt6, NIL, $list_alt803);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_MONITORED_DATATYPES, CYBLACK_DEFAPP_BODY_GET_MONITORED_DATATYPES_METHOD);
        methods.methods_incorporate_instance_method(GET_BEFORE_AGENDA_EXECUTE_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt807);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_BEFORE_AGENDA_EXECUTE_EXPRESSION, CYBLACK_DEFAPP_BODY_GET_BEFORE_AGENDA_EXECUTE_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_BEFORE_AGENDA_EXECUTE_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt6, $list_alt810, $list_alt811);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, SET_BEFORE_AGENDA_EXECUTE_EXPRESSION, CYBLACK_DEFAPP_BODY_SET_BEFORE_AGENDA_EXECUTE_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_AFTER_AGENDA_EXECUTE_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt816);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_AFTER_AGENDA_EXECUTE_EXPRESSION, CYBLACK_DEFAPP_BODY_GET_AFTER_AGENDA_EXECUTE_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_AFTER_AGENDA_EXECUTE_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt6, $list_alt810, $list_alt819);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, SET_AFTER_AGENDA_EXECUTE_EXPRESSION, CYBLACK_DEFAPP_BODY_SET_AFTER_AGENDA_EXECUTE_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_ON_EMPTY_AGENDA_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt824);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_ON_EMPTY_AGENDA_EXPRESSION, CYBLACK_DEFAPP_BODY_GET_ON_EMPTY_AGENDA_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_ON_EMPTY_AGENDA_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt6, $list_alt810, $list_alt827);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, SET_ON_EMPTY_AGENDA_EXPRESSION, CYBLACK_DEFAPP_BODY_SET_ON_EMPTY_AGENDA_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_ON_STARTUP_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt832);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_ON_STARTUP_EXPRESSION, CYBLACK_DEFAPP_BODY_GET_ON_STARTUP_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_ON_STARTUP_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt6, $list_alt835, $list_alt836);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, SET_ON_STARTUP_EXPRESSION, CYBLACK_DEFAPP_BODY_SET_ON_STARTUP_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_ON_SHUTDOWN_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt841);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_ON_SHUTDOWN_EXPRESSION, CYBLACK_DEFAPP_BODY_GET_ON_SHUTDOWN_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_ON_SHUTDOWN_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt6, $list_alt844, $list_alt845);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, SET_ON_SHUTDOWN_EXPRESSION, CYBLACK_DEFAPP_BODY_SET_ON_SHUTDOWN_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_ON_QUIESCENCE_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt850);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_ON_QUIESCENCE_EXPRESSION, CYBLACK_DEFAPP_BODY_GET_ON_QUIESCENCE_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(SET_ON_QUIESCENCE_EXPRESSION, CYBLACK_DEFAPP_BODY, $list_alt6, $list_alt853, $list_alt854);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, SET_ON_QUIESCENCE_EXPRESSION, CYBLACK_DEFAPP_BODY_SET_ON_QUIESCENCE_EXPRESSION_METHOD);
        methods.methods_incorporate_instance_method(GET_DEFAULT_BASE_CLASS, CYBLACK_DEFAPP_BODY, $list_alt6, NIL, $list_alt859);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_DEFAULT_BASE_CLASS, CYBLACK_DEFAPP_BODY_GET_DEFAULT_BASE_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_BLACKBOARD_INFO, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt862);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_BLACKBOARD_INFO, CYBLACK_DEFAPP_BODY_GET_BLACKBOARD_INFO_METHOD);
        methods.methods_incorporate_instance_method(GET_KSB_INFO, CYBLACK_DEFAPP_BODY, $list_alt208, NIL, $list_alt865);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, GET_KSB_INFO, CYBLACK_DEFAPP_BODY_GET_KSB_INFO_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_INITIALIZE_METHOD_BODY, CYBLACK_DEFAPP_BODY, $list_alt6, NIL, $list_alt868);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, COMPILE_TO_INITIALIZE_METHOD_BODY, CYBLACK_DEFAPP_BODY_COMPILE_TO_INITIALIZE_METHOD_BODY_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_USER_ON_STARTUP_METHOD_BODY, CYBLACK_DEFAPP_BODY, $list_alt6, NIL, $list_alt871);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, COMPILE_TO_USER_ON_STARTUP_METHOD_BODY, CYBLACK_DEFAPP_BODY_COMPILE_TO_USER_ON_STARTUP_METHOD_BODY_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_USER_ON_SHUTDOWN_METHOD, CYBLACK_DEFAPP_BODY, $list_alt6, NIL, $list_alt876);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, COMPILE_TO_USER_ON_SHUTDOWN_METHOD, CYBLACK_DEFAPP_BODY_COMPILE_TO_USER_ON_SHUTDOWN_METHOD_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_ON_QUIESCENCE_METHOD, CYBLACK_DEFAPP_BODY, $list_alt6, NIL, $list_alt880);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, COMPILE_TO_ON_QUIESCENCE_METHOD, CYBLACK_DEFAPP_BODY_COMPILE_TO_ON_QUIESCENCE_METHOD_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_ON_EMPTY_AGENDA_METHOD, CYBLACK_DEFAPP_BODY, $list_alt6, NIL, $list_alt884);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BODY, COMPILE_TO_ON_EMPTY_AGENDA_METHOD, CYBLACK_DEFAPP_BODY_COMPILE_TO_ON_EMPTY_AGENDA_METHOD_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, CYBLACK_DEFAPP_EXPRESSION, NIL, NIL, $list_alt888);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, $sym890$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, $sym891$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_);
        subloop_reserved_initialize_cyblack_defapp_blackboard_expression_class(CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, $list_alt3, NIL, $list_alt892);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, INITIALIZE, CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, $list_alt6, $list_alt259, $list_alt895);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, PRINT, CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_BLACKBOARD_IDENTIFIER, CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, $list_alt208, NIL, $list_alt900);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, GET_BLACKBOARD_IDENTIFIER, $sym901$CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_GET_BLACKBOARD_IDENTIFIER_ME);
        methods.methods_incorporate_instance_method(SET_BLACKBOARD_IDENTIFIER, CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, $list_alt6, $list_alt903, $list_alt904);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, SET_BLACKBOARD_IDENTIFIER, $sym908$CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_SET_BLACKBOARD_IDENTIFIER_ME);
        methods.methods_incorporate_instance_method(GET_BLACKBOARD_INFO, CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, $list_alt208, NIL, $list_alt909);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION, GET_BLACKBOARD_INFO, CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_GET_BLACKBOARD_INFO_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_KSB_EXPRESSION, CYBLACK_DEFAPP_EXPRESSION, NIL, NIL, $list_alt912);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_KSB_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_KSB_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_KSB_EXPRESSION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_KSB_EXPRESSION, $sym915$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_KSB_EXPRESSION_INSTANC);
        subloop_reserved_initialize_cyblack_defapp_ksb_expression_class(CYBLACK_DEFAPP_KSB_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_KSB_EXPRESSION, $list_alt3, NIL, $list_alt916);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_KSB_EXPRESSION, INITIALIZE, CYBLACK_DEFAPP_KSB_EXPRESSION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_KSB_EXPRESSION, $list_alt208, $list_alt259, $list_alt919);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_KSB_EXPRESSION, PRINT, CYBLACK_DEFAPP_KSB_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_KSB_IDENTIFIER, CYBLACK_DEFAPP_KSB_EXPRESSION, $list_alt208, NIL, $list_alt923);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_KSB_EXPRESSION, GET_KSB_IDENTIFIER, CYBLACK_DEFAPP_KSB_EXPRESSION_GET_KSB_IDENTIFIER_METHOD);
        methods.methods_incorporate_instance_method(SET_KSB_IDENTIFIER, CYBLACK_DEFAPP_KSB_EXPRESSION, $list_alt6, $list_alt926, $list_alt927);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_KSB_EXPRESSION, SET_KSB_IDENTIFIER, CYBLACK_DEFAPP_KSB_EXPRESSION_SET_KSB_IDENTIFIER_METHOD);
        methods.methods_incorporate_instance_method(GET_KSB_INFO, CYBLACK_DEFAPP_KSB_EXPRESSION, $list_alt6, NIL, $list_alt931);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_KSB_EXPRESSION, GET_KSB_INFO, CYBLACK_DEFAPP_KSB_EXPRESSION_GET_KSB_INFO_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_AGENDA_EXPRESSION, CYBLACK_DEFAPP_EXPRESSION, NIL, NIL, $list_alt935);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_AGENDA_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_AGENDA_EXPRESSION, $sym936$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AGENDA_EXPRESSION_CLAS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_AGENDA_EXPRESSION, $sym937$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AGENDA_EXPRESSION_INST);
        subloop_reserved_initialize_cyblack_defapp_agenda_expression_class(CYBLACK_DEFAPP_AGENDA_EXPRESSION);
        methods.methods_incorporate_instance_method(GET_AGENDA_CLASS, CYBLACK_DEFAPP_AGENDA_EXPRESSION, $list_alt6, NIL, $list_alt194);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AGENDA_EXPRESSION, GET_AGENDA_CLASS, CYBLACK_DEFAPP_AGENDA_EXPRESSION_GET_AGENDA_CLASS_METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_DEFAPP_AGENDA_TYPE, $list_alt940);
        classes.subloop_new_class(CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, CYBLACK_DEFAPP_AGENDA_EXPRESSION, NIL, NIL, $list_alt946);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, $sym948$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPR);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, $sym949$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPR);
        subloop_reserved_initialize_cyblack_defapp_predefined_agenda_expression_class(CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, $list_alt3, NIL, $list_alt950);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, INITIALIZE, CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, $list_alt208, $list_alt259, $list_alt954);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, PRINT, CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_AGENDA_TYPE, CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, $list_alt208, NIL, $list_alt958);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, GET_AGENDA_TYPE, $sym959$CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_GET_AGENDA_TYPE_METHO);
        methods.methods_incorporate_instance_method(SET_AGENDA_TYPE, CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, $list_alt6, $list_alt961, $list_alt962);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, SET_AGENDA_TYPE, $sym965$CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_SET_AGENDA_TYPE_METHO);
        methods.methods_incorporate_instance_method(GET_AGENDA_CLASS, CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, $list_alt208, NIL, $list_alt966);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION, GET_AGENDA_CLASS, $sym968$CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_GET_AGENDA_CLASS_METH);
        classes.subloop_new_class(CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, CYBLACK_DEFAPP_AGENDA_EXPRESSION, NIL, NIL, $list_alt970);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, $sym971$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSI);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, $sym972$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSI);
        subloop_reserved_initialize_cyblack_defapp_custom_agenda_expression_class(CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, $list_alt3, NIL, $list_alt973);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, INITIALIZE, CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, $list_alt208, $list_alt259, $list_alt976);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, PRINT, CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_AGENDA_CLASS, CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, $list_alt208, NIL, $list_alt978);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, GET_AGENDA_CLASS, CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_GET_AGENDA_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_AGENDA_CLASS, CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, $list_alt6, $list_alt981, $list_alt982);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION, SET_AGENDA_CLASS, CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_SET_AGENDA_CLASS_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_MONITOR_EXPRESSION, CYBLACK_DEFAPP_EXPRESSION, NIL, NIL, $list_alt989);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_MONITOR_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_MONITOR_EXPRESSION, $sym991$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_EXPRESSION_CLA);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_MONITOR_EXPRESSION, $sym992$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_EXPRESSION_INS);
        subloop_reserved_initialize_cyblack_defapp_monitor_expression_class(CYBLACK_DEFAPP_MONITOR_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_MONITOR_EXPRESSION, $list_alt3, NIL, $list_alt993);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXPRESSION, INITIALIZE, CYBLACK_DEFAPP_MONITOR_EXPRESSION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_MONITOR_EXPRESSION, $list_alt208, $list_alt259, $list_alt996);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXPRESSION, PRINT, CYBLACK_DEFAPP_MONITOR_EXPRESSION_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_DATATYPE_NAMES, CYBLACK_DEFAPP_MONITOR_EXPRESSION, $list_alt208, NIL, $list_alt1000);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXPRESSION, GET_DATATYPE_NAMES, CYBLACK_DEFAPP_MONITOR_EXPRESSION_GET_DATATYPE_NAMES_METHOD);
        methods.methods_incorporate_instance_method(SET_DATATYPE_NAMES, CYBLACK_DEFAPP_MONITOR_EXPRESSION, $list_alt6, $list_alt1003, $list_alt1004);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXPRESSION, SET_DATATYPE_NAMES, CYBLACK_DEFAPP_MONITOR_EXPRESSION_SET_DATATYPE_NAMES_METHOD);
        methods.methods_incorporate_instance_method(ADD_DATATYPE_NAME, CYBLACK_DEFAPP_MONITOR_EXPRESSION, $list_alt6, $list_alt1010, $list_alt1011);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXPRESSION, ADD_DATATYPE_NAME, CYBLACK_DEFAPP_MONITOR_EXPRESSION_ADD_DATATYPE_NAME_METHOD);
        methods.methods_incorporate_instance_method(IS_MONITORED_P, CYBLACK_DEFAPP_MONITOR_EXPRESSION, $list_alt208, $list_alt1016, $list_alt1017);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_MONITOR_EXPRESSION, IS_MONITORED_P, CYBLACK_DEFAPP_MONITOR_EXPRESSION_IS_MONITORED_P_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_CODE_EXPRESSION, CYBLACK_DEFAPP_EXPRESSION, NIL, NIL, $list_alt1020);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_CODE_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_CODE_EXPRESSION, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_CODE_EXPRESSION_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_CODE_EXPRESSION, $sym1023$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_CODE_EXPRESSION_INSTAN);
        subloop_reserved_initialize_cyblack_defapp_code_expression_class(CYBLACK_DEFAPP_CODE_EXPRESSION);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_DEFAPP_CODE_EXPRESSION, $list_alt3, NIL, $list_alt1024);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_CODE_EXPRESSION, INITIALIZE, CYBLACK_DEFAPP_CODE_EXPRESSION_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_BODY, CYBLACK_DEFAPP_CODE_EXPRESSION, $list_alt208, NIL, $list_alt1028);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_CODE_EXPRESSION, GET_BODY, CYBLACK_DEFAPP_CODE_EXPRESSION_GET_BODY_METHOD);
        methods.methods_incorporate_instance_method(SET_BODY, CYBLACK_DEFAPP_CODE_EXPRESSION, $list_alt6, $list_alt1031, $list_alt1032);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_CODE_EXPRESSION, SET_BODY, CYBLACK_DEFAPP_CODE_EXPRESSION_SET_BODY_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_BODY, CYBLACK_DEFAPP_CODE_EXPRESSION, $list_alt6, NIL, $list_alt1037);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_CODE_EXPRESSION, COMPILE_TO_BODY, CYBLACK_DEFAPP_CODE_EXPRESSION_COMPILE_TO_BODY_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION, CYBLACK_DEFAPP_CODE_EXPRESSION, NIL, NIL, $list_alt1041);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION, $sym1042$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION, $sym1043$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_);
        subloop_reserved_initialize_cyblack_defapp_before_agenda_execute_expression_class(CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION, $list_alt6, $list_alt259, $list_alt1044);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION, PRINT, CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION_PRINT_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION, CYBLACK_DEFAPP_CODE_EXPRESSION, NIL, NIL, $list_alt1041);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION, $sym1051$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_E);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION, $sym1052$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_E);
        subloop_reserved_initialize_cyblack_defapp_after_agenda_execute_expression_class(CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION, $list_alt6, $list_alt259, $list_alt1053);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION, PRINT, CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION_PRINT_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION, CYBLACK_DEFAPP_CODE_EXPRESSION, NIL, NIL, $list_alt1041);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION, $sym1058$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRES);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION, $sym1059$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRES);
        subloop_reserved_initialize_cyblack_defapp_on_empty_agenda_expression_class(CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION, $list_alt6, $list_alt259, $list_alt1060);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION, PRINT, CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION_PRINT_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION, CYBLACK_DEFAPP_CODE_EXPRESSION, NIL, NIL, $list_alt1041);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION, $sym1065$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION_);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION, $sym1066$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION_);
        subloop_reserved_initialize_cyblack_defapp_on_startup_expression_class(CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION, $list_alt6, $list_alt259, $list_alt1067);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION, PRINT, CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION_PRINT_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION, CYBLACK_DEFAPP_CODE_EXPRESSION, NIL, NIL, $list_alt1041);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION, $sym1072$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION, $sym1073$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION);
        subloop_reserved_initialize_cyblack_defapp_on_shutdown_expression_class(CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION, $list_alt6, $list_alt259, $list_alt1074);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION, PRINT, CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION_PRINT_METHOD);
        classes.subloop_new_class(CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION, CYBLACK_DEFAPP_CODE_EXPRESSION, NIL, NIL, $list_alt1041);
        classes.class_set_implements_slot_listeners(CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION, $sym1079$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSI);
        classes.subloop_note_instance_initialization_function(CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION, $sym1080$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSI);
        subloop_reserved_initialize_cyblack_defapp_on_quiescence_expression_class(CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION, $list_alt6, $list_alt259, $list_alt1081);
        methods.subloop_register_instance_method(CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION, PRINT, CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION_PRINT_METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_DEFAPP_BODY_KEY, $list_alt1085);
        classes.subloop_new_class(CYBLACK_APP_INFO, OBJECT, NIL, NIL, $list_alt1114);
        classes.class_set_implements_slot_listeners(CYBLACK_APP_INFO, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_APP_INFO, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APP_INFO_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_APP_INFO, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APP_INFO_INSTANCE);
        subloop_reserved_initialize_cyblack_app_info_class(CYBLACK_APP_INFO);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_APP_INFO, $list_alt3, NIL, $list_alt1122);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, INITIALIZE, CYBLACK_APP_INFO_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, CYBLACK_APP_INFO, $list_alt208, $list_alt259, $list_alt1125);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, PRINT, CYBLACK_APP_INFO_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_APP_IDENTIFIER, CYBLACK_APP_INFO, $list_alt208, NIL, $list_alt1129);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, GET_APP_IDENTIFIER, CYBLACK_APP_INFO_GET_APP_IDENTIFIER_METHOD);
        methods.methods_incorporate_instance_method(SET_APP_IDENTIFIER, CYBLACK_APP_INFO, $list_alt6, $list_alt1132, $list_alt1133);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, SET_APP_IDENTIFIER, CYBLACK_APP_INFO_SET_APP_IDENTIFIER_METHOD);
        methods.methods_incorporate_instance_method(GET_APP_NAME, CYBLACK_APP_INFO, $list_alt208, NIL, $list_alt1138);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, GET_APP_NAME, CYBLACK_APP_INFO_GET_APP_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_APP_NAME, CYBLACK_APP_INFO, $list_alt6, $list_alt1141, $list_alt1142);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, SET_APP_NAME, CYBLACK_APP_INFO_SET_APP_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_APP_CLASS, CYBLACK_APP_INFO, $list_alt208, NIL, $list_alt1147);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, GET_APP_CLASS, CYBLACK_APP_INFO_GET_APP_CLASS_METHOD);
        methods.methods_incorporate_instance_method(SET_APP_CLASS, CYBLACK_APP_INFO, $list_alt6, $list_alt1150, $list_alt1151);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, SET_APP_CLASS, CYBLACK_APP_INFO_SET_APP_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_APP_BODY, CYBLACK_APP_INFO, $list_alt208, NIL, $list_alt1156);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, GET_APP_BODY, CYBLACK_APP_INFO_GET_APP_BODY_METHOD);
        methods.methods_incorporate_instance_method(SET_APP_BODY, CYBLACK_APP_INFO, $list_alt6, $list_alt1159, $list_alt1160);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, SET_APP_BODY, CYBLACK_APP_INFO_SET_APP_BODY_METHOD);
        methods.methods_incorporate_instance_method(GET_APP_EXECUTABLE_FUNCTION_NAME, CYBLACK_APP_INFO, $list_alt208, NIL, $list_alt1165);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, GET_APP_EXECUTABLE_FUNCTION_NAME, CYBLACK_APP_INFO_GET_APP_EXECUTABLE_FUNCTION_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_APP_EXECUTABLE_FUNCTION_NAME, CYBLACK_APP_INFO, $list_alt6, $list_alt1168, $list_alt1169);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, SET_APP_EXECUTABLE_FUNCTION_NAME, CYBLACK_APP_INFO_SET_APP_EXECUTABLE_FUNCTION_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_MONITORED_DATATYPES, CYBLACK_APP_INFO, $list_alt6, NIL, $list_alt1173);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, GET_MONITORED_DATATYPES, CYBLACK_APP_INFO_GET_MONITORED_DATATYPES_METHOD);
        methods.methods_incorporate_instance_method(GET_DEFAULT_BASE_CLASS, CYBLACK_APP_INFO, $list_alt208, NIL, $list_alt1176);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, GET_DEFAULT_BASE_CLASS, CYBLACK_APP_INFO_GET_DEFAULT_BASE_CLASS_METHOD);
        methods.methods_incorporate_instance_method(GET_KSB_INFO, CYBLACK_APP_INFO, $list_alt208, NIL, $list_alt1178);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, GET_KSB_INFO, CYBLACK_APP_INFO_GET_KSB_INFO_METHOD);
        methods.methods_incorporate_instance_method(GET_BLACKBOARD_INFO, CYBLACK_APP_INFO, $list_alt6, NIL, $list_alt1180);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, GET_BLACKBOARD_INFO, CYBLACK_APP_INFO_GET_BLACKBOARD_INFO_METHOD);
        methods.methods_incorporate_instance_method(HAS_EXTERNAL_MODULES_P, CYBLACK_APP_INFO, $list_alt6, NIL, $list_alt1184);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, HAS_EXTERNAL_MODULES_P, CYBLACK_APP_INFO_HAS_EXTERNAL_MODULES_P_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_INITIALIZE_METHOD, CYBLACK_APP_INFO, $list_alt6, NIL, $list_alt1187);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, COMPILE_TO_INITIALIZE_METHOD, CYBLACK_APP_INFO_COMPILE_TO_INITIALIZE_METHOD_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_GENERATED_ON_STARTUP_METHOD, CYBLACK_APP_INFO, $list_alt6, NIL, $list_alt1203);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, COMPILE_TO_GENERATED_ON_STARTUP_METHOD, CYBLACK_APP_INFO_COMPILE_TO_GENERATED_ON_STARTUP_METHOD_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_USER_ON_STARTUP_METHOD, CYBLACK_APP_INFO, $list_alt6, NIL, $list_alt1209);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, COMPILE_TO_USER_ON_STARTUP_METHOD, CYBLACK_APP_INFO_COMPILE_TO_USER_ON_STARTUP_METHOD_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_GENERATED_ON_SHUTDOWN_METHOD, CYBLACK_APP_INFO, $list_alt6, NIL, $list_alt1214);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, COMPILE_TO_GENERATED_ON_SHUTDOWN_METHOD, CYBLACK_APP_INFO_COMPILE_TO_GENERATED_ON_SHUTDOWN_METHOD_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_USER_ON_SHUTDOWN_METHOD, CYBLACK_APP_INFO, $list_alt6, NIL, $list_alt1218);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, COMPILE_TO_USER_ON_SHUTDOWN_METHOD, CYBLACK_APP_INFO_COMPILE_TO_USER_ON_SHUTDOWN_METHOD_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_ON_QUIESCENCE_METHOD, CYBLACK_APP_INFO, $list_alt6, NIL, $list_alt1222);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, COMPILE_TO_ON_QUIESCENCE_METHOD, CYBLACK_APP_INFO_COMPILE_TO_ON_QUIESCENCE_METHOD_METHOD);
        methods.methods_incorporate_instance_method(COMPILE_TO_ON_EMPTY_AGENDA_METHOD, CYBLACK_APP_INFO, $list_alt6, NIL, $list_alt1227);
        methods.subloop_register_instance_method(CYBLACK_APP_INFO, COMPILE_TO_ON_EMPTY_AGENDA_METHOD, CYBLACK_APP_INFO_COMPILE_TO_ON_EMPTY_AGENDA_METHOD_METHOD);
        enumerations.enumerations_incorporate_definition(CYBLACK_DEFAPP_OPTION, $list_alt1235);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_EXTENSION = makeSymbol("CYBLACK-DEFAPP-AGENDA-EXTENSION");

    static private final SubLList $list_alt1 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FUTILE-CYCLE-COUNT-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FUTILE-CYCLE-COUNT-INTERNAL"), list(makeSymbol("NEW-COUNT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MAX-FUTILE-CYCLES-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MAX-FUTILE-CYCLES-INTERNAL"), list(makeSymbol("CYCLES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA-TRACE-ON-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-AGENDA-TRACE-ON-INTERNAL"), list(makeSymbol("NEW-VALUE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TERMINATE-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TERMINATE-INTERNAL"), list(makeSymbol("NEW-VALUE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-DEFAPP-AGENDA-EXTENSION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MAX-FUTILE-CYCLES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MAX-FUTILE-CYCLES"), list(makeSymbol("NEW-MAX-FUTILE-CYCLES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COUNT-FUTILE-CYCLE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COUNT-USEFUL-CYCLE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AGENDA-TRACE-ON-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TOGGLE-AGENDA-TRACE-ON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TERMINATE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TERMINATE"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPOSE"), list(makeSymbol("PROPOSAL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol INITIALIZE_QUA_DEFAPP_AGENDA_EXTENSION = makeSymbol("INITIALIZE-QUA-DEFAPP-AGENDA-EXTENSION");

    static private final SubLList $list_alt3 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt4 = list(list(makeSymbol("SET-FUTILE-CYCLE-COUNT-INTERNAL"), makeSymbol("SELF"), ZERO_INTEGER), list(makeSymbol("SET-MAX-FUTILE-CYCLES-INTERNAL"), makeSymbol("SELF"), makeInteger("1000000000")), list(makeSymbol("SET-AGENDA-TRACE-ON-INTERNAL"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol GET_MAX_FUTILE_CYCLES = makeSymbol("GET-MAX-FUTILE-CYCLES");

    static private final SubLList $list_alt6 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt7 = list(list(RET, list(makeSymbol("GET-MAX-FUTILE-CYCLES-INTERNAL"), makeSymbol("SELF"))));

    private static final SubLSymbol SET_MAX_FUTILE_CYCLES = makeSymbol("SET-MAX-FUTILE-CYCLES");

    static private final SubLList $list_alt9 = list(makeSymbol("NEW-MAX-FUTILE-CYCLES"));

    static private final SubLList $list_alt10 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), list(makeSymbol("INTEGERP"), makeSymbol("NEW-MAX-FUTILE-CYCLES")), list(makeSymbol(">="), makeSymbol("NEW-MAX-FUTILE-CYCLES"), ZERO_INTEGER)), makeString("(SET-MAX-FUTILE-CYCLES ~S): ~S is not a valid value.  A non-negative integer was expected."), makeSymbol("SELF"), makeSymbol("NEW-MAX-FUTILE-CYCLES")), list(makeSymbol("SET-MAX-FUTILE-CYCLES-INTERNAL"), makeSymbol("SELF"), makeSymbol("NEW-MAX-FUTILE-CYCLES")), list(RET, makeSymbol("NEW-MAX-FUTILE-CYCLES")));

    private static final SubLSymbol COUNT_FUTILE_CYCLE = makeSymbol("COUNT-FUTILE-CYCLE");

    static private final SubLList $list_alt12 = list(list(makeSymbol("SET-FUTILE-CYCLE-COUNT-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("+"), list(makeSymbol("GET-FUTILE-CYCLE-COUNT-INTERNAL"), makeSymbol("SELF")), ONE_INTEGER)), list(makeSymbol("PWHEN"), list(makeSymbol(">="), list(makeSymbol("GET-FUTILE-CYCLE-COUNT-INTERNAL"), makeSymbol("SELF")), list(makeSymbol("GET-MAX-FUTILE-CYCLES-INTERNAL"), makeSymbol("SELF"))), list(makeSymbol("MUST"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), makeString("(COUNT-FUTILE-CYCLE ~S): Attempted to halt due to too many futile cycles, ~\n       but could not due to lack of an application."), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), list(QUOTE, makeSymbol("HALT"))), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%Halting due to ~S futile cycles."), list(makeSymbol("GET-FUTILE-CYCLE-COUNT-INTERNAL"), makeSymbol("SELF")))), list(RET, list(makeSymbol("GET-FUTILE-CYCLE-COUNT-INTERNAL"), makeSymbol("SELF"))));

    private static final SubLSymbol COUNT_USEFUL_CYCLE = makeSymbol("COUNT-USEFUL-CYCLE");

    static private final SubLList $list_alt14 = list(list(makeSymbol("SET-FUTILE-CYCLE-COUNT-INTERNAL"), makeSymbol("SELF"), ZERO_INTEGER), list(RET, ZERO_INTEGER));

    private static final SubLSymbol AGENDA_TRACE_ON_P = makeSymbol("AGENDA-TRACE-ON-P");

    static private final SubLList $list_alt16 = list(list(RET, list(makeSymbol("GET-AGENDA-TRACE-ON-INTERNAL"), makeSymbol("SELF"))));

    private static final SubLSymbol TOGGLE_AGENDA_TRACE_ON = makeSymbol("TOGGLE-AGENDA-TRACE-ON");

    static private final SubLList $list_alt18 = list(list(makeSymbol("SET-AGENDA-TRACE-ON-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("CNOT"), list(makeSymbol("GET-AGENDA-TRACE-ON-INTERNAL"), makeSymbol("SELF")))), list(RET, list(makeSymbol("GET-AGENDA-TRACE-ON-INTERNAL"), makeSymbol("SELF"))));

    private static final SubLSymbol TERMINATE_P = makeSymbol("TERMINATE-P");

    static private final SubLList $list_alt20 = list(list(RET, list(makeSymbol("GET-TERMINATE-INTERNAL"), makeSymbol("SELF"))));

    private static final SubLSymbol SET_TERMINATE = makeSymbol("SET-TERMINATE");

    static private final SubLList $list_alt22 = list(makeSymbol("NEW-STATE"));

    static private final SubLList $list_alt23 = list(list(makeSymbol("SET-TERMINATE-INTERNAL"), makeSymbol("SELF"), list(makeSymbol("FIF"), makeSymbol("NEW-STATE"), T, NIL)), list(RET, list(makeSymbol("GET-TERMINATE-INTERNAL"), makeSymbol("SELF"))));



    static private final SubLList $list_alt25 = list(makeSymbol("PROPOSAL"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("PWHEN"), list(makeSymbol("AGENDA-TRACE-ON-P"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%Proposing: ~S~%"), makeSymbol("PROPOSAL"))), list(RET, list(makeSymbol("PROPOSE"), makeSymbol("SUPER"), makeSymbol("PROPOSAL"))));



    static private final SubLList $list_alt28 = list(list(makeSymbol("PIF"), list(makeSymbol("GET-TERMINATE-INTERNAL"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF")), list(QUOTE, makeSymbol("HALT"))), list(makeSymbol("PROGN"), list(makeSymbol("PWHEN"), list(makeSymbol("AGENDA-TRACE-ON-P"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-ELEMENT"), list(makeSymbol("PEEK"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("NEXT-ELEMENT"), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%Executing: ~S~%"), makeSymbol("NEXT-ELEMENT"))))), list(makeSymbol("PIF"), list(makeSymbol("="), list(makeSymbol("GET-ELEMENT-COUNT"), makeSymbol("SELF")), ZERO_INTEGER), list(makeSymbol("COUNT-FUTILE-CYCLE"), makeSymbol("SELF")), list(makeSymbol("COUNT-USEFUL-CYCLE"), makeSymbol("SELF"))))), list(RET, list(makeSymbol("EXECUTE"), makeSymbol("SUPER"))));

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE");

    private static final SubLSymbol CYBLACK_BASIC_SIMPLE_AGENDA = makeSymbol("CYBLACK-BASIC-SIMPLE-AGENDA");

    static private final SubLList $list_alt31 = list(makeSymbol("CYBLACK-DEFAPP-AGENDA-EXTENSION"));

    static private final SubLList $list_alt32 = list(new SubLObject[]{ list(makeSymbol("FUTILE-CYCLE-COUNT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MAX-FUTILE-CYCLES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AGENDA-TRACE-ON"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TERMINATE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FUTILE-CYCLE-COUNT-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-FUTILE-CYCLE-COUNT-INTERNAL"), list(makeSymbol("NEW-COUNT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MAX-FUTILE-CYCLES-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MAX-FUTILE-CYCLES-INTERNAL"), list(makeSymbol("CYCLES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA-TRACE-ON-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-AGENDA-TRACE-ON-INTERNAL"), list(makeSymbol("NEW-VALUE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TERMINATE-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TERMINATE-INTERNAL"), list(makeSymbol("NEW-VALUE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-DEFAPP-AGENDA-EXTENSION"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MAX-FUTILE-CYCLES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MAX-FUTILE-CYCLES"), list(makeSymbol("NEW-MAX-FUTILE-CYCLES")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COUNT-FUTILE-CYCLE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COUNT-USEFUL-CYCLE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AGENDA-TRACE-ON-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TOGGLE-AGENDA-TRACE-ON"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TERMINATE-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TERMINATE"), list(makeSymbol("NEW-STATE")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROPOSE"), list(makeSymbol("PROPOSAL")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXECUTE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol MAX_FUTILE_CYCLES = makeSymbol("MAX-FUTILE-CYCLES");

    private static final SubLSymbol FUTILE_CYCLE_COUNT = makeSymbol("FUTILE-CYCLE-COUNT");



    public static final SubLInteger $int$4098 = makeInteger(4098);

    private static final SubLSymbol AGENDA_TRACE_ON = makeSymbol("AGENDA-TRACE-ON");

    public static final SubLInteger $int$4097 = makeInteger(4097);



    static private final SubLString $str_alt40$__Executing___S__ = makeString("~%Executing: ~S~%");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_EXECUTE_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-EXECUTE-METHOD");

    static private final SubLString $str_alt42$__Proposing___S__ = makeString("~%Proposing: ~S~%");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_PROPOSE_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-PROPOSE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_SET_TERMINATE_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-SET-TERMINATE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_TERMINATE_P_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-TERMINATE-P-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_TOGGLE_AGENDA_TRACE_ON_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-TOGGLE-AGENDA-TRACE-ON-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_AGENDA_TRACE_ON_P_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-AGENDA-TRACE-ON-P-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_COUNT_USEFUL_CYCLE_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-COUNT-USEFUL-CYCLE-METHOD");

    static private final SubLString $str_alt49$_COUNT_FUTILE_CYCLE__S___Attempte = makeString("(COUNT-FUTILE-CYCLE ~S): Attempted to halt due to too many futile cycles, ~\n       but could not due to lack of an application.");

    static private final SubLString $str_alt50$__Halting_due_to__S_futile_cycles = makeString("~%Halting due to ~S futile cycles.");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_COUNT_FUTILE_CYCLE_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-COUNT-FUTILE-CYCLE-METHOD");

    static private final SubLString $str_alt52$_SET_MAX_FUTILE_CYCLES__S____S_is = makeString("(SET-MAX-FUTILE-CYCLES ~S): ~S is not a valid value.  A non-negative integer was expected.");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_SET_MAX_FUTILE_CYCLES_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-SET-MAX-FUTILE-CYCLES-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_GET_MAX_FUTILE_CYCLES_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-GET-MAX-FUTILE-CYCLES-METHOD");

    public static final SubLInteger $int$1000000000 = makeInteger("1000000000");

    static private final SubLSymbol $sym56$CYBLACK_DEFAPP_AGENDA_BASE_INITIALIZE_QUA_DEFAPP_AGENDA_EXTENSION = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-INITIALIZE-QUA-DEFAPP-AGENDA-EXTENSION-METHOD");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AGENDA_BASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AGENDA-BASE-CLASS");



















    private static final SubLSymbol QUEUE_PRIORITIZER = makeSymbol("QUEUE-PRIORITIZER");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AGENDA_BASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AGENDA-BASE-INSTANCE");

    private static final SubLSymbol GET_FUTILE_CYCLE_COUNT_INTERNAL = makeSymbol("GET-FUTILE-CYCLE-COUNT-INTERNAL");

    static private final SubLList $list_alt76 = list(makeKeyword("READ-ONLY"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt77 = list(list(RET, makeSymbol("FUTILE-CYCLE-COUNT")));

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_GET_FUTILE_CYCLE_COUNT_INTERNAL_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-GET-FUTILE-CYCLE-COUNT-INTERNAL-METHOD");

    private static final SubLSymbol SET_FUTILE_CYCLE_COUNT_INTERNAL = makeSymbol("SET-FUTILE-CYCLE-COUNT-INTERNAL");

    static private final SubLList $list_alt80 = list(makeSymbol("NEW-COUNT"));

    static private final SubLList $list_alt81 = list(list(makeSymbol("CSETQ"), makeSymbol("FUTILE-CYCLE-COUNT"), makeSymbol("NEW-COUNT")), list(RET, makeSymbol("NEW-COUNT")));

    static private final SubLSymbol $sym82$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-AGENDA-BASE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_SET_FUTILE_CYCLE_COUNT_INTERNAL_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-SET-FUTILE-CYCLE-COUNT-INTERNAL-METHOD");

    private static final SubLSymbol GET_MAX_FUTILE_CYCLES_INTERNAL = makeSymbol("GET-MAX-FUTILE-CYCLES-INTERNAL");

    static private final SubLList $list_alt85 = list(list(RET, makeSymbol("MAX-FUTILE-CYCLES")));

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_GET_MAX_FUTILE_CYCLES_INTERNAL_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-GET-MAX-FUTILE-CYCLES-INTERNAL-METHOD");

    private static final SubLSymbol SET_MAX_FUTILE_CYCLES_INTERNAL = makeSymbol("SET-MAX-FUTILE-CYCLES-INTERNAL");

    static private final SubLList $list_alt88 = list(makeSymbol("CYCLES"));

    static private final SubLList $list_alt89 = list(list(makeSymbol("CSETQ"), makeSymbol("MAX-FUTILE-CYCLES"), makeSymbol("CYCLES")), list(RET, makeSymbol("CYCLES")));

    static private final SubLSymbol $sym90$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-AGENDA-BASE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_SET_MAX_FUTILE_CYCLES_INTERNAL_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-SET-MAX-FUTILE-CYCLES-INTERNAL-METHOD");

    private static final SubLSymbol GET_AGENDA_TRACE_ON_INTERNAL = makeSymbol("GET-AGENDA-TRACE-ON-INTERNAL");

    static private final SubLList $list_alt93 = list(list(RET, makeSymbol("AGENDA-TRACE-ON")));

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_GET_AGENDA_TRACE_ON_INTERNAL_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-GET-AGENDA-TRACE-ON-INTERNAL-METHOD");

    private static final SubLSymbol SET_AGENDA_TRACE_ON_INTERNAL = makeSymbol("SET-AGENDA-TRACE-ON-INTERNAL");

    static private final SubLList $list_alt96 = list(makeSymbol("NEW-VALUE"));

    static private final SubLList $list_alt97 = list(list(makeSymbol("CSETQ"), makeSymbol("AGENDA-TRACE-ON"), makeSymbol("NEW-VALUE")), list(RET, makeSymbol("NEW-VALUE")));

    static private final SubLSymbol $sym98$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-AGENDA-BASE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_SET_AGENDA_TRACE_ON_INTERNAL_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-SET-AGENDA-TRACE-ON-INTERNAL-METHOD");

    private static final SubLSymbol GET_TERMINATE_INTERNAL = makeSymbol("GET-TERMINATE-INTERNAL");

    static private final SubLList $list_alt101 = list(list(RET, makeSymbol("TERMINATE")));

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_GET_TERMINATE_INTERNAL_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-GET-TERMINATE-INTERNAL-METHOD");

    private static final SubLSymbol SET_TERMINATE_INTERNAL = makeSymbol("SET-TERMINATE-INTERNAL");

    static private final SubLList $list_alt104 = list(list(makeSymbol("CSETQ"), makeSymbol("TERMINATE"), makeSymbol("NEW-VALUE")), list(RET, makeSymbol("NEW-VALUE")));

    static private final SubLSymbol $sym105$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AGENDA_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-AGENDA-BASE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_SET_TERMINATE_INTERNAL_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-SET-TERMINATE-INTERNAL-METHOD");



    static private final SubLList $list_alt108 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INITIALIZE-QUA-DEFAPP-AGENDA-EXTENSION"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_BASE_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE");

    private static final SubLSymbol CYBLACK_BASIC_HEURISTIC_AGENDA = makeSymbol("CYBLACK-BASIC-HEURISTIC-AGENDA");

    private static final SubLSymbol CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_EXECUTE_METHOD = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_PROPOSE_METHOD = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-PROPOSE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_TERMINATE_METHOD = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-TERMINATE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_TERMINATE_P_METHOD = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-TERMINATE-P-METHOD");

    static private final SubLSymbol $sym116$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_TOGGLE_AGENDA_TRACE_ON_METHO = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-TOGGLE-AGENDA-TRACE-ON-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_AGENDA_TRACE_ON_P_METHOD = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-AGENDA-TRACE-ON-P-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_COUNT_USEFUL_CYCLE_METHOD = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-COUNT-USEFUL-CYCLE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_COUNT_FUTILE_CYCLE_METHOD = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-COUNT-FUTILE-CYCLE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_MAX_FUTILE_CYCLES_METHOD = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-MAX-FUTILE-CYCLES-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_GET_MAX_FUTILE_CYCLES_METHOD = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-GET-MAX-FUTILE-CYCLES-METHOD");

    static private final SubLSymbol $sym122$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_INITIALIZE_QUA_DEFAPP_AGENDA = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-INITIALIZE-QUA-DEFAPP-AGENDA-EXTENSION-METHOD");

    private static final SubLSymbol HEURISTIC_EVALUATOR_CLASSES = makeSymbol("HEURISTIC-EVALUATOR-CLASSES");

    static private final SubLSymbol $sym124$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-CLASS");



    static private final SubLSymbol $sym126$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-INSTANCE");

    static private final SubLSymbol $sym127$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_GET_FUTILE_CYCLE_COUNT_INTER = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-GET-FUTILE-CYCLE-COUNT-INTERNAL-METHOD");

    static private final SubLSymbol $sym128$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-METHOD");

    static private final SubLSymbol $sym129$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_FUTILE_CYCLE_COUNT_INTER = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-FUTILE-CYCLE-COUNT-INTERNAL-METHOD");

    static private final SubLSymbol $sym130$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_GET_MAX_FUTILE_CYCLES_INTERN = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-GET-MAX-FUTILE-CYCLES-INTERNAL-METHOD");

    static private final SubLSymbol $sym131$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-METHOD");

    static private final SubLSymbol $sym132$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_MAX_FUTILE_CYCLES_INTERN = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-MAX-FUTILE-CYCLES-INTERNAL-METHOD");

    static private final SubLSymbol $sym133$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_GET_AGENDA_TRACE_ON_INTERNAL = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-GET-AGENDA-TRACE-ON-INTERNAL-METHOD");

    static private final SubLSymbol $sym134$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-METHOD");

    static private final SubLSymbol $sym135$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_AGENDA_TRACE_ON_INTERNAL = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-AGENDA-TRACE-ON-INTERNAL-METHOD");

    static private final SubLSymbol $sym136$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_GET_TERMINATE_INTERNAL_METHO = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-GET-TERMINATE-INTERNAL-METHOD");

    static private final SubLSymbol $sym137$OUTER_CATCH_FOR_CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-METHOD");

    static private final SubLSymbol $sym138$CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_SET_TERMINATE_INTERNAL_METHO = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-SET-TERMINATE-INTERNAL-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_HEURISTIC_AGENDA_BASE_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-HEURISTIC-AGENDA-BASE-INITIALIZE-METHOD");

    static private final SubLString $str_alt140$CYBLACK_DEFAPP_AGENDA_GET_MAX_FUT = makeString("CYBLACK-DEFAPP-AGENDA-GET-MAX-FUTILE-CYCLES: ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXTENSION.");

    static private final SubLString $str_alt141$CYBLACK_DEFAPP_AGENDA_SET_MAX_FUT = makeString("CYBLACK-DEFAPP-AGENDA-SET-MAX-FUTILE-CYCLES: ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXTENSION.");

    static private final SubLString $str_alt142$CYBLACK_DEFAPP_AGENDA_COUNT_FUTIL = makeString("CYBLACK-DEFAPP-AGENDA-COUNT-FUTILE-CYCLE: ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXTENSION.");

    static private final SubLString $str_alt143$CYBLACK_DEFAPP_AGENDA_COUNT_USEFU = makeString("CYBLACK-DEFAPP-AGENDA-COUNT-USEFUL-CYCLE: ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXTENSION.");

    static private final SubLString $str_alt144$CYBLACK_DEFAPP_AGENDA_AGENDA_TRAC = makeString("CYBLACK-DEFAPP-AGENDA-AGENDA-TRACE-ON-P: ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXTENSION.");

    static private final SubLString $str_alt145$CYBLACK_DEFAPP_AGENDA_TOGGLE_AGEN = makeString("CYBLACK-DEFAPP-AGENDA-TOGGLE-AGENDA-TRACE-ON: ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXTENSION.");

    static private final SubLString $str_alt146$CYBLACK_DEFAPP_AGENDA_TERMINATE_P = makeString("CYBLACK-DEFAPP-AGENDA-TERMINATE-P: ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXTENSION.");

    static private final SubLString $str_alt147$CYBLACK_DEFAPP_AGENDA_SET_TERMINA = makeString("CYBLACK-DEFAPP-AGENDA-SET-TERMINATE: ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXTENSION.");

    static private final SubLString $str_alt148$CYBLACK_DEFAPP_AGENDA_PROPOSE___S = makeString("CYBLACK-DEFAPP-AGENDA-PROPOSE: ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXTENSION.");

    static private final SubLString $str_alt149$CYBLACK_DEFAPP_AGENDA_EXECUTE___S = makeString("CYBLACK-DEFAPP-AGENDA-EXECUTE: ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXTENSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_BASE = makeSymbol("CYBLACK-DEFAPP-BASE");



    static private final SubLList $list_alt152 = list(new SubLObject[]{ list(makeSymbol("DELAY-STANDARD-INITIALIZATION-P"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TERMINATE"), makeKeyword("BOOLEAN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATED-ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("USER-ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATED-ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("USER-ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TERMINATE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TERMINATE"), list(makeSymbol("NEW-STATE")), makeKeyword("PUBLIC")) });

    public static final SubLInteger $int$4099 = makeInteger(4099);

    private static final SubLSymbol DELAY_STANDARD_INITIALIZATION_P = makeSymbol("DELAY-STANDARD-INITIALIZATION-P");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BASE-CLASS");





















    private static final SubLSymbol ROOT_DATATYPE = makeSymbol("ROOT-DATATYPE");























    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BASE-INSTANCE");

    static private final SubLList $list_alt179 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt180 = list(new SubLObject[]{ list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-APPLICATION*"), makeSymbol("SELF")), list(makeSymbol("SET-CYBLACK-BASIC-APPLICATION-APPLICATION-ID"), makeSymbol("SELF"), list(makeSymbol("CYBLACK-ALLOCATE-APPLICATION-ID"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("INITIALIZE"), makeSymbol("CYBLACK-BASIC-LOCKABLE")), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("INCOMING-MESSAGE-QUEUE"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")))), list(makeSymbol("CSETQ"), makeSymbol("EXTERNAL-MODULE-TABLE"), list(makeSymbol("NEW-EXTERNAL-MODULE-TABLE"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("HALT-STATUS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION-NAME"), makeString("")), list(makeSymbol("CSETQ"), makeSymbol("KNOWLEDGE-SOURCE-BATTERY"), NIL), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD"), NIL), list(makeSymbol("CSETQ"), makeSymbol("AGENDA"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-DICTIONARY"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(QUOTE, makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY")), list(QUOTE, makeSymbol("NEW")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("DATATYPE-DICTIONARY"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("ROOT-DATATYPE-NAME"), makeString("POSTING")), list(makeSymbol("CSETQ"), makeSymbol("ROOT-DATATYPE"), list(makeSymbol("CYBLACK-DECLARE-ROOT-TYPE"), makeSymbol("DATATYPE-DICTIONARY"), makeSymbol("ROOT-DATATYPE-NAME"), list(QUOTE, makeSymbol("CYBLACK-BASIC-POSTING")), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL")))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-SESSION"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(QUOTE, makeSymbol("CYBLACK-SESSION")), list(QUOTE, makeSymbol("NEW")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-SESSION"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("SET-AGENDA-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE"))), list(makeSymbol("SET-BLACKBOARD-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-BASIC-BLACKBOARD"))), list(makeSymbol("SET-PARSER-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-PARSER"))), list(makeSymbol("PUNLESS"), list(makeSymbol("GET-CYBLACK-DEFAPP-BASE-DELAY-STANDARD-INITIALIZATION-P"), makeSymbol("SELF")), list(makeSymbol("STANDARD-INITIALIZATION"), makeSymbol("SELF"))), list(RET, makeSymbol("SELF")) });



    static private final SubLString $str_alt182$ = makeString("");

    private static final SubLSymbol CYBLACK_BASIC_DATATYPE_DICTIONARY = makeSymbol("CYBLACK-BASIC-DATATYPE-DICTIONARY");





    static private final SubLString $$$POSTING = makeString("POSTING");





    private static final SubLSymbol CYBLACK_SESSION = makeSymbol("CYBLACK-SESSION");



    private static final SubLSymbol CYBLACK_PARSER = makeSymbol("CYBLACK-PARSER");

    private static final SubLSymbol CYBLACK_DEFAPP_BASE_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-BASE-INITIALIZE-METHOD");



    static private final SubLList $list_alt194 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_DEFAPP_BASE_GENERATED_ON_STARTUP_METHOD = makeSymbol("CYBLACK-DEFAPP-BASE-GENERATED-ON-STARTUP-METHOD");



    private static final SubLSymbol CYBLACK_DEFAPP_BASE_USER_ON_STARTUP_METHOD = makeSymbol("CYBLACK-DEFAPP-BASE-USER-ON-STARTUP-METHOD");



    static private final SubLList $list_alt199 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GENERATED-ON-STARTUP"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("USER-ON-STARTUP"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_DEFAPP_BASE_ON_STARTUP_METHOD = makeSymbol("CYBLACK-DEFAPP-BASE-ON-STARTUP-METHOD");



    private static final SubLSymbol CYBLACK_DEFAPP_BASE_GENERATED_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-DEFAPP-BASE-GENERATED-ON-SHUTDOWN-METHOD");



    private static final SubLSymbol CYBLACK_DEFAPP_BASE_USER_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-DEFAPP-BASE-USER-ON-SHUTDOWN-METHOD");



    static private final SubLList $list_alt206 = list(list(makeSymbol("ON-SHUTDOWN"), makeSymbol("SUPER")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GENERATED-ON-SHUTDOWN"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("USER-ON-SHUTDOWN"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_DEFAPP_BASE_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-DEFAPP-BASE-ON-SHUTDOWN-METHOD");

    static private final SubLList $list_alt208 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    private static final SubLSymbol CYBLACK_DEFAPP_BASE_TERMINATE_P_METHOD = makeSymbol("CYBLACK-DEFAPP-BASE-TERMINATE-P-METHOD");

    static private final SubLList $list_alt210 = list(list(makeSymbol("CSETQ"), makeSymbol("TERMINATE"), list(makeSymbol("FIF"), makeSymbol("NEW-STATE"), T, NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("AGENDA"), list(makeSymbol("CYBLACK-DEFAPP-AGENDA-EXTENSION-P"), makeSymbol("AGENDA"))), list(makeSymbol("CYBLACK-DEFAPP-AGENDA-SET-TERMINATE"), makeSymbol("AGENDA"), makeSymbol("NEW-STATE"))), list(RET, makeSymbol("TERMINATE")));

    static private final SubLSymbol $sym211$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BASE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_BASE_SET_TERMINATE_METHOD = makeSymbol("CYBLACK-DEFAPP-BASE-SET-TERMINATE-METHOD");

    private static final SubLSymbol CYBLACK_APPLICATION_PROCESS_SCHEDULER = makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER");



    static private final SubLList $list_alt215 = list(list(makeSymbol("APPLICATION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TASK"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PERFORM-TRACE"), list(makeSymbol("PROCESS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-NOTHING-TO-DO"), NIL, makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym216$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_PROCESS_SCHEDULER = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-PROCESS-SCHEDULER-CLASS");









    static private final SubLSymbol $sym221$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_PROCESS_SCHEDULER = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-PROCESS-SCHEDULER-INSTANCE");

    static private final SubLList $list_alt222 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    static private final SubLList $list_alt223 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PRIORITIZER"), makeSymbol("BASIC-DOUBLY-LINKED-QUEUE")), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("PROCESS-QUEUE"), makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER")), makeSymbol("SELF")), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-APPLICATION-PROCESS-SORTER")))), list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("TRACE-P"), makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER")), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_APPLICATION_PROCESS_SORTER = makeSymbol("CYBLACK-APPLICATION-PROCESS-SORTER");

    private static final SubLSymbol CYBLACK_APPLICATION_PROCESS_SCHEDULER_INITIALIZE_METHOD = makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER-INITIALIZE-METHOD");



    static private final SubLList $list_alt227 = list(list(RET, makeSymbol("APPLICATION")));

    private static final SubLSymbol CYBLACK_APPLICATION_PROCESS_SCHEDULER_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER-GET-APPLICATION-METHOD");

    static private final SubLList $list_alt229 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt230 = list(list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CDOLIST"), list(makeSymbol("TASK"), list(makeSymbol("GET-ALL-TASKS"), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-APPLICATION-UNIPROCESS-P"), makeSymbol("TASK")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-APPLICATION-UNIPROCESS")), makeSymbol("TASK"), makeSymbol("NEW-APPLICATION")))), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym231$OUTER_CATCH_FOR_CYBLACK_APPLICATION_PROCESS_SCHEDULER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APPLICATION-PROCESS-SCHEDULER-METHOD");

    private static final SubLSymbol CYBLACK_APPLICATION_PROCESS_SCHEDULER_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt234 = list(makeSymbol("SUBLOOP-PROCESS"));

    static private final SubLList $list_alt235 = list(list(makeSymbol("ADD-TASK"), makeSymbol("SUPER"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SUBLOOP-PROCESS"), list(QUOTE, makeSymbol("SET-APPLICATION")), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(RET, makeSymbol("SUBLOOP-PROCESS")));

    private static final SubLSymbol CYBLACK_APPLICATION_PROCESS_SCHEDULER_ADD_TASK_METHOD = makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER-ADD-TASK-METHOD");

    private static final SubLSymbol PERFORM_TRACE = makeSymbol("PERFORM-TRACE");

    static private final SubLList $list_alt238 = list(makeSymbol("PROCESS"));

    static private final SubLList $list_alt239 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("PROCESS"), list(makeSymbol("CYBLACK-APPLICATION-UNIPROCESS-P"), makeSymbol("PROCESS"))), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~C"), list(makeSymbol("GET-SLOT"), makeSymbol("PROCESS"), list(QUOTE, makeSymbol("SYMBOLIC-REP"))))), list(RET, NIL));

    static private final SubLString $str_alt240$_C = makeString("~C");



    private static final SubLSymbol CYBLACK_APPLICATION_PROCESS_SCHEDULER_PERFORM_TRACE_METHOD = makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER-PERFORM-TRACE-METHOD");

    private static final SubLSymbol ON_NOTHING_TO_DO = makeSymbol("ON-NOTHING-TO-DO");

    static private final SubLList $list_alt244 = list(list(makeSymbol("ON-NOTHING-TO-DO"), makeSymbol("SUPER")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_APPLICATION_PROCESS_SCHEDULER_ON_NOTHING_TO_DO_METHOD = makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER-ON-NOTHING-TO-DO-METHOD");

    private static final SubLSymbol CYBLACK_APPLICATION_UNIPROCESS = makeSymbol("CYBLACK-APPLICATION-UNIPROCESS");



    static private final SubLList $list_alt248 = list(new SubLObject[]{ list(makeSymbol("APPLICATION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROCESS-SCHEDULER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SYMBOLIC-REP"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROCESS-SCHEDULER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROCESS-SCHEDULER"), list(makeSymbol("NEW-PROCESS-SCHEDULER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PRIORITY"), NIL, makeKeyword("PUBLIC")) });



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_UNIPROCESS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-UNIPROCESS-CLASS");







    static private final SubLSymbol $sym254$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_UNIPROCESS_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-UNIPROCESS-INSTANCE");

    static private final SubLList $list_alt255 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PROCESS-SCHEDULER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-REP"), CHAR_question), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym256$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APPLICATION-UNIPROCESS-METHOD");

    private static final SubLSymbol CYBLACK_APPLICATION_UNIPROCESS_INITIALIZE_METHOD = makeSymbol("CYBLACK-APPLICATION-UNIPROCESS-INITIALIZE-METHOD");



    static private final SubLList $list_alt259 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt260 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-APPLICATION-UNIPROCESS: ~S, ~S>"), makeSymbol("NAME"), makeSymbol("STATUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym261$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APPLICATION-UNIPROCESS-METHOD");

    static private final SubLString $str_alt262$__CYBLACK_APPLICATION_UNIPROCESS_ = makeString("#<CYBLACK-APPLICATION-UNIPROCESS: ~S, ~S>");

    private static final SubLSymbol CYBLACK_APPLICATION_UNIPROCESS_PRINT_METHOD = makeSymbol("CYBLACK-APPLICATION-UNIPROCESS-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_APPLICATION_UNIPROCESS_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-APPLICATION-UNIPROCESS-GET-APPLICATION-METHOD");

    static private final SubLList $list_alt265 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-UNIPROCESS-DEFAPP-BASE."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("PWHEN"), makeSymbol("APPLICATION"), list(makeSymbol("SET-PROCESS-SCHEDULER"), makeSymbol("SELF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROCESS-SCHEDULER"), makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE")), makeSymbol("APPLICATION")))), list(RET, makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym266$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APPLICATION-UNIPROCESS-METHOD");

    static private final SubLString $str_alt267$_SET_APPLICATION__S____S_is_not_a = makeString("(SET-APPLICATION ~S): ~S is not an instance of CYBLACK-UNIPROCESS-DEFAPP-BASE.");

    private static final SubLSymbol CYBLACK_APPLICATION_UNIPROCESS_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-APPLICATION-UNIPROCESS-SET-APPLICATION-METHOD");

    private static final SubLSymbol GET_PROCESS_SCHEDULER = makeSymbol("GET-PROCESS-SCHEDULER");

    static private final SubLList $list_alt270 = list(list(makeSymbol("PIF"), makeSymbol("PROCESS-SCHEDULER"), list(RET, makeSymbol("PROCESS-SCHEDULER")), list(RET, list(makeSymbol("FIF"), makeSymbol("APPLICATION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-PROCESS-SCHEDULER"), makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE")), makeSymbol("APPLICATION")), NIL))));

    private static final SubLSymbol CYBLACK_APPLICATION_UNIPROCESS_GET_PROCESS_SCHEDULER_METHOD = makeSymbol("CYBLACK-APPLICATION-UNIPROCESS-GET-PROCESS-SCHEDULER-METHOD");

    private static final SubLSymbol SET_PROCESS_SCHEDULER = makeSymbol("SET-PROCESS-SCHEDULER");

    static private final SubLList $list_alt273 = list(makeSymbol("NEW-PROCESS-SCHEDULER"));

    static private final SubLList $list_alt274 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PROCESS-SCHEDULER")), list(makeSymbol("BASIC-MULTI-TASK-SCHEDULER-P"), makeSymbol("NEW-PROCESS-SCHEDULER"))), makeString("(SET-PROCESS-SCHEDULER ~S): ~S is not an instance of BASIC-MULTI-TASK-SCHEDULER."), makeSymbol("SELF"), makeSymbol("NEW-PROCESS-SCHEDULER")), list(makeSymbol("CSETQ"), makeSymbol("PROCESS-SCHEDULER"), makeSymbol("NEW-PROCESS-SCHEDULER")), list(RET, makeSymbol("NEW-PROCESS-SCHEDULER")));

    static private final SubLSymbol $sym275$OUTER_CATCH_FOR_CYBLACK_APPLICATION_UNIPROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APPLICATION-UNIPROCESS-METHOD");

    static private final SubLString $str_alt276$_SET_PROCESS_SCHEDULER__S____S_is = makeString("(SET-PROCESS-SCHEDULER ~S): ~S is not an instance of BASIC-MULTI-TASK-SCHEDULER.");

    private static final SubLSymbol CYBLACK_APPLICATION_UNIPROCESS_SET_PROCESS_SCHEDULER_METHOD = makeSymbol("CYBLACK-APPLICATION-UNIPROCESS-SET-PROCESS-SCHEDULER-METHOD");

    private static final SubLSymbol GET_PRIORITY = makeSymbol("GET-PRIORITY");

    static private final SubLList $list_alt279 = list(list(RET, list(makeSymbol("*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("NOTHING-TO-DO?"))), ZERO_INTEGER, ONE_INTEGER), list(makeSymbol("GET-PRIORITY"), makeSymbol("SUPER")))));

    static private final SubLSymbol $sym280$NOTHING_TO_DO_ = makeSymbol("NOTHING-TO-DO?");

    private static final SubLSymbol CYBLACK_APPLICATION_UNIPROCESS_GET_PRIORITY_METHOD = makeSymbol("CYBLACK-APPLICATION-UNIPROCESS-GET-PRIORITY-METHOD");

    private static final SubLSymbol BASIC_QUEUE_SIMPLE_SORTER = makeSymbol("BASIC-QUEUE-SIMPLE-SORTER");

    static private final SubLList $list_alt283 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));

    static private final SubLSymbol $sym284$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_PROCESS_SORTER_CL = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-PROCESS-SORTER-CLASS");



    private static final SubLSymbol ELEMENT_KEY_FUNCTION = makeSymbol("ELEMENT-KEY-FUNCTION");

    static private final SubLSymbol $sym287$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APPLICATION_PROCESS_SORTER_IN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APPLICATION-PROCESS-SORTER-INSTANCE");

    static private final SubLList $list_alt288 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SORT-PREDICATE"), list(makeSymbol("FUNCTION"), makeSymbol(">"))), list(makeSymbol("CSETQ"), makeSymbol("ELEMENT-KEY-FUNCTION"), list(makeSymbol("RESOLVE-METHOD"), list(QUOTE, makeSymbol("GET-PRIORITY")), list(QUOTE, makeSymbol("CYBLACK-APPLICATION-UNIPROCESS")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym289$OUTER_CATCH_FOR_CYBLACK_APPLICATION_PROCESS_SORTER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APPLICATION-PROCESS-SORTER-METHOD");

    static private final SubLSymbol $sym290$_ = makeSymbol(">");

    private static final SubLSymbol CYBLACK_APPLICATION_PROCESS_SORTER_INITIALIZE_METHOD = makeSymbol("CYBLACK-APPLICATION-PROCESS-SORTER-INITIALIZE-METHOD");

    static private final SubLList $list_alt292 = list(makeKeyword("UNINITIALIZED"), makeKeyword("STARTUP"), makeKeyword("PROCESSING"), makeKeyword("SHUTDOWN"));

    private static final SubLSymbol CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE = makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE");

    static private final SubLString $str_alt294$_S___S_is_not_a_member_of_the__S_ = makeString("~S: ~S is not a member of the ~S enumeration.");

    private static final SubLSymbol ENCODE_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE = makeSymbol("ENCODE-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE");

    static private final SubLString $str_alt296$_S___S_is_not_a_valid_encoding_of = makeString("~S: ~S is not a valid encoding of the ~S enumeration.");

    private static final SubLSymbol DECODE_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE = makeSymbol("DECODE-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE");

    static private final SubLString $str_alt298$_S___S_was_expected_to_be_a_membe = makeString("~S: ~S was expected to be a member of the enumeration ~S.");

    private static final SubLSymbol CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_STAGE_TYPE_P = makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE-P");

    private static final SubLSymbol CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP = makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP");

    static private final SubLList $list_alt301 = list(new SubLObject[]{ list(makeSymbol("PROCESSING-STAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AGENDA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROCESSING-STAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROCESSING-STAGE"), list(makeSymbol("NEW-PROCESSING-STAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTHING-TO-DO?"), NIL, makeKeyword("PUBLIC")) });



    static private final SubLSymbol $sym303$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_APPLICATION_MAIN_L = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-CLASS");

    static private final SubLSymbol $sym304$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_APPLICATION_MAIN_L = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-INSTANCE");

    static private final SubLList $list_alt305 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), makeInteger(100)), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("AGENDA"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-REP"), CHAR_M), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym306$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-METHOD");





    private static final SubLSymbol CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_INITIALIZE_METHOD = makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-INITIALIZE-METHOD");

    static private final SubLList $list_alt310 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP: ~S, ~S>"), makeSymbol("NAME"), makeSymbol("STATUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym311$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-METHOD");

    static private final SubLString $str_alt312$__CYBLACK_UNIPROCESS_APPLICATION_ = makeString("#<CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP: ~S, ~S>");

    private static final SubLSymbol CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_PRINT_METHOD = makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-PRINT-METHOD");

    private static final SubLSymbol GET_PROCESSING_STAGE = makeSymbol("GET-PROCESSING-STAGE");

    static private final SubLList $list_alt315 = list(list(RET, makeSymbol("PROCESSING-STAGE")));

    static private final SubLSymbol $sym316$CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_GET_PROCESSING_STAGE_MET = makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-GET-PROCESSING-STAGE-METHOD");

    private static final SubLSymbol SET_PROCESSING_STAGE = makeSymbol("SET-PROCESSING-STAGE");

    static private final SubLList $list_alt318 = list(makeSymbol("NEW-PROCESSING-STAGE"));

    static private final SubLList $list_alt319 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE-P"), makeSymbol("NEW-PROCESSING-STAGE")), makeString("(SET-PROCESSING-STAGE ~S): ~S is not a member of the ~\n     CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-PROCESSING-STAGE")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeSymbol("NEW-PROCESSING-STAGE")), list(RET, makeSymbol("NEW-PROCESSING-STAGE")));

    static private final SubLSymbol $sym320$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-METHOD");

    static private final SubLString $str_alt321$_SET_PROCESSING_STAGE__S____S_is_ = makeString("(SET-PROCESSING-STAGE ~S): ~S is not a member of the ~\n     CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-STAGE-TYPE enumeration.");

    static private final SubLSymbol $sym322$CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_SET_PROCESSING_STAGE_MET = makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-SET-PROCESSING-STAGE-METHOD");



    static private final SubLList $list_alt324 = list(list(makeSymbol("PWHEN"), makeSymbol("AGENDA"), list(RET, makeSymbol("AGENDA"))), list(makeSymbol("PWHEN"), makeSymbol("APPLICATION"), list(makeSymbol("CSETQ"), makeSymbol("AGENDA"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-AGENDA"), makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE")), makeSymbol("APPLICATION")))), list(RET, makeSymbol("AGENDA")));

    static private final SubLSymbol $sym325$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-METHOD");

    private static final SubLSymbol CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_GET_AGENDA_METHOD = makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-GET-AGENDA-METHOD");

    private static final SubLSymbol RUN_INTERNAL = makeSymbol("RUN-INTERNAL");

    static private final SubLList $list_alt328 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("PCASE"), makeSymbol("PROCESSING-STAGE"), list(makeKeyword("UNINITIALIZED"), list(makeSymbol("CYBLACK-FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%Running Application.")), list(makeSymbol("CYBLACK-RESET-POSTING-MANAGEMENT")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("STARTUP"))), list(makeKeyword("STARTUP"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("ON-STARTUP"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("AFTER-STARTUP"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-AGENDA"), makeSymbol("SELF")), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("ON-EMPTY-AGENDA")))), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("PROCESSING"))), list(makeKeyword("PROCESSING"), list(makeSymbol("PIF"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("HALTED-P"), makeSymbol("CYBLACK-BASIC-APPLICATION")), makeSymbol("APPLICATION")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("SHUTDOWN")), list(makeSymbol("PROGN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("BEFORE-AGENDA-EXECUTE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-AGENDA"), makeSymbol("SELF")), list(QUOTE, makeSymbol("EXECUTE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("AFTER-AGENDA-EXECUTE"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-AGENDA"), makeSymbol("SELF")), list(QUOTE, makeSymbol("EMPTY-P"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("ON-EMPTY-AGENDA"))))))), list(makeKeyword("SHUTDOWN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("ON-SHUTDOWN"))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), makeKeyword("TERMINATED")))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym329$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-METHOD");

    static private final SubLString $str_alt330$__Running_Application_ = makeString("~%Running Application.");

    private static final SubLSymbol $STARTUP = makeKeyword("STARTUP");







    private static final SubLSymbol $PROCESSING = makeKeyword("PROCESSING");



    private static final SubLSymbol BEFORE_AGENDA_EXECUTE = makeSymbol("BEFORE-AGENDA-EXECUTE");

    private static final SubLSymbol AFTER_AGENDA_EXECUTE = makeSymbol("AFTER-AGENDA-EXECUTE");



    private static final SubLSymbol CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_RUN_INTERNAL_METHOD = makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-RUN-INTERNAL-METHOD");

    static private final SubLList $list_alt341 = list(list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-AGENDA"), makeSymbol("SELF")), list(QUOTE, makeSymbol("EMPTY-P")))));

    static private final SubLSymbol $sym342$CYBLACK_UNIPROCESS_APPLICATION_MAIN_LOOP_NOTHING_TO_DO__METHOD = makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP-NOTHING-TO-DO?-METHOD");

    static private final SubLList $list_alt343 = list(makeKeyword("UNINITIALIZED"), makeKeyword("PROCESSING"), makeKeyword("TERMINATED"));

    private static final SubLSymbol CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE = makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE = makeSymbol("ENCODE-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE = makeSymbol("DECODE-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE");

    private static final SubLSymbol CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_STAGE_TYPE_P = makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE-P");

    private static final SubLSymbol CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS = makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS");

    static private final SubLList $list_alt349 = list(list(makeSymbol("PROCESSING-STAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROCESSING-STAGE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROCESSING-STAGE"), list(makeSymbol("NEW-PROCESSING-STAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN-INTERNAL"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTHING-TO-DO?"), NIL, makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym350$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-CLASS");

    static private final SubLSymbol $sym351$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-INSTANCE");

    static private final SubLList $list_alt352 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), makeInteger(110)), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-REP"), CHAR_O), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym353$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-METHOD");

    public static final SubLInteger $int$110 = makeInteger(110);

    private static final SubLSymbol CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_INITIALIZE_METHOD = makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-INITIALIZE-METHOD");

    static private final SubLList $list_alt356 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS: ~S, ~S>"), makeSymbol("NAME"), makeSymbol("STATUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym357$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-METHOD");

    static private final SubLString $str_alt358$__CYBLACK_SERVER_OUTPUT_INCREMENT = makeString("#<CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS: ~S, ~S>");

    private static final SubLSymbol CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_PRINT_METHOD = makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-PRINT-METHOD");

    static private final SubLSymbol $sym360$CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_GET_PROCESSING_STAGE_METH = makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-GET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt361 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE-P"), makeSymbol("NEW-PROCESSING-STAGE")), makeString("(SET-PROCESSING-STAGE ~S): ~S is not a member of the ~\n     CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-PROCESSING-STAGE")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeSymbol("NEW-PROCESSING-STAGE")), list(RET, makeSymbol("NEW-PROCESSING-STAGE")));

    static private final SubLSymbol $sym362$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-METHOD");

    static private final SubLString $str_alt363$_SET_PROCESSING_STAGE__S____S_is_ = makeString("(SET-PROCESSING-STAGE ~S): ~S is not a member of the ~\n     CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-STAGE-TYPE enumeration.");

    static private final SubLSymbol $sym364$CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_SET_PROCESSING_STAGE_METH = makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-SET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt365 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("PROCESSING"))), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-SERVER-PROCESS-TERMINATE-P")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED")), list(RET, makeKeyword("TERMINATED"))), list(makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT")), list(RET, NIL));

    static private final SubLSymbol $sym366$OUTER_CATCH_FOR_CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-METHOD");

    private static final SubLSymbol CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_RUN_INTERNAL_METHOD = makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-RUN-INTERNAL-METHOD");

    static private final SubLList $list_alt368 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PORT-MANAGER"), makeSymbol("*CYBLACK-OUTPUT-LOOP-CURRENT-PORT-MANAGER*")), list(makeSymbol("OUTGOING-MESSAGE-QUEUE"), list(makeSymbol("CYBLACK-PORT-MANAGER-GET-OUTGOING-QUEUE-METHOD"), makeSymbol("PORT-MANAGER")))), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("OUTGOING-MESSAGE-QUEUE")))));

    static private final SubLSymbol $sym369$CYBLACK_SERVER_OUTPUT_INCREMENT_PROCESS_NOTHING_TO_DO__METHOD = makeSymbol("CYBLACK-SERVER-OUTPUT-INCREMENT-PROCESS-NOTHING-TO-DO?-METHOD");

    private static final SubLSymbol CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE = makeSymbol("CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE = makeSymbol("ENCODE-CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE = makeSymbol("DECODE-CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE");

    private static final SubLSymbol CYBLACK_SERVER_COMMAND_PROCESS_STAGE_TYPE_P = makeSymbol("CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE-P");

    private static final SubLSymbol CYBLACK_SERVER_COMMAND_PROCESS = makeSymbol("CYBLACK-SERVER-COMMAND-PROCESS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERVER_COMMAND_PROCESS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERVER-COMMAND-PROCESS-CLASS");

    static private final SubLSymbol $sym376$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_SERVER_COMMAND_PROCESS_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-SERVER-COMMAND-PROCESS-INSTANCE");

    static private final SubLList $list_alt377 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), makeInteger(103)), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-REP"), CHAR_S), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym378$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SERVER-COMMAND-PROCESS-METHOD");

    public static final SubLInteger $int$103 = makeInteger(103);

    private static final SubLSymbol CYBLACK_SERVER_COMMAND_PROCESS_INITIALIZE_METHOD = makeSymbol("CYBLACK-SERVER-COMMAND-PROCESS-INITIALIZE-METHOD");

    static private final SubLList $list_alt381 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-SERVER-COMMAND-PROCESS: ~S, ~S>"), makeSymbol("NAME"), makeSymbol("STATUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym382$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SERVER-COMMAND-PROCESS-METHOD");

    static private final SubLString $str_alt383$__CYBLACK_SERVER_COMMAND_PROCESS_ = makeString("#<CYBLACK-SERVER-COMMAND-PROCESS: ~S, ~S>");

    private static final SubLSymbol CYBLACK_SERVER_COMMAND_PROCESS_PRINT_METHOD = makeSymbol("CYBLACK-SERVER-COMMAND-PROCESS-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_SERVER_COMMAND_PROCESS_GET_PROCESSING_STAGE_METHOD = makeSymbol("CYBLACK-SERVER-COMMAND-PROCESS-GET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt386 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE-P"), makeSymbol("NEW-PROCESSING-STAGE")), makeString("(SET-PROCESSING-STAGE ~S): ~S is not a member of the ~\n     CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-PROCESSING-STAGE")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeSymbol("NEW-PROCESSING-STAGE")), list(RET, makeSymbol("NEW-PROCESSING-STAGE")));

    static private final SubLSymbol $sym387$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SERVER-COMMAND-PROCESS-METHOD");

    static private final SubLString $str_alt388$_SET_PROCESSING_STAGE__S____S_is_ = makeString("(SET-PROCESSING-STAGE ~S): ~S is not a member of the ~\n     CYBLACK-SERVER-COMMAND-PROCESS-STAGE-TYPE enumeration.");

    private static final SubLSymbol CYBLACK_SERVER_COMMAND_PROCESS_SET_PROCESSING_STAGE_METHOD = makeSymbol("CYBLACK-SERVER-COMMAND-PROCESS-SET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt390 = list(list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED")), list(RET, makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("PROCESSING"))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), makeSymbol("*VIRB3-SERVER-PROCESS-TERMINATE*"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("HALTED-P")))), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED")), list(RET, makeKeyword("TERMINATED"))), list(makeSymbol("CYBLACK-EXECUTE-SERVER-COMMANDS")), list(RET, NIL));

    static private final SubLSymbol $sym391$OUTER_CATCH_FOR_CYBLACK_SERVER_COMMAND_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-SERVER-COMMAND-PROCESS-METHOD");

    private static final SubLSymbol CYBLACK_SERVER_COMMAND_PROCESS_RUN_INTERNAL_METHOD = makeSymbol("CYBLACK-SERVER-COMMAND-PROCESS-RUN-INTERNAL-METHOD");

    static private final SubLList $list_alt393 = list(list(RET, list(makeSymbol("CAND"), makeSymbol("*CYBLACK-SERVER-INITIALIZED*"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("EMPTY-P"), makeSymbol("ASYNCH-BASIC-DOUBLY-LINKED-QUEUE")), makeSymbol("*VIRB3-COMMAND-QUEUE*")))));

    static private final SubLSymbol $sym394$CYBLACK_SERVER_COMMAND_PROCESS_NOTHING_TO_DO__METHOD = makeSymbol("CYBLACK-SERVER-COMMAND-PROCESS-NOTHING-TO-DO?-METHOD");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE = makeSymbol("CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE = makeSymbol("ENCODE-CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE = makeSymbol("DECODE-CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PROCESS_STAGE_TYPE_P = makeSymbol("CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE-P");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PROCESS = makeSymbol("CYBLACK-PORT-MANAGER-PROCESS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_MANAGER_PROCESS_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-MANAGER-PROCESS-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_PORT_MANAGER_PROCESS_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-PORT-MANAGER-PROCESS-INSTANCE");

    static private final SubLList $list_alt402 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), makeInteger(25)), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-REP"), CHAR_P), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym403$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-PROCESS-METHOD");

    public static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PROCESS_INITIALIZE_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-PROCESS-INITIALIZE-METHOD");

    static private final SubLList $list_alt406 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-PORT-MANAGER-PROCESS: ~S, ~S>"), makeSymbol("NAME"), makeSymbol("STATUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym407$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-PROCESS-METHOD");

    static private final SubLString $str_alt408$__CYBLACK_PORT_MANAGER_PROCESS___ = makeString("#<CYBLACK-PORT-MANAGER-PROCESS: ~S, ~S>");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PROCESS_PRINT_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-PROCESS-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PROCESS_GET_PROCESSING_STAGE_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-PROCESS-GET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt411 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE-P"), makeSymbol("NEW-PROCESSING-STAGE")), makeString("(SET-PROCESSING-STAGE ~S): ~S is not a member of the ~\n     CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-PROCESSING-STAGE")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeSymbol("NEW-PROCESSING-STAGE")), list(RET, makeSymbol("NEW-PROCESSING-STAGE")));

    static private final SubLSymbol $sym412$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-PROCESS-METHOD");

    static private final SubLString $str_alt413$_SET_PROCESSING_STAGE__S____S_is_ = makeString("(SET-PROCESSING-STAGE ~S): ~S is not a member of the ~\n     CYBLACK-PORT-MANAGER-PROCESS-STAGE-TYPE enumeration.");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PROCESS_SET_PROCESSING_STAGE_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-PROCESS-SET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt415 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("CYBLACK-PORT-MANAGER-CONTINUE-P")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("HALTED-P"))), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED")), list(RET, makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("PROCESSING"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("PROCESSING")), list(makeSymbol("CYBLACK-PORT-MANAGER-INCREMENT"))), list(RET, NIL));

    static private final SubLSymbol $sym416$OUTER_CATCH_FOR_CYBLACK_PORT_MANAGER_PROCESS_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-PORT-MANAGER-PROCESS-METHOD");

    private static final SubLSymbol CYBLACK_PORT_MANAGER_PROCESS_RUN_INTERNAL_METHOD = makeSymbol("CYBLACK-PORT-MANAGER-PROCESS-RUN-INTERNAL-METHOD");

    static private final SubLList $list_alt418 = list(list(RET, list(makeSymbol("CYBLACK-COMMANDS-TO-PROCESS-P"))));

    static private final SubLSymbol $sym419$CYBLACK_PORT_MANAGER_PROCESS_NOTHING_TO_DO__METHOD = makeSymbol("CYBLACK-PORT-MANAGER-PROCESS-NOTHING-TO-DO?-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE = makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE = makeSymbol("ENCODE-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE = makeSymbol("DECODE-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_TYPE_P = makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE-P");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT = makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT");

    static private final SubLSymbol $sym425$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-CLASS");

    static private final SubLSymbol $sym426$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-INSTANCE");

    static private final SubLList $list_alt427 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), makeInteger(50)), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-REP"), CHAR_I), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym428$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-METHOD");

    public static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_INITIALIZE_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-INITIALIZE-METHOD");

    static private final SubLList $list_alt431 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT ~S, ~S>"), makeSymbol("NAME"), makeSymbol("STATUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym432$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-METHOD");

    static private final SubLString $str_alt433$__CYBLACK_IO_STREAM_MONITOR_OUTPU = makeString("#<CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT ~S, ~S>");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_PRINT_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-PRINT-METHOD");

    static private final SubLSymbol $sym435$CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_GET_PROCESSING_STAGE_M = makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-GET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt436 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-TYPE-P"), makeSymbol("NEW-PROCESSING-STAGE")), makeString("(SET-PROCESSING-STAGE ~S): ~S is not an member of the ~\n     cyblack-io-stream-monitor-output-increment-type enumeration."), makeSymbol("SELF"), makeSymbol("NEW-PROCESSING-STAGE")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeSymbol("NEW-PROCESSING-STAGE")), list(RET, makeSymbol("NEW-PROCESSING-STAGE")));

    static private final SubLSymbol $sym437$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-METHOD");

    static private final SubLString $str_alt438$_SET_PROCESSING_STAGE__S____S_is_ = makeString("(SET-PROCESSING-STAGE ~S): ~S is not an member of the ~\n     cyblack-io-stream-monitor-output-increment-type enumeration.");

    static private final SubLSymbol $sym439$CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_SET_PROCESSING_STAGE_M = makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-SET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt440 = list(list(makeSymbol("PUNLESS"), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*"), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("HALTED-P"))), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED")), list(RET, makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("PROCESSING"))), list(makeSymbol("CLET"), list(list(makeSymbol("OUTPUT"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("IS-ACTIVE"))), list(makeSymbol("CSETQ"), makeSymbol("OUTPUT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("GET-OUTGOING-RAW")))), list(makeSymbol("PWHEN"), makeSymbol("OUTPUT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("WRITE-RAW")), makeSymbol("OUTPUT"))))), list(RET, NIL));

    static private final SubLSymbol $sym441$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-METHOD");



    private static final SubLSymbol GET_OUTGOING_RAW = makeSymbol("GET-OUTGOING-RAW");

    private static final SubLSymbol WRITE_RAW = makeSymbol("WRITE-RAW");

    private static final SubLSymbol CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_RUN_INTERNAL_METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-RUN-INTERNAL-METHOD");

    static private final SubLList $list_alt446 = list(list(RET, list(makeSymbol("CAND"), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("OUTGOING-POSTING-P")))))));



    static private final SubLSymbol $sym448$CYBLACK_IO_STREAM_MONITOR_OUTPUT_INCREMENT_NOTHING_TO_DO__METHOD = makeSymbol("CYBLACK-IO-STREAM-MONITOR-OUTPUT-INCREMENT-NOTHING-TO-DO?-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE = makeSymbol("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE = makeSymbol("ENCODE-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE = makeSymbol("DECODE-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE");

    private static final SubLSymbol CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_TYPE_P = makeSymbol("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE-P");

    private static final SubLSymbol CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT = makeSymbol("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT");

    static private final SubLSymbol $sym454$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-CLASS");

    static private final SubLSymbol $sym455$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-INSTANCE");

    static private final SubLList $list_alt456 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), makeInteger(110)), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-REP"), CHAR_2), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym457$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-METHOD");

    static private final SubLSymbol $sym458$CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_INITIALIZE_METHO = makeSymbol("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-INITIALIZE-METHOD");

    static private final SubLList $list_alt459 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT ~S, ~S>"), makeSymbol("NAME"), makeSymbol("STATUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym460$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-METHOD");

    static private final SubLString $str_alt461$__CYBLACK_IO_STREAM_INTERNAL_TO_E = makeString("#<CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT ~S, ~S>");

    private static final SubLSymbol CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_PRINT_METHOD = makeSymbol("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-PRINT-METHOD");

    static private final SubLSymbol $sym463$CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_GET_PROCESSING_S = makeSymbol("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-GET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt464 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE-P"), makeSymbol("NEW-PROCESSING-STAGE")), makeString("(SET-PROCESSING-STAGE ~S): ~S is not an element of the ~\n     CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-PROCESSING-STAGE")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeSymbol("NEW-PROCESSING-STAGE")), list(RET, makeSymbol("NEW-PROCESSING-STAGE")));

    static private final SubLSymbol $sym465$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-METHOD");

    static private final SubLString $str_alt466$_SET_PROCESSING_STAGE__S____S_is_ = makeString("(SET-PROCESSING-STAGE ~S): ~S is not an element of the ~\n     CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-TYPE enumeration.");

    static private final SubLSymbol $sym467$CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_SET_PROCESSING_S = makeSymbol("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-SET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt468 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("HALTED-P"))), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED")), list(RET, makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("PROCESSING"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("INTERNAL-TO-EXTERNAL-INCREMENT"))), list(RET, NIL));

    static private final SubLSymbol $sym469$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-METHOD");

    private static final SubLSymbol INTERNAL_TO_EXTERNAL_INCREMENT = makeSymbol("INTERNAL-TO-EXTERNAL-INCREMENT");

    static private final SubLSymbol $sym471$CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_RUN_INTERNAL_MET = makeSymbol("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-RUN-INTERNAL-METHOD");

    static private final SubLList $list_alt472 = list(list(RET, list(makeSymbol("CAND"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("OUTGOING-POSTING-P")))))));

    static private final SubLSymbol $sym473$CYBLACK_IO_STREAM_INTERNAL_TO_EXTERNAL_INCREMENT_NOTHING_TO_DO__M = makeSymbol("CYBLACK-IO-STREAM-INTERNAL-TO-EXTERNAL-INCREMENT-NOTHING-TO-DO?-METHOD");

    private static final SubLSymbol CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE = makeSymbol("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE = makeSymbol("ENCODE-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE = makeSymbol("DECODE-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE");

    private static final SubLSymbol CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_TYPE_P = makeSymbol("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE-P");

    private static final SubLSymbol CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT = makeSymbol("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT");

    static private final SubLSymbol $sym479$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-CLASS");

    static private final SubLSymbol $sym480$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-INSTANCE");

    static private final SubLList $list_alt481 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), makeInteger(110)), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-REP"), CHAR_1), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym482$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-METHOD");

    static private final SubLSymbol $sym483$CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_INITIALIZE_METHO = makeSymbol("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-INITIALIZE-METHOD");

    static private final SubLList $list_alt484 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT ~S, ~S>"), makeSymbol("NAME"), makeSymbol("STATUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym485$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-METHOD");

    static private final SubLString $str_alt486$__CYBLACK_IO_STREAM_EXTERNAL_TO_I = makeString("#<CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT ~S, ~S>");

    private static final SubLSymbol CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_PRINT_METHOD = makeSymbol("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-PRINT-METHOD");

    static private final SubLSymbol $sym488$CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_GET_PROCESSING_S = makeSymbol("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-GET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt489 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE-P"), makeSymbol("NEW-PROCESSING-STAGE")), makeString("(SET-PROCESSING-STAGE ~S): ~S is not an element of the ~\n     CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-PROCESSING-STAGE")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeSymbol("NEW-PROCESSING-STAGE")), list(RET, makeSymbol("NEW-PROCESSING-STAGE")));

    static private final SubLSymbol $sym490$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-METHOD");

    static private final SubLString $str_alt491$_SET_PROCESSING_STAGE__S____S_is_ = makeString("(SET-PROCESSING-STAGE ~S): ~S is not an element of the ~\n     CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-TYPE enumeration.");

    static private final SubLSymbol $sym492$CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_SET_PROCESSING_S = makeSymbol("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-SET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt493 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("HALTED-P"))), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED")), list(RET, makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("PROCESSING"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("EXTERNAL-TO-INTERNAL-INCREMENT"))), list(RET, NIL));

    static private final SubLSymbol $sym494$OUTER_CATCH_FOR_CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_ = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-METHOD");

    private static final SubLSymbol EXTERNAL_TO_INTERNAL_INCREMENT = makeSymbol("EXTERNAL-TO-INTERNAL-INCREMENT");

    static private final SubLSymbol $sym496$CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_RUN_INTERNAL_MET = makeSymbol("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-RUN-INTERNAL-METHOD");

    static private final SubLList $list_alt497 = list(list(RET, list(makeSymbol("CAND"), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(makeSymbol("COR"), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("INCOMING-RAW-P")))), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("IS-ACTIVE"))))))));

    private static final SubLSymbol INCOMING_RAW_P = makeSymbol("INCOMING-RAW-P");

    static private final SubLSymbol $sym499$CYBLACK_IO_STREAM_EXTERNAL_TO_INTERNAL_INCREMENT_NOTHING_TO_DO__M = makeSymbol("CYBLACK-IO-STREAM-EXTERNAL-TO-INTERNAL-INCREMENT-NOTHING-TO-DO?-METHOD");

    private static final SubLSymbol CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE = makeSymbol("CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE = makeSymbol("ENCODE-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE = makeSymbol("DECODE-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE");

    private static final SubLSymbol CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_TYPE_P = makeSymbol("CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE-P");

    private static final SubLSymbol CYBLACK_BLACKBOARD_CONNECTION_INCREMENT = makeSymbol("CYBLACK-BLACKBOARD-CONNECTION-INCREMENT");

    static private final SubLSymbol $sym505$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BLACKBOARD_CONNECTION_INCREME = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-CLASS");

    static private final SubLSymbol $sym506$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BLACKBOARD_CONNECTION_INCREME = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-INSTANCE");

    static private final SubLList $list_alt507 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PRIORITY"), makeInteger(25)), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("SYMBOLIC-REP"), CHAR_B), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym508$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-METHOD");

    private static final SubLSymbol CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_INITIALIZE_METHOD = makeSymbol("CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-INITIALIZE-METHOD");

    static private final SubLList $list_alt510 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-BLACKBOARD-CONNECTION-INCREMENT ~S, ~S>"), makeSymbol("NAME"), makeSymbol("STATUS")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym511$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-METHOD");

    static private final SubLString $str_alt512$__CYBLACK_BLACKBOARD_CONNECTION_I = makeString("#<CYBLACK-BLACKBOARD-CONNECTION-INCREMENT ~S, ~S>");

    private static final SubLSymbol CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_PRINT_METHOD = makeSymbol("CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-PRINT-METHOD");

    static private final SubLSymbol $sym514$CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_GET_PROCESSING_STAGE_METH = makeSymbol("CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-GET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt515 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE-P"), makeSymbol("NEW-PROCESSING-STAGE")), makeString("(SET-PROCESSING-STAGE ~S): ~S is not an element of the ~\n     CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-PROCESSING-STAGE")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeSymbol("NEW-PROCESSING-STAGE")), list(RET, makeSymbol("NEW-PROCESSING-STAGE")));

    static private final SubLSymbol $sym516$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-METHOD");

    static private final SubLString $str_alt517$_SET_PROCESSING_STAGE__S____S_is_ = makeString("(SET-PROCESSING-STAGE ~S): ~S is not an element of the ~\n     CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-TYPE enumeration.");

    static private final SubLSymbol $sym518$CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_SET_PROCESSING_STAGE_METH = makeSymbol("CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-SET-PROCESSING-STAGE-METHOD");

    static private final SubLList $list_alt519 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION"), list(QUOTE, makeSymbol("HALTED-P"))), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("TERMINATED")), list(RET, makeKeyword("TERMINATED"))), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("PROCESSING-STAGE"), makeKeyword("UNINITIALIZED")), list(makeSymbol("CSETQ"), makeSymbol("PROCESSING-STAGE"), makeKeyword("PROCESSING"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("BLACKBOARD-CONNECTION-INCREMENT"))), list(RET, NIL));

    static private final SubLSymbol $sym520$OUTER_CATCH_FOR_CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-METHOD");

    private static final SubLSymbol BLACKBOARD_CONNECTION_INCREMENT = makeSymbol("BLACKBOARD-CONNECTION-INCREMENT");

    private static final SubLSymbol CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_RUN_INTERNAL_METHOD = makeSymbol("CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-RUN-INTERNAL-METHOD");

    static private final SubLList $list_alt523 = list(list(RET, list(makeSymbol("CAND"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("IS-ACTIVE"))), list(makeSymbol("CNOT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR*"), list(QUOTE, makeSymbol("INCOMING-POSTING-P")))))));

    private static final SubLSymbol INCOMING_POSTING_P = makeSymbol("INCOMING-POSTING-P");

    static private final SubLSymbol $sym525$CYBLACK_BLACKBOARD_CONNECTION_INCREMENT_NOTHING_TO_DO__METHOD = makeSymbol("CYBLACK-BLACKBOARD-CONNECTION-INCREMENT-NOTHING-TO-DO?-METHOD");

    private static final SubLSymbol CYBLACK_MONITOR_BASE = makeSymbol("CYBLACK-MONITOR-BASE");

    static private final SubLList $list_alt527 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-MONITOR-BASE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-GET-IO-MONITOR"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-IO-MONITOR"), list(makeSymbol("NEW-IO-MONITOR")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-MONITORED-TYPE-TYPE-STRINGS"), list(makeSymbol("NEW-TYPE-STRINGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRE-MONITORING-INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST-MONITORING-INITIALIZE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-IO-MONITOR"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-IO-MONITOR"), list(makeSymbol("NEW-IO-MONITOR")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INIT-IO-MONITOR"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-IO-MONITOR"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MONITORED-TYPE-TYPE-STRINGS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MONITORED-TYPE-TYPE-STRINGS"), list(makeSymbol("TYPE-STRINGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OVERRIDE-MONITORED-TYPE-PANEL-ASSOCIATIONS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITORING-ON-STARTUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-STARTUP"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol PRE_MONITORING_INITIALIZE = makeSymbol("PRE-MONITORING-INITIALIZE");

    static private final SubLList $list_alt529 = list(list(makeSymbol("OVERRIDE-MONITORED-TYPE-PANEL-ASSOCIATIONS"), makeSymbol("SELF")), list(RET, T));

    private static final SubLSymbol POST_MONITORING_INITIALIZE = makeSymbol("POST-MONITORING-INITIALIZE");

    static private final SubLList $list_alt531 = list(list(makeSymbol("INIT-IO-MONITOR"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR-DEFAULT-INPUT*"), makeSymbol("*STANDARD-INPUT*")), list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-IO-STREAM-MONITOR-DEFAULT-OUTPUT*"), makeSymbol("*STANDARD-OUTPUT*")), list(RET, T));

    private static final SubLSymbol GET_IO_MONITOR = makeSymbol("GET-IO-MONITOR");

    static private final SubLList $list_alt533 = list(list(RET, list(makeSymbol("INTERNAL-GET-IO-MONITOR"), makeSymbol("SELF"))));

    private static final SubLSymbol SET_IO_MONITOR = makeSymbol("SET-IO-MONITOR");

    static private final SubLList $list_alt535 = list(makeSymbol("NEW-IO-MONITOR"));

    static private final SubLList $list_alt536 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-IO-MONITOR")), list(makeSymbol("CYBLACK-SEXPR-MONITOR-P"), makeSymbol("NEW-IO-MONITOR"))), makeString("(SET-IO-MONITOR ~S): ~S is not an instance of CYBLACK-SEXPR-MONITOR."), makeSymbol("SELF"), makeSymbol("NEW-IO-MONITOR")), list(makeSymbol("INTERNAL-SET-IO-MONITOR"), makeSymbol("SELF"), makeSymbol("NEW-IO-MONITOR")), list(RET, makeSymbol("NEW-IO-MONITOR")));

    private static final SubLSymbol INIT_IO_MONITOR = makeSymbol("INIT-IO-MONITOR");

    static private final SubLList $list_alt538 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-MONITOR"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-SEXPR-MONITOR"))))), list(makeSymbol("SET-IO-MONITOR"), makeSymbol("SELF"), makeSymbol("TEMPLATE-MONITOR")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-MONITOR"), list(QUOTE, makeSymbol("SET-NORMAL-PROMPT")), makeString("~%*> ")), list(RET, makeSymbol("TEMPLATE-MONITOR"))));

    private static final SubLSymbol KILL_IO_MONITOR = makeSymbol("KILL-IO-MONITOR");

    static private final SubLList $list_alt540 = list(list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-IO-LOOP-CONTINUE*"), NIL), list(RET, NIL));

    private static final SubLSymbol GET_MONITORED_TYPE_TYPE_STRINGS = makeSymbol("GET-MONITORED-TYPE-TYPE-STRINGS");

    static private final SubLList $list_alt542 = list(list(RET, list(makeSymbol("INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS"), makeSymbol("SELF"))));

    private static final SubLSymbol SET_MONITORED_TYPE_TYPE_STRINGS = makeSymbol("SET-MONITORED-TYPE-TYPE-STRINGS");

    static private final SubLList $list_alt544 = list(makeSymbol("TYPE-STRINGS"));

    static private final SubLList $list_alt545 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("TYPE-STRINGS")), makeString("(SET-MONITORED-TYPE-TYPE-STRINGS ~S): ~S is not a valid list of type strings."), makeSymbol("SELF"), makeSymbol("TYPE-STRINGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE-STRING"), makeSymbol("TYPE-STRINGS")), list(makeSymbol("MUST"), list(makeSymbol("STRINGP"), makeSymbol("TYPE-STRING")), makeString("(SET-MONITORED-TYPE-TYPE-STRINGS ~S): ~S is not a valid type string.  ~\n       A string was expected."), makeSymbol("SELF"), makeSymbol("TYPE-STRING"))), list(makeSymbol("INTERNAL-SET-MONITORED-TYPE-TYPE-STRINGS"), makeSymbol("SELF"), list(makeSymbol("COPY-LIST"), makeSymbol("TYPE-STRINGS"))), list(RET, makeSymbol("TYPE-STRINGS")));

    private static final SubLSymbol OVERRIDE_MONITORED_TYPE_PANEL_ASSOCIATIONS = makeSymbol("OVERRIDE-MONITORED-TYPE-PANEL-ASSOCIATIONS");

    static private final SubLList $list_alt547 = list(list(makeSymbol("CLET"), list(makeSymbol("TEMPLATE-PANEL-TYPE"), makeSymbol("TEMPLATE-UI-PANEL-TYPE")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE-TYPE-STRING"), list(makeSymbol("INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-PANEL-TYPE"), list(makeSymbol("GET-PANEL-TYPE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-TYPE-STRING"))), list(makeSymbol("CSETQ"), makeSymbol("TEMPLATE-UI-PANEL-TYPE"), list(makeSymbol("FIF"), makeSymbol("TEMPLATE-PANEL-TYPE"), list(makeSymbol("FIF"), list(makeSymbol("SUBCLASSP"), makeSymbol("TEMPLATE-PANEL-TYPE"), list(QUOTE, makeSymbol("CYBLACK-BASIC-SEQUENCE-PANEL"))), list(QUOTE, makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL")), list(makeSymbol("FIF"), list(makeSymbol("SUBCLASSP"), makeSymbol("TEMPLATE-PANEL-TYPE"), list(QUOTE, makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL"))), list(QUOTE, makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL")), list(makeSymbol("FIF"), list(makeSymbol("SUBCLASSP"), makeSymbol("TEMPLATE-PANEL-TYPE"), list(QUOTE, makeSymbol("CYBLACK-BASIC-FORWARD-PANEL"))), list(QUOTE, makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL")), list(makeSymbol("FIF"), list(makeSymbol("SUBCLASSP"), makeSymbol("TEMPLATE-PANEL-TYPE"), list(QUOTE, makeSymbol("CYBLACK-BASIC-CYCPANEL"))), list(QUOTE, makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL")), list(makeSymbol("FIF"), list(makeSymbol("SUBCLASSP"), makeSymbol("TEMPLATE-PANEL-TYPE"), list(QUOTE, makeSymbol("CYBLACK-BASIC-PANEL"))), list(QUOTE, makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL")), NIL))))), NIL)), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-UI-PANEL-TYPE"), list(makeSymbol("OVERRIDE-PANEL-TYPE"), makeSymbol("SELF"), makeSymbol("TEMPLATE-TYPE-STRING"), makeSymbol("TEMPLATE-UI-PANEL-TYPE"))))), list(RET, T));

    private static final SubLSymbol MONITORING_ON_STARTUP = makeSymbol("MONITORING-ON-STARTUP");

    static private final SubLList $list_alt549 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEMPLATE-IO-MONITOR"), list(makeSymbol("INTERNAL-GET-IO-MONITOR"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("TEMPLATE-IO-MONITOR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEMPLATE-IO-MONITOR"), list(QUOTE, makeSymbol("INSTALL")), makeSymbol("SELF"), list(makeSymbol("INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS"), makeSymbol("SELF"))))), list(RET, T));

    static private final SubLList $list_alt550 = list(list(makeSymbol("AFTER-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("CYBLACK-IO-STREAM-MONITOR-TOPLEVEL")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE");

    static private final SubLList $list_alt552 = list(makeSymbol("CYBLACK-MONITOR-BASE"));

    static private final SubLList $list_alt553 = list(new SubLObject[]{ list(makeSymbol("IO-MONITOR"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MONITORED-TYPE-TYPE-STRINGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE-QUA-CYBLACK-MONITOR-BASE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-GET-IO-MONITOR"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-IO-MONITOR"), list(makeSymbol("NEW-IO-MONITOR")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INTERNAL-SET-MONITORED-TYPE-TYPE-STRINGS"), list(makeSymbol("NEW-TYPE-STRINGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRE-MONITORING-INITIALIZE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POST-MONITORING-INITIALIZE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-IO-MONITOR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-IO-MONITOR"), list(makeSymbol("NEW-IO-MONITOR")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INIT-IO-MONITOR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("KILL-IO-MONITOR"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MONITORED-TYPE-TYPE-STRINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MONITORED-TYPE-TYPE-STRINGS"), list(makeSymbol("TYPE-STRINGS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OVERRIDE-MONITORED-TYPE-PANEL-ASSOCIATIONS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITORING-ON-STARTUP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-STARTUP"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")) });

    public static final SubLInteger $int$27 = makeInteger(27);

    private static final SubLSymbol MONITORED_TYPE_TYPE_STRINGS = makeSymbol("MONITORED-TYPE-TYPE-STRINGS");

    public static final SubLInteger $int$26 = makeInteger(26);

    private static final SubLSymbol IO_MONITOR = makeSymbol("IO-MONITOR");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE_AFTER_STARTUP_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-AFTER-STARTUP-METHOD");

    private static final SubLSymbol INSTALL = makeSymbol("INSTALL");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE_MONITORING_ON_STARTUP_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-MONITORING-ON-STARTUP-METHOD");



    private static final SubLSymbol CYBLACK_BASIC_SEQUENCE_USER_INTERACTION_PANEL = makeSymbol("CYBLACK-BASIC-SEQUENCE-USER-INTERACTION-PANEL");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL");

    private static final SubLSymbol CYBLACK_BASIC_BACKWARD_PANEL_USER_INTERACTION_CYCPANEL = makeSymbol("CYBLACK-BASIC-BACKWARD-PANEL-USER-INTERACTION-CYCPANEL");

    private static final SubLSymbol CYBLACK_BASIC_FORWARD_PANEL = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL");

    private static final SubLSymbol CYBLACK_BASIC_FORWARD_PANEL_USER_INTERACTION_CYCPANEL = makeSymbol("CYBLACK-BASIC-FORWARD-PANEL-USER-INTERACTION-CYCPANEL");

    private static final SubLSymbol CYBLACK_BASIC_CYCPANEL = makeSymbol("CYBLACK-BASIC-CYCPANEL");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_CYCPANEL = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-CYCPANEL");

    private static final SubLSymbol CYBLACK_BASIC_USER_INTERACTION_PANEL = makeSymbol("CYBLACK-BASIC-USER-INTERACTION-PANEL");

    static private final SubLSymbol $sym570$CYBLACK_DEFAPP_MONITOR_BASE_OVERRIDE_MONITORED_TYPE_PANEL_ASSOCIA = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-OVERRIDE-MONITORED-TYPE-PANEL-ASSOCIATIONS-METHOD");

    static private final SubLString $str_alt571$_SET_MONITORED_TYPE_TYPE_STRINGS_ = makeString("(SET-MONITORED-TYPE-TYPE-STRINGS ~S): ~S is not a valid list of type strings.");

    static private final SubLString $str_alt572$_SET_MONITORED_TYPE_TYPE_STRINGS_ = makeString("(SET-MONITORED-TYPE-TYPE-STRINGS ~S): ~S is not a valid type string.  ~\n       A string was expected.");

    static private final SubLSymbol $sym573$CYBLACK_DEFAPP_MONITOR_BASE_SET_MONITORED_TYPE_TYPE_STRINGS_METHO = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    static private final SubLSymbol $sym574$CYBLACK_DEFAPP_MONITOR_BASE_GET_MONITORED_TYPE_TYPE_STRINGS_METHO = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE_KILL_IO_MONITOR_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-KILL-IO-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_SEXPR_MONITOR = makeSymbol("CYBLACK-SEXPR-MONITOR");

    private static final SubLSymbol SET_NORMAL_PROMPT = makeSymbol("SET-NORMAL-PROMPT");

    static private final SubLString $str_alt578$_____ = makeString("~%*> ");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE_INIT_IO_MONITOR_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-INIT-IO-MONITOR-METHOD");

    static private final SubLString $str_alt580$_SET_IO_MONITOR__S____S_is_not_an = makeString("(SET-IO-MONITOR ~S): ~S is not an instance of CYBLACK-SEXPR-MONITOR.");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE_SET_IO_MONITOR_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-SET-IO-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE_GET_IO_MONITOR_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-GET-IO-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE_POST_MONITORING_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-POST-MONITORING-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE_PRE_MONITORING_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-PRE-MONITORING-INITIALIZE-METHOD");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_BASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-BASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_BASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-BASE-INSTANCE");

    private static final SubLSymbol INITIALIZE_QUA_CYBLACK_MONITOR_BASE = makeSymbol("INITIALIZE-QUA-CYBLACK-MONITOR-BASE");

    static private final SubLList $list_alt588 = list(list(makeSymbol("INTERNAL-SET-IO-MONITOR"), makeSymbol("SELF"), NIL), list(makeSymbol("INTERNAL-SET-MONITORED-TYPE-TYPE-STRINGS"), makeSymbol("SELF"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym589$CYBLACK_DEFAPP_MONITOR_BASE_INITIALIZE_QUA_CYBLACK_MONITOR_BASE_M = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-INITIALIZE-QUA-CYBLACK-MONITOR-BASE-METHOD");

    private static final SubLSymbol INTERNAL_GET_IO_MONITOR = makeSymbol("INTERNAL-GET-IO-MONITOR");

    static private final SubLList $list_alt591 = list(list(RET, makeSymbol("IO-MONITOR")));

    static private final SubLSymbol $sym592$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-MONITOR-BASE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE_INTERNAL_GET_IO_MONITOR_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-INTERNAL-GET-IO-MONITOR-METHOD");

    private static final SubLSymbol INTERNAL_SET_IO_MONITOR = makeSymbol("INTERNAL-SET-IO-MONITOR");

    static private final SubLList $list_alt595 = list(list(makeSymbol("CSETQ"), makeSymbol("IO-MONITOR"), makeSymbol("NEW-IO-MONITOR")), list(RET, makeSymbol("NEW-IO-MONITOR")));

    static private final SubLSymbol $sym596$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-MONITOR-BASE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE_INTERNAL_SET_IO_MONITOR_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-INTERNAL-SET-IO-MONITOR-METHOD");

    private static final SubLSymbol INTERNAL_GET_MONITORED_TYPE_TYPE_STRINGS = makeSymbol("INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS");

    static private final SubLList $list_alt599 = list(list(RET, makeSymbol("MONITORED-TYPE-TYPE-STRINGS")));

    static private final SubLSymbol $sym600$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-MONITOR-BASE-METHOD");

    static private final SubLSymbol $sym601$CYBLACK_DEFAPP_MONITOR_BASE_INTERNAL_GET_MONITORED_TYPE_TYPE_STRI = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    private static final SubLSymbol INTERNAL_SET_MONITORED_TYPE_TYPE_STRINGS = makeSymbol("INTERNAL-SET-MONITORED-TYPE-TYPE-STRINGS");

    static private final SubLList $list_alt603 = list(makeSymbol("NEW-TYPE-STRINGS"));

    static private final SubLList $list_alt604 = list(list(makeSymbol("CSETQ"), makeSymbol("MONITORED-TYPE-TYPE-STRINGS"), makeSymbol("NEW-TYPE-STRINGS")), list(RET, makeSymbol("NEW-TYPE-STRINGS")));

    static private final SubLSymbol $sym605$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-MONITOR-BASE-METHOD");

    static private final SubLSymbol $sym606$CYBLACK_DEFAPP_MONITOR_BASE_INTERNAL_SET_MONITORED_TYPE_TYPE_STRI = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-INTERNAL-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    static private final SubLList $list_alt607 = list(list(makeSymbol("CSETQ"), makeSymbol("DELAY-STANDARD-INITIALIZATION-P"), T), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("IO-MONITOR"), NIL), list(makeSymbol("CSETQ"), makeSymbol("MONITORED-TYPE-TYPE-STRINGS"), NIL), list(makeSymbol("STANDARD-INITIALIZATION"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_BASE_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_EXTERNAL_BASE = makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE");

    static private final SubLList $list_alt610 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-HALT-AND-ABORT-SERVER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-EMPTY-AGENDA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BEFORE-AGENDA-EXECUTE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("AFTER-AGENDA-EXECUTE"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_EXTERNAL_BASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-EXTERNAL-BASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_EXTERNAL_BASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-EXTERNAL-BASE-INSTANCE");

    static private final SubLList $list_alt613 = list(list(makeSymbol("INLINE-SET-SLOT"), list(makeSymbol("DELAY-STANDARD-INITIALIZATION-P"), makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE")), makeSymbol("SELF"), T), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("SET-CONNECTION-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION"))), list(makeSymbol("SET-MESSAGE-BROKER-CLASS"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYBLACK-MESSAGE-BROKER"))), list(makeSymbol("STANDARD-INITIALIZATION"), makeSymbol("SELF")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_STANDARD_EXTERNAL_CONNECTION = makeSymbol("CYBLACK-STANDARD-EXTERNAL-CONNECTION");



    private static final SubLSymbol CYBLACK_DEFAPP_EXTERNAL_BASE_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE-INITIALIZE-METHOD");

    static private final SubLList $list_alt617 = list(list(makeSymbol("ON-STARTUP"), makeSymbol("SUPER")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_DEFAPP_EXTERNAL_BASE_ON_STARTUP_METHOD = makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE-ON-STARTUP-METHOD");

    static private final SubLList $list_alt619 = list(list(makeSymbol("ON-SHUTDOWN"), makeSymbol("SUPER")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_DEFAPP_EXTERNAL_BASE_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE-ON-SHUTDOWN-METHOD");

    static private final SubLList $list_alt621 = list(list(makeSymbol("AFTER-STARTUP"), makeSymbol("SUPER")), list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-CONNECTION"), list(makeSymbol("CLET"), list(list(makeSymbol("SESSION-CONNECTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("EXTERNAL-CONNECTION"), list(QUOTE, makeSymbol("GET-SESSION-CONNECTION"))))), list(makeSymbol("PWHEN"), makeSymbol("SESSION-CONNECTION"), list(makeSymbol("FORMAT"), T, makeString("~%Processing incoming messages.")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SESSION-CONNECTION"), list(QUOTE, makeSymbol("PROCESS-INCOMING-MESSAGES")), T)))), list(makeSymbol("REPORT-OUTSTANDING-EXTERNAL-KNOWLEDGE-SOURCES"), makeSymbol("SELF")), list(RET, NIL));

    static private final SubLSymbol $sym622$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-EXTERNAL-BASE-METHOD");

    private static final SubLSymbol GET_SESSION_CONNECTION = makeSymbol("GET-SESSION-CONNECTION");

    static private final SubLString $str_alt624$__Processing_incoming_messages_ = makeString("~%Processing incoming messages.");

    private static final SubLSymbol PROCESS_INCOMING_MESSAGES = makeSymbol("PROCESS-INCOMING-MESSAGES");

    private static final SubLSymbol CYBLACK_DEFAPP_EXTERNAL_BASE_AFTER_STARTUP_METHOD = makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE-AFTER-STARTUP-METHOD");

    private static final SubLSymbol ON_HALT_AND_ABORT_SERVER = makeSymbol("ON-HALT-AND-ABORT-SERVER");

    static private final SubLList $list_alt628 = list(list(makeSymbol("ON-HALT-AND-ABORT-SERVER"), makeSymbol("SUPER")), list(makeSymbol("CYBLACK-ENQUEUE-SERVER-COMMAND"), makeKeyword("Q")), list(RET, T));



    private static final SubLSymbol CYBLACK_DEFAPP_EXTERNAL_BASE_ON_HALT_AND_ABORT_SERVER_METHOD = makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE-ON-HALT-AND-ABORT-SERVER-METHOD");

    static private final SubLList $list_alt631 = list(list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-CONNECTION"), list(makeSymbol("CLET"), list(list(makeSymbol("SESSION-CONNECTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("EXTERNAL-CONNECTION"), list(QUOTE, makeSymbol("GET-SESSION-CONNECTION"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SESSION-CONNECTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SESSION-CONNECTION"), list(QUOTE, makeSymbol("INCOMING-MESSAGES-AVAILABLE-P")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SESSION-CONNECTION"), list(QUOTE, makeSymbol("PROCESS-INCOMING-MESSAGES"))), list(RET, NIL)))), list(RET, NIL));

    static private final SubLSymbol $sym632$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-EXTERNAL-BASE-METHOD");

    private static final SubLSymbol INCOMING_MESSAGES_AVAILABLE_P = makeSymbol("INCOMING-MESSAGES-AVAILABLE-P");

    private static final SubLSymbol CYBLACK_DEFAPP_EXTERNAL_BASE_ON_EMPTY_AGENDA_METHOD = makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE-ON-EMPTY-AGENDA-METHOD");

    static private final SubLList $list_alt635 = list(list(makeSymbol("PWHEN"), makeSymbol("EXTERNAL-CONNECTION"), list(makeSymbol("CLET"), list(list(makeSymbol("SESSION-CONNECTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("EXTERNAL-CONNECTION"), list(QUOTE, makeSymbol("GET-SESSION-CONNECTION"))))), list(makeSymbol("PWHEN"), makeSymbol("SESSION-CONNECTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SESSION-CONNECTION"), list(QUOTE, makeSymbol("PROCESS-INCOMING-MESSAGES")))))), list(RET, NIL));

    static private final SubLSymbol $sym636$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-EXTERNAL-BASE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_EXTERNAL_BASE_BEFORE_AGENDA_EXECUTE_METHOD = makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE-BEFORE-AGENDA-EXECUTE-METHOD");

    static private final SubLSymbol $sym638$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXTERNAL_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-EXTERNAL-BASE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_EXTERNAL_BASE_AFTER_AGENDA_EXECUTE_METHOD = makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE-AFTER-AGENDA-EXECUTE-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_AFTER_STARTUP_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-AFTER-STARTUP-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_MONITORING_ON_STARTUP_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-MONITORING-ON-STARTUP-METHOD");

    static private final SubLSymbol $sym643$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_OVERRIDE_MONITORED_TYPE_PANE = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-OVERRIDE-MONITORED-TYPE-PANEL-ASSOCIATIONS-METHOD");

    static private final SubLSymbol $sym644$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_SET_MONITORED_TYPE_TYPE_STRI = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    static private final SubLSymbol $sym645$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_GET_MONITORED_TYPE_TYPE_STRI = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_KILL_IO_MONITOR_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-KILL-IO-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INIT_IO_MONITOR_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INIT-IO-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_SET_IO_MONITOR_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-SET-IO-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_GET_IO_MONITOR_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-GET-IO-MONITOR-METHOD");

    static private final SubLSymbol $sym650$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_POST_MONITORING_INITIALIZE_M = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-POST-MONITORING-INITIALIZE-METHOD");

    static private final SubLSymbol $sym651$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_PRE_MONITORING_INITIALIZE_ME = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-PRE-MONITORING-INITIALIZE-METHOD");

    static private final SubLSymbol $sym652$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-CLASS");

    static private final SubLSymbol $sym653$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INSTANCE");

    static private final SubLSymbol $sym654$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INITIALIZE_QUA_CYBLACK_MONIT = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INITIALIZE-QUA-CYBLACK-MONITOR-BASE-METHOD");

    static private final SubLSymbol $sym655$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-METHOD");

    static private final SubLSymbol $sym656$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INTERNAL_GET_IO_MONITOR_METH = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INTERNAL-GET-IO-MONITOR-METHOD");

    static private final SubLSymbol $sym657$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-METHOD");

    static private final SubLSymbol $sym658$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INTERNAL_SET_IO_MONITOR_METH = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INTERNAL-SET-IO-MONITOR-METHOD");

    static private final SubLSymbol $sym659$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-METHOD");

    static private final SubLSymbol $sym660$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INTERNAL_GET_MONITORED_TYPE_ = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    static private final SubLSymbol $sym661$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-METHOD");

    static private final SubLSymbol $sym662$CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INTERNAL_SET_MONITORED_TYPE_ = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INTERNAL-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXTERNAL_BASE_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE-INITIALIZE-METHOD");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_BASE = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE");

    static private final SubLList $list_alt665 = list(list(makeSymbol("PROCESS-SCHEDULER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APPLICATION-PROCESS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PROCESS-SCHEDULER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROCESS-SCHEDULER"), list(makeSymbol("NEW-PROCESS-SCHEDULER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-PROCESS"), list(makeSymbol("SUBLOOP-PROCESS")), makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_DEFAPP_BASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-DEFAPP-BASE-CLASS");

    static private final SubLSymbol $sym668$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_DEFAPP_BASE_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-DEFAPP-BASE-INSTANCE");

    static private final SubLList $list_alt669 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PROCESS-SCHEDULER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER")))), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION-PROCESS"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP")), makeSymbol("APPLICATION-PROCESS"), list(makeSymbol("GET-APPLICATION"), makeSymbol("SELF"))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym670$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-DEFAPP-BASE-METHOD");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_BASE_INITIALIZE_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE-INITIALIZE-METHOD");

    static private final SubLList $list_alt672 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt673 = list(list(makeSymbol("SET-APPLICATION"), makeSymbol("SUPER"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("PWHEN"), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("APPLICATION-PROCESS"), makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE")), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-APPLICATION"), makeSymbol("CYBLACK-UNIPROCESS-APPLICATION-MAIN-LOOP")), list(makeSymbol("INLINE-GET-SLOT"), list(makeSymbol("APPLICATION-PROCESS"), makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE")), makeSymbol("SELF")), makeSymbol("NEW-APPLICATION"))), list(RET, makeSymbol("NEW-APPLICATION")));

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_BASE_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE-SET-APPLICATION-METHOD");

    static private final SubLList $list_alt675 = list(list(RET, makeSymbol("PROCESS-SCHEDULER")));

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_BASE_GET_PROCESS_SCHEDULER_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE-GET-PROCESS-SCHEDULER-METHOD");

    static private final SubLList $list_alt677 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PROCESS-SCHEDULER")), list(makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER-P"), makeSymbol("NEW-PROCESS-SCHEDULER"))), makeString("(SET-PROCESS-SCHEDULER ~S): ~S is not an instance of CYBLACK-APPLICATION-PROCESS-SCHEDULER"), makeSymbol("SELF"), makeSymbol("NEW-PROCESS-SCHEDULER")), list(makeSymbol("CSETQ"), makeSymbol("PROCESS-SCHEDULER"), makeSymbol("NEW-PROCESS-SCHEDULER")), list(RET, makeSymbol("NEW-PROCESS-SCHEDULER")));

    static private final SubLSymbol $sym678$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-DEFAPP-BASE-METHOD");

    static private final SubLString $str_alt679$_SET_PROCESS_SCHEDULER__S____S_is = makeString("(SET-PROCESS-SCHEDULER ~S): ~S is not an instance of CYBLACK-APPLICATION-PROCESS-SCHEDULER");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_BASE_SET_PROCESS_SCHEDULER_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE-SET-PROCESS-SCHEDULER-METHOD");



    static private final SubLList $list_alt682 = list(list(makeSymbol("MUST"), list(makeSymbol("CAND"), makeSymbol("PROCESS-SCHEDULER"), makeSymbol("APPLICATION-PROCESS")), makeString("(RUN ~S): This application is not fully initialized."), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROCESS-SCHEDULER"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("CYBLACK-FORMAT"), T, makeString("~%APPLICATION -> ~S~%"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROCESS-SCHEDULER"), list(QUOTE, makeSymbol("GET-APPLICATION")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("APPLICATION-PROCESS"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TASK"), makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER")), makeSymbol("PROCESS-SCHEDULER"), makeSymbol("APPLICATION-PROCESS")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TASK"), makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER")), makeSymbol("PROCESS-SCHEDULER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("CYBLACK-SERVER-COMMAND-PROCESS")))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("START"), makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER")), makeSymbol("PROCESS-SCHEDULER")), list(RET, NIL));

    static private final SubLSymbol $sym683$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-DEFAPP-BASE-METHOD");

    static private final SubLString $str_alt684$_RUN__S___This_application_is_not = makeString("(RUN ~S): This application is not fully initialized.");

    static private final SubLString $str_alt685$__APPLICATION_____S__ = makeString("~%APPLICATION -> ~S~%");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_BASE_RUN_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE-RUN-METHOD");

    private static final SubLSymbol ADD_PROCESS = makeSymbol("ADD-PROCESS");

    static private final SubLList $list_alt688 = list(list(makeSymbol("MUST"), list(makeSymbol("BASIC-SUBLOOP-PROCESS-P"), makeSymbol("SUBLOOP-PROCESS")), makeString("(ADD-PROCESS ~S): ~S is not an instance of BASIC-SUBLOOP-PROCESS."), makeSymbol("SELF"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-APPLICATION-UNIPROCESS-P"), makeSymbol("SUBLOOP-PROCESS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SUBLOOP-PROCESS"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF"))), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-TASK"), makeSymbol("CYBLACK-APPLICATION-PROCESS-SCHEDULER")), makeSymbol("PROCESS-SCHEDULER"), makeSymbol("SUBLOOP-PROCESS")), list(RET, makeSymbol("SUBLOOP-PROCESS")));

    static private final SubLSymbol $sym689$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-DEFAPP-BASE-METHOD");

    static private final SubLString $str_alt690$_ADD_PROCESS__S____S_is_not_an_in = makeString("(ADD-PROCESS ~S): ~S is not an instance of BASIC-SUBLOOP-PROCESS.");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_BASE_ADD_PROCESS_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-BASE-ADD-PROCESS-METHOD");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE");

    public static final SubLInteger $int$29 = makeInteger(29);

    public static final SubLInteger $int$28 = makeInteger(28);

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_AFTER_STARTUP_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-AFTER-STARTUP-METHOD");

    static private final SubLSymbol $sym696$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_MONITORING_ON_STARTUP_METH = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-MONITORING-ON-STARTUP-METHOD");

    static private final SubLSymbol $sym697$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_OVERRIDE_MONITORED_TYPE_PA = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-OVERRIDE-MONITORED-TYPE-PANEL-ASSOCIATIONS-METHOD");

    static private final SubLSymbol $sym698$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_SET_MONITORED_TYPE_TYPE_ST = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    static private final SubLSymbol $sym699$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_GET_MONITORED_TYPE_TYPE_ST = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_KILL_IO_MONITOR_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-KILL-IO-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INIT_IO_MONITOR_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INIT-IO-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_SET_IO_MONITOR_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-SET-IO-MONITOR-METHOD");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_GET_IO_MONITOR_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-GET-IO-MONITOR-METHOD");

    static private final SubLSymbol $sym704$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_POST_MONITORING_INITIALIZE = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-POST-MONITORING-INITIALIZE-METHOD");

    static private final SubLSymbol $sym705$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_PRE_MONITORING_INITIALIZE_ = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-PRE-MONITORING-INITIALIZE-METHOD");

    static private final SubLSymbol $sym706$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BAS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-CLASS");

    static private final SubLSymbol $sym707$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BAS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INSTANCE");

    static private final SubLSymbol $sym708$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INITIALIZE_QUA_CYBLACK_MON = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INITIALIZE-QUA-CYBLACK-MONITOR-BASE-METHOD");

    static private final SubLSymbol $sym709$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-METHOD");

    static private final SubLSymbol $sym710$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INTERNAL_GET_IO_MONITOR_ME = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INTERNAL-GET-IO-MONITOR-METHOD");

    static private final SubLSymbol $sym711$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-METHOD");

    static private final SubLSymbol $sym712$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INTERNAL_SET_IO_MONITOR_ME = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INTERNAL-SET-IO-MONITOR-METHOD");

    static private final SubLSymbol $sym713$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-METHOD");

    static private final SubLSymbol $sym714$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INTERNAL_GET_MONITORED_TYP = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INTERNAL-GET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    static private final SubLSymbol $sym715$OUTER_CATCH_FOR_CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-METHOD");

    static private final SubLSymbol $sym716$CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INTERNAL_SET_MONITORED_TYP = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INTERNAL-SET-MONITORED-TYPE-TYPE-STRINGS-METHOD");

    private static final SubLSymbol CYBLACK_UNIPROCESS_DEFAPP_MONITOR_BASE_INITIALIZE_METHOD = makeSymbol("CYBLACK-UNIPROCESS-DEFAPP-MONITOR-BASE-INITIALIZE-METHOD");



    static private final SubLList $list_alt719 = list(list(makeSymbol("PARENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CHILDREN"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARENT"), list(makeSymbol("NEW-PARENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-CHILD"), list(makeSymbol("NEW-CHILD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CHILDREN"), NIL, makeKeyword("PUBLIC")));





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_EXPRESSION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-EXPRESSION-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_EXPRESSION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt724 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("PARENT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("CHILDREN"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym725$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-EXPRESSION-INITIALIZE-METHOD");

    static private final SubLList $list_alt727 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CDOLIST"), list(makeSymbol("CHILD"), list(makeSymbol("GET-CHILDREN"), makeSymbol("SELF"))), list(makeSymbol("PRINT"), makeSymbol("CHILD"), makeSymbol("STREAM"))), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_DEFAPP_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-EXPRESSION-PRINT-METHOD");



    static private final SubLList $list_alt730 = list(list(RET, makeSymbol("PARENT")));

    private static final SubLSymbol CYBLACK_DEFAPP_EXPRESSION_GET_PARENT_METHOD = makeSymbol("CYBLACK-DEFAPP-EXPRESSION-GET-PARENT-METHOD");



    static private final SubLList $list_alt733 = list(makeSymbol("NEW-PARENT"));

    static private final SubLList $list_alt734 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-PARENT")), list(makeSymbol("CYBLACK-DEFAPP-EXPRESSION-P"), makeSymbol("NEW-PARENT"))), makeString("(SET-PARENT ~S): ~S is not an instance of CYBLACK-DEFAPP-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-PARENT")), list(makeSymbol("CSETQ"), makeSymbol("PARENT"), makeSymbol("NEW-PARENT")), list(makeSymbol("PWHEN"), makeSymbol("PARENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("ADD-CHILD"), makeSymbol("CYBLACK-DEFAPP-EXPRESSION")), makeSymbol("PARENT"), makeSymbol("SELF"))), list(RET, makeSymbol("PARENT")));

    static private final SubLSymbol $sym735$OUTER_CATCH_FOR_CYBLACK_DEFAPP_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-EXPRESSION-METHOD");

    static private final SubLString $str_alt736$_SET_PARENT__S____S_is_not_an_ins = makeString("(SET-PARENT ~S): ~S is not an instance of CYBLACK-DEFAPP-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_EXPRESSION_SET_PARENT_METHOD = makeSymbol("CYBLACK-DEFAPP-EXPRESSION-SET-PARENT-METHOD");



    static private final SubLList $list_alt739 = list(makeSymbol("NEW-CHILD"));

    static private final SubLList $list_alt740 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("NEW-CHILD"), makeSymbol("CHILDREN")), list(makeSymbol("CSETQ"), makeSymbol("CHILDREN"), list(makeSymbol("NCONC"), makeSymbol("CHILDREN"), list(makeSymbol("LIST"), makeSymbol("NEW-CHILD")))), list(makeSymbol("SET-CYBLACK-DEFAPP-EXPRESSION-CHILDREN"), makeSymbol("SELF"), makeSymbol("CHILDREN"))), list(RET, makeSymbol("NEW-CHILD")));

    private static final SubLSymbol CYBLACK_DEFAPP_EXPRESSION_ADD_CHILD_METHOD = makeSymbol("CYBLACK-DEFAPP-EXPRESSION-ADD-CHILD-METHOD");



    static private final SubLList $list_alt743 = list(list(RET, makeSymbol("CHILDREN")));

    private static final SubLSymbol CYBLACK_DEFAPP_EXPRESSION_GET_CHILDREN_METHOD = makeSymbol("CYBLACK-DEFAPP-EXPRESSION-GET-CHILDREN-METHOD");



    static private final SubLList $list_alt746 = list(new SubLObject[]{ list(makeSymbol("BLACKBOARD-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("KSB-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AGENDA-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MONITOR-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("BEFORE-AGENDA-EXECUTE-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AFTER-AGENDA-EXECUTE-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ON-EMPTY-AGENDA-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ON-STARTUP-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ON-SHUTDOWN-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ON-QUIESCENCE-EXPRESSION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BLACKBOARD-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BLACKBOARD-EXPRESSION"), list(makeSymbol("NEW-BLACKBOARD-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSB-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSB-EXPRESSION"), list(makeSymbol("NEW-KSB-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-AGENDA-EXPRESSION"), list(makeSymbol("NEW-AGENDA-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MONITOR-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MONITOR-EXPRESSION"), list(makeSymbol("NEW-MONITOR-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MONITORED-DATATYPES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BEFORE-AGENDA-EXECUTE-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BEFORE-AGENDA-EXECUTE-EXPRESSION"), list(makeSymbol("NEW-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AFTER-AGENDA-EXECUTE-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-AFTER-AGENDA-EXECUTE-EXPRESSION"), list(makeSymbol("NEW-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ON-EMPTY-AGENDA-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ON-EMPTY-AGENDA-EXPRESSION"), list(makeSymbol("NEW-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ON-STARTUP-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ON-STARTUP-EXPRESSION"), list(makeSymbol("NEW-ON-STARTUP-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ON-SHUTDOWN-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ON-SHUTDOWN-EXPRESSION"), list(makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ON-QUIESCENCE-EXPRESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ON-QUIESCENCE-EXPRESSION"), list(makeSymbol("NEW-ON-QUIESCENCE-EXPRESSION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-BASE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BLACKBOARD-INFO"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSB-INFO"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-INITIALIZE-METHOD-BODY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-USER-ON-STARTUP-METHOD-BODY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-USER-ON-SHUTDOWN-METHOD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-ON-QUIESCENCE-METHOD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-ON-EMPTY-AGENDA-METHOD"), NIL, makeKeyword("PUBLIC")) });









    private static final SubLSymbol AFTER_AGENDA_EXECUTE_EXPRESSION = makeSymbol("AFTER-AGENDA-EXECUTE-EXPRESSION");

    private static final SubLSymbol BEFORE_AGENDA_EXECUTE_EXPRESSION = makeSymbol("BEFORE-AGENDA-EXECUTE-EXPRESSION");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BODY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BODY-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BODY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BODY-INSTANCE");

    static private final SubLList $list_alt759 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD-EXPRESSION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("KSB-EXPRESSION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("AGENDA-EXPRESSION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("BEFORE-AGENDA-EXECUTE-EXPRESSION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("AFTER-AGENDA-EXECUTE-EXPRESSION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ON-EMPTY-AGENDA-EXPRESSION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ON-STARTUP-EXPRESSION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ON-SHUTDOWN-EXPRESSION"), NIL), list(RET, makeSymbol("SELF")) });

    static private final SubLSymbol $sym760$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-INITIALIZE-METHOD");

    static private final SubLList $list_alt762 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("CLET"), list(list(makeSymbol("FIRST-PRINTED"), T)), list(makeSymbol("PWHEN"), makeSymbol("BLACKBOARD-EXPRESSION"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S"), makeSymbol("BLACKBOARD-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-PRINTED"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("KSB-EXPRESSION"), list(makeSymbol("PUNLESS"), makeSymbol("FIRST-PRINTED"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" "))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S"), makeSymbol("KSB-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-PRINTED"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("AGENDA-EXPRESSION"), list(makeSymbol("PUNLESS"), makeSymbol("FIRST-PRINTED"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" "))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S"), makeSymbol("AGENDA-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-PRINTED"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("ON-EMPTY-AGENDA-EXPRESSION"), list(makeSymbol("PUNLESS"), makeSymbol("FIRST-PRINTED"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" "))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S"), makeSymbol("ON-EMPTY-AGENDA-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-PRINTED"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("ON-STARTUP-EXPRESSION"), list(makeSymbol("PUNLESS"), makeSymbol("FIRST-PRINTED"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" "))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S"), makeSymbol("ON-STARTUP-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-PRINTED"), NIL)), list(makeSymbol("PWHEN"), makeSymbol("ON-SHUTDOWN-EXPRESSION"), list(makeSymbol("PUNLESS"), makeSymbol("FIRST-PRINTED"), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" "))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~S"), makeSymbol("ON-SHUTDOWN-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("FIRST-PRINTED"), NIL))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt763$_S = makeString("~S");

    static private final SubLString $str_alt764$_ = makeString(" ");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-PRINT-METHOD");

    private static final SubLSymbol GET_BLACKBOARD_EXPRESSION = makeSymbol("GET-BLACKBOARD-EXPRESSION");

    static private final SubLList $list_alt767 = list(list(RET, makeSymbol("BLACKBOARD-EXPRESSION")));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_BLACKBOARD_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-BLACKBOARD-EXPRESSION-METHOD");

    private static final SubLSymbol SET_BLACKBOARD_EXPRESSION = makeSymbol("SET-BLACKBOARD-EXPRESSION");

    static private final SubLList $list_alt770 = list(makeSymbol("NEW-BLACKBOARD-EXPRESSION"));

    static private final SubLList $list_alt771 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-BLACKBOARD-EXPRESSION")), list(makeSymbol("CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-P"), makeSymbol("NEW-BLACKBOARD-EXPRESSION"))), makeString("(SET-BLACKBOARD-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-BLACKBOARD-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD-EXPRESSION"), makeSymbol("NEW-BLACKBOARD-EXPRESSION")), list(makeSymbol("PWHEN"), makeSymbol("BLACKBOARD-EXPRESSION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT"), makeSymbol("CYBLACK-DEFAPP-EXPRESSION")), makeSymbol("BLACKBOARD-EXPRESSION"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-BLACKBOARD-EXPRESSION")));

    static private final SubLSymbol $sym772$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    static private final SubLString $str_alt773$_SET_BLACKBOARD_EXPRESSION__S____ = makeString("(SET-BLACKBOARD-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_SET_BLACKBOARD_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-SET-BLACKBOARD-EXPRESSION-METHOD");

    private static final SubLSymbol GET_KSB_EXPRESSION = makeSymbol("GET-KSB-EXPRESSION");

    static private final SubLList $list_alt776 = list(list(RET, makeSymbol("KSB-EXPRESSION")));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_KSB_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-KSB-EXPRESSION-METHOD");

    private static final SubLSymbol SET_KSB_EXPRESSION = makeSymbol("SET-KSB-EXPRESSION");

    static private final SubLList $list_alt779 = list(makeSymbol("NEW-KSB-EXPRESSION"));

    static private final SubLList $list_alt780 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-KSB-EXPRESSION")), list(makeSymbol("CYBLACK-DEFAPP-KSB-EXPRESSION-P"), makeSymbol("NEW-KSB-EXPRESSION"))), makeString("(SET-KSB-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-KSB-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-KSB-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("KSB-EXPRESSION"), makeSymbol("NEW-KSB-EXPRESSION")), list(makeSymbol("PWHEN"), makeSymbol("KSB-EXPRESSION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT"), makeSymbol("CYBLACK-DEFAPP-EXPRESSION")), makeSymbol("KSB-EXPRESSION"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-KSB-EXPRESSION")));

    static private final SubLSymbol $sym781$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    static private final SubLString $str_alt782$_SET_KSB_EXPRESSION__S____S_is_no = makeString("(SET-KSB-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-KSB-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_SET_KSB_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-SET-KSB-EXPRESSION-METHOD");

    private static final SubLSymbol GET_AGENDA_EXPRESSION = makeSymbol("GET-AGENDA-EXPRESSION");

    static private final SubLList $list_alt785 = list(list(RET, makeSymbol("AGENDA-EXPRESSION")));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_AGENDA_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-AGENDA-EXPRESSION-METHOD");

    private static final SubLSymbol SET_AGENDA_EXPRESSION = makeSymbol("SET-AGENDA-EXPRESSION");

    static private final SubLList $list_alt788 = list(makeSymbol("NEW-AGENDA-EXPRESSION"));

    static private final SubLList $list_alt789 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-AGENDA-EXPRESSION")), list(makeSymbol("CYBLACK-DEFAPP-AGENDA-EXPRESSION-P"), makeSymbol("NEW-AGENDA-EXPRESSION"))), makeString("(SET-AGENDA-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-AGENDA-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("AGENDA-EXPRESSION"), makeSymbol("NEW-AGENDA-EXPRESSION")), list(makeSymbol("PWHEN"), makeSymbol("AGENDA-EXPRESSION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT"), makeSymbol("CYBLACK-DEFAPP-EXPRESSION")), makeSymbol("AGENDA-EXPRESSION"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-AGENDA-EXPRESSION")));

    static private final SubLSymbol $sym790$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    static private final SubLString $str_alt791$_SET_AGENDA_EXPRESSION__S____S_is = makeString("(SET-AGENDA-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-AGENDA-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_SET_AGENDA_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-SET-AGENDA-EXPRESSION-METHOD");

    private static final SubLSymbol GET_MONITOR_EXPRESSION = makeSymbol("GET-MONITOR-EXPRESSION");

    static private final SubLList $list_alt794 = list(list(RET, makeSymbol("MONITOR-EXPRESSION")));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_MONITOR_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-MONITOR-EXPRESSION-METHOD");

    private static final SubLSymbol SET_MONITOR_EXPRESSION = makeSymbol("SET-MONITOR-EXPRESSION");

    static private final SubLList $list_alt797 = list(makeSymbol("NEW-MONITOR-EXPRESSION"));

    static private final SubLList $list_alt798 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-MONITOR-EXPRESSION")), list(makeSymbol("CYBLACK-DEFAPP-MONITOR-EXPRESSION-P"), makeSymbol("NEW-MONITOR-EXPRESSION"))), makeString("(SET-MONITOR-EXPRESSION: ~S): ~S is not an instance of CYBLACK-DEFAPP-MONITOR-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-MONITOR-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("MONITOR-EXPRESSION"), makeSymbol("NEW-MONITOR-EXPRESSION")), list(makeSymbol("PWHEN"), makeSymbol("MONITOR-EXPRESSION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT"), makeSymbol("CYBLACK-DEFAPP-EXPRESSION")), makeSymbol("MONITOR-EXPRESSION"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-MONITOR-EXPRESSION")));

    static private final SubLSymbol $sym799$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    static private final SubLString $str_alt800$_SET_MONITOR_EXPRESSION___S____S_ = makeString("(SET-MONITOR-EXPRESSION: ~S): ~S is not an instance of CYBLACK-DEFAPP-MONITOR-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_SET_MONITOR_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-SET-MONITOR-EXPRESSION-METHOD");

    private static final SubLSymbol GET_MONITORED_DATATYPES = makeSymbol("GET-MONITORED-DATATYPES");

    static private final SubLList $list_alt803 = list(list(makeSymbol("PWHEN"), makeSymbol("MONITOR-EXPRESSION"), list(RET, list(makeSymbol("CYBLACK-DEFAPP-MONITOR-EXPRESSION-GET-DATATYPE-NAMES-METHOD"), makeSymbol("MONITOR-EXPRESSION")))), list(RET, NIL));

    static private final SubLSymbol $sym804$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_MONITORED_DATATYPES_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-MONITORED-DATATYPES-METHOD");

    private static final SubLSymbol GET_BEFORE_AGENDA_EXECUTE_EXPRESSION = makeSymbol("GET-BEFORE-AGENDA-EXECUTE-EXPRESSION");

    static private final SubLList $list_alt807 = list(list(RET, makeSymbol("BEFORE-AGENDA-EXECUTE-EXPRESSION")));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_BEFORE_AGENDA_EXECUTE_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-BEFORE-AGENDA-EXECUTE-EXPRESSION-METHOD");

    private static final SubLSymbol SET_BEFORE_AGENDA_EXECUTE_EXPRESSION = makeSymbol("SET-BEFORE-AGENDA-EXECUTE-EXPRESSION");

    static private final SubLList $list_alt810 = list(makeSymbol("NEW-EXPRESSION"));

    static private final SubLList $list_alt811 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EXPRESSION")), list(makeSymbol("CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION-P"), makeSymbol("NEW-EXPRESSION"))), makeString("(SET-BEFORE-AGENDA-EXECUTE-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("BEFORE-AGENDA-EXECUTE-EXPRESSION"), makeSymbol("NEW-EXPRESSION")), list(makeSymbol("PWHEN"), makeSymbol("BEFORE-AGENDA-EXECUTE-EXPRESSION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT"), makeSymbol("CYBLACK-DEFAPP-EXPRESSION")), makeSymbol("BEFORE-AGENDA-EXECUTE-EXPRESSION"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-EXPRESSION")));

    static private final SubLSymbol $sym812$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    static private final SubLString $str_alt813$_SET_BEFORE_AGENDA_EXECUTE_EXPRES = makeString("(SET-BEFORE-AGENDA-EXECUTE-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_SET_BEFORE_AGENDA_EXECUTE_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-SET-BEFORE-AGENDA-EXECUTE-EXPRESSION-METHOD");

    private static final SubLSymbol GET_AFTER_AGENDA_EXECUTE_EXPRESSION = makeSymbol("GET-AFTER-AGENDA-EXECUTE-EXPRESSION");

    static private final SubLList $list_alt816 = list(list(RET, makeSymbol("AFTER-AGENDA-EXECUTE-EXPRESSION")));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_AFTER_AGENDA_EXECUTE_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-AFTER-AGENDA-EXECUTE-EXPRESSION-METHOD");

    private static final SubLSymbol SET_AFTER_AGENDA_EXECUTE_EXPRESSION = makeSymbol("SET-AFTER-AGENDA-EXECUTE-EXPRESSION");

    static private final SubLList $list_alt819 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EXPRESSION")), list(makeSymbol("CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION-P"), makeSymbol("NEW-EXPRESSION"))), makeString("(SET-AFTER-AGENDA-EXECUTE-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("AFTER-AGENDA-EXECUTE-EXPRESSION"), makeSymbol("NEW-EXPRESSION")), list(makeSymbol("PWHEN"), makeSymbol("AFTER-AGENDA-EXECUTE-EXPRESSION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT"), makeSymbol("CYBLACK-DEFAPP-EXPRESSION")), makeSymbol("AFTER-AGENDA-EXECUTE-EXPRESSION"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-EXPRESSION")));

    static private final SubLSymbol $sym820$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    static private final SubLString $str_alt821$_SET_AFTER_AGENDA_EXECUTE_EXPRESS = makeString("(SET-AFTER-AGENDA-EXECUTE-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_SET_AFTER_AGENDA_EXECUTE_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-SET-AFTER-AGENDA-EXECUTE-EXPRESSION-METHOD");

    private static final SubLSymbol GET_ON_EMPTY_AGENDA_EXPRESSION = makeSymbol("GET-ON-EMPTY-AGENDA-EXPRESSION");

    static private final SubLList $list_alt824 = list(list(RET, makeSymbol("ON-EMPTY-AGENDA-EXPRESSION")));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_ON_EMPTY_AGENDA_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-ON-EMPTY-AGENDA-EXPRESSION-METHOD");

    private static final SubLSymbol SET_ON_EMPTY_AGENDA_EXPRESSION = makeSymbol("SET-ON-EMPTY-AGENDA-EXPRESSION");

    static private final SubLList $list_alt827 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-EXPRESSION")), list(makeSymbol("CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION-P"), makeSymbol("NEW-EXPRESSION"))), makeString("(SET-ON-EMPTY-AGENDA-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("ON-EMPTY-AGENDA-EXPRESSION"), makeSymbol("NEW-EXPRESSION")), list(makeSymbol("PWHEN"), makeSymbol("ON-EMPTY-AGENDA-EXPRESSION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT"), makeSymbol("CYBLACK-DEFAPP-EXPRESSION")), makeSymbol("ON-EMPTY-AGENDA-EXPRESSION"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-EXPRESSION")));

    static private final SubLSymbol $sym828$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    static private final SubLString $str_alt829$_SET_ON_EMPTY_AGENDA_EXPRESSION__ = makeString("(SET-ON-EMPTY-AGENDA-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_SET_ON_EMPTY_AGENDA_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-SET-ON-EMPTY-AGENDA-EXPRESSION-METHOD");

    private static final SubLSymbol GET_ON_STARTUP_EXPRESSION = makeSymbol("GET-ON-STARTUP-EXPRESSION");

    static private final SubLList $list_alt832 = list(list(RET, makeSymbol("ON-STARTUP-EXPRESSION")));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_ON_STARTUP_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-ON-STARTUP-EXPRESSION-METHOD");

    private static final SubLSymbol SET_ON_STARTUP_EXPRESSION = makeSymbol("SET-ON-STARTUP-EXPRESSION");

    static private final SubLList $list_alt835 = list(makeSymbol("NEW-ON-STARTUP-EXPRESSION"));

    static private final SubLList $list_alt836 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-ON-STARTUP-EXPRESSION")), list(makeSymbol("CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION-P"), makeSymbol("NEW-ON-STARTUP-EXPRESSION"))), makeString("(SET-ON-STARTUP-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-ON-STARTUP-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("ON-STARTUP-EXPRESSION"), makeSymbol("NEW-ON-STARTUP-EXPRESSION")), list(makeSymbol("PWHEN"), makeSymbol("ON-STARTUP-EXPRESSION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT"), makeSymbol("CYBLACK-DEFAPP-EXPRESSION")), makeSymbol("ON-STARTUP-EXPRESSION"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-ON-STARTUP-EXPRESSION")));

    static private final SubLSymbol $sym837$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    static private final SubLString $str_alt838$_SET_ON_STARTUP_EXPRESSION__S____ = makeString("(SET-ON-STARTUP-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_SET_ON_STARTUP_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-SET-ON-STARTUP-EXPRESSION-METHOD");

    private static final SubLSymbol GET_ON_SHUTDOWN_EXPRESSION = makeSymbol("GET-ON-SHUTDOWN-EXPRESSION");

    static private final SubLList $list_alt841 = list(list(RET, makeSymbol("ON-SHUTDOWN-EXPRESSION")));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_ON_SHUTDOWN_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-ON-SHUTDOWN-EXPRESSION-METHOD");

    private static final SubLSymbol SET_ON_SHUTDOWN_EXPRESSION = makeSymbol("SET-ON-SHUTDOWN-EXPRESSION");

    static private final SubLList $list_alt844 = list(makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION"));

    static private final SubLList $list_alt845 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION")), list(makeSymbol("CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION-P"), makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION"))), makeString("(SET-ON-SHUTDOWN-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("ON-SHUTDOWN-EXPRESSION"), makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION")), list(makeSymbol("PWHEN"), makeSymbol("ON-SHUTDOWN-EXPRESSION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT"), makeSymbol("CYBLACK-DEFAPP-EXPRESSION")), makeSymbol("ON-SHUTDOWN-EXPRESSION"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-ON-SHUTDOWN-EXPRESSION")));

    static private final SubLSymbol $sym846$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    static private final SubLString $str_alt847$_SET_ON_SHUTDOWN_EXPRESSION__S___ = makeString("(SET-ON-SHUTDOWN-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_SET_ON_SHUTDOWN_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-SET-ON-SHUTDOWN-EXPRESSION-METHOD");

    private static final SubLSymbol GET_ON_QUIESCENCE_EXPRESSION = makeSymbol("GET-ON-QUIESCENCE-EXPRESSION");

    static private final SubLList $list_alt850 = list(list(RET, makeSymbol("ON-QUIESCENCE-EXPRESSION")));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_ON_QUIESCENCE_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-ON-QUIESCENCE-EXPRESSION-METHOD");

    private static final SubLSymbol SET_ON_QUIESCENCE_EXPRESSION = makeSymbol("SET-ON-QUIESCENCE-EXPRESSION");

    static private final SubLList $list_alt853 = list(makeSymbol("NEW-ON-QUIESCENCE-EXPRESSION"));

    static private final SubLList $list_alt854 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-ON-QUIESCENCE-EXPRESSION")), list(makeSymbol("CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION-P"), makeSymbol("NEW-ON-QUIESCENCE-EXPRESSION"))), makeString("(SET-ON-QUIESCENCE-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION."), makeSymbol("SELF"), makeSymbol("NEW-ON-QUIESCENCE-EXPRESSION")), list(makeSymbol("CSETQ"), makeSymbol("ON-QUIESCENCE-EXPRESSION"), makeSymbol("NEW-ON-QUIESCENCE-EXPRESSION")), list(makeSymbol("PWHEN"), makeSymbol("ON-QUIESCENCE-EXPRESSION"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-PARENT"), makeSymbol("CYBLACK-DEFAPP-EXPRESSION")), makeSymbol("ON-QUIESCENCE-EXPRESSION"), makeSymbol("SELF"))), list(RET, makeSymbol("NEW-ON-QUIESCENCE-EXPRESSION")));

    static private final SubLSymbol $sym855$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    static private final SubLString $str_alt856$_SET_ON_QUIESCENCE_EXPRESSION__S_ = makeString("(SET-ON-QUIESCENCE-EXPRESSION ~S): ~S is not an instance of CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION.");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_SET_ON_QUIESCENCE_EXPRESSION_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-SET-ON-QUIESCENCE-EXPRESSION-METHOD");

    private static final SubLSymbol GET_DEFAULT_BASE_CLASS = makeSymbol("GET-DEFAULT-BASE-CLASS");

    static private final SubLList $list_alt859 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSB-INFO"), list(makeSymbol("GET-KSB-INFO"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("KSB-INFO"), list(makeSymbol("CLET"), list(list(makeSymbol("BASE-CLASS"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DEFAULT-APPLICATION-BASE-CLASS"), makeSymbol("CYBLACK-KSB-INFO")), makeSymbol("KSB-INFO")))), list(makeSymbol("PWHEN"), makeSymbol("BASE-CLASS"), list(makeSymbol("PIF"), list(makeSymbol("GET-MONITORED-DATATYPES"), makeSymbol("SELF")), list(makeSymbol("PIF"), list(EQ, makeSymbol("BASE-CLASS"), list(QUOTE, makeSymbol("CYBLACK-DEFAPP-BASE"))), list(RET, list(QUOTE, makeSymbol("CYBLACK-DEFAPP-MONITOR-BASE"))), list(makeSymbol("PIF"), list(EQ, makeSymbol("BASE-CLASS"), list(QUOTE, makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE"))), list(RET, list(QUOTE, makeSymbol("CYBLACK-DEFAPP-MONITOR-EXTERNAL-BASE"))), list(RET, makeSymbol("BASE-CLASS")))), list(RET, makeSymbol("BASE-CLASS")))))), list(RET, list(QUOTE, makeSymbol("CYBLACK-DEFAPP-EXTERNAL-BASE")))));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_DEFAULT_BASE_CLASS_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-DEFAULT-BASE-CLASS-METHOD");

    private static final SubLSymbol GET_BLACKBOARD_INFO = makeSymbol("GET-BLACKBOARD-INFO");

    static private final SubLList $list_alt862 = list(list(makeSymbol("PWHEN"), makeSymbol("BLACKBOARD-EXPRESSION"), list(RET, list(makeSymbol("CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-GET-BLACKBOARD-INFO-METHOD"), makeSymbol("BLACKBOARD-EXPRESSION")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_BLACKBOARD_INFO_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-BLACKBOARD-INFO-METHOD");



    static private final SubLList $list_alt865 = list(list(makeSymbol("PWHEN"), makeSymbol("KSB-EXPRESSION"), list(RET, list(makeSymbol("CYBLACK-DEFAPP-KSB-EXPRESSION-GET-KSB-INFO-METHOD"), makeSymbol("KSB-EXPRESSION")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_GET_KSB_INFO_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-GET-KSB-INFO-METHOD");

    private static final SubLSymbol COMPILE_TO_INITIALIZE_METHOD_BODY = makeSymbol("COMPILE-TO-INITIALIZE-METHOD-BODY");

    static private final SubLList $list_alt868 = list(list(makeSymbol("CLET"), list(list(makeSymbol("BLACKBOARD-INFO"), list(makeSymbol("GET-BLACKBOARD-INFO"), makeSymbol("SELF"))), list(makeSymbol("KSB-INFO"), list(makeSymbol("GET-KSB-INFO"), makeSymbol("SELF")))), list(RET, list(makeSymbol("BQ-APPEND"), list(makeSymbol("FIF"), makeSymbol("BLACKBOARD-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("COMPILE-TO-SUBTYPE-EXPRESSIONS"), makeSymbol("CYBLACK-BLACKBOARD-INFO")), makeSymbol("BLACKBOARD-INFO")), NIL), list(makeSymbol("FIF"), makeSymbol("KSB-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("COMPILE-TO-KSB-INSTALLATION-EXPRESSIONS"), makeSymbol("CYBLACK-KSB-INFO")), makeSymbol("KSB-INFO")), NIL), NIL))));

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_COMPILE_TO_INITIALIZE_METHOD_BODY_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-COMPILE-TO-INITIALIZE-METHOD-BODY-METHOD");

    private static final SubLSymbol COMPILE_TO_USER_ON_STARTUP_METHOD_BODY = makeSymbol("COMPILE-TO-USER-ON-STARTUP-METHOD-BODY");

    static private final SubLList $list_alt871 = list(list(makeSymbol("PWHEN"), makeSymbol("ON-STARTUP-EXPRESSION"), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ON-STARTUP-EXPRESSION"), list(QUOTE, makeSymbol("COMPILE-TO-BODY"))))), list(RET, NIL));

    static private final SubLSymbol $sym872$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    private static final SubLSymbol COMPILE_TO_BODY = makeSymbol("COMPILE-TO-BODY");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_COMPILE_TO_USER_ON_STARTUP_METHOD_BODY_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-COMPILE-TO-USER-ON-STARTUP-METHOD-BODY-METHOD");

    private static final SubLSymbol COMPILE_TO_USER_ON_SHUTDOWN_METHOD = makeSymbol("COMPILE-TO-USER-ON-SHUTDOWN-METHOD");

    static private final SubLList $list_alt876 = list(list(makeSymbol("PWHEN"), makeSymbol("ON-SHUTDOWN-EXPRESSION"), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN-EXPRESSION"), list(QUOTE, makeSymbol("COMPILE-TO-BODY"))))), list(RET, NIL));

    static private final SubLSymbol $sym877$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_COMPILE_TO_USER_ON_SHUTDOWN_METHOD_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-COMPILE-TO-USER-ON-SHUTDOWN-METHOD-METHOD");

    private static final SubLSymbol COMPILE_TO_ON_QUIESCENCE_METHOD = makeSymbol("COMPILE-TO-ON-QUIESCENCE-METHOD");

    static private final SubLList $list_alt880 = list(list(makeSymbol("PWHEN"), makeSymbol("ON-QUIESCENCE-EXPRESSION"), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ON-QUIESCENCE-EXPRESSION"), list(QUOTE, makeSymbol("COMPILE-TO-BODY"))))));

    static private final SubLSymbol $sym881$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_COMPILE_TO_ON_QUIESCENCE_METHOD_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-COMPILE-TO-ON-QUIESCENCE-METHOD-METHOD");

    private static final SubLSymbol COMPILE_TO_ON_EMPTY_AGENDA_METHOD = makeSymbol("COMPILE-TO-ON-EMPTY-AGENDA-METHOD");

    static private final SubLList $list_alt884 = list(list(makeSymbol("PWHEN"), makeSymbol("ON-EMPTY-AGENDA-EXPRESSION"), list(RET, list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("ON-EMPTY-AGENDA-EXPRESSION"), list(QUOTE, makeSymbol("COMPILE-TO-BODY"))))), list(RET, NIL));

    static private final SubLSymbol $sym885$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BODY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_COMPILE_TO_ON_EMPTY_AGENDA_METHOD_METHOD = makeSymbol("CYBLACK-DEFAPP-BODY-COMPILE-TO-ON-EMPTY-AGENDA-METHOD-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION");

    static private final SubLList $list_alt888 = list(list(makeSymbol("BLACKBOARD-IDENTIFIER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BLACKBOARD-IDENTIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BLACKBOARD-IDENTIFIER"), list(makeSymbol("NEW-BLACKBOARD-IDENTIFIER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BLACKBOARD-INFO"), NIL, makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym890$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-CLASS");

    static private final SubLSymbol $sym891$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt892 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD-IDENTIFIER"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym893$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-INITIALIZE-METHOD");

    static private final SubLList $list_alt895 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:BLACKBOARD ~S)"), makeSymbol("BLACKBOARD-IDENTIFIER")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym896$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-METHOD");

    static private final SubLString $str_alt897$__BLACKBOARD__S_ = makeString("(:BLACKBOARD ~S)");

    private static final SubLSymbol CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol GET_BLACKBOARD_IDENTIFIER = makeSymbol("GET-BLACKBOARD-IDENTIFIER");

    static private final SubLList $list_alt900 = list(list(RET, makeSymbol("BLACKBOARD-IDENTIFIER")));

    static private final SubLSymbol $sym901$CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_GET_BLACKBOARD_IDENTIFIER_ME = makeSymbol("CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-GET-BLACKBOARD-IDENTIFIER-METHOD");

    private static final SubLSymbol SET_BLACKBOARD_IDENTIFIER = makeSymbol("SET-BLACKBOARD-IDENTIFIER");

    static private final SubLList $list_alt903 = list(makeSymbol("NEW-BLACKBOARD-IDENTIFIER"));

    static private final SubLList $list_alt904 = list(list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-BLACKBOARD-IDENTIFIER")), makeString("(SET-BLACKBOARD-IDENTIFIER ~S): ~S is not a valid blackboard identifier.  A symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-BLACKBOARD-IDENTIFIER")), list(makeSymbol("PWHEN"), makeSymbol("NEW-BLACKBOARD-IDENTIFIER"), list(makeSymbol("CYBLACK-WARN"), list(makeSymbol("CYBLACK-GET-BLACKBOARD-INFO"), makeSymbol("NEW-BLACKBOARD-IDENTIFIER")), makeString("(SET-BLACKBOARD-IDENTIFIER ~S): ~S has not be defined by the DEFINE-BLACKBOARD special form."), makeSymbol("SELF"), makeSymbol("NEW-BLACKBOARD-IDENTIFIER"))), list(makeSymbol("CSETQ"), makeSymbol("BLACKBOARD-IDENTIFIER"), makeSymbol("NEW-BLACKBOARD-IDENTIFIER")), list(RET, makeSymbol("NEW-BLACKBOARD-IDENTIFIER")));

    static private final SubLSymbol $sym905$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-METHOD");

    static private final SubLString $str_alt906$_SET_BLACKBOARD_IDENTIFIER__S____ = makeString("(SET-BLACKBOARD-IDENTIFIER ~S): ~S is not a valid blackboard identifier.  A symbol was expected.");

    static private final SubLString $str_alt907$_SET_BLACKBOARD_IDENTIFIER__S____ = makeString("(SET-BLACKBOARD-IDENTIFIER ~S): ~S has not be defined by the DEFINE-BLACKBOARD special form.");

    static private final SubLSymbol $sym908$CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_SET_BLACKBOARD_IDENTIFIER_ME = makeSymbol("CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-SET-BLACKBOARD-IDENTIFIER-METHOD");

    static private final SubLList $list_alt909 = list(list(makeSymbol("PWHEN"), makeSymbol("BLACKBOARD-IDENTIFIER"), list(RET, list(makeSymbol("CYBLACK-GET-BLACKBOARD-INFO"), makeSymbol("BLACKBOARD-IDENTIFIER")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_DEFAPP_BLACKBOARD_EXPRESSION_GET_BLACKBOARD_INFO_METHOD = makeSymbol("CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION-GET-BLACKBOARD-INFO-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_KSB_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-KSB-EXPRESSION");

    static private final SubLList $list_alt912 = list(list(makeSymbol("KSB-IDENTIFIER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSB-IDENTIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-KSB-IDENTIFIER"), list(makeSymbol("NEW-KSB-IDENTIFIER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSB-INFO"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_KSB_EXPRESSION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-KSB-EXPRESSION-CLASS");

    static private final SubLSymbol $sym915$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_KSB_EXPRESSION_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-KSB-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt916 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("KSB-IDENTIFIER"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym917$OUTER_CATCH_FOR_CYBLACK_DEFAPP_KSB_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-KSB-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_KSB_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-KSB-EXPRESSION-INITIALIZE-METHOD");

    static private final SubLList $list_alt919 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:KNOWLEDGE-SOURCE-BATTERY ~S)"), makeSymbol("KSB-IDENTIFIER")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt920$__KNOWLEDGE_SOURCE_BATTERY__S_ = makeString("(:KNOWLEDGE-SOURCE-BATTERY ~S)");

    private static final SubLSymbol CYBLACK_DEFAPP_KSB_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-KSB-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol GET_KSB_IDENTIFIER = makeSymbol("GET-KSB-IDENTIFIER");

    static private final SubLList $list_alt923 = list(list(RET, makeSymbol("KSB-IDENTIFIER")));

    private static final SubLSymbol CYBLACK_DEFAPP_KSB_EXPRESSION_GET_KSB_IDENTIFIER_METHOD = makeSymbol("CYBLACK-DEFAPP-KSB-EXPRESSION-GET-KSB-IDENTIFIER-METHOD");

    private static final SubLSymbol SET_KSB_IDENTIFIER = makeSymbol("SET-KSB-IDENTIFIER");

    static private final SubLList $list_alt926 = list(makeSymbol("NEW-KSB-IDENTIFIER"));

    static private final SubLList $list_alt927 = list(list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-KSB-IDENTIFIER")), makeString("(SET-KSB-IDENTIFIER ~S): ~S is not a valid KSB identifier.  A symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-KSB-IDENTIFIER")), list(makeSymbol("CSETQ"), makeSymbol("KSB-IDENTIFIER"), makeSymbol("NEW-KSB-IDENTIFIER")), list(RET, makeSymbol("NEW-KSB-IDENTIFIER")));

    static private final SubLSymbol $sym928$OUTER_CATCH_FOR_CYBLACK_DEFAPP_KSB_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-KSB-EXPRESSION-METHOD");

    static private final SubLString $str_alt929$_SET_KSB_IDENTIFIER__S____S_is_no = makeString("(SET-KSB-IDENTIFIER ~S): ~S is not a valid KSB identifier.  A symbol was expected.");

    private static final SubLSymbol CYBLACK_DEFAPP_KSB_EXPRESSION_SET_KSB_IDENTIFIER_METHOD = makeSymbol("CYBLACK-DEFAPP-KSB-EXPRESSION-SET-KSB-IDENTIFIER-METHOD");

    static private final SubLList $list_alt931 = list(list(makeSymbol("PWHEN"), makeSymbol("KSB-IDENTIFIER"), list(RET, list(makeSymbol("CYBLACK-GET-KSB-INFO"), makeSymbol("KSB-IDENTIFIER")))), list(RET, NIL));

    static private final SubLSymbol $sym932$OUTER_CATCH_FOR_CYBLACK_DEFAPP_KSB_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-KSB-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_KSB_EXPRESSION_GET_KSB_INFO_METHOD = makeSymbol("CYBLACK-DEFAPP-KSB-EXPRESSION-GET-KSB-INFO-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-AGENDA-EXPRESSION");

    static private final SubLList $list_alt935 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA-CLASS"), NIL, makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym936$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AGENDA_EXPRESSION_CLAS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AGENDA-EXPRESSION-CLASS");

    static private final SubLSymbol $sym937$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AGENDA_EXPRESSION_INST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AGENDA-EXPRESSION-INSTANCE");



    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_EXPRESSION_GET_AGENDA_CLASS_METHOD = makeSymbol("CYBLACK-DEFAPP-AGENDA-EXPRESSION-GET-AGENDA-CLASS-METHOD");

    static private final SubLList $list_alt940 = list(makeKeyword("SIMPLE-QUEUE"), makeKeyword("SIMPLE-STACK"), makeKeyword("SIMPLE-HEURISTIC-QUEUE"));

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_TYPE = makeSymbol("CYBLACK-DEFAPP-AGENDA-TYPE");

    private static final SubLSymbol ENCODE_CYBLACK_DEFAPP_AGENDA_TYPE = makeSymbol("ENCODE-CYBLACK-DEFAPP-AGENDA-TYPE");

    private static final SubLSymbol DECODE_CYBLACK_DEFAPP_AGENDA_TYPE = makeSymbol("DECODE-CYBLACK-DEFAPP-AGENDA-TYPE");

    private static final SubLSymbol CYBLACK_DEFAPP_AGENDA_TYPE_P = makeSymbol("CYBLACK-DEFAPP-AGENDA-TYPE-P");

    private static final SubLSymbol CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION");

    static private final SubLList $list_alt946 = list(list(makeSymbol("AGENDA-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-AGENDA-TYPE"), list(makeSymbol("NEW-AGENDA-TYPE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA-CLASS"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol AGENDA_TYPE = makeSymbol("AGENDA-TYPE");

    static private final SubLSymbol $sym948$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-CLASS");

    static private final SubLSymbol $sym949$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPR = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt950 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("AGENDA-TYPE"), makeKeyword("SIMPLE-QUEUE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym951$OUTER_CATCH_FOR_CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_METHO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-METHOD");

    private static final SubLSymbol $SIMPLE_QUEUE = makeKeyword("SIMPLE-QUEUE");

    private static final SubLSymbol CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-INITIALIZE-METHOD");

    static private final SubLList $list_alt954 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:AGENDA ~S)"), makeSymbol("AGENDA-TYPE")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt955$__AGENDA__S_ = makeString("(:AGENDA ~S)");

    private static final SubLSymbol CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol GET_AGENDA_TYPE = makeSymbol("GET-AGENDA-TYPE");

    static private final SubLList $list_alt958 = list(list(RET, makeSymbol("AGENDA-TYPE")));

    static private final SubLSymbol $sym959$CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_GET_AGENDA_TYPE_METHO = makeSymbol("CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-GET-AGENDA-TYPE-METHOD");

    private static final SubLSymbol SET_AGENDA_TYPE = makeSymbol("SET-AGENDA-TYPE");

    static private final SubLList $list_alt961 = list(makeSymbol("NEW-AGENDA-TYPE"));

    static private final SubLList $list_alt962 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-AGENDA-TYPE")), list(makeSymbol("CYBLACK-DEFAPP-AGENDA-TYPE-P"), makeSymbol("NEW-AGENDA-TYPE"))), makeString("(SET-AGENDA-TYPE ~S): ~S is not a member of the CYBLACK-DEFAPP-AGENDA-TYPE enumeration."), makeSymbol("SELF"), makeSymbol("NEW-AGENDA-TYPE")), list(makeSymbol("CSETQ"), makeSymbol("AGENDA-TYPE"), makeSymbol("NEW-AGENDA-TYPE")), list(RET, makeSymbol("NEW-AGENDA-TYPE")));

    static private final SubLSymbol $sym963$OUTER_CATCH_FOR_CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_METHO = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-METHOD");

    static private final SubLString $str_alt964$_SET_AGENDA_TYPE__S____S_is_not_a = makeString("(SET-AGENDA-TYPE ~S): ~S is not a member of the CYBLACK-DEFAPP-AGENDA-TYPE enumeration.");

    static private final SubLSymbol $sym965$CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_SET_AGENDA_TYPE_METHO = makeSymbol("CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-SET-AGENDA-TYPE-METHOD");

    static private final SubLList $list_alt966 = list(list(makeSymbol("PCASE"), makeSymbol("AGENDA-TYPE"), list(makeKeyword("SIMPLE-QUEUE"), list(RET, list(QUOTE, makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE")))), list(makeKeyword("SIMPLE-HEURISTIC-QUEUE"), list(RET, list(QUOTE, makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE")))), list(makeSymbol("OTHERWISE"), list(RET, NIL))));

    private static final SubLSymbol $SIMPLE_HEURISTIC_QUEUE = makeKeyword("SIMPLE-HEURISTIC-QUEUE");

    static private final SubLSymbol $sym968$CYBLACK_DEFAPP_PREDEFINED_AGENDA_EXPRESSION_GET_AGENDA_CLASS_METH = makeSymbol("CYBLACK-DEFAPP-PREDEFINED-AGENDA-EXPRESSION-GET-AGENDA-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION");

    static private final SubLList $list_alt970 = list(list(makeSymbol("AGENDA-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AGENDA-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-AGENDA-CLASS"), list(makeSymbol("NEW-AGENDA-CLASS")), makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym971$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-CLASS");

    static private final SubLSymbol $sym972$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt973 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("AGENDA-CLASS"), list(QUOTE, makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE"))), list(RET, NIL));

    static private final SubLSymbol $sym974$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-INITIALIZE-METHOD");

    static private final SubLList $list_alt976 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:AGENDA ~S)"), makeSymbol("AGENDA-CLASS")), list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-PRINT-METHOD");

    static private final SubLList $list_alt978 = list(list(RET, makeSymbol("AGENDA-CLASS")));

    private static final SubLSymbol CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_GET_AGENDA_CLASS_METHOD = makeSymbol("CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-GET-AGENDA-CLASS-METHOD");

    private static final SubLSymbol SET_AGENDA_CLASS = makeSymbol("SET-AGENDA-CLASS");

    static private final SubLList $list_alt981 = list(makeSymbol("NEW-AGENDA-CLASS"));

    static private final SubLList $list_alt982 = list(list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-AGENDA-CLASS")), makeString("(SET-AGENDA-CLASS ~S): ~S is not a valid agenda class.  A symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-AGENDA-CLASS")), list(makeSymbol("CYBLACK-WARN"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-AGENDA-CLASS")), list(makeSymbol("CLASSES-IMPLEMENTS-P"), makeSymbol("NEW-AGENDA-CLASS"), list(QUOTE, makeSymbol("CYBLACK-AGENDA")))), makeString("(SET-AGENDA-CLASS ~S): ~S does not implement the CYBLACK-AGENDA interface."), makeSymbol("SELF"), makeSymbol("NEW-AGENDA-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("AGENDA-CLASS"), makeSymbol("NEW-AGENDA-CLASS")), list(RET, makeSymbol("NEW-AGENDA-CLASS")));

    static private final SubLSymbol $sym983$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-METHOD");

    static private final SubLString $str_alt984$_SET_AGENDA_CLASS__S____S_is_not_ = makeString("(SET-AGENDA-CLASS ~S): ~S is not a valid agenda class.  A symbol was expected.");



    static private final SubLString $str_alt986$_SET_AGENDA_CLASS__S____S_does_no = makeString("(SET-AGENDA-CLASS ~S): ~S does not implement the CYBLACK-AGENDA interface.");

    private static final SubLSymbol CYBLACK_DEFAPP_CUSTOM_AGENDA_EXPRESSION_SET_AGENDA_CLASS_METHOD = makeSymbol("CYBLACK-DEFAPP-CUSTOM-AGENDA-EXPRESSION-SET-AGENDA-CLASS-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXPRESSION");

    static private final SubLList $list_alt989 = list(list(makeSymbol("DATATYPE-NAMES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATATYPE-NAMES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DATATYPE-NAMES"), list(makeSymbol("NEW-DATATYPE-NAMES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-DATATYPE-NAME"), list(makeSymbol("NEW-DATATYPE-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("IS-MONITORED-P"), list(makeSymbol("DATATYPE-NAME")), makeKeyword("PUBLIC")));



    static private final SubLSymbol $sym991$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_EXPRESSION_CLA = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-EXPRESSION-CLASS");

    static private final SubLSymbol $sym992$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_MONITOR_EXPRESSION_INS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-MONITOR-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt993 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-NAMES"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym994$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-MONITOR-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXPRESSION-INITIALIZE-METHOD");

    static private final SubLList $list_alt996 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:MONITOR ~S)"), makeSymbol("DATATYPE-NAMES")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt997$__MONITOR__S_ = makeString("(:MONITOR ~S)");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol GET_DATATYPE_NAMES = makeSymbol("GET-DATATYPE-NAMES");

    static private final SubLList $list_alt1000 = list(list(RET, makeSymbol("DATATYPE-NAMES")));

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXPRESSION_GET_DATATYPE_NAMES_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXPRESSION-GET-DATATYPE-NAMES-METHOD");

    private static final SubLSymbol SET_DATATYPE_NAMES = makeSymbol("SET-DATATYPE-NAMES");

    static private final SubLList $list_alt1003 = list(makeSymbol("NEW-DATATYPE-NAMES"));

    static private final SubLList $list_alt1004 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-DATATYPE-NAMES")), makeString("(SET-DATATYPE-NAMES ~S): ~S is not a valid list of datatype names.  ~\n     A list of strings was expected."), makeSymbol("SELF"), makeSymbol("NEW-DATATYPE-NAMES")), list(makeSymbol("CDOLIST"), list(makeSymbol("DATATYPE-NAME"), makeSymbol("NEW-DATATYPE-NAMES")), list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-DATATYPE-STRING-P"), makeSymbol("DATATYPE-NAME")), makeString("(SET-DATATYPE-NAMES ~S): ~S is not a valid datatype name.  ~\n       A string was expected."), makeSymbol("DATATYPE-NAME"))), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-NAMES"), list(makeSymbol("COPY-LIST"), makeSymbol("NEW-DATATYPE-NAMES"))), list(RET, makeSymbol("NEW-DATATYPE-NAMES")));

    static private final SubLSymbol $sym1005$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-MONITOR-EXPRESSION-METHOD");

    static private final SubLString $str_alt1006$_SET_DATATYPE_NAMES__S____S_is_no = makeString("(SET-DATATYPE-NAMES ~S): ~S is not a valid list of datatype names.  ~\n     A list of strings was expected.");

    static private final SubLString $str_alt1007$_SET_DATATYPE_NAMES__S____S_is_no = makeString("(SET-DATATYPE-NAMES ~S): ~S is not a valid datatype name.  ~\n       A string was expected.");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXPRESSION_SET_DATATYPE_NAMES_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXPRESSION-SET-DATATYPE-NAMES-METHOD");

    private static final SubLSymbol ADD_DATATYPE_NAME = makeSymbol("ADD-DATATYPE-NAME");

    static private final SubLList $list_alt1010 = list(makeSymbol("NEW-DATATYPE-NAME"));

    static private final SubLList $list_alt1011 = list(list(makeSymbol("MUST"), list(makeSymbol("CYBLACK-DATATYPE-STRING-P"), makeSymbol("NEW-DATATYPE-NAME")), makeString("(ADD-DATATYPE-NAME ~S): ~S is not a valid datatype name.  ~\n     A string was expected."), makeSymbol("SELF"), makeSymbol("NEW-DATATYPE-NAME")), list(makeSymbol("CSETQ"), makeSymbol("DATATYPE-NAMES"), list(makeSymbol("NCONC"), makeSymbol("DATATYPE-NAMES"), list(makeSymbol("LIST"), makeSymbol("NEW-DATATYPE-NAME")))), list(RET, makeSymbol("NEW-DATATYPE-NAME")));

    static private final SubLSymbol $sym1012$OUTER_CATCH_FOR_CYBLACK_DEFAPP_MONITOR_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-MONITOR-EXPRESSION-METHOD");

    static private final SubLString $str_alt1013$_ADD_DATATYPE_NAME__S____S_is_not = makeString("(ADD-DATATYPE-NAME ~S): ~S is not a valid datatype name.  ~\n     A string was expected.");

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXPRESSION_ADD_DATATYPE_NAME_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXPRESSION-ADD-DATATYPE-NAME-METHOD");

    private static final SubLSymbol IS_MONITORED_P = makeSymbol("IS-MONITORED-P");

    static private final SubLList $list_alt1016 = list(makeSymbol("DATATYPE-NAME"));

    static private final SubLList $list_alt1017 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("CURRENT-DATATYPE-NAME"), makeSymbol("DATATYPE-NAMES")), list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("DATATYPE-NAME"), makeSymbol("CURRENT-DATATYPE-NAME")), list(RET, T))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_DEFAPP_MONITOR_EXPRESSION_IS_MONITORED_P_METHOD = makeSymbol("CYBLACK-DEFAPP-MONITOR-EXPRESSION-IS-MONITORED-P-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_CODE_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-CODE-EXPRESSION");

    static private final SubLList $list_alt1020 = list(list(makeSymbol("BODY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BODY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-BODY"), list(makeSymbol("NEW-BODY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-BODY"), NIL, makeKeyword("PUBLIC")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_CODE_EXPRESSION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-CODE-EXPRESSION-CLASS");

    static private final SubLSymbol $sym1023$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_CODE_EXPRESSION_INSTAN = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-CODE-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt1024 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("BODY"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1025$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CODE_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-CODE-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_CODE_EXPRESSION_INITIALIZE_METHOD = makeSymbol("CYBLACK-DEFAPP-CODE-EXPRESSION-INITIALIZE-METHOD");

    private static final SubLSymbol GET_BODY = makeSymbol("GET-BODY");

    static private final SubLList $list_alt1028 = list(list(RET, makeSymbol("BODY")));

    private static final SubLSymbol CYBLACK_DEFAPP_CODE_EXPRESSION_GET_BODY_METHOD = makeSymbol("CYBLACK-DEFAPP-CODE-EXPRESSION-GET-BODY-METHOD");

    private static final SubLSymbol SET_BODY = makeSymbol("SET-BODY");

    static private final SubLList $list_alt1031 = list(makeSymbol("NEW-BODY"));

    static private final SubLList $list_alt1032 = list(list(makeSymbol("MUST"), list(makeSymbol("LISTP"), makeSymbol("NEW-BODY")), makeString("(SET-BODY ~S): ~S is not a valid code sequence."), makeSymbol("SELF"), makeSymbol("NEW-BODY")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXPRESSION"), makeSymbol("NEW-BODY")), list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("SYMBOLP"), makeSymbol("EXPRESSION")), list(makeSymbol("NUMBERP"), makeSymbol("EXPRESSION")), list(makeSymbol("STRINGP"), makeSymbol("EXPRESSION")), list(makeSymbol("CAND"), list(makeSymbol("CONSP"), makeSymbol("EXPRESSION")), list(makeSymbol("SYMBOLP"), list(makeSymbol("CAR"), makeSymbol("EXPRESSION"))))), makeString("(SET-BODY ~S): ~S is not a valid statement."), makeSymbol("SELF"), makeSymbol("EXPRESSION"))), list(makeSymbol("CSETQ"), makeSymbol("BODY"), list(makeSymbol("COPY-TREE"), makeSymbol("NEW-BODY"))), list(RET, makeSymbol("NEW-BODY")));

    static private final SubLSymbol $sym1033$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CODE_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-CODE-EXPRESSION-METHOD");

    static private final SubLString $str_alt1034$_SET_BODY__S____S_is_not_a_valid_ = makeString("(SET-BODY ~S): ~S is not a valid code sequence.");

    static private final SubLString $str_alt1035$_SET_BODY__S____S_is_not_a_valid_ = makeString("(SET-BODY ~S): ~S is not a valid statement.");

    private static final SubLSymbol CYBLACK_DEFAPP_CODE_EXPRESSION_SET_BODY_METHOD = makeSymbol("CYBLACK-DEFAPP-CODE-EXPRESSION-SET-BODY-METHOD");

    static private final SubLList $list_alt1037 = list(list(RET, list(makeSymbol("COPY-TREE"), makeSymbol("BODY"))));

    static private final SubLSymbol $sym1038$OUTER_CATCH_FOR_CYBLACK_DEFAPP_CODE_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-CODE-EXPRESSION-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_CODE_EXPRESSION_COMPILE_TO_BODY_METHOD = makeSymbol("CYBLACK-DEFAPP-CODE-EXPRESSION-COMPILE-TO-BODY-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-BEFORE-AGENDA-EXECUTE-EXPRESSION");

    static private final SubLList $list_alt1041 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")));

    static private final SubLSymbol $sym1042$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BEFORE-AGENDA-EXECUTE-EXPRESSION-CLASS");

    static private final SubLSymbol $sym1043$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-BEFORE-AGENDA-EXECUTE-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt1044 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:BEFORE-AGENDA-EXECUTE")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXPRESSION"), makeSymbol("BODY")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("EXPRESSION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1045$OUTER_CATCH_FOR_CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION_M = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-BEFORE-AGENDA-EXECUTE-EXPRESSION-METHOD");

    static private final SubLString $str_alt1046$__BEFORE_AGENDA_EXECUTE = makeString("(:BEFORE-AGENDA-EXECUTE");

    static private final SubLString $str_alt1047$__S = makeString(" ~S");

    static private final SubLString $str_alt1048$_ = makeString(")");

    private static final SubLSymbol CYBLACK_DEFAPP_BEFORE_AGENDA_EXECUTE_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-BEFORE-AGENDA-EXECUTE-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION");

    static private final SubLSymbol $sym1051$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_E = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION-CLASS");

    static private final SubLSymbol $sym1052$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_E = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt1053 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:AFTER-AGENDA-EXECUTE")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXPRESSION"), makeSymbol("BODY")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("EXPRESSION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1054$OUTER_CATCH_FOR_CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION_ME = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION-METHOD");

    static private final SubLString $str_alt1055$__AFTER_AGENDA_EXECUTE = makeString("(:AFTER-AGENDA-EXECUTE");

    private static final SubLSymbol CYBLACK_DEFAPP_AFTER_AGENDA_EXECUTE_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION");

    static private final SubLSymbol $sym1058$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRES = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION-CLASS");

    static private final SubLSymbol $sym1059$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRES = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt1060 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:ON-EMPTY-AGENDA")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXPRESSION"), makeSymbol("BODY")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("EXPRESSION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1061$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION-METHOD");

    static private final SubLString $str_alt1062$__ON_EMPTY_AGENDA = makeString("(:ON-EMPTY-AGENDA");

    private static final SubLSymbol CYBLACK_DEFAPP_ON_EMPTY_AGENDA_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION");

    static private final SubLSymbol $sym1065$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION-CLASS");

    static private final SubLSymbol $sym1066$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION_ = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt1067 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:ON-STARTUP")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXPRESSION"), makeSymbol("BODY")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("EXPRESSION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1068$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION-METHOD");

    static private final SubLString $str_alt1069$__ON_STARTUP = makeString("(:ON-STARTUP");

    private static final SubLSymbol CYBLACK_DEFAPP_ON_STARTUP_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION");

    static private final SubLSymbol $sym1072$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION-CLASS");

    static private final SubLSymbol $sym1073$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt1074 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:ON-SHUTDOWN")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXPRESSION"), makeSymbol("BODY")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("EXPRESSION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1075$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION-METHOD");

    static private final SubLString $str_alt1076$__ON_SHUTDOWN = makeString("(:ON-SHUTDOWN");

    private static final SubLSymbol CYBLACK_DEFAPP_ON_SHUTDOWN_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION-PRINT-METHOD");

    private static final SubLSymbol CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION = makeSymbol("CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION");

    static private final SubLSymbol $sym1079$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION-CLASS");

    static private final SubLSymbol $sym1080$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSI = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION-INSTANCE");

    static private final SubLList $list_alt1081 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(:ON-QUIESCENCE")), list(makeSymbol("CDOLIST"), list(makeSymbol("EXPRESSION"), makeSymbol("BODY")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" ~S"), makeSymbol("EXPRESSION"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(")")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1082$OUTER_CATCH_FOR_CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION-METHOD");

    static private final SubLString $str_alt1083$__ON_QUIESCENCE = makeString("(:ON-QUIESCENCE");

    private static final SubLSymbol CYBLACK_DEFAPP_ON_QUIESCENCE_EXPRESSION_PRINT_METHOD = makeSymbol("CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION-PRINT-METHOD");

    static private final SubLList $list_alt1085 = list(new SubLObject[]{ makeKeyword("BLACKBOARD"), makeKeyword("KNOWLEDGE-SOURCE-BATTERY"), makeKeyword("AGENDA"), makeKeyword("MONITOR"), makeKeyword("BEFORE-AGENDA-EXECUTE"), makeKeyword("AFTER-AGENDA-EXECUTE"), makeKeyword("ON-EMPTY-AGENDA"), makeKeyword("ON-STARTUP"), makeKeyword("ON-SHUTDOWN"), makeKeyword("ON-QUIESCENCE") });

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_KEY = makeSymbol("CYBLACK-DEFAPP-BODY-KEY");

    private static final SubLSymbol ENCODE_CYBLACK_DEFAPP_BODY_KEY = makeSymbol("ENCODE-CYBLACK-DEFAPP-BODY-KEY");

    private static final SubLSymbol DECODE_CYBLACK_DEFAPP_BODY_KEY = makeSymbol("DECODE-CYBLACK-DEFAPP-BODY-KEY");

    private static final SubLSymbol CYBLACK_DEFAPP_BODY_KEY_P = makeSymbol("CYBLACK-DEFAPP-BODY-KEY-P");

    static private final SubLString $str_alt1090$PARSE_CYBLACK_DEFAPP_BODY___S_is_ = makeString("PARSE-CYBLACK-DEFAPP-BODY: ~S is not a valid DEFINE-BLACKBOARD-APPLICATION body. ~\n     A list of the form ((:BLACKBOARD <blackboard identifier>) ~\n     (:KNOWLEDGE-SOURCE-BATTERY <knowledge source battery identifier>) ~\n     (:AGENDA <agenda type or class>) [(:ON-STARTUP <symbolic expression>*)] ~\n     [(:ON-SHUTDOWN <symbolic expression>*)] ~\n     [(:ON-QUIESCENCE <symbolic expression>*)]).");

    private static final SubLSymbol $BLACKBOARD = makeKeyword("BLACKBOARD");

    private static final SubLSymbol $KNOWLEDGE_SOURCE_BATTERY = makeKeyword("KNOWLEDGE-SOURCE-BATTERY");



    private static final SubLSymbol $MONITOR = makeKeyword("MONITOR");

    private static final SubLSymbol $BEFORE_AGENDA_EXECUTE = makeKeyword("BEFORE-AGENDA-EXECUTE");

    private static final SubLSymbol $AFTER_AGENDA_EXECUTE = makeKeyword("AFTER-AGENDA-EXECUTE");

    private static final SubLSymbol $ON_EMPTY_AGENDA = makeKeyword("ON-EMPTY-AGENDA");

    private static final SubLSymbol $ON_STARTUP = makeKeyword("ON-STARTUP");

    private static final SubLSymbol $ON_SHUTDOWN = makeKeyword("ON-SHUTDOWN");

    private static final SubLSymbol $ON_QUIESCENCE = makeKeyword("ON-QUIESCENCE");

    static private final SubLString $str_alt1101$PARSE_CYBLACK_DEFAPP_BLACKBOARD_E = makeString("PARSE-CYBLACK-DEFAPP-BLACKBOARD-EXPRESSION: ~S is not a valid blackboard expression. ~\n     A list of the form (:BLACKBOARD <blackboard identifier>) was expected.");

    static private final SubLString $str_alt1102$PARSE_CYBLACK_DEFAPP_KSB_EXPRESSI = makeString("PARSE-CYBLACK-DEFAPP-KSB-EXPRESSION: ~S is not a valid KSB expression. ~\n     A list of the form (:KNOWLEDGE-SOURCE-BATTERY <ksb identifier>) was expected.");

    static private final SubLString $str_alt1103$PARSE_CYBLACK_DEFAPP_AGENDA_EXPRE = makeString("PARSE-CYBLACK-DEFAPP-AGENDA-EXPRESSION: ~S is not a valid agenda expression. ~\n     A list of the form (:AGENDA <agenda type or class>) was expected.");

    static private final SubLString $str_alt1104$PARSE_CYBLACK_DEFAPP_AGENDA_EXPRE = makeString("PARSE-CYBLACK-DEFAPP-AGENDA-EXPRESSION: ~S is not a valid agenda type. ~\n              a member of the CYBLACK-DEFAPP-AGENDA-TYPE enumeration was expected.");

    static private final SubLString $str_alt1105$PARSE_CYBLACK_DEFAPP_AGENDA_EXPRE = makeString("PARSE-CYBLACK-DEFAPP-AGENDA-EXPRESSION: ~S does not implement the CYBLACK-AGENDA interface.");

    static private final SubLString $str_alt1106$PARSE_CYBLACK_DEFAPP_MONITOR_EXPR = makeString("PARSE-CYBLACK-DEFAPP-MONITOR-EXPRESSION: ~S is not a valid monitor expression.  ~\n     A list of the form (:MONITOR <type list>) was expected.");

    static private final SubLString $str_alt1107$PARSE_CYBLACK_DEFAPP_BEFORE_AGEND = makeString("PARSE-CYBLACK-DEFAPP-BEFORE-AGENDA-EXECUTE-EXPRESSION: ~S is not a valid \'on empty agenda\' expression. ~\n     A list of the form (:BEFORE-AGENDA-EXECUTE <symbolic expression>*) was expected.");

    static private final SubLString $str_alt1108$_PARSE_CYBLACK_DEFAPP_AFTER_AGEND = makeString("(PARSE-CYBLACK-DEFAPP-AFTER-AGENDA-EXECUTE-EXPRESSION: ~S is not a valid \'on empty agenda\' expression. ~\n     A list of the form (:AFTER-AGENDA-EXECUTE <symbolic expression>*) was expected.");

    static private final SubLString $str_alt1109$_PARSE_CYBLACK_DEFAPP_ON_EMPTY_AG = makeString("(PARSE-CYBLACK-DEFAPP-ON-EMPTY-AGENDA-EXPRESSION: ~S is not a valid \'on empty agenda\' expression. ~\n     A list of the form (:ON-EMPTY-AGENDA <symbolic expression>*) was expected.");

    static private final SubLString $str_alt1110$_PARSE_CYBLACK_DEFAPP_ON_STARTUP_ = makeString("(PARSE-CYBLACK-DEFAPP-ON-STARTUP-EXPRESSION: ~S is not a valid \'on startup\' expression.  ~\n     A list of the form (:ON-STARTUP <symbolic expression>*) was expected.");

    static private final SubLString $str_alt1111$_PARSE_CYBLACK_DEFAPP_ON_SHUTDOWN = makeString("(PARSE-CYBLACK-DEFAPP-ON-SHUTDOWN-EXPRESSION ~S is not a valid \'on shutdown\' expression.  ~\n     A list of the form (:ON-SHUTDOWN <symbolic expression>*) was expected.");

    static private final SubLString $str_alt1112$_PARSE_CYBLACK_DEFAPP_ON_QUIESCEN = makeString("(PARSE-CYBLACK-DEFAPP-ON-QUIESCENCE-EXPRESSION ~S is not a valid \'on shutdown\' expression.  ~\n     A list of the form (:ON-QUIESCENCE <symbolic expression>*) was expected.");

    private static final SubLSymbol CYBLACK_APP_INFO = makeSymbol("CYBLACK-APP-INFO");

    static private final SubLList $list_alt1114 = list(new SubLObject[]{ list(makeSymbol("APP-IDENTIFIER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APP-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APP-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APP-BODY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("APP-EXECUTABLE-FUNCTION-NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APP-IDENTIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APP-IDENTIFIER"), list(makeSymbol("NEW-APP-IDENTIFIER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APP-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APP-NAME"), list(makeSymbol("NEW-APP-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APP-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APP-CLASS"), list(makeSymbol("NEW-APP-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APP-BODY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APP-BODY"), list(makeSymbol("NEW-APP-BODY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APP-EXECUTABLE-FUNCTION-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APP-EXECUTABLE-FUNCTION-NAME"), list(makeSymbol("NEW-EXECUTABLE-FUNCTION-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MONITORED-DATATYPES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DEFAULT-BASE-CLASS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KSB-INFO"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-BLACKBOARD-INFO"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HAS-EXTERNAL-MODULES-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-INITIALIZE-METHOD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-GENERATED-ON-STARTUP-METHOD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-USER-ON-STARTUP-METHOD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-GENERATED-ON-SHUTDOWN-METHOD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-USER-ON-SHUTDOWN-METHOD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-ON-EMPTY-AGENDA-METHOD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-ON-QUIESCENCE-METHOD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COMPILE-TO-EXECUTABLE-FUNCTION"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol APP_EXECUTABLE_FUNCTION_NAME = makeSymbol("APP-EXECUTABLE-FUNCTION-NAME");





    private static final SubLSymbol APP_NAME = makeSymbol("APP-NAME");

    private static final SubLSymbol APP_IDENTIFIER = makeSymbol("APP-IDENTIFIER");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APP_INFO_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APP-INFO-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_APP_INFO_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-APP-INFO-INSTANCE");

    static private final SubLList $list_alt1122 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("APP-IDENTIFIER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("APP-NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("APP-CLASS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("APP-BODY"), NIL), list(makeSymbol("CSETQ"), makeSymbol("APP-EXECUTABLE-FUNCTION-NAME"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym1123$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    private static final SubLSymbol CYBLACK_APP_INFO_INITIALIZE_METHOD = makeSymbol("CYBLACK-APP-INFO-INITIALIZE-METHOD");

    static private final SubLList $list_alt1125 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("#<CYBLACK-APP-INFO(~S) ~S>"), makeSymbol("APP-IDENTIFIER"), makeSymbol("APP-BODY")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt1126$__CYBLACK_APP_INFO__S___S_ = makeString("#<CYBLACK-APP-INFO(~S) ~S>");

    private static final SubLSymbol CYBLACK_APP_INFO_PRINT_METHOD = makeSymbol("CYBLACK-APP-INFO-PRINT-METHOD");

    private static final SubLSymbol GET_APP_IDENTIFIER = makeSymbol("GET-APP-IDENTIFIER");

    static private final SubLList $list_alt1129 = list(list(RET, makeSymbol("APP-IDENTIFIER")));

    private static final SubLSymbol CYBLACK_APP_INFO_GET_APP_IDENTIFIER_METHOD = makeSymbol("CYBLACK-APP-INFO-GET-APP-IDENTIFIER-METHOD");

    private static final SubLSymbol SET_APP_IDENTIFIER = makeSymbol("SET-APP-IDENTIFIER");

    static private final SubLList $list_alt1132 = list(makeSymbol("NEW-APP-IDENTIFIER"));

    static private final SubLList $list_alt1133 = list(list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-APP-IDENTIFIER")), makeString("(SET-APP-IDENTIFIER ~S): ~S is not a valid application identifier. ~\n     A symbol was expected."), makeSymbol("SELF"), makeSymbol("NEW-APP-IDENTIFIER")), list(makeSymbol("CSETQ"), makeSymbol("APP-IDENTIFIER"), makeSymbol("NEW-APP-IDENTIFIER")), list(RET, makeSymbol("NEW-APP-IDENTIFIER")));

    static private final SubLSymbol $sym1134$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    static private final SubLString $str_alt1135$_SET_APP_IDENTIFIER__S____S_is_no = makeString("(SET-APP-IDENTIFIER ~S): ~S is not a valid application identifier. ~\n     A symbol was expected.");

    private static final SubLSymbol CYBLACK_APP_INFO_SET_APP_IDENTIFIER_METHOD = makeSymbol("CYBLACK-APP-INFO-SET-APP-IDENTIFIER-METHOD");

    private static final SubLSymbol GET_APP_NAME = makeSymbol("GET-APP-NAME");

    static private final SubLList $list_alt1138 = list(list(RET, makeSymbol("APP-NAME")));

    private static final SubLSymbol CYBLACK_APP_INFO_GET_APP_NAME_METHOD = makeSymbol("CYBLACK-APP-INFO-GET-APP-NAME-METHOD");

    private static final SubLSymbol SET_APP_NAME = makeSymbol("SET-APP-NAME");

    static private final SubLList $list_alt1141 = list(makeSymbol("NEW-APP-NAME"));

    static private final SubLList $list_alt1142 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APP-NAME")), list(makeSymbol("STRINGP"), makeSymbol("NEW-APP-NAME"))), makeString("(SET-APP-NAME ~S): ~S is not a valid application name. ~\n     A string was expected."), makeSymbol("SELF"), makeSymbol("NEW-APP-NAME")), list(makeSymbol("CSETQ"), makeSymbol("APP-NAME"), makeSymbol("NEW-APP-NAME")), list(RET, makeSymbol("NEW-APP-NAME")));

    static private final SubLSymbol $sym1143$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    static private final SubLString $str_alt1144$_SET_APP_NAME__S____S_is_not_a_va = makeString("(SET-APP-NAME ~S): ~S is not a valid application name. ~\n     A string was expected.");

    private static final SubLSymbol CYBLACK_APP_INFO_SET_APP_NAME_METHOD = makeSymbol("CYBLACK-APP-INFO-SET-APP-NAME-METHOD");

    private static final SubLSymbol GET_APP_CLASS = makeSymbol("GET-APP-CLASS");

    static private final SubLList $list_alt1147 = list(list(RET, makeSymbol("APP-CLASS")));

    private static final SubLSymbol CYBLACK_APP_INFO_GET_APP_CLASS_METHOD = makeSymbol("CYBLACK-APP-INFO-GET-APP-CLASS-METHOD");

    private static final SubLSymbol SET_APP_CLASS = makeSymbol("SET-APP-CLASS");

    static private final SubLList $list_alt1150 = list(makeSymbol("NEW-APP-CLASS"));

    static private final SubLList $list_alt1151 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APP-CLASS")), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-APP-CLASS"))), makeString("(SET-APP-CLASS ~S): ~S is not a valid application class."), makeSymbol("SELF"), makeSymbol("NEW-APP-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("APP-CLASS"), makeSymbol("NEW-APP-CLASS")), list(RET, makeSymbol("NEW-APP-CLASS")));

    static private final SubLSymbol $sym1152$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    static private final SubLString $str_alt1153$_SET_APP_CLASS__S____S_is_not_a_v = makeString("(SET-APP-CLASS ~S): ~S is not a valid application class.");

    private static final SubLSymbol CYBLACK_APP_INFO_SET_APP_CLASS_METHOD = makeSymbol("CYBLACK-APP-INFO-SET-APP-CLASS-METHOD");

    private static final SubLSymbol GET_APP_BODY = makeSymbol("GET-APP-BODY");

    static private final SubLList $list_alt1156 = list(list(RET, makeSymbol("APP-BODY")));

    private static final SubLSymbol CYBLACK_APP_INFO_GET_APP_BODY_METHOD = makeSymbol("CYBLACK-APP-INFO-GET-APP-BODY-METHOD");

    private static final SubLSymbol SET_APP_BODY = makeSymbol("SET-APP-BODY");

    static private final SubLList $list_alt1159 = list(makeSymbol("NEW-APP-BODY"));

    static private final SubLList $list_alt1160 = list(list(makeSymbol("MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APP-BODY")), list(makeSymbol("CYBLACK-DEFAPP-BODY-P"), makeSymbol("NEW-APP-BODY"))), makeString("(SET-APP-BODY ~S): ~S is not an instance of CYBLACK-DEFAPP-BODY."), makeSymbol("SELF"), makeSymbol("NEW-APP-BODY")), list(makeSymbol("CSETQ"), makeSymbol("APP-BODY"), makeSymbol("NEW-APP-BODY")), list(RET, makeSymbol("NEW-APP-BODY")));

    static private final SubLSymbol $sym1161$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    static private final SubLString $str_alt1162$_SET_APP_BODY__S____S_is_not_an_i = makeString("(SET-APP-BODY ~S): ~S is not an instance of CYBLACK-DEFAPP-BODY.");

    private static final SubLSymbol CYBLACK_APP_INFO_SET_APP_BODY_METHOD = makeSymbol("CYBLACK-APP-INFO-SET-APP-BODY-METHOD");

    private static final SubLSymbol GET_APP_EXECUTABLE_FUNCTION_NAME = makeSymbol("GET-APP-EXECUTABLE-FUNCTION-NAME");

    static private final SubLList $list_alt1165 = list(list(RET, makeSymbol("APP-EXECUTABLE-FUNCTION-NAME")));

    private static final SubLSymbol CYBLACK_APP_INFO_GET_APP_EXECUTABLE_FUNCTION_NAME_METHOD = makeSymbol("CYBLACK-APP-INFO-GET-APP-EXECUTABLE-FUNCTION-NAME-METHOD");

    private static final SubLSymbol SET_APP_EXECUTABLE_FUNCTION_NAME = makeSymbol("SET-APP-EXECUTABLE-FUNCTION-NAME");

    static private final SubLList $list_alt1168 = list(makeSymbol("NEW-EXECUTABLE-FUNCTION-NAME"));

    static private final SubLList $list_alt1169 = list(list(makeSymbol("MUST"), list(makeSymbol("SYMBOLP"), makeSymbol("NEW-EXECUTABLE-FUNCTION-NAME")), makeString("(SET-APP-EXECUTABLE-FUNCTION-NAME ~S): ~S is not a symbol."), makeSymbol("SELF"), makeSymbol("NEW-EXECUTABLE-FUNCTION-NAME")), list(makeSymbol("CSETQ"), makeSymbol("APP-EXECUTABLE-FUNCTION-NAME"), makeSymbol("NEW-EXECUTABLE-FUNCTION-NAME")), list(RET, makeSymbol("NEW-EXECUTABLE-FUNCTION-NAME")));

    static private final SubLSymbol $sym1170$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    static private final SubLString $str_alt1171$_SET_APP_EXECUTABLE_FUNCTION_NAME = makeString("(SET-APP-EXECUTABLE-FUNCTION-NAME ~S): ~S is not a symbol.");

    private static final SubLSymbol CYBLACK_APP_INFO_SET_APP_EXECUTABLE_FUNCTION_NAME_METHOD = makeSymbol("CYBLACK-APP-INFO-SET-APP-EXECUTABLE-FUNCTION-NAME-METHOD");

    static private final SubLList $list_alt1173 = list(list(makeSymbol("PWHEN"), makeSymbol("APP-BODY"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-MONITORED-DATATYPES"), makeSymbol("CYBLACK-DEFAPP-BODY")), makeSymbol("APP-BODY")))), list(RET, NIL));

    static private final SubLSymbol $sym1174$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    private static final SubLSymbol CYBLACK_APP_INFO_GET_MONITORED_DATATYPES_METHOD = makeSymbol("CYBLACK-APP-INFO-GET-MONITORED-DATATYPES-METHOD");

    static private final SubLList $list_alt1176 = list(list(makeSymbol("PWHEN"), makeSymbol("APP-BODY"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-DEFAULT-BASE-CLASS"), makeSymbol("CYBLACK-DEFAPP-BODY")), makeSymbol("APP-BODY")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_APP_INFO_GET_DEFAULT_BASE_CLASS_METHOD = makeSymbol("CYBLACK-APP-INFO-GET-DEFAULT-BASE-CLASS-METHOD");

    static private final SubLList $list_alt1178 = list(list(makeSymbol("PWHEN"), makeSymbol("APP-BODY"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-KSB-INFO"), makeSymbol("CYBLACK-DEFAPP-BODY")), makeSymbol("APP-BODY")))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_APP_INFO_GET_KSB_INFO_METHOD = makeSymbol("CYBLACK-APP-INFO-GET-KSB-INFO-METHOD");

    static private final SubLList $list_alt1180 = list(list(makeSymbol("PWHEN"), makeSymbol("APP-BODY"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-BLACKBOARD-INFO"), makeSymbol("CYBLACK-DEFAPP-BODY")), makeSymbol("APP-BODY")))), list(RET, NIL));

    static private final SubLSymbol $sym1181$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    private static final SubLSymbol CYBLACK_APP_INFO_GET_BLACKBOARD_INFO_METHOD = makeSymbol("CYBLACK-APP-INFO-GET-BLACKBOARD-INFO-METHOD");

    private static final SubLSymbol HAS_EXTERNAL_MODULES_P = makeSymbol("HAS-EXTERNAL-MODULES-P");

    static private final SubLList $list_alt1184 = list(list(makeSymbol("CLET"), list(list(makeSymbol("KSB-INFO"), list(makeSymbol("GET-KSB-INFO"), makeSymbol("SELF")))), list(RET, list(makeSymbol("CAND"), makeSymbol("KSB-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-EXTERNAL-MODULE-INFO-LIST"), makeSymbol("CYBLACK-KSB-INFO")), makeSymbol("KSB-INFO"))))));

    private static final SubLSymbol CYBLACK_APP_INFO_HAS_EXTERNAL_MODULES_P_METHOD = makeSymbol("CYBLACK-APP-INFO-HAS-EXTERNAL-MODULES-P-METHOD");

    private static final SubLSymbol COMPILE_TO_INITIALIZE_METHOD = makeSymbol("COMPILE-TO-INITIALIZE-METHOD");

    static private final SubLList $list_alt1187 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MONITORED-DATATYPES"), list(makeSymbol("GET-MONITORED-DATATYPES"), makeSymbol("SELF"))), list(makeSymbol("BLACKBOARD-INFO"), list(makeSymbol("GET-BLACKBOARD-INFO"), makeSymbol("SELF"))), list(makeSymbol("BLACKBOARD-CLASS-NAME"), list(makeSymbol("FIF"), makeSymbol("BLACKBOARD-INFO"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-BLACKBOARD-CLASS-NAME"), makeSymbol("CYBLACK-BLACKBOARD-INFO")), makeSymbol("BLACKBOARD-INFO")), NIL)), list(makeSymbol("AGENDA-EXPRESSION"), list(makeSymbol("FIF"), makeSymbol("APP-BODY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-AGENDA-EXPRESSION"), makeSymbol("CYBLACK-DEFAPP-BODY")), makeSymbol("APP-BODY")), NIL)), list(makeSymbol("AGENDA-CLASS"), list(makeSymbol("FIF"), makeSymbol("AGENDA-EXPRESSION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("AGENDA-EXPRESSION"), list(QUOTE, makeSymbol("GET-AGENDA-CLASS"))), list(QUOTE, makeSymbol("CYBLACK-DEFAPP-AGENDA-BASE"))))), list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-INSTANCE-METHOD")), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("INITIALIZE")), makeSymbol("APP-CLASS"), list(QUOTE, list(makeKeyword("PROTECTED")))), NIL, list(QUOTE, list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-APPLICATION*"), makeSymbol("SELF"))), list(QUOTE, list(makeSymbol("INITIALIZE"), makeSymbol("SUPER"))), list(makeSymbol("BQ-APPEND"), list(makeSymbol("FIF"), makeSymbol("APP-NAME"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("SET-APPLICATION-NAME")), list(QUOTE, makeSymbol("SELF")), makeSymbol("APP-NAME"))), NIL), list(makeSymbol("BQ-LIST*"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("SET-AGENDA-CLASS")), list(QUOTE, makeSymbol("SELF")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("AGENDA-CLASS"))), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("CYBLACK-APP-INSTALL-AGENDA")), list(QUOTE, makeSymbol("SELF")), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("NEW-CLASS-INSTANCE")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("AGENDA-CLASS")))), list(makeSymbol("BQ-APPEND"), list(makeSymbol("FIF"), list(makeSymbol("HAS-EXTERNAL-MODULES-P"), makeSymbol("SELF")), list(QUOTE, list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-MESSAGE-BROKER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-MESSAGE-BROKER")), list(QUOTE, makeSymbol("CYBLACK-MESSAGE-BROKER"))))), list(makeSymbol("INSTALL-MESSAGE-BROKER"), makeSymbol("SELF"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-EXTERNAL-CONNECTION"), list(makeSymbol("FIF"), makeSymbol("*CYBLACK-DEFAULT-CONNECTION-CLASS*"), list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("*CYBLACK-DEFAULT-CONNECTION-CLASS*")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("NEW-EXTERNAL-CONNECTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-EXTERNAL-CONNECTION"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-EXTERNAL-CONNECTION"), list(QUOTE, makeSymbol("ASSIGN-MESSAGE-BROKER")), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("INSTALL-EXTERNAL-CONNECTION"), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-CONNECTION"))))))), NIL), list(makeSymbol("FIF"), makeSymbol("BLACKBOARD-CLASS-NAME"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("SET-BLACKBOARD-CLASS")), list(QUOTE, makeSymbol("SELF")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("BLACKBOARD-CLASS-NAME")))), NIL), list(makeSymbol("FIF"), makeSymbol("APP-BODY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("COMPILE-TO-INITIALIZE-METHOD-BODY"), makeSymbol("CYBLACK-DEFAPP-BODY")), makeSymbol("APP-BODY")), NIL), list(makeSymbol("FIF"), makeSymbol("MONITORED-DATATYPES"), list(makeSymbol("BQ-CONS"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("SET-MONITORED-TYPE-TYPE-STRINGS")), list(QUOTE, makeSymbol("SELF")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("MONITORED-DATATYPES"))), list(QUOTE, list(list(makeSymbol("PRE-MONITORING-INITIALIZE"), makeSymbol("SELF")), list(makeSymbol("POST-MONITORING-INITIALIZE"), makeSymbol("SELF"))))), NIL), list(QUOTE, list(list(RET, makeSymbol("SELF")))))))))));

    static private final SubLSymbol $sym1188$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");



    static private final SubLList $list_alt1190 = list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-APPLICATION*"), makeSymbol("SELF"));

    static private final SubLList $list_alt1191 = list(makeSymbol("INITIALIZE"), makeSymbol("SUPER"));







    private static final SubLSymbol CYBLACK_APP_INSTALL_AGENDA = makeSymbol("CYBLACK-APP-INSTALL-AGENDA");



    static private final SubLList $list_alt1197 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-MESSAGE-BROKER"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("NEW"), makeSymbol("CYBLACK-MESSAGE-BROKER")), list(QUOTE, makeSymbol("CYBLACK-MESSAGE-BROKER"))))), list(makeSymbol("INSTALL-MESSAGE-BROKER"), makeSymbol("SELF"), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-EXTERNAL-CONNECTION"), list(makeSymbol("FIF"), makeSymbol("*CYBLACK-DEFAULT-CONNECTION-CLASS*"), list(makeSymbol("NEW-OBJECT-INSTANCE"), makeSymbol("*CYBLACK-DEFAULT-CONNECTION-CLASS*")), NIL))), list(makeSymbol("PWHEN"), makeSymbol("NEW-EXTERNAL-CONNECTION"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-EXTERNAL-CONNECTION"), list(QUOTE, makeSymbol("SET-APPLICATION")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-EXTERNAL-CONNECTION"), list(QUOTE, makeSymbol("ASSIGN-MESSAGE-BROKER")), makeSymbol("NEW-MESSAGE-BROKER")), list(makeSymbol("INSTALL-EXTERNAL-CONNECTION"), makeSymbol("SELF"), makeSymbol("NEW-EXTERNAL-CONNECTION"))))));

    private static final SubLSymbol SET_BLACKBOARD_CLASS = makeSymbol("SET-BLACKBOARD-CLASS");

    static private final SubLList $list_alt1199 = list(list(makeSymbol("PRE-MONITORING-INITIALIZE"), makeSymbol("SELF")), list(makeSymbol("POST-MONITORING-INITIALIZE"), makeSymbol("SELF")));

    static private final SubLList $list_alt1200 = list(list(RET, makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_APP_INFO_COMPILE_TO_INITIALIZE_METHOD_METHOD = makeSymbol("CYBLACK-APP-INFO-COMPILE-TO-INITIALIZE-METHOD-METHOD");

    private static final SubLSymbol COMPILE_TO_GENERATED_ON_STARTUP_METHOD = makeSymbol("COMPILE-TO-GENERATED-ON-STARTUP-METHOD");

    static private final SubLList $list_alt1203 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MONITORED-DATATYPES"), list(makeSymbol("GET-MONITORED-DATATYPES"), makeSymbol("SELF")))), list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-INSTANCE-METHOD")), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("GENERATED-ON-STARTUP")), makeSymbol("APP-CLASS"), list(QUOTE, list(makeKeyword("PUBLIC")))), NIL, list(QUOTE, list(makeSymbol("GENERATED-ON-STARTUP"), makeSymbol("SUPER"))), list(makeSymbol("BQ-APPEND"), list(makeSymbol("FIF"), makeSymbol("MONITORED-DATATYPES"), list(QUOTE, list(list(makeSymbol("MONITORING-ON-STARTUP"), makeSymbol("SELF")))), NIL), list(QUOTE, list(list(RET, NIL))))))));

    static private final SubLSymbol $sym1204$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    static private final SubLList $list_alt1205 = list(makeSymbol("GENERATED-ON-STARTUP"), makeSymbol("SUPER"));

    static private final SubLList $list_alt1206 = list(list(makeSymbol("MONITORING-ON-STARTUP"), makeSymbol("SELF")));

    private static final SubLSymbol CYBLACK_APP_INFO_COMPILE_TO_GENERATED_ON_STARTUP_METHOD_METHOD = makeSymbol("CYBLACK-APP-INFO-COMPILE-TO-GENERATED-ON-STARTUP-METHOD-METHOD");

    private static final SubLSymbol COMPILE_TO_USER_ON_STARTUP_METHOD = makeSymbol("COMPILE-TO-USER-ON-STARTUP-METHOD");

    static private final SubLList $list_alt1209 = list(list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-INSTANCE-METHOD")), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("USER-ON-STARTUP")), makeSymbol("APP-CLASS"), list(QUOTE, list(makeKeyword("PUBLIC")))), NIL, list(QUOTE, list(makeSymbol("USER-ON-STARTUP"), makeSymbol("SUPER"))), list(makeSymbol("BQ-APPEND"), list(makeSymbol("FIF"), makeSymbol("APP-BODY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("COMPILE-TO-USER-ON-STARTUP-METHOD-BODY"), makeSymbol("CYBLACK-DEFAPP-BODY")), makeSymbol("APP-BODY")), NIL), list(QUOTE, list(list(RET, NIL)))))));

    static private final SubLSymbol $sym1210$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    static private final SubLList $list_alt1211 = list(makeSymbol("USER-ON-STARTUP"), makeSymbol("SUPER"));

    private static final SubLSymbol CYBLACK_APP_INFO_COMPILE_TO_USER_ON_STARTUP_METHOD_METHOD = makeSymbol("CYBLACK-APP-INFO-COMPILE-TO-USER-ON-STARTUP-METHOD-METHOD");

    private static final SubLSymbol COMPILE_TO_GENERATED_ON_SHUTDOWN_METHOD = makeSymbol("COMPILE-TO-GENERATED-ON-SHUTDOWN-METHOD");

    static private final SubLList $list_alt1214 = list(list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-INSTANCE-METHOD")), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("GENERATED-ON-SHUTDOWN")), makeSymbol("APP-CLASS"), list(QUOTE, list(makeKeyword("PUBLIC")))), list(QUOTE, list(NIL, list(makeSymbol("GENERATED-ON-SHUTDOWN"), makeSymbol("SUPER")), list(RET, NIL))))));

    static private final SubLSymbol $sym1215$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    static private final SubLList $list_alt1216 = list(NIL, list(makeSymbol("GENERATED-ON-SHUTDOWN"), makeSymbol("SUPER")), list(RET, NIL));

    private static final SubLSymbol CYBLACK_APP_INFO_COMPILE_TO_GENERATED_ON_SHUTDOWN_METHOD_METHOD = makeSymbol("CYBLACK-APP-INFO-COMPILE-TO-GENERATED-ON-SHUTDOWN-METHOD-METHOD");

    static private final SubLList $list_alt1218 = list(list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-INSTANCE-METHOD")), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("USER-ON-SHUTDOWN")), makeSymbol("APP-CLASS"), list(QUOTE, list(makeKeyword("PUBLIC")))), NIL, list(QUOTE, list(makeSymbol("USER-ON-SHUTDOWN"), makeSymbol("SUPER"))), list(makeSymbol("BQ-APPEND"), list(makeSymbol("FIF"), makeSymbol("APP-BODY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("COMPILE-TO-USER-ON-SHUTDOWN-METHOD"), makeSymbol("CYBLACK-DEFAPP-BODY")), makeSymbol("APP-BODY")), NIL), list(QUOTE, list(list(RET, NIL)))))));

    static private final SubLSymbol $sym1219$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    static private final SubLList $list_alt1220 = list(makeSymbol("USER-ON-SHUTDOWN"), makeSymbol("SUPER"));

    private static final SubLSymbol CYBLACK_APP_INFO_COMPILE_TO_USER_ON_SHUTDOWN_METHOD_METHOD = makeSymbol("CYBLACK-APP-INFO-COMPILE-TO-USER-ON-SHUTDOWN-METHOD-METHOD");

    static private final SubLList $list_alt1222 = list(list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-INSTANCE-METHOD")), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("ON-QUIESCENCE")), makeSymbol("APP-CLASS"), list(QUOTE, list(makeKeyword("PUBLIC")))), NIL, list(QUOTE, list(makeSymbol("ON-QUIESCENCE"), makeSymbol("SUPER"))), list(makeSymbol("BQ-APPEND"), list(makeSymbol("FIF"), makeSymbol("APP-BODY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("COMPILE-TO-ON-QUIESCENCE-METHOD"), makeSymbol("CYBLACK-DEFAPP-BODY")), makeSymbol("APP-BODY")), NIL), list(QUOTE, list(list(RET, NIL)))))));

    static private final SubLSymbol $sym1223$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");



    static private final SubLList $list_alt1225 = list(makeSymbol("ON-QUIESCENCE"), makeSymbol("SUPER"));

    private static final SubLSymbol CYBLACK_APP_INFO_COMPILE_TO_ON_QUIESCENCE_METHOD_METHOD = makeSymbol("CYBLACK-APP-INFO-COMPILE-TO-ON-QUIESCENCE-METHOD-METHOD");

    static private final SubLList $list_alt1227 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ON-EMPTY-AGENDA-METHOD-BODY"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("COMPILE-TO-ON-EMPTY-AGENDA-METHOD"), makeSymbol("CYBLACK-DEFAPP-BODY")), makeSymbol("APP-BODY")))), list(makeSymbol("PIF"), makeSymbol("ON-EMPTY-AGENDA-METHOD-BODY"), list(RET, list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("DEF-INSTANCE-METHOD")), list(makeSymbol("BQ-LIST*"), list(QUOTE, makeSymbol("ON-EMPTY-AGENDA")), makeSymbol("APP-CLASS"), list(QUOTE, list(makeKeyword("PUBLIC")))), NIL, list(makeSymbol("BQ-APPEND"), makeSymbol("ON-EMPTY-AGENDA-METHOD-BODY"), NIL))), list(RET, NIL))));

    static private final SubLSymbol $sym1228$OUTER_CATCH_FOR_CYBLACK_APP_INFO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-APP-INFO-METHOD");

    private static final SubLSymbol CYBLACK_APP_INFO_COMPILE_TO_ON_EMPTY_AGENDA_METHOD_METHOD = makeSymbol("CYBLACK-APP-INFO-COMPILE-TO-ON-EMPTY-AGENDA-METHOD-METHOD");

    static private final SubLString $str_alt1230$CYBLACK_SET_APP_INFO___S_is_not_a = makeString("CYBLACK-SET-APP-INFO: ~S is not a valid app info symbol. ~\n     A non nil symbol was expected.");

    static private final SubLString $str_alt1231$CYBLACK_SET_APP_INFO___S_is_not_a = makeString("CYBLACK-SET-APP-INFO: ~S is not an instance of CYBLACK-APP-INFO.");

    private static final SubLSymbol $CYBLACK_APP_INFO = makeKeyword("CYBLACK-APP-INFO");

    static private final SubLString $str_alt1233$CYBLACK_GET_APP_INFO___S_is_not_a = makeString("CYBLACK-GET-APP-INFO: ~S is not a valid app info symbol. ~\n     A non nil symbol was expected.");

    static private final SubLString $str_alt1234$CYBLACK_GET_APP_INFO__The_applica = makeString("CYBLACK-GET-APP-INFO: The application info ~S stored on ~S is not valid.");

    static private final SubLList $list_alt1235 = list(makeKeyword("EXTENDS"), makeKeyword("IMPLEMENTS"), $NAME, makeKeyword("EXECUTABLE-NAME"));

    private static final SubLSymbol CYBLACK_DEFAPP_OPTION = makeSymbol("CYBLACK-DEFAPP-OPTION");

    private static final SubLSymbol ENCODE_CYBLACK_DEFAPP_OPTION = makeSymbol("ENCODE-CYBLACK-DEFAPP-OPTION");

    private static final SubLSymbol DECODE_CYBLACK_DEFAPP_OPTION = makeSymbol("DECODE-CYBLACK-DEFAPP-OPTION");

    private static final SubLSymbol CYBLACK_DEFAPP_OPTION_P = makeSymbol("CYBLACK-DEFAPP-OPTION-P");

    static private final SubLString $str_alt1240$DEFINE_BLACKBOARD_APPLICATION__Mo = makeString("DEFINE-BLACKBOARD-APPLICATION: Monitoring statements encountered in ~\n                     a blackboard application definition where the base class does not ~\n                     implement the CYBLACK-MONITOR-BASE interface.  Base class ~S ~\n                     does not implement CYBLACK-MONITOR-BASE.");

    static private final SubLString $str_alt1241$DEFINE_BLACKBOARD_APPLICATION__Th = makeString("DEFINE-BLACKBOARD-APPLICATION: The knowledge source battery ~S of the ~\n               application ~S contains external knowledge sources.  However, the base ~\n               class of this application does not inherit from CYBLACK-DEFAPP-EXTERNAL-BASE. ~\n               All applications defined by this form that contain external knowledge ~\n               sources must subclass the CYBLACK-DEFAPP-EXTERNAL-BASE class.");

    static private final SubLString $str_alt1242$DEFINE_BLACKBOARD_APPLICATION__Th = makeString("DEFINE-BLACKBOARD-APPLICATION: The base class ~S of the application ~S ~\n           does subclass the required base class CYBACK-DEFAPP-BASE.");

    static private final SubLString $str_alt1243$DEFINE_BLACKBOARD_APPLICATION___S = makeString("DEFINE-BLACKBOARD-APPLICATION: ~S is not a valid application identifier. ~\n     A non nil symbol was expected.");

    static private final SubLString $str_alt1244$DEFINE_BLACKBOARD_APPLICATION__Op = makeString("DEFINE-BLACKBOARD-APPLICATION: Options list ~S contains invalid options.");







    private static final SubLSymbol $EXECUTABLE_NAME = makeKeyword("EXECUTABLE-NAME");

    static private final SubLString $str_alt1249$DEFINE_BLACKBOARD_APPLICATION___S = makeString("DEFINE-BLACKBOARD-APPLICATION: ~S is not a valid class name.");

    static private final SubLString $str_alt1250$DEFINE_BLACKBOARD_APPLICATION___S = makeString("DEFINE-BLACKBOARD-APPLICATION: ~S is not a valid interface name list.");

    static private final SubLString $str_alt1251$DEFINE_BLACKBOARD_APPLICATION___S = makeString("DEFINE-BLACKBOARD-APPLICATION: ~S is not a valid application name.");

    static private final SubLString $str_alt1252$RUN_ = makeString("RUN-");

    static private final SubLString $str_alt1253$DEFINE_BLACKBOARD_APPLICATION__Th = makeString("DEFINE-BLACKBOARD-APPLICATION: The base class ~S is inconsistent with the definition of ~\n         application ~S.");





    private static final SubLSymbol APP_INSTANCE = makeSymbol("APP-INSTANCE");







    static private final SubLList $list_alt1260 = list(makeSymbol("CSETQ"), makeSymbol("*CYBLACK-CURRENT-APP*"), makeSymbol("APP-INSTANCE"));



    static private final SubLList $list_alt1262 = list(makeSymbol("APP-INSTANCE"));

    static private final SubLList $list_alt1263 = list(list(makeSymbol("CYBLACK-KILL-APPLICATION-PROCESSES-AND-DEALLOCATE-APPLICATION-ID"), list(makeSymbol("CYBLACK-APPLICATION-GET-APPLICATION-ID"), makeSymbol("APP-INSTANCE"))), list(makeSymbol("PWHEN"), list(makeSymbol("GET-SLOT"), makeSymbol("APP-INSTANCE"), list(QUOTE, makeSymbol("PORT-MANAGER"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-SLOT"), makeSymbol("APP-INSTANCE"), list(QUOTE, makeSymbol("PORT-MANAGER"))), list(QUOTE, makeSymbol("CLOSE-ALL-PORTS")))));

    static private final SubLList $list_alt1264 = list(list(RET, makeSymbol("APP-INSTANCE")));



    static private final SubLList $list_alt1266 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED"));

    static private final SubLList $list_alt1267 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATED-ON-STARTUP"), NIL, makeKeyword("PUBLIC"));

    static private final SubLList $list_alt1268 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("USER-ON-STARTUP"), NIL, makeKeyword("PUBLIC"));

    static private final SubLList $list_alt1269 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GENERATED-ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC"));

    static private final SubLList $list_alt1270 = list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("USER-ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC"));

    static private final SubLList $list_alt1271 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-EMPTY-AGENDA"), NIL, makeKeyword("PUBLIC")));

    static private final SubLList $list_alt1272 = list(cons(makeSymbol("APP-IDENTIFIER"), makeSymbol("OPTIONS")), makeSymbol("&BODY"), makeSymbol("DEFAPP-BODY"));

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_defapp_file();
    }

    public void initializeVariables() {
        init_cyblack_defapp_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_defapp_file();
    }
}

