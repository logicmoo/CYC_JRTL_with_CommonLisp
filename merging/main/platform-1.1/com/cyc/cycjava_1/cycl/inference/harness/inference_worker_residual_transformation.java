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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.inference.harness.abnormal;
//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.unification;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class inference_worker_residual_transformation extends SubLTranslatedFile {

  //// Constructor

  private inference_worker_residual_transformation() {}
  public static final SubLFile me = new inference_worker_residual_transformation();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation";

  //// Definitions

  /** The test used in the set-contents for the data of residual transformation links */
  @SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 908) 
  private static SubLSymbol $residual_transformation_link_motivating_object_test$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 1090) 
  public static final SubLObject residual_transformation_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_p(object))
           && ($kw0$RESIDUAL_TRANSFORMATION == inference_datastructures_problem_link.problem_link_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 6549) 
  public static final SubLObject maybe_possibly_add_residual_transformation_links_via_join_ordered_link(SubLObject join_ordered_link) {
    if ((NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem_link.problem_link_store(join_ordered_link)))) {
      return NIL;
    }
    return possibly_add_residual_transformation_links_via_join_ordered_link(join_ordered_link);
  }

  @SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 6873) 
  public static final SubLObject maybe_possibly_add_residual_transformation_links_via_transformation_link(SubLObject transformation_link) {
    if ((NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_problem_link.problem_link_store(transformation_link)))) {
      return NIL;
    }
    if ((NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link))) {
      return possibly_add_residual_transformation_links_via_transformation_link(transformation_link);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 7265) 
  public static final SubLObject possibly_add_residual_transformation_links_via_join_ordered_link(SubLObject join_ordered_link) {
    {
      SubLObject focal_problem = inference_worker_join_ordered.join_ordered_link_focal_problem(join_ordered_link);
      SubLObject total = ZERO_INTEGER;
      SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(focal_problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject transformation_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, transformation_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $kw5$TRANSFORMATION))) {
              if ((NIL != inference_datastructures_problem_link.problem_link_with_supporting_problem_p(transformation_link))) {
                if ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35056"))) {
                  total = Numbers.add(total, ONE_INTEGER);
                }
              }
            }
          }
        }
      }
      return total;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 7747) 
  public static final SubLObject possibly_add_residual_transformation_links_via_transformation_link(SubLObject transformation_link) {
    {
      SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(transformation_link);
      SubLObject total = ZERO_INTEGER;
      SubLObject problem_var = supported_problem;
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $kw4$JOIN_ORDERED))) {
              {
                SubLObject link_var = join_ordered_link;
                SubLObject cdolist_list_var = inference_datastructures_problem_link.problem_link_supporting_mapped_problems(link_var);
                SubLObject conjunct_mapped_problem = NIL;
                for (conjunct_mapped_problem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), conjunct_mapped_problem = cdolist_list_var.first()) {
                  if ((NIL != inference_macros.do_problem_link_open_matchP(T, link_var, conjunct_mapped_problem))) {
                    if ((problem_var == inference_datastructures_problem_link.mapped_problem_problem(conjunct_mapped_problem))) {
                      if ((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35057"))) {
                        total = Numbers.add(total, ONE_INTEGER);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      return total;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 29637) 
  public static final SubLObject residual_transformation_proof_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_proof.proof_p(object))
           && (NIL != residual_transformation_link_p(inference_datastructures_proof.proof_link(object)))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 30155) 
  private static SubLSymbol $residual_transformation_proof_bubbling_triggers_additional_restrictionsP$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-residual-transformation.lisp", position = 30271) 
  private static SubLSymbol $residual_transformation_proof_bubbling_opens_split_linksP$ = null;

  public static final SubLObject declare_inference_worker_residual_transformation_file() {
    declareFunction(myName, "residual_transformation_link_p", "RESIDUAL-TRANSFORMATION-LINK-P", 1, 0, false);
    declareFunction(myName, "find_residual_transformation_link", "FIND-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
    declareFunction(myName, "new_residual_transformation_link", "NEW-RESIDUAL-TRANSFORMATION-LINK", 5, 0, false);
    declareFunction(myName, "destroy_residual_transformation_link", "DESTROY-RESIDUAL-TRANSFORMATION-LINK", 1, 0, false);
    declareFunction(myName, "destroy_join_ordered_link_wrt_residual_transformation_links", "DESTROY-JOIN-ORDERED-LINK-WRT-RESIDUAL-TRANSFORMATION-LINKS", 1, 0, false);
    declareFunction(myName, "destroy_transformation_link_wrt_residual_transformation_links", "DESTROY-TRANSFORMATION-LINK-WRT-RESIDUAL-TRANSFORMATION-LINKS", 1, 0, false);
    declareFunction(myName, "residual_transformation_link_supporting_mapped_problem", "RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "residual_transformation_link_supporting_problem", "RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-PROBLEM", 1, 0, false);
    declareFunction(myName, "residual_transformation_link_supporting_variable_map", "RESIDUAL-TRANSFORMATION-LINK-SUPPORTING-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "residual_transformation_link_motivating_join_ordered_link", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATING-JOIN-ORDERED-LINK", 1, 0, false);
    declareFunction(myName, "residual_transformation_link_motivating_transformation_link", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATING-TRANSFORMATION-LINK", 1, 0, false);
    declareFunction(myName, "residual_transformation_link_conjunctive_problem_dont_care_variable_map", "RESIDUAL-TRANSFORMATION-LINK-CONJUNCTIVE-PROBLEM-DONT-CARE-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "residual_transformation_link_residual_conjunction_literal_map", "RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-CONJUNCTION-LITERAL-MAP", 1, 0, false);
    declareFunction(myName, "residual_transformation_link_motivated_by_link_pairP", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-LINK-PAIR?", 3, 0, false);
    declareFunction(myName, "residual_transformation_link_motivated_by_join_ordered_linkP", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-JOIN-ORDERED-LINK?", 2, 0, false);
    declareFunction(myName, "residual_transformation_link_motivated_by_transformation_linkP", "RESIDUAL-TRANSFORMATION-LINK-MOTIVATED-BY-TRANSFORMATION-LINK?", 2, 0, false);
    declareFunction(myName, "residual_transformation_link_residual_problem", "RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-PROBLEM", 1, 0, false);
    declareFunction(myName, "residual_transformation_link_rule_assertion", "RESIDUAL-TRANSFORMATION-LINK-RULE-ASSERTION", 1, 0, false);
    declareFunction(myName, "set_residual_transformation_link_data", "SET-RESIDUAL-TRANSFORMATION-LINK-DATA", 5, 0, false);
    declareFunction(myName, "maybe_possibly_add_residual_transformation_links_via_join_ordered_link", "MAYBE-POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-JOIN-ORDERED-LINK", 1, 0, false);
    declareFunction(myName, "maybe_possibly_add_residual_transformation_links_via_transformation_link", "MAYBE-POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-TRANSFORMATION-LINK", 1, 0, false);
    declareFunction(myName, "possibly_add_residual_transformation_links_via_join_ordered_link", "POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-JOIN-ORDERED-LINK", 1, 0, false);
    declareFunction(myName, "possibly_add_residual_transformation_links_via_transformation_link", "POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINKS-VIA-TRANSFORMATION-LINK", 1, 0, false);
    declareFunction(myName, "possibly_add_residual_transformation_link", "POSSIBLY-ADD-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
    declareFunction(myName, "compute_residual_transformation_link_query", "COMPUTE-RESIDUAL-TRANSFORMATION-LINK-QUERY", 2, 0, false);
    declareFunction(myName, "compute_residual_conjunction_literal_map", "COMPUTE-RESIDUAL-CONJUNCTION-LITERAL-MAP", 4, 0, false);
    declareFunction(myName, "compute_residual_conjunction_literal_map_internal", "COMPUTE-RESIDUAL-CONJUNCTION-LITERAL-MAP-INTERNAL", 4, 0, false);
    declareFunction(myName, "new_residual_transformation_proof", "NEW-RESIDUAL-TRANSFORMATION-PROOF", 3, 0, false);
    declareFunction(myName, "residual_transformation_proof_rule_bindings", "RESIDUAL-TRANSFORMATION-PROOF-RULE-BINDINGS", 1, 0, false);
    declareFunction(myName, "residual_transformation_proof_motivating_transformation_link", "RESIDUAL-TRANSFORMATION-PROOF-MOTIVATING-TRANSFORMATION-LINK", 1, 0, false);
    declareFunction(myName, "residual_transformation_link_residual_conjunction_to_motivating_conjunction_variable_map", "RESIDUAL-TRANSFORMATION-LINK-RESIDUAL-CONJUNCTION-TO-MOTIVATING-CONJUNCTION-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "conjoin_problem_queries", "CONJOIN-PROBLEM-QUERIES", 2, 0, false);
    declareFunction(myName, "rt_apply_bindings", "RT-APPLY-BINDINGS", 2, 0, false);
    declareFunction(myName, "compute_conjunctive_problem_dont_care_variable_map", "COMPUTE-CONJUNCTIVE-PROBLEM-DONT-CARE-VARIABLE-MAP", 3, 0, false);
    declareFunction(myName, "transformation_link_first_unused_extended_var_number", "TRANSFORMATION-LINK-FIRST-UNUSED-EXTENDED-VAR-NUMBER", 1, 0, false);
    declareFunction(myName, "filter_transformation_link_bindings", "FILTER-TRANSFORMATION-LINK-BINDINGS", 1, 0, false);
    declareFunction(myName, "residual_transformation_proof_p", "RESIDUAL-TRANSFORMATION-PROOF-P", 1, 0, false);
    declareFunction(myName, "residual_transformation_proof_rule_assertion", "RESIDUAL-TRANSFORMATION-PROOF-RULE-ASSERTION", 1, 0, false);
    declareFunction(myName, "residual_transformation_proof_subproof", "RESIDUAL-TRANSFORMATION-PROOF-SUBPROOF", 1, 0, false);
    declareFunction(myName, "bubble_up_proof_to_residual_transformation_link", "BUBBLE-UP-PROOF-TO-RESIDUAL-TRANSFORMATION-LINK", 3, 0, false);
    declareFunction(myName, "residual_transformation_proof_abnormalP", "RESIDUAL-TRANSFORMATION-PROOF-ABNORMAL?", 1, 0, false);
    declareFunction(myName, "problem_is_a_residual_conjunctionP", "PROBLEM-IS-A-RESIDUAL-CONJUNCTION?", 1, 0, false);
    declareFunction(myName, "problem_store_problematic_residual_transformation_links", "PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINKS", 1, 0, false);
    declareFunction(myName, "problem_store_problematic_residual_transformation_link_count", "PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_worker_residual_transformation_file() {
    $residual_transformation_link_motivating_object_test$ = deflexical("*RESIDUAL-TRANSFORMATION-LINK-MOTIVATING-OBJECT-TEST*", Symbols.symbol_function(EQUAL));
    $residual_transformation_proof_bubbling_triggers_additional_restrictionsP$ = defvar("*RESIDUAL-TRANSFORMATION-PROOF-BUBBLING-TRIGGERS-ADDITIONAL-RESTRICTIONS?*", NIL);
    $residual_transformation_proof_bubbling_opens_split_linksP$ = defvar("*RESIDUAL-TRANSFORMATION-PROOF-BUBBLING-OPENS-SPLIT-LINKS?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_inference_worker_residual_transformation_file() {
        access_macros.define_obsolete_register($sym11$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINKS, $list12);
    access_macros.define_obsolete_register($sym13$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT, $list14);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
  public static final SubLSymbol $sym1$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
  public static final SubLSymbol $sym2$JOIN_ORDERED_LINK_P = makeSymbol("JOIN-ORDERED-LINK-P");
  public static final SubLSymbol $sym3$TRANSFORMATION_LINK_P = makeSymbol("TRANSFORMATION-LINK-P");
  public static final SubLSymbol $kw4$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw5$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $sym6$RESIDUAL_TRANSFORMATION_LINK_P = makeSymbol("RESIDUAL-TRANSFORMATION-LINK-P");
  public static final SubLSymbol $sym7$PROOF_P = makeSymbol("PROOF-P");
  public static final SubLSymbol $sym8$SINGLE_CLAUSE_PROBLEM_QUERY_P = makeSymbol("SINGLE-CLAUSE-PROBLEM-QUERY-P");
  public static final SubLInteger $int9$150 = makeInteger(150);
  public static final SubLSymbol $sym10$RESIDUAL_TRANSFORMATION_PROOF_P = makeSymbol("RESIDUAL-TRANSFORMATION-PROOF-P");
  public static final SubLSymbol $sym11$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINKS = makeSymbol("PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINKS");
  public static final SubLList $list12 = list(makeSymbol("NULL"));
  public static final SubLSymbol $sym13$PROBLEM_STORE_PROBLEMATIC_RESIDUAL_TRANSFORMATION_LINK_COUNT = makeSymbol("PROBLEM-STORE-PROBLEMATIC-RESIDUAL-TRANSFORMATION-LINK-COUNT");
  public static final SubLList $list14 = list(makeSymbol("ZERO"));

  //// Initializers

  public void declareFunctions() {
    declare_inference_worker_residual_transformation_file();
  }

  public void initializeVariables() {
    init_inference_worker_residual_transformation_file();
  }

  public void runTopLevelForms() {
    setup_inference_worker_residual_transformation_file();
  }

}
