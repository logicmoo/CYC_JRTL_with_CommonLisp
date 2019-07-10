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

package com.cyc.cycjava_1.cycl.inference.modules.removal;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.backward_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.pred_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_symmetry;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.tva_inference;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.virtual_indexing;

public  final class removal_modules_genlpreds_lookup extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_genlpreds_lookup() {}
  public static final SubLFile me = new removal_modules_genlpreds_lookup();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_genlpreds_lookup";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 876) 
  public static final SubLObject removal_genlpreds_lookup_pos_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != variables.fully_bound_p(asent))) {
      return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
    } else {
      return num_best_genlpreds_gaf_lookup_index(asent, $kw0$POS);
    }
  }

  public static final class $removal_genlpreds_lookup_pos_cost$UnaryFunction extends UnaryFunction {
    public $removal_genlpreds_lookup_pos_cost$UnaryFunction() { super(extractFunctionNamed("REMOVAL-GENLPREDS-LOOKUP-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return removal_genlpreds_lookup_pos_cost(arg1, UNPROVIDED); }
  }

  public static final class $removal_genlpreds_lookup_pos_cost$BinaryFunction extends BinaryFunction {
    public $removal_genlpreds_lookup_pos_cost$BinaryFunction() { super(extractFunctionNamed("REMOVAL-GENLPREDS-LOOKUP-POS-COST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_genlpreds_lookup_pos_cost(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 1652) 
  public static final SubLObject removal_genlpreds_lookup_pos_iterator(SubLObject asent) {
    return removal_genlpreds_lookup_iterator(asent, $kw0$POS);
  }

  public static final class $removal_genlpreds_lookup_pos_iterator$UnaryFunction extends UnaryFunction {
    public $removal_genlpreds_lookup_pos_iterator$UnaryFunction() { super(extractFunctionNamed("REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR")); }
    public SubLObject processItem(SubLObject arg1) { return removal_genlpreds_lookup_pos_iterator(arg1); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 4276) 
  public static final SubLObject removal_genlpreds_lookup_iterator(SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject lookup_index = best_genlpreds_gaf_lookup_index(asent, sense);
        SubLObject index_type = kb_indexing.lookup_index_get_type(lookup_index);
        {
          SubLObject _prev_bind_0 = control_vars.$inference_literal$.currentBinding(thread);
          SubLObject _prev_bind_1 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = control_vars.$inference_literal$.currentBinding(thread);
          SubLObject _prev_bind_3 = control_vars.$inference_sense$.currentBinding(thread);
          try {
            control_vars.$inference_literal$.bind(asent, thread);
            pred_relevance_macros.$relevant_pred_function$.bind(pred_relevance_macros.determine_inference_genl_or_spec_pred_relevance(sense), thread);
            control_vars.$inference_literal$.bind(asent, thread);
            control_vars.$inference_sense$.bind(sense, thread);
            {
              SubLObject pcase_var = index_type;
              if (pcase_var.eql($kw8$PREDICATE_EXTENT)) {
                {
                  SubLObject predicate = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12760");
                  SubLObject pred_var = NIL;
                  if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ZERO_INTEGER, pred_var))) {
                    {
                      SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ZERO_INTEGER, pred_var);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw9$GAF, enumeration_types.sense_truth(sense), NIL);
                                {
                                  SubLObject done_var_1 = NIL;
                                  SubLObject token_var_2 = NIL;
                                  while ((NIL == done_var_1)) {
                                    {
                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                      SubLObject valid_3 = makeBoolean((token_var_2 != assertion));
                                      if ((NIL != valid_3)) {
                                        {
                                          SubLObject bindings_assertion = removal_genlpreds_gaf_iterator_internal(assertion);
                                          if ((NIL != bindings_assertion)) {
                                            result = cons(bindings_assertion, result);
                                          }
                                        }
                                      }
                                      done_var_1 = makeBoolean((NIL == valid_3));
                                    }
                                  }
                                }
                              } finally {
                                {
                                  SubLObject _prev_bind_0_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                  try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    if ((NIL != final_index_iterator)) {
                                      kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                  } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
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
              } else if (pcase_var.eql($kw10$GAF_ARG)) {
                thread.resetMultipleValues();
                {
                  SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values(lookup_index);
                  SubLObject argnum = thread.secondMultipleValue();
                  SubLObject predicate = thread.thirdMultipleValue();
                  thread.resetMultipleValues();
                  {
                    SubLObject pred_var = NIL;
                    if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var))) {
                      {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                  final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw9$GAF, enumeration_types.sense_truth(sense), NIL);
                                  {
                                    SubLObject done_var_5 = NIL;
                                    SubLObject token_var_6 = NIL;
                                    while ((NIL == done_var_5)) {
                                      {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_6);
                                        SubLObject valid_7 = makeBoolean((token_var_6 != assertion));
                                        if ((NIL != valid_7)) {
                                          {
                                            SubLObject bindings_assertion = removal_genlpreds_gaf_iterator_internal(assertion);
                                            if ((NIL != bindings_assertion)) {
                                              result = cons(bindings_assertion, result);
                                            }
                                          }
                                        }
                                        done_var_5 = makeBoolean((NIL == valid_7));
                                      }
                                    }
                                  }
                                } finally {
                                  {
                                    SubLObject _prev_bind_0_8 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                      if ((NIL != final_index_iterator)) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                      }
                                    } finally {
                                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_8, thread);
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
            }
          } finally {
            control_vars.$inference_sense$.rebind(_prev_bind_3, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_2, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL != result)) {
          return iteration.new_list_iterator(result);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5481) 
  private static SubLSymbol $unknown_el_variable$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5581) 
  public static final SubLObject obfuscate_predicate(SubLObject asent) {
    return el_utilities.replace_formula_arg(ZERO_INTEGER, $unknown_el_variable$.getGlobalValue(), asent);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5687) 
  public static final SubLObject best_genlpreds_gaf_lookup_index(SubLObject asent, SubLObject sense) {
    return kb_indexing.best_gaf_lookup_index(obfuscate_predicate(asent), enumeration_types.sense_truth(sense), $list13);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 5918) 
  public static final SubLObject num_best_genlpreds_gaf_lookup_index(SubLObject asent, SubLObject sense) {
    return num_best_genlpreds_or_inverse_gaf_lookup_index(asent, sense, NIL);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 6059) 
  public static final SubLObject num_best_genlpreds_or_inverse_gaf_lookup_index(SubLObject asent, SubLObject sense, SubLObject inverse_modeP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject direction = ((sense == $kw0$POS) ? ((SubLObject) sbhl_search_vars.get_sbhl_backward_search_direction()) : sbhl_search_vars.get_sbhl_forward_search_direction());
        SubLObject pred = cycl_utilities.sentence_arg0(asent);
        SubLObject binary_predicate_modeP = kb_accessors.binary_predicateP(cycl_utilities.sentence_arg0(asent));
        SubLObject gaf_argnum = tva_inference.determine_term_argnums(asent).first();
        SubLObject v_term = cycl_utilities.sentence_arg(asent, gaf_argnum, UNPROVIDED);
        SubLObject num = ZERO_INTEGER;
        SubLObject module = sbhl_module_vars.get_sbhl_module($const14$genlPreds);
        SubLObject node_var = pred;
        SubLObject deck_type = (false ? ((SubLObject) $kw16$STACK) : $kw17$QUEUE);
        SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
          try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            {
              SubLObject tv_var = NIL;
              {
                SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                  if ((NIL != tv_var)) {
                    if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                      if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        {
                          SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                          if (pcase_var.eql($kw19$ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          } else if (pcase_var.eql($kw22$CERROR)) {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2133");
                          } else if (pcase_var.eql($kw24$WARN)) {
                            Errors.warn($str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P);
                          } else {
                            Errors.warn($str25$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str23$continue_anyway, $str20$_A_is_not_a__A, tv_var, $sym21$SBHL_TRUE_TV_P);
                          }
                        }
                      }
                    }
                  }
                  {
                    SubLObject _prev_bind_0_10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1_11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                      sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                      sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                      sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                      sbhl_module_vars.$sbhl_module$.bind(module, thread);
                      if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                          || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                        {
                          SubLObject _prev_bind_0_12 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_1_13 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_direction$.bind(direction, thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(direction, module), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                            node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                            while ((NIL != node_and_predicate_mode)) {
                              {
                                SubLObject node_var_15 = node_and_predicate_mode.first();
                                SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                SubLObject spec_pred = node_var_15;
                                {
                                  SubLObject _prev_bind_0_16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                  try {
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                    {
                                      SubLObject inverseP = predicate_mode;
                                      if ((!(((pred == spec_pred)
                                            || (inverse_modeP != inverseP))))) {
                                        if ((NIL != binary_predicate_modeP)) {
                                          num = Numbers.add(num, kb_indexing.num_gaf_arg_index(v_term, gaf_argnum, spec_pred, UNPROVIDED));
                                        } else {
                                          num = Numbers.add(num, kb_indexing.num_best_gaf_lookup_index(el_utilities.replace_formula_arg(ZERO_INTEGER, spec_pred, asent), enumeration_types.sense_truth(sense), $list13));
                                        }
                                      }
                                      {
                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                        SubLObject cdolist_list_var = accessible_modules;
                                        SubLObject module_var = NIL;
                                        for (module_var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), module_var = cdolist_list_var.first()) {
                                          {
                                            SubLObject _prev_bind_0_17 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                              sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                              sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                              {
                                                SubLObject node = function_terms.naut_to_nart(node_var_15);
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
                                                                    SubLObject _prev_bind_0_19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                      sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                      {
                                                                        SubLObject iteration_state_20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_20))) {
                                                                          thread.resetMultipleValues();
                                                                          {
                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_20);
                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                              {
                                                                                SubLObject _prev_bind_0_21 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                  sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                  {
                                                                                    SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9274")) : link_nodes);
                                                                                    SubLObject cdolist_list_var_22 = new_list;
                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                    for (node_vars_link_node = cdolist_list_var_22.first(); (NIL != cdolist_list_var_22); cdolist_list_var_22 = cdolist_list_var_22.rest(), node_vars_link_node = cdolist_list_var_22.first()) {
                                                                                      if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } finally {
                                                                                  sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_21, thread);
                                                                                }
                                                                              }
                                                                            }
                                                                            iteration_state_20 = dictionary_contents.do_dictionary_contents_next(iteration_state_20);
                                                                          }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_20);
                                                                      }
                                                                    } finally {
                                                                      sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_19, thread);
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
                                                      sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str26$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                  }
                                                } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                  {
                                                    SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9275")) : Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2603"));
                                                    SubLObject cdolist_list_var_23 = new_list;
                                                    SubLObject generating_fn = NIL;
                                                    for (generating_fn = cdolist_list_var_23.first(); (NIL != cdolist_list_var_23); cdolist_list_var_23 = cdolist_list_var_23.rest(), generating_fn = cdolist_list_var_23.first()) {
                                                      {
                                                        SubLObject _prev_bind_0_24 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                          sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                          {
                                                            SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                            SubLObject new_list_25 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9276")) : link_nodes);
                                                            SubLObject cdolist_list_var_26 = new_list_25;
                                                            SubLObject node_vars_link_node = NIL;
                                                            for (node_vars_link_node = cdolist_list_var_26.first(); (NIL != cdolist_list_var_26); cdolist_list_var_26 = cdolist_list_var_26.rest(), node_vars_link_node = cdolist_list_var_26.first()) {
                                                              if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                              }
                                                            }
                                                          }
                                                        } finally {
                                                          sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_24, thread);
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } finally {
                                              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_18, thread);
                                              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_17, thread);
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_16, thread);
                                  }
                                }
                              }
                              node_and_predicate_mode = deck.deck_pop(recur_deck);
                            }
                          } finally {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_14, thread);
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_13, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_12, thread);
                          }
                        }
                      } else {
                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str27$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                      }
                    } finally {
                      sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                      sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_11, thread);
                      sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_10, thread);
                    }
                  }
                } finally {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                  sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_9, thread);
                }
              }
              sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
            }
          } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
          }
        }
        return num;
      }
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 6958) 
  public static final SubLObject removal_genlpreds_gaf_iterator_internal(SubLObject assertion) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != backward_utilities.direction_is_relevant(assertion))) {
        {
          SubLObject assertion_asent = assertions_high.gaf_formula(assertion);
          SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertion_asent);
          SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(control_vars.$inference_literal$.getDynamicValue(thread));
          if ((ass_pred != inf_pred)) {
            thread.resetMultipleValues();
            {
              SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(control_vars.$inference_literal$.getDynamicValue(thread), assertion_asent, UNPROVIDED, UNPROVIDED);
              SubLObject gaf_asent = thread.secondMultipleValue();
              SubLObject unify_justification = thread.thirdMultipleValue();
              thread.resetMultipleValues();
              if ((NIL != v_bindings)) {
                return list(v_bindings, assertion);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 7608) 
  public static final SubLObject removal_genlpreds_lookup_supports(SubLObject asent, SubLObject assertion, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ass_pred = cycl_utilities.atomic_sentence_predicate(assertions_high.gaf_formula(assertion));
        SubLObject inf_pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject spec_pred = (($kw0$POS == sense) ? ((SubLObject) ass_pred) : inf_pred);
        SubLObject genl_pred = (($kw0$POS == sense) ? ((SubLObject) inf_pred) : ass_pred);
        SubLObject hl_support = removal_module_utilities.make_genl_preds_support(spec_pred, genl_pred);
        thread.resetMultipleValues();
        {
          SubLObject v_bindings = unification_utilities.gaf_asent_args_unify(asent, assertions_high.gaf_formula(assertion), T, T);
          SubLObject gaf_asent = thread.secondMultipleValue();
          SubLObject unify_justification = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          return ConsesLow.append(list(assertion, hl_support), unify_justification);
        }
      }
    }
  }

  public static final class $removal_genlpreds_pred_index_pos_cost$UnaryFunction extends UnaryFunction {
    public $removal_genlpreds_pred_index_pos_cost$UnaryFunction() { super(extractFunctionNamed("REMOVAL-GENLPREDS-PRED-INDEX-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32791"); }
  }

  public static final class $removal_genlpreds_pred_index_pos_cost$BinaryFunction extends BinaryFunction {
    public $removal_genlpreds_pred_index_pos_cost$BinaryFunction() { super(extractFunctionNamed("REMOVAL-GENLPREDS-PRED-INDEX-POS-COST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32792"); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 12671) 
  public static final SubLObject removal_genlinverse_lookup_pos_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != variables.fully_bound_p(asent))) {
      return control_vars.$typical_hl_module_check_cost$.getGlobalValue();
    } else {
      return num_best_genlinverse_gaf_lookup_index(asent, $kw0$POS);
    }
  }

  public static final class $removal_genlinverse_lookup_pos_cost$UnaryFunction extends UnaryFunction {
    public $removal_genlinverse_lookup_pos_cost$UnaryFunction() { super(extractFunctionNamed("REMOVAL-GENLINVERSE-LOOKUP-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return removal_genlinverse_lookup_pos_cost(arg1, UNPROVIDED); }
  }

  public static final class $removal_genlinverse_lookup_pos_cost$BinaryFunction extends BinaryFunction {
    public $removal_genlinverse_lookup_pos_cost$BinaryFunction() { super(extractFunctionNamed("REMOVAL-GENLINVERSE-LOOKUP-POS-COST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_genlinverse_lookup_pos_cost(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 13445) 
  public static final SubLObject removal_genlinverse_lookup_pos_iterator(SubLObject asent) {
    return removal_genlinverse_lookup_iterator(asent, $kw0$POS);
  }

  public static final class $removal_genlinverse_lookup_pos_iterator$UnaryFunction extends UnaryFunction {
    public $removal_genlinverse_lookup_pos_iterator$UnaryFunction() { super(extractFunctionNamed("REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR")); }
    public SubLObject processItem(SubLObject arg1) { return removal_genlinverse_lookup_pos_iterator(arg1); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 16131) 
  public static final SubLObject removal_genlinverse_lookup_iterator(SubLObject asent, SubLObject sense) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject lookup_index = best_genlinverse_gaf_lookup_index(asent, sense);
        SubLObject index_type = kb_indexing.lookup_index_get_type(lookup_index);
        {
          SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = control_vars.$inference_literal$.currentBinding(thread);
          SubLObject _prev_bind_2 = control_vars.$inference_sense$.currentBinding(thread);
          try {
            pred_relevance_macros.$relevant_pred_function$.bind(pred_relevance_macros.determine_inference_genl_or_spec_inverse_relevance(sense), thread);
            control_vars.$inference_literal$.bind(asent, thread);
            control_vars.$inference_sense$.bind(sense, thread);
            {
              SubLObject pcase_var = index_type;
              if (pcase_var.eql($kw8$PREDICATE_EXTENT)) {
                {
                  SubLObject predicate = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12761");
                  SubLObject pred_var = NIL;
                  if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ZERO_INTEGER, pred_var))) {
                    {
                      SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ZERO_INTEGER, pred_var);
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
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw9$GAF, enumeration_types.sense_truth(sense), NIL);
                                {
                                  SubLObject done_var_31 = NIL;
                                  SubLObject token_var_32 = NIL;
                                  while ((NIL == done_var_31)) {
                                    {
                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_32);
                                      SubLObject valid_33 = makeBoolean((token_var_32 != assertion));
                                      if ((NIL != valid_33)) {
                                        {
                                          SubLObject bindings_assertion = Errors
												.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32783");
                                          if ((NIL != bindings_assertion)) {
                                            result = cons(bindings_assertion, result);
                                          }
                                        }
                                      }
                                      done_var_31 = makeBoolean((NIL == valid_33));
                                    }
                                  }
                                }
                              } finally {
                                {
                                  SubLObject _prev_bind_0_34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                  try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    if ((NIL != final_index_iterator)) {
                                      kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                  } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_34, thread);
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
              } else if (pcase_var.eql($kw10$GAF_ARG)) {
                thread.resetMultipleValues();
                {
                  SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values(lookup_index);
                  SubLObject argnum = thread.secondMultipleValue();
                  SubLObject predicate = thread.thirdMultipleValue();
                  thread.resetMultipleValues();
                  {
                    SubLObject pred_var = NIL;
                    if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var))) {
                      {
                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
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
                                  final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw9$GAF, enumeration_types.sense_truth(sense), NIL);
                                  {
                                    SubLObject done_var_35 = NIL;
                                    SubLObject token_var_36 = NIL;
                                    while ((NIL == done_var_35)) {
                                      {
                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_36);
                                        SubLObject valid_37 = makeBoolean((token_var_36 != assertion));
                                        if ((NIL != valid_37)) {
                                          {
                                            SubLObject bindings_assertion = Errors
													.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32784");
                                            if ((NIL != bindings_assertion)) {
                                              result = cons(bindings_assertion, result);
                                            }
                                          }
                                        }
                                        done_var_35 = makeBoolean((NIL == valid_37));
                                      }
                                    }
                                  }
                                } finally {
                                  {
                                    SubLObject _prev_bind_0_38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                      if ((NIL != final_index_iterator)) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                      }
                                    } finally {
                                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_38, thread);
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
            }
          } finally {
            control_vars.$inference_sense$.rebind(_prev_bind_2, thread);
            control_vars.$inference_literal$.rebind(_prev_bind_1, thread);
            pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL != result)) {
          return iteration.new_list_iterator(result);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 17247) 
  public static final SubLObject best_genlinverse_gaf_lookup_index(SubLObject asent, SubLObject sense) {
    return kb_indexing.best_gaf_lookup_index(obfuscate_predicate(removal_modules_symmetry.symmetric_asent(asent)), enumeration_types.sense_truth(sense), $list13);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genlpreds-lookup.lisp", position = 17488) 
  public static final SubLObject num_best_genlinverse_gaf_lookup_index(SubLObject asent, SubLObject sense) {
    return num_best_genlpreds_or_inverse_gaf_lookup_index(asent, sense, T);
  }

  public static final SubLObject declare_removal_modules_genlpreds_lookup_file() {
    declareFunction(myName, "removal_genlpreds_lookup_pos_cost", "REMOVAL-GENLPREDS-LOOKUP-POS-COST", 1, 1, false); new $removal_genlpreds_lookup_pos_cost$UnaryFunction(); new $removal_genlpreds_lookup_pos_cost$BinaryFunction();
    declareFunction(myName, "removal_genlpreds_lookup_pos_iterator", "REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR", 1, 0, false); new $removal_genlpreds_lookup_pos_iterator$UnaryFunction();
    declareFunction(myName, "removal_genlpreds_lookup_neg_completeness", "REMOVAL-GENLPREDS-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_genlpreds_lookup_neg_cost", "REMOVAL-GENLPREDS-LOOKUP-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_genlpreds_lookup_neg_iterator", "REMOVAL-GENLPREDS-LOOKUP-NEG-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_genlpreds_lookup_iterator", "REMOVAL-GENLPREDS-LOOKUP-ITERATOR", 2, 0, false);
    declareFunction(myName, "obfuscate_predicate", "OBFUSCATE-PREDICATE", 1, 0, false);
    declareFunction(myName, "best_genlpreds_gaf_lookup_index", "BEST-GENLPREDS-GAF-LOOKUP-INDEX", 2, 0, false);
    declareFunction(myName, "num_best_genlpreds_gaf_lookup_index", "NUM-BEST-GENLPREDS-GAF-LOOKUP-INDEX", 2, 0, false);
    declareFunction(myName, "num_best_genlpreds_or_inverse_gaf_lookup_index", "NUM-BEST-GENLPREDS-OR-INVERSE-GAF-LOOKUP-INDEX", 3, 0, false);
    declareFunction(myName, "removal_genlpreds_gaf_iterator_internal", "REMOVAL-GENLPREDS-GAF-ITERATOR-INTERNAL", 1, 0, false);
    declareFunction(myName, "removal_genlpreds_lookup_supports", "REMOVAL-GENLPREDS-LOOKUP-SUPPORTS", 3, 0, false);
    declareFunction(myName, "removal_genlpreds_pred_index_pos_cost", "REMOVAL-GENLPREDS-PRED-INDEX-POS-COST", 1, 1, false); new $removal_genlpreds_pred_index_pos_cost$UnaryFunction(); new $removal_genlpreds_pred_index_pos_cost$BinaryFunction();
    declareFunction(myName, "removal_genlpreds_pred_index_pos_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-POS-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_genlpreds_pred_index_neg_completeness", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_genlpreds_pred_index_neg_cost", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_genlpreds_pred_index_neg_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-NEG-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_genlpreds_pred_index_iterator", "REMOVAL-GENLPREDS-PRED-INDEX-ITERATOR", 2, 0, false);
    declareFunction(myName, "removal_genlinverse_lookup_pos_cost", "REMOVAL-GENLINVERSE-LOOKUP-POS-COST", 1, 1, false); new $removal_genlinverse_lookup_pos_cost$UnaryFunction(); new $removal_genlinverse_lookup_pos_cost$BinaryFunction();
    declareFunction(myName, "removal_genlinverse_lookup_pos_iterator", "REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR", 1, 0, false); new $removal_genlinverse_lookup_pos_iterator$UnaryFunction();
    declareFunction(myName, "removal_genlinverse_lookup_neg_completeness", "REMOVAL-GENLINVERSE-LOOKUP-NEG-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_genlinverse_lookup_neg_cost", "REMOVAL-GENLINVERSE-LOOKUP-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_genlinverse_lookup_neg_iterator", "REMOVAL-GENLINVERSE-LOOKUP-NEG-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_genlinverse_lookup_iterator", "REMOVAL-GENLINVERSE-LOOKUP-ITERATOR", 2, 0, false);
    declareFunction(myName, "best_genlinverse_gaf_lookup_index", "BEST-GENLINVERSE-GAF-LOOKUP-INDEX", 2, 0, false);
    declareFunction(myName, "num_best_genlinverse_gaf_lookup_index", "NUM-BEST-GENLINVERSE-GAF-LOOKUP-INDEX", 2, 0, false);
    declareFunction(myName, "removal_genlinverse_gaf_iterator_internal", "REMOVAL-GENLINVERSE-GAF-ITERATOR-INTERNAL", 2, 0, false);
    declareFunction(myName, "removal_genlinverse_lookup_supports", "REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS", 3, 0, false);
    declareFunction(myName, "removal_genlinverse_pred_index_pos_cost", "REMOVAL-GENLINVERSE-PRED-INDEX-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_genlinverse_pred_index_pos_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-POS-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_genlinverse_pred_index_neg_completeness", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_genlinverse_pred_index_neg_cost", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_genlinverse_pred_index_neg_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-NEG-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_genlinverse_pred_index_iterator", "REMOVAL-GENLINVERSE-PRED-INDEX-ITERATOR", 2, 0, false);
    declareFunction(myName, "removal_negationpreds_lookup_completeness", "REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_negationpreds_lookup_cost", "REMOVAL-NEGATIONPREDS-LOOKUP-COST", 1, 1, false);
    declareFunction(myName, "removal_negationpreds_lookup_iterator", "REMOVAL-NEGATIONPREDS-LOOKUP-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_negationpreds_gaf_iterator_internal", "REMOVAL-NEGATIONPREDS-GAF-ITERATOR-INTERNAL", 1, 0, false);
    declareFunction(myName, "removal_negationpreds_lookup_supports", "REMOVAL-NEGATIONPREDS-LOOKUP-SUPPORTS", 2, 0, false);
    declareFunction(myName, "removal_negationinverse_lookup_iterator", "REMOVAL-NEGATIONINVERSE-LOOKUP-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_negationinverse_gaf_iterator_internal", "REMOVAL-NEGATIONINVERSE-GAF-ITERATOR-INTERNAL", 1, 0, false);
    declareFunction(myName, "removal_negationinverse_lookup_supports", "REMOVAL-NEGATIONINVERSE-LOOKUP-SUPPORTS", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_genlpreds_lookup_file() {
    $unknown_el_variable$ = deflexical("*UNKNOWN-EL-VARIABLE*", maybeDefault( $sym11$_UNKNOWN_EL_VARIABLE_, $unknown_el_variable$, ()-> ($sym12$_UNKNOWN)));
    return NIL;
  }

  public static final SubLObject setup_removal_modules_genlpreds_lookup_file() {
    // CVS_ID("Id: removal-modules-genlpreds-lookup.lisp 126640 2008-12-04 13:39:36Z builder ");
    inference_modules.inference_removal_module($kw1$REMOVAL_GENLPREDS_LOOKUP_POS, $list2);
    inference_modules.inference_removal_module($kw6$REMOVAL_GENLPREDS_LOOKUP_NEG, $list7);
    subl_macro_promotions.declare_defglobal($sym11$_UNKNOWN_EL_VARIABLE_);
    inference_modules.inference_removal_module($kw29$REMOVAL_GENLPREDS_PRED_INDEX_POS, $list30);
    inference_modules.inference_removal_module($kw31$REMOVAL_GENLPREDS_PRED_INDEX_NEG, $list32);
    inference_modules.inference_removal_module($kw33$REMOVAL_GENLINVERSE_LOOKUP_POS, $list34);
    inference_modules.inference_removal_module($kw35$REMOVAL_GENLINVERSE_LOOKUP_NEG, $list36);
    inference_modules.inference_removal_module($kw37$REMOVAL_GENLINVERSE_PRED_INDEX_POS, $list38);
    inference_modules.inference_removal_module($kw39$REMOVAL_GENLINVERSE_PRED_INDEX_NEG, $list40);
    inference_modules.inference_removal_module($kw43$REMOVAL_NEGATIONPREDS_LOOKUP, $list44);
    inference_modules.inference_removal_module($kw48$REMOVAL_NEGATIONINVERSE_LOOKUP, $list49);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$POS = makeKeyword("POS");
  public static final SubLSymbol $kw1$REMOVAL_GENLPREDS_LOOKUP_POS = makeKeyword("REMOVAL-GENLPREDS-LOOKUP-POS");
  public static final SubLList $list2 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("POS")), makeKeyword("DOCUMENTATION"), makeString("(<predicate> ... <indexed-term> ... )\nusing true assertions using spec-preds of <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$geopoliticalSubdivision #$France #$CityOfParisFrance)")});
  public static final SubLSymbol $kw3$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw4$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLSymbol $kw5$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $kw6$REMOVAL_GENLPREDS_LOOKUP_NEG = makeKeyword("REMOVAL-GENLPREDS-LOOKUP-NEG");
  public static final SubLList $list7 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("NEG")), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> ... <indexed-term> ... ))\nusing false assertions using genl-preds of <predicate>")});
  public static final SubLSymbol $kw8$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $kw9$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw10$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $sym11$_UNKNOWN_EL_VARIABLE_ = makeSymbol("*UNKNOWN-EL-VARIABLE*");
  public static final SubLSymbol $sym12$_UNKNOWN = makeSymbol("?UNKNOWN");
  public static final SubLList $list13 = list(makeKeyword("PREDICATE-EXTENT"), makeKeyword("GAF-ARG"));
  public static final SubLObject $const14$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw15$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw16$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw17$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym18$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw19$ERROR = makeKeyword("ERROR");
  public static final SubLString $str20$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym21$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw22$CERROR = makeKeyword("CERROR");
  public static final SubLString $str23$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw24$WARN = makeKeyword("WARN");
  public static final SubLString $str25$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str26$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str27$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym28$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLSymbol $kw29$REMOVAL_GENLPREDS_PRED_INDEX_POS = makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-POS");
  public static final SubLList $list30 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("POS")), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <non-indexed-term> ... <non-indexed-term>)\nusing true assertions using spec-preds of <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$spatiallyIntersects ?WHAT ?WHAT-ELSE)")});
  public static final SubLSymbol $kw31$REMOVAL_GENLPREDS_PRED_INDEX_NEG = makeKeyword("REMOVAL-GENLPREDS-PRED-INDEX-NEG");
  public static final SubLList $list32 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-PRED-INDEX-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLPREDS-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("NEG")), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <non-indexed-term> ... <non-indexed-term> ))\nusing false assertions using genl-preds of <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$not (#$spatiallyIntersects ?WHAT ?WHAT-ELSE))")});
  public static final SubLSymbol $kw33$REMOVAL_GENLINVERSE_LOOKUP_POS = makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-POS");
  public static final SubLList $list34 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("POS")), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <indexed-term> <whatever>) and \n(<predicate> <whatever> <indexed-term>) \nusing true assertions using spec-inverses of <predicate>")});
  public static final SubLSymbol $kw35$REMOVAL_GENLINVERSE_LOOKUP_NEG = makeKeyword("REMOVAL-GENLINVERSE-LOOKUP-NEG");
  public static final SubLList $list36 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("NEG")), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <indexed-term> <whatever>)) and \n(#$not (<predicate> <whatever> <indexed-term>))\nusing false assertions using genl-inverses of <predicate>")});
  public static final SubLSymbol $kw37$REMOVAL_GENLINVERSE_PRED_INDEX_POS = makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-POS");
  public static final SubLList $list38 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-SPEC-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-POS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-POS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("POS")), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <non-indexed-term> <non-indexed-term> )\nusing true assertions using spec-inverses of <predicate>")});
  public static final SubLSymbol $kw39$REMOVAL_GENLINVERSE_PRED_INDEX_NEG = makeKeyword("REMOVAL-GENLINVERSE-PRED-INDEX-NEG");
  public static final SubLList $list40 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-GENL-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-NEG-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-PRED-INDEX-NEG-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLINVERSE-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")), makeKeyword("NEG")), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> <non-indexed-term> <non-indexed-term> ))\nusing false assertions using genl-inverses of <predicate>")});
  public static final SubLSymbol $sym41$INFERENCE_NEGATION_PREDICATE_ = makeSymbol("INFERENCE-NEGATION-PREDICATE?");
  public static final SubLSymbol $kw42$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw43$REMOVAL_NEGATIONPREDS_LOOKUP = makeKeyword("REMOVAL-NEGATIONPREDS-LOOKUP");
  public static final SubLList $list44 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> ... <indexed-term> ... ))\nusing true assertions using negation-preds of <predicate>")});
  public static final SubLObject $const45$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLSymbol $kw46$NEGATIONPREDS = makeKeyword("NEGATIONPREDS");
  public static final SubLSymbol $sym47$INFERENCE_NEGATION_INVERSE_ = makeSymbol("INFERENCE-NEGATION-INVERSE?");
  public static final SubLSymbol $kw48$REMOVAL_NEGATIONINVERSE_LOOKUP = makeKeyword("REMOVAL-NEGATIONINVERSE-LOOKUP");
  public static final SubLList $list49 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("ARITY"), NIL, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("ANYTHING")), list(makeKeyword("TEST"), makeSymbol("ASENT-HAS-INDEXED-TERM-ARG-P")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-SOME-NEGATION-PRED-OR-INVERSE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONPREDS-LOOKUP-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONINVERSE-LOOKUP-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("BINDINGS")), list(makeKeyword("BIND"), makeSymbol("ASSERTION"))), list(list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("SUBST-BINDINGS"), list(makeKeyword("VALUE"), makeSymbol("BINDINGS")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("SUPPORT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NEGATIONINVERSE-LOOKUP-SUPPORTS"), list(makeKeyword("VALUE"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (<predicate> ... <indexed-term> ... ))\n    using true assertions using negation-inverses of <predicate>")});
  public static final SubLObject $const50$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_genlpreds_lookup_file();
  }

  public void initializeVariables() {
    init_removal_modules_genlpreds_lookup_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_genlpreds_lookup_file();
  }

}
