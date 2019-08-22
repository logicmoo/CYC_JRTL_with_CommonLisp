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
//dm import com.cyc.cycjava_1.cycl.c_backend;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.file_translation;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.secure_translation;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.xref_database;

public  final class system_translation extends SubLTranslatedFile {

  //// Constructor

  private system_translation() {}
  public static final SubLFile me = new system_translation();
  public static final String myName = "com.cyc.cycjava_1.cycl.system_translation";

  //// Definitions

  /** When non-nil, the backend actually writes to output files.
   When T, the backend just writes to /dev/null. */
  @SubL(source = "cycl/system-translation.lisp", position = 865) 
  private static SubLSymbol $translator_output_enabledP$ = null;

  @SubL(source = "cycl/system-translation.lisp", position = 1118) 
  private static SubLSymbol $translator_backends$ = null;

  @SubL(source = "cycl/system-translation.lisp", position = 1322) 
  private static SubLSymbol $current_system_translation$ = null;

  @SubL(source = "cycl/system-translation.lisp", position = 1374) 
  public static final SubLObject current_system_translation() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $current_system_translation$.getDynamicValue(thread);
    }
  }

  public static final class $system_translation_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $system; }
    public SubLObject getField3() { return $backend; }
    public SubLObject getField4() { return $features; }
    public SubLObject getField5() { return $input_directory; }
    public SubLObject getField6() { return $output_directory; }
    public SubLObject getField7() { return $manifest_file; }
    public SubLObject getField8() { return $modules; }
    public SubLObject getField9() { return $module_filename_table; }
    public SubLObject getField10() { return $module_features_table; }
    public SubLObject getField11() { return $module_initialization_table; }
    public SubLObject getField12() { return $xref_database; }
    public SubLObject getField13() { return $secure_id_database; }
    public SubLObject getField14() { return $last_translation_time; }
    public SubLObject setField2(SubLObject value) { return $system = value; }
    public SubLObject setField3(SubLObject value) { return $backend = value; }
    public SubLObject setField4(SubLObject value) { return $features = value; }
    public SubLObject setField5(SubLObject value) { return $input_directory = value; }
    public SubLObject setField6(SubLObject value) { return $output_directory = value; }
    public SubLObject setField7(SubLObject value) { return $manifest_file = value; }
    public SubLObject setField8(SubLObject value) { return $modules = value; }
    public SubLObject setField9(SubLObject value) { return $module_filename_table = value; }
    public SubLObject setField10(SubLObject value) { return $module_features_table = value; }
    public SubLObject setField11(SubLObject value) { return $module_initialization_table = value; }
    public SubLObject setField12(SubLObject value) { return $xref_database = value; }
    public SubLObject setField13(SubLObject value) { return $secure_id_database = value; }
    public SubLObject setField14(SubLObject value) { return $last_translation_time = value; }
    public SubLObject $system = NIL;
    public SubLObject $backend = NIL;
    public SubLObject $features = NIL;
    public SubLObject $input_directory = NIL;
    public SubLObject $output_directory = NIL;
    public SubLObject $manifest_file = NIL;
    public SubLObject $modules = NIL;
    public SubLObject $module_filename_table = NIL;
    public SubLObject $module_features_table = NIL;
    public SubLObject $module_initialization_table = NIL;
    public SubLObject $xref_database = NIL;
    public SubLObject $secure_id_database = NIL;
    public SubLObject $last_translation_time = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($system_translation_native.class, $sym2$SYSTEM_TRANSLATION, $sym3$SYSTEM_TRANSLATION_P, $list4, $list5, new String[] {"$system", "$backend", "$features", "$input_directory", "$output_directory", "$manifest_file", "$modules", "$module_filename_table", "$module_features_table", "$module_initialization_table", "$xref_database", "$secure_id_database", "$last_translation_time"}, $list6, $list7, $sym8$PRINT_SYSTEM_TRANSLATION);
  }

  @SubL(source = "cycl/system-translation.lisp", position = 2319) 
  public static SubLSymbol $dtp_system_translation$ = null;

  @SubL(source = "cycl/system-translation.lisp", position = 2319) 
  public static final SubLObject system_translation_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8676");
    return NIL;
  }

  public static final class $system_translation_p$UnaryFunction extends UnaryFunction {
    public $system_translation_p$UnaryFunction() { super(extractFunctionNamed("SYSTEM-TRANSLATION-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8756"); }
  }

  @SubL(source = "cycl/system-translation.lisp", position = 20568) 
  private static SubLSymbol $translation_trace_stream$ = null;

  /** The default target for saving the secure translation's ID database file. */
  @SubL(source = "cycl/system-translation.lisp", position = 33659) 
  private static SubLSymbol $default_secure_id_database_filename$ = null;

  public static final SubLObject declare_system_translation_file() {
    //declareFunction("translator_output_enabled_p", "TRANSLATOR-OUTPUT-ENABLED-P", 0, 0, false);
    //declareFunction("translator_backend_p", "TRANSLATOR-BACKEND-P", 1, 0, false);
    declareFunction("current_system_translation", "CURRENT-SYSTEM-TRANSLATION", 0, 0, false);
    //declareFunction("current_system_translation_secureP", "CURRENT-SYSTEM-TRANSLATION-SECURE?", 0, 0, false);
    //declareFunction("current_system_translation_security_level", "CURRENT-SYSTEM-TRANSLATION-SECURITY-LEVEL", 0, 0, false);
    declareFunction("system_translation_print_function_trampoline", "SYSTEM-TRANSLATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction("system_translation_p", "SYSTEM-TRANSLATION-P", 1, 0, false); new $system_translation_p$UnaryFunction();
    //declareFunction("sys_tr_system", "SYS-TR-SYSTEM", 1, 0, false);
    //declareFunction("sys_tr_backend", "SYS-TR-BACKEND", 1, 0, false);
    //declareFunction("sys_tr_features", "SYS-TR-FEATURES", 1, 0, false);
    //declareFunction("sys_tr_input_directory", "SYS-TR-INPUT-DIRECTORY", 1, 0, false);
    //declareFunction("sys_tr_output_directory", "SYS-TR-OUTPUT-DIRECTORY", 1, 0, false);
    //declareFunction("sys_tr_manifest_file", "SYS-TR-MANIFEST-FILE", 1, 0, false);
    //declareFunction("sys_tr_modules", "SYS-TR-MODULES", 1, 0, false);
    //declareFunction("sys_tr_module_filename_table", "SYS-TR-MODULE-FILENAME-TABLE", 1, 0, false);
    //declareFunction("sys_tr_module_features_table", "SYS-TR-MODULE-FEATURES-TABLE", 1, 0, false);
    //declareFunction("sys_tr_module_initialization_table", "SYS-TR-MODULE-INITIALIZATION-TABLE", 1, 0, false);
    //declareFunction("sys_tr_xref_database", "SYS-TR-XREF-DATABASE", 1, 0, false);
    //declareFunction("sys_tr_secure_id_database", "SYS-TR-SECURE-ID-DATABASE", 1, 0, false);
    //declareFunction("sys_tr_last_translation_time", "SYS-TR-LAST-TRANSLATION-TIME", 1, 0, false);
    //declareFunction("_csetf_sys_tr_system", "_CSETF-SYS-TR-SYSTEM", 2, 0, false);
    //declareFunction("_csetf_sys_tr_backend", "_CSETF-SYS-TR-BACKEND", 2, 0, false);
    //declareFunction("_csetf_sys_tr_features", "_CSETF-SYS-TR-FEATURES", 2, 0, false);
    //declareFunction("_csetf_sys_tr_input_directory", "_CSETF-SYS-TR-INPUT-DIRECTORY", 2, 0, false);
    //declareFunction("_csetf_sys_tr_output_directory", "_CSETF-SYS-TR-OUTPUT-DIRECTORY", 2, 0, false);
    //declareFunction("_csetf_sys_tr_manifest_file", "_CSETF-SYS-TR-MANIFEST-FILE", 2, 0, false);
    //declareFunction("_csetf_sys_tr_modules", "_CSETF-SYS-TR-MODULES", 2, 0, false);
    //declareFunction("_csetf_sys_tr_module_filename_table", "_CSETF-SYS-TR-MODULE-FILENAME-TABLE", 2, 0, false);
    //declareFunction("_csetf_sys_tr_module_features_table", "_CSETF-SYS-TR-MODULE-FEATURES-TABLE", 2, 0, false);
    //declareFunction("_csetf_sys_tr_module_initialization_table", "_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE", 2, 0, false);
    //declareFunction("_csetf_sys_tr_xref_database", "_CSETF-SYS-TR-XREF-DATABASE", 2, 0, false);
    //declareFunction("_csetf_sys_tr_secure_id_database", "_CSETF-SYS-TR-SECURE-ID-DATABASE", 2, 0, false);
    //declareFunction("_csetf_sys_tr_last_translation_time", "_CSETF-SYS-TR-LAST-TRANSLATION-TIME", 2, 0, false);
    //declareFunction("make_system_translation", "MAKE-SYSTEM-TRANSLATION", 0, 1, false);
    //declareFunction("print_system_translation", "PRINT-SYSTEM-TRANSLATION", 3, 0, false);
    //declareFunction("new_system_translation", "NEW-SYSTEM-TRANSLATION", 7, 0, false);
    //declareFunction("destroy_system_translation", "DESTROY-SYSTEM-TRANSLATION", 1, 0, false);
    //declareFunction("sys_tran_system", "SYS-TRAN-SYSTEM", 1, 0, false);
    //declareFunction("sys_tran_backend", "SYS-TRAN-BACKEND", 1, 0, false);
    //declareFunction("sys_tran_features", "SYS-TRAN-FEATURES", 1, 0, false);
    //declareFunction("sys_tran_input_directory", "SYS-TRAN-INPUT-DIRECTORY", 1, 0, false);
    //declareFunction("sys_tran_output_directory", "SYS-TRAN-OUTPUT-DIRECTORY", 1, 0, false);
    //declareFunction("sys_tran_manifest_file", "SYS-TRAN-MANIFEST-FILE", 1, 0, false);
    //declareFunction("sys_tran_xref_database", "SYS-TRAN-XREF-DATABASE", 1, 0, false);
    //declareFunction("sys_tran_secure_id_database", "SYS-TRAN-SECURE-ID-DATABASE", 1, 0, false);
    //declareFunction("sys_tran_modules", "SYS-TRAN-MODULES", 1, 0, false);
    //declareFunction("sys_tran_set_modules", "SYS-TRAN-SET-MODULES", 2, 0, false);
    //declareFunction("sys_tran_set_last_translation_time", "SYS-TRAN-SET-LAST-TRANSLATION-TIME", 1, 1, false);
    //declareFunction("sys_tran_security_level", "SYS-TRAN-SECURITY-LEVEL", 1, 0, false);
    //declareFunction("sys_tran_secureP", "SYS-TRAN-SECURE?", 1, 0, false);
    //declareFunction("sys_tran_includes_moduleP", "SYS-TRAN-INCLUDES-MODULE?", 2, 0, false);
    //declareFunction("sys_tran_module_input_filename", "SYS-TRAN-MODULE-INPUT-FILENAME", 2, 0, false);
    //declareFunction("sys_tran_module_output_filename", "SYS-TRAN-MODULE-OUTPUT-FILENAME", 2, 0, false);
    //declareFunction("sys_tran_relative_input_filename", "SYS-TRAN-RELATIVE-INPUT-FILENAME", 2, 0, false);
    //declareFunction("sys_tran_module_features", "SYS-TRAN-MODULE-FEATURES", 2, 0, false);
    //declareFunction("sys_tran_module_declare_function", "SYS-TRAN-MODULE-DECLARE-FUNCTION", 2, 0, false);
    //declareFunction("sys_tran_module_init_function", "SYS-TRAN-MODULE-INIT-FUNCTION", 2, 0, false);
    //declareFunction("sys_tran_module_setup_function", "SYS-TRAN-MODULE-SETUP-FUNCTION", 2, 0, false);
    //declareFunction("sys_tran_all_init_functions", "SYS-TRAN-ALL-INIT-FUNCTIONS", 1, 0, false);
    //declareFunction("sys_tran_system_default_path", "SYS-TRAN-SYSTEM-DEFAULT-PATH", 1, 0, false);
    //declareFunction("sys_tran_secure_module_id", "SYS-TRAN-SECURE-MODULE-ID", 2, 0, false);
    //declareFunction("sys_tran_secure_method_id", "SYS-TRAN-SECURE-METHOD-ID", 2, 0, false);
    //declareFunction("sys_tran_secure_global_id", "SYS-TRAN-SECURE-GLOBAL-ID", 2, 0, false);
    //declareFunction("sys_tran_secure_symbol_name", "SYS-TRAN-SECURE-SYMBOL-NAME", 2, 0, false);
    //declareFunction("current_system_translation_secure_symbol_name", "CURRENT-SYSTEM-TRANSLATION-SECURE-SYMBOL-NAME", 1, 0, false);
    //declareFunction("sys_tran_note_module_filenames", "SYS-TRAN-NOTE-MODULE-FILENAMES", 4, 0, false);
    //declareFunction("sys_tran_note_module_features", "SYS-TRAN-NOTE-MODULE-FEATURES", 3, 0, false);
    //declareFunction("sys_tran_initialize_last_translation_time", "SYS-TRAN-INITIALIZE-LAST-TRANSLATION-TIME", 1, 0, false);
    //declareFunction("translator_possibly_update_current_system_modules", "TRANSLATOR-POSSIBLY-UPDATE-CURRENT-SYSTEM-MODULES", 0, 0, false);
    //declareFunction("translator_possibly_translate_one_module", "TRANSLATOR-POSSIBLY-TRANSLATE-ONE-MODULE", 1, 0, false);
    //declareFunction("translator_possibly_output_system_level_files", "TRANSLATOR-POSSIBLY-OUTPUT-SYSTEM-LEVEL-FILES", 0, 0, false);
    //declareFunction("translator_possibly_output_secure_id_database_file", "TRANSLATOR-POSSIBLY-OUTPUT-SECURE-ID-DATABASE-FILE", 0, 0, false);
    //declareFunction("sys_tran_possibly_note_module_initialization_methods", "SYS-TRAN-POSSIBLY-NOTE-MODULE-INITIALIZATION-METHODS", 4, 0, false);
    //declareFunction("translate_one_system", "TRANSLATE-ONE-SYSTEM", 1, 0, false);
    //declareFunction("sys_tran_initialize_xref_database", "SYS-TRAN-INITIALIZE-XREF-DATABASE", 1, 0, false);
    //declareFunction("sys_tran_initialize_module_info", "SYS-TRAN-INITIALIZE-MODULE-INFO", 1, 0, false);
    //declareFunction("translator_compute_relevant_modules_from_manifest", "TRANSLATOR-COMPUTE-RELEVANT-MODULES-FROM-MANIFEST", 4, 0, false);
    //declareFunction("translator_compute_module_input_file", "TRANSLATOR-COMPUTE-MODULE-INPUT-FILE", 3, 0, false);
    //declareFunction("sys_tran_compute_module_output_file", "SYS-TRAN-COMPUTE-MODULE-OUTPUT-FILE", 3, 0, false);
    //declareFunction("translate_backend_compute_output_module_path", "TRANSLATE-BACKEND-COMPUTE-OUTPUT-MODULE-PATH", 3, 0, false);
    //declareFunction("translator_backend_output_file_extension", "TRANSLATOR-BACKEND-OUTPUT-FILE-EXTENSION", 1, 0, false);
    //declareFunction("sys_tran_backend_output_module_filename", "SYS-TRAN-BACKEND-OUTPUT-MODULE-FILENAME", 3, 0, false);
    //declareFunction("java_backend_output_module_filename", "JAVA-BACKEND-OUTPUT-MODULE-FILENAME", 1, 1, false);
    //declareFunction("translator_compute_full_filename", "TRANSLATOR-COMPUTE-FULL-FILENAME", 4, 0, false);
    //declareFunction("translator_module_feature_expression_match", "TRANSLATOR-MODULE-FEATURE-EXPRESSION-MATCH", 2, 0, false);
    //declareFunction("sys_tran_possibly_update_xref_module_features", "SYS-TRAN-POSSIBLY-UPDATE-XREF-MODULE-FEATURES", 1, 0, false);
    //declareFunction("sys_tran_trace_format", "SYS-TRAN-TRACE-FORMAT", 1, 3, false);
    //declareMacro("with_simple_restart_loop", "WITH-SIMPLE-RESTART-LOOP");
    //declareFunction("sys_tran_perform_initial_translation", "SYS-TRAN-PERFORM-INITIAL-TRANSLATION", 1, 0, false);
    //declareFunction("sys_tran_translate_modules", "SYS-TRAN-TRANSLATE-MODULES", 2, 0, false);
    //declareFunction("translate_one_module", "TRANSLATE-ONE-MODULE", 5, 0, false);
    //declareFunction("translate_one_system_module", "TRANSLATE-ONE-SYSTEM-MODULE", 2, 0, false);
    //declareFunction("translator_parse_manifest_file", "TRANSLATOR-PARSE-MANIFEST-FILE", 1, 0, false);
    //declareMacro("do_manifest_systems", "DO-MANIFEST-SYSTEMS");
    //declareFunction("manifest_system_name", "MANIFEST-SYSTEM-NAME", 1, 0, false);
    //declareFunction("manifest_system_lookup", "MANIFEST-SYSTEM-LOOKUP", 2, 0, false);
    //declareFunction("manifest_system_modules", "MANIFEST-SYSTEM-MODULES", 1, 0, false);
    //declareFunction("manifest_system_default_path", "MANIFEST-SYSTEM-DEFAULT-PATH", 1, 0, false);
    //declareFunction("manifest_module_name", "MANIFEST-MODULE-NAME", 1, 0, false);
    //declareFunction("manifest_module_relative_path", "MANIFEST-MODULE-RELATIVE-PATH", 1, 0, false);
    //declareFunction("manifest_module_features", "MANIFEST-MODULE-FEATURES", 1, 0, false);
    //declareFunction("manifest_module_path", "MANIFEST-MODULE-PATH", 2, 0, false);
    //declareFunction("manifest_module_features_allowedP", "MANIFEST-MODULE-FEATURES-ALLOWED?", 3, 0, false);
    //declareFunction("translator_regenerate_manifest_file", "TRANSLATOR-REGENERATE-MANIFEST-FILE", 1, 0, false);
    //declareFunction("translator_generate_manifest_file", "TRANSLATOR-GENERATE-MANIFEST-FILE", 1, 0, false);
    //declareFunction("translator_generate_manifest_to_stream", "TRANSLATOR-GENERATE-MANIFEST-TO-STREAM", 1, 0, false);
    //declareFunction("translator_generate_manifest_system_to_stream", "TRANSLATOR-GENERATE-MANIFEST-SYSTEM-TO-STREAM", 2, 0, false);
    //declareFunction("translator_system_module_specs", "TRANSLATOR-SYSTEM-MODULE-SPECS", 1, 0, false);
    //declareFunction("translator_system_directory", "TRANSLATOR-SYSTEM-DIRECTORY", 1, 0, false);
    //declareFunction("translator_system_package", "TRANSLATOR-SYSTEM-PACKAGE", 1, 0, false);
    //declareFunction("translator_system_required_systems", "TRANSLATOR-SYSTEM-REQUIRED-SYSTEMS", 1, 0, false);
    //declareFunction("translator_system_modules", "TRANSLATOR-SYSTEM-MODULES", 1, 0, false);
    //declareFunction("translator_system_module_directory", "TRANSLATOR-SYSTEM-MODULE-DIRECTORY", 2, 0, false);
    //declareFunction("translator_system_module_features", "TRANSLATOR-SYSTEM-MODULE-FEATURES", 2, 0, false);
    //declareFunction("untransformed_feature_symbol_p", "UNTRANSFORMED-FEATURE-SYMBOL-P", 1, 0, false);
    //declareFunction("transform_feature_symbol", "TRANSFORM-FEATURE-SYMBOL", 1, 0, false);
    //declareFunction("sys_tran_output_system_level_files", "SYS-TRAN-OUTPUT-SYSTEM-LEVEL-FILES", 1, 0, false);
    //declareFunction("sys_tran_possibly_output_secure_id_database_file", "SYS-TRAN-POSSIBLY-OUTPUT-SECURE-ID-DATABASE-FILE", 1, 0, false);
    //declareFunction("translator_system_directory_module_map", "TRANSLATOR-SYSTEM-DIRECTORY-MODULE-MAP", 4, 0, false);
    //declareFunction("translator_libraries_from_directory_module_map", "TRANSLATOR-LIBRARIES-FROM-DIRECTORY-MODULE-MAP", 2, 0, false);
    //declareFunction("translator_paths_from_directory_module_map", "TRANSLATOR-PATHS-FROM-DIRECTORY-MODULE-MAP", 1, 0, false);
    //declareFunction("retranslate_modules", "RETRANSLATE-MODULES", 1, 0, false);
    //declareFunction("module_damaged_wrt_introspectionP", "MODULE-DAMAGED-WRT-INTROSPECTION?", 1, 0, false);
    //declareFunction("test_translate_and_output_form", "TEST-TRANSLATE-AND-OUTPUT-FORM", 1, 3, false);
    //declareFunction("test_translate_and_output_form_to_string", "TEST-TRANSLATE-AND-OUTPUT-FORM-TO-STRING", 1, 2, false);
    return NIL;
  }

  public static final SubLObject init_system_translation_file() {
    $translator_output_enabledP$ = defvar("*TRANSLATOR-OUTPUT-ENABLED?*", T);
    $translator_backends$ = deflexical("*TRANSLATOR-BACKENDS*", $list0);
    $current_system_translation$ = defvar("*CURRENT-SYSTEM-TRANSLATION*", NIL);
    $dtp_system_translation$ = defconstant("*DTP-SYSTEM-TRANSLATION*", $sym2$SYSTEM_TRANSLATION);
    $translation_trace_stream$ = defparameter("*TRANSLATION-TRACE-STREAM*", T);
    $default_secure_id_database_filename$ = deflexical("*DEFAULT-SECURE-ID-DATABASE-FILENAME*", $str138$translation_secure_id_database_fi);
    return NIL;
  }

  public static final SubLObject setup_system_translation_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_system_translation$.getGlobalValue(), Symbols.symbol_function($sym9$SYSTEM_TRANSLATION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym10$SYS_TR_SYSTEM, $sym11$_CSETF_SYS_TR_SYSTEM);
    Structures.def_csetf($sym12$SYS_TR_BACKEND, $sym13$_CSETF_SYS_TR_BACKEND);
    Structures.def_csetf($sym14$SYS_TR_FEATURES, $sym15$_CSETF_SYS_TR_FEATURES);
    Structures.def_csetf($sym16$SYS_TR_INPUT_DIRECTORY, $sym17$_CSETF_SYS_TR_INPUT_DIRECTORY);
    Structures.def_csetf($sym18$SYS_TR_OUTPUT_DIRECTORY, $sym19$_CSETF_SYS_TR_OUTPUT_DIRECTORY);
    Structures.def_csetf($sym20$SYS_TR_MANIFEST_FILE, $sym21$_CSETF_SYS_TR_MANIFEST_FILE);
    Structures.def_csetf($sym22$SYS_TR_MODULES, $sym23$_CSETF_SYS_TR_MODULES);
    Structures.def_csetf($sym24$SYS_TR_MODULE_FILENAME_TABLE, $sym25$_CSETF_SYS_TR_MODULE_FILENAME_TABLE);
    Structures.def_csetf($sym26$SYS_TR_MODULE_FEATURES_TABLE, $sym27$_CSETF_SYS_TR_MODULE_FEATURES_TABLE);
    Structures.def_csetf($sym28$SYS_TR_MODULE_INITIALIZATION_TABLE, $sym29$_CSETF_SYS_TR_MODULE_INITIALIZATION_TABLE);
    Structures.def_csetf($sym30$SYS_TR_XREF_DATABASE, $sym31$_CSETF_SYS_TR_XREF_DATABASE);
    Structures.def_csetf($sym32$SYS_TR_SECURE_ID_DATABASE, $sym33$_CSETF_SYS_TR_SECURE_ID_DATABASE);
    Structures.def_csetf($sym34$SYS_TR_LAST_TRANSLATION_TIME, $sym35$_CSETF_SYS_TR_LAST_TRANSLATION_TIME);
    Equality.identity($sym2$SYSTEM_TRANSLATION);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("SL2C"), makeKeyword("SL2JAVA"));
  public static final SubLSymbol $kw1$NONE = makeKeyword("NONE");
  public static final SubLSymbol $sym2$SYSTEM_TRANSLATION = makeSymbol("SYSTEM-TRANSLATION");
  public static final SubLSymbol $sym3$SYSTEM_TRANSLATION_P = makeSymbol("SYSTEM-TRANSLATION-P");
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("SYSTEM"), makeSymbol("BACKEND"), makeSymbol("FEATURES"), makeSymbol("INPUT-DIRECTORY"), makeSymbol("OUTPUT-DIRECTORY"), makeSymbol("MANIFEST-FILE"), makeSymbol("MODULES"), makeSymbol("MODULE-FILENAME-TABLE"), makeSymbol("MODULE-FEATURES-TABLE"), makeSymbol("MODULE-INITIALIZATION-TABLE"), makeSymbol("XREF-DATABASE"), makeSymbol("SECURE-ID-DATABASE"), makeSymbol("LAST-TRANSLATION-TIME")});
  public static final SubLList $list5 = list(new SubLObject[] {makeKeyword("SYSTEM"), makeKeyword("BACKEND"), makeKeyword("FEATURES"), makeKeyword("INPUT-DIRECTORY"), makeKeyword("OUTPUT-DIRECTORY"), makeKeyword("MANIFEST-FILE"), makeKeyword("MODULES"), makeKeyword("MODULE-FILENAME-TABLE"), makeKeyword("MODULE-FEATURES-TABLE"), makeKeyword("MODULE-INITIALIZATION-TABLE"), makeKeyword("XREF-DATABASE"), makeKeyword("SECURE-ID-DATABASE"), makeKeyword("LAST-TRANSLATION-TIME")});
  public static final SubLList $list6 = list(new SubLObject[] {makeSymbol("SYS-TR-SYSTEM"), makeSymbol("SYS-TR-BACKEND"), makeSymbol("SYS-TR-FEATURES"), makeSymbol("SYS-TR-INPUT-DIRECTORY"), makeSymbol("SYS-TR-OUTPUT-DIRECTORY"), makeSymbol("SYS-TR-MANIFEST-FILE"), makeSymbol("SYS-TR-MODULES"), makeSymbol("SYS-TR-MODULE-FILENAME-TABLE"), makeSymbol("SYS-TR-MODULE-FEATURES-TABLE"), makeSymbol("SYS-TR-MODULE-INITIALIZATION-TABLE"), makeSymbol("SYS-TR-XREF-DATABASE"), makeSymbol("SYS-TR-SECURE-ID-DATABASE"), makeSymbol("SYS-TR-LAST-TRANSLATION-TIME")});
  public static final SubLList $list7 = list(new SubLObject[] {makeSymbol("_CSETF-SYS-TR-SYSTEM"), makeSymbol("_CSETF-SYS-TR-BACKEND"), makeSymbol("_CSETF-SYS-TR-FEATURES"), makeSymbol("_CSETF-SYS-TR-INPUT-DIRECTORY"), makeSymbol("_CSETF-SYS-TR-OUTPUT-DIRECTORY"), makeSymbol("_CSETF-SYS-TR-MANIFEST-FILE"), makeSymbol("_CSETF-SYS-TR-MODULES"), makeSymbol("_CSETF-SYS-TR-MODULE-FILENAME-TABLE"), makeSymbol("_CSETF-SYS-TR-MODULE-FEATURES-TABLE"), makeSymbol("_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE"), makeSymbol("_CSETF-SYS-TR-XREF-DATABASE"), makeSymbol("_CSETF-SYS-TR-SECURE-ID-DATABASE"), makeSymbol("_CSETF-SYS-TR-LAST-TRANSLATION-TIME")});
  public static final SubLSymbol $sym8$PRINT_SYSTEM_TRANSLATION = makeSymbol("PRINT-SYSTEM-TRANSLATION");
  public static final SubLSymbol $sym9$SYSTEM_TRANSLATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SYSTEM-TRANSLATION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym10$SYS_TR_SYSTEM = makeSymbol("SYS-TR-SYSTEM");
  public static final SubLSymbol $sym11$_CSETF_SYS_TR_SYSTEM = makeSymbol("_CSETF-SYS-TR-SYSTEM");
  public static final SubLSymbol $sym12$SYS_TR_BACKEND = makeSymbol("SYS-TR-BACKEND");
  public static final SubLSymbol $sym13$_CSETF_SYS_TR_BACKEND = makeSymbol("_CSETF-SYS-TR-BACKEND");
  public static final SubLSymbol $sym14$SYS_TR_FEATURES = makeSymbol("SYS-TR-FEATURES");
  public static final SubLSymbol $sym15$_CSETF_SYS_TR_FEATURES = makeSymbol("_CSETF-SYS-TR-FEATURES");
  public static final SubLSymbol $sym16$SYS_TR_INPUT_DIRECTORY = makeSymbol("SYS-TR-INPUT-DIRECTORY");
  public static final SubLSymbol $sym17$_CSETF_SYS_TR_INPUT_DIRECTORY = makeSymbol("_CSETF-SYS-TR-INPUT-DIRECTORY");
  public static final SubLSymbol $sym18$SYS_TR_OUTPUT_DIRECTORY = makeSymbol("SYS-TR-OUTPUT-DIRECTORY");
  public static final SubLSymbol $sym19$_CSETF_SYS_TR_OUTPUT_DIRECTORY = makeSymbol("_CSETF-SYS-TR-OUTPUT-DIRECTORY");
  public static final SubLSymbol $sym20$SYS_TR_MANIFEST_FILE = makeSymbol("SYS-TR-MANIFEST-FILE");
  public static final SubLSymbol $sym21$_CSETF_SYS_TR_MANIFEST_FILE = makeSymbol("_CSETF-SYS-TR-MANIFEST-FILE");
  public static final SubLSymbol $sym22$SYS_TR_MODULES = makeSymbol("SYS-TR-MODULES");
  public static final SubLSymbol $sym23$_CSETF_SYS_TR_MODULES = makeSymbol("_CSETF-SYS-TR-MODULES");
  public static final SubLSymbol $sym24$SYS_TR_MODULE_FILENAME_TABLE = makeSymbol("SYS-TR-MODULE-FILENAME-TABLE");
  public static final SubLSymbol $sym25$_CSETF_SYS_TR_MODULE_FILENAME_TABLE = makeSymbol("_CSETF-SYS-TR-MODULE-FILENAME-TABLE");
  public static final SubLSymbol $sym26$SYS_TR_MODULE_FEATURES_TABLE = makeSymbol("SYS-TR-MODULE-FEATURES-TABLE");
  public static final SubLSymbol $sym27$_CSETF_SYS_TR_MODULE_FEATURES_TABLE = makeSymbol("_CSETF-SYS-TR-MODULE-FEATURES-TABLE");
  public static final SubLSymbol $sym28$SYS_TR_MODULE_INITIALIZATION_TABLE = makeSymbol("SYS-TR-MODULE-INITIALIZATION-TABLE");
  public static final SubLSymbol $sym29$_CSETF_SYS_TR_MODULE_INITIALIZATION_TABLE = makeSymbol("_CSETF-SYS-TR-MODULE-INITIALIZATION-TABLE");
  public static final SubLSymbol $sym30$SYS_TR_XREF_DATABASE = makeSymbol("SYS-TR-XREF-DATABASE");
  public static final SubLSymbol $sym31$_CSETF_SYS_TR_XREF_DATABASE = makeSymbol("_CSETF-SYS-TR-XREF-DATABASE");
  public static final SubLSymbol $sym32$SYS_TR_SECURE_ID_DATABASE = makeSymbol("SYS-TR-SECURE-ID-DATABASE");
  public static final SubLSymbol $sym33$_CSETF_SYS_TR_SECURE_ID_DATABASE = makeSymbol("_CSETF-SYS-TR-SECURE-ID-DATABASE");
  public static final SubLSymbol $sym34$SYS_TR_LAST_TRANSLATION_TIME = makeSymbol("SYS-TR-LAST-TRANSLATION-TIME");
  public static final SubLSymbol $sym35$_CSETF_SYS_TR_LAST_TRANSLATION_TIME = makeSymbol("_CSETF-SYS-TR-LAST-TRANSLATION-TIME");
  public static final SubLSymbol $kw36$SYSTEM = makeKeyword("SYSTEM");
  public static final SubLSymbol $kw37$BACKEND = makeKeyword("BACKEND");
  public static final SubLSymbol $kw38$FEATURES = makeKeyword("FEATURES");
  public static final SubLSymbol $kw39$INPUT_DIRECTORY = makeKeyword("INPUT-DIRECTORY");
  public static final SubLSymbol $kw40$OUTPUT_DIRECTORY = makeKeyword("OUTPUT-DIRECTORY");
  public static final SubLSymbol $kw41$MANIFEST_FILE = makeKeyword("MANIFEST-FILE");
  public static final SubLSymbol $kw42$MODULES = makeKeyword("MODULES");
  public static final SubLSymbol $kw43$MODULE_FILENAME_TABLE = makeKeyword("MODULE-FILENAME-TABLE");
  public static final SubLSymbol $kw44$MODULE_FEATURES_TABLE = makeKeyword("MODULE-FEATURES-TABLE");
  public static final SubLSymbol $kw45$MODULE_INITIALIZATION_TABLE = makeKeyword("MODULE-INITIALIZATION-TABLE");
  public static final SubLSymbol $kw46$XREF_DATABASE = makeKeyword("XREF-DATABASE");
  public static final SubLSymbol $kw47$SECURE_ID_DATABASE = makeKeyword("SECURE-ID-DATABASE");
  public static final SubLSymbol $kw48$LAST_TRANSLATION_TIME = makeKeyword("LAST-TRANSLATION-TIME");
  public static final SubLString $str49$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str50$__ = makeString("#<");
  public static final SubLSymbol $kw51$STREAM = makeKeyword("STREAM");
  public static final SubLString $str52$_A_A__S__S_features___S_modules = makeString("~A~A ~S ~S features, ~S modules");
  public static final SubLString $str53$secure_ = makeString("secure ");
  public static final SubLString $str54$ = makeString("");
  public static final SubLSymbol $kw55$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym56$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym57$TRANSLATOR_BACKEND_P = makeSymbol("TRANSLATOR-BACKEND-P");
  public static final SubLSymbol $sym58$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym59$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym60$TRANSLATOR_SECURITY_LEVEL_P = makeSymbol("TRANSLATOR-SECURITY-LEVEL-P");
  public static final SubLSymbol $sym61$DIRECTORY_P = makeSymbol("DIRECTORY-P");
  public static final SubLInteger $int62$1000 = makeInteger(1000);
  public static final SubLSymbol $kw63$FREE = makeKeyword("FREE");
  public static final SubLSymbol $sym64$UNIVERSAL_TIME_P = makeSymbol("UNIVERSAL-TIME-P");
  public static final SubLInteger $int65$1970 = makeInteger(1970);
  public static final SubLSymbol $sym66$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLList $list67 = list(makeSymbol("&KEY"), makeSymbol("SYSTEM"), makeSymbol("BACKEND"), makeSymbol("FEATURES"), list(makeSymbol("SECURITY-LEVEL"), makeKeyword("NONE")), makeSymbol("INPUT-DIRECTORY"), makeSymbol("OUTPUT-DIRECTORY"), makeSymbol("SYSTEM-MANIFEST"));
  public static final SubLList $list68 = list(makeKeyword("SYSTEM"), makeKeyword("BACKEND"), makeKeyword("FEATURES"), makeKeyword("SECURITY-LEVEL"), makeKeyword("INPUT-DIRECTORY"), makeKeyword("OUTPUT-DIRECTORY"), makeKeyword("SYSTEM-MANIFEST"));
  public static final SubLSymbol $kw69$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw70$SECURITY_LEVEL = makeKeyword("SECURITY-LEVEL");
  public static final SubLSymbol $kw71$SYSTEM_MANIFEST = makeKeyword("SYSTEM-MANIFEST");
  public static final SubLList $list72 = list(makeSymbol("MODULE-PATH"), makeSymbol("MODULE"), makeSymbol("MODULE-FEATURES"));
  public static final SubLString $str73$lisp = makeString("lisp");
  public static final SubLSymbol $kw74$SL2C = makeKeyword("SL2C");
  public static final SubLList $list75 = list(makeString("SUBLISP"));
  public static final SubLSymbol $kw76$SL2JAVA = makeKeyword("SL2JAVA");
  public static final SubLString $str77$c = makeString("c");
  public static final SubLString $str78$java = makeString("java");
  public static final SubLString $str79$Time_to_specify_the_output_file_e = makeString("Time to specify the output file extension for backend ~S");
  public static final SubLString $str80$Time_to_specify_the_output_module = makeString("Time to specify the output module filename for backend ~S");
  public static final SubLString $str81$module_4__0D = makeString("module~4,'0D");
  public static final SubLList $list82 = list(list(makeSymbol("NAME"), makeSymbol("FORMAT-CONTROL"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym83$DONE = makeUninternedSymbol("DONE");
  public static final SubLSymbol $sym84$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym85$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym86$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym87$WITH_SIMPLE_RESTART = makeSymbol("WITH-SIMPLE-RESTART");
  public static final SubLSymbol $sym88$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list89 = list(T);
  public static final SubLString $str90$__Translating__A_to_backend__S_wi = makeString("~%Translating ~A to backend ~S with features :~%  ~S ");
  public static final SubLString $str91$__Pass_1___Populating_XREF_databa = makeString("~%Pass 1 : Populating XREF database");
  public static final SubLString $str92$Scanning_modules = makeString("Scanning modules");
  public static final SubLString $str93$__Pass_2___Translating = makeString("~%Pass 2 : Translating");
  public static final SubLSymbol $sym94$SKIP = makeSymbol("SKIP");
  public static final SubLString $str95$Skip__S = makeString("Skip ~S");
  public static final SubLSymbol $sym96$RETRANSLATE = makeSymbol("RETRANSLATE");
  public static final SubLString $str97$Retranslate__S = makeString("Retranslate ~S");
  public static final SubLString $str98$___Starting__A_ = makeString("~%[Starting ~A]");
  public static final SubLString $str99$_dev_null = makeString("/dev/null");
  public static final SubLString $str100$backend__S_is_not_yet_supported = makeString("backend ~S is not yet supported");
  public static final SubLString $str101$___Finished__A_ = makeString("~%[Finished ~A]");
  public static final SubLString $str102$The_manifest_file__S_is_not_avail = makeString("The manifest file ~S is not available.");
  public static final SubLSymbol $kw103$INPUT = makeKeyword("INPUT");
  public static final SubLString $str104$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $sym105$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLSymbol $kw106$EOF = makeKeyword("EOF");
  public static final SubLList $list107 = list(list(makeSymbol("MANIFEST-SYSTEM-VAR"), makeSymbol("MANIFEST")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym108$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $kw109$DIRECTORY = makeKeyword("DIRECTORY");
  public static final SubLString $str110$system_manifest_lisp = makeString("system-manifest.lisp");
  public static final SubLSymbol $kw111$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLSymbol $sym112$STREAMP = makeSymbol("STREAMP");
  public static final SubLString $str113$________Mode__LISP__Package__SUBL = makeString(";;; -*- Mode: LISP; Package: SUBLISP -*-");
  public static final SubLList $list114 = list(makeString("SUBLISP"), makeString("CYCL"));
  public static final SubLString $str115$_ = makeString("(");
  public static final SubLString $str116$_system__S = makeString(":system ~S");
  public static final SubLString $str117$____ = makeString("~% (");
  public static final SubLString $str118$_____directory__S = makeString("~%  :directory ~S");
  public static final SubLString $str119$_____package____S = makeString("~%  :package   ~S");
  public static final SubLString $str120$_____required_systems_ = makeString("~%  :required-systems ");
  public static final SubLString $str121$_ = makeString(" ");
  public static final SubLString $str122$_S = makeString("~S");
  public static final SubLString $str123$_ = makeString(")");
  public static final SubLString $str124$____ = makeString("~% )");
  public static final SubLList $list125 = list(makeSymbol("MODULE"), makeSymbol("&KEY"), makeSymbol("DIRECTORY"), makeSymbol("FEATURES"));
  public static final SubLList $list126 = list(makeKeyword("DIRECTORY"), makeKeyword("FEATURES"));
  public static final SubLString $str127$_____S = makeString("~% (~S");
  public static final SubLString $str128$__directory__S = makeString(" :directory ~S");
  public static final SubLString $str129$__features__S = makeString(" :features ~S");
  public static final SubLString $str130$___ = makeString("~%)");
  public static final SubLString $str131$TRANSLATOR_SYSTEM_DIRECTORY_is_un = makeString("TRANSLATOR-SYSTEM-DIRECTORY is unimplemented");
  public static final SubLString $str132$TRANSLATOR_SYSTEM_PACKAGE_is_unim = makeString("TRANSLATOR-SYSTEM-PACKAGE is unimplemented");
  public static final SubLString $str133$TRANSLATOR_SYSTEM_REQUIRED_SYSTEM = makeString("TRANSLATOR-SYSTEM-REQUIRED-SYSTEMS is unimplemented");
  public static final SubLString $str134$TRANSLATOR_SYSTEM_MODULES_is_unim = makeString("TRANSLATOR-SYSTEM-MODULES is unimplemented");
  public static final SubLString $str135$TRANSLATOR_SYSTEM_MODULE_DIRECTOR = makeString("TRANSLATOR-SYSTEM-MODULE-DIRECTORY is unimplemented");
  public static final SubLString $str136$TRANSLATOR_SYSTEM_MODULE_FEATURES = makeString("TRANSLATOR-SYSTEM-MODULE-FEATURES is unimplemented");
  public static final SubLString $str137$SUBLISP = makeString("SUBLISP");
  public static final SubLString $str138$translation_secure_id_database_fi = makeString("translation-secure-id-database-file.cfasl");
  public static final SubLSymbol $sym139$CAR = makeSymbol("CAR");
  public static final SubLList $list140 = list(makeSymbol("MODULE-PATH"), makeSymbol("MODULES"));
  public static final SubLSymbol $sym141$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str142$Unsupported_backend____S = makeString("Unsupported backend : ~S");

  //// Initializers

  public void declareFunctions() {
    declare_system_translation_file();
  }

  public void initializeVariables() {
    init_system_translation_file();
  }

  public void runTopLevelForms() {
    setup_system_translation_file();
  }

}
