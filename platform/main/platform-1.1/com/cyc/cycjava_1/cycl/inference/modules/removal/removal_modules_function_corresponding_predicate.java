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
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.arity;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.backward;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.czer_main;
import com.cyc.cycjava_1.cycl.deck;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_gp_mapping;
import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.nart_handles;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.obsolete;
import com.cyc.cycjava_1.cycl.pred_relevance_macros;
import com.cyc.cycjava_1.cycl.relation_evaluation;
import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_evaluation;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.term;
import com.cyc.cycjava_1.cycl.unification_utilities;
import com.cyc.cycjava_1.cycl.variables;
import com.cyc.cycjava_1.cycl.wff;

public  final class removal_modules_function_corresponding_predicate extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_function_corresponding_predicate() {}
  public static final SubLFile me = new removal_modules_function_corresponding_predicate();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_function_corresponding_predicate";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 923) 
  public static SubLSymbol $use_fcp_removal_moduleP$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 1749) 
  public static final SubLObject removal_fcp_check_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        if ((NIL != $use_fcp_removal_moduleP$.getGlobalValue())) {
          {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            if ((NIL != kb_indexing_datastructures.indexed_term_p(pred))) {
              if ((NIL == ans)) {
                {
                  SubLObject node_var = $const6$functionCorrespondingPredicate_Ca;
                  SubLObject deck_type = (false ? ((SubLObject) $kw14$STACK) : $kw15$QUEUE);
                  SubLObject recur_deck = deck.create_deck(deck_type);
                  SubLObject node_and_predicate_mode = NIL;
                  {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                      sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                      {
                        SubLObject tv_var = NIL;
                        {
                          SubLObject _prev_bind_0_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                          SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym16$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if ((NIL != tv_var)) {
                              if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                                if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                  {
                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($kw17$ERROR)) {
                                      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str18$_A_is_not_a__A, tv_var, $sym19$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else if (pcase_var.eql($kw20$CERROR)) {
                                      Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2129");
                                    } else if (pcase_var.eql($kw22$WARN)) {
                                      Errors.warn($str18$_A_is_not_a__A, tv_var, $sym19$SBHL_TRUE_TV_P);
                                    } else {
                                      Errors.warn($str23$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                      Errors.cerror($str21$continue_anyway, $str18$_A_is_not_a__A, tv_var, $sym19$SBHL_TRUE_TV_P);
                                    }
                                  }
                                }
                              }
                            }
                            {
                              SubLObject _prev_bind_0_2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                              SubLObject _prev_bind_1_3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                              SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                              SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                              SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                              try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const24$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const24$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const24$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const24$genlPreds), thread);
                                if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                    || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                                  {
                                    SubLObject _prev_bind_0_4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_1_5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_2_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                      sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                      sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($const24$genlPreds)), thread);
                                      sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                      sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                      node_and_predicate_mode = list($const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p());
                                      while (((NIL != node_and_predicate_mode)
                                           && (NIL == ans))) {
                                        {
                                          SubLObject node_var_7 = node_and_predicate_mode.first();
                                          SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                          SubLObject fcp_pred = node_var_7;
                                          {
                                            SubLObject _prev_bind_0_8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                              sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                              if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_7))) {
                                                {
                                                  SubLObject pred_var = fcp_pred;
                                                  if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, TWO_INTEGER, pred_var))) {
                                                    {
                                                      SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, TWO_INTEGER, pred_var);
                                                      SubLObject done_var = ans;
                                                      SubLObject token_var = NIL;
                                                      while ((NIL == done_var)) {
                                                        {
                                                          SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                          SubLObject valid = makeBoolean((token_var != final_index_spec));
                                                          if ((NIL != valid)) {
                                                            {
                                                              SubLObject final_index_iterator = NIL;
                                                              try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw25$GAF, $kw11$TRUE, NIL);
                                                                {
                                                                  SubLObject done_var_9 = ans;
                                                                  SubLObject token_var_10 = NIL;
                                                                  while ((NIL == done_var_9)) {
                                                                    {
                                                                      SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_10);
                                                                      SubLObject valid_11 = makeBoolean((token_var_10 != fcp_as));
                                                                      if ((NIL != valid_11)) {
                                                                        {
                                                                          SubLObject failP = NIL;
                                                                          SubLObject nat_argnum = assertions_high.gaf_arg3(fcp_as);
                                                                          SubLObject argnum = ZERO_INTEGER;
                                                                          SubLObject args = cycl_utilities.formula_args(asent, $kw26$IGNORE);
                                                                          SubLObject rest = NIL;
                                                                          for (rest = args; (!(((NIL != failP)
                                                                                || (NIL == rest)))); rest = rest.rest()) {
                                                                            {
                                                                              SubLObject arg = rest.first();
                                                                              argnum = Numbers.add(argnum, ONE_INTEGER);
                                                                              if (argnum.eql(nat_argnum)) {
                                                                                failP = makeBoolean((!(((NIL != variables.fully_bound_p(arg))
                                                                                         && ((NIL != nart_handles.nart_p(arg))
                                                                                          || (NIL != term.nautP(arg, UNPROVIDED)))))));
                                                                              } else {
                                                                                failP = makeBoolean((NIL == variables.fully_bound_p(arg)));
                                                                              }
                                                                            }
                                                                          }
                                                                          if ((NIL == failP)) {
                                                                            ans = T;
                                                                          }
                                                                        }
                                                                      }
                                                                      done_var_9 = makeBoolean(((NIL == valid_11)
                                                                            || (NIL != ans)));
                                                                    }
                                                                  }
                                                                }
                                                              } finally {
                                                                {
                                                                  SubLObject _prev_bind_0_12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                  try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if ((NIL != final_index_iterator)) {
                                                                      kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                  } finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          done_var = makeBoolean(((NIL == valid)
                                                                || (NIL != ans)));
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              {
                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($const24$genlPreds));
                                                SubLObject rest = NIL;
                                                for (rest = accessible_modules; (!(((NIL != ans)
                                                      || (NIL == rest)))); rest = rest.rest()) {
                                                  {
                                                    SubLObject module_var = rest.first();
                                                    {
                                                      SubLObject _prev_bind_0_13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                      SubLObject _prev_bind_1_14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                      try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        {
                                                          SubLObject node = function_terms.naut_to_nart(node_var_7);
                                                          if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                            {
                                                              SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                              if ((NIL != d_link)) {
                                                                {
                                                                  SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                  if ((NIL != mt_links)) {
                                                                    {
                                                                      SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                      while ((!(((NIL != ans)
                                                                            || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                          SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                          SubLObject tv_links = thread.secondMultipleValue();
                                                                          thread.resetMultipleValues();
                                                                          if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                            {
                                                                              SubLObject _prev_bind_0_15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                              try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                {
                                                                                  SubLObject iteration_state_16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                  while ((!(((NIL != ans)
                                                                                        || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_16)))))) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                      SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_16);
                                                                                      SubLObject link_nodes = thread.secondMultipleValue();
                                                                                      thread.resetMultipleValues();
                                                                                      if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                        {
                                                                                          SubLObject _prev_bind_0_17 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                          try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            {
                                                                                              SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9262")) : link_nodes);
                                                                                              SubLObject rest_18 = NIL;
                                                                                              for (rest_18 = new_list; (!(((NIL != ans)
                                                                                                    || (NIL == rest_18)))); rest_18 = rest_18.rest()) {
                                                                                                {
                                                                                                  SubLObject node_vars_link_node = rest_18.first();
                                                                                                  if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_17, thread);
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      iteration_state_16 = dictionary_contents.do_dictionary_contents_next(iteration_state_16);
                                                                                    }
                                                                                  }
                                                                                  dictionary_contents.do_dictionary_contents_finalize(iteration_state_16);
                                                                                }
                                                                              } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_15, thread);
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
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str27$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                              }
                                                            }
                                                          } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                            {
                                                              SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9263")) : Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2595"));
                                                              SubLObject rest_19 = NIL;
                                                              for (rest_19 = new_list; (!(((NIL != ans)
                                                                    || (NIL == rest_19)))); rest_19 = rest_19.rest()) {
                                                                {
                                                                  SubLObject generating_fn = rest_19.first();
                                                                  {
                                                                    SubLObject _prev_bind_0_20 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                      sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                      {
                                                                        SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                                        SubLObject new_list_21 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9264")) : link_nodes);
                                                                        SubLObject rest_22 = NIL;
                                                                        for (rest_22 = new_list_21; (!(((NIL != ans)
                                                                              || (NIL == rest_22)))); rest_22 = rest_22.rest()) {
                                                                          {
                                                                            SubLObject node_vars_link_node = rest_22.first();
                                                                            if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                              sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                              deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    } finally {
                                                                      sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_20, thread);
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_14, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_13, thread);
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } finally {
                                              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_8, thread);
                                            }
                                          }
                                        }
                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                      }
                                    } finally {
                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_6, thread);
                                      sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_5, thread);
                                      sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_4, thread);
                                    }
                                  }
                                } else {
                                  sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str28$Node__a_does_not_pass_sbhl_type_t, $const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                              } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_3, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_2, thread);
                              }
                            }
                          } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_1, thread);
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
            }
          }
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 3547) 
  public static final SubLObject removal_fcp_find_nat_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        if ((NIL != $use_fcp_removal_moduleP$.getGlobalValue())) {
          {
            SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
            if ((NIL != kb_indexing_datastructures.indexed_term_p(pred))) {
              if ((NIL == ans)) {
                {
                  SubLObject node_var = $const6$functionCorrespondingPredicate_Ca;
                  SubLObject deck_type = (false ? ((SubLObject) $kw14$STACK) : $kw15$QUEUE);
                  SubLObject recur_deck = deck.create_deck(deck_type);
                  SubLObject node_and_predicate_mode = NIL;
                  {
                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                      sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                      {
                        SubLObject tv_var = NIL;
                        {
                          SubLObject _prev_bind_0_45 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                          SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym16$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if ((NIL != tv_var)) {
                              if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                                if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                  {
                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($kw17$ERROR)) {
                                      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str18$_A_is_not_a__A, tv_var, $sym19$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else if (pcase_var.eql($kw20$CERROR)) {
                                      Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2131");
                                    } else if (pcase_var.eql($kw22$WARN)) {
                                      Errors.warn($str18$_A_is_not_a__A, tv_var, $sym19$SBHL_TRUE_TV_P);
                                    } else {
                                      Errors.warn($str23$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                      Errors.cerror($str21$continue_anyway, $str18$_A_is_not_a__A, tv_var, $sym19$SBHL_TRUE_TV_P);
                                    }
                                  }
                                }
                              }
                            }
                            {
                              SubLObject _prev_bind_0_46 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                              SubLObject _prev_bind_1_47 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                              SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                              SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                              SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                              try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const24$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const24$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const24$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const24$genlPreds), thread);
                                if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                    || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($const6$functionCorrespondingPredicate_Ca, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                                  {
                                    SubLObject _prev_bind_0_48 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_1_49 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    SubLObject _prev_bind_2_50 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                      sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                      sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($const24$genlPreds)), thread);
                                      sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                      sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                      node_and_predicate_mode = list($const6$functionCorrespondingPredicate_Ca, sbhl_search_vars.genl_inverse_mode_p());
                                      while (((NIL != node_and_predicate_mode)
                                           && (NIL == ans))) {
                                        {
                                          SubLObject node_var_51 = node_and_predicate_mode.first();
                                          SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                          SubLObject fcp_pred = node_var_51;
                                          {
                                            SubLObject _prev_bind_0_52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                              sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                              if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_51))) {
                                                {
                                                  SubLObject pred_var = fcp_pred;
                                                  if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(pred, TWO_INTEGER, pred_var))) {
                                                    {
                                                      SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(pred, TWO_INTEGER, pred_var);
                                                      SubLObject done_var = ans;
                                                      SubLObject token_var = NIL;
                                                      while ((NIL == done_var)) {
                                                        {
                                                          SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                          SubLObject valid = makeBoolean((token_var != final_index_spec));
                                                          if ((NIL != valid)) {
                                                            {
                                                              SubLObject final_index_iterator = NIL;
                                                              try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw25$GAF, $kw11$TRUE, NIL);
                                                                {
                                                                  SubLObject done_var_53 = ans;
                                                                  SubLObject token_var_54 = NIL;
                                                                  while ((NIL == done_var_53)) {
                                                                    {
                                                                      SubLObject fcp_as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_54);
                                                                      SubLObject valid_55 = makeBoolean((token_var_54 != fcp_as));
                                                                      if ((NIL != valid_55)) {
                                                                        {
                                                                          SubLObject failP = NIL;
                                                                          SubLObject nat_argnum = assertions_high.gaf_arg3(fcp_as);
                                                                          SubLObject argnum = ZERO_INTEGER;
                                                                          SubLObject args = cycl_utilities.formula_args(asent, $kw26$IGNORE);
                                                                          SubLObject rest = NIL;
                                                                          for (rest = args; (!(((NIL != failP)
                                                                                || (NIL == rest)))); rest = rest.rest()) {
                                                                            {
                                                                              SubLObject arg = rest.first();
                                                                              argnum = Numbers.add(argnum, ONE_INTEGER);
                                                                              if (argnum.eql(nat_argnum)) {
                                                                                failP = variables.fully_bound_p(arg);
                                                                              } else {
                                                                                failP = makeBoolean((NIL == variables.fully_bound_p(arg)));
                                                                              }
                                                                            }
                                                                          }
                                                                          if ((NIL == failP)) {
                                                                            ans = T;
                                                                          }
                                                                        }
                                                                      }
                                                                      done_var_53 = makeBoolean(((NIL == valid_55)
                                                                            || (NIL != ans)));
                                                                    }
                                                                  }
                                                                }
                                                              } finally {
                                                                {
                                                                  SubLObject _prev_bind_0_56 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                  try {
                                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                                    if ((NIL != final_index_iterator)) {
                                                                      kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                  } finally {
                                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_56, thread);
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                          done_var = makeBoolean(((NIL == valid)
                                                                || (NIL != ans)));
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                              {
                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($const24$genlPreds));
                                                SubLObject rest = NIL;
                                                for (rest = accessible_modules; (!(((NIL != ans)
                                                      || (NIL == rest)))); rest = rest.rest()) {
                                                  {
                                                    SubLObject module_var = rest.first();
                                                    {
                                                      SubLObject _prev_bind_0_57 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                      SubLObject _prev_bind_1_58 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                      try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        {
                                                          SubLObject node = function_terms.naut_to_nart(node_var_51);
                                                          if ((NIL != sbhl_link_vars.sbhl_node_object_p(node))) {
                                                            {
                                                              SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                              if ((NIL != d_link)) {
                                                                {
                                                                  SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                  if ((NIL != mt_links)) {
                                                                    {
                                                                      SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                      while ((!(((NIL != ans)
                                                                            || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))))) {
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                          SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                          SubLObject tv_links = thread.secondMultipleValue();
                                                                          thread.resetMultipleValues();
                                                                          if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                            {
                                                                              SubLObject _prev_bind_0_59 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                              try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                {
                                                                                  SubLObject iteration_state_60 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                  while ((!(((NIL != ans)
                                                                                        || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_60)))))) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                      SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_60);
                                                                                      SubLObject link_nodes = thread.secondMultipleValue();
                                                                                      thread.resetMultipleValues();
                                                                                      if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                                        {
                                                                                          SubLObject _prev_bind_0_61 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                          try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            {
                                                                                              SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9268")) : link_nodes);
                                                                                              SubLObject rest_62 = NIL;
                                                                                              for (rest_62 = new_list; (!(((NIL != ans)
                                                                                                    || (NIL == rest_62)))); rest_62 = rest_62.rest()) {
                                                                                                {
                                                                                                  SubLObject node_vars_link_node = rest_62.first();
                                                                                                  if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_61, thread);
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      iteration_state_60 = dictionary_contents.do_dictionary_contents_next(iteration_state_60);
                                                                                    }
                                                                                  }
                                                                                  dictionary_contents.do_dictionary_contents_finalize(iteration_state_60);
                                                                                }
                                                                              } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_59, thread);
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
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str27$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                              }
                                                            }
                                                          } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                            {
                                                              SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9269")) : Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2599"));
                                                              SubLObject rest_63 = NIL;
                                                              for (rest_63 = new_list; (!(((NIL != ans)
                                                                    || (NIL == rest_63)))); rest_63 = rest_63.rest()) {
                                                                {
                                                                  SubLObject generating_fn = rest_63.first();
                                                                  {
                                                                    SubLObject _prev_bind_0_64 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                      sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                      {
                                                                        SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                                        SubLObject new_list_65 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9270")) : link_nodes);
                                                                        SubLObject rest_66 = NIL;
                                                                        for (rest_66 = new_list_65; (!(((NIL != ans)
                                                                              || (NIL == rest_66)))); rest_66 = rest_66.rest()) {
                                                                          {
                                                                            SubLObject node_vars_link_node = rest_66.first();
                                                                            if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                              sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                              deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                          }
                                                                        }
                                                                      }
                                                                    } finally {
                                                                      sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_64, thread);
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_58, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_57, thread);
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } finally {
                                              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_52, thread);
                                            }
                                          }
                                        }
                                        node_and_predicate_mode = deck.deck_pop(recur_deck);
                                      }
                                    } finally {
                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_50, thread);
                                      sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_49, thread);
                                      sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_48, thread);
                                    }
                                  }
                                } else {
                                  sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str28$Node__a_does_not_pass_sbhl_type_t, $const6$functionCorrespondingPredicate_Ca, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                              } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_47, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_46, thread);
                              }
                            }
                          } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_45, thread);
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
            }
          }
        }
        return ans;
      }
    }
  }

  public static final class $removal_fcp_find_nat_required$UnaryFunction extends UnaryFunction {
    public $removal_fcp_find_nat_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-FCP-FIND-NAT-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_fcp_find_nat_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_fcp_find_nat_required$BinaryFunction extends BinaryFunction {
    public $removal_fcp_find_nat_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-FCP-FIND-NAT-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_fcp_find_nat_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-function-corresponding-predicate.lisp", position = 7109) 
  public static final SubLObject removal_evaluatable_fcp_unify_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject successP = NIL;
        if ((NIL != kb_indexing_datastructures.indexed_term_p(predicate))) {
          {
            SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
            SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
            try {
              pred_relevance_macros.$relevant_pred_function$.bind($sym48$RELEVANT_PRED_IS_SPEC_PRED, thread);
              pred_relevance_macros.$pred$.bind($const6$functionCorrespondingPredicate_Ca, thread);
              {
                SubLObject pred_var = NIL;
                if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, TWO_INTEGER, pred_var))) {
                  {
                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, TWO_INTEGER, pred_var);
                    SubLObject done_var = successP;
                    SubLObject token_var = NIL;
                    while ((NIL == done_var)) {
                      {
                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        SubLObject valid = makeBoolean((token_var != final_index_spec));
                        if ((NIL != valid)) {
                          {
                            SubLObject final_index_iterator = NIL;
                            try {
                              final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw25$GAF, $kw11$TRUE, NIL);
                              {
                                SubLObject done_var_91 = successP;
                                SubLObject token_var_92 = NIL;
                                while ((NIL == done_var_91)) {
                                  {
                                    SubLObject support_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_92);
                                    SubLObject valid_93 = makeBoolean((token_var_92 != support_assertion));
                                    if ((NIL != valid_93)) {
                                      {
                                        SubLObject function = assertions_high.gaf_arg1(support_assertion);
                                        SubLObject argnum = assertions_high.gaf_arg3(support_assertion);
                                        if ((NIL != fort_types_interface.evaluatable_function_p(function))) {
                                          {
                                            SubLObject failP = NIL;
                                            SubLObject asent_argnum = ZERO_INTEGER;
                                            SubLObject args = cycl_utilities.formula_args(asent, $kw26$IGNORE);
                                            SubLObject rest = NIL;
                                            for (rest = args; (!(((NIL != failP)
                                                  || (NIL == rest)))); rest = rest.rest()) {
                                              {
                                                SubLObject asent_arg = rest.first();
                                                asent_argnum = Numbers.add(asent_argnum, ONE_INTEGER);
                                                if ((!((argnum.eql(asent_argnum)
                                                      || (NIL != variables.fully_bound_p(asent_arg)))))) {
                                                  failP = T;
                                                }
                                              }
                                            }
                                            if ((NIL == failP)) {
                                              successP = T;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    done_var_91 = makeBoolean(((NIL == valid_93)
                                          || (NIL != successP)));
                                  }
                                }
                              }
                            } finally {
                              {
                                SubLObject _prev_bind_0_94 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                  if ((NIL != final_index_iterator)) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                  }
                                } finally {
                                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_94, thread);
                                }
                              }
                            }
                          }
                        }
                        done_var = makeBoolean(((NIL == valid)
                              || (NIL != successP)));
                      }
                    }
                  }
                }
              }
            } finally {
              pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
              pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
            }
          }
          if ((NIL != kb_gp_mapping.dgaigp_binaryP($const6$functionCorrespondingPredicate_Ca))) {
            {
              SubLObject _prev_bind_0 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
              SubLObject _prev_bind_1 = pred_relevance_macros.$pred$.currentBinding(thread);
              try {
                pred_relevance_macros.$relevant_pred_function$.bind($sym49$RELEVANT_PRED_IS_SPEC_INVERSE, thread);
                pred_relevance_macros.$pred$.bind($const6$functionCorrespondingPredicate_Ca, thread);
                {
                  SubLObject pred_var = NIL;
                  if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, arity.binary_arg_swap(TWO_INTEGER), pred_var))) {
                    {
                      SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, arity.binary_arg_swap(TWO_INTEGER), pred_var);
                      SubLObject done_var = successP;
                      SubLObject token_var = NIL;
                      while ((NIL == done_var)) {
                        {
                          SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                          SubLObject valid = makeBoolean((token_var != final_index_spec));
                          if ((NIL != valid)) {
                            {
                              SubLObject final_index_iterator = NIL;
                              try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw25$GAF, $kw11$TRUE, NIL);
                                {
                                  SubLObject done_var_95 = successP;
                                  SubLObject token_var_96 = NIL;
                                  while ((NIL == done_var_95)) {
                                    {
                                      SubLObject support_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_96);
                                      SubLObject valid_97 = makeBoolean((token_var_96 != support_assertion));
                                      if ((NIL != valid_97)) {
                                        {
                                          SubLObject _prev_bind_0_98 = kb_gp_mapping.$mapping_arg_swap$.currentBinding(thread);
                                          try {
                                            kb_gp_mapping.$mapping_arg_swap$.bind(makeBoolean((NIL == kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread))), thread);
                                            {
                                              SubLObject function = assertions_high.gaf_arg1(support_assertion);
                                              SubLObject argnum = assertions_high.gaf_arg3(support_assertion);
                                              if ((NIL != fort_types_interface.evaluatable_function_p(function))) {
                                                {
                                                  SubLObject failP = NIL;
                                                  SubLObject asent_argnum = ZERO_INTEGER;
                                                  SubLObject args = cycl_utilities.formula_args(asent, $kw26$IGNORE);
                                                  SubLObject rest = NIL;
                                                  for (rest = args; (!(((NIL != failP)
                                                        || (NIL == rest)))); rest = rest.rest()) {
                                                    {
                                                      SubLObject asent_arg = rest.first();
                                                      asent_argnum = Numbers.add(asent_argnum, ONE_INTEGER);
                                                      if ((!((argnum.eql(asent_argnum)
                                                            || (NIL != variables.fully_bound_p(asent_arg)))))) {
                                                        failP = T;
                                                      }
                                                    }
                                                  }
                                                  if ((NIL == failP)) {
                                                    successP = T;
                                                  }
                                                }
                                              }
                                            }
                                          } finally {
                                            kb_gp_mapping.$mapping_arg_swap$.rebind(_prev_bind_0_98, thread);
                                          }
                                        }
                                      }
                                      done_var_95 = makeBoolean(((NIL == valid_97)
                                            || (NIL != successP)));
                                    }
                                  }
                                }
                              } finally {
                                {
                                  SubLObject _prev_bind_0_99 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                  try {
                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                    if ((NIL != final_index_iterator)) {
                                      kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                  } finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_99, thread);
                                  }
                                }
                              }
                            }
                          }
                          done_var = makeBoolean(((NIL == valid)
                                || (NIL != successP)));
                        }
                      }
                    }
                  }
                }
              } finally {
                pred_relevance_macros.$pred$.rebind(_prev_bind_1, thread);
                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0, thread);
              }
            }
          }
        }
        return successP;
      }
    }
  }

  public static final SubLObject declare_removal_modules_function_corresponding_predicate_file() {
    declareMacro(myName, "do_fcp_assertions_for_pred", "DO-FCP-ASSERTIONS-FOR-PRED");
    declareFunction(myName, "removal_fcp_check_expand", "REMOVAL-FCP-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_fcp_check_required", "REMOVAL-FCP-CHECK-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_fcp_find_nat_expand", "REMOVAL-FCP-FIND-NAT-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_fcp_find_nat_required", "REMOVAL-FCP-FIND-NAT-REQUIRED", 1, 1, false); new $removal_fcp_find_nat_required$UnaryFunction(); new $removal_fcp_find_nat_required$BinaryFunction();
    declareFunction(myName, "removal_fcp_support", "REMOVAL-FCP-SUPPORT", 1, 0, false);
    declareFunction(myName, "removal_fcp_bindings", "REMOVAL-FCP-BINDINGS", 1, 0, false);
    declareFunction(myName, "removal_fcp_justify", "REMOVAL-FCP-JUSTIFY", 1, 0, false);
    declareFunction(myName, "removal_fcp_verify", "REMOVAL-FCP-VERIFY", 1, 0, false);
    declareMacro(myName, "do_corresponding_evaluatable_functions", "DO-CORRESPONDING-EVALUATABLE-FUNCTIONS");
    declareFunction(myName, "removal_evaluatable_fcp_unify_required", "REMOVAL-EVALUATABLE-FCP-UNIFY-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_evaluatable_fcp_unify_expand", "REMOVAL-EVALUATABLE-FCP-UNIFY-EXPAND", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_function_corresponding_predicate_file() {
    $use_fcp_removal_moduleP$ = deflexical("*USE-FCP-REMOVAL-MODULE?*", ((NIL != Symbols.boundp($sym0$_USE_FCP_REMOVAL_MODULE__)) ? ((SubLObject) $use_fcp_removal_moduleP$.getGlobalValue()) : NIL));
    return NIL;
  }

  public static final SubLObject setup_removal_modules_function_corresponding_predicate_file() {
    // CVS_ID("Id: removal-modules-function-corresponding-predicate.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_USE_FCP_REMOVAL_MODULE__);
    inference_modules.inference_removal_module($kw29$REMOVAL_FCP_CHECK, $list30);
    inference_modules.inference_removal_module($kw32$REMOVAL_FCP_FIND_NAT, $list33);
    inference_modules.inference_removal_module($kw35$REMOVAL_EVALUATABLE_FCP_UNIFY, $list36);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_USE_FCP_REMOVAL_MODULE__ = makeSymbol("*USE-FCP-REMOVAL-MODULE?*");
  public static final SubLList $list1 = list(list(makeSymbol("FCP-AS"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym2$FCP_PRED = makeUninternedSymbol("FCP-PRED");
  public static final SubLSymbol $sym3$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym4$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLSymbol $sym5$DO_ALL_SPEC_PREDICATES = makeSymbol("DO-ALL-SPEC-PREDICATES");
  public static final SubLObject $const6$functionCorrespondingPredicate_Ca = constant_handles.reader_make_constant_shell(makeString("functionCorrespondingPredicate-Canonical"));
  public static final SubLSymbol $sym7$DO_GAF_ARG_INDEX = makeSymbol("DO-GAF-ARG-INDEX");
  public static final SubLSymbol $kw8$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw9$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw10$TRUTH = makeKeyword("TRUTH");
  public static final SubLSymbol $kw11$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw12$DONE = makeKeyword("DONE");
  public static final SubLSymbol $kw13$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw14$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw15$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym16$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw17$ERROR = makeKeyword("ERROR");
  public static final SubLString $str18$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym19$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw20$CERROR = makeKeyword("CERROR");
  public static final SubLString $str21$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw22$WARN = makeKeyword("WARN");
  public static final SubLString $str23$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const24$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw25$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw26$IGNORE = makeKeyword("IGNORE");
  public static final SubLString $str27$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str28$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $kw29$REMOVAL_FCP_CHECK = makeKeyword("REMOVAL-FCP-CHECK");
  public static final SubLList $list30 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-FCP-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-FCP-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<functional-pred> . <args>)\n    with all ARGS fully bound\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$territoryOf #$France (#$TerritoryFn #$France))")});
  public static final SubLList $list31 = list(makeSymbol("FUNC"), makeSymbol("PRED"), makeSymbol("ARGNUM"));
  public static final SubLSymbol $kw32$REMOVAL_FCP_FIND_NAT = makeKeyword("REMOVAL-FCP-FIND-NAT");
  public static final SubLList $list33 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-FCP-FIND-NAT-REQUIRED"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-FCP-FIND-NAT-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<functional-pred> . <args>)\n    with only NAT arg not fully bound\n    using only the KB GAF indexing and explicit assertions"), makeKeyword("EXAMPLE"), makeString("(#$territoryOf #$France ?TERRITORY)\n    (#$anatomicalPartOfType #$AbrahamLincoln #$Head-AnimalBodyPart ?HEAD)\n    (#$intervalEndedBy ?INTERVAL #$WorldWarII)")});
  public static final SubLSymbol $kw34$FCP = makeKeyword("FCP");
  public static final SubLSymbol $kw35$REMOVAL_EVALUATABLE_FCP_UNIFY = makeKeyword("REMOVAL-EVALUATABLE-FCP-UNIFY");
  public static final SubLList $list36 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-EVALUATABLE-FCP-UNIFY-REQUIRED"), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("EXPAND"), makeSymbol("REMOVAL-EVALUATABLE-FCP-UNIFY-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(<functional-pred> . <args>)\n    with all ARGS fully bound except possibly the functional arg"), makeKeyword("EXAMPLE"), makeString("(#$commonResidue (#$Degree-UnitOfAngularMeasure 450) ?X)")});
  public static final SubLList $list37 = list(list(makeSymbol("FUNCTION"), makeSymbol("ARGNUM"), makeSymbol("PREDICATE"), makeSymbol("&KEY"), makeSymbol("DONE"), makeSymbol("SUPPORT-ASSERTION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list38 = list(makeKeyword("DONE"), makeKeyword("SUPPORT-ASSERTION"));
  public static final SubLSymbol $kw39$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw40$SUPPORT_ASSERTION = makeKeyword("SUPPORT-ASSERTION");
  public static final SubLSymbol $sym41$DO_GAF_ARG_INDEX_GP = makeSymbol("DO-GAF-ARG-INDEX-GP");
  public static final SubLSymbol $sym42$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym43$GAF_ARG1 = makeSymbol("GAF-ARG1");
  public static final SubLSymbol $sym44$GAF_ARG3 = makeSymbol("GAF-ARG3");
  public static final SubLSymbol $sym45$EVALUATABLE_FUNCTION_P = makeSymbol("EVALUATABLE-FUNCTION-P");
  public static final SubLSymbol $sym46$SUPPORT_ASSERTION = makeUninternedSymbol("SUPPORT-ASSERTION");
  public static final SubLSymbol $sym47$DO_CORRESPONDING_EVALUATABLE_FUNCTIONS = makeSymbol("DO-CORRESPONDING-EVALUATABLE-FUNCTIONS");
  public static final SubLSymbol $sym48$RELEVANT_PRED_IS_SPEC_PRED = makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
  public static final SubLSymbol $sym49$RELEVANT_PRED_IS_SPEC_INVERSE = makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
  public static final SubLObject $const50$evaluate = constant_handles.reader_make_constant_shell(makeString("evaluate"));

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_function_corresponding_predicate_file();
  }

  public void initializeVariables() {
    init_removal_modules_function_corresponding_predicate_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_function_corresponding_predicate_file();
  }

}
