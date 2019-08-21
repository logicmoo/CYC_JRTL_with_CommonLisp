package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.task_processor.$task_info_native;
import com.cyc.cycjava.cycl.task_processor.$task_process_pool_native;
import com.cyc.cycjava.cycl.task_processor.$task_processor_native;
import com.cyc.cycjava.cycl.task_processor.$task_result_set_native;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class task_processor extends SubLTranslatedFile {
    public static final SubLFile me = new task_processor();

    public static final String myName = "com.cyc.cycjava.cycl.task_processor";

    public static final String myFingerPrint = "39b26879705e925f5267b4f67d7b1c8b6960e1dfe9c1639a7522c73e1b1735d1";

    // defparameter
    // Definitions
    // Diagnostic verbosity level of the task processor, 0=quiet, 9=maximum.
    private static final SubLSymbol $task_processor_verbosity$ = makeSymbol("*TASK-PROCESSOR-VERBOSITY*");

    // defconstant
    public static final SubLSymbol $dtp_task_info$ = makeSymbol("*DTP-TASK-INFO*");

    // defconstant
    public static final SubLSymbol $dtp_task_result_set$ = makeSymbol("*DTP-TASK-RESULT-SET*");



    // defconstant
    public static final SubLSymbol $dtp_task_processor$ = makeSymbol("*DTP-TASK-PROCESSOR*");

    // defconstant
    public static final SubLSymbol $dtp_task_process_pool$ = makeSymbol("*DTP-TASK-PROCESS-POOL*");

    // defconstant
    public static final SubLSymbol $task_request_queue_max_size$ = makeSymbol("*TASK-REQUEST-QUEUE-MAX-SIZE*");

    // deflexical
    // The optional file path for the task processor pool background messages.
    private static final SubLSymbol $tpool_background_msg_path$ = makeSymbol("*TPOOL-BACKGROUND-MSG-PATH*");

    // deflexical
    // The stream for the task processor pool background messages.
    private static final SubLSymbol $tpool_background_msg_stream$ = makeSymbol("*TPOOL-BACKGROUND-MSG-STREAM*");

    // defparameter
    private static final SubLSymbol $queue_tpool_background_msgs_when_no_pathP$ = makeSymbol("*QUEUE-TPOOL-BACKGROUND-MSGS-WHEN-NO-PATH?*");





    // deflexical
    // Associates a process with its parent task-process-pool object.
    private static final SubLSymbol $process_to_task_process_pool$ = makeSymbol("*PROCESS-TO-TASK-PROCESS-POOL*");

    // deflexical
    private static final SubLSymbol $task_processes_being_worked_on_lock$ = makeSymbol("*TASK-PROCESSES-BEING-WORKED-ON-LOCK*");

    // deflexical
    /**
     * LRU Cache of task-process-descriptions -> process objects. This is used to
     * support task suspensions.
     */
    private static final SubLSymbol $task_processes_being_worked_on$ = makeSymbol("*TASK-PROCESSES-BEING-WORKED-ON*");

    // defparameter
    // How many task processes we remember the cancellation of.
    private static final SubLSymbol $task_processes_worked_on_history$ = makeSymbol("*TASK-PROCESSES-WORKED-ON-HISTORY*");



    // defparameter
    /**
     * If set to T, dont send the request back; if set to NIL, send the request
     * back.
     */
    private static final SubLSymbol $minimize_task_processor_info_communication$ = makeSymbol("*MINIMIZE-TASK-PROCESSOR-INFO-COMMUNICATION*");

    // defparameter
    // Contains the current task processor info block that is being handled.
    private static final SubLSymbol $current_task_processor_info$ = makeSymbol("*CURRENT-TASK-PROCESSOR-INFO*");

    // defparameter
    // the standard output stream for debugging within a task-processor-request
    public static final SubLSymbol $task_processor_standard_output$ = makeSymbol("*TASK-PROCESSOR-STANDARD-OUTPUT*");

    // defconstant
    // the default minimum number of task processors
    public static final SubLSymbol $min_nbr_of_task_processors$ = makeSymbol("*MIN-NBR-OF-TASK-PROCESSORS*");

    // defconstant
    // the default maximum number of task processors
    public static final SubLSymbol $max_nbr_of_task_processors$ = makeSymbol("*MAX-NBR-OF-TASK-PROCESSORS*");

    // deflexical
    // Task process pool for requests.
    public static final SubLSymbol $api_task_process_pool$ = makeSymbol("*API-TASK-PROCESS-POOL*");

    // defconstant
    /**
     * Task process pool lock to guarantee only a single instance is initialized.
     */
    public static final SubLSymbol $api_task_process_pool_lock$ = makeSymbol("*API-TASK-PROCESS-POOL-LOCK*");

    // deflexical
    // indicates that lease renewal requests should be displayed on the console.
    private static final SubLSymbol $java_api_lease_activity_display$ = makeSymbol("*JAVA-API-LEASE-ACTIVITY-DISPLAY*");

    // deflexical
    // Task process pool for requests.
    public static final SubLSymbol $bg_task_process_pool$ = makeSymbol("*BG-TASK-PROCESS-POOL*");

    // defconstant
    /**
     * Task process pool lock to guarantee only a single instance is initialized.
     */
    public static final SubLSymbol $bg_task_process_pool_lock$ = makeSymbol("*BG-TASK-PROCESS-POOL-LOCK*");

    // deflexical
    // Dictionary of requestor-process --> response task-info.
    private static final SubLSymbol $bg_task_processor_response_dict$ = makeSymbol("*BG-TASK-PROCESSOR-RESPONSE-DICT*");

    // deflexical
    // Serial number of background task processor requests.
    private static final SubLSymbol $bg_task_processor_request_id$ = makeSymbol("*BG-TASK-PROCESSOR-REQUEST-ID*");

    // deflexical
    // Task process pool for requests.
    public static final SubLSymbol $console_task_process_pool$ = makeSymbol("*CONSOLE-TASK-PROCESS-POOL*");

    // defconstant
    /**
     * Task process pool lock to guarantee only a single instance is initialized.
     */
    public static final SubLSymbol $console_task_process_pool_lock$ = makeSymbol("*CONSOLE-TASK-PROCESS-POOL-LOCK*");



    // Internal Constants
    public static final SubLSymbol SET_TASK_PROCESSOR_VERBOSITY = makeSymbol("SET-TASK-PROCESSOR-VERBOSITY");



    public static final SubLString $str2$Invalid_verbosity__must_be_0___9_ = makeString("Invalid verbosity, must be 0 - 9 but was ~S~%");

    public static final SubLSymbol TASK_INFO = makeSymbol("TASK-INFO");

    public static final SubLSymbol TASK_INFO_P = makeSymbol("TASK-INFO-P");

    public static final SubLList $list5 = list(new SubLObject[]{ makeSymbol("TYPE"), makeSymbol("ID"), makeSymbol("PRIORITY"), makeSymbol("REQUESTOR"), makeSymbol("GIVEBACK-INFO"), makeSymbol("BINDINGS"), makeSymbol("REQUEST"), makeSymbol("RESPONSE"), makeSymbol("ERROR-MESSAGE"), makeSymbol("TASK-PROCESSOR-NAME") });

    public static final SubLList $list6 = list(new SubLObject[]{ makeKeyword("TYPE"), makeKeyword("ID"), makeKeyword("PRIORITY"), makeKeyword("REQUESTOR"), makeKeyword("GIVEBACK-INFO"), makeKeyword("BINDINGS"), makeKeyword("REQUEST"), makeKeyword("RESPONSE"), makeKeyword("ERROR-MESSAGE"), makeKeyword("TASK-PROCESSOR-NAME") });

    public static final SubLList $list7 = list(new SubLObject[]{ makeSymbol("TI-TYPE"), makeSymbol("TI-ID"), makeSymbol("TI-PRIORITY"), makeSymbol("TI-REQUESTOR"), makeSymbol("TI-GIVEBACK-INFO"), makeSymbol("TI-BINDINGS"), makeSymbol("TI-REQUEST"), makeSymbol("TI-RESPONSE"), makeSymbol("TI-ERROR-MESSAGE"), makeSymbol("TI-TASK-PROCESSOR-NAME") });

    public static final SubLList $list8 = list(new SubLObject[]{ makeSymbol("_CSETF-TI-TYPE"), makeSymbol("_CSETF-TI-ID"), makeSymbol("_CSETF-TI-PRIORITY"), makeSymbol("_CSETF-TI-REQUESTOR"), makeSymbol("_CSETF-TI-GIVEBACK-INFO"), makeSymbol("_CSETF-TI-BINDINGS"), makeSymbol("_CSETF-TI-REQUEST"), makeSymbol("_CSETF-TI-RESPONSE"), makeSymbol("_CSETF-TI-ERROR-MESSAGE"), makeSymbol("_CSETF-TI-TASK-PROCESSOR-NAME") });

    public static final SubLSymbol PRINT_TASK_INFO = makeSymbol("PRINT-TASK-INFO");

    public static final SubLSymbol TASK_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TASK-INFO-P"));

    private static final SubLSymbol TI_TYPE = makeSymbol("TI-TYPE");

    private static final SubLSymbol _CSETF_TI_TYPE = makeSymbol("_CSETF-TI-TYPE");

    private static final SubLSymbol TI_ID = makeSymbol("TI-ID");

    private static final SubLSymbol _CSETF_TI_ID = makeSymbol("_CSETF-TI-ID");

    private static final SubLSymbol TI_PRIORITY = makeSymbol("TI-PRIORITY");

    private static final SubLSymbol _CSETF_TI_PRIORITY = makeSymbol("_CSETF-TI-PRIORITY");

    private static final SubLSymbol TI_REQUESTOR = makeSymbol("TI-REQUESTOR");

    private static final SubLSymbol _CSETF_TI_REQUESTOR = makeSymbol("_CSETF-TI-REQUESTOR");

    private static final SubLSymbol TI_GIVEBACK_INFO = makeSymbol("TI-GIVEBACK-INFO");

    private static final SubLSymbol _CSETF_TI_GIVEBACK_INFO = makeSymbol("_CSETF-TI-GIVEBACK-INFO");

    private static final SubLSymbol TI_BINDINGS = makeSymbol("TI-BINDINGS");

    private static final SubLSymbol _CSETF_TI_BINDINGS = makeSymbol("_CSETF-TI-BINDINGS");

    private static final SubLSymbol TI_REQUEST = makeSymbol("TI-REQUEST");

    private static final SubLSymbol _CSETF_TI_REQUEST = makeSymbol("_CSETF-TI-REQUEST");

    private static final SubLSymbol TI_RESPONSE = makeSymbol("TI-RESPONSE");

    private static final SubLSymbol _CSETF_TI_RESPONSE = makeSymbol("_CSETF-TI-RESPONSE");

    private static final SubLSymbol TI_ERROR_MESSAGE = makeSymbol("TI-ERROR-MESSAGE");

    private static final SubLSymbol _CSETF_TI_ERROR_MESSAGE = makeSymbol("_CSETF-TI-ERROR-MESSAGE");

    private static final SubLSymbol TI_TASK_PROCESSOR_NAME = makeSymbol("TI-TASK-PROCESSOR-NAME");

    private static final SubLSymbol _CSETF_TI_TASK_PROCESSOR_NAME = makeSymbol("_CSETF-TI-TASK-PROCESSOR-NAME");



















    private static final SubLSymbol $TASK_PROCESSOR_NAME = makeKeyword("TASK-PROCESSOR-NAME");

    private static final SubLString $str42$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_TASK_INFO = makeSymbol("MAKE-TASK-INFO");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TASK_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TASK-INFO-METHOD");







    private static final SubLString $str51$type_ = makeString("type=");

    private static final SubLString $str52$_id_ = makeString(" id=");

    private static final SubLString $str53$_priority_ = makeString(" priority=");

    private static final SubLString $str54$_requestor_ = makeString(" requestor=");

    private static final SubLString $str55$_giveback_info_ = makeString(" giveback-info=");

    private static final SubLString $str56$_bindings_ = makeString(" bindings=");

    private static final SubLString $str57$_request_ = makeString(" request=");

    private static final SubLString $str58$_response_ = makeString(" response=");

    private static final SubLString $str59$_error_message_ = makeString(" error-message=");

    private static final SubLSymbol TASK_RESULT_SET = makeSymbol("TASK-RESULT-SET");

    private static final SubLSymbol TASK_RESULT_SET_P = makeSymbol("TASK-RESULT-SET-P");

    public static final SubLList $list62 = list(makeSymbol("RESULT"), makeSymbol("TASK-INFO"), makeSymbol("FINISHED"));

    private static final SubLList $list63 = list(makeKeyword("RESULT"), makeKeyword("TASK-INFO"), makeKeyword("FINISHED"));

    private static final SubLList $list64 = list(makeSymbol("TASK-RESULT-SET-RESULT"), makeSymbol("TASK-RESULT-SET-TASK-INFO"), makeSymbol("TASK-RESULT-SET-FINISHED"));

    private static final SubLList $list65 = list(makeSymbol("_CSETF-TASK-RESULT-SET-RESULT"), makeSymbol("_CSETF-TASK-RESULT-SET-TASK-INFO"), makeSymbol("_CSETF-TASK-RESULT-SET-FINISHED"));



    private static final SubLSymbol TASK_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list68 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TASK-RESULT-SET-P"));

    private static final SubLSymbol TASK_RESULT_SET_RESULT = makeSymbol("TASK-RESULT-SET-RESULT");

    private static final SubLSymbol _CSETF_TASK_RESULT_SET_RESULT = makeSymbol("_CSETF-TASK-RESULT-SET-RESULT");

    private static final SubLSymbol TASK_RESULT_SET_TASK_INFO = makeSymbol("TASK-RESULT-SET-TASK-INFO");

    private static final SubLSymbol _CSETF_TASK_RESULT_SET_TASK_INFO = makeSymbol("_CSETF-TASK-RESULT-SET-TASK-INFO");

    private static final SubLSymbol TASK_RESULT_SET_FINISHED = makeSymbol("TASK-RESULT-SET-FINISHED");

    private static final SubLSymbol _CSETF_TASK_RESULT_SET_FINISHED = makeSymbol("_CSETF-TASK-RESULT-SET-FINISHED");







    private static final SubLSymbol MAKE_TASK_RESULT_SET = makeSymbol("MAKE-TASK-RESULT-SET");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TASK_RESULT_SET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TASK-RESULT-SET-METHOD");



    private static final SubLSymbol TASK_PROCESSOR = makeSymbol("TASK-PROCESSOR");

    private static final SubLSymbol TASK_PROCESSOR_P = makeSymbol("TASK-PROCESSOR-P");

    private static final SubLList $list83 = list(makeSymbol("NAME"), makeSymbol("PROCESS"), makeSymbol("BUSY-P"), makeSymbol("TASK-INFO"));

    private static final SubLList $list84 = list(makeKeyword("NAME"), makeKeyword("PROCESS"), makeKeyword("BUSY-P"), makeKeyword("TASK-INFO"));

    private static final SubLList $list85 = list(makeSymbol("TPROC-NAME"), makeSymbol("TPROC-PROCESS"), makeSymbol("TPROC-BUSY-P"), makeSymbol("TPROC-TASK-INFO"));

    private static final SubLList $list86 = list(makeSymbol("_CSETF-TPROC-NAME"), makeSymbol("_CSETF-TPROC-PROCESS"), makeSymbol("_CSETF-TPROC-BUSY-P"), makeSymbol("_CSETF-TPROC-TASK-INFO"));

    private static final SubLSymbol PRINT_TASK_PROCESSOR = makeSymbol("PRINT-TASK-PROCESSOR");

    private static final SubLSymbol TASK_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list89 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TASK-PROCESSOR-P"));

    private static final SubLSymbol TPROC_NAME = makeSymbol("TPROC-NAME");

    private static final SubLSymbol _CSETF_TPROC_NAME = makeSymbol("_CSETF-TPROC-NAME");

    private static final SubLSymbol TPROC_PROCESS = makeSymbol("TPROC-PROCESS");

    private static final SubLSymbol _CSETF_TPROC_PROCESS = makeSymbol("_CSETF-TPROC-PROCESS");

    private static final SubLSymbol TPROC_BUSY_P = makeSymbol("TPROC-BUSY-P");

    private static final SubLSymbol _CSETF_TPROC_BUSY_P = makeSymbol("_CSETF-TPROC-BUSY-P");

    private static final SubLSymbol TPROC_TASK_INFO = makeSymbol("TPROC-TASK-INFO");

    private static final SubLSymbol _CSETF_TPROC_TASK_INFO = makeSymbol("_CSETF-TPROC-TASK-INFO");







    private static final SubLSymbol MAKE_TASK_PROCESSOR = makeSymbol("MAKE-TASK-PROCESSOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TASK_PROCESSOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TASK-PROCESSOR-METHOD");

    private static final SubLString $str103$name_ = makeString("name=");

    private static final SubLString $str104$_process_ = makeString(" process=");

    private static final SubLString $str105$_whostate_ = makeString(" whostate=");

    private static final SubLString $str106$_busy_p_ = makeString(" busy-p=");

    private static final SubLString $str107$_last_response_ = makeString(" last response=");

    private static final SubLSymbol TASK_PROCESS_POOL = makeSymbol("TASK-PROCESS-POOL");

    private static final SubLSymbol TASK_PROCESS_POOL_P = makeSymbol("TASK-PROCESS-POOL-P");

    private static final SubLList $list110 = list(makeSymbol("LOCK"), makeSymbol("REQUEST-QUEUE"), makeSymbol("REQUEST-SEMAPHORE"), makeSymbol("PROCESSORS"), makeSymbol("BACKGROUND-MSGS"), makeSymbol("PROCESS-NAME-PREFIX"), makeSymbol("MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("MAX-NBR-OF-TASK-PROCESSORS"));

    private static final SubLList $list111 = list(makeKeyword("LOCK"), makeKeyword("REQUEST-QUEUE"), makeKeyword("REQUEST-SEMAPHORE"), makeKeyword("PROCESSORS"), makeKeyword("BACKGROUND-MSGS"), makeKeyword("PROCESS-NAME-PREFIX"), makeKeyword("MIN-NBR-OF-TASK-PROCESSORS"), makeKeyword("MAX-NBR-OF-TASK-PROCESSORS"));

    private static final SubLList $list112 = list(makeSymbol("TPOOL-LOCK"), makeSymbol("TPOOL-REQUEST-QUEUE"), makeSymbol("TPOOL-REQUEST-SEMAPHORE"), makeSymbol("TPOOL-PROCESSORS"), makeSymbol("TPOOL-BACKGROUND-MSGS"), makeSymbol("TPOOL-PROCESS-NAME-PREFIX"), makeSymbol("TPOOL-MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("TPOOL-MAX-NBR-OF-TASK-PROCESSORS"));

    private static final SubLList $list113 = list(makeSymbol("_CSETF-TPOOL-LOCK"), makeSymbol("_CSETF-TPOOL-REQUEST-QUEUE"), makeSymbol("_CSETF-TPOOL-REQUEST-SEMAPHORE"), makeSymbol("_CSETF-TPOOL-PROCESSORS"), makeSymbol("_CSETF-TPOOL-BACKGROUND-MSGS"), makeSymbol("_CSETF-TPOOL-PROCESS-NAME-PREFIX"), makeSymbol("_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"));

    private static final SubLSymbol PRINT_TASK_PROCESS_POOL = makeSymbol("PRINT-TASK-PROCESS-POOL");

    private static final SubLSymbol TASK_PROCESS_POOL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-PROCESS-POOL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list116 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TASK-PROCESS-POOL-P"));

    private static final SubLSymbol TPOOL_LOCK = makeSymbol("TPOOL-LOCK");

    private static final SubLSymbol _CSETF_TPOOL_LOCK = makeSymbol("_CSETF-TPOOL-LOCK");

    private static final SubLSymbol TPOOL_REQUEST_QUEUE = makeSymbol("TPOOL-REQUEST-QUEUE");

    private static final SubLSymbol _CSETF_TPOOL_REQUEST_QUEUE = makeSymbol("_CSETF-TPOOL-REQUEST-QUEUE");

    private static final SubLSymbol TPOOL_REQUEST_SEMAPHORE = makeSymbol("TPOOL-REQUEST-SEMAPHORE");

    private static final SubLSymbol _CSETF_TPOOL_REQUEST_SEMAPHORE = makeSymbol("_CSETF-TPOOL-REQUEST-SEMAPHORE");

    private static final SubLSymbol TPOOL_PROCESSORS = makeSymbol("TPOOL-PROCESSORS");

    private static final SubLSymbol _CSETF_TPOOL_PROCESSORS = makeSymbol("_CSETF-TPOOL-PROCESSORS");

    private static final SubLSymbol TPOOL_BACKGROUND_MSGS = makeSymbol("TPOOL-BACKGROUND-MSGS");

    private static final SubLSymbol _CSETF_TPOOL_BACKGROUND_MSGS = makeSymbol("_CSETF-TPOOL-BACKGROUND-MSGS");

    private static final SubLSymbol TPOOL_PROCESS_NAME_PREFIX = makeSymbol("TPOOL-PROCESS-NAME-PREFIX");

    private static final SubLSymbol _CSETF_TPOOL_PROCESS_NAME_PREFIX = makeSymbol("_CSETF-TPOOL-PROCESS-NAME-PREFIX");

    private static final SubLSymbol TPOOL_MIN_NBR_OF_TASK_PROCESSORS = makeSymbol("TPOOL-MIN-NBR-OF-TASK-PROCESSORS");

    private static final SubLSymbol _CSETF_TPOOL_MIN_NBR_OF_TASK_PROCESSORS = makeSymbol("_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS");

    private static final SubLSymbol TPOOL_MAX_NBR_OF_TASK_PROCESSORS = makeSymbol("TPOOL-MAX-NBR-OF-TASK-PROCESSORS");

    private static final SubLSymbol _CSETF_TPOOL_MAX_NBR_OF_TASK_PROCESSORS = makeSymbol("_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS");











    private static final SubLSymbol $PROCESS_NAME_PREFIX = makeKeyword("PROCESS-NAME-PREFIX");

    private static final SubLSymbol $MIN_NBR_OF_TASK_PROCESSORS = makeKeyword("MIN-NBR-OF-TASK-PROCESSORS");

    private static final SubLSymbol $MAX_NBR_OF_TASK_PROCESSORS = makeKeyword("MAX-NBR-OF-TASK-PROCESSORS");

    private static final SubLSymbol MAKE_TASK_PROCESS_POOL = makeSymbol("MAKE-TASK-PROCESS-POOL");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TASK_PROCESS_POOL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TASK-PROCESS-POOL-METHOD");

    private static final SubLString $str143$_request_queue_ = makeString(" request-queue=");

    private static final SubLString $str144$_processors_ = makeString(" processors=");

    private static final SubLString $str145$_process_name_prefix_ = makeString(" process name prefix=");

    private static final SubLString $str146$_min_processors_ = makeString(" min processors=");

    private static final SubLString $str147$_max_processors_ = makeString(" max processors=");

    private static final SubLString $str148$There_are_no_task_processors_ = makeString("There are no task processors.");

    private static final SubLString $str149$_S__ = makeString("~S~%");

    private static final SubLString $str150$request__S__ = makeString("request=~S~%");

    private static final SubLInteger $int$500 = makeInteger(500);



    private static final SubLSymbol PRIORITY_QUEUE_P = makeSymbol("PRIORITY-QUEUE-P");



    private static final SubLSymbol SET_TPOOL_BACKGROUND_MSG_PATH = makeSymbol("SET-TPOOL-BACKGROUND-MSG-PATH");

    private static final SubLSymbol $tpool_background_msg_lock$ = makeSymbol("*TPOOL-BACKGROUND-MSG-LOCK*");

    private static final SubLString $str157$tpool_background_msg_lock = makeString("tpool-background-msg-lock");

    private static final SubLSymbol PUSH_TPOOL_BACKGROUND_MSG = makeSymbol("PUSH-TPOOL-BACKGROUND-MSG");

    private static final SubLString $str159$_A_is_not_a_valid_file_specificat = makeString("~A is not a valid file specification, call SET-TPOOL-BACKGROUND-MSG-PATH first.");





    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");







    private static final SubLString $str166$_ = makeString("[");

    private static final SubLString $str167$_ = makeString("]");

    private static final SubLString $$$__ = makeString("  ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol FLUSH_TPOOL_BACKGROUND_MSGS = makeSymbol("FLUSH-TPOOL-BACKGROUND-MSGS");

    private static final SubLSymbol START_TASK_PROCESSOR_LOGGING_TO_FILE = makeSymbol("START-TASK-PROCESSOR-LOGGING-TO-FILE");



    private static final SubLSymbol END_TASK_PROCESSOR_LOGGING_TO_FILE = makeSymbol("END-TASK-PROCESSOR-LOGGING-TO-FILE");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol SAVE_UNLOGGED_TASK_PROCESSOR_MESSAGES_TO_FILE = makeSymbol("SAVE-UNLOGGED-TASK-PROCESSOR-MESSAGES-TO-FILE");

    private static final SubLString $str177$Unable_to_open__S = makeString("Unable to open ~S");





    private static final SubLSymbol $eval_with_bindings$ = makeSymbol("*EVAL-WITH-BINDINGS*");

    private static final SubLSymbol CYC_API_EVAL = makeSymbol("CYC-API-EVAL");





    private static final SubLString $$$Task_processes_being_worked_on = makeString("Task processes being worked on");





    private static final SubLSymbol TASK_PROCESS_TERMINATION_REASON_P = makeSymbol("TASK-PROCESS-TERMINATION-REASON-P");



    private static final SubLSymbol SIGNAL_ABORT_ACTIVE_TASK_PROCESS = makeSymbol("SIGNAL-ABORT-ACTIVE-TASK-PROCESS");

    private static final SubLSymbol SIGNAL_CANCEL_ACTIVE_TASK_PROCESS = makeSymbol("SIGNAL-CANCEL-ACTIVE-TASK-PROCESS");

    private static final SubLString $str191$API_error__Unknown_active_task_pr = makeString("API error: Unknown active task process termination reason ~A");



    private static final SubLList $list193 = list(makeSymbol("ANS-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLSymbol CATCH_TASK_PROCESSOR_TERMINATION = makeSymbol("CATCH-TASK-PROCESSOR-TERMINATION");

    private static final SubLString $str197$Allow_for_the_API_calling_side_to = makeString("Allow for the API calling side to catch the termination of the task processor.\n   The client must wrap the api-request form with catch-task-processor-termination.");

    private static final SubLSymbol $sym198$ANS_VAR = makeUninternedSymbol("ANS-VAR");

    private static final SubLSymbol CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY = makeSymbol("CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY");

    private static final SubLList $list200 = list(makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str201$Allow_for_the_API_calling_side_to = makeString("Allow for the API calling side to catch the termination of the task processor\n   without looking at the termination reason.\n   The client must wrap the api-request form with catch-task-processor-termination-quietly.");

    private static final SubLFloat $float$0_001 = makeDouble(0.001);

    private static final SubLSymbol $TASK_PROCESSOR_QUIT = makeKeyword("TASK-PROCESSOR-QUIT");

    private static final SubLString $str204$Invalid_task_processor = makeString("Invalid task-processor");

    private static final SubLString $str205$Invalid_task_process_pool = makeString("Invalid task-process-pool");

    private static final SubLString $str206$Task_Info__S__ = makeString("Task Info ~S~%");



    private static final SubLString $str208$Response__S__ = makeString("Response ~S~%");

    private static final SubLString $str209$Error_message__S__ = makeString("Error-message ~S~%");

    private static final SubLString $str210$Posting_partial_results__A_at__A = makeString("Posting partial results ~A at ~A");

    private static final SubLString $str211$Function_only_valid_from_within_a = makeString("Function only valid from within a Task Processor, but running inside ~A.");

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLString $$$Task_processor_ = makeString("Task processor ");

    private static final SubLString $str214$Initializing_task_processors__ = makeString("Initializing task processors~%");

    private static final SubLString $str215$_alock = makeString("~alock");

    private static final SubLString $str216$task_pool_request_semaphore = makeString("task-pool-request-semaphore");

    private static final SubLString $str217$_a_s = makeString("~a~s");

    private static final SubLSymbol TASK_PROCESSOR_HANDLER = makeSymbol("TASK-PROCESSOR-HANDLER");

    private static final SubLSymbol TASK_PROCESSOR_QUIT = makeSymbol("TASK-PROCESSOR-QUIT");

    private static final SubLSymbol ENSURE_TASK_PROCESSORS_KILLED = makeSymbol("ENSURE-TASK-PROCESSORS-KILLED");

    private static final SubLString $$$_processor_ = makeString(" processor ");

    private static final SubLString $str222$_Killing__A___ = makeString(" Killing ~A.~%");

    private static final SubLString $str223$Allocating_a_new_task_processor__ = makeString("Allocating a new task processor~%");

    private static final SubLString $str224$Awakening_first_available_task_pr = makeString("Awakening first available task processor~%");

    private static final SubLString $str225$Task_processors_are_not_initializ = makeString("Task processors are not initialized.");

    private static final SubLString $str226$__Error__cannot_queue_task_reques = makeString("~%Error: cannot queue task request for ~%~S~%");

    private static final SubLSymbol WITH_LONG_RUNNING_TASK_PROCESS = makeSymbol("WITH-LONG-RUNNING-TASK-PROCESS");

    public static final SubLList $list228 = list(list(makeSymbol("POOL"), list(makeSymbol("GET-TASK-PROCESS-POOL-FOR-PROCESS"), list(makeSymbol("CURRENT-PROCESS")))), list(makeSymbol("POOL-LOCK"), list(makeSymbol("GET-TPOOL-LOCK"), makeSymbol("POOL"))), makeSymbol("UPDATED-SUCCESSFULLY?"));



    private static final SubLList $list230 = list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("POOL-LOCK"), makeKeyword("WHOSTATE"), makeString("Upping maximum on process pool ....")), list(makeSymbol("CLET"), list(list(makeSymbol("CURR-MAX"), list(makeSymbol("GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"), makeSymbol("POOL")))), list(makeSymbol("SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"), makeSymbol("POOL"), list(makeSymbol("+"), makeSymbol("CURR-MAX"), ONE_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("UPDATED-SUCCESSFULLY?"), T)));

    private static final SubLList $list231 = list(list(makeSymbol("PWHEN"), makeSymbol("UPDATED-SUCCESSFULLY?"), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("POOL-LOCK"), makeKeyword("WHOSTATE"), makeString("Reverting maximum on process pool ....")), list(makeSymbol("CLET"), list(list(makeSymbol("CURR-MAX"), list(makeSymbol("GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"), makeSymbol("POOL")))), list(makeSymbol("SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"), makeSymbol("POOL"), list(ONE_INTEGER, makeSymbol("CURR-MAX"), ONE_INTEGER))))));

    private static final SubLList $list232 = list(makeSymbol("TYPE"), makeSymbol("MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("MAX-NBR-OF-TASK-PROCESSORS"));

    private static final SubLString $str233$_ = makeString("*");

    private static final SubLString $str234$_TASK_PROCESS_POOL_ = makeString("-TASK-PROCESS-POOL*");

    private static final SubLString $str235$_TASK_PROCESS_POOL_LOCK_ = makeString("-TASK-PROCESS-POOL-LOCK*");

    private static final SubLSymbol DEFLEXICAL_PUBLIC = makeSymbol("DEFLEXICAL-PUBLIC");

    private static final SubLList $list237 = list(NIL, makeString("Task process pool for requests."));

    private static final SubLSymbol DEFCONSTANT_PUBLIC = makeSymbol("DEFCONSTANT-PUBLIC");

    private static final SubLList $list239 = list(list(makeSymbol("MAKE-LOCK"), makeString("task processor initialization lock")), makeString("Task process pool lock to guarantee only a single instance is initialized."));



    private static final SubLString $str241$_TASK_PROCESSORS_INITIALIZED_P = makeString("-TASK-PROCESSORS-INITIALIZED-P");

    private static final SubLString $str242$Return_T_when_there_are_task_proc = makeString("Return T when there are task processors.");



    private static final SubLSymbol TASK_PROCESSORS_INITIALIZED_P = makeSymbol("TASK-PROCESSORS-INITIALIZED-P");

    private static final SubLString $str245$INITIALIZE_ = makeString("INITIALIZE-");

    private static final SubLString $str246$_TASK_PROCESSORS = makeString("-TASK-PROCESSORS");

    private static final SubLString $str247$Initialize_the_task_processor_poo = makeString("Initialize the task processor pool for requests.");





    private static final SubLList $list250 = list(list(makeSymbol("ERROR"), makeString("Illegal attempt to reinitialize processor pool without first halting it.")));

    private static final SubLSymbol INITIALIZE_TASK_PROCESSORS = makeSymbol("INITIALIZE-TASK-PROCESSORS");



    private static final SubLList $list253 = list(makeString(" processor "));

    private static final SubLList $list254 = list(list(makeSymbol("RET"), NIL));

    private static final SubLString $str255$HALT_ = makeString("HALT-");

    private static final SubLString $str256$Halt_the_task_processors_ = makeString("Halt the task processors.");

    private static final SubLSymbol HALT_TASK_PROCESSORS = makeSymbol("HALT-TASK-PROCESSORS");

    private static final SubLList $list258 = list(makeSymbol("FLUSH-TPOOL-BACKGROUND-MSGS"));

    private static final SubLList $list259 = list(NIL);

    private static final SubLString $str260$RESTART_ = makeString("RESTART-");

    private static final SubLString $str261$Restart__halt___initialize__the_t = makeString("Restart (halt + initialize) the task processors.");

    private static final SubLString $str262$SHOW_ = makeString("SHOW-");

    private static final SubLString $str263$_TP_MSGS = makeString("-TP-MSGS");

    private static final SubLString $str264$Show_and_reset_the_task_processor = makeString("Show and reset the task processor background messages for the\n          task-process-pool.");

    private static final SubLSymbol SHOW_TP_MSGS = makeSymbol("SHOW-TP-MSGS");

    private static final SubLList $list266 = list(makeSymbol("TYPE"), makeSymbol("EVAL-FN"), makeSymbol("ARGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str267$_TASK_PROCESSOR_REQUEST = makeString("-TASK-PROCESSOR-REQUEST");

    private static final SubLList $list268 = list(makeSymbol("PUNLESS"), makeSymbol("*TASK-PROCESSOR-EVAL-FN-DICT*"), list(makeSymbol("CSETQ"), makeSymbol("*TASK-PROCESSOR-EVAL-FN-DICT*"), list(makeSymbol("NEW-DICTIONARY"))));



    private static final SubLSymbol $task_processor_eval_fn_dict$ = makeSymbol("*TASK-PROCESSOR-EVAL-FN-DICT*");

    private static final SubLList $list271 = list(makeSymbol("TYPE"), makeSymbol("ARGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str272$DISPATCH_ = makeString("DISPATCH-");

    private static final SubLString $str273$_TASK_PROCESSOR_RESPONSE = makeString("-TASK-PROCESSOR-RESPONSE");

    private static final SubLList $list274 = list(makeSymbol("PUNLESS"), makeSymbol("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*"), list(makeSymbol("CSETQ"), makeSymbol("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*"), list(makeSymbol("NEW-DICTIONARY"))));

    private static final SubLSymbol $task_processor_response_dispatch_fn_dict$ = makeSymbol("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*");



    private static final SubLString $str277$task_processor_initialization_loc = makeString("task processor initialization lock");

    private static final SubLString $str278$Illegal_attempt_to_reinitialize_p = makeString("Illegal attempt to reinitialize processor pool without first halting it.");

    private static final SubLString $$$API = makeString("API");

    private static final SubLSymbol SHOW_API_TASK_PROCESSORS = makeSymbol("SHOW-API-TASK-PROCESSORS");

    private static final SubLString $str281$Provides_a_convenient_alias_for_D = makeString("Provides a convenient alias for DISPLAY-API-TASK-PROCESSORS.");

    private static final SubLSymbol DISPLAY_API_TASK_PROCESSORS = makeSymbol("DISPLAY-API-TASK-PROCESSORS");

    private static final SubLString $str283$ = makeString("");

    private static final SubLSymbol INITIALIZE_API_TASK_PROCESSORS = makeSymbol("INITIALIZE-API-TASK-PROCESSORS");

    private static final SubLSymbol HALT_API_TASK_PROCESSORS = makeSymbol("HALT-API-TASK-PROCESSORS");

    private static final SubLSymbol RESTART_API_TASK_PROCESSORS = makeSymbol("RESTART-API-TASK-PROCESSORS");

    private static final SubLSymbol SHOW_API_TP_MSGS = makeSymbol("SHOW-API-TP-MSGS");

    private static final SubLSymbol API_TASK_PROCESSOR_REQUEST = makeSymbol("API-TASK-PROCESSOR-REQUEST");

    private static final SubLSymbol WITH_IMMEDIATE_EXECUTION = makeSymbol("WITH-IMMEDIATE-EXECUTION");



    private static final SubLSymbol SET_JAVA_API_LEASE_ACTIVITY_DISPLAY = makeSymbol("SET-JAVA-API-LEASE-ACTIVITY-DISPLAY");

    private static final SubLString $str292$Dispatching_api_response__S__ = makeString("Dispatching api response ~S~%");

    private static final SubLSymbol TASK_PROCESSOR_RESPONSE = makeSymbol("TASK-PROCESSOR-RESPONSE");

    private static final SubLString $str294$Sending_api_response__S_to_socket = makeString("Sending api response ~S to socket ~S~% identified by ~A~%");

    private static final SubLString $str295$Dropping_api_response__S__socket_ = makeString("Dropping api response ~S, socket ~S~% identified by ~A is not available~%");

    private static final SubLSymbol DISPATCH_API_TASK_PROCESSOR_RESPONSE = makeSymbol("DISPATCH-API-TASK-PROCESSOR-RESPONSE");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_RESET = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-RESET");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_ADD = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-ADD");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_SIZE = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-SIZE");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_CONTENTS = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-CONTENTS");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_ITERATOR = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-ITERATOR");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_ADD_ALL = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-ADD-ALL");

    private static final SubLString $str303$Cannot_invoke_intermediate_result = makeString("Cannot invoke intermediate results accumulator outside of a task processor.~%");

    private static final SubLString $$$BG = makeString("BG");



    private static final SubLString $str306$dispatching_bg_response__S__ = makeString("dispatching bg response ~S~%");

    private static final SubLString $str307$bg_response_dictionary__S__ = makeString("bg response dictionary ~S~%");

    private static final SubLSymbol DISPATCH_BG_TASK_PROCESSOR_RESPONSE = makeSymbol("DISPATCH-BG-TASK-PROCESSOR-RESPONSE");

    private static final SubLString $$$CONSOLE = makeString("CONSOLE");

    private static final SubLSymbol $task_processor_console_id$ = makeSymbol("*TASK-PROCESSOR-CONSOLE-ID*");



    private static final SubLString $str312$dispatching_console_response__S__ = makeString("dispatching console response ~S~%");

    private static final SubLString $str313$_A___A__ = makeString("~A  ~A~%");

    private static final SubLSymbol DISPATCH_CONSOLE_TASK_PROCESSOR_RESPONSE = makeSymbol("DISPATCH-CONSOLE-TASK-PROCESSOR-RESPONSE");

    private static final SubLString $str315$Task_Processor_Module_Supercatego = makeString("Task-Processor Module Supercategory");

    private static final SubLString $$$Task_Processor_Subcategory = makeString("Task Processor Subcategory");

    private static final SubLString $str317$Task_Processor_Testing_Suite = makeString("Task-Processor Testing Suite");

    static final boolean assertionsDisabledSynth = true;

    public static SubLObject get_task_processor_verbosity() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $task_processor_verbosity$.getDynamicValue(thread);
    }

    public static SubLObject set_task_processor_verbosity(final SubLObject verbosity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(verbosity) : "Types.integerp(verbosity) " + "CommonSymbols.NIL != Types.integerp(verbosity) " + verbosity;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!MINUS_ONE_INTEGER.numL(verbosity)) || (!verbosity.numL(TEN_INTEGER)))) {
            Errors.error($str2$Invalid_verbosity__must_be_0___9_, verbosity);
        }
        $task_processor_verbosity$.setDynamicValue(verbosity, thread);
        return NIL;
    }

    public static SubLObject task_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_task_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject task_info_p(final SubLObject v_object) {
        return v_object.getClass() == $task_info_native.class ? T : NIL;
    }

    public static SubLObject ti_type(final SubLObject v_object) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject ti_id(final SubLObject v_object) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject ti_priority(final SubLObject v_object) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject ti_requestor(final SubLObject v_object) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject ti_giveback_info(final SubLObject v_object) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject ti_bindings(final SubLObject v_object) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject ti_request(final SubLObject v_object) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject ti_response(final SubLObject v_object) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject ti_error_message(final SubLObject v_object) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.getField10();
    }

    public static SubLObject ti_task_processor_name(final SubLObject v_object) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_ti_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ti_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ti_priority(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ti_requestor(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ti_giveback_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ti_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ti_request(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_ti_response(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_ti_error_message(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_ti_task_processor_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_info_p(v_object) : "task_processor.task_info_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_task_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $task_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                _csetf_ti_type(v_new, current_value);
            } else
                if (pcase_var.eql($ID)) {
                    _csetf_ti_id(v_new, current_value);
                } else
                    if (pcase_var.eql($PRIORITY)) {
                        _csetf_ti_priority(v_new, current_value);
                    } else
                        if (pcase_var.eql($REQUESTOR)) {
                            _csetf_ti_requestor(v_new, current_value);
                        } else
                            if (pcase_var.eql($GIVEBACK_INFO)) {
                                _csetf_ti_giveback_info(v_new, current_value);
                            } else
                                if (pcase_var.eql($BINDINGS)) {
                                    _csetf_ti_bindings(v_new, current_value);
                                } else
                                    if (pcase_var.eql($REQUEST)) {
                                        _csetf_ti_request(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($RESPONSE)) {
                                            _csetf_ti_response(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($ERROR_MESSAGE)) {
                                                _csetf_ti_error_message(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($TASK_PROCESSOR_NAME)) {
                                                    _csetf_ti_task_processor_name(v_new, current_value);
                                                } else {
                                                    Errors.error($str42$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_task_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TASK_INFO, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, ti_type(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, ti_id(obj));
        funcall(visitor_fn, obj, $SLOT, $PRIORITY, ti_priority(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUESTOR, ti_requestor(obj));
        funcall(visitor_fn, obj, $SLOT, $GIVEBACK_INFO, ti_giveback_info(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDINGS, ti_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUEST, ti_request(obj));
        funcall(visitor_fn, obj, $SLOT, $RESPONSE, ti_response(obj));
        funcall(visitor_fn, obj, $SLOT, $ERROR_MESSAGE, ti_error_message(obj));
        funcall(visitor_fn, obj, $SLOT, $TASK_PROCESSOR_NAME, ti_task_processor_name(obj));
        funcall(visitor_fn, obj, $END, MAKE_TASK_INFO, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_task_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_task_info(obj, visitor_fn);
    }

    public static SubLObject get_task_info_type(final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        return ti_type(task_info);
    }

    public static SubLObject set_task_info_type(final SubLObject type, final SubLObject task_info) {
        assert NIL != symbolp(type) : "Types.symbolp(type) " + "CommonSymbols.NIL != Types.symbolp(type) " + type;
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        _csetf_ti_type(task_info, type);
        return NIL;
    }

    public static SubLObject get_task_info_id(final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        return ti_id(task_info);
    }

    public static SubLObject set_task_info_id(final SubLObject id, final SubLObject task_info) {
        assert NIL != integerp(id) : "Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) " + id;
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        _csetf_ti_id(task_info, id);
        return NIL;
    }

    public static SubLObject get_task_info_priority(final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        return ti_priority(task_info);
    }

    public static SubLObject set_task_info_priority(final SubLObject priority, final SubLObject task_info) {
        assert NIL != integerp(priority) : "Types.integerp(priority) " + "CommonSymbols.NIL != Types.integerp(priority) " + priority;
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        _csetf_ti_priority(task_info, priority);
        return NIL;
    }

    public static SubLObject get_task_info_requestor(final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        return ti_requestor(task_info);
    }

    public static SubLObject set_task_info_requestor(final SubLObject requestor, final SubLObject task_info) {
        assert NIL != stringp(requestor) : "Types.stringp(requestor) " + "CommonSymbols.NIL != Types.stringp(requestor) " + requestor;
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        _csetf_ti_requestor(task_info, requestor);
        return NIL;
    }

    public static SubLObject get_task_info_giveback_info(final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        return ti_giveback_info(task_info);
    }

    public static SubLObject set_task_info_giveback_info(final SubLObject giveback_info, final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        _csetf_ti_giveback_info(task_info, giveback_info);
        return NIL;
    }

    public static SubLObject get_task_info_bindings(final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        return ti_bindings(task_info);
    }

    public static SubLObject set_task_info_bindings(final SubLObject v_bindings, final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        _csetf_ti_bindings(task_info, v_bindings);
        return NIL;
    }

    public static SubLObject get_task_info_request(final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        return ti_request(task_info);
    }

    public static SubLObject set_task_info_request(final SubLObject request, final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        _csetf_ti_request(task_info, request);
        return NIL;
    }

    public static SubLObject get_task_info_response(final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        return ti_response(task_info);
    }

    public static SubLObject set_task_info_response(final SubLObject response, final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        _csetf_ti_response(task_info, response);
        return NIL;
    }

    public static SubLObject get_task_info_error_message(final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        return ti_error_message(task_info);
    }

    public static SubLObject set_task_info_error_message(final SubLObject error_message, final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        _csetf_ti_error_message(task_info, error_message);
        return NIL;
    }

    public static SubLObject get_task_info_task_processor_name(final SubLObject task_info) {
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        return ti_task_processor_name(task_info);
    }

    public static SubLObject set_task_info_task_processor_name(final SubLObject task_processor_name, final SubLObject task_info) {
        assert NIL != stringp(task_processor_name) : "Types.stringp(task_processor_name) " + "CommonSymbols.NIL != Types.stringp(task_processor_name) " + task_processor_name;
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        _csetf_ti_task_processor_name(task_info, task_processor_name);
        return NIL;
    }

    public static SubLObject print_task_info(final SubLObject task_info, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        assert NIL != streamp(stream) : "Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) " + stream;
        terpri(stream);
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(task_info, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, task_info, T, T);
            write_string($str51$type_, stream, UNPROVIDED, UNPROVIDED);
            prin1(ti_type(task_info), stream);
            write_string($str52$_id_, stream, UNPROVIDED, UNPROVIDED);
            prin1(ti_id(task_info), stream);
            write_string($str53$_priority_, stream, UNPROVIDED, UNPROVIDED);
            prin1(ti_priority(task_info), stream);
            write_string($str54$_requestor_, stream, UNPROVIDED, UNPROVIDED);
            prin1(ti_requestor(task_info), stream);
            write_string($str55$_giveback_info_, stream, UNPROVIDED, UNPROVIDED);
            prin1(ti_giveback_info(task_info), stream);
            terpri(stream);
            write_string($str56$_bindings_, stream, UNPROVIDED, UNPROVIDED);
            prin1(ti_bindings(task_info), stream);
            terpri(stream);
            write_string($str57$_request_, stream, UNPROVIDED, UNPROVIDED);
            prin1(ti_request(task_info), stream);
            terpri(stream);
            write_string($str58$_response_, stream, UNPROVIDED, UNPROVIDED);
            prin1(ti_response(task_info), stream);
            terpri(stream);
            write_string($str59$_error_message_, stream, UNPROVIDED, UNPROVIDED);
            prin1(ti_error_message(task_info), stream);
            print_macros.print_unreadable_object_postamble(stream, task_info, T, T);
        }
        return task_info;
    }

    public static SubLObject task_result_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject task_result_set_p(final SubLObject v_object) {
        return v_object.getClass() == $task_result_set_native.class ? T : NIL;
    }

    public static SubLObject task_result_set_result(final SubLObject v_object) {
        assert NIL != task_result_set_p(v_object) : "task_processor.task_result_set_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject task_result_set_task_info(final SubLObject v_object) {
        assert NIL != task_result_set_p(v_object) : "task_processor.task_result_set_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject task_result_set_finished(final SubLObject v_object) {
        assert NIL != task_result_set_p(v_object) : "task_processor.task_result_set_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_task_result_set_result(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_result_set_p(v_object) : "task_processor.task_result_set_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_task_result_set_task_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_result_set_p(v_object) : "task_processor.task_result_set_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_task_result_set_finished(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_result_set_p(v_object) : "task_processor.task_result_set_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_task_result_set(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $task_result_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($RESULT)) {
                _csetf_task_result_set_result(v_new, current_value);
            } else
                if (pcase_var.eql($TASK_INFO)) {
                    _csetf_task_result_set_task_info(v_new, current_value);
                } else
                    if (pcase_var.eql($FINISHED)) {
                        _csetf_task_result_set_finished(v_new, current_value);
                    } else {
                        Errors.error($str42$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_task_result_set(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TASK_RESULT_SET, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $RESULT, task_result_set_result(obj));
        funcall(visitor_fn, obj, $SLOT, $TASK_INFO, task_result_set_task_info(obj));
        funcall(visitor_fn, obj, $SLOT, $FINISHED, task_result_set_finished(obj));
        funcall(visitor_fn, obj, $END, MAKE_TASK_RESULT_SET, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_task_result_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_task_result_set(obj, visitor_fn);
    }

    public static SubLObject new_task_result_set(final SubLObject result, final SubLObject task_info, final SubLObject finished) {
        assert NIL != booleanp(finished) : "Types.booleanp(finished) " + "CommonSymbols.NIL != Types.booleanp(finished) " + finished;
        final SubLObject result_set = make_task_result_set(UNPROVIDED);
        _csetf_task_result_set_result(result_set, result);
        _csetf_task_result_set_task_info(result_set, task_info);
        _csetf_task_result_set_finished(result_set, finished);
        return result_set;
    }

    public static SubLObject task_result_set_priority(final SubLObject task_result_set) {
        return ti_priority(task_result_set_task_info(task_result_set));
    }

    public static SubLObject task_processor_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_task_processor(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject task_processor_p(final SubLObject v_object) {
        return v_object.getClass() == $task_processor_native.class ? T : NIL;
    }

    public static SubLObject tproc_name(final SubLObject v_object) {
        assert NIL != task_processor_p(v_object) : "task_processor.task_processor_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject tproc_process(final SubLObject v_object) {
        assert NIL != task_processor_p(v_object) : "task_processor.task_processor_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject tproc_busy_p(final SubLObject v_object) {
        assert NIL != task_processor_p(v_object) : "task_processor.task_processor_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject tproc_task_info(final SubLObject v_object) {
        assert NIL != task_processor_p(v_object) : "task_processor.task_processor_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject _csetf_tproc_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor_p(v_object) : "task_processor.task_processor_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tproc_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor_p(v_object) : "task_processor.task_processor_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tproc_busy_p(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor_p(v_object) : "task_processor.task_processor_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tproc_task_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor_p(v_object) : "task_processor.task_processor_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject make_task_processor(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $task_processor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_tproc_name(v_new, current_value);
            } else
                if (pcase_var.eql($PROCESS)) {
                    _csetf_tproc_process(v_new, current_value);
                } else
                    if (pcase_var.eql($BUSY_P)) {
                        _csetf_tproc_busy_p(v_new, current_value);
                    } else
                        if (pcase_var.eql($TASK_INFO)) {
                            _csetf_tproc_task_info(v_new, current_value);
                        } else {
                            Errors.error($str42$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_task_processor(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TASK_PROCESSOR, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, tproc_name(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESS, tproc_process(obj));
        funcall(visitor_fn, obj, $SLOT, $BUSY_P, tproc_busy_p(obj));
        funcall(visitor_fn, obj, $SLOT, $TASK_INFO, tproc_task_info(obj));
        funcall(visitor_fn, obj, $END, MAKE_TASK_PROCESSOR, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_task_processor_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_task_processor(obj, visitor_fn);
    }

    public static SubLObject print_task_processor(final SubLObject v_task_processor, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_task_processor, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_task_processor, T, T);
            write_string($str103$name_, stream, UNPROVIDED, UNPROVIDED);
            princ(tproc_name(v_task_processor), stream);
            terpri(stream);
            write_string($str104$_process_, stream, UNPROVIDED, UNPROVIDED);
            princ(tproc_process(v_task_processor), stream);
            terpri(stream);
            write_string($str105$_whostate_, stream, UNPROVIDED, UNPROVIDED);
            princ(process_whostate(tproc_process(v_task_processor)), stream);
            write_string($str106$_busy_p_, stream, UNPROVIDED, UNPROVIDED);
            princ(tproc_busy_p(v_task_processor), stream);
            terpri(stream);
            if (NIL != tproc_task_info(v_task_processor)) {
                write_string($str57$_request_, stream, UNPROVIDED, UNPROVIDED);
                format_cycl_expression.format_cycl_expression(ti_request(tproc_task_info(v_task_processor)), stream, UNPROVIDED);
                terpri(stream);
                if (NIL != ti_response(tproc_task_info(v_task_processor))) {
                    write_string($str107$_last_response_, stream, UNPROVIDED, UNPROVIDED);
                    format_cycl_expression.format_cycl_expression(ti_response(tproc_task_info(v_task_processor)), stream, UNPROVIDED);
                    terpri(stream);
                }
            }
            print_macros.print_unreadable_object_postamble(stream, v_task_processor, T, T);
        }
        return v_task_processor;
    }

    public static SubLObject task_process_pool_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_task_process_pool(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject task_process_pool_p(final SubLObject v_object) {
        return v_object.getClass() == $task_process_pool_native.class ? T : NIL;
    }

    public static SubLObject tpool_lock(final SubLObject v_object) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject tpool_request_queue(final SubLObject v_object) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject tpool_request_semaphore(final SubLObject v_object) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject tpool_processors(final SubLObject v_object) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject tpool_background_msgs(final SubLObject v_object) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject tpool_process_name_prefix(final SubLObject v_object) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject tpool_min_nbr_of_task_processors(final SubLObject v_object) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField8();
    }

    public static SubLObject tpool_max_nbr_of_task_processors(final SubLObject v_object) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField9();
    }

    public static SubLObject _csetf_tpool_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tpool_request_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tpool_request_semaphore(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tpool_processors(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tpool_background_msgs(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_tpool_process_name_prefix(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_tpool_min_nbr_of_task_processors(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_tpool_max_nbr_of_task_processors(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_process_pool_p(v_object) : "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject make_task_process_pool(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $task_process_pool_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                _csetf_tpool_lock(v_new, current_value);
            } else
                if (pcase_var.eql($REQUEST_QUEUE)) {
                    _csetf_tpool_request_queue(v_new, current_value);
                } else
                    if (pcase_var.eql($REQUEST_SEMAPHORE)) {
                        _csetf_tpool_request_semaphore(v_new, current_value);
                    } else
                        if (pcase_var.eql($PROCESSORS)) {
                            _csetf_tpool_processors(v_new, current_value);
                        } else
                            if (pcase_var.eql($BACKGROUND_MSGS)) {
                                _csetf_tpool_background_msgs(v_new, current_value);
                            } else
                                if (pcase_var.eql($PROCESS_NAME_PREFIX)) {
                                    _csetf_tpool_process_name_prefix(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MIN_NBR_OF_TASK_PROCESSORS)) {
                                        _csetf_tpool_min_nbr_of_task_processors(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($MAX_NBR_OF_TASK_PROCESSORS)) {
                                            _csetf_tpool_max_nbr_of_task_processors(v_new, current_value);
                                        } else {
                                            Errors.error($str42$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_task_process_pool(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TASK_PROCESS_POOL, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, tpool_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUEST_QUEUE, tpool_request_queue(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUEST_SEMAPHORE, tpool_request_semaphore(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESSORS, tpool_processors(obj));
        funcall(visitor_fn, obj, $SLOT, $BACKGROUND_MSGS, tpool_background_msgs(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESS_NAME_PREFIX, tpool_process_name_prefix(obj));
        funcall(visitor_fn, obj, $SLOT, $MIN_NBR_OF_TASK_PROCESSORS, tpool_min_nbr_of_task_processors(obj));
        funcall(visitor_fn, obj, $SLOT, $MAX_NBR_OF_TASK_PROCESSORS, tpool_max_nbr_of_task_processors(obj));
        funcall(visitor_fn, obj, $END, MAKE_TASK_PROCESS_POOL, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_task_process_pool_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_task_process_pool(obj, visitor_fn);
    }

    public static SubLObject print_task_process_pool(final SubLObject task_process_pool, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(task_process_pool, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, task_process_pool, T, T);
            write_string($str143$_request_queue_, stream, UNPROVIDED, UNPROVIDED);
            princ(tpool_request_queue(task_process_pool), stream);
            terpri(stream);
            write_string($str144$_processors_, stream, UNPROVIDED, UNPROVIDED);
            princ(tpool_processors(task_process_pool), stream);
            terpri(stream);
            write_string($str145$_process_name_prefix_, stream, UNPROVIDED, UNPROVIDED);
            princ(get_tpool_process_name_prefix(task_process_pool), stream);
            terpri(stream);
            write_string($str146$_min_processors_, stream, UNPROVIDED, UNPROVIDED);
            princ(get_tpool_min_nbr_of_task_processors(task_process_pool), stream);
            terpri(stream);
            write_string($str147$_max_processors_, stream, UNPROVIDED, UNPROVIDED);
            princ(get_tpool_max_nbr_of_task_processors(task_process_pool), stream);
            terpri(stream);
            print_macros.print_unreadable_object_postamble(stream, task_process_pool, T, T);
        }
        return task_process_pool;
    }

    public static SubLObject display_task_processors(final SubLObject task_process_pool, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        assert NIL != streamp(stream) : "Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) " + stream;
        if (NIL != tpool_processors(task_process_pool)) {
            SubLObject cdolist_list_var = tpool_processors(task_process_pool);
            SubLObject v_task_processor = NIL;
            v_task_processor = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                print(v_task_processor, stream);
                cdolist_list_var = cdolist_list_var.rest();
                v_task_processor = cdolist_list_var.first();
            } 
        } else {
            princ($str148$There_are_no_task_processors_, stream);
            terpri(stream);
        }
        return NIL;
    }

    public static SubLObject display_active_task_processes(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject task_pool = get_task_process_pool_for_process(process);
            final SubLObject pool_processors = (NIL != task_pool) ? tpool_processors(task_pool) : NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                SubLObject csome_list_var = pool_processors;
                SubLObject pool_processor = NIL;
                pool_processor = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if ((tproc_process(pool_processor).equal(process) && (NIL != tproc_task_info(pool_processor))) && (NIL != ti_request(tproc_task_info(pool_processor)))) {
                        doneP = T;
                        format(stream, $str149$_S__, process);
                        format(stream, $str150$request__S__, ti_request(tproc_task_info(pool_processor)));
                    }
                    csome_list_var = csome_list_var.rest();
                    pool_processor = csome_list_var.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject task_processors_initialized_p(final SubLObject task_process_pool) {
        if (NIL == task_process_pool_p(task_process_pool)) {
            return NIL;
        }
        return listp(tpool_processors(task_process_pool));
    }

    public static SubLObject get_tpool_lock(final SubLObject task_process_pool) {
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        return tpool_lock(task_process_pool);
    }

    public static SubLObject set_tpool_lock(final SubLObject lock, final SubLObject task_process_pool) {
        assert NIL != lock_p(lock) : "Types.lock_p(lock) " + "CommonSymbols.NIL != Types.lock_p(lock) " + lock;
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        _csetf_tpool_lock(task_process_pool, lock);
        return NIL;
    }

    public static SubLObject get_tpool_request_queue(final SubLObject task_process_pool) {
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        return tpool_request_queue(task_process_pool);
    }

    public static SubLObject set_tpool_request_queue(final SubLObject request_queue, final SubLObject task_process_pool) {
        assert NIL != queues.priority_queue_p(request_queue) : "queues.priority_queue_p(request_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(request_queue) " + request_queue;
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        _csetf_tpool_request_queue(task_process_pool, request_queue);
        return NIL;
    }

    public static SubLObject get_tpool_processors(final SubLObject task_process_pool) {
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        return tpool_processors(task_process_pool);
    }

    public static SubLObject get_tpool_processors_nbr(final SubLObject task_process_pool) {
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        return length(tpool_processors(task_process_pool));
    }

    public static SubLObject push_tpool_processor(final SubLObject v_task_processor, final SubLObject task_process_pool) {
        assert NIL != task_processor_p(v_task_processor) : "task_processor.task_processor_p(v_task_processor) " + "CommonSymbols.NIL != task_processor.task_processor_p(v_task_processor) " + v_task_processor;
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        SubLObject task_processors = tpool_processors(task_process_pool);
        task_processors = cons(v_task_processor, task_processors);
        _csetf_tpool_processors(task_process_pool, task_processors);
        return NIL;
    }

    public static SubLObject set_tpool_processors(final SubLObject task_processors, final SubLObject task_process_pool) {
        assert NIL != listp(task_processors) : "Types.listp(task_processors) " + "CommonSymbols.NIL != Types.listp(task_processors) " + task_processors;
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        _csetf_tpool_processors(task_process_pool, task_processors);
        return NIL;
    }

    public static SubLObject set_tpool_background_msg_path(final SubLObject path) {
        assert NIL != stringp(path) : "Types.stringp(path) " + "CommonSymbols.NIL != Types.stringp(path) " + path;
        $tpool_background_msg_path$.setGlobalValue(path);
        return NIL;
    }

    public static SubLObject push_tpool_background_msg(final SubLObject msg, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(msg) : "Types.stringp(msg) " + "CommonSymbols.NIL != Types.stringp(msg) " + msg;
        if (((NIL != task_process_pool) && (!assertionsDisabledSynth)) && (NIL == task_process_pool_p(task_process_pool))) {
            throw new AssertionError(task_process_pool);
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($tpool_background_msg_lock$.getGlobalValue());
            if (NIL != $tpool_background_msg_path$.getGlobalValue()) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$tpool_background_msg_path$.getGlobalValue().isString())) {
                    Errors.error($str159$_A_is_not_a_valid_file_specificat, $tpool_background_msg_path$.getGlobalValue());
                }
                if (NIL == $tpool_background_msg_stream$.getGlobalValue()) {
                    $tpool_background_msg_stream$.setGlobalValue(StreamsLow.open($tpool_background_msg_path$.getGlobalValue(), new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE, $IF_EXISTS, $OVERWRITE }));
                }
                princ($str166$_, $tpool_background_msg_stream$.getGlobalValue());
                princ(process_name(current_process()), $tpool_background_msg_stream$.getGlobalValue());
                princ($str167$_, $tpool_background_msg_stream$.getGlobalValue());
                terpri($tpool_background_msg_stream$.getGlobalValue());
                princ($$$__, $tpool_background_msg_stream$.getGlobalValue());
                princ(numeric_date_utilities.timestring(UNPROVIDED), $tpool_background_msg_stream$.getGlobalValue());
                princ($$$__, $tpool_background_msg_stream$.getGlobalValue());
                princ(msg, $tpool_background_msg_stream$.getGlobalValue());
                terpri($tpool_background_msg_stream$.getGlobalValue());
            } else
                if ((NIL != $queue_tpool_background_msgs_when_no_pathP$.getDynamicValue(thread)) && (NIL != task_process_pool)) {
                    SubLObject background_msgs = NIL;
                    background_msgs = tpool_background_msgs(task_process_pool);
                    background_msgs = cons(cconcatenate(numeric_date_utilities.timestring(UNPROVIDED), new SubLObject[]{ $$$_, msg }), background_msgs);
                    _csetf_tpool_background_msgs(task_process_pool, background_msgs);
                }

        } finally {
            if (NIL != release) {
                release_lock($tpool_background_msg_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject flush_tpool_background_msgs() {
        if ($tpool_background_msg_lock$.getGlobalValue().isLock()) {
            SubLObject release = NIL;
            try {
                release = seize_lock($tpool_background_msg_lock$.getGlobalValue());
                if (NIL != $tpool_background_msg_path$.getGlobalValue()) {
                    force_output($tpool_background_msg_stream$.getGlobalValue());
                }
            } finally {
                if (NIL != release) {
                    release_lock($tpool_background_msg_lock$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    public static SubLObject show_tp_msgs(final SubLObject task_process_pool) {
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        SubLObject cdolist_list_var = nreverse(tpool_background_msgs(task_process_pool));
        SubLObject msg = NIL;
        msg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            princ(msg, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            msg = cdolist_list_var.first();
        } 
        _csetf_tpool_background_msgs(task_process_pool, NIL);
        return NIL;
    }

    public static SubLObject show_tp_msgs_with_process_name(final SubLObject process_name) {
        assert NIL != stringp(process_name) : "Types.stringp(process_name) " + "CommonSymbols.NIL != Types.stringp(process_name) " + process_name;
        show_tp_msgs(find_task_process_pool(process_name));
        return NIL;
    }

    public static SubLObject set_tpool_process_name_prefix(final SubLObject process_name_prefix, final SubLObject task_process_pool) {
        assert NIL != stringp(process_name_prefix) : "Types.stringp(process_name_prefix) " + "CommonSymbols.NIL != Types.stringp(process_name_prefix) " + process_name_prefix;
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        _csetf_tpool_process_name_prefix(task_process_pool, process_name_prefix);
        return NIL;
    }

    public static SubLObject get_tpool_process_name_prefix(final SubLObject task_process_pool) {
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        return tpool_process_name_prefix(task_process_pool);
    }

    public static SubLObject set_tpool_min_nbr_of_task_processors(final SubLObject min_nbr_of_task_processors, final SubLObject task_process_pool) {
        assert NIL != integerp(min_nbr_of_task_processors) : "Types.integerp(min_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(min_nbr_of_task_processors) " + min_nbr_of_task_processors;
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        _csetf_tpool_min_nbr_of_task_processors(task_process_pool, min_nbr_of_task_processors);
        return NIL;
    }

    public static SubLObject get_tpool_min_nbr_of_task_processors(final SubLObject task_process_pool) {
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        return tpool_min_nbr_of_task_processors(task_process_pool);
    }

    public static SubLObject set_tpool_max_nbr_of_task_processors(final SubLObject max_nbr_of_task_processors, final SubLObject task_process_pool) {
        assert NIL != integerp(max_nbr_of_task_processors) : "Types.integerp(max_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(max_nbr_of_task_processors) " + max_nbr_of_task_processors;
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        _csetf_tpool_max_nbr_of_task_processors(task_process_pool, max_nbr_of_task_processors);
        return NIL;
    }

    public static SubLObject get_tpool_max_nbr_of_task_processors(final SubLObject task_process_pool) {
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        return tpool_max_nbr_of_task_processors(task_process_pool);
    }

    public static SubLObject get_nbr_of_task_processors(final SubLObject task_process_pool) {
        return length(tpool_processors(task_process_pool));
    }

    public static SubLObject start_task_processor_logging_to_file(final SubLObject filename, SubLObject level) {
        if (level == UNPROVIDED) {
            level = NIL;
        }
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        if (((NIL != level) && (!assertionsDisabledSynth)) && (NIL == subl_promotions.non_negative_integer_p(level))) {
            throw new AssertionError(level);
        }
        end_task_processor_logging_to_file();
        if (NIL != level) {
            set_task_processor_verbosity(level);
        }
        set_tpool_background_msg_path(filename);
        return NIL;
    }

    public static SubLObject end_task_processor_logging_to_file() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_file = $tpool_background_msg_path$.getGlobalValue();
        final SubLObject old_stream = $tpool_background_msg_stream$.getGlobalValue();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (NIL != old_stream) {
                        try {
                            flush_tpool_background_msgs();
                        } finally {
                            final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                $tpool_background_msg_stream$.setGlobalValue(NIL);
                                close(old_stream, UNPROVIDED);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                            }
                        }
                    }
                    $tpool_background_msg_path$.setGlobalValue(NIL);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (old_file.isString() && (NIL != Filesys.probe_file(old_file))) {
            return file_utilities.get_file_length(old_file);
        }
        return NIL;
    }

    public static SubLObject save_unlogged_task_processor_messages_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str177$Unable_to_open__S, filename);
            }
            final SubLObject out = stream;
            final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding(thread);
            try {
                StreamsLow.$standard_output$.bind(out, thread);
                show_tp_msgs($api_task_process_pool$.getGlobalValue());
            } finally {
                StreamsLow.$standard_output$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return file_utilities.get_file_length(filename);
    }

    public static SubLObject eval_with_bindings(final SubLObject v_bindings, final SubLObject form, final SubLObject eval_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject form_to_eval = NIL;
        final SubLObject _prev_bind_0 = $eval_with_bindings$.currentBinding(thread);
        try {
            $eval_with_bindings$.bind(NIL, thread);
            form_to_eval = list(CLET, append(v_bindings, NIL), list(CSETQ, $eval_with_bindings$, form));
            try {
                process_utilities.current_process_note_form(form_to_eval);
                if (symbol_function(CYC_API_EVAL).eql(eval_fn)) {
                    eval_in_api.cyc_api_eval(form_to_eval);
                } else
                    if (symbol_function(EVAL).eql(eval_fn)) {
                        eval(form_to_eval);
                    } else {
                        funcall(eval_fn, form_to_eval);
                    }

            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    process_utilities.current_process_clear_form();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
            result = $eval_with_bindings$.getDynamicValue(thread);
        } finally {
            $eval_with_bindings$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject get_task_process_pool_for_process(final SubLObject process) {
        assert NIL != processp(process) : "Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) " + process;
        return dictionary_utilities.synchronized_dictionary_lookup($process_to_task_process_pool$.getGlobalValue(), process, UNPROVIDED);
    }

    public static SubLObject add_task_process_pool_for_process(final SubLObject process, final SubLObject task_process_pool) {
        assert NIL != processp(process) : "Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) " + process;
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        return dictionary_utilities.synchronized_dictionary_enter($process_to_task_process_pool$.getGlobalValue(), process, task_process_pool);
    }

    public static SubLObject remove_task_process_pool_for_process(final SubLObject process) {
        assert NIL != processp(process) : "Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) " + process;
        return dictionary_utilities.synchronized_dictionary_remove($process_to_task_process_pool$.getGlobalValue(), process);
    }

    public static SubLObject ensure_task_process_being_worked_on_initialized() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($task_processes_being_worked_on_lock$.getGlobalValue());
            if (NIL == cache.cache_p($task_processes_being_worked_on$.getGlobalValue())) {
                $task_processes_being_worked_on$.setGlobalValue(cache.new_cache($task_processes_worked_on_history$.getDynamicValue(thread), symbol_function(EQUAL)));
            }
        } finally {
            if (NIL != release) {
                release_lock($task_processes_being_worked_on_lock$.getGlobalValue());
            }
        }
        return $task_processes_being_worked_on$.getGlobalValue();
    }

    public static SubLObject compute_task_process_description_from_task_info(final SubLObject task_info) {
        return compute_task_process_description(get_task_info_id(task_info), get_task_info_giveback_info(task_info));
    }

    public static SubLObject compute_task_process_description(final SubLObject task_id, final SubLObject giveback_info) {
        return cons(task_id, giveback_info);
    }

    public static SubLObject get_giveback_info_from_task_process_description(final SubLObject task_process_description) {
        return task_process_description.rest();
    }

    public static SubLObject note_active_task_process_description_if_permitted(final SubLObject task_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject signature = compute_task_process_description_from_task_info(task_info);
        final SubLObject process = current_process();
        SubLObject retval = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($task_processes_being_worked_on_lock$.getGlobalValue());
            ensure_task_process_being_worked_on_initialized();
            thread.resetMultipleValues();
            final SubLObject reason_to_stop_nowP = cache.cache_get($task_processes_being_worked_on$.getGlobalValue(), signature);
            final SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == foundP) {
                cache.cache_set($task_processes_being_worked_on$.getGlobalValue(), signature, process);
            } else {
                retval = reason_to_stop_nowP;
            }
        } finally {
            if (NIL != release) {
                release_lock($task_processes_being_worked_on_lock$.getGlobalValue());
            }
        }
        return retval;
    }

    public static SubLObject note_inactive_task_process_description(final SubLObject task_info) {
        final SubLObject signature = compute_task_process_description_from_task_info(task_info);
        SubLObject release = NIL;
        try {
            release = seize_lock($task_processes_being_worked_on_lock$.getGlobalValue());
            if (NIL != cache.cache_p($task_processes_being_worked_on$.getGlobalValue())) {
                cache.cache_remove($task_processes_being_worked_on$.getGlobalValue(), signature);
            }
        } finally {
            if (NIL != release) {
                release_lock($task_processes_being_worked_on_lock$.getGlobalValue());
            }
        }
        return task_info;
    }

    public static SubLObject task_process_termination_reason_p(final SubLObject reason) {
        return makeBoolean(reason.isKeyword() && ((reason == $ABORT) || (reason == $CANCEL)));
    }

    public static SubLObject terminate_active_task_process(final SubLObject task_id, final SubLObject task_giveback_info, final SubLObject reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != task_process_termination_reason_p(reason) : "task_processor.task_process_termination_reason_p(reason) " + "CommonSymbols.NIL != task_processor.task_process_termination_reason_p(reason) " + reason;
        final SubLObject signature = compute_task_process_description(task_id, task_giveback_info);
        SubLObject release = NIL;
        try {
            release = seize_lock($task_processes_being_worked_on_lock$.getGlobalValue());
            ensure_task_process_being_worked_on_initialized();
            thread.resetMultipleValues();
            final SubLObject process_handling_task = cache.cache_get($task_processes_being_worked_on$.getGlobalValue(), signature);
            final SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != foundP) {
                signal_terminate_active_task_process(process_handling_task, reason, task_id, task_giveback_info);
            } else {
                cache.cache_set($task_processes_being_worked_on$.getGlobalValue(), signature, reason);
            }
        } finally {
            if (NIL != release) {
                release_lock($task_processes_being_worked_on_lock$.getGlobalValue());
            }
        }
        return reason;
    }

    public static SubLObject terminate_active_task_processes(final SubLObject task_giveback_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($task_processes_being_worked_on_lock$.getGlobalValue());
            if (NIL != cache.cache_p($task_processes_being_worked_on$.getGlobalValue())) {
                final SubLObject cache_var = $task_processes_being_worked_on$.getGlobalValue();
                final SubLObject order_var = $NEWEST;
                SubLObject entry = cache.do_cache_first(cache_var, order_var);
                SubLObject task_process_description = NIL;
                SubLObject process_handling_task = NIL;
                while (NIL == cache.do_cache_doneP(cache_var, entry)) {
                    task_process_description = cache.do_cache_key(entry);
                    process_handling_task = cache.do_cache_value(entry);
                    entry = cache.do_cache_next(entry, order_var);
                    final SubLObject current_giveback_info = get_giveback_info_from_task_process_description(task_process_description);
                    if (current_giveback_info.equal(task_giveback_info) && (NIL != valid_process_p(process_handling_task))) {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push($IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    signal_terminate_active_task_process(process_handling_task, $ABORT, MINUS_ONE_INTEGER, task_giveback_info);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                    }
                } 
            }
        } finally {
            if (NIL != release) {
                release_lock($task_processes_being_worked_on_lock$.getGlobalValue());
            }
        }
        return task_giveback_info;
    }

    public static SubLObject signal_terminate_active_task_process(final SubLObject process, final SubLObject reason, final SubLObject task_id, final SubLObject task_giveback_info) {
        if (reason.eql($ABORT)) {
            subl_promotions.interrupt_process_with_args(process, symbol_function(SIGNAL_ABORT_ACTIVE_TASK_PROCESS), list(task_id, task_giveback_info));
        } else
            if (reason.eql($CANCEL)) {
                subl_promotions.interrupt_process_with_args(process, symbol_function(SIGNAL_CANCEL_ACTIVE_TASK_PROCESS), list(task_id, task_giveback_info));
            } else {
                Errors.error($str191$API_error__Unknown_active_task_pr, reason);
            }

        return reason;
    }

    public static SubLObject signal_abort_active_task_process(final SubLObject task_id, final SubLObject uuid) {
        final SubLObject task_info = get_current_task_processor_info();
        if (NIL == task_info) {
            return NIL;
        }
        if (!uuid.equal(ti_giveback_info(task_info))) {
            return NIL;
        }
        if (task_id.numGE(ZERO_INTEGER) && (!task_id.eql(ti_id(task_info)))) {
            return NIL;
        }
        sublisp_throw($TERMINATE_PREMATURELY, $ABORT);
        return NIL;
    }

    public static SubLObject signal_cancel_active_task_process(final SubLObject task_id, final SubLObject uuid) {
        final SubLObject task_info = get_current_task_processor_info();
        if (NIL == task_info) {
            return NIL;
        }
        if (!uuid.equal(ti_giveback_info(task_info))) {
            return NIL;
        }
        if (task_id.numGE(ZERO_INTEGER) && (!task_id.eql(ti_id(task_info)))) {
            return NIL;
        }
        sublisp_throw($TERMINATE_PREMATURELY, $CANCEL);
        return NIL;
    }

    public static SubLObject catch_task_processor_termination(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject ans_var = NIL;
        destructuring_bind_must_consp(current, datum, $list193);
        ans_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CCATCH, $TERMINATE_PREMATURELY, ans_var, bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject catch_task_processor_termination_quietly(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject ans_var = $sym198$ANS_VAR;
        return list(CATCH_TASK_PROCESSOR_TERMINATION, ans_var, bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject get_current_task_processor_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_task_processor_info$.getDynamicValue(thread);
    }

    public static SubLObject get_current_task_processor_client() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $current_task_processor_info$.getDynamicValue(thread)) {
            return get_task_info_giveback_info($current_task_processor_info$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject map_task_info_priority_to_process_priority(final SubLObject priority) {
        return max($process_min_priority$.getGlobalValue(), min(priority, $process_max_priority$.getGlobalValue()));
    }

    public static SubLObject task_processor_handler() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        for (SubLObject task_process_pool = get_task_process_pool_for_process(current_process()); NIL == task_process_pool; task_process_pool = get_task_process_pool_for_process(current_process())) {
            sleep($float$0_001);
        }
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($TASK_PROCESSOR_QUIT);
            final SubLObject task_process_pool2 = get_task_process_pool_for_process(current_process());
            final SubLObject v_task_processor = find_task_processor(process_name(current_process()), task_process_pool2);
            SubLObject eval_fn = NIL;
            SubLObject task_info = NIL;
            SubLObject request = NIL;
            SubLObject response = NIL;
            final SubLObject junk = NIL;
            SubLObject error_message = NIL;
            SubLObject dont_care_abort_reason = NIL;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == task_processor_p(v_task_processor))) {
                Errors.error($str204$Invalid_task_processor);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == task_process_pool_p(task_process_pool2))) {
                Errors.error($str205$Invalid_task_process_pool);
            }
            while (true) {
                task_info = NIL;
                response = NIL;
                error_message = NIL;
                try {
                    thread.throwStack.push($TERMINATE_PREMATURELY);
                    _csetf_tproc_busy_p(v_task_processor, NIL);
                    Semaphores.semaphore_wait(tpool_request_semaphore(task_process_pool2));
                    final SubLObject lock = get_tpool_lock(task_process_pool2);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        task_info = queues.p_dequeue(tpool_request_queue(task_process_pool2), UNPROVIDED);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                    if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                        push_tpool_background_msg(format(NIL, $str206$Task_Info__S__, task_info), task_process_pool2);
                    }
                    request = ti_request(task_info);
                    _csetf_ti_task_processor_name(task_info, tproc_name(v_task_processor));
                    _csetf_tproc_task_info(v_task_processor, task_info);
                    eval_fn = dictionary.dictionary_lookup($task_processor_eval_fn_dict$.getGlobalValue(), ti_type(task_info), UNPROVIDED);
                    try {
                        final SubLObject _prev_bind_0 = $current_task_processor_info$.currentBinding(thread);
                        try {
                            $current_task_processor_info$.bind(task_info, thread);
                            SubLObject abort_reason = note_active_task_process_description_if_permitted(task_info);
                            final SubLObject priority = get_task_info_priority(task_info);
                            set_process_priority(current_process(), map_task_info_priority_to_process_priority(priority));
                            if (NIL == abort_reason) {
                                try {
                                    thread.throwStack.push($TERMINATE_PREMATURELY);
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                response = eval_with_bindings(ti_bindings(task_info), request, eval_fn);
                                            } catch (final Throwable catch_var_$4) {
                                                Errors.handleThrowable(catch_var_$4, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    abort_reason = Errors.handleThrowable(ccatch_env_var, $TERMINATE_PREMATURELY);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (NIL != abort_reason) {
                                    error_message = abort_reason;
                                }
                                if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                                    push_tpool_background_msg(format(NIL, $str208$Response__S__, response), task_process_pool2);
                                    if (error_message.isString()) {
                                        push_tpool_background_msg(format(NIL, $str209$Error_message__S__, error_message), task_process_pool2);
                                    }
                                }
                                _csetf_ti_response(task_info, response);
                                if (abort_reason != $ABORT) {
                                    _csetf_ti_error_message(task_info, error_message);
                                }
                                try {
                                    thread.throwStack.push($TERMINATE_PREMATURELY);
                                    dispatch_task_processor_response(task_info, T);
                                } catch (final Throwable ccatch_env_var) {
                                    abort_reason = Errors.handleThrowable(ccatch_env_var, $TERMINATE_PREMATURELY);
                                } finally {
                                    thread.throwStack.pop();
                                }
                            }
                        } finally {
                            $current_task_processor_info$.rebind(_prev_bind_0, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            note_inactive_task_process_description(task_info);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                } catch (final Throwable ccatch_env_var2) {
                    dont_care_abort_reason = Errors.handleThrowable(ccatch_env_var2, $TERMINATE_PREMATURELY);
                } finally {
                    thread.throwStack.pop();
                }
            } 
        } catch (final Throwable ccatch_env_var3) {
            catch_var = Errors.handleThrowable(ccatch_env_var3, $TASK_PROCESSOR_QUIT);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject post_task_info_processor_partial_results(final SubLObject results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(results) : "Types.listp(results) " + "CommonSymbols.NIL != Types.listp(results) " + results;
        final SubLObject task_process_pool = get_task_process_pool_for_process(current_process());
        if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
            push_tpool_background_msg(format(NIL, $str210$Posting_partial_results__A_at__A, results, numeric_date_utilities.timestring(get_universal_time())), task_process_pool);
        }
        return post_task_info_processor_partial_results_internal(task_process_pool, results);
    }

    public static SubLObject post_task_info_processor_partial_results_internal(final SubLObject task_process_pool, final SubLObject results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == task_process_pool_p(task_process_pool)) {
            Errors.error($str211$Function_only_valid_from_within_a, current_process());
        }
        final SubLObject task_info = get_current_task_processor_info();
        final SubLObject _prev_bind_0 = $minimize_task_processor_info_communication$.currentBinding(thread);
        try {
            $minimize_task_processor_info_communication$.bind(NIL, thread);
            _csetf_ti_response(task_info, results);
            dispatch_task_processor_response(task_info, NIL);
        } finally {
            $minimize_task_processor_info_communication$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    public static SubLObject initialize_task_processors(SubLObject process_name_prefix, SubLObject min_nbr_of_task_processors, SubLObject max_nbr_of_task_processors) {
        if (process_name_prefix == UNPROVIDED) {
            process_name_prefix = $$$Task_processor_;
        }
        if (min_nbr_of_task_processors == UNPROVIDED) {
            min_nbr_of_task_processors = $min_nbr_of_task_processors$.getGlobalValue();
        }
        if (max_nbr_of_task_processors == UNPROVIDED) {
            max_nbr_of_task_processors = $max_nbr_of_task_processors$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(min_nbr_of_task_processors) : "Types.integerp(min_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(min_nbr_of_task_processors) " + min_nbr_of_task_processors;
        assert NIL != integerp(max_nbr_of_task_processors) : "Types.integerp(max_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(max_nbr_of_task_processors) " + max_nbr_of_task_processors;
        assert NIL != stringp(process_name_prefix) : "Types.stringp(process_name_prefix) " + "CommonSymbols.NIL != Types.stringp(process_name_prefix) " + process_name_prefix;
        $task_processor_standard_output$.setDynamicValue(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
        SubLObject task_process_pool = NIL;
        task_process_pool = make_task_process_pool(UNPROVIDED);
        set_tpool_process_name_prefix(process_name_prefix, task_process_pool);
        set_tpool_min_nbr_of_task_processors(min_nbr_of_task_processors, task_process_pool);
        set_tpool_max_nbr_of_task_processors(max_nbr_of_task_processors, task_process_pool);
        if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
            push_tpool_background_msg(format(NIL, $str214$Initializing_task_processors__), task_process_pool);
        }
        set_tpool_lock(make_lock(format(NIL, $str215$_alock, process_name_prefix)), task_process_pool);
        _csetf_tpool_request_semaphore(task_process_pool, Semaphores.new_semaphore($str216$task_pool_request_semaphore, ZERO_INTEGER));
        set_tpool_request_queue(queues.create_p_queue($task_request_queue_max_size$.getGlobalValue(), TI_PRIORITY, UNPROVIDED), task_process_pool);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(min_nbr_of_task_processors); i = add(i, ONE_INTEGER)) {
            add_new_task_processor_to_pool(task_process_pool);
        }
        return task_process_pool;
    }

    public static SubLObject add_new_task_processor_to_pool(final SubLObject task_process_pool) {
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        final SubLObject v_task_processor = make_task_processor(UNPROVIDED);
        final SubLObject process_name_prefix = get_tpool_process_name_prefix(task_process_pool);
        final SubLObject nbr_of_task_processors = get_nbr_of_task_processors(task_process_pool);
        _csetf_tproc_name(v_task_processor, format(NIL, $str217$_a_s, process_name_prefix, add(nbr_of_task_processors, ONE_INTEGER)));
        _csetf_tproc_process(v_task_processor, make_process(tproc_name(v_task_processor), symbol_function(TASK_PROCESSOR_HANDLER)));
        push_tpool_processor(v_task_processor, task_process_pool);
        add_task_process_pool_for_process(tproc_process(v_task_processor), task_process_pool);
        return NIL;
    }

    public static SubLObject halt_task_processors(final SubLObject task_process_pool) {
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        SubLObject cdolist_list_var = tpool_processors(task_process_pool);
        SubLObject v_task_processor = NIL;
        v_task_processor = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            halt_task_processor(v_task_processor);
            remove_task_process_pool_for_process(tproc_process(v_task_processor));
            cdolist_list_var = cdolist_list_var.rest();
            v_task_processor = cdolist_list_var.first();
        } 
        _csetf_tpool_processors(task_process_pool, NIL);
        return NIL;
    }

    public static SubLObject halt_task_processor(final SubLObject v_task_processor) {
        assert NIL != task_processor_p(v_task_processor) : "task_processor.task_processor_p(v_task_processor) " + "CommonSymbols.NIL != task_processor.task_processor_p(v_task_processor) " + v_task_processor;
        SubLObject process = tproc_process(v_task_processor);
        if (NIL != valid_process_p(process)) {
            halt_task_processor_via_interrupt(process);
        }
        remove_task_process_pool_for_process(process);
        process = NIL;
        return NIL;
    }

    public static SubLObject halt_task_processor_via_interrupt(final SubLObject process) {
        return interrupt_process(process, symbol_function(TASK_PROCESSOR_QUIT));
    }

    public static SubLObject ensure_task_processors_killed(final SubLObject type) {
        assert NIL != stringp(type) : "Types.stringp(type) " + "CommonSymbols.NIL != Types.stringp(type) " + type;
        final SubLObject prefix = cconcatenate(type, $$$_processor_);
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject process_name = process_name(process);
            if (NIL != string_utilities.starts_with(process_name, prefix)) {
                format(T, $str222$_Killing__A___, process_name);
                kill_process(process);
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject task_processor_quit() {
        sublisp_throw($TASK_PROCESSOR_QUIT, NIL);
        return NIL;
    }

    public static SubLObject find_task_processor(final SubLObject process_name, final SubLObject task_process_pool) {
        assert NIL != stringp(process_name) : "Types.stringp(process_name) " + "CommonSymbols.NIL != Types.stringp(process_name) " + process_name;
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        SubLObject cdolist_list_var = tpool_processors(task_process_pool);
        SubLObject v_task_processor = NIL;
        v_task_processor = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != Strings.stringE(process_name, tproc_name(v_task_processor), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return v_task_processor;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_task_processor = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject find_task_process_pool(final SubLObject process_name) {
        assert NIL != stringp(process_name) : "Types.stringp(process_name) " + "CommonSymbols.NIL != Types.stringp(process_name) " + process_name;
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject running_process_name = process_name(process);
            if (NIL != Strings.stringE(process_name, running_process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return get_task_process_pool_for_process(process);
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject awaken_first_available_task_processors(final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (get_nbr_of_task_processors(task_process_pool).numL(get_tpool_max_nbr_of_task_processors(task_process_pool))) {
            if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                push_tpool_background_msg(format(NIL, $str223$Allocating_a_new_task_processor__), task_process_pool);
            }
            add_new_task_processor_to_pool(task_process_pool);
        }
        push_tpool_background_msg(format(NIL, $str224$Awakening_first_available_task_pr), task_process_pool);
        Semaphores.semaphore_signal(tpool_request_semaphore(task_process_pool));
        return NIL;
    }

    public static SubLObject enqueue_task_request(final SubLObject task_info, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != task_info_p(task_info) : "task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) " + task_info;
        assert NIL != task_process_pool_p(task_process_pool) : "task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) " + task_process_pool;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == tpool_processors(task_process_pool))) {
            Errors.error($str225$Task_processors_are_not_initializ);
        }
        final SubLObject lock = tpool_lock(task_process_pool);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            thread.resetMultipleValues();
            final SubLObject request_queue = queues.p_enqueue(task_info, tpool_request_queue(task_process_pool));
            final SubLObject bumped_requestP = thread.secondMultipleValue();
            final SubLObject bumped_request_item = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != bumped_requestP) {
                Errors.cerror($str226$__Error__cannot_queue_task_reques, bumped_request_item);
            }
            awaken_first_available_task_processors(task_process_pool);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return NIL;
    }

    public static SubLObject with_long_running_task_process(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list228, listS(CUNWIND_PROTECT, listS(PROGN, $list230, append(body, NIL)), $list231));
    }

    public static SubLObject declare_task_process_pool(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = NIL;
        SubLObject min_nbr_of_task_processors = NIL;
        SubLObject max_nbr_of_task_processors = NIL;
        destructuring_bind_must_consp(current, datum, $list232);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list232);
        min_nbr_of_task_processors = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list232);
        max_nbr_of_task_processors = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list232);
            return NIL;
        }
        assert NIL != stringp(type) : "Types.stringp(type) " + "CommonSymbols.NIL != Types.stringp(type) " + type;
        assert NIL != integerp(min_nbr_of_task_processors) : "Types.integerp(min_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(min_nbr_of_task_processors) " + min_nbr_of_task_processors;
        assert NIL != integerp(max_nbr_of_task_processors) : "Types.integerp(max_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(max_nbr_of_task_processors) " + max_nbr_of_task_processors;
        final SubLObject task_process_pool = intern(cconcatenate($str233$_, new SubLObject[]{ type, $str234$_TASK_PROCESS_POOL_ }), UNPROVIDED);
        final SubLObject task_process_pool_lock = intern(cconcatenate($str233$_, new SubLObject[]{ type, $str235$_TASK_PROCESS_POOL_LOCK_ }), UNPROVIDED);
        return list(PROGN, listS(DEFLEXICAL_PUBLIC, task_process_pool, $list237), listS(DEFCONSTANT_PUBLIC, task_process_pool_lock, $list239), list(DEFINE_PUBLIC, intern(cconcatenate(type, $str241$_TASK_PROCESSORS_INITIALIZED_P), UNPROVIDED), NIL, $str242$Return_T_when_there_are_task_proc, list(RET, list(TASK_PROCESSORS_INITIALIZED_P, task_process_pool))), listS(DEFINE_PUBLIC, intern(cconcatenate($str245$INITIALIZE_, new SubLObject[]{ type, $str246$_TASK_PROCESSORS }), UNPROVIDED), NIL, $str247$Initialize_the_task_processor_poo, list(WITH_LOCK_HELD, list(task_process_pool_lock), listS(PWHEN, task_process_pool, $list250), list(CSETQ, task_process_pool, list(INITIALIZE_TASK_PROCESSORS, listS(CCONCATENATE, type, $list253), min_nbr_of_task_processors, max_nbr_of_task_processors))), $list254), listS(DEFINE_PUBLIC, intern(cconcatenate($str255$HALT_, new SubLObject[]{ type, $str246$_TASK_PROCESSORS }), UNPROVIDED), NIL, $str256$Halt_the_task_processors_, list(WITH_LOCK_HELD, list(task_process_pool_lock), list(PWHEN, task_process_pool, list(HALT_TASK_PROCESSORS, task_process_pool), $list258, listS(CSETQ, task_process_pool, $list259), list(ENSURE_TASK_PROCESSORS_KILLED, type))), $list254), listS(DEFINE_PUBLIC, intern(cconcatenate($str260$RESTART_, new SubLObject[]{ type, $str246$_TASK_PROCESSORS }), UNPROVIDED), NIL, $str261$Restart__halt___initialize__the_t, list(WITH_LOCK_HELD, list(task_process_pool_lock), list(PWHEN, task_process_pool, list(HALT_TASK_PROCESSORS, task_process_pool), listS(CSETQ, task_process_pool, $list259), list(ENSURE_TASK_PROCESSORS_KILLED, type)), list(CSETQ, task_process_pool, list(INITIALIZE_TASK_PROCESSORS, listS(CCONCATENATE, type, $list253), min_nbr_of_task_processors, max_nbr_of_task_processors))), $list254), listS(DEFINE_PUBLIC, intern(cconcatenate($str262$SHOW_, new SubLObject[]{ type, $str263$_TP_MSGS }), UNPROVIDED), NIL, $str264$Show_and_reset_the_task_processor, list(PWHEN, task_process_pool, list(SHOW_TP_MSGS, task_process_pool)), $list254));
    }

    public static SubLObject declare_task_process_request(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = NIL;
        SubLObject eval_fn = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list266);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list266);
        eval_fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list266);
        args = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(DEFINE_PUBLIC, intern(cconcatenate(type, $str267$_TASK_PROCESSOR_REQUEST), UNPROVIDED), args, append(body, NIL)), $list268, list(DICTIONARY_ENTER, $task_processor_eval_fn_dict$, make_keyword(type), eval_fn));
    }

    public static SubLObject declare_task_process_response_dispatch(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, $list271);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list271);
        args = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject response_dispatch_fn = intern(cconcatenate($str272$DISPATCH_, new SubLObject[]{ type, $str273$_TASK_PROCESSOR_RESPONSE }), UNPROVIDED);
        return list(PROGN, listS(DEFINE_PUBLIC, response_dispatch_fn, args, append(body, NIL)), $list274, list(DICTIONARY_ENTER, $task_processor_response_dispatch_fn_dict$, make_keyword(type), list(FUNCTION, response_dispatch_fn)));
    }

    public static SubLObject api_task_processors_initialized_p() {
        return task_processors_initialized_p($api_task_process_pool$.getGlobalValue());
    }

    public static SubLObject initialize_api_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock($api_task_process_pool_lock$.getGlobalValue());
            if (NIL != $api_task_process_pool$.getGlobalValue()) {
                Errors.error($str278$Illegal_attempt_to_reinitialize_p);
            }
            $api_task_process_pool$.setGlobalValue(initialize_task_processors(cconcatenate($$$API, $$$_processor_), FIVE_INTEGER, $int$25));
        } finally {
            if (NIL != release) {
                release_lock($api_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject halt_api_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock($api_task_process_pool_lock$.getGlobalValue());
            if (NIL != $api_task_process_pool$.getGlobalValue()) {
                halt_task_processors($api_task_process_pool$.getGlobalValue());
                flush_tpool_background_msgs();
                $api_task_process_pool$.setGlobalValue(NIL);
                ensure_task_processors_killed($$$API);
            }
        } finally {
            if (NIL != release) {
                release_lock($api_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject restart_api_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock($api_task_process_pool_lock$.getGlobalValue());
            if (NIL != $api_task_process_pool$.getGlobalValue()) {
                halt_task_processors($api_task_process_pool$.getGlobalValue());
                $api_task_process_pool$.setGlobalValue(NIL);
                ensure_task_processors_killed($$$API);
            }
            $api_task_process_pool$.setGlobalValue(initialize_task_processors(cconcatenate($$$API, $$$_processor_), FIVE_INTEGER, $int$25));
        } finally {
            if (NIL != release) {
                release_lock($api_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject show_api_tp_msgs() {
        if (NIL != $api_task_process_pool$.getGlobalValue()) {
            show_tp_msgs($api_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject show_api_task_processors() {
        display_api_task_processors();
        return NIL;
    }

    public static SubLObject display_api_task_processors() {
        if (NIL != $api_task_process_pool$.getGlobalValue()) {
            display_task_processors($api_task_process_pool$.getGlobalValue(), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject api_task_processor_request(SubLObject request, final SubLObject id, final SubLObject priority, final SubLObject requestor, final SubLObject v_bindings, final SubLObject uuid_string) {
        final SubLObject immediate_executionP = eq(request.first(), WITH_IMMEDIATE_EXECUTION);
        final SubLObject task_info = make_task_info(UNPROVIDED);
        if (NIL != immediate_executionP) {
            request = second(request);
        }
        set_task_info_type($API, task_info);
        set_task_info_id(id, task_info);
        set_task_info_priority(priority, task_info);
        set_task_info_requestor(requestor, task_info);
        set_task_info_giveback_info(uuid_string, task_info);
        set_task_info_bindings(v_bindings, task_info);
        set_task_info_request(request, task_info);
        enqueue_task_request(task_info, $api_task_process_pool$.getGlobalValue());
        return NIL;
    }

    public static SubLObject set_java_api_lease_activity_display(final SubLObject indicator) {
        assert NIL != booleanp(indicator) : "Types.booleanp(indicator) " + "CommonSymbols.NIL != Types.booleanp(indicator) " + indicator;
        $java_api_lease_activity_display$.setGlobalValue(indicator);
        return $java_api_lease_activity_display$.getGlobalValue();
    }

    public static SubLObject java_api_lease_activity_display() {
        return $java_api_lease_activity_display$.getGlobalValue();
    }

    public static SubLObject dispatch_task_processor_response(final SubLObject task_info, SubLObject finished) {
        if (finished == UNPROVIDED) {
            finished = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $minimize_task_processor_info_communication$.getDynamicValue(thread)) {
            set_task_info_request(NIL, task_info);
        }
        funcall(dictionary.dictionary_lookup($task_processor_response_dispatch_fn_dict$.getGlobalValue(), ti_type(task_info), UNPROVIDED), task_info, finished);
        return NIL;
    }

    public static SubLObject dispatch_api_task_processor_response(final SubLObject task_info, SubLObject finished) {
        if (finished == UNPROVIDED) {
            finished = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($task_processor_verbosity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            push_tpool_background_msg(format(NIL, $str292$Dispatching_api_response__S__, task_info), $api_task_process_pool$.getGlobalValue());
        }
        final SubLObject uuid_string = get_task_info_giveback_info(task_info);
        final SubLObject task_processor_response = list(TASK_PROCESSOR_RESPONSE, get_task_info_request(task_info), get_task_info_id(task_info), get_task_info_priority(task_info), get_task_info_requestor(task_info), get_task_info_response(task_info), get_task_info_error_message(task_info), finished);
        final SubLObject socket = java_api_kernel.java_api_socket_out_stream(uuid_string);
        final SubLObject lock = java_api_kernel.java_api_lock(uuid_string);
        final SubLObject _prev_bind_0 = cfasl_kb_methods.$within_complete_cfasl_objects$.currentBinding(thread);
        try {
            cfasl_kb_methods.$within_complete_cfasl_objects$.bind(T, thread);
            if (socket.isStream() && (NIL != open_stream_p(socket))) {
                cfasl_kernel.cfasl_set_mode_externalized();
                if (get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                    push_tpool_background_msg(format(NIL, $str294$Sending_api_response__S_to_socket, new SubLObject[]{ get_task_info_response(task_info), socket, uuid_string }), $api_task_process_pool$.getGlobalValue());
                }
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    cfasl_kernel.send_cfasl_result(socket, task_processor_response, NIL);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            } else
                if (get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                    push_tpool_background_msg(format(NIL, $str295$Dropping_api_response__S__socket_, new SubLObject[]{ task_processor_response, socket, uuid_string }), $api_task_process_pool$.getGlobalValue());
                }

        } finally {
            cfasl_kb_methods.$within_complete_cfasl_objects$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject new_intermediate_results_accumulator(final SubLObject wrapped) {
        return accumulation.new_accumulator(wrapped, INTERMEDIATE_RESULTS_ACCUMULATOR_RESET, INTERMEDIATE_RESULTS_ACCUMULATOR_ADD, INTERMEDIATE_RESULTS_ACCUMULATOR_SIZE, INTERMEDIATE_RESULTS_ACCUMULATOR_CONTENTS, INTERMEDIATE_RESULTS_ACCUMULATOR_ITERATOR, INTERMEDIATE_RESULTS_ACCUMULATOR_ADD_ALL);
    }

    public static SubLObject intermediate_results_accumulator_add(final SubLObject state, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == task_process_pool_p(get_task_process_pool_for_process(current_process())))) {
            Errors.error(Errors.error($str303$Cannot_invoke_intermediate_result));
        }
        accumulation.accumulation_add(state, item);
        post_task_info_processor_partial_results(list(item));
        return state;
    }

    public static SubLObject intermediate_results_accumulator_add_all(final SubLObject state, final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == task_process_pool_p(get_task_process_pool_for_process(current_process())))) {
            Errors.error(Errors.error($str303$Cannot_invoke_intermediate_result));
        }
        accumulation.accumulation_add_all(state, items);
        post_task_info_processor_partial_results(items);
        return state;
    }

    public static SubLObject intermediate_results_accumulator_reset(final SubLObject old_state) {
        accumulation.accumulation_reset(old_state);
        return old_state;
    }

    public static SubLObject intermediate_results_accumulator_size(final SubLObject state) {
        return accumulation.accumulation_size(state);
    }

    public static SubLObject intermediate_results_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        return accumulation.accumulation_contents(state, resetP);
    }

    public static SubLObject intermediate_results_accumulator_iterator(final SubLObject state) {
        return accumulation.accumulation_iterator(state);
    }

    public static SubLObject bg_task_processors_initialized_p() {
        return task_processors_initialized_p($bg_task_process_pool$.getGlobalValue());
    }

    public static SubLObject initialize_bg_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock($bg_task_process_pool_lock$.getGlobalValue());
            if (NIL != $bg_task_process_pool$.getGlobalValue()) {
                Errors.error($str278$Illegal_attempt_to_reinitialize_p);
            }
            $bg_task_process_pool$.setGlobalValue(initialize_task_processors(cconcatenate($$$BG, $$$_processor_), TWO_INTEGER, TWO_INTEGER));
        } finally {
            if (NIL != release) {
                release_lock($bg_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject halt_bg_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock($bg_task_process_pool_lock$.getGlobalValue());
            if (NIL != $bg_task_process_pool$.getGlobalValue()) {
                halt_task_processors($bg_task_process_pool$.getGlobalValue());
                flush_tpool_background_msgs();
                $bg_task_process_pool$.setGlobalValue(NIL);
                ensure_task_processors_killed($$$BG);
            }
        } finally {
            if (NIL != release) {
                release_lock($bg_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject restart_bg_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock($bg_task_process_pool_lock$.getGlobalValue());
            if (NIL != $bg_task_process_pool$.getGlobalValue()) {
                halt_task_processors($bg_task_process_pool$.getGlobalValue());
                $bg_task_process_pool$.setGlobalValue(NIL);
                ensure_task_processors_killed($$$BG);
            }
            $bg_task_process_pool$.setGlobalValue(initialize_task_processors(cconcatenate($$$BG, $$$_processor_), TWO_INTEGER, TWO_INTEGER));
        } finally {
            if (NIL != release) {
                release_lock($bg_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject show_bg_tp_msgs() {
        if (NIL != $bg_task_process_pool$.getGlobalValue()) {
            show_tp_msgs($bg_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject bg_task_processor_request(final SubLObject request, final SubLObject id, final SubLObject priority, final SubLObject requestor, final SubLObject v_bindings, final SubLObject requestor_process) {
        final SubLObject task_info = make_task_info(UNPROVIDED);
        set_task_info_type($BG, task_info);
        set_task_info_id(id, task_info);
        set_task_info_priority(priority, task_info);
        set_task_info_requestor(requestor, task_info);
        set_task_info_giveback_info(requestor_process, task_info);
        set_task_info_bindings(v_bindings, task_info);
        set_task_info_request(request, task_info);
        enqueue_task_request(task_info, $bg_task_process_pool$.getGlobalValue());
        return NIL;
    }

    public static SubLObject dispatch_bg_task_processor_response(final SubLObject task_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($task_processor_verbosity$.getDynamicValue(thread).numG(MINUS_ONE_INTEGER)) {
            push_tpool_background_msg(format(NIL, $str306$dispatching_bg_response__S__, task_info), $bg_task_process_pool$.getGlobalValue());
        }
        final SubLObject requestor_process = get_task_info_giveback_info(task_info);
        if ($task_processor_verbosity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            push_tpool_background_msg(format(NIL, $str307$bg_response_dictionary__S__, $bg_task_processor_response_dict$.getGlobalValue()), $bg_task_process_pool$.getGlobalValue());
        }
        if (NIL == $bg_task_processor_response_dict$.getGlobalValue()) {
            $bg_task_processor_response_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        if ($task_processor_verbosity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            push_tpool_background_msg(format(NIL, $str307$bg_response_dictionary__S__, $bg_task_processor_response_dict$.getGlobalValue()), $bg_task_process_pool$.getGlobalValue());
        }
        dictionary.dictionary_enter($bg_task_processor_response_dict$.getGlobalValue(), requestor_process, task_info);
        process_unblock(requestor_process);
        return NIL;
    }

    public static SubLObject bg_api_eval(final SubLObject form) {
        $bg_task_processor_request_id$.setGlobalValue(add($bg_task_processor_request_id$.getGlobalValue(), ONE_INTEGER));
        bg_task_processor_request(form, $bg_task_processor_request_id$.getGlobalValue(), ONE_INTEGER, process_name(current_process()), NIL, current_process());
        process_block();
        final SubLObject task_info = dictionary.dictionary_lookup($bg_task_processor_response_dict$.getGlobalValue(), current_process(), UNPROVIDED);
        return get_task_info_response(task_info);
    }

    public static SubLObject console_task_processors_initialized_p() {
        return task_processors_initialized_p($console_task_process_pool$.getGlobalValue());
    }

    public static SubLObject initialize_console_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock($console_task_process_pool_lock$.getGlobalValue());
            if (NIL != $console_task_process_pool$.getGlobalValue()) {
                Errors.error($str278$Illegal_attempt_to_reinitialize_p);
            }
            $console_task_process_pool$.setGlobalValue(initialize_task_processors(cconcatenate($$$CONSOLE, $$$_processor_), FIVE_INTEGER, $int$25));
        } finally {
            if (NIL != release) {
                release_lock($console_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject halt_console_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock($console_task_process_pool_lock$.getGlobalValue());
            if (NIL != $console_task_process_pool$.getGlobalValue()) {
                halt_task_processors($console_task_process_pool$.getGlobalValue());
                flush_tpool_background_msgs();
                $console_task_process_pool$.setGlobalValue(NIL);
                ensure_task_processors_killed($$$CONSOLE);
            }
        } finally {
            if (NIL != release) {
                release_lock($console_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject restart_console_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock($console_task_process_pool_lock$.getGlobalValue());
            if (NIL != $console_task_process_pool$.getGlobalValue()) {
                halt_task_processors($console_task_process_pool$.getGlobalValue());
                $console_task_process_pool$.setGlobalValue(NIL);
                ensure_task_processors_killed($$$CONSOLE);
            }
            $console_task_process_pool$.setGlobalValue(initialize_task_processors(cconcatenate($$$CONSOLE, $$$_processor_), FIVE_INTEGER, $int$25));
        } finally {
            if (NIL != release) {
                release_lock($console_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject show_console_tp_msgs() {
        if (NIL != $console_task_process_pool$.getGlobalValue()) {
            show_tp_msgs($console_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject console_task_processor_request(final SubLObject request, final SubLObject priority) {
        assert NIL != integerp(priority) : "Types.integerp(priority) " + "CommonSymbols.NIL != Types.integerp(priority) " + priority;
        final SubLObject task_info = make_task_info(UNPROVIDED);
        set_task_info_type($CONSOLE, task_info);
        $task_processor_console_id$.setGlobalValue(add($task_processor_console_id$.getGlobalValue(), ONE_INTEGER));
        set_task_info_id($task_processor_console_id$.getGlobalValue(), task_info);
        set_task_info_priority(priority, task_info);
        set_task_info_requestor(constants_high.constant_name(operation_communication.the_cyclist()), task_info);
        set_task_info_request(request, task_info);
        enqueue_task_request(task_info, $console_task_process_pool$.getGlobalValue());
        return NIL;
    }

    public static SubLObject dispatch_console_task_processor_response(final SubLObject task_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
            push_tpool_background_msg(format(NIL, $str312$dispatching_console_response__S__, task_info), $console_task_process_pool$.getGlobalValue());
        }
        push_tpool_background_msg(format(NIL, $str313$_A___A__, ti_task_processor_name(task_info), ti_response(task_info)), $console_task_process_pool$.getGlobalValue());
        if (NIL != ti_error_message(task_info)) {
            push_tpool_background_msg(format(NIL, $str149$_S__, ti_error_message(task_info)), $console_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject declare_task_processor_file() {
        declareFunction(me, "get_task_processor_verbosity", "GET-TASK-PROCESSOR-VERBOSITY", 0, 0, false);
        declareFunction(me, "set_task_processor_verbosity", "SET-TASK-PROCESSOR-VERBOSITY", 1, 0, false);
        declareFunction(me, "task_info_print_function_trampoline", "TASK-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "task_info_p", "TASK-INFO-P", 1, 0, false);
        new task_processor.$task_info_p$UnaryFunction();
        declareFunction(me, "ti_type", "TI-TYPE", 1, 0, false);
        declareFunction(me, "ti_id", "TI-ID", 1, 0, false);
        declareFunction(me, "ti_priority", "TI-PRIORITY", 1, 0, false);
        declareFunction(me, "ti_requestor", "TI-REQUESTOR", 1, 0, false);
        declareFunction(me, "ti_giveback_info", "TI-GIVEBACK-INFO", 1, 0, false);
        declareFunction(me, "ti_bindings", "TI-BINDINGS", 1, 0, false);
        declareFunction(me, "ti_request", "TI-REQUEST", 1, 0, false);
        declareFunction(me, "ti_response", "TI-RESPONSE", 1, 0, false);
        declareFunction(me, "ti_error_message", "TI-ERROR-MESSAGE", 1, 0, false);
        declareFunction(me, "ti_task_processor_name", "TI-TASK-PROCESSOR-NAME", 1, 0, false);
        declareFunction(me, "_csetf_ti_type", "_CSETF-TI-TYPE", 2, 0, false);
        declareFunction(me, "_csetf_ti_id", "_CSETF-TI-ID", 2, 0, false);
        declareFunction(me, "_csetf_ti_priority", "_CSETF-TI-PRIORITY", 2, 0, false);
        declareFunction(me, "_csetf_ti_requestor", "_CSETF-TI-REQUESTOR", 2, 0, false);
        declareFunction(me, "_csetf_ti_giveback_info", "_CSETF-TI-GIVEBACK-INFO", 2, 0, false);
        declareFunction(me, "_csetf_ti_bindings", "_CSETF-TI-BINDINGS", 2, 0, false);
        declareFunction(me, "_csetf_ti_request", "_CSETF-TI-REQUEST", 2, 0, false);
        declareFunction(me, "_csetf_ti_response", "_CSETF-TI-RESPONSE", 2, 0, false);
        declareFunction(me, "_csetf_ti_error_message", "_CSETF-TI-ERROR-MESSAGE", 2, 0, false);
        declareFunction(me, "_csetf_ti_task_processor_name", "_CSETF-TI-TASK-PROCESSOR-NAME", 2, 0, false);
        declareFunction(me, "make_task_info", "MAKE-TASK-INFO", 0, 1, false);
        declareFunction(me, "visit_defstruct_task_info", "VISIT-DEFSTRUCT-TASK-INFO", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_task_info_method", "VISIT-DEFSTRUCT-OBJECT-TASK-INFO-METHOD", 2, 0, false);
        declareFunction(me, "get_task_info_type", "GET-TASK-INFO-TYPE", 1, 0, false);
        declareFunction(me, "set_task_info_type", "SET-TASK-INFO-TYPE", 2, 0, false);
        declareFunction(me, "get_task_info_id", "GET-TASK-INFO-ID", 1, 0, false);
        declareFunction(me, "set_task_info_id", "SET-TASK-INFO-ID", 2, 0, false);
        declareFunction(me, "get_task_info_priority", "GET-TASK-INFO-PRIORITY", 1, 0, false);
        declareFunction(me, "set_task_info_priority", "SET-TASK-INFO-PRIORITY", 2, 0, false);
        declareFunction(me, "get_task_info_requestor", "GET-TASK-INFO-REQUESTOR", 1, 0, false);
        declareFunction(me, "set_task_info_requestor", "SET-TASK-INFO-REQUESTOR", 2, 0, false);
        declareFunction(me, "get_task_info_giveback_info", "GET-TASK-INFO-GIVEBACK-INFO", 1, 0, false);
        declareFunction(me, "set_task_info_giveback_info", "SET-TASK-INFO-GIVEBACK-INFO", 2, 0, false);
        declareFunction(me, "get_task_info_bindings", "GET-TASK-INFO-BINDINGS", 1, 0, false);
        declareFunction(me, "set_task_info_bindings", "SET-TASK-INFO-BINDINGS", 2, 0, false);
        declareFunction(me, "get_task_info_request", "GET-TASK-INFO-REQUEST", 1, 0, false);
        declareFunction(me, "set_task_info_request", "SET-TASK-INFO-REQUEST", 2, 0, false);
        declareFunction(me, "get_task_info_response", "GET-TASK-INFO-RESPONSE", 1, 0, false);
        declareFunction(me, "set_task_info_response", "SET-TASK-INFO-RESPONSE", 2, 0, false);
        declareFunction(me, "get_task_info_error_message", "GET-TASK-INFO-ERROR-MESSAGE", 1, 0, false);
        declareFunction(me, "set_task_info_error_message", "SET-TASK-INFO-ERROR-MESSAGE", 2, 0, false);
        declareFunction(me, "get_task_info_task_processor_name", "GET-TASK-INFO-TASK-PROCESSOR-NAME", 1, 0, false);
        declareFunction(me, "set_task_info_task_processor_name", "SET-TASK-INFO-TASK-PROCESSOR-NAME", 2, 0, false);
        declareFunction(me, "print_task_info", "PRINT-TASK-INFO", 3, 0, false);
        declareFunction(me, "task_result_set_print_function_trampoline", "TASK-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "task_result_set_p", "TASK-RESULT-SET-P", 1, 0, false);
        new task_processor.$task_result_set_p$UnaryFunction();
        declareFunction(me, "task_result_set_result", "TASK-RESULT-SET-RESULT", 1, 0, false);
        declareFunction(me, "task_result_set_task_info", "TASK-RESULT-SET-TASK-INFO", 1, 0, false);
        declareFunction(me, "task_result_set_finished", "TASK-RESULT-SET-FINISHED", 1, 0, false);
        declareFunction(me, "_csetf_task_result_set_result", "_CSETF-TASK-RESULT-SET-RESULT", 2, 0, false);
        declareFunction(me, "_csetf_task_result_set_task_info", "_CSETF-TASK-RESULT-SET-TASK-INFO", 2, 0, false);
        declareFunction(me, "_csetf_task_result_set_finished", "_CSETF-TASK-RESULT-SET-FINISHED", 2, 0, false);
        declareFunction(me, "make_task_result_set", "MAKE-TASK-RESULT-SET", 0, 1, false);
        declareFunction(me, "visit_defstruct_task_result_set", "VISIT-DEFSTRUCT-TASK-RESULT-SET", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_task_result_set_method", "VISIT-DEFSTRUCT-OBJECT-TASK-RESULT-SET-METHOD", 2, 0, false);
        declareFunction(me, "new_task_result_set", "NEW-TASK-RESULT-SET", 3, 0, false);
        declareFunction(me, "task_result_set_priority", "TASK-RESULT-SET-PRIORITY", 1, 0, false);
        declareFunction(me, "task_processor_print_function_trampoline", "TASK-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "task_processor_p", "TASK-PROCESSOR-P", 1, 0, false);
        new task_processor.$task_processor_p$UnaryFunction();
        declareFunction(me, "tproc_name", "TPROC-NAME", 1, 0, false);
        declareFunction(me, "tproc_process", "TPROC-PROCESS", 1, 0, false);
        declareFunction(me, "tproc_busy_p", "TPROC-BUSY-P", 1, 0, false);
        declareFunction(me, "tproc_task_info", "TPROC-TASK-INFO", 1, 0, false);
        declareFunction(me, "_csetf_tproc_name", "_CSETF-TPROC-NAME", 2, 0, false);
        declareFunction(me, "_csetf_tproc_process", "_CSETF-TPROC-PROCESS", 2, 0, false);
        declareFunction(me, "_csetf_tproc_busy_p", "_CSETF-TPROC-BUSY-P", 2, 0, false);
        declareFunction(me, "_csetf_tproc_task_info", "_CSETF-TPROC-TASK-INFO", 2, 0, false);
        declareFunction(me, "make_task_processor", "MAKE-TASK-PROCESSOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_task_processor", "VISIT-DEFSTRUCT-TASK-PROCESSOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_task_processor_method", "VISIT-DEFSTRUCT-OBJECT-TASK-PROCESSOR-METHOD", 2, 0, false);
        declareFunction(me, "print_task_processor", "PRINT-TASK-PROCESSOR", 3, 0, false);
        declareFunction(me, "task_process_pool_print_function_trampoline", "TASK-PROCESS-POOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "task_process_pool_p", "TASK-PROCESS-POOL-P", 1, 0, false);
        new task_processor.$task_process_pool_p$UnaryFunction();
        declareFunction(me, "tpool_lock", "TPOOL-LOCK", 1, 0, false);
        declareFunction(me, "tpool_request_queue", "TPOOL-REQUEST-QUEUE", 1, 0, false);
        declareFunction(me, "tpool_request_semaphore", "TPOOL-REQUEST-SEMAPHORE", 1, 0, false);
        declareFunction(me, "tpool_processors", "TPOOL-PROCESSORS", 1, 0, false);
        declareFunction(me, "tpool_background_msgs", "TPOOL-BACKGROUND-MSGS", 1, 0, false);
        declareFunction(me, "tpool_process_name_prefix", "TPOOL-PROCESS-NAME-PREFIX", 1, 0, false);
        declareFunction(me, "tpool_min_nbr_of_task_processors", "TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction(me, "tpool_max_nbr_of_task_processors", "TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction(me, "_csetf_tpool_lock", "_CSETF-TPOOL-LOCK", 2, 0, false);
        declareFunction(me, "_csetf_tpool_request_queue", "_CSETF-TPOOL-REQUEST-QUEUE", 2, 0, false);
        declareFunction(me, "_csetf_tpool_request_semaphore", "_CSETF-TPOOL-REQUEST-SEMAPHORE", 2, 0, false);
        declareFunction(me, "_csetf_tpool_processors", "_CSETF-TPOOL-PROCESSORS", 2, 0, false);
        declareFunction(me, "_csetf_tpool_background_msgs", "_CSETF-TPOOL-BACKGROUND-MSGS", 2, 0, false);
        declareFunction(me, "_csetf_tpool_process_name_prefix", "_CSETF-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false);
        declareFunction(me, "_csetf_tpool_min_nbr_of_task_processors", "_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction(me, "_csetf_tpool_max_nbr_of_task_processors", "_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction(me, "make_task_process_pool", "MAKE-TASK-PROCESS-POOL", 0, 1, false);
        declareFunction(me, "visit_defstruct_task_process_pool", "VISIT-DEFSTRUCT-TASK-PROCESS-POOL", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_task_process_pool_method", "VISIT-DEFSTRUCT-OBJECT-TASK-PROCESS-POOL-METHOD", 2, 0, false);
        declareFunction(me, "print_task_process_pool", "PRINT-TASK-PROCESS-POOL", 3, 0, false);
        declareFunction(me, "display_task_processors", "DISPLAY-TASK-PROCESSORS", 1, 1, false);
        declareFunction(me, "display_active_task_processes", "DISPLAY-ACTIVE-TASK-PROCESSES", 0, 1, false);
        declareFunction(me, "task_processors_initialized_p", "TASK-PROCESSORS-INITIALIZED-P", 1, 0, false);
        declareFunction(me, "get_tpool_lock", "GET-TPOOL-LOCK", 1, 0, false);
        declareFunction(me, "set_tpool_lock", "SET-TPOOL-LOCK", 2, 0, false);
        declareFunction(me, "get_tpool_request_queue", "GET-TPOOL-REQUEST-QUEUE", 1, 0, false);
        declareFunction(me, "set_tpool_request_queue", "SET-TPOOL-REQUEST-QUEUE", 2, 0, false);
        declareFunction(me, "get_tpool_processors", "GET-TPOOL-PROCESSORS", 1, 0, false);
        declareFunction(me, "get_tpool_processors_nbr", "GET-TPOOL-PROCESSORS-NBR", 1, 0, false);
        declareFunction(me, "push_tpool_processor", "PUSH-TPOOL-PROCESSOR", 2, 0, false);
        declareFunction(me, "set_tpool_processors", "SET-TPOOL-PROCESSORS", 2, 0, false);
        declareFunction(me, "set_tpool_background_msg_path", "SET-TPOOL-BACKGROUND-MSG-PATH", 1, 0, false);
        declareFunction(me, "push_tpool_background_msg", "PUSH-TPOOL-BACKGROUND-MSG", 2, 0, false);
        declareFunction(me, "flush_tpool_background_msgs", "FLUSH-TPOOL-BACKGROUND-MSGS", 0, 0, false);
        declareFunction(me, "show_tp_msgs", "SHOW-TP-MSGS", 1, 0, false);
        declareFunction(me, "show_tp_msgs_with_process_name", "SHOW-TP-MSGS-WITH-PROCESS-NAME", 1, 0, false);
        declareFunction(me, "set_tpool_process_name_prefix", "SET-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false);
        declareFunction(me, "get_tpool_process_name_prefix", "GET-TPOOL-PROCESS-NAME-PREFIX", 1, 0, false);
        declareFunction(me, "set_tpool_min_nbr_of_task_processors", "SET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction(me, "get_tpool_min_nbr_of_task_processors", "GET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction(me, "set_tpool_max_nbr_of_task_processors", "SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction(me, "get_tpool_max_nbr_of_task_processors", "GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction(me, "get_nbr_of_task_processors", "GET-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction(me, "start_task_processor_logging_to_file", "START-TASK-PROCESSOR-LOGGING-TO-FILE", 1, 1, false);
        declareFunction(me, "end_task_processor_logging_to_file", "END-TASK-PROCESSOR-LOGGING-TO-FILE", 0, 0, false);
        declareFunction(me, "save_unlogged_task_processor_messages_to_file", "SAVE-UNLOGGED-TASK-PROCESSOR-MESSAGES-TO-FILE", 1, 0, false);
        declareFunction(me, "eval_with_bindings", "EVAL-WITH-BINDINGS", 3, 0, false);
        declareFunction(me, "get_task_process_pool_for_process", "GET-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false);
        declareFunction(me, "add_task_process_pool_for_process", "ADD-TASK-PROCESS-POOL-FOR-PROCESS", 2, 0, false);
        declareFunction(me, "remove_task_process_pool_for_process", "REMOVE-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false);
        declareFunction(me, "ensure_task_process_being_worked_on_initialized", "ENSURE-TASK-PROCESS-BEING-WORKED-ON-INITIALIZED", 0, 0, false);
        declareFunction(me, "compute_task_process_description_from_task_info", "COMPUTE-TASK-PROCESS-DESCRIPTION-FROM-TASK-INFO", 1, 0, false);
        declareFunction(me, "compute_task_process_description", "COMPUTE-TASK-PROCESS-DESCRIPTION", 2, 0, false);
        declareFunction(me, "get_giveback_info_from_task_process_description", "GET-GIVEBACK-INFO-FROM-TASK-PROCESS-DESCRIPTION", 1, 0, false);
        declareFunction(me, "note_active_task_process_description_if_permitted", "NOTE-ACTIVE-TASK-PROCESS-DESCRIPTION-IF-PERMITTED", 1, 0, false);
        declareFunction(me, "note_inactive_task_process_description", "NOTE-INACTIVE-TASK-PROCESS-DESCRIPTION", 1, 0, false);
        declareFunction(me, "task_process_termination_reason_p", "TASK-PROCESS-TERMINATION-REASON-P", 1, 0, false);
        declareFunction(me, "terminate_active_task_process", "TERMINATE-ACTIVE-TASK-PROCESS", 3, 0, false);
        declareFunction(me, "terminate_active_task_processes", "TERMINATE-ACTIVE-TASK-PROCESSES", 1, 0, false);
        declareFunction(me, "signal_terminate_active_task_process", "SIGNAL-TERMINATE-ACTIVE-TASK-PROCESS", 4, 0, false);
        declareFunction(me, "signal_abort_active_task_process", "SIGNAL-ABORT-ACTIVE-TASK-PROCESS", 2, 0, false);
        declareFunction(me, "signal_cancel_active_task_process", "SIGNAL-CANCEL-ACTIVE-TASK-PROCESS", 2, 0, false);
        declareMacro(me, "catch_task_processor_termination", "CATCH-TASK-PROCESSOR-TERMINATION");
        declareMacro(me, "catch_task_processor_termination_quietly", "CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY");
        declareFunction(me, "get_current_task_processor_info", "GET-CURRENT-TASK-PROCESSOR-INFO", 0, 0, false);
        declareFunction(me, "get_current_task_processor_client", "GET-CURRENT-TASK-PROCESSOR-CLIENT", 0, 0, false);
        declareFunction(me, "map_task_info_priority_to_process_priority", "MAP-TASK-INFO-PRIORITY-TO-PROCESS-PRIORITY", 1, 0, false);
        declareFunction(me, "task_processor_handler", "TASK-PROCESSOR-HANDLER", 0, 0, false);
        declareFunction(me, "post_task_info_processor_partial_results", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS", 1, 0, false);
        declareFunction(me, "post_task_info_processor_partial_results_internal", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS-INTERNAL", 2, 0, false);
        declareFunction(me, "initialize_task_processors", "INITIALIZE-TASK-PROCESSORS", 0, 3, false);
        declareFunction(me, "add_new_task_processor_to_pool", "ADD-NEW-TASK-PROCESSOR-TO-POOL", 1, 0, false);
        declareFunction(me, "halt_task_processors", "HALT-TASK-PROCESSORS", 1, 0, false);
        declareFunction(me, "halt_task_processor", "HALT-TASK-PROCESSOR", 1, 0, false);
        declareFunction(me, "halt_task_processor_via_interrupt", "HALT-TASK-PROCESSOR-VIA-INTERRUPT", 1, 0, false);
        declareFunction(me, "ensure_task_processors_killed", "ENSURE-TASK-PROCESSORS-KILLED", 1, 0, false);
        declareFunction(me, "task_processor_quit", "TASK-PROCESSOR-QUIT", 0, 0, false);
        declareFunction(me, "find_task_processor", "FIND-TASK-PROCESSOR", 2, 0, false);
        declareFunction(me, "find_task_process_pool", "FIND-TASK-PROCESS-POOL", 1, 0, false);
        declareFunction(me, "awaken_first_available_task_processors", "AWAKEN-FIRST-AVAILABLE-TASK-PROCESSORS", 1, 0, false);
        declareFunction(me, "enqueue_task_request", "ENQUEUE-TASK-REQUEST", 2, 0, false);
        declareMacro(me, "with_long_running_task_process", "WITH-LONG-RUNNING-TASK-PROCESS");
        declareMacro(me, "declare_task_process_pool", "DECLARE-TASK-PROCESS-POOL");
        declareMacro(me, "declare_task_process_request", "DECLARE-TASK-PROCESS-REQUEST");
        declareMacro(me, "declare_task_process_response_dispatch", "DECLARE-TASK-PROCESS-RESPONSE-DISPATCH");
        declareFunction(me, "api_task_processors_initialized_p", "API-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
        declareFunction(me, "initialize_api_task_processors", "INITIALIZE-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction(me, "halt_api_task_processors", "HALT-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction(me, "restart_api_task_processors", "RESTART-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction(me, "show_api_tp_msgs", "SHOW-API-TP-MSGS", 0, 0, false);
        declareFunction(me, "show_api_task_processors", "SHOW-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction(me, "display_api_task_processors", "DISPLAY-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction(me, "api_task_processor_request", "API-TASK-PROCESSOR-REQUEST", 6, 0, false);
        declareFunction(me, "set_java_api_lease_activity_display", "SET-JAVA-API-LEASE-ACTIVITY-DISPLAY", 1, 0, false);
        declareFunction(me, "java_api_lease_activity_display", "JAVA-API-LEASE-ACTIVITY-DISPLAY", 0, 0, false);
        declareFunction(me, "dispatch_task_processor_response", "DISPATCH-TASK-PROCESSOR-RESPONSE", 1, 1, false);
        declareFunction(me, "dispatch_api_task_processor_response", "DISPATCH-API-TASK-PROCESSOR-RESPONSE", 1, 1, false);
        declareFunction(me, "new_intermediate_results_accumulator", "NEW-INTERMEDIATE-RESULTS-ACCUMULATOR", 1, 0, false);
        declareFunction(me, "intermediate_results_accumulator_add", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction(me, "intermediate_results_accumulator_add_all", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD-ALL", 2, 0, false);
        declareFunction(me, "intermediate_results_accumulator_reset", "INTERMEDIATE-RESULTS-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction(me, "intermediate_results_accumulator_size", "INTERMEDIATE-RESULTS-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction(me, "intermediate_results_accumulator_contents", "INTERMEDIATE-RESULTS-ACCUMULATOR-CONTENTS", 1, 1, false);
        declareFunction(me, "intermediate_results_accumulator_iterator", "INTERMEDIATE-RESULTS-ACCUMULATOR-ITERATOR", 1, 0, false);
        declareFunction(me, "bg_task_processors_initialized_p", "BG-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
        declareFunction(me, "initialize_bg_task_processors", "INITIALIZE-BG-TASK-PROCESSORS", 0, 0, false);
        declareFunction(me, "halt_bg_task_processors", "HALT-BG-TASK-PROCESSORS", 0, 0, false);
        declareFunction(me, "restart_bg_task_processors", "RESTART-BG-TASK-PROCESSORS", 0, 0, false);
        declareFunction(me, "show_bg_tp_msgs", "SHOW-BG-TP-MSGS", 0, 0, false);
        declareFunction(me, "bg_task_processor_request", "BG-TASK-PROCESSOR-REQUEST", 6, 0, false);
        declareFunction(me, "dispatch_bg_task_processor_response", "DISPATCH-BG-TASK-PROCESSOR-RESPONSE", 1, 0, false);
        declareFunction(me, "bg_api_eval", "BG-API-EVAL", 1, 0, false);
        declareFunction(me, "console_task_processors_initialized_p", "CONSOLE-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
        declareFunction(me, "initialize_console_task_processors", "INITIALIZE-CONSOLE-TASK-PROCESSORS", 0, 0, false);
        declareFunction(me, "halt_console_task_processors", "HALT-CONSOLE-TASK-PROCESSORS", 0, 0, false);
        declareFunction(me, "restart_console_task_processors", "RESTART-CONSOLE-TASK-PROCESSORS", 0, 0, false);
        declareFunction(me, "show_console_tp_msgs", "SHOW-CONSOLE-TP-MSGS", 0, 0, false);
        declareFunction(me, "console_task_processor_request", "CONSOLE-TASK-PROCESSOR-REQUEST", 2, 0, false);
        declareFunction(me, "dispatch_console_task_processor_response", "DISPATCH-CONSOLE-TASK-PROCESSOR-RESPONSE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_task_processor_file() {
        defparameter("*TASK-PROCESSOR-VERBOSITY*", ZERO_INTEGER);
        defconstant("*DTP-TASK-INFO*", TASK_INFO);
        defconstant("*DTP-TASK-RESULT-SET*", TASK_RESULT_SET);
        deflexical("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*", NIL);
        defconstant("*DTP-TASK-PROCESSOR*", TASK_PROCESSOR);
        defconstant("*DTP-TASK-PROCESS-POOL*", TASK_PROCESS_POOL);
        defconstant("*TASK-REQUEST-QUEUE-MAX-SIZE*", $int$500);
        deflexical("*TPOOL-BACKGROUND-MSG-PATH*", NIL);
        deflexical("*TPOOL-BACKGROUND-MSG-STREAM*", NIL);
        defparameter("*QUEUE-TPOOL-BACKGROUND-MSGS-WHEN-NO-PATH?*", NIL);
        deflexical("*TPOOL-BACKGROUND-MSG-LOCK*", SubLTrampolineFile.maybeDefault($tpool_background_msg_lock$, $tpool_background_msg_lock$, () -> make_lock($str157$tpool_background_msg_lock)));
        defparameter("*EVAL-WITH-BINDINGS*", NIL);
        deflexical("*PROCESS-TO-TASK-PROCESS-POOL*", dictionary_utilities.new_synchronized_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*TASK-PROCESSES-BEING-WORKED-ON-LOCK*", make_lock($$$Task_processes_being_worked_on));
        deflexical("*TASK-PROCESSES-BEING-WORKED-ON*", NIL);
        defparameter("*TASK-PROCESSES-WORKED-ON-HISTORY*", $int$500);
        deflexical("*TASK-PROCESSOR-EVAL-FN-DICT*", NIL);
        defparameter("*MINIMIZE-TASK-PROCESSOR-INFO-COMMUNICATION*", T);
        defparameter("*CURRENT-TASK-PROCESSOR-INFO*", NIL);
        defparameter("*TASK-PROCESSOR-STANDARD-OUTPUT*", StreamsLow.$standard_output$.getDynamicValue());
        defconstant("*MIN-NBR-OF-TASK-PROCESSORS*", FIVE_INTEGER);
        defconstant("*MAX-NBR-OF-TASK-PROCESSORS*", $int$25);
        deflexical("*API-TASK-PROCESS-POOL*", NIL);
        defconstant("*API-TASK-PROCESS-POOL-LOCK*", make_lock($str277$task_processor_initialization_loc));
        deflexical("*JAVA-API-LEASE-ACTIVITY-DISPLAY*", NIL);
        deflexical("*BG-TASK-PROCESS-POOL*", NIL);
        defconstant("*BG-TASK-PROCESS-POOL-LOCK*", make_lock($str277$task_processor_initialization_loc));
        deflexical("*BG-TASK-PROCESSOR-RESPONSE-DICT*", NIL);
        deflexical("*BG-TASK-PROCESSOR-REQUEST-ID*", ZERO_INTEGER);
        deflexical("*CONSOLE-TASK-PROCESS-POOL*", NIL);
        defconstant("*CONSOLE-TASK-PROCESS-POOL-LOCK*", make_lock($str277$task_processor_initialization_loc));
        deflexical("*TASK-PROCESSOR-CONSOLE-ID*", SubLTrampolineFile.maybeDefault($task_processor_console_id$, $task_processor_console_id$, ZERO_INTEGER));
        return NIL;
    }

    public static SubLObject setup_task_processor_file() {
        register_external_symbol(SET_TASK_PROCESSOR_VERBOSITY);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_task_info$.getGlobalValue(), symbol_function(TASK_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list11);
        def_csetf(TI_TYPE, _CSETF_TI_TYPE);
        def_csetf(TI_ID, _CSETF_TI_ID);
        def_csetf(TI_PRIORITY, _CSETF_TI_PRIORITY);
        def_csetf(TI_REQUESTOR, _CSETF_TI_REQUESTOR);
        def_csetf(TI_GIVEBACK_INFO, _CSETF_TI_GIVEBACK_INFO);
        def_csetf(TI_BINDINGS, _CSETF_TI_BINDINGS);
        def_csetf(TI_REQUEST, _CSETF_TI_REQUEST);
        def_csetf(TI_RESPONSE, _CSETF_TI_RESPONSE);
        def_csetf(TI_ERROR_MESSAGE, _CSETF_TI_ERROR_MESSAGE);
        def_csetf(TI_TASK_PROCESSOR_NAME, _CSETF_TI_TASK_PROCESSOR_NAME);
        identity(TASK_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_task_info$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TASK_INFO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_task_result_set$.getGlobalValue(), symbol_function(TASK_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list68);
        def_csetf(TASK_RESULT_SET_RESULT, _CSETF_TASK_RESULT_SET_RESULT);
        def_csetf(TASK_RESULT_SET_TASK_INFO, _CSETF_TASK_RESULT_SET_TASK_INFO);
        def_csetf(TASK_RESULT_SET_FINISHED, _CSETF_TASK_RESULT_SET_FINISHED);
        identity(TASK_RESULT_SET);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_task_result_set$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TASK_RESULT_SET_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_task_processor$.getGlobalValue(), symbol_function(TASK_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list89);
        def_csetf(TPROC_NAME, _CSETF_TPROC_NAME);
        def_csetf(TPROC_PROCESS, _CSETF_TPROC_PROCESS);
        def_csetf(TPROC_BUSY_P, _CSETF_TPROC_BUSY_P);
        def_csetf(TPROC_TASK_INFO, _CSETF_TPROC_TASK_INFO);
        identity(TASK_PROCESSOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_task_processor$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TASK_PROCESSOR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_task_process_pool$.getGlobalValue(), symbol_function(TASK_PROCESS_POOL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list116);
        def_csetf(TPOOL_LOCK, _CSETF_TPOOL_LOCK);
        def_csetf(TPOOL_REQUEST_QUEUE, _CSETF_TPOOL_REQUEST_QUEUE);
        def_csetf(TPOOL_REQUEST_SEMAPHORE, _CSETF_TPOOL_REQUEST_SEMAPHORE);
        def_csetf(TPOOL_PROCESSORS, _CSETF_TPOOL_PROCESSORS);
        def_csetf(TPOOL_BACKGROUND_MSGS, _CSETF_TPOOL_BACKGROUND_MSGS);
        def_csetf(TPOOL_PROCESS_NAME_PREFIX, _CSETF_TPOOL_PROCESS_NAME_PREFIX);
        def_csetf(TPOOL_MIN_NBR_OF_TASK_PROCESSORS, _CSETF_TPOOL_MIN_NBR_OF_TASK_PROCESSORS);
        def_csetf(TPOOL_MAX_NBR_OF_TASK_PROCESSORS, _CSETF_TPOOL_MAX_NBR_OF_TASK_PROCESSORS);
        identity(TASK_PROCESS_POOL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_task_process_pool$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TASK_PROCESS_POOL_METHOD));
        register_external_symbol(SET_TPOOL_BACKGROUND_MSG_PATH);
        declare_defglobal($tpool_background_msg_lock$);
        register_external_symbol(PUSH_TPOOL_BACKGROUND_MSG);
        register_external_symbol(FLUSH_TPOOL_BACKGROUND_MSGS);
        register_external_symbol(START_TASK_PROCESSOR_LOGGING_TO_FILE);
        register_external_symbol(END_TASK_PROCESSOR_LOGGING_TO_FILE);
        register_external_symbol(SAVE_UNLOGGED_TASK_PROCESSOR_MESSAGES_TO_FILE);
        register_cyc_api_macro(CATCH_TASK_PROCESSOR_TERMINATION, $list193, $str197$Allow_for_the_API_calling_side_to);
        register_cyc_api_macro(CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY, $list200, $str201$Allow_for_the_API_calling_side_to);
        register_external_symbol(ENSURE_TASK_PROCESSORS_KILLED);
        register_external_symbol(WITH_LONG_RUNNING_TASK_PROCESS);
        register_cyc_api_function(SHOW_API_TASK_PROCESSORS, NIL, $str281$Provides_a_convenient_alias_for_D, NIL, NIL);
        register_cyc_api_function(DISPLAY_API_TASK_PROCESSORS, NIL, $str283$, NIL, NIL);
        register_api_predefined_function(INITIALIZE_API_TASK_PROCESSORS);
        register_api_predefined_function(HALT_API_TASK_PROCESSORS);
        register_api_predefined_function(RESTART_API_TASK_PROCESSORS);
        register_api_predefined_function(SHOW_API_TP_MSGS);
        register_api_predefined_function(API_TASK_PROCESSOR_REQUEST);
        register_api_predefined_function(WITH_IMMEDIATE_EXECUTION);
        if (NIL == $task_processor_eval_fn_dict$.getGlobalValue()) {
            $task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_eval_fn_dict$.getGlobalValue(), $API, symbol_function(CYC_API_EVAL));
        register_external_symbol(SET_JAVA_API_LEASE_ACTIVITY_DISPLAY);
        if (NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
            $task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_response_dispatch_fn_dict$.getGlobalValue(), $API, symbol_function(DISPATCH_API_TASK_PROCESSOR_RESPONSE));
        if (NIL == $task_processor_eval_fn_dict$.getGlobalValue()) {
            $task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_eval_fn_dict$.getGlobalValue(), $BG, symbol_function(CYC_API_EVAL));
        if (NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
            $task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_response_dispatch_fn_dict$.getGlobalValue(), $BG, symbol_function(DISPATCH_BG_TASK_PROCESSOR_RESPONSE));
        declare_defglobal($task_processor_console_id$);
        if (NIL == $task_processor_eval_fn_dict$.getGlobalValue()) {
            $task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_eval_fn_dict$.getGlobalValue(), $CONSOLE, symbol_function(CYC_API_EVAL));
        if (NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
            $task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_response_dispatch_fn_dict$.getGlobalValue(), $CONSOLE, symbol_function(DISPATCH_CONSOLE_TASK_PROCESSOR_RESPONSE));
        sunit_external.define_test_category($str315$Task_Processor_Module_Supercatego, UNPROVIDED);
        sunit_external.define_test_category($$$Task_Processor_Subcategory, list($str315$Task_Processor_Module_Supercatego));
        sunit_external.define_test_suite($str317$Task_Processor_Testing_Suite, list($str315$Task_Processor_Module_Supercatego), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_task_processor_file();
    }

    @Override
    public void initializeVariables() {
        init_task_processor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_task_processor_file();
    }

    static {































































































































































































































































































































































    }

    public static final class $task_info_native extends SubLStructNative {
        public SubLObject $type;

        public SubLObject $id;

        public SubLObject $priority;

        public SubLObject $requestor;

        public SubLObject $giveback_info;

        public SubLObject $bindings;

        public SubLObject $request;

        public SubLObject $response;

        public SubLObject $error_message;

        public SubLObject $task_processor_name;

        private static final SubLStructDeclNative structDecl;

        private $task_info_native() {
            this.$type = Lisp.NIL;
            this.$id = Lisp.NIL;
            this.$priority = Lisp.NIL;
            this.$requestor = Lisp.NIL;
            this.$giveback_info = Lisp.NIL;
            this.$bindings = Lisp.NIL;
            this.$request = Lisp.NIL;
            this.$response = Lisp.NIL;
            this.$error_message = Lisp.NIL;
            this.$task_processor_name = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$type;
        }

        @Override
        public SubLObject getField3() {
            return this.$id;
        }

        @Override
        public SubLObject getField4() {
            return this.$priority;
        }

        @Override
        public SubLObject getField5() {
            return this.$requestor;
        }

        @Override
        public SubLObject getField6() {
            return this.$giveback_info;
        }

        @Override
        public SubLObject getField7() {
            return this.$bindings;
        }

        @Override
        public SubLObject getField8() {
            return this.$request;
        }

        @Override
        public SubLObject getField9() {
            return this.$response;
        }

        @Override
        public SubLObject getField10() {
            return this.$error_message;
        }

        @Override
        public SubLObject getField11() {
            return this.$task_processor_name;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$type = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$priority = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$requestor = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$giveback_info = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$bindings = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$request = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$response = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$error_message = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$task_processor_name = value;
        }

        static {
            structDecl = makeStructDeclNative($task_info_native.class, TASK_INFO, TASK_INFO_P, $list5, $list6, new String[]{ "$type", "$id", "$priority", "$requestor", "$giveback_info", "$bindings", "$request", "$response", "$error_message", "$task_processor_name" }, $list7, $list8, PRINT_TASK_INFO);
        }
    }

    public static final class $task_info_p$UnaryFunction extends UnaryFunction {
        public $task_info_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return task_info_p(arg1);
        }
    }

    public static final class $task_result_set_native extends SubLStructNative {
        public SubLObject $result;

        public SubLObject $task_info;

        public SubLObject $finished;

        private static final SubLStructDeclNative structDecl;

        private $task_result_set_native() {
            this.$result = Lisp.NIL;
            this.$task_info = Lisp.NIL;
            this.$finished = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$result;
        }

        @Override
        public SubLObject getField3() {
            return this.$task_info;
        }

        @Override
        public SubLObject getField4() {
            return this.$finished;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$result = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$task_info = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$finished = value;
        }

        static {
            structDecl = makeStructDeclNative($task_result_set_native.class, TASK_RESULT_SET, TASK_RESULT_SET_P, $list62, $list63, new String[]{ "$result", "$task_info", "$finished" }, $list64, $list65, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $task_result_set_p$UnaryFunction extends UnaryFunction {
        public $task_result_set_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-RESULT-SET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return task_result_set_p(arg1);
        }
    }

    public static final class $task_processor_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $process;

        public SubLObject $busy_p;

        public SubLObject $task_info;

        private static final SubLStructDeclNative structDecl;

        private $task_processor_native() {
            this.$name = Lisp.NIL;
            this.$process = Lisp.NIL;
            this.$busy_p = Lisp.NIL;
            this.$task_info = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$process;
        }

        @Override
        public SubLObject getField4() {
            return this.$busy_p;
        }

        @Override
        public SubLObject getField5() {
            return this.$task_info;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$process = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$busy_p = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$task_info = value;
        }

        static {
            structDecl = makeStructDeclNative($task_processor_native.class, TASK_PROCESSOR, TASK_PROCESSOR_P, $list83, $list84, new String[]{ "$name", "$process", "$busy_p", "$task_info" }, $list85, $list86, PRINT_TASK_PROCESSOR);
        }
    }

    public static final class $task_processor_p$UnaryFunction extends UnaryFunction {
        public $task_processor_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-PROCESSOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return task_processor_p(arg1);
        }
    }

    public static final class $task_process_pool_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $request_queue;

        public SubLObject $request_semaphore;

        public SubLObject $processors;

        public SubLObject $background_msgs;

        public SubLObject $process_name_prefix;

        public SubLObject $min_nbr_of_task_processors;

        public SubLObject $max_nbr_of_task_processors;

        private static final SubLStructDeclNative structDecl;

        private $task_process_pool_native() {
            this.$lock = Lisp.NIL;
            this.$request_queue = Lisp.NIL;
            this.$request_semaphore = Lisp.NIL;
            this.$processors = Lisp.NIL;
            this.$background_msgs = Lisp.NIL;
            this.$process_name_prefix = Lisp.NIL;
            this.$min_nbr_of_task_processors = Lisp.NIL;
            this.$max_nbr_of_task_processors = Lisp.NIL;
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
            return this.$request_queue;
        }

        @Override
        public SubLObject getField4() {
            return this.$request_semaphore;
        }

        @Override
        public SubLObject getField5() {
            return this.$processors;
        }

        @Override
        public SubLObject getField6() {
            return this.$background_msgs;
        }

        @Override
        public SubLObject getField7() {
            return this.$process_name_prefix;
        }

        @Override
        public SubLObject getField8() {
            return this.$min_nbr_of_task_processors;
        }

        @Override
        public SubLObject getField9() {
            return this.$max_nbr_of_task_processors;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$request_queue = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$request_semaphore = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$processors = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$background_msgs = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$process_name_prefix = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$min_nbr_of_task_processors = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$max_nbr_of_task_processors = value;
        }

        static {
            structDecl = makeStructDeclNative($task_process_pool_native.class, TASK_PROCESS_POOL, TASK_PROCESS_POOL_P, $list110, $list111, new String[]{ "$lock", "$request_queue", "$request_semaphore", "$processors", "$background_msgs", "$process_name_prefix", "$min_nbr_of_task_processors", "$max_nbr_of_task_processors" }, $list112, $list113, PRINT_TASK_PROCESS_POOL);
        }
    }

    public static final class $task_process_pool_p$UnaryFunction extends UnaryFunction {
        public $task_process_pool_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-PROCESS-POOL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return task_process_pool_p(arg1);
        }
    }
}

/**
 * Total time: 1053 ms synthetic
 */
