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
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class removal_module_tests extends SubLTranslatedFile {

  //// Constructor

  private removal_module_tests() {}
  public static final SubLFile me = new removal_module_tests();
  public static final String myName = "com.cyc.cycjava_1.cycl.cyc_testing.removal_module_tests";

  //// Definitions

  public static final class $removal_module_test_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $hl_module; }
    public SubLObject getField3() { return $id; }
    public SubLObject getField4() { return $sentence; }
    public SubLObject getField5() { return $mt; }
    public SubLObject getField6() { return $properties; }
    public SubLObject getField7() { return $comment; }
    public SubLObject getField8() { return $kb; }
    public SubLObject getField9() { return $owner; }
    public SubLObject getField10() { return $bug_number; }
    public SubLObject getField11() { return $creation_date; }
    public SubLObject getField12() { return $creator; }
    public SubLObject getField13() { return $workingP; }
    public SubLObject setField2(SubLObject value) { return $hl_module = value; }
    public SubLObject setField3(SubLObject value) { return $id = value; }
    public SubLObject setField4(SubLObject value) { return $sentence = value; }
    public SubLObject setField5(SubLObject value) { return $mt = value; }
    public SubLObject setField6(SubLObject value) { return $properties = value; }
    public SubLObject setField7(SubLObject value) { return $comment = value; }
    public SubLObject setField8(SubLObject value) { return $kb = value; }
    public SubLObject setField9(SubLObject value) { return $owner = value; }
    public SubLObject setField10(SubLObject value) { return $bug_number = value; }
    public SubLObject setField11(SubLObject value) { return $creation_date = value; }
    public SubLObject setField12(SubLObject value) { return $creator = value; }
    public SubLObject setField13(SubLObject value) { return $workingP = value; }
    public SubLObject $hl_module = NIL;
    public SubLObject $id = NIL;
    public SubLObject $sentence = NIL;
    public SubLObject $mt = NIL;
    public SubLObject $properties = NIL;
    public SubLObject $comment = NIL;
    public SubLObject $kb = NIL;
    public SubLObject $owner = NIL;
    public SubLObject $bug_number = NIL;
    public SubLObject $creation_date = NIL;
    public SubLObject $creator = NIL;
    public SubLObject $workingP = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($removal_module_test_native.class, $sym0$REMOVAL_MODULE_TEST, $sym1$REMOVAL_MODULE_TEST_P, $list2, $list3, new String[] {"$hl_module", "$id", "$sentence", "$mt", "$properties", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1546) 
  public static SubLSymbol $dtp_removal_module_test$ = null;

  @SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1546) 
  public static final SubLObject removal_module_test_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $removal_module_test_p$UnaryFunction extends UnaryFunction {
    public $removal_module_test_p$UnaryFunction() { super(extractFunctionNamed("REMOVAL-MODULE-TEST-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32477"); }
  }

  @SubL(source = "cycl/cyc-testing/removal-module-tests.lisp", position = 1721) 
  private static SubLSymbol $removal_module_tests$ = null;

  public static final SubLObject declare_removal_module_tests_file() {
    declareFunction(myName, "removal_module_test_print_function_trampoline", "REMOVAL-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "removal_module_test_p", "REMOVAL-MODULE-TEST-P", 1, 0, false); new $removal_module_test_p$UnaryFunction();
    declareFunction(myName, "rmt_hl_module", "RMT-HL-MODULE", 1, 0, false);
    declareFunction(myName, "rmt_id", "RMT-ID", 1, 0, false);
    declareFunction(myName, "rmt_sentence", "RMT-SENTENCE", 1, 0, false);
    declareFunction(myName, "rmt_mt", "RMT-MT", 1, 0, false);
    declareFunction(myName, "rmt_properties", "RMT-PROPERTIES", 1, 0, false);
    declareFunction(myName, "rmt_comment", "RMT-COMMENT", 1, 0, false);
    declareFunction(myName, "rmt_kb", "RMT-KB", 1, 0, false);
    declareFunction(myName, "rmt_owner", "RMT-OWNER", 1, 0, false);
    declareFunction(myName, "rmt_bug_number", "RMT-BUG-NUMBER", 1, 0, false);
    declareFunction(myName, "rmt_creation_date", "RMT-CREATION-DATE", 1, 0, false);
    declareFunction(myName, "rmt_creator", "RMT-CREATOR", 1, 0, false);
    declareFunction(myName, "rmt_workingP", "RMT-WORKING?", 1, 0, false);
    declareFunction(myName, "_csetf_rmt_hl_module", "_CSETF-RMT-HL-MODULE", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_id", "_CSETF-RMT-ID", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_sentence", "_CSETF-RMT-SENTENCE", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_mt", "_CSETF-RMT-MT", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_properties", "_CSETF-RMT-PROPERTIES", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_comment", "_CSETF-RMT-COMMENT", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_kb", "_CSETF-RMT-KB", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_owner", "_CSETF-RMT-OWNER", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_bug_number", "_CSETF-RMT-BUG-NUMBER", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_creation_date", "_CSETF-RMT-CREATION-DATE", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_creator", "_CSETF-RMT-CREATOR", 2, 0, false);
    declareFunction(myName, "_csetf_rmt_workingP", "_CSETF-RMT-WORKING?", 2, 0, false);
    declareFunction(myName, "make_removal_module_test", "MAKE-REMOVAL-MODULE-TEST", 0, 1, false);
    declareFunction(myName, "removal_modules_with_removal_module_tests", "REMOVAL-MODULES-WITH-REMOVAL-MODULE-TESTS", 0, 0, false);
    declareFunction(myName, "removal_module_tests", "REMOVAL-MODULE-TESTS", 1, 0, false);
    declareFunction(myName, "some_removal_module_testsP", "SOME-REMOVAL-MODULE-TESTS?", 1, 0, false);
    declareFunction(myName, "removal_module_test_name", "REMOVAL-MODULE-TEST-NAME", 1, 0, false);
    declareFunction(myName, "removal_module_test_mt", "REMOVAL-MODULE-TEST-MT", 1, 0, false);
    declareFunction(myName, "removal_module_test_sentence", "REMOVAL-MODULE-TEST-SENTENCE", 1, 0, false);
    declareFunction(myName, "removal_module_test_owner", "REMOVAL-MODULE-TEST-OWNER", 1, 0, false);
    declareFunction(myName, "removal_module_test_comment", "REMOVAL-MODULE-TEST-COMMENT", 1, 0, false);
    declareFunction(myName, "removal_module_test_kb", "REMOVAL-MODULE-TEST-KB", 1, 0, false);
    declareFunction(myName, "removal_module_test_workingP", "REMOVAL-MODULE-TEST-WORKING?", 1, 0, false);
    declareFunction(myName, "removal_module_test_predicate", "REMOVAL-MODULE-TEST-PREDICATE", 1, 0, false);
    declareFunction(myName, "removal_module_test_mentions_invalid_constantP", "REMOVAL-MODULE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
    declareMacro(myName, "define_removal_module_test", "DEFINE-REMOVAL-MODULE-TEST");
    declareFunction(myName, "define_removal_module_test_int", "DEFINE-REMOVAL-MODULE-TEST-INT", 12, 0, false);
    declareFunction(myName, "undefine_removal_module_test_number", "UNDEFINE-REMOVAL-MODULE-TEST-NUMBER", 2, 0, false);
    declareFunction(myName, "clear_removal_module_tests", "CLEAR-REMOVAL-MODULE-TESTS", 0, 0, false);
    declareFunction(myName, "run_all_removal_module_tests", "RUN-ALL-REMOVAL-MODULE-TESTS", 0, 4, false);
    declareFunction(myName, "run_removal_module_tests_for_pred", "RUN-REMOVAL-MODULE-TESTS-FOR-PRED", 1, 4, false);
    declareFunction(myName, "run_removal_module_tests_browsable", "RUN-REMOVAL-MODULE-TESTS-BROWSABLE", 1, 2, false);
    declareFunction(myName, "run_removal_module_tests_blocking", "RUN-REMOVAL-MODULE-TESTS-BLOCKING", 1, 2, false);
    declareFunction(myName, "run_removal_module_tests", "RUN-REMOVAL-MODULE-TESTS", 1, 4, false);
    declareFunction(myName, "run_removal_module_tests_int", "RUN-REMOVAL-MODULE-TESTS-INT", 5, 0, false);
    declareFunction(myName, "run_removal_module_test_number_browsable", "RUN-REMOVAL-MODULE-TEST-NUMBER-BROWSABLE", 2, 2, false);
    declareFunction(myName, "run_removal_module_test_number_blocking", "RUN-REMOVAL-MODULE-TEST-NUMBER-BLOCKING", 2, 2, false);
    declareFunction(myName, "run_removal_module_test_number", "RUN-REMOVAL-MODULE-TEST-NUMBER", 2, 4, false);
    declareFunction(myName, "run_removal_module_test", "RUN-REMOVAL-MODULE-TEST", 1, 4, false);
    declareFunction(myName, "run_removal_module_testP", "RUN-REMOVAL-MODULE-TEST?", 1, 0, false);
    declareFunction(myName, "run_removal_module_test_query", "RUN-REMOVAL-MODULE-TEST-QUERY", 2, 6, false);
    declareFunction(myName, "run_removal_module_test_query_int", "RUN-REMOVAL-MODULE-TEST-QUERY-INT", 8, 0, false);
    declareFunction(myName, "removal_module_test_query_inference", "REMOVAL-MODULE-TEST-QUERY-INFERENCE", 1, 3, false);
    declareFunction(myName, "print_removal_module_test_preamble", "PRINT-REMOVAL-MODULE-TEST-PREAMBLE", 3, 0, false);
    declareFunction(myName, "print_removal_module_test_result", "PRINT-REMOVAL-MODULE-TEST-RESULT", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_module_tests_file() {
    $dtp_removal_module_test$ = defconstant("*DTP-REMOVAL-MODULE-TEST*", $sym0$REMOVAL_MODULE_TEST);
    $removal_module_tests$ = deflexical("*REMOVAL-MODULE-TESTS*", maybeDefault( $sym45$_REMOVAL_MODULE_TESTS_, $removal_module_tests$, ()-> (Hashtables.make_hash_table($int46$100, UNPROVIDED, UNPROVIDED))));
    return NIL;
  }

  public static final SubLObject setup_removal_module_tests_file() {
    // CVS_ID("Id: removal-module-tests.lisp 128334 2009-07-16 15:49:52Z pace ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_removal_module_test$.getGlobalValue(), Symbols.symbol_function($sym7$REMOVAL_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$RMT_HL_MODULE, $sym9$_CSETF_RMT_HL_MODULE);
    Structures.def_csetf($sym10$RMT_ID, $sym11$_CSETF_RMT_ID);
    Structures.def_csetf($sym12$RMT_SENTENCE, $sym13$_CSETF_RMT_SENTENCE);
    Structures.def_csetf($sym14$RMT_MT, $sym15$_CSETF_RMT_MT);
    Structures.def_csetf($sym16$RMT_PROPERTIES, $sym17$_CSETF_RMT_PROPERTIES);
    Structures.def_csetf($sym18$RMT_COMMENT, $sym19$_CSETF_RMT_COMMENT);
    Structures.def_csetf($sym20$RMT_KB, $sym21$_CSETF_RMT_KB);
    Structures.def_csetf($sym22$RMT_OWNER, $sym23$_CSETF_RMT_OWNER);
    Structures.def_csetf($sym24$RMT_BUG_NUMBER, $sym25$_CSETF_RMT_BUG_NUMBER);
    Structures.def_csetf($sym26$RMT_CREATION_DATE, $sym27$_CSETF_RMT_CREATION_DATE);
    Structures.def_csetf($sym28$RMT_CREATOR, $sym29$_CSETF_RMT_CREATOR);
    Structures.def_csetf($sym30$RMT_WORKING_, $sym31$_CSETF_RMT_WORKING_);
    Equality.identity($sym0$REMOVAL_MODULE_TEST);
    subl_macro_promotions.declare_defglobal($sym45$_REMOVAL_MODULE_TESTS_);
    utilities_macros.register_cyc_api_macro($sym59$DEFINE_REMOVAL_MODULE_TEST, $list51, $str60$Define_a_removal_module_test_numb);
    access_macros.register_external_symbol($sym58$DEFINE_REMOVAL_MODULE_TEST_INT);
    access_macros.register_macro_helper($sym58$DEFINE_REMOVAL_MODULE_TEST_INT, $sym59$DEFINE_REMOVAL_MODULE_TEST);
    access_macros.register_external_symbol($sym71$RUN_REMOVAL_MODULE_TESTS_FOR_PRED);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$REMOVAL_MODULE_TEST = makeSymbol("REMOVAL-MODULE-TEST");
  public static final SubLSymbol $sym1$REMOVAL_MODULE_TEST_P = makeSymbol("REMOVAL-MODULE-TEST-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("HL-MODULE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("PROPERTIES"), makeSymbol("COMMENT"), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("BUG-NUMBER"), makeSymbol("CREATION-DATE"), makeSymbol("CREATOR"), makeSymbol("WORKING?")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("HL-MODULE"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("COMMENT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("RMT-HL-MODULE"), makeSymbol("RMT-ID"), makeSymbol("RMT-SENTENCE"), makeSymbol("RMT-MT"), makeSymbol("RMT-PROPERTIES"), makeSymbol("RMT-COMMENT"), makeSymbol("RMT-KB"), makeSymbol("RMT-OWNER"), makeSymbol("RMT-BUG-NUMBER"), makeSymbol("RMT-CREATION-DATE"), makeSymbol("RMT-CREATOR"), makeSymbol("RMT-WORKING?")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-RMT-HL-MODULE"), makeSymbol("_CSETF-RMT-ID"), makeSymbol("_CSETF-RMT-SENTENCE"), makeSymbol("_CSETF-RMT-MT"), makeSymbol("_CSETF-RMT-PROPERTIES"), makeSymbol("_CSETF-RMT-COMMENT"), makeSymbol("_CSETF-RMT-KB"), makeSymbol("_CSETF-RMT-OWNER"), makeSymbol("_CSETF-RMT-BUG-NUMBER"), makeSymbol("_CSETF-RMT-CREATION-DATE"), makeSymbol("_CSETF-RMT-CREATOR"), makeSymbol("_CSETF-RMT-WORKING?")});
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$REMOVAL_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$RMT_HL_MODULE = makeSymbol("RMT-HL-MODULE");
  public static final SubLSymbol $sym9$_CSETF_RMT_HL_MODULE = makeSymbol("_CSETF-RMT-HL-MODULE");
  public static final SubLSymbol $sym10$RMT_ID = makeSymbol("RMT-ID");
  public static final SubLSymbol $sym11$_CSETF_RMT_ID = makeSymbol("_CSETF-RMT-ID");
  public static final SubLSymbol $sym12$RMT_SENTENCE = makeSymbol("RMT-SENTENCE");
  public static final SubLSymbol $sym13$_CSETF_RMT_SENTENCE = makeSymbol("_CSETF-RMT-SENTENCE");
  public static final SubLSymbol $sym14$RMT_MT = makeSymbol("RMT-MT");
  public static final SubLSymbol $sym15$_CSETF_RMT_MT = makeSymbol("_CSETF-RMT-MT");
  public static final SubLSymbol $sym16$RMT_PROPERTIES = makeSymbol("RMT-PROPERTIES");
  public static final SubLSymbol $sym17$_CSETF_RMT_PROPERTIES = makeSymbol("_CSETF-RMT-PROPERTIES");
  public static final SubLSymbol $sym18$RMT_COMMENT = makeSymbol("RMT-COMMENT");
  public static final SubLSymbol $sym19$_CSETF_RMT_COMMENT = makeSymbol("_CSETF-RMT-COMMENT");
  public static final SubLSymbol $sym20$RMT_KB = makeSymbol("RMT-KB");
  public static final SubLSymbol $sym21$_CSETF_RMT_KB = makeSymbol("_CSETF-RMT-KB");
  public static final SubLSymbol $sym22$RMT_OWNER = makeSymbol("RMT-OWNER");
  public static final SubLSymbol $sym23$_CSETF_RMT_OWNER = makeSymbol("_CSETF-RMT-OWNER");
  public static final SubLSymbol $sym24$RMT_BUG_NUMBER = makeSymbol("RMT-BUG-NUMBER");
  public static final SubLSymbol $sym25$_CSETF_RMT_BUG_NUMBER = makeSymbol("_CSETF-RMT-BUG-NUMBER");
  public static final SubLSymbol $sym26$RMT_CREATION_DATE = makeSymbol("RMT-CREATION-DATE");
  public static final SubLSymbol $sym27$_CSETF_RMT_CREATION_DATE = makeSymbol("_CSETF-RMT-CREATION-DATE");
  public static final SubLSymbol $sym28$RMT_CREATOR = makeSymbol("RMT-CREATOR");
  public static final SubLSymbol $sym29$_CSETF_RMT_CREATOR = makeSymbol("_CSETF-RMT-CREATOR");
  public static final SubLSymbol $sym30$RMT_WORKING_ = makeSymbol("RMT-WORKING?");
  public static final SubLSymbol $sym31$_CSETF_RMT_WORKING_ = makeSymbol("_CSETF-RMT-WORKING?");
  public static final SubLSymbol $kw32$HL_MODULE = makeKeyword("HL-MODULE");
  public static final SubLSymbol $kw33$ID = makeKeyword("ID");
  public static final SubLSymbol $kw34$SENTENCE = makeKeyword("SENTENCE");
  public static final SubLSymbol $kw35$MT = makeKeyword("MT");
  public static final SubLSymbol $kw36$PROPERTIES = makeKeyword("PROPERTIES");
  public static final SubLSymbol $kw37$COMMENT = makeKeyword("COMMENT");
  public static final SubLSymbol $kw38$KB = makeKeyword("KB");
  public static final SubLSymbol $kw39$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw40$BUG_NUMBER = makeKeyword("BUG-NUMBER");
  public static final SubLSymbol $kw41$CREATION_DATE = makeKeyword("CREATION-DATE");
  public static final SubLSymbol $kw42$CREATOR = makeKeyword("CREATOR");
  public static final SubLSymbol $kw43$WORKING_ = makeKeyword("WORKING?");
  public static final SubLString $str44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym45$_REMOVAL_MODULE_TESTS_ = makeSymbol("*REMOVAL-MODULE-TESTS*");
  public static final SubLInteger $int46$100 = makeInteger(100);
  public static final SubLSymbol $sym47$TERM__ = makeSymbol("TERM-<");
  public static final SubLSymbol $sym48$HL_MODULE_NAME = makeSymbol("HL-MODULE-NAME");
  public static final SubLSymbol $sym49$_ = makeSymbol("<");
  public static final SubLSymbol $sym50$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");
  public static final SubLList $list51 = list(new SubLObject[] {makeSymbol("NAME"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("MT"), constant_handles.reader_make_constant_shell(makeString("EverythingPSC"))), makeSymbol("PROPERTIES"), list(makeSymbol("KB"), makeKeyword("TINY")), makeSymbol("OWNER"), makeSymbol("COMMENT"), makeSymbol("BUG"), makeSymbol("CREATED"), makeSymbol("CREATOR"), list(makeSymbol("WORKING?"), T)});
  public static final SubLList $list52 = list(new SubLObject[] {makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("COMMENT"), makeKeyword("BUG"), makeKeyword("CREATED"), makeKeyword("CREATOR"), makeKeyword("WORKING?")});
  public static final SubLSymbol $kw53$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLObject $const54$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw55$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw56$BUG = makeKeyword("BUG");
  public static final SubLSymbol $kw57$CREATED = makeKeyword("CREATED");
  public static final SubLSymbol $sym58$DEFINE_REMOVAL_MODULE_TEST_INT = makeSymbol("DEFINE-REMOVAL-MODULE-TEST-INT");
  public static final SubLSymbol $sym59$DEFINE_REMOVAL_MODULE_TEST = makeSymbol("DEFINE-REMOVAL-MODULE-TEST");
  public static final SubLString $str60$Define_a_removal_module_test_numb = makeString("Define a removal module test number ID for the module named NAME.\n   The test queries SENTENCE in MT and verifies that a removal module named NAME was used in some goal path.\n  PROPERTIES, if not nil, specifies additional query properties to pass in.");
  public static final SubLSymbol $sym61$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym62$CYC_TEST_KB_P = makeSymbol("CYC-TEST-KB-P");
  public static final SubLSymbol $sym63$INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");
  public static final SubLSymbol $sym64$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym65$UNIVERSAL_DATE_P = makeSymbol("UNIVERSAL-DATE-P");
  public static final SubLSymbol $sym66$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $kw67$STANDARD = makeKeyword("STANDARD");
  public static final SubLSymbol $sym68$CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");
  public static final SubLSymbol $kw69$TERSE = makeKeyword("TERSE");
  public static final SubLSymbol $kw70$RMT = makeKeyword("RMT");
  public static final SubLSymbol $sym71$RUN_REMOVAL_MODULE_TESTS_FOR_PRED = makeSymbol("RUN-REMOVAL-MODULE-TESTS-FOR-PRED");
  public static final SubLSymbol $kw72$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $kw73$NOT_RUN = makeKeyword("NOT-RUN");
  public static final SubLSymbol $kw74$INVALID = makeKeyword("INVALID");
  public static final SubLSymbol $kw75$UNSPECIFIED = makeKeyword("UNSPECIFIED");
  public static final SubLSymbol $kw76$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $kw77$FAILURE = makeKeyword("FAILURE");
  public static final SubLSymbol $kw78$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym79$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $kw80$FAILURE_BINDINGS = makeKeyword("FAILURE-BINDINGS");
  public static final SubLSymbol $kw81$FAILURE_HALT_REASON = makeKeyword("FAILURE-HALT-REASON");
  public static final SubLSymbol $kw82$FAILURE_REMOVAL_MODULE = makeKeyword("FAILURE-REMOVAL-MODULE");
  public static final SubLSymbol $kw83$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLSymbol $kw84$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $kw85$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");
  public static final SubLSymbol $kw86$BLOCK_ = makeKeyword("BLOCK?");
  public static final SubLString $str87$___S__S____ = makeString("~&~S ~S -> ");
  public static final SubLSymbol $kw88$POST_BUILD = makeKeyword("POST-BUILD");
  public static final SubLString $str89$Unknown_output_format__A = makeString("Unknown output format ~A");
  public static final SubLString $str90$_S__ = makeString("~S~%");
  public static final SubLString $str91$_S__RMT___S__S___OWNER__S__ = makeString("~S :RMT (~S ~S) :OWNER ~S~%");

  //// Initializers

  public void declareFunctions() {
    declare_removal_module_tests_file();
  }

  public void initializeVariables() {
    init_removal_module_tests_file();
  }

  public void runTopLevelForms() {
    setup_removal_module_tests_file();
  }

}
