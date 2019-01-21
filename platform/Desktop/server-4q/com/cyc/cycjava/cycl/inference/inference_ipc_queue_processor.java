package com.cyc.cycjava.cycl.inference;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cycl_string;
import com.cyc.cycjava.cycl.unicode_nauts;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.query_library_api;
import com.cyc.cycjava.cycl.pph_macros;
import com.cyc.cycjava.cycl.pph_methods;
import com.cyc.cycjava.cycl.pph_proof;
import com.cyc.cycjava.cycl.pph_vars;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.task_processor;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.queues;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_ipc_queue_processor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor";
    public static final String myFingerPrint = "7d7c0061fe6beb86577d247c5c9db9c1e16fd04937b7dde777c884f317559d7d";
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 865L)
    private static SubLSymbol $minimum_time_before_sending_new_answers$;
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLSymbol $dtp_inference_ipc_queue_processor$;
    private static final SubLSymbol $sym0$VALID_INFERENCE_P;
    private static final SubLSymbol $sym1$IPC_QUEUE_P;
    private static final SubLSymbol $sym2$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym3$PROPERTY_LIST_P;
    private static final SubLSymbol $sym4$NON_NEGATIVE_NUMBER_P;
    private static final SubLSymbol $sym5$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym6$INFERENCE_IPC_QUEUE_PROCESSOR;
    private static final SubLSymbol $sym7$INFERENCE_IPC_QUEUE_PROCESSOR_P;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$PRINT_INFERENCE_IPC_QUEUE_PROCESSOR;
    private static final SubLSymbol $sym13$INFERENCE_IPC_QUEUE_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$INF_IPCQ_PROCESSOR_INFERENCE;
    private static final SubLSymbol $sym16$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE;
    private static final SubLSymbol $sym17$INF_IPCQ_PROCESSOR_IPC_QUEUE;
    private static final SubLSymbol $sym18$_CSETF_INF_IPCQ_PROCESSOR_IPC_QUEUE;
    private static final SubLSymbol $sym19$INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION;
    private static final SubLSymbol $sym20$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION;
    private static final SubLSymbol $sym21$INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES;
    private static final SubLSymbol $sym22$_CSETF_INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES;
    private static final SubLSymbol $sym23$INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS;
    private static final SubLSymbol $sym24$_CSETF_INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS;
    private static final SubLSymbol $sym25$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_;
    private static final SubLSymbol $sym26$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_;
    private static final SubLSymbol $sym27$INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX;
    private static final SubLSymbol $sym28$_CSETF_INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX;
    private static final SubLSymbol $sym29$INF_IPCQ_PROCESSOR_RESULTS;
    private static final SubLSymbol $sym30$_CSETF_INF_IPCQ_PROCESSOR_RESULTS;
    private static final SubLSymbol $sym31$INF_IPCQ_PROCESSOR_DONE_;
    private static final SubLSymbol $sym32$_CSETF_INF_IPCQ_PROCESSOR_DONE_;
    private static final SubLSymbol $sym33$INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME;
    private static final SubLSymbol $sym34$_CSETF_INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME;
    private static final SubLSymbol $sym35$INF_IPCQ_PROCESSOR_MESSAGE_QUEUE;
    private static final SubLSymbol $sym36$_CSETF_INF_IPCQ_PROCESSOR_MESSAGE_QUEUE;
    private static final SubLSymbol $sym37$INF_IPCQ_PROCESSOR_INFERENCE_PROCESS;
    private static final SubLSymbol $sym38$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_PROCESS;
    private static final SubLSymbol $sym39$INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER;
    private static final SubLSymbol $sym40$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER;
    private static final SubLSymbol $kw41$INFERENCE;
    private static final SubLSymbol $kw42$IPC_QUEUE;
    private static final SubLSymbol $kw43$INFERENCE_ANSWER_PROCESS_FUNCTION;
    private static final SubLSymbol $kw44$NL_GENERATION_PROPERTIES;
    private static final SubLSymbol $kw45$MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS;
    private static final SubLSymbol $kw46$INCREMENTAL_RESULTS_;
    private static final SubLSymbol $kw47$NEXT_ANSWER_INDEX;
    private static final SubLSymbol $kw48$RESULTS;
    private static final SubLSymbol $kw49$DONE_;
    private static final SubLSymbol $kw50$LAST_ANSWER_POST_TIME;
    private static final SubLSymbol $kw51$MESSAGE_QUEUE;
    private static final SubLSymbol $kw52$INFERENCE_PROCESS;
    private static final SubLSymbol $kw53$INFERENCE_DEATH_COUNTER;
    private static final SubLString $str54$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw55$BEGIN;
    private static final SubLSymbol $sym56$MAKE_INFERENCE_IPC_QUEUE_PROCESSOR;
    private static final SubLSymbol $kw57$SLOT;
    private static final SubLSymbol $kw58$END;
    private static final SubLSymbol $sym59$VISIT_DEFSTRUCT_OBJECT_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD;
    private static final SubLString $str60$_INFERENCE_IPC_QUEUE_PROCESSOR;
    private static final SubLString $str61$_DONE;
    private static final SubLString $str62$__S;
    private static final SubLString $str63$_;
    private static final SubLString $str64$inference_done;
    private static final SubLSymbol $sym65$SXHASH_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD;
    private static final SubLSymbol $kw66$INFERENCE_ANSWER;
    private static final SubLSymbol $kw67$DEAD;
    private static final SubLSymbol $kw68$NEW_ANSWER;
    private static final SubLSymbol $kw69$STATUS_CHANGE;
    private static final SubLSymbol $kw70$INFERENCE_STATUS;
    private static final SubLString $str71$New_Inference_Status___A__Inferen;
    private static final SubLSymbol $sym72$QL_PROCESS_INFERENCE_ANSWER;
    private static final SubLSymbol $kw73$BINDINGS;
    private static final SubLList $list74;
    
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 1082L)
    public static SubLObject new_inference_ipc_queue_processor(final SubLObject inference, final SubLObject ipc_queue, final SubLObject inference_answer_process_function, final SubLObject nl_generation_properties, SubLObject minimum_time_before_sending_new_answers, SubLObject incremental_resultsP, SubLObject start_index, SubLObject inference_process) {
        if (minimum_time_before_sending_new_answers == inference_ipc_queue_processor.UNPROVIDED) {
            minimum_time_before_sending_new_answers = inference_ipc_queue_processor.$minimum_time_before_sending_new_answers$.getDynamicValue();
        }
        if (incremental_resultsP == inference_ipc_queue_processor.UNPROVIDED) {
            incremental_resultsP = (SubLObject)inference_ipc_queue_processor.T;
        }
        if (start_index == inference_ipc_queue_processor.UNPROVIDED) {
            start_index = (SubLObject)inference_ipc_queue_processor.ZERO_INTEGER;
        }
        if (inference_process == inference_ipc_queue_processor.UNPROVIDED) {
            inference_process = (SubLObject)inference_ipc_queue_processor.NIL;
        }
        assert inference_ipc_queue_processor.NIL != inference_datastructures_inference.valid_inference_p(inference) : inference;
        assert inference_ipc_queue_processor.NIL != process_utilities.ipc_queue_p(ipc_queue) : ipc_queue;
        if (inference_ipc_queue_processor.NIL != inference_answer_process_function && !inference_ipc_queue_processor.assertionsDisabledInClass && inference_ipc_queue_processor.NIL == Types.function_spec_p(inference_answer_process_function)) {
            throw new AssertionError(inference_answer_process_function);
        }
        assert inference_ipc_queue_processor.NIL != list_utilities.property_list_p(nl_generation_properties) : nl_generation_properties;
        assert inference_ipc_queue_processor.NIL != number_utilities.non_negative_number_p(minimum_time_before_sending_new_answers) : minimum_time_before_sending_new_answers;
        assert inference_ipc_queue_processor.NIL != subl_promotions.non_negative_integer_p(start_index) : start_index;
        return new_inference_ipc_queue_processor_internal(inference, ipc_queue, inference_answer_process_function, nl_generation_properties, minimum_time_before_sending_new_answers, incremental_resultsP, start_index, inference_process);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 2424L)
    public static SubLObject inference_ipc_queue_processor_do_one_iteration(final SubLObject ipcq_processor) {
        inf_ipcq_processor_do_one_iteration(ipcq_processor);
        return inference_ipc_queue_processor_results(ipcq_processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 2792L)
    public static SubLObject get_inference_ipc_queue_processor_results(final SubLObject ipcq_processor) {
        return inference_ipc_queue_processor_results(ipcq_processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inference_ipc_queue_processor_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_inference_ipc_queue_processor(v_object, stream, (SubLObject)inference_ipc_queue_processor.ZERO_INTEGER);
        return (SubLObject)inference_ipc_queue_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inference_ipc_queue_processor_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $inference_ipc_queue_processor_native.class) ? inference_ipc_queue_processor.T : inference_ipc_queue_processor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_inference(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_ipc_queue(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_inference_answer_process_function(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_nl_generation_properties(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_minimum_time_before_sending_new_answers(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_incremental_resultsP(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_next_answer_index(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_results(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_doneP(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_last_answer_post_time(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_message_queue(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_inference_process(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject inf_ipcq_processor_inference_death_counter(final SubLObject v_object) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.getField14();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_inference(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_ipc_queue(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_inference_answer_process_function(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_nl_generation_properties(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_incremental_resultsP(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_next_answer_index(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_results(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_doneP(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_last_answer_post_time(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_message_queue(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_inference_process(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject _csetf_inf_ipcq_processor_inference_death_counter(final SubLObject v_object, final SubLObject value) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(v_object) : v_object;
        return v_object.setField14(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject make_inference_ipc_queue_processor(SubLObject arglist) {
        if (arglist == inference_ipc_queue_processor.UNPROVIDED) {
            arglist = (SubLObject)inference_ipc_queue_processor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $inference_ipc_queue_processor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)inference_ipc_queue_processor.NIL, next = arglist; inference_ipc_queue_processor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw41$INFERENCE)) {
                _csetf_inf_ipcq_processor_inference(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw42$IPC_QUEUE)) {
                _csetf_inf_ipcq_processor_ipc_queue(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw43$INFERENCE_ANSWER_PROCESS_FUNCTION)) {
                _csetf_inf_ipcq_processor_inference_answer_process_function(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw44$NL_GENERATION_PROPERTIES)) {
                _csetf_inf_ipcq_processor_nl_generation_properties(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw45$MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS)) {
                _csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw46$INCREMENTAL_RESULTS_)) {
                _csetf_inf_ipcq_processor_incremental_resultsP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw47$NEXT_ANSWER_INDEX)) {
                _csetf_inf_ipcq_processor_next_answer_index(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw48$RESULTS)) {
                _csetf_inf_ipcq_processor_results(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw49$DONE_)) {
                _csetf_inf_ipcq_processor_doneP(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw50$LAST_ANSWER_POST_TIME)) {
                _csetf_inf_ipcq_processor_last_answer_post_time(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw51$MESSAGE_QUEUE)) {
                _csetf_inf_ipcq_processor_message_queue(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw52$INFERENCE_PROCESS)) {
                _csetf_inf_ipcq_processor_inference_process(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)inference_ipc_queue_processor.$kw53$INFERENCE_DEATH_COUNTER)) {
                _csetf_inf_ipcq_processor_inference_death_counter(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)inference_ipc_queue_processor.$str54$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject visit_defstruct_inference_ipc_queue_processor(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw55$BEGIN, (SubLObject)inference_ipc_queue_processor.$sym56$MAKE_INFERENCE_IPC_QUEUE_PROCESSOR, (SubLObject)inference_ipc_queue_processor.THIRTEEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw41$INFERENCE, inf_ipcq_processor_inference(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw42$IPC_QUEUE, inf_ipcq_processor_ipc_queue(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw43$INFERENCE_ANSWER_PROCESS_FUNCTION, inf_ipcq_processor_inference_answer_process_function(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw44$NL_GENERATION_PROPERTIES, inf_ipcq_processor_nl_generation_properties(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw45$MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS, inf_ipcq_processor_minimum_time_before_sending_new_answers(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw46$INCREMENTAL_RESULTS_, inf_ipcq_processor_incremental_resultsP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw47$NEXT_ANSWER_INDEX, inf_ipcq_processor_next_answer_index(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw48$RESULTS, inf_ipcq_processor_results(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw49$DONE_, inf_ipcq_processor_doneP(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw50$LAST_ANSWER_POST_TIME, inf_ipcq_processor_last_answer_post_time(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw51$MESSAGE_QUEUE, inf_ipcq_processor_message_queue(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw52$INFERENCE_PROCESS, inf_ipcq_processor_inference_process(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw57$SLOT, (SubLObject)inference_ipc_queue_processor.$kw53$INFERENCE_DEATH_COUNTER, inf_ipcq_processor_inference_death_counter(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)inference_ipc_queue_processor.$kw58$END, (SubLObject)inference_ipc_queue_processor.$sym56$MAKE_INFERENCE_IPC_QUEUE_PROCESSOR, (SubLObject)inference_ipc_queue_processor.THIRTEEN_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 3828L)
    public static SubLObject visit_defstruct_object_inference_ipc_queue_processor_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_inference_ipc_queue_processor(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 4256L)
    public static SubLObject print_inference_ipc_queue_processor(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        print_high.princ((SubLObject)inference_ipc_queue_processor.$str60$_INFERENCE_IPC_QUEUE_PROCESSOR, stream);
        if (inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_doneP(v_object)) {
            print_high.princ((SubLObject)inference_ipc_queue_processor.$str61$_DONE, stream);
        }
        else {
            PrintLow.format(stream, (SubLObject)inference_ipc_queue_processor.$str62$__S, inference_ipc_queue_processor_ipc_queue(v_object));
        }
        print_high.princ((SubLObject)inference_ipc_queue_processor.$str63$_, stream);
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 4604L)
    public static SubLObject new_inference_ipc_queue_processor_internal(final SubLObject inference, final SubLObject ipc_queue, final SubLObject inference_answer_process_function, final SubLObject nl_generation_properties, final SubLObject minimum_time_before_sending_new_answers, final SubLObject incremental_resultsP, final SubLObject start_index, final SubLObject inference_process) {
        final SubLObject ipcq_processor = make_inference_ipc_queue_processor((SubLObject)inference_ipc_queue_processor.UNPROVIDED);
        _csetf_inf_ipcq_processor_inference(ipcq_processor, inference);
        _csetf_inf_ipcq_processor_ipc_queue(ipcq_processor, ipc_queue);
        _csetf_inf_ipcq_processor_inference_answer_process_function(ipcq_processor, inference_answer_process_function);
        _csetf_inf_ipcq_processor_nl_generation_properties(ipcq_processor, nl_generation_properties);
        _csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers(ipcq_processor, minimum_time_before_sending_new_answers);
        _csetf_inf_ipcq_processor_incremental_resultsP(ipcq_processor, incremental_resultsP);
        _csetf_inf_ipcq_processor_next_answer_index(ipcq_processor, start_index);
        _csetf_inf_ipcq_processor_results(ipcq_processor, (SubLObject)inference_ipc_queue_processor.NIL);
        _csetf_inf_ipcq_processor_doneP(ipcq_processor, Semaphores.new_semaphore((SubLObject)inference_ipc_queue_processor.$str64$inference_done, (SubLObject)inference_ipc_queue_processor.ZERO_INTEGER));
        _csetf_inf_ipcq_processor_last_answer_post_time(ipcq_processor, Numbers.subtract(Time.get_internal_real_time(), minimum_time_before_sending_new_answers));
        _csetf_inf_ipcq_processor_message_queue(ipcq_processor, queues.create_queue((SubLObject)inference_ipc_queue_processor.UNPROVIDED));
        _csetf_inf_ipcq_processor_inference_process(ipcq_processor, inference_process);
        _csetf_inf_ipcq_processor_inference_death_counter(ipcq_processor, (SubLObject)inference_ipc_queue_processor.NIL);
        return ipcq_processor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 6160L)
    public static SubLObject inference_ipc_queue_processor_inference(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_inference(ipcq_processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 6363L)
    public static SubLObject inference_ipc_queue_processor_ipc_queue(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_ipc_queue(ipcq_processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 6554L)
    public static SubLObject inference_ipc_queue_processor_inference_answer_process_function(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_inference_answer_process_function(ipcq_processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 6793L)
    public static SubLObject inference_ipc_queue_processor_nl_generation_properties(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_nl_generation_properties(ipcq_processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 7014L)
    public static SubLObject inference_ipc_queue_processor_minimum_time_before_sending_new_answers(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_minimum_time_before_sending_new_answers(ipcq_processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 7265L)
    public static SubLObject inference_ipc_queue_processor_incremental_resultsP(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_incremental_resultsP(ipcq_processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 7478L)
    public static SubLObject inference_ipc_queue_processor_next_answer_index(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_next_answer_index(ipcq_processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 7685L)
    public static SubLObject inference_ipc_queue_processor_increment_next_answer_index(final SubLObject ipcq_processor) {
        _csetf_inf_ipcq_processor_next_answer_index(ipcq_processor, Numbers.add(inf_ipcq_processor_next_answer_index(ipcq_processor), (SubLObject)inference_ipc_queue_processor.ONE_INTEGER));
        return (SubLObject)inference_ipc_queue_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 7853L)
    public static SubLObject inference_ipc_queue_processor_results(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_results(ipcq_processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 8040L)
    public static SubLObject inference_ipc_queue_processor_doneP(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return Numbers.numGE(Semaphores.semaphore_current_count(inf_ipcq_processor_doneP(ipcq_processor)), (SubLObject)inference_ipc_queue_processor.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 8258L)
    public static SubLObject note_ipcq_processor_done(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        Semaphores.semaphore_signal(inf_ipcq_processor_doneP(ipcq_processor));
        return (SubLObject)inference_ipc_queue_processor.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 8453L)
    public static SubLObject inference_ipc_queue_processor_last_answer_post_time(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return inf_ipcq_processor_last_answer_post_time(ipcq_processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 8668L)
    public static SubLObject inference_ipc_queue_processor_update_last_answer_post_time(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        _csetf_inf_ipcq_processor_last_answer_post_time(ipcq_processor, Time.get_internal_real_time());
        return (SubLObject)inference_ipc_queue_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 8929L)
    public static SubLObject inference_ipc_queue_processor_enqueue_message(final SubLObject ipcq_processor, final SubLObject message) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return queues.enqueue(message, inf_ipcq_processor_message_queue(ipcq_processor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 9158L)
    public static SubLObject inference_ipc_queue_processor_dequeue_message(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return queues.dequeue(inf_ipcq_processor_message_queue(ipcq_processor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 9371L)
    public static SubLObject inference_ipc_queue_processor_has_messagesP(final SubLObject ipcq_processor) {
        assert inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_p(ipcq_processor) : ipcq_processor;
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_ipc_queue_processor.NIL == queues.queue_empty_p(inf_ipcq_processor_message_queue(ipcq_processor)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 9595L)
    public static SubLObject sxhash_inference_ipc_queue_processor_method(final SubLObject v_object) {
        return sxhash_inference_ipc_queue_processor(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 9733L)
    public static SubLObject sxhash_inference_ipc_queue_processor(final SubLObject ipcq_processor) {
        return Sxhash.sxhash(inf_ipcq_processor_inference(ipcq_processor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 9880L)
    public static SubLObject inf_ipcq_processor_do_one_iteration(final SubLObject ipcq_processor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject has_new_answersP = (SubLObject)inference_ipc_queue_processor.NIL;
        SubLObject timed_outP = (SubLObject)inference_ipc_queue_processor.NIL;
        SubLObject inference_doneP = (SubLObject)inference_ipc_queue_processor.NIL;
        SubLObject inference_event_item = (SubLObject)inference_ipc_queue_processor.NIL;
        while (inference_ipc_queue_processor.NIL == timed_outP && inference_ipc_queue_processor.NIL == inference_doneP && (inference_ipc_queue_processor.NIL == has_new_answersP || inference_ipc_queue_processor.NIL == inf_ipcq_processor_time_to_sendP(ipcq_processor))) {
            final SubLObject time_to_wait = inf_ipcq_processor_time_to_wait(ipcq_processor);
            thread.resetMultipleValues();
            final SubLObject inference_event_item_$1 = process_utilities.ipc_dequeue_with_timeout(inference_ipc_queue_processor_ipc_queue(ipcq_processor), time_to_wait, (SubLObject)inference_ipc_queue_processor.UNPROVIDED);
            final SubLObject timed_outP_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_event_item = inference_event_item_$1;
            timed_outP = timed_outP_$2;
            if (inference_ipc_queue_processor.NIL != inference_event_item) {
                thread.resetMultipleValues();
                final SubLObject new_answerP = process_inference_ipc_queue_item(ipcq_processor, inference_event_item);
                final SubLObject inference_done_nowP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (inference_ipc_queue_processor.NIL != new_answerP) {
                    has_new_answersP = (SubLObject)inference_ipc_queue_processor.T;
                }
                if (inference_ipc_queue_processor.NIL == inference_done_nowP) {
                    continue;
                }
                inference_doneP = (SubLObject)inference_ipc_queue_processor.T;
            }
        }
        if (inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_incremental_resultsP(ipcq_processor) && inference_ipc_queue_processor.NIL != has_new_answersP) {
            inference_ipc_queue_processor_enqueue_message(ipcq_processor, (SubLObject)ConsesLow.list((SubLObject)inference_ipc_queue_processor.$kw66$INFERENCE_ANSWER, inf_ipcq_processor_results(ipcq_processor)));
            inference_ipc_queue_processor_update_last_answer_post_time(ipcq_processor);
            _csetf_inf_ipcq_processor_results(ipcq_processor, (SubLObject)inference_ipc_queue_processor.NIL);
        }
        inf_ipcq_processor_send_messages(ipcq_processor);
        if (inference_ipc_queue_processor.NIL != inference_doneP) {
            note_ipcq_processor_done(ipcq_processor);
        }
        return (SubLObject)inference_ipc_queue_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 11258L)
    public static SubLObject inf_ipcq_processor_send_messages(final SubLObject ipcq_processor) {
        while (inference_ipc_queue_processor.NIL != inference_ipc_queue_processor_has_messagesP(ipcq_processor)) {
            final SubLObject message = inference_ipc_queue_processor_dequeue_message(ipcq_processor);
            task_processor.post_task_info_processor_partial_results(message);
        }
        return (SubLObject)inference_ipc_queue_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 11552L)
    public static SubLObject inf_ipcq_processor_time_to_sendP(final SubLObject ipcq_processor) {
        return Numbers.numG(time_since_last_answer_post(ipcq_processor), inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 11767L)
    public static SubLObject inf_ipcq_processor_time_to_wait(final SubLObject ipcq_processor) {
        final SubLObject min = inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor);
        final SubLObject elapsed = time_since_last_answer_post(ipcq_processor);
        SubLObject time_to_wait = Numbers.subtract(min, elapsed);
        if (!time_to_wait.isPositive()) {
            time_to_wait = min;
        }
        time_to_wait = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(time_to_wait);
        if (time_to_wait.numL((SubLObject)inference_ipc_queue_processor.ONE_INTEGER)) {
            time_to_wait = (SubLObject)inference_ipc_queue_processor.ONE_INTEGER;
        }
        return time_to_wait;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 12352L)
    public static SubLObject check_running_inference_statusP(final SubLObject ipcq_processor, final SubLObject status) {
        if (inference_ipc_queue_processor.NIL == Threads.valid_process_p(inf_ipcq_processor_inference_process(ipcq_processor))) {
            final SubLObject death_counter = inf_ipcq_processor_inference_death_counter(ipcq_processor);
            if (death_counter.isInteger()) {
                if (Time.get_universal_time().numGE(death_counter)) {
                    return (SubLObject)inference_ipc_queue_processor.NIL;
                }
            }
            else {
                _csetf_inf_ipcq_processor_inference_death_counter(ipcq_processor, Numbers.add(Time.get_universal_time(), (SubLObject)inference_ipc_queue_processor.TWO_INTEGER));
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_ipc_queue_processor.NIL == inference_datastructures_enumerated_types.continuable_inference_status_p(status) && inference_ipc_queue_processor.$kw67$DEAD != status);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 12932L)
    public static SubLObject time_since_last_answer_post(final SubLObject ipcq_processor) {
        final SubLObject last_answer_post_time = inference_ipc_queue_processor_last_answer_post_time(ipcq_processor);
        SubLObject result = Numbers.subtract(Time.get_internal_real_time(), last_answer_post_time);
        if (result.isNegative()) {
            result = inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 13314L)
    public static SubLObject process_inference_ipc_queue_item(final SubLObject ipcq_processor, final SubLObject inference_event_item) {
        final SubLObject incremental_resultsP = inference_ipc_queue_processor_incremental_resultsP(ipcq_processor);
        SubLObject has_new_answersP = (SubLObject)inference_ipc_queue_processor.NIL;
        SubLObject inference_doneP = (SubLObject)inference_ipc_queue_processor.NIL;
        if (inference_event_item == inference_ipc_queue_processor.$kw68$NEW_ANSWER) {
            final SubLObject inference = inference_ipc_queue_processor_inference(ipcq_processor);
            final SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, inference_ipc_queue_processor_next_answer_index(ipcq_processor));
            if (inference_ipc_queue_processor.NIL != v_answer) {
                inference_ipc_queue_processor_increment_next_answer_index(ipcq_processor);
                has_new_answersP = (SubLObject)inference_ipc_queue_processor.T;
                final SubLObject processed_answer = open_cyc_process_inference_answer(ipcq_processor, v_answer);
                inf_ipcq_processor_add_new_result(ipcq_processor, processed_answer);
            }
        }
        else if (inference_event_item.isList() && inference_event_item.first() == inference_ipc_queue_processor.$kw69$STATUS_CHANGE) {
            final SubLObject new_status = conses_high.second(inference_event_item);
            final SubLObject suspend_reason = conses_high.third(inference_event_item);
            post_status_changed(ipcq_processor, new_status, incremental_resultsP, suspend_reason);
            if (inference_ipc_queue_processor.NIL == check_running_inference_statusP(ipcq_processor, new_status)) {
                inference_doneP = (SubLObject)inference_ipc_queue_processor.T;
            }
        }
        return Values.values(has_new_answersP, inference_doneP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 14545L)
    public static SubLObject inf_ipcq_processor_add_new_result(final SubLObject ipcq_processor, final SubLObject processed_answer) {
        final SubLObject existing_results = inf_ipcq_processor_results(ipcq_processor);
        _csetf_inf_ipcq_processor_results(ipcq_processor, list_utilities.nadd_to_end(processed_answer, existing_results));
        return (SubLObject)inference_ipc_queue_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 14831L)
    public static SubLObject post_status_changed(final SubLObject ipcq_processor, final SubLObject status, final SubLObject incremental_resultsP, final SubLObject suspend_reason) {
        if (inference_ipc_queue_processor.NIL != incremental_resultsP) {
            inference_ipc_queue_processor_enqueue_message(ipcq_processor, (SubLObject)ConsesLow.list((SubLObject)inference_ipc_queue_processor.$kw70$INFERENCE_STATUS, status, suspend_reason));
        }
        else {
            PrintLow.format((SubLObject)inference_ipc_queue_processor.T, (SubLObject)inference_ipc_queue_processor.$str71$New_Inference_Status___A__Inferen, status, suspend_reason);
        }
        return (SubLObject)inference_ipc_queue_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 15194L)
    public static SubLObject open_cyc_process_inference_answer(final SubLObject ipcq_processor, final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference = inference_ipc_queue_processor_inference(ipcq_processor);
        final SubLObject inference_answer_process_function = inference_ipc_queue_processor_inference_answer_process_function(ipcq_processor);
        if (inference_ipc_queue_processor.NIL == inference_answer_process_function) {
            return convert_unicode_strings_in_bindings_to_utf8(inference_kernel.inference_answer_to_bindings(inference_answer, inference_datastructures_inference.inference_answer_language(inference)));
        }
        final SubLObject nl_generation_properties = inference_ipc_queue_processor_nl_generation_properties(ipcq_processor);
        SubLObject result = (SubLObject)inference_ipc_queue_processor.NIL;
        SubLObject handledP = (SubLObject)inference_ipc_queue_processor.NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_inference_answer$.currentBinding(thread);
        final SubLObject _prev_bind_2 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = pph_vars.$pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_5 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_7 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_8 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_9 = pph_vars.$pph_proof_depth$.currentBinding(thread);
        final SubLObject _prev_bind_10 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
        try {
            pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
            pph_vars.$pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
            pph_vars.$pph_handle_hypotheticalsP$.bind((SubLObject)inference_ipc_queue_processor.T, thread);
            pph_vars.$pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_proof.pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), (SubLObject)inference_ipc_queue_processor.UNPROVIDED), thread);
            pph_vars.$pph_use_bulleted_listsP$.bind((SubLObject)inference_ipc_queue_processor.T, thread);
            pph_vars.$pph_repositioned_proofs$.bind((SubLObject)inference_ipc_queue_processor.NIL, thread);
            pph_vars.$pph_displayed_proofs$.bind(pph_proof.find_or_create_pph_displayed_proof_stack(), thread);
            pph_vars.$pph_justified_proofs$.bind(pph_proof.find_or_create_pph_justified_proof_set(), thread);
            pph_vars.$pph_proof_depth$.bind((SubLObject)inference_ipc_queue_processor.ZERO_INTEGER, thread);
            pph_vars.$pph_displayed_supports$.bind((SubLObject)inference_ipc_queue_processor.NIL, thread);
            thread.resetMultipleValues();
            final SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
            final SubLObject html_target = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$3 = pph_vars.$constant_link_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$4 = pph_vars.$html_generation_target$.currentBinding(thread);
            try {
                pph_vars.$constant_link_function$.bind((inference_ipc_queue_processor.NIL != link_function) ? link_function : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                pph_vars.$html_generation_target$.bind((inference_ipc_queue_processor.NIL != html_target) ? html_target : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                if (inference_answer_process_function == inference_ipc_queue_processor.$sym72$QL_PROCESS_INFERENCE_ANSWER) {
                    handledP = (SubLObject)inference_ipc_queue_processor.T;
                    result = query_library_api.ql_process_inference_answer(inference, inference_answer, nl_generation_properties);
                }
                if (inference_ipc_queue_processor.NIL == handledP) {
                    final SubLObject processed_binding_set = Functions.funcall(inference_answer_process_function, inference_answer, nl_generation_properties);
                    result = (SubLObject)ConsesLow.list((SubLObject)inference_ipc_queue_processor.$kw73$BINDINGS, processed_binding_set);
                }
            }
            finally {
                pph_vars.$html_generation_target$.rebind(_prev_bind_1_$4, thread);
                pph_vars.$constant_link_function$.rebind(_prev_bind_0_$3, thread);
            }
        }
        finally {
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
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/inference-ipc-queue-processor.lisp", position = 16559L)
    public static SubLObject convert_unicode_strings_in_bindings_to_utf8(final SubLObject original_bindings) {
        SubLObject v_bindings = original_bindings;
        SubLObject revisions = (SubLObject)inference_ipc_queue_processor.NIL;
        SubLObject list_var = (SubLObject)inference_ipc_queue_processor.NIL;
        SubLObject binding = (SubLObject)inference_ipc_queue_processor.NIL;
        SubLObject n = (SubLObject)inference_ipc_queue_processor.NIL;
        list_var = v_bindings;
        binding = list_var.first();
        for (n = (SubLObject)inference_ipc_queue_processor.ZERO_INTEGER; inference_ipc_queue_processor.NIL != list_var; list_var = list_var.rest(), binding = list_var.first(), n = Numbers.add((SubLObject)inference_ipc_queue_processor.ONE_INTEGER, n)) {
            if (inference_ipc_queue_processor.NIL != unicode_nauts.unicode_naut_p(bindings.variable_binding_value(binding), (SubLObject)inference_ipc_queue_processor.UNPROVIDED)) {
                revisions = list_utilities.alist_enter(revisions, n, cycl_string.cycl_string_to_utf8_string(bindings.variable_binding_value(binding)), (SubLObject)inference_ipc_queue_processor.UNPROVIDED);
            }
        }
        SubLObject cdolist_list_var = revisions;
        SubLObject cons = (SubLObject)inference_ipc_queue_processor.NIL;
        cons = cdolist_list_var.first();
        while (inference_ipc_queue_processor.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject n2 = (SubLObject)inference_ipc_queue_processor.NIL;
            SubLObject utf8 = (SubLObject)inference_ipc_queue_processor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_ipc_queue_processor.$list74);
            n2 = current.first();
            current = (utf8 = current.rest());
            v_bindings = list_utilities.replace_nth(n2, bindings.make_variable_binding(bindings.variable_binding_variable(ConsesLow.nth(n2, v_bindings)), utf8), v_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return v_bindings;
    }
    
    public static SubLObject declare_inference_ipc_queue_processor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "new_inference_ipc_queue_processor", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_do_one_iteration", "INFERENCE-IPC-QUEUE-PROCESSOR-DO-ONE-ITERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "get_inference_ipc_queue_processor_results", "GET-INFERENCE-IPC-QUEUE-PROCESSOR-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_print_function_trampoline", "INFERENCE-IPC-QUEUE-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_p", "INFERENCE-IPC-QUEUE-PROCESSOR-P", 1, 0, false);
        new $inference_ipc_queue_processor_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_inference", "INF-IPCQ-PROCESSOR-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_ipc_queue", "INF-IPCQ-PROCESSOR-IPC-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_inference_answer_process_function", "INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_nl_generation_properties", "INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_minimum_time_before_sending_new_answers", "INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_incremental_resultsP", "INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_next_answer_index", "INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_results", "INF-IPCQ-PROCESSOR-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_doneP", "INF-IPCQ-PROCESSOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_last_answer_post_time", "INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_message_queue", "INF-IPCQ-PROCESSOR-MESSAGE-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_inference_process", "INF-IPCQ-PROCESSOR-INFERENCE-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_inference_death_counter", "INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_inference", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_ipc_queue", "_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_inference_answer_process_function", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_nl_generation_properties", "_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers", "_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_incremental_resultsP", "_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_next_answer_index", "_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_results", "_CSETF-INF-IPCQ-PROCESSOR-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_doneP", "_CSETF-INF-IPCQ-PROCESSOR-DONE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_last_answer_post_time", "_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_message_queue", "_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_inference_process", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "_csetf_inf_ipcq_processor_inference_death_counter", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "make_inference_ipc_queue_processor", "MAKE-INFERENCE-IPC-QUEUE-PROCESSOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "visit_defstruct_inference_ipc_queue_processor", "VISIT-DEFSTRUCT-INFERENCE-IPC-QUEUE-PROCESSOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "visit_defstruct_object_inference_ipc_queue_processor_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "print_inference_ipc_queue_processor", "PRINT-INFERENCE-IPC-QUEUE-PROCESSOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "new_inference_ipc_queue_processor_internal", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR-INTERNAL", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_inference", "INFERENCE-IPC-QUEUE-PROCESSOR-INFERENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_ipc_queue", "INFERENCE-IPC-QUEUE-PROCESSOR-IPC-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_inference_answer_process_function", "INFERENCE-IPC-QUEUE-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_nl_generation_properties", "INFERENCE-IPC-QUEUE-PROCESSOR-NL-GENERATION-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_minimum_time_before_sending_new_answers", "INFERENCE-IPC-QUEUE-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_incremental_resultsP", "INFERENCE-IPC-QUEUE-PROCESSOR-INCREMENTAL-RESULTS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_next_answer_index", "INFERENCE-IPC-QUEUE-PROCESSOR-NEXT-ANSWER-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_increment_next_answer_index", "INFERENCE-IPC-QUEUE-PROCESSOR-INCREMENT-NEXT-ANSWER-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_results", "INFERENCE-IPC-QUEUE-PROCESSOR-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_doneP", "INFERENCE-IPC-QUEUE-PROCESSOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "note_ipcq_processor_done", "NOTE-IPCQ-PROCESSOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_last_answer_post_time", "INFERENCE-IPC-QUEUE-PROCESSOR-LAST-ANSWER-POST-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_update_last_answer_post_time", "INFERENCE-IPC-QUEUE-PROCESSOR-UPDATE-LAST-ANSWER-POST-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_enqueue_message", "INFERENCE-IPC-QUEUE-PROCESSOR-ENQUEUE-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_dequeue_message", "INFERENCE-IPC-QUEUE-PROCESSOR-DEQUEUE-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inference_ipc_queue_processor_has_messagesP", "INFERENCE-IPC-QUEUE-PROCESSOR-HAS-MESSAGES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "sxhash_inference_ipc_queue_processor_method", "SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "sxhash_inference_ipc_queue_processor", "SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_do_one_iteration", "INF-IPCQ-PROCESSOR-DO-ONE-ITERATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_send_messages", "INF-IPCQ-PROCESSOR-SEND-MESSAGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_time_to_sendP", "INF-IPCQ-PROCESSOR-TIME-TO-SEND?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_time_to_wait", "INF-IPCQ-PROCESSOR-TIME-TO-WAIT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "check_running_inference_statusP", "CHECK-RUNNING-INFERENCE-STATUS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "time_since_last_answer_post", "TIME-SINCE-LAST-ANSWER-POST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "process_inference_ipc_queue_item", "PROCESS-INFERENCE-IPC-QUEUE-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "inf_ipcq_processor_add_new_result", "INF-IPCQ-PROCESSOR-ADD-NEW-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "post_status_changed", "POST-STATUS-CHANGED", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "open_cyc_process_inference_answer", "OPEN-CYC-PROCESS-INFERENCE-ANSWER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor", "convert_unicode_strings_in_bindings_to_utf8", "CONVERT-UNICODE-STRINGS-IN-BINDINGS-TO-UTF8", 1, 0, false);
        return (SubLObject)inference_ipc_queue_processor.NIL;
    }
    
    public static SubLObject init_inference_ipc_queue_processor_file() {
        inference_ipc_queue_processor.$minimum_time_before_sending_new_answers$ = SubLFiles.defparameter("*MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*", numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time((SubLObject)inference_ipc_queue_processor.ONE_INTEGER));
        inference_ipc_queue_processor.$dtp_inference_ipc_queue_processor$ = SubLFiles.defconstant("*DTP-INFERENCE-IPC-QUEUE-PROCESSOR*", (SubLObject)inference_ipc_queue_processor.$sym6$INFERENCE_IPC_QUEUE_PROCESSOR);
        return (SubLObject)inference_ipc_queue_processor.NIL;
    }
    
    public static SubLObject setup_inference_ipc_queue_processor_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), inference_ipc_queue_processor.$dtp_inference_ipc_queue_processor$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_ipc_queue_processor.$sym13$INFERENCE_IPC_QUEUE_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)inference_ipc_queue_processor.$list14);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym15$INF_IPCQ_PROCESSOR_INFERENCE, (SubLObject)inference_ipc_queue_processor.$sym16$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym17$INF_IPCQ_PROCESSOR_IPC_QUEUE, (SubLObject)inference_ipc_queue_processor.$sym18$_CSETF_INF_IPCQ_PROCESSOR_IPC_QUEUE);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym19$INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION, (SubLObject)inference_ipc_queue_processor.$sym20$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym21$INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES, (SubLObject)inference_ipc_queue_processor.$sym22$_CSETF_INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym23$INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS, (SubLObject)inference_ipc_queue_processor.$sym24$_CSETF_INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym25$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_, (SubLObject)inference_ipc_queue_processor.$sym26$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym27$INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX, (SubLObject)inference_ipc_queue_processor.$sym28$_CSETF_INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym29$INF_IPCQ_PROCESSOR_RESULTS, (SubLObject)inference_ipc_queue_processor.$sym30$_CSETF_INF_IPCQ_PROCESSOR_RESULTS);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym31$INF_IPCQ_PROCESSOR_DONE_, (SubLObject)inference_ipc_queue_processor.$sym32$_CSETF_INF_IPCQ_PROCESSOR_DONE_);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym33$INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME, (SubLObject)inference_ipc_queue_processor.$sym34$_CSETF_INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym35$INF_IPCQ_PROCESSOR_MESSAGE_QUEUE, (SubLObject)inference_ipc_queue_processor.$sym36$_CSETF_INF_IPCQ_PROCESSOR_MESSAGE_QUEUE);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym37$INF_IPCQ_PROCESSOR_INFERENCE_PROCESS, (SubLObject)inference_ipc_queue_processor.$sym38$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_PROCESS);
        Structures.def_csetf((SubLObject)inference_ipc_queue_processor.$sym39$INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER, (SubLObject)inference_ipc_queue_processor.$sym40$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER);
        Equality.identity((SubLObject)inference_ipc_queue_processor.$sym6$INFERENCE_IPC_QUEUE_PROCESSOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_ipc_queue_processor.$dtp_inference_ipc_queue_processor$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_ipc_queue_processor.$sym59$VISIT_DEFSTRUCT_OBJECT_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)inference_ipc_queue_processor.$sym12$PRINT_INFERENCE_IPC_QUEUE_PROCESSOR);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_ipc_queue_processor.$dtp_inference_ipc_queue_processor$.getGlobalValue(), Symbols.symbol_function((SubLObject)inference_ipc_queue_processor.$sym65$SXHASH_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD));
        return (SubLObject)inference_ipc_queue_processor.NIL;
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
        me = (SubLFile)new inference_ipc_queue_processor();
        inference_ipc_queue_processor.$minimum_time_before_sending_new_answers$ = null;
        inference_ipc_queue_processor.$dtp_inference_ipc_queue_processor$ = null;
        $sym0$VALID_INFERENCE_P = SubLObjectFactory.makeSymbol("VALID-INFERENCE-P");
        $sym1$IPC_QUEUE_P = SubLObjectFactory.makeSymbol("IPC-QUEUE-P");
        $sym2$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym3$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $sym4$NON_NEGATIVE_NUMBER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-NUMBER-P");
        $sym5$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym6$INFERENCE_IPC_QUEUE_PROCESSOR = SubLObjectFactory.makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR");
        $sym7$INFERENCE_IPC_QUEUE_PROCESSOR_P = SubLObjectFactory.makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR-P");
        $list8 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("INFERENCE"), SubLObjectFactory.makeSymbol("IPC-QUEUE"), SubLObjectFactory.makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"), SubLObjectFactory.makeSymbol("NL-GENERATION-PROPERTIES"), SubLObjectFactory.makeSymbol("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), SubLObjectFactory.makeSymbol("INCREMENTAL-RESULTS?"), SubLObjectFactory.makeSymbol("NEXT-ANSWER-INDEX"), SubLObjectFactory.makeSymbol("RESULTS"), SubLObjectFactory.makeSymbol("DONE?"), SubLObjectFactory.makeSymbol("LAST-ANSWER-POST-TIME"), SubLObjectFactory.makeSymbol("MESSAGE-QUEUE"), SubLObjectFactory.makeSymbol("INFERENCE-PROCESS"), SubLObjectFactory.makeSymbol("INFERENCE-DEATH-COUNTER") });
        $list9 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("INFERENCE"), SubLObjectFactory.makeKeyword("IPC-QUEUE"), SubLObjectFactory.makeKeyword("INFERENCE-ANSWER-PROCESS-FUNCTION"), SubLObjectFactory.makeKeyword("NL-GENERATION-PROPERTIES"), SubLObjectFactory.makeKeyword("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), SubLObjectFactory.makeKeyword("INCREMENTAL-RESULTS?"), SubLObjectFactory.makeKeyword("NEXT-ANSWER-INDEX"), SubLObjectFactory.makeKeyword("RESULTS"), SubLObjectFactory.makeKeyword("DONE?"), SubLObjectFactory.makeKeyword("LAST-ANSWER-POST-TIME"), SubLObjectFactory.makeKeyword("MESSAGE-QUEUE"), SubLObjectFactory.makeKeyword("INFERENCE-PROCESS"), SubLObjectFactory.makeKeyword("INFERENCE-DEATH-COUNTER") });
        $list10 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-IPC-QUEUE"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-RESULTS"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-DONE?"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-MESSAGE-QUEUE"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-PROCESS"), SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER") });
        $list11 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-RESULTS"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-DONE?"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-PROCESS"), SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER") });
        $sym12$PRINT_INFERENCE_IPC_QUEUE_PROCESSOR = SubLObjectFactory.makeSymbol("PRINT-INFERENCE-IPC-QUEUE-PROCESSOR");
        $sym13$INFERENCE_IPC_QUEUE_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR-P"));
        $sym15$INF_IPCQ_PROCESSOR_INFERENCE = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE");
        $sym16$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE");
        $sym17$INF_IPCQ_PROCESSOR_IPC_QUEUE = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-IPC-QUEUE");
        $sym18$_CSETF_INF_IPCQ_PROCESSOR_IPC_QUEUE = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE");
        $sym19$INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION");
        $sym20$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION");
        $sym21$INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES");
        $sym22$_CSETF_INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES");
        $sym23$INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS");
        $sym24$_CSETF_INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS");
        $sym25$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_ = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?");
        $sym26$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_ = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?");
        $sym27$INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX");
        $sym28$_CSETF_INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX");
        $sym29$INF_IPCQ_PROCESSOR_RESULTS = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-RESULTS");
        $sym30$_CSETF_INF_IPCQ_PROCESSOR_RESULTS = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-RESULTS");
        $sym31$INF_IPCQ_PROCESSOR_DONE_ = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-DONE?");
        $sym32$_CSETF_INF_IPCQ_PROCESSOR_DONE_ = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-DONE?");
        $sym33$INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME");
        $sym34$_CSETF_INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME");
        $sym35$INF_IPCQ_PROCESSOR_MESSAGE_QUEUE = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-MESSAGE-QUEUE");
        $sym36$_CSETF_INF_IPCQ_PROCESSOR_MESSAGE_QUEUE = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE");
        $sym37$INF_IPCQ_PROCESSOR_INFERENCE_PROCESS = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-PROCESS");
        $sym38$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_PROCESS = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-PROCESS");
        $sym39$INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER = SubLObjectFactory.makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER");
        $sym40$_CSETF_INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER = SubLObjectFactory.makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER");
        $kw41$INFERENCE = SubLObjectFactory.makeKeyword("INFERENCE");
        $kw42$IPC_QUEUE = SubLObjectFactory.makeKeyword("IPC-QUEUE");
        $kw43$INFERENCE_ANSWER_PROCESS_FUNCTION = SubLObjectFactory.makeKeyword("INFERENCE-ANSWER-PROCESS-FUNCTION");
        $kw44$NL_GENERATION_PROPERTIES = SubLObjectFactory.makeKeyword("NL-GENERATION-PROPERTIES");
        $kw45$MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS = SubLObjectFactory.makeKeyword("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS");
        $kw46$INCREMENTAL_RESULTS_ = SubLObjectFactory.makeKeyword("INCREMENTAL-RESULTS?");
        $kw47$NEXT_ANSWER_INDEX = SubLObjectFactory.makeKeyword("NEXT-ANSWER-INDEX");
        $kw48$RESULTS = SubLObjectFactory.makeKeyword("RESULTS");
        $kw49$DONE_ = SubLObjectFactory.makeKeyword("DONE?");
        $kw50$LAST_ANSWER_POST_TIME = SubLObjectFactory.makeKeyword("LAST-ANSWER-POST-TIME");
        $kw51$MESSAGE_QUEUE = SubLObjectFactory.makeKeyword("MESSAGE-QUEUE");
        $kw52$INFERENCE_PROCESS = SubLObjectFactory.makeKeyword("INFERENCE-PROCESS");
        $kw53$INFERENCE_DEATH_COUNTER = SubLObjectFactory.makeKeyword("INFERENCE-DEATH-COUNTER");
        $str54$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw55$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym56$MAKE_INFERENCE_IPC_QUEUE_PROCESSOR = SubLObjectFactory.makeSymbol("MAKE-INFERENCE-IPC-QUEUE-PROCESSOR");
        $kw57$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw58$END = SubLObjectFactory.makeKeyword("END");
        $sym59$VISIT_DEFSTRUCT_OBJECT_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD");
        $str60$_INFERENCE_IPC_QUEUE_PROCESSOR = SubLObjectFactory.makeString("<INFERENCE-IPC-QUEUE-PROCESSOR");
        $str61$_DONE = SubLObjectFactory.makeString(" DONE");
        $str62$__S = SubLObjectFactory.makeString(" ~S");
        $str63$_ = SubLObjectFactory.makeString(">");
        $str64$inference_done = SubLObjectFactory.makeString("inference-done");
        $sym65$SXHASH_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD = SubLObjectFactory.makeSymbol("SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD");
        $kw66$INFERENCE_ANSWER = SubLObjectFactory.makeKeyword("INFERENCE-ANSWER");
        $kw67$DEAD = SubLObjectFactory.makeKeyword("DEAD");
        $kw68$NEW_ANSWER = SubLObjectFactory.makeKeyword("NEW-ANSWER");
        $kw69$STATUS_CHANGE = SubLObjectFactory.makeKeyword("STATUS-CHANGE");
        $kw70$INFERENCE_STATUS = SubLObjectFactory.makeKeyword("INFERENCE-STATUS");
        $str71$New_Inference_Status___A__Inferen = SubLObjectFactory.makeString("New Inference Status: ~A~%Inference Suspend Status: ~A~%");
        $sym72$QL_PROCESS_INFERENCE_ANSWER = SubLObjectFactory.makeSymbol("QL-PROCESS-INFERENCE-ANSWER");
        $kw73$BINDINGS = SubLObjectFactory.makeKeyword("BINDINGS");
        $list74 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("N"), (SubLObject)SubLObjectFactory.makeSymbol("UTF8"));
    }
    
    public static final class $inference_ipc_queue_processor_native extends SubLStructNative
    {
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
        private static final SubLStructDeclNative structDecl;
        
        public $inference_ipc_queue_processor_native() {
            this.$inference = (SubLObject)CommonSymbols.NIL;
            this.$ipc_queue = (SubLObject)CommonSymbols.NIL;
            this.$inference_answer_process_function = (SubLObject)CommonSymbols.NIL;
            this.$nl_generation_properties = (SubLObject)CommonSymbols.NIL;
            this.$minimum_time_before_sending_new_answers = (SubLObject)CommonSymbols.NIL;
            this.$incremental_resultsP = (SubLObject)CommonSymbols.NIL;
            this.$next_answer_index = (SubLObject)CommonSymbols.NIL;
            this.$results = (SubLObject)CommonSymbols.NIL;
            this.$doneP = (SubLObject)CommonSymbols.NIL;
            this.$last_answer_post_time = (SubLObject)CommonSymbols.NIL;
            this.$message_queue = (SubLObject)CommonSymbols.NIL;
            this.$inference_process = (SubLObject)CommonSymbols.NIL;
            this.$inference_death_counter = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$inference_ipc_queue_processor_native.structDecl;
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
		public SubLObject setField2(final SubLObject value) {
            return this.$inference = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$ipc_queue = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$inference_answer_process_function = value;
        }
        
        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$nl_generation_properties = value;
        }
        
        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$minimum_time_before_sending_new_answers = value;
        }
        
        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$incremental_resultsP = value;
        }
        
        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$next_answer_index = value;
        }
        
        @Override
		public SubLObject setField9(final SubLObject value) {
            return this.$results = value;
        }
        
        @Override
		public SubLObject setField10(final SubLObject value) {
            return this.$doneP = value;
        }
        
        @Override
		public SubLObject setField11(final SubLObject value) {
            return this.$last_answer_post_time = value;
        }
        
        @Override
		public SubLObject setField12(final SubLObject value) {
            return this.$message_queue = value;
        }
        
        @Override
		public SubLObject setField13(final SubLObject value) {
            return this.$inference_process = value;
        }
        
        @Override
		public SubLObject setField14(final SubLObject value) {
            return this.$inference_death_counter = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$inference_ipc_queue_processor_native.class, inference_ipc_queue_processor.$sym6$INFERENCE_IPC_QUEUE_PROCESSOR, inference_ipc_queue_processor.$sym7$INFERENCE_IPC_QUEUE_PROCESSOR_P, inference_ipc_queue_processor.$list8, inference_ipc_queue_processor.$list9, new String[] { "$inference", "$ipc_queue", "$inference_answer_process_function", "$nl_generation_properties", "$minimum_time_before_sending_new_answers", "$incremental_resultsP", "$next_answer_index", "$results", "$doneP", "$last_answer_post_time", "$message_queue", "$inference_process", "$inference_death_counter" }, inference_ipc_queue_processor.$list10, inference_ipc_queue_processor.$list11, inference_ipc_queue_processor.$sym12$PRINT_INFERENCE_IPC_QUEUE_PROCESSOR);
        }
    }
    
    public static final class $inference_ipc_queue_processor_p$UnaryFunction extends UnaryFunction
    {
        public $inference_ipc_queue_processor_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("INFERENCE-IPC-QUEUE-PROCESSOR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_ipc_queue_processor.inference_ipc_queue_processor_p(arg1);
        }
    }
}

/*

	Total time: 333 ms
	 synthetic 
*/