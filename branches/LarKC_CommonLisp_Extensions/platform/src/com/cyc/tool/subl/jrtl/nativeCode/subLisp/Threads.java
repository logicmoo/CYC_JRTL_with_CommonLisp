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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public  final class Threads extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Threads. */
  public Threads() {}
  public static final SubLTrampolineFile me = new Threads();
  
  
  //// Public Area
  
  public static SubLSymbol $process_background_priority$;
  public static SubLSymbol $process_critical_priority$;
  public static SubLSymbol $process_max_priority$;
  public static SubLSymbol $process_min_priority$;
  public static SubLSymbol $process_normal_priority$; 
  public static SubLSymbol $is_thread_performing_cleanupP$;
  
  public static SubLString DEAD_STRING;
  public static SubLString RUN_STRING;
  public static SubLString BLOCKED_STRING;
  public static SubLString INPUT_WAIT_STRING;
  public static SubLString OUTPUT_WAIT_STRING;
  public static SubLString IO_WAIT_STRING;
  public static SubLString SLEEP_STRING;
  public static SubLString LOCK_STRING;
  public static SubLString INITIALIZING_STRING;
  public static SubLString UNSET_STRING;
  
  public static SubLSymbol INITIALIZING_SYM;
  public static SubLSymbol RUN_SYM;
  public static SubLSymbol WAIT_SYM;
  public static SubLSymbol DEAD_SYM;
  public static SubLSymbol BLOCKED_SYM;
  
  public static SubLSymbol $process_wait_sleep_time$;
  
  public static final SubLObject make_process(SubLObject name, SubLObject function) {
    return SubLObjectFactory.makeProcess(name.toStr(), function.getFunc());
  }
  
  public static final SubLObject process_block() {
    SubLProcess.currentProcess().block();
    return NIL;
  }
  
  public static final SubLObject process_yield() {
    Thread.currentThread().yield();
    return NIL;
  }
  
  public static final SubLObject process_unblock(SubLObject process) {
    process.toProcess().unblock();
    return NIL;
  }
  
  public static final SubLObject process_wait(SubLObject whostate, SubLObject predicate) {
    SubLProcess.currentProcess().processWait(whostate, predicate, SubLProcess.NeverTimesOut.NO_TIMEOUT);
    return T;
  }
  
  public static final SubLObject process_wait_with_timeout(SubLObject timeout,
      SubLObject whostate, SubLObject predicate) {
    if (timeout.numLE(ZERO_INTEGER)) {
      Errors.error("process-wait-with-timeout passed illegal timeout: " + timeout + ".");
    }
    SubLProcess.currentProcess().processWait(whostate, predicate, new SubLProcess.TimesOutAfter(timeout.toNumber()));
    return T;
  }
  
  public static final SubLObject kill_process(SubLObject process) {
    process.toProcess().killProcess();
    return NIL;
  }
  
  public static final SubLObject interrupt_process(SubLObject process, SubLObject function) {
    if (process == SubLProcess.currentProcess()) {
      Functions.funcall(function);
    } else {
      process.toProcess().addInterrupt(function);
    }
    return NIL;
  }
  
  public static final SubLObject debug_process(SubLObject process) {
    Errors.unimplementedMethod("debug-process");
    return NIL;
  }
  
  public static final SubLObject process_name(SubLObject process) {
    return process.toProcess().getName();
  }
  
  public static final SubLObject process_priority(SubLObject process) {
    return process.toProcess().getPriority();
  }
  
  public static final SubLObject set_process_priority(SubLObject process, SubLObject priority) {
    return process.toProcess().setPriority(priority.toFixnum());
  }
  
  public static final SubLObject process_active_p(SubLObject process) {
    if (process.toProcess().isActive()) { return T; }
    return NIL;
  }
  
  public static final SubLObject process_state(SubLObject process) {
    return process.toProcess().getState().toSymbol();
  }
  
  public static final SubLObject valid_process_p(SubLObject process) {
    return process_valid_p(process);
  }
  
  public static final SubLObject process_valid_p(SubLObject process) {
    if (!process.isProcess()) { return NIL; }
    return (process.toProcess().getState() == SubLProcess.DEAD_STATE) ? (SubLObject)NIL : T;
  }
  
  public static final SubLObject process_whostate(SubLObject process) {
    return process.toProcess().getWhoState();
  }
  
  public static final SubLObject current_process() {
    final SubLProcess result = SubLProcess.currentProcess();
    return (result == null) ? (SubLObject)NIL : result;
  }
  
  public static final SubLObject all_processes() {
    final SubLProcess[] processes = SubLProcess.currentProcesses();
    return SubLObjectFactory.makeList(processes);
  }
  
  private static SubLString SHOW_PROCESS_FORMAT_STRING;
  
  public static final SubLObject show_processes() {
    final SubLProcess[] processes = SubLProcess.currentProcesses();
    for (int i = 0; i < processes.length; i++) {
      final SubLProcess process = processes[i];
      final SubLObject[] args = {
        process_name(process),
        process_state(process),
        process_whostate(process)
      };
      PrintLow.format(T, SHOW_PROCESS_FORMAT_STRING, args);
    }
    return NIL;
  }
  
  public static final SubLObject sleep(SubLObject seconds) {
    long usecs = (long)(seconds.doubleValue() * 1000000.0);
    SubLProcess.currentProcess().sleepForMicroSeconds(usecs);
    return NIL;
  }
  
  /** returns true if interrupt flag was cleared without handling waiting interrupts */
  public static final boolean forciblyHandleInterrupts() {
    SubLProcess thisProcess = SubLProcess.currentProcess();
    if ((thisProcess != null) && (thisProcess.hasWatingInterrupts())) {
      Thread.currentThread().interrupted(); // clear interrupt flag
      return true;
    }
    return false;
  }
  
  public static final void possiblyHandleInterrupts(boolean shouldExpectInterruptFlag) {
    if (shouldExpectInterruptFlag && (!Thread.currentThread().isInterrupted())) {
      return;
    }
    SubLProcess thisProcess = SubLProcess.currentProcess();
    if (thisProcess != null) {
      SubLProcess.currentProcess().processInterrupts();
    }
  }

  public static final SubLObject interruptMainReadLoop() {
    SubLProcess process =  SubLMain.me.getMainReader().getThread().getSubLProcess();
    if (process == null) {
      return NIL;
    }
    process.addInterrupt(SubLProcess.READ_LOOP_INTERRUPT_THUNK);
    return NIL;
  }

  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "make_process",      "MAKE-PROCESS",      2, 0, false);
    SubLFiles.declareFunction(me, "process_block",     "PROCESS-BLOCK",     0, 0, false);
    SubLFiles.declareFunction(me, "process_yield",     "PROCESS-YIELD",     0, 0, false);
    SubLFiles.declareFunction(me, "process_unblock",   "PROCESS-UNBLOCK",   1, 0, false);
    SubLFiles.declareFunction(me, "process_wait",      "PROCESS-WAIT",      2, 0, false);
    SubLFiles.declareFunction(me, "process_wait_with_timeout", "PROCESS-WAIT-WITH-TIMEOUT", 3, 0, false);
    SubLFiles.declareFunction(me, "kill_process",      "KILL-PROCESS",      1, 0, false);
    SubLFiles.declareFunction(me, "interrupt_process", "INTERRUPT-PROCESS", 2, 0, false);
    SubLFiles.declareFunction(me, "debug_process",     "DEBUG-PROCESS",     0, 1, false);
    SubLFiles.declareFunction(me, "process_name",      "PROCESS-NAME",      1, 0, false);
    SubLFiles.declareFunction(me, "process_priority",  "PROCESS-PRIORITY",  1, 0, false);
    SubLFiles.declareFunction(me, "set_process_priority", "SET-PROCESS-PRIORITY", 1, 1, false);
    SubLFiles.declareFunction(me, "process_active_p",  "PROCESS-ACTIVE-P",  1, 0, false);
    SubLFiles.declareFunction(me, "process_state",     "PROCESS-STATE",     1, 0, false);
    SubLFiles.declareFunction(me, "valid_process_p",   "VALID-PROCESS-P",   1, 0, false);
    SubLFiles.declareFunction(me, "process_valid_p",   "PROCESS-VALID-P",   1, 0, false);
    SubLFiles.declareFunction(me, "process_whostate",  "PROCESS-WHOSTATE",  1, 0, false);
    SubLFiles.declareFunction(me, "current_process",   "CURRENT-PROCESS",   0, 0, false);
    SubLFiles.declareFunction(me, "all_processes",     "ALL-PROCESSES",     0, 0, false);
    SubLFiles.declareFunction(me, "show_processes",    "SHOW-PROCESSES",    0, 0, false);
    SubLFiles.declareFunction(me, "sleep",             "SLEEP",             1, 0, false);
    SubLFiles.declareFunction(me, "interruptMainReadLoop", "INTERRUPT-MAIN-READ-LOOP", 0, 0, false);
  }
  
  static {
    DEAD_STRING =        SubLObjectFactory.makeString("Dead");
    RUN_STRING =         SubLObjectFactory.makeString("Run");
    BLOCKED_STRING =     SubLObjectFactory.makeString("Blocked");
    INPUT_WAIT_STRING =  SubLObjectFactory.makeString("Input Wait");
    OUTPUT_WAIT_STRING = SubLObjectFactory.makeString("Output Wait");
    IO_WAIT_STRING =     SubLObjectFactory.makeString("I/O Wait");
    SLEEP_STRING =       SubLObjectFactory.makeString("Sleep");
    LOCK_STRING =        SubLObjectFactory.makeString("Lock wait");
    INITIALIZING_STRING = SubLObjectFactory.makeString("Initializing");
    UNSET_STRING =        SubLObjectFactory.makeString("<<whostate not set>>");
  }
  
  public void initializeVariables() {
    $process_min_priority$        = SubLFiles.defconstant(me, "*PROCESS-MIN-PRIORITY*",        ONE_INTEGER);
    $process_background_priority$ = SubLFiles.defconstant(me, "*PROCESS-BACKGROUND-PRIORITY*", THREE_INTEGER);
    $process_normal_priority$     = SubLFiles.defconstant(me, "*PROCESS-NORMAL-PRIORITY*",     FIVE_INTEGER);
    $process_critical_priority$   = SubLFiles.defconstant(me, "*PROCESS-CRITICAL-PRIORITY*",   SEVEN_INTEGER);
    $process_max_priority$        = SubLFiles.defconstant(me, "*PROCESS-MAX-PRIORITY*",        TEN_INTEGER);
    $is_thread_performing_cleanupP$ = SubLFiles.defparameter(me, "*IS-THREAD-PERFOMING-CLEANUP?*", NIL);
    
    
    $process_wait_sleep_time$ = SubLFiles.defvar(me, "*PROCESS_WAIT_SLEEP_TIME*", SubLObjectFactory.makeInteger(1000000L));
    
    SHOW_PROCESS_FORMAT_STRING = SubLObjectFactory.makeString("~A ~A ~A~%");
    
    INITIALIZING_SYM = SubLObjectFactory.makeSublispSymbol("INITIALIZING");
    RUN_SYM          = SubLObjectFactory.makeSublispSymbol("RUN");
    WAIT_SYM         = SubLObjectFactory.makeSublispSymbol("WAIT");
    DEAD_SYM         = SubLObjectFactory.makeSublispSymbol("DEAD");
    BLOCKED_SYM      = SubLObjectFactory.makeSublispSymbol("BLOCKED");
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}
