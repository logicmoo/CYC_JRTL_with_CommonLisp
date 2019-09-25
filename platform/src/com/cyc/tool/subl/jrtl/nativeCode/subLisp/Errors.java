/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.armedbear.lisp.ControlTransfer;
import org.armedbear.lisp.JavaException;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispError;
import org.armedbear.lisp.Main;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.Startup;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ResumeException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.Unhandleable;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLErrorHistory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLReader.*;

public class Errors extends SubLSystemTrampolineFile {

	final static SubLNil NIL = SubLNil.NIL;
	final static public PrintStream trout = SystemCurrent.out;

	public static class Restarter {
		public Restarter(String choice, RestartMethod restartMethod) {
			this.choice = choice;
			this.restartMethod = restartMethod;
		}

		private String choice;
		private RestartMethod restartMethod;

		public RestartMethod getRestartMethod() {
			return restartMethod;
		}

		@Override
		public String toString() {
			return choice;
		}
	}

	public interface RestartMethod {
		boolean process(SubLReader p0, String p1, SubLException p2);
	}

	private static SubLException createErrorException(String errorString, Throwable e) {
		SubLException se;
		if (e instanceof SubLException && errorString == null)
			se = (SubLException) e;
		else
			se = e == null ? SubLObjectFactory.makeException(errorString) : SubLObjectFactory.makeException(errorString + "\nBecause of nested exception: " + e.toString(), e);
		return se;
	}

	private static void handleErrorInternal(Throwable e) {
		synchronized (Errors.handleErrorInternalLock) {
			if (e instanceof Error)
				throw (Error) e;
			if (!SubLMain.isInitialized() || CommonSymbols.APPEND_STACK_TRACES_TO_ERROR_MESSAGES.getDynamicValue() != NIL)
				showErrorMessage(SubLException.getStringForException(e));
			else {
				String message = e.getMessage() == null ? "RuntimeException of type " + e.getClass().getName() + " without much detail." : e.getMessage();
				showErrorMessage(message);
			}
		}
	}

	private static boolean isInitializedAndReaderThreadAndOriginalErrorStream() {
		SubLReader reader = SubLReader.getReaderForCurrentThread();
		if (reader == null)
			return false;
		SubLOutputTextStream stream1 = StreamsLow.$error_output$.getDynamicValue().toOutputTextStream();
		SubLOutputTextStream stream2 = StreamsLow.originalErrorStream;
		return SubLMain.isInitialized() && reader != null && stream1.lispEquals(stream2);
	}

	private static String possiblyCallErrorHandler(String errorMessage, Throwable e) {
		if (errorMessage != null)
			errorMessage = errorMessage.trim();
		if (errorMessage == null || "".equals(errorMessage))
			errorMessage = SubLException.getStringForException(e == null ? new Exception("possiblyCallErrorHandler") : e);
		else if (NIL != CommonSymbols.APPEND_STACK_TRACES_TO_ERROR_MESSAGES.getDynamicValue())
			errorMessage = errorMessage + "\n" + SubLException.getStringForException(e == null ? new Exception() : e);
		SubLString errorStr = SubLObjectFactory.makeString(errorMessage);
		if (NIL != Errors.$break_on_errorP$.getDynamicValue())
			sublisp_break(errorStr);
		SubLObject handler = Errors.$error_handler$.getDynamicValue();
		if (!(SubLMain.BOOTY_HACKZ)) {
			if (handler != NIL) {
				SubLObject oldValue = Errors.$error_message$.getDynamicValue();
				try {
					Errors.$error_message$.setDynamicValue(errorStr);
					Functions.funcall(handler);
				} finally {
					Errors.$error_message$.setDynamicValue(oldValue);
				}
				if ("no longer valid".equals(errorMessage))
					return null;
				throw SubLObjectFactory.makeException(errorMessage);
			}
		}
		if (handler != NIL) {
			SubLObject oldValue = Errors.$error_message$.getDynamicValue();
			try {
				Errors.$error_message$.setDynamicValue(errorStr);
				Functions.funcall(handler);
			} finally {
				Errors.$error_message$.setDynamicValue(oldValue);
			}
			if ("no longer valid".equals(errorMessage))
				return null;
			throw SubLObjectFactory.makeException(errorMessage);
		}
		return errorMessage;
	}

	private static void showErrorMessage(String str) {
		showMessageOnErrorStream("Error: ");
		showMessageOnErrorStream((str));
		showMessageOnErrorStream("\n");
	}

	private static void showErrorMessage(SubLString str) {
		showMessageOnErrorStream("Error: ");
		showMessageOnErrorStream(str);
		showMessageOnErrorStream("\n");
	}

	private static void showWarnMessage(String str) {
		showMessageOnErrorStream("Warning: ");
		showMessageOnErrorStream((str));
		showMessageOnErrorStream("\n");
	}

	private static void showWarnMessage(SubLString str) {
		showMessageOnErrorStream("Warning: ");
		showMessageOnErrorStream(str);
		showMessageOnErrorStream("\n");
	}

	public static SubLObject cerror(String continueString, String formatString) {
		return cerrorVA(SubLObjectFactory.makeString(continueString), SubLObjectFactory.makeString(formatString));
	}

	public static SubLObject cerror(String continueStr, String errorStr, Throwable t) {
		if (t instanceof Error)
			throw (Error) t;
		if (errorStr != null && !"".equals(errorStr))
			errorStr = errorStr + "\n" + SubLException.getStringForException(t);
		else
			errorStr = SubLException.getStringForException(t);
		return cerrorVA(SubLObjectFactory.makeString(continueStr), SubLObjectFactory.makeString(errorStr));
	}

	public static SubLObject cerror(SubLObject continue_string, SubLObject formatString) {
		return cerrorVA(continue_string, formatString, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject arg1) {
		return cerrorVA(continue_string, formatString, arg1);
	}

	public static SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject arg1, SubLObject arg2) {
		return cerrorVA(continue_string, formatString, arg1, arg2);
	}

	public static SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		return cerrorVA(continue_string, formatString, arg1, arg2, arg3);
	}

	public static SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject[] arguments) {
		return cerrorVA(continue_string, formatString, arguments);
	}

	public static SubLObject cerrorVA(SubLObject continue_string, SubLObject formatString, SubLObject... arguments) {
		synchronized (Errors.cerrorLock) {
			if (!SubLMain.isInitialized()) {
				RuntimeException re = new RuntimeException(formatString.princToString());
				re.printStackTrace();
				if (false)
					throw re;
			}
			if (NIL != Errors.$continue_cerrorP$.getDynamicValue())
				return NIL;
			String errorString = PrintLow.format(NIL, formatString, arguments).getStringValue();
			errorString = possiblyCallErrorHandler(errorString, null);
			if (!isInitializedAndReaderThreadAndOriginalErrorStream()) {
				error(errorString);
			}
			SubLReader reader = getReaderForCurrentThread();
			if (reader == null) {
				Startup.bp();
				reader = ensureReaderForCurrentThread();
			}
			String continueString = PrintLow.format(NIL, continue_string, arguments).getStringValue();
			RestartMethod restartMethod = reader.askRestartChoiceQuestion("Continuable error: " + errorString, continueString, Errors.ERROR_RESTARTS, true, SubLObjectFactory.makeException());
			if (restartMethod.process(reader, errorString, null))
				return cerror(continue_string, formatString, arguments);
			return NIL;
		}
	}

	public static SubLObject clear_all_errors() {
		SubLErrorHistory.me.clearHistory();
		return NIL;
	}

	public static SubLObject debug() {
		Thread.dumpStack();
		warn("Debug");
		return NIL;
		// return unimplementedMethod("Errors.debug()");
	}

	public static SubLObject error(Exception e) {
		error(e instanceof SubLException ? null : e.toString(), e);
		throw SubLObjectFactory.makeException("Unexpected situation.");
	}

	public static SubLObject error(String str) {
		if (!SubLMain.commonSymbolsOK) {
			return Lisp.program_error(str);
		}
		if (CommonSymbols.FORCE_ERROR_MESSAGE_OUTPUT.boundp())
			error(str, null);
		throw SubLObjectFactory.makeException("Unexpected situation: " + str);
	}

	public static SubLObject error(String errorString, Throwable e) {
		if (e instanceof ControlTransfer) {
			throw (ControlTransfer) e;
		}
		if (e instanceof java.lang.reflect.InvocationTargetException) {
			Throwable e2 = ((java.lang.reflect.InvocationTargetException) e).getTargetException();
			if (e2 != null) {
				return error(errorString, e2);
			}
		}
		final boolean isSubLisp = Main.isSubLisp();
		if (!isSubLisp) {
			if (e == null)
				return Lisp.error(new LispError(errorString));
			return Lisp.error(new JavaException(e));
		}
		if (NIL != CommonSymbols.FORCE_ERROR_MESSAGE_OUTPUT.getDynamicValue()) {
			if (e != null) {
				e.printStackTrace();
				System.err.println(errorString);
				System.err.flush();
			} else {
				new Exception(errorString).printStackTrace();
				System.err.flush();
			}
		}
		if (e instanceof Unhandleable)
			throw (Unhandleable) e;
		if (e instanceof Error)
			throw (Error) e;
		errorString = possiblyCallErrorHandler(errorString, e);
		SubLException se = createErrorException(errorString, e);
		SubLErrorHistory.me.add(se);
		final boolean noDebug = Main.isNoDebug();
		if (noDebug) {
			throw se;
		}
		if (SubLMain.isInitialized()) {
			final boolean initializedAndReaderThreadAndOriginalErrorStream = isInitializedAndReaderThreadAndOriginalErrorStream();
			if (!initializedAndReaderThreadAndOriginalErrorStream)
				throw se;
		}
		SubLReader reader = getReaderForCurrentThread();
		if (reader == null) {
			reader = ensureReaderForCurrentThread();
		}
		RestartMethod restartMethod = null;
		if (!reader.isInReaderThread()) {
			if (!SubLMain.isInitialized()) {
				Startup.bp();
				throw new ResumeException();
			}
			restartMethod = SubLReader.CONTINUE_RESTART_METHOD;
		} else {
			restartMethod = reader.askRestartChoiceQuestion("Error: " + se.getMessage(), null, Errors.ERROR_RESTARTS, true, se);
		}
		if (restartMethod.process(reader, se.getMessage(), se))
			return error(errorString, e);
		throw new ResumeException();
	}

	public static SubLObject error(SubLObject formatString) {
		String errorString = PrintLow.format(NIL, formatString).getStringValue();
		if (errorString != null) {
			if (errorString.contains("no longer valid"))
				return NIL;
			if (errorString.contains("Key has not"))
				return NIL;
		}
		error(errorString, null);
		throw SubLObjectFactory.makeException("Unexpected situation.");
	}

	public static SubLObject error(SubLObject formatString, Exception e) {
		String errorString = PrintLow.format(NIL, formatString).getStringValue();
		error(errorString, e);
		throw SubLObjectFactory.makeException("Unexpected situation.");
	}

	public static SubLObject error(SubLObject formatString, Throwable e) {
		String errorString = PrintLow.format(NIL, formatString).getStringValue();
		error(errorString, e);
		throw SubLObjectFactory.makeException("Unexpected situation.");
	}

	public static SubLObject error(SubLObject formatString, SubLObject arg1) {
		return errorVA(formatString, arg1);
	}

	public static SubLObject error(SubLObject formatString, SubLObject arg1, SubLObject arg2) {
		return errorVA(formatString, arg1, arg2);
	}

	public static SubLObject error(SubLObject formatString, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		return errorVA(formatString, arg1, arg2, arg3);
	}

	public static SubLObject error(SubLObject formatString, SubLObject[] arguments) {
		return errorVA(formatString, arguments);
	}

	public static SubLObject errorVA(SubLObject formatString, SubLObject... arguments) {
		String errorString = PrintLow.format(NIL, formatString, arguments).getStringValue();
		error(errorString, null);
		throw SubLObjectFactory.makeException("Unexpected situation: " + errorString);
	}

	public static SubLObject forceWarn(String formatString) {
		SubLObject oldVal = Errors.$ignore_warnsP$.getDynamicValue();
		try {
			Errors.$ignore_warnsP$.setDynamicValue(NIL);
			return warn(SubLObjectFactory.makeString(formatString));
		} finally {
			Errors.$ignore_warnsP$.setDynamicValue(oldVal);
		}
	}

	public static void handleError(Exception e) {
		handleError(null, e);
	}

	public static void handleError(Throwable e) {
		handleError(null, e);
	}

	public static void handleError(String description, Throwable e) {
		if (e instanceof NullPointerException) {
			e.printStackTrace();
		}
		if (e instanceof java.lang.reflect.InvocationTargetException) {
			Throwable e2 = ((java.lang.reflect.InvocationTargetException) e).getTargetException();
			if (e2 != null) {
				handleError(description, e2);
				return;
			}
		}
		if (e instanceof ControlTransfer) {
			throw (ControlTransfer) e;
		}
		if (e instanceof Error) {
			e.printStackTrace();
		}
		synchronized (Errors.handleErrorLock) {
			if (e instanceof Unhandleable)
				throw (Unhandleable) e;
			if (!(e instanceof SubLException))
				e = SubLObjectFactory.makeException(description == null || "".equals(description) ? e instanceof SubLException ? e.getMessage() : e.toString() : description, e);
			SubLException se = (SubLException) e;
			se.setDescription(description);
			SubLErrorHistory.me.add(se);
			if (!isInitializedAndReaderThreadAndOriginalErrorStream()) {
				handleErrorInternal(se);
				return;
			}
			SubLReader reader = ensureReaderForCurrentThread();
			RestartMethod restartMethod = reader.askRestartChoiceQuestion("Error: " + description, null, Errors.ERROR_RESTARTS, true, se);
			if (restartMethod.process(reader, description, se))
				handleError(description, e);
		}
	}

	public static void handleRuntimeException(RuntimeException rte) {
		error(rte);
	}

	// helper for WITH-ERROR-HANDLER
	public static SubLObject handleThrowable(Throwable t, SubLObject catchableThrowTarget) {
		if (t instanceof CatchableThrow)
			return Dynamic.handleCatchableThrow((CatchableThrow) t, catchableThrowTarget);
		if (t instanceof Error)
			throw (Error) t;
		if (!(t instanceof RuntimeException)) {
			// we should never get here
			assert t instanceof RuntimeException;
			t = SubLObjectFactory.makeException((String) null, t);
		}
		try {
			error((Exception) t);
		} catch (CatchableThrow ct) {
			return Dynamic.handleCatchableThrow(ct, catchableThrowTarget);
		}
		return NIL;
	}

	public static SubLObject list_of_all_errors() {
		return SubLObjectFactory.makeList(SubLErrorHistory.me.getAllErrors());
	}

	public static void showMessageOnErrorStream(SubLString str) {
		if (str != null)
			showMessageOnErrorStream(str.getStringValue());
	}

	public static void showMessageOnErrorStream(String str) {
		if (!isReady) {
			System.err.print(str);
			System.err.flush();
			return;
		}
		try {
			if (str != null) {
				final SubLOutputTextStream outputTextStream = StreamsLow.$error_output$.getDynamicValue().toOutputTextStream();
				outputTextStream.writeString(str);
				streams_high.force_output(outputTextStream);
			}
		} catch (RuntimeException e) {
			System.err.println(str);
			throw e;
		}
	}

	public static SubLObject sublisp_break(SubLObject format_string) {
		return sublisp_break(format_string, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLObject sublisp_break(SubLObject format_string, SubLObject[] arguments) {
		synchronized (Errors.breakLock) {
			if (!SubLMain.isInitialized())
				return NIL;
			if (NIL != Errors.$ignore_breaksP$.getDynamicValue())
				return NIL;
			String breakString = format_string != UNPROVIDED ? PrintLow.format(NIL, format_string, arguments).getStringValue() : "";
			SubLReader reader = SubLMain.getMainReader();
			SubLOutputTextStream stream1 = StreamsLow.$error_output$.getDynamicValue().toOutputTextStream();
			SubLOutputTextStream stream2 = StreamsLow.originalErrorStream;
			if (reader == null || !reader.isInReaderThread() || !stream1.lispEquals(stream2)) {
				String breakHeaderString = "\nBreakpoint reached from background thread or from REPL with *error-output* rebound: ";
				SubLOutputTextStream stream3 = StreamsLow.$error_output$.getDynamicValue().getStream(true).toOutputTextStream();
				stream3.writeString(breakHeaderString);
				stream3.writeString(breakString);
				stream3.writeString("\n");
				return NIL;
			}
			RestartMethod restartMethod = reader.askRestartChoiceQuestion("Breakpoint reached: " + breakString, "Continue from break: ", Errors.ERROR_RESTARTS, true, SubLObjectFactory.makeException());
			if (restartMethod.process(reader, breakString, null))
				sublisp_break(format_string, arguments);
			else
				reader.writeResults("[ Continuing from break... ]");
			return NIL;
		}
	}

	public static SubLObject unimplementedMethod(String methodName) {
		if (Main.isNoDebug())
			throw new SubLException(methodName);
		error("Unimplemented method : " + methodName + ".");
		throw SubLObjectFactory.makeException("Unexpected situation.");
	}

	public static SubLObject warn(String formatString) {
		if (!isReady) {
			System.err.println("Warn: " + formatString);
			return Lisp.T;
		}
		return warn(SubLObjectFactory.makeString(formatString));
	}

	public static SubLObject warn(SubLObject formatString) {
		if (NIL != Errors.$ignore_warnsP$.getDynamicValue())
			return NIL;
		if (NIL != Errors.$break_on_warnP$.getDynamicValue())
			return sublisp_break(formatString);
		try {
			SubLObject warnString = PrintLow.format(NIL, formatString);
			SubLString warnStringTyped = (SubLString) warnString;
			showWarnMessage(warnStringTyped);
		} catch (Throwable e) {
			// TODO: handle exception
		}
		return NIL;
	}

	public static SubLObject warn(SubLObject formatString, SubLObject arg1) {
		return warnVA(formatString, arg1);
	}

	public static SubLObject warn(SubLObject formatString, SubLObject arg1, SubLObject arg2) {
		return warnVA(formatString, arg1, arg2);
	}

	public static SubLObject warn(SubLObject formatString, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		return warnVA(formatString, arg1, arg2, arg3);
	}

	public static SubLObject warn(SubLObject formatString, SubLObject[] arguments) {
		return warnVA(formatString, arguments);
	}

	public static SubLObject warnVA(SubLObject formatString, SubLObject... arguments) {
		if (NIL != Errors.$ignore_warnsP$.getDynamicValue())
			return NIL;
		if (NIL != Errors.$break_on_warnP$.getDynamicValue())
			return sublisp_break(formatString, arguments);
		SubLObject warnString = PrintLow.format(NIL, formatString, arguments);
		SubLString warnStringTyped = (SubLString) warnString;
		showWarnMessage(warnStringTyped);
		return NIL;
	}

	public static SubLFile me;
	public static SubLSymbol $break_on_errorP$;
	public static SubLSymbol $break_on_warnP$;
	public static SubLSymbol $continue_cerrorP$;
	public static SubLSymbol $error_abort_handler$;
	public static SubLSymbol $error_handler$;
	public static SubLSymbol $error_message$;
	public static SubLSymbol $ignore_breaksP$;
	public static SubLSymbol $ignore_mustsP$;
	public static SubLSymbol $ignore_warnsP$;
	public static SubLSymbol $suspend_type_checkingP$;
	public static SubLSymbol $restarts$;
	public static SubLSymbol $append_stack_traces_to_error_messagesP$;
	public static SubLSymbol $force_error_message_outputP$;
	public static boolean DEBUG_MODE = true;
	public static Object errorLock;
	public static Object handleErrorLock;
	public static Object handleErrorInternalLock;
	public static Object breakLock;
	public static Object cerrorLock;
	private static List<Restarter> ERROR_RESTARTS;
	private static boolean SHOW_WARNING_STACK_TRACES = false;
	public static boolean isReady;
	static {
		me = new Errors();
		errorLock = new Object();
		handleErrorLock = new Object();
		handleErrorInternalLock = new Object();
		breakLock = new Object();
		cerrorLock = new Object();
		(ERROR_RESTARTS = new ArrayList<Restarter>(3)).add(new Restarter("Show stack trace.", new RestartMethod() {
			@Override
			public boolean process(SubLReader reader, String message, SubLException se) {
				if (se == null)
					reader.showStackTrace(new Exception());
				else
					reader.showStackTrace(se);
				return true;
			}
		}));
		Errors.ERROR_RESTARTS.add(new Restarter("Return to top level read loop.", new RestartMethod() {
			@Override
			public boolean process(SubLReader reader, String message, SubLException se) {
				throw new ResumeException(message);
			}
		}));
		Errors.ERROR_RESTARTS.add(new Restarter("Rethrow error.", new RestartMethod() {
			@Override
			public boolean process(SubLReader reader, String message, SubLException se) {
				throw se;
			}
		}));
		Errors.ERROR_RESTARTS.add(new Restarter("Exit program.", new RestartMethod() {
			@Override
			public boolean process(SubLReader reader, String message, SubLException se) {
				SubLMain.me.doSystemCleanupAndExit(-1);
				return false;
			}
		}));
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Errors.me, "sublisp_break", "BREAK", 0, 1, true);
		SubLFiles.declareFunction(Errors.me, "cerror", "CERROR", 2, 0, true);
		SubLFiles.declareFunction(Errors.me, "debug", "DEBUG", 0, 0, false);
		SubLFiles.declareFunction(Errors.me, "error", "ERROR", 1, 0, true);
		SubLFiles.declareFunction(Errors.me, "warn", "WARN", 1, 0, true);
		SubLFiles.declareFunction(Errors.me, "list_of_all_errors", "LIST-OF-ALL-ERRORS", 0, 0, false);
		SubLFiles.declareFunction(Errors.me, "clear_all_errors", "CLEAR-ALL-ERRORS", 0, 0, false);
	}

	@Override
	public void initializeVariables() {
		Errors.$suspend_type_checkingP$ = SubLFiles.defvar(Errors.me, "*SUSPEND-TYPE-CHECKING?*", NIL);
		Errors.$break_on_errorP$ = SubLFiles.defvar(Errors.me, "*BREAK-ON-ERROR?*", NIL);
		Errors.$break_on_warnP$ = SubLFiles.defvar(Errors.me, "*BREAK-ON-WARN?*", NIL);
		Errors.$continue_cerrorP$ = SubLFiles.defvar(Errors.me, "*CONTINUE-CERROR?*", NIL);
		Errors.$error_abort_handler$ = SubLFiles.defvar(Errors.me, "*ERROR-ABORT-HANDLER*", NIL);
		Errors.$error_handler$ = SubLFiles.defvar(Errors.me, "*ERROR-HANDLER*", NIL);
		Errors.$error_message$ = SubLFiles.defvar(Errors.me, "*ERROR-MESSAGE*", NIL);
		Errors.$ignore_breaksP$ = SubLFiles.defvar(Errors.me, "*IGNORE-BREAKS?*", NIL);
		Errors.$ignore_mustsP$ = SubLFiles.defvar(Errors.me, "*IGNORE-MUSTS?*", NIL);
		Errors.$ignore_warnsP$ = SubLFiles.defvar(Errors.me, "*IGNORE-WARNS?*", NIL);
		Errors.$restarts$ = SubLFiles.defvar(Errors.me, "*RESTARTS*", NIL);
		Errors.$append_stack_traces_to_error_messagesP$ = SubLFiles.defvar(Errors.me, CommonSymbols.APPEND_STACK_TRACES_TO_ERROR_MESSAGES.getName(), CommonSymbols.T);
		Errors.$force_error_message_outputP$ = SubLFiles.defvar(Errors.me, CommonSymbols.FORCE_ERROR_MESSAGE_OUTPUT.getName(), NIL);
	}

	@Override
	public void runTopLevelForms() {
	}

	/**
	 * @param string
	 */
	public static SubLObject handleMissingMethodError(String string) {
		// TODO Auto-generated method stub
		return Errors.unimplementedMethod("Auto-generated method stub:  Errors.handleMissingMethodError " + string);
	}
}
