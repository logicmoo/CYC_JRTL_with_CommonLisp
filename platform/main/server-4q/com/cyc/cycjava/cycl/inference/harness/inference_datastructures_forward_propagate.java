package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_datastructures_forward_propagate extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "124acc916b3f9d8c2b19bd91f24dece51d03d76b95e2de05bf05c2c9b11b6068";
    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1100L)
    public static SubLSymbol $dtp_forward_propagate$;
    private static SubLSymbol $sym0$FORWARD_PROPAGATE;
    private static SubLSymbol $sym1$FORWARD_PROPAGATE_P;
    private static SubLList $list2;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLSymbol $sym6$PRINT_FORWARD_PROPAGATE;
    private static SubLSymbol $sym7$FORWARD_PROPAGATE_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list8;
    private static SubLSymbol $sym9$FPMT_OLD_QUEUE;
    private static SubLSymbol $sym10$_CSETF_FPMT_OLD_QUEUE;
    private static SubLSymbol $sym11$FPMT_NEW_QUEUE;
    private static SubLSymbol $sym12$_CSETF_FPMT_NEW_QUEUE;
    private static SubLSymbol $OLD_QUEUE;
    private static SubLSymbol $NEW_QUEUE;
    private static SubLString $str15$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym17$MAKE_FORWARD_PROPAGATE;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym20$VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATE_METHOD;
    private static SubLString $str21$_Forward_Propagate_old__a_new__a;
    private static SubLString $str22$_Invalid_Forward_Propagate__s_;
    private static SubLSymbol $sym23$QUEUE_P;
    private static SubLSymbol $sym24$RULE_ASSERTION_;
    private static SubLSymbol $FREE;
    private static SubLSymbol $sym26$NON_DOTTED_LIST_P;
    private static SubLSymbol $sym27$ASSERTION_P;

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1100L)
    public static SubLObject forward_propagate_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_forward_propagate(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1100L)
    public static SubLObject forward_propagate_p(SubLObject v_object) {
        return (v_object.getClass() == $forward_propagate_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1100L)
    public static SubLObject fpmt_old_queue(SubLObject v_object) {
        assert NIL != forward_propagate_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1100L)
    public static SubLObject fpmt_new_queue(SubLObject v_object) {
        assert NIL != forward_propagate_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1100L)
    public static SubLObject _csetf_fpmt_old_queue(SubLObject v_object, SubLObject value) {
        assert NIL != forward_propagate_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1100L)
    public static SubLObject _csetf_fpmt_new_queue(SubLObject v_object, SubLObject value) {
        assert NIL != forward_propagate_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1100L)
    public static SubLObject make_forward_propagate(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $forward_propagate_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($OLD_QUEUE)) {
                _csetf_fpmt_old_queue(v_new, current_value);
            } else if (pcase_var.eql($NEW_QUEUE)) {
                _csetf_fpmt_new_queue(v_new, current_value);
            } else {
                Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1100L)
    public static SubLObject visit_defstruct_forward_propagate(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym17$MAKE_FORWARD_PROPAGATE, TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $OLD_QUEUE, fpmt_old_queue(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NEW_QUEUE, fpmt_new_queue(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym17$MAKE_FORWARD_PROPAGATE, TWO_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1100L)
    public static SubLObject visit_defstruct_object_forward_propagate_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_forward_propagate(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1200L)
    public static SubLObject print_forward_propagate(SubLObject v_object, SubLObject stream, SubLObject depth) {
        if (NIL != forward_propagate_p(v_object)) {
            PrintLow.format(stream, $str21$_Forward_Propagate_old__a_new__a, queues.queue_size(forward_propagate_old_queue(v_object)), queues.queue_size(forward_propagate_new_queue(v_object)));
        } else {
            PrintLow.format(stream, $str22$_Invalid_Forward_Propagate__s_, v_object);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 1600L)
    public static SubLObject new_forward_propagate(SubLObject source_mt) {
        if (source_mt == UNPROVIDED) {
            source_mt = NIL;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject fp_mt = make_forward_propagate(UNPROVIDED);
        SubLObject environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : environment;
        SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            set_forward_propagate_old_queue(fp_mt, forward.current_forward_inference_environment());
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        environment = forward.get_forward_inference_environment();
        assert NIL != queues.queue_p(environment) : environment;
        _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_environment$.bind(environment, thread);
            set_forward_propagate_new_queue(fp_mt, forward.current_forward_inference_environment());
        } finally {
            kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
        }
        if (NIL != hlmt.hlmt_p(source_mt)) {
            SubLObject assertions = kb_mapping.gather_mt_index(source_mt);
            assertions = list_utilities.sort_via_test(conses_high.copy_list(assertions), Symbols.symbol_function($sym24$RULE_ASSERTION_), UNPROVIDED);
            enqueue_forward_propagate_assertions_to_new_queue(fp_mt, assertions);
        }
        return fp_mt;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 2200L)
    public static SubLObject destroy_forward_propagate(SubLObject forward_propagate) {
        if (NIL == forward_propagate_p(forward_propagate)) {
            return NIL;
        }
        queues.clear_queue(fpmt_old_queue(forward_propagate));
        queues.clear_queue(fpmt_new_queue(forward_propagate));
        _csetf_fpmt_old_queue(forward_propagate, $FREE);
        _csetf_fpmt_new_queue(forward_propagate, $FREE);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 2600L)
    public static SubLObject forward_propagate_old_queue(SubLObject forward_propagate) {
        assert NIL != forward_propagate_p(forward_propagate) : forward_propagate;
        return fpmt_old_queue(forward_propagate);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 2800L)
    public static SubLObject set_forward_propagate_old_queue(SubLObject forward_propagate, SubLObject queue) {
        assert NIL != forward_propagate_p(forward_propagate) : forward_propagate;
        assert NIL != queues.queue_p(queue) : queue;
        _csetf_fpmt_old_queue(forward_propagate, queue);
        return forward_propagate;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 3000L)
    public static SubLObject clear_forward_propagate_old_queue(SubLObject forward_propagate) {
        assert NIL != forward_propagate_p(forward_propagate) : forward_propagate;
        queues.clear_queue(fpmt_old_queue(forward_propagate));
        return forward_propagate;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 3200L)
    public static SubLObject forward_propagate_new_queue(SubLObject forward_propagate) {
        assert NIL != forward_propagate_p(forward_propagate) : forward_propagate;
        return fpmt_new_queue(forward_propagate);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 3400L)
    public static SubLObject set_forward_propagate_new_queue(SubLObject forward_propagate, SubLObject queue) {
        assert NIL != forward_propagate_p(forward_propagate) : forward_propagate;
        assert NIL != queues.queue_p(queue) : queue;
        _csetf_fpmt_new_queue(forward_propagate, queue);
        return forward_propagate;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 3600L)
    public static SubLObject swap_forward_propagate_queues(SubLObject forward_propagate) {
        assert NIL != forward_propagate_p(forward_propagate) : forward_propagate;
        SubLObject temp_swap = forward_propagate_old_queue(forward_propagate);
        set_forward_propagate_old_queue(forward_propagate, forward_propagate_new_queue(forward_propagate));
        set_forward_propagate_new_queue(forward_propagate, temp_swap);
        return forward_propagate;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 4000L)
    public static SubLObject enqueue_forward_propagate_assertions_to_new_queue(SubLObject forward_propagate, SubLObject assertions) {
        assert NIL != forward_propagate_p(forward_propagate) : forward_propagate;
        assert NIL != list_utilities.non_dotted_list_p(assertions) : assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2 = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            queues.enqueue(assertion, fpmt_new_queue(forward_propagate));
            cdolist_list_var2 = cdolist_list_var2.rest();
            assertion = cdolist_list_var2.first();
        }
        return forward_propagate;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-forward-propagate.lisp", position = 4400L)
    public static SubLObject dequeue_forward_propagate_assertion_from_old_queue(SubLObject forward_propagate) {
        assert NIL != forward_propagate_p(forward_propagate) : forward_propagate;
        return queues.dequeue(fpmt_old_queue(forward_propagate));
    }

    public static SubLObject declare_inference_datastructures_forward_propagate_file() {
        declareFunction("forward_propagate_print_function_trampoline", "FORWARD-PROPAGATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("forward_propagate_p", "FORWARD-PROPAGATE-P", 1, 0, false);
        new $forward_propagate_p$UnaryFunction();
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

    public static SubLObject init_inference_datastructures_forward_propagate_file() {
        $dtp_forward_propagate$ = defconstant("*DTP-FORWARD-PROPAGATE*", $sym0$FORWARD_PROPAGATE);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_forward_propagate_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_forward_propagate$.getGlobalValue(), Symbols.symbol_function($sym7$FORWARD_PROPAGATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        Structures.def_csetf($sym9$FPMT_OLD_QUEUE, $sym10$_CSETF_FPMT_OLD_QUEUE);
        Structures.def_csetf($sym11$FPMT_NEW_QUEUE, $sym12$_CSETF_FPMT_NEW_QUEUE);
        Equality.identity($sym0$FORWARD_PROPAGATE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_forward_propagate$.getGlobalValue(), Symbols.symbol_function($sym20$VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATE_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_datastructures_forward_propagate_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_datastructures_forward_propagate_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_datastructures_forward_propagate_file();
    }

    static {
        me = new inference_datastructures_forward_propagate();
        $dtp_forward_propagate$ = null;
        $sym0$FORWARD_PROPAGATE = makeSymbol("FORWARD-PROPAGATE");
        $sym1$FORWARD_PROPAGATE_P = makeSymbol("FORWARD-PROPAGATE-P");
        $list2 = list(makeSymbol("OLD-QUEUE"), makeSymbol("NEW-QUEUE"));
        $list3 = list(makeKeyword("OLD-QUEUE"), makeKeyword("NEW-QUEUE"));
        $list4 = list(makeSymbol("FPMT-OLD-QUEUE"), makeSymbol("FPMT-NEW-QUEUE"));
        $list5 = list(makeSymbol("_CSETF-FPMT-OLD-QUEUE"), makeSymbol("_CSETF-FPMT-NEW-QUEUE"));
        $sym6$PRINT_FORWARD_PROPAGATE = makeSymbol("PRINT-FORWARD-PROPAGATE");
        $sym7$FORWARD_PROPAGATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FORWARD-PROPAGATE-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("FORWARD-PROPAGATE-P"));
        $sym9$FPMT_OLD_QUEUE = makeSymbol("FPMT-OLD-QUEUE");
        $sym10$_CSETF_FPMT_OLD_QUEUE = makeSymbol("_CSETF-FPMT-OLD-QUEUE");
        $sym11$FPMT_NEW_QUEUE = makeSymbol("FPMT-NEW-QUEUE");
        $sym12$_CSETF_FPMT_NEW_QUEUE = makeSymbol("_CSETF-FPMT-NEW-QUEUE");
        $OLD_QUEUE = makeKeyword("OLD-QUEUE");
        $NEW_QUEUE = makeKeyword("NEW-QUEUE");
        $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym17$MAKE_FORWARD_PROPAGATE = makeSymbol("MAKE-FORWARD-PROPAGATE");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym20$VISIT_DEFSTRUCT_OBJECT_FORWARD_PROPAGATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-FORWARD-PROPAGATE-METHOD");
        $str21$_Forward_Propagate_old__a_new__a = makeString("<Forward Propagate old=~a new=~a");
        $str22$_Invalid_Forward_Propagate__s_ = makeString("<Invalid Forward Propagate ~s>");
        $sym23$QUEUE_P = makeSymbol("QUEUE-P");
        $sym24$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
        $FREE = makeKeyword("FREE");
        $sym26$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
        $sym27$ASSERTION_P = makeSymbol("ASSERTION-P");
    }

    public static class $forward_propagate_native extends SubLStructNative {
        public SubLObject $old_queue;
        public SubLObject $new_queue;
        private static SubLStructDeclNative structDecl;

        public $forward_propagate_native() {
            this.$old_queue = CommonSymbols.NIL;
            this.$new_queue = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $forward_propagate_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$old_queue;
        }

        @Override
        public SubLObject getField3() {
            return this.$new_queue;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$old_queue = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$new_queue = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($forward_propagate_native.class, $sym0$FORWARD_PROPAGATE, $sym1$FORWARD_PROPAGATE_P, $list2, $list3, new String[] { "$old_queue", "$new_queue" }, $list4, $list5, $sym6$PRINT_FORWARD_PROPAGATE);
        }
    }

    public static class $forward_propagate_p$UnaryFunction extends UnaryFunction {
        public $forward_propagate_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORWARD-PROPAGATE-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return forward_propagate_p(arg1);
        }
    }
}
/*
 *
 * Total time: 70 ms
 *
 */