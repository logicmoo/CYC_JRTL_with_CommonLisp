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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//// Internal Imports

//// External Imports

public  class Processes extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Environment. */
  private Processes() {}
  public static final SubLTrampolineFile me = new Processes();
  
  //// Public Area
  
  public static final SubLObject exit(SubLObject code) {
    if ((code == UNPROVIDED)) {
      code = ZERO_INTEGER;
    }
    SubLInteger codeTyped = code.toInteger();
    SubLMain.me.doSystemCleanupAndExit(codeTyped.intValue());
    return NIL;
  }
  
  public static final SubLObject fork_process(SubLObject function, SubLObject callback, SubLObject output_file) {
    return Errors.error("The function 'fork-process' is not supported.");
  }
  
  public static final SubLObject restart_process(SubLObject world_spec, SubLObject init_file_pathname, SubLObject init_form_spec) {
    return Errors.error("The function 'restart-process' is not supported.");
  }

  public static final SubLObject external_processes_supportedP() {
    return T;
  }
  
  public static final SubLObject kill_external_process(SubLObject procId) {
    ExternalProcessHandler procHandler = getExternalProcessHandlerForId(procId);
    try {
      if (procHandler.isDestroyed) {
        return T;
      }
      procHandler.isDestroyed = true;
      procHandler.proc.destroy();
    } finally {
      processIdToProcessHandlerMap.remove(procId);
    }
    return T;
  }
  
  public static final SubLObject get_external_process_status(SubLObject procId, SubLObject shouldBlockUntilFinished) {
    ExternalProcessHandler procHandler = getExternalProcessHandlerForId(procId);
    boolean shouldBlock = SubLNil.toBool(shouldBlockUntilFinished);
    while (true) {
      try {
        if (procHandler.isDestroyed) {
          return Values.values(SubLNil.NIL, procId);
        }
        SubLInteger status = procHandler.getReturnCode();
        return Values.values(status, procId);
      } catch (IllegalThreadStateException e) {
        if (shouldBlock) {
          try {
            Thread.currentThread().sleep(100);
          } catch (InterruptedException ie) {
            Threads.possiblyHandleInterrupts(false);
          }
        } else {
          return Values.values(SubLNil.NIL, procId);
        }
      }
    }
  }
  
  public static final SubLObject run_external_process(SubLObject program, 
      SubLObject args, SubLObject stdinStream, SubLObject stdoutStream, SubLObject stderrStream) {    
    if (args == UNPROVIDED) {
      args = NIL;
    }
    if (stdinStream == UNPROVIDED) {
      stdinStream = StreamsLow.$standard_input$.getValue().getStream(false);
    }
    if (stdoutStream == UNPROVIDED) {
      stdoutStream = StreamsLow.$standard_output$.getValue().getStream(false);
    }
    if (stderrStream == UNPROVIDED) {
      stderrStream = StreamsLow.$error_output$.getValue().getStream(false);
    }
    if (stderrStream == OUTPUT_KEYWORD) {
      stderrStream = stdoutStream;
    }
    boolean shouldCloseInput = stdinStream.isString();
    boolean shouldCloseOutput = stdoutStream.isString();
    boolean shouldCloseErr = stderrStream.isString();
    SubLString progName = program.toStr();
    String[] argStrings = new String[args.size() + 1];
    int i = 1;
    argStrings[0] = progName.getString();
    for (SubLObject current = args; current != NIL; current = current.rest()) {
      argStrings[i++] = print_high.princ_to_string(current.first()).getString();
    }
    SubLInputStream inStream = stdinStream.toInputTextStream();
    SubLOutputStream outStream = stdoutStream.toOutputTextStream();
    SubLOutputStream errStream = stderrStream.toOutputTextStream();
    SubLObject origIn = StreamsLow.originalSynInputStream;
    if ((!SubLMain.getMainReader().isInReaderThread()) && (stdinStream == origIn)) {
      Errors.error("Invalid attempt to read from standard input from multiple thread.");
    }
    Runtime rt = Runtime.getRuntime();
    Process proc = null;
    try {
      proc = rt.exec(argStrings);
    } catch (IOException ioe) {
      StringBuilder message = new StringBuilder("Unable to start process: ").
        append(progName.getString()).append(" ");
      i = 1;
      for (int size = argStrings.length; i < size; i++) {
        message.append(" ").append(argStrings[i]);
      }
      message.append("\n").append(ioe.getMessage());
      SubLInteger processId = makeNewProcessId();
      ExternalProcessHandler procHandler = 
        new ExternalProcessErrorHandler(proc, inStream, outStream, errStream, processId, 
        SubLObjectFactory.makeString(message.toString()),
          shouldCloseInput, shouldCloseOutput, shouldCloseErr);
      processIdToProcessHandlerMap.put(processId, procHandler);
      streams_high.write_string(SubLObjectFactory.makeString(message.toString()), outStream, UNPROVIDED, UNPROVIDED);
      return Values.values(stdinStream.isStream() ? stdinStream : inStream, 
        stdoutStream.isStream() ? stdoutStream : outStream, 
        stderrStream.isStream() ? stderrStream: errStream, processId);
    }
    SubLInteger processId = makeNewProcessId();
    ExternalProcessHandler procHandler = new ExternalProcessHandler(proc, inStream, outStream, errStream, processId, shouldCloseInput, shouldCloseOutput, shouldCloseErr);
    SubLObjectFactory.makeProcess(SubLObjectFactory.makeString("External Process: " + progName), procHandler);
    processIdToProcessHandlerMap.put(processId, procHandler);
    return Values.values(stdinStream.isStream() ? stdinStream : inStream, 
        stdoutStream.isStream() ? stdoutStream : outStream, 
        stderrStream.isStream() ? stderrStream: errStream, processId);
  }
  
  private static final SubLInteger makeNewProcessId() {
    SubLInteger val = currentFakeProcessId;
    currentFakeProcessId = (SubLInteger)Numbers.subtract(currentFakeProcessId, ONE_INTEGER);
    return val;
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "exit", "EXIT", 0, 1, false);
    SubLFiles.declareFunction(me, "fork_process", "FORK-PROCESS", 1, 2, false);
    SubLFiles.declareFunction(me, "restart_process", "RESTART-PROCESS", 0, 3, false);
    SubLFiles.declareFunction(me, "run_external_process", "RUN-EXTERNAL-PROCESS", 1, 4, false);
    SubLFiles.declareFunction(me, "external_processes_supportedP", "EXTERNAL-PROCESSES-SUPPORTED?", 0, 0, false);
    SubLFiles.declareFunction(me, "kill_external_process", "KILL-EXTERNAL-PROCESS", 1, 0, false);
    SubLFiles.declareFunction(me, "get_external_process_status", "GET-EXTERNAL-PROCESS-STATUS", 1, 1, false);
  }
  
  public void initializeVariables() {
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  public static class ExternalProcessHandler implements Runnable {
    //// Constructors
    public ExternalProcessHandler(Process proc, SubLInputStream inStream, SubLOutputStream outStream, 
        SubLOutputStream errStream, SubLInteger processId, boolean shouldCloseInput,
        boolean shouldCloseOutput, boolean shouldCloseErr) {
      this.proc = proc;
      this.inStream = inStream;
      this.outStream = outStream;
      this.errStream = errStream;
      this.processId = processId;
      this.shouldCloseInput = shouldCloseInput;
      this.shouldCloseOutput = shouldCloseOutput;
      this.shouldCloseErr = shouldCloseErr;
    }
    //// Internal Rep
    public void run() {
      // @note this is *extremely* ugly...consider refactoring --APB
      boolean isInStreamClosed = false;
      boolean isOutStreamClosed = false;
      boolean isErrStreamClosed = false;
      int c = -1;
      // @note all the stuff with binary/text streams should go away now that
      // we can set binary over text streams. -APB
      OutputStream procInStream = proc.getOutputStream();
      InputStream procOutStream = proc.getInputStream();
      InputStream procErrStream = proc.getErrorStream();
      SubLInputTextStream inTextStream = null;
      SubLInputBinaryStream inBinaryStream = null;
      SubLOutputTextStream outTextStream = null;
      SubLOutputBinaryStream outBinaryStream = null;
      SubLOutputTextStream errTextStream = null;
      SubLOutputBinaryStream errBinaryStream = null;
      try {
        if (inStream.getElementType() == TEXT_KEYWORD) {
          inTextStream = (SubLInputTextStream) inStream;
        } else if (inStream.getElementType() == BINARY_KEYWORD) {
          inBinaryStream = (SubLInputBinaryStream) inStream;
        } else {
          Errors.error("Don't know about stream element type: " + inStream.getElementType());
        }
        if (outStream.getElementType() == TEXT_KEYWORD) {
          outTextStream = (SubLOutputTextStream) outStream;
        } else if (outStream.getElementType() == BINARY_KEYWORD) {
          outBinaryStream = (SubLOutputBinaryStream) outStream;
        } else {
          Errors.error("Don't know about stream element type: " + inStream.getElementType());
        }
        if (outStream.getElementType() == TEXT_KEYWORD) {
          errTextStream = (SubLOutputTextStream) errStream;
        } else if (outStream.getElementType() == BINARY_KEYWORD) {
          errBinaryStream = (SubLOutputBinaryStream) errStream;
        } else {
          Errors.error("Don't know about stream element type: " + inStream.getElementType());
        }
        boolean hasSomeOutData = false;
        int nConsecutiveFinishes = 0;
        while (!(isInStreamClosed || isOutStreamClosed || isErrStreamClosed)) {
          hasSomeOutData = false;
          while ((!isOutStreamClosed) && (procOutStream.available() > 0)) {
            if ((c = procOutStream.read()) == -1) {
              isOutStreamClosed = true;
              continue;
            }
            if (outTextStream != null) {
              outTextStream.writeChar((char)c);
            } else {
              outBinaryStream.write(c);
            }
            hasSomeOutData = true;
          }
          if (hasSomeOutData) {
            outStream.flush();
          }
          boolean hasSomeErrData = false;
          while ((!isErrStreamClosed) && (procErrStream.available() > 0)) {
            if ((c = procErrStream.read()) == -1) {
              isErrStreamClosed = true;
              continue;
            }
            if (errTextStream != null) {
              errTextStream.writeChar((char)c);
            } else {
              errBinaryStream.write(c);
            }
            hasSomeErrData = true;
          }
          if (hasSomeErrData) {
            errStream.flush();
          }
          boolean hasSomeInData = false;
          if (!isInStreamClosed) {
            if (inStream.isClosed()) {
              isInStreamClosed = true;
              continue;
            }
            if (inTextStream != null) {
              if (inTextStream.ready()) {
                c = inTextStream.readChar();
                procInStream.write(c);
                procInStream.flush();  // @hack way overkill
                hasSomeInData = true;
              }
            } else {
              if (inBinaryStream.numBytesAvailable() > 0) {
                c = inBinaryStream.read();
                procInStream.write(c);
                procInStream.flush();  // @hack way overkill
                hasSomeInData = true;
              }
            }
          }
          if (!hasSomeInData && !hasSomeOutData && !hasSomeErrData) {
            try {
              Thread.currentThread().sleep(10);
              proc.exitValue();
              if (nConsecutiveFinishes++ > 25) { // this is neccessary dont remove!
                break;
              }
            } catch (InterruptedException ie) {
              Threads.possiblyHandleInterrupts(false);
            } catch (Exception e) {} //ignore
          } else {
            nConsecutiveFinishes = 0;
          }
        }
      } catch (Exception e) {
        Errors.error("Error running process: " + proc, e);
      } finally {
        try {
          if (procInStream != null) {
            try { procInStream.close(); } catch (Exception e) {}
          }
          if (procOutStream != null) {
            try { procOutStream.close(); } catch (Exception e) {}
          }
          if (procErrStream != null) {
            try { procErrStream.close(); } catch (Exception e) {}
          }
          if (proc != null) {
            proc.destroy();
          }
        } catch (Exception e) {}
        possiblyCloseStream(shouldCloseInput, inTextStream, inBinaryStream);
        possiblyCloseStream(shouldCloseOutput, outTextStream, outBinaryStream);
        possiblyCloseStream(shouldCloseErr, errTextStream, errBinaryStream);
      }
      isDone = true;
    }

    private void possiblyCloseStream(boolean shouldClose, SubLStream stream1, SubLStream stream2) {
      if (!shouldClose) {
        return;
      }
      if (stream1 != null) {
        stream1.close();
      }
      if (stream2 != null) {
        stream2.close();
      }
    }
    
    SubLString getErrorMessage() { return SubLObjectFactory.makeString(""); }
    
    SubLInteger getReturnCode() { 
      if (!isDone) { throw new IllegalThreadStateException(); }
      SubLInteger result = SubLNumberFactory.makeInteger(proc.exitValue()); 
      return result;
    }
    private Process proc;
    private volatile boolean isDestroyed = false;
    private SubLInputStream inStream;
    private SubLOutputStream outStream; 
    private SubLOutputStream errStream;
    private SubLInteger processId;
    private boolean shouldCloseInput;
    private boolean shouldCloseOutput;
    private boolean shouldCloseErr;
    private volatile boolean isDone = false;
  }
  
  private static class ExternalProcessErrorHandler extends ExternalProcessHandler implements Runnable {
    //// Constructors
    ExternalProcessErrorHandler(Process proc, SubLInputStream inStream, SubLOutputStream outStream, 
          SubLOutputStream errStream, SubLInteger processId, SubLString errorMessage,
          boolean shouldCloseInput, boolean shouldCloseOutput, boolean shouldCloseErr) {
      super(proc, inStream, outStream, errStream, processId, shouldCloseInput, shouldCloseOutput, shouldCloseErr);
      this.errorMessage = errorMessage;
    }
    SubLString getErrorMessage() { return errorMessage; }
    SubLInteger getReturnCode() { return SubLNumberFactory.makeInteger(-1); }
    public void run() {}
    SubLString errorMessage;
  }
  
  private static final ExternalProcessHandler getExternalProcessHandlerForId(SubLObject id) {
    SubLInteger idNum = id.toInteger();
    ExternalProcessHandler procHandler = (ExternalProcessHandler)processIdToProcessHandlerMap.get(idNum);
    if (procHandler == null) {
      Errors.error("Can't find (internal) process id: " + id);
    }
    return procHandler;
  }
  
  //// Internal Rep
  private static final SubLInteger INITIAL_FAKE_EXTERNAL_PROCESS_ID = 
    SubLNumberFactory.makeInteger(new BigInteger("-320498509348509034853094580985434"));
  private static SubLInteger currentFakeProcessId = INITIAL_FAKE_EXTERNAL_PROCESS_ID;
  private static final Map processIdToProcessHandlerMap = Collections.synchronizedMap(new HashMap());
  
  //// Main
  
}
