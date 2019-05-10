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

package  com.cyc.cycjava_1.cycl;

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
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.deck;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.enumeration_types;
import com.cyc.cycjava_1.cycl.fort_types_interface;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.function_terms;
import com.cyc.cycjava_1.cycl.genl_mts;
import com.cyc.cycjava_1.cycl.genl_predicates;
import com.cyc.cycjava_1.cycl.ghl_link_iterators;
import com.cyc.cycjava_1.cycl.ghl_marking_utilities;
import com.cyc.cycjava_1.cycl.ghl_search_utilities;
import com.cyc.cycjava_1.cycl.ghl_search_vars;
import com.cyc.cycjava_1.cycl.graphl_graph_utilities;
import com.cyc.cycjava_1.cycl.graphl_search_vars;
import com.cyc.cycjava_1.cycl.hl_supports;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_mapping_macros;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.memoization_state;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.misc_utilities;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.mt_vars;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.pred_relevance_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.term;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class ghl_search_methods extends SubLTranslatedFile {

  //// Constructor

  private ghl_search_methods() {}
  public static final SubLFile me = new ghl_search_methods();
  public static final String myName = "com.cyc.cycjava_1.cycl.ghl_search_methods";

  //// Definitions

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 1840) 
  private static SubLSymbol $ghl_mark_and_sweep_recursion_limit$ = null;

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 6982) 
  public static final SubLObject ghl_add_accessible_link_nodes_to_deck(SubLObject v_search, SubLObject node, SubLObject node_deck) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = ghl_search_vars.ghl_relevant_predicates(v_search);
        SubLObject pred = NIL;
        for (pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pred = cdolist_list_var.first()) {
          {
            SubLObject _prev_bind_0 = ghl_link_iterators.$ghl_link_pred$.currentBinding(thread);
            try {
              ghl_link_iterators.$ghl_link_pred$.bind(pred, thread);
              if ((NIL != sbhl_module_utilities.sbhl_predicate_p(pred))) {
                {
                  SubLObject node_37 = function_terms.naut_to_nart(node);
                  {
                    SubLObject _prev_bind_0_38 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    SubLObject _prev_bind_5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    try {
                      sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(pred), thread);
                      sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(pred)), thread);
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred)), thread);
                      sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                      sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(pred), thread);
                      sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                      if ((NIL != forts.fort_p(node_37))) {
                        {
                          SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_37, sbhl_module_vars.get_sbhl_module(pred));
                          if ((NIL != d_link)) {
                            {
                              SubLObject csome_list_var = graphl_search_vars.determine_graphl_relevant_directions(ghl_search_vars.ghl_direction(v_search));
                              SubLObject search_direction = NIL;
                              for (search_direction = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), search_direction = csome_list_var.first()) {
                                {
                                  SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred));
                                  SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, link_direction, sbhl_module_vars.get_sbhl_module(pred));
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
                                              SubLObject _prev_bind_0_39 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                              try {
                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                {
                                                  SubLObject iteration_state_40 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                  while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_40))) {
                                                    thread.resetMultipleValues();
                                                    {
                                                      SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_40);
                                                      SubLObject link_nodes_var = thread.secondMultipleValue();
                                                      thread.resetMultipleValues();
                                                      if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                        {
                                                          SubLObject _prev_bind_0_41 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                          try {
                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                            {
                                                              SubLObject cdolist_list_var_42 = link_nodes_var;
                                                              SubLObject link_node = NIL;
                                                              for (link_node = cdolist_list_var_42.first(); (NIL != cdolist_list_var_42); cdolist_list_var_42 = cdolist_list_var_42.rest(), link_node = cdolist_list_var_42.first()) {
                                                                count = Numbers.add(count, ONE_INTEGER);
                                                                deck.deck_push(link_node, node_deck);
                                                              }
                                                            }
                                                          } finally {
                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_41, thread);
                                                          }
                                                        }
                                                      }
                                                      iteration_state_40 = dictionary_contents.do_dictionary_contents_next(iteration_state_40);
                                                    }
                                                  }
                                                  dictionary_contents.do_dictionary_contents_finalize(iteration_state_40);
                                                }
                                              } finally {
                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_39, thread);
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
                              }
                            }
                          } else {
                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str5$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          }
                        }
                      } else if ((NIL != term.closed_nautP(node_37, UNPROVIDED))) {
                        {
                          SubLObject csome_list_var = graphl_search_vars.determine_graphl_relevant_directions(ghl_search_vars.ghl_direction(v_search));
                          SubLObject search_direction = NIL;
                          for (search_direction = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), search_direction = csome_list_var.first()) {
                            {
                              SubLObject link_direction = sbhl_module_utilities.sbhl_search_direction_to_link_direction(search_direction, sbhl_module_vars.get_sbhl_module(pred));
                              SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9258")) : Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2557"));
                              SubLObject cdolist_list_var_43 = new_list;
                              SubLObject generating_fn = NIL;
                              for (generating_fn = cdolist_list_var_43.first(); (NIL != cdolist_list_var_43); cdolist_list_var_43 = cdolist_list_var_43.rest(), generating_fn = cdolist_list_var_43.first()) {
                                {
                                  SubLObject _prev_bind_0_44 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                  try {
                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                    {
                                      SubLObject link_nodes_var = Functions.funcall(generating_fn, node_37);
                                      SubLObject cdolist_list_var_45 = link_nodes_var;
                                      SubLObject link_node = NIL;
                                      for (link_node = cdolist_list_var_45.first(); (NIL != cdolist_list_var_45); cdolist_list_var_45 = cdolist_list_var_45.rest(), link_node = cdolist_list_var_45.first()) {
                                        count = Numbers.add(count, ONE_INTEGER);
                                        deck.deck_push(link_node, node_deck);
                                      }
                                    }
                                  } finally {
                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_44, thread);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } finally {
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_5, thread);
                      sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                      sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                      sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_38, thread);
                    }
                  }
                }
              } else if ((NIL != ghl_link_iterators.gt_predicate_p(pred))) {
                {
                  SubLObject truth = enumeration_types.tv_truth(ghl_search_vars.ghl_tv(v_search));
                  SubLObject strength = enumeration_types.tv_strength(ghl_search_vars.ghl_tv(v_search));
                  {
                    SubLObject _prev_bind_0_46 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                    try {
                      ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                      {
                        SubLObject csome_list_var = graphl_search_vars.determine_graphl_relevant_directions(ghl_search_vars.ghl_direction(v_search));
                        SubLObject search_direction = NIL;
                        for (search_direction = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), search_direction = csome_list_var.first()) {
                          {
                            SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction);
                            SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                            {
                              SubLObject _prev_bind_0_47 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                              SubLObject _prev_bind_1 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                              try {
                                ghl_link_iterators.$gt_relevant_pred$.bind(pred, thread);
                                pred_relevance_macros.$relevant_pred_function$.bind($sym7$RELEVANT_PRED_WRT_GT_, thread);
                                {
                                  SubLObject pred_var = NIL;
                                  if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var))) {
                                    {
                                      SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
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
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw8$GAF, truth, NIL);
                                                {
                                                  SubLObject done_var_48 = NIL;
                                                  SubLObject token_var_49 = NIL;
                                                  while ((NIL == done_var_48)) {
                                                    {
                                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_49);
                                                      SubLObject valid_50 = makeBoolean((token_var_49 != assertion));
                                                      if ((NIL != valid_50)) {
                                                        if (((NIL == assertion_handles.assertion_p(assertion))
                                                            || (NIL != enumeration_types.el_strength_implies(assertions_high.assertion_strength(assertion), strength)))) {
                                                          {
                                                            SubLObject link_node = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                            SubLObject support_var = assertion;
                                                            count = Numbers.add(count, ONE_INTEGER);
                                                            deck.deck_push(link_node, node_deck);
                                                          }
                                                        }
                                                      }
                                                      done_var_48 = makeBoolean((NIL == valid_50));
                                                    }
                                                  }
                                                }
                                              } finally {
                                                {
                                                  SubLObject _prev_bind_0_51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                  try {
                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != final_index_iterator)) {
                                                      kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                  } finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_51, thread);
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
                              } finally {
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1, thread);
                                ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_47, thread);
                              }
                            }
                            if ((NIL != ghl_search_vars.ghl_uses_spec_preds_p())) {
                              {
                                SubLObject _prev_bind_0_52 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                SubLObject _prev_bind_1 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                try {
                                  ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                  ghl_link_iterators.$gt_relevant_pred$.bind(pred, thread);
                                  pred_relevance_macros.$relevant_pred_function$.bind($sym7$RELEVANT_PRED_WRT_GT_, thread);
                                  {
                                    SubLObject pred_var = NIL;
                                    if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var))) {
                                      {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var);
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
                                                  final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw8$GAF, truth, NIL);
                                                  {
                                                    SubLObject done_var_53 = NIL;
                                                    SubLObject token_var_54 = NIL;
                                                    while ((NIL == done_var_53)) {
                                                      {
                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_54);
                                                        SubLObject valid_55 = makeBoolean((token_var_54 != assertion));
                                                        if ((NIL != valid_55)) {
                                                          if (((NIL == assertion_handles.assertion_p(assertion))
                                                              || (NIL != enumeration_types.el_strength_implies(assertions_high.assertion_strength(assertion), strength)))) {
                                                            {
                                                              SubLObject link_node = cycl_utilities.formula_arg(assertion, index_argnum, UNPROVIDED);
                                                              SubLObject support_var = assertion;
                                                              count = Numbers.add(count, ONE_INTEGER);
                                                              deck.deck_push(link_node, node_deck);
                                                            }
                                                          }
                                                        }
                                                        done_var_53 = makeBoolean((NIL == valid_55));
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
                                            done_var = makeBoolean((NIL == valid));
                                          }
                                        }
                                      }
                                    }
                                  }
                                } finally {
                                  pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
                                  ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_1, thread);
                                  ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_52, thread);
                                }
                              }
                            }
                          }
                        }
                      }
                    } finally {
                      ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_46, thread);
                    }
                  }
                }
              }
            } finally {
              ghl_link_iterators.$ghl_link_pred$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return count;
      }
    }
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 9429) 
  public static final SubLObject ghl_add_justification_to_result(SubLObject v_search, SubLObject justification) {
    {
      SubLObject cdolist_list_var = justification;
      SubLObject support = NIL;
      for (support = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), support = cdolist_list_var.first()) {
        ghl_search_vars.ghl_add_to_result(v_search, support, Symbols.symbol_function(EQUAL));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 9597) 
  public static final SubLObject ghl_create_justification(SubLObject v_search, SubLObject supports) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject search_preds = (ghl_search_vars.ghl_search_predicates(v_search).isList() ? ((SubLObject) ghl_search_vars.ghl_search_predicates(v_search)) : list(ghl_search_vars.ghl_search_predicates(v_search)));
        SubLObject search_mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
        SubLObject search_tv = ghl_search_vars.ghl_tv(v_search);
        SubLObject sbhl_tv = sbhl_link_vars.support_tv_to_sbhl_tv(search_tv);
        SubLObject justification = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        for (support = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), support = cdolist_list_var.first()) {
          if ((NIL != arguments.support_p(support))) {
            justification = cons(support, justification);
          }
          {
            SubLObject support_pred = ((NIL != assertion_handles.assertion_p(support)) ? ((SubLObject) assertions_high.gaf_predicate(support)) : ((NIL != arguments.hl_support_p(support)) ? ((SubLObject) cycl_utilities.formula_operator(arguments.hl_support_sentence(support))) : ((NIL != el_utilities.el_formula_p(support)) ? ((SubLObject) cycl_utilities.formula_operator(support)) : NIL)));
            if ((NIL == list_utilities.member_eqP(support_pred, search_preds))) {
              {
                SubLObject genl_pred = NIL;
                SubLObject genl_inverse = NIL;
                if ((NIL == genl_pred)) {
                  {
                    SubLObject csome_list_var = search_preds;
                    SubLObject search_pred = NIL;
                    for (search_pred = csome_list_var.first(); (!(((NIL != genl_pred)
                          || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), search_pred = csome_list_var.first()) {
                      if ((NIL != genl_predicates.genl_predicateP(support_pred, search_pred, search_mt, sbhl_tv))) {
                        genl_pred = search_pred;
                      }
                    }
                  }
                }
                if ((NIL == genl_inverse)) {
                  {
                    SubLObject csome_list_var = search_preds;
                    SubLObject search_pred = NIL;
                    for (search_pred = csome_list_var.first(); (!(((NIL != genl_inverse)
                          || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), search_pred = csome_list_var.first()) {
                      if ((NIL != Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7102"))) {
                        genl_inverse = search_pred;
                      }
                    }
                  }
                }
                if ((NIL != genl_pred)) {
                  {
                    SubLObject support_sentence = el_utilities.make_binary_formula($const11$genlPreds, support_pred, genl_pred);
                    SubLObject hl_support = arguments.make_hl_support($kw12$GENLPREDS, support_sentence, search_mt, search_tv);
                    justification = cons(hl_support, justification);
                  }
                }
                if ((NIL != genl_inverse)) {
                  {
                    SubLObject support_sentence = el_utilities.make_binary_formula($const13$genlInverse, support_pred, genl_inverse);
                    SubLObject hl_support = arguments.make_hl_support($kw12$GENLPREDS, support_sentence, search_mt, search_tv);
                    justification = cons(hl_support, justification);
                  }
                }
              }
            }
          }
        }
        return list_utilities.fast_delete_duplicates(Sequences.nreverse(justification), Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 18596) 
  public static final SubLObject new_ghl_closure_iterator(SubLObject pred, SubLObject node, SubLObject direction, SubLObject mt, SubLObject tv, SubLObject search_order, SubLObject return_non_transitive_resultsP) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((search_order == UNPROVIDED)) {
      search_order = $kw27$BREADTH_FIRST;
    }
    if ((return_non_transitive_resultsP == UNPROVIDED)) {
      return_non_transitive_resultsP = T;
    }
    {
      SubLObject v_search = ghl_search_vars.new_ghl_search(list(new SubLObject[] {$kw28$PREDICATES, list(pred), $kw29$TYPE, $kw30$TRANSITIVE_REASONING, $kw21$ORDER, search_order, $kw31$DIRECTION, direction, $kw19$TV, tv, $kw32$MARKING, $kw33$SIMPLE, $kw34$MARKING_SPACE, ghl_marking_utilities.ghl_instantiate_new_space()}));
      SubLObject reflexiveP = fort_types_interface.reflexive_binary_predicate_p(pred);
      return new_ghl_closure_search_iterator(v_search, node, mt, reflexiveP, return_non_transitive_resultsP);
    }
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 19210) 
  public static final SubLObject new_removal_ghl_closure_iterator(SubLObject pred, SubLObject node, SubLObject direction, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return new_ghl_closure_iterator(pred, node, direction, mt, NIL, $kw27$BREADTH_FIRST, NIL);
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 19463) 
  public static final SubLObject new_ghl_closure_search_iterator(SubLObject v_search, SubLObject start_node, SubLObject mt, SubLObject reflexiveP, SubLObject return_non_transitive_resultsP) {
    {
      SubLObject state = ghl_closure_search_iterator_state(v_search, start_node, mt, reflexiveP, return_non_transitive_resultsP);
      return iteration.new_iterator(state, $sym35$GHL_CLOSURE_SEARCH_ITERATOR_DONE, $sym36$GHL_CLOSURE_SEARCH_ITERATOR_NEXT, $sym37$GHL_CLOSURE_SEARCH_ITERATOR_FINALIZE);
    }
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 19860) 
  public static final SubLObject ghl_closure_search_iterator_state(SubLObject v_search, SubLObject start_node, SubLObject mt, SubLObject reflexiveP, SubLObject return_non_transitive_resultsP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject search_deck = ((NIL != ghl_search_vars.ghl_depth_first_search_p(v_search)) ? ((SubLObject) deck.create_deck($kw9$STACK)) : deck.create_deck($kw10$QUEUE));
        if ((NIL == return_non_transitive_resultsP)) {
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
                ghl_marking_utilities.ghl_mark_node(v_search, start_node, $kw38$START);
                {
                  SubLObject pred = ghl_search_vars.ghl_relevant_predicates(v_search).first();
                  SubLObject truth = enumeration_types.tv_truth(ghl_search_vars.ghl_tv(v_search));
                  SubLObject strength = enumeration_types.tv_strength(ghl_search_vars.ghl_tv(v_search));
                  {
                    SubLObject _prev_bind_0_140 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                    try {
                      ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
                      {
                        SubLObject csome_list_var = graphl_search_vars.determine_graphl_relevant_directions(ghl_search_vars.ghl_direction(v_search));
                        SubLObject search_direction = NIL;
                        for (search_direction = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), search_direction = csome_list_var.first()) {
                          {
                            SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction);
                            SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                            {
                              SubLObject _prev_bind_0_141 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                              SubLObject _prev_bind_1_142 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                              try {
                                ghl_link_iterators.$gt_relevant_pred$.bind(pred, thread);
                                pred_relevance_macros.$relevant_pred_function$.bind($sym7$RELEVANT_PRED_WRT_GT_, thread);
                                {
                                  SubLObject pred_var = NIL;
                                  if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(start_node, index_argnum, pred_var))) {
                                    {
                                      SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(start_node, index_argnum, pred_var);
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
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw8$GAF, truth, NIL);
                                                {
                                                  SubLObject done_var_143 = NIL;
                                                  SubLObject token_var_144 = NIL;
                                                  while ((NIL == done_var_143)) {
                                                    {
                                                      SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_144);
                                                      SubLObject valid_145 = makeBoolean((token_var_144 != assertion));
                                                      if ((NIL != valid_145)) {
                                                        if (((NIL == assertion_handles.assertion_p(assertion))
                                                            || (NIL != enumeration_types.el_strength_implies(assertions_high.assertion_strength(assertion), strength)))) {
                                                          {
                                                            SubLObject one_step_node = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                            SubLObject assertion_146 = assertion;
                                                            ghl_marking_utilities.ghl_mark_node(v_search, one_step_node, $kw38$START);
                                                            ghl_add_accessible_link_nodes_to_deck(v_search, one_step_node, search_deck);
                                                          }
                                                        }
                                                      }
                                                      done_var_143 = makeBoolean((NIL == valid_145));
                                                    }
                                                  }
                                                }
                                              } finally {
                                                {
                                                  SubLObject _prev_bind_0_147 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                  try {
                                                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                    if ((NIL != final_index_iterator)) {
                                                      kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                  } finally {
                                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_147, thread);
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
                              } finally {
                                pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1_142, thread);
                                ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_141, thread);
                              }
                            }
                            if ((NIL != ghl_search_vars.ghl_uses_spec_preds_p())) {
                              {
                                SubLObject _prev_bind_0_148 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                                SubLObject _prev_bind_1_149 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                                SubLObject _prev_bind_2_150 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                                try {
                                  ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                                  ghl_link_iterators.$gt_relevant_pred$.bind(pred, thread);
                                  pred_relevance_macros.$relevant_pred_function$.bind($sym7$RELEVANT_PRED_WRT_GT_, thread);
                                  {
                                    SubLObject pred_var = NIL;
                                    if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(start_node, gather_argnum, pred_var))) {
                                      {
                                        SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(start_node, gather_argnum, pred_var);
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
                                                  final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw8$GAF, truth, NIL);
                                                  {
                                                    SubLObject done_var_151 = NIL;
                                                    SubLObject token_var_152 = NIL;
                                                    while ((NIL == done_var_151)) {
                                                      {
                                                        SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_152);
                                                        SubLObject valid_153 = makeBoolean((token_var_152 != assertion));
                                                        if ((NIL != valid_153)) {
                                                          if (((NIL == assertion_handles.assertion_p(assertion))
                                                              || (NIL != enumeration_types.el_strength_implies(assertions_high.assertion_strength(assertion), strength)))) {
                                                            {
                                                              SubLObject one_step_node = cycl_utilities.formula_arg(assertion, index_argnum, UNPROVIDED);
                                                              SubLObject assertion_154 = assertion;
                                                              ghl_marking_utilities.ghl_mark_node(v_search, one_step_node, $kw38$START);
                                                              ghl_add_accessible_link_nodes_to_deck(v_search, one_step_node, search_deck);
                                                            }
                                                          }
                                                        }
                                                        done_var_151 = makeBoolean((NIL == valid_153));
                                                      }
                                                    }
                                                  }
                                                } finally {
                                                  {
                                                    SubLObject _prev_bind_0_155 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                      Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                      if ((NIL != final_index_iterator)) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                      }
                                                    } finally {
                                                      Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_155, thread);
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
                                } finally {
                                  pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2_150, thread);
                                  ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_1_149, thread);
                                  ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_148, thread);
                                }
                              }
                            }
                          }
                        }
                      }
                    } finally {
                      ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_140, thread);
                    }
                  }
                }
              } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
              }
            }
          }
        } else if ((NIL == reflexiveP)) {
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
                ghl_marking_utilities.ghl_mark_node(v_search, start_node, $kw38$START);
                ghl_add_accessible_link_nodes_to_deck(v_search, start_node, search_deck);
              } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
              }
            }
          }
        } else {
          deck.deck_push(start_node, search_deck);
        }
        return list(v_search, search_deck, mt);
      }
    }
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 21102) 
  public static final SubLObject ghl_closure_search_iterator_done(SubLObject state) {
    {
      SubLObject datum = state;
      SubLObject current = datum;
      SubLObject v_search = NIL;
      SubLObject search_deck = NIL;
      SubLObject mt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
      v_search = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
      search_deck = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
      mt = current.first();
      current = current.rest();
      if ((NIL == current)) {
        return deck.deck_empty_p(search_deck);
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list39);
      }
    }
    return NIL;
  }

  public static final class $ghl_closure_search_iterator_done$UnaryFunction extends UnaryFunction {
    public $ghl_closure_search_iterator_done$UnaryFunction() { super(extractFunctionNamed("GHL-CLOSURE-SEARCH-ITERATOR-DONE")); }
    public SubLObject processItem(SubLObject arg1) { return ghl_closure_search_iterator_done(arg1); }
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 21275) 
  public static final SubLObject ghl_closure_search_iterator_next(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = state;
        SubLObject current = datum;
        SubLObject v_search = NIL;
        SubLObject search_deck = NIL;
        SubLObject mt = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
        v_search = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
        search_deck = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
        mt = current.first();
        current = current.rest();
        if ((NIL == current)) {
          {
            SubLObject result = NIL;
            while ((!(((NIL != result)
                  || (NIL != deck.deck_empty_p(search_deck)))))) {
              {
                SubLObject node = deck.deck_pop(search_deck);
                SubLObject mark = ghl_marking_utilities.get_ghl_marking(v_search, node);
                if ((NIL == mark)) {
                  ghl_marking_utilities.ghl_mark_node(v_search, node, T);
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
                        ghl_add_accessible_link_nodes_to_deck(v_search, node, search_deck);
                      } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                      }
                    }
                  }
                  result = node;
                } else if ((mark == $kw38$START)) {
                  ghl_marking_utilities.ghl_mark_node(v_search, node, T);
                  result = node;
                }
              }
            }
            return Values.values(result, state, Types.sublisp_null(result));
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list39);
        }
      }
      return NIL;
    }
  }

  public static final class $ghl_closure_search_iterator_next$UnaryFunction extends UnaryFunction {
    public $ghl_closure_search_iterator_next$UnaryFunction() { super(extractFunctionNamed("GHL-CLOSURE-SEARCH-ITERATOR-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return ghl_closure_search_iterator_next(arg1); }
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 21874) 
  public static final SubLObject ghl_closure_search_iterator_finalize(SubLObject state) {
    {
      SubLObject datum = state;
      SubLObject current = datum;
      SubLObject v_search = NIL;
      SubLObject search_deck = NIL;
      SubLObject mt = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
      v_search = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
      search_deck = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list39);
      mt = current.first();
      current = current.rest();
      if ((NIL == current)) {
        ghl_search_vars.destroy_ghl_search(v_search);
        deck.clear_deck(search_deck);
        return T;
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list39);
      }
    }
    return NIL;
  }

  public static final class $ghl_closure_search_iterator_finalize$UnaryFunction extends UnaryFunction {
    public $ghl_closure_search_iterator_finalize$UnaryFunction() { super(extractFunctionNamed("GHL-CLOSURE-SEARCH-ITERATOR-FINALIZE")); }
    public SubLObject processItem(SubLObject arg1) { return ghl_closure_search_iterator_finalize(arg1); }
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 23957) 
  public static final SubLObject gt_predicate_relation_p(SubLObject pred, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv, SubLObject return_non_transitive_resultsP) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((return_non_transitive_resultsP == UNPROVIDED)) {
      return_non_transitive_resultsP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((node1.equal(node2)
                 && (NIL != fort_types_interface.reflexive_binary_predicate_p(pred)))) {
              result = T;
            } else if ((node1.equal(node2)
                 && (NIL != fort_types_interface.irreflexive_binary_predicate_p(pred)))) {
              result = NIL;
            } else {
              {
                SubLObject direction = ghl_search_vars.ghl_direction_for_predicate_relation(pred);
                SubLObject forwardP = ghl_search_vars.ghl_forward_direction_p(direction);
                SubLObject start_node = ((NIL != forwardP) ? ((SubLObject) node1) : node2);
                SubLObject goal_node = ((NIL != forwardP) ? ((SubLObject) node2) : node1);
                SubLObject v_search = ghl_search_vars.new_ghl_search(list(new SubLObject[] {$kw28$PREDICATES, list(pred), $kw21$ORDER, $kw27$BREADTH_FIRST, $kw29$TYPE, $kw30$TRANSITIVE_REASONING, $kw31$DIRECTION, direction, $kw19$TV, tv, $kw32$MARKING, $kw33$SIMPLE, $kw42$GOAL_SEARCH_P, T, $kw43$GOAL, list(goal_node)}));
                graphl_graph_utilities.reset_graphl_finished();
                {
                  SubLObject search_deck = ((NIL != ghl_search_vars.ghl_depth_first_search_p(v_search)) ? ((SubLObject) deck.create_deck($kw9$STACK)) : deck.create_deck($kw10$QUEUE));
                  SubLObject resolve_goal_nodeP = makeBoolean(((NIL != return_non_transitive_resultsP)
                      || (NIL != fort_types_interface.reflexive_binary_predicate_p(pred))));
                  ghl_marking_utilities.ghl_mark_node(v_search, start_node, $kw38$START);
                  gt_predicate_relation_p_add_accessible_link_nodes_to_deck(v_search, start_node, search_deck, resolve_goal_nodeP);
                  {
                    SubLObject node = deck.deck_pop(search_deck);
                    while ((!(((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))
                          || (NIL == node))))) {
                      {
                        SubLObject mark = ghl_marking_utilities.get_ghl_marking(v_search, node);
                        if ((NIL == mark)) {
                          ghl_marking_utilities.ghl_mark_node(v_search, node, T);
                          if ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))) {
                            gt_predicate_relation_p_add_accessible_link_nodes_to_deck(v_search, node, search_deck, T);
                          }
                        } else if ((mark == $kw38$START)) {
                          ghl_marking_utilities.ghl_mark_node(v_search, node, T);
                        }
                      }
                      node = deck.deck_pop(search_deck);
                    }
                  }
                }
                result = list_utilities.sublisp_boolean(ghl_search_vars.ghl_result(v_search));
                ghl_search_vars.destroy_ghl_search(v_search);
              }
            }
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 25849) 
  public static final SubLObject gt_predicate_relation_p_add_accessible_link_nodes_to_deck(SubLObject v_search, SubLObject node, SubLObject v_deck, SubLObject resolve_goal_nodeP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = ghl_search_vars.ghl_relevant_predicates(v_search).first();
        SubLObject truth = enumeration_types.tv_truth(ghl_search_vars.ghl_tv(v_search));
        SubLObject strength = enumeration_types.tv_strength(ghl_search_vars.ghl_tv(v_search));
        {
          SubLObject _prev_bind_0 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
          try {
            ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
            if ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))) {
              {
                SubLObject csome_list_var = graphl_search_vars.determine_graphl_relevant_directions(ghl_search_vars.ghl_direction(v_search));
                SubLObject search_direction = NIL;
                for (search_direction = csome_list_var.first(); (!(((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))
                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), search_direction = csome_list_var.first()) {
                  {
                    SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction);
                    SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                    {
                      SubLObject _prev_bind_0_156 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                      SubLObject _prev_bind_1 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                      try {
                        ghl_link_iterators.$gt_relevant_pred$.bind(pred, thread);
                        pred_relevance_macros.$relevant_pred_function$.bind($sym7$RELEVANT_PRED_WRT_GT_, thread);
                        {
                          SubLObject pred_var = NIL;
                          if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var))) {
                            {
                              SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                              SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                              SubLObject token_var = NIL;
                              while ((NIL == done_var)) {
                                {
                                  SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                  SubLObject valid = makeBoolean((token_var != final_index_spec));
                                  if ((NIL != valid)) {
                                    {
                                      SubLObject final_index_iterator = NIL;
                                      try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw8$GAF, truth, NIL);
                                        {
                                          SubLObject done_var_157 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                          SubLObject token_var_158 = NIL;
                                          while ((NIL == done_var_157)) {
                                            {
                                              SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_158);
                                              SubLObject valid_159 = makeBoolean((token_var_158 != assertion));
                                              if ((NIL != valid_159)) {
                                                if (((NIL == assertion_handles.assertion_p(assertion))
                                                    || (NIL != enumeration_types.el_strength_implies(assertions_high.assertion_strength(assertion), strength)))) {
                                                  {
                                                    SubLObject link_node = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                    SubLObject assertion_160 = assertion;
                                                    if (((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node, UNPROVIDED))
                                                         && (NIL != resolve_goal_nodeP))) {
                                                      ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node);
                                                    } else {
                                                      deck.deck_push(link_node, v_deck);
                                                    }
                                                  }
                                                }
                                              }
                                              done_var_157 = makeBoolean(((NIL == valid_159)
                                                    || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))));
                                            }
                                          }
                                        }
                                      } finally {
                                        {
                                          SubLObject _prev_bind_0_161 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                          try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            if ((NIL != final_index_iterator)) {
                                              kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                          } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_161, thread);
                                          }
                                        }
                                      }
                                    }
                                  }
                                  done_var = makeBoolean(((NIL == valid)
                                        || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))));
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1, thread);
                        ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_156, thread);
                      }
                    }
                    if ((NIL != ghl_search_vars.ghl_uses_spec_preds_p())) {
                      {
                        SubLObject _prev_bind_0_162 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                        SubLObject _prev_bind_1 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                        SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        try {
                          ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                          ghl_link_iterators.$gt_relevant_pred$.bind(pred, thread);
                          pred_relevance_macros.$relevant_pred_function$.bind($sym7$RELEVANT_PRED_WRT_GT_, thread);
                          {
                            SubLObject pred_var = NIL;
                            if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var))) {
                              {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var);
                                SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                SubLObject token_var = NIL;
                                while ((NIL == done_var)) {
                                  {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean((token_var != final_index_spec));
                                    if ((NIL != valid)) {
                                      {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw8$GAF, truth, NIL);
                                          {
                                            SubLObject done_var_163 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                            SubLObject token_var_164 = NIL;
                                            while ((NIL == done_var_163)) {
                                              {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_164);
                                                SubLObject valid_165 = makeBoolean((token_var_164 != assertion));
                                                if ((NIL != valid_165)) {
                                                  if (((NIL == assertion_handles.assertion_p(assertion))
                                                      || (NIL != enumeration_types.el_strength_implies(assertions_high.assertion_strength(assertion), strength)))) {
                                                    {
                                                      SubLObject link_node = cycl_utilities.formula_arg(assertion, index_argnum, UNPROVIDED);
                                                      SubLObject assertion_166 = assertion;
                                                      if (((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node, UNPROVIDED))
                                                           && (NIL != resolve_goal_nodeP))) {
                                                        ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node);
                                                      } else {
                                                        deck.deck_push(link_node, v_deck);
                                                      }
                                                    }
                                                  }
                                                }
                                                done_var_163 = makeBoolean(((NIL == valid_165)
                                                      || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))));
                                              }
                                            }
                                          }
                                        } finally {
                                          {
                                            SubLObject _prev_bind_0_167 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                              if ((NIL != final_index_iterator)) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                              }
                                            } finally {
                                              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_167, thread);
                                            }
                                          }
                                        }
                                      }
                                    }
                                    done_var = makeBoolean(((NIL == valid)
                                          || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))));
                                  }
                                }
                              }
                            }
                          }
                        } finally {
                          pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
                          ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_1, thread);
                          ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_162, thread);
                        }
                      }
                    }
                  }
                }
              }
            }
          } finally {
            ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return v_deck;
    }
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 29334) 
  public static final SubLObject why_gt_predicate_relation_p(SubLObject pred, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((node1.equal(node2)
                 && (NIL != fort_types_interface.reflexive_binary_predicate_p(pred)))) {
              result = list(arguments.make_hl_support($kw49$REFLEXIVE, el_utilities.make_binary_formula(pred, node1, node2), mt, tv));
            } else if ((node1.equal(node2)
                 && (NIL != fort_types_interface.irreflexive_binary_predicate_p(pred)))) {
              result = NIL;
            } else {
              {
                SubLObject direction = ghl_search_vars.ghl_direction_for_predicate_relation(pred);
                SubLObject forwardP = ghl_search_vars.ghl_forward_direction_p(direction);
                SubLObject start_node = ((NIL != forwardP) ? ((SubLObject) node1) : node2);
                SubLObject goal_node = ((NIL != forwardP) ? ((SubLObject) node2) : node1);
                SubLObject v_search = ghl_search_vars.new_ghl_search(listS($kw28$PREDICATES, new SubLObject[] {list(pred), $kw21$ORDER, $kw27$BREADTH_FIRST, $kw29$TYPE, $kw30$TRANSITIVE_REASONING, $kw31$DIRECTION, direction, $kw19$TV, tv, $kw32$MARKING, $kw33$SIMPLE, $kw42$GOAL_SEARCH_P, T, $kw43$GOAL, list(goal_node), $list50}));
                graphl_graph_utilities.reset_graphl_finished();
                {
                  SubLObject search_deck = ((NIL != ghl_search_vars.ghl_depth_first_search_p(v_search)) ? ((SubLObject) deck.create_deck($kw9$STACK)) : deck.create_deck($kw10$QUEUE));
                  ghl_marking_utilities.ghl_mark_node(v_search, start_node, $kw38$START);
                  gt_why_predicate_relation_p_add_accessible_link_nodes_to_deck(v_search, start_node, NIL, search_deck, T);
                  if ((NIL == deck.deck_empty_p(search_deck))) {
                    {
                      SubLObject datum = deck.deck_pop(search_deck);
                      SubLObject current = datum;
                      SubLObject node = NIL;
                      SubLObject supports = NIL;
                      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list51);
                      node = current.first();
                      current = current.rest();
                      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list51);
                      supports = current.first();
                      current = current.rest();
                      if ((NIL == current)) {
                        while ((!(((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))
                              || (NIL == node))))) {
                          {
                            SubLObject mark = ghl_marking_utilities.get_ghl_marking(v_search, node);
                            if ((NIL == mark)) {
                              ghl_marking_utilities.ghl_mark_node(v_search, node, T);
                              gt_why_predicate_relation_p_add_accessible_link_nodes_to_deck(v_search, node, supports, search_deck, T);
                            } else if ((mark == $kw38$START)) {
                              ghl_marking_utilities.ghl_mark_node(v_search, node, T);
                            }
                          }
                          {
                            SubLObject datum_evaluated_var = deck.deck_pop(search_deck);
                            node = datum_evaluated_var.first();
                            supports = conses_high.cadr(datum_evaluated_var);
                          }
                        }
                      } else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, $list51);
                      }
                    }
                  }
                }
                result = ghl_search_vars.ghl_result(v_search);
                ghl_search_vars.destroy_ghl_search(v_search);
              }
            }
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/ghl-search-methods.lisp", position = 31358) 
  public static final SubLObject gt_why_predicate_relation_p_add_accessible_link_nodes_to_deck(SubLObject v_search, SubLObject node, SubLObject supports, SubLObject v_deck, SubLObject resolve_goal_nodeP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = ghl_search_vars.ghl_relevant_predicates(v_search).first();
        SubLObject truth = enumeration_types.tv_truth(ghl_search_vars.ghl_tv(v_search));
        SubLObject strength = enumeration_types.tv_strength(ghl_search_vars.ghl_tv(v_search));
        {
          SubLObject _prev_bind_0 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
          try {
            ghl_search_vars.$gt_args_swapped_p$.bind(NIL, thread);
            if ((NIL == graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))) {
              {
                SubLObject csome_list_var = graphl_search_vars.determine_graphl_relevant_directions(ghl_search_vars.ghl_direction(v_search));
                SubLObject search_direction = NIL;
                for (search_direction = csome_list_var.first(); (!(((NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))
                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), search_direction = csome_list_var.first()) {
                  {
                    SubLObject index_argnum = ghl_link_iterators.gt_index_argnum_for_direction(search_direction);
                    SubLObject gather_argnum = misc_utilities.other_binary_arg(index_argnum);
                    {
                      SubLObject _prev_bind_0_168 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                      SubLObject _prev_bind_1 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                      try {
                        ghl_link_iterators.$gt_relevant_pred$.bind(pred, thread);
                        pred_relevance_macros.$relevant_pred_function$.bind($sym7$RELEVANT_PRED_WRT_GT_, thread);
                        {
                          SubLObject pred_var = NIL;
                          if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, index_argnum, pred_var))) {
                            {
                              SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, index_argnum, pred_var);
                              SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                              SubLObject token_var = NIL;
                              while ((NIL == done_var)) {
                                {
                                  SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                  SubLObject valid = makeBoolean((token_var != final_index_spec));
                                  if ((NIL != valid)) {
                                    {
                                      SubLObject final_index_iterator = NIL;
                                      try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw8$GAF, truth, NIL);
                                        {
                                          SubLObject done_var_169 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                          SubLObject token_var_170 = NIL;
                                          while ((NIL == done_var_169)) {
                                            {
                                              SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_170);
                                              SubLObject valid_171 = makeBoolean((token_var_170 != assertion));
                                              if ((NIL != valid_171)) {
                                                if (((NIL == assertion_handles.assertion_p(assertion))
                                                    || (NIL != enumeration_types.el_strength_implies(assertions_high.assertion_strength(assertion), strength)))) {
                                                  {
                                                    SubLObject link_node = cycl_utilities.formula_arg(assertion, gather_argnum, UNPROVIDED);
                                                    SubLObject assertion_172 = assertion;
                                                    if (((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node, UNPROVIDED))
                                                         && (NIL != resolve_goal_nodeP))) {
                                                      {
                                                        SubLObject justification = ghl_create_justification(v_search, cons(assertion_172, supports));
                                                        ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node);
                                                        ghl_add_justification_to_result(v_search, justification);
                                                      }
                                                    } else {
                                                      deck.deck_push(list(link_node, cons(assertion_172, supports)), v_deck);
                                                    }
                                                  }
                                                }
                                              }
                                              done_var_169 = makeBoolean(((NIL == valid_171)
                                                    || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))));
                                            }
                                          }
                                        }
                                      } finally {
                                        {
                                          SubLObject _prev_bind_0_173 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                          try {
                                            Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                            if ((NIL != final_index_iterator)) {
                                              kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                          } finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_173, thread);
                                          }
                                        }
                                      }
                                    }
                                  }
                                  done_var = makeBoolean(((NIL == valid)
                                        || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))));
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_1, thread);
                        ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_0_168, thread);
                      }
                    }
                    if ((NIL != ghl_search_vars.ghl_uses_spec_preds_p())) {
                      {
                        SubLObject _prev_bind_0_174 = ghl_search_vars.$gt_args_swapped_p$.currentBinding(thread);
                        SubLObject _prev_bind_1 = ghl_link_iterators.$gt_relevant_pred$.currentBinding(thread);
                        SubLObject _prev_bind_2 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                        try {
                          ghl_search_vars.$gt_args_swapped_p$.bind(T, thread);
                          ghl_link_iterators.$gt_relevant_pred$.bind(pred, thread);
                          pred_relevance_macros.$relevant_pred_function$.bind($sym7$RELEVANT_PRED_WRT_GT_, thread);
                          {
                            SubLObject pred_var = NIL;
                            if ((NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(node, gather_argnum, pred_var))) {
                              {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(node, gather_argnum, pred_var);
                                SubLObject done_var = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                SubLObject token_var = NIL;
                                while ((NIL == done_var)) {
                                  {
                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    SubLObject valid = makeBoolean((token_var != final_index_spec));
                                    if ((NIL != valid)) {
                                      {
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                          final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $kw8$GAF, truth, NIL);
                                          {
                                            SubLObject done_var_175 = graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread);
                                            SubLObject token_var_176 = NIL;
                                            while ((NIL == done_var_175)) {
                                              {
                                                SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_176);
                                                SubLObject valid_177 = makeBoolean((token_var_176 != assertion));
                                                if ((NIL != valid_177)) {
                                                  if (((NIL == assertion_handles.assertion_p(assertion))
                                                      || (NIL != enumeration_types.el_strength_implies(assertions_high.assertion_strength(assertion), strength)))) {
                                                    {
                                                      SubLObject link_node = cycl_utilities.formula_arg(assertion, index_argnum, UNPROVIDED);
                                                      SubLObject assertion_178 = assertion;
                                                      if (((NIL != ghl_search_utilities.ghl_goal_nodeP(v_search, link_node, UNPROVIDED))
                                                           && (NIL != resolve_goal_nodeP))) {
                                                        {
                                                          SubLObject justification = ghl_create_justification(v_search, cons(assertion_178, supports));
                                                          ghl_search_utilities.ghl_resolve_goal_found(v_search, link_node);
                                                          ghl_add_justification_to_result(v_search, justification);
                                                        }
                                                      } else {
                                                        deck.deck_push(list(link_node, cons(assertion_178, supports)), v_deck);
                                                      }
                                                    }
                                                  }
                                                }
                                                done_var_175 = makeBoolean(((NIL == valid_177)
                                                      || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))));
                                              }
                                            }
                                          }
                                        } finally {
                                          {
                                            SubLObject _prev_bind_0_179 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                              if ((NIL != final_index_iterator)) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                              }
                                            } finally {
                                              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_179, thread);
                                            }
                                          }
                                        }
                                      }
                                    }
                                    done_var = makeBoolean(((NIL == valid)
                                          || (NIL != graphl_graph_utilities.$graphl_finishedP$.getDynamicValue(thread))));
                                  }
                                }
                              }
                            }
                          }
                        } finally {
                          pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_2, thread);
                          ghl_link_iterators.$gt_relevant_pred$.rebind(_prev_bind_1, thread);
                          ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0_174, thread);
                        }
                      }
                    }
                  }
                }
              }
            }
          } finally {
            ghl_search_vars.$gt_args_swapped_p$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return v_deck;
    }
  }

  public static final SubLObject declare_ghl_search_methods_file() {
    //declareFunction(myName, "ghl_search", "GHL-SEARCH", 2, 0, false);
    //declareFunction(myName, "transitive_ghl_search", "TRANSITIVE-GHL-SEARCH", 2, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep", "GHL-MARK-AND-SWEEP", 2, 0, false);
    //declareFunction(myName, "ghl_unmark_and_sweep", "GHL-UNMARK-AND-SWEEP", 2, 0, false);
    //declareFunction(myName, "ghl_mark_sweep_until_goal", "GHL-MARK-SWEEP-UNTIL-GOAL", 2, 0, false);
    //declareFunction(myName, "ghl_unmark_sweep_and_map", "GHL-UNMARK-SWEEP-AND-MAP", 2, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep_df", "GHL-MARK-AND-SWEEP-DF", 2, 0, false);
    //declareFunction(myName, "ghl_unmark_and_sweep_df", "GHL-UNMARK-AND-SWEEP-DF", 2, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep_bf", "GHL-MARK-AND-SWEEP-BF", 2, 0, false);
    //declareFunction(myName, "ghl_unmark_and_sweep_bf", "GHL-UNMARK-AND-SWEEP-BF", 2, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep_df_purely_recursive", "GHL-MARK-AND-SWEEP-DF-PURELY-RECURSIVE", 3, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep_df_hybrid", "GHL-MARK-AND-SWEEP-DF-HYBRID", 4, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep_recursive_df", "GHL-MARK-AND-SWEEP-RECURSIVE-DF", 4, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep_iterative_df", "GHL-MARK-AND-SWEEP-ITERATIVE-DF", 3, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep_iterative_bf", "GHL-MARK-AND-SWEEP-ITERATIVE-BF", 3, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep_iterative", "GHL-MARK-AND-SWEEP-ITERATIVE", 4, 0, false);
    declareFunction(myName, "ghl_add_accessible_link_nodes_to_deck", "GHL-ADD-ACCESSIBLE-LINK-NODES-TO-DECK", 3, 0, false);
    //declareFunction(myName, "ghl_add_accessible_link_nodes_and_supports_to_deck", "GHL-ADD-ACCESSIBLE-LINK-NODES-AND-SUPPORTS-TO-DECK", 4, 0, false);
    //declareFunction(myName, "ghl_remove_unneeded_supports", "GHL-REMOVE-UNNEEDED-SUPPORTS", 1, 0, false);
    //declareFunction(myName, "ghl_add_support_to_result", "GHL-ADD-SUPPORT-TO-RESULT", 2, 0, false);
    declareFunction(myName, "ghl_add_justification_to_result", "GHL-ADD-JUSTIFICATION-TO-RESULT", 2, 0, false);
    declareFunction(myName, "ghl_create_justification", "GHL-CREATE-JUSTIFICATION", 2, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep_depth_cutoff_initializer", "GHL-MARK-AND-SWEEP-DEPTH-CUTOFF-INITIALIZER", 3, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep_depth_cutoff", "GHL-MARK-AND-SWEEP-DEPTH-CUTOFF", 3, 0, false);
    //declareFunction(myName, "ghl_all_edges_iterative_deepening_initializer", "GHL-ALL-EDGES-ITERATIVE-DEEPENING-INITIALIZER", 3, 0, false);
    //declareFunction(myName, "ghl_mark_and_sweep_depth_cutoff_all_edges_unwound", "GHL-MARK-AND-SWEEP-DEPTH-CUTOFF-ALL-EDGES-UNWOUND", 3, 0, false);
    //declareMacro(myName, "do_ghl_closure", "DO-GHL-CLOSURE");
    declareFunction(myName, "new_ghl_closure_iterator", "NEW-GHL-CLOSURE-ITERATOR", 3, 4, false);
    declareFunction(myName, "new_removal_ghl_closure_iterator", "NEW-REMOVAL-GHL-CLOSURE-ITERATOR", 3, 1, false);
    declareFunction(myName, "new_ghl_closure_search_iterator", "NEW-GHL-CLOSURE-SEARCH-ITERATOR", 5, 0, false);
    declareFunction(myName, "ghl_closure_search_iterator_state", "GHL-CLOSURE-SEARCH-ITERATOR-STATE", 5, 0, false);
    declareFunction(myName, "ghl_closure_search_iterator_done", "GHL-CLOSURE-SEARCH-ITERATOR-DONE", 1, 0, false); new $ghl_closure_search_iterator_done$UnaryFunction();
    declareFunction(myName, "ghl_closure_search_iterator_next", "GHL-CLOSURE-SEARCH-ITERATOR-NEXT", 1, 0, false); new $ghl_closure_search_iterator_next$UnaryFunction();
    declareFunction(myName, "ghl_closure_search_iterator_finalize", "GHL-CLOSURE-SEARCH-ITERATOR-FINALIZE", 1, 0, false); new $ghl_closure_search_iterator_finalize$UnaryFunction();
    //declareFunction(myName, "ghl_closure", "GHL-CLOSURE", 2, 3, false);
    //declareFunction(myName, "ghl_all_backward_true_nodes", "GHL-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "ghl_all_forward_true_nodes", "GHL-ALL-FORWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "ghl_record_closure", "GHL-RECORD-CLOSURE", 3, 2, false);
    //declareFunction(myName, "ghl_record_all_backward_true_nodes", "GHL-RECORD-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "ghl_record_all_forward_true_nodes", "GHL-RECORD-ALL-FORWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "ghl_predicate_relation_p", "GHL-PREDICATE-RELATION-P", 3, 3, false);
    declareFunction(myName, "gt_predicate_relation_p", "GT-PREDICATE-RELATION-P", 3, 3, false);
    declareFunction(myName, "gt_predicate_relation_p_add_accessible_link_nodes_to_deck", "GT-PREDICATE-RELATION-P-ADD-ACCESSIBLE-LINK-NODES-TO-DECK", 4, 0, false);
    //declareFunction(myName, "ghl_predicate_relation_within_multiple_searches_p", "GHL-PREDICATE-RELATION-WITHIN-MULTIPLE-SEARCHES-P", 5, 2, false);
    //declareFunction(myName, "ghl_path_from_node_to_node_within_previous_searches", "GHL-PATH-FROM-NODE-TO-NODE-WITHIN-PREVIOUS-SEARCHES", 6, 0, false);
    //declareFunction(myName, "ghl_unmark_closure_in_space_and_map", "GHL-UNMARK-CLOSURE-IN-SPACE-AND-MAP", 5, 0, false);
    //declareFunction(myName, "why_ghl_predicate_relation_p", "WHY-GHL-PREDICATE-RELATION-P", 3, 2, false);
    declareFunction(myName, "why_gt_predicate_relation_p", "WHY-GT-PREDICATE-RELATION-P", 3, 2, false);
    declareFunction(myName, "gt_why_predicate_relation_p_add_accessible_link_nodes_to_deck", "GT-WHY-PREDICATE-RELATION-P-ADD-ACCESSIBLE-LINK-NODES-TO-DECK", 5, 0, false);
    //declareFunction(myName, "ghl_max_floor_mts_of_predicate_paths", "GHL-MAX-FLOOR-MTS-OF-PREDICATE-PATHS", 3, 1, false);
    //declareFunction(myName, "gt_max_floor_mts_of_predicate_paths", "GT-MAX-FLOOR-MTS-OF-PREDICATE-PATHS", 3, 1, false);
    //declareFunction(myName, "gt_max_floor_mts_of_predicate_paths_add_accessible_link_nodes_to_deck", "GT-MAX-FLOOR-MTS-OF-PREDICATE-PATHS-ADD-ACCESSIBLE-LINK-NODES-TO-DECK", 4, 0, false);
    //declareFunction(myName, "gt_max_floor_mts_of_predicate_paths_supports_still_relevantP", "GT-MAX-FLOOR-MTS-OF-PREDICATE-PATHS-SUPPORTS-STILL-RELEVANT?", 2, 0, false);
    //declareFunction(myName, "gt_max_floor_mts_of_predicate_paths_support_still_relevantP", "GT-MAX-FLOOR-MTS-OF-PREDICATE-PATHS-SUPPORT-STILL-RELEVANT?", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_ghl_search_methods_file() {
    $ghl_mark_and_sweep_recursion_limit$ = defparameter("*GHL-MARK-AND-SWEEP-RECURSION-LIMIT*", $int2$24);
    return NIL;
  }

  public static final SubLObject setup_ghl_search_methods_file() {
    // CVS_ID("Id: ghl-search-methods.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$Unsupported_search_behavior______ = makeString("Unsupported search behavior. ~%~% ~A ~%");
  public static final SubLString $str1$Unsupported_search_conditions_ = makeString("Unsupported search conditions.");
  public static final SubLInteger $int2$24 = makeInteger(24);
  public static final SubLSymbol $sym3$GHL_GOAL_SEARCH_P = makeSymbol("GHL-GOAL-SEARCH-P");
  public static final SubLSymbol $sym4$GHL_MAP_P = makeSymbol("GHL-MAP-P");
  public static final SubLString $str5$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLSymbol $kw6$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $sym7$RELEVANT_PRED_WRT_GT_ = makeSymbol("RELEVANT-PRED-WRT-GT?");
  public static final SubLSymbol $kw8$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw9$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw10$QUEUE = makeKeyword("QUEUE");
  public static final SubLObject $const11$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw12$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLObject $const13$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLString $str14$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLList $list15 = list(list(new SubLObject[] {makeSymbol("LINK-NODE"), makeSymbol("PRED"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE"), list(makeSymbol("ORDER"), makeKeyword("DEPTH-FIRST"))}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list16 = list(makeKeyword("MT"), makeKeyword("TV"), makeKeyword("DONE"), makeKeyword("ORDER"));
  public static final SubLSymbol $kw17$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw18$MT = makeKeyword("MT");
  public static final SubLSymbol $kw19$TV = makeKeyword("TV");
  public static final SubLSymbol $kw20$DONE = makeKeyword("DONE");
  public static final SubLSymbol $kw21$ORDER = makeKeyword("ORDER");
  public static final SubLSymbol $kw22$DEPTH_FIRST = makeKeyword("DEPTH-FIRST");
  public static final SubLSymbol $sym23$ITERATOR = makeUninternedSymbol("ITERATOR");
  public static final SubLSymbol $sym24$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym25$NEW_GHL_CLOSURE_ITERATOR = makeSymbol("NEW-GHL-CLOSURE-ITERATOR");
  public static final SubLSymbol $sym26$DO_ITERATOR = makeSymbol("DO-ITERATOR");
  public static final SubLSymbol $kw27$BREADTH_FIRST = makeKeyword("BREADTH-FIRST");
  public static final SubLSymbol $kw28$PREDICATES = makeKeyword("PREDICATES");
  public static final SubLSymbol $kw29$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw30$TRANSITIVE_REASONING = makeKeyword("TRANSITIVE-REASONING");
  public static final SubLSymbol $kw31$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw32$MARKING = makeKeyword("MARKING");
  public static final SubLSymbol $kw33$SIMPLE = makeKeyword("SIMPLE");
  public static final SubLSymbol $kw34$MARKING_SPACE = makeKeyword("MARKING-SPACE");
  public static final SubLSymbol $sym35$GHL_CLOSURE_SEARCH_ITERATOR_DONE = makeSymbol("GHL-CLOSURE-SEARCH-ITERATOR-DONE");
  public static final SubLSymbol $sym36$GHL_CLOSURE_SEARCH_ITERATOR_NEXT = makeSymbol("GHL-CLOSURE-SEARCH-ITERATOR-NEXT");
  public static final SubLSymbol $sym37$GHL_CLOSURE_SEARCH_ITERATOR_FINALIZE = makeSymbol("GHL-CLOSURE-SEARCH-ITERATOR-FINALIZE");
  public static final SubLSymbol $kw38$START = makeKeyword("START");
  public static final SubLList $list39 = list(makeSymbol("SEARCH"), makeSymbol("SEARCH-DECK"), makeSymbol("MT"));
  public static final SubLSymbol $kw40$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $kw41$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $kw42$GOAL_SEARCH_P = makeKeyword("GOAL-SEARCH-P");
  public static final SubLSymbol $kw43$GOAL = makeKeyword("GOAL");
  public static final SubLSymbol $kw44$GOAL_SPACE = makeKeyword("GOAL-SPACE");
  public static final SubLList $list45 = list(makeKeyword("MAP-FN"), makeSymbol("GHL-GOAL-MARK-NODE-AS-SEARCHED"));
  public static final SubLSymbol $kw46$GOAL_FN = makeKeyword("GOAL-FN");
  public static final SubLSymbol $sym47$GHL_GOAL_OR_MARKED_AS_GOAL_ = makeSymbol("GHL-GOAL-OR-MARKED-AS-GOAL?");
  public static final SubLSymbol $kw48$MAP_FN = makeKeyword("MAP-FN");
  public static final SubLSymbol $kw49$REFLEXIVE = makeKeyword("REFLEXIVE");
  public static final SubLList $list50 = list(makeKeyword("JUSTIFY?"), T);
  public static final SubLList $list51 = list(makeSymbol("NODE"), makeSymbol("SUPPORTS"));
  public static final SubLSymbol $sym52$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
  public static final SubLObject $const53$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $sym54$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
  public static final SubLSymbol $sym55$GENL_MT_ = makeSymbol("GENL-MT?");

  //// Initializers

  public void declareFunctions() {
    declare_ghl_search_methods_file();
  }

  public void initializeVariables() {
    init_ghl_search_methods_file();
  }

  public void runTopLevelForms() {
    setup_ghl_search_methods_file();
  }

}
