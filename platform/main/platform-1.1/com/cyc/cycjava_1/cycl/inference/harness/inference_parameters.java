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

package com.cyc.cycjava_1.cycl.inference.harness;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_lookahead_productivity;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_rewrite;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_abduction;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.inference.modules.transformation_modules;

public  final class inference_parameters extends SubLTranslatedFile {

  //// Constructor

  private inference_parameters() {}
  public static final SubLFile me = new inference_parameters();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_parameters";

  //// Definitions

  /** The query properties (and some others) to be gathered for inference answer strongest query property value. */
  @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 7116) 
  private static SubLSymbol $gather_inference_answer_query_properties$ = null;

  /** The boolean query properties which should be included when two sets of query properties are merged
   if it happens to be present in in either set. */
  @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 8590) 
  private static SubLSymbol $boolean_query_properties_to_include_on_merge$ = null;

  /** The query properties (and some others) to be gathered for inference answer strongest query property value. */
  @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 9588) 
  private static SubLSymbol $query_properties_efficiency_hierarchy$ = null;

  /** The query properties which have numeric values.  For all of these, the lower the value, the better the efficiency */
  @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11146) 
  private static SubLSymbol $numeric_query_properties$ = null;

  /** The numeric query properties that have a maximum value of :positive-infinity instead of dwimming NIL */
  @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 11552) 
  private static SubLSymbol $numeric_query_properties_that_max_out_at_positive_infinity$ = null;

  /** Query properties computed by @xref inference-answer-compute-inference-answer-query-properties-int
   that should override the values in PROOF-PROPERTIES. */
  @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 22799) 
  private static SubLSymbol $proof_query_properties_to_override$ = null;

  /** triq-4-clusters-15 */
  @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 33954) 
  private static SubLSymbol $inference_mode_query_properties_table$ = null;

  @SubL(source = "cycl/inference/harness/inference-parameters.lisp", position = 36735) 
  public static final SubLObject query_properties_for_inference_mode(SubLObject inference_mode) {
    checkType(inference_mode, $sym59$INFERENCE_MODE_P);
    return list_utilities.alist_lookup($inference_mode_query_properties_table$.getGlobalValue(), inference_mode, UNPROVIDED, UNPROVIDED);
  }

  public static final SubLObject declare_inference_parameters_file() {
    declareFunction(myName, "explicify_inference_engine_query_property_defaults", "EXPLICIFY-INFERENCE-ENGINE-QUERY-PROPERTY-DEFAULTS", 1, 0, false);
    declareFunction(myName, "remove_inference_engine_query_property_defaults", "REMOVE-INFERENCE-ENGINE-QUERY-PROPERTY-DEFAULTS", 1, 0, false);
    declareFunction(myName, "inference_merge_query_properties", "INFERENCE-MERGE-QUERY-PROPERTIES", 2, 0, false);
    declareFunction(myName, "union_plist_properties", "UNION-PLIST-PROPERTIES", 2, 0, false);
    declareFunction(myName, "inference_conservatively_select_property_value_for_merge", "INFERENCE-CONSERVATIVELY-SELECT-PROPERTY-VALUE-FOR-MERGE", 3, 0, false);
    declareFunction(myName, "gather_inference_answer_query_propertyP", "GATHER-INFERENCE-ANSWER-QUERY-PROPERTY?", 1, 0, false);
    declareFunction(myName, "gather_inference_answer_query_properties", "GATHER-INFERENCE-ANSWER-QUERY-PROPERTIES", 0, 0, false);
    declareFunction(myName, "boolean_query_property_to_include_on_mergeP", "BOOLEAN-QUERY-PROPERTY-TO-INCLUDE-ON-MERGE?", 1, 0, false);
    declareFunction(myName, "query_property_in_efficiency_hierarchyP", "QUERY-PROPERTY-IN-EFFICIENCY-HIERARCHY?", 1, 0, false);
    declareFunction(myName, "query_properties_efficiency_hierarchy", "QUERY-PROPERTIES-EFFICIENCY-HIERARCHY", 0, 0, false);
    declareFunction(myName, "numeric_query_properties", "NUMERIC-QUERY-PROPERTIES", 0, 0, false);
    declareFunction(myName, "numeric_query_property_p", "NUMERIC-QUERY-PROPERTY-P", 1, 0, false);
    declareFunction(myName, "numeric_query_property_max", "NUMERIC-QUERY-PROPERTY-MAX", 1, 0, false);
    declareFunction(myName, "query_property_value_more_efficientP", "QUERY-PROPERTY-VALUE-MORE-EFFICIENT?", 3, 0, false);
    declareFunction(myName, "query_property_value_more_completeP", "QUERY-PROPERTY-VALUE-MORE-COMPLETE?", 3, 0, false);
    declareFunction(myName, "query_property_value_at_least_as_efficientP", "QUERY-PROPERTY-VALUE-AT-LEAST-AS-EFFICIENT?", 3, 0, false);
    declareFunction(myName, "query_property_value_at_least_as_completeP", "QUERY-PROPERTY-VALUE-AT-LEAST-AS-COMPLETE?", 3, 0, false);
    declareFunction(myName, "most_efficient_value_for_query_property", "MOST-EFFICIENT-VALUE-FOR-QUERY-PROPERTY", 1, 0, false);
    declareFunction(myName, "most_efficient_value_for_query_propertyP", "MOST-EFFICIENT-VALUE-FOR-QUERY-PROPERTY?", 2, 0, false);
    declareFunction(myName, "most_complete_value_for_query_property", "MOST-COMPLETE-VALUE-FOR-QUERY-PROPERTY", 1, 0, false);
    declareFunction(myName, "most_complete_value_for_query_propertyP", "MOST-COMPLETE-VALUE-FOR-QUERY-PROPERTY?", 2, 0, false);
    declareFunction(myName, "problem_store_allows_reuse_wrt_query_propertiesP", "PROBLEM-STORE-ALLOWS-REUSE-WRT-QUERY-PROPERTIES?", 2, 0, false);
    declareFunction(myName, "problem_store_allows_reuse_wrt_query_property", "PROBLEM-STORE-ALLOWS-REUSE-WRT-QUERY-PROPERTY", 3, 0, false);
    declareFunction(myName, "inference_compute_all_answers_query_properties", "INFERENCE-COMPUTE-ALL-ANSWERS-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "inference_compute_some_answer_query_properties", "INFERENCE-COMPUTE-SOME-ANSWER-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "inference_compute_proof_query_properties", "INFERENCE-COMPUTE-PROOF-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "inference_compute_inference_answer_query_properties", "INFERENCE-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "compute_most_complete_query_properties", "COMPUTE-MOST-COMPLETE-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "compute_most_efficient_query_properties", "COMPUTE-MOST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "compute_extremal_query_properties_int", "COMPUTE-EXTREMAL-QUERY-PROPERTIES-INT", 2, 0, false);
    declareFunction(myName, "inference_compute_inference_answer_query_properties_int", "INFERENCE-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES-INT", 2, 0, false);
    declareFunction(myName, "inference_answer_compute_inference_answer_query_properties", "INFERENCE-ANSWER-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES", 3, 0, false);
    declareFunction(myName, "inference_answer_compute_inference_answer_query_properties_int", "INFERENCE-ANSWER-COMPUTE-INFERENCE-ANSWER-QUERY-PROPERTIES-INT", 2, 0, false);
    declareFunction(myName, "distribute_answer_properties_over_proof_properties_list", "DISTRIBUTE-ANSWER-PROPERTIES-OVER-PROOF-PROPERTIES-LIST", 2, 0, false);
    declareFunction(myName, "compute_proof_query_properties_list", "COMPUTE-PROOF-QUERY-PROPERTIES-LIST", 2, 0, false);
    declareFunction(myName, "proof_query_properties", "PROOF-QUERY-PROPERTIES", 3, 0, false);
    declareFunction(myName, "prepare_proof_query_properties", "PREPARE-PROOF-QUERY-PROPERTIES", 0, 0, false);
    declareFunction(myName, "get_most_efficient_query_properties", "GET-MOST-EFFICIENT-QUERY-PROPERTIES", 2, 0, false);
    declareFunction(myName, "get_least_efficient_query_properties", "GET-LEAST-EFFICIENT-QUERY-PROPERTIES", 2, 0, false);
    declareFunction(myName, "query_properties_more_efficientP", "QUERY-PROPERTIES-MORE-EFFICIENT?", 2, 0, false);
    declareFunction(myName, "query_properties_less_efficientP", "QUERY-PROPERTIES-LESS-EFFICIENT?", 2, 0, false);
    declareFunction(myName, "get_query_properties_efficiency_count", "GET-QUERY-PROPERTIES-EFFICIENCY-COUNT", 2, 0, false);
    declareFunction(myName, "most_efficient_query_properties", "MOST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "most_complete_query_properties", "MOST-COMPLETE-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "least_efficient_query_properties", "LEAST-EFFICIENT-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "least_complete_query_properties", "LEAST-COMPLETE-QUERY-PROPERTIES", 1, 0, false);
    declareFunction(myName, "query_properties_for_inference_mode", "QUERY-PROPERTIES-FOR-INFERENCE-MODE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_parameters_file() {
    $gather_inference_answer_query_properties$ = deflexical("*GATHER-INFERENCE-ANSWER-QUERY-PROPERTIES*", $list4);
    $boolean_query_properties_to_include_on_merge$ = deflexical("*BOOLEAN-QUERY-PROPERTIES-TO-INCLUDE-ON-MERGE*", $list5);
    $query_properties_efficiency_hierarchy$ = deflexical("*QUERY-PROPERTIES-EFFICIENCY-HIERARCHY*", $list6);
    $numeric_query_properties$ = deflexical("*NUMERIC-QUERY-PROPERTIES*", $list8);
    $numeric_query_properties_that_max_out_at_positive_infinity$ = deflexical("*NUMERIC-QUERY-PROPERTIES-THAT-MAX-OUT-AT-POSITIVE-INFINITY*", $list9);
    $proof_query_properties_to_override$ = deflexical("*PROOF-QUERY-PROPERTIES-TO-OVERRIDE*", $list31);
    $inference_mode_query_properties_table$ = deflexical("*INFERENCE-MODE-QUERY-PROPERTIES-TABLE*", $list58);
    return NIL;
  }

  public static final SubLObject setup_inference_parameters_file() {
    // CVS_ID("Id: inference-parameters.lisp 128436 2009-07-28 22:59:45Z goolsbey ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$UNSPECIFIED = makeKeyword("UNSPECIFIED");
  public static final SubLSymbol $sym1$QUERY_PROPERTIES_P = makeSymbol("QUERY-PROPERTIES-P");
  public static final SubLSymbol $kw2$INFERENCE_MODE = makeKeyword("INFERENCE-MODE");
  public static final SubLSymbol $kw3$CUSTOM = makeKeyword("CUSTOM");
  public static final SubLList $list4 = list(new SubLObject[] {makeKeyword("BINDINGS"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PRODUCTIVITY-LIMIT")});
  public static final SubLList $list5 = list(new SubLObject[] {makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?")});
  public static final SubLList $list6 = list(new SubLObject[] {list(makeKeyword("ABDUCTION-ALLOWED?"), NIL, T), list(makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), NIL, T), list(makeKeyword("ALLOW-ABNORMALITY-CHECKING?"), NIL, T), list(makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, T), list(makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, T), list(makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), T, NIL), list(makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, T), list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"), makeKeyword("EL")), list(makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), T, NIL), list(makeKeyword("EVALUATE-SUBL-ALLOWED?"), NIL, T), list(makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("SHALLOW"), makeKeyword("EXTENDED"), makeKeyword("MAXIMAL"), makeKeyword("CUSTOM")), list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("NONE"), makeKeyword("MINIMAL"), makeKeyword("ARG-TYPE"), makeKeyword("ALL")), list(makeKeyword("NEGATION-BY-FAILURE?"), T, NIL), list(makeKeyword("NEW-TERMS-ALLOWED?"), NIL, T), list(makeKeyword("REWRITE-ALLOWED?"), NIL, T), list(makeKeyword("TRANSFORMATION-ALLOWED?"), NIL, T), list(makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("FOCUSED"), makeKeyword("ALL"))});
  public static final SubLSymbol $sym7$CAR = makeSymbol("CAR");
  public static final SubLList $list8 = list(new SubLObject[] {makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("MAX-PROOF-DEPTH"), makeKeyword("MAX-TRANSFORMATION-DEPTH"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("MAX-NUMBER"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("PRODUCTIVITY-LIMIT")});
  public static final SubLList $list9 = list(makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"));
  public static final SubLString $str10$Invalid_value_for_the_properties_ = makeString("Invalid value for the properties ~a : ~a");
  public static final SubLString $str11$unexpected_property__s = makeString("unexpected property ~s");
  public static final SubLSymbol $sym12$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
  public static final SubLSymbol $kw13$UNDETERMINED = makeKeyword("UNDETERMINED");
  public static final SubLList $list14 = list(makeKeyword("MAX-TIME"), ZERO_INTEGER);
  public static final SubLList $list15 = cons(makeSymbol("FIRST"), makeSymbol("REST"));
  public static final SubLSymbol $kw16$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw17$MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");
  public static final SubLSymbol $kw18$MAX_TIME = makeKeyword("MAX-TIME");
  public static final SubLSymbol $kw19$MAX_STEP = makeKeyword("MAX-STEP");
  public static final SubLSymbol $kw20$PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
  public static final SubLFloat $float21$1_0 = makeDouble(1.0);
  public static final SubLSymbol $kw22$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw23$ILL_FORMED = makeKeyword("ILL-FORMED");
  public static final SubLSymbol $kw24$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
  public static final SubLSymbol $kw25$MAX_NUMBER = makeKeyword("MAX-NUMBER");
  public static final SubLFloat $float26$1_1 = makeDouble(1.1);
  public static final SubLSymbol $kw27$ALLOW_INDETERMINATE_RESULTS_ = makeKeyword("ALLOW-INDETERMINATE-RESULTS?");
  public static final SubLSymbol $kw28$ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
  public static final SubLSymbol $kw29$HL = makeKeyword("HL");
  public static final SubLSymbol $kw30$EL = makeKeyword("EL");
  public static final SubLList $list31 = list(makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-TIME"), makeKeyword("MAX-STEP"), makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("BINDINGS"));
  public static final SubLSymbol $sym32$HL_SUPPORT_P = makeSymbol("HL-SUPPORT-P");
  public static final SubLList $list33 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));
  public static final SubLSymbol $kw34$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw35$REMOVAL_BACKTRACKING_PRODUCTIVITY_LIMIT = makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $kw36$DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");
  public static final SubLSymbol $kw37$PRODUCTIVITY_LIMIT = makeKeyword("PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $kw38$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw39$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
  public static final SubLSymbol $kw40$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw41$REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");
  public static final SubLSymbol $kw42$ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");
  public static final SubLSymbol $kw43$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw44$TRANS_ISA_POS = makeKeyword("TRANS-ISA-POS");
  public static final SubLSymbol $kw45$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw46$REMOVAL_TVA_UNIFY_CLOSURE = makeKeyword("REMOVAL-TVA-UNIFY-CLOSURE");
  public static final SubLSymbol $kw47$TRANSITIVE_CLOSURE_MODE = makeKeyword("TRANSITIVE-CLOSURE-MODE");
  public static final SubLSymbol $kw48$EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");
  public static final SubLSymbol $kw49$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");
  public static final SubLSymbol $kw50$MINIMIZE = makeKeyword("MINIMIZE");
  public static final SubLSymbol $kw51$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");
  public static final SubLSymbol $kw52$ABNORMAL = makeKeyword("ABNORMAL");
  public static final SubLSymbol $kw53$ALLOW_ABNORMALITY_CHECKING_ = makeKeyword("ALLOW-ABNORMALITY-CHECKING?");
  public static final SubLSymbol $kw54$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
  public static final SubLList $list55 = cons(makeSymbol("PROPERTY"), makeSymbol("HIERARCHY"));
  public static final SubLSymbol $sym56$QUERY_PROPERTIES_MORE_EFFICIENT_ = makeSymbol("QUERY-PROPERTIES-MORE-EFFICIENT?");
  public static final SubLSymbol $sym57$QUERY_PROPERTIES_LESS_EFFICIENT_ = makeSymbol("QUERY-PROPERTIES-LESS-EFFICIENT?");
  public static final SubLList $list58 = list(list(new SubLObject[] {makeKeyword("MINIMAL"), makeKeyword("NEW-TERMS-ALLOWED?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), FIFTEEN_INTEGER, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(200), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, makeKeyword("TRANSFORMATION-ALLOWED?"), NIL}), list(new SubLObject[] {makeKeyword("SHALLOW"), makeKeyword("NEW-TERMS-ALLOWED?"), NIL, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(200), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("TRANSFORMATION-ALLOWED?"), T}), list(new SubLObject[] {makeKeyword("EXTENDED"), makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeInteger(200), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("NONE"), makeKeyword("MAX-PROBLEM-COUNT"), makeInteger(100000), makeKeyword("PRODUCTIVITY-LIMIT"), makeInteger(20000000), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), NIL, makeKeyword("MAX-TRANSFORMATION-DEPTH"), TWO_INTEGER, makeKeyword("TRANSFORMATION-ALLOWED?"), T}), list(new SubLObject[] {makeKeyword("MAXIMAL"), makeKeyword("NEW-TERMS-ALLOWED?"), T, makeKeyword("MAX-PROOF-DEPTH"), NIL, makeKeyword("REMOVAL-BACKTRACKING-PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), T, makeKeyword("TRANSITIVE-CLOSURE-MODE"), makeKeyword("ALL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?"), T, makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?"), T, makeKeyword("MAX-TRANSFORMATION-DEPTH"), NIL, makeKeyword("TRANSFORMATION-ALLOWED?"), T}));
  public static final SubLSymbol $sym59$INFERENCE_MODE_P = makeSymbol("INFERENCE-MODE-P");

  //// Initializers

  public void declareFunctions() {
    declare_inference_parameters_file();
  }

  public void initializeVariables() {
    init_inference_parameters_file();
  }

  public void runTopLevelForms() {
    setup_inference_parameters_file();
  }

}
