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
//dm import com.cyc.cycjava_1.cycl.api_control_vars;
//dm import com.cyc.cycjava_1.cycl.cfasl_kernel;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.eval_in_api;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.operation_communication;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_parameters;
//dm import com.cyc.cycjava_1.cycl.task_processor;
//dm import com.cyc.cycjava_1.cycl.tcp_server_utilities;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class api_kernel extends SubLTranslatedFile {

  //// Constructor

  private api_kernel() {}
  public static final SubLFile me = new api_kernel();
  public static final String myName = "com.cyc.cycjava_1.cycl.api_kernel";

  //// Definitions

  @SubL(source = "cycl/api-kernel.lisp", position = 897) 
  public static final SubLObject api_server_handler(SubLObject in_stream, SubLObject out_stream) {
    return api_server_top_level(in_stream, out_stream);
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 1116) 
  private static SubLSymbol $within_api_server$ = null;

  @SubL(source = "cycl/api-kernel.lisp", position = 1164) 
  public static final SubLObject api_server_top_level(SubLObject in_stream, SubLObject out_stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = Packages.$package$.currentBinding(thread);
        SubLObject _prev_bind_1 = reader.$read_default_float_format$.currentBinding(thread);
        SubLObject _prev_bind_2 = print_high.$print_readably$.currentBinding(thread);
        SubLObject _prev_bind_3 = reader.$read_eval$.currentBinding(thread);
        try {
          Packages.$package$.bind(Packages.find_package($str3$CYC), thread);
          reader.$read_default_float_format$.bind($sym4$DOUBLE_FLOAT, thread);
          print_high.$print_readably$.bind(NIL, thread);
          reader.$read_eval$.bind(NIL, thread);
          {
            SubLObject old_priority = Threads.process_priority(Threads.current_process());
            try {
              Threads.set_process_priority(Threads.current_process(), Threads.$process_normal_priority$.getGlobalValue());
              {
                SubLObject catch_var = NIL;
                try {
                  {
                    SubLObject _prev_bind_0_1 = $within_api_server$.currentBinding(thread);
                    try {
                      $within_api_server$.bind(T, thread);
                      api_server_loop(in_stream, out_stream);
                    } finally {
                      $within_api_server$.rebind(_prev_bind_0_1, thread);
                    }
                  }
                } catch (Throwable ccatch_env_var) {
                  catch_var = Errors.handleThrowable(ccatch_env_var, $kw5$API_QUIT);
                }
              }
            } finally {
              {
                SubLObject _prev_bind_0_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                  Threads.set_process_priority(Threads.current_process(), old_priority);
                } finally {
                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                }
              }
            }
          }
        } finally {
          reader.$read_eval$.rebind(_prev_bind_3, thread);
          print_high.$print_readably$.rebind(_prev_bind_2, thread);
          reader.$read_default_float_format$.rebind(_prev_bind_1, thread);
          Packages.$package$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** Explicitly quit this api connection. */
  @SubL(source = "cycl/api-kernel.lisp", position = 1375) 
  public static final SubLObject api_quit() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $within_api_server$.getDynamicValue(thread))) {
        Dynamic.sublisp_throw($kw5$API_QUIT, NIL);
      }
      return NIL;
    }
  }

  /** The default API input protocol to use. */
  @SubL(source = "cycl/api-kernel.lisp", position = 1658) 
  public static SubLSymbol $default_api_input_protocol$ = null;

  @SubL(source = "cycl/api-kernel.lisp", position = 1838) 
  private static SubLSymbol $api_input_protocol$ = null;

  /** The default API input validator to use. */
  @SubL(source = "cycl/api-kernel.lisp", position = 1912) 
  public static SubLSymbol $default_api_validate_method$ = null;

  /** When non-nil, a function which is called to validate any API request
before evaluation. */
  @SubL(source = "cycl/api-kernel.lisp", position = 2032) 
  public static SubLSymbol $api_validate_method$ = null;

  @SubL(source = "cycl/api-kernel.lisp", position = 2191) 
  private static SubLSymbol $default_api_result_method$ = null;

  /** When non-nil, a function which is called to transform any API result
before returning the output. */
  @SubL(source = "cycl/api-kernel.lisp", position = 2245) 
  public static SubLSymbol $api_result_method$ = null;

  /** The default API output protocol to use. */
  @SubL(source = "cycl/api-kernel.lisp", position = 2410) 
  public static SubLSymbol $default_api_output_protocol$ = null;

  @SubL(source = "cycl/api-kernel.lisp", position = 2529) 
  private static SubLSymbol $api_output_protocol$ = null;

  /** the api input stream (for use by the java-api-kernel). */
  @SubL(source = "cycl/api-kernel.lisp", position = 2971) 
  public static SubLSymbol $api_in_stream$ = null;

  /** the api output stream (for use by the java-api-kernel). */
  @SubL(source = "cycl/api-kernel.lisp", position = 3124) 
  public static SubLSymbol $api_out_stream$ = null;

  @SubL(source = "cycl/api-kernel.lisp", position = 3221) 
  public static final SubLObject api_server_loop(SubLObject in_stream, SubLObject out_stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        SubLObject _prev_bind_1 = api_control_vars.$the_cyclist$.currentBinding(thread);
        SubLObject _prev_bind_2 = api_control_vars.$ke_purpose$.currentBinding(thread);
        SubLObject _prev_bind_3 = $api_in_stream$.currentBinding(thread);
        SubLObject _prev_bind_4 = $api_out_stream$.currentBinding(thread);
        SubLObject _prev_bind_5 = $api_input_protocol$.currentBinding(thread);
        SubLObject _prev_bind_6 = $api_validate_method$.currentBinding(thread);
        SubLObject _prev_bind_7 = $api_result_method$.currentBinding(thread);
        SubLObject _prev_bind_8 = $api_output_protocol$.currentBinding(thread);
        SubLObject _prev_bind_9 = eval_in_api.$eval_in_api_env$.currentBinding(thread);
        SubLObject _prev_bind_10 = eval_in_api.$eval_in_api_traced_fns$.currentBinding(thread);
        SubLObject _prev_bind_11 = eval_in_api.$eval_in_api_trace_log$.currentBinding(thread);
        SubLObject _prev_bind_12 = Errors.$ignore_warnsP$.currentBinding(thread);
        SubLObject _prev_bind_13 = Errors.$ignore_breaksP$.currentBinding(thread);
        SubLObject _prev_bind_14 = utilities_macros.$silent_progressP$.currentBinding(thread);
        SubLObject _prev_bind_15 = Errors.$continue_cerrorP$.currentBinding(thread);
        SubLObject _prev_bind_16 = StreamsLow.$standard_output$.currentBinding(thread);
        SubLObject _prev_bind_17 = StreamsLow.$error_output$.currentBinding(thread);
        try {
          api_control_vars.$use_local_queueP$.bind(NIL, thread);
          api_control_vars.$the_cyclist$.bind(operation_communication.the_cyclist(), thread);
          api_control_vars.$ke_purpose$.bind(api_control_vars.$default_ke_purpose$.getDynamicValue(thread), thread);
          $api_in_stream$.bind(in_stream, thread);
          $api_out_stream$.bind(out_stream, thread);
          $api_input_protocol$.bind($default_api_input_protocol$.getDynamicValue(thread), thread);
          $api_validate_method$.bind($default_api_validate_method$.getDynamicValue(thread), thread);
          $api_result_method$.bind($default_api_result_method$.getGlobalValue(), thread);
          $api_output_protocol$.bind($default_api_output_protocol$.getDynamicValue(thread), thread);
          eval_in_api.$eval_in_api_env$.bind(eval_in_api.initialize_eval_in_api_env(), thread);
          eval_in_api.$eval_in_api_traced_fns$.bind(NIL, thread);
          eval_in_api.$eval_in_api_trace_log$.bind($str13$, thread);
          Errors.$ignore_warnsP$.bind(T, thread);
          Errors.$ignore_breaksP$.bind(T, thread);
          utilities_macros.$silent_progressP$.bind(T, thread);
          Errors.$continue_cerrorP$.bind(T, thread);
          StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
          StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
          while (true) {
            api_server_one_complete_request(in_stream, out_stream);
          }
        } finally {
          StreamsLow.$error_output$.rebind(_prev_bind_17, thread);
          StreamsLow.$standard_output$.rebind(_prev_bind_16, thread);
          Errors.$continue_cerrorP$.rebind(_prev_bind_15, thread);
          utilities_macros.$silent_progressP$.rebind(_prev_bind_14, thread);
          Errors.$ignore_breaksP$.rebind(_prev_bind_13, thread);
          Errors.$ignore_warnsP$.rebind(_prev_bind_12, thread);
          eval_in_api.$eval_in_api_trace_log$.rebind(_prev_bind_11, thread);
          eval_in_api.$eval_in_api_traced_fns$.rebind(_prev_bind_10, thread);
          eval_in_api.$eval_in_api_env$.rebind(_prev_bind_9, thread);
          $api_output_protocol$.rebind(_prev_bind_8, thread);
          $api_result_method$.rebind(_prev_bind_7, thread);
          $api_validate_method$.rebind(_prev_bind_6, thread);
          $api_input_protocol$.rebind(_prev_bind_5, thread);
          $api_out_stream$.rebind(_prev_bind_4, thread);
          $api_in_stream$.rebind(_prev_bind_3, thread);
          api_control_vars.$ke_purpose$.rebind(_prev_bind_2, thread);
          api_control_vars.$the_cyclist$.rebind(_prev_bind_1, thread);
          api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
      }
    }
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 3716) 
  public static final SubLObject api_server_one_complete_request(SubLObject in_stream, SubLObject out_stream) {
    {
      SubLObject error_message = NIL;
      SubLObject api_request = NIL;
      SubLObject api_result = NIL;
      try {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
          try {
            Dynamic.bind(Errors.$error_handler$, $sym14$CATCH_ERROR_MESSAGE_HANDLER);
            try {
              api_request = read_api_request(in_stream);
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
      if ((NIL == error_message)) {
        try {
          {
            SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
            try {
              Dynamic.bind(Errors.$error_handler$, $sym14$CATCH_ERROR_MESSAGE_HANDLER);
              try {
                validate_api_request(api_request);
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
      }
      if ((NIL == error_message)) {
        try {
          {
            SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
            try {
              Dynamic.bind(Errors.$error_handler$, $sym14$CATCH_ERROR_MESSAGE_HANDLER);
              try {
                record_api_request(api_request);
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
      }
      if ((api_request.first() == $sym15$TASK_PROCESSOR_REQUEST)) {
        {
          SubLObject lock = task_processor.$api_task_process_pool_lock$.getGlobalValue();
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            if ((NIL == task_processor.api_task_processors_initialized_p())) {
              task_processor.initialize_api_task_processors();
            }
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
        {
          SubLObject datum = api_request;
          SubLObject current = datum;
          SubLObject function = NIL;
          SubLObject request = NIL;
          SubLObject id = NIL;
          SubLObject priority = NIL;
          SubLObject requestor = NIL;
          SubLObject client_bindings = NIL;
          SubLObject uuid_string = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          function = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          request = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          id = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          priority = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          requestor = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          client_bindings = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          uuid_string = current.first();
          current = current.rest();
          if ((NIL == current)) {
            cfasl_kernel.task_processor_request(request, id, priority, requestor, client_bindings, uuid_string);
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
          }
        }
        return NIL;
      }
      if ((NIL == error_message)) {
        try {
          {
            SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
            try {
              Dynamic.bind(Errors.$error_handler$, $sym14$CATCH_ERROR_MESSAGE_HANDLER);
              try {
                api_result = perform_api_request(api_request);
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
      }
      if ((NIL != error_message)) {
        send_api_result(out_stream, error_message, T);
      } else {
        send_api_result(out_stream, api_result, NIL);
      }
      if ((NIL != error_message)) {
        record_api_result(error_message, T);
      } else {
        record_api_result(api_result, NIL);
      }
      update_api_protocol();
    }
    return NIL;
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 5493) 
  private static SubLSymbol $api_input_eof_marker$ = null;

  @SubL(source = "cycl/api-kernel.lisp", position = 5635) 
  public static final SubLObject read_api_request(SubLObject in_stream) {
    {
      SubLObject request = Functions.funcall(api_input_protocol(), in_stream, NIL, $api_input_eof_marker$.getGlobalValue());
      if ((request == $api_input_eof_marker$.getGlobalValue())) {
        api_quit();
      }
      return request;
    }
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 5930) 
  public static final SubLObject validate_api_request(SubLObject api_request) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $api_validate_method$.getDynamicValue(thread))) {
        return Functions.funcall($api_validate_method$.getDynamicValue(thread), api_request);
      } else {
        return T;
      }
    }
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 6815) 
  public static final SubLObject valid_api_function_symbol(SubLObject symbol) {
    return makeBoolean((symbol.isSymbol()
           && (NIL != Symbols.fboundp(symbol))));
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 6976) 
  public static SubLSymbol $record_api_messagesP$ = null;

  /** Either a list or a stream.  If a list, the messages are stuck
on the list.  If a stream, the messages are output to it. */
  @SubL(source = "cycl/api-kernel.lisp", position = 7107) 
  public static SubLSymbol $api_message_sink$ = null;

  @SubL(source = "cycl/api-kernel.lisp", position = 7270) 
  public static final SubLObject record_api_request(SubLObject api_request) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $record_api_messagesP$.getDynamicValue(thread))) {
        if ($api_message_sink$.getDynamicValue(thread).isStream()) {
          print_high.prin1(api_request, $api_message_sink$.getDynamicValue(thread));
          streams_high.terpri($api_message_sink$.getDynamicValue(thread));
          streams_high.force_output($api_message_sink$.getDynamicValue(thread));
        } else if ($api_message_sink$.getDynamicValue(thread).isList()) {
          $api_message_sink$.setDynamicValue(cons(api_request, $api_message_sink$.getDynamicValue(thread)), thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 7618) 
  public static final SubLObject record_api_result(SubLObject result, SubLObject errorP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $record_api_messagesP$.getDynamicValue(thread))) {
        if ($api_message_sink$.getDynamicValue(thread).isStream()) {
          default_api_output_protocol($api_message_sink$.getDynamicValue(thread), result, errorP);
        } else if ($api_message_sink$.getDynamicValue(thread).isList()) {
          $api_message_sink$.setDynamicValue(cons(list(errorP, result), $api_message_sink$.getDynamicValue(thread)), thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 7924) 
  public static final SubLObject perform_api_request(SubLObject api_request) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      fi.reset_fi_error_state();
      {
        SubLObject result = eval_in_api.cyc_api_eval(api_request);
        if ((NIL != fi.fi_error_signaledP())) {
          Errors.error(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11154"));
        }
        if ((NIL != $api_result_method$.getDynamicValue(thread))) {
          result = Functions.funcall($api_result_method$.getDynamicValue(thread), result);
        }
        return result;
      }
    }
  }

  /** Send API-RESULT to OUT-STREAM respecting ERROR?. */
  @SubL(source = "cycl/api-kernel.lisp", position = 8625) 
  public static final SubLObject send_api_result(SubLObject out_stream, SubLObject api_result, SubLObject errorP) {
    {
      SubLObject recursive_error = NIL;
      SubLObject ans = NIL;
      try {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
          try {
            Dynamic.bind(Errors.$error_handler$, $sym14$CATCH_ERROR_MESSAGE_HANDLER);
            try {
              try {
                Numbers.add(ONE_INTEGER, TWO_INTEGER);
              } finally {
                {
                  SubLObject _prev_bind_0_3 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                  try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                    ans = Functions.funcall(Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31555"), out_stream, api_result, errorP);
                  } finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0_3);
                  }
                }
              }
            } catch (Throwable catch_var) {
              Errors.handleThrowable(catch_var, NIL);
            }
          } finally {
            Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
          }
        }
      } catch (Throwable ccatch_env_var) {
        recursive_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
      }
      if ((NIL != recursive_error)) {
        api_quit();
      }
      return ans;
    }
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 9626) 
  private static SubLSymbol $api_success_code$ = null;

  @SubL(source = "cycl/api-kernel.lisp", position = 9673) 
  private static SubLSymbol $api_error_code$ = null;

  @SubL(source = "cycl/api-kernel.lisp", position = 9720) 
  public static final SubLObject default_api_output_protocol(SubLObject out_stream, SubLObject api_result, SubLObject errorP) {
    if ((errorP == UNPROVIDED)) {
      errorP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result_code = ((NIL != errorP) ? ((SubLObject) $api_error_code$.getDynamicValue(thread)) : $api_success_code$.getDynamicValue(thread));
        PrintLow.format(out_stream, $str28$_D__S, result_code, api_result);
      }
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7458");
      streams_high.force_output(out_stream);
      return api_result;
    }
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 10061) 
  private static SubLSymbol $new_api_input_protocol$ = null;

  @SubL(source = "cycl/api-kernel.lisp", position = 10182) 
  private static SubLSymbol $new_api_output_protocol$ = null;

  @SubL(source = "cycl/api-kernel.lisp", position = 10785) 
  public static final SubLObject update_api_protocol() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != $new_api_input_protocol$.getDynamicValue(thread))
           && (NIL != $new_api_output_protocol$.getDynamicValue(thread)))) {
        set_api_input_protocol($new_api_input_protocol$.getDynamicValue(thread));
        set_api_output_protocol($new_api_output_protocol$.getDynamicValue(thread));
        $new_api_input_protocol$.setDynamicValue(NIL, thread);
        $new_api_output_protocol$.setDynamicValue(NIL, thread);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 11113) 
  public static final SubLObject api_input_protocol() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $api_input_protocol$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 11253) 
  public static final SubLObject set_api_input_protocol(SubLObject input_protocol) {
    checkType(input_protocol, $sym29$FUNCTION_SPEC_P);
    $api_input_protocol$.setDynamicValue(input_protocol);
    return T;
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 11414) 
  public static final SubLObject set_api_output_protocol(SubLObject output_protocol) {
    checkType(output_protocol, $sym29$FUNCTION_SPEC_P);
    $api_output_protocol$.setDynamicValue(output_protocol);
    return T;
  }

  /** Returns the local api-port according to defined system parameters. */
  @SubL(source = "cycl/api-kernel.lisp", position = 11579) 
  public static final SubLObject api_port() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Numbers.add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$fi_port_offset$.getDynamicValue(thread));
    }
  }

  @SubL(source = "cycl/api-kernel.lisp", position = 12673) 
  private static SubLSymbol $cyc_api_eof_exception$ = null;

  public static final SubLObject declare_api_kernel_file() {
    declareFunction(myName, "api_server_handler", "API-SERVER-HANDLER", 2, 0, false);
    declareFunction(myName, "api_server_top_level", "API-SERVER-TOP-LEVEL", 2, 0, false);
    declareFunction(myName, "api_quit", "API-QUIT", 0, 0, false);
    declareFunction(myName, "abort_api_server_process", "ABORT-API-SERVER-PROCESS", 1, 0, false);
    declareMacro(myName, "with_api_protocol_bindings", "WITH-API-PROTOCOL-BINDINGS");
    declareFunction(myName, "api_server_loop", "API-SERVER-LOOP", 2, 0, false);
    declareFunction(myName, "api_server_one_complete_request", "API-SERVER-ONE-COMPLETE-REQUEST", 2, 0, false);
    declareFunction(myName, "read_api_request", "READ-API-REQUEST", 1, 0, false);
    declareFunction(myName, "validate_api_request", "VALIDATE-API-REQUEST", 1, 0, false);
    declareFunction(myName, "default_validate_api_request", "DEFAULT-VALIDATE-API-REQUEST", 1, 0, false);
    declareFunction(myName, "valid_api_function_symbol", "VALID-API-FUNCTION-SYMBOL", 1, 0, false);
    declareFunction(myName, "record_api_request", "RECORD-API-REQUEST", 1, 0, false);
    declareFunction(myName, "record_api_result", "RECORD-API-RESULT", 2, 0, false);
    declareFunction(myName, "perform_api_request", "PERFORM-API-REQUEST", 1, 0, false);
    declareFunction(myName, "daml_api_result_transform", "DAML-API-RESULT-TRANSFORM", 1, 0, false);
    declareFunction(myName, "send_api_result", "SEND-API-RESULT", 3, 0, false);
    declareFunction(myName, "default_api_input_protocol", "DEFAULT-API-INPUT-PROTOCOL", 1, 2, false);
    declareFunction(myName, "default_api_output_protocol", "DEFAULT-API-OUTPUT-PROTOCOL", 2, 1, false);
    declareFunction(myName, "change_api_protocol", "CHANGE-API-PROTOCOL", 2, 0, false);
    declareFunction(myName, "change_api_result_method", "CHANGE-API-RESULT-METHOD", 1, 0, false);
    declareFunction(myName, "update_api_protocol", "UPDATE-API-PROTOCOL", 0, 0, false);
    declareFunction(myName, "api_input_protocol", "API-INPUT-PROTOCOL", 0, 0, false);
    declareFunction(myName, "api_output_protocol", "API-OUTPUT-PROTOCOL", 0, 0, false);
    declareFunction(myName, "set_api_input_protocol", "SET-API-INPUT-PROTOCOL", 1, 0, false);
    declareFunction(myName, "set_api_output_protocol", "SET-API-OUTPUT-PROTOCOL", 1, 0, false);
    declareFunction(myName, "api_port", "API-PORT", 0, 0, false);
    declareFunction(myName, "cyc_api_remote_eval", "CYC-API-REMOTE-EVAL", 3, 0, false);
    declareFunction(myName, "cyc_api_channel_eval", "CYC-API-CHANNEL-EVAL", 2, 0, false);
    declareFunction(myName, "cyc_api_channel_eval_internal", "CYC-API-CHANNEL-EVAL-INTERNAL", 2, 0, false);
    declareFunction(myName, "cyc_api_channel_output", "CYC-API-CHANNEL-OUTPUT", 2, 0, false);
    declareFunction(myName, "cyc_api_channel_input", "CYC-API-CHANNEL-INPUT", 2, 0, false);
    declareFunction(myName, "fi_server_top_level", "FI-SERVER-TOP-LEVEL", 2, 0, false);
    declareFunction(myName, "fi_quit", "FI-QUIT", 0, 0, false);
    declareFunction(myName, "fi_port", "FI-PORT", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_api_kernel_file() {
    $within_api_server$ = defparameter("*WITHIN-API-SERVER*", NIL);
    $default_api_input_protocol$ = defparameter("*DEFAULT-API-INPUT-PROTOCOL*", $sym8$DEFAULT_API_INPUT_PROTOCOL);
    $api_input_protocol$ = defparameter("*API-INPUT-PROTOCOL*", $default_api_input_protocol$.getDynamicValue());
    $default_api_validate_method$ = defparameter("*DEFAULT-API-VALIDATE-METHOD*", $sym9$DEFAULT_VALIDATE_API_REQUEST);
    $api_validate_method$ = defparameter("*API-VALIDATE-METHOD*", $default_api_validate_method$.getDynamicValue());
    $default_api_result_method$ = deflexical("*DEFAULT-API-RESULT-METHOD*", NIL);
    $api_result_method$ = defparameter("*API-RESULT-METHOD*", $default_api_result_method$.getGlobalValue());
    $default_api_output_protocol$ = defparameter("*DEFAULT-API-OUTPUT-PROTOCOL*", $sym10$DEFAULT_API_OUTPUT_PROTOCOL);
    $api_output_protocol$ = defparameter("*API-OUTPUT-PROTOCOL*", $default_api_output_protocol$.getDynamicValue());
    $api_in_stream$ = defparameter("*API-IN-STREAM*", NIL);
    $api_out_stream$ = defparameter("*API-OUT-STREAM*", NIL);
    $api_input_eof_marker$ = deflexical("*API-INPUT-EOF-MARKER*", maybeDefault( $sym17$_API_INPUT_EOF_MARKER_, $api_input_eof_marker$, ()-> (Symbols.make_symbol($str18$API_Input_EOF_Marker))));
    $record_api_messagesP$ = defparameter("*RECORD-API-MESSAGES?*", NIL);
    $api_message_sink$ = defparameter("*API-MESSAGE-SINK*", NIL);
    $api_success_code$ = defparameter("*API-SUCCESS-CODE*", $int26$200);
    $api_error_code$ = defparameter("*API-ERROR-CODE*", $int27$500);
    $new_api_input_protocol$ = defparameter("*NEW-API-INPUT-PROTOCOL*", NIL);
    $new_api_output_protocol$ = defparameter("*NEW-API-OUTPUT-PROTOCOL*", NIL);
    $cyc_api_eof_exception$ = deflexical("*CYC-API-EOF-EXCEPTION*", $kw41$EOF);
    return NIL;
  }

  public static final SubLObject setup_api_kernel_file() {
        tcp_server_utilities.register_tcp_server_type($kw0$CYC_API, $sym1$API_SERVER_HANDLER, $kw2$TEXT);
    utilities_macros.register_cyc_api_function($sym6$API_QUIT, NIL, $str7$Explicitly_quit_this_api_connecti, NIL, NIL);
    subl_macro_promotions.declare_defglobal($sym17$_API_INPUT_EOF_MARKER_);
    utilities_macros.register_cyc_api_function($sym36$CYC_API_REMOTE_EVAL, $list37, $str38$Evaluate_API_REQUEST_on_MACHINE_u, $list39, NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$CYC_API = makeKeyword("CYC-API");
  public static final SubLSymbol $sym1$API_SERVER_HANDLER = makeSymbol("API-SERVER-HANDLER");
  public static final SubLSymbol $kw2$TEXT = makeKeyword("TEXT");
  public static final SubLString $str3$CYC = makeString("CYC");
  public static final SubLSymbol $sym4$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLSymbol $kw5$API_QUIT = makeKeyword("API-QUIT");
  public static final SubLSymbol $sym6$API_QUIT = makeSymbol("API-QUIT");
  public static final SubLString $str7$Explicitly_quit_this_api_connecti = makeString("Explicitly quit this api connection.");
  public static final SubLSymbol $sym8$DEFAULT_API_INPUT_PROTOCOL = makeSymbol("DEFAULT-API-INPUT-PROTOCOL");
  public static final SubLSymbol $sym9$DEFAULT_VALIDATE_API_REQUEST = makeSymbol("DEFAULT-VALIDATE-API-REQUEST");
  public static final SubLSymbol $sym10$DEFAULT_API_OUTPUT_PROTOCOL = makeSymbol("DEFAULT-API-OUTPUT-PROTOCOL");
  public static final SubLSymbol $sym11$CLET = makeSymbol("CLET");
  public static final SubLList $list12 = list(list(makeSymbol("*API-INPUT-PROTOCOL*"), makeSymbol("*DEFAULT-API-INPUT-PROTOCOL*")), list(makeSymbol("*API-VALIDATE-METHOD*"), makeSymbol("*DEFAULT-API-VALIDATE-METHOD*")), list(makeSymbol("*API-RESULT-METHOD*"), makeSymbol("*DEFAULT-API-RESULT-METHOD*")), list(makeSymbol("*API-OUTPUT-PROTOCOL*"), makeSymbol("*DEFAULT-API-OUTPUT-PROTOCOL*")));
  public static final SubLString $str13$ = makeString("");
  public static final SubLSymbol $sym14$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $sym15$TASK_PROCESSOR_REQUEST = makeSymbol("TASK-PROCESSOR-REQUEST");
  public static final SubLList $list16 = list(makeSymbol("FUNCTION"), makeSymbol("REQUEST"), makeSymbol("ID"), makeSymbol("PRIORITY"), makeSymbol("REQUESTOR"), makeSymbol("CLIENT-BINDINGS"), makeSymbol("UUID-STRING"));
  public static final SubLSymbol $sym17$_API_INPUT_EOF_MARKER_ = makeSymbol("*API-INPUT-EOF-MARKER*");
  public static final SubLString $str18$API_Input_EOF_Marker = makeString("API Input EOF Marker");
  public static final SubLString $str19$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a proper list");
  public static final SubLString $str20$Invalid_API_Request___S_is_not_a_ = makeString("Invalid API Request: ~S is not a valid API function symbol");
  public static final SubLSymbol $sym21$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");
  public static final SubLString $str22$___A_is_not_an_existing_constant = makeString("#$~A is not an existing constant");
  public static final SubLString $str23$API_request_references_an_invalid = makeString("API request references an invalid constant");
  public static final SubLSymbol $sym24$GUID_P = makeSymbol("GUID-P");
  public static final SubLSymbol $sym25$GUID_TO_STRING = makeSymbol("GUID-TO-STRING");
  public static final SubLInteger $int26$200 = makeInteger(200);
  public static final SubLInteger $int27$500 = makeInteger(500);
  public static final SubLString $str28$_D__S = makeString("~D ~S");
  public static final SubLSymbol $sym29$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym30$CONSP = makeSymbol("CONSP");
  public static final SubLSymbol $sym31$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym32$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $kw33$PRIVATE = makeKeyword("PRIVATE");
  public static final SubLString $str34$_api_quit__ = makeString("(api-quit) ");
  public static final SubLString $str35$_A = makeString("~A");
  public static final SubLSymbol $sym36$CYC_API_REMOTE_EVAL = makeSymbol("CYC-API-REMOTE-EVAL");
  public static final SubLList $list37 = list(makeSymbol("API-REQUEST"), makeSymbol("MACHINE"), makeSymbol("PORT"));
  public static final SubLString $str38$Evaluate_API_REQUEST_on_MACHINE_u = makeString("Evaluate API-REQUEST on MACHINE using the CYC-API server at TCP PORT");
  public static final SubLList $list39 = list(list(makeSymbol("API-REQUEST"), makeSymbol("CONSP")), list(makeSymbol("MACHINE"), makeSymbol("STRINGP")), list(makeSymbol("PORT"), makeSymbol("INTEGERP")));
  public static final SubLSymbol $sym40$STREAMP = makeSymbol("STREAMP");
  public static final SubLSymbol $kw41$EOF = makeKeyword("EOF");
  public static final SubLString $str42$_S_ = makeString("~S ");

  //// Initializers

  public void declareFunctions() {
    declare_api_kernel_file();
  }

  public void initializeVariables() {
    init_api_kernel_file();
  }

  public void runTopLevelForms() {
    setup_api_kernel_file();
  }

}
