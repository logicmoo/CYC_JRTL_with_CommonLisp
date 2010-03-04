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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ResumeException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.Unhandleable;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLErrorHistory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

//// Internal Imports

//// External Imports

public  final class Errors extends SubLTrampolineFile {
  
  //// Constructors
	
	private static Logger log = Logger.getLogger(Errors.class.getCanonicalName());
  /** Creates a new instance of Errors. */
  public Errors() {}
  public static final SubLFile me = new Errors();
  
  //// Public Area
  
  public static SubLSymbol $break_on_errorP$;
  public static SubLSymbol $continue_cerrorP$;
  public static SubLSymbol $error_abort_handler$;
  public static SubLSymbol $error_handler$;
  public static SubLSymbol $error_message$;
  public static SubLSymbol $ignore_breaksP$;
  public static SubLSymbol $ignore_mustsP$;
  public static SubLSymbol $ignore_warnsP$;
  public static SubLSymbol $suspend_type_checkingP$;
  public static SubLSymbol $restarts$;
  
  public static final SubLObject list_of_all_errors() {
    return SubLObjectFactory.makeList(SubLErrorHistory.me.getAllErrors());
  }

  public static final SubLObject clear_all_errors() {
    SubLErrorHistory.me.clearHistory();
    return NIL;
  }

  // helper for WITH-ERROR-HANDLER
  public static final SubLObject handleThrowable(Throwable t, SubLObject catchableThrowTarget) {
    if (t instanceof CatchableThrow) {
      return Dynamic.handleCatchableThrow((CatchableThrow)t, catchableThrowTarget);
    }
    if (t instanceof Error) {
      throw (Error)t;
    }
    if (!(t instanceof RuntimeException)) {
      // we should never get here
      assert(t instanceof RuntimeException);
      t = SubLObjectFactory.makeException((String)null, t);
    }
    try {
      error((RuntimeException)t);
    } catch (CatchableThrow ct) {
      return Dynamic.handleCatchableThrow(ct, catchableThrowTarget);
    }
    return NIL;
  }
  
  // helper for WITH-ERROR-HANDLER
  public static final void handleRuntimeException(RuntimeException rte) {
    error(rte);
  }
  
  public static final SubLObject warn(SubLObject formatString, SubLObject[] arguments) {
    if (NIL != Errors.$ignore_warnsP$.getDynamicValue()) {
      return NIL;
    }
    SubLObject warnString = PrintLow.format(NIL, formatString, arguments);
    SubLString warnStringTyped = (SubLString) warnString;
    showWarnMessage(warnStringTyped);
    return NIL;
  }
  
  
  public static final SubLObject handleMissingMethodError(String e) {
          log.severe(e);
          handleError(null, new Exception(e));
          return NIL;}
   public static final boolean boolHandleMissingMethodError(String e) {
          log.severe(e);
          handleError(null, new Exception(e));
          return false;}
  
  public static final SubLObject warn(SubLObject formatString) {
    if (NIL == Errors.$ignore_warnsP$.getDynamicValue()) {
      SubLObject warnString = PrintLow.format(NIL, formatString);
      SubLString warnStringTyped = (SubLString) warnString;
      showWarnMessage(warnStringTyped);
    }
    return NIL;
  }
  
  public static final SubLObject warn(String formatString) {
    return warn(SubLObjectFactory.makeString(formatString));
  }
  
  public static final SubLObject warn(SubLObject formatString, SubLObject arg1) {
    if (NIL == Errors.$ignore_warnsP$.getDynamicValue()) {
      SubLObject warnString = PrintLow.format(NIL, formatString, arg1);
      SubLString warnStringTyped = (SubLString) warnString;
      showWarnMessage(warnStringTyped);
    }
    return NIL;
  }
  
  public static final SubLObject warn(SubLObject formatString, SubLObject arg1, SubLObject arg2) {
    if (NIL == Errors.$ignore_warnsP$.getDynamicValue()) {
      SubLObject warnString = PrintLow.format(NIL, formatString, arg1, arg2);
      SubLString warnStringTyped = (SubLString) warnString;
      showWarnMessage(warnStringTyped);
    }
    return NIL;
  }
  
  public static final SubLObject warn(SubLObject formatString, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
    // @todo add PrintLow.format up to arg3
    SubLObject[] args = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      args = resourcer.acquireSubLObjectArray(3);
      args[0] = arg1;
      args[1] = arg2;
      args[2] = arg3;
      return warn(formatString, args);
    } finally {
      resourcer.releaseSubLObjectArray(args);
    }
  }

  public static final SubLObject error(String str) {
    error(str, null);
    throw SubLObjectFactory.makeException("Unexpected situation."); // this should never happen
  }

  public static final SubLObject error(Exception e) {
    error(e instanceof SubLException ? null : e.toString(), e);
    throw SubLObjectFactory.makeException("Unexpected situation."); // this should never happen
  }
  
  /** All calls to error should boil down to this one.
   *   Note: this method must guarantee to exit non-locally.
   * @todo merge this code with handleError();
   */
  public synchronized static final SubLObject error(String errorString, Throwable e) {
    if (e instanceof Error) {
      throw (Error)e;
    }
    if (e instanceof Unhandleable) {
      throw (Unhandleable)e;
    }
    errorString = possiblyCallErrorHandler(errorString, e);
    SubLException se = createErrorException(errorString, e);
    SubLErrorHistory.me.add(se);
    if (!isInitializedAndReaderThreadAndOriginalErrorStream()) {
      throw se;
    }
    SubLReader reader = getReaderForCurrentThread();
    RestartMethod restartMethod = reader.askRestartChoiceQuestion("Error: " + se.getMessage(),
        null, ERROR_RESTARTS, true, se);
    if (restartMethod.process(reader, se.getMessage(), se)) {
      return error(errorString, e);
    }
    throw new ResumeException();
  }

  private static final SubLException createErrorException(String errorString, Throwable e) {
    SubLException se;
    if ((e instanceof SubLException) && (errorString == null)) {
      se = (SubLException)e;
    } else {
      se = (e == null) ? SubLObjectFactory.makeException(errorString) :
        SubLObjectFactory.makeException(errorString + "\nBecause of nested exception: "
        + e.toString(), e);
    }
    return se;
  }

  public static final SubLObject error(SubLObject formatString, SubLObject[] arguments) {
    String errorString = PrintLow.format(NIL, formatString, arguments).getString();
    error(errorString, null);
    throw SubLObjectFactory.makeException("Unexpected situation."); // this should never happen
  }
  
  public static final SubLObject error(SubLObject formatString) {
    String errorString = PrintLow.format(NIL, formatString).getString();
    error(errorString, null);
    throw SubLObjectFactory.makeException("Unexpected situation."); // this should never happen
  }
  
  public static final SubLObject error(SubLObject formatString, Exception e) {
    String errorString = PrintLow.format(NIL, formatString).getString();
    error(errorString, e);
    throw SubLObjectFactory.makeException("Unexpected situation."); // this should never happen
  }
  
  public static final SubLObject error(SubLObject formatString, SubLObject arg1) {
    // @todo add PrintLow.format up to arg3
    SubLObject[] args = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      args = resourcer.acquireSubLObjectArray(1);
      args[0] = arg1;
      error(formatString, args);
      throw SubLObjectFactory.makeException("Unexpected situation."); // this should never happen
    } finally {
      resourcer.releaseSubLObjectArray(args);
    }
  }
  
  public static final SubLObject error(SubLObject formatString, SubLObject arg1, SubLObject arg2) {
    // @todo add PrintLow.format up to arg3
    SubLObject[] args = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      args = resourcer.acquireSubLObjectArray(2);
      args[0] = arg1;
      args[1] = arg2;
      error(formatString, args);
      throw SubLObjectFactory.makeException("Unexpected situation."); // this should never happen
    } finally {
      resourcer.releaseSubLObjectArray(args);
    }
  }
  
  public static final SubLObject error(SubLObject formatString, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
    // @todo add PrintLow.format up to arg3
    SubLObject[] args = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      args = resourcer.acquireSubLObjectArray(3);
      args[0] = arg1;
      args[1] = arg2;
      args[2] = arg3;
      error(formatString, args);
      throw SubLObjectFactory.makeException("Unexpected situation."); // this should never happen
    } finally {
      resourcer.releaseSubLObjectArray(args);
    }
  }
  
  public static final SubLObject unimplementedMethod(String methodName) {
    error("Unimplemented method : " + methodName + ".");
    throw SubLObjectFactory.makeException("Unexpected situation."); // this should never happen
  }
  
  public static final void handleError(Exception e) {
    handleError(null, e);
  }
  
  public static synchronized final void handleError(String description, Exception e) {
    if (e instanceof Unhandleable) {
      throw (Unhandleable)e;
    }
    if (!(e instanceof SubLException)) {
      e = SubLObjectFactory.makeException(((description == null) || ("".equals(description)))
          ? ((e instanceof SubLException) ? e.getMessage() : e.toString()) : description, e);
    }
    SubLException se = (SubLException)e;
    se.setDescription(description);
    SubLErrorHistory.me.add(se);
    if (!isInitializedAndReaderThreadAndOriginalErrorStream()) {
      handleErrorInternal(se);
      return;
    }
    SubLReader reader = getReaderForCurrentThread();
    RestartMethod restartMethod = reader.askRestartChoiceQuestion("Error: " + description,
        null, ERROR_RESTARTS, true, se);
    if (restartMethod.process(reader, description, se)) {
      handleError(description, e);
      return;
    }
  }

  private static final synchronized void handleErrorInternal(Throwable e) {
    if (e instanceof Error) {
      throw (Error)e;
    }
    if ((!SubLMain.isInitialized()) ||
        (CommonSymbols.SHOW_STACK_TRACES.getDynamicValue() != CommonSymbols.NIL)) {
      showErrorMessage(SubLException.getStringForException(e));
    } else {
      String message = e.getMessage() == null ?
        "RuntimeException of type " + e.getClass().getName() + " without much detail."
        : e.getMessage();
      showErrorMessage(message);
    }
  }
  
  public synchronized static final SubLObject sublisp_break(SubLObject format_string, SubLObject[] arguments) {
    if (!SubLMain.isInitialized()) {
      return NIL;
    }
    if (NIL != $ignore_breaksP$.getDynamicValue()) {
      return NIL;
    }
    String breakString = (format_string != UNPROVIDED) ? PrintLow.format(NIL, format_string, arguments).getString() : "";
    SubLReader reader = SubLMain.getMainReader();
    SubLOutputTextStream stream1 = StreamsLow.$error_output$.toOutputTextStream();
    SubLOutputTextStream stream2 = StreamsLow.originalErrorStream;
    if ((reader == null) || (!reader.isInReaderThread()) || (!stream1.equals(stream2))) {
      // @todo get rid of explicit references to "\n"
      String breakHeaderString = "\nBreakpoint reached from background thread or from REPL with *error-output* rebound: ";
      SubLOutputTextStream stream = StreamsLow.$error_output$.getStream(true).toOutputTextStream();
      stream.writeString(breakHeaderString);
      stream.writeString(breakString);
      stream.writeString("\n");
      return NIL;
    }
    RestartMethod restartMethod = reader.askRestartChoiceQuestion("Breakpoint reached: " + breakString,
        "Continue from break: ", ERROR_RESTARTS, true, SubLObjectFactory.makeException());
    if (restartMethod.process(reader, breakString, null)) {
      sublisp_break(format_string, arguments);
    } else {
      reader.writeResults("[ Continuing from break... ]");
    }
    return NIL;
  }
 
  public static final SubLObject sublisp_break(SubLObject format_string) {
    return sublisp_break(format_string, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
  }
  
  public static synchronized final SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject[] arguments) {
    // try to avoid infinite error loops when error occurs during bootstrapping
    if (!SubLMain.isInitialized()) {
      RuntimeException re = new RuntimeException();
      re.printStackTrace();
      throw re;
    }
    if (NIL != $continue_cerrorP$.getDynamicValue()) {
      return NIL;
    }
    String errorString = PrintLow.format(NIL, formatString, arguments).getString();
    errorString = possiblyCallErrorHandler(errorString, null);
    if (!isInitializedAndReaderThreadAndOriginalErrorStream()) {
      Errors.error(errorString);
    }
    SubLReader reader = getReaderForCurrentThread();
    String continueString = PrintLow.format(NIL, continue_string, arguments).getString();
    RestartMethod restartMethod = reader.askRestartChoiceQuestion("Correctable error: " + errorString,
        continueString, ERROR_RESTARTS, true, SubLObjectFactory.makeException());
    if (restartMethod.process(reader, errorString, null)) {
      return cerror(continue_string, formatString, arguments);
    } else {
      return NIL;
    }
  }

  private static String possiblyCallErrorHandler(String errorMessage, Throwable e) {
    if (errorMessage != null) {
      errorMessage = errorMessage.trim();
    }
    if ((errorMessage == null) || ("".equals(errorMessage))) {
      errorMessage = SubLException.getStringForException(e == null ? new Exception() : e);
    } else if (NIL != APPEND_STACK_TRACES_TO_ERROR_MESSAGES.getDynamicValue()) {
      errorMessage += "\n" + SubLException.getStringForException(e == null ? new Exception() : e);
    }
    SubLString errorStr = SubLObjectFactory.makeString(errorMessage);
    if (NIL != $break_on_errorP$.getDynamicValue()) {
      sublisp_break(errorStr);
    }
    SubLObject handler = $error_handler$.getDynamicValue();
    if (handler != NIL) {
      SubLObject oldValue = $error_message$.getDynamicValue();
      try {
        $error_message$.setDynamicValue(errorStr);
        Functions.funcall(handler);
      } finally {
        $error_message$.setDynamicValue(oldValue);
      }
      throw SubLObjectFactory.makeException(errorMessage); // @todo we should never get here, need to test handler compliance with
                                                           // this fact and issue warnings if we do
    }
    return errorMessage;
  }

  public static final SubLObject cerror(String continueStr, String errorStr, Throwable t) {
    if (t instanceof Error) {
      throw (Error)t;
    }
    if ((errorStr != null) && (!"".equals(errorStr))) {
      errorStr = errorStr + "\n" + SubLException.getStringForException(t);
    } else {
      errorStr = SubLException.getStringForException(t);
    }
    return cerror(SubLObjectFactory.makeString(continueStr), SubLObjectFactory.makeString(errorStr));
  }

  public static final SubLObject cerror(String continueString, String formatString) {
    return cerror(SubLObjectFactory.makeString(continueString), SubLObjectFactory.makeString(formatString));
  }
  
  public static final SubLObject cerror(SubLObject continue_string, SubLObject formatString) {
    return cerror(continue_string, formatString, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
  }
  
  public static final SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject arg1) {
    SubLObject[] args = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      args = resourcer.acquireSubLObjectArray(1);
      args[0] = arg1;
      return cerror(continue_string, formatString, args);
    } finally {
      resourcer.releaseSubLObjectArray(args);
    }
  }
  
  public static final SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject arg1, SubLObject arg2) {
    SubLObject[] args = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      args = resourcer.acquireSubLObjectArray(2);
      args[0] = arg1;
      args[1] = arg2;
      return cerror(continue_string, formatString, args);
    } finally {
      resourcer.releaseSubLObjectArray(args);
    }
  }
  
  public static final SubLObject cerror(SubLObject continue_string, SubLObject formatString, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
    SubLObject[] args = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      args = resourcer.acquireSubLObjectArray(3);
      args[0] = arg1;
      args[1] = arg2;
      args[2] = arg3;
      return cerror(continue_string, formatString, args);
    } finally {
      resourcer.releaseSubLObjectArray(args);
    }
  }
  
  public static final SubLObject debug() {
    return Errors.unimplementedMethod("Errors.debug()");
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "sublisp_break", "BREAK", 0, 1, true);
    SubLFiles.declareFunction(me, "cerror", "CERROR", 2, 0, true);
    SubLFiles.declareFunction(me, "debug", "DEBUG", 0, 0, false);
    SubLFiles.declareFunction(me, "error",  "ERROR",   1, 0, true);
    SubLFiles.declareFunction(me, "warn",   "WARN",    1, 0, true);
    SubLFiles.declareFunction(me, "list_of_all_errors",  "LIST-OF-ALL-ERRORS",   0, 0, false);
    SubLFiles.declareFunction(me, "clear_all_errors",  "CLEAR-ALL-ERRORS",   0, 0, false);
  }
  
  public void initializeVariables() {
    $suspend_type_checkingP$ = SubLFiles.defvar(me, "*SUSPEND-TYPE-CHECKING?*", NIL);
    $break_on_errorP$        = SubLFiles.defvar(me, "*BREAK-ON-ERROR?*",     NIL);
    $continue_cerrorP$       = SubLFiles.defvar(me, "*CONTINUE-CERROR?*",    NIL);
    $error_abort_handler$    = SubLFiles.defvar(me, "*ERROR-ABORT-HANDLER*", NIL);
    $error_handler$          = SubLFiles.defvar(me, "*ERROR-HANDLER*",       NIL);
    $error_message$          = SubLFiles.defvar(me, "*ERROR-MESSAGE*",       NIL);
    $ignore_breaksP$         = SubLFiles.defvar(me, "*IGNORE-BREAKS?*",      NIL);
    $ignore_mustsP$          = SubLFiles.defvar(me, "*IGNORE-MUSTS?*",       NIL);
    $ignore_warnsP$          = SubLFiles.defvar(me, "*IGNORE-WARNS?*",       NIL);
    $restarts$               = SubLFiles.defvar(me, "*RESTARTS*",            NIL);
    SubLFiles.defvar(me, SHOW_STACK_TRACES.getName(), T);
    SubLFiles.defvar(me, APPEND_STACK_TRACES_TO_ERROR_MESSAGES.getName(), NIL);
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area

  private static final void showWarnMessage(String str) {
    showMessageOnErrorStream("Warning: ");
    showMessageOnErrorStream(SubLObjectFactory.makeString(str));
    showMessageOnErrorStream("\n"); // @hack
  }
  
  private static final void showWarnMessage(SubLString str) {
    showMessageOnErrorStream("Warning: ");
    showMessageOnErrorStream(str);
    showMessageOnErrorStream("\n"); // @hack
  }

  private static final void showErrorMessage(String str) {
    showMessageOnErrorStream("Error: ");
    showMessageOnErrorStream(SubLObjectFactory.makeString(str));
    showMessageOnErrorStream("\n"); // @hack
  }
  
  private static final void showErrorMessage(SubLString str) {
    showMessageOnErrorStream("Error: ");
    showMessageOnErrorStream(str);
    showMessageOnErrorStream("\n"); // @hack
  }

  public static final void showMessageOnErrorStream(String str) {
    showMessageOnErrorStream(SubLObjectFactory.makeString(str));
  }

  public static final void showMessageOnErrorStream(SubLString str) {
    try {
      PrintLow.format(StreamsLow.$error_output$.toOutputTextStream(), str);
      streams_high.force_output(StreamsLow.$error_output$.toOutputTextStream());
    } catch(RuntimeException e) {
      if (SHOW_WARNING_STACK_TRACES) {
        System.err.println(SubLObjectFactory.makeException(str).toDetailedString());
      } else {
        System.err.println(str);
      }
      throw e;
    }
  }
  
  private static SubLReader getReaderForCurrentThread() {
    // @todo this will need fixing when we support multiple readers
    SubLReader reader = SubLMain.getMainReader();
    if ((reader == null) || (!reader.isInReaderThread())) {
      return null;
    }
    return reader;
  }

  private static boolean isInitializedAndReaderThreadAndOriginalErrorStream() {
    SubLReader reader = getReaderForCurrentThread();
    SubLOutputTextStream stream1 = StreamsLow.$error_output$.toOutputTextStream();
    SubLOutputTextStream stream2 = StreamsLow.originalErrorStream;
    if ((!SubLMain.isInitialized()) || (reader == null) || (!stream1.equals(stream2))) {
      return false;
    }
    return true;
  }
  
  //// Internal Rep

  public interface RestartMethod {
    // returns true if should loop-back, false if should continue.
    public boolean process(SubLReader reader, String message, SubLException se);
  }

  public static class Restarter {
    public Restarter(String choice, RestartMethod restartMethod) {
      this.choice = choice;
      this.restartMethod = restartMethod;
    }
    public RestartMethod getRestartMethod() { return restartMethod; }
    public String toString() { return choice; }
    private String choice;
    private RestartMethod restartMethod;
  }

  private static final List<Restarter> ERROR_RESTARTS = new ArrayList<Restarter>(3);

  static {
    ERROR_RESTARTS.add(new Restarter("Show stack trace.",  new RestartMethod() {
      public boolean process(SubLReader reader, String message, SubLException se) {
        if (se == null) {
          reader.showStackTrace(new Exception());
        } else {
          reader.showStackTrace(se);
        }
        return true;
      }
    }));
    ERROR_RESTARTS.add(new Restarter("Return to top level read loop.", new RestartMethod() {
      public boolean process(SubLReader reader, String message, SubLException se) {
        throw new ResumeException(message);
      }
    }));
    ERROR_RESTARTS.add(new Restarter("Rethrow error.", new RestartMethod() {
      public boolean process(SubLReader reader, String message, SubLException se) {
        throw se;
      }
    }));
    // @todo implement me!!!!!!!!!!!!!!!!!!!!!
    /*
    ERROR_RESTARTS.add(new Restarter("Recursive read loop.", new RestartMethod() {
      public boolean process(SubLReader reader, String message) {
        Errors.unimplementedMethod("Recursive Read Loop");
        return false;
      }
    }));
    */
    ERROR_RESTARTS.add(new Restarter("Exit program.", new RestartMethod() {
      public boolean process(SubLReader reader, String message, SubLException se) { // quit
        SubLMain.me.doSystemCleanupAndExit(-1);
        return false;
      }
    }));
  }
  
  private static final boolean SHOW_WARNING_STACK_TRACES = false;
  
  //// Main
  
}
