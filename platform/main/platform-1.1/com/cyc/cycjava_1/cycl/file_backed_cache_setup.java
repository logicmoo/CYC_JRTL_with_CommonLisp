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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.file_backed_cache;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class file_backed_cache_setup extends SubLTranslatedFile {

  //// Constructor

  private file_backed_cache_setup() {}
  public static final SubLFile me = new file_backed_cache_setup();
  public static final String myName = "com.cyc.cycjava_1.cycl.file_backed_cache_setup";

  //// Definitions

  /** List of registered file backed caches as file-backed-cache-registration-p's. */
  @SubL(source = "cycl/file-backed-cache-setup.lisp", position = 1260) 
  private static SubLSymbol $registered_file_backed_caches$ = null;

  /** The directoy for tempory files. */
  @SubL(source = "cycl/file-backed-cache-setup.lisp", position = 1431) 
  public static SubLSymbol $file_backed_cache_default_temp_dir$ = null;

  /** Lock used to ensure registrations are done atomically. */
  @SubL(source = "cycl/file-backed-cache-setup.lisp", position = 1534) 
  private static SubLSymbol $fbc_registration_lock$ = null;

  public static final class $file_backed_cache_registration_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $generation_function; }
    public SubLObject getField3() { return $initialization_function; }
    public SubLObject getField4() { return $reset_function; }
    public SubLObject getField5() { return $default_fht_name_function; }
    public SubLObject getField6() { return $test_suite_name; }
    public SubLObject getField7() { return $module_name; }
    public SubLObject getField8() { return $system_name; }
    public SubLObject setField2(SubLObject value) { return $generation_function = value; }
    public SubLObject setField3(SubLObject value) { return $initialization_function = value; }
    public SubLObject setField4(SubLObject value) { return $reset_function = value; }
    public SubLObject setField5(SubLObject value) { return $default_fht_name_function = value; }
    public SubLObject setField6(SubLObject value) { return $test_suite_name = value; }
    public SubLObject setField7(SubLObject value) { return $module_name = value; }
    public SubLObject setField8(SubLObject value) { return $system_name = value; }
    public SubLObject $generation_function = NIL;
    public SubLObject $initialization_function = NIL;
    public SubLObject $reset_function = NIL;
    public SubLObject $default_fht_name_function = NIL;
    public SubLObject $test_suite_name = NIL;
    public SubLObject $module_name = NIL;
    public SubLObject $system_name = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($file_backed_cache_registration_native.class, $sym3$FILE_BACKED_CACHE_REGISTRATION, $sym4$FILE_BACKED_CACHE_REGISTRATION_P, $list5, $list6, new String[] {"$generation_function", "$initialization_function", "$reset_function", "$default_fht_name_function", "$test_suite_name", "$module_name", "$system_name"}, $list7, $list8, $sym9$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022) 
  public static SubLSymbol $dtp_file_backed_cache_registration$ = null;

  @SubL(source = "cycl/file-backed-cache-setup.lisp", position = 2022) 
  public static final SubLObject file_backed_cache_registration_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $file_backed_cache_registration_p$UnaryFunction extends UnaryFunction {
    public $file_backed_cache_registration_p$UnaryFunction() { super(extractFunctionNamed("FILE-BACKED-CACHE-REGISTRATION-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10739"); }
  }

  /**  */
  @SubL(source = "cycl/file-backed-cache-setup.lisp", position = 9147) 
  public static final SubLObject initialize_all_file_backed_caches() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == control_vars.kb_loaded())) {
        return NIL;
      }
      if ((NIL != $registered_file_backed_caches$.getGlobalValue())) {
        PrintLow.format(T, $str50$__Initializing_file_backed_caches);
        streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
      }
      {
        SubLObject cdolist_list_var = $registered_file_backed_caches$.getGlobalValue();
        SubLObject v_cache = NIL;
        for (v_cache = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_cache = cdolist_list_var.first()) {
          {
            SubLObject message_var = NIL;
            try {
              {
                SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                  Errors.$error_handler$.bind($sym41$CATCH_ERROR_MESSAGE_HANDLER, thread);
                  try {
                    Functions.funcall(Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10736"));
                  } catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                  }
                } finally {
                  Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
              }
            } catch (Throwable ccatch_env_var) {
              message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (message_var.isString()) {
              Errors.warn($str51$_A, message_var);
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final SubLObject declare_file_backed_cache_setup_file() {
    declareFunction(myName, "file_backed_cache_registration_print_function_trampoline", "FILE-BACKED-CACHE-REGISTRATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "file_backed_cache_registration_p", "FILE-BACKED-CACHE-REGISTRATION-P", 1, 0, false); new $file_backed_cache_registration_p$UnaryFunction();
    //declareFunction(myName, "fbcr_generation_function", "FBCR-GENERATION-FUNCTION", 1, 0, false);
    //declareFunction(myName, "fbcr_initialization_function", "FBCR-INITIALIZATION-FUNCTION", 1, 0, false);
    //declareFunction(myName, "fbcr_reset_function", "FBCR-RESET-FUNCTION", 1, 0, false);
    //declareFunction(myName, "fbcr_default_fht_name_function", "FBCR-DEFAULT-FHT-NAME-FUNCTION", 1, 0, false);
    //declareFunction(myName, "fbcr_test_suite_name", "FBCR-TEST-SUITE-NAME", 1, 0, false);
    //declareFunction(myName, "fbcr_module_name", "FBCR-MODULE-NAME", 1, 0, false);
    //declareFunction(myName, "fbcr_system_name", "FBCR-SYSTEM-NAME", 1, 0, false);
    //declareFunction(myName, "_csetf_fbcr_generation_function", "_CSETF-FBCR-GENERATION-FUNCTION", 2, 0, false);
    //declareFunction(myName, "_csetf_fbcr_initialization_function", "_CSETF-FBCR-INITIALIZATION-FUNCTION", 2, 0, false);
    //declareFunction(myName, "_csetf_fbcr_reset_function", "_CSETF-FBCR-RESET-FUNCTION", 2, 0, false);
    //declareFunction(myName, "_csetf_fbcr_default_fht_name_function", "_CSETF-FBCR-DEFAULT-FHT-NAME-FUNCTION", 2, 0, false);
    //declareFunction(myName, "_csetf_fbcr_test_suite_name", "_CSETF-FBCR-TEST-SUITE-NAME", 2, 0, false);
    //declareFunction(myName, "_csetf_fbcr_module_name", "_CSETF-FBCR-MODULE-NAME", 2, 0, false);
    //declareFunction(myName, "_csetf_fbcr_system_name", "_CSETF-FBCR-SYSTEM-NAME", 2, 0, false);
    //declareFunction(myName, "make_file_backed_cache_registration", "MAKE-FILE-BACKED-CACHE-REGISTRATION", 0, 1, false);
    //declareFunction(myName, "register_file_backed_cache", "REGISTER-FILE-BACKED-CACHE", 7, 0, false);
    //declareFunction(myName, "lookup_file_backed_cache_by_name", "LOOKUP-FILE-BACKED-CACHE-BY-NAME", 1, 0, false);
    //declareFunction(myName, "generate_test_install_all_file_backed_caches", "GENERATE-TEST-INSTALL-ALL-FILE-BACKED-CACHES", 0, 2, false);
    //declareFunction(myName, "generate_all_file_backed_caches", "GENERATE-ALL-FILE-BACKED-CACHES", 0, 2, false);
    //declareFunction(myName, "test_all_file_backed_caches", "TEST-ALL-FILE-BACKED-CACHES", 0, 2, false);
    //declareFunction(myName, "install_all_file_backed_caches", "INSTALL-ALL-FILE-BACKED-CACHES", 0, 2, false);
    //declareFunction(myName, "generate_test_install_file_backed_cache", "GENERATE-TEST-INSTALL-FILE-BACKED-CACHE", 4, 2, false);
    //declareFunction(myName, "ensure_file_backed_cache_directory", "ENSURE-FILE-BACKED-CACHE-DIRECTORY", 0, 0, false);
    declareFunction(myName, "initialize_all_file_backed_caches", "INITIALIZE-ALL-FILE-BACKED-CACHES", 0, 0, false);
    //declareFunction(myName, "reset_all_file_backed_caches", "RESET-ALL-FILE-BACKED-CACHES", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_file_backed_cache_setup_file() {
    $registered_file_backed_caches$ = deflexical("*REGISTERED-FILE-BACKED-CACHES*", maybeDefault( $sym0$_REGISTERED_FILE_BACKED_CACHES_, $registered_file_backed_caches$, NIL));
    $file_backed_cache_default_temp_dir$ = defparameter("*FILE-BACKED-CACHE-DEFAULT-TEMP-DIR*", $str1$tmp_);
    $fbc_registration_lock$ = deflexical("*FBC-REGISTRATION-LOCK*", Locks.make_lock($str2$fbc_registration_lock));
    $dtp_file_backed_cache_registration$ = defconstant("*DTP-FILE-BACKED-CACHE-REGISTRATION*", $sym3$FILE_BACKED_CACHE_REGISTRATION);
    return NIL;
  }

  public static final SubLObject setup_file_backed_cache_setup_file() {
    // CVS_ID("Id: file-backed-cache-setup.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_REGISTERED_FILE_BACKED_CACHES_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_file_backed_cache_registration$.getGlobalValue(), Symbols.symbol_function($sym10$FILE_BACKED_CACHE_REGISTRATION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym11$FBCR_GENERATION_FUNCTION, $sym12$_CSETF_FBCR_GENERATION_FUNCTION);
    Structures.def_csetf($sym13$FBCR_INITIALIZATION_FUNCTION, $sym14$_CSETF_FBCR_INITIALIZATION_FUNCTION);
    Structures.def_csetf($sym15$FBCR_RESET_FUNCTION, $sym16$_CSETF_FBCR_RESET_FUNCTION);
    Structures.def_csetf($sym17$FBCR_DEFAULT_FHT_NAME_FUNCTION, $sym18$_CSETF_FBCR_DEFAULT_FHT_NAME_FUNCTION);
    Structures.def_csetf($sym19$FBCR_TEST_SUITE_NAME, $sym20$_CSETF_FBCR_TEST_SUITE_NAME);
    Structures.def_csetf($sym21$FBCR_MODULE_NAME, $sym22$_CSETF_FBCR_MODULE_NAME);
    Structures.def_csetf($sym23$FBCR_SYSTEM_NAME, $sym24$_CSETF_FBCR_SYSTEM_NAME);
    Equality.identity($sym3$FILE_BACKED_CACHE_REGISTRATION);
    access_macros.register_external_symbol($sym33$GENERATE_TEST_INSTALL_ALL_FILE_BACKED_CACHES);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_REGISTERED_FILE_BACKED_CACHES_ = makeSymbol("*REGISTERED-FILE-BACKED-CACHES*");
  public static final SubLString $str1$tmp_ = makeString("tmp/");
  public static final SubLString $str2$fbc_registration_lock = makeString("fbc-registration-lock");
  public static final SubLSymbol $sym3$FILE_BACKED_CACHE_REGISTRATION = makeSymbol("FILE-BACKED-CACHE-REGISTRATION");
  public static final SubLSymbol $sym4$FILE_BACKED_CACHE_REGISTRATION_P = makeSymbol("FILE-BACKED-CACHE-REGISTRATION-P");
  public static final SubLList $list5 = list(makeSymbol("GENERATION-FUNCTION"), makeSymbol("INITIALIZATION-FUNCTION"), makeSymbol("RESET-FUNCTION"), makeSymbol("DEFAULT-FHT-NAME-FUNCTION"), makeSymbol("TEST-SUITE-NAME"), makeSymbol("MODULE-NAME"), makeSymbol("SYSTEM-NAME"));
  public static final SubLList $list6 = list(makeKeyword("GENERATION-FUNCTION"), makeKeyword("INITIALIZATION-FUNCTION"), makeKeyword("RESET-FUNCTION"), makeKeyword("DEFAULT-FHT-NAME-FUNCTION"), makeKeyword("TEST-SUITE-NAME"), makeKeyword("MODULE-NAME"), makeKeyword("SYSTEM-NAME"));
  public static final SubLList $list7 = list(makeSymbol("FBCR-GENERATION-FUNCTION"), makeSymbol("FBCR-INITIALIZATION-FUNCTION"), makeSymbol("FBCR-RESET-FUNCTION"), makeSymbol("FBCR-DEFAULT-FHT-NAME-FUNCTION"), makeSymbol("FBCR-TEST-SUITE-NAME"), makeSymbol("FBCR-MODULE-NAME"), makeSymbol("FBCR-SYSTEM-NAME"));
  public static final SubLList $list8 = list(makeSymbol("_CSETF-FBCR-GENERATION-FUNCTION"), makeSymbol("_CSETF-FBCR-INITIALIZATION-FUNCTION"), makeSymbol("_CSETF-FBCR-RESET-FUNCTION"), makeSymbol("_CSETF-FBCR-DEFAULT-FHT-NAME-FUNCTION"), makeSymbol("_CSETF-FBCR-TEST-SUITE-NAME"), makeSymbol("_CSETF-FBCR-MODULE-NAME"), makeSymbol("_CSETF-FBCR-SYSTEM-NAME"));
  public static final SubLSymbol $sym9$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym10$FILE_BACKED_CACHE_REGISTRATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("FILE-BACKED-CACHE-REGISTRATION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym11$FBCR_GENERATION_FUNCTION = makeSymbol("FBCR-GENERATION-FUNCTION");
  public static final SubLSymbol $sym12$_CSETF_FBCR_GENERATION_FUNCTION = makeSymbol("_CSETF-FBCR-GENERATION-FUNCTION");
  public static final SubLSymbol $sym13$FBCR_INITIALIZATION_FUNCTION = makeSymbol("FBCR-INITIALIZATION-FUNCTION");
  public static final SubLSymbol $sym14$_CSETF_FBCR_INITIALIZATION_FUNCTION = makeSymbol("_CSETF-FBCR-INITIALIZATION-FUNCTION");
  public static final SubLSymbol $sym15$FBCR_RESET_FUNCTION = makeSymbol("FBCR-RESET-FUNCTION");
  public static final SubLSymbol $sym16$_CSETF_FBCR_RESET_FUNCTION = makeSymbol("_CSETF-FBCR-RESET-FUNCTION");
  public static final SubLSymbol $sym17$FBCR_DEFAULT_FHT_NAME_FUNCTION = makeSymbol("FBCR-DEFAULT-FHT-NAME-FUNCTION");
  public static final SubLSymbol $sym18$_CSETF_FBCR_DEFAULT_FHT_NAME_FUNCTION = makeSymbol("_CSETF-FBCR-DEFAULT-FHT-NAME-FUNCTION");
  public static final SubLSymbol $sym19$FBCR_TEST_SUITE_NAME = makeSymbol("FBCR-TEST-SUITE-NAME");
  public static final SubLSymbol $sym20$_CSETF_FBCR_TEST_SUITE_NAME = makeSymbol("_CSETF-FBCR-TEST-SUITE-NAME");
  public static final SubLSymbol $sym21$FBCR_MODULE_NAME = makeSymbol("FBCR-MODULE-NAME");
  public static final SubLSymbol $sym22$_CSETF_FBCR_MODULE_NAME = makeSymbol("_CSETF-FBCR-MODULE-NAME");
  public static final SubLSymbol $sym23$FBCR_SYSTEM_NAME = makeSymbol("FBCR-SYSTEM-NAME");
  public static final SubLSymbol $sym24$_CSETF_FBCR_SYSTEM_NAME = makeSymbol("_CSETF-FBCR-SYSTEM-NAME");
  public static final SubLSymbol $kw25$GENERATION_FUNCTION = makeKeyword("GENERATION-FUNCTION");
  public static final SubLSymbol $kw26$INITIALIZATION_FUNCTION = makeKeyword("INITIALIZATION-FUNCTION");
  public static final SubLSymbol $kw27$RESET_FUNCTION = makeKeyword("RESET-FUNCTION");
  public static final SubLSymbol $kw28$DEFAULT_FHT_NAME_FUNCTION = makeKeyword("DEFAULT-FHT-NAME-FUNCTION");
  public static final SubLSymbol $kw29$TEST_SUITE_NAME = makeKeyword("TEST-SUITE-NAME");
  public static final SubLSymbol $kw30$MODULE_NAME = makeKeyword("MODULE-NAME");
  public static final SubLSymbol $kw31$SYSTEM_NAME = makeKeyword("SYSTEM-NAME");
  public static final SubLString $str32$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym33$GENERATE_TEST_INSTALL_ALL_FILE_BACKED_CACHES = makeSymbol("GENERATE-TEST-INSTALL-ALL-FILE-BACKED-CACHES");
  public static final SubLString $str34$_tmp = makeString(".tmp");
  public static final SubLString $str35$Starting_file_backed_cache_genera = makeString("Starting file backed cache generation(s)/test(s)/install(s).~%");
  public static final SubLString $str36$Done_installing__A_cache_s__out_o = makeString("Done installing ~A cache(s) out of ~A attempt(s) with ~A error(s).~%");
  public static final SubLString $str37$Starting_file_backed_cache_genera = makeString("Starting file backed cache generation(s).~%");
  public static final SubLString $str38$Starting_file_backed_cache_test_s = makeString("Starting file backed cache test(s).~%");
  public static final SubLString $str39$Starting_file_backed_cache_instal = makeString("Starting file backed cache install(s).~%");
  public static final SubLString $str40$Provided_cache__A_is_not_a_file_b = makeString("Provided cache ~A is not a file-backed-cache-p");
  public static final SubLSymbol $sym41$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str42$Generating_cache_for_file___A__ = makeString("Generating cache for file: ~A~%");
  public static final SubLString $str43$Moving__A_to__A__ = makeString("Moving ~A to ~A~%");
  public static final SubLString $str44$Encountered_a_problem_either_gene = makeString("Encountered a problem either generating, testing or installing a file backed cache ~A.~%");
  public static final SubLString $str45$__ = makeString("~%");
  public static final SubLInteger $int46$509 = makeInteger(509);
  public static final SubLString $str47$_A_is_not_a_valid_directory___ = makeString("~A is not a valid directory.~%");
  public static final SubLString $str48$_ = makeString("/");
  public static final SubLString $str49$_4__0d = makeString("~4,'0d");
  public static final SubLString $str50$__Initializing_file_backed_caches = makeString("~&Initializing file-backed caches.~%");
  public static final SubLString $str51$_A = makeString("~A");
  public static final SubLString $str52$__Resetting_all_file_backed_cache = makeString("~&Resetting all file-backed caches.~%");

  //// Initializers

  public void declareFunctions() {
    declare_file_backed_cache_setup_file();
  }

  public void initializeVariables() {
    init_file_backed_cache_setup_file();
  }

  public void runTopLevelForms() {
    setup_file_backed_cache_setup_file();
  }

}
