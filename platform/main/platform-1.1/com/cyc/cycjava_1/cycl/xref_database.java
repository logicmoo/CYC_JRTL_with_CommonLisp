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
//dm import com.cyc.cycjava_1.cycl.c_name_translation;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.java_name_translation;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_translation;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class xref_database extends SubLTranslatedFile {

  //// Constructor

  private xref_database() {}
  public static final SubLFile me = new xref_database();
  public static final String myName = "com.cyc.cycjava_1.cycl.xref_database";

  //// Definitions

  @SubL(source = "cycl/xref-database.lisp", position = 942) 
  public static SubLSymbol $empty_set_contents$ = null;

  public static final class $xref_module_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $name; }
    public SubLObject getField3() { return $xref_system; }
    public SubLObject getField4() { return $features; }
    public SubLObject getField5() { return $method_definitions; }
    public SubLObject getField6() { return $method_position_table; }
    public SubLObject getField7() { return $method_method_table; }
    public SubLObject getField8() { return $method_global_reference_table; }
    public SubLObject getField9() { return $method_global_modification_table; }
    public SubLObject getField10() { return $method_global_binding_table; }
    public SubLObject getField11() { return $global_definitions; }
    public SubLObject getField12() { return $global_position_table; }
    public SubLObject getField13() { return $global_method_table; }
    public SubLObject getField14() { return $global_global_reference_table; }
    public SubLObject getField15() { return $top_method_table; }
    public SubLObject getField16() { return $top_global_reference_table; }
    public SubLObject getField17() { return $top_global_modification_table; }
    public SubLObject getField18() { return $top_global_binding_table; }
    public SubLObject getField19() { return $method_formal_arglist_table; }
    public SubLObject getField20() { return $global_binding_type_table; }
    public SubLObject setField2(SubLObject value) { return $name = value; }
    public SubLObject setField3(SubLObject value) { return $xref_system = value; }
    public SubLObject setField4(SubLObject value) { return $features = value; }
    public SubLObject setField5(SubLObject value) { return $method_definitions = value; }
    public SubLObject setField6(SubLObject value) { return $method_position_table = value; }
    public SubLObject setField7(SubLObject value) { return $method_method_table = value; }
    public SubLObject setField8(SubLObject value) { return $method_global_reference_table = value; }
    public SubLObject setField9(SubLObject value) { return $method_global_modification_table = value; }
    public SubLObject setField10(SubLObject value) { return $method_global_binding_table = value; }
    public SubLObject setField11(SubLObject value) { return $global_definitions = value; }
    public SubLObject setField12(SubLObject value) { return $global_position_table = value; }
    public SubLObject setField13(SubLObject value) { return $global_method_table = value; }
    public SubLObject setField14(SubLObject value) { return $global_global_reference_table = value; }
    public SubLObject setField15(SubLObject value) { return $top_method_table = value; }
    public SubLObject setField16(SubLObject value) { return $top_global_reference_table = value; }
    public SubLObject setField17(SubLObject value) { return $top_global_modification_table = value; }
    public SubLObject setField18(SubLObject value) { return $top_global_binding_table = value; }
    public SubLObject setField19(SubLObject value) { return $method_formal_arglist_table = value; }
    public SubLObject setField20(SubLObject value) { return $global_binding_type_table = value; }
    public SubLObject $name = NIL;
    public SubLObject $xref_system = NIL;
    public SubLObject $features = NIL;
    public SubLObject $method_definitions = NIL;
    public SubLObject $method_position_table = NIL;
    public SubLObject $method_method_table = NIL;
    public SubLObject $method_global_reference_table = NIL;
    public SubLObject $method_global_modification_table = NIL;
    public SubLObject $method_global_binding_table = NIL;
    public SubLObject $global_definitions = NIL;
    public SubLObject $global_position_table = NIL;
    public SubLObject $global_method_table = NIL;
    public SubLObject $global_global_reference_table = NIL;
    public SubLObject $top_method_table = NIL;
    public SubLObject $top_global_reference_table = NIL;
    public SubLObject $top_global_modification_table = NIL;
    public SubLObject $top_global_binding_table = NIL;
    public SubLObject $method_formal_arglist_table = NIL;
    public SubLObject $global_binding_type_table = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($xref_module_native.class, $sym0$XREF_MODULE, $sym1$XREF_MODULE_P, $list2, $list3, new String[] {"$name", "$xref_system", "$features", "$method_definitions", "$method_position_table", "$method_method_table", "$method_global_reference_table", "$method_global_modification_table", "$method_global_binding_table", "$global_definitions", "$global_position_table", "$global_method_table", "$global_global_reference_table", "$top_method_table", "$top_global_reference_table", "$top_global_modification_table", "$top_global_binding_table", "$method_formal_arglist_table", "$global_binding_type_table"}, $list4, $list5, $sym6$PRINT_XREF_MODULE);
  }

  @SubL(source = "cycl/xref-database.lisp", position = 1809) 
  public static SubLSymbol $dtp_xref_module$ = null;

  @SubL(source = "cycl/xref-database.lisp", position = 1809) 
  public static final SubLObject xref_module_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8269");
    return NIL;
  }

  public static final class $xref_module_p$UnaryFunction extends UnaryFunction {
    public $xref_module_p$UnaryFunction() { super(extractFunctionNamed("XREF-MODULE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8434"); }
  }

  @SubL(source = "cycl/xref-database.lisp", position = 5333) 
  public static final SubLObject sxhash_xref_module_method(SubLObject object) {
    return Sxhash.sxhash(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8380"));
  }

  public static final class $xref_system_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $name; }
    public SubLObject getField3() { return $features; }
    public SubLObject getField4() { return $xref_module_table; }
    public SubLObject getField5() { return $method_definition_table; }
    public SubLObject getField6() { return $global_definition_table; }
    public SubLObject getField7() { return $method_called_by_method_table; }
    public SubLObject getField8() { return $method_called_by_global_table; }
    public SubLObject getField9() { return $method_called_at_top_level_table; }
    public SubLObject getField10() { return $global_referenced_by_method_table; }
    public SubLObject getField11() { return $global_modified_by_method_table; }
    public SubLObject getField12() { return $global_rebound_by_method_table; }
    public SubLObject getField13() { return $global_referenced_by_global_table; }
    public SubLObject getField14() { return $global_referenced_at_top_level_table; }
    public SubLObject getField15() { return $global_modified_at_top_level_table; }
    public SubLObject getField16() { return $global_rebound_at_top_level_table; }
    public SubLObject setField2(SubLObject value) { return $name = value; }
    public SubLObject setField3(SubLObject value) { return $features = value; }
    public SubLObject setField4(SubLObject value) { return $xref_module_table = value; }
    public SubLObject setField5(SubLObject value) { return $method_definition_table = value; }
    public SubLObject setField6(SubLObject value) { return $global_definition_table = value; }
    public SubLObject setField7(SubLObject value) { return $method_called_by_method_table = value; }
    public SubLObject setField8(SubLObject value) { return $method_called_by_global_table = value; }
    public SubLObject setField9(SubLObject value) { return $method_called_at_top_level_table = value; }
    public SubLObject setField10(SubLObject value) { return $global_referenced_by_method_table = value; }
    public SubLObject setField11(SubLObject value) { return $global_modified_by_method_table = value; }
    public SubLObject setField12(SubLObject value) { return $global_rebound_by_method_table = value; }
    public SubLObject setField13(SubLObject value) { return $global_referenced_by_global_table = value; }
    public SubLObject setField14(SubLObject value) { return $global_referenced_at_top_level_table = value; }
    public SubLObject setField15(SubLObject value) { return $global_modified_at_top_level_table = value; }
    public SubLObject setField16(SubLObject value) { return $global_rebound_at_top_level_table = value; }
    public SubLObject $name = NIL;
    public SubLObject $features = NIL;
    public SubLObject $xref_module_table = NIL;
    public SubLObject $method_definition_table = NIL;
    public SubLObject $global_definition_table = NIL;
    public SubLObject $method_called_by_method_table = NIL;
    public SubLObject $method_called_by_global_table = NIL;
    public SubLObject $method_called_at_top_level_table = NIL;
    public SubLObject $global_referenced_by_method_table = NIL;
    public SubLObject $global_modified_by_method_table = NIL;
    public SubLObject $global_rebound_by_method_table = NIL;
    public SubLObject $global_referenced_by_global_table = NIL;
    public SubLObject $global_referenced_at_top_level_table = NIL;
    public SubLObject $global_modified_at_top_level_table = NIL;
    public SubLObject $global_rebound_at_top_level_table = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($xref_system_native.class, $sym110$XREF_SYSTEM, $sym72$XREF_SYSTEM_P, $list111, $list112, new String[] {"$name", "$features", "$xref_module_table", "$method_definition_table", "$global_definition_table", "$method_called_by_method_table", "$method_called_by_global_table", "$method_called_at_top_level_table", "$global_referenced_by_method_table", "$global_modified_by_method_table", "$global_rebound_by_method_table", "$global_referenced_by_global_table", "$global_referenced_at_top_level_table", "$global_modified_at_top_level_table", "$global_rebound_at_top_level_table"}, $list113, $list114, $sym115$PRINT_XREF_SYSTEM);
  }

  @SubL(source = "cycl/xref-database.lisp", position = 17800) 
  public static SubLSymbol $dtp_xref_system$ = null;

  @SubL(source = "cycl/xref-database.lisp", position = 17800) 
  public static final SubLObject xref_system_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8270");
    return NIL;
  }

  public static final class $xref_system_p$UnaryFunction extends UnaryFunction {
    public $xref_system_p$UnaryFunction() { super(extractFunctionNamed("XREF-SYSTEM-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8493"); }
  }

  @SubL(source = "cycl/xref-database.lisp", position = 87636) 
  public static SubLSymbol $current_xref_module$ = null;

  @SubL(source = "cycl/xref-database.lisp", position = 88227) 
  public static SubLSymbol $xref_module_scope$ = null;

  @SubL(source = "cycl/xref-database.lisp", position = 88682) 
  public static SubLSymbol $xref_file_position_scope$ = null;

  @SubL(source = "cycl/xref-database.lisp", position = 89319) 
  public static SubLSymbol $xref_method_scope$ = null;

  @SubL(source = "cycl/xref-database.lisp", position = 89716) 
  public static SubLSymbol $xref_global_scope$ = null;

  /** When T, trace the progress of translation. */
  @SubL(source = "cycl/xref-database.lisp", position = 94425) 
  public static SubLSymbol $xref_trace$ = null;

  public static final SubLObject declare_xref_database_file() {
    declareFunction(myName, "xref_module_print_function_trampoline", "XREF-MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "xref_module_p", "XREF-MODULE-P", 1, 0, false); new $xref_module_p$UnaryFunction();
    //declareFunction(myName, "xref_m_name", "XREF-M-NAME", 1, 0, false);
    //declareFunction(myName, "xref_m_xref_system", "XREF-M-XREF-SYSTEM", 1, 0, false);
    //declareFunction(myName, "xref_m_features", "XREF-M-FEATURES", 1, 0, false);
    //declareFunction(myName, "xref_m_method_definitions", "XREF-M-METHOD-DEFINITIONS", 1, 0, false);
    //declareFunction(myName, "xref_m_method_position_table", "XREF-M-METHOD-POSITION-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_method_method_table", "XREF-M-METHOD-METHOD-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_method_global_reference_table", "XREF-M-METHOD-GLOBAL-REFERENCE-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_method_global_modification_table", "XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_method_global_binding_table", "XREF-M-METHOD-GLOBAL-BINDING-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_global_definitions", "XREF-M-GLOBAL-DEFINITIONS", 1, 0, false);
    //declareFunction(myName, "xref_m_global_position_table", "XREF-M-GLOBAL-POSITION-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_global_method_table", "XREF-M-GLOBAL-METHOD-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_global_global_reference_table", "XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_top_method_table", "XREF-M-TOP-METHOD-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_top_global_reference_table", "XREF-M-TOP-GLOBAL-REFERENCE-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_top_global_modification_table", "XREF-M-TOP-GLOBAL-MODIFICATION-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_top_global_binding_table", "XREF-M-TOP-GLOBAL-BINDING-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_method_formal_arglist_table", "XREF-M-METHOD-FORMAL-ARGLIST-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_m_global_binding_type_table", "XREF-M-GLOBAL-BINDING-TYPE-TABLE", 1, 0, false);
    //declareFunction(myName, "_csetf_xref_m_name", "_CSETF-XREF-M-NAME", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_xref_system", "_CSETF-XREF-M-XREF-SYSTEM", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_features", "_CSETF-XREF-M-FEATURES", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_method_definitions", "_CSETF-XREF-M-METHOD-DEFINITIONS", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_method_position_table", "_CSETF-XREF-M-METHOD-POSITION-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_method_method_table", "_CSETF-XREF-M-METHOD-METHOD-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_method_global_reference_table", "_CSETF-XREF-M-METHOD-GLOBAL-REFERENCE-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_method_global_modification_table", "_CSETF-XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_method_global_binding_table", "_CSETF-XREF-M-METHOD-GLOBAL-BINDING-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_global_definitions", "_CSETF-XREF-M-GLOBAL-DEFINITIONS", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_global_position_table", "_CSETF-XREF-M-GLOBAL-POSITION-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_global_method_table", "_CSETF-XREF-M-GLOBAL-METHOD-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_global_global_reference_table", "_CSETF-XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_top_method_table", "_CSETF-XREF-M-TOP-METHOD-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_top_global_reference_table", "_CSETF-XREF-M-TOP-GLOBAL-REFERENCE-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_top_global_modification_table", "_CSETF-XREF-M-TOP-GLOBAL-MODIFICATION-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_top_global_binding_table", "_CSETF-XREF-M-TOP-GLOBAL-BINDING-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_method_formal_arglist_table", "_CSETF-XREF-M-METHOD-FORMAL-ARGLIST-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_m_global_binding_type_table", "_CSETF-XREF-M-GLOBAL-BINDING-TYPE-TABLE", 2, 0, false);
    //declareFunction(myName, "make_xref_module", "MAKE-XREF-MODULE", 0, 1, false);
    //declareFunction(myName, "print_xref_module", "PRINT-XREF-MODULE", 3, 0, false);
    declareFunction(myName, "sxhash_xref_module_method", "SXHASH-XREF-MODULE-METHOD", 1, 0, false);
    //declareFunction(myName, "new_xref_module", "NEW-XREF-MODULE", 3, 0, false);
    //declareMacro(myName, "do_xrm_method_definitions", "DO-XRM-METHOD-DEFINITIONS");
    //declareFunction(myName, "xrm_method_definitions", "XRM-METHOD-DEFINITIONS", 1, 0, false);
    //declareMacro(myName, "do_xrm_methods", "DO-XRM-METHODS");
    //declareFunction(myName, "xrm_method_position_table", "XRM-METHOD-POSITION-TABLE", 1, 0, false);
    //declareMacro(myName, "do_xrm_global_definitions", "DO-XRM-GLOBAL-DEFINITIONS");
    //declareFunction(myName, "xrm_global_definitions", "XRM-GLOBAL-DEFINITIONS", 1, 0, false);
    //declareMacro(myName, "do_xrm_globals", "DO-XRM-GLOBALS");
    //declareFunction(myName, "xrm_global_position_table", "XRM-GLOBAL-POSITION-TABLE", 1, 0, false);
    //declareFunction(myName, "xrm_name", "XRM-NAME", 1, 0, false);
    //declareFunction(myName, "xrm_xref_system", "XRM-XREF-SYSTEM", 1, 0, false);
    //declareFunction(myName, "xrm_module_features", "XRM-MODULE-FEATURES", 1, 0, false);
    //declareFunction(myName, "xrm_method_definition_count", "XRM-METHOD-DEFINITION-COUNT", 2, 0, false);
    //declareFunction(myName, "xrm_total_method_definition_count", "XRM-TOTAL-METHOD-DEFINITION-COUNT", 1, 0, false);
    //declareFunction(myName, "xrm_total_method_count", "XRM-TOTAL-METHOD-COUNT", 1, 0, false);
    //declareFunction(myName, "xrm_has_multiple_method_definitionsP", "XRM-HAS-MULTIPLE-METHOD-DEFINITIONS?", 1, 0, false);
    //declareFunction(myName, "xrm_global_definition_count", "XRM-GLOBAL-DEFINITION-COUNT", 2, 0, false);
    //declareFunction(myName, "xrm_total_global_definition_count", "XRM-TOTAL-GLOBAL-DEFINITION-COUNT", 1, 0, false);
    //declareFunction(myName, "xrm_total_global_count", "XRM-TOTAL-GLOBAL-COUNT", 1, 0, false);
    //declareFunction(myName, "xrm_has_multiple_global_definitionsP", "XRM-HAS-MULTIPLE-GLOBAL-DEFINITIONS?", 1, 0, false);
    //declareFunction(myName, "xrm_method_definition_postion", "XRM-METHOD-DEFINITION-POSTION", 2, 0, false);
    //declareFunction(myName, "xrm_method_definition_positions", "XRM-METHOD-DEFINITION-POSITIONS", 2, 0, false);
    //declareFunction(myName, "xrm_global_definition_postion", "XRM-GLOBAL-DEFINITION-POSTION", 2, 0, false);
    //declareFunction(myName, "xrm_global_definition_positions", "XRM-GLOBAL-DEFINITION-POSITIONS", 2, 0, false);
    //declareFunction(myName, "xrm_method_formal_arglist", "XRM-METHOD-FORMAL-ARGLIST", 2, 0, false);
    //declareFunction(myName, "xrm_global_binding_type", "XRM-GLOBAL-BINDING-TYPE", 2, 0, false);
    //declareFunction(myName, "xrm_record_method_definition", "XRM-RECORD-METHOD-DEFINITION", 3, 0, false);
    //declareFunction(myName, "xrm_unrecord_method_definition", "XRM-UNRECORD-METHOD-DEFINITION", 2, 0, false);
    //declareFunction(myName, "xrm_record_method_formal_arglist", "XRM-RECORD-METHOD-FORMAL-ARGLIST", 3, 0, false);
    //declareFunction(myName, "xrm_record_global_binding_type", "XRM-RECORD-GLOBAL-BINDING-TYPE", 3, 0, false);
    //declareFunction(myName, "xrm_record_global_definition", "XRM-RECORD-GLOBAL-DEFINITION", 3, 0, false);
    //declareFunction(myName, "xrm_unrecord_global_definition", "XRM-UNRECORD-GLOBAL-DEFINITION", 2, 0, false);
    //declareFunction(myName, "xrm_record_method_calls_method", "XRM-RECORD-METHOD-CALLS-METHOD", 3, 0, false);
    //declareFunction(myName, "xrm_record_method_references_global", "XRM-RECORD-METHOD-REFERENCES-GLOBAL", 3, 0, false);
    //declareFunction(myName, "xrm_record_method_modifies_global", "XRM-RECORD-METHOD-MODIFIES-GLOBAL", 3, 0, false);
    //declareFunction(myName, "xrm_record_method_rebinds_global", "XRM-RECORD-METHOD-REBINDS-GLOBAL", 3, 0, false);
    //declareFunction(myName, "xrm_record_global_calls_method", "XRM-RECORD-GLOBAL-CALLS-METHOD", 3, 0, false);
    //declareFunction(myName, "xrm_record_global_references_global", "XRM-RECORD-GLOBAL-REFERENCES-GLOBAL", 3, 0, false);
    //declareFunction(myName, "xrm_record_top_calls_method", "XRM-RECORD-TOP-CALLS-METHOD", 3, 0, false);
    //declareFunction(myName, "xrm_record_top_references_global", "XRM-RECORD-TOP-REFERENCES-GLOBAL", 3, 0, false);
    //declareFunction(myName, "xrm_record_top_modifies_global", "XRM-RECORD-TOP-MODIFIES-GLOBAL", 3, 0, false);
    //declareFunction(myName, "xrm_record_top_rebinds_global", "XRM-RECORD-TOP-REBINDS-GLOBAL", 3, 0, false);
    declareFunction(myName, "xref_system_print_function_trampoline", "XREF-SYSTEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "xref_system_p", "XREF-SYSTEM-P", 1, 0, false); new $xref_system_p$UnaryFunction();
    //declareFunction(myName, "xref_s_name", "XREF-S-NAME", 1, 0, false);
    //declareFunction(myName, "xref_s_features", "XREF-S-FEATURES", 1, 0, false);
    //declareFunction(myName, "xref_s_xref_module_table", "XREF-S-XREF-MODULE-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_method_definition_table", "XREF-S-METHOD-DEFINITION-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_global_definition_table", "XREF-S-GLOBAL-DEFINITION-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_method_called_by_method_table", "XREF-S-METHOD-CALLED-BY-METHOD-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_method_called_by_global_table", "XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_method_called_at_top_level_table", "XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_global_referenced_by_method_table", "XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_global_modified_by_method_table", "XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_global_rebound_by_method_table", "XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_global_referenced_by_global_table", "XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_global_referenced_at_top_level_table", "XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_global_modified_at_top_level_table", "XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE", 1, 0, false);
    //declareFunction(myName, "xref_s_global_rebound_at_top_level_table", "XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE", 1, 0, false);
    //declareFunction(myName, "_csetf_xref_s_name", "_CSETF-XREF-S-NAME", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_features", "_CSETF-XREF-S-FEATURES", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_xref_module_table", "_CSETF-XREF-S-XREF-MODULE-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_method_definition_table", "_CSETF-XREF-S-METHOD-DEFINITION-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_global_definition_table", "_CSETF-XREF-S-GLOBAL-DEFINITION-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_method_called_by_method_table", "_CSETF-XREF-S-METHOD-CALLED-BY-METHOD-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_method_called_by_global_table", "_CSETF-XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_method_called_at_top_level_table", "_CSETF-XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_global_referenced_by_method_table", "_CSETF-XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_global_modified_by_method_table", "_CSETF-XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_global_rebound_by_method_table", "_CSETF-XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_global_referenced_by_global_table", "_CSETF-XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_global_referenced_at_top_level_table", "_CSETF-XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_global_modified_at_top_level_table", "_CSETF-XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE", 2, 0, false);
    //declareFunction(myName, "_csetf_xref_s_global_rebound_at_top_level_table", "_CSETF-XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE", 2, 0, false);
    //declareFunction(myName, "make_xref_system", "MAKE-XREF-SYSTEM", 0, 1, false);
    //declareFunction(myName, "print_xref_system", "PRINT-XREF-SYSTEM", 3, 0, false);
    //declareFunction(myName, "new_xref_system", "NEW-XREF-SYSTEM", 2, 0, false);
    //declareFunction(myName, "xrs_name", "XRS-NAME", 1, 0, false);
    //declareFunction(myName, "xrs_features", "XRS-FEATURES", 1, 0, false);
    //declareFunction(myName, "xrs_module_count", "XRS-MODULE-COUNT", 1, 0, false);
    //declareFunction(myName, "xrs_lookup_module", "XRS-LOOKUP-MODULE", 2, 0, false);
    //declareFunction(myName, "xrs_method_defining_xrm", "XRS-METHOD-DEFINING-XRM", 2, 0, false);
    //declareFunction(myName, "xrs_method_defining_xrms", "XRS-METHOD-DEFINING-XRMS", 2, 0, false);
    //declareFunction(myName, "xrs_method_definition_count", "XRS-METHOD-DEFINITION-COUNT", 2, 0, false);
    //declareFunction(myName, "xrs_global_defining_xrm", "XRS-GLOBAL-DEFINING-XRM", 2, 0, false);
    //declareFunction(myName, "xrs_global_defining_xrms", "XRS-GLOBAL-DEFINING-XRMS", 2, 0, false);
    //declareFunction(myName, "xrs_global_definition_count", "XRS-GLOBAL-DEFINITION-COUNT", 2, 0, false);
    //declareFunction(myName, "xrs_possibly_note_module_features", "XRS-POSSIBLY-NOTE-MODULE-FEATURES", 3, 0, false);
    //declareFunction(myName, "current_xref_system", "CURRENT-XREF-SYSTEM", 0, 0, false);
    //declareFunction(myName, "current_xref_system_modules", "CURRENT-XREF-SYSTEM-MODULES", 0, 0, false);
    //declareFunction(myName, "current_xref_system_features", "CURRENT-XREF-SYSTEM-FEATURES", 0, 0, false);
    //declareFunction(myName, "current_xref_system_relevant_modules", "CURRENT-XREF-SYSTEM-RELEVANT-MODULES", 1, 0, false);
    //declareFunction(myName, "current_xref_module_p", "CURRENT-XREF-MODULE-P", 1, 0, false);
    //declareFunction(myName, "xref_find_xrm_by_module", "XREF-FIND-XRM-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_module_features", "XREF-MODULE-FEATURES", 1, 0, false);
    //declareFunction(myName, "xref_module_input_filename", "XREF-MODULE-INPUT-FILENAME", 1, 0, false);
    //declareFunction(myName, "xref_predefined_method_p", "XREF-PREDEFINED-METHOD-P", 1, 0, false);
    //declareFunction(myName, "xref_predefined_global_p", "XREF-PREDEFINED-GLOBAL-P", 1, 0, false);
    //declareFunction(myName, "xref_method_formal_arglist", "XREF-METHOD-FORMAL-ARGLIST", 1, 0, false);
    //declareFunction(myName, "method_formal_arglist", "METHOD-FORMAL-ARGLIST", 1, 0, false);
    //declareFunction(myName, "xref_global_binding_type", "XREF-GLOBAL-BINDING-TYPE", 1, 0, false);
    //declareFunction(myName, "xref_method_definition_count", "XREF-METHOD-DEFINITION-COUNT", 1, 0, false);
    //declareFunction(myName, "xref_method_undefinedP", "XREF-METHOD-UNDEFINED?", 1, 0, false);
    //declareFunction(myName, "xref_method_defining_xrm", "XREF-METHOD-DEFINING-XRM", 1, 0, false);
    //declareFunction(myName, "xref_method_defining_module", "XREF-METHOD-DEFINING-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_method_has_multiple_definitionsP", "XREF-METHOD-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
    //declareFunction(myName, "xref_method_defining_modules", "XREF-METHOD-DEFINING-MODULES", 1, 0, false);
    //declareFunction(myName, "xref_global_definition_count", "XREF-GLOBAL-DEFINITION-COUNT", 1, 0, false);
    //declareFunction(myName, "xref_global_undefinedP", "XREF-GLOBAL-UNDEFINED?", 1, 0, false);
    //declareFunction(myName, "xref_global_defining_xrm", "XREF-GLOBAL-DEFINING-XRM", 1, 0, false);
    //declareFunction(myName, "xref_global_defining_module", "XREF-GLOBAL-DEFINING-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_global_has_multiple_definitionsP", "XREF-GLOBAL-HAS-MULTIPLE-DEFINITIONS?", 1, 0, false);
    //declareFunction(myName, "xref_global_defining_modules", "XREF-GLOBAL-DEFINING-MODULES", 1, 0, false);
    //declareFunction(myName, "xref_method_definition_position", "XREF-METHOD-DEFINITION-POSITION", 1, 0, false);
    //declareFunction(myName, "xref_method_definition_positions", "XREF-METHOD-DEFINITION-POSITIONS", 1, 0, false);
    //declareFunction(myName, "xref_global_definition_position", "XREF-GLOBAL-DEFINITION-POSITION", 1, 0, false);
    //declareFunction(myName, "xref_global_definition_positions", "XREF-GLOBAL-DEFINITION-POSITIONS", 1, 0, false);
    //declareFunction(myName, "xref_methods_defined_by_module", "XREF-METHODS-DEFINED-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_module_method_definition_count", "XREF-MODULE-METHOD-DEFINITION-COUNT", 2, 0, false);
    //declareFunction(myName, "xref_module_method_definition_positions", "XREF-MODULE-METHOD-DEFINITION-POSITIONS", 2, 0, false);
    //declareFunction(myName, "xref_globals_defined_by_module", "XREF-GLOBALS-DEFINED-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_module_global_definition_count", "XREF-MODULE-GLOBAL-DEFINITION-COUNT", 2, 0, false);
    //declareFunction(myName, "xref_module_global_definition_positions", "XREF-MODULE-GLOBAL-DEFINITION-POSITIONS", 2, 0, false);
    //declareFunction(myName, "xref_method_called_by_methodP", "XREF-METHOD-CALLED-BY-METHOD?", 2, 0, false);
    //declareFunction(myName, "xref_methods_called_by_method", "XREF-METHODS-CALLED-BY-METHOD", 1, 0, false);
    //declareFunction(myName, "xref_globals_referenced_by_method", "XREF-GLOBALS-REFERENCED-BY-METHOD", 1, 0, false);
    //declareFunction(myName, "xref_globals_modified_by_method", "XREF-GLOBALS-MODIFIED-BY-METHOD", 1, 0, false);
    //declareFunction(myName, "xref_globals_rebound_by_method", "XREF-GLOBALS-REBOUND-BY-METHOD", 1, 0, false);
    //declareFunction(myName, "xref_globals_accessed_by_method", "XREF-GLOBALS-ACCESSED-BY-METHOD", 1, 0, false);
    //declareFunction(myName, "xref_method_called_by_globalP", "XREF-METHOD-CALLED-BY-GLOBAL?", 2, 0, false);
    //declareFunction(myName, "xref_methods_called_by_global", "XREF-METHODS-CALLED-BY-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_globals_referenced_by_global", "XREF-GLOBALS-REFERENCED-BY-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_method_called_by_moduleP", "XREF-METHOD-CALLED-BY-MODULE?", 2, 0, false);
    //declareFunction(myName, "xref_module_positions_calling_method", "XREF-MODULE-POSITIONS-CALLING-METHOD", 2, 0, false);
    //declareFunction(myName, "xref_methods_called_by_module", "XREF-METHODS-CALLED-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_module_positions_referencing_global", "XREF-MODULE-POSITIONS-REFERENCING-GLOBAL", 2, 0, false);
    //declareFunction(myName, "xref_globals_referenced_by_module", "XREF-GLOBALS-REFERENCED-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_module_positions_modifying_global", "XREF-MODULE-POSITIONS-MODIFYING-GLOBAL", 2, 0, false);
    //declareFunction(myName, "xref_globals_modified_by_module", "XREF-GLOBALS-MODIFIED-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_module_positions_rebinding_global", "XREF-MODULE-POSITIONS-REBINDING-GLOBAL", 2, 0, false);
    //declareFunction(myName, "xref_globals_rebound_by_module", "XREF-GLOBALS-REBOUND-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_module_positions_accessing_global", "XREF-MODULE-POSITIONS-ACCESSING-GLOBAL", 2, 0, false);
    //declareFunction(myName, "xref_globals_accessed_by_module", "XREF-GLOBALS-ACCESSED-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_methods_that_call_method", "XREF-METHODS-THAT-CALL-METHOD", 1, 0, false);
    //declareFunction(myName, "xref_globals_that_call_method", "XREF-GLOBALS-THAT-CALL-METHOD", 1, 0, false);
    //declareFunction(myName, "xrms_that_call_method", "XRMS-THAT-CALL-METHOD", 1, 0, false);
    //declareFunction(myName, "xref_modules_that_call_method", "XREF-MODULES-THAT-CALL-METHOD", 1, 0, false);
    //declareFunction(myName, "xref_method_call_count", "XREF-METHOD-CALL-COUNT", 1, 0, false);
    //declareFunction(myName, "xref_method_unused_p", "XREF-METHOD-UNUSED-P", 1, 0, false);
    //declareFunction(myName, "xref_methods_that_reference_global", "XREF-METHODS-THAT-REFERENCE-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_globals_that_reference_global", "XREF-GLOBALS-THAT-REFERENCE-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xrms_that_reference_global", "XRMS-THAT-REFERENCE-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_modules_that_reference_global", "XREF-MODULES-THAT-REFERENCE-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_global_reference_count", "XREF-GLOBAL-REFERENCE-COUNT", 1, 0, false);
    //declareFunction(myName, "xref_global_never_referenced_p", "XREF-GLOBAL-NEVER-REFERENCED-P", 1, 0, false);
    //declareFunction(myName, "xref_methods_that_modify_global", "XREF-METHODS-THAT-MODIFY-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xrms_that_modify_global", "XRMS-THAT-MODIFY-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_modules_that_modify_global", "XREF-MODULES-THAT-MODIFY-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_global_modification_count", "XREF-GLOBAL-MODIFICATION-COUNT", 1, 0, false);
    //declareFunction(myName, "xref_global_never_modified_p", "XREF-GLOBAL-NEVER-MODIFIED-P", 1, 0, false);
    //declareFunction(myName, "xref_methods_that_rebind_global", "XREF-METHODS-THAT-REBIND-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xrms_that_rebind_global", "XRMS-THAT-REBIND-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_modules_that_rebind_global", "XREF-MODULES-THAT-REBIND-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_global_binding_count", "XREF-GLOBAL-BINDING-COUNT", 1, 0, false);
    //declareFunction(myName, "xref_global_never_rebound_p", "XREF-GLOBAL-NEVER-REBOUND-P", 1, 0, false);
    //declareFunction(myName, "xref_methods_that_access_global", "XREF-METHODS-THAT-ACCESS-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xrms_that_access_global", "XRMS-THAT-ACCESS-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_modules_that_access_global", "XREF-MODULES-THAT-ACCESS-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_global_access_count", "XREF-GLOBAL-ACCESS-COUNT", 1, 0, false);
    //declareFunction(myName, "xref_global_never_accessed_p", "XREF-GLOBAL-NEVER-ACCESSED-P", 1, 0, false);
    //declareFunction(myName, "xref_xrms_accessed_by_method", "XREF-XRMS-ACCESSED-BY-METHOD", 1, 0, false);
    //declareFunction(myName, "xref_modules_accessed_by_method", "XREF-MODULES-ACCESSED-BY-METHOD", 1, 0, false);
    //declareFunction(myName, "xref_xrms_accessed_by_global", "XREF-XRMS-ACCESSED-BY-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_modules_accessed_by_global", "XREF-MODULES-ACCESSED-BY-GLOBAL", 1, 0, false);
    //declareFunction(myName, "xref_xrms_accessed_by_xrm", "XREF-XRMS-ACCESSED-BY-XRM", 1, 0, false);
    //declareFunction(myName, "xref_modules_accessed_by_module", "XREF-MODULES-ACCESSED-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_xrms_accessed_anywhere_by_xrm", "XREF-XRMS-ACCESSED-ANYWHERE-BY-XRM", 1, 0, false);
    //declareFunction(myName, "xref_modules_accessed_anywhere_by_module", "XREF-MODULES-ACCESSED-ANYWHERE-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_globals_accessed_anywhere_by_module", "XREF-GLOBALS-ACCESSED-ANYWHERE-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xref_methods_accessed_anywhere_by_module", "XREF-METHODS-ACCESSED-ANYWHERE-BY-MODULE", 1, 0, false);
    //declareFunction(myName, "xrms_that_access_method", "XRMS-THAT-ACCESS-METHOD", 1, 0, false);
    //declareFunction(myName, "xref_modules_that_access_method", "XREF-MODULES-THAT-ACCESS-METHOD", 1, 0, false);
    //declareFunction(myName, "xrms_that_access_global_anywhere", "XRMS-THAT-ACCESS-GLOBAL-ANYWHERE", 1, 0, false);
    //declareFunction(myName, "xref_modules_that_access_global_anywhere", "XREF-MODULES-THAT-ACCESS-GLOBAL-ANYWHERE", 1, 0, false);
    //declareFunction(myName, "xrms_that_access_xrm_anywhere", "XRMS-THAT-ACCESS-XRM-ANYWHERE", 1, 0, false);
    //declareFunction(myName, "xref_modules_that_access_module_anywhere", "XREF-MODULES-THAT-ACCESS-MODULE-ANYWHERE", 1, 0, false);
    //declareFunction(myName, "xref_justify_module_referencing_module", "XREF-JUSTIFY-MODULE-REFERENCING-MODULE", 2, 0, false);
    //declareFunction(myName, "xref_some_external_module_accesses_method_anywhereP", "XREF-SOME-EXTERNAL-MODULE-ACCESSES-METHOD-ANYWHERE?", 1, 0, false);
    //declareFunction(myName, "xref_method_potentially_private_p", "XREF-METHOD-POTENTIALLY-PRIVATE-P", 1, 0, false);
    //declareFunction(myName, "xref_module_potentially_private_methods", "XREF-MODULE-POTENTIALLY-PRIVATE-METHODS", 1, 0, false);
    //declareFunction(myName, "xref_some_external_module_accesses_global_anywhereP", "XREF-SOME-EXTERNAL-MODULE-ACCESSES-GLOBAL-ANYWHERE?", 1, 0, false);
    //declareFunction(myName, "xref_global_potentially_private_p", "XREF-GLOBAL-POTENTIALLY-PRIVATE-P", 1, 0, false);
    //declareFunction(myName, "xref_module_potentially_private_globals", "XREF-MODULE-POTENTIALLY-PRIVATE-GLOBALS", 1, 0, false);
    //declareFunction(myName, "xref_method_source_definition_info", "XREF-METHOD-SOURCE-DEFINITION-INFO", 1, 0, false);
    //declareFunction(myName, "xref_global_source_definition_info", "XREF-GLOBAL-SOURCE-DEFINITION-INFO", 1, 0, false);
    //declareFunction(myName, "xref_method_source_definition_comment", "XREF-METHOD-SOURCE-DEFINITION-COMMENT", 1, 0, false);
    //declareFunction(myName, "xref_global_source_definition_comment", "XREF-GLOBAL-SOURCE-DEFINITION-COMMENT", 1, 0, false);
    //declareFunction(myName, "xref_source_definition_comment", "XREF-SOURCE-DEFINITION-COMMENT", 2, 0, false);
    //declareFunction(myName, "xref_module_relative_input_filename_internal", "XREF-MODULE-RELATIVE-INPUT-FILENAME-INTERNAL", 1, 0, false);
    //declareFunction(myName, "xref_module_relative_input_filename", "XREF-MODULE-RELATIVE-INPUT-FILENAME", 1, 0, false);
    //declareFunction(myName, "xrs_merge_xref_module", "XRS-MERGE-XREF-MODULE", 2, 0, false);
    //declareFunction(myName, "xrs_merge_new_xrm", "XRS-MERGE-NEW-XRM", 2, 0, false);
    //declareFunction(myName, "xrs_merge_definition", "XRS-MERGE-DEFINITION", 3, 0, false);
    //declareFunction(myName, "xrs_merge_new_method_definitions", "XRS-MERGE-NEW-METHOD-DEFINITIONS", 2, 0, false);
    //declareFunction(myName, "xrs_merge_new_global_definitions", "XRS-MERGE-NEW-GLOBAL-DEFINITIONS", 2, 0, false);
    //declareFunction(myName, "xrs_merge_update_backpointer", "XRS-MERGE-UPDATE-BACKPOINTER", 3, 0, false);
    //declareFunction(myName, "xrs_merge_new_method_called_by_method", "XRS-MERGE-NEW-METHOD-CALLED-BY-METHOD", 2, 0, false);
    //declareFunction(myName, "xrs_merge_new_method_called_by_global", "XRS-MERGE-NEW-METHOD-CALLED-BY-GLOBAL", 2, 0, false);
    //declareFunction(myName, "xrs_merge_new_method_called_at_top_level", "XRS-MERGE-NEW-METHOD-CALLED-AT-TOP-LEVEL", 2, 0, false);
    //declareFunction(myName, "xrs_merge_new_global_referenced_by_method", "XRS-MERGE-NEW-GLOBAL-REFERENCED-BY-METHOD", 2, 0, false);
    //declareFunction(myName, "xrs_merge_new_global_referenced_by_global", "XRS-MERGE-NEW-GLOBAL-REFERENCED-BY-GLOBAL", 2, 0, false);
    //declareFunction(myName, "xrs_merge_new_global_referenced_at_top_level", "XRS-MERGE-NEW-GLOBAL-REFERENCED-AT-TOP-LEVEL", 2, 0, false);
    //declareFunction(myName, "xrs_merge_new_global_modified_by_method", "XRS-MERGE-NEW-GLOBAL-MODIFIED-BY-METHOD", 2, 0, false);
    //declareFunction(myName, "xrs_merge_new_global_modified_at_top_level", "XRS-MERGE-NEW-GLOBAL-MODIFIED-AT-TOP-LEVEL", 2, 0, false);
    //declareFunction(myName, "xrs_merge_new_global_rebound_by_method", "XRS-MERGE-NEW-GLOBAL-REBOUND-BY-METHOD", 2, 0, false);
    //declareFunction(myName, "xrs_merge_new_global_rebound_at_top_level", "XRS-MERGE-NEW-GLOBAL-REBOUND-AT-TOP-LEVEL", 2, 0, false);
    //declareFunction(myName, "xrs_remove_old_xrm", "XRS-REMOVE-OLD-XRM", 2, 0, false);
    //declareFunction(myName, "xrs_remove_definition", "XRS-REMOVE-DEFINITION", 3, 0, false);
    //declareFunction(myName, "xrs_remove_old_method_definitions", "XRS-REMOVE-OLD-METHOD-DEFINITIONS", 2, 0, false);
    //declareFunction(myName, "xrs_remove_old_global_definitions", "XRS-REMOVE-OLD-GLOBAL-DEFINITIONS", 2, 0, false);
    //declareFunction(myName, "xrs_remove_update_backpointer", "XRS-REMOVE-UPDATE-BACKPOINTER", 3, 0, false);
    //declareFunction(myName, "xrs_remove_old_method_called_by_method", "XRS-REMOVE-OLD-METHOD-CALLED-BY-METHOD", 2, 0, false);
    //declareFunction(myName, "xrs_remove_old_method_called_by_global", "XRS-REMOVE-OLD-METHOD-CALLED-BY-GLOBAL", 2, 0, false);
    //declareFunction(myName, "xrs_remove_old_method_called_at_top_level", "XRS-REMOVE-OLD-METHOD-CALLED-AT-TOP-LEVEL", 2, 0, false);
    //declareFunction(myName, "xrs_remove_old_global_referenced_by_method", "XRS-REMOVE-OLD-GLOBAL-REFERENCED-BY-METHOD", 2, 0, false);
    //declareFunction(myName, "xrs_remove_old_global_referenced_by_global", "XRS-REMOVE-OLD-GLOBAL-REFERENCED-BY-GLOBAL", 2, 0, false);
    //declareFunction(myName, "xrs_remove_old_global_referenced_at_top_level", "XRS-REMOVE-OLD-GLOBAL-REFERENCED-AT-TOP-LEVEL", 2, 0, false);
    //declareFunction(myName, "xrs_remove_old_global_modified_by_method", "XRS-REMOVE-OLD-GLOBAL-MODIFIED-BY-METHOD", 2, 0, false);
    //declareFunction(myName, "xrs_remove_old_global_modified_at_top_level", "XRS-REMOVE-OLD-GLOBAL-MODIFIED-AT-TOP-LEVEL", 2, 0, false);
    //declareFunction(myName, "xrs_remove_old_global_rebound_by_method", "XRS-REMOVE-OLD-GLOBAL-REBOUND-BY-METHOD", 2, 0, false);
    //declareFunction(myName, "xrs_remove_old_global_rebound_at_top_level", "XRS-REMOVE-OLD-GLOBAL-REBOUND-AT-TOP-LEVEL", 2, 0, false);
    //declareFunction(myName, "xref_possibly_record_global_undefinition", "XREF-POSSIBLY-RECORD-GLOBAL-UNDEFINITION", 2, 0, false);
    //declareFunction(myName, "xrs_unrecord_global_backpointers", "XRS-UNRECORD-GLOBAL-BACKPOINTERS", 3, 0, false);
    //declareFunction(myName, "xref_possibly_record_method_undefinition", "XREF-POSSIBLY-RECORD-METHOD-UNDEFINITION", 2, 0, false);
    //declareFunction(myName, "xrs_unrecord_method_backpointers", "XRS-UNRECORD-METHOD-BACKPOINTERS", 3, 0, false);
    //declareMacro(myName, "within_new_xref_module", "WITHIN-NEW-XREF-MODULE");
    //declareMacro(myName, "with_current_xref_module", "WITH-CURRENT-XREF-MODULE");
    //declareFunction(myName, "current_xref_module", "CURRENT-XREF-MODULE", 0, 0, false);
    //declareMacro(myName, "xref_within_module", "XREF-WITHIN-MODULE");
    //declareFunction(myName, "xref_module_scope", "XREF-MODULE-SCOPE", 0, 0, false);
    //declareMacro(myName, "xref_within_file_position", "XREF-WITHIN-FILE-POSITION");
    //declareFunction(myName, "xref_file_position_scope", "XREF-FILE-POSITION-SCOPE", 0, 0, false);
    //declareMacro(myName, "xref_within_define", "XREF-WITHIN-DEFINE");
    //declareMacro(myName, "xref_within_defmacro", "XREF-WITHIN-DEFMACRO");
    //declareMacro(myName, "xref_within_method", "XREF-WITHIN-METHOD");
    //declareFunction(myName, "xref_method_scope", "XREF-METHOD-SCOPE", 0, 0, false);
    //declareMacro(myName, "xref_within_global", "XREF-WITHIN-GLOBAL");
    //declareFunction(myName, "xref_global_scope", "XREF-GLOBAL-SCOPE", 0, 0, false);
    //declareFunction(myName, "xref_reference_scope", "XREF-REFERENCE-SCOPE", 0, 0, false);
    //declareFunction(myName, "xref_note_global_definition", "XREF-NOTE-GLOBAL-DEFINITION", 1, 0, false);
    //declareFunction(myName, "xref_note_macro_definition", "XREF-NOTE-MACRO-DEFINITION", 1, 0, false);
    //declareFunction(myName, "xref_note_function_definition", "XREF-NOTE-FUNCTION-DEFINITION", 1, 0, false);
    //declareFunction(myName, "xref_note_method_formal_arglist", "XREF-NOTE-METHOD-FORMAL-ARGLIST", 2, 0, false);
    //declareFunction(myName, "xref_note_global_binding_type", "XREF-NOTE-GLOBAL-BINDING-TYPE", 2, 0, false);
    //declareFunction(myName, "xref_note_global_reference", "XREF-NOTE-GLOBAL-REFERENCE", 1, 0, false);
    //declareFunction(myName, "xref_note_global_modification", "XREF-NOTE-GLOBAL-MODIFICATION", 1, 0, false);
    //declareFunction(myName, "xref_note_global_binding", "XREF-NOTE-GLOBAL-BINDING", 1, 0, false);
    //declareFunction(myName, "xref_note_macro_use", "XREF-NOTE-MACRO-USE", 1, 0, false);
    //declareFunction(myName, "xref_note_function_call", "XREF-NOTE-FUNCTION-CALL", 1, 0, false);
    //declareFunction(myName, "xref_note_module_removal", "XREF-NOTE-MODULE-REMOVAL", 1, 0, false);
    //declareFunction(myName, "xref_trace", "XREF-TRACE", 1, 2, false);
    //declareFunction(myName, "xref_sort_called_globals", "XREF-SORT-CALLED-GLOBALS", 1, 0, false);
    //declareFunction(myName, "xref_sort_called_methods", "XREF-SORT-CALLED-METHODS", 1, 0, false);
    //declareFunction(myName, "xref_sort_referenced_xrms", "XREF-SORT-REFERENCED-XRMS", 1, 0, false);
    //declareFunction(myName, "xref_sort_referenced_modules", "XREF-SORT-REFERENCED-MODULES", 1, 0, false);
    //declareFunction(myName, "xref_sort_calling_globals", "XREF-SORT-CALLING-GLOBALS", 1, 0, false);
    //declareFunction(myName, "xref_sort_calling_methods", "XREF-SORT-CALLING-METHODS", 1, 0, false);
    //declareFunction(myName, "xref_sort_calling_xrms", "XREF-SORT-CALLING-XRMS", 1, 0, false);
    //declareFunction(myName, "xref_sort_calling_modules", "XREF-SORT-CALLING-MODULES", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_xref_database_file() {
    $empty_set_contents$ = deflexical("*EMPTY-SET-CONTENTS*", set_contents.new_set_contents(ZERO_INTEGER, UNPROVIDED));
    $dtp_xref_module$ = defconstant("*DTP-XREF-MODULE*", $sym0$XREF_MODULE);
    $dtp_xref_system$ = defconstant("*DTP-XREF-SYSTEM*", $sym110$XREF_SYSTEM);
    $current_xref_module$ = defparameter("*CURRENT-XREF-MODULE*", NIL);
    $xref_module_scope$ = defparameter("*XREF-MODULE-SCOPE*", NIL);
    $xref_file_position_scope$ = defparameter("*XREF-FILE-POSITION-SCOPE*", NIL);
    $xref_method_scope$ = defparameter("*XREF-METHOD-SCOPE*", NIL);
    $xref_global_scope$ = defparameter("*XREF-GLOBAL-SCOPE*", NIL);
    $xref_trace$ = defvar("*XREF-TRACE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_xref_database_file() {
    // CVS_ID("Id: xref-database.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_xref_module$.getGlobalValue(), Symbols.symbol_function($sym7$XREF_MODULE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$XREF_M_NAME, $sym9$_CSETF_XREF_M_NAME);
    Structures.def_csetf($sym10$XREF_M_XREF_SYSTEM, $sym11$_CSETF_XREF_M_XREF_SYSTEM);
    Structures.def_csetf($sym12$XREF_M_FEATURES, $sym13$_CSETF_XREF_M_FEATURES);
    Structures.def_csetf($sym14$XREF_M_METHOD_DEFINITIONS, $sym15$_CSETF_XREF_M_METHOD_DEFINITIONS);
    Structures.def_csetf($sym16$XREF_M_METHOD_POSITION_TABLE, $sym17$_CSETF_XREF_M_METHOD_POSITION_TABLE);
    Structures.def_csetf($sym18$XREF_M_METHOD_METHOD_TABLE, $sym19$_CSETF_XREF_M_METHOD_METHOD_TABLE);
    Structures.def_csetf($sym20$XREF_M_METHOD_GLOBAL_REFERENCE_TABLE, $sym21$_CSETF_XREF_M_METHOD_GLOBAL_REFERENCE_TABLE);
    Structures.def_csetf($sym22$XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE, $sym23$_CSETF_XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE);
    Structures.def_csetf($sym24$XREF_M_METHOD_GLOBAL_BINDING_TABLE, $sym25$_CSETF_XREF_M_METHOD_GLOBAL_BINDING_TABLE);
    Structures.def_csetf($sym26$XREF_M_GLOBAL_DEFINITIONS, $sym27$_CSETF_XREF_M_GLOBAL_DEFINITIONS);
    Structures.def_csetf($sym28$XREF_M_GLOBAL_POSITION_TABLE, $sym29$_CSETF_XREF_M_GLOBAL_POSITION_TABLE);
    Structures.def_csetf($sym30$XREF_M_GLOBAL_METHOD_TABLE, $sym31$_CSETF_XREF_M_GLOBAL_METHOD_TABLE);
    Structures.def_csetf($sym32$XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE, $sym33$_CSETF_XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE);
    Structures.def_csetf($sym34$XREF_M_TOP_METHOD_TABLE, $sym35$_CSETF_XREF_M_TOP_METHOD_TABLE);
    Structures.def_csetf($sym36$XREF_M_TOP_GLOBAL_REFERENCE_TABLE, $sym37$_CSETF_XREF_M_TOP_GLOBAL_REFERENCE_TABLE);
    Structures.def_csetf($sym38$XREF_M_TOP_GLOBAL_MODIFICATION_TABLE, $sym39$_CSETF_XREF_M_TOP_GLOBAL_MODIFICATION_TABLE);
    Structures.def_csetf($sym40$XREF_M_TOP_GLOBAL_BINDING_TABLE, $sym41$_CSETF_XREF_M_TOP_GLOBAL_BINDING_TABLE);
    Structures.def_csetf($sym42$XREF_M_METHOD_FORMAL_ARGLIST_TABLE, $sym43$_CSETF_XREF_M_METHOD_FORMAL_ARGLIST_TABLE);
    Structures.def_csetf($sym44$XREF_M_GLOBAL_BINDING_TYPE_TABLE, $sym45$_CSETF_XREF_M_GLOBAL_BINDING_TYPE_TABLE);
    Equality.identity($sym0$XREF_MODULE);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_xref_module$.getGlobalValue(), Symbols.symbol_function($sym70$SXHASH_XREF_MODULE_METHOD));
    access_macros.register_macro_helper($sym84$XRM_METHOD_DEFINITIONS, $sym87$DO_XRM_METHOD_DEFINITIONS);
    access_macros.register_macro_helper($sym91$XRM_METHOD_POSITION_TABLE, $sym92$DO_XRM_METHODS);
    access_macros.register_macro_helper($sym97$XRM_GLOBAL_DEFINITIONS, $sym98$DO_XRM_GLOBAL_DEFINITIONS);
    access_macros.register_macro_helper($sym101$XRM_GLOBAL_POSITION_TABLE, $sym102$DO_XRM_GLOBALS);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_xref_system$.getGlobalValue(), Symbols.symbol_function($sym116$XREF_SYSTEM_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym117$XREF_S_NAME, $sym118$_CSETF_XREF_S_NAME);
    Structures.def_csetf($sym119$XREF_S_FEATURES, $sym120$_CSETF_XREF_S_FEATURES);
    Structures.def_csetf($sym121$XREF_S_XREF_MODULE_TABLE, $sym122$_CSETF_XREF_S_XREF_MODULE_TABLE);
    Structures.def_csetf($sym123$XREF_S_METHOD_DEFINITION_TABLE, $sym124$_CSETF_XREF_S_METHOD_DEFINITION_TABLE);
    Structures.def_csetf($sym125$XREF_S_GLOBAL_DEFINITION_TABLE, $sym126$_CSETF_XREF_S_GLOBAL_DEFINITION_TABLE);
    Structures.def_csetf($sym127$XREF_S_METHOD_CALLED_BY_METHOD_TABLE, $sym128$_CSETF_XREF_S_METHOD_CALLED_BY_METHOD_TABLE);
    Structures.def_csetf($sym129$XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE, $sym130$_CSETF_XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE);
    Structures.def_csetf($sym131$XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE, $sym132$_CSETF_XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE);
    Structures.def_csetf($sym133$XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE, $sym134$_CSETF_XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE);
    Structures.def_csetf($sym135$XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE, $sym136$_CSETF_XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE);
    Structures.def_csetf($sym137$XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE, $sym138$_CSETF_XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE);
    Structures.def_csetf($sym139$XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE, $sym140$_CSETF_XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE);
    Structures.def_csetf($sym141$XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE, $sym142$_CSETF_XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE);
    Structures.def_csetf($sym143$XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE, $sym144$_CSETF_XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE);
    Structures.def_csetf($sym145$XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE, $sym146$_CSETF_XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE);
    Equality.identity($sym110$XREF_SYSTEM);
    memoization_state.note_memoized_function($sym178$XREF_MODULE_RELATIVE_INPUT_FILENAME);
    access_macros.register_macro_helper($sym192$CURRENT_XREF_MODULE, $sym193$WITH_CURRENT_XREF_MODULE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$XREF_MODULE = makeSymbol("XREF-MODULE");
  public static final SubLSymbol $sym1$XREF_MODULE_P = makeSymbol("XREF-MODULE-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("NAME"), makeSymbol("XREF-SYSTEM"), makeSymbol("FEATURES"), makeSymbol("METHOD-DEFINITIONS"), makeSymbol("METHOD-POSITION-TABLE"), makeSymbol("METHOD-METHOD-TABLE"), makeSymbol("METHOD-GLOBAL-REFERENCE-TABLE"), makeSymbol("METHOD-GLOBAL-MODIFICATION-TABLE"), makeSymbol("METHOD-GLOBAL-BINDING-TABLE"), makeSymbol("GLOBAL-DEFINITIONS"), makeSymbol("GLOBAL-POSITION-TABLE"), makeSymbol("GLOBAL-METHOD-TABLE"), makeSymbol("GLOBAL-GLOBAL-REFERENCE-TABLE"), makeSymbol("TOP-METHOD-TABLE"), makeSymbol("TOP-GLOBAL-REFERENCE-TABLE"), makeSymbol("TOP-GLOBAL-MODIFICATION-TABLE"), makeSymbol("TOP-GLOBAL-BINDING-TABLE"), makeSymbol("METHOD-FORMAL-ARGLIST-TABLE"), makeSymbol("GLOBAL-BINDING-TYPE-TABLE")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("NAME"), makeKeyword("XREF-SYSTEM"), makeKeyword("FEATURES"), makeKeyword("METHOD-DEFINITIONS"), makeKeyword("METHOD-POSITION-TABLE"), makeKeyword("METHOD-METHOD-TABLE"), makeKeyword("METHOD-GLOBAL-REFERENCE-TABLE"), makeKeyword("METHOD-GLOBAL-MODIFICATION-TABLE"), makeKeyword("METHOD-GLOBAL-BINDING-TABLE"), makeKeyword("GLOBAL-DEFINITIONS"), makeKeyword("GLOBAL-POSITION-TABLE"), makeKeyword("GLOBAL-METHOD-TABLE"), makeKeyword("GLOBAL-GLOBAL-REFERENCE-TABLE"), makeKeyword("TOP-METHOD-TABLE"), makeKeyword("TOP-GLOBAL-REFERENCE-TABLE"), makeKeyword("TOP-GLOBAL-MODIFICATION-TABLE"), makeKeyword("TOP-GLOBAL-BINDING-TABLE"), makeKeyword("METHOD-FORMAL-ARGLIST-TABLE"), makeKeyword("GLOBAL-BINDING-TYPE-TABLE")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("XREF-M-NAME"), makeSymbol("XREF-M-XREF-SYSTEM"), makeSymbol("XREF-M-FEATURES"), makeSymbol("XREF-M-METHOD-DEFINITIONS"), makeSymbol("XREF-M-METHOD-POSITION-TABLE"), makeSymbol("XREF-M-METHOD-METHOD-TABLE"), makeSymbol("XREF-M-METHOD-GLOBAL-REFERENCE-TABLE"), makeSymbol("XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE"), makeSymbol("XREF-M-METHOD-GLOBAL-BINDING-TABLE"), makeSymbol("XREF-M-GLOBAL-DEFINITIONS"), makeSymbol("XREF-M-GLOBAL-POSITION-TABLE"), makeSymbol("XREF-M-GLOBAL-METHOD-TABLE"), makeSymbol("XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE"), makeSymbol("XREF-M-TOP-METHOD-TABLE"), makeSymbol("XREF-M-TOP-GLOBAL-REFERENCE-TABLE"), makeSymbol("XREF-M-TOP-GLOBAL-MODIFICATION-TABLE"), makeSymbol("XREF-M-TOP-GLOBAL-BINDING-TABLE"), makeSymbol("XREF-M-METHOD-FORMAL-ARGLIST-TABLE"), makeSymbol("XREF-M-GLOBAL-BINDING-TYPE-TABLE")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-XREF-M-NAME"), makeSymbol("_CSETF-XREF-M-XREF-SYSTEM"), makeSymbol("_CSETF-XREF-M-FEATURES"), makeSymbol("_CSETF-XREF-M-METHOD-DEFINITIONS"), makeSymbol("_CSETF-XREF-M-METHOD-POSITION-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-METHOD-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-REFERENCE-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-BINDING-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-DEFINITIONS"), makeSymbol("_CSETF-XREF-M-GLOBAL-POSITION-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-METHOD-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-METHOD-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-REFERENCE-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-MODIFICATION-TABLE"), makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-BINDING-TABLE"), makeSymbol("_CSETF-XREF-M-METHOD-FORMAL-ARGLIST-TABLE"), makeSymbol("_CSETF-XREF-M-GLOBAL-BINDING-TYPE-TABLE")});
  public static final SubLSymbol $sym6$PRINT_XREF_MODULE = makeSymbol("PRINT-XREF-MODULE");
  public static final SubLSymbol $sym7$XREF_MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("XREF-MODULE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$XREF_M_NAME = makeSymbol("XREF-M-NAME");
  public static final SubLSymbol $sym9$_CSETF_XREF_M_NAME = makeSymbol("_CSETF-XREF-M-NAME");
  public static final SubLSymbol $sym10$XREF_M_XREF_SYSTEM = makeSymbol("XREF-M-XREF-SYSTEM");
  public static final SubLSymbol $sym11$_CSETF_XREF_M_XREF_SYSTEM = makeSymbol("_CSETF-XREF-M-XREF-SYSTEM");
  public static final SubLSymbol $sym12$XREF_M_FEATURES = makeSymbol("XREF-M-FEATURES");
  public static final SubLSymbol $sym13$_CSETF_XREF_M_FEATURES = makeSymbol("_CSETF-XREF-M-FEATURES");
  public static final SubLSymbol $sym14$XREF_M_METHOD_DEFINITIONS = makeSymbol("XREF-M-METHOD-DEFINITIONS");
  public static final SubLSymbol $sym15$_CSETF_XREF_M_METHOD_DEFINITIONS = makeSymbol("_CSETF-XREF-M-METHOD-DEFINITIONS");
  public static final SubLSymbol $sym16$XREF_M_METHOD_POSITION_TABLE = makeSymbol("XREF-M-METHOD-POSITION-TABLE");
  public static final SubLSymbol $sym17$_CSETF_XREF_M_METHOD_POSITION_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-POSITION-TABLE");
  public static final SubLSymbol $sym18$XREF_M_METHOD_METHOD_TABLE = makeSymbol("XREF-M-METHOD-METHOD-TABLE");
  public static final SubLSymbol $sym19$_CSETF_XREF_M_METHOD_METHOD_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-METHOD-TABLE");
  public static final SubLSymbol $sym20$XREF_M_METHOD_GLOBAL_REFERENCE_TABLE = makeSymbol("XREF-M-METHOD-GLOBAL-REFERENCE-TABLE");
  public static final SubLSymbol $sym21$_CSETF_XREF_M_METHOD_GLOBAL_REFERENCE_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-REFERENCE-TABLE");
  public static final SubLSymbol $sym22$XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE = makeSymbol("XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE");
  public static final SubLSymbol $sym23$_CSETF_XREF_M_METHOD_GLOBAL_MODIFICATION_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-MODIFICATION-TABLE");
  public static final SubLSymbol $sym24$XREF_M_METHOD_GLOBAL_BINDING_TABLE = makeSymbol("XREF-M-METHOD-GLOBAL-BINDING-TABLE");
  public static final SubLSymbol $sym25$_CSETF_XREF_M_METHOD_GLOBAL_BINDING_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-GLOBAL-BINDING-TABLE");
  public static final SubLSymbol $sym26$XREF_M_GLOBAL_DEFINITIONS = makeSymbol("XREF-M-GLOBAL-DEFINITIONS");
  public static final SubLSymbol $sym27$_CSETF_XREF_M_GLOBAL_DEFINITIONS = makeSymbol("_CSETF-XREF-M-GLOBAL-DEFINITIONS");
  public static final SubLSymbol $sym28$XREF_M_GLOBAL_POSITION_TABLE = makeSymbol("XREF-M-GLOBAL-POSITION-TABLE");
  public static final SubLSymbol $sym29$_CSETF_XREF_M_GLOBAL_POSITION_TABLE = makeSymbol("_CSETF-XREF-M-GLOBAL-POSITION-TABLE");
  public static final SubLSymbol $sym30$XREF_M_GLOBAL_METHOD_TABLE = makeSymbol("XREF-M-GLOBAL-METHOD-TABLE");
  public static final SubLSymbol $sym31$_CSETF_XREF_M_GLOBAL_METHOD_TABLE = makeSymbol("_CSETF-XREF-M-GLOBAL-METHOD-TABLE");
  public static final SubLSymbol $sym32$XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE = makeSymbol("XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE");
  public static final SubLSymbol $sym33$_CSETF_XREF_M_GLOBAL_GLOBAL_REFERENCE_TABLE = makeSymbol("_CSETF-XREF-M-GLOBAL-GLOBAL-REFERENCE-TABLE");
  public static final SubLSymbol $sym34$XREF_M_TOP_METHOD_TABLE = makeSymbol("XREF-M-TOP-METHOD-TABLE");
  public static final SubLSymbol $sym35$_CSETF_XREF_M_TOP_METHOD_TABLE = makeSymbol("_CSETF-XREF-M-TOP-METHOD-TABLE");
  public static final SubLSymbol $sym36$XREF_M_TOP_GLOBAL_REFERENCE_TABLE = makeSymbol("XREF-M-TOP-GLOBAL-REFERENCE-TABLE");
  public static final SubLSymbol $sym37$_CSETF_XREF_M_TOP_GLOBAL_REFERENCE_TABLE = makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-REFERENCE-TABLE");
  public static final SubLSymbol $sym38$XREF_M_TOP_GLOBAL_MODIFICATION_TABLE = makeSymbol("XREF-M-TOP-GLOBAL-MODIFICATION-TABLE");
  public static final SubLSymbol $sym39$_CSETF_XREF_M_TOP_GLOBAL_MODIFICATION_TABLE = makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-MODIFICATION-TABLE");
  public static final SubLSymbol $sym40$XREF_M_TOP_GLOBAL_BINDING_TABLE = makeSymbol("XREF-M-TOP-GLOBAL-BINDING-TABLE");
  public static final SubLSymbol $sym41$_CSETF_XREF_M_TOP_GLOBAL_BINDING_TABLE = makeSymbol("_CSETF-XREF-M-TOP-GLOBAL-BINDING-TABLE");
  public static final SubLSymbol $sym42$XREF_M_METHOD_FORMAL_ARGLIST_TABLE = makeSymbol("XREF-M-METHOD-FORMAL-ARGLIST-TABLE");
  public static final SubLSymbol $sym43$_CSETF_XREF_M_METHOD_FORMAL_ARGLIST_TABLE = makeSymbol("_CSETF-XREF-M-METHOD-FORMAL-ARGLIST-TABLE");
  public static final SubLSymbol $sym44$XREF_M_GLOBAL_BINDING_TYPE_TABLE = makeSymbol("XREF-M-GLOBAL-BINDING-TYPE-TABLE");
  public static final SubLSymbol $sym45$_CSETF_XREF_M_GLOBAL_BINDING_TYPE_TABLE = makeSymbol("_CSETF-XREF-M-GLOBAL-BINDING-TYPE-TABLE");
  public static final SubLSymbol $kw46$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw47$XREF_SYSTEM = makeKeyword("XREF-SYSTEM");
  public static final SubLSymbol $kw48$FEATURES = makeKeyword("FEATURES");
  public static final SubLSymbol $kw49$METHOD_DEFINITIONS = makeKeyword("METHOD-DEFINITIONS");
  public static final SubLSymbol $kw50$METHOD_POSITION_TABLE = makeKeyword("METHOD-POSITION-TABLE");
  public static final SubLSymbol $kw51$METHOD_METHOD_TABLE = makeKeyword("METHOD-METHOD-TABLE");
  public static final SubLSymbol $kw52$METHOD_GLOBAL_REFERENCE_TABLE = makeKeyword("METHOD-GLOBAL-REFERENCE-TABLE");
  public static final SubLSymbol $kw53$METHOD_GLOBAL_MODIFICATION_TABLE = makeKeyword("METHOD-GLOBAL-MODIFICATION-TABLE");
  public static final SubLSymbol $kw54$METHOD_GLOBAL_BINDING_TABLE = makeKeyword("METHOD-GLOBAL-BINDING-TABLE");
  public static final SubLSymbol $kw55$GLOBAL_DEFINITIONS = makeKeyword("GLOBAL-DEFINITIONS");
  public static final SubLSymbol $kw56$GLOBAL_POSITION_TABLE = makeKeyword("GLOBAL-POSITION-TABLE");
  public static final SubLSymbol $kw57$GLOBAL_METHOD_TABLE = makeKeyword("GLOBAL-METHOD-TABLE");
  public static final SubLSymbol $kw58$GLOBAL_GLOBAL_REFERENCE_TABLE = makeKeyword("GLOBAL-GLOBAL-REFERENCE-TABLE");
  public static final SubLSymbol $kw59$TOP_METHOD_TABLE = makeKeyword("TOP-METHOD-TABLE");
  public static final SubLSymbol $kw60$TOP_GLOBAL_REFERENCE_TABLE = makeKeyword("TOP-GLOBAL-REFERENCE-TABLE");
  public static final SubLSymbol $kw61$TOP_GLOBAL_MODIFICATION_TABLE = makeKeyword("TOP-GLOBAL-MODIFICATION-TABLE");
  public static final SubLSymbol $kw62$TOP_GLOBAL_BINDING_TABLE = makeKeyword("TOP-GLOBAL-BINDING-TABLE");
  public static final SubLSymbol $kw63$METHOD_FORMAL_ARGLIST_TABLE = makeKeyword("METHOD-FORMAL-ARGLIST-TABLE");
  public static final SubLSymbol $kw64$GLOBAL_BINDING_TYPE_TABLE = makeKeyword("GLOBAL-BINDING-TYPE-TABLE");
  public static final SubLString $str65$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str66$__ = makeString("#<");
  public static final SubLSymbol $kw67$STREAM = makeKeyword("STREAM");
  public static final SubLString $str68$_A____S_methods___S_globals = makeString("~A : ~S methods, ~S globals");
  public static final SubLSymbol $kw69$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym70$SXHASH_XREF_MODULE_METHOD = makeSymbol("SXHASH-XREF-MODULE-METHOD");
  public static final SubLSymbol $sym71$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym72$XREF_SYSTEM_P = makeSymbol("XREF-SYSTEM-P");
  public static final SubLSymbol $sym73$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym74$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLList $list75 = list(list(makeSymbol("METHOD"), makeSymbol("XRM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list76 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw77$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw78$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym79$XRM_VAR = makeUninternedSymbol("XRM-VAR");
  public static final SubLSymbol $sym80$DEFINITION = makeUninternedSymbol("DEFINITION");
  public static final SubLSymbol $sym81$POSITION = makeUninternedSymbol("POSITION");
  public static final SubLSymbol $sym82$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym83$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym84$XRM_METHOD_DEFINITIONS = makeSymbol("XRM-METHOD-DEFINITIONS");
  public static final SubLSymbol $sym85$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLSymbol $sym86$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym87$DO_XRM_METHOD_DEFINITIONS = makeSymbol("DO-XRM-METHOD-DEFINITIONS");
  public static final SubLSymbol $sym88$XRM_VAR = makeUninternedSymbol("XRM-VAR");
  public static final SubLSymbol $sym89$POSITION = makeUninternedSymbol("POSITION");
  public static final SubLSymbol $sym90$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLSymbol $sym91$XRM_METHOD_POSITION_TABLE = makeSymbol("XRM-METHOD-POSITION-TABLE");
  public static final SubLSymbol $sym92$DO_XRM_METHODS = makeSymbol("DO-XRM-METHODS");
  public static final SubLList $list93 = list(list(makeSymbol("GLOBAL"), makeSymbol("XRM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym94$XRM_VAR = makeUninternedSymbol("XRM-VAR");
  public static final SubLSymbol $sym95$DEFINITION = makeUninternedSymbol("DEFINITION");
  public static final SubLSymbol $sym96$POSITION = makeUninternedSymbol("POSITION");
  public static final SubLSymbol $sym97$XRM_GLOBAL_DEFINITIONS = makeSymbol("XRM-GLOBAL-DEFINITIONS");
  public static final SubLSymbol $sym98$DO_XRM_GLOBAL_DEFINITIONS = makeSymbol("DO-XRM-GLOBAL-DEFINITIONS");
  public static final SubLSymbol $sym99$XRM_VAR = makeUninternedSymbol("XRM-VAR");
  public static final SubLSymbol $sym100$POSITION = makeUninternedSymbol("POSITION");
  public static final SubLSymbol $sym101$XRM_GLOBAL_POSITION_TABLE = makeSymbol("XRM-GLOBAL-POSITION-TABLE");
  public static final SubLSymbol $sym102$DO_XRM_GLOBALS = makeSymbol("DO-XRM-GLOBALS");
  public static final SubLSymbol $sym103$CAR = makeSymbol("CAR");
  public static final SubLList $list104 = cons(makeSymbol("CANDIDATE-METHOD"), makeSymbol("POSITION"));
  public static final SubLList $list105 = cons(makeSymbol("CANDIDATE-GLOBAL"), makeSymbol("POSITION"));
  public static final SubLSymbol $kw106$UNSPECIFIED = makeKeyword("UNSPECIFIED");
  public static final SubLSymbol $sym107$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym108$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym109$BINDING_TYPE_P = makeSymbol("BINDING-TYPE-P");
  public static final SubLSymbol $sym110$XREF_SYSTEM = makeSymbol("XREF-SYSTEM");
  public static final SubLList $list111 = list(new SubLObject[] {makeSymbol("NAME"), makeSymbol("FEATURES"), makeSymbol("XREF-MODULE-TABLE"), makeSymbol("METHOD-DEFINITION-TABLE"), makeSymbol("GLOBAL-DEFINITION-TABLE"), makeSymbol("METHOD-CALLED-BY-METHOD-TABLE"), makeSymbol("METHOD-CALLED-BY-GLOBAL-TABLE"), makeSymbol("METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeSymbol("GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeSymbol("GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeSymbol("GLOBAL-REBOUND-BY-METHOD-TABLE"), makeSymbol("GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeSymbol("GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeSymbol("GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeSymbol("GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE")});
  public static final SubLList $list112 = list(new SubLObject[] {makeKeyword("NAME"), makeKeyword("FEATURES"), makeKeyword("XREF-MODULE-TABLE"), makeKeyword("METHOD-DEFINITION-TABLE"), makeKeyword("GLOBAL-DEFINITION-TABLE"), makeKeyword("METHOD-CALLED-BY-METHOD-TABLE"), makeKeyword("METHOD-CALLED-BY-GLOBAL-TABLE"), makeKeyword("METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeKeyword("GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeKeyword("GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeKeyword("GLOBAL-REBOUND-BY-METHOD-TABLE"), makeKeyword("GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeKeyword("GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeKeyword("GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeKeyword("GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE")});
  public static final SubLList $list113 = list(new SubLObject[] {makeSymbol("XREF-S-NAME"), makeSymbol("XREF-S-FEATURES"), makeSymbol("XREF-S-XREF-MODULE-TABLE"), makeSymbol("XREF-S-METHOD-DEFINITION-TABLE"), makeSymbol("XREF-S-GLOBAL-DEFINITION-TABLE"), makeSymbol("XREF-S-METHOD-CALLED-BY-METHOD-TABLE"), makeSymbol("XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE"), makeSymbol("XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeSymbol("XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeSymbol("XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeSymbol("XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE"), makeSymbol("XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeSymbol("XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeSymbol("XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeSymbol("XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE")});
  public static final SubLList $list114 = list(new SubLObject[] {makeSymbol("_CSETF-XREF-S-NAME"), makeSymbol("_CSETF-XREF-S-FEATURES"), makeSymbol("_CSETF-XREF-S-XREF-MODULE-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-DEFINITION-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-DEFINITION-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-CALLED-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE"), makeSymbol("_CSETF-XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE"), makeSymbol("_CSETF-XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE")});
  public static final SubLSymbol $sym115$PRINT_XREF_SYSTEM = makeSymbol("PRINT-XREF-SYSTEM");
  public static final SubLSymbol $sym116$XREF_SYSTEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("XREF-SYSTEM-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym117$XREF_S_NAME = makeSymbol("XREF-S-NAME");
  public static final SubLSymbol $sym118$_CSETF_XREF_S_NAME = makeSymbol("_CSETF-XREF-S-NAME");
  public static final SubLSymbol $sym119$XREF_S_FEATURES = makeSymbol("XREF-S-FEATURES");
  public static final SubLSymbol $sym120$_CSETF_XREF_S_FEATURES = makeSymbol("_CSETF-XREF-S-FEATURES");
  public static final SubLSymbol $sym121$XREF_S_XREF_MODULE_TABLE = makeSymbol("XREF-S-XREF-MODULE-TABLE");
  public static final SubLSymbol $sym122$_CSETF_XREF_S_XREF_MODULE_TABLE = makeSymbol("_CSETF-XREF-S-XREF-MODULE-TABLE");
  public static final SubLSymbol $sym123$XREF_S_METHOD_DEFINITION_TABLE = makeSymbol("XREF-S-METHOD-DEFINITION-TABLE");
  public static final SubLSymbol $sym124$_CSETF_XREF_S_METHOD_DEFINITION_TABLE = makeSymbol("_CSETF-XREF-S-METHOD-DEFINITION-TABLE");
  public static final SubLSymbol $sym125$XREF_S_GLOBAL_DEFINITION_TABLE = makeSymbol("XREF-S-GLOBAL-DEFINITION-TABLE");
  public static final SubLSymbol $sym126$_CSETF_XREF_S_GLOBAL_DEFINITION_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-DEFINITION-TABLE");
  public static final SubLSymbol $sym127$XREF_S_METHOD_CALLED_BY_METHOD_TABLE = makeSymbol("XREF-S-METHOD-CALLED-BY-METHOD-TABLE");
  public static final SubLSymbol $sym128$_CSETF_XREF_S_METHOD_CALLED_BY_METHOD_TABLE = makeSymbol("_CSETF-XREF-S-METHOD-CALLED-BY-METHOD-TABLE");
  public static final SubLSymbol $sym129$XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE = makeSymbol("XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE");
  public static final SubLSymbol $sym130$_CSETF_XREF_S_METHOD_CALLED_BY_GLOBAL_TABLE = makeSymbol("_CSETF-XREF-S-METHOD-CALLED-BY-GLOBAL-TABLE");
  public static final SubLSymbol $sym131$XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE = makeSymbol("XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE");
  public static final SubLSymbol $sym132$_CSETF_XREF_S_METHOD_CALLED_AT_TOP_LEVEL_TABLE = makeSymbol("_CSETF-XREF-S-METHOD-CALLED-AT-TOP-LEVEL-TABLE");
  public static final SubLSymbol $sym133$XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE = makeSymbol("XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE");
  public static final SubLSymbol $sym134$_CSETF_XREF_S_GLOBAL_REFERENCED_BY_METHOD_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-BY-METHOD-TABLE");
  public static final SubLSymbol $sym135$XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE = makeSymbol("XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE");
  public static final SubLSymbol $sym136$_CSETF_XREF_S_GLOBAL_MODIFIED_BY_METHOD_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-MODIFIED-BY-METHOD-TABLE");
  public static final SubLSymbol $sym137$XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE = makeSymbol("XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE");
  public static final SubLSymbol $sym138$_CSETF_XREF_S_GLOBAL_REBOUND_BY_METHOD_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-REBOUND-BY-METHOD-TABLE");
  public static final SubLSymbol $sym139$XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE = makeSymbol("XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE");
  public static final SubLSymbol $sym140$_CSETF_XREF_S_GLOBAL_REFERENCED_BY_GLOBAL_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-BY-GLOBAL-TABLE");
  public static final SubLSymbol $sym141$XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE = makeSymbol("XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE");
  public static final SubLSymbol $sym142$_CSETF_XREF_S_GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE");
  public static final SubLSymbol $sym143$XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE = makeSymbol("XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE");
  public static final SubLSymbol $sym144$_CSETF_XREF_S_GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE");
  public static final SubLSymbol $sym145$XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE = makeSymbol("XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE");
  public static final SubLSymbol $sym146$_CSETF_XREF_S_GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE = makeSymbol("_CSETF-XREF-S-GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE");
  public static final SubLSymbol $kw147$XREF_MODULE_TABLE = makeKeyword("XREF-MODULE-TABLE");
  public static final SubLSymbol $kw148$METHOD_DEFINITION_TABLE = makeKeyword("METHOD-DEFINITION-TABLE");
  public static final SubLSymbol $kw149$GLOBAL_DEFINITION_TABLE = makeKeyword("GLOBAL-DEFINITION-TABLE");
  public static final SubLSymbol $kw150$METHOD_CALLED_BY_METHOD_TABLE = makeKeyword("METHOD-CALLED-BY-METHOD-TABLE");
  public static final SubLSymbol $kw151$METHOD_CALLED_BY_GLOBAL_TABLE = makeKeyword("METHOD-CALLED-BY-GLOBAL-TABLE");
  public static final SubLSymbol $kw152$METHOD_CALLED_AT_TOP_LEVEL_TABLE = makeKeyword("METHOD-CALLED-AT-TOP-LEVEL-TABLE");
  public static final SubLSymbol $kw153$GLOBAL_REFERENCED_BY_METHOD_TABLE = makeKeyword("GLOBAL-REFERENCED-BY-METHOD-TABLE");
  public static final SubLSymbol $kw154$GLOBAL_MODIFIED_BY_METHOD_TABLE = makeKeyword("GLOBAL-MODIFIED-BY-METHOD-TABLE");
  public static final SubLSymbol $kw155$GLOBAL_REBOUND_BY_METHOD_TABLE = makeKeyword("GLOBAL-REBOUND-BY-METHOD-TABLE");
  public static final SubLSymbol $kw156$GLOBAL_REFERENCED_BY_GLOBAL_TABLE = makeKeyword("GLOBAL-REFERENCED-BY-GLOBAL-TABLE");
  public static final SubLSymbol $kw157$GLOBAL_REFERENCED_AT_TOP_LEVEL_TABLE = makeKeyword("GLOBAL-REFERENCED-AT-TOP-LEVEL-TABLE");
  public static final SubLSymbol $kw158$GLOBAL_MODIFIED_AT_TOP_LEVEL_TABLE = makeKeyword("GLOBAL-MODIFIED-AT-TOP-LEVEL-TABLE");
  public static final SubLSymbol $kw159$GLOBAL_REBOUND_AT_TOP_LEVEL_TABLE = makeKeyword("GLOBAL-REBOUND-AT-TOP-LEVEL-TABLE");
  public static final SubLString $str160$_A____S_features___S_modules = makeString("~A : ~S features, ~S modules");
  public static final SubLInteger $int161$10000 = makeInteger(10000);
  public static final SubLInteger $int162$1000 = makeInteger(1000);
  public static final SubLInteger $int163$500 = makeInteger(500);
  public static final SubLString $str164$Module__A_features_changed_to__S = makeString("Module ~A features changed to ~S");
  public static final SubLSymbol $kw165$SL2C = makeKeyword("SL2C");
  public static final SubLSymbol $kw166$SL2JAVA = makeKeyword("SL2JAVA");
  public static final SubLString $str167$Unexpected_backend__S = makeString("Unexpected backend ~S");
  public static final SubLSymbol $sym168$XRM_NAME = makeSymbol("XRM-NAME");
  public static final SubLSymbol $sym169$NOT_EQ = makeSymbol("NOT-EQ");
  public static final SubLSymbol $sym170$CDR = makeSymbol("CDR");
  public static final SubLSymbol $kw171$METHODS = makeKeyword("METHODS");
  public static final SubLSymbol $kw172$GLOBALS = makeKeyword("GLOBALS");
  public static final SubLSymbol $sym173$XREF_METHOD_POTENTIALLY_PRIVATE_P = makeSymbol("XREF-METHOD-POTENTIALLY-PRIVATE-P");
  public static final SubLSymbol $sym174$XREF_GLOBAL_POTENTIALLY_PRIVATE_P = makeSymbol("XREF-GLOBAL-POTENTIALLY-PRIVATE-P");
  public static final SubLSymbol $sym175$CODE_COMMENT = makeSymbol("CODE-COMMENT");
  public static final SubLString $str176$_subl_ = makeString("@subl ");
  public static final SubLString $str177$_ = makeString(" ");
  public static final SubLSymbol $sym178$XREF_MODULE_RELATIVE_INPUT_FILENAME = makeSymbol("XREF-MODULE-RELATIVE-INPUT-FILENAME");
  public static final SubLSymbol $kw179$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list180 = list(list(makeSymbol("&KEY"), makeSymbol("NAME"), makeSymbol("FEATURES")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list181 = list(makeKeyword("NAME"), makeKeyword("FEATURES"));
  public static final SubLSymbol $sym182$SYSTEM_VAR = makeUninternedSymbol("SYSTEM-VAR");
  public static final SubLSymbol $sym183$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");
  public static final SubLList $list184 = list(list(makeSymbol("CURRENT-XREF-SYSTEM")));
  public static final SubLSymbol $sym185$FWHEN = makeSymbol("FWHEN");
  public static final SubLSymbol $sym186$NEW_XREF_MODULE = makeSymbol("NEW-XREF-MODULE");
  public static final SubLSymbol $sym187$_CURRENT_XREF_MODULE_ = makeSymbol("*CURRENT-XREF-MODULE*");
  public static final SubLSymbol $sym188$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym189$XRS_MERGE_XREF_MODULE = makeSymbol("XRS-MERGE-XREF-MODULE");
  public static final SubLList $list190 = list(makeSymbol("XRM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list191 = list(list(makeSymbol("CURRENT-XREF-MODULE")));
  public static final SubLSymbol $sym192$CURRENT_XREF_MODULE = makeSymbol("CURRENT-XREF-MODULE");
  public static final SubLSymbol $sym193$WITH_CURRENT_XREF_MODULE = makeSymbol("WITH-CURRENT-XREF-MODULE");
  public static final SubLList $list194 = list(makeSymbol("MODULE-NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym195$NAME_VAR = makeUninternedSymbol("NAME-VAR");
  public static final SubLSymbol $sym196$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list197 = list(makeSymbol("STRINGP"));
  public static final SubLSymbol $sym198$_XREF_MODULE_SCOPE_ = makeSymbol("*XREF-MODULE-SCOPE*");
  public static final SubLList $list199 = list(makeSymbol("FILE-POSITION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym200$POSITION_VAR = makeUninternedSymbol("POSITION-VAR");
  public static final SubLList $list201 = list(makeSymbol("NON-NEGATIVE-INTEGER-P"));
  public static final SubLSymbol $sym202$_XREF_FILE_POSITION_SCOPE_ = makeSymbol("*XREF-FILE-POSITION-SCOPE*");
  public static final SubLList $list203 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym204$XREF_WITHIN_METHOD = makeSymbol("XREF-WITHIN-METHOD");
  public static final SubLList $list205 = list(makeSymbol("METHOD"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym206$METHOD_VAR = makeUninternedSymbol("METHOD-VAR");
  public static final SubLList $list207 = list(makeSymbol("SYMBOLP"));
  public static final SubLSymbol $sym208$_XREF_METHOD_SCOPE_ = makeSymbol("*XREF-METHOD-SCOPE*");
  public static final SubLList $list209 = list(makeSymbol("GLOBAL"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym210$GLOBAL_VAR = makeUninternedSymbol("GLOBAL-VAR");
  public static final SubLSymbol $sym211$_XREF_GLOBAL_SCOPE_ = makeSymbol("*XREF-GLOBAL-SCOPE*");
  public static final SubLSymbol $kw212$METHOD = makeKeyword("METHOD");
  public static final SubLSymbol $kw213$GLOBAL = makeKeyword("GLOBAL");
  public static final SubLSymbol $kw214$FILE = makeKeyword("FILE");
  public static final SubLString $str215$___def_glob____S = makeString("~% def glob : ~S");
  public static final SubLString $str216$___defmacro____S = makeString("~% defmacro : ~S");
  public static final SubLString $str217$___define______S = makeString("~% define   : ~S");
  public static final SubLString $str218$____arglist____S = makeString("~%  arglist : ~S");
  public static final SubLString $str219$____binding_type____S = makeString("~%  binding-type : ~S");
  public static final SubLString $str220$____ref_glob_____S = makeString("~%  ref glob  : ~S");
  public static final SubLString $str221$____mod_glob_____S = makeString("~%  mod glob  : ~S");
  public static final SubLString $str222$Initializer_for__S_modifies__S = makeString("Initializer for ~S modifies ~S");
  public static final SubLString $str223$____bind_glob_____S = makeString("~%  bind glob  : ~S");
  public static final SubLString $str224$Initializer_for__S_rebinds__S = makeString("Initializer for ~S rebinds ~S");
  public static final SubLString $str225$____macro_use____S = makeString("~%  macro use : ~S");
  public static final SubLString $str226$____fun_call_____S = makeString("~%  fun call  : ~S");
  public static final SubLString $str227$__module_removed_____A = makeString("~%module removed  : ~A");
  public static final SubLSymbol $sym228$STRING_LESSP = makeSymbol("STRING-LESSP");
  public static final SubLSymbol $sym229$SYMBOL_NAME = makeSymbol("SYMBOL-NAME");
  public static final SubLSymbol $sym230$_ = makeSymbol("<");
  public static final SubLSymbol $sym231$XREF_GLOBAL_ACCESS_COUNT = makeSymbol("XREF-GLOBAL-ACCESS-COUNT");
  public static final SubLSymbol $sym232$XREF_METHOD_CALL_COUNT = makeSymbol("XREF-METHOD-CALL-COUNT");

  //// Initializers

  public void declareFunctions() {
    declare_xref_database_file();
  }

  public void initializeVariables() {
    init_xref_database_file();
  }

  public void runTopLevelForms() {
    setup_xref_database_file();
  }

}
