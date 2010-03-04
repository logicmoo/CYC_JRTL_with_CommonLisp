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

package  com.cyc.cycjava.cycl.cyc_testing.kb_content_test;

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
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cyc_testing.ctest_utils;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.subl_macros;

public  final class kct_utils extends SubLTranslatedFile {

  //// Constructor

  private kct_utils() {}
  public static final SubLFile me = new kct_utils();
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils";

  //// Definitions

  @SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 792) 
  public static final SubLObject initialize_kct() {
    ctest_utils.initialize_ctest();
    return T;
  }

  @SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1132) 
  public static SubLSymbol $kct_test_execution_type$ = null;

  @SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1273) 
  public static SubLSymbol $kct_collection_execution_type$ = null;

  @SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1330) 
  public static SubLSymbol $kct_default_error_notify_cyclist$ = null;

  @SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1391) 
  public static SubLSymbol $kct_use_sampling_mode$ = null;

  @SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1441) 
  public static SubLSymbol $kct_debug$ = null;

  /** A representative sample of the KB constants that KCT depends on. */
  @SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1479) 
  private static SubLSymbol $kct_core_constants$ = null;

  /** Determines whether the portion of the KB necessary for KCTs is loaded. */
  @SubL(source = "cycl/cyc-testing/kb-content-test/kct-utils.lisp", position = 1701) 
  public static final SubLObject initialize_kct_kb_feature() {
    if ((NIL != list_utilities.every_in_list($sym3$VALID_CONSTANT_, $kct_core_constants$.getGlobalValue(), UNPROVIDED))) {
      Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32161");
    } else {
      kb_control_vars.unset_kct_kb_loaded();
    }
    return kb_control_vars.kct_kb_loaded_p();
  }

  public static final SubLObject declare_kct_utils_file() {
    declareFunction(myName, "initialize_kct", "INITIALIZE-KCT", 0, 0, false);
    declareFunction(myName, "initialize_kct_kb_feature", "INITIALIZE-KCT-KB-FEATURE", 0, 0, false);
    //declareFunction(myName, "kct_query_specification", "KCT-QUERY-SPECIFICATION", 1, 1, false);
    //declareFunction(myName, "kct_initialize", "KCT-INITIALIZE", 0, 0, false);
    //declareFunction(myName, "kct_test_spec_p", "KCT-TEST-SPEC-P", 1, 1, false);
    //declareFunction(myName, "kct_test_spec_permissive_p", "KCT-TEST-SPEC-PERMISSIVE-P", 1, 0, false);
    //declareFunction(myName, "kct_test_collection_p", "KCT-TEST-COLLECTION-P", 1, 1, false);
    //declareFunction(myName, "kct_asserted_test_collections", "KCT-ASSERTED-TEST-COLLECTIONS", 1, 1, false);
    //declareFunction(myName, "kct_comments", "KCT-COMMENTS", 1, 1, false);
    //declareFunction(myName, "kct_test_collection_instances", "KCT-TEST-COLLECTION-INSTANCES", 1, 1, false);
    //declareFunction(myName, "kct_responsible_cyclists", "KCT-RESPONSIBLE-CYCLISTS", 1, 1, false);
    //declareFunction(myName, "kct_collection_responsible_cyclists", "KCT-COLLECTION-RESPONSIBLE-CYCLISTS", 1, 1, false);
    //declareFunction(myName, "kct_test_metrics", "KCT-TEST-METRICS", 1, 1, false);
    //declareFunction(myName, "kct_exact_set_of_binding_sets", "KCT-EXACT-SET-OF-BINDING-SETS", 1, 1, false);
    //declareFunction(myName, "kct_exact_binding_sets", "KCT-EXACT-BINDING-SETS", 1, 1, false);
    //declareFunction(myName, "kct_wanted_binding_sets", "KCT-WANTED-BINDING-SETS", 1, 1, false);
    //declareFunction(myName, "kct_unwanted_binding_sets", "KCT-UNWANTED-BINDING-SETS", 1, 1, false);
    //declareFunction(myName, "kct_bindings_unimportantP", "KCT-BINDINGS-UNIMPORTANT?", 1, 1, false);
    //declareFunction(myName, "kct_binding_sets_cardinality", "KCT-BINDING-SETS-CARDINALITY", 1, 1, false);
    //declareFunction(myName, "kct_binding_sets_min_cardinality", "KCT-BINDING-SETS-MIN-CARDINALITY", 1, 1, false);
    //declareFunction(myName, "kct_binding_sets_max_cardinality", "KCT-BINDING-SETS-MAX-CARDINALITY", 1, 1, false);
    //declareFunction(myName, "kct_defining_mt", "KCT-DEFINING-MT", 1, 0, false);
    //declareFunction(myName, "kct_test_runnableP", "KCT-TEST-RUNNABLE?", 1, 0, false);
    //declareFunction(myName, "kct_test_known_unrunnableP", "KCT-TEST-KNOWN-UNRUNNABLE?", 1, 0, false);
    //declareFunction(myName, "why_not_kct_test_valid", "WHY-NOT-KCT-TEST-VALID", 1, 0, false);
    //declareFunction(myName, "categorize_kct_invalidity_reasons", "CATEGORIZE-KCT-INVALIDITY-REASONS", 0, 0, false);
    //declareFunction(myName, "why_not_kct_test_collection_valid", "WHY-NOT-KCT-TEST-COLLECTION-VALID", 1, 0, false);
    //declareFunction(myName, "printable_execution_mode", "PRINTABLE-EXECUTION-MODE", 1, 0, false);
    //declareFunction(myName, "printable_execution_type", "PRINTABLE-EXECUTION-TYPE", 1, 0, false);
    //declareFunction(myName, "kct_default_for_parameter", "KCT-DEFAULT-FOR-PARAMETER", 1, 0, false);
    //declareFunction(myName, "kct_new_hlmt", "KCT-NEW-HLMT", 3, 0, false);
    //declareFunction(myName, "kct_transform_query_results_for_comparison", "KCT-TRANSFORM-QUERY-RESULTS-FOR-COMPARISON", 1, 0, false);
    //declareFunction(myName, "canonicalize_query_bindings_int", "CANONICALIZE-QUERY-BINDINGS-INT", 1, 0, false);
    //declareFunction(myName, "ncanonicalize_query_bindings_int", "NCANONICALIZE-QUERY-BINDINGS-INT", 1, 0, false);
    //declareFunction(myName, "ncanonicalize_query_binding_int", "NCANONICALIZE-QUERY-BINDING-INT", 1, 0, false);
    //declareFunction(myName, "kct_transform_set_of_binding_sets", "KCT-TRANSFORM-SET-OF-BINDING-SETS", 2, 0, false);
    //declareFunction(myName, "kct_formula_if_assertion", "KCT-FORMULA-IF-ASSERTION", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_kct_utils_file() {
    $kct_test_execution_type$ = defconstant("*KCT-TEST-EXECUTION-TYPE*", $str0$I);
    $kct_collection_execution_type$ = defconstant("*KCT-COLLECTION-EXECUTION-TYPE*", $str1$C);
    $kct_default_error_notify_cyclist$ = defparameter("*KCT-DEFAULT-ERROR-NOTIFY-CYCLIST*", NIL);
    $kct_use_sampling_mode$ = defparameter("*KCT-USE-SAMPLING-MODE*", NIL);
    $kct_debug$ = defparameter("*KCT-DEBUG*", NIL);
    $kct_core_constants$ = deflexical("*KCT-CORE-CONSTANTS*", $list2);
    return NIL;
  }

  public static final SubLObject setup_kct_utils_file() {
    // CVS_ID("Id: kct-utils.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$I = makeString("I");
  public static final SubLString $str1$C = makeString("C");
  public static final SubLList $list2 = list(constant_handles.reader_make_constant_shell(makeString("TestVocabularyMt")), constant_handles.reader_make_constant_shell(makeString("testQuerySpecification")));
  public static final SubLSymbol $sym3$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");
  public static final SubLSymbol $sym4$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLObject $const5$testQuerySpecification = constant_handles.reader_make_constant_shell(makeString("testQuerySpecification"));
  public static final SubLSymbol $kw6$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const7$KBContentTest_FullySpecified = constant_handles.reader_make_constant_shell(makeString("KBContentTest-FullySpecified"));
  public static final SubLObject $const8$KBContentTest = constant_handles.reader_make_constant_shell(makeString("KBContentTest"));
  public static final SubLObject $const9$KBContentTestSpecificationType = constant_handles.reader_make_constant_shell(makeString("KBContentTestSpecificationType"));
  public static final SubLSymbol $sym10$FORT_P = makeSymbol("FORT-P");
  public static final SubLObject $const11$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym12$KCT_TEST_COLLECTION_P = makeSymbol("KCT-TEST-COLLECTION-P");
  public static final SubLObject $const13$comment = constant_handles.reader_make_constant_shell(makeString("comment"));
  public static final SubLSymbol $sym14$COLLECTION_P = makeSymbol("COLLECTION-P");
  public static final SubLSymbol $kw15$WHO = makeKeyword("WHO");
  public static final SubLObject $const16$testResponsibleCyclist = constant_handles.reader_make_constant_shell(makeString("testResponsibleCyclist"));
  public static final SubLList $list17 = list(makeKeyword("WHO"));
  public static final SubLObject $const18$testCollectionCyclistResponsible = constant_handles.reader_make_constant_shell(makeString("testCollectionCyclistResponsible"));
  public static final SubLObject $const19$testMetricsToGather = constant_handles.reader_make_constant_shell(makeString("testMetricsToGather"));
  public static final SubLObject $const20$testAnswersCycL_Exact = constant_handles.reader_make_constant_shell(makeString("testAnswersCycL-Exact"));
  public static final SubLObject $const21$testAnswersCycL_Wanted = constant_handles.reader_make_constant_shell(makeString("testAnswersCycL-Wanted"));
  public static final SubLObject $const22$testAnswersCycL_NotWanted = constant_handles.reader_make_constant_shell(makeString("testAnswersCycL-NotWanted"));
  public static final SubLObject $const23$testAnswersCycLUnimportant = constant_handles.reader_make_constant_shell(makeString("testAnswersCycLUnimportant"));
  public static final SubLObject $const24$testAnswers_Cardinality_Exact = constant_handles.reader_make_constant_shell(makeString("testAnswers-Cardinality-Exact"));
  public static final SubLObject $const25$testAnswers_Cardinality_Min = constant_handles.reader_make_constant_shell(makeString("testAnswers-Cardinality-Min"));
  public static final SubLObject $const26$testAnswers_Cardinality_Max = constant_handles.reader_make_constant_shell(makeString("testAnswers-Cardinality-Max"));
  public static final SubLList $list27 = list(new SubLObject[] {constant_handles.reader_make_constant_shell(makeString("testAnswersCycL-Exact")), constant_handles.reader_make_constant_shell(makeString("testAnswersCycL-Wanted")), constant_handles.reader_make_constant_shell(makeString("testAnswersCycL-NotWanted")), constant_handles.reader_make_constant_shell(makeString("testAnswersCycLUnimportant")), constant_handles.reader_make_constant_shell(makeString("testAnswerSupport-Wanted")), constant_handles.reader_make_constant_shell(makeString("testAnswerSupport-NotWanted")), constant_handles.reader_make_constant_shell(makeString("testAnswerSupportedByHLSupportModule-Wanted")), constant_handles.reader_make_constant_shell(makeString("testAnswerSupportedByHLSupportModule-NotWanted")), constant_handles.reader_make_constant_shell(makeString("testResponsibleCyclist")), constant_handles.reader_make_constant_shell(makeString("testQuerySpecification"))});
  public static final SubLSymbol $sym28$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const29$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $kw30$GAF = makeKeyword("GAF");
  public static final SubLObject $const31$TestVocabularyMt = constant_handles.reader_make_constant_shell(makeString("TestVocabularyMt"));
  public static final SubLSymbol $kw32$SEVERE = makeKeyword("SEVERE");
  public static final SubLString $str33$ = makeString("");
  public static final SubLString $str34$___A_is_not_a___KBContentTest_Ful = makeString("~%~A is not a #$KBContentTest-FullySpecified.");
  public static final SubLSymbol $kw35$NOT_A_TEST_SPECIFICATION = makeKeyword("NOT-A-TEST-SPECIFICATION");
  public static final SubLString $str36$___A_does_not_have_a_valid_arg2_f = makeString("~%~A does not have a valid arg2 for #$testQuerySpecification.");
  public static final SubLSymbol $kw37$NO_VALID_QUERY = makeKeyword("NO-VALID-QUERY");
  public static final SubLObject $const38$testAnswerSupport_Wanted = constant_handles.reader_make_constant_shell(makeString("testAnswerSupport-Wanted"));
  public static final SubLObject $const39$testAnswerSupport_NotWanted = constant_handles.reader_make_constant_shell(makeString("testAnswerSupport-NotWanted"));
  public static final SubLObject $const40$testAnswerSupportedByHLSupportMod = constant_handles.reader_make_constant_shell(makeString("testAnswerSupportedByHLSupportModule-Wanted"));
  public static final SubLObject $const41$testAnswerSupportedByHLSupportMod = constant_handles.reader_make_constant_shell(makeString("testAnswerSupportedByHLSupportModule-NotWanted"));
  public static final SubLString $str42$___A_has_no_stated_test_expectati = makeString("~%~A has no stated test expectation.");
  public static final SubLSymbol $kw43$NO_TEST_EXPECTATION = makeKeyword("NO-TEST-EXPECTATION");
  public static final SubLString $str44$___A_s_exact_answer_should_includ = makeString("~%~A's exact answer should include only #$ELInferenceBindingSets, but these are not: ");
  public static final SubLSymbol $kw45$EXACT_ANSWER_CONTAINS_MALFORMED_INFERENCE_BINDING_SET = makeKeyword("EXACT-ANSWER-CONTAINS-MALFORMED-INFERENCE-BINDING-SET");
  public static final SubLString $str46$_A_ = makeString("~A ");
  public static final SubLString $str47$___A_s_wanted_answer_should_be_an = makeString("~%~A's wanted answer should be an #$ELInferenceBindingSet but isn't: ");
  public static final SubLSymbol $kw48$WANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET = makeKeyword("WANTED-ANSWER-IS-NOT-AN-INFERENCE-BINDING-SET");
  public static final SubLString $str49$___A_s_unwanted_answer_should_be_ = makeString("~%~A's unwanted answer should be an #$ELInferenceBindingSet but isn't: ");
  public static final SubLSymbol $kw50$UNWANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET = makeKeyword("UNWANTED-ANSWER-IS-NOT-AN-INFERENCE-BINDING-SET");
  public static final SubLSymbol $kw51$PROBLEM = makeKeyword("PROBLEM");
  public static final SubLString $str52$___A_does_not_have_a_responsible_ = makeString("~%~A does not have a responsible Cyclist.");
  public static final SubLSymbol $kw53$NO_RESPONSIBLE_CYCLIST = makeKeyword("NO-RESPONSIBLE-CYCLIST");
  public static final SubLSymbol $kw54$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw55$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw56$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym57$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw58$ERROR = makeKeyword("ERROR");
  public static final SubLString $str59$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym60$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw61$CERROR = makeKeyword("CERROR");
  public static final SubLString $str62$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw63$WARN = makeKeyword("WARN");
  public static final SubLString $str64$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const65$AreteQuery = constant_handles.reader_make_constant_shell(makeString("AreteQuery"));
  public static final SubLString $str66$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLList $list67 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
  public static final SubLString $str68$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLString $str69$___A_is_not_a___KBContentTestSpec = makeString("~%~A is not a #$KBContentTestSpecificationType!");
  public static final SubLString $str70$___A_has_no_responsible_Cyclists_ = makeString("~%~A has no responsible Cyclists.");
  public static final SubLString $str71$___A_has_no_instances_ = makeString("~%~A has no instances.");
  public static final SubLString $str72$Sampling = makeString("Sampling");
  public static final SubLString $str73$Hypothesize = makeString("Hypothesize");
  public static final SubLString $str74$Simple = makeString("Simple");
  public static final SubLString $str75$Test_Set = makeString("Test Set");
  public static final SubLString $str76$Individual_Test = makeString("Individual Test");
  public static final SubLObject $const77$CycArchitectureMt = constant_handles.reader_make_constant_shell(makeString("CycArchitectureMt"));
  public static final SubLObject $const78$CycKBContentTestFramework = constant_handles.reader_make_constant_shell(makeString("CycKBContentTestFramework"));
  public static final SubLObject $const79$defaultSoftwareParameterValueInSo = constant_handles.reader_make_constant_shell(makeString("defaultSoftwareParameterValueInSoftwareObject"));
  public static final SubLObject $const80$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLObject $const81$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLSymbol $sym82$CANONICALIZE_QUERY_BINDINGS_INT = makeSymbol("CANONICALIZE-QUERY-BINDINGS-INT");
  public static final SubLSymbol $sym83$NCANONICALIZE_QUERY_BINDING_INT = makeSymbol("NCANONICALIZE-QUERY-BINDING-INT");
  public static final SubLSymbol $sym84$TERM__ = makeSymbol("TERM-<");
  public static final SubLSymbol $sym85$VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");
  public static final SubLList $list86 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

  //// Initializers

  public void declareFunctions() {
    declare_kct_utils_file();
  }

  public void initializeVariables() {
    init_kct_utils_file();
  }

  public void runTopLevelForms() {
    setup_kct_utils_file();
  }

}
