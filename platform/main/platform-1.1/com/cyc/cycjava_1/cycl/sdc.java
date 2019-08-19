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

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.*;
import java.util.Map.*;

import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.wff_macros;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class sdc extends SubLTranslatedFile {

  //// Constructor

  private sdc() {}
  public static final SubLFile me = new sdc();
  public static final String myName = "com.cyc.cycjava_1.cycl.sdc";

  //// Definitions

  /** should sdc module support (expensive) rule (-> (and (sdcException x y) (genls z y)) (sdcException x z))? */
  @SubL(source = "cycl/sdc.lisp", position = 2024) 
  public static SubLSymbol $sdc_exception_transfers_thru_specsP$ = null;

  /** should sdc module support (expensive) rule (-> (and (genls z x) (genls z y)) (sdcException x y)) */
  @SubL(source = "cycl/sdc.lisp", position = 2354) 
  public static SubLSymbol $sdc_common_spec_exceptionP$ = null;

  /** ignore sdc module while recomputing sbhl links? */
  @SubL(source = "cycl/sdc.lisp", position = 2577) 
  public static SubLSymbol $ignoring_sdcP$ = null;

  /** the genls of c1 during sd queries */
  @SubL(source = "cycl/sdc.lisp", position = 2765) 
  private static SubLSymbol $sd_c1_genls_space$ = null;

  /** the genls of c2 during sd quries */
  @SubL(source = "cycl/sdc.lisp", position = 2849) 
  private static SubLSymbol $sd_c2_genls_space$ = null;

  /** the isas or the genls of c1 durign sd queries */
  @SubL(source = "cycl/sdc.lisp", position = 2932) 
  private static SubLSymbol $sd_genls_isas_space$ = null;

  /** record of encountered sdc candidates and their exceptions */
  @SubL(source = "cycl/sdc.lisp", position = 3030) 
  private static SubLSymbol $sd_candidate_store$ = null;

  @SubL(source = "cycl/sdc.lisp", position = 3829) 
  public static final SubLObject any_isa_common_sdct(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject tv) {
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
        SubLObject exceptionP = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            {
              SubLObject tv_var = tv;
              {
                SubLObject _prev_bind_0_1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_1_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                  if ((NIL != tv_var)) {
                    if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                      if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        {
                          SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                          if (pcase_var.eql($kw6$ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          } else if (pcase_var.eql($kw9$CERROR)) {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2229");
                          } else if (pcase_var.eql($kw11$WARN)) {
                            Errors.warn($str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P);
                          } else {
                            Errors.warn($str12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str10$continue_anyway, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P);
                          }
                        }
                      }
                    }
                  }
                  {
                    SubLObject _prev_bind_0_3 = $sd_c1_genls_space$.currentBinding(thread);
                    try {
                      $sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                      {
                        SubLObject _prev_bind_0_4 = $sd_c2_genls_space$.currentBinding(thread);
                        try {
                          $sd_c2_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                          {
                            SubLObject _prev_bind_0_5 = $sd_genls_isas_space$.currentBinding(thread);
                            try {
                              $sd_genls_isas_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                              {
                                SubLObject _prev_bind_0_6 = $sd_candidate_store$.currentBinding(thread);
                                try {
                                  $sd_candidate_store$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                  sbhl_mark_sd_c1_genls_and_non_c2_genls_isas(c1, c2);
                                  {
                                    SubLObject _prev_bind_0_7 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    SubLObject _prev_bind_1_8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    SubLObject _prev_bind_2_9 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                    SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                    try {
                                      sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const13$genls), thread);
                                      sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const13$genls)), thread);
                                      sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const13$genls)), thread);
                                      sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                      sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const13$genls), thread);
                                      sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                      sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                      exceptionP = makeBoolean(((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c1, $sd_c2_genls_space$.getDynamicValue(thread)))
                                            || (NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c2, $sd_c1_genls_space$.getDynamicValue(thread)))));
                                    } finally {
                                      sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_6, thread);
                                      sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_5, thread);
                                      sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                      sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                      sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_9, thread);
                                      sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_8, thread);
                                      sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_7, thread);
                                    }
                                  }
                                  if ((NIL == exceptionP)) {
                                    if ((NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue(thread))) {
                                      {
                                        SubLObject _prev_bind_0_10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2_12 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                        SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                        try {
                                          sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const13$genls), thread);
                                          sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const13$genls)), thread);
                                          sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const13$genls)), thread);
                                          sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                          sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const13$genls), thread);
                                          sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                          sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                          if ((NIL == exceptionP)) {
                                            {
                                              SubLObject catch_var = NIL;
                                              try {
                                                {
                                                  SubLObject cdohash_table = $sd_c2_genls_space$.getDynamicValue(thread);
                                                  SubLObject c2_genl = NIL;
                                                  SubLObject val = NIL;
                                                  {
                                                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                                    try {
                                                      while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                                        final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                                        c2_genl = Hashtables.getEntryKey(cdohash_entry);
                                                        val = Hashtables.getEntryValue(cdohash_entry);
                                                        Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4756");
                                                        {
                                                          SubLObject exceptions = direct_sdc_exceptions(c2_genl, UNPROVIDED);
                                                          if ((NIL == exceptionP)) {
                                                            {
                                                              SubLObject csome_list_var = exceptions;
                                                              SubLObject exception = NIL;
                                                              for (exception = csome_list_var.first(); (!(((NIL != exceptionP)
                                                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), exception = csome_list_var.first()) {
                                                                if ((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(exception, $sd_c1_genls_space$.getDynamicValue(thread)))) {
                                                                  exceptionP = T;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } finally {
                                                      Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                                    }
                                                  }
                                                }
                                              } catch (Throwable ccatch_env_var) {
                                                catch_var = Errors.handleThrowable(ccatch_env_var, $kw14$DO_HASH_TABLE);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_6, thread);
                                          sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_5, thread);
                                          sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                          sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_12, thread);
                                          sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_11, thread);
                                          sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_10, thread);
                                        }
                                      }
                                    }
                                    if ((NIL == exceptionP)) {
                                      result = sbhl_gather_first_sd_or_store_sd_candidates(c2);
                                      if ((NIL == result)) {
                                        result = sbhl_determine_sd_path_with_no_exceptions(c1);
                                      }
                                    }
                                  }
                                  sbhl_marking_vars.free_sbhl_marking_space($sd_candidate_store$.getDynamicValue(thread));
                                } finally {
                                  $sd_candidate_store$.rebind(_prev_bind_0_6, thread);
                                }
                              }
                              sbhl_marking_vars.free_sbhl_marking_space($sd_genls_isas_space$.getDynamicValue(thread));
                            } finally {
                              $sd_genls_isas_space$.rebind(_prev_bind_0_5, thread);
                            }
                          }
                          sbhl_marking_vars.free_sbhl_marking_space($sd_c2_genls_space$.getDynamicValue(thread));
                        } finally {
                          $sd_c2_genls_space$.rebind(_prev_bind_0_4, thread);
                        }
                      }
                      sbhl_marking_vars.free_sbhl_marking_space($sd_c1_genls_space$.getDynamicValue(thread));
                    } finally {
                      $sd_c1_genls_space$.rebind(_prev_bind_0_3, thread);
                    }
                  }
                } finally {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_2, thread);
                  sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_1, thread);
                }
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

  @SubL(source = "cycl/sdc.lisp", position = 7551) 
  public static final SubLObject any_isa_common_sdct_among(SubLObject c1s, SubLObject c2, SubLObject mt, SubLObject tv) {
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
        SubLObject result2 = NIL;
        SubLObject exceptionP = NIL;
        SubLObject mt_var = mt;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
          try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            {
              SubLObject tv_var = tv;
              {
                SubLObject _prev_bind_0_13 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_1_14 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                  if ((NIL != tv_var)) {
                    if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                      if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        {
                          SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                          if (pcase_var.eql($kw6$ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          } else if (pcase_var.eql($kw9$CERROR)) {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2230");
                          } else if (pcase_var.eql($kw11$WARN)) {
                            Errors.warn($str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P);
                          } else {
                            Errors.warn($str12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str10$continue_anyway, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_TRUE_TV_P);
                          }
                        }
                      }
                    }
                  }
                  {
                    SubLObject _prev_bind_0_15 = $sd_c1_genls_space$.currentBinding(thread);
                    try {
                      $sd_c1_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                      {
                        SubLObject _prev_bind_0_16 = $sd_c2_genls_space$.currentBinding(thread);
                        try {
                          $sd_c2_genls_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                          {
                            SubLObject _prev_bind_0_17 = $sd_genls_isas_space$.currentBinding(thread);
                            try {
                              $sd_genls_isas_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                              {
                                SubLObject _prev_bind_0_18 = $sd_candidate_store$.currentBinding(thread);
                                try {
                                  $sd_candidate_store$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                  c1s = sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas(c1s, c2);
                                  if ((NIL == c1s)) {
                                    exceptionP = T;
                                  }
                                  if ((NIL == exceptionP)) {
                                    if ((NIL != $sdc_exception_transfers_thru_specsP$.getDynamicValue(thread))) {
                                      {
                                        SubLObject _prev_bind_0_19 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        SubLObject _prev_bind_1_20 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        SubLObject _prev_bind_2_21 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
                                        SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
                                        try {
                                          sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const13$genls), thread);
                                          sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const13$genls)), thread);
                                          sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const13$genls)), thread);
                                          sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                          sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const13$genls), thread);
                                          sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
                                          sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
                                          if ((NIL == exceptionP)) {
                                            {
                                              SubLObject catch_var = NIL;
                                              try {
                                                {
                                                  SubLObject cdohash_table = $sd_c2_genls_space$.getDynamicValue(thread);
                                                  SubLObject c2_genl = NIL;
                                                  SubLObject val = NIL;
                                                  {
                                                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                                                    try {
                                                      while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                                        final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                                        c2_genl = Hashtables.getEntryKey(cdohash_entry);
                                                        val = Hashtables.getEntryValue(cdohash_entry);
                                                        Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4757");
                                                        {
                                                          SubLObject exceptions = direct_sdc_exceptions(c2_genl, UNPROVIDED);
                                                          if ((NIL == exceptionP)) {
                                                            {
                                                              SubLObject csome_list_var = exceptions;
                                                              SubLObject exception = NIL;
                                                              for (exception = csome_list_var.first(); (!(((NIL != exceptionP)
                                                                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), exception = csome_list_var.first()) {
                                                                if ((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(exception, $sd_c1_genls_space$.getDynamicValue(thread)))) {
                                                                  exceptionP = T;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } finally {
                                                      Hashtables.releaseEntrySetIterator(cdohash_iterator);
                                                    }
                                                  }
                                                }
                                              } catch (Throwable ccatch_env_var) {
                                                catch_var = Errors.handleThrowable(ccatch_env_var, $kw14$DO_HASH_TABLE);
                                              }
                                            }
                                          }
                                        } finally {
                                          sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_6, thread);
                                          sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_5, thread);
                                          sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                          sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_21, thread);
                                          sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_20, thread);
                                          sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_19, thread);
                                        }
                                      }
                                    }
                                    if ((NIL == exceptionP)) {
                                      result = sbhl_gather_first_sd_or_store_sd_candidates(c2);
                                      if ((NIL != result)) {
                                      } else {
                                        thread.resetMultipleValues();
                                        {
                                          SubLObject result_22 = sbhl_determine_sd_path_with_no_exceptions_among(c1s);
                                          SubLObject result2_23 = thread.secondMultipleValue();
                                          thread.resetMultipleValues();
                                          result = result_22;
                                          result2 = result2_23;
                                        }
                                      }
                                    }
                                  }
                                  sbhl_marking_vars.free_sbhl_marking_space($sd_candidate_store$.getDynamicValue(thread));
                                } finally {
                                  $sd_candidate_store$.rebind(_prev_bind_0_18, thread);
                                }
                              }
                              sbhl_marking_vars.free_sbhl_marking_space($sd_genls_isas_space$.getDynamicValue(thread));
                            } finally {
                              $sd_genls_isas_space$.rebind(_prev_bind_0_17, thread);
                            }
                          }
                          sbhl_marking_vars.free_sbhl_marking_space($sd_c2_genls_space$.getDynamicValue(thread));
                        } finally {
                          $sd_c2_genls_space$.rebind(_prev_bind_0_16, thread);
                        }
                      }
                      sbhl_marking_vars.free_sbhl_marking_space($sd_c1_genls_space$.getDynamicValue(thread));
                    } finally {
                      $sd_c1_genls_space$.rebind(_prev_bind_0_15, thread);
                    }
                  }
                } finally {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_14, thread);
                  sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_13, thread);
                }
              }
            }
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(result, result2);
      }
    }
  }

  /** in *sd-c1-genls-space* mark the genls of C1
   in *sd-genls-isas-space* mark the isas of those C1 genls that is not also C2 genls */
  @SubL(source = "cycl/sdc.lisp", position = 9446) 
  public static final SubLObject sbhl_mark_sd_c1_genls_and_non_c2_genls_isas(SubLObject c1, SubLObject c2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($const13$genls), c2, $sd_c2_genls_space$.getDynamicValue(thread), UNPROVIDED);
      {
        SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
          sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
          sbhl_search_methods.sbhl_map_and_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($const13$genls), c1, $sym15$SBHL_MARK_SD_GENLS_ISAS, $sd_c1_genls_space$.getDynamicValue(thread), UNPROVIDED);
          sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
        } finally {
          sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** in *sd-c1-genls-space* mark the genls of C1S
   in *sd-genls-isas-space* mark the isas of those C1S genls that is not also C2 genls
   @return a list of the c1s used to mark the space. */
  @SubL(source = "cycl/sdc.lisp", position = 10073) 
  public static final SubLObject sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas(SubLObject c1s, SubLObject c2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($const13$genls), c2, $sd_c2_genls_space$.getDynamicValue(thread), UNPROVIDED);
      {
        SubLObject new_c1s = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
          SubLObject _prev_bind_1 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
          SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
          SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
          SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          SubLObject _prev_bind_5 = sbhl_search_vars.$sbhl_search_behavior$.currentBinding(thread);
          SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_terminating_marking_space$.currentBinding(thread);
          SubLObject _prev_bind_7 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
          try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($const13$genls), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($const13$genls)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($const13$genls)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($const13$genls), thread);
            sbhl_search_vars.$sbhl_search_behavior$.bind(sbhl_search_utilities.determine_sbhl_search_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.bind(sbhl_search_utilities.determine_sbhl_terminating_marking_space(sbhl_search_vars.$sbhl_search_behavior$.getDynamicValue(thread)), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            {
              SubLObject cdolist_list_var = c1s;
              SubLObject c1 = NIL;
              for (c1 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), c1 = cdolist_list_var.first()) {
                if ((!(((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c1, $sd_c2_genls_space$.getDynamicValue(thread)))
                      || (NIL != genls.genlP(c1, c2, UNPROVIDED, UNPROVIDED)))))) {
                  sbhl_search_methods.sbhl_map_and_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($const13$genls), c1, $sym15$SBHL_MARK_SD_GENLS_ISAS, $sd_c1_genls_space$.getDynamicValue(thread), UNPROVIDED);
                  new_c1s = cons(c1, new_c1s);
                }
              }
              sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
            }
          } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_7, thread);
            sbhl_marking_vars.$sbhl_terminating_marking_space$.rebind(_prev_bind_6, thread);
            sbhl_search_vars.$sbhl_search_behavior$.rebind(_prev_bind_5, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
          }
        }
        return new_c1s;
      }
    }
  }

  /** marks the all-isas of C1-GENL in *sd-genls-isas-space* (unless its also a genl of c2) */
  @SubL(source = "cycl/sdc.lisp", position = 10961) 
  public static final SubLObject sbhl_mark_sd_genls_isas(SubLObject c1_genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(c1_genl, $sd_c2_genls_space$.getDynamicValue(thread)))) {
        sbhl_marking_methods.sbhl_mark_forward_true_nodes_in_space(sbhl_module_vars.get_sbhl_module($const16$isa), c1_genl, $sd_genls_isas_space$.getDynamicValue(thread), UNPROVIDED);
      }
      return NIL;
    }
  }

  public static final class $sbhl_mark_sd_genls_isas$UnaryFunction extends UnaryFunction {
    public $sbhl_mark_sd_genls_isas$UnaryFunction() { super(extractFunctionNamed("SBHL-MARK-SD-GENLS-ISAS")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_mark_sd_genls_isas(arg1); }
  }

  /** returns the first node, GOAL, from the isas of the genls of C2 
   s.t. (genls C2 C2-GENL) and (isa C2-GENL GOAL) and (isa GOAL SiblingDisjointCollectionType) 
   s.t. C2-GENL is not in *sd-c1-genls-space* and GOAL is in *sd-genls-isas-space* and
   s.t. there are not sdw-exceptions relevant to GOAL defined as follows:
   if there are any X in *sd-c1-genls-space* s.t. (siblingDisjointExceptions C2-GENL X), 
   we store these relevant exceptions as values keyed on GOAL instead of returning GOAL. */
  @SubL(source = "cycl/sdc.lisp", position = 11286) 
  public static final SubLObject sbhl_gather_first_sd_or_store_sd_candidates(SubLObject c2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject relevant_exceptions = NIL;
        {
          SubLObject cdolist_list_var = sdc_exceptions(c2, UNPROVIDED);
          SubLObject exception = NIL;
          for (exception = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), exception = cdolist_list_var.first()) {
            if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2081"))) {
              relevant_exceptions = cons(exception, relevant_exceptions);
            }
          }
        }
        result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($const13$genls), c2, $sym17$SBHL_GATHER_SD_CANDIDATES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL != relevant_exceptions)) {
          if ((NIL != hash_table_utilities.hash_table_empty_p($sd_candidate_store$.getDynamicValue(thread)))) {
            hash_table_utilities.push_hash(result, relevant_exceptions, $sd_candidate_store$.getDynamicValue(thread));
          } else {
            {
              SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue(thread);
              SubLObject c2_genl_isa = NIL;
              SubLObject exception_lists = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    c2_genl_isa = Hashtables.getEntryKey(cdohash_entry);
                    exception_lists = Hashtables.getEntryValue(cdohash_entry);
                    {
                      SubLObject new_exceptions = NIL;
                      SubLObject cdolist_list_var = exception_lists;
                      SubLObject exceptions = NIL;
                      for (exceptions = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), exceptions = cdolist_list_var.first()) {
                        new_exceptions = cons(conses_high.nunion(exceptions, relevant_exceptions, UNPROVIDED, UNPROVIDED), new_exceptions);
                      }
                      Hashtables.sethash(c2_genl_isa, $sd_candidate_store$.getDynamicValue(thread), new_exceptions);
                    }
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
          return NIL;
        }
        return result;
      }
    }
  }

  /** the c2 genl currently considered during sbhl-gather-sd-candidates search */
  @SubL(source = "cycl/sdc.lisp", position = 12855) 
  private static SubLSymbol $sd_c2_genl$ = null;

  /** Implements first part of @see sbhl-gather-first-sd-or-store-sd-candidates. 
   Gathers first sufficient isa of C2-GENL, or passes along information sufficient 
   to determine relevant exceptions for candidate SD nodes. */
  @SubL(source = "cycl/sdc.lisp", position = 12971) 
  public static final SubLObject sbhl_gather_sd_candidates(SubLObject c2_genl) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if ((NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(c2_genl, $sd_c1_genls_space$.getDynamicValue(thread)))) {
          {
            SubLObject _prev_bind_0 = $sd_c2_genl$.currentBinding(thread);
            try {
              $sd_c2_genl$.bind(c2_genl, thread);
              result = sbhl_search_methods.sbhl_gather_first_among_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($const16$isa), c2_genl, $sym18$SBHL_DETERMINE_SD_AND_STORE_CANDIDATES, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
              $sd_c2_genl$.rebind(_prev_bind_0, thread);
            }
          }
          return result;
        }
      }
      return NIL;
    }
  }

  public static final class $sbhl_gather_sd_candidates$UnaryFunction extends UnaryFunction {
    public $sbhl_gather_sd_candidates$UnaryFunction() { super(extractFunctionNamed("SBHL-GATHER-SD-CANDIDATES")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_gather_sd_candidates(arg1); }
  }

  /** Implements second part of @see sbhl-gather-first-sd-or-store-sd-candidates. 
   Determines sufficiency of C2-GENL-ISA, returns it if is in *sd-genls-isas-space*, 
   isa #$SiblingDisjointCollectionType, and has no relevant exceptions. 
   If C2-GENL-ISA only fails due to exceptions, saves C2-GENL-ISA as candidate along 
   with relevant exceptions: saves this information as key, (list of values) in *sd-candidate-store*. */
  @SubL(source = "cycl/sdc.lisp", position = 13537) 
  public static final SubLObject sbhl_determine_sd_and_store_candidates(SubLObject c2_genl_isa) {
    if ((NIL != sbhl_sd_relevant_c2_genl_isa_candidateP(c2_genl_isa))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12568");
    }
    return NIL;
  }

  public static final class $sbhl_determine_sd_and_store_candidates$UnaryFunction extends UnaryFunction {
    public $sbhl_determine_sd_and_store_candidates$UnaryFunction() { super(extractFunctionNamed("SBHL-DETERMINE-SD-AND-STORE-CANDIDATES")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_determine_sd_and_store_candidates(arg1); }
  }

  @SubL(source = "cycl/sdc.lisp", position = 14210) 
  private static SubLSymbol $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$ = null;

  @SubL(source = "cycl/sdc.lisp", position = 14384) 
  public static final SubLObject sbhl_sd_relevant_c2_genl_isa_candidateP(SubLObject c2_genl_isa) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != sbhl_marking_utilities.sbhl_search_path_termination_p(c2_genl_isa, $sd_genls_isas_space$.getDynamicValue(thread)))
             && (NIL != fort_types_interface.sibling_disjoint_collection_p(c2_genl_isa))));
    }
  }

  /** determines if there is any genls along isa path from c1 to a candidate c1-genl-isa 
   that does not go through a set of relevant exceptions, stored in @see *sd-candidate-store* */
  @SubL(source = "cycl/sdc.lisp", position = 15114) 
  public static final SubLObject sbhl_determine_sd_path_with_no_exceptions(SubLObject c1) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if ((NIL == result)) {
          {
            SubLObject catch_var = NIL;
            try {
              {
                SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue(thread);
                SubLObject c1_genl_isa = NIL;
                SubLObject relevant_exceptions = NIL;
                {
                  final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                  try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                      final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                      c1_genl_isa = Hashtables.getEntryKey(cdohash_entry);
                      relevant_exceptions = Hashtables.getEntryValue(cdohash_entry);
                      Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4758");
                      if ((NIL == result)) {
                        {
                          SubLObject csome_list_var = relevant_exceptions;
                          SubLObject c2_genl_exceptions = NIL;
                          for (c2_genl_exceptions = csome_list_var.first(); (!(((NIL != result)
                                || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), c2_genl_exceptions = csome_list_var.first()) {
                            if ((NIL != Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12560"))) {
                              result = c1_genl_isa;
                            }
                          }
                        }
                      }
                    }
                  } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                  }
                }
              }
            } catch (Throwable ccatch_env_var) {
              catch_var = Errors.handleThrowable(ccatch_env_var, $kw14$DO_HASH_TABLE);
            }
          }
        }
        return result;
      }
    }
  }

  /** determines if there is any genls along isa path from some c1 to a candidate c1-genl-isa 
   that does not go through a set of relevant exceptions, stored in @see *sd-candidate-store* */
  @SubL(source = "cycl/sdc.lisp", position = 15709) 
  public static final SubLObject sbhl_determine_sd_path_with_no_exceptions_among(SubLObject c1s) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        SubLObject result2 = NIL;
        if ((NIL == result)) {
          {
            SubLObject csome_list_var = c1s;
            SubLObject c1 = NIL;
            for (c1 = csome_list_var.first(); (!(((NIL != result)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), c1 = csome_list_var.first()) {
              if ((NIL == result)) {
                {
                  SubLObject catch_var = NIL;
                  try {
                    {
                      SubLObject cdohash_table = $sd_candidate_store$.getDynamicValue(thread);
                      SubLObject c1_genl_isa = NIL;
                      SubLObject relevant_exceptions = NIL;
                      {
                        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                          while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            c1_genl_isa = Hashtables.getEntryKey(cdohash_entry);
                            relevant_exceptions = Hashtables.getEntryValue(cdohash_entry);
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4759");
                            {
                              SubLObject cdolist_list_var = relevant_exceptions;
                              SubLObject c2_genl_exceptions = NIL;
                              for (c2_genl_exceptions = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), c2_genl_exceptions = cdolist_list_var.first()) {
                                if ((NIL != Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12561"))) {
                                  result = c1_genl_isa;
                                  result2 = cons(c1, result2);
                                }
                              }
                            }
                          }
                        } finally {
                          Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                      }
                    }
                  } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $kw14$DO_HASH_TABLE);
                  }
                }
              }
            }
          }
        }
        return Values.values(result, result2);
      }
    }
  }

  /** goal during sbhl-sd-genls-and-genls-isa-path-p search */
  @SubL(source = "cycl/sdc.lisp", position = 16675) 
  private static SubLSymbol $sbhl_sd_genls_isas_goal$ = null;

  @SubL(source = "cycl/sdc.lisp", position = 20214) 
  private static SubLSymbol $cached_all_isa_sdct_caching_state$ = null;

  @SubL(source = "cycl/sdc.lisp", position = 20214) 
  public static final SubLObject clear_cached_all_isa_sdct() {
    {
      SubLObject cs = $cached_all_isa_sdct_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  /** is <c1> sibling-disjoint wrt <c2>? */
  @SubL(source = "cycl/sdc.lisp", position = 21772) 
  public static final SubLObject sdcP(SubLObject c1, SubLObject c2, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != term.ground_nautP(c1, UNPROVIDED))) {
        return sdcP(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10359"), c2, mt);
      } else if ((NIL != term.ground_nautP(c2, UNPROVIDED))) {
        return sdcP(c1, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10360"), mt);
      } else if ((NIL == fort_types_interface.collectionP(c1))) {
        return NIL;
      } else if ((NIL == fort_types_interface.collectionP(c2))) {
        return NIL;
      } else {
        {
          SubLObject sdcP = NIL;
          SubLObject mt_var = mt;
          {
            SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
              mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
              mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
              mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
              sdcP = sdc_intP(c1, c2);
            } finally {
              mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
              mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
          }
          return sdcP;
        }
      }
    }
  }

  /** is <c1> sibling-disjoint with <c2> within <mt>? */
  @SubL(source = "cycl/sdc.lisp", position = 22319) 
  public static final SubLObject sdc_intP(SubLObject c1, SubLObject c2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $ignoring_sdcP$.getDynamicValue(thread))) {
        return NIL;
      } else if ((NIL == isa_common_sdctP(c1, c2, UNPROVIDED))) {
        return NIL;
      } else if ((NIL != establishing_supersetP(c1, c2, UNPROVIDED, UNPROVIDED))) {
        return NIL;
      } else if ((NIL != establishing_supersetP(c2, c1, UNPROVIDED, UNPROVIDED))) {
        return NIL;
      } else if ((NIL != establishing_instance_ofP(c1, c2, UNPROVIDED, UNPROVIDED))) {
        return NIL;
      } else {
        return T;
      }
    }
  }

  /** is any c1 in <c1s> sibling-disjoint with <c2> within <mt>? */
  @SubL(source = "cycl/sdc.lisp", position = 22732) 
  public static final SubLObject any_sdc_wrtP(SubLObject c1s, SubLObject c2, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != c1s)
           && (NIL != fort_types_interface.collectionP(c2))
           && (NIL == $ignoring_sdcP$.getDynamicValue(thread)))) {
        thread.resetMultipleValues();
        {
          SubLObject sdcP = any_isa_common_sdct_among(c1s, c2, mt, UNPROVIDED);
          SubLObject rel_c1 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject cdolist_list_var = c1s;
            SubLObject c1 = NIL;
            for (c1 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), c1 = cdolist_list_var.first()) {
              if ((NIL != establishing_supersetP(c1, c2, mt, UNPROVIDED))) {
              } else if ((NIL != establishing_supersetP(c2, c1, mt, UNPROVIDED))) {
              } else if ((NIL != establishing_instance_ofP(c1, c2, mt, UNPROVIDED))) {
                return NIL;
              }
            }
          }
          return list_utilities.sublisp_boolean(sdcP);
        }
      }
      return NIL;
    }
  }

  public static final class $any_sdc_wrtP$BinaryFunction extends BinaryFunction {
    public $any_sdc_wrtP$BinaryFunction() { super(extractFunctionNamed("ANY-SDC-WRT?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return any_sdc_wrtP(arg1, arg2, UNPROVIDED); }
  }

  @SubL(source = "cycl/sdc.lisp", position = 25343) 
  public static final SubLObject sdc_exceptions(SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return sdc_exceptions_int(collection, mt);
  }

  @SubL(source = "cycl/sdc.lisp", position = 25688) 
  public static final SubLObject sdc_exceptions_int(SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return list_utilities.remove_duplicate_forts(ConsesLow.nconc(direct_sdc_exceptions(collection, mt), ((NIL != $sdc_common_spec_exceptionP$.getDynamicValue(thread)) ? ((SubLObject) Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12564")) : NIL)));
    }
  }

  @SubL(source = "cycl/sdc.lisp", position = 25924) 
  private static SubLSymbol $cached_sdc_exceptions_caching_state$ = null;

  /** declared exceptions to the sibling-disjoint cols wrt <collection> */
  @SubL(source = "cycl/sdc.lisp", position = 27127) 
  public static final SubLObject direct_sdc_exceptions(SubLObject collection, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return conses_high.nunion(kb_mapping_utilities.pred_values_in_relevant_mts(collection, $const33$siblingDisjointExceptions, mt, ONE_INTEGER, TWO_INTEGER, UNPROVIDED), kb_mapping_utilities.pred_values_in_relevant_mts(collection, $const33$siblingDisjointExceptions, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED);
  }

  /** don't claim sibling-disjoint when stating that c1 has superset c2 */
  @SubL(source = "cycl/sdc.lisp", position = 30916) 
  public static final SubLObject establishing_supersetP(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject assertion) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((assertion == UNPROVIDED)) {
      assertion = sbhl_link_vars.$added_assertion$.getDynamicValue();
    }
    if ((NIL != assertion)) {
      {
        SubLObject axiom = assertions_high.assertion_formula(assertion);
        SubLObject truth = assertions_high.assertion_truth(assertion);
        SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        SubLObject a1 = conses_high.second(axiom);
        SubLObject a2 = conses_high.third(axiom);
        return makeBoolean(((NIL != el_utilities.genls_litP(axiom))
               && (truth == $kw35$TRUE)
               && (NIL != mt_relevance_macros.relevant_mtP(assertion_mt))
               && (NIL != genls.genlP(c1, a1, mt, UNPROVIDED))
               && (NIL != genls.genlP(a2, c2, mt, UNPROVIDED))));
      }
    } else if (((NIL != wff_macros.within_wffP())
         && (NIL != control_vars.within_assertP()))) {
      {
        SubLObject formula = wff_vars.wff_formula();
        return makeBoolean(((NIL != el_utilities.genls_litP(formula))
               && (NIL == el_utilities.el_negation_p(formula))
               && (NIL != forts.fort_p(el_utilities.literal_arg1(formula, UNPROVIDED)))
               && (NIL != forts.fort_p(el_utilities.literal_arg2(formula, UNPROVIDED)))
               && (NIL != genls.genlP(c1, el_utilities.literal_arg1(formula, UNPROVIDED), UNPROVIDED, UNPROVIDED))
               && (NIL != genls.genlP(el_utilities.literal_arg2(formula, UNPROVIDED), c2, UNPROVIDED, UNPROVIDED))));
      }
    }
    return NIL;
  }

  /** don't claim sibling-disjoint when stating 
   that a common spec of c1 and c2 has an instance
   (e.g., printer-copier) */
  @SubL(source = "cycl/sdc.lisp", position = 31865) 
  public static final SubLObject establishing_instance_ofP(SubLObject c1, SubLObject c2, SubLObject mt, SubLObject assertion) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((assertion == UNPROVIDED)) {
      assertion = sbhl_link_vars.$added_assertion$.getDynamicValue();
    }
    if ((NIL != assertion)) {
      {
        SubLObject axiom = assertions_high.assertion_formula(assertion);
        SubLObject truth = assertions_high.assertion_truth(assertion);
        SubLObject assertion_mt = assertions_high.assertion_mt(assertion);
        SubLObject a1 = conses_high.second(axiom);
        SubLObject a2 = conses_high.third(axiom);
        return makeBoolean(((NIL != el_utilities.isa_litP(axiom))
               && (truth == $kw35$TRUE)
               && (NIL != mt_relevance_macros.relevant_mtP(assertion_mt))
               && (NIL != genls.genlP(a2, c1, mt, UNPROVIDED))
               && (NIL != genls.genlP(a2, c2, mt, UNPROVIDED))));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/sdc.lisp", position = 36079) 
  public static final SubLObject isa_common_sdctP(SubLObject c1, SubLObject c2, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return list_utilities.sublisp_boolean(any_isa_common_sdct(c1, c2, mt, UNPROVIDED));
  }

  /** current tracing level for sdw modules */
  @SubL(source = "cycl/sdc.lisp", position = 36371) 
  public static SubLSymbol $sdw_trace_level$ = null;

  /** current testing level for sdw modules */
  @SubL(source = "cycl/sdc.lisp", position = 36501) 
  public static SubLSymbol $sdw_test_level$ = null;

  public static final SubLObject declare_sdc_file() {
    //declareMacro("with_sbhl_sd_marking_spaces", "WITH-SBHL-SD-MARKING-SPACES");
    //declareMacro("with_sbhl_sd_genls_isas_spaces", "WITH-SBHL-SD-GENLS-ISAS-SPACES");
    declareFunction("any_isa_common_sdct", "ANY-ISA-COMMON-SDCT", 2, 2, false);
    declareFunction("any_isa_common_sdct_among", "ANY-ISA-COMMON-SDCT-AMONG", 2, 2, false);
    declareFunction("sbhl_mark_sd_c1_genls_and_non_c2_genls_isas", "SBHL-MARK-SD-C1-GENLS-AND-NON-C2-GENLS-ISAS", 2, 0, false);
    declareFunction("sbhl_mark_sd_c1s_genls_and_non_c2_genls_isas", "SBHL-MARK-SD-C1S-GENLS-AND-NON-C2-GENLS-ISAS", 2, 0, false);
    declareFunction("sbhl_mark_sd_genls_isas", "SBHL-MARK-SD-GENLS-ISAS", 1, 0, false); new $sbhl_mark_sd_genls_isas$UnaryFunction();
    declareFunction("sbhl_gather_first_sd_or_store_sd_candidates", "SBHL-GATHER-FIRST-SD-OR-STORE-SD-CANDIDATES", 1, 0, false);
    declareFunction("sbhl_gather_sd_candidates", "SBHL-GATHER-SD-CANDIDATES", 1, 0, false); new $sbhl_gather_sd_candidates$UnaryFunction();
    declareFunction("sbhl_determine_sd_and_store_candidates", "SBHL-DETERMINE-SD-AND-STORE-CANDIDATES", 1, 0, false); new $sbhl_determine_sd_and_store_candidates$UnaryFunction();
    //declareFunction("clear_cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "CLEAR-CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 0, 0, false);
    //declareFunction("remove_cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "REMOVE-CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false);
    //declareFunction("cached_sbhl_sd_relevant_c2_genl_isa_candidateP_internal", "CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-INTERNAL", 1, 0, false);
    //declareFunction("cached_sbhl_sd_relevant_c2_genl_isa_candidateP", "CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false);
    declareFunction("sbhl_sd_relevant_c2_genl_isa_candidateP", "SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?", 1, 0, false);
    //declareFunction("sbhl_determine_sd_and_store_relevant_candidates", "SBHL-DETERMINE-SD-AND-STORE-RELEVANT-CANDIDATES", 1, 0, false);
    declareFunction("sbhl_determine_sd_path_with_no_exceptions", "SBHL-DETERMINE-SD-PATH-WITH-NO-EXCEPTIONS", 1, 0, false);
    declareFunction("sbhl_determine_sd_path_with_no_exceptions_among", "SBHL-DETERMINE-SD-PATH-WITH-NO-EXCEPTIONS-AMONG", 1, 0, false);
    //declareFunction("any_sd_isa_path_excluding_exceptions_p", "ANY-SD-ISA-PATH-EXCLUDING-EXCEPTIONS-P", 3, 0, false);
    //declareFunction("sbhl_sd_genls_and_genls_isa_path_p", "SBHL-SD-GENLS-AND-GENLS-ISA-PATH-P", 2, 0, false);
    //declareFunction("sbhl_sd_goal_in_genls_isas_p", "SBHL-SD-GOAL-IN-GENLS-ISAS-P", 1, 0, false);
    //declareFunction("sdc", "SDC", 1, 1, false);
    //declareFunction("max_sdc", "MAX-SDC", 1, 1, false);
    //declareFunction("all_sdc", "ALL-SDC", 1, 1, false);
    //declareFunction("max_sdc_int", "MAX-SDC-INT", 1, 0, false);
    //declareFunction("all_sdc_int", "ALL-SDC-INT", 1, 0, false);
    //declareFunction("remote_sdc_wrt", "REMOTE-SDC-WRT", 2, 1, false);
    //declareFunction("isa_sdct", "ISA-SDCT", 1, 1, false);
    //declareFunction("max_isa_sdct", "MAX-ISA-SDCT", 1, 1, false);
    //declareFunction("applicable_sdct", "APPLICABLE-SDCT", 1, 1, false);
    //declareFunction("gather_sdct_isas", "GATHER-SDCT-ISAS", 1, 0, false);
    //declareFunction("gather_if_sdctP", "GATHER-IF-SDCT?", 1, 0, false);
    //declareFunction("all_isa_sdct", "ALL-ISA-SDCT", 1, 1, false);
    declareFunction("clear_cached_all_isa_sdct", "CLEAR-CACHED-ALL-ISA-SDCT", 0, 0, false);
    //declareFunction("remove_cached_all_isa_sdct", "REMOVE-CACHED-ALL-ISA-SDCT", 2, 0, false);
    //declareFunction("cached_all_isa_sdct_internal", "CACHED-ALL-ISA-SDCT-INTERNAL", 2, 0, false);
    //declareFunction("cached_all_isa_sdct", "CACHED-ALL-ISA-SDCT", 2, 0, false);
    //declareFunction("union_all_isa_sdct", "UNION-ALL-ISA-SDCT", 1, 1, false);
    //declareFunction("sdc_elementP", "SDC-ELEMENT?", 1, 1, false);
    //declareFunction("sdct_elementP", "SDCT-ELEMENT?", 1, 1, false);
    //declareFunction("safe_sdct_elementP", "SAFE-SDCT-ELEMENT?", 1, 1, false);
    //declareFunction("applicable_sdctP", "APPLICABLE-SDCT?", 1, 1, false);
    declareFunction("sdcP", "SDC?", 2, 1, false);
    declareFunction("sdc_intP", "SDC-INT?", 2, 0, false);
    declareFunction("any_sdc_wrtP", "ANY-SDC-WRT?", 2, 1, false); new $any_sdc_wrtP$BinaryFunction();
    //declareFunction("any_sdc_wrt", "ANY-SDC-WRT", 2, 1, false);
    //declareFunction("any_sdc_anyP", "ANY-SDC-ANY?", 2, 1, false);
    //declareFunction("any_sdc_any", "ANY-SDC-ANY", 2, 1, false);
    declareFunction("sdc_exceptions", "SDC-EXCEPTIONS", 1, 1, false);
    declareFunction("sdc_exceptions_int", "SDC-EXCEPTIONS-INT", 1, 1, false);
    //declareFunction("clear_cached_sdc_exceptions", "CLEAR-CACHED-SDC-EXCEPTIONS", 0, 0, false);
    //declareFunction("remove_cached_sdc_exceptions", "REMOVE-CACHED-SDC-EXCEPTIONS", 1, 0, false);
    //declareFunction("cached_sdc_exceptions_internal", "CACHED-SDC-EXCEPTIONS-INTERNAL", 1, 0, false);
    //declareFunction("cached_sdc_exceptions", "CACHED-SDC-EXCEPTIONS", 1, 0, false);
    //declareFunction("declared_sdc_exceptions", "DECLARED-SDC-EXCEPTIONS", 1, 1, false);
    //declareFunction("sdc_exceptions_of_genls", "SDC-EXCEPTIONS-OF-GENLS", 1, 1, false);
    //declareFunction("gather_direct_sdc_exceptions", "GATHER-DIRECT-SDC-EXCEPTIONS", 1, 0, false);
    declareFunction("direct_sdc_exceptions", "DIRECT-SDC-EXCEPTIONS", 1, 1, false);
    //declareFunction("direct_sdc_exceptionP", "DIRECT-SDC-EXCEPTION?", 2, 1, false);
    //declareFunction("collections_sharing_specs", "COLLECTIONS-SHARING-SPECS", 1, 1, false);
    //declareFunction("sdc_exceptionP", "SDC-EXCEPTION?", 2, 1, false);
    //declareFunction("declared_sdc_exceptionP", "DECLARED-SDC-EXCEPTION?", 2, 1, false);
    //declareFunction("remote_sdc_exceptionP", "REMOTE-SDC-EXCEPTION?", 2, 1, false);
    //declareFunction("any_remote_sdc_exception_pair", "ANY-REMOTE-SDC-EXCEPTION-PAIR", 2, 1, false);
    //declareFunction("gather_any_genls_sdc_exception", "GATHER-ANY-GENLS-SDC-EXCEPTION", 1, 0, false);
    //declareFunction("gather_direct_sdc_exception", "GATHER-DIRECT-SDC-EXCEPTION", 1, 0, false);
    //declareFunction("sdc_common_specP", "SDC-COMMON-SPEC?", 2, 1, false);
    //declareFunction("remote_sdc_common_specP", "REMOTE-SDC-COMMON-SPEC?", 2, 1, false);
    //declareFunction("sdct_elements", "SDCT-ELEMENTS", 1, 1, false);
    //declareFunction("cols_with_applicable_sdct", "COLS-WITH-APPLICABLE-SDCT", 1, 1, false);
    declareFunction("establishing_supersetP", "ESTABLISHING-SUPERSET?", 2, 2, false);
    declareFunction("establishing_instance_ofP", "ESTABLISHING-INSTANCE-OF?", 2, 2, false);
    //declareFunction("why_sdcP", "WHY-SDC?", 2, 2, false);
    //declareFunction("assemble_sdc_just", "ASSEMBLE-SDC-JUST", 1, 0, false);
    //declareFunction("any_just_of_sdc", "ANY-JUST-OF-SDC", 2, 1, false);
    //declareFunction("any_just_of_isa_sdct", "ANY-JUST-OF-ISA-SDCT", 2, 1, false);
    //declareFunction("why_sdc_exceptionP", "WHY-SDC-EXCEPTION?", 2, 1, false);
    //declareFunction("why_declared_sdc_exceptionP", "WHY-DECLARED-SDC-EXCEPTION?", 2, 1, false);
    //declareFunction("why_direct_sdc_exceptionP", "WHY-DIRECT-SDC-EXCEPTION?", 2, 1, false);
    //declareFunction("why_remote_sdc_exceptionP", "WHY-REMOTE-SDC-EXCEPTION?", 2, 1, false);
    //declareFunction("why_sdc_common_specP", "WHY-SDC-COMMON-SPEC?", 2, 1, false);
    //declareFunction("why_remote_common_specP", "WHY-REMOTE-COMMON-SPEC?", 2, 1, false);
    declareFunction("isa_common_sdctP", "ISA-COMMON-SDCT?", 2, 1, false);
    //declareFunction("isa_common_sdct_amongP", "ISA-COMMON-SDCT-AMONG?", 2, 1, false);
    //declareFunction("sdw_error", "SDW-ERROR", 2, 5, false);
    return NIL;
  }

  public static final SubLObject init_sdc_file() {
    $sdc_exception_transfers_thru_specsP$ = defparameter("*SDC-EXCEPTION-TRANSFERS-THRU-SPECS?*", NIL);
    $sdc_common_spec_exceptionP$ = defparameter("*SDC-COMMON-SPEC-EXCEPTION?*", NIL);
    $ignoring_sdcP$ = defparameter("*IGNORING-SDC?*", NIL);
    $sd_c1_genls_space$ = defparameter("*SD-C1-GENLS-SPACE*", NIL);
    $sd_c2_genls_space$ = defparameter("*SD-C2-GENLS-SPACE*", NIL);
    $sd_genls_isas_space$ = defparameter("*SD-GENLS-ISAS-SPACE*", NIL);
    $sd_candidate_store$ = defparameter("*SD-CANDIDATE-STORE*", NIL);
    $sd_c2_genl$ = defparameter("*SD-C2-GENL*", NIL);
    $cached_sbhl_sd_relevant_c2_genl_isa_candidateP_caching_state$ = deflexical("*CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-CACHING-STATE*", NIL);
    $sbhl_sd_genls_isas_goal$ = defparameter("*SBHL-SD-GENLS-ISAS-GOAL*", NIL);
    $cached_all_isa_sdct_caching_state$ = deflexical("*CACHED-ALL-ISA-SDCT-CACHING-STATE*", NIL);
    $cached_sdc_exceptions_caching_state$ = deflexical("*CACHED-SDC-EXCEPTIONS-CACHING-STATE*", NIL);
    $sdw_trace_level$ = defvar("*SDW-TRACE-LEVEL*", ONE_INTEGER);
    $sdw_test_level$ = defvar("*SDW-TEST-LEVEL*", ONE_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_sdc_file() {
        memoization_state.note_globally_cached_function($sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_);
    memoization_state.note_globally_cached_function($sym25$CACHED_ALL_ISA_SDCT);
    memoization_state.note_globally_cached_function($sym30$CACHED_SDC_EXCEPTIONS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$INSTANTIATE_SBHL_MARKING_SPACE_FOR = makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE-FOR");
  public static final SubLSymbol $sym1$_SD_C1_GENLS_SPACE_ = makeSymbol("*SD-C1-GENLS-SPACE*");
  public static final SubLSymbol $sym2$_SD_C2_GENLS_SPACE_ = makeSymbol("*SD-C2-GENLS-SPACE*");
  public static final SubLSymbol $sym3$_SD_GENLS_ISAS_SPACE_ = makeSymbol("*SD-GENLS-ISAS-SPACE*");
  public static final SubLSymbol $sym4$_SD_CANDIDATE_STORE_ = makeSymbol("*SD-CANDIDATE-STORE*");
  public static final SubLSymbol $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw6$ERROR = makeKeyword("ERROR");
  public static final SubLString $str7$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym8$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw9$CERROR = makeKeyword("CERROR");
  public static final SubLString $str10$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw11$WARN = makeKeyword("WARN");
  public static final SubLString $str12$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const13$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $kw14$DO_HASH_TABLE = makeKeyword("DO-HASH-TABLE");
  public static final SubLSymbol $sym15$SBHL_MARK_SD_GENLS_ISAS = makeSymbol("SBHL-MARK-SD-GENLS-ISAS");
  public static final SubLObject $const16$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym17$SBHL_GATHER_SD_CANDIDATES = makeSymbol("SBHL-GATHER-SD-CANDIDATES");
  public static final SubLSymbol $sym18$SBHL_DETERMINE_SD_AND_STORE_CANDIDATES = makeSymbol("SBHL-DETERMINE-SD-AND-STORE-CANDIDATES");
  public static final SubLSymbol $sym19$CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE_ = makeSymbol("CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?");
  public static final SubLSymbol $sym20$_CACHED_SBHL_SD_RELEVANT_C2_GENL_ISA_CANDIDATE__CACHING_STATE_ = makeSymbol("*CACHED-SBHL-SD-RELEVANT-C2-GENL-ISA-CANDIDATE?-CACHING-STATE*");
  public static final SubLSymbol $kw21$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym22$SBHL_SD_GOAL_IN_GENLS_ISAS_P = makeSymbol("SBHL-SD-GOAL-IN-GENLS-ISAS-P");
  public static final SubLSymbol $sym23$GATHER_SDCT_ISAS = makeSymbol("GATHER-SDCT-ISAS");
  public static final SubLSymbol $sym24$GATHER_IF_SDCT_ = makeSymbol("GATHER-IF-SDCT?");
  public static final SubLSymbol $sym25$CACHED_ALL_ISA_SDCT = makeSymbol("CACHED-ALL-ISA-SDCT");
  public static final SubLSymbol $sym26$SIBLING_DISJOINT_COLLECTION_P = makeSymbol("SIBLING-DISJOINT-COLLECTION-P");
  public static final SubLSymbol $sym27$_CACHED_ALL_ISA_SDCT_CACHING_STATE_ = makeSymbol("*CACHED-ALL-ISA-SDCT-CACHING-STATE*");
  public static final SubLInteger $int28$512 = makeInteger(512);
  public static final SubLSymbol $sym29$SAFE_SDCT_ELEMENT_ = makeSymbol("SAFE-SDCT-ELEMENT?");
  public static final SubLSymbol $sym30$CACHED_SDC_EXCEPTIONS = makeSymbol("CACHED-SDC-EXCEPTIONS");
  public static final SubLSymbol $sym31$_CACHED_SDC_EXCEPTIONS_CACHING_STATE_ = makeSymbol("*CACHED-SDC-EXCEPTIONS-CACHING-STATE*");
  public static final SubLSymbol $sym32$GATHER_DIRECT_SDC_EXCEPTIONS = makeSymbol("GATHER-DIRECT-SDC-EXCEPTIONS");
  public static final SubLObject $const33$siblingDisjointExceptions = constant_handles.reader_make_constant_shell(makeString("siblingDisjointExceptions"));
  public static final SubLSymbol $sym34$GATHER_DIRECT_SDC_EXCEPTION = makeSymbol("GATHER-DIRECT-SDC-EXCEPTION");
  public static final SubLSymbol $kw35$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw36$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLSymbol $kw37$OPAQUE = makeKeyword("OPAQUE");
  public static final SubLObject $const38$SiblingDisjointCollectionType = constant_handles.reader_make_constant_shell(makeString("SiblingDisjointCollectionType"));
  public static final SubLList $list39 = list(makeSymbol("SPEC1"), makeSymbol("SPEC2"));
  public static final SubLSymbol $sym40$C1 = makeSymbol("C1");
  public static final SubLSymbol $sym41$C2 = makeSymbol("C2");

  //// Initializers

  public void declareFunctions() {
    declare_sdc_file();
  }

  public void initializeVariables() {
    init_sdc_file();
  }

  public void runTopLevelForms() {
    setup_sdc_file();
  }

}
