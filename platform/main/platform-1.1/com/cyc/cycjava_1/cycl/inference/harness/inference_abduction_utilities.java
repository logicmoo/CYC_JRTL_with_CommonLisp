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
//dm import com.cyc.cycjava_1.cycl.arg_type;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.at_macros;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.disjoint_with;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.equals;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_balanced_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_czer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategic_heuristics;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.unification;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.virtual_indexing;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class inference_abduction_utilities extends SubLTranslatedFile {

  //// Constructor

  private inference_abduction_utilities() {}
  public static final SubLFile me = new inference_abduction_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_abduction_utilities";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 945) 
  public static final SubLObject reject_proof_due_to_non_abducible_ruleP(SubLObject link, SubLObject supported_problem, SubLObject subproofs) {
    return makeBoolean(((NIL != inference_datastructures_problem_store.problem_store_abduction_allowedP(inference_datastructures_problem.problem_store(supported_problem)))
           && (NIL != inference_worker_transformation.transformation_link_p(link))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 6923"))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33038"))));
  }

  /** The strategy type that is best suited for an abductive inference. */
  @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 7758) 
  public static SubLSymbol $abductive_strategy_type$ = null;

  @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 11055) 
  public static final SubLObject abductive_strategy_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(object))
           && ($kw20$ABDUCTIVE == inference_datastructures_strategy.strategy_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 13040) 
  private static SubLSymbol $prune_semantically_bad_new_rootsP$ = null;

  /** The set of heuristics used by the Abductive Balanced Tactician for removal. */
  @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 17640) 
  private static SubLSymbol $abductive_tactician_removal_heuristics$ = null;

  /** The set of heuristics used by the Abductive Balanced Tactician for transformation. */
  @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 18012) 
  private static SubLSymbol $abductive_tactician_transformation_heuristics$ = null;

  /** A set of problems that are currently being evaluated for rule-abductive-utility,
to avoid infinite recursion. */
  @SubL(source = "cycl/inference/harness/inference-abduction-utilities.lisp", position = 26741) 
  private static SubLSymbol $heuristic_rule_abductive_utility_problem_recursion_stack$ = null;

  public static final SubLObject declare_inference_abduction_utilities_file() {
    declareFunction(myName, "reject_proof_due_to_non_abducible_ruleP", "REJECT-PROOF-DUE-TO-NON-ABDUCIBLE-RULE?", 3, 0, false);
    declareFunction(myName, "some_abductive_subproofP", "SOME-ABDUCTIVE-SUBPROOF?", 1, 0, false);
    declareFunction(myName, "abduction_allowed_on_asentP", "ABDUCTION-ALLOWED-ON-ASENT?", 1, 2, false);
    declareFunction(myName, "non_abducible_sentenceP", "NON-ABDUCIBLE-SENTENCE?", 2, 0, false);
    declareFunction(myName, "non_abducible_relationP", "NON-ABDUCIBLE-RELATION?", 1, 1, false);
    declareFunction(myName, "non_abducible_predicateP", "NON-ABDUCIBLE-PREDICATE?", 1, 1, false);
    declareFunction(myName, "non_abducible_collectionP", "NON-ABDUCIBLE-COLLECTION?", 1, 1, false);
    declareFunction(myName, "non_abducible_for_argnumP", "NON-ABDUCIBLE-FOR-ARGNUM?", 2, 1, false);
    declareFunction(myName, "non_abducible_wrt_value_in_argnumP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM?", 3, 1, false);
    declareFunction(myName, "non_abducible_wrt_value_in_argnum_via_typeP", "NON-ABDUCIBLE-WRT-VALUE-IN-ARGNUM-VIA-TYPE?", 3, 1, false);
    declareFunction(myName, "valid_abduction_asentP", "VALID-ABDUCTION-ASENT?", 4, 0, false);
    declareFunction(myName, "abduction_admitted_formula", "ABDUCTION-ADMITTED-FORMULA", 2, 0, false);
    declareFunction(myName, "known_to_be_true_or_falseP", "KNOWN-TO-BE-TRUE-OR-FALSE?", 3, 0, false);
    declareFunction(myName, "provably_false_contextualized_isa_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-ISA-ASENT?", 3, 0, false);
    declareFunction(myName, "provably_false_contextualized_tou_asentP", "PROVABLY-FALSE-CONTEXTUALIZED-TOU-ASENT?", 2, 0, false);
    declareFunction(myName, "abductive_strategy_p", "ABDUCTIVE-STRATEGY-P", 1, 0, false);
    declareFunction(myName, "abductive_strategy_initialize", "ABDUCTIVE-STRATEGY-INITIALIZE", 1, 0, false);
    declareFunction(myName, "abductive_strategy_no_strategems_active_wrt_removalP", "ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?", 1, 0, false);
    declareFunction(myName, "abductive_strategy_peek_strategem_wrt_removal", "ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "abductive_strategy_no_new_rootsP", "ABDUCTIVE-STRATEGY-NO-NEW-ROOTS?", 1, 0, false);
    declareFunction(myName, "abductive_strategy_peek_new_root", "ABDUCTIVE-STRATEGY-PEEK-NEW-ROOT", 1, 0, false);
    declareFunction(myName, "abductive_strategy_chooses_to_throw_away_new_rootP", "ABDUCTIVE-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?", 2, 0, false);
    declareFunction(myName, "abductive_strategy_new_root_provably_falseP", "ABDUCTIVE-STRATEGY-NEW-ROOT-PROVABLY-FALSE?", 1, 0, false);
    declareFunction(myName, "abductive_strategy_no_strategems_active_wrt_transformationP", "ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "abductive_strategy_peek_strategem_wrt_transformation", "ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "abductive_strategy_current_contents", "ABDUCTIVE-STRATEGY-CURRENT-CONTENTS", 1, 0, false);
    declareFunction(myName, "abductive_strategy_activate_strategem_wrt_removal", "ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL", 2, 0, false);
    declareFunction(myName, "abductive_strategy_pop_strategem_wrt_removal", "ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-REMOVAL", 1, 0, false);
    declareFunction(myName, "abductive_strategy_add_new_root", "ABDUCTIVE-STRATEGY-ADD-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "abductive_strategy_pop_new_root", "ABDUCTIVE-STRATEGY-POP-NEW-ROOT", 1, 0, false);
    declareFunction(myName, "abductive_strategy_activate_strategem_wrt_transformation", "ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION", 2, 0, false);
    declareFunction(myName, "abductive_strategy_pop_strategem_wrt_transformation", "ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION", 1, 0, false);
    declareFunction(myName, "abductive_tactician_heuristics", "ABDUCTIVE-TACTICIAN-HEURISTICS", 1, 0, false);
    declareMacro(myName, "do_abductive_tactician_strategic_heuristics", "DO-ABDUCTIVE-TACTICIAN-STRATEGIC-HEURISTICS");
    declareFunction(myName, "abductive_tactician_strategic_heuristicP", "ABDUCTIVE-TACTICIAN-STRATEGIC-HEURISTIC?", 2, 0, false);
    declareFunction(myName, "abductive_strategy_removal_strategem_happiness", "ABDUCTIVE-STRATEGY-REMOVAL-STRATEGEM-HAPPINESS", 2, 0, false);
    declareFunction(myName, "abductive_strategy_new_root_happiness", "ABDUCTIVE-STRATEGY-NEW-ROOT-HAPPINESS", 2, 0, false);
    declareFunction(myName, "abductive_strategy_transformation_tactic_happiness", "ABDUCTIVE-STRATEGY-TRANSFORMATION-TACTIC-HAPPINESS", 2, 0, false);
    declareFunction(myName, "abductive_strategy_transformation_link_happiness", "ABDUCTIVE-STRATEGY-TRANSFORMATION-LINK-HAPPINESS", 2, 0, false);
    declareFunction(myName, "abductive_strategy_logical_tactic_transformation_happiness", "ABDUCTIVE-STRATEGY-LOGICAL-TACTIC-TRANSFORMATION-HAPPINESS", 2, 0, false);
    declareFunction(myName, "abductive_strategy_generic_tactic_happiness", "ABDUCTIVE-STRATEGY-GENERIC-TACTIC-HAPPINESS", 3, 0, false);
    declareFunction(myName, "abductive_strategy_transformation_strategem_happiness", "ABDUCTIVE-STRATEGY-TRANSFORMATION-STRATEGEM-HAPPINESS", 2, 0, false);
    declareFunction(myName, "abductive_strategy_happiness_table", "ABDUCTIVE-STRATEGY-HAPPINESS-TABLE", 3, 0, false);
    declareFunction(myName, "strategic_heuristic_strategic_productivity", "STRATEGIC-HEURISTIC-STRATEGIC-PRODUCTIVITY", 2, 0, false);
    declareFunction(myName, "strategic_heuristic_delay_abduction", "STRATEGIC-HEURISTIC-DELAY-ABDUCTION", 2, 0, false);
    declareFunction(myName, "transformation_problem_rule_abductive_utility", "TRANSFORMATION-PROBLEM-RULE-ABDUCTIVE-UTILITY", 2, 0, false);
    declareFunction(myName, "push_problem_onto_rule_abductive_utility_stack", "PUSH-PROBLEM-ONTO-RULE-ABDUCTIVE-UTILITY-STACK", 1, 0, false);
    declareFunction(myName, "problem_on_rule_abductive_utility_stackP", "PROBLEM-ON-RULE-ABDUCTIVE-UTILITY-STACK?", 1, 0, false);
    declareFunction(myName, "strategic_heuristic_rule_abductive_utility", "STRATEGIC-HEURISTIC-RULE-ABDUCTIVE-UTILITY", 2, 0, false);
    declareFunction(myName, "compute_problem_rule_abductive_utility", "COMPUTE-PROBLEM-RULE-ABDUCTIVE-UTILITY", 2, 0, false);
    declareFunction(myName, "compute_tactic_rule_abductive_utility", "COMPUTE-TACTIC-RULE-ABDUCTIVE-UTILITY", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_abduction_utilities_file() {
    $abductive_strategy_type$ = defvar("*ABDUCTIVE-STRATEGY-TYPE*", $kw20$ABDUCTIVE);
    $prune_semantically_bad_new_rootsP$ = defparameter("*PRUNE-SEMANTICALLY-BAD-NEW-ROOTS?*", NIL);
    $abductive_tactician_removal_heuristics$ = deflexical("*ABDUCTIVE-TACTICIAN-REMOVAL-HEURISTICS*", set_utilities.construct_set_from_list($list37, Symbols.symbol_function(EQ), UNPROVIDED));
    $abductive_tactician_transformation_heuristics$ = deflexical("*ABDUCTIVE-TACTICIAN-TRANSFORMATION-HEURISTICS*", set_utilities.construct_set_from_list($list38, Symbols.symbol_function(EQ), UNPROVIDED));
    $heuristic_rule_abductive_utility_problem_recursion_stack$ = defparameter("*HEURISTIC-RULE-ABDUCTIVE-UTILITY-PROBLEM-RECURSION-STACK*", NIL);
    return NIL;
  }

  public static final SubLObject setup_inference_abduction_utilities_file() {
    // CVS_ID("Id: inference-abduction-utilities.lisp 128006 2009-06-16 15:51:35Z pace ");
    inference_tactician.inference_strategy_type($kw20$ABDUCTIVE, $list21);
    utilities_macros.note_funcall_helper_function($sym22$ABDUCTIVE_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_REMOVAL_);
    utilities_macros.note_funcall_helper_function($sym23$ABDUCTIVE_STRATEGY_PEEK_STRATEGEM_WRT_REMOVAL);
    utilities_macros.note_funcall_helper_function($sym24$ABDUCTIVE_STRATEGY_NO_NEW_ROOTS_);
    utilities_macros.note_funcall_helper_function($sym25$ABDUCTIVE_STRATEGY_PEEK_NEW_ROOT);
    utilities_macros.note_funcall_helper_function($sym26$ABDUCTIVE_STRATEGY_CHOOSES_TO_THROW_AWAY_NEW_ROOT_);
    utilities_macros.note_funcall_helper_function($sym28$ABDUCTIVE_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION_);
    utilities_macros.note_funcall_helper_function($sym29$ABDUCTIVE_STRATEGY_PEEK_STRATEGEM_WRT_TRANSFORMATION);
    utilities_macros.note_funcall_helper_function($sym31$ABDUCTIVE_STRATEGY_ACTIVATE_STRATEGEM_WRT_REMOVAL);
    utilities_macros.note_funcall_helper_function($sym32$ABDUCTIVE_STRATEGY_POP_STRATEGEM_WRT_REMOVAL);
    utilities_macros.note_funcall_helper_function($sym33$ABDUCTIVE_STRATEGY_ADD_NEW_ROOT);
    utilities_macros.note_funcall_helper_function($sym34$ABDUCTIVE_STRATEGY_POP_NEW_ROOT);
    utilities_macros.note_funcall_helper_function($sym35$ABDUCTIVE_STRATEGY_ACTIVATE_STRATEGEM_WRT_TRANSFORMATION);
    utilities_macros.note_funcall_helper_function($sym36$ABDUCTIVE_STRATEGY_POP_STRATEGEM_WRT_TRANSFORMATION);
    access_macros.register_macro_helper($sym48$ABDUCTIVE_TACTICIAN_STRATEGIC_HEURISTIC_, $sym49$DO_ABDUCTIVE_TACTICIAN_STRATEGIC_HEURISTICS);
    inference_strategic_heuristics.declare_strategic_heuristic($kw57$STRATEGIC_PRODUCTIVITY, $list58);
    inference_strategic_heuristics.declare_strategic_heuristic($kw59$DELAY_ABDUCTION, $list60);
    inference_strategic_heuristics.declare_strategic_heuristic($kw62$RULE_ABDUCTIVE_UTILITY, $list63);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$POS = makeKeyword("POS");
  public static final SubLSymbol $kw1$IGNORE = makeKeyword("IGNORE");
  public static final SubLList $list2 = list(makeSymbol("LIT-MT"), makeSymbol("LIT-FORMULA"));
  public static final SubLObject $const3$nonAbducibleSentence = constant_handles.reader_make_constant_shell(makeString("nonAbducibleSentence"));
  public static final SubLObject $const4$NonAbducibleRelation = constant_handles.reader_make_constant_shell(makeString("NonAbducibleRelation"));
  public static final SubLObject $const5$NonAbduciblePredicate = constant_handles.reader_make_constant_shell(makeString("NonAbduciblePredicate"));
  public static final SubLObject $const6$NonAbducibleCollection = constant_handles.reader_make_constant_shell(makeString("NonAbducibleCollection"));
  public static final SubLObject $const7$notAbducibleForArg = constant_handles.reader_make_constant_shell(makeString("notAbducibleForArg"));
  public static final SubLSymbol $kw8$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const9$notAbducibleWRTValueInArg = constant_handles.reader_make_constant_shell(makeString("notAbducibleWRTValueInArg"));
  public static final SubLSymbol $kw10$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $kw11$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw12$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $kw13$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLObject $const14$notAbducibleWRTTypeInArg = constant_handles.reader_make_constant_shell(makeString("notAbducibleWRTTypeInArg"));
  public static final SubLObject $const15$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const16$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLList $list17 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER, makeKeyword("ALLOWED-MODULES"), list(makeKeyword("NOT"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("ABDUCTION"))));
  public static final SubLSymbol $kw18$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $kw19$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw20$ABDUCTIVE = makeKeyword("ABDUCTIVE");
  public static final SubLList $list21 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Abductive Search"), makeKeyword("COMMENT"), makeString("Similar to the heuristic-balanced Tactician, except the transformation heuristics\nare optimized to support the needs of the abductive inference modules."), makeKeyword("CONSTRUCTOR"), makeSymbol("ABDUCTIVE-STRATEGY-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("BALANCED-STRATEGY-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("BALANCED-STRATEGY-DO-ONE-STEP"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("BALANCED-STRATEGY-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("SELECT-BEST-STRATEGEM"), makeSymbol("BALANCED-STRATEGY-DEFAULT-SELECT-BEST-STRATEGEM"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("BALANCED-STRATEGY-THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("QUIESCE"), makeSymbol("BALANCED-STRATEGY-QUIESCE"), makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeSymbol("BALANCED-STRATEGY-EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("BALANCED-STRATEGY-NOTE-ARGUMENT-LINK-ADDED"), makeKeyword("NEW-TACTIC"), makeSymbol("BALANCED-STRATEGY-NOTE-NEW-TACTIC"), makeKeyword("RELEVANT-TACTICS-WRT-REMOVAL"), makeSymbol("BALANCED-STRATEGY-CATEGORIZE-STRATEGEMS-WRT-REMOVAL"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("BALANCED-STRATEGY-NOTE-SPLIT-TACTICS-STRATEGICALLY-POSSIBLE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("BALANCED-STRATEGY-CONSIDER-THAT-PROBLEM-COULD-BE-STRATEGICALLY-TOTALLY-PENDING"), makeKeyword("PROBLEM-NOTHING-TO-DO?"), makeSymbol("BALANCED-STRATEGY-PROBLEM-TOTALLY-PENDING?"), makeKeyword("PEEK-REMOVAL-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL"), makeKeyword("ACTIVATE-REMOVAL-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL"), makeKeyword("POP-REMOVAL-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-REMOVAL"), makeKeyword("NO-ACTIVE-REMOVAL-STRATEGEMS"), makeSymbol("ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?"), makeKeyword("PEEK-NEW-ROOT"), makeSymbol("ABDUCTIVE-STRATEGY-PEEK-NEW-ROOT"), makeKeyword("ACTIVATE-NEW-ROOT"), makeSymbol("ABDUCTIVE-STRATEGY-ADD-NEW-ROOT"), makeKeyword("POP-NEW-ROOT"), makeSymbol("ABDUCTIVE-STRATEGY-POP-NEW-ROOT"), makeKeyword("NO-NEW-ROOTS"), makeSymbol("ABDUCTIVE-STRATEGY-NO-NEW-ROOTS?"), makeKeyword("THROW-AWAY-NEW-ROOT"), makeSymbol("ABDUCTIVE-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?"), makeKeyword("PEEK-TRANSFORMATION-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION"), makeKeyword("ACTIVATE-TRANSFORMATION-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION"), makeKeyword("POP-TRANSFORMATION-STRATEGEM"), makeSymbol("ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION"), makeKeyword("NO-ACTIVE-TRANSFORMATION-STRATEGEMS"), makeSymbol("ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?")});
  public static final SubLSymbol $sym22$ABDUCTIVE_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_REMOVAL_ = makeSymbol("ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-REMOVAL?");
  public static final SubLSymbol $sym23$ABDUCTIVE_STRATEGY_PEEK_STRATEGEM_WRT_REMOVAL = makeSymbol("ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-REMOVAL");
  public static final SubLSymbol $sym24$ABDUCTIVE_STRATEGY_NO_NEW_ROOTS_ = makeSymbol("ABDUCTIVE-STRATEGY-NO-NEW-ROOTS?");
  public static final SubLSymbol $sym25$ABDUCTIVE_STRATEGY_PEEK_NEW_ROOT = makeSymbol("ABDUCTIVE-STRATEGY-PEEK-NEW-ROOT");
  public static final SubLSymbol $sym26$ABDUCTIVE_STRATEGY_CHOOSES_TO_THROW_AWAY_NEW_ROOT_ = makeSymbol("ABDUCTIVE-STRATEGY-CHOOSES-TO-THROW-AWAY-NEW-ROOT?");
  public static final SubLList $list27 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $sym28$ABDUCTIVE_STRATEGY_NO_STRATEGEMS_ACTIVE_WRT_TRANSFORMATION_ = makeSymbol("ABDUCTIVE-STRATEGY-NO-STRATEGEMS-ACTIVE-WRT-TRANSFORMATION?");
  public static final SubLSymbol $sym29$ABDUCTIVE_STRATEGY_PEEK_STRATEGEM_WRT_TRANSFORMATION = makeSymbol("ABDUCTIVE-STRATEGY-PEEK-STRATEGEM-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym30$ABDUCTIVE_STRATEGY_P = makeSymbol("ABDUCTIVE-STRATEGY-P");
  public static final SubLSymbol $sym31$ABDUCTIVE_STRATEGY_ACTIVATE_STRATEGEM_WRT_REMOVAL = makeSymbol("ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-REMOVAL");
  public static final SubLSymbol $sym32$ABDUCTIVE_STRATEGY_POP_STRATEGEM_WRT_REMOVAL = makeSymbol("ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-REMOVAL");
  public static final SubLSymbol $sym33$ABDUCTIVE_STRATEGY_ADD_NEW_ROOT = makeSymbol("ABDUCTIVE-STRATEGY-ADD-NEW-ROOT");
  public static final SubLSymbol $sym34$ABDUCTIVE_STRATEGY_POP_NEW_ROOT = makeSymbol("ABDUCTIVE-STRATEGY-POP-NEW-ROOT");
  public static final SubLSymbol $sym35$ABDUCTIVE_STRATEGY_ACTIVATE_STRATEGEM_WRT_TRANSFORMATION = makeSymbol("ABDUCTIVE-STRATEGY-ACTIVATE-STRATEGEM-WRT-TRANSFORMATION");
  public static final SubLSymbol $sym36$ABDUCTIVE_STRATEGY_POP_STRATEGEM_WRT_TRANSFORMATION = makeSymbol("ABDUCTIVE-STRATEGY-POP-STRATEGEM-WRT-TRANSFORMATION");
  public static final SubLList $list37 = list(makeKeyword("STRATEGIC-PRODUCTIVITY"), makeKeyword("DELAY-ABDUCTION"));
  public static final SubLList $list38 = list(new SubLObject[] {makeKeyword("SHALLOW-AND-CHEAP"), makeKeyword("COMPLETENESS"), makeKeyword("OCCAMS-RAZOR"), makeKeyword("MAGIC-WAND"), makeKeyword("BACKCHAIN-REQUIRED"), makeKeyword("RULE-A-PRIORI-UTILITY"), makeKeyword("RELEVANT-TERM"), makeKeyword("RULE-HISTORICAL-UTILITY"), makeKeyword("LITERAL-COUNT")});
  public static final SubLSymbol $kw39$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw40$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLList $list41 = list(list(makeSymbol("HEURISTIC"), makeSymbol("FUNCTION"), makeSymbol("SCALING-FACTOR"), makeSymbol("MOTIVATION"), makeSymbol("&KEY"), makeSymbol("TACTIC"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list42 = list(makeKeyword("TACTIC"), makeKeyword("DONE"));
  public static final SubLSymbol $kw43$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw44$TACTIC = makeKeyword("TACTIC");
  public static final SubLSymbol $kw45$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym46$DO_STRATEGIC_HEURISTICS = makeSymbol("DO-STRATEGIC-HEURISTICS");
  public static final SubLSymbol $sym47$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym48$ABDUCTIVE_TACTICIAN_STRATEGIC_HEURISTIC_ = makeSymbol("ABDUCTIVE-TACTICIAN-STRATEGIC-HEURISTIC?");
  public static final SubLSymbol $sym49$DO_ABDUCTIVE_TACTICIAN_STRATEGIC_HEURISTICS = makeSymbol("DO-ABDUCTIVE-TACTICIAN-STRATEGIC-HEURISTICS");
  public static final SubLSymbol $sym50$REMOVAL_STRATEGEM_P = makeSymbol("REMOVAL-STRATEGEM-P");
  public static final SubLSymbol $sym51$TRANSFORMATION_TACTIC_P = makeSymbol("TRANSFORMATION-TACTIC-P");
  public static final SubLSymbol $sym52$TRANSFORMATION_LINK_P = makeSymbol("TRANSFORMATION-LINK-P");
  public static final SubLSymbol $sym53$LOGICAL_TACTIC_P = makeSymbol("LOGICAL-TACTIC-P");
  public static final SubLSymbol $sym54$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLSymbol $sym55$STRATEGEM_P = makeSymbol("STRATEGEM-P");
  public static final SubLString $str56$_S_is_not_a_transformation_strate = makeString("~S is not a transformation strategem");
  public static final SubLSymbol $kw57$STRATEGIC_PRODUCTIVITY = makeKeyword("STRATEGIC-PRODUCTIVITY");
  public static final SubLList $list58 = list(new SubLObject[] {makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-STRATEGIC-PRODUCTIVITY"), makeKeyword("SCALING-FACTOR"), makeInteger(100), makeKeyword("TACTIC-TYPE"), makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE"), makeKeyword("PRETTY-NAME"), makeString("Strategic Productivity"), makeKeyword("COMMENT"), makeString("Prefer removal tactics with lesser productivity over more productive tactics")});
  public static final SubLSymbol $kw59$DELAY_ABDUCTION = makeKeyword("DELAY-ABDUCTION");
  public static final SubLList $list60 = list(new SubLObject[] {makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-DELAY-ABDUCTION"), makeKeyword("SCALING-FACTOR"), makeInteger(10000), makeKeyword("TACTIC-TYPE"), makeKeyword("GENERALIZED-REMOVAL-OR-REWRITE"), makeKeyword("PRETTY-NAME"), makeString("Delay Abductive Tactics"), makeKeyword("COMMENT"), makeString("Prefer deductive removal tactics over abductive removal tactics.")});
  public static final SubLInteger $int61$_100 = makeInteger(-100);
  public static final SubLSymbol $kw62$RULE_ABDUCTIVE_UTILITY = makeKeyword("RULE-ABDUCTIVE-UTILITY");
  public static final SubLList $list63 = list(makeKeyword("FUNCTION"), makeSymbol("STRATEGIC-HEURISTIC-RULE-ABDUCTIVE-UTILITY"), makeKeyword("SCALING-FACTOR"), makeInteger(500), makeKeyword("PRETTY-NAME"), makeString("Abductive Utility"), makeKeyword("COMMENT"), makeString("Prefer proof paths using rules that work well for generative abductive inferences,\nwithout considering the situations in which they were used, i.e.\nprior probability.  Consider proof paths using no rules to be at 100%."));
  public static final SubLInteger $int64$100 = makeInteger(100);
  public static final SubLSymbol $kw65$LOOP = makeKeyword("LOOP");

  //// Initializers

  public void declareFunctions() {
    declare_inference_abduction_utilities_file();
  }

  public void initializeVariables() {
    init_inference_abduction_utilities_file();
  }

  public void runTopLevelForms() {
    setup_inference_abduction_utilities_file();
  }

}
