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
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class removal_module_cost_tests extends SubLTranslatedFile {

  //// Constructor

  private removal_module_cost_tests() {}
  public static final SubLFile me = new removal_module_cost_tests();
  public static final String myName = "com.cyc.cycjava_1.cycl.cyc_testing.removal_module_cost_tests";

  //// Definitions

  public static final class $removal_module_cost_test_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $hl_module; }
    public SubLObject getField3() { return $id; }
    public SubLObject getField4() { return $sentence; }
    public SubLObject getField5() { return $mt; }
    public SubLObject getField6() { return $comment; }
    public SubLObject getField7() { return $kb; }
    public SubLObject getField8() { return $owner; }
    public SubLObject getField9() { return $bug_number; }
    public SubLObject getField10() { return $creation_date; }
    public SubLObject getField11() { return $creator; }
    public SubLObject getField12() { return $workingP; }
    public SubLObject setField2(SubLObject value) { return $hl_module = value; }
    public SubLObject setField3(SubLObject value) { return $id = value; }
    public SubLObject setField4(SubLObject value) { return $sentence = value; }
    public SubLObject setField5(SubLObject value) { return $mt = value; }
    public SubLObject setField6(SubLObject value) { return $comment = value; }
    public SubLObject setField7(SubLObject value) { return $kb = value; }
    public SubLObject setField8(SubLObject value) { return $owner = value; }
    public SubLObject setField9(SubLObject value) { return $bug_number = value; }
    public SubLObject setField10(SubLObject value) { return $creation_date = value; }
    public SubLObject setField11(SubLObject value) { return $creator = value; }
    public SubLObject setField12(SubLObject value) { return $workingP = value; }
    public SubLObject $hl_module = NIL;
    public SubLObject $id = NIL;
    public SubLObject $sentence = NIL;
    public SubLObject $mt = NIL;
    public SubLObject $comment = NIL;
    public SubLObject $kb = NIL;
    public SubLObject $owner = NIL;
    public SubLObject $bug_number = NIL;
    public SubLObject $creation_date = NIL;
    public SubLObject $creator = NIL;
    public SubLObject $workingP = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($removal_module_cost_test_native.class, $sym0$REMOVAL_MODULE_COST_TEST, $sym1$REMOVAL_MODULE_COST_TEST_P, $list2, $list3, new String[] {"$hl_module", "$id", "$sentence", "$mt", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1256) 
  public static SubLSymbol $dtp_removal_module_cost_test$ = null;

  @SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1256) 
  public static final SubLObject removal_module_cost_test_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $removal_module_cost_test_p$UnaryFunction extends UnaryFunction {
    public $removal_module_cost_test_p$UnaryFunction() { super(extractFunctionNamed("REMOVAL-MODULE-COST-TEST-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32511"); }
  }

  @SubL(source = "cycl/cyc-testing/removal-module-cost-tests.lisp", position = 1424) 
  private static SubLSymbol $removal_module_cost_tests$ = null;

  public static final SubLObject declare_removal_module_cost_tests_file() {
    declareFunction(myName, "removal_module_cost_test_print_function_trampoline", "REMOVAL-MODULE-COST-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "removal_module_cost_test_p", "REMOVAL-MODULE-COST-TEST-P", 1, 0, false); new $removal_module_cost_test_p$UnaryFunction();
    declareFunction(myName, "rmct_hl_module", "RMCT-HL-MODULE", 1, 0, false);
    declareFunction(myName, "rmct_id", "RMCT-ID", 1, 0, false);
    declareFunction(myName, "rmct_sentence", "RMCT-SENTENCE", 1, 0, false);
    declareFunction(myName, "rmct_mt", "RMCT-MT", 1, 0, false);
    declareFunction(myName, "rmct_comment", "RMCT-COMMENT", 1, 0, false);
    declareFunction(myName, "rmct_kb", "RMCT-KB", 1, 0, false);
    declareFunction(myName, "rmct_owner", "RMCT-OWNER", 1, 0, false);
    declareFunction(myName, "rmct_bug_number", "RMCT-BUG-NUMBER", 1, 0, false);
    declareFunction(myName, "rmct_creation_date", "RMCT-CREATION-DATE", 1, 0, false);
    declareFunction(myName, "rmct_creator", "RMCT-CREATOR", 1, 0, false);
    declareFunction(myName, "rmct_workingP", "RMCT-WORKING?", 1, 0, false);
    declareFunction(myName, "_csetf_rmct_hl_module", "_CSETF-RMCT-HL-MODULE", 2, 0, false);
    declareFunction(myName, "_csetf_rmct_id", "_CSETF-RMCT-ID", 2, 0, false);
    declareFunction(myName, "_csetf_rmct_sentence", "_CSETF-RMCT-SENTENCE", 2, 0, false);
    declareFunction(myName, "_csetf_rmct_mt", "_CSETF-RMCT-MT", 2, 0, false);
    declareFunction(myName, "_csetf_rmct_comment", "_CSETF-RMCT-COMMENT", 2, 0, false);
    declareFunction(myName, "_csetf_rmct_kb", "_CSETF-RMCT-KB", 2, 0, false);
    declareFunction(myName, "_csetf_rmct_owner", "_CSETF-RMCT-OWNER", 2, 0, false);
    declareFunction(myName, "_csetf_rmct_bug_number", "_CSETF-RMCT-BUG-NUMBER", 2, 0, false);
    declareFunction(myName, "_csetf_rmct_creation_date", "_CSETF-RMCT-CREATION-DATE", 2, 0, false);
    declareFunction(myName, "_csetf_rmct_creator", "_CSETF-RMCT-CREATOR", 2, 0, false);
    declareFunction(myName, "_csetf_rmct_workingP", "_CSETF-RMCT-WORKING?", 2, 0, false);
    declareFunction(myName, "make_removal_module_cost_test", "MAKE-REMOVAL-MODULE-COST-TEST", 0, 1, false);
    declareFunction(myName, "removal_modules_with_removal_module_cost_tests", "REMOVAL-MODULES-WITH-REMOVAL-MODULE-COST-TESTS", 0, 0, false);
    declareFunction(myName, "removal_module_cost_tests", "REMOVAL-MODULE-COST-TESTS", 1, 0, false);
    declareFunction(myName, "some_removal_module_cost_testsP", "SOME-REMOVAL-MODULE-COST-TESTS?", 1, 0, false);
    declareFunction(myName, "removal_module_cost_test_name", "REMOVAL-MODULE-COST-TEST-NAME", 1, 0, false);
    declareFunction(myName, "removal_module_cost_test_mt", "REMOVAL-MODULE-COST-TEST-MT", 1, 0, false);
    declareFunction(myName, "removal_module_cost_test_sentence", "REMOVAL-MODULE-COST-TEST-SENTENCE", 1, 0, false);
    declareFunction(myName, "removal_module_cost_test_owner", "REMOVAL-MODULE-COST-TEST-OWNER", 1, 0, false);
    declareFunction(myName, "removal_module_cost_test_comment", "REMOVAL-MODULE-COST-TEST-COMMENT", 1, 0, false);
    declareFunction(myName, "removal_module_cost_test_kb", "REMOVAL-MODULE-COST-TEST-KB", 1, 0, false);
    declareFunction(myName, "removal_module_cost_test_workingP", "REMOVAL-MODULE-COST-TEST-WORKING?", 1, 0, false);
    declareFunction(myName, "removal_module_cost_test_predicate", "REMOVAL-MODULE-COST-TEST-PREDICATE", 1, 0, false);
    declareFunction(myName, "removal_module_cost_test_mentions_invalid_constantP", "REMOVAL-MODULE-COST-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
    declareMacro(myName, "define_removal_module_cost_test", "DEFINE-REMOVAL-MODULE-COST-TEST");
    declareFunction(myName, "define_removal_module_cost_test_int", "DEFINE-REMOVAL-MODULE-COST-TEST-INT", 11, 0, false);
    declareFunction(myName, "clear_removal_module_cost_tests", "CLEAR-REMOVAL-MODULE-COST-TESTS", 0, 0, false);
    declareFunction(myName, "run_all_removal_module_cost_tests", "RUN-ALL-REMOVAL-MODULE-COST-TESTS", 0, 4, false);
    declareFunction(myName, "run_removal_module_cost_tests_for_pred", "RUN-REMOVAL-MODULE-COST-TESTS-FOR-PRED", 1, 2, false);
    declareFunction(myName, "run_removal_module_cost_tests_blocking", "RUN-REMOVAL-MODULE-COST-TESTS-BLOCKING", 1, 2, false);
    declareFunction(myName, "run_removal_module_cost_tests", "RUN-REMOVAL-MODULE-COST-TESTS", 1, 2, false);
    declareFunction(myName, "run_removal_module_cost_tests_int", "RUN-REMOVAL-MODULE-COST-TESTS-INT", 3, 0, false);
    declareFunction(myName, "run_removal_module_cost_test_number_blocking", "RUN-REMOVAL-MODULE-COST-TEST-NUMBER-BLOCKING", 2, 2, false);
    declareFunction(myName, "run_removal_module_cost_test_number", "RUN-REMOVAL-MODULE-COST-TEST-NUMBER", 2, 2, false);
    declareFunction(myName, "run_removal_module_cost_test", "RUN-REMOVAL-MODULE-COST-TEST", 1, 2, false);
    declareFunction(myName, "run_removal_module_cost_testP", "RUN-REMOVAL-MODULE-COST-TEST?", 1, 0, false);
    declareFunction(myName, "run_removal_module_cost_test_comparison", "RUN-REMOVAL-MODULE-COST-TEST-COMPARISON", 3, 0, false);
    declareFunction(myName, "generic_cost_test_comparison", "GENERIC-COST-TEST-COMPARISON", 2, 0, false);
    declareFunction(myName, "print_removal_module_cost_test_preamble", "PRINT-REMOVAL-MODULE-COST-TEST-PREAMBLE", 3, 0, false);
    declareFunction(myName, "print_removal_module_cost_test_result", "PRINT-REMOVAL-MODULE-COST-TEST-RESULT", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_module_cost_tests_file() {
    $dtp_removal_module_cost_test$ = defconstant("*DTP-REMOVAL-MODULE-COST-TEST*", $sym0$REMOVAL_MODULE_COST_TEST);
    $removal_module_cost_tests$ = deflexical("*REMOVAL-MODULE-COST-TESTS*", maybeDefault( $sym42$_REMOVAL_MODULE_COST_TESTS_, $removal_module_cost_tests$, ()-> (Hashtables.make_hash_table($int43$100, UNPROVIDED, UNPROVIDED))));
    return NIL;
  }

  public static final SubLObject setup_removal_module_cost_tests_file() {
    // CVS_ID("Id: removal-module-cost-tests.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_removal_module_cost_test$.getGlobalValue(), Symbols.symbol_function($sym7$REMOVAL_MODULE_COST_TEST_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$RMCT_HL_MODULE, $sym9$_CSETF_RMCT_HL_MODULE);
    Structures.def_csetf($sym10$RMCT_ID, $sym11$_CSETF_RMCT_ID);
    Structures.def_csetf($sym12$RMCT_SENTENCE, $sym13$_CSETF_RMCT_SENTENCE);
    Structures.def_csetf($sym14$RMCT_MT, $sym15$_CSETF_RMCT_MT);
    Structures.def_csetf($sym16$RMCT_COMMENT, $sym17$_CSETF_RMCT_COMMENT);
    Structures.def_csetf($sym18$RMCT_KB, $sym19$_CSETF_RMCT_KB);
    Structures.def_csetf($sym20$RMCT_OWNER, $sym21$_CSETF_RMCT_OWNER);
    Structures.def_csetf($sym22$RMCT_BUG_NUMBER, $sym23$_CSETF_RMCT_BUG_NUMBER);
    Structures.def_csetf($sym24$RMCT_CREATION_DATE, $sym25$_CSETF_RMCT_CREATION_DATE);
    Structures.def_csetf($sym26$RMCT_CREATOR, $sym27$_CSETF_RMCT_CREATOR);
    Structures.def_csetf($sym28$RMCT_WORKING_, $sym29$_CSETF_RMCT_WORKING_);
    Equality.identity($sym0$REMOVAL_MODULE_COST_TEST);
    subl_macro_promotions.declare_defglobal($sym42$_REMOVAL_MODULE_COST_TESTS_);
    access_macros.register_macro_helper($sym56$DEFINE_REMOVAL_MODULE_COST_TEST_INT, $sym57$DEFINE_REMOVAL_MODULE_COST_TEST);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$REMOVAL_MODULE_COST_TEST = makeSymbol("REMOVAL-MODULE-COST-TEST");
  public static final SubLSymbol $sym1$REMOVAL_MODULE_COST_TEST_P = makeSymbol("REMOVAL-MODULE-COST-TEST-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("HL-MODULE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("COMMENT"), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("BUG-NUMBER"), makeSymbol("CREATION-DATE"), makeSymbol("CREATOR"), makeSymbol("WORKING?")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("HL-MODULE"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("COMMENT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("RMCT-HL-MODULE"), makeSymbol("RMCT-ID"), makeSymbol("RMCT-SENTENCE"), makeSymbol("RMCT-MT"), makeSymbol("RMCT-COMMENT"), makeSymbol("RMCT-KB"), makeSymbol("RMCT-OWNER"), makeSymbol("RMCT-BUG-NUMBER"), makeSymbol("RMCT-CREATION-DATE"), makeSymbol("RMCT-CREATOR"), makeSymbol("RMCT-WORKING?")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-RMCT-HL-MODULE"), makeSymbol("_CSETF-RMCT-ID"), makeSymbol("_CSETF-RMCT-SENTENCE"), makeSymbol("_CSETF-RMCT-MT"), makeSymbol("_CSETF-RMCT-COMMENT"), makeSymbol("_CSETF-RMCT-KB"), makeSymbol("_CSETF-RMCT-OWNER"), makeSymbol("_CSETF-RMCT-BUG-NUMBER"), makeSymbol("_CSETF-RMCT-CREATION-DATE"), makeSymbol("_CSETF-RMCT-CREATOR"), makeSymbol("_CSETF-RMCT-WORKING?")});
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$REMOVAL_MODULE_COST_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-MODULE-COST-TEST-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$RMCT_HL_MODULE = makeSymbol("RMCT-HL-MODULE");
  public static final SubLSymbol $sym9$_CSETF_RMCT_HL_MODULE = makeSymbol("_CSETF-RMCT-HL-MODULE");
  public static final SubLSymbol $sym10$RMCT_ID = makeSymbol("RMCT-ID");
  public static final SubLSymbol $sym11$_CSETF_RMCT_ID = makeSymbol("_CSETF-RMCT-ID");
  public static final SubLSymbol $sym12$RMCT_SENTENCE = makeSymbol("RMCT-SENTENCE");
  public static final SubLSymbol $sym13$_CSETF_RMCT_SENTENCE = makeSymbol("_CSETF-RMCT-SENTENCE");
  public static final SubLSymbol $sym14$RMCT_MT = makeSymbol("RMCT-MT");
  public static final SubLSymbol $sym15$_CSETF_RMCT_MT = makeSymbol("_CSETF-RMCT-MT");
  public static final SubLSymbol $sym16$RMCT_COMMENT = makeSymbol("RMCT-COMMENT");
  public static final SubLSymbol $sym17$_CSETF_RMCT_COMMENT = makeSymbol("_CSETF-RMCT-COMMENT");
  public static final SubLSymbol $sym18$RMCT_KB = makeSymbol("RMCT-KB");
  public static final SubLSymbol $sym19$_CSETF_RMCT_KB = makeSymbol("_CSETF-RMCT-KB");
  public static final SubLSymbol $sym20$RMCT_OWNER = makeSymbol("RMCT-OWNER");
  public static final SubLSymbol $sym21$_CSETF_RMCT_OWNER = makeSymbol("_CSETF-RMCT-OWNER");
  public static final SubLSymbol $sym22$RMCT_BUG_NUMBER = makeSymbol("RMCT-BUG-NUMBER");
  public static final SubLSymbol $sym23$_CSETF_RMCT_BUG_NUMBER = makeSymbol("_CSETF-RMCT-BUG-NUMBER");
  public static final SubLSymbol $sym24$RMCT_CREATION_DATE = makeSymbol("RMCT-CREATION-DATE");
  public static final SubLSymbol $sym25$_CSETF_RMCT_CREATION_DATE = makeSymbol("_CSETF-RMCT-CREATION-DATE");
  public static final SubLSymbol $sym26$RMCT_CREATOR = makeSymbol("RMCT-CREATOR");
  public static final SubLSymbol $sym27$_CSETF_RMCT_CREATOR = makeSymbol("_CSETF-RMCT-CREATOR");
  public static final SubLSymbol $sym28$RMCT_WORKING_ = makeSymbol("RMCT-WORKING?");
  public static final SubLSymbol $sym29$_CSETF_RMCT_WORKING_ = makeSymbol("_CSETF-RMCT-WORKING?");
  public static final SubLSymbol $kw30$HL_MODULE = makeKeyword("HL-MODULE");
  public static final SubLSymbol $kw31$ID = makeKeyword("ID");
  public static final SubLSymbol $kw32$SENTENCE = makeKeyword("SENTENCE");
  public static final SubLSymbol $kw33$MT = makeKeyword("MT");
  public static final SubLSymbol $kw34$COMMENT = makeKeyword("COMMENT");
  public static final SubLSymbol $kw35$KB = makeKeyword("KB");
  public static final SubLSymbol $kw36$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw37$BUG_NUMBER = makeKeyword("BUG-NUMBER");
  public static final SubLSymbol $kw38$CREATION_DATE = makeKeyword("CREATION-DATE");
  public static final SubLSymbol $kw39$CREATOR = makeKeyword("CREATOR");
  public static final SubLSymbol $kw40$WORKING_ = makeKeyword("WORKING?");
  public static final SubLString $str41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym42$_REMOVAL_MODULE_COST_TESTS_ = makeSymbol("*REMOVAL-MODULE-COST-TESTS*");
  public static final SubLInteger $int43$100 = makeInteger(100);
  public static final SubLSymbol $sym44$TERM__ = makeSymbol("TERM-<");
  public static final SubLSymbol $sym45$HL_MODULE_NAME = makeSymbol("HL-MODULE-NAME");
  public static final SubLSymbol $sym46$_ = makeSymbol("<");
  public static final SubLSymbol $kw47$COST = makeKeyword("COST");
  public static final SubLSymbol $sym48$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");
  public static final SubLList $list49 = list(new SubLObject[] {makeSymbol("NAME"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("&KEY"), list(makeSymbol("MT"), constant_handles.reader_make_constant_shell(makeString("EverythingPSC"))), list(makeSymbol("KB"), makeKeyword("TINY")), makeSymbol("OWNER"), makeSymbol("COMMENT"), makeSymbol("BUG"), makeSymbol("CREATED"), makeSymbol("CREATOR"), list(makeSymbol("WORKING?"), T)});
  public static final SubLList $list50 = list(makeKeyword("MT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("COMMENT"), makeKeyword("BUG"), makeKeyword("CREATED"), makeKeyword("CREATOR"), makeKeyword("WORKING?"));
  public static final SubLSymbol $kw51$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLObject $const52$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw53$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw54$BUG = makeKeyword("BUG");
  public static final SubLSymbol $kw55$CREATED = makeKeyword("CREATED");
  public static final SubLSymbol $sym56$DEFINE_REMOVAL_MODULE_COST_TEST_INT = makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST-INT");
  public static final SubLSymbol $sym57$DEFINE_REMOVAL_MODULE_COST_TEST = makeSymbol("DEFINE-REMOVAL-MODULE-COST-TEST");
  public static final SubLSymbol $sym58$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym59$CYC_TEST_KB_P = makeSymbol("CYC-TEST-KB-P");
  public static final SubLSymbol $sym60$INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");
  public static final SubLSymbol $sym61$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym62$UNIVERSAL_DATE_P = makeSymbol("UNIVERSAL-DATE-P");
  public static final SubLSymbol $sym63$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $kw64$STANDARD = makeKeyword("STANDARD");
  public static final SubLSymbol $sym65$CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");
  public static final SubLSymbol $kw66$TERSE = makeKeyword("TERSE");
  public static final SubLSymbol $kw67$RMCT = makeKeyword("RMCT");
  public static final SubLSymbol $kw68$NOT_RUN = makeKeyword("NOT-RUN");
  public static final SubLSymbol $kw69$INVALID = makeKeyword("INVALID");
  public static final SubLSymbol $kw70$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $kw71$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym72$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $kw73$POS = makeKeyword("POS");
  public static final SubLSymbol $kw74$MAYBE_MAKE_INFERENCE_OUTPUT_ITERATOR = makeKeyword("MAYBE-MAKE-INFERENCE-OUTPUT-ITERATOR");
  public static final SubLSymbol $kw75$HANDLE_ONE_OUTPUT_GENERATE_RESULT = makeKeyword("HANDLE-ONE-OUTPUT-GENERATE-RESULT");
  public static final SubLSymbol $kw76$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $kw77$FAILURE = makeKeyword("FAILURE");
  public static final SubLString $str78$___S__S____ = makeString("~&~S ~S -> ");
  public static final SubLSymbol $kw79$POST_BUILD = makeKeyword("POST-BUILD");
  public static final SubLString $str80$Unknown_output_format__A = makeString("Unknown output format ~A");
  public static final SubLString $str81$_S__ = makeString("~S~%");
  public static final SubLString $str82$_S__RMCT___S__S___OWNER__S__ = makeString("~S :RMCT (~S ~S) :OWNER ~S~%");

  //// Initializers

  public void declareFunctions() {
    declare_removal_module_cost_tests_file();
  }

  public void initializeVariables() {
    init_removal_module_cost_tests_file();
  }

  public void runTopLevelForms() {
    setup_removal_module_cost_tests_file();
  }

}
