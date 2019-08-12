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

package com.cyc.cycjava_1.cycl.inference.modules;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.*;
//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.inference.modules.removal.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;

public  final class simplification_modules extends SubLTranslatedFile {

  //// Constructor

  private simplification_modules() {}
  public static final SubLFile me = new simplification_modules();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.simplification_modules";

  //// Definitions

  @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 973)
  private static SubLSymbol $simplification_module_names$ = null;

  @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 1299)
  public static final SubLObject simplification_module_p(SubLObject hl_module) {
    return makeBoolean(((NIL != inference_modules.hl_module_p(hl_module))
           && (NIL != list_utilities.member_eqP(inference_modules.hl_module_name(hl_module), $simplification_module_names$.getGlobalValue()))));
  }

  /** Temporary control variable, should eventually stay T.
   When non-nil, we allow for simplification modules to apply. */
  @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 1467)
  private static SubLSymbol $simplification_modules_enabledP$ = null;

  @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 2490)
  public static final SubLObject simplification_duplicate_literals_via_functionality_pos_lits_applicability(SubLObject contextualized_dnf_clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $simplification_modules_enabledP$.getDynamicValue(thread))) {
        {
          SubLObject problem = inference_worker.currently_active_problem();
          if ((NIL != problem_is_a_topological_rootP(problem))) {
            {
              SubLObject minimal_problem_query = removal_modules_conjunctive_pruning.supporting_residual_conjunction_problem_minimal_problem_query(problem);
              SubLObject equivalence_classes = simplification_duplicate_literals_via_functionality_pos_lits_equivalence_classes(inference_datastructures_problem.problem_query_sole_clause(minimal_problem_query));
              SubLObject non_singleton_classes = list_utilities.find_all_if_not($sym3$SINGLETON_, equivalence_classes, UNPROVIDED);
              if ((NIL != non_singleton_classes)) {
                return list(Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30276"));
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final class $simplification_duplicate_literals_via_functionality_pos_lits_applicability$UnaryFunction extends UnaryFunction {
    public $simplification_duplicate_literals_via_functionality_pos_lits_applicability$UnaryFunction() { super(extractFunctionNamed("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return simplification_duplicate_literals_via_functionality_pos_lits_applicability(arg1); }
  }

  @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 3223)
  public static final SubLObject problem_is_a_topological_rootP(SubLObject problem) {
    {
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
            if (((NIL != inference_worker_residual_transformation.residual_transformation_link_p(link))
                || (NIL != inference_worker_answer.answer_link_p(link))
                || ((NIL != inference_worker_split.split_link_p(link))
                   && (NIL != problem_is_a_topological_rootP(inference_datastructures_problem_link.problem_link_supported_problem(link)))))) {
              return T;
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 5508)
  public static final SubLObject asent_pred_inter_arg_dependent_cardinalities_internal(SubLObject pred) {
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_tuples_in_any_mt(pred, $const7$interArgDependentCardinality, ONE_INTEGER, $list8, UNPROVIDED);
      SubLObject tuple = NIL;
      for (tuple = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tuple = cdolist_list_var.first()) {
        result = cons(tuple, result);
      }
      return result;
    }
  }

  @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 5508)
  public static final SubLObject asent_pred_inter_arg_dependent_cardinalities(SubLObject pred) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return asent_pred_inter_arg_dependent_cardinalities_internal(pred);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES, ONE_INTEGER, $int9$100, EQL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(asent_pred_inter_arg_dependent_cardinalities_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/modules/simplification-modules.lisp", position = 5982)
  public static final SubLObject simplification_duplicate_literals_via_functionality_pos_lits_equivalence_classes(SubLObject contextualized_dnf_clause) {
    {
      SubLObject possible_match_asents = NIL;
      SubLObject result = NIL;
      {
        SubLObject variable_constraint_tuples = removal_modules_conjunctive_pruning.dnf_variable_constraint_tuples(contextualized_dnf_clause);
        SubLObject num = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = NIL;
        for (lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), lit = cdolist_list_var.first()) {
          {
            SubLObject datum = lit;
            SubLObject current = datum;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list13);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list13);
            asent = current.first();
            current = current.rest();
            if ((NIL == current)) {
              {
                SubLObject asent_pred = cycl_utilities.sentence_arg0(asent);
                if ((NIL != forts.fort_p(asent_pred))) {
                  {
                    SubLObject asent_pred_inter_arg_dependent_cardinalities = asent_pred_inter_arg_dependent_cardinalities(asent_pred);
                    if ((NIL != asent_pred_inter_arg_dependent_cardinalities)) {
                      {
                        SubLObject cdolist_list_var_2 = asent_pred_inter_arg_dependent_cardinalities;
                        SubLObject asent_pred_inter_arg_dependent_cardinality = NIL;
                        for (asent_pred_inter_arg_dependent_cardinality = cdolist_list_var_2.first(); (NIL != cdolist_list_var_2); cdolist_list_var_2 = cdolist_list_var_2.rest(), asent_pred_inter_arg_dependent_cardinality = cdolist_list_var_2.first()) {
                          {
                            SubLObject datum_3 = asent_pred_inter_arg_dependent_cardinality;
                            SubLObject current_4 = datum_3;
                            SubLObject m = NIL;
                            SubLObject col1 = NIL;
                            SubLObject n = NIL;
                            SubLObject col2 = NIL;
                            SubLObject card = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_4, datum_3, $list14);
                            m = current_4.first();
                            current_4 = current_4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_4, datum_3, $list14);
                            col1 = current_4.first();
                            current_4 = current_4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_4, datum_3, $list14);
                            n = current_4.first();
                            current_4 = current_4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_4, datum_3, $list14);
                            col2 = current_4.first();
                            current_4 = current_4.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_4, datum_3, $list14);
                            card = current_4.first();
                            current_4 = current_4.rest();
                            if ((NIL == current_4)) {
                              if (((card == ONE_INTEGER)
                                   && (col1 == $const15$Thing))) {
                                {
                                  SubLObject arg_from = cycl_utilities.atomic_sentence_arg(asent, m, UNPROVIDED);
                                  SubLObject arg_to = cycl_utilities.atomic_sentence_arg(asent, n, UNPROVIDED);
                                  if ((NIL != ((NIL != forts.fort_p(arg_to)) ? ((SubLObject) Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4983")) : Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32842")))) {
                                    {
                                      SubLObject fake_pred = Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7522");
                                      possible_match_asents = cons(list(fake_pred, arg_from, arg_to), possible_match_asents);
                                    }
                                  }
                                }
                              }
                            } else {
                              cdestructuring_bind.cdestructuring_bind_error(datum_3, $list14);
                            }
                          }
                        }
                      }
                    }
                  }
                  if ((NIL != cycl_utilities.functional_in_some_argP(asent_pred))) {
                    possible_match_asents = cons(asent, possible_match_asents);
                  }
                }
              }
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum, $list13);
            }
          }
          num = Numbers.add(num, ONE_INTEGER);
        }
      }
      if ((NIL != list_utilities.duplicatesP(possible_match_asents, Symbols.symbol_function(EQUAL), $sym18$SENTENCE_ARG0))) {
        {
          SubLObject equivalence_map = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32853");
          SubLObject mapping_iteration_doneP = NIL;
          SubLObject predicates = list_utilities.fast_delete_duplicates(Mapping.mapcar($sym18$SENTENCE_ARG0, possible_match_asents), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
          while ((NIL == mapping_iteration_doneP)) {
            mapping_iteration_doneP = T;
            {
              SubLObject cdolist_list_var = predicates;
              SubLObject predicate = NIL;
              for (predicate = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), predicate = cdolist_list_var.first()) {
                {
                  SubLObject functional_arg_positions = (predicate.isKeyword() ? ((SubLObject) $list19) : Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29770"));
                  SubLObject cdolist_list_var_5 = functional_arg_positions;
                  SubLObject functional_position = NIL;
                  for (functional_position = cdolist_list_var_5.first(); (NIL != cdolist_list_var_5); cdolist_list_var_5 = cdolist_list_var_5.rest(), functional_position = cdolist_list_var_5.first()) {
                    {
                      SubLObject cdolist_list_var_6 = possible_match_asents;
                      SubLObject possible_match_asent_1 = NIL;
                      for (possible_match_asent_1 = cdolist_list_var_6.first(); (NIL != cdolist_list_var_6); cdolist_list_var_6 = cdolist_list_var_6.rest(), possible_match_asent_1 = cdolist_list_var_6.first()) {
                        if (predicate.equal(cycl_utilities.sentence_arg0(possible_match_asent_1))) {
                          {
                            SubLObject cdolist_list_var_7 = possible_match_asents;
                            SubLObject possible_match_asent_2 = NIL;
                            for (possible_match_asent_2 = cdolist_list_var_7.first(); (NIL != cdolist_list_var_7); cdolist_list_var_7 = cdolist_list_var_7.rest(), possible_match_asent_2 = cdolist_list_var_7.first()) {
                              if ((predicate.equal(cycl_utilities.sentence_arg0(possible_match_asent_2))
                                   && (!(possible_match_asent_1.equal(possible_match_asent_2))))) {
                                {
                                  SubLObject asent_1_func_arg = cycl_utilities.sentence_arg(possible_match_asent_1, functional_position, UNPROVIDED);
                                  SubLObject asent_2_func_arg = cycl_utilities.sentence_arg(possible_match_asent_2, functional_position, UNPROVIDED);
                                  SubLObject equivalence_foundP = T;
                                  if ((NIL == Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32848"))) {
                                    {
                                      SubLObject argnum = ZERO_INTEGER;
                                      SubLObject asent_1_arg = NIL;
                                      SubLObject asent_1_arg_8 = NIL;
                                      SubLObject asent_2_arg = NIL;
                                      SubLObject asent_2_arg_9 = NIL;
                                      for (asent_1_arg = possible_match_asent_1, asent_1_arg_8 = asent_1_arg.first(), asent_2_arg = possible_match_asent_2, asent_2_arg_9 = asent_2_arg.first(); (!(((NIL == asent_2_arg)
                                             && (NIL == asent_1_arg)))); asent_1_arg = asent_1_arg.rest(), asent_1_arg_8 = asent_1_arg.first(), asent_2_arg = asent_2_arg.rest(), asent_2_arg_9 = asent_2_arg.first()) {
                                        if ((!(((argnum == ZERO_INTEGER)
                                              || (argnum == functional_position))))) {
                                          if ((NIL == Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32849"))) {
                                            equivalence_foundP = NIL;
                                          }
                                        }
                                        argnum = Numbers.add(argnum, ONE_INTEGER);
                                      }
                                    }
                                    if ((NIL != equivalence_foundP)) {
                                      equivalence_map = Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32852");
                                      mapping_iteration_doneP = NIL;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject cdolist_list_var = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32846");
            SubLObject class_id = NIL;
            for (class_id = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), class_id = cdolist_list_var.first()) {
              {
                SubLObject class_list = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32847");
                if ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9094"))) {
                  result = cons(class_list, result);
                }
              }
            }
          }
          {
            SubLObject cdolist_list_var = cycl_utilities.expression_gather(contextualized_dnf_clause, $sym5$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject other_variable = NIL;
            for (other_variable = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), other_variable = cdolist_list_var.first()) {
              if ((NIL == Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32845"))) {
                result = cons(list(other_variable), result);
              }
            }
          }
        }
      }
      return result;
    }
  }

  public static final SubLObject declare_simplification_modules_file() {
    declareFunction(myName, "simplification_module_p", "SIMPLIFICATION-MODULE-P", 1, 0, false);
    declareFunction(myName, "simplification_duplicate_literals_via_functionality_pos_lits_applicability", "SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY", 1, 0, false); new $simplification_duplicate_literals_via_functionality_pos_lits_applicability$UnaryFunction();
    declareFunction(myName, "problem_is_a_topological_rootP", "PROBLEM-IS-A-TOPOLOGICAL-ROOT?", 1, 0, false);
    declareFunction(myName, "simplification_duplicate_literals_via_functionality_expand", "SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-EXPAND", 1, 0, false);
    declareFunction(myName, "problem_query_simplify_via_functionality", "PROBLEM-QUERY-SIMPLIFY-VIA-FUNCTIONALITY", 1, 0, false);
    declareFunction(myName, "problem_query_compute_simplification_via_functionality_variable_map", "PROBLEM-QUERY-COMPUTE-SIMPLIFICATION-VIA-FUNCTIONALITY-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "compute_simplification_via_functionality_variable_map", "COMPUTE-SIMPLIFICATION-VIA-FUNCTIONALITY-VARIABLE-MAP", 1, 0, false);
    declareFunction(myName, "asent_pred_inter_arg_dependent_cardinalities_internal", "ASENT-PRED-INTER-ARG-DEPENDENT-CARDINALITIES-INTERNAL", 1, 0, false);
    declareFunction(myName, "asent_pred_inter_arg_dependent_cardinalities", "ASENT-PRED-INTER-ARG-DEPENDENT-CARDINALITIES", 1, 0, false);
    declareFunction(myName, "any_specP_memoized_internal", "ANY-SPEC?-MEMOIZED-INTERNAL", 2, 2, false);
    declareFunction(myName, "any_specP_memoized", "ANY-SPEC?-MEMOIZED", 2, 2, false);
    declareFunction(myName, "simplification_duplicate_literals_via_functionality_pos_lits_equivalence_classes", "SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-EQUIVALENCE-CLASSES", 1, 0, false);
    declareFunction(myName, "new_equivalence_map", "NEW-EQUIVALENCE-MAP", 0, 1, false);
    declareFunction(myName, "print_equivalence_map", "PRINT-EQUIVALENCE-MAP", 1, 0, false);
    declareFunction(myName, "equivalence_map_class_ids", "EQUIVALENCE-MAP-CLASS-IDS", 1, 0, false);
    declareFunction(myName, "equivalence_map_class_id_for_object", "EQUIVALENCE-MAP-CLASS-ID-FOR-OBJECT", 2, 0, false);
    declareFunction(myName, "equivalence_map_class_list_by_id", "EQUIVALENCE-MAP-CLASS-LIST-BY-ID", 2, 0, false);
    declareFunction(myName, "equivalence_map_equivalentP", "EQUIVALENCE-MAP-EQUIVALENT?", 3, 0, false);
    declareFunction(myName, "equivalence_map_insert", "EQUIVALENCE-MAP-INSERT", 2, 0, false);
    declareFunction(myName, "equivalence_map_join", "EQUIVALENCE-MAP-JOIN", 3, 0, false);
    return NIL;
  }

  public static final SubLObject init_simplification_modules_file() {
    $simplification_module_names$ = deflexical("*SIMPLIFICATION-MODULE-NAMES*", $list0);
    $simplification_modules_enabledP$ = defparameter("*SIMPLIFICATION-MODULES-ENABLED?*", T);
    return NIL;
  }

  public static final SubLObject setup_simplification_modules_file() {
        inference_modules.inference_conjunctive_removal_module($kw1$REMOVAL_SIMPLIFICATION_CONJUNCTION_DUPLICATE_LITERALS_VIA_FUNCTIO, $list2);
    utilities_macros.note_funcall_helper_function($sym4$SIMPLIFICATION_DUPLICATE_LITERALS_VIA_FUNCTIONALITY_POS_LITS_APPL);
    memoization_state.note_memoized_function($sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES);
    memoization_state.note_memoized_function($sym11$ANY_SPEC__MEMOIZED);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("REMOVAL-SIMPLIFICATION-CONJUNCTION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY"));
  public static final SubLSymbol $kw1$REMOVAL_SIMPLIFICATION_CONJUNCTION_DUPLICATE_LITERALS_VIA_FUNCTIO = makeKeyword("REMOVAL-SIMPLIFICATION-CONJUNCTION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY");
  public static final SubLList $list2 = list(new SubLObject[] {makeKeyword("DIRECTION"), makeKeyword("BACKWARD"), makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("EXPAND"), makeSymbol("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("Simplification module to bind variables to forts or other variables when functional predicate can be used to prove equivalence.")});
  public static final SubLSymbol $sym3$SINGLETON_ = makeSymbol("SINGLETON?");
  public static final SubLSymbol $sym4$SIMPLIFICATION_DUPLICATE_LITERALS_VIA_FUNCTIONALITY_POS_LITS_APPL = makeSymbol("SIMPLIFICATION-DUPLICATE-LITERALS-VIA-FUNCTIONALITY-POS-LITS-APPLICABILITY");
  public static final SubLSymbol $sym5$HL_VARIABLE_P = makeSymbol("HL-VARIABLE-P");
  public static final SubLSymbol $sym6$ASENT_PRED_INTER_ARG_DEPENDENT_CARDINALITIES = makeSymbol("ASENT-PRED-INTER-ARG-DEPENDENT-CARDINALITIES");
  public static final SubLObject $const7$interArgDependentCardinality = constant_handles.reader_make_constant_shell(makeString("interArgDependentCardinality"));
  public static final SubLList $list8 = list(TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER);
  public static final SubLInteger $int9$100 = makeInteger(100);
  public static final SubLSymbol $kw10$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym11$ANY_SPEC__MEMOIZED = makeSymbol("ANY-SPEC?-MEMOIZED");
  public static final SubLInteger $int12$1024 = makeInteger(1024);
  public static final SubLList $list13 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLList $list14 = list(makeSymbol("M"), makeSymbol("COL1"), makeSymbol("N"), makeSymbol("COL2"), makeSymbol("CARD"));
  public static final SubLObject $const15$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLSymbol $sym16$CAR = makeSymbol("CAR");
  public static final SubLString $str17$_ = makeString("-");
  public static final SubLSymbol $sym18$SENTENCE_ARG0 = makeSymbol("SENTENCE-ARG0");
  public static final SubLList $list19 = list(TWO_INTEGER);

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_simplification_modules_file();
  }

  @Override
  public void initializeVariables() {
    init_simplification_modules_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_simplification_modules_file();
  }

}
