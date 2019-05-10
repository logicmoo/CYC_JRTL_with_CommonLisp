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

package  com.cyc.cycjava_1.cycl.inference.modules;

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
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.auxiliary_indexing;
import com.cyc.cycjava_1.cycl.backward;
import com.cyc.cycjava_1.cycl.backward_utilities;
import com.cyc.cycjava_1.cycl.cardinality_estimates;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.fi;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.genl_mts;
import com.cyc.cycjava_1.cycl.genl_predicates;
import com.cyc.cycjava_1.cycl.genls;
import com.cyc.cycjava_1.cycl.inference.harness.inference_abduction_utilities;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.inference.harness.inference_strategic_heuristics;
import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.negation_predicate;
import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_symmetry;
import com.cyc.cycjava_1.cycl.set_contents;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.unification;
import com.cyc.cycjava_1.cycl.unification_utilities;
import com.cyc.cycjava_1.cycl.variables;
import com.cyc.cycjava_1.cycl.virtual_indexing;

public  final class transformation_modules extends SubLTranslatedFile {

  //// Constructor

  private transformation_modules() {}
  public static final SubLFile me = new transformation_modules();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.transformation_modules";

  //// Definitions

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 2671) 
  public static final SubLObject additional_predicate_commutativity_supports(SubLObject predicate) {
    if ((NIL != inference_trampolines.inference_symmetric_predicateP(predicate))) {
      return removal_module_utilities.additional_isa_supports(predicate, $const9$SymmetricBinaryPredicate);
    } else if ((NIL != inference_trampolines.inference_commutative_predicate_p(predicate))) {
      return removal_module_utilities.additional_isa_supports(predicate, $const10$CommutativePredicate);
    } else if ((NIL != inference_trampolines.inference_partially_commutative_predicate_p(predicate))) {
      return ConsesLow.append(removal_module_utilities.additional_isa_supports(predicate, $const11$PartiallyCommutativePredicate), Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32752"));
    } else {
      Errors.error($str12$Unexpected_commutative_predicate_, predicate);
    }
    return NIL;
  }

  /** Temporary control variable; controls whether or not we bother to try to call gaf-truth-known. */
  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 3261) 
  private static SubLSymbol $transformation_gaf_truth_known_disabled$ = null;

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 3863) 
  public static final SubLObject modus_tollens_transformation_module_p(SubLObject object) {
    return makeBoolean(((NIL != inference_modules.transformation_module_p(object))
           && ($kw17$NEG == inference_modules.hl_module_sense(object))));
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 4018) 
  public static final SubLObject modus_tollens_transformation_proof_p(SubLObject object) {
    return makeBoolean(((NIL != inference_worker_transformation.transformation_proof_p(object))
           && (NIL != modus_tollens_transformation_module_p(inference_worker.content_proof_hl_module(object)))));
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5554) 
  public static final SubLObject new_selected_rules() {
    return set_contents.new_set_contents(ZERO_INTEGER, Symbols.symbol_function(EQ));
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5683) 
  public static final SubLObject add_selected_rule(SubLObject rule, SubLObject selected_rules) {
    return set_contents.set_contents_add(rule, selected_rules, Symbols.symbol_function(EQ));
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5793) 
  public static final SubLObject finalize_selected_rules(SubLObject selected_rules) {
    {
      SubLObject rules = set_contents.set_contents_element_list(selected_rules);
      return sort_rules_via_current_inference_rule_preference(rules);
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 5981) 
  public static final SubLObject sort_rules_via_current_inference_rule_preference(SubLObject rules) {
    if ((NIL != inference_macros.current_controlling_inference())) {
      return Sort.sort(rules, $sym41$CURRENT_INFERENCE_RULE_PREFERENCE__, UNPROVIDED);
    } else {
      return Sort.sort(rules, $sym42$TRANSFORMATION_RULE_UTILITY__, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6218) 
  public static final SubLObject current_inference_rule_preference_G(SubLObject rule1, SubLObject rule2) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 36255");
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6368) 
  public static final SubLObject trans_predicate_pos_required(SubLObject asent) {
    return trans_predicate_required(asent);
  }

  public static final class $trans_predicate_pos_required$UnaryFunction extends UnaryFunction {
    public $trans_predicate_pos_required$UnaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-POS-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return trans_predicate_pos_required(arg1); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 6819) 
  public static final SubLObject trans_predicate_pos_cost(SubLObject asent) {
    return trans_predicate_cost(asent, $kw43$POS);
  }

  public static final class $trans_predicate_pos_cost$UnaryFunction extends UnaryFunction {
    public $trans_predicate_pos_cost$UnaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return trans_predicate_pos_cost(arg1); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7006) 
  public static final SubLObject trans_predicate_pos_rule_select(SubLObject asent) {
    return trans_predicate_rule_select(asent, $kw43$POS);
  }

  public static final class $trans_predicate_pos_rule_select$UnaryFunction extends UnaryFunction {
    public $trans_predicate_pos_rule_select$UnaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-POS-RULE-SELECT")); }
    public SubLObject processItem(SubLObject arg1) { return trans_predicate_pos_rule_select(arg1); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7221) 
  public static final SubLObject trans_predicate_pos_rule_filter(SubLObject asent, SubLObject rule) {
    return trans_predicate_rule_filter(asent, $kw43$POS, rule);
  }

  public static final class $trans_predicate_pos_rule_filter$BinaryFunction extends BinaryFunction {
    public $trans_predicate_pos_rule_filter$BinaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-POS-RULE-FILTER")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return trans_predicate_pos_rule_filter(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 7456) 
  public static final SubLObject trans_predicate_pos_expand(SubLObject asent, SubLObject rule) {
    return trans_predicate_expand(asent, $kw43$POS, rule);
  }

  public static final class $trans_predicate_pos_expand$BinaryFunction extends BinaryFunction {
    public $trans_predicate_pos_expand$BinaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-POS-EXPAND")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return trans_predicate_pos_expand(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 8936) 
  public static final SubLObject trans_predicate_required(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((!(((NIL != control_vars.$unique_inference_result_bindings$.getDynamicValue(thread))
               && (NIL != variables.fully_bound_p(asent))
               && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32889"))))));
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9218) 
  public static final SubLObject trans_predicate_cost(SubLObject asent, SubLObject sense) {
    return kb_indexing.relevant_num_predicate_rule_index(cycl_utilities.atomic_sentence_predicate(asent), sense);
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9355) 
  public static final SubLObject trans_predicate_rule_select(SubLObject asent, SubLObject sense) {
    return conses_high.copy_list(trans_predicate_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent), sense));
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9509) 
  public static final SubLObject trans_predicate_rule_select_int_internal(SubLObject predicate, SubLObject sense) {
    {
      SubLObject rules = new_selected_rules();
      SubLObject cdolist_list_var = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      for (direction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), direction = cdolist_list_var.first()) {
        if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, sense, direction))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, sense, direction);
            SubLObject done_var = NIL;
            SubLObject token_var = NIL;
            while ((NIL == done_var)) {
              {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean((token_var != final_index_spec));
                if ((NIL != valid)) {
                  {
                    SubLObject final_index_iterator = NIL;
                    try {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw49$RULE, NIL, direction);
                      {
                        SubLObject done_var_17 = NIL;
                        SubLObject token_var_18 = NIL;
                        while ((NIL == done_var_17)) {
                          {
                            SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_18);
                            SubLObject valid_19 = makeBoolean((token_var_18 != rule));
                            if ((NIL != valid_19)) {
                              rules = add_selected_rule(rule, rules);
                            }
                            done_var_17 = makeBoolean((NIL == valid_19));
                          }
                        }
                      }
                    } finally {
                      {
                        SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                          Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                          if ((NIL != final_index_iterator)) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                          }
                        } finally {
                          Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                      }
                    }
                  }
                }
                done_var = makeBoolean((NIL == valid));
              }
            }
          }
        }
      }
      return finalize_selected_rules(rules);
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9509) 
  public static final SubLObject trans_predicate_rule_select_int(SubLObject predicate, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return trans_predicate_rule_select_int_internal(predicate, sense);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym48$TRANS_PREDICATE_RULE_SELECT_INT, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym48$TRANS_PREDICATE_RULE_SELECT_INT, TWO_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym48$TRANS_PREDICATE_RULE_SELECT_INT, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(predicate, sense);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw50$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if ((predicate == cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && (sense == cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(trans_predicate_rule_select_int_internal(predicate, sense)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(predicate, sense));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 9877) 
  public static final SubLObject trans_predicate_rule_filter(SubLObject asent, SubLObject sense, SubLObject rule) {
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject predicate_var = predicate;
      SubLObject rule_var = rule;
      if ((NIL != backward_utilities.rule_relevant_to_proof(rule_var))) {
        {
          SubLObject assertion_var = rule_var;
          SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
          if (($kw43$POS == sense)) {
            {
              SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
              SubLObject examine = NIL;
              for (examine = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), examine = cdolist_list_var.first()) {
                if ((predicate_var == cycl_utilities.atomic_sentence_predicate(examine))) {
                  if ((NIL != unification.unify_possible(asent, examine))) {
                    return T;
                  }
                }
              }
            }
          } else if (($kw17$NEG == sense)) {
            {
              SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
              SubLObject examine = NIL;
              for (examine = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), examine = cdolist_list_var.first()) {
                if ((predicate_var == cycl_utilities.atomic_sentence_predicate(examine))) {
                  if ((NIL != unification.unify_possible(asent, examine))) {
                    return T;
                  }
                }
              }
            }
          } else {
            Errors.error($str51$Invalid_sense__s, sense);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 10145) 
  public static final SubLObject trans_predicate_expand(SubLObject asent, SubLObject sense, SubLObject rule) {
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject predicate_var = predicate;
      SubLObject rule_var = rule;
      if ((NIL != backward_utilities.rule_relevant_to_proof(rule_var))) {
        {
          SubLObject assertion_var = rule_var;
          SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
          if (($kw43$POS == sense)) {
            {
              SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
              SubLObject examine = NIL;
              for (examine = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), examine = cdolist_list_var.first()) {
                if ((predicate_var == cycl_utilities.atomic_sentence_predicate(examine))) {
                  {
                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                    if ((NIL != v_bindings)) {
                      backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                    }
                  }
                }
              }
            }
          } else if (($kw17$NEG == sense)) {
            {
              SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
              SubLObject examine = NIL;
              for (examine = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), examine = cdolist_list_var.first()) {
                if ((predicate_var == cycl_utilities.atomic_sentence_predicate(examine))) {
                  {
                    SubLObject v_bindings = unification_utilities.transformation_asent_unify(asent, examine);
                    if ((NIL != v_bindings)) {
                      backward.transformation_add_node(rule, examine, sense, v_bindings, UNPROVIDED);
                    }
                  }
                }
              }
            }
          } else {
            Errors.error($str51$Invalid_sense__s, sense);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 10540) 
  public static final SubLObject trans_predicate_genlpreds_pos_required(SubLObject asent) {
    return trans_predicate_genlpreds_required(asent);
  }

  public static final class $trans_predicate_genlpreds_pos_required$UnaryFunction extends UnaryFunction {
    public $trans_predicate_genlpreds_pos_required$UnaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return trans_predicate_genlpreds_pos_required(arg1); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 11751) 
  public static final SubLObject trans_predicate_genlpreds_pos_cost(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        thread.resetMultipleValues();
        {
          SubLObject spec_preds = inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index(predicate, $kw43$POS);
          SubLObject cost = thread.secondMultipleValue();
          thread.resetMultipleValues();
          return cost;
        }
      }
    }
  }

  public static final class $trans_predicate_genlpreds_pos_cost$UnaryFunction extends UnaryFunction {
    public $trans_predicate_genlpreds_pos_cost$UnaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return trans_predicate_genlpreds_pos_cost(arg1); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12308) 
  public static final SubLObject trans_predicate_genlpreds_pos_rule_select(SubLObject asent) {
    return conses_high.copy_list(trans_predicate_genlpreds_pos_rule_select_int(cycl_utilities.atomic_sentence_predicate(asent)));
  }

  public static final class $trans_predicate_genlpreds_pos_rule_select$UnaryFunction extends UnaryFunction {
    public $trans_predicate_genlpreds_pos_rule_select$UnaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT")); }
    public SubLObject processItem(SubLObject arg1) { return trans_predicate_genlpreds_pos_rule_select(arg1); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12479) 
  public static final SubLObject trans_predicate_genlpreds_pos_rule_select_int_internal(SubLObject predicate) {
    {
      SubLObject rules = new_selected_rules();
      SubLObject cdolist_list_var = inference_trampolines.inference_all_proper_spec_predicates_with_axiom_index(predicate, $kw43$POS);
      SubLObject index_pred = NIL;
      for (index_pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), index_pred = cdolist_list_var.first()) {
        {
          SubLObject cdolist_list_var_20 = backward_utilities.relevant_directions();
          SubLObject direction = NIL;
          for (direction = cdolist_list_var_20.first(); (NIL != cdolist_list_var_20); cdolist_list_var_20 = cdolist_list_var_20.rest(), direction = cdolist_list_var_20.first()) {
            if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(index_pred, $kw43$POS, direction))) {
              {
                SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(index_pred, $kw43$POS, direction);
                SubLObject done_var = NIL;
                SubLObject token_var = NIL;
                while ((NIL == done_var)) {
                  {
                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    SubLObject valid = makeBoolean((token_var != final_index_spec));
                    if ((NIL != valid)) {
                      {
                        SubLObject final_index_iterator = NIL;
                        try {
                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw49$RULE, NIL, direction);
                          {
                            SubLObject done_var_21 = NIL;
                            SubLObject token_var_22 = NIL;
                            while ((NIL == done_var_21)) {
                              {
                                SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_22);
                                SubLObject valid_23 = makeBoolean((token_var_22 != rule));
                                if ((NIL != valid_23)) {
                                  rules = add_selected_rule(rule, rules);
                                }
                                done_var_21 = makeBoolean((NIL == valid_23));
                              }
                            }
                          }
                        } finally {
                          {
                            SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                            try {
                              Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                              if ((NIL != final_index_iterator)) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                              }
                            } finally {
                              Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                          }
                        }
                      }
                    }
                    done_var = makeBoolean((NIL == valid));
                  }
                }
              }
            }
          }
        }
      }
      return finalize_selected_rules(rules);
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 12479) 
  public static final SubLObject trans_predicate_genlpreds_pos_rule_select_int(SubLObject predicate) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return trans_predicate_genlpreds_pos_rule_select_int_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym52$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym52$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym52$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, $kw50$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw50$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(trans_predicate_genlpreds_pos_rule_select_int_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 17607) 
  public static final SubLObject trans_predicate_genlpreds_required(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((!(((NIL != control_vars.$unique_inference_result_bindings$.getDynamicValue(thread))
               && (NIL != variables.fully_bound_p(asent))
               && (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32890"))))));
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 21608) 
  public static final SubLObject trans_predicate_commutativity_cost(SubLObject asent, SubLObject sense) {
    {
      SubLObject cost = ZERO_INTEGER;
      SubLObject source_formula_var = asent;
      if ((NIL != el_utilities.el_binary_formula_p(source_formula_var))) {
        {
          SubLObject permuted_asent = removal_modules_symmetry.symmetric_asent(source_formula_var);
          cost = Numbers.add(cost, trans_predicate_cost(permuted_asent, sense));
        }
      } else {
        {
          SubLObject cdolist_list_var = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29753");
          SubLObject permuted_asent = NIL;
          for (permuted_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), permuted_asent = cdolist_list_var.first()) {
            if ((!(permuted_asent.equal(source_formula_var)))) {
              cost = Numbers.add(cost, trans_predicate_cost(permuted_asent, sense));
            }
          }
        }
      }
      return cost;
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 22053) 
  public static final SubLObject trans_predicate_commutativity_rule_select(SubLObject asent, SubLObject sense) {
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject rules = new_selected_rules();
      SubLObject cdolist_list_var = backward_utilities.relevant_directions();
      SubLObject direction = NIL;
      for (direction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), direction = cdolist_list_var.first()) {
        if ((NIL != kb_mapping_macros.do_predicate_rule_index_key_validator(predicate, sense, direction))) {
          {
            SubLObject iterator_var = kb_mapping_macros.new_predicate_rule_final_index_spec_iterator(predicate, sense, direction);
            SubLObject done_var = NIL;
            SubLObject token_var = NIL;
            while ((NIL == done_var)) {
              {
                SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                SubLObject valid = makeBoolean((token_var != final_index_spec));
                if ((NIL != valid)) {
                  {
                    SubLObject final_index_iterator = NIL;
                    try {
                      final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw49$RULE, NIL, direction);
                      {
                        SubLObject done_var_32 = NIL;
                        SubLObject token_var_33 = NIL;
                        while ((NIL == done_var_32)) {
                          {
                            SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_33);
                            SubLObject valid_34 = makeBoolean((token_var_33 != rule));
                            if ((NIL != valid_34)) {
                              rules = add_selected_rule(rule, rules);
                            }
                            done_var_32 = makeBoolean((NIL == valid_34));
                          }
                        }
                      }
                    } finally {
                      {
                        SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                        try {
                          Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                          if ((NIL != final_index_iterator)) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                          }
                        } finally {
                          Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                      }
                    }
                  }
                }
                done_var = makeBoolean((NIL == valid));
              }
            }
          }
        }
      }
      return finalize_selected_rules(rules);
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 22442) 
  public static final SubLObject trans_predicate_commutativity_expand_int(SubLObject asent, SubLObject sense, SubLObject rule) {
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject source_formula_var = asent;
      if ((NIL != el_utilities.el_binary_formula_p(source_formula_var))) {
        {
          SubLObject permuted_asent = removal_modules_symmetry.symmetric_asent(source_formula_var);
          SubLObject predicate_var = predicate;
          SubLObject rule_var = rule;
          if ((NIL != backward_utilities.rule_relevant_to_proof(rule_var))) {
            {
              SubLObject assertion_var = rule_var;
              SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
              if (($kw43$POS == sense)) {
                {
                  SubLObject cdolist_list_var = clauses.pos_lits(cnf_var);
                  SubLObject examine = NIL;
                  for (examine = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), examine = cdolist_list_var.first()) {
                    if ((predicate_var == cycl_utilities.atomic_sentence_predicate(examine))) {
                      {
                        SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                        if ((NIL != v_bindings)) {
                          return Values.values(v_bindings, examine, predicate);
                        }
                      }
                    }
                  }
                }
              } else if (($kw17$NEG == sense)) {
                {
                  SubLObject cdolist_list_var = clauses.neg_lits(cnf_var);
                  SubLObject examine = NIL;
                  for (examine = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), examine = cdolist_list_var.first()) {
                    if ((predicate_var == cycl_utilities.atomic_sentence_predicate(examine))) {
                      {
                        SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                        if ((NIL != v_bindings)) {
                          return Values.values(v_bindings, examine, predicate);
                        }
                      }
                    }
                  }
                }
              } else {
                Errors.error($str51$Invalid_sense__s, sense);
              }
            }
          }
        }
      } else {
        {
          SubLObject cdolist_list_var = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29754");
          SubLObject permuted_asent = NIL;
          for (permuted_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), permuted_asent = cdolist_list_var.first()) {
            if ((!(permuted_asent.equal(source_formula_var)))) {
              {
                SubLObject predicate_var = predicate;
                SubLObject rule_var = rule;
                if ((NIL != backward_utilities.rule_relevant_to_proof(rule_var))) {
                  {
                    SubLObject assertion_var = rule_var;
                    SubLObject cnf_var = assertions_high.assertion_cnf(assertion_var);
                    if (($kw43$POS == sense)) {
                      {
                        SubLObject cdolist_list_var_35 = clauses.pos_lits(cnf_var);
                        SubLObject examine = NIL;
                        for (examine = cdolist_list_var_35.first(); (NIL != cdolist_list_var_35); cdolist_list_var_35 = cdolist_list_var_35.rest(), examine = cdolist_list_var_35.first()) {
                          if ((predicate_var == cycl_utilities.atomic_sentence_predicate(examine))) {
                            {
                              SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                              if ((NIL != v_bindings)) {
                                return Values.values(v_bindings, examine, predicate);
                              }
                            }
                          }
                        }
                      }
                    } else if (($kw17$NEG == sense)) {
                      {
                        SubLObject cdolist_list_var_36 = clauses.neg_lits(cnf_var);
                        SubLObject examine = NIL;
                        for (examine = cdolist_list_var_36.first(); (NIL != cdolist_list_var_36); cdolist_list_var_36 = cdolist_list_var_36.rest(), examine = cdolist_list_var_36.first()) {
                          if ((predicate_var == cycl_utilities.atomic_sentence_predicate(examine))) {
                            {
                              SubLObject v_bindings = unification_utilities.transformation_asent_unify(permuted_asent, examine);
                              if ((NIL != v_bindings)) {
                                return Values.values(v_bindings, examine, predicate);
                              }
                            }
                          }
                        }
                      }
                    } else {
                      Errors.error($str51$Invalid_sense__s, sense);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return Values.values(NIL, NIL, NIL);
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 22893) 
  public static final SubLObject trans_predicate_commutativity_rule_filter(SubLObject asent, SubLObject sense, SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject v_bindings = trans_predicate_commutativity_expand_int(asent, sense, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != v_bindings)) {
          return T;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 23158) 
  public static final SubLObject trans_predicate_commutativity_expand(SubLObject asent, SubLObject sense, SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject v_bindings = trans_predicate_commutativity_expand_int(asent, sense, rule);
        SubLObject examine = thread.secondMultipleValue();
        SubLObject predicate = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != v_bindings)) {
          backward.transformation_add_node(rule, examine, sense, v_bindings, additional_predicate_commutativity_supports(predicate));
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 23565) 
  public static final SubLObject trans_predicate_symmetry_pos_cost(SubLObject asent) {
    return trans_predicate_commutativity_cost(asent, $kw43$POS);
  }

  public static final class $trans_predicate_symmetry_pos_cost$UnaryFunction extends UnaryFunction {
    public $trans_predicate_symmetry_pos_cost$UnaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return trans_predicate_symmetry_pos_cost(arg1); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 23930) 
  public static final SubLObject trans_predicate_symmetry_pos_rule_select(SubLObject asent) {
    return trans_predicate_commutativity_rule_select(asent, $kw43$POS);
  }

  public static final class $trans_predicate_symmetry_pos_rule_select$UnaryFunction extends UnaryFunction {
    public $trans_predicate_symmetry_pos_rule_select$UnaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT")); }
    public SubLObject processItem(SubLObject arg1) { return trans_predicate_symmetry_pos_rule_select(arg1); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 24190) 
  public static final SubLObject trans_predicate_symmetry_pos_rule_filter(SubLObject asent, SubLObject rule) {
    return trans_predicate_commutativity_rule_filter(asent, $kw43$POS, rule);
  }

  public static final class $trans_predicate_symmetry_pos_rule_filter$BinaryFunction extends BinaryFunction {
    public $trans_predicate_symmetry_pos_rule_filter$BinaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return trans_predicate_symmetry_pos_rule_filter(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 24470) 
  public static final SubLObject trans_predicate_symmetry_pos_expand(SubLObject asent, SubLObject rule) {
    return trans_predicate_commutativity_expand(asent, $kw43$POS, rule);
  }

  public static final class $trans_predicate_symmetry_pos_expand$BinaryFunction extends BinaryFunction {
    public $trans_predicate_symmetry_pos_expand$BinaryFunction() { super(extractFunctionNamed("TRANS-PREDICATE-SYMMETRY-POS-EXPAND")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return trans_predicate_symmetry_pos_expand(arg1, arg2); }
  }

  /** Modules which require :allow-unbound-predicate-transformation? to be t to be used */
  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 35121) 
  private static SubLSymbol $unbound_predicate_transformation_required_modules$ = null;

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 35523) 
  public static final SubLObject trans_unbound_predicate_module_p(SubLObject hl_module) {
    {
      SubLObject name = inference_modules.hl_module_name(hl_module);
      return list_utilities.member_eqP(name, $unbound_predicate_transformation_required_modules$.getGlobalValue());
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 35882) 
  public static final SubLObject trans_unbound_predicate_pos_required(SubLObject asent) {
    return trans_unbound_predicate_required(asent);
  }

  public static final class $trans_unbound_predicate_pos_required$UnaryFunction extends UnaryFunction {
    public $trans_unbound_predicate_pos_required$UnaryFunction() { super(extractFunctionNamed("TRANS-UNBOUND-PREDICATE-POS-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return trans_unbound_predicate_pos_required(arg1); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 36238) 
  public static final SubLObject trans_unbound_predicate_pos_cost(SubLObject asent) {
    return trans_unbound_predicate_cost($kw43$POS);
  }

  public static final class $trans_unbound_predicate_pos_cost$UnaryFunction extends UnaryFunction {
    public $trans_unbound_predicate_pos_cost$UnaryFunction() { super(extractFunctionNamed("TRANS-UNBOUND-PREDICATE-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return trans_unbound_predicate_pos_cost(arg1); }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 38670) 
  public static final SubLObject trans_unbound_predicate_required(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != control_vars.$unbound_rule_backchain_enabled$.getDynamicValue(thread))
             && (!(((NIL != control_vars.$unique_inference_result_bindings$.getDynamicValue(thread))
                 && (NIL != variables.fully_bound_p(asent))
                 && (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32891")))))));
    }
  }

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 39242) 
  public static final SubLObject trans_unbound_predicate_cost(SubLObject sense) {
    return auxiliary_indexing.relevant_num_unbound_rule_index(sense);
  }

  /** Transformation modules which require :allow-hl-predicate-transformation? to be t to be used. Exception is trans-isa-pos - which can be used when #$collectionBackchainEncouraged. */
  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 40242) 
  private static SubLSymbol $hl_predicate_transformation_required_modules$ = null;

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61618) 
  private static SubLSymbol $genls_definitional_sentence$ = null;

  @SubL(source = "cycl/inference/modules/transformation-modules.lisp", position = 61785) 
  private static SubLSymbol $genls_definitional_rules$ = null;

  public static final SubLObject declare_transformation_modules_file() {
    declareFunction(myName, "additional_genls_supports", "ADDITIONAL-GENLS-SUPPORTS", 2, 0, false);
    declareFunction(myName, "additional_genl_mt_supports", "ADDITIONAL-GENL-MT-SUPPORTS", 2, 0, false);
    declareFunction(myName, "additional_genlpreds_supports", "ADDITIONAL-GENLPREDS-SUPPORTS", 2, 0, false);
    declareFunction(myName, "additional_negationpreds_supports", "ADDITIONAL-NEGATIONPREDS-SUPPORTS", 2, 0, false);
    declareFunction(myName, "additional_asymmetry_supports", "ADDITIONAL-ASYMMETRY-SUPPORTS", 1, 0, false);
    declareFunction(myName, "additional_predicate_commutativity_supports", "ADDITIONAL-PREDICATE-COMMUTATIVITY-SUPPORTS", 1, 0, false);
    declareFunction(myName, "transformation_gaf_truth_known", "TRANSFORMATION-GAF-TRUTH-KNOWN", 1, 0, false);
    declareFunction(myName, "gaf_truth_known", "GAF-TRUTH-KNOWN", 1, 0, false);
    declareFunction(myName, "modus_tollens_transformation_module_p", "MODUS-TOLLENS-TRANSFORMATION-MODULE-P", 1, 0, false);
    declareFunction(myName, "modus_tollens_transformation_proof_p", "MODUS-TOLLENS-TRANSFORMATION-PROOF-P", 1, 0, false);
    declareMacro(myName, "do_transformation_relevant_directions", "DO-TRANSFORMATION-RELEVANT-DIRECTIONS");
    declareMacro(myName, "do_transformation_rule_literals", "DO-TRANSFORMATION-RULE-LITERALS");
    declareMacro(myName, "do_transformation_predicate_rule_index", "DO-TRANSFORMATION-PREDICATE-RULE-INDEX");
    declareFunction(myName, "new_selected_rules", "NEW-SELECTED-RULES", 0, 0, false);
    declareFunction(myName, "add_selected_rule", "ADD-SELECTED-RULE", 2, 0, false);
    declareFunction(myName, "finalize_selected_rules", "FINALIZE-SELECTED-RULES", 1, 0, false);
    declareFunction(myName, "sort_rules_via_current_inference_rule_preference", "SORT-RULES-VIA-CURRENT-INFERENCE-RULE-PREFERENCE", 1, 0, false);
    declareFunction(myName, "current_inference_rule_preference_G", "CURRENT-INFERENCE-RULE-PREFERENCE->", 2, 0, false);
    declareFunction(myName, "trans_predicate_pos_required", "TRANS-PREDICATE-POS-REQUIRED", 1, 0, false); new $trans_predicate_pos_required$UnaryFunction();
    declareFunction(myName, "trans_predicate_neg_required", "TRANS-PREDICATE-NEG-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_predicate_pos_cost", "TRANS-PREDICATE-POS-COST", 1, 0, false); new $trans_predicate_pos_cost$UnaryFunction();
    declareFunction(myName, "trans_predicate_neg_cost", "TRANS-PREDICATE-NEG-COST", 1, 0, false);
    declareFunction(myName, "trans_predicate_pos_rule_select", "TRANS-PREDICATE-POS-RULE-SELECT", 1, 0, false); new $trans_predicate_pos_rule_select$UnaryFunction();
    declareFunction(myName, "trans_predicate_neg_rule_select", "TRANS-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_predicate_pos_rule_filter", "TRANS-PREDICATE-POS-RULE-FILTER", 2, 0, false); new $trans_predicate_pos_rule_filter$BinaryFunction();
    declareFunction(myName, "trans_predicate_neg_rule_filter", "TRANS-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_predicate_pos_expand", "TRANS-PREDICATE-POS-EXPAND", 2, 0, false); new $trans_predicate_pos_expand$BinaryFunction();
    declareFunction(myName, "trans_predicate_neg_expand", "TRANS-PREDICATE-NEG-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_predicate_required", "TRANS-PREDICATE-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_predicate_cost", "TRANS-PREDICATE-COST", 2, 0, false);
    declareFunction(myName, "trans_predicate_rule_select", "TRANS-PREDICATE-RULE-SELECT", 2, 0, false);
    declareFunction(myName, "trans_predicate_rule_select_int_internal", "TRANS-PREDICATE-RULE-SELECT-INT-INTERNAL", 2, 0, false);
    declareFunction(myName, "trans_predicate_rule_select_int", "TRANS-PREDICATE-RULE-SELECT-INT", 2, 0, false);
    declareFunction(myName, "trans_predicate_rule_filter", "TRANS-PREDICATE-RULE-FILTER", 3, 0, false);
    declareFunction(myName, "trans_predicate_expand", "TRANS-PREDICATE-EXPAND", 3, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_pos_required", "TRANS-PREDICATE-GENLPREDS-POS-REQUIRED", 1, 0, false); new $trans_predicate_genlpreds_pos_required$UnaryFunction();
    declareFunction(myName, "trans_predicate_genlpreds_neg_required", "TRANS-PREDICATE-GENLPREDS-NEG-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_pos_cost", "TRANS-PREDICATE-GENLPREDS-POS-COST", 1, 0, false); new $trans_predicate_genlpreds_pos_cost$UnaryFunction();
    declareFunction(myName, "trans_predicate_genlpreds_neg_cost", "TRANS-PREDICATE-GENLPREDS-NEG-COST", 1, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_pos_rule_select", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT", 1, 0, false); new $trans_predicate_genlpreds_pos_rule_select$UnaryFunction();
    declareFunction(myName, "trans_predicate_genlpreds_pos_rule_select_int_internal", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT-INTERNAL", 1, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_pos_rule_select_int", "TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT", 1, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_neg_rule_select", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_pos_expand_int", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND-INT", 2, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_pos_rule_filter", "TRANS-PREDICATE-GENLPREDS-POS-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_pos_expand", "TRANS-PREDICATE-GENLPREDS-POS-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_neg_expand_int", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND-INT", 2, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_neg_rule_filter", "TRANS-PREDICATE-GENLPREDS-NEG-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_neg_expand", "TRANS-PREDICATE-GENLPREDS-NEG-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_predicate_genlpreds_required", "TRANS-PREDICATE-GENLPREDS-REQUIRED", 1, 0, false);
    declareFunction(myName, "inference_proper_genl_predicateP", "INFERENCE-PROPER-GENL-PREDICATE?", 2, 1, false);
    declareFunction(myName, "trans_predicate_negationpreds_neg_required", "TRANS-PREDICATE-NEGATIONPREDS-NEG-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_predicate_negationpreds_neg_cost", "TRANS-PREDICATE-NEGATIONPREDS-NEG-COST", 1, 0, false);
    declareFunction(myName, "trans_predicate_negationpreds_neg_rule_select", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_predicate_negationpreds_neg_expand_int", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND-INT", 2, 0, false);
    declareFunction(myName, "trans_predicate_negationpreds_neg_rule_filter", "TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_predicate_negationpreds_neg_expand", "TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_predicate_commutativity_cost", "TRANS-PREDICATE-COMMUTATIVITY-COST", 2, 0, false);
    declareFunction(myName, "trans_predicate_commutativity_rule_select", "TRANS-PREDICATE-COMMUTATIVITY-RULE-SELECT", 2, 0, false);
    declareFunction(myName, "trans_predicate_commutativity_expand_int", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND-INT", 3, 0, false);
    declareFunction(myName, "trans_predicate_commutativity_rule_filter", "TRANS-PREDICATE-COMMUTATIVITY-RULE-FILTER", 3, 0, false);
    declareFunction(myName, "trans_predicate_commutativity_expand", "TRANS-PREDICATE-COMMUTATIVITY-EXPAND", 3, 0, false);
    declareFunction(myName, "trans_predicate_symmetry_pos_cost", "TRANS-PREDICATE-SYMMETRY-POS-COST", 1, 0, false); new $trans_predicate_symmetry_pos_cost$UnaryFunction();
    declareFunction(myName, "trans_predicate_symmetry_neg_cost", "TRANS-PREDICATE-SYMMETRY-NEG-COST", 1, 0, false);
    declareFunction(myName, "trans_predicate_symmetry_pos_rule_select", "TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT", 1, 0, false); new $trans_predicate_symmetry_pos_rule_select$UnaryFunction();
    declareFunction(myName, "trans_predicate_symmetry_neg_rule_select", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_predicate_symmetry_pos_rule_filter", "TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER", 2, 0, false); new $trans_predicate_symmetry_pos_rule_filter$BinaryFunction();
    declareFunction(myName, "trans_predicate_symmetry_neg_rule_filter", "TRANS-PREDICATE-SYMMETRY-NEG-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_predicate_symmetry_pos_expand", "TRANS-PREDICATE-SYMMETRY-POS-EXPAND", 2, 0, false); new $trans_predicate_symmetry_pos_expand$BinaryFunction();
    declareFunction(myName, "trans_predicate_symmetry_neg_expand", "TRANS-PREDICATE-SYMMETRY-NEG-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_predicate_commutative_pos_cost", "TRANS-PREDICATE-COMMUTATIVE-POS-COST", 1, 0, false);
    declareFunction(myName, "trans_predicate_commutative_neg_cost", "TRANS-PREDICATE-COMMUTATIVE-NEG-COST", 1, 0, false);
    declareFunction(myName, "trans_predicate_commutative_pos_rule_select", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_predicate_commutative_neg_rule_select", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_predicate_commutative_pos_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_predicate_commutative_neg_rule_filter", "TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_predicate_commutative_pos_expand", "TRANS-PREDICATE-COMMUTATIVE-POS-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_predicate_commutative_neg_expand", "TRANS-PREDICATE-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_predicate_partially_commutative_pos_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-COST", 1, 0, false);
    declareFunction(myName, "trans_predicate_partially_commutative_neg_cost", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-COST", 1, 0, false);
    declareFunction(myName, "trans_predicate_partially_commutative_pos_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_predicate_partially_commutative_neg_rule_select", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_predicate_partially_commutative_pos_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_predicate_partially_commutative_neg_rule_filter", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_predicate_partially_commutative_pos_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_predicate_partially_commutative_neg_expand", "TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_predicate_asymmetry_cost", "TRANS-PREDICATE-ASYMMETRY-COST", 1, 0, false);
    declareFunction(myName, "trans_predicate_asymmetry_rule_select", "TRANS-PREDICATE-ASYMMETRY-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_predicate_asymmetry_expand_int", "TRANS-PREDICATE-ASYMMETRY-EXPAND-INT", 2, 0, false);
    declareFunction(myName, "trans_predicate_asymmetry_rule_filter", "TRANS-PREDICATE-ASYMMETRY-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_predicate_asymmetry_expand", "TRANS-PREDICATE-ASYMMETRY-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_unbound_predicate_module_p", "TRANS-UNBOUND-PREDICATE-MODULE-P", 1, 0, false);
    declareFunction(myName, "module_requires_unbound_predicate_transformationP", "MODULE-REQUIRES-UNBOUND-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "trans_unbound_predicate_pos_required", "TRANS-UNBOUND-PREDICATE-POS-REQUIRED", 1, 0, false); new $trans_unbound_predicate_pos_required$UnaryFunction();
    declareFunction(myName, "trans_unbound_predicate_neg_required", "TRANS-UNBOUND-PREDICATE-NEG-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_unbound_predicate_pos_cost", "TRANS-UNBOUND-PREDICATE-POS-COST", 1, 0, false); new $trans_unbound_predicate_pos_cost$UnaryFunction();
    declareFunction(myName, "trans_unbound_predicate_neg_cost", "TRANS-UNBOUND-PREDICATE-NEG-COST", 1, 0, false);
    declareFunction(myName, "trans_unbound_predicate_pos_rule_select", "TRANS-UNBOUND-PREDICATE-POS-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_unbound_predicate_neg_rule_select", "TRANS-UNBOUND-PREDICATE-NEG-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_unbound_predicate_pos_rule_filter", "TRANS-UNBOUND-PREDICATE-POS-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_unbound_predicate_neg_rule_filter", "TRANS-UNBOUND-PREDICATE-NEG-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_unbound_predicate_pos_expand", "TRANS-UNBOUND-PREDICATE-POS-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_unbound_predicate_neg_expand", "TRANS-UNBOUND-PREDICATE-NEG-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_unbound_predicate_required", "TRANS-UNBOUND-PREDICATE-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_unbound_predicate_cost", "TRANS-UNBOUND-PREDICATE-COST", 1, 0, false);
    declareFunction(myName, "trans_unbound_predicate_rule_select", "TRANS-UNBOUND-PREDICATE-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_unbound_predicate_rule_filter", "TRANS-UNBOUND-PREDICATE-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_unbound_predicate_expand", "TRANS-UNBOUND-PREDICATE-EXPAND", 3, 0, false);
    declareFunction(myName, "module_requires_hl_predicate_transformationP", "MODULE-REQUIRES-HL-PREDICATE-TRANSFORMATION?", 1, 0, false);
    declareFunction(myName, "trans_isa_pos_required", "TRANS-ISA-POS-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_isa_neg_required", "TRANS-ISA-NEG-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_isa_pos_cost", "TRANS-ISA-POS-COST", 1, 0, false);
    declareFunction(myName, "trans_isa_neg_cost", "TRANS-ISA-NEG-COST", 1, 0, false);
    declareFunction(myName, "inference_memoized_all_specs_internal", "INFERENCE-MEMOIZED-ALL-SPECS-INTERNAL", 1, 1, false);
    declareFunction(myName, "inference_memoized_all_specs", "INFERENCE-MEMOIZED-ALL-SPECS", 1, 1, false);
    declareFunction(myName, "trans_isa_pos_rule_select_count_internal", "TRANS-ISA-POS-RULE-SELECT-COUNT-INTERNAL", 2, 0, false);
    declareFunction(myName, "trans_isa_pos_rule_select_count", "TRANS-ISA-POS-RULE-SELECT-COUNT", 2, 0, false);
    declareFunction(myName, "trans_isa_pos_rule_select", "TRANS-ISA-POS-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_isa_pos_expand_int", "TRANS-ISA-POS-EXPAND-INT", 2, 0, false);
    declareFunction(myName, "trans_isa_pos_rule_filter", "TRANS-ISA-POS-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_isa_pos_expand", "TRANS-ISA-POS-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_isa_neg_rule_select", "TRANS-ISA-NEG-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_isa_neg_expand_int", "TRANS-ISA-NEG-EXPAND-INT", 2, 0, false);
    declareFunction(myName, "trans_isa_neg_rule_filter", "TRANS-ISA-NEG-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_isa_neg_expand", "TRANS-ISA-NEG-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_genls_pos_required", "TRANS-GENLS-POS-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_genls_neg_required", "TRANS-GENLS-NEG-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_genls_pos_cost", "TRANS-GENLS-POS-COST", 1, 0, false);
    declareFunction(myName, "trans_genls_neg_cost", "TRANS-GENLS-NEG-COST", 1, 0, false);
    declareFunction(myName, "trans_genls_pos_rule_select", "TRANS-GENLS-POS-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_genls_pos_expand_int", "TRANS-GENLS-POS-EXPAND-INT", 2, 0, false);
    declareFunction(myName, "trans_genls_pos_rule_filter", "TRANS-GENLS-POS-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_genls_pos_expand", "TRANS-GENLS-POS-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_genls_neg_rule_select", "TRANS-GENLS-NEG-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_genls_neg_expand_int", "TRANS-GENLS-NEG-EXPAND-INT", 2, 0, false);
    declareFunction(myName, "trans_genls_neg_rule_filter", "TRANS-GENLS-NEG-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_genls_neg_expand", "TRANS-GENLS-NEG-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_genl_mt_pos_required", "TRANS-GENL-MT-POS-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_genl_mt_neg_required", "TRANS-GENL-MT-NEG-REQUIRED", 1, 0, false);
    declareFunction(myName, "trans_genl_mt_pos_cost", "TRANS-GENL-MT-POS-COST", 1, 0, false);
    declareFunction(myName, "trans_genl_mt_neg_cost", "TRANS-GENL-MT-NEG-COST", 1, 0, false);
    declareFunction(myName, "inference_memoized_all_spec_mts_internal", "INFERENCE-MEMOIZED-ALL-SPEC-MTS-INTERNAL", 1, 1, false);
    declareFunction(myName, "inference_memoized_all_spec_mts", "INFERENCE-MEMOIZED-ALL-SPEC-MTS", 1, 1, false);
    declareFunction(myName, "trans_genl_mt_pos_rule_select", "TRANS-GENL-MT-POS-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_genl_mt_pos_expand_int", "TRANS-GENL-MT-POS-EXPAND-INT", 2, 0, false);
    declareFunction(myName, "trans_genl_mt_pos_rule_filter", "TRANS-GENL-MT-POS-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_genl_mt_pos_expand", "TRANS-GENL-MT-POS-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_genl_mt_neg_rule_select", "TRANS-GENL-MT-NEG-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_genl_mt_neg_expand_int", "TRANS-GENL-MT-NEG-EXPAND-INT", 2, 0, false);
    declareFunction(myName, "trans_genl_mt_neg_rule_filter", "TRANS-GENL-MT-NEG-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_genl_mt_neg_expand", "TRANS-GENL-MT-NEG-EXPAND", 2, 0, false);
    declareFunction(myName, "trans_abnormal_cost", "TRANS-ABNORMAL-COST", 1, 0, false);
    declareFunction(myName, "trans_abnormal_rule_select", "TRANS-ABNORMAL-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "trans_abnormal_expand_int", "TRANS-ABNORMAL-EXPAND-INT", 2, 0, false);
    declareFunction(myName, "trans_abnormal_rule_filter", "TRANS-ABNORMAL-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "trans_abnormal_expand", "TRANS-ABNORMAL-EXPAND", 2, 0, false);
    declareFunction(myName, "transformation_abduction_to_specs_required", "TRANSFORMATION-ABDUCTION-TO-SPECS-REQUIRED", 1, 1, false);
    declareFunction(myName, "find_genls_definitional_rules", "FIND-GENLS-DEFINITIONAL-RULES", 0, 0, false);
    declareFunction(myName, "transformation_abduction_to_specs_rule_select", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-SELECT", 1, 0, false);
    declareFunction(myName, "transformation_abduction_to_specs_rule_filter", "TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-FILTER", 2, 0, false);
    declareFunction(myName, "transformation_abduction_to_specs_expand", "TRANSFORMATION-ABDUCTION-TO-SPECS-EXPAND", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_transformation_modules_file() {
    $transformation_gaf_truth_known_disabled$ = defparameter("*TRANSFORMATION-GAF-TRUTH-KNOWN-DISABLED*", T);
    $unbound_predicate_transformation_required_modules$ = deflexical("*UNBOUND-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list73);
    $hl_predicate_transformation_required_modules$ = deflexical("*HL-PREDICATE-TRANSFORMATION-REQUIRED-MODULES*", $list78);
    $genls_definitional_sentence$ = defparameter("*GENLS-DEFINITIONAL-SENTENCE*", $list98);
    $genls_definitional_rules$ = defparameter("*GENLS-DEFINITIONAL-RULES*", NIL);
    return NIL;
  }

  public static final SubLObject setup_transformation_modules_file() {
    // CVS_ID("Id: transformation-modules.lisp 126640 2008-12-04 13:39:36Z builder ");
    inference_modules.inference_transformation_module($kw44$TRANS_PREDICATE_POS, $list45);
    inference_modules.inference_transformation_module($kw46$TRANS_PREDICATE_NEG, $list47);
    memoization_state.note_memoized_function($sym48$TRANS_PREDICATE_RULE_SELECT_INT);
    memoization_state.note_memoized_function($sym52$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT);
    inference_modules.inference_transformation_module($kw53$TRANS_PREDICATE_GENLPREDS_POS, $list54);
    inference_modules.inference_transformation_module($kw55$TRANS_PREDICATE_GENLPREDS_NEG, $list56);
    inference_modules.inference_transformation_module($kw57$TRANS_PREDICATE_NEGATIONPREDS_NEG, $list58);
    inference_modules.inference_transformation_module($kw59$TRANS_PREDICATE_SYMMETRY_POS, $list60);
    inference_modules.inference_transformation_module($kw61$TRANS_PREDICATE_SYMMETRY_NEG, $list62);
    inference_modules.inference_transformation_module($kw63$TRANS_PREDICATE_COMMUTATIVE_POS, $list64);
    inference_modules.inference_transformation_module($kw65$TRANS_PREDICATE_COMMUTATIVE_NEG, $list66);
    inference_modules.inference_transformation_module($kw67$TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS, $list68);
    inference_modules.inference_transformation_module($kw69$TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG, $list70);
    inference_modules.inference_transformation_module($kw71$TRANS_PREDICATE_ASYMMETRY, $list72);
    inference_modules.inference_transformation_module($kw74$TRANS_UNBOUND_PREDICATE_POS, $list75);
    inference_modules.inference_transformation_module($kw76$TRANS_UNBOUND_PREDICATE_NEG, $list77);
    memoization_state.note_memoized_function($sym79$INFERENCE_MEMOIZED_ALL_SPECS);
    memoization_state.note_memoized_function($sym80$TRANS_ISA_POS_RULE_SELECT_COUNT);
    inference_modules.inference_transformation_module($kw82$TRANS_ISA_POS, $list83);
    inference_modules.inference_transformation_module($kw84$TRANS_ISA_NEG, $list85);
    inference_modules.inference_transformation_module($kw86$TRANS_GENLS_POS, $list87);
    inference_modules.inference_transformation_module($kw88$TRANS_GENLS_NEG, $list89);
    memoization_state.note_memoized_function($sym90$INFERENCE_MEMOIZED_ALL_SPEC_MTS);
    inference_modules.inference_transformation_module($kw91$TRANS_GENL_MT_POS, $list92);
    inference_modules.inference_transformation_module($kw93$TRANS_GENL_MT_NEG, $list94);
    inference_modules.inference_transformation_module($kw96$TRANS_ABNORMAL, $list97);
    inference_modules.inference_transformation_module($kw99$TRANSFORMATION_ABDUCTION_TO_SPECS, $list100);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $kw1$GENLS = makeKeyword("GENLS");
  public static final SubLObject $const2$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $kw3$GENLMT = makeKeyword("GENLMT");
  public static final SubLObject $const4$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw5$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLObject $const6$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLSymbol $kw7$NEGATIONPREDS = makeKeyword("NEGATIONPREDS");
  public static final SubLObject $const8$AsymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("AsymmetricBinaryPredicate"));
  public static final SubLObject $const9$SymmetricBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("SymmetricBinaryPredicate"));
  public static final SubLObject $const10$CommutativePredicate = constant_handles.reader_make_constant_shell(makeString("CommutativePredicate"));
  public static final SubLObject $const11$PartiallyCommutativePredicate = constant_handles.reader_make_constant_shell(makeString("PartiallyCommutativePredicate"));
  public static final SubLString $str12$Unexpected_commutative_predicate_ = makeString("Unexpected commutative predicate ~s");
  public static final SubLSymbol $kw13$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $kw14$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw15$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $kw16$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $kw17$NEG = makeKeyword("NEG");
  public static final SubLList $list18 = list(list(makeSymbol("DIRECTION-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym19$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLList $list20 = list(list(makeSymbol("RELEVANT-DIRECTIONS")));
  public static final SubLList $list21 = list(list(makeSymbol("RULE-ASENT-VAR"), makeSymbol("RULE"), makeSymbol("SENSE"), makeSymbol("&KEY"), makeSymbol("PREDICATE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list22 = list(makeKeyword("PREDICATE"));
  public static final SubLSymbol $kw23$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw24$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $sym25$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");
  public static final SubLSymbol $sym26$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym27$DO_TRANSFORMATION_RULE_LITERALS = makeSymbol("DO-TRANSFORMATION-RULE-LITERALS");
  public static final SubLSymbol $sym28$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym29$ATOMIC_SENTENCE_PREDICATE = makeSymbol("ATOMIC-SENTENCE-PREDICATE");
  public static final SubLSymbol $sym30$RULE_VAR = makeUninternedSymbol("RULE-VAR");
  public static final SubLSymbol $sym31$RULE_RELEVANT_TO_PROOF = makeSymbol("RULE-RELEVANT-TO-PROOF");
  public static final SubLSymbol $sym32$DO_ASSERTION_LITERALS = makeSymbol("DO-ASSERTION-LITERALS");
  public static final SubLSymbol $kw33$SENSE = makeKeyword("SENSE");
  public static final SubLList $list34 = list(list(makeSymbol("RULE-ASENT-VAR"), makeSymbol("RULE-VAR"), makeSymbol("PREDICATE"), makeSymbol("SENSE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym35$DIRECTION_VAR = makeUninternedSymbol("DIRECTION-VAR");
  public static final SubLSymbol $sym36$SENSE_VAR = makeUninternedSymbol("SENSE-VAR");
  public static final SubLSymbol $sym37$PREDICATE_VAR = makeUninternedSymbol("PREDICATE-VAR");
  public static final SubLSymbol $sym38$DO_TRANSFORMATION_RELEVANT_DIRECTIONS = makeSymbol("DO-TRANSFORMATION-RELEVANT-DIRECTIONS");
  public static final SubLSymbol $sym39$DO_PREDICATE_RULE_INDEX = makeSymbol("DO-PREDICATE-RULE-INDEX");
  public static final SubLSymbol $kw40$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $sym41$CURRENT_INFERENCE_RULE_PREFERENCE__ = makeSymbol("CURRENT-INFERENCE-RULE-PREFERENCE->");
  public static final SubLSymbol $sym42$TRANSFORMATION_RULE_UTILITY__ = makeSymbol("TRANSFORMATION-RULE-UTILITY->");
  public static final SubLSymbol $kw43$POS = makeKeyword("POS");
  public static final SubLSymbol $kw44$TRANS_PREDICATE_POS = makeKeyword("TRANS-PREDICATE-POS");
  public static final SubLList $list45 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$likesAsFriend #$AbrahamLincoln ?WHO)\nfrom a rule concluding to #$likesAsFriend")});
  public static final SubLSymbol $kw46$TRANS_PREDICATE_NEG = makeKeyword("TRANS-PREDICATE-NEG");
  public static final SubLList $list47 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom a rule concluding from #$likesAsFriend")});
  public static final SubLSymbol $sym48$TRANS_PREDICATE_RULE_SELECT_INT = makeSymbol("TRANS-PREDICATE-RULE-SELECT-INT");
  public static final SubLSymbol $kw49$RULE = makeKeyword("RULE");
  public static final SubLSymbol $kw50$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLString $str51$Invalid_sense__s = makeString("Invalid sense ~s");
  public static final SubLSymbol $sym52$TRANS_PREDICATE_GENLPREDS_POS_RULE_SELECT_INT = makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT-INT");
  public static final SubLSymbol $kw53$TRANS_PREDICATE_GENLPREDS_POS = makeKeyword("TRANS-PREDICATE-GENLPREDS-POS");
  public static final SubLList $list54 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLPREDS-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <whatever>)\nwhere <predicate> is a FORT with some spec-preds\nfrom a rule concluding to a spec-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$acquaintedWith #$AbrahamLincoln ?WHO)\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding to #$likesAsFriend")});
  public static final SubLSymbol $kw55$TRANS_PREDICATE_GENLPREDS_NEG = makeKeyword("TRANS-PREDICATE-GENLPREDS-NEG");
  public static final SubLList $list56 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-GENLPREDS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some genl-preds\nfrom a rule concluding from a genl-pred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$genlPreds #$likesAsFriend #$acquaintedWith)\nand a rule concluding from #$acquaintedWith")});
  public static final SubLSymbol $kw57$TRANS_PREDICATE_NEGATIONPREDS_NEG = makeKeyword("TRANS-PREDICATE-NEGATIONPREDS-NEG");
  public static final SubLList $list58 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), cons(list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?"))), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-NEGATIONPREDS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <whatever>))\nwhere <predicate> is a FORT with some negationPreds,\neither asserted or inferrable via genlPreds,\nfrom a rule concluding to a negationPred of <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$likesAsFriend #$AbrahamLincoln ?WHO))\nfrom (#$negationPreds #$likesAsFriend #$hates)\nand a rule concluding to #$hates")});
  public static final SubLSymbol $kw59$TRANS_PREDICATE_SYMMETRY_POS = makeKeyword("TRANS-PREDICATE-SYMMETRY-POS");
  public static final SubLList $list60 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-SYMMETRY-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$bordersOn #$Canada ?WHAT)\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding to #$bordersOn")});
  public static final SubLSymbol $kw61$TRANS_PREDICATE_SYMMETRY_NEG = makeKeyword("TRANS-PREDICATE-SYMMETRY-NEG");
  public static final SubLList $list62 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-SYMMETRY-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$SymmetricBinaryPredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$bordersOn #$Canada ?WHAT))\nfrom (#$isa #$bordersOn #$SymmetricBinaryPredicate)\nand a rule concluding from #$bordersOn")});
  public static final SubLSymbol $kw63$TRANS_PREDICATE_COMMUTATIVE_POS = makeKeyword("TRANS-PREDICATE-COMMUTATIVE-POS");
  public static final SubLList $list64 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> . <args>)\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$collinear <point A> <point B> <point C>)\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding to #$collinear")});
  public static final SubLSymbol $kw65$TRANS_PREDICATE_COMMUTATIVE_NEG = makeKeyword("TRANS-PREDICATE-COMMUTATIVE-NEG");
  public static final SubLList $list66 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-COMMUTATIVE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> . <args>))\nwhere <predicate> is a FORT\nthere are at least 3 args in <args>\nand (#$isa <predicate> #$CommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$collinear <point A> <point B> <point C>))\nfrom (#$isa #$collinear #$CommutativePredicate)\nand a rule concluding from #$collinear")});
  public static final SubLSymbol $kw67$TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_POS = makeKeyword("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS");
  public static final SubLList $list68 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <whatever> <whatever>)\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(distanceBetween PlanetEarth Sun ((Mega Mile) 93))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding to #$distanceBetween")});
  public static final SubLSymbol $kw69$TRANS_PREDICATE_PARTIALLY_COMMUTATIVE_NEG = makeKeyword("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG");
  public static final SubLList $list70 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), listS(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-PARTIALLY-COMMUTATIVE-PREDICATE-P")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-PARTIALLY-COMMUTATIVE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$PartiallyCommutativePredicate)\nfrom a rule concluding from <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(not (distanceBetween PlanetEarth Sun (Inch 93)))\nfrom (#$isa #$distanceBetween #$PartiallyCommutativePredicate)\nand  (#$commutativeInArgs #$distanceBetween 1 2)\nand a rule concluding from #$distanceBetween")});
  public static final SubLSymbol $kw71$TRANS_PREDICATE_ASYMMETRY = makeKeyword("TRANS-PREDICATE-ASYMMETRY");
  public static final SubLList $list72 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-ASYMMETRIC-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-PREDICATE-ASYMMETRY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <whatever> <whatever>))\nwhere <predicate> is a FORT\nand (#$isa <predicate> #$AsymmetricBinaryPredicate)\nfrom a rule concluding to <predicate>\nusing the predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$northOf ?WHAT #$Canada))\nfrom (#$isa #$northOf #$AsymmetricBinaryPredicate)\nand a rule concluding to #$northOf")});
  public static final SubLList $list73 = list(makeKeyword("TRANS-UNBOUND-PREDICATE-POS"), makeKeyword("TRANS-UNBOUND-PREDICATE-NEG"));
  public static final SubLSymbol $kw74$TRANS_UNBOUND_PREDICATE_POS = makeKeyword("TRANS-UNBOUND-PREDICATE-POS");
  public static final SubLList $list75 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-UNBOUND-PREDICATE-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<whatever> . <whatever>)\nfrom a rule concluding to a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$implies\n      (#$and (#$isa ?ORDER #$MathematicalOrdering) (#$baseSet ?ORDER ?SET)\n       (#$orderingRelations ?ORDER ?PRED) (#$elementOf ?X ?SET)\n       (#$elementOf ?Y ?SET) (?PRED ?X ?Y) (#$elementOf ?Z ?SET)\n       (?PRED ?Y ?Z))\n      (?PRED ?X ?Z))")});
  public static final SubLSymbol $kw76$TRANS_UNBOUND_PREDICATE_NEG = makeKeyword("TRANS-UNBOUND-PREDICATE-NEG");
  public static final SubLList $list77 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("REQUIRED"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-UNBOUND-PREDICATE-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (<whatever> . <whatever>))\nfrom a rule concluding from a sentence with a variable as the predicate\nusing the unbound predicate rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("no current example")});
  public static final SubLList $list78 = list(makeKeyword("TRANS-ISA-POS"), makeKeyword("TRANS-ISA-NEG"), makeKeyword("TRANS-GENLS-POS"), makeKeyword("TRANS-GENLS-NEG"), makeKeyword("TRANS-GENL-MT-POS"), makeKeyword("TRANS-GENL-MT-NEG"));
  public static final SubLSymbol $sym79$INFERENCE_MEMOIZED_ALL_SPECS = makeSymbol("INFERENCE-MEMOIZED-ALL-SPECS");
  public static final SubLSymbol $sym80$TRANS_ISA_POS_RULE_SELECT_COUNT = makeSymbol("TRANS-ISA-POS-RULE-SELECT-COUNT");
  public static final SubLObject $const81$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw82$TRANS_ISA_POS = makeKeyword("TRANS-ISA-POS");
  public static final SubLList $list83 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"), makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("TRANS-ISA-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-ISA-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ISA-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ISA-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-ISA-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the isa rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$isa #$AbrahamLincoln #$FamousPerson)\nfrom (#$genls #$UnitedStatesPresident #$FamousPerson)\nand a rule concluding to #$isa #$UnitedStatesPresident")});
  public static final SubLSymbol $kw84$TRANS_ISA_NEG = makeKeyword("TRANS-ISA-NEG");
  public static final SubLList $list85 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"), makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("TRANS-ISA-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-ISA-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ISA-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ISA-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-ISA-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the isa rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa #$AbrahamLincoln #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from #$isa #$EuropeanPerson")});
  public static final SubLSymbol $kw86$TRANS_GENLS_POS = makeKeyword("TRANS-GENLS-POS");
  public static final SubLList $list87 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("ANYTHING"), makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENLS-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-GENLS-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENLS-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENLS-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENLS-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <whatever> <collection>)\nwhere <collection> is a FORT\nfrom a rule concluding to a spec of <collection>\nusing the genls rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$genls #$UnitedStatesPresident #$FamousPerson)\nfrom (#$genls #$WorldLeader #$FamousPerson)\nand a rule concluding to (#$genls ?X #$WorldLeader)")});
  public static final SubLSymbol $kw88$TRANS_GENLS_NEG = makeKeyword("TRANS-GENLS-NEG");
  public static final SubLList $list89 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("ANYTHING"), makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENLS-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-GENLS-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENLS-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENLS-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENLS-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genls <whatever> <collection>))\nwhere <collection> is a FORT\nfrom a rule concluding from a genl of <collection>\nusing the genls rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$genls #$UnitedStatesPresident #$FrenchPerson))\nfrom (#$genls #$FrenchPerson #$EuropeanPerson)\nand a rule concluding from (#$genls ?X #$EuropeanPerson)")});
  public static final SubLSymbol $sym90$INFERENCE_MEMOIZED_ALL_SPEC_MTS = makeSymbol("INFERENCE-MEMOIZED-ALL-SPEC-MTS");
  public static final SubLSymbol $kw91$TRANS_GENL_MT_POS = makeKeyword("TRANS-GENL-MT-POS");
  public static final SubLList $list92 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlMt")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlMt")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("HLMT-P"))), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENL-MT-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-GENL-MT-POS-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENL-MT-POS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENL-MT-POS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENL-MT-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genlMt <whatever> <microtheory>)\nwhere <microtheory> is a FORT\nfrom a rule concluding to a spec of <microtheory>\nusing the genlMt rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$genlMt #$UnitedStatesPresidentsMt #$FamousPeopleMt)\nfrom (#$genlMt #$WorldLeadersMt #$FamousPeopleMt)\nand a rule concluding to (#$genlMt ?X #$WorldLeadersMt)")});
  public static final SubLSymbol $kw93$TRANS_GENL_MT_NEG = makeKeyword("TRANS-GENL-MT-NEG");
  public static final SubLList $list94 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlMt")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlMt")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("HLMT-P"))), makeKeyword("REQUIRED"), makeSymbol("TRANS-GENL-MT-NEG-REQUIRED"), makeKeyword("COST"), makeSymbol("TRANS-GENL-MT-NEG-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-GENL-MT-NEG-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-GENL-MT-NEG-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-GENL-MT-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genlMt <whatever> <microtheory>))\nwhere <microtheory> is a FORT\nfrom a rule concluding from a genl of <microtheory>\nusing the genlMt rule indexing in the KB"), makeKeyword("EXAMPLE"), makeString("(#$not (#$genlMt #$UnitedStatesPresidentsMt #$FrenchPeopleMt))\nfrom (#$genlMt #$FrenchPeopleMt #$EuropeanPeopleMt)\nand a rule concluding from (#$genlMt ?X #$EuropeanPeopleMt)")});
  public static final SubLObject $const95$abnormal = constant_handles.reader_make_constant_shell(makeString("abnormal"));
  public static final SubLSymbol $kw96$TRANS_ABNORMAL = makeKeyword("TRANS-ABNORMAL");
  public static final SubLList $list97 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("abnormal")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("abnormal")), makeKeyword("ANYTHING"), makeKeyword("ASSERTION")), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("COST"), makeSymbol("TRANS-ABNORMAL-COST"), makeKeyword("RULE-SELECT"), makeSymbol("TRANS-ABNORMAL-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANS-ABNORMAL-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANS-ABNORMAL-EXPAND")});
  public static final SubLList $list98 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), makeSymbol("?SUBSET")), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeSymbol("?SUBSET"), makeSymbol("?SUPERSET"))), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), makeSymbol("?SUPERSET")));
  public static final SubLSymbol $kw99$TRANSFORMATION_ABDUCTION_TO_SPECS = makeKeyword("TRANSFORMATION-ABDUCTION-TO-SPECS");
  public static final SubLList $list100 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-ABDUCTION-COST*"), makeKeyword("RULE-SELECT"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-SELECT"), makeKeyword("RULE-FILTER"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-RULE-FILTER"), makeKeyword("EXPAND"), makeSymbol("TRANSFORMATION-ABDUCTION-TO-SPECS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fort> <fully-bound>)\n   where the asent is deemed abducible, and the problem store allows abduction,\n   using #$genls rules."), makeKeyword("EXAMPLE"), makeString("(#$isa #$GeorgeWBush #$Parent)")});

  //// Initializers

  public void declareFunctions() {
    declare_transformation_modules_file();
  }

  public void initializeVariables() {
    init_transformation_modules_file();
  }

  public void runTopLevelForms() {
    setup_transformation_modules_file();
  }

}
