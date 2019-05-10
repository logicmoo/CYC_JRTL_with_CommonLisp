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
import com.cyc.cycjava_1.cycl.agenda;
import com.cyc.cycjava_1.cycl.assertion_manager;
import com.cyc.cycjava_1.cycl.builder_utilities;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.constant_index_manager;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing_initialization;
import com.cyc.cycjava_1.cycl.deduction_manager;
import com.cyc.cycjava_1.cycl.dumper;
import com.cyc.cycjava_1.cycl.file_utilities;
import com.cyc.cycjava_1.cycl.hl_storage_modules;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.java_api_kernel;
import com.cyc.cycjava_1.cycl.kb_hl_support_manager;
import com.cyc.cycjava_1.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.nart_hl_formula_manager;
import com.cyc.cycjava_1.cycl.nart_index_manager;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.operation_communication;
import com.cyc.cycjava_1.cycl.os_process_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_declarations;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.system_info;
import com.cyc.cycjava_1.cycl.system_parameters;
import com.cyc.cycjava_1.cycl.tcp_server_utilities;
import com.cyc.cycjava_1.cycl.transcript_utilities;
import com.cyc.cycjava_1.cycl.tva_cache;
import com.cyc.cycjava_1.cycl.unrepresented_term_index_manager;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class misc_utilities extends SubLTranslatedFile {

  //// Constructor

  private misc_utilities() {}
  public static final SubLFile me = new misc_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.misc_utilities";

  //// Definitions

  @SubL(source = "cycl/misc-utilities.lisp", position = 944) 
  private static SubLSymbol $kb_content_copyright_notice$ = null;

  @SubL(source = "cycl/misc-utilities.lisp", position = 2165) 
  private static SubLSymbol $system_code_initializations_marker$ = null;

  /** Initializations which should be run every time the system code is initialized. */
  @SubL(source = "cycl/misc-utilities.lisp", position = 2363) 
  public static final SubLObject system_code_initializations(SubLObject perform_app_specific_initializationsP) {
    if ((perform_app_specific_initializationsP == UNPROVIDED)) {
      perform_app_specific_initializationsP = T;
    }
    builder_utilities.initialize_cyc_product();
    system_code_image_initializations();
    system_code_hl_initializations();
    system_code_inference_initializations();
    system_code_api_initializations();
    if ((NIL != perform_app_specific_initializationsP)) {
      system_code_application_initializations();
    }
    if ((NIL != subl_promotions.positive_integer_p(control_vars.kb_loaded()))) {
      system_kb_initializations();
    } //else {
      //Errors.warn($str3$No_KB_is_loaded___System_KB_initi);
    //}
    $system_code_initializations_marker$.setGlobalValue(Environment.get_process_id(UNPROVIDED));
    return T;
  }

  /** System code initializations that have to do with distinguishing
   the current image from the image that saved out the world being used. */
  @SubL(source = "cycl/misc-utilities.lisp", position = 3724) 
  public static final SubLObject system_code_image_initializations() {
    random.seed_random(UNPROVIDED);
    system_info.reset_cycl_start_time(UNPROVIDED);
    control_vars.set_cyc_image_id();
    clear_machine_bogomips();
    tcp_server_utilities.validate_all_tcp_servers();
    os_process_utilities.clear_active_os_processes();
    return T;
  }

  /** System code initializations that have to do with HL level reasoning. */
  @SubL(source = "cycl/misc-utilities.lisp", position = 4753) 
  public static final SubLObject system_code_hl_initializations() {
    hlmt.disable_hlmts();
    sbhl_module_declarations.initialize_sbhl_modules(UNPROVIDED);
    return T;
  }

  /** System code initializations that have to do with inference. */
  @SubL(source = "cycl/misc-utilities.lisp", position = 5151) 
  public static final SubLObject system_code_inference_initializations() {
    inference_modules.reclassify_removal_modules();
    hl_storage_modules.reclassify_hl_storage_modules();
    inference_datastructures_problem_store.destroy_all_problem_stores();
    inference_datastructures_inference.initialize_pad_table($str5$hack_);
    return T;
  }

  /** System code initializations that have to do with the Cyc API. */
  @SubL(source = "cycl/misc-utilities.lisp", position = 5489) 
  public static final SubLObject system_code_api_initializations() {
    java_api_kernel.reset_java_api_kernel();
    return T;
  }

  /** System code initializations for application code built into Cyc.
   To be called only by system-code-initializations. */
  @SubL(source = "cycl/misc-utilities.lisp", position = 5979) 
  public static final SubLObject system_code_application_initializations() {
    inference_analysis.clear_asked_query_queue();
    return T;
  }

  /** Initializations which should be run every time the system is initialized, if there is a KB present. */
  @SubL(source = "cycl/misc-utilities.lisp", position = 6791) 
  public static final SubLObject system_kb_initializations() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      initialize_hl_store_caches();
      operation_communication.set_the_cyclist(system_parameters.$default_cyclist_name$.getDynamicValue(thread));
      transcript_utilities.initialize_transcript_handling();
      agenda.initialize_agenda();
      utilities_macros.initialize_global_locks();
      cyc_testing_initialization.perform_cyc_testing_initializations();
      kct_utils.initialize_kct();
      Threads.make_process($str6$file_backed_cache_initializer, $sym7$INITIALIZE_ALL_FILE_BACKED_CACHES);
      Threads.sleep($float8$0_5);
      return T;
    }
  }

  /** @hack currently, dump directory from which this KB was built; soon a published KB product subdirectory. */
  @SubL(source = "cycl/misc-utilities.lisp", position = 8736) 
  private static SubLSymbol $hl_store_caches_directory$ = null;

  /** The symbols all KB products share. */
  @SubL(source = "cycl/misc-utilities.lisp", position = 8902) 
  private static SubLSymbol $hl_store_caches_shared_symbols$ = null;

  @SubL(source = "cycl/misc-utilities.lisp", position = 9069) 
  public static final SubLObject get_hl_store_caches_shared_symbols() {
    return $hl_store_caches_shared_symbols$.getGlobalValue();
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 9168) 
  public static final SubLObject initialize_hl_store_caches() {
    if ((NIL == hl_store_content_completely_cachedP())) {
      return initialize_hl_store_caches_from_directory(hl_store_caches_directory(), UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 9350) 
  public static final SubLObject initialize_hl_store_caches_from_directory(SubLObject direname, SubLObject symbols) {
    if ((symbols == UNPROVIDED)) {
      symbols = NIL;
    }
    if ((NIL != initialize_hl_store_cache_directory_and_shared_symbols(direname, symbols))) {
      deduction_manager.initialize_deduction_hl_store_cache();
      assertion_manager.initialize_assertion_hl_store_cache();
      constant_index_manager.initialize_constant_index_hl_store_cache();
      nart_index_manager.initialize_nart_index_hl_store_cache();
      nart_hl_formula_manager.initialize_nart_hl_formula_hl_store_cache();
      unrepresented_term_index_manager.initialize_unrepresented_term_index_hl_store_cache();
      kb_hl_support_manager.initialize_kb_hl_support_hl_store_cache();
      sbhl_graphs.initialize_sbhl_graph_caches();
      tva_cache.reconnect_tva_cache_registry(direname, get_hl_store_caches_shared_symbols());
    } else {
      Errors.warn($str11$Cannot_initialize_HL_KB_object_ca);
    }
    return T;
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 10095) 
  public static final SubLObject initialize_hl_store_cache_directory_and_shared_symbols(SubLObject direname, SubLObject symbols) {
    if ((symbols == UNPROVIDED)) {
      symbols = NIL;
    }
    if ((NIL != Filesys.directory_p(direname))) {
      set_hl_store_caches_directory(direname);
    } else {
      Errors.warn($str12$Do_not_have_a_valid_location_for_, direname);
    }
    if ((NIL != Filesys.directory_p(hl_store_caches_directory()))) {
      initialize_hl_store_cache_shared_symbols(symbols);
      return T;
    } else {
      Errors.warn($str13$Could_not_initialize_HL_store_cac, direname);
    }
    return NIL;
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 10644) 
  public static final SubLObject initialize_hl_store_cache_shared_symbols(SubLObject symbols) {
    //PrintLow.format(T, $str14$Initializing_HL_backing_store_cac, hl_store_caches_directory());
    if ((NIL == symbols)) {
      {
        SubLObject error = NIL;
        try {
          {
            SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
            try {
              Dynamic.bind(Errors.$error_handler$, $sym15$CATCH_ERROR_MESSAGE_HANDLER);
              try {
                symbols = dumper.load_kb_product_shared_symbols(hl_store_caches_directory());
              } catch (Throwable catch_var) {
                Errors.handleThrowable(catch_var, NIL);
              }
            } finally {
              Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
            }
          }
        } catch (Throwable ccatch_env_var) {
          error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        if (error.isString()) {
          Errors.warn($str16$Could_not_initialize_shared_symbo, hl_store_caches_directory());
        }
      }
    }
    if ((NIL != symbols)) {
      $hl_store_caches_shared_symbols$.setGlobalValue(symbols);
      return $hl_store_caches_shared_symbols$.getGlobalValue();
    }
    return NIL;
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 11210) 
  public static final SubLObject hl_store_content_completely_cachedP() {
    return makeBoolean(((NIL != deduction_manager.deduction_content_completely_cachedP())
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32188"))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32199"))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32148"))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32198"))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2251"))));
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 11558) 
  public static final SubLObject get_hl_store_cache_filename(SubLObject filename, SubLObject extension) {
    return Sequences.cconcatenate($hl_store_caches_directory$.getGlobalValue(), new SubLObject[] {filename, $str17$_, extension});
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 11712) 
  public static final SubLObject set_hl_store_caches_directory(SubLObject directory) {
    if ((NIL != file_utilities.absolute_pathP(directory))) {
      Errors.warn($str18$HL_Store_directory_being_set_to_a, directory);
    }
    $hl_store_caches_directory$.setGlobalValue(directory);
    return NIL;
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 12355) 
  public static final SubLObject hl_store_caches_directory() {
    if ($hl_store_caches_directory$.getGlobalValue().isString()) {
      return $hl_store_caches_directory$.getGlobalValue();
    }
    if ((NIL == dumper.force_monolithic_kb_assumptionP())) {
      set_hl_store_caches_directory(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30777"));
    }
    return $hl_store_caches_directory$.getGlobalValue();
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 21377) 
  public static final SubLObject other_binary_arg(SubLObject arg) {
    {
      SubLObject pcase_var = arg;
      if (pcase_var.eql(ONE_INTEGER)) {
        return TWO_INTEGER;
      } else if (pcase_var.eql(TWO_INTEGER)) {
        return ONE_INTEGER;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 22468) 
  private static SubLSymbol $hostname_caching_state$ = null;

  @SubL(source = "cycl/misc-utilities.lisp", position = 23113) 
  private static SubLSymbol $machine_bogomips$ = null;

  /** Return the processor speed of this machine in bogomips,
   or NIL if this can't be determined. */
  @SubL(source = "cycl/misc-utilities.lisp", position = 23231) 
  public static final SubLObject machine_bogomips() {
    if (($kw47$UNINITIALIZED == $machine_bogomips$.getGlobalValue())) {
      $machine_bogomips$.setGlobalValue(compute_machine_bogomips());
    }
    return $machine_bogomips$.getGlobalValue();
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 23501) 
  public static final SubLObject clear_machine_bogomips() {
    $machine_bogomips$.setGlobalValue($kw47$UNINITIALIZED);
    return $machine_bogomips$.getGlobalValue();
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 23616) 
  public static final SubLObject compute_machine_bogomips() {
    {
      SubLObject result = NIL;
      SubLObject ignore_errors_tag = NIL;
      try {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
          try {
            Dynamic.bind(Errors.$error_handler$, Symbols.symbol_function($sym49$IGNORE_ERRORS_HANDLER));
            try {
              {
                SubLObject stream = NIL;
                try {
                  stream = compatibility.open_text($str50$_proc_cpuinfo, $kw51$INPUT);
                  if ((!(stream.isStream()))) {
                    Errors.error($str52$Unable_to_open__S, $str50$_proc_cpuinfo);
                  }
                  {
                    SubLObject s = stream;
                    if ((NIL != s)) {
                      while ((NIL == result)) {
                        {
                          SubLObject line = streams_high.read_line(s, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          if ((NIL != Sequences.search($str53$bogomips, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                            result = reader.read_from_string(string_utilities.substring(line, number_utilities.f_1X(Sequences.search($str54$_, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          }
                        }
                      }
                    }
                  }
                } finally {
                  {
                    SubLObject _prev_bind_0_1 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                      Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                      if (stream.isStream()) {
                        streams_high.close(stream, UNPROVIDED);
                      }
                    } finally {
                      Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0_1);
                    }
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
        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw48$IGNORE_ERRORS_TARGET);
      }
      return result;
    }
  }

  /** Multiplies each number in NUMBERS by BOGOMIPS/(machine-bogomips).
   If this machine is faster than BOGOMIPS, NUMBERS will get smaller.
   If this machine is slower than BOGOMIPS, NUMBERS will get bigger.
   If (machine-bogomips) is unknown, returns NUMBERS unscaled. */
  @SubL(source = "cycl/misc-utilities.lisp", position = 24031) 
  public static final SubLObject scale_by_bogomips(SubLObject numbers, SubLObject bogomips) {
    {
      SubLObject local_bogomips = machine_bogomips();
      if (((!(local_bogomips.isNumber()))
          || local_bogomips.numE(bogomips))) {
        return numbers;
      } else {
        {
          SubLObject scaling_factor = Numbers.divide(bogomips, local_bogomips);
          SubLObject scaled_numbers = NIL;
          SubLObject cdolist_list_var = numbers;
          SubLObject number = NIL;
          for (number = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), number = cdolist_list_var.first()) {
            scaled_numbers = cons(Numbers.multiply(number, scaling_factor), scaled_numbers);
          }
          return Sequences.nreverse(scaled_numbers);
        }
      }
    }
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 24696) 
  public static final SubLObject uninitialized() {
    return $kw47$UNINITIALIZED;
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 24818) 
  public static final SubLObject uninitialized_p(SubLObject object) {
    return Equality.eq(object, uninitialized());
  }

  @SubL(source = "cycl/misc-utilities.lisp", position = 24896) 
  public static final SubLObject initialized_p(SubLObject object) {
    return makeBoolean((NIL == uninitialized_p(object)));
  }

  public static final SubLObject declare_misc_utilities_file() {
    declareFunction(myName, "copyright_notice", "COPYRIGHT-NOTICE", 0, 0, false);
    declareFunction(myName, "kb_content_copyright_notice", "KB-CONTENT-COPYRIGHT-NOTICE", 0, 0, false);
    declareFunction(myName, "write_kb_content_copyright_notice", "WRITE-KB-CONTENT-COPYRIGHT-NOTICE", 1, 0, false);
    declareFunction(myName, "system_code_initializations", "SYSTEM-CODE-INITIALIZATIONS", 0, 1, false);
    declareFunction(myName, "system_code_initializations_run_p", "SYSTEM-CODE-INITIALIZATIONS-RUN-P", 0, 0, false);
    declareFunction(myName, "redo_system_code_initializations", "REDO-SYSTEM-CODE-INITIALIZATIONS", 0, 0, false);
    declareFunction(myName, "system_code_image_initializations", "SYSTEM-CODE-IMAGE-INITIALIZATIONS", 0, 0, false);
    declareFunction(myName, "system_code_hl_initializations", "SYSTEM-CODE-HL-INITIALIZATIONS", 0, 0, false);
    declareFunction(myName, "system_code_inference_initializations", "SYSTEM-CODE-INFERENCE-INITIALIZATIONS", 0, 0, false);
    declareFunction(myName, "system_code_api_initializations", "SYSTEM-CODE-API-INITIALIZATIONS", 0, 0, false);
    declareFunction(myName, "system_code_application_initializations", "SYSTEM-CODE-APPLICATION-INITIALIZATIONS", 0, 0, false);
    declareFunction(myName, "system_kb_initializations", "SYSTEM-KB-INITIALIZATIONS", 0, 0, false);
    declareFunction(myName, "initialize_file_backed_nl_datastructures", "INITIALIZE-FILE-BACKED-NL-DATASTRUCTURES", 0, 0, false);
    declareFunction(myName, "get_hl_store_caches_shared_symbols", "GET-HL-STORE-CACHES-SHARED-SYMBOLS", 0, 0, false);
    declareFunction(myName, "initialize_hl_store_caches", "INITIALIZE-HL-STORE-CACHES", 0, 0, false);
    declareFunction(myName, "initialize_hl_store_caches_from_directory", "INITIALIZE-HL-STORE-CACHES-FROM-DIRECTORY", 1, 1, false);
    declareFunction(myName, "initialize_hl_store_cache_directory_and_shared_symbols", "INITIALIZE-HL-STORE-CACHE-DIRECTORY-AND-SHARED-SYMBOLS", 1, 1, false);
    declareFunction(myName, "initialize_hl_store_cache_shared_symbols", "INITIALIZE-HL-STORE-CACHE-SHARED-SYMBOLS", 1, 0, false);
    declareFunction(myName, "hl_store_content_completely_cachedP", "HL-STORE-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
    declareFunction(myName, "get_hl_store_cache_filename", "GET-HL-STORE-CACHE-FILENAME", 2, 0, false);
    declareFunction(myName, "set_hl_store_caches_directory", "SET-HL-STORE-CACHES-DIRECTORY", 1, 0, false);
    declareFunction(myName, "generic_caches_directory", "GENERIC-CACHES-DIRECTORY", 0, 0, false);
    declareFunction(myName, "hl_store_caches_directory", "HL-STORE-CACHES-DIRECTORY", 0, 0, false);
    declareFunction(myName, "compute_hl_store_caches_directory", "COMPUTE-HL-STORE-CACHES-DIRECTORY", 0, 0, false);
    declareFunction(myName, "cdr_eqlP", "CDR-EQL?", 2, 0, false);
    declareFunction(myName, "not_member_equal", "NOT-MEMBER-EQUAL", 2, 0, false);
    declareFunction(myName, "get_indexed_obj", "GET-INDEXED-OBJ", 2, 1, false);
    declareFunction(myName, "update_vector_indexed_val", "UPDATE-VECTOR-INDEXED-VAL", 5, 4, false);
    declareFunction(myName, "get_vector_indexed_val", "GET-VECTOR-INDEXED-VAL", 4, 2, false);
    declareFunction(myName, "clear_indexed_vectors", "CLEAR-INDEXED-VECTORS", 1, 0, false);
    declareFunction(myName, "make_indexed_vector", "MAKE-INDEXED-VECTOR", 1, 1, false);
    declareFunction(myName, "vector_cells_filled", "VECTOR-CELLS-FILLED", 1, 0, false);
    declareFunction(myName, "extract_until", "EXTRACT-UNTIL", 2, 1, false);
    declareFunction(myName, "extract_until_any", "EXTRACT-UNTIL-ANY", 2, 1, false);
    declareFunction(myName, "number_list", "NUMBER-LIST", 1, 0, false);
    declareFunction(myName, "aconsnew", "ACONSNEW", 3, 2, false);
    declareFunction(myName, "print_n_per_line", "PRINT-N-PER-LINE", 2, 1, false);
    declareFunction(myName, "other_binary_arg", "OTHER-BINARY-ARG", 1, 0, false);
    declareFunction(myName, "number_of_non_null_args", "NUMBER-OF-NON-NULL-ARGS", 0, 5, false);
    declareFunction(myName, "boolean_to_keyword", "BOOLEAN-TO-KEYWORD", 1, 0, false);
    declareFunction(myName, "keyword_to_boolean", "KEYWORD-TO-BOOLEAN", 1, 0, false);
    declareFunction(myName, "get_unqualified_machine_name", "GET-UNQUALIFIED-MACHINE-NAME", 0, 0, false);
    declareFunction(myName, "clear_hostname", "CLEAR-HOSTNAME", 0, 0, false);
    declareFunction(myName, "remove_hostname", "REMOVE-HOSTNAME", 0, 0, false);
    declareFunction(myName, "hostname_internal", "HOSTNAME-INTERNAL", 0, 0, false);
    declareFunction(myName, "hostname", "HOSTNAME", 0, 0, false);
    declareFunction(myName, "machine_name", "MACHINE-NAME", 0, 0, false);
    declareFunction(myName, "function_spec_function", "FUNCTION-SPEC-FUNCTION", 1, 0, false);
    declareFunction(myName, "machine_bogomips", "MACHINE-BOGOMIPS", 0, 0, false);
    declareFunction(myName, "clear_machine_bogomips", "CLEAR-MACHINE-BOGOMIPS", 0, 0, false);
    declareFunction(myName, "compute_machine_bogomips", "COMPUTE-MACHINE-BOGOMIPS", 0, 0, false);
    declareFunction(myName, "scale_by_bogomips", "SCALE-BY-BOGOMIPS", 2, 0, false);
    declareFunction(myName, "uninitialized", "UNINITIALIZED", 0, 0, false);
    declareFunction(myName, "uninitialized_p", "UNINITIALIZED-P", 1, 0, false);
    declareFunction(myName, "initialized_p", "INITIALIZED-P", 1, 0, false);
    declareMacro(myName, "warn_unless", "WARN-UNLESS");
    declareMacro(myName, "would_be_nice_if", "WOULD-BE-NICE-IF");
    declareFunction(myName, "force_room", "FORCE-ROOM", 0, 1, false);
    declareFunction(myName, "subl_variable_binding_list_p", "SUBL-VARIABLE-BINDING-LIST-P", 1, 0, false);
    declareFunction(myName, "subl_variable_binding_p", "SUBL-VARIABLE-BINDING-P", 1, 0, false);
    declareFunction(myName, "subl_variable_binding_list_variables", "SUBL-VARIABLE-BINDING-LIST-VARIABLES", 1, 0, false);
    declareFunction(myName, "subl_variable_binding_list_values", "SUBL-VARIABLE-BINDING-LIST-VALUES", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_misc_utilities_file() {
    $kb_content_copyright_notice$ = defconstant("*KB-CONTENT-COPYRIGHT-NOTICE*", $str1$___Copyright__c__1998___2009_Cyco);
    $system_code_initializations_marker$ = deflexical("*SYSTEM-CODE-INITIALIZATIONS-MARKER*", ((NIL != Symbols.boundp($sym2$_SYSTEM_CODE_INITIALIZATIONS_MARKER_)) ? ((SubLObject) $system_code_initializations_marker$.getGlobalValue()) : Environment.get_process_id(UNPROVIDED)));
    $hl_store_caches_directory$ = deflexical("*HL-STORE-CACHES-DIRECTORY*", ((NIL != Symbols.boundp($sym9$_HL_STORE_CACHES_DIRECTORY_)) ? ((SubLObject) $hl_store_caches_directory$.getGlobalValue()) : NIL));
    $hl_store_caches_shared_symbols$ = deflexical("*HL-STORE-CACHES-SHARED-SYMBOLS*", ((NIL != Symbols.boundp($sym10$_HL_STORE_CACHES_SHARED_SYMBOLS_)) ? ((SubLObject) $hl_store_caches_shared_symbols$.getGlobalValue()) : NIL));
    $hostname_caching_state$ = deflexical("*HOSTNAME-CACHING-STATE*", NIL);
    $machine_bogomips$ = deflexical("*MACHINE-BOGOMIPS*", $kw47$UNINITIALIZED);
    return NIL;
  }

  public static final SubLObject setup_misc_utilities_file() {
    // CVS_ID("Id: misc-utilities.lisp 128079 2009-06-22 13:40:40Z pace ");
    subl_macro_promotions.declare_defglobal($sym2$_SYSTEM_CODE_INITIALIZATIONS_MARKER_);
    access_macros.register_external_symbol($sym4$SYSTEM_CODE_INITIALIZATIONS_RUN_P);
    subl_macro_promotions.declare_defglobal($sym9$_HL_STORE_CACHES_DIRECTORY_);
    subl_macro_promotions.declare_defglobal($sym10$_HL_STORE_CACHES_SHARED_SYMBOLS_);
    memoization_state.note_globally_cached_function($sym42$HOSTNAME);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$Copyright__c__1995___2009_Cycorp_ = makeString("Copyright (c) 1995 - 2009 Cycorp.  All rights reserved.");
  public static final SubLString $str1$___Copyright__c__1998___2009_Cyco = makeString(";; Copyright (c) 1998 - 2009 Cycorp, Inc., All Rights Reserved.\n;; This file and its contents are products of Cycorp, Inc.  They are\n;; released only under specific license agreement with Cycorp, and\n;; must be treated as Cycorp Confidential Information, as per that\n;; license agreement, including translations into another language\n;; (including but not limited to Conceptual Graphs, KIF, Ontolingua,\n;; GFP, LOOM, PowerLOOM, CycL, C, C++, IDL, predicate logic, and\n;; English) and any logically equivalent rearrangement or renaming of\n;; assertion components, terms, or variables.  This paragraph shall\n;; not be altered or removed. This file is provided \"AS IS\", without\n;; any warranty; the cumulative liability of Cycorp for all claims\n;; relating to this file shall not exceed the amount of one dollar.\n;; Cycorp, 7718 Wood Hollow Drive, Suite 250, Austin, TX 78731, USA; \n;; Website: www.cyc.com, Tel: (512) 342-4000.");
  public static final SubLSymbol $sym2$_SYSTEM_CODE_INITIALIZATIONS_MARKER_ = makeSymbol("*SYSTEM-CODE-INITIALIZATIONS-MARKER*");
  public static final SubLString $str3$No_KB_is_loaded___System_KB_initi = makeString("No KB is loaded.  System KB initializations will not be run.");
  public static final SubLSymbol $sym4$SYSTEM_CODE_INITIALIZATIONS_RUN_P = makeSymbol("SYSTEM-CODE-INITIALIZATIONS-RUN-P");
  public static final SubLString $str5$hack_ = makeString("hack!");
  public static final SubLString $str6$file_backed_cache_initializer = makeString("file-backed cache initializer");
  public static final SubLSymbol $sym7$INITIALIZE_ALL_FILE_BACKED_CACHES = makeSymbol("INITIALIZE-ALL-FILE-BACKED-CACHES");
  public static final SubLFloat $float8$0_5 = makeDouble(0.5);
  public static final SubLSymbol $sym9$_HL_STORE_CACHES_DIRECTORY_ = makeSymbol("*HL-STORE-CACHES-DIRECTORY*");
  public static final SubLSymbol $sym10$_HL_STORE_CACHES_SHARED_SYMBOLS_ = makeSymbol("*HL-STORE-CACHES-SHARED-SYMBOLS*");
  public static final SubLString $str11$Cannot_initialize_HL_KB_object_ca = makeString("Cannot initialize HL KB object caches.");
  public static final SubLString $str12$Do_not_have_a_valid_location_for_ = makeString("Do not have a valid location for the HL store caches; ~A is not accessible");
  public static final SubLString $str13$Could_not_initialize_HL_store_cac = makeString("Could not initialize HL store caches from ~A.");
  public static final SubLString $str14$Initializing_HL_backing_store_cac = makeString("Initializing HL backing store caches from ~A.~%");
  public static final SubLSymbol $sym15$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str16$Could_not_initialize_shared_symbo = makeString("Could not initialize shared symbols from ~A.");
  public static final SubLString $str17$_ = makeString(".");
  public static final SubLString $str18$HL_Store_directory_being_set_to_a = makeString("HL Store directory being set to absolute directory ~A.  Saved worlds will depend on this directory and may have problems running on other machines.");
  public static final SubLString $str19$The_caches_directory_will_be_wron = makeString("The caches directory will be wrong under monolithic KB assumptions.");
  public static final SubLString $str20$units__4__0d_ = makeString("units/~4,'0d/");
  public static final SubLString $str21$Guessing_HL_Store_location_of__A = makeString("Guessing HL Store location of ~A");
  public static final SubLSymbol $kw22$CONS = makeKeyword("CONS");
  public static final SubLList $list23 = list(new SubLObject[] {makeKeyword("CONS"), makeKeyword("ADJOIN"), makeKeyword("APPEND"), makeKeyword("UNION"), makeKeyword("CDR"), makeKeyword("CAR"), makeKeyword("RPLACA"), makeKeyword("REMOVE"), makeKeyword("RPLACD"), makeKeyword("REVERSE"), makeKeyword("INC"), makeKeyword("DEC")});
  public static final SubLSymbol $kw24$ADJOIN = makeKeyword("ADJOIN");
  public static final SubLSymbol $kw25$APPEND = makeKeyword("APPEND");
  public static final SubLSymbol $kw26$UNION = makeKeyword("UNION");
  public static final SubLSymbol $kw27$CDR = makeKeyword("CDR");
  public static final SubLSymbol $kw28$CAR = makeKeyword("CAR");
  public static final SubLSymbol $kw29$REMOVE = makeKeyword("REMOVE");
  public static final SubLSymbol $kw30$RPLACA = makeKeyword("RPLACA");
  public static final SubLSymbol $kw31$RPLACD = makeKeyword("RPLACD");
  public static final SubLSymbol $kw32$REVERSE = makeKeyword("REVERSE");
  public static final SubLSymbol $kw33$INC = makeKeyword("INC");
  public static final SubLSymbol $kw34$DEC = makeKeyword("DEC");
  public static final SubLList $list35 = list(makeKeyword("REPLACE"));
  public static final SubLSymbol $sym36$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym37$PROPER_LIST_P = makeSymbol("PROPER-LIST-P");
  public static final SubLSymbol $sym38$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $kw39$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw40$FALSE = makeKeyword("FALSE");
  public static final SubLList $list41 = list(Characters.CHAR_period);
  public static final SubLSymbol $sym42$HOSTNAME = makeSymbol("HOSTNAME");
  public static final SubLSymbol $sym43$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym44$_HOSTNAME_CACHING_STATE_ = makeSymbol("*HOSTNAME-CACHING-STATE*");
  public static final SubLSymbol $kw45$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLString $str46$Could_not_get_hostname_ = makeString("Could not get hostname.");
  public static final SubLSymbol $kw47$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $kw48$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym49$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLString $str50$_proc_cpuinfo = makeString("/proc/cpuinfo");
  public static final SubLSymbol $kw51$INPUT = makeKeyword("INPUT");
  public static final SubLString $str52$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str53$bogomips = makeString("bogomips");
  public static final SubLString $str54$_ = makeString(":");
  public static final SubLList $list55 = list(makeSymbol("FORM"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));
  public static final SubLSymbol $sym56$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym57$WARN = makeSymbol("WARN");
  public static final SubLSymbol $sym58$WARN_UNLESS = makeSymbol("WARN-UNLESS");
  public static final SubLSymbol $kw59$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $sym60$SUBL_VARIABLE_BINDING_P = makeSymbol("SUBL-VARIABLE-BINDING-P");
  public static final SubLSymbol $sym61$SUBL_VARIABLE_BINDING_LIST_P = makeSymbol("SUBL-VARIABLE-BINDING-LIST-P");
  public static final SubLSymbol $sym62$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym63$SECOND = makeSymbol("SECOND");

  //// Initializers

  public void declareFunctions() {
    declare_misc_utilities_file();
  }

  public void initializeVariables() {
    init_misc_utilities_file();
  }

  public void runTopLevelForms() {
    setup_misc_utilities_file();
  }

}
