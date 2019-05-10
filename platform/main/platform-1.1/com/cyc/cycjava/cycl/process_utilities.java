/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.cycjava.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.integer_sequence_generator;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class process_utilities extends SubLTranslatedFile {

  //// Constructor

  private process_utilities() {}
  public static final SubLFile me = new process_utilities();
  public static final String myName = "com.cyc.cycjava.cycl.process_utilities";

  //// Definitions

  public static final class $task_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $process; }
    public SubLObject getField3() { return $completed; }
    public SubLObject setField2(SubLObject value) { return $process = value; }
    public SubLObject setField3(SubLObject value) { return $completed = value; }
    public SubLObject $process = NIL;
    public SubLObject $completed = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($task_native.class, $sym7$TASK, $sym8$TASK_P, $list9, $list10, new String[] {"$process", "$completed"}, $list11, $list12, $sym13$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/process-utilities.lisp", position = 2865) 
  public static SubLSymbol $dtp_task$ = null;

  @SubL(source = "cycl/process-utilities.lisp", position = 2865) 
  public static final SubLObject task_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $task_p$UnaryFunction extends UnaryFunction {
    public $task_p$UnaryFunction() { super(extractFunctionNamed("TASK-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12215"); }
  }

  public static final class $thinking_task_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $lock; }
    public SubLObject getField3() { return $thread; }
    public SubLObject getField4() { return $name; }
    public SubLObject getField5() { return $status; }
    public SubLObject getField6() { return $progress_message; }
    public SubLObject getField7() { return $progress_sofar; }
    public SubLObject getField8() { return $progress_total; }
    public SubLObject getField9() { return $start_time; }
    public SubLObject getField10() { return $finish_time; }
    public SubLObject getField11() { return $result; }
    public SubLObject getField12() { return $error_message; }
    public SubLObject getField13() { return $properties; }
    public SubLObject setField2(SubLObject value) { return $lock = value; }
    public SubLObject setField3(SubLObject value) { return $thread = value; }
    public SubLObject setField4(SubLObject value) { return $name = value; }
    public SubLObject setField5(SubLObject value) { return $status = value; }
    public SubLObject setField6(SubLObject value) { return $progress_message = value; }
    public SubLObject setField7(SubLObject value) { return $progress_sofar = value; }
    public SubLObject setField8(SubLObject value) { return $progress_total = value; }
    public SubLObject setField9(SubLObject value) { return $start_time = value; }
    public SubLObject setField10(SubLObject value) { return $finish_time = value; }
    public SubLObject setField11(SubLObject value) { return $result = value; }
    public SubLObject setField12(SubLObject value) { return $error_message = value; }
    public SubLObject setField13(SubLObject value) { return $properties = value; }
    public SubLObject $lock = NIL;
    public SubLObject $thread = NIL;
    public SubLObject $name = NIL;
    public SubLObject $status = NIL;
    public SubLObject $progress_message = NIL;
    public SubLObject $progress_sofar = NIL;
    public SubLObject $progress_total = NIL;
    public SubLObject $start_time = NIL;
    public SubLObject $finish_time = NIL;
    public SubLObject $result = NIL;
    public SubLObject $error_message = NIL;
    public SubLObject $properties = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($thinking_task_native.class, $sym27$THINKING_TASK, $sym28$THINKING_TASK_P, $list29, $list30, new String[] {"$lock", "$thread", "$name", "$status", "$progress_message", "$progress_sofar", "$progress_total", "$start_time", "$finish_time", "$result", "$error_message", "$properties"}, $list31, $list32, $sym13$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/process-utilities.lisp", position = 4543) 
  public static SubLSymbol $dtp_thinking_task$ = null;

  @SubL(source = "cycl/process-utilities.lisp", position = 4543) 
  public static final SubLObject thinking_task_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $thinking_task_p$UnaryFunction extends UnaryFunction {
    public $thinking_task_p$UnaryFunction() { super(extractFunctionNamed("THINKING-TASK-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12245"); }
  }

  @SubL(source = "cycl/process-utilities.lisp", position = 11162) 
  private static SubLSymbol $thinking_task$ = null;

  public static final class $ipc_queue_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $lock; }
    public SubLObject getField3() { return $semaphore; }
    public SubLObject getField4() { return $data_queue; }
    public SubLObject setField2(SubLObject value) { return $lock = value; }
    public SubLObject setField3(SubLObject value) { return $semaphore = value; }
    public SubLObject setField4(SubLObject value) { return $data_queue = value; }
    public SubLObject $lock = NIL;
    public SubLObject $semaphore = NIL;
    public SubLObject $data_queue = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($ipc_queue_native.class, $sym93$IPC_QUEUE, $sym94$IPC_QUEUE_P, $list95, $list96, new String[] {"$lock", "$semaphore", "$data_queue"}, $list97, $list98, $sym13$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/process-utilities.lisp", position = 15419) 
  public static SubLSymbol $dtp_ipc_queue$ = null;

  @SubL(source = "cycl/process-utilities.lisp", position = 15419) 
  public static final SubLObject ipc_queue_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $ipc_queue_p$UnaryFunction extends UnaryFunction {
    public $ipc_queue_p$UnaryFunction() { super(extractFunctionNamed("IPC-QUEUE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12179"); }
  }

  public static final class $ordered_ipc_queue_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $lock; }
    public SubLObject getField3() { return $producer_isg; }
    public SubLObject getField4() { return $consumer_isg; }
    public SubLObject getField5() { return $payload; }
    public SubLObject setField2(SubLObject value) { return $lock = value; }
    public SubLObject setField3(SubLObject value) { return $producer_isg = value; }
    public SubLObject setField4(SubLObject value) { return $consumer_isg = value; }
    public SubLObject setField5(SubLObject value) { return $payload = value; }
    public SubLObject $lock = NIL;
    public SubLObject $producer_isg = NIL;
    public SubLObject $consumer_isg = NIL;
    public SubLObject $payload = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($ordered_ipc_queue_native.class, $sym112$ORDERED_IPC_QUEUE, $sym113$ORDERED_IPC_QUEUE_P, $list114, $list115, new String[] {"$lock", "$producer_isg", "$consumer_isg", "$payload"}, $list116, $list117, $sym13$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/process-utilities.lisp", position = 19735) 
  public static SubLSymbol $dtp_ordered_ipc_queue$ = null;

  @SubL(source = "cycl/process-utilities.lisp", position = 19735) 
  public static final SubLObject ordered_ipc_queue_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $ordered_ipc_queue_p$UnaryFunction extends UnaryFunction {
    public $ordered_ipc_queue_p$UnaryFunction() { super(extractFunctionNamed("ORDERED-IPC-QUEUE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12189"); }
  }

  @SubL(source = "cycl/process-utilities.lisp", position = 19855) 
  private static SubLSymbol $ordered_ipcq_empty$ = null;

  @SubL(source = "cycl/process-utilities.lisp", position = 24454) 
  public static final SubLObject process_exhaust_immediately_fn() {
    return NIL;
  }

  /** A wrapper for creating an already exhausted process. */
  @SubL(source = "cycl/process-utilities.lisp", position = 24608) 
  public static final SubLObject make_exhausted_process(SubLObject name) {
    return Threads.make_process(name, $sym138$PROCESS_EXHAUST_IMMEDIATELY_FN);
  }

  @SubL(source = "cycl/process-utilities.lisp", position = 24773) 
  public static final SubLObject visit_defstruct_object_process_method(SubLObject object, SubLObject visitor_fn) {
    return visit_defstruct_object_process(object, visitor_fn);
  }

  @SubL(source = "cycl/process-utilities.lisp", position = 24903) 
  public static final SubLObject visit_defstruct_object_process(SubLObject process, SubLObject visitor_fn) {
    Functions.funcall(visitor_fn, process, $kw140$BEGIN, $sym141$MAKE_EXHAUSTED_PROCESS, ONE_INTEGER);
    Functions.funcall(visitor_fn, process, $kw142$SLOT, $kw60$NAME, Threads.process_name(process));
    Functions.funcall(visitor_fn, process, $kw143$END, $sym141$MAKE_EXHAUSTED_PROCESS, ONE_INTEGER);
    return process;
  }

  @SubL(source = "cycl/process-utilities.lisp", position = 25184) 
  public static final SubLObject visit_defstruct_object_lock_method(SubLObject object, SubLObject visitor_fn) {
    return visit_defstruct_object_lock(object, visitor_fn);
  }

  @SubL(source = "cycl/process-utilities.lisp", position = 25308) 
  public static final SubLObject visit_defstruct_object_lock(SubLObject lock, SubLObject visitor_fn) {
    Functions.funcall(visitor_fn, lock, $kw140$BEGIN, $sym145$MAKE_LOCK, ONE_INTEGER);
    Functions.funcall(visitor_fn, lock, $kw142$SLOT, $kw60$NAME, Locks.lock_name(lock));
    Functions.funcall(visitor_fn, lock, $kw143$END, $sym145$MAKE_LOCK, ONE_INTEGER);
    return lock;
  }

  public static final class $process_wrapper_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $process; }
    public SubLObject getField4() { return $state; }
    public SubLObject getField5() { return $lock; }
    public SubLObject getField6() { return $plist; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $process = value; }
    public SubLObject setField4(SubLObject value) { return $state = value; }
    public SubLObject setField5(SubLObject value) { return $lock = value; }
    public SubLObject setField6(SubLObject value) { return $plist = value; }
    public SubLObject $id = NIL;
    public SubLObject $process = NIL;
    public SubLObject $state = NIL;
    public SubLObject $lock = NIL;
    public SubLObject $plist = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($process_wrapper_native.class, $sym146$PROCESS_WRAPPER, $sym147$PROCESS_WRAPPER_P, $list148, $list149, new String[] {"$id", "$process", "$state", "$lock", "$plist"}, $list150, $list151, $sym13$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/process-utilities.lisp", position = 28251) 
  public static SubLSymbol $dtp_process_wrapper$ = null;

  @SubL(source = "cycl/process-utilities.lisp", position = 28251) 
  public static final SubLObject process_wrapper_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $process_wrapper_p$UnaryFunction extends UnaryFunction {
    public $process_wrapper_p$UnaryFunction() { super(extractFunctionNamed("PROCESS-WRAPPER-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12196"); }
  }

  /** An isg used for setting the process-id slot. */
  @SubL(source = "cycl/process-utilities.lisp", position = 28387) 
  private static SubLSymbol $process_wrapper_isg$ = null;

  public static final SubLObject declare_process_utilities_file() {
    //declareFunction(myName, "debug_initial_process", "DEBUG-INITIAL-PROCESS", 0, 0, false);
    //declareFunction(myName, "interrupt_initial_process", "INTERRUPT-INITIAL-PROCESS", 0, 0, false);
    //declareFunction(myName, "process_idleP", "PROCESS-IDLE?", 1, 0, false);
    //declareFunction(myName, "process_busyP", "PROCESS-BUSY?", 1, 0, false);
    //declareFunction(myName, "process_waitingP", "PROCESS-WAITING?", 1, 0, false);
    //declareFunction(myName, "process_runningP", "PROCESS-RUNNING?", 1, 0, false);
    declareFunction(myName, "task_print_function_trampoline", "TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "task_p", "TASK-P", 1, 0, false); new $task_p$UnaryFunction();
    //declareFunction(myName, "task_process", "TASK-PROCESS", 1, 0, false);
    //declareFunction(myName, "task_completed", "TASK-COMPLETED", 1, 0, false);
    //declareFunction(myName, "_csetf_task_process", "_CSETF-TASK-PROCESS", 2, 0, false);
    //declareFunction(myName, "_csetf_task_completed", "_CSETF-TASK-COMPLETED", 2, 0, false);
    //declareFunction(myName, "make_task", "MAKE-TASK", 0, 1, false);
    //declareFunction(myName, "new_task", "NEW-TASK", 2, 2, false);
    //declareFunction(myName, "new_task_internal", "NEW-TASK-INTERNAL", 5, 0, false);
    declareFunction(myName, "thinking_task_print_function_trampoline", "THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "thinking_task_p", "THINKING-TASK-P", 1, 0, false); new $thinking_task_p$UnaryFunction();
    //declareFunction(myName, "t_task_lock", "T-TASK-LOCK", 1, 0, false);
    //declareFunction(myName, "t_task_thread", "T-TASK-THREAD", 1, 0, false);
    //declareFunction(myName, "t_task_name", "T-TASK-NAME", 1, 0, false);
    //declareFunction(myName, "t_task_status", "T-TASK-STATUS", 1, 0, false);
    //declareFunction(myName, "t_task_progress_message", "T-TASK-PROGRESS-MESSAGE", 1, 0, false);
    //declareFunction(myName, "t_task_progress_sofar", "T-TASK-PROGRESS-SOFAR", 1, 0, false);
    //declareFunction(myName, "t_task_progress_total", "T-TASK-PROGRESS-TOTAL", 1, 0, false);
    //declareFunction(myName, "t_task_start_time", "T-TASK-START-TIME", 1, 0, false);
    //declareFunction(myName, "t_task_finish_time", "T-TASK-FINISH-TIME", 1, 0, false);
    //declareFunction(myName, "t_task_result", "T-TASK-RESULT", 1, 0, false);
    //declareFunction(myName, "t_task_error_message", "T-TASK-ERROR-MESSAGE", 1, 0, false);
    //declareFunction(myName, "t_task_properties", "T-TASK-PROPERTIES", 1, 0, false);
    //declareFunction(myName, "_csetf_t_task_lock", "_CSETF-T-TASK-LOCK", 2, 0, false);
    //declareFunction(myName, "_csetf_t_task_thread", "_CSETF-T-TASK-THREAD", 2, 0, false);
    //declareFunction(myName, "_csetf_t_task_name", "_CSETF-T-TASK-NAME", 2, 0, false);
    //declareFunction(myName, "_csetf_t_task_status", "_CSETF-T-TASK-STATUS", 2, 0, false);
    //declareFunction(myName, "_csetf_t_task_progress_message", "_CSETF-T-TASK-PROGRESS-MESSAGE", 2, 0, false);
    //declareFunction(myName, "_csetf_t_task_progress_sofar", "_CSETF-T-TASK-PROGRESS-SOFAR", 2, 0, false);
    //declareFunction(myName, "_csetf_t_task_progress_total", "_CSETF-T-TASK-PROGRESS-TOTAL", 2, 0, false);
    //declareFunction(myName, "_csetf_t_task_start_time", "_CSETF-T-TASK-START-TIME", 2, 0, false);
    //declareFunction(myName, "_csetf_t_task_finish_time", "_CSETF-T-TASK-FINISH-TIME", 2, 0, false);
    //declareFunction(myName, "_csetf_t_task_result", "_CSETF-T-TASK-RESULT", 2, 0, false);
    //declareFunction(myName, "_csetf_t_task_error_message", "_CSETF-T-TASK-ERROR-MESSAGE", 2, 0, false);
    //declareFunction(myName, "_csetf_t_task_properties", "_CSETF-T-TASK-PROPERTIES", 2, 0, false);
    //declareFunction(myName, "make_thinking_task", "MAKE-THINKING-TASK", 0, 1, false);
    //declareFunction(myName, "new_thinking_task", "NEW-THINKING-TASK", 2, 1, false);
    //declareMacro(myName, "with_thinking_lock", "WITH-THINKING-LOCK");
    //declareFunction(myName, "thinking_note_thread", "THINKING-NOTE-THREAD", 2, 0, false);
    //declareFunction(myName, "thinking_clear_thread", "THINKING-CLEAR-THREAD", 1, 0, false);
    //declareFunction(myName, "thinking_note_status", "THINKING-NOTE-STATUS", 2, 0, false);
    //declareFunction(myName, "thinking_note_progress_message", "THINKING-NOTE-PROGRESS-MESSAGE", 2, 0, false);
    //declareFunction(myName, "thinking_note_progress_sofar", "THINKING-NOTE-PROGRESS-SOFAR", 2, 0, false);
    //declareFunction(myName, "thinking_note_progress_total", "THINKING-NOTE-PROGRESS-TOTAL", 2, 0, false);
    //declareFunction(myName, "thinking_note_start_time", "THINKING-NOTE-START-TIME", 2, 0, false);
    //declareFunction(myName, "thinking_note_finish_time", "THINKING-NOTE-FINISH-TIME", 2, 0, false);
    //declareFunction(myName, "thinking_note_result", "THINKING-NOTE-RESULT", 2, 0, false);
    //declareFunction(myName, "thinking_note_error_message", "THINKING-NOTE-ERROR-MESSAGE", 2, 0, false);
    //declareFunction(myName, "thinking_note_property", "THINKING-NOTE-PROPERTY", 3, 0, false);
    //declareFunction(myName, "thinking_lock", "THINKING-LOCK", 1, 0, false);
    //declareFunction(myName, "thinking_thread", "THINKING-THREAD", 1, 0, false);
    //declareFunction(myName, "thinking_name", "THINKING-NAME", 1, 0, false);
    //declareFunction(myName, "thinking_status", "THINKING-STATUS", 1, 0, false);
    //declareFunction(myName, "thinking_progress_message", "THINKING-PROGRESS-MESSAGE", 1, 0, false);
    //declareFunction(myName, "thinking_progress_sofar", "THINKING-PROGRESS-SOFAR", 1, 0, false);
    //declareFunction(myName, "thinking_progress_total", "THINKING-PROGRESS-TOTAL", 1, 0, false);
    //declareFunction(myName, "thinking_start_time", "THINKING-START-TIME", 1, 0, false);
    //declareFunction(myName, "thinking_finish_time", "THINKING-FINISH-TIME", 1, 0, false);
    //declareFunction(myName, "thinking_result", "THINKING-RESULT", 1, 0, false);
    //declareFunction(myName, "thinking_error_message", "THINKING-ERROR-MESSAGE", 1, 0, false);
    //declareFunction(myName, "thinking_property", "THINKING-PROPERTY", 2, 0, false);
    //declareFunction(myName, "thinking_properties", "THINKING-PROPERTIES", 1, 0, false);
    //declareFunction(myName, "thinking_task", "THINKING-TASK", 0, 0, false);
    //declareFunction(myName, "thinking_start", "THINKING-START", 3, 0, false);
    //declareFunction(myName, "thinking_stop", "THINKING-STOP", 1, 0, false);
    //declareFunction(myName, "thinking_thread_run", "THINKING-THREAD-RUN", 3, 0, false);
    //declareFunction(myName, "thinking_thread_initialize", "THINKING-THREAD-INITIALIZE", 1, 0, false);
    //declareFunction(myName, "thinking_thread_finalize", "THINKING-THREAD-FINALIZE", 4, 0, false);
    declareFunction(myName, "ipc_queue_print_function_trampoline", "IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "ipc_queue_p", "IPC-QUEUE-P", 1, 0, false); new $ipc_queue_p$UnaryFunction();
    //declareFunction(myName, "ipc_queue_lock", "IPC-QUEUE-LOCK", 1, 0, false);
    //declareFunction(myName, "ipc_queue_semaphore", "IPC-QUEUE-SEMAPHORE", 1, 0, false);
    //declareFunction(myName, "ipc_queue_data_queue", "IPC-QUEUE-DATA-QUEUE", 1, 0, false);
    //declareFunction(myName, "_csetf_ipc_queue_lock", "_CSETF-IPC-QUEUE-LOCK", 2, 0, false);
    //declareFunction(myName, "_csetf_ipc_queue_semaphore", "_CSETF-IPC-QUEUE-SEMAPHORE", 2, 0, false);
    //declareFunction(myName, "_csetf_ipc_queue_data_queue", "_CSETF-IPC-QUEUE-DATA-QUEUE", 2, 0, false);
    //declareFunction(myName, "make_ipc_queue", "MAKE-IPC-QUEUE", 0, 1, false);
    //declareFunction(myName, "new_ipc_queue", "NEW-IPC-QUEUE", 1, 0, false);
    //declareFunction(myName, "ipc_enqueue", "IPC-ENQUEUE", 2, 0, false);
    //declareFunction(myName, "ipc_dequeue", "IPC-DEQUEUE", 1, 0, false);
    //declareFunction(myName, "ipc_dequeue_n", "IPC-DEQUEUE-N", 1, 1, false);
    //declareFunction(myName, "ipc_dequeue_with_timeout", "IPC-DEQUEUE-WITH-TIMEOUT", 2, 1, false);
    //declareFunction(myName, "ipc_current_queue_size", "IPC-CURRENT-QUEUE-SIZE", 1, 0, false);
    //declareFunction(myName, "ipc_current_queue_content", "IPC-CURRENT-QUEUE-CONTENT", 1, 0, false);
    declareFunction(myName, "ordered_ipc_queue_print_function_trampoline", "ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "ordered_ipc_queue_p", "ORDERED-IPC-QUEUE-P", 1, 0, false); new $ordered_ipc_queue_p$UnaryFunction();
    //declareFunction(myName, "ordrd_ipcq_lock", "ORDRD-IPCQ-LOCK", 1, 0, false);
    //declareFunction(myName, "ordrd_ipcq_producer_isg", "ORDRD-IPCQ-PRODUCER-ISG", 1, 0, false);
    //declareFunction(myName, "ordrd_ipcq_consumer_isg", "ORDRD-IPCQ-CONSUMER-ISG", 1, 0, false);
    //declareFunction(myName, "ordrd_ipcq_payload", "ORDRD-IPCQ-PAYLOAD", 1, 0, false);
    //declareFunction(myName, "_csetf_ordrd_ipcq_lock", "_CSETF-ORDRD-IPCQ-LOCK", 2, 0, false);
    //declareFunction(myName, "_csetf_ordrd_ipcq_producer_isg", "_CSETF-ORDRD-IPCQ-PRODUCER-ISG", 2, 0, false);
    //declareFunction(myName, "_csetf_ordrd_ipcq_consumer_isg", "_CSETF-ORDRD-IPCQ-CONSUMER-ISG", 2, 0, false);
    //declareFunction(myName, "_csetf_ordrd_ipcq_payload", "_CSETF-ORDRD-IPCQ-PAYLOAD", 2, 0, false);
    //declareFunction(myName, "make_ordered_ipc_queue", "MAKE-ORDERED-IPC-QUEUE", 0, 1, false);
    //declareFunction(myName, "new_ordered_ipc_queue", "NEW-ORDERED-IPC-QUEUE", 1, 1, false);
    //declareFunction(myName, "ordered_ipc_enqueue", "ORDERED-IPC-ENQUEUE", 2, 0, false);
    //declareFunction(myName, "ordered_ipc_dequeue", "ORDERED-IPC-DEQUEUE", 1, 0, false);
    //declareFunction(myName, "ordered_ipc_current_queue_size", "ORDERED-IPC-CURRENT-QUEUE-SIZE", 1, 0, false);
    //declareFunction(myName, "ordered_ipc_current_queue_contents", "ORDERED-IPC-CURRENT-QUEUE-CONTENTS", 1, 0, false);
    //declareFunction(myName, "kill_process_named", "KILL-PROCESS-NAMED", 1, 0, false);
    //declareFunction(myName, "process_named", "PROCESS-NAMED", 1, 0, false);
    declareFunction(myName, "process_exhaust_immediately_fn", "PROCESS-EXHAUST-IMMEDIATELY-FN", 0, 0, false);
    declareFunction(myName, "make_exhausted_process", "MAKE-EXHAUSTED-PROCESS", 1, 0, false);
    declareFunction(myName, "visit_defstruct_object_process_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD", 2, 0, false);
    declareFunction(myName, "visit_defstruct_object_process", "VISIT-DEFSTRUCT-OBJECT-PROCESS", 2, 0, false);
    declareFunction(myName, "visit_defstruct_object_lock_method", "VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD", 2, 0, false);
    declareFunction(myName, "visit_defstruct_object_lock", "VISIT-DEFSTRUCT-OBJECT-LOCK", 2, 0, false);
    declareFunction(myName, "process_wrapper_print_function_trampoline", "PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "process_wrapper_p", "PROCESS-WRAPPER-P", 1, 0, false); new $process_wrapper_p$UnaryFunction();
    //declareFunction(myName, "process_wrapper_id", "PROCESS-WRAPPER-ID", 1, 0, false);
    //declareFunction(myName, "process_wrapper_process", "PROCESS-WRAPPER-PROCESS", 1, 0, false);
    //declareFunction(myName, "process_wrapper_state", "PROCESS-WRAPPER-STATE", 1, 0, false);
    //declareFunction(myName, "process_wrapper_lock", "PROCESS-WRAPPER-LOCK", 1, 0, false);
    //declareFunction(myName, "process_wrapper_plist", "PROCESS-WRAPPER-PLIST", 1, 0, false);
    //declareFunction(myName, "_csetf_process_wrapper_id", "_CSETF-PROCESS-WRAPPER-ID", 2, 0, false);
    //declareFunction(myName, "_csetf_process_wrapper_process", "_CSETF-PROCESS-WRAPPER-PROCESS", 2, 0, false);
    //declareFunction(myName, "_csetf_process_wrapper_state", "_CSETF-PROCESS-WRAPPER-STATE", 2, 0, false);
    //declareFunction(myName, "_csetf_process_wrapper_lock", "_CSETF-PROCESS-WRAPPER-LOCK", 2, 0, false);
    //declareFunction(myName, "_csetf_process_wrapper_plist", "_CSETF-PROCESS-WRAPPER-PLIST", 2, 0, false);
    //declareFunction(myName, "make_process_wrapper", "MAKE-PROCESS-WRAPPER", 0, 1, false);
    //declareFunction(myName, "new_process_wrapper", "NEW-PROCESS-WRAPPER", 2, 1, false);
    //declareFunction(myName, "new_process_wrapper_int", "NEW-PROCESS-WRAPPER-INT", 3, 0, false);
    //declareFunction(myName, "process_wrapper_get_id", "PROCESS-WRAPPER-GET-ID", 1, 0, false);
    //declareFunction(myName, "process_wrapper_get_process", "PROCESS-WRAPPER-GET-PROCESS", 1, 0, false);
    //declareFunction(myName, "process_wrapper_get_state", "PROCESS-WRAPPER-GET-STATE", 1, 0, false);
    //declareFunction(myName, "process_wrapper_get_lock", "PROCESS-WRAPPER-GET-LOCK", 1, 0, false);
    //declareFunction(myName, "process_wrapper_get_plist", "PROCESS-WRAPPER-GET-PLIST", 1, 0, false);
    //declareFunction(myName, "process_wrapper_process_startingP", "PROCESS-WRAPPER-PROCESS-STARTING?", 1, 0, false);
    //declareFunction(myName, "process_wrapper_process_runningP", "PROCESS-WRAPPER-PROCESS-RUNNING?", 1, 0, false);
    //declareFunction(myName, "process_wrapper_process_completedP", "PROCESS-WRAPPER-PROCESS-COMPLETED?", 1, 0, false);
    //declareFunction(myName, "process_wrapper_process_abortedP", "PROCESS-WRAPPER-PROCESS-ABORTED?", 1, 0, false);
    //declareFunction(myName, "process_wrapper_process_pausingP", "PROCESS-WRAPPER-PROCESS-PAUSING?", 1, 0, false);
    //declareFunction(myName, "process_wrapper_process_pausedP", "PROCESS-WRAPPER-PROCESS-PAUSED?", 1, 0, false);
    //declareFunction(myName, "process_wrapper_process_pause", "PROCESS-WRAPPER-PROCESS-PAUSE", 1, 0, false);
    //declareFunction(myName, "process_wrapper_process_resume", "PROCESS-WRAPPER-PROCESS-RESUME", 1, 0, false);
    //declareFunction(myName, "process_wrapper_checkpoint", "PROCESS-WRAPPER-CHECKPOINT", 1, 0, false);
    //declareFunction(myName, "process_wrapper_block", "PROCESS-WRAPPER-BLOCK", 1, 0, false);
    //declareFunction(myName, "process_wrapper_process_abort", "PROCESS-WRAPPER-PROCESS-ABORT", 1, 0, false);
    //declareFunction(myName, "process_wrapper_set_property", "PROCESS-WRAPPER-SET-PROPERTY", 3, 0, false);
    //declareFunction(myName, "process_wrapper_get_property", "PROCESS-WRAPPER-GET-PROPERTY", 2, 1, false);
    //declareFunction(myName, "make_cyc_server_process", "MAKE-CYC-SERVER-PROCESS", 2, 0, false);
    //declareFunction(myName, "cyc_server_process_funcall", "CYC-SERVER-PROCESS-FUNCALL", 1, 0, false);
    //declareFunction(myName, "make_cyc_server_process_with_args", "MAKE-CYC-SERVER-PROCESS-WITH-ARGS", 2, 1, false);
    //declareFunction(myName, "cyc_server_process_funcall_with_args", "CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS", 1, 0, false);
    //declareFunction(myName, "process_count", "PROCESS-COUNT", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_process_utilities_file() {
    $dtp_task$ = defconstant("*DTP-TASK*", $sym7$TASK);
    $dtp_thinking_task$ = defconstant("*DTP-THINKING-TASK*", $sym27$THINKING_TASK);
    $thinking_task$ = defparameter("*THINKING-TASK*", NIL);
    $dtp_ipc_queue$ = defconstant("*DTP-IPC-QUEUE*", $sym93$IPC_QUEUE);
    $dtp_ordered_ipc_queue$ = defconstant("*DTP-ORDERED-IPC-QUEUE*", $sym112$ORDERED_IPC_QUEUE);
    $ordered_ipcq_empty$ = defconstant("*ORDERED-IPCQ-EMPTY*", Symbols.make_symbol($str130$empty_ordered_IPC_queue_entry));
    $dtp_process_wrapper$ = defconstant("*DTP-PROCESS-WRAPPER*", $sym146$PROCESS_WRAPPER);
    $process_wrapper_isg$ = deflexical("*PROCESS-WRAPPER-ISG*", ((NIL != Symbols.boundp($sym166$_PROCESS_WRAPPER_ISG_)) ? ((SubLObject) $process_wrapper_isg$.getGlobalValue()) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    return NIL;
  }

  public static final SubLObject setup_process_utilities_file() {
    // CVS_ID("Id: process-utilities.lisp 128914 2009-10-06 17:44:34Z rck ");
    access_macros.define_obsolete_register($sym0$INTERRUPT_INITIAL_PROCESS, $list1);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_task$.getGlobalValue(), Symbols.symbol_function($sym14$TASK_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym15$TASK_PROCESS, $sym16$_CSETF_TASK_PROCESS);
    Structures.def_csetf($sym17$TASK_COMPLETED, $sym18$_CSETF_TASK_COMPLETED);
    Equality.identity($sym7$TASK);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_thinking_task$.getGlobalValue(), Symbols.symbol_function($sym33$THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym34$T_TASK_LOCK, $sym35$_CSETF_T_TASK_LOCK);
    Structures.def_csetf($sym36$T_TASK_THREAD, $sym37$_CSETF_T_TASK_THREAD);
    Structures.def_csetf($sym38$T_TASK_NAME, $sym39$_CSETF_T_TASK_NAME);
    Structures.def_csetf($sym40$T_TASK_STATUS, $sym41$_CSETF_T_TASK_STATUS);
    Structures.def_csetf($sym42$T_TASK_PROGRESS_MESSAGE, $sym43$_CSETF_T_TASK_PROGRESS_MESSAGE);
    Structures.def_csetf($sym44$T_TASK_PROGRESS_SOFAR, $sym45$_CSETF_T_TASK_PROGRESS_SOFAR);
    Structures.def_csetf($sym46$T_TASK_PROGRESS_TOTAL, $sym47$_CSETF_T_TASK_PROGRESS_TOTAL);
    Structures.def_csetf($sym48$T_TASK_START_TIME, $sym49$_CSETF_T_TASK_START_TIME);
    Structures.def_csetf($sym50$T_TASK_FINISH_TIME, $sym51$_CSETF_T_TASK_FINISH_TIME);
    Structures.def_csetf($sym52$T_TASK_RESULT, $sym53$_CSETF_T_TASK_RESULT);
    Structures.def_csetf($sym54$T_TASK_ERROR_MESSAGE, $sym55$_CSETF_T_TASK_ERROR_MESSAGE);
    Structures.def_csetf($sym56$T_TASK_PROPERTIES, $sym57$_CSETF_T_TASK_PROPERTIES);
    Equality.identity($sym27$THINKING_TASK);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_ipc_queue$.getGlobalValue(), Symbols.symbol_function($sym99$IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym100$IPC_QUEUE_LOCK, $sym101$_CSETF_IPC_QUEUE_LOCK);
    Structures.def_csetf($sym102$IPC_QUEUE_SEMAPHORE, $sym103$_CSETF_IPC_QUEUE_SEMAPHORE);
    Structures.def_csetf($sym104$IPC_QUEUE_DATA_QUEUE, $sym105$_CSETF_IPC_QUEUE_DATA_QUEUE);
    Equality.identity($sym93$IPC_QUEUE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_ordered_ipc_queue$.getGlobalValue(), Symbols.symbol_function($sym118$ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym119$ORDRD_IPCQ_LOCK, $sym120$_CSETF_ORDRD_IPCQ_LOCK);
    Structures.def_csetf($sym121$ORDRD_IPCQ_PRODUCER_ISG, $sym122$_CSETF_ORDRD_IPCQ_PRODUCER_ISG);
    Structures.def_csetf($sym123$ORDRD_IPCQ_CONSUMER_ISG, $sym124$_CSETF_ORDRD_IPCQ_CONSUMER_ISG);
    Structures.def_csetf($sym125$ORDRD_IPCQ_PAYLOAD, $sym126$_CSETF_ORDRD_IPCQ_PAYLOAD);
    Equality.identity($sym112$ORDERED_IPC_QUEUE);
    utilities_macros.register_cyc_api_function($sym133$KILL_PROCESS_NAMED, $list134, $str135$_param_NAME__stringp____Kills_any, $list136, $list137);
    Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_process$.getGlobalValue(), Symbols.symbol_function($sym139$VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD));
    Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), Types.$dtp_lock$.getGlobalValue(), Symbols.symbol_function($sym144$VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_process_wrapper$.getGlobalValue(), Symbols.symbol_function($sym152$PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym153$PROCESS_WRAPPER_ID, $sym154$_CSETF_PROCESS_WRAPPER_ID);
    Structures.def_csetf($sym155$PROCESS_WRAPPER_PROCESS, $sym156$_CSETF_PROCESS_WRAPPER_PROCESS);
    Structures.def_csetf($sym157$PROCESS_WRAPPER_STATE, $sym158$_CSETF_PROCESS_WRAPPER_STATE);
    Structures.def_csetf($sym159$PROCESS_WRAPPER_LOCK, $sym160$_CSETF_PROCESS_WRAPPER_LOCK);
    Structures.def_csetf($sym161$PROCESS_WRAPPER_PLIST, $sym162$_CSETF_PROCESS_WRAPPER_PLIST);
    Equality.identity($sym146$PROCESS_WRAPPER);
    subl_macro_promotions.declare_defglobal($sym166$_PROCESS_WRAPPER_ISG_);
    utilities_macros.note_funcall_helper_function($sym172$CYC_SERVER_PROCESS_FUNCALL);
    utilities_macros.note_funcall_helper_function($sym175$CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$INTERRUPT_INITIAL_PROCESS = makeSymbol("INTERRUPT-INITIAL-PROCESS");
  public static final SubLList $list1 = list(makeSymbol("DEBUG-INITIAL-PROCESS"));
  public static final SubLString $str2$Idle = makeString("Idle");
  public static final SubLString $str3$Sleep = makeString("Sleep");
  public static final SubLString $str4$wait = makeString("wait");
  public static final SubLString $str5$blocked = makeString("blocked");
  public static final SubLString $str6$run = makeString("run");
  public static final SubLSymbol $sym7$TASK = makeSymbol("TASK");
  public static final SubLSymbol $sym8$TASK_P = makeSymbol("TASK-P");
  public static final SubLList $list9 = list(makeSymbol("PROCESS"), makeSymbol("COMPLETED"));
  public static final SubLList $list10 = list(makeKeyword("PROCESS"), makeKeyword("COMPLETED"));
  public static final SubLList $list11 = list(makeSymbol("TASK-PROCESS"), makeSymbol("TASK-COMPLETED"));
  public static final SubLList $list12 = list(makeSymbol("_CSETF-TASK-PROCESS"), makeSymbol("_CSETF-TASK-COMPLETED"));
  public static final SubLSymbol $sym13$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym14$TASK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym15$TASK_PROCESS = makeSymbol("TASK-PROCESS");
  public static final SubLSymbol $sym16$_CSETF_TASK_PROCESS = makeSymbol("_CSETF-TASK-PROCESS");
  public static final SubLSymbol $sym17$TASK_COMPLETED = makeSymbol("TASK-COMPLETED");
  public static final SubLSymbol $sym18$_CSETF_TASK_COMPLETED = makeSymbol("_CSETF-TASK-COMPLETED");
  public static final SubLSymbol $kw19$PROCESS = makeKeyword("PROCESS");
  public static final SubLSymbol $kw20$COMPLETED = makeKeyword("COMPLETED");
  public static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym22$SYMBOL_NAME = makeSymbol("SYMBOL-NAME");
  public static final SubLSymbol $sym23$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym24$CADR = makeSymbol("CADR");
  public static final SubLSymbol $sym25$NEW_TASK_INTERNAL = makeSymbol("NEW-TASK-INTERNAL");
  public static final SubLSymbol $sym26$FIND_SYMBOL = makeSymbol("FIND-SYMBOL");
  public static final SubLSymbol $sym27$THINKING_TASK = makeSymbol("THINKING-TASK");
  public static final SubLSymbol $sym28$THINKING_TASK_P = makeSymbol("THINKING-TASK-P");
  public static final SubLList $list29 = list(new SubLObject[] {makeSymbol("LOCK"), makeSymbol("THREAD"), makeSymbol("NAME"), makeSymbol("STATUS"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("PROGRESS-SOFAR"), makeSymbol("PROGRESS-TOTAL"), makeSymbol("START-TIME"), makeSymbol("FINISH-TIME"), makeSymbol("RESULT"), makeSymbol("ERROR-MESSAGE"), makeSymbol("PROPERTIES")});
  public static final SubLList $list30 = list(new SubLObject[] {makeKeyword("LOCK"), makeKeyword("THREAD"), makeKeyword("NAME"), makeKeyword("STATUS"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("PROGRESS-SOFAR"), makeKeyword("PROGRESS-TOTAL"), makeKeyword("START-TIME"), makeKeyword("FINISH-TIME"), makeKeyword("RESULT"), makeKeyword("ERROR-MESSAGE"), makeKeyword("PROPERTIES")});
  public static final SubLList $list31 = list(new SubLObject[] {makeSymbol("T-TASK-LOCK"), makeSymbol("T-TASK-THREAD"), makeSymbol("T-TASK-NAME"), makeSymbol("T-TASK-STATUS"), makeSymbol("T-TASK-PROGRESS-MESSAGE"), makeSymbol("T-TASK-PROGRESS-SOFAR"), makeSymbol("T-TASK-PROGRESS-TOTAL"), makeSymbol("T-TASK-START-TIME"), makeSymbol("T-TASK-FINISH-TIME"), makeSymbol("T-TASK-RESULT"), makeSymbol("T-TASK-ERROR-MESSAGE"), makeSymbol("T-TASK-PROPERTIES")});
  public static final SubLList $list32 = list(new SubLObject[] {makeSymbol("_CSETF-T-TASK-LOCK"), makeSymbol("_CSETF-T-TASK-THREAD"), makeSymbol("_CSETF-T-TASK-NAME"), makeSymbol("_CSETF-T-TASK-STATUS"), makeSymbol("_CSETF-T-TASK-PROGRESS-MESSAGE"), makeSymbol("_CSETF-T-TASK-PROGRESS-SOFAR"), makeSymbol("_CSETF-T-TASK-PROGRESS-TOTAL"), makeSymbol("_CSETF-T-TASK-START-TIME"), makeSymbol("_CSETF-T-TASK-FINISH-TIME"), makeSymbol("_CSETF-T-TASK-RESULT"), makeSymbol("_CSETF-T-TASK-ERROR-MESSAGE"), makeSymbol("_CSETF-T-TASK-PROPERTIES")});
  public static final SubLSymbol $sym33$THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym34$T_TASK_LOCK = makeSymbol("T-TASK-LOCK");
  public static final SubLSymbol $sym35$_CSETF_T_TASK_LOCK = makeSymbol("_CSETF-T-TASK-LOCK");
  public static final SubLSymbol $sym36$T_TASK_THREAD = makeSymbol("T-TASK-THREAD");
  public static final SubLSymbol $sym37$_CSETF_T_TASK_THREAD = makeSymbol("_CSETF-T-TASK-THREAD");
  public static final SubLSymbol $sym38$T_TASK_NAME = makeSymbol("T-TASK-NAME");
  public static final SubLSymbol $sym39$_CSETF_T_TASK_NAME = makeSymbol("_CSETF-T-TASK-NAME");
  public static final SubLSymbol $sym40$T_TASK_STATUS = makeSymbol("T-TASK-STATUS");
  public static final SubLSymbol $sym41$_CSETF_T_TASK_STATUS = makeSymbol("_CSETF-T-TASK-STATUS");
  public static final SubLSymbol $sym42$T_TASK_PROGRESS_MESSAGE = makeSymbol("T-TASK-PROGRESS-MESSAGE");
  public static final SubLSymbol $sym43$_CSETF_T_TASK_PROGRESS_MESSAGE = makeSymbol("_CSETF-T-TASK-PROGRESS-MESSAGE");
  public static final SubLSymbol $sym44$T_TASK_PROGRESS_SOFAR = makeSymbol("T-TASK-PROGRESS-SOFAR");
  public static final SubLSymbol $sym45$_CSETF_T_TASK_PROGRESS_SOFAR = makeSymbol("_CSETF-T-TASK-PROGRESS-SOFAR");
  public static final SubLSymbol $sym46$T_TASK_PROGRESS_TOTAL = makeSymbol("T-TASK-PROGRESS-TOTAL");
  public static final SubLSymbol $sym47$_CSETF_T_TASK_PROGRESS_TOTAL = makeSymbol("_CSETF-T-TASK-PROGRESS-TOTAL");
  public static final SubLSymbol $sym48$T_TASK_START_TIME = makeSymbol("T-TASK-START-TIME");
  public static final SubLSymbol $sym49$_CSETF_T_TASK_START_TIME = makeSymbol("_CSETF-T-TASK-START-TIME");
  public static final SubLSymbol $sym50$T_TASK_FINISH_TIME = makeSymbol("T-TASK-FINISH-TIME");
  public static final SubLSymbol $sym51$_CSETF_T_TASK_FINISH_TIME = makeSymbol("_CSETF-T-TASK-FINISH-TIME");
  public static final SubLSymbol $sym52$T_TASK_RESULT = makeSymbol("T-TASK-RESULT");
  public static final SubLSymbol $sym53$_CSETF_T_TASK_RESULT = makeSymbol("_CSETF-T-TASK-RESULT");
  public static final SubLSymbol $sym54$T_TASK_ERROR_MESSAGE = makeSymbol("T-TASK-ERROR-MESSAGE");
  public static final SubLSymbol $sym55$_CSETF_T_TASK_ERROR_MESSAGE = makeSymbol("_CSETF-T-TASK-ERROR-MESSAGE");
  public static final SubLSymbol $sym56$T_TASK_PROPERTIES = makeSymbol("T-TASK-PROPERTIES");
  public static final SubLSymbol $sym57$_CSETF_T_TASK_PROPERTIES = makeSymbol("_CSETF-T-TASK-PROPERTIES");
  public static final SubLSymbol $kw58$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw59$THREAD = makeKeyword("THREAD");
  public static final SubLSymbol $kw60$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw61$STATUS = makeKeyword("STATUS");
  public static final SubLSymbol $kw62$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $kw63$PROGRESS_SOFAR = makeKeyword("PROGRESS-SOFAR");
  public static final SubLSymbol $kw64$PROGRESS_TOTAL = makeKeyword("PROGRESS-TOTAL");
  public static final SubLSymbol $kw65$START_TIME = makeKeyword("START-TIME");
  public static final SubLSymbol $kw66$FINISH_TIME = makeKeyword("FINISH-TIME");
  public static final SubLSymbol $kw67$RESULT = makeKeyword("RESULT");
  public static final SubLSymbol $kw68$ERROR_MESSAGE = makeKeyword("ERROR-MESSAGE");
  public static final SubLSymbol $kw69$PROPERTIES = makeKeyword("PROPERTIES");
  public static final SubLSymbol $sym70$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym71$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $kw72$NONE = makeKeyword("NONE");
  public static final SubLList $list73 = list(list(makeSymbol("THINKING")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym74$LOCK = makeUninternedSymbol("LOCK");
  public static final SubLSymbol $sym75$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym76$THINKING_LOCK = makeSymbol("THINKING-LOCK");
  public static final SubLSymbol $sym77$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLSymbol $sym78$PROCESSP = makeSymbol("PROCESSP");
  public static final SubLSymbol $sym79$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym80$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym81$UNIVERSAL_TIME_P = makeSymbol("UNIVERSAL-TIME-P");
  public static final SubLSymbol $sym82$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym83$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym84$THINKING_THREAD_RUN = makeSymbol("THINKING-THREAD-RUN");
  public static final SubLSymbol $kw85$STARTED = makeKeyword("STARTED");
  public static final SubLSymbol $kw86$STOPPED = makeKeyword("STOPPED");
  public static final SubLString $str87$CYC = makeString("CYC");
  public static final SubLSymbol $sym88$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $kw89$RUNNING = makeKeyword("RUNNING");
  public static final SubLString $str90$Function__A_in_thread__A_terminat = makeString("Function ~A in thread ~A terminated by uncaught THROW.");
  public static final SubLSymbol $kw91$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $kw92$FINISHED = makeKeyword("FINISHED");
  public static final SubLSymbol $sym93$IPC_QUEUE = makeSymbol("IPC-QUEUE");
  public static final SubLSymbol $sym94$IPC_QUEUE_P = makeSymbol("IPC-QUEUE-P");
  public static final SubLList $list95 = list(makeSymbol("LOCK"), makeSymbol("SEMAPHORE"), makeSymbol("DATA-QUEUE"));
  public static final SubLList $list96 = list(makeKeyword("LOCK"), makeKeyword("SEMAPHORE"), makeKeyword("DATA-QUEUE"));
  public static final SubLList $list97 = list(makeSymbol("IPC-QUEUE-LOCK"), makeSymbol("IPC-QUEUE-SEMAPHORE"), makeSymbol("IPC-QUEUE-DATA-QUEUE"));
  public static final SubLList $list98 = list(makeSymbol("_CSETF-IPC-QUEUE-LOCK"), makeSymbol("_CSETF-IPC-QUEUE-SEMAPHORE"), makeSymbol("_CSETF-IPC-QUEUE-DATA-QUEUE"));
  public static final SubLSymbol $sym99$IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym100$IPC_QUEUE_LOCK = makeSymbol("IPC-QUEUE-LOCK");
  public static final SubLSymbol $sym101$_CSETF_IPC_QUEUE_LOCK = makeSymbol("_CSETF-IPC-QUEUE-LOCK");
  public static final SubLSymbol $sym102$IPC_QUEUE_SEMAPHORE = makeSymbol("IPC-QUEUE-SEMAPHORE");
  public static final SubLSymbol $sym103$_CSETF_IPC_QUEUE_SEMAPHORE = makeSymbol("_CSETF-IPC-QUEUE-SEMAPHORE");
  public static final SubLSymbol $sym104$IPC_QUEUE_DATA_QUEUE = makeSymbol("IPC-QUEUE-DATA-QUEUE");
  public static final SubLSymbol $sym105$_CSETF_IPC_QUEUE_DATA_QUEUE = makeSymbol("_CSETF-IPC-QUEUE-DATA-QUEUE");
  public static final SubLSymbol $kw106$SEMAPHORE = makeKeyword("SEMAPHORE");
  public static final SubLSymbol $kw107$DATA_QUEUE = makeKeyword("DATA-QUEUE");
  public static final SubLString $str108$Lock_for_Queue_ = makeString("Lock for Queue ");
  public static final SubLInteger $int109$100 = makeInteger(100);
  public static final SubLSymbol $sym110$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLFloat $float111$0_01 = makeDouble(0.01);
  public static final SubLSymbol $sym112$ORDERED_IPC_QUEUE = makeSymbol("ORDERED-IPC-QUEUE");
  public static final SubLSymbol $sym113$ORDERED_IPC_QUEUE_P = makeSymbol("ORDERED-IPC-QUEUE-P");
  public static final SubLList $list114 = list(makeSymbol("LOCK"), makeSymbol("PRODUCER-ISG"), makeSymbol("CONSUMER-ISG"), makeSymbol("PAYLOAD"));
  public static final SubLList $list115 = list(makeKeyword("LOCK"), makeKeyword("PRODUCER-ISG"), makeKeyword("CONSUMER-ISG"), makeKeyword("PAYLOAD"));
  public static final SubLList $list116 = list(makeSymbol("ORDRD-IPCQ-LOCK"), makeSymbol("ORDRD-IPCQ-PRODUCER-ISG"), makeSymbol("ORDRD-IPCQ-CONSUMER-ISG"), makeSymbol("ORDRD-IPCQ-PAYLOAD"));
  public static final SubLList $list117 = list(makeSymbol("_CSETF-ORDRD-IPCQ-LOCK"), makeSymbol("_CSETF-ORDRD-IPCQ-PRODUCER-ISG"), makeSymbol("_CSETF-ORDRD-IPCQ-CONSUMER-ISG"), makeSymbol("_CSETF-ORDRD-IPCQ-PAYLOAD"));
  public static final SubLSymbol $sym118$ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym119$ORDRD_IPCQ_LOCK = makeSymbol("ORDRD-IPCQ-LOCK");
  public static final SubLSymbol $sym120$_CSETF_ORDRD_IPCQ_LOCK = makeSymbol("_CSETF-ORDRD-IPCQ-LOCK");
  public static final SubLSymbol $sym121$ORDRD_IPCQ_PRODUCER_ISG = makeSymbol("ORDRD-IPCQ-PRODUCER-ISG");
  public static final SubLSymbol $sym122$_CSETF_ORDRD_IPCQ_PRODUCER_ISG = makeSymbol("_CSETF-ORDRD-IPCQ-PRODUCER-ISG");
  public static final SubLSymbol $sym123$ORDRD_IPCQ_CONSUMER_ISG = makeSymbol("ORDRD-IPCQ-CONSUMER-ISG");
  public static final SubLSymbol $sym124$_CSETF_ORDRD_IPCQ_CONSUMER_ISG = makeSymbol("_CSETF-ORDRD-IPCQ-CONSUMER-ISG");
  public static final SubLSymbol $sym125$ORDRD_IPCQ_PAYLOAD = makeSymbol("ORDRD-IPCQ-PAYLOAD");
  public static final SubLSymbol $sym126$_CSETF_ORDRD_IPCQ_PAYLOAD = makeSymbol("_CSETF-ORDRD-IPCQ-PAYLOAD");
  public static final SubLSymbol $kw127$PRODUCER_ISG = makeKeyword("PRODUCER-ISG");
  public static final SubLSymbol $kw128$CONSUMER_ISG = makeKeyword("CONSUMER-ISG");
  public static final SubLSymbol $kw129$PAYLOAD = makeKeyword("PAYLOAD");
  public static final SubLString $str130$empty_ordered_IPC_queue_entry = makeString("empty ordered IPC queue entry");
  public static final SubLString $str131$Lock_for_Ordered_IPC_Queue_ = makeString("Lock for Ordered IPC Queue ");
  public static final SubLString $str132$Unexpected_entry__A_in_the_payloa = makeString("Unexpected entry ~A in the payload of ordered IPC queue ~A: expected nothing or waiting process.");
  public static final SubLSymbol $sym133$KILL_PROCESS_NAMED = makeSymbol("KILL-PROCESS-NAMED");
  public static final SubLList $list134 = list(makeSymbol("NAME"));
  public static final SubLString $str135$_param_NAME__stringp____Kills_any = makeString("@param NAME; stringp\n   Kills any process having the given process name. Note\n   that kill-process is not yet supported on Win32.");
  public static final SubLList $list136 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));
  public static final SubLList $list137 = list(NIL);
  public static final SubLSymbol $sym138$PROCESS_EXHAUST_IMMEDIATELY_FN = makeSymbol("PROCESS-EXHAUST-IMMEDIATELY-FN");
  public static final SubLSymbol $sym139$VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD");
  public static final SubLSymbol $kw140$BEGIN = makeKeyword("BEGIN");
  public static final SubLSymbol $sym141$MAKE_EXHAUSTED_PROCESS = makeSymbol("MAKE-EXHAUSTED-PROCESS");
  public static final SubLSymbol $kw142$SLOT = makeKeyword("SLOT");
  public static final SubLSymbol $kw143$END = makeKeyword("END");
  public static final SubLSymbol $sym144$VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD");
  public static final SubLSymbol $sym145$MAKE_LOCK = makeSymbol("MAKE-LOCK");
  public static final SubLSymbol $sym146$PROCESS_WRAPPER = makeSymbol("PROCESS-WRAPPER");
  public static final SubLSymbol $sym147$PROCESS_WRAPPER_P = makeSymbol("PROCESS-WRAPPER-P");
  public static final SubLList $list148 = list(makeSymbol("ID"), makeSymbol("PROCESS"), makeSymbol("STATE"), makeSymbol("LOCK"), makeSymbol("PLIST"));
  public static final SubLList $list149 = list(makeKeyword("ID"), makeKeyword("PROCESS"), makeKeyword("STATE"), makeKeyword("LOCK"), makeKeyword("PLIST"));
  public static final SubLList $list150 = list(makeSymbol("PROCESS-WRAPPER-ID"), makeSymbol("PROCESS-WRAPPER-PROCESS"), makeSymbol("PROCESS-WRAPPER-STATE"), makeSymbol("PROCESS-WRAPPER-LOCK"), makeSymbol("PROCESS-WRAPPER-PLIST"));
  public static final SubLList $list151 = list(makeSymbol("_CSETF-PROCESS-WRAPPER-ID"), makeSymbol("_CSETF-PROCESS-WRAPPER-PROCESS"), makeSymbol("_CSETF-PROCESS-WRAPPER-STATE"), makeSymbol("_CSETF-PROCESS-WRAPPER-LOCK"), makeSymbol("_CSETF-PROCESS-WRAPPER-PLIST"));
  public static final SubLSymbol $sym152$PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym153$PROCESS_WRAPPER_ID = makeSymbol("PROCESS-WRAPPER-ID");
  public static final SubLSymbol $sym154$_CSETF_PROCESS_WRAPPER_ID = makeSymbol("_CSETF-PROCESS-WRAPPER-ID");
  public static final SubLSymbol $sym155$PROCESS_WRAPPER_PROCESS = makeSymbol("PROCESS-WRAPPER-PROCESS");
  public static final SubLSymbol $sym156$_CSETF_PROCESS_WRAPPER_PROCESS = makeSymbol("_CSETF-PROCESS-WRAPPER-PROCESS");
  public static final SubLSymbol $sym157$PROCESS_WRAPPER_STATE = makeSymbol("PROCESS-WRAPPER-STATE");
  public static final SubLSymbol $sym158$_CSETF_PROCESS_WRAPPER_STATE = makeSymbol("_CSETF-PROCESS-WRAPPER-STATE");
  public static final SubLSymbol $sym159$PROCESS_WRAPPER_LOCK = makeSymbol("PROCESS-WRAPPER-LOCK");
  public static final SubLSymbol $sym160$_CSETF_PROCESS_WRAPPER_LOCK = makeSymbol("_CSETF-PROCESS-WRAPPER-LOCK");
  public static final SubLSymbol $sym161$PROCESS_WRAPPER_PLIST = makeSymbol("PROCESS-WRAPPER-PLIST");
  public static final SubLSymbol $sym162$_CSETF_PROCESS_WRAPPER_PLIST = makeSymbol("_CSETF-PROCESS-WRAPPER-PLIST");
  public static final SubLSymbol $kw163$ID = makeKeyword("ID");
  public static final SubLSymbol $kw164$STATE = makeKeyword("STATE");
  public static final SubLSymbol $kw165$PLIST = makeKeyword("PLIST");
  public static final SubLSymbol $sym166$_PROCESS_WRAPPER_ISG_ = makeSymbol("*PROCESS-WRAPPER-ISG*");
  public static final SubLSymbol $kw167$STARTING = makeKeyword("STARTING");
  public static final SubLSymbol $sym168$NEW_PROCESS_WRAPPER_INT = makeSymbol("NEW-PROCESS-WRAPPER-INT");
  public static final SubLSymbol $kw169$ABORTED = makeKeyword("ABORTED");
  public static final SubLSymbol $kw170$PAUSING = makeKeyword("PAUSING");
  public static final SubLSymbol $kw171$PAUSED = makeKeyword("PAUSED");
  public static final SubLSymbol $sym172$CYC_SERVER_PROCESS_FUNCALL = makeSymbol("CYC-SERVER-PROCESS-FUNCALL");
  public static final SubLSymbol $sym173$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLSymbol $sym174$_EXIT = makeSymbol("%EXIT");
  public static final SubLSymbol $sym175$CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS = makeSymbol("CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS");
  public static final SubLList $list176 = cons(makeSymbol("FUNCTION"), makeSymbol("ARGS"));

  //// Initializers

  public void declareFunctions() {
    declare_process_utilities_file();
  }

  public void initializeVariables() {
    init_process_utilities_file();
  }

  public void runTopLevelForms() {
    setup_process_utilities_file();
  }

}
