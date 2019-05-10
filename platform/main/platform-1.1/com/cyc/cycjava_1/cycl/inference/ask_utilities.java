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

package  com.cyc.cycjava_1.cycl.inference;

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
import com.cyc.cycjava_1.cycl.backward_results;
import com.cyc.cycjava_1.cycl.bindings;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cyc_kernel;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.czer_utilities;
import com.cyc.cycjava_1.cycl.czer_vars;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.eval_in_api;
import com.cyc.cycjava_1.cycl.inference.harness.forward;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
import com.cyc.cycjava_1.cycl.inference.harness.inference_parameters;
import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava_1.cycl.kb_control_vars;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.queues;
import com.cyc.cycjava_1.cycl.set_contents;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.uncanonicalizer;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.variables;
import com.cyc.cycjava_1.cycl.wff_utilities;

public  final class ask_utilities extends SubLTranslatedFile {

  //// Constructor

  private ask_utilities() {}
  public static final SubLFile me = new ask_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.ask_utilities";

  //// Definitions

  @SubL(source = "cycl/inference/ask-utilities.lisp", position = 3995) 
  public static final SubLObject productivity_limit_from_removal_cost_cutoff(SubLObject cost_cutoff) {
    return ((NIL != cost_cutoff) ? ((SubLObject) Numbers.multiply(TWO_INTEGER, $int25$100, cost_cutoff)) : number_utilities.positive_infinity());
  }

  /** Temporary control variable;
   When non-nil, recursive queries are performed in the currently active problem store. */
  @SubL(source = "cycl/inference/ask-utilities.lisp", position = 10566) 
  public static SubLSymbol $recursive_queries_in_currently_active_problem_storeP$ = null;

  /** A recursive query depth higher than this will yield an error */
  @SubL(source = "cycl/inference/ask-utilities.lisp", position = 11951) 
  private static SubLSymbol $max_recursive_query_depth$ = null;

  /** To avoid infinite recursion and stack overflow */
  @SubL(source = "cycl/inference/ask-utilities.lisp", position = 12069) 
  private static SubLSymbol $recursive_query_depth$ = null;

  public static final SubLObject declare_ask_utilities_file() {
    //declareFunction(myName, "query_properties_from_legacy_ask_parameters", "QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 4, false);
    declareFunction(myName, "productivity_limit_from_removal_cost_cutoff", "PRODUCTIVITY-LIMIT-FROM-REMOVAL-COST-CUTOFF", 1, 0, false);
    //declareFunction(myName, "query_static_properties_from_legacy_ask_parameters", "QUERY-STATIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 0, false);
    //declareFunction(myName, "query_dynamic_properties_from_legacy_ask_parameters", "QUERY-DYNAMIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 5, false);
    //declareFunction(myName, "query_justified", "QUERY-JUSTIFIED", 1, 2, false);
    //declareFunction(myName, "ask_justified", "ASK-JUSTIFIED", 1, 5, false);
    //declareFunction(myName, "query_template", "QUERY-TEMPLATE", 2, 2, false);
    //declareFunction(myName, "ask_template", "ASK-TEMPLATE", 2, 5, false);
    //declareFunction(myName, "query_variable", "QUERY-VARIABLE", 2, 2, false);
    //declareFunction(myName, "ask_variable", "ASK-VARIABLE", 2, 5, false);
    //declareFunction(myName, "query_template_eval", "QUERY-TEMPLATE-EVAL", 2, 2, false);
    //declareFunction(myName, "ask_template_eval", "ASK-TEMPLATE-EVAL", 2, 5, false);
    //declareFunction(myName, "query_boolean", "QUERY-BOOLEAN", 1, 2, false);
    //declareFunction(myName, "recursive_ask_query_properties_from_legacy_ask_parameters", "RECURSIVE-ASK-QUERY-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS", 0, 4, false);
    //declareFunction(myName, "within_recursive_queryP", "WITHIN-RECURSIVE-QUERY?", 0, 0, false);
    //declareFunction(myName, "recursive_query", "RECURSIVE-QUERY", 1, 2, false);
    //declareFunction(myName, "query_property_inherited_by_recursive_queryP", "QUERY-PROPERTY-INHERITED-BY-RECURSIVE-QUERY?", 1, 0, false);
    //declareFunction(myName, "filter_query_properties_for_recursive_query", "FILTER-QUERY-PROPERTIES-FOR-RECURSIVE-QUERY", 1, 0, false);
    //declareFunction(myName, "recursive_query_problem_store_to_reuse", "RECURSIVE-QUERY-PROBLEM-STORE-TO-REUSE", 1, 0, false);
    //declareFunction(myName, "kappa_tuples", "KAPPA-TUPLES", 3, 1, false);
    //declareFunction(myName, "kappa_tuples_justified", "KAPPA-TUPLES-JUSTIFIED", 3, 1, false);
    //declareFunction(myName, "inference_recursive_ask", "INFERENCE-RECURSIVE-ASK", 1, 5, false);
    //declareFunction(myName, "inference_recursive_query", "INFERENCE-RECURSIVE-QUERY", 1, 2, false);
    //declareFunction(myName, "inference_recursive_query_unique_bindings", "INFERENCE-RECURSIVE-QUERY-UNIQUE-BINDINGS", 1, 2, false);
    //declareFunction(myName, "inference_recursive_ask_unique_bindings", "INFERENCE-RECURSIVE-ASK-UNIQUE-BINDINGS", 1, 5, false);
    //declareFunction(myName, "inference_recursive_query_convert_to_hl_bindings", "INFERENCE-RECURSIVE-QUERY-CONVERT-TO-HL-BINDINGS", 2, 0, false);
    //declareFunction(myName, "inference_literal_truth", "INFERENCE-LITERAL-TRUTH", 2, 0, false);
    //declareFunction(myName, "inference_literal_ask", "INFERENCE-LITERAL-ASK", 2, 0, false);
    //declareFunction(myName, "the_set_of_elements", "THE-SET-OF-ELEMENTS", 1, 2, false);
    //declareFunction(myName, "the_set_of_problem_solvable_via_generalized_queryP", "THE-SET-OF-PROBLEM-SOLVABLE-VIA-GENERALIZED-QUERY?", 0, 2, false);
    //declareFunction(myName, "the_set_of_elements_via_generalized_query", "THE-SET-OF-ELEMENTS-VIA-GENERALIZED-QUERY", 0, 2, false);
    //declareFunction(myName, "compute_the_set_of_elements_generalized_query", "COMPUTE-THE-SET-OF-ELEMENTS-GENERALIZED-QUERY", 0, 1, false);
    //declareFunction(myName, "find_unrestricted_problem_of_the_set_of_expression_problem", "FIND-UNRESTRICTED-PROBLEM-OF-THE-SET-OF-EXPRESSION-PROBLEM", 1, 0, false);
    //declareFunction(myName, "find_jo_link_and_focal_problem_of_supported_problem", "FIND-JO-LINK-AND-FOCAL-PROBLEM-OF-SUPPORTED-PROBLEM", 1, 0, false);
    //declareFunction(myName, "the_set_of_elements_generalized_query_memoized_internal", "THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED-INTERNAL", 2, 0, false);
    //declareFunction(myName, "the_set_of_elements_generalized_query_memoized", "THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED", 2, 0, false);
    //declareFunction(myName, "cyc_query_with_minimal_required_transformation", "CYC-QUERY-WITH-MINIMAL-REQUIRED-TRANSFORMATION", 1, 2, false);
    return NIL;
  }

  public static final SubLObject init_ask_utilities_file() {
    $recursive_queries_in_currently_active_problem_storeP$ = defvar("*RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?*", T);
    $max_recursive_query_depth$ = deflexical("*MAX-RECURSIVE-QUERY-DEPTH*", $int56$27);
    $recursive_query_depth$ = defparameter("*RECURSIVE-QUERY-DEPTH*", NIL);
    return NIL;
  }

  public static final SubLObject setup_ask_utilities_file() {
    // CVS_ID("Id: ask-utilities.lisp 128695 2009-09-02 21:55:44Z jantos ");
    utilities_macros.register_cyc_api_function($sym26$QUERY_JUSTIFIED, $list27, $str28$Ask_for_bindings_for_free_variabl, NIL, $list29);
    utilities_macros.register_obsolete_cyc_api_function($sym30$ASK_JUSTIFIED, $list31, $list32, $str33$Ask_for_bindings_for_free_variabl, NIL, $list29);
    utilities_macros.register_cyc_api_function($sym34$QUERY_TEMPLATE, $list35, $str36$Ask_SENTENCE_in_MT___Return_resul, NIL, $list29);
    utilities_macros.register_obsolete_cyc_api_function($sym37$ASK_TEMPLATE, $list38, $list39, $str40$Ask_SENTENCE_in_MT___Return_resul, NIL, $list29);
    utilities_macros.register_cyc_api_function($sym41$QUERY_VARIABLE, $list42, $str43$Ask_SENTENCE_in_MT_treating_VARIA, NIL, $list29);
    utilities_macros.register_obsolete_cyc_api_function($sym44$ASK_VARIABLE, $list45, $list46, $str47$Ask_SENTENCE_in_MT_treating_VARIA, NIL, $list29);
    utilities_macros.register_cyc_api_function($sym48$QUERY_TEMPLATE_EVAL, $list35, $str49$Ask_SENTENCE_in_MT_under_the_reso, NIL, $list50);
    utilities_macros.register_obsolete_cyc_api_function($sym51$ASK_TEMPLATE_EVAL, $list52, $list39, $str53$Ask_SENTENCE_in_MT_under_the_reso, NIL, $list50);
    memoization_state.note_memoized_function($sym72$THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");
  public static final SubLSymbol $kw1$MAX_NUMBER = makeKeyword("MAX-NUMBER");
  public static final SubLSymbol $kw2$MAX_TIME = makeKeyword("MAX-TIME");
  public static final SubLSymbol $kw3$MAX_PROOF_DEPTH = makeKeyword("MAX-PROOF-DEPTH");
  public static final SubLSymbol $kw4$CACHE_INFERENCE_RESULTS_ = makeKeyword("CACHE-INFERENCE-RESULTS?");
  public static final SubLSymbol $kw5$ANSWER_LANGUAGE = makeKeyword("ANSWER-LANGUAGE");
  public static final SubLSymbol $kw6$EL = makeKeyword("EL");
  public static final SubLSymbol $kw7$HL = makeKeyword("HL");
  public static final SubLSymbol $kw8$ALLOWED_RULES = makeKeyword("ALLOWED-RULES");
  public static final SubLSymbol $kw9$ALL = makeKeyword("ALL");
  public static final SubLSymbol $sym10$INFERENCE_RETURN_BLISTS = makeSymbol("INFERENCE-RETURN-BLISTS");
  public static final SubLSymbol $kw11$RETURN = makeKeyword("RETURN");
  public static final SubLSymbol $kw12$BINDINGS = makeKeyword("BINDINGS");
  public static final SubLSymbol $kw13$RESULT_UNIQUENESS = makeKeyword("RESULT-UNIQUENESS");
  public static final SubLSymbol $sym14$INFERENCE_RETURN_BLISTS_AND_SUPPORTS = makeSymbol("INFERENCE-RETURN-BLISTS-AND-SUPPORTS");
  public static final SubLSymbol $kw15$BINDINGS_AND_SUPPORTS = makeKeyword("BINDINGS-AND-SUPPORTS");
  public static final SubLSymbol $kw16$PROOF = makeKeyword("PROOF");
  public static final SubLSymbol $sym17$INFERENCE_RETURN_TEMPLATE = makeSymbol("INFERENCE-RETURN-TEMPLATE");
  public static final SubLSymbol $kw18$TEMPLATE = makeKeyword("TEMPLATE");
  public static final SubLSymbol $kw19$ALLOW_HL_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-HL-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw20$ALLOW_UNBOUND_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-UNBOUND-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw21$ALLOW_EVALUATABLE_PREDICATE_TRANSFORMATION_ = makeKeyword("ALLOW-EVALUATABLE-PREDICATE-TRANSFORMATION?");
  public static final SubLSymbol $kw22$PRODUCTIVITY_LIMIT = makeKeyword("PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $kw23$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
  public static final SubLSymbol $kw24$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");
  public static final SubLInteger $int25$100 = makeInteger(100);
  public static final SubLSymbol $sym26$QUERY_JUSTIFIED = makeSymbol("QUERY-JUSTIFIED");
  public static final SubLList $list27 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));
  public static final SubLString $str28$Ask_for_bindings_for_free_variabl = makeString("Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   Returns a list of binding and justificaion pairs.");
  public static final SubLList $list29 = list(makeSymbol("LISTP"), makeSymbol("QUERY-HALT-REASON-P"));
  public static final SubLSymbol $sym30$ASK_JUSTIFIED = makeSymbol("ASK-JUSTIFIED");
  public static final SubLList $list31 = list(makeSymbol("QUERY-JUSTIFIED"));
  public static final SubLList $list32 = list(makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));
  public static final SubLString $str33$Ask_for_bindings_for_free_variabl = makeString("Ask for bindings for free variables which will satisfy SENTENCE within MT.\n   Returns bindings and HL supports.\n   If BACKCHAIN is NIL, no inference is performed.\n   If BACKCHAIN is an integer, then at most that many backchaining steps using rules\n   are performed.\n   If BACKCHAIN is T, then inference is performed without limit on the number of\n   backchaining steps when searching for bindings.\n   If NUMBER is an integer, then at most that number of bindings are returned.\n   If TIME is an integer, then at most TIME seconds are consumed by the search for bindings.\n   If DEPTH is an integer, then the inference paths are limited to that number of total steps.\n   Returns a list of binding and justificaion pairs.\n   Deprecated in favor of query-justified.");
  public static final SubLSymbol $sym34$QUERY_TEMPLATE = makeSymbol("QUERY-TEMPLATE");
  public static final SubLList $list35 = list(makeSymbol("TEMPLATE"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));
  public static final SubLString $str36$Ask_SENTENCE_in_MT___Return_resul = makeString("Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.");
  public static final SubLSymbol $sym37$ASK_TEMPLATE = makeSymbol("ASK-TEMPLATE");
  public static final SubLList $list38 = list(makeSymbol("QUERY-TEMPLATE"));
  public static final SubLList $list39 = list(makeSymbol("TEMPLATE"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));
  public static final SubLString $str40$Ask_SENTENCE_in_MT___Return_resul = makeString("Ask SENTENCE in MT.  Return results of substituting bindings into TEMPLATE.\n   Deprecated in favor of query-template.");
  public static final SubLSymbol $sym41$QUERY_VARIABLE = makeSymbol("QUERY-VARIABLE");
  public static final SubLList $list42 = list(makeSymbol("VARIABLE-TOKEN"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("QUERY-PROPERTIES"));
  public static final SubLString $str43$Ask_SENTENCE_in_MT_treating_VARIA = makeString("Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired.");
  public static final SubLSymbol $sym44$ASK_VARIABLE = makeSymbol("ASK-VARIABLE");
  public static final SubLList $list45 = list(makeSymbol("QUERY-VARIABLE"));
  public static final SubLList $list46 = list(makeSymbol("VARIABLE-TOKEN"), makeSymbol("SENTENCE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));
  public static final SubLString $str47$Ask_SENTENCE_in_MT_treating_VARIA = makeString("Ask SENTENCE in MT treating VARIABLE-TOKEN as an indicator of the one\n   free variable for which a list of answers is desired.\n   Deprecated in favor of query-variable.");
  public static final SubLSymbol $sym48$QUERY_TEMPLATE_EVAL = makeSymbol("QUERY-TEMPLATE-EVAL");
  public static final SubLString $str49$Ask_SENTENCE_in_MT_under_the_reso = makeString("Ask SENTENCE in MT under the resource constraints query-properties\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed.");
  public static final SubLList $list50 = list(makeSymbol("NON-NEGATIVE-INTEGER-P"));
  public static final SubLSymbol $sym51$ASK_TEMPLATE_EVAL = makeSymbol("ASK-TEMPLATE-EVAL");
  public static final SubLList $list52 = list(makeSymbol("QUERY-TEMPLATE-EVAL"));
  public static final SubLString $str53$Ask_SENTENCE_in_MT_under_the_reso = makeString("Ask SENTENCE in MT under the resource constraints BACKCHAIN NUMBER TIME DEPTH\n TEMPLATE is a SubL template which is evaluated once for each set of bindings returned.\n The bindings are substitued into TEMPLATE before evaluation.\n Returns a count of the number of evaluations performed.\n Deprecated in favor of query-template-eval.");
  public static final SubLSymbol $kw54$NONE = makeKeyword("NONE");
  public static final SubLSymbol $kw55$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
  public static final SubLInteger $int56$27 = makeInteger(27);
  public static final SubLSymbol $kw57$PROBABLY_APPROXIMATELY_DONE = makeKeyword("PROBABLY-APPROXIMATELY-DONE");
  public static final SubLString $str58$max_recursive_query_depth_of__s_e = makeString("max recursive query depth of ~s exceeded with query ~s in mt ~s");
  public static final SubLString $str59$Either_deeper_thought_is_required = makeString("Either deeper thought is required to answer this query, or it is a paradox.");
  public static final SubLSymbol $sym60$QUEUE_P = makeSymbol("QUEUE-P");
  public static final SubLSymbol $sym61$QUERY_PROPERTY_INHERITED_BY_RECURSIVE_QUERY_ = makeSymbol("QUERY-PROPERTY-INHERITED-BY-RECURSIVE-QUERY?");
  public static final SubLSymbol $kw62$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
  public static final SubLList $list63 = list(makeKeyword("SUPPORTS"));
  public static final SubLSymbol $kw64$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw65$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $kw66$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLList $list67 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);
  public static final SubLList $list68 = list(makeSymbol("VARIABLE"), makeSymbol("QUERY"));
  public static final SubLSymbol $sym69$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym70$EL_INTENSIONAL_SET_P = makeSymbol("EL-INTENSIONAL-SET-P");
  public static final SubLSymbol $sym71$JOIN_ORDERED_LINK_P = makeSymbol("JOIN-ORDERED-LINK-P");
  public static final SubLSymbol $sym72$THE_SET_OF_ELEMENTS_GENERALIZED_QUERY_MEMOIZED = makeSymbol("THE-SET-OF-ELEMENTS-GENERALIZED-QUERY-MEMOIZED");
  public static final SubLSymbol $kw73$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $kw74$CONTINUABLE_ = makeKeyword("CONTINUABLE?");
  public static final SubLSymbol $kw75$EXHAUST = makeKeyword("EXHAUST");

  //// Initializers

  public void declareFunctions() {
    declare_ask_utilities_file();
  }

  public void initializeVariables() {
    init_ask_utilities_file();
  }

  public void runTopLevelForms() {
    setup_ask_utilities_file();
  }

}
