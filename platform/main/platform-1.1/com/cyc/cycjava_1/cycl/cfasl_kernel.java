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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.api_control_vars;
//dm import com.cyc.cycjava_1.cycl.api_kernel;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.eval_in_api;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.operation_communication;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_parameters;
//dm import com.cyc.cycjava_1.cycl.task_processor;
//dm import com.cyc.cycjava_1.cycl.tcp_server_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class cfasl_kernel extends SubLTranslatedFile {

  //// Constructor

  private cfasl_kernel() {}
  public static final SubLFile me = new cfasl_kernel();
  public static final String myName = "com.cyc.cycjava_1.cycl.cfasl_kernel";

  //// Definitions

  @SubL(source = "cycl/cfasl-kernel.lisp", position = 787) 
  public static SubLSymbol $perform_cfasl_externalization$ = null;

  @SubL(source = "cycl/cfasl-kernel.lisp", position = 910) 
  public static final SubLObject cfasl_externalization_modeP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $perform_cfasl_externalization$.getDynamicValue(thread);
    }
  }

  /** Switch this connection into external setting. */
  @SubL(source = "cycl/cfasl-kernel.lisp", position = 998) 
  public static final SubLObject cfasl_set_mode_externalized() {
    $perform_cfasl_externalization$.setDynamicValue(T);
    return cfasl_externalization_modeP();
  }

  @SubL(source = "cycl/cfasl-kernel.lisp", position = 1364) 
  public static final SubLObject cfasl_server_handler(SubLObject in_stream, SubLObject out_stream) {
    return cfasl_server_top_level(in_stream, out_stream);
  }

  /** the standard output stream for debugging within a task-processor-request */
  @SubL(source = "cycl/cfasl-kernel.lisp", position = 1515) 
  public static SubLSymbol $cfasl_kernel_standard_output$ = null;

  @SubL(source = "cycl/cfasl-kernel.lisp", position = 1651) 
  public static final SubLObject cfasl_server_top_level(SubLObject in_stream, SubLObject out_stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
          try {
            cfasl.$cfasl_common_symbols$.bind(NIL, thread);
            cfasl.cfasl_set_common_symbols(NIL);
            {
              SubLObject _prev_bind_0_1 = $perform_cfasl_externalization$.currentBinding(thread);
              SubLObject _prev_bind_1 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
              SubLObject _prev_bind_2 = api_kernel.$default_api_input_protocol$.currentBinding(thread);
              SubLObject _prev_bind_3 = api_kernel.$default_api_validate_method$.currentBinding(thread);
              SubLObject _prev_bind_4 = api_kernel.$default_api_output_protocol$.currentBinding(thread);
              SubLObject _prev_bind_5 = $cfasl_kernel_standard_output$.currentBinding(thread);
              try {
                $perform_cfasl_externalization$.bind(NIL, thread);
                api_control_vars.$generate_readable_fi_results$.bind(NIL, thread);
                api_kernel.$default_api_input_protocol$.bind($sym3$READ_CFASL_REQUEST, thread);
                api_kernel.$default_api_validate_method$.bind($sym4$VALIDATE_CFASL_REQUEST, thread);
                api_kernel.$default_api_output_protocol$.bind($sym5$SEND_CFASL_RESULT, thread);
                $cfasl_kernel_standard_output$.bind(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
                ans = api_kernel.api_server_top_level(in_stream, out_stream);
              } finally {
                $cfasl_kernel_standard_output$.rebind(_prev_bind_5, thread);
                api_kernel.$default_api_output_protocol$.rebind(_prev_bind_4, thread);
                api_kernel.$default_api_validate_method$.rebind(_prev_bind_3, thread);
                api_kernel.$default_api_input_protocol$.rebind(_prev_bind_2, thread);
                api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_1, thread);
                $perform_cfasl_externalization$.rebind(_prev_bind_0_1, thread);
              }
            }
          } finally {
            cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  /** Explicitly quit this cfasl connection. */
  @SubL(source = "cycl/cfasl-kernel.lisp", position = 2287) 
  public static final SubLObject cfasl_quit() {
    return api_kernel.api_quit();
  }

  /** Returns the local cfasl-port according to defined system parameters. */
  @SubL(source = "cycl/cfasl-kernel.lisp", position = 2380) 
  public static final SubLObject cfasl_port() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Numbers.add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$cfasl_port_offset$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/cfasl-kernel.lisp", position = 2532) 
  public static final SubLObject read_cfasl_request(SubLObject in_stream, SubLObject eof_error_p, SubLObject eof_value) {
    if ((eof_error_p == UNPROVIDED)) {
      eof_error_p = T;
    }
    if ((eof_value == UNPROVIDED)) {
      eof_value = $kw6$EOF;
    }
    {
      SubLObject request = NIL;
      SubLObject error_message = NIL;
      try {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
          try {
            Dynamic.bind(Errors.$error_handler$, $sym7$CATCH_ERROR_MESSAGE_HANDLER);
            try {
              request = cfasl.cfasl_input(in_stream, eof_error_p, eof_value);
            } catch (Throwable catch_var) {
              Errors.handleThrowable(catch_var, NIL);
            }
          } finally {
            Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
          }
        }
      } catch (Throwable ccatch_env_var) {
        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
      }
      if ((NIL != error_message)) {
      }
      return request;
    }
  }

  @SubL(source = "cycl/cfasl-kernel.lisp", position = 3293) 
  public static final SubLObject validate_cfasl_request(SubLObject api_request) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == list_utilities.proper_list_p(api_request))) {
        Errors.error($str8$Invalid_API_Request___S_is_not_a_, api_request);
      }
      if ((!(((NIL != eval_in_api.$eval_in_apiP$.getDynamicValue(thread))
            || (NIL != api_kernel.valid_api_function_symbol(api_request.first())))))) {
        Errors.error($str9$Invalid_API_Request___S_is_not_a_, api_request.first());
      }
      return T;
    }
  }

  @SubL(source = "cycl/cfasl-kernel.lisp", position = 3723) 
  public static final SubLObject send_cfasl_result(SubLObject out_stream, SubLObject cfasl_result, SubLObject error) {
    if ((error == UNPROVIDED)) {
      error = NIL;
    }
    if ((NIL != error)) {
      cfasl_result = make_cfasl_api_exception(cfasl_result);
    }
    cfasl.cfasl_output(Types.sublisp_null(error), out_stream);
    if ((NIL != cfasl_externalization_modeP())) {
      cfasl.cfasl_output_externalized(cfasl_result, out_stream);
    } else {
      cfasl.cfasl_output(cfasl_result, out_stream);
    }
    streams_high.force_output(out_stream);
    return cfasl_result;
  }

  @SubL(source = "cycl/cfasl-kernel.lisp", position = 4505) 
  public static final SubLObject make_cfasl_api_exception(SubLObject string) {
    checkType(string, $sym12$STRINGP);
    return list($sym10$CYC_EXCEPTION, $kw11$MESSAGE, string);
  }

  @SubL(source = "cycl/cfasl-kernel.lisp", position = 5755) 
  private static SubLSymbol $cfasl_eof_exception$ = null;

  /** @param REQUEST; consp for evaluation
   @param ID; integerp
   @param PRIORITY; intergerp
   @param REQUESTOR; stringp
   @param CLIENT-BINDINGS; consp of (var value) pairs
   @param UUID-STRING; identifies the client to which the response will be sent
   Submits the REQUEST form to the task request queue with ID, PRIORITY,
   REQUESTOR, BINDINGS and OUT-STREAM. */
  @SubL(source = "cycl/cfasl-kernel.lisp", position = 6812) 
  public static final SubLObject task_processor_request(SubLObject request, SubLObject id, SubLObject priority, SubLObject requestor, SubLObject client_bindings, SubLObject uuid_string) {
    if ((uuid_string == UNPROVIDED)) {
      uuid_string = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(request, $sym19$CONSP);
      checkType(id, $sym13$INTEGERP);
      checkType(priority, $sym13$INTEGERP);
      checkType(requestor, $sym12$STRINGP);
      checkType(client_bindings, $sym20$LISTP);
      {
        SubLObject server_bindings = listS($list21, list($sym22$_THE_CYCLIST_, operation_communication.the_cyclist()), list($sym23$_KE_PURPOSE_, api_control_vars.$default_ke_purpose$.getDynamicValue(thread)), $list24);
        task_processor.api_task_processor_request(request, id, priority, requestor, ConsesLow.append(server_bindings, client_bindings), uuid_string);
      }
      return NIL;
    }
  }

  public static final SubLObject declare_cfasl_kernel_file() {
    declareFunction(myName, "cfasl_externalization_modeP", "CFASL-EXTERNALIZATION-MODE?", 0, 0, false);
    declareFunction(myName, "cfasl_set_mode_externalized", "CFASL-SET-MODE-EXTERNALIZED", 0, 0, false);
    declareFunction(myName, "cfasl_set_mode_internalized", "CFASL-SET-MODE-INTERNALIZED", 0, 0, false);
    declareFunction(myName, "cfasl_server_handler", "CFASL-SERVER-HANDLER", 2, 0, false);
    declareFunction(myName, "cfasl_server_top_level", "CFASL-SERVER-TOP-LEVEL", 2, 0, false);
    declareFunction(myName, "cfasl_quit", "CFASL-QUIT", 0, 0, false);
    declareFunction(myName, "cfasl_port", "CFASL-PORT", 0, 0, false);
    declareFunction(myName, "read_cfasl_request", "READ-CFASL-REQUEST", 1, 2, false);
    declareFunction(myName, "validate_cfasl_request", "VALIDATE-CFASL-REQUEST", 1, 0, false);
    declareFunction(myName, "send_cfasl_result", "SEND-CFASL-RESULT", 2, 1, false);
    declareFunction(myName, "cfasl_api_exception_p", "CFASL-API-EXCEPTION-P", 1, 0, false);
    declareFunction(myName, "make_cfasl_api_exception", "MAKE-CFASL-API-EXCEPTION", 1, 0, false);
    declareFunction(myName, "cfasl_api_exception_message", "CFASL-API-EXCEPTION-MESSAGE", 1, 0, false);
    declareFunction(myName, "cfasl_api_remote_eval", "CFASL-API-REMOTE-EVAL", 3, 0, false);
    declareFunction(myName, "cfasl_channel_eval", "CFASL-CHANNEL-EVAL", 2, 0, false);
    declareFunction(myName, "cfasl_channel_eval_internal", "CFASL-CHANNEL-EVAL-INTERNAL", 2, 0, false);
    declareFunction(myName, "cfasl_channel_output", "CFASL-CHANNEL-OUTPUT", 2, 0, false);
    declareFunction(myName, "cfasl_channel_input", "CFASL-CHANNEL-INPUT", 2, 0, false);
    declareFunction(myName, "task_processor_request", "TASK-PROCESSOR-REQUEST", 5, 1, false);
    return NIL;
  }

  public static final SubLObject init_cfasl_kernel_file() {
    $perform_cfasl_externalization$ = defparameter("*PERFORM-CFASL-EXTERNALIZATION*", NIL);
    $cfasl_kernel_standard_output$ = defparameter("*CFASL-KERNEL-STANDARD-OUTPUT*", NIL);
    $cfasl_eof_exception$ = defparameter("*CFASL-EOF-EXCEPTION*", make_cfasl_api_exception($str18$EOF_occurred_on_CFASL_API_stream));
    return NIL;
  }

  public static final SubLObject setup_cfasl_kernel_file() {
    // CVS_ID("Id: cfasl-kernel.lisp 126640 2008-12-04 13:39:36Z builder ");
    tcp_server_utilities.register_tcp_server_type($kw0$CFASL, $sym1$CFASL_SERVER_HANDLER, $kw2$BINARY);
    utilities_macros.register_cyc_api_function($sym25$TASK_PROCESSOR_REQUEST, $list26, $str27$_param_REQUEST__consp_for_evaluat, $list28, $list29);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$CFASL = makeKeyword("CFASL");
  public static final SubLSymbol $sym1$CFASL_SERVER_HANDLER = makeSymbol("CFASL-SERVER-HANDLER");
  public static final SubLSymbol $kw2$BINARY = makeKeyword("BINARY");
  public static final SubLSymbol $sym3$READ_CFASL_REQUEST = makeSymbol("READ-CFASL-REQUEST");
  public static final SubLSymbol $sym4$VALIDATE_CFASL_REQUEST = makeSymbol("VALIDATE-CFASL-REQUEST");
  public static final SubLSymbol $sym5$SEND_CFASL_RESULT = makeSymbol("SEND-CFASL-RESULT");
  public static final SubLSymbol $kw6$EOF = makeKeyword("EOF");
  public static final SubLSymbol $sym7$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str8$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a proper list");
  public static final SubLString $str9$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a valid API function symbol");
  public static final SubLSymbol $sym10$CYC_EXCEPTION = makeSymbol("CYC-EXCEPTION");
  public static final SubLSymbol $kw11$MESSAGE = makeKeyword("MESSAGE");
  public static final SubLSymbol $sym12$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym13$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $kw14$PRIVATE = makeKeyword("PRIVATE");
  public static final SubLList $list15 = list(makeSymbol("CFASL-QUIT"));
  public static final SubLString $str16$_A = makeString("~A");
  public static final SubLSymbol $sym17$STREAMP = makeSymbol("STREAMP");
  public static final SubLString $str18$EOF_occurred_on_CFASL_API_stream = makeString("EOF occurred on CFASL API stream");
  public static final SubLSymbol $sym19$CONSP = makeSymbol("CONSP");
  public static final SubLSymbol $sym20$LISTP = makeSymbol("LISTP");
  public static final SubLList $list21 = list(makeSymbol("*USE-LOCAL-QUEUE?*"), NIL);
  public static final SubLSymbol $sym22$_THE_CYCLIST_ = makeSymbol("*THE-CYCLIST*");
  public static final SubLSymbol $sym23$_KE_PURPOSE_ = makeSymbol("*KE-PURPOSE*");
  public static final SubLList $list24 = list(new SubLObject[] {list(makeSymbol("*EVAL-IN-API-ENV*"), NIL), list(makeSymbol("*EVAL-IN-API-LEVEL*"), ZERO_INTEGER), list(makeSymbol("*EVAL-IN-API-TRACED-FNS*"), NIL), list(makeSymbol("*EVAL-IN-API-TRACE-LOG*"), makeString("")), list(makeSymbol("*IGNORE-WARNS?*"), T), list(makeSymbol("*IGNORE-BREAKS?*"), T), list(makeSymbol("*SILENT-PROGRESS?*"), T), list(makeSymbol("*CONTINUE-CERROR?*"), T), list(makeSymbol("*STANDARD-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*ERROR-OUTPUT*"), makeSymbol("*NULL-OUTPUT*")), list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeKeyword("CYC")))});
  public static final SubLSymbol $sym25$TASK_PROCESSOR_REQUEST = makeSymbol("TASK-PROCESSOR-REQUEST");
  public static final SubLList $list26 = list(makeSymbol("REQUEST"), makeSymbol("ID"), makeSymbol("PRIORITY"), makeSymbol("REQUESTOR"), makeSymbol("CLIENT-BINDINGS"), makeSymbol("&OPTIONAL"), makeSymbol("UUID-STRING"));
  public static final SubLString $str27$_param_REQUEST__consp_for_evaluat = makeString("@param REQUEST; consp for evaluation\n   @param ID; integerp\n   @param PRIORITY; intergerp\n   @param REQUESTOR; stringp\n   @param CLIENT-BINDINGS; consp of (var value) pairs\n   @param UUID-STRING; identifies the client to which the response will be sent\n   Submits the REQUEST form to the task request queue with ID, PRIORITY,\n   REQUESTOR, BINDINGS and OUT-STREAM.");
  public static final SubLList $list28 = list(list(makeSymbol("REQUEST"), makeSymbol("CONSP")), list(makeSymbol("ID"), makeSymbol("INTEGERP")), list(makeSymbol("PRIORITY"), makeSymbol("INTEGERP")), list(makeSymbol("REQUESTOR"), makeSymbol("STRINGP")), list(makeSymbol("CLIENT-BINDINGS"), makeSymbol("LISTP")));
  public static final SubLList $list29 = list(NIL);

  //// Initializers

  public void declareFunctions() {
    declare_cfasl_kernel_file();
  }

  public void initializeVariables() {
    init_cfasl_kernel_file();
  }

  public void runTopLevelForms() {
    setup_cfasl_kernel_file();
  }

}
