package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.process_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_normal_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_lock$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_process$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class process_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new process_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.process_utilities";

    public static final String myFingerPrint = "d3206b44315b136b7d7dbc574558119d5f11dd2855d9e370b7805476b13a7fa7";





    // deflexical
    private static final SubLSymbol $process_form_lock$ = makeSymbol("*PROCESS-FORM-LOCK*");

    // defconstant
    public static final SubLSymbol $dtp_task$ = makeSymbol("*DTP-TASK*");

    // defconstant
    public static final SubLSymbol $dtp_thinking_task$ = makeSymbol("*DTP-THINKING-TASK*");

    // defparameter
    private static final SubLSymbol $thinking_task$ = makeSymbol("*THINKING-TASK*");

    // defconstant
    public static final SubLSymbol $dtp_ipc_queue$ = makeSymbol("*DTP-IPC-QUEUE*");

    // defparameter
    private static final SubLSymbol $ipcq_debugP$ = makeSymbol("*IPCQ-DEBUG?*");

    // deflexical
    private static final SubLSymbol $ipcq_test_items$ = makeSymbol("*IPCQ-TEST-ITEMS*");

    // defconstant
    public static final SubLSymbol $dtp_ordered_ipc_queue$ = makeSymbol("*DTP-ORDERED-IPC-QUEUE*");

    // defconstant
    private static final SubLSymbol $ordered_ipcq_empty$ = makeSymbol("*ORDERED-IPCQ-EMPTY*");

    // defparameter
    private static final SubLSymbol $ordered_ipc_current_queue_size_estimation_threshold$ = makeSymbol("*ORDERED-IPC-CURRENT-QUEUE-SIZE-ESTIMATION-THRESHOLD*");

    // defconstant
    public static final SubLSymbol $dtp_process_wrapper$ = makeSymbol("*DTP-PROCESS-WRAPPER*");



    // Internal Constants
    public static final SubLSymbol INTERRUPT_INITIAL_PROCESS = makeSymbol("INTERRUPT-INITIAL-PROCESS");

    public static final SubLList $list1 = list(makeSymbol("DEBUG-INITIAL-PROCESS"));

    public static final SubLString $$$Idle = makeString("Idle");

    public static final SubLString $$$Sleep = makeString("Sleep");

    public static final SubLString $$$wait = makeString("wait");

    public static final SubLString $$$blocked = makeString("blocked");

    public static final SubLString $$$run = makeString("run");





    private static final SubLSymbol PROCESS_NAME = makeSymbol("PROCESS-NAME");

    private static final SubLSymbol $active_processes_at_startup$ = makeSymbol("*ACTIVE-PROCESSES-AT-STARTUP*");

    private static final SubLSymbol $process_form_map$ = makeSymbol("*PROCESS-FORM-MAP*");

    private static final SubLString $$$Process_Form = makeString("Process Form");



    private static final SubLSymbol TASK_P = makeSymbol("TASK-P");

    private static final SubLList $list15 = list(makeSymbol("PROCESS"), makeSymbol("COMPLETED"));

    private static final SubLList $list16 = list(makeKeyword("PROCESS"), makeKeyword("COMPLETED"));

    private static final SubLList $list17 = list(makeSymbol("TASK-PROCESS"), makeSymbol("TASK-COMPLETED"));

    private static final SubLList $list18 = list(makeSymbol("_CSETF-TASK-PROCESS"), makeSymbol("_CSETF-TASK-COMPLETED"));



    private static final SubLSymbol TASK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list21 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TASK-P"));

    private static final SubLSymbol TASK_PROCESS = makeSymbol("TASK-PROCESS");

    private static final SubLSymbol _CSETF_TASK_PROCESS = makeSymbol("_CSETF-TASK-PROCESS");

    private static final SubLSymbol TASK_COMPLETED = makeSymbol("TASK-COMPLETED");

    private static final SubLSymbol _CSETF_TASK_COMPLETED = makeSymbol("_CSETF-TASK-COMPLETED");





    private static final SubLString $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_TASK = makeSymbol("MAKE-TASK");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TASK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TASK-METHOD");







    private static final SubLSymbol NEW_TASK_INTERNAL = makeSymbol("NEW-TASK-INTERNAL");

    private static final SubLSymbol FIND_SYMBOL = makeSymbol("FIND-SYMBOL");

    private static final SubLSymbol THINKING_TASK = makeSymbol("THINKING-TASK");

    private static final SubLSymbol THINKING_TASK_P = makeSymbol("THINKING-TASK-P");

    private static final SubLList $list41 = list(new SubLObject[]{ makeSymbol("LOCK"), makeSymbol("THREAD"), makeSymbol("NAME"), makeSymbol("STATUS"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("PROGRESS-SOFAR"), makeSymbol("PROGRESS-TOTAL"), makeSymbol("START-TIME"), makeSymbol("FINISH-TIME"), makeSymbol("RESULT"), makeSymbol("ERROR-MESSAGE"), makeSymbol("PROPERTIES") });

    private static final SubLList $list42 = list(new SubLObject[]{ makeKeyword("LOCK"), makeKeyword("THREAD"), makeKeyword("NAME"), makeKeyword("STATUS"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("PROGRESS-SOFAR"), makeKeyword("PROGRESS-TOTAL"), makeKeyword("START-TIME"), makeKeyword("FINISH-TIME"), makeKeyword("RESULT"), makeKeyword("ERROR-MESSAGE"), makeKeyword("PROPERTIES") });

    private static final SubLList $list43 = list(new SubLObject[]{ makeSymbol("T-TASK-LOCK"), makeSymbol("T-TASK-THREAD"), makeSymbol("T-TASK-NAME"), makeSymbol("T-TASK-STATUS"), makeSymbol("T-TASK-PROGRESS-MESSAGE"), makeSymbol("T-TASK-PROGRESS-SOFAR"), makeSymbol("T-TASK-PROGRESS-TOTAL"), makeSymbol("T-TASK-START-TIME"), makeSymbol("T-TASK-FINISH-TIME"), makeSymbol("T-TASK-RESULT"), makeSymbol("T-TASK-ERROR-MESSAGE"), makeSymbol("T-TASK-PROPERTIES") });

    private static final SubLList $list44 = list(new SubLObject[]{ makeSymbol("_CSETF-T-TASK-LOCK"), makeSymbol("_CSETF-T-TASK-THREAD"), makeSymbol("_CSETF-T-TASK-NAME"), makeSymbol("_CSETF-T-TASK-STATUS"), makeSymbol("_CSETF-T-TASK-PROGRESS-MESSAGE"), makeSymbol("_CSETF-T-TASK-PROGRESS-SOFAR"), makeSymbol("_CSETF-T-TASK-PROGRESS-TOTAL"), makeSymbol("_CSETF-T-TASK-START-TIME"), makeSymbol("_CSETF-T-TASK-FINISH-TIME"), makeSymbol("_CSETF-T-TASK-RESULT"), makeSymbol("_CSETF-T-TASK-ERROR-MESSAGE"), makeSymbol("_CSETF-T-TASK-PROPERTIES") });

    private static final SubLSymbol THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list46 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("THINKING-TASK-P"));

    private static final SubLSymbol T_TASK_LOCK = makeSymbol("T-TASK-LOCK");

    private static final SubLSymbol _CSETF_T_TASK_LOCK = makeSymbol("_CSETF-T-TASK-LOCK");

    private static final SubLSymbol T_TASK_THREAD = makeSymbol("T-TASK-THREAD");

    private static final SubLSymbol _CSETF_T_TASK_THREAD = makeSymbol("_CSETF-T-TASK-THREAD");

    private static final SubLSymbol T_TASK_NAME = makeSymbol("T-TASK-NAME");

    private static final SubLSymbol _CSETF_T_TASK_NAME = makeSymbol("_CSETF-T-TASK-NAME");

    private static final SubLSymbol T_TASK_STATUS = makeSymbol("T-TASK-STATUS");

    private static final SubLSymbol _CSETF_T_TASK_STATUS = makeSymbol("_CSETF-T-TASK-STATUS");

    private static final SubLSymbol T_TASK_PROGRESS_MESSAGE = makeSymbol("T-TASK-PROGRESS-MESSAGE");

    private static final SubLSymbol _CSETF_T_TASK_PROGRESS_MESSAGE = makeSymbol("_CSETF-T-TASK-PROGRESS-MESSAGE");

    private static final SubLSymbol T_TASK_PROGRESS_SOFAR = makeSymbol("T-TASK-PROGRESS-SOFAR");

    private static final SubLSymbol _CSETF_T_TASK_PROGRESS_SOFAR = makeSymbol("_CSETF-T-TASK-PROGRESS-SOFAR");

    private static final SubLSymbol T_TASK_PROGRESS_TOTAL = makeSymbol("T-TASK-PROGRESS-TOTAL");

    private static final SubLSymbol _CSETF_T_TASK_PROGRESS_TOTAL = makeSymbol("_CSETF-T-TASK-PROGRESS-TOTAL");

    private static final SubLSymbol T_TASK_START_TIME = makeSymbol("T-TASK-START-TIME");

    private static final SubLSymbol _CSETF_T_TASK_START_TIME = makeSymbol("_CSETF-T-TASK-START-TIME");

    private static final SubLSymbol T_TASK_FINISH_TIME = makeSymbol("T-TASK-FINISH-TIME");

    private static final SubLSymbol _CSETF_T_TASK_FINISH_TIME = makeSymbol("_CSETF-T-TASK-FINISH-TIME");

    private static final SubLSymbol T_TASK_RESULT = makeSymbol("T-TASK-RESULT");

    private static final SubLSymbol _CSETF_T_TASK_RESULT = makeSymbol("_CSETF-T-TASK-RESULT");

    private static final SubLSymbol T_TASK_ERROR_MESSAGE = makeSymbol("T-TASK-ERROR-MESSAGE");

    private static final SubLSymbol _CSETF_T_TASK_ERROR_MESSAGE = makeSymbol("_CSETF-T-TASK-ERROR-MESSAGE");

    private static final SubLSymbol T_TASK_PROPERTIES = makeSymbol("T-TASK-PROPERTIES");

    private static final SubLSymbol _CSETF_T_TASK_PROPERTIES = makeSymbol("_CSETF-T-TASK-PROPERTIES");

























    private static final SubLSymbol MAKE_THINKING_TASK = makeSymbol("MAKE-THINKING-TASK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_THINKING_TASK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-THINKING-TASK-METHOD");







    private static final SubLList $list88 = list(list(makeSymbol("THINKING")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym89$LOCK = makeUninternedSymbol("LOCK");



    private static final SubLSymbol THINKING_LOCK = makeSymbol("THINKING-LOCK");











    private static final SubLSymbol THINKING_THREAD_RUN = makeSymbol("THINKING-THREAD-RUN");





    private static final SubLString $$$CYC = makeString("CYC");





    private static final SubLString $str103$Function__A_in_thread__A_terminat = makeString("Function ~A in thread ~A terminated by uncaught THROW.");





    private static final SubLSymbol IPC_QUEUE = makeSymbol("IPC-QUEUE");

    private static final SubLSymbol IPC_QUEUE_P = makeSymbol("IPC-QUEUE-P");

    private static final SubLList $list108 = list(makeSymbol("LOCK"), makeSymbol("SEMAPHORE"), makeSymbol("DATA-QUEUE"));

    private static final SubLList $list109 = list(makeKeyword("LOCK"), makeKeyword("SEMAPHORE"), makeKeyword("DATA-QUEUE"));

    private static final SubLList $list110 = list(makeSymbol("IPC-QUEUE-LOCK"), makeSymbol("IPC-QUEUE-SEMAPHORE"), makeSymbol("IPC-QUEUE-DATA-QUEUE"));

    private static final SubLList $list111 = list(makeSymbol("_CSETF-IPC-QUEUE-LOCK"), makeSymbol("_CSETF-IPC-QUEUE-SEMAPHORE"), makeSymbol("_CSETF-IPC-QUEUE-DATA-QUEUE"));

    private static final SubLSymbol IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list113 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("IPC-QUEUE-P"));

    private static final SubLSymbol IPC_QUEUE_LOCK = makeSymbol("IPC-QUEUE-LOCK");

    private static final SubLSymbol _CSETF_IPC_QUEUE_LOCK = makeSymbol("_CSETF-IPC-QUEUE-LOCK");

    private static final SubLSymbol IPC_QUEUE_SEMAPHORE = makeSymbol("IPC-QUEUE-SEMAPHORE");

    private static final SubLSymbol _CSETF_IPC_QUEUE_SEMAPHORE = makeSymbol("_CSETF-IPC-QUEUE-SEMAPHORE");

    private static final SubLSymbol IPC_QUEUE_DATA_QUEUE = makeSymbol("IPC-QUEUE-DATA-QUEUE");

    private static final SubLSymbol _CSETF_IPC_QUEUE_DATA_QUEUE = makeSymbol("_CSETF-IPC-QUEUE-DATA-QUEUE");





    private static final SubLSymbol MAKE_IPC_QUEUE = makeSymbol("MAKE-IPC-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_IPC_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-IPC-QUEUE-METHOD");

    private static final SubLString $$$Lock_for_Queue_ = makeString("Lock for Queue ");

    private static final SubLString $str125$Waiting_to_enqueue__A = makeString("Waiting to enqueue ~A");

    private static final SubLString $str126$Enqueuing__A = makeString("Enqueuing ~A");

    private static final SubLString $str127$Enqueued__A = makeString("Enqueued ~A");

    private static final SubLString $str128$Queue_size___S = makeString("Queue size: ~S");

    private static final SubLString $str129$Waiting_for_dequeue_semaphore_ = makeString("Waiting for dequeue semaphore.");

    private static final SubLString $str130$Waiting_for_Queue_lock_to_dequeue = makeString("Waiting for Queue lock to dequeue.");

    private static final SubLString $str131$Dequeued__A = makeString("Dequeued ~A");

    private static final SubLString $str132$Unknown_error_ = makeString("Unknown error.");

    private static final SubLSymbol $sym133$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str134$____D___A___A___Q___D_S___D__ = makeString("~&[~D] ~A (~A): Q: ~D S: ~D~%");

    private static final SubLString $str135$We_are_out_of_sync_on_either_the_ = makeString("We are out of sync on either the queue ~D or the semaphore ~D.");

    private static final SubLString $str136$____D___A___A____A__ = makeString("~&[~D] ~A (~A): ~A~%");





    private static final SubLString $str139$Dequeueing__up_to___D_item__P_ = makeString("Dequeueing (up to) ~D item~:P.");

    private static final SubLFloat $float$0_01 = makeDouble(0.01);

    private static final SubLList $list141 = list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER);

    private static final SubLString $$$IPCQ_Test_Producer = makeString("IPCQ Test Producer");

    private static final SubLSymbol IPCQ_TEST_PRODUCER_RUN = makeSymbol("IPCQ-TEST-PRODUCER-RUN");

    private static final SubLString $$$Test_IPC_Queue = makeString("Test IPC Queue");

    private static final SubLString $str145$Expected__S__got__S = makeString("Expected ~S, got ~S");

    private static final SubLSymbol TEST_IPC_ENQUEUE_DEQUEUE = makeSymbol("TEST-IPC-ENQUEUE-DEQUEUE");







    public static final SubLList $list150 = list(makeSymbol("IPCQ-TEST-CASES"));







    private static final SubLList $list154 = list(list(NIL, T));

    private static final SubLSymbol TEST_IPC_ENQUEUE_DRAIN = makeSymbol("TEST-IPC-ENQUEUE-DRAIN");

    private static final SubLSymbol TEST_IPC_ENQUEUE_DRAIN_DEQUEUE = makeSymbol("TEST-IPC-ENQUEUE-DRAIN-DEQUEUE");

    private static final SubLSymbol ORDERED_IPC_QUEUE = makeSymbol("ORDERED-IPC-QUEUE");

    private static final SubLSymbol ORDERED_IPC_QUEUE_P = makeSymbol("ORDERED-IPC-QUEUE-P");

    private static final SubLList $list159 = list(makeSymbol("LOCK"), makeSymbol("PRODUCER-ISG"), makeSymbol("CONSUMER-ISG"), makeSymbol("PAYLOAD"), makeSymbol("EARLY-CONSUMER-SEMAPHORE"));

    private static final SubLList $list160 = list(makeKeyword("LOCK"), makeKeyword("PRODUCER-ISG"), makeKeyword("CONSUMER-ISG"), makeKeyword("PAYLOAD"), makeKeyword("EARLY-CONSUMER-SEMAPHORE"));

    private static final SubLList $list161 = list(makeSymbol("ORDRD-IPCQ-LOCK"), makeSymbol("ORDRD-IPCQ-PRODUCER-ISG"), makeSymbol("ORDRD-IPCQ-CONSUMER-ISG"), makeSymbol("ORDRD-IPCQ-PAYLOAD"), makeSymbol("ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE"));

    private static final SubLList $list162 = list(makeSymbol("_CSETF-ORDRD-IPCQ-LOCK"), makeSymbol("_CSETF-ORDRD-IPCQ-PRODUCER-ISG"), makeSymbol("_CSETF-ORDRD-IPCQ-CONSUMER-ISG"), makeSymbol("_CSETF-ORDRD-IPCQ-PAYLOAD"), makeSymbol("_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE"));

    private static final SubLSymbol ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list164 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ORDERED-IPC-QUEUE-P"));

    private static final SubLSymbol ORDRD_IPCQ_LOCK = makeSymbol("ORDRD-IPCQ-LOCK");

    private static final SubLSymbol _CSETF_ORDRD_IPCQ_LOCK = makeSymbol("_CSETF-ORDRD-IPCQ-LOCK");

    private static final SubLSymbol ORDRD_IPCQ_PRODUCER_ISG = makeSymbol("ORDRD-IPCQ-PRODUCER-ISG");

    private static final SubLSymbol _CSETF_ORDRD_IPCQ_PRODUCER_ISG = makeSymbol("_CSETF-ORDRD-IPCQ-PRODUCER-ISG");

    private static final SubLSymbol ORDRD_IPCQ_CONSUMER_ISG = makeSymbol("ORDRD-IPCQ-CONSUMER-ISG");

    private static final SubLSymbol _CSETF_ORDRD_IPCQ_CONSUMER_ISG = makeSymbol("_CSETF-ORDRD-IPCQ-CONSUMER-ISG");

    private static final SubLSymbol ORDRD_IPCQ_PAYLOAD = makeSymbol("ORDRD-IPCQ-PAYLOAD");

    private static final SubLSymbol _CSETF_ORDRD_IPCQ_PAYLOAD = makeSymbol("_CSETF-ORDRD-IPCQ-PAYLOAD");

    private static final SubLSymbol ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE = makeSymbol("ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE");

    private static final SubLSymbol _CSETF_ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE = makeSymbol("_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE");







    private static final SubLSymbol $EARLY_CONSUMER_SEMAPHORE = makeKeyword("EARLY-CONSUMER-SEMAPHORE");

    private static final SubLSymbol MAKE_ORDERED_IPC_QUEUE = makeSymbol("MAKE-ORDERED-IPC-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ORDERED_IPC_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ORDERED-IPC-QUEUE-METHOD");

    private static final SubLString $$$empty_ordered_IPC_queue_entry = makeString("empty ordered IPC queue entry");

    private static final SubLString $$$Lock_for_Ordered_IPC_Queue_ = makeString("Lock for Ordered IPC Queue ");

    private static final SubLString $$$Ordered_IPCQ_Early_Producer = makeString("Ordered IPCQ Early Producer");

    private static final SubLString $str184$Unexpected_entry__A_in_the_payloa = makeString("Unexpected entry ~A in the payload of ordered IPC queue ~A: expected nothing or waiting process.");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLSymbol KILL_PROCESS_NAMED = makeSymbol("KILL-PROCESS-NAMED");

    private static final SubLList $list187 = list(makeSymbol("NAME"));

    private static final SubLString $str188$_param_NAME__stringp____Kills_any = makeString("@param NAME; stringp\n   Kills any process having the given process name. Note\n   that kill-process is not yet supported on Win32.");

    private static final SubLList $list189 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));

    private static final SubLList $list190 = list(NIL);

    private static final SubLSymbol PROCESS_EXHAUST_IMMEDIATELY_FN = makeSymbol("PROCESS-EXHAUST-IMMEDIATELY-FN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD");

    private static final SubLSymbol MAKE_EXHAUSTED_PROCESS = makeSymbol("MAKE-EXHAUSTED-PROCESS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD");



    private static final SubLSymbol PROCESS_WRAPPER = makeSymbol("PROCESS-WRAPPER");

    private static final SubLSymbol PROCESS_WRAPPER_P = makeSymbol("PROCESS-WRAPPER-P");

    private static final SubLList $list198 = list(makeSymbol("ID"), makeSymbol("PROCESS"), makeSymbol("STATE"), makeSymbol("LOCK"), makeSymbol("PLIST"));

    private static final SubLList $list199 = list(makeKeyword("ID"), makeKeyword("PROCESS"), makeKeyword("STATE"), makeKeyword("LOCK"), makeKeyword("PLIST"));

    private static final SubLList $list200 = list(makeSymbol("PROCESS-WRAPPER-ID"), makeSymbol("PROCESS-WRAPPER-PROCESS"), makeSymbol("PROCESS-WRAPPER-STATE"), makeSymbol("PROCESS-WRAPPER-LOCK"), makeSymbol("PROCESS-WRAPPER-PLIST"));

    private static final SubLList $list201 = list(makeSymbol("_CSETF-PROCESS-WRAPPER-ID"), makeSymbol("_CSETF-PROCESS-WRAPPER-PROCESS"), makeSymbol("_CSETF-PROCESS-WRAPPER-STATE"), makeSymbol("_CSETF-PROCESS-WRAPPER-LOCK"), makeSymbol("_CSETF-PROCESS-WRAPPER-PLIST"));

    private static final SubLSymbol PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list203 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROCESS-WRAPPER-P"));

    private static final SubLSymbol PROCESS_WRAPPER_ID = makeSymbol("PROCESS-WRAPPER-ID");

    private static final SubLSymbol _CSETF_PROCESS_WRAPPER_ID = makeSymbol("_CSETF-PROCESS-WRAPPER-ID");

    private static final SubLSymbol PROCESS_WRAPPER_PROCESS = makeSymbol("PROCESS-WRAPPER-PROCESS");

    private static final SubLSymbol _CSETF_PROCESS_WRAPPER_PROCESS = makeSymbol("_CSETF-PROCESS-WRAPPER-PROCESS");

    private static final SubLSymbol PROCESS_WRAPPER_STATE = makeSymbol("PROCESS-WRAPPER-STATE");

    private static final SubLSymbol _CSETF_PROCESS_WRAPPER_STATE = makeSymbol("_CSETF-PROCESS-WRAPPER-STATE");

    private static final SubLSymbol PROCESS_WRAPPER_LOCK = makeSymbol("PROCESS-WRAPPER-LOCK");

    private static final SubLSymbol _CSETF_PROCESS_WRAPPER_LOCK = makeSymbol("_CSETF-PROCESS-WRAPPER-LOCK");

    private static final SubLSymbol PROCESS_WRAPPER_PLIST = makeSymbol("PROCESS-WRAPPER-PLIST");

    private static final SubLSymbol _CSETF_PROCESS_WRAPPER_PLIST = makeSymbol("_CSETF-PROCESS-WRAPPER-PLIST");







    private static final SubLSymbol MAKE_PROCESS_WRAPPER = makeSymbol("MAKE-PROCESS-WRAPPER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROCESS_WRAPPER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROCESS-WRAPPER-METHOD");

    private static final SubLSymbol $process_wrapper_isg$ = makeSymbol("*PROCESS-WRAPPER-ISG*");



    private static final SubLSymbol NEW_PROCESS_WRAPPER_INT = makeSymbol("NEW-PROCESS-WRAPPER-INT");







    private static final SubLSymbol CYC_SERVER_PROCESS_FUNCALL = makeSymbol("CYC-SERVER-PROCESS-FUNCALL");



    private static final SubLSymbol CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS = makeSymbol("CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS");

    private static final SubLList $list228 = cons(makeSymbol("FUNCTION"), makeSymbol("ARGS"));

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject debug_initial_process() {
        final SubLObject initial_process = subl_promotions.initial_process();
        if (NIL != valid_process_p(initial_process)) {
            return debug_process(initial_process);
        }
        return NIL;
    }

    public static SubLObject interrupt_initial_process() {
        return debug_initial_process();
    }

    public static SubLObject process_idleP(final SubLObject process) {
        final SubLObject state = process_whostate(process);
        return makeBoolean((NIL != string_utilities.starts_with(state, $$$Idle)) || (NIL != string_utilities.starts_with(state, $$$Sleep)));
    }

    public static SubLObject process_busyP(final SubLObject process) {
        return makeBoolean((NIL != process_runningP(process)) || (NIL != process_waitingP(process)));
    }

    public static SubLObject process_waitingP(final SubLObject process) {
        final SubLObject state = process_whostate(process);
        return makeBoolean(search($$$wait, state, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isFixnum() || search($$$blocked, state, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isFixnum());
    }

    public static SubLObject process_runningP(final SubLObject process) {
        final SubLObject state = process_whostate(process);
        return search($$$run, state, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject process_suid(final SubLObject process) {
        assert NIL != processp(process) : "Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) " + process;
        SubLObject suid = NIL;
        suid = pointer(process);
        return suid;
    }

    public static SubLObject find_process_by_suid(final SubLObject suid) {
        assert NIL != integerp(suid) : "Types.integerp(suid) " + "CommonSymbols.NIL != Types.integerp(suid) " + suid;
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = all_processes();
            SubLObject process = NIL;
            process = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if (suid.numE(process_suid(process))) {
                    result = process;
                }
                csome_list_var = csome_list_var.rest();
                process = csome_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject find_process_by_name(final SubLObject name, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        return find(name, all_processes(), test, symbol_function(PROCESS_NAME), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gather_processes_by_name(final SubLObject name, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        return list_utilities.gather_all(name, all_processes(), test, symbol_function(PROCESS_NAME));
    }

    public static SubLObject active_process_at_startupP(final SubLObject v_object) {
        return makeBoolean((NIL != processp(v_object)) && (NIL != list_utilities.member_eqP(v_object, $active_processes_at_startup$.getGlobalValue())));
    }

    public static SubLObject note_active_processes_at_startup() {
        $active_processes_at_startup$.setGlobalValue(copy_list(all_processes()));
        return length($active_processes_at_startup$.getGlobalValue());
    }

    public static SubLObject process_form(final SubLObject process) {
        assert NIL != processp(process) : "Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) " + process;
        if (NIL != valid_process_p(process)) {
            return gethash_without_values(process, $process_form_map$.getGlobalValue(), NIL);
        }
        return NIL;
    }

    public static SubLObject process_note_form(final SubLObject process, final SubLObject form) {
        assert NIL != processp(process) : "Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) " + process;
        SubLObject release = NIL;
        try {
            release = seize_lock($process_form_lock$.getGlobalValue());
            if (NIL != form) {
                sethash(process, $process_form_map$.getGlobalValue(), form);
            } else {
                remhash(process, $process_form_map$.getGlobalValue());
            }
        } finally {
            if (NIL != release) {
                release_lock($process_form_lock$.getGlobalValue());
            }
        }
        return process;
    }

    public static SubLObject current_process_note_form(final SubLObject form) {
        return process_note_form(current_process(), form);
    }

    public static SubLObject current_process_clear_form() {
        if (random.random(TWENTY_INTEGER).isZero()) {
            clear_invalid_process_forms();
        }
        return current_process_note_form(NIL);
    }

    public static SubLObject clear_invalid_process_forms() {
        SubLObject invalid_processes = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($process_form_lock$.getGlobalValue());
            SubLObject process = NIL;
            SubLObject no_value = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator($process_form_map$.getGlobalValue());
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    process = getEntryKey(cdohash_entry);
                    no_value = getEntryValue(cdohash_entry);
                    if (NIL == valid_process_p(process)) {
                        invalid_processes = cons(process, invalid_processes);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            SubLObject cdolist_list_var = invalid_processes;
            SubLObject invalid_process = NIL;
            invalid_process = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                remhash(invalid_process, $process_form_map$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                invalid_process = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($process_form_lock$.getGlobalValue());
            }
        }
        return length(invalid_processes);
    }

    public static SubLObject task_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject task_p(final SubLObject v_object) {
        return v_object.getClass() == process_utilities.$task_native.class ? T : NIL;
    }

    public static SubLObject task_process(final SubLObject v_object) {
        assert NIL != task_p(v_object) : "process_utilities.task_p(v_object) " + "CommonSymbols.NIL != process_utilities.task_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject task_completed(final SubLObject v_object) {
        assert NIL != task_p(v_object) : "process_utilities.task_p(v_object) " + "CommonSymbols.NIL != process_utilities.task_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_task_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_p(v_object) : "process_utilities.task_p(v_object) " + "CommonSymbols.NIL != process_utilities.task_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_task_completed(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_p(v_object) : "process_utilities.task_p(v_object) " + "CommonSymbols.NIL != process_utilities.task_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_task(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new process_utilities.$task_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PROCESS)) {
                _csetf_task_process(v_new, current_value);
            } else
                if (pcase_var.eql($COMPLETED)) {
                    _csetf_task_completed(v_new, current_value);
                } else {
                    Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_task(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TASK, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PROCESS, task_process(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPLETED, task_completed(obj));
        funcall(visitor_fn, obj, $END, MAKE_TASK, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_task_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_task(obj, visitor_fn);
    }

    public static SubLObject new_task(final SubLObject name, final SubLObject function, SubLObject args, SubLObject a_list) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (a_list == UNPROVIDED) {
            a_list = NIL;
        }
        final SubLObject task = make_task(UNPROVIDED);
        final SubLObject symbol_list = Mapping.mapcar(symbol_function(SYMBOL_NAME), Mapping.mapcar(symbol_function(CAR), a_list));
        final SubLObject value_list = Mapping.mapcar(symbol_function(CADR), a_list);
        subl_promotions.make_process_with_args(name, symbol_function(NEW_TASK_INTERNAL), list(task, function, args, symbol_list, value_list));
        return task;
    }

    public static SubLObject new_task_internal(final SubLObject task, final SubLObject function, final SubLObject args, final SubLObject symbol_list, final SubLObject value_list) {
        try {
            final SubLObject cprogv_var = Mapping.mapcar(symbol_function(FIND_SYMBOL), symbol_list);
            final ArrayList old_values = extract_dynamic_values(cprogv_var);
            try {
                bind_dynamic_vars(cprogv_var, value_list);
                _csetf_task_process(task, current_process());
                apply(function, args);
            } finally {
                rebind_dynamic_vars(cprogv_var, old_values);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                _csetf_task_completed(task, T);
                _csetf_task_process(task, NIL);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return NIL;
    }

    public static SubLObject thinking_task_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject thinking_task_p(final SubLObject v_object) {
        return v_object.getClass() == process_utilities.$thinking_task_native.class ? T : NIL;
    }

    public static SubLObject t_task_lock(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject t_task_thread(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject t_task_name(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject t_task_status(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject t_task_progress_message(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject t_task_progress_sofar(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject t_task_progress_total(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject t_task_start_time(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject t_task_finish_time(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject t_task_result(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject t_task_error_message(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField12();
    }

    public static SubLObject t_task_properties(final SubLObject v_object) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.getField13();
    }

    public static SubLObject _csetf_t_task_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_t_task_thread(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_t_task_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_t_task_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_t_task_progress_message(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_t_task_progress_sofar(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_t_task_progress_total(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_t_task_start_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_t_task_finish_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_t_task_result(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_t_task_error_message(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_t_task_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != thinking_task_p(v_object) : "process_utilities.thinking_task_p(v_object) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(v_object) " + v_object;
        return v_object.setField13(value);
    }

    public static SubLObject make_thinking_task(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new process_utilities.$thinking_task_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_t_task_lock(v_new, current_value);
            } else
                if (pcase_var.eql($THREAD)) {
                    _csetf_t_task_thread(v_new, current_value);
                } else
                    if (pcase_var.eql($NAME)) {
                        _csetf_t_task_name(v_new, current_value);
                    } else
                        if (pcase_var.eql($STATUS)) {
                            _csetf_t_task_status(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROGRESS_MESSAGE)) {
                                _csetf_t_task_progress_message(v_new, current_value);
                            } else
                                if (pcase_var.eql($PROGRESS_SOFAR)) {
                                    _csetf_t_task_progress_sofar(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PROGRESS_TOTAL)) {
                                        _csetf_t_task_progress_total(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($START_TIME)) {
                                            _csetf_t_task_start_time(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($FINISH_TIME)) {
                                                _csetf_t_task_finish_time(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($RESULT)) {
                                                    _csetf_t_task_result(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($ERROR_MESSAGE)) {
                                                        _csetf_t_task_error_message(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($PROPERTIES)) {
                                                            _csetf_t_task_properties(v_new, current_value);
                                                        } else {
                                                            Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_thinking_task(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_THINKING_TASK, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, t_task_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $THREAD, t_task_thread(obj));
        funcall(visitor_fn, obj, $SLOT, $NAME, t_task_name(obj));
        funcall(visitor_fn, obj, $SLOT, $STATUS, t_task_status(obj));
        funcall(visitor_fn, obj, $SLOT, $PROGRESS_MESSAGE, t_task_progress_message(obj));
        funcall(visitor_fn, obj, $SLOT, $PROGRESS_SOFAR, t_task_progress_sofar(obj));
        funcall(visitor_fn, obj, $SLOT, $PROGRESS_TOTAL, t_task_progress_total(obj));
        funcall(visitor_fn, obj, $SLOT, $START_TIME, t_task_start_time(obj));
        funcall(visitor_fn, obj, $SLOT, $FINISH_TIME, t_task_finish_time(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULT, t_task_result(obj));
        funcall(visitor_fn, obj, $SLOT, $ERROR_MESSAGE, t_task_error_message(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, t_task_properties(obj));
        funcall(visitor_fn, obj, $END, MAKE_THINKING_TASK, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_thinking_task_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_thinking_task(obj, visitor_fn);
    }

    public static SubLObject new_thinking_task(final SubLObject name, final SubLObject progress_message, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        assert NIL != stringp(progress_message) : "Types.stringp(progress_message) " + "CommonSymbols.NIL != Types.stringp(progress_message) " + progress_message;
        if (((NIL != v_properties) && (!assertionsDisabledSynth)) && (NIL == list_utilities.property_list_p(v_properties))) {
            throw new AssertionError(v_properties);
        }
        final SubLObject thinking = make_thinking_task(UNPROVIDED);
        final SubLObject lock = make_lock(name);
        _csetf_t_task_progress_message(thinking, progress_message);
        _csetf_t_task_name(thinking, name);
        _csetf_t_task_lock(thinking, lock);
        _csetf_t_task_status(thinking, $NONE);
        if (NIL != v_properties) {
            _csetf_t_task_properties(thinking, v_properties);
        }
        return thinking;
    }

    public static SubLObject with_thinking_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list88);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject thinking = NIL;
        destructuring_bind_must_consp(current, datum, $list88);
        thinking = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject lock = $sym89$LOCK;
            return list(CLET, list(list(lock, list(THINKING_LOCK, thinking))), listS(WITH_LOCK_HELD, list(lock), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list88);
        return NIL;
    }

    public static SubLObject thinking_note_thread(final SubLObject thinking, final SubLObject thread) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        assert NIL != processp(thread) : "Types.processp(thread) " + "CommonSymbols.NIL != Types.processp(thread) " + thread;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_t_task_thread(thinking, thread);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static SubLObject thinking_clear_thread(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        _csetf_t_task_thread(thinking, NIL);
        return thinking;
    }

    public static SubLObject thinking_note_status(final SubLObject thinking, final SubLObject status) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        assert NIL != keywordp(status) : "Types.keywordp(status) " + "CommonSymbols.NIL != Types.keywordp(status) " + status;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_t_task_status(thinking, status);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_progress_message(final SubLObject thinking, final SubLObject message) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        assert NIL != stringp(message) : "Types.stringp(message) " + "CommonSymbols.NIL != Types.stringp(message) " + message;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_t_task_progress_message(thinking, message);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_progress_sofar(final SubLObject thinking, final SubLObject sofar) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        assert NIL != integerp(sofar) : "Types.integerp(sofar) " + "CommonSymbols.NIL != Types.integerp(sofar) " + sofar;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_t_task_progress_sofar(thinking, sofar);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_progress_total(final SubLObject thinking, final SubLObject total) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        assert NIL != integerp(total) : "Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) " + total;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_t_task_progress_total(thinking, total);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_start_time(final SubLObject thinking, final SubLObject time) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        assert NIL != numeric_date_utilities.universal_time_p(time) : "numeric_date_utilities.universal_time_p(time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(time) " + time;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_t_task_start_time(thinking, time);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_finish_time(final SubLObject thinking, final SubLObject time) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        assert NIL != numeric_date_utilities.universal_time_p(time) : "numeric_date_utilities.universal_time_p(time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(time) " + time;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_t_task_finish_time(thinking, time);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_result(final SubLObject thinking, final SubLObject result) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_t_task_result(thinking, result);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_error_message(final SubLObject thinking, final SubLObject error_message) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        assert NIL != stringp(error_message) : "Types.stringp(error_message) " + "CommonSymbols.NIL != Types.stringp(error_message) " + error_message;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_t_task_error_message(thinking, error_message);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_property(final SubLObject thinking, final SubLObject property, final SubLObject value) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        assert NIL != keywordp(property) : "Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) " + property;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_t_task_properties(thinking, putf(t_task_properties(thinking), property, value));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static SubLObject thinking_lock(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return t_task_lock(thinking);
    }

    public static SubLObject thinking_thread(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return t_task_thread(thinking);
    }

    public static SubLObject thinking_name(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return t_task_name(thinking);
    }

    public static SubLObject thinking_status(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return t_task_status(thinking);
    }

    public static SubLObject thinking_progress_message(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return t_task_progress_message(thinking);
    }

    public static SubLObject thinking_progress_sofar(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return t_task_progress_sofar(thinking);
    }

    public static SubLObject thinking_progress_total(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return t_task_progress_total(thinking);
    }

    public static SubLObject thinking_start_time(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return t_task_start_time(thinking);
    }

    public static SubLObject thinking_finish_time(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return t_task_finish_time(thinking);
    }

    public static SubLObject thinking_result(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return t_task_result(thinking);
    }

    public static SubLObject thinking_error_message(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return t_task_error_message(thinking);
    }

    public static SubLObject thinking_property(final SubLObject thinking, final SubLObject property) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        assert NIL != keywordp(property) : "Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) " + property;
        return getf(t_task_properties(thinking), property, UNPROVIDED);
    }

    public static SubLObject thinking_properties(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        return copy_list(t_task_properties(thinking));
    }

    public static SubLObject thinking_task() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $thinking_task$.getDynamicValue(thread);
    }

    public static SubLObject thinking_start(final SubLObject thinking, final SubLObject function, final SubLObject arg_list) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        assert NIL != function_spec_p(function) : "Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) " + function;
        assert NIL != listp(arg_list) : "Types.listp(arg_list) " + "CommonSymbols.NIL != Types.listp(arg_list) " + arg_list;
        SubLObject v_answer = NIL;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            SubLObject thread = thinking_thread(thinking);
            if (NIL == thread) {
                final SubLObject thread_args = list(thinking, function, arg_list);
                final SubLObject name = thinking_name(thinking);
                thread = subl_promotions.make_process_with_args(name, THINKING_THREAD_RUN, thread_args);
                thinking_note_status(thinking, $STARTED);
                v_answer = thread;
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return v_answer;
    }

    public static SubLObject thinking_stop(final SubLObject thinking) {
        assert NIL != thinking_task_p(thinking) : "process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) " + thinking;
        SubLObject v_answer = NIL;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject thread = thinking_thread(thinking);
            if (NIL != processp(thread)) {
                try {
                    if (NIL != valid_process_p(thread)) {
                        kill_process(thread);
                    }
                    v_answer = T;
                } finally {
                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL == thinking_finish_time(thinking)) {
                            thinking_note_finish_time(thinking, get_universal_time());
                        }
                        thinking_clear_thread(thinking);
                        thinking_note_status(thinking, $STOPPED);
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return v_answer;
    }

    public static SubLObject thinking_thread_run(final SubLObject thinking, final SubLObject function, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject success = NIL;
        SubLObject error_message = NIL;
        SubLObject uncaught_errorP = NIL;
        final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
        try {
            $package$.bind(find_package($$$CYC), thread);
            thinking_thread_initialize(thinking);
            try {
                uncaught_errorP = T;
                final SubLObject _prev_bind_0_$1 = $thinking_task$.currentBinding(thread);
                try {
                    $thinking_task$.bind(thinking, thread);
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                final SubLObject _prev_bind_0_$3 = Errors.$continue_cerrorP$.currentBinding(thread);
                                try {
                                    Errors.$continue_cerrorP$.bind(T, thread);
                                    thinking_note_status(thinking, $RUNNING);
                                    result = apply(function, args);
                                } finally {
                                    Errors.$continue_cerrorP$.rebind(_prev_bind_0_$3, thread);
                                }
                                success = T;
                                uncaught_errorP = NIL;
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                } finally {
                    $thinking_task$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (((NIL != uncaught_errorP) && (thinking_status(thinking) != $STOPPED)) && (NIL == error_message)) {
                        error_message = format(NIL, $str103$Function__A_in_thread__A_terminat, function, thinking_name(thinking));
                    }
                    thinking_thread_finalize(thinking, result, success, error_message);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            $package$.rebind(_prev_bind_0, thread);
        }
        return values(result, success, error_message);
    }

    public static SubLObject thinking_thread_initialize(final SubLObject thinking) {
        thinking_note_start_time(thinking, get_universal_time());
        final SubLObject thread = current_process();
        thinking_note_thread(thinking, thread);
        return thinking;
    }

    public static SubLObject thinking_thread_finalize(final SubLObject thinking, final SubLObject result, final SubLObject success, final SubLObject error_message) {
        final SubLObject stopped = (thinking_status(thinking) == $STOPPED) ? T : NIL;
        if (NIL != success) {
            thinking_note_result(thinking, result);
        } else
            if (NIL != error_message) {
                thinking_note_error_message(thinking, error_message);
            }

        thinking_note_finish_time(thinking, get_universal_time());
        thinking_clear_thread(thinking);
        if (NIL == stopped) {
            thinking_note_status(thinking, NIL != error_message ? $ERROR : $FINISHED);
        }
        return NIL;
    }

    public static SubLObject ipc_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ipc_queue_p(final SubLObject v_object) {
        return v_object.getClass() == process_utilities.$ipc_queue_native.class ? T : NIL;
    }

    public static SubLObject ipc_queue_lock(final SubLObject v_object) {
        assert NIL != ipc_queue_p(v_object) : "process_utilities.ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ipc_queue_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject ipc_queue_semaphore(final SubLObject v_object) {
        assert NIL != ipc_queue_p(v_object) : "process_utilities.ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ipc_queue_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject ipc_queue_data_queue(final SubLObject v_object) {
        assert NIL != ipc_queue_p(v_object) : "process_utilities.ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ipc_queue_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_ipc_queue_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != ipc_queue_p(v_object) : "process_utilities.ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ipc_queue_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ipc_queue_semaphore(final SubLObject v_object, final SubLObject value) {
        assert NIL != ipc_queue_p(v_object) : "process_utilities.ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ipc_queue_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ipc_queue_data_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != ipc_queue_p(v_object) : "process_utilities.ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ipc_queue_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_ipc_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new process_utilities.$ipc_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_ipc_queue_lock(v_new, current_value);
            } else
                if (pcase_var.eql($SEMAPHORE)) {
                    _csetf_ipc_queue_semaphore(v_new, current_value);
                } else
                    if (pcase_var.eql($DATA_QUEUE)) {
                        _csetf_ipc_queue_data_queue(v_new, current_value);
                    } else {
                        Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ipc_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_IPC_QUEUE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, ipc_queue_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMAPHORE, ipc_queue_semaphore(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA_QUEUE, ipc_queue_data_queue(obj));
        funcall(visitor_fn, obj, $END, MAKE_IPC_QUEUE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ipc_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ipc_queue(obj, visitor_fn);
    }

    public static SubLObject new_ipc_queue(final SubLObject name) {
        final SubLObject ipcq = make_ipc_queue(UNPROVIDED);
        final SubLObject lock_name = cconcatenate($$$Lock_for_Queue_, name);
        _csetf_ipc_queue_lock(ipcq, make_lock(lock_name));
        _csetf_ipc_queue_semaphore(ipcq, Semaphores.new_semaphore(name, ZERO_INTEGER));
        _csetf_ipc_queue_data_queue(ipcq, queues.create_queue(UNPROVIDED));
        return ipcq;
    }

    public static SubLObject ipc_enqueue(final SubLObject item, final SubLObject ipc_queue, SubLObject debugP) {
        if (debugP == UNPROVIDED) {
            debugP = $ipcq_debugP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lock = ipc_queue_lock(ipc_queue);
        final SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
        final SubLObject item_string = (NIL != debugP) ? string_utilities.string_first_n(TWELVE_INTEGER, princ_to_string(item)) : NIL;
        final SubLObject _prev_bind_0 = $ipcq_debugP$.currentBinding(thread);
        try {
            $ipcq_debugP$.bind(debugP, thread);
            ipcq_debug(ipc_queue, $str125$Waiting_to_enqueue__A, item_string, UNPROVIDED, UNPROVIDED);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                ipcq_debug(ipc_queue, $str126$Enqueuing__A, item_string, UNPROVIDED, UNPROVIDED);
                queues.enqueue(item, data_queue);
                if (NIL != debugP) {
                    ipcq_debug(ipc_queue, $str127$Enqueued__A, item_string, UNPROVIDED, UNPROVIDED);
                    ipcq_debug(ipc_queue, $str128$Queue_size___S, queues.queue_size(data_queue), UNPROVIDED, UNPROVIDED);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            Semaphores.semaphore_signal(ipc_queue_semaphore(ipc_queue));
            check_ipcq_synchronized(ipc_queue);
        } finally {
            $ipcq_debugP$.rebind(_prev_bind_0, thread);
        }
        return ipc_queue;
    }

    public static SubLObject ipc_dequeue(final SubLObject ipc_queue, SubLObject debugP) {
        if (debugP == UNPROVIDED) {
            debugP = $ipcq_debugP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $ipcq_debugP$.currentBinding(thread);
        try {
            $ipcq_debugP$.bind(debugP, thread);
            SubLObject result = NIL;
            SubLObject err_msg = NIL;
            check_ipcq_synchronized(ipc_queue);
            final SubLObject lock = ipc_queue_lock(ipc_queue);
            final SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
            SubLObject succeeded = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        ipcq_debug(ipc_queue, $str129$Waiting_for_dequeue_semaphore_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        Semaphores.semaphore_wait(ipc_queue_semaphore(ipc_queue));
                        succeeded = T;
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$5, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != succeeded) {
                ipcq_debug(ipc_queue, $str130$Waiting_for_Queue_lock_to_dequeue, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = queues.dequeue(data_queue);
                    if (NIL != debugP) {
                        ipcq_debug(ipc_queue, $str131$Dequeued__A, string_utilities.string_first_n(TWELVE_INTEGER, princ_to_string(result)), UNPROVIDED, UNPROVIDED);
                        ipcq_debug(ipc_queue, $str128$Queue_size___S, queues.queue_size(data_queue), UNPROVIDED, UNPROVIDED);
                        check_ipcq_synchronized(ipc_queue);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            } else
                if (NIL == err_msg) {
                    err_msg = $str132$Unknown_error_;
                }

            return values(result, err_msg);
        } finally {
            $ipcq_debugP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject check_ipcq_synchronized(final SubLObject ipc_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $ipcq_debugP$.getDynamicValue(thread)) {
            final SubLObject q_size = ipc_current_queue_size(ipc_queue);
            final SubLObject s_count = Semaphores.semaphore_current_count(ipc_queue_semaphore(ipc_queue));
            format_nil.force_format(T, $str134$____D___A___A___Q___D_S___D__, process_suid(current_process()), numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), Semaphores.semaphore_name(ipc_queue_semaphore(ipc_queue)), q_size, s_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (!q_size.numE(s_count)) {
                Errors.warn($str135$We_are_out_of_sync_on_either_the_, q_size, s_count);
            }
            return NIL;
        }
        return NIL;
    }

    public static SubLObject ipcq_debug(final SubLObject ipc_queue, final SubLObject str, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $ipcq_debugP$.getDynamicValue(thread)) {
            format_nil.force_format(T, $str136$____D___A___A____A__, process_suid(current_process()), numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), Semaphores.semaphore_name(ipc_queue_semaphore(ipc_queue)), format(NIL, str, new SubLObject[]{ arg1, arg2, arg3 }), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject ipc_dequeue_n(final SubLObject ipc_queue, SubLObject n, SubLObject debugP) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        if (debugP == UNPROVIDED) {
            debugP = $ipcq_debugP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
        assert NIL != ipc_queue_p(ipc_queue) : "process_utilities.ipc_queue_p(ipc_queue) " + "CommonSymbols.NIL != process_utilities.ipc_queue_p(ipc_queue) " + ipc_queue;
        final SubLObject _prev_bind_0 = $ipcq_debugP$.currentBinding(thread);
        try {
            $ipcq_debugP$.bind(debugP, thread);
            SubLObject count = ZERO_INTEGER;
            SubLObject result = NIL;
            ipcq_debug(ipc_queue, $str139$Dequeueing__up_to___D_item__P_, n, UNPROVIDED, UNPROVIDED);
            while (count.numL(n) && ipc_current_queue_size(ipc_queue).numG(ZERO_INTEGER)) {
                result = cons(ipc_dequeue(ipc_queue, debugP), result);
                count = add(count, ONE_INTEGER);
            } 
            return nreverse(result);
        } finally {
            $ipcq_debugP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject ipc_drain(final SubLObject ipc_queue, SubLObject debugP) {
        if (debugP == UNPROVIDED) {
            debugP = $ipcq_debugP$.getDynamicValue();
        }
        return ipc_dequeue_n(ipc_queue, ipc_current_queue_size(ipc_queue), debugP);
    }

    public static SubLObject ipc_dequeue_with_timeout(final SubLObject ipc_queue, final SubLObject timeout_secs, SubLObject wait_slice) {
        if (wait_slice == UNPROVIDED) {
            wait_slice = $float$0_01;
        }
        final SubLObject timeout_realtime = numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time(timeout_secs);
        final SubLObject final_time = add(timeout_realtime, get_internal_real_time());
        while (get_internal_real_time().numL(final_time)) {
            if (ipc_current_queue_size(ipc_queue).isPositive()) {
                return values(ipc_dequeue(ipc_queue, UNPROVIDED), NIL);
            }
            sleep(wait_slice);
        } 
        return values(NIL, T);
    }

    public static SubLObject ipc_current_queue_size(final SubLObject ipc_queue) {
        SubLObject result = NIL;
        SubLObject time_stamp = NIL;
        final SubLObject lock = ipc_queue_lock(ipc_queue);
        final SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            time_stamp = get_universal_time();
            result = queues.queue_size(data_queue);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return values(result, time_stamp);
    }

    public static SubLObject ipc_current_queue_content(final SubLObject ipc_queue) {
        SubLObject result = NIL;
        SubLObject time_stamp = NIL;
        final SubLObject lock = ipc_queue_lock(ipc_queue);
        final SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            time_stamp = get_universal_time();
            result = queues.queue_elements(data_queue);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return values(result, time_stamp);
    }

    public static SubLObject launch_ipcq_test_producer(final SubLObject ipc_queue, SubLObject delay) {
        if (delay == UNPROVIDED) {
            delay = ZERO_INTEGER;
        }
        return make_cyc_server_process_with_args($$$IPCQ_Test_Producer, IPCQ_TEST_PRODUCER_RUN, list(ipc_queue, delay));
    }

    public static SubLObject ipcq_test_producer_run(final SubLObject ipc_queue, SubLObject delay) {
        if (delay == UNPROVIDED) {
            delay = ZERO_INTEGER;
        }
        sleep(delay);
        SubLObject cdolist_list_var = $ipcq_test_items$.getGlobalValue();
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ipc_enqueue(item, ipc_queue, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject test_ipc_enqueue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ipc_queue = new_ipc_queue($$$Test_IPC_Queue);
        launch_ipcq_test_producer(ipc_queue, UNPROVIDED);
        SubLObject cdolist_list_var = $ipcq_test_items$.getGlobalValue();
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject result = ipc_dequeue(ipc_queue, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!item.equal(result))) {
                Errors.error($str145$Expected__S__got__S, item, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject test_ipc_enqueue_drain() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ipc_queue = new_ipc_queue($$$Test_IPC_Queue);
        launch_ipcq_test_producer(ipc_queue, UNPROVIDED);
        while (!length($ipcq_test_items$.getGlobalValue()).equal(ipc_current_queue_size(ipc_queue))) {
            sleep(ONE_INTEGER);
        } 
        final SubLObject result = ipc_drain(ipc_queue, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$ipcq_test_items$.getGlobalValue().equal(result))) {
            Errors.error($str145$Expected__S__got__S, $ipcq_test_items$.getGlobalValue(), result);
        }
        return T;
    }

    public static SubLObject test_ipc_enqueue_drain_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ipc_queue = new_ipc_queue($$$Test_IPC_Queue);
        launch_ipcq_test_producer(ipc_queue, UNPROVIDED);
        while (!length($ipcq_test_items$.getGlobalValue()).equal(ipc_current_queue_size(ipc_queue))) {
            sleep(ONE_INTEGER);
        } 
        ipc_drain(ipc_queue, UNPROVIDED);
        launch_ipcq_test_producer(ipc_queue, TWO_INTEGER);
        final SubLObject expected = $ipcq_test_items$.getGlobalValue().first();
        final SubLObject actual = ipc_dequeue(ipc_queue, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected.equal(actual))) {
            Errors.error($str145$Expected__S__got__S, expected, actual);
        }
        return T;
    }

    public static SubLObject ordered_ipc_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ordered_ipc_queue_p(final SubLObject v_object) {
        return v_object.getClass() == process_utilities.$ordered_ipc_queue_native.class ? T : NIL;
    }

    public static SubLObject ordrd_ipcq_lock(final SubLObject v_object) {
        assert NIL != ordered_ipc_queue_p(v_object) : "process_utilities.ordered_ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject ordrd_ipcq_producer_isg(final SubLObject v_object) {
        assert NIL != ordered_ipc_queue_p(v_object) : "process_utilities.ordered_ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject ordrd_ipcq_consumer_isg(final SubLObject v_object) {
        assert NIL != ordered_ipc_queue_p(v_object) : "process_utilities.ordered_ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject ordrd_ipcq_payload(final SubLObject v_object) {
        assert NIL != ordered_ipc_queue_p(v_object) : "process_utilities.ordered_ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject ordrd_ipcq_early_consumer_semaphore(final SubLObject v_object) {
        assert NIL != ordered_ipc_queue_p(v_object) : "process_utilities.ordered_ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_ordrd_ipcq_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != ordered_ipc_queue_p(v_object) : "process_utilities.ordered_ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ordrd_ipcq_producer_isg(final SubLObject v_object, final SubLObject value) {
        assert NIL != ordered_ipc_queue_p(v_object) : "process_utilities.ordered_ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ordrd_ipcq_consumer_isg(final SubLObject v_object, final SubLObject value) {
        assert NIL != ordered_ipc_queue_p(v_object) : "process_utilities.ordered_ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ordrd_ipcq_payload(final SubLObject v_object, final SubLObject value) {
        assert NIL != ordered_ipc_queue_p(v_object) : "process_utilities.ordered_ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ordrd_ipcq_early_consumer_semaphore(final SubLObject v_object, final SubLObject value) {
        assert NIL != ordered_ipc_queue_p(v_object) : "process_utilities.ordered_ipc_queue_p(v_object) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_ordered_ipc_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new process_utilities.$ordered_ipc_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_ordrd_ipcq_lock(v_new, current_value);
            } else
                if (pcase_var.eql($PRODUCER_ISG)) {
                    _csetf_ordrd_ipcq_producer_isg(v_new, current_value);
                } else
                    if (pcase_var.eql($CONSUMER_ISG)) {
                        _csetf_ordrd_ipcq_consumer_isg(v_new, current_value);
                    } else
                        if (pcase_var.eql($PAYLOAD)) {
                            _csetf_ordrd_ipcq_payload(v_new, current_value);
                        } else
                            if (pcase_var.eql($EARLY_CONSUMER_SEMAPHORE)) {
                                _csetf_ordrd_ipcq_early_consumer_semaphore(v_new, current_value);
                            } else {
                                Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ordered_ipc_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ORDERED_IPC_QUEUE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, ordrd_ipcq_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $PRODUCER_ISG, ordrd_ipcq_producer_isg(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSUMER_ISG, ordrd_ipcq_consumer_isg(obj));
        funcall(visitor_fn, obj, $SLOT, $PAYLOAD, ordrd_ipcq_payload(obj));
        funcall(visitor_fn, obj, $SLOT, $EARLY_CONSUMER_SEMAPHORE, ordrd_ipcq_early_consumer_semaphore(obj));
        funcall(visitor_fn, obj, $END, MAKE_ORDERED_IPC_QUEUE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ordered_ipc_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ordered_ipc_queue(obj, visitor_fn);
    }

    public static SubLObject new_ordered_ipc_queue(final SubLObject name, SubLObject size_limit) {
        if (size_limit == UNPROVIDED) {
            size_limit = NIL;
        }
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        final SubLObject o_ipcq = make_ordered_ipc_queue(UNPROVIDED);
        final SubLObject lock_name = cconcatenate($$$Lock_for_Ordered_IPC_Queue_, name);
        _csetf_ordrd_ipcq_lock(o_ipcq, make_lock(lock_name));
        _csetf_ordrd_ipcq_producer_isg(o_ipcq, integer_sequence_generator.new_integer_sequence_generator(ZERO_INTEGER, size_limit, UNPROVIDED));
        _csetf_ordrd_ipcq_consumer_isg(o_ipcq, integer_sequence_generator.new_integer_sequence_generator(ZERO_INTEGER, size_limit, UNPROVIDED));
        _csetf_ordrd_ipcq_payload(o_ipcq, dictionary_utilities.new_synchronized_dictionary(UNPROVIDED, UNPROVIDED));
        _csetf_ordrd_ipcq_early_consumer_semaphore(o_ipcq, Semaphores.new_semaphore($$$Ordered_IPCQ_Early_Producer, ZERO_INTEGER));
        return o_ipcq;
    }

    public static SubLObject ordered_ipc_enqueue(final SubLObject item, final SubLObject o_ipcq) {
        assert NIL != ordered_ipc_queue_p(o_ipcq) : "process_utilities.ordered_ipc_queue_p(o_ipcq) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) " + o_ipcq;
        final SubLObject ticket = integer_sequence_generator.integer_sequence_generator_next(ordrd_ipcq_producer_isg(o_ipcq));
        final SubLObject lock = ordrd_ipcq_lock(o_ipcq);
        final SubLObject payload = ordrd_ipcq_payload(o_ipcq);
        SubLObject awoke_someoneP = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject entry = map_utilities.map_get(payload, ticket, $ordered_ipcq_empty$.getGlobalValue());
            map_utilities.map_put(payload, ticket, item);
            if ($ordered_ipcq_empty$.getGlobalValue().eql(entry)) {
                awoke_someoneP = NIL;
            } else
                if (NIL != valid_process_p(entry)) {
                    Semaphores.semaphore_signal(ordrd_ipcq_early_consumer_semaphore(o_ipcq));
                    awoke_someoneP = T;
                } else
                    if (NIL != processp(entry)) {
                        awoke_someoneP = ordered_ipc_enqueue(item, o_ipcq);
                    } else {
                        Errors.error($str184$Unexpected_entry__A_in_the_payloa, entry, o_ipcq);
                    }


        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return awoke_someoneP;
    }

    public static SubLObject ordered_ipc_dequeue(final SubLObject o_ipcq) {
        assert NIL != ordered_ipc_queue_p(o_ipcq) : "process_utilities.ordered_ipc_queue_p(o_ipcq) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) " + o_ipcq;
        final SubLObject ticket = integer_sequence_generator.integer_sequence_generator_next(ordrd_ipcq_consumer_isg(o_ipcq));
        final SubLObject lock = ordrd_ipcq_lock(o_ipcq);
        final SubLObject payload = ordrd_ipcq_payload(o_ipcq);
        SubLObject entry = $ordered_ipcq_empty$.getGlobalValue();
        while ($ordered_ipcq_empty$.getGlobalValue().eql(entry)) {
            SubLObject earlyP = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                entry = map_utilities.map_get_without_values(payload, ticket, $ordered_ipcq_empty$.getGlobalValue());
                if ($ordered_ipcq_empty$.getGlobalValue().eql(entry)) {
                    map_utilities.map_put(payload, ticket, current_process());
                    earlyP = T;
                } else {
                    map_utilities.map_remove(payload, ticket);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (NIL != earlyP) {
                Semaphores.semaphore_wait(ordrd_ipcq_early_consumer_semaphore(o_ipcq));
            }
        } 
        return entry;
    }

    public static SubLObject ordered_ipc_queue_emptyP(final SubLObject o_ipcq) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator_var = map_utilities.new_map_iterator(ordrd_ipcq_payload(o_ipcq));
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject entry = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                final SubLObject value = second(entry);
                if (NIL == processp(value)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject ordered_ipc_current_queue_size(final SubLObject o_ipcq, SubLObject estimation_threshold) {
        if (estimation_threshold == UNPROVIDED) {
            estimation_threshold = $ordered_ipc_current_queue_size_estimation_threshold$.getDynamicValue();
        }
        assert NIL != ordered_ipc_queue_p(o_ipcq) : "process_utilities.ordered_ipc_queue_p(o_ipcq) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) " + o_ipcq;
        SubLObject estimate = subtract(integer_sequence_generator.get_integer_sequence_generator_recent(ordrd_ipcq_producer_isg(o_ipcq)), integer_sequence_generator.get_integer_sequence_generator_recent(ordrd_ipcq_consumer_isg(o_ipcq)));
        if ((!estimate.eql(ZERO_INTEGER)) || (NIL == ordered_ipc_queue_emptyP(o_ipcq))) {
            estimate = add(estimate, ONE_INTEGER);
        }
        return estimate.numG(estimation_threshold) ? estimate : length(ordered_ipc_current_queue_contents(o_ipcq));
    }

    public static SubLObject ordered_ipc_current_queue_contents(final SubLObject o_ipcq) {
        assert NIL != ordered_ipc_queue_p(o_ipcq) : "process_utilities.ordered_ipc_queue_p(o_ipcq) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) " + o_ipcq;
        return remove_if(PROCESSP, map_utilities.map_values(ordrd_ipcq_payload(o_ipcq)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ordered_ipc_queue_quiescedP(final SubLObject o_ipcq) {
        return map_utilities.map_empty_p(ordrd_ipcq_payload(o_ipcq));
    }

    public static SubLObject kill_process_named(final SubLObject name) {
        SubLTrampolineFile.enforceType(name, STRINGP);
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject process_name = process_name(process);
            if (NIL != Strings.stringE(name, process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                kill_process(process);
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject process_named(final SubLObject name) {
        assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject process_name = process_name(process);
            if (NIL != Strings.stringE(name, process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return process;
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject process_exhaust_immediately_fn() {
        return NIL;
    }

    public static SubLObject make_exhausted_process(final SubLObject name) {
        return make_process(name, PROCESS_EXHAUST_IMMEDIATELY_FN);
    }

    public static SubLObject visit_defstruct_object_process_method(final SubLObject v_object, final SubLObject visitor_fn) {
        return visit_defstruct_object_process(v_object, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_process(final SubLObject process, final SubLObject visitor_fn) {
        funcall(visitor_fn, process, $BEGIN, MAKE_EXHAUSTED_PROCESS, ONE_INTEGER);
        funcall(visitor_fn, process, $SLOT, $NAME, process_name(process));
        funcall(visitor_fn, process, $END, MAKE_EXHAUSTED_PROCESS, ONE_INTEGER);
        return process;
    }

    public static SubLObject visit_defstruct_object_lock_method(final SubLObject v_object, final SubLObject visitor_fn) {
        return visit_defstruct_object_lock(v_object, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_lock(final SubLObject lock, final SubLObject visitor_fn) {
        funcall(visitor_fn, lock, $BEGIN, MAKE_LOCK, ONE_INTEGER);
        funcall(visitor_fn, lock, $SLOT, $NAME, lock_name(lock));
        funcall(visitor_fn, lock, $END, MAKE_LOCK, ONE_INTEGER);
        return lock;
    }

    public static SubLObject process_wrapper_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject process_wrapper_p(final SubLObject v_object) {
        return v_object.getClass() == process_utilities.$process_wrapper_native.class ? T : NIL;
    }

    public static SubLObject process_wrapper_id(final SubLObject v_object) {
        assert NIL != process_wrapper_p(v_object) : "process_utilities.process_wrapper_p(v_object) " + "CommonSymbols.NIL != process_utilities.process_wrapper_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject process_wrapper_process(final SubLObject v_object) {
        assert NIL != process_wrapper_p(v_object) : "process_utilities.process_wrapper_p(v_object) " + "CommonSymbols.NIL != process_utilities.process_wrapper_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject process_wrapper_state(final SubLObject v_object) {
        assert NIL != process_wrapper_p(v_object) : "process_utilities.process_wrapper_p(v_object) " + "CommonSymbols.NIL != process_utilities.process_wrapper_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject process_wrapper_lock(final SubLObject v_object) {
        assert NIL != process_wrapper_p(v_object) : "process_utilities.process_wrapper_p(v_object) " + "CommonSymbols.NIL != process_utilities.process_wrapper_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject process_wrapper_plist(final SubLObject v_object) {
        assert NIL != process_wrapper_p(v_object) : "process_utilities.process_wrapper_p(v_object) " + "CommonSymbols.NIL != process_utilities.process_wrapper_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_process_wrapper_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_wrapper_p(v_object) : "process_utilities.process_wrapper_p(v_object) " + "CommonSymbols.NIL != process_utilities.process_wrapper_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_process_wrapper_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_wrapper_p(v_object) : "process_utilities.process_wrapper_p(v_object) " + "CommonSymbols.NIL != process_utilities.process_wrapper_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_process_wrapper_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_wrapper_p(v_object) : "process_utilities.process_wrapper_p(v_object) " + "CommonSymbols.NIL != process_utilities.process_wrapper_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_process_wrapper_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_wrapper_p(v_object) : "process_utilities.process_wrapper_p(v_object) " + "CommonSymbols.NIL != process_utilities.process_wrapper_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_process_wrapper_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_wrapper_p(v_object) : "process_utilities.process_wrapper_p(v_object) " + "CommonSymbols.NIL != process_utilities.process_wrapper_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_process_wrapper(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new process_utilities.$process_wrapper_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_process_wrapper_id(v_new, current_value);
            } else
                if (pcase_var.eql($PROCESS)) {
                    _csetf_process_wrapper_process(v_new, current_value);
                } else
                    if (pcase_var.eql($STATE)) {
                        _csetf_process_wrapper_state(v_new, current_value);
                    } else
                        if (pcase_var.eql($LOCK)) {
                            _csetf_process_wrapper_lock(v_new, current_value);
                        } else
                            if (pcase_var.eql($PLIST)) {
                                _csetf_process_wrapper_plist(v_new, current_value);
                            } else {
                                Errors.error($str28$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_process_wrapper(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PROCESS_WRAPPER, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, process_wrapper_id(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESS, process_wrapper_process(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, process_wrapper_state(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, process_wrapper_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, process_wrapper_plist(obj));
        funcall(visitor_fn, obj, $END, MAKE_PROCESS_WRAPPER, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_process_wrapper_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_process_wrapper(obj, visitor_fn);
    }

    public static SubLObject new_process_wrapper(final SubLObject name, final SubLObject process_wrapper_function, SubLObject rest_args) {
        if (rest_args == UNPROVIDED) {
            rest_args = NIL;
        }
        final SubLObject process_lock = make_lock(name);
        SubLObject process_wrapper = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(process_lock);
            process_wrapper = make_process_wrapper(list($LOCK, process_lock, $STATE, $STARTING, $ID, integer_sequence_generator.integer_sequence_generator_next($process_wrapper_isg$.getGlobalValue())));
            final SubLObject process = make_cyc_server_process_with_args(name, NEW_PROCESS_WRAPPER_INT, list(process_wrapper, process_wrapper_function, rest_args));
            _csetf_process_wrapper_process(process_wrapper, process);
            _csetf_process_wrapper_state(process_wrapper, $RUNNING);
        } finally {
            if (NIL != release) {
                release_lock(process_lock);
            }
        }
        return process_wrapper;
    }

    public static SubLObject new_process_wrapper_int(final SubLObject process_wrapper, final SubLObject process_wrapper_function, final SubLObject rest_args) {
        SubLObject result = NIL;
        result = apply(process_wrapper_function, cons(process_wrapper, rest_args));
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_process_wrapper_state(process_wrapper, $COMPLETED);
            _csetf_process_wrapper_process(process_wrapper, NIL);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject process_wrapper_get_id(final SubLObject process_wrapper) {
        return process_wrapper_id(process_wrapper);
    }

    public static SubLObject process_wrapper_get_process(final SubLObject process_wrapper) {
        return process_wrapper_process(process_wrapper);
    }

    public static SubLObject process_wrapper_get_state(final SubLObject process_wrapper) {
        return process_wrapper_state(process_wrapper);
    }

    public static SubLObject process_wrapper_get_lock(final SubLObject process_wrapper) {
        return process_wrapper_lock(process_wrapper);
    }

    public static SubLObject process_wrapper_get_plist(final SubLObject process_wrapper) {
        return copy_list(process_wrapper_plist(process_wrapper));
    }

    public static SubLObject process_wrapper_process_startingP(final SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $STARTING);
    }

    public static SubLObject process_wrapper_process_runningP(final SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $RUNNING);
    }

    public static SubLObject process_wrapper_process_completedP(final SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $COMPLETED);
    }

    public static SubLObject process_wrapper_process_abortedP(final SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $ABORTED);
    }

    public static SubLObject process_wrapper_process_pausingP(final SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $PAUSING);
    }

    public static SubLObject process_wrapper_process_pausedP(final SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $PAUSED);
    }

    public static SubLObject process_wrapper_process_pause(final SubLObject process_wrapper) {
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        final SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject pcase_var = process_wrapper_state(process_wrapper);
            if (pcase_var.eql($RUNNING)) {
                _csetf_process_wrapper_state(process_wrapper, $PAUSING);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject process_wrapper_process_resume(final SubLObject process_wrapper) {
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        final SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject pcase_var = process_wrapper_state(process_wrapper);
            if (pcase_var.eql($PAUSING)) {
                _csetf_process_wrapper_state(process_wrapper, $RUNNING);
            } else
                if (pcase_var.eql($PAUSED)) {
                    process_unblock(process_wrapper_process(process_wrapper));
                    _csetf_process_wrapper_state(process_wrapper, $RUNNING);
                }

        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject process_wrapper_checkpoint(final SubLObject process_wrapper) {
        if (current_process().eql(process_wrapper_process(process_wrapper))) {
            final SubLObject lock = process_wrapper_lock(process_wrapper);
            SubLObject blockP = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                final SubLObject pcase_var = process_wrapper_state(process_wrapper);
                if (pcase_var.eql($PAUSING)) {
                    _csetf_process_wrapper_state(process_wrapper, $PAUSED);
                    blockP = T;
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (NIL != blockP) {
                process_block();
            }
        }
        return NIL;
    }

    public static SubLObject process_wrapper_block(final SubLObject process_wrapper) {
        if (current_process().eql(process_wrapper_process(process_wrapper))) {
            final SubLObject lock = process_wrapper_lock(process_wrapper);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_process_wrapper_state(process_wrapper, $PAUSED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            process_block();
            return NIL;
        }
        return NIL;
    }

    public static SubLObject process_wrapper_process_abort(final SubLObject process_wrapper) {
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        final SubLObject release_lock_then_killP = eq(current_process(), process_wrapper_process(process_wrapper));
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            _csetf_process_wrapper_state(process_wrapper, $ABORTED);
            if (NIL == release_lock_then_killP) {
                result = kill_process(process_wrapper_process(process_wrapper));
                _csetf_process_wrapper_process(process_wrapper, NIL);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        if (NIL != release_lock_then_killP) {
            result = kill_process(process_wrapper_process(process_wrapper));
            _csetf_process_wrapper_process(process_wrapper, NIL);
        }
        return result;
    }

    public static SubLObject process_wrapper_set_property(final SubLObject process_wrapper, final SubLObject indicator, final SubLObject value) {
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject plist = process_wrapper_plist(process_wrapper);
            result = putf(plist, indicator, value);
            _csetf_process_wrapper_plist(process_wrapper, result);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject process_wrapper_get_property(final SubLObject process_wrapper, final SubLObject indicator, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            result = getf(process_wrapper_plist(process_wrapper), indicator, default_value);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static SubLObject make_cyc_server_process(final SubLObject name, final SubLObject function) {
        return subl_promotions.make_process_with_args(name, CYC_SERVER_PROCESS_FUNCALL, list(function));
    }

    public static SubLObject cyc_server_process_funcall(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $read_eval$.currentBinding(thread);
        try {
            $package$.bind(find_package($$$CYC), thread);
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            $print_readably$.bind(NIL, thread);
            $read_eval$.bind(NIL, thread);
            final SubLObject old_priority = process_priority(current_process());
            try {
                set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                return funcall(function);
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_process_priority(current_process(), old_priority);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            $read_eval$.rebind(_prev_bind_4, thread);
            $print_readably$.rebind(_prev_bind_3, thread);
            $read_default_float_format$.rebind(_prev_bind_2, thread);
            $package$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject make_cyc_server_process_with_args(final SubLObject name, final SubLObject function, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return subl_promotions.make_process_with_args(name, CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS, list(cons(function, args)));
    }

    public static SubLObject cyc_server_process_funcall_with_args(final SubLObject functionXargs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject function = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(functionXargs, functionXargs, $list228);
        function = functionXargs.first();
        final SubLObject current = args = functionXargs.rest();
        final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $read_eval$.currentBinding(thread);
        try {
            $package$.bind(find_package($$$CYC), thread);
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            $print_readably$.bind(NIL, thread);
            $read_eval$.bind(NIL, thread);
            final SubLObject old_priority = process_priority(current_process());
            try {
                set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                return apply(function, args);
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_process_priority(current_process(), old_priority);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            $read_eval$.rebind(_prev_bind_4, thread);
            $print_readably$.rebind(_prev_bind_3, thread);
            $read_default_float_format$.rebind(_prev_bind_2, thread);
            $package$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject process_count() {
        return length(all_processes());
    }

    public static SubLObject declare_process_utilities_file() {
        declareFunction(me, "debug_initial_process", "DEBUG-INITIAL-PROCESS", 0, 0, false);
        declareFunction(me, "interrupt_initial_process", "INTERRUPT-INITIAL-PROCESS", 0, 0, false);
        declareFunction(me, "process_idleP", "PROCESS-IDLE?", 1, 0, false);
        declareFunction(me, "process_busyP", "PROCESS-BUSY?", 1, 0, false);
        declareFunction(me, "process_waitingP", "PROCESS-WAITING?", 1, 0, false);
        declareFunction(me, "process_runningP", "PROCESS-RUNNING?", 1, 0, false);
        declareFunction(me, "process_suid", "PROCESS-SUID", 1, 0, false);
        declareFunction(me, "find_process_by_suid", "FIND-PROCESS-BY-SUID", 1, 0, false);
        declareFunction(me, "find_process_by_name", "FIND-PROCESS-BY-NAME", 1, 1, false);
        declareFunction(me, "gather_processes_by_name", "GATHER-PROCESSES-BY-NAME", 1, 1, false);
        declareFunction(me, "active_process_at_startupP", "ACTIVE-PROCESS-AT-STARTUP?", 1, 0, false);
        declareFunction(me, "note_active_processes_at_startup", "NOTE-ACTIVE-PROCESSES-AT-STARTUP", 0, 0, false);
        declareFunction(me, "process_form", "PROCESS-FORM", 1, 0, false);
        declareFunction(me, "process_note_form", "PROCESS-NOTE-FORM", 2, 0, false);
        declareFunction(me, "current_process_note_form", "CURRENT-PROCESS-NOTE-FORM", 1, 0, false);
        declareFunction(me, "current_process_clear_form", "CURRENT-PROCESS-CLEAR-FORM", 0, 0, false);
        declareFunction(me, "clear_invalid_process_forms", "CLEAR-INVALID-PROCESS-FORMS", 0, 0, false);
        declareFunction(me, "task_print_function_trampoline", "TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "task_p", "TASK-P", 1, 0, false);
        new process_utilities.$task_p$UnaryFunction();
        declareFunction(me, "task_process", "TASK-PROCESS", 1, 0, false);
        declareFunction(me, "task_completed", "TASK-COMPLETED", 1, 0, false);
        declareFunction(me, "_csetf_task_process", "_CSETF-TASK-PROCESS", 2, 0, false);
        declareFunction(me, "_csetf_task_completed", "_CSETF-TASK-COMPLETED", 2, 0, false);
        declareFunction(me, "make_task", "MAKE-TASK", 0, 1, false);
        declareFunction(me, "visit_defstruct_task", "VISIT-DEFSTRUCT-TASK", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_task_method", "VISIT-DEFSTRUCT-OBJECT-TASK-METHOD", 2, 0, false);
        declareFunction(me, "new_task", "NEW-TASK", 2, 2, false);
        declareFunction(me, "new_task_internal", "NEW-TASK-INTERNAL", 5, 0, false);
        declareFunction(me, "thinking_task_print_function_trampoline", "THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "thinking_task_p", "THINKING-TASK-P", 1, 0, false);
        new process_utilities.$thinking_task_p$UnaryFunction();
        declareFunction(me, "t_task_lock", "T-TASK-LOCK", 1, 0, false);
        declareFunction(me, "t_task_thread", "T-TASK-THREAD", 1, 0, false);
        declareFunction(me, "t_task_name", "T-TASK-NAME", 1, 0, false);
        declareFunction(me, "t_task_status", "T-TASK-STATUS", 1, 0, false);
        declareFunction(me, "t_task_progress_message", "T-TASK-PROGRESS-MESSAGE", 1, 0, false);
        declareFunction(me, "t_task_progress_sofar", "T-TASK-PROGRESS-SOFAR", 1, 0, false);
        declareFunction(me, "t_task_progress_total", "T-TASK-PROGRESS-TOTAL", 1, 0, false);
        declareFunction(me, "t_task_start_time", "T-TASK-START-TIME", 1, 0, false);
        declareFunction(me, "t_task_finish_time", "T-TASK-FINISH-TIME", 1, 0, false);
        declareFunction(me, "t_task_result", "T-TASK-RESULT", 1, 0, false);
        declareFunction(me, "t_task_error_message", "T-TASK-ERROR-MESSAGE", 1, 0, false);
        declareFunction(me, "t_task_properties", "T-TASK-PROPERTIES", 1, 0, false);
        declareFunction(me, "_csetf_t_task_lock", "_CSETF-T-TASK-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_t_task_thread", "_CSETF-T-TASK-THREAD", 2, 0, false);
        declareFunction(me, "_csetf_t_task_name", "_CSETF-T-TASK-NAME", 2, 0, false);
        declareFunction(me, "_csetf_t_task_status", "_CSETF-T-TASK-STATUS", 2, 0, false);
        declareFunction(me, "_csetf_t_task_progress_message", "_CSETF-T-TASK-PROGRESS-MESSAGE", 2, 0, false);
        declareFunction(me, "_csetf_t_task_progress_sofar", "_CSETF-T-TASK-PROGRESS-SOFAR", 2, 0, false);
        declareFunction(me, "_csetf_t_task_progress_total", "_CSETF-T-TASK-PROGRESS-TOTAL", 2, 0, false);
        declareFunction(me, "_csetf_t_task_start_time", "_CSETF-T-TASK-START-TIME", 2, 0, false);
        declareFunction(me, "_csetf_t_task_finish_time", "_CSETF-T-TASK-FINISH-TIME", 2, 0, false);
        declareFunction(me, "_csetf_t_task_result", "_CSETF-T-TASK-RESULT", 2, 0, false);
        declareFunction(me, "_csetf_t_task_error_message", "_CSETF-T-TASK-ERROR-MESSAGE", 2, 0, false);
        declareFunction(me, "_csetf_t_task_properties", "_CSETF-T-TASK-PROPERTIES", 2, 0, false);
        declareFunction(me, "make_thinking_task", "MAKE-THINKING-TASK", 0, 1, false);
        declareFunction(me, "visit_defstruct_thinking_task", "VISIT-DEFSTRUCT-THINKING-TASK", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_thinking_task_method", "VISIT-DEFSTRUCT-OBJECT-THINKING-TASK-METHOD", 2, 0, false);
        declareFunction(me, "new_thinking_task", "NEW-THINKING-TASK", 2, 1, false);
        declareMacro(me, "with_thinking_lock", "WITH-THINKING-LOCK");
        declareFunction(me, "thinking_note_thread", "THINKING-NOTE-THREAD", 2, 0, false);
        declareFunction(me, "thinking_clear_thread", "THINKING-CLEAR-THREAD", 1, 0, false);
        declareFunction(me, "thinking_note_status", "THINKING-NOTE-STATUS", 2, 0, false);
        declareFunction(me, "thinking_note_progress_message", "THINKING-NOTE-PROGRESS-MESSAGE", 2, 0, false);
        declareFunction(me, "thinking_note_progress_sofar", "THINKING-NOTE-PROGRESS-SOFAR", 2, 0, false);
        declareFunction(me, "thinking_note_progress_total", "THINKING-NOTE-PROGRESS-TOTAL", 2, 0, false);
        declareFunction(me, "thinking_note_start_time", "THINKING-NOTE-START-TIME", 2, 0, false);
        declareFunction(me, "thinking_note_finish_time", "THINKING-NOTE-FINISH-TIME", 2, 0, false);
        declareFunction(me, "thinking_note_result", "THINKING-NOTE-RESULT", 2, 0, false);
        declareFunction(me, "thinking_note_error_message", "THINKING-NOTE-ERROR-MESSAGE", 2, 0, false);
        declareFunction(me, "thinking_note_property", "THINKING-NOTE-PROPERTY", 3, 0, false);
        declareFunction(me, "thinking_lock", "THINKING-LOCK", 1, 0, false);
        declareFunction(me, "thinking_thread", "THINKING-THREAD", 1, 0, false);
        declareFunction(me, "thinking_name", "THINKING-NAME", 1, 0, false);
        declareFunction(me, "thinking_status", "THINKING-STATUS", 1, 0, false);
        declareFunction(me, "thinking_progress_message", "THINKING-PROGRESS-MESSAGE", 1, 0, false);
        declareFunction(me, "thinking_progress_sofar", "THINKING-PROGRESS-SOFAR", 1, 0, false);
        declareFunction(me, "thinking_progress_total", "THINKING-PROGRESS-TOTAL", 1, 0, false);
        declareFunction(me, "thinking_start_time", "THINKING-START-TIME", 1, 0, false);
        declareFunction(me, "thinking_finish_time", "THINKING-FINISH-TIME", 1, 0, false);
        declareFunction(me, "thinking_result", "THINKING-RESULT", 1, 0, false);
        declareFunction(me, "thinking_error_message", "THINKING-ERROR-MESSAGE", 1, 0, false);
        declareFunction(me, "thinking_property", "THINKING-PROPERTY", 2, 0, false);
        declareFunction(me, "thinking_properties", "THINKING-PROPERTIES", 1, 0, false);
        declareFunction(me, "thinking_task", "THINKING-TASK", 0, 0, false);
        declareFunction(me, "thinking_start", "THINKING-START", 3, 0, false);
        declareFunction(me, "thinking_stop", "THINKING-STOP", 1, 0, false);
        declareFunction(me, "thinking_thread_run", "THINKING-THREAD-RUN", 3, 0, false);
        declareFunction(me, "thinking_thread_initialize", "THINKING-THREAD-INITIALIZE", 1, 0, false);
        declareFunction(me, "thinking_thread_finalize", "THINKING-THREAD-FINALIZE", 4, 0, false);
        declareFunction(me, "ipc_queue_print_function_trampoline", "IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "ipc_queue_p", "IPC-QUEUE-P", 1, 0, false);
        new process_utilities.$ipc_queue_p$UnaryFunction();
        declareFunction(me, "ipc_queue_lock", "IPC-QUEUE-LOCK", 1, 0, false);
        declareFunction(me, "ipc_queue_semaphore", "IPC-QUEUE-SEMAPHORE", 1, 0, false);
        declareFunction(me, "ipc_queue_data_queue", "IPC-QUEUE-DATA-QUEUE", 1, 0, false);
        declareFunction(me, "_csetf_ipc_queue_lock", "_CSETF-IPC-QUEUE-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_ipc_queue_semaphore", "_CSETF-IPC-QUEUE-SEMAPHORE", 2, 0, false);
        declareFunction(me, "_csetf_ipc_queue_data_queue", "_CSETF-IPC-QUEUE-DATA-QUEUE", 2, 0, false);
        declareFunction(me, "make_ipc_queue", "MAKE-IPC-QUEUE", 0, 1, false);
        declareFunction(me, "visit_defstruct_ipc_queue", "VISIT-DEFSTRUCT-IPC-QUEUE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_ipc_queue_method", "VISIT-DEFSTRUCT-OBJECT-IPC-QUEUE-METHOD", 2, 0, false);
        declareFunction(me, "new_ipc_queue", "NEW-IPC-QUEUE", 1, 0, false);
        declareFunction(me, "ipc_enqueue", "IPC-ENQUEUE", 2, 1, false);
        declareFunction(me, "ipc_dequeue", "IPC-DEQUEUE", 1, 1, false);
        declareFunction(me, "check_ipcq_synchronized", "CHECK-IPCQ-SYNCHRONIZED", 1, 0, false);
        declareFunction(me, "ipcq_debug", "IPCQ-DEBUG", 2, 3, false);
        declareFunction(me, "ipc_dequeue_n", "IPC-DEQUEUE-N", 1, 2, false);
        declareFunction(me, "ipc_drain", "IPC-DRAIN", 1, 1, false);
        declareFunction(me, "ipc_dequeue_with_timeout", "IPC-DEQUEUE-WITH-TIMEOUT", 2, 1, false);
        declareFunction(me, "ipc_current_queue_size", "IPC-CURRENT-QUEUE-SIZE", 1, 0, false);
        declareFunction(me, "ipc_current_queue_content", "IPC-CURRENT-QUEUE-CONTENT", 1, 0, false);
        declareFunction(me, "launch_ipcq_test_producer", "LAUNCH-IPCQ-TEST-PRODUCER", 1, 1, false);
        declareFunction(me, "ipcq_test_producer_run", "IPCQ-TEST-PRODUCER-RUN", 1, 1, false);
        declareFunction(me, "test_ipc_enqueue_dequeue", "TEST-IPC-ENQUEUE-DEQUEUE", 0, 0, false);
        declareFunction(me, "test_ipc_enqueue_drain", "TEST-IPC-ENQUEUE-DRAIN", 0, 0, false);
        declareFunction(me, "test_ipc_enqueue_drain_dequeue", "TEST-IPC-ENQUEUE-DRAIN-DEQUEUE", 0, 0, false);
        declareFunction(me, "ordered_ipc_queue_print_function_trampoline", "ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "ordered_ipc_queue_p", "ORDERED-IPC-QUEUE-P", 1, 0, false);
        new process_utilities.$ordered_ipc_queue_p$UnaryFunction();
        declareFunction(me, "ordrd_ipcq_lock", "ORDRD-IPCQ-LOCK", 1, 0, false);
        declareFunction(me, "ordrd_ipcq_producer_isg", "ORDRD-IPCQ-PRODUCER-ISG", 1, 0, false);
        declareFunction(me, "ordrd_ipcq_consumer_isg", "ORDRD-IPCQ-CONSUMER-ISG", 1, 0, false);
        declareFunction(me, "ordrd_ipcq_payload", "ORDRD-IPCQ-PAYLOAD", 1, 0, false);
        declareFunction(me, "ordrd_ipcq_early_consumer_semaphore", "ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE", 1, 0, false);
        declareFunction(me, "_csetf_ordrd_ipcq_lock", "_CSETF-ORDRD-IPCQ-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_ordrd_ipcq_producer_isg", "_CSETF-ORDRD-IPCQ-PRODUCER-ISG", 2, 0, false);
        declareFunction(me, "_csetf_ordrd_ipcq_consumer_isg", "_CSETF-ORDRD-IPCQ-CONSUMER-ISG", 2, 0, false);
        declareFunction(me, "_csetf_ordrd_ipcq_payload", "_CSETF-ORDRD-IPCQ-PAYLOAD", 2, 0, false);
        declareFunction(me, "_csetf_ordrd_ipcq_early_consumer_semaphore", "_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE", 2, 0, false);
        declareFunction(me, "make_ordered_ipc_queue", "MAKE-ORDERED-IPC-QUEUE", 0, 1, false);
        declareFunction(me, "visit_defstruct_ordered_ipc_queue", "VISIT-DEFSTRUCT-ORDERED-IPC-QUEUE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_ordered_ipc_queue_method", "VISIT-DEFSTRUCT-OBJECT-ORDERED-IPC-QUEUE-METHOD", 2, 0, false);
        declareFunction(me, "new_ordered_ipc_queue", "NEW-ORDERED-IPC-QUEUE", 1, 1, false);
        declareFunction(me, "ordered_ipc_enqueue", "ORDERED-IPC-ENQUEUE", 2, 0, false);
        declareFunction(me, "ordered_ipc_dequeue", "ORDERED-IPC-DEQUEUE", 1, 0, false);
        declareFunction(me, "ordered_ipc_queue_emptyP", "ORDERED-IPC-QUEUE-EMPTY?", 1, 0, false);
        declareFunction(me, "ordered_ipc_current_queue_size", "ORDERED-IPC-CURRENT-QUEUE-SIZE", 1, 1, false);
        declareFunction(me, "ordered_ipc_current_queue_contents", "ORDERED-IPC-CURRENT-QUEUE-CONTENTS", 1, 0, false);
        declareFunction(me, "ordered_ipc_queue_quiescedP", "ORDERED-IPC-QUEUE-QUIESCED?", 1, 0, false);
        declareFunction(me, "kill_process_named", "KILL-PROCESS-NAMED", 1, 0, false);
        declareFunction(me, "process_named", "PROCESS-NAMED", 1, 0, false);
        declareFunction(me, "process_exhaust_immediately_fn", "PROCESS-EXHAUST-IMMEDIATELY-FN", 0, 0, false);
        declareFunction(me, "make_exhausted_process", "MAKE-EXHAUSTED-PROCESS", 1, 0, false);
        declareFunction(me, "visit_defstruct_object_process_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_process", "VISIT-DEFSTRUCT-OBJECT-PROCESS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_lock_method", "VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_lock", "VISIT-DEFSTRUCT-OBJECT-LOCK", 2, 0, false);
        declareFunction(me, "process_wrapper_print_function_trampoline", "PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "process_wrapper_p", "PROCESS-WRAPPER-P", 1, 0, false);
        new process_utilities.$process_wrapper_p$UnaryFunction();
        declareFunction(me, "process_wrapper_id", "PROCESS-WRAPPER-ID", 1, 0, false);
        declareFunction(me, "process_wrapper_process", "PROCESS-WRAPPER-PROCESS", 1, 0, false);
        declareFunction(me, "process_wrapper_state", "PROCESS-WRAPPER-STATE", 1, 0, false);
        declareFunction(me, "process_wrapper_lock", "PROCESS-WRAPPER-LOCK", 1, 0, false);
        declareFunction(me, "process_wrapper_plist", "PROCESS-WRAPPER-PLIST", 1, 0, false);
        declareFunction(me, "_csetf_process_wrapper_id", "_CSETF-PROCESS-WRAPPER-ID", 2, 0, false);
        declareFunction(me, "_csetf_process_wrapper_process", "_CSETF-PROCESS-WRAPPER-PROCESS", 2, 0, false);
        declareFunction(me, "_csetf_process_wrapper_state", "_CSETF-PROCESS-WRAPPER-STATE", 2, 0, false);
        declareFunction(me, "_csetf_process_wrapper_lock", "_CSETF-PROCESS-WRAPPER-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_process_wrapper_plist", "_CSETF-PROCESS-WRAPPER-PLIST", 2, 0, false);
        declareFunction(me, "make_process_wrapper", "MAKE-PROCESS-WRAPPER", 0, 1, false);
        declareFunction(me, "visit_defstruct_process_wrapper", "VISIT-DEFSTRUCT-PROCESS-WRAPPER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_process_wrapper_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-WRAPPER-METHOD", 2, 0, false);
        declareFunction(me, "new_process_wrapper", "NEW-PROCESS-WRAPPER", 2, 1, false);
        declareFunction(me, "new_process_wrapper_int", "NEW-PROCESS-WRAPPER-INT", 3, 0, false);
        declareFunction(me, "process_wrapper_get_id", "PROCESS-WRAPPER-GET-ID", 1, 0, false);
        declareFunction(me, "process_wrapper_get_process", "PROCESS-WRAPPER-GET-PROCESS", 1, 0, false);
        declareFunction(me, "process_wrapper_get_state", "PROCESS-WRAPPER-GET-STATE", 1, 0, false);
        declareFunction(me, "process_wrapper_get_lock", "PROCESS-WRAPPER-GET-LOCK", 1, 0, false);
        declareFunction(me, "process_wrapper_get_plist", "PROCESS-WRAPPER-GET-PLIST", 1, 0, false);
        declareFunction(me, "process_wrapper_process_startingP", "PROCESS-WRAPPER-PROCESS-STARTING?", 1, 0, false);
        declareFunction(me, "process_wrapper_process_runningP", "PROCESS-WRAPPER-PROCESS-RUNNING?", 1, 0, false);
        declareFunction(me, "process_wrapper_process_completedP", "PROCESS-WRAPPER-PROCESS-COMPLETED?", 1, 0, false);
        declareFunction(me, "process_wrapper_process_abortedP", "PROCESS-WRAPPER-PROCESS-ABORTED?", 1, 0, false);
        declareFunction(me, "process_wrapper_process_pausingP", "PROCESS-WRAPPER-PROCESS-PAUSING?", 1, 0, false);
        declareFunction(me, "process_wrapper_process_pausedP", "PROCESS-WRAPPER-PROCESS-PAUSED?", 1, 0, false);
        declareFunction(me, "process_wrapper_process_pause", "PROCESS-WRAPPER-PROCESS-PAUSE", 1, 0, false);
        declareFunction(me, "process_wrapper_process_resume", "PROCESS-WRAPPER-PROCESS-RESUME", 1, 0, false);
        declareFunction(me, "process_wrapper_checkpoint", "PROCESS-WRAPPER-CHECKPOINT", 1, 0, false);
        declareFunction(me, "process_wrapper_block", "PROCESS-WRAPPER-BLOCK", 1, 0, false);
        declareFunction(me, "process_wrapper_process_abort", "PROCESS-WRAPPER-PROCESS-ABORT", 1, 0, false);
        declareFunction(me, "process_wrapper_set_property", "PROCESS-WRAPPER-SET-PROPERTY", 3, 0, false);
        declareFunction(me, "process_wrapper_get_property", "PROCESS-WRAPPER-GET-PROPERTY", 2, 1, false);
        declareFunction(me, "make_cyc_server_process", "MAKE-CYC-SERVER-PROCESS", 2, 0, false);
        declareFunction(me, "cyc_server_process_funcall", "CYC-SERVER-PROCESS-FUNCALL", 1, 0, false);
        declareFunction(me, "make_cyc_server_process_with_args", "MAKE-CYC-SERVER-PROCESS-WITH-ARGS", 2, 1, false);
        declareFunction(me, "cyc_server_process_funcall_with_args", "CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS", 1, 0, false);
        declareFunction(me, "process_count", "PROCESS-COUNT", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_process_utilities_file() {
        deflexical("*ACTIVE-PROCESSES-AT-STARTUP*", SubLTrampolineFile.maybeDefault($active_processes_at_startup$, $active_processes_at_startup$, NIL));
        deflexical("*PROCESS-FORM-MAP*", SubLTrampolineFile.maybeDefault($process_form_map$, $process_form_map$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQ), UNPROVIDED)));
        deflexical("*PROCESS-FORM-LOCK*", make_lock($$$Process_Form));
        defconstant("*DTP-TASK*", TASK);
        defconstant("*DTP-THINKING-TASK*", THINKING_TASK);
        defparameter("*THINKING-TASK*", NIL);
        defconstant("*DTP-IPC-QUEUE*", IPC_QUEUE);
        defparameter("*IPCQ-DEBUG?*", NIL);
        deflexical("*IPCQ-TEST-ITEMS*", $list141);
        defconstant("*DTP-ORDERED-IPC-QUEUE*", ORDERED_IPC_QUEUE);
        defconstant("*ORDERED-IPCQ-EMPTY*", make_symbol($$$empty_ordered_IPC_queue_entry));
        defparameter("*ORDERED-IPC-CURRENT-QUEUE-SIZE-ESTIMATION-THRESHOLD*", $int$212);
        defconstant("*DTP-PROCESS-WRAPPER*", PROCESS_WRAPPER);
        deflexical("*PROCESS-WRAPPER-ISG*", SubLTrampolineFile.maybeDefault($process_wrapper_isg$, $process_wrapper_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_process_utilities_file() {
        define_obsolete_register(INTERRUPT_INITIAL_PROCESS, $list1);
        declare_defglobal($active_processes_at_startup$);
        declare_defglobal($process_form_map$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_task$.getGlobalValue(), symbol_function(TASK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list21);
        def_csetf(TASK_PROCESS, _CSETF_TASK_PROCESS);
        def_csetf(TASK_COMPLETED, _CSETF_TASK_COMPLETED);
        identity(TASK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_task$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TASK_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_thinking_task$.getGlobalValue(), symbol_function(THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list46);
        def_csetf(T_TASK_LOCK, _CSETF_T_TASK_LOCK);
        def_csetf(T_TASK_THREAD, _CSETF_T_TASK_THREAD);
        def_csetf(T_TASK_NAME, _CSETF_T_TASK_NAME);
        def_csetf(T_TASK_STATUS, _CSETF_T_TASK_STATUS);
        def_csetf(T_TASK_PROGRESS_MESSAGE, _CSETF_T_TASK_PROGRESS_MESSAGE);
        def_csetf(T_TASK_PROGRESS_SOFAR, _CSETF_T_TASK_PROGRESS_SOFAR);
        def_csetf(T_TASK_PROGRESS_TOTAL, _CSETF_T_TASK_PROGRESS_TOTAL);
        def_csetf(T_TASK_START_TIME, _CSETF_T_TASK_START_TIME);
        def_csetf(T_TASK_FINISH_TIME, _CSETF_T_TASK_FINISH_TIME);
        def_csetf(T_TASK_RESULT, _CSETF_T_TASK_RESULT);
        def_csetf(T_TASK_ERROR_MESSAGE, _CSETF_T_TASK_ERROR_MESSAGE);
        def_csetf(T_TASK_PROPERTIES, _CSETF_T_TASK_PROPERTIES);
        identity(THINKING_TASK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_thinking_task$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_THINKING_TASK_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ipc_queue$.getGlobalValue(), symbol_function(IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list113);
        def_csetf(IPC_QUEUE_LOCK, _CSETF_IPC_QUEUE_LOCK);
        def_csetf(IPC_QUEUE_SEMAPHORE, _CSETF_IPC_QUEUE_SEMAPHORE);
        def_csetf(IPC_QUEUE_DATA_QUEUE, _CSETF_IPC_QUEUE_DATA_QUEUE);
        identity(IPC_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ipc_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_IPC_QUEUE_METHOD));
        define_test_case_table_int(TEST_IPC_ENQUEUE_DEQUEUE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list150, $KB, $TINY, $WORKING_, T }), $list154);
        define_test_case_table_int(TEST_IPC_ENQUEUE_DRAIN, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list150, $KB, $TINY, $WORKING_, T }), $list154);
        define_test_case_table_int(TEST_IPC_ENQUEUE_DRAIN_DEQUEUE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, $list150, $KB, $TINY, $WORKING_, T }), $list154);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ordered_ipc_queue$.getGlobalValue(), symbol_function(ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list164);
        def_csetf(ORDRD_IPCQ_LOCK, _CSETF_ORDRD_IPCQ_LOCK);
        def_csetf(ORDRD_IPCQ_PRODUCER_ISG, _CSETF_ORDRD_IPCQ_PRODUCER_ISG);
        def_csetf(ORDRD_IPCQ_CONSUMER_ISG, _CSETF_ORDRD_IPCQ_CONSUMER_ISG);
        def_csetf(ORDRD_IPCQ_PAYLOAD, _CSETF_ORDRD_IPCQ_PAYLOAD);
        def_csetf(ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE, _CSETF_ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE);
        identity(ORDERED_IPC_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ordered_ipc_queue$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ORDERED_IPC_QUEUE_METHOD));
        register_cyc_api_function(KILL_PROCESS_NAMED, $list187, $str188$_param_NAME__stringp____Kills_any, $list189, $list190);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_process$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD));
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_lock$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_process_wrapper$.getGlobalValue(), symbol_function(PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list203);
        def_csetf(PROCESS_WRAPPER_ID, _CSETF_PROCESS_WRAPPER_ID);
        def_csetf(PROCESS_WRAPPER_PROCESS, _CSETF_PROCESS_WRAPPER_PROCESS);
        def_csetf(PROCESS_WRAPPER_STATE, _CSETF_PROCESS_WRAPPER_STATE);
        def_csetf(PROCESS_WRAPPER_LOCK, _CSETF_PROCESS_WRAPPER_LOCK);
        def_csetf(PROCESS_WRAPPER_PLIST, _CSETF_PROCESS_WRAPPER_PLIST);
        identity(PROCESS_WRAPPER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_process_wrapper$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PROCESS_WRAPPER_METHOD));
        declare_defglobal($process_wrapper_isg$);
        note_funcall_helper_function(CYC_SERVER_PROCESS_FUNCALL);
        note_funcall_helper_function(CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_process_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_process_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_process_utilities_file();
    }

    static {




















































































































































































































































    }

    public static final class $task_native extends SubLStructNative {
        public SubLObject $process;

        public SubLObject $completed;

        private static final SubLStructDeclNative structDecl;

        public $task_native() {
            this.$process = Lisp.NIL;
            this.$completed = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$process;
        }

        @Override
        public SubLObject getField3() {
            return this.$completed;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$process = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$completed = value;
        }

        static {
            structDecl = makeStructDeclNative(process_utilities.$task_native.class, TASK, TASK_P, $list15, $list16, new String[]{ "$process", "$completed" }, $list17, $list18, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $task_p$UnaryFunction extends UnaryFunction {
        public $task_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return task_p(arg1);
        }
    }

    public static final class $thinking_task_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $thread;

        public SubLObject $name;

        public SubLObject $status;

        public SubLObject $progress_message;

        public SubLObject $progress_sofar;

        public SubLObject $progress_total;

        public SubLObject $start_time;

        public SubLObject $finish_time;

        public SubLObject $result;

        public SubLObject $error_message;

        public SubLObject $properties;

        private static final SubLStructDeclNative structDecl;

        public $thinking_task_native() {
            this.$lock = Lisp.NIL;
            this.$thread = Lisp.NIL;
            this.$name = Lisp.NIL;
            this.$status = Lisp.NIL;
            this.$progress_message = Lisp.NIL;
            this.$progress_sofar = Lisp.NIL;
            this.$progress_total = Lisp.NIL;
            this.$start_time = Lisp.NIL;
            this.$finish_time = Lisp.NIL;
            this.$result = Lisp.NIL;
            this.$error_message = Lisp.NIL;
            this.$properties = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$lock;
        }

        @Override
        public SubLObject getField3() {
            return this.$thread;
        }

        @Override
        public SubLObject getField4() {
            return this.$name;
        }

        @Override
        public SubLObject getField5() {
            return this.$status;
        }

        @Override
        public SubLObject getField6() {
            return this.$progress_message;
        }

        @Override
        public SubLObject getField7() {
            return this.$progress_sofar;
        }

        @Override
        public SubLObject getField8() {
            return this.$progress_total;
        }

        @Override
        public SubLObject getField9() {
            return this.$start_time;
        }

        @Override
        public SubLObject getField10() {
            return this.$finish_time;
        }

        @Override
        public SubLObject getField11() {
            return this.$result;
        }

        @Override
        public SubLObject getField12() {
            return this.$error_message;
        }

        @Override
        public SubLObject getField13() {
            return this.$properties;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$thread = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$status = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$progress_message = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$progress_sofar = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$progress_total = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$start_time = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$finish_time = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$result = value;
        }

        @Override
        public SubLObject setField12(final SubLObject value) {
            return this.$error_message = value;
        }

        @Override
        public SubLObject setField13(final SubLObject value) {
            return this.$properties = value;
        }

        static {
            structDecl = makeStructDeclNative(process_utilities.$thinking_task_native.class, THINKING_TASK, THINKING_TASK_P, $list41, $list42, new String[]{ "$lock", "$thread", "$name", "$status", "$progress_message", "$progress_sofar", "$progress_total", "$start_time", "$finish_time", "$result", "$error_message", "$properties" }, $list43, $list44, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $thinking_task_p$UnaryFunction extends UnaryFunction {
        public $thinking_task_p$UnaryFunction() {
            super(extractFunctionNamed("THINKING-TASK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return thinking_task_p(arg1);
        }
    }

    public static final class $ipc_queue_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $semaphore;

        public SubLObject $data_queue;

        private static final SubLStructDeclNative structDecl;

        public $ipc_queue_native() {
            this.$lock = Lisp.NIL;
            this.$semaphore = Lisp.NIL;
            this.$data_queue = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$lock;
        }

        @Override
        public SubLObject getField3() {
            return this.$semaphore;
        }

        @Override
        public SubLObject getField4() {
            return this.$data_queue;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$semaphore = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$data_queue = value;
        }

        static {
            structDecl = makeStructDeclNative(process_utilities.$ipc_queue_native.class, IPC_QUEUE, IPC_QUEUE_P, $list108, $list109, new String[]{ "$lock", "$semaphore", "$data_queue" }, $list110, $list111, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $ipc_queue_p$UnaryFunction extends UnaryFunction {
        public $ipc_queue_p$UnaryFunction() {
            super(extractFunctionNamed("IPC-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ipc_queue_p(arg1);
        }
    }

    public static final class $ordered_ipc_queue_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $producer_isg;

        public SubLObject $consumer_isg;

        public SubLObject $payload;

        public SubLObject $early_consumer_semaphore;

        private static final SubLStructDeclNative structDecl;

        public $ordered_ipc_queue_native() {
            this.$lock = Lisp.NIL;
            this.$producer_isg = Lisp.NIL;
            this.$consumer_isg = Lisp.NIL;
            this.$payload = Lisp.NIL;
            this.$early_consumer_semaphore = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$lock;
        }

        @Override
        public SubLObject getField3() {
            return this.$producer_isg;
        }

        @Override
        public SubLObject getField4() {
            return this.$consumer_isg;
        }

        @Override
        public SubLObject getField5() {
            return this.$payload;
        }

        @Override
        public SubLObject getField6() {
            return this.$early_consumer_semaphore;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$producer_isg = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$consumer_isg = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$payload = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$early_consumer_semaphore = value;
        }

        static {
            structDecl = makeStructDeclNative(process_utilities.$ordered_ipc_queue_native.class, ORDERED_IPC_QUEUE, ORDERED_IPC_QUEUE_P, $list159, $list160, new String[]{ "$lock", "$producer_isg", "$consumer_isg", "$payload", "$early_consumer_semaphore" }, $list161, $list162, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $ordered_ipc_queue_p$UnaryFunction extends UnaryFunction {
        public $ordered_ipc_queue_p$UnaryFunction() {
            super(extractFunctionNamed("ORDERED-IPC-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return ordered_ipc_queue_p(arg1);
        }
    }

    public static final class $process_wrapper_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $process;

        public SubLObject $state;

        public SubLObject $lock;

        public SubLObject $plist;

        private static final SubLStructDeclNative structDecl;

        public $process_wrapper_native() {
            this.$id = Lisp.NIL;
            this.$process = Lisp.NIL;
            this.$state = Lisp.NIL;
            this.$lock = Lisp.NIL;
            this.$plist = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$process;
        }

        @Override
        public SubLObject getField4() {
            return this.$state;
        }

        @Override
        public SubLObject getField5() {
            return this.$lock;
        }

        @Override
        public SubLObject getField6() {
            return this.$plist;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$process = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$state = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$plist = value;
        }

        static {
            structDecl = makeStructDeclNative(process_utilities.$process_wrapper_native.class, PROCESS_WRAPPER, PROCESS_WRAPPER_P, $list198, $list199, new String[]{ "$id", "$process", "$state", "$lock", "$plist" }, $list200, $list201, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $process_wrapper_p$UnaryFunction extends UnaryFunction {
        public $process_wrapper_p$UnaryFunction() {
            super(extractFunctionNamed("PROCESS-WRAPPER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return process_wrapper_p(arg1);
        }
    }
}

/**
 * Total time: 748 ms synthetic
 */
