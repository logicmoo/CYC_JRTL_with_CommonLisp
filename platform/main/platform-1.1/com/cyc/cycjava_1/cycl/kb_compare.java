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

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.deduction_handles;
//dm import com.cyc.cycjava_1.cycl.deductions_high;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.remote_image;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class kb_compare extends SubLTranslatedFile {

  //// Constructor

  private kb_compare() {}
  public static final SubLFile me = new kb_compare();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_compare";

  //// Definitions

  /** A list of the common symbols used across KB compare connections. */
  @SubL(source = "cycl/kb-compare.lisp", position = 767) 
  private static SubLSymbol $kb_compare_common_symbols$ = null;

  public static final class $kb_intersection_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $remote_image; }
    public SubLObject getField3() { return $constant_index; }
    public SubLObject getField4() { return $nart_index; }
    public SubLObject getField5() { return $assertion_index; }
    public SubLObject getField6() { return $deduction_index; }
    public SubLObject setField2(SubLObject value) { return $remote_image = value; }
    public SubLObject setField3(SubLObject value) { return $constant_index = value; }
    public SubLObject setField4(SubLObject value) { return $nart_index = value; }
    public SubLObject setField5(SubLObject value) { return $assertion_index = value; }
    public SubLObject setField6(SubLObject value) { return $deduction_index = value; }
    public SubLObject $remote_image = NIL;
    public SubLObject $constant_index = NIL;
    public SubLObject $nart_index = NIL;
    public SubLObject $assertion_index = NIL;
    public SubLObject $deduction_index = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($kb_intersection_native.class, $sym18$KB_INTERSECTION, $sym19$KB_INTERSECTION_P, $list20, $list21, new String[] {"$remote_image", "$constant_index", "$nart_index", "$assertion_index", "$deduction_index"}, $list22, $list23, $sym24$PRINT_KB_INTERSECTION);
  }

  @SubL(source = "cycl/kb-compare.lisp", position = 2703) 
  public static SubLSymbol $dtp_kb_intersection$ = null;

  @SubL(source = "cycl/kb-compare.lisp", position = 2703) 
  public static final SubLObject kb_intersection_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4602");
    return NIL;
  }

  public static final class $kb_intersection_p$UnaryFunction extends UnaryFunction {
    public $kb_intersection_p$UnaryFunction() { super(extractFunctionNamed("KB-INTERSECTION-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4594"); }
  }

  @SubL(source = "cycl/kb-compare.lisp", position = 8834) 
  private static SubLSymbol $kb_intersection$ = null;

  public static final class $kb_difference_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $common_intersection; }
    public SubLObject getField3() { return $renamed_constants; }
    public SubLObject getField4() { return $constants; }
    public SubLObject getField5() { return $narts; }
    public SubLObject getField6() { return $assertions; }
    public SubLObject getField7() { return $deductions; }
    public SubLObject setField2(SubLObject value) { return $common_intersection = value; }
    public SubLObject setField3(SubLObject value) { return $renamed_constants = value; }
    public SubLObject setField4(SubLObject value) { return $constants = value; }
    public SubLObject setField5(SubLObject value) { return $narts = value; }
    public SubLObject setField6(SubLObject value) { return $assertions = value; }
    public SubLObject setField7(SubLObject value) { return $deductions = value; }
    public SubLObject $common_intersection = NIL;
    public SubLObject $renamed_constants = NIL;
    public SubLObject $constants = NIL;
    public SubLObject $narts = NIL;
    public SubLObject $assertions = NIL;
    public SubLObject $deductions = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($kb_difference_native.class, $sym64$KB_DIFFERENCE, $sym65$KB_DIFFERENCE_P, $list66, $list67, new String[] {"$common_intersection", "$renamed_constants", "$constants", "$narts", "$assertions", "$deductions"}, $list68, $list69, $sym70$PRINT_KB_DIFFERENCE);
  }

  @SubL(source = "cycl/kb-compare.lisp", position = 12041) 
  public static SubLSymbol $dtp_kb_difference$ = null;

  @SubL(source = "cycl/kb-compare.lisp", position = 12041) 
  public static final SubLObject kb_difference_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4601");
    return NIL;
  }

  public static final class $kb_difference_p$UnaryFunction extends UnaryFunction {
    public $kb_difference_p$UnaryFunction() { super(extractFunctionNamed("KB-DIFFERENCE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4564"); }
  }

  public static final SubLObject declare_kb_compare_file() {
    //declareMacro(myName, "with_new_kb_compare_connection", "WITH-NEW-KB-COMPARE-CONNECTION");
    //declareFunction(myName, "set_kb_compare_connection_common_symbols", "SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS", 0, 0, false);
    declareFunction(myName, "kb_intersection_print_function_trampoline", "KB-INTERSECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "kb_intersection_p", "KB-INTERSECTION-P", 1, 0, false); new $kb_intersection_p$UnaryFunction();
    //declareFunction(myName, "kb_intrsct_remote_image", "KB-INTRSCT-REMOTE-IMAGE", 1, 0, false);
    //declareFunction(myName, "kb_intrsct_constant_index", "KB-INTRSCT-CONSTANT-INDEX", 1, 0, false);
    //declareFunction(myName, "kb_intrsct_nart_index", "KB-INTRSCT-NART-INDEX", 1, 0, false);
    //declareFunction(myName, "kb_intrsct_assertion_index", "KB-INTRSCT-ASSERTION-INDEX", 1, 0, false);
    //declareFunction(myName, "kb_intrsct_deduction_index", "KB-INTRSCT-DEDUCTION-INDEX", 1, 0, false);
    //declareFunction(myName, "_csetf_kb_intrsct_remote_image", "_CSETF-KB-INTRSCT-REMOTE-IMAGE", 2, 0, false);
    //declareFunction(myName, "_csetf_kb_intrsct_constant_index", "_CSETF-KB-INTRSCT-CONSTANT-INDEX", 2, 0, false);
    //declareFunction(myName, "_csetf_kb_intrsct_nart_index", "_CSETF-KB-INTRSCT-NART-INDEX", 2, 0, false);
    //declareFunction(myName, "_csetf_kb_intrsct_assertion_index", "_CSETF-KB-INTRSCT-ASSERTION-INDEX", 2, 0, false);
    //declareFunction(myName, "_csetf_kb_intrsct_deduction_index", "_CSETF-KB-INTRSCT-DEDUCTION-INDEX", 2, 0, false);
    //declareFunction(myName, "make_kb_intersection", "MAKE-KB-INTERSECTION", 0, 1, false);
    //declareFunction(myName, "print_kb_intersection", "PRINT-KB-INTERSECTION", 3, 0, false);
    //declareFunction(myName, "new_kb_intersection", "NEW-KB-INTERSECTION", 1, 0, false);
    //declareFunction(myName, "destroy_kb_intersection", "DESTROY-KB-INTERSECTION", 1, 0, false);
    //declareFunction(myName, "kb_intersection_remote_image", "KB-INTERSECTION-REMOTE-IMAGE", 1, 0, false);
    //declareFunction(myName, "kb_intersection_constant_index", "KB-INTERSECTION-CONSTANT-INDEX", 1, 0, false);
    //declareFunction(myName, "kb_intersection_add_constant", "KB-INTERSECTION-ADD-CONSTANT", 3, 0, false);
    //declareFunction(myName, "kb_intersection_add_nart", "KB-INTERSECTION-ADD-NART", 3, 0, false);
    //declareFunction(myName, "kb_intersection_add_assertion", "KB-INTERSECTION-ADD-ASSERTION", 3, 0, false);
    //declareFunction(myName, "kb_intersection_add_deduction", "KB-INTERSECTION-ADD-DEDUCTION", 3, 0, false);
    //declareFunction(myName, "kb_intersection_remote_image_machine", "KB-INTERSECTION-REMOTE-IMAGE-MACHINE", 1, 0, false);
    //declareFunction(myName, "kb_intersection_remote_image_port", "KB-INTERSECTION-REMOTE-IMAGE-PORT", 1, 0, false);
    //declareFunction(myName, "kb_intersection_remote_image_protocol", "KB-INTERSECTION-REMOTE-IMAGE-PROTOCOL", 1, 0, false);
    //declareFunction(myName, "kb_intersection_constantP", "KB-INTERSECTION-CONSTANT?", 2, 0, false);
    //declareFunction(myName, "kb_intersection_constant_remote_id", "KB-INTERSECTION-CONSTANT-REMOTE-ID", 2, 0, false);
    //declareFunction(myName, "kb_intersection_nartP", "KB-INTERSECTION-NART?", 2, 0, false);
    //declareFunction(myName, "kb_intersection_nart_remote_id", "KB-INTERSECTION-NART-REMOTE-ID", 2, 0, false);
    //declareFunction(myName, "kb_intersection_assertionP", "KB-INTERSECTION-ASSERTION?", 2, 0, false);
    //declareFunction(myName, "kb_intersection_assertion_remote_id", "KB-INTERSECTION-ASSERTION-REMOTE-ID", 2, 0, false);
    //declareFunction(myName, "kb_intersection_deductionP", "KB-INTERSECTION-DEDUCTION?", 2, 0, false);
    //declareFunction(myName, "kb_intersection_deduction_remote_id", "KB-INTERSECTION-DEDUCTION-REMOTE-ID", 2, 0, false);
    //declareMacro(myName, "do_kb_intersection_constants", "DO-KB-INTERSECTION-CONSTANTS");
    //declareFunction(myName, "kb_intersection_nart_impossibleP", "KB-INTERSECTION-NART-IMPOSSIBLE?", 2, 0, false);
    //declareFunction(myName, "kb_intersection_nart_impossible_int", "KB-INTERSECTION-NART-IMPOSSIBLE-INT", 1, 0, false);
    //declareFunction(myName, "kb_intersection_assertion_impossibleP", "KB-INTERSECTION-ASSERTION-IMPOSSIBLE?", 2, 0, false);
    //declareFunction(myName, "kb_intersection_assertion_impossible_int", "KB-INTERSECTION-ASSERTION-IMPOSSIBLE-INT", 1, 0, false);
    //declareFunction(myName, "kb_intersection_deduction_impossibleP", "KB-INTERSECTION-DEDUCTION-IMPOSSIBLE?", 2, 0, false);
    //declareFunction(myName, "kb_intersection_deduction_impossible_int", "KB-INTERSECTION-DEDUCTION-IMPOSSIBLE-INT", 1, 0, false);
    declareFunction(myName, "kb_difference_print_function_trampoline", "KB-DIFFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "kb_difference_p", "KB-DIFFERENCE-P", 1, 0, false); new $kb_difference_p$UnaryFunction();
    //declareFunction(myName, "kb_diff_common_intersection", "KB-DIFF-COMMON-INTERSECTION", 1, 0, false);
    //declareFunction(myName, "kb_diff_renamed_constants", "KB-DIFF-RENAMED-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "kb_diff_constants", "KB-DIFF-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "kb_diff_narts", "KB-DIFF-NARTS", 1, 0, false);
    //declareFunction(myName, "kb_diff_assertions", "KB-DIFF-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "kb_diff_deductions", "KB-DIFF-DEDUCTIONS", 1, 0, false);
    //declareFunction(myName, "_csetf_kb_diff_common_intersection", "_CSETF-KB-DIFF-COMMON-INTERSECTION", 2, 0, false);
    //declareFunction(myName, "_csetf_kb_diff_renamed_constants", "_CSETF-KB-DIFF-RENAMED-CONSTANTS", 2, 0, false);
    //declareFunction(myName, "_csetf_kb_diff_constants", "_CSETF-KB-DIFF-CONSTANTS", 2, 0, false);
    //declareFunction(myName, "_csetf_kb_diff_narts", "_CSETF-KB-DIFF-NARTS", 2, 0, false);
    //declareFunction(myName, "_csetf_kb_diff_assertions", "_CSETF-KB-DIFF-ASSERTIONS", 2, 0, false);
    //declareFunction(myName, "_csetf_kb_diff_deductions", "_CSETF-KB-DIFF-DEDUCTIONS", 2, 0, false);
    //declareFunction(myName, "make_kb_difference", "MAKE-KB-DIFFERENCE", 0, 1, false);
    //declareFunction(myName, "print_kb_difference", "PRINT-KB-DIFFERENCE", 3, 0, false);
    //declareFunction(myName, "new_kb_difference", "NEW-KB-DIFFERENCE", 1, 0, false);
    //declareFunction(myName, "destroy_kb_difference", "DESTROY-KB-DIFFERENCE", 1, 0, false);
    //declareFunction(myName, "kb_difference_common_intersection", "KB-DIFFERENCE-COMMON-INTERSECTION", 1, 0, false);
    //declareFunction(myName, "kb_difference_renamed_constants", "KB-DIFFERENCE-RENAMED-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "kb_difference_constants", "KB-DIFFERENCE-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "kb_difference_narts", "KB-DIFFERENCE-NARTS", 1, 0, false);
    //declareFunction(myName, "kb_difference_assertions", "KB-DIFFERENCE-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "kb_difference_deductions", "KB-DIFFERENCE-DEDUCTIONS", 1, 0, false);
    //declareMacro(myName, "do_kb_difference_renamed_constants", "DO-KB-DIFFERENCE-RENAMED-CONSTANTS");
    //declareMacro(myName, "do_kb_difference_constants", "DO-KB-DIFFERENCE-CONSTANTS");
    //declareMacro(myName, "do_kb_difference_narts", "DO-KB-DIFFERENCE-NARTS");
    //declareMacro(myName, "do_kb_difference_assertions", "DO-KB-DIFFERENCE-ASSERTIONS");
    //declareMacro(myName, "do_kb_difference_deductions", "DO-KB-DIFFERENCE-DEDUCTIONS");
    //declareFunction(myName, "kb_difference_add_renamed_constant", "KB-DIFFERENCE-ADD-RENAMED-CONSTANT", 3, 0, false);
    //declareFunction(myName, "kb_difference_add_constant", "KB-DIFFERENCE-ADD-CONSTANT", 2, 0, false);
    //declareFunction(myName, "kb_difference_add_nart", "KB-DIFFERENCE-ADD-NART", 2, 0, false);
    //declareFunction(myName, "kb_difference_add_assertion", "KB-DIFFERENCE-ADD-ASSERTION", 2, 0, false);
    //declareFunction(myName, "kb_difference_add_deduction", "KB-DIFFERENCE-ADD-DEDUCTION", 2, 0, false);
    //declareFunction(myName, "kb_difference_remote_image", "KB-DIFFERENCE-REMOTE-IMAGE", 1, 0, false);
    //declareFunction(myName, "kb_difference_remote_image_machine", "KB-DIFFERENCE-REMOTE-IMAGE-MACHINE", 1, 0, false);
    //declareFunction(myName, "kb_difference_remote_image_port", "KB-DIFFERENCE-REMOTE-IMAGE-PORT", 1, 0, false);
    //declareFunction(myName, "kb_difference_remote_image_protocol", "KB-DIFFERENCE-REMOTE-IMAGE-PROTOCOL", 1, 0, false);
    //declareFunction(myName, "kb_difference_constant_remote_name", "KB-DIFFERENCE-CONSTANT-REMOTE-NAME", 2, 0, false);
    //declareFunction(myName, "kb_difference_all_renamed_constants", "KB-DIFFERENCE-ALL-RENAMED-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "kb_difference_all_constants", "KB-DIFFERENCE-ALL-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "kb_difference_all_narts", "KB-DIFFERENCE-ALL-NARTS", 1, 0, false);
    //declareFunction(myName, "kb_difference_all_assertions", "KB-DIFFERENCE-ALL-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "kb_difference_all_deductions", "KB-DIFFERENCE-ALL-DEDUCTIONS", 1, 0, false);
    //declareFunction(myName, "kb_intersection_compute", "KB-INTERSECTION-COMPUTE", 1, 0, false);
    //declareFunction(myName, "kb_intersection_compute_constants", "KB-INTERSECTION-COMPUTE-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "kb_intersection_compute_congruent_old_constants", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "kb_intersection_compute_constant", "KB-INTERSECTION-COMPUTE-CONSTANT", 2, 0, false);
    //declareFunction(myName, "kb_intersection_compute_narts", "KB-INTERSECTION-COMPUTE-NARTS", 1, 0, false);
    //declareFunction(myName, "kb_intersection_compute_congruent_old_narts", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-NARTS", 1, 0, false);
    //declareFunction(myName, "kb_intersection_compute_nart", "KB-INTERSECTION-COMPUTE-NART", 2, 0, false);
    //declareFunction(myName, "kb_intersection_compute_assertions", "KB-INTERSECTION-COMPUTE-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "kb_intersection_compute_congruent_old_assertions", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "kb_intersection_compute_assertion", "KB-INTERSECTION-COMPUTE-ASSERTION", 2, 0, false);
    //declareFunction(myName, "kb_intersection_compute_deductions", "KB-INTERSECTION-COMPUTE-DEDUCTIONS", 1, 0, false);
    //declareFunction(myName, "kb_intersection_compute_congruent_old_deductions", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-DEDUCTIONS", 1, 0, false);
    //declareFunction(myName, "kb_intersection_compute_deduction", "KB-INTERSECTION-COMPUTE-DEDUCTION", 2, 0, false);
    //declareFunction(myName, "kb_difference_compute", "KB-DIFFERENCE-COMPUTE", 1, 0, false);
    //declareFunction(myName, "kb_difference_compute_renamed_constants", "KB-DIFFERENCE-COMPUTE-RENAMED-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "kb_difference_compute_constants", "KB-DIFFERENCE-COMPUTE-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "kb_difference_compute_narts", "KB-DIFFERENCE-COMPUTE-NARTS", 1, 0, false);
    //declareFunction(myName, "kb_difference_compute_assertions", "KB-DIFFERENCE-COMPUTE-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "kb_difference_compute_deductions", "KB-DIFFERENCE-COMPUTE-DEDUCTIONS", 1, 0, false);
    //declareFunction(myName, "compute_remote_image_kb_intersection", "COMPUTE-REMOTE-IMAGE-KB-INTERSECTION", 2, 1, false);
    //declareFunction(myName, "compute_remote_image_kb_difference", "COMPUTE-REMOTE-IMAGE-KB-DIFFERENCE", 2, 1, false);
    //declareFunction(myName, "show_kb_difference", "SHOW-KB-DIFFERENCE", 1, 1, false);
    //declareFunction(myName, "compute_remote_image_old_constants_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-CONSTANTS-CONGRUENT?", 0, 0, false);
    //declareFunction(myName, "compute_missing_old_constant_remote_ids", "COMPUTE-MISSING-OLD-CONSTANT-REMOTE-IDS", 0, 0, false);
    //declareFunction(myName, "compute_constant_remote_id", "COMPUTE-CONSTANT-REMOTE-ID", 1, 0, false);
    //declareFunction(myName, "compute_constant_remote_name", "COMPUTE-CONSTANT-REMOTE-NAME", 1, 0, false);
    //declareFunction(myName, "compute_remote_image_old_narts_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-NARTS-CONGRUENT?", 0, 0, false);
    //declareFunction(myName, "compute_missing_old_nart_remote_ids", "COMPUTE-MISSING-OLD-NART-REMOTE-IDS", 0, 0, false);
    //declareFunction(myName, "compute_nart_remote_id", "COMPUTE-NART-REMOTE-ID", 1, 0, false);
    //declareFunction(myName, "compute_remote_image_old_assertions_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-ASSERTIONS-CONGRUENT?", 0, 0, false);
    //declareFunction(myName, "compute_missing_old_assertion_remote_ids", "COMPUTE-MISSING-OLD-ASSERTION-REMOTE-IDS", 0, 0, false);
    //declareFunction(myName, "compute_assertion_remote_id", "COMPUTE-ASSERTION-REMOTE-ID", 1, 0, false);
    //declareFunction(myName, "compute_remote_image_old_deductions_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-DEDUCTIONS-CONGRUENT?", 0, 0, false);
    //declareFunction(myName, "compute_missing_old_deduction_remote_ids", "COMPUTE-MISSING-OLD-DEDUCTION-REMOTE-IDS", 0, 0, false);
    //declareFunction(myName, "compute_deduction_remote_id", "COMPUTE-DEDUCTION-REMOTE-ID", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_kb_compare_file() {
    $kb_compare_common_symbols$ = defparameter("*KB-COMPARE-COMMON-SYMBOLS*", ConsesLow.append($list0, $list1, ConsesLow.append(enumeration_types.valid_truths(), enumeration_types.valid_hl_truth_values(), hl_supports.hl_support_modules())));
    $dtp_kb_intersection$ = defconstant("*DTP-KB-INTERSECTION*", $sym18$KB_INTERSECTION);
    $kb_intersection$ = defparameter("*KB-INTERSECTION*", NIL);
    $dtp_kb_difference$ = defconstant("*DTP-KB-DIFFERENCE*", $sym64$KB_DIFFERENCE);
    return NIL;
  }

  public static final SubLObject setup_kb_compare_file() {
    // CVS_ID("Id: kb-compare.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_macro_helper($sym9$SET_KB_COMPARE_CONNECTION_COMMON_SYMBOLS, $sym10$WITH_NEW_KB_COMPARE_CONNECTION);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_kb_intersection$.getGlobalValue(), Symbols.symbol_function($sym25$KB_INTERSECTION_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym26$KB_INTRSCT_REMOTE_IMAGE, $sym27$_CSETF_KB_INTRSCT_REMOTE_IMAGE);
    Structures.def_csetf($sym28$KB_INTRSCT_CONSTANT_INDEX, $sym29$_CSETF_KB_INTRSCT_CONSTANT_INDEX);
    Structures.def_csetf($sym30$KB_INTRSCT_NART_INDEX, $sym31$_CSETF_KB_INTRSCT_NART_INDEX);
    Structures.def_csetf($sym32$KB_INTRSCT_ASSERTION_INDEX, $sym33$_CSETF_KB_INTRSCT_ASSERTION_INDEX);
    Structures.def_csetf($sym34$KB_INTRSCT_DEDUCTION_INDEX, $sym35$_CSETF_KB_INTRSCT_DEDUCTION_INDEX);
    Equality.identity($sym18$KB_INTERSECTION);
    access_macros.register_macro_helper($sym44$KB_INTERSECTION_CONSTANT_INDEX, $sym45$DO_KB_INTERSECTION_CONSTANTS);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_kb_difference$.getGlobalValue(), Symbols.symbol_function($sym71$KB_DIFFERENCE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym72$KB_DIFF_COMMON_INTERSECTION, $sym73$_CSETF_KB_DIFF_COMMON_INTERSECTION);
    Structures.def_csetf($sym74$KB_DIFF_RENAMED_CONSTANTS, $sym75$_CSETF_KB_DIFF_RENAMED_CONSTANTS);
    Structures.def_csetf($sym76$KB_DIFF_CONSTANTS, $sym77$_CSETF_KB_DIFF_CONSTANTS);
    Structures.def_csetf($sym78$KB_DIFF_NARTS, $sym79$_CSETF_KB_DIFF_NARTS);
    Structures.def_csetf($sym80$KB_DIFF_ASSERTIONS, $sym81$_CSETF_KB_DIFF_ASSERTIONS);
    Structures.def_csetf($sym82$KB_DIFF_DEDUCTIONS, $sym83$_CSETF_KB_DIFF_DEDUCTIONS);
    Equality.identity($sym64$KB_DIFFERENCE);
    access_macros.register_macro_helper($sym91$KB_DIFFERENCE_RENAMED_CONSTANTS, $sym92$DO_KB_DIFFERENCE_RENAMED_CONSTANTS);
    access_macros.register_macro_helper($sym93$KB_DIFFERENCE_CONSTANTS, $sym94$DO_KB_DIFFERENCE_CONSTANTS);
    access_macros.register_macro_helper($sym95$KB_DIFFERENCE_NARTS, $sym96$DO_KB_DIFFERENCE_NARTS);
    access_macros.register_macro_helper($sym97$KB_DIFFERENCE_ASSERTIONS, $sym98$DO_KB_DIFFERENCE_ASSERTIONS);
    access_macros.register_macro_helper($sym99$KB_DIFFERENCE_DEDUCTIONS, $sym100$DO_KB_DIFFERENCE_DEDUCTIONS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(T);
  public static final SubLList $list1 = list(makeSymbol("ASSERTION-ID-FROM-RECIPE"), makeSymbol("DEDUCTION-ID-FROM-RECIPE"), makeSymbol("CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID"), makeSymbol("CONSTANT-NAME-FROM-INTERNAL-ID"), makeSymbol("NART-ID-FROM-RECIPE"));
  public static final SubLList $list2 = list(makeSymbol("REMOTE-IMAGE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym3$WITH_NEW_REMOTE_IMAGE_CONNECTION = makeSymbol("WITH-NEW-REMOTE-IMAGE-CONNECTION");
  public static final SubLSymbol $sym4$CLET = makeSymbol("CLET");
  public static final SubLList $list5 = list(list(makeSymbol("*KB-COMPARE-COMMON-SYMBOLS*"), makeSymbol("*KB-COMPARE-COMMON-SYMBOLS*")));
  public static final SubLList $list6 = list(makeSymbol("SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS"));
  public static final SubLSymbol $sym7$WITH_CFASL_COMMON_SYMBOLS = makeSymbol("WITH-CFASL-COMMON-SYMBOLS");
  public static final SubLSymbol $sym8$_KB_COMPARE_COMMON_SYMBOLS_ = makeSymbol("*KB-COMPARE-COMMON-SYMBOLS*");
  public static final SubLSymbol $sym9$SET_KB_COMPARE_CONNECTION_COMMON_SYMBOLS = makeSymbol("SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS");
  public static final SubLSymbol $sym10$WITH_NEW_KB_COMPARE_CONNECTION = makeSymbol("WITH-NEW-KB-COMPARE-CONNECTION");
  public static final SubLSymbol $kw11$CFASL = makeKeyword("CFASL");
  public static final SubLSymbol $kw12$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym13$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $sym14$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym15$CFASL_SET_COMMON_SYMBOLS = makeSymbol("CFASL-SET-COMMON-SYMBOLS");
  public static final SubLSymbol $sym16$QUOTE = makeSymbol("QUOTE");
  public static final SubLList $list17 = list(list(makeSymbol("ERROR"), makeString("hack")));
  public static final SubLSymbol $sym18$KB_INTERSECTION = makeSymbol("KB-INTERSECTION");
  public static final SubLSymbol $sym19$KB_INTERSECTION_P = makeSymbol("KB-INTERSECTION-P");
  public static final SubLList $list20 = list(makeSymbol("REMOTE-IMAGE"), makeSymbol("CONSTANT-INDEX"), makeSymbol("NART-INDEX"), makeSymbol("ASSERTION-INDEX"), makeSymbol("DEDUCTION-INDEX"));
  public static final SubLList $list21 = list(makeKeyword("REMOTE-IMAGE"), makeKeyword("CONSTANT-INDEX"), makeKeyword("NART-INDEX"), makeKeyword("ASSERTION-INDEX"), makeKeyword("DEDUCTION-INDEX"));
  public static final SubLList $list22 = list(makeSymbol("KB-INTRSCT-REMOTE-IMAGE"), makeSymbol("KB-INTRSCT-CONSTANT-INDEX"), makeSymbol("KB-INTRSCT-NART-INDEX"), makeSymbol("KB-INTRSCT-ASSERTION-INDEX"), makeSymbol("KB-INTRSCT-DEDUCTION-INDEX"));
  public static final SubLList $list23 = list(makeSymbol("_CSETF-KB-INTRSCT-REMOTE-IMAGE"), makeSymbol("_CSETF-KB-INTRSCT-CONSTANT-INDEX"), makeSymbol("_CSETF-KB-INTRSCT-NART-INDEX"), makeSymbol("_CSETF-KB-INTRSCT-ASSERTION-INDEX"), makeSymbol("_CSETF-KB-INTRSCT-DEDUCTION-INDEX"));
  public static final SubLSymbol $sym24$PRINT_KB_INTERSECTION = makeSymbol("PRINT-KB-INTERSECTION");
  public static final SubLSymbol $sym25$KB_INTERSECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-INTERSECTION-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym26$KB_INTRSCT_REMOTE_IMAGE = makeSymbol("KB-INTRSCT-REMOTE-IMAGE");
  public static final SubLSymbol $sym27$_CSETF_KB_INTRSCT_REMOTE_IMAGE = makeSymbol("_CSETF-KB-INTRSCT-REMOTE-IMAGE");
  public static final SubLSymbol $sym28$KB_INTRSCT_CONSTANT_INDEX = makeSymbol("KB-INTRSCT-CONSTANT-INDEX");
  public static final SubLSymbol $sym29$_CSETF_KB_INTRSCT_CONSTANT_INDEX = makeSymbol("_CSETF-KB-INTRSCT-CONSTANT-INDEX");
  public static final SubLSymbol $sym30$KB_INTRSCT_NART_INDEX = makeSymbol("KB-INTRSCT-NART-INDEX");
  public static final SubLSymbol $sym31$_CSETF_KB_INTRSCT_NART_INDEX = makeSymbol("_CSETF-KB-INTRSCT-NART-INDEX");
  public static final SubLSymbol $sym32$KB_INTRSCT_ASSERTION_INDEX = makeSymbol("KB-INTRSCT-ASSERTION-INDEX");
  public static final SubLSymbol $sym33$_CSETF_KB_INTRSCT_ASSERTION_INDEX = makeSymbol("_CSETF-KB-INTRSCT-ASSERTION-INDEX");
  public static final SubLSymbol $sym34$KB_INTRSCT_DEDUCTION_INDEX = makeSymbol("KB-INTRSCT-DEDUCTION-INDEX");
  public static final SubLSymbol $sym35$_CSETF_KB_INTRSCT_DEDUCTION_INDEX = makeSymbol("_CSETF-KB-INTRSCT-DEDUCTION-INDEX");
  public static final SubLSymbol $kw36$REMOTE_IMAGE = makeKeyword("REMOTE-IMAGE");
  public static final SubLSymbol $kw37$CONSTANT_INDEX = makeKeyword("CONSTANT-INDEX");
  public static final SubLSymbol $kw38$NART_INDEX = makeKeyword("NART-INDEX");
  public static final SubLSymbol $kw39$ASSERTION_INDEX = makeKeyword("ASSERTION-INDEX");
  public static final SubLSymbol $kw40$DEDUCTION_INDEX = makeKeyword("DEDUCTION-INDEX");
  public static final SubLString $str41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str42$_KB_INTERSECTION_to__a_ = makeString("<KB-INTERSECTION to ~a>");
  public static final SubLSymbol $kw43$FREE = makeKeyword("FREE");
  public static final SubLSymbol $sym44$KB_INTERSECTION_CONSTANT_INDEX = makeSymbol("KB-INTERSECTION-CONSTANT-INDEX");
  public static final SubLSymbol $sym45$DO_KB_INTERSECTION_CONSTANTS = makeSymbol("DO-KB-INTERSECTION-CONSTANTS");
  public static final SubLSymbol $sym46$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLSymbol $sym47$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym48$NART_P = makeSymbol("NART-P");
  public static final SubLSymbol $sym49$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym50$DEDUCTION_P = makeSymbol("DEDUCTION-P");
  public static final SubLList $list51 = list(list(makeSymbol("CONSTANT"), makeSymbol("INTERSECTION"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list52 = list(makeKeyword("PROGRESS-MESSAGE"));
  public static final SubLSymbol $kw53$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw54$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLSymbol $sym55$INTERNAL_ID = makeUninternedSymbol("INTERNAL-ID");
  public static final SubLSymbol $sym56$REMOTE_ID = makeUninternedSymbol("REMOTE-ID");
  public static final SubLSymbol $sym57$DO_ID_INDEX = makeSymbol("DO-ID-INDEX");
  public static final SubLSymbol $sym58$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym59$FIND_CONSTANT_BY_INTERNAL_ID = makeSymbol("FIND-CONSTANT-BY-INTERNAL-ID");
  public static final SubLSymbol $kw60$IMPOSSIBLE = makeKeyword("IMPOSSIBLE");
  public static final SubLSymbol $sym61$KB_INTERSECTION_NART_IMPOSSIBLE_INT = makeSymbol("KB-INTERSECTION-NART-IMPOSSIBLE-INT");
  public static final SubLSymbol $sym62$KB_INTERSECTION_ASSERTION_IMPOSSIBLE_INT = makeSymbol("KB-INTERSECTION-ASSERTION-IMPOSSIBLE-INT");
  public static final SubLSymbol $sym63$KB_INTERSECTION_DEDUCTION_IMPOSSIBLE_INT = makeSymbol("KB-INTERSECTION-DEDUCTION-IMPOSSIBLE-INT");
  public static final SubLSymbol $sym64$KB_DIFFERENCE = makeSymbol("KB-DIFFERENCE");
  public static final SubLSymbol $sym65$KB_DIFFERENCE_P = makeSymbol("KB-DIFFERENCE-P");
  public static final SubLList $list66 = list(makeSymbol("COMMON-INTERSECTION"), makeSymbol("RENAMED-CONSTANTS"), makeSymbol("CONSTANTS"), makeSymbol("NARTS"), makeSymbol("ASSERTIONS"), makeSymbol("DEDUCTIONS"));
  public static final SubLList $list67 = list(makeKeyword("COMMON-INTERSECTION"), makeKeyword("RENAMED-CONSTANTS"), makeKeyword("CONSTANTS"), makeKeyword("NARTS"), makeKeyword("ASSERTIONS"), makeKeyword("DEDUCTIONS"));
  public static final SubLList $list68 = list(makeSymbol("KB-DIFF-COMMON-INTERSECTION"), makeSymbol("KB-DIFF-RENAMED-CONSTANTS"), makeSymbol("KB-DIFF-CONSTANTS"), makeSymbol("KB-DIFF-NARTS"), makeSymbol("KB-DIFF-ASSERTIONS"), makeSymbol("KB-DIFF-DEDUCTIONS"));
  public static final SubLList $list69 = list(makeSymbol("_CSETF-KB-DIFF-COMMON-INTERSECTION"), makeSymbol("_CSETF-KB-DIFF-RENAMED-CONSTANTS"), makeSymbol("_CSETF-KB-DIFF-CONSTANTS"), makeSymbol("_CSETF-KB-DIFF-NARTS"), makeSymbol("_CSETF-KB-DIFF-ASSERTIONS"), makeSymbol("_CSETF-KB-DIFF-DEDUCTIONS"));
  public static final SubLSymbol $sym70$PRINT_KB_DIFFERENCE = makeSymbol("PRINT-KB-DIFFERENCE");
  public static final SubLSymbol $sym71$KB_DIFFERENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-DIFFERENCE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym72$KB_DIFF_COMMON_INTERSECTION = makeSymbol("KB-DIFF-COMMON-INTERSECTION");
  public static final SubLSymbol $sym73$_CSETF_KB_DIFF_COMMON_INTERSECTION = makeSymbol("_CSETF-KB-DIFF-COMMON-INTERSECTION");
  public static final SubLSymbol $sym74$KB_DIFF_RENAMED_CONSTANTS = makeSymbol("KB-DIFF-RENAMED-CONSTANTS");
  public static final SubLSymbol $sym75$_CSETF_KB_DIFF_RENAMED_CONSTANTS = makeSymbol("_CSETF-KB-DIFF-RENAMED-CONSTANTS");
  public static final SubLSymbol $sym76$KB_DIFF_CONSTANTS = makeSymbol("KB-DIFF-CONSTANTS");
  public static final SubLSymbol $sym77$_CSETF_KB_DIFF_CONSTANTS = makeSymbol("_CSETF-KB-DIFF-CONSTANTS");
  public static final SubLSymbol $sym78$KB_DIFF_NARTS = makeSymbol("KB-DIFF-NARTS");
  public static final SubLSymbol $sym79$_CSETF_KB_DIFF_NARTS = makeSymbol("_CSETF-KB-DIFF-NARTS");
  public static final SubLSymbol $sym80$KB_DIFF_ASSERTIONS = makeSymbol("KB-DIFF-ASSERTIONS");
  public static final SubLSymbol $sym81$_CSETF_KB_DIFF_ASSERTIONS = makeSymbol("_CSETF-KB-DIFF-ASSERTIONS");
  public static final SubLSymbol $sym82$KB_DIFF_DEDUCTIONS = makeSymbol("KB-DIFF-DEDUCTIONS");
  public static final SubLSymbol $sym83$_CSETF_KB_DIFF_DEDUCTIONS = makeSymbol("_CSETF-KB-DIFF-DEDUCTIONS");
  public static final SubLSymbol $kw84$COMMON_INTERSECTION = makeKeyword("COMMON-INTERSECTION");
  public static final SubLSymbol $kw85$RENAMED_CONSTANTS = makeKeyword("RENAMED-CONSTANTS");
  public static final SubLSymbol $kw86$CONSTANTS = makeKeyword("CONSTANTS");
  public static final SubLSymbol $kw87$NARTS = makeKeyword("NARTS");
  public static final SubLSymbol $kw88$ASSERTIONS = makeKeyword("ASSERTIONS");
  public static final SubLSymbol $kw89$DEDUCTIONS = makeKeyword("DEDUCTIONS");
  public static final SubLString $str90$_KB_DIFFERENCE_using__a_ = makeString("<KB-DIFFERENCE using ~a>");
  public static final SubLSymbol $sym91$KB_DIFFERENCE_RENAMED_CONSTANTS = makeSymbol("KB-DIFFERENCE-RENAMED-CONSTANTS");
  public static final SubLSymbol $sym92$DO_KB_DIFFERENCE_RENAMED_CONSTANTS = makeSymbol("DO-KB-DIFFERENCE-RENAMED-CONSTANTS");
  public static final SubLSymbol $sym93$KB_DIFFERENCE_CONSTANTS = makeSymbol("KB-DIFFERENCE-CONSTANTS");
  public static final SubLSymbol $sym94$DO_KB_DIFFERENCE_CONSTANTS = makeSymbol("DO-KB-DIFFERENCE-CONSTANTS");
  public static final SubLSymbol $sym95$KB_DIFFERENCE_NARTS = makeSymbol("KB-DIFFERENCE-NARTS");
  public static final SubLSymbol $sym96$DO_KB_DIFFERENCE_NARTS = makeSymbol("DO-KB-DIFFERENCE-NARTS");
  public static final SubLSymbol $sym97$KB_DIFFERENCE_ASSERTIONS = makeSymbol("KB-DIFFERENCE-ASSERTIONS");
  public static final SubLSymbol $sym98$DO_KB_DIFFERENCE_ASSERTIONS = makeSymbol("DO-KB-DIFFERENCE-ASSERTIONS");
  public static final SubLSymbol $sym99$KB_DIFFERENCE_DEDUCTIONS = makeSymbol("KB-DIFFERENCE-DEDUCTIONS");
  public static final SubLSymbol $sym100$DO_KB_DIFFERENCE_DEDUCTIONS = makeSymbol("DO-KB-DIFFERENCE-DEDUCTIONS");
  public static final SubLList $list101 = list(list(makeSymbol("CONSTANT"), makeSymbol("REMOTE-NAME"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list102 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw103$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym104$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLList $list105 = list(list(makeSymbol("CONSTANT"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym106$DO_SET = makeSymbol("DO-SET");
  public static final SubLList $list107 = list(list(makeSymbol("NART"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list108 = list(list(makeSymbol("ASSERTION"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list109 = list(list(makeSymbol("DEDUCTION"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym110$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym111$_ = makeSymbol("<");
  public static final SubLSymbol $sym112$CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");
  public static final SubLSymbol $sym113$NART_ID = makeSymbol("NART-ID");
  public static final SubLSymbol $sym114$ASSERTION_ID = makeSymbol("ASSERTION-ID");
  public static final SubLSymbol $sym115$DEDUCTION_ID = makeSymbol("DEDUCTION-ID");
  public static final SubLString $str116$KB_Intersection___Examining_new_c = makeString("KB Intersection : Examining new constants");
  public static final SubLString $str117$KB_Intersection___Examining_const = makeString("KB Intersection : Examining constants");
  public static final SubLSymbol $kw118$SKIP = makeKeyword("SKIP");
  public static final SubLString $str119$KB_Intersection___Examining_old_c = makeString("KB Intersection : Examining old constants (congruent)");
  public static final SubLString $str120$KB_Intersection___Examining_new_n = makeString("KB Intersection : Examining new narts");
  public static final SubLString $str121$KB_Intersection___Examining_narts = makeString("KB Intersection : Examining narts");
  public static final SubLString $str122$KB_Intersection___Examining_old_n = makeString("KB Intersection : Examining old narts (congruent)");
  public static final SubLString $str123$KB_Intersection___Examining_new_a = makeString("KB Intersection : Examining new assertions");
  public static final SubLString $str124$KB_Intersection___Examining_asser = makeString("KB Intersection : Examining assertions");
  public static final SubLString $str125$KB_Intersection___Examining_old_a = makeString("KB Intersection : Examining old assertions (congruent)");
  public static final SubLString $str126$KB_Intersection___Examining_new_d = makeString("KB Intersection : Examining new deductions");
  public static final SubLString $str127$KB_Intersection___Examining_deduc = makeString("KB Intersection : Examining deductions");
  public static final SubLString $str128$KB_Intersection___Examining_old_d = makeString("KB Intersection : Examining old deductions (congruent)");
  public static final SubLString $str129$KB_DIFFERENCE___Examining_constan = makeString("KB-DIFFERENCE : Examining constant renames");
  public static final SubLString $str130$KB_DIFFERENCE___Examining_constan = makeString("KB-DIFFERENCE : Examining constants");
  public static final SubLString $str131$KB_DIFFERENCE___Examining_narts = makeString("KB-DIFFERENCE : Examining narts");
  public static final SubLString $str132$KB_DIFFERENCE___Examining_asserti = makeString("KB-DIFFERENCE : Examining assertions");
  public static final SubLString $str133$KB_DIFFERENCE___Examining_deducti = makeString("KB-DIFFERENCE : Examining deductions");
  public static final SubLString $str134$___No_Difference___ = makeString(";; No Difference!~%");
  public static final SubLString $str135$___Renamed_Constants____ = makeString(";; Renamed Constants :~%");
  public static final SubLString $str136$_S_renamed_to__S__ = makeString("~S renamed to ~S~%");
  public static final SubLString $str137$___Constants____ = makeString(";; Constants :~%");
  public static final SubLString $str138$_S__ = makeString("~S~%");
  public static final SubLString $str139$___Narts____ = makeString(";; Narts :~%");
  public static final SubLString $str140$___Assertions____ = makeString(";; Assertions :~%");
  public static final SubLString $str141$___Deductions____ = makeString(";; Deductions :~%");
  public static final SubLString $str142$_S__supports___ = makeString("~S~%supports:~%");
  public static final SubLSymbol $sym143$_ = makeSymbol("=");
  public static final SubLList $list144 = list(list(makeSymbol("OLD-CONSTANT-COUNT")));
  public static final SubLList $list145 = list(makeSymbol("MISSING-OLD-CONSTANT-INTERNAL-IDS"));
  public static final SubLSymbol $sym146$CONSTANT_INTERNAL_ID_FROM_EXTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID");
  public static final SubLSymbol $sym147$CONSTANT_NAME_FROM_INTERNAL_ID = makeSymbol("CONSTANT-NAME-FROM-INTERNAL-ID");
  public static final SubLList $list148 = list(list(makeSymbol("OLD-NART-COUNT")));
  public static final SubLList $list149 = list(makeSymbol("MISSING-OLD-NART-IDS"));
  public static final SubLSymbol $sym150$NART_ID_FROM_RECIPE = makeSymbol("NART-ID-FROM-RECIPE");
  public static final SubLList $list151 = list(list(makeSymbol("OLD-ASSERTION-COUNT")));
  public static final SubLList $list152 = list(makeSymbol("MISSING-OLD-ASSERTION-IDS"));
  public static final SubLSymbol $sym153$ASSERTION_ID_FROM_RECIPE = makeSymbol("ASSERTION-ID-FROM-RECIPE");
  public static final SubLList $list154 = list(list(makeSymbol("OLD-DEDUCTION-COUNT")));
  public static final SubLList $list155 = list(makeSymbol("MISSING-OLD-DEDUCTION-IDS"));
  public static final SubLSymbol $sym156$DEDUCTION_ID_FROM_RECIPE = makeSymbol("DEDUCTION-ID-FROM-RECIPE");

  //// Initializers

  public void declareFunctions() {
    declare_kb_compare_file();
  }

  public void initializeVariables() {
    init_kb_compare_file();
  }

  public void runTopLevelForms() {
    setup_kb_compare_file();
  }

}
