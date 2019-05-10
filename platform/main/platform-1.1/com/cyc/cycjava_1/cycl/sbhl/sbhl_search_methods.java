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

package  com.cyc.cycjava_1.cycl.sbhl;

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
import com.cyc.cycjava_1.cycl.cardinality_estimates;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava_1.cycl.keyhash_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.queues;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class sbhl_search_methods extends SubLTranslatedFile {

  //// Constructor

  private sbhl_search_methods() {}
  public static final SubLFile me = new sbhl_search_methods();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods";

  //// Definitions

  /** @return listp; all forward true nodes accessbile to NODE via MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 622) 
  public static final SubLObject sbhl_all_forward_true_nodes(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
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
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_4 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_5 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw2$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw5$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2204");
                                } else if (pcase_var.eql($kw7$WARN)) {
                                  Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_6 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                          SubLObject _prev_bind_1_7 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_8 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            {
                              SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                              {
                                SubLObject _prev_bind_0_9 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                  sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                  {
                                    SubLObject _prev_bind_0_10 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_12 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_13 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_3_14 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_4_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_16 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                SubLObject _prev_bind_1_17 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                SubLObject _prev_bind_2_18 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                                try {
                                                  sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                  sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym11$SBHL_PUSH_ONTO_RESULT, thread);
                                                  result = sbhl_transitive_closure(node);
                                                } finally {
                                                  sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2_18, thread);
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_17, thread);
                                                  sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_16, thread);
                                                }
                                              }
                                            } finally {
                                              if ((NIL != needs_to_releaseP)) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_15, thread);
                                          sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_14, thread);
                                          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_13, thread);
                                          sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_12, thread);
                                          sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_11, thread);
                                        }
                                      }
                                      if ((source == $kw12$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_10, thread);
                                    }
                                  }
                                  if ((source == $kw12$RESOURCE)) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                  }
                                } finally {
                                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_9, thread);
                                }
                              }
                            }
                          } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_8, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_7, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_6, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_5, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_4, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_3, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_2, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_1, thread);
                }
              }
            }
          } finally {
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


  
  /** Applies FUNCTION to each element of NODE's forward true closure, combining any non-nil result with *sbhl-result* using COMBINE-FN. @see sbhl-gather-closure */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 18010) 
  public static final SubLObject sbhl_gather_all_forward_true_nodes(SubLObject module, SubLObject node, SubLObject function, SubLObject mt, SubLObject tv, SubLObject combine_fn) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((combine_fn == UNPROVIDED)) {
      combine_fn = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject combiner = ((NIL != combine_fn) ? ((SubLObject) combine_fn) : sbhl_search_vars.$sbhl_combine_fn$.getDynamicValue(thread));
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_461 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_462 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_463 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_464 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_465 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw2$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw5$CERROR)) {
                                  sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw7$WARN)) {
                                  Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_466 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                          SubLObject _prev_bind_1_467 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_468 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            {
                              SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                              {
                                SubLObject _prev_bind_0_469 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                  sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                  {
                                    SubLObject _prev_bind_0_470 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_471 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_472 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_473 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_3_474 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_4_475 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                              if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                                                if ((!(function.isFunctionSpec()))) {
                                                  {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($kw2$ERROR)) {
                                                      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, function, $sym23$FUNCTION_SPEC_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else if (pcase_var.eql($kw5$CERROR)) {
                                                      sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $str6$continue_anyway, $str3$_A_is_not_a__A, function, $sym23$FUNCTION_SPEC_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else if (pcase_var.eql($kw7$WARN)) {
                                                      Errors.warn($str3$_A_is_not_a__A, function, $sym23$FUNCTION_SPEC_P);
                                                    } else {
                                                      Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                      Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, function, $sym23$FUNCTION_SPEC_P);
                                                    }
                                                  }
                                                }
                                              }
                                              {
                                                SubLObject _prev_bind_0_476 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                SubLObject _prev_bind_1_477 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                try {
                                                  sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                  result = sbhl_gather_closure(node, function, combiner);
                                                } finally {
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_477, thread);
                                                  sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_476, thread);
                                                }
                                              }
                                            } finally {
                                              if ((NIL != needs_to_releaseP)) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_475, thread);
                                          sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_474, thread);
                                          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_473, thread);
                                          sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_472, thread);
                                          sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_471, thread);
                                        }
                                      }
                                      if ((source == $kw12$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_470, thread);
                                    }
                                  }
                                  if ((source == $kw12$RESOURCE)) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                  }
                                } finally {
                                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_469, thread);
                                }
                              }
                            }
                          } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_468, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_467, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_466, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_465, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_464, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_463, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_462, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_461, thread);
                }
              }
            }
          } finally {
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


  /** @binds *sbhl-compose-fn*. @binds *sbhl-combine-fn*. @binds *sbhl-consider-node-fn*, to @see sbhl-apply-compose-fn-and-combine-with-result. Then performs @see sbhl-transitive-closure. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 19300) 
  public static final SubLObject sbhl_gather_closure(SubLObject node, SubLObject function, SubLObject combine_fn) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_compose_fn$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_combine_fn$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_compose_fn$.bind(function, thread);
            sbhl_search_vars.$sbhl_combine_fn$.bind(combine_fn, thread);
            sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym27$SBHL_APPLY_COMPOSE_FN_AND_COMBINE_WITH_RESULT, thread);
            result = sbhl_transitive_closure(node);
          } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_combine_fn$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_compose_fn$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  
  /** @return listp; all backward true nodes accessbile to NODE via MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 1625) 
  public static final SubLObject sbhl_all_backward_true_nodes(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
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
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_37 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_38 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_39 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_40 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_41 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw2$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw5$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2205");
                                } else if (pcase_var.eql($kw7$WARN)) {
                                  Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_42 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                          SubLObject _prev_bind_1_43 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_44 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            {
                              SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                              {
                                SubLObject _prev_bind_0_45 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                  sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                  {
                                    SubLObject _prev_bind_0_46 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_47 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_48 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_49 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_3_50 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_4_51 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_52 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                SubLObject _prev_bind_1_53 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                SubLObject _prev_bind_2_54 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                                try {
                                                  sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                  sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym11$SBHL_PUSH_ONTO_RESULT, thread);
                                                  result = sbhl_transitive_closure(node);
                                                } finally {
                                                  sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2_54, thread);
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_53, thread);
                                                  sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_52, thread);
                                                }
                                              }
                                            } finally {
                                              if ((NIL != needs_to_releaseP)) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_51, thread);
                                          sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_50, thread);
                                          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_49, thread);
                                          sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_48, thread);
                                          sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_47, thread);
                                        }
                                      }
                                      if ((source == $kw12$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_46, thread);
                                    }
                                  }
                                  if ((source == $kw12$RESOURCE)) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                  }
                                } finally {
                                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_45, thread);
                                }
                              }
                            }
                          } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_44, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_43, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_42, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_41, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_40, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_39, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_38, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_37, thread);
                }
              }
            }
          } finally {
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

  /** @return listp; the transitive closure of NODE with current search module, direction, and truth. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 2506) 
  public static final SubLObject sbhl_transitive_closure(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
            try {
              if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                  || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                {
                  SubLObject _prev_bind_0_73 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
                  try {
                    sbhl_search_vars.$sbhl_unmarking_search_p$.bind(NIL, thread);
                    sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
                  } finally {
                    sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_0_73, thread);
                  }
                }
              } else {
                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str15$Node__a_does_not_pass_sbhl_type_t, node, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
              }
            } finally {
              {
                SubLObject _prev_bind_0_74 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                  Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                  result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                } finally {
                  Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_74, thread);
                }
              }
            }
          } finally {
            sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @return listp; the max/summary MODULE relations for NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 6645) 
  public static final SubLObject sbhl_max_true_disjoins(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv) {
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
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_182 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_183 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_184 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_185 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_186 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw2$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw5$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2206");
                                } else if (pcase_var.eql($kw7$WARN)) {
                                  Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_187 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                          SubLObject _prev_bind_1_188 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_189 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            {
                              SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                              {
                                SubLObject _prev_bind_0_190 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                  sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                  {
                                    SubLObject _prev_bind_0_191 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_192 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_193 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_194 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_3_195 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_4_196 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_197 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                                SubLObject _prev_bind_1_198 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                try {
                                                  sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym11$SBHL_PUSH_ONTO_RESULT, thread);
                                                  sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                  try {
                                                    if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                                        || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                                                      result = sbhl_search_utilities.sbhl_sweep_and_gather_disjoins(node);
                                                    } else {
                                                      sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str15$Node__a_does_not_pass_sbhl_type_t, node, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                  } finally {
                                                    {
                                                      SubLObject _prev_bind_0_199 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                      try {
                                                        Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                        result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                      } finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_199, thread);
                                                      }
                                                    }
                                                  }
                                                } finally {
                                                  sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_1_198, thread);
                                                  sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_0_197, thread);
                                                }
                                              }
                                            } finally {
                                              if ((NIL != needs_to_releaseP)) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_196, thread);
                                          sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_195, thread);
                                          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_194, thread);
                                          sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_193, thread);
                                          sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_192, thread);
                                        }
                                      }
                                      if ((source == $kw12$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_191, thread);
                                    }
                                  }
                                  if ((source == $kw12$RESOURCE)) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                  }
                                } finally {
                                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_190, thread);
                                }
                              }
                            }
                          } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_189, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_188, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_187, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_186, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_185, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_184, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_183, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_182, thread);
                }
              }
            }
          } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
          }
        }
        result = sbhl_max_nodes(sbhl_module_utilities.get_sbhl_reductions_module(module), result, mt, tv, UNPROVIDED);
        return result;
      }
    }
  }

  /** Applies FUNCTION to each element of NODE's forward true transitive closure */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 11463) 
  public static final SubLObject sbhl_map_all_forward_true_nodes(SubLObject module, SubLObject node, SubLObject function, SubLObject mt, SubLObject tv) {
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
        SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
          sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
          sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
          sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
          sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
          sbhl_module_vars.$sbhl_module$.bind(module, thread);
          {
            SubLObject mt_var = mt;
            {
              SubLObject _prev_bind_0_277 = mt_relevance_macros.$mt$.currentBinding(thread);
              SubLObject _prev_bind_1_278 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
              SubLObject _prev_bind_2_279 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
              try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                {
                  SubLObject tv_var = tv;
                  {
                    SubLObject _prev_bind_0_280 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    SubLObject _prev_bind_1_281 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                      sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                      sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                      if ((NIL != tv_var)) {
                        if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                          if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            {
                              SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                              if (pcase_var.eql($kw2$ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                              } else if (pcase_var.eql($kw5$CERROR)) {
                                Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2207");
                              } else if (pcase_var.eql($kw7$WARN)) {
                                Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                              } else {
                                Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                              }
                            }
                          }
                        }
                      }
                      {
                        SubLObject _prev_bind_0_282 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                        SubLObject _prev_bind_1_283 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                        SubLObject _prev_bind_2_284 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                          sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                          sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                          {
                            SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                            {
                              SubLObject _prev_bind_0_285 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                              try {
                                sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                {
                                  SubLObject _prev_bind_0_286 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                  try {
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                    {
                                      SubLObject _prev_bind_0_287 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                      SubLObject _prev_bind_1_288 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                      SubLObject _prev_bind_2_289 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                      SubLObject _prev_bind_3_290 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                      SubLObject _prev_bind_4_291 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                                              if ((!(function.isFunctionSpec()))) {
                                                {
                                                  SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                  if (pcase_var.eql($kw2$ERROR)) {
                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, function, $sym23$FUNCTION_SPEC_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                  } else if (pcase_var.eql($kw5$CERROR)) {
                                                    Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2208");
                                                  } else if (pcase_var.eql($kw7$WARN)) {
                                                    Errors.warn($str3$_A_is_not_a__A, function, $sym23$FUNCTION_SPEC_P);
                                                  } else {
                                                    Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, function, $sym23$FUNCTION_SPEC_P);
                                                  }
                                                }
                                              }
                                            }
                                            {
                                              SubLObject _prev_bind_0_292 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                              SubLObject _prev_bind_1_293 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                              SubLObject _prev_bind_2_294 = sbhl_search_vars.$sbhl_compose_fn$.currentBinding(thread);
                                              SubLObject _prev_bind_3_295 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                                              SubLObject _prev_bind_4_296 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
                                              try {
                                                sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                sbhl_search_vars.$sbhl_compose_fn$.bind(function, thread);
                                                sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym24$SBHL_APPLY_COMPOSE_FN, thread);
                                                sbhl_search_vars.$sbhl_search_type$.bind($kw17$CLOSURE, thread);
                                                if (((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP())
                                                    || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) {
                                                  sbhl_search_utilities.apply_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_behavior(), node);
                                                } else {
                                                  sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str15$Node__a_does_not_pass_sbhl_type_t, node, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                              } finally {
                                                sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_4_296, thread);
                                                sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_3_295, thread);
                                                sbhl_search_vars.$sbhl_compose_fn$.rebind(_prev_bind_2_294, thread);
                                                sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_293, thread);
                                                sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_292, thread);
                                              }
                                            }
                                          } finally {
                                            if ((NIL != needs_to_releaseP)) {
                                              ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                            }
                                          }
                                        }
                                      } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_291, thread);
                                        sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_290, thread);
                                        sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_289, thread);
                                        sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_288, thread);
                                        sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_287, thread);
                                      }
                                    }
                                    if ((source == $kw12$RESOURCE)) {
                                      sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    }
                                  } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_286, thread);
                                  }
                                }
                                if ((source == $kw12$RESOURCE)) {
                                  sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                }
                              } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_285, thread);
                              }
                            }
                          }
                        } finally {
                          sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_284, thread);
                          sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_283, thread);
                          sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_282, thread);
                        }
                      }
                    } finally {
                      sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_281, thread);
                      sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_280, thread);
                    }
                  }
                }
              } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_279, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_278, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_277, thread);
              }
            }
          }
        } finally {
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

  /** Binds *sbhl-space* to SPACE and *sbhl-gather-space* to GATHER-SPACE and performs @see sbhl-map-all-forward-true-nodes. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 12804) 
  public static final SubLObject sbhl_map_and_mark_forward_true_nodes_in_space(SubLObject module, SubLObject node, SubLObject fn, SubLObject space, SubLObject gather_space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    if ((gather_space == UNPROVIDED)) {
      gather_space = sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
        try {
          sbhl_marking_vars.$sbhl_space$.bind(space, thread);
          sbhl_marking_vars.$sbhl_gather_space$.bind(gather_space, thread);
          sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(T, thread);
          sbhl_map_all_forward_true_nodes(module, node, fn, UNPROVIDED, UNPROVIDED);
        } finally {
          sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_2, thread);
          sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
          sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** Applies FUNCTION to each element of NODE's forward true closure, returning the first non-nil result. @see sbhl-gather-first-among-closure */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 19791) 
  public static final SubLObject sbhl_gather_first_among_all_forward_true_nodes(SubLObject module, SubLObject node, SubLObject fn, SubLObject mt, SubLObject tv, SubLObject combine_fn) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((combine_fn == UNPROVIDED)) {
      combine_fn = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject combiner = ((NIL != combine_fn) ? ((SubLObject) combine_fn) : sbhl_search_vars.$sbhl_combine_fn$.getDynamicValue(thread));
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_495 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_496 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_497 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_498 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_499 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw2$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw5$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2209");
                                } else if (pcase_var.eql($kw7$WARN)) {
                                  Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_500 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                          SubLObject _prev_bind_1_501 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_502 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            {
                              SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                              {
                                SubLObject _prev_bind_0_503 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                  sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                  {
                                    SubLObject _prev_bind_0_504 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_505 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_506 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_507 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_3_508 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_4_509 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                              if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                                                if ((!(fn.isFunctionSpec()))) {
                                                  {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($kw2$ERROR)) {
                                                      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, fn, $sym23$FUNCTION_SPEC_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else if (pcase_var.eql($kw5$CERROR)) {
                                                      Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2210");
                                                    } else if (pcase_var.eql($kw7$WARN)) {
                                                      Errors.warn($str3$_A_is_not_a__A, fn, $sym23$FUNCTION_SPEC_P);
                                                    } else {
                                                      Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                      Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, fn, $sym23$FUNCTION_SPEC_P);
                                                    }
                                                  }
                                                }
                                              }
                                              {
                                                SubLObject _prev_bind_0_510 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                SubLObject _prev_bind_1_511 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                try {
                                                  sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                  result = sbhl_gather_first_among_closure(node, fn, combiner);
                                                } finally {
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_511, thread);
                                                  sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_510, thread);
                                                }
                                              }
                                            } finally {
                                              if ((NIL != needs_to_releaseP)) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_509, thread);
                                          sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_508, thread);
                                          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_507, thread);
                                          sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_506, thread);
                                          sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_505, thread);
                                        }
                                      }
                                      if ((source == $kw12$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_504, thread);
                                    }
                                  }
                                  if ((source == $kw12$RESOURCE)) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                  }
                                } finally {
                                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_503, thread);
                                }
                              }
                            }
                          } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_502, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_501, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_500, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_499, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_498, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_497, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_496, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_495, thread);
                }
              }
            }
          } finally {
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

  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 22223) 
  public static final SubLObject sbhl_simply_gather_first_among_all_backward_true_nodes(SubLObject module, SubLObject node, SubLObject fn, SubLObject mt, SubLObject tv, SubLObject combine_fn) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((combine_fn == UNPROVIDED)) {
      combine_fn = sbhl_search_vars.$sbhl_combine_fn$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_549 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_550 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_551 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_552 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_553 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw2$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw5$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2211");
                                } else if (pcase_var.eql($kw7$WARN)) {
                                  Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_554 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                          SubLObject _prev_bind_1_555 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_556 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            {
                              SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                              {
                                SubLObject _prev_bind_0_557 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                  sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                  {
                                    SubLObject _prev_bind_0_558 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_559 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_560 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_561 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_3_562 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_4_563 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                              if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                                                if ((!(fn.isFunctionSpec()))) {
                                                  {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($kw2$ERROR)) {
                                                      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, fn, $sym23$FUNCTION_SPEC_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else if (pcase_var.eql($kw5$CERROR)) {
                                                      Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2212");
                                                    } else if (pcase_var.eql($kw7$WARN)) {
                                                      Errors.warn($str3$_A_is_not_a__A, fn, $sym23$FUNCTION_SPEC_P);
                                                    } else {
                                                      Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                      Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, fn, $sym23$FUNCTION_SPEC_P);
                                                    }
                                                  }
                                                }
                                              }
                                              {
                                                SubLObject _prev_bind_0_564 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                SubLObject _prev_bind_1_565 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                SubLObject _prev_bind_2_566 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                try {
                                                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(NIL, thread);
                                                  sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                  result = sbhl_gather_first_among_closure(node, fn, combine_fn);
                                                } finally {
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_2_566, thread);
                                                  sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_1_565, thread);
                                                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_0_564, thread);
                                                }
                                              }
                                            } finally {
                                              if ((NIL != needs_to_releaseP)) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_563, thread);
                                          sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_562, thread);
                                          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_561, thread);
                                          sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_560, thread);
                                          sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_559, thread);
                                        }
                                      }
                                      if ((source == $kw12$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_558, thread);
                                    }
                                  }
                                  if ((source == $kw12$RESOURCE)) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                  }
                                } finally {
                                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_557, thread);
                                }
                              }
                            }
                          } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_556, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_555, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_554, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_553, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_552, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_551, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_550, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_549, thread);
                }
              }
            }
          } finally {
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

  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 22704) 
  public static final SubLObject sbhl_gather_first_among_closure(SubLObject node, SubLObject compose_fn, SubLObject combine_fn) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_compose_fn$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_combine_fn$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_compose_fn$.bind(compose_fn, thread);
            sbhl_search_vars.$sbhl_combine_fn$.bind(combine_fn, thread);
            sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym19$SBHL_GATHER_FIRST_NON_NIL_RESULT, thread);
            result = sbhl_transitive_closure(node);
          } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_combine_fn$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_compose_fn$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 23512) 
  public static final SubLObject sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune(SubLObject module, SubLObject node, SubLObject fn, SubLObject mt, SubLObject tv, SubLObject combine_fn) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((combine_fn == UNPROVIDED)) {
      combine_fn = sbhl_search_vars.$sbhl_combine_fn$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_585 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_586 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_587 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_588 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_589 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw2$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw5$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2213");
                                } else if (pcase_var.eql($kw7$WARN)) {
                                  Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_590 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                          SubLObject _prev_bind_1_591 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_592 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            {
                              SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                              {
                                SubLObject _prev_bind_0_593 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                  sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                  {
                                    SubLObject _prev_bind_0_594 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_595 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_596 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_597 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_3_598 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_4_599 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                              if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                                                if ((!(fn.isFunctionSpec()))) {
                                                  {
                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                    if (pcase_var.eql($kw2$ERROR)) {
                                                      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, fn, $sym23$FUNCTION_SPEC_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else if (pcase_var.eql($kw5$CERROR)) {
                                                      Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2214");
                                                    } else if (pcase_var.eql($kw7$WARN)) {
                                                      Errors.warn($str3$_A_is_not_a__A, fn, $sym23$FUNCTION_SPEC_P);
                                                    } else {
                                                      Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                      Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, fn, $sym23$FUNCTION_SPEC_P);
                                                    }
                                                  }
                                                }
                                              }
                                              {
                                                SubLObject _prev_bind_0_600 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                SubLObject _prev_bind_1_601 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                SubLObject _prev_bind_2_602 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                try {
                                                  sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(NIL, thread);
                                                  sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                  result = sbhl_gather_first_among_closure_with_prune(node, fn, combine_fn);
                                                } finally {
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_2_602, thread);
                                                  sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_1_601, thread);
                                                  sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_0_600, thread);
                                                }
                                              }
                                            } finally {
                                              if ((NIL != needs_to_releaseP)) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_599, thread);
                                          sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_598, thread);
                                          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_597, thread);
                                          sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_596, thread);
                                          sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_595, thread);
                                        }
                                      }
                                      if ((source == $kw12$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_594, thread);
                                    }
                                  }
                                  if ((source == $kw12$RESOURCE)) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                  }
                                } finally {
                                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_593, thread);
                                }
                              }
                            }
                          } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_592, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_591, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_590, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_589, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_588, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_587, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_586, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_585, thread);
                }
              }
            }
          } finally {
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

  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 24015) 
  public static final SubLObject sbhl_gather_first_among_closure_with_prune(SubLObject node, SubLObject compose_fn, SubLObject combine_fn) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_compose_fn$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_combine_fn$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_compose_fn$.bind(compose_fn, thread);
            sbhl_search_vars.$sbhl_combine_fn$.bind(combine_fn, thread);
            sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym28$SBHL_GATHER_FIRST_NON_NIL_RESULT_WITH_PRUNE, thread);
            result = sbhl_transitive_closure(node);
          } finally {
            sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_combine_fn$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_compose_fn$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @return listp; Marks proper closures of nodes, noting cycles. Filters non-extremal cycles, and then unmarks the cyclic closure of the extremal cycles. All unmarked nodes are returned, as they are the extremal ones. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 26986) 
  public static final SubLObject sbhl_extremal_nodes(SubLObject nodes) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject unique_nodes = list_utilities.fast_delete_duplicates(nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        {
          SubLObject cdolist_list_var = unique_nodes;
          SubLObject node = NIL;
          for (node = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
            if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED))) {
              sbhl_marking_methods.sbhl_mark_proper_closure_as_marked(node);
              if ((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED))) {
                {
                  SubLObject _prev_bind_0 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                  try {
                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1496");
                  } finally {
                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0, thread);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject cdolist_list_var = unique_nodes;
          SubLObject node = NIL;
          for (node = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
            if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED))) {
              result = cons(node, result);
            }
          }
        }
        return result;
      }
    }
  }

  /** @return listp; the most superordinate among NODES. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 28012) 
  public static final SubLObject max_nodes_backward(SubLObject module, SubLObject nodes, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      if ((NIL != list_utilities.lengthLE(nodes, ONE_INTEGER, UNPROVIDED))) {
        return nodes;
      } else {
        {
          SubLObject result = NIL;
          {
            SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
            SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
              sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
              sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
              sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
              sbhl_module_vars.$sbhl_module$.bind(module, thread);
              {
                SubLObject mt_var = mt;
                {
                  SubLObject _prev_bind_0_671 = mt_relevance_macros.$mt$.currentBinding(thread);
                  SubLObject _prev_bind_1_672 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                  SubLObject _prev_bind_2_673 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                  try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    {
                      SubLObject tv_var = tv;
                      {
                        SubLObject _prev_bind_0_674 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        SubLObject _prev_bind_1_675 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                          sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                          if ((NIL != tv_var)) {
                            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                              if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                {
                                  SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                  if (pcase_var.eql($kw2$ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                  } else if (pcase_var.eql($kw5$CERROR)) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2215");
                                  } else if (pcase_var.eql($kw7$WARN)) {
                                    Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  } else {
                                    Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  }
                                }
                              }
                            }
                          }
                          {
                            SubLObject _prev_bind_0_676 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                            SubLObject _prev_bind_1_677 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            SubLObject _prev_bind_2_678 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            try {
                              sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                              sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                              sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                              {
                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                {
                                  SubLObject _prev_bind_0_679 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                  try {
                                    sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                    {
                                      SubLObject _prev_bind_0_680 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                      try {
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                        {
                                          SubLObject _prev_bind_0_681 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                          SubLObject _prev_bind_1_682 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                          SubLObject _prev_bind_2_683 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_3_684 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_4_685 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                  SubLObject _prev_bind_0_686 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                  SubLObject _prev_bind_1_687 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                  try {
                                                    sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                    result = sbhl_extremal_nodes(nodes);
                                                  } finally {
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_687, thread);
                                                    sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_686, thread);
                                                  }
                                                }
                                              } finally {
                                                if ((NIL != needs_to_releaseP)) {
                                                  ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                }
                                              }
                                            }
                                          } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_685, thread);
                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_684, thread);
                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_683, thread);
                                            sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_682, thread);
                                            sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_681, thread);
                                          }
                                        }
                                        if ((source == $kw12$RESOURCE)) {
                                          sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                        }
                                      } finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_680, thread);
                                      }
                                    }
                                    if ((source == $kw12$RESOURCE)) {
                                      sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                  } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_679, thread);
                                  }
                                }
                              }
                            } finally {
                              sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_678, thread);
                              sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_677, thread);
                              sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_676, thread);
                            }
                          }
                        } finally {
                          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_675, thread);
                          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_674, thread);
                        }
                      }
                    }
                  } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_673, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_672, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_671, thread);
                  }
                }
              }
            } finally {
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
  }

  /** @return listp; a list of lists. Each list is a group of nodes among NODES which are coextensional. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 28422) 
  public static final SubLObject sbhl_independent_cycles(SubLObject nodes) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cycles = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
          try {
            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            {
              SubLObject _prev_bind_0_688 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
              try {
                sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                sbhl_marking_utilities.sbhl_mark_nodes_in_target_space(nodes);
                {
                  SubLObject cdolist_list_var = nodes;
                  SubLObject node = NIL;
                  for (node = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
                    if ((NIL == list_utilities.tree_find(node, cycles, UNPROVIDED, UNPROVIDED))) {
                      {
                        SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        {
                          SubLObject _prev_bind_0_689 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                          try {
                            sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                            {
                              SubLObject _prev_bind_0_690 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                              try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                {
                                  SubLObject _prev_bind_0_691 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                  SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                  SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                  SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                  SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                        sbhl_marking_methods.sbhl_mark_proper_closure_as_marked(node);
                                        if ((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED))) {
                                          {
                                            SubLObject _prev_bind_0_692 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            try {
                                              sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                                              {
                                                SubLObject result = NIL;
                                                {
                                                  SubLObject _prev_bind_0_693 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                  try {
                                                    sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                    try {
                                                      sbhl_marking_methods.sbhl_unmark_marked_closure_and_gather_if(node, $sym31$SBHL_MARKED_IN_TARGET_SPACE_P);
                                                    } finally {
                                                      {
                                                        SubLObject _prev_bind_0_694 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                          Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                          result = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                        } finally {
                                                          Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_694, thread);
                                                        }
                                                      }
                                                    }
                                                  } finally {
                                                    sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_693, thread);
                                                  }
                                                }
                                                if ((NIL != result)) {
                                                  cycles = cons(result, cycles);
                                                }
                                              }
                                            } finally {
                                              sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_692, thread);
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
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_691, thread);
                                  }
                                }
                                if ((source == $kw12$RESOURCE)) {
                                  sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                              } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_690, thread);
                              }
                            }
                            if ((source == $kw12$RESOURCE)) {
                              sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                          } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_689, thread);
                          }
                        }
                      }
                    }
                  }
                }
                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
              } finally {
                sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_688, thread);
              }
            }
            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
          } finally {
            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0, thread);
          }
        }
        return cycles;
      }
    }
  }

  /** @return listp; the maximal nodes among NODES wrt module MODULE. checks to see if each node of NODES has any node subsuming it (and not coextensional) among the other nodes. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 29112) 
  public static final SubLObject max_nodes_forward(SubLObject module, SubLObject nodes, SubLObject mt, SubLObject tv) {
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
        SubLObject unique_nodes = list_utilities.fast_delete_duplicates(nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cycles = NIL;
        SubLObject visited_nodes = NIL;
        SubLObject max_nodes = NIL;
        if ((NIL != list_utilities.lengthLE(unique_nodes, ONE_INTEGER, UNPROVIDED))) {
          return unique_nodes;
        } else {
          {
            SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
            SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
              sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
              sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
              sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
              sbhl_module_vars.$sbhl_module$.bind(module, thread);
              {
                SubLObject mt_var = mt;
                {
                  SubLObject _prev_bind_0_695 = mt_relevance_macros.$mt$.currentBinding(thread);
                  SubLObject _prev_bind_1_696 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                  SubLObject _prev_bind_2_697 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                  try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    {
                      SubLObject tv_var = tv;
                      {
                        SubLObject _prev_bind_0_698 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        SubLObject _prev_bind_1_699 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                          sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                          if ((NIL != tv_var)) {
                            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                              if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                {
                                  SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                  if (pcase_var.eql($kw2$ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                  } else if (pcase_var.eql($kw5$CERROR)) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2216");
                                  } else if (pcase_var.eql($kw7$WARN)) {
                                    Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  } else {
                                    Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  }
                                }
                              }
                            }
                          }
                          {
                            SubLObject _prev_bind_0_700 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                            SubLObject _prev_bind_1_701 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            SubLObject _prev_bind_2_702 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            try {
                              sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                              sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                              sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                              {
                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                {
                                  SubLObject _prev_bind_0_703 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                  try {
                                    sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                    {
                                      SubLObject _prev_bind_0_704 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                      try {
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                        {
                                          SubLObject _prev_bind_0_705 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                          SubLObject _prev_bind_1_706 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                          SubLObject _prev_bind_2_707 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_3_708 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_4_709 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                  SubLObject _prev_bind_0_710 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                  SubLObject _prev_bind_1_711 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                  try {
                                                    sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                    cycles = sbhl_independent_cycles(unique_nodes);
                                                    {
                                                      SubLObject cdolist_list_var = unique_nodes;
                                                      SubLObject node = NIL;
                                                      for (node = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
                                                        {
                                                          SubLObject source_712 = sbhl_marking_vars.sbhl_new_space_source();
                                                          {
                                                            SubLObject _prev_bind_0_713 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                            try {
                                                              sbhl_marking_vars.$sbhl_space$.bind(((source_712 == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source_712)), thread);
                                                              {
                                                                SubLObject _prev_bind_0_714 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                                                try {
                                                                  sbhl_marking_vars.$sbhl_gather_space$.bind(((source_712 == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source_712)), thread);
                                                                  {
                                                                    SubLObject _prev_bind_0_715 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_716 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_717 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                                                    SubLObject _prev_bind_3_718 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                                                    SubLObject _prev_bind_4_719 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                      sbhl_search_vars.$sbhl_finishedP$.bind(NIL, thread);
                                                                      sbhl_search_vars.$sbhl_stop_search_pathP$.bind(NIL, thread);
                                                                      sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                                                                      sbhl_search_vars.$sbhl_nodes_previous_marking$.bind(NIL, thread);
                                                                      sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                      {
                                                                        SubLObject rw_lock_var_720 = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
                                                                        SubLObject needs_to_releaseP_721 = NIL;
                                                                        try {
                                                                          needs_to_releaseP_721 = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var_720);
                                                                          {
                                                                            SubLObject cyclic_nodes = conses_high.member(node, cycles, $sym32$MEMBER_, UNPROVIDED).first();
                                                                            SubLObject other_nodes = NIL;
                                                                            other_nodes = ((NIL != cyclic_nodes) ? ((SubLObject) conses_high.set_difference(unique_nodes, cyclic_nodes, UNPROVIDED, UNPROVIDED)) : Sequences.remove(node, unique_nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                            if ((NIL == subl_promotions.memberP(node, visited_nodes, UNPROVIDED, UNPROVIDED))) {
                                                                              visited_nodes = ConsesLow.nconc(conses_high.copy_list(cyclic_nodes), visited_nodes);
                                                                              if ((NIL == sbhl_path_from_node_to_any_of_nodes_p(node, other_nodes))) {
                                                                                if ((NIL != cyclic_nodes)) {
                                                                                  max_nodes = ConsesLow.nconc(conses_high.copy_list(cyclic_nodes), max_nodes);
                                                                                } else {
                                                                                  max_nodes = cons(node, max_nodes);
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        } finally {
                                                                          if ((NIL != needs_to_releaseP_721)) {
                                                                            ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var_720);
                                                                          }
                                                                        }
                                                                      }
                                                                    } finally {
                                                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_719, thread);
                                                                      sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_718, thread);
                                                                      sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_717, thread);
                                                                      sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_716, thread);
                                                                      sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_715, thread);
                                                                    }
                                                                  }
                                                                  if ((source_712 == $kw12$RESOURCE)) {
                                                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                  }
                                                                } finally {
                                                                  sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_714, thread);
                                                                }
                                                              }
                                                              if ((source_712 == $kw12$RESOURCE)) {
                                                                sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                              }
                                                            } finally {
                                                              sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_713, thread);
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  } finally {
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_711, thread);
                                                    sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_710, thread);
                                                  }
                                                }
                                              } finally {
                                                if ((NIL != needs_to_releaseP)) {
                                                  ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                }
                                              }
                                            }
                                          } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_709, thread);
                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_708, thread);
                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_707, thread);
                                            sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_706, thread);
                                            sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_705, thread);
                                          }
                                        }
                                        if ((source == $kw12$RESOURCE)) {
                                          sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                        }
                                      } finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_704, thread);
                                      }
                                    }
                                    if ((source == $kw12$RESOURCE)) {
                                      sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                  } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_703, thread);
                                  }
                                }
                              }
                            } finally {
                              sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_702, thread);
                              sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_701, thread);
                              sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_700, thread);
                            }
                          }
                        } finally {
                          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_699, thread);
                          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_698, thread);
                        }
                      }
                    }
                  } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_697, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_696, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_695, thread);
                  }
                }
              }
            } finally {
              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
              sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
              sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return max_nodes;
      }
    }
  }

  /** @return keywordp; whether to do max-nodes :forward or :backward */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 30438) 
  public static final SubLObject max_nodes_direction(SubLObject nodes) {
    {
      SubLObject others = Numbers.subtract(Sequences.length(nodes), ONE_INTEGER);
      SubLObject up_cost = ZERO_INTEGER;
      SubLObject down_cost = ZERO_INTEGER;
      SubLObject cdolist_list_var = nodes;
      SubLObject node = NIL;
      for (node = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
        down_cost = Numbers.add(down_cost, cardinality_estimates.spec_cardinality(node));
        up_cost = Numbers.add(up_cost, others, cardinality_estimates.genl_cardinality(node));
      }
      if (up_cost.numL(down_cost)) {
        return $kw33$FORWARD;
      } else {
        return $kw34$BACKWARD;
      }
    }
  }

  /** @return listp; the most subordinate among NODES. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 30844) 
  public static final SubLObject sbhl_min_nodes(SubLObject module, SubLObject nodes, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      nodes = list_utilities.fast_delete_duplicates(nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      if ((NIL != list_utilities.lengthLE(nodes, ONE_INTEGER, UNPROVIDED))) {
        return nodes;
      } else {
        {
          SubLObject result = NIL;
          {
            SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
            SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
              sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
              sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
              sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
              sbhl_module_vars.$sbhl_module$.bind(module, thread);
              {
                SubLObject mt_var = mt;
                {
                  SubLObject _prev_bind_0_722 = mt_relevance_macros.$mt$.currentBinding(thread);
                  SubLObject _prev_bind_1_723 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                  SubLObject _prev_bind_2_724 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                  try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    {
                      SubLObject tv_var = tv;
                      {
                        SubLObject _prev_bind_0_725 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        SubLObject _prev_bind_1_726 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                          sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                          if ((NIL != tv_var)) {
                            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                              if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                {
                                  SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                  if (pcase_var.eql($kw2$ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                  } else if (pcase_var.eql($kw5$CERROR)) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2217");
                                  } else if (pcase_var.eql($kw7$WARN)) {
                                    Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  } else {
                                    Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  }
                                }
                              }
                            }
                          }
                          {
                            SubLObject _prev_bind_0_727 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                            SubLObject _prev_bind_1_728 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            SubLObject _prev_bind_2_729 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            try {
                              sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                              sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                              sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                              {
                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                {
                                  SubLObject _prev_bind_0_730 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                  try {
                                    sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                    {
                                      SubLObject _prev_bind_0_731 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                      try {
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                        {
                                          SubLObject _prev_bind_0_732 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                          SubLObject _prev_bind_1_733 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                          SubLObject _prev_bind_2_734 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_3_735 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_4_736 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                  SubLObject _prev_bind_0_737 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                  SubLObject _prev_bind_1_738 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                  try {
                                                    sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                    result = sbhl_extremal_nodes(nodes);
                                                  } finally {
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_738, thread);
                                                    sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_737, thread);
                                                  }
                                                }
                                              } finally {
                                                if ((NIL != needs_to_releaseP)) {
                                                  ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                }
                                              }
                                            }
                                          } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_736, thread);
                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_735, thread);
                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_734, thread);
                                            sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_733, thread);
                                            sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_732, thread);
                                          }
                                        }
                                        if ((source == $kw12$RESOURCE)) {
                                          sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                        }
                                      } finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_731, thread);
                                      }
                                    }
                                    if ((source == $kw12$RESOURCE)) {
                                      sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                  } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_730, thread);
                                  }
                                }
                              }
                            } finally {
                              sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_729, thread);
                              sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_728, thread);
                              sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_727, thread);
                            }
                          }
                        } finally {
                          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_726, thread);
                          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_725, thread);
                        }
                      }
                    }
                  } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_724, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_723, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_722, thread);
                  }
                }
              }
            } finally {
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
  }

  /** @return listp; the most superordinate among NODES. DIRECTION :backward uses @see sbhl-extremal-nodes, and may be expensive. @hack DIRECTION :forward will clobber maximal cycles */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 31286) 
  public static final SubLObject sbhl_max_nodes(SubLObject module, SubLObject nodes, SubLObject mt, SubLObject tv, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    nodes = list_utilities.fast_delete_duplicates(nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    if ((NIL != list_utilities.singletonP(nodes))) {
      return nodes;
    }
    {
      SubLObject dir = ((NIL != direction) ? ((SubLObject) direction) : max_nodes_direction(nodes));
      SubLObject pcase_var = dir;
      if (pcase_var.eql($kw34$BACKWARD)) {
        return max_nodes_backward(module, nodes, mt, tv);
      } else if (pcase_var.eql($kw33$FORWARD)) {
        return max_nodes_forward(module, nodes, mt, tv);
      }
    }
    return NIL;
  }

  public static final class $sbhl_stop_at_horizon$UnaryFunction extends UnaryFunction {
    public $sbhl_stop_at_horizon$UnaryFunction() { super(extractFunctionNamed("SBHL-STOP-AT-HORIZON")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1658"); }
  }

  /** @return listp; the most superordinate nodes which are backward accessible by NODES. @see sbhl-floors. @see sbhl-max-nodes. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 39011) 
  public static final SubLObject sbhl_max_floors(SubLObject module, SubLObject nodes, SubLObject candidates, SubLObject mt, SubLObject tv, SubLObject direction) {
    if ((candidates == UNPROVIDED)) {
      candidates = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject min_nodes = sbhl_min_nodes(module, nodes, mt, tv);
      SubLObject floors = sbhl_floors(module, min_nodes, candidates, mt, tv);
      return sbhl_max_nodes(sbhl_module_utilities.get_sbhl_reductions_module(module), floors, mt, tv, direction);
    }
  }

  /** @return listp; the most superordinate nodes which are backward accessible by NODES. @see sbhl-floors. @see sbhl-max-nodes. prunes all cyclic nodes from result except those from NODES and CANDIDATES or keeps just one arbitrary node from each cycle. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 39468) 
  public static final SubLObject sbhl_max_floors_pruning_cycles(SubLObject module, SubLObject nodes, SubLObject candidates, SubLObject mt, SubLObject tv) {
    if ((candidates == UNPROVIDED)) {
      candidates = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    {
      SubLObject max_floors = sbhl_max_floors(module, nodes, candidates, mt, tv, UNPROVIDED);
      SubLObject cycle_preferred_members = ConsesLow.append(nodes, candidates);
      SubLObject result = NIL;
      result = sbhl_prune_unwanted_extremal_cycles(module, max_floors, cycle_preferred_members, mt, tv);
      return result;
    }
  }

  /** Does the pruning for @see sbhl-max-floors pruning-cycles. @hack roll this into a different max-floors implementation. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 40106) 
  public static final SubLObject sbhl_prune_unwanted_extremal_cycles(SubLObject module, SubLObject nodes, SubLObject cycle_preferred_members, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      if ((NIL == list_utilities.lengthG(nodes, ONE_INTEGER, UNPROVIDED))) {
        return nodes;
      }
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
          try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            {
              SubLObject _prev_bind_0_746 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
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
                    SubLObject _prev_bind_0_747 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1_748 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2_749 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                      mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                      mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                      mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                      {
                        SubLObject tv_var = tv;
                        {
                          SubLObject _prev_bind_0_750 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                          SubLObject _prev_bind_1_751 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if ((NIL != tv_var)) {
                              if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                                if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                  {
                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($kw2$ERROR)) {
                                      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else if (pcase_var.eql($kw5$CERROR)) {
                                      Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2218");
                                    } else if (pcase_var.eql($kw7$WARN)) {
                                      Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                    } else {
                                      Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                      Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                    }
                                  }
                                }
                              }
                            }
                            {
                              SubLObject _prev_bind_0_752 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                              SubLObject _prev_bind_1_753 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                              SubLObject _prev_bind_2_754 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                              try {
                                sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                {
                                  SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                  {
                                    SubLObject _prev_bind_0_755 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_756 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                        try {
                                          sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                          {
                                            SubLObject _prev_bind_0_757 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                            SubLObject _prev_bind_1_758 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                            SubLObject _prev_bind_2_759 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                            SubLObject _prev_bind_3_760 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                            SubLObject _prev_bind_4_761 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                    SubLObject _prev_bind_0_762 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_763 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                    try {
                                                      sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                      sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                      {
                                                        SubLObject cdolist_list_var = nodes;
                                                        SubLObject node = NIL;
                                                        for (node = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
                                                          if ((NIL == Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1489"))) {
                                                            {
                                                              SubLObject _prev_bind_0_764 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                              try {
                                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                                sbhl_marking_methods.sbhl_mark_proper_closure_as_marked(node);
                                                                if ((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(node, UNPROVIDED))) {
                                                                  {
                                                                    SubLObject cycle = NIL;
                                                                    SubLObject pushedP = NIL;
                                                                    {
                                                                      SubLObject _prev_bind_0_765 = sbhl_search_vars.$sbhl_result$.currentBinding(thread);
                                                                      try {
                                                                        sbhl_search_vars.$sbhl_result$.bind(NIL, thread);
                                                                        try {
                                                                          {
                                                                            SubLObject _prev_bind_0_766 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            try {
                                                                              sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_link_vars.get_sbhl_opposite_link_direction(), thread);
                                                                              Errors
																					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1501");
                                                                            } finally {
                                                                              sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_0_766, thread);
                                                                            }
                                                                          }
                                                                        } finally {
                                                                          {
                                                                            SubLObject _prev_bind_0_767 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                              Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                                                                              cycle = sbhl_search_vars.$sbhl_result$.getDynamicValue(thread);
                                                                            } finally {
                                                                              Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_767, thread);
                                                                            }
                                                                          }
                                                                        }
                                                                      } finally {
                                                                        sbhl_search_vars.$sbhl_result$.rebind(_prev_bind_0_765, thread);
                                                                      }
                                                                    }
                                                                    {
                                                                      SubLObject cdolist_list_var_768 = cycle;
                                                                      SubLObject cycle_node = NIL;
                                                                      for (cycle_node = cdolist_list_var_768.first(); (NIL != cdolist_list_var_768); cdolist_list_var_768 = cdolist_list_var_768.rest(), cycle_node = cdolist_list_var_768.first()) {
                                                                        Errors
																				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1479");
                                                                        if ((NIL != subl_promotions.memberP(cycle_node, cycle_preferred_members, UNPROVIDED, UNPROVIDED))) {
                                                                          pushedP = T;
                                                                          result = cons(cycle_node, result);
                                                                        }
                                                                      }
                                                                    }
                                                                    if ((NIL == pushedP)) {
                                                                      result = cons(node, result);
                                                                    }
                                                                  }
                                                                } else {
                                                                  result = cons(node, result);
                                                                }
                                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                              } finally {
                                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_764, thread);
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } finally {
                                                      sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_763, thread);
                                                      sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_762, thread);
                                                    }
                                                  }
                                                } finally {
                                                  if ((NIL != needs_to_releaseP)) {
                                                    ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                  }
                                                }
                                              }
                                            } finally {
                                              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_761, thread);
                                              sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_760, thread);
                                              sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_759, thread);
                                              sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_758, thread);
                                              sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_757, thread);
                                            }
                                          }
                                          if ((source == $kw12$RESOURCE)) {
                                            sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                          }
                                        } finally {
                                          sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_756, thread);
                                        }
                                      }
                                      if ((source == $kw12$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_755, thread);
                                    }
                                  }
                                }
                              } finally {
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_754, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_753, thread);
                                sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_752, thread);
                              }
                            }
                          } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_751, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_750, thread);
                          }
                        }
                      }
                    } finally {
                      mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_749, thread);
                      mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_748, thread);
                      mt_relevance_macros.$mt$.rebind(_prev_bind_0_747, thread);
                    }
                  }
                }
              } finally {
                sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_5, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_746, thread);
              }
            }
            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
          } finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @return listp; the nodes which are a member of the intersection of the backward true closures of each of NODES. If CANDIDATES are provided, the answer will subset them. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 42226) 
  public static final SubLObject sbhl_floors(SubLObject module, SubLObject nodes, SubLObject candidates, SubLObject mt, SubLObject tv) {
    if ((candidates == UNPROVIDED)) {
      candidates = NIL;
    }
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
        nodes = list_utilities.fast_delete_duplicates(nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == nodes)) {
          return NIL;
        } else if ((NIL == list_utilities.singletonP(nodes))) {
          {
            SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
            SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
              sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
              sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
              sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
              sbhl_module_vars.$sbhl_module$.bind(module, thread);
              {
                SubLObject mt_var = mt;
                {
                  SubLObject _prev_bind_0_786 = mt_relevance_macros.$mt$.currentBinding(thread);
                  SubLObject _prev_bind_1_787 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                  SubLObject _prev_bind_2_788 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                  try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    {
                      SubLObject tv_var = tv;
                      {
                        SubLObject _prev_bind_0_789 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        SubLObject _prev_bind_1_790 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                          sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                          if ((NIL != tv_var)) {
                            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                              if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                {
                                  SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                  if (pcase_var.eql($kw2$ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                  } else if (pcase_var.eql($kw5$CERROR)) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2219");
                                  } else if (pcase_var.eql($kw7$WARN)) {
                                    Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  } else {
                                    Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  }
                                }
                              }
                            }
                          }
                          {
                            SubLObject _prev_bind_0_791 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                            SubLObject _prev_bind_1_792 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            SubLObject _prev_bind_2_793 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            try {
                              sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                              sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                              sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                              {
                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                {
                                  SubLObject _prev_bind_0_794 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                  try {
                                    sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                    {
                                      SubLObject _prev_bind_0_795 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                      try {
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                        {
                                          SubLObject _prev_bind_0_796 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                          SubLObject _prev_bind_1_797 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                          SubLObject _prev_bind_2_798 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_3_799 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_4_800 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                  SubLObject _prev_bind_0_801 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                  SubLObject _prev_bind_1_802 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                  try {
                                                    sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                    result = Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1551");
                                                  } finally {
                                                    sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_802, thread);
                                                    sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_801, thread);
                                                  }
                                                }
                                              } finally {
                                                if ((NIL != needs_to_releaseP)) {
                                                  ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                }
                                              }
                                            }
                                          } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_800, thread);
                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_799, thread);
                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_798, thread);
                                            sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_797, thread);
                                            sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_796, thread);
                                          }
                                        }
                                        if ((source == $kw12$RESOURCE)) {
                                          sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                        }
                                      } finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_795, thread);
                                      }
                                    }
                                    if ((source == $kw12$RESOURCE)) {
                                      sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                  } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_794, thread);
                                  }
                                }
                              }
                            } finally {
                              sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_793, thread);
                              sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_792, thread);
                              sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_791, thread);
                            }
                          }
                        } finally {
                          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_790, thread);
                          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_789, thread);
                        }
                      }
                    }
                  } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_788, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_787, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_786, thread);
                  }
                }
              }
            } finally {
              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
              sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
              sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
            }
          }
        } else if ((NIL == candidates)) {
          if ((NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module))) {
            result = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1601");
          } else {
            result = nodes;
          }
        } else {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1577");
        }
        return result;
      }
    }
  }

  /** @return listp; the members of CANDIDATES which are accessible to NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 43183) 
  public static final SubLObject sbhl_predicate_relation_to_which(SubLObject module, SubLObject node, SubLObject candidates, SubLObject mt, SubLObject tv, SubLObject excl_link_node) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((excl_link_node == UNPROVIDED)) {
      excl_link_node = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_803 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_804 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_805 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_806 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_807 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw2$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw5$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2220");
                                } else if (pcase_var.eql($kw7$WARN)) {
                                  Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                } else {
                                  Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_808 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                          SubLObject _prev_bind_1_809 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_810 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            {
                              SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                              {
                                SubLObject _prev_bind_0_811 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                  sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                  {
                                    SubLObject _prev_bind_0_812 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_813 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_814 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_815 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_3_816 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_4_817 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                SubLObject _prev_bind_0_818 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                                SubLObject _prev_bind_1_819 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                                try {
                                                  sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                                  if ((NIL != excl_link_node)) {
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(excl_link_node, UNPROVIDED);
                                                  }
                                                  sbhl_marking_methods.sbhl_mark_closure_as_marked(node);
                                                  if ((NIL != excl_link_node)) {
                                                    sbhl_marking_utilities.sbhl_mark_node_unmarked(excl_link_node, UNPROVIDED);
                                                  }
                                                  {
                                                    SubLObject cdolist_list_var = candidates;
                                                    SubLObject candidate = NIL;
                                                    for (candidate = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), candidate = cdolist_list_var.first()) {
                                                      {
                                                        SubLObject _prev_bind_0_820 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                          sbhl_search_vars.$genl_inverse_mode_p$.bind(((sbhl_module_vars.get_sbhl_module_link_pred(module) == $const36$genlInverse) ? ((SubLObject) T) : NIL), thread);
                                                          if ((NIL != sbhl_marking_utilities.sbhl_marked_in_terminating_space_p(candidate))) {
                                                            result = cons(candidate, result);
                                                          }
                                                        } finally {
                                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_820, thread);
                                                        }
                                                      }
                                                    }
                                                  }
                                                } finally {
                                                  sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1_819, thread);
                                                  sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0_818, thread);
                                                }
                                              }
                                            } finally {
                                              if ((NIL != needs_to_releaseP)) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_817, thread);
                                          sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_816, thread);
                                          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_815, thread);
                                          sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_814, thread);
                                          sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_813, thread);
                                        }
                                      }
                                      if ((source == $kw12$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_812, thread);
                                    }
                                  }
                                  if ((source == $kw12$RESOURCE)) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                  }
                                } finally {
                                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_811, thread);
                                }
                              }
                            }
                          } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_810, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_809, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_808, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_807, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_806, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_805, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_804, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_803, thread);
                }
              }
            }
          } finally {
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

  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 44392) 
  public static final SubLObject sbhl_predicate_relation_to_which_excluding_link_node(SubLObject module, SubLObject node, SubLObject candidates, SubLObject excl_link_node, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym0$SBHL_MODULE_P);
    return sbhl_predicate_relation_to_which(module, node, candidates, mt, tv, excl_link_node);
  }

  /** @return booleanp; whether there is a forward true path from NODE1 to NODE2. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 52623) 
  public static final SubLObject sbhl_predicate_relation_p(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv) {
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
        SubLObject pred = sbhl_module_vars.get_sbhl_module_link_pred(module);
        SubLObject result = NIL;
        if ((NIL != sbhl_cache.sbhl_cache_use_possible_p(pred, node1, node2))) {
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
                result = sbhl_cache.sbhl_cached_predicate_relation_p(pred, node1, node2, UNPROVIDED);
              } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
              }
            }
          }
        } else {
          {
            SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
            SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
              sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
              sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
              sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
              sbhl_module_vars.$sbhl_module$.bind(module, thread);
              {
                SubLObject mt_var = mt;
                {
                  SubLObject _prev_bind_0_967 = mt_relevance_macros.$mt$.currentBinding(thread);
                  SubLObject _prev_bind_1_968 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                  SubLObject _prev_bind_2_969 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                  try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    {
                      SubLObject tv_var = tv;
                      {
                        SubLObject _prev_bind_0_970 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        SubLObject _prev_bind_1_971 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                          sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                          if ((NIL != tv_var)) {
                            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                              if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                {
                                  SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                  if (pcase_var.eql($kw2$ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                  } else if (pcase_var.eql($kw5$CERROR)) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2221");
                                  } else if (pcase_var.eql($kw7$WARN)) {
                                    Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  } else {
                                    Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  }
                                }
                              }
                            }
                          }
                          {
                            SubLObject _prev_bind_0_972 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                            SubLObject _prev_bind_1_973 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            SubLObject _prev_bind_2_974 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            try {
                              sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                              sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                              sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                              {
                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                {
                                  SubLObject _prev_bind_0_975 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                  try {
                                    sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                    {
                                      SubLObject _prev_bind_0_976 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                      try {
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                        {
                                          SubLObject _prev_bind_0_977 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                          SubLObject _prev_bind_1_978 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                          SubLObject _prev_bind_2_979 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_3_980 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_4_981 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                result = sbhl_path_from_node_to_node_p(node1, node2);
                                              } finally {
                                                if ((NIL != needs_to_releaseP)) {
                                                  ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                }
                                              }
                                            }
                                          } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_981, thread);
                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_980, thread);
                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_979, thread);
                                            sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_978, thread);
                                            sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_977, thread);
                                          }
                                        }
                                        if ((source == $kw12$RESOURCE)) {
                                          sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                        }
                                      } finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_976, thread);
                                      }
                                    }
                                    if ((source == $kw12$RESOURCE)) {
                                      sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                  } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_975, thread);
                                  }
                                }
                              }
                            } finally {
                              sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_974, thread);
                              sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_973, thread);
                              sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_972, thread);
                            }
                          }
                        } finally {
                          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_971, thread);
                          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_970, thread);
                        }
                      }
                    }
                  } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_969, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_968, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_967, thread);
                  }
                }
              }
            } finally {
              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
              sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
              sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return result;
      }
    }
  }

  /** @return booleanp; ensures no justification is done within @see sbhl-predicate-relation-p, and ensures that a new sbhl space is used */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 54466) 
  public static final SubLObject sbhl_non_justifying_predicate_relation_p(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv) {
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
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_justification_search_p$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_apply_unwind_function_p$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_marking_vars.$sbhl_suspend_new_spacesP$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_justification_search_p$.bind(NIL, thread);
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.bind(NIL, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(NIL, thread);
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.bind(NIL, thread);
            result = sbhl_predicate_relation_p(module, node1, node2, mt, tv);
          } finally {
            sbhl_marking_vars.$sbhl_suspend_new_spacesP$.rebind(_prev_bind_3, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_apply_unwind_function_p$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_justification_search_p$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @return booleanp; whether there is a forward true path from NODE1 to NODE2. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 56259) 
  public static final SubLObject sbhl_false_predicate_relation_p(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv) {
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
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_1015 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_1016 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_1017 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_1018 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_1019 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_false_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_false_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw2$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym13$SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw5$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2222");
                                } else if (pcase_var.eql($kw7$WARN)) {
                                  Errors.warn($str3$_A_is_not_a__A, tv_var, $sym13$SBHL_FALSE_TV_P);
                                } else {
                                  Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym13$SBHL_FALSE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_1020 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                          SubLObject _prev_bind_1_1021 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_1022 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($const14$False_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            {
                              SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                              {
                                SubLObject _prev_bind_0_1023 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                  sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                  {
                                    SubLObject _prev_bind_0_1024 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_1025 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_1026 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_1027 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_3_1028 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_4_1029 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                              result = sbhl_path_from_node_to_node_p(node1, node2);
                                            } finally {
                                              if ((NIL != needs_to_releaseP)) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_1029, thread);
                                          sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_1028, thread);
                                          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_1027, thread);
                                          sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_1026, thread);
                                          sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_1025, thread);
                                        }
                                      }
                                      if ((source == $kw12$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_1024, thread);
                                    }
                                  }
                                  if ((source == $kw12$RESOURCE)) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                  }
                                } finally {
                                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_1023, thread);
                                }
                              }
                            }
                          } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_1022, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_1021, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_1020, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_1019, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_1018, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_1017, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_1016, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_1015, thread);
                }
              }
            }
          } finally {
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

  /** @return booleanp; whether there is a backward true path from NODE1 to NODE2. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 56641) 
  public static final SubLObject sbhl_false_inverse_relation_p(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv) {
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
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_1030 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1_1031 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2_1032 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_1033 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_1034 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_false_tv()), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_false_tv_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw2$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym13$SBHL_FALSE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw5$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2223");
                                } else if (pcase_var.eql($kw7$WARN)) {
                                  Errors.warn($str3$_A_is_not_a__A, tv_var, $sym13$SBHL_FALSE_TV_P);
                                } else {
                                  Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym13$SBHL_FALSE_TV_P);
                                }
                              }
                            }
                          }
                        }
                        {
                          SubLObject _prev_bind_0_1035 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                          SubLObject _prev_bind_1_1036 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                          SubLObject _prev_bind_2_1037 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                          try {
                            sbhl_search_vars.$sbhl_search_truth$.bind($const14$False_JustificationTruth, thread);
                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                            {
                              SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                              {
                                SubLObject _prev_bind_0_1038 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                  sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                  {
                                    SubLObject _prev_bind_0_1039 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                      sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                      {
                                        SubLObject _prev_bind_0_1040 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                        SubLObject _prev_bind_1_1041 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                        SubLObject _prev_bind_2_1042 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_3_1043 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                        SubLObject _prev_bind_4_1044 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                              result = sbhl_path_from_node_to_node_p(node1, node2);
                                            } finally {
                                              if ((NIL != needs_to_releaseP)) {
                                                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_1044, thread);
                                          sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_1043, thread);
                                          sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_1042, thread);
                                          sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_1041, thread);
                                          sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_1040, thread);
                                        }
                                      }
                                      if ((source == $kw12$RESOURCE)) {
                                        sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                      }
                                    } finally {
                                      sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_1039, thread);
                                    }
                                  }
                                  if ((source == $kw12$RESOURCE)) {
                                    sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                  }
                                } finally {
                                  sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_1038, thread);
                                }
                              }
                            }
                          } finally {
                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_1037, thread);
                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_1036, thread);
                            sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_1035, thread);
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_1034, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_1033, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_1032, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_1031, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_1030, thread);
                }
              }
            }
          } finally {
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

  /** @return booleanp; whether there is a path from NODE1 to NODE2. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 57030) 
  public static final SubLObject sbhl_path_from_node_to_node_p(SubLObject node1, SubLObject node2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      inference_metrics.increment_sbhl_graph_attempt_historical_count();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_type$.bind($kw43$BOOLEAN, thread);
            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
            {
              SubLObject premarkingP = sbhl_search_utilities.sbhl_module_premarks_gather_nodes_p();
              SubLObject goal_fn = $sym44$SBHL_NODE_IS_GOAL_NODE;
              SubLObject goal_node = node2;
              SubLObject goal_space = sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread);
              if ((NIL != premarkingP)) {
                {
                  SubLObject _prev_bind_0_1045 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                  SubLObject _prev_bind_1_1046 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                  try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                    sbhl_search_vars.$genl_inverse_mode_p$.bind(((sbhl_module_utilities.get_sbhl_link_pred(sbhl_search_vars.get_sbhl_search_module()) == $const45$negationInverse) ? ((SubLObject) T) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                    sbhl_marking_methods.sbhl_premark_gather_nodes(goal_node);
                  } finally {
                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_1046, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_1045, thread);
                  }
                }
                goal_fn = $sym46$SBHL_NODE_MARKED_AS_GOAL_NODE;
                goal_space = sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread);
              }
              {
                SubLObject _prev_bind_0_1047 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                SubLObject _prev_bind_1_1048 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                SubLObject _prev_bind_2_1049 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_goal_node$.currentBinding(thread);
                SubLObject _prev_bind_4 = sbhl_marking_vars.$sbhl_goal_space$.currentBinding(thread);
                SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_unmarking_search_p$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_search_parent_marking$.bind(NIL, thread);
                  sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                  sbhl_search_vars.$sbhl_consider_node_fn$.bind(goal_fn, thread);
                  sbhl_search_vars.$sbhl_goal_node$.bind(goal_node, thread);
                  sbhl_marking_vars.$sbhl_goal_space$.bind(goal_space, thread);
                  sbhl_search_vars.$sbhl_unmarking_search_p$.bind(NIL, thread);
                  result = sbhl_transitive_closure(node1);
                } finally {
                  sbhl_search_vars.$sbhl_unmarking_search_p$.rebind(_prev_bind_5, thread);
                  sbhl_marking_vars.$sbhl_goal_space$.rebind(_prev_bind_4, thread);
                  sbhl_search_vars.$sbhl_goal_node$.rebind(_prev_bind_3, thread);
                  sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2_1049, thread);
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_1048, thread);
                  sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_0_1047, thread);
                }
              }
            }
          } finally {
            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_0, thread);
          }
        }
        if ((NIL != result)) {
          inference_metrics.increment_sbhl_graph_success_historical_count();
        }
        return result;
      }
    }
  }

  /**   */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 58695) 
  public static final SubLObject why_sbhl_relationP(SubLObject module, SubLObject node1, SubLObject node2, SubLObject mt, SubLObject tv, SubLObject behavior) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((behavior == UNPROVIDED)) {
      behavior = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym0$SBHL_MODULE_P);
      {
        SubLObject bool_fn = NIL;
        if (((NIL != sbhl_search_vars.sbhl_true_tv_p(tv))
            || ((NIL == tv)
               && (NIL != sbhl_search_vars.sbhl_true_tv_p(sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread)))))) {
          if (((NIL != sbhl_module_utilities.sbhl_simple_module_p(module))
              || (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)))) {
            bool_fn = $sym47$SBHL_PREDICATE_RELATION_P;
          } else if ((NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module))) {
            bool_fn = $sym49$SBHL_IMPLIED_DISJOINS_RELATION_P;
          } else if ((NIL != sbhl_module_utilities.sbhl_time_module_p(module))) {
          }
        } else if (((NIL != sbhl_search_vars.sbhl_false_tv_p(tv))
            || ((NIL == tv)
               && (NIL != sbhl_search_vars.sbhl_false_tv_p(sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread)))))) {
          if (((NIL != sbhl_module_utilities.sbhl_simple_module_p(module))
              || (NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module)))) {
            bool_fn = $sym50$SBHL_IMPLIED_FALSE_PREDICATE_RELATION_P;
          } else if ((NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module))) {
            bool_fn = $sym48$SBHL_FALSE_PREDICATE_RELATION_P;
          } else if ((NIL != sbhl_module_utilities.sbhl_time_module_p(module))) {
          }
        } else {
          sbhl_paranoia.sbhl_error(THREE_INTEGER, $str51$Invalid_TV_argument__a__or__sbhl_, tv, sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        if ((NIL != bool_fn)) {
          return sbhl_search_utilities.sbhl_handle_justification(bool_fn, module, node1, node2, mt, tv, behavior, UNPROVIDED);
        }
      }
      return NIL;
    }
  }

  /** @return booleanp; whether there is a path from NODE to any of NODES. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 61821) 
  public static final SubLObject sbhl_path_from_node_to_any_of_nodes_p(SubLObject node, SubLObject nodes) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
            sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            {
              SubLObject _prev_bind_0_1096 = sbhl_marking_vars.$sbhl_target_gather_space$.currentBinding(thread);
              try {
                sbhl_marking_vars.$sbhl_target_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                if ((NIL != sbhl_search_utilities.sbhl_module_premarks_gather_nodes_p())) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1649");
                } else {
                  sbhl_marking_utilities.sbhl_mark_nodes_in_target_space_gp(nodes);
                }
                {
                  SubLObject _prev_bind_0_1097 = sbhl_marking_vars.$sbhl_goal_space$.currentBinding(thread);
                  SubLObject _prev_bind_1_1098 = sbhl_search_vars.$sbhl_goal_node$.currentBinding(thread);
                  SubLObject _prev_bind_2_1099 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                  SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
                  try {
                    sbhl_marking_vars.$sbhl_goal_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                    sbhl_search_vars.$sbhl_goal_node$.bind(nodes, thread);
                    sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym46$SBHL_NODE_MARKED_AS_GOAL_NODE, thread);
                    sbhl_search_vars.$sbhl_search_type$.bind($kw43$BOOLEAN, thread);
                    result = sbhl_transitive_closure(node);
                  } finally {
                    sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_3, thread);
                    sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_2_1099, thread);
                    sbhl_search_vars.$sbhl_goal_node$.rebind(_prev_bind_1_1098, thread);
                    sbhl_marking_vars.$sbhl_goal_space$.rebind(_prev_bind_0_1097, thread);
                  }
                }
                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_gather_space$.getDynamicValue(thread));
              } finally {
                sbhl_marking_vars.$sbhl_target_gather_space$.rebind(_prev_bind_0_1096, thread);
              }
            }
            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
          } finally {
            sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @return booleanp; whether there is a forward true path from any of NODES to NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 63665) 
  public static final SubLObject sbhl_any_with_predicate_relation_p(SubLObject module, SubLObject nodes, SubLObject node, SubLObject mt, SubLObject tv) {
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
        SubLObject pred = sbhl_module_vars.get_sbhl_module_link_pred(module);
        SubLObject result = NIL;
        if ((NIL != sbhl_cache.sbhl_cache_use_possible_for_nodes_p(pred, nodes, node))) {
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
                if ((NIL == result)) {
                  {
                    SubLObject csome_list_var = nodes;
                    SubLObject subnode = NIL;
                    for (subnode = csome_list_var.first(); (!(((NIL != result)
                          || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), subnode = csome_list_var.first()) {
                      result = sbhl_cache.sbhl_cached_predicate_relation_p(pred, subnode, node, UNPROVIDED);
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
        } else {
          {
            SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
            SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
            SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
              sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
              sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
              sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
              sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
              sbhl_module_vars.$sbhl_module$.bind(module, thread);
              {
                SubLObject mt_var = mt;
                {
                  SubLObject _prev_bind_0_1116 = mt_relevance_macros.$mt$.currentBinding(thread);
                  SubLObject _prev_bind_1_1117 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                  SubLObject _prev_bind_2_1118 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                  try {
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                    {
                      SubLObject tv_var = tv;
                      {
                        SubLObject _prev_bind_0_1119 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        SubLObject _prev_bind_1_1120 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                          sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                          sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                          if ((NIL != tv_var)) {
                            if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                              if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                {
                                  SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                  if (pcase_var.eql($kw2$ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                  } else if (pcase_var.eql($kw5$CERROR)) {
                                    Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2224");
                                  } else if (pcase_var.eql($kw7$WARN)) {
                                    Errors.warn($str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  } else {
                                    Errors.warn($str8$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($str6$continue_anyway, $str3$_A_is_not_a__A, tv_var, $sym4$SBHL_TRUE_TV_P);
                                  }
                                }
                              }
                            }
                          }
                          {
                            SubLObject _prev_bind_0_1121 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                            SubLObject _prev_bind_1_1122 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            SubLObject _prev_bind_2_1123 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            try {
                              sbhl_search_vars.$sbhl_search_truth$.bind($const9$True_JustificationTruth, thread);
                              sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                              sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                              {
                                SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                                {
                                  SubLObject _prev_bind_0_1124 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                  try {
                                    sbhl_marking_vars.$sbhl_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                    {
                                      SubLObject _prev_bind_0_1125 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                      try {
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw10$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                        {
                                          SubLObject _prev_bind_0_1126 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                          SubLObject _prev_bind_1_1127 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                          SubLObject _prev_bind_2_1128 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_3_1129 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                          SubLObject _prev_bind_4_1130 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                result = sbhl_path_from_any_of_nodes_to_node_p(nodes, node);
                                              } finally {
                                                if ((NIL != needs_to_releaseP)) {
                                                  ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                                }
                                              }
                                            }
                                          } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_1130, thread);
                                            sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_1129, thread);
                                            sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_1128, thread);
                                            sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_1127, thread);
                                            sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_1126, thread);
                                          }
                                        }
                                        if ((source == $kw12$RESOURCE)) {
                                          sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                        }
                                      } finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_1125, thread);
                                      }
                                    }
                                    if ((source == $kw12$RESOURCE)) {
                                      sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    }
                                  } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_1124, thread);
                                  }
                                }
                              }
                            } finally {
                              sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_1123, thread);
                              sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_1122, thread);
                              sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_1121, thread);
                            }
                          }
                        } finally {
                          sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_1120, thread);
                          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_1119, thread);
                        }
                      }
                    }
                  } finally {
                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_1118, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_1117, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_1116, thread);
                  }
                }
              }
            } finally {
              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
              sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
              sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
              sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return result;
      }
    }
  }

  /** Modifier. Marks the forward closure of NODE in target space */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 64781) 
  public static final SubLObject sbhl_premark_node_closure(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        SubLObject _prev_bind_6 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
        SubLObject _prev_bind_7 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        SubLObject _prev_bind_8 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
        SubLObject _prev_bind_9 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
        SubLObject _prev_bind_10 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
          sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_premark_module(sbhl_search_vars.get_sbhl_search_module()), thread);
          sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_premark_module(sbhl_search_vars.get_sbhl_search_module())), thread);
          sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_premark_module(sbhl_search_vars.get_sbhl_search_module())), thread);
          sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
          sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_premark_module(sbhl_search_vars.get_sbhl_search_module()), thread);
          sbhl_search_vars.$sbhl_tv$.bind(sbhl_search_vars.sbhl_search_true_tv(), thread);
          sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
          sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_search_vars.get_sbhl_search_module()), thread);
          sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
          sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
          sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
          sbhl_marking_methods.sbhl_mark_closure_as_marked(node);
        } finally {
          sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_10, thread);
          sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_9, thread);
          sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_8, thread);
          sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_7, thread);
          sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_6, thread);
          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_5, thread);
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

  /** @return booleanp; whether there is a path from any of NODES to NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-methods.lisp", position = 65266) 
  public static final SubLObject sbhl_path_from_any_of_nodes_to_node_p(SubLObject nodes, SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_goal_node$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_type$.bind($kw43$BOOLEAN, thread);
            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
            sbhl_search_vars.$sbhl_goal_node$.bind(node, thread);
            if ((NIL != sbhl_search_utilities.sbhl_module_premarks_gather_nodes_p())) {
              {
                SubLObject _prev_bind_0_1146 = sbhl_marking_vars.$sbhl_target_space$.currentBinding(thread);
                try {
                  sbhl_marking_vars.$sbhl_target_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                  sbhl_premark_node_closure(node);
                  {
                    SubLObject _prev_bind_0_1147 = sbhl_marking_vars.$sbhl_goal_space$.currentBinding(thread);
                    SubLObject _prev_bind_1_1148 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                    try {
                      sbhl_marking_vars.$sbhl_goal_space$.bind(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread), thread);
                      sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym46$SBHL_NODE_MARKED_AS_GOAL_NODE, thread);
                      if ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))) {
                        {
                          SubLObject csome_list_var = nodes;
                          SubLObject start = NIL;
                          for (start = csome_list_var.first(); (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), start = csome_list_var.first()) {
                            result = sbhl_transitive_closure(start);
                          }
                        }
                      }
                    } finally {
                      sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_1_1148, thread);
                      sbhl_marking_vars.$sbhl_goal_space$.rebind(_prev_bind_0_1147, thread);
                    }
                  }
                  sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
                } finally {
                  sbhl_marking_vars.$sbhl_target_space$.rebind(_prev_bind_0_1146, thread);
                }
              }
            } else {
              {
                SubLObject _prev_bind_0_1149 = sbhl_search_vars.$sbhl_consider_node_fn$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_consider_node_fn$.bind($sym44$SBHL_NODE_IS_GOAL_NODE, thread);
                  if ((NIL == sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))) {
                    {
                      SubLObject csome_list_var = nodes;
                      SubLObject start = NIL;
                      for (start = csome_list_var.first(); (!(((NIL != sbhl_search_vars.$sbhl_finishedP$.getDynamicValue(thread))
                            || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), start = csome_list_var.first()) {
                        result = sbhl_transitive_closure(start);
                      }
                    }
                  }
                } finally {
                  sbhl_search_vars.$sbhl_consider_node_fn$.rebind(_prev_bind_0_1149, thread);
                }
              }
            }
          } finally {
            sbhl_search_vars.$sbhl_goal_node$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  public static final SubLObject declare_sbhl_search_methods_file() {
    declareFunction(myName, "sbhl_all_forward_true_nodes", "SBHL-ALL-FORWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_all_forward_false_nodes", "SBHL-ALL-FORWARD-FALSE-NODES", 2, 2, false);
    declareFunction(myName, "sbhl_all_backward_true_nodes", "SBHL-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_all_backward_false_nodes", "SBHL-ALL-BACKWARD-FALSE-NODES", 2, 2, false);
    declareFunction(myName, "sbhl_transitive_closure", "SBHL-TRANSITIVE-CLOSURE", 1, 0, false);
    //declareFunction(myName, "sbhl_all_forward_true_nodes_with_prune", "SBHL-ALL-FORWARD-TRUE-NODES-WITH-PRUNE", 3, 2, false);
    //declareFunction(myName, "sbhl_all_backward_true_nodes_with_prune", "SBHL-ALL-BACKWARD-TRUE-NODES-WITH-PRUNE", 3, 2, false);
    //declareFunction(myName, "sbhl_union_all_forward_true_nodes", "SBHL-UNION-ALL-FORWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_union_all_backward_true_nodes", "SBHL-UNION-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_union_nodes_transitive_closures", "SBHL-UNION-NODES-TRANSITIVE-CLOSURES", 1, 0, false);
    //declareFunction(myName, "sbhl_gather_dead_end_nodes", "SBHL-GATHER-DEAD-END-NODES", 1, 0, false);
    //declareFunction(myName, "sbhl_extremes", "SBHL-EXTREMES", 1, 0, false);
    //declareFunction(myName, "sbhl_leaf_nodes", "SBHL-LEAF-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_root_nodes", "SBHL-ROOT-NODES", 2, 2, false);
    declareFunction(myName, "sbhl_max_true_disjoins", "SBHL-MAX-TRUE-DISJOINS", 2, 2, false);
    //declareFunction(myName, "sbhl_min_asserted_false_disjoins", "SBHL-MIN-ASSERTED-FALSE-DISJOINS", 2, 2, false);
    //declareFunction(myName, "sbhl_min_implied_false_disjoins", "SBHL-MIN-IMPLIED-FALSE-DISJOINS", 2, 2, false);
    //declareFunction(myName, "sbhl_implied_min_false_disjoins", "SBHL-IMPLIED-MIN-FALSE-DISJOINS", 2, 2, false);
    //declareFunction(myName, "sbhl_gather_first_true_disjoin", "SBHL-GATHER-FIRST-TRUE-DISJOIN", 2, 2, false);
    //declareFunction(myName, "sbhl_sample_leaf_nodes", "SBHL-SAMPLE-LEAF-NODES", 2, 3, false);
    //declareFunction(myName, "sbhl_sample_different_leaf_nodes", "SBHL-SAMPLE-DIFFERENT-LEAF-NODES", 3, 3, false);
    //declareFunction(myName, "sbhl_sample_extremal_nodes", "SBHL-SAMPLE-EXTREMAL-NODES", 2, 1, false);
    declareFunction(myName, "sbhl_map_all_forward_true_nodes", "SBHL-MAP-ALL-FORWARD-TRUE-NODES", 3, 2, false);
    //declareFunction(myName, "sbhl_map_all_forward_true_nodes_if", "SBHL-MAP-ALL-FORWARD-TRUE-NODES-IF", 4, 2, false);
    declareFunction(myName, "sbhl_map_and_mark_forward_true_nodes_in_space", "SBHL-MAP-AND-MARK-FORWARD-TRUE-NODES-IN-SPACE", 3, 2, false);
    //declareFunction(myName, "sbhl_map_all_backward_true_nodes", "SBHL-MAP-ALL-BACKWARD-TRUE-NODES", 3, 2, false);
    //declareFunction(myName, "sbhl_simply_map_all_backward_true_nodes", "SBHL-SIMPLY-MAP-ALL-BACKWARD-TRUE-NODES", 3, 2, false);
    //declareFunction(myName, "sbhl_map_union_all_forward_true_nodes", "SBHL-MAP-UNION-ALL-FORWARD-TRUE-NODES", 3, 2, false);
    //declareFunction(myName, "sbhl_map_union_all_backward_true_nodes", "SBHL-MAP-UNION-ALL-BACKWARD-TRUE-NODES", 3, 2, false);
    //declareFunction(myName, "sbhl_simply_union_all_backward_true_nodes", "SBHL-SIMPLY-UNION-ALL-BACKWARD-TRUE-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_union_simply_all_backward_true_edges", "SBHL-UNION-SIMPLY-ALL-BACKWARD-TRUE-EDGES", 2, 2, false);
    //declareFunction(myName, "sbhl_simply_union_all_backward_true_nodes_such_that", "SBHL-SIMPLY-UNION-ALL-BACKWARD-TRUE-NODES-SUCH-THAT", 3, 2, false);
    //declareFunction(myName, "sbhl_gather_all_forward_true_nodes", "SBHL-GATHER-ALL-FORWARD-TRUE-NODES", 3, 3, false);
    //declareFunction(myName, "sbhl_gather_all_backward_true_nodes", "SBHL-GATHER-ALL-BACKWARD-TRUE-NODES", 3, 3, false);
    //declareFunction(myName, "sbhl_gather_closure", "SBHL-GATHER-CLOSURE", 3, 0, false);
    declareFunction(myName, "sbhl_gather_first_among_all_forward_true_nodes", "SBHL-GATHER-FIRST-AMONG-ALL-FORWARD-TRUE-NODES", 3, 3, false);
    //declareFunction(myName, "sbhl_gather_first_among_forward_true_nodes_in_space", "SBHL-GATHER-FIRST-AMONG-FORWARD-TRUE-NODES-IN-SPACE", 3, 3, false);
    //declareFunction(myName, "sbhl_gather_first_among_all_backward_true_nodes", "SBHL-GATHER-FIRST-AMONG-ALL-BACKWARD-TRUE-NODES", 3, 3, false);
    //declareFunction(myName, "sbhl_simply_gather_first_among_all_forward_true_nodes", "SBHL-SIMPLY-GATHER-FIRST-AMONG-ALL-FORWARD-TRUE-NODES", 3, 3, false);
    declareFunction(myName, "sbhl_simply_gather_first_among_all_backward_true_nodes", "SBHL-SIMPLY-GATHER-FIRST-AMONG-ALL-BACKWARD-TRUE-NODES", 3, 3, false);
    declareFunction(myName, "sbhl_gather_first_among_closure", "SBHL-GATHER-FIRST-AMONG-CLOSURE", 3, 0, false);
    //declareFunction(myName, "sbhl_simply_gather_first_among_all_forward_true_nodes_with_prune", "SBHL-SIMPLY-GATHER-FIRST-AMONG-ALL-FORWARD-TRUE-NODES-WITH-PRUNE", 3, 3, false);
    declareFunction(myName, "sbhl_simply_gather_first_among_all_backward_true_nodes_with_prune", "SBHL-SIMPLY-GATHER-FIRST-AMONG-ALL-BACKWARD-TRUE-NODES-WITH-PRUNE", 3, 3, false);
    declareFunction(myName, "sbhl_gather_first_among_closure_with_prune", "SBHL-GATHER-FIRST-AMONG-CLOSURE-WITH-PRUNE", 3, 0, false);
    //declareFunction(myName, "sbhl_all_forward_true_nodes_if", "SBHL-ALL-FORWARD-TRUE-NODES-IF", 3, 2, false);
    //declareFunction(myName, "sbhl_all_backward_true_nodes_if", "SBHL-ALL-BACKWARD-TRUE-NODES-IF", 3, 2, false);
    //declareFunction(myName, "sbhl_closure_if", "SBHL-CLOSURE-IF", 2, 0, false);
    //declareFunction(myName, "sbhl_all_forward_true_nodes_if_with_pruning", "SBHL-ALL-FORWARD-TRUE-NODES-IF-WITH-PRUNING", 3, 2, false);
    //declareFunction(myName, "sbhl_all_backward_true_nodes_if_with_pruning", "SBHL-ALL-BACKWARD-TRUE-NODES-IF-WITH-PRUNING", 3, 2, false);
    //declareFunction(myName, "sbhl_closure_if_and_stop_unless", "SBHL-CLOSURE-IF-AND-STOP-UNLESS", 2, 0, false);
    declareFunction(myName, "sbhl_extremal_nodes", "SBHL-EXTREMAL-NODES", 1, 0, false);
    declareFunction(myName, "max_nodes_backward", "MAX-NODES-BACKWARD", 2, 2, false);
    declareFunction(myName, "sbhl_independent_cycles", "SBHL-INDEPENDENT-CYCLES", 1, 0, false);
    declareFunction(myName, "max_nodes_forward", "MAX-NODES-FORWARD", 2, 2, false);
    declareFunction(myName, "max_nodes_direction", "MAX-NODES-DIRECTION", 1, 0, false);
    declareFunction(myName, "sbhl_min_nodes", "SBHL-MIN-NODES", 2, 2, false);
    declareFunction(myName, "sbhl_max_nodes", "SBHL-MAX-NODES", 2, 3, false);
    //declareFunction(myName, "sbhl_min_forward_true_link_nodes", "SBHL-MIN-FORWARD-TRUE-LINK-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_max_forward_true_link_nodes", "SBHL-MAX-FORWARD-TRUE-LINK-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_min_forward_false_link_nodes", "SBHL-MIN-FORWARD-FALSE-LINK-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_max_forward_false_link_nodes", "SBHL-MAX-FORWARD-FALSE-LINK-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_min_backward_true_link_nodes", "SBHL-MIN-BACKWARD-TRUE-LINK-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_max_backward_true_link_nodes", "SBHL-MAX-BACKWARD-TRUE-LINK-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_min_backward_false_link_nodes", "SBHL-MIN-BACKWARD-FALSE-LINK-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_max_backward_false_link_nodes", "SBHL-MAX-BACKWARD-FALSE-LINK-NODES", 2, 2, false);
    //declareFunction(myName, "sbhl_stop_at_horizon", "SBHL-STOP-AT-HORIZON", 1, 0, false); new $sbhl_stop_at_horizon$UnaryFunction();
    //declareFunction(myName, "sbhl_mark_closure_up_to_horizon", "SBHL-MARK-CLOSURE-UP-TO-HORIZON", 1, 0, false);
    //declareFunction(myName, "sbhl_common_horizon", "SBHL-COMMON-HORIZON", 1, 1, false);
    //declareFunction(myName, "sbhl_min_ceilings", "SBHL-MIN-CEILINGS", 2, 3, false);
    declareFunction(myName, "sbhl_max_floors", "SBHL-MAX-FLOORS", 2, 4, false);
    declareFunction(myName, "sbhl_max_floors_pruning_cycles", "SBHL-MAX-FLOORS-PRUNING-CYCLES", 2, 3, false);
    declareFunction(myName, "sbhl_prune_unwanted_extremal_cycles", "SBHL-PRUNE-UNWANTED-EXTREMAL-CYCLES", 3, 2, false);
    //declareFunction(myName, "sbhl_ceilings", "SBHL-CEILINGS", 2, 3, false);
    declareFunction(myName, "sbhl_floors", "SBHL-FLOORS", 2, 3, false);
    declareFunction(myName, "sbhl_predicate_relation_to_which", "SBHL-PREDICATE-RELATION-TO-WHICH", 3, 3, false);
    //declareFunction(myName, "sbhl_which_with_predicate_relation", "SBHL-WHICH-WITH-PREDICATE-RELATION", 3, 2, false);
    declareFunction(myName, "sbhl_predicate_relation_to_which_excluding_link_node", "SBHL-PREDICATE-RELATION-TO-WHICH-EXCLUDING-LINK-NODE", 4, 2, false);
    //declareFunction(myName, "sbhl_inverse_relation_to_which", "SBHL-INVERSE-RELATION-TO-WHICH", 3, 2, false);
    //declareFunction(myName, "sbhl_gather_first_target_marked_node", "SBHL-GATHER-FIRST-TARGET-MARKED-NODE", 1, 0, false);
    //declareFunction(myName, "sbhl_first_common_horizon", "SBHL-FIRST-COMMON-HORIZON", 2, 0, false);
    //declareFunction(myName, "sbhl_first_floor_of_node_pair", "SBHL-FIRST-FLOOR-OF-NODE-PAIR", 3, 2, false);
    //declareFunction(myName, "sbhl_first_ceiling_of_node_pair", "SBHL-FIRST-CEILING-OF-NODE-PAIR", 3, 2, false);
    //declareFunction(myName, "sbhl_forward_true_goals_with_no_path_from_nodes", "SBHL-FORWARD-TRUE-GOALS-WITH-NO-PATH-FROM-NODES", 3, 2, false);
    //declareFunction(myName, "sbhl_all_goals_with_no_path_from_nodes", "SBHL-ALL-GOALS-WITH-NO-PATH-FROM-NODES", 2, 0, false);
    //declareFunction(myName, "sbhl_all_forward_true_nodes_between", "SBHL-ALL-FORWARD-TRUE-NODES-BETWEEN", 3, 2, false);
    //declareFunction(myName, "sbhl_closure_between", "SBHL-CLOSURE-BETWEEN", 2, 0, false);
    //declareFunction(myName, "sbhl_all_forward_true_nodes_among", "SBHL-ALL-FORWARD-TRUE-NODES-AMONG", 3, 2, false);
    //declareFunction(myName, "sbhl_all_backward_true_nodes_among", "SBHL-ALL-BACKWARD-TRUE-NODES-AMONG", 3, 2, false);
    //declareFunction(myName, "sbhl_closure_among", "SBHL-CLOSURE-AMONG", 2, 0, false);
    //declareFunction(myName, "sbhl_gather_dependent_nodes", "SBHL-GATHER-DEPENDENT-NODES", 1, 0, false);
    //declareFunction(myName, "sbhl_push_dependent_nodes_onto_result", "SBHL-PUSH-DEPENDENT-NODES-ONTO-RESULT", 1, 0, false);
    //declareFunction(myName, "sbhl_check_target_marking_for_dependence", "SBHL-CHECK-TARGET-MARKING-FOR-DEPENDENCE", 1, 0, false);
    //declareFunction(myName, "sbhl_dependent_nodes", "SBHL-DEPENDENT-NODES", 1, 0, false);
    //declareFunction(myName, "sbhl_all_dependent_backward_true_nodes", "SBHL-ALL-DEPENDENT-BACKWARD-TRUE-NODES", 2, 2, false);
    declareFunction(myName, "sbhl_predicate_relation_p", "SBHL-PREDICATE-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_predicate_relation_in_space_p", "SBHL-PREDICATE-RELATION-IN-SPACE-P", 3, 2, false);
    declareFunction(myName, "sbhl_non_justifying_predicate_relation_p", "SBHL-NON-JUSTIFYING-PREDICATE-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_predicate_relation_within_multiple_searches_p", "SBHL-PREDICATE-RELATION-WITHIN-MULTIPLE-SEARCHES-P", 5, 0, false);
    //declareFunction(myName, "sbhl_inverse_relation_p", "SBHL-INVERSE-RELATION-P", 3, 2, false);
    declareFunction(myName, "sbhl_false_predicate_relation_p", "SBHL-FALSE-PREDICATE-RELATION-P", 3, 2, false);
    declareFunction(myName, "sbhl_false_inverse_relation_p", "SBHL-FALSE-INVERSE-RELATION-P", 3, 2, false);
    declareFunction(myName, "sbhl_path_from_node_to_node_p", "SBHL-PATH-FROM-NODE-TO-NODE-P", 2, 0, false);
    //declareFunction(myName, "sbhl_disjoins_relation_p", "SBHL-DISJOINS-RELATION-P", 3, 2, false);
    //declareFunction(myName, "why_sbhl_predicate_relation_p", "WHY-SBHL-PREDICATE-RELATION-P", 3, 3, false);
    //declareFunction(myName, "why_sbhl_false_predicate_relation_p", "WHY-SBHL-FALSE-PREDICATE-RELATION-P", 3, 3, false);
    declareFunction(myName, "why_sbhl_relationP", "WHY-SBHL-RELATION?", 3, 3, false);
    //declareFunction(myName, "sbhl_predicate_relation_with_any_p", "SBHL-PREDICATE-RELATION-WITH-ANY-P", 3, 2, false);
    //declareFunction(myName, "why_some_sbhl_predicate_relation_among_p", "WHY-SOME-SBHL-PREDICATE-RELATION-AMONG-P", 3, 3, false);
    //declareFunction(myName, "sbhl_inverse_relation_with_any_p", "SBHL-INVERSE-RELATION-WITH-ANY-P", 3, 2, false);
    //declareFunction(myName, "sbhl_false_predicate_relation_with_any_p", "SBHL-FALSE-PREDICATE-RELATION-WITH-ANY-P", 3, 2, false);
    //declareFunction(myName, "sbhl_premark_union_nodes_closures", "SBHL-PREMARK-UNION-NODES-CLOSURES", 1, 0, false);
    declareFunction(myName, "sbhl_path_from_node_to_any_of_nodes_p", "SBHL-PATH-FROM-NODE-TO-ANY-OF-NODES-P", 2, 0, false);
    //declareFunction(myName, "sbhl_disjoins_relation_with_any_p", "SBHL-DISJOINS-RELATION-WITH-ANY-P", 3, 2, false);
    //declareFunction(myName, "sbhl_predicate_relation_with_all_p", "SBHL-PREDICATE-RELATION-WITH-ALL-P", 3, 2, false);
    //declareFunction(myName, "sbhl_path_from_node_to_all_of_nodes_p", "SBHL-PATH-FROM-NODE-TO-ALL-OF-NODES-P", 2, 0, false);
    declareFunction(myName, "sbhl_any_with_predicate_relation_p", "SBHL-ANY-WITH-PREDICATE-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_any_with_false_inverse_relation_p", "SBHL-ANY-WITH-FALSE-INVERSE-RELATION-P", 3, 2, false);
    declareFunction(myName, "sbhl_premark_node_closure", "SBHL-PREMARK-NODE-CLOSURE", 1, 0, false);
    declareFunction(myName, "sbhl_path_from_any_of_nodes_to_node_p", "SBHL-PATH-FROM-ANY-OF-NODES-TO-NODE-P", 2, 0, false);
    //declareFunction(myName, "sbhl_any_with_disjoins_relation_p", "SBHL-ANY-WITH-DISJOINS-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_all_with_predicate_relation_p", "SBHL-ALL-WITH-PREDICATE-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_all_with_false_predicate_relation_p", "SBHL-ALL-WITH-FALSE-PREDICATE-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_all_with_false_inverse_relation_p", "SBHL-ALL-WITH-FALSE-INVERSE-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_path_from_all_of_nodes_to_node_p", "SBHL-PATH-FROM-ALL-OF-NODES-TO-NODE-P", 2, 0, false);
    //declareFunction(myName, "sbhl_all_with_disjoins_relation_p", "SBHL-ALL-WITH-DISJOINS-RELATION-P", 3, 2, false);
    //declareFunction(myName, "sbhl_predicate_relation_between_any_p", "SBHL-PREDICATE-RELATION-BETWEEN-ANY-P", 3, 2, false);
    //declareFunction(myName, "sbhl_path_from_any_of_nodes_to_any_of_nodes_p", "SBHL-PATH-FROM-ANY-OF-NODES-TO-ANY-OF-NODES-P", 2, 0, false);
    //declareFunction(myName, "sbhl_all_with_predicate_relation_with_any_p", "SBHL-ALL-WITH-PREDICATE-RELATION-WITH-ANY-P", 3, 2, false);
    //declareFunction(myName, "sbhl_path_from_all_of_nodes_to_any_of_nodes_p", "SBHL-PATH-FROM-ALL-OF-NODES-TO-ANY-OF-NODES-P", 2, 0, false);
    //declareFunction(myName, "sbhl_any_predicate_relation_with_all_p", "SBHL-ANY-PREDICATE-RELATION-WITH-ALL-P", 3, 2, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_search_methods_file() {
    return NIL;
  }

  public static final SubLObject setup_sbhl_search_methods_file() {
    // CVS_ID("Id: sbhl-search-methods.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLSymbol $sym1$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw2$ERROR = makeKeyword("ERROR");
  public static final SubLString $str3$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym4$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw5$CERROR = makeKeyword("CERROR");
  public static final SubLString $str6$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw7$WARN = makeKeyword("WARN");
  public static final SubLString $str8$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const9$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));
  public static final SubLSymbol $kw10$OLD = makeKeyword("OLD");
  public static final SubLSymbol $sym11$SBHL_PUSH_ONTO_RESULT = makeSymbol("SBHL-PUSH-ONTO-RESULT");
  public static final SubLSymbol $kw12$RESOURCE = makeKeyword("RESOURCE");
  public static final SubLSymbol $sym13$SBHL_FALSE_TV_P = makeSymbol("SBHL-FALSE-TV-P");
  public static final SubLObject $const14$False_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("False-JustificationTruth"));
  public static final SubLString $str15$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym16$SBHL_PUSH_ONTO_RESULT_WITH_PRUNE = makeSymbol("SBHL-PUSH-ONTO-RESULT-WITH-PRUNE");
  public static final SubLSymbol $kw17$CLOSURE = makeKeyword("CLOSURE");
  public static final SubLSymbol $sym18$SBHL_GATHER_DEAD_END_NODES = makeSymbol("SBHL-GATHER-DEAD-END-NODES");
  public static final SubLSymbol $sym19$SBHL_GATHER_FIRST_NON_NIL_RESULT = makeSymbol("SBHL-GATHER-FIRST-NON-NIL-RESULT");
  public static final SubLSymbol $sym20$SBHL_LEAF_INSTANCES_SWEEP = makeSymbol("SBHL-LEAF-INSTANCES-SWEEP");
  public static final SubLSymbol $sym21$SBHL_SIMPLE_TRUE_SEARCH_AND_UNWIND = makeSymbol("SBHL-SIMPLE-TRUE-SEARCH-AND-UNWIND");
  public static final SubLSymbol $sym22$QUEUE_EMPTY_P = makeSymbol("QUEUE-EMPTY-P");
  public static final SubLSymbol $sym23$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym24$SBHL_APPLY_COMPOSE_FN = makeSymbol("SBHL-APPLY-COMPOSE-FN");
  public static final SubLSymbol $sym25$SBHL_APPLY_COMPOSE_FN_IF = makeSymbol("SBHL-APPLY-COMPOSE-FN-IF");
  public static final SubLSymbol $sym26$SBHL_PUSH_UNWIND_ONTO_RESULT = makeSymbol("SBHL-PUSH-UNWIND-ONTO-RESULT");
  public static final SubLSymbol $sym27$SBHL_APPLY_COMPOSE_FN_AND_COMBINE_WITH_RESULT = makeSymbol("SBHL-APPLY-COMPOSE-FN-AND-COMBINE-WITH-RESULT");
  public static final SubLSymbol $sym28$SBHL_GATHER_FIRST_NON_NIL_RESULT_WITH_PRUNE = makeSymbol("SBHL-GATHER-FIRST-NON-NIL-RESULT-WITH-PRUNE");
  public static final SubLSymbol $sym29$SBHL_PUSH_ONTO_RESULT_IF = makeSymbol("SBHL-PUSH-ONTO-RESULT-IF");
  public static final SubLSymbol $sym30$SBHL_PUSH_ONTO_RESULT_IF_AND_STOP_UNLESS = makeSymbol("SBHL-PUSH-ONTO-RESULT-IF-AND-STOP-UNLESS");
  public static final SubLSymbol $sym31$SBHL_MARKED_IN_TARGET_SPACE_P = makeSymbol("SBHL-MARKED-IN-TARGET-SPACE-P");
  public static final SubLSymbol $sym32$MEMBER_ = makeSymbol("MEMBER?");
  public static final SubLSymbol $kw33$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $kw34$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $sym35$SBHL_STOP_AT_HORIZON = makeSymbol("SBHL-STOP-AT-HORIZON");
  public static final SubLObject $const36$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLSymbol $sym37$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym38$_ = makeSymbol("+");
  public static final SubLSymbol $sym39$GENL_CARDINALITY = makeSymbol("GENL-CARDINALITY");
  public static final SubLSymbol $sym40$SBHL_PUSH_DEPENDENT_NODES_ONTO_RESULT = makeSymbol("SBHL-PUSH-DEPENDENT-NODES-ONTO-RESULT");
  public static final SubLSymbol $sym41$SBHL_CHECK_TARGET_MARKING_FOR_DEPENDENCE = makeSymbol("SBHL-CHECK-TARGET-MARKING-FOR-DEPENDENCE");
  public static final SubLSymbol $sym42$SBHL_MARK_NODE_IN_PRECOMPUTE_SPACE = makeSymbol("SBHL-MARK-NODE-IN-PRECOMPUTE-SPACE");
  public static final SubLSymbol $kw43$BOOLEAN = makeKeyword("BOOLEAN");
  public static final SubLSymbol $sym44$SBHL_NODE_IS_GOAL_NODE = makeSymbol("SBHL-NODE-IS-GOAL-NODE");
  public static final SubLObject $const45$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLSymbol $sym46$SBHL_NODE_MARKED_AS_GOAL_NODE = makeSymbol("SBHL-NODE-MARKED-AS-GOAL-NODE");
  public static final SubLSymbol $sym47$SBHL_PREDICATE_RELATION_P = makeSymbol("SBHL-PREDICATE-RELATION-P");
  public static final SubLSymbol $sym48$SBHL_FALSE_PREDICATE_RELATION_P = makeSymbol("SBHL-FALSE-PREDICATE-RELATION-P");
  public static final SubLSymbol $sym49$SBHL_IMPLIED_DISJOINS_RELATION_P = makeSymbol("SBHL-IMPLIED-DISJOINS-RELATION-P");
  public static final SubLSymbol $sym50$SBHL_IMPLIED_FALSE_PREDICATE_RELATION_P = makeSymbol("SBHL-IMPLIED-FALSE-PREDICATE-RELATION-P");
  public static final SubLString $str51$Invalid_TV_argument__a__or__sbhl_ = makeString("Invalid TV argument ~a, or *sbhl-tv* ~a");
  public static final SubLSymbol $sym52$SBHL_PREDICATE_RELATION_WITH_ANY_P = makeSymbol("SBHL-PREDICATE-RELATION-WITH-ANY-P");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_search_methods_file();
  }

  public void initializeVariables() {
    init_sbhl_search_methods_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_search_methods_file();
  }

}
