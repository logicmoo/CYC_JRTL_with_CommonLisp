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

public  final class transformation_module_tests extends SubLTranslatedFile {

  //// Constructor

  private transformation_module_tests() {}
  public static final SubLFile me = new transformation_module_tests();
  public static final String myName = "com.cyc.cycjava_1.cycl.cyc_testing.transformation_module_tests";

  //// Definitions

  public static final class $transformation_module_test_native extends SubLStructNative {
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
    Structures.makeStructDeclNative($transformation_module_test_native.class, $sym0$TRANSFORMATION_MODULE_TEST, $sym1$TRANSFORMATION_MODULE_TEST_P, $list2, $list3, new String[] {"$hl_module", "$id", "$sentence", "$mt", "$properties", "$comment", "$kb", "$owner", "$bug_number", "$creation_date", "$creator", "$workingP"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1450) 
  public static SubLSymbol $dtp_transformation_module_test$ = null;

  @SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1450) 
  public static final SubLObject transformation_module_test_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $transformation_module_test_p$UnaryFunction extends UnaryFunction {
    public $transformation_module_test_p$UnaryFunction() { super(extractFunctionNamed("TRANSFORMATION-MODULE-TEST-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32553"); }
  }

  @SubL(source = "cycl/cyc-testing/transformation-module-tests.lisp", position = 1632) 
  private static SubLSymbol $transformation_module_tests$ = null;

  public static final SubLObject declare_transformation_module_tests_file() {
    declareFunction(myName, "transformation_module_test_print_function_trampoline", "TRANSFORMATION-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "transformation_module_test_p", "TRANSFORMATION-MODULE-TEST-P", 1, 0, false); new $transformation_module_test_p$UnaryFunction();
    declareFunction(myName, "tmt_hl_module", "TMT-HL-MODULE", 1, 0, false);
    declareFunction(myName, "tmt_id", "TMT-ID", 1, 0, false);
    declareFunction(myName, "tmt_sentence", "TMT-SENTENCE", 1, 0, false);
    declareFunction(myName, "tmt_mt", "TMT-MT", 1, 0, false);
    declareFunction(myName, "tmt_properties", "TMT-PROPERTIES", 1, 0, false);
    declareFunction(myName, "tmt_comment", "TMT-COMMENT", 1, 0, false);
    declareFunction(myName, "tmt_kb", "TMT-KB", 1, 0, false);
    declareFunction(myName, "tmt_owner", "TMT-OWNER", 1, 0, false);
    declareFunction(myName, "tmt_bug_number", "TMT-BUG-NUMBER", 1, 0, false);
    declareFunction(myName, "tmt_creation_date", "TMT-CREATION-DATE", 1, 0, false);
    declareFunction(myName, "tmt_creator", "TMT-CREATOR", 1, 0, false);
    declareFunction(myName, "tmt_workingP", "TMT-WORKING?", 1, 0, false);
    declareFunction(myName, "_csetf_tmt_hl_module", "_CSETF-TMT-HL-MODULE", 2, 0, false);
    declareFunction(myName, "_csetf_tmt_id", "_CSETF-TMT-ID", 2, 0, false);
    declareFunction(myName, "_csetf_tmt_sentence", "_CSETF-TMT-SENTENCE", 2, 0, false);
    declareFunction(myName, "_csetf_tmt_mt", "_CSETF-TMT-MT", 2, 0, false);
    declareFunction(myName, "_csetf_tmt_properties", "_CSETF-TMT-PROPERTIES", 2, 0, false);
    declareFunction(myName, "_csetf_tmt_comment", "_CSETF-TMT-COMMENT", 2, 0, false);
    declareFunction(myName, "_csetf_tmt_kb", "_CSETF-TMT-KB", 2, 0, false);
    declareFunction(myName, "_csetf_tmt_owner", "_CSETF-TMT-OWNER", 2, 0, false);
    declareFunction(myName, "_csetf_tmt_bug_number", "_CSETF-TMT-BUG-NUMBER", 2, 0, false);
    declareFunction(myName, "_csetf_tmt_creation_date", "_CSETF-TMT-CREATION-DATE", 2, 0, false);
    declareFunction(myName, "_csetf_tmt_creator", "_CSETF-TMT-CREATOR", 2, 0, false);
    declareFunction(myName, "_csetf_tmt_workingP", "_CSETF-TMT-WORKING?", 2, 0, false);
    declareFunction(myName, "make_transformation_module_test", "MAKE-TRANSFORMATION-MODULE-TEST", 0, 1, false);
    declareFunction(myName, "transformation_modules_with_transformation_module_tests", "TRANSFORMATION-MODULES-WITH-TRANSFORMATION-MODULE-TESTS", 0, 0, false);
    declareFunction(myName, "transformation_module_tests", "TRANSFORMATION-MODULE-TESTS", 1, 0, false);
    declareFunction(myName, "some_transformation_module_testsP", "SOME-TRANSFORMATION-MODULE-TESTS?", 1, 0, false);
    declareFunction(myName, "transformation_module_test_name", "TRANSFORMATION-MODULE-TEST-NAME", 1, 0, false);
    declareFunction(myName, "transformation_module_test_mt", "TRANSFORMATION-MODULE-TEST-MT", 1, 0, false);
    declareFunction(myName, "transformation_module_test_sentence", "TRANSFORMATION-MODULE-TEST-SENTENCE", 1, 0, false);
    declareFunction(myName, "transformation_module_test_owner", "TRANSFORMATION-MODULE-TEST-OWNER", 1, 0, false);
    declareFunction(myName, "transformation_module_test_comment", "TRANSFORMATION-MODULE-TEST-COMMENT", 1, 0, false);
    declareFunction(myName, "transformation_module_test_kb", "TRANSFORMATION-MODULE-TEST-KB", 1, 0, false);
    declareFunction(myName, "transformation_module_test_workingP", "TRANSFORMATION-MODULE-TEST-WORKING?", 1, 0, false);
    declareFunction(myName, "transformation_module_test_mentions_invalid_constantP", "TRANSFORMATION-MODULE-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
    declareMacro(myName, "define_transformation_module_test", "DEFINE-TRANSFORMATION-MODULE-TEST");
    declareFunction(myName, "define_transformation_module_test_int", "DEFINE-TRANSFORMATION-MODULE-TEST-INT", 12, 0, false);
    declareFunction(myName, "clear_transformation_module_tests", "CLEAR-TRANSFORMATION-MODULE-TESTS", 0, 0, false);
    declareFunction(myName, "run_all_transformation_module_tests", "RUN-ALL-TRANSFORMATION-MODULE-TESTS", 0, 4, false);
    declareFunction(myName, "run_transformation_module_tests_browsable", "RUN-TRANSFORMATION-MODULE-TESTS-BROWSABLE", 1, 2, false);
    declareFunction(myName, "run_transformation_module_tests_blockingP", "RUN-TRANSFORMATION-MODULE-TESTS-BLOCKING?", 1, 2, false);
    declareFunction(myName, "run_transformation_module_tests", "RUN-TRANSFORMATION-MODULE-TESTS", 1, 4, false);
    declareFunction(myName, "run_transformation_module_tests_int", "RUN-TRANSFORMATION-MODULE-TESTS-INT", 5, 0, false);
    declareFunction(myName, "run_transformation_module_test_number_browsable", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER-BROWSABLE", 2, 2, false);
    declareFunction(myName, "run_transformation_module_test_number_blocking", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER-BLOCKING", 2, 2, false);
    declareFunction(myName, "run_transformation_module_test_number", "RUN-TRANSFORMATION-MODULE-TEST-NUMBER", 2, 4, false);
    declareFunction(myName, "run_transformation_module_test", "RUN-TRANSFORMATION-MODULE-TEST", 1, 4, false);
    declareFunction(myName, "run_transformation_module_testP", "RUN-TRANSFORMATION-MODULE-TEST?", 1, 0, false);
    declareFunction(myName, "run_transformation_module_test_query", "RUN-TRANSFORMATION-MODULE-TEST-QUERY", 6, 0, false);
    declareFunction(myName, "transformation_module_test_query_inference", "TRANSFORMATION-MODULE-TEST-QUERY-INFERENCE", 1, 3, false);
    declareFunction(myName, "print_transformation_test_preamble", "PRINT-TRANSFORMATION-TEST-PREAMBLE", 3, 0, false);
    declareFunction(myName, "print_transformation_module_test_result", "PRINT-TRANSFORMATION-MODULE-TEST-RESULT", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_transformation_module_tests_file() {
    $dtp_transformation_module_test$ = defconstant("*DTP-TRANSFORMATION-MODULE-TEST*", $sym0$TRANSFORMATION_MODULE_TEST);
    $transformation_module_tests$ = deflexical("*TRANSFORMATION-MODULE-TESTS*", maybeDefault( $sym45$_TRANSFORMATION_MODULE_TESTS_, $transformation_module_tests$, ()-> (Hashtables.make_hash_table($int46$100, UNPROVIDED, UNPROVIDED))));
    return NIL;
  }

  public static final SubLObject setup_transformation_module_tests_file() {
    // CVS_ID("Id: transformation-module-tests.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_transformation_module_test$.getGlobalValue(), Symbols.symbol_function($sym7$TRANSFORMATION_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$TMT_HL_MODULE, $sym9$_CSETF_TMT_HL_MODULE);
    Structures.def_csetf($sym10$TMT_ID, $sym11$_CSETF_TMT_ID);
    Structures.def_csetf($sym12$TMT_SENTENCE, $sym13$_CSETF_TMT_SENTENCE);
    Structures.def_csetf($sym14$TMT_MT, $sym15$_CSETF_TMT_MT);
    Structures.def_csetf($sym16$TMT_PROPERTIES, $sym17$_CSETF_TMT_PROPERTIES);
    Structures.def_csetf($sym18$TMT_COMMENT, $sym19$_CSETF_TMT_COMMENT);
    Structures.def_csetf($sym20$TMT_KB, $sym21$_CSETF_TMT_KB);
    Structures.def_csetf($sym22$TMT_OWNER, $sym23$_CSETF_TMT_OWNER);
    Structures.def_csetf($sym24$TMT_BUG_NUMBER, $sym25$_CSETF_TMT_BUG_NUMBER);
    Structures.def_csetf($sym26$TMT_CREATION_DATE, $sym27$_CSETF_TMT_CREATION_DATE);
    Structures.def_csetf($sym28$TMT_CREATOR, $sym29$_CSETF_TMT_CREATOR);
    Structures.def_csetf($sym30$TMT_WORKING_, $sym31$_CSETF_TMT_WORKING_);
    Equality.identity($sym0$TRANSFORMATION_MODULE_TEST);
    subl_macro_promotions.declare_defglobal($sym45$_TRANSFORMATION_MODULE_TESTS_);
    access_macros.register_macro_helper($sym58$DEFINE_TRANSFORMATION_MODULE_TEST_INT, $sym59$DEFINE_TRANSFORMATION_MODULE_TEST);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$TRANSFORMATION_MODULE_TEST = makeSymbol("TRANSFORMATION-MODULE-TEST");
  public static final SubLSymbol $sym1$TRANSFORMATION_MODULE_TEST_P = makeSymbol("TRANSFORMATION-MODULE-TEST-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("HL-MODULE"), makeSymbol("ID"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("PROPERTIES"), makeSymbol("COMMENT"), makeSymbol("KB"), makeSymbol("OWNER"), makeSymbol("BUG-NUMBER"), makeSymbol("CREATION-DATE"), makeSymbol("CREATOR"), makeSymbol("WORKING?")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("HL-MODULE"), makeKeyword("ID"), makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("PROPERTIES"), makeKeyword("COMMENT"), makeKeyword("KB"), makeKeyword("OWNER"), makeKeyword("BUG-NUMBER"), makeKeyword("CREATION-DATE"), makeKeyword("CREATOR"), makeKeyword("WORKING?")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("TMT-HL-MODULE"), makeSymbol("TMT-ID"), makeSymbol("TMT-SENTENCE"), makeSymbol("TMT-MT"), makeSymbol("TMT-PROPERTIES"), makeSymbol("TMT-COMMENT"), makeSymbol("TMT-KB"), makeSymbol("TMT-OWNER"), makeSymbol("TMT-BUG-NUMBER"), makeSymbol("TMT-CREATION-DATE"), makeSymbol("TMT-CREATOR"), makeSymbol("TMT-WORKING?")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-TMT-HL-MODULE"), makeSymbol("_CSETF-TMT-ID"), makeSymbol("_CSETF-TMT-SENTENCE"), makeSymbol("_CSETF-TMT-MT"), makeSymbol("_CSETF-TMT-PROPERTIES"), makeSymbol("_CSETF-TMT-COMMENT"), makeSymbol("_CSETF-TMT-KB"), makeSymbol("_CSETF-TMT-OWNER"), makeSymbol("_CSETF-TMT-BUG-NUMBER"), makeSymbol("_CSETF-TMT-CREATION-DATE"), makeSymbol("_CSETF-TMT-CREATOR"), makeSymbol("_CSETF-TMT-WORKING?")});
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$TRANSFORMATION_MODULE_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANSFORMATION-MODULE-TEST-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$TMT_HL_MODULE = makeSymbol("TMT-HL-MODULE");
  public static final SubLSymbol $sym9$_CSETF_TMT_HL_MODULE = makeSymbol("_CSETF-TMT-HL-MODULE");
  public static final SubLSymbol $sym10$TMT_ID = makeSymbol("TMT-ID");
  public static final SubLSymbol $sym11$_CSETF_TMT_ID = makeSymbol("_CSETF-TMT-ID");
  public static final SubLSymbol $sym12$TMT_SENTENCE = makeSymbol("TMT-SENTENCE");
  public static final SubLSymbol $sym13$_CSETF_TMT_SENTENCE = makeSymbol("_CSETF-TMT-SENTENCE");
  public static final SubLSymbol $sym14$TMT_MT = makeSymbol("TMT-MT");
  public static final SubLSymbol $sym15$_CSETF_TMT_MT = makeSymbol("_CSETF-TMT-MT");
  public static final SubLSymbol $sym16$TMT_PROPERTIES = makeSymbol("TMT-PROPERTIES");
  public static final SubLSymbol $sym17$_CSETF_TMT_PROPERTIES = makeSymbol("_CSETF-TMT-PROPERTIES");
  public static final SubLSymbol $sym18$TMT_COMMENT = makeSymbol("TMT-COMMENT");
  public static final SubLSymbol $sym19$_CSETF_TMT_COMMENT = makeSymbol("_CSETF-TMT-COMMENT");
  public static final SubLSymbol $sym20$TMT_KB = makeSymbol("TMT-KB");
  public static final SubLSymbol $sym21$_CSETF_TMT_KB = makeSymbol("_CSETF-TMT-KB");
  public static final SubLSymbol $sym22$TMT_OWNER = makeSymbol("TMT-OWNER");
  public static final SubLSymbol $sym23$_CSETF_TMT_OWNER = makeSymbol("_CSETF-TMT-OWNER");
  public static final SubLSymbol $sym24$TMT_BUG_NUMBER = makeSymbol("TMT-BUG-NUMBER");
  public static final SubLSymbol $sym25$_CSETF_TMT_BUG_NUMBER = makeSymbol("_CSETF-TMT-BUG-NUMBER");
  public static final SubLSymbol $sym26$TMT_CREATION_DATE = makeSymbol("TMT-CREATION-DATE");
  public static final SubLSymbol $sym27$_CSETF_TMT_CREATION_DATE = makeSymbol("_CSETF-TMT-CREATION-DATE");
  public static final SubLSymbol $sym28$TMT_CREATOR = makeSymbol("TMT-CREATOR");
  public static final SubLSymbol $sym29$_CSETF_TMT_CREATOR = makeSymbol("_CSETF-TMT-CREATOR");
  public static final SubLSymbol $sym30$TMT_WORKING_ = makeSymbol("TMT-WORKING?");
  public static final SubLSymbol $sym31$_CSETF_TMT_WORKING_ = makeSymbol("_CSETF-TMT-WORKING?");
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
  public static final SubLSymbol $sym45$_TRANSFORMATION_MODULE_TESTS_ = makeSymbol("*TRANSFORMATION-MODULE-TESTS*");
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
  public static final SubLSymbol $sym58$DEFINE_TRANSFORMATION_MODULE_TEST_INT = makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST-INT");
  public static final SubLSymbol $sym59$DEFINE_TRANSFORMATION_MODULE_TEST = makeSymbol("DEFINE-TRANSFORMATION-MODULE-TEST");
  public static final SubLSymbol $sym60$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym61$CYC_TEST_KB_P = makeSymbol("CYC-TEST-KB-P");
  public static final SubLSymbol $sym62$INFERENCE_TEST_OWNER_P = makeSymbol("INFERENCE-TEST-OWNER-P");
  public static final SubLSymbol $sym63$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym64$UNIVERSAL_DATE_P = makeSymbol("UNIVERSAL-DATE-P");
  public static final SubLSymbol $sym65$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $kw66$STANDARD = makeKeyword("STANDARD");
  public static final SubLSymbol $sym67$CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");
  public static final SubLSymbol $kw68$TERSE = makeKeyword("TERSE");
  public static final SubLSymbol $kw69$TMT = makeKeyword("TMT");
  public static final SubLSymbol $kw70$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $kw71$NOT_RUN = makeKeyword("NOT-RUN");
  public static final SubLSymbol $kw72$INVALID = makeKeyword("INVALID");
  public static final SubLSymbol $kw73$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $kw74$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym75$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $kw76$FAILURE = makeKeyword("FAILURE");
  public static final SubLSymbol $kw77$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");
  public static final SubLSymbol $kw78$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $kw79$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw80$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");
  public static final SubLSymbol $kw81$BLOCK_ = makeKeyword("BLOCK?");
  public static final SubLList $list82 = list(makeKeyword("PROBABLY-APPROXIMATELY-DONE"), ONE_INTEGER, makeKeyword("MAX-TIME"), NIL);
  public static final SubLString $str83$___S__S____ = makeString("~&~S ~S -> ");
  public static final SubLSymbol $kw84$POST_BUILD = makeKeyword("POST-BUILD");
  public static final SubLString $str85$Unknown_output_format__A = makeString("Unknown output format ~A");
  public static final SubLString $str86$_S__ = makeString("~S~%");
  public static final SubLString $str87$_S__TMT___S__S___OWNER__S__ = makeString("~S :TMT (~S ~S) :OWNER ~S~%");

  //// Initializers

  public void declareFunctions() {
    declare_transformation_module_tests_file();
  }

  public void initializeVariables() {
    init_transformation_module_tests_file();
  }

  public void runTopLevelForms() {
    setup_transformation_module_tests_file();
  }

}
