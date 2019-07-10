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
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.ke;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.system_parameters;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.tms;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.wff_utilities;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class misc_kb_utilities extends SubLTranslatedFile {

  //// Constructor

  private misc_kb_utilities() {}
  public static final SubLFile me = new misc_kb_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.misc_kb_utilities";

  //// Definitions

  @SubL(source = "cycl/misc-kb-utilities.lisp", position = 3168) 
  public static SubLSymbol $kb_handle_internal_method_table$ = null;

  @SubL(source = "cycl/misc-kb-utilities.lisp", position = 3281) 
  public static final SubLObject kb_handle_internal_constant_method(SubLObject object) {
    return Values.values($kw15$CONSTANT, constants_high.constant_internal_id(object));
  }

  @SubL(source = "cycl/misc-kb-utilities.lisp", position = 3394) 
  public static final SubLObject kb_handle_internal_nart_method(SubLObject object) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4609");
  }

  @SubL(source = "cycl/misc-kb-utilities.lisp", position = 3574) 
  public static final SubLObject kb_handle_internal_variable_method(SubLObject object) {
    return Values.values($kw19$VARIABLE, variables.variable_id(object));
  }

  @SubL(source = "cycl/misc-kb-utilities.lisp", position = 3678) 
  public static final SubLObject kb_handle_internal_assertion_method(SubLObject object) {
    return Values.values($kw21$ASSERTION, assertion_handles.assertion_id(object));
  }

  @SubL(source = "cycl/misc-kb-utilities.lisp", position = 3785) 
  public static final SubLObject kb_handle_internal_deduction_method(SubLObject object) {
    return Values.values($kw23$DEDUCTION, deduction_handles.deduction_id(object));
  }

  @SubL(source = "cycl/misc-kb-utilities.lisp", position = 3892) 
  private static SubLSymbol $find_object_by_kb_handle_methods$ = null;

  @SubL(source = "cycl/misc-kb-utilities.lisp", position = 4227) 
  public static final SubLObject register_find_object_by_kb_handle_method(SubLObject type, SubLObject method) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      $find_object_by_kb_handle_methods$.setDynamicValue(Sequences.delete(type, $find_object_by_kb_handle_methods$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function($sym25$FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
      $find_object_by_kb_handle_methods$.setDynamicValue(cons(list(type, method), $find_object_by_kb_handle_methods$.getDynamicValue(thread)), thread);
      return NIL;
    }
  }

  public static final class $get_term_id$UnaryFunction extends UnaryFunction {
    public $get_term_id$UnaryFunction() { super(extractFunctionNamed("GET-TERM-ID")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4607"); }
  }

  /** used in various afterAddings that affect genl-pos?
   @param ASSERTION assertion
   @owner daves */
  @SubL(source = "cycl/misc-kb-utilities.lisp", position = 10210) 
  public static final SubLObject possibly_clear_genl_pos(SubLObject assertion) {
    return $kw47$CHECKED;
  }

  public static final SubLObject declare_misc_kb_utilities_file() {
    //declareFunction(myName, "kill_proprietary_constants", "KILL-PROPRIETARY-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "make_lispy_form", "MAKE-LISPY-FORM", 1, 0, false);
    //declareFunction(myName, "cycl_from_id", "CYCL-FROM-ID", 1, 0, false);
    //declareFunction(myName, "name_of_car", "NAME-OF-CAR", 1, 0, false);
    //declareFunction(myName, "kb_handle", "KB-HANDLE", 1, 0, false);
    //declareFunction(myName, "kb_handle_internal", "KB-HANDLE-INTERNAL", 1, 0, false);
    declareFunction(myName, "kb_handle_internal_constant_method", "KB-HANDLE-INTERNAL-CONSTANT-METHOD", 1, 0, false);
    declareFunction(myName, "kb_handle_internal_nart_method", "KB-HANDLE-INTERNAL-NART-METHOD", 1, 0, false);
    //declareFunction(myName, "kb_handle_internal_nart", "KB-HANDLE-INTERNAL-NART", 1, 0, false);
    declareFunction(myName, "kb_handle_internal_variable_method", "KB-HANDLE-INTERNAL-VARIABLE-METHOD", 1, 0, false);
    declareFunction(myName, "kb_handle_internal_assertion_method", "KB-HANDLE-INTERNAL-ASSERTION-METHOD", 1, 0, false);
    declareFunction(myName, "kb_handle_internal_deduction_method", "KB-HANDLE-INTERNAL-DEDUCTION-METHOD", 1, 0, false);
    //declareFunction(myName, "find_object_by_kb_handle", "FIND-OBJECT-BY-KB-HANDLE", 2, 0, false);
    declareFunction(myName, "register_find_object_by_kb_handle_method", "REGISTER-FIND-OBJECT-BY-KB-HANDLE-METHOD", 2, 0, false);
    //declareFunction(myName, "list_kb_handle", "LIST-KB-HANDLE", 1, 0, false);
    //declareFunction(myName, "fi_object_from_handle", "FI-OBJECT-FROM-HANDLE", 1, 1, false);
    //declareFunction(myName, "get_term_id", "GET-TERM-ID", 1, 0, false); new $get_term_id$UnaryFunction();
    //declareFunction(myName, "term_from_id", "TERM-FROM-ID", 1, 0, false);
    //declareFunction(myName, "not_a_cyc_constantP", "NOT-A-CYC-CONSTANT?", 1, 0, false);
    //declareFunction(myName, "gather_constants", "GATHER-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "constant_or_natP", "CONSTANT-OR-NAT?", 1, 0, false);
    //declareFunction(myName, "nat_objectP", "NAT-OBJECT?", 1, 0, false);
    //declareFunction(myName, "remove_mt_assertions", "REMOVE-MT-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "empty_mt_p", "EMPTY-MT-P", 1, 0, false);
    //declareFunction(myName, "coerce_name", "COERCE-NAME", 1, 0, false);
    //declareFunction(myName, "terms_in_mt", "TERMS-IN-MT", 1, 0, false);
    //declareFunction(myName, "assertion_ids_in_mt", "ASSERTION-IDS-IN-MT", 1, 0, false);
    //declareFunction(myName, "try_unassert", "TRY-UNASSERT", 2, 0, false);
    //declareFunction(myName, "try_assert", "TRY-ASSERT", 2, 2, false);
    //declareFunction(myName, "try_unassert_now", "TRY-UNASSERT-NOW", 2, 0, false);
    //declareFunction(myName, "try_assert_now", "TRY-ASSERT-NOW", 2, 2, false);
    //declareFunction(myName, "fast_assert_int", "FAST-ASSERT-INT", 2, 5, false);
    declareFunction(myName, "possibly_clear_genl_pos", "POSSIBLY-CLEAR-GENL-POS", 1, 0, false);
    //declareFunction(myName, "guess_fort", "GUESS-FORT", 1, 0, false);
    //declareFunction(myName, "fort_for_string", "FORT-FOR-STRING", 1, 0, false);
    //declareFunction(myName, "read_terms_from_file", "READ-TERMS-FROM-FILE", 1, 0, false);
    //declareFunction(myName, "read_from_string_ignoring_all_errors", "READ-FROM-STRING-IGNORING-ALL-ERRORS", 1, 3, false);
    //declareFunction(myName, "string_to_formula", "STRING-TO-FORMULA", 1, 0, false);
    //declareFunction(myName, "find_or_create_nart_from_text", "FIND-OR-CREATE-NART-FROM-TEXT", 1, 0, false);
    //declareFunction(myName, "resolve_constant", "RESOLVE-CONSTANT", 1, 1, false);
    //declareFunction(myName, "instance_named_fn_expression_p", "INSTANCE-NAMED-FN-EXPRESSION-P", 1, 0, false);
    //declareFunction(myName, "instance_named_fn_term_p", "INSTANCE-NAMED-FN-TERM-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_misc_kb_utilities_file() {
    $kb_handle_internal_method_table$ = deflexical("*KB-HANDLE-INTERNAL-METHOD-TABLE*", Vectors.make_vector($int13$256, NIL));
    $find_object_by_kb_handle_methods$ = defparameter("*FIND-OBJECT-BY-KB-HANDLE-METHODS*", NIL);
    return NIL;
  }

  public static final SubLObject setup_misc_kb_utilities_file() {
    // CVS_ID("Id: misc-kb-utilities.lisp 128436 2009-07-28 22:59:45Z goolsbey ");
    Structures.register_method($kb_handle_internal_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function($sym16$KB_HANDLE_INTERNAL_CONSTANT_METHOD));
    Structures.register_method($kb_handle_internal_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function($sym17$KB_HANDLE_INTERNAL_NART_METHOD));
    Structures.register_method($kb_handle_internal_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), Symbols.symbol_function($sym20$KB_HANDLE_INTERNAL_VARIABLE_METHOD));
    Structures.register_method($kb_handle_internal_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function($sym22$KB_HANDLE_INTERNAL_ASSERTION_METHOD));
    Structures.register_method($kb_handle_internal_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function($sym24$KB_HANDLE_INTERNAL_DEDUCTION_METHOD));
    register_find_object_by_kb_handle_method($kw15$CONSTANT, $sym26$FIND_CONSTANT_BY_INTERNAL_ID);
    register_find_object_by_kb_handle_method($kw18$NART, $sym27$FIND_NART_BY_ID);
    register_find_object_by_kb_handle_method($kw19$VARIABLE, $sym28$FIND_VARIABLE_BY_ID);
    register_find_object_by_kb_handle_method($kw21$ASSERTION, $sym29$FIND_ASSERTION_BY_ID);
    register_find_object_by_kb_handle_method($kw23$DEDUCTION, $sym30$FIND_DEDUCTION_BY_ID);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const1$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLString $str2$__Collecting_proprietary_constant = makeString("~%Collecting proprietary constants ... ");
  public static final SubLString $str3$_____s_____ = makeString("~%  ~s ... ");
  public static final SubLString $str4$_s_found_ = makeString("~s found.");
  public static final SubLString $str5$__Preparing_to_kill__s_proprietar = makeString("~%Preparing to kill ~s proprietary constants.  Go ahead? ");
  public static final SubLObject $const6$Microtheory = constant_handles.reader_make_constant_shell(makeString("Microtheory"));
  public static final SubLString $str7$___s_terms_killed_ = makeString("~%~s terms killed.");
  public static final SubLString $str8$__Done_ = makeString("~%Done.");
  public static final SubLString $str9$__Returning_to_Lisp_Interactor_ = makeString("~%Returning to Lisp Interactor.");
  public static final SubLSymbol $sym10$DONE = makeSymbol("DONE");
  public static final SubLSymbol $sym11$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym12$NART_P = makeSymbol("NART-P");
  public static final SubLInteger $int13$256 = makeInteger(256);
  public static final SubLString $str14$_S_is_not_a_KB_datastructure_obje = makeString("~S is not a KB datastructure object");
  public static final SubLSymbol $kw15$CONSTANT = makeKeyword("CONSTANT");
  public static final SubLSymbol $sym16$KB_HANDLE_INTERNAL_CONSTANT_METHOD = makeSymbol("KB-HANDLE-INTERNAL-CONSTANT-METHOD");
  public static final SubLSymbol $sym17$KB_HANDLE_INTERNAL_NART_METHOD = makeSymbol("KB-HANDLE-INTERNAL-NART-METHOD");
  public static final SubLSymbol $kw18$NART = makeKeyword("NART");
  public static final SubLSymbol $kw19$VARIABLE = makeKeyword("VARIABLE");
  public static final SubLSymbol $sym20$KB_HANDLE_INTERNAL_VARIABLE_METHOD = makeSymbol("KB-HANDLE-INTERNAL-VARIABLE-METHOD");
  public static final SubLSymbol $kw21$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLSymbol $sym22$KB_HANDLE_INTERNAL_ASSERTION_METHOD = makeSymbol("KB-HANDLE-INTERNAL-ASSERTION-METHOD");
  public static final SubLSymbol $kw23$DEDUCTION = makeKeyword("DEDUCTION");
  public static final SubLSymbol $sym24$KB_HANDLE_INTERNAL_DEDUCTION_METHOD = makeSymbol("KB-HANDLE-INTERNAL-DEDUCTION-METHOD");
  public static final SubLSymbol $sym25$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym26$FIND_CONSTANT_BY_INTERNAL_ID = makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
  public static final SubLSymbol $sym27$FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");
  public static final SubLSymbol $sym28$FIND_VARIABLE_BY_ID = makeSymbol("FIND-VARIABLE-BY-ID");
  public static final SubLSymbol $sym29$FIND_ASSERTION_BY_ID = makeSymbol("FIND-ASSERTION-BY-ID");
  public static final SubLSymbol $sym30$FIND_DEDUCTION_BY_ID = makeSymbol("FIND-DEDUCTION-BY-ID");
  public static final SubLList $list31 = list(makeSymbol("FORT-P"), makeSymbol("ASSERTION-P"), makeSymbol("VARIABLE-P"), makeSymbol("DEDUCTION-P"));
  public static final SubLSymbol $sym32$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym33$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym34$CONSTANT_OR_NAT_ = makeSymbol("CONSTANT-OR-NAT?");
  public static final SubLSymbol $kw35$MT = makeKeyword("MT");
  public static final SubLSymbol $kw36$BROAD_MT = makeKeyword("BROAD-MT");
  public static final SubLSymbol $kw37$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLString $str38$do_broad_mt_index = makeString("do-broad-mt-index");
  public static final SubLSymbol $sym39$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw40$SKIP = makeKeyword("SKIP");
  public static final SubLString $str41$_a = makeString("~a");
  public static final SubLString $str42$ = makeString("");
  public static final SubLSymbol $sym43$STRING_ = makeSymbol("STRING<");
  public static final SubLSymbol $sym44$COERCE_NAME = makeSymbol("COERCE-NAME");
  public static final SubLString $str45$_s_is_not_a_microtheory_ = makeString("~s is not a microtheory.");
  public static final SubLSymbol $kw46$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $kw47$CHECKED = makeKeyword("CHECKED");
  public static final SubLString $str48$____a__does_not_refer_to_a_valid_ = makeString("~&'~a' does not refer to a valid term~%");
  public static final SubLSymbol $kw49$EOF = makeKeyword("EOF");
  public static final SubLObject $const50$DeadTerm = constant_handles.reader_make_constant_shell(makeString("DeadTerm"));
  public static final SubLSymbol $sym51$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");
  public static final SubLObject $const52$InstanceNamedFn = constant_handles.reader_make_constant_shell(makeString("InstanceNamedFn"));
  public static final SubLObject $const53$InstanceNamedFn_Ternary = constant_handles.reader_make_constant_shell(makeString("InstanceNamedFn-Ternary"));

  //// Initializers

  public void declareFunctions() {
    declare_misc_kb_utilities_file();
  }

  public void initializeVariables() {
    init_misc_kb_utilities_file();
  }

  public void runTopLevelForms() {
    setup_misc_kb_utilities_file();
  }

}
