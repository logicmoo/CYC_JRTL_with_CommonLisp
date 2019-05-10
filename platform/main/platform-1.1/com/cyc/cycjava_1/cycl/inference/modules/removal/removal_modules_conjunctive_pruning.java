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

package  com.cyc.cycjava_1.cycl.inference.modules.removal;

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
import com.cyc.cycjava_1.cycl.at_admitted;
import com.cyc.cycjava_1.cycl.at_var_types;
import com.cyc.cycjava_1.cycl.bindings;
import com.cyc.cycjava_1.cycl.clause_utilities;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.genls;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_restriction;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.set_contents;
import com.cyc.cycjava_1.cycl.set_utilities;
import com.cyc.cycjava_1.cycl.somewhere_cache;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.term;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.value_tables;

public  final class removal_modules_conjunctive_pruning extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_conjunctive_pruning() {}
  public static final SubLFile me = new removal_modules_conjunctive_pruning();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_conjunctive_pruning";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 1011) 
  private static SubLSymbol $conjunctive_pruning_module_names$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 1448) 
  public static final SubLObject conjunctive_pruning_module_p(SubLObject hl_module) {
    return makeBoolean(((NIL != inference_modules.hl_module_p(hl_module))
           && (NIL != list_utilities.member_eqP(inference_modules.hl_module_name(hl_module), $conjunctive_pruning_module_names$.getGlobalValue()))));
  }

  /** Temporary control variable, should eventually stay T.
   When non-nil, we add a conjuctive removal pruning tactic that will force no-goodness on non-WFF conjunctions. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 1626) 
  private static SubLSymbol $residual_transformation_validation_enabledP$ = null;

  /** Return a problem query that is a minimal set of literals suitable for simplification and pruning algorithms that only need to check local literal consistency (wrt residual problem literals) since they can assume the parent problem would have been simplified or pruned had it been required (see problem-query-semantically-invalid?)  Specifically, take a residual problem of some residual transformation link and add the literals from the problem query that share variables with the residual problem. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 2529) 
  public static final SubLObject supporting_residual_conjunction_problem_minimal_problem_query_internal(SubLObject problem) {
    {
      SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
      SubLObject relevant_hl_vars = NIL;
      SubLObject doneP = NIL;
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (!(((NIL != doneP)
            || (NIL != set_contents.do_set_contents_doneP(basis_object, state))))); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $kw4$RESIDUAL_TRANSFORMATION))) {
              doneP = T;
              {
                SubLObject residual_problem_query = bindings.apply_bindings_backwards(Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35097"), inference_datastructures_problem.problem_query(Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35087")));
                relevant_hl_vars = list_utilities.tree_gather(residual_problem_query, $sym5$VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
              }
            }
          }
        }
      }
      if ((NIL != relevant_hl_vars)) {
        {
          SubLObject new_problem_query = NIL;
          SubLObject cdolist_list_var = problem_query;
          SubLObject contextualized_clause = NIL;
          for (contextualized_clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_clause = cdolist_list_var.first()) {
            {
              SubLObject sense = $kw6$NEG;
              SubLObject index_var = ZERO_INTEGER;
              SubLObject cdolist_list_var_1 = clauses.neg_lits(contextualized_clause);
              SubLObject contextualized_asent = NIL;
              for (contextualized_asent = cdolist_list_var_1.first(); (NIL != cdolist_list_var_1); cdolist_list_var_1 = cdolist_list_var_1.rest(), contextualized_asent = cdolist_list_var_1.first()) {
                {
                  SubLObject datum = contextualized_asent;
                  SubLObject current = datum;
                  SubLObject mt = NIL;
                  SubLObject asent = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
                  mt = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
                  asent = current.first();
                  current = current.rest();
                  if ((NIL == current)) {
                    if ((NIL != list_utilities.tree_find_any(relevant_hl_vars, asent, UNPROVIDED, UNPROVIDED))) {
                      new_problem_query = cons(inference_datastructures_problem_query.make_contextualized_asent(mt, asent), new_problem_query);
                    }
                  } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list7);
                  }
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
              }
            }
            {
              SubLObject sense = $kw8$POS;
              SubLObject index_var = ZERO_INTEGER;
              SubLObject cdolist_list_var_2 = clauses.pos_lits(contextualized_clause);
              SubLObject contextualized_asent = NIL;
              for (contextualized_asent = cdolist_list_var_2.first(); (NIL != cdolist_list_var_2); cdolist_list_var_2 = cdolist_list_var_2.rest(), contextualized_asent = cdolist_list_var_2.first()) {
                {
                  SubLObject datum = contextualized_asent;
                  SubLObject current = datum;
                  SubLObject mt = NIL;
                  SubLObject asent = NIL;
                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
                  mt = current.first();
                  current = current.rest();
                  cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
                  asent = current.first();
                  current = current.rest();
                  if ((NIL == current)) {
                    if ((NIL != list_utilities.tree_find_any(relevant_hl_vars, asent, UNPROVIDED, UNPROVIDED))) {
                      new_problem_query = cons(inference_datastructures_problem_query.make_contextualized_asent(mt, asent), new_problem_query);
                    }
                  } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list7);
                  }
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
              }
            }
          }
          if ((NIL != new_problem_query)) {
            problem_query = inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.make_clause(NIL, new_problem_query));
          }
        }
      }
      return problem_query;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 2529) 
  public static final SubLObject supporting_residual_conjunction_problem_minimal_problem_query(SubLObject problem) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return supporting_residual_conjunction_problem_minimal_problem_query_internal(problem);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym3$SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym3$SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY, ONE_INTEGER, $int9$1024, EQL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym3$SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, problem, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(supporting_residual_conjunction_problem_minimal_problem_query_internal(problem)));
            memoization_state.caching_state_put(caching_state, problem, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 4361) 
  public static final SubLObject residual_transformation_non_wff_applicability(SubLObject contextualized_dnf_clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $residual_transformation_validation_enabledP$.getDynamicValue(thread))) {
        {
          SubLObject problem = inference_worker.currently_active_problem();
          if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32747"))) {
            {
              SubLObject residual_conjunction_query = supporting_residual_conjunction_problem_minimal_problem_query(problem);
              if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32748"))) {
                return list(Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30269"));
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final class $residual_transformation_non_wff_applicability$UnaryFunction extends UnaryFunction {
    public $residual_transformation_non_wff_applicability$UnaryFunction() { super(extractFunctionNamed("RESIDUAL-TRANSFORMATION-NON-WFF-APPLICABILITY")); }
    public SubLObject processItem(SubLObject arg1) { return residual_transformation_non_wff_applicability(arg1); }
  }

  /** dynamic variable bound to T when gathering reasons why a problem query was deemed semantically invalid */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 5623) 
  private static SubLSymbol $gathering_problem_query_semantically_invalid_reasonsP$ = null;

  /** A dynamically bound string representing the reason a problem was deemed semantically invalid */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 5814) 
  private static SubLSymbol $problem_query_semantically_invalid_reason$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 8612) 
  public static final SubLObject dnf_variable_constraint_tuples_internal(SubLObject dnf) {
    {
      SubLObject tuples = NIL;
      SubLObject time = NIL;
      SubLObject time_var = Time.get_internal_real_time();
      tuples = Sequences.remove_if($sym23$THING_TUPLE_, at_var_types.contextualized_dnf_variables_isa_constraint_tuples(dnf, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
      return tuples;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 8612) 
  public static final SubLObject dnf_variable_constraint_tuples(SubLObject dnf) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return dnf_variable_constraint_tuples_internal(dnf);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym22$DNF_VARIABLE_CONSTRAINT_TUPLES, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym22$DNF_VARIABLE_CONSTRAINT_TUPLES, ONE_INTEGER, $int24$128, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym22$DNF_VARIABLE_CONSTRAINT_TUPLES, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, dnf, $kw10$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw10$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(dnf_variable_constraint_tuples_internal(dnf)));
            memoization_state.caching_state_put(caching_state, dnf, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 10105) 
  public static final SubLObject thing_tupleP(SubLObject tuple) {
    {
      SubLObject collections = conses_high.third(tuple);
      if (collections.equal($list26)) {
        return T;
      }
    }
    return NIL;
  }

  public static final class $thing_tupleP$UnaryFunction extends UnaryFunction {
    public $thing_tupleP$UnaryFunction() { super(extractFunctionNamed("THING-TUPLE?")); }
    public SubLObject processItem(SubLObject arg1) { return thing_tupleP(arg1); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 11188) 
  public static final SubLObject prune_unknown_sentence_literal_inconsistency_applicability(SubLObject contextualized_dnf_clause) {
    {
      SubLObject problem = inference_worker.currently_active_problem();
      SubLObject problem_query = inference_datastructures_problem.problem_query(problem);
      SubLObject cdolist_list_var = problem_query;
      SubLObject contextualized_clause = NIL;
      for (contextualized_clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_clause = cdolist_list_var.first()) {
        {
          SubLObject sense = $kw6$NEG;
          SubLObject index_var = ZERO_INTEGER;
          SubLObject cdolist_list_var_11 = clauses.neg_lits(contextualized_clause);
          SubLObject contextualized_asent = NIL;
          for (contextualized_asent = cdolist_list_var_11.first(); (NIL != cdolist_list_var_11); cdolist_list_var_11 = cdolist_list_var_11.rest(), contextualized_asent = cdolist_list_var_11.first()) {
            {
              SubLObject datum = contextualized_asent;
              SubLObject current = datum;
              SubLObject mt = NIL;
              SubLObject asent = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
              asent = current.first();
              current = current.rest();
              if ((NIL == current)) {
                if (($const29$unknownSentence == cycl_utilities.atomic_sentence_predicate(asent))) {
                  {
                    SubLObject unknown_sentence_asent = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    SubLObject cdolist_list_var_12 = problem_query;
                    SubLObject contextualized_clause_13 = NIL;
                    for (contextualized_clause_13 = cdolist_list_var_12.first(); (NIL != cdolist_list_var_12); cdolist_list_var_12 = cdolist_list_var_12.rest(), contextualized_clause_13 = cdolist_list_var_12.first()) {
                      {
                        SubLObject sense2 = $kw6$NEG;
                        SubLObject index_var_14 = ZERO_INTEGER;
                        SubLObject cdolist_list_var_15 = clauses.neg_lits(contextualized_clause_13);
                        SubLObject contextualized_asent_16 = NIL;
                        for (contextualized_asent_16 = cdolist_list_var_15.first(); (NIL != cdolist_list_var_15); cdolist_list_var_15 = cdolist_list_var_15.rest(), contextualized_asent_16 = cdolist_list_var_15.first()) {
                          {
                            SubLObject datum_17 = contextualized_asent_16;
                            SubLObject current_18 = datum_17;
                            SubLObject mt2 = NIL;
                            SubLObject asent2 = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_18, datum_17, $list30);
                            mt2 = current_18.first();
                            current_18 = current_18.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_18, datum_17, $list30);
                            asent2 = current_18.first();
                            current_18 = current_18.rest();
                            if ((NIL == current_18)) {
                              if (asent2.equal(unknown_sentence_asent)) {
                                return list(Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30270"));
                              }
                            } else {
                              cdestructuring_bind.cdestructuring_bind_error(datum_17, $list30);
                            }
                          }
                          index_var_14 = Numbers.add(index_var_14, ONE_INTEGER);
                        }
                      }
                      {
                        SubLObject sense2 = $kw8$POS;
                        SubLObject index_var_19 = ZERO_INTEGER;
                        SubLObject cdolist_list_var_20 = clauses.pos_lits(contextualized_clause_13);
                        SubLObject contextualized_asent_21 = NIL;
                        for (contextualized_asent_21 = cdolist_list_var_20.first(); (NIL != cdolist_list_var_20); cdolist_list_var_20 = cdolist_list_var_20.rest(), contextualized_asent_21 = cdolist_list_var_20.first()) {
                          {
                            SubLObject datum_22 = contextualized_asent_21;
                            SubLObject current_23 = datum_22;
                            SubLObject mt2 = NIL;
                            SubLObject asent2 = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_23, datum_22, $list30);
                            mt2 = current_23.first();
                            current_23 = current_23.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_23, datum_22, $list30);
                            asent2 = current_23.first();
                            current_23 = current_23.rest();
                            if ((NIL == current_23)) {
                              if (asent2.equal(unknown_sentence_asent)) {
                                return list(Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30271"));
                              }
                            } else {
                              cdestructuring_bind.cdestructuring_bind_error(datum_22, $list30);
                            }
                          }
                          index_var_19 = Numbers.add(index_var_19, ONE_INTEGER);
                        }
                      }
                    }
                  }
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list7);
              }
            }
            index_var = Numbers.add(index_var, ONE_INTEGER);
          }
        }
        {
          SubLObject sense = $kw8$POS;
          SubLObject index_var = ZERO_INTEGER;
          SubLObject cdolist_list_var_24 = clauses.pos_lits(contextualized_clause);
          SubLObject contextualized_asent = NIL;
          for (contextualized_asent = cdolist_list_var_24.first(); (NIL != cdolist_list_var_24); cdolist_list_var_24 = cdolist_list_var_24.rest(), contextualized_asent = cdolist_list_var_24.first()) {
            {
              SubLObject datum = contextualized_asent;
              SubLObject current = datum;
              SubLObject mt = NIL;
              SubLObject asent = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
              mt = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list7);
              asent = current.first();
              current = current.rest();
              if ((NIL == current)) {
                if (($const29$unknownSentence == cycl_utilities.atomic_sentence_predicate(asent))) {
                  {
                    SubLObject unknown_sentence_asent = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                    SubLObject cdolist_list_var_25 = problem_query;
                    SubLObject contextualized_clause_26 = NIL;
                    for (contextualized_clause_26 = cdolist_list_var_25.first(); (NIL != cdolist_list_var_25); cdolist_list_var_25 = cdolist_list_var_25.rest(), contextualized_clause_26 = cdolist_list_var_25.first()) {
                      {
                        SubLObject sense2 = $kw6$NEG;
                        SubLObject index_var_27 = ZERO_INTEGER;
                        SubLObject cdolist_list_var_28 = clauses.neg_lits(contextualized_clause_26);
                        SubLObject contextualized_asent_29 = NIL;
                        for (contextualized_asent_29 = cdolist_list_var_28.first(); (NIL != cdolist_list_var_28); cdolist_list_var_28 = cdolist_list_var_28.rest(), contextualized_asent_29 = cdolist_list_var_28.first()) {
                          {
                            SubLObject datum_30 = contextualized_asent_29;
                            SubLObject current_31 = datum_30;
                            SubLObject mt2 = NIL;
                            SubLObject asent2 = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_31, datum_30, $list30);
                            mt2 = current_31.first();
                            current_31 = current_31.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_31, datum_30, $list30);
                            asent2 = current_31.first();
                            current_31 = current_31.rest();
                            if ((NIL == current_31)) {
                              if (asent2.equal(unknown_sentence_asent)) {
                                return list(Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30272"));
                              }
                            } else {
                              cdestructuring_bind.cdestructuring_bind_error(datum_30, $list30);
                            }
                          }
                          index_var_27 = Numbers.add(index_var_27, ONE_INTEGER);
                        }
                      }
                      {
                        SubLObject sense2 = $kw8$POS;
                        SubLObject index_var_32 = ZERO_INTEGER;
                        SubLObject cdolist_list_var_33 = clauses.pos_lits(contextualized_clause_26);
                        SubLObject contextualized_asent_34 = NIL;
                        for (contextualized_asent_34 = cdolist_list_var_33.first(); (NIL != cdolist_list_var_33); cdolist_list_var_33 = cdolist_list_var_33.rest(), contextualized_asent_34 = cdolist_list_var_33.first()) {
                          {
                            SubLObject datum_35 = contextualized_asent_34;
                            SubLObject current_36 = datum_35;
                            SubLObject mt2 = NIL;
                            SubLObject asent2 = NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current_36, datum_35, $list30);
                            mt2 = current_36.first();
                            current_36 = current_36.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current_36, datum_35, $list30);
                            asent2 = current_36.first();
                            current_36 = current_36.rest();
                            if ((NIL == current_36)) {
                              if (asent2.equal(unknown_sentence_asent)) {
                                return list(Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30273"));
                              }
                            } else {
                              cdestructuring_bind.cdestructuring_bind_error(datum_35, $list30);
                            }
                          }
                          index_var_32 = Numbers.add(index_var_32, ONE_INTEGER);
                        }
                      }
                    }
                  }
                }
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list7);
              }
            }
            index_var = Numbers.add(index_var, ONE_INTEGER);
          }
        }
      }
    }
    return NIL;
  }

  public static final class $prune_unknown_sentence_literal_inconsistency_applicability$UnaryFunction extends UnaryFunction {
    public $prune_unknown_sentence_literal_inconsistency_applicability$UnaryFunction() { super(extractFunctionNamed("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY")); }
    public SubLObject processItem(SubLObject arg1) { return prune_unknown_sentence_literal_inconsistency_applicability(arg1); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-conjunctive-pruning.lisp", position = 12980) 
  public static final SubLObject prune_rt_problems_applicable_when_typed_only_when_specialization_applicability(SubLObject contextualized_dnf_clause) {
    {
      SubLObject problem = inference_worker.currently_active_problem();
      SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(problem);
      SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
      SubLObject state = NIL;
      for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
        {
          SubLObject link = set_contents.do_set_contents_next(basis_object, state);
          if ((NIL != set_contents.do_set_contents_element_validP(state, link))) {
            if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, $kw4$RESIDUAL_TRANSFORMATION))) {
              {
                SubLObject jo_link = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35071");
                SubLObject transformation_link = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35084");
                if ((NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32750"))) {
                  return list(Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30274"));
                } else {
                  return NIL;
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  public static final SubLObject declare_removal_modules_conjunctive_pruning_file() {
    declareFunction(myName, "conjunctive_pruning_module_p", "CONJUNCTIVE-PRUNING-MODULE-P", 1, 0, false);
    declareFunction(myName, "supporting_residual_conjunction_problem_minimal_problem_query_internal", "SUPPORTING-RESIDUAL-CONJUNCTION-PROBLEM-MINIMAL-PROBLEM-QUERY-INTERNAL", 1, 0, false);
    declareFunction(myName, "supporting_residual_conjunction_problem_minimal_problem_query", "SUPPORTING-RESIDUAL-CONJUNCTION-PROBLEM-MINIMAL-PROBLEM-QUERY", 1, 0, false);
    declareFunction(myName, "residual_transformation_non_wff_applicability", "RESIDUAL-TRANSFORMATION-NON-WFF-APPLICABILITY", 1, 0, false); new $residual_transformation_non_wff_applicability$UnaryFunction();
    declareFunction(myName, "residual_transformation_non_wff_expand", "RESIDUAL-TRANSFORMATION-NON-WFF-EXPAND", 1, 0, false);
    declareFunction(myName, "problem_is_a_topological_mergingP", "PROBLEM-IS-A-TOPOLOGICAL-MERGING?", 1, 0, false);
    declareFunction(myName, "why_problem_query_semantically_invalid", "WHY-PROBLEM-QUERY-SEMANTICALLY-INVALID", 1, 0, false);
    declareFunction(myName, "problem_query_semantically_invalidP", "PROBLEM-QUERY-SEMANTICALLY-INVALID?", 1, 0, false);
    declareFunction(myName, "problem_query_variable_constraint_tuples", "PROBLEM-QUERY-VARIABLE-CONSTRAINT-TUPLES", 1, 0, false);
    declareFunction(myName, "dnf_variable_constraint_tuples_internal", "DNF-VARIABLE-CONSTRAINT-TUPLES-INTERNAL", 1, 0, false);
    declareFunction(myName, "dnf_variable_constraint_tuples", "DNF-VARIABLE-CONSTRAINT-TUPLES", 1, 0, false);
    declareFunction(myName, "variable_constraint_tuples_for_var", "VARIABLE-CONSTRAINT-TUPLES-FOR-VAR", 2, 0, false);
    declareFunction(myName, "variable_semantically_invalidP", "VARIABLE-SEMANTICALLY-INVALID?", 1, 0, false);
    declareFunction(myName, "thing_tupleP", "THING-TUPLE?", 1, 0, false); new $thing_tupleP$UnaryFunction();
    declareFunction(myName, "prune_unknown_sentence_literal_inconsistency_applicability", "PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY", 1, 0, false); new $prune_unknown_sentence_literal_inconsistency_applicability$UnaryFunction();
    declareFunction(myName, "prune_unknown_sentence_literal_inconsistency_expand", "PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-EXPAND", 1, 0, false);
    declareFunction(myName, "prune_rt_problems_applicable_when_typed_only_when_specialization_applicability", "PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-APPLICABILITY", 1, 0, false);
    declareFunction(myName, "transformation_non_applicable_due_to_rule_type_contraint_meta_assertionP", "TRANSFORMATION-NON-APPLICABLE-DUE-TO-RULE-TYPE-CONTRAINT-META-ASSERTION?", 2, 0, false);
    declareFunction(myName, "prune_rt_problems_applicable_when_typed_only_when_specialization_expand", "PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-EXPAND", 1, 0, false);
    declareFunction(myName, "prune_circular_term_of_unit_applicability", "PRUNE-CIRCULAR-TERM-OF-UNIT-APPLICABILITY", 1, 0, false);
    declareFunction(myName, "prune_circular_term_of_unit_expand", "PRUNE-CIRCULAR-TERM-OF-UNIT-EXPAND", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_conjunctive_pruning_file() {
    $conjunctive_pruning_module_names$ = deflexical("*CONJUNCTIVE-PRUNING-MODULE-NAMES*", $list0);
    $residual_transformation_validation_enabledP$ = defvar("*RESIDUAL-TRANSFORMATION-VALIDATION-ENABLED?*", NIL);
    $gathering_problem_query_semantically_invalid_reasonsP$ = defparameter("*GATHERING-PROBLEM-QUERY-SEMANTICALLY-INVALID-REASONS?*", NIL);
    $problem_query_semantically_invalid_reason$ = defparameter("*PROBLEM-QUERY-SEMANTICALLY-INVALID-REASON*", $kw14$UNINITIALIZED);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_conjunctive_pruning_file() {
    // CVS_ID("Id: removal-modules-conjunctive-pruning.lisp 127711 2009-04-24 19:32:42Z pace ");
    inference_modules.inference_conjunctive_removal_module($kw1$RESIDUAL_TRANSFORMATION_NON_WFF, $list2);
    memoization_state.note_memoized_function($sym3$SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY);
    utilities_macros.note_funcall_helper_function($sym11$RESIDUAL_TRANSFORMATION_NON_WFF_APPLICABILITY);
    utilities_macros.note_funcall_helper_function($sym13$RESIDUAL_TRANSFORMATION_NON_WFF_EXPAND);
    memoization_state.note_memoized_function($sym22$DNF_VARIABLE_CONSTRAINT_TUPLES);
    inference_modules.inference_conjunctive_removal_module($kw27$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY, $list28);
    utilities_macros.note_funcall_helper_function($sym31$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_APPLICABILITY);
    utilities_macros.note_funcall_helper_function($sym32$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_EXPAND);
    inference_modules.inference_conjunctive_removal_module($kw33$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION, $list34);
    utilities_macros.note_funcall_helper_function($sym35$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_);
    utilities_macros.note_funcall_helper_function($sym40$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_);
    inference_modules.inference_conjunctive_removal_module($kw41$PRUNE_CIRCULAR_TERM_OF_UNIT, $list42);
    utilities_macros.note_funcall_helper_function($sym43$PRUNE_CIRCULAR_TERM_OF_UNIT_APPLICABILITY);
    utilities_macros.note_funcall_helper_function($sym44$PRUNE_CIRCULAR_TERM_OF_UNIT_EXPAND);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeKeyword("RESIDUAL-TRANSFORMATION-NON-WFF"), makeKeyword("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY"), makeKeyword("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION"), makeKeyword("PRUNE-CIRCULAR-TERM-OF-UNIT"));
  public static final SubLSymbol $kw1$RESIDUAL_TRANSFORMATION_NON_WFF = makeKeyword("RESIDUAL-TRANSFORMATION-NON-WFF");
  public static final SubLList $list2 = list(new SubLObject[] {makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("RESIDUAL-TRANSFORMATION-NON-WFF-APPLICABILITY"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("RESIDUAL-TRANSFORMATION-NON-WFF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and <lit0> ... <litN>) \n    which has a dependent residual transformation link\n    and is non-wff"), makeKeyword("EXAMPLE"), makeString("(#$and\n      (#$isa ?AGENT #$City)\n      (#$spouse ?AGENT ?SPOUSE))")});
  public static final SubLSymbol $sym3$SUPPORTING_RESIDUAL_CONJUNCTION_PROBLEM_MINIMAL_PROBLEM_QUERY = makeSymbol("SUPPORTING-RESIDUAL-CONJUNCTION-PROBLEM-MINIMAL-PROBLEM-QUERY");
  public static final SubLSymbol $kw4$RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
  public static final SubLSymbol $sym5$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $kw6$NEG = makeKeyword("NEG");
  public static final SubLList $list7 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $kw8$POS = makeKeyword("POS");
  public static final SubLInteger $int9$1024 = makeInteger(1024);
  public static final SubLSymbol $kw10$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym11$RESIDUAL_TRANSFORMATION_NON_WFF_APPLICABILITY = makeSymbol("RESIDUAL-TRANSFORMATION-NON-WFF-APPLICABILITY");
  public static final SubLSymbol $kw12$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $sym13$RESIDUAL_TRANSFORMATION_NON_WFF_EXPAND = makeSymbol("RESIDUAL-TRANSFORMATION-NON-WFF-EXPAND");
  public static final SubLSymbol $kw14$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLString $str15$unknown_non_wff_reason = makeString("unknown non-wff reason");
  public static final SubLSymbol $kw16$IGNORE = makeKeyword("IGNORE");
  public static final SubLString $str17$_is_not_a_valid_arg = makeString(" is not a valid arg");
  public static final SubLString $str18$_for_ = makeString(" for ");
  public static final SubLString $str19$_in_ = makeString(" in ");
  public static final SubLString $str20$variable_constraint_tuple_mismatc = makeString("variable constraint tuple mismatch for ~a");
  public static final SubLString $str21$_is_constrained_to_disjoint_colle = makeString(" is constrained to disjoint collections: ");
  public static final SubLSymbol $sym22$DNF_VARIABLE_CONSTRAINT_TUPLES = makeSymbol("DNF-VARIABLE-CONSTRAINT-TUPLES");
  public static final SubLSymbol $sym23$THING_TUPLE_ = makeSymbol("THING-TUPLE?");
  public static final SubLInteger $int24$128 = makeInteger(128);
  public static final SubLList $list25 = list(makeSymbol("VAR"), makeSymbol("MT"), makeSymbol("COLLECTIONS"));
  public static final SubLList $list26 = list(constant_handles.reader_make_constant_shell(makeString("Thing")));
  public static final SubLSymbol $kw27$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY = makeKeyword("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY");
  public static final SubLList $list28 = list(new SubLObject[] {makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and <lit0> ... <litN> ... (#$unknownSentence <litN>) ...)"), makeKeyword("EXAMPLE"), makeString("(#$and\n      (#$children ?ANIMAL ?CHILD)\n      (#$unknownSentence (#$children ?ANIMAL ?CHILD)))")});
  public static final SubLObject $const29$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));
  public static final SubLList $list30 = list(makeSymbol("MT2"), makeSymbol("ASENT2"));
  public static final SubLSymbol $sym31$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_APPLICABILITY = makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-APPLICABILITY");
  public static final SubLSymbol $sym32$PRUNE_UNKNOWN_SENTENCE_LITERAL_INCONSISTENCY_EXPAND = makeSymbol("PRUNE-UNKNOWN-SENTENCE-LITERAL-INCONSISTENCY-EXPAND");
  public static final SubLSymbol $kw33$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION = makeKeyword("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION");
  public static final SubLList $list34 = list(new SubLObject[] {makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-APPLICABILITY"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("Apply to problems created via residual transformation where the rule has a #$applicableWhenTypedOnlyWhenSpecialization assertion on it.")});
  public static final SubLSymbol $sym35$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_ = makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-APPLICABILITY");
  public static final SubLObject $const36$applicableWhenTypedOnlyWhenSpecia = constant_handles.reader_make_constant_shell(makeString("applicableWhenTypedOnlyWhenSpecialization"));
  public static final SubLList $list37 = list(ONE_INTEGER, TWO_INTEGER);
  public static final SubLObject $const38$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const39$rdf_type = constant_handles.reader_make_constant_shell(makeString("rdf-type"));
  public static final SubLSymbol $sym40$PRUNE_RT_PROBLEMS_APPLICABLE_WHEN_TYPED_ONLY_WHEN_SPECIALIZATION_ = makeSymbol("PRUNE-RT-PROBLEMS-APPLICABLE-WHEN-TYPED-ONLY-WHEN-SPECIALIZATION-EXPAND");
  public static final SubLSymbol $kw41$PRUNE_CIRCULAR_TERM_OF_UNIT = makeKeyword("PRUNE-CIRCULAR-TERM-OF-UNIT");
  public static final SubLList $list42 = list(new SubLObject[] {makeKeyword("EVERY-PREDICATES"), list(constant_handles.reader_make_constant_shell(makeString("termOfUnit"))), makeKeyword("APPLICABILITY"), makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-APPLICABILITY"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("Applies to syntactically circular termOfUnit literals, for instance (#$termOfUnit ?var0 (#$MotherFn ?var0))")});
  public static final SubLSymbol $sym43$PRUNE_CIRCULAR_TERM_OF_UNIT_APPLICABILITY = makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-APPLICABILITY");
  public static final SubLSymbol $sym44$PRUNE_CIRCULAR_TERM_OF_UNIT_EXPAND = makeSymbol("PRUNE-CIRCULAR-TERM-OF-UNIT-EXPAND");

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_conjunctive_pruning_file();
  }

  public void initializeVariables() {
    init_removal_modules_conjunctive_pruning_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_conjunctive_pruning_file();
  }

}
