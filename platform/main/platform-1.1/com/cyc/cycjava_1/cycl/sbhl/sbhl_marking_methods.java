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

package com.cyc.cycjava_1.cycl.sbhl;
 import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;

public  final class sbhl_marking_methods extends SubLTranslatedFile {

  //// Constructor

  private sbhl_marking_methods() {}
  public static final SubLFile me = new sbhl_marking_methods();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods";

  //// Definitions

  /** @Hack assumes sbhl modules are cheaper to search forward */
  @SubL(source = "cycl/sbhl/sbhl-marking-methods.lisp", position = 1489) 
  public static final SubLObject sbhl_premark_direction(SubLObject module) {
    return sbhl_search_vars.get_sbhl_forward_search_direction();
  }

  /** Used for initial marking for boolean disjoins searches. Applies @see sbhl-sweep, upon NODE, with current *sbhl-module*, forward direction, true search tv, in @see *sbhl-gather-space*, with map-fn sbhl-check-cutoff. */
  @SubL(source = "cycl/sbhl/sbhl-marking-methods.lisp", position = 1664) 
  public static final SubLObject sbhl_premark_gather_nodes(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_search_utilities.sbhl_sweep(sbhl_module_vars.get_sbhl_module(UNPROVIDED), sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_premark_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), sbhl_module_vars.get_sbhl_module(UNPROVIDED)), sbhl_search_vars.sbhl_search_true_tv(), sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread), $sym0$SBHL_CHECK_CUTOFF, node, sbhl_search_vars.sbhl_unmarking_search_p());
      return NIL;
    }
  }

  /** Modifier. Marks the forward true closure of NODE in MODULE with relevance determined by MT and TV. performs this marking in current *sbhl-space* and possibly *sbhl-gather-space*, depending on the search behavior that it binds (as determined by @see determine-sbhl-search-behavior). */
  @SubL(source = "cycl/sbhl/sbhl-marking-methods.lisp", position = 3151) 
  public static final SubLObject sbhl_mark_all_forward_true_nodes(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym5$SBHL_MODULE_P);
      {
        SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        SubLObject _prev_bind_5 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
          sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
          sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
          sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
          sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
          sbhl_module_vars.$sbhl_module$.bind(module, thread);
          sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
          {
            SubLObject mt_var = mt;
            {
              SubLObject _prev_bind_0_2 = mt_relevance_macros.$mt$.currentBinding(thread);
              SubLObject _prev_bind_1_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_2_4 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
              try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                {
                  SubLObject tv_var = tv;
                  {
                    SubLObject _prev_bind_0_5 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    SubLObject _prev_bind_1_6 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                      sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                      sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym6$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                      if ((NIL != tv_var)) {
                        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                          if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            {
                              SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                              if (pcase_var.eql($kw7$ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str8$_A_is_not_a__A, tv_var, $sym9$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                              } else if (pcase_var.eql($kw10$CERROR)) {
                                Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2196");
                              } else if (pcase_var.eql($kw12$WARN)) {
                                Errors.warn($str8$_A_is_not_a__A, tv_var, $sym9$SBHL_TRUE_TV_P);
                              } else {
                                Errors.warn($str13$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($str11$continue_anyway, $str8$_A_is_not_a__A, tv_var, $sym9$SBHL_TRUE_TV_P);
                              }
                            }
                          }
                        }
                      }
                      {
                        SubLObject _prev_bind_0_7 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                        SubLObject _prev_bind_1_8 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                        SubLObject _prev_bind_2_9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_search_truth$.bind($const14$True_JustificationTruth, thread);
                          sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                          sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                          {
                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                            {
                              SubLObject _prev_bind_0_10 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                              try {
                                sbhl_marking_vars.$sbhl_space$.bind(((source == $kw15$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                {
                                  SubLObject _prev_bind_0_11 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                  try {
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw15$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                    {
                                      SubLObject _prev_bind_0_12 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                      SubLObject _prev_bind_1_13 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                      SubLObject _prev_bind_2_14 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                      SubLObject _prev_bind_3_15 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                      SubLObject _prev_bind_4_16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                      try {
                                        sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                        sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                        sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        {
                                          SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                          SubLObject needs_to_releaseP = NIL;
                                          try {
                                            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
                                            {
                                              SubLObject _prev_bind_0_17 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                              SubLObject _prev_bind_1_18 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                              try {
                                                sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                sbhl_mark_closure_as_marked(node);
                                              } finally {
                                                sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_18, thread);
                                                sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_17, thread);
                                              }
                                            }
                                          } finally {
                                            if ((NIL != needs_to_releaseP)) {
                                              ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                            }
                                          }
                                        }
                                      } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_16, thread);
                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_15, thread);
                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_14, thread);
                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_13, thread);
                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_12, thread);
                                      }
                                    }
                                    if ((source == $kw16$RESOURCE)) {
                                      sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    }
                                  } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_11, thread);
                                  }
                                }
                                if ((source == $kw16$RESOURCE)) {
                                  sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                }
                              } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_10, thread);
                              }
                            }
                          }
                        } finally {
                          sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_9, thread);
                          sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_8, thread);
                          sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_7, thread);
                        }
                      }
                    } finally {
                      sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_6, thread);
                      sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_5, thread);
                    }
                  }
                }
              } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_4, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_3, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_2, thread);
              }
            }
          }
        } finally {
          sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_5, thread);
          sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
          sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
          sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
          sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** Modifier: marks all nodes accessible to NODE as marked, in the current search space. */
  @SubL(source = "cycl/sbhl/sbhl-marking-methods.lisp", position = 4461) 
  public static final SubLObject sbhl_mark_closure_as_marked(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
          || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym0$SBHL_CHECK_CUTOFF, thread);
            sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
          } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_0, thread);
          }
        }
      } else {
        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str17$Node__a_does_not_pass_sbhl_type_t, node, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
      return NIL;
    }
  }

  public static final class $sbhl_mark_closure_as_marked$UnaryFunction extends UnaryFunction {
    public $sbhl_mark_closure_as_marked$UnaryFunction() { super(extractFunctionNamed("SBHL-MARK-CLOSURE-AS-MARKED")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_mark_closure_as_marked(arg1); }
  }

  /** Modifier: Binds *sbhl-space* to SPACE and *sbhl-gather-space* to GATHER-SPACE and performs @see sbhl-mark-all-forward-true-nodes. */
  @SubL(source = "cycl/sbhl/sbhl-marking-methods.lisp", position = 4905) 
  public static final SubLObject sbhl_mark_forward_true_nodes_in_space(SubLObject module, SubLObject node, SubLObject space, SubLObject gather_space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    if ((gather_space == UNPROVIDED)) {
      gather_space = sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym5$SBHL_MODULE_P);
      {
        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
          sbhl_marking_vars.$sbhl_space$.bind(space, thread);
          sbhl_marking_vars.$sbhl_gather_space$.bind(gather_space, thread);
          sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
          sbhl_mark_all_forward_true_nodes(module, node, UNPROVIDED, UNPROVIDED);
        } finally {
          sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
          sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
          sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** Modifier: marks all nodes properly accessible to NODE as marked, thereby only marking NODE if it is part of a cycle. */
  @SubL(source = "cycl/sbhl/sbhl-marking-methods.lisp", position = 6447) 
  public static final SubLObject sbhl_mark_proper_closure_as_marked(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_module_utilities.sbhl_transitive_module_p(sbhl_search_vars.get_sbhl_search_module()))) {
        sbhl_search_utilities.sbhl_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.get_sbhl_tv(), sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread), $sym19$SBHL_MARK_CLOSURE_AS_MARKED, node, T, UNPROVIDED);
      } else {
        sbhl_mark_closure_as_marked(node);
      }
      return NIL;
    }
  }

  /** Modifier: unmarks all marked nodes accessible to NODE and pushes them onto the result if they pass the test FUNCTION. */
  @SubL(source = "cycl/sbhl/sbhl-marking-methods.lisp", position = 10443) 
  public static final SubLObject sbhl_unmark_marked_closure_and_gather_if(SubLObject node, SubLObject function) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
        SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_compose_fn$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
        try {
          sbhl_search_vars.$sbhl_unmarking_search_p$.bind(T, thread);
          sbhl_search_vars.$sbhl_compose_fn$.bind(function, thread);
          sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym23$SBHL_PUSH_ONTO_RESULT_IF, thread);
          if ((NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_vars.get_sbhl_search_module()))) {
            {
              SubLObject cdolist_list_var = sbhl_marking_utilities.sbhl_marked_with(node, UNPROVIDED);
              SubLObject pred = NIL;
              for (pred = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pred = cdolist_list_var.first()) {
                {
                  SubLObject _prev_bind_0_105 = sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.currentBinding(thread);
                  SubLObject _prev_bind_1_106 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                  try {
                    sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(pred)), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(Equality.eq(pred, $const1$genlInverse), thread);
                    sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
                  } finally {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_106, thread);
                    sbhl_search_vars.$sbhl_add_unmarked_node_to_result_test$.rebind(_prev_bind_0_105, thread);
                  }
                }
              }
            }
          } else {
            sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
          }
        } finally {
          sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2, thread);
          sbhl_search_vars.$sbhl_compose_fn$.rebind(_prev_bind_1, thread);
          sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  public static final SubLObject declare_sbhl_marking_methods_file() {
    //declareFunction(myName, "sbhl_premark_goal_nodes", "SBHL-PREMARK-GOAL-NODES", 1, 0, false);
    declareFunction(myName, "sbhl_premark_direction", "SBHL-PREMARK-DIRECTION", 1, 0, false);
    declareFunction(myName, "sbhl_premark_gather_nodes", "SBHL-PREMARK-GATHER-NODES", 1, 0, false);
    //declareFunction(myName, "sbhl_gather_premarked_justifications", "SBHL-GATHER-PREMARKED-JUSTIFICATIONS", 1, 0, false);
    declareFunction(myName, "sbhl_mark_all_forward_true_nodes", "SBHL-MARK-ALL-FORWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_mark_all_backward_true_nodes", "SBHL-MARK-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
    declareFunction(myName, "sbhl_mark_closure_as_marked", "SBHL-MARK-CLOSURE-AS-MARKED", 1, 0, false); new $sbhl_mark_closure_as_marked$UnaryFunction();
    //declareFunction(myName, "sbhl_mark_closure_in_space", "SBHL-MARK-CLOSURE-IN-SPACE", 2, 0, false);
    declareFunction(myName, "sbhl_mark_forward_true_nodes_in_space", "SBHL-MARK-FORWARD-TRUE-NODES-IN-SPACE", 2, 2, false);
    //declareFunction(myName, "sbhl_mark_backward_true_nodes_in_space", "SBHL-MARK-BACKWARD-TRUE-NODES-IN-SPACE", 2, 2, false);
    //declareFunction(myName, "sbhl_mark_proper_all_forward_true_nodes", "SBHL-MARK-PROPER-ALL-FORWARD-TRUE-NODES", 2, 2, false);
    declareFunction(myName, "sbhl_mark_proper_closure_as_marked", "SBHL-MARK-PROPER-CLOSURE-AS-MARKED", 1, 0, false);
    //declareFunction(myName, "sbhl_unmark_all_marked_forward_true_nodes", "SBHL-UNMARK-ALL-MARKED-FORWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_unmark_all_marked_backward_true_nodes", "SBHL-UNMARK-ALL-MARKED-BACKWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_unmark_marked_closure", "SBHL-UNMARK-MARKED-CLOSURE", 1, 0, false);
    //declareFunction(myName, "sbhl_unmark_initialized_marked_closure", "SBHL-UNMARK-INITIALIZED-MARKED-CLOSURE", 1, 0, false);
    //declareFunction(myName, "sbhl_unmark_proper_marked_closure", "SBHL-UNMARK-PROPER-MARKED-CLOSURE", 1, 0, false);
    //declareFunction(myName, "sbhl_unmark_all_backward_true_nodes_and_map", "SBHL-UNMARK-ALL-BACKWARD-TRUE-NODES-AND-MAP", 2, 0, false);
    //declareFunction(myName, "sbhl_unmark_marked_closure_and_gather", "SBHL-UNMARK-MARKED-CLOSURE-AND-GATHER", 1, 0, false);
    declareFunction(myName, "sbhl_unmark_marked_closure_and_gather_if", "SBHL-UNMARK-MARKED-CLOSURE-AND-GATHER-IF", 2, 0, false);
    //declareFunction(myName, "sbhl_unmark_marked_closure_and_mark_in_space", "SBHL-UNMARK-MARKED-CLOSURE-AND-MARK-IN-SPACE", 2, 0, false);
    //declareFunction(myName, "sbhl_unmark_marked_closure_and_unmark_in_space", "SBHL-UNMARK-MARKED-CLOSURE-AND-UNMARK-IN-SPACE", 2, 0, false);
    //declareFunction(myName, "sbhl_mark_cyclic_closure", "SBHL-MARK-CYCLIC-CLOSURE", 1, 0, false);
    //declareFunction(myName, "sbhl_unmark_cyclic_closure", "SBHL-UNMARK-CYCLIC-CLOSURE", 1, 0, false);
    //declareFunction(myName, "sbhl_mark_max_true_disjoins", "SBHL-MARK-MAX-TRUE-DISJOINS", 2, 2, false);
    //declareFunction(myName, "sbhl_mark_extremal_disjoins", "SBHL-MARK-EXTREMAL-DISJOINS", 1, 0, false);
    //declareFunction(myName, "sbhl_unmark_max_true_disjoins", "SBHL-UNMARK-MAX-TRUE-DISJOINS", 2, 2, false);
    //declareFunction(myName, "sbhl_unmark_extremal_disjoins", "SBHL-UNMARK-EXTREMAL-DISJOINS", 1, 0, false);
    //declareFunction(myName, "determine_sbhl_mark_between_consider_fn", "DETERMINE-SBHL-MARK-BETWEEN-CONSIDER-FN", 0, 0, false);
    //declareFunction(myName, "sbhl_mark_forward_true_nodes_between_and_all_their_inherited_nodes", "SBHL-MARK-FORWARD-TRUE-NODES-BETWEEN-AND-ALL-THEIR-INHERITED-NODES", 3, 2, false);
    //declareFunction(myName, "sbhl_unmark_marked_closure_and_target_mark_closure", "SBHL-UNMARK-MARKED-CLOSURE-AND-TARGET-MARK-CLOSURE", 1, 0, false);
    //declareFunction(myName, "sbhl_mark_closure_in_target_space", "SBHL-MARK-CLOSURE-IN-TARGET-SPACE", 1, 0, false);
    //declareFunction(myName, "sbhl_mark_node_and_instances_in_target_space", "SBHL-MARK-NODE-AND-INSTANCES-IN-TARGET-SPACE", 1, 0, false);
    //declareFunction(myName, "sbhl_record_closure", "SBHL-RECORD-CLOSURE", 3, 2, false);
    //declareFunction(myName, "sbhl_record_all_forward_true_nodes", "SBHL-RECORD-ALL-FORWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_record_all_backward_true_nodes", "SBHL-RECORD-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_record_max_true_disjoins", "SBHL-RECORD-MAX-TRUE-DISJOINS", 2, 2, false);
    //declareFunction(myName, "sbhl_unrecord_max_true_disjoins", "SBHL-UNRECORD-MAX-TRUE-DISJOINS", 2, 2, false);
    //declareFunction(myName, "sbhl_unrecord_all_recorded_forward_true_nodes", "SBHL-UNRECORD-ALL-RECORDED-FORWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "unrecord_all_superiors_as_unsearched_ignore_arg2", "UNRECORD-ALL-SUPERIORS-AS-UNSEARCHED-IGNORE-ARG2", 1, 1, false);
    //declareFunction(myName, "sbhl_record_node", "SBHL-RECORD-NODE", 1, 1, false);
    //declareFunction(myName, "sbhl_recorded_node_p", "SBHL-RECORDED-NODE-P", 1, 1, false);
    //declareFunction(myName, "sbhl_unrecorded_node_p", "SBHL-UNRECORDED-NODE-P", 1, 1, false);
    //declareFunction(myName, "sbhl_record_proper_all_forward_true_nodes", "SBHL-RECORD-PROPER-ALL-FORWARD-TRUE-NODES", 2, 2, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_marking_methods_file() {
    return NIL;
  }

  public static final SubLObject setup_sbhl_marking_methods_file() {
    // CVS_ID("Id: sbhl-marking-methods.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SBHL_CHECK_CUTOFF = makeSymbol("SBHL-CHECK-CUTOFF");
  public static final SubLObject $const1$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLSymbol $sym2$SBHL_NODE_IS_A_GOAL_NODE = makeSymbol("SBHL-NODE-IS-A-GOAL-NODE");
  public static final SubLSymbol $sym3$SBHL_NODE_IS_GOAL_NODE = makeSymbol("SBHL-NODE-IS-GOAL-NODE");
  public static final SubLSymbol $sym4$SBHL_CONSIDER_NODE = makeSymbol("SBHL-CONSIDER-NODE");
  public static final SubLSymbol $sym5$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLSymbol $sym6$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw7$ERROR = makeKeyword("ERROR");
  public static final SubLString $str8$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym9$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw10$CERROR = makeKeyword("CERROR");
  public static final SubLString $str11$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw12$WARN = makeKeyword("WARN");
  public static final SubLString $str13$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const14$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));
  public static final SubLSymbol $kw15$OLD = makeKeyword("OLD");
  public static final SubLSymbol $kw16$RESOURCE = makeKeyword("RESOURCE");
  public static final SubLString $str17$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLString $str18$marking_space____S__ = makeString("marking-space = ~S~%");
  public static final SubLSymbol $sym19$SBHL_MARK_CLOSURE_AS_MARKED = makeSymbol("SBHL-MARK-CLOSURE-AS-MARKED");
  public static final SubLSymbol $sym20$SBHL_UNMARK_INITIALIZED_MARKED_CLOSURE = makeSymbol("SBHL-UNMARK-INITIALIZED-MARKED-CLOSURE");
  public static final SubLSymbol $sym21$SBHL_APPLY_COMPOSE_FN = makeSymbol("SBHL-APPLY-COMPOSE-FN");
  public static final SubLSymbol $sym22$SBHL_PUSH_ONTO_RESULT = makeSymbol("SBHL-PUSH-ONTO-RESULT");
  public static final SubLSymbol $sym23$SBHL_PUSH_ONTO_RESULT_IF = makeSymbol("SBHL-PUSH-ONTO-RESULT-IF");
  public static final SubLSymbol $sym24$SBHL_APPLY_MARK_IN_SPACE = makeSymbol("SBHL-APPLY-MARK-IN-SPACE");
  public static final SubLSymbol $sym25$SBHL_APPLY_UNMARK_IN_SPACE = makeSymbol("SBHL-APPLY-UNMARK-IN-SPACE");
  public static final SubLSymbol $sym26$SBHL_MARK_IN_TARGET_SPACE = makeSymbol("SBHL-MARK-IN-TARGET-SPACE");
  public static final SubLSymbol $sym27$SBHL_MARK_IN_TARGET_GATHER_SPACE = makeSymbol("SBHL-MARK-IN-TARGET-GATHER-SPACE");
  public static final SubLString $str28$invalid_module_type__a = makeString("invalid module type ~a");
  public static final SubLSymbol $sym29$SBHL_MARK_CLOSURE_IN_TARGET_SPACE = makeSymbol("SBHL-MARK-CLOSURE-IN-TARGET-SPACE");
  public static final SubLSymbol $sym30$SBHL_MARK_NODE_AND_INSTANCES_IN_TARGET_SPACE = makeSymbol("SBHL-MARK-NODE-AND-INSTANCES-IN-TARGET-SPACE");
  public static final SubLString $str31$Error_in_direction__a = makeString("Error in direction ~a");
  public static final SubLSymbol $sym32$SBHL_PREDICATE_OBJECT_P = makeSymbol("SBHL-PREDICATE-OBJECT-P");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_marking_methods_file();
  }

  public void initializeVariables() {
    init_sbhl_marking_methods_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_marking_methods_file();
  }

}
