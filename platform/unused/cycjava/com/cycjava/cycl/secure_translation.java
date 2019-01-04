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
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.system_translation;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.xref_database;

public  final class secure_translation extends SubLTranslatedFile {

  //// Constructor

  private secure_translation() {}
  public static final SubLFile me = new secure_translation();
  public static final String myName = "com.cyc.cycjava.cycl.secure_translation";

  //// Definitions

  /** The possible security (obfuscation) levels possible in the translator. */
  @SubL(source = "cycl/secure-translation.lisp", position = 845) 
  private static SubLSymbol $translator_security_levels$ = null;

  public static final class $secure_id_database_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $security_level; }
    public SubLObject getField3() { return $id_module_table; }
    public SubLObject getField4() { return $module_id_table; }
    public SubLObject getField5() { return $id_method_table; }
    public SubLObject getField6() { return $method_id_table; }
    public SubLObject getField7() { return $id_global_table; }
    public SubLObject getField8() { return $global_id_table; }
    public SubLObject getField9() { return $symbol_exceptions; }
    public SubLObject getField10() { return $id_symbol_table; }
    public SubLObject getField11() { return $symbol_id_table; }
    public SubLObject setField2(SubLObject value) { return $security_level = value; }
    public SubLObject setField3(SubLObject value) { return $id_module_table = value; }
    public SubLObject setField4(SubLObject value) { return $module_id_table = value; }
    public SubLObject setField5(SubLObject value) { return $id_method_table = value; }
    public SubLObject setField6(SubLObject value) { return $method_id_table = value; }
    public SubLObject setField7(SubLObject value) { return $id_global_table = value; }
    public SubLObject setField8(SubLObject value) { return $global_id_table = value; }
    public SubLObject setField9(SubLObject value) { return $symbol_exceptions = value; }
    public SubLObject setField10(SubLObject value) { return $id_symbol_table = value; }
    public SubLObject setField11(SubLObject value) { return $symbol_id_table = value; }
    public SubLObject $security_level = NIL;
    public SubLObject $id_module_table = NIL;
    public SubLObject $module_id_table = NIL;
    public SubLObject $id_method_table = NIL;
    public SubLObject $method_id_table = NIL;
    public SubLObject $id_global_table = NIL;
    public SubLObject $global_id_table = NIL;
    public SubLObject $symbol_exceptions = NIL;
    public SubLObject $id_symbol_table = NIL;
    public SubLObject $symbol_id_table = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($secure_id_database_native.class, $sym1$SECURE_ID_DATABASE, $sym2$SECURE_ID_DATABASE_P, $list3, $list4, new String[] {"$security_level", "$id_module_table", "$module_id_table", "$id_method_table", "$method_id_table", "$id_global_table", "$global_id_table", "$symbol_exceptions", "$id_symbol_table", "$symbol_id_table"}, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/secure-translation.lisp", position = 1771) 
  public static SubLSymbol $dtp_secure_id_database$ = null;

  @SubL(source = "cycl/secure-translation.lisp", position = 1771) 
  public static final SubLObject secure_id_database_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $secure_id_database_p$UnaryFunction extends UnaryFunction {
    public $secure_id_database_p$UnaryFunction() { super(extractFunctionNamed("SECURE-ID-DATABASE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32137"); }
  }

  /** The GUID for the serialization type. */
  @SubL(source = "cycl/secure-translation.lisp", position = 9268) 
  private static SubLSymbol $secure_id_database_type_marker$ = null;

  @SubL(source = "cycl/secure-translation.lisp", position = 20065) 
  private static SubLSymbol $misc_symbols_not_to_obfuscate$ = null;

  public static final SubLObject declare_secure_translation_file() {
    declareFunction(myName, "translator_security_level_p", "TRANSLATOR-SECURITY-LEVEL-P", 1, 0, false);
    declareFunction(myName, "secure_id_database_print_function_trampoline", "SECURE-ID-DATABASE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "secure_id_database_p", "SECURE-ID-DATABASE-P", 1, 0, false); new $secure_id_database_p$UnaryFunction();
    declareFunction(myName, "sid_db_security_level", "SID-DB-SECURITY-LEVEL", 1, 0, false);
    declareFunction(myName, "sid_db_id_module_table", "SID-DB-ID-MODULE-TABLE", 1, 0, false);
    declareFunction(myName, "sid_db_module_id_table", "SID-DB-MODULE-ID-TABLE", 1, 0, false);
    declareFunction(myName, "sid_db_id_method_table", "SID-DB-ID-METHOD-TABLE", 1, 0, false);
    declareFunction(myName, "sid_db_method_id_table", "SID-DB-METHOD-ID-TABLE", 1, 0, false);
    declareFunction(myName, "sid_db_id_global_table", "SID-DB-ID-GLOBAL-TABLE", 1, 0, false);
    declareFunction(myName, "sid_db_global_id_table", "SID-DB-GLOBAL-ID-TABLE", 1, 0, false);
    declareFunction(myName, "sid_db_symbol_exceptions", "SID-DB-SYMBOL-EXCEPTIONS", 1, 0, false);
    declareFunction(myName, "sid_db_id_symbol_table", "SID-DB-ID-SYMBOL-TABLE", 1, 0, false);
    declareFunction(myName, "sid_db_symbol_id_table", "SID-DB-SYMBOL-ID-TABLE", 1, 0, false);
    declareFunction(myName, "_csetf_sid_db_security_level", "_CSETF-SID-DB-SECURITY-LEVEL", 2, 0, false);
    declareFunction(myName, "_csetf_sid_db_id_module_table", "_CSETF-SID-DB-ID-MODULE-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_sid_db_module_id_table", "_CSETF-SID-DB-MODULE-ID-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_sid_db_id_method_table", "_CSETF-SID-DB-ID-METHOD-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_sid_db_method_id_table", "_CSETF-SID-DB-METHOD-ID-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_sid_db_id_global_table", "_CSETF-SID-DB-ID-GLOBAL-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_sid_db_global_id_table", "_CSETF-SID-DB-GLOBAL-ID-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_sid_db_symbol_exceptions", "_CSETF-SID-DB-SYMBOL-EXCEPTIONS", 2, 0, false);
    declareFunction(myName, "_csetf_sid_db_id_symbol_table", "_CSETF-SID-DB-ID-SYMBOL-TABLE", 2, 0, false);
    declareFunction(myName, "_csetf_sid_db_symbol_id_table", "_CSETF-SID-DB-SYMBOL-ID-TABLE", 2, 0, false);
    declareFunction(myName, "make_secure_id_database", "MAKE-SECURE-ID-DATABASE", 0, 1, false);
    declareFunction(myName, "new_secure_id_database", "NEW-SECURE-ID-DATABASE", 1, 0, false);
    declareFunction(myName, "set_secure_id_database_slots", "SET-SECURE-ID-DATABASE-SLOTS", 11, 0, false);
    declareFunction(myName, "destroy_secure_id_database", "DESTROY-SECURE-ID-DATABASE", 1, 0, false);
    declareFunction(myName, "secure_id_database_security_level", "SECURE-ID-DATABASE-SECURITY-LEVEL", 1, 0, false);
    declareFunction(myName, "secure_id_database_lookup_module", "SECURE-ID-DATABASE-LOOKUP-MODULE", 2, 0, false);
    declareFunction(myName, "secure_id_database_lookup_method", "SECURE-ID-DATABASE-LOOKUP-METHOD", 2, 0, false);
    declareFunction(myName, "secure_id_database_lookup_global", "SECURE-ID-DATABASE-LOOKUP-GLOBAL", 2, 0, false);
    declareFunction(myName, "secure_id_database_excepted_symbolP", "SECURE-ID-DATABASE-EXCEPTED-SYMBOL?", 2, 0, false);
    declareFunction(myName, "secure_id_database_lookup_symbol", "SECURE-ID-DATABASE-LOOKUP-SYMBOL", 2, 0, false);
    declareFunction(myName, "secure_id_database_symbol_name", "SECURE-ID-DATABASE-SYMBOL-NAME", 2, 0, false);
    declareFunction(myName, "secure_id_database_name_sensitive_symbolP", "SECURE-ID-DATABASE-NAME-SENSITIVE-SYMBOL?", 1, 0, false);
    declareFunction(myName, "sublisp_symbol_p", "SUBLISP-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "save_secure_id_database_to_file", "SAVE-SECURE-ID-DATABASE-TO-FILE", 2, 0, false);
    declareFunction(myName, "save_secure_id_database", "SAVE-SECURE-ID-DATABASE", 2, 0, false);
    declareFunction(myName, "construct_recipe_for_secure_id_database", "CONSTRUCT-RECIPE-FOR-SECURE-ID-DATABASE", 1, 0, false);
    declareFunction(myName, "restore_secure_id_database_from_file", "RESTORE-SECURE-ID-DATABASE-FROM-FILE", 1, 0, false);
    declareFunction(myName, "restore_secure_id_database", "RESTORE-SECURE-ID-DATABASE", 1, 0, false);
    declareFunction(myName, "load_secure_id_database_recipe", "LOAD-SECURE-ID-DATABASE-RECIPE", 1, 0, false);
    declareFunction(myName, "sid_db_recipe_get", "SID-DB-RECIPE-GET", 2, 1, false);
    declareFunction(myName, "interpret_secure_id_database_recipe_by_version", "INTERPRET-SECURE-ID-DATABASE-RECIPE-BY-VERSION", 2, 0, false);
    declareFunction(myName, "interpret_secure_id_database_recipe_v1p0", "INTERPRET-SECURE-ID-DATABASE-RECIPE-V1P0", 1, 0, false);
    declareFunction(myName, "fetch_valid_secure_id_database_table", "FETCH-VALID-SECURE-ID-DATABASE-TABLE", 2, 0, false);
    declareFunction(myName, "secure_id_database_module_id", "SECURE-ID-DATABASE-MODULE-ID", 2, 0, false);
    declareFunction(myName, "secure_id_database_method_id", "SECURE-ID-DATABASE-METHOD-ID", 2, 0, false);
    declareFunction(myName, "secure_id_database_global_id", "SECURE-ID-DATABASE-GLOBAL-ID", 2, 0, false);
    declareFunction(myName, "secure_id_database_symbol_id", "SECURE-ID-DATABASE-SYMBOL-ID", 2, 0, false);
    declareFunction(myName, "secure_id_database_populate_symbol_exceptions", "SECURE-ID-DATABASE-POPULATE-SYMBOL-EXCEPTIONS", 1, 0, false);
    declareFunction(myName, "secure_id_database_note_symbol_exception", "SECURE-ID-DATABASE-NOTE-SYMBOL-EXCEPTION", 2, 0, false);
    declareFunction(myName, "current_system_translation_secure_module_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-MODULE-LOOKUP", 1, 0, false);
    declareFunction(myName, "current_system_translation_secure_method_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-METHOD-LOOKUP", 1, 0, false);
    declareFunction(myName, "current_system_translation_secure_global_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-GLOBAL-LOOKUP", 1, 0, false);
    declareFunction(myName, "current_system_translation_secure_symbol_lookup", "CURRENT-SYSTEM-TRANSLATION-SECURE-SYMBOL-LOOKUP", 1, 0, false);
    declareFunction(myName, "sid_db_symbol_exceptions_add_all", "SID-DB-SYMBOL-EXCEPTIONS-ADD-ALL", 1, 0, false);
    declareFunction(myName, "sid_db_symbol_exceptions_add_for_api", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-API", 1, 0, false);
    declareFunction(myName, "sid_db_symbol_exceptions_add_symbols", "SID-DB-SYMBOL-EXCEPTIONS-ADD-SYMBOLS", 2, 0, false);
    declareFunction(myName, "sid_db_symbol_exceptions_add_for_external", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-EXTERNAL", 1, 0, false);
    declareFunction(myName, "sid_db_symbol_exceptions_add_for_system_parameters", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-SYSTEM-PARAMETERS", 1, 0, false);
    declareFunction(myName, "sid_db_symbol_exceptions_add_for_kb_function_symbols", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-KB-FUNCTION-SYMBOLS", 1, 0, false);
    declareFunction(myName, "sid_db_symbol_exceptions_add_for_misc_symbols", "SID-DB-SYMBOL-EXCEPTIONS-ADD-FOR-MISC-SYMBOLS", 1, 0, false);
    declareFunction(myName, "sid_db_symbol_exceptions_register_and_retranslate_misc", "SID-DB-SYMBOL-EXCEPTIONS-REGISTER-AND-RETRANSLATE-MISC", 0, 1, false);
    return NIL;
  }

  public static final SubLObject init_secure_translation_file() {
    $translator_security_levels$ = deflexical("*TRANSLATOR-SECURITY-LEVELS*", $list0);
    $dtp_secure_id_database$ = defconstant("*DTP-SECURE-ID-DATABASE*", $sym1$SECURE_ID_DATABASE);
    $secure_id_database_type_marker$ = deflexical("*SECURE-ID-DATABASE-TYPE-MARKER*", $str50$c3edef08_eef1_11dd_9624_00219b50e);
    $misc_symbols_not_to_obfuscate$ = deflexical("*MISC-SYMBOLS-NOT-TO-OBFUSCATE*", $list69);
    return NIL;
  }

  public static final SubLObject setup_secure_translation_file() {
    // CVS_ID("Id: secure-translation.lisp 128436 2009-07-28 22:59:45Z goolsbey ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_secure_id_database$.getGlobalValue(), Symbols.symbol_function($sym8$SECURE_ID_DATABASE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$SID_DB_SECURITY_LEVEL, $sym10$_CSETF_SID_DB_SECURITY_LEVEL);
    Structures.def_csetf($sym11$SID_DB_ID_MODULE_TABLE, $sym12$_CSETF_SID_DB_ID_MODULE_TABLE);
    Structures.def_csetf($sym13$SID_DB_MODULE_ID_TABLE, $sym14$_CSETF_SID_DB_MODULE_ID_TABLE);
    Structures.def_csetf($sym15$SID_DB_ID_METHOD_TABLE, $sym16$_CSETF_SID_DB_ID_METHOD_TABLE);
    Structures.def_csetf($sym17$SID_DB_METHOD_ID_TABLE, $sym18$_CSETF_SID_DB_METHOD_ID_TABLE);
    Structures.def_csetf($sym19$SID_DB_ID_GLOBAL_TABLE, $sym20$_CSETF_SID_DB_ID_GLOBAL_TABLE);
    Structures.def_csetf($sym21$SID_DB_GLOBAL_ID_TABLE, $sym22$_CSETF_SID_DB_GLOBAL_ID_TABLE);
    Structures.def_csetf($sym23$SID_DB_SYMBOL_EXCEPTIONS, $sym24$_CSETF_SID_DB_SYMBOL_EXCEPTIONS);
    Structures.def_csetf($sym25$SID_DB_ID_SYMBOL_TABLE, $sym26$_CSETF_SID_DB_ID_SYMBOL_TABLE);
    Structures.def_csetf($sym27$SID_DB_SYMBOL_ID_TABLE, $sym28$_CSETF_SID_DB_SYMBOL_ID_TABLE);
    Equality.identity($sym1$SECURE_ID_DATABASE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("NONE"), makeKeyword("LOW"), makeKeyword("MEDIUM"), makeKeyword("HIGH"));
  public static final SubLSymbol $sym1$SECURE_ID_DATABASE = makeSymbol("SECURE-ID-DATABASE");
  public static final SubLSymbol $sym2$SECURE_ID_DATABASE_P = makeSymbol("SECURE-ID-DATABASE-P");
  public static final SubLList $list3 = list(new SubLObject[] {makeSymbol("SECURITY-LEVEL"), makeSymbol("ID-MODULE-TABLE"), makeSymbol("MODULE-ID-TABLE"), makeSymbol("ID-METHOD-TABLE"), makeSymbol("METHOD-ID-TABLE"), makeSymbol("ID-GLOBAL-TABLE"), makeSymbol("GLOBAL-ID-TABLE"), makeSymbol("SYMBOL-EXCEPTIONS"), makeSymbol("ID-SYMBOL-TABLE"), makeSymbol("SYMBOL-ID-TABLE")});
  public static final SubLList $list4 = list(new SubLObject[] {makeKeyword("SECURITY-LEVEL"), makeKeyword("ID-MODULE-TABLE"), makeKeyword("MODULE-ID-TABLE"), makeKeyword("ID-METHOD-TABLE"), makeKeyword("METHOD-ID-TABLE"), makeKeyword("ID-GLOBAL-TABLE"), makeKeyword("GLOBAL-ID-TABLE"), makeKeyword("SYMBOL-EXCEPTIONS"), makeKeyword("ID-SYMBOL-TABLE"), makeKeyword("SYMBOL-ID-TABLE")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("SID-DB-SECURITY-LEVEL"), makeSymbol("SID-DB-ID-MODULE-TABLE"), makeSymbol("SID-DB-MODULE-ID-TABLE"), makeSymbol("SID-DB-ID-METHOD-TABLE"), makeSymbol("SID-DB-METHOD-ID-TABLE"), makeSymbol("SID-DB-ID-GLOBAL-TABLE"), makeSymbol("SID-DB-GLOBAL-ID-TABLE"), makeSymbol("SID-DB-SYMBOL-EXCEPTIONS"), makeSymbol("SID-DB-ID-SYMBOL-TABLE"), makeSymbol("SID-DB-SYMBOL-ID-TABLE")});
  public static final SubLList $list6 = list(new SubLObject[] {makeSymbol("_CSETF-SID-DB-SECURITY-LEVEL"), makeSymbol("_CSETF-SID-DB-ID-MODULE-TABLE"), makeSymbol("_CSETF-SID-DB-MODULE-ID-TABLE"), makeSymbol("_CSETF-SID-DB-ID-METHOD-TABLE"), makeSymbol("_CSETF-SID-DB-METHOD-ID-TABLE"), makeSymbol("_CSETF-SID-DB-ID-GLOBAL-TABLE"), makeSymbol("_CSETF-SID-DB-GLOBAL-ID-TABLE"), makeSymbol("_CSETF-SID-DB-SYMBOL-EXCEPTIONS"), makeSymbol("_CSETF-SID-DB-ID-SYMBOL-TABLE"), makeSymbol("_CSETF-SID-DB-SYMBOL-ID-TABLE")});
  public static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym8$SECURE_ID_DATABASE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SECURE-ID-DATABASE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$SID_DB_SECURITY_LEVEL = makeSymbol("SID-DB-SECURITY-LEVEL");
  public static final SubLSymbol $sym10$_CSETF_SID_DB_SECURITY_LEVEL = makeSymbol("_CSETF-SID-DB-SECURITY-LEVEL");
  public static final SubLSymbol $sym11$SID_DB_ID_MODULE_TABLE = makeSymbol("SID-DB-ID-MODULE-TABLE");
  public static final SubLSymbol $sym12$_CSETF_SID_DB_ID_MODULE_TABLE = makeSymbol("_CSETF-SID-DB-ID-MODULE-TABLE");
  public static final SubLSymbol $sym13$SID_DB_MODULE_ID_TABLE = makeSymbol("SID-DB-MODULE-ID-TABLE");
  public static final SubLSymbol $sym14$_CSETF_SID_DB_MODULE_ID_TABLE = makeSymbol("_CSETF-SID-DB-MODULE-ID-TABLE");
  public static final SubLSymbol $sym15$SID_DB_ID_METHOD_TABLE = makeSymbol("SID-DB-ID-METHOD-TABLE");
  public static final SubLSymbol $sym16$_CSETF_SID_DB_ID_METHOD_TABLE = makeSymbol("_CSETF-SID-DB-ID-METHOD-TABLE");
  public static final SubLSymbol $sym17$SID_DB_METHOD_ID_TABLE = makeSymbol("SID-DB-METHOD-ID-TABLE");
  public static final SubLSymbol $sym18$_CSETF_SID_DB_METHOD_ID_TABLE = makeSymbol("_CSETF-SID-DB-METHOD-ID-TABLE");
  public static final SubLSymbol $sym19$SID_DB_ID_GLOBAL_TABLE = makeSymbol("SID-DB-ID-GLOBAL-TABLE");
  public static final SubLSymbol $sym20$_CSETF_SID_DB_ID_GLOBAL_TABLE = makeSymbol("_CSETF-SID-DB-ID-GLOBAL-TABLE");
  public static final SubLSymbol $sym21$SID_DB_GLOBAL_ID_TABLE = makeSymbol("SID-DB-GLOBAL-ID-TABLE");
  public static final SubLSymbol $sym22$_CSETF_SID_DB_GLOBAL_ID_TABLE = makeSymbol("_CSETF-SID-DB-GLOBAL-ID-TABLE");
  public static final SubLSymbol $sym23$SID_DB_SYMBOL_EXCEPTIONS = makeSymbol("SID-DB-SYMBOL-EXCEPTIONS");
  public static final SubLSymbol $sym24$_CSETF_SID_DB_SYMBOL_EXCEPTIONS = makeSymbol("_CSETF-SID-DB-SYMBOL-EXCEPTIONS");
  public static final SubLSymbol $sym25$SID_DB_ID_SYMBOL_TABLE = makeSymbol("SID-DB-ID-SYMBOL-TABLE");
  public static final SubLSymbol $sym26$_CSETF_SID_DB_ID_SYMBOL_TABLE = makeSymbol("_CSETF-SID-DB-ID-SYMBOL-TABLE");
  public static final SubLSymbol $sym27$SID_DB_SYMBOL_ID_TABLE = makeSymbol("SID-DB-SYMBOL-ID-TABLE");
  public static final SubLSymbol $sym28$_CSETF_SID_DB_SYMBOL_ID_TABLE = makeSymbol("_CSETF-SID-DB-SYMBOL-ID-TABLE");
  public static final SubLSymbol $kw29$SECURITY_LEVEL = makeKeyword("SECURITY-LEVEL");
  public static final SubLSymbol $kw30$ID_MODULE_TABLE = makeKeyword("ID-MODULE-TABLE");
  public static final SubLSymbol $kw31$MODULE_ID_TABLE = makeKeyword("MODULE-ID-TABLE");
  public static final SubLSymbol $kw32$ID_METHOD_TABLE = makeKeyword("ID-METHOD-TABLE");
  public static final SubLSymbol $kw33$METHOD_ID_TABLE = makeKeyword("METHOD-ID-TABLE");
  public static final SubLSymbol $kw34$ID_GLOBAL_TABLE = makeKeyword("ID-GLOBAL-TABLE");
  public static final SubLSymbol $kw35$GLOBAL_ID_TABLE = makeKeyword("GLOBAL-ID-TABLE");
  public static final SubLSymbol $kw36$SYMBOL_EXCEPTIONS = makeKeyword("SYMBOL-EXCEPTIONS");
  public static final SubLSymbol $kw37$ID_SYMBOL_TABLE = makeKeyword("ID-SYMBOL-TABLE");
  public static final SubLSymbol $kw38$SYMBOL_ID_TABLE = makeKeyword("SYMBOL-ID-TABLE");
  public static final SubLString $str39$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym40$TRANSLATOR_SECURITY_LEVEL_P = makeSymbol("TRANSLATOR-SECURITY-LEVEL-P");
  public static final SubLInteger $int41$1500 = makeInteger(1500);
  public static final SubLInteger $int42$10000 = makeInteger(10000);
  public static final SubLInteger $int43$1000 = makeInteger(1000);
  public static final SubLSymbol $kw44$FREE = makeKeyword("FREE");
  public static final SubLList $list45 = list(makeKeyword("MEDIUM"), makeKeyword("HIGH"));
  public static final SubLSymbol $kw46$HIGH = makeKeyword("HIGH");
  public static final SubLString $str47$S_ = makeString("S#");
  public static final SubLSymbol $kw48$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str49$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str50$c3edef08_eef1_11dd_9624_00219b50e = makeString("c3edef08-eef1-11dd-9624-00219b50e0e5");
  public static final SubLSymbol $kw51$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw52$VERSION = makeKeyword("VERSION");
  public static final SubLSymbol $kw53$COPYRIGHT = makeKeyword("COPYRIGHT");
  public static final SubLSymbol $kw54$INPUT = makeKeyword("INPUT");
  public static final SubLString $str55$Invalid_format___A_cannot_be_inte = makeString("Invalid format: ~A cannot be interpreted as a secure ID database.~%");
  public static final SubLString $str56$ = makeString("");
  public static final SubLString $str57$Invalid_format__The_type_ID_is_mi = makeString("Invalid format: The type ID is missing or invalid.~%");
  public static final SubLSymbol $sym58$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLString $str59$Invalid_format___A_is_not_a_valid = makeString("Invalid format: ~A is not a valid version specification.~%");
  public static final SubLList $list60 = list(ONE_INTEGER, ZERO_INTEGER);
  public static final SubLString $str61$Invalid_format___A_is_not_a_known = makeString("Invalid format: ~A is not a known version specification.~%");
  public static final SubLString $str62$Invalid_format___A_is_not_a_valid = makeString("Invalid format: ~A is not a valid security level.~%");
  public static final SubLString $str63$Invalid_format___A_is_not_a_valid = makeString("Invalid format: ~A is not a valid symbol exceptions set.~%");
  public static final SubLString $str64$Invalid_format___A_is_not_a_valid = makeString("Invalid format: ~A is not a valid table mapping to ids of type ~A.");
  public static final SubLSymbol $sym65$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym66$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym67$API_MUTABLE_GLOBAL_P = makeSymbol("API-MUTABLE-GLOBAL-P");
  public static final SubLString $str68$CYC = makeString("CYC");
  public static final SubLObject $list69 = _constant_69_initializer();

  //// Internal Constant Initializer Methods

  private static final SubLObject _constant_69_initializer() {
    return list(new SubLObject[] {makeSymbol("*CACHE-INFERENCE-RESULTS*"), makeSymbol("*HL-FAILURE-BACKCHAINING*"), makeSymbol("*ENABLE-REWRITE-OF-PROPAGATION?*"), makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*"), makeSymbol("KB-STATISTICS"), makeSymbol("SERVER-SUMMARY"), makeSymbol("HALT-CYC-IMAGE"), makeSymbol("ALL"), makeSymbol("NONE"), makeSymbol("*INIT-FILE-LOADED?*"), makeSymbol("*THESAURUS-FILENAME*"), makeSymbol("*THESAURUS-FILENAME-EXTENSION*"), makeSymbol("*THESAURUS-SUBDIRECTORIES*"), makeSymbol("INITIALIZE-AGENDA"), makeSymbol("INITIALIZE-TRANSCRIPT-HANDLING"), makeSymbol("LOAD-SYSTEM-PARAMETERS"), makeSymbol("LOAD-THESAURUS-INIT-FILE"), makeSymbol("PROBE-FILE"), makeSymbol("SYSTEM-CODE-INITIALIZATIONS"), makeSymbol("SYSTEM-KB-INITIALIZATIONS"), makeSymbol("LOAD-API"), makeSymbol("CORE-KB-FINALIZATION"), makeSymbol("CORE-KB-FINISH-BOOTSTRAPPING"), makeSymbol("CORE-KB-FINISH-DEFINITIONS"), makeSymbol("CORE-KB-INITIALIZATION"), makeSymbol("CORE-KB-START-BOOTSTRAPPING"), makeSymbol("CORE-KB-START-DEFINITIONS"), makeSymbol("CYC-FUNCTION-TO-ARG"), makeSymbol("FI-ASSERT-INT"), makeSymbol("HL-EXTERNAL-ID-STRING-P"), makeSymbol("HL-FIND-OR-CREATE-NART"), makeSymbol("LOW-ASSERT-LITERAL"), makeSymbol("RELEVANT-MT?"), makeSymbol("DUMP-STANDARD-KB"), makeSymbol("DUMP-KB"), makeSymbol("LOAD-KB"), makeSymbol("*STANDARD-INPUT*"), makeSymbol("READ-IGNORING-ERRORS"), makeSymbol("*INFERENCE-TRACE-PORT*"), makeSymbol("API-PORT"), makeSymbol("API-SERVER-TOP-LEVEL"), makeSymbol("CFASL-PORT"), makeSymbol("CFASL-SERVER-TOP-LEVEL"), makeSymbol("CYC-HTML-FEATURE"), makeSymbol("CYC-THESAURUS-FEATURE"), makeSymbol("ENABLE-TCP-SERVER"), makeSymbol("FINISH-OUTPUT"), makeSymbol("HTML-PORT"), makeSymbol("HTML-SERVER-TOP-LEVEL"), makeSymbol("ROBUST-ENABLE-TCP-SERVER"), makeSymbol("START-AGENDA"), makeSymbol("THESAURUS-MANAGER-ACCESS-PROTOCOL-SERVER-TOP-LEVEL"), makeSymbol("TMAP-PORT"), makeSymbol("*EVAL-IN-API?*"), makeSymbol("*SILENT-PROGRESS?*"), makeSymbol("CYC-HOME-FILENAME"), makeSymbol("HALT-AGENDA"), makeSymbol("LOAD-INFERENCE-TESTS"), makeSymbol("SET-COMMUNICATION-MODE"), makeSymbol("LOAD-INFERENCE-TESTS"), makeSymbol("DEF-INFERENCE-TEST"), makeSymbol("DEFINE-INFERENCE-TEST"), makeSymbol("DEFINE-SUBTEST"), makeSymbol("CYC-HOME-FILENAME"), makeSymbol("LOAD-ALL-CYC-TESTS"), makeSymbol("RUN-ALL-CYC-TESTS"), makeSymbol("RUN-CYC-TESTS"), makeSymbol("RUN-ALL-INFERENCE-UNIT-TESTS"), makeSymbol("RUN-ALL-REMOVAL-MODULE-TESTS"), makeSymbol("RUN-ALL-EVALUATABLE-RELATION-TESTS"), makeSymbol("*SECONDS-IN-A-NON-LEAP-YEAR*"), makeSymbol("CLOSED-QUERY-SUCCESS-TOKEN"), makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK"), makeSymbol("EQUALS-EL?"), makeSymbol("HTML-ESCAPED-TO-UNICODE-VECTOR"), makeSymbol("LENGTH="), makeSymbol("LENGTH>="), makeSymbol("LENGTHS="), makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS"), makeSymbol("NOT-EQ"), makeSymbol("TREE-MATCHES-PATTERN"), makeSymbol("UNICODE-VECTOR-TO-DISPLAY"), makeSymbol("DECLARE-CYC-TEST-FILE"), makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST"), makeSymbol("DEFINE-INFERENCE-UNIT-TEST"), makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST"), makeSymbol("LOAD-ALL-KB-CONTENT-POST-BUILD-TESTS"), makeSymbol("PWHEN-FEATURE"), makeSymbol("*TRANSFORMATION-DEPTH-COMPUTATION*"), makeSymbol("GENL-CARDINALITY"), makeSymbol("PROBLEM-MIN-TRANSFORMATION-DEPTH"), makeSymbol("PROBLEM-MIN-TRANSFORMATION-DEPTH"), makeSymbol("PROBLEM-PROOF-COUNT"), makeSymbol("PROBLEM-SOLE-CLAUSE"), makeSymbol("PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT"), makeSymbol("QUERY-ABORT"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM"), makeSymbol("SPEC-CARDINALITY"), makeSymbol("STRATEGICALLY-PENDING-PROBLEM-P"), makeSymbol("STRATEGICALLY-POSSIBLE-PROBLEM-P"), makeSymbol("STRATEGICALLY-POSSIBLE-PROBLEM-P"), makeSymbol("TACTICALLY-PENDING-PROBLEM-P"), makeSymbol("TACTICALLY-PENDING-PROBLEM-P"), makeSymbol("TACTICALLY-POSSIBLE-PROBLEM-P"), makeSymbol("TRANSFORMATION-RULE-SUCCESS-COUNT"), makeSymbol("CONSTANT-SUID"), makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*"), makeSymbol("*ACCUMULATING-WFF-VIOLATIONS?*"), makeSymbol("*ADDITIONAL-FORT-TYPING-COLLECTIONS*"), makeSymbol("*ADMIT-NART-MTS-IN-MT-GAFS-IN-MT-MT?*"), makeSymbol("*ANECT-MT*"), makeSymbol("*ASSUME-SBHL-EXTENSIONS-NONEMPTY*"), makeSymbol("*AT-ADMIT-CONSISTENT-NAUTS?*"), makeSymbol("*AT-APPLY-NECESSARY-DEFNS?*"), makeSymbol("*AT-CHECK-ARG-GENLS?*"), makeSymbol("*AT-CHECK-ARG-ISA?*"), makeSymbol("*AT-CHECK-GENL-INVERSES?*"), makeSymbol("*AT-CHECK-GENL-PREDS?*"), makeSymbol("*AT-CHECK-INTER-ARG-GENL?*"), makeSymbol("*AT-CHECK-INTER-ARG-ISA?*"), makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*"), makeSymbol("*AT-CHECK-NOT-GENLS-DISJOINT?*"), makeSymbol("*AT-CHECK-NOT-ISA-DISJOINT?*"), makeSymbol("*AT-CHECK-NOT-MDW?*"), makeSymbol("*AT-CHECK-NOT-SDC?*"), makeSymbol("*AT-POSSIBLY-CHECK-DEFINING-MTS?*"), makeSymbol("*AT-SOME-ARG-ISA-REQUIRED?*"), makeSymbol("*AT-TRACE-LEVEL*"), makeSymbol("*BREAK-ON-FAILURE*"), makeSymbol("*CACHE-INFERENCE-RESULTS*"), makeSymbol("*CACHED-GENL-PREDICATES*"), makeSymbol("*CACHED-GENL-PREDICATES-SET*"), makeSymbol("*CACHED-GENLS*"), makeSymbol("*CACHED-GENLS-SET*"), makeSymbol("*CACHED-ISAS*"), makeSymbol("*CACHED-ISAS-SET*"), makeSymbol("*CANONICALIZE-ALL-SENTENCE-ARGS?*"), makeSymbol("*CHECK-WFF-COHERENCE?*"), makeSymbol("*CHEMISTRY-LEXICAL-MT*"), makeSymbol("*CIRCULAR-COMPLEXITY-COUNT-LIMIT*"), makeSymbol("*CONTINUE-CERROR?*"), makeSymbol("*CONTROL-1*"), makeSymbol("*CONTROL-2*"), makeSymbol("*CONTROL-3*"), makeSymbol("*CONTROL-4*"), makeSymbol("*CONTROL-5*"), makeSymbol("*CONTROL-6*"), makeSymbol("*CONTROL?*"), makeSymbol("*CORE-MT-FLOOR*"), makeSymbol("*CURRENT-TEST*"), makeSymbol("*DEBUG-CONTINUE*"), makeSymbol("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*"), makeSymbol("*DEFN-TRACE-LEVEL*"), makeSymbol("*DETERMINERS-BEFORE-VARIABLES*"), makeSymbol("*EL-SUPPORTS-CONTRACTIONS?*"), makeSymbol("*EL-SUPPORTS-DOT-SYNTAX?*"), makeSymbol("*ENCAPSULATE-INTENSIONAL-FORMULA?*"), makeSymbol("*ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?*"), makeSymbol("*EVALUATABLE-BACKCHAIN-ENABLED*"), makeSymbol("*EXPRESS-AS-ASYMMETRIC?*"), makeSymbol("*EXPRESS-AS-DISJOINT-WITH?*"), makeSymbol("*EXPRESS-AS-GENLS?*"), makeSymbol("*EXPRESS-AS-IRREFLEXIVE?*"), makeSymbol("*EXPRESS-AS-NEGATION-INVERSE?*"), makeSymbol("*EXPRESS-AS-NEGATION-PREDICATES?*"), makeSymbol("*EXPRESS-AS-REFLEXIVE?*"), makeSymbol("*EXPRESS-AS-RELATION-TYPE?*"), makeSymbol("*EXPRESS-AS-RULE-MACRO?*"), makeSymbol("*EXPRESS-AS-SYMMETRIC?*"), makeSymbol("*EXPRESS-AS-TRANSITIVE?*"), makeSymbol("*FI-ERROR*"), makeSymbol("*FI-WARNING*"), makeSymbol("*FORWARD-PROPAGATE-FROM-NEGATIONS*"), makeSymbol("*GT-MAX-NODES-DIRECTION*"), makeSymbol("*HL-FAILURE-BACKCHAINING*"), makeSymbol("*IMPLICIT-FORT-TYPING-COLLECTIONS*"), makeSymbol("*IMPLICITIFY-UNIVERSALS?*"), makeSymbol("*INCLUDE-AT-CONSTRAINT-GAF?*"), makeSymbol("*INDEX-CONVERT-COMPLEX-THRESHOLD*"), makeSymbol("*INDEX-CONVERT-SIMPLE-THRESHOLD*"), makeSymbol("*INDEX-OVERLAP-ENABLED?*"), makeSymbol("*INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?*"), makeSymbol("*IT-BACKCHAIN*"), makeSymbol("*IT-DEPTH*"), makeSymbol("*IT-NUMBER*"), makeSymbol("*IT-TIME*"), makeSymbol("*IT-VERBOSE*"), makeSymbol("*KNOWN-ANTECEDENT-RULE-ENABLED?*"), makeSymbol("*LEXICON-LOOKUP-MT*"), makeSymbol("*LOOKUP-OVERLAP-WATERMARK*"), makeSymbol("*MT*"), makeSymbol("*MT-MT*"), makeSymbol("*MUST-ENFORCE-SEMANTICS?*"), makeSymbol("*NL-TRIE-ROTATION-INDEX*"), makeSymbol("*NOTING-AT-VIOLATIONS?*"), makeSymbol("*PARAPHRASE-MODE*"), makeSymbol("*PPH-COERCE-DEFINITE-DESCRIPTIONS-FOR-UNLEXIFIED-TERMS?*"), makeSymbol("*PPH-DOMAIN-MT*"), makeSymbol("*PPH-EXPAND-E-NOTATION-FOR-FLOATS?*"), makeSymbol("*PPH-LANGUAGE-MT*"), makeSymbol("*PPH-LINK-ARG0?*"), makeSymbol("*PPH-QUANTIFY-VARS?*"), makeSymbol("*PPH-USE-BULLETED-LISTS?*"), makeSymbol("*PPH-USE-SMART-VARIABLE-REPLACEMENT?*"), makeSymbol("*PPH-USE-WHOM?*"), makeSymbol("*READ-REQUIRE-CONSTANT-EXISTS*"), makeSymbol("*RESIDUAL-TRANSFORMATION-LINKS-ENABLED?*"), makeSymbol("*REWRITE-MODULES*"), makeSymbol("*SBHL-TEMPORALITY-ACTIVE?*"), makeSymbol("*SDC-COMMON-SPEC-EXCEPTION?*"), makeSymbol("*SDC-EXCEPTION-TRANSFERS-THRU-SPECS?*"), makeSymbol("*SIMPLIFY-SENTENCE?*"), makeSymbol("*SIMPLIFY-SEQUENCE-VARS-USING-KB-ARITY?*"), makeSymbol("*SKOLEM-AXIOM-TABLE*"), makeSymbol("*STANDARDIZE-VARIABLES-MEMORY*"), makeSymbol("*TERM-FUNCTIONAL-COMPLEXITY-CUTOFF*"), makeSymbol("*TEST-DIRECTION*"), makeSymbol("*TEST-STATUS*"), makeSymbol("*THE-CYCLIST*"), makeSymbol("*KE-PURPOSE*"), makeSymbol("*CB-CONSTANT-HISTORY*"), makeSymbol("*CB-NAT-HISTORY*"), makeSymbol("*CB-SENTENCE-HISTORY*"), makeSymbol("*CB-ASSERTION-HISTORY*"), makeSymbol("*PPH-REPLACE-BULLETED-LIST-TAGS?*"), makeSymbol("*PARAPHRASE-PRECISION*"), makeSymbol("*PPH-TERSE-MT-SCOPE?*"), makeSymbol("*PPH-MAXIMIZE-LINKS?*"), makeSymbol("*PPH-USE-TITLE-CAPITALIZATION?*"), makeSymbol("*PPH-USE-INDEXICAL-DATES?*"), makeSymbol("*PPH-ADDRESSEE*"), makeSymbol("*PPH-SPEAKER*"), makeSymbol("*TVA-PRECOMPUTE-CLOSURE-THRESHOLD*"), makeSymbol("*UNBOUND-RULE-BACKCHAIN-ENABLED*"), makeSymbol("*USE-TRANSCRIPT?*"), makeSymbol("*VALIDATE-EXPANSIONS?*"), makeSymbol("*WFF-VIOLATION-DATA-TERSE?*"), makeSymbol("*WITHIN-ASK*"), makeSymbol("1+"), makeSymbol("ABORT-CURRENT-CONTROLLING-INFERENCE"), makeSymbol("ALL-CONSTANTS"), makeSymbol("ALL-CONTIGUOUS-AFTER"), makeSymbol("ALL-CONTIGUOUS-AFTER-INVERSE"), makeSymbol("ALL-COTEMPORAL"), makeSymbol("ALL-DENOTS-OF-STRING"), makeSymbol("ALL-ENDS-AFTER-ENDING-OF"), makeSymbol("ALL-ENDS-AFTER-ENDING-OF-INVERSE"), makeSymbol("ALL-ENDS-AFTER-STARTING-OF"), makeSymbol("ALL-ENDS-AFTER-STARTING-OF-INVERSE"), makeSymbol("ALL-ENDS-DURING"), makeSymbol("ALL-ENDS-DURING-INVERSE"), makeSymbol("ALL-LEXICON-STRING-PREDICATES"), makeSymbol("ALL-NEGATION-INVERSES"), makeSymbol("ALL-NEGATION-PREDICATES"), makeSymbol("ALL-NEGATION-PREDS"), makeSymbol("ALL-OVERLAPS-START"), makeSymbol("ALL-OVERLAPS-START-INVERSE"), makeSymbol("ALL-SPEC-PREDS"), makeSymbol("ALL-STARTS-AFTER-ENDING-OF"), makeSymbol("ALL-STARTS-AFTER-ENDING-OF-INVERSE"), makeSymbol("ALL-STARTS-AFTER-STARTING-OF"), makeSymbol("ALL-STARTS-AFTER-STARTING-OF-INVERSE"), makeSymbol("ALL-STARTS-DURING"), makeSymbol("ALL-STARTS-DURING-INVERSE"), makeSymbol("ALL-TEMPORAL-BOUNDS-CONTAIN"), makeSymbol("ALL-TEMPORAL-BOUNDS-CONTAIN-INVERSE"), makeSymbol("ALL-TEMPORAL-BOUNDS-IDENTICAL"), makeSymbol("ALL-TEMPORAL-BOUNDS-INTERSECT"), makeSymbol("ALL-TEMPORALLY-COORIGINATING"), makeSymbol("ALL-TEMPORALLY-COTERMINAL"), makeSymbol("ALL-TEMPORALLY-FINISHED-BY"), makeSymbol("ALL-TEMPORALLY-FINISHED-BY-INVERSE"), makeSymbol("ALL-TEMPORALLY-STARTED-BY"), makeSymbol("ALL-TEMPORALLY-STARTED-BY-INVERSE"), makeSymbol("ALL-TEMPORALLY-SUBSUMES"), makeSymbol("ALL-TEMPORALLY-SUBSUMES-INVERSE"), makeSymbol("ANY-SDC-WRT?"), makeSymbol("ASENT-SENSE-AND-MT-TO-PROBLEM-QUERY"), makeSymbol("ASSERT-QUERY-TEST"), makeSymbol("ASSERT-RETURN-UNCANON"), makeSymbol("ASSERTED-SECOND"), makeSymbol("ASSERTED-WHY"), makeSymbol("ASSERTION-ARGUMENTS"), makeSymbol("ASSERTION-CONS"), makeSymbol("ASSERTION-FI-FORMULA"), makeSymbol("ASSERTION-FIND-IF"), makeSymbol("ASSERTION-GATHER"), makeSymbol("ASSERTION-HL-FORMULA"), makeSymbol("ATOMIC-SENTENCE-ARG1"), makeSymbol("ATOMIC-SENTENCE-ARG2"), makeSymbol("ATOMIC-SENTENCE-ARG3"), makeSymbol("ATOMIC-SENTENCE-ARG4"), makeSymbol("ATOMIC-SENTENCE-ARGS"), makeSymbol("ATOMIC-SENTENCE-PREDICATE"), makeSymbol("B-TEST-FORM"), makeSymbol("BALANCED-STRATEGY-LINK-HEAD-MOTIVATED-WRT-TRANSFORMATION?"), makeSymbol("BALANCED-STRATEGY-P"), makeSymbol("BALANCED-STRATEGY-PROBLEM-MOTIVATED-WRT-REMOVAL?"), makeSymbol("BELIEF-P"), makeSymbol("BINDING-VERIFY"), makeSymbol("BULL"), makeSymbol("CANON-ASSERT-EQUAL?"), makeSymbol("CANON-ASSERT-ISOMORPHIC?"), makeSymbol("CANON-EQUAL-HL-NAMES?"), makeSymbol("CANON-EQUAL?"), makeSymbol("CANON-FORMS-EQUAL?"), makeSymbol("CANON-QUERY-EQUAL?"), makeSymbol("CANONICALIZE-AND-RETURN-SKOLEM-VARS"), makeSymbol("CANONICALIZE-ASK"), makeSymbol("CANONICALIZE-CYCL"), makeSymbol("CANONICALIZE-CYCL-SENTENCE"), makeSymbol("CANONICALIZE-DEFAULT-EL-VARS"), makeSymbol("CANONICALIZE-PROBLEM-QUERY"), makeSymbol("CANONICALIZE-QUERY"), makeSymbol("CANONICALIZE-QUERY-SENTENCE"), makeSymbol("CANONICALIZE-WF-CYCL"), makeSymbol("CATCH-ERROR-MESSAGE"), makeSymbol("CB-GUESS-FORT"), makeSymbol("CDOHASH"), makeSymbol("CHECK-DENOT"), makeSymbol("CLEAR-SBHL-CACHES"), makeSymbol("CLOSED-QUERY-SUCCESS-TOKEN"), makeSymbol("CMULTIPLE-VALUE-SETQ"), makeSymbol("COLLECTION-P"), makeSymbol("COMPLEX-INDEX-P"), makeSymbol("COMPLEX-INDEXED-TERM-P"), makeSymbol("CONTIGUOUS-AFTER?"), makeSymbol("CONTINUE-INFERENCE"), makeSymbol("COPY-FORMULA"), makeSymbol("COTEMPORAL?"), makeSymbol("CPUSHNEW"), makeSymbol("CSOME"), makeSymbol("CURRENT-CONTROLLING-INFERENCE"), makeSymbol("CURRENT-MT-RELEVANCE-MT"), makeSymbol("CURRENT-REWRITE-MT"), makeSymbol("CURRENTLY-ACTIVE-PROBLEM"), makeSymbol("CURRENTLY-ACTIVE-PROBLEM-STORE"), makeSymbol("CVS-ID"), makeSymbol("CYC-EVALUATE"), makeSymbol("CYC-FIND-OR-CREATE-NART"), makeSymbol("CYCL-PROBLEM-DECODE"), makeSymbol("CYCL-PROBLEM-STORE-DECODE"), makeSymbol("CYCL-SENTENCE-P"), makeSymbol("CYCL-SUBL-SYMBOL-SYMBOL"), makeSymbol("CYCL-TERM-P"), makeSymbol("DATE-KB-LOADED-P"), makeSymbol("DECLARE-CYC-TEST-FILE"), makeSymbol("DEDUCTION-SUPPORTS"), makeSymbol("DEFAULT-EL-VAR?"), makeSymbol("DEFAULT-REFORMULATOR-MODE-PRECEDENCE"), makeSymbol("DEFGLOBAL-PRIVATE"), makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST"), makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST"), makeSymbol("DEFINE-INFERENCE-UNIT-TEST"), makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST"), makeSymbol("DEFINE-REMOVAL-MODULE-TEST"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK"), makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK"), makeSymbol("DEFINE-SUBTEST"), makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST"), makeSymbol("DEFLEXICAL-PRIVATE"), makeSymbol("DEFNS"), makeSymbol("DEFPARAMETER"), makeSymbol("DEFPARAMETER-PRIVATE"), makeSymbol("DELETE-FILE"), makeSymbol("DENOT-WS-LOOKUP"), makeSymbol("DENOTS-OF-ABBREVIATION-STRING"), makeSymbol("DENOTS-OF-COMPLEX-WORD-STRING"), makeSymbol("DENOTS-OF-NAME-STRING"), makeSymbol("DENOTS-OF-PARTIAL-STRING"), makeSymbol("DENOTS-OF-STRING&POS"), makeSymbol("DENOTS-OF-STRING&PRED"), makeSymbol("DEPENDENT-NARTS"), makeSymbol("DEREGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS"), makeSymbol("DEREGISTER-SKSI-REMOVAL-MODULES-FOR-SKS"), makeSymbol("DESTROY-ALL-PROBLEM-STORES"), makeSymbol("DESTROY-INFERENCE"), makeSymbol("DESTROY-PROBLEM-STORE"), makeSymbol("DESTROYING-NEW-PPH-PHRASES-WHEN-DONE"), makeSymbol("DETERMINE-DENOTATION-PREDS"), makeSymbol("DISJOIN"), makeSymbol("DNF-AND-MT-TO-HL-QUERY"), makeSymbol("DO-INDEXED-TERMS"), makeSymbol("DO-INTERMEDIATE-INDEX"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"), makeSymbol("DO-PROBLEM-STORE-LINKS"), makeSymbol("DO-PROBLEM-STORE-PROBLEMS"), makeSymbol("DO-PROBLEM-TACTICS"), makeSymbol("DOUBLETON?"), makeSymbol("DUPLICATE-NART-TUPLES"), makeSymbol("EL-BINARY-FORMULA-P"), makeSymbol("EL-CONTRACTION"), makeSymbol("EL-EXPAND-ALL"), makeSymbol("EL-FIND-NART"), makeSymbol("EL-UNARY-FORMULA-P"), makeSymbol("EL-VERSION"), makeSymbol("EL-WFE?"), makeSymbol("EL-WFF-ASSERTIBLE?"), makeSymbol("EL-WFT?"), makeSymbol("EL-ZERO-ARITY-FORMULA-P"), makeSymbol("ENDS-AFTER-ENDING-OF?"), makeSymbol("ENDS-AFTER-STARTING-OF?"), makeSymbol("ENDS-DURING?"), makeSymbol("ENDS-WITH"), makeSymbol("EQUAL-WRT-SVM"), makeSymbol("ASSERTION-FI-FORMULA"), makeSymbol("EQUALS-EL?"), makeSymbol("EXPRESSION-FIND"), makeSymbol("EXPRESSION-FIND-IF"), makeSymbol("EXPRESSION-GATHER"), makeSymbol("EXPRESSION-NSUBLIS"), makeSymbol("EXPRESSION-NSUBST"), makeSymbol("EXPRESSION-NTRANSFORM"), makeSymbol("EXPRESSION-SUBLIS"), makeSymbol("EXPRESSION-SUBST"), makeSymbol("EXPRESSION-TRANSFORM"), makeSymbol("EXTRACT-EL-CLAUSES"), makeSymbol("FAILING-IT-FORM-IDENTIFIER"), makeSymbol("FAST-DELETE-DUPLICATES"), makeSymbol("FAST-SKOLEM-NART?"), makeSymbol("FI-CREATE-INT"), makeSymbol("FI-KILL-INT"), makeSymbol("FI-REASSERT-INT"), makeSymbol("FI-RENAME-INT"), makeSymbol("FI-RENAME-VARIABLES-INT"), makeSymbol("FI-UNASSERT-INT"), makeSymbol("ASSERTION-FI-FORMULA"), makeSymbol("FIMPLIES"), makeSymbol("FIND-ALL-MATCHES-FOR-REGULAR-EXPRESSION"), makeSymbol("FIND-ASSERTION-CYCL"), makeSymbol("FIND-ASSERTIONS-CYCL"), makeSymbol("FIND-ASSERTIONS-VIA-TL"), makeSymbol("FIND-CONSTANT-BY-GUID"), makeSymbol("FIND-CONSTANT-BY-NAME"), makeSymbol("FIND-IF-NOT"), makeSymbol("FIND-INFERENCE-ANSWER-BY-ID"), makeSymbol("FIND-INFERENCE-BY-IDS"), makeSymbol("FIND-OR-CREATE-ASSERTION"), makeSymbol("FIND-PREVIOUS-INFERENCE-PROBLEM-BY-EL-ASENT"), makeSymbol("FIND-PROBLEM-BY-EL-QUERY"), makeSymbol("FIND-PROBLEM-BY-ID"), makeSymbol("FIND-PROBLEM-BY-QUERY"), makeSymbol("FIND-PROOF-BY-ID"), makeSymbol("FIND-REFORMULATOR-RULE-FOR-RULE-ASSERTION"), makeSymbol("FIND-STRATEGY-BY-ID"), makeSymbol("FIND-VISIBLE-ASSERTION-CYCL"), makeSymbol("FIND-VISIBLE-ASSERTIONS-CYCL"), makeSymbol("FIRST-CHAR"), makeSymbol("FIRST-OF"), makeSymbol("FMAKUNBOUND"), makeSymbol("FORM-VERIFY"), makeSymbol("FORMULA-ARGS"), makeSymbol("FORMULA-ARGS-OK-WRT-TYPE?"), makeSymbol("FORMULA-ARITY>"), makeSymbol("FORMULA-VARIABLES-ARG-CONSTRAINTS"), makeSymbol("FWHEN"), makeSymbol("GAF-ARG"), makeSymbol("GAF-CNF-LITERAL"), makeSymbol("GAF-FORMULA"), makeSymbol("GAF-OK-WRT-ANTI-TRANSITIVE-PRED?"), makeSymbol("GATHER-PREDICATE-RULE-INDEX-IN-ALL-MTS"), makeSymbol("GENERATE-DISAMBIGUATION-PHRASES"), makeSymbol("GENERATE-GENFORMAT-ARG"), makeSymbol("GENERATE-QUESTION"), makeSymbol("GENERATE-REGULAR-STRING"), makeSymbol("GENERATE-SPEECH-ACT"), makeSymbol("GENERATE-TEXT"), makeSymbol("GENLS?"), makeSymbol("GET-CYCLS-FOR-STRING-ESCALATING"), makeSymbol("GET-NL-TRIE"), makeSymbol("GET-STRINGS-OF-TYPE"), makeSymbol("GET-VARIABLE"), makeSymbol("GT-INFERIOR?"), makeSymbol("GT-SUPERIOR-IN-WHAT-MTS"), makeSymbol("GT-SUPERIOR?"), makeSymbol("GTM"), makeSymbol("HL-MODULE-NAME"), makeSymbol("HL-TO-EL"), makeSymbol("HL-VAR-FOR-DEFAULT-EL-VAR"), makeSymbol("HL-WFF?"), makeSymbol("HLMT-EQUAL"), makeSymbol("HTML-GENERATE-PHRASE"), makeSymbol("HTML-GENERATE-TEXT"), makeSymbol("INFERENCE-ABORT"), makeSymbol("INFERENCE-ANSWER-BINDINGS-EQUAL?"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATION-PROOFS"), makeSymbol("INFERENCE-ANSWER-JUSTIFICATIONS"), makeSymbol("INFERENCE-ANSWER-P"), makeSymbol("INFERENCE-ANSWERS-TO-BINDINGS"), makeSymbol("INFERENCE-CANONICALIZE-ASK-INT"), makeSymbol("INFERENCE-COMPLETELY-ASSERTED-ASENT-GAFS"), makeSymbol("INFERENCE-COMPLETELY-DECIDABLE-ASENT-GAFS"), makeSymbol("INFERENCE-COMPLETELY-ENUMERABLE-ASENT-GAFS"), makeSymbol("INFERENCE-ERROR-SUSPEND-STATUS-P"), makeSymbol("INFERENCE-HL-MTS"), makeSymbol("INFERENCE-INTERRUPT"), makeSymbol("INFERENCE-P"), makeSymbol("INFERENCE-PROBLEM-STORE"), makeSymbol("INFERENCE-REWRITE-MODULE"), makeSymbol("INFERENCE-ROOT-PROBLEM"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"), makeSymbol("INFERENCE-SUID"), makeSymbol("INITIALIZE-ALL-SBHL-CACHING"), makeSymbol("INITIALIZE-INFERENCE-TEST-CARDINALITIES"), makeSymbol("INITIALIZE-NL-TRIE-ROTATION-INDEX"), makeSymbol("INTERMEDIATE-INDEX-KEYS"), makeSymbol("INTERMEDIATE-INDEX-LOOKUP"), makeSymbol("INTERMEDIATE-INDEX-P"), makeSymbol("INTERSECT?"), makeSymbol("INTERVAL-TOKEN-VALUE"), makeSymbol("IS-REGULAR-EXPRESSIONS-SUPPORT-AVAILABLE?"), makeSymbol("KE-UNASSERT-ASSERTION-NOW"), makeSymbol("KEYWORD-FOR-POS"), makeSymbol("LEGACY-B-VERIFY"), makeSymbol("LEGACY-BINDING-VERIFY"), makeSymbol("LEGACY-VERIFY-NOT"), makeSymbol("LENGTH="), makeSymbol("LENGTH>="), makeSymbol("LOAD-PARTITION"), makeSymbol("M-VERIFY"), makeSymbol("MAKE-BINARY-FORMULA"), makeSymbol("MAKE-CONJUNCTION"), makeSymbol("MAKE-DISJUNCTION"), makeSymbol("MAKE-EL-FORMULA"), makeSymbol("MAKE-EL-VAR"), makeSymbol("MAKE-EXISTENTIAL"), makeSymbol("MAKE-EXISTENTIAL-EXACT"), makeSymbol("MAKE-EXISTENTIAL-MAX"), makeSymbol("MAKE-EXISTENTIAL-MIN"), makeSymbol("MAKE-FORMULA"), makeSymbol("MAKE-GAF-CNF"), makeSymbol("MAKE-PROCESS-WITH-ARGS"), makeSymbol("MAKE-SET-FROM-LIST"), makeSymbol("MAKE-SYMBOL"), makeSymbol("MAKE-TERNARY-FORMULA"), makeSymbol("MAKE-UNARY-FORMULA"), makeSymbol("MAKE-UNUSED-TEMP-FILENAME"), makeSymbol("MAL-VARIABLES"), makeSymbol("MAPEXP"), makeSymbol("MAPPED-PROBLEM-PROBLEM"), makeSymbol("MAPPED-PROBLEM-VARIABLE-MAP"), makeSymbol("MAX-FLOOR-MTS-OF-GENL-PRED-PATHS"), makeSymbol("MAX-FLOOR-MTS-OF-NAT"), makeSymbol("MAX-FLOOR-MTS-OF-NEGATION-INVERSE-PATHS"), makeSymbol("MAX-FLOOR-MTS-OF-NEGATION-PRED-PATHS"), makeSymbol("MAX-NEGATION-INVERSES"), makeSymbol("MAXIMIZING-PPH-LINKS"), makeSymbol("MDW?"), makeSymbol("MIN-GENL-MTS"), makeSymbol("MIN-MTS-OF-GENL-INVERSE-PATHS"), makeSymbol("MIN-MTS-OF-GENL-PRED-PATHS"), makeSymbol("MIN-MTS-OF-GENLS-PATHS"), makeSymbol("MIN-MTS-OF-ISA-PATHS"), makeSymbol("MIN-MTS-OF-NEGATION-INVERSE-PATHS"), makeSymbol("MIN-MTS-OF-NEGATION-PRED-PATHS"), makeSymbol("NAT-ARG1"), makeSymbol("NAT-ARG2"), makeSymbol("NAT-FUNCTION"), makeSymbol("NAT-FUNCTOR"), makeSymbol("NAUT-TO-NART"), makeSymbol("NEGATION-INVERSE?"), makeSymbol("NEGATION-PRED?"), makeSymbol("NEGATION-PREDS"), makeSymbol("NEW-CONTINUABLE-INFERENCE"), makeSymbol("NEW-INFERENCE-ERROR-SUSPEND-STATUS"), makeSymbol("NEW-PROBLEM-STORE"), makeSymbol("NEW-SET"), makeSymbol("NEXT-AVAILABLE-WS"), makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-INDEX-ITEM-TERM"), makeSymbol("NL-TRIE-MATCHING-PHRASES"), makeSymbol("NL-TRIE-ROTATION-INDEX-INITIALIZED?"), makeSymbol("NL-TRIE-SEARCH"), makeSymbol("NL-TRIE-SEMTRANS-TEMPLATES-OF-STRING"), makeSymbol("NL-TRIE-SENTENCE-TOKENIZE"), makeSymbol("NON-EMPTY-STRING?"), makeSymbol("NON-HL-PREDICATE-P"), makeSymbol("NOT-ENDS-AFTER-ENDING-OF?"), makeSymbol("NOT-ENDS-AFTER-STARTING-OF?"), makeSymbol("NOT-EQ"), makeSymbol("NOT-GENLS?"), makeSymbol("NOT-MDW?"), makeSymbol("NOT-STARTS-AFTER-ENDING-OF?"), makeSymbol("NOT-STARTS-AFTER-STARTING-OF?"), makeSymbol("NTH-VALUE"), makeSymbol("NUM-INDEX-SLOW"), makeSymbol("NUMBER"), makeSymbol("OBJECT-TO-STRING"), makeSymbol("ORDERED-LEXIFICATION-PREDS-FOR-KEYWORD"), makeSymbol("ORDERED-LEXIFICATION-PREDS-OF-STRING"), makeSymbol("ORDERED-STRINGS-OF-WORD-UNIT"), makeSymbol("ORDERED-WORD-VARIANTS"), makeSymbol("OVERLAPS-START?"), makeSymbol("PAD-TABLE-INITIALIZED?"), makeSymbol("PARAMETERIZED-TEST-VALUE"), makeSymbol("PARSE-LEXICAL-SEMANTIC-FORMULA"), makeSymbol("PIF-FEATURE"), makeSymbol("PLACEHOLDER-DENOTS-OF-SENSE"), makeSymbol("POS-FOR-KEYWORD"), makeSymbol("POS-LIT-VARIABLE-GENL-CONSTRAINTS"), makeSymbol("POS-LIT-VARIABLE-INTER-ARG-GENL-CONSTRAINTS"), makeSymbol("POS-LIT-VARIABLE-INTER-ARG-ISA-CONSTRAINTS"), makeSymbol("POS-LIT-VARIABLE-ISA-CONSTRAINTS"), makeSymbol("POS-OF-STRING"), makeSymbol("POS-OF-STRING&WORD"), makeSymbol("POSITIVE-INTEGER-P"), makeSymbol("POWERSET"), makeSymbol("PPH-IDENTIFY-TYPE"), makeSymbol("PPH-PHRASE-OUTPUT-LIST-STRING"), makeSymbol("PPH-SYMBOL-STRING"), makeSymbol("PRECISE-KEYWORD-FOR-POS"), makeSymbol("PREDS-FOR-KEYWORD"), makeSymbol("PREDS-OF-STRING"), makeSymbol("PREDS-OF-STRING&WORD"), makeSymbol("PRINT-DICTIONARY-CONTENTS"), makeSymbol("PRINT-FAILING-FORM"), makeSymbol("PRINT-JUSTIFY"), makeSymbol("PRINT-TMS-FORMULA"), makeSymbol("PRINT-TMS-MT"), makeSymbol("PRINT-UNASSERT"), makeSymbol("PRINTED-FORMS-EQUAL?"), makeSymbol("PROBLEM-ARGUMENT-LINK-COUNT"), makeSymbol("PROBLEM-DEPENDENT-LINK-COUNT"), makeSymbol("PROBLEM-DISCARDED-TACTIC-COUNT"), makeSymbol("PROBLEM-EXECUTED-TACTIC-COUNT"), makeSymbol("PROBLEM-EXECUTED-TACTICS"), makeSymbol("PROBLEM-HAS-TACTIC-OF-TYPE-WITH-STATUS?"), makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM"), makeSymbol("PROBLEM-QUERY-SOLE-CLAUSE"), makeSymbol("PROBLEM-RELEVANT-TO-INFERENCE?"), makeSymbol("PROBLEM-STORE"), makeSymbol("PROBLEM-STORE-FIRST-LINK-OF-TYPE"), makeSymbol("PROBLEM-STORE-REJECTED-PROOF-COUNT"), makeSymbol("PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT"), makeSymbol("PROBLEM-STORE-RESTRICTION-LINK-COUNT"), makeSymbol("PROBLEM-STORE-REWRITE-LINK-COUNT"), makeSymbol("PROBLEM-STORE-STRATEGY-COUNT"), makeSymbol("PROBLEM-STORE-SUID"), makeSymbol("PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT"), makeSymbol("PROOF-REJECTED?"), makeSymbol("PUTF"), makeSymbol("PWHEN-FEATURE"), makeSymbol("QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS"), makeSymbol("READ-LINE"), makeSymbol("REBUILD-MODULE-TESTS"), makeSymbol("RECLASSIFY-REMOVAL-MODULES"), makeSymbol("REDECLARE-INFERENCE-REMOVAL-MODULE"), makeSymbol("REFORMULATE-CYCL"), makeSymbol("REGISTER-SKSI-HL-STORAGE-MODULES-FOR-SKS"), makeSymbol("REGISTER-SKSI-REMOVAL-MODULES-FOR-SKS"), makeSymbol("REIFIABLE-FUNCTION-TERM?"), makeSymbol("REIFIABLE-FUNCTOR?"), makeSymbol("REIFIED-SKOLEM-FN?"), makeSymbol("RELATED-DENOTS-OF-SENSE"), makeSymbol("RELATION-VARIABLE-GENL-CONSTRAINTS"), makeSymbol("RELATION-VARIABLE-INTER-ARG-GENL-CONSTRAINTS"), makeSymbol("RELATION-VARIABLE-INTER-ARG-ISA-CONSTRAINTS"), makeSymbol("RELATION-VARIABLE-ISA-CONSTRAINTS"), makeSymbol("RELATIONAL-NOUN-POSSESSED-ARGNUMS"), makeSymbol("REMOVE-IF-NOT"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM"), makeSymbol("RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-PROBLEM"), makeSymbol("RESTRICTION-REWRITE-ADD-LINK"), makeSymbol("RESULT-GENL"), makeSymbol("RESULT-INTER-ARG-GENL-RELN"), makeSymbol("RESULT-INTER-ARG-ISA-RELN"), makeSymbol("RETURN-UNCANON"), makeSymbol("REWRITE-ADD-LINK"), makeSymbol("REWRITE-LINK-TACTIC"), makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-ALL-SUGGESTIONS"), makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-AND-MINIMAL-SUGGESTIONS"), makeSymbol("STRENGTHEN-PREDICATE-W/TYPED-LINKS-ONLY"), makeSymbol("STRENGTHENED-PREDS"), makeSymbol("TYPED-PRED-STRENGTHEN-FORMULA"), makeSymbol("RSUBLIS"), makeSymbol("RULES-MENTIONING"), makeSymbol("RUN-ALL-CYC-TESTS"), makeSymbol("RUN-EVALUATABLE-RELATION-TESTS"), makeSymbol("RUN-TEST-CASE-TABLES-OF-CLASS"), makeSymbol("RUN-TEST-SUITE"), makeSymbol("SAFE-FI"), makeSymbol("SAMPLE-DIFFERENT-LEAF-INSTANCES"), makeSymbol("SAMPLE-DIFFERENT-LEAF-SPECS"), makeSymbol("SAMPLE-LEAF-INSTANCES"), makeSymbol("SAVE-PARTITION"), makeSymbol("SBHL-CACHED-PREDICATE-RELATION-P"), makeSymbol("SBHL-CACHED-RELATIONS-FOR-NODE"), makeSymbol("SBHL-MARKED-NODES"), makeSymbol("SDC"), makeSymbol("SDC?"), makeSymbol("SEMANTICALLY-WF-LITERAL?"), makeSymbol("SENTENCE-ASSERTIONS"), makeSymbol("SENTENCE-ASSERTIONS-IN-MT"), makeSymbol("SENTENCE-FREE-SEQUENCE-VARIABLES"), makeSymbol("SENTENCE-FREE-VARIABLES"), makeSymbol("SENTENCE-VARIABLES"), makeSymbol("SET"), makeSymbol("SET-ADD"), makeSymbol("SET-ASSERTION-ASSERTED-BY"), makeSymbol("SET-ASSERTION-ASSERTED-SECOND"), makeSymbol("SETHASH"), makeSymbol("SETS-EQUAL-EQUAL?"), makeSymbol("SETS-EQUAL?"), makeSymbol("SIMPLE-INDEX-P"), makeSymbol("SIMPLEST-INFERENCE-STRATEGY"), makeSymbol("SIMPLIFY-TRANSITIVE-REDUNDANCIES"), makeSymbol("SINGLE-LITERAL-PROBLEM-ATOMIC-SENTENCE"), makeSymbol("SINGLETON?"), makeSymbol("SKOLEM-DEFN-ASSERTIONS"), makeSymbol("SKOLEM-FUNCTION-P"), makeSymbol("SKOLEM-FUNCTION?"), makeSymbol("SKOLEM-NART?"), makeSymbol("SKOLEM-RULE-HOSED?"), makeSymbol("SOME-GENL-PRED-OR-INVERSE?"), makeSymbol("SOME-NEGATION-PRED-OR-INVERSE?"), makeSymbol("SOME-SPEC-PRED-OR-INVERSE?"), makeSymbol("SPEC-POS-PRED?"), makeSymbol("STARTS-AFTER-ENDING-OF?"), makeSymbol("STARTS-AFTER-STARTING-OF?"), makeSymbol("STARTS-DURING?"), makeSymbol("STARTS-WITH"), makeSymbol("STRATEGICALLY-FINISHED-PROBLEM-P"), makeSymbol("STRATEGICALLY-NO-GOOD-PROBLEM-P"), makeSymbol("STRING-IS-POS-ON-WU?"), makeSymbol("STRING-TOKEN-VALUE"), makeSymbol("STRINGS-OF-WORD-UNIT"), makeSymbol("SUBINDEX-LEAF-COUNT"), makeSymbol("SUBINDEX-LEAVES"), makeSymbol("SUBINDEX-P"), makeSymbol("SUBL-ESCAPE-P"), makeSymbol("SUBL-STRING-P"), makeSymbol("SUBSTRING?"), makeSymbol("SUF-DEFN?"), makeSymbol("SUPERSETP"), makeSymbol("TACTIC-HL-MODULE"), makeSymbol("TACTIC-HL-MODULE-NAME"), makeSymbol("TACTICALLY-FINISHED-PROBLEM-P"), makeSymbol("TACTICALLY-NO-GOOD-PROBLEM-P"), makeSymbol("TACTICALLY-UNEXAMINED-PROBLEM-P"), makeSymbol("TEMPORAL-BOUNDS-CONTAIN?"), makeSymbol("TEMPORAL-BOUNDS-IDENTICAL?"), makeSymbol("TEMPORAL-BOUNDS-INTERSECT?"), makeSymbol("TEMPORALLY-COORIGINATING?"), makeSymbol("TEMPORALLY-COTERMINAL?"), makeSymbol("TEMPORALLY-FINISHED-BY?"), makeSymbol("TEMPORALLY-STARTED-BY?"), makeSymbol("TEMPORALLY-SUBSUMES?"), makeSymbol("TERM-INDEX"), makeSymbol("TERM-OF-UNIT"), makeSymbol("TERM-UNIFY"), makeSymbol("TEST-CANONICALIZE-ASSERT"), makeSymbol("TEST-CANONICALIZE-ASSERT-SENTENCE"), makeSymbol("TEST-ERROR"), makeSymbol("TEST-SUITE-DEFINED-P"), makeSymbol("TEST-VERIFY"), makeSymbol("TEST-VERIFY-NEW"), makeSymbol("THROW-UNEVALUATABLE"), makeSymbol("TIME"), makeSymbol("TRANSFORM"), makeSymbol("TREE-FIND"), makeSymbol("TREE-FIND-IF"), makeSymbol("TREE-GATHER"), makeSymbol("TREE-MATCHES-PATTERN"), makeSymbol("TYPED-DENOTS-OF-STRING-AT-PLACE"), makeSymbol("UNCANON-TEST"), makeSymbol("UNDECLARE-INFERENCE-REMOVAL-MODULE"), makeSymbol("UNKNOWN-ASSERTION?"), makeSymbol("UNWRAP-IF-IST-PERMISSIVE"), makeSymbol("USELESS-NART?"), makeSymbol("VALID-ASSERTION?"), makeSymbol("VALID-EL-VAR?"), makeSymbol("VALID-SBHL-LINKS-P"), makeSymbol("VAR-NAMES-IN-STRING"), makeSymbol("VARIABLE-LOOKUP"), makeSymbol("VERIFY-NOT"), makeSymbol("WHY-NOT-QUERY-OK"), makeSymbol("WHY-NOT-SEMANTICALLY-WF-WRT-TYPES"), makeSymbol("WHY-NOT-WFF"), makeSymbol("WHY-NOT-WFF-ASK"), makeSymbol("WHY-NOT-WFF-ASSERT"), makeSymbol("WHY-NOT-WFT"), makeSymbol("WITH-ALL-PREDICATES"), makeSymbol("WITH-INFERENCE-ERROR-HANDLING"), makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), makeSymbol("WITH-NL-TRIE-CASE-SENSITIVITY-OFF"), makeSymbol("WITH-NL-TRIE-CASE-SENSITIVITY-ON"), makeSymbol("WITH-PARAPHRASE-MAPPINGS"), makeSymbol("WITH-PPH-DEMERIT-CUTOFF"), makeSymbol("WITH-PPH-MEMOIZATION"), makeSymbol("WITH-PRECISE-PARAPHRASE-OFF"), makeSymbol("WITH-ALL-SPEC-PREDICATES"), makeSymbol("WITH-TEST-ASSERTION-LISTS"), makeSymbol("WITH-TEST-ASSERTIONS"), makeSymbol("WITH-TEST-CONSTANTS"), makeSymbol("WITH-TEXT-FILE"), makeSymbol("WITH-THE-CYCLIST"), makeSymbol("WITH-TVA-PRECOMPUTE-CLOSURE-THRESHOLD"), makeSymbol("WITHOUT-SBHL-CACHES"), makeSymbol("WITHOUT-UNLEXIFIED-TERM-DISCOVERY-LOGGING"), makeSymbol("WORD-HAS-POS?"), makeSymbol("WORD-VARIANTS"), makeSymbol("WORDS-OF-STRING&POS"), makeSymbol("WORDS-OF-STRING&PRED"), makeSymbol("WORDS-OF-STRING&SPEECH-PART")});
  }

  //// Initializers

  public void declareFunctions() {
    declare_secure_translation_file();
  }

  public void initializeVariables() {
    init_secure_translation_file();
  }

  public void runTopLevelForms() {
    setup_secure_translation_file();
  }

}
