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
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.ghl_search_methods;
import com.cyc.cycjava.cycl.gt_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
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
import com.cyc.cycjava.cycl.subl_macros;

public  final class removal_modules_transitivity extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_transitivity() {}
  public static final SubLFile me = new removal_modules_transitivity();
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_transitivity";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-transitivity.lisp", position = 877) 
  public static final SubLObject make_transitivity_support(SubLObject predicate, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = $kw0$TRUE_DEF;
    }
    return arguments.make_hl_support($kw1$ISA, el_utilities.make_binary_formula($const2$isa, predicate, $const3$TransitiveBinaryPredicate), mt, tv);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-transitivity.lisp", position = 1063) 
  private static SubLSymbol $default_transitive_check_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-transitivity.lisp", position = 2105) 
  public static final SubLObject gt_required_arg_type_p(SubLObject object) {
    return gt_utilities.gt_term_p(object);
  }

  public static final class $gt_required_arg_type_p$UnaryFunction extends UnaryFunction {
    public $gt_required_arg_type_p$UnaryFunction() { super(extractFunctionNamed("GT-REQUIRED-ARG-TYPE-P")); }
    public SubLObject processItem(SubLObject arg1) { return gt_required_arg_type_p(arg1); }
  }

  /** Like @xref INFERENCE-TRANSITIVITY-CHECK but requires at least one actual transitive step. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-transitivity.lisp", position = 2343) 
  public static final SubLObject inference_transitivity_check_strict(SubLObject predicate, SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = $kw0$TRUE_DEF;
    }
    return ghl_search_methods.gt_predicate_relation_p(predicate, arg1, arg2, mt, tv, NIL);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-transitivity.lisp", position = 2607) 
  public static final SubLObject inference_transitivity_justify(SubLObject predicate, SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = $kw0$TRUE_DEF;
    }
    {
      SubLObject trans_support = make_transitivity_support(predicate, mt, tv);
      SubLObject justification = ghl_search_methods.why_gt_predicate_relation_p(predicate, arg1, arg2, mt, tv);
      return ((NIL != justification) ? ((SubLObject) cons(trans_support, justification)) : NIL);
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-transitivity.lisp", position = 2924) 
  private static SubLSymbol $default_transitive_walk_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-transitivity.lisp", position = 4148) 
  public static final SubLObject removal_transitive_arg1_walk_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject est = ZERO_INTEGER;
        SubLObject module = sbhl_module_vars.get_sbhl_module($const8$genlPreds);
        SubLObject node_var = pred;
        SubLObject deck_type = (false ? ((SubLObject) $kw10$STACK) : $kw11$QUEUE);
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
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym12$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                  if ((NIL != tv_var)) {
                    if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                      if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        {
                          SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                          if (pcase_var.eql($kw13$ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$_A_is_not_a__A, tv_var, $sym15$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          } else if (pcase_var.eql($kw16$CERROR)) {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2137");
                          } else if (pcase_var.eql($kw18$WARN)) {
                            Errors.warn($str14$_A_is_not_a__A, tv_var, $sym15$SBHL_TRUE_TV_P);
                          } else {
                            Errors.warn($str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str17$continue_anyway, $str14$_A_is_not_a__A, tv_var, $sym15$SBHL_TRUE_TV_P);
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
                      sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                      sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                      sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                      sbhl_module_vars.$sbhl_module$.bind(module, thread);
                      if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                          || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                        {
                          SubLObject _prev_bind_0_4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_1_5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), module), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                            node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                            while ((NIL != node_and_predicate_mode)) {
                              {
                                SubLObject node_var_7 = node_and_predicate_mode.first();
                                SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                SubLObject genl_pred = node_var_7;
                                {
                                  SubLObject _prev_bind_0_8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                  try {
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                    {
                                      SubLObject inv = predicate_mode;
                                      if ((NIL != inv)) {
                                        if ((genl_pred == $const20$genls)) {
                                          est = Numbers.add(est, cardinality_estimates.spec_cardinality(arg1));
                                        } else {
                                          est = Numbers.add(est, kb_indexing.num_gaf_arg_index(arg1, TWO_INTEGER, genl_pred, UNPROVIDED));
                                        }
                                      } else {
                                        if ((genl_pred == $const20$genls)) {
                                          est = Numbers.add(est, cardinality_estimates.genl_cardinality(arg1));
                                        } else {
                                          est = Numbers.add(est, kb_indexing.num_gaf_arg_index(arg1, ONE_INTEGER, genl_pred, UNPROVIDED));
                                        }
                                      }
                                      {
                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                        SubLObject cdolist_list_var = accessible_modules;
                                        SubLObject module_var = NIL;
                                        for (module_var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), module_var = cdolist_list_var.first()) {
                                          {
                                            SubLObject _prev_bind_0_9 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                            while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                                                              thread.resetMultipleValues();
                                                              {
                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                                                                  {
                                                                    SubLObject _prev_bind_0_11 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                      sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                      {
                                                                        SubLObject iteration_state_12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_12))) {
                                                                          thread.resetMultipleValues();
                                                                          {
                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_12);
                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                              {
                                                                                SubLObject _prev_bind_0_13 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                  sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                  {
                                                                                    SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9297")) : link_nodes);
                                                                                    SubLObject cdolist_list_var_14 = new_list;
                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                    for (node_vars_link_node = cdolist_list_var_14.first(); (NIL != cdolist_list_var_14); cdolist_list_var_14 = cdolist_list_var_14.rest(), node_vars_link_node = cdolist_list_var_14.first()) {
                                                                                      if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } finally {
                                                                                  sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_13, thread);
                                                                                }
                                                                              }
                                                                            }
                                                                            iteration_state_12 = dictionary_contents.do_dictionary_contents_next(iteration_state_12);
                                                                          }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_12);
                                                                      }
                                                                    } finally {
                                                                      sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_11, thread);
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
                                                      sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str21$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                  }
                                                } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                  {
                                                    SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9298")) : Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2617"));
                                                    SubLObject cdolist_list_var_15 = new_list;
                                                    SubLObject generating_fn = NIL;
                                                    for (generating_fn = cdolist_list_var_15.first(); (NIL != cdolist_list_var_15); cdolist_list_var_15 = cdolist_list_var_15.rest(), generating_fn = cdolist_list_var_15.first()) {
                                                      {
                                                        SubLObject _prev_bind_0_16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                          sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                          {
                                                            SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                            SubLObject new_list_17 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9299")) : link_nodes);
                                                            SubLObject cdolist_list_var_18 = new_list_17;
                                                            SubLObject node_vars_link_node = NIL;
                                                            for (node_vars_link_node = cdolist_list_var_18.first(); (NIL != cdolist_list_var_18); cdolist_list_var_18 = cdolist_list_var_18.rest(), node_vars_link_node = cdolist_list_var_18.first()) {
                                                              if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                              }
                                                            }
                                                          }
                                                        } finally {
                                                          sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_16, thread);
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } finally {
                                              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_10, thread);
                                              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_9, thread);
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
                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str22$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
        return Numbers.max($default_transitive_walk_cost$.getDynamicValue(thread), est);
      }
    }
  }

  public static final class $removal_transitive_arg1_walk_cost$UnaryFunction extends UnaryFunction {
    public $removal_transitive_arg1_walk_cost$UnaryFunction() { super(extractFunctionNamed("REMOVAL-TRANSITIVE-ARG1-WALK-COST")); }
    public SubLObject processItem(SubLObject arg1) { return removal_transitive_arg1_walk_cost(arg1, UNPROVIDED); }
  }

  public static final class $removal_transitive_arg1_walk_cost$BinaryFunction extends BinaryFunction {
    public $removal_transitive_arg1_walk_cost$BinaryFunction() { super(extractFunctionNamed("REMOVAL-TRANSITIVE-ARG1-WALK-COST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_transitive_arg1_walk_cost(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-transitivity.lisp", position = 4739) 
  public static final SubLObject removal_transitive_arg1_walk_iterator(SubLObject predicate, SubLObject arg1) {
    return ghl_search_methods.new_removal_ghl_closure_iterator(predicate, arg1, $kw23$FORWARD, UNPROVIDED);
  }

  public static final class $removal_transitive_arg1_walk_iterator$BinaryFunction extends BinaryFunction {
    public $removal_transitive_arg1_walk_iterator$BinaryFunction() { super(extractFunctionNamed("REMOVAL-TRANSITIVE-ARG1-WALK-ITERATOR")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_transitive_arg1_walk_iterator(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-transitivity.lisp", position = 6051) 
  public static final SubLObject removal_transitive_arg2_walk_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject est = ZERO_INTEGER;
        SubLObject module = sbhl_module_vars.get_sbhl_module($const8$genlPreds);
        SubLObject node_var = pred;
        SubLObject deck_type = (false ? ((SubLObject) $kw10$STACK) : $kw11$QUEUE);
        SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
          try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            {
              SubLObject tv_var = NIL;
              {
                SubLObject _prev_bind_0_19 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym12$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                  if ((NIL != tv_var)) {
                    if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                      if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        {
                          SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                          if (pcase_var.eql($kw13$ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$_A_is_not_a__A, tv_var, $sym15$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          } else if (pcase_var.eql($kw16$CERROR)) {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2138");
                          } else if (pcase_var.eql($kw18$WARN)) {
                            Errors.warn($str14$_A_is_not_a__A, tv_var, $sym15$SBHL_TRUE_TV_P);
                          } else {
                            Errors.warn($str19$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str17$continue_anyway, $str14$_A_is_not_a__A, tv_var, $sym15$SBHL_TRUE_TV_P);
                          }
                        }
                      }
                    }
                  }
                  {
                    SubLObject _prev_bind_0_20 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    SubLObject _prev_bind_1_21 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                          SubLObject _prev_bind_0_22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_1_23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                            node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                            while ((NIL != node_and_predicate_mode)) {
                              {
                                SubLObject node_var_25 = node_and_predicate_mode.first();
                                SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                SubLObject genl_pred = node_var_25;
                                {
                                  SubLObject _prev_bind_0_26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                  try {
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                    {
                                      SubLObject inv = predicate_mode;
                                      if ((NIL != inv)) {
                                        if ((genl_pred == $const20$genls)) {
                                          est = Numbers.add(est, cardinality_estimates.genl_cardinality(arg2));
                                        } else {
                                          est = Numbers.add(est, kb_indexing.num_gaf_arg_index(arg2, ONE_INTEGER, genl_pred, UNPROVIDED));
                                        }
                                      } else {
                                        if ((genl_pred == $const20$genls)) {
                                          est = Numbers.add(est, cardinality_estimates.spec_cardinality(arg2));
                                        } else {
                                          est = Numbers.add(est, kb_indexing.num_gaf_arg_index(arg2, TWO_INTEGER, genl_pred, UNPROVIDED));
                                        }
                                      }
                                      {
                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(module);
                                        SubLObject cdolist_list_var = accessible_modules;
                                        SubLObject module_var = NIL;
                                        for (module_var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), module_var = cdolist_list_var.first()) {
                                          {
                                            SubLObject _prev_bind_0_27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            SubLObject _prev_bind_1_28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                              sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                              sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                              {
                                                SubLObject node = function_terms.naut_to_nart(node_var_25);
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
                                                                    SubLObject _prev_bind_0_29 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                      sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                      {
                                                                        SubLObject iteration_state_30 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_30))) {
                                                                          thread.resetMultipleValues();
                                                                          {
                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_30);
                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                                              {
                                                                                SubLObject _prev_bind_0_31 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                  sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                  {
                                                                                    SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9300")) : link_nodes);
                                                                                    SubLObject cdolist_list_var_32 = new_list;
                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                    for (node_vars_link_node = cdolist_list_var_32.first(); (NIL != cdolist_list_var_32); cdolist_list_var_32 = cdolist_list_var_32.rest(), node_vars_link_node = cdolist_list_var_32.first()) {
                                                                                      if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } finally {
                                                                                  sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_31, thread);
                                                                                }
                                                                              }
                                                                            }
                                                                            iteration_state_30 = dictionary_contents.do_dictionary_contents_next(iteration_state_30);
                                                                          }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_30);
                                                                      }
                                                                    } finally {
                                                                      sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_29, thread);
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
                                                      sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str21$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                  }
                                                } else if ((NIL != obsolete.cnat_p(node, UNPROVIDED))) {
                                                  {
                                                    SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9301")) : Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2619"));
                                                    SubLObject cdolist_list_var_33 = new_list;
                                                    SubLObject generating_fn = NIL;
                                                    for (generating_fn = cdolist_list_var_33.first(); (NIL != cdolist_list_var_33); cdolist_list_var_33 = cdolist_list_var_33.rest(), generating_fn = cdolist_list_var_33.first()) {
                                                      {
                                                        SubLObject _prev_bind_0_34 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                          sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                          {
                                                            SubLObject link_nodes = Functions.funcall(generating_fn, node);
                                                            SubLObject new_list_35 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9302")) : link_nodes);
                                                            SubLObject cdolist_list_var_36 = new_list_35;
                                                            SubLObject node_vars_link_node = NIL;
                                                            for (node_vars_link_node = cdolist_list_var_36.first(); (NIL != cdolist_list_var_36); cdolist_list_var_36 = cdolist_list_var_36.rest(), node_vars_link_node = cdolist_list_var_36.first()) {
                                                              if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                              }
                                                            }
                                                          }
                                                        } finally {
                                                          sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_34, thread);
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } finally {
                                              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_28, thread);
                                              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_27, thread);
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_26, thread);
                                  }
                                }
                              }
                              node_and_predicate_mode = deck.deck_pop(recur_deck);
                            }
                          } finally {
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_24, thread);
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_23, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_22, thread);
                          }
                        }
                      } else {
                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str22$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                      }
                    } finally {
                      sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                      sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_21, thread);
                      sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_20, thread);
                    }
                  }
                } finally {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                  sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_19, thread);
                }
              }
              sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
            }
          } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
          }
        }
        return Numbers.max($default_transitive_walk_cost$.getDynamicValue(thread), est);
      }
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-transitivity.lisp", position = 6642) 
  public static final SubLObject removal_transitive_arg2_walk_iterator(SubLObject predicate, SubLObject arg2) {
    return ghl_search_methods.new_removal_ghl_closure_iterator(predicate, arg2, $kw26$BACKWARD, UNPROVIDED);
  }

  public static final SubLObject declare_removal_modules_transitivity_file() {
    declareFunction(myName, "make_transitivity_support", "MAKE-TRANSITIVITY-SUPPORT", 1, 2, false);
    declareFunction(myName, "gt_required_arg_type_p", "GT-REQUIRED-ARG-TYPE-P", 1, 0, false); new $gt_required_arg_type_p$UnaryFunction();
    declareFunction(myName, "inference_transitivity_check", "INFERENCE-TRANSITIVITY-CHECK", 3, 2, false);
    declareFunction(myName, "inference_transitivity_check_strict", "INFERENCE-TRANSITIVITY-CHECK-STRICT", 3, 2, false);
    declareFunction(myName, "inference_transitivity_justify", "INFERENCE-TRANSITIVITY-JUSTIFY", 3, 2, false);
    declareFunction(myName, "removal_transitive_arg1_walk_cost", "REMOVAL-TRANSITIVE-ARG1-WALK-COST", 1, 1, false); new $removal_transitive_arg1_walk_cost$UnaryFunction(); new $removal_transitive_arg1_walk_cost$BinaryFunction();
    declareFunction(myName, "removal_transitive_arg1_walk_iterator", "REMOVAL-TRANSITIVE-ARG1-WALK-ITERATOR", 2, 0, false); new $removal_transitive_arg1_walk_iterator$BinaryFunction();
    declareFunction(myName, "removal_transitive_arg2_walk_cost", "REMOVAL-TRANSITIVE-ARG2-WALK-COST", 1, 1, false);
    declareFunction(myName, "removal_transitive_arg2_walk_iterator", "REMOVAL-TRANSITIVE-ARG2-WALK-ITERATOR", 2, 0, false);
    declareFunction(myName, "inference_transitivity_gather_arg1", "INFERENCE-TRANSITIVITY-GATHER-ARG1", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_transitivity_file() {
    $default_transitive_check_cost$ = defparameter("*DEFAULT-TRANSITIVE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
    $default_transitive_walk_cost$ = defparameter("*DEFAULT-TRANSITIVE-WALK-COST*", FOUR_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_transitivity_file() {
    // CVS_ID("Id: removal-modules-transitivity.lisp 126640 2008-12-04 13:39:36Z builder ");
    inference_modules.inference_removal_module($kw4$REMOVAL_TRANSITIVE_CHECK, $list5);
    inference_modules.inference_removal_module($kw6$REMOVAL_TRANSITIVE_ARG1_WALK, $list7);
    inference_modules.inference_removal_module($kw24$REMOVAL_TRANSITIVE_ARG2_WALK, $list25);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $kw1$ISA = makeKeyword("ISA");
  public static final SubLObject $const2$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const3$TransitiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));
  public static final SubLSymbol $kw4$REMOVAL_TRANSITIVE_CHECK = makeKeyword("REMOVAL-TRANSITIVE-CHECK");
  public static final SubLList $list5 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("GT-REQUIRED-ARG-TYPE-P")), list(makeKeyword("TEST"), makeSymbol("GT-REQUIRED-ARG-TYPE-P"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-TRANSITIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TRANSITIVE-CHECK-COST*"), makeKeyword("OUTPUT-CHECK-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2")), list(makeKeyword("CALL"), makeSymbol("INFERENCE-TRANSITIVITY-CHECK-STRICT"), list(makeKeyword("VALUE"), makeSymbol("PRED")), list(makeKeyword("VALUE"), makeSymbol("ARG1")), list(makeKeyword("VALUE"), makeSymbol("ARG2")))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TRANSITIVITY"), makeKeyword("DOCUMENTATION"), makeString("(<transitive predicate> <fort> <fort>))\nusing general transitivity graph walking of KB assertions"), makeKeyword("EXAMPLE"), makeString("(#$geographicalSubRegions #$ContinentOfEurope #$CityOfParisFrance)")});
  public static final SubLSymbol $kw6$REMOVAL_TRANSITIVE_ARG1_WALK = makeKeyword("REMOVAL-TRANSITIVE-ARG1-WALK");
  public static final SubLList $list7 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), list(makeKeyword("TEST"), makeSymbol("GT-REQUIRED-ARG-TYPE-P")), makeKeyword("VARIABLE")), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-TRANSITIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-TRANSITIVE-ARG1-WALK-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(makeKeyword("BIND"), makeSymbol("ARG1")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG1")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TRANSITIVE-ARG1-WALK-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG1"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG1")), makeKeyword("INPUT")), makeKeyword("SUPPORT-MODULE"), makeKeyword("TRANSITIVITY"), makeKeyword("DOCUMENTATION"), makeString("(<transitive predicate> <fort> <variable>))\nusing general transitivity graph walking of KB assertions\nstarting from <arg1>"), makeKeyword("EXAMPLE"), makeString("(#$geographicalSubRegions #$ContinentOfEurope ?SUB)")});
  public static final SubLObject $const8$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw9$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw10$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw11$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym12$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw13$ERROR = makeKeyword("ERROR");
  public static final SubLString $str14$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym15$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw16$CERROR = makeKeyword("CERROR");
  public static final SubLString $str17$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw18$WARN = makeKeyword("WARN");
  public static final SubLString $str19$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const20$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLString $str21$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str22$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $kw23$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $kw24$REMOVAL_TRANSITIVE_ARG2_WALK = makeKeyword("REMOVAL-TRANSITIVE-ARG2-WALK");
  public static final SubLList $list25 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), list(list(makeKeyword("TEST"), makeSymbol("NON-HL-PREDICATE-P")), makeKeyword("VARIABLE"), list(makeKeyword("TEST"), makeSymbol("GT-REQUIRED-ARG-TYPE-P"))), cons(list(makeKeyword("TEST"), makeSymbol("INFERENCE-TRANSITIVE-PREDICATE?")), makeKeyword("ANYTHING"))), makeKeyword("COST"), makeSymbol("REMOVAL-TRANSITIVE-ARG2-WALK-COST"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("ARG2"))), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG2")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-TRANSITIVE-ARG2-WALK-ITERATOR"), list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), list(makeKeyword("VALUE"), makeSymbol("ARG2"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("PREDICATE")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("ARG2"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("TRANSITIVITY"), makeKeyword("DOCUMENTATION"), makeString("(<transitive predicate> <variable> <fort>))\nusing general transitivity graph walking of KB assertions\nstarting from <arg2>"), makeKeyword("EXAMPLE"), makeString("(#$geographicalSubRegions ?SUPER #$CityOfParisFrance)")});
  public static final SubLSymbol $kw26$BACKWARD = makeKeyword("BACKWARD");

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_transitivity_file();
  }

  public void initializeVariables() {
    init_removal_modules_transitivity_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_transitivity_file();
  }

}
