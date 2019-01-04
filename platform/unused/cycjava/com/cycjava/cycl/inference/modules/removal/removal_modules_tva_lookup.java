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

package  com.cyc.cycjava.cycl.inference.modules.removal;

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
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.ghl_search_utilities;
import com.cyc.cycjava.cycl.gt_methods;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.pred_relevance_macros;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_symmetry;
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
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.tva_cache;
import com.cyc.cycjava.cycl.tva_inference;
import com.cyc.cycjava.cycl.tva_utilities;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.wff;

public  final class removal_modules_tva_lookup extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_tva_lookup() {}
  public static final SubLFile me = new removal_modules_tva_lookup();
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 1139) 
  public static final SubLObject tva_pos_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
    {
      SubLObject inference = inference_datastructures_strategy.strategic_context_inference(strategic_context);
      SubLObject allow_allP = Types.sublisp_null(inference);
      SubLObject check_allowedP = makeBoolean(((NIL != allow_allP)
          || (NIL != inference_datastructures_inference.inference_allows_use_of_moduleP(inference, inference_modules.find_hl_module_by_name($kw2$REMOVAL_TVA_CHECK)))));
      SubLObject unify_allowedP = makeBoolean(((NIL != allow_allP)
          || (NIL != inference_datastructures_inference.inference_allows_use_of_moduleP(inference, inference_modules.find_hl_module_by_name($kw3$REMOVAL_TVA_UNIFY)))));
      SubLObject unify_closure_allowedP = makeBoolean(((NIL != allow_allP)
          || (NIL != inference_datastructures_inference.inference_allows_use_of_moduleP(inference, inference_modules.find_hl_module_by_name($kw4$REMOVAL_TVA_UNIFY_CLOSURE)))));
      if (((NIL != inference)
           && ($kw5$NONE == inference_datastructures_inference.inference_transitive_closure_mode(inference)))) {
        unify_closure_allowedP = NIL;
      }
      if ((NIL == check_allowedP)) {
        if (((NIL == unify_allowedP)
             && (NIL == unify_closure_allowedP))) {
          return NIL;
        } else {
          return $kw6$PREFERRED;
        }
      } else if ((NIL != variables.fully_bound_p(asent))) {
        return $kw6$PREFERRED;
      } else if (((NIL != tva_cache.tva_cache_enabled_p())
           && (NIL != formula_pattern_match.formula_matches_pattern(asent, $list7))
           && (NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(cycl_utilities.atomic_sentence_predicate(asent), TWO_INTEGER)))) {
        return $kw6$PREFERRED;
      } else if (((NIL != tva_cache.tva_cache_enabled_p())
           && (NIL != formula_pattern_match.formula_matches_pattern(asent, $list8))
           && (NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(cycl_utilities.atomic_sentence_predicate(asent), ONE_INTEGER)))) {
        return $kw6$PREFERRED;
      } else if (((NIL != forts.fort_p(cycl_utilities.atomic_sentence_predicate(asent)))
           && (NIL != removal_tva_required(asent))
           && (NIL != tva_applicable_to_some_bindable_argP(asent, bindable_vars)))) {
        if ((NIL == tva_asent_has_fully_bound_argP(asent))) {
          return $kw9$DISALLOWED;
        } else if (($kw10$TACTICAL == strategic_context)) {
          return $kw11$DISPREFERRED;
        } else if (((NIL != unify_closure_allowedP)
             && ($kw12$ALL == inference_datastructures_inference.inference_transitive_closure_mode(inference)))) {
          return $kw6$PREFERRED;
        } else if (((NIL == unify_allowedP)
             && (NIL == unify_closure_allowedP))) {
          return $kw13$GROSSLY_DISPREFERRED;
        } else {
          return $kw11$DISPREFERRED;
        }
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 3462) 
  public static final SubLObject tva_asent_has_fully_bound_argP(SubLObject asent) {
    {
      SubLObject found_fully_bound_argP = NIL;
      SubLObject args = cycl_utilities.formula_args(asent, $kw14$IGNORE);
      SubLObject rest = NIL;
      for (rest = args; (!(((NIL != found_fully_bound_argP)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject arg = rest.first();
          if ((NIL != variables.fully_bound_p(arg))) {
            found_fully_bound_argP = T;
          }
        }
      }
      return found_fully_bound_argP;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 3717) 
  public static final SubLObject tva_applicable_to_some_bindable_argP(SubLObject asent, SubLObject bindable_vars) {
    {
      SubLObject applicableP = NIL;
      SubLObject tva_asent_pred = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject argnum = ZERO_INTEGER;
      SubLObject args = cycl_utilities.formula_args(asent, $kw14$IGNORE);
      SubLObject rest = NIL;
      for (rest = args; (!(((NIL != applicableP)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject arg = rest.first();
          argnum = Numbers.add(argnum, ONE_INTEGER);
          if ((NIL != list_utilities.tree_find_any(bindable_vars, arg, UNPROVIDED, UNPROVIDED))) {
            if ((NIL != tva_utilities.any_tva_for_argP(tva_asent_pred, argnum))) {
              applicableP = T;
            }
          }
        }
      }
      return applicableP;
    }
  }

  /** @return booleanp. Whether ASENT meets the requirements to be proved by :tva */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 11849) 
  public static final SubLObject removal_tva_required(SubLObject asent) {
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      return makeBoolean(((NIL != forts.fort_p(predicate))
             && ((NIL != tva_utilities.some_tva_for_predicate(predicate))
              || (NIL != tva_utilities.some_cva_for_predicate(predicate)))
             && (NIL == list_utilities.tree_find_if($sym31$FAST_NON_SKOLEM_INDETERMINATE_TERM_, asent, UNPROVIDED))));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 12234) 
  public static final SubLObject removal_tva_check_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_tva_required(asent);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 12426) 
  private static SubLSymbol $default_tva_check_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 13870) 
  public static final SubLObject removal_tva_unify_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return makeBoolean(((NIL != removal_tva_unify_required_int(asent, UNPROVIDED))
           && (NIL != tva_unify_usefulP(asent))));
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 14112) 
  public static final SubLObject removal_tva_unify_required_int_internal(SubLObject asent, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    return makeBoolean(((NIL != removal_tva_required(asent))
           && (NIL != no_nested_variables_p(asent))));
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 14112) 
  public static final SubLObject removal_tva_unify_required_int(SubLObject asent, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return removal_tva_unify_required_int_internal(asent, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym34$REMOVAL_TVA_UNIFY_REQUIRED_INT, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym34$REMOVAL_TVA_UNIFY_REQUIRED_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym34$REMOVAL_TVA_UNIFY_REQUIRED_INT, caching_state);
        }
        {
          SubLObject sxhash = memoization_state.sxhash_calc_2(asent, mt);
          SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
          if ((collisions != $kw35$_MEMOIZED_ITEM_NOT_FOUND_)) {
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
                {
                  SubLObject cached_args = collision.first();
                  SubLObject results2 = conses_high.second(collision);
                  if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args)
                         && (NIL == cached_args.rest())
                         && mt.equal(cached_args.first()))) {
                      return memoization_state.caching_results(results2);
                    }
                  }
                }
              }
            }
          }
          {
            SubLObject results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(removal_tva_unify_required_int_internal(asent, mt)));
            memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(asent, mt));
            return memoization_state.caching_results(results);
          }
        }
      }
    }
  }

  /** TVA will only be useful on ASENT if ASENT has some non-variable terms in transitivity arg positions. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 14319) 
  public static final SubLObject tva_unify_usefulP(SubLObject asent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tva_asent_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject tva_term_argnums = tva_inference.determine_term_argnums(asent);
        SubLObject found_use_for_unifyP = tva_unify_from_cache_possibleP(asent);
        if ((NIL == found_use_for_unifyP)) {
          {
            SubLObject node_var = tva_asent_pred;
            SubLObject deck_type = (false ? ((SubLObject) $kw37$STACK) : $kw38$QUEUE);
            SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            {
              SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
              try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                {
                  SubLObject tv_var = NIL;
                  {
                    SubLObject _prev_bind_0_32 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                      sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                      sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym39$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                      if ((NIL != tv_var)) {
                        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                          if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            {
                              SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                              if (pcase_var.eql($kw40$ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str41$_A_is_not_a__A, tv_var, $sym42$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                              } else if (pcase_var.eql($kw43$CERROR)) {
                                Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2139");
                              } else if (pcase_var.eql($kw45$WARN)) {
                                Errors.warn($str41$_A_is_not_a__A, tv_var, $sym42$SBHL_TRUE_TV_P);
                              } else {
                                Errors.warn($str46$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($str44$continue_anyway, $str41$_A_is_not_a__A, tv_var, $sym42$SBHL_TRUE_TV_P);
                              }
                            }
                          }
                        }
                      }
                      {
                        SubLObject _prev_bind_0_33 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        SubLObject _prev_bind_1_34 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const47$genlPreds), thread);
                          sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const47$genlPreds)), thread);
                          sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const47$genlPreds)), thread);
                          sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                          sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const47$genlPreds), thread);
                          if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                              || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(tva_asent_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                            {
                              SubLObject _prev_bind_0_35 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                              SubLObject _prev_bind_1_36 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                              SubLObject _prev_bind_2_37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                              try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($const47$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                node_and_predicate_mode = list(tva_asent_pred, sbhl_search_vars.genl_inverse_mode_p());
                                while (((NIL != node_and_predicate_mode)
                                     && (NIL == found_use_for_unifyP))) {
                                  {
                                    SubLObject node_var_38 = node_and_predicate_mode.first();
                                    SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                    SubLObject pred = node_var_38;
                                    {
                                      SubLObject _prev_bind_0_39 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                      try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        {
                                          SubLObject inverse_modeP = predicate_mode;
                                          if ((NIL == found_use_for_unifyP)) {
                                            {
                                              SubLObject csome_list_var = tva_utilities.get_tva_predicates();
                                              SubLObject tva_pred = NIL;
                                              for (tva_pred = csome_list_var.first(); (!(((NIL != found_use_for_unifyP)
                                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), tva_pred = csome_list_var.first()) {
                                                if ((NIL == found_use_for_unifyP)) {
                                                  {
                                                    SubLObject csome_list_var_40 = tva_term_argnums;
                                                    SubLObject argnum = NIL;
                                                    for (argnum = csome_list_var_40.first(); (!(((NIL != found_use_for_unifyP)
                                                          || (NIL == csome_list_var_40)))); csome_list_var_40 = csome_list_var_40.rest(), argnum = csome_list_var_40.first()) {
                                                      {
                                                        SubLObject trans_preds = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, pred, argnum, inverse_modeP);
                                                        if ((NIL == found_use_for_unifyP)) {
                                                          {
                                                            SubLObject csome_list_var_41 = trans_preds;
                                                            SubLObject trans_pred = NIL;
                                                            for (trans_pred = csome_list_var_41.first(); (!(((NIL != found_use_for_unifyP)
                                                                  || (NIL == csome_list_var_41)))); csome_list_var_41 = csome_list_var_41.rest(), trans_pred = csome_list_var_41.first()) {
                                                              {
                                                                SubLObject _prev_bind_0_42 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
                                                                try {
                                                                  gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
                                                                  {
                                                                    SubLObject arg = cycl_utilities.atomic_sentence_arg(asent, argnum, UNPROVIDED);
                                                                    SubLObject pcase_var = tva_pred;
                                                                    if ((pcase_var.eql($const48$transitiveViaArg)
                                                                        || pcase_var.eql($const49$conservativeViaArg))) {
                                                                      if (ZERO_INTEGER.numL(ghl_search_utilities.ghl_inverse_cardinality(trans_pred, arg))) {
                                                                        found_use_for_unifyP = T;
                                                                      }
                                                                    } else if ((pcase_var.eql($const50$transitiveViaArgInverse)
                                                                        || pcase_var.eql($const51$conservativeViaArgInverse))) {
                                                                      if (ZERO_INTEGER.numL(ghl_search_utilities.ghl_predicate_cardinality(trans_pred, arg))) {
                                                                        found_use_for_unifyP = T;
                                                                      }
                                                                    }
                                                                  }
                                                                } finally {
                                                                  gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0_42, thread);
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
                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($const47$genlPreds));
                                            SubLObject rest = NIL;
                                            for (rest = accessible_modules; (!(((NIL != found_use_for_unifyP)
                                                  || (NIL == rest)))); rest = rest.rest()) {
                                              {
                                                SubLObject module_var = rest.first();
                                                {
                                                  SubLObject _prev_bind_0_43 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                  SubLObject _prev_bind_1_44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                  try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    {
                                                      SubLObject node = function_terms.naut_to_nart(node_var_38);
                                                      if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                        {
                                                          SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                          if ((NIL != d_link)) {
                                                            {
                                                              SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                              if ((NIL != mt_links)) {
                                                                {
                                                                  SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                  while ((!(((NIL != found_use_for_unifyP)
                                                                        || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                      SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                      SubLObject tv_links = thread.secondMultipleValue();
                                                                      thread.resetMultipleValues();
                                                                      if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                        {
                                                                          SubLObject _prev_bind_0_45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                          try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            {
                                                                              SubLObject iteration_state_46 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                              while ((!(((NIL != found_use_for_unifyP)
                                                                                    || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_46)))))) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                  SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_46);
                                                                                  SubLObject link_nodes = thread.secondMultipleValue();
                                                                                  thread.resetMultipleValues();
                                                                                  if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                    {
                                                                                      SubLObject _prev_bind_0_47 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                      try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        {
                                                                                          SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9303")) : link_nodes);
                                                                                          SubLObject rest_48 = NIL;
                                                                                          for (rest_48 = new_list; (!(((NIL != found_use_for_unifyP)
                                                                                                || (NIL == rest_48)))); rest_48 = rest_48.rest()) {
                                                                                            {
                                                                                              SubLObject node_vars_link_node = rest_48.first();
                                                                                              if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_47, thread);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  iteration_state_46 = dictionary_contents.do_dictionary_contents_next(iteration_state_46);
                                                                                }
                                                                              }
                                                                              dictionary_contents.do_dictionary_contents_finalize(iteration_state_46);
                                                                            }
                                                                          } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_45, thread);
                                                                          }
                                                                        }
                                                                      }
                                                                      iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                    }
                                                                  }
                                                                  dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str52$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                          }
                                                        }
                                                      } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                        {
                                                          SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9304")) : Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2621"));
                                                          SubLObject rest_49 = NIL;
                                                          for (rest_49 = new_list; (!(((NIL != found_use_for_unifyP)
                                                                || (NIL == rest_49)))); rest_49 = rest_49.rest()) {
                                                            {
                                                              SubLObject generating_fn = rest_49.first();
                                                              {
                                                                SubLObject _prev_bind_0_50 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                  sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                  {
                                                                    SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                                    SubLObject new_list_51 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9305")) : link_nodes);
                                                                    SubLObject rest_52 = NIL;
                                                                    for (rest_52 = new_list_51; (!(((NIL != found_use_for_unifyP)
                                                                          || (NIL == rest_52)))); rest_52 = rest_52.rest()) {
                                                                      {
                                                                        SubLObject node_vars_link_node = rest_52.first();
                                                                        if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                          sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                          deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                } finally {
                                                                  sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_50, thread);
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_44, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_43, thread);
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_39, thread);
                                      }
                                    }
                                  }
                                  node_and_predicate_mode = deck.deck_pop(recur_deck);
                                }
                              } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_37, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_36, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_35, thread);
                              }
                            }
                          } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str53$Node__a_does_not_pass_sbhl_type_t, tva_asent_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          }
                        } finally {
                          sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                          sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                          sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_34, thread);
                          sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_33, thread);
                        }
                      }
                    } finally {
                      sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                      sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_32, thread);
                    }
                  }
                  sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                }
              } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return found_use_for_unifyP;
      }
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 15605) 
  public static final SubLObject tva_unify_from_cache_possibleP(SubLObject asent) {
    {
      SubLObject arg0 = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject cachedP = NIL;
      SubLObject index_argnum = ZERO_INTEGER;
      SubLObject args = cycl_utilities.formula_args(asent, $kw14$IGNORE);
      SubLObject rest = NIL;
      for (rest = args; (!(((NIL != cachedP)
            || (NIL == rest)))); rest = rest.rest()) {
        {
          SubLObject index_arg = rest.first();
          index_argnum = Numbers.add(index_argnum, ONE_INTEGER);
          cachedP = makeBoolean(((NIL != variables.fully_bound_p(index_arg))
                 && (NIL != tva_cache.tva_cache_predicate_index_arg_cached_p(arg0, index_argnum))));
        }
      }
      return cachedP;
    }
  }

  /** @hack. Temporary addition to prevent TVA module from firing when it can't handle
   what it is attempting to unify. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 15944) 
  public static final SubLObject no_nested_variables_p(SubLObject asent) {
    {
      SubLObject foundP = NIL;
      if ((NIL == foundP)) {
        {
          SubLObject csome_list_var = cycl_utilities.formula_args(asent, UNPROVIDED);
          SubLObject arg = NIL;
          for (arg = csome_list_var.first(); (!(((NIL != foundP)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), arg = csome_list_var.first()) {
            if ((NIL == cycl_grammar.hl_variable_p(arg))) {
              if ((NIL != list_utilities.sublisp_boolean(list_utilities.tree_gather(arg, $sym54$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                foundP = T;
              }
            }
          }
        }
      }
      return makeBoolean((NIL == foundP));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 16333) 
  public static final SubLObject removal_tva_unify_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tva_asent_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject tva_term_argnums = tva_inference.determine_term_argnums(asent);
        {
          SubLObject cdolist_list_var = tva_term_argnums;
          SubLObject tva_term_argnum = NIL;
          for (tva_term_argnum = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tva_term_argnum = cdolist_list_var.first()) {
            if ((NIL == tva_utilities.any_tva_for_argP(tva_asent_pred, tva_term_argnum))) {
              {
                SubLObject v_term = cycl_utilities.sentence_arg(asent, tva_term_argnum, UNPROVIDED);
                SubLObject fast_total = ZERO_INTEGER;
                SubLObject node_var = tva_asent_pred;
                SubLObject deck_type = (false ? ((SubLObject) $kw37$STACK) : $kw38$QUEUE);
                SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                {
                  SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    {
                      SubLObject tv_var = NIL;
                      {
                        SubLObject _prev_bind_0_53 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                          sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym39$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                          if ((NIL != tv_var)) {
                            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                              if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                {
                                  SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                  if (pcase_var.eql($kw40$ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str41$_A_is_not_a__A, tv_var, $sym42$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                  } else if (pcase_var.eql($kw43$CERROR)) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2140");
                                  } else if (pcase_var.eql($kw45$WARN)) {
                                    Errors.warn($str41$_A_is_not_a__A, tv_var, $sym42$SBHL_TRUE_TV_P);
                                  } else {
                                    Errors.warn($str46$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($str44$continue_anyway, $str41$_A_is_not_a__A, tv_var, $sym42$SBHL_TRUE_TV_P);
                                  }
                                }
                              }
                            }
                          }
                          {
                            SubLObject _prev_bind_0_54 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            SubLObject _prev_bind_1_55 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                              sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const47$genlPreds), thread);
                              sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const47$genlPreds)), thread);
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const47$genlPreds)), thread);
                              sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                              sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const47$genlPreds), thread);
                              if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                  || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(tva_asent_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                                {
                                  SubLObject _prev_bind_0_56 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                  SubLObject _prev_bind_1_57 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                  SubLObject _prev_bind_2_58 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                  try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($const47$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    node_and_predicate_mode = list(tva_asent_pred, sbhl_search_vars.genl_inverse_mode_p());
                                    while ((NIL != node_and_predicate_mode)) {
                                      {
                                        SubLObject node_var_59 = node_and_predicate_mode.first();
                                        SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                        SubLObject pred = node_var_59;
                                        {
                                          SubLObject _prev_bind_0_60 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                          try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            {
                                              SubLObject inverse_modeP = predicate_mode;
                                              fast_total = Numbers.add(fast_total, kb_indexing.num_gaf_arg_index(v_term, tva_term_argnum, pred, UNPROVIDED));
                                              {
                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($const47$genlPreds));
                                                SubLObject cdolist_list_var_61 = accessible_modules;
                                                SubLObject module_var = NIL;
                                                for (module_var = cdolist_list_var_61.first(); (NIL != cdolist_list_var_61); cdolist_list_var_61 = cdolist_list_var_61.rest(), module_var = cdolist_list_var_61.first()) {
                                                  {
                                                    SubLObject _prev_bind_0_62 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_63 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                      sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                      sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                      {
                                                        SubLObject node = function_terms.naut_to_nart(node_var_59);
                                                        if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                          {
                                                            SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if ((NIL != d_link)) {
                                                              {
                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if ((NIL != mt_links)) {
                                                                  {
                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                    while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                                                                      thread.resetMultipleValues();
                                                                      {
                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                          {
                                                                            SubLObject _prev_bind_0_64 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                              sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                              {
                                                                                SubLObject iteration_state_65 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_65))) {
                                                                                  thread.resetMultipleValues();
                                                                                  {
                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_65);
                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                      {
                                                                                        SubLObject _prev_bind_0_66 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                          sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                          {
                                                                                            SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9306")) : link_nodes);
                                                                                            SubLObject cdolist_list_var_67 = new_list;
                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                            for (node_vars_link_node = cdolist_list_var_67.first(); (NIL != cdolist_list_var_67); cdolist_list_var_67 = cdolist_list_var_67.rest(), node_vars_link_node = cdolist_list_var_67.first()) {
                                                                                              if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        } finally {
                                                                                          sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_66, thread);
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    iteration_state_65 = dictionary_contents.do_dictionary_contents_next(iteration_state_65);
                                                                                  }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_65);
                                                                              }
                                                                            } finally {
                                                                              sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_64, thread);
                                                                            }
                                                                          }
                                                                        }
                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                      }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str52$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                          }
                                                        } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                          {
                                                            SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9307")) : Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2623"));
                                                            SubLObject cdolist_list_var_68 = new_list;
                                                            SubLObject generating_fn = NIL;
                                                            for (generating_fn = cdolist_list_var_68.first(); (NIL != cdolist_list_var_68); cdolist_list_var_68 = cdolist_list_var_68.rest(), generating_fn = cdolist_list_var_68.first()) {
                                                              {
                                                                SubLObject _prev_bind_0_69 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                  sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                  {
                                                                    SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                                    SubLObject new_list_70 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9308")) : link_nodes);
                                                                    SubLObject cdolist_list_var_71 = new_list_70;
                                                                    SubLObject node_vars_link_node = NIL;
                                                                    for (node_vars_link_node = cdolist_list_var_71.first(); (NIL != cdolist_list_var_71); cdolist_list_var_71 = cdolist_list_var_71.rest(), node_vars_link_node = cdolist_list_var_71.first()) {
                                                                      if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                      }
                                                                    }
                                                                  }
                                                                } finally {
                                                                  sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_69, thread);
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } finally {
                                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_63, thread);
                                                      sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_62, thread);
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_60, thread);
                                          }
                                        }
                                      }
                                      node_and_predicate_mode = deck.deck_pop(recur_deck);
                                    }
                                  } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_58, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_57, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_56, thread);
                                  }
                                }
                              } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str53$Node__a_does_not_pass_sbhl_type_t, tva_asent_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                              }
                            } finally {
                              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                              sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_55, thread);
                              sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_54, thread);
                            }
                          }
                        } finally {
                          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_53, thread);
                        }
                      }
                      sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    }
                  } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                  }
                }
                if (fast_total.numG(ZERO_INTEGER)) {
                  return fast_total;
                }
              }
            }
          }
        }
        {
          SubLObject total = ZERO_INTEGER;
          SubLObject cdolist_list_var = tva_term_argnums;
          SubLObject argnum = NIL;
          for (argnum = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), argnum = cdolist_list_var.first()) {
            {
              SubLObject spec_preds = NIL;
              SubLObject inverse_preds = NIL;
              SubLObject node_var = tva_asent_pred;
              SubLObject deck_type = (false ? ((SubLObject) $kw37$STACK) : $kw38$QUEUE);
              SubLObject recur_deck = deck.create_deck(deck_type);
              SubLObject node_and_predicate_mode = NIL;
              {
                SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                  sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                  {
                    SubLObject tv_var = NIL;
                    {
                      SubLObject _prev_bind_0_72 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym39$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw40$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str41$_A_is_not_a__A, tv_var, $sym42$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw43$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2141");
                                } else if (pcase_var.eql($kw45$WARN)) {
                                  Errors.warn($str41$_A_is_not_a__A, tv_var, $sym42$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str46$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str44$continue_anyway, $str41$_A_is_not_a__A, tv_var, $sym42$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_73 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                          SubLObject _prev_bind_1_74 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const47$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const47$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const47$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const47$genlPreds), thread);
                            if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(tva_asent_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                              {
                                SubLObject _prev_bind_0_75 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                SubLObject _prev_bind_1_76 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                SubLObject _prev_bind_2_77 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                  sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                  sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($const47$genlPreds)), thread);
                                  sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                  sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                  node_and_predicate_mode = list(tva_asent_pred, sbhl_search_vars.genl_inverse_mode_p());
                                  while ((NIL != node_and_predicate_mode)) {
                                    {
                                      SubLObject node_var_78 = node_and_predicate_mode.first();
                                      SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                      SubLObject pred = node_var_78;
                                      {
                                        SubLObject _prev_bind_0_79 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                          sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                          {
                                            SubLObject inverse_modeP = predicate_mode;
                                            SubLObject csome_list_var = tva_utilities.get_tva_predicates();
                                            SubLObject tva_pred = NIL;
                                            for (tva_pred = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), tva_pred = csome_list_var.first()) {
                                              {
                                                SubLObject trans_preds = tva_utilities.tva_gather_transitive_predicates_for_arg(tva_pred, pred, argnum, inverse_modeP);
                                                SubLObject cdolist_list_var_80 = trans_preds;
                                                SubLObject trans_pred = NIL;
                                                for (trans_pred = cdolist_list_var_80.first(); (NIL != cdolist_list_var_80); cdolist_list_var_80 = cdolist_list_var_80.rest(), trans_pred = cdolist_list_var_80.first()) {
                                                  if ((makeBoolean((NIL == inverse_modeP)) != makeBoolean((NIL == list_utilities.member_eqP(tva_pred, $list55))))) {
                                                    inverse_preds = cons(trans_pred, inverse_preds);
                                                  } else {
                                                    spec_preds = cons(trans_pred, spec_preds);
                                                  }
                                                }
                                              }
                                            }
                                            {
                                              SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($const47$genlPreds));
                                              SubLObject cdolist_list_var_81 = accessible_modules;
                                              SubLObject module_var = NIL;
                                              for (module_var = cdolist_list_var_81.first(); (NIL != cdolist_list_var_81); cdolist_list_var_81 = cdolist_list_var_81.rest(), module_var = cdolist_list_var_81.first()) {
                                                {
                                                  SubLObject _prev_bind_0_82 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                  SubLObject _prev_bind_1_83 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                  try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    {
                                                      SubLObject node = function_terms.naut_to_nart(node_var_78);
                                                      if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                        {
                                                          SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                          if ((NIL != d_link)) {
                                                            {
                                                              SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                              if ((NIL != mt_links)) {
                                                                {
                                                                  SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                  while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                      SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                      SubLObject tv_links = thread.secondMultipleValue();
                                                                      thread.resetMultipleValues();
                                                                      if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                        {
                                                                          SubLObject _prev_bind_0_84 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                          try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            {
                                                                              SubLObject iteration_state_85 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                              while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_85))) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                  SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_85);
                                                                                  SubLObject link_nodes = thread.secondMultipleValue();
                                                                                  thread.resetMultipleValues();
                                                                                  if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                    {
                                                                                      SubLObject _prev_bind_0_86 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                      try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        {
                                                                                          SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9309")) : link_nodes);
                                                                                          SubLObject cdolist_list_var_87 = new_list;
                                                                                          SubLObject node_vars_link_node = NIL;
                                                                                          for (node_vars_link_node = cdolist_list_var_87.first(); (NIL != cdolist_list_var_87); cdolist_list_var_87 = cdolist_list_var_87.rest(), node_vars_link_node = cdolist_list_var_87.first()) {
                                                                                            if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                              sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                              deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_86, thread);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  iteration_state_85 = dictionary_contents.do_dictionary_contents_next(iteration_state_85);
                                                                                }
                                                                              }
                                                                              dictionary_contents.do_dictionary_contents_finalize(iteration_state_85);
                                                                            }
                                                                          } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_84, thread);
                                                                          }
                                                                        }
                                                                      }
                                                                      iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                    }
                                                                  }
                                                                  dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str52$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                          }
                                                        }
                                                      } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                        {
                                                          SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9310")) : Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2625"));
                                                          SubLObject cdolist_list_var_88 = new_list;
                                                          SubLObject generating_fn = NIL;
                                                          for (generating_fn = cdolist_list_var_88.first(); (NIL != cdolist_list_var_88); cdolist_list_var_88 = cdolist_list_var_88.rest(), generating_fn = cdolist_list_var_88.first()) {
                                                            {
                                                              SubLObject _prev_bind_0_89 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                              try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                {
                                                                  SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                                  SubLObject new_list_90 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																		.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9311")) : link_nodes);
                                                                  SubLObject cdolist_list_var_91 = new_list_90;
                                                                  SubLObject node_vars_link_node = NIL;
                                                                  for (node_vars_link_node = cdolist_list_var_91.first(); (NIL != cdolist_list_var_91); cdolist_list_var_91 = cdolist_list_var_91.rest(), node_vars_link_node = cdolist_list_var_91.first()) {
                                                                    if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                      sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                      deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                    }
                                                                  }
                                                                }
                                                              } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_89, thread);
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_83, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_82, thread);
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_79, thread);
                                        }
                                      }
                                    }
                                    node_and_predicate_mode = deck.deck_pop(recur_deck);
                                  }
                                } finally {
                                  sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_77, thread);
                                  sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_76, thread);
                                  sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_75, thread);
                                }
                              }
                            } else {
                              sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str53$Node__a_does_not_pass_sbhl_type_t, tva_asent_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                          } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_74, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_73, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_72, thread);
                      }
                    }
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                  }
                } finally {
                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
              }
              {
                SubLObject _prev_bind_0 = gt_vars.$gt_handle_non_transitive_predicateP$.currentBinding(thread);
                try {
                  gt_vars.$gt_handle_non_transitive_predicateP$.bind(T, thread);
                  {
                    SubLObject arg = cycl_utilities.atomic_sentence_arg(asent, argnum, UNPROVIDED);
                    {
                      SubLObject cdolist_list_var_92 = genl_predicates.min_predicates(spec_preds, UNPROVIDED, UNPROVIDED);
                      SubLObject trans_pred = NIL;
                      for (trans_pred = cdolist_list_var_92.first(); (NIL != cdolist_list_var_92); cdolist_list_var_92 = cdolist_list_var_92.rest(), trans_pred = cdolist_list_var_92.first()) {
                        total = Numbers.add(total, ghl_search_utilities.ghl_inverse_cardinality(trans_pred, arg));
                      }
                    }
                    {
                      SubLObject cdolist_list_var_93 = genl_predicates.max_predicates(inverse_preds, UNPROVIDED, UNPROVIDED);
                      SubLObject trans_pred = NIL;
                      for (trans_pred = cdolist_list_var_93.first(); (NIL != cdolist_list_var_93); cdolist_list_var_93 = cdolist_list_var_93.rest(), trans_pred = cdolist_list_var_93.first()) {
                        total = Numbers.add(total, ghl_search_utilities.ghl_predicate_cardinality(trans_pred, arg));
                      }
                    }
                  }
                } finally {
                  gt_vars.$gt_handle_non_transitive_predicateP$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
          return total;
        }
      }
    }
  }

  public static final class $removal_tva_unify_cost$UnaryFunction extends UnaryFunction {
    public $removal_tva_unify_cost$UnaryFunction() { super(extractFunctionNamed("REMOVAL-TVA-UNIFY-COST")); }
    public SubLObject processItem(SubLObject arg1) { return removal_tva_unify_cost(arg1, UNPROVIDED); }
  }

  public static final class $removal_tva_unify_cost$BinaryFunction extends BinaryFunction {
    public $removal_tva_unify_cost$BinaryFunction() { super(extractFunctionNamed("REMOVAL-TVA-UNIFY-COST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_tva_unify_cost(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 19426) 
  public static final SubLObject removal_tva_unify_closure_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      SubLObject inference = inference_macros.current_controlling_inference();
      return makeBoolean(((NIL != inference_datastructures_inference.inference_p(inference))
             && ($kw5$NONE != inference_datastructures_inference.inference_transitive_closure_mode(inference))
             && (NIL != removal_tva_unify_required_int(asent, UNPROVIDED))));
    }
  }

  public static final class $removal_tva_unify_closure_required$UnaryFunction extends UnaryFunction {
    public $removal_tva_unify_closure_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_tva_unify_closure_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_tva_unify_closure_required$BinaryFunction extends BinaryFunction {
    public $removal_tva_unify_closure_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_tva_unify_closure_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 24557) 
  public static final SubLObject removal_tva_unify_closure_conjunction_applicability(SubLObject contextualized_dnf_clause) {
    {
      SubLObject subclause_specs = NIL;
      SubLObject pos_index = ZERO_INTEGER;
      SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
      SubLObject pos_lit = NIL;
      for (pos_lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pos_lit = cdolist_list_var.first()) {
        {
          SubLObject datum = pos_lit;
          SubLObject current = datum;
          SubLObject pos_mt = NIL;
          SubLObject pos_asent = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list60);
          pos_mt = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list60);
          pos_asent = current.first();
          current = current.rest();
          if ((NIL == current)) {
            if ((NIL != removal_tva_unify_closure_conjunction_appropriate_asentP(pos_asent, pos_mt))) {
              {
                SubLObject vars = el_utilities.literal_free_variables(pos_asent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject pos_indices = list(pos_index);
                SubLObject index = ZERO_INTEGER;
                SubLObject cdolist_list_var_99 = clauses.pos_lits(contextualized_dnf_clause);
                SubLObject lit = NIL;
                for (lit = cdolist_list_var_99.first(); (NIL != cdolist_list_var_99); cdolist_list_var_99 = cdolist_list_var_99.rest(), lit = cdolist_list_var_99.first()) {
                  if ((!(index.eql(pos_index)))) {
                    {
                      SubLObject datum_100 = lit;
                      SubLObject current_101 = datum_100;
                      SubLObject mt = NIL;
                      SubLObject asent = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp(current_101, datum_100, $list61);
                      mt = current_101.first();
                      current_101 = current_101.rest();
                      cdestructuring_bind.destructuring_bind_must_consp(current_101, datum_100, $list61);
                      asent = current_101.first();
                      current_101 = current_101.rest();
                      if ((NIL == current_101)) {
                        if (((NIL != removal_tva_unify_closure_conjunction_appropriate_asentP(asent, mt))
                             && (NIL != list_utilities.sets_equalP(vars, el_utilities.literal_free_variables(asent, UNPROVIDED, UNPROVIDED, UNPROVIDED), Symbols.symbol_function(EQ))))) {
                          pos_indices = cons(index, pos_indices);
                        }
                      } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_100, $list61);
                      }
                    }
                  }
                  index = Numbers.add(index, ONE_INTEGER);
                }
                if ((NIL != list_utilities.lengthG(pos_indices, ONE_INTEGER, UNPROVIDED))) {
                  subclause_specs = cons(clause_utilities.new_subclause_spec(NIL, Sort.sort(pos_indices, Symbols.symbol_function($sym62$_), UNPROVIDED)), subclause_specs);
                }
              }
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list60);
          }
        }
        pos_index = Numbers.add(pos_index, ONE_INTEGER);
      }
      return list_utilities.fast_delete_duplicates(subclause_specs, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
  }

  public static final class $removal_tva_unify_closure_conjunction_applicability$UnaryFunction extends UnaryFunction {
    public $removal_tva_unify_closure_conjunction_applicability$UnaryFunction() { super(extractFunctionNamed("REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPLICABILITY")); }
    public SubLObject processItem(SubLObject arg1) { return removal_tva_unify_closure_conjunction_applicability(arg1); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 25518) 
  public static final SubLObject removal_tva_unify_closure_conjunction_appropriate_asentP(SubLObject asent, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject result = NIL;
        if (((NIL != forts.fort_p(pred))
             && (NIL != removal_tva_unify_closure_conjunction_appropriate_predicateP(pred)))) {
          {
            SubLObject mt_var = mt;
            {
              SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
              SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
              try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                result = removal_tva_unify_required_int(asent, UNPROVIDED);
              } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-tva-lookup.lisp", position = 25889) 
  public static final SubLObject removal_tva_unify_closure_conjunction_appropriate_predicateP(SubLObject predicate) {
    return makeBoolean((!(((NIL != hl_supports.hl_predicate_p(predicate))
            || (NIL != sbhl_module_utilities.sbhl_predicate_p(predicate))
            || (NIL != inference_modules.solely_specific_removal_module_predicateP(predicate))))));
  }

  public static final SubLObject declare_removal_modules_tva_lookup_file() {
    declareFunction(myName, "tva_pos_preference", "TVA-POS-PREFERENCE", 3, 0, false);
    declareFunction(myName, "tva_asent_has_fully_bound_argP", "TVA-ASENT-HAS-FULLY-BOUND-ARG?", 1, 0, false);
    declareFunction(myName, "tva_applicable_to_some_bindable_argP", "TVA-APPLICABLE-TO-SOME-BINDABLE-ARG?", 2, 0, false);
    declareFunction(myName, "possible_tva_check_solved_by_other_hl_module", "POSSIBLE-TVA-CHECK-SOLVED-BY-OTHER-HL-MODULE", 1, 1, false);
    declareFunction(myName, "tva_determine_lookup_success", "TVA-DETERMINE-LOOKUP-SUCCESS", 1, 0, false);
    declareFunction(myName, "tva_determine_genl_preds_success", "TVA-DETERMINE-GENL-PREDS-SUCCESS", 1, 0, false);
    declareFunction(myName, "tva_determine_genl_preds_lookup_int", "TVA-DETERMINE-GENL-PREDS-LOOKUP-INT", 1, 0, false);
    declareFunction(myName, "tva_determine_genl_inverse_success", "TVA-DETERMINE-GENL-INVERSE-SUCCESS", 1, 0, false);
    declareFunction(myName, "tva_determine_genl_inverse_lookup_int", "TVA-DETERMINE-GENL-INVERSE-LOOKUP-INT", 1, 0, false);
    declareFunction(myName, "tva_check", "TVA-CHECK", 1, 1, false);
    declareFunction(myName, "tva_justify", "TVA-JUSTIFY", 1, 1, false);
    declareFunction(myName, "tva_max_floor_mts_of_just", "TVA-MAX-FLOOR-MTS-OF-JUST", 1, 0, false);
    declareFunction(myName, "inference_tva_check", "INFERENCE-TVA-CHECK", 1, 1, false);
    declareFunction(myName, "inference_tva_unify", "INFERENCE-TVA-UNIFY", 1, 1, false);
    declareFunction(myName, "inference_tva_justify", "INFERENCE-TVA-JUSTIFY", 1, 1, false);
    declareFunction(myName, "inference_tva_max_floor_mts", "INFERENCE-TVA-MAX-FLOOR-MTS", 1, 0, false);
    declareFunction(myName, "make_tva_support", "MAKE-TVA-SUPPORT", 1, 0, false);
    declareFunction(myName, "removal_tva_required", "REMOVAL-TVA-REQUIRED", 1, 0, false);
    declareFunction(myName, "removal_tva_check_required", "REMOVAL-TVA-CHECK-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_tva_check_expand", "REMOVAL-TVA-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_tva_unify_required", "REMOVAL-TVA-UNIFY-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_tva_unify_required_int_internal", "REMOVAL-TVA-UNIFY-REQUIRED-INT-INTERNAL", 1, 1, false);
    declareFunction(myName, "removal_tva_unify_required_int", "REMOVAL-TVA-UNIFY-REQUIRED-INT", 1, 1, false);
    declareFunction(myName, "tva_unify_usefulP", "TVA-UNIFY-USEFUL?", 1, 0, false);
    declareFunction(myName, "tva_unify_from_cache_possibleP", "TVA-UNIFY-FROM-CACHE-POSSIBLE?", 1, 0, false);
    declareFunction(myName, "no_nested_variables_p", "NO-NESTED-VARIABLES-P", 1, 0, false);
    declareFunction(myName, "removal_tva_unify_cost", "REMOVAL-TVA-UNIFY-COST", 1, 1, false); new $removal_tva_unify_cost$UnaryFunction(); new $removal_tva_unify_cost$BinaryFunction();
    declareFunction(myName, "removal_tva_unify_iterator", "REMOVAL-TVA-UNIFY-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_tva_unify_closure_required", "REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED", 1, 1, false); new $removal_tva_unify_closure_required$UnaryFunction(); new $removal_tva_unify_closure_required$BinaryFunction();
    declareFunction(myName, "removal_tva_unify_closure_cost", "REMOVAL-TVA-UNIFY-CLOSURE-COST", 1, 1, false);
    declareFunction(myName, "removal_tva_unify_closure_iterator", "REMOVAL-TVA-UNIFY-CLOSURE-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_tva_unify_closure_conjunction_applicability", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPLICABILITY", 1, 0, false); new $removal_tva_unify_closure_conjunction_applicability$UnaryFunction();
    declareFunction(myName, "removal_tva_unify_closure_conjunction_appropriate_asentP", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPROPRIATE-ASENT?", 2, 0, false);
    declareFunction(myName, "removal_tva_unify_closure_conjunction_appropriate_predicateP", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPROPRIATE-PREDICATE?", 1, 0, false);
    declareFunction(myName, "removal_tva_unify_closure_conjunction_cost", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-COST", 1, 0, false);
    declareFunction(myName, "removal_tva_unify_closure_conjunction_output_generate", "REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-OUTPUT-GENERATE", 1, 0, false);
    declareFunction(myName, "new_tva_closure_crm_iterator", "NEW-TVA-CLOSURE-CRM-ITERATOR", 2, 0, false);
    declareFunction(myName, "tva_closure_crm_iterator_state", "TVA-CLOSURE-CRM-ITERATOR-STATE", 2, 0, false);
    declareFunction(myName, "tva_closure_crm_iterator_done", "TVA-CLOSURE-CRM-ITERATOR-DONE", 1, 0, false);
    declareFunction(myName, "tva_closure_crm_iterator_next", "TVA-CLOSURE-CRM-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "tva_closure_crm_iterator_finalize", "TVA-CLOSURE-CRM-ITERATOR-FINALIZE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_tva_lookup_file() {
    $default_tva_check_cost$ = deflexical("*DEFAULT-TVA-CHECK-COST*", TWO_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_tva_lookup_file() {
    // CVS_ID("Id: removal-modules-tva-lookup.lisp 128723 2009-09-08 22:43:51Z goolsbey ");
    preference_modules.inference_preference_module($kw0$TVA_POS, $list1);
    inference_modules.inference_removal_module($kw2$REMOVAL_TVA_CHECK, $list33);
    memoization_state.note_memoized_function($sym34$REMOVAL_TVA_UNIFY_REQUIRED_INT);
    inference_modules.inference_removal_module($kw3$REMOVAL_TVA_UNIFY, $list56);
    inference_modules.inference_removal_module($kw4$REMOVAL_TVA_UNIFY_CLOSURE, $list57);
    inference_modules.inference_conjunctive_removal_module($kw58$REMOVAL_TVA_UNIFY_CLOSURE_CONJUNCTION, $list59);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$TVA_POS = makeKeyword("TVA-POS");
  public static final SubLList $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("TVA-POS-PREFERENCE"));
  public static final SubLSymbol $kw2$REMOVAL_TVA_CHECK = makeKeyword("REMOVAL-TVA-CHECK");
  public static final SubLSymbol $kw3$REMOVAL_TVA_UNIFY = makeKeyword("REMOVAL-TVA-UNIFY");
  public static final SubLSymbol $kw4$REMOVAL_TVA_UNIFY_CLOSURE = makeKeyword("REMOVAL-TVA-UNIFY-CLOSURE");
  public static final SubLSymbol $kw5$NONE = makeKeyword("NONE");
  public static final SubLSymbol $kw6$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLList $list7 = list(makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"));
  public static final SubLList $list8 = list(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"));
  public static final SubLSymbol $kw9$DISALLOWED = makeKeyword("DISALLOWED");
  public static final SubLSymbol $kw10$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $kw11$DISPREFERRED = makeKeyword("DISPREFERRED");
  public static final SubLSymbol $kw12$ALL = makeKeyword("ALL");
  public static final SubLSymbol $kw13$GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
  public static final SubLSymbol $kw14$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $kw15$POS = makeKeyword("POS");
  public static final SubLSymbol $kw16$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $kw17$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw18$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $kw19$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $sym20$FULLY_BOUND_P = makeSymbol("FULLY-BOUND-P");
  public static final SubLList $list21 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));
  public static final SubLList $list22 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLSymbol $sym23$INFERENCE_MAX_FLOOR_MTS_WITH_CYCLES_PRUNED = makeSymbol("INFERENCE-MAX-FLOOR-MTS-WITH-CYCLES-PRUNED");
  public static final SubLSymbol $sym24$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
  public static final SubLSymbol $sym25$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym26$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
  public static final SubLObject $const27$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $sym28$SECOND = makeSymbol("SECOND");
  public static final SubLSymbol $sym29$TVA_MAX_FLOOR_MTS_OF_JUST = makeSymbol("TVA-MAX-FLOOR-MTS-OF-JUST");
  public static final SubLSymbol $kw30$TVA = makeKeyword("TVA");
  public static final SubLSymbol $sym31$FAST_NON_SKOLEM_INDETERMINATE_TERM_ = makeSymbol("FAST-NON-SKOLEM-INDETERMINATE-TERM?");
  public static final SubLSymbol $sym32$NON_SKOLEM_INDETERMINATE_TERM_ = makeSymbol("NON-SKOLEM-INDETERMINATE-TERM?");
  public static final SubLList $list33 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TVA-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TVA-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TVA-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$physicalParts #$Dog #$Head)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$transitiveViaArg #$relationAllExists #$genls 3)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n (#$genls #$Head-Vertebrate #$Head)\n")});
  public static final SubLSymbol $sym34$REMOVAL_TVA_UNIFY_REQUIRED_INT = makeSymbol("REMOVAL-TVA-UNIFY-REQUIRED-INT");
  public static final SubLSymbol $kw35$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $kw36$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw37$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw38$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym39$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw40$ERROR = makeKeyword("ERROR");
  public static final SubLString $str41$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym42$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw43$CERROR = makeKeyword("CERROR");
  public static final SubLString $str44$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw45$WARN = makeKeyword("WARN");
  public static final SubLString $str46$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const47$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLObject $const48$transitiveViaArg = constant_handles.reader_make_constant_shell(makeString("transitiveViaArg"));
  public static final SubLObject $const49$conservativeViaArg = constant_handles.reader_make_constant_shell(makeString("conservativeViaArg"));
  public static final SubLObject $const50$transitiveViaArgInverse = constant_handles.reader_make_constant_shell(makeString("transitiveViaArgInverse"));
  public static final SubLObject $const51$conservativeViaArgInverse = constant_handles.reader_make_constant_shell(makeString("conservativeViaArgInverse"));
  public static final SubLString $str52$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str53$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym54$HL_VARIABLE_P = makeSymbol("HL-VARIABLE-P");
  public static final SubLList $list55 = list(constant_handles.reader_make_constant_shell(makeString("transitiveViaArgInverse")), constant_handles.reader_make_constant_shell(makeString("conservativeViaArgInverse")));
  public static final SubLList $list56 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TVA-UNIFY-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-TVA-UNIFY-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TVA-UNIFY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-VERIFY-PATTERN"), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("POSSIBLE-TVA-CHECK-SOLVED-BY-OTHER-HL-MODULE"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TVA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <not-fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$physicalParts #$Dog ?COL)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n")});
  public static final SubLList $list57 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), cons(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TVA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(<fort> . <not-fully-bound>)\nusing true assertions and GAF indexing in the KB\nvia #$transitiveViaArg or #$transitiveViaArgInverse\nand transitivity reasoning"), makeKeyword("EXAMPLE"), makeString("(#$relationAllExists #$physicalParts #$Dog ?COL)\nvia \n (#$relationAllExists #$anatomicalParts #$Vertebrate #$Head-Vertebrate)\nand\n (#$transitiveViaArg #$relationAllExists #$genlPreds 1)\n (#$transitiveViaArgInverse #$relationAllExists #$genls 2)\n (#$genlPreds #$anatomicalParts #$physicalParts)\n (#$genls #$Dog #$Vertebrate)\n")});
  public static final SubLSymbol $kw58$REMOVAL_TVA_UNIFY_CLOSURE_CONJUNCTION = makeKeyword("REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION");
  public static final SubLList $list59 = list(new SubLObject[] {makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-APPLICABILITY"), makeKeyword("COST"), makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND-ITERATIVE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TVA-UNIFY-CLOSURE-CONJUNCTION-OUTPUT-GENERATE"), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("Solves a conjunction of positive literals each of which can be solved with TVA."), makeKeyword("EXAMPLE"), makeString("(#$and\n      (#$eventOccursAt #$TerroristAttack-11-mar-2004-Madrid-Spain ?REGION)\n      (#$operatesInRegion #$AlQaida ?REGION)")});
  public static final SubLList $list60 = list(makeSymbol("POS-MT"), makeSymbol("POS-ASENT"));
  public static final SubLList $list61 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $sym62$_ = makeSymbol("<");
  public static final SubLSymbol $sym63$TVA_CLOSURE_CRM_ITERATOR_DONE = makeSymbol("TVA-CLOSURE-CRM-ITERATOR-DONE");
  public static final SubLSymbol $sym64$TVA_CLOSURE_CRM_ITERATOR_NEXT = makeSymbol("TVA-CLOSURE-CRM-ITERATOR-NEXT");
  public static final SubLSymbol $sym65$TVA_CLOSURE_CRM_ITERATOR_FINALIZE = makeSymbol("TVA-CLOSURE-CRM-ITERATOR-FINALIZE");
  public static final SubLList $list66 = list(makeSymbol("CLOSURE-ITERATOR"), makeSymbol("SUPPORT-TEMPLATES"));

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_tva_lookup_file();
  }

  public void initializeVariables() {
    init_removal_modules_tva_lookup_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_tva_lookup_file();
  }

}
