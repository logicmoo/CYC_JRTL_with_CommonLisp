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

package  com.cyc.cycjava_1.cycl;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.file_utilities;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.misc_utilities;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class os_process_utilities extends SubLTranslatedFile {

  //// Constructor

  private os_process_utilities() {}
  public static final SubLFile me = new os_process_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.os_process_utilities";

  //// Definitions

  public static final class $os_process_impl_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $name; }
    public SubLObject getField4() { return $program; }
    public SubLObject getField5() { return $arguments; }
    public SubLObject getField6() { return $stdin_stream; }
    public SubLObject getField7() { return $stdin_filename; }
    public SubLObject getField8() { return $stdout_stream; }
    public SubLObject getField9() { return $stdout_filename; }
    public SubLObject getField10() { return $stderr_stream; }
    public SubLObject getField11() { return $stderr_filename; }
    public SubLObject getField12() { return $status; }
    public SubLObject getField13() { return $started; }
    public SubLObject getField14() { return $finished; }
    public SubLObject getField15() { return $exit_code; }
    public SubLObject getField16() { return $properties; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $name = value; }
    public SubLObject setField4(SubLObject value) { return $program = value; }
    public SubLObject setField5(SubLObject value) { return $arguments = value; }
    public SubLObject setField6(SubLObject value) { return $stdin_stream = value; }
    public SubLObject setField7(SubLObject value) { return $stdin_filename = value; }
    public SubLObject setField8(SubLObject value) { return $stdout_stream = value; }
    public SubLObject setField9(SubLObject value) { return $stdout_filename = value; }
    public SubLObject setField10(SubLObject value) { return $stderr_stream = value; }
    public SubLObject setField11(SubLObject value) { return $stderr_filename = value; }
    public SubLObject setField12(SubLObject value) { return $status = value; }
    public SubLObject setField13(SubLObject value) { return $started = value; }
    public SubLObject setField14(SubLObject value) { return $finished = value; }
    public SubLObject setField15(SubLObject value) { return $exit_code = value; }
    public SubLObject setField16(SubLObject value) { return $properties = value; }
    public SubLObject $id = NIL;
    public SubLObject $name = NIL;
    public SubLObject $program = NIL;
    public SubLObject $arguments = NIL;
    public SubLObject $stdin_stream = NIL;
    public SubLObject $stdin_filename = NIL;
    public SubLObject $stdout_stream = NIL;
    public SubLObject $stdout_filename = NIL;
    public SubLObject $stderr_stream = NIL;
    public SubLObject $stderr_filename = NIL;
    public SubLObject $status = NIL;
    public SubLObject $started = NIL;
    public SubLObject $finished = NIL;
    public SubLObject $exit_code = NIL;
    public SubLObject $properties = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($os_process_impl_native.class, $sym0$OS_PROCESS_IMPL, $sym1$OS_PROCESS_IMPL_P, $list2, $list3, new String[] {"$id", "$name", "$program", "$arguments", "$stdin_stream", "$stdin_filename", "$stdout_stream", "$stdout_filename", "$stderr_stream", "$stderr_filename", "$status", "$started", "$finished", "$exit_code", "$properties"}, $list4, $list5, $sym6$PRINT_OS_PROCESS_IMPL);
  }

  @SubL(source = "cycl/os-process-utilities.lisp", position = 1927) 
  public static SubLSymbol $dtp_os_process_impl$ = null;

  @SubL(source = "cycl/os-process-utilities.lisp", position = 1927) 
  public static final SubLObject os_process_impl_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30768");
    return NIL;
  }

  public static final class $os_process_impl_p$UnaryFunction extends UnaryFunction {
    public $os_process_impl_p$UnaryFunction() { super(extractFunctionNamed("OS-PROCESS-IMPL-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30749"); }
  }

  @SubL(source = "cycl/os-process-utilities.lisp", position = 1927) 
  public static final SubLObject _csetf_os_process_impl_name(SubLObject object, SubLObject value) {
    checkType(object, $sym1$OS_PROCESS_IMPL_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/os-process-utilities.lisp", position = 1927) 
  public static final SubLObject _csetf_os_process_impl_program(SubLObject object, SubLObject value) {
    checkType(object, $sym1$OS_PROCESS_IMPL_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/os-process-utilities.lisp", position = 1927) 
  public static final SubLObject _csetf_os_process_impl_arguments(SubLObject object, SubLObject value) {
    checkType(object, $sym1$OS_PROCESS_IMPL_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/os-process-utilities.lisp", position = 1927) 
  public static final SubLObject _csetf_os_process_impl_status(SubLObject object, SubLObject value) {
    checkType(object, $sym1$OS_PROCESS_IMPL_P);
    return object.setField12(value);
  }

  @SubL(source = "cycl/os-process-utilities.lisp", position = 1927) 
  public static final SubLObject _csetf_os_process_impl_started(SubLObject object, SubLObject value) {
    checkType(object, $sym1$OS_PROCESS_IMPL_P);
    return object.setField13(value);
  }

  @SubL(source = "cycl/os-process-utilities.lisp", position = 1927) 
  public static final SubLObject make_os_process_impl(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $os_process_impl_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw38$ID)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30714");
          } else if (pcase_var.eql($kw39$NAME)) {
            _csetf_os_process_impl_name(v_new, current_value);
          } else if (pcase_var.eql($kw40$PROGRAM)) {
            _csetf_os_process_impl_program(v_new, current_value);
          } else if (pcase_var.eql($kw41$ARGUMENTS)) {
            _csetf_os_process_impl_arguments(v_new, current_value);
          } else if (pcase_var.eql($kw42$STDIN_STREAM)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30724");
          } else if (pcase_var.eql($kw43$STDIN_FILENAME)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30722");
          } else if (pcase_var.eql($kw44$STDOUT_STREAM)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30729");
          } else if (pcase_var.eql($kw45$STDOUT_FILENAME)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30727");
          } else if (pcase_var.eql($kw46$STDERR_STREAM)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30719");
          } else if (pcase_var.eql($kw47$STDERR_FILENAME)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30717");
          } else if (pcase_var.eql($kw48$STATUS)) {
            _csetf_os_process_impl_status(v_new, current_value);
          } else if (pcase_var.eql($kw49$STARTED)) {
            _csetf_os_process_impl_started(v_new, current_value);
          } else if (pcase_var.eql($kw50$FINISHED)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30712");
          } else if (pcase_var.eql($kw51$EXIT_CODE)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30710");
          } else if (pcase_var.eql($kw52$PROPERTIES)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30716");
          } else {
            Errors.error($str53$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** The valid OS process status values. */
  @SubL(source = "cycl/os-process-utilities.lisp", position = 5098) 
  private static SubLSymbol $valid_os_process_status$ = null;

  @SubL(source = "cycl/os-process-utilities.lisp", position = 5721) 
  private static SubLSymbol $os_process_enumeration_lock$ = null;

  @SubL(source = "cycl/os-process-utilities.lisp", position = 5961) 
  private static SubLSymbol $active_os_processes$ = null;

  /** Called from system code initializations. */
  @SubL(source = "cycl/os-process-utilities.lisp", position = 6007) 
  public static final SubLObject clear_active_os_processes() {
    {
      SubLObject lock = $os_process_enumeration_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        $active_os_processes$.setGlobalValue(NIL);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return $active_os_processes$.getGlobalValue();
  }

  @SubL(source = "cycl/os-process-utilities.lisp", position = 7735) 
  public static final SubLObject make_os_process(SubLObject name, SubLObject program, SubLObject args, SubLObject stdin, SubLObject stdout, SubLObject stderr) {
    if ((args == UNPROVIDED)) {
      args = NIL;
    }
    if ((stdin == UNPROVIDED)) {
      stdin = StreamsLow.$standard_input$.getDynamicValue();
    }
    if ((stdout == UNPROVIDED)) {
      stdout = StreamsLow.$standard_output$.getDynamicValue();
    }
    if ((stderr == UNPROVIDED)) {
      stderr = $kw58$OUTPUT;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(name, $sym65$STRINGP);
      checkType(program, $sym65$STRINGP);
      checkType(args, $sym66$SEQUENCEP);
      checkType(stdin, $sym67$VALID_OS_PROCESS_INPUT_STREAM_SPEC_P);
      checkType(stderr, $sym68$VALID_OS_PROCESS_ERROR_OUTPUT_STREAM_SPEC_P);
      checkType(stdout, $sym69$VALID_OS_PROCESS_OUTPUT_STREAM_SPEC_P);
      {
        SubLObject os_process = make_os_process_impl(UNPROVIDED);
        _csetf_os_process_impl_started(os_process, Time.get_internal_real_time());
        _csetf_os_process_impl_status(os_process, $kw70$INITIALIZING);
        _csetf_os_process_impl_name(os_process, name);
        _csetf_os_process_impl_program(os_process, program);
        _csetf_os_process_impl_arguments(os_process, args);
        if ((stdin.isString()
            || (stdin == $kw57$STREAM))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30723");
        }
        if ((stdout.isString()
            || (stdout == $kw57$STREAM))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30728");
        }
        if ((stderr.isString()
            || (stderr == $kw57$STREAM))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30718");
        }
        thread.resetMultipleValues();
        {
          SubLObject stdin_stream = make_os_process_internal(program, args, stdin, stdout, stderr);
          SubLObject stdout_stream = thread.secondMultipleValue();
          SubLObject stderr_stream = thread.thirdMultipleValue();
          SubLObject pid = thread.fourthMultipleValue();
          thread.resetMultipleValues();
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30715");
          if (pid.isInteger()) {
            _csetf_os_process_impl_status(os_process, $kw71$RUNNING);
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30732");
          } else {
            _csetf_os_process_impl_status(os_process, $kw72$FAILURE);
          }
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30725");
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30730");
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30720");
        }
        return os_process;
      }
    }
  }

  @SubL(source = "cycl/os-process-utilities.lisp", position = 10799) 
  public static final SubLObject make_os_process_internal(SubLObject program, SubLObject args, SubLObject stdin_spec, SubLObject stdout_spec, SubLObject stderr_spec) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject null_stream_path = get_null_file_stream_path();
        SubLObject input = ((stdin_spec == StreamsLow.$null_input$.getDynamicValue(thread)) ? ((SubLObject) null_stream_path) : stdin_spec);
        SubLObject output = ((stdout_spec == StreamsLow.$null_output$.getDynamicValue(thread)) ? ((SubLObject) null_stream_path) : stdout_spec);
        SubLObject error = ((stderr_spec == StreamsLow.$null_output$.getDynamicValue(thread)) ? ((SubLObject) null_stream_path) : stderr_spec);
        if ((NIL == Processes.external_processes_supportedP())) {
          return Errors.error($str75$Currently_not_implemented_for_thi);
        }
        return Processes.run_external_process(program, args, input, output, error);
      }
    }
  }

  @SubL(source = "cycl/os-process-utilities.lisp", position = 11907) 
  public static final SubLObject get_null_file_stream_path() {
    return Filesys.canonical_null_file_stream_path();
  }

  @SubL(source = "cycl/os-process-utilities.lisp", position = 16791) 
  public static final SubLObject system_eval_using_make_os_process(SubLObject command, SubLObject args, SubLObject stdin, SubLObject stdout, SubLObject stderr) {
    if ((args == UNPROVIDED)) {
      args = NIL;
    }
    if ((stdin == UNPROVIDED)) {
      stdin = StreamsLow.$standard_input$.getDynamicValue();
    }
    if ((stdout == UNPROVIDED)) {
      stdout = StreamsLow.$standard_output$.getDynamicValue();
    }
    if ((stderr == UNPROVIDED)) {
      stderr = $kw58$OUTPUT;
    }
    {
      SubLObject exit_code = MINUS_ONE_INTEGER;
      SubLObject os_process = make_os_process($str96$My_system_eval_OS_Process, command, args, stdin, stdout, stderr);
      try {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30771");
        exit_code = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30743");
      } finally {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
          try {
            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30736");
          } finally {
            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
          }
        }
      }
      return exit_code;
    }
  }

  /** Like @xref system-eval-using-make-os-process, except returns T iff
   the os-process's exit code is SUCCESS-EXIT-CODE. */
  @SubL(source = "cycl/os-process-utilities.lisp", position = 17293) 
  public static final SubLObject system_eval_using_make_os_process_successfulP(SubLObject command, SubLObject args, SubLObject success_exit_code, SubLObject stdin, SubLObject stdout, SubLObject stderr) {
    if ((args == UNPROVIDED)) {
      args = NIL;
    }
    if ((success_exit_code == UNPROVIDED)) {
      success_exit_code = ZERO_INTEGER;
    }
    if ((stdin == UNPROVIDED)) {
      stdin = StreamsLow.$standard_input$.getDynamicValue();
    }
    if ((stdout == UNPROVIDED)) {
      stdout = StreamsLow.$standard_output$.getDynamicValue();
    }
    if ((stderr == UNPROVIDED)) {
      stderr = $kw58$OUTPUT;
    }
    {
      SubLObject exit_code = system_eval_using_make_os_process(command, args, stdin, stdout, stderr);
      return Equality.eql(exit_code, success_exit_code);
    }
  }

  /** Used to communicate the user's task between the forking CYC server
   and the child, which has to run system code initialization setup first. */
  @SubL(source = "cycl/os-process-utilities.lisp", position = 20766) 
  private static SubLSymbol $forked_cyc_server_process_task$ = null;

  public static final SubLObject declare_os_process_utilities_file() {
    declareFunction(myName, "os_process_impl_print_function_trampoline", "OS-PROCESS-IMPL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "os_process_impl_p", "OS-PROCESS-IMPL-P", 1, 0, false); new $os_process_impl_p$UnaryFunction();
    declareFunction(myName, "os_process_impl_id", "OS-PROCESS-IMPL-ID", 1, 0, false);
    declareFunction(myName, "os_process_impl_name", "OS-PROCESS-IMPL-NAME", 1, 0, false);
    declareFunction(myName, "os_process_impl_program", "OS-PROCESS-IMPL-PROGRAM", 1, 0, false);
    declareFunction(myName, "os_process_impl_arguments", "OS-PROCESS-IMPL-ARGUMENTS", 1, 0, false);
    declareFunction(myName, "os_process_impl_stdin_stream", "OS-PROCESS-IMPL-STDIN-STREAM", 1, 0, false);
    declareFunction(myName, "os_process_impl_stdin_filename", "OS-PROCESS-IMPL-STDIN-FILENAME", 1, 0, false);
    declareFunction(myName, "os_process_impl_stdout_stream", "OS-PROCESS-IMPL-STDOUT-STREAM", 1, 0, false);
    declareFunction(myName, "os_process_impl_stdout_filename", "OS-PROCESS-IMPL-STDOUT-FILENAME", 1, 0, false);
    declareFunction(myName, "os_process_impl_stderr_stream", "OS-PROCESS-IMPL-STDERR-STREAM", 1, 0, false);
    declareFunction(myName, "os_process_impl_stderr_filename", "OS-PROCESS-IMPL-STDERR-FILENAME", 1, 0, false);
    declareFunction(myName, "os_process_impl_status", "OS-PROCESS-IMPL-STATUS", 1, 0, false);
    declareFunction(myName, "os_process_impl_started", "OS-PROCESS-IMPL-STARTED", 1, 0, false);
    declareFunction(myName, "os_process_impl_finished", "OS-PROCESS-IMPL-FINISHED", 1, 0, false);
    declareFunction(myName, "os_process_impl_exit_code", "OS-PROCESS-IMPL-EXIT-CODE", 1, 0, false);
    declareFunction(myName, "os_process_impl_properties", "OS-PROCESS-IMPL-PROPERTIES", 1, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_id", "_CSETF-OS-PROCESS-IMPL-ID", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_name", "_CSETF-OS-PROCESS-IMPL-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_program", "_CSETF-OS-PROCESS-IMPL-PROGRAM", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_arguments", "_CSETF-OS-PROCESS-IMPL-ARGUMENTS", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_stdin_stream", "_CSETF-OS-PROCESS-IMPL-STDIN-STREAM", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_stdin_filename", "_CSETF-OS-PROCESS-IMPL-STDIN-FILENAME", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_stdout_stream", "_CSETF-OS-PROCESS-IMPL-STDOUT-STREAM", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_stdout_filename", "_CSETF-OS-PROCESS-IMPL-STDOUT-FILENAME", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_stderr_stream", "_CSETF-OS-PROCESS-IMPL-STDERR-STREAM", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_stderr_filename", "_CSETF-OS-PROCESS-IMPL-STDERR-FILENAME", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_status", "_CSETF-OS-PROCESS-IMPL-STATUS", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_started", "_CSETF-OS-PROCESS-IMPL-STARTED", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_finished", "_CSETF-OS-PROCESS-IMPL-FINISHED", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_exit_code", "_CSETF-OS-PROCESS-IMPL-EXIT-CODE", 2, 0, false);
    declareFunction(myName, "_csetf_os_process_impl_properties", "_CSETF-OS-PROCESS-IMPL-PROPERTIES", 2, 0, false);
    declareFunction(myName, "make_os_process_impl", "MAKE-OS-PROCESS-IMPL", 0, 1, false);
    declareFunction(myName, "print_os_process_impl", "PRINT-OS-PROCESS-IMPL", 3, 0, false);
    declareFunction(myName, "valid_os_process_input_stream_spec_p", "VALID-OS-PROCESS-INPUT-STREAM-SPEC-P", 1, 0, false);
    declareFunction(myName, "valid_os_process_output_stream_spec_p", "VALID-OS-PROCESS-OUTPUT-STREAM-SPEC-P", 1, 0, false);
    declareFunction(myName, "valid_os_process_error_output_stream_spec_p", "VALID-OS-PROCESS-ERROR-OUTPUT-STREAM-SPEC-P", 1, 0, false);
    declareFunction(myName, "is_valid_os_process_status_p", "IS-VALID-OS-PROCESS-STATUS-P", 1, 0, false);
    declareFunction(myName, "os_process_p", "OS-PROCESS-P", 1, 0, false);
    declareFunction(myName, "clear_active_os_processes", "CLEAR-ACTIVE-OS-PROCESSES", 0, 0, false);
    declareFunction(myName, "all_os_processes", "ALL-OS-PROCESSES", 0, 0, false);
    declareFunction(myName, "show_os_processes", "SHOW-OS-PROCESSES", 0, 0, false);
    declareFunction(myName, "os_processes_named", "OS-PROCESSES-NAMED", 1, 0, false);
    declareFunction(myName, "kill_os_processes_named", "KILL-OS-PROCESSES-NAMED", 1, 0, false);
    declareFunction(myName, "add_os_process_to_active_list", "ADD-OS-PROCESS-TO-ACTIVE-LIST", 1, 0, false);
    declareFunction(myName, "remove_os_process_from_active_list", "REMOVE-OS-PROCESS-FROM-ACTIVE-LIST", 1, 1, false);
    declareFunction(myName, "make_os_process", "MAKE-OS-PROCESS", 2, 4, false);
    declareFunction(myName, "os_process_runningP", "OS-PROCESS-RUNNING?", 1, 0, false);
    declareFunction(myName, "wait_until_os_processes_finished", "WAIT-UNTIL-OS-PROCESSES-FINISHED", 1, 0, false);
    declareFunction(myName, "wait_until_os_process_finished", "WAIT-UNTIL-OS-PROCESS-FINISHED", 1, 0, false);
    declareFunction(myName, "make_os_process_internal", "MAKE-OS-PROCESS-INTERNAL", 5, 0, false);
    declareFunction(myName, "get_null_file_stream_path", "GET-NULL-FILE-STREAM-PATH", 0, 0, false);
    declareFunction(myName, "external_program_command_line_from_program_and_args", "EXTERNAL-PROGRAM-COMMAND-LINE-FROM-PROGRAM-AND-ARGS", 2, 0, false);
    declareFunction(myName, "external_program_command_line_for_os_process", "EXTERNAL-PROGRAM-COMMAND-LINE-FOR-OS-PROCESS", 1, 0, false);
    declareFunction(myName, "verify_os_process_run_status", "VERIFY-OS-PROCESS-RUN-STATUS", 1, 1, false);
    declareFunction(myName, "get_current_os_process_status_internal", "GET-CURRENT-OS-PROCESS-STATUS-INTERNAL", 1, 1, false);
    declareFunction(myName, "get_current_os_process_status_implementation", "GET-CURRENT-OS-PROCESS-STATUS-IMPLEMENTATION", 2, 0, false);
    declareFunction(myName, "kill_os_process", "KILL-OS-PROCESS", 1, 0, false);
    declareFunction(myName, "cleanup_os_process", "CLEANUP-OS-PROCESS", 1, 0, false);
    declareFunction(myName, "destroy_os_process", "DESTROY-OS-PROCESS", 1, 0, false);
    declareFunction(myName, "kill_os_process_internal", "KILL-OS-PROCESS-INTERNAL", 1, 0, false);
    declareMacro(myName, "run_os_process", "RUN-OS-PROCESS");
    declareMacro(myName, "run_os_process_to_completion", "RUN-OS-PROCESS-TO-COMPLETION");
    declareFunction(myName, "system_eval_using_make_os_process", "SYSTEM-EVAL-USING-MAKE-OS-PROCESS", 1, 4, false);
    declareFunction(myName, "system_eval_using_make_os_process_successfulP", "SYSTEM-EVAL-USING-MAKE-OS-PROCESS-SUCCESSFUL?", 1, 5, false);
    declareFunction(myName, "os_process_evaluation_output_strings", "OS-PROCESS-EVALUATION-OUTPUT-STRINGS", 1, 3, false);
    declareFunction(myName, "os_process_id", "OS-PROCESS-ID", 1, 0, false);
    declareFunction(myName, "os_process_arguments", "OS-PROCESS-ARGUMENTS", 1, 0, false);
    declareFunction(myName, "os_process_exit_code", "OS-PROCESS-EXIT-CODE", 1, 0, false);
    declareFunction(myName, "os_process_finished", "OS-PROCESS-FINISHED", 1, 0, false);
    declareFunction(myName, "os_process_name", "OS-PROCESS-NAME", 1, 0, false);
    declareFunction(myName, "os_process_program", "OS-PROCESS-PROGRAM", 1, 0, false);
    declareFunction(myName, "os_process_started", "OS-PROCESS-STARTED", 1, 0, false);
    declareFunction(myName, "os_process_status", "OS-PROCESS-STATUS", 1, 0, false);
    declareFunction(myName, "os_process_stderr_filename", "OS-PROCESS-STDERR-FILENAME", 1, 0, false);
    declareFunction(myName, "os_process_stderr_stream", "OS-PROCESS-STDERR-STREAM", 1, 0, false);
    declareFunction(myName, "os_process_stdin_filename", "OS-PROCESS-STDIN-FILENAME", 1, 0, false);
    declareFunction(myName, "os_process_stdin_stream", "OS-PROCESS-STDIN-STREAM", 1, 0, false);
    declareFunction(myName, "os_process_stdout_filename", "OS-PROCESS-STDOUT-FILENAME", 1, 0, false);
    declareFunction(myName, "os_process_stdout_stream", "OS-PROCESS-STDOUT-STREAM", 1, 0, false);
    declareFunction(myName, "fork_cyc_server_process", "FORK-CYC-SERVER-PROCESS", 1, 2, false);
    declareFunction(myName, "fork_cyc_server_process_implementation", "FORK-CYC-SERVER-PROCESS-IMPLEMENTATION", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_os_process_utilities_file() {
    $dtp_os_process_impl$ = defconstant("*DTP-OS-PROCESS-IMPL*", $sym0$OS_PROCESS_IMPL);
    $valid_os_process_status$ = defconstant("*VALID-OS-PROCESS-STATUS*", $list59);
    $os_process_enumeration_lock$ = deflexical("*OS-PROCESS-ENUMERATION-LOCK*", ((NIL != Symbols.boundp($sym60$_OS_PROCESS_ENUMERATION_LOCK_)) ? ((SubLObject) $os_process_enumeration_lock$.getGlobalValue()) : Locks.make_lock($str61$OS_Process_enumeration_lock)));
    $active_os_processes$ = deflexical("*ACTIVE-OS-PROCESSES*", ((NIL != Symbols.boundp($sym62$_ACTIVE_OS_PROCESSES_)) ? ((SubLObject) $active_os_processes$.getGlobalValue()) : NIL));
    $forked_cyc_server_process_task$ = defparameter("*FORKED-CYC-SERVER-PROCESS-TASK*", NIL);
    return NIL;
  }

  public static final SubLObject setup_os_process_utilities_file() {
    // CVS_ID("Id: os-process-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_os_process_impl$.getGlobalValue(), Symbols.symbol_function($sym7$OS_PROCESS_IMPL_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$OS_PROCESS_IMPL_ID, $sym9$_CSETF_OS_PROCESS_IMPL_ID);
    Structures.def_csetf($sym10$OS_PROCESS_IMPL_NAME, $sym11$_CSETF_OS_PROCESS_IMPL_NAME);
    Structures.def_csetf($sym12$OS_PROCESS_IMPL_PROGRAM, $sym13$_CSETF_OS_PROCESS_IMPL_PROGRAM);
    Structures.def_csetf($sym14$OS_PROCESS_IMPL_ARGUMENTS, $sym15$_CSETF_OS_PROCESS_IMPL_ARGUMENTS);
    Structures.def_csetf($sym16$OS_PROCESS_IMPL_STDIN_STREAM, $sym17$_CSETF_OS_PROCESS_IMPL_STDIN_STREAM);
    Structures.def_csetf($sym18$OS_PROCESS_IMPL_STDIN_FILENAME, $sym19$_CSETF_OS_PROCESS_IMPL_STDIN_FILENAME);
    Structures.def_csetf($sym20$OS_PROCESS_IMPL_STDOUT_STREAM, $sym21$_CSETF_OS_PROCESS_IMPL_STDOUT_STREAM);
    Structures.def_csetf($sym22$OS_PROCESS_IMPL_STDOUT_FILENAME, $sym23$_CSETF_OS_PROCESS_IMPL_STDOUT_FILENAME);
    Structures.def_csetf($sym24$OS_PROCESS_IMPL_STDERR_STREAM, $sym25$_CSETF_OS_PROCESS_IMPL_STDERR_STREAM);
    Structures.def_csetf($sym26$OS_PROCESS_IMPL_STDERR_FILENAME, $sym27$_CSETF_OS_PROCESS_IMPL_STDERR_FILENAME);
    Structures.def_csetf($sym28$OS_PROCESS_IMPL_STATUS, $sym29$_CSETF_OS_PROCESS_IMPL_STATUS);
    Structures.def_csetf($sym30$OS_PROCESS_IMPL_STARTED, $sym31$_CSETF_OS_PROCESS_IMPL_STARTED);
    Structures.def_csetf($sym32$OS_PROCESS_IMPL_FINISHED, $sym33$_CSETF_OS_PROCESS_IMPL_FINISHED);
    Structures.def_csetf($sym34$OS_PROCESS_IMPL_EXIT_CODE, $sym35$_CSETF_OS_PROCESS_IMPL_EXIT_CODE);
    Structures.def_csetf($sym36$OS_PROCESS_IMPL_PROPERTIES, $sym37$_CSETF_OS_PROCESS_IMPL_PROPERTIES);
    Equality.identity($sym0$OS_PROCESS_IMPL);
    subl_macro_promotions.declare_defglobal($sym60$_OS_PROCESS_ENUMERATION_LOCK_);
    subl_macro_promotions.declare_defglobal($sym62$_ACTIVE_OS_PROCESSES_);
    access_macros.register_external_symbol($sym100$FORK_CYC_SERVER_PROCESS);
    utilities_macros.note_funcall_helper_function($sym101$FORK_CYC_SERVER_PROCESS_IMPLEMENTATION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$OS_PROCESS_IMPL = makeSymbol("OS-PROCESS-IMPL");
  public static final SubLSymbol $sym1$OS_PROCESS_IMPL_P = makeSymbol("OS-PROCESS-IMPL-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("ID"), makeSymbol("NAME"), makeSymbol("PROGRAM"), makeSymbol("ARGUMENTS"), makeSymbol("STDIN-STREAM"), makeSymbol("STDIN-FILENAME"), makeSymbol("STDOUT-STREAM"), makeSymbol("STDOUT-FILENAME"), makeSymbol("STDERR-STREAM"), makeSymbol("STDERR-FILENAME"), makeSymbol("STATUS"), makeSymbol("STARTED"), makeSymbol("FINISHED"), makeSymbol("EXIT-CODE"), makeSymbol("PROPERTIES")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("ID"), makeKeyword("NAME"), makeKeyword("PROGRAM"), makeKeyword("ARGUMENTS"), makeKeyword("STDIN-STREAM"), makeKeyword("STDIN-FILENAME"), makeKeyword("STDOUT-STREAM"), makeKeyword("STDOUT-FILENAME"), makeKeyword("STDERR-STREAM"), makeKeyword("STDERR-FILENAME"), makeKeyword("STATUS"), makeKeyword("STARTED"), makeKeyword("FINISHED"), makeKeyword("EXIT-CODE"), makeKeyword("PROPERTIES")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("OS-PROCESS-IMPL-ID"), makeSymbol("OS-PROCESS-IMPL-NAME"), makeSymbol("OS-PROCESS-IMPL-PROGRAM"), makeSymbol("OS-PROCESS-IMPL-ARGUMENTS"), makeSymbol("OS-PROCESS-IMPL-STDIN-STREAM"), makeSymbol("OS-PROCESS-IMPL-STDIN-FILENAME"), makeSymbol("OS-PROCESS-IMPL-STDOUT-STREAM"), makeSymbol("OS-PROCESS-IMPL-STDOUT-FILENAME"), makeSymbol("OS-PROCESS-IMPL-STDERR-STREAM"), makeSymbol("OS-PROCESS-IMPL-STDERR-FILENAME"), makeSymbol("OS-PROCESS-IMPL-STATUS"), makeSymbol("OS-PROCESS-IMPL-STARTED"), makeSymbol("OS-PROCESS-IMPL-FINISHED"), makeSymbol("OS-PROCESS-IMPL-EXIT-CODE"), makeSymbol("OS-PROCESS-IMPL-PROPERTIES")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-OS-PROCESS-IMPL-ID"), makeSymbol("_CSETF-OS-PROCESS-IMPL-NAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-PROGRAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-ARGUMENTS"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDIN-STREAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDIN-FILENAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDOUT-STREAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDOUT-FILENAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDERR-STREAM"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STDERR-FILENAME"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STATUS"), makeSymbol("_CSETF-OS-PROCESS-IMPL-STARTED"), makeSymbol("_CSETF-OS-PROCESS-IMPL-FINISHED"), makeSymbol("_CSETF-OS-PROCESS-IMPL-EXIT-CODE"), makeSymbol("_CSETF-OS-PROCESS-IMPL-PROPERTIES")});
  public static final SubLSymbol $sym6$PRINT_OS_PROCESS_IMPL = makeSymbol("PRINT-OS-PROCESS-IMPL");
  public static final SubLSymbol $sym7$OS_PROCESS_IMPL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("OS-PROCESS-IMPL-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$OS_PROCESS_IMPL_ID = makeSymbol("OS-PROCESS-IMPL-ID");
  public static final SubLSymbol $sym9$_CSETF_OS_PROCESS_IMPL_ID = makeSymbol("_CSETF-OS-PROCESS-IMPL-ID");
  public static final SubLSymbol $sym10$OS_PROCESS_IMPL_NAME = makeSymbol("OS-PROCESS-IMPL-NAME");
  public static final SubLSymbol $sym11$_CSETF_OS_PROCESS_IMPL_NAME = makeSymbol("_CSETF-OS-PROCESS-IMPL-NAME");
  public static final SubLSymbol $sym12$OS_PROCESS_IMPL_PROGRAM = makeSymbol("OS-PROCESS-IMPL-PROGRAM");
  public static final SubLSymbol $sym13$_CSETF_OS_PROCESS_IMPL_PROGRAM = makeSymbol("_CSETF-OS-PROCESS-IMPL-PROGRAM");
  public static final SubLSymbol $sym14$OS_PROCESS_IMPL_ARGUMENTS = makeSymbol("OS-PROCESS-IMPL-ARGUMENTS");
  public static final SubLSymbol $sym15$_CSETF_OS_PROCESS_IMPL_ARGUMENTS = makeSymbol("_CSETF-OS-PROCESS-IMPL-ARGUMENTS");
  public static final SubLSymbol $sym16$OS_PROCESS_IMPL_STDIN_STREAM = makeSymbol("OS-PROCESS-IMPL-STDIN-STREAM");
  public static final SubLSymbol $sym17$_CSETF_OS_PROCESS_IMPL_STDIN_STREAM = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDIN-STREAM");
  public static final SubLSymbol $sym18$OS_PROCESS_IMPL_STDIN_FILENAME = makeSymbol("OS-PROCESS-IMPL-STDIN-FILENAME");
  public static final SubLSymbol $sym19$_CSETF_OS_PROCESS_IMPL_STDIN_FILENAME = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDIN-FILENAME");
  public static final SubLSymbol $sym20$OS_PROCESS_IMPL_STDOUT_STREAM = makeSymbol("OS-PROCESS-IMPL-STDOUT-STREAM");
  public static final SubLSymbol $sym21$_CSETF_OS_PROCESS_IMPL_STDOUT_STREAM = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDOUT-STREAM");
  public static final SubLSymbol $sym22$OS_PROCESS_IMPL_STDOUT_FILENAME = makeSymbol("OS-PROCESS-IMPL-STDOUT-FILENAME");
  public static final SubLSymbol $sym23$_CSETF_OS_PROCESS_IMPL_STDOUT_FILENAME = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDOUT-FILENAME");
  public static final SubLSymbol $sym24$OS_PROCESS_IMPL_STDERR_STREAM = makeSymbol("OS-PROCESS-IMPL-STDERR-STREAM");
  public static final SubLSymbol $sym25$_CSETF_OS_PROCESS_IMPL_STDERR_STREAM = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDERR-STREAM");
  public static final SubLSymbol $sym26$OS_PROCESS_IMPL_STDERR_FILENAME = makeSymbol("OS-PROCESS-IMPL-STDERR-FILENAME");
  public static final SubLSymbol $sym27$_CSETF_OS_PROCESS_IMPL_STDERR_FILENAME = makeSymbol("_CSETF-OS-PROCESS-IMPL-STDERR-FILENAME");
  public static final SubLSymbol $sym28$OS_PROCESS_IMPL_STATUS = makeSymbol("OS-PROCESS-IMPL-STATUS");
  public static final SubLSymbol $sym29$_CSETF_OS_PROCESS_IMPL_STATUS = makeSymbol("_CSETF-OS-PROCESS-IMPL-STATUS");
  public static final SubLSymbol $sym30$OS_PROCESS_IMPL_STARTED = makeSymbol("OS-PROCESS-IMPL-STARTED");
  public static final SubLSymbol $sym31$_CSETF_OS_PROCESS_IMPL_STARTED = makeSymbol("_CSETF-OS-PROCESS-IMPL-STARTED");
  public static final SubLSymbol $sym32$OS_PROCESS_IMPL_FINISHED = makeSymbol("OS-PROCESS-IMPL-FINISHED");
  public static final SubLSymbol $sym33$_CSETF_OS_PROCESS_IMPL_FINISHED = makeSymbol("_CSETF-OS-PROCESS-IMPL-FINISHED");
  public static final SubLSymbol $sym34$OS_PROCESS_IMPL_EXIT_CODE = makeSymbol("OS-PROCESS-IMPL-EXIT-CODE");
  public static final SubLSymbol $sym35$_CSETF_OS_PROCESS_IMPL_EXIT_CODE = makeSymbol("_CSETF-OS-PROCESS-IMPL-EXIT-CODE");
  public static final SubLSymbol $sym36$OS_PROCESS_IMPL_PROPERTIES = makeSymbol("OS-PROCESS-IMPL-PROPERTIES");
  public static final SubLSymbol $sym37$_CSETF_OS_PROCESS_IMPL_PROPERTIES = makeSymbol("_CSETF-OS-PROCESS-IMPL-PROPERTIES");
  public static final SubLSymbol $kw38$ID = makeKeyword("ID");
  public static final SubLSymbol $kw39$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw40$PROGRAM = makeKeyword("PROGRAM");
  public static final SubLSymbol $kw41$ARGUMENTS = makeKeyword("ARGUMENTS");
  public static final SubLSymbol $kw42$STDIN_STREAM = makeKeyword("STDIN-STREAM");
  public static final SubLSymbol $kw43$STDIN_FILENAME = makeKeyword("STDIN-FILENAME");
  public static final SubLSymbol $kw44$STDOUT_STREAM = makeKeyword("STDOUT-STREAM");
  public static final SubLSymbol $kw45$STDOUT_FILENAME = makeKeyword("STDOUT-FILENAME");
  public static final SubLSymbol $kw46$STDERR_STREAM = makeKeyword("STDERR-STREAM");
  public static final SubLSymbol $kw47$STDERR_FILENAME = makeKeyword("STDERR-FILENAME");
  public static final SubLSymbol $kw48$STATUS = makeKeyword("STATUS");
  public static final SubLSymbol $kw49$STARTED = makeKeyword("STARTED");
  public static final SubLSymbol $kw50$FINISHED = makeKeyword("FINISHED");
  public static final SubLSymbol $kw51$EXIT_CODE = makeKeyword("EXIT-CODE");
  public static final SubLSymbol $kw52$PROPERTIES = makeKeyword("PROPERTIES");
  public static final SubLString $str53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str54$__OS_PROCESS_ = makeString("#<OS-PROCESS ");
  public static final SubLString $str55$_A__S__A__S__A = makeString("~A ~S ~A ~S ~A");
  public static final SubLString $str56$_ = makeString(">");
  public static final SubLSymbol $kw57$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw58$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLList $list59 = list(makeKeyword("INITIALIZING"), makeKeyword("RUNNING"), makeKeyword("DEAD"), makeKeyword("FAILURE"));
  public static final SubLSymbol $sym60$_OS_PROCESS_ENUMERATION_LOCK_ = makeSymbol("*OS-PROCESS-ENUMERATION-LOCK*");
  public static final SubLString $str61$OS_Process_enumeration_lock = makeString("OS Process enumeration lock");
  public static final SubLSymbol $sym62$_ACTIVE_OS_PROCESSES_ = makeSymbol("*ACTIVE-OS-PROCESSES*");
  public static final SubLString $str63$_A___A____A__A__ = makeString("~A (~A): ~A ~A~%");
  public static final SubLString $str64$Trying_to_remove_missing_OS_proce = makeString("Trying to remove missing OS process ~A from active process list");
  public static final SubLSymbol $sym65$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym66$SEQUENCEP = makeSymbol("SEQUENCEP");
  public static final SubLSymbol $sym67$VALID_OS_PROCESS_INPUT_STREAM_SPEC_P = makeSymbol("VALID-OS-PROCESS-INPUT-STREAM-SPEC-P");
  public static final SubLSymbol $sym68$VALID_OS_PROCESS_ERROR_OUTPUT_STREAM_SPEC_P = makeSymbol("VALID-OS-PROCESS-ERROR-OUTPUT-STREAM-SPEC-P");
  public static final SubLSymbol $sym69$VALID_OS_PROCESS_OUTPUT_STREAM_SPEC_P = makeSymbol("VALID-OS-PROCESS-OUTPUT-STREAM-SPEC-P");
  public static final SubLSymbol $kw70$INITIALIZING = makeKeyword("INITIALIZING");
  public static final SubLSymbol $kw71$RUNNING = makeKeyword("RUNNING");
  public static final SubLSymbol $kw72$FAILURE = makeKeyword("FAILURE");
  public static final SubLSymbol $sym73$OS_PROCESS_P = makeSymbol("OS-PROCESS-P");
  public static final SubLFloat $float74$0_1 = makeDouble(0.1);
  public static final SubLString $str75$Currently_not_implemented_for_thi = makeString("Currently not implemented for this port.");
  public static final SubLString $str76$_ = makeString(" ");
  public static final SubLSymbol $kw77$DEAD = makeKeyword("DEAD");
  public static final SubLString $str78$Currently_not_implemented_ = makeString("Currently not implemented.");
  public static final SubLList $list79 = list(list(makeSymbol("OS-PROCESS-VAR"), makeSymbol("COMMAND"), makeSymbol("&KEY"), list(makeSymbol("ARGS"), NIL), list(makeSymbol("NAME"), makeString("My OS process")), list(makeSymbol("STDIN"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-INPUT*"))), list(makeSymbol("STDOUT"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("STDERR"), makeKeyword("OUTPUT"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list80 = list(makeKeyword("ARGS"), makeKeyword("NAME"), makeKeyword("STDIN"), makeKeyword("STDOUT"), makeKeyword("STDERR"));
  public static final SubLSymbol $kw81$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw82$ARGS = makeKeyword("ARGS");
  public static final SubLString $str83$My_OS_process = makeString("My OS process");
  public static final SubLSymbol $kw84$STDIN = makeKeyword("STDIN");
  public static final SubLSymbol $sym85$_STANDARD_INPUT_ = makeSymbol("*STANDARD-INPUT*");
  public static final SubLSymbol $kw86$STDOUT = makeKeyword("STDOUT");
  public static final SubLSymbol $sym87$_STANDARD_OUTPUT_ = makeSymbol("*STANDARD-OUTPUT*");
  public static final SubLSymbol $kw88$STDERR = makeKeyword("STDERR");
  public static final SubLSymbol $sym89$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym90$MAKE_OS_PROCESS = makeSymbol("MAKE-OS-PROCESS");
  public static final SubLSymbol $sym91$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym92$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym93$DESTROY_OS_PROCESS = makeSymbol("DESTROY-OS-PROCESS");
  public static final SubLSymbol $sym94$RUN_OS_PROCESS = makeSymbol("RUN-OS-PROCESS");
  public static final SubLSymbol $sym95$WAIT_UNTIL_OS_PROCESS_FINISHED = makeSymbol("WAIT-UNTIL-OS-PROCESS-FINISHED");
  public static final SubLString $str96$My_system_eval_OS_Process = makeString("My system-eval OS Process");
  public static final SubLString $str97$My_system_eval_OS_Process_outputt = makeString("My system-eval OS Process outputting to ");
  public static final SubLSymbol $kw98$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym99$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $sym100$FORK_CYC_SERVER_PROCESS = makeSymbol("FORK-CYC-SERVER-PROCESS");
  public static final SubLSymbol $sym101$FORK_CYC_SERVER_PROCESS_IMPLEMENTATION = makeSymbol("FORK-CYC-SERVER-PROCESS-IMPLEMENTATION");

  //// Initializers

  public void declareFunctions() {
    declare_os_process_utilities_file();
  }

  public void initializeVariables() {
    init_os_process_utilities_file();
  }

  public void runTopLevelForms() {
    setup_os_process_utilities_file();
  }

}
