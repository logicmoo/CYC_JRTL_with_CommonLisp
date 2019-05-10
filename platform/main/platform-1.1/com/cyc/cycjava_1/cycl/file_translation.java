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

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;

 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_translation;
//dm import com.cyc.cycjava_1.cycl.xref_database;

public  final class file_translation extends SubLTranslatedFile {

  //// Constructor

  private file_translation() {}
  public static final SubLFile me = new file_translation();
  public static final String myName = "com.cyc.cycjava_1.cycl.file_translation";

  //// Definitions

  @SubL(source = "cycl/file-translation.lisp", position = 1006) 
  public static SubLSymbol $current_ts_file$ = null;

  public static final class $trans_subl_file_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $module_name; }
    public SubLObject getField3() { return $filename; }
    public SubLObject getField4() { return $internal_constants; }
    public SubLObject getField5() { return $referenced_globals; }
    public SubLObject getField6() { return $referenced_functions; }
    public SubLObject getField7() { return $definitions; }
    public SubLObject getField8() { return $top_level_forms; }
    public SubLObject getField9() { return $defined_globals; }
    public SubLObject getField10() { return $defined_functions; }
    public SubLObject getField11() { return $defined_macros; }
    public SubLObject getField12() { return $arglist_table; }
    public SubLObject getField13() { return $binding_type_table; }
    public SubLObject getField14() { return $method_visibility_table; }
    public SubLObject getField15() { return $global_visibility_table; }
    public SubLObject getField16() { return $rwbc_methods; }
    public SubLObject setField2(SubLObject value) { return $module_name = value; }
    public SubLObject setField3(SubLObject value) { return $filename = value; }
    public SubLObject setField4(SubLObject value) { return $internal_constants = value; }
    public SubLObject setField5(SubLObject value) { return $referenced_globals = value; }
    public SubLObject setField6(SubLObject value) { return $referenced_functions = value; }
    public SubLObject setField7(SubLObject value) { return $definitions = value; }
    public SubLObject setField8(SubLObject value) { return $top_level_forms = value; }
    public SubLObject setField9(SubLObject value) { return $defined_globals = value; }
    public SubLObject setField10(SubLObject value) { return $defined_functions = value; }
    public SubLObject setField11(SubLObject value) { return $defined_macros = value; }
    public SubLObject setField12(SubLObject value) { return $arglist_table = value; }
    public SubLObject setField13(SubLObject value) { return $binding_type_table = value; }
    public SubLObject setField14(SubLObject value) { return $method_visibility_table = value; }
    public SubLObject setField15(SubLObject value) { return $global_visibility_table = value; }
    public SubLObject setField16(SubLObject value) { return $rwbc_methods = value; }
    public SubLObject $module_name = NIL;
    public SubLObject $filename = NIL;
    public SubLObject $internal_constants = NIL;
    public SubLObject $referenced_globals = NIL;
    public SubLObject $referenced_functions = NIL;
    public SubLObject $definitions = NIL;
    public SubLObject $top_level_forms = NIL;
    public SubLObject $defined_globals = NIL;
    public SubLObject $defined_functions = NIL;
    public SubLObject $defined_macros = NIL;
    public SubLObject $arglist_table = NIL;
    public SubLObject $binding_type_table = NIL;
    public SubLObject $method_visibility_table = NIL;
    public SubLObject $global_visibility_table = NIL;
    public SubLObject $rwbc_methods = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($trans_subl_file_native.class, $sym0$TRANS_SUBL_FILE, $sym1$TRANS_SUBL_FILE_P, $list2, $list3, new String[] {"$module_name", "$filename", "$internal_constants", "$referenced_globals", "$referenced_functions", "$definitions", "$top_level_forms", "$defined_globals", "$defined_functions", "$defined_macros", "$arglist_table", "$binding_type_table", "$method_visibility_table", "$global_visibility_table", "$rwbc_methods"}, $list4, $list5, $sym6$PRINT_TRANS_SUBL_FILE);
  }

  @SubL(source = "cycl/file-translation.lisp", position = 1580) 
  public static SubLSymbol $dtp_trans_subl_file$ = null;

  @SubL(source = "cycl/file-translation.lisp", position = 1580) 
  public static final SubLObject trans_subl_file_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29304");
    return NIL;
  }

  public static final class $trans_subl_file_p$UnaryFunction extends UnaryFunction {
    public $trans_subl_file_p$UnaryFunction() { super(extractFunctionNamed("TRANS-SUBL-FILE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29305"); }
  }

  @SubL(source = "cycl/file-translation.lisp", position = 3390) 
  public static final SubLObject sxhash_trans_subl_file_method(SubLObject object) {
    return Sxhash.sxhash(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29327"));
  }

  @SubL(source = "cycl/file-translation.lisp", position = 9472) 
  private static SubLSymbol $trans_subl_global_definers$ = null;

  @SubL(source = "cycl/file-translation.lisp", position = 26548) 
  private static SubLSymbol $predefined_constants$ = null;

  public static final SubLObject declare_file_translation_file() {
    declareFunction(myName, "current_ts_file", "CURRENT-TS-FILE", 0, 0, false);
    declareFunction(myName, "trans_subl_file_print_function_trampoline", "TRANS-SUBL-FILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "trans_subl_file_p", "TRANS-SUBL-FILE-P", 1, 0, false); new $trans_subl_file_p$UnaryFunction();
    declareFunction(myName, "tsf_module_name", "TSF-MODULE-NAME", 1, 0, false);
    declareFunction(myName, "tsf_filename", "TSF-FILENAME", 1, 0, false);
    declareFunction(myName, "tsf_internal_constants", "TSF-INTERNAL-CONSTANTS", 1, 0, false);
    declareFunction(myName, "tsf_referenced_globals", "TSF-REFERENCED-GLOBALS", 1, 0, false);
    declareFunction(myName, "tsf_referenced_functions", "TSF-REFERENCED-FUNCTIONS", 1, 0, false);
    declareFunction(myName, "tsf_definitions", "TSF-DEFINITIONS", 1, 0, false);
    declareFunction(myName, "tsf_top_level_forms", "TSF-TOP-LEVEL-FORMS", 1, 0, false);
    declareFunction(myName, "tsf_defined_globals", "TSF-DEFINED-GLOBALS", 1, 0, false);
    declareFunction(myName, "tsf_defined_functions", "TSF-DEFINED-FUNCTIONS", 1, 0, false);
    declareFunction(myName, "tsf_defined_macros", "TSF-DEFINED-MACROS", 1, 0, false);
    declareFunction(myName, "tsf_arglist_table", "TSF-ARGLIST-TABLE", 1, 0, false);
    declareFunction(myName, "tsf_binding_type_table", "TSF-BINDING-TYPE-TABLE", 1, 0, false);
    declareFunction(myName, "tsf_method_visibility_table", "TSF-METHOD-VISIBILITY-TABLE", 1, 0, false);
    declareFunction(myName, "tsf_global_visibility_table", "TSF-GLOBAL-VISIBILITY-TABLE", 1, 0, false);
    declareFunction(myName, "tsf_rwbc_methods", "TSF-RWBC-METHODS", 1, 0, false);
    declareFunction(myName, "_csetf_tsf_module_name", "_CSETF-TSF-MODULE-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_filename", "_CSETF-TSF-FILENAME", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_internal_constants", "_CSETF-TSF-INTERNAL-CONSTANTS", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_referenced_globals", "_CSETF-TSF-REFERENCED-GLOBALS", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_referenced_functions", "_CSETF-TSF-REFERENCED-FUNCTIONS", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_definitions", "_CSETF-TSF-DEFINITIONS", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_top_level_forms", "_CSETF-TSF-TOP-LEVEL-FORMS", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_defined_globals", "_CSETF-TSF-DEFINED-GLOBALS", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_defined_functions", "_CSETF-TSF-DEFINED-FUNCTIONS", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_defined_macros", "_CSETF-TSF-DEFINED-MACROS", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_arglist_table", "_CSETF-TSF-ARGLIST-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_binding_type_table", "_CSETF-TSF-BINDING-TYPE-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_method_visibility_table", "_CSETF-TSF-METHOD-VISIBILITY-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_global_visibility_table", "_CSETF-TSF-GLOBAL-VISIBILITY-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_tsf_rwbc_methods", "_CSETF-TSF-RWBC-METHODS", 2, 0, false);
    declareFunction(myName, "make_trans_subl_file", "MAKE-TRANS-SUBL-FILE", 0, 1, false);
    declareFunction(myName, "print_trans_subl_file", "PRINT-TRANS-SUBL-FILE", 3, 0, false);
    declareFunction(myName, "sxhash_trans_subl_file_method", "SXHASH-TRANS-SUBL-FILE-METHOD", 1, 0, false);
    declareFunction(myName, "new_ts_file", "NEW-TS-FILE", 2, 0, false);
    declareFunction(myName, "destroy_trans_subl_file", "DESTROY-TRANS-SUBL-FILE", 1, 0, false);
    declareFunction(myName, "ts_file_module_name", "TS-FILE-MODULE-NAME", 1, 0, false);
    declareFunction(myName, "ts_file_filename", "TS-FILE-FILENAME", 1, 0, false);
    declareFunction(myName, "ts_file_definitions", "TS-FILE-DEFINITIONS", 1, 0, false);
    declareFunction(myName, "ts_file_internal_constant_count", "TS-FILE-INTERNAL-CONSTANT-COUNT", 1, 0, false);
    declareFunction(myName, "ts_file_next_internal_constant_id", "TS-FILE-NEXT-INTERNAL-CONSTANT-ID", 1, 0, false);
    declareFunction(myName, "ts_file_internal_constants_info", "TS-FILE-INTERNAL-CONSTANTS-INFO", 1, 0, false);
    declareFunction(myName, "ts_file_all_referenced_globals", "TS-FILE-ALL-REFERENCED-GLOBALS", 1, 0, false);
    declareFunction(myName, "ts_file_all_defined_globals", "TS-FILE-ALL-DEFINED-GLOBALS", 1, 0, false);
    declareFunction(myName, "ts_file_all_referenced_functions", "TS-FILE-ALL-REFERENCED-FUNCTIONS", 1, 0, false);
    declareFunction(myName, "ts_file_all_defined_functions", "TS-FILE-ALL-DEFINED-FUNCTIONS", 1, 0, false);
    declareFunction(myName, "ts_file_all_defined_private_functions", "TS-FILE-ALL-DEFINED-PRIVATE-FUNCTIONS", 1, 0, false);
    declareFunction(myName, "ts_file_function_arglist", "TS-FILE-FUNCTION-ARGLIST", 2, 0, false);
    declareFunction(myName, "current_ts_file_defined_function_arglist", "CURRENT-TS-FILE-DEFINED-FUNCTION-ARGLIST", 1, 0, false);
    declareFunction(myName, "ts_file_defined_global_binding_type", "TS-FILE-DEFINED-GLOBAL-BINDING-TYPE", 2, 0, false);
    declareFunction(myName, "ts_file_global_binding_type", "TS-FILE-GLOBAL-BINDING-TYPE", 2, 0, false);
    declareFunction(myName, "current_ts_file_global_binding_type", "CURRENT-TS-FILE-GLOBAL-BINDING-TYPE", 1, 0, false);
    declareFunction(myName, "ts_file_defined_method_visibility", "TS-FILE-DEFINED-METHOD-VISIBILITY", 2, 0, false);
    declareFunction(myName, "ts_file_defined_private_method_p", "TS-FILE-DEFINED-PRIVATE-METHOD-P", 2, 0, false);
    declareFunction(myName, "current_ts_file_defined_private_method_p", "CURRENT-TS-FILE-DEFINED-PRIVATE-METHOD-P", 1, 0, false);
    declareFunction(myName, "ts_file_defined_global_visibility", "TS-FILE-DEFINED-GLOBAL-VISIBILITY", 2, 0, false);
    declareFunction(myName, "ts_file_defined_private_global_p", "TS-FILE-DEFINED-PRIVATE-GLOBAL-P", 2, 0, false);
    declareFunction(myName, "current_ts_file_defined_private_global_p", "CURRENT-TS-FILE-DEFINED-PRIVATE-GLOBAL-P", 1, 0, false);
    declareFunction(myName, "ts_file_private_global_definition_p", "TS-FILE-PRIVATE-GLOBAL-DEFINITION-P", 2, 0, false);
    declareFunction(myName, "ts_file_private_global_definitions", "TS-FILE-PRIVATE-GLOBAL-DEFINITIONS", 1, 0, false);
    declareFunction(myName, "ts_file_method_returns_within_binding_constructP", "TS-FILE-METHOD-RETURNS-WITHIN-BINDING-CONSTRUCT?", 2, 0, false);
    declareFunction(myName, "ts_file_internal_constant_id_lookup", "TS-FILE-INTERNAL-CONSTANT-ID-LOOKUP", 2, 0, false);
    declareFunction(myName, "ts_file_note_function_definition", "TS-FILE-NOTE-FUNCTION-DEFINITION", 3, 0, false);
    declareFunction(myName, "ts_file_note_macro_definition", "TS-FILE-NOTE-MACRO-DEFINITION", 3, 0, false);
    declareFunction(myName, "ts_file_note_global_definition", "TS-FILE-NOTE-GLOBAL-DEFINITION", 3, 0, false);
    declareFunction(myName, "ts_file_note_class_definition", "TS-FILE-NOTE-CLASS-DEFINITION", 3, 0, false);
    declareFunction(myName, "ts_file_note_top_level_form", "TS-FILE-NOTE-TOP-LEVEL-FORM", 2, 0, false);
    declareMacro(myName, "with_translator_output_file", "WITH-TRANSLATOR-OUTPUT-FILE");
    declareFunction(myName, "possibly_delete_file", "POSSIBLY-DELETE-FILE", 1, 0, false);
    declareFunction(myName, "show_trans_subl_file", "SHOW-TRANS-SUBL-FILE", 1, 1, false);
    declareFunction(myName, "print_subl_expression", "PRINT-SUBL-EXPRESSION", 1, 2, false);
    declareFunction(myName, "function_signature_info", "FUNCTION-SIGNATURE-INFO", 1, 0, false);
    declareFunction(myName, "function_arglist_signature_info", "FUNCTION-ARGLIST-SIGNATURE-INFO", 1, 0, false);
    declareFunction(myName, "tsf_possibly_convert_internal_constant", "TSF-POSSIBLY-CONVERT-INTERNAL-CONSTANT", 1, 0, false);
    declareFunction(myName, "tsf_possibly_note_referenced_global", "TSF-POSSIBLY-NOTE-REFERENCED-GLOBAL", 1, 0, false);
    declareFunction(myName, "tsf_possibly_note_referenced_function", "TSF-POSSIBLY-NOTE-REFERENCED-FUNCTION", 1, 0, false);
    declareFunction(myName, "tsf_possibly_note_defined_function_arglist", "TSF-POSSIBLY-NOTE-DEFINED-FUNCTION-ARGLIST", 2, 0, false);
    declareFunction(myName, "tsf_possibly_note_defined_global_binding_type", "TSF-POSSIBLY-NOTE-DEFINED-GLOBAL-BINDING-TYPE", 2, 0, false);
    declareFunction(myName, "tsf_possibly_note_defined_method_visibility", "TSF-POSSIBLY-NOTE-DEFINED-METHOD-VISIBILITY", 2, 0, false);
    declareFunction(myName, "tsf_possibly_note_defined_global_visibility", "TSF-POSSIBLY-NOTE-DEFINED-GLOBAL-VISIBILITY", 2, 0, false);
    declareFunction(myName, "tsf_possibly_note_method_returns_within_binding_construct", "TSF-POSSIBLY-NOTE-METHOD-RETURNS-WITHIN-BINDING-CONSTRUCT", 1, 0, false);
    declareFunction(myName, "translate_file", "TRANSLATE-FILE", 2, 0, false);
    declareFunction(myName, "ts_file_translate_form", "TS-FILE-TRANSLATE-FORM", 2, 0, false);
    declareFunction(myName, "handle_file_form", "HANDLE-FILE-FORM", 2, 0, false);
    declareFunction(myName, "finalize_ts_file", "FINALIZE-TS-FILE", 1, 0, false);
    declareFunction(myName, "ts_file_compute_initialization_methods", "TS-FILE-COMPUTE-INITIALIZATION-METHODS", 1, 0, false);
    declareFunction(myName, "ts_file_declare_method", "TS-FILE-DECLARE-METHOD", 1, 0, false);
    declareFunction(myName, "ts_file_init_method", "TS-FILE-INIT-METHOD", 1, 0, false);
    declareFunction(myName, "ts_file_setup_method", "TS-FILE-SETUP-METHOD", 1, 0, false);
    declareFunction(myName, "current_ts_file_initializerP", "CURRENT-TS-FILE-INITIALIZER?", 1, 0, false);
    declareFunction(myName, "translate_constant_initialization_form", "TRANSLATE-CONSTANT-INITIALIZATION-FORM", 1, 0, false);
    declareFunction(myName, "translator_symbol_for_function", "TRANSLATOR-SYMBOL-FOR-FUNCTION", 1, 0, false);
    declareFunction(myName, "predefined_constant_p", "PREDEFINED-CONSTANT-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_file_translation_file() {
    $current_ts_file$ = defparameter("*CURRENT-TS-FILE*", NIL);
    $dtp_trans_subl_file$ = defconstant("*DTP-TRANS-SUBL-FILE*", $sym0$TRANS_SUBL_FILE);
    $trans_subl_global_definers$ = deflexical("*TRANS-SUBL-GLOBAL-DEFINERS*", $list67);
    $predefined_constants$ = deflexical("*PREDEFINED-CONSTANTS*", $list127);
    return NIL;
  }

  public static final SubLObject setup_file_translation_file() {
    // CVS_ID("Id: file-translation.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), Symbols.symbol_function($sym7$TRANS_SUBL_FILE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$TSF_MODULE_NAME, $sym9$_CSETF_TSF_MODULE_NAME);
    Structures.def_csetf($sym10$TSF_FILENAME, $sym11$_CSETF_TSF_FILENAME);
    Structures.def_csetf($sym12$TSF_INTERNAL_CONSTANTS, $sym13$_CSETF_TSF_INTERNAL_CONSTANTS);
    Structures.def_csetf($sym14$TSF_REFERENCED_GLOBALS, $sym15$_CSETF_TSF_REFERENCED_GLOBALS);
    Structures.def_csetf($sym16$TSF_REFERENCED_FUNCTIONS, $sym17$_CSETF_TSF_REFERENCED_FUNCTIONS);
    Structures.def_csetf($sym18$TSF_DEFINITIONS, $sym19$_CSETF_TSF_DEFINITIONS);
    Structures.def_csetf($sym20$TSF_TOP_LEVEL_FORMS, $sym21$_CSETF_TSF_TOP_LEVEL_FORMS);
    Structures.def_csetf($sym22$TSF_DEFINED_GLOBALS, $sym23$_CSETF_TSF_DEFINED_GLOBALS);
    Structures.def_csetf($sym24$TSF_DEFINED_FUNCTIONS, $sym25$_CSETF_TSF_DEFINED_FUNCTIONS);
    Structures.def_csetf($sym26$TSF_DEFINED_MACROS, $sym27$_CSETF_TSF_DEFINED_MACROS);
    Structures.def_csetf($sym28$TSF_ARGLIST_TABLE, $sym29$_CSETF_TSF_ARGLIST_TABLE);
    Structures.def_csetf($sym30$TSF_BINDING_TYPE_TABLE, $sym31$_CSETF_TSF_BINDING_TYPE_TABLE);
    Structures.def_csetf($sym32$TSF_METHOD_VISIBILITY_TABLE, $sym33$_CSETF_TSF_METHOD_VISIBILITY_TABLE);
    Structures.def_csetf($sym34$TSF_GLOBAL_VISIBILITY_TABLE, $sym35$_CSETF_TSF_GLOBAL_VISIBILITY_TABLE);
    Structures.def_csetf($sym36$TSF_RWBC_METHODS, $sym37$_CSETF_TSF_RWBC_METHODS);
    Equality.identity($sym0$TRANS_SUBL_FILE);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_trans_subl_file$.getGlobalValue(), Symbols.symbol_function($sym57$SXHASH_TRANS_SUBL_FILE_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$TRANS_SUBL_FILE = makeSymbol("TRANS-SUBL-FILE");
  public static final SubLSymbol $sym1$TRANS_SUBL_FILE_P = makeSymbol("TRANS-SUBL-FILE-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("MODULE-NAME"), makeSymbol("FILENAME"), makeSymbol("INTERNAL-CONSTANTS"), makeSymbol("REFERENCED-GLOBALS"), makeSymbol("REFERENCED-FUNCTIONS"), makeSymbol("DEFINITIONS"), makeSymbol("TOP-LEVEL-FORMS"), makeSymbol("DEFINED-GLOBALS"), makeSymbol("DEFINED-FUNCTIONS"), makeSymbol("DEFINED-MACROS"), makeSymbol("ARGLIST-TABLE"), makeSymbol("BINDING-TYPE-TABLE"), makeSymbol("METHOD-VISIBILITY-TABLE"), makeSymbol("GLOBAL-VISIBILITY-TABLE"), makeSymbol("RWBC-METHODS")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("MODULE-NAME"), makeKeyword("FILENAME"), makeKeyword("INTERNAL-CONSTANTS"), makeKeyword("REFERENCED-GLOBALS"), makeKeyword("REFERENCED-FUNCTIONS"), makeKeyword("DEFINITIONS"), makeKeyword("TOP-LEVEL-FORMS"), makeKeyword("DEFINED-GLOBALS"), makeKeyword("DEFINED-FUNCTIONS"), makeKeyword("DEFINED-MACROS"), makeKeyword("ARGLIST-TABLE"), makeKeyword("BINDING-TYPE-TABLE"), makeKeyword("METHOD-VISIBILITY-TABLE"), makeKeyword("GLOBAL-VISIBILITY-TABLE"), makeKeyword("RWBC-METHODS")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("TSF-MODULE-NAME"), makeSymbol("TSF-FILENAME"), makeSymbol("TSF-INTERNAL-CONSTANTS"), makeSymbol("TSF-REFERENCED-GLOBALS"), makeSymbol("TSF-REFERENCED-FUNCTIONS"), makeSymbol("TSF-DEFINITIONS"), makeSymbol("TSF-TOP-LEVEL-FORMS"), makeSymbol("TSF-DEFINED-GLOBALS"), makeSymbol("TSF-DEFINED-FUNCTIONS"), makeSymbol("TSF-DEFINED-MACROS"), makeSymbol("TSF-ARGLIST-TABLE"), makeSymbol("TSF-BINDING-TYPE-TABLE"), makeSymbol("TSF-METHOD-VISIBILITY-TABLE"), makeSymbol("TSF-GLOBAL-VISIBILITY-TABLE"), makeSymbol("TSF-RWBC-METHODS")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-TSF-MODULE-NAME"), makeSymbol("_CSETF-TSF-FILENAME"), makeSymbol("_CSETF-TSF-INTERNAL-CONSTANTS"), makeSymbol("_CSETF-TSF-REFERENCED-GLOBALS"), makeSymbol("_CSETF-TSF-REFERENCED-FUNCTIONS"), makeSymbol("_CSETF-TSF-DEFINITIONS"), makeSymbol("_CSETF-TSF-TOP-LEVEL-FORMS"), makeSymbol("_CSETF-TSF-DEFINED-GLOBALS"), makeSymbol("_CSETF-TSF-DEFINED-FUNCTIONS"), makeSymbol("_CSETF-TSF-DEFINED-MACROS"), makeSymbol("_CSETF-TSF-ARGLIST-TABLE"), makeSymbol("_CSETF-TSF-BINDING-TYPE-TABLE"), makeSymbol("_CSETF-TSF-METHOD-VISIBILITY-TABLE"), makeSymbol("_CSETF-TSF-GLOBAL-VISIBILITY-TABLE"), makeSymbol("_CSETF-TSF-RWBC-METHODS")});
  public static final SubLSymbol $sym6$PRINT_TRANS_SUBL_FILE = makeSymbol("PRINT-TRANS-SUBL-FILE");
  public static final SubLSymbol $sym7$TRANS_SUBL_FILE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANS-SUBL-FILE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$TSF_MODULE_NAME = makeSymbol("TSF-MODULE-NAME");
  public static final SubLSymbol $sym9$_CSETF_TSF_MODULE_NAME = makeSymbol("_CSETF-TSF-MODULE-NAME");
  public static final SubLSymbol $sym10$TSF_FILENAME = makeSymbol("TSF-FILENAME");
  public static final SubLSymbol $sym11$_CSETF_TSF_FILENAME = makeSymbol("_CSETF-TSF-FILENAME");
  public static final SubLSymbol $sym12$TSF_INTERNAL_CONSTANTS = makeSymbol("TSF-INTERNAL-CONSTANTS");
  public static final SubLSymbol $sym13$_CSETF_TSF_INTERNAL_CONSTANTS = makeSymbol("_CSETF-TSF-INTERNAL-CONSTANTS");
  public static final SubLSymbol $sym14$TSF_REFERENCED_GLOBALS = makeSymbol("TSF-REFERENCED-GLOBALS");
  public static final SubLSymbol $sym15$_CSETF_TSF_REFERENCED_GLOBALS = makeSymbol("_CSETF-TSF-REFERENCED-GLOBALS");
  public static final SubLSymbol $sym16$TSF_REFERENCED_FUNCTIONS = makeSymbol("TSF-REFERENCED-FUNCTIONS");
  public static final SubLSymbol $sym17$_CSETF_TSF_REFERENCED_FUNCTIONS = makeSymbol("_CSETF-TSF-REFERENCED-FUNCTIONS");
  public static final SubLSymbol $sym18$TSF_DEFINITIONS = makeSymbol("TSF-DEFINITIONS");
  public static final SubLSymbol $sym19$_CSETF_TSF_DEFINITIONS = makeSymbol("_CSETF-TSF-DEFINITIONS");
  public static final SubLSymbol $sym20$TSF_TOP_LEVEL_FORMS = makeSymbol("TSF-TOP-LEVEL-FORMS");
  public static final SubLSymbol $sym21$_CSETF_TSF_TOP_LEVEL_FORMS = makeSymbol("_CSETF-TSF-TOP-LEVEL-FORMS");
  public static final SubLSymbol $sym22$TSF_DEFINED_GLOBALS = makeSymbol("TSF-DEFINED-GLOBALS");
  public static final SubLSymbol $sym23$_CSETF_TSF_DEFINED_GLOBALS = makeSymbol("_CSETF-TSF-DEFINED-GLOBALS");
  public static final SubLSymbol $sym24$TSF_DEFINED_FUNCTIONS = makeSymbol("TSF-DEFINED-FUNCTIONS");
  public static final SubLSymbol $sym25$_CSETF_TSF_DEFINED_FUNCTIONS = makeSymbol("_CSETF-TSF-DEFINED-FUNCTIONS");
  public static final SubLSymbol $sym26$TSF_DEFINED_MACROS = makeSymbol("TSF-DEFINED-MACROS");
  public static final SubLSymbol $sym27$_CSETF_TSF_DEFINED_MACROS = makeSymbol("_CSETF-TSF-DEFINED-MACROS");
  public static final SubLSymbol $sym28$TSF_ARGLIST_TABLE = makeSymbol("TSF-ARGLIST-TABLE");
  public static final SubLSymbol $sym29$_CSETF_TSF_ARGLIST_TABLE = makeSymbol("_CSETF-TSF-ARGLIST-TABLE");
  public static final SubLSymbol $sym30$TSF_BINDING_TYPE_TABLE = makeSymbol("TSF-BINDING-TYPE-TABLE");
  public static final SubLSymbol $sym31$_CSETF_TSF_BINDING_TYPE_TABLE = makeSymbol("_CSETF-TSF-BINDING-TYPE-TABLE");
  public static final SubLSymbol $sym32$TSF_METHOD_VISIBILITY_TABLE = makeSymbol("TSF-METHOD-VISIBILITY-TABLE");
  public static final SubLSymbol $sym33$_CSETF_TSF_METHOD_VISIBILITY_TABLE = makeSymbol("_CSETF-TSF-METHOD-VISIBILITY-TABLE");
  public static final SubLSymbol $sym34$TSF_GLOBAL_VISIBILITY_TABLE = makeSymbol("TSF-GLOBAL-VISIBILITY-TABLE");
  public static final SubLSymbol $sym35$_CSETF_TSF_GLOBAL_VISIBILITY_TABLE = makeSymbol("_CSETF-TSF-GLOBAL-VISIBILITY-TABLE");
  public static final SubLSymbol $sym36$TSF_RWBC_METHODS = makeSymbol("TSF-RWBC-METHODS");
  public static final SubLSymbol $sym37$_CSETF_TSF_RWBC_METHODS = makeSymbol("_CSETF-TSF-RWBC-METHODS");
  public static final SubLSymbol $kw38$MODULE_NAME = makeKeyword("MODULE-NAME");
  public static final SubLSymbol $kw39$FILENAME = makeKeyword("FILENAME");
  public static final SubLSymbol $kw40$INTERNAL_CONSTANTS = makeKeyword("INTERNAL-CONSTANTS");
  public static final SubLSymbol $kw41$REFERENCED_GLOBALS = makeKeyword("REFERENCED-GLOBALS");
  public static final SubLSymbol $kw42$REFERENCED_FUNCTIONS = makeKeyword("REFERENCED-FUNCTIONS");
  public static final SubLSymbol $kw43$DEFINITIONS = makeKeyword("DEFINITIONS");
  public static final SubLSymbol $kw44$TOP_LEVEL_FORMS = makeKeyword("TOP-LEVEL-FORMS");
  public static final SubLSymbol $kw45$DEFINED_GLOBALS = makeKeyword("DEFINED-GLOBALS");
  public static final SubLSymbol $kw46$DEFINED_FUNCTIONS = makeKeyword("DEFINED-FUNCTIONS");
  public static final SubLSymbol $kw47$DEFINED_MACROS = makeKeyword("DEFINED-MACROS");
  public static final SubLSymbol $kw48$ARGLIST_TABLE = makeKeyword("ARGLIST-TABLE");
  public static final SubLSymbol $kw49$BINDING_TYPE_TABLE = makeKeyword("BINDING-TYPE-TABLE");
  public static final SubLSymbol $kw50$METHOD_VISIBILITY_TABLE = makeKeyword("METHOD-VISIBILITY-TABLE");
  public static final SubLSymbol $kw51$GLOBAL_VISIBILITY_TABLE = makeKeyword("GLOBAL-VISIBILITY-TABLE");
  public static final SubLSymbol $kw52$RWBC_METHODS = makeKeyword("RWBC-METHODS");
  public static final SubLString $str53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str54$__ = makeString("#<");
  public static final SubLSymbol $kw55$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw56$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym57$SXHASH_TRANS_SUBL_FILE_METHOD = makeSymbol("SXHASH-TRANS-SUBL-FILE-METHOD");
  public static final SubLSymbol $sym58$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw59$FREE = makeKeyword("FREE");
  public static final SubLSymbol $sym60$_ = makeSymbol("<");
  public static final SubLSymbol $sym61$CDR = makeSymbol("CDR");
  public static final SubLSymbol $sym62$STRING_LESSP = makeSymbol("STRING-LESSP");
  public static final SubLSymbol $sym63$SYMBOL_NAME = makeSymbol("SYMBOL-NAME");
  public static final SubLSymbol $kw64$UNSPECIFIED = makeKeyword("UNSPECIFIED");
  public static final SubLSymbol $sym65$PROTECTED = makeSymbol("PROTECTED");
  public static final SubLSymbol $sym66$PRIVATE = makeSymbol("PRIVATE");
  public static final SubLList $list67 = list(makeSymbol("DEFCONSTANT"), makeSymbol("DEFLEXICAL"), makeSymbol("DEFGLOBAL"), makeSymbol("DEFPARAMETER"), makeSymbol("DEFVAR"));
  public static final SubLList $list68 = list(makeSymbol("DEFINER"), makeSymbol("GLOBAL"), makeSymbol("&OPTIONAL"), makeSymbol("INIT-FORM"), makeSymbol("DOCUMENTATION"));
  public static final SubLList $list69 = list(list(makeSymbol("STREAM-VAR"), makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym70$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");
  public static final SubLSymbol $sym71$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym72$WITH_PRIVATE_TEXT_FILE = makeSymbol("WITH-PRIVATE-TEXT-FILE");
  public static final SubLList $list73 = list(makeKeyword("OUTPUT"));
  public static final SubLString $str74$_dev_null = makeString("/dev/null");
  public static final SubLSymbol $kw75$DOWNCASE = makeKeyword("DOWNCASE");
  public static final SubLSymbol $sym76$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLString $str77$___Trans_SubL_File____S = makeString(";; Trans SubL File : ~S");
  public static final SubLString $str78$_____Location___________S = makeString("~%;; Location        : ~S");
  public static final SubLString $str79$_______Referenced_Globals__ = makeString("~%~%;; Referenced Globals :");
  public static final SubLString $str80$_______Referenced_Functions__ = makeString("~%~%;; Referenced Functions :");
  public static final SubLString $str81$_______Internal_Constants__ = makeString("~%~%;; Internal Constants :");
  public static final SubLList $list82 = cons(makeSymbol("CONSTANT"), makeSymbol("INTERNAL-ID"));
  public static final SubLString $str83$___S____S = makeString("~%~S : ~S");
  public static final SubLString $str84$_______Definitions__ = makeString("~%~%;; Definitions :");
  public static final SubLSymbol $sym85$_OPTIONAL = makeSymbol("&OPTIONAL");
  public static final SubLSymbol $sym86$_REST = makeSymbol("&REST");
  public static final SubLSymbol $sym87$_PC = makeSymbol("%PC");
  public static final SubLSymbol $sym88$_IC = makeSymbol("%IC");
  public static final SubLSymbol $sym89$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym90$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym91$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $kw92$INPUT = makeKeyword("INPUT");
  public static final SubLString $str93$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $kw94$EOF = makeKeyword("EOF");
  public static final SubLSymbol $sym95$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym96$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym97$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym98$DEFINE_MACROEXPANDER = makeSymbol("DEFINE-MACROEXPANDER");
  public static final SubLSymbol $sym99$DEFVAR = makeSymbol("DEFVAR");
  public static final SubLSymbol $sym100$DEFPARAMETER = makeSymbol("DEFPARAMETER");
  public static final SubLSymbol $sym101$DEFLEXICAL = makeSymbol("DEFLEXICAL");
  public static final SubLSymbol $sym102$DEFCONSTANT = makeSymbol("DEFCONSTANT");
  public static final SubLSymbol $sym103$_DEFSTRUCT_CLASS = makeSymbol("%DEFSTRUCT-CLASS");
  public static final SubLSymbol $kw104$NAME = makeKeyword("NAME");
  public static final SubLSymbol $sym105$IN_PACKAGE = makeSymbol("IN-PACKAGE");
  public static final SubLList $list106 = cons(makeSymbol("CONSTANT-FORM"), makeSymbol("INTERNAL-ID"));
  public static final SubLSymbol $sym107$_INTERNAL_CONSTANT = makeSymbol("%INTERNAL-CONSTANT");
  public static final SubLList $list108 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"), makeSymbol("&REST"), makeSymbol("REST"));
  public static final SubLSymbol $sym109$_REGISTER_MACRO = makeSymbol("%REGISTER-MACRO");
  public static final SubLList $list110 = list(makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym111$_REGISTER_FUNCTION = makeSymbol("%REGISTER-FUNCTION");
  public static final SubLList $list112 = list(makeSymbol("INITIALIZATION"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));
  public static final SubLSymbol $sym113$_REGISTER_GLOBAL = makeSymbol("%REGISTER-GLOBAL");
  public static final SubLString $str114$DECLARE_ = makeString("DECLARE-");
  public static final SubLString $str115$_FILE = makeString("-FILE");
  public static final SubLSymbol $sym116$RET = makeSymbol("RET");
  public static final SubLString $str117$INIT_ = makeString("INIT-");
  public static final SubLString $str118$SETUP_ = makeString("SETUP-");
  public static final SubLSymbol $sym119$VECTOR = makeSymbol("VECTOR");
  public static final SubLSymbol $sym120$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym121$CONS = makeSymbol("CONS");
  public static final SubLSymbol $sym122$LIST_ = makeSymbol("LIST*");
  public static final SubLSymbol $sym123$SYMBOL_FUNCTION = makeSymbol("SYMBOL-FUNCTION");
  public static final SubLSymbol $sym124$READER_MAKE_CONSTANT_SHELL = makeSymbol("READER-MAKE-CONSTANT-SHELL");
  public static final SubLSymbol $sym125$_LF = makeSymbol("%LF");
  public static final SubLString $str126$Time_to_implement_function_consta = makeString("Time to implement function constant translation for ~S");
  public static final SubLList $list127 = list(new SubLObject[] {T, NIL, EQ, EQL, EQUAL, EQUALP, IDENTITY, MINUS_ONE_INTEGER, ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER, SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, Characters.CHAR_null, Characters.CHAR_backspace, Characters.CHAR_tab, Characters.CHAR_newline, Characters.CHAR_return, Characters.CHAR_page, Characters.CHAR_escape, Characters.CHAR_space, Characters.CHAR_exclamation, Characters.CHAR_quotation, Characters.CHAR_hash, Characters.CHAR_dollar, Characters.CHAR_percent, Characters.CHAR_ampersand, Characters.CHAR_quote, Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_asterisk, Characters.CHAR_plus, Characters.CHAR_comma, Characters.CHAR_hyphen, Characters.CHAR_period, Characters.CHAR_slash, Characters.CHAR_0, Characters.CHAR_1, Characters.CHAR_2, Characters.CHAR_3, Characters.CHAR_4, Characters.CHAR_5, Characters.CHAR_6, Characters.CHAR_7, Characters.CHAR_8, Characters.CHAR_9, Characters.CHAR_colon, Characters.CHAR_semicolon, Characters.CHAR_less, Characters.CHAR_equal, Characters.CHAR_greater, Characters.CHAR_question, Characters.CHAR_at, Characters.CHAR_A, Characters.CHAR_B, Characters.CHAR_C, Characters.CHAR_D, Characters.CHAR_E, Characters.CHAR_F, Characters.CHAR_G, Characters.CHAR_H, Characters.CHAR_I, Characters.CHAR_J, Characters.CHAR_K, Characters.CHAR_L, Characters.CHAR_M, Characters.CHAR_N, Characters.CHAR_O, Characters.CHAR_P, Characters.CHAR_Q, Characters.CHAR_R, Characters.CHAR_S, Characters.CHAR_T, Characters.CHAR_U, Characters.CHAR_V, Characters.CHAR_W, Characters.CHAR_X, Characters.CHAR_Y, Characters.CHAR_Z, Characters.CHAR_lbracket, Characters.CHAR_backslash, Characters.CHAR_rbracket, Characters.CHAR_caret, Characters.CHAR_underbar, Characters.CHAR_backquote, Characters.CHAR_a, Characters.CHAR_b, Characters.CHAR_c, Characters.CHAR_d, Characters.CHAR_e, Characters.CHAR_f, Characters.CHAR_g, Characters.CHAR_h, Characters.CHAR_i, Characters.CHAR_j, Characters.CHAR_k, Characters.CHAR_l, Characters.CHAR_m, Characters.CHAR_n, Characters.CHAR_o, Characters.CHAR_p, Characters.CHAR_q, Characters.CHAR_r, Characters.CHAR_s, Characters.CHAR_t, Characters.CHAR_u, Characters.CHAR_v, Characters.CHAR_w, Characters.CHAR_x, Characters.CHAR_y, Characters.CHAR_z, Characters.CHAR_lbrace, Characters.CHAR_vertical, Characters.CHAR_rbrace, Characters.CHAR_tilde, Characters.CHAR_rubout});

  //// Initializers

  public void declareFunctions() {
    declare_file_translation_file();
  }

  public void initializeVariables() {
    init_file_translation_file();
  }

  public void runTopLevelForms() {
    setup_file_translation_file();
  }

}
