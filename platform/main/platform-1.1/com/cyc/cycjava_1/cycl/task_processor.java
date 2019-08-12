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

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.accumulation;
//dm import com.cyc.cycjava_1.cycl.cache;
//dm import com.cyc.cycjava_1.cycl.cfasl_kb_methods;
//dm import com.cyc.cycjava_1.cycl.cfasl_kernel;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.eval_in_api;
//dm import com.cyc.cycjava_1.cycl.java_api_kernel;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.operation_communication;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class task_processor extends SubLTranslatedFile {

  //// Constructor

  private task_processor() {}
  public static final SubLFile me = new task_processor();
  public static final String myName = "com.cyc.cycjava_1.cycl.task_processor";

  //// Definitions

  /** Diagnostic verbosity level of the task processor, 0=quiet, 9=maximum. */
  @SubL(source = "cycl/task-processor.lisp", position = 3908) 
  private static SubLSymbol $task_processor_verbosity$ = null;

  /** @return integerp
   Return the task processor verbosity level. */
  @SubL(source = "cycl/task-processor.lisp", position = 4743) 
  public static final SubLObject get_task_processor_verbosity() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $task_processor_verbosity$.getDynamicValue(thread);
    }
  }

  public static final class $task_info_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $type; }
    public SubLObject getField3() { return $id; }
    public SubLObject getField4() { return $priority; }
    public SubLObject getField5() { return $requestor; }
    public SubLObject getField6() { return $giveback_info; }
    public SubLObject getField7() { return $bindings; }
    public SubLObject getField8() { return $request; }
    public SubLObject getField9() { return $response; }
    public SubLObject getField10() { return $error_message; }
    public SubLObject getField11() { return $task_processor_name; }
    public SubLObject setField2(SubLObject value) { return $type = value; }
    public SubLObject setField3(SubLObject value) { return $id = value; }
    public SubLObject setField4(SubLObject value) { return $priority = value; }
    public SubLObject setField5(SubLObject value) { return $requestor = value; }
    public SubLObject setField6(SubLObject value) { return $giveback_info = value; }
    public SubLObject setField7(SubLObject value) { return $bindings = value; }
    public SubLObject setField8(SubLObject value) { return $request = value; }
    public SubLObject setField9(SubLObject value) { return $response = value; }
    public SubLObject setField10(SubLObject value) { return $error_message = value; }
    public SubLObject setField11(SubLObject value) { return $task_processor_name = value; }
    public SubLObject $type = NIL;
    public SubLObject $id = NIL;
    public SubLObject $priority = NIL;
    public SubLObject $requestor = NIL;
    public SubLObject $giveback_info = NIL;
    public SubLObject $bindings = NIL;
    public SubLObject $request = NIL;
    public SubLObject $response = NIL;
    public SubLObject $error_message = NIL;
    public SubLObject $task_processor_name = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($task_info_native.class, $sym3$TASK_INFO, $sym4$TASK_INFO_P, $list5, $list6, new String[] {"$type", "$id", "$priority", "$requestor", "$giveback_info", "$bindings", "$request", "$response", "$error_message", "$task_processor_name"}, $list7, $list8, $sym9$PRINT_TASK_INFO);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static SubLSymbol $dtp_task_info$ = null;

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject task_info_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31803");
    return NIL;
  }

  public static final class $task_info_p$UnaryFunction extends UnaryFunction {
    public $task_info_p$UnaryFunction() { super(extractFunctionNamed("TASK-INFO-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31809"); }
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject ti_type(SubLObject object) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.getField2();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject ti_id(SubLObject object) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.getField3();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject ti_priority(SubLObject object) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.getField4();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject ti_requestor(SubLObject object) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.getField5();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject ti_giveback_info(SubLObject object) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.getField6();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject ti_bindings(SubLObject object) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.getField7();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject ti_request(SubLObject object) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.getField8();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject ti_response(SubLObject object) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.getField9();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject ti_error_message(SubLObject object) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.getField10();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject _csetf_ti_type(SubLObject object, SubLObject value) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject _csetf_ti_id(SubLObject object, SubLObject value) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject _csetf_ti_priority(SubLObject object, SubLObject value) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject _csetf_ti_requestor(SubLObject object, SubLObject value) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject _csetf_ti_giveback_info(SubLObject object, SubLObject value) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject _csetf_ti_bindings(SubLObject object, SubLObject value) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject _csetf_ti_request(SubLObject object, SubLObject value) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject _csetf_ti_response(SubLObject object, SubLObject value) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject _csetf_ti_error_message(SubLObject object, SubLObject value) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.setField10(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject _csetf_ti_task_processor_name(SubLObject object, SubLObject value) {
    checkType(object, $sym4$TASK_INFO_P);
    return object.setField11(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 5569) 
  public static final SubLObject make_task_info(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $task_info_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw31$TYPE)) {
            _csetf_ti_type(v_new, current_value);
          } else if (pcase_var.eql($kw32$ID)) {
            _csetf_ti_id(v_new, current_value);
          } else if (pcase_var.eql($kw33$PRIORITY)) {
            _csetf_ti_priority(v_new, current_value);
          } else if (pcase_var.eql($kw34$REQUESTOR)) {
            _csetf_ti_requestor(v_new, current_value);
          } else if (pcase_var.eql($kw35$GIVEBACK_INFO)) {
            _csetf_ti_giveback_info(v_new, current_value);
          } else if (pcase_var.eql($kw36$BINDINGS)) {
            _csetf_ti_bindings(v_new, current_value);
          } else if (pcase_var.eql($kw37$REQUEST)) {
            _csetf_ti_request(v_new, current_value);
          } else if (pcase_var.eql($kw38$RESPONSE)) {
            _csetf_ti_response(v_new, current_value);
          } else if (pcase_var.eql($kw39$ERROR_MESSAGE)) {
            _csetf_ti_error_message(v_new, current_value);
          } else if (pcase_var.eql($kw40$TASK_PROCESSOR_NAME)) {
            _csetf_ti_task_processor_name(v_new, current_value);
          } else {
            Errors.error($str41$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** @param TYPE; symbolp
   @param TASK-INFO; task-info-p
   Sets the TYPE of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 6461) 
  public static final SubLObject set_task_info_type(SubLObject type, SubLObject task_info) {
    checkType(type, $sym42$SYMBOLP);
    checkType(task_info, $sym4$TASK_INFO_P);
    _csetf_ti_type(task_info, type);
    return NIL;
  }

  /** @param TASK-INFO; task-info-p
   @return integerp
   Return the id of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 6715) 
  public static final SubLObject get_task_info_id(SubLObject task_info) {
    checkType(task_info, $sym4$TASK_INFO_P);
    return ti_id(task_info);
  }

  /** @param ID; integerp
   @param TASK-INFO; task-info-p
   Sets the ID of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 6909) 
  public static final SubLObject set_task_info_id(SubLObject id, SubLObject task_info) {
    checkType(id, $sym1$INTEGERP);
    checkType(task_info, $sym4$TASK_INFO_P);
    _csetf_ti_id(task_info, id);
    return NIL;
  }

  /** @param TASK-INFO; task-info-p
   @return integerp
   Return the priority of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 7151) 
  public static final SubLObject get_task_info_priority(SubLObject task_info) {
    checkType(task_info, $sym4$TASK_INFO_P);
    return ti_priority(task_info);
  }

  /** @param PRIORITY; integerp
   @param TASK-INFO; task-info-p
   Sets the PRIORITY of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 7363) 
  public static final SubLObject set_task_info_priority(SubLObject priority, SubLObject task_info) {
    checkType(priority, $sym1$INTEGERP);
    checkType(task_info, $sym4$TASK_INFO_P);
    _csetf_ti_priority(task_info, priority);
    return NIL;
  }

  /** @param TASK-INFO; task-info-p
   @return stringp
  Return the requestor of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 7647) 
  public static final SubLObject get_task_info_requestor(SubLObject task_info) {
    checkType(task_info, $sym4$TASK_INFO_P);
    return ti_requestor(task_info);
  }

  /** @param REQUESTOR; stringp
   @param TASK-INFO; task-info-p
   Sets the REQUESTOR of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 7860) 
  public static final SubLObject set_task_info_requestor(SubLObject requestor, SubLObject task_info) {
    checkType(requestor, $sym43$STRINGP);
    checkType(task_info, $sym4$TASK_INFO_P);
    _csetf_ti_requestor(task_info, requestor);
    return NIL;
  }

  /** @param TASK-INFO; task-info-p
   @return any
  Return the giveback-info of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 8149) 
  public static final SubLObject get_task_info_giveback_info(SubLObject task_info) {
    checkType(task_info, $sym4$TASK_INFO_P);
    return ti_giveback_info(task_info);
  }

  /** @param GIVEBACK-INFO; any
   @param TASK-INFO; task-info-p
   Sets the GIVEBACK-INFO of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 8370) 
  public static final SubLObject set_task_info_giveback_info(SubLObject giveback_info, SubLObject task_info) {
    checkType(task_info, $sym4$TASK_INFO_P);
    _csetf_ti_giveback_info(task_info, giveback_info);
    return NIL;
  }

  /** @param BINDINGS; nil or CONSP of two-element lists (var value)
   @param TASK-INFO; task-info-p
   Sets the BINDINGS of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 8855) 
  public static final SubLObject set_task_info_bindings(SubLObject v_bindings, SubLObject task_info) {
    checkType(task_info, $sym4$TASK_INFO_P);
    _csetf_ti_bindings(task_info, v_bindings);
    return NIL;
  }

  /** @param TASK-INFO; task-info-p
   @return atom or listp
   Return the request of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 9143) 
  public static final SubLObject get_task_info_request(SubLObject task_info) {
    checkType(task_info, $sym4$TASK_INFO_P);
    return ti_request(task_info);
  }

  /** @param REQUEST; atom or CONSP the form for evaluation
   @param TASK-INFO; task-info-p
   Sets the REQUEST of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 9357) 
  public static final SubLObject set_task_info_request(SubLObject request, SubLObject task_info) {
    checkType(task_info, $sym4$TASK_INFO_P);
    _csetf_ti_request(task_info, request);
    return NIL;
  }

  /** @param TASK-INFO; task-info-p
   @return atom or listp
   Return the response of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 9631) 
  public static final SubLObject get_task_info_response(SubLObject task_info) {
    checkType(task_info, $sym4$TASK_INFO_P);
    return ti_response(task_info);
  }

  /** @param TASK-INFO; task-info-p
   @return stringp
   Return the error-message of TASK-INFO. */
  @SubL(source = "cycl/task-processor.lisp", position = 10116) 
  public static final SubLObject get_task_info_error_message(SubLObject task_info) {
    checkType(task_info, $sym4$TASK_INFO_P);
    return ti_error_message(task_info);
  }

  public static final class $task_result_set_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $result; }
    public SubLObject getField3() { return $task_info; }
    public SubLObject getField4() { return $finished; }
    public SubLObject setField2(SubLObject value) { return $result = value; }
    public SubLObject setField3(SubLObject value) { return $task_info = value; }
    public SubLObject setField4(SubLObject value) { return $finished = value; }
    public SubLObject $result = NIL;
    public SubLObject $task_info = NIL;
    public SubLObject $finished = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($task_result_set_native.class, $sym57$TASK_RESULT_SET, $sym58$TASK_RESULT_SET_P, $list59, $list60, new String[] {"$result", "$task_info", "$finished"}, $list61, $list62, $sym63$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 12425) 
  public static SubLSymbol $dtp_task_result_set$ = null;

  @SubL(source = "cycl/task-processor.lisp", position = 12425) 
  public static final SubLObject task_result_set_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $task_result_set_p$UnaryFunction extends UnaryFunction {
    public $task_result_set_p$UnaryFunction() { super(extractFunctionNamed("TASK-RESULT-SET-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31810"); }
  }

  /** Dictionary of task-processor-type --> response dispatch function. */
  @SubL(source = "cycl/task-processor.lisp", position = 13078) 
  private static SubLSymbol $task_processor_response_dispatch_fn_dict$ = null;

  public static final class $task_processor_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $name; }
    public SubLObject getField3() { return $process; }
    public SubLObject getField4() { return $busy_p; }
    public SubLObject getField5() { return $task_info; }
    public SubLObject setField2(SubLObject value) { return $name = value; }
    public SubLObject setField3(SubLObject value) { return $process = value; }
    public SubLObject setField4(SubLObject value) { return $busy_p = value; }
    public SubLObject setField5(SubLObject value) { return $task_info = value; }
    public SubLObject $name = NIL;
    public SubLObject $process = NIL;
    public SubLObject $busy_p = NIL;
    public SubLObject $task_info = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($task_processor_native.class, $sym75$TASK_PROCESSOR, $sym76$TASK_PROCESSOR_P, $list77, $list78, new String[] {"$name", "$process", "$busy_p", "$task_info"}, $list79, $list80, $sym81$PRINT_TASK_PROCESSOR);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 13437) 
  public static SubLSymbol $dtp_task_processor$ = null;

  @SubL(source = "cycl/task-processor.lisp", position = 13437) 
  public static final SubLObject task_processor_p(SubLObject object) {
    return ((object.getClass() == $task_processor_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $task_processor_p$UnaryFunction extends UnaryFunction {
    public $task_processor_p$UnaryFunction() { super(extractFunctionNamed("TASK-PROCESSOR-P")); }
    public SubLObject processItem(SubLObject arg1) { return task_processor_p(arg1); }
  }

  @SubL(source = "cycl/task-processor.lisp", position = 13437) 
  public static final SubLObject tproc_name(SubLObject object) {
    checkType(object, $sym76$TASK_PROCESSOR_P);
    return object.getField2();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 13437) 
  public static final SubLObject tproc_process(SubLObject object) {
    checkType(object, $sym76$TASK_PROCESSOR_P);
    return object.getField3();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 13437) 
  public static final SubLObject _csetf_tproc_name(SubLObject object, SubLObject value) {
    checkType(object, $sym76$TASK_PROCESSOR_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 13437) 
  public static final SubLObject _csetf_tproc_process(SubLObject object, SubLObject value) {
    checkType(object, $sym76$TASK_PROCESSOR_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 13437) 
  public static final SubLObject _csetf_tproc_busy_p(SubLObject object, SubLObject value) {
    checkType(object, $sym76$TASK_PROCESSOR_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 13437) 
  public static final SubLObject _csetf_tproc_task_info(SubLObject object, SubLObject value) {
    checkType(object, $sym76$TASK_PROCESSOR_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 13437) 
  public static final SubLObject make_task_processor(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $task_processor_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw91$NAME)) {
            _csetf_tproc_name(v_new, current_value);
          } else if (pcase_var.eql($kw92$PROCESS)) {
            _csetf_tproc_process(v_new, current_value);
          } else if (pcase_var.eql($kw93$BUSY_P)) {
            _csetf_tproc_busy_p(v_new, current_value);
          } else if (pcase_var.eql($kw72$TASK_INFO)) {
            _csetf_tproc_task_info(v_new, current_value);
          } else {
            Errors.error($str41$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  public static final class $task_process_pool_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $lock; }
    public SubLObject getField3() { return $request_queue; }
    public SubLObject getField4() { return $request_semaphore; }
    public SubLObject getField5() { return $processors; }
    public SubLObject getField6() { return $background_msgs; }
    public SubLObject getField7() { return $process_name_prefix; }
    public SubLObject getField8() { return $min_nbr_of_task_processors; }
    public SubLObject getField9() { return $max_nbr_of_task_processors; }
    public SubLObject setField2(SubLObject value) { return $lock = value; }
    public SubLObject setField3(SubLObject value) { return $request_queue = value; }
    public SubLObject setField4(SubLObject value) { return $request_semaphore = value; }
    public SubLObject setField5(SubLObject value) { return $processors = value; }
    public SubLObject setField6(SubLObject value) { return $background_msgs = value; }
    public SubLObject setField7(SubLObject value) { return $process_name_prefix = value; }
    public SubLObject setField8(SubLObject value) { return $min_nbr_of_task_processors = value; }
    public SubLObject setField9(SubLObject value) { return $max_nbr_of_task_processors = value; }
    public SubLObject $lock = NIL;
    public SubLObject $request_queue = NIL;
    public SubLObject $request_semaphore = NIL;
    public SubLObject $processors = NIL;
    public SubLObject $background_msgs = NIL;
    public SubLObject $process_name_prefix = NIL;
    public SubLObject $min_nbr_of_task_processors = NIL;
    public SubLObject $max_nbr_of_task_processors = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($task_process_pool_native.class, $sym99$TASK_PROCESS_POOL, $sym100$TASK_PROCESS_POOL_P, $list101, $list102, new String[] {"$lock", "$request_queue", "$request_semaphore", "$processors", "$background_msgs", "$process_name_prefix", "$min_nbr_of_task_processors", "$max_nbr_of_task_processors"}, $list103, $list104, $sym105$PRINT_TASK_PROCESS_POOL);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static SubLSymbol $dtp_task_process_pool$ = null;

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject task_process_pool_p(SubLObject object) {
    return ((object.getClass() == $task_process_pool_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $task_process_pool_p$UnaryFunction extends UnaryFunction {
    public $task_process_pool_p$UnaryFunction() { super(extractFunctionNamed("TASK-PROCESS-POOL-P")); }
    public SubLObject processItem(SubLObject arg1) { return task_process_pool_p(arg1); }
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject tpool_lock(SubLObject object) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.getField2();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject tpool_request_queue(SubLObject object) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.getField3();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject tpool_request_semaphore(SubLObject object) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.getField4();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject tpool_processors(SubLObject object) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.getField5();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject tpool_background_msgs(SubLObject object) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.getField6();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject tpool_process_name_prefix(SubLObject object) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.getField7();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject tpool_max_nbr_of_task_processors(SubLObject object) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.getField9();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject _csetf_tpool_lock(SubLObject object, SubLObject value) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject _csetf_tpool_request_queue(SubLObject object, SubLObject value) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject _csetf_tpool_request_semaphore(SubLObject object, SubLObject value) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject _csetf_tpool_processors(SubLObject object, SubLObject value) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject _csetf_tpool_background_msgs(SubLObject object, SubLObject value) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject _csetf_tpool_process_name_prefix(SubLObject object, SubLObject value) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject _csetf_tpool_min_nbr_of_task_processors(SubLObject object, SubLObject value) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject _csetf_tpool_max_nbr_of_task_processors(SubLObject object, SubLObject value) {
    checkType(object, $sym100$TASK_PROCESS_POOL_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 15155) 
  public static final SubLObject make_task_process_pool(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $task_process_pool_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw123$LOCK)) {
            _csetf_tpool_lock(v_new, current_value);
          } else if (pcase_var.eql($kw124$REQUEST_QUEUE)) {
            _csetf_tpool_request_queue(v_new, current_value);
          } else if (pcase_var.eql($kw125$REQUEST_SEMAPHORE)) {
            _csetf_tpool_request_semaphore(v_new, current_value);
          } else if (pcase_var.eql($kw126$PROCESSORS)) {
            _csetf_tpool_processors(v_new, current_value);
          } else if (pcase_var.eql($kw127$BACKGROUND_MSGS)) {
            _csetf_tpool_background_msgs(v_new, current_value);
          } else if (pcase_var.eql($kw128$PROCESS_NAME_PREFIX)) {
            _csetf_tpool_process_name_prefix(v_new, current_value);
          } else if (pcase_var.eql($kw129$MIN_NBR_OF_TASK_PROCESSORS)) {
            _csetf_tpool_min_nbr_of_task_processors(v_new, current_value);
          } else if (pcase_var.eql($kw130$MAX_NBR_OF_TASK_PROCESSORS)) {
            _csetf_tpool_max_nbr_of_task_processors(v_new, current_value);
          } else {
            Errors.error($str41$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** @param TASK-PROCESS-POOL; task-process-pool-p
   Return T when there are task processors. */
  @SubL(source = "cycl/task-processor.lisp", position = 18127) 
  public static final SubLObject task_processors_initialized_p(SubLObject task_process_pool) {
    if ((NIL == task_process_pool_p(task_process_pool))) {
      return NIL;
    }
    return Types.listp(tpool_processors(task_process_pool));
  }

  @SubL(source = "cycl/task-processor.lisp", position = 18407) 
  public static SubLSymbol $task_request_queue_max_size$ = null;

  /** @param TASK-PROCESS-POOL; task-process-pool-p
   @return lock-p
   Return the task process pool lock object. */
  @SubL(source = "cycl/task-processor.lisp", position = 18463) 
  public static final SubLObject get_tpool_lock(SubLObject task_process_pool) {
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    return tpool_lock(task_process_pool);
  }

  /** @param LOCK; lock-p
   @param TASK-PROCESS-POOL; task-process-pool-p
   Sets the LOCK for TASK-PROCESS-POOL. */
  @SubL(source = "cycl/task-processor.lisp", position = 18720) 
  public static final SubLObject set_tpool_lock(SubLObject lock, SubLObject task_process_pool) {
    checkType(lock, $sym140$LOCK_P);
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    _csetf_tpool_lock(task_process_pool, lock);
    return NIL;
  }

  /** @param REQUEST-QUEUE; priority-queue-p
   @param TASK-PROCESS-POOL; task-process-pool-p
   Sets the REQUEST-QUEUE for TASK-PROCESS-POOL. */
  @SubL(source = "cycl/task-processor.lisp", position = 19324) 
  public static final SubLObject set_tpool_request_queue(SubLObject request_queue, SubLObject task_process_pool) {
    checkType(request_queue, $sym141$PRIORITY_QUEUE_P);
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    _csetf_tpool_request_queue(task_process_pool, request_queue);
    return NIL;
  }

  /** @param TASK-PROCESSOR; task-processor-p
   @param TASK-PROCESS-POOL; task-process-pool-p
   Pushes the TASK-PROCESSOR onto the list of task processors for TASK-PROCESS-POOL. */
  @SubL(source = "cycl/task-processor.lisp", position = 20339) 
  public static final SubLObject push_tpool_processor(SubLObject v_task_processor, SubLObject task_process_pool) {
    checkType(v_task_processor, $sym76$TASK_PROCESSOR_P);
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    {
      SubLObject task_processors = tpool_processors(task_process_pool);
      task_processors = cons(v_task_processor, task_processors);
      _csetf_tpool_processors(task_process_pool, task_processors);
    }
    return NIL;
  }

  /** The optional file path for the task processor pool background messages. */
  @SubL(source = "cycl/task-processor.lisp", position = 21249) 
  private static SubLSymbol $tpool_background_msg_path$ = null;

  /** The stream for the task processor pool background messages. */
  @SubL(source = "cycl/task-processor.lisp", position = 21379) 
  private static SubLSymbol $tpool_background_msg_stream$ = null;

  /** The lock used to serialize access for the task processor pool background messages. */
  @SubL(source = "cycl/task-processor.lisp", position = 21743) 
  private static SubLSymbol $tpool_background_msg_lock$ = null;

  /** @param MSG; stringp
   @param TASK-PROCESS-POOL; task-process-pool-p
   Pushes a diagnostic MSG on the background message list for TASK-PROCESS-POOL, or if
   a filepath is present, then the the message is output to the file stream. */
  @SubL(source = "cycl/task-processor.lisp", position = 21884) 
  public static final SubLObject push_tpool_background_msg(SubLObject msg, SubLObject task_process_pool) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(msg, $sym43$STRINGP);
      if ((NIL != task_process_pool)) {
        checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
      }
      if ((NIL == $tpool_background_msg_lock$.getGlobalValue())) {
        $tpool_background_msg_lock$.setGlobalValue(Locks.make_lock($str144$tpool_background_msg_lock));
      }
      {
        SubLObject lock = $tpool_background_msg_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          if ((NIL != $tpool_background_msg_path$.getGlobalValue())) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
              if ((!($tpool_background_msg_path$.getGlobalValue().isString()))) {
                Errors.error($str145$_A_is_not_a_valid_file_specificat, $tpool_background_msg_path$.getGlobalValue());
              }
            }
            if ((NIL == $tpool_background_msg_stream$.getGlobalValue())) {
              $tpool_background_msg_stream$.setGlobalValue(StreamsLow.open($tpool_background_msg_path$.getGlobalValue(), new SubLObject[] {$kw146$DIRECTION, $kw147$OUTPUT, $kw148$IF_DOES_NOT_EXIST, $kw149$CREATE, $kw150$IF_EXISTS, $kw151$OVERWRITE}));
            }
            print_high.princ($str152$_, $tpool_background_msg_stream$.getGlobalValue());
            print_high.princ(Threads.process_name(Threads.current_process()), $tpool_background_msg_stream$.getGlobalValue());
            print_high.princ($str153$_, $tpool_background_msg_stream$.getGlobalValue());
            streams_high.terpri($tpool_background_msg_stream$.getGlobalValue());
            print_high.princ($str154$__, $tpool_background_msg_stream$.getGlobalValue());
            print_high.princ(msg, $tpool_background_msg_stream$.getGlobalValue());
            streams_high.terpri($tpool_background_msg_stream$.getGlobalValue());
            streams_high.force_output($tpool_background_msg_stream$.getGlobalValue());
          } else {
            if ((NIL != task_process_pool)) {
              {
                SubLObject background_msgs = NIL;
                background_msgs = tpool_background_msgs(task_process_pool);
                background_msgs = cons(Sequences.cconcatenate(numeric_date_utilities.timestring(UNPROVIDED), new SubLObject[] {$str155$_, msg}), background_msgs);
                _csetf_tpool_background_msgs(task_process_pool, background_msgs);
              }
            }
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
      }
      return NIL;
    }
  }

  /** @param PROCESS-NAME-PREFIX; stringp
   @param TASK-PROCESS-POOL; task-process-pool-p
   Sets the PROCESS-NAME-PREFIX for processes in TASK-PROCESS-POOL. */
  @SubL(source = "cycl/task-processor.lisp", position = 24284) 
  public static final SubLObject set_tpool_process_name_prefix(SubLObject process_name_prefix, SubLObject task_process_pool) {
    checkType(process_name_prefix, $sym43$STRINGP);
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    _csetf_tpool_process_name_prefix(task_process_pool, process_name_prefix);
    return NIL;
  }

  /** @param TASK-PROCESS-POOL; task-process-pool-p
   @return stringp
   Return the process name prefix for processes in TASK-PROCESS-POOL. */
  @SubL(source = "cycl/task-processor.lisp", position = 24712) 
  public static final SubLObject get_tpool_process_name_prefix(SubLObject task_process_pool) {
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    return tpool_process_name_prefix(task_process_pool);
  }

  /** @param MIN-NBR-OF-TASK-PROCESSORS ; integerp
   @param TASK-PROCESS-POOL; task-process-pool-p
   Sets the MIN-NBR-OF-TASK-PROCESSORS in TASK-PROCESS-POOL. */
  @SubL(source = "cycl/task-processor.lisp", position = 25025) 
  public static final SubLObject set_tpool_min_nbr_of_task_processors(SubLObject min_nbr_of_task_processors, SubLObject task_process_pool) {
    checkType(min_nbr_of_task_processors, $sym1$INTEGERP);
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    _csetf_tpool_min_nbr_of_task_processors(task_process_pool, min_nbr_of_task_processors);
    return NIL;
  }

  /** @param MAX-NBR-OF-TASK-PROCESSORS ; integerp
   @param TASK-PROCESS-POOL; task-process-pool-p
   Sets the MAX-NBR-OF-TASK-PROCESSORS in TASK-PROCESS-POOL. */
  @SubL(source = "cycl/task-processor.lisp", position = 25818) 
  public static final SubLObject set_tpool_max_nbr_of_task_processors(SubLObject max_nbr_of_task_processors, SubLObject task_process_pool) {
    checkType(max_nbr_of_task_processors, $sym1$INTEGERP);
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    _csetf_tpool_max_nbr_of_task_processors(task_process_pool, max_nbr_of_task_processors);
    return NIL;
  }

  /** @param TASK-PROCESS-POOL; task-process-pool-p
   @return stringp
   Return the maximum number of task processors in TASK-PROCESS-POOL. */
  @SubL(source = "cycl/task-processor.lisp", position = 26284) 
  public static final SubLObject get_tpool_max_nbr_of_task_processors(SubLObject task_process_pool) {
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    return tpool_max_nbr_of_task_processors(task_process_pool);
  }

  /** @param TASK-PROCESS-POOL; task-process-pool-p
   @return integerp
   Return the number of processes in TASK-PROCESS-POOL. */
  @SubL(source = "cycl/task-processor.lisp", position = 26611) 
  public static final SubLObject get_nbr_of_task_processors(SubLObject task_process_pool) {
    return Sequences.length(tpool_processors(task_process_pool));
  }

  /** Result of eval-with-bindings function call. */
  @SubL(source = "cycl/task-processor.lisp", position = 26855) 
  private static SubLSymbol $eval_with_bindings$ = null;

  /** @param BINDINGS; nil or consp of two-element (var value) lists
   @form; atom or listp
   @eval-fn; functionp
   @return; atom or listp the result of evaluation
   Using EVAL-FN, evaluates FORM within the scope of specified variable BINDINGS. */
  @SubL(source = "cycl/task-processor.lisp", position = 27019) 
  public static final SubLObject eval_with_bindings(SubLObject v_bindings, SubLObject form, SubLObject eval_fn) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject form_to_eval = NIL;
        {
          SubLObject _prev_bind_0 = $eval_with_bindings$.currentBinding(thread);
          try {
            $eval_with_bindings$.bind(NIL, thread);
            form_to_eval = list($sym156$CLET, ConsesLow.append(v_bindings, NIL), list($sym157$CSETQ, $sym158$_EVAL_WITH_BINDINGS_, form));
            if ((Symbols.symbol_function($sym159$CYC_API_EVAL) == eval_fn)) {
              eval_in_api.cyc_api_eval(form_to_eval);
            } else if ((Symbols.symbol_function($sym160$EVAL) == eval_fn)) {
              Eval.eval(form_to_eval);
            } else {
              Functions.funcall(eval_fn, form_to_eval);
            }
            result = $eval_with_bindings$.getDynamicValue(thread);
          } finally {
            $eval_with_bindings$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Associates a process with its parent task-process-pool object. */
  @SubL(source = "cycl/task-processor.lisp", position = 27722) 
  private static SubLSymbol $process_to_task_process_pool$ = null;

  /** @param PROCESS; processp
   @return task-process-pool-p
   Returns the task-process-pool parent of the given process, or
   NIL if not found. */
  @SubL(source = "cycl/task-processor.lisp", position = 28211) 
  public static final SubLObject get_task_process_pool_for_process(SubLObject process) {
    checkType(process, $sym161$PROCESSP);
    return dictionary_utilities.synchronized_dictionary_lookup($process_to_task_process_pool$.getGlobalValue(), process, UNPROVIDED);
  }

  /** @param PROCESS; processp
   @param TASK-PROCESS-POOL; task-process-pool-p
   Adds the task-process-pool parent of the given process. */
  @SubL(source = "cycl/task-processor.lisp", position = 28530) 
  public static final SubLObject add_task_process_pool_for_process(SubLObject process, SubLObject task_process_pool) {
    checkType(process, $sym161$PROCESSP);
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    return dictionary_utilities.synchronized_dictionary_enter($process_to_task_process_pool$.getGlobalValue(), process, task_process_pool);
  }

  @SubL(source = "cycl/task-processor.lisp", position = 29212) 
  private static SubLSymbol $task_processes_being_worked_on_lock$ = null;

  /** LRU Cache of task-process-descriptions -> process objects.
   This is used to support task suspensions. */
  @SubL(source = "cycl/task-processor.lisp", position = 29403) 
  private static SubLSymbol $task_processes_being_worked_on$ = null;

  /** How many task processes we remember the cancellation of. */
  @SubL(source = "cycl/task-processor.lisp", position = 29569) 
  private static SubLSymbol $task_processes_worked_on_history$ = null;

  @SubL(source = "cycl/task-processor.lisp", position = 29692) 
  public static final SubLObject ensure_task_process_being_worked_on_initialized() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject lock = $task_processes_being_worked_on_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          if ((NIL == cache.cache_p($task_processes_being_worked_on$.getGlobalValue()))) {
            $task_processes_being_worked_on$.setGlobalValue(cache.new_cache($task_processes_worked_on_history$.getDynamicValue(thread), Symbols.symbol_function(EQUAL)));
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
      }
      return $task_processes_being_worked_on$.getGlobalValue();
    }
  }

  @SubL(source = "cycl/task-processor.lisp", position = 30108) 
  public static final SubLObject compute_task_process_description_from_task_info(SubLObject task_info) {
    return compute_task_process_description(get_task_info_id(task_info), get_task_info_giveback_info(task_info));
  }

  @SubL(source = "cycl/task-processor.lisp", position = 30317) 
  public static final SubLObject compute_task_process_description(SubLObject task_id, SubLObject giveback_info) {
    return cons(task_id, giveback_info);
  }

  /** Try to make this the active task, unless someone has already left us
   a reason to stop NOW. Return the reason for not permitted. */
  @SubL(source = "cycl/task-processor.lisp", position = 30559) 
  public static final SubLObject note_active_task_process_description_if_permitted(SubLObject task_info) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject signature = compute_task_process_description_from_task_info(task_info);
        SubLObject process = Threads.current_process();
        SubLObject retval = NIL;
        SubLObject lock = $task_processes_being_worked_on_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          ensure_task_process_being_worked_on_initialized();
          thread.resetMultipleValues();
          {
            SubLObject reason_to_stop_nowP = cache.cache_get($task_processes_being_worked_on$.getGlobalValue(), signature);
            SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == foundP)) {
              cache.cache_set($task_processes_being_worked_on$.getGlobalValue(), signature, process);
            } else {
              retval = reason_to_stop_nowP;
            }
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
        return retval;
      }
    }
  }

  @SubL(source = "cycl/task-processor.lisp", position = 31441) 
  public static final SubLObject note_inactive_task_process_description(SubLObject task_info) {
    {
      SubLObject signature = compute_task_process_description_from_task_info(task_info);
      SubLObject lock = $task_processes_being_worked_on_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        if ((NIL != cache.cache_p($task_processes_being_worked_on$.getGlobalValue()))) {
          cache.cache_remove($task_processes_being_worked_on$.getGlobalValue(), signature);
        }
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return task_info;
  }

  /** Find all of the tasks that are currently running for the passed in task-giveback-info
   and abort their processing tasks. */
  @SubL(source = "cycl/task-processor.lisp", position = 33200) 
  public static final SubLObject terminate_active_task_processes(SubLObject task_giveback_info) {
    {
      SubLObject lock = $task_processes_being_worked_on_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        if ((NIL != cache.cache_p($task_processes_being_worked_on$.getGlobalValue()))) {
          {
            SubLObject cache_var = $task_processes_being_worked_on$.getGlobalValue();
            SubLObject order_var = $kw166$NEWEST;
            SubLObject entry = cache.do_cache_first(cache_var, order_var);
            SubLObject task_process_description = NIL;
            SubLObject process_handling_task = NIL;
            while ((NIL == cache.do_cache_doneP(cache_var, entry))) {
              task_process_description = cache.do_cache_key(entry);
              process_handling_task = cache.do_cache_value(entry);
              entry = cache.do_cache_next(entry, order_var);
              {
                SubLObject current_giveback_info = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31798");
                if ((current_giveback_info.equal(task_giveback_info)
                     && (NIL != Threads.valid_process_p(process_handling_task)))) {
                  {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                      {
                        SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
                        try {
                          Dynamic.bind(Errors.$error_handler$, Symbols.symbol_function($sym168$IGNORE_ERRORS_HANDLER));
                          try {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31808");
                          } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                          }
                        } finally {
                          Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                      }
                    } catch (Throwable ccatch_env_var) {
                      ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw167$IGNORE_ERRORS_TARGET);
                    }
                  }
                }
              }
            }
          }
        }
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return task_giveback_info;
  }

  /** Dictionary of task-processor-type --> evaluation function.
   The evaluation function is CYC-API-EVAL for API requests,
   and could be EVAL for other task processor usage. */
  @SubL(source = "cycl/task-processor.lisp", position = 36430) 
  private static SubLSymbol $task_processor_eval_fn_dict$ = null;

  /** If set to T, dont send the request back; if set to NIL, send the request back. */
  @SubL(source = "cycl/task-processor.lisp", position = 36707) 
  private static SubLSymbol $minimize_task_processor_info_communication$ = null;

  /** Contains the current task processor info block that is being handled. */
  @SubL(source = "cycl/task-processor.lisp", position = 36861) 
  private static SubLSymbol $current_task_processor_info$ = null;

  /** the standard output stream for debugging within a task-processor-request */
  @SubL(source = "cycl/task-processor.lisp", position = 37086) 
  public static SubLSymbol $task_processor_standard_output$ = null;

  @SubL(source = "cycl/task-processor.lisp", position = 37482) 
  public static final SubLObject map_task_info_priority_to_process_priority(SubLObject priority) {
    return Numbers.max(Threads.$process_min_priority$.getGlobalValue(), Numbers.min(priority, Threads.$process_max_priority$.getGlobalValue()));
  }

  /** When awakened, repeatedly evaluate the highest priority
   request. */
  @SubL(source = "cycl/task-processor.lisp", position = 37757) 
  public static final SubLObject task_processor_handler() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject task_process_pool = get_task_process_pool_for_process(Threads.current_process());
        while ((NIL == task_process_pool)) {
          Threads.sleep($float182$0_001);
          task_process_pool = get_task_process_pool_for_process(Threads.current_process());
        }
      }
      {
        SubLObject catch_var = NIL;
        try {
          {
            SubLObject task_process_pool = get_task_process_pool_for_process(Threads.current_process());
            SubLObject v_task_processor = find_task_processor(Threads.process_name(Threads.current_process()), task_process_pool);
            SubLObject eval_fn = NIL;
            SubLObject task_info = NIL;
            SubLObject request = NIL;
            SubLObject response = NIL;
            SubLObject junk = NIL;
            SubLObject error_message = NIL;
            SubLObject dont_care_abort_reason = NIL;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
              if ((NIL == task_processor_p(v_task_processor))) {
                Errors.error($str184$Invalid_task_processor);
              }
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
              if ((NIL == task_process_pool_p(task_process_pool))) {
                Errors.error($str185$Invalid_task_process_pool);
              }
            }
            while (true) {
              task_info = NIL;
              response = NIL;
              error_message = NIL;
              try {
                _csetf_tproc_busy_p(v_task_processor, NIL);
                Semaphores.semaphore_wait(tpool_request_semaphore(task_process_pool));
                {
                  SubLObject lock = get_tpool_lock(task_process_pool);
                  SubLObject release = NIL;
                  try {
                    release = Locks.seize_lock(lock);
                    task_info = queues.p_dequeue(tpool_request_queue(task_process_pool), UNPROVIDED);
                  } finally {
                    if ((NIL != release)) {
                      Locks.release_lock(lock);
                    }
                  }
                }
                if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                  push_tpool_background_msg(PrintLow.format(NIL, $str186$Task_Info__S__, task_info), task_process_pool);
                }
                request = ti_request(task_info);
                _csetf_ti_task_processor_name(task_info, tproc_name(v_task_processor));
                _csetf_tproc_task_info(v_task_processor, task_info);
                eval_fn = dictionary.dictionary_lookup($task_processor_eval_fn_dict$.getGlobalValue(), ti_type(task_info), UNPROVIDED);
                try {
                  {
                    SubLObject _prev_bind_0 = $current_task_processor_info$.currentBinding(thread);
                    try {
                      $current_task_processor_info$.bind(task_info, thread);
                      {
                        SubLObject abort_reason = note_active_task_process_description_if_permitted(task_info);
                        SubLObject priority = get_task_info_priority(task_info);
                        Threads.set_process_priority(Threads.current_process(), map_task_info_priority_to_process_priority(priority));
                        if ((NIL == abort_reason)) {
                          try {
                            try {
                              {
                                SubLObject _prev_bind_0_4 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                  Errors.$error_handler$.bind($sym187$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                  try {
                                    response = eval_with_bindings(ti_bindings(task_info), request, eval_fn);
                                  } catch (Throwable catch_var_5) {
                                    Errors.handleThrowable(catch_var_5, NIL);
                                  }
                                } finally {
                                  Errors.$error_handler$.rebind(_prev_bind_0_4, thread);
                                }
                              }
                            } catch (Throwable ccatch_env_var) {
                              error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                          } catch (Throwable ccatch_env_var) {
                            abort_reason = Errors.handleThrowable(ccatch_env_var, $kw172$TERMINATE_PREMATURELY);
                          }
                          if ((NIL != abort_reason)) {
                            error_message = abort_reason;
                          }
                          if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                            push_tpool_background_msg(PrintLow.format(NIL, $str188$Response__S__, response), task_process_pool);
                            if (error_message.isString()) {
                              push_tpool_background_msg(PrintLow.format(NIL, $str189$Error_message__S__, error_message), task_process_pool);
                            }
                          }
                          _csetf_ti_response(task_info, response);
                          if ((abort_reason != $kw163$ABORT)) {
                            _csetf_ti_error_message(task_info, error_message);
                          }
                          try {
                            dispatch_task_processor_response(task_info, T);
                          } catch (Throwable ccatch_env_var) {
                            abort_reason = Errors.handleThrowable(ccatch_env_var, $kw172$TERMINATE_PREMATURELY);
                          }
                        }
                      }
                    } finally {
                      $current_task_processor_info$.rebind(_prev_bind_0, thread);
                    }
                  }
                } finally {
                  {
                    SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                      note_inactive_task_process_description(task_info);
                    } finally {
                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                  }
                }
              } catch (Throwable ccatch_env_var) {
                dont_care_abort_reason = Errors.handleThrowable(ccatch_env_var, $kw172$TERMINATE_PREMATURELY);
              }
            }
          }
        } catch (Throwable ccatch_env_var) {
          catch_var = Errors.handleThrowable(ccatch_env_var, $kw183$TASK_PROCESSOR_QUIT);
        }
      }
      return NIL;
    }
  }

  /** the default minimum number of task processors */
  @SubL(source = "cycl/task-processor.lisp", position = 42434) 
  public static SubLSymbol $min_nbr_of_task_processors$ = null;

  /** the default maximum number of task processors */
  @SubL(source = "cycl/task-processor.lisp", position = 42622) 
  public static SubLSymbol $max_nbr_of_task_processors$ = null;

  /** @param PROCESS-NAME-PREFIX; stringp
   @param MIN-NBR-OF-TASK-PROCESSORS; integerp
   @param MAX-NBR-OF-TASK-PROCESSORS; integerp
   @return task-process-pool-p
   Initialize the given minimum number of task processors. */
  @SubL(source = "cycl/task-processor.lisp", position = 42726) 
  public static final SubLObject initialize_task_processors(SubLObject process_name_prefix, SubLObject min_nbr_of_task_processors, SubLObject max_nbr_of_task_processors) {
    if ((process_name_prefix == UNPROVIDED)) {
      process_name_prefix = $str193$Task_processor_;
    }
    if ((min_nbr_of_task_processors == UNPROVIDED)) {
      min_nbr_of_task_processors = $min_nbr_of_task_processors$.getGlobalValue();
    }
    if ((max_nbr_of_task_processors == UNPROVIDED)) {
      max_nbr_of_task_processors = $max_nbr_of_task_processors$.getGlobalValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(min_nbr_of_task_processors, $sym1$INTEGERP);
      checkType(max_nbr_of_task_processors, $sym1$INTEGERP);
      checkType(process_name_prefix, $sym43$STRINGP);
      $task_processor_standard_output$.setDynamicValue(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
      {
        SubLObject task_process_pool = NIL;
        task_process_pool = make_task_process_pool(UNPROVIDED);
        set_tpool_process_name_prefix(process_name_prefix, task_process_pool);
        set_tpool_min_nbr_of_task_processors(min_nbr_of_task_processors, task_process_pool);
        set_tpool_max_nbr_of_task_processors(max_nbr_of_task_processors, task_process_pool);
        if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
          push_tpool_background_msg(PrintLow.format(NIL, $str194$Initializing_task_processors__), task_process_pool);
        }
        set_tpool_lock(Locks.make_lock(PrintLow.format(NIL, $str195$_alock, process_name_prefix)), task_process_pool);
        _csetf_tpool_request_semaphore(task_process_pool, Semaphores.new_semaphore($str196$task_pool_request_semaphore, ZERO_INTEGER));
        set_tpool_request_queue(queues.create_p_queue($task_request_queue_max_size$.getGlobalValue(), $sym15$TI_PRIORITY, UNPROVIDED), task_process_pool);
        {
          SubLObject i = NIL;
          for (i = ZERO_INTEGER; i.numL(min_nbr_of_task_processors); i = Numbers.add(i, ONE_INTEGER)) {
            add_new_task_processor_to_pool(task_process_pool);
          }
        }
        return task_process_pool;
      }
    }
  }

  /** @param TASK-PROCESS-POOL; task-process-pool-p
   Add a new task processor for the given TASK-PROCESS-POOL. */
  @SubL(source = "cycl/task-processor.lisp", position = 44353) 
  public static final SubLObject add_new_task_processor_to_pool(SubLObject task_process_pool) {
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    {
      SubLObject v_task_processor = make_task_processor(UNPROVIDED);
      SubLObject process_name_prefix = get_tpool_process_name_prefix(task_process_pool);
      SubLObject nbr_of_task_processors = get_nbr_of_task_processors(task_process_pool);
      _csetf_tproc_name(v_task_processor, PrintLow.format(NIL, $str197$_a_s, process_name_prefix, Numbers.add(nbr_of_task_processors, ONE_INTEGER)));
      _csetf_tproc_process(v_task_processor, Threads.make_process(tproc_name(v_task_processor), Symbols.symbol_function($sym198$TASK_PROCESSOR_HANDLER)));
      push_tpool_processor(v_task_processor, task_process_pool);
      add_task_process_pool_for_process(tproc_process(v_task_processor), task_process_pool);
    }
    return NIL;
  }

  /** @param PROCESS-NAME; stringp
   @param TASK-PROCESS-POOL; task-process-p
   @return task-processor-p or nil
   Return the task processor in TASK-PROCESS-POOL having PROCESS-NAME. 
   Return NIL if not found. */
  @SubL(source = "cycl/task-processor.lisp", position = 46955) 
  public static final SubLObject find_task_processor(SubLObject process_name, SubLObject task_process_pool) {
    checkType(process_name, $sym43$STRINGP);
    checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
    {
      SubLObject cdolist_list_var = tpool_processors(task_process_pool);
      SubLObject v_task_processor = NIL;
      for (v_task_processor = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_task_processor = cdolist_list_var.first()) {
        if ((NIL != Strings.stringE(process_name, tproc_name(v_task_processor), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
          return v_task_processor;
        }
      }
    }
    return NIL;
  }

  /** @param TASK-PROCESS-POOL; task-process-p
    Awaken the first N task-processor in TASK-PROCES-POOL having a NIL busy-p, depending upon
    the number of requests in the queue.
    Return T if found, otherwise return NIL. */
  @SubL(source = "cycl/task-processor.lisp", position = 47981) 
  public static final SubLObject awaken_first_available_task_processors(SubLObject task_process_pool) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (get_nbr_of_task_processors(task_process_pool).numL(get_tpool_max_nbr_of_task_processors(task_process_pool))) {
        if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
          push_tpool_background_msg(PrintLow.format(NIL, $str203$Allocating_a_new_task_processor__), task_process_pool);
        }
        add_new_task_processor_to_pool(task_process_pool);
      }
      push_tpool_background_msg(PrintLow.format(NIL, $str204$Awakening_first_available_task_pr), task_process_pool);
      Semaphores.semaphore_signal(tpool_request_semaphore(task_process_pool));
      return NIL;
    }
  }

  /** @param TASK-INFO; task-info-p
   @param TASK-PROCESS-POOL; task-process-p
   @param POSTPONE?; booleanp
   Enqueue the TASK-INFO on the TASK-PROCESS-POOL request queue and awaken the
   first available task processor within the scope of the queue lock. */
  @SubL(source = "cycl/task-processor.lisp", position = 48824) 
  public static final SubLObject enqueue_task_request(SubLObject task_info, SubLObject task_process_pool) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(task_info, $sym4$TASK_INFO_P);
      checkType(task_process_pool, $sym100$TASK_PROCESS_POOL_P);
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == tpool_processors(task_process_pool))) {
          Errors.error($str205$Task_processors_are_not_initializ);
        }
      }
      {
        SubLObject lock = tpool_lock(task_process_pool);
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          thread.resetMultipleValues();
          {
            SubLObject request_queue = queues.p_enqueue(task_info, tpool_request_queue(task_process_pool));
            SubLObject bumped_requestP = thread.secondMultipleValue();
            SubLObject bumped_request_item = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != bumped_requestP)) {
              Errors.cerror($str206$__Error__cannot_queue_task_reques, bumped_request_item);
            }
            awaken_first_available_task_processors(task_process_pool);
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
      }
      return NIL;
    }
  }

  /** Task process pool for requests. */
  @SubL(source = "cycl/task-processor.lisp", position = 53773) 
  public static SubLSymbol $api_task_process_pool$ = null;

  /** Task process pool lock to guarantee only a single instance is initialized. */
  @SubL(source = "cycl/task-processor.lisp", position = 53773) 
  public static SubLSymbol $api_task_process_pool_lock$ = null;

  /** Return T when there are task processors. */
  @SubL(source = "cycl/task-processor.lisp", position = 53773) 
  public static final SubLObject api_task_processors_initialized_p() {
    return task_processors_initialized_p($api_task_process_pool$.getGlobalValue());
  }

  /** Initialize the task processor pool for requests. */
  @SubL(source = "cycl/task-processor.lisp", position = 53773) 
  public static final SubLObject initialize_api_task_processors() {
    {
      SubLObject lock = $api_task_process_pool_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        if ((NIL != $api_task_process_pool$.getGlobalValue())) {
          Errors.error($str250$Illegal_attempt_to_reinitialize_p);
        }
        $api_task_process_pool$.setGlobalValue(initialize_task_processors(Sequences.cconcatenate($str251$API, $str201$_processor_), FIVE_INTEGER, $int192$25));
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return NIL;
  }

  /** Halt the task processors. */
  @SubL(source = "cycl/task-processor.lisp", position = 53773) 
  public static final SubLObject halt_api_task_processors() {
    {
      SubLObject lock = $api_task_process_pool_lock$.getGlobalValue();
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        if ((NIL != $api_task_process_pool$.getGlobalValue())) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31801");
          $api_task_process_pool$.setGlobalValue(NIL);
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31791");
        }
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return NIL;
  }

  /** @param REQUEST; consp for evaluation
   @param ID; integerp
   @param PRIORITY; intergerp
   @param REQUESTOR; stringp
   @param BINDINGS; consp of (var value) pairs
   @param UUID-STRING; stringp that identifies the client when aschronously returning the response
   Submits the REQUEST form to the task request queue with ID, PRIORITY,
   REQUESTOR, OUT-STREAM and BINDINGS.  If the request is wrapped with WITH-IMMEDIATE-EXECUTION, then
   the request is executed in this thread and the result enqueued on the response queue. */
  @SubL(source = "cycl/task-processor.lisp", position = 55009) 
  public static final SubLObject api_task_processor_request(SubLObject request, SubLObject id, SubLObject priority, SubLObject requestor, SubLObject v_bindings, SubLObject uuid_string) {
    {
      SubLObject immediate_executionP = Equality.eq(request.first(), $sym260$WITH_IMMEDIATE_EXECUTION);
      SubLObject task_info = make_task_info(UNPROVIDED);
      if ((NIL != immediate_executionP)) {
        request = conses_high.second(request);
      }
      set_task_info_type($kw261$API, task_info);
      set_task_info_id(id, task_info);
      set_task_info_priority(priority, task_info);
      set_task_info_requestor(requestor, task_info);
      set_task_info_giveback_info(uuid_string, task_info);
      set_task_info_bindings(v_bindings, task_info);
      set_task_info_request(request, task_info);
      enqueue_task_request(task_info, $api_task_process_pool$.getGlobalValue());
      return NIL;
    }
  }

  /** indicates that lease renewal requests should be displayed on the console. */
  @SubL(source = "cycl/task-processor.lisp", position = 56444) 
  private static SubLSymbol $java_api_lease_activity_display$ = null;

  /** Returns the indicator that lease renewal requests should be displayed on the console. */
  @SubL(source = "cycl/task-processor.lisp", position = 56897) 
  public static final SubLObject java_api_lease_activity_display() {
    return $java_api_lease_activity_display$.getGlobalValue();
  }

  @SubL(source = "cycl/task-processor.lisp", position = 57081) 
  public static final SubLObject dispatch_task_processor_response(SubLObject task_info, SubLObject finished) {
    if ((finished == UNPROVIDED)) {
      finished = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $minimize_task_processor_info_communication$.getDynamicValue(thread))) {
        set_task_info_request(NIL, task_info);
      }
      Functions.funcall(dictionary.dictionary_lookup($task_processor_response_dispatch_fn_dict$.getGlobalValue(), ti_type(task_info), UNPROVIDED), task_info, finished);
      return NIL;
    }
  }

  /** @param TASK-INFO; task-info-p
   @param FINISHED; booleanp
   Dispatches the api task-info item by sending the
response to the api client socket from which the
request originated. */
  @SubL(source = "cycl/task-processor.lisp", position = 57529) 
  public static final SubLObject dispatch_api_task_processor_response(SubLObject task_info, SubLObject finished) {
    if ((finished == UNPROVIDED)) {
      finished = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ($task_processor_verbosity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
        push_tpool_background_msg(PrintLow.format(NIL, $str263$Dispatching_api_response__S__, task_info), $api_task_process_pool$.getGlobalValue());
      }
      {
        SubLObject uuid_string = get_task_info_giveback_info(task_info);
        SubLObject task_processor_response = list($sym264$TASK_PROCESSOR_RESPONSE, get_task_info_request(task_info), get_task_info_id(task_info), get_task_info_priority(task_info), get_task_info_requestor(task_info), get_task_info_response(task_info), get_task_info_error_message(task_info), finished);
        SubLObject socket = java_api_kernel.java_api_socket_out_stream(uuid_string);
        SubLObject lock = java_api_kernel.java_api_lock(uuid_string);
        {
          SubLObject _prev_bind_0 = cfasl_kb_methods.$within_complete_cfasl_objects$.currentBinding(thread);
          try {
            cfasl_kb_methods.$within_complete_cfasl_objects$.bind(T, thread);
            if ((socket.isStream()
                 && (NIL != streams_high.open_stream_p(socket)))) {
              cfasl_kernel.cfasl_set_mode_externalized();
              if (get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                push_tpool_background_msg(PrintLow.format(NIL, $str265$Sending_api_response__S_to_socket, new SubLObject[] {get_task_info_response(task_info), socket, uuid_string}), $api_task_process_pool$.getGlobalValue());
              }
              {
                SubLObject lock_6 = lock;
                SubLObject release = NIL;
                try {
                  release = Locks.seize_lock(lock_6);
                  cfasl_kernel.send_cfasl_result(socket, task_processor_response, NIL);
                } finally {
                  if ((NIL != release)) {
                    Locks.release_lock(lock_6);
                  }
                }
              }
            } else {
              if (get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                push_tpool_background_msg(PrintLow.format(NIL, $str266$Dropping_api_response__S__socket_, new SubLObject[] {task_processor_response, socket, uuid_string}), $api_task_process_pool$.getGlobalValue());
              }
            }
          } finally {
            cfasl_kb_methods.$within_complete_cfasl_objects$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  /** Task process pool for requests. */
  @SubL(source = "cycl/task-processor.lisp", position = 62412) 
  public static SubLSymbol $bg_task_process_pool$ = null;

  /** Task process pool lock to guarantee only a single instance is initialized. */
  @SubL(source = "cycl/task-processor.lisp", position = 62412) 
  public static SubLSymbol $bg_task_process_pool_lock$ = null;

  /** Dictionary of requestor-process --> response task-info. */
  @SubL(source = "cycl/task-processor.lisp", position = 64244) 
  private static SubLSymbol $bg_task_processor_response_dict$ = null;

  /** Serial number of background task processor requests. */
  @SubL(source = "cycl/task-processor.lisp", position = 64534) 
  private static SubLSymbol $bg_task_processor_request_id$ = null;

  /** Task process pool for requests. */
  @SubL(source = "cycl/task-processor.lisp", position = 66549) 
  public static SubLSymbol $console_task_process_pool$ = null;

  /** Task process pool lock to guarantee only a single instance is initialized. */
  @SubL(source = "cycl/task-processor.lisp", position = 66549) 
  public static SubLSymbol $console_task_process_pool_lock$ = null;

  /** Id (serial number) assigned to console task processing requests. */
  @SubL(source = "cycl/task-processor.lisp", position = 66965) 
  private static SubLSymbol $task_processor_console_id$ = null;

  public static final SubLObject declare_task_processor_file() {
    declareFunction(myName, "get_task_processor_verbosity", "GET-TASK-PROCESSOR-VERBOSITY", 0, 0, false);
    declareFunction(myName, "set_task_processor_verbosity", "SET-TASK-PROCESSOR-VERBOSITY", 1, 0, false);
    declareFunction(myName, "task_info_print_function_trampoline", "TASK-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "task_info_p", "TASK-INFO-P", 1, 0, false); new $task_info_p$UnaryFunction();
    declareFunction(myName, "ti_type", "TI-TYPE", 1, 0, false);
    declareFunction(myName, "ti_id", "TI-ID", 1, 0, false);
    declareFunction(myName, "ti_priority", "TI-PRIORITY", 1, 0, false);
    declareFunction(myName, "ti_requestor", "TI-REQUESTOR", 1, 0, false);
    declareFunction(myName, "ti_giveback_info", "TI-GIVEBACK-INFO", 1, 0, false);
    declareFunction(myName, "ti_bindings", "TI-BINDINGS", 1, 0, false);
    declareFunction(myName, "ti_request", "TI-REQUEST", 1, 0, false);
    declareFunction(myName, "ti_response", "TI-RESPONSE", 1, 0, false);
    declareFunction(myName, "ti_error_message", "TI-ERROR-MESSAGE", 1, 0, false);
    declareFunction(myName, "ti_task_processor_name", "TI-TASK-PROCESSOR-NAME", 1, 0, false);
    declareFunction(myName, "_csetf_ti_type", "_CSETF-TI-TYPE", 2, 0, false);
    declareFunction(myName, "_csetf_ti_id", "_CSETF-TI-ID", 2, 0, false);
    declareFunction(myName, "_csetf_ti_priority", "_CSETF-TI-PRIORITY", 2, 0, false);
    declareFunction(myName, "_csetf_ti_requestor", "_CSETF-TI-REQUESTOR", 2, 0, false);
    declareFunction(myName, "_csetf_ti_giveback_info", "_CSETF-TI-GIVEBACK-INFO", 2, 0, false);
    declareFunction(myName, "_csetf_ti_bindings", "_CSETF-TI-BINDINGS", 2, 0, false);
    declareFunction(myName, "_csetf_ti_request", "_CSETF-TI-REQUEST", 2, 0, false);
    declareFunction(myName, "_csetf_ti_response", "_CSETF-TI-RESPONSE", 2, 0, false);
    declareFunction(myName, "_csetf_ti_error_message", "_CSETF-TI-ERROR-MESSAGE", 2, 0, false);
    declareFunction(myName, "_csetf_ti_task_processor_name", "_CSETF-TI-TASK-PROCESSOR-NAME", 2, 0, false);
    declareFunction(myName, "make_task_info", "MAKE-TASK-INFO", 0, 1, false);
    declareFunction(myName, "get_task_info_type", "GET-TASK-INFO-TYPE", 1, 0, false);
    declareFunction(myName, "set_task_info_type", "SET-TASK-INFO-TYPE", 2, 0, false);
    declareFunction(myName, "get_task_info_id", "GET-TASK-INFO-ID", 1, 0, false);
    declareFunction(myName, "set_task_info_id", "SET-TASK-INFO-ID", 2, 0, false);
    declareFunction(myName, "get_task_info_priority", "GET-TASK-INFO-PRIORITY", 1, 0, false);
    declareFunction(myName, "set_task_info_priority", "SET-TASK-INFO-PRIORITY", 2, 0, false);
    declareFunction(myName, "get_task_info_requestor", "GET-TASK-INFO-REQUESTOR", 1, 0, false);
    declareFunction(myName, "set_task_info_requestor", "SET-TASK-INFO-REQUESTOR", 2, 0, false);
    declareFunction(myName, "get_task_info_giveback_info", "GET-TASK-INFO-GIVEBACK-INFO", 1, 0, false);
    declareFunction(myName, "set_task_info_giveback_info", "SET-TASK-INFO-GIVEBACK-INFO", 2, 0, false);
    declareFunction(myName, "get_task_info_bindings", "GET-TASK-INFO-BINDINGS", 1, 0, false);
    declareFunction(myName, "set_task_info_bindings", "SET-TASK-INFO-BINDINGS", 2, 0, false);
    declareFunction(myName, "get_task_info_request", "GET-TASK-INFO-REQUEST", 1, 0, false);
    declareFunction(myName, "set_task_info_request", "SET-TASK-INFO-REQUEST", 2, 0, false);
    declareFunction(myName, "get_task_info_response", "GET-TASK-INFO-RESPONSE", 1, 0, false);
    declareFunction(myName, "set_task_info_response", "SET-TASK-INFO-RESPONSE", 2, 0, false);
    declareFunction(myName, "get_task_info_error_message", "GET-TASK-INFO-ERROR-MESSAGE", 1, 0, false);
    declareFunction(myName, "set_task_info_error_message", "SET-TASK-INFO-ERROR-MESSAGE", 2, 0, false);
    declareFunction(myName, "get_task_info_task_processor_name", "GET-TASK-INFO-TASK-PROCESSOR-NAME", 1, 0, false);
    declareFunction(myName, "set_task_info_task_processor_name", "SET-TASK-INFO-TASK-PROCESSOR-NAME", 2, 0, false);
    declareFunction(myName, "print_task_info", "PRINT-TASK-INFO", 3, 0, false);
    declareFunction(myName, "task_result_set_print_function_trampoline", "TASK-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "task_result_set_p", "TASK-RESULT-SET-P", 1, 0, false); new $task_result_set_p$UnaryFunction();
    declareFunction(myName, "task_result_set_result", "TASK-RESULT-SET-RESULT", 1, 0, false);
    declareFunction(myName, "task_result_set_task_info", "TASK-RESULT-SET-TASK-INFO", 1, 0, false);
    declareFunction(myName, "task_result_set_finished", "TASK-RESULT-SET-FINISHED", 1, 0, false);
    declareFunction(myName, "_csetf_task_result_set_result", "_CSETF-TASK-RESULT-SET-RESULT", 2, 0, false);
    declareFunction(myName, "_csetf_task_result_set_task_info", "_CSETF-TASK-RESULT-SET-TASK-INFO", 2, 0, false);
    declareFunction(myName, "_csetf_task_result_set_finished", "_CSETF-TASK-RESULT-SET-FINISHED", 2, 0, false);
    declareFunction(myName, "make_task_result_set", "MAKE-TASK-RESULT-SET", 0, 1, false);
    declareFunction(myName, "new_task_result_set", "NEW-TASK-RESULT-SET", 3, 0, false);
    declareFunction(myName, "task_result_set_priority", "TASK-RESULT-SET-PRIORITY", 1, 0, false);
    declareFunction(myName, "task_processor_print_function_trampoline", "TASK-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "task_processor_p", "TASK-PROCESSOR-P", 1, 0, false); new $task_processor_p$UnaryFunction();
    declareFunction(myName, "tproc_name", "TPROC-NAME", 1, 0, false);
    declareFunction(myName, "tproc_process", "TPROC-PROCESS", 1, 0, false);
    declareFunction(myName, "tproc_busy_p", "TPROC-BUSY-P", 1, 0, false);
    declareFunction(myName, "tproc_task_info", "TPROC-TASK-INFO", 1, 0, false);
    declareFunction(myName, "_csetf_tproc_name", "_CSETF-TPROC-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_tproc_process", "_CSETF-TPROC-PROCESS", 2, 0, false);
    declareFunction(myName, "_csetf_tproc_busy_p", "_CSETF-TPROC-BUSY-P", 2, 0, false);
    declareFunction(myName, "_csetf_tproc_task_info", "_CSETF-TPROC-TASK-INFO", 2, 0, false);
    declareFunction(myName, "make_task_processor", "MAKE-TASK-PROCESSOR", 0, 1, false);
    declareFunction(myName, "print_task_processor", "PRINT-TASK-PROCESSOR", 3, 0, false);
    declareFunction(myName, "task_process_pool_print_function_trampoline", "TASK-PROCESS-POOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "task_process_pool_p", "TASK-PROCESS-POOL-P", 1, 0, false); new $task_process_pool_p$UnaryFunction();
    declareFunction(myName, "tpool_lock", "TPOOL-LOCK", 1, 0, false);
    declareFunction(myName, "tpool_request_queue", "TPOOL-REQUEST-QUEUE", 1, 0, false);
    declareFunction(myName, "tpool_request_semaphore", "TPOOL-REQUEST-SEMAPHORE", 1, 0, false);
    declareFunction(myName, "tpool_processors", "TPOOL-PROCESSORS", 1, 0, false);
    declareFunction(myName, "tpool_background_msgs", "TPOOL-BACKGROUND-MSGS", 1, 0, false);
    declareFunction(myName, "tpool_process_name_prefix", "TPOOL-PROCESS-NAME-PREFIX", 1, 0, false);
    declareFunction(myName, "tpool_min_nbr_of_task_processors", "TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false);
    declareFunction(myName, "tpool_max_nbr_of_task_processors", "TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false);
    declareFunction(myName, "_csetf_tpool_lock", "_CSETF-TPOOL-LOCK", 2, 0, false);
    declareFunction(myName, "_csetf_tpool_request_queue", "_CSETF-TPOOL-REQUEST-QUEUE", 2, 0, false);
    declareFunction(myName, "_csetf_tpool_request_semaphore", "_CSETF-TPOOL-REQUEST-SEMAPHORE", 2, 0, false);
    declareFunction(myName, "_csetf_tpool_processors", "_CSETF-TPOOL-PROCESSORS", 2, 0, false);
    declareFunction(myName, "_csetf_tpool_background_msgs", "_CSETF-TPOOL-BACKGROUND-MSGS", 2, 0, false);
    declareFunction(myName, "_csetf_tpool_process_name_prefix", "_CSETF-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false);
    declareFunction(myName, "_csetf_tpool_min_nbr_of_task_processors", "_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false);
    declareFunction(myName, "_csetf_tpool_max_nbr_of_task_processors", "_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false);
    declareFunction(myName, "make_task_process_pool", "MAKE-TASK-PROCESS-POOL", 0, 1, false);
    declareFunction(myName, "print_task_process_pool", "PRINT-TASK-PROCESS-POOL", 3, 0, false);
    declareFunction(myName, "display_task_processors", "DISPLAY-TASK-PROCESSORS", 1, 1, false);
    declareFunction(myName, "display_active_task_processes", "DISPLAY-ACTIVE-TASK-PROCESSES", 0, 1, false);
    declareFunction(myName, "task_processors_initialized_p", "TASK-PROCESSORS-INITIALIZED-P", 1, 0, false);
    declareFunction(myName, "get_tpool_lock", "GET-TPOOL-LOCK", 1, 0, false);
    declareFunction(myName, "set_tpool_lock", "SET-TPOOL-LOCK", 2, 0, false);
    declareFunction(myName, "get_tpool_request_queue", "GET-TPOOL-REQUEST-QUEUE", 1, 0, false);
    declareFunction(myName, "set_tpool_request_queue", "SET-TPOOL-REQUEST-QUEUE", 2, 0, false);
    declareFunction(myName, "get_tpool_processors", "GET-TPOOL-PROCESSORS", 1, 0, false);
    declareFunction(myName, "get_tpool_processors_nbr", "GET-TPOOL-PROCESSORS-NBR", 1, 0, false);
    declareFunction(myName, "push_tpool_processor", "PUSH-TPOOL-PROCESSOR", 2, 0, false);
    declareFunction(myName, "set_tpool_processors", "SET-TPOOL-PROCESSORS", 2, 0, false);
    declareFunction(myName, "set_tpool_background_msg_path", "SET-TPOOL-BACKGROUND-MSG-PATH", 1, 0, false);
    declareFunction(myName, "push_tpool_background_msg", "PUSH-TPOOL-BACKGROUND-MSG", 2, 0, false);
    declareFunction(myName, "show_tp_msgs", "SHOW-TP-MSGS", 1, 0, false);
    declareFunction(myName, "show_tp_msgs_with_process_name", "SHOW-TP-MSGS-WITH-PROCESS-NAME", 1, 0, false);
    declareFunction(myName, "set_tpool_process_name_prefix", "SET-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false);
    declareFunction(myName, "get_tpool_process_name_prefix", "GET-TPOOL-PROCESS-NAME-PREFIX", 1, 0, false);
    declareFunction(myName, "set_tpool_min_nbr_of_task_processors", "SET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false);
    declareFunction(myName, "get_tpool_min_nbr_of_task_processors", "GET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false);
    declareFunction(myName, "set_tpool_max_nbr_of_task_processors", "SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false);
    declareFunction(myName, "get_tpool_max_nbr_of_task_processors", "GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false);
    declareFunction(myName, "get_nbr_of_task_processors", "GET-NBR-OF-TASK-PROCESSORS", 1, 0, false);
    declareFunction(myName, "eval_with_bindings", "EVAL-WITH-BINDINGS", 3, 0, false);
    declareFunction(myName, "get_task_process_pool_for_process", "GET-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false);
    declareFunction(myName, "add_task_process_pool_for_process", "ADD-TASK-PROCESS-POOL-FOR-PROCESS", 2, 0, false);
    declareFunction(myName, "remove_task_process_pool_for_process", "REMOVE-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false);
    declareFunction(myName, "ensure_task_process_being_worked_on_initialized", "ENSURE-TASK-PROCESS-BEING-WORKED-ON-INITIALIZED", 0, 0, false);
    declareFunction(myName, "compute_task_process_description_from_task_info", "COMPUTE-TASK-PROCESS-DESCRIPTION-FROM-TASK-INFO", 1, 0, false);
    declareFunction(myName, "compute_task_process_description", "COMPUTE-TASK-PROCESS-DESCRIPTION", 2, 0, false);
    declareFunction(myName, "get_giveback_info_from_task_process_description", "GET-GIVEBACK-INFO-FROM-TASK-PROCESS-DESCRIPTION", 1, 0, false);
    declareFunction(myName, "note_active_task_process_description_if_permitted", "NOTE-ACTIVE-TASK-PROCESS-DESCRIPTION-IF-PERMITTED", 1, 0, false);
    declareFunction(myName, "note_inactive_task_process_description", "NOTE-INACTIVE-TASK-PROCESS-DESCRIPTION", 1, 0, false);
    declareFunction(myName, "task_process_termination_reason_p", "TASK-PROCESS-TERMINATION-REASON-P", 1, 0, false);
    declareFunction(myName, "terminate_active_task_process", "TERMINATE-ACTIVE-TASK-PROCESS", 3, 0, false);
    declareFunction(myName, "terminate_active_task_processes", "TERMINATE-ACTIVE-TASK-PROCESSES", 1, 0, false);
    declareFunction(myName, "signal_terminate_active_task_process", "SIGNAL-TERMINATE-ACTIVE-TASK-PROCESS", 4, 0, false);
    declareFunction(myName, "signal_abort_active_task_process", "SIGNAL-ABORT-ACTIVE-TASK-PROCESS", 2, 0, false);
    declareFunction(myName, "signal_cancel_active_task_process", "SIGNAL-CANCEL-ACTIVE-TASK-PROCESS", 2, 0, false);
    declareMacro(myName, "catch_task_processor_termination", "CATCH-TASK-PROCESSOR-TERMINATION");
    declareMacro(myName, "catch_task_processor_termination_quietly", "CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY");
    declareFunction(myName, "get_current_task_processor_info", "GET-CURRENT-TASK-PROCESSOR-INFO", 0, 0, false);
    declareFunction(myName, "get_current_task_processor_client", "GET-CURRENT-TASK-PROCESSOR-CLIENT", 0, 0, false);
    declareFunction(myName, "map_task_info_priority_to_process_priority", "MAP-TASK-INFO-PRIORITY-TO-PROCESS-PRIORITY", 1, 0, false);
    declareFunction(myName, "task_processor_handler", "TASK-PROCESSOR-HANDLER", 0, 0, false);
    declareFunction(myName, "post_task_info_processor_partial_results", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS", 1, 0, false);
    declareFunction(myName, "post_task_info_processor_partial_results_internal", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS-INTERNAL", 2, 0, false);
    declareFunction(myName, "initialize_task_processors", "INITIALIZE-TASK-PROCESSORS", 0, 3, false);
    declareFunction(myName, "add_new_task_processor_to_pool", "ADD-NEW-TASK-PROCESSOR-TO-POOL", 1, 0, false);
    declareFunction(myName, "halt_task_processors", "HALT-TASK-PROCESSORS", 1, 0, false);
    declareFunction(myName, "halt_task_processor", "HALT-TASK-PROCESSOR", 1, 0, false);
    declareFunction(myName, "halt_task_processor_via_interrupt", "HALT-TASK-PROCESSOR-VIA-INTERRUPT", 1, 0, false);
    declareFunction(myName, "ensure_task_processors_killed", "ENSURE-TASK-PROCESSORS-KILLED", 1, 0, false);
    declareFunction(myName, "task_processor_quit", "TASK-PROCESSOR-QUIT", 0, 0, false);
    declareFunction(myName, "find_task_processor", "FIND-TASK-PROCESSOR", 2, 0, false);
    declareFunction(myName, "find_task_process_pool", "FIND-TASK-PROCESS-POOL", 1, 0, false);
    declareFunction(myName, "awaken_first_available_task_processors", "AWAKEN-FIRST-AVAILABLE-TASK-PROCESSORS", 1, 0, false);
    declareFunction(myName, "enqueue_task_request", "ENQUEUE-TASK-REQUEST", 2, 0, false);
    declareMacro(myName, "declare_task_process_pool", "DECLARE-TASK-PROCESS-POOL");
    declareMacro(myName, "declare_task_process_request", "DECLARE-TASK-PROCESS-REQUEST");
    declareMacro(myName, "declare_task_process_response_dispatch", "DECLARE-TASK-PROCESS-RESPONSE-DISPATCH");
    declareFunction(myName, "api_task_processors_initialized_p", "API-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
    declareFunction(myName, "initialize_api_task_processors", "INITIALIZE-API-TASK-PROCESSORS", 0, 0, false);
    declareFunction(myName, "halt_api_task_processors", "HALT-API-TASK-PROCESSORS", 0, 0, false);
    declareFunction(myName, "show_api_tp_msgs", "SHOW-API-TP-MSGS", 0, 0, false);
    declareFunction(myName, "show_api_task_processors", "SHOW-API-TASK-PROCESSORS", 0, 0, false);
    declareFunction(myName, "display_api_task_processors", "DISPLAY-API-TASK-PROCESSORS", 0, 0, false);
    declareFunction(myName, "api_task_processor_request", "API-TASK-PROCESSOR-REQUEST", 6, 0, false);
    declareFunction(myName, "set_java_api_lease_activity_display", "SET-JAVA-API-LEASE-ACTIVITY-DISPLAY", 1, 0, false);
    declareFunction(myName, "java_api_lease_activity_display", "JAVA-API-LEASE-ACTIVITY-DISPLAY", 0, 0, false);
    declareFunction(myName, "dispatch_task_processor_response", "DISPATCH-TASK-PROCESSOR-RESPONSE", 1, 1, false);
    declareFunction(myName, "dispatch_api_task_processor_response", "DISPATCH-API-TASK-PROCESSOR-RESPONSE", 1, 1, false);
    declareFunction(myName, "new_intermediate_results_accumulator", "NEW-INTERMEDIATE-RESULTS-ACCUMULATOR", 1, 0, false);
    declareFunction(myName, "intermediate_results_accumulator_add", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD", 2, 0, false);
    declareFunction(myName, "intermediate_results_accumulator_add_all", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD-ALL", 2, 0, false);
    declareFunction(myName, "intermediate_results_accumulator_reset", "INTERMEDIATE-RESULTS-ACCUMULATOR-RESET", 1, 0, false);
    declareFunction(myName, "intermediate_results_accumulator_size", "INTERMEDIATE-RESULTS-ACCUMULATOR-SIZE", 1, 0, false);
    declareFunction(myName, "intermediate_results_accumulator_contents", "INTERMEDIATE-RESULTS-ACCUMULATOR-CONTENTS", 1, 1, false);
    declareFunction(myName, "intermediate_results_accumulator_iterator", "INTERMEDIATE-RESULTS-ACCUMULATOR-ITERATOR", 1, 0, false);
    declareFunction(myName, "bg_task_processors_initialized_p", "BG-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
    declareFunction(myName, "initialize_bg_task_processors", "INITIALIZE-BG-TASK-PROCESSORS", 0, 0, false);
    declareFunction(myName, "halt_bg_task_processors", "HALT-BG-TASK-PROCESSORS", 0, 0, false);
    declareFunction(myName, "show_bg_tp_msgs", "SHOW-BG-TP-MSGS", 0, 0, false);
    declareFunction(myName, "bg_task_processor_request", "BG-TASK-PROCESSOR-REQUEST", 6, 0, false);
    declareFunction(myName, "dispatch_bg_task_processor_response", "DISPATCH-BG-TASK-PROCESSOR-RESPONSE", 1, 0, false);
    declareFunction(myName, "bg_api_eval", "BG-API-EVAL", 1, 0, false);
    declareFunction(myName, "console_task_processors_initialized_p", "CONSOLE-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
    declareFunction(myName, "initialize_console_task_processors", "INITIALIZE-CONSOLE-TASK-PROCESSORS", 0, 0, false);
    declareFunction(myName, "halt_console_task_processors", "HALT-CONSOLE-TASK-PROCESSORS", 0, 0, false);
    declareFunction(myName, "show_console_tp_msgs", "SHOW-CONSOLE-TP-MSGS", 0, 0, false);
    declareFunction(myName, "console_task_processor_request", "CONSOLE-TASK-PROCESSOR-REQUEST", 2, 0, false);
    declareFunction(myName, "dispatch_console_task_processor_response", "DISPATCH-CONSOLE-TASK-PROCESSOR-RESPONSE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_task_processor_file() {
    $task_processor_verbosity$ = defparameter("*TASK-PROCESSOR-VERBOSITY*", ZERO_INTEGER);
    $dtp_task_info$ = defconstant("*DTP-TASK-INFO*", $sym3$TASK_INFO);
    $dtp_task_result_set$ = defconstant("*DTP-TASK-RESULT-SET*", $sym57$TASK_RESULT_SET);
    $task_processor_response_dispatch_fn_dict$ = deflexical("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*", NIL);
    $dtp_task_processor$ = defconstant("*DTP-TASK-PROCESSOR*", $sym75$TASK_PROCESSOR);
    $dtp_task_process_pool$ = defconstant("*DTP-TASK-PROCESS-POOL*", $sym99$TASK_PROCESS_POOL);
    $task_request_queue_max_size$ = defconstant("*TASK-REQUEST-QUEUE-MAX-SIZE*", $int139$500);
    $tpool_background_msg_path$ = deflexical("*TPOOL-BACKGROUND-MSG-PATH*", NIL);
    $tpool_background_msg_stream$ = deflexical("*TPOOL-BACKGROUND-MSG-STREAM*", NIL);
    $tpool_background_msg_lock$ = deflexical("*TPOOL-BACKGROUND-MSG-LOCK*", NIL);
    $eval_with_bindings$ = defparameter("*EVAL-WITH-BINDINGS*", NIL);
    $process_to_task_process_pool$ = deflexical("*PROCESS-TO-TASK-PROCESS-POOL*", dictionary_utilities.new_synchronized_dictionary(UNPROVIDED, UNPROVIDED));
    $task_processes_being_worked_on_lock$ = deflexical("*TASK-PROCESSES-BEING-WORKED-ON-LOCK*", Locks.make_lock($str162$Task_processes_being_worked_on));
    $task_processes_being_worked_on$ = deflexical("*TASK-PROCESSES-BEING-WORKED-ON*", NIL);
    $task_processes_worked_on_history$ = defparameter("*TASK-PROCESSES-WORKED-ON-HISTORY*", $int139$500);
    $task_processor_eval_fn_dict$ = deflexical("*TASK-PROCESSOR-EVAL-FN-DICT*", NIL);
    $minimize_task_processor_info_communication$ = defparameter("*MINIMIZE-TASK-PROCESSOR-INFO-COMMUNICATION*", T);
    $current_task_processor_info$ = defparameter("*CURRENT-TASK-PROCESSOR-INFO*", NIL);
    $task_processor_standard_output$ = defparameter("*TASK-PROCESSOR-STANDARD-OUTPUT*", StreamsLow.$standard_output$.getDynamicValue());
    $min_nbr_of_task_processors$ = defconstant("*MIN-NBR-OF-TASK-PROCESSORS*", FIVE_INTEGER);
    $max_nbr_of_task_processors$ = defconstant("*MAX-NBR-OF-TASK-PROCESSORS*", $int192$25);
    $api_task_process_pool$ = deflexical("*API-TASK-PROCESS-POOL*", NIL);
    $api_task_process_pool_lock$ = defconstant("*API-TASK-PROCESS-POOL-LOCK*", Locks.make_lock($str249$task_processor_initialization_loc));
    $java_api_lease_activity_display$ = deflexical("*JAVA-API-LEASE-ACTIVITY-DISPLAY*", NIL);
    $bg_task_process_pool$ = deflexical("*BG-TASK-PROCESS-POOL*", NIL);
    $bg_task_process_pool_lock$ = defconstant("*BG-TASK-PROCESS-POOL-LOCK*", Locks.make_lock($str249$task_processor_initialization_loc));
    $bg_task_processor_response_dict$ = deflexical("*BG-TASK-PROCESSOR-RESPONSE-DICT*", NIL);
    $bg_task_processor_request_id$ = deflexical("*BG-TASK-PROCESSOR-REQUEST-ID*", ZERO_INTEGER);
    $console_task_process_pool$ = deflexical("*CONSOLE-TASK-PROCESS-POOL*", NIL);
    $console_task_process_pool_lock$ = defconstant("*CONSOLE-TASK-PROCESS-POOL-LOCK*", Locks.make_lock($str249$task_processor_initialization_loc));
    $task_processor_console_id$ = deflexical("*TASK-PROCESSOR-CONSOLE-ID*", maybeDefault( $sym281$_TASK_PROCESSOR_CONSOLE_ID_, $task_processor_console_id$, ()-> (ZERO_INTEGER)));
    return NIL;
  }

  public static final SubLObject setup_task_processor_file() {
        access_macros.register_external_symbol($sym0$SET_TASK_PROCESSOR_VERBOSITY);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_task_info$.getGlobalValue(), Symbols.symbol_function($sym10$TASK_INFO_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym11$TI_TYPE, $sym12$_CSETF_TI_TYPE);
    Structures.def_csetf($sym13$TI_ID, $sym14$_CSETF_TI_ID);
    Structures.def_csetf($sym15$TI_PRIORITY, $sym16$_CSETF_TI_PRIORITY);
    Structures.def_csetf($sym17$TI_REQUESTOR, $sym18$_CSETF_TI_REQUESTOR);
    Structures.def_csetf($sym19$TI_GIVEBACK_INFO, $sym20$_CSETF_TI_GIVEBACK_INFO);
    Structures.def_csetf($sym21$TI_BINDINGS, $sym22$_CSETF_TI_BINDINGS);
    Structures.def_csetf($sym23$TI_REQUEST, $sym24$_CSETF_TI_REQUEST);
    Structures.def_csetf($sym25$TI_RESPONSE, $sym26$_CSETF_TI_RESPONSE);
    Structures.def_csetf($sym27$TI_ERROR_MESSAGE, $sym28$_CSETF_TI_ERROR_MESSAGE);
    Structures.def_csetf($sym29$TI_TASK_PROCESSOR_NAME, $sym30$_CSETF_TI_TASK_PROCESSOR_NAME);
    Equality.identity($sym3$TASK_INFO);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_task_result_set$.getGlobalValue(), Symbols.symbol_function($sym64$TASK_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym65$TASK_RESULT_SET_RESULT, $sym66$_CSETF_TASK_RESULT_SET_RESULT);
    Structures.def_csetf($sym67$TASK_RESULT_SET_TASK_INFO, $sym68$_CSETF_TASK_RESULT_SET_TASK_INFO);
    Structures.def_csetf($sym69$TASK_RESULT_SET_FINISHED, $sym70$_CSETF_TASK_RESULT_SET_FINISHED);
    Equality.identity($sym57$TASK_RESULT_SET);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_task_processor$.getGlobalValue(), Symbols.symbol_function($sym82$TASK_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym83$TPROC_NAME, $sym84$_CSETF_TPROC_NAME);
    Structures.def_csetf($sym85$TPROC_PROCESS, $sym86$_CSETF_TPROC_PROCESS);
    Structures.def_csetf($sym87$TPROC_BUSY_P, $sym88$_CSETF_TPROC_BUSY_P);
    Structures.def_csetf($sym89$TPROC_TASK_INFO, $sym90$_CSETF_TPROC_TASK_INFO);
    Equality.identity($sym75$TASK_PROCESSOR);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_task_process_pool$.getGlobalValue(), Symbols.symbol_function($sym106$TASK_PROCESS_POOL_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym107$TPOOL_LOCK, $sym108$_CSETF_TPOOL_LOCK);
    Structures.def_csetf($sym109$TPOOL_REQUEST_QUEUE, $sym110$_CSETF_TPOOL_REQUEST_QUEUE);
    Structures.def_csetf($sym111$TPOOL_REQUEST_SEMAPHORE, $sym112$_CSETF_TPOOL_REQUEST_SEMAPHORE);
    Structures.def_csetf($sym113$TPOOL_PROCESSORS, $sym114$_CSETF_TPOOL_PROCESSORS);
    Structures.def_csetf($sym115$TPOOL_BACKGROUND_MSGS, $sym116$_CSETF_TPOOL_BACKGROUND_MSGS);
    Structures.def_csetf($sym117$TPOOL_PROCESS_NAME_PREFIX, $sym118$_CSETF_TPOOL_PROCESS_NAME_PREFIX);
    Structures.def_csetf($sym119$TPOOL_MIN_NBR_OF_TASK_PROCESSORS, $sym120$_CSETF_TPOOL_MIN_NBR_OF_TASK_PROCESSORS);
    Structures.def_csetf($sym121$TPOOL_MAX_NBR_OF_TASK_PROCESSORS, $sym122$_CSETF_TPOOL_MAX_NBR_OF_TASK_PROCESSORS);
    Equality.identity($sym99$TASK_PROCESS_POOL);
    access_macros.register_external_symbol($sym143$SET_TPOOL_BACKGROUND_MSG_PATH);
    utilities_macros.register_cyc_api_macro($sym176$CATCH_TASK_PROCESSOR_TERMINATION, $list173, $str177$Allow_for_the_API_calling_side_to);
    utilities_macros.register_cyc_api_macro($sym179$CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY, $list180, $str181$Allow_for_the_API_calling_side_to);
    access_macros.register_external_symbol($sym200$ENSURE_TASK_PROCESSORS_KILLED);
    utilities_macros.register_cyc_api_function($sym252$SHOW_API_TASK_PROCESSORS, NIL, $str253$Provides_a_convenient_alias_for_D, NIL, NIL);
    utilities_macros.register_cyc_api_function($sym254$DISPLAY_API_TASK_PROCESSORS, NIL, $str255$, NIL, NIL);
    utilities_macros.register_api_predefined_function($sym256$INITIALIZE_API_TASK_PROCESSORS);
    utilities_macros.register_api_predefined_function($sym257$HALT_API_TASK_PROCESSORS);
    utilities_macros.register_api_predefined_function($sym258$SHOW_API_TP_MSGS);
    utilities_macros.register_api_predefined_function($sym259$API_TASK_PROCESSOR_REQUEST);
    utilities_macros.register_api_predefined_function($sym260$WITH_IMMEDIATE_EXECUTION);
    if ((NIL == $task_processor_eval_fn_dict$.getGlobalValue())) {
      $task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
    }
    dictionary.dictionary_enter($task_processor_eval_fn_dict$.getGlobalValue(), $kw261$API, Symbols.symbol_function($sym159$CYC_API_EVAL));
    access_macros.register_external_symbol($sym262$SET_JAVA_API_LEASE_ACTIVITY_DISPLAY);
    if ((NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue())) {
      $task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
    }
    dictionary.dictionary_enter($task_processor_response_dispatch_fn_dict$.getGlobalValue(), $kw261$API, Symbols.symbol_function($sym267$DISPATCH_API_TASK_PROCESSOR_RESPONSE));
    if ((NIL == $task_processor_eval_fn_dict$.getGlobalValue())) {
      $task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
    }
    dictionary.dictionary_enter($task_processor_eval_fn_dict$.getGlobalValue(), $kw276$BG, Symbols.symbol_function($sym159$CYC_API_EVAL));
    if ((NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue())) {
      $task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
    }
    dictionary.dictionary_enter($task_processor_response_dispatch_fn_dict$.getGlobalValue(), $kw276$BG, Symbols.symbol_function($sym279$DISPATCH_BG_TASK_PROCESSOR_RESPONSE));
    subl_macro_promotions.declare_defglobal($sym281$_TASK_PROCESSOR_CONSOLE_ID_);
    if ((NIL == $task_processor_eval_fn_dict$.getGlobalValue())) {
      $task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
    }
    dictionary.dictionary_enter($task_processor_eval_fn_dict$.getGlobalValue(), $kw282$CONSOLE, Symbols.symbol_function($sym159$CYC_API_EVAL));
    if ((NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue())) {
      $task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
    }
    dictionary.dictionary_enter($task_processor_response_dispatch_fn_dict$.getGlobalValue(), $kw282$CONSOLE, Symbols.symbol_function($sym285$DISPATCH_CONSOLE_TASK_PROCESSOR_RESPONSE));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SET_TASK_PROCESSOR_VERBOSITY = makeSymbol("SET-TASK-PROCESSOR-VERBOSITY");
  public static final SubLSymbol $sym1$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str2$Invalid_verbosity__must_be_0___9_ = makeString("Invalid verbosity, must be 0 - 9 but was ~S~%");
  public static final SubLSymbol $sym3$TASK_INFO = makeSymbol("TASK-INFO");
  public static final SubLSymbol $sym4$TASK_INFO_P = makeSymbol("TASK-INFO-P");
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("TYPE"), makeSymbol("ID"), makeSymbol("PRIORITY"), makeSymbol("REQUESTOR"), makeSymbol("GIVEBACK-INFO"), makeSymbol("BINDINGS"), makeSymbol("REQUEST"), makeSymbol("RESPONSE"), makeSymbol("ERROR-MESSAGE"), makeSymbol("TASK-PROCESSOR-NAME")});
  public static final SubLList $list6 = list(new SubLObject[] {makeKeyword("TYPE"), makeKeyword("ID"), makeKeyword("PRIORITY"), makeKeyword("REQUESTOR"), makeKeyword("GIVEBACK-INFO"), makeKeyword("BINDINGS"), makeKeyword("REQUEST"), makeKeyword("RESPONSE"), makeKeyword("ERROR-MESSAGE"), makeKeyword("TASK-PROCESSOR-NAME")});
  public static final SubLList $list7 = list(new SubLObject[] {makeSymbol("TI-TYPE"), makeSymbol("TI-ID"), makeSymbol("TI-PRIORITY"), makeSymbol("TI-REQUESTOR"), makeSymbol("TI-GIVEBACK-INFO"), makeSymbol("TI-BINDINGS"), makeSymbol("TI-REQUEST"), makeSymbol("TI-RESPONSE"), makeSymbol("TI-ERROR-MESSAGE"), makeSymbol("TI-TASK-PROCESSOR-NAME")});
  public static final SubLList $list8 = list(new SubLObject[] {makeSymbol("_CSETF-TI-TYPE"), makeSymbol("_CSETF-TI-ID"), makeSymbol("_CSETF-TI-PRIORITY"), makeSymbol("_CSETF-TI-REQUESTOR"), makeSymbol("_CSETF-TI-GIVEBACK-INFO"), makeSymbol("_CSETF-TI-BINDINGS"), makeSymbol("_CSETF-TI-REQUEST"), makeSymbol("_CSETF-TI-RESPONSE"), makeSymbol("_CSETF-TI-ERROR-MESSAGE"), makeSymbol("_CSETF-TI-TASK-PROCESSOR-NAME")});
  public static final SubLSymbol $sym9$PRINT_TASK_INFO = makeSymbol("PRINT-TASK-INFO");
  public static final SubLSymbol $sym10$TASK_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-INFO-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym11$TI_TYPE = makeSymbol("TI-TYPE");
  public static final SubLSymbol $sym12$_CSETF_TI_TYPE = makeSymbol("_CSETF-TI-TYPE");
  public static final SubLSymbol $sym13$TI_ID = makeSymbol("TI-ID");
  public static final SubLSymbol $sym14$_CSETF_TI_ID = makeSymbol("_CSETF-TI-ID");
  public static final SubLSymbol $sym15$TI_PRIORITY = makeSymbol("TI-PRIORITY");
  public static final SubLSymbol $sym16$_CSETF_TI_PRIORITY = makeSymbol("_CSETF-TI-PRIORITY");
  public static final SubLSymbol $sym17$TI_REQUESTOR = makeSymbol("TI-REQUESTOR");
  public static final SubLSymbol $sym18$_CSETF_TI_REQUESTOR = makeSymbol("_CSETF-TI-REQUESTOR");
  public static final SubLSymbol $sym19$TI_GIVEBACK_INFO = makeSymbol("TI-GIVEBACK-INFO");
  public static final SubLSymbol $sym20$_CSETF_TI_GIVEBACK_INFO = makeSymbol("_CSETF-TI-GIVEBACK-INFO");
  public static final SubLSymbol $sym21$TI_BINDINGS = makeSymbol("TI-BINDINGS");
  public static final SubLSymbol $sym22$_CSETF_TI_BINDINGS = makeSymbol("_CSETF-TI-BINDINGS");
  public static final SubLSymbol $sym23$TI_REQUEST = makeSymbol("TI-REQUEST");
  public static final SubLSymbol $sym24$_CSETF_TI_REQUEST = makeSymbol("_CSETF-TI-REQUEST");
  public static final SubLSymbol $sym25$TI_RESPONSE = makeSymbol("TI-RESPONSE");
  public static final SubLSymbol $sym26$_CSETF_TI_RESPONSE = makeSymbol("_CSETF-TI-RESPONSE");
  public static final SubLSymbol $sym27$TI_ERROR_MESSAGE = makeSymbol("TI-ERROR-MESSAGE");
  public static final SubLSymbol $sym28$_CSETF_TI_ERROR_MESSAGE = makeSymbol("_CSETF-TI-ERROR-MESSAGE");
  public static final SubLSymbol $sym29$TI_TASK_PROCESSOR_NAME = makeSymbol("TI-TASK-PROCESSOR-NAME");
  public static final SubLSymbol $sym30$_CSETF_TI_TASK_PROCESSOR_NAME = makeSymbol("_CSETF-TI-TASK-PROCESSOR-NAME");
  public static final SubLSymbol $kw31$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw32$ID = makeKeyword("ID");
  public static final SubLSymbol $kw33$PRIORITY = makeKeyword("PRIORITY");
  public static final SubLSymbol $kw34$REQUESTOR = makeKeyword("REQUESTOR");
  public static final SubLSymbol $kw35$GIVEBACK_INFO = makeKeyword("GIVEBACK-INFO");
  public static final SubLSymbol $kw36$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw37$REQUEST = makeKeyword("REQUEST");
  public static final SubLSymbol $kw38$RESPONSE = makeKeyword("RESPONSE");
  public static final SubLSymbol $kw39$ERROR_MESSAGE = makeKeyword("ERROR-MESSAGE");
  public static final SubLSymbol $kw40$TASK_PROCESSOR_NAME = makeKeyword("TASK-PROCESSOR-NAME");
  public static final SubLString $str41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym42$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym43$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym44$STREAMP = makeSymbol("STREAMP");
  public static final SubLString $str45$__ = makeString("#<");
  public static final SubLSymbol $kw46$STREAM = makeKeyword("STREAM");
  public static final SubLString $str47$type_ = makeString("type=");
  public static final SubLString $str48$_id_ = makeString(" id=");
  public static final SubLString $str49$_priority_ = makeString(" priority=");
  public static final SubLString $str50$_requestor_ = makeString(" requestor=");
  public static final SubLString $str51$_giveback_info_ = makeString(" giveback-info=");
  public static final SubLString $str52$_bindings_ = makeString(" bindings=");
  public static final SubLString $str53$_request_ = makeString(" request=");
  public static final SubLString $str54$_response_ = makeString(" response=");
  public static final SubLString $str55$_error_message_ = makeString(" error-message=");
  public static final SubLSymbol $kw56$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym57$TASK_RESULT_SET = makeSymbol("TASK-RESULT-SET");
  public static final SubLSymbol $sym58$TASK_RESULT_SET_P = makeSymbol("TASK-RESULT-SET-P");
  public static final SubLList $list59 = list(makeSymbol("RESULT"), makeSymbol("TASK-INFO"), makeSymbol("FINISHED"));
  public static final SubLList $list60 = list(makeKeyword("RESULT"), makeKeyword("TASK-INFO"), makeKeyword("FINISHED"));
  public static final SubLList $list61 = list(makeSymbol("TASK-RESULT-SET-RESULT"), makeSymbol("TASK-RESULT-SET-TASK-INFO"), makeSymbol("TASK-RESULT-SET-FINISHED"));
  public static final SubLList $list62 = list(makeSymbol("_CSETF-TASK-RESULT-SET-RESULT"), makeSymbol("_CSETF-TASK-RESULT-SET-TASK-INFO"), makeSymbol("_CSETF-TASK-RESULT-SET-FINISHED"));
  public static final SubLSymbol $sym63$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym64$TASK_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym65$TASK_RESULT_SET_RESULT = makeSymbol("TASK-RESULT-SET-RESULT");
  public static final SubLSymbol $sym66$_CSETF_TASK_RESULT_SET_RESULT = makeSymbol("_CSETF-TASK-RESULT-SET-RESULT");
  public static final SubLSymbol $sym67$TASK_RESULT_SET_TASK_INFO = makeSymbol("TASK-RESULT-SET-TASK-INFO");
  public static final SubLSymbol $sym68$_CSETF_TASK_RESULT_SET_TASK_INFO = makeSymbol("_CSETF-TASK-RESULT-SET-TASK-INFO");
  public static final SubLSymbol $sym69$TASK_RESULT_SET_FINISHED = makeSymbol("TASK-RESULT-SET-FINISHED");
  public static final SubLSymbol $sym70$_CSETF_TASK_RESULT_SET_FINISHED = makeSymbol("_CSETF-TASK-RESULT-SET-FINISHED");
  public static final SubLSymbol $kw71$RESULT = makeKeyword("RESULT");
  public static final SubLSymbol $kw72$TASK_INFO = makeKeyword("TASK-INFO");
  public static final SubLSymbol $kw73$FINISHED = makeKeyword("FINISHED");
  public static final SubLSymbol $sym74$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $sym75$TASK_PROCESSOR = makeSymbol("TASK-PROCESSOR");
  public static final SubLSymbol $sym76$TASK_PROCESSOR_P = makeSymbol("TASK-PROCESSOR-P");
  public static final SubLList $list77 = list(makeSymbol("NAME"), makeSymbol("PROCESS"), makeSymbol("BUSY-P"), makeSymbol("TASK-INFO"));
  public static final SubLList $list78 = list(makeKeyword("NAME"), makeKeyword("PROCESS"), makeKeyword("BUSY-P"), makeKeyword("TASK-INFO"));
  public static final SubLList $list79 = list(makeSymbol("TPROC-NAME"), makeSymbol("TPROC-PROCESS"), makeSymbol("TPROC-BUSY-P"), makeSymbol("TPROC-TASK-INFO"));
  public static final SubLList $list80 = list(makeSymbol("_CSETF-TPROC-NAME"), makeSymbol("_CSETF-TPROC-PROCESS"), makeSymbol("_CSETF-TPROC-BUSY-P"), makeSymbol("_CSETF-TPROC-TASK-INFO"));
  public static final SubLSymbol $sym81$PRINT_TASK_PROCESSOR = makeSymbol("PRINT-TASK-PROCESSOR");
  public static final SubLSymbol $sym82$TASK_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym83$TPROC_NAME = makeSymbol("TPROC-NAME");
  public static final SubLSymbol $sym84$_CSETF_TPROC_NAME = makeSymbol("_CSETF-TPROC-NAME");
  public static final SubLSymbol $sym85$TPROC_PROCESS = makeSymbol("TPROC-PROCESS");
  public static final SubLSymbol $sym86$_CSETF_TPROC_PROCESS = makeSymbol("_CSETF-TPROC-PROCESS");
  public static final SubLSymbol $sym87$TPROC_BUSY_P = makeSymbol("TPROC-BUSY-P");
  public static final SubLSymbol $sym88$_CSETF_TPROC_BUSY_P = makeSymbol("_CSETF-TPROC-BUSY-P");
  public static final SubLSymbol $sym89$TPROC_TASK_INFO = makeSymbol("TPROC-TASK-INFO");
  public static final SubLSymbol $sym90$_CSETF_TPROC_TASK_INFO = makeSymbol("_CSETF-TPROC-TASK-INFO");
  public static final SubLSymbol $kw91$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw92$PROCESS = makeKeyword("PROCESS");
  public static final SubLSymbol $kw93$BUSY_P = makeKeyword("BUSY-P");
  public static final SubLString $str94$name_ = makeString("name=");
  public static final SubLString $str95$_process_ = makeString(" process=");
  public static final SubLString $str96$_whostate_ = makeString(" whostate=");
  public static final SubLString $str97$_busy_p_ = makeString(" busy-p=");
  public static final SubLString $str98$_last_response_ = makeString(" last response=");
  public static final SubLSymbol $sym99$TASK_PROCESS_POOL = makeSymbol("TASK-PROCESS-POOL");
  public static final SubLSymbol $sym100$TASK_PROCESS_POOL_P = makeSymbol("TASK-PROCESS-POOL-P");
  public static final SubLList $list101 = list(makeSymbol("LOCK"), makeSymbol("REQUEST-QUEUE"), makeSymbol("REQUEST-SEMAPHORE"), makeSymbol("PROCESSORS"), makeSymbol("BACKGROUND-MSGS"), makeSymbol("PROCESS-NAME-PREFIX"), makeSymbol("MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("MAX-NBR-OF-TASK-PROCESSORS"));
  public static final SubLList $list102 = list(makeKeyword("LOCK"), makeKeyword("REQUEST-QUEUE"), makeKeyword("REQUEST-SEMAPHORE"), makeKeyword("PROCESSORS"), makeKeyword("BACKGROUND-MSGS"), makeKeyword("PROCESS-NAME-PREFIX"), makeKeyword("MIN-NBR-OF-TASK-PROCESSORS"), makeKeyword("MAX-NBR-OF-TASK-PROCESSORS"));
  public static final SubLList $list103 = list(makeSymbol("TPOOL-LOCK"), makeSymbol("TPOOL-REQUEST-QUEUE"), makeSymbol("TPOOL-REQUEST-SEMAPHORE"), makeSymbol("TPOOL-PROCESSORS"), makeSymbol("TPOOL-BACKGROUND-MSGS"), makeSymbol("TPOOL-PROCESS-NAME-PREFIX"), makeSymbol("TPOOL-MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("TPOOL-MAX-NBR-OF-TASK-PROCESSORS"));
  public static final SubLList $list104 = list(makeSymbol("_CSETF-TPOOL-LOCK"), makeSymbol("_CSETF-TPOOL-REQUEST-QUEUE"), makeSymbol("_CSETF-TPOOL-REQUEST-SEMAPHORE"), makeSymbol("_CSETF-TPOOL-PROCESSORS"), makeSymbol("_CSETF-TPOOL-BACKGROUND-MSGS"), makeSymbol("_CSETF-TPOOL-PROCESS-NAME-PREFIX"), makeSymbol("_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"));
  public static final SubLSymbol $sym105$PRINT_TASK_PROCESS_POOL = makeSymbol("PRINT-TASK-PROCESS-POOL");
  public static final SubLSymbol $sym106$TASK_PROCESS_POOL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-PROCESS-POOL-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym107$TPOOL_LOCK = makeSymbol("TPOOL-LOCK");
  public static final SubLSymbol $sym108$_CSETF_TPOOL_LOCK = makeSymbol("_CSETF-TPOOL-LOCK");
  public static final SubLSymbol $sym109$TPOOL_REQUEST_QUEUE = makeSymbol("TPOOL-REQUEST-QUEUE");
  public static final SubLSymbol $sym110$_CSETF_TPOOL_REQUEST_QUEUE = makeSymbol("_CSETF-TPOOL-REQUEST-QUEUE");
  public static final SubLSymbol $sym111$TPOOL_REQUEST_SEMAPHORE = makeSymbol("TPOOL-REQUEST-SEMAPHORE");
  public static final SubLSymbol $sym112$_CSETF_TPOOL_REQUEST_SEMAPHORE = makeSymbol("_CSETF-TPOOL-REQUEST-SEMAPHORE");
  public static final SubLSymbol $sym113$TPOOL_PROCESSORS = makeSymbol("TPOOL-PROCESSORS");
  public static final SubLSymbol $sym114$_CSETF_TPOOL_PROCESSORS = makeSymbol("_CSETF-TPOOL-PROCESSORS");
  public static final SubLSymbol $sym115$TPOOL_BACKGROUND_MSGS = makeSymbol("TPOOL-BACKGROUND-MSGS");
  public static final SubLSymbol $sym116$_CSETF_TPOOL_BACKGROUND_MSGS = makeSymbol("_CSETF-TPOOL-BACKGROUND-MSGS");
  public static final SubLSymbol $sym117$TPOOL_PROCESS_NAME_PREFIX = makeSymbol("TPOOL-PROCESS-NAME-PREFIX");
  public static final SubLSymbol $sym118$_CSETF_TPOOL_PROCESS_NAME_PREFIX = makeSymbol("_CSETF-TPOOL-PROCESS-NAME-PREFIX");
  public static final SubLSymbol $sym119$TPOOL_MIN_NBR_OF_TASK_PROCESSORS = makeSymbol("TPOOL-MIN-NBR-OF-TASK-PROCESSORS");
  public static final SubLSymbol $sym120$_CSETF_TPOOL_MIN_NBR_OF_TASK_PROCESSORS = makeSymbol("_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS");
  public static final SubLSymbol $sym121$TPOOL_MAX_NBR_OF_TASK_PROCESSORS = makeSymbol("TPOOL-MAX-NBR-OF-TASK-PROCESSORS");
  public static final SubLSymbol $sym122$_CSETF_TPOOL_MAX_NBR_OF_TASK_PROCESSORS = makeSymbol("_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS");
  public static final SubLSymbol $kw123$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw124$REQUEST_QUEUE = makeKeyword("REQUEST-QUEUE");
  public static final SubLSymbol $kw125$REQUEST_SEMAPHORE = makeKeyword("REQUEST-SEMAPHORE");
  public static final SubLSymbol $kw126$PROCESSORS = makeKeyword("PROCESSORS");
  public static final SubLSymbol $kw127$BACKGROUND_MSGS = makeKeyword("BACKGROUND-MSGS");
  public static final SubLSymbol $kw128$PROCESS_NAME_PREFIX = makeKeyword("PROCESS-NAME-PREFIX");
  public static final SubLSymbol $kw129$MIN_NBR_OF_TASK_PROCESSORS = makeKeyword("MIN-NBR-OF-TASK-PROCESSORS");
  public static final SubLSymbol $kw130$MAX_NBR_OF_TASK_PROCESSORS = makeKeyword("MAX-NBR-OF-TASK-PROCESSORS");
  public static final SubLString $str131$_request_queue_ = makeString(" request-queue=");
  public static final SubLString $str132$_processors_ = makeString(" processors=");
  public static final SubLString $str133$_process_name_prefix_ = makeString(" process name prefix=");
  public static final SubLString $str134$_min_processors_ = makeString(" min processors=");
  public static final SubLString $str135$_max_processors_ = makeString(" max processors=");
  public static final SubLString $str136$There_are_no_task_processors_ = makeString("There are no task processors.");
  public static final SubLString $str137$_S__ = makeString("~S~%");
  public static final SubLString $str138$request__S__ = makeString("request=~S~%");
  public static final SubLInteger $int139$500 = makeInteger(500);
  public static final SubLSymbol $sym140$LOCK_P = makeSymbol("LOCK-P");
  public static final SubLSymbol $sym141$PRIORITY_QUEUE_P = makeSymbol("PRIORITY-QUEUE-P");
  public static final SubLSymbol $sym142$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym143$SET_TPOOL_BACKGROUND_MSG_PATH = makeSymbol("SET-TPOOL-BACKGROUND-MSG-PATH");
  public static final SubLString $str144$tpool_background_msg_lock = makeString("tpool-background-msg-lock");
  public static final SubLString $str145$_A_is_not_a_valid_file_specificat = makeString("~A is not a valid file specification");
  public static final SubLSymbol $kw146$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw147$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLSymbol $kw148$IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");
  public static final SubLSymbol $kw149$CREATE = makeKeyword("CREATE");
  public static final SubLSymbol $kw150$IF_EXISTS = makeKeyword("IF-EXISTS");
  public static final SubLSymbol $kw151$OVERWRITE = makeKeyword("OVERWRITE");
  public static final SubLString $str152$_ = makeString("[");
  public static final SubLString $str153$_ = makeString("]");
  public static final SubLString $str154$__ = makeString("  ");
  public static final SubLString $str155$_ = makeString(" ");
  public static final SubLSymbol $sym156$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym157$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym158$_EVAL_WITH_BINDINGS_ = makeSymbol("*EVAL-WITH-BINDINGS*");
  public static final SubLSymbol $sym159$CYC_API_EVAL = makeSymbol("CYC-API-EVAL");
  public static final SubLSymbol $sym160$EVAL = makeSymbol("EVAL");
  public static final SubLSymbol $sym161$PROCESSP = makeSymbol("PROCESSP");
  public static final SubLString $str162$Task_processes_being_worked_on = makeString("Task processes being worked on");
  public static final SubLSymbol $kw163$ABORT = makeKeyword("ABORT");
  public static final SubLSymbol $kw164$CANCEL = makeKeyword("CANCEL");
  public static final SubLSymbol $sym165$TASK_PROCESS_TERMINATION_REASON_P = makeSymbol("TASK-PROCESS-TERMINATION-REASON-P");
  public static final SubLSymbol $kw166$NEWEST = makeKeyword("NEWEST");
  public static final SubLSymbol $kw167$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym168$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $sym169$SIGNAL_ABORT_ACTIVE_TASK_PROCESS = makeSymbol("SIGNAL-ABORT-ACTIVE-TASK-PROCESS");
  public static final SubLSymbol $sym170$SIGNAL_CANCEL_ACTIVE_TASK_PROCESS = makeSymbol("SIGNAL-CANCEL-ACTIVE-TASK-PROCESS");
  public static final SubLString $str171$API_error__Unknown_active_task_pr = makeString("API error: Unknown active task process termination reason ~A");
  public static final SubLSymbol $kw172$TERMINATE_PREMATURELY = makeKeyword("TERMINATE-PREMATURELY");
  public static final SubLList $list173 = list(makeSymbol("ANS-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym174$CCATCH = makeSymbol("CCATCH");
  public static final SubLSymbol $sym175$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym176$CATCH_TASK_PROCESSOR_TERMINATION = makeSymbol("CATCH-TASK-PROCESSOR-TERMINATION");
  public static final SubLString $str177$Allow_for_the_API_calling_side_to = makeString("Allow for the API calling side to catch the termination of the task processor.\n   The client must wrap the api-request form with catch-task-processor-termination.");
  public static final SubLSymbol $sym178$ANS_VAR = makeUninternedSymbol("ANS-VAR");
  public static final SubLSymbol $sym179$CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY = makeSymbol("CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY");
  public static final SubLList $list180 = list(makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str181$Allow_for_the_API_calling_side_to = makeString("Allow for the API calling side to catch the termination of the task processor\n   without looking at the termination reason.\n   The client must wrap the api-request form with catch-task-processor-termination-quietly.");
  public static final SubLFloat $float182$0_001 = makeDouble(0.001);
  public static final SubLSymbol $kw183$TASK_PROCESSOR_QUIT = makeKeyword("TASK-PROCESSOR-QUIT");
  public static final SubLString $str184$Invalid_task_processor = makeString("Invalid task-processor");
  public static final SubLString $str185$Invalid_task_process_pool = makeString("Invalid task-process-pool");
  public static final SubLString $str186$Task_Info__S__ = makeString("Task Info ~S~%");
  public static final SubLSymbol $sym187$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str188$Response__S__ = makeString("Response ~S~%");
  public static final SubLString $str189$Error_message__S__ = makeString("Error-message ~S~%");
  public static final SubLString $str190$Posting_partial_results__A_at__A = makeString("Posting partial results ~A at ~A");
  public static final SubLString $str191$Function_only_valid_from_within_a = makeString("Function only valid from within a Task Processor, but running inside ~A.");
  public static final SubLInteger $int192$25 = makeInteger(25);
  public static final SubLString $str193$Task_processor_ = makeString("Task processor ");
  public static final SubLString $str194$Initializing_task_processors__ = makeString("Initializing task processors~%");
  public static final SubLString $str195$_alock = makeString("~alock");
  public static final SubLString $str196$task_pool_request_semaphore = makeString("task-pool-request-semaphore");
  public static final SubLString $str197$_a_s = makeString("~a~s");
  public static final SubLSymbol $sym198$TASK_PROCESSOR_HANDLER = makeSymbol("TASK-PROCESSOR-HANDLER");
  public static final SubLSymbol $sym199$TASK_PROCESSOR_QUIT = makeSymbol("TASK-PROCESSOR-QUIT");
  public static final SubLSymbol $sym200$ENSURE_TASK_PROCESSORS_KILLED = makeSymbol("ENSURE-TASK-PROCESSORS-KILLED");
  public static final SubLString $str201$_processor_ = makeString(" processor ");
  public static final SubLString $str202$_Killing__A___ = makeString(" Killing ~A.~%");
  public static final SubLString $str203$Allocating_a_new_task_processor__ = makeString("Allocating a new task processor~%");
  public static final SubLString $str204$Awakening_first_available_task_pr = makeString("Awakening first available task processor~%");
  public static final SubLString $str205$Task_processors_are_not_initializ = makeString("Task processors are not initialized.");
  public static final SubLString $str206$__Error__cannot_queue_task_reques = makeString("~%Error: cannot queue task request for ~%~S~%");
  public static final SubLList $list207 = list(makeSymbol("TYPE"), makeSymbol("MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("MAX-NBR-OF-TASK-PROCESSORS"));
  public static final SubLString $str208$_ = makeString("*");
  public static final SubLString $str209$_TASK_PROCESS_POOL_ = makeString("-TASK-PROCESS-POOL*");
  public static final SubLString $str210$_TASK_PROCESS_POOL_LOCK_ = makeString("-TASK-PROCESS-POOL-LOCK*");
  public static final SubLSymbol $sym211$DEFLEXICAL_PUBLIC = makeSymbol("DEFLEXICAL-PUBLIC");
  public static final SubLList $list212 = list(NIL, makeString("Task process pool for requests."));
  public static final SubLSymbol $sym213$DEFCONSTANT_PUBLIC = makeSymbol("DEFCONSTANT-PUBLIC");
  public static final SubLList $list214 = list(list(makeSymbol("MAKE-LOCK"), makeString("task processor initialization lock")), makeString("Task process pool lock to guarantee only a single instance is initialized."));
  public static final SubLSymbol $sym215$DEFINE_PUBLIC = makeSymbol("DEFINE-PUBLIC");
  public static final SubLString $str216$_TASK_PROCESSORS_INITIALIZED_P = makeString("-TASK-PROCESSORS-INITIALIZED-P");
  public static final SubLString $str217$Return_T_when_there_are_task_proc = makeString("Return T when there are task processors.");
  public static final SubLSymbol $sym218$RET = makeSymbol("RET");
  public static final SubLSymbol $sym219$TASK_PROCESSORS_INITIALIZED_P = makeSymbol("TASK-PROCESSORS-INITIALIZED-P");
  public static final SubLString $str220$INITIALIZE_ = makeString("INITIALIZE-");
  public static final SubLString $str221$_TASK_PROCESSORS = makeString("-TASK-PROCESSORS");
  public static final SubLString $str222$Initialize_the_task_processor_poo = makeString("Initialize the task processor pool for requests.");
  public static final SubLSymbol $sym223$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLSymbol $sym224$PWHEN = makeSymbol("PWHEN");
  public static final SubLList $list225 = list(list(makeSymbol("ERROR"), makeString("Illegal attempt to reinitialize processor pool without first halting it.")));
  public static final SubLSymbol $sym226$INITIALIZE_TASK_PROCESSORS = makeSymbol("INITIALIZE-TASK-PROCESSORS");
  public static final SubLSymbol $sym227$CCONCATENATE = makeSymbol("CCONCATENATE");
  public static final SubLList $list228 = list(makeString(" processor "));
  public static final SubLList $list229 = list(list(makeSymbol("RET"), NIL));
  public static final SubLString $str230$HALT_ = makeString("HALT-");
  public static final SubLString $str231$Halt_the_task_processors_ = makeString("Halt the task processors.");
  public static final SubLSymbol $sym232$HALT_TASK_PROCESSORS = makeSymbol("HALT-TASK-PROCESSORS");
  public static final SubLList $list233 = list(NIL);
  public static final SubLString $str234$SHOW_ = makeString("SHOW-");
  public static final SubLString $str235$_TP_MSGS = makeString("-TP-MSGS");
  public static final SubLString $str236$Show_and_reset_the_task_processor = makeString("Show and reset the task processor background messages for the\n          task-process-pool.");
  public static final SubLSymbol $sym237$SHOW_TP_MSGS = makeSymbol("SHOW-TP-MSGS");
  public static final SubLList $list238 = list(makeSymbol("TYPE"), makeSymbol("EVAL-FN"), makeSymbol("ARGS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str239$_TASK_PROCESSOR_REQUEST = makeString("-TASK-PROCESSOR-REQUEST");
  public static final SubLList $list240 = list(makeSymbol("PUNLESS"), makeSymbol("*TASK-PROCESSOR-EVAL-FN-DICT*"), list(makeSymbol("CSETQ"), makeSymbol("*TASK-PROCESSOR-EVAL-FN-DICT*"), list(makeSymbol("NEW-DICTIONARY"))));
  public static final SubLSymbol $sym241$DICTIONARY_ENTER = makeSymbol("DICTIONARY-ENTER");
  public static final SubLSymbol $sym242$_TASK_PROCESSOR_EVAL_FN_DICT_ = makeSymbol("*TASK-PROCESSOR-EVAL-FN-DICT*");
  public static final SubLList $list243 = list(makeSymbol("TYPE"), makeSymbol("ARGS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str244$DISPATCH_ = makeString("DISPATCH-");
  public static final SubLString $str245$_TASK_PROCESSOR_RESPONSE = makeString("-TASK-PROCESSOR-RESPONSE");
  public static final SubLList $list246 = list(makeSymbol("PUNLESS"), makeSymbol("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*"), list(makeSymbol("CSETQ"), makeSymbol("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*"), list(makeSymbol("NEW-DICTIONARY"))));
  public static final SubLSymbol $sym247$_TASK_PROCESSOR_RESPONSE_DISPATCH_FN_DICT_ = makeSymbol("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*");
  public static final SubLSymbol $sym248$FUNCTION = makeSymbol("FUNCTION");
  public static final SubLString $str249$task_processor_initialization_loc = makeString("task processor initialization lock");
  public static final SubLString $str250$Illegal_attempt_to_reinitialize_p = makeString("Illegal attempt to reinitialize processor pool without first halting it.");
  public static final SubLString $str251$API = makeString("API");
  public static final SubLSymbol $sym252$SHOW_API_TASK_PROCESSORS = makeSymbol("SHOW-API-TASK-PROCESSORS");
  public static final SubLString $str253$Provides_a_convenient_alias_for_D = makeString("Provides a convenient alias for DISPLAY-API-TASK-PROCESSORS.");
  public static final SubLSymbol $sym254$DISPLAY_API_TASK_PROCESSORS = makeSymbol("DISPLAY-API-TASK-PROCESSORS");
  public static final SubLString $str255$ = makeString("");
  public static final SubLSymbol $sym256$INITIALIZE_API_TASK_PROCESSORS = makeSymbol("INITIALIZE-API-TASK-PROCESSORS");
  public static final SubLSymbol $sym257$HALT_API_TASK_PROCESSORS = makeSymbol("HALT-API-TASK-PROCESSORS");
  public static final SubLSymbol $sym258$SHOW_API_TP_MSGS = makeSymbol("SHOW-API-TP-MSGS");
  public static final SubLSymbol $sym259$API_TASK_PROCESSOR_REQUEST = makeSymbol("API-TASK-PROCESSOR-REQUEST");
  public static final SubLSymbol $sym260$WITH_IMMEDIATE_EXECUTION = makeSymbol("WITH-IMMEDIATE-EXECUTION");
  public static final SubLSymbol $kw261$API = makeKeyword("API");
  public static final SubLSymbol $sym262$SET_JAVA_API_LEASE_ACTIVITY_DISPLAY = makeSymbol("SET-JAVA-API-LEASE-ACTIVITY-DISPLAY");
  public static final SubLString $str263$Dispatching_api_response__S__ = makeString("Dispatching api response ~S~%");
  public static final SubLSymbol $sym264$TASK_PROCESSOR_RESPONSE = makeSymbol("TASK-PROCESSOR-RESPONSE");
  public static final SubLString $str265$Sending_api_response__S_to_socket = makeString("Sending api response ~S to socket ~S~% identified by ~A~%");
  public static final SubLString $str266$Dropping_api_response__S__socket_ = makeString("Dropping api response ~S, socket ~S~% identified by ~A is not available~%");
  public static final SubLSymbol $sym267$DISPATCH_API_TASK_PROCESSOR_RESPONSE = makeSymbol("DISPATCH-API-TASK-PROCESSOR-RESPONSE");
  public static final SubLSymbol $sym268$INTERMEDIATE_RESULTS_ACCUMULATOR_RESET = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-RESET");
  public static final SubLSymbol $sym269$INTERMEDIATE_RESULTS_ACCUMULATOR_ADD = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-ADD");
  public static final SubLSymbol $sym270$INTERMEDIATE_RESULTS_ACCUMULATOR_SIZE = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-SIZE");
  public static final SubLSymbol $sym271$INTERMEDIATE_RESULTS_ACCUMULATOR_CONTENTS = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-CONTENTS");
  public static final SubLSymbol $sym272$INTERMEDIATE_RESULTS_ACCUMULATOR_ITERATOR = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-ITERATOR");
  public static final SubLSymbol $sym273$INTERMEDIATE_RESULTS_ACCUMULATOR_ADD_ALL = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-ADD-ALL");
  public static final SubLString $str274$Cannot_invoke_intermediate_result = makeString("Cannot invoke intermediate results accumulator outside of a task processor.~%");
  public static final SubLString $str275$BG = makeString("BG");
  public static final SubLSymbol $kw276$BG = makeKeyword("BG");
  public static final SubLString $str277$dispatching_bg_response__S__ = makeString("dispatching bg response ~S~%");
  public static final SubLString $str278$bg_response_dictionary__S__ = makeString("bg response dictionary ~S~%");
  public static final SubLSymbol $sym279$DISPATCH_BG_TASK_PROCESSOR_RESPONSE = makeSymbol("DISPATCH-BG-TASK-PROCESSOR-RESPONSE");
  public static final SubLString $str280$CONSOLE = makeString("CONSOLE");
  public static final SubLSymbol $sym281$_TASK_PROCESSOR_CONSOLE_ID_ = makeSymbol("*TASK-PROCESSOR-CONSOLE-ID*");
  public static final SubLSymbol $kw282$CONSOLE = makeKeyword("CONSOLE");
  public static final SubLString $str283$dispatching_console_response__S__ = makeString("dispatching console response ~S~%");
  public static final SubLString $str284$_A___A__ = makeString("~A  ~A~%");
  public static final SubLSymbol $sym285$DISPATCH_CONSOLE_TASK_PROCESSOR_RESPONSE = makeSymbol("DISPATCH-CONSOLE-TASK-PROCESSOR-RESPONSE");

  //// Initializers

  public void declareFunctions() {
    declare_task_processor_file();
  }

  public void initializeVariables() {
    init_task_processor_file();
  }

  public void runTopLevelForms() {
    setup_task_processor_file();
  }

}
