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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSemaphore;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public class Threads extends SubLTrampolineFile {

	//// Constructors

	public static SubLTrampolineFile me = new Threads();

	public static SubLSymbol $process_background_priority$;

	//// Public Area

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

	private static SubLString SHOW_PROCESS_FORMAT_STRING;

	static {
		Threads.DEAD_STRING = SubLObjectFactory.makeString("Dead");
		Threads.RUN_STRING = SubLObjectFactory.makeString("Run");
		Threads.BLOCKED_STRING = SubLObjectFactory.makeString("Blocked");
		Threads.INPUT_WAIT_STRING = SubLObjectFactory.makeString("Input Wait");
		Threads.OUTPUT_WAIT_STRING = SubLObjectFactory.makeString("Output Wait");
		Threads.IO_WAIT_STRING = SubLObjectFactory.makeString("I/O Wait");
		Threads.SLEEP_STRING = SubLObjectFactory.makeString("Sleep");
		Threads.LOCK_STRING = SubLObjectFactory.makeString("Lock wait");
		Threads.INITIALIZING_STRING = SubLObjectFactory.makeString("Initializing");
		Threads.UNSET_STRING = SubLObjectFactory.makeString("<<whostate not set>>");
	}

	public static SubLObject all_processes() {
		SubLProcess[] processes = SubLProcess.currentProcesses();
		return SubLObjectFactory.makeList(processes);
	}

	public static SubLObject current_process() {
		SubLProcess result = SubLProcess.currentProcess();
		return result == null ? (SubLObject) CommonSymbols.NIL : result;
	}

	public static SubLObject debug_process(SubLObject process) {
		Errors.unimplementedMethod("debug-process");
		return CommonSymbols.NIL;
	}

	/**
	 * returns true if interrupt flag was cleared without handling waiting
	 * interrupts
	 */
	public static boolean forciblyHandleInterrupts() {
		SubLProcess thisProcess = SubLProcess.currentProcess();
		if (thisProcess != null && thisProcess.hasWatingInterrupts()) {
			Thread.currentThread();
			Thread.interrupted(); // clear interrupt flag
			return true;
		}
		return false;
	}

	public static SubLObject interrupt_process(SubLObject process, SubLObject function) {
		if (process == SubLProcess.currentProcess())
			Functions.funcall(function);
		else
			process.toProcess().addInterrupt(function);
		return CommonSymbols.NIL;
	}

	public static SubLObject interruptMainReadLoop() {
		SubLProcess process = SubLMain.getMainReader().getThread().getSubLProcess();
		if (process == null)
			return CommonSymbols.NIL;
		process.addInterrupt(SubLProcess.READ_LOOP_INTERRUPT_THUNK);
		return CommonSymbols.NIL;
	}

	public static SubLObject kill_process(SubLObject process) {
		SubLProcess processVal = process.toProcess();
		processVal.waitUntilInitializationHasFinished();
		processVal.killProcess();
		return CommonSymbols.NIL;
	}

	public static SubLObject make_process(SubLObject name, SubLObject function) {
		return SubLObjectFactory.makeProcess(name.toStr(), function.getFunc());
	}

	public static void possiblyHandleInterrupts(boolean shouldExpectInterruptFlag) {
		if (shouldExpectInterruptFlag && !Thread.currentThread().isInterrupted())
			return;
		SubLProcess thisProcess = SubLProcess.currentProcess();
		if (thisProcess != null)
			SubLProcess.currentProcess().processInterrupts();
	}

	public static SubLObject process_active_p(SubLObject process) {
		if (process.toProcess().isActive())
			return CommonSymbols.T;
		return CommonSymbols.NIL;
	}

	public static SubLObject process_block() {
		SubLProcess process = SubLProcess.currentProcess();
		process.waitUntilInitializationHasFinished();
		process.block();
		return CommonSymbols.NIL;
	}

	public static SubLObject process_name(SubLObject process) {
		SubLProcess processVal = process.toProcess();
		processVal.waitUntilInitializationHasFinished();
		return processVal.getName();
	}

	public static SubLObject process_priority(SubLObject process) {
		SubLProcess processVal = process.toProcess();
		processVal.waitUntilInitializationHasFinished();
		return processVal.getPriority();
	}

	public static SubLObject process_state(SubLObject process) {
		return process.toProcess().getState().toSymbol();
	}

	public static SubLObject process_unblock(SubLObject process) {
		SubLProcess processVal = process.toProcess();
		processVal.waitUntilInitializationHasFinished();
		processVal.unblock();
		return CommonSymbols.NIL;
	}

	public static SubLObject process_valid_p(SubLObject process) {
		if (!process.isProcess())
			return CommonSymbols.NIL;
		return process.toProcess().getState() == SubLProcess.DEAD_STATE ? CommonSymbols.NIL : CommonSymbols.T;
	}

	public static SubLObject process_wait(SubLObject whostate, SubLObject predicate) {
		SubLProcess process = SubLProcess.currentProcess();
		process.waitUntilInitializationHasFinished();
		process.processWait(whostate, predicate, SubLProcess.NeverTimesOut.NO_TIMEOUT);
		return CommonSymbols.T;
	}

	public static SubLObject process_wait_with_timeout(SubLObject timeout, SubLObject whostate, SubLObject predicate) {
		if (timeout.numLE(CommonSymbols.ZERO_INTEGER))
			Errors.error("process-wait-with-timeout passed illegal timeout: " + timeout + ".");
		SubLProcess process = SubLProcess.currentProcess();
		process.waitUntilInitializationHasFinished();
		process.processWait(whostate, predicate, new SubLProcess.TimesOutAfter(timeout.toNumber()));
		return CommonSymbols.T;
	}

	public static SubLObject process_whostate(SubLObject process) {
		return process.toProcess().getWhoState();
	}

	public static SubLObject process_yield() {
		Thread.currentThread();
		Thread.yield();
		return CommonSymbols.NIL;
	}

	public static SubLObject set_process_priority(SubLObject process, SubLObject priority) {
		SubLProcess processVal = process.toProcess();
		processVal.waitUntilInitializationHasFinished();
		return processVal.setPriority(priority.toFixnum());
	}

	public static SubLObject show_processes() {
		SubLProcess[] processes = SubLProcess.currentProcesses();
		for (int i = 0; i < processes.length; i++) {
			SubLProcess process = processes[i];
			SubLObject[] args = { Threads.process_name(process), Threads.process_state(process),
					Threads.process_whostate(process) };
			PrintLow.format(CommonSymbols.T, Threads.SHOW_PROCESS_FORMAT_STRING, args);
		}
		return CommonSymbols.NIL;
	}

	public static SubLObject sleep(SubLObject seconds) {
		long usecs = (long) (seconds.doubleValue() * 1000000.0);
		SubLProcess.currentProcess().sleepForMicroSeconds(usecs);
		return CommonSymbols.NIL;
	}

	public static SubLObject valid_process_p(SubLObject process) {
		return Threads.process_valid_p(process);
	}

	//// Initializers

	/** Creates a new instance of Threads. */
	public Threads() {
	}

	public void declareFunctions() {
		SubLFiles.declareFunction(Threads.me, "make_process", "MAKE-PROCESS", 2, 0, false);
		SubLFiles.declareFunction(Threads.me, "process_block", "PROCESS-BLOCK", 0, 0, false);
		SubLFiles.declareFunction(Threads.me, "process_yield", "PROCESS-YIELD", 0, 0, false);
		SubLFiles.declareFunction(Threads.me, "process_unblock", "PROCESS-UNBLOCK", 1, 0, false);
		SubLFiles.declareFunction(Threads.me, "process_wait", "PROCESS-WAIT", 2, 0, false);
		SubLFiles.declareFunction(Threads.me, "process_wait_with_timeout", "PROCESS-WAIT-WITH-TIMEOUT", 3, 0, false);
		SubLFiles.declareFunction(Threads.me, "kill_process", "KILL-PROCESS", 1, 0, false);
		SubLFiles.declareFunction(Threads.me, "interrupt_process", "INTERRUPT-PROCESS", 2, 0, false);
		SubLFiles.declareFunction(Threads.me, "debug_process", "DEBUG-PROCESS", 0, 1, false);
		SubLFiles.declareFunction(Threads.me, "process_name", "PROCESS-NAME", 1, 0, false);
		SubLFiles.declareFunction(Threads.me, "process_priority", "PROCESS-PRIORITY", 1, 0, false);
		SubLFiles.declareFunction(Threads.me, "set_process_priority", "SET-PROCESS-PRIORITY", 1, 1, false);
		SubLFiles.declareFunction(Threads.me, "process_active_p", "PROCESS-ACTIVE-P", 1, 0, false);
		SubLFiles.declareFunction(Threads.me, "process_state", "PROCESS-STATE", 1, 0, false);
		SubLFiles.declareFunction(Threads.me, "valid_process_p", "VALID-PROCESS-P", 1, 0, false);
		SubLFiles.declareFunction(Threads.me, "process_valid_p", "PROCESS-VALID-P", 1, 0, false);
		SubLFiles.declareFunction(Threads.me, "process_whostate", "PROCESS-WHOSTATE", 1, 0, false);
		SubLFiles.declareFunction(Threads.me, "current_process", "CURRENT-PROCESS", 0, 0, false);
		SubLFiles.declareFunction(Threads.me, "all_processes", "ALL-PROCESSES", 0, 0, false);
		SubLFiles.declareFunction(Threads.me, "show_processes", "SHOW-PROCESSES", 0, 0, false);
		SubLFiles.declareFunction(Threads.me, "sleep", "SLEEP", 1, 0, false);
		SubLFiles.declareFunction(Threads.me, "interruptMainReadLoop", "INTERRUPT-MAIN-READ-LOOP", 0, 0, false);
	}

	public void initializeVariables() {
		Threads.$process_min_priority$ = SubLFiles.defconstant(Threads.me, "*PROCESS-MIN-PRIORITY*",
				CommonSymbols.ONE_INTEGER);
		Threads.$process_background_priority$ = SubLFiles.defconstant(Threads.me, "*PROCESS-BACKGROUND-PRIORITY*",
				CommonSymbols.THREE_INTEGER);
		Threads.$process_normal_priority$ = SubLFiles.defconstant(Threads.me, "*PROCESS-NORMAL-PRIORITY*",
				CommonSymbols.FIVE_INTEGER);
		Threads.$process_critical_priority$ = SubLFiles.defconstant(Threads.me, "*PROCESS-CRITICAL-PRIORITY*",
				CommonSymbols.SEVEN_INTEGER);
		Threads.$process_max_priority$ = SubLFiles.defconstant(Threads.me, "*PROCESS-MAX-PRIORITY*",
				CommonSymbols.TEN_INTEGER);
		Threads.$is_thread_performing_cleanupP$ = SubLFiles.defparameter(Threads.me, "*IS-THREAD-PERFOMING-CLEANUP?*",
				CommonSymbols.NIL);

		Threads.$process_wait_sleep_time$ = SubLFiles.defvar(Threads.me, "*PROCESS_WAIT_SLEEP_TIME*",
				SubLObjectFactory.makeInteger(1000000L));

		Threads.SHOW_PROCESS_FORMAT_STRING = SubLObjectFactory.makeString("~A ~A ~A~%");

		Threads.INITIALIZING_SYM = SubLObjectFactory.makeSublispSymbol("INITIALIZING");
		Threads.RUN_SYM = SubLObjectFactory.makeSublispSymbol("RUN");
		Threads.WAIT_SYM = SubLObjectFactory.makeSublispSymbol("WAIT");
		Threads.DEAD_SYM = SubLObjectFactory.makeSublispSymbol("DEAD");
		Threads.BLOCKED_SYM = SubLObjectFactory.makeSublispSymbol("BLOCKED");
	}

	public void runTopLevelForms() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

}
