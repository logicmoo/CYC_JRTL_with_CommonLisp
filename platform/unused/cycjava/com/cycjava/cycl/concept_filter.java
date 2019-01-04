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

package  com.cyc.cycjava.cycl;

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
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class concept_filter extends SubLTranslatedFile {

  //// Constructor

  private concept_filter() {}
  public static final SubLFile me = new concept_filter();
  public static final String myName = "com.cyc.cycjava.cycl.concept_filter";

  //// Definitions

  /** If no mt is specified, what Mt should be used for semantic tests for a concept-filter */
  @SubL(source = "cycl/concept-filter.lisp", position = 1242) 
  private static SubLSymbol $concept_filter_default_mt$ = null;

  @SubL(source = "cycl/concept-filter.lisp", position = 1400) 
  public static SubLSymbol $default_concept_filter$ = null;

  @SubL(source = "cycl/concept-filter.lisp", position = 1497) 
  private static SubLSymbol $default_concept_filter_specification$ = null;

  @SubL(source = "cycl/concept-filter.lisp", position = 1564) 
  public static SubLSymbol $concept_filter_memoization_state$ = null;

  @SubL(source = "cycl/concept-filter.lisp", position = 2003) 
  private static SubLSymbol $concept_filter_specification_p_caching_state$ = null;

  @SubL(source = "cycl/concept-filter.lisp", position = 3310) 
  private static SubLSymbol $concept_filter_all_isa_caching_state$ = null;

  public static final class $clear_concept_filter_all_isa$ZeroArityFunction extends ZeroArityFunction {
    public $clear_concept_filter_all_isa$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-CONCEPT-FILTER-ALL-ISA")); }
    public SubLObject processItem() { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5465"); }
  }

  @SubL(source = "cycl/concept-filter.lisp", position = 3832) 
  private static SubLSymbol $specified_nodes_in_filter_caching_state$ = null;

  @SubL(source = "cycl/concept-filter.lisp", position = 6662) 
  private static SubLSymbol $nodes_suppressed_from_filter_caching_state$ = null;

  public static final class $clear_nodes_suppressed_from_filter$ZeroArityFunction extends ZeroArityFunction {
    public $clear_nodes_suppressed_from_filter$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-NODES-SUPPRESSED-FROM-FILTER")); }
    public SubLObject processItem() { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 5466"); }
  }

  @SubL(source = "cycl/concept-filter.lisp", position = 6890) 
  private static SubLSymbol $organizing_nodes_for_filter_caching_state$ = null;

  @SubL(source = "cycl/concept-filter.lisp", position = 7354) 
  private static SubLSymbol $filter_defn_caching_state$ = null;

  @SubL(source = "cycl/concept-filter.lisp", position = 8149) 
  private static SubLSymbol $bad_for_taggingP_caching_state$ = null;

  @SubL(source = "cycl/concept-filter.lisp", position = 11092) 
  private static SubLSymbol $decompose_concept_filter_spec_caching_state$ = null;

  public static final SubLObject declare_concept_filter_file() {
    //declareFunction(myName, "clear_concept_filter_caches", "CLEAR-CONCEPT-FILTER-CACHES", 0, 0, false);
    //declareMacro(myName, "with_new_concept_filter_memoization_state", "WITH-NEW-CONCEPT-FILTER-MEMOIZATION-STATE");
    //declareMacro(myName, "with_concept_filter_memoization_state", "WITH-CONCEPT-FILTER-MEMOIZATION-STATE");
    //declareFunction(myName, "clear_concept_filter_specification_p", "CLEAR-CONCEPT-FILTER-SPECIFICATION-P", 0, 0, false);
    //declareFunction(myName, "remove_concept_filter_specification_p", "REMOVE-CONCEPT-FILTER-SPECIFICATION-P", 1, 0, false);
    //declareFunction(myName, "concept_filter_specification_p_internal", "CONCEPT-FILTER-SPECIFICATION-P-INTERNAL", 1, 0, false);
    //declareFunction(myName, "concept_filter_specification_p", "CONCEPT-FILTER-SPECIFICATION-P", 1, 0, false);
    //declareFunction(myName, "get_default_concept_filter_specification", "GET-DEFAULT-CONCEPT-FILTER-SPECIFICATION", 0, 0, false);
    //declareFunction(myName, "nodes_for_concept_filter_after_adding", "NODES-FOR-CONCEPT-FILTER-AFTER-ADDING", 2, 0, false);
    //declareFunction(myName, "nodes_for_concept_filter_after_removing", "NODES-FOR-CONCEPT-FILTER-AFTER-REMOVING", 2, 0, false);
    //declareFunction(myName, "clear_concept_filter_all_isa", "CLEAR-CONCEPT-FILTER-ALL-ISA", 0, 0, false); new $clear_concept_filter_all_isa$ZeroArityFunction();
    //declareFunction(myName, "remove_concept_filter_all_isa", "REMOVE-CONCEPT-FILTER-ALL-ISA", 2, 0, false);
    //declareFunction(myName, "concept_filter_all_isa_internal", "CONCEPT-FILTER-ALL-ISA-INTERNAL", 2, 0, false);
    //declareFunction(myName, "concept_filter_all_isa", "CONCEPT-FILTER-ALL-ISA", 2, 0, false);
    //declareFunction(myName, "clear_specified_nodes_in_filter", "CLEAR-SPECIFIED-NODES-IN-FILTER", 0, 0, false);
    //declareFunction(myName, "remove_specified_nodes_in_filter", "REMOVE-SPECIFIED-NODES-IN-FILTER", 2, 0, false);
    //declareFunction(myName, "specified_nodes_in_filter_internal", "SPECIFIED-NODES-IN-FILTER-INTERNAL", 2, 0, false);
    //declareFunction(myName, "specified_nodes_in_filter", "SPECIFIED-NODES-IN-FILTER", 2, 0, false);
    //declareFunction(myName, "specified_nodes_in_filter_cached_p", "SPECIFIED-NODES-IN-FILTER-CACHED-P", 2, 0, false);
    //declareFunction(myName, "specified_node_in_filterP", "SPECIFIED-NODE-IN-FILTER?", 1, 2, false);
    //declareFunction(myName, "query_for_individual_terms_from_filterP", "QUERY-FOR-INDIVIDUAL-TERMS-FROM-FILTER?", 1, 0, false);
    //declareFunction(myName, "node_suppressed_from_filterP", "NODE-SUPPRESSED-FROM-FILTER?", 3, 0, false);
    //declareFunction(myName, "clear_nodes_suppressed_from_filter", "CLEAR-NODES-SUPPRESSED-FROM-FILTER", 0, 0, false); new $clear_nodes_suppressed_from_filter$ZeroArityFunction();
    //declareFunction(myName, "remove_nodes_suppressed_from_filter", "REMOVE-NODES-SUPPRESSED-FROM-FILTER", 2, 0, false);
    //declareFunction(myName, "nodes_suppressed_from_filter_internal", "NODES-SUPPRESSED-FROM-FILTER-INTERNAL", 2, 0, false);
    //declareFunction(myName, "nodes_suppressed_from_filter", "NODES-SUPPRESSED-FROM-FILTER", 2, 0, false);
    //declareFunction(myName, "clear_organizing_nodes_for_filter", "CLEAR-ORGANIZING-NODES-FOR-FILTER", 0, 0, false);
    //declareFunction(myName, "remove_organizing_nodes_for_filter", "REMOVE-ORGANIZING-NODES-FOR-FILTER", 2, 0, false);
    //declareFunction(myName, "organizing_nodes_for_filter_internal", "ORGANIZING-NODES-FOR-FILTER-INTERNAL", 2, 0, false);
    //declareFunction(myName, "organizing_nodes_for_filter", "ORGANIZING-NODES-FOR-FILTER", 2, 0, false);
    //declareFunction(myName, "complete_extent_should_be_queried_from_kbP", "COMPLETE-EXTENT-SHOULD-BE-QUERIED-FROM-KB?", 1, 0, false);
    //declareFunction(myName, "decision_tree_filterP", "DECISION-TREE-FILTER?", 1, 0, false);
    //declareFunction(myName, "clear_filter_defn", "CLEAR-FILTER-DEFN", 0, 0, false);
    //declareFunction(myName, "remove_filter_defn", "REMOVE-FILTER-DEFN", 2, 0, false);
    //declareFunction(myName, "filter_defn_internal", "FILTER-DEFN-INTERNAL", 2, 0, false);
    //declareFunction(myName, "filter_defn", "FILTER-DEFN", 2, 0, false);
    //declareFunction(myName, "concept_tagging_irrelevant_termP", "CONCEPT-TAGGING-IRRELEVANT-TERM?", 1, 0, false);
    //declareFunction(myName, "predicate_filter_tagging_defn", "PREDICATE-FILTER-TAGGING-DEFN", 2, 1, false);
    //declareFunction(myName, "bad_for_tagging_defn", "BAD-FOR-TAGGING-DEFN", 2, 1, false);
    //declareFunction(myName, "clear_bad_for_taggingP", "CLEAR-BAD-FOR-TAGGING?", 0, 0, false);
    //declareFunction(myName, "remove_bad_for_taggingP", "REMOVE-BAD-FOR-TAGGING?", 1, 1, false);
    //declareFunction(myName, "bad_for_taggingP_internal", "BAD-FOR-TAGGING?-INTERNAL", 2, 0, false);
    //declareFunction(myName, "bad_for_taggingP", "BAD-FOR-TAGGING?", 1, 1, false);
    //declareFunction(myName, "organizing_node_for_filterP", "ORGANIZING-NODE-FOR-FILTER?", 1, 2, false);
    //declareFunction(myName, "valid_concept_filter_nodes", "VALID-CONCEPT-FILTER-NODES", 1, 1, false);
    //declareFunction(myName, "valid_concept_filter_nodes_memoized_internal", "VALID-CONCEPT-FILTER-NODES-MEMOIZED-INTERNAL", 2, 0, false);
    //declareFunction(myName, "valid_concept_filter_nodes_memoized", "VALID-CONCEPT-FILTER-NODES-MEMOIZED", 2, 0, false);
    //declareFunction(myName, "clear_decompose_concept_filter_spec", "CLEAR-DECOMPOSE-CONCEPT-FILTER-SPEC", 0, 0, false);
    //declareFunction(myName, "remove_decompose_concept_filter_spec", "REMOVE-DECOMPOSE-CONCEPT-FILTER-SPEC", 1, 1, false);
    //declareFunction(myName, "decompose_concept_filter_spec_internal", "DECOMPOSE-CONCEPT-FILTER-SPEC-INTERNAL", 2, 0, false);
    //declareFunction(myName, "decompose_concept_filter_spec", "DECOMPOSE-CONCEPT-FILTER-SPEC", 1, 1, false);
    //declareFunction(myName, "decompose_concept_filter_spec_new", "DECOMPOSE-CONCEPT-FILTER-SPEC-NEW", 2, 0, false);
    //declareFunction(myName, "decompose_concept_filter_spec_old", "DECOMPOSE-CONCEPT-FILTER-SPEC-OLD", 2, 0, false);
    //declareFunction(myName, "concept_filter_specification_filter", "CONCEPT-FILTER-SPECIFICATION-FILTER", 1, 1, false);
    //declareFunction(myName, "new_adhoc_concept_filter_spec", "NEW-ADHOC-CONCEPT-FILTER-SPEC", 1, 1, false);
    //declareFunction(myName, "new_adhoc_isa_concept_filter_spec", "NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC", 1, 1, false);
    //declareFunction(myName, "new_adhoc_genls_concept_filter_spec", "NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_concept_filter_file() {
    $concept_filter_default_mt$ = defparameter("*CONCEPT-FILTER-DEFAULT-MT*", $const0$InferencePSC);
    $default_concept_filter$ = defparameter("*DEFAULT-CONCEPT-FILTER*", $const1$TaxonomyOfEasilyUnderstandableCon);
    $default_concept_filter_specification$ = defparameter("*DEFAULT-CONCEPT-FILTER-SPECIFICATION*", NIL);
    $concept_filter_memoization_state$ = defparameter("*CONCEPT-FILTER-MEMOIZATION-STATE*", NIL);
    $concept_filter_specification_p_caching_state$ = deflexical("*CONCEPT-FILTER-SPECIFICATION-P-CACHING-STATE*", NIL);
    $concept_filter_all_isa_caching_state$ = deflexical("*CONCEPT-FILTER-ALL-ISA-CACHING-STATE*", NIL);
    $specified_nodes_in_filter_caching_state$ = deflexical("*SPECIFIED-NODES-IN-FILTER-CACHING-STATE*", NIL);
    $nodes_suppressed_from_filter_caching_state$ = deflexical("*NODES-SUPPRESSED-FROM-FILTER-CACHING-STATE*", NIL);
    $organizing_nodes_for_filter_caching_state$ = deflexical("*ORGANIZING-NODES-FOR-FILTER-CACHING-STATE*", NIL);
    $filter_defn_caching_state$ = deflexical("*FILTER-DEFN-CACHING-STATE*", NIL);
    $bad_for_taggingP_caching_state$ = deflexical("*BAD-FOR-TAGGING?-CACHING-STATE*", NIL);
    $decompose_concept_filter_spec_caching_state$ = deflexical("*DECOMPOSE-CONCEPT-FILTER-SPEC-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_concept_filter_file() {
    // CVS_ID("Id: concept-filter.lisp 128019 2009-06-17 16:11:46Z builder ");
    memoization_state.note_globally_cached_function($sym6$CONCEPT_FILTER_SPECIFICATION_P);
    utilities_macros.register_kb_function($sym14$NODES_FOR_CONCEPT_FILTER_AFTER_ADDING);
    utilities_macros.register_kb_function($sym15$NODES_FOR_CONCEPT_FILTER_AFTER_REMOVING);
    memoization_state.note_globally_cached_function($sym16$CONCEPT_FILTER_ALL_ISA);
    memoization_state.note_globally_cached_function($sym23$SPECIFIED_NODES_IN_FILTER);
    memoization_state.note_globally_cached_function($sym46$NODES_SUPPRESSED_FROM_FILTER);
    memoization_state.note_globally_cached_function($sym52$ORGANIZING_NODES_FOR_FILTER);
    memoization_state.note_globally_cached_function($sym56$FILTER_DEFN);
    utilities_macros.register_kb_function($sym64$CONCEPT_TAGGING_IRRELEVANT_TERM_);
    memoization_state.note_globally_cached_function($sym65$BAD_FOR_TAGGING_);
    memoization_state.note_memoized_function($sym69$VALID_CONCEPT_FILTER_NODES_MEMOIZED);
    memoization_state.note_globally_cached_function($sym71$DECOMPOSE_CONCEPT_FILTER_SPEC);
    access_macros.register_external_symbol($sym93$NEW_ADHOC_CONCEPT_FILTER_SPEC);
    access_macros.register_external_symbol($sym98$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC);
    access_macros.register_external_symbol($sym104$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLObject $const1$TaxonomyOfEasilyUnderstandableCon = constant_handles.reader_make_constant_shell(makeString("TaxonomyOfEasilyUnderstandableConcepts"));
  public static final SubLSymbol $sym2$CLET = makeSymbol("CLET");
  public static final SubLList $list3 = list(list(makeSymbol("*CONCEPT-FILTER-MEMOIZATION-STATE*"), list(makeSymbol("NEW-MEMOIZATION-STATE"))));
  public static final SubLSymbol $sym4$WITH_MEMOIZATION_STATE = makeSymbol("WITH-MEMOIZATION-STATE");
  public static final SubLList $list5 = list(makeSymbol("*CONCEPT-FILTER-MEMOIZATION-STATE*"));
  public static final SubLSymbol $sym6$CONCEPT_FILTER_SPECIFICATION_P = makeSymbol("CONCEPT-FILTER-SPECIFICATION-P");
  public static final SubLObject $const7$ConceptFilterSpecificationFn = constant_handles.reader_make_constant_shell(makeString("ConceptFilterSpecificationFn"));
  public static final SubLObject $const8$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLList $list9 = list(constant_handles.reader_make_constant_shell(makeString("ConceptFilterSpecification")));
  public static final SubLSymbol $sym10$_CONCEPT_FILTER_SPECIFICATION_P_CACHING_STATE_ = makeSymbol("*CONCEPT-FILTER-SPECIFICATION-P-CACHING-STATE*");
  public static final SubLInteger $int11$50 = makeInteger(50);
  public static final SubLSymbol $kw12$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLList $list13 = list(constant_handles.reader_make_constant_shell(makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell(makeString("TriggerFromConcept")));
  public static final SubLSymbol $sym14$NODES_FOR_CONCEPT_FILTER_AFTER_ADDING = makeSymbol("NODES-FOR-CONCEPT-FILTER-AFTER-ADDING");
  public static final SubLSymbol $sym15$NODES_FOR_CONCEPT_FILTER_AFTER_REMOVING = makeSymbol("NODES-FOR-CONCEPT-FILTER-AFTER-REMOVING");
  public static final SubLSymbol $sym16$CONCEPT_FILTER_ALL_ISA = makeSymbol("CONCEPT-FILTER-ALL-ISA");
  public static final SubLSymbol $sym17$NART_SUBSTITUTE = makeSymbol("NART-SUBSTITUTE");
  public static final SubLSymbol $sym18$_VAR0 = makeSymbol("?VAR0");
  public static final SubLList $list19 = list(makeSymbol("?VAR0"));
  public static final SubLSymbol $sym20$_CONCEPT_FILTER_ALL_ISA_CACHING_STATE_ = makeSymbol("*CONCEPT-FILTER-ALL-ISA-CACHING-STATE*");
  public static final SubLInteger $int21$500 = makeInteger(500);
  public static final SubLSymbol $sym22$CLEAR_CONCEPT_FILTER_ALL_ISA = makeSymbol("CLEAR-CONCEPT-FILTER-ALL-ISA");
  public static final SubLSymbol $sym23$SPECIFIED_NODES_IN_FILTER = makeSymbol("SPECIFIED-NODES-IN-FILTER");
  public static final SubLSymbol $sym24$_X = makeSymbol("?X");
  public static final SubLObject $const25$nodeInSystem = constant_handles.reader_make_constant_shell(makeString("nodeInSystem"));
  public static final SubLList $list26 = list(makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL"));
  public static final SubLString $str27$collectionAndSpecsInConceptFilter = makeString("collectionAndSpecsInConceptFilter");
  public static final SubLSymbol $kw28$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw29$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw30$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw31$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw32$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym33$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw34$ERROR = makeKeyword("ERROR");
  public static final SubLString $str35$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym36$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw37$CERROR = makeKeyword("CERROR");
  public static final SubLString $str38$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw39$WARN = makeKeyword("WARN");
  public static final SubLString $str40$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const41$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLString $str42$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str43$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym44$_SPECIFIED_NODES_IN_FILTER_CACHING_STATE_ = makeSymbol("*SPECIFIED-NODES-IN-FILTER-CACHING-STATE*");
  public static final SubLObject $const45$TheSetOf = constant_handles.reader_make_constant_shell(makeString("TheSetOf"));
  public static final SubLSymbol $sym46$NODES_SUPPRESSED_FROM_FILTER = makeSymbol("NODES-SUPPRESSED-FROM-FILTER");
  public static final SubLSymbol $sym47$_NODE = makeSymbol("?NODE");
  public static final SubLObject $const48$suppressIndividualNode = constant_handles.reader_make_constant_shell(makeString("suppressIndividualNode"));
  public static final SubLList $list49 = list(makeSymbol("?NODE"));
  public static final SubLSymbol $sym50$_NODES_SUPPRESSED_FROM_FILTER_CACHING_STATE_ = makeSymbol("*NODES-SUPPRESSED-FROM-FILTER-CACHING-STATE*");
  public static final SubLSymbol $sym51$CLEAR_NODES_SUPPRESSED_FROM_FILTER = makeSymbol("CLEAR-NODES-SUPPRESSED-FROM-FILTER");
  public static final SubLSymbol $sym52$ORGANIZING_NODES_FOR_FILTER = makeSymbol("ORGANIZING-NODES-FOR-FILTER");
  public static final SubLObject $const53$classifyingNodeInFilter = constant_handles.reader_make_constant_shell(makeString("classifyingNodeInFilter"));
  public static final SubLSymbol $sym54$_ORGANIZING_NODES_FOR_FILTER_CACHING_STATE_ = makeSymbol("*ORGANIZING-NODES-FOR-FILTER-CACHING-STATE*");
  public static final SubLObject $const55$DecisionTreeConceptFilter = constant_handles.reader_make_constant_shell(makeString("DecisionTreeConceptFilter"));
  public static final SubLSymbol $sym56$FILTER_DEFN = makeSymbol("FILTER-DEFN");
  public static final SubLSymbol $sym57$BAD_FOR_TAGGING_DEFN = makeSymbol("BAD-FOR-TAGGING-DEFN");
  public static final SubLObject $const58$PredicateTaxonomy = constant_handles.reader_make_constant_shell(makeString("PredicateTaxonomy"));
  public static final SubLSymbol $sym59$PREDICATE_FILTER_TAGGING_DEFN = makeSymbol("PREDICATE-FILTER-TAGGING-DEFN");
  public static final SubLObject $const60$TheCycOntology = constant_handles.reader_make_constant_shell(makeString("TheCycOntology"));
  public static final SubLSymbol $sym61$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym62$TERM_FAILS_CLASSIFICATION_TREE_FILTER_ = makeSymbol("TERM-FAILS-CLASSIFICATION-TREE-FILTER?");
  public static final SubLSymbol $sym63$_FILTER_DEFN_CACHING_STATE_ = makeSymbol("*FILTER-DEFN-CACHING-STATE*");
  public static final SubLSymbol $sym64$CONCEPT_TAGGING_IRRELEVANT_TERM_ = makeSymbol("CONCEPT-TAGGING-IRRELEVANT-TERM?");
  public static final SubLSymbol $sym65$BAD_FOR_TAGGING_ = makeSymbol("BAD-FOR-TAGGING?");
  public static final SubLList $list66 = list(constant_handles.reader_make_constant_shell(makeString("InstanceNamedFn")), constant_handles.reader_make_constant_shell(makeString("InstanceNamedFn-Ternary")), constant_handles.reader_make_constant_shell(makeString("ThingDescribableAsFn")), constant_handles.reader_make_constant_shell(makeString("Kappa")));
  public static final SubLSymbol $sym67$_BAD_FOR_TAGGING__CACHING_STATE_ = makeSymbol("*BAD-FOR-TAGGING?-CACHING-STATE*");
  public static final SubLString $str68$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLSymbol $sym69$VALID_CONCEPT_FILTER_NODES_MEMOIZED = makeSymbol("VALID-CONCEPT-FILTER-NODES-MEMOIZED");
  public static final SubLList $list70 = list(makeSymbol("CONCEPT-FILTER"), makeSymbol("ALLOW-SPECS"), makeSymbol("ALLOW-INSTANCES"), makeSymbol("RETURN-INSTANCES"), makeSymbol("MT"));
  public static final SubLSymbol $sym71$DECOMPOSE_CONCEPT_FILTER_SPEC = makeSymbol("DECOMPOSE-CONCEPT-FILTER-SPEC");
  public static final SubLObject $const72$conceptFilterSpecificationFilter = constant_handles.reader_make_constant_shell(makeString("conceptFilterSpecificationFilter"));
  public static final SubLSymbol $sym73$_DECOMPOSE_CONCEPT_FILTER_SPEC_CACHING_STATE_ = makeSymbol("*DECOMPOSE-CONCEPT-FILTER-SPEC-CACHING-STATE*");
  public static final SubLSymbol $sym74$_MT = makeSymbol("?MT");
  public static final SubLObject $const75$conceptFilterSpecificationDefinin = constant_handles.reader_make_constant_shell(makeString("conceptFilterSpecificationDefiningMt"));
  public static final SubLList $list76 = list(makeSymbol("?MT"));
  public static final SubLSymbol $kw77$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
  public static final SubLSymbol $sym78$_TRIGGER = makeSymbol("?TRIGGER");
  public static final SubLObject $const79$conceptFilterSpecificationTrigger = constant_handles.reader_make_constant_shell(makeString("conceptFilterSpecificationTrigger"));
  public static final SubLList $list80 = list(makeSymbol("?TRIGGER"));
  public static final SubLList $list81 = list(constant_handles.reader_make_constant_shell(makeString("TriggerFromConceptOrSpec")), constant_handles.reader_make_constant_shell(makeString("TriggerFromConceptSpecOrInstance")));
  public static final SubLList $list82 = list(constant_handles.reader_make_constant_shell(makeString("TriggerFromConceptOrInstance")), constant_handles.reader_make_constant_shell(makeString("TriggerFromConceptSpecOrInstance")));
  public static final SubLSymbol $sym83$_MODE = makeSymbol("?MODE");
  public static final SubLObject $const84$conceptFilterSpecificationMode = constant_handles.reader_make_constant_shell(makeString("conceptFilterSpecificationMode"));
  public static final SubLList $list85 = list(makeSymbol("?MODE"));
  public static final SubLObject $const86$ConceptAndInstancesFilterParamete = constant_handles.reader_make_constant_shell(makeString("ConceptAndInstancesFilterParameter"));
  public static final SubLList $list87 = list(makeSymbol("THIS-FILTER"), makeSymbol("MODE"), makeSymbol("TRIGGER"));
  public static final SubLList $list88 = list(makeSymbol("?FILTER"), makeSymbol("?MODE"), makeSymbol("?TRIGGER"));
  public static final SubLObject $const89$specificationForConceptFilter = constant_handles.reader_make_constant_shell(makeString("specificationForConceptFilter"));
  public static final SubLSymbol $sym90$_FILTER = makeSymbol("?FILTER");
  public static final SubLList $list91 = list(makeKeyword("INFERENCE-MODE"), makeKeyword("SHALLOW"));
  public static final SubLList $list92 = list(makeSymbol("?FILTER"));
  public static final SubLSymbol $sym93$NEW_ADHOC_CONCEPT_FILTER_SPEC = makeSymbol("NEW-ADHOC-CONCEPT-FILTER-SPEC");
  public static final SubLSymbol $sym94$CYCL_TERM_P = makeSymbol("CYCL-TERM-P");
  public static final SubLSymbol $sym95$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLObject $const96$ConceptFilterSpecificationWithMtF = constant_handles.reader_make_constant_shell(makeString("ConceptFilterSpecificationWithMtFn"));
  public static final SubLList $list97 = list(constant_handles.reader_make_constant_shell(makeString("ConceptOnlyFilterParameter")), constant_handles.reader_make_constant_shell(makeString("TriggerFromConcept")), makeSymbol("MT"));
  public static final SubLSymbol $sym98$NEW_ADHOC_ISA_CONCEPT_FILTER_SPEC = makeSymbol("NEW-ADHOC-ISA-CONCEPT-FILTER-SPEC");
  public static final SubLSymbol $sym99$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");
  public static final SubLSymbol $sym100$_TERM = makeSymbol("?TERM");
  public static final SubLObject $const101$ConceptOnlyFilterParameter = constant_handles.reader_make_constant_shell(makeString("ConceptOnlyFilterParameter"));
  public static final SubLObject $const102$TriggerFromConcept = constant_handles.reader_make_constant_shell(makeString("TriggerFromConcept"));
  public static final SubLObject $const103$ConceptFilterSpecificatioFn = constant_handles.reader_make_constant_shell(makeString("ConceptFilterSpecificatioFn"));
  public static final SubLSymbol $sym104$NEW_ADHOC_GENLS_CONCEPT_FILTER_SPEC = makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC");

  //// Initializers

  public void declareFunctions() {
    declare_concept_filter_file();
  }

  public void initializeVariables() {
    init_concept_filter_file();
  }

  public void runTopLevelForms() {
    setup_concept_filter_file();
  }

}
