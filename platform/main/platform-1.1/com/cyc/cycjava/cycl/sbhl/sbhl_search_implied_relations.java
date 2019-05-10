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

package  com.cyc.cycjava.cycl.sbhl;

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
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.subl_macros;

public  final class sbhl_search_implied_relations extends SubLTranslatedFile {

  //// Constructor

  private sbhl_search_implied_relations() {}
  public static final SubLFile me = new sbhl_search_implied_relations();
  public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations";

  //// Definitions

  /** @return function-spec-p */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 990) 
  public static final SubLObject get_sbhl_sibling_disjoint_closure_fn(SubLObject module) {
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
      if (pcase_var.eql($const1$genls)) {
        return $sym2$ALL_SDC;
      } else {
        return NIL;
      }
    }
  }

  /** @hack. the various sibling disjoint behaviors need modularization. */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 1357) 
  public static final SubLObject sbhl_all_sibling_disjoint_nodes(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject sd_closure_fn = get_sbhl_sibling_disjoint_closure_fn(module);
      SubLObject result = NIL;
      if ((NIL != sd_closure_fn)) {
        result = Functions.funcall(sd_closure_fn, node, mt);
      }
      return result;
    }
  }

  /** @return function-spec-p */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 1742) 
  public static final SubLObject get_sbhl_sibling_disjoint_max_nodes_fn(SubLObject module) {
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
      if (pcase_var.eql($const1$genls)) {
        return $sym3$MAX_SDC;
      } else {
        return NIL;
      }
    }
  }

  /** @hack. the various sibling disjoint behaviors need modularization. */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 2032) 
  public static final SubLObject sbhl_max_sibling_disjoint_nodes(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject sd_max_fn = get_sbhl_sibling_disjoint_max_nodes_fn(module);
      SubLObject result = NIL;
      if ((NIL != sd_max_fn)) {
        result = Functions.funcall(sd_max_fn, node, mt);
      }
      return result;
    }
  }

  /** @return function-spec-p */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 2407) 
  public static final SubLObject get_sbhl_sibling_disjoint_boolean_fn(SubLObject module) {
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
      if (pcase_var.eql($const1$genls)) {
        return $sym4$SDC_;
      } else {
        return NIL;
      }
    }
  }

  /** @hack. the various sibling disjoint behaviors need modularization. */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 2751) 
  public static final SubLObject sbhl_sibling_disjoint_relation_p(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject sd_boolean_fn = get_sbhl_sibling_disjoint_boolean_fn(module);
      SubLObject result = NIL;
      if ((NIL != sd_boolean_fn)) {
        result = Functions.funcall(sd_boolean_fn, node1, node2, mt);
      }
      return result;
    }
  }

  /** @return function-spec-p */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 3151) 
  public static final SubLObject get_sbhl_sibling_disjoint_any_boolean_fn(SubLObject module) {
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject pcase_var = sbhl_module_vars.get_sbhl_module_link_pred(module);
      if (pcase_var.eql($const1$genls)) {
        return $sym5$ANY_SDC_WRT_;
      } else {
        return NIL;
      }
    }
  }

  /** @hack. the various sibling disjoint behaviors need modularization. */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 3448) 
  public static final SubLObject sbhl_any_with_sibling_disjoint_relation_p(SubLObject module, SubLObject nodes1, SubLObject node2, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject sd_any_boolean_fn = get_sbhl_sibling_disjoint_any_boolean_fn(module);
      SubLObject result = NIL;
      if ((NIL != sd_any_boolean_fn)) {
        result = Functions.funcall(sd_any_boolean_fn, nodes1, node2, mt);
      }
      return result;
    }
  }

  /** @hack. could reuse spaces. gathers all disjoins and sibling disjoins. */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 11839) 
  public static final SubLObject sbhl_all_implied_disjoins(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
      SubLObject disjoin_nodes = NIL;
      SubLObject sibling_disjoins = NIL;
      disjoin_nodes = sbhl_search_methods.sbhl_all_forward_true_nodes(module, node, mt, tv);
      sibling_disjoins = sbhl_all_sibling_disjoint_nodes(tt_module, node, mt, tv);
      return conses_high.nunion(disjoin_nodes, sibling_disjoins, UNPROVIDED, UNPROVIDED);
    }
  }

  /** @hack. could reuse spaces. gathers all max disjoins and max sibling disjoins, and maximizes among these. */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 12362) 
  public static final SubLObject sbhl_implied_max_disjoins(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
      SubLObject max_disjoin_nodes = NIL;
      SubLObject max_sibling_disjoins = NIL;
      max_disjoin_nodes = sbhl_search_methods.sbhl_max_true_disjoins(module, node, mt, tv);
      max_sibling_disjoins = sbhl_max_sibling_disjoint_nodes(tt_module, node, mt, tv);
      return sbhl_search_methods.sbhl_max_nodes(tt_module, ConsesLow.nconc(max_disjoin_nodes, max_sibling_disjoins), mt, tv, UNPROVIDED);
    }
  }

  /** @return booleanp; whether NOT-NODE is disjoint with some spec of NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 12944) 
  public static final SubLObject sbhl_disjoins_relation_with_backward_nodes_p(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(module);
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(disjoins_module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(disjoins_module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(disjoins_module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(disjoins_module, thread);
            sbhl_search_vars.$sbhl_search_type$.bind($kw22$BOOLEAN, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_57 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_58 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_59 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_60 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_61 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
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
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2203");
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
                          SubLObject _prev_bind_0_62 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                          SubLObject _prev_bind_1_63 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_64 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            {
                              SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                              {
                                SubLObject _prev_bind_0_65 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                  sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                  {
                                    SubLObject _prev_bind_0_66 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_67 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_68 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_69 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_3_70 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_4_71 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                SubLObject premarkingP = sbhl_search_utilities.sbhl_module_premarks_gather_nodes_p();
                                                SubLObject goal_fn = $sym23$SBHL_NODE_IS_GOAL_NODE;
                                                SubLObject goal_node = not_node;
                                                SubLObject goal_space = sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
                                                if ((NIL != premarkingP)) {
                                                  {
                                                    SubLObject _prev_bind_0_72 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_73 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                      sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                                      sbhl_search_vars.$genl_inverse_mode_p$.bind(((sbhl_module_utilities.get_sbhl_link_pred(sbhl_search_vars.get_sbhl_search_module()) == $const24$negationInverse) ? ((SubLObject) T) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                      sbhl_marking_methods.sbhl_premark_gather_nodes(goal_node);
                                                    } finally {
                                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_73, thread);
                                                      sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_72, thread);
                                                    }
                                                  }
                                                  goal_fn = $sym25$SBHL_NODE_MARKED_AS_GOAL_NODE;
                                                  goal_space = sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
                                                }
                                                {
                                                  SubLObject _prev_bind_0_74 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                  SubLObject _prev_bind_1_75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                  SubLObject _prev_bind_2_76 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                                  SubLObject _prev_bind_3_77 = sbhl_search_vars.$sbhl_goal_node$.currentBinding(thread);
                                                  SubLObject _prev_bind_4_78 = sbhl_marking_vars.$sbhl_goal_space$.currentBinding(thread);
                                                  SubLObject _prev_bind_5_79 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                  try {
                                                    sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_search_vars.$sbhl_consider_node_fn$.bind(goal_fn, thread);
                                                    sbhl_search_vars.$sbhl_goal_node$.bind(goal_node, thread);
                                                    sbhl_marking_vars.$sbhl_goal_space$.bind(goal_space, thread);
                                                    sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                    try {
                                                      {
                                                        SubLObject _prev_bind_0_80 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                                                        try {
                                                          sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                          sbhl_search_utilities.sbhl_check_disjoins_of_all_backward_nodes(node);
                                                          sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                                                        } finally {
                                                          sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_80, thread);
                                                        }
                                                      }
                                                    } finally {
                                                      {
                                                        SubLObject _prev_bind_0_81 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                          Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                          result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                        } finally {
                                                          Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_81, thread);
                                                        }
                                                      }
                                                    }
                                                  } finally {
                                                    sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_5_79, thread);
                                                    sbhl_marking_vars.$sbhl_goal_space$.rebind(_prev_bind_4_78, thread);
                                                    sbhl_search_vars.$sbhl_goal_node$.rebind(_prev_bind_3_77, thread);
                                                    sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2_76, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_75, thread);
                                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_74, thread);
                                                  }
                                                }
                                              }
                                            } finally {
                                              if ((NIL != needs_to_releaseP)) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_71, thread);
                                          sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_70, thread);
                                          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_69, thread);
                                          sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_68, thread);
                                          sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_67, thread);
                                        }
                                      }
                                      if ((source == $kw11$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_66, thread);
                                    }
                                  }
                                  if ((source == $kw11$RESOURCE)) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                  }
                                } finally {
                                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_65, thread);
                                }
                              }
                            }
                          } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_64, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_63, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_62, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_61, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_60, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_59, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_58, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_57, thread);
                }
              }
            }
          } finally {
            sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_5, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @return booleanp; whether NOT-NODE is disjoint with some tt node of NODE. @hack */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 13579) 
  public static final SubLObject sbhl_disjoins_with_tt_nodes_relation_p(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
        SubLObject disjoins_module = sbhl_module_utilities.get_sbhl_disjoins_module(tt_module);
        SubLObject link_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
        SubLObject result = NIL;
        result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(disjoins_module, link_nodes, not_node, mt, tv);
        if (((NIL != sbhl_search_vars.sbhl_justification_search_p())
             && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2476");
          {
            SubLObject link_node = conses_high.second(sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread).first().first());
            sbhl_search_vars.$sbhl_justification_result$.setDynamicValue(cons(list(list(sbhl_module_vars.get_sbhl_module_link_pred(module), node, link_node), ((NIL != mt) ? ((SubLObject) mt) : mt_relevance_macros.$mt$.getDynamicValue(thread)), ((NIL != tv) ? ((SubLObject) sbhl_search_vars.sbhl_true_tv(tv)) : sbhl_search_vars.sbhl_search_true_tv())), sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread)), thread);
          }
        }
        return result;
      }
    }
  }

  /** @return booleanp; whether NOT-NODE is sibling disjoint with some spec of NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 15355) 
  public static final SubLObject sbhl_sibling_disjoint_relation_with_backward_nodes_p(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject sd_boolean_fn = get_sbhl_sibling_disjoint_boolean_fn(module);
      SubLObject result = NIL;
      if ((NIL != sd_boolean_fn)) {
        {
          SubLObject backward_nodes = sbhl_search_methods.sbhl_all_backward_true_nodes(module, node, mt, tv);
          SubLObject disjointP = NIL;
          if ((NIL == disjointP)) {
            {
              SubLObject csome_list_var = backward_nodes;
              SubLObject back_node = NIL;
              for (back_node = csome_list_var.first(); (!(((NIL != disjointP)
                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), back_node = csome_list_var.first()) {
                result = Functions.funcall(sd_boolean_fn, back_node, not_node, mt);
                if ((NIL != result)) {
                  disjointP = T;
                }
              }
            }
          }
        }
      }
      return result;
    }
  }

  /** @hack. we can reuse spaces rather than reinitiating searches for each link-node. returns whether NOT-NODE is disjoint with some tt node of NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 15961) 
  public static final SubLObject sbhl_sibling_disjoint_relation_tt_p(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject tt_module = sbhl_module_utilities.get_sbhl_transfers_through_module(module);
      SubLObject sd_boolean_fn = get_sbhl_sibling_disjoint_boolean_fn(tt_module);
      SubLObject link_nodes = sbhl_link_methods.sbhl_forward_true_link_nodes(module, node, mt, tv, UNPROVIDED);
      SubLObject result = NIL;
      if ((NIL == result)) {
        {
          SubLObject csome_list_var = link_nodes;
          SubLObject link_node = NIL;
          for (link_node = csome_list_var.first(); (!(((NIL != result)
                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), link_node = csome_list_var.first()) {
            result = Functions.funcall(sd_boolean_fn, link_node, not_node, mt);
          }
        }
      }
      return result;
    }
  }

  /** @hack. @return booleanp; whether NOT-NODE is known to have a false MODULE relation with NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 17876) 
  public static final SubLObject sbhl_implied_false_predicate_relation_p(SubLObject module, SubLObject node, SubLObject not_node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject coerced_tv = tv;
        SubLObject result = NIL;
        if ((NIL != sbhl_search_vars.sbhl_false_tv_p(tv))) {
          coerced_tv = sbhl_search_vars.sbhl_opposite_tv(tv);
        }
        if ((NIL != sbhl_module_utilities.sbhl_simple_module_p(module))) {
          result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, not_node, node, mt, tv);
          if ((!(((NIL != result)
                || ((NIL != sbhl_search_vars.sbhl_justification_search_p())
                   && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))))) {
            result = sbhl_disjoins_relation_with_backward_nodes_p(module, node, not_node, mt, coerced_tv);
          }
          if ((!(((NIL != result)
                || ((NIL != sbhl_search_vars.sbhl_justification_search_p())
                   && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))))) {
            if ((NIL != sbhl_search_vars.sbhl_justification_search_p())) {
              {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                  sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                  sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
                  result = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1708");
                } finally {
                  sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                  sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
                  sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                }
              }
            } else {
              result = sbhl_sibling_disjoint_relation_with_backward_nodes_p(module, node, not_node, mt, coerced_tv);
            }
          }
          return result;
        } else if ((NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module))) {
          result = sbhl_search_methods.sbhl_false_inverse_relation_p(module, not_node, node, mt, tv);
          if ((!(((NIL != result)
                || ((NIL != sbhl_search_vars.sbhl_justification_search_p())
                   && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))))) {
            result = sbhl_disjoins_with_tt_nodes_relation_p(module, node, not_node, mt, coerced_tv);
          }
          if ((!(((NIL != result)
                || ((NIL != sbhl_search_vars.sbhl_justification_search_p())
                   && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))))) {
            if ((NIL != sbhl_search_vars.sbhl_justification_search_p())) {
              {
                SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                  sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                  sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
                  result = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1707");
                } finally {
                  sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                  sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
                  sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                }
              }
            } else {
              result = sbhl_sibling_disjoint_relation_tt_p(module, node, not_node, mt, coerced_tv);
            }
          }
          return result;
        } else {
          sbhl_paranoia.sbhl_error(ONE_INTEGER, $str21$Method_only_valid_for_simple_and_, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
      }
    }
  }

  /** @hack. @return booleanp; whether NODE1 and NODE2 are disjoint wrt module relations. */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 21650) 
  public static final SubLObject sbhl_implied_disjoins_relation_p(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject result = NIL;
        if ((NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module))) {
          result = sbhl_search_methods.sbhl_predicate_relation_p(module, node1, node2, mt, tv);
          if ((!(((NIL != result)
                || ((NIL != sbhl_search_vars.sbhl_justification_search_p())
                   && (NIL != sbhl_search_vars.$sbhl_justification_result$.getDynamicValue(thread))))))) {
            {
              SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
              if ((NIL != sbhl_search_vars.sbhl_justification_search_p())) {
                {
                  SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
                  SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
                  SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                  try {
                    sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
                    result = Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1706");
                  } finally {
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
                    sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
                  }
                }
              } else {
                result = sbhl_sibling_disjoint_relation_p(tt_module, node1, node2, mt, tv);
              }
            }
            if ((NIL != sbhl_search_vars.sbhl_justification_search_p())) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2475");
            }
            return result;
          }
        } else {
          sbhl_paranoia.sbhl_error(ONE_INTEGER, $str27$Method_only_valid_for_disjoins_mo, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return result;
      }
    }
  }

  /** @hack. @return booleanp. @example any-disjoint-with? */
  @SubL(source = "cycl/sbhl/sbhl-search-implied-relations.lisp", position = 27442) 
  public static final SubLObject sbhl_any_with_implied_disjoins_relation_p(SubLObject module, SubLObject nodes, SubLObject node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject result = NIL;
      if ((NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module))) {
        result = sbhl_search_methods.sbhl_any_with_predicate_relation_p(module, nodes, node, mt, tv);
        if ((!(((NIL != result)
              || (NIL != sbhl_search_vars.sbhl_justification_search_p()))))) {
          {
            SubLObject tt_module = sbhl_module_utilities.get_sbhl_disjoins_search_tt_module(module);
            result = sbhl_any_with_sibling_disjoint_relation_p(tt_module, nodes, node, mt, tv);
          }
        }
        return result;
      } else {
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str27$Method_only_valid_for_disjoins_mo, module, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
      return result;
    }
  }

  public static final SubLObject declare_sbhl_search_implied_relations_file() {
    declareFunction(myName, "get_sbhl_sibling_disjoint_closure_fn", "GET-SBHL-SIBLING-DISJOINT-CLOSURE-FN", 1, 0, false);
    declareFunction(myName, "sbhl_all_sibling_disjoint_nodes", "SBHL-ALL-SIBLING-DISJOINT-NODES", 2, 2, false);
    declareFunction(myName, "get_sbhl_sibling_disjoint_max_nodes_fn", "GET-SBHL-SIBLING-DISJOINT-MAX-NODES-FN", 1, 0, false);
    declareFunction(myName, "sbhl_max_sibling_disjoint_nodes", "SBHL-MAX-SIBLING-DISJOINT-NODES", 2, 2, false);
    declareFunction(myName, "get_sbhl_sibling_disjoint_boolean_fn", "GET-SBHL-SIBLING-DISJOINT-BOOLEAN-FN", 1, 0, false);
    declareFunction(myName, "sbhl_sibling_disjoint_relation_p", "SBHL-SIBLING-DISJOINT-RELATION-P", 3, 2, false);
    declareFunction(myName, "get_sbhl_sibling_disjoint_any_boolean_fn", "GET-SBHL-SIBLING-DISJOINT-ANY-BOOLEAN-FN", 1, 0, false);
    declareFunction(myName, "sbhl_any_with_sibling_disjoint_relation_p", "SBHL-ANY-WITH-SIBLING-DISJOINT-RELATION-P", 3, 2, false);
    //declareFunction(myName, "get_sbhl_sibling_disjoint_any_boolean_any_fn", "GET-SBHL-SIBLING-DISJOINT-ANY-BOOLEAN-ANY-FN", 1, 0, false);
    //declareFunction(myName, "sbhl_sibling_disjoint_relation_between_any_p", "SBHL-SIBLING-DISJOINT-RELATION-BETWEEN-ANY-P", 3, 2, false);
    //declareFunction(myName, "get_sbhl_sibling_disjoint_justification_fn", "GET-SBHL-SIBLING-DISJOINT-JUSTIFICATION-FN", 1, 0, false);
    //declareFunction(myName, "sbhl_sibling_disjoint_justification", "SBHL-SIBLING-DISJOINT-JUSTIFICATION", 3, 2, false);
    //declareFunction(myName, "sbhl_disjoins_of_backward_closure", "SBHL-DISJOINS-OF-BACKWARD-CLOSURE", 2, 2, false);
    //declareFunction(myName, "sbhl_gather_all_disjoins", "SBHL-GATHER-ALL-DISJOINS", 1, 0, false);
    //declareFunction(myName, "sbhl_all_sibling_disjoint_nodes_of_backward_closure", "SBHL-ALL-SIBLING-DISJOINT-NODES-OF-BACKWARD-CLOSURE", 2, 2, false);
    //declareFunction(myName, "sbhl_disjoins_of_tt_closure", "SBHL-DISJOINS-OF-TT-CLOSURE", 2, 2, false);
    //declareFunction(myName, "sbhl_all_sibling_disjoint_nodes_of_tt", "SBHL-ALL-SIBLING-DISJOINT-NODES-OF-TT", 2, 2, false);
    //declareFunction(myName, "sbhl_tt_closure_of_disjoins", "SBHL-TT-CLOSURE-OF-DISJOINS", 2, 2, false);
    //declareFunction(myName, "sbhl_all_tt_nodes_of_sibling_disjoint_nodes", "SBHL-ALL-TT-NODES-OF-SIBLING-DISJOINT-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_all_implied_forward_false_nodes", "SBHL-ALL-IMPLIED-FORWARD-FALSE-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_all_implied_backward_false_nodes", "SBHL-ALL-IMPLIED-BACKWARD-FALSE-NODES", 2, 2, false);
    declareFunction(myName, "sbhl_all_implied_disjoins", "SBHL-ALL-IMPLIED-DISJOINS", 2, 2, false);
    declareFunction(myName, "sbhl_implied_max_disjoins", "SBHL-IMPLIED-MAX-DISJOINS", 2, 2, false);
    declareFunction(myName, "sbhl_disjoins_relation_with_backward_nodes_p", "SBHL-DISJOINS-RELATION-WITH-BACKWARD-NODES-P", 3, 2, false);
    declareFunction(myName, "sbhl_disjoins_with_tt_nodes_relation_p", "SBHL-DISJOINS-WITH-TT-NODES-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_sibling_disjoint_with_backward_nodes_justification", "SBHL-SIBLING-DISJOINT-WITH-BACKWARD-NODES-JUSTIFICATION", 3, 2, false);
    declareFunction(myName, "sbhl_sibling_disjoint_relation_with_backward_nodes_p", "SBHL-SIBLING-DISJOINT-RELATION-WITH-BACKWARD-NODES-P", 3, 2, false);
    declareFunction(myName, "sbhl_sibling_disjoint_relation_tt_p", "SBHL-SIBLING-DISJOINT-RELATION-TT-P", 3, 2, false);
    //declareFunction(myName, "sbhl_sibling_disjoint_tt_justification", "SBHL-SIBLING-DISJOINT-TT-JUSTIFICATION", 3, 2, false);
    //declareFunction(myName, "sbhl_argumentation_false_predicate_relation_p", "SBHL-ARGUMENTATION-FALSE-PREDICATE-RELATION-P", 3, 2, false);
    declareFunction(myName, "sbhl_implied_false_predicate_relation_p", "SBHL-IMPLIED-FALSE-PREDICATE-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_implied_false_inverse_relation_p", "SBHL-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 2, false);
    declareFunction(myName, "sbhl_implied_disjoins_relation_p", "SBHL-IMPLIED-DISJOINS-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_any_with_implied_false_inverse_relation_p", "SBHL-ANY-WITH-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_implied_false_predicate_relation_with_any_p", "SBHL-IMPLIED-FALSE-PREDICATE-RELATION-WITH-ANY-P", 3, 2, false);
    //declareFunction(myName, "sbhl_all_with_implied_false_inverse_relation_p", "SBHL-ALL-WITH-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 2, false);
    declareFunction(myName, "sbhl_any_with_implied_disjoins_relation_p", "SBHL-ANY-WITH-IMPLIED-DISJOINS-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_implied_disjoins_relation_between_any_p", "SBHL-IMPLIED-DISJOINS-RELATION-BETWEEN-ANY-P", 3, 2, false);
    //declareFunction(myName, "why_sbhl_implied_false_predicate_relation_p", "WHY-SBHL-IMPLIED-FALSE-PREDICATE-RELATION-P", 3, 3, false);
    //declareFunction(myName, "why_sbhl_implied_false_inverse_relation_p", "WHY-SBHL-IMPLIED-FALSE-INVERSE-RELATION-P", 3, 3, false);
    //declareFunction(myName, "why_sbhl_implied_disjoins_relation_p", "WHY-SBHL-IMPLIED-DISJOINS-RELATION-P", 3, 3, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_search_implied_relations_file() {
    return NIL;
  }

  public static final SubLObject setup_sbhl_search_implied_relations_file() {
    // CVS_ID("Id: sbhl-search-implied-relations.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLObject $const1$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym2$ALL_SDC = makeSymbol("ALL-SDC");
  public static final SubLSymbol $sym3$MAX_SDC = makeSymbol("MAX-SDC");
  public static final SubLSymbol $sym4$SDC_ = makeSymbol("SDC?");
  public static final SubLSymbol $sym5$ANY_SDC_WRT_ = makeSymbol("ANY-SDC-WRT?");
  public static final SubLSymbol $sym6$ANY_SDC_ANY_ = makeSymbol("ANY-SDC-ANY?");
  public static final SubLSymbol $sym7$WHY_SDC_ = makeSymbol("WHY-SDC?");
  public static final SubLSymbol $sym8$SBHL_GATHER_ALL_DISJOINS = makeSymbol("SBHL-GATHER-ALL-DISJOINS");
  public static final SubLObject $const9$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));
  public static final SubLSymbol $kw10$OLD = makeKeyword("OLD");
  public static final SubLSymbol $kw11$RESOURCE = makeKeyword("RESOURCE");
  public static final SubLSymbol $sym12$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw13$ERROR = makeKeyword("ERROR");
  public static final SubLString $str14$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym15$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw16$CERROR = makeKeyword("CERROR");
  public static final SubLString $str17$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw18$WARN = makeKeyword("WARN");
  public static final SubLString $str19$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str20$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str21$Method_only_valid_for_simple_and_ = makeString("Method only valid for simple and transfer-through modules, not ~a");
  public static final SubLSymbol $kw22$BOOLEAN = makeKeyword("BOOLEAN");
  public static final SubLSymbol $sym23$SBHL_NODE_IS_GOAL_NODE = makeSymbol("SBHL-NODE-IS-GOAL-NODE");
  public static final SubLObject $const24$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLSymbol $sym25$SBHL_NODE_MARKED_AS_GOAL_NODE = makeSymbol("SBHL-NODE-MARKED-AS-GOAL-NODE");
  public static final SubLSymbol $sym26$SBHL_PREDICATE_RELATION_P = makeSymbol("SBHL-PREDICATE-RELATION-P");
  public static final SubLString $str27$Method_only_valid_for_disjoins_mo = makeString("Method only valid for disjoins modules, not ~a");
  public static final SubLString $str28$Boolean_methods_using_ALL_are_cur = makeString("Boolean methods using ALL are currently unsupported for justifications.");
  public static final SubLSymbol $sym29$SBHL_IMPLIED_FALSE_PREDICATE_RELATION_P = makeSymbol("SBHL-IMPLIED-FALSE-PREDICATE-RELATION-P");
  public static final SubLSymbol $sym30$SBHL_IMPLIED_FALSE_INVERSE_RELATION_P = makeSymbol("SBHL-IMPLIED-FALSE-INVERSE-RELATION-P");
  public static final SubLSymbol $sym31$SBHL_IMPLIED_DISJOINS_RELATION_P = makeSymbol("SBHL-IMPLIED-DISJOINS-RELATION-P");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_search_implied_relations_file();
  }

  public void initializeVariables() {
    init_sbhl_search_implied_relations_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_search_implied_relations_file();
  }

}
