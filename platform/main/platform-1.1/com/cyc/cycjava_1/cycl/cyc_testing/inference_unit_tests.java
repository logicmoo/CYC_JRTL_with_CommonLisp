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

package  com.cyc.cycjava_1.cycl.cyc_testing;

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
import com.cyc.cycjava_1.cycl.api_control_vars;
import com.cyc.cycjava_1.cycl.bindings;
import com.cyc.cycjava_1.cycl.cfasl;
import com.cyc.cycjava_1.cycl.cfasl_utilities;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing;
import com.cyc.cycjava_1.cycl.el_grammar;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.id_index;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.misc_utilities;
import com.cyc.cycjava_1.cycl.numeric_date_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class inference_unit_tests extends SubLTranslatedFile {

  //// Constructor

  private inference_unit_tests() {}
  public static final SubLFile me = new inference_unit_tests();
  public static final String myName = "com.cyc.cycjava_1.cycl.cyc_testing.inference_unit_tests";

  //// Definitions

  @SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 1061) 
  private static SubLSymbol $within_inference_unit_testP$ = null;

  /** Accumulates a list of assertions created by side effect during the execution
of an inference unit test, so they can be optionally cleaned up later. */
  @SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 1243) 
  private static SubLSymbol $inference_unit_test_assertions_created$ = null;

  public static final class $inference_unit_test_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $name; }
    public SubLObject getField3() { return $comment; }
    public SubLObject getField4() { return $sentence; }
    public SubLObject getField5() { return $properties; }
    public SubLObject getField6() { return $result; }
    public SubLObject getField7() { return $halt_reason; }
    public SubLObject getField8() { return $result_test; }
    public SubLObject getField9() { return $followups; }
    public SubLObject getField10() { return $bindings; }
    public SubLObject getField11() { return $kb; }
    public SubLObject getField12() { return $owner; }
    public SubLObject getField13() { return $bug_number; }
    public SubLObject getField14() { return $creation_date; }
    public SubLObject getField15() { return $creator; }
    public SubLObject getField16() { return $workingP; }
    public SubLObject setField2(SubLObject value) { return $name = value; }
    public SubLObject setField3(SubLObject value) { return $comment = value; }
    public SubLObject setField4(SubLObject value) { return $sentence = value; }
    public SubLObject setField5(SubLObject value) { return $properties = value; }
    public SubLObject setField6(SubLObject value) { return $result = value; }
    public SubLObject setField7(SubLObject value) { return $halt_reason = value; }
    public SubLObject setField8(SubLObject value) { return $result_test = value; }
    public SubLObject setField9(SubLObject value) { return $followups = value; }
    public SubLObject setField10(SubLObject value) { return $bindings = value; }
    public SubLObject setField11(SubLObject value) { return $kb = value; }
    public SubLObject setField12(SubLObject value) { return $owner = value; }
    public SubLObject setField13(SubLObject value) { return $bug_number = value; }
    public SubLObject setField14(SubLObject value) { return $creation_date = value; }
    public SubLObject setField15(SubLObject value) { return $creator = value; }
    public SubLObject setField16(SubLObject value) { return $workingP = value; }
    public SubLObject $name = NIL;
    public SubLObject $comment = NIL;
    public SubLObject $sentence = NIL;
    public SubLObject $properties = NIL;
    public SubLObject $result = NIL;
    public SubLObject $halt_reason = NIL;
    public SubLObject $result_test = NIL;
    public SubLObject $followups = NIL;
    public SubLObject $bindings = NIL;
    public SubLObject $kb = NIL;
    public SubLObject $owner = NIL;
    public SubLObject $bug_number = NIL;
    public SubLObject $creation_date = NIL;
    public SubLObject $creator = NIL;
    public SubLObject $workingP = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($inference_unit_test_native.class, $sym1$INFERENCE_UNIT_TEST, $sym2$INFERENCE_UNIT_TEST_P, $list3, $list4, new String[] {"$name", "$comment", "$sentence", "$properties", "$result", "$halt_reason", "$result_test", "$followups", "$bindings", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP"}, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2264) 
  public static SubLSymbol $dtp_inference_unit_test$ = null;

  @SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 2264) 
  public static final SubLObject inference_unit_test_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $inference_unit_test_p$UnaryFunction extends UnaryFunction {
    public $inference_unit_test_p$UnaryFunction() { super(extractFunctionNamed("INFERENCE-UNIT-TEST-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32335"); }
  }

  @SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 8986) 
  private static SubLSymbol $cfasl_wide_opcode_inference_unit_test$ = null;

  @SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 10398) 
  private static SubLSymbol $inference_unit_test_names_in_order$ = null;

  @SubL(source = "cycl/cyc-testing/inference-unit-tests.lisp", position = 10503) 
  private static SubLSymbol $inference_unit_tests_by_name$ = null;

  public static final SubLObject declare_inference_unit_tests_file() {
    declareFunction(myName, "within_inference_unit_testP", "WITHIN-INFERENCE-UNIT-TEST?", 0, 0, false);
    declareFunction(myName, "note_assertion_for_inference_unit_test", "NOTE-ASSERTION-FOR-INFERENCE-UNIT-TEST", 1, 0, false);
    declareFunction(myName, "inference_unit_test_cleanup", "INFERENCE-UNIT-TEST-CLEANUP", 0, 0, false);
    declareFunction(myName, "inference_unit_test_print_function_trampoline", "INFERENCE-UNIT-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "inference_unit_test_p", "INFERENCE-UNIT-TEST-P", 1, 0, false); new $inference_unit_test_p$UnaryFunction();
    declareFunction(myName, "iut_name", "IUT-NAME", 1, 0, false);
    declareFunction(myName, "iut_comment", "IUT-COMMENT", 1, 0, false);
    declareFunction(myName, "iut_sentence", "IUT-SENTENCE", 1, 0, false);
    declareFunction(myName, "iut_properties", "IUT-PROPERTIES", 1, 0, false);
    declareFunction(myName, "iut_result", "IUT-RESULT", 1, 0, false);
    declareFunction(myName, "iut_halt_reason", "IUT-HALT-REASON", 1, 0, false);
    declareFunction(myName, "iut_result_test", "IUT-RESULT-TEST", 1, 0, false);
    declareFunction(myName, "iut_followups", "IUT-FOLLOWUPS", 1, 0, false);
    declareFunction(myName, "iut_bindings", "IUT-BINDINGS", 1, 0, false);
    declareFunction(myName, "iut_kb", "IUT-KB", 1, 0, false);
    declareFunction(myName, "iut_owner", "IUT-OWNER", 1, 0, false);
    declareFunction(myName, "iut_bug_number", "IUT-BUG-NUMBER", 1, 0, false);
    declareFunction(myName, "iut_creation_date", "IUT-CREATION-DATE", 1, 0, false);
    declareFunction(myName, "iut_creator", "IUT-CREATOR", 1, 0, false);
    declareFunction(myName, "iut_workingP", "IUT-WORKING?", 1, 0, false);
    declareFunction(myName, "_csetf_iut_name", "_CSETF-IUT-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_iut_comment", "_CSETF-IUT-COMMENT", 2, 0, false);
    declareFunction(myName, "_csetf_iut_sentence", "_CSETF-IUT-SENTENCE", 2, 0, false);
    declareFunction(myName, "_csetf_iut_properties", "_CSETF-IUT-PROPERTIES", 2, 0, false);
    declareFunction(myName, "_csetf_iut_result", "_CSETF-IUT-RESULT", 2, 0, false);
    declareFunction(myName, "_csetf_iut_halt_reason", "_CSETF-IUT-HALT-REASON", 2, 0, false);
    declareFunction(myName, "_csetf_iut_result_test", "_CSETF-IUT-RESULT-TEST", 2, 0, false);
    declareFunction(myName, "_csetf_iut_followups", "_CSETF-IUT-FOLLOWUPS", 2, 0, false);
    declareFunction(myName, "_csetf_iut_bindings", "_CSETF-IUT-BINDINGS", 2, 0, false);
    declareFunction(myName, "_csetf_iut_kb", "_CSETF-IUT-KB", 2, 0, false);
    declareFunction(myName, "_csetf_iut_owner", "_CSETF-IUT-OWNER", 2, 0, false);
    declareFunction(myName, "_csetf_iut_bug_number", "_CSETF-IUT-BUG-NUMBER", 2, 0, false);
    declareFunction(myName, "_csetf_iut_creation_date", "_CSETF-IUT-CREATION-DATE", 2, 0, false);
    declareFunction(myName, "_csetf_iut_creator", "_CSETF-IUT-CREATOR", 2, 0, false);
    declareFunction(myName, "_csetf_iut_workingP", "_CSETF-IUT-WORKING?", 2, 0, false);
    declareFunction(myName, "make_inference_unit_test", "MAKE-INFERENCE-UNIT-TEST", 0, 1, false);
    declareFunction(myName, "inference_unit_test_name", "INFERENCE-UNIT-TEST-NAME", 1, 0, false);
    declareFunction(myName, "inference_unit_test_comment", "INFERENCE-UNIT-TEST-COMMENT", 1, 0, false);
    declareFunction(myName, "inference_unit_test_sentence", "INFERENCE-UNIT-TEST-SENTENCE", 1, 0, false);
    declareFunction(myName, "inference_unit_test_properties", "INFERENCE-UNIT-TEST-PROPERTIES", 1, 0, false);
    declareFunction(myName, "inference_unit_test_expected_result", "INFERENCE-UNIT-TEST-EXPECTED-RESULT", 1, 0, false);
    declareFunction(myName, "inference_unit_test_expected_halt_reason", "INFERENCE-UNIT-TEST-EXPECTED-HALT-REASON", 1, 0, false);
    declareFunction(myName, "inference_unit_test_result_test", "INFERENCE-UNIT-TEST-RESULT-TEST", 1, 0, false);
    declareFunction(myName, "inference_unit_test_followups", "INFERENCE-UNIT-TEST-FOLLOWUPS", 1, 0, false);
    declareFunction(myName, "inference_unit_test_bindings", "INFERENCE-UNIT-TEST-BINDINGS", 1, 0, false);
    declareFunction(myName, "inference_unit_test_kb", "INFERENCE-UNIT-TEST-KB", 1, 0, false);
    declareFunction(myName, "inference_unit_test_owner", "INFERENCE-UNIT-TEST-OWNER", 1, 0, false);
    declareFunction(myName, "inference_unit_test_bug_number", "INFERENCE-UNIT-TEST-BUG-NUMBER", 1, 0, false);
    declareFunction(myName, "inference_unit_test_creation_date", "INFERENCE-UNIT-TEST-CREATION-DATE", 1, 0, false);
    declareFunction(myName, "inference_unit_test_creator", "INFERENCE-UNIT-TEST-CREATOR", 1, 0, false);
    declareFunction(myName, "inference_unit_test_workingP", "INFERENCE-UNIT-TEST-WORKING?", 1, 0, false);
    declareFunction(myName, "inference_unit_test_mentions_invalid_constantP", "INFERENCE-UNIT-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
    declareFunction(myName, "inference_unit_test_recipe", "INFERENCE-UNIT-TEST-RECIPE", 1, 0, false);
    declareFunction(myName, "inference_unit_result_test_recipe", "INFERENCE-UNIT-RESULT-TEST-RECIPE", 1, 0, false);
    declareFunction(myName, "new_inference_unit_test_from_recipe", "NEW-INFERENCE-UNIT-TEST-FROM-RECIPE", 1, 0, false);
    declareFunction(myName, "cfasl_output_object_inference_unit_test_method", "CFASL-OUTPUT-OBJECT-INFERENCE-UNIT-TEST-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_output_inference_unit_test", "CFASL-OUTPUT-INFERENCE-UNIT-TEST", 2, 0, false);
    declareFunction(myName, "cfasl_output_inference_unit_test_internal", "CFASL-OUTPUT-INFERENCE-UNIT-TEST-INTERNAL", 2, 0, false);
    declareFunction(myName, "cfasl_input_inference_unit_test", "CFASL-INPUT-INFERENCE-UNIT-TEST", 1, 0, false);
    declareFunction(myName, "test_inference_unit_test_serialization", "TEST-INFERENCE-UNIT-TEST-SERIALIZATION", 1, 0, false);
    declareFunction(myName, "find_inference_unit_test_by_name", "FIND-INFERENCE-UNIT-TEST-BY-NAME", 1, 0, false);
    declareFunction(myName, "store_inference_unit_test", "STORE-INFERENCE-UNIT-TEST", 1, 0, false);
    declareMacro(myName, "do_inference_unit_tests", "DO-INFERENCE-UNIT-TESTS");
    declareFunction(myName, "all_inference_unit_test_names", "ALL-INFERENCE-UNIT-TEST-NAMES", 0, 0, false);
    declareFunction(myName, "inference_unit_test_followup_p", "INFERENCE-UNIT-TEST-FOLLOWUP-P", 1, 0, false);
    declareMacro(myName, "define_inference_unit_test", "DEFINE-INFERENCE-UNIT-TEST");
    declareFunction(myName, "undefine_inference_unit_test", "UNDEFINE-INFERENCE-UNIT-TEST", 1, 0, false);
    declareFunction(myName, "undefine_all_inference_unit_tests", "UNDEFINE-ALL-INFERENCE-UNIT-TESTS", 0, 0, false);
    declareFunction(myName, "define_inference_unit_test_internal", "DEFINE-INFERENCE-UNIT-TEST-INTERNAL", 15, 0, false);
    declareFunction(myName, "canonicalize_inference_unit_test_followups", "CANONICALIZE-INFERENCE-UNIT-TEST-FOLLOWUPS", 1, 0, false);
    declareFunction(myName, "run_all_inference_unit_tests", "RUN-ALL-INFERENCE-UNIT-TESTS", 0, 6, false);
    declareFunction(myName, "run_inference_unit_tests", "RUN-INFERENCE-UNIT-TESTS", 0, 7, false);
    declareFunction(myName, "run_inference_unit_test", "RUN-INFERENCE-UNIT-TEST", 1, 6, false);
    declareFunction(myName, "run_inference_unit_test_int", "RUN-INFERENCE-UNIT-TEST-INT", 7, 0, false);
    declareFunction(myName, "run_inference_unit_testP", "RUN-INFERENCE-UNIT-TEST?", 2, 0, false);
    declareFunction(myName, "run_inference_unit_test_followup_query", "RUN-INFERENCE-UNIT-TEST-FOLLOWUP-QUERY", 13, 0, false);
    declareFunction(myName, "followup_substitute_hypothetical_bindings", "FOLLOWUP-SUBSTITUTE-HYPOTHETICAL-BINDINGS", 2, 0, false);
    declareFunction(myName, "run_inference_unit_test_query", "RUN-INFERENCE-UNIT-TEST-QUERY", 12, 0, false);
    declareFunction(myName, "boolean_to_test_result", "BOOLEAN-TO-TEST-RESULT", 1, 0, false);
    declareFunction(myName, "halt_reason_matches_specP", "HALT-REASON-MATCHES-SPEC?", 2, 0, false);
    declareFunction(myName, "iut_result_test_passesP", "IUT-RESULT-TEST-PASSES?", 3, 0, false);
    declareFunction(myName, "print_inference_unit_test_preamble", "PRINT-INFERENCE-UNIT-TEST-PREAMBLE", 4, 0, false);
    declareFunction(myName, "print_inference_unit_test_postamble", "PRINT-INFERENCE-UNIT-TEST-POSTAMBLE", 5, 0, false);
    declareFunction(myName, "print_inference_unit_test_failure", "PRINT-INFERENCE-UNIT-TEST-FAILURE", 9, 0, false);
    declareFunction(myName, "previous_query_inference", "PREVIOUS-QUERY-INFERENCE", 0, 0, false);
    declareFunction(myName, "previous_query_root_problem_and_strategy", "PREVIOUS-QUERY-ROOT-PROBLEM-AND-STRATEGY", 0, 0, false);
    declareFunction(myName, "previous_query_root_problem", "PREVIOUS-QUERY-ROOT-PROBLEM", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_unit_tests_file() {
    $within_inference_unit_testP$ = defparameter("*WITHIN-INFERENCE-UNIT-TEST?*", NIL);
    $inference_unit_test_assertions_created$ = defparameter("*INFERENCE-UNIT-TEST-ASSERTIONS-CREATED*", $kw0$UNINITIALIZED);
    $dtp_inference_unit_test$ = defconstant("*DTP-INFERENCE-UNIT-TEST*", $sym1$INFERENCE_UNIT_TEST);
    $cfasl_wide_opcode_inference_unit_test$ = defconstant("*CFASL-WIDE-OPCODE-INFERENCE-UNIT-TEST*", $int58$513);
    $inference_unit_test_names_in_order$ = deflexical("*INFERENCE-UNIT-TEST-NAMES-IN-ORDER*", ((NIL != Symbols.boundp($sym62$_INFERENCE_UNIT_TEST_NAMES_IN_ORDER_)) ? ((SubLObject) $inference_unit_test_names_in_order$.getGlobalValue()) : NIL));
    $inference_unit_tests_by_name$ = deflexical("*INFERENCE-UNIT-TESTS-BY-NAME*", ((NIL != Symbols.boundp($sym63$_INFERENCE_UNIT_TESTS_BY_NAME_)) ? ((SubLObject) $inference_unit_tests_by_name$.getGlobalValue()) : Hashtables.make_hash_table($int64$212, Symbols.symbol_function(EQ), UNPROVIDED)));
    return NIL;
  }

  public static final SubLObject setup_inference_unit_tests_file() {
    // CVS_ID("Id: inference-unit-tests.lisp 128656 2009-08-31 17:37:30Z pace ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_inference_unit_test$.getGlobalValue(), Symbols.symbol_function($sym8$INFERENCE_UNIT_TEST_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$IUT_NAME, $sym10$_CSETF_IUT_NAME);
    Structures.def_csetf($sym11$IUT_COMMENT, $sym12$_CSETF_IUT_COMMENT);
    Structures.def_csetf($sym13$IUT_SENTENCE, $sym14$_CSETF_IUT_SENTENCE);
    Structures.def_csetf($sym15$IUT_PROPERTIES, $sym16$_CSETF_IUT_PROPERTIES);
    Structures.def_csetf($sym17$IUT_RESULT, $sym18$_CSETF_IUT_RESULT);
    Structures.def_csetf($sym19$IUT_HALT_REASON, $sym20$_CSETF_IUT_HALT_REASON);
    Structures.def_csetf($sym21$IUT_RESULT_TEST, $sym22$_CSETF_IUT_RESULT_TEST);
    Structures.def_csetf($sym23$IUT_FOLLOWUPS, $sym24$_CSETF_IUT_FOLLOWUPS);
    Structures.def_csetf($sym25$IUT_BINDINGS, $sym26$_CSETF_IUT_BINDINGS);
    Structures.def_csetf($sym27$IUT_KB, $sym28$_CSETF_IUT_KB);
    Structures.def_csetf($sym29$IUT_OWNER, $sym30$_CSETF_IUT_OWNER);
    Structures.def_csetf($sym31$IUT_BUG_NUMBER, $sym32$_CSETF_IUT_BUG_NUMBER);
    Structures.def_csetf($sym33$IUT_CREATION_DATE, $sym34$_CSETF_IUT_CREATION_DATE);
    Structures.def_csetf($sym35$IUT_CREATOR, $sym36$_CSETF_IUT_CREATOR);
    Structures.def_csetf($sym37$IUT_WORKING_, $sym38$_CSETF_IUT_WORKING_);
    Equality.identity($sym1$INFERENCE_UNIT_TEST);
    cfasl.register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_inference_unit_test$.getGlobalValue(), $sym59$CFASL_INPUT_INFERENCE_UNIT_TEST);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_inference_unit_test$.getGlobalValue(), Symbols.symbol_function($sym60$CFASL_OUTPUT_OBJECT_INFERENCE_UNIT_TEST_METHOD));
    subl_macro_promotions.declare_defglobal($sym62$_INFERENCE_UNIT_TEST_NAMES_IN_ORDER_);
    subl_macro_promotions.declare_defglobal($sym63$_INFERENCE_UNIT_TESTS_BY_NAME_);
    meta_macros.declare_indention_pattern($sym86$DEFINE_INFERENCE_UNIT_TEST, $list87);
    access_macros.register_macro_helper($sym84$DEFINE_INFERENCE_UNIT_TEST_INTERNAL, $sym86$DEFINE_INFERENCE_UNIT_TEST);
    access_macros.register_macro_helper($sym85$CANONICALIZE_INFERENCE_UNIT_TEST_FOLLOWUPS, $sym86$DEFINE_INFERENCE_UNIT_TEST);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $sym1$INFERENCE_UNIT_TEST = makeSymbol("INFERENCE-UNIT-TEST");
  public static final SubLSymbol $sym2$INFERENCE_UNIT_TEST_P = makeSymbol("INFERENCE-UNIT-TEST-P");
  public static final SubLList $list3 = list(new SubLObject[] {makeSymbol("NAME"), makeSymbol("COMMENT"), makeSymbol("SENTENCE"), makeSymbol("PROPERTIES"), makeSymbol("RESULT"), makeSymbol("HALT-REASON"), makeSymbol("RESULT-TEST"), makeSymbol("FOLLOWUPS"), makeSymbol("BINDINGS"), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("BUG-NUMBER"), makeSymbol("CREATION-DATE"), makeSymbol("CREATOR"), makeSymbol("WORKING?")});
  public static final SubLList $list4 = list(new SubLObject[] {makeKeyword("NAME"), makeKeyword("COMMENT"), makeKeyword("SENTENCE"), makeKeyword("PROPERTIES"), makeKeyword("RESULT"), makeKeyword("HALT-REASON"), makeKeyword("RESULT-TEST"), makeKeyword("FOLLOWUPS"), makeKeyword("BINDINGS"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("IUT-NAME"), makeSymbol("IUT-COMMENT"), makeSymbol("IUT-SENTENCE"), makeSymbol("IUT-PROPERTIES"), makeSymbol("IUT-RESULT"), makeSymbol("IUT-HALT-REASON"), makeSymbol("IUT-RESULT-TEST"), makeSymbol("IUT-FOLLOWUPS"), makeSymbol("IUT-BINDINGS"), makeSymbol("IUT-KB"), makeSymbol("IUT-OWNER"), makeSymbol("IUT-BUG-NUMBER"), makeSymbol("IUT-CREATION-DATE"), makeSymbol("IUT-CREATOR"), makeSymbol("IUT-WORKING?")});
  public static final SubLList $list6 = list(new SubLObject[] {makeSymbol("_CSETF-IUT-NAME"), makeSymbol("_CSETF-IUT-COMMENT"), makeSymbol("_CSETF-IUT-SENTENCE"), makeSymbol("_CSETF-IUT-PROPERTIES"), makeSymbol("_CSETF-IUT-RESULT"), makeSymbol("_CSETF-IUT-HALT-REASON"), makeSymbol("_CSETF-IUT-RESULT-TEST"), makeSymbol("_CSETF-IUT-FOLLOWUPS"), makeSymbol("_CSETF-IUT-BINDINGS"), makeSymbol("_CSETF-IUT-KB"), makeSymbol("_CSETF-IUT-OWNER"), makeSymbol("_CSETF-IUT-BUG-NUMBER"), makeSymbol("_CSETF-IUT-CREATION-DATE"), makeSymbol("_CSETF-IUT-CREATOR"), makeSymbol("_CSETF-IUT-WORKING?")});
  public static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym8$INFERENCE_UNIT_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("INFERENCE-UNIT-TEST-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$IUT_NAME = makeSymbol("IUT-NAME");
  public static final SubLSymbol $sym10$_CSETF_IUT_NAME = makeSymbol("_CSETF-IUT-NAME");
  public static final SubLSymbol $sym11$IUT_COMMENT = makeSymbol("IUT-COMMENT");
  public static final SubLSymbol $sym12$_CSETF_IUT_COMMENT = makeSymbol("_CSETF-IUT-COMMENT");
  public static final SubLSymbol $sym13$IUT_SENTENCE = makeSymbol("IUT-SENTENCE");
  public static final SubLSymbol $sym14$_CSETF_IUT_SENTENCE = makeSymbol("_CSETF-IUT-SENTENCE");
  public static final SubLSymbol $sym15$IUT_PROPERTIES = makeSymbol("IUT-PROPERTIES");
  public static final SubLSymbol $sym16$_CSETF_IUT_PROPERTIES = makeSymbol("_CSETF-IUT-PROPERTIES");
  public static final SubLSymbol $sym17$IUT_RESULT = makeSymbol("IUT-RESULT");
  public static final SubLSymbol $sym18$_CSETF_IUT_RESULT = makeSymbol("_CSETF-IUT-RESULT");
  public static final SubLSymbol $sym19$IUT_HALT_REASON = makeSymbol("IUT-HALT-REASON");
  public static final SubLSymbol $sym20$_CSETF_IUT_HALT_REASON = makeSymbol("_CSETF-IUT-HALT-REASON");
  public static final SubLSymbol $sym21$IUT_RESULT_TEST = makeSymbol("IUT-RESULT-TEST");
  public static final SubLSymbol $sym22$_CSETF_IUT_RESULT_TEST = makeSymbol("_CSETF-IUT-RESULT-TEST");
  public static final SubLSymbol $sym23$IUT_FOLLOWUPS = makeSymbol("IUT-FOLLOWUPS");
  public static final SubLSymbol $sym24$_CSETF_IUT_FOLLOWUPS = makeSymbol("_CSETF-IUT-FOLLOWUPS");
  public static final SubLSymbol $sym25$IUT_BINDINGS = makeSymbol("IUT-BINDINGS");
  public static final SubLSymbol $sym26$_CSETF_IUT_BINDINGS = makeSymbol("_CSETF-IUT-BINDINGS");
  public static final SubLSymbol $sym27$IUT_KB = makeSymbol("IUT-KB");
  public static final SubLSymbol $sym28$_CSETF_IUT_KB = makeSymbol("_CSETF-IUT-KB");
  public static final SubLSymbol $sym29$IUT_OWNER = makeSymbol("IUT-OWNER");
  public static final SubLSymbol $sym30$_CSETF_IUT_OWNER = makeSymbol("_CSETF-IUT-OWNER");
  public static final SubLSymbol $sym31$IUT_BUG_NUMBER = makeSymbol("IUT-BUG-NUMBER");
  public static final SubLSymbol $sym32$_CSETF_IUT_BUG_NUMBER = makeSymbol("_CSETF-IUT-BUG-NUMBER");
  public static final SubLSymbol $sym33$IUT_CREATION_DATE = makeSymbol("IUT-CREATION-DATE");
  public static final SubLSymbol $sym34$_CSETF_IUT_CREATION_DATE = makeSymbol("_CSETF-IUT-CREATION-DATE");
  public static final SubLSymbol $sym35$IUT_CREATOR = makeSymbol("IUT-CREATOR");
  public static final SubLSymbol $sym36$_CSETF_IUT_CREATOR = makeSymbol("_CSETF-IUT-CREATOR");
  public static final SubLSymbol $sym37$IUT_WORKING_ = makeSymbol("IUT-WORKING?");
  public static final SubLSymbol $sym38$_CSETF_IUT_WORKING_ = makeSymbol("_CSETF-IUT-WORKING?");
  public static final SubLSymbol $kw39$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw40$COMMENT = makeKeyword("COMMENT");
  public static final SubLSymbol $kw41$SENTENCE = makeKeyword("SENTENCE");
  public static final SubLSymbol $kw42$PROPERTIES = makeKeyword("PROPERTIES");
  public static final SubLSymbol $kw43$RESULT = makeKeyword("RESULT");
  public static final SubLSymbol $kw44$HALT_REASON = makeKeyword("HALT-REASON");
  public static final SubLSymbol $kw45$RESULT_TEST = makeKeyword("RESULT-TEST");
  public static final SubLSymbol $kw46$FOLLOWUPS = makeKeyword("FOLLOWUPS");
  public static final SubLSymbol $kw47$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw48$KB = makeKeyword("KB");
  public static final SubLSymbol $kw49$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw50$BUG_NUMBER = makeKeyword("BUG-NUMBER");
  public static final SubLSymbol $kw51$CREATION_DATE = makeKeyword("CREATION-DATE");
  public static final SubLSymbol $kw52$CREATOR = makeKeyword("CREATOR");
  public static final SubLSymbol $kw53$WORKING_ = makeKeyword("WORKING?");
  public static final SubLString $str54$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym55$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");
  public static final SubLString $str56$Cannot_build_inference_test_recip = makeString("Cannot build inference test recipe; symbolic form of result test function ~A unknown.");
  public static final SubLSymbol $kw57$EXPECTED_RESULT = makeKeyword("EXPECTED-RESULT");
  public static final SubLInteger $int58$513 = makeInteger(513);
  public static final SubLSymbol $sym59$CFASL_INPUT_INFERENCE_UNIT_TEST = makeSymbol("CFASL-INPUT-INFERENCE-UNIT-TEST");
  public static final SubLSymbol $sym60$CFASL_OUTPUT_OBJECT_INFERENCE_UNIT_TEST_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-INFERENCE-UNIT-TEST-METHOD");
  public static final SubLString $str61$Deserialization_produced__A_inste = makeString("Deserialization produced ~A instead of ~A for IUT ~A.");
  public static final SubLSymbol $sym62$_INFERENCE_UNIT_TEST_NAMES_IN_ORDER_ = makeSymbol("*INFERENCE-UNIT-TEST-NAMES-IN-ORDER*");
  public static final SubLSymbol $sym63$_INFERENCE_UNIT_TESTS_BY_NAME_ = makeSymbol("*INFERENCE-UNIT-TESTS-BY-NAME*");
  public static final SubLInteger $int64$212 = makeInteger(212);
  public static final SubLList $list65 = list(list(makeSymbol("TEST-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list66 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw67$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw68$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym69$NAME = makeUninternedSymbol("NAME");
  public static final SubLSymbol $sym70$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym71$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym72$FIND_INFERENCE_UNIT_TEST_BY_NAME = makeSymbol("FIND-INFERENCE-UNIT-TEST-BY-NAME");
  public static final SubLList $list73 = list(makeSymbol("SENTENCE"), makeSymbol("PROPERTIES"), makeSymbol("EXPECTED-RESULT"), makeSymbol("EXPECTED-RESULT-TEST"), makeSymbol("EXPECTED-HALT-REASON"));
  public static final SubLSymbol $kw74$CONTINUE = makeKeyword("CONTINUE");
  public static final SubLSymbol $kw75$PREVIOUS = makeKeyword("PREVIOUS");
  public static final SubLList $list76 = list(new SubLObject[] {makeSymbol("NAME"), makeSymbol("&KEY"), makeSymbol("SENTENCE"), makeSymbol("PROPERTIES"), makeSymbol("EXPECTED-RESULT"), list(makeSymbol("EXPECTED-HALT-REASON"), makeKeyword("EXHAUST-TOTAL")), makeSymbol("EXPECTED-RESULT-TEST"), makeSymbol("COMMENT"), makeSymbol("FOLLOWUPS"), makeSymbol("BINDINGS"), list(makeSymbol("KB"), makeKeyword("TINY")), makeSymbol("OWNER"), makeSymbol("BUG"), makeSymbol("CREATED"), makeSymbol("CREATOR"), list(makeSymbol("WORKING?"), T)});
  public static final SubLList $list77 = list(new SubLObject[] {makeKeyword("SENTENCE"), makeKeyword("PROPERTIES"), makeKeyword("EXPECTED-RESULT"), makeKeyword("EXPECTED-HALT-REASON"), makeKeyword("EXPECTED-RESULT-TEST"), makeKeyword("COMMENT"), makeKeyword("FOLLOWUPS"), makeKeyword("BINDINGS"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG"), makeKeyword("CREATED"), makeKeyword("CREATOR"), makeKeyword("WORKING?")});
  public static final SubLSymbol $kw78$EXPECTED_HALT_REASON = makeKeyword("EXPECTED-HALT-REASON");
  public static final SubLSymbol $kw79$EXHAUST_TOTAL = makeKeyword("EXHAUST-TOTAL");
  public static final SubLSymbol $kw80$EXPECTED_RESULT_TEST = makeKeyword("EXPECTED-RESULT-TEST");
  public static final SubLSymbol $kw81$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw82$BUG = makeKeyword("BUG");
  public static final SubLSymbol $kw83$CREATED = makeKeyword("CREATED");
  public static final SubLSymbol $sym84$DEFINE_INFERENCE_UNIT_TEST_INTERNAL = makeSymbol("DEFINE-INFERENCE-UNIT-TEST-INTERNAL");
  public static final SubLSymbol $sym85$CANONICALIZE_INFERENCE_UNIT_TEST_FOLLOWUPS = makeSymbol("CANONICALIZE-INFERENCE-UNIT-TEST-FOLLOWUPS");
  public static final SubLSymbol $sym86$DEFINE_INFERENCE_UNIT_TEST = makeSymbol("DEFINE-INFERENCE-UNIT-TEST");
  public static final SubLList $list87 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym88$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym89$POSSIBLY_SENTENCE_P = makeSymbol("POSSIBLY-SENTENCE-P");
  public static final SubLSymbol $sym90$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $sym91$QUERY_PROPERTY_P = makeSymbol("QUERY-PROPERTY-P");
  public static final SubLSymbol $sym92$BINDING_LISTS_P = makeSymbol("BINDING-LISTS-P");
  public static final SubLSymbol $sym93$QUERY_HALT_REASON_P = makeSymbol("QUERY-HALT-REASON-P");
  public static final SubLSymbol $sym94$FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");
  public static final SubLSymbol $sym95$INFERENCE_TEST_COMMENT_P = makeSymbol("INFERENCE-TEST-COMMENT-P");
  public static final SubLSymbol $sym96$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym97$INFERENCE_UNIT_TEST_FOLLOWUP_P = makeSymbol("INFERENCE-UNIT-TEST-FOLLOWUP-P");
  public static final SubLSymbol $sym98$SUBL_VARIABLE_BINDING_LIST_P = makeSymbol("SUBL-VARIABLE-BINDING-LIST-P");
  public static final SubLSymbol $sym99$CYC_TEST_KB_P = makeSymbol("CYC-TEST-KB-P");
  public static final SubLSymbol $sym100$INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");
  public static final SubLSymbol $sym101$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym102$UNIVERSAL_DATE_P = makeSymbol("UNIVERSAL-DATE-P");
  public static final SubLSymbol $sym103$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym104$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $kw105$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLString $str106$The_test__S_is_not_queried_with__ = makeString("The test ~S is not queried with :conditional-sentence? T.");
  public static final SubLList $list107 = list(makeSymbol("&KEY"), list(makeSymbol("SENTENCE"), makeKeyword("CONTINUE")), makeSymbol("PROPERTIES"), makeSymbol("EXPECTED-RESULT"), makeSymbol("EXPECTED-RESULT-TEST"), list(makeSymbol("EXPECTED-HALT-REASON"), makeKeyword("EXHAUST-TOTAL")));
  public static final SubLList $list108 = list(makeKeyword("SENTENCE"), makeKeyword("PROPERTIES"), makeKeyword("EXPECTED-RESULT"), makeKeyword("EXPECTED-RESULT-TEST"), makeKeyword("EXPECTED-HALT-REASON"));
  public static final SubLSymbol $kw109$STANDARD = makeKeyword("STANDARD");
  public static final SubLSymbol $kw110$VERBOSE = makeKeyword("VERBOSE");
  public static final SubLSymbol $kw111$TERSE = makeKeyword("TERSE");
  public static final SubLSymbol $kw112$IUT = makeKeyword("IUT");
  public static final SubLSymbol $sym113$CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");
  public static final SubLSymbol $sym114$CYC_TEST_P = makeSymbol("CYC-TEST-P");
  public static final SubLSymbol $sym115$FIND_CYC_TEST = makeSymbol("FIND-CYC-TEST");
  public static final SubLString $str116$No_test_with_name__a_was_found = makeString("No test with name ~a was found");
  public static final SubLSymbol $kw117$NOT_RUN = makeKeyword("NOT-RUN");
  public static final SubLSymbol $kw118$INVALID = makeKeyword("INVALID");
  public static final SubLSymbol $kw119$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $sym120$EL_SENTENCE_P = makeSymbol("EL-SENTENCE-P");
  public static final SubLSymbol $kw121$UNPROVIDED = makeKeyword("UNPROVIDED");
  public static final SubLSymbol $kw122$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
  public static final SubLString $str123$Previous_inference_was_not_browsa = makeString("Previous inference was not browsable");
  public static final SubLSymbol $kw124$FAILURE = makeKeyword("FAILURE");
  public static final SubLSymbol $kw125$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw126$BLOCK_ = makeKeyword("BLOCK?");
  public static final SubLList $list127 = list(makeKeyword("PROBABLY-APPROXIMATELY-DONE"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL);
  public static final SubLSymbol $kw128$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $kw129$BINDINGS_AND_HYPOTHETICAL_BINDINGS = makeKeyword("BINDINGS-AND-HYPOTHETICAL-BINDINGS");
  public static final SubLString $str130$___S____ = makeString("~&~S -> ");
  public static final SubLString $str131$_S__ = makeString("~S~%");
  public static final SubLSymbol $kw132$POST_BUILD = makeKeyword("POST-BUILD");
  public static final SubLString $str133$___S__IUT__S__OWNER__S__ = makeString("~&~S :IUT ~S :OWNER ~S~%");
  public static final SubLString $str134$__Failure_when_asking = makeString("~%Failure when asking");
  public static final SubLString $str135$_______S = makeString("~%~%  ~S");
  public static final SubLString $str136$____with_properties__s = makeString("~%~%with properties ~s");
  public static final SubLString $str137$__Result_test____s = makeString("~%Result test : ~s");
  public static final SubLString $str138$__Actual_result______s = makeString("~%Actual result   : ~s");
  public static final SubLString $str139$__Expected_result____s = makeString("~%Expected result : ~s");
  public static final SubLString $str140$__Actual_halt_reason______s = makeString("~%Actual halt reason   : ~s");
  public static final SubLString $str141$__Expected_halt_reason____s = makeString("~%Expected halt reason : ~s");
  public static final SubLString $str142$____ = makeString("~%~%");

  //// Initializers

  public void declareFunctions() {
    declare_inference_unit_tests_file();
  }

  public void initializeVariables() {
    init_inference_unit_tests_file();
  }

  public void runTopLevelForms() {
    setup_inference_unit_tests_file();
  }

}
