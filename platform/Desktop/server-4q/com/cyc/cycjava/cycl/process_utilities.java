package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class process_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.process_utilities";
  public static final String myFingerPrint = "d3206b44315b136b7d7dbc574558119d5f11dd2855d9e370b7805476b13a7fa7";
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 4160L)
  private static SubLSymbol $active_processes_at_startup$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 4759L)
  private static SubLSymbol $process_form_map$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 4969L)
  private static SubLSymbol $process_form_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
  public static SubLSymbol $dtp_task$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLSymbol $dtp_thinking_task$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14655L)
  private static SubLSymbol $thinking_task$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLSymbol $dtp_ipc_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 19299L)
  private static SubLSymbol $ipcq_debugP$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 23818L)
  private static SubLSymbol $ipcq_test_items$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLSymbol $dtp_ordered_ipc_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 27063L)
  private static SubLSymbol $ordered_ipcq_empty$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 30649L)
  private static SubLSymbol $ordered_ipc_current_queue_size_estimation_threshold$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLSymbol $dtp_process_wrapper$;
  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36985L)
  private static SubLSymbol $process_wrapper_isg$;
  private static final SubLSymbol $sym0$INTERRUPT_INITIAL_PROCESS;
  private static final SubLList $list1;
  private static final SubLString $str2$Idle;
  private static final SubLString $str3$Sleep;
  private static final SubLString $str4$wait;
  private static final SubLString $str5$blocked;
  private static final SubLString $str6$run;
  private static final SubLSymbol $sym7$PROCESSP;
  private static final SubLSymbol $sym8$INTEGERP;
  private static final SubLSymbol $sym9$PROCESS_NAME;
  private static final SubLSymbol $sym10$_ACTIVE_PROCESSES_AT_STARTUP_;
  private static final SubLSymbol $sym11$_PROCESS_FORM_MAP_;
  private static final SubLString $str12$Process_Form;
  private static final SubLSymbol $sym13$TASK;
  private static final SubLSymbol $sym14$TASK_P;
  private static final SubLList $list15;
  private static final SubLList $list16;
  private static final SubLList $list17;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$DEFAULT_STRUCT_PRINT_FUNCTION;
  private static final SubLSymbol $sym20$TASK_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list21;
  private static final SubLSymbol $sym22$TASK_PROCESS;
  private static final SubLSymbol $sym23$_CSETF_TASK_PROCESS;
  private static final SubLSymbol $sym24$TASK_COMPLETED;
  private static final SubLSymbol $sym25$_CSETF_TASK_COMPLETED;
  private static final SubLSymbol $kw26$PROCESS;
  private static final SubLSymbol $kw27$COMPLETED;
  private static final SubLString $str28$Invalid_slot__S_for_construction_;
  private static final SubLSymbol $kw29$BEGIN;
  private static final SubLSymbol $sym30$MAKE_TASK;
  private static final SubLSymbol $kw31$SLOT;
  private static final SubLSymbol $kw32$END;
  private static final SubLSymbol $sym33$VISIT_DEFSTRUCT_OBJECT_TASK_METHOD;
  private static final SubLSymbol $sym34$SYMBOL_NAME;
  private static final SubLSymbol $sym35$CAR;
  private static final SubLSymbol $sym36$CADR;
  private static final SubLSymbol $sym37$NEW_TASK_INTERNAL;
  private static final SubLSymbol $sym38$FIND_SYMBOL;
  private static final SubLSymbol $sym39$THINKING_TASK;
  private static final SubLSymbol $sym40$THINKING_TASK_P;
  private static final SubLList $list41;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLSymbol $sym45$THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$T_TASK_LOCK;
  private static final SubLSymbol $sym48$_CSETF_T_TASK_LOCK;
  private static final SubLSymbol $sym49$T_TASK_THREAD;
  private static final SubLSymbol $sym50$_CSETF_T_TASK_THREAD;
  private static final SubLSymbol $sym51$T_TASK_NAME;
  private static final SubLSymbol $sym52$_CSETF_T_TASK_NAME;
  private static final SubLSymbol $sym53$T_TASK_STATUS;
  private static final SubLSymbol $sym54$_CSETF_T_TASK_STATUS;
  private static final SubLSymbol $sym55$T_TASK_PROGRESS_MESSAGE;
  private static final SubLSymbol $sym56$_CSETF_T_TASK_PROGRESS_MESSAGE;
  private static final SubLSymbol $sym57$T_TASK_PROGRESS_SOFAR;
  private static final SubLSymbol $sym58$_CSETF_T_TASK_PROGRESS_SOFAR;
  private static final SubLSymbol $sym59$T_TASK_PROGRESS_TOTAL;
  private static final SubLSymbol $sym60$_CSETF_T_TASK_PROGRESS_TOTAL;
  private static final SubLSymbol $sym61$T_TASK_START_TIME;
  private static final SubLSymbol $sym62$_CSETF_T_TASK_START_TIME;
  private static final SubLSymbol $sym63$T_TASK_FINISH_TIME;
  private static final SubLSymbol $sym64$_CSETF_T_TASK_FINISH_TIME;
  private static final SubLSymbol $sym65$T_TASK_RESULT;
  private static final SubLSymbol $sym66$_CSETF_T_TASK_RESULT;
  private static final SubLSymbol $sym67$T_TASK_ERROR_MESSAGE;
  private static final SubLSymbol $sym68$_CSETF_T_TASK_ERROR_MESSAGE;
  private static final SubLSymbol $sym69$T_TASK_PROPERTIES;
  private static final SubLSymbol $sym70$_CSETF_T_TASK_PROPERTIES;
  private static final SubLSymbol $kw71$LOCK;
  private static final SubLSymbol $kw72$THREAD;
  private static final SubLSymbol $kw73$NAME;
  private static final SubLSymbol $kw74$STATUS;
  private static final SubLSymbol $kw75$PROGRESS_MESSAGE;
  private static final SubLSymbol $kw76$PROGRESS_SOFAR;
  private static final SubLSymbol $kw77$PROGRESS_TOTAL;
  private static final SubLSymbol $kw78$START_TIME;
  private static final SubLSymbol $kw79$FINISH_TIME;
  private static final SubLSymbol $kw80$RESULT;
  private static final SubLSymbol $kw81$ERROR_MESSAGE;
  private static final SubLSymbol $kw82$PROPERTIES;
  private static final SubLSymbol $sym83$MAKE_THINKING_TASK;
  private static final SubLSymbol $sym84$VISIT_DEFSTRUCT_OBJECT_THINKING_TASK_METHOD;
  private static final SubLSymbol $sym85$STRINGP;
  private static final SubLSymbol $sym86$PROPERTY_LIST_P;
  private static final SubLSymbol $kw87$NONE;
  private static final SubLList $list88;
  private static final SubLSymbol $sym89$LOCK;
  private static final SubLSymbol $sym90$CLET;
  private static final SubLSymbol $sym91$THINKING_LOCK;
  private static final SubLSymbol $sym92$WITH_LOCK_HELD;
  private static final SubLSymbol $sym93$KEYWORDP;
  private static final SubLSymbol $sym94$UNIVERSAL_TIME_P;
  private static final SubLSymbol $sym95$FUNCTION_SPEC_P;
  private static final SubLSymbol $sym96$LISTP;
  private static final SubLSymbol $sym97$THINKING_THREAD_RUN;
  private static final SubLSymbol $kw98$STARTED;
  private static final SubLSymbol $kw99$STOPPED;
  private static final SubLString $str100$CYC;
  private static final SubLSymbol $sym101$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLSymbol $kw102$RUNNING;
  private static final SubLString $str103$Function__A_in_thread__A_terminat;
  private static final SubLSymbol $kw104$ERROR;
  private static final SubLSymbol $kw105$FINISHED;
  private static final SubLSymbol $sym106$IPC_QUEUE;
  private static final SubLSymbol $sym107$IPC_QUEUE_P;
  private static final SubLList $list108;
  private static final SubLList $list109;
  private static final SubLList $list110;
  private static final SubLList $list111;
  private static final SubLSymbol $sym112$IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list113;
  private static final SubLSymbol $sym114$IPC_QUEUE_LOCK;
  private static final SubLSymbol $sym115$_CSETF_IPC_QUEUE_LOCK;
  private static final SubLSymbol $sym116$IPC_QUEUE_SEMAPHORE;
  private static final SubLSymbol $sym117$_CSETF_IPC_QUEUE_SEMAPHORE;
  private static final SubLSymbol $sym118$IPC_QUEUE_DATA_QUEUE;
  private static final SubLSymbol $sym119$_CSETF_IPC_QUEUE_DATA_QUEUE;
  private static final SubLSymbol $kw120$SEMAPHORE;
  private static final SubLSymbol $kw121$DATA_QUEUE;
  private static final SubLSymbol $sym122$MAKE_IPC_QUEUE;
  private static final SubLSymbol $sym123$VISIT_DEFSTRUCT_OBJECT_IPC_QUEUE_METHOD;
  private static final SubLString $str124$Lock_for_Queue_;
  private static final SubLString $str125$Waiting_to_enqueue__A;
  private static final SubLString $str126$Enqueuing__A;
  private static final SubLString $str127$Enqueued__A;
  private static final SubLString $str128$Queue_size___S;
  private static final SubLString $str129$Waiting_for_dequeue_semaphore_;
  private static final SubLString $str130$Waiting_for_Queue_lock_to_dequeue;
  private static final SubLString $str131$Dequeued__A;
  private static final SubLString $str132$Unknown_error_;
  private static final SubLSymbol $sym133$_EXIT;
  private static final SubLString $str134$____D___A___A___Q___D_S___D__;
  private static final SubLString $str135$We_are_out_of_sync_on_either_the_;
  private static final SubLString $str136$____D___A___A____A__;
  private static final SubLInteger $int137$100;
  private static final SubLSymbol $sym138$NON_NEGATIVE_INTEGER_P;
  private static final SubLString $str139$Dequeueing__up_to___D_item__P_;
  private static final SubLFloat $float140$0_01;
  private static final SubLList $list141;
  private static final SubLString $str142$IPCQ_Test_Producer;
  private static final SubLSymbol $sym143$IPCQ_TEST_PRODUCER_RUN;
  private static final SubLString $str144$Test_IPC_Queue;
  private static final SubLString $str145$Expected__S__got__S;
  private static final SubLSymbol $sym146$TEST_IPC_ENQUEUE_DEQUEUE;
  private static final SubLSymbol $kw147$TEST;
  private static final SubLSymbol $kw148$OWNER;
  private static final SubLSymbol $kw149$CLASSES;
  private static final SubLList $list150;
  private static final SubLSymbol $kw151$KB;
  private static final SubLSymbol $kw152$TINY;
  private static final SubLSymbol $kw153$WORKING_;
  private static final SubLList $list154;
  private static final SubLSymbol $sym155$TEST_IPC_ENQUEUE_DRAIN;
  private static final SubLSymbol $sym156$TEST_IPC_ENQUEUE_DRAIN_DEQUEUE;
  private static final SubLSymbol $sym157$ORDERED_IPC_QUEUE;
  private static final SubLSymbol $sym158$ORDERED_IPC_QUEUE_P;
  private static final SubLList $list159;
  private static final SubLList $list160;
  private static final SubLList $list161;
  private static final SubLList $list162;
  private static final SubLSymbol $sym163$ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list164;
  private static final SubLSymbol $sym165$ORDRD_IPCQ_LOCK;
  private static final SubLSymbol $sym166$_CSETF_ORDRD_IPCQ_LOCK;
  private static final SubLSymbol $sym167$ORDRD_IPCQ_PRODUCER_ISG;
  private static final SubLSymbol $sym168$_CSETF_ORDRD_IPCQ_PRODUCER_ISG;
  private static final SubLSymbol $sym169$ORDRD_IPCQ_CONSUMER_ISG;
  private static final SubLSymbol $sym170$_CSETF_ORDRD_IPCQ_CONSUMER_ISG;
  private static final SubLSymbol $sym171$ORDRD_IPCQ_PAYLOAD;
  private static final SubLSymbol $sym172$_CSETF_ORDRD_IPCQ_PAYLOAD;
  private static final SubLSymbol $sym173$ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE;
  private static final SubLSymbol $sym174$_CSETF_ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE;
  private static final SubLSymbol $kw175$PRODUCER_ISG;
  private static final SubLSymbol $kw176$CONSUMER_ISG;
  private static final SubLSymbol $kw177$PAYLOAD;
  private static final SubLSymbol $kw178$EARLY_CONSUMER_SEMAPHORE;
  private static final SubLSymbol $sym179$MAKE_ORDERED_IPC_QUEUE;
  private static final SubLSymbol $sym180$VISIT_DEFSTRUCT_OBJECT_ORDERED_IPC_QUEUE_METHOD;
  private static final SubLString $str181$empty_ordered_IPC_queue_entry;
  private static final SubLString $str182$Lock_for_Ordered_IPC_Queue_;
  private static final SubLString $str183$Ordered_IPCQ_Early_Producer;
  private static final SubLString $str184$Unexpected_entry__A_in_the_payloa;
  private static final SubLInteger $int185$212;
  private static final SubLSymbol $sym186$KILL_PROCESS_NAMED;
  private static final SubLList $list187;
  private static final SubLString $str188$_param_NAME__stringp____Kills_any;
  private static final SubLList $list189;
  private static final SubLList $list190;
  private static final SubLSymbol $sym191$PROCESS_EXHAUST_IMMEDIATELY_FN;
  private static final SubLSymbol $sym192$VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD;
  private static final SubLSymbol $sym193$MAKE_EXHAUSTED_PROCESS;
  private static final SubLSymbol $sym194$VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD;
  private static final SubLSymbol $sym195$MAKE_LOCK;
  private static final SubLSymbol $sym196$PROCESS_WRAPPER;
  private static final SubLSymbol $sym197$PROCESS_WRAPPER_P;
  private static final SubLList $list198;
  private static final SubLList $list199;
  private static final SubLList $list200;
  private static final SubLList $list201;
  private static final SubLSymbol $sym202$PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE;
  private static final SubLList $list203;
  private static final SubLSymbol $sym204$PROCESS_WRAPPER_ID;
  private static final SubLSymbol $sym205$_CSETF_PROCESS_WRAPPER_ID;
  private static final SubLSymbol $sym206$PROCESS_WRAPPER_PROCESS;
  private static final SubLSymbol $sym207$_CSETF_PROCESS_WRAPPER_PROCESS;
  private static final SubLSymbol $sym208$PROCESS_WRAPPER_STATE;
  private static final SubLSymbol $sym209$_CSETF_PROCESS_WRAPPER_STATE;
  private static final SubLSymbol $sym210$PROCESS_WRAPPER_LOCK;
  private static final SubLSymbol $sym211$_CSETF_PROCESS_WRAPPER_LOCK;
  private static final SubLSymbol $sym212$PROCESS_WRAPPER_PLIST;
  private static final SubLSymbol $sym213$_CSETF_PROCESS_WRAPPER_PLIST;
  private static final SubLSymbol $kw214$ID;
  private static final SubLSymbol $kw215$STATE;
  private static final SubLSymbol $kw216$PLIST;
  private static final SubLSymbol $sym217$MAKE_PROCESS_WRAPPER;
  private static final SubLSymbol $sym218$VISIT_DEFSTRUCT_OBJECT_PROCESS_WRAPPER_METHOD;
  private static final SubLSymbol $sym219$_PROCESS_WRAPPER_ISG_;
  private static final SubLSymbol $kw220$STARTING;
  private static final SubLSymbol $sym221$NEW_PROCESS_WRAPPER_INT;
  private static final SubLSymbol $kw222$ABORTED;
  private static final SubLSymbol $kw223$PAUSING;
  private static final SubLSymbol $kw224$PAUSED;
  private static final SubLSymbol $sym225$CYC_SERVER_PROCESS_FUNCALL;
  private static final SubLSymbol $sym226$DOUBLE_FLOAT;
  private static final SubLSymbol $sym227$CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS;
  private static final SubLList $list228;
  static boolean assertionsDisabledSynth = true;

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 1147L)
  public static SubLObject debug_initial_process()
  {
    final SubLObject initial_process = subl_promotions.initial_process();
    if( NIL != Threads.valid_process_p( initial_process ) )
    {
      return Threads.debug_process( initial_process );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 1365L)
  public static SubLObject interrupt_initial_process()
  {
    return debug_initial_process();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 1485L)
  public static SubLObject process_idleP(final SubLObject process)
  {
    final SubLObject state = Threads.process_whostate( process );
    return makeBoolean( NIL != string_utilities.starts_with( state, $str2$Idle ) || NIL != string_utilities.starts_with( state, $str3$Sleep ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 2019L)
  public static SubLObject process_busyP(final SubLObject process)
  {
    return makeBoolean( NIL != process_runningP( process ) || NIL != process_waitingP( process ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 2239L)
  public static SubLObject process_waitingP(final SubLObject process)
  {
    final SubLObject state = Threads.process_whostate( process );
    return makeBoolean( Sequences.search( $str4$wait, state, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ).isFixnum() || Sequences.search( $str5$blocked, state, EQUALP, UNPROVIDED, UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ).isFixnum() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 2654L)
  public static SubLObject process_runningP(final SubLObject process)
  {
    final SubLObject state = Threads.process_whostate( process );
    return Sequences.search( $str6$run, state, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 3000L)
  public static SubLObject process_suid(final SubLObject process)
  {
    assert NIL != Types.processp( process ) : process;
    SubLObject suid = NIL;
    suid = Equality.pointer( process );
    return suid;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 3457L)
  public static SubLObject find_process_by_suid(final SubLObject suid)
  {
    assert NIL != Types.integerp( suid ) : suid;
    SubLObject result = NIL;
    if( NIL == result )
    {
      SubLObject csome_list_var = Threads.all_processes();
      SubLObject process = NIL;
      process = csome_list_var.first();
      while ( NIL == result && NIL != csome_list_var)
      {
        if( suid.numE( process_suid( process ) ) )
        {
          result = process;
        }
        csome_list_var = csome_list_var.rest();
        process = csome_list_var.first();
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 3756L)
  public static SubLObject find_process_by_name(final SubLObject name, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    return Sequences.find( name, Threads.all_processes(), test, Symbols.symbol_function( $sym9$PROCESS_NAME ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 3955L)
  public static SubLObject gather_processes_by_name(final SubLObject name, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUAL );
    }
    return list_utilities.gather_all( name, Threads.all_processes(), test, Symbols.symbol_function( $sym9$PROCESS_NAME ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 4309L)
  public static SubLObject active_process_at_startupP(final SubLObject v_object)
  {
    return makeBoolean( NIL != Types.processp( v_object ) && NIL != list_utilities.member_eqP( v_object, $active_processes_at_startup$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 4516L)
  public static SubLObject note_active_processes_at_startup()
  {
    $active_processes_at_startup$.setGlobalValue( conses_high.copy_list( Threads.all_processes() ) );
    return Sequences.length( $active_processes_at_startup$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 5037L)
  public static SubLObject process_form(final SubLObject process)
  {
    assert NIL != Types.processp( process ) : process;
    if( NIL != Threads.valid_process_p( process ) )
    {
      return Hashtables.gethash_without_values( process, $process_form_map$.getGlobalValue(), NIL );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 5311L)
  public static SubLObject process_note_form(final SubLObject process, final SubLObject form)
  {
    assert NIL != Types.processp( process ) : process;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $process_form_lock$.getGlobalValue() );
      if( NIL != form )
      {
        Hashtables.sethash( process, $process_form_map$.getGlobalValue(), form );
      }
      else
      {
        Hashtables.remhash( process, $process_form_map$.getGlobalValue() );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $process_form_lock$.getGlobalValue() );
      }
    }
    return process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 5590L)
  public static SubLObject current_process_note_form(final SubLObject form)
  {
    return process_note_form( Threads.current_process(), form );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 5745L)
  public static SubLObject current_process_clear_form()
  {
    if( random.random( TWENTY_INTEGER ).isZero() )
    {
      clear_invalid_process_forms();
    }
    return current_process_note_form( NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 5967L)
  public static SubLObject clear_invalid_process_forms()
  {
    SubLObject invalid_processes = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $process_form_lock$.getGlobalValue() );
      SubLObject process = NIL;
      SubLObject no_value = NIL;
      final Iterator cdohash_iterator = Hashtables.getEntrySetIterator( $process_form_map$.getGlobalValue() );
      try
      {
        while ( Hashtables.iteratorHasNext( cdohash_iterator ))
        {
          final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry( cdohash_iterator );
          process = Hashtables.getEntryKey( cdohash_entry );
          no_value = Hashtables.getEntryValue( cdohash_entry );
          if( NIL == Threads.valid_process_p( process ) )
          {
            invalid_processes = ConsesLow.cons( process, invalid_processes );
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( cdohash_iterator );
      }
      SubLObject cdolist_list_var = invalid_processes;
      SubLObject invalid_process = NIL;
      invalid_process = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        Hashtables.remhash( invalid_process, $process_form_map$.getGlobalValue() );
        cdolist_list_var = cdolist_list_var.rest();
        invalid_process = cdolist_list_var.first();
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $process_form_lock$.getGlobalValue() );
      }
    }
    return Sequences.length( invalid_processes );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
  public static SubLObject task_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
  public static SubLObject task_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $task_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
  public static SubLObject task_process(final SubLObject v_object)
  {
    assert NIL != task_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
  public static SubLObject task_completed(final SubLObject v_object)
  {
    assert NIL != task_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
  public static SubLObject _csetf_task_process(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
  public static SubLObject _csetf_task_completed(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != task_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
  public static SubLObject make_task(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $task_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw26$PROCESS ) )
      {
        _csetf_task_process( v_new, current_value );
      }
      else if( pcase_var.eql( $kw27$COMPLETED ) )
      {
        _csetf_task_completed( v_new, current_value );
      }
      else
      {
        Errors.error( $str28$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
  public static SubLObject visit_defstruct_task(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw29$BEGIN, $sym30$MAKE_TASK, TWO_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw26$PROCESS, task_process( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw27$COMPLETED, task_completed( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$END, $sym30$MAKE_TASK, TWO_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
  public static SubLObject visit_defstruct_object_task_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_task( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6573L)
  public static SubLObject new_task(final SubLObject name, final SubLObject function, SubLObject args, SubLObject a_list)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    if( a_list == UNPROVIDED )
    {
      a_list = NIL;
    }
    final SubLObject task = make_task( UNPROVIDED );
    final SubLObject symbol_list = Mapping.mapcar( Symbols.symbol_function( $sym34$SYMBOL_NAME ), Mapping.mapcar( Symbols.symbol_function( $sym35$CAR ), a_list ) );
    final SubLObject value_list = Mapping.mapcar( Symbols.symbol_function( $sym36$CADR ), a_list );
    subl_promotions.make_process_with_args( name, Symbols.symbol_function( $sym37$NEW_TASK_INTERNAL ), ConsesLow.list( task, function, args, symbol_list, value_list ) );
    return task;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6902L)
  public static SubLObject new_task_internal(final SubLObject task, final SubLObject function, final SubLObject args, final SubLObject symbol_list, final SubLObject value_list)
  {
    try
    {
      final SubLObject cprogv_var = Mapping.mapcar( Symbols.symbol_function( $sym38$FIND_SYMBOL ), symbol_list );
      final ArrayList old_values = Dynamic.extract_dynamic_values( cprogv_var );
      try
      {
        Dynamic.bind_dynamic_vars( cprogv_var, value_list );
        _csetf_task_process( task, Threads.current_process() );
        Functions.apply( function, args );
      }
      finally
      {
        Dynamic.rebind_dynamic_vars( cprogv_var, old_values );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        _csetf_task_completed( task, T );
        _csetf_task_process( task, NIL );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject thinking_task_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject thinking_task_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $thinking_task_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_lock(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_thread(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_name(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_status(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_progress_message(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_progress_sofar(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField7();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_progress_total(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField8();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_start_time(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField9();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_finish_time(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField10();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_result(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField11();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_error_message(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField12();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject t_task_properties(final SubLObject v_object)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.getField13();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_thread(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_name(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_status(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_progress_message(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_progress_sofar(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField7( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_progress_total(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField8( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_start_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField9( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_finish_time(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField10( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_result(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField11( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_error_message(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField12( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject _csetf_t_task_properties(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != thinking_task_p( v_object ) : v_object;
    return v_object.setField13( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject make_thinking_task(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $thinking_task_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw71$LOCK ) )
      {
        _csetf_t_task_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw72$THREAD ) )
      {
        _csetf_t_task_thread( v_new, current_value );
      }
      else if( pcase_var.eql( $kw73$NAME ) )
      {
        _csetf_t_task_name( v_new, current_value );
      }
      else if( pcase_var.eql( $kw74$STATUS ) )
      {
        _csetf_t_task_status( v_new, current_value );
      }
      else if( pcase_var.eql( $kw75$PROGRESS_MESSAGE ) )
      {
        _csetf_t_task_progress_message( v_new, current_value );
      }
      else if( pcase_var.eql( $kw76$PROGRESS_SOFAR ) )
      {
        _csetf_t_task_progress_sofar( v_new, current_value );
      }
      else if( pcase_var.eql( $kw77$PROGRESS_TOTAL ) )
      {
        _csetf_t_task_progress_total( v_new, current_value );
      }
      else if( pcase_var.eql( $kw78$START_TIME ) )
      {
        _csetf_t_task_start_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw79$FINISH_TIME ) )
      {
        _csetf_t_task_finish_time( v_new, current_value );
      }
      else if( pcase_var.eql( $kw80$RESULT ) )
      {
        _csetf_t_task_result( v_new, current_value );
      }
      else if( pcase_var.eql( $kw81$ERROR_MESSAGE ) )
      {
        _csetf_t_task_error_message( v_new, current_value );
      }
      else if( pcase_var.eql( $kw82$PROPERTIES ) )
      {
        _csetf_t_task_properties( v_new, current_value );
      }
      else
      {
        Errors.error( $str28$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject visit_defstruct_thinking_task(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw29$BEGIN, $sym83$MAKE_THINKING_TASK, TWELVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw71$LOCK, t_task_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw72$THREAD, t_task_thread( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw73$NAME, t_task_name( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw74$STATUS, t_task_status( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw75$PROGRESS_MESSAGE, t_task_progress_message( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw76$PROGRESS_SOFAR, t_task_progress_sofar( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw77$PROGRESS_TOTAL, t_task_progress_total( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw78$START_TIME, t_task_start_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw79$FINISH_TIME, t_task_finish_time( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw80$RESULT, t_task_result( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw81$ERROR_MESSAGE, t_task_error_message( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw82$PROPERTIES, t_task_properties( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$END, $sym83$MAKE_THINKING_TASK, TWELVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
  public static SubLObject visit_defstruct_object_thinking_task_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_thinking_task( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8984L)
  public static SubLObject new_thinking_task(final SubLObject name, final SubLObject progress_message, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    assert NIL != Types.stringp( name ) : name;
    assert NIL != Types.stringp( progress_message ) : progress_message;
    if( NIL != v_properties && !assertionsDisabledSynth && NIL == list_utilities.property_list_p( v_properties ) )
    {
      throw new AssertionError( v_properties );
    }
    final SubLObject thinking = make_thinking_task( UNPROVIDED );
    final SubLObject lock = Locks.make_lock( name );
    _csetf_t_task_progress_message( thinking, progress_message );
    _csetf_t_task_name( thinking, name );
    _csetf_t_task_lock( thinking, lock );
    _csetf_t_task_status( thinking, $kw87$NONE );
    if( NIL != v_properties )
    {
      _csetf_t_task_properties( thinking, v_properties );
    }
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 9906L)
  public static SubLObject with_thinking_lock(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject thinking = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list88 );
    thinking = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject lock = $sym89$LOCK;
      return ConsesLow.list( $sym90$CLET, ConsesLow.list( ConsesLow.list( lock, ConsesLow.list( $sym91$THINKING_LOCK, thinking ) ) ), ConsesLow.listS( $sym92$WITH_LOCK_HELD, ConsesLow.list( lock ), ConsesLow.append(
          body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list88 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 10144L)
  public static SubLObject thinking_note_thread(final SubLObject thinking, final SubLObject thread)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    assert NIL != Types.processp( thread ) : thread;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_t_task_thread( thinking, thread );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 10428L)
  public static SubLObject thinking_clear_thread(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    _csetf_t_task_thread( thinking, NIL );
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 10575L)
  public static SubLObject thinking_note_status(final SubLObject thinking, final SubLObject status)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    assert NIL != Types.keywordp( status ) : status;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_t_task_status( thinking, status );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 10798L)
  public static SubLObject thinking_note_progress_message(final SubLObject thinking, final SubLObject message)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    assert NIL != Types.stringp( message ) : message;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_t_task_progress_message( thinking, message );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 11096L)
  public static SubLObject thinking_note_progress_sofar(final SubLObject thinking, final SubLObject sofar)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    assert NIL != Types.integerp( sofar ) : sofar;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_t_task_progress_sofar( thinking, sofar );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 11381L)
  public static SubLObject thinking_note_progress_total(final SubLObject thinking, final SubLObject total)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    assert NIL != Types.integerp( total ) : total;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_t_task_progress_total( thinking, total );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 11668L)
  public static SubLObject thinking_note_start_time(final SubLObject thinking, final SubLObject time)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    assert NIL != numeric_date_utilities.universal_time_p( time ) : time;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_t_task_start_time( thinking, time );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 11903L)
  public static SubLObject thinking_note_finish_time(final SubLObject thinking, final SubLObject time)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    assert NIL != numeric_date_utilities.universal_time_p( time ) : time;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_t_task_finish_time( thinking, time );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 12140L)
  public static SubLObject thinking_note_result(final SubLObject thinking, final SubLObject result)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_t_task_result( thinking, result );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 12334L)
  public static SubLObject thinking_note_error_message(final SubLObject thinking, final SubLObject error_message)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    assert NIL != Types.stringp( error_message ) : error_message;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_t_task_error_message( thinking, error_message );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 12593L)
  public static SubLObject thinking_note_property(final SubLObject thinking, final SubLObject property, final SubLObject value)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    assert NIL != Types.keywordp( property ) : property;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_t_task_properties( thinking, conses_high.putf( t_task_properties( thinking ), property, value ) );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 12878L)
  public static SubLObject thinking_lock(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return t_task_lock( thinking );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13049L)
  public static SubLObject thinking_thread(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return t_task_thread( thinking );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13169L)
  public static SubLObject thinking_name(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return t_task_name( thinking );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13287L)
  public static SubLObject thinking_status(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return t_task_status( thinking );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13407L)
  public static SubLObject thinking_progress_message(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return t_task_progress_message( thinking );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13547L)
  public static SubLObject thinking_progress_sofar(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return t_task_progress_sofar( thinking );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13683L)
  public static SubLObject thinking_progress_total(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return t_task_progress_total( thinking );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13819L)
  public static SubLObject thinking_start_time(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return t_task_start_time( thinking );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13947L)
  public static SubLObject thinking_finish_time(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return t_task_finish_time( thinking );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14077L)
  public static SubLObject thinking_result(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return t_task_result( thinking );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14197L)
  public static SubLObject thinking_error_message(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return t_task_error_message( thinking );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14331L)
  public static SubLObject thinking_property(final SubLObject thinking, final SubLObject property)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    assert NIL != Types.keywordp( property ) : property;
    return conses_high.getf( t_task_properties( thinking ), property, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14515L)
  public static SubLObject thinking_properties(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    return conses_high.copy_list( t_task_properties( thinking ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14775L)
  public static SubLObject thinking_task()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $thinking_task$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14907L)
  public static SubLObject thinking_start(final SubLObject thinking, final SubLObject function, final SubLObject arg_list)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    assert NIL != Types.function_spec_p( function ) : function;
    assert NIL != Types.listp( arg_list ) : arg_list;
    SubLObject v_answer = NIL;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      SubLObject thread = thinking_thread( thinking );
      if( NIL == thread )
      {
        final SubLObject thread_args = ConsesLow.list( thinking, function, arg_list );
        final SubLObject name = thinking_name( thinking );
        thread = subl_promotions.make_process_with_args( name, $sym97$THINKING_THREAD_RUN, thread_args );
        thinking_note_status( thinking, $kw98$STARTED );
        v_answer = thread;
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 15718L)
  public static SubLObject thinking_stop(final SubLObject thinking)
  {
    assert NIL != thinking_task_p( thinking ) : thinking;
    SubLObject v_answer = NIL;
    final SubLObject lock = thinking_lock( thinking );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject thread = thinking_thread( thinking );
      if( NIL != Types.processp( thread ) )
      {
        try
        {
          if( NIL != Threads.valid_process_p( thread ) )
          {
            Threads.kill_process( thread );
          }
          v_answer = T;
        }
        finally
        {
          final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
          try
          {
            Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
            final SubLObject _values = Values.getValuesAsVector();
            if( NIL == thinking_finish_time( thinking ) )
            {
              thinking_note_finish_time( thinking, Time.get_universal_time() );
            }
            thinking_clear_thread( thinking );
            thinking_note_status( thinking, $kw99$STOPPED );
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
          }
        }
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 16433L)
  public static SubLObject thinking_thread_run(final SubLObject thinking, final SubLObject function, final SubLObject args)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject success = NIL;
    SubLObject error_message = NIL;
    SubLObject uncaught_errorP = NIL;
    final SubLObject _prev_bind_0 = Packages.$package$.currentBinding( thread );
    try
    {
      Packages.$package$.bind( Packages.find_package( $str100$CYC ), thread );
      thinking_thread_initialize( thinking );
      try
      {
        uncaught_errorP = T;
        final SubLObject _prev_bind_0_$1 = $thinking_task$.currentBinding( thread );
        try
        {
          $thinking_task$.bind( thinking, thread );
          try
          {
            thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
            final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( $sym101$CATCH_ERROR_MESSAGE_HANDLER, thread );
              try
              {
                final SubLObject _prev_bind_0_$3 = Errors.$continue_cerrorP$.currentBinding( thread );
                try
                {
                  Errors.$continue_cerrorP$.bind( T, thread );
                  thinking_note_status( thinking, $kw102$RUNNING );
                  result = Functions.apply( function, args );
                }
                finally
                {
                  Errors.$continue_cerrorP$.rebind( _prev_bind_0_$3, thread );
                }
                success = T;
                uncaught_errorP = NIL;
              }
              catch( final Throwable catch_var )
              {
                Errors.handleThrowable( catch_var, NIL );
              }
            }
            finally
            {
              Errors.$error_handler$.rebind( _prev_bind_0_$2, thread );
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
        finally
        {
          $thinking_task$.rebind( _prev_bind_0_$1, thread );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( NIL != uncaught_errorP && thinking_status( thinking ) != $kw99$STOPPED && NIL == error_message )
          {
            error_message = PrintLow.format( NIL, $str103$Function__A_in_thread__A_terminat, function, thinking_name( thinking ) );
          }
          thinking_thread_finalize( thinking, result, success, error_message );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$4, thread );
        }
      }
    }
    finally
    {
      Packages.$package$.rebind( _prev_bind_0, thread );
    }
    return Values.values( result, success, error_message );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 17650L)
  public static SubLObject thinking_thread_initialize(final SubLObject thinking)
  {
    thinking_note_start_time( thinking, Time.get_universal_time() );
    final SubLObject thread = Threads.current_process();
    thinking_note_thread( thinking, thread );
    return thinking;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 17903L)
  public static SubLObject thinking_thread_finalize(final SubLObject thinking, final SubLObject result, final SubLObject success, final SubLObject error_message)
  {
    final SubLObject stopped = ( thinking_status( thinking ) == $kw99$STOPPED ) ? T : NIL;
    if( NIL != success )
    {
      thinking_note_result( thinking, result );
    }
    else if( NIL != error_message )
    {
      thinking_note_error_message( thinking, error_message );
    }
    thinking_note_finish_time( thinking, Time.get_universal_time() );
    thinking_clear_thread( thinking );
    if( NIL == stopped )
    {
      thinking_note_status( thinking, ( NIL != error_message ) ? $kw104$ERROR : $kw105$FINISHED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLObject ipc_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLObject ipc_queue_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $ipc_queue_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLObject ipc_queue_lock(final SubLObject v_object)
  {
    assert NIL != ipc_queue_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLObject ipc_queue_semaphore(final SubLObject v_object)
  {
    assert NIL != ipc_queue_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLObject ipc_queue_data_queue(final SubLObject v_object)
  {
    assert NIL != ipc_queue_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLObject _csetf_ipc_queue_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ipc_queue_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLObject _csetf_ipc_queue_semaphore(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ipc_queue_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLObject _csetf_ipc_queue_data_queue(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ipc_queue_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLObject make_ipc_queue(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $ipc_queue_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw71$LOCK ) )
      {
        _csetf_ipc_queue_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw120$SEMAPHORE ) )
      {
        _csetf_ipc_queue_semaphore( v_new, current_value );
      }
      else if( pcase_var.eql( $kw121$DATA_QUEUE ) )
      {
        _csetf_ipc_queue_data_queue( v_new, current_value );
      }
      else
      {
        Errors.error( $str28$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLObject visit_defstruct_ipc_queue(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw29$BEGIN, $sym122$MAKE_IPC_QUEUE, THREE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw71$LOCK, ipc_queue_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw120$SEMAPHORE, ipc_queue_semaphore( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw121$DATA_QUEUE, ipc_queue_data_queue( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$END, $sym122$MAKE_IPC_QUEUE, THREE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
  public static SubLObject visit_defstruct_object_ipc_queue_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_ipc_queue( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18972L)
  public static SubLObject new_ipc_queue(final SubLObject name)
  {
    final SubLObject ipcq = make_ipc_queue( UNPROVIDED );
    final SubLObject lock_name = Sequences.cconcatenate( $str124$Lock_for_Queue_, name );
    _csetf_ipc_queue_lock( ipcq, Locks.make_lock( lock_name ) );
    _csetf_ipc_queue_semaphore( ipcq, Semaphores.new_semaphore( name, ZERO_INTEGER ) );
    _csetf_ipc_queue_data_queue( ipcq, queues.create_queue( UNPROVIDED ) );
    return ipcq;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 19407L)
  public static SubLObject ipc_enqueue(final SubLObject item, final SubLObject ipc_queue, SubLObject debugP)
  {
    if( debugP == UNPROVIDED )
    {
      debugP = $ipcq_debugP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject lock = ipc_queue_lock( ipc_queue );
    final SubLObject data_queue = ipc_queue_data_queue( ipc_queue );
    final SubLObject item_string = ( NIL != debugP ) ? string_utilities.string_first_n( TWELVE_INTEGER, print_high.princ_to_string( item ) ) : NIL;
    final SubLObject _prev_bind_0 = $ipcq_debugP$.currentBinding( thread );
    try
    {
      $ipcq_debugP$.bind( debugP, thread );
      ipcq_debug( ipc_queue, $str125$Waiting_to_enqueue__A, item_string, UNPROVIDED, UNPROVIDED );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        ipcq_debug( ipc_queue, $str126$Enqueuing__A, item_string, UNPROVIDED, UNPROVIDED );
        queues.enqueue( item, data_queue );
        if( NIL != debugP )
        {
          ipcq_debug( ipc_queue, $str127$Enqueued__A, item_string, UNPROVIDED, UNPROVIDED );
          ipcq_debug( ipc_queue, $str128$Queue_size___S, queues.queue_size( data_queue ), UNPROVIDED, UNPROVIDED );
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
      Semaphores.semaphore_signal( ipc_queue_semaphore( ipc_queue ) );
      check_ipcq_synchronized( ipc_queue );
    }
    finally
    {
      $ipcq_debugP$.rebind( _prev_bind_0, thread );
    }
    return ipc_queue;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 20113L)
  public static SubLObject ipc_dequeue(final SubLObject ipc_queue, SubLObject debugP)
  {
    if( debugP == UNPROVIDED )
    {
      debugP = $ipcq_debugP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = $ipcq_debugP$.currentBinding( thread );
    try
    {
      $ipcq_debugP$.bind( debugP, thread );
      SubLObject result = NIL;
      SubLObject err_msg = NIL;
      check_ipcq_synchronized( ipc_queue );
      final SubLObject lock = ipc_queue_lock( ipc_queue );
      final SubLObject data_queue = ipc_queue_data_queue( ipc_queue );
      SubLObject succeeded = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym101$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            ipcq_debug( ipc_queue, $str129$Waiting_for_dequeue_semaphore_, UNPROVIDED, UNPROVIDED, UNPROVIDED );
            Semaphores.semaphore_wait( ipc_queue_semaphore( ipc_queue ) );
            succeeded = T;
          }
          catch( final Throwable catch_var )
          {
            Errors.handleThrowable( catch_var, NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( _prev_bind_0_$5, thread );
        }
      }
      catch( final Throwable ccatch_env_var )
      {
        err_msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( NIL != succeeded )
      {
        ipcq_debug( ipc_queue, $str130$Waiting_for_Queue_lock_to_dequeue, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject release = NIL;
        try
        {
          release = Locks.seize_lock( lock );
          result = queues.dequeue( data_queue );
          if( NIL != debugP )
          {
            ipcq_debug( ipc_queue, $str131$Dequeued__A, string_utilities.string_first_n( TWELVE_INTEGER, print_high.princ_to_string( result ) ), UNPROVIDED, UNPROVIDED );
            ipcq_debug( ipc_queue, $str128$Queue_size___S, queues.queue_size( data_queue ), UNPROVIDED, UNPROVIDED );
            check_ipcq_synchronized( ipc_queue );
          }
        }
        finally
        {
          if( NIL != release )
          {
            Locks.release_lock( lock );
          }
        }
      }
      else if( NIL == err_msg )
      {
        err_msg = $str132$Unknown_error_;
      }
      return Values.values( result, err_msg );
    }
    finally
    {
      $ipcq_debugP$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 21034L)
  public static SubLObject check_ipcq_synchronized(final SubLObject ipc_queue)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $ipcq_debugP$.getDynamicValue( thread ) )
    {
      final SubLObject q_size = ipc_current_queue_size( ipc_queue );
      final SubLObject s_count = Semaphores.semaphore_current_count( ipc_queue_semaphore( ipc_queue ) );
      format_nil.force_format( T, $str134$____D___A___A___Q___D_S___D__, process_suid( Threads.current_process() ), numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), Semaphores.semaphore_name(
          ipc_queue_semaphore( ipc_queue ) ), q_size, s_count, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( !q_size.numE( s_count ) )
      {
        Errors.warn( $str135$We_are_out_of_sync_on_either_the_, q_size, s_count );
      }
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 21586L)
  public static SubLObject ipcq_debug(final SubLObject ipc_queue, final SubLObject str, SubLObject arg1, SubLObject arg2, SubLObject arg3)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $ipcq_debugP$.getDynamicValue( thread ) )
    {
      format_nil.force_format( T, $str136$____D___A___A____A__, process_suid( Threads.current_process() ), numeric_date_utilities.timestamp_with_milliseconds( UNPROVIDED, UNPROVIDED ), Semaphores.semaphore_name(
          ipc_queue_semaphore( ipc_queue ) ), PrintLow.format( NIL, str, new SubLObject[]
          { arg1, arg2, arg3
      } ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 21894L)
  public static SubLObject ipc_dequeue_n(final SubLObject ipc_queue, SubLObject n, SubLObject debugP)
  {
    if( n == UNPROVIDED )
    {
      n = $int137$100;
    }
    if( debugP == UNPROVIDED )
    {
      debugP = $ipcq_debugP$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    assert NIL != ipc_queue_p( ipc_queue ) : ipc_queue;
    final SubLObject _prev_bind_0 = $ipcq_debugP$.currentBinding( thread );
    try
    {
      $ipcq_debugP$.bind( debugP, thread );
      SubLObject count = ZERO_INTEGER;
      SubLObject result = NIL;
      ipcq_debug( ipc_queue, $str139$Dequeueing__up_to___D_item__P_, n, UNPROVIDED, UNPROVIDED );
      while ( count.numL( n ) && ipc_current_queue_size( ipc_queue ).numG( ZERO_INTEGER ))
      {
        result = ConsesLow.cons( ipc_dequeue( ipc_queue, debugP ), result );
        count = Numbers.add( count, ONE_INTEGER );
      }
      return Sequences.nreverse( result );
    }
    finally
    {
      $ipcq_debugP$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 22455L)
  public static SubLObject ipc_drain(final SubLObject ipc_queue, SubLObject debugP)
  {
    if( debugP == UNPROVIDED )
    {
      debugP = $ipcq_debugP$.getDynamicValue();
    }
    return ipc_dequeue_n( ipc_queue, ipc_current_queue_size( ipc_queue ), debugP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 22655L)
  public static SubLObject ipc_dequeue_with_timeout(final SubLObject ipc_queue, final SubLObject timeout_secs, SubLObject wait_slice)
  {
    if( wait_slice == UNPROVIDED )
    {
      wait_slice = $float140$0_01;
    }
    final SubLObject timeout_realtime = numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time( timeout_secs );
    final SubLObject final_time = Numbers.add( timeout_realtime, Time.get_internal_real_time() );
    while ( Time.get_internal_real_time().numL( final_time ))
    {
      if( ipc_current_queue_size( ipc_queue ).isPositive() )
      {
        return Values.values( ipc_dequeue( ipc_queue, UNPROVIDED ), NIL );
      }
      Threads.sleep( wait_slice );
    }
    return Values.values( NIL, T );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 23119L)
  public static SubLObject ipc_current_queue_size(final SubLObject ipc_queue)
  {
    SubLObject result = NIL;
    SubLObject time_stamp = NIL;
    final SubLObject lock = ipc_queue_lock( ipc_queue );
    final SubLObject data_queue = ipc_queue_data_queue( ipc_queue );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      time_stamp = Time.get_universal_time();
      result = queues.queue_size( data_queue );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return Values.values( result, time_stamp );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 23465L)
  public static SubLObject ipc_current_queue_content(final SubLObject ipc_queue)
  {
    SubLObject result = NIL;
    SubLObject time_stamp = NIL;
    final SubLObject lock = ipc_queue_lock( ipc_queue );
    final SubLObject data_queue = ipc_queue_data_queue( ipc_queue );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      time_stamp = Time.get_universal_time();
      result = queues.queue_elements( data_queue );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return Values.values( result, time_stamp );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 23897L)
  public static SubLObject launch_ipcq_test_producer(final SubLObject ipc_queue, SubLObject delay)
  {
    if( delay == UNPROVIDED )
    {
      delay = ZERO_INTEGER;
    }
    return make_cyc_server_process_with_args( $str142$IPCQ_Test_Producer, $sym143$IPCQ_TEST_PRODUCER_RUN, ConsesLow.list( ipc_queue, delay ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 24099L)
  public static SubLObject ipcq_test_producer_run(final SubLObject ipc_queue, SubLObject delay)
  {
    if( delay == UNPROVIDED )
    {
      delay = ZERO_INTEGER;
    }
    Threads.sleep( delay );
    SubLObject cdolist_list_var = $ipcq_test_items$.getGlobalValue();
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ipc_enqueue( item, ipc_queue, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 24270L)
  public static SubLObject test_ipc_enqueue_dequeue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ipc_queue = new_ipc_queue( $str144$Test_IPC_Queue );
    launch_ipcq_test_producer( ipc_queue, UNPROVIDED );
    SubLObject cdolist_list_var = $ipcq_test_items$.getGlobalValue();
    SubLObject item = NIL;
    item = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject result = ipc_dequeue( ipc_queue, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !item.equal( result ) )
      {
        Errors.error( $str145$Expected__S__got__S, item, result );
      }
      cdolist_list_var = cdolist_list_var.rest();
      item = cdolist_list_var.first();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 24639L)
  public static SubLObject test_ipc_enqueue_drain()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ipc_queue = new_ipc_queue( $str144$Test_IPC_Queue );
    launch_ipcq_test_producer( ipc_queue, UNPROVIDED );
    while ( !Sequences.length( $ipcq_test_items$.getGlobalValue() ).equal( ipc_current_queue_size( ipc_queue ) ))
    {
      Threads.sleep( ONE_INTEGER );
    }
    final SubLObject result = ipc_drain( ipc_queue, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !$ipcq_test_items$.getGlobalValue().equal( result ) )
    {
      Errors.error( $str145$Expected__S__got__S, $ipcq_test_items$.getGlobalValue(), result );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 25090L)
  public static SubLObject test_ipc_enqueue_drain_dequeue()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject ipc_queue = new_ipc_queue( $str144$Test_IPC_Queue );
    launch_ipcq_test_producer( ipc_queue, UNPROVIDED );
    while ( !Sequences.length( $ipcq_test_items$.getGlobalValue() ).equal( ipc_current_queue_size( ipc_queue ) ))
    {
      Threads.sleep( ONE_INTEGER );
    }
    ipc_drain( ipc_queue, UNPROVIDED );
    launch_ipcq_test_producer( ipc_queue, TWO_INTEGER );
    final SubLObject expected = $ipcq_test_items$.getGlobalValue().first();
    final SubLObject actual = ipc_dequeue( ipc_queue, UNPROVIDED );
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !expected.equal( actual ) )
    {
      Errors.error( $str145$Expected__S__got__S, expected, actual );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject ordered_ipc_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject ordered_ipc_queue_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $ordered_ipc_queue_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject ordrd_ipcq_lock(final SubLObject v_object)
  {
    assert NIL != ordered_ipc_queue_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject ordrd_ipcq_producer_isg(final SubLObject v_object)
  {
    assert NIL != ordered_ipc_queue_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject ordrd_ipcq_consumer_isg(final SubLObject v_object)
  {
    assert NIL != ordered_ipc_queue_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject ordrd_ipcq_payload(final SubLObject v_object)
  {
    assert NIL != ordered_ipc_queue_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject ordrd_ipcq_early_consumer_semaphore(final SubLObject v_object)
  {
    assert NIL != ordered_ipc_queue_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject _csetf_ordrd_ipcq_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ordered_ipc_queue_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject _csetf_ordrd_ipcq_producer_isg(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ordered_ipc_queue_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject _csetf_ordrd_ipcq_consumer_isg(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ordered_ipc_queue_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject _csetf_ordrd_ipcq_payload(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ordered_ipc_queue_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject _csetf_ordrd_ipcq_early_consumer_semaphore(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != ordered_ipc_queue_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject make_ordered_ipc_queue(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $ordered_ipc_queue_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw71$LOCK ) )
      {
        _csetf_ordrd_ipcq_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw175$PRODUCER_ISG ) )
      {
        _csetf_ordrd_ipcq_producer_isg( v_new, current_value );
      }
      else if( pcase_var.eql( $kw176$CONSUMER_ISG ) )
      {
        _csetf_ordrd_ipcq_consumer_isg( v_new, current_value );
      }
      else if( pcase_var.eql( $kw177$PAYLOAD ) )
      {
        _csetf_ordrd_ipcq_payload( v_new, current_value );
      }
      else if( pcase_var.eql( $kw178$EARLY_CONSUMER_SEMAPHORE ) )
      {
        _csetf_ordrd_ipcq_early_consumer_semaphore( v_new, current_value );
      }
      else
      {
        Errors.error( $str28$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject visit_defstruct_ordered_ipc_queue(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw29$BEGIN, $sym179$MAKE_ORDERED_IPC_QUEUE, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw71$LOCK, ordrd_ipcq_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw175$PRODUCER_ISG, ordrd_ipcq_producer_isg( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw176$CONSUMER_ISG, ordrd_ipcq_consumer_isg( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw177$PAYLOAD, ordrd_ipcq_payload( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw178$EARLY_CONSUMER_SEMAPHORE, ordrd_ipcq_early_consumer_semaphore( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$END, $sym179$MAKE_ORDERED_IPC_QUEUE, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
  public static SubLObject visit_defstruct_object_ordered_ipc_queue_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_ordered_ipc_queue( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 27153L)
  public static SubLObject new_ordered_ipc_queue(final SubLObject name, SubLObject size_limit)
  {
    if( size_limit == UNPROVIDED )
    {
      size_limit = NIL;
    }
    assert NIL != Types.stringp( name ) : name;
    final SubLObject o_ipcq = make_ordered_ipc_queue( UNPROVIDED );
    final SubLObject lock_name = Sequences.cconcatenate( $str182$Lock_for_Ordered_IPC_Queue_, name );
    _csetf_ordrd_ipcq_lock( o_ipcq, Locks.make_lock( lock_name ) );
    _csetf_ordrd_ipcq_producer_isg( o_ipcq, integer_sequence_generator.new_integer_sequence_generator( ZERO_INTEGER, size_limit, UNPROVIDED ) );
    _csetf_ordrd_ipcq_consumer_isg( o_ipcq, integer_sequence_generator.new_integer_sequence_generator( ZERO_INTEGER, size_limit, UNPROVIDED ) );
    _csetf_ordrd_ipcq_payload( o_ipcq, dictionary_utilities.new_synchronized_dictionary( UNPROVIDED, UNPROVIDED ) );
    _csetf_ordrd_ipcq_early_consumer_semaphore( o_ipcq, Semaphores.new_semaphore( $str183$Ordered_IPCQ_Early_Producer, ZERO_INTEGER ) );
    return o_ipcq;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 28004L)
  public static SubLObject ordered_ipc_enqueue(final SubLObject item, final SubLObject o_ipcq)
  {
    assert NIL != ordered_ipc_queue_p( o_ipcq ) : o_ipcq;
    final SubLObject ticket = integer_sequence_generator.integer_sequence_generator_next( ordrd_ipcq_producer_isg( o_ipcq ) );
    final SubLObject lock = ordrd_ipcq_lock( o_ipcq );
    final SubLObject payload = ordrd_ipcq_payload( o_ipcq );
    SubLObject awoke_someoneP = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject entry = map_utilities.map_get( payload, ticket, $ordered_ipcq_empty$.getGlobalValue() );
      map_utilities.map_put( payload, ticket, item );
      if( $ordered_ipcq_empty$.getGlobalValue().eql( entry ) )
      {
        awoke_someoneP = NIL;
      }
      else if( NIL != Threads.valid_process_p( entry ) )
      {
        Semaphores.semaphore_signal( ordrd_ipcq_early_consumer_semaphore( o_ipcq ) );
        awoke_someoneP = T;
      }
      else if( NIL != Types.processp( entry ) )
      {
        awoke_someoneP = ordered_ipc_enqueue( item, o_ipcq );
      }
      else
      {
        Errors.error( $str184$Unexpected_entry__A_in_the_payloa, entry, o_ipcq );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return awoke_someoneP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 29430L)
  public static SubLObject ordered_ipc_dequeue(final SubLObject o_ipcq)
  {
    assert NIL != ordered_ipc_queue_p( o_ipcq ) : o_ipcq;
    final SubLObject ticket = integer_sequence_generator.integer_sequence_generator_next( ordrd_ipcq_consumer_isg( o_ipcq ) );
    final SubLObject lock = ordrd_ipcq_lock( o_ipcq );
    final SubLObject payload = ordrd_ipcq_payload( o_ipcq );
    SubLObject entry = $ordered_ipcq_empty$.getGlobalValue();
    while ( $ordered_ipcq_empty$.getGlobalValue().eql( entry ))
    {
      SubLObject earlyP = NIL;
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        entry = map_utilities.map_get_without_values( payload, ticket, $ordered_ipcq_empty$.getGlobalValue() );
        if( $ordered_ipcq_empty$.getGlobalValue().eql( entry ) )
        {
          map_utilities.map_put( payload, ticket, Threads.current_process() );
          earlyP = T;
        }
        else
        {
          map_utilities.map_remove( payload, ticket );
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
      if( NIL != earlyP )
      {
        Semaphores.semaphore_wait( ordrd_ipcq_early_consumer_semaphore( o_ipcq ) );
      }
    }
    return entry;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 30344L)
  public static SubLObject ordered_ipc_queue_emptyP(final SubLObject o_ipcq)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject iterator_var = map_utilities.new_map_iterator( ordrd_ipcq_payload( o_ipcq ) );
    SubLObject valid;
    for( SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean( NIL == valid ) )
    {
      thread.resetMultipleValues();
      final SubLObject entry = iteration.iteration_next( iterator_var );
      valid = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != valid )
      {
        final SubLObject value = conses_high.second( entry );
        if( NIL == Types.processp( value ) )
        {
          return NIL;
        }
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 30830L)
  public static SubLObject ordered_ipc_current_queue_size(final SubLObject o_ipcq, SubLObject estimation_threshold)
  {
    if( estimation_threshold == UNPROVIDED )
    {
      estimation_threshold = $ordered_ipc_current_queue_size_estimation_threshold$.getDynamicValue();
    }
    assert NIL != ordered_ipc_queue_p( o_ipcq ) : o_ipcq;
    SubLObject estimate = Numbers.subtract( integer_sequence_generator.get_integer_sequence_generator_recent( ordrd_ipcq_producer_isg( o_ipcq ) ), integer_sequence_generator.get_integer_sequence_generator_recent(
        ordrd_ipcq_consumer_isg( o_ipcq ) ) );
    if( !estimate.eql( ZERO_INTEGER ) || NIL == ordered_ipc_queue_emptyP( o_ipcq ) )
    {
      estimate = Numbers.add( estimate, ONE_INTEGER );
    }
    return estimate.numG( estimation_threshold ) ? estimate : Sequences.length( ordered_ipc_current_queue_contents( o_ipcq ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 31741L)
  public static SubLObject ordered_ipc_current_queue_contents(final SubLObject o_ipcq)
  {
    assert NIL != ordered_ipc_queue_p( o_ipcq ) : o_ipcq;
    return Sequences.remove_if( $sym7$PROCESSP, map_utilities.map_values( ordrd_ipcq_payload( o_ipcq ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 32071L)
  public static SubLObject ordered_ipc_queue_quiescedP(final SubLObject o_ipcq)
  {
    return map_utilities.map_empty_p( ordrd_ipcq_payload( o_ipcq ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 32271L)
  public static SubLObject kill_process_named(final SubLObject name)
  {
    enforceType( name, $sym85$STRINGP );
    SubLObject cdolist_list_var = Threads.all_processes();
    SubLObject process = NIL;
    process = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject process_name = Threads.process_name( process );
      if( NIL != Strings.stringE( name, process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        Threads.kill_process( process );
      }
      cdolist_list_var = cdolist_list_var.rest();
      process = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 32742L)
  public static SubLObject process_named(final SubLObject name)
  {
    assert NIL != Types.stringp( name ) : name;
    SubLObject cdolist_list_var = Threads.all_processes();
    SubLObject process = NIL;
    process = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject process_name = Threads.process_name( process );
      if( NIL != Strings.stringE( name, process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return process;
      }
      cdolist_list_var = cdolist_list_var.rest();
      process = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33052L)
  public static SubLObject process_exhaust_immediately_fn()
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33206L)
  public static SubLObject make_exhausted_process(final SubLObject name)
  {
    return Threads.make_process( name, $sym191$PROCESS_EXHAUST_IMMEDIATELY_FN );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33371L)
  public static SubLObject visit_defstruct_object_process_method(final SubLObject v_object, final SubLObject visitor_fn)
  {
    return visit_defstruct_object_process( v_object, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33501L)
  public static SubLObject visit_defstruct_object_process(final SubLObject process, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, process, $kw29$BEGIN, $sym193$MAKE_EXHAUSTED_PROCESS, ONE_INTEGER );
    Functions.funcall( visitor_fn, process, $kw31$SLOT, $kw73$NAME, Threads.process_name( process ) );
    Functions.funcall( visitor_fn, process, $kw32$END, $sym193$MAKE_EXHAUSTED_PROCESS, ONE_INTEGER );
    return process;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33782L)
  public static SubLObject visit_defstruct_object_lock_method(final SubLObject v_object, final SubLObject visitor_fn)
  {
    return visit_defstruct_object_lock( v_object, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33906L)
  public static SubLObject visit_defstruct_object_lock(final SubLObject lock, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, lock, $kw29$BEGIN, $sym195$MAKE_LOCK, ONE_INTEGER );
    Functions.funcall( visitor_fn, lock, $kw31$SLOT, $kw73$NAME, Locks.lock_name( lock ) );
    Functions.funcall( visitor_fn, lock, $kw32$END, $sym195$MAKE_LOCK, ONE_INTEGER );
    return lock;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject process_wrapper_print_function_trampoline(final SubLObject v_object, final SubLObject stream)
  {
    compatibility.default_struct_print_function( v_object, stream, ZERO_INTEGER );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject process_wrapper_p(final SubLObject v_object)
  {
    return ( v_object.getClass() == $process_wrapper_native.class ) ? T : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject process_wrapper_id(final SubLObject v_object)
  {
    assert NIL != process_wrapper_p( v_object ) : v_object;
    return v_object.getField2();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject process_wrapper_process(final SubLObject v_object)
  {
    assert NIL != process_wrapper_p( v_object ) : v_object;
    return v_object.getField3();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject process_wrapper_state(final SubLObject v_object)
  {
    assert NIL != process_wrapper_p( v_object ) : v_object;
    return v_object.getField4();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject process_wrapper_lock(final SubLObject v_object)
  {
    assert NIL != process_wrapper_p( v_object ) : v_object;
    return v_object.getField5();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject process_wrapper_plist(final SubLObject v_object)
  {
    assert NIL != process_wrapper_p( v_object ) : v_object;
    return v_object.getField6();
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject _csetf_process_wrapper_id(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != process_wrapper_p( v_object ) : v_object;
    return v_object.setField2( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject _csetf_process_wrapper_process(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != process_wrapper_p( v_object ) : v_object;
    return v_object.setField3( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject _csetf_process_wrapper_state(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != process_wrapper_p( v_object ) : v_object;
    return v_object.setField4( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject _csetf_process_wrapper_lock(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != process_wrapper_p( v_object ) : v_object;
    return v_object.setField5( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject _csetf_process_wrapper_plist(final SubLObject v_object, final SubLObject value)
  {
    assert NIL != process_wrapper_p( v_object ) : v_object;
    return v_object.setField6( value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject make_process_wrapper(SubLObject arglist)
  {
    if( arglist == UNPROVIDED )
    {
      arglist = NIL;
    }
    final SubLObject v_new = new $process_wrapper_native();
    SubLObject next;
    SubLObject current_arg;
    SubLObject current_value;
    SubLObject pcase_var;
    for( next = NIL, next = arglist; NIL != next; next = conses_high.cddr( next ) )
    {
      current_arg = next.first();
      current_value = conses_high.cadr( next );
      pcase_var = current_arg;
      if( pcase_var.eql( $kw214$ID ) )
      {
        _csetf_process_wrapper_id( v_new, current_value );
      }
      else if( pcase_var.eql( $kw26$PROCESS ) )
      {
        _csetf_process_wrapper_process( v_new, current_value );
      }
      else if( pcase_var.eql( $kw215$STATE ) )
      {
        _csetf_process_wrapper_state( v_new, current_value );
      }
      else if( pcase_var.eql( $kw71$LOCK ) )
      {
        _csetf_process_wrapper_lock( v_new, current_value );
      }
      else if( pcase_var.eql( $kw216$PLIST ) )
      {
        _csetf_process_wrapper_plist( v_new, current_value );
      }
      else
      {
        Errors.error( $str28$Invalid_slot__S_for_construction_, current_arg );
      }
    }
    return v_new;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject visit_defstruct_process_wrapper(final SubLObject obj, final SubLObject visitor_fn)
  {
    Functions.funcall( visitor_fn, obj, $kw29$BEGIN, $sym217$MAKE_PROCESS_WRAPPER, FIVE_INTEGER );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw214$ID, process_wrapper_id( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw26$PROCESS, process_wrapper_process( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw215$STATE, process_wrapper_state( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw71$LOCK, process_wrapper_lock( obj ) );
    Functions.funcall( visitor_fn, obj, $kw31$SLOT, $kw216$PLIST, process_wrapper_plist( obj ) );
    Functions.funcall( visitor_fn, obj, $kw32$END, $sym217$MAKE_PROCESS_WRAPPER, FIVE_INTEGER );
    return obj;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
  public static SubLObject visit_defstruct_object_process_wrapper_method(final SubLObject obj, final SubLObject visitor_fn)
  {
    return visit_defstruct_process_wrapper( obj, visitor_fn );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 37127L)
  public static SubLObject new_process_wrapper(final SubLObject name, final SubLObject process_wrapper_function, SubLObject rest_args)
  {
    if( rest_args == UNPROVIDED )
    {
      rest_args = NIL;
    }
    final SubLObject process_lock = Locks.make_lock( name );
    SubLObject process_wrapper = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( process_lock );
      process_wrapper = make_process_wrapper( ConsesLow.list( $kw71$LOCK, process_lock, $kw215$STATE, $kw220$STARTING, $kw214$ID, integer_sequence_generator.integer_sequence_generator_next( $process_wrapper_isg$
          .getGlobalValue() ) ) );
      final SubLObject process = make_cyc_server_process_with_args( name, $sym221$NEW_PROCESS_WRAPPER_INT, ConsesLow.list( process_wrapper, process_wrapper_function, rest_args ) );
      _csetf_process_wrapper_process( process_wrapper, process );
      _csetf_process_wrapper_state( process_wrapper, $kw102$RUNNING );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( process_lock );
      }
    }
    return process_wrapper;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 37974L)
  public static SubLObject new_process_wrapper_int(final SubLObject process_wrapper, final SubLObject process_wrapper_function, final SubLObject rest_args)
  {
    SubLObject result = NIL;
    result = Functions.apply( process_wrapper_function, ConsesLow.cons( process_wrapper, rest_args ) );
    final SubLObject lock = process_wrapper_lock( process_wrapper );
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_process_wrapper_state( process_wrapper, $kw27$COMPLETED );
      _csetf_process_wrapper_process( process_wrapper, NIL );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 38520L)
  public static SubLObject process_wrapper_get_id(final SubLObject process_wrapper)
  {
    return process_wrapper_id( process_wrapper );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 38641L)
  public static SubLObject process_wrapper_get_process(final SubLObject process_wrapper)
  {
    return process_wrapper_process( process_wrapper );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 38754L)
  public static SubLObject process_wrapper_get_state(final SubLObject process_wrapper)
  {
    return process_wrapper_state( process_wrapper );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 38863L)
  public static SubLObject process_wrapper_get_lock(final SubLObject process_wrapper)
  {
    return process_wrapper_lock( process_wrapper );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 38973L)
  public static SubLObject process_wrapper_get_plist(final SubLObject process_wrapper)
  {
    return conses_high.copy_list( process_wrapper_plist( process_wrapper ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39097L)
  public static SubLObject process_wrapper_process_startingP(final SubLObject process_wrapper)
  {
    return Equality.eq( process_wrapper_state( process_wrapper ), $kw220$STARTING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39241L)
  public static SubLObject process_wrapper_process_runningP(final SubLObject process_wrapper)
  {
    return Equality.eq( process_wrapper_state( process_wrapper ), $kw102$RUNNING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39371L)
  public static SubLObject process_wrapper_process_completedP(final SubLObject process_wrapper)
  {
    return Equality.eq( process_wrapper_state( process_wrapper ), $kw27$COMPLETED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39507L)
  public static SubLObject process_wrapper_process_abortedP(final SubLObject process_wrapper)
  {
    return Equality.eq( process_wrapper_state( process_wrapper ), $kw222$ABORTED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39637L)
  public static SubLObject process_wrapper_process_pausingP(final SubLObject process_wrapper)
  {
    return Equality.eq( process_wrapper_state( process_wrapper ), $kw223$PAUSING );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39767L)
  public static SubLObject process_wrapper_process_pausedP(final SubLObject process_wrapper)
  {
    return Equality.eq( process_wrapper_state( process_wrapper ), $kw224$PAUSED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39895L)
  public static SubLObject process_wrapper_process_pause(final SubLObject process_wrapper)
  {
    final SubLObject lock = process_wrapper_lock( process_wrapper );
    final SubLObject result = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject pcase_var = process_wrapper_state( process_wrapper );
      if( pcase_var.eql( $kw102$RUNNING ) )
      {
        _csetf_process_wrapper_state( process_wrapper, $kw223$PAUSING );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 40196L)
  public static SubLObject process_wrapper_process_resume(final SubLObject process_wrapper)
  {
    final SubLObject lock = process_wrapper_lock( process_wrapper );
    final SubLObject result = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject pcase_var = process_wrapper_state( process_wrapper );
      if( pcase_var.eql( $kw223$PAUSING ) )
      {
        _csetf_process_wrapper_state( process_wrapper, $kw102$RUNNING );
      }
      else if( pcase_var.eql( $kw224$PAUSED ) )
      {
        Threads.process_unblock( process_wrapper_process( process_wrapper ) );
        _csetf_process_wrapper_state( process_wrapper, $kw102$RUNNING );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 40630L)
  public static SubLObject process_wrapper_checkpoint(final SubLObject process_wrapper)
  {
    if( Threads.current_process().eql( process_wrapper_process( process_wrapper ) ) )
    {
      final SubLObject lock = process_wrapper_lock( process_wrapper );
      SubLObject blockP = NIL;
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        final SubLObject pcase_var = process_wrapper_state( process_wrapper );
        if( pcase_var.eql( $kw223$PAUSING ) )
        {
          _csetf_process_wrapper_state( process_wrapper, $kw224$PAUSED );
          blockP = T;
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
      if( NIL != blockP )
      {
        Threads.process_block();
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 41360L)
  public static SubLObject process_wrapper_block(final SubLObject process_wrapper)
  {
    if( Threads.current_process().eql( process_wrapper_process( process_wrapper ) ) )
    {
      final SubLObject lock = process_wrapper_lock( process_wrapper );
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( lock );
        _csetf_process_wrapper_state( process_wrapper, $kw224$PAUSED );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( lock );
        }
      }
      Threads.process_block();
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 41821L)
  public static SubLObject process_wrapper_process_abort(final SubLObject process_wrapper)
  {
    final SubLObject lock = process_wrapper_lock( process_wrapper );
    final SubLObject release_lock_then_killP = Equality.eq( Threads.current_process(), process_wrapper_process( process_wrapper ) );
    SubLObject result = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      _csetf_process_wrapper_state( process_wrapper, $kw222$ABORTED );
      if( NIL == release_lock_then_killP )
      {
        result = Threads.kill_process( process_wrapper_process( process_wrapper ) );
        _csetf_process_wrapper_process( process_wrapper, NIL );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    if( NIL != release_lock_then_killP )
    {
      result = Threads.kill_process( process_wrapper_process( process_wrapper ) );
      _csetf_process_wrapper_process( process_wrapper, NIL );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 42660L)
  public static SubLObject process_wrapper_set_property(final SubLObject process_wrapper, final SubLObject indicator, final SubLObject value)
  {
    final SubLObject lock = process_wrapper_lock( process_wrapper );
    SubLObject result = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      final SubLObject plist = process_wrapper_plist( process_wrapper );
      result = conses_high.putf( plist, indicator, value );
      _csetf_process_wrapper_plist( process_wrapper, result );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 43015L)
  public static SubLObject process_wrapper_get_property(final SubLObject process_wrapper, final SubLObject indicator, SubLObject default_value)
  {
    if( default_value == UNPROVIDED )
    {
      default_value = NIL;
    }
    final SubLObject lock = process_wrapper_lock( process_wrapper );
    SubLObject result = NIL;
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( lock );
      result = conses_high.getf( process_wrapper_plist( process_wrapper ), indicator, default_value );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( lock );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 43316L)
  public static SubLObject make_cyc_server_process(final SubLObject name, final SubLObject function)
  {
    return subl_promotions.make_process_with_args( name, $sym225$CYC_SERVER_PROCESS_FUNCALL, ConsesLow.list( function ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 43772L)
  public static SubLObject cyc_server_process_funcall(final SubLObject function)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = Packages.$package$.currentBinding( thread );
    final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding( thread );
    final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding( thread );
    final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding( thread );
    try
    {
      Packages.$package$.bind( Packages.find_package( $str100$CYC ), thread );
      reader.$read_default_float_format$.bind( $sym226$DOUBLE_FLOAT, thread );
      print_high.$print_readably$.bind( NIL, thread );
      reader.$read_eval$.bind( NIL, thread );
      final SubLObject old_priority = Threads.process_priority( Threads.current_process() );
      try
      {
        Threads.set_process_priority( Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue() );
        return Functions.funcall( function );
      }
      finally
      {
        final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          Threads.set_process_priority( Threads.current_process(), old_priority );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$6, thread );
        }
      }
    }
    finally
    {
      reader.$read_eval$.rebind( _prev_bind_4, thread );
      print_high.$print_readably$.rebind( _prev_bind_3, thread );
      reader.$read_default_float_format$.rebind( _prev_bind_2, thread );
      Packages.$package$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 43978L)
  public static SubLObject make_cyc_server_process_with_args(final SubLObject name, final SubLObject function, SubLObject args)
  {
    if( args == UNPROVIDED )
    {
      args = NIL;
    }
    return subl_promotions.make_process_with_args( name, $sym227$CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS, ConsesLow.list( ConsesLow.cons( function, args ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 44275L)
  public static SubLObject cyc_server_process_funcall_with_args(final SubLObject functionXargs)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject function = NIL;
    SubLObject args = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( functionXargs, functionXargs, $list228 );
    function = functionXargs.first();
    final SubLObject current = args = functionXargs.rest();
    final SubLObject _prev_bind_0 = Packages.$package$.currentBinding( thread );
    final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding( thread );
    final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding( thread );
    final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding( thread );
    try
    {
      Packages.$package$.bind( Packages.find_package( $str100$CYC ), thread );
      reader.$read_default_float_format$.bind( $sym226$DOUBLE_FLOAT, thread );
      print_high.$print_readably$.bind( NIL, thread );
      reader.$read_eval$.bind( NIL, thread );
      final SubLObject old_priority = Threads.process_priority( Threads.current_process() );
      try
      {
        Threads.set_process_priority( Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue() );
        return Functions.apply( function, args );
      }
      finally
      {
        final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          Threads.set_process_priority( Threads.current_process(), old_priority );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
        }
      }
    }
    finally
    {
      reader.$read_eval$.rebind( _prev_bind_4, thread );
      print_high.$print_readably$.rebind( _prev_bind_3, thread );
      reader.$read_default_float_format$.rebind( _prev_bind_2, thread );
      Packages.$package$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 44559L)
  public static SubLObject process_count()
  {
    return Sequences.length( Threads.all_processes() );
  }

  public static SubLObject declare_process_utilities_file()
  {
    SubLFiles.declareFunction( me, "debug_initial_process", "DEBUG-INITIAL-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( me, "interrupt_initial_process", "INTERRUPT-INITIAL-PROCESS", 0, 0, false );
    SubLFiles.declareFunction( me, "process_idleP", "PROCESS-IDLE?", 1, 0, false );
    SubLFiles.declareFunction( me, "process_busyP", "PROCESS-BUSY?", 1, 0, false );
    SubLFiles.declareFunction( me, "process_waitingP", "PROCESS-WAITING?", 1, 0, false );
    SubLFiles.declareFunction( me, "process_runningP", "PROCESS-RUNNING?", 1, 0, false );
    SubLFiles.declareFunction( me, "process_suid", "PROCESS-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "find_process_by_suid", "FIND-PROCESS-BY-SUID", 1, 0, false );
    SubLFiles.declareFunction( me, "find_process_by_name", "FIND-PROCESS-BY-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "gather_processes_by_name", "GATHER-PROCESSES-BY-NAME", 1, 1, false );
    SubLFiles.declareFunction( me, "active_process_at_startupP", "ACTIVE-PROCESS-AT-STARTUP?", 1, 0, false );
    SubLFiles.declareFunction( me, "note_active_processes_at_startup", "NOTE-ACTIVE-PROCESSES-AT-STARTUP", 0, 0, false );
    SubLFiles.declareFunction( me, "process_form", "PROCESS-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "process_note_form", "PROCESS-NOTE-FORM", 2, 0, false );
    SubLFiles.declareFunction( me, "current_process_note_form", "CURRENT-PROCESS-NOTE-FORM", 1, 0, false );
    SubLFiles.declareFunction( me, "current_process_clear_form", "CURRENT-PROCESS-CLEAR-FORM", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_invalid_process_forms", "CLEAR-INVALID-PROCESS-FORMS", 0, 0, false );
    SubLFiles.declareFunction( me, "task_print_function_trampoline", "TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "task_p", "TASK-P", 1, 0, false );
    new $task_p$UnaryFunction();
    SubLFiles.declareFunction( me, "task_process", "TASK-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "task_completed", "TASK-COMPLETED", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_task_process", "_CSETF-TASK-PROCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_task_completed", "_CSETF-TASK-COMPLETED", 2, 0, false );
    SubLFiles.declareFunction( me, "make_task", "MAKE-TASK", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_task", "VISIT-DEFSTRUCT-TASK", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_task_method", "VISIT-DEFSTRUCT-OBJECT-TASK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_task", "NEW-TASK", 2, 2, false );
    SubLFiles.declareFunction( me, "new_task_internal", "NEW-TASK-INTERNAL", 5, 0, false );
    SubLFiles.declareFunction( me, "thinking_task_print_function_trampoline", "THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "thinking_task_p", "THINKING-TASK-P", 1, 0, false );
    new $thinking_task_p$UnaryFunction();
    SubLFiles.declareFunction( me, "t_task_lock", "T-TASK-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "t_task_thread", "T-TASK-THREAD", 1, 0, false );
    SubLFiles.declareFunction( me, "t_task_name", "T-TASK-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "t_task_status", "T-TASK-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "t_task_progress_message", "T-TASK-PROGRESS-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "t_task_progress_sofar", "T-TASK-PROGRESS-SOFAR", 1, 0, false );
    SubLFiles.declareFunction( me, "t_task_progress_total", "T-TASK-PROGRESS-TOTAL", 1, 0, false );
    SubLFiles.declareFunction( me, "t_task_start_time", "T-TASK-START-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "t_task_finish_time", "T-TASK-FINISH-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "t_task_result", "T-TASK-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "t_task_error_message", "T-TASK-ERROR-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "t_task_properties", "T-TASK-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_lock", "_CSETF-T-TASK-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_thread", "_CSETF-T-TASK-THREAD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_name", "_CSETF-T-TASK-NAME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_status", "_CSETF-T-TASK-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_progress_message", "_CSETF-T-TASK-PROGRESS-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_progress_sofar", "_CSETF-T-TASK-PROGRESS-SOFAR", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_progress_total", "_CSETF-T-TASK-PROGRESS-TOTAL", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_start_time", "_CSETF-T-TASK-START-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_finish_time", "_CSETF-T-TASK-FINISH-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_result", "_CSETF-T-TASK-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_error_message", "_CSETF-T-TASK-ERROR-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_t_task_properties", "_CSETF-T-TASK-PROPERTIES", 2, 0, false );
    SubLFiles.declareFunction( me, "make_thinking_task", "MAKE-THINKING-TASK", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_thinking_task", "VISIT-DEFSTRUCT-THINKING-TASK", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_thinking_task_method", "VISIT-DEFSTRUCT-OBJECT-THINKING-TASK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_thinking_task", "NEW-THINKING-TASK", 2, 1, false );
    SubLFiles.declareMacro( me, "with_thinking_lock", "WITH-THINKING-LOCK" );
    SubLFiles.declareFunction( me, "thinking_note_thread", "THINKING-NOTE-THREAD", 2, 0, false );
    SubLFiles.declareFunction( me, "thinking_clear_thread", "THINKING-CLEAR-THREAD", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_note_status", "THINKING-NOTE-STATUS", 2, 0, false );
    SubLFiles.declareFunction( me, "thinking_note_progress_message", "THINKING-NOTE-PROGRESS-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "thinking_note_progress_sofar", "THINKING-NOTE-PROGRESS-SOFAR", 2, 0, false );
    SubLFiles.declareFunction( me, "thinking_note_progress_total", "THINKING-NOTE-PROGRESS-TOTAL", 2, 0, false );
    SubLFiles.declareFunction( me, "thinking_note_start_time", "THINKING-NOTE-START-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "thinking_note_finish_time", "THINKING-NOTE-FINISH-TIME", 2, 0, false );
    SubLFiles.declareFunction( me, "thinking_note_result", "THINKING-NOTE-RESULT", 2, 0, false );
    SubLFiles.declareFunction( me, "thinking_note_error_message", "THINKING-NOTE-ERROR-MESSAGE", 2, 0, false );
    SubLFiles.declareFunction( me, "thinking_note_property", "THINKING-NOTE-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "thinking_lock", "THINKING-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_thread", "THINKING-THREAD", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_name", "THINKING-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_status", "THINKING-STATUS", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_progress_message", "THINKING-PROGRESS-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_progress_sofar", "THINKING-PROGRESS-SOFAR", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_progress_total", "THINKING-PROGRESS-TOTAL", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_start_time", "THINKING-START-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_finish_time", "THINKING-FINISH-TIME", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_result", "THINKING-RESULT", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_error_message", "THINKING-ERROR-MESSAGE", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_property", "THINKING-PROPERTY", 2, 0, false );
    SubLFiles.declareFunction( me, "thinking_properties", "THINKING-PROPERTIES", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_task", "THINKING-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "thinking_start", "THINKING-START", 3, 0, false );
    SubLFiles.declareFunction( me, "thinking_stop", "THINKING-STOP", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_thread_run", "THINKING-THREAD-RUN", 3, 0, false );
    SubLFiles.declareFunction( me, "thinking_thread_initialize", "THINKING-THREAD-INITIALIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "thinking_thread_finalize", "THINKING-THREAD-FINALIZE", 4, 0, false );
    SubLFiles.declareFunction( me, "ipc_queue_print_function_trampoline", "IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "ipc_queue_p", "IPC-QUEUE-P", 1, 0, false );
    new $ipc_queue_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ipc_queue_lock", "IPC-QUEUE-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "ipc_queue_semaphore", "IPC-QUEUE-SEMAPHORE", 1, 0, false );
    SubLFiles.declareFunction( me, "ipc_queue_data_queue", "IPC-QUEUE-DATA-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ipc_queue_lock", "_CSETF-IPC-QUEUE-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ipc_queue_semaphore", "_CSETF-IPC-QUEUE-SEMAPHORE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ipc_queue_data_queue", "_CSETF-IPC-QUEUE-DATA-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_ipc_queue", "MAKE-IPC-QUEUE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_ipc_queue", "VISIT-DEFSTRUCT-IPC-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_ipc_queue_method", "VISIT-DEFSTRUCT-OBJECT-IPC-QUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_ipc_queue", "NEW-IPC-QUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "ipc_enqueue", "IPC-ENQUEUE", 2, 1, false );
    SubLFiles.declareFunction( me, "ipc_dequeue", "IPC-DEQUEUE", 1, 1, false );
    SubLFiles.declareFunction( me, "check_ipcq_synchronized", "CHECK-IPCQ-SYNCHRONIZED", 1, 0, false );
    SubLFiles.declareFunction( me, "ipcq_debug", "IPCQ-DEBUG", 2, 3, false );
    SubLFiles.declareFunction( me, "ipc_dequeue_n", "IPC-DEQUEUE-N", 1, 2, false );
    SubLFiles.declareFunction( me, "ipc_drain", "IPC-DRAIN", 1, 1, false );
    SubLFiles.declareFunction( me, "ipc_dequeue_with_timeout", "IPC-DEQUEUE-WITH-TIMEOUT", 2, 1, false );
    SubLFiles.declareFunction( me, "ipc_current_queue_size", "IPC-CURRENT-QUEUE-SIZE", 1, 0, false );
    SubLFiles.declareFunction( me, "ipc_current_queue_content", "IPC-CURRENT-QUEUE-CONTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "launch_ipcq_test_producer", "LAUNCH-IPCQ-TEST-PRODUCER", 1, 1, false );
    SubLFiles.declareFunction( me, "ipcq_test_producer_run", "IPCQ-TEST-PRODUCER-RUN", 1, 1, false );
    SubLFiles.declareFunction( me, "test_ipc_enqueue_dequeue", "TEST-IPC-ENQUEUE-DEQUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "test_ipc_enqueue_drain", "TEST-IPC-ENQUEUE-DRAIN", 0, 0, false );
    SubLFiles.declareFunction( me, "test_ipc_enqueue_drain_dequeue", "TEST-IPC-ENQUEUE-DRAIN-DEQUEUE", 0, 0, false );
    SubLFiles.declareFunction( me, "ordered_ipc_queue_print_function_trampoline", "ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "ordered_ipc_queue_p", "ORDERED-IPC-QUEUE-P", 1, 0, false );
    new $ordered_ipc_queue_p$UnaryFunction();
    SubLFiles.declareFunction( me, "ordrd_ipcq_lock", "ORDRD-IPCQ-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "ordrd_ipcq_producer_isg", "ORDRD-IPCQ-PRODUCER-ISG", 1, 0, false );
    SubLFiles.declareFunction( me, "ordrd_ipcq_consumer_isg", "ORDRD-IPCQ-CONSUMER-ISG", 1, 0, false );
    SubLFiles.declareFunction( me, "ordrd_ipcq_payload", "ORDRD-IPCQ-PAYLOAD", 1, 0, false );
    SubLFiles.declareFunction( me, "ordrd_ipcq_early_consumer_semaphore", "ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ordrd_ipcq_lock", "_CSETF-ORDRD-IPCQ-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ordrd_ipcq_producer_isg", "_CSETF-ORDRD-IPCQ-PRODUCER-ISG", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ordrd_ipcq_consumer_isg", "_CSETF-ORDRD-IPCQ-CONSUMER-ISG", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ordrd_ipcq_payload", "_CSETF-ORDRD-IPCQ-PAYLOAD", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_ordrd_ipcq_early_consumer_semaphore", "_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE", 2, 0, false );
    SubLFiles.declareFunction( me, "make_ordered_ipc_queue", "MAKE-ORDERED-IPC-QUEUE", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_ordered_ipc_queue", "VISIT-DEFSTRUCT-ORDERED-IPC-QUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_ordered_ipc_queue_method", "VISIT-DEFSTRUCT-OBJECT-ORDERED-IPC-QUEUE-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_ordered_ipc_queue", "NEW-ORDERED-IPC-QUEUE", 1, 1, false );
    SubLFiles.declareFunction( me, "ordered_ipc_enqueue", "ORDERED-IPC-ENQUEUE", 2, 0, false );
    SubLFiles.declareFunction( me, "ordered_ipc_dequeue", "ORDERED-IPC-DEQUEUE", 1, 0, false );
    SubLFiles.declareFunction( me, "ordered_ipc_queue_emptyP", "ORDERED-IPC-QUEUE-EMPTY?", 1, 0, false );
    SubLFiles.declareFunction( me, "ordered_ipc_current_queue_size", "ORDERED-IPC-CURRENT-QUEUE-SIZE", 1, 1, false );
    SubLFiles.declareFunction( me, "ordered_ipc_current_queue_contents", "ORDERED-IPC-CURRENT-QUEUE-CONTENTS", 1, 0, false );
    SubLFiles.declareFunction( me, "ordered_ipc_queue_quiescedP", "ORDERED-IPC-QUEUE-QUIESCED?", 1, 0, false );
    SubLFiles.declareFunction( me, "kill_process_named", "KILL-PROCESS-NAMED", 1, 0, false );
    SubLFiles.declareFunction( me, "process_named", "PROCESS-NAMED", 1, 0, false );
    SubLFiles.declareFunction( me, "process_exhaust_immediately_fn", "PROCESS-EXHAUST-IMMEDIATELY-FN", 0, 0, false );
    SubLFiles.declareFunction( me, "make_exhausted_process", "MAKE-EXHAUSTED-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_process_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_process", "VISIT-DEFSTRUCT-OBJECT-PROCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_lock_method", "VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_lock", "VISIT-DEFSTRUCT-OBJECT-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_print_function_trampoline", "PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_p", "PROCESS-WRAPPER-P", 1, 0, false );
    new $process_wrapper_p$UnaryFunction();
    SubLFiles.declareFunction( me, "process_wrapper_id", "PROCESS-WRAPPER-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_process", "PROCESS-WRAPPER-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_state", "PROCESS-WRAPPER-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_lock", "PROCESS-WRAPPER-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_plist", "PROCESS-WRAPPER-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "_csetf_process_wrapper_id", "_CSETF-PROCESS-WRAPPER-ID", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_process_wrapper_process", "_CSETF-PROCESS-WRAPPER-PROCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_process_wrapper_state", "_CSETF-PROCESS-WRAPPER-STATE", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_process_wrapper_lock", "_CSETF-PROCESS-WRAPPER-LOCK", 2, 0, false );
    SubLFiles.declareFunction( me, "_csetf_process_wrapper_plist", "_CSETF-PROCESS-WRAPPER-PLIST", 2, 0, false );
    SubLFiles.declareFunction( me, "make_process_wrapper", "MAKE-PROCESS-WRAPPER", 0, 1, false );
    SubLFiles.declareFunction( me, "visit_defstruct_process_wrapper", "VISIT-DEFSTRUCT-PROCESS-WRAPPER", 2, 0, false );
    SubLFiles.declareFunction( me, "visit_defstruct_object_process_wrapper_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-WRAPPER-METHOD", 2, 0, false );
    SubLFiles.declareFunction( me, "new_process_wrapper", "NEW-PROCESS-WRAPPER", 2, 1, false );
    SubLFiles.declareFunction( me, "new_process_wrapper_int", "NEW-PROCESS-WRAPPER-INT", 3, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_get_id", "PROCESS-WRAPPER-GET-ID", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_get_process", "PROCESS-WRAPPER-GET-PROCESS", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_get_state", "PROCESS-WRAPPER-GET-STATE", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_get_lock", "PROCESS-WRAPPER-GET-LOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_get_plist", "PROCESS-WRAPPER-GET-PLIST", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_process_startingP", "PROCESS-WRAPPER-PROCESS-STARTING?", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_process_runningP", "PROCESS-WRAPPER-PROCESS-RUNNING?", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_process_completedP", "PROCESS-WRAPPER-PROCESS-COMPLETED?", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_process_abortedP", "PROCESS-WRAPPER-PROCESS-ABORTED?", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_process_pausingP", "PROCESS-WRAPPER-PROCESS-PAUSING?", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_process_pausedP", "PROCESS-WRAPPER-PROCESS-PAUSED?", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_process_pause", "PROCESS-WRAPPER-PROCESS-PAUSE", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_process_resume", "PROCESS-WRAPPER-PROCESS-RESUME", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_checkpoint", "PROCESS-WRAPPER-CHECKPOINT", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_block", "PROCESS-WRAPPER-BLOCK", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_process_abort", "PROCESS-WRAPPER-PROCESS-ABORT", 1, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_set_property", "PROCESS-WRAPPER-SET-PROPERTY", 3, 0, false );
    SubLFiles.declareFunction( me, "process_wrapper_get_property", "PROCESS-WRAPPER-GET-PROPERTY", 2, 1, false );
    SubLFiles.declareFunction( me, "make_cyc_server_process", "MAKE-CYC-SERVER-PROCESS", 2, 0, false );
    SubLFiles.declareFunction( me, "cyc_server_process_funcall", "CYC-SERVER-PROCESS-FUNCALL", 1, 0, false );
    SubLFiles.declareFunction( me, "make_cyc_server_process_with_args", "MAKE-CYC-SERVER-PROCESS-WITH-ARGS", 2, 1, false );
    SubLFiles.declareFunction( me, "cyc_server_process_funcall_with_args", "CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS", 1, 0, false );
    SubLFiles.declareFunction( me, "process_count", "PROCESS-COUNT", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_process_utilities_file()
  {
    $active_processes_at_startup$ = SubLFiles.deflexical( "*ACTIVE-PROCESSES-AT-STARTUP*", ( maybeDefault( $sym10$_ACTIVE_PROCESSES_AT_STARTUP_, $active_processes_at_startup$, NIL ) ) );
    $process_form_map$ = SubLFiles.deflexical( "*PROCESS-FORM-MAP*", maybeDefault( $sym11$_PROCESS_FORM_MAP_, $process_form_map$, () -> ( Hashtables.make_hash_table( TEN_INTEGER, Symbols.symbol_function( EQ ),
        UNPROVIDED ) ) ) );
    $process_form_lock$ = SubLFiles.deflexical( "*PROCESS-FORM-LOCK*", Locks.make_lock( $str12$Process_Form ) );
    $dtp_task$ = SubLFiles.defconstant( "*DTP-TASK*", $sym13$TASK );
    $dtp_thinking_task$ = SubLFiles.defconstant( "*DTP-THINKING-TASK*", $sym39$THINKING_TASK );
    $thinking_task$ = SubLFiles.defparameter( "*THINKING-TASK*", NIL );
    $dtp_ipc_queue$ = SubLFiles.defconstant( "*DTP-IPC-QUEUE*", $sym106$IPC_QUEUE );
    $ipcq_debugP$ = SubLFiles.defparameter( "*IPCQ-DEBUG?*", NIL );
    $ipcq_test_items$ = SubLFiles.deflexical( "*IPCQ-TEST-ITEMS*", $list141 );
    $dtp_ordered_ipc_queue$ = SubLFiles.defconstant( "*DTP-ORDERED-IPC-QUEUE*", $sym157$ORDERED_IPC_QUEUE );
    $ordered_ipcq_empty$ = SubLFiles.defconstant( "*ORDERED-IPCQ-EMPTY*", Symbols.make_symbol( $str181$empty_ordered_IPC_queue_entry ) );
    $ordered_ipc_current_queue_size_estimation_threshold$ = SubLFiles.defparameter( "*ORDERED-IPC-CURRENT-QUEUE-SIZE-ESTIMATION-THRESHOLD*", $int185$212 );
    $dtp_process_wrapper$ = SubLFiles.defconstant( "*DTP-PROCESS-WRAPPER*", $sym196$PROCESS_WRAPPER );
    $process_wrapper_isg$ = SubLFiles.deflexical( "*PROCESS-WRAPPER-ISG*", maybeDefault( $sym219$_PROCESS_WRAPPER_ISG_, $process_wrapper_isg$, () -> ( integer_sequence_generator.new_integer_sequence_generator(
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_process_utilities_file()
  {
    access_macros.define_obsolete_register( $sym0$INTERRUPT_INITIAL_PROCESS, $list1 );
    subl_macro_promotions.declare_defglobal( $sym10$_ACTIVE_PROCESSES_AT_STARTUP_ );
    subl_macro_promotions.declare_defglobal( $sym11$_PROCESS_FORM_MAP_ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_task$.getGlobalValue(), Symbols.symbol_function( $sym20$TASK_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list21 );
    Structures.def_csetf( $sym22$TASK_PROCESS, $sym23$_CSETF_TASK_PROCESS );
    Structures.def_csetf( $sym24$TASK_COMPLETED, $sym25$_CSETF_TASK_COMPLETED );
    Equality.identity( $sym13$TASK );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_task$.getGlobalValue(), Symbols.symbol_function( $sym33$VISIT_DEFSTRUCT_OBJECT_TASK_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_thinking_task$.getGlobalValue(), Symbols.symbol_function( $sym45$THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list46 );
    Structures.def_csetf( $sym47$T_TASK_LOCK, $sym48$_CSETF_T_TASK_LOCK );
    Structures.def_csetf( $sym49$T_TASK_THREAD, $sym50$_CSETF_T_TASK_THREAD );
    Structures.def_csetf( $sym51$T_TASK_NAME, $sym52$_CSETF_T_TASK_NAME );
    Structures.def_csetf( $sym53$T_TASK_STATUS, $sym54$_CSETF_T_TASK_STATUS );
    Structures.def_csetf( $sym55$T_TASK_PROGRESS_MESSAGE, $sym56$_CSETF_T_TASK_PROGRESS_MESSAGE );
    Structures.def_csetf( $sym57$T_TASK_PROGRESS_SOFAR, $sym58$_CSETF_T_TASK_PROGRESS_SOFAR );
    Structures.def_csetf( $sym59$T_TASK_PROGRESS_TOTAL, $sym60$_CSETF_T_TASK_PROGRESS_TOTAL );
    Structures.def_csetf( $sym61$T_TASK_START_TIME, $sym62$_CSETF_T_TASK_START_TIME );
    Structures.def_csetf( $sym63$T_TASK_FINISH_TIME, $sym64$_CSETF_T_TASK_FINISH_TIME );
    Structures.def_csetf( $sym65$T_TASK_RESULT, $sym66$_CSETF_T_TASK_RESULT );
    Structures.def_csetf( $sym67$T_TASK_ERROR_MESSAGE, $sym68$_CSETF_T_TASK_ERROR_MESSAGE );
    Structures.def_csetf( $sym69$T_TASK_PROPERTIES, $sym70$_CSETF_T_TASK_PROPERTIES );
    Equality.identity( $sym39$THINKING_TASK );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_thinking_task$.getGlobalValue(), Symbols.symbol_function( $sym84$VISIT_DEFSTRUCT_OBJECT_THINKING_TASK_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_ipc_queue$.getGlobalValue(), Symbols.symbol_function( $sym112$IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list113 );
    Structures.def_csetf( $sym114$IPC_QUEUE_LOCK, $sym115$_CSETF_IPC_QUEUE_LOCK );
    Structures.def_csetf( $sym116$IPC_QUEUE_SEMAPHORE, $sym117$_CSETF_IPC_QUEUE_SEMAPHORE );
    Structures.def_csetf( $sym118$IPC_QUEUE_DATA_QUEUE, $sym119$_CSETF_IPC_QUEUE_DATA_QUEUE );
    Equality.identity( $sym106$IPC_QUEUE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ipc_queue$.getGlobalValue(), Symbols.symbol_function( $sym123$VISIT_DEFSTRUCT_OBJECT_IPC_QUEUE_METHOD ) );
    generic_testing.define_test_case_table_int( $sym146$TEST_IPC_ENQUEUE_DEQUEUE, ConsesLow.list( new SubLObject[] { $kw147$TEST, NIL, $kw148$OWNER, NIL, $kw149$CLASSES, $list150, $kw151$KB, $kw152$TINY, $kw153$WORKING_,
      T
    } ), $list154 );
    generic_testing.define_test_case_table_int( $sym155$TEST_IPC_ENQUEUE_DRAIN, ConsesLow.list( new SubLObject[] { $kw147$TEST, NIL, $kw148$OWNER, NIL, $kw149$CLASSES, $list150, $kw151$KB, $kw152$TINY, $kw153$WORKING_, T
    } ), $list154 );
    generic_testing.define_test_case_table_int( $sym156$TEST_IPC_ENQUEUE_DRAIN_DEQUEUE, ConsesLow.list( new SubLObject[] { $kw147$TEST, NIL, $kw148$OWNER, NIL, $kw149$CLASSES, $list150, $kw151$KB, $kw152$TINY,
      $kw153$WORKING_, T
    } ), $list154 );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_ordered_ipc_queue$.getGlobalValue(), Symbols.symbol_function( $sym163$ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list164 );
    Structures.def_csetf( $sym165$ORDRD_IPCQ_LOCK, $sym166$_CSETF_ORDRD_IPCQ_LOCK );
    Structures.def_csetf( $sym167$ORDRD_IPCQ_PRODUCER_ISG, $sym168$_CSETF_ORDRD_IPCQ_PRODUCER_ISG );
    Structures.def_csetf( $sym169$ORDRD_IPCQ_CONSUMER_ISG, $sym170$_CSETF_ORDRD_IPCQ_CONSUMER_ISG );
    Structures.def_csetf( $sym171$ORDRD_IPCQ_PAYLOAD, $sym172$_CSETF_ORDRD_IPCQ_PAYLOAD );
    Structures.def_csetf( $sym173$ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE, $sym174$_CSETF_ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE );
    Equality.identity( $sym157$ORDERED_IPC_QUEUE );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_ordered_ipc_queue$.getGlobalValue(), Symbols.symbol_function(
        $sym180$VISIT_DEFSTRUCT_OBJECT_ORDERED_IPC_QUEUE_METHOD ) );
    utilities_macros.register_cyc_api_function( $sym186$KILL_PROCESS_NAMED, $list187, $str188$_param_NAME__stringp____Kills_any, $list189, $list190 );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_process$.getGlobalValue(), Symbols.symbol_function( $sym192$VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD ) );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_lock$.getGlobalValue(), Symbols.symbol_function( $sym194$VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD ) );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $dtp_process_wrapper$.getGlobalValue(), Symbols.symbol_function( $sym202$PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE ) );
    SubLSpecialOperatorDeclarations.proclaim( $list203 );
    Structures.def_csetf( $sym204$PROCESS_WRAPPER_ID, $sym205$_CSETF_PROCESS_WRAPPER_ID );
    Structures.def_csetf( $sym206$PROCESS_WRAPPER_PROCESS, $sym207$_CSETF_PROCESS_WRAPPER_PROCESS );
    Structures.def_csetf( $sym208$PROCESS_WRAPPER_STATE, $sym209$_CSETF_PROCESS_WRAPPER_STATE );
    Structures.def_csetf( $sym210$PROCESS_WRAPPER_LOCK, $sym211$_CSETF_PROCESS_WRAPPER_LOCK );
    Structures.def_csetf( $sym212$PROCESS_WRAPPER_PLIST, $sym213$_CSETF_PROCESS_WRAPPER_PLIST );
    Equality.identity( $sym196$PROCESS_WRAPPER );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_process_wrapper$.getGlobalValue(), Symbols.symbol_function(
        $sym218$VISIT_DEFSTRUCT_OBJECT_PROCESS_WRAPPER_METHOD ) );
    subl_macro_promotions.declare_defglobal( $sym219$_PROCESS_WRAPPER_ISG_ );
    utilities_macros.note_funcall_helper_function( $sym225$CYC_SERVER_PROCESS_FUNCALL );
    utilities_macros.note_funcall_helper_function( $sym227$CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_process_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_process_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_process_utilities_file();
  }
  static
  {
    me = new process_utilities();
    $active_processes_at_startup$ = null;
    $process_form_map$ = null;
    $process_form_lock$ = null;
    $dtp_task$ = null;
    $dtp_thinking_task$ = null;
    $thinking_task$ = null;
    $dtp_ipc_queue$ = null;
    $ipcq_debugP$ = null;
    $ipcq_test_items$ = null;
    $dtp_ordered_ipc_queue$ = null;
    $ordered_ipcq_empty$ = null;
    $ordered_ipc_current_queue_size_estimation_threshold$ = null;
    $dtp_process_wrapper$ = null;
    $process_wrapper_isg$ = null;
    $sym0$INTERRUPT_INITIAL_PROCESS = makeSymbol( "INTERRUPT-INITIAL-PROCESS" );
    $list1 = ConsesLow.list( makeSymbol( "DEBUG-INITIAL-PROCESS" ) );
    $str2$Idle = makeString( "Idle" );
    $str3$Sleep = makeString( "Sleep" );
    $str4$wait = makeString( "wait" );
    $str5$blocked = makeString( "blocked" );
    $str6$run = makeString( "run" );
    $sym7$PROCESSP = makeSymbol( "PROCESSP" );
    $sym8$INTEGERP = makeSymbol( "INTEGERP" );
    $sym9$PROCESS_NAME = makeSymbol( "PROCESS-NAME" );
    $sym10$_ACTIVE_PROCESSES_AT_STARTUP_ = makeSymbol( "*ACTIVE-PROCESSES-AT-STARTUP*" );
    $sym11$_PROCESS_FORM_MAP_ = makeSymbol( "*PROCESS-FORM-MAP*" );
    $str12$Process_Form = makeString( "Process Form" );
    $sym13$TASK = makeSymbol( "TASK" );
    $sym14$TASK_P = makeSymbol( "TASK-P" );
    $list15 = ConsesLow.list( makeSymbol( "PROCESS" ), makeSymbol( "COMPLETED" ) );
    $list16 = ConsesLow.list( makeKeyword( "PROCESS" ), makeKeyword( "COMPLETED" ) );
    $list17 = ConsesLow.list( makeSymbol( "TASK-PROCESS" ), makeSymbol( "TASK-COMPLETED" ) );
    $list18 = ConsesLow.list( makeSymbol( "_CSETF-TASK-PROCESS" ), makeSymbol( "_CSETF-TASK-COMPLETED" ) );
    $sym19$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $sym20$TASK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "TASK-PRINT-FUNCTION-TRAMPOLINE" );
    $list21 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "TASK-P" ) );
    $sym22$TASK_PROCESS = makeSymbol( "TASK-PROCESS" );
    $sym23$_CSETF_TASK_PROCESS = makeSymbol( "_CSETF-TASK-PROCESS" );
    $sym24$TASK_COMPLETED = makeSymbol( "TASK-COMPLETED" );
    $sym25$_CSETF_TASK_COMPLETED = makeSymbol( "_CSETF-TASK-COMPLETED" );
    $kw26$PROCESS = makeKeyword( "PROCESS" );
    $kw27$COMPLETED = makeKeyword( "COMPLETED" );
    $str28$Invalid_slot__S_for_construction_ = makeString( "Invalid slot ~S for construction function" );
    $kw29$BEGIN = makeKeyword( "BEGIN" );
    $sym30$MAKE_TASK = makeSymbol( "MAKE-TASK" );
    $kw31$SLOT = makeKeyword( "SLOT" );
    $kw32$END = makeKeyword( "END" );
    $sym33$VISIT_DEFSTRUCT_OBJECT_TASK_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-TASK-METHOD" );
    $sym34$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $sym35$CAR = makeSymbol( "CAR" );
    $sym36$CADR = makeSymbol( "CADR" );
    $sym37$NEW_TASK_INTERNAL = makeSymbol( "NEW-TASK-INTERNAL" );
    $sym38$FIND_SYMBOL = makeSymbol( "FIND-SYMBOL" );
    $sym39$THINKING_TASK = makeSymbol( "THINKING-TASK" );
    $sym40$THINKING_TASK_P = makeSymbol( "THINKING-TASK-P" );
    $list41 = ConsesLow.list( new SubLObject[] { makeSymbol( "LOCK" ), makeSymbol( "THREAD" ), makeSymbol( "NAME" ), makeSymbol( "STATUS" ), makeSymbol( "PROGRESS-MESSAGE" ), makeSymbol( "PROGRESS-SOFAR" ), makeSymbol(
        "PROGRESS-TOTAL" ), makeSymbol( "START-TIME" ), makeSymbol( "FINISH-TIME" ), makeSymbol( "RESULT" ), makeSymbol( "ERROR-MESSAGE" ), makeSymbol( "PROPERTIES" )
    } );
    $list42 = ConsesLow.list( new SubLObject[] { makeKeyword( "LOCK" ), makeKeyword( "THREAD" ), makeKeyword( "NAME" ), makeKeyword( "STATUS" ), makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "PROGRESS-SOFAR" ),
      makeKeyword( "PROGRESS-TOTAL" ), makeKeyword( "START-TIME" ), makeKeyword( "FINISH-TIME" ), makeKeyword( "RESULT" ), makeKeyword( "ERROR-MESSAGE" ), makeKeyword( "PROPERTIES" )
    } );
    $list43 = ConsesLow.list( new SubLObject[] { makeSymbol( "T-TASK-LOCK" ), makeSymbol( "T-TASK-THREAD" ), makeSymbol( "T-TASK-NAME" ), makeSymbol( "T-TASK-STATUS" ), makeSymbol( "T-TASK-PROGRESS-MESSAGE" ),
      makeSymbol( "T-TASK-PROGRESS-SOFAR" ), makeSymbol( "T-TASK-PROGRESS-TOTAL" ), makeSymbol( "T-TASK-START-TIME" ), makeSymbol( "T-TASK-FINISH-TIME" ), makeSymbol( "T-TASK-RESULT" ), makeSymbol(
          "T-TASK-ERROR-MESSAGE" ), makeSymbol( "T-TASK-PROPERTIES" )
    } );
    $list44 = ConsesLow.list( new SubLObject[] { makeSymbol( "_CSETF-T-TASK-LOCK" ), makeSymbol( "_CSETF-T-TASK-THREAD" ), makeSymbol( "_CSETF-T-TASK-NAME" ), makeSymbol( "_CSETF-T-TASK-STATUS" ), makeSymbol(
        "_CSETF-T-TASK-PROGRESS-MESSAGE" ), makeSymbol( "_CSETF-T-TASK-PROGRESS-SOFAR" ), makeSymbol( "_CSETF-T-TASK-PROGRESS-TOTAL" ), makeSymbol( "_CSETF-T-TASK-START-TIME" ), makeSymbol( "_CSETF-T-TASK-FINISH-TIME" ),
      makeSymbol( "_CSETF-T-TASK-RESULT" ), makeSymbol( "_CSETF-T-TASK-ERROR-MESSAGE" ), makeSymbol( "_CSETF-T-TASK-PROPERTIES" )
    } );
    $sym45$THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE" );
    $list46 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "THINKING-TASK-P" ) );
    $sym47$T_TASK_LOCK = makeSymbol( "T-TASK-LOCK" );
    $sym48$_CSETF_T_TASK_LOCK = makeSymbol( "_CSETF-T-TASK-LOCK" );
    $sym49$T_TASK_THREAD = makeSymbol( "T-TASK-THREAD" );
    $sym50$_CSETF_T_TASK_THREAD = makeSymbol( "_CSETF-T-TASK-THREAD" );
    $sym51$T_TASK_NAME = makeSymbol( "T-TASK-NAME" );
    $sym52$_CSETF_T_TASK_NAME = makeSymbol( "_CSETF-T-TASK-NAME" );
    $sym53$T_TASK_STATUS = makeSymbol( "T-TASK-STATUS" );
    $sym54$_CSETF_T_TASK_STATUS = makeSymbol( "_CSETF-T-TASK-STATUS" );
    $sym55$T_TASK_PROGRESS_MESSAGE = makeSymbol( "T-TASK-PROGRESS-MESSAGE" );
    $sym56$_CSETF_T_TASK_PROGRESS_MESSAGE = makeSymbol( "_CSETF-T-TASK-PROGRESS-MESSAGE" );
    $sym57$T_TASK_PROGRESS_SOFAR = makeSymbol( "T-TASK-PROGRESS-SOFAR" );
    $sym58$_CSETF_T_TASK_PROGRESS_SOFAR = makeSymbol( "_CSETF-T-TASK-PROGRESS-SOFAR" );
    $sym59$T_TASK_PROGRESS_TOTAL = makeSymbol( "T-TASK-PROGRESS-TOTAL" );
    $sym60$_CSETF_T_TASK_PROGRESS_TOTAL = makeSymbol( "_CSETF-T-TASK-PROGRESS-TOTAL" );
    $sym61$T_TASK_START_TIME = makeSymbol( "T-TASK-START-TIME" );
    $sym62$_CSETF_T_TASK_START_TIME = makeSymbol( "_CSETF-T-TASK-START-TIME" );
    $sym63$T_TASK_FINISH_TIME = makeSymbol( "T-TASK-FINISH-TIME" );
    $sym64$_CSETF_T_TASK_FINISH_TIME = makeSymbol( "_CSETF-T-TASK-FINISH-TIME" );
    $sym65$T_TASK_RESULT = makeSymbol( "T-TASK-RESULT" );
    $sym66$_CSETF_T_TASK_RESULT = makeSymbol( "_CSETF-T-TASK-RESULT" );
    $sym67$T_TASK_ERROR_MESSAGE = makeSymbol( "T-TASK-ERROR-MESSAGE" );
    $sym68$_CSETF_T_TASK_ERROR_MESSAGE = makeSymbol( "_CSETF-T-TASK-ERROR-MESSAGE" );
    $sym69$T_TASK_PROPERTIES = makeSymbol( "T-TASK-PROPERTIES" );
    $sym70$_CSETF_T_TASK_PROPERTIES = makeSymbol( "_CSETF-T-TASK-PROPERTIES" );
    $kw71$LOCK = makeKeyword( "LOCK" );
    $kw72$THREAD = makeKeyword( "THREAD" );
    $kw73$NAME = makeKeyword( "NAME" );
    $kw74$STATUS = makeKeyword( "STATUS" );
    $kw75$PROGRESS_MESSAGE = makeKeyword( "PROGRESS-MESSAGE" );
    $kw76$PROGRESS_SOFAR = makeKeyword( "PROGRESS-SOFAR" );
    $kw77$PROGRESS_TOTAL = makeKeyword( "PROGRESS-TOTAL" );
    $kw78$START_TIME = makeKeyword( "START-TIME" );
    $kw79$FINISH_TIME = makeKeyword( "FINISH-TIME" );
    $kw80$RESULT = makeKeyword( "RESULT" );
    $kw81$ERROR_MESSAGE = makeKeyword( "ERROR-MESSAGE" );
    $kw82$PROPERTIES = makeKeyword( "PROPERTIES" );
    $sym83$MAKE_THINKING_TASK = makeSymbol( "MAKE-THINKING-TASK" );
    $sym84$VISIT_DEFSTRUCT_OBJECT_THINKING_TASK_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-THINKING-TASK-METHOD" );
    $sym85$STRINGP = makeSymbol( "STRINGP" );
    $sym86$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $kw87$NONE = makeKeyword( "NONE" );
    $list88 = ConsesLow.list( ConsesLow.list( makeSymbol( "THINKING" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym89$LOCK = makeUninternedSymbol( "LOCK" );
    $sym90$CLET = makeSymbol( "CLET" );
    $sym91$THINKING_LOCK = makeSymbol( "THINKING-LOCK" );
    $sym92$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $sym93$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym94$UNIVERSAL_TIME_P = makeSymbol( "UNIVERSAL-TIME-P" );
    $sym95$FUNCTION_SPEC_P = makeSymbol( "FUNCTION-SPEC-P" );
    $sym96$LISTP = makeSymbol( "LISTP" );
    $sym97$THINKING_THREAD_RUN = makeSymbol( "THINKING-THREAD-RUN" );
    $kw98$STARTED = makeKeyword( "STARTED" );
    $kw99$STOPPED = makeKeyword( "STOPPED" );
    $str100$CYC = makeString( "CYC" );
    $sym101$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $kw102$RUNNING = makeKeyword( "RUNNING" );
    $str103$Function__A_in_thread__A_terminat = makeString( "Function ~A in thread ~A terminated by uncaught THROW." );
    $kw104$ERROR = makeKeyword( "ERROR" );
    $kw105$FINISHED = makeKeyword( "FINISHED" );
    $sym106$IPC_QUEUE = makeSymbol( "IPC-QUEUE" );
    $sym107$IPC_QUEUE_P = makeSymbol( "IPC-QUEUE-P" );
    $list108 = ConsesLow.list( makeSymbol( "LOCK" ), makeSymbol( "SEMAPHORE" ), makeSymbol( "DATA-QUEUE" ) );
    $list109 = ConsesLow.list( makeKeyword( "LOCK" ), makeKeyword( "SEMAPHORE" ), makeKeyword( "DATA-QUEUE" ) );
    $list110 = ConsesLow.list( makeSymbol( "IPC-QUEUE-LOCK" ), makeSymbol( "IPC-QUEUE-SEMAPHORE" ), makeSymbol( "IPC-QUEUE-DATA-QUEUE" ) );
    $list111 = ConsesLow.list( makeSymbol( "_CSETF-IPC-QUEUE-LOCK" ), makeSymbol( "_CSETF-IPC-QUEUE-SEMAPHORE" ), makeSymbol( "_CSETF-IPC-QUEUE-DATA-QUEUE" ) );
    $sym112$IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE" );
    $list113 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "IPC-QUEUE-P" ) );
    $sym114$IPC_QUEUE_LOCK = makeSymbol( "IPC-QUEUE-LOCK" );
    $sym115$_CSETF_IPC_QUEUE_LOCK = makeSymbol( "_CSETF-IPC-QUEUE-LOCK" );
    $sym116$IPC_QUEUE_SEMAPHORE = makeSymbol( "IPC-QUEUE-SEMAPHORE" );
    $sym117$_CSETF_IPC_QUEUE_SEMAPHORE = makeSymbol( "_CSETF-IPC-QUEUE-SEMAPHORE" );
    $sym118$IPC_QUEUE_DATA_QUEUE = makeSymbol( "IPC-QUEUE-DATA-QUEUE" );
    $sym119$_CSETF_IPC_QUEUE_DATA_QUEUE = makeSymbol( "_CSETF-IPC-QUEUE-DATA-QUEUE" );
    $kw120$SEMAPHORE = makeKeyword( "SEMAPHORE" );
    $kw121$DATA_QUEUE = makeKeyword( "DATA-QUEUE" );
    $sym122$MAKE_IPC_QUEUE = makeSymbol( "MAKE-IPC-QUEUE" );
    $sym123$VISIT_DEFSTRUCT_OBJECT_IPC_QUEUE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-IPC-QUEUE-METHOD" );
    $str124$Lock_for_Queue_ = makeString( "Lock for Queue " );
    $str125$Waiting_to_enqueue__A = makeString( "Waiting to enqueue ~A" );
    $str126$Enqueuing__A = makeString( "Enqueuing ~A" );
    $str127$Enqueued__A = makeString( "Enqueued ~A" );
    $str128$Queue_size___S = makeString( "Queue size: ~S" );
    $str129$Waiting_for_dequeue_semaphore_ = makeString( "Waiting for dequeue semaphore." );
    $str130$Waiting_for_Queue_lock_to_dequeue = makeString( "Waiting for Queue lock to dequeue." );
    $str131$Dequeued__A = makeString( "Dequeued ~A" );
    $str132$Unknown_error_ = makeString( "Unknown error." );
    $sym133$_EXIT = makeSymbol( "%EXIT" );
    $str134$____D___A___A___Q___D_S___D__ = makeString( "~&[~D] ~A (~A): Q: ~D S: ~D~%" );
    $str135$We_are_out_of_sync_on_either_the_ = makeString( "We are out of sync on either the queue ~D or the semaphore ~D." );
    $str136$____D___A___A____A__ = makeString( "~&[~D] ~A (~A): ~A~%" );
    $int137$100 = makeInteger( 100 );
    $sym138$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $str139$Dequeueing__up_to___D_item__P_ = makeString( "Dequeueing (up to) ~D item~:P." );
    $float140$0_01 = makeDouble( 0.01 );
    $list141 = ConsesLow.list( makeSymbol( "A" ), makeSymbol( "B" ), makeSymbol( "C" ), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER );
    $str142$IPCQ_Test_Producer = makeString( "IPCQ Test Producer" );
    $sym143$IPCQ_TEST_PRODUCER_RUN = makeSymbol( "IPCQ-TEST-PRODUCER-RUN" );
    $str144$Test_IPC_Queue = makeString( "Test IPC Queue" );
    $str145$Expected__S__got__S = makeString( "Expected ~S, got ~S" );
    $sym146$TEST_IPC_ENQUEUE_DEQUEUE = makeSymbol( "TEST-IPC-ENQUEUE-DEQUEUE" );
    $kw147$TEST = makeKeyword( "TEST" );
    $kw148$OWNER = makeKeyword( "OWNER" );
    $kw149$CLASSES = makeKeyword( "CLASSES" );
    $list150 = ConsesLow.list( makeSymbol( "IPCQ-TEST-CASES" ) );
    $kw151$KB = makeKeyword( "KB" );
    $kw152$TINY = makeKeyword( "TINY" );
    $kw153$WORKING_ = makeKeyword( "WORKING?" );
    $list154 = ConsesLow.list( ConsesLow.list( NIL, T ) );
    $sym155$TEST_IPC_ENQUEUE_DRAIN = makeSymbol( "TEST-IPC-ENQUEUE-DRAIN" );
    $sym156$TEST_IPC_ENQUEUE_DRAIN_DEQUEUE = makeSymbol( "TEST-IPC-ENQUEUE-DRAIN-DEQUEUE" );
    $sym157$ORDERED_IPC_QUEUE = makeSymbol( "ORDERED-IPC-QUEUE" );
    $sym158$ORDERED_IPC_QUEUE_P = makeSymbol( "ORDERED-IPC-QUEUE-P" );
    $list159 = ConsesLow.list( makeSymbol( "LOCK" ), makeSymbol( "PRODUCER-ISG" ), makeSymbol( "CONSUMER-ISG" ), makeSymbol( "PAYLOAD" ), makeSymbol( "EARLY-CONSUMER-SEMAPHORE" ) );
    $list160 = ConsesLow.list( makeKeyword( "LOCK" ), makeKeyword( "PRODUCER-ISG" ), makeKeyword( "CONSUMER-ISG" ), makeKeyword( "PAYLOAD" ), makeKeyword( "EARLY-CONSUMER-SEMAPHORE" ) );
    $list161 = ConsesLow.list( makeSymbol( "ORDRD-IPCQ-LOCK" ), makeSymbol( "ORDRD-IPCQ-PRODUCER-ISG" ), makeSymbol( "ORDRD-IPCQ-CONSUMER-ISG" ), makeSymbol( "ORDRD-IPCQ-PAYLOAD" ), makeSymbol(
        "ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE" ) );
    $list162 = ConsesLow.list( makeSymbol( "_CSETF-ORDRD-IPCQ-LOCK" ), makeSymbol( "_CSETF-ORDRD-IPCQ-PRODUCER-ISG" ), makeSymbol( "_CSETF-ORDRD-IPCQ-CONSUMER-ISG" ), makeSymbol( "_CSETF-ORDRD-IPCQ-PAYLOAD" ),
        makeSymbol( "_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE" ) );
    $sym163$ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE" );
    $list164 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ORDERED-IPC-QUEUE-P" ) );
    $sym165$ORDRD_IPCQ_LOCK = makeSymbol( "ORDRD-IPCQ-LOCK" );
    $sym166$_CSETF_ORDRD_IPCQ_LOCK = makeSymbol( "_CSETF-ORDRD-IPCQ-LOCK" );
    $sym167$ORDRD_IPCQ_PRODUCER_ISG = makeSymbol( "ORDRD-IPCQ-PRODUCER-ISG" );
    $sym168$_CSETF_ORDRD_IPCQ_PRODUCER_ISG = makeSymbol( "_CSETF-ORDRD-IPCQ-PRODUCER-ISG" );
    $sym169$ORDRD_IPCQ_CONSUMER_ISG = makeSymbol( "ORDRD-IPCQ-CONSUMER-ISG" );
    $sym170$_CSETF_ORDRD_IPCQ_CONSUMER_ISG = makeSymbol( "_CSETF-ORDRD-IPCQ-CONSUMER-ISG" );
    $sym171$ORDRD_IPCQ_PAYLOAD = makeSymbol( "ORDRD-IPCQ-PAYLOAD" );
    $sym172$_CSETF_ORDRD_IPCQ_PAYLOAD = makeSymbol( "_CSETF-ORDRD-IPCQ-PAYLOAD" );
    $sym173$ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE = makeSymbol( "ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE" );
    $sym174$_CSETF_ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE = makeSymbol( "_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE" );
    $kw175$PRODUCER_ISG = makeKeyword( "PRODUCER-ISG" );
    $kw176$CONSUMER_ISG = makeKeyword( "CONSUMER-ISG" );
    $kw177$PAYLOAD = makeKeyword( "PAYLOAD" );
    $kw178$EARLY_CONSUMER_SEMAPHORE = makeKeyword( "EARLY-CONSUMER-SEMAPHORE" );
    $sym179$MAKE_ORDERED_IPC_QUEUE = makeSymbol( "MAKE-ORDERED-IPC-QUEUE" );
    $sym180$VISIT_DEFSTRUCT_OBJECT_ORDERED_IPC_QUEUE_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-ORDERED-IPC-QUEUE-METHOD" );
    $str181$empty_ordered_IPC_queue_entry = makeString( "empty ordered IPC queue entry" );
    $str182$Lock_for_Ordered_IPC_Queue_ = makeString( "Lock for Ordered IPC Queue " );
    $str183$Ordered_IPCQ_Early_Producer = makeString( "Ordered IPCQ Early Producer" );
    $str184$Unexpected_entry__A_in_the_payloa = makeString( "Unexpected entry ~A in the payload of ordered IPC queue ~A: expected nothing or waiting process." );
    $int185$212 = makeInteger( 212 );
    $sym186$KILL_PROCESS_NAMED = makeSymbol( "KILL-PROCESS-NAMED" );
    $list187 = ConsesLow.list( makeSymbol( "NAME" ) );
    $str188$_param_NAME__stringp____Kills_any = makeString( "@param NAME; stringp\n   Kills any process having the given process name. Note\n   that kill-process is not yet supported on Win32." );
    $list189 = ConsesLow.list( ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "STRINGP" ) ) );
    $list190 = ConsesLow.list( NIL );
    $sym191$PROCESS_EXHAUST_IMMEDIATELY_FN = makeSymbol( "PROCESS-EXHAUST-IMMEDIATELY-FN" );
    $sym192$VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD" );
    $sym193$MAKE_EXHAUSTED_PROCESS = makeSymbol( "MAKE-EXHAUSTED-PROCESS" );
    $sym194$VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD" );
    $sym195$MAKE_LOCK = makeSymbol( "MAKE-LOCK" );
    $sym196$PROCESS_WRAPPER = makeSymbol( "PROCESS-WRAPPER" );
    $sym197$PROCESS_WRAPPER_P = makeSymbol( "PROCESS-WRAPPER-P" );
    $list198 = ConsesLow.list( makeSymbol( "ID" ), makeSymbol( "PROCESS" ), makeSymbol( "STATE" ), makeSymbol( "LOCK" ), makeSymbol( "PLIST" ) );
    $list199 = ConsesLow.list( makeKeyword( "ID" ), makeKeyword( "PROCESS" ), makeKeyword( "STATE" ), makeKeyword( "LOCK" ), makeKeyword( "PLIST" ) );
    $list200 = ConsesLow.list( makeSymbol( "PROCESS-WRAPPER-ID" ), makeSymbol( "PROCESS-WRAPPER-PROCESS" ), makeSymbol( "PROCESS-WRAPPER-STATE" ), makeSymbol( "PROCESS-WRAPPER-LOCK" ), makeSymbol(
        "PROCESS-WRAPPER-PLIST" ) );
    $list201 = ConsesLow.list( makeSymbol( "_CSETF-PROCESS-WRAPPER-ID" ), makeSymbol( "_CSETF-PROCESS-WRAPPER-PROCESS" ), makeSymbol( "_CSETF-PROCESS-WRAPPER-STATE" ), makeSymbol( "_CSETF-PROCESS-WRAPPER-LOCK" ),
        makeSymbol( "_CSETF-PROCESS-WRAPPER-PLIST" ) );
    $sym202$PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol( "PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE" );
    $list203 = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "PROCESS-WRAPPER-P" ) );
    $sym204$PROCESS_WRAPPER_ID = makeSymbol( "PROCESS-WRAPPER-ID" );
    $sym205$_CSETF_PROCESS_WRAPPER_ID = makeSymbol( "_CSETF-PROCESS-WRAPPER-ID" );
    $sym206$PROCESS_WRAPPER_PROCESS = makeSymbol( "PROCESS-WRAPPER-PROCESS" );
    $sym207$_CSETF_PROCESS_WRAPPER_PROCESS = makeSymbol( "_CSETF-PROCESS-WRAPPER-PROCESS" );
    $sym208$PROCESS_WRAPPER_STATE = makeSymbol( "PROCESS-WRAPPER-STATE" );
    $sym209$_CSETF_PROCESS_WRAPPER_STATE = makeSymbol( "_CSETF-PROCESS-WRAPPER-STATE" );
    $sym210$PROCESS_WRAPPER_LOCK = makeSymbol( "PROCESS-WRAPPER-LOCK" );
    $sym211$_CSETF_PROCESS_WRAPPER_LOCK = makeSymbol( "_CSETF-PROCESS-WRAPPER-LOCK" );
    $sym212$PROCESS_WRAPPER_PLIST = makeSymbol( "PROCESS-WRAPPER-PLIST" );
    $sym213$_CSETF_PROCESS_WRAPPER_PLIST = makeSymbol( "_CSETF-PROCESS-WRAPPER-PLIST" );
    $kw214$ID = makeKeyword( "ID" );
    $kw215$STATE = makeKeyword( "STATE" );
    $kw216$PLIST = makeKeyword( "PLIST" );
    $sym217$MAKE_PROCESS_WRAPPER = makeSymbol( "MAKE-PROCESS-WRAPPER" );
    $sym218$VISIT_DEFSTRUCT_OBJECT_PROCESS_WRAPPER_METHOD = makeSymbol( "VISIT-DEFSTRUCT-OBJECT-PROCESS-WRAPPER-METHOD" );
    $sym219$_PROCESS_WRAPPER_ISG_ = makeSymbol( "*PROCESS-WRAPPER-ISG*" );
    $kw220$STARTING = makeKeyword( "STARTING" );
    $sym221$NEW_PROCESS_WRAPPER_INT = makeSymbol( "NEW-PROCESS-WRAPPER-INT" );
    $kw222$ABORTED = makeKeyword( "ABORTED" );
    $kw223$PAUSING = makeKeyword( "PAUSING" );
    $kw224$PAUSED = makeKeyword( "PAUSED" );
    $sym225$CYC_SERVER_PROCESS_FUNCALL = makeSymbol( "CYC-SERVER-PROCESS-FUNCALL" );
    $sym226$DOUBLE_FLOAT = makeSymbol( "DOUBLE-FLOAT" );
    $sym227$CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS = makeSymbol( "CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS" );
    $list228 = ConsesLow.cons( makeSymbol( "FUNCTION" ), makeSymbol( "ARGS" ) );
  }

  public static final class $task_native
      extends
        SubLStructNative
  {
    public SubLObject $process;
    public SubLObject $completed;
    private static final SubLStructDeclNative structDecl;

    public $task_native()
    {
      this.$process = CommonSymbols.NIL;
      this.$completed = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $task_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$process;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$completed;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$process = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$completed = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $task_native.class, $sym13$TASK, $sym14$TASK_P, $list15, $list16, new String[] { "$process", "$completed"
      }, $list17, $list18, $sym19$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $task_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $task_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "TASK-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return task_p( arg1 );
    }
  }

  public static final class $thinking_task_native
      extends
        SubLStructNative
  {
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

    public $thinking_task_native()
    {
      this.$lock = CommonSymbols.NIL;
      this.$thread = CommonSymbols.NIL;
      this.$name = CommonSymbols.NIL;
      this.$status = CommonSymbols.NIL;
      this.$progress_message = CommonSymbols.NIL;
      this.$progress_sofar = CommonSymbols.NIL;
      this.$progress_total = CommonSymbols.NIL;
      this.$start_time = CommonSymbols.NIL;
      this.$finish_time = CommonSymbols.NIL;
      this.$result = CommonSymbols.NIL;
      this.$error_message = CommonSymbols.NIL;
      this.$properties = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $thinking_task_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$thread;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$name;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$status;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$progress_message;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$progress_sofar;
    }

    @Override
    public SubLObject getField8()
    {
      return this.$progress_total;
    }

    @Override
    public SubLObject getField9()
    {
      return this.$start_time;
    }

    @Override
    public SubLObject getField10()
    {
      return this.$finish_time;
    }

    @Override
    public SubLObject getField11()
    {
      return this.$result;
    }

    @Override
    public SubLObject getField12()
    {
      return this.$error_message;
    }

    @Override
    public SubLObject getField13()
    {
      return this.$properties;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$thread = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$name = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$status = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$progress_message = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$progress_sofar = value;
    }

    @Override
    public SubLObject setField8(final SubLObject value)
    {
      return this.$progress_total = value;
    }

    @Override
    public SubLObject setField9(final SubLObject value)
    {
      return this.$start_time = value;
    }

    @Override
    public SubLObject setField10(final SubLObject value)
    {
      return this.$finish_time = value;
    }

    @Override
    public SubLObject setField11(final SubLObject value)
    {
      return this.$result = value;
    }

    @Override
    public SubLObject setField12(final SubLObject value)
    {
      return this.$error_message = value;
    }

    @Override
    public SubLObject setField13(final SubLObject value)
    {
      return this.$properties = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $thinking_task_native.class, $sym39$THINKING_TASK, $sym40$THINKING_TASK_P, $list41, $list42, new String[] { "$lock", "$thread", "$name", "$status", "$progress_message",
        "$progress_sofar", "$progress_total", "$start_time", "$finish_time", "$result", "$error_message", "$properties"
      }, $list43, $list44, $sym19$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $thinking_task_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $thinking_task_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "THINKING-TASK-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return thinking_task_p( arg1 );
    }
  }

  public static final class $ipc_queue_native
      extends
        SubLStructNative
  {
    public SubLObject $lock;
    public SubLObject $semaphore;
    public SubLObject $data_queue;
    private static final SubLStructDeclNative structDecl;

    public $ipc_queue_native()
    {
      this.$lock = CommonSymbols.NIL;
      this.$semaphore = CommonSymbols.NIL;
      this.$data_queue = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $ipc_queue_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$semaphore;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$data_queue;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$semaphore = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$data_queue = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $ipc_queue_native.class, $sym106$IPC_QUEUE, $sym107$IPC_QUEUE_P, $list108, $list109, new String[] { "$lock", "$semaphore", "$data_queue"
      }, $list110, $list111, $sym19$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $ipc_queue_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $ipc_queue_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "IPC-QUEUE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return ipc_queue_p( arg1 );
    }
  }

  public static final class $ordered_ipc_queue_native
      extends
        SubLStructNative
  {
    public SubLObject $lock;
    public SubLObject $producer_isg;
    public SubLObject $consumer_isg;
    public SubLObject $payload;
    public SubLObject $early_consumer_semaphore;
    private static final SubLStructDeclNative structDecl;

    public $ordered_ipc_queue_native()
    {
      this.$lock = CommonSymbols.NIL;
      this.$producer_isg = CommonSymbols.NIL;
      this.$consumer_isg = CommonSymbols.NIL;
      this.$payload = CommonSymbols.NIL;
      this.$early_consumer_semaphore = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $ordered_ipc_queue_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$producer_isg;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$consumer_isg;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$payload;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$early_consumer_semaphore;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$producer_isg = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$consumer_isg = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$payload = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$early_consumer_semaphore = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $ordered_ipc_queue_native.class, $sym157$ORDERED_IPC_QUEUE, $sym158$ORDERED_IPC_QUEUE_P, $list159, $list160, new String[] { "$lock", "$producer_isg", "$consumer_isg",
        "$payload", "$early_consumer_semaphore"
      }, $list161, $list162, $sym19$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $ordered_ipc_queue_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $ordered_ipc_queue_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ORDERED-IPC-QUEUE-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return ordered_ipc_queue_p( arg1 );
    }
  }

  public static final class $process_wrapper_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public SubLObject $process;
    public SubLObject $state;
    public SubLObject $lock;
    public SubLObject $plist;
    private static final SubLStructDeclNative structDecl;

    public $process_wrapper_native()
    {
      this.$id = CommonSymbols.NIL;
      this.$process = CommonSymbols.NIL;
      this.$state = CommonSymbols.NIL;
      this.$lock = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $process_wrapper_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$process;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$state;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$lock;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$plist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$process = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$state = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$lock = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$plist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $process_wrapper_native.class, $sym196$PROCESS_WRAPPER, $sym197$PROCESS_WRAPPER_P, $list198, $list199, new String[] { "$id", "$process", "$state", "$lock", "$plist"
      }, $list200, $list201, $sym19$DEFAULT_STRUCT_PRINT_FUNCTION );
    }
  }

  public static final class $process_wrapper_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $process_wrapper_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "PROCESS-WRAPPER-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return process_wrapper_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 748 ms synthetic
 */