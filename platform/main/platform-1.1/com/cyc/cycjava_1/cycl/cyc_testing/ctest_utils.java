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
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_identifier;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;

public  final class ctest_utils extends SubLTranslatedFile {

  //// Constructor

  private ctest_utils() {}
  public static final SubLFile me = new ctest_utils();
  public static final String myName = "com.cyc.cycjava_1.cycl.cyc_testing.ctest_utils";

  //// Definitions

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 779) 
  public static SubLSymbol $default_email_notify_style_id$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1112) 
  public static SubLSymbol $default_test_id$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1156) 
  public static SubLSymbol $default_string_binding_set$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1211) 
  public static SubLSymbol $default_binding_set$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1259) 
  public static SubLSymbol $default_binding_set2$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1308) 
  public static SubLSymbol $default_set_of_binding_sets$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1364) 
  public static SubLSymbol $default_set_of_binding_sets2$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1421) 
  public static SubLSymbol $default_set_of_binding_sets3$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1478) 
  public static SubLSymbol $default_module_sentence$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1530) 
  public static SubLSymbol $default_module_mt$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1576) 
  public static SubLSymbol $default_module_mt2$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1623) 
  public static SubLSymbol $default_dependency_test_id$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1678) 
  public static SubLSymbol $default_dependency_test_id2$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1734) 
  public static SubLSymbol $default_isa_id$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1777) 
  public static SubLSymbol $default_isa_id2$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1821) 
  public static SubLSymbol $default_test_query$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1868) 
  public static SubLSymbol $default_test_mt$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1912) 
  public static SubLSymbol $default_collection_id$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 1962) 
  public static final SubLObject initialize_ctest() {
    $default_email_notify_style_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($const18$TestResultNotification_EmailBrief)));
    $default_test_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($const19$TKBTemplateTestForMissingMt)));
    $default_string_binding_set$.setGlobalValue($str20$___TheSet____ELInferenceBindingFn);
    $default_binding_set$.setGlobalValue(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym21$_SOMETHING, $str22$A_SOMETHING))));
    $default_binding_set2$.setGlobalValue(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym23$_OTHERTHING, $str24$ANOTHER_THING))));
    $default_set_of_binding_sets$.setGlobalValue(bindings.make_kb_set_of_binding_sets(list(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym21$_SOMETHING, $str22$A_SOMETHING))))));
    $default_set_of_binding_sets2$.setGlobalValue(bindings.make_kb_set_of_binding_sets(list(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym23$_OTHERTHING, $str24$ANOTHER_THING))))));
    $default_set_of_binding_sets3$.setGlobalValue(bindings.make_kb_set_of_binding_sets(list(bindings.make_kb_binding_set(list(bindings.make_kb_binding($sym25$_ANOTHERTHING, $str26$YET_ANOTHER_THING))))));
    $default_module_sentence$.setGlobalValue($list27);
    $default_module_mt$.setGlobalValue($const28$BaseKB);
    $default_module_mt2$.setGlobalValue($const29$UniversalVocabularyMt);
    $default_dependency_test_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($const30$TKBTemplateTestForMissingExplanat)));
    $default_dependency_test_id2$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($const31$TKBTemplateTestForMissingExample)));
    $default_isa_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($const32$TKBTemplateIntegrityTest)));
    $default_isa_id2$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($const33$TKB_RTVQueries)));
    $default_test_query$.setGlobalValue($list34);
    $default_test_mt$.setGlobalValue($const28$BaseKB);
    $default_collection_id$.setGlobalValue(string_utilities.to_string(constants_high.constant_external_id($const32$TKBTemplateIntegrityTest)));
    return T;
  }

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 3839) 
  public static SubLSymbol $ctest_output_formats$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 3903) 
  public static SubLSymbol $ctest_output_styles$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 3981) 
  public static SubLSymbol $max_test_retry_time$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4136) 
  public static SubLSymbol $csc_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4321) 
  public static SubLSymbol $max_image_type_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4392) 
  public static SubLSymbol $max_image_version_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4440) 
  public static SubLSymbol $max_system_version_num_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4493) 
  public static SubLSymbol $max_kb_number_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4537) 
  public static SubLSymbol $mc_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4716) 
  public static SubLSymbol $max_machine_name_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4790) 
  public static SubLSymbol $max_machine_type_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4837) 
  public static SubLSymbol $max_machine_hardware_type_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4893) 
  public static SubLSymbol $max_os_type_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 4935) 
  public static SubLSymbol $te_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5114) 
  public static SubLSymbol $max_test_id_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5183) 
  public static SubLSymbol $max_test_type_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5227) 
  public static SubLSymbol $max_date_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5266) 
  public static SubLSymbol $max_test_status_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5312) 
  public static SubLSymbol $max_test_execution_type_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5365) 
  public static SubLSymbol $ctest_test_types$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5447) 
  public static SubLSymbol $ctest_test_statuses$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5582) 
  public static SubLSymbol $ctest_success_status$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5637) 
  public static SubLSymbol $ctest_failure_status$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5691) 
  public static SubLSymbol $ctest_dfailure_status$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5747) 
  public static SubLSymbol $ctest_error_status$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5797) 
  public static SubLSymbol $ctest_skipped_status$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5851) 
  public static SubLSymbol $ctest_problem_status$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5905) 
  public static SubLSymbol $kct_test_type$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 5954) 
  public static SubLSymbol $tcmr_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6191) 
  public static SubLSymbol $max_metric_id_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6297) 
  public static SubLSymbol $tmr_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6489) 
  public static SubLSymbol $tem_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6714) 
  public static SubLSymbol $kcte_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6924) 
  public static SubLSymbol $max_exec_type_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 6993) 
  public static SubLSymbol $collection_execution_type$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7068) 
  public static SubLSymbol $individual_execution_type$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7279) 
  public static SubLSymbol $kctem_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7515) 
  public static SubLSymbol $max_exec_mode_len$ = null;

  /** Tests having query formulas which are in the form of an implication, which are run by locating existing objects in the KB that satisfy the LHS, substituting them into the RHS, and performing a query using the substituted RHS. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7584) 
  public static SubLSymbol $sampling_execution_mode$ = null;

  /** Tests having query formulas which are in the form of an implication, which are run by hypothesizing terms to satisfy the LHS, substituting them into the RHS, and performing a query using the substituted RHS. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 7887) 
  public static SubLSymbol $hypothesize_execution_mode$ = null;

  /** Tests having query formulas which are not in the form of an implication, which are run by performing a query using the query formula. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 8153) 
  public static SubLSymbol $simple_execution_mode$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 8542) 
  public static SubLSymbol $kctc_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 8746) 
  public static SubLSymbol $kcts_project_desc$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 8860) 
  public static SubLSymbol $kctcc_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9103) 
  public static SubLSymbol $max_collection_type_len$ = null;

  /** A C collection type denotes a collection of KB Content Tests. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9178) 
  public static SubLSymbol $collection_test_collection_type$ = null;

  /** An S collection type denotes a system wide collection of KB Content Tests. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9304) 
  public static SubLSymbol $system_test_collection_type$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9599) 
  public static SubLSymbol $tcrc_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9847) 
  public static SubLSymbol $max_cyclist_id_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9919) 
  public static SubLSymbol $max_email_notify_style_id_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 9976) 
  public static SubLSymbol $kctccbs_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10242) 
  public static SubLSymbol $max_binding_designation_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10321) 
  public static SubLSymbol $kct_exact_binding_set_designation$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10418) 
  public static SubLSymbol $kct_wanted_binding_set_designation$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10480) 
  public static SubLSymbol $kct_unwanted_binding_set_designation$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10544) 
  public static SubLSymbol $kct_unimportant_binding_set_designation$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10611) 
  public static SubLSymbol $kct_binding_set_designations$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10691) 
  public static SubLSymbol $kctcas_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 10952) 
  public static SubLSymbol $max_support_type_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11024) 
  public static SubLSymbol $max_support_designation_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11077) 
  public static SubLSymbol $ctest_support_types$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11168) 
  public static SubLSymbol $ctest_support_designations$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11233) 
  public static SubLSymbol $kct_wanted_support_designation$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11339) 
  public static SubLSymbol $kct_unwanted_support_designation$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11399) 
  public static SubLSymbol $kct_support_support_type$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11451) 
  public static SubLSymbol $kct_module_support_type$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11502) 
  public static SubLSymbol $ipc_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11694) 
  public static SubLSymbol $max_inference_param_id_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11774) 
  public static SubLSymbol $tmc_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 11989) 
  public static SubLSymbol $max_test_metric_type_len$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12065) 
  public static SubLSymbol $ctest_metric_types$ = null;

  /** Type designator for test collection level metrics. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12144) 
  public static SubLSymbol $ctest_collection_level_metric$ = null;

  /** Type designator for query level metrics. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12258) 
  public static SubLSymbol $ctest_query_level_metric$ = null;

  /** Type designator for query level metrics. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12355) 
  public static SubLSymbol $ctest_binding_level_metric$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12455) 
  public static SubLSymbol $tdc_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12644) 
  public static SubLSymbol $kctcg_table_name$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 12887) 
  public static SubLSymbol $kctci_table_name$ = null;

  /** If T, we are in a test running environment in which we are storing to the Cyc Test Repository. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 13127) 
  public static SubLSymbol $ctest_storing_p$ = null;

  /** If T, we maintain, in the repository, a versioned history of how tests were configured.
   This was the default until October 2004, but was disabled due to problems with completing 
   the storage of config info within the 4-hour SDBC timeout. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 13413) 
  public static SubLSymbol $ctest_storing_configs_p$ = null;

  /** NIL or a list of #$IndividualTestMetric instances.  Metrics in this list will be collected
   for every individual test, whether the test is configured to collect them or not. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 13714) 
  public static SubLSymbol $ctest_required_metrics$ = null;

  /** Index of guids for tests and test collections which are currently being 
   constructed.  This will help avoid tests in the same collection from attempting to
   insert config records for the same test or same parent collection when that test
   and/or test collection is currently being saved to the Repository. */
  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 13946) 
  public static SubLSymbol $tests_in_process$ = null;

  @SubL(source = "cycl/cyc-testing/ctest-utils.lisp", position = 14613) 
  private static SubLSymbol $ctest_field_maxima$ = null;

  public static final SubLObject declare_ctest_utils_file() {
    declareFunction(myName, "initialize_ctest", "INITIALIZE-CTEST", 0, 0, false);
    declareFunction(myName, "kct_valid_execution_type", "KCT-VALID-EXECUTION-TYPE", 1, 0, false);
    declareFunction(myName, "kct_valid_execution_mode", "KCT-VALID-EXECUTION-MODE", 1, 0, false);
    declareFunction(myName, "kct_valid_collection_type", "KCT-VALID-COLLECTION-TYPE", 1, 0, false);
    declareFunction(myName, "add_in_process_test", "ADD-IN-PROCESS-TEST", 1, 0, false);
    declareFunction(myName, "find_in_process_test", "FIND-IN-PROCESS-TEST", 1, 0, false);
    declareFunction(myName, "ctest_truncate_value_for_field", "CTEST-TRUNCATE-VALUE-FOR-FIELD", 2, 0, false);
    declareFunction(myName, "valid_ctest_output_format", "VALID-CTEST-OUTPUT-FORMAT", 1, 0, false);
    declareFunction(myName, "valid_ctest_output_style", "VALID-CTEST-OUTPUT-STYLE", 1, 0, false);
    declareFunction(myName, "valid_ctest_type", "VALID-CTEST-TYPE", 1, 0, false);
    declareFunction(myName, "valid_ctest_status", "VALID-CTEST-STATUS", 1, 0, false);
    declareFunction(myName, "valid_ctest_support_type", "VALID-CTEST-SUPPORT-TYPE", 1, 0, false);
    declareFunction(myName, "valid_ctest_support_designation", "VALID-CTEST-SUPPORT-DESIGNATION", 1, 0, false);
    declareFunction(myName, "valid_ctest_suppport_tv", "VALID-CTEST-SUPPPORT-TV", 1, 0, false);
    declareFunction(myName, "valid_ctest_binding_designation", "VALID-CTEST-BINDING-DESIGNATION", 1, 0, false);
    declareFunction(myName, "add_leading_and_trailing_text", "ADD-LEADING-AND-TRAILING-TEXT", 3, 0, false);
    declareFunction(myName, "escape_double_quotes", "ESCAPE-DOUBLE-QUOTES", 1, 0, false);
    declareFunction(myName, "kct_test_metric_from_keyword", "KCT-TEST-METRIC-FROM-KEYWORD", 1, 0, false);
    declareFunction(myName, "kct_collection_test_metric_from_keyword", "KCT-COLLECTION-TEST-METRIC-FROM-KEYWORD", 1, 0, false);
    declareFunction(myName, "kct_keyword_from_test_metric", "KCT-KEYWORD-FROM-TEST-METRIC", 1, 0, false);
    declareFunction(myName, "ctest_kb_test_metric_p", "CTEST-KB-TEST-METRIC-P", 1, 0, false);
    declareFunction(myName, "ctest_unsupported_metricP", "CTEST-UNSUPPORTED-METRIC?", 1, 0, false);
    declareFunction(myName, "ctest_all_kb_test_metric_constants", "CTEST-ALL-KB-TEST-METRIC-CONSTANTS", 0, 0, false);
    declareFunction(myName, "ctest_all_kb_collection_test_metric_constants", "CTEST-ALL-KB-COLLECTION-TEST-METRIC-CONSTANTS", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_ctest_utils_file() {
    $default_email_notify_style_id$ = deflexical("*DEFAULT-EMAIL-NOTIFY-STYLE-ID*", maybeDefault( $sym0$_DEFAULT_EMAIL_NOTIFY_STYLE_ID_, $default_email_notify_style_id$, NIL));
    $default_test_id$ = deflexical("*DEFAULT-TEST-ID*", maybeDefault( $sym1$_DEFAULT_TEST_ID_, $default_test_id$, NIL));
    $default_string_binding_set$ = deflexical("*DEFAULT-STRING-BINDING-SET*", maybeDefault( $sym2$_DEFAULT_STRING_BINDING_SET_, $default_string_binding_set$, NIL));
    $default_binding_set$ = deflexical("*DEFAULT-BINDING-SET*", maybeDefault( $sym3$_DEFAULT_BINDING_SET_, $default_binding_set$, NIL));
    $default_binding_set2$ = deflexical("*DEFAULT-BINDING-SET2*", maybeDefault( $sym4$_DEFAULT_BINDING_SET2_, $default_binding_set2$, NIL));
    $default_set_of_binding_sets$ = deflexical("*DEFAULT-SET-OF-BINDING-SETS*", maybeDefault( $sym5$_DEFAULT_SET_OF_BINDING_SETS_, $default_set_of_binding_sets$, NIL));
    $default_set_of_binding_sets2$ = deflexical("*DEFAULT-SET-OF-BINDING-SETS2*", maybeDefault( $sym6$_DEFAULT_SET_OF_BINDING_SETS2_, $default_set_of_binding_sets2$, NIL));
    $default_set_of_binding_sets3$ = deflexical("*DEFAULT-SET-OF-BINDING-SETS3*", maybeDefault( $sym7$_DEFAULT_SET_OF_BINDING_SETS3_, $default_set_of_binding_sets3$, NIL));
    $default_module_sentence$ = deflexical("*DEFAULT-MODULE-SENTENCE*", maybeDefault( $sym8$_DEFAULT_MODULE_SENTENCE_, $default_module_sentence$, NIL));
    $default_module_mt$ = deflexical("*DEFAULT-MODULE-MT*", maybeDefault( $sym9$_DEFAULT_MODULE_MT_, $default_module_mt$, NIL));
    $default_module_mt2$ = deflexical("*DEFAULT-MODULE-MT2*", maybeDefault( $sym10$_DEFAULT_MODULE_MT2_, $default_module_mt2$, NIL));
    $default_dependency_test_id$ = deflexical("*DEFAULT-DEPENDENCY-TEST-ID*", maybeDefault( $sym11$_DEFAULT_DEPENDENCY_TEST_ID_, $default_dependency_test_id$, NIL));
    $default_dependency_test_id2$ = deflexical("*DEFAULT-DEPENDENCY-TEST-ID2*", maybeDefault( $sym12$_DEFAULT_DEPENDENCY_TEST_ID2_, $default_dependency_test_id2$, NIL));
    $default_isa_id$ = deflexical("*DEFAULT-ISA-ID*", maybeDefault( $sym13$_DEFAULT_ISA_ID_, $default_isa_id$, NIL));
    $default_isa_id2$ = deflexical("*DEFAULT-ISA-ID2*", maybeDefault( $sym14$_DEFAULT_ISA_ID2_, $default_isa_id2$, NIL));
    $default_test_query$ = deflexical("*DEFAULT-TEST-QUERY*", maybeDefault( $sym15$_DEFAULT_TEST_QUERY_, $default_test_query$, NIL));
    $default_test_mt$ = deflexical("*DEFAULT-TEST-MT*", maybeDefault( $sym16$_DEFAULT_TEST_MT_, $default_test_mt$, NIL));
    $default_collection_id$ = deflexical("*DEFAULT-COLLECTION-ID*", maybeDefault( $sym17$_DEFAULT_COLLECTION_ID_, $default_collection_id$, NIL));
    $ctest_output_formats$ = defconstant("*CTEST-OUTPUT-FORMATS*", list($kw35$TEXT, $kw36$HTML));
    $ctest_output_styles$ = defconstant("*CTEST-OUTPUT-STYLES*", list($kw37$BRIEF, $kw38$VERBOSE, $kw39$POST_BUILD));
    $max_test_retry_time$ = defconstant("*MAX-TEST-RETRY-TIME*", $int40$60);
    $csc_table_name$ = defconstant("*CSC-TABLE-NAME*", $str41$cyc_system_config);
    $max_image_type_len$ = defconstant("*MAX-IMAGE-TYPE-LEN*", $int42$50);
    $max_image_version_len$ = defconstant("*MAX-IMAGE-VERSION-LEN*", $int42$50);
    $max_system_version_num_len$ = defconstant("*MAX-SYSTEM-VERSION-NUM-LEN*", TEN_INTEGER);
    $max_kb_number_len$ = defconstant("*MAX-KB-NUMBER-LEN*", TWELVE_INTEGER);
    $mc_table_name$ = defconstant("*MC-TABLE-NAME*", $str43$machine_config);
    $max_machine_name_len$ = defconstant("*MAX-MACHINE-NAME-LEN*", $int44$100);
    $max_machine_type_len$ = defconstant("*MAX-MACHINE-TYPE-LEN*", $int42$50);
    $max_machine_hardware_type_len$ = defconstant("*MAX-MACHINE-HARDWARE-TYPE-LEN*", TWENTY_INTEGER);
    $max_os_type_len$ = defconstant("*MAX-OS-TYPE-LEN*", $int42$50);
    $te_table_name$ = defconstant("*TE-TABLE-NAME*", $str45$test_execution);
    $max_test_id_len$ = defconstant("*MAX-TEST-ID-LEN*", $int44$100);
    $max_test_type_len$ = defconstant("*MAX-TEST-TYPE-LEN*", TWENTY_INTEGER);
    $max_date_len$ = defconstant("*MAX-DATE-LEN*", NINETEEN_INTEGER);
    $max_test_status_len$ = defconstant("*MAX-TEST-STATUS-LEN*", TEN_INTEGER);
    $max_test_execution_type_len$ = defconstant("*MAX-TEST-EXECUTION-TYPE-LEN*", ONE_INTEGER);
    $ctest_test_types$ = defconstant("*CTEST-TEST-TYPES*", list($str46$KBCONTENT));
    $ctest_test_statuses$ = defconstant("*CTEST-TEST-STATUSES*", list($str47$SUCCESS, $str48$FAILURE, $str49$DFAILURE, $str50$ERROR, $str51$SKIPPED, $str52$PROBLEM));
    $ctest_success_status$ = defconstant("*CTEST-SUCCESS-STATUS*", $str47$SUCCESS);
    $ctest_failure_status$ = defconstant("*CTEST-FAILURE-STATUS*", $str48$FAILURE);
    $ctest_dfailure_status$ = defconstant("*CTEST-DFAILURE-STATUS*", $str49$DFAILURE);
    $ctest_error_status$ = defconstant("*CTEST-ERROR-STATUS*", $str50$ERROR);
    $ctest_skipped_status$ = defconstant("*CTEST-SKIPPED-STATUS*", $str51$SKIPPED);
    $ctest_problem_status$ = defconstant("*CTEST-PROBLEM-STATUS*", $str52$PROBLEM);
    $kct_test_type$ = defconstant("*KCT-TEST-TYPE*", $str46$KBCONTENT);
    $tcmr_table_name$ = defconstant("*TCMR-TABLE-NAME*", $str53$test_collection_metric_result);
    $max_metric_id_len$ = defconstant("*MAX-METRIC-ID-LEN*", $int44$100);
    $tmr_table_name$ = defconstant("*TMR-TABLE-NAME*", $str54$test_metric_result);
    $tem_table_name$ = defconstant("*TEM-TABLE-NAME*", $str55$test_execution_member);
    $kcte_table_name$ = defconstant("*KCTE-TABLE-NAME*", $str56$kct_execution);
    $max_exec_type_len$ = defconstant("*MAX-EXEC-TYPE-LEN*", ONE_INTEGER);
    $collection_execution_type$ = defconstant("*COLLECTION-EXECUTION-TYPE*", $str57$C);
    $individual_execution_type$ = defconstant("*INDIVIDUAL-EXECUTION-TYPE*", $str58$I);
    $kctem_table_name$ = defconstant("*KCTEM-TABLE-NAME*", $str59$kct_execution_member);
    $max_exec_mode_len$ = defconstant("*MAX-EXEC-MODE-LEN*", ONE_INTEGER);
    $sampling_execution_mode$ = defconstant("*SAMPLING-EXECUTION-MODE*", $str60$S);
    $hypothesize_execution_mode$ = defconstant("*HYPOTHESIZE-EXECUTION-MODE*", $str61$H);
    $simple_execution_mode$ = defconstant("*SIMPLE-EXECUTION-MODE*", $str62$X);
    $kctc_table_name$ = defconstant("*KCTC-TABLE-NAME*", $str63$kct_config);
    $kcts_project_desc$ = defconstant("*KCTS-PROJECT-DESC*", $str64$KB_Content_Test_System);
    $kctcc_table_name$ = defconstant("*KCTCC-TABLE-NAME*", $str65$kct_collection_config);
    $max_collection_type_len$ = defconstant("*MAX-COLLECTION-TYPE-LEN*", ONE_INTEGER);
    $collection_test_collection_type$ = defconstant("*COLLECTION-TEST-COLLECTION-TYPE*", $str57$C);
    $system_test_collection_type$ = defconstant("*SYSTEM-TEST-COLLECTION-TYPE*", $str60$S);
    $tcrc_table_name$ = defconstant("*TCRC-TABLE-NAME*", $str66$test_cyclist_responsible_config);
    $max_cyclist_id_len$ = defconstant("*MAX-CYCLIST-ID-LEN*", $int44$100);
    $max_email_notify_style_id_len$ = defconstant("*MAX-EMAIL-NOTIFY-STYLE-ID-LEN*", $int44$100);
    $kctccbs_table_name$ = defconstant("*KCTCCBS-TABLE-NAME*", $str67$kct_config_cycl_binding_set);
    $max_binding_designation_len$ = defconstant("*MAX-BINDING-DESIGNATION-LEN*", ONE_INTEGER);
    $kct_exact_binding_set_designation$ = defconstant("*KCT-EXACT-BINDING-SET-DESIGNATION*", $str68$E);
    $kct_wanted_binding_set_designation$ = defconstant("*KCT-WANTED-BINDING-SET-DESIGNATION*", $str69$W);
    $kct_unwanted_binding_set_designation$ = defconstant("*KCT-UNWANTED-BINDING-SET-DESIGNATION*", $str70$N);
    $kct_unimportant_binding_set_designation$ = defconstant("*KCT-UNIMPORTANT-BINDING-SET-DESIGNATION*", $str71$U);
    $kct_binding_set_designations$ = defconstant("*KCT-BINDING-SET-DESIGNATIONS*", list($str68$E, $str69$W, $str70$N, $str71$U));
    $kctcas_table_name$ = defconstant("*KCTCAS-TABLE-NAME*", $str72$kct_config_answer_support);
    $max_support_type_len$ = defconstant("*MAX-SUPPORT-TYPE-LEN*", ONE_INTEGER);
    $max_support_designation_len$ = defconstant("*MAX-SUPPORT-DESIGNATION-LEN*", ONE_INTEGER);
    $ctest_support_types$ = defconstant("*CTEST-SUPPORT-TYPES*", list($str73$M, $str60$S));
    $ctest_support_designations$ = defconstant("*CTEST-SUPPORT-DESIGNATIONS*", list($str69$W, $str70$N));
    $kct_wanted_support_designation$ = defconstant("*KCT-WANTED-SUPPORT-DESIGNATION*", $str69$W);
    $kct_unwanted_support_designation$ = defconstant("*KCT-UNWANTED-SUPPORT-DESIGNATION*", $str70$N);
    $kct_support_support_type$ = defconstant("*KCT-SUPPORT-SUPPORT-TYPE*", $str60$S);
    $kct_module_support_type$ = defconstant("*KCT-MODULE-SUPPORT-TYPE*", $str73$M);
    $ipc_table_name$ = defconstant("*IPC-TABLE-NAME*", $str74$inference_param_config);
    $max_inference_param_id_len$ = defconstant("*MAX-INFERENCE-PARAM-ID-LEN*", $int44$100);
    $tmc_table_name$ = defconstant("*TMC-TABLE-NAME*", $str75$test_metric_config);
    $max_test_metric_type_len$ = defconstant("*MAX-TEST-METRIC-TYPE-LEN*", ONE_INTEGER);
    $ctest_metric_types$ = defconstant("*CTEST-METRIC-TYPES*", list($str57$C, $str76$Q, $str77$B));
    $ctest_collection_level_metric$ = defconstant("*CTEST-COLLECTION-LEVEL-METRIC*", $str57$C);
    $ctest_query_level_metric$ = defconstant("*CTEST-QUERY-LEVEL-METRIC*", $str76$Q);
    $ctest_binding_level_metric$ = defconstant("*CTEST-BINDING-LEVEL-METRIC*", $str77$B);
    $tdc_table_name$ = defconstant("*TDC-TABLE-NAME*", $str78$test_dependency_config);
    $kctcg_table_name$ = defconstant("*KCTCG-TABLE-NAME*", $str79$kct_config_genls);
    $kctci_table_name$ = defconstant("*KCTCI-TABLE-NAME*", $str80$kct_config_isas);
    $ctest_storing_p$ = defparameter("*CTEST-STORING-P*", NIL);
    $ctest_storing_configs_p$ = defparameter("*CTEST-STORING-CONFIGS-P*", NIL);
    $ctest_required_metrics$ = defparameter("*CTEST-REQUIRED-METRICS*", NIL);
    $tests_in_process$ = defparameter("*TESTS-IN-PROCESS*", NIL);
    $ctest_field_maxima$ = defparameter("*CTEST-FIELD-MAXIMA*", list(new SubLObject[] {list($str82$binding_designation, $max_binding_designation_len$.getGlobalValue()), list($str83$cyclist_id, $max_cyclist_id_len$.getGlobalValue()), list($str84$email_notify_style_id, $max_email_notify_style_id_len$.getGlobalValue()), list($str85$execution_type, $max_exec_type_len$.getGlobalValue()), list($str86$genls_id, $max_test_id_len$.getGlobalValue()), list($str87$image_type, $max_image_type_len$.getGlobalValue()), list($str88$image_version, $max_image_version_len$.getGlobalValue()), list($str89$inference_metric_id, $max_metric_id_len$.getGlobalValue()), list($str90$isa_id, $max_test_id_len$.getGlobalValue()), list($str91$kb_number, $max_kb_number_len$.getGlobalValue()), list($str92$machine_hardware_type, $max_machine_hardware_type_len$.getGlobalValue()), list($str93$machine_name, $max_machine_name_len$.getGlobalValue()), list($str94$machine_type, $max_machine_type_len$.getGlobalValue()), list($str95$os_type, $max_os_type_len$.getGlobalValue()), list($str96$support_type, $max_support_type_len$.getGlobalValue()), list($str97$system_version_num, $max_system_version_num_len$.getGlobalValue()), list($str98$test_id, $max_test_id_len$.getGlobalValue()), list($str99$test_status, $max_test_status_len$.getGlobalValue()), list($str100$test_type, $max_test_type_len$.getGlobalValue())}));
    return NIL;
  }

  public static final SubLObject setup_ctest_utils_file() {
    // CVS_ID("Id: ctest-utils.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_DEFAULT_EMAIL_NOTIFY_STYLE_ID_);
    subl_macro_promotions.declare_defglobal($sym1$_DEFAULT_TEST_ID_);
    subl_macro_promotions.declare_defglobal($sym2$_DEFAULT_STRING_BINDING_SET_);
    subl_macro_promotions.declare_defglobal($sym3$_DEFAULT_BINDING_SET_);
    subl_macro_promotions.declare_defglobal($sym4$_DEFAULT_BINDING_SET2_);
    subl_macro_promotions.declare_defglobal($sym5$_DEFAULT_SET_OF_BINDING_SETS_);
    subl_macro_promotions.declare_defglobal($sym6$_DEFAULT_SET_OF_BINDING_SETS2_);
    subl_macro_promotions.declare_defglobal($sym7$_DEFAULT_SET_OF_BINDING_SETS3_);
    subl_macro_promotions.declare_defglobal($sym8$_DEFAULT_MODULE_SENTENCE_);
    subl_macro_promotions.declare_defglobal($sym9$_DEFAULT_MODULE_MT_);
    subl_macro_promotions.declare_defglobal($sym10$_DEFAULT_MODULE_MT2_);
    subl_macro_promotions.declare_defglobal($sym11$_DEFAULT_DEPENDENCY_TEST_ID_);
    subl_macro_promotions.declare_defglobal($sym12$_DEFAULT_DEPENDENCY_TEST_ID2_);
    subl_macro_promotions.declare_defglobal($sym13$_DEFAULT_ISA_ID_);
    subl_macro_promotions.declare_defglobal($sym14$_DEFAULT_ISA_ID2_);
    subl_macro_promotions.declare_defglobal($sym15$_DEFAULT_TEST_QUERY_);
    subl_macro_promotions.declare_defglobal($sym16$_DEFAULT_TEST_MT_);
    subl_macro_promotions.declare_defglobal($sym17$_DEFAULT_COLLECTION_ID_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_DEFAULT_EMAIL_NOTIFY_STYLE_ID_ = makeSymbol("*DEFAULT-EMAIL-NOTIFY-STYLE-ID*");
  public static final SubLSymbol $sym1$_DEFAULT_TEST_ID_ = makeSymbol("*DEFAULT-TEST-ID*");
  public static final SubLSymbol $sym2$_DEFAULT_STRING_BINDING_SET_ = makeSymbol("*DEFAULT-STRING-BINDING-SET*");
  public static final SubLSymbol $sym3$_DEFAULT_BINDING_SET_ = makeSymbol("*DEFAULT-BINDING-SET*");
  public static final SubLSymbol $sym4$_DEFAULT_BINDING_SET2_ = makeSymbol("*DEFAULT-BINDING-SET2*");
  public static final SubLSymbol $sym5$_DEFAULT_SET_OF_BINDING_SETS_ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS*");
  public static final SubLSymbol $sym6$_DEFAULT_SET_OF_BINDING_SETS2_ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS2*");
  public static final SubLSymbol $sym7$_DEFAULT_SET_OF_BINDING_SETS3_ = makeSymbol("*DEFAULT-SET-OF-BINDING-SETS3*");
  public static final SubLSymbol $sym8$_DEFAULT_MODULE_SENTENCE_ = makeSymbol("*DEFAULT-MODULE-SENTENCE*");
  public static final SubLSymbol $sym9$_DEFAULT_MODULE_MT_ = makeSymbol("*DEFAULT-MODULE-MT*");
  public static final SubLSymbol $sym10$_DEFAULT_MODULE_MT2_ = makeSymbol("*DEFAULT-MODULE-MT2*");
  public static final SubLSymbol $sym11$_DEFAULT_DEPENDENCY_TEST_ID_ = makeSymbol("*DEFAULT-DEPENDENCY-TEST-ID*");
  public static final SubLSymbol $sym12$_DEFAULT_DEPENDENCY_TEST_ID2_ = makeSymbol("*DEFAULT-DEPENDENCY-TEST-ID2*");
  public static final SubLSymbol $sym13$_DEFAULT_ISA_ID_ = makeSymbol("*DEFAULT-ISA-ID*");
  public static final SubLSymbol $sym14$_DEFAULT_ISA_ID2_ = makeSymbol("*DEFAULT-ISA-ID2*");
  public static final SubLSymbol $sym15$_DEFAULT_TEST_QUERY_ = makeSymbol("*DEFAULT-TEST-QUERY*");
  public static final SubLSymbol $sym16$_DEFAULT_TEST_MT_ = makeSymbol("*DEFAULT-TEST-MT*");
  public static final SubLSymbol $sym17$_DEFAULT_COLLECTION_ID_ = makeSymbol("*DEFAULT-COLLECTION-ID*");
  public static final SubLObject $const18$TestResultNotification_EmailBrief = constant_handles.reader_make_constant_shell(makeString("TestResultNotification-EmailBrief"));
  public static final SubLObject $const19$TKBTemplateTestForMissingMt = constant_handles.reader_make_constant_shell(makeString("TKBTemplateTestForMissingMt"));
  public static final SubLString $str20$___TheSet____ELInferenceBindingFn = makeString("(#$TheSet (#$ELInferenceBindingFn ?SOMETHING \"A SOMETHING\"))");
  public static final SubLSymbol $sym21$_SOMETHING = makeSymbol("?SOMETHING");
  public static final SubLString $str22$A_SOMETHING = makeString("A SOMETHING");
  public static final SubLSymbol $sym23$_OTHERTHING = makeSymbol("?OTHERTHING");
  public static final SubLString $str24$ANOTHER_THING = makeString("ANOTHER THING");
  public static final SubLSymbol $sym25$_ANOTHERTHING = makeSymbol("?ANOTHERTHING");
  public static final SubLString $str26$YET_ANOTHER_THING = makeString("YET ANOTHER THING");
  public static final SubLList $list27 = list(constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("Collection")), constant_handles.reader_make_constant_shell(makeString("Thing")));
  public static final SubLObject $const28$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLObject $const29$UniversalVocabularyMt = constant_handles.reader_make_constant_shell(makeString("UniversalVocabularyMt"));
  public static final SubLObject $const30$TKBTemplateTestForMissingExplanat = constant_handles.reader_make_constant_shell(makeString("TKBTemplateTestForMissingExplanation"));
  public static final SubLObject $const31$TKBTemplateTestForMissingExample = constant_handles.reader_make_constant_shell(makeString("TKBTemplateTestForMissingExample"));
  public static final SubLObject $const32$TKBTemplateIntegrityTest = constant_handles.reader_make_constant_shell(makeString("TKBTemplateIntegrityTest"));
  public static final SubLObject $const33$TKB_RTVQueries = constant_handles.reader_make_constant_shell(makeString("TKB-RTVQueries"));
  public static final SubLList $list34 = list(constant_handles.reader_make_constant_shell(makeString("genls")), constant_handles.reader_make_constant_shell(makeString("Collection")), makeSymbol("?WHAT"));
  public static final SubLSymbol $kw35$TEXT = makeKeyword("TEXT");
  public static final SubLSymbol $kw36$HTML = makeKeyword("HTML");
  public static final SubLSymbol $kw37$BRIEF = makeKeyword("BRIEF");
  public static final SubLSymbol $kw38$VERBOSE = makeKeyword("VERBOSE");
  public static final SubLSymbol $kw39$POST_BUILD = makeKeyword("POST-BUILD");
  public static final SubLInteger $int40$60 = makeInteger(60);
  public static final SubLString $str41$cyc_system_config = makeString("cyc_system_config");
  public static final SubLInteger $int42$50 = makeInteger(50);
  public static final SubLString $str43$machine_config = makeString("machine_config");
  public static final SubLInteger $int44$100 = makeInteger(100);
  public static final SubLString $str45$test_execution = makeString("test_execution");
  public static final SubLString $str46$KBCONTENT = makeString("KBCONTENT");
  public static final SubLString $str47$SUCCESS = makeString("SUCCESS");
  public static final SubLString $str48$FAILURE = makeString("FAILURE");
  public static final SubLString $str49$DFAILURE = makeString("DFAILURE");
  public static final SubLString $str50$ERROR = makeString("ERROR");
  public static final SubLString $str51$SKIPPED = makeString("SKIPPED");
  public static final SubLString $str52$PROBLEM = makeString("PROBLEM");
  public static final SubLString $str53$test_collection_metric_result = makeString("test_collection_metric_result");
  public static final SubLString $str54$test_metric_result = makeString("test_metric_result");
  public static final SubLString $str55$test_execution_member = makeString("test_execution_member");
  public static final SubLString $str56$kct_execution = makeString("kct_execution");
  public static final SubLString $str57$C = makeString("C");
  public static final SubLString $str58$I = makeString("I");
  public static final SubLString $str59$kct_execution_member = makeString("kct_execution_member");
  public static final SubLString $str60$S = makeString("S");
  public static final SubLString $str61$H = makeString("H");
  public static final SubLString $str62$X = makeString("X");
  public static final SubLString $str63$kct_config = makeString("kct_config");
  public static final SubLString $str64$KB_Content_Test_System = makeString("KB Content Test System");
  public static final SubLString $str65$kct_collection_config = makeString("kct_collection_config");
  public static final SubLString $str66$test_cyclist_responsible_config = makeString("test_cyclist_responsible_config");
  public static final SubLString $str67$kct_config_cycl_binding_set = makeString("kct_config_cycl_binding_set");
  public static final SubLString $str68$E = makeString("E");
  public static final SubLString $str69$W = makeString("W");
  public static final SubLString $str70$N = makeString("N");
  public static final SubLString $str71$U = makeString("U");
  public static final SubLString $str72$kct_config_answer_support = makeString("kct_config_answer_support");
  public static final SubLString $str73$M = makeString("M");
  public static final SubLString $str74$inference_param_config = makeString("inference_param_config");
  public static final SubLString $str75$test_metric_config = makeString("test_metric_config");
  public static final SubLString $str76$Q = makeString("Q");
  public static final SubLString $str77$B = makeString("B");
  public static final SubLString $str78$test_dependency_config = makeString("test_dependency_config");
  public static final SubLString $str79$kct_config_genls = makeString("kct_config_genls");
  public static final SubLString $str80$kct_config_isas = makeString("kct_config_isas");
  public static final SubLString $str81$Test_or_test_collection_GUID_must = makeString("Test or test collection GUID must be supplied.");
  public static final SubLString $str82$binding_designation = makeString("binding_designation");
  public static final SubLString $str83$cyclist_id = makeString("cyclist_id");
  public static final SubLString $str84$email_notify_style_id = makeString("email_notify_style_id");
  public static final SubLString $str85$execution_type = makeString("execution_type");
  public static final SubLString $str86$genls_id = makeString("genls_id");
  public static final SubLString $str87$image_type = makeString("image_type");
  public static final SubLString $str88$image_version = makeString("image_version");
  public static final SubLString $str89$inference_metric_id = makeString("inference_metric_id");
  public static final SubLString $str90$isa_id = makeString("isa_id");
  public static final SubLString $str91$kb_number = makeString("kb_number");
  public static final SubLString $str92$machine_hardware_type = makeString("machine_hardware_type");
  public static final SubLString $str93$machine_name = makeString("machine_name");
  public static final SubLString $str94$machine_type = makeString("machine_type");
  public static final SubLString $str95$os_type = makeString("os_type");
  public static final SubLString $str96$support_type = makeString("support-type");
  public static final SubLString $str97$system_version_num = makeString("system_version_num");
  public static final SubLString $str98$test_id = makeString("test_id");
  public static final SubLString $str99$test_status = makeString("test_status");
  public static final SubLString $str100$test_type = makeString("test_type");
  public static final SubLSymbol $kw101$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw102$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $kw103$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $kw104$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLSymbol $kw105$FALSE_DEF = makeKeyword("FALSE-DEF");
  public static final SubLSymbol $kw106$FALSE_MON = makeKeyword("FALSE-MON");
  public static final SubLSymbol $sym107$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLObject $const108$IndividualTestMetric = constant_handles.reader_make_constant_shell(makeString("IndividualTestMetric"));
  public static final SubLObject $const109$CollectionTestMetric = constant_handles.reader_make_constant_shell(makeString("CollectionTestMetric"));
  public static final SubLSymbol $sym110$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLObject $const111$TestMetric = constant_handles.reader_make_constant_shell(makeString("TestMetric"));
  public static final SubLObject $const112$UnsupportedTestMetric = constant_handles.reader_make_constant_shell(makeString("UnsupportedTestMetric"));
  public static final SubLSymbol $sym113$CTEST_UNSUPPORTED_METRIC_ = makeSymbol("CTEST-UNSUPPORTED-METRIC?");

  //// Initializers

  public void declareFunctions() {
    declare_ctest_utils_file();
  }

  public void initializeVariables() {
    init_ctest_utils_file();
  }

  public void runTopLevelForms() {
    setup_ctest_utils_file();
  }

}
