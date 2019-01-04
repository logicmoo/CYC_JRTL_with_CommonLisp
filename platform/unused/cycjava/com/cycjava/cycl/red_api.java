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
import com.cyc.cycjava.cycl.dictionary;

public  final class red_api extends SubLTranslatedFile {

  //// Constructor

  private red_api() {}
  public static final SubLFile me = new red_api();
  public static final String myName = "com.cyc.cycjava.cycl.red_api";

  //// Definitions

  @SubL(source = "cycl/red-api.lisp", position = 513) 
  public static SubLSymbol $red_api_object$ = null;

  @SubL(source = "cycl/red-api.lisp", position = 707) 
  public static SubLSymbol $red_filenames$ = null;

  public static final class $red_struct_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $cobj; }
    public SubLObject setField2(SubLObject value) { return $cobj = value; }
    public SubLObject $cobj = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($red_struct_native.class, $sym0$RED_STRUCT, $sym1$RED_STRUCT_P, $list2, $list3, new String[] {"$cobj"}, $list4, $list5, $sym6$PRINT_RED_STRUCT);
  }

  @SubL(source = "cycl/red-api.lisp", position = 748) 
  public static SubLSymbol $dtp_red_struct$ = null;

  @SubL(source = "cycl/red-api.lisp", position = 748) 
  public static final SubLObject red_struct_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7801");
    return NIL;
  }

  public static final class $red_struct_p$UnaryFunction extends UnaryFunction {
    public $red_struct_p$UnaryFunction() { super(extractFunctionNamed("RED-STRUCT-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7889"); }
  }

  public static final class $red_repository_struct_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $filename; }
    public SubLObject setField2(SubLObject value) { return $filename = value; }
    public SubLObject $filename = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($red_repository_struct_native.class, $sym12$RED_REPOSITORY_STRUCT, $sym13$RED_REPOSITORY_STRUCT_P, $list14, $list15, new String[] {"$filename"}, $list16, $list17, $sym18$PRINT_RED_REPOSITORY_STRUCT);
  }

  @SubL(source = "cycl/red-api.lisp", position = 1025) 
  public static SubLSymbol $dtp_red_repository_struct$ = null;

  @SubL(source = "cycl/red-api.lisp", position = 1025) 
  public static final SubLObject red_repository_struct_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7800");
    return NIL;
  }

  public static final class $red_repository_struct_p$UnaryFunction extends UnaryFunction {
    public $red_repository_struct_p$UnaryFunction() { super(extractFunctionNamed("RED-REPOSITORY-STRUCT-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7888"); }
  }

  public static final class $red_repository_list_struct_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $type; }
    public SubLObject setField2(SubLObject value) { return $type = value; }
    public SubLObject $type = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($red_repository_list_struct_native.class, $sym39$RED_REPOSITORY_LIST_STRUCT, $sym40$RED_REPOSITORY_LIST_STRUCT_P, $list41, $list42, new String[] {"$type"}, $list43, $list44, $sym45$PRINT_RED_REPOSITORY_LIST_STRUCT);
  }

  @SubL(source = "cycl/red-api.lisp", position = 4853) 
  public static SubLSymbol $dtp_red_repository_list_struct$ = null;

  @SubL(source = "cycl/red-api.lisp", position = 4853) 
  public static final SubLObject red_repository_list_struct_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7799");
    return NIL;
  }

  public static final class $red_repository_list_struct_p$UnaryFunction extends UnaryFunction {
    public $red_repository_list_struct_p$UnaryFunction() { super(extractFunctionNamed("RED-REPOSITORY-LIST-STRUCT-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7886"); }
  }

  public static final class $red_element_struct_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $repository_list; }
    public SubLObject getField3() { return $key_string; }
    public SubLObject setField2(SubLObject value) { return $repository_list = value; }
    public SubLObject setField3(SubLObject value) { return $key_string = value; }
    public SubLObject $repository_list = NIL;
    public SubLObject $key_string = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($red_element_struct_native.class, $sym63$RED_ELEMENT_STRUCT, $sym64$RED_ELEMENT_STRUCT_P, $list65, $list66, new String[] {"$repository_list", "$key_string"}, $list67, $list68, $sym69$PRINT_RED_ELEMENT_STRUCT);
  }

  @SubL(source = "cycl/red-api.lisp", position = 6895) 
  public static SubLSymbol $dtp_red_element_struct$ = null;

  @SubL(source = "cycl/red-api.lisp", position = 6895) 
  public static final SubLObject red_element_struct_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7798");
    return NIL;
  }

  public static final class $red_element_struct_p$UnaryFunction extends UnaryFunction {
    public $red_element_struct_p$UnaryFunction() { super(extractFunctionNamed("RED-ELEMENT-STRUCT-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7825"); }
  }

  public static final SubLObject declare_red_api_file() {
    declareFunction(myName, "red_struct_print_function_trampoline", "RED-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "red_struct_p", "RED-STRUCT-P", 1, 0, false); new $red_struct_p$UnaryFunction();
    //declareFunction(myName, "red_struct_cobj", "RED-STRUCT-COBJ", 1, 0, false);
    //declareFunction(myName, "_csetf_red_struct_cobj", "_CSETF-RED-STRUCT-COBJ", 2, 0, false);
    //declareFunction(myName, "make_red_struct", "MAKE-RED-STRUCT", 0, 1, false);
    declareFunction(myName, "red_repository_struct_print_function_trampoline", "RED-REPOSITORY-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "red_repository_struct_p", "RED-REPOSITORY-STRUCT-P", 1, 0, false); new $red_repository_struct_p$UnaryFunction();
    //declareFunction(myName, "red_repository_struct_filename", "RED-REPOSITORY-STRUCT-FILENAME", 1, 0, false);
    //declareFunction(myName, "_csetf_red_repository_struct_filename", "_CSETF-RED-REPOSITORY-STRUCT-FILENAME", 2, 0, false);
    //declareFunction(myName, "make_red_repository_struct", "MAKE-RED-REPOSITORY-STRUCT", 0, 1, false);
    //declareFunction(myName, "red_struct_create", "RED-STRUCT-CREATE", 0, 0, false);
    //declareFunction(myName, "print_red_struct", "PRINT-RED-STRUCT", 3, 0, false);
    //declareFunction(myName, "red_repository_struct_create", "RED-REPOSITORY-STRUCT-CREATE", 1, 0, false);
    //declareFunction(myName, "red_repository_object_wrap", "RED-REPOSITORY-OBJECT-WRAP", 1, 0, false);
    //declareFunction(myName, "red_repository_get_repository_object", "RED-REPOSITORY-GET-REPOSITORY-OBJECT", 1, 0, false);
    //declareFunction(myName, "print_red_repository_struct", "PRINT-RED-REPOSITORY-STRUCT", 3, 0, false);
    //declareFunction(myName, "red_repository_struct_valid_p", "RED-REPOSITORY-STRUCT-VALID-P", 1, 0, false);
    //declareFunction(myName, "red_repository_object_valid_p", "RED-REPOSITORY-OBJECT-VALID-P", 1, 0, false);
    declareFunction(myName, "red_repository_list_struct_print_function_trampoline", "RED-REPOSITORY-LIST-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "red_repository_list_struct_p", "RED-REPOSITORY-LIST-STRUCT-P", 1, 0, false); new $red_repository_list_struct_p$UnaryFunction();
    //declareFunction(myName, "red_repository_list_struct_type", "RED-REPOSITORY-LIST-STRUCT-TYPE", 1, 0, false);
    //declareFunction(myName, "_csetf_red_repository_list_struct_type", "_CSETF-RED-REPOSITORY-LIST-STRUCT-TYPE", 2, 0, false);
    //declareFunction(myName, "make_red_repository_list_struct", "MAKE-RED-REPOSITORY-LIST-STRUCT", 0, 1, false);
    //declareFunction(myName, "red_repository_list_struct_create", "RED-REPOSITORY-LIST-STRUCT-CREATE", 1, 0, false);
    //declareFunction(myName, "print_red_repository_list_struct", "PRINT-RED-REPOSITORY-LIST-STRUCT", 3, 0, false);
    //declareFunction(myName, "xprint_red_repository_list_struct", "XPRINT-RED-REPOSITORY-LIST-STRUCT", 3, 0, false);
    declareFunction(myName, "red_element_struct_print_function_trampoline", "RED-ELEMENT-STRUCT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "red_element_struct_p", "RED-ELEMENT-STRUCT-P", 1, 0, false); new $red_element_struct_p$UnaryFunction();
    //declareFunction(myName, "red_element_struct_repository_list", "RED-ELEMENT-STRUCT-REPOSITORY-LIST", 1, 0, false);
    //declareFunction(myName, "red_element_struct_key_string", "RED-ELEMENT-STRUCT-KEY-STRING", 1, 0, false);
    //declareFunction(myName, "_csetf_red_element_struct_repository_list", "_CSETF-RED-ELEMENT-STRUCT-REPOSITORY-LIST", 2, 0, false);
    //declareFunction(myName, "_csetf_red_element_struct_key_string", "_CSETF-RED-ELEMENT-STRUCT-KEY-STRING", 2, 0, false);
    //declareFunction(myName, "make_red_element_struct", "MAKE-RED-ELEMENT-STRUCT", 0, 1, false);
    //declareFunction(myName, "red_element_struct_create", "RED-ELEMENT-STRUCT-CREATE", 2, 0, false);
    //declareFunction(myName, "print_red_element_struct", "PRINT-RED-ELEMENT-STRUCT", 3, 0, false);
    //declareFunction(myName, "red_get_repository_list_length", "RED-GET-REPOSITORY-LIST-LENGTH", 1, 0, false);
    //declareFunction(myName, "red_element_get_key", "RED-ELEMENT-GET-KEY", 1, 0, false);
    //declareFunction(myName, "red_element_get_datatype", "RED-ELEMENT-GET-DATATYPE", 1, 0, false);
    //declareFunction(myName, "red_element_get_value", "RED-ELEMENT-GET-VALUE", 1, 0, false);
    //declareFunction(myName, "red_element_get_value_cfasl_decode", "RED-ELEMENT-GET-VALUE-CFASL-DECODE", 1, 0, false);
    //declareFunction(myName, "red_get_element", "RED-GET-ELEMENT", 2, 0, false);
    //declareFunction(myName, "red_element_get_value_type", "RED-ELEMENT-GET-VALUE-TYPE", 1, 0, false);
    //declareFunction(myName, "red_get_element_get_sub_element_by_key", "RED-GET-ELEMENT-GET-SUB-ELEMENT-BY-KEY", 2, 0, false);
    //declareFunction(myName, "red_element_get_sub_elements", "RED-ELEMENT-GET-SUB-ELEMENTS", 1, 0, false);
    //declareFunction(myName, "red_element_get_sub_elements_recursive", "RED-ELEMENT-GET-SUB-ELEMENTS-RECURSIVE", 1, 0, false);
    //declareFunction(myName, "red_get_top_element", "RED-GET-TOP-ELEMENT", 1, 0, false);
    //declareFunction(myName, "red_get_all_elements_of_repository", "RED-GET-ALL-ELEMENTS-OF-REPOSITORY", 1, 0, false);
    //declareFunction(myName, "red_get_repository_get_all_elements", "RED-GET-REPOSITORY-GET-ALL-ELEMENTS", 2, 0, false);
    //declareFunction(myName, "red_get_key_value_type", "RED-GET-KEY-VALUE-TYPE", 2, 0, false);
    //declareFunction(myName, "red_makekey", "RED-MAKEKEY", 2, 0, false);
    //declareFunction(myName, "red_get_filename", "RED-GET-FILENAME", 1, 0, false);
    //declareFunction(myName, "red_get_filename_from_object", "RED-GET-FILENAME-FROM-OBJECT", 1, 0, false);
    //declareFunction(myName, "red_get_repository_with_filename", "RED-GET-REPOSITORY-WITH-FILENAME", 1, 0, false);
    //declareFunction(myName, "red_get_repository_object_with_filename", "RED-GET-REPOSITORY-OBJECT-WITH-FILENAME", 1, 0, false);
    //declareFunction(myName, "red_remove_repository", "RED-REMOVE-REPOSITORY", 1, 0, false);
    //declareFunction(myName, "red_cond_create_repository_filenames", "RED-COND-CREATE-REPOSITORY-FILENAMES", 0, 0, false);
    //declareFunction(myName, "red_get_system_repository", "RED-GET-SYSTEM-REPOSITORY", 0, 1, false);
    //declareFunction(myName, "red_get_machine_repository", "RED-GET-MACHINE-REPOSITORY", 0, 1, false);
    //declareFunction(myName, "red_load_repository", "RED-LOAD-REPOSITORY", 1, 0, false);
    //declareFunction(myName, "red_reload_repository_simple", "RED-RELOAD-REPOSITORY-SIMPLE", 1, 0, false);
    //declareFunction(myName, "red_lookup_repository_struct_by_filename", "RED-LOOKUP-REPOSITORY-STRUCT-BY-FILENAME", 1, 0, false);
    //declareFunction(myName, "red_lookup_repository_object_by_filename", "RED-LOOKUP-REPOSITORY-OBJECT-BY-FILENAME", 1, 0, false);
    //declareFunction(myName, "red_lookup_or_load_repository_object_by_filename", "RED-LOOKUP-OR-LOAD-REPOSITORY-OBJECT-BY-FILENAME", 1, 0, false);
    //declareFunction(myName, "red_load_repository_object", "RED-LOAD-REPOSITORY-OBJECT", 1, 0, false);
    //declareFunction(myName, "red_get_object", "RED-GET-OBJECT", 0, 0, false);
    //declareFunction(myName, "red_get_object_bare", "RED-GET-OBJECT-BARE", 0, 0, false);
    //declareFunction(myName, "red_dispose_object", "RED-DISPOSE-OBJECT", 0, 0, false);
    //declareFunction(myName, "red_element_get_key_exists_p", "RED-ELEMENT-GET-KEY-EXISTS-P", 1, 0, false);
    //declareFunction(myName, "red_element_get_datatype_internal", "RED-ELEMENT-GET-DATATYPE-INTERNAL", 1, 0, false);
    //declareFunction(myName, "red_translate_datatype_string", "RED-TRANSLATE-DATATYPE-STRING", 1, 0, false);
    //declareFunction(myName, "red_repository_list_instantiate", "RED-REPOSITORY-LIST-INSTANTIATE", 1, 0, false);
    //declareFunction(myName, "red_repository_list_dispose", "RED-REPOSITORY-LIST-DISPOSE", 1, 0, false);
    //declareFunction(myName, "red_element_instantiate", "RED-ELEMENT-INSTANTIATE", 1, 0, false);
    //declareFunction(myName, "red_element_dispose", "RED-ELEMENT-DISPOSE", 1, 0, false);
    //declareFunction(myName, "red_int_vector_to_byte_vector", "RED-INT-VECTOR-TO-BYTE-VECTOR", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_red_api_file() {
    $red_api_object$ = deflexical("*RED-API-OBJECT*", NIL);
    $red_filenames$ = deflexical("*RED-FILENAMES*", NIL);
    $dtp_red_struct$ = defconstant("*DTP-RED-STRUCT*", $sym0$RED_STRUCT);
    $dtp_red_repository_struct$ = defconstant("*DTP-RED-REPOSITORY-STRUCT*", $sym12$RED_REPOSITORY_STRUCT);
    $dtp_red_repository_list_struct$ = defconstant("*DTP-RED-REPOSITORY-LIST-STRUCT*", $sym39$RED_REPOSITORY_LIST_STRUCT);
    $dtp_red_element_struct$ = defconstant("*DTP-RED-ELEMENT-STRUCT*", $sym63$RED_ELEMENT_STRUCT);
    return NIL;
  }

  public static final SubLObject setup_red_api_file() {
    // CVS_ID("Id");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_red_struct$.getGlobalValue(), Symbols.symbol_function($sym7$RED_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$RED_STRUCT_COBJ, $sym9$_CSETF_RED_STRUCT_COBJ);
    Equality.identity($sym0$RED_STRUCT);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_red_repository_struct$.getGlobalValue(), Symbols.symbol_function($sym19$RED_REPOSITORY_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym20$RED_REPOSITORY_STRUCT_FILENAME, $sym21$_CSETF_RED_REPOSITORY_STRUCT_FILENAME);
    Equality.identity($sym12$RED_REPOSITORY_STRUCT);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_red_repository_list_struct$.getGlobalValue(), Symbols.symbol_function($sym46$RED_REPOSITORY_LIST_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym47$RED_REPOSITORY_LIST_STRUCT_TYPE, $sym48$_CSETF_RED_REPOSITORY_LIST_STRUCT_TYPE);
    Equality.identity($sym39$RED_REPOSITORY_LIST_STRUCT);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_red_element_struct$.getGlobalValue(), Symbols.symbol_function($sym70$RED_ELEMENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym71$RED_ELEMENT_STRUCT_REPOSITORY_LIST, $sym72$_CSETF_RED_ELEMENT_STRUCT_REPOSITORY_LIST);
    Structures.def_csetf($sym73$RED_ELEMENT_STRUCT_KEY_STRING, $sym74$_CSETF_RED_ELEMENT_STRUCT_KEY_STRING);
    Equality.identity($sym63$RED_ELEMENT_STRUCT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$RED_STRUCT = makeSymbol("RED-STRUCT");
  public static final SubLSymbol $sym1$RED_STRUCT_P = makeSymbol("RED-STRUCT-P");
  public static final SubLList $list2 = list(makeSymbol("COBJ"));
  public static final SubLList $list3 = list(makeKeyword("COBJ"));
  public static final SubLList $list4 = list(makeSymbol("RED-STRUCT-COBJ"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-RED-STRUCT-COBJ"));
  public static final SubLSymbol $sym6$PRINT_RED_STRUCT = makeSymbol("PRINT-RED-STRUCT");
  public static final SubLSymbol $sym7$RED_STRUCT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RED-STRUCT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$RED_STRUCT_COBJ = makeSymbol("RED-STRUCT-COBJ");
  public static final SubLSymbol $sym9$_CSETF_RED_STRUCT_COBJ = makeSymbol("_CSETF-RED-STRUCT-COBJ");
  public static final SubLSymbol $kw10$COBJ = makeKeyword("COBJ");
  public static final SubLString $str11$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym12$RED_REPOSITORY_STRUCT = makeSymbol("RED-REPOSITORY-STRUCT");
  public static final SubLSymbol $sym13$RED_REPOSITORY_STRUCT_P = makeSymbol("RED-REPOSITORY-STRUCT-P");
  public static final SubLList $list14 = list(makeSymbol("FILENAME"));
  public static final SubLList $list15 = list(makeKeyword("FILENAME"));
  public static final SubLList $list16 = list(makeSymbol("RED-REPOSITORY-STRUCT-FILENAME"));
  public static final SubLList $list17 = list(makeSymbol("_CSETF-RED-REPOSITORY-STRUCT-FILENAME"));
  public static final SubLSymbol $sym18$PRINT_RED_REPOSITORY_STRUCT = makeSymbol("PRINT-RED-REPOSITORY-STRUCT");
  public static final SubLSymbol $sym19$RED_REPOSITORY_STRUCT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RED-REPOSITORY-STRUCT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym20$RED_REPOSITORY_STRUCT_FILENAME = makeSymbol("RED-REPOSITORY-STRUCT-FILENAME");
  public static final SubLSymbol $sym21$_CSETF_RED_REPOSITORY_STRUCT_FILENAME = makeSymbol("_CSETF-RED-REPOSITORY-STRUCT-FILENAME");
  public static final SubLSymbol $kw22$FILENAME = makeKeyword("FILENAME");
  public static final SubLSymbol $kw23$RED_SHARED = makeKeyword("RED-SHARED");
  public static final SubLString $str24$__red_struct_obj___s__version____ = makeString("#<red-struct obj: ~s  version = ~s  date= ~s  time = ~s  number-application-repositories ~s  system-repository = ~s machine-repository=~s >");
  public static final SubLSymbol $sym25$RED_GET_VERSION_STRING_IMPLEMENTATION = makeSymbol("RED-GET-VERSION-STRING-IMPLEMENTATION");
  public static final SubLSymbol $sym26$RED_GET_DATE_STRING_IMPLEMENTATION = makeSymbol("RED-GET-DATE-STRING-IMPLEMENTATION");
  public static final SubLSymbol $sym27$RED_GET_TIME_STRING_IMPLEMENTATION = makeSymbol("RED-GET-TIME-STRING-IMPLEMENTATION");
  public static final SubLSymbol $sym28$RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION = makeSymbol("RED-NUMBER-APPLICATION-REPOSITORIES-IMPLEMENTATION");
  public static final SubLString $str29$__red_struct_cobj__nil_ = makeString("#<red-struct cobj: nil>");
  public static final SubLSymbol $sym30$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str31$__red_repository_struct_INVALID__ = makeString("#<red-repository-struct INVALID  ~s>");
  public static final SubLString $str32$__red_repository_struct__name____ = makeString("#<red-repository-struct  name = ~s type = ~s version = ~s date = ~s time = ~s >");
  public static final SubLSymbol $sym33$RED_GET_REPOSITORY_NAME_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-NAME-IMPLEMENTATION");
  public static final SubLSymbol $sym34$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-TYPE-STRING-IMPLEMENTATION");
  public static final SubLSymbol $sym35$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-VERSION-STRING-IMPLEMENTATION");
  public static final SubLSymbol $sym36$RED_GET_REPOSITORY_DATE_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-DATE-IMPLEMENTATION");
  public static final SubLSymbol $sym37$RED_GET_REPOSITORY_TIME_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-TIME-IMPLEMENTATION");
  public static final SubLSymbol $sym38$RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-POINTER-VALID-IMPLEMENTATION");
  public static final SubLSymbol $sym39$RED_REPOSITORY_LIST_STRUCT = makeSymbol("RED-REPOSITORY-LIST-STRUCT");
  public static final SubLSymbol $sym40$RED_REPOSITORY_LIST_STRUCT_P = makeSymbol("RED-REPOSITORY-LIST-STRUCT-P");
  public static final SubLList $list41 = list(makeSymbol("TYPE"));
  public static final SubLList $list42 = list(makeKeyword("TYPE"));
  public static final SubLList $list43 = list(makeSymbol("RED-REPOSITORY-LIST-STRUCT-TYPE"));
  public static final SubLList $list44 = list(makeSymbol("_CSETF-RED-REPOSITORY-LIST-STRUCT-TYPE"));
  public static final SubLSymbol $sym45$PRINT_RED_REPOSITORY_LIST_STRUCT = makeSymbol("PRINT-RED-REPOSITORY-LIST-STRUCT");
  public static final SubLSymbol $sym46$RED_REPOSITORY_LIST_STRUCT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RED-REPOSITORY-LIST-STRUCT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym47$RED_REPOSITORY_LIST_STRUCT_TYPE = makeSymbol("RED-REPOSITORY-LIST-STRUCT-TYPE");
  public static final SubLSymbol $sym48$_CSETF_RED_REPOSITORY_LIST_STRUCT_TYPE = makeSymbol("_CSETF-RED-REPOSITORY-LIST-STRUCT-TYPE");
  public static final SubLSymbol $kw49$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw50$SYSTEM = makeKeyword("SYSTEM");
  public static final SubLSymbol $kw51$MACHINE = makeKeyword("MACHINE");
  public static final SubLSymbol $kw52$MACHINE_SYSTEM = makeKeyword("MACHINE-SYSTEM");
  public static final SubLSymbol $kw53$SYSTEM_MACHINE = makeKeyword("SYSTEM-MACHINE");
  public static final SubLSymbol $kw54$APPLICATION = makeKeyword("APPLICATION");
  public static final SubLSymbol $kw55$MOST_PRIVILEGED = makeKeyword("MOST-PRIVILEGED");
  public static final SubLSymbol $kw56$LEAST_PRIVILEGED = makeKeyword("LEAST-PRIVILEGED");
  public static final SubLString $str57$__red_repository_list_struct_type = makeString("#<red-repository-list-struct type = ~s>");
  public static final SubLString $str58$__red_repository_list_struct_elts = makeString("#<red-repository-list-struct elts = 0 ()>");
  public static final SubLString $str59$__red_repository_list_struct_elts = makeString("#<red-repository-list-struct elts = ~d ( ");
  public static final SubLString $str60$_s_ = makeString("~s ");
  public static final SubLSymbol $sym61$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-LIST-GET-ELEMENT-IMPLEMENTATION");
  public static final SubLString $str62$__ = makeString(")>");
  public static final SubLSymbol $sym63$RED_ELEMENT_STRUCT = makeSymbol("RED-ELEMENT-STRUCT");
  public static final SubLSymbol $sym64$RED_ELEMENT_STRUCT_P = makeSymbol("RED-ELEMENT-STRUCT-P");
  public static final SubLList $list65 = list(makeSymbol("REPOSITORY-LIST"), makeSymbol("KEY-STRING"));
  public static final SubLList $list66 = list(makeKeyword("REPOSITORY-LIST"), makeKeyword("KEY-STRING"));
  public static final SubLList $list67 = list(makeSymbol("RED-ELEMENT-STRUCT-REPOSITORY-LIST"), makeSymbol("RED-ELEMENT-STRUCT-KEY-STRING"));
  public static final SubLList $list68 = list(makeSymbol("_CSETF-RED-ELEMENT-STRUCT-REPOSITORY-LIST"), makeSymbol("_CSETF-RED-ELEMENT-STRUCT-KEY-STRING"));
  public static final SubLSymbol $sym69$PRINT_RED_ELEMENT_STRUCT = makeSymbol("PRINT-RED-ELEMENT-STRUCT");
  public static final SubLSymbol $sym70$RED_ELEMENT_STRUCT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RED-ELEMENT-STRUCT-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym71$RED_ELEMENT_STRUCT_REPOSITORY_LIST = makeSymbol("RED-ELEMENT-STRUCT-REPOSITORY-LIST");
  public static final SubLSymbol $sym72$_CSETF_RED_ELEMENT_STRUCT_REPOSITORY_LIST = makeSymbol("_CSETF-RED-ELEMENT-STRUCT-REPOSITORY-LIST");
  public static final SubLSymbol $sym73$RED_ELEMENT_STRUCT_KEY_STRING = makeSymbol("RED-ELEMENT-STRUCT-KEY-STRING");
  public static final SubLSymbol $sym74$_CSETF_RED_ELEMENT_STRUCT_KEY_STRING = makeSymbol("_CSETF-RED-ELEMENT-STRUCT-KEY-STRING");
  public static final SubLSymbol $kw75$REPOSITORY_LIST = makeKeyword("REPOSITORY-LIST");
  public static final SubLSymbol $kw76$KEY_STRING = makeKeyword("KEY-STRING");
  public static final SubLString $str77$__red_element_struct_key____s_ = makeString("#<red-element-struct key = ~s>");
  public static final SubLSymbol $sym78$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-GET-ELEMENT-IMPLEMENTATION");
  public static final SubLSymbol $sym79$RED_GET_DATATYPE_STRING_IMPLEMENTATION = makeSymbol("RED-GET-DATATYPE-STRING-IMPLEMENTATION");
  public static final SubLString $str80$__red_element_struct_key___s_type = makeString("#<red-element-struct key= ~s type = ~s ");
  public static final SubLSymbol $kw81$STRING = makeKeyword("STRING");
  public static final SubLString $str82$value____s = makeString("value = ~s");
  public static final SubLSymbol $sym83$RED_GET_STRING_VALUE_IMPLEMENTATION = makeSymbol("RED-GET-STRING-VALUE-IMPLEMENTATION");
  public static final SubLSymbol $kw84$INTEGER = makeKeyword("INTEGER");
  public static final SubLString $str85$value____d = makeString("value = ~d");
  public static final SubLSymbol $sym86$RED_GET_INT32_VALUE_IMPLEMENTATION = makeSymbol("RED-GET-INT32-VALUE-IMPLEMENTATION");
  public static final SubLSymbol $kw87$BLOB = makeKeyword("BLOB");
  public static final SubLString $str88$BlobValue____ = makeString("BlobValue = \"");
  public static final SubLString $str89$_x = makeString("~x");
  public static final SubLString $str90$0 = makeString("0");
  public static final SubLString $str91$_a = makeString("~a");
  public static final SubLString $str92$_ = makeString("\"");
  public static final SubLSymbol $kw93$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLString $str94$INVALID_DATA_TYPE = makeString("INVALID DATA TYPE");
  public static final SubLString $str95$_ = makeString(">");
  public static final SubLSymbol $sym96$RED_NUMBER_REPOSITORIES_IMPLEMENTATION = makeSymbol("RED-NUMBER-REPOSITORIES-IMPLEMENTATION");
  public static final SubLSymbol $sym97$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION = makeSymbol("RED-GET-SUPER-ELEMENT-ITERATOR-IMPLEMENTATION");
  public static final SubLString $str98$ = makeString("");
  public static final SubLSymbol $sym99$RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-ITERATOR-HAS-NEXT-IMPLEMENTATION");
  public static final SubLSymbol $sym100$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-ITERATOR-NEXT-IMPLEMENTATION");
  public static final SubLSymbol $sym101$RED_GET_KEY_IMPLEMENTATION = makeSymbol("RED-GET-KEY-IMPLEMENTATION");
  public static final SubLSymbol $sym102$RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-DISPOSE-IMPLEMENTATION");
  public static final SubLSymbol $sym103$RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-ITERATOR-DISPOSE-IMPLEMENTATION");
  public static final SubLSymbol $sym104$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION = makeSymbol("RED-GET-TOP-LEVEL-KEY-IMPLEMENTATION");
  public static final SubLSymbol $sym105$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION = makeSymbol("RED-GET-SUBKEY-ITERATOR-IMPLEMENTATION");
  public static final SubLSymbol $sym106$RED_ITERATOR_HAS_NEXT_IMPLEMENTATION = makeSymbol("RED-ITERATOR-HAS-NEXT-IMPLEMENTATION");
  public static final SubLSymbol $sym107$RED_ITERATOR_NEXT_IMPLEMENTATION = makeSymbol("RED-ITERATOR-NEXT-IMPLEMENTATION");
  public static final SubLSymbol $sym108$RED_ITERATOR_DISPOSE_IMPLEMENTATION = makeSymbol("RED-ITERATOR-DISPOSE-IMPLEMENTATION");
  public static final SubLSymbol $kw109$INVALID = makeKeyword("INVALID");
  public static final SubLString $str110$_ = makeString(".");
  public static final SubLSymbol $sym111$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-FILENAME-IMPLEMENTATION");
  public static final SubLSymbol $sym112$RED_REPOSITORY_OBJECT_VALID_P = makeSymbol("RED-REPOSITORY-OBJECT-VALID-P");
  public static final SubLSymbol $sym113$RED_REPOSITORY_DISPOSE_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-DISPOSE-IMPLEMENTATION");
  public static final SubLSymbol $sym114$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION = makeSymbol("RED-GET-SYSTEM-REPOSITORY-IMPLEMENTATION");
  public static final SubLSymbol $sym115$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION = makeSymbol("RED-GET-MACHINE-REPOSITORY-IMPLEMENTATION");
  public static final SubLSymbol $sym116$RED_LOAD_REPOSITORY_IMPLEMENTATION = makeSymbol("RED-LOAD-REPOSITORY-IMPLEMENTATION");
  public static final SubLSymbol $sym117$RED_DISPOSE_IMPLEMENTATION = makeSymbol("RED-DISPOSE-IMPLEMENTATION");
  public static final SubLString $str118$string = makeString("string");
  public static final SubLString $str119$integer = makeString("integer");
  public static final SubLString $str120$blob = makeString("blob");
  public static final SubLSymbol $sym121$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION = makeSymbol("RED-MAKE-REPOSITORY-LIST-FROM-REPOSITORY-IMPLEMENTATION");
  public static final SubLSymbol $sym122$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-LIST-NEW-IMPLEMENTATION");
  public static final SubLSymbol $sym123$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-LIST-ADD-REPOSITORY-IMPLEMENTATION");
  public static final SubLSymbol $sym124$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION = makeSymbol("RED-GET-APPLICATION-REPOSITORIES-IMPLEMENTATION");
  public static final SubLSymbol $sym125$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-LIST-MOST-PRIVILEGED-FIRST-IMPLEMENTATION");
  public static final SubLSymbol $sym126$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-LIST-LEAST-PRIVILEGED-FIRST-IMPLEMENTATION");
  public static final SubLSymbol $sym127$RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-LIST-DISPOSE-IMPLEMENTATION");
  public static final SubLSymbol $sym128$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION = makeSymbol("RED-GET-TOP-LEVEL-SUPER-ELEMENT-IMPLEMENTATION");
  public static final SubLSymbol $sym129$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION = makeSymbol("RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-LIST-IMPLEMENTATION");
  public static final SubLSymbol $sym130$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-GET-REPOSITORY-LIST-IMPLEMENTATION");

  //// Initializers

  public void declareFunctions() {
    declare_red_api_file();
  }

  public void initializeVariables() {
    init_red_api_file();
  }

  public void runTopLevelForms() {
    setup_red_api_file();
  }

}
