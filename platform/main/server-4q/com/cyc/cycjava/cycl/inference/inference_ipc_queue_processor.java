/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference;


import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.numeric_date_utilities.*;
import static com.cyc.cycjava.cycl.pph_macros.*;
import static com.cyc.cycjava.cycl.pph_proof.*;
import static com.cyc.cycjava.cycl.pph_vars.*;
import static com.cyc.cycjava.cycl.query_library_api.*;
import static com.cyc.cycjava.cycl.queues.*;
import static com.cyc.cycjava.cycl.task_processor.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
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
 * module:      INFERENCE-IPC-QUEUE-PROCESSOR
 * source file: /cyc/top/cycl/inference/inference-ipc-queue-processor.lisp
 * created:     2019/07/03 17:37:56
 */
public final class inference_ipc_queue_processor extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_ipc_queue_processor();

 public static final String myName = "com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor";


    // defparameter
    // Definitions
    // the minimum time to wait before sending clients new inference answers.
    /**
     * the minimum time to wait before sending clients new inference answers.
     */
    @LispMethod(comment = "the minimum time to wait before sending clients new inference answers.\ndefparameter")
    private static final SubLSymbol $minimum_time_before_sending_new_answers$ = makeSymbol("*MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_inference_ipc_queue_processor$ = makeSymbol("*DTP-INFERENCE-IPC-QUEUE-PROCESSOR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol VALID_INFERENCE_P = makeSymbol("VALID-INFERENCE-P");

    private static final SubLSymbol IPC_QUEUE_P = makeSymbol("IPC-QUEUE-P");

    private static final SubLSymbol INFERENCE_IPC_QUEUE_PROCESSOR = makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR");

    private static final SubLSymbol INFERENCE_IPC_QUEUE_PROCESSOR_P = makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR-P");

    static private final SubLList $list8 = list(new SubLObject[]{ makeSymbol("INFERENCE"), makeSymbol("IPC-QUEUE"), makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"), makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeSymbol("INCREMENTAL-RESULTS?"), makeSymbol("NEXT-ANSWER-INDEX"), makeSymbol("RESULTS"), makeSymbol("DONE?"), makeSymbol("LAST-ANSWER-POST-TIME"), makeSymbol("MESSAGE-QUEUE"), makeSymbol("INFERENCE-PROCESS"), makeSymbol("INFERENCE-DEATH-COUNTER") });

    static private final SubLList $list9 = list(new SubLObject[]{ makeKeyword("INFERENCE"), makeKeyword("IPC-QUEUE"), makeKeyword("INFERENCE-ANSWER-PROCESS-FUNCTION"), makeKeyword("NL-GENERATION-PROPERTIES"), makeKeyword("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeKeyword("INCREMENTAL-RESULTS?"), makeKeyword("NEXT-ANSWER-INDEX"), makeKeyword("RESULTS"), makeKeyword("DONE?"), makeKeyword("LAST-ANSWER-POST-TIME"), makeKeyword("MESSAGE-QUEUE"), makeKeyword("INFERENCE-PROCESS"), makeKeyword("INFERENCE-DEATH-COUNTER") });

    static private final SubLList $list10 = list(new SubLObject[]{ makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE"), makeSymbol("INF-IPCQ-PROCESSOR-IPC-QUEUE"), makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION"), makeSymbol("INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES"), makeSymbol("INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeSymbol("INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?"), makeSymbol("INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX"), makeSymbol("INF-IPCQ-PROCESSOR-RESULTS"), makeSymbol("INF-IPCQ-PROCESSOR-DONE?"), makeSymbol("INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME"), makeSymbol("INF-IPCQ-PROCESSOR-MESSAGE-QUEUE"), makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-PROCESS"), makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER") });

    static private final SubLList $list11 = list(new SubLObject[]{ makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-RESULTS"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-DONE?"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-PROCESS"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER") });

    private static final SubLSymbol PRINT_INFERENCE_IPC_QUEUE_PROCESSOR = makeSymbol("PRINT-INFERENCE-IPC-QUEUE-PROCESSOR");

    private static final SubLSymbol INFERENCE_IPC_QUEUE_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list14 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("INFERENCE-IPC-QUEUE-PROCESSOR-P"));

    private static final SubLSymbol INF_IPCQ_PROCESSOR_INFERENCE = makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE");

    private static final SubLSymbol _CSETF_INF_IPCQ_PROCESSOR_INFERENCE = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE");

    private static final SubLSymbol INF_IPCQ_PROCESSOR_IPC_QUEUE = makeSymbol("INF-IPCQ-PROCESSOR-IPC-QUEUE");

    private static final SubLSymbol _CSETF_INF_IPCQ_PROCESSOR_IPC_QUEUE = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE");

    private static final SubLSymbol INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION = makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION");

    private static final SubLSymbol _CSETF_INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION");

    private static final SubLSymbol INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES = makeSymbol("INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES");

    private static final SubLSymbol _CSETF_INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES");

    private static final SubLSymbol INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS = makeSymbol("INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS");

    private static final SubLSymbol _CSETF_INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS");

    private static final SubLSymbol $sym25$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_ = makeSymbol("INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?");

    private static final SubLSymbol $sym26$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_ = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?");

    private static final SubLSymbol INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX = makeSymbol("INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX");

    private static final SubLSymbol _CSETF_INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX");

    private static final SubLSymbol INF_IPCQ_PROCESSOR_RESULTS = makeSymbol("INF-IPCQ-PROCESSOR-RESULTS");

    private static final SubLSymbol _CSETF_INF_IPCQ_PROCESSOR_RESULTS = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-RESULTS");

    private static final SubLSymbol $sym31$INF_IPCQ_PROCESSOR_DONE_ = makeSymbol("INF-IPCQ-PROCESSOR-DONE?");

    private static final SubLSymbol $sym32$_CSETF_INF_IPCQ_PROCESSOR_DONE_ = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-DONE?");

    private static final SubLSymbol INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME = makeSymbol("INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME");

    private static final SubLSymbol _CSETF_INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME");

    private static final SubLSymbol INF_IPCQ_PROCESSOR_MESSAGE_QUEUE = makeSymbol("INF-IPCQ-PROCESSOR-MESSAGE-QUEUE");

    private static final SubLSymbol _CSETF_INF_IPCQ_PROCESSOR_MESSAGE_QUEUE = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE");

    private static final SubLSymbol INF_IPCQ_PROCESSOR_INFERENCE_PROCESS = makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-PROCESS");

    private static final SubLSymbol _CSETF_INF_IPCQ_PROCESSOR_INFERENCE_PROCESS = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-PROCESS");

    private static final SubLSymbol INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER = makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER");

    private static final SubLSymbol _CSETF_INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER");

    private static final SubLSymbol $INFERENCE_ANSWER_PROCESS_FUNCTION = makeKeyword("INFERENCE-ANSWER-PROCESS-FUNCTION");

    private static final SubLSymbol $NL_GENERATION_PROPERTIES = makeKeyword("NL-GENERATION-PROPERTIES");

    private static final SubLSymbol $MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS = makeKeyword("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS");

    private static final SubLSymbol $kw46$INCREMENTAL_RESULTS_ = makeKeyword("INCREMENTAL-RESULTS?");

    private static final SubLSymbol $NEXT_ANSWER_INDEX = makeKeyword("NEXT-ANSWER-INDEX");

    private static final SubLSymbol $LAST_ANSWER_POST_TIME = makeKeyword("LAST-ANSWER-POST-TIME");

    private static final SubLSymbol $INFERENCE_DEATH_COUNTER = makeKeyword("INFERENCE-DEATH-COUNTER");

    private static final SubLString $str54$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_INFERENCE_IPC_QUEUE_PROCESSOR = makeSymbol("MAKE-INFERENCE-IPC-QUEUE-PROCESSOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD");

    private static final SubLString $str60$_INFERENCE_IPC_QUEUE_PROCESSOR = makeString("<INFERENCE-IPC-QUEUE-PROCESSOR");

    private static final SubLString $$$_DONE = makeString(" DONE");

    private static final SubLString $str62$__S = makeString(" ~S");

    private static final SubLString $str63$_ = makeString(">");

    private static final SubLString $str64$inference_done = makeString("inference-done");

    private static final SubLSymbol SXHASH_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD = makeSymbol("SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD");

    private static final SubLString $str71$New_Inference_Status___A__Inferen = makeString("New Inference Status: ~A~%Inference Suspend Status: ~A~%");

    private static final SubLSymbol QL_PROCESS_INFERENCE_ANSWER = makeSymbol("QL-PROCESS-INFERENCE-ANSWER");

    private static final SubLList $list74 = cons(makeSymbol("N"), makeSymbol("UTF8"));

    /**
     * Create and return an object to process inference events for INFERENCE posted on IPC-QUEUE.
     * Answers with IDs greater than or equal to START-INDEX will be passed to INFERENCE-ANSWER-PROCESS-FUNCTION
     * with NL-GENERATION-PROPERTIES.
     * If INCREMENTAL-RESULTS? is NIL, results will be stored internally. Otherwise, they will be posted via
     * POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS.
     */
    @LispMethod(comment = "Create and return an object to process inference events for INFERENCE posted on IPC-QUEUE.\r\nAnswers with IDs greater than or equal to START-INDEX will be passed to INFERENCE-ANSWER-PROCESS-FUNCTION\r\nwith NL-GENERATION-PROPERTIES.\r\nIf INCREMENTAL-RESULTS? is NIL, results will be stored internally. Otherwise, they will be posted via\r\nPOST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS.\nCreate and return an object to process inference events for INFERENCE posted on IPC-QUEUE.\nAnswers with IDs greater than or equal to START-INDEX will be passed to INFERENCE-ANSWER-PROCESS-FUNCTION\nwith NL-GENERATION-PROPERTIES.\nIf INCREMENTAL-RESULTS? is NIL, results will be stored internally. Otherwise, they will be posted via\nPOST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS.")
    public static final SubLObject new_inference_ipc_queue_processor(SubLObject inference, SubLObject ipc_queue, SubLObject inference_answer_process_function, SubLObject nl_generation_properties, SubLObject minimum_time_before_sending_new_answers, SubLObject incremental_resultsP, SubLObject start_index) {
        if (minimum_time_before_sending_new_answers == UNPROVIDED) {
            minimum_time_before_sending_new_answers = $minimum_time_before_sending_new_answers$.getDynamicValue();
        }
        if (incremental_resultsP == UNPROVIDED) {
            incremental_resultsP = T;
        }
        if (start_index == UNPROVIDED) {
            start_index = ZERO_INTEGER;
        }
        SubLTrampolineFile.checkType(inference, VALID_INFERENCE_P);
        SubLTrampolineFile.checkType(ipc_queue, IPC_QUEUE_P);
        if (NIL != inference_answer_process_function) {
            SubLTrampolineFile.checkType(inference_answer_process_function, FUNCTION_SPEC_P);
        }
        SubLTrampolineFile.checkType(nl_generation_properties, PROPERTY_LIST_P);
        SubLTrampolineFile.checkType(minimum_time_before_sending_new_answers, NON_NEGATIVE_NUMBER_P);
        SubLTrampolineFile.checkType(start_index, NON_NEGATIVE_INTEGER_P);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.new_inference_ipc_queue_processor_internal(inference, ipc_queue, inference_answer_process_function, nl_generation_properties, minimum_time_before_sending_new_answers, incremental_resultsP, start_index);
    }

    public static SubLObject new_inference_ipc_queue_processor(final SubLObject inference, final SubLObject ipc_queue, final SubLObject inference_answer_process_function, final SubLObject nl_generation_properties, SubLObject minimum_time_before_sending_new_answers, SubLObject incremental_resultsP, SubLObject start_index, SubLObject inference_process) {
        if (minimum_time_before_sending_new_answers == UNPROVIDED) {
            minimum_time_before_sending_new_answers = inference_ipc_queue_processor.$minimum_time_before_sending_new_answers$.getDynamicValue();
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
        assert NIL != inference_datastructures_inference.valid_inference_p(inference) : "! inference_datastructures_inference.valid_inference_p(inference) " + ("inference_datastructures_inference.valid_inference_p(inference) " + "CommonSymbols.NIL != inference_datastructures_inference.valid_inference_p(inference) ") + inference;
        assert NIL != process_utilities.ipc_queue_p(ipc_queue) : "! process_utilities.ipc_queue_p(ipc_queue) " + ("process_utilities.ipc_queue_p(ipc_queue) " + "CommonSymbols.NIL != process_utilities.ipc_queue_p(ipc_queue) ") + ipc_queue;
        if (((NIL != inference_answer_process_function) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == function_spec_p(inference_answer_process_function))) {
            throw new AssertionError(inference_answer_process_function);
        }
        assert NIL != list_utilities.property_list_p(nl_generation_properties) : "! list_utilities.property_list_p(nl_generation_properties) " + ("list_utilities.property_list_p(nl_generation_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(nl_generation_properties) ") + nl_generation_properties;
        assert NIL != number_utilities.non_negative_number_p(minimum_time_before_sending_new_answers) : "! number_utilities.non_negative_number_p(minimum_time_before_sending_new_answers) " + ("number_utilities.non_negative_number_p(minimum_time_before_sending_new_answers) " + "CommonSymbols.NIL != number_utilities.non_negative_number_p(minimum_time_before_sending_new_answers) ") + minimum_time_before_sending_new_answers;
        assert NIL != subl_promotions.non_negative_integer_p(start_index) : "! subl_promotions.non_negative_integer_p(start_index) " + ("subl_promotions.non_negative_integer_p(start_index) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(start_index) ") + start_index;
        return inference_ipc_queue_processor.new_inference_ipc_queue_processor_internal(inference, ipc_queue, inference_answer_process_function, nl_generation_properties, minimum_time_before_sending_new_answers, incremental_resultsP, start_index, inference_process);
    }

    /**
     * Perform one processing iteration.
     *
     * @return LISTP of results accumulated so far by IPCQ-PROCESSOR
    (NIL if incremental results are posted rather than accumulated).
     */
    @LispMethod(comment = "Perform one processing iteration.\r\n\r\n@return LISTP of results accumulated so far by IPCQ-PROCESSOR\r\n(NIL if incremental results are posted rather than accumulated).")
    public static final SubLObject inference_ipc_queue_processor_do_one_iteration_alt(SubLObject ipcq_processor) {
        com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_do_one_iteration(ipcq_processor);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_results(ipcq_processor);
    }

    /**
     * Perform one processing iteration.
     *
     * @return LISTP of results accumulated so far by IPCQ-PROCESSOR
    (NIL if incremental results are posted rather than accumulated).
     */
    @LispMethod(comment = "Perform one processing iteration.\r\n\r\n@return LISTP of results accumulated so far by IPCQ-PROCESSOR\r\n(NIL if incremental results are posted rather than accumulated).")
    public static SubLObject inference_ipc_queue_processor_do_one_iteration(final SubLObject ipcq_processor) {
        inference_ipc_queue_processor.inf_ipcq_processor_do_one_iteration(ipcq_processor);
        return inference_ipc_queue_processor.inference_ipc_queue_processor_results(ipcq_processor);
    }

    /**
     *
     *
     * @return LISTP of results accumulated so far by IPCQ-PROCESSOR.
     */
    @LispMethod(comment = "@return LISTP of results accumulated so far by IPCQ-PROCESSOR.")
    public static final SubLObject get_inference_ipc_queue_processor_results_alt(SubLObject ipcq_processor) {
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_results(ipcq_processor);
    }

    /**
     *
     *
     * @return LISTP of results accumulated so far by IPCQ-PROCESSOR.
     */
    @LispMethod(comment = "@return LISTP of results accumulated so far by IPCQ-PROCESSOR.")
    public static SubLObject get_inference_ipc_queue_processor_results(final SubLObject ipcq_processor) {
        return inference_ipc_queue_processor.inference_ipc_queue_processor_results(ipcq_processor);
    }

    public static final SubLObject inference_ipc_queue_processor_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.print_inference_ipc_queue_processor(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject inference_ipc_queue_processor_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        inference_ipc_queue_processor.print_inference_ipc_queue_processor(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject inference_ipc_queue_processor_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.$inference_ipc_queue_processor_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject inference_ipc_queue_processor_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.$inference_ipc_queue_processor_native.class ? T : NIL;
    }

    public static final SubLObject inf_ipcq_processor_inference_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$inference;
    }

    public static SubLObject inf_ipcq_processor_inference(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject inf_ipcq_processor_ipc_queue_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$ipc_queue;
    }

    public static SubLObject inf_ipcq_processor_ipc_queue(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject inf_ipcq_processor_inference_answer_process_function_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$inference_answer_process_function;
    }

    public static SubLObject inf_ipcq_processor_inference_answer_process_function(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject inf_ipcq_processor_nl_generation_properties_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$nl_generation_properties;
    }

    public static SubLObject inf_ipcq_processor_nl_generation_properties(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject inf_ipcq_processor_minimum_time_before_sending_new_answers_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$minimum_time_before_sending_new_answers;
    }

    public static SubLObject inf_ipcq_processor_minimum_time_before_sending_new_answers(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject inf_ipcq_processor_incremental_resultsP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$incremental_resultsP;
    }

    public static SubLObject inf_ipcq_processor_incremental_resultsP(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject inf_ipcq_processor_next_answer_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$next_answer_index;
    }

    public static SubLObject inf_ipcq_processor_next_answer_index(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject inf_ipcq_processor_results_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$results;
    }

    public static SubLObject inf_ipcq_processor_results(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject inf_ipcq_processor_doneP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$doneP;
    }

    public static SubLObject inf_ipcq_processor_doneP(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject inf_ipcq_processor_last_answer_post_time_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$last_answer_post_time;
    }

    public static SubLObject inf_ipcq_processor_last_answer_post_time(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject inf_ipcq_processor_message_queue_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$message_queue;
    }

    public static SubLObject inf_ipcq_processor_message_queue(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField12();
    }

    public static SubLObject inf_ipcq_processor_inference_process(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField13();
    }

    public static SubLObject inf_ipcq_processor_inference_death_counter(final SubLObject v_object) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.getField14();
    }

    public static final SubLObject _csetf_inf_ipcq_processor_inference_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$inference = (value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_inference(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_inf_ipcq_processor_ipc_queue_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$ipc_queue = (value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_ipc_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_inf_ipcq_processor_inference_answer_process_function_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$inference_answer_process_function = (value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_inference_answer_process_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_inf_ipcq_processor_nl_generation_properties_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$nl_generation_properties = (value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_nl_generation_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$minimum_time_before_sending_new_answers = (value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_inf_ipcq_processor_incremental_resultsP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$incremental_resultsP = (value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_incremental_resultsP(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_inf_ipcq_processor_next_answer_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$next_answer_index = (value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_next_answer_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_inf_ipcq_processor_results_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$results = (value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_results(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_inf_ipcq_processor_doneP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$doneP = (value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_doneP(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_inf_ipcq_processor_last_answer_post_time_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$last_answer_post_time = (value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_last_answer_post_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_inf_ipcq_processor_message_queue_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return (($inference_ipc_queue_processor_native)v_object).$message_queue = (value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_message_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_inference_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_inf_ipcq_processor_inference_death_counter(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(v_object) " + "inference_ipc_queue_processor.inference_ipc_queue_processor_p error :" + v_object;
        return v_object.setField14(value);
    }

    public static final SubLObject make_inference_ipc_queue_processor_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.$inference_ipc_queue_processor_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($INFERENCE)) {
                        com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference(v_new, current_value);
                    } else {
                        if (pcase_var.eql($IPC_QUEUE)) {
                            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_ipc_queue(v_new, current_value);
                        } else {
                            if (pcase_var.eql($INFERENCE_ANSWER_PROCESS_FUNCTION)) {
                                com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference_answer_process_function(v_new, current_value);
                            } else {
                                if (pcase_var.eql($NL_GENERATION_PROPERTIES)) {
                                    com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_nl_generation_properties(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS)) {
                                        com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($kw41$INCREMENTAL_RESULTS_)) {
                                            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_incremental_resultsP(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($NEXT_ANSWER_INDEX)) {
                                                com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_next_answer_index(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($RESULTS)) {
                                                    com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_results(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($DONE_)) {
                                                        com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_doneP(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($LAST_ANSWER_POST_TIME)) {
                                                            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_last_answer_post_time(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($MESSAGE_QUEUE)) {
                                                                com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_message_queue(v_new, current_value);
                                                            } else {
                                                                Errors.error($str_alt47$Invalid_slot__S_for_construction_, current_arg);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_inference_ipc_queue_processor(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.$inference_ipc_queue_processor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INFERENCE)) {
                inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference(v_new, current_value);
            } else
                if (pcase_var.eql($IPC_QUEUE)) {
                    inference_ipc_queue_processor._csetf_inf_ipcq_processor_ipc_queue(v_new, current_value);
                } else
                    if (pcase_var.eql(inference_ipc_queue_processor.$INFERENCE_ANSWER_PROCESS_FUNCTION)) {
                        inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference_answer_process_function(v_new, current_value);
                    } else
                        if (pcase_var.eql(inference_ipc_queue_processor.$NL_GENERATION_PROPERTIES)) {
                            inference_ipc_queue_processor._csetf_inf_ipcq_processor_nl_generation_properties(v_new, current_value);
                        } else
                            if (pcase_var.eql(inference_ipc_queue_processor.$MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS)) {
                                inference_ipc_queue_processor._csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers(v_new, current_value);
                            } else
                                if (pcase_var.eql(inference_ipc_queue_processor.$kw46$INCREMENTAL_RESULTS_)) {
                                    inference_ipc_queue_processor._csetf_inf_ipcq_processor_incremental_resultsP(v_new, current_value);
                                } else
                                    if (pcase_var.eql(inference_ipc_queue_processor.$NEXT_ANSWER_INDEX)) {
                                        inference_ipc_queue_processor._csetf_inf_ipcq_processor_next_answer_index(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($RESULTS)) {
                                            inference_ipc_queue_processor._csetf_inf_ipcq_processor_results(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($DONE_)) {
                                                inference_ipc_queue_processor._csetf_inf_ipcq_processor_doneP(v_new, current_value);
                                            } else
                                                if (pcase_var.eql(inference_ipc_queue_processor.$LAST_ANSWER_POST_TIME)) {
                                                    inference_ipc_queue_processor._csetf_inf_ipcq_processor_last_answer_post_time(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($MESSAGE_QUEUE)) {
                                                        inference_ipc_queue_processor._csetf_inf_ipcq_processor_message_queue(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($INFERENCE_PROCESS)) {
                                                            inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference_process(v_new, current_value);
                                                        } else
                                                            if (pcase_var.eql(inference_ipc_queue_processor.$INFERENCE_DEATH_COUNTER)) {
                                                                inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference_death_counter(v_new, current_value);
                                                            } else {
                                                                Errors.error(inference_ipc_queue_processor.$str54$Invalid_slot__S_for_construction_, current_arg);
                                                            }












        }
        return v_new;
    }

    public static SubLObject visit_defstruct_inference_ipc_queue_processor(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, inference_ipc_queue_processor.MAKE_INFERENCE_IPC_QUEUE_PROCESSOR, THIRTEEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INFERENCE, inference_ipc_queue_processor.inf_ipcq_processor_inference(obj));
        funcall(visitor_fn, obj, $SLOT, $IPC_QUEUE, inference_ipc_queue_processor.inf_ipcq_processor_ipc_queue(obj));
        funcall(visitor_fn, obj, $SLOT, inference_ipc_queue_processor.$INFERENCE_ANSWER_PROCESS_FUNCTION, inference_ipc_queue_processor.inf_ipcq_processor_inference_answer_process_function(obj));
        funcall(visitor_fn, obj, $SLOT, inference_ipc_queue_processor.$NL_GENERATION_PROPERTIES, inference_ipc_queue_processor.inf_ipcq_processor_nl_generation_properties(obj));
        funcall(visitor_fn, obj, $SLOT, inference_ipc_queue_processor.$MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS, inference_ipc_queue_processor.inf_ipcq_processor_minimum_time_before_sending_new_answers(obj));
        funcall(visitor_fn, obj, $SLOT, inference_ipc_queue_processor.$kw46$INCREMENTAL_RESULTS_, inference_ipc_queue_processor.inf_ipcq_processor_incremental_resultsP(obj));
        funcall(visitor_fn, obj, $SLOT, inference_ipc_queue_processor.$NEXT_ANSWER_INDEX, inference_ipc_queue_processor.inf_ipcq_processor_next_answer_index(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULTS, inference_ipc_queue_processor.inf_ipcq_processor_results(obj));
        funcall(visitor_fn, obj, $SLOT, $DONE_, inference_ipc_queue_processor.inf_ipcq_processor_doneP(obj));
        funcall(visitor_fn, obj, $SLOT, inference_ipc_queue_processor.$LAST_ANSWER_POST_TIME, inference_ipc_queue_processor.inf_ipcq_processor_last_answer_post_time(obj));
        funcall(visitor_fn, obj, $SLOT, $MESSAGE_QUEUE, inference_ipc_queue_processor.inf_ipcq_processor_message_queue(obj));
        funcall(visitor_fn, obj, $SLOT, $INFERENCE_PROCESS, inference_ipc_queue_processor.inf_ipcq_processor_inference_process(obj));
        funcall(visitor_fn, obj, $SLOT, inference_ipc_queue_processor.$INFERENCE_DEATH_COUNTER, inference_ipc_queue_processor.inf_ipcq_processor_inference_death_counter(obj));
        funcall(visitor_fn, obj, $END, inference_ipc_queue_processor.MAKE_INFERENCE_IPC_QUEUE_PROCESSOR, THIRTEEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_inference_ipc_queue_processor_method(final SubLObject obj, final SubLObject visitor_fn) {
        return inference_ipc_queue_processor.visit_defstruct_inference_ipc_queue_processor(obj, visitor_fn);
    }

    public static final SubLObject print_inference_ipc_queue_processor_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        princ($str_alt48$_INFERENCE_IPC_QUEUE_PROCESSOR, stream);
        if (NIL != com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_doneP(v_object)) {
            princ($str_alt49$_DONE, stream);
        } else {
            format(stream, $str_alt50$__S, com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_ipc_queue(v_object));
        }
        princ($str_alt51$_, stream);
        return v_object;
    }

    public static SubLObject print_inference_ipc_queue_processor(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        princ(inference_ipc_queue_processor.$str60$_INFERENCE_IPC_QUEUE_PROCESSOR, stream);
        if (NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_doneP(v_object)) {
            princ(inference_ipc_queue_processor.$$$_DONE, stream);
        } else {
            format(stream, inference_ipc_queue_processor.$str62$__S, inference_ipc_queue_processor.inference_ipc_queue_processor_ipc_queue(v_object));
        }
        princ(inference_ipc_queue_processor.$str63$_, stream);
        return v_object;
    }

    public static final SubLObject new_inference_ipc_queue_processor_internal(SubLObject inference, SubLObject ipc_queue, SubLObject inference_answer_process_function, SubLObject nl_generation_properties, SubLObject minimum_time_before_sending_new_answers, SubLObject incremental_resultsP, SubLObject start_index) {
        {
            SubLObject ipcq_processor = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.make_inference_ipc_queue_processor(UNPROVIDED);
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference(ipcq_processor, inference);
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_ipc_queue(ipcq_processor, ipc_queue);
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference_answer_process_function(ipcq_processor, inference_answer_process_function);
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_nl_generation_properties(ipcq_processor, nl_generation_properties);
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers(ipcq_processor, minimum_time_before_sending_new_answers);
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_incremental_resultsP(ipcq_processor, incremental_resultsP);
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_next_answer_index(ipcq_processor, start_index);
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_results(ipcq_processor, NIL);
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_doneP(ipcq_processor, NIL);
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_last_answer_post_time(ipcq_processor, subtract(get_internal_real_time(), minimum_time_before_sending_new_answers));
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_message_queue(ipcq_processor, queues.create_queue());
            return ipcq_processor;
        }
    }

    public static SubLObject new_inference_ipc_queue_processor_internal(final SubLObject inference, final SubLObject ipc_queue, final SubLObject inference_answer_process_function, final SubLObject nl_generation_properties, final SubLObject minimum_time_before_sending_new_answers, final SubLObject incremental_resultsP, final SubLObject start_index, final SubLObject inference_process) {
        final SubLObject ipcq_processor = inference_ipc_queue_processor.make_inference_ipc_queue_processor(UNPROVIDED);
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference(ipcq_processor, inference);
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_ipc_queue(ipcq_processor, ipc_queue);
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference_answer_process_function(ipcq_processor, inference_answer_process_function);
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_nl_generation_properties(ipcq_processor, nl_generation_properties);
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers(ipcq_processor, minimum_time_before_sending_new_answers);
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_incremental_resultsP(ipcq_processor, incremental_resultsP);
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_next_answer_index(ipcq_processor, start_index);
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_results(ipcq_processor, NIL);
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_doneP(ipcq_processor, Semaphores.new_semaphore(inference_ipc_queue_processor.$str64$inference_done, ZERO_INTEGER));
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_last_answer_post_time(ipcq_processor, subtract(get_internal_real_time(), minimum_time_before_sending_new_answers));
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_message_queue(ipcq_processor, create_queue(UNPROVIDED));
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference_process(ipcq_processor, inference_process);
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference_death_counter(ipcq_processor, NIL);
        return ipcq_processor;
    }

    public static final SubLObject inference_ipc_queue_processor_inference_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_inference(ipcq_processor);
    }

    public static SubLObject inference_ipc_queue_processor_inference(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return inference_ipc_queue_processor.inf_ipcq_processor_inference(ipcq_processor);
    }

    public static final SubLObject inference_ipc_queue_processor_ipc_queue_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_ipc_queue(ipcq_processor);
    }

    public static SubLObject inference_ipc_queue_processor_ipc_queue(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return inference_ipc_queue_processor.inf_ipcq_processor_ipc_queue(ipcq_processor);
    }

    public static final SubLObject inference_ipc_queue_processor_inference_answer_process_function_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_inference_answer_process_function(ipcq_processor);
    }

    public static SubLObject inference_ipc_queue_processor_inference_answer_process_function(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return inference_ipc_queue_processor.inf_ipcq_processor_inference_answer_process_function(ipcq_processor);
    }

    public static final SubLObject inference_ipc_queue_processor_nl_generation_properties_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_nl_generation_properties(ipcq_processor);
    }

    public static SubLObject inference_ipc_queue_processor_nl_generation_properties(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return inference_ipc_queue_processor.inf_ipcq_processor_nl_generation_properties(ipcq_processor);
    }

    public static final SubLObject inference_ipc_queue_processor_minimum_time_before_sending_new_answers_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_minimum_time_before_sending_new_answers(ipcq_processor);
    }

    public static SubLObject inference_ipc_queue_processor_minimum_time_before_sending_new_answers(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return inference_ipc_queue_processor.inf_ipcq_processor_minimum_time_before_sending_new_answers(ipcq_processor);
    }

    public static final SubLObject inference_ipc_queue_processor_incremental_resultsP_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_incremental_resultsP(ipcq_processor);
    }

    public static SubLObject inference_ipc_queue_processor_incremental_resultsP(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return inference_ipc_queue_processor.inf_ipcq_processor_incremental_resultsP(ipcq_processor);
    }

    public static final SubLObject inference_ipc_queue_processor_next_answer_index_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_next_answer_index(ipcq_processor);
    }

    public static SubLObject inference_ipc_queue_processor_next_answer_index(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return inference_ipc_queue_processor.inf_ipcq_processor_next_answer_index(ipcq_processor);
    }

    public static final SubLObject inference_ipc_queue_processor_increment_next_answer_index_alt(SubLObject ipcq_processor) {
        com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_next_answer_index(ipcq_processor, add(com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_next_answer_index(ipcq_processor), ONE_INTEGER));
        return NIL;
    }

    public static SubLObject inference_ipc_queue_processor_increment_next_answer_index(final SubLObject ipcq_processor) {
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_next_answer_index(ipcq_processor, add(inference_ipc_queue_processor.inf_ipcq_processor_next_answer_index(ipcq_processor), ONE_INTEGER));
        return NIL;
    }

    public static final SubLObject inference_ipc_queue_processor_results_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_results(ipcq_processor);
    }

    public static SubLObject inference_ipc_queue_processor_results(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return inference_ipc_queue_processor.inf_ipcq_processor_results(ipcq_processor);
    }

    public static final SubLObject inference_ipc_queue_processor_doneP_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_doneP(ipcq_processor);
    }

    public static SubLObject inference_ipc_queue_processor_doneP(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return numGE(Semaphores.semaphore_current_count(inference_ipc_queue_processor.inf_ipcq_processor_doneP(ipcq_processor)), ONE_INTEGER);
    }

    public static final SubLObject note_ipcq_processor_done_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_doneP(ipcq_processor, T);
        return T;
    }

    public static SubLObject note_ipcq_processor_done(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        Semaphores.semaphore_signal(inference_ipc_queue_processor.inf_ipcq_processor_doneP(ipcq_processor));
        return T;
    }

    public static final SubLObject inference_ipc_queue_processor_last_answer_post_time_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_last_answer_post_time(ipcq_processor);
    }

    public static SubLObject inference_ipc_queue_processor_last_answer_post_time(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return inference_ipc_queue_processor.inf_ipcq_processor_last_answer_post_time(ipcq_processor);
    }

    public static final SubLObject inference_ipc_queue_processor_update_last_answer_post_time_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_last_answer_post_time(ipcq_processor, get_internal_real_time());
        return NIL;
    }

    public static SubLObject inference_ipc_queue_processor_update_last_answer_post_time(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_last_answer_post_time(ipcq_processor, get_internal_real_time());
        return NIL;
    }

    public static final SubLObject inference_ipc_queue_processor_enqueue_message_alt(SubLObject ipcq_processor, SubLObject message) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return queues.enqueue(message, com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_message_queue(ipcq_processor));
    }

    public static SubLObject inference_ipc_queue_processor_enqueue_message(final SubLObject ipcq_processor, final SubLObject message) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return enqueue(message, inference_ipc_queue_processor.inf_ipcq_processor_message_queue(ipcq_processor));
    }

    public static final SubLObject inference_ipc_queue_processor_dequeue_message_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return queues.dequeue(com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_message_queue(ipcq_processor));
    }

    public static SubLObject inference_ipc_queue_processor_dequeue_message(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return dequeue(inference_ipc_queue_processor.inf_ipcq_processor_message_queue(ipcq_processor));
    }

    public static final SubLObject inference_ipc_queue_processor_has_messagesP_alt(SubLObject ipcq_processor) {
        SubLTrampolineFile.checkType(ipcq_processor, INFERENCE_IPC_QUEUE_PROCESSOR_P);
        return makeBoolean(NIL == queues.queue_empty_p(com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_message_queue(ipcq_processor)));
    }

    public static SubLObject inference_ipc_queue_processor_has_messagesP(final SubLObject ipcq_processor) {
        assert NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) : "! inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + ("inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) " + "CommonSymbols.NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_p(ipcq_processor) ") + ipcq_processor;
        return makeBoolean(NIL == queue_empty_p(inference_ipc_queue_processor.inf_ipcq_processor_message_queue(ipcq_processor)));
    }

    public static final SubLObject sxhash_inference_ipc_queue_processor_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.sxhash_inference_ipc_queue_processor(v_object);
    }

    public static SubLObject sxhash_inference_ipc_queue_processor_method(final SubLObject v_object) {
        return inference_ipc_queue_processor.sxhash_inference_ipc_queue_processor(v_object);
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject sxhash_inference_ipc_queue_processor_alt(SubLObject ipcq_processor) {
        return Sxhash.sxhash(com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_inference(ipcq_processor));
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject sxhash_inference_ipc_queue_processor(final SubLObject ipcq_processor) {
        return Sxhash.sxhash(inference_ipc_queue_processor.inf_ipcq_processor_inference(ipcq_processor));
    }

    public static final SubLObject inf_ipcq_processor_do_one_iteration_alt(SubLObject ipcq_processor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject has_new_answersP = NIL;
                SubLObject timed_outP = NIL;
                SubLObject inference_event_item = NIL;
                while (!((NIL != timed_outP) || ((NIL != has_new_answersP) && (NIL != com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_time_to_sendP(ipcq_processor))))) {
                    {
                        SubLObject time_to_wait = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_time_to_wait(ipcq_processor);
                        thread.resetMultipleValues();
                        {
                            SubLObject inference_event_item_1 = process_utilities.ipc_dequeue_with_timeout(com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_ipc_queue(ipcq_processor), time_to_wait, UNPROVIDED);
                            SubLObject timed_outP_2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            inference_event_item = inference_event_item_1;
                            timed_outP = timed_outP_2;
                        }
                        if (NIL != inference_event_item) {
                            {
                                SubLObject new_answerP = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.process_inference_ipc_queue_item(ipcq_processor, inference_event_item);
                                if (NIL != new_answerP) {
                                    has_new_answersP = T;
                                }
                            }
                        }
                    }
                } 
                if ((NIL != com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_incremental_resultsP(ipcq_processor)) && (NIL != has_new_answersP)) {
                    com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_enqueue_message(ipcq_processor, list($INFERENCE_ANSWER, com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_results(ipcq_processor)));
                    com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_update_last_answer_post_time(ipcq_processor);
                    com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_results(ipcq_processor, NIL);
                }
                com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_send_messages(ipcq_processor);
            }
            return NIL;
        }
    }

    public static SubLObject inf_ipcq_processor_do_one_iteration(final SubLObject ipcq_processor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject has_new_answersP = NIL;
        SubLObject timed_outP = NIL;
        SubLObject inference_doneP = NIL;
        SubLObject inference_event_item = NIL;
        while (((NIL == timed_outP) && (NIL == inference_doneP)) && ((NIL == has_new_answersP) || (NIL == inference_ipc_queue_processor.inf_ipcq_processor_time_to_sendP(ipcq_processor)))) {
            final SubLObject time_to_wait = inference_ipc_queue_processor.inf_ipcq_processor_time_to_wait(ipcq_processor);
            thread.resetMultipleValues();
            final SubLObject inference_event_item_$1 = process_utilities.ipc_dequeue_with_timeout(inference_ipc_queue_processor.inference_ipc_queue_processor_ipc_queue(ipcq_processor), time_to_wait, UNPROVIDED);
            final SubLObject timed_outP_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_event_item = inference_event_item_$1;
            timed_outP = timed_outP_$2;
            if (NIL != inference_event_item) {
                thread.resetMultipleValues();
                final SubLObject new_answerP = inference_ipc_queue_processor.process_inference_ipc_queue_item(ipcq_processor, inference_event_item);
                final SubLObject inference_done_nowP = thread.secondMultipleValue();
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
        if ((NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_incremental_resultsP(ipcq_processor)) && (NIL != has_new_answersP)) {
            inference_ipc_queue_processor.inference_ipc_queue_processor_enqueue_message(ipcq_processor, list($INFERENCE_ANSWER, inference_ipc_queue_processor.inf_ipcq_processor_results(ipcq_processor)));
            inference_ipc_queue_processor.inference_ipc_queue_processor_update_last_answer_post_time(ipcq_processor);
            inference_ipc_queue_processor._csetf_inf_ipcq_processor_results(ipcq_processor, NIL);
        }
        inference_ipc_queue_processor.inf_ipcq_processor_send_messages(ipcq_processor);
        if (NIL != inference_doneP) {
            inference_ipc_queue_processor.note_ipcq_processor_done(ipcq_processor);
        }
        return NIL;
    }

    public static final SubLObject inf_ipcq_processor_send_messages_alt(SubLObject ipcq_processor) {
        while (NIL != com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_has_messagesP(ipcq_processor)) {
            {
                SubLObject message = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_dequeue_message(ipcq_processor);
                task_processor.post_task_info_processor_partial_results(message);
            }
        } 
        return NIL;
    }

    public static SubLObject inf_ipcq_processor_send_messages(final SubLObject ipcq_processor) {
        while (NIL != inference_ipc_queue_processor.inference_ipc_queue_processor_has_messagesP(ipcq_processor)) {
            final SubLObject message = inference_ipc_queue_processor.inference_ipc_queue_processor_dequeue_message(ipcq_processor);
            post_task_info_processor_partial_results(message);
        } 
        return NIL;
    }

    public static final SubLObject inf_ipcq_processor_time_to_sendP_alt(SubLObject ipcq_processor) {
        return numG(com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.time_since_last_answer_post(ipcq_processor), com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor));
    }

    public static SubLObject inf_ipcq_processor_time_to_sendP(final SubLObject ipcq_processor) {
        return numG(inference_ipc_queue_processor.time_since_last_answer_post(ipcq_processor), inference_ipc_queue_processor.inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor));
    }

    public static final SubLObject inf_ipcq_processor_time_to_wait_alt(SubLObject ipcq_processor) {
        {
            SubLObject min = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor);
            SubLObject elapsed = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.time_since_last_answer_post(ipcq_processor);
            SubLObject time_to_wait = subtract(min, elapsed);
            if (!time_to_wait.isPositive()) {
                time_to_wait = min;
            }
            time_to_wait = numeric_date_utilities.elapsed_internal_real_time_to_elapsed_seconds(time_to_wait);
            if (time_to_wait.numL(ONE_INTEGER)) {
                time_to_wait = ONE_INTEGER;
            }
            return time_to_wait;
        }
    }

    public static SubLObject inf_ipcq_processor_time_to_wait(final SubLObject ipcq_processor) {
        final SubLObject min = inference_ipc_queue_processor.inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor);
        final SubLObject elapsed = inference_ipc_queue_processor.time_since_last_answer_post(ipcq_processor);
        SubLObject time_to_wait = subtract(min, elapsed);
        if (!time_to_wait.isPositive()) {
            time_to_wait = min;
        }
        time_to_wait = elapsed_internal_real_time_to_elapsed_seconds(time_to_wait);
        if (time_to_wait.numL(ONE_INTEGER)) {
            time_to_wait = ONE_INTEGER;
        }
        return time_to_wait;
    }

    public static final SubLObject check_running_inference_statusP(SubLObject status) {
        return makeBoolean(!((NIL != inference_datastructures_enumerated_types.continuable_inference_status_p(status)) || ($DEAD == status)));
    }

    public static SubLObject check_running_inference_statusP(final SubLObject ipcq_processor, final SubLObject status) {
        if (NIL == valid_process_p(inference_ipc_queue_processor.inf_ipcq_processor_inference_process(ipcq_processor))) {
            final SubLObject death_counter = inference_ipc_queue_processor.inf_ipcq_processor_inference_death_counter(ipcq_processor);
            if (death_counter.isInteger()) {
                if (get_universal_time().numGE(death_counter)) {
                    return NIL;
                }
            } else {
                inference_ipc_queue_processor._csetf_inf_ipcq_processor_inference_death_counter(ipcq_processor, add(get_universal_time(), TWO_INTEGER));
            }
        }
        return makeBoolean((NIL == inference_datastructures_enumerated_types.continuable_inference_status_p(status)) && ($DEAD != status));
    }

    public static final SubLObject time_since_last_answer_post_alt(SubLObject ipcq_processor) {
        {
            SubLObject last_answer_post_time = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_last_answer_post_time(ipcq_processor);
            SubLObject result = subtract(get_internal_real_time(), last_answer_post_time);
            if (result.isNegative()) {
                result = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor);
            }
            return result;
        }
    }

    public static SubLObject time_since_last_answer_post(final SubLObject ipcq_processor) {
        final SubLObject last_answer_post_time = inference_ipc_queue_processor.inference_ipc_queue_processor_last_answer_post_time(ipcq_processor);
        SubLObject result = subtract(get_internal_real_time(), last_answer_post_time);
        if (result.isNegative()) {
            result = inference_ipc_queue_processor.inference_ipc_queue_processor_minimum_time_before_sending_new_answers(ipcq_processor);
        }
        return result;
    }

    public static final SubLObject process_inference_ipc_queue_item_alt(SubLObject ipcq_processor, SubLObject inference_event_item) {
        {
            SubLObject incremental_resultsP = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_incremental_resultsP(ipcq_processor);
            SubLObject has_new_answersP = NIL;
            if (inference_event_item == $NEW_ANSWER) {
                {
                    SubLObject inference = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_inference(ipcq_processor);
                    SubLObject v_answer = find_inference_answer_by_id(inference, com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_next_answer_index(ipcq_processor));
                    if (NIL != v_answer) {
                        com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_increment_next_answer_index(ipcq_processor);
                        has_new_answersP = T;
                        {
                            SubLObject processed_answer = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.open_cyc_process_inference_answer(ipcq_processor, v_answer);
                            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_add_new_result(ipcq_processor, processed_answer);
                        }
                    }
                }
            } else {
                if (inference_event_item.isList() && (inference_event_item.first() == $STATUS_CHANGE)) {
                    {
                        SubLObject new_status = second(inference_event_item);
                        SubLObject suspend_reason = third(inference_event_item);
                        com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.post_status_changed(ipcq_processor, new_status, incremental_resultsP, suspend_reason);
                        if (NIL == com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.check_running_inference_statusP(new_status)) {
                            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.note_ipcq_processor_done(ipcq_processor);
                        }
                    }
                }
            }
            return has_new_answersP;
        }
    }

    public static SubLObject process_inference_ipc_queue_item(final SubLObject ipcq_processor, final SubLObject inference_event_item) {
        final SubLObject incremental_resultsP = inference_ipc_queue_processor.inference_ipc_queue_processor_incremental_resultsP(ipcq_processor);
        SubLObject has_new_answersP = NIL;
        SubLObject inference_doneP = NIL;
        if (inference_event_item == $NEW_ANSWER) {
            final SubLObject inference = inference_ipc_queue_processor.inference_ipc_queue_processor_inference(ipcq_processor);
            final SubLObject v_answer = inference_datastructures_inference.find_inference_answer_by_id(inference, inference_ipc_queue_processor.inference_ipc_queue_processor_next_answer_index(ipcq_processor));
            if (NIL != v_answer) {
                inference_ipc_queue_processor.inference_ipc_queue_processor_increment_next_answer_index(ipcq_processor);
                has_new_answersP = T;
                final SubLObject processed_answer = inference_ipc_queue_processor.open_cyc_process_inference_answer(ipcq_processor, v_answer);
                inference_ipc_queue_processor.inf_ipcq_processor_add_new_result(ipcq_processor, processed_answer);
            }
        } else
            if (inference_event_item.isList() && (inference_event_item.first() == $STATUS_CHANGE)) {
                final SubLObject new_status = second(inference_event_item);
                final SubLObject suspend_reason = third(inference_event_item);
                inference_ipc_queue_processor.post_status_changed(ipcq_processor, new_status, incremental_resultsP, suspend_reason);
                if (NIL == inference_ipc_queue_processor.check_running_inference_statusP(ipcq_processor, new_status)) {
                    inference_doneP = T;
                }
            }

        return values(has_new_answersP, inference_doneP);
    }

    public static final SubLObject inf_ipcq_processor_add_new_result_alt(SubLObject ipcq_processor, SubLObject processed_answer) {
        {
            SubLObject existing_results = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inf_ipcq_processor_results(ipcq_processor);
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor._csetf_inf_ipcq_processor_results(ipcq_processor, nadd_to_end(processed_answer, existing_results));
        }
        return NIL;
    }

    public static SubLObject inf_ipcq_processor_add_new_result(final SubLObject ipcq_processor, final SubLObject processed_answer) {
        final SubLObject existing_results = inference_ipc_queue_processor.inf_ipcq_processor_results(ipcq_processor);
        inference_ipc_queue_processor._csetf_inf_ipcq_processor_results(ipcq_processor, list_utilities.nadd_to_end(processed_answer, existing_results));
        return NIL;
    }

    public static final SubLObject post_status_changed_alt(SubLObject ipcq_processor, SubLObject status, SubLObject incremental_resultsP, SubLObject suspend_reason) {
        if (NIL != incremental_resultsP) {
            com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_enqueue_message(ipcq_processor, list($INFERENCE_STATUS, status, suspend_reason));
        } else {
            format(T, $str_alt58$New_Inference_Status___A__Inferen, status, suspend_reason);
        }
        return NIL;
    }

    public static SubLObject post_status_changed(final SubLObject ipcq_processor, final SubLObject status, final SubLObject incremental_resultsP, final SubLObject suspend_reason) {
        if (NIL != incremental_resultsP) {
            inference_ipc_queue_processor.inference_ipc_queue_processor_enqueue_message(ipcq_processor, list($INFERENCE_STATUS, status, suspend_reason));
        } else {
            format(T, inference_ipc_queue_processor.$str71$New_Inference_Status___A__Inferen, status, suspend_reason);
        }
        return NIL;
    }

    /**
     * This call is used to process an inference result. INFERENCE-ANSWER is the inference answer binding set that should be processed.
     */
    @LispMethod(comment = "This call is used to process an inference result. INFERENCE-ANSWER is the inference answer binding set that should be processed.")
    public static final SubLObject open_cyc_process_inference_answer_alt(SubLObject ipcq_processor, SubLObject inference_answer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject inference = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_inference(ipcq_processor);
                SubLObject inference_answer_process_function = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_inference_answer_process_function(ipcq_processor);
                if (NIL == inference_answer_process_function) {
                    return inference_kernel.inference_answer_to_bindings(inference_answer, inference_answer_language(inference));
                }
                {
                    SubLObject nl_generation_properties = com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.inference_ipc_queue_processor_nl_generation_properties(ipcq_processor);
                    SubLObject result = NIL;
                    SubLObject handledP = NIL;
                    {
                        SubLObject _prev_bind_0 = pph_vars.$pph_inference_answer$.currentBinding(thread);
                        SubLObject _prev_bind_1 = pph_vars.$pph_hypothetical_vars$.currentBinding(thread);
                        SubLObject _prev_bind_2 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
                        SubLObject _prev_bind_3 = pph_vars.$pph_use_bulleted_listsP$.currentBinding(thread);
                        SubLObject _prev_bind_4 = pph_vars.$pph_handle_hypotheticalsP$.currentBinding(thread);
                        SubLObject _prev_bind_5 = pph_vars.$pph_repositioned_proofs$.currentBinding(thread);
                        SubLObject _prev_bind_6 = pph_vars.$pph_displayed_proofs$.currentBinding(thread);
                        SubLObject _prev_bind_7 = pph_vars.$pph_justified_proofs$.currentBinding(thread);
                        SubLObject _prev_bind_8 = pph_vars.$pph_proof_depth$.currentBinding(thread);
                        SubLObject _prev_bind_9 = pph_vars.$pph_displayed_supports$.currentBinding(thread);
                        try {
                            pph_vars.$pph_inference_answer$.bind(inference_answer, thread);
                            pph_vars.$pph_hypothetical_vars$.bind(inference_hypothetical_bindings(inference_answer_inference(inference_answer)), thread);
                            pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
                            pph_vars.$pph_use_bulleted_listsP$.bind(T, thread);
                            pph_vars.$pph_handle_hypotheticalsP$.bind(T, thread);
                            pph_vars.$pph_repositioned_proofs$.bind(NIL, thread);
                            pph_vars.$pph_displayed_proofs$.bind(pph_proof.find_or_create_pph_displayed_proof_stack(), thread);
                            pph_vars.$pph_justified_proofs$.bind(pph_proof.find_or_create_pph_justified_proof_set(), thread);
                            pph_vars.$pph_proof_depth$.bind(ZERO_INTEGER, thread);
                            pph_vars.$pph_displayed_supports$.bind(NIL, thread);
                            thread.resetMultipleValues();
                            {
                                SubLObject link_function = pph_macros.pph_justification_html_function_and_target();
                                SubLObject html_target = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject _prev_bind_0_3 = pph_vars.$constant_link_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1_4 = pph_vars.$html_generation_target$.currentBinding(thread);
                                    try {
                                        pph_vars.$constant_link_function$.bind(NIL != link_function ? ((SubLObject) (link_function)) : pph_vars.$constant_link_function$.getDynamicValue(thread), thread);
                                        pph_vars.$html_generation_target$.bind(NIL != html_target ? ((SubLObject) (html_target)) : pph_vars.$html_generation_target$.getDynamicValue(thread), thread);
                                        if (inference_answer_process_function == QL_PROCESS_INFERENCE_ANSWER) {
                                            handledP = T;
                                            result = query_library_api.ql_process_inference_answer(inference, inference_answer, nl_generation_properties);
                                        }
                                        if (NIL == handledP) {
                                            {
                                                SubLObject processed_binding_set = funcall(inference_answer_process_function, inference_answer, nl_generation_properties);
                                                result = list($BINDINGS, processed_binding_set);
                                            }
                                        }
                                    } finally {
                                        pph_vars.$html_generation_target$.rebind(_prev_bind_1_4, thread);
                                        pph_vars.$constant_link_function$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                            }
                        } finally {
                            pph_vars.$pph_displayed_supports$.rebind(_prev_bind_9, thread);
                            pph_vars.$pph_proof_depth$.rebind(_prev_bind_8, thread);
                            pph_vars.$pph_justified_proofs$.rebind(_prev_bind_7, thread);
                            pph_vars.$pph_displayed_proofs$.rebind(_prev_bind_6, thread);
                            pph_vars.$pph_repositioned_proofs$.rebind(_prev_bind_5, thread);
                            pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_4, thread);
                            pph_vars.$pph_use_bulleted_listsP$.rebind(_prev_bind_3, thread);
                            pph_vars.$pph_handle_hypotheticalsP$.rebind(_prev_bind_2, thread);
                            pph_vars.$pph_hypothetical_vars$.rebind(_prev_bind_1, thread);
                            pph_vars.$pph_inference_answer$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return result;
                }
            }
        }
    }

    /**
     * This call is used to process an inference result. INFERENCE-ANSWER is the inference answer binding set that should be processed.
     */
    @LispMethod(comment = "This call is used to process an inference result. INFERENCE-ANSWER is the inference answer binding set that should be processed.")
    public static SubLObject open_cyc_process_inference_answer(final SubLObject ipcq_processor, final SubLObject inference_answer) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject inference = inference_ipc_queue_processor.inference_ipc_queue_processor_inference(ipcq_processor);
        final SubLObject inference_answer_process_function = inference_ipc_queue_processor.inference_ipc_queue_processor_inference_answer_process_function(ipcq_processor);
        if (NIL == inference_answer_process_function) {
            return inference_ipc_queue_processor.convert_unicode_strings_in_bindings_to_utf8(inference_kernel.inference_answer_to_bindings(inference_answer, inference_datastructures_inference.inference_answer_language(inference)));
        }
        final SubLObject nl_generation_properties = inference_ipc_queue_processor.inference_ipc_queue_processor_nl_generation_properties(ipcq_processor);
        SubLObject result = NIL;
        SubLObject handledP = NIL;
        final SubLObject _prev_bind_0 = $pph_inference_answer$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $pph_hypothetical_vars$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $pph_handle_hypotheticalsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $pph_domain_mt$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $pph_use_bulleted_listsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $pph_repositioned_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $pph_displayed_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $pph_justified_proofs$.currentBinding(thread);
        final SubLObject _prev_bind_9 = $pph_proof_depth$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $pph_displayed_supports$.currentBinding(thread);
        try {
            $pph_inference_answer$.bind(inference_answer, thread);
            $pph_hypothetical_vars$.bind(inference_datastructures_inference.inference_hypothetical_bindings(inference_datastructures_inference.inference_answer_inference(inference_answer)), thread);
            $pph_handle_hypotheticalsP$.bind(T, thread);
            $pph_domain_mt$.bind(pph_methods.pph_enhanced_domain_mt(pph_get_inference_mt(inference_datastructures_inference.inference_answer_inference(inference_answer)), UNPROVIDED), thread);
            $pph_use_bulleted_listsP$.bind(T, thread);
            $pph_repositioned_proofs$.bind(NIL, thread);
            $pph_displayed_proofs$.bind(find_or_create_pph_displayed_proof_stack(), thread);
            $pph_justified_proofs$.bind(find_or_create_pph_justified_proof_set(), thread);
            $pph_proof_depth$.bind(ZERO_INTEGER, thread);
            $pph_displayed_supports$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject link_function = pph_justification_html_function_and_target();
            final SubLObject html_target = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$3 = $constant_link_function$.currentBinding(thread);
            final SubLObject _prev_bind_1_$4 = $html_generation_target$.currentBinding(thread);
            try {
                $constant_link_function$.bind(NIL != link_function ? link_function : $constant_link_function$.getDynamicValue(thread), thread);
                $html_generation_target$.bind(NIL != html_target ? html_target : $html_generation_target$.getDynamicValue(thread), thread);
                if (inference_answer_process_function == inference_ipc_queue_processor.QL_PROCESS_INFERENCE_ANSWER) {
                    handledP = T;
                    result = ql_process_inference_answer(inference, inference_answer, nl_generation_properties);
                }
                if (NIL == handledP) {
                    final SubLObject processed_binding_set = funcall(inference_answer_process_function, inference_answer, nl_generation_properties);
                    result = list($BINDINGS, processed_binding_set);
                }
            } finally {
                $html_generation_target$.rebind(_prev_bind_1_$4, thread);
                $constant_link_function$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            $pph_displayed_supports$.rebind(_prev_bind_10, thread);
            $pph_proof_depth$.rebind(_prev_bind_9, thread);
            $pph_justified_proofs$.rebind(_prev_bind_8, thread);
            $pph_displayed_proofs$.rebind(_prev_bind_7, thread);
            $pph_repositioned_proofs$.rebind(_prev_bind_6, thread);
            $pph_use_bulleted_listsP$.rebind(_prev_bind_5, thread);
            $pph_domain_mt$.rebind(_prev_bind_4, thread);
            $pph_handle_hypotheticalsP$.rebind(_prev_bind_3, thread);
            $pph_hypothetical_vars$.rebind(_prev_bind_2, thread);
            $pph_inference_answer$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeSymbol("INFERENCE"), makeSymbol("IPC-QUEUE"), makeSymbol("INFERENCE-ANSWER-PROCESS-FUNCTION"), makeSymbol("NL-GENERATION-PROPERTIES"), makeSymbol("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeSymbol("INCREMENTAL-RESULTS?"), makeSymbol("NEXT-ANSWER-INDEX"), makeSymbol("RESULTS"), makeSymbol("DONE?"), makeSymbol("LAST-ANSWER-POST-TIME"), makeSymbol("MESSAGE-QUEUE") });

    static private final SubLList $list_alt9 = list(new SubLObject[]{ makeKeyword("INFERENCE"), makeKeyword("IPC-QUEUE"), makeKeyword("INFERENCE-ANSWER-PROCESS-FUNCTION"), makeKeyword("NL-GENERATION-PROPERTIES"), makeKeyword("MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeKeyword("INCREMENTAL-RESULTS?"), makeKeyword("NEXT-ANSWER-INDEX"), makeKeyword("RESULTS"), makeKeyword("DONE?"), makeKeyword("LAST-ANSWER-POST-TIME"), makeKeyword("MESSAGE-QUEUE") });

    static private final SubLList $list_alt10 = list(new SubLObject[]{ makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE"), makeSymbol("INF-IPCQ-PROCESSOR-IPC-QUEUE"), makeSymbol("INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION"), makeSymbol("INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES"), makeSymbol("INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeSymbol("INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?"), makeSymbol("INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX"), makeSymbol("INF-IPCQ-PROCESSOR-RESULTS"), makeSymbol("INF-IPCQ-PROCESSOR-DONE?"), makeSymbol("INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME"), makeSymbol("INF-IPCQ-PROCESSOR-MESSAGE-QUEUE") });

    public static SubLObject convert_unicode_strings_in_bindings_to_utf8(final SubLObject original_bindings) {
        SubLObject v_bindings = original_bindings;
        SubLObject revisions = NIL;
        SubLObject list_var = NIL;
        SubLObject binding = NIL;
        SubLObject n = NIL;
        list_var = v_bindings;
        binding = list_var.first();
        for (n = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , binding = list_var.first() , n = add(ONE_INTEGER, n)) {
            if (NIL != unicode_nauts.unicode_naut_p(bindings.variable_binding_value(binding), UNPROVIDED)) {
                revisions = list_utilities.alist_enter(revisions, n, cycl_string.cycl_string_to_utf8_string(bindings.variable_binding_value(binding)), UNPROVIDED);
            }
        }
        SubLObject cdolist_list_var = revisions;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject n2 = NIL;
            SubLObject utf8 = NIL;
            destructuring_bind_must_consp(current, datum, inference_ipc_queue_processor.$list74);
            n2 = current.first();
            current = utf8 = current.rest();
            v_bindings = list_utilities.replace_nth(n2, bindings.make_variable_binding(bindings.variable_binding_variable(nth(n2, v_bindings)), utf8), v_bindings);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return v_bindings;
    }

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-RESULTS"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-DONE?"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME"), makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE") });

    public static final SubLObject declare_inference_ipc_queue_processor_file_alt() {
        declareFunction("new_inference_ipc_queue_processor", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR", 4, 3, false);
        declareFunction("inference_ipc_queue_processor_do_one_iteration", "INFERENCE-IPC-QUEUE-PROCESSOR-DO-ONE-ITERATION", 1, 0, false);
        declareFunction("get_inference_ipc_queue_processor_results", "GET-INFERENCE-IPC-QUEUE-PROCESSOR-RESULTS", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_print_function_trampoline", "INFERENCE-IPC-QUEUE-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("inference_ipc_queue_processor_p", "INFERENCE-IPC-QUEUE-PROCESSOR-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.$inference_ipc_queue_processor_p$UnaryFunction();
        declareFunction("inf_ipcq_processor_inference", "INF-IPCQ-PROCESSOR-INFERENCE", 1, 0, false);
        declareFunction("inf_ipcq_processor_ipc_queue", "INF-IPCQ-PROCESSOR-IPC-QUEUE", 1, 0, false);
        declareFunction("inf_ipcq_processor_inference_answer_process_function", "INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 1, 0, false);
        declareFunction("inf_ipcq_processor_nl_generation_properties", "INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES", 1, 0, false);
        declareFunction("inf_ipcq_processor_minimum_time_before_sending_new_answers", "INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 1, 0, false);
        declareFunction("inf_ipcq_processor_incremental_resultsP", "INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?", 1, 0, false);
        declareFunction("inf_ipcq_processor_next_answer_index", "INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX", 1, 0, false);
        declareFunction("inf_ipcq_processor_results", "INF-IPCQ-PROCESSOR-RESULTS", 1, 0, false);
        declareFunction("inf_ipcq_processor_doneP", "INF-IPCQ-PROCESSOR-DONE?", 1, 0, false);
        declareFunction("inf_ipcq_processor_last_answer_post_time", "INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME", 1, 0, false);
        declareFunction("inf_ipcq_processor_message_queue", "INF-IPCQ-PROCESSOR-MESSAGE-QUEUE", 1, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_inference", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_ipc_queue", "_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_inference_answer_process_function", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_nl_generation_properties", "_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers", "_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_incremental_resultsP", "_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_next_answer_index", "_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_results", "_CSETF-INF-IPCQ-PROCESSOR-RESULTS", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_doneP", "_CSETF-INF-IPCQ-PROCESSOR-DONE?", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_last_answer_post_time", "_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_message_queue", "_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE", 2, 0, false);
        declareFunction("make_inference_ipc_queue_processor", "MAKE-INFERENCE-IPC-QUEUE-PROCESSOR", 0, 1, false);
        declareFunction("print_inference_ipc_queue_processor", "PRINT-INFERENCE-IPC-QUEUE-PROCESSOR", 3, 0, false);
        declareFunction("new_inference_ipc_queue_processor_internal", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR-INTERNAL", 7, 0, false);
        declareFunction("inference_ipc_queue_processor_inference", "INFERENCE-IPC-QUEUE-PROCESSOR-INFERENCE", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_ipc_queue", "INFERENCE-IPC-QUEUE-PROCESSOR-IPC-QUEUE", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_inference_answer_process_function", "INFERENCE-IPC-QUEUE-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_nl_generation_properties", "INFERENCE-IPC-QUEUE-PROCESSOR-NL-GENERATION-PROPERTIES", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_minimum_time_before_sending_new_answers", "INFERENCE-IPC-QUEUE-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_incremental_resultsP", "INFERENCE-IPC-QUEUE-PROCESSOR-INCREMENTAL-RESULTS?", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_next_answer_index", "INFERENCE-IPC-QUEUE-PROCESSOR-NEXT-ANSWER-INDEX", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_increment_next_answer_index", "INFERENCE-IPC-QUEUE-PROCESSOR-INCREMENT-NEXT-ANSWER-INDEX", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_results", "INFERENCE-IPC-QUEUE-PROCESSOR-RESULTS", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_doneP", "INFERENCE-IPC-QUEUE-PROCESSOR-DONE?", 1, 0, false);
        declareFunction("note_ipcq_processor_done", "NOTE-IPCQ-PROCESSOR-DONE", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_last_answer_post_time", "INFERENCE-IPC-QUEUE-PROCESSOR-LAST-ANSWER-POST-TIME", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_update_last_answer_post_time", "INFERENCE-IPC-QUEUE-PROCESSOR-UPDATE-LAST-ANSWER-POST-TIME", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_enqueue_message", "INFERENCE-IPC-QUEUE-PROCESSOR-ENQUEUE-MESSAGE", 2, 0, false);
        declareFunction("inference_ipc_queue_processor_dequeue_message", "INFERENCE-IPC-QUEUE-PROCESSOR-DEQUEUE-MESSAGE", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_has_messagesP", "INFERENCE-IPC-QUEUE-PROCESSOR-HAS-MESSAGES?", 1, 0, false);
        declareFunction("sxhash_inference_ipc_queue_processor_method", "SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD", 1, 0, false);
        declareFunction("sxhash_inference_ipc_queue_processor", "SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR", 1, 0, false);
        declareFunction("inf_ipcq_processor_do_one_iteration", "INF-IPCQ-PROCESSOR-DO-ONE-ITERATION", 1, 0, false);
        declareFunction("inf_ipcq_processor_send_messages", "INF-IPCQ-PROCESSOR-SEND-MESSAGES", 1, 0, false);
        declareFunction("inf_ipcq_processor_time_to_sendP", "INF-IPCQ-PROCESSOR-TIME-TO-SEND?", 1, 0, false);
        declareFunction("inf_ipcq_processor_time_to_wait", "INF-IPCQ-PROCESSOR-TIME-TO-WAIT", 1, 0, false);
        declareFunction("check_running_inference_statusP", "CHECK-RUNNING-INFERENCE-STATUS?", 1, 0, false);
        declareFunction("time_since_last_answer_post", "TIME-SINCE-LAST-ANSWER-POST", 1, 0, false);
        declareFunction("process_inference_ipc_queue_item", "PROCESS-INFERENCE-IPC-QUEUE-ITEM", 2, 0, false);
        declareFunction("inf_ipcq_processor_add_new_result", "INF-IPCQ-PROCESSOR-ADD-NEW-RESULT", 2, 0, false);
        declareFunction("post_status_changed", "POST-STATUS-CHANGED", 4, 0, false);
        declareFunction("open_cyc_process_inference_answer", "OPEN-CYC-PROCESS-INFERENCE-ANSWER", 2, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_ipc_queue_processor_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("new_inference_ipc_queue_processor", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR", 4, 4, false);
            declareFunction("inference_ipc_queue_processor_do_one_iteration", "INFERENCE-IPC-QUEUE-PROCESSOR-DO-ONE-ITERATION", 1, 0, false);
            declareFunction("get_inference_ipc_queue_processor_results", "GET-INFERENCE-IPC-QUEUE-PROCESSOR-RESULTS", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_print_function_trampoline", "INFERENCE-IPC-QUEUE-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("inference_ipc_queue_processor_p", "INFERENCE-IPC-QUEUE-PROCESSOR-P", 1, 0, false);
            new inference_ipc_queue_processor.$inference_ipc_queue_processor_p$UnaryFunction();
            declareFunction("inf_ipcq_processor_inference", "INF-IPCQ-PROCESSOR-INFERENCE", 1, 0, false);
            declareFunction("inf_ipcq_processor_ipc_queue", "INF-IPCQ-PROCESSOR-IPC-QUEUE", 1, 0, false);
            declareFunction("inf_ipcq_processor_inference_answer_process_function", "INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 1, 0, false);
            declareFunction("inf_ipcq_processor_nl_generation_properties", "INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES", 1, 0, false);
            declareFunction("inf_ipcq_processor_minimum_time_before_sending_new_answers", "INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 1, 0, false);
            declareFunction("inf_ipcq_processor_incremental_resultsP", "INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?", 1, 0, false);
            declareFunction("inf_ipcq_processor_next_answer_index", "INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX", 1, 0, false);
            declareFunction("inf_ipcq_processor_results", "INF-IPCQ-PROCESSOR-RESULTS", 1, 0, false);
            declareFunction("inf_ipcq_processor_doneP", "INF-IPCQ-PROCESSOR-DONE?", 1, 0, false);
            declareFunction("inf_ipcq_processor_last_answer_post_time", "INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME", 1, 0, false);
            declareFunction("inf_ipcq_processor_message_queue", "INF-IPCQ-PROCESSOR-MESSAGE-QUEUE", 1, 0, false);
            declareFunction("inf_ipcq_processor_inference_process", "INF-IPCQ-PROCESSOR-INFERENCE-PROCESS", 1, 0, false);
            declareFunction("inf_ipcq_processor_inference_death_counter", "INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER", 1, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_inference", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_ipc_queue", "_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_inference_answer_process_function", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_nl_generation_properties", "_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers", "_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_incremental_resultsP", "_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_next_answer_index", "_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_results", "_CSETF-INF-IPCQ-PROCESSOR-RESULTS", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_doneP", "_CSETF-INF-IPCQ-PROCESSOR-DONE?", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_last_answer_post_time", "_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_message_queue", "_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_inference_process", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-PROCESS", 2, 0, false);
            declareFunction("_csetf_inf_ipcq_processor_inference_death_counter", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER", 2, 0, false);
            declareFunction("make_inference_ipc_queue_processor", "MAKE-INFERENCE-IPC-QUEUE-PROCESSOR", 0, 1, false);
            declareFunction("visit_defstruct_inference_ipc_queue_processor", "VISIT-DEFSTRUCT-INFERENCE-IPC-QUEUE-PROCESSOR", 2, 0, false);
            declareFunction("visit_defstruct_object_inference_ipc_queue_processor_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD", 2, 0, false);
            declareFunction("print_inference_ipc_queue_processor", "PRINT-INFERENCE-IPC-QUEUE-PROCESSOR", 3, 0, false);
            declareFunction("new_inference_ipc_queue_processor_internal", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR-INTERNAL", 8, 0, false);
            declareFunction("inference_ipc_queue_processor_inference", "INFERENCE-IPC-QUEUE-PROCESSOR-INFERENCE", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_ipc_queue", "INFERENCE-IPC-QUEUE-PROCESSOR-IPC-QUEUE", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_inference_answer_process_function", "INFERENCE-IPC-QUEUE-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_nl_generation_properties", "INFERENCE-IPC-QUEUE-PROCESSOR-NL-GENERATION-PROPERTIES", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_minimum_time_before_sending_new_answers", "INFERENCE-IPC-QUEUE-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_incremental_resultsP", "INFERENCE-IPC-QUEUE-PROCESSOR-INCREMENTAL-RESULTS?", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_next_answer_index", "INFERENCE-IPC-QUEUE-PROCESSOR-NEXT-ANSWER-INDEX", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_increment_next_answer_index", "INFERENCE-IPC-QUEUE-PROCESSOR-INCREMENT-NEXT-ANSWER-INDEX", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_results", "INFERENCE-IPC-QUEUE-PROCESSOR-RESULTS", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_doneP", "INFERENCE-IPC-QUEUE-PROCESSOR-DONE?", 1, 0, false);
            declareFunction("note_ipcq_processor_done", "NOTE-IPCQ-PROCESSOR-DONE", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_last_answer_post_time", "INFERENCE-IPC-QUEUE-PROCESSOR-LAST-ANSWER-POST-TIME", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_update_last_answer_post_time", "INFERENCE-IPC-QUEUE-PROCESSOR-UPDATE-LAST-ANSWER-POST-TIME", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_enqueue_message", "INFERENCE-IPC-QUEUE-PROCESSOR-ENQUEUE-MESSAGE", 2, 0, false);
            declareFunction("inference_ipc_queue_processor_dequeue_message", "INFERENCE-IPC-QUEUE-PROCESSOR-DEQUEUE-MESSAGE", 1, 0, false);
            declareFunction("inference_ipc_queue_processor_has_messagesP", "INFERENCE-IPC-QUEUE-PROCESSOR-HAS-MESSAGES?", 1, 0, false);
            declareFunction("sxhash_inference_ipc_queue_processor_method", "SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD", 1, 0, false);
            declareFunction("sxhash_inference_ipc_queue_processor", "SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR", 1, 0, false);
            declareFunction("inf_ipcq_processor_do_one_iteration", "INF-IPCQ-PROCESSOR-DO-ONE-ITERATION", 1, 0, false);
            declareFunction("inf_ipcq_processor_send_messages", "INF-IPCQ-PROCESSOR-SEND-MESSAGES", 1, 0, false);
            declareFunction("inf_ipcq_processor_time_to_sendP", "INF-IPCQ-PROCESSOR-TIME-TO-SEND?", 1, 0, false);
            declareFunction("inf_ipcq_processor_time_to_wait", "INF-IPCQ-PROCESSOR-TIME-TO-WAIT", 1, 0, false);
            declareFunction("check_running_inference_statusP", "CHECK-RUNNING-INFERENCE-STATUS?", 2, 0, false);
            declareFunction("time_since_last_answer_post", "TIME-SINCE-LAST-ANSWER-POST", 1, 0, false);
            declareFunction("process_inference_ipc_queue_item", "PROCESS-INFERENCE-IPC-QUEUE-ITEM", 2, 0, false);
            declareFunction("inf_ipcq_processor_add_new_result", "INF-IPCQ-PROCESSOR-ADD-NEW-RESULT", 2, 0, false);
            declareFunction("post_status_changed", "POST-STATUS-CHANGED", 4, 0, false);
            declareFunction("open_cyc_process_inference_answer", "OPEN-CYC-PROCESS-INFERENCE-ANSWER", 2, 0, false);
            declareFunction("convert_unicode_strings_in_bindings_to_utf8", "CONVERT-UNICODE-STRINGS-IN-BINDINGS-TO-UTF8", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("new_inference_ipc_queue_processor", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR", 4, 3, false);
            declareFunction("new_inference_ipc_queue_processor_internal", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR-INTERNAL", 7, 0, false);
            declareFunction("check_running_inference_statusP", "CHECK-RUNNING-INFERENCE-STATUS?", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_ipc_queue_processor_file_Previous() {
        declareFunction("new_inference_ipc_queue_processor", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR", 4, 4, false);
        declareFunction("inference_ipc_queue_processor_do_one_iteration", "INFERENCE-IPC-QUEUE-PROCESSOR-DO-ONE-ITERATION", 1, 0, false);
        declareFunction("get_inference_ipc_queue_processor_results", "GET-INFERENCE-IPC-QUEUE-PROCESSOR-RESULTS", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_print_function_trampoline", "INFERENCE-IPC-QUEUE-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("inference_ipc_queue_processor_p", "INFERENCE-IPC-QUEUE-PROCESSOR-P", 1, 0, false);
        new inference_ipc_queue_processor.$inference_ipc_queue_processor_p$UnaryFunction();
        declareFunction("inf_ipcq_processor_inference", "INF-IPCQ-PROCESSOR-INFERENCE", 1, 0, false);
        declareFunction("inf_ipcq_processor_ipc_queue", "INF-IPCQ-PROCESSOR-IPC-QUEUE", 1, 0, false);
        declareFunction("inf_ipcq_processor_inference_answer_process_function", "INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 1, 0, false);
        declareFunction("inf_ipcq_processor_nl_generation_properties", "INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES", 1, 0, false);
        declareFunction("inf_ipcq_processor_minimum_time_before_sending_new_answers", "INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 1, 0, false);
        declareFunction("inf_ipcq_processor_incremental_resultsP", "INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?", 1, 0, false);
        declareFunction("inf_ipcq_processor_next_answer_index", "INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX", 1, 0, false);
        declareFunction("inf_ipcq_processor_results", "INF-IPCQ-PROCESSOR-RESULTS", 1, 0, false);
        declareFunction("inf_ipcq_processor_doneP", "INF-IPCQ-PROCESSOR-DONE?", 1, 0, false);
        declareFunction("inf_ipcq_processor_last_answer_post_time", "INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME", 1, 0, false);
        declareFunction("inf_ipcq_processor_message_queue", "INF-IPCQ-PROCESSOR-MESSAGE-QUEUE", 1, 0, false);
        declareFunction("inf_ipcq_processor_inference_process", "INF-IPCQ-PROCESSOR-INFERENCE-PROCESS", 1, 0, false);
        declareFunction("inf_ipcq_processor_inference_death_counter", "INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER", 1, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_inference", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_ipc_queue", "_CSETF-INF-IPCQ-PROCESSOR-IPC-QUEUE", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_inference_answer_process_function", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_nl_generation_properties", "_CSETF-INF-IPCQ-PROCESSOR-NL-GENERATION-PROPERTIES", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_minimum_time_before_sending_new_answers", "_CSETF-INF-IPCQ-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_incremental_resultsP", "_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_next_answer_index", "_CSETF-INF-IPCQ-PROCESSOR-NEXT-ANSWER-INDEX", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_results", "_CSETF-INF-IPCQ-PROCESSOR-RESULTS", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_doneP", "_CSETF-INF-IPCQ-PROCESSOR-DONE?", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_last_answer_post_time", "_CSETF-INF-IPCQ-PROCESSOR-LAST-ANSWER-POST-TIME", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_message_queue", "_CSETF-INF-IPCQ-PROCESSOR-MESSAGE-QUEUE", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_inference_process", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-PROCESS", 2, 0, false);
        declareFunction("_csetf_inf_ipcq_processor_inference_death_counter", "_CSETF-INF-IPCQ-PROCESSOR-INFERENCE-DEATH-COUNTER", 2, 0, false);
        declareFunction("make_inference_ipc_queue_processor", "MAKE-INFERENCE-IPC-QUEUE-PROCESSOR", 0, 1, false);
        declareFunction("visit_defstruct_inference_ipc_queue_processor", "VISIT-DEFSTRUCT-INFERENCE-IPC-QUEUE-PROCESSOR", 2, 0, false);
        declareFunction("visit_defstruct_object_inference_ipc_queue_processor_method", "VISIT-DEFSTRUCT-OBJECT-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD", 2, 0, false);
        declareFunction("print_inference_ipc_queue_processor", "PRINT-INFERENCE-IPC-QUEUE-PROCESSOR", 3, 0, false);
        declareFunction("new_inference_ipc_queue_processor_internal", "NEW-INFERENCE-IPC-QUEUE-PROCESSOR-INTERNAL", 8, 0, false);
        declareFunction("inference_ipc_queue_processor_inference", "INFERENCE-IPC-QUEUE-PROCESSOR-INFERENCE", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_ipc_queue", "INFERENCE-IPC-QUEUE-PROCESSOR-IPC-QUEUE", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_inference_answer_process_function", "INFERENCE-IPC-QUEUE-PROCESSOR-INFERENCE-ANSWER-PROCESS-FUNCTION", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_nl_generation_properties", "INFERENCE-IPC-QUEUE-PROCESSOR-NL-GENERATION-PROPERTIES", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_minimum_time_before_sending_new_answers", "INFERENCE-IPC-QUEUE-PROCESSOR-MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_incremental_resultsP", "INFERENCE-IPC-QUEUE-PROCESSOR-INCREMENTAL-RESULTS?", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_next_answer_index", "INFERENCE-IPC-QUEUE-PROCESSOR-NEXT-ANSWER-INDEX", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_increment_next_answer_index", "INFERENCE-IPC-QUEUE-PROCESSOR-INCREMENT-NEXT-ANSWER-INDEX", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_results", "INFERENCE-IPC-QUEUE-PROCESSOR-RESULTS", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_doneP", "INFERENCE-IPC-QUEUE-PROCESSOR-DONE?", 1, 0, false);
        declareFunction("note_ipcq_processor_done", "NOTE-IPCQ-PROCESSOR-DONE", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_last_answer_post_time", "INFERENCE-IPC-QUEUE-PROCESSOR-LAST-ANSWER-POST-TIME", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_update_last_answer_post_time", "INFERENCE-IPC-QUEUE-PROCESSOR-UPDATE-LAST-ANSWER-POST-TIME", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_enqueue_message", "INFERENCE-IPC-QUEUE-PROCESSOR-ENQUEUE-MESSAGE", 2, 0, false);
        declareFunction("inference_ipc_queue_processor_dequeue_message", "INFERENCE-IPC-QUEUE-PROCESSOR-DEQUEUE-MESSAGE", 1, 0, false);
        declareFunction("inference_ipc_queue_processor_has_messagesP", "INFERENCE-IPC-QUEUE-PROCESSOR-HAS-MESSAGES?", 1, 0, false);
        declareFunction("sxhash_inference_ipc_queue_processor_method", "SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR-METHOD", 1, 0, false);
        declareFunction("sxhash_inference_ipc_queue_processor", "SXHASH-INFERENCE-IPC-QUEUE-PROCESSOR", 1, 0, false);
        declareFunction("inf_ipcq_processor_do_one_iteration", "INF-IPCQ-PROCESSOR-DO-ONE-ITERATION", 1, 0, false);
        declareFunction("inf_ipcq_processor_send_messages", "INF-IPCQ-PROCESSOR-SEND-MESSAGES", 1, 0, false);
        declareFunction("inf_ipcq_processor_time_to_sendP", "INF-IPCQ-PROCESSOR-TIME-TO-SEND?", 1, 0, false);
        declareFunction("inf_ipcq_processor_time_to_wait", "INF-IPCQ-PROCESSOR-TIME-TO-WAIT", 1, 0, false);
        declareFunction("check_running_inference_statusP", "CHECK-RUNNING-INFERENCE-STATUS?", 2, 0, false);
        declareFunction("time_since_last_answer_post", "TIME-SINCE-LAST-ANSWER-POST", 1, 0, false);
        declareFunction("process_inference_ipc_queue_item", "PROCESS-INFERENCE-IPC-QUEUE-ITEM", 2, 0, false);
        declareFunction("inf_ipcq_processor_add_new_result", "INF-IPCQ-PROCESSOR-ADD-NEW-RESULT", 2, 0, false);
        declareFunction("post_status_changed", "POST-STATUS-CHANGED", 4, 0, false);
        declareFunction("open_cyc_process_inference_answer", "OPEN-CYC-PROCESS-INFERENCE-ANSWER", 2, 0, false);
        declareFunction("convert_unicode_strings_in_bindings_to_utf8", "CONVERT-UNICODE-STRINGS-IN-BINDINGS-TO-UTF8", 1, 0, false);
        return NIL;
    }

    static private final SubLSymbol $sym24$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_ = makeSymbol("INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?");

    static private final SubLSymbol $sym25$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_ = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-INCREMENTAL-RESULTS?");

    static private final SubLSymbol $sym30$INF_IPCQ_PROCESSOR_DONE_ = makeSymbol("INF-IPCQ-PROCESSOR-DONE?");

    static private final SubLSymbol $sym31$_CSETF_INF_IPCQ_PROCESSOR_DONE_ = makeSymbol("_CSETF-INF-IPCQ-PROCESSOR-DONE?");

    public static final SubLSymbol $kw41$INCREMENTAL_RESULTS_ = makeKeyword("INCREMENTAL-RESULTS?");

    static private final SubLString $str_alt47$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt48$_INFERENCE_IPC_QUEUE_PROCESSOR = makeString("<INFERENCE-IPC-QUEUE-PROCESSOR");

    static private final SubLString $str_alt49$_DONE = makeString(" DONE");

    static private final SubLString $str_alt50$__S = makeString(" ~S");

    static private final SubLString $str_alt51$_ = makeString(">");

    static private final SubLString $str_alt58$New_Inference_Status___A__Inferen = makeString("New Inference Status: ~A~%Inference Suspend Status: ~A~%");

    public static SubLObject init_inference_ipc_queue_processor_file() {
        defparameter("*MINIMUM-TIME-BEFORE-SENDING-NEW-ANSWERS*", elapsed_seconds_to_elapsed_internal_real_time(ONE_INTEGER));
        defconstant("*DTP-INFERENCE-IPC-QUEUE-PROCESSOR*", inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR);
        return NIL;
    }

    public static final SubLObject setup_inference_ipc_queue_processor_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_inference_ipc_queue_processor$.getGlobalValue(), symbol_function(INFERENCE_IPC_QUEUE_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(INF_IPCQ_PROCESSOR_INFERENCE, _CSETF_INF_IPCQ_PROCESSOR_INFERENCE);
        def_csetf(INF_IPCQ_PROCESSOR_IPC_QUEUE, _CSETF_INF_IPCQ_PROCESSOR_IPC_QUEUE);
        def_csetf(INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION, _CSETF_INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION);
        def_csetf(INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES, _CSETF_INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES);
        def_csetf(INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS, _CSETF_INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS);
        def_csetf($sym24$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_, $sym25$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_);
        def_csetf(INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX, _CSETF_INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX);
        def_csetf(INF_IPCQ_PROCESSOR_RESULTS, _CSETF_INF_IPCQ_PROCESSOR_RESULTS);
        def_csetf($sym30$INF_IPCQ_PROCESSOR_DONE_, $sym31$_CSETF_INF_IPCQ_PROCESSOR_DONE_);
        def_csetf(INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME, _CSETF_INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME);
        def_csetf(INF_IPCQ_PROCESSOR_MESSAGE_QUEUE, _CSETF_INF_IPCQ_PROCESSOR_MESSAGE_QUEUE);
        identity(INFERENCE_IPC_QUEUE_PROCESSOR);
        note_funcall_helper_function(PRINT_INFERENCE_IPC_QUEUE_PROCESSOR);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_inference_ipc_queue_processor$.getGlobalValue(), symbol_function(SXHASH_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD));
        return NIL;
    }

    public static SubLObject setup_inference_ipc_queue_processor_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), inference_ipc_queue_processor.$dtp_inference_ipc_queue_processor$.getGlobalValue(), symbol_function(inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(inference_ipc_queue_processor.$list14);
            def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_INFERENCE, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_INFERENCE);
            def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_IPC_QUEUE, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_IPC_QUEUE);
            def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION);
            def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES);
            def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS);
            def_csetf(inference_ipc_queue_processor.$sym25$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_, inference_ipc_queue_processor.$sym26$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_);
            def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX);
            def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_RESULTS, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_RESULTS);
            def_csetf(inference_ipc_queue_processor.$sym31$INF_IPCQ_PROCESSOR_DONE_, inference_ipc_queue_processor.$sym32$_CSETF_INF_IPCQ_PROCESSOR_DONE_);
            def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME);
            def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_MESSAGE_QUEUE, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_MESSAGE_QUEUE);
            def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_INFERENCE_PROCESS, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_INFERENCE_PROCESS);
            def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER);
            identity(inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_ipc_queue_processor.$dtp_inference_ipc_queue_processor$.getGlobalValue(), symbol_function(inference_ipc_queue_processor.VISIT_DEFSTRUCT_OBJECT_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD));
            note_funcall_helper_function(inference_ipc_queue_processor.PRINT_INFERENCE_IPC_QUEUE_PROCESSOR);
            register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_ipc_queue_processor.$dtp_inference_ipc_queue_processor$.getGlobalValue(), symbol_function(inference_ipc_queue_processor.SXHASH_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD));
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym24$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_, $sym25$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_);
            def_csetf($sym30$INF_IPCQ_PROCESSOR_DONE_, $sym31$_CSETF_INF_IPCQ_PROCESSOR_DONE_);
        }
        return NIL;
    }

    public static SubLObject setup_inference_ipc_queue_processor_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), inference_ipc_queue_processor.$dtp_inference_ipc_queue_processor$.getGlobalValue(), symbol_function(inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(inference_ipc_queue_processor.$list14);
        def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_INFERENCE, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_INFERENCE);
        def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_IPC_QUEUE, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_IPC_QUEUE);
        def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_INFERENCE_ANSWER_PROCESS_FUNCTION);
        def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_NL_GENERATION_PROPERTIES);
        def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_MINIMUM_TIME_BEFORE_SENDING_NEW_ANSWERS);
        def_csetf(inference_ipc_queue_processor.$sym25$INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_, inference_ipc_queue_processor.$sym26$_CSETF_INF_IPCQ_PROCESSOR_INCREMENTAL_RESULTS_);
        def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_NEXT_ANSWER_INDEX);
        def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_RESULTS, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_RESULTS);
        def_csetf(inference_ipc_queue_processor.$sym31$INF_IPCQ_PROCESSOR_DONE_, inference_ipc_queue_processor.$sym32$_CSETF_INF_IPCQ_PROCESSOR_DONE_);
        def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_LAST_ANSWER_POST_TIME);
        def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_MESSAGE_QUEUE, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_MESSAGE_QUEUE);
        def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_INFERENCE_PROCESS, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_INFERENCE_PROCESS);
        def_csetf(inference_ipc_queue_processor.INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER, inference_ipc_queue_processor._CSETF_INF_IPCQ_PROCESSOR_INFERENCE_DEATH_COUNTER);
        identity(inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_ipc_queue_processor.$dtp_inference_ipc_queue_processor$.getGlobalValue(), symbol_function(inference_ipc_queue_processor.VISIT_DEFSTRUCT_OBJECT_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD));
        note_funcall_helper_function(inference_ipc_queue_processor.PRINT_INFERENCE_IPC_QUEUE_PROCESSOR);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), inference_ipc_queue_processor.$dtp_inference_ipc_queue_processor$.getGlobalValue(), symbol_function(inference_ipc_queue_processor.SXHASH_INFERENCE_IPC_QUEUE_PROCESSOR_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        inference_ipc_queue_processor.declare_inference_ipc_queue_processor_file();
    }

    @Override
    public void initializeVariables() {
        inference_ipc_queue_processor.init_inference_ipc_queue_processor_file();
    }

    @Override
    public void runTopLevelForms() {
        inference_ipc_queue_processor.setup_inference_ipc_queue_processor_file();
    }

    static {
    }

    public static final class $inference_ipc_queue_processor_native extends SubLStructNative {
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
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$ipc_queue = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference_answer_process_function = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$nl_generation_properties = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$minimum_time_before_sending_new_answers = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$incremental_resultsP = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$next_answer_index = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$results = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$doneP = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$last_answer_post_time = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$message_queue = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference_process = Lisp.NIL;
            inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference_death_counter = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference;
        }

        @Override
        public SubLObject getField3() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$ipc_queue;
        }

        @Override
        public SubLObject getField4() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference_answer_process_function;
        }

        @Override
        public SubLObject getField5() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$nl_generation_properties;
        }

        @Override
        public SubLObject getField6() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$minimum_time_before_sending_new_answers;
        }

        @Override
        public SubLObject getField7() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$incremental_resultsP;
        }

        @Override
        public SubLObject getField8() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$next_answer_index;
        }

        @Override
        public SubLObject getField9() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$results;
        }

        @Override
        public SubLObject getField10() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$doneP;
        }

        @Override
        public SubLObject getField11() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$last_answer_post_time;
        }

        @Override
        public SubLObject getField12() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$message_queue;
        }

        @Override
        public SubLObject getField13() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference_process;
        }

        @Override
        public SubLObject getField14() {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference_death_counter;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$ipc_queue = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference_answer_process_function = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$nl_generation_properties = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$minimum_time_before_sending_new_answers = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$incremental_resultsP = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$next_answer_index = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$results = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$doneP = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$last_answer_post_time = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$message_queue = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference_process = value;
        }

        @Override
        public SubLObject setField14(final SubLObject value) {
            return inference_ipc_queue_processor.$inference_ipc_queue_processor_native.this.$inference_death_counter = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.inference_ipc_queue_processor.$inference_ipc_queue_processor_native.class, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR, inference_ipc_queue_processor.INFERENCE_IPC_QUEUE_PROCESSOR_P, inference_ipc_queue_processor.$list8, inference_ipc_queue_processor.$list9, new String[]{ "$inference", "$ipc_queue", "$inference_answer_process_function", "$nl_generation_properties", "$minimum_time_before_sending_new_answers", "$incremental_resultsP", "$next_answer_index", "$results", "$doneP", "$last_answer_post_time", "$message_queue", "$inference_process", "$inference_death_counter" }, inference_ipc_queue_processor.$list10, inference_ipc_queue_processor.$list11, inference_ipc_queue_processor.PRINT_INFERENCE_IPC_QUEUE_PROCESSOR);
        }
    }

    public static final class $inference_ipc_queue_processor_p$UnaryFunction extends UnaryFunction {
        public $inference_ipc_queue_processor_p$UnaryFunction() {
            super(extractFunctionNamed("INFERENCE-IPC-QUEUE-PROCESSOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_ipc_queue_processor.inference_ipc_queue_processor_p(arg1);
        }
    }
}

/**
 * Total time: 333 ms synthetic
 */
