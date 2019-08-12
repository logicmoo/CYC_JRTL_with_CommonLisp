/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.hlmt.*;
import static com.cyc.cycjava.cycl.kb_control_vars.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.queues.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-DATASTRUCTURES-FORWARD-PROPAGATE
 * source file: /cyc/top/cycl/inference/harness/inference-datastructures-forward-propagate.lisp
 * created:     2019/07/03 17:37:39
 */
public final class inference_datastructures_forward_propagate extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_datastructures_forward_propagate();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_forward_propagate$ = makeSymbol("*DTP-FORWARD-PROPAGATE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol FORWARD_PROPAGATE = makeSymbol("FORWARD-PROPAGATE");

    private static final SubLSymbol FORWARD_PROPAGATE_P = makeSymbol("FORWARD-PROPAGATE-P");

    static private final SubLList $list2 = list(makeSymbol("OLD-QUEUE"), makeSymbol("NEW-QUEUE"));

    static private final SubLList $list3 = list(makeKeyword("OLD-QUEUE"), makeKeyword("NEW-QUEUE"));

    static private final SubLList $list4 = list(makeSymbol("FPMT-OLD-QUEUE"), makeSymbol("FPMT-NEW-QUEUE"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-FPMT-OLD-QUEUE"), makeSymbol("_CSETF-FPMT-NEW-QUEUE"));

    private static final SubLSymbol PRINT_FORWARD_PROPAGATE = makeSymbol("PRINT-FORWARD-PROPAGATE");

    private static final SubLSymbol FORWARD_PROPAGATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORWARD-PROPAGATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORWARD-PROPAGATE-P"));

    private static final SubLSymbol FPMT_OLD_QUEUE = makeSymbol("FPMT-OLD-QUEUE");

    private static final SubLSymbol _CSETF_FPMT_OLD_QUEUE = makeSymbol("_CSETF-FPMT-OLD-QUEUE");

    private static final SubLSymbol FPMT_NEW_QUEUE = makeSymbol("FPMT-NEW-QUEUE");

    private static final SubLSymbol _CSETF_FPMT_NEW_QUEUE = makeSymbol("_CSETF-FPMT-NEW-QUEUE");

    private static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_FORWARD_PROPAGATE = makeSymbol("MAKE-FORWARD-PROPAGATE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-PROPAGATE-METHOD");

    private static final SubLString $str21$_Forward_Propagate_old__a_new__a = makeString("<Forward Propagate old=~a new=~a");

    private static final SubLString $str22$_Invalid_Forward_Propagate__s_ = makeString("<Invalid Forward Propagate ~s>");

    private static final SubLSymbol $sym24$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    public static final SubLObject forward_propagate_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.print_forward_propagate(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject forward_propagate_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        inference_datastructures_forward_propagate.print_forward_propagate(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject forward_propagate_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.$forward_propagate_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject forward_propagate_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.$forward_propagate_native.class ? T : NIL;
    }

    public static final SubLObject fpmt_old_queue_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FORWARD_PROPAGATE_P);
        return v_object.getField2();
    }

    public static SubLObject fpmt_old_queue(final SubLObject v_object) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(v_object) : "! inference_datastructures_forward_propagate.forward_propagate_p(v_object) " + "inference_datastructures_forward_propagate.forward_propagate_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject fpmt_new_queue_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, FORWARD_PROPAGATE_P);
        return v_object.getField3();
    }

    public static SubLObject fpmt_new_queue(final SubLObject v_object) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(v_object) : "! inference_datastructures_forward_propagate.forward_propagate_p(v_object) " + "inference_datastructures_forward_propagate.forward_propagate_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_fpmt_old_queue_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FORWARD_PROPAGATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_fpmt_old_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(v_object) : "! inference_datastructures_forward_propagate.forward_propagate_p(v_object) " + "inference_datastructures_forward_propagate.forward_propagate_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_fpmt_new_queue_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, FORWARD_PROPAGATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_fpmt_new_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(v_object) : "! inference_datastructures_forward_propagate.forward_propagate_p(v_object) " + "inference_datastructures_forward_propagate.forward_propagate_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_forward_propagate_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.$forward_propagate_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($OLD_QUEUE)) {
                        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate._csetf_fpmt_old_queue(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NEW_QUEUE)) {
                            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate._csetf_fpmt_new_queue(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_forward_propagate(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.$forward_propagate_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($OLD_QUEUE)) {
                inference_datastructures_forward_propagate._csetf_fpmt_old_queue(v_new, current_value);
            } else
                if (pcase_var.eql($NEW_QUEUE)) {
                    inference_datastructures_forward_propagate._csetf_fpmt_new_queue(v_new, current_value);
                } else {
                    Errors.error(inference_datastructures_forward_propagate.$str15$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_forward_propagate(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, inference_datastructures_forward_propagate.MAKE_FORWARD_PROPAGATE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $OLD_QUEUE, inference_datastructures_forward_propagate.fpmt_old_queue(obj));
        funcall(visitor_fn, obj, $SLOT, $NEW_QUEUE, inference_datastructures_forward_propagate.fpmt_new_queue(obj));
        funcall(visitor_fn, obj, $END, inference_datastructures_forward_propagate.MAKE_FORWARD_PROPAGATE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_forward_propagate_method(final SubLObject obj, final SubLObject visitor_fn) {
        return inference_datastructures_forward_propagate.visit_defstruct_forward_propagate(obj, visitor_fn);
    }

    public static final SubLObject print_forward_propagate_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.forward_propagate_p(v_object)) {
            format(stream, $str_alt15$_Forward_Propagate_old__a_new__a, queues.queue_size(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.forward_propagate_old_queue(v_object)), queues.queue_size(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.forward_propagate_new_queue(v_object)));
        } else {
            format(stream, $str_alt16$_Invalid_Forward_Propagate__s_, v_object);
        }
        return NIL;
    }

    public static SubLObject print_forward_propagate(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        if (NIL != inference_datastructures_forward_propagate.forward_propagate_p(v_object)) {
            format(stream, inference_datastructures_forward_propagate.$str21$_Forward_Propagate_old__a_new__a, queue_size(inference_datastructures_forward_propagate.forward_propagate_old_queue(v_object)), queue_size(inference_datastructures_forward_propagate.forward_propagate_new_queue(v_object)));
        } else {
            format(stream, inference_datastructures_forward_propagate.$str22$_Invalid_Forward_Propagate__s_, v_object);
        }
        return NIL;
    }

    public static final SubLObject new_forward_propagate_alt(SubLObject source_mt) {
        if (source_mt == UNPROVIDED) {
            source_mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject fp_mt = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.make_forward_propagate(UNPROVIDED);
                {
                    SubLObject environment = forward.get_forward_inference_environment();
                    SubLTrampolineFile.checkType(environment, QUEUE_P);
                    {
                        SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                        try {
                            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.set_forward_propagate_old_queue(fp_mt, forward.current_forward_inference_environment());
                        } finally {
                            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                {
                    SubLObject environment = forward.get_forward_inference_environment();
                    SubLTrampolineFile.checkType(environment, QUEUE_P);
                    {
                        SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                        try {
                            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.set_forward_propagate_new_queue(fp_mt, forward.current_forward_inference_environment());
                        } finally {
                            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                if (NIL != hlmt.hlmt_p(source_mt)) {
                    {
                        SubLObject assertions = kb_mapping.gather_mt_index(source_mt);
                        assertions = list_utilities.sort_via_test(copy_list(assertions), symbol_function($sym18$RULE_ASSERTION_), UNPROVIDED);
                        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.enqueue_forward_propagate_assertions_to_new_queue(fp_mt, assertions);
                    }
                }
                return fp_mt;
            }
        }
    }

    public static SubLObject new_forward_propagate(SubLObject source_mt) {
        if (source_mt == UNPROVIDED) {
            source_mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fp_mt = inference_datastructures_forward_propagate.make_forward_propagate(UNPROVIDED);
        SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queue_p(environment) : "! queues.queue_p(environment) " + ("queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) ") + environment;
        SubLObject _prev_bind_0 = $forward_inference_environment$.currentBinding(thread);
        try {
            $forward_inference_environment$.bind(environment, thread);
            inference_datastructures_forward_propagate.set_forward_propagate_old_queue(fp_mt, forward.current_forward_inference_environment());
        } finally {
            $forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        environment = forward.get_forward_inference_environment();
        assert NIL != queue_p(environment) : "! queues.queue_p(environment) " + ("queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) ") + environment;
        _prev_bind_0 = $forward_inference_environment$.currentBinding(thread);
        try {
            $forward_inference_environment$.bind(environment, thread);
            inference_datastructures_forward_propagate.set_forward_propagate_new_queue(fp_mt, forward.current_forward_inference_environment());
        } finally {
            $forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        if (NIL != hlmt_p(source_mt)) {
            SubLObject assertions = kb_mapping.gather_mt_index(source_mt);
            assertions = sort_via_test(copy_list(assertions), symbol_function(inference_datastructures_forward_propagate.$sym24$RULE_ASSERTION_), UNPROVIDED);
            inference_datastructures_forward_propagate.enqueue_forward_propagate_assertions_to_new_queue(fp_mt, assertions);
        }
        return fp_mt;
    }

    public static final SubLObject destroy_forward_propagate_alt(SubLObject forward_propagate) {
        if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate)) {
            return NIL;
        }
        queues.clear_queue(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.fpmt_old_queue(forward_propagate));
        queues.clear_queue(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.fpmt_new_queue(forward_propagate));
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate._csetf_fpmt_old_queue(forward_propagate, $FREE);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate._csetf_fpmt_new_queue(forward_propagate, $FREE);
        return NIL;
    }

    public static SubLObject destroy_forward_propagate(final SubLObject forward_propagate) {
        if (NIL == inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate)) {
            return NIL;
        }
        clear_queue(inference_datastructures_forward_propagate.fpmt_old_queue(forward_propagate));
        clear_queue(inference_datastructures_forward_propagate.fpmt_new_queue(forward_propagate));
        inference_datastructures_forward_propagate._csetf_fpmt_old_queue(forward_propagate, $FREE);
        inference_datastructures_forward_propagate._csetf_fpmt_new_queue(forward_propagate, $FREE);
        return NIL;
    }

    public static final SubLObject forward_propagate_old_queue_alt(SubLObject forward_propagate) {
        SubLTrampolineFile.checkType(forward_propagate, FORWARD_PROPAGATE_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.fpmt_old_queue(forward_propagate);
    }

    public static SubLObject forward_propagate_old_queue(final SubLObject forward_propagate) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) : "! inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + ("inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + "CommonSymbols.NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) ") + forward_propagate;
        return inference_datastructures_forward_propagate.fpmt_old_queue(forward_propagate);
    }

    public static final SubLObject set_forward_propagate_old_queue_alt(SubLObject forward_propagate, SubLObject queue) {
        SubLTrampolineFile.checkType(forward_propagate, FORWARD_PROPAGATE_P);
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate._csetf_fpmt_old_queue(forward_propagate, queue);
        return forward_propagate;
    }

    public static SubLObject set_forward_propagate_old_queue(final SubLObject forward_propagate, final SubLObject queue) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) : "! inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + ("inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + "CommonSymbols.NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) ") + forward_propagate;
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        inference_datastructures_forward_propagate._csetf_fpmt_old_queue(forward_propagate, queue);
        return forward_propagate;
    }

    public static final SubLObject clear_forward_propagate_old_queue_alt(SubLObject forward_propagate) {
        SubLTrampolineFile.checkType(forward_propagate, FORWARD_PROPAGATE_P);
        queues.clear_queue(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.fpmt_old_queue(forward_propagate));
        return forward_propagate;
    }

    public static SubLObject clear_forward_propagate_old_queue(final SubLObject forward_propagate) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) : "! inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + ("inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + "CommonSymbols.NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) ") + forward_propagate;
        clear_queue(inference_datastructures_forward_propagate.fpmt_old_queue(forward_propagate));
        return forward_propagate;
    }

    public static final SubLObject forward_propagate_new_queue_alt(SubLObject forward_propagate) {
        SubLTrampolineFile.checkType(forward_propagate, FORWARD_PROPAGATE_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.fpmt_new_queue(forward_propagate);
    }

    public static SubLObject forward_propagate_new_queue(final SubLObject forward_propagate) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) : "! inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + ("inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + "CommonSymbols.NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) ") + forward_propagate;
        return inference_datastructures_forward_propagate.fpmt_new_queue(forward_propagate);
    }

    public static final SubLObject set_forward_propagate_new_queue_alt(SubLObject forward_propagate, SubLObject queue) {
        SubLTrampolineFile.checkType(forward_propagate, FORWARD_PROPAGATE_P);
        SubLTrampolineFile.checkType(queue, QUEUE_P);
        com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate._csetf_fpmt_new_queue(forward_propagate, queue);
        return forward_propagate;
    }

    public static SubLObject set_forward_propagate_new_queue(final SubLObject forward_propagate, final SubLObject queue) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) : "! inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + ("inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + "CommonSymbols.NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) ") + forward_propagate;
        assert NIL != queue_p(queue) : "! queues.queue_p(queue) " + ("queues.queue_p(queue) " + "CommonSymbols.NIL != queues.queue_p(queue) ") + queue;
        inference_datastructures_forward_propagate._csetf_fpmt_new_queue(forward_propagate, queue);
        return forward_propagate;
    }

    public static final SubLObject swap_forward_propagate_queues_alt(SubLObject forward_propagate) {
        SubLTrampolineFile.checkType(forward_propagate, FORWARD_PROPAGATE_P);
        {
            SubLObject temp_swap = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.forward_propagate_old_queue(forward_propagate);
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.set_forward_propagate_old_queue(forward_propagate, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate));
            com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.set_forward_propagate_new_queue(forward_propagate, temp_swap);
        }
        return forward_propagate;
    }

    public static SubLObject swap_forward_propagate_queues(final SubLObject forward_propagate) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) : "! inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + ("inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + "CommonSymbols.NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) ") + forward_propagate;
        final SubLObject temp_swap = inference_datastructures_forward_propagate.forward_propagate_old_queue(forward_propagate);
        inference_datastructures_forward_propagate.set_forward_propagate_old_queue(forward_propagate, inference_datastructures_forward_propagate.forward_propagate_new_queue(forward_propagate));
        inference_datastructures_forward_propagate.set_forward_propagate_new_queue(forward_propagate, temp_swap);
        return forward_propagate;
    }

    public static final SubLObject enqueue_forward_propagate_assertions_to_new_queue_alt(SubLObject forward_propagate, SubLObject assertions) {
        SubLTrampolineFile.checkType(forward_propagate, FORWARD_PROPAGATE_P);
        {
            SubLObject list_var = assertions;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, ASSERTION_P);
                }
            }
        }
        {
            SubLObject cdolist_list_var = assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                queues.enqueue(assertion, com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.fpmt_new_queue(forward_propagate));
            }
        }
        return forward_propagate;
    }

    public static SubLObject enqueue_forward_propagate_assertions_to_new_queue(final SubLObject forward_propagate, final SubLObject assertions) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) : "! inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + ("inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + "CommonSymbols.NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) ") + forward_propagate;
        assert NIL != non_dotted_list_p(assertions) : "! list_utilities.non_dotted_list_p(assertions) " + ("list_utilities.non_dotted_list_p(assertions) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(assertions) ") + assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : "! assertion_handles.assertion_p(elem) " + ("assertion_handles.assertion_p(elem) " + "CommonSymbols.NIL != assertion_handles.assertion_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2 = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            enqueue(assertion, inference_datastructures_forward_propagate.fpmt_new_queue(forward_propagate));
            cdolist_list_var2 = cdolist_list_var2.rest();
            assertion = cdolist_list_var2.first();
        } 
        return forward_propagate;
    }

    public static final SubLObject dequeue_forward_propagate_assertion_from_old_queue_alt(SubLObject forward_propagate) {
        SubLTrampolineFile.checkType(forward_propagate, FORWARD_PROPAGATE_P);
        return queues.dequeue(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.fpmt_old_queue(forward_propagate));
    }

    public static SubLObject dequeue_forward_propagate_assertion_from_old_queue(final SubLObject forward_propagate) {
        assert NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) : "! inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + ("inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) " + "CommonSymbols.NIL != inference_datastructures_forward_propagate.forward_propagate_p(forward_propagate) ") + forward_propagate;
        return dequeue(inference_datastructures_forward_propagate.fpmt_old_queue(forward_propagate));
    }

    public static SubLObject declare_inference_datastructures_forward_propagate_file() {
        declareFunction("forward_propagate_print_function_trampoline", "FORWARD-PROPAGATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("forward_propagate_p", "FORWARD-PROPAGATE-P", 1, 0, false);
        new inference_datastructures_forward_propagate.$forward_propagate_p$UnaryFunction();
        declareFunction("fpmt_old_queue", "FPMT-OLD-QUEUE", 1, 0, false);
        declareFunction("fpmt_new_queue", "FPMT-NEW-QUEUE", 1, 0, false);
        declareFunction("_csetf_fpmt_old_queue", "_CSETF-FPMT-OLD-QUEUE", 2, 0, false);
        declareFunction("_csetf_fpmt_new_queue", "_CSETF-FPMT-NEW-QUEUE", 2, 0, false);
        declareFunction("make_forward_propagate", "MAKE-FORWARD-PROPAGATE", 0, 1, false);
        declareFunction("visit_defstruct_forward_propagate", "VISIT-DEFSTRUCT-FORWARD-PROPAGATE", 2, 0, false);
        declareFunction("visit_defstruct_object_forward_propagate_method", "VISIT-DEFSTRUCT-OBJECT-FORWARD-PROPAGATE-METHOD", 2, 0, false);
        declareFunction("print_forward_propagate", "PRINT-FORWARD-PROPAGATE", 3, 0, false);
        declareFunction("new_forward_propagate", "NEW-FORWARD-PROPAGATE", 0, 1, false);
        declareFunction("destroy_forward_propagate", "DESTROY-FORWARD-PROPAGATE", 1, 0, false);
        declareFunction("forward_propagate_old_queue", "FORWARD-PROPAGATE-OLD-QUEUE", 1, 0, false);
        declareFunction("set_forward_propagate_old_queue", "SET-FORWARD-PROPAGATE-OLD-QUEUE", 2, 0, false);
        declareFunction("clear_forward_propagate_old_queue", "CLEAR-FORWARD-PROPAGATE-OLD-QUEUE", 1, 0, false);
        declareFunction("forward_propagate_new_queue", "FORWARD-PROPAGATE-NEW-QUEUE", 1, 0, false);
        declareFunction("set_forward_propagate_new_queue", "SET-FORWARD-PROPAGATE-NEW-QUEUE", 2, 0, false);
        declareFunction("swap_forward_propagate_queues", "SWAP-FORWARD-PROPAGATE-QUEUES", 1, 0, false);
        declareFunction("enqueue_forward_propagate_assertions_to_new_queue", "ENQUEUE-FORWARD-PROPAGATE-ASSERTIONS-TO-NEW-QUEUE", 2, 0, false);
        declareFunction("dequeue_forward_propagate_assertion_from_old_queue", "DEQUEUE-FORWARD-PROPAGATE-ASSERTION-FROM-OLD-QUEUE", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("OLD-QUEUE"), makeSymbol("NEW-QUEUE"));

    static private final SubLList $list_alt3 = list(makeKeyword("OLD-QUEUE"), makeKeyword("NEW-QUEUE"));

    static private final SubLList $list_alt4 = list(makeSymbol("FPMT-OLD-QUEUE"), makeSymbol("FPMT-NEW-QUEUE"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-FPMT-OLD-QUEUE"), makeSymbol("_CSETF-FPMT-NEW-QUEUE"));

    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt15$_Forward_Propagate_old__a_new__a = makeString("<Forward Propagate old=~a new=~a");

    static private final SubLString $str_alt16$_Invalid_Forward_Propagate__s_ = makeString("<Invalid Forward Propagate ~s>");

    static private final SubLSymbol $sym18$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    public static SubLObject init_inference_datastructures_forward_propagate_file() {
        defconstant("*DTP-FORWARD-PROPAGATE*", inference_datastructures_forward_propagate.FORWARD_PROPAGATE);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_forward_propagate_file() {
        register_method($print_object_method_table$.getGlobalValue(), inference_datastructures_forward_propagate.$dtp_forward_propagate$.getGlobalValue(), symbol_function(inference_datastructures_forward_propagate.FORWARD_PROPAGATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(inference_datastructures_forward_propagate.$list8);
        def_csetf(inference_datastructures_forward_propagate.FPMT_OLD_QUEUE, inference_datastructures_forward_propagate._CSETF_FPMT_OLD_QUEUE);
        def_csetf(inference_datastructures_forward_propagate.FPMT_NEW_QUEUE, inference_datastructures_forward_propagate._CSETF_FPMT_NEW_QUEUE);
        identity(inference_datastructures_forward_propagate.FORWARD_PROPAGATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_datastructures_forward_propagate.$dtp_forward_propagate$.getGlobalValue(), symbol_function(inference_datastructures_forward_propagate.VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        inference_datastructures_forward_propagate.declare_inference_datastructures_forward_propagate_file();
    }

    @Override
    public void initializeVariables() {
        inference_datastructures_forward_propagate.init_inference_datastructures_forward_propagate_file();
    }

    @Override
    public void runTopLevelForms() {
        inference_datastructures_forward_propagate.setup_inference_datastructures_forward_propagate_file();
    }

    static {
    }

    public static final class $forward_propagate_native extends SubLStructNative {
        public SubLObject $old_queue;

        public SubLObject $new_queue;

        private static final SubLStructDeclNative structDecl;

        public $forward_propagate_native() {
            inference_datastructures_forward_propagate.$forward_propagate_native.this.$old_queue = Lisp.NIL;
            inference_datastructures_forward_propagate.$forward_propagate_native.this.$new_queue = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return inference_datastructures_forward_propagate.$forward_propagate_native.this.$old_queue;
        }

        @Override
        public SubLObject getField3() {
            return inference_datastructures_forward_propagate.$forward_propagate_native.this.$new_queue;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return inference_datastructures_forward_propagate.$forward_propagate_native.this.$old_queue = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return inference_datastructures_forward_propagate.$forward_propagate_native.this.$new_queue = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_forward_propagate.$forward_propagate_native.class, inference_datastructures_forward_propagate.FORWARD_PROPAGATE, inference_datastructures_forward_propagate.FORWARD_PROPAGATE_P, inference_datastructures_forward_propagate.$list2, inference_datastructures_forward_propagate.$list3, new String[]{ "$old_queue", "$new_queue" }, inference_datastructures_forward_propagate.$list4, inference_datastructures_forward_propagate.$list5, inference_datastructures_forward_propagate.PRINT_FORWARD_PROPAGATE);
        }
    }

    public static final class $forward_propagate_p$UnaryFunction extends UnaryFunction {
        public $forward_propagate_p$UnaryFunction() {
            super(extractFunctionNamed("FORWARD-PROPAGATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_forward_propagate.forward_propagate_p(arg1);
        }
    }
}

/**
 * Total time: 70 ms
 */
