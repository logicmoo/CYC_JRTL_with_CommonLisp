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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class process_utilities extends SubLTranslatedFile
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
    static  boolean assertionsDisabledSynth = true;
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 1147L)
    public static SubLObject debug_initial_process() {
        final SubLObject initial_process = subl_promotions.initial_process();
        if (process_utilities.NIL != Threads.valid_process_p(initial_process)) {
            return Threads.debug_process(initial_process);
        }
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 1365L)
    public static SubLObject interrupt_initial_process() {
        return debug_initial_process();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 1485L)
    public static SubLObject process_idleP(final SubLObject process) {
        final SubLObject state = Threads.process_whostate(process);
        return (SubLObject)SubLObjectFactory.makeBoolean(process_utilities.NIL != string_utilities.starts_with(state, (SubLObject)process_utilities.$str2$Idle) || process_utilities.NIL != string_utilities.starts_with(state, (SubLObject)process_utilities.$str3$Sleep));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 2019L)
    public static SubLObject process_busyP(final SubLObject process) {
        return (SubLObject)SubLObjectFactory.makeBoolean(process_utilities.NIL != process_runningP(process) || process_utilities.NIL != process_waitingP(process));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 2239L)
    public static SubLObject process_waitingP(final SubLObject process) {
        final SubLObject state = Threads.process_whostate(process);
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.search((SubLObject)process_utilities.$str4$wait, state, (SubLObject)process_utilities.EQUALP, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED).isFixnum() || Sequences.search((SubLObject)process_utilities.$str5$blocked, state, (SubLObject)process_utilities.EQUALP, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED).isFixnum());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 2654L)
    public static SubLObject process_runningP(final SubLObject process) {
        final SubLObject state = Threads.process_whostate(process);
        return Sequences.search((SubLObject)process_utilities.$str6$run, state, (SubLObject)process_utilities.EQUALP, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 3000L)
    public static SubLObject process_suid(final SubLObject process) {
        assert process_utilities.NIL != Types.processp(process) : process;
        SubLObject suid = (SubLObject)process_utilities.NIL;
        suid = Equality.pointer(process);
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 3457L)
    public static SubLObject find_process_by_suid(final SubLObject suid) {
        assert process_utilities.NIL != Types.integerp(suid) : suid;
        SubLObject result = (SubLObject)process_utilities.NIL;
        if (process_utilities.NIL == result) {
            SubLObject csome_list_var = Threads.all_processes();
            SubLObject process = (SubLObject)process_utilities.NIL;
            process = csome_list_var.first();
            while (process_utilities.NIL == result && process_utilities.NIL != csome_list_var) {
                if (suid.numE(process_suid(process))) {
                    result = process;
                }
                csome_list_var = csome_list_var.rest();
                process = csome_list_var.first();
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 3756L)
    public static SubLObject find_process_by_name(final SubLObject name, SubLObject test) {
        if (test == process_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)process_utilities.EQUAL);
        }
        return Sequences.find(name, Threads.all_processes(), test, Symbols.symbol_function((SubLObject)process_utilities.$sym9$PROCESS_NAME), (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 3955L)
    public static SubLObject gather_processes_by_name(final SubLObject name, SubLObject test) {
        if (test == process_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)process_utilities.EQUAL);
        }
        return list_utilities.gather_all(name, Threads.all_processes(), test, Symbols.symbol_function((SubLObject)process_utilities.$sym9$PROCESS_NAME));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 4309L)
    public static SubLObject active_process_at_startupP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(process_utilities.NIL != Types.processp(v_object) && process_utilities.NIL != list_utilities.member_eqP(v_object, process_utilities.$active_processes_at_startup$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 4516L)
    public static SubLObject note_active_processes_at_startup() {
        process_utilities.$active_processes_at_startup$.setGlobalValue(conses_high.copy_list(Threads.all_processes()));
        return Sequences.length(process_utilities.$active_processes_at_startup$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 5037L)
    public static SubLObject process_form(final SubLObject process) {
        assert process_utilities.NIL != Types.processp(process) : process;
        if (process_utilities.NIL != Threads.valid_process_p(process)) {
            return Hashtables.gethash_without_values(process, process_utilities.$process_form_map$.getGlobalValue(), (SubLObject)process_utilities.NIL);
        }
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 5311L)
    public static SubLObject process_note_form(final SubLObject process, final SubLObject form) {
        assert process_utilities.NIL != Types.processp(process) : process;
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(process_utilities.$process_form_lock$.getGlobalValue());
            if (process_utilities.NIL != form) {
                Hashtables.sethash(process, process_utilities.$process_form_map$.getGlobalValue(), form);
            }
            else {
                Hashtables.remhash(process, process_utilities.$process_form_map$.getGlobalValue());
            }
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(process_utilities.$process_form_lock$.getGlobalValue());
            }
        }
        return process;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 5590L)
    public static SubLObject current_process_note_form(final SubLObject form) {
        return process_note_form(Threads.current_process(), form);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 5745L)
    public static SubLObject current_process_clear_form() {
        if (random.random((SubLObject)process_utilities.TWENTY_INTEGER).isZero()) {
            clear_invalid_process_forms();
        }
        return current_process_note_form((SubLObject)process_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 5967L)
    public static SubLObject clear_invalid_process_forms() {
        SubLObject invalid_processes = (SubLObject)process_utilities.NIL;
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(process_utilities.$process_form_lock$.getGlobalValue());
            SubLObject process = (SubLObject)process_utilities.NIL;
            SubLObject no_value = (SubLObject)process_utilities.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(process_utilities.$process_form_map$.getGlobalValue());
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    process = Hashtables.getEntryKey(cdohash_entry);
                    no_value = Hashtables.getEntryValue(cdohash_entry);
                    if (process_utilities.NIL == Threads.valid_process_p(process)) {
                        invalid_processes = (SubLObject)ConsesLow.cons(process, invalid_processes);
                    }
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
            SubLObject cdolist_list_var = invalid_processes;
            SubLObject invalid_process = (SubLObject)process_utilities.NIL;
            invalid_process = cdolist_list_var.first();
            while (process_utilities.NIL != cdolist_list_var) {
                Hashtables.remhash(invalid_process, process_utilities.$process_form_map$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                invalid_process = cdolist_list_var.first();
            }
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(process_utilities.$process_form_lock$.getGlobalValue());
            }
        }
        return Sequences.length(invalid_processes);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
    public static SubLObject task_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)process_utilities.ZERO_INTEGER);
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
    public static SubLObject task_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $task_native.class) ? process_utilities.T : process_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
    public static SubLObject task_process(final SubLObject v_object) {
        assert process_utilities.NIL != task_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
    public static SubLObject task_completed(final SubLObject v_object) {
        assert process_utilities.NIL != task_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
    public static SubLObject _csetf_task_process(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != task_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
    public static SubLObject _csetf_task_completed(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != task_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
    public static SubLObject make_task(SubLObject arglist) {
        if (arglist == process_utilities.UNPROVIDED) {
            arglist = (SubLObject)process_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $task_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)process_utilities.NIL, next = arglist; process_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)process_utilities.$kw26$PROCESS)) {
                _csetf_task_process(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw27$COMPLETED)) {
                _csetf_task_completed(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)process_utilities.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
    public static SubLObject visit_defstruct_task(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw29$BEGIN, (SubLObject)process_utilities.$sym30$MAKE_TASK, (SubLObject)process_utilities.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw26$PROCESS, task_process(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw27$COMPLETED, task_completed(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw32$END, (SubLObject)process_utilities.$sym30$MAKE_TASK, (SubLObject)process_utilities.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6358L)
    public static SubLObject visit_defstruct_object_task_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_task(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6573L)
    public static SubLObject new_task(final SubLObject name, final SubLObject function, SubLObject args, SubLObject a_list) {
        if (args == process_utilities.UNPROVIDED) {
            args = (SubLObject)process_utilities.NIL;
        }
        if (a_list == process_utilities.UNPROVIDED) {
            a_list = (SubLObject)process_utilities.NIL;
        }
        final SubLObject task = make_task((SubLObject)process_utilities.UNPROVIDED);
        final SubLObject symbol_list = Mapping.mapcar(Symbols.symbol_function((SubLObject)process_utilities.$sym34$SYMBOL_NAME), Mapping.mapcar(Symbols.symbol_function((SubLObject)process_utilities.$sym35$CAR), a_list));
        final SubLObject value_list = Mapping.mapcar(Symbols.symbol_function((SubLObject)process_utilities.$sym36$CADR), a_list);
        subl_promotions.make_process_with_args(name, Symbols.symbol_function((SubLObject)process_utilities.$sym37$NEW_TASK_INTERNAL), (SubLObject)ConsesLow.list(task, function, args, symbol_list, value_list));
        return task;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 6902L)
    public static SubLObject new_task_internal(final SubLObject task, final SubLObject function, final SubLObject args, final SubLObject symbol_list, final SubLObject value_list) {
        try {
            final SubLObject cprogv_var = Mapping.mapcar(Symbols.symbol_function((SubLObject)process_utilities.$sym38$FIND_SYMBOL), symbol_list);
            final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
            try {
                Dynamic.bind_dynamic_vars(cprogv_var, value_list);
                _csetf_task_process(task, Threads.current_process());
                Functions.apply(function, args);
            }
            finally {
                Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)process_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                _csetf_task_completed(task, (SubLObject)process_utilities.T);
                _csetf_task_process(task, (SubLObject)process_utilities.NIL);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject thinking_task_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)process_utilities.ZERO_INTEGER);
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject thinking_task_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $thinking_task_native.class) ? process_utilities.T : process_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_lock(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_thread(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_name(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_status(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_progress_message(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_progress_sofar(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_progress_total(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField8();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_start_time(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField9();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_finish_time(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField10();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_result(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField11();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_error_message(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField12();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject t_task_properties(final SubLObject v_object) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.getField13();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_lock(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_thread(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_name(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_status(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_progress_message(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_progress_sofar(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_progress_total(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField8(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_start_time(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField9(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_finish_time(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField10(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_result(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField11(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_error_message(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField12(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject _csetf_t_task_properties(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(v_object) : v_object;
        return v_object.setField13(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject make_thinking_task(SubLObject arglist) {
        if (arglist == process_utilities.UNPROVIDED) {
            arglist = (SubLObject)process_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $thinking_task_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)process_utilities.NIL, next = arglist; process_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)process_utilities.$kw71$LOCK)) {
                _csetf_t_task_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw72$THREAD)) {
                _csetf_t_task_thread(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw73$NAME)) {
                _csetf_t_task_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw74$STATUS)) {
                _csetf_t_task_status(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw75$PROGRESS_MESSAGE)) {
                _csetf_t_task_progress_message(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw76$PROGRESS_SOFAR)) {
                _csetf_t_task_progress_sofar(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw77$PROGRESS_TOTAL)) {
                _csetf_t_task_progress_total(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw78$START_TIME)) {
                _csetf_t_task_start_time(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw79$FINISH_TIME)) {
                _csetf_t_task_finish_time(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw80$RESULT)) {
                _csetf_t_task_result(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw81$ERROR_MESSAGE)) {
                _csetf_t_task_error_message(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw82$PROPERTIES)) {
                _csetf_t_task_properties(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)process_utilities.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject visit_defstruct_thinking_task(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw29$BEGIN, (SubLObject)process_utilities.$sym83$MAKE_THINKING_TASK, (SubLObject)process_utilities.TWELVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw71$LOCK, t_task_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw72$THREAD, t_task_thread(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw73$NAME, t_task_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw74$STATUS, t_task_status(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw75$PROGRESS_MESSAGE, t_task_progress_message(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw76$PROGRESS_SOFAR, t_task_progress_sofar(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw77$PROGRESS_TOTAL, t_task_progress_total(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw78$START_TIME, t_task_start_time(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw79$FINISH_TIME, t_task_finish_time(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw80$RESULT, t_task_result(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw81$ERROR_MESSAGE, t_task_error_message(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw82$PROPERTIES, t_task_properties(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw32$END, (SubLObject)process_utilities.$sym83$MAKE_THINKING_TASK, (SubLObject)process_utilities.TWELVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8036L)
    public static SubLObject visit_defstruct_object_thinking_task_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_thinking_task(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 8984L)
    public static SubLObject new_thinking_task(final SubLObject name, final SubLObject progress_message, SubLObject v_properties) {
        if (v_properties == process_utilities.UNPROVIDED) {
            v_properties = (SubLObject)process_utilities.NIL;
        }
        assert process_utilities.NIL != Types.stringp(name) : name;
        assert process_utilities.NIL != Types.stringp(progress_message) : progress_message;
        if (process_utilities.NIL != v_properties && !process_utilities.assertionsDisabledSynth && process_utilities.NIL == list_utilities.property_list_p(v_properties)) {
            throw new AssertionError(v_properties);
        }
        final SubLObject thinking = make_thinking_task((SubLObject)process_utilities.UNPROVIDED);
        final SubLObject lock = Locks.make_lock(name);
        _csetf_t_task_progress_message(thinking, progress_message);
        _csetf_t_task_name(thinking, name);
        _csetf_t_task_lock(thinking, lock);
        _csetf_t_task_status(thinking, (SubLObject)process_utilities.$kw87$NONE);
        if (process_utilities.NIL != v_properties) {
            _csetf_t_task_properties(thinking, v_properties);
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 9906L)
    public static SubLObject with_thinking_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)process_utilities.$list88);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject thinking = (SubLObject)process_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)process_utilities.$list88);
        thinking = current.first();
        current = current.rest();
        if (process_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject lock = (SubLObject)process_utilities.$sym89$LOCK;
            return (SubLObject)ConsesLow.list((SubLObject)process_utilities.$sym90$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(lock, (SubLObject)ConsesLow.list((SubLObject)process_utilities.$sym91$THINKING_LOCK, thinking))), (SubLObject)ConsesLow.listS((SubLObject)process_utilities.$sym92$WITH_LOCK_HELD, (SubLObject)ConsesLow.list(lock), ConsesLow.append(body, (SubLObject)process_utilities.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)process_utilities.$list88);
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 10144L)
    public static SubLObject thinking_note_thread(final SubLObject thinking, final SubLObject thread) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        assert process_utilities.NIL != Types.processp(thread) : thread;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_t_task_thread(thinking, thread);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 10428L)
    public static SubLObject thinking_clear_thread(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        _csetf_t_task_thread(thinking, (SubLObject)process_utilities.NIL);
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 10575L)
    public static SubLObject thinking_note_status(final SubLObject thinking, final SubLObject status) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        assert process_utilities.NIL != Types.keywordp(status) : status;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_t_task_status(thinking, status);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 10798L)
    public static SubLObject thinking_note_progress_message(final SubLObject thinking, final SubLObject message) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        assert process_utilities.NIL != Types.stringp(message) : message;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_t_task_progress_message(thinking, message);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 11096L)
    public static SubLObject thinking_note_progress_sofar(final SubLObject thinking, final SubLObject sofar) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        assert process_utilities.NIL != Types.integerp(sofar) : sofar;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_t_task_progress_sofar(thinking, sofar);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 11381L)
    public static SubLObject thinking_note_progress_total(final SubLObject thinking, final SubLObject total) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        assert process_utilities.NIL != Types.integerp(total) : total;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_t_task_progress_total(thinking, total);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 11668L)
    public static SubLObject thinking_note_start_time(final SubLObject thinking, final SubLObject time) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        assert process_utilities.NIL != numeric_date_utilities.universal_time_p(time) : time;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_t_task_start_time(thinking, time);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 11903L)
    public static SubLObject thinking_note_finish_time(final SubLObject thinking, final SubLObject time) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        assert process_utilities.NIL != numeric_date_utilities.universal_time_p(time) : time;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_t_task_finish_time(thinking, time);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 12140L)
    public static SubLObject thinking_note_result(final SubLObject thinking, final SubLObject result) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_t_task_result(thinking, result);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 12334L)
    public static SubLObject thinking_note_error_message(final SubLObject thinking, final SubLObject error_message) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        assert process_utilities.NIL != Types.stringp(error_message) : error_message;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_t_task_error_message(thinking, error_message);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 12593L)
    public static SubLObject thinking_note_property(final SubLObject thinking, final SubLObject property, final SubLObject value) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        assert process_utilities.NIL != Types.keywordp(property) : property;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_t_task_properties(thinking, conses_high.putf(t_task_properties(thinking), property, value));
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 12878L)
    public static SubLObject thinking_lock(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return t_task_lock(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13049L)
    public static SubLObject thinking_thread(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return t_task_thread(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13169L)
    public static SubLObject thinking_name(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return t_task_name(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13287L)
    public static SubLObject thinking_status(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return t_task_status(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13407L)
    public static SubLObject thinking_progress_message(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return t_task_progress_message(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13547L)
    public static SubLObject thinking_progress_sofar(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return t_task_progress_sofar(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13683L)
    public static SubLObject thinking_progress_total(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return t_task_progress_total(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13819L)
    public static SubLObject thinking_start_time(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return t_task_start_time(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 13947L)
    public static SubLObject thinking_finish_time(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return t_task_finish_time(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14077L)
    public static SubLObject thinking_result(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return t_task_result(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14197L)
    public static SubLObject thinking_error_message(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return t_task_error_message(thinking);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14331L)
    public static SubLObject thinking_property(final SubLObject thinking, final SubLObject property) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        assert process_utilities.NIL != Types.keywordp(property) : property;
        return conses_high.getf(t_task_properties(thinking), property, (SubLObject)process_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14515L)
    public static SubLObject thinking_properties(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        return conses_high.copy_list(t_task_properties(thinking));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14775L)
    public static SubLObject thinking_task() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return process_utilities.$thinking_task$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 14907L)
    public static SubLObject thinking_start(final SubLObject thinking, final SubLObject function, final SubLObject arg_list) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        assert process_utilities.NIL != Types.function_spec_p(function) : function;
        assert process_utilities.NIL != Types.listp(arg_list) : arg_list;
        SubLObject v_answer = (SubLObject)process_utilities.NIL;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            SubLObject thread = thinking_thread(thinking);
            if (process_utilities.NIL == thread) {
                final SubLObject thread_args = (SubLObject)ConsesLow.list(thinking, function, arg_list);
                final SubLObject name = thinking_name(thinking);
                thread = subl_promotions.make_process_with_args(name, (SubLObject)process_utilities.$sym97$THINKING_THREAD_RUN, thread_args);
                thinking_note_status(thinking, (SubLObject)process_utilities.$kw98$STARTED);
                v_answer = thread;
            }
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 15718L)
    public static SubLObject thinking_stop(final SubLObject thinking) {
        assert process_utilities.NIL != thinking_task_p(thinking) : thinking;
        SubLObject v_answer = (SubLObject)process_utilities.NIL;
        final SubLObject lock = thinking_lock(thinking);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject thread = thinking_thread(thinking);
            if (process_utilities.NIL != Types.processp(thread)) {
                try {
                    if (process_utilities.NIL != Threads.valid_process_p(thread)) {
                        Threads.kill_process(thread);
                    }
                    v_answer = (SubLObject)process_utilities.T;
                }
                finally {
                    final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)process_utilities.T);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (process_utilities.NIL == thinking_finish_time(thinking)) {
                            thinking_note_finish_time(thinking, Time.get_universal_time());
                        }
                        thinking_clear_thread(thinking);
                        thinking_note_status(thinking, (SubLObject)process_utilities.$kw99$STOPPED);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 16433L)
    public static SubLObject thinking_thread_run(final SubLObject thinking, final SubLObject function, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)process_utilities.NIL;
        SubLObject success = (SubLObject)process_utilities.NIL;
        SubLObject error_message = (SubLObject)process_utilities.NIL;
        SubLObject uncaught_errorP = (SubLObject)process_utilities.NIL;
        final SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)process_utilities.$str100$CYC), thread);
            thinking_thread_initialize(thinking);
            try {
                uncaught_errorP = (SubLObject)process_utilities.T;
                final SubLObject _prev_bind_0_$1 = process_utilities.$thinking_task$.currentBinding(thread);
                try {
                    process_utilities.$thinking_task$.bind(thinking, thread);
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)process_utilities.$sym101$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                final SubLObject _prev_bind_0_$3 = Errors.$continue_cerrorP$.currentBinding(thread);
                                try {
                                    Errors.$continue_cerrorP$.bind((SubLObject)process_utilities.T, thread);
                                    thinking_note_status(thinking, (SubLObject)process_utilities.$kw102$RUNNING);
                                    result = Functions.apply(function, args);
                                }
                                finally {
                                    Errors.$continue_cerrorP$.rebind(_prev_bind_0_$3, thread);
                                }
                                success = (SubLObject)process_utilities.T;
                                uncaught_errorP = (SubLObject)process_utilities.NIL;
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)process_utilities.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
                finally {
                    process_utilities.$thinking_task$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)process_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (process_utilities.NIL != uncaught_errorP && thinking_status(thinking) != process_utilities.$kw99$STOPPED && process_utilities.NIL == error_message) {
                        error_message = PrintLow.format((SubLObject)process_utilities.NIL, (SubLObject)process_utilities.$str103$Function__A_in_thread__A_terminat, function, thinking_name(thinking));
                    }
                    thinking_thread_finalize(thinking, result, success, error_message);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        }
        finally {
            Packages.$package$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, success, error_message);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 17650L)
    public static SubLObject thinking_thread_initialize(final SubLObject thinking) {
        thinking_note_start_time(thinking, Time.get_universal_time());
        final SubLObject thread = Threads.current_process();
        thinking_note_thread(thinking, thread);
        return thinking;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 17903L)
    public static SubLObject thinking_thread_finalize(final SubLObject thinking, final SubLObject result, final SubLObject success, final SubLObject error_message) {
        final SubLObject stopped = (SubLObject)((thinking_status(thinking) == process_utilities.$kw99$STOPPED) ? process_utilities.T : process_utilities.NIL);
        if (process_utilities.NIL != success) {
            thinking_note_result(thinking, result);
        }
        else if (process_utilities.NIL != error_message) {
            thinking_note_error_message(thinking, error_message);
        }
        thinking_note_finish_time(thinking, Time.get_universal_time());
        thinking_clear_thread(thinking);
        if (process_utilities.NIL == stopped) {
            thinking_note_status(thinking, (SubLObject)((process_utilities.NIL != error_message) ? process_utilities.$kw104$ERROR : process_utilities.$kw105$FINISHED));
        }
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
    public static SubLObject ipc_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)process_utilities.ZERO_INTEGER);
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
    public static SubLObject ipc_queue_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ipc_queue_native.class) ? process_utilities.T : process_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
    public static SubLObject ipc_queue_lock(final SubLObject v_object) {
        assert process_utilities.NIL != ipc_queue_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
    public static SubLObject ipc_queue_semaphore(final SubLObject v_object) {
        assert process_utilities.NIL != ipc_queue_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
    public static SubLObject ipc_queue_data_queue(final SubLObject v_object) {
        assert process_utilities.NIL != ipc_queue_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
    public static SubLObject _csetf_ipc_queue_lock(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != ipc_queue_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
    public static SubLObject _csetf_ipc_queue_semaphore(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != ipc_queue_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
    public static SubLObject _csetf_ipc_queue_data_queue(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != ipc_queue_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
    public static SubLObject make_ipc_queue(SubLObject arglist) {
        if (arglist == process_utilities.UNPROVIDED) {
            arglist = (SubLObject)process_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ipc_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)process_utilities.NIL, next = arglist; process_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)process_utilities.$kw71$LOCK)) {
                _csetf_ipc_queue_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw120$SEMAPHORE)) {
                _csetf_ipc_queue_semaphore(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw121$DATA_QUEUE)) {
                _csetf_ipc_queue_data_queue(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)process_utilities.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
    public static SubLObject visit_defstruct_ipc_queue(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw29$BEGIN, (SubLObject)process_utilities.$sym122$MAKE_IPC_QUEUE, (SubLObject)process_utilities.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw71$LOCK, ipc_queue_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw120$SEMAPHORE, ipc_queue_semaphore(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw121$DATA_QUEUE, ipc_queue_data_queue(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw32$END, (SubLObject)process_utilities.$sym122$MAKE_IPC_QUEUE, (SubLObject)process_utilities.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18912L)
    public static SubLObject visit_defstruct_object_ipc_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ipc_queue(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 18972L)
    public static SubLObject new_ipc_queue(final SubLObject name) {
        final SubLObject ipcq = make_ipc_queue((SubLObject)process_utilities.UNPROVIDED);
        final SubLObject lock_name = Sequences.cconcatenate((SubLObject)process_utilities.$str124$Lock_for_Queue_, name);
        _csetf_ipc_queue_lock(ipcq, Locks.make_lock(lock_name));
        _csetf_ipc_queue_semaphore(ipcq, Semaphores.new_semaphore(name, (SubLObject)process_utilities.ZERO_INTEGER));
        _csetf_ipc_queue_data_queue(ipcq, queues.create_queue((SubLObject)process_utilities.UNPROVIDED));
        return ipcq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 19407L)
    public static SubLObject ipc_enqueue(final SubLObject item, final SubLObject ipc_queue, SubLObject debugP) {
        if (debugP == process_utilities.UNPROVIDED) {
            debugP = process_utilities.$ipcq_debugP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lock = ipc_queue_lock(ipc_queue);
        final SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
        final SubLObject item_string = (SubLObject)((process_utilities.NIL != debugP) ? string_utilities.string_first_n((SubLObject)process_utilities.TWELVE_INTEGER, print_high.princ_to_string(item)) : process_utilities.NIL);
        final SubLObject _prev_bind_0 = process_utilities.$ipcq_debugP$.currentBinding(thread);
        try {
            process_utilities.$ipcq_debugP$.bind(debugP, thread);
            ipcq_debug(ipc_queue, (SubLObject)process_utilities.$str125$Waiting_to_enqueue__A, item_string, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
            SubLObject release = (SubLObject)process_utilities.NIL;
            try {
                release = Locks.seize_lock(lock);
                ipcq_debug(ipc_queue, (SubLObject)process_utilities.$str126$Enqueuing__A, item_string, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
                queues.enqueue(item, data_queue);
                if (process_utilities.NIL != debugP) {
                    ipcq_debug(ipc_queue, (SubLObject)process_utilities.$str127$Enqueued__A, item_string, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
                    ipcq_debug(ipc_queue, (SubLObject)process_utilities.$str128$Queue_size___S, queues.queue_size(data_queue), (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
                }
            }
            finally {
                if (process_utilities.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
            Semaphores.semaphore_signal(ipc_queue_semaphore(ipc_queue));
            check_ipcq_synchronized(ipc_queue);
        }
        finally {
            process_utilities.$ipcq_debugP$.rebind(_prev_bind_0, thread);
        }
        return ipc_queue;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 20113L)
    public static SubLObject ipc_dequeue(final SubLObject ipc_queue, SubLObject debugP) {
        if (debugP == process_utilities.UNPROVIDED) {
            debugP = process_utilities.$ipcq_debugP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = process_utilities.$ipcq_debugP$.currentBinding(thread);
        try {
            process_utilities.$ipcq_debugP$.bind(debugP, thread);
            SubLObject result = (SubLObject)process_utilities.NIL;
            SubLObject err_msg = (SubLObject)process_utilities.NIL;
            check_ipcq_synchronized(ipc_queue);
            final SubLObject lock = ipc_queue_lock(ipc_queue);
            final SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
            SubLObject succeeded = (SubLObject)process_utilities.NIL;
            try {
                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind((SubLObject)process_utilities.$sym101$CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        ipcq_debug(ipc_queue, (SubLObject)process_utilities.$str129$Waiting_for_dequeue_semaphore_, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
                        Semaphores.semaphore_wait(ipc_queue_semaphore(ipc_queue));
                        succeeded = (SubLObject)process_utilities.T;
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)process_utilities.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$5, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            finally {
                thread.throwStack.pop();
            }
            if (process_utilities.NIL != succeeded) {
                ipcq_debug(ipc_queue, (SubLObject)process_utilities.$str130$Waiting_for_Queue_lock_to_dequeue, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
                SubLObject release = (SubLObject)process_utilities.NIL;
                try {
                    release = Locks.seize_lock(lock);
                    result = queues.dequeue(data_queue);
                    if (process_utilities.NIL != debugP) {
                        ipcq_debug(ipc_queue, (SubLObject)process_utilities.$str131$Dequeued__A, string_utilities.string_first_n((SubLObject)process_utilities.TWELVE_INTEGER, print_high.princ_to_string(result)), (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
                        ipcq_debug(ipc_queue, (SubLObject)process_utilities.$str128$Queue_size___S, queues.queue_size(data_queue), (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
                        check_ipcq_synchronized(ipc_queue);
                    }
                }
                finally {
                    if (process_utilities.NIL != release) {
                        Locks.release_lock(lock);
                    }
                }
            }
            else if (process_utilities.NIL == err_msg) {
                err_msg = (SubLObject)process_utilities.$str132$Unknown_error_;
            }
            return Values.values(result, err_msg);
        }
        finally {
            process_utilities.$ipcq_debugP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 21034L)
    public static SubLObject check_ipcq_synchronized(final SubLObject ipc_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (process_utilities.NIL != process_utilities.$ipcq_debugP$.getDynamicValue(thread)) {
            final SubLObject q_size = ipc_current_queue_size(ipc_queue);
            final SubLObject s_count = Semaphores.semaphore_current_count(ipc_queue_semaphore(ipc_queue));
            format_nil.force_format((SubLObject)process_utilities.T, (SubLObject)process_utilities.$str134$____D___A___A___Q___D_S___D__, process_suid(Threads.current_process()), numeric_date_utilities.timestamp_with_milliseconds((SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED), Semaphores.semaphore_name(ipc_queue_semaphore(ipc_queue)), q_size, s_count, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
            if (!q_size.numE(s_count)) {
                Errors.warn((SubLObject)process_utilities.$str135$We_are_out_of_sync_on_either_the_, q_size, s_count);
            }
            return (SubLObject)process_utilities.NIL;
        }
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 21586L)
    public static SubLObject ipcq_debug(final SubLObject ipc_queue, final SubLObject str, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == process_utilities.UNPROVIDED) {
            arg1 = (SubLObject)process_utilities.NIL;
        }
        if (arg2 == process_utilities.UNPROVIDED) {
            arg2 = (SubLObject)process_utilities.NIL;
        }
        if (arg3 == process_utilities.UNPROVIDED) {
            arg3 = (SubLObject)process_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (process_utilities.NIL != process_utilities.$ipcq_debugP$.getDynamicValue(thread)) {
            format_nil.force_format((SubLObject)process_utilities.T, (SubLObject)process_utilities.$str136$____D___A___A____A__, process_suid(Threads.current_process()), numeric_date_utilities.timestamp_with_milliseconds((SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED), Semaphores.semaphore_name(ipc_queue_semaphore(ipc_queue)), PrintLow.format((SubLObject)process_utilities.NIL, str, new SubLObject[] { arg1, arg2, arg3 }), (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
        }
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 21894L)
    public static SubLObject ipc_dequeue_n(final SubLObject ipc_queue, SubLObject n, SubLObject debugP) {
        if (n == process_utilities.UNPROVIDED) {
            n = (SubLObject)process_utilities.$int137$100;
        }
        if (debugP == process_utilities.UNPROVIDED) {
            debugP = process_utilities.$ipcq_debugP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert process_utilities.NIL != subl_promotions.non_negative_integer_p(n) : n;
        assert process_utilities.NIL != ipc_queue_p(ipc_queue) : ipc_queue;
        final SubLObject _prev_bind_0 = process_utilities.$ipcq_debugP$.currentBinding(thread);
        try {
            process_utilities.$ipcq_debugP$.bind(debugP, thread);
            SubLObject count = (SubLObject)process_utilities.ZERO_INTEGER;
            SubLObject result = (SubLObject)process_utilities.NIL;
            ipcq_debug(ipc_queue, (SubLObject)process_utilities.$str139$Dequeueing__up_to___D_item__P_, n, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
            while (count.numL(n) && ipc_current_queue_size(ipc_queue).numG((SubLObject)process_utilities.ZERO_INTEGER)) {
                result = (SubLObject)ConsesLow.cons(ipc_dequeue(ipc_queue, debugP), result);
                count = Numbers.add(count, (SubLObject)process_utilities.ONE_INTEGER);
            }
            return Sequences.nreverse(result);
        }
        finally {
            process_utilities.$ipcq_debugP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 22455L)
    public static SubLObject ipc_drain(final SubLObject ipc_queue, SubLObject debugP) {
        if (debugP == process_utilities.UNPROVIDED) {
            debugP = process_utilities.$ipcq_debugP$.getDynamicValue();
        }
        return ipc_dequeue_n(ipc_queue, ipc_current_queue_size(ipc_queue), debugP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 22655L)
    public static SubLObject ipc_dequeue_with_timeout(final SubLObject ipc_queue, final SubLObject timeout_secs, SubLObject wait_slice) {
        if (wait_slice == process_utilities.UNPROVIDED) {
            wait_slice = (SubLObject)process_utilities.$float140$0_01;
        }
        final SubLObject timeout_realtime = numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time(timeout_secs);
        final SubLObject final_time = Numbers.add(timeout_realtime, Time.get_internal_real_time());
        while (Time.get_internal_real_time().numL(final_time)) {
            if (ipc_current_queue_size(ipc_queue).isPositive()) {
                return Values.values(ipc_dequeue(ipc_queue, (SubLObject)process_utilities.UNPROVIDED), (SubLObject)process_utilities.NIL);
            }
            Threads.sleep(wait_slice);
        }
        return Values.values((SubLObject)process_utilities.NIL, (SubLObject)process_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 23119L)
    public static SubLObject ipc_current_queue_size(final SubLObject ipc_queue) {
        SubLObject result = (SubLObject)process_utilities.NIL;
        SubLObject time_stamp = (SubLObject)process_utilities.NIL;
        final SubLObject lock = ipc_queue_lock(ipc_queue);
        final SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            time_stamp = Time.get_universal_time();
            result = queues.queue_size(data_queue);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return Values.values(result, time_stamp);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 23465L)
    public static SubLObject ipc_current_queue_content(final SubLObject ipc_queue) {
        SubLObject result = (SubLObject)process_utilities.NIL;
        SubLObject time_stamp = (SubLObject)process_utilities.NIL;
        final SubLObject lock = ipc_queue_lock(ipc_queue);
        final SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            time_stamp = Time.get_universal_time();
            result = queues.queue_elements(data_queue);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return Values.values(result, time_stamp);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 23897L)
    public static SubLObject launch_ipcq_test_producer(final SubLObject ipc_queue, SubLObject delay) {
        if (delay == process_utilities.UNPROVIDED) {
            delay = (SubLObject)process_utilities.ZERO_INTEGER;
        }
        return make_cyc_server_process_with_args((SubLObject)process_utilities.$str142$IPCQ_Test_Producer, (SubLObject)process_utilities.$sym143$IPCQ_TEST_PRODUCER_RUN, (SubLObject)ConsesLow.list(ipc_queue, delay));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 24099L)
    public static SubLObject ipcq_test_producer_run(final SubLObject ipc_queue, SubLObject delay) {
        if (delay == process_utilities.UNPROVIDED) {
            delay = (SubLObject)process_utilities.ZERO_INTEGER;
        }
        Threads.sleep(delay);
        SubLObject cdolist_list_var = process_utilities.$ipcq_test_items$.getGlobalValue();
        SubLObject item = (SubLObject)process_utilities.NIL;
        item = cdolist_list_var.first();
        while (process_utilities.NIL != cdolist_list_var) {
            ipc_enqueue(item, ipc_queue, (SubLObject)process_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 24270L)
    public static SubLObject test_ipc_enqueue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ipc_queue = new_ipc_queue((SubLObject)process_utilities.$str144$Test_IPC_Queue);
        launch_ipcq_test_producer(ipc_queue, (SubLObject)process_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = process_utilities.$ipcq_test_items$.getGlobalValue();
        SubLObject item = (SubLObject)process_utilities.NIL;
        item = cdolist_list_var.first();
        while (process_utilities.NIL != cdolist_list_var) {
            final SubLObject result = ipc_dequeue(ipc_queue, (SubLObject)process_utilities.UNPROVIDED);
            if (process_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !item.equal(result)) {
                Errors.error((SubLObject)process_utilities.$str145$Expected__S__got__S, item, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        return (SubLObject)process_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 24639L)
    public static SubLObject test_ipc_enqueue_drain() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ipc_queue = new_ipc_queue((SubLObject)process_utilities.$str144$Test_IPC_Queue);
        launch_ipcq_test_producer(ipc_queue, (SubLObject)process_utilities.UNPROVIDED);
        while (!Sequences.length(process_utilities.$ipcq_test_items$.getGlobalValue()).equal(ipc_current_queue_size(ipc_queue))) {
            Threads.sleep((SubLObject)process_utilities.ONE_INTEGER);
        }
        final SubLObject result = ipc_drain(ipc_queue, (SubLObject)process_utilities.UNPROVIDED);
        if (process_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !process_utilities.$ipcq_test_items$.getGlobalValue().equal(result)) {
            Errors.error((SubLObject)process_utilities.$str145$Expected__S__got__S, process_utilities.$ipcq_test_items$.getGlobalValue(), result);
        }
        return (SubLObject)process_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 25090L)
    public static SubLObject test_ipc_enqueue_drain_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ipc_queue = new_ipc_queue((SubLObject)process_utilities.$str144$Test_IPC_Queue);
        launch_ipcq_test_producer(ipc_queue, (SubLObject)process_utilities.UNPROVIDED);
        while (!Sequences.length(process_utilities.$ipcq_test_items$.getGlobalValue()).equal(ipc_current_queue_size(ipc_queue))) {
            Threads.sleep((SubLObject)process_utilities.ONE_INTEGER);
        }
        ipc_drain(ipc_queue, (SubLObject)process_utilities.UNPROVIDED);
        launch_ipcq_test_producer(ipc_queue, (SubLObject)process_utilities.TWO_INTEGER);
        final SubLObject expected = process_utilities.$ipcq_test_items$.getGlobalValue().first();
        final SubLObject actual = ipc_dequeue(ipc_queue, (SubLObject)process_utilities.UNPROVIDED);
        if (process_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected.equal(actual)) {
            Errors.error((SubLObject)process_utilities.$str145$Expected__S__got__S, expected, actual);
        }
        return (SubLObject)process_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject ordered_ipc_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)process_utilities.ZERO_INTEGER);
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject ordered_ipc_queue_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $ordered_ipc_queue_native.class) ? process_utilities.T : process_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject ordrd_ipcq_lock(final SubLObject v_object) {
        assert process_utilities.NIL != ordered_ipc_queue_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject ordrd_ipcq_producer_isg(final SubLObject v_object) {
        assert process_utilities.NIL != ordered_ipc_queue_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject ordrd_ipcq_consumer_isg(final SubLObject v_object) {
        assert process_utilities.NIL != ordered_ipc_queue_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject ordrd_ipcq_payload(final SubLObject v_object) {
        assert process_utilities.NIL != ordered_ipc_queue_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject ordrd_ipcq_early_consumer_semaphore(final SubLObject v_object) {
        assert process_utilities.NIL != ordered_ipc_queue_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject _csetf_ordrd_ipcq_lock(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != ordered_ipc_queue_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject _csetf_ordrd_ipcq_producer_isg(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != ordered_ipc_queue_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject _csetf_ordrd_ipcq_consumer_isg(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != ordered_ipc_queue_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject _csetf_ordrd_ipcq_payload(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != ordered_ipc_queue_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject _csetf_ordrd_ipcq_early_consumer_semaphore(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != ordered_ipc_queue_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject make_ordered_ipc_queue(SubLObject arglist) {
        if (arglist == process_utilities.UNPROVIDED) {
            arglist = (SubLObject)process_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $ordered_ipc_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)process_utilities.NIL, next = arglist; process_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)process_utilities.$kw71$LOCK)) {
                _csetf_ordrd_ipcq_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw175$PRODUCER_ISG)) {
                _csetf_ordrd_ipcq_producer_isg(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw176$CONSUMER_ISG)) {
                _csetf_ordrd_ipcq_consumer_isg(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw177$PAYLOAD)) {
                _csetf_ordrd_ipcq_payload(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw178$EARLY_CONSUMER_SEMAPHORE)) {
                _csetf_ordrd_ipcq_early_consumer_semaphore(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)process_utilities.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject visit_defstruct_ordered_ipc_queue(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw29$BEGIN, (SubLObject)process_utilities.$sym179$MAKE_ORDERED_IPC_QUEUE, (SubLObject)process_utilities.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw71$LOCK, ordrd_ipcq_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw175$PRODUCER_ISG, ordrd_ipcq_producer_isg(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw176$CONSUMER_ISG, ordrd_ipcq_consumer_isg(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw177$PAYLOAD, ordrd_ipcq_payload(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw178$EARLY_CONSUMER_SEMAPHORE, ordrd_ipcq_early_consumer_semaphore(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw32$END, (SubLObject)process_utilities.$sym179$MAKE_ORDERED_IPC_QUEUE, (SubLObject)process_utilities.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 26916L)
    public static SubLObject visit_defstruct_object_ordered_ipc_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_ordered_ipc_queue(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 27153L)
    public static SubLObject new_ordered_ipc_queue(final SubLObject name, SubLObject size_limit) {
        if (size_limit == process_utilities.UNPROVIDED) {
            size_limit = (SubLObject)process_utilities.NIL;
        }
        assert process_utilities.NIL != Types.stringp(name) : name;
        final SubLObject o_ipcq = make_ordered_ipc_queue((SubLObject)process_utilities.UNPROVIDED);
        final SubLObject lock_name = Sequences.cconcatenate((SubLObject)process_utilities.$str182$Lock_for_Ordered_IPC_Queue_, name);
        _csetf_ordrd_ipcq_lock(o_ipcq, Locks.make_lock(lock_name));
        _csetf_ordrd_ipcq_producer_isg(o_ipcq, integer_sequence_generator.new_integer_sequence_generator((SubLObject)process_utilities.ZERO_INTEGER, size_limit, (SubLObject)process_utilities.UNPROVIDED));
        _csetf_ordrd_ipcq_consumer_isg(o_ipcq, integer_sequence_generator.new_integer_sequence_generator((SubLObject)process_utilities.ZERO_INTEGER, size_limit, (SubLObject)process_utilities.UNPROVIDED));
        _csetf_ordrd_ipcq_payload(o_ipcq, dictionary_utilities.new_synchronized_dictionary((SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED));
        _csetf_ordrd_ipcq_early_consumer_semaphore(o_ipcq, Semaphores.new_semaphore((SubLObject)process_utilities.$str183$Ordered_IPCQ_Early_Producer, (SubLObject)process_utilities.ZERO_INTEGER));
        return o_ipcq;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 28004L)
    public static SubLObject ordered_ipc_enqueue(final SubLObject item, final SubLObject o_ipcq) {
        assert process_utilities.NIL != ordered_ipc_queue_p(o_ipcq) : o_ipcq;
        final SubLObject ticket = integer_sequence_generator.integer_sequence_generator_next(ordrd_ipcq_producer_isg(o_ipcq));
        final SubLObject lock = ordrd_ipcq_lock(o_ipcq);
        final SubLObject payload = ordrd_ipcq_payload(o_ipcq);
        SubLObject awoke_someoneP = (SubLObject)process_utilities.NIL;
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject entry = map_utilities.map_get(payload, ticket, process_utilities.$ordered_ipcq_empty$.getGlobalValue());
            map_utilities.map_put(payload, ticket, item);
            if (process_utilities.$ordered_ipcq_empty$.getGlobalValue().eql(entry)) {
                awoke_someoneP = (SubLObject)process_utilities.NIL;
            }
            else if (process_utilities.NIL != Threads.valid_process_p(entry)) {
                Semaphores.semaphore_signal(ordrd_ipcq_early_consumer_semaphore(o_ipcq));
                awoke_someoneP = (SubLObject)process_utilities.T;
            }
            else if (process_utilities.NIL != Types.processp(entry)) {
                awoke_someoneP = ordered_ipc_enqueue(item, o_ipcq);
            }
            else {
                Errors.error((SubLObject)process_utilities.$str184$Unexpected_entry__A_in_the_payloa, entry, o_ipcq);
            }
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return awoke_someoneP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 29430L)
    public static SubLObject ordered_ipc_dequeue(final SubLObject o_ipcq) {
        assert process_utilities.NIL != ordered_ipc_queue_p(o_ipcq) : o_ipcq;
        final SubLObject ticket = integer_sequence_generator.integer_sequence_generator_next(ordrd_ipcq_consumer_isg(o_ipcq));
        final SubLObject lock = ordrd_ipcq_lock(o_ipcq);
        final SubLObject payload = ordrd_ipcq_payload(o_ipcq);
        SubLObject entry = process_utilities.$ordered_ipcq_empty$.getGlobalValue();
        while (process_utilities.$ordered_ipcq_empty$.getGlobalValue().eql(entry)) {
            SubLObject earlyP = (SubLObject)process_utilities.NIL;
            SubLObject release = (SubLObject)process_utilities.NIL;
            try {
                release = Locks.seize_lock(lock);
                entry = map_utilities.map_get_without_values(payload, ticket, process_utilities.$ordered_ipcq_empty$.getGlobalValue());
                if (process_utilities.$ordered_ipcq_empty$.getGlobalValue().eql(entry)) {
                    map_utilities.map_put(payload, ticket, Threads.current_process());
                    earlyP = (SubLObject)process_utilities.T;
                }
                else {
                    map_utilities.map_remove(payload, ticket);
                }
            }
            finally {
                if (process_utilities.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
            if (process_utilities.NIL != earlyP) {
                Semaphores.semaphore_wait(ordrd_ipcq_early_consumer_semaphore(o_ipcq));
            }
        }
        return entry;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 30344L)
    public static SubLObject ordered_ipc_queue_emptyP(final SubLObject o_ipcq) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator_var = map_utilities.new_map_iterator(ordrd_ipcq_payload(o_ipcq));
        SubLObject valid;
        for (SubLObject done_var = (SubLObject)process_utilities.NIL; process_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(process_utilities.NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject entry = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (process_utilities.NIL != valid) {
                final SubLObject value = conses_high.second(entry);
                if (process_utilities.NIL == Types.processp(value)) {
                    return (SubLObject)process_utilities.NIL;
                }
            }
        }
        return (SubLObject)process_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 30830L)
    public static SubLObject ordered_ipc_current_queue_size(final SubLObject o_ipcq, SubLObject estimation_threshold) {
        if (estimation_threshold == process_utilities.UNPROVIDED) {
            estimation_threshold = process_utilities.$ordered_ipc_current_queue_size_estimation_threshold$.getDynamicValue();
        }
        assert process_utilities.NIL != ordered_ipc_queue_p(o_ipcq) : o_ipcq;
        SubLObject estimate = Numbers.subtract(integer_sequence_generator.get_integer_sequence_generator_recent(ordrd_ipcq_producer_isg(o_ipcq)), integer_sequence_generator.get_integer_sequence_generator_recent(ordrd_ipcq_consumer_isg(o_ipcq)));
        if (!estimate.eql((SubLObject)process_utilities.ZERO_INTEGER) || process_utilities.NIL == ordered_ipc_queue_emptyP(o_ipcq)) {
            estimate = Numbers.add(estimate, (SubLObject)process_utilities.ONE_INTEGER);
        }
        return estimate.numG(estimation_threshold) ? estimate : Sequences.length(ordered_ipc_current_queue_contents(o_ipcq));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 31741L)
    public static SubLObject ordered_ipc_current_queue_contents(final SubLObject o_ipcq) {
        assert process_utilities.NIL != ordered_ipc_queue_p(o_ipcq) : o_ipcq;
        return Sequences.remove_if((SubLObject)process_utilities.$sym7$PROCESSP, map_utilities.map_values(ordrd_ipcq_payload(o_ipcq)), (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 32071L)
    public static SubLObject ordered_ipc_queue_quiescedP(final SubLObject o_ipcq) {
        return map_utilities.map_empty_p(ordrd_ipcq_payload(o_ipcq));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 32271L)
    public static SubLObject kill_process_named(final SubLObject name) {
        enforceType(name, process_utilities.$sym85$STRINGP);
        SubLObject cdolist_list_var = Threads.all_processes();
        SubLObject process = (SubLObject)process_utilities.NIL;
        process = cdolist_list_var.first();
        while (process_utilities.NIL != cdolist_list_var) {
            final SubLObject process_name = Threads.process_name(process);
            if (process_utilities.NIL != Strings.stringE(name, process_name, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED)) {
                Threads.kill_process(process);
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        }
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 32742L)
    public static SubLObject process_named(final SubLObject name) {
        assert process_utilities.NIL != Types.stringp(name) : name;
        SubLObject cdolist_list_var = Threads.all_processes();
        SubLObject process = (SubLObject)process_utilities.NIL;
        process = cdolist_list_var.first();
        while (process_utilities.NIL != cdolist_list_var) {
            final SubLObject process_name = Threads.process_name(process);
            if (process_utilities.NIL != Strings.stringE(name, process_name, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED)) {
                return process;
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        }
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33052L)
    public static SubLObject process_exhaust_immediately_fn() {
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33206L)
    public static SubLObject make_exhausted_process(final SubLObject name) {
        return Threads.make_process(name, (SubLObject)process_utilities.$sym191$PROCESS_EXHAUST_IMMEDIATELY_FN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33371L)
    public static SubLObject visit_defstruct_object_process_method(final SubLObject v_object, final SubLObject visitor_fn) {
        return visit_defstruct_object_process(v_object, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33501L)
    public static SubLObject visit_defstruct_object_process(final SubLObject process, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, process, (SubLObject)process_utilities.$kw29$BEGIN, (SubLObject)process_utilities.$sym193$MAKE_EXHAUSTED_PROCESS, (SubLObject)process_utilities.ONE_INTEGER);
        Functions.funcall(visitor_fn, process, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw73$NAME, Threads.process_name(process));
        Functions.funcall(visitor_fn, process, (SubLObject)process_utilities.$kw32$END, (SubLObject)process_utilities.$sym193$MAKE_EXHAUSTED_PROCESS, (SubLObject)process_utilities.ONE_INTEGER);
        return process;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33782L)
    public static SubLObject visit_defstruct_object_lock_method(final SubLObject v_object, final SubLObject visitor_fn) {
        return visit_defstruct_object_lock(v_object, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 33906L)
    public static SubLObject visit_defstruct_object_lock(final SubLObject lock, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, lock, (SubLObject)process_utilities.$kw29$BEGIN, (SubLObject)process_utilities.$sym195$MAKE_LOCK, (SubLObject)process_utilities.ONE_INTEGER);
        Functions.funcall(visitor_fn, lock, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw73$NAME, Locks.lock_name(lock));
        Functions.funcall(visitor_fn, lock, (SubLObject)process_utilities.$kw32$END, (SubLObject)process_utilities.$sym195$MAKE_LOCK, (SubLObject)process_utilities.ONE_INTEGER);
        return lock;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject process_wrapper_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)process_utilities.ZERO_INTEGER);
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject process_wrapper_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $process_wrapper_native.class) ? process_utilities.T : process_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject process_wrapper_id(final SubLObject v_object) {
        assert process_utilities.NIL != process_wrapper_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject process_wrapper_process(final SubLObject v_object) {
        assert process_utilities.NIL != process_wrapper_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject process_wrapper_state(final SubLObject v_object) {
        assert process_utilities.NIL != process_wrapper_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject process_wrapper_lock(final SubLObject v_object) {
        assert process_utilities.NIL != process_wrapper_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject process_wrapper_plist(final SubLObject v_object) {
        assert process_utilities.NIL != process_wrapper_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject _csetf_process_wrapper_id(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != process_wrapper_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject _csetf_process_wrapper_process(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != process_wrapper_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject _csetf_process_wrapper_state(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != process_wrapper_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject _csetf_process_wrapper_lock(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != process_wrapper_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject _csetf_process_wrapper_plist(final SubLObject v_object, final SubLObject value) {
        assert process_utilities.NIL != process_wrapper_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject make_process_wrapper(SubLObject arglist) {
        if (arglist == process_utilities.UNPROVIDED) {
            arglist = (SubLObject)process_utilities.NIL;
        }
        final SubLObject v_new = (SubLObject)new $process_wrapper_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)process_utilities.NIL, next = arglist; process_utilities.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)process_utilities.$kw214$ID)) {
                _csetf_process_wrapper_id(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw26$PROCESS)) {
                _csetf_process_wrapper_process(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw215$STATE)) {
                _csetf_process_wrapper_state(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw71$LOCK)) {
                _csetf_process_wrapper_lock(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw216$PLIST)) {
                _csetf_process_wrapper_plist(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)process_utilities.$str28$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject visit_defstruct_process_wrapper(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw29$BEGIN, (SubLObject)process_utilities.$sym217$MAKE_PROCESS_WRAPPER, (SubLObject)process_utilities.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw214$ID, process_wrapper_id(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw26$PROCESS, process_wrapper_process(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw215$STATE, process_wrapper_state(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw71$LOCK, process_wrapper_lock(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw31$SLOT, (SubLObject)process_utilities.$kw216$PLIST, process_wrapper_plist(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)process_utilities.$kw32$END, (SubLObject)process_utilities.$sym217$MAKE_PROCESS_WRAPPER, (SubLObject)process_utilities.FIVE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 36849L)
    public static SubLObject visit_defstruct_object_process_wrapper_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_process_wrapper(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 37127L)
    public static SubLObject new_process_wrapper(final SubLObject name, final SubLObject process_wrapper_function, SubLObject rest_args) {
        if (rest_args == process_utilities.UNPROVIDED) {
            rest_args = (SubLObject)process_utilities.NIL;
        }
        final SubLObject process_lock = Locks.make_lock(name);
        SubLObject process_wrapper = (SubLObject)process_utilities.NIL;
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(process_lock);
            process_wrapper = make_process_wrapper((SubLObject)ConsesLow.list((SubLObject)process_utilities.$kw71$LOCK, process_lock, (SubLObject)process_utilities.$kw215$STATE, (SubLObject)process_utilities.$kw220$STARTING, (SubLObject)process_utilities.$kw214$ID, integer_sequence_generator.integer_sequence_generator_next(process_utilities.$process_wrapper_isg$.getGlobalValue())));
            final SubLObject process = make_cyc_server_process_with_args(name, (SubLObject)process_utilities.$sym221$NEW_PROCESS_WRAPPER_INT, (SubLObject)ConsesLow.list(process_wrapper, process_wrapper_function, rest_args));
            _csetf_process_wrapper_process(process_wrapper, process);
            _csetf_process_wrapper_state(process_wrapper, (SubLObject)process_utilities.$kw102$RUNNING);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(process_lock);
            }
        }
        return process_wrapper;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 37974L)
    public static SubLObject new_process_wrapper_int(final SubLObject process_wrapper, final SubLObject process_wrapper_function, final SubLObject rest_args) {
        SubLObject result = (SubLObject)process_utilities.NIL;
        result = Functions.apply(process_wrapper_function, (SubLObject)ConsesLow.cons(process_wrapper, rest_args));
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_process_wrapper_state(process_wrapper, (SubLObject)process_utilities.$kw27$COMPLETED);
            _csetf_process_wrapper_process(process_wrapper, (SubLObject)process_utilities.NIL);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 38520L)
    public static SubLObject process_wrapper_get_id(final SubLObject process_wrapper) {
        return process_wrapper_id(process_wrapper);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 38641L)
    public static SubLObject process_wrapper_get_process(final SubLObject process_wrapper) {
        return process_wrapper_process(process_wrapper);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 38754L)
    public static SubLObject process_wrapper_get_state(final SubLObject process_wrapper) {
        return process_wrapper_state(process_wrapper);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 38863L)
    public static SubLObject process_wrapper_get_lock(final SubLObject process_wrapper) {
        return process_wrapper_lock(process_wrapper);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 38973L)
    public static SubLObject process_wrapper_get_plist(final SubLObject process_wrapper) {
        return conses_high.copy_list(process_wrapper_plist(process_wrapper));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39097L)
    public static SubLObject process_wrapper_process_startingP(final SubLObject process_wrapper) {
        return Equality.eq(process_wrapper_state(process_wrapper), (SubLObject)process_utilities.$kw220$STARTING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39241L)
    public static SubLObject process_wrapper_process_runningP(final SubLObject process_wrapper) {
        return Equality.eq(process_wrapper_state(process_wrapper), (SubLObject)process_utilities.$kw102$RUNNING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39371L)
    public static SubLObject process_wrapper_process_completedP(final SubLObject process_wrapper) {
        return Equality.eq(process_wrapper_state(process_wrapper), (SubLObject)process_utilities.$kw27$COMPLETED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39507L)
    public static SubLObject process_wrapper_process_abortedP(final SubLObject process_wrapper) {
        return Equality.eq(process_wrapper_state(process_wrapper), (SubLObject)process_utilities.$kw222$ABORTED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39637L)
    public static SubLObject process_wrapper_process_pausingP(final SubLObject process_wrapper) {
        return Equality.eq(process_wrapper_state(process_wrapper), (SubLObject)process_utilities.$kw223$PAUSING);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39767L)
    public static SubLObject process_wrapper_process_pausedP(final SubLObject process_wrapper) {
        return Equality.eq(process_wrapper_state(process_wrapper), (SubLObject)process_utilities.$kw224$PAUSED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 39895L)
    public static SubLObject process_wrapper_process_pause(final SubLObject process_wrapper) {
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        final SubLObject result = (SubLObject)process_utilities.NIL;
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject pcase_var = process_wrapper_state(process_wrapper);
            if (pcase_var.eql((SubLObject)process_utilities.$kw102$RUNNING)) {
                _csetf_process_wrapper_state(process_wrapper, (SubLObject)process_utilities.$kw223$PAUSING);
            }
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 40196L)
    public static SubLObject process_wrapper_process_resume(final SubLObject process_wrapper) {
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        final SubLObject result = (SubLObject)process_utilities.NIL;
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject pcase_var = process_wrapper_state(process_wrapper);
            if (pcase_var.eql((SubLObject)process_utilities.$kw223$PAUSING)) {
                _csetf_process_wrapper_state(process_wrapper, (SubLObject)process_utilities.$kw102$RUNNING);
            }
            else if (pcase_var.eql((SubLObject)process_utilities.$kw224$PAUSED)) {
                Threads.process_unblock(process_wrapper_process(process_wrapper));
                _csetf_process_wrapper_state(process_wrapper, (SubLObject)process_utilities.$kw102$RUNNING);
            }
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 40630L)
    public static SubLObject process_wrapper_checkpoint(final SubLObject process_wrapper) {
        if (Threads.current_process().eql(process_wrapper_process(process_wrapper))) {
            final SubLObject lock = process_wrapper_lock(process_wrapper);
            SubLObject blockP = (SubLObject)process_utilities.NIL;
            SubLObject release = (SubLObject)process_utilities.NIL;
            try {
                release = Locks.seize_lock(lock);
                final SubLObject pcase_var = process_wrapper_state(process_wrapper);
                if (pcase_var.eql((SubLObject)process_utilities.$kw223$PAUSING)) {
                    _csetf_process_wrapper_state(process_wrapper, (SubLObject)process_utilities.$kw224$PAUSED);
                    blockP = (SubLObject)process_utilities.T;
                }
            }
            finally {
                if (process_utilities.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
            if (process_utilities.NIL != blockP) {
                Threads.process_block();
            }
        }
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 41360L)
    public static SubLObject process_wrapper_block(final SubLObject process_wrapper) {
        if (Threads.current_process().eql(process_wrapper_process(process_wrapper))) {
            final SubLObject lock = process_wrapper_lock(process_wrapper);
            SubLObject release = (SubLObject)process_utilities.NIL;
            try {
                release = Locks.seize_lock(lock);
                _csetf_process_wrapper_state(process_wrapper, (SubLObject)process_utilities.$kw224$PAUSED);
            }
            finally {
                if (process_utilities.NIL != release) {
                    Locks.release_lock(lock);
                }
            }
            Threads.process_block();
            return (SubLObject)process_utilities.NIL;
        }
        return (SubLObject)process_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 41821L)
    public static SubLObject process_wrapper_process_abort(final SubLObject process_wrapper) {
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        final SubLObject release_lock_then_killP = Equality.eq(Threads.current_process(), process_wrapper_process(process_wrapper));
        SubLObject result = (SubLObject)process_utilities.NIL;
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            _csetf_process_wrapper_state(process_wrapper, (SubLObject)process_utilities.$kw222$ABORTED);
            if (process_utilities.NIL == release_lock_then_killP) {
                result = Threads.kill_process(process_wrapper_process(process_wrapper));
                _csetf_process_wrapper_process(process_wrapper, (SubLObject)process_utilities.NIL);
            }
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        if (process_utilities.NIL != release_lock_then_killP) {
            result = Threads.kill_process(process_wrapper_process(process_wrapper));
            _csetf_process_wrapper_process(process_wrapper, (SubLObject)process_utilities.NIL);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 42660L)
    public static SubLObject process_wrapper_set_property(final SubLObject process_wrapper, final SubLObject indicator, final SubLObject value) {
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        SubLObject result = (SubLObject)process_utilities.NIL;
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            final SubLObject plist = process_wrapper_plist(process_wrapper);
            result = conses_high.putf(plist, indicator, value);
            _csetf_process_wrapper_plist(process_wrapper, result);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 43015L)
    public static SubLObject process_wrapper_get_property(final SubLObject process_wrapper, final SubLObject indicator, SubLObject default_value) {
        if (default_value == process_utilities.UNPROVIDED) {
            default_value = (SubLObject)process_utilities.NIL;
        }
        final SubLObject lock = process_wrapper_lock(process_wrapper);
        SubLObject result = (SubLObject)process_utilities.NIL;
        SubLObject release = (SubLObject)process_utilities.NIL;
        try {
            release = Locks.seize_lock(lock);
            result = conses_high.getf(process_wrapper_plist(process_wrapper), indicator, default_value);
        }
        finally {
            if (process_utilities.NIL != release) {
                Locks.release_lock(lock);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 43316L)
    public static SubLObject make_cyc_server_process(final SubLObject name, final SubLObject function) {
        return subl_promotions.make_process_with_args(name, (SubLObject)process_utilities.$sym225$CYC_SERVER_PROCESS_FUNCALL, (SubLObject)ConsesLow.list(function));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 43772L)
    public static SubLObject cyc_server_process_funcall(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding(thread);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)process_utilities.$str100$CYC), thread);
            reader.$read_default_float_format$.bind((SubLObject)process_utilities.$sym226$DOUBLE_FLOAT, thread);
            print_high.$print_readably$.bind((SubLObject)process_utilities.NIL, thread);
            reader.$read_eval$.bind((SubLObject)process_utilities.NIL, thread);
            final SubLObject old_priority = Threads.process_priority(Threads.current_process());
            try {
                Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                return Functions.funcall(function);
            }
            finally {
                final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)process_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Threads.set_process_priority(Threads.current_process(), old_priority);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        }
        finally {
            reader.$read_eval$.rebind(_prev_bind_4, thread);
            print_high.$print_readably$.rebind(_prev_bind_3, thread);
            reader.$read_default_float_format$.rebind(_prev_bind_2, thread);
            Packages.$package$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 43978L)
    public static SubLObject make_cyc_server_process_with_args(final SubLObject name, final SubLObject function, SubLObject args) {
        if (args == process_utilities.UNPROVIDED) {
            args = (SubLObject)process_utilities.NIL;
        }
        return subl_promotions.make_process_with_args(name, (SubLObject)process_utilities.$sym227$CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons(function, args)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 44275L)
    public static SubLObject cyc_server_process_funcall_with_args(final SubLObject functionXargs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject function = (SubLObject)process_utilities.NIL;
        SubLObject args = (SubLObject)process_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(functionXargs, functionXargs, (SubLObject)process_utilities.$list228);
        function = functionXargs.first();
        final SubLObject current = args = functionXargs.rest();
        final SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = reader.$read_eval$.currentBinding(thread);
        try {
            Packages.$package$.bind(Packages.find_package((SubLObject)process_utilities.$str100$CYC), thread);
            reader.$read_default_float_format$.bind((SubLObject)process_utilities.$sym226$DOUBLE_FLOAT, thread);
            print_high.$print_readably$.bind((SubLObject)process_utilities.NIL, thread);
            reader.$read_eval$.bind((SubLObject)process_utilities.NIL, thread);
            final SubLObject old_priority = Threads.process_priority(Threads.current_process());
            try {
                Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
                return Functions.apply(function, args);
            }
            finally {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)process_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    Threads.set_process_priority(Threads.current_process(), old_priority);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        }
        finally {
            reader.$read_eval$.rebind(_prev_bind_4, thread);
            print_high.$print_readably$.rebind(_prev_bind_3, thread);
            reader.$read_default_float_format$.rebind(_prev_bind_2, thread);
            Packages.$package$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/process-utilities.lisp", position = 44559L)
    public static SubLObject process_count() {
        return Sequences.length(Threads.all_processes());
    }
    
    public static SubLObject declare_process_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "debug_initial_process", "DEBUG-INITIAL-PROCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "interrupt_initial_process", "INTERRUPT-INITIAL-PROCESS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_idleP", "PROCESS-IDLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_busyP", "PROCESS-BUSY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_waitingP", "PROCESS-WAITING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_runningP", "PROCESS-RUNNING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_suid", "PROCESS-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "find_process_by_suid", "FIND-PROCESS-BY-SUID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "find_process_by_name", "FIND-PROCESS-BY-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "gather_processes_by_name", "GATHER-PROCESSES-BY-NAME", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "active_process_at_startupP", "ACTIVE-PROCESS-AT-STARTUP?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "note_active_processes_at_startup", "NOTE-ACTIVE-PROCESSES-AT-STARTUP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_form", "PROCESS-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_note_form", "PROCESS-NOTE-FORM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "current_process_note_form", "CURRENT-PROCESS-NOTE-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "current_process_clear_form", "CURRENT-PROCESS-CLEAR-FORM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "clear_invalid_process_forms", "CLEAR-INVALID-PROCESS-FORMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "task_print_function_trampoline", "TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "task_p", "TASK-P", 1, 0, false);
        new $task_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "task_process", "TASK-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "task_completed", "TASK-COMPLETED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_task_process", "_CSETF-TASK-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_task_completed", "_CSETF-TASK-COMPLETED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "make_task", "MAKE-TASK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_task", "VISIT-DEFSTRUCT-TASK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_object_task_method", "VISIT-DEFSTRUCT-OBJECT-TASK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "new_task", "NEW-TASK", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "new_task_internal", "NEW-TASK-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_task_print_function_trampoline", "THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_task_p", "THINKING-TASK-P", 1, 0, false);
        new $thinking_task_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_lock", "T-TASK-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_thread", "T-TASK-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_name", "T-TASK-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_status", "T-TASK-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_progress_message", "T-TASK-PROGRESS-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_progress_sofar", "T-TASK-PROGRESS-SOFAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_progress_total", "T-TASK-PROGRESS-TOTAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_start_time", "T-TASK-START-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_finish_time", "T-TASK-FINISH-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_result", "T-TASK-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_error_message", "T-TASK-ERROR-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "t_task_properties", "T-TASK-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_lock", "_CSETF-T-TASK-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_thread", "_CSETF-T-TASK-THREAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_name", "_CSETF-T-TASK-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_status", "_CSETF-T-TASK-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_progress_message", "_CSETF-T-TASK-PROGRESS-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_progress_sofar", "_CSETF-T-TASK-PROGRESS-SOFAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_progress_total", "_CSETF-T-TASK-PROGRESS-TOTAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_start_time", "_CSETF-T-TASK-START-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_finish_time", "_CSETF-T-TASK-FINISH-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_result", "_CSETF-T-TASK-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_error_message", "_CSETF-T-TASK-ERROR-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_t_task_properties", "_CSETF-T-TASK-PROPERTIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "make_thinking_task", "MAKE-THINKING-TASK", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_thinking_task", "VISIT-DEFSTRUCT-THINKING-TASK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_object_thinking_task_method", "VISIT-DEFSTRUCT-OBJECT-THINKING-TASK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "new_thinking_task", "NEW-THINKING-TASK", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.process_utilities", "with_thinking_lock", "WITH-THINKING-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_note_thread", "THINKING-NOTE-THREAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_clear_thread", "THINKING-CLEAR-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_note_status", "THINKING-NOTE-STATUS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_note_progress_message", "THINKING-NOTE-PROGRESS-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_note_progress_sofar", "THINKING-NOTE-PROGRESS-SOFAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_note_progress_total", "THINKING-NOTE-PROGRESS-TOTAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_note_start_time", "THINKING-NOTE-START-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_note_finish_time", "THINKING-NOTE-FINISH-TIME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_note_result", "THINKING-NOTE-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_note_error_message", "THINKING-NOTE-ERROR-MESSAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_note_property", "THINKING-NOTE-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_lock", "THINKING-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_thread", "THINKING-THREAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_name", "THINKING-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_status", "THINKING-STATUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_progress_message", "THINKING-PROGRESS-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_progress_sofar", "THINKING-PROGRESS-SOFAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_progress_total", "THINKING-PROGRESS-TOTAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_start_time", "THINKING-START-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_finish_time", "THINKING-FINISH-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_result", "THINKING-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_error_message", "THINKING-ERROR-MESSAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_property", "THINKING-PROPERTY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_properties", "THINKING-PROPERTIES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_task", "THINKING-TASK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_start", "THINKING-START", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_stop", "THINKING-STOP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_thread_run", "THINKING-THREAD-RUN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_thread_initialize", "THINKING-THREAD-INITIALIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "thinking_thread_finalize", "THINKING-THREAD-FINALIZE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_queue_print_function_trampoline", "IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_queue_p", "IPC-QUEUE-P", 1, 0, false);
        new $ipc_queue_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_queue_lock", "IPC-QUEUE-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_queue_semaphore", "IPC-QUEUE-SEMAPHORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_queue_data_queue", "IPC-QUEUE-DATA-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_ipc_queue_lock", "_CSETF-IPC-QUEUE-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_ipc_queue_semaphore", "_CSETF-IPC-QUEUE-SEMAPHORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_ipc_queue_data_queue", "_CSETF-IPC-QUEUE-DATA-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "make_ipc_queue", "MAKE-IPC-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_ipc_queue", "VISIT-DEFSTRUCT-IPC-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_object_ipc_queue_method", "VISIT-DEFSTRUCT-OBJECT-IPC-QUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "new_ipc_queue", "NEW-IPC-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_enqueue", "IPC-ENQUEUE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_dequeue", "IPC-DEQUEUE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "check_ipcq_synchronized", "CHECK-IPCQ-SYNCHRONIZED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipcq_debug", "IPCQ-DEBUG", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_dequeue_n", "IPC-DEQUEUE-N", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_drain", "IPC-DRAIN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_dequeue_with_timeout", "IPC-DEQUEUE-WITH-TIMEOUT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_current_queue_size", "IPC-CURRENT-QUEUE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipc_current_queue_content", "IPC-CURRENT-QUEUE-CONTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "launch_ipcq_test_producer", "LAUNCH-IPCQ-TEST-PRODUCER", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ipcq_test_producer_run", "IPCQ-TEST-PRODUCER-RUN", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "test_ipc_enqueue_dequeue", "TEST-IPC-ENQUEUE-DEQUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "test_ipc_enqueue_drain", "TEST-IPC-ENQUEUE-DRAIN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "test_ipc_enqueue_drain_dequeue", "TEST-IPC-ENQUEUE-DRAIN-DEQUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordered_ipc_queue_print_function_trampoline", "ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordered_ipc_queue_p", "ORDERED-IPC-QUEUE-P", 1, 0, false);
        new $ordered_ipc_queue_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordrd_ipcq_lock", "ORDRD-IPCQ-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordrd_ipcq_producer_isg", "ORDRD-IPCQ-PRODUCER-ISG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordrd_ipcq_consumer_isg", "ORDRD-IPCQ-CONSUMER-ISG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordrd_ipcq_payload", "ORDRD-IPCQ-PAYLOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordrd_ipcq_early_consumer_semaphore", "ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_ordrd_ipcq_lock", "_CSETF-ORDRD-IPCQ-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_ordrd_ipcq_producer_isg", "_CSETF-ORDRD-IPCQ-PRODUCER-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_ordrd_ipcq_consumer_isg", "_CSETF-ORDRD-IPCQ-CONSUMER-ISG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_ordrd_ipcq_payload", "_CSETF-ORDRD-IPCQ-PAYLOAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_ordrd_ipcq_early_consumer_semaphore", "_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "make_ordered_ipc_queue", "MAKE-ORDERED-IPC-QUEUE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_ordered_ipc_queue", "VISIT-DEFSTRUCT-ORDERED-IPC-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_object_ordered_ipc_queue_method", "VISIT-DEFSTRUCT-OBJECT-ORDERED-IPC-QUEUE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "new_ordered_ipc_queue", "NEW-ORDERED-IPC-QUEUE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordered_ipc_enqueue", "ORDERED-IPC-ENQUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordered_ipc_dequeue", "ORDERED-IPC-DEQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordered_ipc_queue_emptyP", "ORDERED-IPC-QUEUE-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordered_ipc_current_queue_size", "ORDERED-IPC-CURRENT-QUEUE-SIZE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordered_ipc_current_queue_contents", "ORDERED-IPC-CURRENT-QUEUE-CONTENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "ordered_ipc_queue_quiescedP", "ORDERED-IPC-QUEUE-QUIESCED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "kill_process_named", "KILL-PROCESS-NAMED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_named", "PROCESS-NAMED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_exhaust_immediately_fn", "PROCESS-EXHAUST-IMMEDIATELY-FN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "make_exhausted_process", "MAKE-EXHAUSTED-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_object_process_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_object_process", "VISIT-DEFSTRUCT-OBJECT-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_object_lock_method", "VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_object_lock", "VISIT-DEFSTRUCT-OBJECT-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_print_function_trampoline", "PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_p", "PROCESS-WRAPPER-P", 1, 0, false);
        new $process_wrapper_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_id", "PROCESS-WRAPPER-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_process", "PROCESS-WRAPPER-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_state", "PROCESS-WRAPPER-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_lock", "PROCESS-WRAPPER-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_plist", "PROCESS-WRAPPER-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_process_wrapper_id", "_CSETF-PROCESS-WRAPPER-ID", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_process_wrapper_process", "_CSETF-PROCESS-WRAPPER-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_process_wrapper_state", "_CSETF-PROCESS-WRAPPER-STATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_process_wrapper_lock", "_CSETF-PROCESS-WRAPPER-LOCK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "_csetf_process_wrapper_plist", "_CSETF-PROCESS-WRAPPER-PLIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "make_process_wrapper", "MAKE-PROCESS-WRAPPER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_process_wrapper", "VISIT-DEFSTRUCT-PROCESS-WRAPPER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "visit_defstruct_object_process_wrapper_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-WRAPPER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "new_process_wrapper", "NEW-PROCESS-WRAPPER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "new_process_wrapper_int", "NEW-PROCESS-WRAPPER-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_get_id", "PROCESS-WRAPPER-GET-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_get_process", "PROCESS-WRAPPER-GET-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_get_state", "PROCESS-WRAPPER-GET-STATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_get_lock", "PROCESS-WRAPPER-GET-LOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_get_plist", "PROCESS-WRAPPER-GET-PLIST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_process_startingP", "PROCESS-WRAPPER-PROCESS-STARTING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_process_runningP", "PROCESS-WRAPPER-PROCESS-RUNNING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_process_completedP", "PROCESS-WRAPPER-PROCESS-COMPLETED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_process_abortedP", "PROCESS-WRAPPER-PROCESS-ABORTED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_process_pausingP", "PROCESS-WRAPPER-PROCESS-PAUSING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_process_pausedP", "PROCESS-WRAPPER-PROCESS-PAUSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_process_pause", "PROCESS-WRAPPER-PROCESS-PAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_process_resume", "PROCESS-WRAPPER-PROCESS-RESUME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_checkpoint", "PROCESS-WRAPPER-CHECKPOINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_block", "PROCESS-WRAPPER-BLOCK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_process_abort", "PROCESS-WRAPPER-PROCESS-ABORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_set_property", "PROCESS-WRAPPER-SET-PROPERTY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_wrapper_get_property", "PROCESS-WRAPPER-GET-PROPERTY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "make_cyc_server_process", "MAKE-CYC-SERVER-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "cyc_server_process_funcall", "CYC-SERVER-PROCESS-FUNCALL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "make_cyc_server_process_with_args", "MAKE-CYC-SERVER-PROCESS-WITH-ARGS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "cyc_server_process_funcall_with_args", "CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.process_utilities", "process_count", "PROCESS-COUNT", 0, 0, false);
        return (SubLObject)process_utilities.NIL;
    }
    
    public static SubLObject init_process_utilities_file() {
        process_utilities.$active_processes_at_startup$ = SubLFiles.deflexical("*ACTIVE-PROCESSES-AT-STARTUP*", (SubLObject)(maybeDefault((SubLObject)process_utilities.$sym10$_ACTIVE_PROCESSES_AT_STARTUP_, process_utilities.$active_processes_at_startup$, process_utilities.NIL)));
        process_utilities.$process_form_map$ = SubLFiles.deflexical("*PROCESS-FORM-MAP*", maybeDefault((SubLObject)process_utilities.$sym11$_PROCESS_FORM_MAP_, process_utilities.$process_form_map$, ()->(Hashtables.make_hash_table((SubLObject)process_utilities.TEN_INTEGER, Symbols.symbol_function((SubLObject)process_utilities.EQ), (SubLObject)process_utilities.UNPROVIDED))));
        process_utilities.$process_form_lock$ = SubLFiles.deflexical("*PROCESS-FORM-LOCK*", Locks.make_lock((SubLObject)process_utilities.$str12$Process_Form));
        process_utilities.$dtp_task$ = SubLFiles.defconstant("*DTP-TASK*", (SubLObject)process_utilities.$sym13$TASK);
        process_utilities.$dtp_thinking_task$ = SubLFiles.defconstant("*DTP-THINKING-TASK*", (SubLObject)process_utilities.$sym39$THINKING_TASK);
        process_utilities.$thinking_task$ = SubLFiles.defparameter("*THINKING-TASK*", (SubLObject)process_utilities.NIL);
        process_utilities.$dtp_ipc_queue$ = SubLFiles.defconstant("*DTP-IPC-QUEUE*", (SubLObject)process_utilities.$sym106$IPC_QUEUE);
        process_utilities.$ipcq_debugP$ = SubLFiles.defparameter("*IPCQ-DEBUG?*", (SubLObject)process_utilities.NIL);
        process_utilities.$ipcq_test_items$ = SubLFiles.deflexical("*IPCQ-TEST-ITEMS*", (SubLObject)process_utilities.$list141);
        process_utilities.$dtp_ordered_ipc_queue$ = SubLFiles.defconstant("*DTP-ORDERED-IPC-QUEUE*", (SubLObject)process_utilities.$sym157$ORDERED_IPC_QUEUE);
        process_utilities.$ordered_ipcq_empty$ = SubLFiles.defconstant("*ORDERED-IPCQ-EMPTY*", Symbols.make_symbol((SubLObject)process_utilities.$str181$empty_ordered_IPC_queue_entry));
        process_utilities.$ordered_ipc_current_queue_size_estimation_threshold$ = SubLFiles.defparameter("*ORDERED-IPC-CURRENT-QUEUE-SIZE-ESTIMATION-THRESHOLD*", (SubLObject)process_utilities.$int185$212);
        process_utilities.$dtp_process_wrapper$ = SubLFiles.defconstant("*DTP-PROCESS-WRAPPER*", (SubLObject)process_utilities.$sym196$PROCESS_WRAPPER);
        process_utilities.$process_wrapper_isg$ = SubLFiles.deflexical("*PROCESS-WRAPPER-ISG*", maybeDefault((SubLObject)process_utilities.$sym219$_PROCESS_WRAPPER_ISG_, process_utilities.$process_wrapper_isg$, ()->(integer_sequence_generator.new_integer_sequence_generator((SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED, (SubLObject)process_utilities.UNPROVIDED))));
        return (SubLObject)process_utilities.NIL;
    }
    
    public static SubLObject setup_process_utilities_file() {
        access_macros.define_obsolete_register((SubLObject)process_utilities.$sym0$INTERRUPT_INITIAL_PROCESS, (SubLObject)process_utilities.$list1);
        subl_macro_promotions.declare_defglobal((SubLObject)process_utilities.$sym10$_ACTIVE_PROCESSES_AT_STARTUP_);
        subl_macro_promotions.declare_defglobal((SubLObject)process_utilities.$sym11$_PROCESS_FORM_MAP_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), process_utilities.$dtp_task$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym20$TASK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)process_utilities.$list21);
        Structures.def_csetf((SubLObject)process_utilities.$sym22$TASK_PROCESS, (SubLObject)process_utilities.$sym23$_CSETF_TASK_PROCESS);
        Structures.def_csetf((SubLObject)process_utilities.$sym24$TASK_COMPLETED, (SubLObject)process_utilities.$sym25$_CSETF_TASK_COMPLETED);
        Equality.identity((SubLObject)process_utilities.$sym13$TASK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_task$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym33$VISIT_DEFSTRUCT_OBJECT_TASK_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), process_utilities.$dtp_thinking_task$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym45$THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)process_utilities.$list46);
        Structures.def_csetf((SubLObject)process_utilities.$sym47$T_TASK_LOCK, (SubLObject)process_utilities.$sym48$_CSETF_T_TASK_LOCK);
        Structures.def_csetf((SubLObject)process_utilities.$sym49$T_TASK_THREAD, (SubLObject)process_utilities.$sym50$_CSETF_T_TASK_THREAD);
        Structures.def_csetf((SubLObject)process_utilities.$sym51$T_TASK_NAME, (SubLObject)process_utilities.$sym52$_CSETF_T_TASK_NAME);
        Structures.def_csetf((SubLObject)process_utilities.$sym53$T_TASK_STATUS, (SubLObject)process_utilities.$sym54$_CSETF_T_TASK_STATUS);
        Structures.def_csetf((SubLObject)process_utilities.$sym55$T_TASK_PROGRESS_MESSAGE, (SubLObject)process_utilities.$sym56$_CSETF_T_TASK_PROGRESS_MESSAGE);
        Structures.def_csetf((SubLObject)process_utilities.$sym57$T_TASK_PROGRESS_SOFAR, (SubLObject)process_utilities.$sym58$_CSETF_T_TASK_PROGRESS_SOFAR);
        Structures.def_csetf((SubLObject)process_utilities.$sym59$T_TASK_PROGRESS_TOTAL, (SubLObject)process_utilities.$sym60$_CSETF_T_TASK_PROGRESS_TOTAL);
        Structures.def_csetf((SubLObject)process_utilities.$sym61$T_TASK_START_TIME, (SubLObject)process_utilities.$sym62$_CSETF_T_TASK_START_TIME);
        Structures.def_csetf((SubLObject)process_utilities.$sym63$T_TASK_FINISH_TIME, (SubLObject)process_utilities.$sym64$_CSETF_T_TASK_FINISH_TIME);
        Structures.def_csetf((SubLObject)process_utilities.$sym65$T_TASK_RESULT, (SubLObject)process_utilities.$sym66$_CSETF_T_TASK_RESULT);
        Structures.def_csetf((SubLObject)process_utilities.$sym67$T_TASK_ERROR_MESSAGE, (SubLObject)process_utilities.$sym68$_CSETF_T_TASK_ERROR_MESSAGE);
        Structures.def_csetf((SubLObject)process_utilities.$sym69$T_TASK_PROPERTIES, (SubLObject)process_utilities.$sym70$_CSETF_T_TASK_PROPERTIES);
        Equality.identity((SubLObject)process_utilities.$sym39$THINKING_TASK);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_thinking_task$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym84$VISIT_DEFSTRUCT_OBJECT_THINKING_TASK_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), process_utilities.$dtp_ipc_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym112$IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)process_utilities.$list113);
        Structures.def_csetf((SubLObject)process_utilities.$sym114$IPC_QUEUE_LOCK, (SubLObject)process_utilities.$sym115$_CSETF_IPC_QUEUE_LOCK);
        Structures.def_csetf((SubLObject)process_utilities.$sym116$IPC_QUEUE_SEMAPHORE, (SubLObject)process_utilities.$sym117$_CSETF_IPC_QUEUE_SEMAPHORE);
        Structures.def_csetf((SubLObject)process_utilities.$sym118$IPC_QUEUE_DATA_QUEUE, (SubLObject)process_utilities.$sym119$_CSETF_IPC_QUEUE_DATA_QUEUE);
        Equality.identity((SubLObject)process_utilities.$sym106$IPC_QUEUE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_ipc_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym123$VISIT_DEFSTRUCT_OBJECT_IPC_QUEUE_METHOD));
        generic_testing.define_test_case_table_int((SubLObject)process_utilities.$sym146$TEST_IPC_ENQUEUE_DEQUEUE, (SubLObject)ConsesLow.list(new SubLObject[] { process_utilities.$kw147$TEST, process_utilities.NIL, process_utilities.$kw148$OWNER, process_utilities.NIL, process_utilities.$kw149$CLASSES, process_utilities.$list150, process_utilities.$kw151$KB, process_utilities.$kw152$TINY, process_utilities.$kw153$WORKING_, process_utilities.T }), (SubLObject)process_utilities.$list154);
        generic_testing.define_test_case_table_int((SubLObject)process_utilities.$sym155$TEST_IPC_ENQUEUE_DRAIN, (SubLObject)ConsesLow.list(new SubLObject[] { process_utilities.$kw147$TEST, process_utilities.NIL, process_utilities.$kw148$OWNER, process_utilities.NIL, process_utilities.$kw149$CLASSES, process_utilities.$list150, process_utilities.$kw151$KB, process_utilities.$kw152$TINY, process_utilities.$kw153$WORKING_, process_utilities.T }), (SubLObject)process_utilities.$list154);
        generic_testing.define_test_case_table_int((SubLObject)process_utilities.$sym156$TEST_IPC_ENQUEUE_DRAIN_DEQUEUE, (SubLObject)ConsesLow.list(new SubLObject[] { process_utilities.$kw147$TEST, process_utilities.NIL, process_utilities.$kw148$OWNER, process_utilities.NIL, process_utilities.$kw149$CLASSES, process_utilities.$list150, process_utilities.$kw151$KB, process_utilities.$kw152$TINY, process_utilities.$kw153$WORKING_, process_utilities.T }), (SubLObject)process_utilities.$list154);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), process_utilities.$dtp_ordered_ipc_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym163$ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)process_utilities.$list164);
        Structures.def_csetf((SubLObject)process_utilities.$sym165$ORDRD_IPCQ_LOCK, (SubLObject)process_utilities.$sym166$_CSETF_ORDRD_IPCQ_LOCK);
        Structures.def_csetf((SubLObject)process_utilities.$sym167$ORDRD_IPCQ_PRODUCER_ISG, (SubLObject)process_utilities.$sym168$_CSETF_ORDRD_IPCQ_PRODUCER_ISG);
        Structures.def_csetf((SubLObject)process_utilities.$sym169$ORDRD_IPCQ_CONSUMER_ISG, (SubLObject)process_utilities.$sym170$_CSETF_ORDRD_IPCQ_CONSUMER_ISG);
        Structures.def_csetf((SubLObject)process_utilities.$sym171$ORDRD_IPCQ_PAYLOAD, (SubLObject)process_utilities.$sym172$_CSETF_ORDRD_IPCQ_PAYLOAD);
        Structures.def_csetf((SubLObject)process_utilities.$sym173$ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE, (SubLObject)process_utilities.$sym174$_CSETF_ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE);
        Equality.identity((SubLObject)process_utilities.$sym157$ORDERED_IPC_QUEUE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_ordered_ipc_queue$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym180$VISIT_DEFSTRUCT_OBJECT_ORDERED_IPC_QUEUE_METHOD));
        utilities_macros.register_cyc_api_function((SubLObject)process_utilities.$sym186$KILL_PROCESS_NAMED, (SubLObject)process_utilities.$list187, (SubLObject)process_utilities.$str188$_param_NAME__stringp____Kills_any, (SubLObject)process_utilities.$list189, (SubLObject)process_utilities.$list190);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_process$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym192$VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD));
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_lock$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym194$VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), process_utilities.$dtp_process_wrapper$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym202$PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)process_utilities.$list203);
        Structures.def_csetf((SubLObject)process_utilities.$sym204$PROCESS_WRAPPER_ID, (SubLObject)process_utilities.$sym205$_CSETF_PROCESS_WRAPPER_ID);
        Structures.def_csetf((SubLObject)process_utilities.$sym206$PROCESS_WRAPPER_PROCESS, (SubLObject)process_utilities.$sym207$_CSETF_PROCESS_WRAPPER_PROCESS);
        Structures.def_csetf((SubLObject)process_utilities.$sym208$PROCESS_WRAPPER_STATE, (SubLObject)process_utilities.$sym209$_CSETF_PROCESS_WRAPPER_STATE);
        Structures.def_csetf((SubLObject)process_utilities.$sym210$PROCESS_WRAPPER_LOCK, (SubLObject)process_utilities.$sym211$_CSETF_PROCESS_WRAPPER_LOCK);
        Structures.def_csetf((SubLObject)process_utilities.$sym212$PROCESS_WRAPPER_PLIST, (SubLObject)process_utilities.$sym213$_CSETF_PROCESS_WRAPPER_PLIST);
        Equality.identity((SubLObject)process_utilities.$sym196$PROCESS_WRAPPER);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_process_wrapper$.getGlobalValue(), Symbols.symbol_function((SubLObject)process_utilities.$sym218$VISIT_DEFSTRUCT_OBJECT_PROCESS_WRAPPER_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)process_utilities.$sym219$_PROCESS_WRAPPER_ISG_);
        utilities_macros.note_funcall_helper_function((SubLObject)process_utilities.$sym225$CYC_SERVER_PROCESS_FUNCALL);
        utilities_macros.note_funcall_helper_function((SubLObject)process_utilities.$sym227$CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS);
        return (SubLObject)process_utilities.NIL;
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
        me = (SubLFile)new process_utilities();
        process_utilities.$active_processes_at_startup$ = null;
        process_utilities.$process_form_map$ = null;
        process_utilities.$process_form_lock$ = null;
        process_utilities.$dtp_task$ = null;
        process_utilities.$dtp_thinking_task$ = null;
        process_utilities.$thinking_task$ = null;
        process_utilities.$dtp_ipc_queue$ = null;
        process_utilities.$ipcq_debugP$ = null;
        process_utilities.$ipcq_test_items$ = null;
        process_utilities.$dtp_ordered_ipc_queue$ = null;
        process_utilities.$ordered_ipcq_empty$ = null;
        process_utilities.$ordered_ipc_current_queue_size_estimation_threshold$ = null;
        process_utilities.$dtp_process_wrapper$ = null;
        process_utilities.$process_wrapper_isg$ = null;
        $sym0$INTERRUPT_INITIAL_PROCESS = SubLObjectFactory.makeSymbol("INTERRUPT-INITIAL-PROCESS");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEBUG-INITIAL-PROCESS"));
        $str2$Idle = SubLObjectFactory.makeString("Idle");
        $str3$Sleep = SubLObjectFactory.makeString("Sleep");
        $str4$wait = SubLObjectFactory.makeString("wait");
        $str5$blocked = SubLObjectFactory.makeString("blocked");
        $str6$run = SubLObjectFactory.makeString("run");
        $sym7$PROCESSP = SubLObjectFactory.makeSymbol("PROCESSP");
        $sym8$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym9$PROCESS_NAME = SubLObjectFactory.makeSymbol("PROCESS-NAME");
        $sym10$_ACTIVE_PROCESSES_AT_STARTUP_ = SubLObjectFactory.makeSymbol("*ACTIVE-PROCESSES-AT-STARTUP*");
        $sym11$_PROCESS_FORM_MAP_ = SubLObjectFactory.makeSymbol("*PROCESS-FORM-MAP*");
        $str12$Process_Form = SubLObjectFactory.makeString("Process Form");
        $sym13$TASK = SubLObjectFactory.makeSymbol("TASK");
        $sym14$TASK_P = SubLObjectFactory.makeSymbol("TASK-P");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("COMPLETED"));
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROCESS"), (SubLObject)SubLObjectFactory.makeKeyword("COMPLETED"));
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TASK-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-COMPLETED"));
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TASK-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-TASK-COMPLETED"));
        $sym19$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym20$TASK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("TASK-PRINT-FUNCTION-TRAMPOLINE");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("TASK-P"));
        $sym22$TASK_PROCESS = SubLObjectFactory.makeSymbol("TASK-PROCESS");
        $sym23$_CSETF_TASK_PROCESS = SubLObjectFactory.makeSymbol("_CSETF-TASK-PROCESS");
        $sym24$TASK_COMPLETED = SubLObjectFactory.makeSymbol("TASK-COMPLETED");
        $sym25$_CSETF_TASK_COMPLETED = SubLObjectFactory.makeSymbol("_CSETF-TASK-COMPLETED");
        $kw26$PROCESS = SubLObjectFactory.makeKeyword("PROCESS");
        $kw27$COMPLETED = SubLObjectFactory.makeKeyword("COMPLETED");
        $str28$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw29$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym30$MAKE_TASK = SubLObjectFactory.makeSymbol("MAKE-TASK");
        $kw31$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw32$END = SubLObjectFactory.makeKeyword("END");
        $sym33$VISIT_DEFSTRUCT_OBJECT_TASK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-TASK-METHOD");
        $sym34$SYMBOL_NAME = SubLObjectFactory.makeSymbol("SYMBOL-NAME");
        $sym35$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym36$CADR = SubLObjectFactory.makeSymbol("CADR");
        $sym37$NEW_TASK_INTERNAL = SubLObjectFactory.makeSymbol("NEW-TASK-INTERNAL");
        $sym38$FIND_SYMBOL = SubLObjectFactory.makeSymbol("FIND-SYMBOL");
        $sym39$THINKING_TASK = SubLObjectFactory.makeSymbol("THINKING-TASK");
        $sym40$THINKING_TASK_P = SubLObjectFactory.makeSymbol("THINKING-TASK-P");
        $list41 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("LOCK"), SubLObjectFactory.makeSymbol("THREAD"), SubLObjectFactory.makeSymbol("NAME"), SubLObjectFactory.makeSymbol("STATUS"), SubLObjectFactory.makeSymbol("PROGRESS-MESSAGE"), SubLObjectFactory.makeSymbol("PROGRESS-SOFAR"), SubLObjectFactory.makeSymbol("PROGRESS-TOTAL"), SubLObjectFactory.makeSymbol("START-TIME"), SubLObjectFactory.makeSymbol("FINISH-TIME"), SubLObjectFactory.makeSymbol("RESULT"), SubLObjectFactory.makeSymbol("ERROR-MESSAGE"), SubLObjectFactory.makeSymbol("PROPERTIES") });
        $list42 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("LOCK"), SubLObjectFactory.makeKeyword("THREAD"), SubLObjectFactory.makeKeyword("NAME"), SubLObjectFactory.makeKeyword("STATUS"), SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE"), SubLObjectFactory.makeKeyword("PROGRESS-SOFAR"), SubLObjectFactory.makeKeyword("PROGRESS-TOTAL"), SubLObjectFactory.makeKeyword("START-TIME"), SubLObjectFactory.makeKeyword("FINISH-TIME"), SubLObjectFactory.makeKeyword("RESULT"), SubLObjectFactory.makeKeyword("ERROR-MESSAGE"), SubLObjectFactory.makeKeyword("PROPERTIES") });
        $list43 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("T-TASK-LOCK"), SubLObjectFactory.makeSymbol("T-TASK-THREAD"), SubLObjectFactory.makeSymbol("T-TASK-NAME"), SubLObjectFactory.makeSymbol("T-TASK-STATUS"), SubLObjectFactory.makeSymbol("T-TASK-PROGRESS-MESSAGE"), SubLObjectFactory.makeSymbol("T-TASK-PROGRESS-SOFAR"), SubLObjectFactory.makeSymbol("T-TASK-PROGRESS-TOTAL"), SubLObjectFactory.makeSymbol("T-TASK-START-TIME"), SubLObjectFactory.makeSymbol("T-TASK-FINISH-TIME"), SubLObjectFactory.makeSymbol("T-TASK-RESULT"), SubLObjectFactory.makeSymbol("T-TASK-ERROR-MESSAGE"), SubLObjectFactory.makeSymbol("T-TASK-PROPERTIES") });
        $list44 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("_CSETF-T-TASK-LOCK"), SubLObjectFactory.makeSymbol("_CSETF-T-TASK-THREAD"), SubLObjectFactory.makeSymbol("_CSETF-T-TASK-NAME"), SubLObjectFactory.makeSymbol("_CSETF-T-TASK-STATUS"), SubLObjectFactory.makeSymbol("_CSETF-T-TASK-PROGRESS-MESSAGE"), SubLObjectFactory.makeSymbol("_CSETF-T-TASK-PROGRESS-SOFAR"), SubLObjectFactory.makeSymbol("_CSETF-T-TASK-PROGRESS-TOTAL"), SubLObjectFactory.makeSymbol("_CSETF-T-TASK-START-TIME"), SubLObjectFactory.makeSymbol("_CSETF-T-TASK-FINISH-TIME"), SubLObjectFactory.makeSymbol("_CSETF-T-TASK-RESULT"), SubLObjectFactory.makeSymbol("_CSETF-T-TASK-ERROR-MESSAGE"), SubLObjectFactory.makeSymbol("_CSETF-T-TASK-PROPERTIES") });
        $sym45$THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE");
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("THINKING-TASK-P"));
        $sym47$T_TASK_LOCK = SubLObjectFactory.makeSymbol("T-TASK-LOCK");
        $sym48$_CSETF_T_TASK_LOCK = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-LOCK");
        $sym49$T_TASK_THREAD = SubLObjectFactory.makeSymbol("T-TASK-THREAD");
        $sym50$_CSETF_T_TASK_THREAD = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-THREAD");
        $sym51$T_TASK_NAME = SubLObjectFactory.makeSymbol("T-TASK-NAME");
        $sym52$_CSETF_T_TASK_NAME = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-NAME");
        $sym53$T_TASK_STATUS = SubLObjectFactory.makeSymbol("T-TASK-STATUS");
        $sym54$_CSETF_T_TASK_STATUS = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-STATUS");
        $sym55$T_TASK_PROGRESS_MESSAGE = SubLObjectFactory.makeSymbol("T-TASK-PROGRESS-MESSAGE");
        $sym56$_CSETF_T_TASK_PROGRESS_MESSAGE = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-PROGRESS-MESSAGE");
        $sym57$T_TASK_PROGRESS_SOFAR = SubLObjectFactory.makeSymbol("T-TASK-PROGRESS-SOFAR");
        $sym58$_CSETF_T_TASK_PROGRESS_SOFAR = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-PROGRESS-SOFAR");
        $sym59$T_TASK_PROGRESS_TOTAL = SubLObjectFactory.makeSymbol("T-TASK-PROGRESS-TOTAL");
        $sym60$_CSETF_T_TASK_PROGRESS_TOTAL = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-PROGRESS-TOTAL");
        $sym61$T_TASK_START_TIME = SubLObjectFactory.makeSymbol("T-TASK-START-TIME");
        $sym62$_CSETF_T_TASK_START_TIME = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-START-TIME");
        $sym63$T_TASK_FINISH_TIME = SubLObjectFactory.makeSymbol("T-TASK-FINISH-TIME");
        $sym64$_CSETF_T_TASK_FINISH_TIME = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-FINISH-TIME");
        $sym65$T_TASK_RESULT = SubLObjectFactory.makeSymbol("T-TASK-RESULT");
        $sym66$_CSETF_T_TASK_RESULT = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-RESULT");
        $sym67$T_TASK_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("T-TASK-ERROR-MESSAGE");
        $sym68$_CSETF_T_TASK_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-ERROR-MESSAGE");
        $sym69$T_TASK_PROPERTIES = SubLObjectFactory.makeSymbol("T-TASK-PROPERTIES");
        $sym70$_CSETF_T_TASK_PROPERTIES = SubLObjectFactory.makeSymbol("_CSETF-T-TASK-PROPERTIES");
        $kw71$LOCK = SubLObjectFactory.makeKeyword("LOCK");
        $kw72$THREAD = SubLObjectFactory.makeKeyword("THREAD");
        $kw73$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw74$STATUS = SubLObjectFactory.makeKeyword("STATUS");
        $kw75$PROGRESS_MESSAGE = SubLObjectFactory.makeKeyword("PROGRESS-MESSAGE");
        $kw76$PROGRESS_SOFAR = SubLObjectFactory.makeKeyword("PROGRESS-SOFAR");
        $kw77$PROGRESS_TOTAL = SubLObjectFactory.makeKeyword("PROGRESS-TOTAL");
        $kw78$START_TIME = SubLObjectFactory.makeKeyword("START-TIME");
        $kw79$FINISH_TIME = SubLObjectFactory.makeKeyword("FINISH-TIME");
        $kw80$RESULT = SubLObjectFactory.makeKeyword("RESULT");
        $kw81$ERROR_MESSAGE = SubLObjectFactory.makeKeyword("ERROR-MESSAGE");
        $kw82$PROPERTIES = SubLObjectFactory.makeKeyword("PROPERTIES");
        $sym83$MAKE_THINKING_TASK = SubLObjectFactory.makeSymbol("MAKE-THINKING-TASK");
        $sym84$VISIT_DEFSTRUCT_OBJECT_THINKING_TASK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-THINKING-TASK-METHOD");
        $sym85$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym86$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $kw87$NONE = SubLObjectFactory.makeKeyword("NONE");
        $list88 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("THINKING")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym89$LOCK = SubLObjectFactory.makeUninternedSymbol("LOCK");
        $sym90$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym91$THINKING_LOCK = SubLObjectFactory.makeSymbol("THINKING-LOCK");
        $sym92$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $sym93$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym94$UNIVERSAL_TIME_P = SubLObjectFactory.makeSymbol("UNIVERSAL-TIME-P");
        $sym95$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym96$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym97$THINKING_THREAD_RUN = SubLObjectFactory.makeSymbol("THINKING-THREAD-RUN");
        $kw98$STARTED = SubLObjectFactory.makeKeyword("STARTED");
        $kw99$STOPPED = SubLObjectFactory.makeKeyword("STOPPED");
        $str100$CYC = SubLObjectFactory.makeString("CYC");
        $sym101$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $kw102$RUNNING = SubLObjectFactory.makeKeyword("RUNNING");
        $str103$Function__A_in_thread__A_terminat = SubLObjectFactory.makeString("Function ~A in thread ~A terminated by uncaught THROW.");
        $kw104$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $kw105$FINISHED = SubLObjectFactory.makeKeyword("FINISHED");
        $sym106$IPC_QUEUE = SubLObjectFactory.makeSymbol("IPC-QUEUE");
        $sym107$IPC_QUEUE_P = SubLObjectFactory.makeSymbol("IPC-QUEUE-P");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("DATA-QUEUE"));
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("SEMAPHORE"), (SubLObject)SubLObjectFactory.makeKeyword("DATA-QUEUE"));
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IPC-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("IPC-QUEUE-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("IPC-QUEUE-DATA-QUEUE"));
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IPC-QUEUE-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IPC-QUEUE-SEMAPHORE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-IPC-QUEUE-DATA-QUEUE"));
        $sym112$IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("IPC-QUEUE-P"));
        $sym114$IPC_QUEUE_LOCK = SubLObjectFactory.makeSymbol("IPC-QUEUE-LOCK");
        $sym115$_CSETF_IPC_QUEUE_LOCK = SubLObjectFactory.makeSymbol("_CSETF-IPC-QUEUE-LOCK");
        $sym116$IPC_QUEUE_SEMAPHORE = SubLObjectFactory.makeSymbol("IPC-QUEUE-SEMAPHORE");
        $sym117$_CSETF_IPC_QUEUE_SEMAPHORE = SubLObjectFactory.makeSymbol("_CSETF-IPC-QUEUE-SEMAPHORE");
        $sym118$IPC_QUEUE_DATA_QUEUE = SubLObjectFactory.makeSymbol("IPC-QUEUE-DATA-QUEUE");
        $sym119$_CSETF_IPC_QUEUE_DATA_QUEUE = SubLObjectFactory.makeSymbol("_CSETF-IPC-QUEUE-DATA-QUEUE");
        $kw120$SEMAPHORE = SubLObjectFactory.makeKeyword("SEMAPHORE");
        $kw121$DATA_QUEUE = SubLObjectFactory.makeKeyword("DATA-QUEUE");
        $sym122$MAKE_IPC_QUEUE = SubLObjectFactory.makeSymbol("MAKE-IPC-QUEUE");
        $sym123$VISIT_DEFSTRUCT_OBJECT_IPC_QUEUE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-IPC-QUEUE-METHOD");
        $str124$Lock_for_Queue_ = SubLObjectFactory.makeString("Lock for Queue ");
        $str125$Waiting_to_enqueue__A = SubLObjectFactory.makeString("Waiting to enqueue ~A");
        $str126$Enqueuing__A = SubLObjectFactory.makeString("Enqueuing ~A");
        $str127$Enqueued__A = SubLObjectFactory.makeString("Enqueued ~A");
        $str128$Queue_size___S = SubLObjectFactory.makeString("Queue size: ~S");
        $str129$Waiting_for_dequeue_semaphore_ = SubLObjectFactory.makeString("Waiting for dequeue semaphore.");
        $str130$Waiting_for_Queue_lock_to_dequeue = SubLObjectFactory.makeString("Waiting for Queue lock to dequeue.");
        $str131$Dequeued__A = SubLObjectFactory.makeString("Dequeued ~A");
        $str132$Unknown_error_ = SubLObjectFactory.makeString("Unknown error.");
        $sym133$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str134$____D___A___A___Q___D_S___D__ = SubLObjectFactory.makeString("~&[~D] ~A (~A): Q: ~D S: ~D~%");
        $str135$We_are_out_of_sync_on_either_the_ = SubLObjectFactory.makeString("We are out of sync on either the queue ~D or the semaphore ~D.");
        $str136$____D___A___A____A__ = SubLObjectFactory.makeString("~&[~D] ~A (~A): ~A~%");
        $int137$100 = SubLObjectFactory.makeInteger(100);
        $sym138$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $str139$Dequeueing__up_to___D_item__P_ = SubLObjectFactory.makeString("Dequeueing (up to) ~D item~:P.");
        $float140$0_01 = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $list141 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("A"), (SubLObject)SubLObjectFactory.makeSymbol("B"), (SubLObject)SubLObjectFactory.makeSymbol("C"), (SubLObject)process_utilities.ONE_INTEGER, (SubLObject)process_utilities.TWO_INTEGER, (SubLObject)process_utilities.THREE_INTEGER);
        $str142$IPCQ_Test_Producer = SubLObjectFactory.makeString("IPCQ Test Producer");
        $sym143$IPCQ_TEST_PRODUCER_RUN = SubLObjectFactory.makeSymbol("IPCQ-TEST-PRODUCER-RUN");
        $str144$Test_IPC_Queue = SubLObjectFactory.makeString("Test IPC Queue");
        $str145$Expected__S__got__S = SubLObjectFactory.makeString("Expected ~S, got ~S");
        $sym146$TEST_IPC_ENQUEUE_DEQUEUE = SubLObjectFactory.makeSymbol("TEST-IPC-ENQUEUE-DEQUEUE");
        $kw147$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw148$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw149$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $list150 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IPCQ-TEST-CASES"));
        $kw151$KB = SubLObjectFactory.makeKeyword("KB");
        $kw152$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw153$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list154 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)process_utilities.NIL, (SubLObject)process_utilities.T));
        $sym155$TEST_IPC_ENQUEUE_DRAIN = SubLObjectFactory.makeSymbol("TEST-IPC-ENQUEUE-DRAIN");
        $sym156$TEST_IPC_ENQUEUE_DRAIN_DEQUEUE = SubLObjectFactory.makeSymbol("TEST-IPC-ENQUEUE-DRAIN-DEQUEUE");
        $sym157$ORDERED_IPC_QUEUE = SubLObjectFactory.makeSymbol("ORDERED-IPC-QUEUE");
        $sym158$ORDERED_IPC_QUEUE_P = SubLObjectFactory.makeSymbol("ORDERED-IPC-QUEUE-P");
        $list159 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("PRODUCER-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("CONSUMER-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("PAYLOAD"), (SubLObject)SubLObjectFactory.makeSymbol("EARLY-CONSUMER-SEMAPHORE"));
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("PRODUCER-ISG"), (SubLObject)SubLObjectFactory.makeKeyword("CONSUMER-ISG"), (SubLObject)SubLObjectFactory.makeKeyword("PAYLOAD"), (SubLObject)SubLObjectFactory.makeKeyword("EARLY-CONSUMER-SEMAPHORE"));
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORDRD-IPCQ-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("ORDRD-IPCQ-PRODUCER-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("ORDRD-IPCQ-CONSUMER-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("ORDRD-IPCQ-PAYLOAD"), (SubLObject)SubLObjectFactory.makeSymbol("ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE"));
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ORDRD-IPCQ-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ORDRD-IPCQ-PRODUCER-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ORDRD-IPCQ-CONSUMER-ISG"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ORDRD-IPCQ-PAYLOAD"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE"));
        $sym163$ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
        $list164 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("ORDERED-IPC-QUEUE-P"));
        $sym165$ORDRD_IPCQ_LOCK = SubLObjectFactory.makeSymbol("ORDRD-IPCQ-LOCK");
        $sym166$_CSETF_ORDRD_IPCQ_LOCK = SubLObjectFactory.makeSymbol("_CSETF-ORDRD-IPCQ-LOCK");
        $sym167$ORDRD_IPCQ_PRODUCER_ISG = SubLObjectFactory.makeSymbol("ORDRD-IPCQ-PRODUCER-ISG");
        $sym168$_CSETF_ORDRD_IPCQ_PRODUCER_ISG = SubLObjectFactory.makeSymbol("_CSETF-ORDRD-IPCQ-PRODUCER-ISG");
        $sym169$ORDRD_IPCQ_CONSUMER_ISG = SubLObjectFactory.makeSymbol("ORDRD-IPCQ-CONSUMER-ISG");
        $sym170$_CSETF_ORDRD_IPCQ_CONSUMER_ISG = SubLObjectFactory.makeSymbol("_CSETF-ORDRD-IPCQ-CONSUMER-ISG");
        $sym171$ORDRD_IPCQ_PAYLOAD = SubLObjectFactory.makeSymbol("ORDRD-IPCQ-PAYLOAD");
        $sym172$_CSETF_ORDRD_IPCQ_PAYLOAD = SubLObjectFactory.makeSymbol("_CSETF-ORDRD-IPCQ-PAYLOAD");
        $sym173$ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE = SubLObjectFactory.makeSymbol("ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE");
        $sym174$_CSETF_ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE = SubLObjectFactory.makeSymbol("_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE");
        $kw175$PRODUCER_ISG = SubLObjectFactory.makeKeyword("PRODUCER-ISG");
        $kw176$CONSUMER_ISG = SubLObjectFactory.makeKeyword("CONSUMER-ISG");
        $kw177$PAYLOAD = SubLObjectFactory.makeKeyword("PAYLOAD");
        $kw178$EARLY_CONSUMER_SEMAPHORE = SubLObjectFactory.makeKeyword("EARLY-CONSUMER-SEMAPHORE");
        $sym179$MAKE_ORDERED_IPC_QUEUE = SubLObjectFactory.makeSymbol("MAKE-ORDERED-IPC-QUEUE");
        $sym180$VISIT_DEFSTRUCT_OBJECT_ORDERED_IPC_QUEUE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-ORDERED-IPC-QUEUE-METHOD");
        $str181$empty_ordered_IPC_queue_entry = SubLObjectFactory.makeString("empty ordered IPC queue entry");
        $str182$Lock_for_Ordered_IPC_Queue_ = SubLObjectFactory.makeString("Lock for Ordered IPC Queue ");
        $str183$Ordered_IPCQ_Early_Producer = SubLObjectFactory.makeString("Ordered IPCQ Early Producer");
        $str184$Unexpected_entry__A_in_the_payloa = SubLObjectFactory.makeString("Unexpected entry ~A in the payload of ordered IPC queue ~A: expected nothing or waiting process.");
        $int185$212 = SubLObjectFactory.makeInteger(212);
        $sym186$KILL_PROCESS_NAMED = SubLObjectFactory.makeSymbol("KILL-PROCESS-NAMED");
        $list187 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $str188$_param_NAME__stringp____Kills_any = SubLObjectFactory.makeString("@param NAME; stringp\n   Kills any process having the given process name. Note\n   that kill-process is not yet supported on Win32.");
        $list189 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")));
        $list190 = ConsesLow.list((SubLObject)process_utilities.NIL);
        $sym191$PROCESS_EXHAUST_IMMEDIATELY_FN = SubLObjectFactory.makeSymbol("PROCESS-EXHAUST-IMMEDIATELY-FN");
        $sym192$VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD");
        $sym193$MAKE_EXHAUSTED_PROCESS = SubLObjectFactory.makeSymbol("MAKE-EXHAUSTED-PROCESS");
        $sym194$VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD");
        $sym195$MAKE_LOCK = SubLObjectFactory.makeSymbol("MAKE-LOCK");
        $sym196$PROCESS_WRAPPER = SubLObjectFactory.makeSymbol("PROCESS-WRAPPER");
        $sym197$PROCESS_WRAPPER_P = SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-P");
        $list198 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("STATE"), (SubLObject)SubLObjectFactory.makeSymbol("LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("PLIST"));
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ID"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESS"), (SubLObject)SubLObjectFactory.makeKeyword("STATE"), (SubLObject)SubLObjectFactory.makeKeyword("LOCK"), (SubLObject)SubLObjectFactory.makeKeyword("PLIST"));
        $list200 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-ID"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-PLIST"));
        $list201 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROCESS-WRAPPER-ID"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROCESS-WRAPPER-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROCESS-WRAPPER-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROCESS-WRAPPER-LOCK"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROCESS-WRAPPER-PLIST"));
        $sym202$PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE");
        $list203 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-P"));
        $sym204$PROCESS_WRAPPER_ID = SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-ID");
        $sym205$_CSETF_PROCESS_WRAPPER_ID = SubLObjectFactory.makeSymbol("_CSETF-PROCESS-WRAPPER-ID");
        $sym206$PROCESS_WRAPPER_PROCESS = SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-PROCESS");
        $sym207$_CSETF_PROCESS_WRAPPER_PROCESS = SubLObjectFactory.makeSymbol("_CSETF-PROCESS-WRAPPER-PROCESS");
        $sym208$PROCESS_WRAPPER_STATE = SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-STATE");
        $sym209$_CSETF_PROCESS_WRAPPER_STATE = SubLObjectFactory.makeSymbol("_CSETF-PROCESS-WRAPPER-STATE");
        $sym210$PROCESS_WRAPPER_LOCK = SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-LOCK");
        $sym211$_CSETF_PROCESS_WRAPPER_LOCK = SubLObjectFactory.makeSymbol("_CSETF-PROCESS-WRAPPER-LOCK");
        $sym212$PROCESS_WRAPPER_PLIST = SubLObjectFactory.makeSymbol("PROCESS-WRAPPER-PLIST");
        $sym213$_CSETF_PROCESS_WRAPPER_PLIST = SubLObjectFactory.makeSymbol("_CSETF-PROCESS-WRAPPER-PLIST");
        $kw214$ID = SubLObjectFactory.makeKeyword("ID");
        $kw215$STATE = SubLObjectFactory.makeKeyword("STATE");
        $kw216$PLIST = SubLObjectFactory.makeKeyword("PLIST");
        $sym217$MAKE_PROCESS_WRAPPER = SubLObjectFactory.makeSymbol("MAKE-PROCESS-WRAPPER");
        $sym218$VISIT_DEFSTRUCT_OBJECT_PROCESS_WRAPPER_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROCESS-WRAPPER-METHOD");
        $sym219$_PROCESS_WRAPPER_ISG_ = SubLObjectFactory.makeSymbol("*PROCESS-WRAPPER-ISG*");
        $kw220$STARTING = SubLObjectFactory.makeKeyword("STARTING");
        $sym221$NEW_PROCESS_WRAPPER_INT = SubLObjectFactory.makeSymbol("NEW-PROCESS-WRAPPER-INT");
        $kw222$ABORTED = SubLObjectFactory.makeKeyword("ABORTED");
        $kw223$PAUSING = SubLObjectFactory.makeKeyword("PAUSING");
        $kw224$PAUSED = SubLObjectFactory.makeKeyword("PAUSED");
        $sym225$CYC_SERVER_PROCESS_FUNCALL = SubLObjectFactory.makeSymbol("CYC-SERVER-PROCESS-FUNCALL");
        $sym226$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $sym227$CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS = SubLObjectFactory.makeSymbol("CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS");
        $list228 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("ARGS"));
    }
    
    public static final class $task_native extends SubLStructNative
    {
        public SubLObject $process;
        public SubLObject $completed;
        private static final SubLStructDeclNative structDecl;
        
        public $task_native() {
            this.$process = (SubLObject)CommonSymbols.NIL;
            this.$completed = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$task_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$task_native.class, process_utilities.$sym13$TASK, process_utilities.$sym14$TASK_P, process_utilities.$list15, process_utilities.$list16, new String[] { "$process", "$completed" }, process_utilities.$list17, process_utilities.$list18, process_utilities.$sym19$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $task_p$UnaryFunction extends UnaryFunction
    {
        public $task_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TASK-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return process_utilities.task_p(arg1);
        }
    }
    
    public static final class $thinking_task_native extends SubLStructNative
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
        
        public $thinking_task_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$thread = (SubLObject)CommonSymbols.NIL;
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$status = (SubLObject)CommonSymbols.NIL;
            this.$progress_message = (SubLObject)CommonSymbols.NIL;
            this.$progress_sofar = (SubLObject)CommonSymbols.NIL;
            this.$progress_total = (SubLObject)CommonSymbols.NIL;
            this.$start_time = (SubLObject)CommonSymbols.NIL;
            this.$finish_time = (SubLObject)CommonSymbols.NIL;
            this.$result = (SubLObject)CommonSymbols.NIL;
            this.$error_message = (SubLObject)CommonSymbols.NIL;
            this.$properties = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$thinking_task_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$thinking_task_native.class, process_utilities.$sym39$THINKING_TASK, process_utilities.$sym40$THINKING_TASK_P, process_utilities.$list41, process_utilities.$list42, new String[] { "$lock", "$thread", "$name", "$status", "$progress_message", "$progress_sofar", "$progress_total", "$start_time", "$finish_time", "$result", "$error_message", "$properties" }, process_utilities.$list43, process_utilities.$list44, process_utilities.$sym19$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $thinking_task_p$UnaryFunction extends UnaryFunction
    {
        public $thinking_task_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("THINKING-TASK-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return process_utilities.thinking_task_p(arg1);
        }
    }
    
    public static final class $ipc_queue_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $semaphore;
        public SubLObject $data_queue;
        private static final SubLStructDeclNative structDecl;
        
        public $ipc_queue_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$semaphore = (SubLObject)CommonSymbols.NIL;
            this.$data_queue = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ipc_queue_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$ipc_queue_native.class, process_utilities.$sym106$IPC_QUEUE, process_utilities.$sym107$IPC_QUEUE_P, process_utilities.$list108, process_utilities.$list109, new String[] { "$lock", "$semaphore", "$data_queue" }, process_utilities.$list110, process_utilities.$list111, process_utilities.$sym19$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $ipc_queue_p$UnaryFunction extends UnaryFunction
    {
        public $ipc_queue_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("IPC-QUEUE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return process_utilities.ipc_queue_p(arg1);
        }
    }
    
    public static final class $ordered_ipc_queue_native extends SubLStructNative
    {
        public SubLObject $lock;
        public SubLObject $producer_isg;
        public SubLObject $consumer_isg;
        public SubLObject $payload;
        public SubLObject $early_consumer_semaphore;
        private static final SubLStructDeclNative structDecl;
        
        public $ordered_ipc_queue_native() {
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$producer_isg = (SubLObject)CommonSymbols.NIL;
            this.$consumer_isg = (SubLObject)CommonSymbols.NIL;
            this.$payload = (SubLObject)CommonSymbols.NIL;
            this.$early_consumer_semaphore = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$ordered_ipc_queue_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$ordered_ipc_queue_native.class, process_utilities.$sym157$ORDERED_IPC_QUEUE, process_utilities.$sym158$ORDERED_IPC_QUEUE_P, process_utilities.$list159, process_utilities.$list160, new String[] { "$lock", "$producer_isg", "$consumer_isg", "$payload", "$early_consumer_semaphore" }, process_utilities.$list161, process_utilities.$list162, process_utilities.$sym19$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $ordered_ipc_queue_p$UnaryFunction extends UnaryFunction
    {
        public $ordered_ipc_queue_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("ORDERED-IPC-QUEUE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return process_utilities.ordered_ipc_queue_p(arg1);
        }
    }
    
    public static final class $process_wrapper_native extends SubLStructNative
    {
        public SubLObject $id;
        public SubLObject $process;
        public SubLObject $state;
        public SubLObject $lock;
        public SubLObject $plist;
        private static final SubLStructDeclNative structDecl;
        
        public $process_wrapper_native() {
            this.$id = (SubLObject)CommonSymbols.NIL;
            this.$process = (SubLObject)CommonSymbols.NIL;
            this.$state = (SubLObject)CommonSymbols.NIL;
            this.$lock = (SubLObject)CommonSymbols.NIL;
            this.$plist = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$process_wrapper_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$process_wrapper_native.class, process_utilities.$sym196$PROCESS_WRAPPER, process_utilities.$sym197$PROCESS_WRAPPER_P, process_utilities.$list198, process_utilities.$list199, new String[] { "$id", "$process", "$state", "$lock", "$plist" }, process_utilities.$list200, process_utilities.$list201, process_utilities.$sym19$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }
    
    public static final class $process_wrapper_p$UnaryFunction extends UnaryFunction
    {
        public $process_wrapper_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PROCESS-WRAPPER-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return process_utilities.process_wrapper_p(arg1);
        }
    }
}

/*

	Total time: 748 ms
	 synthetic 
*/