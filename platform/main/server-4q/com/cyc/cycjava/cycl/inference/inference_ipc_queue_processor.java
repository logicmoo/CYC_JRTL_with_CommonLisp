package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.pph_methods;
import com.cyc.cycjava.cycl.pph_proof;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.query_library_api;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.task_processor;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_ipc_queue_processor extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor";
    public static String myFingerPrint = "7d7c0061fe6beb86577d247c5c9db9c1e16fd04937b7dde777c884f317559d7d";
    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 800L)
    private static SubLSymbol $minimum_time_before_sending_new_answers$;
    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLSymbol $dtp_inference_ipc_queue_processor$;
    private static SubLSymbol $sym0$VALID_INFERENCE_P;
    private static SubLSymbol $sym1$IPC_QUEUE_P;
    private static SubLSymbol $sym2$FUNCTION_SPEC_P;
    private static SubLSymbol $sym3$PROPERTY_LIST_P;
    private static SubLSymbol $sym4$NON_NEGATIVE_NUMBER_P;
    private static SubLSymbol $sym5$NON_NEGATIVE_INTEGER_P;
    private static SubLSymbol $sym6$INFERENCE_IPC_QUEUE_PROCESSOR;
    private static SubLSymbol $sym7$INFERENCE_IPC_QUEUE_PROCESSOR_P;
    private static SubLList $list8;
    private static SubLList $list9;
    private static SubLList $list10;
    private static SubLList $list11;
    private static SubLSymbol $sym12$PRINT_INFERENCE_IPC_QUEUE_PROCESSOR;
    private static SubLSymbol $sym13$INFERENCE_IPC_QUEUE_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list14;
    private static SubLSymbol $sym15$INF_IPCQ_PROCESSOR_INFERENCE;
    private static SubLSymbol $sym16$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE;
    private static SubLSymbol $sym17$INF_IPCQ_PROCESSOR_IPC_QUEUE;
    private static SubLSymbol $sym18$_CSETF_INF_IPCQ_PROCESSOR_IPC_QUEUE;
    private static SubLSymbol $sym19$INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION;
    private static SubLSymbol $sym20$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION;
    private static SubLSymbol $sym21$INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES;
    private static SubLSymbol $sym22$_CSETF_INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES;
    private static SubLSymbol $sym23$INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS;
    private static SubLSymbol $sym24$_CSETF_INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS;
    private static SubLSymbol $sym25$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_;
    private static SubLSymbol $sym26$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_;
    private static SubLSymbol $sym27$INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX;
    private static SubLSymbol $sym28$_CSETF_INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX;
    private static SubLSymbol $sym29$INF_IPCQ_PROCESSOR_RESULTS;
    private static SubLSymbol $sym30$_CSETF_INF_IPCQ_PROCESSOR_RESULTS;
    private static SubLSymbol $sym31$INF_IPCQ_PROCESSOR_DONE_;
    private static SubLSymbol $sym32$_CSETF_INF_IPCQ_PROCESSOR_DONE_;
    private static SubLSymbol $sym33$INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME;
    private static SubLSymbol $sym34$_CSETF_INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME;
    private static SubLSymbol $sym35$INF_IPCQ_PROCESSOR_MESSAGE_QUEUE;
    private static SubLSymbol $sym36$_CSETF_INF_IPCQ_PROCESSOR_MESSAGE_QUEUE;
    private static SubLSymbol $sym37$INF_IPCQ_PROCESSOR_INFERENCE_PROCESS;
    private static SubLSymbol $sym38$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_PROCESS;
    private static SubLSymbol $sym39$INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER;
    private static SubLSymbol $sym40$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER;
    private static SubLSymbol $INFERENCE;
    private static SubLSymbol $IPC_QUEUE;
    private static SubLSymbol $INFERENCE_ANSWER_PROCESS_FUNCTION;
    private static SubLSymbol $NL_GENERATION_PROPERTIES;
    private static SubLSymbol $MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS;
    private static SubLSymbol $INCREMENTAL_RESULTS_;
    private static SubLSymbol $NEXT_ANSWER_INDEX;
    private static SubLSymbol $RESULTS;
    private static SubLSymbol $DONE_;
    private static SubLSymbol $LAST_ANSWER_POST_TIME;
    private static SubLSymbol $MESSAGE_QUEUE;
    private static SubLSymbol $INFERENCE_PROCESS;
    private static SubLSymbol $INFERENCE_DEATH_COUNTER;
    private static SubLString $str54$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym56$MAKE_INFERENCE_IPC_QUEUE_PROCESSOR;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym59$VISIT_DEFSTRUCT_OBJECT_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD;
    private static SubLString $str60$_INFERENCE_IPC_QUEUE_PROCESSOR;
    private static SubLString $str61$_DONE;
    private static SubLString $str62$__S;
    private static SubLString $str63$_;
    private static SubLString $str64$inference_done;
    private static SubLSymbol $sym65$SXHASH_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD;
    private static SubLSymbol $INFERENCE_ANSWER;
    private static SubLSymbol $DEAD;
    private static SubLSymbol $NEW_ANSWER;
    private static SubLSymbol $STATUS_CHANGE;
    private static SubLSymbol $INFERENCE_STATUS;
    private static SubLString $str71$New_Inference_Status___A__Inferen;
    private static SubLSymbol $sym72$QL_PROCESS_INFERENCE_ANSWER;
    private static SubLSymbol $BINDINGS;
    private static SubLList $list74;

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 1000L)
    public static SubLObject new_inference_ipc_queue_processor(SubLObject inference, SubLObject ipc_queue, SubLObject inference_answer_process_function, SubLObject nl_generation_properties, SubLObject minimum_time_before_sending_new_answers, SubLObject incremental_resultsP, SubLObject start_index,
            SubLObject inference_process) {
        if (minimum_time_before_sending_new_answers == UNPROVIDED) {
            minimum_time_before_sending_new_answers = $minimum_time_before_sending_new_answers$.getDynamicValue();
        }
        if (incremental_resultsP == UNPROVIDED) {
            incremental_resultsP = T;
        }
        if (start_index == UNPROVIDED) {
            start_index = ZERO_INTEGER;
        }
        if (inference_process == UNPROVIDED) {
            inference_process = NIL;
        }
        assert NIL != inference_datastructures_inference.valid_inference_p(inference) : inference;
        assert NIL != process_utilities.ipc_queue_p(ipc_queue) : ipc_queue;
        if (NIL != inference_answer_process_function && !assertionsDisabledInClass && NIL == Types.function_spec_p(inference_answer_process_function)) {
            throw new AssertionError(inference_answer_process_function);
        }
        assert NIL != list_utilities.property_list_p(nl_generation_properties) : nl_generation_properties;
        assert NIL != number_utilities.non_negative_number_p(minimum_time_before_sending_new_answers) : minimum_time_before_sending_new_answers;
        assert NIL != subl_promotions.non_negative_integer_p(start_index) : start_index;
        return new_inference_ipc_queue_processor_internal(inference, ipc_queue, inference_answer_process_function, nl_generation_properties, minimum_time_before_sending_new_answers, incremental_resultsP, start_index, inference_process);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 2400L)
    public static SubLObject inference_ipc_queue_processor_do_one_iteration(SubLObject ipcq_processor) {
        inf_ipcq_processor_do_one_iteration(ipcq_processor);
        return inference_ipc_queue_processor_results(ipcq_processor);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 2700L)
    public static SubLObject get_inference_ipc_queue_processor_results(SubLObject ipcq_processor) {
        return inference_ipc_queue_processor_results(ipcq_processor);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inference_ipc_queue_processor_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_inference_ipc_queue_processor(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inference_ipc_queue_processor_p(SubLObject v_object) {
        return (v_object.getClass() == $inference_ipc_queue_processor_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_inference(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_ipc_queue(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_inference_answer_process_function(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_nl_generation_properties(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_minimum_time_before_sending_new_answers(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_incremental_resultsP(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_next_answer_index(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_results(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField9();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_doneP(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField10();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_last_answer_post_time(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField11();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_message_queue(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField12();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_inference_process(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField13();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject inf_ipcq_processor_inference_death_counter(SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField14();
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_inference(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_ipc_queue(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_inference_answer_process_function(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_nl_generation_properties(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_incremental_resultsP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_next_answer_index(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_results(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField9(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_doneP(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField10(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_last_answer_post_time(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField11(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_message_queue(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField12(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_inference_process(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField13(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject _csetf_inf_ipcq_processor_inference_death_counter(SubLObject v_object, SubLObject value) {
        assert NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField14(value);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject make_inference_ipc_queue_processor(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $inference_ipc_queue_processor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INFERENCE)) {
                _csetf_inf_ipcq_processor_inference(v_new, current_value);
            } else if (pcase_var.eql($IPC_QUEUE)) {
                _csetf_inf_ipcq_processor_ipc_queue(v_new, current_value);
            } else if (pcase_var.eql($INFERENCE_ANSWER_PROCESS_FUNCTION)) {
                _csetf_inf_ipcq_processor_inference_answer_process_function(v_new, current_value);
            } else if (pcase_var.eql($NL_GENERATION_PROPERTIES)) {
                _csetf_inf_ipcq_processor_nl_generation_properties(v_new, current_value);
            } else if (pcase_var.eql($MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS)) {
                _csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers(v_new, current_value);
            } else if (pcase_var.eql($INCREMENTAL_RESULTS_)) {
                _csetf_inf_ipcq_processor_incremental_resultsP(v_new, current_value);
            } else if (pcase_var.eql($NEXT_ANSWER_INDEX)) {
                _csetf_inf_ipcq_processor_next_answer_index(v_new, current_value);
            } else if (pcase_var.eql($RESULTS)) {
                _csetf_inf_ipcq_processor_results(v_new, current_value);
            } else if (pcase_var.eql($DONE_)) {
                _csetf_inf_ipcq_processor_doneP(v_new, current_value);
            } else if (pcase_var.eql($LAST_ANSWER_POST_TIME)) {
                _csetf_inf_ipcq_processor_last_answer_post_time(v_new, current_value);
            } else if (pcase_var.eql($MESSAGE_QUEUE)) {
                _csetf_inf_ipcq_processor_message_queue(v_new, current_value);
            } else if (pcase_var.eql($INFERENCE_PROCESS)) {
                _csetf_inf_ipcq_processor_inference_process(v_new, current_value);
            } else if (pcase_var.eql($INFERENCE_DEATH_COUNTER)) {
                _csetf_inf_ipcq_processor_inference_death_counter(v_new, current_value);
            } else {
                Errors.error($str54$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject visit_defstruct_inference_ipc_queue_processor(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym56$MAKE_INFERENCE_IPC_QUEUE_PROCESSOR, THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $INFERENCE, inf_ipcq_processor_inference(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $IPC_QUEUE, inf_ipcq_processor_ipc_queue(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INFERENCE_ANSWER_PROCESS_FUNCTION, inf_ipcq_processor_inference_answer_process_function(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NL_GENERATION_PROPERTIES, inf_ipcq_processor_nl_generation_properties(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS, inf_ipcq_processor_minimum_time_before_sending_new_answers(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INCREMENTAL_RESULTS_, inf_ipcq_processor_incremental_resultsP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NEXT_ANSWER_INDEX, inf_ipcq_processor_next_answer_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RESULTS, inf_ipcq_processor_results(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $DONE_, inf_ipcq_processor_doneP(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $LAST_ANSWER_POST_TIME, inf_ipcq_processor_last_answer_post_time(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $MESSAGE_QUEUE, inf_ipcq_processor_message_queue(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INFERENCE_PROCESS, inf_ipcq_processor_inference_process(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $INFERENCE_DEATH_COUNTER, inf_ipcq_processor_inference_death_counter(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym56$MAKE_INFERENCE_IPC_QUEUE_PROCESSOR, THIRTEEN_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3800L)
    public static SubLObject visit_defstruct_object_inference_ipc_queue_processor_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_inference_ipc_queue_processor(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 4200L)
    public static SubLObject print_inference_ipc_queue_processor(SubLObject v_object, SubLObject stream, SubLObject depth) {
        print_high.princ($str60$_INFERENCE_IPC_QUEUE_PROCESSOR, stream);
        if (NIL != inference_ipc_queue_processor_doneP(v_object)) {
            print_high.princ($str61$_DONE, stream);
        } else {
            PrintLow.format(stream, $str62$__S, inference_ipc_queue_processor_ipc_queue(v_object));
        }
        print_high.princ($str63$_, stream);
        return v_object;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 4600L)
    public static SubLObject new_inference_ipc_queue_processor_internal(SubLObject inference, SubLObject ipc_queue, SubLObject inference_answer_process_function, SubLObject nl_generation_properties, SubLObject minimum_time_before_sending_new_answers, SubLObject incremental_resultsP,
            SubLObject start_index, SubLObject inference_process) {
        SubLObject ipcq_processor = make_inference_ipc_queue_processor(UNPROVIDED);
        _csetf_inf_ipcq_processor_inference(ipcq_processor, inference);
        _csetf_inf_ipcq_processor_ipc_queue(ipcq_processor, ipc_queue);
        _csetf_inf_ipcq_processor_inference_answer_process_function(ipcq_processor, inference_answer_process_function);
        _csetf_inf_ipcq_processor_nl_generation_properties(ipcq_processor, nl_generation_properties);
        _csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers(ipcq_processor, minimum_time_before_sending_new_answers);
        _csetf_inf_ipcq_processor_incremental_resultsP(ipcq_processor, incremental_resultsP);
        _csetf_inf_ipcq_processor_next_answer_index(ipcq_processor, start_index);
        _csetf_inf_ipcq_processor_results(ipcq_processor, NIL);
        _csetf_inf_ipcq_processor_doneP(ipcq_processor, Semaphores.new_semaphore($str64$inference_done, ZERO_INTEGER));
        _csetf_inf_ipcq_processor_last_answer_post_time(ipcq_processor, Numbers.subtract(Time.get_internal_real_time(), minimum_time_before_sending_new_answers));
        _csetf_inf_ipcq_processor_message_queue(ipcq_processor, queues.create_queue(UNPROVIDED));
        _csetf_inf_ipcq_processor_inference_process(ipcq_processor, inference_process);
        _csetf_inf_ipcq_processor_inference_death_counter(ipcq_processor, NIL);
        return ipcq_processor;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 6100L)
    public static SubLObject inference_ipc_queue_processor_inference(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_inference(ipcq_processor);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 6300L)
    public static SubLObject inference_ipc_queue_processor_ipc_queue(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_ipc_queue(ipcq_processor);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 6500L)
    public static SubLObject inference_ipc_queue_processor_inference_answer_process_function(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_inference_answer_process_function(ipcq_processor);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 6700L)
    public static SubLObject inference_ipc_queue_processor_nl_generation_properties(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_nl_generation_properties(ipcq_processor);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 7000L)
    public static SubLObject inference_ipc_queue_processor_minimum_time_before_sending_new_answers(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_minimum_time_before_sending_new_answers(ipcq_processor);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 7200L)
    public static SubLObject inference_ipc_queue_processor_incremental_resultsP(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_incremental_resultsP(ipcq_processor);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 7400L)
    public static SubLObject inference_ipc_queue_processor_next_answer_index(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_next_answer_index(ipcq_processor);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 7600L)
    public static SubLObject inference_ipc_queue_processor_increment_next_answer_index(SubLObject ipcq_processor) {
        _csetf_inf_ipcq_processor_next_answer_index(ipcq_processor, Numbers.add(inf_ipcq_processor_next_answer_index(ipcq_processor), ONE_INTEGER));
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 7800L)
    public static SubLObject inference_ipc_queue_processor_results(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_results(ipcq_processor);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 8000L)
    public static SubLObject inference_ipc_queue_processor_doneP(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return Numbers.numGE(Semaphores.semaphore_current_count(inf_ipcq_processor_doneP(ipcq_processor)), ONE_INTEGER);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 8200L)
    public static SubLObject note_ipcq_processor_done(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        Semaphores.semaphore_signal(inf_ipcq_processor_doneP(ipcq_processor));
        return T;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 8400L)
    public static SubLObject inference_ipc_queue_processor_last_answer_post_time(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_last_answer_post_time(ipcq_processor);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 8600L)
    public static SubLObject inference_ipc_queue_processor_update_last_answer_post_time(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        _csetf_inf_ipcq_processor_last_answer_post_time(ipcq_processor, Time.get_internal_real_time());
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 8900L)
    public static SubLObject inference_ipc_queue_processor_enqueue_message(SubLObject ipcq_processor, SubLObject message) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return queues.enqueue(message, inf_ipcq_processor_message_queue(ipcq_processor));
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 9100L)
    public static SubLObject inference_ipc_queue_processor_dequeue_message(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return queues.dequeue(inf_ipcq_processor_message_queue(ipcq_processor));
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 9300L)
    public static SubLObject inference_ipc_queue_processor_has_messagesP(SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return makeBoolean(NIL == queues.queue_empty_p(inf_ipcq_processor_message_queue(ipcq_processor)));
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 9500L)
    public static SubLObject sxhash_inference_ipc_queue_processor_method(SubLObject v_object) {
        return sxhash_inference_ipc_queue_processor(v_object);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 9700L)
    public static SubLObject sxhash_inference_ipc_queue_processor(SubLObject ipcq_processor) {
        return Sxhash.sxhash(inf_ipcq_processor_inference(ipcq_processor));
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 9800L)
    public static SubLObject inf_ipcq_processor_do_one_iteration(SubLObject ipcq_processor) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject has_new_answersP = NIL;
        SubLObject timed_outP = NIL;
        SubLObject inference_doneP = NIL;
        SubLObject inference_event_item = NIL;
        while (NIL == timed_outP && NIL == inference_doneP && (NIL == has_new_answersP || NIL == inf_ipcq_processor_time_to_sendP(ipcq_processor))) {
            SubLObject time_to_wait = inf_ipcq_processor_time_to_wait(ipcq_processor);
            thread.resetMultipleValues();
            SubLObject inference_event_item_$1 = process_utilities.ipc_dequeue_with_timeout(inference_ipc_queue_processor_ipc_queue(ipcq_processor), time_to_wait, UNPROVIDED);
            SubLObject timed_outP_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_event_item = inference_event_item_$1;
            timed_outP = timed_outP_$2;
            if (NIL != inference_event_item) {
                thread.resetMultipleValues();
                SubLObject new_answerP = process_inference_ipc_queue_item(ipcq_processor, inference_event_item);
                SubLObject inference_done_nowP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != new_answerP) {
                    has_new_answersP = T;
                }
                if (NIL == inference_done_nowP) {
                    continue;
                }
                inference_doneP = T;
            }
        }
        if (NIL != inference_ipc_queue_processor_incremental_resultsP(ipcq_processor) && NIL != has_new_answersP) {
            inference_ipc_queue_processor_enqueue_message(ipcq_processor, list($INFERENCE_ANSWER, inf_ipcq_processor_results(ipcq_processor)));
            inference_ipc_queue_processor_update_last_answer_post_time(ipcq_processor);
            _csetf_inf_ipcq_processor_results(ipcq_processor, NIL);
        }
        inf_ipcq_processor_send_messages(ipcq_processor);
        if (NIL != inference_doneP) {
            note_ipcq_processor_done(ipcq_processor);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 11200L)
    public static SubLObject inf_ipcq_processor_send_messages(SubLObject ipcq_processor) {
        while (NIL != inference_ipc_queue_processor_has_messagesP(ipcq_processor)) {
            SubLObject message = inference_ipc_queue_processor_dequeue_message(ipcq_processor);
            task_processor.post_task_info_processor_partial_results(message);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 11500L)
    public static SubLObject inf_ipcq_processor_time_to_sendP(SubLObject ipcq_processor) {
        return Numbers.numG(time_since_last_answer_post(ipcq_processor), inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor));
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 11700L)
    public static SubLObject inf_ipcq_processor_time_to_wait(SubLObject ipcq_processor) {
        SubLObject min = inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor);
        SubLObject elapsed = time_since_last_answer_post(ipcq_processor);
        SubLObject time_to_wait = Numbers.subtract(min, elapsed);
        if (!time_to_wait.isPositive()) {
            time_to_wait = min;
        }
        time_to_wait = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(time_to_wait);
        if (time_to_wait.numL(ONE_INTEGER)) {
            time_to_wait = ONE_INTEGER;
        }
        return time_to_wait;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 12300L)
    public static SubLObject check_running_inference_statusP(SubLObject ipcq_processor, SubLObject status) {
        if (NIL == Threads.valid_process_p(inf_ipcq_processor_inference_process(ipcq_processor))) {
            SubLObject death_counter = inf_ipcq_processor_inference_death_counter(ipcq_processor);
            if (death_counter.isInteger()) {
                if (Time.get_universal_time().numGE(death_counter)) {
                    return NIL;
                }
            } else {
                _csetf_inf_ipcq_processor_inference_death_counter(ipcq_processor, Numbers.add(Time.get_universal_time(), TWO_INTEGER));
            }
        }
        return makeBoolean(NIL == inference_datastructures_enumerated_types.continuable_inference_status_p(status) && $DEAD != status);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 12900L)
    public static SubLObject time_since_last_answer_post(SubLObject ipcq_processor) {
        SubLObject last_answer_post_time = inference_ipc_queue_processor_last_answer_post_time(ipcq_processor);
        SubLObject result = Numbers.subtract(Time.get_internal_real_time(), last_answer_post_time);
        if (result.isNegative()) {
            result = inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor);
        }
        return result;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 13300L)
    public static SubLObject process_inference_ipc_queue_item(SubLObject ipcq_processor, SubLObject inference_event_item) {
        SubLObject incremental_resultsP = inference_ipc_queue_processor_incremental_resultsP(ipcq_processor);
        SubLObject has_new_answersP = NIL;
        SubLObject inference_doneP = NIL;
        if (inference_event_item == $NEW_ANSWER) {
            SubLObject inference = inference_ipc_queue_processor_inference(ipcq_processor);
            SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, inference_ipc_queue_processor_next_answer_index(ipcq_processor));
            if (NIL != v_answer) {
                inference_ipc_queue_processor_increment_next_answer_index(ipcq_processor);
                has_new_answersP = T;
                SubLObject processed_answer = open_cyc_process_inference_answer(ipcq_processor, v_answer);
                inf_ipcq_processor_add_new_result(ipcq_processor, processed_answer);
            }
        } else if (inference_event_item.isList() && inference_event_item.first() == $STATUS_CHANGE) {
            SubLObject new_status = conses_high.second(inference_event_item);
            SubLObject suspend_reason = conses_high.third(inference_event_item);
            post_status_changed(ipcq_processor, new_status, incremental_resultsP, suspend_reason);
            if (NIL == check_running_inference_statusP(ipcq_processor, new_status)) {
                inference_doneP = T;
            }
        }
        return Values.values(has_new_answersP, inference_doneP);
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 14500L)
    public static SubLObject inf_ipcq_processor_add_new_result(SubLObject ipcq_processor, SubLObject processed_answer) {
        SubLObject existing_results = inf_ipcq_processor_results(ipcq_processor);
        _csetf_inf_ipcq_processor_results(ipcq_processor, list_utilities.nadd_to_end(processed_answer, existing_results));
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 14800L)
    public static SubLObject post_status_changed(SubLObject ipcq_processor, SubLObject status, SubLObject incremental_resultsP, SubLObject suspend_reason) {
        if (NIL != incremental_resultsP) {
            inference_ipc_queue_processor_enqueue_message(ipcq_processor, list($INFERENCE_STATUS, status, suspend_reason));
        } else {
            PrintLow.format(T, $str71$New_Inference_Status___A__Inferen, status, suspend_reason);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 15100L)
    public static SubLObject open_cyc_process_inference_answer(SubLObject ipcq_processor, SubLObject inference_answer) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject inference = inference_ipc_queue_processor_inference(ipcq_processor);
        SubLObject inference_answer_process_function = inference_ipc_queue_processor_inference_answer_process_function(ipcq_processor);
        if (NIL == inference_answer_process_function) {
            return convert_unicode_strings_in_bindings_to_utf8(inference_kernel.inference_answer_to_bindings(inference_answer, inference_datastructures_inference.inference_answer_language(inference)));
        }
        SubLObject nl_generation_properties = inference_ipc_queue_processor_nl_generation_properties(ipcq_processor);
        SubLObject result = NIL;
        SubLObject handledP = NIL;
        SubLObject _prev_bind_0 = pph_vars.$pph_inference_answer$.currentBinding(thread);
        SubLObject _prev_bind_2 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
        SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
        SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        SubLObject _prev_bind_5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        SubLObject _prev_bind_6 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
        SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
        SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
        SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding(thread);
        SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
        try {
            pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
            pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
            pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
            pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), UNPROVIDED), thread);
            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
            pph_vars.$pph_repositioned_proofs$.bind(NIL, thread);
            pph_vars.$pph_displayed_proofs$.bind(pph_proof.find_or_create_pph_displayed_proof_stack(), thread);
            pph_vars.$pph_justified_proofs$.bind(pph_proof.find_or_create_pph_justified_proof_set(), thread);
            pph_vars.$pph_proof_depth$.bind(ZERO_INTEGER, thread);
            pph_vars.$pph_displayed_supports$.bind(NIL, thread);
            thread.resetMultipleValues();
            SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
            SubLObject html_target = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject _prev_bind_0_$3 = pph_vars.$constant_link_function$.currentBinding(thread);
            SubLObject _prev_bind_1_$4 = pph_vars.$html_generation_target$.currentBinding(thread);
            try {
                pph_vars.$constant_link_function$.bind((NIL != link_function) ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                pph_vars.$html_generation_target$.bind((NIL != html_target) ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                if (inference_answer_process_function == $sym72$QL_PROCESS_INFERENCE_ANSWER) {
                    handledP = T;
                    result = query_library_api.ql_process_inference_answer(inference, inference_answer, nl_generation_properties);
                }
                if (NIL == handledP) {
                    SubLObject processed_binding_set = Functions.funcall(inference_answer_process_function, inference_answer, nl_generation_properties);
                    result = list($BINDINGS, processed_binding_set);
                }
            } finally {
                pph_vars.$html_generation_target$.rebind(_prev_bind_1_$4, thread);
                pph_vars.$constant_link_function$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            pph_vars.$pph_displayed_supports$.rebind(_prev_bind_10, thread);
            pph_vars.$pph_proof_depth$.rebind(_prev_bind_9, thread);
            pph_vars.$pph_justified_proofs$.rebind(_prev_bind_8, thread);
            pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_7, thread);
            pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_6, thread);
            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_5, thread);
            pph_vars.$pph_domain_mt$.rebind(_prev_bind_4, thread);
            pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
            pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_inference_answer$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 16500L)
    public static SubLObject convert_unicode_strings_in_bindings_to_utf8(SubLObject original_bindings) {
        SubLObject v_bindings = original_bindings;
        SubLObject revisions = NIL;
        SubLObject list_var = NIL;
        SubLObject binding = NIL;
        SubLObject n = NIL;
        list_var = v_bindings;
        binding = list_var.first();
        for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), binding = list_var.first(), n = Numbers.add(ONE_INTEGER, n)) {
            if (NIL != unicode_nauts.unicode_naut_p(bindings.variable_binding_value(binding), UNPROVIDED)) {
                revisions = list_utilities.alist_enter(revisions, n, cycl_string.cycl_string_to_utf8_string(bindings.variable_binding_value(binding)), UNPROVIDED);
            }
        }
        SubLObject cdolist_list_var = revisions;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = cons;
            SubLObject n2 = NIL;
            SubLObject utf8 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list74);
            n2 = current.first();
            current = (utf8 = current.rest());
            v_bindings = list_utilities.replace_nth(n2, bindings.make_variable_binding(bindings.variable_binding_variable(nth(n2, v_bindings)), utf8), v_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return v_bindings;
    }

    public static SubLObject declare_inference_ipc_queue_processor_file() {
        declareFunction(myName, "new_inference_ipc_queue_processor", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR", 4, 4, false);
        declareFunction(myName, "inference_ipc_queue_processor_do_one_iteration", "INFERENCE-IPC-QUEUE-PROCESSOR-DO-ONE-ITERATION", 1, 0, false);
        declareFunction(myName, "get_inference_ipc_queue_processor_results", "GET-INFERENCE-IPC-QUEUE-PROCESSOR-RESULTS", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_print_function_trampoline", "INFERENCE-IPC-QUEUE-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_p", "INFERENCE-IPC-QUEUE-PROCESSOR-P", 1, 0, false);
        new $inference_ipc_queue_processor_p$UnaryFunction();
        declareFunction(myName, "inf_ipcq_processor_inference", "INF-IPCQ-PROCESSOR-INFERENCE", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_ipc_queue", "INF-IPCQ-PROCESSOR-IPC-QUEUE", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_inference_answer_process_function", "INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_nl_generation_properties", "INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_minimum_time_before_sending_new_answers", "INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_incremental_resultsP", "INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_next_answer_index", "INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_results", "INF-IPCQ-PROCESSOR-RESULTS", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_doneP", "INF-IPCQ-PROCESSOR-DONE?", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_last_answer_post_time", "INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_message_queue", "INF-IPCQ-PROCESSOR-MESSAGE-QUEUE", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_inference_process", "INF-IPCQ-PROCESSOR-INFERENCE-PROCESS", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_inference_death_counter", "INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER", 1, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_inference", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_ipc_queue", "_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_inference_answer_process_function", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_nl_generation_properties", "_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers", "_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_incremental_resultsP", "_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_next_answer_index", "_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_results", "_CSETF-INF-IPCQ-PROCESSOR-RESULTS", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_doneP", "_CSETF-INF-IPCQ-PROCESSOR-DONE?", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_last_answer_post_time", "_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_message_queue", "_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_inference_process", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-PROCESS", 2, 0, false);
        declareFunction(myName, "_csetf_inf_ipcq_processor_inference_death_counter", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER", 2, 0, false);
        declareFunction(myName, "make_inference_ipc_queue_processor", "MAKE-INFERENCE-IPC-QUEUE-PROCESSOR", 0, 1, false);
        declareFunction(myName, "visit_defstruct_inference_ipc_queue_processor", "VISIT-DEFSTRUCT-INFERENCE-IPC-QUEUE-PROCESSOR", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_inference_ipc_queue_processor_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD", 2, 0, false);
        declareFunction(myName, "print_inference_ipc_queue_processor", "PRINT-INFERENCE-IPC-QUEUE-PROCESSOR", 3, 0, false);
        declareFunction(myName, "new_inference_ipc_queue_processor_internal", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR-INTERNAL", 8, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_inference", "INFERENCE-IPC-QUEUE-PROCESSOR-INFERENCE", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_ipc_queue", "INFERENCE-IPC-QUEUE-PROCESSOR-IPC-QUEUE", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_inference_answer_process_function", "INFERENCE-IPC-QUEUE-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_nl_generation_properties", "INFERENCE-IPC-QUEUE-PROCESSOR-NL-GENERATION-PROPERTIES", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_minimum_time_before_sending_new_answers", "INFERENCE-IPC-QUEUE-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_incremental_resultsP", "INFERENCE-IPC-QUEUE-PROCESSOR-INCREMENTAL-RESULTS?", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_next_answer_index", "INFERENCE-IPC-QUEUE-PROCESSOR-NEXT-ANSWER-INDEX", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_increment_next_answer_index", "INFERENCE-IPC-QUEUE-PROCESSOR-INCREMENT-NEXT-ANSWER-INDEX", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_results", "INFERENCE-IPC-QUEUE-PROCESSOR-RESULTS", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_doneP", "INFERENCE-IPC-QUEUE-PROCESSOR-DONE?", 1, 0, false);
        declareFunction(myName, "note_ipcq_processor_done", "NOTE-IPCQ-PROCESSOR-DONE", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_last_answer_post_time", "INFERENCE-IPC-QUEUE-PROCESSOR-LAST-ANSWER-POST-TIME", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_update_last_answer_post_time", "INFERENCE-IPC-QUEUE-PROCESSOR-UPDATE-LAST-ANSWER-POST-TIME", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_enqueue_message", "INFERENCE-IPC-QUEUE-PROCESSOR-ENQUEUE-MESSAGE", 2, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_dequeue_message", "INFERENCE-IPC-QUEUE-PROCESSOR-DEQUEUE-MESSAGE", 1, 0, false);
        declareFunction(myName, "inference_ipc_queue_processor_has_messagesP", "INFERENCE-IPC-QUEUE-PROCESSOR-HAS-MESSAGES?", 1, 0, false);
        declareFunction(myName, "sxhash_inference_ipc_queue_processor_method", "SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD", 1, 0, false);
        declareFunction(myName, "sxhash_inference_ipc_queue_processor", "SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_do_one_iteration", "INF-IPCQ-PROCESSOR-DO-ONE-ITERATION", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_send_messages", "INF-IPCQ-PROCESSOR-SEND-MESSAGES", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_time_to_sendP", "INF-IPCQ-PROCESSOR-TIME-TO-SEND?", 1, 0, false);
        declareFunction(myName, "inf_ipcq_processor_time_to_wait", "INF-IPCQ-PROCESSOR-TIME-TO-WAIT", 1, 0, false);
        declareFunction(myName, "check_running_inference_statusP", "CHECK-RUNNING-INFERENCE-STATUS?", 2, 0, false);
        declareFunction(myName, "time_since_last_answer_post", "TIME-SINCE-LAST-ANSWER-POST", 1, 0, false);
        declareFunction(myName, "process_inference_ipc_queue_item", "PROCESS-INFERENCE-IPC-QUEUE-ITEM", 2, 0, false);
        declareFunction(myName, "inf_ipcq_processor_add_new_result", "INF-IPCQ-PROCESSOR-ADD-NEW-RESULT", 2, 0, false);
        declareFunction(myName, "post_status_changed", "POST-STATUS-CHANGED", 4, 0, false);
        declareFunction(myName, "open_cyc_process_inference_answer", "OPEN-CYC-PROCESS-INFERENCE-ANSWER", 2, 0, false);
        declareFunction(myName, "convert_unicode_strings_in_bindings_to_utf8", "CONVERT-UNICODE-STRINGS-IN-BINDINGS-TO-UTF8", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_ipc_queue_processor_file() {
        $minimum_time_before_sending_new_answers$ = defparameter("*MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*", numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time(ONE_INTEGER));
        $dtp_inference_ipc_queue_processor$ = defconstant("*DTP-INFERENCE-IPC-QUEUE-PROCESSOR*", $sym6$INFERENCE_IPC_QUEUE_PROCESSOR);
        return NIL;
    }

    public static SubLObject setup_inference_ipc_queue_processor_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference_ipc_queue_processor$.getGlobalValue(), Symbols.symbol_function($sym13$INFERENCE_IPC_QUEUE_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list14);
        Structures.def_csetf($sym15$INF_IPCQ_PROCESSOR_INFERENCE, $sym16$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE);
        Structures.def_csetf($sym17$INF_IPCQ_PROCESSOR_IPC_QUEUE, $sym18$_CSETF_INF_IPCQ_PROCESSOR_IPC_QUEUE);
        Structures.def_csetf($sym19$INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION, $sym20$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION);
        Structures.def_csetf($sym21$INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES, $sym22$_CSETF_INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES);
        Structures.def_csetf($sym23$INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS, $sym24$_CSETF_INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS);
        Structures.def_csetf($sym25$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_, $sym26$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_);
        Structures.def_csetf($sym27$INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX, $sym28$_CSETF_INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX);
        Structures.def_csetf($sym29$INF_IPCQ_PROCESSOR_RESULTS, $sym30$_CSETF_INF_IPCQ_PROCESSOR_RESULTS);
        Structures.def_csetf($sym31$INF_IPCQ_PROCESSOR_DONE_, $sym32$_CSETF_INF_IPCQ_PROCESSOR_DONE_);
        Structures.def_csetf($sym33$INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME, $sym34$_CSETF_INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME);
        Structures.def_csetf($sym35$INF_IPCQ_PROCESSOR_MESSAGE_QUEUE, $sym36$_CSETF_INF_IPCQ_PROCESSOR_MESSAGE_QUEUE);
        Structures.def_csetf($sym37$INF_IPCQ_PROCESSOR_INFERENCE_PROCESS, $sym38$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_PROCESS);
        Structures.def_csetf($sym39$INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER, $sym40$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER);
        Equality.identity($sym6$INFERENCE_IPC_QUEUE_PROCESSOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_inference_ipc_queue_processor$.getGlobalValue(), Symbols.symbol_function($sym59$VISIT_DEFSTRUCT_OBJECT_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD));
        utilities_macros.note_funcall_helper_function($sym12$PRINT_INFERENCE_IPC_QUEUE_PROCESSOR);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_inference_ipc_queue_processor$.getGlobalValue(), Symbols.symbol_function($sym65$SXHASH_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_ipc_queue_processor_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_ipc_queue_processor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_ipc_queue_processor_file();
    }

    static {
        me = new inference_ipc_queue_processor();
        $minimum_time_before_sending_new_answers$ = null;
        $dtp_inference_ipc_queue_processor$ = null;
        $sym0$VALID_INFERENCE_P = makeSymbol("VALID-INFERENCE-P");
        $sym1$IPC_QUEUE_P = makeSymbol("IPC-QUEUE-P");
        $sym2$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
        $sym3$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
        $sym4$NON_NEGATIVE_NUMBER_P = makeSymbol("NON-NEGATIVE-NUMBER-P");
        $sym5$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym6$INFERENCE_IPC_QUEUE_PROCESSOR = makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR");
        $sym7$INFERENCE_IPC_QUEUE_PROCESSOR_P = makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR-P");
        $list8 = list(new SubLObject[] { makeSymbol("INFERENCE"), makeSymbol("IPC-QUEUE"), makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"), makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeSymbol("INCREMENTAL-RESULTS?"),
                makeSymbol("NEXT-ANSWER-INDEX"), makeSymbol("RESULTS"), makeSymbol("DONE?"), makeSymbol("LAST-ANSWER-POST-TIME"), makeSymbol("MESSAGE-QUEUE"), makeSymbol("INFERENCE-PROCESS"), makeSymbol("INFERENCE-DEATH-COUNTER") });
        $list9 = list(new SubLObject[] { makeKeyword("INFERENCE"), makeKeyword("IPC-QUEUE"), makeKeyword("INFERENCE-ANSWER-PROCESS-FUNCTION"), makeKeyword("NL-GENERATION-PROPERTIES"), makeKeyword("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeKeyword("INCREMENTAL-RESULTS?"),
                makeKeyword("NEXT-ANSWER-INDEX"), makeKeyword("RESULTS"), makeKeyword("DONE?"), makeKeyword("LAST-ANSWER-POST-TIME"), makeKeyword("MESSAGE-QUEUE"), makeKeyword("INFERENCE-PROCESS"), makeKeyword("INFERENCE-DEATH-COUNTER") });
        $list10 = list(new SubLObject[] { makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE"), makeSymbol("INF-IPCQ-PROCESSOR-IPC-QUEUE"), makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION"), makeSymbol("INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES"),
                makeSymbol("INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeSymbol("INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?"), makeSymbol("INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX"), makeSymbol("INF-IPCQ-PROCESSOR-RESULTS"), makeSymbol("INF-IPCQ-PROCESSOR-DONE?"),
                makeSymbol("INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME"), makeSymbol("INF-IPCQ-PROCESSOR-MESSAGE-QUEUE"), makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-PROCESS"), makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER") });
        $list11 = list(new SubLObject[] { makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES"),
                makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-RESULTS"),
                makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-DONE?"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-PROCESS"),
                makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER") });
        $sym12$PRINT_INFERENCE_IPC_QUEUE_PROCESSOR = makeSymbol("PRINT-INFERENCE-IPC-QUEUE-PROCESSOR");
        $sym13$INFERENCE_IPC_QUEUE_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE");
        $list14 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR-P"));
        $sym15$INF_IPCQ_PROCESSOR_INFERENCE = makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE");
        $sym16$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE");
        $sym17$INF_IPCQ_PROCESSOR_IPC_QUEUE = makeSymbol("INF-IPCQ-PROCESSOR-IPC-QUEUE");
        $sym18$_CSETF_INF_IPCQ_PROCESSOR_IPC_QUEUE = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE");
        $sym19$INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION = makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION");
        $sym20$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION");
        $sym21$INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES = makeSymbol("INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES");
        $sym22$_CSETF_INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES");
        $sym23$INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS = makeSymbol("INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS");
        $sym24$_CSETF_INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS");
        $sym25$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_ = makeSymbol("INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?");
        $sym26$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_ = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?");
        $sym27$INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX = makeSymbol("INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX");
        $sym28$_CSETF_INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX");
        $sym29$INF_IPCQ_PROCESSOR_RESULTS = makeSymbol("INF-IPCQ-PROCESSOR-RESULTS");
        $sym30$_CSETF_INF_IPCQ_PROCESSOR_RESULTS = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-RESULTS");
        $sym31$INF_IPCQ_PROCESSOR_DONE_ = makeSymbol("INF-IPCQ-PROCESSOR-DONE?");
        $sym32$_CSETF_INF_IPCQ_PROCESSOR_DONE_ = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-DONE?");
        $sym33$INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME = makeSymbol("INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME");
        $sym34$_CSETF_INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME");
        $sym35$INF_IPCQ_PROCESSOR_MESSAGE_QUEUE = makeSymbol("INF-IPCQ-PROCESSOR-MESSAGE-QUEUE");
        $sym36$_CSETF_INF_IPCQ_PROCESSOR_MESSAGE_QUEUE = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE");
        $sym37$INF_IPCQ_PROCESSOR_INFERENCE_PROCESS = makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-PROCESS");
        $sym38$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_PROCESS = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-PROCESS");
        $sym39$INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER = makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER");
        $sym40$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER");
        $INFERENCE = makeKeyword("INFERENCE");
        $IPC_QUEUE = makeKeyword("IPC-QUEUE");
        $INFERENCE_ANSWER_PROCESS_FUNCTION = makeKeyword("INFERENCE-ANSWER-PROCESS-FUNCTION");
        $NL_GENERATION_PROPERTIES = makeKeyword("NL-GENERATION-PROPERTIES");
        $MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS = makeKeyword("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS");
        $INCREMENTAL_RESULTS_ = makeKeyword("INCREMENTAL-RESULTS?");
        $NEXT_ANSWER_INDEX = makeKeyword("NEXT-ANSWER-INDEX");
        $RESULTS = makeKeyword("RESULTS");
        $DONE_ = makeKeyword("DONE?");
        $LAST_ANSWER_POST_TIME = makeKeyword("LAST-ANSWER-POST-TIME");
        $MESSAGE_QUEUE = makeKeyword("MESSAGE-QUEUE");
        $INFERENCE_PROCESS = makeKeyword("INFERENCE-PROCESS");
        $INFERENCE_DEATH_COUNTER = makeKeyword("INFERENCE-DEATH-COUNTER");
        $str54$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym56$MAKE_INFERENCE_IPC_QUEUE_PROCESSOR = makeSymbol("MAKE-INFERENCE-IPC-QUEUE-PROCESSOR");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym59$VISIT_DEFSTRUCT_OBJECT_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD");
        $str60$_INFERENCE_IPC_QUEUE_PROCESSOR = makeString("<INFERENCE-IPC-QUEUE-PROCESSOR");
        $str61$_DONE = makeString(" DONE");
        $str62$__S = makeString(" ~S");
        $str63$_ = makeString(">");
        $str64$inference_done = makeString("inference-done");
        $sym65$SXHASH_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD = makeSymbol("SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD");
        $INFERENCE_ANSWER = makeKeyword("INFERENCE-ANSWER");
        $DEAD = makeKeyword("DEAD");
        $NEW_ANSWER = makeKeyword("NEW-ANSWER");
        $STATUS_CHANGE = makeKeyword("STATUS-CHANGE");
        $INFERENCE_STATUS = makeKeyword("INFERENCE-STATUS");
        $str71$New_Inference_Status___A__Inferen = makeString("New Inference Status: ~A~%Inference Suspend Status: ~A~%");
        $sym72$QL_PROCESS_INFERENCE_ANSWER = makeSymbol("QL-PROCESS-INFERENCE-ANSWER");
        $BINDINGS = makeKeyword("BINDINGS");
        $list74 = cons(makeSymbol("N"), makeSymbol("UTF8"));
    }

    public static class $inference_ipc_queue_processor_native extends SubLStructNative {
        public SubLObject $inference;
        public SubLObject $ipc_queue;
        public SubLObject $inference_answer_process_function;
        public SubLObject $nl_generation_properties;
        public SubLObject $minimum_time_before_sending_new_answers;
        public SubLObject $incremental_resultsP;
        public SubLObject $next_answer_index;
        public SubLObject $results;
        public SubLObject $doneP;
        public SubLObject $last_answer_post_time;
        public SubLObject $message_queue;
        public SubLObject $inference_process;
        public SubLObject $inference_death_counter;
        private static SubLStructDeclNative structDecl;

        public $inference_ipc_queue_processor_native() {
            this.$inference = CommonSymbols.NIL;
            this.$ipc_queue = CommonSymbols.NIL;
            this.$inference_answer_process_function = CommonSymbols.NIL;
            this.$nl_generation_properties = CommonSymbols.NIL;
            this.$minimum_time_before_sending_new_answers = CommonSymbols.NIL;
            this.$incremental_resultsP = CommonSymbols.NIL;
            this.$next_answer_index = CommonSymbols.NIL;
            this.$results = CommonSymbols.NIL;
            this.$doneP = CommonSymbols.NIL;
            this.$last_answer_post_time = CommonSymbols.NIL;
            this.$message_queue = CommonSymbols.NIL;
            this.$inference_process = CommonSymbols.NIL;
            this.$inference_death_counter = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $inference_ipc_queue_processor_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$inference;
        }

        @Override
        public SubLObject getField3() {
            return this.$ipc_queue;
        }

        @Override
        public SubLObject getField4() {
            return this.$inference_answer_process_function;
        }

        @Override
        public SubLObject getField5() {
            return this.$nl_generation_properties;
        }

        @Override
        public SubLObject getField6() {
            return this.$minimum_time_before_sending_new_answers;
        }

        @Override
        public SubLObject getField7() {
            return this.$incremental_resultsP;
        }

        @Override
        public SubLObject getField8() {
            return this.$next_answer_index;
        }

        @Override
        public SubLObject getField9() {
            return this.$results;
        }

        @Override
        public SubLObject getField10() {
            return this.$doneP;
        }

        @Override
        public SubLObject getField11() {
            return this.$last_answer_post_time;
        }

        @Override
        public SubLObject getField12() {
            return this.$message_queue;
        }

        @Override
        public SubLObject getField13() {
            return this.$inference_process;
        }

        @Override
        public SubLObject getField14() {
            return this.$inference_death_counter;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$inference = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$ipc_queue = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$inference_answer_process_function = value;
        }

        @Override
        public SubLObject setField5(SubLObject value) {
            return this.$nl_generation_properties = value;
        }

        @Override
        public SubLObject setField6(SubLObject value) {
            return this.$minimum_time_before_sending_new_answers = value;
        }

        @Override
        public SubLObject setField7(SubLObject value) {
            return this.$incremental_resultsP = value;
        }

        @Override
        public SubLObject setField8(SubLObject value) {
            return this.$next_answer_index = value;
        }

        @Override
        public SubLObject setField9(SubLObject value) {
            return this.$results = value;
        }

        @Override
        public SubLObject setField10(SubLObject value) {
            return this.$doneP = value;
        }

        @Override
        public SubLObject setField11(SubLObject value) {
            return this.$last_answer_post_time = value;
        }

        @Override
        public SubLObject setField12(SubLObject value) {
            return this.$message_queue = value;
        }

        @Override
        public SubLObject setField13(SubLObject value) {
            return this.$inference_process = value;
        }

        @Override
        public SubLObject setField14(SubLObject value) {
            return this.$inference_death_counter = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($inference_ipc_queue_processor_native.class, $sym6$INFERENCE_IPC_QUEUE_PROCESSOR, $sym7$INFERENCE_IPC_QUEUE_PROCESSOR_P, $list8, $list9, new String[] { "$inference", "$ipc_queue", "$inference_answer_process_function",
                    "$nl_generation_properties", "$minimum_time_before_sending_new_answers", "$incremental_resultsP", "$next_answer_index", "$results", "$doneP", "$last_answer_post_time", "$message_queue", "$inference_process", "$inference_death_counter" }, $list10, $list11,
                    $sym12$PRINT_INFERENCE_IPC_QUEUE_PROCESSOR);
        }
    }

    public static class $inference_ipc_queue_processor_p$UnaryFunction extends UnaryFunction {
        public $inference_ipc_queue_processor_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-IPC-QUEUE-PROCESSOR-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return inference_ipc_queue_processor_p(arg1);
        }
    }
}
/*
 *
 * Total time: 333 ms synthetic
 */