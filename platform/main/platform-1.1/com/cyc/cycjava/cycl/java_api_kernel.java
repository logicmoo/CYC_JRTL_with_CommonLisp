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
import com.cyc.cycjava.cycl.api_kernel;
import com.cyc.cycjava.cycl.cfasl_kernel;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.eval_in_api;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.os_process_utilities;
import com.cyc.cycjava.cycl.red_api;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.task_processor;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class java_api_kernel extends SubLTranslatedFile {

  //// Constructor

  private java_api_kernel() {}
  public static final SubLFile me = new java_api_kernel();
  public static final String myName = "com.cyc.cycjava.cycl.java_api_kernel";

  //// Definitions

  /** The dictionary of java api client leases.  The key is a
UUID string (GUID) provided by the java client, and the value is a timestamp
giving the lease expiration time. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 2885) 
  private static SubLSymbol $java_api_leases$ = null;

  /** The process which monitors lease expirations for java api clients. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 3515) 
  private static SubLSymbol $java_api_lease_monitor$ = null;

  /** Initialize the process which monitors lease expirations for java api clients. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 3637) 
  public static final SubLObject initialize_java_api_lease_monitor() {
    halt_java_api_lease_monitor();
    $java_api_lease_monitor$.setGlobalValue(Threads.make_process($str1$Java_API_lease_monitor, Symbols.symbol_function($sym2$JAVA_API_LEASE_MONITOR)));
    return NIL;
  }

  /** Halt the the process which monitors lease expirations for java api clients. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 3931) 
  public static final SubLObject halt_java_api_lease_monitor() {
    if ((NIL != $java_api_lease_monitor$.getGlobalValue())) {
      Threads.kill_process($java_api_lease_monitor$.getGlobalValue());
      $java_api_lease_monitor$.setGlobalValue(NIL);
    }
    return NIL;
  }

  /** The lease monitor will check for invalid leases every this many seconds. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 4193) 
  private static SubLSymbol $java_api_lease_monitor_sleep_seconds$ = null;

  /** Periodically monitors java api client leases, closing sockets and killing active api requests belonging
   to clients having expired leases. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 4334) 
  public static final SubLObject java_api_lease_monitor() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject current_utc_time_with_milliseconds = NIL;
        SubLObject uuid_strings_to_remove = NIL;
        while (true) {
          {
            SubLObject ignore_errors_tag = NIL;
            try {
              {
                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                  Errors.$error_handler$.bind(Symbols.symbol_function($sym8$IGNORE_ERRORS_HANDLER), thread);
                  try {
                    if ((NIL != $java_api_leases$.getGlobalValue())) {
                      uuid_strings_to_remove = NIL;
                      current_utc_time_with_milliseconds = numeric_date_utilities.get_utc_time_with_milliseconds();
                      {
                        SubLObject lock = dictionary_utilities.synchronized_dictionary_lock($java_api_leases$.getGlobalValue());
                        SubLObject release = NIL;
                        try {
                          release = Locks.seize_lock(lock);
                          {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dictionary_utilities.synchronized_dictionary_dictionary($java_api_leases$.getGlobalValue())));
                            while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                              thread.resetMultipleValues();
                              {
                                SubLObject uuid_string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject lease_expiration_time = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                  SubLObject error_message = NIL;
                                  SubLObject seconds_yet_to_wait = NIL;
                                  try {
                                    {
                                      SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                      try {
                                        Errors.$error_handler$.bind($sym9$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                          seconds_yet_to_wait = Numbers.divide(Numbers.subtract(lease_expiration_time, current_utc_time_with_milliseconds), $int10$1000);
                                          if (seconds_yet_to_wait.numL(ZERO_INTEGER)) {
                                            uuid_strings_to_remove = cons(uuid_string, uuid_strings_to_remove);
                                            release_resources_for_java_api_client(uuid_string, T);
                                          }
                                        } catch (Throwable catch_var) {
                                          Errors.handleThrowable(catch_var, NIL);
                                        }
                                      } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                      }
                                    }
                                  } catch (Throwable ccatch_env_var) {
                                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                  }
                                  if ((NIL != error_message)) {
                                    Errors.warn(error_message);
                                  }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                              }
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                          }
                        } finally {
                          if ((NIL != release)) {
                            Locks.release_lock(lock);
                          }
                        }
                      }
                      {
                        SubLObject cdolist_list_var = uuid_strings_to_remove;
                        SubLObject uuid_string_to_remove = NIL;
                        for (uuid_string_to_remove = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), uuid_string_to_remove = cdolist_list_var.first()) {
                          {
                            SubLObject error_message = NIL;
                            try {
                              {
                                SubLObject _prev_bind_0_2 = Errors.$error_handler$.currentBinding(thread);
                                try {
                                  Errors.$error_handler$.bind($sym9$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                  try {
                                    dictionary_utilities.synchronized_dictionary_remove($java_api_leases$.getGlobalValue(), uuid_string_to_remove);
                                  } catch (Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                  }
                                } finally {
                                  Errors.$error_handler$.rebind(_prev_bind_0_2, thread);
                                }
                              }
                            } catch (Throwable ccatch_env_var) {
                              error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            if ((NIL != error_message)) {
                              Errors.warn(error_message);
                            }
                          }
                        }
                      }
                      Threads.sleep($java_api_lease_monitor_sleep_seconds$.getGlobalValue());
                    }
                  } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                  }
                } finally {
                  Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
              }
            } catch (Throwable ccatch_env_var) {
              ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET);
            }
          }
        }
      }
    }
  }

  /** Closes the outbound api socket and kills active api requests identified by the given uuid-string.
   @param uuid-string ; stringp
   @param abnormal?   ; boolean Whether or not the release was abnormal or expected */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 5870) 
  public static final SubLObject release_resources_for_java_api_client(SubLObject uuid_string, SubLObject abnormalP) {
    if ((abnormalP == UNPROVIDED)) {
      abnormalP = NIL;
    }
    checkType(uuid_string, $sym0$STRINGP);
    if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
      task_processor.push_tpool_background_msg(PrintLow.format(NIL, $str11$Releasing_java_API_resources_iden, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
    }
    if ((NIL != abnormalP)) {
      Errors.warn($str12$__Releasing_java_API_resources_id, uuid_string);
    }
    {
      SubLObject ignore_errors_tag = NIL;
      try {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
          try {
            Dynamic.bind(Errors.$error_handler$, Symbols.symbol_function($sym8$IGNORE_ERRORS_HANDLER));
            try {
              close_java_api_socket(uuid_string);
            } catch (Throwable catch_var) {
              Errors.handleThrowable(catch_var, NIL);
            }
          } finally {
            Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
          }
        }
      } catch (Throwable ccatch_env_var) {
        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET);
      }
      {
        SubLObject ignore_errors_tag_3 = NIL;
        try {
          {
            SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
            try {
              Dynamic.bind(Errors.$error_handler$, Symbols.symbol_function($sym8$IGNORE_ERRORS_HANDLER));
              try {
                if ((NIL == abnormalP)) {
                  dictionary_utilities.synchronized_dictionary_remove($java_api_leases$.getGlobalValue(), uuid_string);
                }
              } catch (Throwable catch_var) {
                Errors.handleThrowable(catch_var, NIL);
              }
            } finally {
              Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
            }
          }
        } catch (Throwable ccatch_env_var) {
          ignore_errors_tag_3 = Errors.handleThrowable(ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET);
        }
      }
    }
    task_processor.terminate_active_task_processes(uuid_string);
    return NIL;
  }

  /** the maximum java api services lease duration in milliseconds */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 7255) 
  private static SubLSymbol $maximum_api_services_lease_duration_in_milliseconds$ = null;

  /** the multiplier factor used to calcuate actual lease expiration from the requested duration */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 7405) 
  private static SubLSymbol $lease_timeout_cushion_factor$ = null;

  /** Requests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request
   for a duration longer than one hour is denied.
   @param lease-duration-in-milliseconds ; integerp, the lease duration in milliseconds
   @param uuid-string ; stringp, identifies the java api client */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 7556) 
  public static final SubLObject acquire_api_services_lease(SubLObject lease_duration_in_milliseconds, SubLObject uuid_string) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(lease_duration_in_milliseconds, $sym19$INTEGERP);
      checkType(uuid_string, $sym0$STRINGP);
      if (lease_duration_in_milliseconds.numG($maximum_api_services_lease_duration_in_milliseconds$.getGlobalValue())) {
        dictionary_utilities.synchronized_dictionary_remove($java_api_leases$.getGlobalValue(), uuid_string);
        if ((NIL != task_processor.java_api_lease_activity_display())) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10868");
          PrintLow.format(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread), $str21$api_services_lease_denied_for__A_, uuid_string);
          streams_high.force_output(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread));
        }
        return $str22$api_services_lease_denied;
      }
      if ((NIL == $java_api_lease_monitor$.getGlobalValue())) {
        initialize_java_api_lease_monitor();
      }
      {
        SubLObject lease_expiration_time = Numbers.add(numeric_date_utilities.get_utc_time_with_milliseconds(), Numbers.multiply(lease_duration_in_milliseconds, $lease_timeout_cushion_factor$.getGlobalValue()));
        SubLObject renewal_msg = Sequences.cconcatenate($str23$api_services_lease_granted_by_, new SubLObject[] {control_vars.cyc_image_id(), $str24$_to_, uuid_string, $str25$_for_, string_utilities.to_string(lease_duration_in_milliseconds), $str26$_milliseconds});
        dictionary_utilities.synchronized_dictionary_enter($java_api_leases$.getGlobalValue(), uuid_string, lease_expiration_time);
        if ((NIL != task_processor.java_api_lease_activity_display())) {
          PrintLow.format(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread), $str27$_A__, renewal_msg);
          streams_high.force_output(cfasl_kernel.$cfasl_kernel_standard_output$.getDynamicValue(thread));
        }
        return renewal_msg;
      }
    }
  }

  /** The synchronized dictionary of persistent sockets established to provide
outbound cfasl messaging with java api clients. The key is a
UUID string (GUID) provided by the java client when the socket is 
created. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 9892) 
  private static SubLSymbol $java_api_sockets$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 10324) 
  public static final SubLObject get_current_api_socket() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return list(api_kernel.$api_in_stream$.getDynamicValue(thread), api_kernel.$api_out_stream$.getDynamicValue(thread), Locks.make_lock($str37$Java_API_stream_lock));
    }
  }

  @SubL(source = "cycl/java-api-kernel.lisp", position = 10550) 
  public static final SubLObject api_socket_in_stream(SubLObject api_socket) {
    return api_socket.first();
  }

  @SubL(source = "cycl/java-api-kernel.lisp", position = 10629) 
  public static final SubLObject api_socket_out_stream(SubLObject api_socket) {
    return conses_high.second(api_socket);
  }

  @SubL(source = "cycl/java-api-kernel.lisp", position = 10710) 
  public static final SubLObject api_socket_lock(SubLObject api_socket) {
    return conses_high.third(api_socket);
  }

  /** Associates the current socket with the given UUID-STRING, then ends this server process
that currently uses the socket. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 10784) 
  public static final SubLObject initialize_java_api_passive_socket(SubLObject uuid_string) {
    checkType(uuid_string, $sym0$STRINGP);
    {
      SubLObject api_socket = get_current_api_socket();
      if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
        task_processor.push_tpool_background_msg(PrintLow.format(NIL, $str38$Initializing_java_client_socket__, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
      }
      cleanup_broken_java_api_sockets();
      if (api_socket_out_stream(api_socket).isStream()) {
        dictionary_utilities.synchronized_dictionary_enter($java_api_sockets$.getGlobalValue(), uuid_string, api_socket);
        {
          SubLObject lock = api_socket_lock(api_socket);
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            cfasl_kernel.send_cfasl_result(api_socket_out_stream(api_socket), NIL, UNPROVIDED);
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
        if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
          task_processor.push_tpool_background_msg(PrintLow.format(NIL, $str39$Initialized_java_client_socket__S, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
        }
      } else {
        if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
          task_processor.push_tpool_background_msg(PrintLow.format(NIL, $str40$Invalid_java_client_socket__S__, api_socket), task_processor.$api_task_process_pool$.getGlobalValue());
        }
      }
      dictionary_utilities.synchronized_dictionary_enter($java_api_leases$.getGlobalValue(), uuid_string, Numbers.add(numeric_date_utilities.get_utc_time_with_milliseconds(), $maximum_api_services_lease_duration_in_milliseconds$.getGlobalValue()));
      Tcp.$retain_client_socketP$.setDynamicValue(T);
      cfasl_kernel.cfasl_quit();
      return NIL;
    }
  }

  /** Return the java api socket corresponding to the given UUID key. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 12240) 
  public static final SubLObject java_api_socket(SubLObject uuid_string) {
    checkType(uuid_string, $sym0$STRINGP);
    {
      SubLObject api_socket = NIL;
      api_socket = dictionary_utilities.synchronized_dictionary_lookup($java_api_sockets$.getGlobalValue(), uuid_string, UNPROVIDED);
      if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
        task_processor.push_tpool_background_msg(PrintLow.format(NIL, $str44$Looked_up_socket__S_from_dictiona, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
      }
      return api_socket;
    }
  }

  /** Return the java api socket output stream corresponding to the given UUID key. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 12737) 
  public static final SubLObject java_api_socket_out_stream(SubLObject uuid_string) {
    return api_socket_out_stream(java_api_socket(uuid_string));
  }

  /** Return the java api socket output stream corresponding to the given UUID key. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 12942) 
  public static final SubLObject java_api_lock(SubLObject uuid_string) {
    return api_socket_lock(java_api_socket(uuid_string));
  }

  /** Closes the persistent cfasl socket that is associated with 
the given UUID-STRING. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 13128) 
  public static final SubLObject close_java_api_socket(SubLObject uuid_string) {
    checkType(uuid_string, $sym0$STRINGP);
    if ((NIL == $java_api_sockets$.getGlobalValue())) {
      return NIL;
    }
    {
      SubLObject api_socket = java_api_socket(uuid_string);
      if ((NIL != api_socket)) {
        {
          SubLObject in_stream = api_socket_in_stream(api_socket);
          SubLObject out_stream = api_socket_out_stream(api_socket);
          SubLObject ignore_errors_tag = NIL;
          try {
            {
              SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
              try {
                Dynamic.bind(Errors.$error_handler$, Symbols.symbol_function($sym8$IGNORE_ERRORS_HANDLER));
                try {
                  try {
                    streams_high.close(in_stream, UNPROVIDED);
                  } finally {
                    {
                      SubLObject _prev_bind_0_4 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                      try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                        if ((in_stream != out_stream)) {
                          streams_high.close(out_stream, UNPROVIDED);
                        }
                      } finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0_4);
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
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET);
          }
        }
        dictionary_utilities.synchronized_dictionary_remove($java_api_sockets$.getGlobalValue(), uuid_string);
        if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
          task_processor.push_tpool_background_msg(PrintLow.format(NIL, $str45$Removed_socket__S__from_dictionar, api_socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
        }
      }
    }
    return NIL;
  }

  /** Reset this subsystem to an un-initialized state. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 14297) 
  public static final SubLObject reset_java_api_kernel() {
    task_processor.halt_api_task_processors();
    dictionary_utilities.clear_synchronized_dictionary($java_api_leases$.getGlobalValue());
    dictionary_utilities.clear_synchronized_dictionary($java_api_sockets$.getGlobalValue());
    return NIL;
  }

  /** Attempt to send an ignorable message to each java api client and
when failing, close its socket. */
  @SubL(source = "cycl/java-api-kernel.lisp", position = 14608) 
  public static final SubLObject cleanup_broken_java_api_sockets() {
    {
      SubLObject close_socketP = NIL;
      SubLObject uuid_strings = NIL;
      if ((NIL != $java_api_sockets$.getGlobalValue())) {
        uuid_strings = dictionary_utilities.synchronized_dictionary_keys($java_api_sockets$.getGlobalValue());
        {
          SubLObject cdolist_list_var = uuid_strings;
          SubLObject uuid_string = NIL;
          for (uuid_string = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), uuid_string = cdolist_list_var.first()) {
            if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
              task_processor.push_tpool_background_msg(PrintLow.format(NIL, $str53$Verifying_java_api_socket_identif, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
            }
            {
              SubLObject lock = java_api_lock(uuid_string);
              SubLObject socket = java_api_socket_out_stream(uuid_string);
              SubLObject ignore_errors_tag = NIL;
              try {
                {
                  SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
                  try {
                    Dynamic.bind(Errors.$error_handler$, Symbols.symbol_function($sym8$IGNORE_ERRORS_HANDLER));
                    try {
                      try {
                        close_socketP = T;
                        {
                          SubLObject lock_5 = lock;
                          SubLObject release = NIL;
                          try {
                            release = Locks.seize_lock(lock_5);
                            cfasl_kernel.send_cfasl_result(socket, $list54, NIL);
                          } finally {
                            if ((NIL != release)) {
                              Locks.release_lock(lock_5);
                            }
                          }
                        }
                        close_socketP = NIL;
                      } finally {
                        {
                          SubLObject _prev_bind_0_6 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                          try {
                            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                            if ((NIL != close_socketP)) {
                              if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                                task_processor.push_tpool_background_msg(PrintLow.format(NIL, $str55$closing_broken_java_api_socket__A, socket, uuid_string), task_processor.$api_task_process_pool$.getGlobalValue());
                              }
                              close_java_api_socket(uuid_string);
                            }
                          } finally {
                            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0_6);
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
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw7$IGNORE_ERRORS_TARGET);
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/java-api-kernel.lisp", position = 19483) 
  private static SubLSymbol $java_home_red_key_name$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 19544) 
  private static SubLSymbol $java_lib_red_key_name$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 19600) 
  private static SubLSymbol $java_vm_red_key_name$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 19654) 
  private static SubLSymbol $java_re_home_red_key_name$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 19718) 
  private static SubLSymbol $java_re_lib_red_key_name$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 19780) 
  private static SubLSymbol $java_re_vm_red_key_name$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 19840) 
  private static SubLSymbol $java_path_separator_red_key_name$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 21221) 
  private static SubLSymbol $java_red_subtree_name$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 21392) 
  private static SubLSymbol $java_red_root_key$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 21438) 
  private static SubLSymbol $java_default_version_numbers$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 22635) 
  private static SubLSymbol $java_red_key_main_class_key$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 22872) 
  private static SubLSymbol $java_red_key_classpath_key$ = null;

  @SubL(source = "cycl/java-api-kernel.lisp", position = 22939) 
  private static SubLSymbol $java_red_key_arguments_key$ = null;

  public static final SubLObject declare_java_api_kernel_file() {
    declareFunction(myName, "java_api_lease_expiration_time", "JAVA-API-LEASE-EXPIRATION-TIME", 1, 0, false);
    declareFunction(myName, "initialize_java_api_lease_monitor", "INITIALIZE-JAVA-API-LEASE-MONITOR", 0, 0, false);
    declareFunction(myName, "halt_java_api_lease_monitor", "HALT-JAVA-API-LEASE-MONITOR", 0, 0, false);
    declareFunction(myName, "java_api_lease_monitor", "JAVA-API-LEASE-MONITOR", 0, 0, false);
    declareFunction(myName, "release_resources_for_java_api_client", "RELEASE-RESOURCES-FOR-JAVA-API-CLIENT", 1, 1, false);
    declareFunction(myName, "acquire_api_services_lease", "ACQUIRE-API-SERVICES-LEASE", 2, 0, false);
    declareFunction(myName, "show_java_api_service_leases", "SHOW-JAVA-API-SERVICE-LEASES", 0, 0, false);
    declareFunction(myName, "get_current_api_socket", "GET-CURRENT-API-SOCKET", 0, 0, false);
    declareFunction(myName, "api_socket_in_stream", "API-SOCKET-IN-STREAM", 1, 0, false);
    declareFunction(myName, "api_socket_out_stream", "API-SOCKET-OUT-STREAM", 1, 0, false);
    declareFunction(myName, "api_socket_lock", "API-SOCKET-LOCK", 1, 0, false);
    declareFunction(myName, "initialize_java_api_passive_socket", "INITIALIZE-JAVA-API-PASSIVE-SOCKET", 1, 0, false);
    declareFunction(myName, "java_api_socket", "JAVA-API-SOCKET", 1, 0, false);
    declareFunction(myName, "java_api_socket_out_stream", "JAVA-API-SOCKET-OUT-STREAM", 1, 0, false);
    declareFunction(myName, "java_api_lock", "JAVA-API-LOCK", 1, 0, false);
    declareFunction(myName, "close_java_api_socket", "CLOSE-JAVA-API-SOCKET", 1, 0, false);
    declareFunction(myName, "show_java_api_sockets", "SHOW-JAVA-API-SOCKETS", 0, 0, false);
    declareFunction(myName, "reset_java_api_kernel", "RESET-JAVA-API-KERNEL", 0, 0, false);
    declareFunction(myName, "cleanup_broken_java_api_sockets", "CLEANUP-BROKEN-JAVA-API-SOCKETS", 0, 0, false);
    declareFunction(myName, "launch_java_application_from_red", "LAUNCH-JAVA-APPLICATION-FROM-RED", 1, 1, false);
    declareFunction(myName, "launch_java_application_from_red_in_process", "LAUNCH-JAVA-APPLICATION-FROM-RED-IN-PROCESS", 1, 1, false);
    declareFunction(myName, "get_red_value_for_default_java_virtual_machine", "GET-RED-VALUE-FOR-DEFAULT-JAVA-VIRTUAL-MACHINE", 0, 0, false);
    declareFunction(myName, "get_red_value_for_default_java_vm", "GET-RED-VALUE-FOR-DEFAULT-JAVA-VM", 0, 0, false);
    declareFunction(myName, "get_red_value_for_default_java_re_vm", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-VM", 0, 0, false);
    declareFunction(myName, "get_red_value_for_default_java_home", "GET-RED-VALUE-FOR-DEFAULT-JAVA-HOME", 0, 0, false);
    declareFunction(myName, "get_red_value_for_default_java_re_home", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-HOME", 0, 0, false);
    declareFunction(myName, "get_red_value_for_default_java_lib", "GET-RED-VALUE-FOR-DEFAULT-JAVA-LIB", 0, 0, false);
    declareFunction(myName, "get_red_value_for_default_java_re_lib", "GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-LIB", 0, 0, false);
    declareFunction(myName, "get_red_value_for_default_java_path_separator", "GET-RED-VALUE-FOR-DEFAULT-JAVA-PATH-SEPARATOR", 0, 0, false);
    declareFunction(myName, "get_red_key_for_default_java_home", "GET-RED-KEY-FOR-DEFAULT-JAVA-HOME", 0, 0, false);
    declareFunction(myName, "get_red_key_for_default_java_re_home", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-HOME", 0, 0, false);
    declareFunction(myName, "get_red_key_for_default_java_lib", "GET-RED-KEY-FOR-DEFAULT-JAVA-LIB", 0, 0, false);
    declareFunction(myName, "get_red_key_for_default_java_re_lib", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-LIB", 0, 0, false);
    declareFunction(myName, "get_red_key_for_default_java_vm", "GET-RED-KEY-FOR-DEFAULT-JAVA-VM", 0, 0, false);
    declareFunction(myName, "get_red_key_for_default_java_re_vm", "GET-RED-KEY-FOR-DEFAULT-JAVA-RE-VM", 0, 0, false);
    declareFunction(myName, "get_red_key_for_default_java_path_separator", "GET-RED-KEY-FOR-DEFAULT-JAVA-PATH-SEPARATOR", 0, 0, false);
    declareFunction(myName, "get_software_type_as_red_key_name", "GET-SOFTWARE-TYPE-AS-RED-KEY-NAME", 0, 0, false);
    declareFunction(myName, "get_java_red_root_key", "GET-JAVA-RED-ROOT-KEY", 0, 0, false);
    declareFunction(myName, "get_java_red_root_key_for_version", "GET-JAVA-RED-ROOT-KEY-FOR-VERSION", 1, 0, false);
    declareFunction(myName, "get_java_red_root_key_for_default_version", "GET-JAVA-RED-ROOT-KEY-FOR-DEFAULT-VERSION", 0, 0, false);
    declareFunction(myName, "get_java_application_information_from_red", "GET-JAVA-APPLICATION-INFORMATION-FROM-RED", 1, 0, false);
    declareFunction(myName, "get_java_classpath_from_elments", "GET-JAVA-CLASSPATH-FROM-ELMENTS", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_java_api_kernel_file() {
    $java_api_leases$ = deflexical("*JAVA-API-LEASES*", dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED));
    $java_api_lease_monitor$ = deflexical("*JAVA-API-LEASE-MONITOR*", NIL);
    $java_api_lease_monitor_sleep_seconds$ = defconstant("*JAVA-API-LEASE-MONITOR-SLEEP-SECONDS*", TWO_INTEGER);
    $maximum_api_services_lease_duration_in_milliseconds$ = defconstant("*MAXIMUM-API-SERVICES-LEASE-DURATION-IN-MILLISECONDS*", $int18$3600000);
    $lease_timeout_cushion_factor$ = defconstant("*LEASE-TIMEOUT-CUSHION-FACTOR*", THREE_INTEGER);
    $java_api_sockets$ = deflexical("*JAVA-API-SOCKETS*", dictionary_utilities.new_synchronized_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED));
    $java_home_red_key_name$ = deflexical("*JAVA-HOME-RED-KEY-NAME*", $str60$JAVA_HOME);
    $java_lib_red_key_name$ = deflexical("*JAVA-LIB-RED-KEY-NAME*", $str61$JAVA_LIB);
    $java_vm_red_key_name$ = deflexical("*JAVA-VM-RED-KEY-NAME*", $str62$JAVA_VM);
    $java_re_home_red_key_name$ = deflexical("*JAVA-RE-HOME-RED-KEY-NAME*", $str63$JAVA_RE_HOME);
    $java_re_lib_red_key_name$ = deflexical("*JAVA-RE-LIB-RED-KEY-NAME*", $str64$JAVA_RE_LIB);
    $java_re_vm_red_key_name$ = deflexical("*JAVA-RE-VM-RED-KEY-NAME*", $str65$JAVA_RE_VM);
    $java_path_separator_red_key_name$ = deflexical("*JAVA-PATH-SEPARATOR-RED-KEY-NAME*", $str66$path_separator);
    $java_red_subtree_name$ = deflexical("*JAVA-RED-SUBTREE-NAME*", $str67$java);
    $java_red_root_key$ = deflexical("*JAVA-RED-ROOT-KEY*", NIL);
    $java_default_version_numbers$ = deflexical("*JAVA-DEFAULT-VERSION-NUMBERS*", $list68);
    $java_red_key_main_class_key$ = deflexical("*JAVA-RED-KEY-MAIN-CLASS-KEY*", $str70$java_main_class);
    $java_red_key_classpath_key$ = deflexical("*JAVA-RED-KEY-CLASSPATH-KEY*", $str71$java_classpath);
    $java_red_key_arguments_key$ = deflexical("*JAVA-RED-KEY-ARGUMENTS-KEY*", $str72$java_arguments);
    return NIL;
  }

  public static final SubLObject setup_java_api_kernel_file() {
    // CVS_ID("Id: java-api-kernel.lisp 128158 2009-06-26 21:52:24Z tbrussea ");
    utilities_macros.register_cyc_api_function($sym3$INITIALIZE_JAVA_API_LEASE_MONITOR, NIL, $str4$Initialize_the_process_which_moni, NIL, NIL);
    utilities_macros.register_cyc_api_function($sym5$HALT_JAVA_API_LEASE_MONITOR, NIL, $str6$Halt_the_the_process_which_monito, NIL, NIL);
    utilities_macros.register_cyc_api_function($sym13$RELEASE_RESOURCES_FOR_JAVA_API_CLIENT, $list14, $str15$Closes_the_outbound_api_socket_an, $list16, $list17);
    utilities_macros.register_cyc_api_function($sym28$ACQUIRE_API_SERVICES_LEASE, $list29, $str30$Requests_an_API_services_lease___, $list31, $list32);
    utilities_macros.register_cyc_api_function($sym35$SHOW_JAVA_API_SERVICE_LEASES, NIL, $str36$Displays_the_current_java_api_lea, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym41$INITIALIZE_JAVA_API_PASSIVE_SOCKET, $list42, $str43$Associates_the_current_socket_wit, $list16, $list17);
    utilities_macros.register_cyc_api_function($sym46$CLOSE_JAVA_API_SOCKET, $list42, $str47$Closes_the_persistent_cfasl_socke, $list16, $list17);
    utilities_macros.register_cyc_api_function($sym49$SHOW_JAVA_API_SOCKETS, NIL, $str50$Displays_the_java_api_sockets_, NIL, $list17);
    utilities_macros.register_cyc_api_function($sym51$RESET_JAVA_API_KERNEL, NIL, $str52$Reset_this_subsystem_to_an_un_ini, NIL, NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str1$Java_API_lease_monitor = makeString("Java API lease monitor");
  public static final SubLSymbol $sym2$JAVA_API_LEASE_MONITOR = makeSymbol("JAVA-API-LEASE-MONITOR");
  public static final SubLSymbol $sym3$INITIALIZE_JAVA_API_LEASE_MONITOR = makeSymbol("INITIALIZE-JAVA-API-LEASE-MONITOR");
  public static final SubLString $str4$Initialize_the_process_which_moni = makeString("Initialize the process which monitors lease expirations for java api clients.");
  public static final SubLSymbol $sym5$HALT_JAVA_API_LEASE_MONITOR = makeSymbol("HALT-JAVA-API-LEASE-MONITOR");
  public static final SubLString $str6$Halt_the_the_process_which_monito = makeString("Halt the the process which monitors lease expirations for java api clients.");
  public static final SubLSymbol $kw7$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym8$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $sym9$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLInteger $int10$1000 = makeInteger(1000);
  public static final SubLString $str11$Releasing_java_API_resources_iden = makeString("Releasing java API resources identified by ~A~%");
  public static final SubLString $str12$__Releasing_java_API_resources_id = makeString("~%Releasing java API resources identified by ~A~%");
  public static final SubLSymbol $sym13$RELEASE_RESOURCES_FOR_JAVA_API_CLIENT = makeSymbol("RELEASE-RESOURCES-FOR-JAVA-API-CLIENT");
  public static final SubLList $list14 = list(makeSymbol("UUID-STRING"), makeSymbol("&OPTIONAL"), makeSymbol("ABNORMAL?"));
  public static final SubLString $str15$Closes_the_outbound_api_socket_an = makeString("Closes the outbound api socket and kills active api requests identified by the given uuid-string.\n   @param uuid-string ; stringp\n   @param abnormal?   ; boolean Whether or not the release was abnormal or expected");
  public static final SubLList $list16 = list(list(makeSymbol("UUID-STRING"), makeSymbol("STRINGP")));
  public static final SubLList $list17 = list(NIL);
  public static final SubLInteger $int18$3600000 = makeInteger(3600000);
  public static final SubLSymbol $sym19$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str20$_cfasl_kernel_standard_output_ = makeString("*cfasl-kernel-standard-output*");
  public static final SubLString $str21$api_services_lease_denied_for__A_ = makeString("api services lease denied for ~A~%");
  public static final SubLString $str22$api_services_lease_denied = makeString("api services lease denied");
  public static final SubLString $str23$api_services_lease_granted_by_ = makeString("api services lease granted by ");
  public static final SubLString $str24$_to_ = makeString(" to ");
  public static final SubLString $str25$_for_ = makeString(" for ");
  public static final SubLString $str26$_milliseconds = makeString(" milliseconds");
  public static final SubLString $str27$_A__ = makeString("~A~%");
  public static final SubLSymbol $sym28$ACQUIRE_API_SERVICES_LEASE = makeSymbol("ACQUIRE-API-SERVICES-LEASE");
  public static final SubLList $list29 = list(makeSymbol("LEASE-DURATION-IN-MILLISECONDS"), makeSymbol("UUID-STRING"));
  public static final SubLString $str30$Requests_an_API_services_lease___ = makeString("Requests an API services lease.  Typical leases are expected to be 10 minutes.  A lease request\n   for a duration longer than one hour is denied.\n   @param lease-duration-in-milliseconds ; integerp, the lease duration in milliseconds\n   @param uuid-string ; stringp, identifies the java api client");
  public static final SubLList $list31 = list(list(makeSymbol("LEASE-DURATION-IN-MILLISECONDS"), makeSymbol("INTEGERP")), list(makeSymbol("UUID-STRING"), makeSymbol("STRINGP")));
  public static final SubLList $list32 = list(makeSymbol("STRINGP"));
  public static final SubLString $str33$There_are_no_Java_API_client_leas = makeString("There are no Java API client leases.~%");
  public static final SubLString $str34$Java_API_client__A_lease_expires_ = makeString("Java API client ~A lease expires in ~A seconds~%");
  public static final SubLSymbol $sym35$SHOW_JAVA_API_SERVICE_LEASES = makeSymbol("SHOW-JAVA-API-SERVICE-LEASES");
  public static final SubLString $str36$Displays_the_current_java_api_lea = makeString("Displays the current java api leases.");
  public static final SubLString $str37$Java_API_stream_lock = makeString("Java API stream lock");
  public static final SubLString $str38$Initializing_java_client_socket__ = makeString("Initializing java client socket ~S~%identified by ~A~%");
  public static final SubLString $str39$Initialized_java_client_socket__S = makeString("Initialized java client socket ~S~%identified by ~A~%");
  public static final SubLString $str40$Invalid_java_client_socket__S__ = makeString("Invalid java client socket ~S~%");
  public static final SubLSymbol $sym41$INITIALIZE_JAVA_API_PASSIVE_SOCKET = makeSymbol("INITIALIZE-JAVA-API-PASSIVE-SOCKET");
  public static final SubLList $list42 = list(makeSymbol("UUID-STRING"));
  public static final SubLString $str43$Associates_the_current_socket_wit = makeString("Associates the current socket with the given UUID-STRING, then ends this server process\nthat currently uses the socket.");
  public static final SubLString $str44$Looked_up_socket__S_from_dictiona = makeString("Looked up socket ~S from dictionary~%identifed by ~A~%");
  public static final SubLString $str45$Removed_socket__S__from_dictionar = makeString("Removed socket ~S~ from dictionary%identifed by ~A~%");
  public static final SubLSymbol $sym46$CLOSE_JAVA_API_SOCKET = makeSymbol("CLOSE-JAVA-API-SOCKET");
  public static final SubLString $str47$Closes_the_persistent_cfasl_socke = makeString("Closes the persistent cfasl socket that is associated with \nthe given UUID-STRING.");
  public static final SubLString $str48$___S______S = makeString("~%~S ==> ~S");
  public static final SubLSymbol $sym49$SHOW_JAVA_API_SOCKETS = makeSymbol("SHOW-JAVA-API-SOCKETS");
  public static final SubLString $str50$Displays_the_java_api_sockets_ = makeString("Displays the java api sockets.");
  public static final SubLSymbol $sym51$RESET_JAVA_API_KERNEL = makeSymbol("RESET-JAVA-API-KERNEL");
  public static final SubLString $str52$Reset_this_subsystem_to_an_un_ini = makeString("Reset this subsystem to an un-initialized state.");
  public static final SubLString $str53$Verifying_java_api_socket_identif = makeString("Verifying java api socket identified by ~A~%");
  public static final SubLList $list54 = list(makeSymbol("IGNORE"));
  public static final SubLString $str55$closing_broken_java_api_socket__A = makeString("closing broken java api socket ~A~%identified by ~A~%");
  public static final SubLString $str56$_cp = makeString("-cp");
  public static final SubLString $str57$Java_proxy_for_ = makeString("Java proxy for ");
  public static final SubLSymbol $sym58$LAUNCH_JAVA_APPLICATION_FROM_RED = makeSymbol("LAUNCH-JAVA-APPLICATION-FROM-RED");
  public static final SubLSymbol $kw59$LEAST_PRIVILEGED = makeKeyword("LEAST-PRIVILEGED");
  public static final SubLString $str60$JAVA_HOME = makeString("JAVA_HOME");
  public static final SubLString $str61$JAVA_LIB = makeString("JAVA_LIB");
  public static final SubLString $str62$JAVA_VM = makeString("JAVA_VM");
  public static final SubLString $str63$JAVA_RE_HOME = makeString("JAVA_RE_HOME");
  public static final SubLString $str64$JAVA_RE_LIB = makeString("JAVA_RE_LIB");
  public static final SubLString $str65$JAVA_RE_VM = makeString("JAVA_RE_VM");
  public static final SubLString $str66$path_separator = makeString("path_separator");
  public static final SubLString $str67$java = makeString("java");
  public static final SubLList $list68 = list(ONE_INTEGER, FOUR_INTEGER, TWO_INTEGER);
  public static final SubLSymbol $sym69$LISTP = makeSymbol("LISTP");
  public static final SubLString $str70$java_main_class = makeString("java-main-class");
  public static final SubLString $str71$java_classpath = makeString("java-classpath");
  public static final SubLString $str72$java_arguments = makeString("java-arguments");
  public static final SubLSymbol $sym73$CCONCATENATE = makeSymbol("CCONCATENATE");

  //// Initializers

  public void declareFunctions() {
    declare_java_api_kernel_file();
  }

  public void initializeVariables() {
    init_java_api_kernel_file();
  }

  public void runTopLevelForms() {
    setup_java_api_kernel_file();
  }

}
