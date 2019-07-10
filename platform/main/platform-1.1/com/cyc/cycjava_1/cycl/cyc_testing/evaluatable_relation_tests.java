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

package com.cyc.cycjava_1.cycl.cyc_testing;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;

public  final class evaluatable_relation_tests extends SubLTranslatedFile {

  //// Constructor

  private evaluatable_relation_tests() {}
  public static final SubLFile me = new evaluatable_relation_tests();
  public static final String myName = "com.cyc.cycjava_1.cycl.cyc_testing.evaluatable_relation_tests";

  //// Definitions

  public static final class $evaluatable_relation_test_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $relation; }
    public SubLObject getField3() { return $id; }
    public SubLObject getField4() { return $sentence; }
    public SubLObject getField5() { return $kb; }
    public SubLObject getField6() { return $owner; }
    public SubLObject setField2(SubLObject value) { return $relation = value; }
    public SubLObject setField3(SubLObject value) { return $id = value; }
    public SubLObject setField4(SubLObject value) { return $sentence = value; }
    public SubLObject setField5(SubLObject value) { return $kb = value; }
    public SubLObject setField6(SubLObject value) { return $owner = value; }
    public SubLObject $relation = NIL;
    public SubLObject $id = NIL;
    public SubLObject $sentence = NIL;
    public SubLObject $kb = NIL;
    public SubLObject $owner = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($evaluatable_relation_test_native.class, $sym0$EVALUATABLE_RELATION_TEST, $sym1$EVALUATABLE_RELATION_TEST_P, $list2, $list3, new String[] {"$relation", "$id", "$sentence", "$kb", "$owner"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2411) 
  public static SubLSymbol $dtp_evaluatable_relation_test$ = null;

  @SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2411) 
  public static final SubLObject evaluatable_relation_test_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $evaluatable_relation_test_p$UnaryFunction extends UnaryFunction {
    public $evaluatable_relation_test_p$UnaryFunction() { super(extractFunctionNamed("EVALUATABLE-RELATION-TEST-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32269"); }
  }

  public static final class $ert_id$UnaryFunction extends UnaryFunction {
    public $ert_id$UnaryFunction() { super(extractFunctionNamed("ERT-ID")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32245"); }
  }

  @SubL(source = "cycl/cyc-testing/evaluatable-relation-tests.lisp", position = 2661) 
  private static SubLSymbol $evaluatable_relation_tests$ = null;

  public static final SubLObject declare_evaluatable_relation_tests_file() {
    declareFunction(myName, "evaluatable_relation_test_print_function_trampoline", "EVALUATABLE-RELATION-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "evaluatable_relation_test_p", "EVALUATABLE-RELATION-TEST-P", 1, 0, false); new $evaluatable_relation_test_p$UnaryFunction();
    declareFunction(myName, "ert_relation", "ERT-RELATION", 1, 0, false);
    declareFunction(myName, "ert_id", "ERT-ID", 1, 0, false); new $ert_id$UnaryFunction();
    declareFunction(myName, "ert_sentence", "ERT-SENTENCE", 1, 0, false);
    declareFunction(myName, "ert_kb", "ERT-KB", 1, 0, false);
    declareFunction(myName, "ert_owner", "ERT-OWNER", 1, 0, false);
    declareFunction(myName, "_csetf_ert_relation", "_CSETF-ERT-RELATION", 2, 0, false);
    declareFunction(myName, "_csetf_ert_id", "_CSETF-ERT-ID", 2, 0, false);
    declareFunction(myName, "_csetf_ert_sentence", "_CSETF-ERT-SENTENCE", 2, 0, false);
    declareFunction(myName, "_csetf_ert_kb", "_CSETF-ERT-KB", 2, 0, false);
    declareFunction(myName, "_csetf_ert_owner", "_CSETF-ERT-OWNER", 2, 0, false);
    declareFunction(myName, "make_evaluatable_relation_test", "MAKE-EVALUATABLE-RELATION-TEST", 0, 1, false);
    declareFunction(myName, "clear_evaluatable_relation_tests", "CLEAR-EVALUATABLE-RELATION-TESTS", 0, 0, false);
    declareFunction(myName, "evaluatable_relations_with_evaluatable_relation_tests", "EVALUATABLE-RELATIONS-WITH-EVALUATABLE-RELATION-TESTS", 0, 0, false);
    declareFunction(myName, "evaluatable_relation_tests", "EVALUATABLE-RELATION-TESTS", 1, 0, false);
    declareFunction(myName, "some_evaluatable_relation_testsP", "SOME-EVALUATABLE-RELATION-TESTS?", 1, 0, false);
    declareFunction(myName, "evaluatable_relation_test_name", "EVALUATABLE-RELATION-TEST-NAME", 1, 0, false);
    declareFunction(myName, "evaluatable_relation_test_owner", "EVALUATABLE-RELATION-TEST-OWNER", 1, 0, false);
    declareFunction(myName, "evaluatable_relation_test_comment", "EVALUATABLE-RELATION-TEST-COMMENT", 1, 0, false);
    declareFunction(myName, "evaluatable_relation_test_relation", "EVALUATABLE-RELATION-TEST-RELATION", 1, 0, false);
    declareFunction(myName, "evaluatable_relation_test_sentence", "EVALUATABLE-RELATION-TEST-SENTENCE", 1, 0, false);
    declareFunction(myName, "evaluatable_relation_test_kb", "EVALUATABLE-RELATION-TEST-KB", 1, 0, false);
    declareFunction(myName, "evaluatable_relation_test_workingP", "EVALUATABLE-RELATION-TEST-WORKING?", 1, 0, false);
    declareFunction(myName, "evaluatable_relation_test_mentions_invalid_constantP", "EVALUATABLE-RELATION-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
    declareFunction(myName, "evaluatable_relation_test_count", "EVALUATABLE-RELATION-TEST-COUNT", 1, 0, false);
    declareFunction(myName, "total_evaluatable_relation_test_count", "TOTAL-EVALUATABLE-RELATION-TEST-COUNT", 0, 0, false);
    declareMacro(myName, "define_evaluatable_function_test", "DEFINE-EVALUATABLE-FUNCTION-TEST");
    declareMacro(myName, "define_evaluatable_predicate_test", "DEFINE-EVALUATABLE-PREDICATE-TEST");
    declareFunction(myName, "define_evaluatable_relation_test_int", "DEFINE-EVALUATABLE-RELATION-TEST-INT", 5, 0, false);
    declareMacro(myName, "define_simple_evaluatable_function_test", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST");
    declareMacro(myName, "define_simple_evaluatable_function_test_block", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK");
    declareFunction(myName, "define_simple_evaluatable_function_test_int", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-INT", 7, 0, false);
    declareFunction(myName, "define_simple_evaluatable_function_test_block_int", "DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK-INT", 7, 0, false);
    declareMacro(myName, "define_simple_evaluatable_predicate_test", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST");
    declareMacro(myName, "define_simple_evaluatable_predicate_test_block", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK");
    declareFunction(myName, "define_simple_evaluatable_predicate_test_int", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-INT", 7, 0, false);
    declareFunction(myName, "define_simple_evaluatable_predicate_test_block_int", "DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK-INT", 6, 0, false);
    declareFunction(myName, "run_all_evaluatable_relation_tests", "RUN-ALL-EVALUATABLE-RELATION-TESTS", 0, 4, false);
    declareFunction(myName, "run_evaluatable_relation_tests", "RUN-EVALUATABLE-RELATION-TESTS", 1, 3, false);
    declareFunction(myName, "run_evaluatable_relation_test_number", "RUN-EVALUATABLE-RELATION-TEST-NUMBER", 2, 3, false);
    declareFunction(myName, "run_evaluatable_relation_test_number_browsable", "RUN-EVALUATABLE-RELATION-TEST-NUMBER-BROWSABLE", 2, 2, false);
    declareFunction(myName, "run_evaluatable_relation_test", "RUN-EVALUATABLE-RELATION-TEST", 1, 3, false);
    declareFunction(myName, "run_evaluatable_relation_testP", "RUN-EVALUATABLE-RELATION-TEST?", 1, 0, false);
    declareFunction(myName, "run_evaluatable_relation_test_query", "RUN-EVALUATABLE-RELATION-TEST-QUERY", 2, 0, false);
    declareFunction(myName, "evaluatable_relation_test_query_inference", "EVALUATABLE-RELATION-TEST-QUERY-INFERENCE", 1, 1, false);
    declareFunction(myName, "print_evaluatable_relation_test_preamble", "PRINT-EVALUATABLE-RELATION-TEST-PREAMBLE", 3, 0, false);
    declareFunction(myName, "print_evaluatable_relation_test_result", "PRINT-EVALUATABLE-RELATION-TEST-RESULT", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_evaluatable_relation_tests_file() {
    $dtp_evaluatable_relation_test$ = defconstant("*DTP-EVALUATABLE-RELATION-TEST*", $sym0$EVALUATABLE_RELATION_TEST);
    $evaluatable_relation_tests$ = deflexical("*EVALUATABLE-RELATION-TESTS*", maybeDefault( $sym24$_EVALUATABLE_RELATION_TESTS_, $evaluatable_relation_tests$, ()-> (Hashtables.make_hash_table($int25$100, UNPROVIDED, UNPROVIDED))));
    return NIL;
  }

  public static final SubLObject setup_evaluatable_relation_tests_file() {
    // CVS_ID("Id: evaluatable-relation-tests.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_evaluatable_relation_test$.getGlobalValue(), Symbols.symbol_function($sym7$EVALUATABLE_RELATION_TEST_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$ERT_RELATION, $sym9$_CSETF_ERT_RELATION);
    Structures.def_csetf($sym10$ERT_ID, $sym11$_CSETF_ERT_ID);
    Structures.def_csetf($sym12$ERT_SENTENCE, $sym13$_CSETF_ERT_SENTENCE);
    Structures.def_csetf($sym14$ERT_KB, $sym15$_CSETF_ERT_KB);
    Structures.def_csetf($sym16$ERT_OWNER, $sym17$_CSETF_ERT_OWNER);
    Equality.identity($sym0$EVALUATABLE_RELATION_TEST);
    subl_macro_promotions.declare_defglobal($sym24$_EVALUATABLE_RELATION_TESTS_);
    meta_macros.declare_indention_pattern($sym35$DEFINE_EVALUATABLE_FUNCTION_TEST, $list36);
    meta_macros.declare_indention_pattern($sym38$DEFINE_EVALUATABLE_PREDICATE_TEST, $list39);
    meta_macros.declare_indention_pattern($sym50$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST, $list36);
    meta_macros.declare_indention_pattern($sym57$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK, $list58);
    access_macros.register_macro_helper($sym49$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT, $sym50$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST);
    access_macros.register_macro_helper($sym56$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT, $sym57$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK);
    meta_macros.declare_indention_pattern($sym75$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST, $list39);
    meta_macros.declare_indention_pattern($sym79$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK, $list80);
    access_macros.register_macro_helper($sym74$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT, $sym75$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST);
    access_macros.register_macro_helper($sym78$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT, $sym79$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$EVALUATABLE_RELATION_TEST = makeSymbol("EVALUATABLE-RELATION-TEST");
  public static final SubLSymbol $sym1$EVALUATABLE_RELATION_TEST_P = makeSymbol("EVALUATABLE-RELATION-TEST-P");
  public static final SubLList $list2 = list(makeSymbol("RELATION"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("KB"), makeSymbol("OWNER"));
  public static final SubLList $list3 = list(makeKeyword("RELATION"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("KB"), makeKeyword("OWNER"));
  public static final SubLList $list4 = list(makeSymbol("ERT-RELATION"), makeSymbol("ERT-ID"), makeSymbol("ERT-SENTENCE"), makeSymbol("ERT-KB"), makeSymbol("ERT-OWNER"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-ERT-RELATION"), makeSymbol("_CSETF-ERT-ID"), makeSymbol("_CSETF-ERT-SENTENCE"), makeSymbol("_CSETF-ERT-KB"), makeSymbol("_CSETF-ERT-OWNER"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$EVALUATABLE_RELATION_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EVALUATABLE-RELATION-TEST-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$ERT_RELATION = makeSymbol("ERT-RELATION");
  public static final SubLSymbol $sym9$_CSETF_ERT_RELATION = makeSymbol("_CSETF-ERT-RELATION");
  public static final SubLSymbol $sym10$ERT_ID = makeSymbol("ERT-ID");
  public static final SubLSymbol $sym11$_CSETF_ERT_ID = makeSymbol("_CSETF-ERT-ID");
  public static final SubLSymbol $sym12$ERT_SENTENCE = makeSymbol("ERT-SENTENCE");
  public static final SubLSymbol $sym13$_CSETF_ERT_SENTENCE = makeSymbol("_CSETF-ERT-SENTENCE");
  public static final SubLSymbol $sym14$ERT_KB = makeSymbol("ERT-KB");
  public static final SubLSymbol $sym15$_CSETF_ERT_KB = makeSymbol("_CSETF-ERT-KB");
  public static final SubLSymbol $sym16$ERT_OWNER = makeSymbol("ERT-OWNER");
  public static final SubLSymbol $sym17$_CSETF_ERT_OWNER = makeSymbol("_CSETF-ERT-OWNER");
  public static final SubLSymbol $kw18$RELATION = makeKeyword("RELATION");
  public static final SubLSymbol $kw19$ID = makeKeyword("ID");
  public static final SubLSymbol $kw20$SENTENCE = makeKeyword("SENTENCE");
  public static final SubLSymbol $kw21$KB = makeKeyword("KB");
  public static final SubLSymbol $kw22$OWNER = makeKeyword("OWNER");
  public static final SubLString $str23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym24$_EVALUATABLE_RELATION_TESTS_ = makeSymbol("*EVALUATABLE-RELATION-TESTS*");
  public static final SubLInteger $int25$100 = makeInteger(100);
  public static final SubLSymbol $sym26$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym27$_ = makeSymbol("<");
  public static final SubLString $str28$ = makeString("");
  public static final SubLSymbol $sym29$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");
  public static final SubLList $list30 = list(makeSymbol("FUNCTION"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("OWNER"));
  public static final SubLList $list31 = list(makeKeyword("KB"), makeKeyword("OWNER"));
  public static final SubLSymbol $kw32$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw33$FULL = makeKeyword("FULL");
  public static final SubLSymbol $sym34$DEFINE_EVALUATABLE_RELATION_TEST_INT = makeSymbol("DEFINE-EVALUATABLE-RELATION-TEST-INT");
  public static final SubLSymbol $sym35$DEFINE_EVALUATABLE_FUNCTION_TEST = makeSymbol("DEFINE-EVALUATABLE-FUNCTION-TEST");
  public static final SubLList $list36 = list(makeSymbol("FUNCTION"), makeSymbol("ID"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list37 = list(makeSymbol("PREDICATE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("OWNER"));
  public static final SubLSymbol $sym38$DEFINE_EVALUATABLE_PREDICATE_TEST = makeSymbol("DEFINE-EVALUATABLE-PREDICATE-TEST");
  public static final SubLList $list39 = list(makeSymbol("PREDICATE"), makeSymbol("ID"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym40$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym41$POSSIBLY_SENTENCE_P = makeSymbol("POSSIBLY-SENTENCE-P");
  public static final SubLSymbol $sym42$CYC_TEST_KB_P = makeSymbol("CYC-TEST-KB-P");
  public static final SubLSymbol $sym43$INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");
  public static final SubLList $list44 = list(makeSymbol("FUNCTION"), makeSymbol("ID"), makeSymbol("EXPRESSION"), makeSymbol("&KEY"), list(makeSymbol("RESULT"), makeKeyword("DONT-CARE")), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("MT"), makeSymbol("OWNER"));
  public static final SubLList $list45 = list(makeKeyword("RESULT"), makeKeyword("KB"), makeKeyword("MT"), makeKeyword("OWNER"));
  public static final SubLSymbol $kw46$RESULT = makeKeyword("RESULT");
  public static final SubLSymbol $kw47$DONT_CARE = makeKeyword("DONT-CARE");
  public static final SubLSymbol $kw48$MT = makeKeyword("MT");
  public static final SubLSymbol $sym49$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_INT = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-INT");
  public static final SubLSymbol $sym50$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST");
  public static final SubLList $list51 = list(makeSymbol("FUNCTION"), makeSymbol("START-ID"), makeSymbol("&KEY"), list(makeSymbol("MT"), constant_handles.reader_make_constant_shell(makeString("InferencePSC"))), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("TESTS"), makeSymbol("OWNER"), list(makeSymbol("WORKING?"), T));
  public static final SubLList $list52 = list(makeKeyword("MT"), makeKeyword("KB"), makeKeyword("TESTS"), makeKeyword("OWNER"), makeKeyword("WORKING?"));
  public static final SubLObject $const53$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $kw54$TESTS = makeKeyword("TESTS");
  public static final SubLSymbol $kw55$WORKING_ = makeKeyword("WORKING?");
  public static final SubLSymbol $sym56$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK_INT = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK-INT");
  public static final SubLSymbol $sym57$DEFINE_SIMPLE_EVALUATABLE_FUNCTION_TEST_BLOCK = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-FUNCTION-TEST-BLOCK");
  public static final SubLList $list58 = list(makeSymbol("FUNCTION"), makeSymbol("START-ID"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $kw59$ILL_FORMED = makeKeyword("ILL-FORMED");
  public static final SubLObject $const60$trueSubL = constant_handles.reader_make_constant_shell(makeString("trueSubL"));
  public static final SubLObject $const61$SubLQuoteFn = constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn"));
  public static final SubLSymbol $sym62$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym63$EL_WFF_ = makeSymbol("EL-WFF?");
  public static final SubLSymbol $sym64$QUOTE = makeSymbol("QUOTE");
  public static final SubLObject $const65$evaluate = constant_handles.reader_make_constant_shell(makeString("evaluate"));
  public static final SubLSymbol $sym66$_RESULT = makeSymbol("?RESULT");
  public static final SubLSymbol $kw67$UNEVALUATABLE = makeKeyword("UNEVALUATABLE");
  public static final SubLObject $const68$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));
  public static final SubLObject $const69$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));
  public static final SubLObject $const70$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLList $list71 = list(makeSymbol("EXPRESSION"), makeSymbol("&OPTIONAL"), list(makeSymbol("RESULT"), makeKeyword("DONT-CARE")));
  public static final SubLList $list72 = list(makeSymbol("PREDICATE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("RESULT"), makeKeyword("DONT-CARE")), makeSymbol("MT"), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("OWNER"));
  public static final SubLList $list73 = list(makeKeyword("RESULT"), makeKeyword("MT"), makeKeyword("KB"), makeKeyword("OWNER"));
  public static final SubLSymbol $sym74$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_INT = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-INT");
  public static final SubLSymbol $sym75$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST");
  public static final SubLList $list76 = list(makeSymbol("PREDICATE"), makeSymbol("START-ID"), makeSymbol("&KEY"), list(makeSymbol("MT"), constant_handles.reader_make_constant_shell(makeString("InferencePSC"))), list(makeSymbol("KB"), makeKeyword("FULL")), makeSymbol("OWNER"), makeSymbol("TESTS"));
  public static final SubLList $list77 = list(makeKeyword("MT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("TESTS"));
  public static final SubLSymbol $sym78$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK_INT = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK-INT");
  public static final SubLSymbol $sym79$DEFINE_SIMPLE_EVALUATABLE_PREDICATE_TEST_BLOCK = makeSymbol("DEFINE-SIMPLE-EVALUATABLE-PREDICATE-TEST-BLOCK");
  public static final SubLList $list80 = list(makeSymbol("PREDICATE"), makeSymbol("START-ID"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLObject $const81$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLSymbol $kw82$FALSE = makeKeyword("FALSE");
  public static final SubLList $list83 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), list(makeSymbol("RESULT"), makeKeyword("TRUE")));
  public static final SubLSymbol $kw84$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw85$STANDARD = makeKeyword("STANDARD");
  public static final SubLSymbol $sym86$CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");
  public static final SubLSymbol $kw87$TERSE = makeKeyword("TERSE");
  public static final SubLSymbol $kw88$ERT = makeKeyword("ERT");
  public static final SubLSymbol $kw89$NOT_RUN = makeKeyword("NOT-RUN");
  public static final SubLSymbol $kw90$INVALID = makeKeyword("INVALID");
  public static final SubLSymbol $kw91$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $kw92$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym93$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $kw94$FAILURE = makeKeyword("FAILURE");
  public static final SubLSymbol $kw95$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $kw96$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");
  public static final SubLSymbol $kw97$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $kw98$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLString $str99$___S__S____ = makeString("~&~S ~S -> ");
  public static final SubLSymbol $kw100$POST_BUILD = makeKeyword("POST-BUILD");
  public static final SubLString $str101$Unknown_output_format__A = makeString("Unknown output format ~A");
  public static final SubLString $str102$_S__ = makeString("~S~%");
  public static final SubLString $str103$_S__ERT___S__S___OWNER__S__ = makeString("~S :ERT (~S ~S) :OWNER ~S~%");

  //// Initializers

  public void declareFunctions() {
    declare_evaluatable_relation_tests_file();
  }

  public void initializeVariables() {
    init_evaluatable_relation_tests_file();
  }

  public void runTopLevelForms() {
    setup_evaluatable_relation_tests_file();
  }

}
