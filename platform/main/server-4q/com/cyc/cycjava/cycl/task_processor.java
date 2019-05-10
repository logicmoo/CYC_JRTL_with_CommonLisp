package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class task_processor
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.task_processor";
  public static final String myFingerPrint = "39b26879705e925f5267b4f67d7b1c8b6960e1dfe9c1639a7522c73e1b1735d1";
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 3913L)
  private static SubLSymbol $task_processor_verbosity$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLSymbol $dtp_task_info$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLSymbol $dtp_task_result_set$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13303L)
  private static SubLSymbol $task_processor_response_dispatch_fn_dict$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLSymbol $dtp_task_processor$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLSymbol $dtp_task_process_pool$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 18685L)
  public static SubLSymbol $task_request_queue_max_size$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 21527L)
  private static SubLSymbol $tpool_background_msg_path$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 21657L)
  private static SubLSymbol $tpool_background_msg_stream$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 22021L)
  private static SubLSymbol $queue_tpool_background_msgs_when_no_pathP$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 22249L)
  private static SubLSymbol $tpool_background_msg_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 29545L)
  private static SubLSymbol $eval_with_bindings$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 30530L)
  private static SubLSymbol $process_to_task_process_pool$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 32020L)
  private static SubLSymbol $task_processes_being_worked_on_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 32211L)
  private static SubLSymbol $task_processes_being_worked_on$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 32377L)
  private static SubLSymbol $task_processes_worked_on_history$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 39238L)
  private static SubLSymbol $task_processor_eval_fn_dict$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 39515L)
  private static SubLSymbol $minimize_task_processor_info_communication$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 39669L)
  private static SubLSymbol $current_task_processor_info$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 39894L)
  public static SubLSymbol $task_processor_standard_output$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 45242L)
  public static SubLSymbol $min_nbr_of_task_processors$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 45430L)
  public static SubLSymbol $max_nbr_of_task_processors$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 58548L)
  public static SubLSymbol $api_task_process_pool$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 58548L)
  public static SubLSymbol $api_task_process_pool_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 61283L)
  private static SubLSymbol $java_api_lease_activity_display$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 67251L)
  public static SubLSymbol $bg_task_process_pool$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 67251L)
  public static SubLSymbol $bg_task_process_pool_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 69083L)
  private static SubLSymbol $bg_task_processor_response_dict$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 69373L)
  private static SubLSymbol $bg_task_processor_request_id$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 71388L)
  public static SubLSymbol $console_task_process_pool$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 71388L)
  public static SubLSymbol $console_task_process_pool_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 71804L)
  private static SubLSymbol $task_processor_console_id$;
  private static final SubLSymbol $sym0$SET_TASK_PROCESSOR_VERBOSITY;
  private static final SubLSymbol $sym1$INTEGERP;
  private static final SubLString $str2$Invalid_verbosity__must_be_0___9_;
  private static final SubLSymbol $sym3$TASK_INFO;
  private static final SubLSymbol $sym4$TASK_INFO_P;
  private static final SubLList $list5;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$PRINT_TASK_INFO;
  private static final SubLSymbol $sym10$TASK_INFO_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list11;
  private static final SubLSymbol $sym12$TI_TYPE;
  private static final SubLSymbol $sym13$_CSETF_TI_TYPE;
  private static final SubLSymbol $sym14$TI_ID;
  private static final SubLSymbol $sym15$_CSETF_TI_ID;
  private static final SubLSymbol $sym16$TI_PRIORITY;
  private static final SubLSymbol $sym17$_CSETF_TI_PRIORITY;
  private static final SubLSymbol $sym18$TI_REQUESTOR;
  private static final SubLSymbol $sym19$_CSETF_TI_REQUESTOR;
  private static final SubLSymbol $sym20$TI_GIVEBACK_INFO;
  private static final SubLSymbol $sym21$_CSETF_TI_GIVEBACK_INFO;
  private static final SubLSymbol $sym22$TI_BINDINGS;
  private static final SubLSymbol $sym23$_CSETF_TI_BINDINGS;
  private static final SubLSymbol $sym24$TI_REQUEST;
  private static final SubLSymbol $sym25$_CSETF_TI_REQUEST;
  private static final SubLSymbol $sym26$TI_RESPONSE;
  private static final SubLSymbol $sym27$_CSETF_TI_RESPONSE;
  private static final SubLSymbol $sym28$TI_ERROR_MESSAGE;
  private static final SubLSymbol $sym29$_CSETF_TI_ERROR_MESSAGE;
  private static final SubLSymbol $sym30$TI_TASK_PROCESSOR_NAME;
  private static final SubLSymbol $sym31$_CSETF_TI_TASK_PROCESSOR_NAME;
  private static final SubLSymbol $kw32$TYPE;
  private static final SubLSymbol $kw33$ID;
  private static final SubLSymbol $kw34$PRIORITY;
  private static final SubLSymbol $kw35$REQUESTOR;
  private static final SubLSymbol $kw36$GIVEBACK_INFO;
  private static final SubLSymbol $kw37$BINDINGS;
  private static final SubLSymbol $kw38$REQUEST;
  private static final SubLSymbol $kw39$RESPONSE;
  private static final SubLSymbol $kw40$ERROR_MESSAGE;
  private static final SubLSymbol $kw41$TASK_PROCESSOR_NAME;
  private static final SubLString $str42$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw43$BEGIN;
  private static final SubLSymbol $sym44$MAKE_TASK_INFO;
  private static final SubLSymbol $kw45$SLOT;
  private static final SubLSymbol $kw46$END;
  private static final SubLSymbol $sym47$VISIT_DEFSTRUCT_OBJECT_TASK_INFO_METHOD;
  private static final SubLSymbol $sym48$SYMBOLP;
  private static final SubLSymbol $sym49$STRINGP;
  private static final SubLSymbol $sym50$STREAMP;
  private static final SubLString $str51$type_;
  private static final SubLString $str52$_id_;
  private static final SubLString $str53$_priority_;
  private static final SubLString $str54$_requestor_;
  private static final SubLString $str55$_giveback_info_;
  private static final SubLString $str56$_bindings_;
  private static final SubLString $str57$_request_;
  private static final SubLString $str58$_response_;
  private static final SubLString $str59$_error_message_;
  private static final SubLSymbol $sym60$TASK_RESULT_SET;
  private static final SubLSymbol $sym61$TASK_RESULT_SET_P;
  private static final SubLList $list62;
  private static final SubLList $list63;
  private static final SubLList $list64;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym67$TASK_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list68;
  private static final SubLSymbol $sym69$TASK_RESULT_SET_RESULT;
  private static final SubLSymbol $sym70$_CSETF_TASK_RESULT_SET_RESULT;
  private static final SubLSymbol $sym71$TASK_RESULT_SET_TASK_INFO;
  private static final SubLSymbol $sym72$_CSETF_TASK_RESULT_SET_TASK_INFO;
  private static final SubLSymbol $sym73$TASK_RESULT_SET_FINISHED;
  private static final SubLSymbol $sym74$_CSETF_TASK_RESULT_SET_FINISHED;
  private static final SubLSymbol $kw75$RESULT;
  private static final SubLSymbol $kw76$TASK_INFO;
  private static final SubLSymbol $kw77$FINISHED;
  private static final SubLSymbol $sym78$MAKE_TASK_RESULT_SET;
  private static final SubLSymbol $sym79$VISIT_DEFSTRUCT_OBJECT_TASK_RESULT_SET_METHOD;
  private static final SubLSymbol $sym80$BOOLEANP;
  private static final SubLSymbol $sym81$TASK_PROCESSOR;
  private static final SubLSymbol $sym82$TASK_PROCESSOR_P;
  private static final SubLList $list83;
  private static final SubLList $list84;
  private static final SubLList $list85;
  private static final SubLList $list86;
  private static final SubLSymbol $sym87$PRINT_TASK_PROCESSOR;
  private static final SubLSymbol $sym88$TASK_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list89;
  private static final SubLSymbol $sym90$TPROC_NAME;
  private static final SubLSymbol $sym91$_CSETF_TPROC_NAME;
  private static final SubLSymbol $sym92$TPROC_PROCESS;
  private static final SubLSymbol $sym93$_CSETF_TPROC_PROCESS;
  private static final SubLSymbol $sym94$TPROC_BUSY_P;
  private static final SubLSymbol $sym95$_CSETF_TPROC_BUSY_P;
  private static final SubLSymbol $sym96$TPROC_TASK_INFO;
  private static final SubLSymbol $sym97$_CSETF_TPROC_TASK_INFO;
  private static final SubLSymbol $kw98$NAME;
  private static final SubLSymbol $kw99$PROCESS;
  private static final SubLSymbol $kw100$BUSY_P;
  private static final SubLSymbol $sym101$MAKE_TASK_PROCESSOR;
  private static final SubLSymbol $sym102$VISIT_DEFSTRUCT_OBJECT_TASK_PROCESSOR_METHOD;
  private static final SubLString $str103$name_;
  private static final SubLString $str104$_process_;
  private static final SubLString $str105$_whostate_;
  private static final SubLString $str106$_busy_p_;
  private static final SubLString $str107$_last_response_;
  private static final SubLSymbol $sym108$TASK_PROCESS_POOL;
  private static final SubLSymbol $sym109$TASK_PROCESS_POOL_P;
  private static final SubLList $list110;
  private static final SubLList $list111;
  private static final SubLList $list112;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$PRINT_TASK_PROCESS_POOL;
  private static final SubLSymbol $sym115$TASK_PROCESS_POOL_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list116;
  private static final SubLSymbol $sym117$TPOOL_LOCK;
  private static final SubLSymbol $sym118$_CSETF_TPOOL_LOCK;
  private static final SubLSymbol $sym119$TPOOL_REQUEST_QUEUE;
  private static final SubLSymbol $sym120$_CSETF_TPOOL_REQUEST_QUEUE;
  private static final SubLSymbol $sym121$TPOOL_REQUEST_SEMAPHORE;
  private static final SubLSymbol $sym122$_CSETF_TPOOL_REQUEST_SEMAPHORE;
  private static final SubLSymbol $sym123$TPOOL_PROCESSORS;
  private static final SubLSymbol $sym124$_CSETF_TPOOL_PROCESSORS;
  private static final SubLSymbol $sym125$TPOOL_BACKGROUND_MSGS;
  private static final SubLSymbol $sym126$_CSETF_TPOOL_BACKGROUND_MSGS;
  private static final SubLSymbol $sym127$TPOOL_PROCESS_NAME_PREFIX;
  private static final SubLSymbol $sym128$_CSETF_TPOOL_PROCESS_NAME_PREFIX;
  private static final SubLSymbol $sym129$TPOOL_MIN_NBR_OF_TASK_PROCESSORS;
  private static final SubLSymbol $sym130$_CSETF_TPOOL_MIN_NBR_OF_TASK_PROCESSORS;
  private static final SubLSymbol $sym131$TPOOL_MAX_NBR_OF_TASK_PROCESSORS;
  private static final SubLSymbol $sym132$_CSETF_TPOOL_MAX_NBR_OF_TASK_PROCESSORS;
  private static final SubLSymbol $kw133$LOCK;
  private static final SubLSymbol $kw134$REQUEST_QUEUE;
  private static final SubLSymbol $kw135$REQUEST_SEMAPHORE;
  private static final SubLSymbol $kw136$PROCESSORS;
  private static final SubLSymbol $kw137$BACKGROUND_MSGS;
  private static final SubLSymbol $kw138$PROCESS_NAME_PREFIX;
  private static final SubLSymbol $kw139$MIN_NBR_OF_TASK_PROCESSORS;
  private static final SubLSymbol $kw140$MAX_NBR_OF_TASK_PROCESSORS;
  private static final SubLSymbol $sym141$MAKE_TASK_PROCESS_POOL;
  private static final SubLSymbol $sym142$VISIT_DEFSTRUCT_OBJECT_TASK_PROCESS_POOL_METHOD;
  private static final SubLString $str143$_request_queue_;
  private static final SubLString $str144$_processors_;
  private static final SubLString $str145$_process_name_prefix_;
  private static final SubLString $str146$_min_processors_;
  private static final SubLString $str147$_max_processors_;
  private static final SubLString $str148$There_are_no_task_processors_;
  private static final SubLString $str149$_S__;
  private static final SubLString $str150$request__S__;
  private static final SubLInteger $int151$500;
  private static final SubLSymbol $sym152$LOCK_P;
  private static final SubLSymbol $sym153$PRIORITY_QUEUE_P;
  private static final SubLSymbol $sym154$LISTP;
  private static final SubLSymbol $sym155$SET_TPOOL_BACKGROUND_MSG_PATH;
  private static final SubLSymbol $sym156$_TPOOL_BACKGROUND_MSG_LOCK_;
  private static final SubLString $str157$tpool_background_msg_lock;
  private static final SubLSymbol $sym158$PUSH_TPOOL_BACKGROUND_MSG;
  private static final SubLString $str159$_A_is_not_a_valid_file_specificat;
  private static final SubLSymbol $kw160$DIRECTION;
  private static final SubLSymbol $kw161$OUTPUT;
  private static final SubLSymbol $kw162$IF_DOES_NOT_EXIST;
  private static final SubLSymbol $kw163$CREATE;
  private static final SubLSymbol $kw164$IF_EXISTS;
  private static final SubLSymbol $kw165$OVERWRITE;
  private static final SubLString $str166$_;
  private static final SubLString $str167$_;
  private static final SubLString $str168$__;
  private static final SubLString $str169$_;
  private static final SubLSymbol $sym170$FLUSH_TPOOL_BACKGROUND_MSGS;
  private static final SubLSymbol $sym171$START_TASK_PROCESSOR_LOGGING_TO_FILE;
  private static final SubLSymbol $sym172$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $sym173$END_TASK_PROCESSOR_LOGGING_TO_FILE;
  private static final SubLSymbol $kw174$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym175$IGNORE_ERRORS_HANDLER;
  private static final SubLSymbol $sym176$SAVE_UNLOGGED_TASK_PROCESSOR_MESSAGES_TO_FILE;
  private static final SubLString $str177$Unable_to_open__S;
  private static final SubLSymbol $sym178$CLET;
  private static final SubLSymbol $sym179$CSETQ;
  private static final SubLSymbol $sym180$_EVAL_WITH_BINDINGS_;
  private static final SubLSymbol $sym181$CYC_API_EVAL;
  private static final SubLSymbol $sym182$EVAL;
  private static final SubLSymbol $sym183$PROCESSP;
  private static final SubLString $str184$Task_processes_being_worked_on;
  private static final SubLSymbol $kw185$ABORT;
  private static final SubLSymbol $kw186$CANCEL;
  private static final SubLSymbol $sym187$TASK_PROCESS_TERMINATION_REASON_P;
  private static final SubLSymbol $kw188$NEWEST;
  private static final SubLSymbol $sym189$SIGNAL_ABORT_ACTIVE_TASK_PROCESS;
  private static final SubLSymbol $sym190$SIGNAL_CANCEL_ACTIVE_TASK_PROCESS;
  private static final SubLString $str191$API_error__Unknown_active_task_pr;
  private static final SubLSymbol $kw192$TERMINATE_PREMATURELY;
  private static final SubLList $list193;
  private static final SubLSymbol $sym194$CCATCH;
  private static final SubLSymbol $sym195$PROGN;
  private static final SubLSymbol $sym196$CATCH_TASK_PROCESSOR_TERMINATION;
  private static final SubLString $str197$Allow_for_the_API_calling_side_to;
  private static final SubLSymbol $sym198$ANS_VAR;
  private static final SubLSymbol $sym199$CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY;
  private static final SubLList $list200;
  private static final SubLString $str201$Allow_for_the_API_calling_side_to;
  private static final SubLFloat $float202$0_001;
  private static final SubLSymbol $kw203$TASK_PROCESSOR_QUIT;
  private static final SubLString $str204$Invalid_task_processor;
  private static final SubLString $str205$Invalid_task_process_pool;
  private static final SubLString $str206$Task_Info__S__;
  private static final SubLSymbol $sym207$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str208$Response__S__;
  private static final SubLString $str209$Error_message__S__;
  private static final SubLString $str210$Posting_partial_results__A_at__A;
  private static final SubLString $str211$Function_only_valid_from_within_a;
  private static final SubLInteger $int212$25;
  private static final SubLString $str213$Task_processor_;
  private static final SubLString $str214$Initializing_task_processors__;
  private static final SubLString $str215$_alock;
  private static final SubLString $str216$task_pool_request_semaphore;
  private static final SubLString $str217$_a_s;
  private static final SubLSymbol $sym218$TASK_PROCESSOR_HANDLER;
  private static final SubLSymbol $sym219$TASK_PROCESSOR_QUIT;
  private static final SubLSymbol $sym220$ENSURE_TASK_PROCESSORS_KILLED;
  private static final SubLString $str221$_processor_;
  private static final SubLString $str222$_Killing__A___;
  private static final SubLString $str223$Allocating_a_new_task_processor__;
  private static final SubLString $str224$Awakening_first_available_task_pr;
  private static final SubLString $str225$Task_processors_are_not_initializ;
  private static final SubLString $str226$__Error__cannot_queue_task_reques;
  private static final SubLSymbol $sym227$WITH_LONG_RUNNING_TASK_PROCESS;
  private static final SubLList $list228;
  private static final SubLSymbol $sym229$CUNWIND_PROTECT;
  private static final SubLList $list230;
  private static final SubLList $list231;
  private static final SubLList $list232;
  private static final SubLString $str233$_;
  private static final SubLString $str234$_TASK_PROCESS_POOL_;
  private static final SubLString $str235$_TASK_PROCESS_POOL_LOCK_;
  private static final SubLSymbol $sym236$DEFLEXICAL_PUBLIC;
  private static final SubLList $list237;
  private static final SubLSymbol $sym238$DEFCONSTANT_PUBLIC;
  private static final SubLList $list239;
  private static final SubLSymbol $sym240$DEFINE_PUBLIC;
  private static final SubLString $str241$_TASK_PROCESSORS_INITIALIZED_P;
  private static final SubLString $str242$Return_T_when_there_are_task_proc;
  private static final SubLSymbol $sym243$RET;
  private static final SubLSymbol $sym244$TASK_PROCESSORS_INITIALIZED_P;
  private static final SubLString $str245$INITIALIZE_;
  private static final SubLString $str246$_TASK_PROCESSORS;
  private static final SubLString $str247$Initialize_the_task_processor_poo;
  private static final SubLSymbol $sym248$WITH_LOCK_HELD;
  private static final SubLSymbol $sym249$PWHEN;
  private static final SubLList $list250;
  private static final SubLSymbol $sym251$INITIALIZE_TASK_PROCESSORS;
  private static final SubLSymbol $sym252$CCONCATENATE;
  private static final SubLList $list253;
  private static final SubLList $list254;
  private static final SubLString $str255$HALT_;
  private static final SubLString $str256$Halt_the_task_processors_;
  private static final SubLSymbol $sym257$HALT_TASK_PROCESSORS;
  private static final SubLList $list258;
  private static final SubLList $list259;
  private static final SubLString $str260$RESTART_;
  private static final SubLString $str261$Restart__halt___initialize__the_t;
  private static final SubLString $str262$SHOW_;
  private static final SubLString $str263$_TP_MSGS;
  private static final SubLString $str264$Show_and_reset_the_task_processor;
  private static final SubLSymbol $sym265$SHOW_TP_MSGS;
  private static final SubLList $list266;
  private static final SubLString $str267$_TASK_PROCESSOR_REQUEST;
  private static final SubLList $list268;
  private static final SubLSymbol $sym269$DICTIONARY_ENTER;
  private static final SubLSymbol $sym270$_TASK_PROCESSOR_EVAL_FN_DICT_;
  private static final SubLList $list271;
  private static final SubLString $str272$DISPATCH_;
  private static final SubLString $str273$_TASK_PROCESSOR_RESPONSE;
  private static final SubLList $list274;
  private static final SubLSymbol $sym275$_TASK_PROCESSOR_RESPONSE_DISPATCH_FN_DICT_;
  private static final SubLSymbol $sym276$FUNCTION;
  private static final SubLString $str277$task_processor_initialization_loc;
  private static final SubLString $str278$Illegal_attempt_to_reinitialize_p;
  private static final SubLString $str279$API;
  private static final SubLSymbol $sym280$SHOW_API_TASK_PROCESSORS;
  private static final SubLString $str281$Provides_a_convenient_alias_for_D;
  private static final SubLSymbol $sym282$DISPLAY_API_TASK_PROCESSORS;
  private static final SubLString $str283$;
  private static final SubLSymbol $sym284$INITIALIZE_API_TASK_PROCESSORS;
  private static final SubLSymbol $sym285$HALT_API_TASK_PROCESSORS;
  private static final SubLSymbol $sym286$RESTART_API_TASK_PROCESSORS;
  private static final SubLSymbol $sym287$SHOW_API_TP_MSGS;
  private static final SubLSymbol $sym288$API_TASK_PROCESSOR_REQUEST;
  private static final SubLSymbol $sym289$WITH_IMMEDIATE_EXECUTION;
  private static final SubLSymbol $kw290$API;
  private static final SubLSymbol $sym291$SET_JAVA_API_LEASE_ACTIVITY_DISPLAY;
  private static final SubLString $str292$Dispatching_api_response__S__;
  private static final SubLSymbol $sym293$TASK_PROCESSOR_RESPONSE;
  private static final SubLString $str294$Sending_api_response__S_to_socket;
  private static final SubLString $str295$Dropping_api_response__S__socket_;
  private static final SubLSymbol $sym296$DISPATCH_API_TASK_PROCESSOR_RESPONSE;
  private static final SubLSymbol $sym297$INTERMEDIATE_RESULTS_ACCUMULATOR_RESET;
  private static final SubLSymbol $sym298$INTERMEDIATE_RESULTS_ACCUMULATOR_ADD;
  private static final SubLSymbol $sym299$INTERMEDIATE_RESULTS_ACCUMULATOR_SIZE;
  private static final SubLSymbol $sym300$INTERMEDIATE_RESULTS_ACCUMULATOR_CONTENTS;
  private static final SubLSymbol $sym301$INTERMEDIATE_RESULTS_ACCUMULATOR_ITERATOR;
  private static final SubLSymbol $sym302$INTERMEDIATE_RESULTS_ACCUMULATOR_ADD_ALL;
  private static final SubLString $str303$Cannot_invoke_intermediate_result;
  private static final SubLString $str304$BG;
  private static final SubLSymbol $kw305$BG;
  private static final SubLString $str306$dispatching_bg_response__S__;
  private static final SubLString $str307$bg_response_dictionary__S__;
  private static final SubLSymbol $sym308$DISPATCH_BG_TASK_PROCESSOR_RESPONSE;
  private static final SubLString $str309$CONSOLE;
  private static final SubLSymbol $sym310$_TASK_PROCESSOR_CONSOLE_ID_;
  private static final SubLSymbol $kw311$CONSOLE;
  private static final SubLString $str312$dispatching_console_response__S__;
  private static final SubLString $str313$_A___A__;
  private static final SubLSymbol $sym314$DISPATCH_CONSOLE_TASK_PROCESSOR_RESPONSE;
  private static final SubLString $str315$Task_Processor_Module_Supercatego;
  private static final SubLString $str316$Task_Processor_Subcategory;
  private static final SubLString $str317$Task_Processor_Testing_Suite;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 4968L)
  public static SubLObject get_task_processor_verbosity()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $task_processor_verbosity$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5120L)
  public static SubLObject set_task_processor_verbosity(final SubLObject verbosity)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( verbosity ) : verbosity;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && ( !MINUS_ONE_INTEGER.numL( verbosity ) || !verbosity.numL( TEN_INTEGER ) ) )
    {
      Errors.error( $str2$Invalid_verbosity__must_be_0___9_, verbosity );
    }
    $task_processor_verbosity$.setDynamicValue( verbosity, thread );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject task_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_task_info( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject task_info_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $task_info_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject ti_type(final SubLObject v_object)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject ti_id(final SubLObject v_object)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject ti_priority(final SubLObject v_object)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject ti_requestor(final SubLObject v_object)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject ti_giveback_info(final SubLObject v_object)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject ti_bindings(final SubLObject v_object)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject ti_request(final SubLObject v_object)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject ti_response(final SubLObject v_object)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject ti_error_message(final SubLObject v_object)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject ti_task_processor_name(final SubLObject v_object)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject _csetf_ti_type(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject _csetf_ti_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject _csetf_ti_priority(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject _csetf_ti_requestor(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject _csetf_ti_giveback_info(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject _csetf_ti_bindings(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject _csetf_ti_request(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject _csetf_ti_response(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject _csetf_ti_error_message(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject _csetf_ti_task_processor_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_info_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject make_task_info(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $task_info_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw32$TYPE ) )
      {
        _csetf_ti_type( v_new, current_value );
      }
      else if( pcase_var.eql( $kw33$ID ) )
      {
        _csetf_ti_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw34$PRIORITY ) )
      {
        _csetf_ti_priority( v_new, current_value );
      }
      else if( pcase_var.eql( $kw35$REQUESTOR ) )
      {
        _csetf_ti_requestor( v_new, current_value );
      }
      else if( pcase_var.eql( $kw36$GIVEBACK_INFO ) )
      {
        _csetf_ti_giveback_info( v_new, current_value );
      }
      else if( pcase_var.eql( $kw37$BINDINGS ) )
      {
        _csetf_ti_bindings( v_new, current_value );
      }
      else if( pcase_var.eql( $kw38$REQUEST ) )
      {
        _csetf_ti_request( v_new, current_value );
      }
      else if( pcase_var.eql( $kw39$RESPONSE ) )
      {
        _csetf_ti_response( v_new, current_value );
      }
      else if( pcase_var.eql( $kw40$ERROR_MESSAGE ) )
      {
        _csetf_ti_error_message( v_new, current_value );
      }
      else if( pcase_var.eql( $kw41$TASK_PROCESSOR_NAME ) )
      {
        _csetf_ti_task_processor_name( v_new, current_value );
      }
      else
      {
        Errors.error( $str42$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject visit_defstruct_task_info(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw43$BEGIN, $sym44$MAKE_TASK_INFO, TEN_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw32$TYPE, ti_type( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw33$ID, ti_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw34$PRIORITY, ti_priority( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw35$REQUESTOR, ti_requestor( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw36$GIVEBACK_INFO, ti_giveback_info( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw37$BINDINGS, ti_bindings( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw38$REQUEST, ti_request( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw39$RESPONSE, ti_response( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw40$ERROR_MESSAGE, ti_error_message( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw41$TASK_PROCESSOR_NAME, ti_task_processor_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$END, $sym44$MAKE_TASK_INFO, TEN_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 5794L)
  public static SubLObject visit_defstruct_object_task_info_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_task_info( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 6458L)
  public static SubLObject get_task_info_type(final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    return ti_type( task_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 6686L)
  public static SubLObject set_task_info_type(final SubLObject type, final SubLObject task_info)
  {
    assert NIL != Types.symbolp( type ) : type;
    assert NIL != task_info_p( task_info ) : task_info;
    _csetf_ti_type( task_info, type );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 6940L)
  public static SubLObject get_task_info_id(final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    return ti_id( task_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 7134L)
  public static SubLObject set_task_info_id(final SubLObject id, final SubLObject task_info)
  {
    assert NIL != Types.integerp( id ) : id;
    assert NIL != task_info_p( task_info ) : task_info;
    _csetf_ti_id( task_info, id );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 7376L)
  public static SubLObject get_task_info_priority(final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    return ti_priority( task_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 7588L)
  public static SubLObject set_task_info_priority(final SubLObject priority, final SubLObject task_info)
  {
    assert NIL != Types.integerp( priority ) : priority;
    assert NIL != task_info_p( task_info ) : task_info;
    _csetf_ti_priority( task_info, priority );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 7872L)
  public static SubLObject get_task_info_requestor(final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    return ti_requestor( task_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 8085L)
  public static SubLObject set_task_info_requestor(final SubLObject requestor, final SubLObject task_info)
  {
    assert NIL != Types.stringp( requestor ) : requestor;
    assert NIL != task_info_p( task_info ) : task_info;
    _csetf_ti_requestor( task_info, requestor );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 8374L)
  public static SubLObject get_task_info_giveback_info(final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    return ti_giveback_info( task_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 8595L)
  public static SubLObject set_task_info_giveback_info(final SubLObject giveback_info, final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    _csetf_ti_giveback_info( task_info, giveback_info );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 8871L)
  public static SubLObject get_task_info_bindings(final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    return ti_bindings( task_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 9080L)
  public static SubLObject set_task_info_bindings(final SubLObject v_bindings, final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    _csetf_ti_bindings( task_info, v_bindings );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 9368L)
  public static SubLObject get_task_info_request(final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    return ti_request( task_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 9582L)
  public static SubLObject set_task_info_request(final SubLObject request, final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    _csetf_ti_request( task_info, request );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 9856L)
  public static SubLObject get_task_info_response(final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    return ti_response( task_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 10073L)
  public static SubLObject set_task_info_response(final SubLObject response, final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    _csetf_ti_response( task_info, response );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 10341L)
  public static SubLObject get_task_info_error_message(final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    return ti_error_message( task_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 10567L)
  public static SubLObject set_task_info_error_message(final SubLObject error_message, final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    _csetf_ti_error_message( task_info, error_message );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 10847L)
  public static SubLObject get_task_info_task_processor_name(final SubLObject task_info)
  {
    assert NIL != task_info_p( task_info ) : task_info;
    return ti_task_processor_name( task_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 11091L)
  public static SubLObject set_task_info_task_processor_name(final SubLObject task_processor_name, final SubLObject task_info)
  {
    assert NIL != Types.stringp( task_processor_name ) : task_processor_name;
    assert NIL != task_info_p( task_info ) : task_info;
    _csetf_ti_task_processor_name( task_info, task_processor_name );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 11450L)
  public static SubLObject print_task_info(final SubLObject task_info, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != task_info_p( task_info ) : task_info;
    assert NIL != Types.streamp( stream ) : stream;
    streams_high.terpri( stream );
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( task_info, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, task_info, T, T );
      streams_high.write_string( $str51$type_, stream, UNPROVIDED, UNPROVIDED );
      print_high.prin1( ti_type( task_info ), stream );
      streams_high.write_string( $str52$_id_, stream, UNPROVIDED, UNPROVIDED );
      print_high.prin1( ti_id( task_info ), stream );
      streams_high.write_string( $str53$_priority_, stream, UNPROVIDED, UNPROVIDED );
      print_high.prin1( ti_priority( task_info ), stream );
      streams_high.write_string( $str54$_requestor_, stream, UNPROVIDED, UNPROVIDED );
      print_high.prin1( ti_requestor( task_info ), stream );
      streams_high.write_string( $str55$_giveback_info_, stream, UNPROVIDED, UNPROVIDED );
      print_high.prin1( ti_giveback_info( task_info ), stream );
      streams_high.terpri( stream );
      streams_high.write_string( $str56$_bindings_, stream, UNPROVIDED, UNPROVIDED );
      print_high.prin1( ti_bindings( task_info ), stream );
      streams_high.terpri( stream );
      streams_high.write_string( $str57$_request_, stream, UNPROVIDED, UNPROVIDED );
      print_high.prin1( ti_request( task_info ), stream );
      streams_high.terpri( stream );
      streams_high.write_string( $str58$_response_, stream, UNPROVIDED, UNPROVIDED );
      print_high.prin1( ti_response( task_info ), stream );
      streams_high.terpri( stream );
      streams_high.write_string( $str59$_error_message_, stream, UNPROVIDED, UNPROVIDED );
      print_high.prin1( ti_error_message( task_info ), stream );
      print_macros.print_unreadable_object_postamble( stream, task_info, T, T );
    }
    return task_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLObject task_result_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLObject task_result_set_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $task_result_set_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLObject task_result_set_result(final SubLObject v_object)
  {
    assert NIL != task_result_set_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLObject task_result_set_task_info(final SubLObject v_object)
  {
    assert NIL != task_result_set_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLObject task_result_set_finished(final SubLObject v_object)
  {
    assert NIL != task_result_set_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLObject _csetf_task_result_set_result(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_result_set_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLObject _csetf_task_result_set_task_info(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_result_set_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLObject _csetf_task_result_set_finished(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_result_set_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLObject make_task_result_set(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $task_result_set_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw75$RESULT ) )
      {
        _csetf_task_result_set_result( v_new, current_value );
      }
      else if( pcase_var.eql( $kw76$TASK_INFO ) )
      {
        _csetf_task_result_set_task_info( v_new, current_value );
      }
      else if( pcase_var.eql( $kw77$FINISHED ) )
      {
        _csetf_task_result_set_finished( v_new, current_value );
      }
      else
      {
        Errors.error( $str42$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLObject visit_defstruct_task_result_set(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw43$BEGIN, $sym78$MAKE_TASK_RESULT_SET, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw75$RESULT, task_result_set_result( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw76$TASK_INFO, task_result_set_task_info( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw77$FINISHED, task_result_set_finished( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$END, $sym78$MAKE_TASK_RESULT_SET, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12650L)
  public static SubLObject visit_defstruct_object_task_result_set_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_task_result_set( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 12834L)
  public static SubLObject new_task_result_set(final SubLObject result, final SubLObject task_info, final SubLObject finished)
  {
    assert NIL != Types.booleanp( finished ) : finished;
    final SubLObject result_set = make_task_result_set( UNPROVIDED );
    _csetf_task_result_set_result( result_set, result );
    _csetf_task_result_set_task_info( result_set, task_info );
    _csetf_task_result_set_finished( result_set, finished );
    return result_set;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13176L)
  public static SubLObject task_result_set_priority(final SubLObject task_result_set)
  {
    return ti_priority( task_result_set_task_info( task_result_set ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject task_processor_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_task_processor( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject task_processor_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $task_processor_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject tproc_name(final SubLObject v_object)
  {
    assert NIL != task_processor_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject tproc_process(final SubLObject v_object)
  {
    assert NIL != task_processor_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject tproc_busy_p(final SubLObject v_object)
  {
    assert NIL != task_processor_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject tproc_task_info(final SubLObject v_object)
  {
    assert NIL != task_processor_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject _csetf_tproc_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_processor_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject _csetf_tproc_process(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_processor_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject _csetf_tproc_busy_p(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_processor_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject _csetf_tproc_task_info(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_processor_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject make_task_processor(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $task_processor_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw98$NAME ) )
      {
        _csetf_tproc_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw99$PROCESS ) )
      {
        _csetf_tproc_process( v_new, current_value );
      }
      else if( pcase_var.eql( $kw100$BUSY_P ) )
      {
        _csetf_tproc_busy_p( v_new, current_value );
      }
      else if( pcase_var.eql( $kw76$TASK_INFO ) )
      {
        _csetf_tproc_task_info( v_new, current_value );
      }
      else
      {
        Errors.error( $str42$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject visit_defstruct_task_processor(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw43$BEGIN, $sym101$MAKE_TASK_PROCESSOR, FOUR_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw98$NAME, tproc_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw99$PROCESS, tproc_process( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw100$BUSY_P, tproc_busy_p( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw76$TASK_INFO, tproc_task_info( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$END, $sym101$MAKE_TASK_PROCESSOR, FOUR_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13662L)
  public static SubLObject visit_defstruct_object_task_processor_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_task_processor( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 13924L)
  public static SubLObject print_task_processor(final SubLObject v_task_processor, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( v_task_processor, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, v_task_processor, T, T );
      streams_high.write_string( $str103$name_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( tproc_name( v_task_processor ), stream );
      streams_high.terpri( stream );
      streams_high.write_string( $str104$_process_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( tproc_process( v_task_processor ), stream );
      streams_high.terpri( stream );
      streams_high.write_string( $str105$_whostate_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( Threads.process_whostate( tproc_process( v_task_processor ) ), stream );
      streams_high.write_string( $str106$_busy_p_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( tproc_busy_p( v_task_processor ), stream );
      streams_high.terpri( stream );
      if( NIL != tproc_task_info( v_task_processor ) )
      {
        streams_high.write_string( $str57$_request_, stream, UNPROVIDED, UNPROVIDED );
        format_cycl_expression.format_cycl_expression( ti_request( tproc_task_info( v_task_processor ) ), stream, UNPROVIDED );
        streams_high.terpri( stream );
        if( NIL != ti_response( tproc_task_info( v_task_processor ) ) )
        {
          streams_high.write_string( $str107$_last_response_, stream, UNPROVIDED, UNPROVIDED );
          format_cycl_expression.format_cycl_expression( ti_response( tproc_task_info( v_task_processor ) ), stream, UNPROVIDED );
          streams_high.terpri( stream );
        }
      }
      print_macros.print_unreadable_object_postamble( stream, v_task_processor, T, T );
    }
    return v_task_processor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject task_process_pool_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    print_task_process_pool( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject task_process_pool_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $task_process_pool_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject tpool_lock(final SubLObject v_object)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject tpool_request_queue(final SubLObject v_object)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject tpool_request_semaphore(final SubLObject v_object)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject tpool_processors(final SubLObject v_object)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject tpool_background_msgs(final SubLObject v_object)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject tpool_process_name_prefix(final SubLObject v_object)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject tpool_min_nbr_of_task_processors(final SubLObject v_object)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject tpool_max_nbr_of_task_processors(final SubLObject v_object)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject _csetf_tpool_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject _csetf_tpool_request_queue(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject _csetf_tpool_request_semaphore(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject _csetf_tpool_processors(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject _csetf_tpool_background_msgs(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject _csetf_tpool_process_name_prefix(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject _csetf_tpool_min_nbr_of_task_processors(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject _csetf_tpool_max_nbr_of_task_processors(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_process_pool_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject make_task_process_pool(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $task_process_pool_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw133$LOCK ) )
      {
        _csetf_tpool_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw134$REQUEST_QUEUE ) )
      {
        _csetf_tpool_request_queue( v_new, current_value );
      }
      else if( pcase_var.eql( $kw135$REQUEST_SEMAPHORE ) )
      {
        _csetf_tpool_request_semaphore( v_new, current_value );
      }
      else if( pcase_var.eql( $kw136$PROCESSORS ) )
      {
        _csetf_tpool_processors( v_new, current_value );
      }
      else if( pcase_var.eql( $kw137$BACKGROUND_MSGS ) )
      {
        _csetf_tpool_background_msgs( v_new, current_value );
      }
      else if( pcase_var.eql( $kw138$PROCESS_NAME_PREFIX ) )
      {
        _csetf_tpool_process_name_prefix( v_new, current_value );
      }
      else if( pcase_var.eql( $kw139$MIN_NBR_OF_TASK_PROCESSORS ) )
      {
        _csetf_tpool_min_nbr_of_task_processors( v_new, current_value );
      }
      else if( pcase_var.eql( $kw140$MAX_NBR_OF_TASK_PROCESSORS ) )
      {
        _csetf_tpool_max_nbr_of_task_processors( v_new, current_value );
      }
      else
      {
        Errors.error( $str42$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject visit_defstruct_task_process_pool(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw43$BEGIN, $sym141$MAKE_TASK_PROCESS_POOL, EIGHT_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw133$LOCK, tpool_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw134$REQUEST_QUEUE, tpool_request_queue( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw135$REQUEST_SEMAPHORE, tpool_request_semaphore( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw136$PROCESSORS, tpool_processors( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw137$BACKGROUND_MSGS, tpool_background_msgs( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw138$PROCESS_NAME_PREFIX, tpool_process_name_prefix( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw139$MIN_NBR_OF_TASK_PROCESSORS, tpool_min_nbr_of_task_processors( obj ) );
    Functions.funcall( visitor_fn, obj, $kw45$SLOT, $kw140$MAX_NBR_OF_TASK_PROCESSORS, tpool_max_nbr_of_task_processors( obj ) );
    Functions.funcall( visitor_fn, obj, $kw46$END, $sym141$MAKE_TASK_PROCESS_POOL, EIGHT_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 15380L)
  public static SubLObject visit_defstruct_object_task_process_pool_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_task_process_pool( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 16029L)
  public static SubLObject print_task_process_pool(final SubLObject task_process_pool, final SubLObject stream, final SubLObject depth)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != print_high.$print_readably$.getDynamicValue( thread ) )
    {
      print_high.print_not_readable( task_process_pool, stream );
    }
    else
    {
      print_macros.print_unreadable_object_preamble( stream, task_process_pool, T, T );
      streams_high.write_string( $str143$_request_queue_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( tpool_request_queue( task_process_pool ), stream );
      streams_high.terpri( stream );
      streams_high.write_string( $str144$_processors_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( tpool_processors( task_process_pool ), stream );
      streams_high.terpri( stream );
      streams_high.write_string( $str145$_process_name_prefix_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( get_tpool_process_name_prefix( task_process_pool ), stream );
      streams_high.terpri( stream );
      streams_high.write_string( $str146$_min_processors_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( get_tpool_min_nbr_of_task_processors( task_process_pool ), stream );
      streams_high.terpri( stream );
      streams_high.write_string( $str147$_max_processors_, stream, UNPROVIDED, UNPROVIDED );
      print_high.princ( get_tpool_max_nbr_of_task_processors( task_process_pool ), stream );
      streams_high.terpri( stream );
      print_macros.print_unreadable_object_postamble( stream, task_process_pool, T, T );
    }
    return task_process_pool;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 16987L)
  public static SubLObject display_task_processors(final SubLObject task_process_pool, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    assert NIL != Types.streamp( stream ) : stream;
    if( NIL != tpool_processors( task_process_pool ) )
    {
      SubLObject cdolist_list_var = tpool_processors( task_process_pool );
      SubLObject v_task_processor = NIL;
      v_task_processor = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        print_high.print( v_task_processor, stream );
        cdolist_list_var = cdolist_list_var.rest();
        v_task_processor = cdolist_list_var.first();
      }
    }
    else
    {
      print_high.princ( $str148$There_are_no_task_processors_, stream );
      streams_high.terpri( stream );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 17563L)
  public static SubLObject display_active_task_processes(SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    SubLObject cdolist_list_var = Threads.all_processes();
    SubLObject process = NIL;
    process = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject task_pool = get_task_process_pool_for_process( process );
      final SubLObject pool_processors = ( NIL != task_pool ) ? tpool_processors( task_pool ) : NIL;
      SubLObject doneP = NIL;
      if( NIL == doneP )
      {
        SubLObject csome_list_var = pool_processors;
        SubLObject pool_processor = NIL;
        pool_processor = csome_list_var.first();
        while ( NIL == doneP && NIL != csome_list_var)
        {
          if( tproc_process( pool_processor ).equal( process ) && NIL != tproc_task_info( pool_processor ) && NIL != ti_request( tproc_task_info( pool_processor ) ) )
          {
            doneP = T;
            PrintLow.format( stream, $str149$_S__, process );
            PrintLow.format( stream, $str150$request__S__, ti_request( tproc_task_info( pool_processor ) ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 18405L)
  public static SubLObject task_processors_initialized_p(final SubLObject task_process_pool)
  {
    if( NIL == task_process_pool_p( task_process_pool ) )
    {
      return NIL;
    }
    return Types.listp( tpool_processors( task_process_pool ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 18741L)
  public static SubLObject get_tpool_lock(final SubLObject task_process_pool)
  {
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    return tpool_lock( task_process_pool );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 18998L)
  public static SubLObject set_tpool_lock(final SubLObject lock, final SubLObject task_process_pool)
  {
    assert NIL != Types.lock_p( lock ) : lock;
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    _csetf_tpool_lock( task_process_pool, lock );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 19306L)
  public static SubLObject get_tpool_request_queue(final SubLObject task_process_pool)
  {
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    return tpool_request_queue( task_process_pool );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 19602L)
  public static SubLObject set_tpool_request_queue(final SubLObject request_queue, final SubLObject task_process_pool)
  {
    assert NIL != queues.priority_queue_p( request_queue ) : request_queue;
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    _csetf_tpool_request_queue( task_process_pool, request_queue );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 19993L)
  public static SubLObject get_tpool_processors(final SubLObject task_process_pool)
  {
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    return tpool_processors( task_process_pool );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 20296L)
  public static SubLObject get_tpool_processors_nbr(final SubLObject task_process_pool)
  {
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    return Sequences.length( tpool_processors( task_process_pool ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 20617L)
  public static SubLObject push_tpool_processor(final SubLObject v_task_processor, final SubLObject task_process_pool)
  {
    assert NIL != task_processor_p( v_task_processor ) : v_task_processor;
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    SubLObject task_processors = tpool_processors( task_process_pool );
    task_processors = ConsesLow.cons( v_task_processor, task_processors );
    _csetf_tpool_processors( task_process_pool, task_processors );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 21154L)
  public static SubLObject set_tpool_processors(final SubLObject task_processors, final SubLObject task_process_pool)
  {
    assert NIL != Types.listp( task_processors ) : task_processors;
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    _csetf_tpool_processors( task_process_pool, task_processors );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 21777L)
  public static SubLObject set_tpool_background_msg_path(final SubLObject path)
  {
    assert NIL != Types.stringp( path ) : path;
    $tpool_background_msg_path$.setGlobalValue( path );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 22430L)
  public static SubLObject push_tpool_background_msg(final SubLObject msg, final SubLObject task_process_pool)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( msg ) : msg;
    if( NIL != task_process_pool && !assertionsDisabledSynth && NIL == task_process_pool_p( task_process_pool ) )
    {
      throw new AssertionError( task_process_pool );
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $tpool_background_msg_lock$.getGlobalValue() );
      if( NIL != $tpool_background_msg_path$.getGlobalValue() )
      {
        if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !$tpool_background_msg_path$.getGlobalValue().isString() )
        {
          Errors.error( $str159$_A_is_not_a_valid_file_specificat, $tpool_background_msg_path$.getGlobalValue() );
        }
        if( NIL == $tpool_background_msg_stream$.getGlobalValue() )
        {
          $tpool_background_msg_stream$.setGlobalValue( StreamsLow.open( $tpool_background_msg_path$.getGlobalValue(), new SubLObject[] { $kw160$DIRECTION, $kw161$OUTPUT, $kw162$IF_DOES_NOT_EXIST, $kw163$CREATE,
            $kw164$IF_EXISTS, $kw165$OVERWRITE
          } ) );
        }
        print_high.princ( $str166$_, $tpool_background_msg_stream$.getGlobalValue() );
        print_high.princ( Threads.process_name( Threads.current_process() ), $tpool_background_msg_stream$.getGlobalValue() );
        print_high.princ( $str167$_, $tpool_background_msg_stream$.getGlobalValue() );
        streams_high.terpri( $tpool_background_msg_stream$.getGlobalValue() );
        print_high.princ( $str168$__, $tpool_background_msg_stream$.getGlobalValue() );
        print_high.princ( numeric_date_utilities.timestring( UNPROVIDED ), $tpool_background_msg_stream$.getGlobalValue() );
        print_high.princ( $str168$__, $tpool_background_msg_stream$.getGlobalValue() );
        print_high.princ( msg, $tpool_background_msg_stream$.getGlobalValue() );
        streams_high.terpri( $tpool_background_msg_stream$.getGlobalValue() );
      }
      else if( NIL != $queue_tpool_background_msgs_when_no_pathP$.getDynamicValue( thread ) && NIL != task_process_pool )
      {
        SubLObject background_msgs = NIL;
        background_msgs = tpool_background_msgs( task_process_pool );
        background_msgs = ConsesLow.cons( Sequences.cconcatenate( numeric_date_utilities.timestring( UNPROVIDED ), new SubLObject[] { $str169$_, msg
        } ), background_msgs );
        _csetf_tpool_background_msgs( task_process_pool, background_msgs );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $tpool_background_msg_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 24150L)
  public static SubLObject flush_tpool_background_msgs()
  {
    if( $tpool_background_msg_lock$.getGlobalValue().isLock() )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $tpool_background_msg_lock$.getGlobalValue() );
        if( NIL != $tpool_background_msg_path$.getGlobalValue() )
        {
          streams_high.force_output( $tpool_background_msg_stream$.getGlobalValue() );
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $tpool_background_msg_lock$.getGlobalValue() );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 24514L)
  public static SubLObject show_tp_msgs(final SubLObject task_process_pool)
  {
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    SubLObject cdolist_list_var = Sequences.nreverse( tpool_background_msgs( task_process_pool ) );
    SubLObject msg = NIL;
    msg = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      print_high.princ( msg, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      msg = cdolist_list_var.first();
    }
    _csetf_tpool_background_msgs( task_process_pool, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 24904L)
  public static SubLObject show_tp_msgs_with_process_name(final SubLObject process_name)
  {
    assert NIL != Types.stringp( process_name ) : process_name;
    show_tp_msgs( find_task_process_pool( process_name ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 25243L)
  public static SubLObject set_tpool_process_name_prefix(final SubLObject process_name_prefix, final SubLObject task_process_pool)
  {
    assert NIL != Types.stringp( process_name_prefix ) : process_name_prefix;
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    _csetf_tpool_process_name_prefix( task_process_pool, process_name_prefix );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 25671L)
  public static SubLObject get_tpool_process_name_prefix(final SubLObject task_process_pool)
  {
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    return tpool_process_name_prefix( task_process_pool );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 25984L)
  public static SubLObject set_tpool_min_nbr_of_task_processors(final SubLObject min_nbr_of_task_processors, final SubLObject task_process_pool)
  {
    assert NIL != Types.integerp( min_nbr_of_task_processors ) : min_nbr_of_task_processors;
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    _csetf_tpool_min_nbr_of_task_processors( task_process_pool, min_nbr_of_task_processors );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 26450L)
  public static SubLObject get_tpool_min_nbr_of_task_processors(final SubLObject task_process_pool)
  {
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    return tpool_min_nbr_of_task_processors( task_process_pool );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 26777L)
  public static SubLObject set_tpool_max_nbr_of_task_processors(final SubLObject max_nbr_of_task_processors, final SubLObject task_process_pool)
  {
    assert NIL != Types.integerp( max_nbr_of_task_processors ) : max_nbr_of_task_processors;
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    _csetf_tpool_max_nbr_of_task_processors( task_process_pool, max_nbr_of_task_processors );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 27243L)
  public static SubLObject get_tpool_max_nbr_of_task_processors(final SubLObject task_process_pool)
  {
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    return tpool_max_nbr_of_task_processors( task_process_pool );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 27570L)
  public static SubLObject get_nbr_of_task_processors(final SubLObject task_process_pool)
  {
    return Sequences.length( tpool_processors( task_process_pool ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 27814L)
  public static SubLObject start_task_processor_logging_to_file(final SubLObject filename, SubLObject level)
  {
    if( level == UNPROVIDED )
    {
      level = NIL;
    }
    assert NIL != Types.stringp( filename ) : filename;
    if( NIL != level && !assertionsDisabledSynth && NIL == subl_promotions.non_negative_integer_p( level ) )
    {
      throw new AssertionError( level );
    }
    end_task_processor_logging_to_file();
    if( NIL != level )
    {
      set_task_processor_verbosity( level );
    }
    set_tpool_background_msg_path( filename );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 28361L)
  public static SubLObject end_task_processor_logging_to_file()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject old_file = $tpool_background_msg_path$.getGlobalValue();
    final SubLObject old_stream = $tpool_background_msg_stream$.getGlobalValue();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw174$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym175$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          if( NIL != old_stream )
          {
            try
            {
              flush_tpool_background_msgs();
            }
            finally
            {
              final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values = Values.getValuesAsVector();
                $tpool_background_msg_stream$.setGlobalValue( NIL );
                streams_high.close( old_stream, UNPROVIDED );
                Values.restoreValuesFromVector( _values );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
              }
            }
          }
          $tpool_background_msg_path$.setGlobalValue( NIL );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw174$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( old_file.isString() && NIL != Filesys.probe_file( old_file ) )
    {
      return file_utilities.get_file_length( old_file );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 29047L)
  public static SubLObject save_unlogged_task_processor_messages_to_file(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( filename ) : filename;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw161$OUTPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str177$Unable_to_open__S, filename );
      }
      final SubLObject out = stream;
      final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding( thread );
      try
      {
        StreamsLow.$standard_output$.bind( out, thread );
        show_tp_msgs( $api_task_process_pool$.getGlobalValue() );
      }
      finally
      {
        StreamsLow.$standard_output$.rebind( _prev_bind_2, thread );
      }
    }
    finally
    {
      final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_3, thread );
      }
    }
    return file_utilities.get_file_length( filename );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 29709L)
  public static SubLObject eval_with_bindings(final SubLObject v_bindings, final SubLObject form, final SubLObject eval_fn)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject form_to_eval = NIL;
    final SubLObject _prev_bind_0 = $eval_with_bindings$.currentBinding( thread );
    try
    {
      $eval_with_bindings$.bind( NIL, thread );
      form_to_eval = ConsesLow.list( $sym178$CLET, ConsesLow.append( v_bindings, NIL ), ConsesLow.list( $sym179$CSETQ, $sym180$_EVAL_WITH_BINDINGS_, form ) );
      try
      {
        process_utilities.current_process_note_form( form_to_eval );
        if( Symbols.symbol_function( $sym181$CYC_API_EVAL ).eql( eval_fn ) )
        {
          eval_in_api.cyc_api_eval( form_to_eval );
        }
        else if( Symbols.symbol_function( $sym182$EVAL ).eql( eval_fn ) )
        {
          Eval.eval( form_to_eval );
        }
        else
        {
          Functions.funcall( eval_fn, form_to_eval );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          process_utilities.current_process_clear_form();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$2, thread );
        }
      }
      result = $eval_with_bindings$.getDynamicValue( thread );
    }
    finally
    {
      $eval_with_bindings$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 31019L)
  public static SubLObject get_task_process_pool_for_process(final SubLObject process)
  {
    assert NIL != Types.processp( process ) : process;
    return dictionary_utilities.synchronized_dictionary_lookup( $process_to_task_process_pool$.getGlobalValue(), process, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 31338L)
  public static SubLObject add_task_process_pool_for_process(final SubLObject process, final SubLObject task_process_pool)
  {
    assert NIL != Types.processp( process ) : process;
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    return dictionary_utilities.synchronized_dictionary_enter( $process_to_task_process_pool$.getGlobalValue(), process, task_process_pool );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 31746L)
  public static SubLObject remove_task_process_pool_for_process(final SubLObject process)
  {
    assert NIL != Types.processp( process ) : process;
    return dictionary_utilities.synchronized_dictionary_remove( $process_to_task_process_pool$.getGlobalValue(), process );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 32500L)
  public static SubLObject ensure_task_process_being_worked_on_initialized()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $task_processes_being_worked_on_lock$.getGlobalValue() );
      if( NIL == cache.cache_p( $task_processes_being_worked_on$.getGlobalValue() ) )
      {
        $task_processes_being_worked_on$.setGlobalValue( cache.new_cache( $task_processes_worked_on_history$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ) ) );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $task_processes_being_worked_on_lock$.getGlobalValue() );
      }
    }
    return $task_processes_being_worked_on$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 32916L)
  public static SubLObject compute_task_process_description_from_task_info(final SubLObject task_info)
  {
    return compute_task_process_description( get_task_info_id( task_info ), get_task_info_giveback_info( task_info ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 33125L)
  public static SubLObject compute_task_process_description(final SubLObject task_id, final SubLObject giveback_info)
  {
    return ConsesLow.cons( task_id, giveback_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 33236L)
  public static SubLObject get_giveback_info_from_task_process_description(final SubLObject task_process_description)
  {
    return task_process_description.rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 33367L)
  public static SubLObject note_active_task_process_description_if_permitted(final SubLObject task_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject signature = compute_task_process_description_from_task_info( task_info );
    final SubLObject process = Threads.current_process();
    SubLObject retval = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $task_processes_being_worked_on_lock$.getGlobalValue() );
      ensure_task_process_being_worked_on_initialized();
      thread.resetMultipleValues();
      final SubLObject reason_to_stop_nowP = cache.cache_get( $task_processes_being_worked_on$.getGlobalValue(), signature );
      final SubLObject foundP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL == foundP )
      {
        cache.cache_set( $task_processes_being_worked_on$.getGlobalValue(), signature, process );
      }
      else
      {
        retval = reason_to_stop_nowP;
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $task_processes_being_worked_on_lock$.getGlobalValue() );
      }
    }
    return retval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 34249L)
  public static SubLObject note_inactive_task_process_description(final SubLObject task_info)
  {
    final SubLObject signature = compute_task_process_description_from_task_info( task_info );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $task_processes_being_worked_on_lock$.getGlobalValue() );
      if( NIL != cache.cache_p( $task_processes_being_worked_on$.getGlobalValue() ) )
      {
        cache.cache_remove( $task_processes_being_worked_on$.getGlobalValue(), signature );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $task_processes_being_worked_on_lock$.getGlobalValue() );
      }
    }
    return task_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 34795L)
  public static SubLObject task_process_termination_reason_p(final SubLObject reason)
  {
    return makeBoolean( reason.isKeyword() && ( reason == $kw185$ABORT || reason == $kw186$CANCEL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 34947L)
  public static SubLObject terminate_active_task_process(final SubLObject task_id, final SubLObject task_giveback_info, final SubLObject reason)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != task_process_termination_reason_p( reason ) : reason;
    final SubLObject signature = compute_task_process_description( task_id, task_giveback_info );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $task_processes_being_worked_on_lock$.getGlobalValue() );
      ensure_task_process_being_worked_on_initialized();
      thread.resetMultipleValues();
      final SubLObject process_handling_task = cache.cache_get( $task_processes_being_worked_on$.getGlobalValue(), signature );
      final SubLObject foundP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != foundP )
      {
        signal_terminate_active_task_process( process_handling_task, reason, task_id, task_giveback_info );
      }
      else
      {
        cache.cache_set( $task_processes_being_worked_on$.getGlobalValue(), signature, reason );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $task_processes_being_worked_on_lock$.getGlobalValue() );
      }
    }
    return reason;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 36008L)
  public static SubLObject terminate_active_task_processes(final SubLObject task_giveback_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $task_processes_being_worked_on_lock$.getGlobalValue() );
      if( NIL != cache.cache_p( $task_processes_being_worked_on$.getGlobalValue() ) )
      {
        final SubLObject cache_var = $task_processes_being_worked_on$.getGlobalValue();
        final SubLObject order_var = $kw188$NEWEST;
        SubLObject entry = cache.do_cache_first( cache_var, order_var );
        SubLObject task_process_description = NIL;
        SubLObject process_handling_task = NIL;
        while ( NIL == cache.do_cache_doneP( cache_var, entry ))
        {
          task_process_description = cache.do_cache_key( entry );
          process_handling_task = cache.do_cache_value( entry );
          entry = cache.do_cache_next( entry, order_var );
          final SubLObject current_giveback_info = get_giveback_info_from_task_process_description( task_process_description );
          if( current_giveback_info.equal( task_giveback_info ) && NIL != Threads.valid_process_p( process_handling_task ) )
          {
            SubLObject ignore_errors_tag = NIL;
            try
            {
              thread.throwStack.push( $kw174$IGNORE_ERRORS_TARGET );
              final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
              try
              {
                Errors.$error_handler$.bind( Symbols.symbol_function( $sym175$IGNORE_ERRORS_HANDLER ), thread );
                try
                {
                  signal_terminate_active_task_process( process_handling_task, $kw185$ABORT, MINUS_ONE_INTEGER, task_giveback_info );
                }
                catch( final Throwable catch_var )
                {
                  Errors.handleThrowable( catch_var, NIL );
                }
              }
              finally
              {
                Errors.$error_handler$.rebind( _prev_bind_0, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw174$IGNORE_ERRORS_TARGET );
            }
            finally
            {
              thread.throwStack.pop();
            }
          }
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $task_processes_being_worked_on_lock$.getGlobalValue() );
      }
    }
    return task_giveback_info;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 37121L)
  public static SubLObject signal_terminate_active_task_process(final SubLObject process, final SubLObject reason, final SubLObject task_id, final SubLObject task_giveback_info)
  {
    if( reason.eql( $kw185$ABORT ) )
    {
      subl_promotions.interrupt_process_with_args( process, Symbols.symbol_function( $sym189$SIGNAL_ABORT_ACTIVE_TASK_PROCESS ), ConsesLow.list( task_id, task_giveback_info ) );
    }
    else if( reason.eql( $kw186$CANCEL ) )
    {
      subl_promotions.interrupt_process_with_args( process, Symbols.symbol_function( $sym190$SIGNAL_CANCEL_ACTIVE_TASK_PROCESS ), ConsesLow.list( task_id, task_giveback_info ) );
    }
    else
    {
      Errors.error( $str191$API_error__Unknown_active_task_pr, reason );
    }
    return reason;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 37610L)
  public static SubLObject signal_abort_active_task_process(final SubLObject task_id, final SubLObject uuid)
  {
    final SubLObject task_info = get_current_task_processor_info();
    if( NIL == task_info )
    {
      return NIL;
    }
    if( !uuid.equal( ti_giveback_info( task_info ) ) )
    {
      return NIL;
    }
    if( task_id.numGE( ZERO_INTEGER ) && !task_id.eql( ti_id( task_info ) ) )
    {
      return NIL;
    }
    Dynamic.sublisp_throw( $kw192$TERMINATE_PREMATURELY, $kw185$ABORT );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 38060L)
  public static SubLObject signal_cancel_active_task_process(final SubLObject task_id, final SubLObject uuid)
  {
    final SubLObject task_info = get_current_task_processor_info();
    if( NIL == task_info )
    {
      return NIL;
    }
    if( !uuid.equal( ti_giveback_info( task_info ) ) )
    {
      return NIL;
    }
    if( task_id.numGE( ZERO_INTEGER ) && !task_id.eql( ti_id( task_info ) ) )
    {
      return NIL;
    }
    Dynamic.sublisp_throw( $kw192$TERMINATE_PREMATURELY, $kw186$CANCEL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 38512L)
  public static SubLObject catch_task_processor_termination(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject ans_var = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list193 );
    ans_var = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym194$CCATCH, $kw192$TERMINATE_PREMATURELY, ans_var, reader.bq_cons( $sym195$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 38824L)
  public static SubLObject catch_task_processor_termination_quietly(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject ans_var = $sym198$ANS_VAR;
    return ConsesLow.list( $sym196$CATCH_TASK_PROCESSOR_TERMINATION, ans_var, reader.bq_cons( $sym195$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 39801L)
  public static SubLObject get_current_task_processor_info()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $current_task_processor_info$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 40045L)
  public static SubLObject get_current_task_processor_client()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $current_task_processor_info$.getDynamicValue( thread ) )
    {
      return get_task_info_giveback_info( $current_task_processor_info$.getDynamicValue( thread ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 40290L)
  public static SubLObject map_task_info_priority_to_process_priority(final SubLObject priority)
  {
    return Numbers.max( Threads.$process_min_priority$.getGlobalValue(), Numbers.min( priority, Threads.$process_max_priority$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 40565L)
  public static SubLObject task_processor_handler()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    for( SubLObject task_process_pool = get_task_process_pool_for_process( Threads.current_process() ); NIL == task_process_pool; task_process_pool = get_task_process_pool_for_process( Threads.current_process() ) )
    {
      Threads.sleep( $float202$0_001 );
    }
    SubLObject catch_var = NIL;
    try
    {
      thread.throwStack.push( $kw203$TASK_PROCESSOR_QUIT );
      final SubLObject task_process_pool2 = get_task_process_pool_for_process( Threads.current_process() );
      final SubLObject v_task_processor = find_task_processor( Threads.process_name( Threads.current_process() ), task_process_pool2 );
      SubLObject eval_fn = NIL;
      SubLObject task_info = NIL;
      SubLObject request = NIL;
      SubLObject response = NIL;
      final SubLObject junk = NIL;
      SubLObject error_message = NIL;
      SubLObject dont_care_abort_reason = NIL;
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == task_processor_p( v_task_processor ) )
      {
        Errors.error( $str204$Invalid_task_processor );
      }
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == task_process_pool_p( task_process_pool2 ) )
      {
        Errors.error( $str205$Invalid_task_process_pool );
      }
      while ( true)
      {
        task_info = NIL;
        response = NIL;
        error_message = NIL;
        try
        {
          thread.throwStack.push( $kw192$TERMINATE_PREMATURELY );
          _csetf_tproc_busy_p( v_task_processor, NIL );
          Semaphores.semaphore_wait( tpool_request_semaphore( task_process_pool2 ) );
          final SubLObject lock = get_tpool_lock( task_process_pool2 );
          SubLObject release = NIL;
          try
          {
            release = Locks.seize_lock( lock );
            task_info = queues.p_dequeue( tpool_request_queue( task_process_pool2 ), UNPROVIDED );
          }
          finally
          {
            if( NIL != release )
            {
              Locks.release_lock( lock );
            }
          }
          if( $task_processor_verbosity$.getDynamicValue( thread ).numG( TWO_INTEGER ) )
          {
            push_tpool_background_msg( PrintLow.format( NIL, $str206$Task_Info__S__, task_info ), task_process_pool2 );
          }
          request = ti_request( task_info );
          _csetf_ti_task_processor_name( task_info, tproc_name( v_task_processor ) );
          _csetf_tproc_task_info( v_task_processor, task_info );
          eval_fn = dictionary.dictionary_lookup( $task_processor_eval_fn_dict$.getGlobalValue(), ti_type( task_info ), UNPROVIDED );
          try
          {
            final SubLObject _prev_bind_0 = $current_task_processor_info$.currentBinding( thread );
            try
            {
              $current_task_processor_info$.bind( task_info, thread );
              SubLObject abort_reason = note_active_task_process_description_if_permitted( task_info );
              final SubLObject priority = get_task_info_priority( task_info );
              Threads.set_process_priority( Threads.current_process(), map_task_info_priority_to_process_priority( priority ) );
              if( NIL == abort_reason )
              {
                try
                {
                  thread.throwStack.push( $kw192$TERMINATE_PREMATURELY );
                  try
                  {
                    thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                    final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding( thread );
                    try
                    {
                      Errors.$error_handler$.bind( $sym207$CATCH_ERROR_MESSAGE_HANDLER, thread );
                      try
                      {
                        response = eval_with_bindings( ti_bindings( task_info ), request, eval_fn );
                      }
                      catch( final Throwable catch_var_$4 )
                      {
                        Errors.handleThrowable( catch_var_$4, NIL );
                      }
                    }
                    finally
                    {
                      Errors.$error_handler$.rebind( _prev_bind_0_$3, thread );
                    }
                  }
                  catch( final Throwable ccatch_env_var )
                  {
                    error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
                  }
                  finally
                  {
                    thread.throwStack.pop();
                  }
                }
                catch( final Throwable ccatch_env_var )
                {
                  abort_reason = Errors.handleThrowable( ccatch_env_var, $kw192$TERMINATE_PREMATURELY );
                }
                finally
                {
                  thread.throwStack.pop();
                }
                if( NIL != abort_reason )
                {
                  error_message = abort_reason;
                }
                if( $task_processor_verbosity$.getDynamicValue( thread ).numG( TWO_INTEGER ) )
                {
                  push_tpool_background_msg( PrintLow.format( NIL, $str208$Response__S__, response ), task_process_pool2 );
                  if( error_message.isString() )
                  {
                    push_tpool_background_msg( PrintLow.format( NIL, $str209$Error_message__S__, error_message ), task_process_pool2 );
                  }
                }
                _csetf_ti_response( task_info, response );
                if( abort_reason != $kw185$ABORT )
                {
                  _csetf_ti_error_message( task_info, error_message );
                }
                try
                {
                  thread.throwStack.push( $kw192$TERMINATE_PREMATURELY );
                  dispatch_task_processor_response( task_info, T );
                }
                catch( final Throwable ccatch_env_var )
                {
                  abort_reason = Errors.handleThrowable( ccatch_env_var, $kw192$TERMINATE_PREMATURELY );
                }
                finally
                {
                  thread.throwStack.pop();
                }
              }
            }
            finally
            {
              $current_task_processor_info$.rebind( _prev_bind_0, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              note_inactive_task_process_description( task_info );
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
            }
          }
        }
        catch( final Throwable ccatch_env_var2 )
        {
          dont_care_abort_reason = Errors.handleThrowable( ccatch_env_var2, $kw192$TERMINATE_PREMATURELY );
        }
        finally
        {
          thread.throwStack.pop();
        }
      }
    }
    catch( final Throwable ccatch_env_var3 )
    {
      catch_var = Errors.handleThrowable( ccatch_env_var3, $kw203$TASK_PROCESSOR_QUIT );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 44099L)
  public static SubLObject post_task_info_processor_partial_results(final SubLObject results)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.listp( results ) : results;
    final SubLObject task_process_pool = get_task_process_pool_for_process( Threads.current_process() );
    if( $task_processor_verbosity$.getDynamicValue( thread ).numG( TWO_INTEGER ) )
    {
      push_tpool_background_msg( PrintLow.format( NIL, $str210$Posting_partial_results__A_at__A, results, numeric_date_utilities.timestring( Time.get_universal_time() ) ), task_process_pool );
    }
    return post_task_info_processor_partial_results_internal( task_process_pool, results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 44666L)
  public static SubLObject post_task_info_processor_partial_results_internal(final SubLObject task_process_pool, final SubLObject results)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == task_process_pool_p( task_process_pool ) )
    {
      Errors.error( $str211$Function_only_valid_from_within_a, Threads.current_process() );
    }
    final SubLObject task_info = get_current_task_processor_info();
    final SubLObject _prev_bind_0 = $minimize_task_processor_info_communication$.currentBinding( thread );
    try
    {
      $minimize_task_processor_info_communication$.bind( NIL, thread );
      _csetf_ti_response( task_info, results );
      dispatch_task_processor_response( task_info, NIL );
    }
    finally
    {
      $minimize_task_processor_info_communication$.rebind( _prev_bind_0, thread );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 45534L)
  public static SubLObject initialize_task_processors(SubLObject process_name_prefix, SubLObject min_nbr_of_task_processors, SubLObject max_nbr_of_task_processors)
  {
    if( process_name_prefix == UNPROVIDED )
    {
      process_name_prefix = $str213$Task_processor_;
    }
    if( min_nbr_of_task_processors == UNPROVIDED )
    {
      min_nbr_of_task_processors = $min_nbr_of_task_processors$.getGlobalValue();
    }
    if( max_nbr_of_task_processors == UNPROVIDED )
    {
      max_nbr_of_task_processors = $max_nbr_of_task_processors$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.integerp( min_nbr_of_task_processors ) : min_nbr_of_task_processors;
    assert NIL != Types.integerp( max_nbr_of_task_processors ) : max_nbr_of_task_processors;
    assert NIL != Types.stringp( process_name_prefix ) : process_name_prefix;
    $task_processor_standard_output$.setDynamicValue( StreamsLow.$standard_output$.getDynamicValue( thread ), thread );
    SubLObject task_process_pool = NIL;
    task_process_pool = make_task_process_pool( UNPROVIDED );
    set_tpool_process_name_prefix( process_name_prefix, task_process_pool );
    set_tpool_min_nbr_of_task_processors( min_nbr_of_task_processors, task_process_pool );
    set_tpool_max_nbr_of_task_processors( max_nbr_of_task_processors, task_process_pool );
    if( $task_processor_verbosity$.getDynamicValue( thread ).numG( TWO_INTEGER ) )
    {
      push_tpool_background_msg( PrintLow.format( NIL, $str214$Initializing_task_processors__ ), task_process_pool );
    }
    set_tpool_lock( Locks.make_lock( PrintLow.format( NIL, $str215$_alock, process_name_prefix ) ), task_process_pool );
    _csetf_tpool_request_semaphore( task_process_pool, Semaphores.new_semaphore( $str216$task_pool_request_semaphore, ZERO_INTEGER ) );
    set_tpool_request_queue( queues.create_p_queue( $task_request_queue_max_size$.getGlobalValue(), $sym16$TI_PRIORITY, UNPROVIDED ), task_process_pool );
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( min_nbr_of_task_processors ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      add_new_task_processor_to_pool( task_process_pool );
    }
    return task_process_pool;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 47161L)
  public static SubLObject add_new_task_processor_to_pool(final SubLObject task_process_pool)
  {
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    final SubLObject v_task_processor = make_task_processor( UNPROVIDED );
    final SubLObject process_name_prefix = get_tpool_process_name_prefix( task_process_pool );
    final SubLObject nbr_of_task_processors = get_nbr_of_task_processors( task_process_pool );
    _csetf_tproc_name( v_task_processor, PrintLow.format( NIL, $str217$_a_s, process_name_prefix, Numbers.add( nbr_of_task_processors, ONE_INTEGER ) ) );
    _csetf_tproc_process( v_task_processor, Threads.make_process( tproc_name( v_task_processor ), Symbols.symbol_function( $sym218$TASK_PROCESSOR_HANDLER ) ) );
    push_tpool_processor( v_task_processor, task_process_pool );
    add_task_process_pool_for_process( tproc_process( v_task_processor ), task_process_pool );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 47995L)
  public static SubLObject halt_task_processors(final SubLObject task_process_pool)
  {
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    SubLObject cdolist_list_var = tpool_processors( task_process_pool );
    SubLObject v_task_processor = NIL;
    v_task_processor = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      halt_task_processor( v_task_processor );
      remove_task_process_pool_for_process( tproc_process( v_task_processor ) );
      cdolist_list_var = cdolist_list_var.rest();
      v_task_processor = cdolist_list_var.first();
    }
    _csetf_tpool_processors( task_process_pool, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 48468L)
  public static SubLObject halt_task_processor(final SubLObject v_task_processor)
  {
    assert NIL != task_processor_p( v_task_processor ) : v_task_processor;
    SubLObject process = tproc_process( v_task_processor );
    if( NIL != Threads.valid_process_p( process ) )
    {
      halt_task_processor_via_interrupt( process );
    }
    remove_task_process_pool_for_process( process );
    process = NIL;
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 48885L)
  public static SubLObject halt_task_processor_via_interrupt(final SubLObject process)
  {
    return Threads.interrupt_process( process, Symbols.symbol_function( $sym219$TASK_PROCESSOR_QUIT ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 49093L)
  public static SubLObject ensure_task_processors_killed(final SubLObject type)
  {
    assert NIL != Types.stringp( type ) : type;
    final SubLObject prefix = Sequences.cconcatenate( type, $str221$_processor_ );
    SubLObject cdolist_list_var = Threads.all_processes();
    SubLObject process = NIL;
    process = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject process_name = Threads.process_name( process );
      if( NIL != string_utilities.starts_with( process_name, prefix ) )
      {
        PrintLow.format( T, $str222$_Killing__A___, process_name );
        Threads.kill_process( process );
      }
      cdolist_list_var = cdolist_list_var.rest();
      process = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 49584L)
  public static SubLObject task_processor_quit()
  {
    Dynamic.sublisp_throw( $kw203$TASK_PROCESSOR_QUIT, NIL );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 49763L)
  public static SubLObject find_task_processor(final SubLObject process_name, final SubLObject task_process_pool)
  {
    assert NIL != Types.stringp( process_name ) : process_name;
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    SubLObject cdolist_list_var = tpool_processors( task_process_pool );
    SubLObject v_task_processor = NIL;
    v_task_processor = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != Strings.stringE( process_name, tproc_name( v_task_processor ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return v_task_processor;
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_task_processor = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 50304L)
  public static SubLObject find_task_process_pool(final SubLObject process_name)
  {
    assert NIL != Types.stringp( process_name ) : process_name;
    SubLObject cdolist_list_var = Threads.all_processes();
    SubLObject process = NIL;
    process = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject running_process_name = Threads.process_name( process );
      if( NIL != Strings.stringE( process_name, running_process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return get_task_process_pool_for_process( process );
      }
      cdolist_list_var = cdolist_list_var.rest();
      process = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 50789L)
  public static SubLObject awaken_first_available_task_processors(final SubLObject task_process_pool)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( get_nbr_of_task_processors( task_process_pool ).numL( get_tpool_max_nbr_of_task_processors( task_process_pool ) ) )
    {
      if( $task_processor_verbosity$.getDynamicValue( thread ).numG( TWO_INTEGER ) )
      {
        push_tpool_background_msg( PrintLow.format( NIL, $str223$Allocating_a_new_task_processor__ ), task_process_pool );
      }
      add_new_task_processor_to_pool( task_process_pool );
    }
    push_tpool_background_msg( PrintLow.format( NIL, $str224$Awakening_first_available_task_pr ), task_process_pool );
    Semaphores.semaphore_signal( tpool_request_semaphore( task_process_pool ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 51632L)
  public static SubLObject enqueue_task_request(final SubLObject task_info, final SubLObject task_process_pool)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != task_info_p( task_info ) : task_info;
    assert NIL != task_process_pool_p( task_process_pool ) : task_process_pool;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == tpool_processors( task_process_pool ) )
    {
      Errors.error( $str225$Task_processors_are_not_initializ );
    }
    final SubLObject lock = tpool_lock( task_process_pool );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      thread.resetMultipleValues();
      final SubLObject request_queue = queues.p_enqueue( task_info, tpool_request_queue( task_process_pool ) );
      final SubLObject bumped_requestP = thread.secondMultipleValue();
      final SubLObject bumped_request_item = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      if( NIL != bumped_requestP )
      {
        Errors.cerror( $str226$__Error__cannot_queue_task_reques, bumped_request_item );
      }
      awaken_first_available_task_processors( task_process_pool );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 52610L)
  public static SubLObject with_long_running_task_process(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym178$CLET, $list228, ConsesLow.listS( $sym229$CUNWIND_PROTECT, ConsesLow.listS( $sym195$PROGN, $list230, ConsesLow.append( body, NIL ) ), $list231 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 53862L)
  public static SubLObject declare_task_process_pool(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject type = NIL;
    SubLObject min_nbr_of_task_processors = NIL;
    SubLObject max_nbr_of_task_processors = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list232 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list232 );
    min_nbr_of_task_processors = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list232 );
    max_nbr_of_task_processors = current.first();
    current = current.rest();
    if( NIL != current )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list232 );
      return NIL;
    }
    assert NIL != Types.stringp( type ) : type;
    assert NIL != Types.integerp( min_nbr_of_task_processors ) : min_nbr_of_task_processors;
    assert NIL != Types.integerp( max_nbr_of_task_processors ) : max_nbr_of_task_processors;
    final SubLObject task_process_pool = Packages.intern( Sequences.cconcatenate( $str233$_, new SubLObject[] { type, $str234$_TASK_PROCESS_POOL_
    } ), UNPROVIDED );
    final SubLObject task_process_pool_lock = Packages.intern( Sequences.cconcatenate( $str233$_, new SubLObject[] { type, $str235$_TASK_PROCESS_POOL_LOCK_
    } ), UNPROVIDED );
    return ConsesLow.list( $sym195$PROGN, ConsesLow.listS( $sym236$DEFLEXICAL_PUBLIC, task_process_pool, $list237 ), ConsesLow.listS( $sym238$DEFCONSTANT_PUBLIC, task_process_pool_lock, $list239 ), ConsesLow.list(
        $sym240$DEFINE_PUBLIC, Packages.intern( Sequences.cconcatenate( type, $str241$_TASK_PROCESSORS_INITIALIZED_P ), UNPROVIDED ), NIL, $str242$Return_T_when_there_are_task_proc, ConsesLow.list( $sym243$RET, ConsesLow
            .list( $sym244$TASK_PROCESSORS_INITIALIZED_P, task_process_pool ) ) ), ConsesLow.listS( $sym240$DEFINE_PUBLIC, Packages.intern( Sequences.cconcatenate( $str245$INITIALIZE_, new SubLObject[]
            { type, $str246$_TASK_PROCESSORS
    } ), UNPROVIDED ), NIL, $str247$Initialize_the_task_processor_poo, ConsesLow.list( $sym248$WITH_LOCK_HELD, ConsesLow.list( task_process_pool_lock ), ConsesLow.listS( $sym249$PWHEN, task_process_pool, $list250 ),
        ConsesLow.list( $sym179$CSETQ, task_process_pool, ConsesLow.list( $sym251$INITIALIZE_TASK_PROCESSORS, ConsesLow.listS( $sym252$CCONCATENATE, type, $list253 ), min_nbr_of_task_processors,
            max_nbr_of_task_processors ) ) ), $list254 ), ConsesLow.listS( $sym240$DEFINE_PUBLIC, Packages.intern( Sequences.cconcatenate( $str255$HALT_, new SubLObject[]
            { type, $str246$_TASK_PROCESSORS
    } ), UNPROVIDED ), NIL, $str256$Halt_the_task_processors_, ConsesLow.list( $sym248$WITH_LOCK_HELD, ConsesLow.list( task_process_pool_lock ), ConsesLow.list( $sym249$PWHEN, task_process_pool, ConsesLow.list(
        $sym257$HALT_TASK_PROCESSORS, task_process_pool ), $list258, ConsesLow.listS( $sym179$CSETQ, task_process_pool, $list259 ), ConsesLow.list( $sym220$ENSURE_TASK_PROCESSORS_KILLED, type ) ) ), $list254 ), ConsesLow
            .listS( $sym240$DEFINE_PUBLIC, Packages.intern( Sequences.cconcatenate( $str260$RESTART_, new SubLObject[]
            { type, $str246$_TASK_PROCESSORS
    } ), UNPROVIDED ), NIL, $str261$Restart__halt___initialize__the_t, ConsesLow.list( $sym248$WITH_LOCK_HELD, ConsesLow.list( task_process_pool_lock ), ConsesLow.list( $sym249$PWHEN, task_process_pool, ConsesLow.list(
        $sym257$HALT_TASK_PROCESSORS, task_process_pool ), ConsesLow.listS( $sym179$CSETQ, task_process_pool, $list259 ), ConsesLow.list( $sym220$ENSURE_TASK_PROCESSORS_KILLED, type ) ), ConsesLow.list( $sym179$CSETQ,
            task_process_pool, ConsesLow.list( $sym251$INITIALIZE_TASK_PROCESSORS, ConsesLow.listS( $sym252$CCONCATENATE, type, $list253 ), min_nbr_of_task_processors, max_nbr_of_task_processors ) ) ), $list254 ),
        ConsesLow.listS( $sym240$DEFINE_PUBLIC, Packages.intern( Sequences.cconcatenate( $str262$SHOW_, new SubLObject[]
        { type, $str263$_TP_MSGS
        } ), UNPROVIDED ), NIL, $str264$Show_and_reset_the_task_processor, ConsesLow.list( $sym249$PWHEN, task_process_pool, ConsesLow.list( $sym265$SHOW_TP_MSGS, task_process_pool ) ), $list254 ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 57246L)
  public static SubLObject declare_task_process_request(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject type = NIL;
    SubLObject eval_fn = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list266 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list266 );
    eval_fn = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list266 );
    args = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym195$PROGN, ConsesLow.listS( $sym240$DEFINE_PUBLIC, Packages.intern( Sequences.cconcatenate( type, $str267$_TASK_PROCESSOR_REQUEST ), UNPROVIDED ), args, ConsesLow.append( body, NIL ) ),
        $list268, ConsesLow.list( $sym269$DICTIONARY_ENTER, $sym270$_TASK_PROCESSOR_EVAL_FN_DICT_, Symbols.make_keyword( type ), eval_fn ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 57848L)
  public static SubLObject declare_task_process_response_dispatch(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject type = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list271 );
    type = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list271 );
    args = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    final SubLObject response_dispatch_fn = Packages.intern( Sequences.cconcatenate( $str272$DISPATCH_, new SubLObject[] { type, $str273$_TASK_PROCESSOR_RESPONSE
    } ), UNPROVIDED );
    return ConsesLow.list( $sym195$PROGN, ConsesLow.listS( $sym240$DEFINE_PUBLIC, response_dispatch_fn, args, ConsesLow.append( body, NIL ) ), $list274, ConsesLow.list( $sym269$DICTIONARY_ENTER,
        $sym275$_TASK_PROCESSOR_RESPONSE_DISPATCH_FN_DICT_, Symbols.make_keyword( type ), ConsesLow.list( $sym276$FUNCTION, response_dispatch_fn ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 58548L)
  public static SubLObject api_task_processors_initialized_p()
  {
    return task_processors_initialized_p( $api_task_process_pool$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 58548L)
  public static SubLObject initialize_api_task_processors()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $api_task_process_pool_lock$.getGlobalValue() );
      if( NIL != $api_task_process_pool$.getGlobalValue() )
      {
        Errors.error( $str278$Illegal_attempt_to_reinitialize_p );
      }
      $api_task_process_pool$.setGlobalValue( initialize_task_processors( Sequences.cconcatenate( $str279$API, $str221$_processor_ ), FIVE_INTEGER, $int212$25 ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $api_task_process_pool_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 58548L)
  public static SubLObject halt_api_task_processors()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $api_task_process_pool_lock$.getGlobalValue() );
      if( NIL != $api_task_process_pool$.getGlobalValue() )
      {
        halt_task_processors( $api_task_process_pool$.getGlobalValue() );
        flush_tpool_background_msgs();
        $api_task_process_pool$.setGlobalValue( NIL );
        ensure_task_processors_killed( $str279$API );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $api_task_process_pool_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 58548L)
  public static SubLObject restart_api_task_processors()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $api_task_process_pool_lock$.getGlobalValue() );
      if( NIL != $api_task_process_pool$.getGlobalValue() )
      {
        halt_task_processors( $api_task_process_pool$.getGlobalValue() );
        $api_task_process_pool$.setGlobalValue( NIL );
        ensure_task_processors_killed( $str279$API );
      }
      $api_task_process_pool$.setGlobalValue( initialize_task_processors( Sequences.cconcatenate( $str279$API, $str221$_processor_ ), FIVE_INTEGER, $int212$25 ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $api_task_process_pool_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 58548L)
  public static SubLObject show_api_tp_msgs()
  {
    if( NIL != $api_task_process_pool$.getGlobalValue() )
    {
      show_tp_msgs( $api_task_process_pool$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 58919L)
  public static SubLObject show_api_task_processors()
  {
    display_api_task_processors();
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 59075L)
  public static SubLObject display_api_task_processors()
  {
    if( NIL != $api_task_process_pool$.getGlobalValue() )
    {
      display_task_processors( $api_task_process_pool$.getGlobalValue(), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 59848L)
  public static SubLObject api_task_processor_request(SubLObject request, final SubLObject id, final SubLObject priority, final SubLObject requestor, final SubLObject v_bindings, final SubLObject uuid_string)
  {
    final SubLObject immediate_executionP = Equality.eq( request.first(), $sym289$WITH_IMMEDIATE_EXECUTION );
    final SubLObject task_info = make_task_info( UNPROVIDED );
    if( NIL != immediate_executionP )
    {
      request = conses_high.second( request );
    }
    set_task_info_type( $kw290$API, task_info );
    set_task_info_id( id, task_info );
    set_task_info_priority( priority, task_info );
    set_task_info_requestor( requestor, task_info );
    set_task_info_giveback_info( uuid_string, task_info );
    set_task_info_bindings( v_bindings, task_info );
    set_task_info_request( request, task_info );
    enqueue_task_request( task_info, $api_task_process_pool$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 61421L)
  public static SubLObject set_java_api_lease_activity_display(final SubLObject indicator)
  {
    assert NIL != Types.booleanp( indicator ) : indicator;
    $java_api_lease_activity_display$.setGlobalValue( indicator );
    return $java_api_lease_activity_display$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 61736L)
  public static SubLObject java_api_lease_activity_display()
  {
    return $java_api_lease_activity_display$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 61920L)
  public static SubLObject dispatch_task_processor_response(final SubLObject task_info, SubLObject finished)
  {
    if( finished == UNPROVIDED )
    {
      finished = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $minimize_task_processor_info_communication$.getDynamicValue( thread ) )
    {
      set_task_info_request( NIL, task_info );
    }
    Functions.funcall( dictionary.dictionary_lookup( $task_processor_response_dispatch_fn_dict$.getGlobalValue(), ti_type( task_info ), UNPROVIDED ), task_info, finished );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 62368L)
  public static SubLObject dispatch_api_task_processor_response(final SubLObject task_info, SubLObject finished)
  {
    if( finished == UNPROVIDED )
    {
      finished = T;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $task_processor_verbosity$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
    {
      push_tpool_background_msg( PrintLow.format( NIL, $str292$Dispatching_api_response__S__, task_info ), $api_task_process_pool$.getGlobalValue() );
    }
    final SubLObject uuid_string = get_task_info_giveback_info( task_info );
    final SubLObject task_processor_response = ConsesLow.list( $sym293$TASK_PROCESSOR_RESPONSE, get_task_info_request( task_info ), get_task_info_id( task_info ), get_task_info_priority( task_info ),
        get_task_info_requestor( task_info ), get_task_info_response( task_info ), get_task_info_error_message( task_info ), finished );
    final SubLObject socket = java_api_kernel.java_api_socket_out_stream( uuid_string );
    final SubLObject lock = java_api_kernel.java_api_lock( uuid_string );
    final SubLObject _prev_bind_0 = cfasl_kb_methods.$within_complete_cfasl_objects$.currentBinding( thread );
    try
    {
      cfasl_kb_methods.$within_complete_cfasl_objects$.bind( T, thread );
      if( socket.isStream() && NIL != streams_high.open_stream_p( socket ) )
      {
        cfasl_kernel.cfasl_set_mode_externalized();
        if( get_task_processor_verbosity().numG( ZERO_INTEGER ) )
        {
          push_tpool_background_msg( PrintLow.format( NIL, $str294$Sending_api_response__S_to_socket, new SubLObject[] { get_task_info_response( task_info ), socket, uuid_string
          } ), $api_task_process_pool$.getGlobalValue() );
        }
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( lock );
          cfasl_kernel.send_cfasl_result( socket, task_processor_response, NIL );
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( lock );
          }
        }
      }
      else if( get_task_processor_verbosity().numG( ZERO_INTEGER ) )
      {
        push_tpool_background_msg( PrintLow.format( NIL, $str295$Dropping_api_response__S__socket_, new SubLObject[] { task_processor_response, socket, uuid_string
        } ), $api_task_process_pool$.getGlobalValue() );
      }
    }
    finally
    {
      cfasl_kb_methods.$within_complete_cfasl_objects$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 64517L)
  public static SubLObject new_intermediate_results_accumulator(final SubLObject wrapped)
  {
    return accumulation.new_accumulator( wrapped, $sym297$INTERMEDIATE_RESULTS_ACCUMULATOR_RESET, $sym298$INTERMEDIATE_RESULTS_ACCUMULATOR_ADD, $sym299$INTERMEDIATE_RESULTS_ACCUMULATOR_SIZE,
        $sym300$INTERMEDIATE_RESULTS_ACCUMULATOR_CONTENTS, $sym301$INTERMEDIATE_RESULTS_ACCUMULATOR_ITERATOR, $sym302$INTERMEDIATE_RESULTS_ACCUMULATOR_ADD_ALL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 65223L)
  public static SubLObject intermediate_results_accumulator_add(final SubLObject state, final SubLObject item)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == task_process_pool_p( get_task_process_pool_for_process( Threads.current_process() ) ) )
    {
      Errors.error( Errors.error( $str303$Cannot_invoke_intermediate_result ) );
    }
    accumulation.accumulation_add( state, item );
    post_task_info_processor_partial_results( ConsesLow.list( item ) );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 65789L)
  public static SubLObject intermediate_results_accumulator_add_all(final SubLObject state, final SubLObject items)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == task_process_pool_p( get_task_process_pool_for_process( Threads.current_process() ) ) )
    {
      Errors.error( Errors.error( $str303$Cannot_invoke_intermediate_result ) );
    }
    accumulation.accumulation_add_all( state, items );
    post_task_info_processor_partial_results( items );
    return state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 66349L)
  public static SubLObject intermediate_results_accumulator_reset(final SubLObject old_state)
  {
    accumulation.accumulation_reset( old_state );
    return old_state;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 66583L)
  public static SubLObject intermediate_results_accumulator_size(final SubLObject state)
  {
    return accumulation.accumulation_size( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 66791L)
  public static SubLObject intermediate_results_accumulator_contents(final SubLObject state, SubLObject resetP)
  {
    if( resetP == UNPROVIDED )
    {
      resetP = NIL;
    }
    return accumulation.accumulation_contents( state, resetP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 67035L)
  public static SubLObject intermediate_results_accumulator_iterator(final SubLObject state)
  {
    return accumulation.accumulation_iterator( state );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 67251L)
  public static SubLObject bg_task_processors_initialized_p()
  {
    return task_processors_initialized_p( $bg_task_process_pool$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 67251L)
  public static SubLObject initialize_bg_task_processors()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $bg_task_process_pool_lock$.getGlobalValue() );
      if( NIL != $bg_task_process_pool$.getGlobalValue() )
      {
        Errors.error( $str278$Illegal_attempt_to_reinitialize_p );
      }
      $bg_task_process_pool$.setGlobalValue( initialize_task_processors( Sequences.cconcatenate( $str304$BG, $str221$_processor_ ), TWO_INTEGER, TWO_INTEGER ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $bg_task_process_pool_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 67251L)
  public static SubLObject halt_bg_task_processors()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $bg_task_process_pool_lock$.getGlobalValue() );
      if( NIL != $bg_task_process_pool$.getGlobalValue() )
      {
        halt_task_processors( $bg_task_process_pool$.getGlobalValue() );
        flush_tpool_background_msgs();
        $bg_task_process_pool$.setGlobalValue( NIL );
        ensure_task_processors_killed( $str304$BG );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $bg_task_process_pool_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 67251L)
  public static SubLObject restart_bg_task_processors()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $bg_task_process_pool_lock$.getGlobalValue() );
      if( NIL != $bg_task_process_pool$.getGlobalValue() )
      {
        halt_task_processors( $bg_task_process_pool$.getGlobalValue() );
        $bg_task_process_pool$.setGlobalValue( NIL );
        ensure_task_processors_killed( $str304$BG );
      }
      $bg_task_process_pool$.setGlobalValue( initialize_task_processors( Sequences.cconcatenate( $str304$BG, $str221$_processor_ ), TWO_INTEGER, TWO_INTEGER ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $bg_task_process_pool_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 67251L)
  public static SubLObject show_bg_tp_msgs()
  {
    if( NIL != $bg_task_process_pool$.getGlobalValue() )
    {
      show_tp_msgs( $bg_task_process_pool$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 67878L)
  public static SubLObject bg_task_processor_request(final SubLObject request, final SubLObject id, final SubLObject priority, final SubLObject requestor, final SubLObject v_bindings, final SubLObject requestor_process)
  {
    final SubLObject task_info = make_task_info( UNPROVIDED );
    set_task_info_type( $kw305$BG, task_info );
    set_task_info_id( id, task_info );
    set_task_info_priority( priority, task_info );
    set_task_info_requestor( requestor, task_info );
    set_task_info_giveback_info( requestor_process, task_info );
    set_task_info_bindings( v_bindings, task_info );
    set_task_info_request( request, task_info );
    enqueue_task_request( task_info, $bg_task_process_pool$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 69485L)
  public static SubLObject dispatch_bg_task_processor_response(final SubLObject task_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $task_processor_verbosity$.getDynamicValue( thread ).numG( MINUS_ONE_INTEGER ) )
    {
      push_tpool_background_msg( PrintLow.format( NIL, $str306$dispatching_bg_response__S__, task_info ), $bg_task_process_pool$.getGlobalValue() );
    }
    final SubLObject requestor_process = get_task_info_giveback_info( task_info );
    if( $task_processor_verbosity$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
    {
      push_tpool_background_msg( PrintLow.format( NIL, $str307$bg_response_dictionary__S__, $bg_task_processor_response_dict$.getGlobalValue() ), $bg_task_process_pool$.getGlobalValue() );
    }
    if( NIL == $bg_task_processor_response_dict$.getGlobalValue() )
    {
      $bg_task_processor_response_dict$.setGlobalValue( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    }
    if( $task_processor_verbosity$.getDynamicValue( thread ).numG( ZERO_INTEGER ) )
    {
      push_tpool_background_msg( PrintLow.format( NIL, $str307$bg_response_dictionary__S__, $bg_task_processor_response_dict$.getGlobalValue() ), $bg_task_process_pool$.getGlobalValue() );
    }
    dictionary.dictionary_enter( $bg_task_processor_response_dict$.getGlobalValue(), requestor_process, task_info );
    Threads.process_unblock( requestor_process );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 70695L)
  public static SubLObject bg_api_eval(final SubLObject form)
  {
    $bg_task_processor_request_id$.setGlobalValue( Numbers.add( $bg_task_processor_request_id$.getGlobalValue(), ONE_INTEGER ) );
    bg_task_processor_request( form, $bg_task_processor_request_id$.getGlobalValue(), ONE_INTEGER, Threads.process_name( Threads.current_process() ), NIL, Threads.current_process() );
    Threads.process_block();
    final SubLObject task_info = dictionary.dictionary_lookup( $bg_task_processor_response_dict$.getGlobalValue(), Threads.current_process(), UNPROVIDED );
    return get_task_info_response( task_info );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 71388L)
  public static SubLObject console_task_processors_initialized_p()
  {
    return task_processors_initialized_p( $console_task_process_pool$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 71388L)
  public static SubLObject initialize_console_task_processors()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $console_task_process_pool_lock$.getGlobalValue() );
      if( NIL != $console_task_process_pool$.getGlobalValue() )
      {
        Errors.error( $str278$Illegal_attempt_to_reinitialize_p );
      }
      $console_task_process_pool$.setGlobalValue( initialize_task_processors( Sequences.cconcatenate( $str309$CONSOLE, $str221$_processor_ ), FIVE_INTEGER, $int212$25 ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $console_task_process_pool_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 71388L)
  public static SubLObject halt_console_task_processors()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $console_task_process_pool_lock$.getGlobalValue() );
      if( NIL != $console_task_process_pool$.getGlobalValue() )
      {
        halt_task_processors( $console_task_process_pool$.getGlobalValue() );
        flush_tpool_background_msgs();
        $console_task_process_pool$.setGlobalValue( NIL );
        ensure_task_processors_killed( $str309$CONSOLE );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $console_task_process_pool_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 71388L)
  public static SubLObject restart_console_task_processors()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $console_task_process_pool_lock$.getGlobalValue() );
      if( NIL != $console_task_process_pool$.getGlobalValue() )
      {
        halt_task_processors( $console_task_process_pool$.getGlobalValue() );
        $console_task_process_pool$.setGlobalValue( NIL );
        ensure_task_processors_killed( $str309$CONSOLE );
      }
      $console_task_process_pool$.setGlobalValue( initialize_task_processors( Sequences.cconcatenate( $str309$CONSOLE, $str221$_processor_ ), FIVE_INTEGER, $int212$25 ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $console_task_process_pool_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 71388L)
  public static SubLObject show_console_tp_msgs()
  {
    if( NIL != $console_task_process_pool$.getGlobalValue() )
    {
      show_tp_msgs( $console_task_process_pool$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 71924L)
  public static SubLObject console_task_processor_request(final SubLObject request, final SubLObject priority)
  {
    assert NIL != Types.integerp( priority ) : priority;
    final SubLObject task_info = make_task_info( UNPROVIDED );
    set_task_info_type( $kw311$CONSOLE, task_info );
    $task_processor_console_id$.setGlobalValue( Numbers.add( $task_processor_console_id$.getGlobalValue(), ONE_INTEGER ) );
    set_task_info_id( $task_processor_console_id$.getGlobalValue(), task_info );
    set_task_info_priority( priority, task_info );
    set_task_info_requestor( constants_high.constant_name( operation_communication.the_cyclist() ), task_info );
    set_task_info_request( request, task_info );
    enqueue_task_request( task_info, $console_task_process_pool$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/task-processor.lisp", position = 72823L)
  public static SubLObject dispatch_console_task_processor_response(final SubLObject task_info)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( $task_processor_verbosity$.getDynamicValue( thread ).numG( TWO_INTEGER ) )
    {
      push_tpool_background_msg( PrintLow.format( NIL, $str312$dispatching_console_response__S__, task_info ), $console_task_process_pool$.getGlobalValue() );
    }
    push_tpool_background_msg( PrintLow.format( NIL, $str313$_A___A__, ti_task_processor_name( task_info ), ti_response( task_info ) ), $console_task_process_pool$.getGlobalValue() );
    if( NIL != ti_error_message( task_info ) )
    {
      push_tpool_background_msg( PrintLow.format( NIL, $str149$_S__, ti_error_message( task_info ) ), $console_task_process_pool$.getGlobalValue() );
    }
    return NIL;
  }

  public static SubLObject declare_task_processor_file()
  {
    SubLFiles.declareFunction( me, "get_task_processor_verbosity", "GET-TASK-PROCESSOR-VERBOSITY", 0, 0, false );
    SubLFiles.declareFunction( me, "set_task_processor_verbosity", "SET-TASK-PROCESSOR-VERBOSITY", 1, 0, false );
    SubLFiles.declareFunction( me, "task_info_print_function_trampoline", "TASK-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "task_info_p", "TASK-INFO-P", 1, 0, false );
    new $task_info_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ti_type", "TI-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "ti_id", "TI-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "ti_priority", "TI-PRIORITY", 1, 0, false );
    SubLFiles.declareFunction( me, "ti_requestor", "TI-REQUESTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "ti_giveback_info", "TI-GIVEBACK-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "ti_bindings", "TI-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "ti_request", "TI-REQUEST", 1, 0, false );
    SubLFiles.declareFunction( me, "ti_response", "TI-RESPONSE", 1, 0, false );
    SubLFiles.declareFunction( me, "ti_error_message", "TI-ERROR-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "ti_task_processor_name", "TI-TASK-PROCESSOR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ti_type", "_CSETF-TI-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ti_id", "_CSETF-TI-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ti_priority", "_CSETF-TI-PRIORITY", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ti_requestor", "_CSETF-TI-REQUESTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ti_giveback_info", "_CSETF-TI-GIVEBACK-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ti_bindings", "_CSETF-TI-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ti_request", "_CSETF-TI-REQUEST", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ti_response", "_CSETF-TI-RESPONSE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ti_error_message", "_CSETF-TI-ERROR-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ti_task_processor_name", "_CSETF-TI-TASK-PROCESSOR-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "make_task_info", "MAKE-TASK-INFO", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_task_info", "VISIT-DEFSTRUCT-TASK-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_task_info_method", "VISIT-DEFSTRUCT-OBJECT-TASK-INFO-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "get_task_info_type", "GET-TASK-INFO-TYPE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_task_info_type", "SET-TASK-INFO-TYPE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_task_info_id", "GET-TASK-INFO-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "set_task_info_id", "SET-TASK-INFO-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "get_task_info_priority", "GET-TASK-INFO-PRIORITY", 1, 0, false );
    SubLFiles.declareFunction( me, "set_task_info_priority", "SET-TASK-INFO-PRIORITY", 2, 0, false );
    SubLFiles.declareFunction( me, "get_task_info_requestor", "GET-TASK-INFO-REQUESTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "set_task_info_requestor", "SET-TASK-INFO-REQUESTOR", 2, 0, false );
    SubLFiles.declareFunction( me, "get_task_info_giveback_info", "GET-TASK-INFO-GIVEBACK-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "set_task_info_giveback_info", "SET-TASK-INFO-GIVEBACK-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "get_task_info_bindings", "GET-TASK-INFO-BINDINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_task_info_bindings", "SET-TASK-INFO-BINDINGS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_task_info_request", "GET-TASK-INFO-REQUEST", 1, 0, false );
    SubLFiles.declareFunction( me, "set_task_info_request", "SET-TASK-INFO-REQUEST", 2, 0, false );
    SubLFiles.declareFunction( me, "get_task_info_response", "GET-TASK-INFO-RESPONSE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_task_info_response", "SET-TASK-INFO-RESPONSE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_task_info_error_message", "GET-TASK-INFO-ERROR-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_task_info_error_message", "SET-TASK-INFO-ERROR-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_task_info_task_processor_name", "GET-TASK-INFO-TASK-PROCESSOR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_task_info_task_processor_name", "SET-TASK-INFO-TASK-PROCESSOR-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "print_task_info", "PRINT-TASK-INFO", 3, 0, false );
    SubLFiles.declareFunction( me, "task_result_set_print_function_trampoline", "TASK-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "task_result_set_p", "TASK-RESULT-SET-P", 1, 0, false );
    new $task_result_set_p$UnaryFunction();
    SubLFiles.declareFunction( me, "task_result_set_result", "TASK-RESULT-SET-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "task_result_set_task_info", "TASK-RESULT-SET-TASK-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "task_result_set_finished", "TASK-RESULT-SET-FINISHED", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_task_result_set_result", "_CSETF-TASK-RESULT-SET-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_task_result_set_task_info", "_CSETF-TASK-RESULT-SET-TASK-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_task_result_set_finished", "_CSETF-TASK-RESULT-SET-FINISHED", 2, 0, false );
    SubLFiles.declareFunction( me, "make_task_result_set", "MAKE-TASK-RESULT-SET", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_task_result_set", "VISIT-DEFSTRUCT-TASK-RESULT-SET", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_task_result_set_method", "VISIT-DEFSTRUCT-OBJECT-TASK-RESULT-SET-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_task_result_set", "NEW-TASK-RESULT-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "task_result_set_priority", "TASK-RESULT-SET-PRIORITY", 1, 0, false );
    SubLFiles.declareFunction( me, "task_processor_print_function_trampoline", "TASK-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "task_processor_p", "TASK-PROCESSOR-P", 1, 0, false );
    new $task_processor_p$UnaryFunction();
    SubLFiles.declareFunction( me, "tproc_name", "TPROC-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "tproc_process", "TPROC-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "tproc_busy_p", "TPROC-BUSY-P", 1, 0, false );
    SubLFiles.declareFunction( me, "tproc_task_info", "TPROC-TASK-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tproc_name", "_CSETF-TPROC-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tproc_process", "_CSETF-TPROC-PROCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tproc_busy_p", "_CSETF-TPROC-BUSY-P", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tproc_task_info", "_CSETF-TPROC-TASK-INFO", 2, 0, false );
    SubLFiles.declareFunction( me, "make_task_processor", "MAKE-TASK-PROCESSOR", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_task_processor", "VISIT-DEFSTRUCT-TASK-PROCESSOR", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_task_processor_method", "VISIT-DEFSTRUCT-OBJECT-TASK-PROCESSOR-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_task_processor", "PRINT-TASK-PROCESSOR", 3, 0, false );
    SubLFiles.declareFunction( me, "task_process_pool_print_function_trampoline", "TASK-PROCESS-POOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "task_process_pool_p", "TASK-PROCESS-POOL-P", 1, 0, false );
    new $task_process_pool_p$UnaryFunction();
    SubLFiles.declareFunction( me, "tpool_lock", "TPOOL-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "tpool_request_queue", "TPOOL-REQUEST-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "tpool_request_semaphore", "TPOOL-REQUEST-SEMAPHORE", 1, 0, false );
    SubLFiles.declareFunction( me, "tpool_processors", "TPOOL-PROCESSORS", 1, 0, false );
    SubLFiles.declareFunction( me, "tpool_background_msgs", "TPOOL-BACKGROUND-MSGS", 1, 0, false );
    SubLFiles.declareFunction( me, "tpool_process_name_prefix", "TPOOL-PROCESS-NAME-PREFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "tpool_min_nbr_of_task_processors", "TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false );
    SubLFiles.declareFunction( me, "tpool_max_nbr_of_task_processors", "TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tpool_lock", "_CSETF-TPOOL-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tpool_request_queue", "_CSETF-TPOOL-REQUEST-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tpool_request_semaphore", "_CSETF-TPOOL-REQUEST-SEMAPHORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tpool_processors", "_CSETF-TPOOL-PROCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tpool_background_msgs", "_CSETF-TPOOL-BACKGROUND-MSGS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tpool_process_name_prefix", "_CSETF-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tpool_min_nbr_of_task_processors", "_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_tpool_max_nbr_of_task_processors", "_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "make_task_process_pool", "MAKE-TASK-PROCESS-POOL", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_task_process_pool", "VISIT-DEFSTRUCT-TASK-PROCESS-POOL", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_task_process_pool_method", "VISIT-DEFSTRUCT-OBJECT-TASK-PROCESS-POOL-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "print_task_process_pool", "PRINT-TASK-PROCESS-POOL", 3, 0, false );
    SubLFiles.declareFunction( me, "display_task_processors", "DISPLAY-TASK-PROCESSORS", 1, 1, false );
    SubLFiles.declareFunction( me, "display_active_task_processes", "DISPLAY-ACTIVE-TASK-PROCESSES", 0, 1, false );
    SubLFiles.declareFunction( me, "task_processors_initialized_p", "TASK-PROCESSORS-INITIALIZED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "get_tpool_lock", "GET-TPOOL-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "set_tpool_lock", "SET-TPOOL-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "get_tpool_request_queue", "GET-TPOOL-REQUEST-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "set_tpool_request_queue", "SET-TPOOL-REQUEST-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_tpool_processors", "GET-TPOOL-PROCESSORS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_tpool_processors_nbr", "GET-TPOOL-PROCESSORS-NBR", 1, 0, false );
    SubLFiles.declareFunction( me, "push_tpool_processor", "PUSH-TPOOL-PROCESSOR", 2, 0, false );
    SubLFiles.declareFunction( me, "set_tpool_processors", "SET-TPOOL-PROCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "set_tpool_background_msg_path", "SET-TPOOL-BACKGROUND-MSG-PATH", 1, 0, false );
    SubLFiles.declareFunction( me, "push_tpool_background_msg", "PUSH-TPOOL-BACKGROUND-MSG", 2, 0, false );
    SubLFiles.declareFunction( me, "flush_tpool_background_msgs", "FLUSH-TPOOL-BACKGROUND-MSGS", 0, 0, false );
    SubLFiles.declareFunction( me, "show_tp_msgs", "SHOW-TP-MSGS", 1, 0, false );
    SubLFiles.declareFunction( me, "show_tp_msgs_with_process_name", "SHOW-TP-MSGS-WITH-PROCESS-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "set_tpool_process_name_prefix", "SET-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false );
    SubLFiles.declareFunction( me, "get_tpool_process_name_prefix", "GET-TPOOL-PROCESS-NAME-PREFIX", 1, 0, false );
    SubLFiles.declareFunction( me, "set_tpool_min_nbr_of_task_processors", "SET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_tpool_min_nbr_of_task_processors", "GET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false );
    SubLFiles.declareFunction( me, "set_tpool_max_nbr_of_task_processors", "SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false );
    SubLFiles.declareFunction( me, "get_tpool_max_nbr_of_task_processors", "GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false );
    SubLFiles.declareFunction( me, "get_nbr_of_task_processors", "GET-NBR-OF-TASK-PROCESSORS", 1, 0, false );
    SubLFiles.declareFunction( me, "start_task_processor_logging_to_file", "START-TASK-PROCESSOR-LOGGING-TO-FILE", 1, 1, false );
    SubLFiles.declareFunction( me, "end_task_processor_logging_to_file", "END-TASK-PROCESSOR-LOGGING-TO-FILE", 0, 0, false );
    SubLFiles.declareFunction( me, "save_unlogged_task_processor_messages_to_file", "SAVE-UNLOGGED-TASK-PROCESSOR-MESSAGES-TO-FILE", 1, 0, false );
    SubLFiles.declareFunction( me, "eval_with_bindings", "EVAL-WITH-BINDINGS", 3, 0, false );
    SubLFiles.declareFunction( me, "get_task_process_pool_for_process", "GET-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "add_task_process_pool_for_process", "ADD-TASK-PROCESS-POOL-FOR-PROCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_task_process_pool_for_process", "REMOVE-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_task_process_being_worked_on_initialized", "ENSURE-TASK-PROCESS-BEING-WORKED-ON-INITIALIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_task_process_description_from_task_info", "COMPUTE-TASK-PROCESS-DESCRIPTION-FROM-TASK-INFO", 1, 0, false );
    SubLFiles.declareFunction( me, "compute_task_process_description", "COMPUTE-TASK-PROCESS-DESCRIPTION", 2, 0, false );
    SubLFiles.declareFunction( me, "get_giveback_info_from_task_process_description", "GET-GIVEBACK-INFO-FROM-TASK-PROCESS-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "note_active_task_process_description_if_permitted", "NOTE-ACTIVE-TASK-PROCESS-DESCRIPTION-IF-PERMITTED", 1, 0, false );
    SubLFiles.declareFunction( me, "note_inactive_task_process_description", "NOTE-INACTIVE-TASK-PROCESS-DESCRIPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "task_process_termination_reason_p", "TASK-PROCESS-TERMINATION-REASON-P", 1, 0, false );
    SubLFiles.declareFunction( me, "terminate_active_task_process", "TERMINATE-ACTIVE-TASK-PROCESS", 3, 0, false );
    SubLFiles.declareFunction( me, "terminate_active_task_processes", "TERMINATE-ACTIVE-TASK-PROCESSES", 1, 0, false );
    SubLFiles.declareFunction( me, "signal_terminate_active_task_process", "SIGNAL-TERMINATE-ACTIVE-TASK-PROCESS", 4, 0, false );
    SubLFiles.declareFunction( me, "signal_abort_active_task_process", "SIGNAL-ABORT-ACTIVE-TASK-PROCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "signal_cancel_active_task_process", "SIGNAL-CANCEL-ACTIVE-TASK-PROCESS", 2, 0, false );
    SubLFiles.declareMacro( me, "catch_task_processor_termination", "CATCH-TASK-PROCESSOR-TERMINATION" );
    SubLFiles.declareMacro( me, "catch_task_processor_termination_quietly", "CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY" );
    SubLFiles.declareFunction( me, "get_current_task_processor_info", "GET-CURRENT-TASK-PROCESSOR-INFO", 0, 0, false );
    SubLFiles.declareFunction( me, "get_current_task_processor_client", "GET-CURRENT-TASK-PROCESSOR-CLIENT", 0, 0, false );
    SubLFiles.declareFunction( me, "map_task_info_priority_to_process_priority", "MAP-TASK-INFO-PRIORITY-TO-PROCESS-PRIORITY", 1, 0, false );
    SubLFiles.declareFunction( me, "task_processor_handler", "TASK-PROCESSOR-HANDLER", 0, 0, false );
    SubLFiles.declareFunction( me, "post_task_info_processor_partial_results", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS", 1, 0, false );
    SubLFiles.declareFunction( me, "post_task_info_processor_partial_results_internal", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS-INTERNAL", 2, 0, false );
    SubLFiles.declareFunction( me, "initialize_task_processors", "INITIALIZE-TASK-PROCESSORS", 0, 3, false );
    SubLFiles.declareFunction( me, "add_new_task_processor_to_pool", "ADD-NEW-TASK-PROCESSOR-TO-POOL", 1, 0, false );
    SubLFiles.declareFunction( me, "halt_task_processors", "HALT-TASK-PROCESSORS", 1, 0, false );
    SubLFiles.declareFunction( me, "halt_task_processor", "HALT-TASK-PROCESSOR", 1, 0, false );
    SubLFiles.declareFunction( me, "halt_task_processor_via_interrupt", "HALT-TASK-PROCESSOR-VIA-INTERRUPT", 1, 0, false );
    SubLFiles.declareFunction( me, "ensure_task_processors_killed", "ENSURE-TASK-PROCESSORS-KILLED", 1, 0, false );
    SubLFiles.declareFunction( me, "task_processor_quit", "TASK-PROCESSOR-QUIT", 0, 0, false );
    SubLFiles.declareFunction( me, "find_task_processor", "FIND-TASK-PROCESSOR", 2, 0, false );
    SubLFiles.declareFunction( me, "find_task_process_pool", "FIND-TASK-PROCESS-POOL", 1, 0, false );
    SubLFiles.declareFunction( me, "awaken_first_available_task_processors", "AWAKEN-FIRST-AVAILABLE-TASK-PROCESSORS", 1, 0, false );
    SubLFiles.declareFunction( me, "enqueue_task_request", "ENQUEUE-TASK-REQUEST", 2, 0, false );
    SubLFiles.declareMacro( me, "with_long_running_task_process", "WITH-LONG-RUNNING-TASK-PROCESS" );
    SubLFiles.declareMacro( me, "declare_task_process_pool", "DECLARE-TASK-PROCESS-POOL" );
    SubLFiles.declareMacro( me, "declare_task_process_request", "DECLARE-TASK-PROCESS-REQUEST" );
    SubLFiles.declareMacro( me, "declare_task_process_response_dispatch", "DECLARE-TASK-PROCESS-RESPONSE-DISPATCH" );
    SubLFiles.declareFunction( me, "api_task_processors_initialized_p", "API-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_api_task_processors", "INITIALIZE-API-TASK-PROCESSORS", 0, 0, false );
    SubLFiles.declareFunction( me, "halt_api_task_processors", "HALT-API-TASK-PROCESSORS", 0, 0, false );
    SubLFiles.declareFunction( me, "restart_api_task_processors", "RESTART-API-TASK-PROCESSORS", 0, 0, false );
    SubLFiles.declareFunction( me, "show_api_tp_msgs", "SHOW-API-TP-MSGS", 0, 0, false );
    SubLFiles.declareFunction( me, "show_api_task_processors", "SHOW-API-TASK-PROCESSORS", 0, 0, false );
    SubLFiles.declareFunction( me, "display_api_task_processors", "DISPLAY-API-TASK-PROCESSORS", 0, 0, false );
    SubLFiles.declareFunction( me, "api_task_processor_request", "API-TASK-PROCESSOR-REQUEST", 6, 0, false );
    SubLFiles.declareFunction( me, "set_java_api_lease_activity_display", "SET-JAVA-API-LEASE-ACTIVITY-DISPLAY", 1, 0, false );
    SubLFiles.declareFunction( me, "java_api_lease_activity_display", "JAVA-API-LEASE-ACTIVITY-DISPLAY", 0, 0, false );
    SubLFiles.declareFunction( me, "dispatch_task_processor_response", "DISPATCH-TASK-PROCESSOR-RESPONSE", 1, 1, false );
    SubLFiles.declareFunction( me, "dispatch_api_task_processor_response", "DISPATCH-API-TASK-PROCESSOR-RESPONSE", 1, 1, false );
    SubLFiles.declareFunction( me, "new_intermediate_results_accumulator", "NEW-INTERMEDIATE-RESULTS-ACCUMULATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "intermediate_results_accumulator_add", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "intermediate_results_accumulator_add_all", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD-ALL", 2, 0, false );
    SubLFiles.declareFunction( me, "intermediate_results_accumulator_reset", "INTERMEDIATE-RESULTS-ACCUMULATOR-RESET", 1, 0, false );
    SubLFiles.declareFunction( me, "intermediate_results_accumulator_size", "INTERMEDIATE-RESULTS-ACCUMULATOR-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "intermediate_results_accumulator_contents", "INTERMEDIATE-RESULTS-ACCUMULATOR-CONTENTS", 1, 1, false );
    SubLFiles.declareFunction( me, "intermediate_results_accumulator_iterator", "INTERMEDIATE-RESULTS-ACCUMULATOR-ITERATOR", 1, 0, false );
    SubLFiles.declareFunction( me, "bg_task_processors_initialized_p", "BG-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_bg_task_processors", "INITIALIZE-BG-TASK-PROCESSORS", 0, 0, false );
    SubLFiles.declareFunction( me, "halt_bg_task_processors", "HALT-BG-TASK-PROCESSORS", 0, 0, false );
    SubLFiles.declareFunction( me, "restart_bg_task_processors", "RESTART-BG-TASK-PROCESSORS", 0, 0, false );
    SubLFiles.declareFunction( me, "show_bg_tp_msgs", "SHOW-BG-TP-MSGS", 0, 0, false );
    SubLFiles.declareFunction( me, "bg_task_processor_request", "BG-TASK-PROCESSOR-REQUEST", 6, 0, false );
    SubLFiles.declareFunction( me, "dispatch_bg_task_processor_response", "DISPATCH-BG-TASK-PROCESSOR-RESPONSE", 1, 0, false );
    SubLFiles.declareFunction( me, "bg_api_eval", "BG-API-EVAL", 1, 0, false );
    SubLFiles.declareFunction( me, "console_task_processors_initialized_p", "CONSOLE-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_console_task_processors", "INITIALIZE-CONSOLE-TASK-PROCESSORS", 0, 0, false );
    SubLFiles.declareFunction( me, "halt_console_task_processors", "HALT-CONSOLE-TASK-PROCESSORS", 0, 0, false );
    SubLFiles.declareFunction( me, "restart_console_task_processors", "RESTART-CONSOLE-TASK-PROCESSORS", 0, 0, false );
    SubLFiles.declareFunction( me, "show_console_tp_msgs", "SHOW-CONSOLE-TP-MSGS", 0, 0, false );
    SubLFiles.declareFunction( me, "console_task_processor_request", "CONSOLE-TASK-PROCESSOR-REQUEST", 2, 0, false );
    SubLFiles.declareFunction( me, "dispatch_console_task_processor_response", "DISPATCH-CONSOLE-TASK-PROCESSOR-RESPONSE", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_task_processor_file()
  {
    $task_processor_verbosity$ = SubLFiles.defparameter( "*TASK-PROCESSOR-VERBOSITY*", ZERO_INTEGER );
    $dtp_task_info$ = SubLFiles.defconstant( "*DTP-TASK-INFO*", $sym3$TASK_INFO );
    $dtp_task_result_set$ = SubLFiles.defconstant( "*DTP-TASK-RESULT-SET*", $sym60$TASK_RESULT_SET );
    $task_processor_response_dispatch_fn_dict$ = SubLFiles.deflexical( "*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*", NIL );
    $dtp_task_processor$ = SubLFiles.defconstant( "*DTP-TASK-PROCESSOR*", $sym81$TASK_PROCESSOR );
    $dtp_task_process_pool$ = SubLFiles.defconstant( "*DTP-TASK-PROCESS-POOL*", $sym108$TASK_PROCESS_POOL );
    $task_request_queue_max_size$ = SubLFiles.defconstant( "*TASK-REQUEST-QUEUE-MAX-SIZE*", $int151$500 );
    $tpool_background_msg_path$ = SubLFiles.deflexical( "*TPOOL-BACKGROUND-MSG-PATH*", NIL );
    $tpool_background_msg_stream$ = SubLFiles.deflexical( "*TPOOL-BACKGROUND-MSG-STREAM*", NIL );
    $queue_tpool_background_msgs_when_no_pathP$ = SubLFiles.defparameter( "*QUEUE-TPOOL-BACKGROUND-MSGS-WHEN-NO-PATH?*", NIL );
    $tpool_background_msg_lock$ = SubLFiles.deflexical( "*TPOOL-BACKGROUND-MSG-LOCK*", maybeDefault( $sym156$_TPOOL_BACKGROUND_MSG_LOCK_, $tpool_background_msg_lock$, () -> ( Locks.make_lock(
        $str157$tpool_background_msg_lock ) ) ) );
    $eval_with_bindings$ = SubLFiles.defparameter( "*EVAL-WITH-BINDINGS*", NIL );
    $process_to_task_process_pool$ = SubLFiles.deflexical( "*PROCESS-TO-TASK-PROCESS-POOL*", dictionary_utilities.new_synchronized_dictionary( UNPROVIDED, UNPROVIDED ) );
    $task_processes_being_worked_on_lock$ = SubLFiles.deflexical( "*TASK-PROCESSES-BEING-WORKED-ON-LOCK*", Locks.make_lock( $str184$Task_processes_being_worked_on ) );
    $task_processes_being_worked_on$ = SubLFiles.deflexical( "*TASK-PROCESSES-BEING-WORKED-ON*", NIL );
    $task_processes_worked_on_history$ = SubLFiles.defparameter( "*TASK-PROCESSES-WORKED-ON-HISTORY*", $int151$500 );
    $task_processor_eval_fn_dict$ = SubLFiles.deflexical( "*TASK-PROCESSOR-EVAL-FN-DICT*", NIL );
    $minimize_task_processor_info_communication$ = SubLFiles.defparameter( "*MINIMIZE-TASK-PROCESSOR-INFO-COMMUNICATION*", T );
    $current_task_processor_info$ = SubLFiles.defparameter( "*CURRENT-TASK-PROCESSOR-INFO*", NIL );
    $task_processor_standard_output$ = SubLFiles.defparameter( "*TASK-PROCESSOR-STANDARD-OUTPUT*", StreamsLow.$standard_output$.getDynamicValue() );
    $min_nbr_of_task_processors$ = SubLFiles.defconstant( "*MIN-NBR-OF-TASK-PROCESSORS*", FIVE_INTEGER );
    $max_nbr_of_task_processors$ = SubLFiles.defconstant( "*MAX-NBR-OF-TASK-PROCESSORS*", $int212$25 );
    $api_task_process_pool$ = SubLFiles.deflexical( "*API-TASK-PROCESS-POOL*", NIL );
    $api_task_process_pool_lock$ = SubLFiles.defconstant( "*API-TASK-PROCESS-POOL-LOCK*", Locks.make_lock( $str277$task_processor_initialization_loc ) );
    $java_api_lease_activity_display$ = SubLFiles.deflexical( "*JAVA-API-LEASE-ACTIVITY-DISPLAY*", NIL );
    $bg_task_process_pool$ = SubLFiles.deflexical( "*BG-TASK-PROCESS-POOL*", NIL );
    $bg_task_process_pool_lock$ = SubLFiles.defconstant( "*BG-TASK-PROCESS-POOL-LOCK*", Locks.make_lock( $str277$task_processor_initialization_loc ) );
    $bg_task_processor_response_dict$ = SubLFiles.deflexical( "*BG-TASK-PROCESSOR-RESPONSE-DICT*", NIL );
    $bg_task_processor_request_id$ = SubLFiles.deflexical( "*BG-TASK-PROCESSOR-REQUEST-ID*", ZERO_INTEGER );
    $console_task_process_pool$ = SubLFiles.deflexical( "*CONSOLE-TASK-PROCESS-POOL*", NIL );
    $console_task_process_pool_lock$ = SubLFiles.defconstant( "*CONSOLE-TASK-PROCESS-POOL-LOCK*", Locks.make_lock( $str277$task_processor_initialization_loc ) );
    $task_processor_console_id$ = SubLFiles.deflexical( "*TASK-PROCESSOR-CONSOLE-ID*", ( maybeDefault( $sym310$_TASK_PROCESSOR_CONSOLE_ID_, $task_processor_console_id$, ZERO_INTEGER ) ) );
    return NIL;
  }

  public static SubLObject setup_task_processor_file()
  {
    access_macros.register_external_symbol( $sym0$SET_TASK_PROCESSOR_VERBOSITY );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_task_info$.getGlobalValue(), Symbols.symbol_function( $sym10$TASK_INFO_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list11 );
    Structures.def_csetf( $sym12$TI_TYPE, $sym13$_CSETF_TI_TYPE );
    Structures.def_csetf( $sym14$TI_ID, $sym15$_CSETF_TI_ID );
    Structures.def_csetf( $sym16$TI_PRIORITY, $sym17$_CSETF_TI_PRIORITY );
    Structures.def_csetf( $sym18$TI_REQUESTOR, $sym19$_CSETF_TI_REQUESTOR );
    Structures.def_csetf( $sym20$TI_GIVEBACK_INFO, $sym21$_CSETF_TI_GIVEBACK_INFO );
    Structures.def_csetf( $sym22$TI_BINDINGS, $sym23$_CSETF_TI_BINDINGS );
    Structures.def_csetf( $sym24$TI_REQUEST, $sym25$_CSETF_TI_REQUEST );
    Structures.def_csetf( $sym26$TI_RESPONSE, $sym27$_CSETF_TI_RESPONSE );
    Structures.def_csetf( $sym28$TI_ERROR_MESSAGE, $sym29$_CSETF_TI_ERROR_MESSAGE );
    Structures.def_csetf( $sym30$TI_TASK_PROCESSOR_NAME, $sym31$_CSETF_TI_TASK_PROCESSOR_NAME );
    Equality.identity( $sym3$TASK_INFO );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_task_info$.getGlobalValue(), Symbols.symbol_function( $sym47$VISIT_DEFSTRUCT_OBJECT_TASK_INFO_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_task_result_set$.getGlobalValue(), Symbols.symbol_function( $sym67$TASK_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list68 );
    Structures.def_csetf( $sym69$TASK_RESULT_SET_RESULT, $sym70$_CSETF_TASK_RESULT_SET_RESULT );
    Structures.def_csetf( $sym71$TASK_RESULT_SET_TASK_INFO, $sym72$_CSETF_TASK_RESULT_SET_TASK_INFO );
    Structures.def_csetf( $sym73$TASK_RESULT_SET_FINISHED, $sym74$_CSETF_TASK_RESULT_SET_FINISHED );
    Equality.identity( $sym60$TASK_RESULT_SET );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_task_result_set$.getGlobalValue(), Symbols.symbol_function(
        $sym79$VISIT_DEFSTRUCT_OBJECT_TASK_RESULT_SET_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_task_processor$.getGlobalValue(), Symbols.symbol_function( $sym88$TASK_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list89 );
    Structures.def_csetf( $sym90$TPROC_NAME, $sym91$_CSETF_TPROC_NAME );
    Structures.def_csetf( $sym92$TPROC_PROCESS, $sym93$_CSETF_TPROC_PROCESS );
    Structures.def_csetf( $sym94$TPROC_BUSY_P, $sym95$_CSETF_TPROC_BUSY_P );
    Structures.def_csetf( $sym96$TPROC_TASK_INFO, $sym97$_CSETF_TPROC_TASK_INFO );
    Equality.identity( $sym81$TASK_PROCESSOR );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_task_processor$.getGlobalValue(), Symbols.symbol_function( $sym102$VISIT_DEFSTRUCT_OBJECT_TASK_PROCESSOR_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_task_process_pool$.getGlobalValue(), Symbols.symbol_function( $sym115$TASK_PROCESS_POOL_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list116 );
    Structures.def_csetf( $sym117$TPOOL_LOCK, $sym118$_CSETF_TPOOL_LOCK );
    Structures.def_csetf( $sym119$TPOOL_REQUEST_QUEUE, $sym120$_CSETF_TPOOL_REQUEST_QUEUE );
    Structures.def_csetf( $sym121$TPOOL_REQUEST_SEMAPHORE, $sym122$_CSETF_TPOOL_REQUEST_SEMAPHORE );
    Structures.def_csetf( $sym123$TPOOL_PROCESSORS, $sym124$_CSETF_TPOOL_PROCESSORS );
    Structures.def_csetf( $sym125$TPOOL_BACKGROUND_MSGS, $sym126$_CSETF_TPOOL_BACKGROUND_MSGS );
    Structures.def_csetf( $sym127$TPOOL_PROCESS_NAME_PREFIX, $sym128$_CSETF_TPOOL_PROCESS_NAME_PREFIX );
    Structures.def_csetf( $sym129$TPOOL_MIN_NBR_OF_TASK_PROCESSORS, $sym130$_CSETF_TPOOL_MIN_NBR_OF_TASK_PROCESSORS );
    Structures.def_csetf( $sym131$TPOOL_MAX_NBR_OF_TASK_PROCESSORS, $sym132$_CSETF_TPOOL_MAX_NBR_OF_TASK_PROCESSORS );
    Equality.identity( $sym108$TASK_PROCESS_POOL );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_task_process_pool$.getGlobalValue(), Symbols.symbol_function(
        $sym142$VISIT_DEFSTRUCT_OBJECT_TASK_PROCESS_POOL_METHOD ) );
    access_macros.register_external_symbol( $sym155$SET_TPOOL_BACKGROUND_MSG_PATH );
    subl_macro_promotions.declare_defglobal( $sym156$_TPOOL_BACKGROUND_MSG_LOCK_ );
    access_macros.register_external_symbol( $sym158$PUSH_TPOOL_BACKGROUND_MSG );
    access_macros.register_external_symbol( $sym170$FLUSH_TPOOL_BACKGROUND_MSGS );
    access_macros.register_external_symbol( $sym171$START_TASK_PROCESSOR_LOGGING_TO_FILE );
    access_macros.register_external_symbol( $sym173$END_TASK_PROCESSOR_LOGGING_TO_FILE );
    access_macros.register_external_symbol( $sym176$SAVE_UNLOGGED_TASK_PROCESSOR_MESSAGES_TO_FILE );
    utilities_macros.register_cyc_api_macro( $sym196$CATCH_TASK_PROCESSOR_TERMINATION, $list193, $str197$Allow_for_the_API_calling_side_to );
    utilities_macros.register_cyc_api_macro( $sym199$CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY, $list200, $str201$Allow_for_the_API_calling_side_to );
    access_macros.register_external_symbol( $sym220$ENSURE_TASK_PROCESSORS_KILLED );
    access_macros.register_external_symbol( $sym227$WITH_LONG_RUNNING_TASK_PROCESS );
    utilities_macros.register_cyc_api_function( $sym280$SHOW_API_TASK_PROCESSORS, NIL, $str281$Provides_a_convenient_alias_for_D, NIL, NIL );
    utilities_macros.register_cyc_api_function( $sym282$DISPLAY_API_TASK_PROCESSORS, NIL, $str283$, NIL, NIL );
    utilities_macros.register_api_predefined_function( $sym284$INITIALIZE_API_TASK_PROCESSORS );
    utilities_macros.register_api_predefined_function( $sym285$HALT_API_TASK_PROCESSORS );
    utilities_macros.register_api_predefined_function( $sym286$RESTART_API_TASK_PROCESSORS );
    utilities_macros.register_api_predefined_function( $sym287$SHOW_API_TP_MSGS );
    utilities_macros.register_api_predefined_function( $sym288$API_TASK_PROCESSOR_REQUEST );
    utilities_macros.register_api_predefined_function( $sym289$WITH_IMMEDIATE_EXECUTION );
    if( NIL == $task_processor_eval_fn_dict$.getGlobalValue() )
    {
      $task_processor_eval_fn_dict$.setGlobalValue( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    }
    dictionary.dictionary_enter( $task_processor_eval_fn_dict$.getGlobalValue(), $kw290$API, Symbols.symbol_function( $sym181$CYC_API_EVAL ) );
    access_macros.register_external_symbol( $sym291$SET_JAVA_API_LEASE_ACTIVITY_DISPLAY );
    if( NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue() )
    {
      $task_processor_response_dispatch_fn_dict$.setGlobalValue( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    }
    dictionary.dictionary_enter( $task_processor_response_dispatch_fn_dict$.getGlobalValue(), $kw290$API, Symbols.symbol_function( $sym296$DISPATCH_API_TASK_PROCESSOR_RESPONSE ) );
    if( NIL == $task_processor_eval_fn_dict$.getGlobalValue() )
    {
      $task_processor_eval_fn_dict$.setGlobalValue( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    }
    dictionary.dictionary_enter( $task_processor_eval_fn_dict$.getGlobalValue(), $kw305$BG, Symbols.symbol_function( $sym181$CYC_API_EVAL ) );
    if( NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue() )
    {
      $task_processor_response_dispatch_fn_dict$.setGlobalValue( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    }
    dictionary.dictionary_enter( $task_processor_response_dispatch_fn_dict$.getGlobalValue(), $kw305$BG, Symbols.symbol_function( $sym308$DISPATCH_BG_TASK_PROCESSOR_RESPONSE ) );
    subl_macro_promotions.declare_defglobal( $sym310$_TASK_PROCESSOR_CONSOLE_ID_ );
    if( NIL == $task_processor_eval_fn_dict$.getGlobalValue() )
    {
      $task_processor_eval_fn_dict$.setGlobalValue( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    }
    dictionary.dictionary_enter( $task_processor_eval_fn_dict$.getGlobalValue(), $kw311$CONSOLE, Symbols.symbol_function( $sym181$CYC_API_EVAL ) );
    if( NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue() )
    {
      $task_processor_response_dispatch_fn_dict$.setGlobalValue( dictionary.new_dictionary( UNPROVIDED, UNPROVIDED ) );
    }
    dictionary.dictionary_enter( $task_processor_response_dispatch_fn_dict$.getGlobalValue(), $kw311$CONSOLE, Symbols.symbol_function( $sym314$DISPATCH_CONSOLE_TASK_PROCESSOR_RESPONSE ) );
    sunit_external.define_test_category( $str315$Task_Processor_Module_Supercatego, UNPROVIDED );
    sunit_external.define_test_category( $str316$Task_Processor_Subcategory, ConsesLow.list( $str315$Task_Processor_Module_Supercatego ) );
    sunit_external.define_test_suite( $str317$Task_Processor_Testing_Suite, ConsesLow.list( $str315$Task_Processor_Module_Supercatego ), UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_task_processor_file();
  }

  @Override
  public void initializeVariables()
  {
    init_task_processor_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_task_processor_file();
  }
  static
  {
    me = new task_processor();
    $task_processor_verbosity$ = null;
    $dtp_task_info$ = null;
    $dtp_task_result_set$ = null;
    $task_processor_response_dispatch_fn_dict$ = null;
    $dtp_task_processor$ = null;
    $dtp_task_process_pool$ = null;
    $task_request_queue_max_size$ = null;
    $tpool_background_msg_path$ = null;
    $tpool_background_msg_stream$ = null;
    $queue_tpool_background_msgs_when_no_pathP$ = null;
    $tpool_background_msg_lock$ = null;
    $eval_with_bindings$ = null;
    $process_to_task_process_pool$ = null;
    $task_processes_being_worked_on_lock$ = null;
    $task_processes_being_worked_on$ = null;
    $task_processes_worked_on_history$ = null;
    $task_processor_eval_fn_dict$ = null;
    $minimize_task_processor_info_communication$ = null;
    $current_task_processor_info$ = null;
    $task_processor_standard_output$ = null;
    $min_nbr_of_task_processors$ = null;
    $max_nbr_of_task_processors$ = null;
    $api_task_process_pool$ = null;
    $api_task_process_pool_lock$ = null;
    $java_api_lease_activity_display$ = null;
    $bg_task_process_pool$ = null;
    $bg_task_process_pool_lock$ = null;
    $bg_task_processor_response_dict$ = null;
    $bg_task_processor_request_id$ = null;
    $console_task_process_pool$ = null;
    $console_task_process_pool_lock$ = null;
    $task_processor_console_id$ = null;
    $sym0$SET_TASK_PROCESSOR_VERBOSITY = makeSymbol( "SET-TASK-PROCESSOR-VERBOSITY" );
    $sym1$INTEGERP = makeSymbol( "INTEGERP" );
    $str2$Invalid_verbosity__must_be_0___9_ = makeString( "Invalid verbosity, must be 0 - 9 but was ~S~%" );
    $sym3$TASK_INFO = makeSymbol( "TASK-INFO" );
    $sym4$TASK_INFO_P = makeSymbol( "TASK-INFO-P" );
    $list5 = ConsesLow.list( new SubLObject[] { makeSymbol( "TYPE" ), makeSymbol( "ID" ), makeSymbol( "PRIORITY" ), makeSymbol( "REQUESTOR" ), makeSymbol( "GIVEBACK-INFO" ), makeSymbol( "BINDINGS" ), makeSymbol(
        "REQUEST" ), makeSymbol( "RESPONSE" ), makeSymbol( "ERROR-MESSAGE" ), makeSymbol( "TASK-PROCESSOR-NAME" )
    } );
    $list6 = ConsesLow.list( new SubLObject[] { makeKeyword( "TYPE" ), makeKeyword( "ID" ), makeKeyword( "PRIORITY" ), makeKeyword( "REQUESTOR" ), makeKeyword( "GIVEBACK-INFO" ), makeKeyword( "BINDINGS" ), makeKeyword(
        "REQUEST" ), makeKeyword( "RESPONSE" ), makeKeyword( "ERROR-MESSAGE" ), makeKeyword( "TASK-PROCESSOR-NAME" )
    } );
    $list7 = ConsesLow.list( new SubLObject[] { makeSymbol( "TI-TYPE" ), makeSymbol( "TI-ID" ), makeSymbol( "TI-PRIORITY" ), makeSymbol( "TI-REQUESTOR" ), makeSymbol( "TI-GIVEBACK-INFO" ), makeSymbol( "TI-BINDINGS" ),
      makeSymbol( "TI-REQUEST" ), makeSymbol( "TI-RESPONSE" ), makeSymbol( "TI-ERROR-MESSAGE" ), makeSymbol( "TI-TASK-PROCESSOR-NAME" )
    } );
    $list8 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-TI-TYPE" ), makeSymbol( "_CSETF-TI-ID" ), makeSymbol( "_CSETF-TI-PRIORITY" ), makeSymbol( "_CSETF-TI-REQUESTOR" ), makeSymbol(
        "_CSETF-TI-GIVEBACK-INFO" ), makeSymbol( "_CSETF-TI-BINDINGS" ), makeSymbol( "_CSETF-TI-REQUEST" ), makeSymbol( "_CSETF-TI-RESPONSE" ), makeSymbol( "_CSETF-TI-ERROR-MESSAGE" ), makeSymbol(
            "_CSETF-TI-TASK-PROCESSOR-NAME" )
    } );
    $sym9$PRINT_TASK_INFO = makeSymbol( "PRINT-TASK-INFO" );
    $sym10$TASK_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TASK-INFO-PRINT-FUNCTION-TRAMPOLINE" );
    $list11 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TASK-INFO-P" ) );
    $sym12$TI_TYPE = makeSymbol( "TI-TYPE" );
    $sym13$_CSETF_TI_TYPE = makeSymbol( "_CSETF-TI-TYPE" );
    $sym14$TI_ID = makeSymbol( "TI-ID" );
    $sym15$_CSETF_TI_ID = makeSymbol( "_CSETF-TI-ID" );
    $sym16$TI_PRIORITY = makeSymbol( "TI-PRIORITY" );
    $sym17$_CSETF_TI_PRIORITY = makeSymbol( "_CSETF-TI-PRIORITY" );
    $sym18$TI_REQUESTOR = makeSymbol( "TI-REQUESTOR" );
    $sym19$_CSETF_TI_REQUESTOR = makeSymbol( "_CSETF-TI-REQUESTOR" );
    $sym20$TI_GIVEBACK_INFO = makeSymbol( "TI-GIVEBACK-INFO" );
    $sym21$_CSETF_TI_GIVEBACK_INFO = makeSymbol( "_CSETF-TI-GIVEBACK-INFO" );
    $sym22$TI_BINDINGS = makeSymbol( "TI-BINDINGS" );
    $sym23$_CSETF_TI_BINDINGS = makeSymbol( "_CSETF-TI-BINDINGS" );
    $sym24$TI_REQUEST = makeSymbol( "TI-REQUEST" );
    $sym25$_CSETF_TI_REQUEST = makeSymbol( "_CSETF-TI-REQUEST" );
    $sym26$TI_RESPONSE = makeSymbol( "TI-RESPONSE" );
    $sym27$_CSETF_TI_RESPONSE = makeSymbol( "_CSETF-TI-RESPONSE" );
    $sym28$TI_ERROR_MESSAGE = makeSymbol( "TI-ERROR-MESSAGE" );
    $sym29$_CSETF_TI_ERROR_MESSAGE = makeSymbol( "_CSETF-TI-ERROR-MESSAGE" );
    $sym30$TI_TASK_PROCESSOR_NAME = makeSymbol( "TI-TASK-PROCESSOR-NAME" );
    $sym31$_CSETF_TI_TASK_PROCESSOR_NAME = makeSymbol( "_CSETF-TI-TASK-PROCESSOR-NAME" );
    $kw32$TYPE = makeKeyword( "TYPE" );
    $kw33$ID = makeKeyword( "ID" );
    $kw34$PRIORITY = makeKeyword( "PRIORITY" );
    $kw35$REQUESTOR = makeKeyword( "REQUESTOR" );
    $kw36$GIVEBACK_INFO = makeKeyword( "GIVEBACK-INFO" );
    $kw37$BINDINGS = makeKeyword( "BINDINGS" );
    $kw38$REQUEST = makeKeyword( "REQUEST" );
    $kw39$RESPONSE = makeKeyword( "RESPONSE" );
    $kw40$ERROR_MESSAGE = makeKeyword( "ERROR-MESSAGE" );
    $kw41$TASK_PROCESSOR_NAME = makeKeyword( "TASK-PROCESSOR-NAME" );
    $str42$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw43$BEGIN = makeKeyword( "BEGIN" );
    $sym44$MAKE_TASK_INFO = makeSymbol( "MAKE-TASK-INFO" );
    $kw45$SLOT = makeKeyword( "SLOT" );
    $kw46$END = makeKeyword( "END" );
    $sym47$VISIT_DEFSTRUCT_OBJECT_TASK_INFO_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TASK-INFO-METHOD" );
    $sym48$SYMBOLP = makeSymbol( "SYMBOLP" );
    $sym49$STRINGP = makeSymbol( "STRINGP" );
    $sym50$STREAMP = makeSymbol( "STREAMP" );
    $str51$type_ = makeString( "type=" );
    $str52$_id_ = makeString( " id=" );
    $str53$_priority_ = makeString( " priority=" );
    $str54$_requestor_ = makeString( " requestor=" );
    $str55$_giveback_info_ = makeString( " giveback-info=" );
    $str56$_bindings_ = makeString( " bindings=" );
    $str57$_request_ = makeString( " request=" );
    $str58$_response_ = makeString( " response=" );
    $str59$_error_message_ = makeString( " error-message=" );
    $sym60$TASK_RESULT_SET = makeSymbol( "TASK-RESULT-SET" );
    $sym61$TASK_RESULT_SET_P = makeSymbol( "TASK-RESULT-SET-P" );
    $list62 = ConsesLow.list( makeSymbol( "RESULT" ), makeSymbol( "TASK-INFO" ), makeSymbol( "FINISHED" ) );
    $list63 = ConsesLow.list( makeKeyword( "RESULT" ), makeKeyword( "TASK-INFO" ), makeKeyword( "FINISHED" ) );
    $list64 = ConsesLow.list( makeSymbol( "TASK-RESULT-SET-RESULT" ), makeSymbol( "TASK-RESULT-SET-TASK-INFO" ), makeSymbol( "TASK-RESULT-SET-FINISHED" ) );
    $list65 = ConsesLow.list( makeSymbol( "_CSETF-TASK-RESULT-SET-RESULT" ), makeSymbol( "_CSETF-TASK-RESULT-SET-TASK-INFO" ), makeSymbol( "_CSETF-TASK-RESULT-SET-FINISHED" ) );
    $sym66$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym67$TASK_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TASK-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE" );
    $list68 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TASK-RESULT-SET-P" ) );
    $sym69$TASK_RESULT_SET_RESULT = makeSymbol( "TASK-RESULT-SET-RESULT" );
    $sym70$_CSETF_TASK_RESULT_SET_RESULT = makeSymbol( "_CSETF-TASK-RESULT-SET-RESULT" );
    $sym71$TASK_RESULT_SET_TASK_INFO = makeSymbol( "TASK-RESULT-SET-TASK-INFO" );
    $sym72$_CSETF_TASK_RESULT_SET_TASK_INFO = makeSymbol( "_CSETF-TASK-RESULT-SET-TASK-INFO" );
    $sym73$TASK_RESULT_SET_FINISHED = makeSymbol( "TASK-RESULT-SET-FINISHED" );
    $sym74$_CSETF_TASK_RESULT_SET_FINISHED = makeSymbol( "_CSETF-TASK-RESULT-SET-FINISHED" );
    $kw75$RESULT = makeKeyword( "RESULT" );
    $kw76$TASK_INFO = makeKeyword( "TASK-INFO" );
    $kw77$FINISHED = makeKeyword( "FINISHED" );
    $sym78$MAKE_TASK_RESULT_SET = makeSymbol( "MAKE-TASK-RESULT-SET" );
    $sym79$VISIT_DEFSTRUCT_OBJECT_TASK_RESULT_SET_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TASK-RESULT-SET-METHOD" );
    $sym80$BOOLEANP = makeSymbol( "BOOLEANP" );
    $sym81$TASK_PROCESSOR = makeSymbol( "TASK-PROCESSOR" );
    $sym82$TASK_PROCESSOR_P = makeSymbol( "TASK-PROCESSOR-P" );
    $list83 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PROCESS" ), makeSymbol( "BUSY-P" ), makeSymbol( "TASK-INFO" ) );
    $list84 = ConsesLow.list( makeKeyword( "NAME" ), makeKeyword( "PROCESS" ), makeKeyword( "BUSY-P" ), makeKeyword( "TASK-INFO" ) );
    $list85 = ConsesLow.list( makeSymbol( "TPROC-NAME" ), makeSymbol( "TPROC-PROCESS" ), makeSymbol( "TPROC-BUSY-P" ), makeSymbol( "TPROC-TASK-INFO" ) );
    $list86 = ConsesLow.list( makeSymbol( "_CSETF-TPROC-NAME" ), makeSymbol( "_CSETF-TPROC-PROCESS" ), makeSymbol( "_CSETF-TPROC-BUSY-P" ), makeSymbol( "_CSETF-TPROC-TASK-INFO" ) );
    $sym87$PRINT_TASK_PROCESSOR = makeSymbol( "PRINT-TASK-PROCESSOR" );
    $sym88$TASK_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TASK-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE" );
    $list89 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TASK-PROCESSOR-P" ) );
    $sym90$TPROC_NAME = makeSymbol( "TPROC-NAME" );
    $sym91$_CSETF_TPROC_NAME = makeSymbol( "_CSETF-TPROC-NAME" );
    $sym92$TPROC_PROCESS = makeSymbol( "TPROC-PROCESS" );
    $sym93$_CSETF_TPROC_PROCESS = makeSymbol( "_CSETF-TPROC-PROCESS" );
    $sym94$TPROC_BUSY_P = makeSymbol( "TPROC-BUSY-P" );
    $sym95$_CSETF_TPROC_BUSY_P = makeSymbol( "_CSETF-TPROC-BUSY-P" );
    $sym96$TPROC_TASK_INFO = makeSymbol( "TPROC-TASK-INFO" );
    $sym97$_CSETF_TPROC_TASK_INFO = makeSymbol( "_CSETF-TPROC-TASK-INFO" );
    $kw98$NAME = makeKeyword( "NAME" );
    $kw99$PROCESS = makeKeyword( "PROCESS" );
    $kw100$BUSY_P = makeKeyword( "BUSY-P" );
    $sym101$MAKE_TASK_PROCESSOR = makeSymbol( "MAKE-TASK-PROCESSOR" );
    $sym102$VISIT_DEFSTRUCT_OBJECT_TASK_PROCESSOR_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TASK-PROCESSOR-METHOD" );
    $str103$name_ = makeString( "name=" );
    $str104$_process_ = makeString( " process=" );
    $str105$_whostate_ = makeString( " whostate=" );
    $str106$_busy_p_ = makeString( " busy-p=" );
    $str107$_last_response_ = makeString( " last response=" );
    $sym108$TASK_PROCESS_POOL = makeSymbol( "TASK-PROCESS-POOL" );
    $sym109$TASK_PROCESS_POOL_P = makeSymbol( "TASK-PROCESS-POOL-P" );
    $list110 = ConsesLow.list( makeSymbol( "LOCK" ), makeSymbol( "REQUEST-QUEUE" ), makeSymbol( "REQUEST-SEMAPHORE" ), makeSymbol( "PROCESSORS" ), makeSymbol( "BACKGROUND-MSGS" ), makeSymbol( "PROCESS-NAME-PREFIX" ),
        makeSymbol( "MIN-NBR-OF-TASK-PROCESSORS" ), makeSymbol( "MAX-NBR-OF-TASK-PROCESSORS" ) );
    $list111 = ConsesLow.list( makeKeyword( "LOCK" ), makeKeyword( "REQUEST-QUEUE" ), makeKeyword( "REQUEST-SEMAPHORE" ), makeKeyword( "PROCESSORS" ), makeKeyword( "BACKGROUND-MSGS" ), makeKeyword(
        "PROCESS-NAME-PREFIX" ), makeKeyword( "MIN-NBR-OF-TASK-PROCESSORS" ), makeKeyword( "MAX-NBR-OF-TASK-PROCESSORS" ) );
    $list112 = ConsesLow.list( makeSymbol( "TPOOL-LOCK" ), makeSymbol( "TPOOL-REQUEST-QUEUE" ), makeSymbol( "TPOOL-REQUEST-SEMAPHORE" ), makeSymbol( "TPOOL-PROCESSORS" ), makeSymbol( "TPOOL-BACKGROUND-MSGS" ),
        makeSymbol( "TPOOL-PROCESS-NAME-PREFIX" ), makeSymbol( "TPOOL-MIN-NBR-OF-TASK-PROCESSORS" ), makeSymbol( "TPOOL-MAX-NBR-OF-TASK-PROCESSORS" ) );
    $list113 = ConsesLow.list( makeSymbol( "_CSETF-TPOOL-LOCK" ), makeSymbol( "_CSETF-TPOOL-REQUEST-QUEUE" ), makeSymbol( "_CSETF-TPOOL-REQUEST-SEMAPHORE" ), makeSymbol( "_CSETF-TPOOL-PROCESSORS" ), makeSymbol(
        "_CSETF-TPOOL-BACKGROUND-MSGS" ), makeSymbol( "_CSETF-TPOOL-PROCESS-NAME-PREFIX" ), makeSymbol( "_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS" ), makeSymbol( "_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS" ) );
    $sym114$PRINT_TASK_PROCESS_POOL = makeSymbol( "PRINT-TASK-PROCESS-POOL" );
    $sym115$TASK_PROCESS_POOL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TASK-PROCESS-POOL-PRINT-FUNCTION-TRAMPOLINE" );
    $list116 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TASK-PROCESS-POOL-P" ) );
    $sym117$TPOOL_LOCK = makeSymbol( "TPOOL-LOCK" );
    $sym118$_CSETF_TPOOL_LOCK = makeSymbol( "_CSETF-TPOOL-LOCK" );
    $sym119$TPOOL_REQUEST_QUEUE = makeSymbol( "TPOOL-REQUEST-QUEUE" );
    $sym120$_CSETF_TPOOL_REQUEST_QUEUE = makeSymbol( "_CSETF-TPOOL-REQUEST-QUEUE" );
    $sym121$TPOOL_REQUEST_SEMAPHORE = makeSymbol( "TPOOL-REQUEST-SEMAPHORE" );
    $sym122$_CSETF_TPOOL_REQUEST_SEMAPHORE = makeSymbol( "_CSETF-TPOOL-REQUEST-SEMAPHORE" );
    $sym123$TPOOL_PROCESSORS = makeSymbol( "TPOOL-PROCESSORS" );
    $sym124$_CSETF_TPOOL_PROCESSORS = makeSymbol( "_CSETF-TPOOL-PROCESSORS" );
    $sym125$TPOOL_BACKGROUND_MSGS = makeSymbol( "TPOOL-BACKGROUND-MSGS" );
    $sym126$_CSETF_TPOOL_BACKGROUND_MSGS = makeSymbol( "_CSETF-TPOOL-BACKGROUND-MSGS" );
    $sym127$TPOOL_PROCESS_NAME_PREFIX = makeSymbol( "TPOOL-PROCESS-NAME-PREFIX" );
    $sym128$_CSETF_TPOOL_PROCESS_NAME_PREFIX = makeSymbol( "_CSETF-TPOOL-PROCESS-NAME-PREFIX" );
    $sym129$TPOOL_MIN_NBR_OF_TASK_PROCESSORS = makeSymbol( "TPOOL-MIN-NBR-OF-TASK-PROCESSORS" );
    $sym130$_CSETF_TPOOL_MIN_NBR_OF_TASK_PROCESSORS = makeSymbol( "_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS" );
    $sym131$TPOOL_MAX_NBR_OF_TASK_PROCESSORS = makeSymbol( "TPOOL-MAX-NBR-OF-TASK-PROCESSORS" );
    $sym132$_CSETF_TPOOL_MAX_NBR_OF_TASK_PROCESSORS = makeSymbol( "_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS" );
    $kw133$LOCK = makeKeyword( "LOCK" );
    $kw134$REQUEST_QUEUE = makeKeyword( "REQUEST-QUEUE" );
    $kw135$REQUEST_SEMAPHORE = makeKeyword( "REQUEST-SEMAPHORE" );
    $kw136$PROCESSORS = makeKeyword( "PROCESSORS" );
    $kw137$BACKGROUND_MSGS = makeKeyword( "BACKGROUND-MSGS" );
    $kw138$PROCESS_NAME_PREFIX = makeKeyword( "PROCESS-NAME-PREFIX" );
    $kw139$MIN_NBR_OF_TASK_PROCESSORS = makeKeyword( "MIN-NBR-OF-TASK-PROCESSORS" );
    $kw140$MAX_NBR_OF_TASK_PROCESSORS = makeKeyword( "MAX-NBR-OF-TASK-PROCESSORS" );
    $sym141$MAKE_TASK_PROCESS_POOL = makeSymbol( "MAKE-TASK-PROCESS-POOL" );
    $sym142$VISIT_DEFSTRUCT_OBJECT_TASK_PROCESS_POOL_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TASK-PROCESS-POOL-METHOD" );
    $str143$_request_queue_ = makeString( " request-queue=" );
    $str144$_processors_ = makeString( " processors=" );
    $str145$_process_name_prefix_ = makeString( " process name prefix=" );
    $str146$_min_processors_ = makeString( " min processors=" );
    $str147$_max_processors_ = makeString( " max processors=" );
    $str148$There_are_no_task_processors_ = makeString( "There are no task processors." );
    $str149$_S__ = makeString( "~S~%" );
    $str150$request__S__ = makeString( "request=~S~%" );
    $int151$500 = makeInteger( 500 );
    $sym152$LOCK_P = makeSymbol( "LOCK-P" );
    $sym153$PRIORITY_QUEUE_P = makeSymbol( "PRIORITY-QUEUE-P" );
    $sym154$LISTP = makeSymbol( "LISTP" );
    $sym155$SET_TPOOL_BACKGROUND_MSG_PATH = makeSymbol( "SET-TPOOL-BACKGROUND-MSG-PATH" );
    $sym156$_TPOOL_BACKGROUND_MSG_LOCK_ = makeSymbol( "*TPOOL-BACKGROUND-MSG-LOCK*" );
    $str157$tpool_background_msg_lock = makeString( "tpool-background-msg-lock" );
    $sym158$PUSH_TPOOL_BACKGROUND_MSG = makeSymbol( "PUSH-TPOOL-BACKGROUND-MSG" );
    $str159$_A_is_not_a_valid_file_specificat = makeString( "~A is not a valid file specification, call SET-TPOOL-BACKGROUND-MSG-PATH first." );
    $kw160$DIRECTION = makeKeyword( "DIRECTION" );
    $kw161$OUTPUT = makeKeyword( "OUTPUT" );
    $kw162$IF_DOES_NOT_EXIST = makeKeyword( "IF-DOES-NOT-EXIST" );
    $kw163$CREATE = makeKeyword( "CREATE" );
    $kw164$IF_EXISTS = makeKeyword( "IF-EXISTS" );
    $kw165$OVERWRITE = makeKeyword( "OVERWRITE" );
    $str166$_ = makeString( "[" );
    $str167$_ = makeString( "]" );
    $str168$__ = makeString( "  " );
    $str169$_ = makeString( " " );
    $sym170$FLUSH_TPOOL_BACKGROUND_MSGS = makeSymbol( "FLUSH-TPOOL-BACKGROUND-MSGS" );
    $sym171$START_TASK_PROCESSOR_LOGGING_TO_FILE = makeSymbol( "START-TASK-PROCESSOR-LOGGING-TO-FILE" );
    $sym172$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $sym173$END_TASK_PROCESSOR_LOGGING_TO_FILE = makeSymbol( "END-TASK-PROCESSOR-LOGGING-TO-FILE" );
    $kw174$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym175$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $sym176$SAVE_UNLOGGED_TASK_PROCESSOR_MESSAGES_TO_FILE = makeSymbol( "SAVE-UNLOGGED-TASK-PROCESSOR-MESSAGES-TO-FILE" );
    $str177$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym178$CLET = makeSymbol( "CLET" );
    $sym179$CSETQ = makeSymbol( "CSETQ" );
    $sym180$_EVAL_WITH_BINDINGS_ = makeSymbol( "*EVAL-WITH-BINDINGS*" );
    $sym181$CYC_API_EVAL = makeSymbol( "CYC-API-EVAL" );
    $sym182$EVAL = makeSymbol( "EVAL" );
    $sym183$PROCESSP = makeSymbol( "PROCESSP" );
    $str184$Task_processes_being_worked_on = makeString( "Task processes being worked on" );
    $kw185$ABORT = makeKeyword( "ABORT" );
    $kw186$CANCEL = makeKeyword( "CANCEL" );
    $sym187$TASK_PROCESS_TERMINATION_REASON_P = makeSymbol( "TASK-PROCESS-TERMINATION-REASON-P" );
    $kw188$NEWEST = makeKeyword( "NEWEST" );
    $sym189$SIGNAL_ABORT_ACTIVE_TASK_PROCESS = makeSymbol( "SIGNAL-ABORT-ACTIVE-TASK-PROCESS" );
    $sym190$SIGNAL_CANCEL_ACTIVE_TASK_PROCESS = makeSymbol( "SIGNAL-CANCEL-ACTIVE-TASK-PROCESS" );
    $str191$API_error__Unknown_active_task_pr = makeString( "API error: Unknown active task process termination reason ~A" );
    $kw192$TERMINATE_PREMATURELY = makeKeyword( "TERMINATE-PREMATURELY" );
    $list193 = ConsesLow.list( makeSymbol( "ANS-VAR" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym194$CCATCH = makeSymbol( "CCATCH" );
    $sym195$PROGN = makeSymbol( "PROGN" );
    $sym196$CATCH_TASK_PROCESSOR_TERMINATION = makeSymbol( "CATCH-TASK-PROCESSOR-TERMINATION" );
    $str197$Allow_for_the_API_calling_side_to = makeString(
        "Allow for the API calling side to catch the termination of the task processor.\n   The client must wrap the api-request form with catch-task-processor-termination." );
    $sym198$ANS_VAR = makeUninternedSymbol( "ANS-VAR" );
    $sym199$CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY = makeSymbol( "CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY" );
    $list200 = ConsesLow.list( makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str201$Allow_for_the_API_calling_side_to = makeString(
        "Allow for the API calling side to catch the termination of the task processor\n   without looking at the termination reason.\n   The client must wrap the api-request form with catch-task-processor-termination-quietly." );
    $float202$0_001 = makeDouble( 0.001 );
    $kw203$TASK_PROCESSOR_QUIT = makeKeyword( "TASK-PROCESSOR-QUIT" );
    $str204$Invalid_task_processor = makeString( "Invalid task-processor" );
    $str205$Invalid_task_process_pool = makeString( "Invalid task-process-pool" );
    $str206$Task_Info__S__ = makeString( "Task Info ~S~%" );
    $sym207$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str208$Response__S__ = makeString( "Response ~S~%" );
    $str209$Error_message__S__ = makeString( "Error-message ~S~%" );
    $str210$Posting_partial_results__A_at__A = makeString( "Posting partial results ~A at ~A" );
    $str211$Function_only_valid_from_within_a = makeString( "Function only valid from within a Task Processor, but running inside ~A." );
    $int212$25 = makeInteger( 25 );
    $str213$Task_processor_ = makeString( "Task processor " );
    $str214$Initializing_task_processors__ = makeString( "Initializing task processors~%" );
    $str215$_alock = makeString( "~alock" );
    $str216$task_pool_request_semaphore = makeString( "task-pool-request-semaphore" );
    $str217$_a_s = makeString( "~a~s" );
    $sym218$TASK_PROCESSOR_HANDLER = makeSymbol( "TASK-PROCESSOR-HANDLER" );
    $sym219$TASK_PROCESSOR_QUIT = makeSymbol( "TASK-PROCESSOR-QUIT" );
    $sym220$ENSURE_TASK_PROCESSORS_KILLED = makeSymbol( "ENSURE-TASK-PROCESSORS-KILLED" );
    $str221$_processor_ = makeString( " processor " );
    $str222$_Killing__A___ = makeString( " Killing ~A.~%" );
    $str223$Allocating_a_new_task_processor__ = makeString( "Allocating a new task processor~%" );
    $str224$Awakening_first_available_task_pr = makeString( "Awakening first available task processor~%" );
    $str225$Task_processors_are_not_initializ = makeString( "Task processors are not initialized." );
    $str226$__Error__cannot_queue_task_reques = makeString( "~%Error: cannot queue task request for ~%~S~%" );
    $sym227$WITH_LONG_RUNNING_TASK_PROCESS = makeSymbol( "WITH-LONG-RUNNING-TASK-PROCESS" );
    $list228 = ConsesLow.list( ConsesLow.list( makeSymbol( "POOL" ), ConsesLow.list( makeSymbol( "GET-TASK-PROCESS-POOL-FOR-PROCESS" ), ConsesLow.list( makeSymbol( "CURRENT-PROCESS" ) ) ) ), ConsesLow.list( makeSymbol(
        "POOL-LOCK" ), ConsesLow.list( makeSymbol( "GET-TPOOL-LOCK" ), makeSymbol( "POOL" ) ) ), makeSymbol( "UPDATED-SUCCESSFULLY?" ) );
    $sym229$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $list230 = ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol( "POOL-LOCK" ), makeKeyword( "WHOSTATE" ), makeString( "Upping maximum on process pool ...." ) ), ConsesLow.list( makeSymbol(
        "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CURR-MAX" ), ConsesLow.list( makeSymbol( "GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS" ), makeSymbol( "POOL" ) ) ) ), ConsesLow.list( makeSymbol(
            "SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS" ), makeSymbol( "POOL" ), ConsesLow.list( makeSymbol( "+" ), makeSymbol( "CURR-MAX" ), ONE_INTEGER ) ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol(
                "UPDATED-SUCCESSFULLY?" ), T ) ) );
    $list231 = ConsesLow.list( ConsesLow.list( makeSymbol( "PWHEN" ), makeSymbol( "UPDATED-SUCCESSFULLY?" ), ConsesLow.list( makeSymbol( "WITH-LOCK-HELD" ), ConsesLow.list( makeSymbol( "POOL-LOCK" ), makeKeyword(
        "WHOSTATE" ), makeString( "Reverting maximum on process pool ...." ) ), ConsesLow.list( makeSymbol( "CLET" ), ConsesLow.list( ConsesLow.list( makeSymbol( "CURR-MAX" ), ConsesLow.list( makeSymbol(
            "GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS" ), makeSymbol( "POOL" ) ) ) ), ConsesLow.list( makeSymbol( "SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS" ), makeSymbol( "POOL" ), ConsesLow.list( ONE_INTEGER, makeSymbol(
                "CURR-MAX" ), ONE_INTEGER ) ) ) ) ) );
    $list232 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "MIN-NBR-OF-TASK-PROCESSORS" ), makeSymbol( "MAX-NBR-OF-TASK-PROCESSORS" ) );
    $str233$_ = makeString( "*" );
    $str234$_TASK_PROCESS_POOL_ = makeString( "-TASK-PROCESS-POOL*" );
    $str235$_TASK_PROCESS_POOL_LOCK_ = makeString( "-TASK-PROCESS-POOL-LOCK*" );
    $sym236$DEFLEXICAL_PUBLIC = makeSymbol( "DEFLEXICAL-PUBLIC" );
    $list237 = ConsesLow.list( NIL, makeString( "Task process pool for requests." ) );
    $sym238$DEFCONSTANT_PUBLIC = makeSymbol( "DEFCONSTANT-PUBLIC" );
    $list239 = ConsesLow.list( ConsesLow.list( makeSymbol( "MAKE-LOCK" ), makeString( "task processor initialization lock" ) ), makeString(
        "Task process pool lock to guarantee only a single instance is initialized." ) );
    $sym240$DEFINE_PUBLIC = makeSymbol( "DEFINE-PUBLIC" );
    $str241$_TASK_PROCESSORS_INITIALIZED_P = makeString( "-TASK-PROCESSORS-INITIALIZED-P" );
    $str242$Return_T_when_there_are_task_proc = makeString( "Return T when there are task processors." );
    $sym243$RET = makeSymbol( "RET" );
    $sym244$TASK_PROCESSORS_INITIALIZED_P = makeSymbol( "TASK-PROCESSORS-INITIALIZED-P" );
    $str245$INITIALIZE_ = makeString( "INITIALIZE-" );
    $str246$_TASK_PROCESSORS = makeString( "-TASK-PROCESSORS" );
    $str247$Initialize_the_task_processor_poo = makeString( "Initialize the task processor pool for requests." );
    $sym248$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym249$PWHEN = makeSymbol( "PWHEN" );
    $list250 = ConsesLow.list( ConsesLow.list( makeSymbol( "ERROR" ), makeString( "Illegal attempt to reinitialize processor pool without first halting it." ) ) );
    $sym251$INITIALIZE_TASK_PROCESSORS = makeSymbol( "INITIALIZE-TASK-PROCESSORS" );
    $sym252$CCONCATENATE = makeSymbol( "CCONCATENATE" );
    $list253 = ConsesLow.list( makeString( " processor " ) );
    $list254 = ConsesLow.list( ConsesLow.list( makeSymbol( "RET" ), NIL ) );
    $str255$HALT_ = makeString( "HALT-" );
    $str256$Halt_the_task_processors_ = makeString( "Halt the task processors." );
    $sym257$HALT_TASK_PROCESSORS = makeSymbol( "HALT-TASK-PROCESSORS" );
    $list258 = ConsesLow.list( makeSymbol( "FLUSH-TPOOL-BACKGROUND-MSGS" ) );
    $list259 = ConsesLow.list( NIL );
    $str260$RESTART_ = makeString( "RESTART-" );
    $str261$Restart__halt___initialize__the_t = makeString( "Restart (halt + initialize) the task processors." );
    $str262$SHOW_ = makeString( "SHOW-" );
    $str263$_TP_MSGS = makeString( "-TP-MSGS" );
    $str264$Show_and_reset_the_task_processor = makeString( "Show and reset the task processor background messages for the\n          task-process-pool." );
    $sym265$SHOW_TP_MSGS = makeSymbol( "SHOW-TP-MSGS" );
    $list266 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "EVAL-FN" ), makeSymbol( "ARGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str267$_TASK_PROCESSOR_REQUEST = makeString( "-TASK-PROCESSOR-REQUEST" );
    $list268 = ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "*TASK-PROCESSOR-EVAL-FN-DICT*" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*TASK-PROCESSOR-EVAL-FN-DICT*" ), ConsesLow.list( makeSymbol(
        "NEW-DICTIONARY" ) ) ) );
    $sym269$DICTIONARY_ENTER = makeSymbol( "DICTIONARY-ENTER" );
    $sym270$_TASK_PROCESSOR_EVAL_FN_DICT_ = makeSymbol( "*TASK-PROCESSOR-EVAL-FN-DICT*" );
    $list271 = ConsesLow.list( makeSymbol( "TYPE" ), makeSymbol( "ARGS" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $str272$DISPATCH_ = makeString( "DISPATCH-" );
    $str273$_TASK_PROCESSOR_RESPONSE = makeString( "-TASK-PROCESSOR-RESPONSE" );
    $list274 = ConsesLow.list( makeSymbol( "PUNLESS" ), makeSymbol( "*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*" ), ConsesLow.list( makeSymbol( "CSETQ" ), makeSymbol( "*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*" ),
        ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ) ) ) );
    $sym275$_TASK_PROCESSOR_RESPONSE_DISPATCH_FN_DICT_ = makeSymbol( "*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*" );
    $sym276$FUNCTION = makeSymbol( "FUNCTION" );
    $str277$task_processor_initialization_loc = makeString( "task processor initialization lock" );
    $str278$Illegal_attempt_to_reinitialize_p = makeString( "Illegal attempt to reinitialize processor pool without first halting it." );
    $str279$API = makeString( "API" );
    $sym280$SHOW_API_TASK_PROCESSORS = makeSymbol( "SHOW-API-TASK-PROCESSORS" );
    $str281$Provides_a_convenient_alias_for_D = makeString( "Provides a convenient alias for DISPLAY-API-TASK-PROCESSORS." );
    $sym282$DISPLAY_API_TASK_PROCESSORS = makeSymbol( "DISPLAY-API-TASK-PROCESSORS" );
    $str283$ = makeString( "" );
    $sym284$INITIALIZE_API_TASK_PROCESSORS = makeSymbol( "INITIALIZE-API-TASK-PROCESSORS" );
    $sym285$HALT_API_TASK_PROCESSORS = makeSymbol( "HALT-API-TASK-PROCESSORS" );
    $sym286$RESTART_API_TASK_PROCESSORS = makeSymbol( "RESTART-API-TASK-PROCESSORS" );
    $sym287$SHOW_API_TP_MSGS = makeSymbol( "SHOW-API-TP-MSGS" );
    $sym288$API_TASK_PROCESSOR_REQUEST = makeSymbol( "API-TASK-PROCESSOR-REQUEST" );
    $sym289$WITH_IMMEDIATE_EXECUTION = makeSymbol( "WITH-IMMEDIATE-EXECUTION" );
    $kw290$API = makeKeyword( "API" );
    $sym291$SET_JAVA_API_LEASE_ACTIVITY_DISPLAY = makeSymbol( "SET-JAVA-API-LEASE-ACTIVITY-DISPLAY" );
    $str292$Dispatching_api_response__S__ = makeString( "Dispatching api response ~S~%" );
    $sym293$TASK_PROCESSOR_RESPONSE = makeSymbol( "TASK-PROCESSOR-RESPONSE" );
    $str294$Sending_api_response__S_to_socket = makeString( "Sending api response ~S to socket ~S~% identified by ~A~%" );
    $str295$Dropping_api_response__S__socket_ = makeString( "Dropping api response ~S, socket ~S~% identified by ~A is not available~%" );
    $sym296$DISPATCH_API_TASK_PROCESSOR_RESPONSE = makeSymbol( "DISPATCH-API-TASK-PROCESSOR-RESPONSE" );
    $sym297$INTERMEDIATE_RESULTS_ACCUMULATOR_RESET = makeSymbol( "INTERMEDIATE-RESULTS-ACCUMULATOR-RESET" );
    $sym298$INTERMEDIATE_RESULTS_ACCUMULATOR_ADD = makeSymbol( "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD" );
    $sym299$INTERMEDIATE_RESULTS_ACCUMULATOR_SIZE = makeSymbol( "INTERMEDIATE-RESULTS-ACCUMULATOR-SIZE" );
    $sym300$INTERMEDIATE_RESULTS_ACCUMULATOR_CONTENTS = makeSymbol( "INTERMEDIATE-RESULTS-ACCUMULATOR-CONTENTS" );
    $sym301$INTERMEDIATE_RESULTS_ACCUMULATOR_ITERATOR = makeSymbol( "INTERMEDIATE-RESULTS-ACCUMULATOR-ITERATOR" );
    $sym302$INTERMEDIATE_RESULTS_ACCUMULATOR_ADD_ALL = makeSymbol( "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD-ALL" );
    $str303$Cannot_invoke_intermediate_result = makeString( "Cannot invoke intermediate results accumulator outside of a task processor.~%" );
    $str304$BG = makeString( "BG" );
    $kw305$BG = makeKeyword( "BG" );
    $str306$dispatching_bg_response__S__ = makeString( "dispatching bg response ~S~%" );
    $str307$bg_response_dictionary__S__ = makeString( "bg response dictionary ~S~%" );
    $sym308$DISPATCH_BG_TASK_PROCESSOR_RESPONSE = makeSymbol( "DISPATCH-BG-TASK-PROCESSOR-RESPONSE" );
    $str309$CONSOLE = makeString( "CONSOLE" );
    $sym310$_TASK_PROCESSOR_CONSOLE_ID_ = makeSymbol( "*TASK-PROCESSOR-CONSOLE-ID*" );
    $kw311$CONSOLE = makeKeyword( "CONSOLE" );
    $str312$dispatching_console_response__S__ = makeString( "dispatching console response ~S~%" );
    $str313$_A___A__ = makeString( "~A  ~A~%" );
    $sym314$DISPATCH_CONSOLE_TASK_PROCESSOR_RESPONSE = makeSymbol( "DISPATCH-CONSOLE-TASK-PROCESSOR-RESPONSE" );
    $str315$Task_Processor_Module_Supercatego = makeString( "Task-Processor Module Supercategory" );
    $str316$Task_Processor_Subcategory = makeString( "Task Processor Subcategory" );
    $str317$Task_Processor_Testing_Suite = makeString( "Task-Processor Testing Suite" );
  }

  public static final class $task_info_native
      extends
        SubLStructNative
  {
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

    public $task_info_native()
    {
      this.$type = CommonSymbols.NIL;
      this.$id = CommonSymbols.NIL;
      this.$priority = CommonSymbols.NIL;
      this.$requestor = CommonSymbols.NIL;
      this.$giveback_info = CommonSymbols.NIL;
      this.$bindings = CommonSymbols.NIL;
      this.$request = CommonSymbols.NIL;
      this.$response = CommonSymbols.NIL;
      this.$error_message = CommonSymbols.NIL;
      this.$task_processor_name = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $task_info_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$type;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$priority;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$requestor;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$giveback_info;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$bindings;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$request;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$response;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$error_message;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$task_processor_name;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$type = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$priority = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$requestor = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$giveback_info = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$bindings = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$request = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$response = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$error_message = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$task_processor_name = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $task_info_native.class, $sym3$TASK_INFO, $sym4$TASK_INFO_P, $list5, $list6, new String[] { "$type", "$id", "$priority", "$requestor", "$giveback_info", "$bindings",
        "$request", "$response", "$error_message", "$task_processor_name"
      }, $list7, $list8, $sym9$PRINT_TASK_INFO );
    }
  }

  public static final class $task_info_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $task_info_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TASK-INFO-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return task_info_p( arg1 );
    }
  }

  public static final class $task_result_set_native
      extends
        SubLStructNative
  {
    public SubLObject $result;
    public SubLObject $task_info;
    public SubLObject $finished;
    private static final SubLStructDeclNative structDecl;

    public $task_result_set_native()
    {
      this.$result = CommonSymbols.NIL;
      this.$task_info = CommonSymbols.NIL;
      this.$finished = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $task_result_set_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$result;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$task_info;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$finished;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$result = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$task_info = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$finished = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $task_result_set_native.class, $sym60$TASK_RESULT_SET, $sym61$TASK_RESULT_SET_P, $list62, $list63, new String[] { "$result", "$task_info", "$finished"
      }, $list64, $list65, $sym66$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $task_result_set_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $task_result_set_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TASK-RESULT-SET-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return task_result_set_p( arg1 );
    }
  }

  public static final class $task_processor_native
      extends
        SubLStructNative
  {
    public SubLObject $name;
    public SubLObject $process;
    public SubLObject $busy_p;
    public SubLObject $task_info;
    private static final SubLStructDeclNative structDecl;

    public $task_processor_native()
    {
      this.$name = CommonSymbols.NIL;
      this.$process = CommonSymbols.NIL;
      this.$busy_p = CommonSymbols.NIL;
      this.$task_info = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $task_processor_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$process;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$busy_p;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$task_info;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$process = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$busy_p = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$task_info = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $task_processor_native.class, $sym81$TASK_PROCESSOR, $sym82$TASK_PROCESSOR_P, $list83, $list84, new String[] { "$name", "$process", "$busy_p", "$task_info"
      }, $list85, $list86, $sym87$PRINT_TASK_PROCESSOR );
    }
  }

  public static final class $task_processor_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $task_processor_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TASK-PROCESSOR-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return task_processor_p( arg1 );
    }
  }

  public static final class $task_process_pool_native
      extends
        SubLStructNative
  {
    public SubLObject $lock;
    public SubLObject $request_queue;
    public SubLObject $request_semaphore;
    public SubLObject $processors;
    public SubLObject $background_msgs;
    public SubLObject $process_name_prefix;
    public SubLObject $min_nbr_of_task_processors;
    public SubLObject $max_nbr_of_task_processors;
    private static final SubLStructDeclNative structDecl;

    public $task_process_pool_native()
    {
      this.$lock = CommonSymbols.NIL;
      this.$request_queue = CommonSymbols.NIL;
      this.$request_semaphore = CommonSymbols.NIL;
      this.$processors = CommonSymbols.NIL;
      this.$background_msgs = CommonSymbols.NIL;
      this.$process_name_prefix = CommonSymbols.NIL;
      this.$min_nbr_of_task_processors = CommonSymbols.NIL;
      this.$max_nbr_of_task_processors = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $task_process_pool_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$request_queue;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$request_semaphore;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$processors;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$background_msgs;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$process_name_prefix;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$min_nbr_of_task_processors;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$max_nbr_of_task_processors;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$request_queue = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$request_semaphore = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$processors = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$background_msgs = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$process_name_prefix = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$min_nbr_of_task_processors = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$max_nbr_of_task_processors = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $task_process_pool_native.class, $sym108$TASK_PROCESS_POOL, $sym109$TASK_PROCESS_POOL_P, $list110, $list111, new String[] { "$lock", "$request_queue",
        "$request_semaphore", "$processors", "$background_msgs", "$process_name_prefix", "$min_nbr_of_task_processors", "$max_nbr_of_task_processors"
      }, $list112, $list113, $sym114$PRINT_TASK_PROCESS_POOL );
    }
  }

  public static final class $task_process_pool_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $task_process_pool_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TASK-PROCESS-POOL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return task_process_pool_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1053 ms synthetic
 */