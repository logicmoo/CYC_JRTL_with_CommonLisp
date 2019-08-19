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
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
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
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class sbhl_search_what_mts extends SubLTranslatedFile {

  //// Constructor

  private sbhl_search_what_mts() {}
  public static final SubLFile me = new sbhl_search_what_mts();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_search_what_mts";

  //// Definitions

  /** The current mts gathered along the path to goal */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 797) 
  public static SubLSymbol $sbhl_path_mts$ = null;

  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 1164) 
  public static final SubLObject possibly_update_sbhl_path_mts(SubLObject mt, SubLObject path_mts) {
    return ((NIL != mt) ? ((SubLObject) ((NIL != list_utilities.member_eqP(mt, path_mts)) ? ((SubLObject) path_mts) : cons(mt, path_mts))) : path_mts);
  }

  /** Hashtable used during what mts search to store path mts to a node */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 1364) 
  public static SubLSymbol $sbhl_what_mts_mt_paths$ = null;

  /** Hashtable used during what mts search to store inverse path mts to a node */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 1515) 
  public static SubLSymbol $sbhl_what_mts_inverse_mt_paths$ = null;

  /** Store for path mts results for straightforward searches */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 1653) 
  public static SubLSymbol $sbhl_primary_what_mts_mt_paths$ = null;

  /** Store for inverse path mts results for straightforward searches */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 1774) 
  public static SubLSymbol $sbhl_primary_what_mts_inverse_mt_paths$ = null;

  /** Store for path mts results for searches which require two marking spaces */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 1910) 
  public static SubLSymbol $sbhl_secondary_what_mts_mt_paths$ = null;

  /** Store for inverse path mts results for searches which require two marking spaces */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 2049) 
  public static SubLSymbol $sbhl_secondary_what_mts_inverse_mt_paths$ = null;

  /** Accessor: returns the keyword :primary. used to determine which what-mts-paths to use. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 2851) 
  public static final SubLObject sbhl_primary_what_mts_spaces() {
    return $kw7$PRIMARY;
  }

  /** Accessor: @return hash-table-p; the space for what mts marking. @hack genl-inverse-mode-p. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 3805) 
  public static final SubLObject get_sbhl_what_mts_marking_space() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_search_vars.genl_inverse_mode_p())) {
        return $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread);
      } else {
        return $sbhl_what_mts_mt_paths$.getDynamicValue(thread);
      }
    }
  }

  /** Accessor: @return listp; the current what mts marking for NODE. @hack genl-inverse-mode-p. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 4069) 
  public static final SubLObject get_sbhl_what_mts_marking(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_search_vars.genl_inverse_mode_p())) {
        return Hashtables.gethash(node, $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread), UNPROVIDED);
      } else {
        return Hashtables.gethash(node, $sbhl_what_mts_mt_paths$.getDynamicValue(thread), UNPROVIDED);
      }
    }
  }

  /** Modifier. changes the mt-path marking for NODE based on @see *sbhl-path-mts*. *sbhl-path-mts* is added to the what-mts-marking for NODE, and every path which is a proper superset of *sbhl-path-mts* is removed from the marking. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 4361) 
  public static final SubLObject sbhl_what_mts_mark_mt_paths_to_node(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject what_mts_space = get_sbhl_what_mts_marking_space();
        SubLObject redundant_mt_paths = NIL;
        {
          SubLObject cdolist_list_var = get_sbhl_what_mts_marking(node);
          SubLObject mt_path = NIL;
          for (mt_path = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mt_path = cdolist_list_var.first()) {
            if ((NIL != list_utilities.proper_subsetp($sbhl_path_mts$.getDynamicValue(thread), mt_path, UNPROVIDED, UNPROVIDED))) {
              redundant_mt_paths = cons(mt_path, redundant_mt_paths);
            }
          }
        }
        {
          SubLObject cdolist_list_var = redundant_mt_paths;
          SubLObject mt_path = NIL;
          for (mt_path = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mt_path = cdolist_list_var.first()) {
            hash_table_utilities.delete_hash(node, mt_path, what_mts_space, EQUAL, UNPROVIDED);
          }
        }
        hash_table_utilities.push_hash(node, $sbhl_path_mts$.getDynamicValue(thread), what_mts_space);
      }
      return NIL;
    }
  }

  /** Accessor. @return booleanp; whether the current *sbhl-path-mts* is a superset of the path-mts markings of NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 5048) 
  public static final SubLObject sbhl_what_mts_marking_subsumes_marking_p(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject subsumesP = NIL;
        if ((NIL == subsumesP)) {
          {
            SubLObject csome_list_var = get_sbhl_what_mts_marking(node);
            SubLObject mt_path = NIL;
            for (mt_path = csome_list_var.first(); (!(((NIL != subsumesP)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), mt_path = csome_list_var.first()) {
              if ((NIL != conses_high.subsetp(mt_path, $sbhl_path_mts$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED))) {
                subsumesP = T;
              }
            }
          }
        }
        return subsumesP;
      }
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 5407) 
  public static final SubLObject determine_sbhl_link_mt(SubLObject node, SubLObject link_node) {
    if (((NIL != forts.fort_p(node))
        || (NIL != (node.isCons() ? ((SubLObject) Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10356")) : NIL)))) {
      return sbhl_link_vars.get_sbhl_link_mt();
    } else {
      return NIL;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 5603) 
  public static SubLSymbol $sbhl_verify_naut_mt_relevance$ = null;

  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 5940) 
  public static final SubLObject sbhl_verify_naut_mt_relevance_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_verify_naut_mt_relevance$.getDynamicValue(thread);
    }
  }

  /** Function used in multistep searches */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 6035) 
  public static SubLSymbol $sbhl_what_mts_map_function$ = null;

  /** Accessor: returns @see *sbhl-what-mts-map-function* */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 6346) 
  public static final SubLObject get_sbhl_what_mts_map_function() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_what_mts_map_function$.getDynamicValue(thread);
    }
  }

  /** Accessor: @return booleanp; whether @see *sbhl-what-mts-map-function* is or is not null. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 6493) 
  public static final SubLObject sbhl_what_mts_not_mapping_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Types.sublisp_null($sbhl_what_mts_map_function$.getDynamicValue(thread));
    }
  }

  /** @hack reduces funcalls. applies @see *sbhl-what-mts-map-function* to NODE */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 6681) 
  public static final SubLObject sbhl_apply_what_mts_map_function(SubLObject node) {
    {
      SubLObject map_fn = get_sbhl_what_mts_map_function();
      if ((NIL != map_fn)) {
        {
          SubLObject pcase_var = map_fn;
          if (pcase_var.eql($sym19$SBHL_FALSE_WHAT_MTS_STEP)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1920");
          } else if (pcase_var.eql($sym20$SBHL_FALSE_WHAT_MTS_SWEEP)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1921");
          } else if (pcase_var.eql($sym21$SBHL_WHAT_MTS_TT_SWEEP)) {
            sbhl_what_mts_tt_sweep(node);
          } else if (pcase_var.eql($sym22$SBHL_WHAT_MTS_TT_STEP)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1963");
          } else if (pcase_var.eql($sym23$SBHL_WHAT_MTS_STEP_ACROSS_MARKED_DISJOINS)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1953");
          } else if (pcase_var.eql($sym24$SBHL_WHAT_MTS_SWEEP_MARKED_DISJOINS)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1960");
          } else if (pcase_var.eql($sym25$SBHL_WHAT_MTS_SWEEP_FORWARD_STEP_AND_SWEEP_FALSE_DISJOINS)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1958");
          } else if (pcase_var.eql($sym26$SBHL_WHAT_MTS_SWEEP_FALSE_DISJOINS)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1957");
          } else {
            Functions.funcall(map_fn, node);
          }
        }
      }
    }
    return NIL;
  }

  /** the goal node for a what mts search */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 7600) 
  public static SubLSymbol $sbhl_what_mts_goal$ = null;

  /** @return sbhl-node-object-p; @see *sbhl-what-mts-goal* */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 7707) 
  public static final SubLObject get_sbhl_what_mts_goal() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_what_mts_goal$.getDynamicValue(thread);
    }
  }

  /** Accessor: @return booleanp; whether the search context allows goal checking and if NODE is the @see *sbhl-what-mts-goal* */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 8022) 
  public static final SubLObject sbhl_what_mts_goal_p(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != sbhl_what_mts_not_mapping_p())) {
        {
          SubLObject add_node_test = sbhl_search_vars.get_sbhl_search_add_node_test();
          SubLObject check_goalP = T;
          if ((NIL != add_node_test)) {
            check_goalP = Functions.funcall(add_node_test);
          }
          if ((NIL != check_goalP)) {
            return Equality.eq(node, $sbhl_what_mts_goal$.getDynamicValue(thread));
          }
        }
      } else {
        return NIL;
      }
      return NIL;
    }
  }

  /** Modifier. recursive workhorse that accumulates mt paths from NODE to goal. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 9467) 
  public static final SubLObject sbhl_what_mts_mark_and_sweep(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == sbhl_what_mts_marking_subsumes_marking_p(node))) {
        sbhl_what_mts_mark_mt_paths_to_node(node);
        sbhl_apply_what_mts_map_function(node);
        if ((NIL == sbhl_what_mts_goal_p(node))) {
          {
            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
            SubLObject cdolist_list_var = accessible_modules;
            SubLObject module_var = NIL;
            for (module_var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), module_var = cdolist_list_var.first()) {
              {
                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                try {
                  sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                  sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                  {
                    SubLObject node_1 = function_terms.naut_to_nart(node);
                    if ((NIL != sbhl_link_vars.sbhl_node_object_p(node_1))) {
                      {
                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_1, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
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
                                        SubLObject _prev_bind_0_2 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                        try {
                                          sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                          {
                                            SubLObject iteration_state_3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                            while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_3))) {
                                              thread.resetMultipleValues();
                                              {
                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_3);
                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                                  {
                                                    SubLObject _prev_bind_0_4 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                    try {
                                                      sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                      {
                                                        SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
																.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9326")) : link_nodes);
                                                        SubLObject cdolist_list_var_5 = new_list;
                                                        SubLObject link_node = NIL;
                                                        for (link_node = cdolist_list_var_5.first(); (NIL != cdolist_list_var_5); cdolist_list_var_5 = cdolist_list_var_5.rest(), link_node = cdolist_list_var_5.first()) {
                                                          {
                                                            SubLObject _prev_bind_0_6 = $sbhl_path_mts$.currentBinding(thread);
                                                            try {
                                                              $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                              sbhl_what_mts_mark_and_sweep(link_node);
                                                            } finally {
                                                              $sbhl_path_mts$.rebind(_prev_bind_0_6, thread);
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } finally {
                                                      sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_4, thread);
                                                    }
                                                  }
                                                }
                                                iteration_state_3 = dictionary_contents.do_dictionary_contents_next(iteration_state_3);
                                              }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_3);
                                          }
                                        } finally {
                                          sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_2, thread);
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
                          sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str31$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                      }
                    } else if ((NIL != obsolete.cnat_p(node_1, UNPROVIDED))) {
                      {
                        SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9327")) : Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2711"));
                        SubLObject cdolist_list_var_7 = new_list;
                        SubLObject generating_fn = NIL;
                        for (generating_fn = cdolist_list_var_7.first(); (NIL != cdolist_list_var_7); cdolist_list_var_7 = cdolist_list_var_7.rest(), generating_fn = cdolist_list_var_7.first()) {
                          {
                            SubLObject _prev_bind_0_8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                            try {
                              sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                              {
                                SubLObject link_nodes = Functions.funcall(generating_fn, node_1);
                                SubLObject new_list_9 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9328")) : link_nodes);
                                SubLObject cdolist_list_var_10 = new_list_9;
                                SubLObject link_node = NIL;
                                for (link_node = cdolist_list_var_10.first(); (NIL != cdolist_list_var_10); cdolist_list_var_10 = cdolist_list_var_10.rest(), link_node = cdolist_list_var_10.first()) {
                                  {
                                    SubLObject _prev_bind_0_11 = $sbhl_path_mts$.currentBinding(thread);
                                    try {
                                      $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                      sbhl_what_mts_mark_and_sweep(link_node);
                                    } finally {
                                      $sbhl_path_mts$.rebind(_prev_bind_0_11, thread);
                                    }
                                  }
                                }
                              }
                            } finally {
                              sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_8, thread);
                            }
                          }
                        }
                      }
                    }
                  }
                } finally {
                  sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
                  sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Modifier. steps across links, updating the mt path. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 10734) 
  public static final SubLObject sbhl_what_mts_step_across_links(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
        SubLObject cdolist_list_var = accessible_modules;
        SubLObject module_var = NIL;
        for (module_var = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), module_var = cdolist_list_var.first()) {
          {
            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            SubLObject _prev_bind_1 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
            try {
              sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
              sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
              {
                SubLObject node_23 = function_terms.naut_to_nart(node);
                if ((NIL != sbhl_link_vars.sbhl_node_object_p(node_23))) {
                  {
                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_23, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
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
                                    SubLObject _prev_bind_0_24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                    try {
                                      sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                      {
                                        SubLObject iteration_state_25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_25))) {
                                          thread.resetMultipleValues();
                                          {
                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_25);
                                            SubLObject link_nodes = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv))) {
                                              {
                                                SubLObject _prev_bind_0_26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                try {
                                                  sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                  {
                                                    SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
															.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9329")) : link_nodes);
                                                    SubLObject cdolist_list_var_27 = new_list;
                                                    SubLObject link_node = NIL;
                                                    for (link_node = cdolist_list_var_27.first(); (NIL != cdolist_list_var_27); cdolist_list_var_27 = cdolist_list_var_27.rest(), link_node = cdolist_list_var_27.first()) {
                                                      {
                                                        SubLObject _prev_bind_0_28 = $sbhl_path_mts$.currentBinding(thread);
                                                        try {
                                                          $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                                          sbhl_apply_what_mts_map_function(link_node);
                                                        } finally {
                                                          $sbhl_path_mts$.rebind(_prev_bind_0_28, thread);
                                                        }
                                                      }
                                                    }
                                                  }
                                                } finally {
                                                  sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_26, thread);
                                                }
                                              }
                                            }
                                            iteration_state_25 = dictionary_contents.do_dictionary_contents_next(iteration_state_25);
                                          }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_25);
                                      }
                                    } finally {
                                      sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_24, thread);
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
                      sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str31$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                  }
                } else if ((NIL != obsolete.cnat_p(node_23, UNPROVIDED))) {
                  {
                    SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9330")) : Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2713"));
                    SubLObject cdolist_list_var_29 = new_list;
                    SubLObject generating_fn = NIL;
                    for (generating_fn = cdolist_list_var_29.first(); (NIL != cdolist_list_var_29); cdolist_list_var_29 = cdolist_list_var_29.rest(), generating_fn = cdolist_list_var_29.first()) {
                      {
                        SubLObject _prev_bind_0_30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                        try {
                          sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                          {
                            SubLObject link_nodes = Functions.funcall(generating_fn, node_23);
                            SubLObject new_list_31 = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9331")) : link_nodes);
                            SubLObject cdolist_list_var_32 = new_list_31;
                            SubLObject link_node = NIL;
                            for (link_node = cdolist_list_var_32.first(); (NIL != cdolist_list_var_32); cdolist_list_var_32 = cdolist_list_var_32.rest(), link_node = cdolist_list_var_32.first()) {
                              {
                                SubLObject _prev_bind_0_33 = $sbhl_path_mts$.currentBinding(thread);
                                try {
                                  $sbhl_path_mts$.bind(possibly_update_sbhl_path_mts(determine_sbhl_link_mt(node, link_node), $sbhl_path_mts$.getDynamicValue(thread)), thread);
                                  sbhl_apply_what_mts_map_function(link_node);
                                } finally {
                                  $sbhl_path_mts$.rebind(_prev_bind_0_33, thread);
                                }
                              }
                            }
                          }
                        } finally {
                          sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_30, thread);
                        }
                      }
                    }
                  }
                }
              }
            } finally {
              sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1, thread);
              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Binds its arguments in setup for @see sbhl-what-mts-mark-and-sweep */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 11804) 
  public static final SubLObject sbhl_what_mts_sweep(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject spaces, SubLObject map_fn, SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym32$SBHL_MODULE_P);
      {
        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        SubLObject _prev_bind_1 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        SubLObject _prev_bind_3 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
        SubLObject _prev_bind_4 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
        SubLObject _prev_bind_5 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
          sbhl_module_vars.$sbhl_module$.bind(module, thread);
          sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
          sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
          $sbhl_what_mts_mt_paths$.bind(((spaces == $kw7$PRIMARY) ? ((SubLObject) $sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread)) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread)), thread);
          $sbhl_what_mts_inverse_mt_paths$.bind(((spaces == $kw7$PRIMARY) ? ((SubLObject) $sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread)) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread)), thread);
          $sbhl_what_mts_map_function$.bind(map_fn, thread);
          sbhl_what_mts_mark_and_sweep(node);
        } finally {
          $sbhl_what_mts_map_function$.rebind(_prev_bind_5, thread);
          $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_4, thread);
          $sbhl_what_mts_mt_paths$.rebind(_prev_bind_3, thread);
          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
          sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1, thread);
          sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** Binds its arguments in setup for @see sbhl-what-mts-step-across-links */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 12792) 
  public static final SubLObject sbhl_what_mts_step(SubLObject module, SubLObject link_direction, SubLObject tv, SubLObject map_fn, SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym32$SBHL_MODULE_P);
      {
        SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        SubLObject _prev_bind_1 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
        SubLObject _prev_bind_3 = $sbhl_what_mts_map_function$.currentBinding(thread);
        try {
          sbhl_module_vars.$sbhl_module$.bind(module, thread);
          sbhl_link_vars.$sbhl_link_direction$.bind(link_direction, thread);
          sbhl_search_vars.$sbhl_tv$.bind(tv, thread);
          $sbhl_what_mts_map_function$.bind(map_fn, thread);
          sbhl_what_mts_step_across_links(node);
        } finally {
          $sbhl_what_mts_map_function$.rebind(_prev_bind_3, thread);
          sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_2, thread);
          sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1, thread);
          sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** Used for true what mts searches of simple predicates, sweeping nodes accessible to NODE */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 14102) 
  public static final SubLObject sbhl_simple_true_what_mts_search(SubLObject node) {
    sbhl_what_mts_sweep(sbhl_search_vars.get_sbhl_search_module(), sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), NIL, node);
    return NIL;
  }

  /** Used for forward transfers through what mts searches. Steps across accessible links. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 15766) 
  public static final SubLObject sbhl_tt_what_mts_search(SubLObject node) {
    sbhl_what_mts_step(sbhl_search_vars.get_sbhl_search_module(), sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_search_vars.get_sbhl_search_module()), sbhl_search_vars.get_sbhl_tv(), $sym21$SBHL_WHAT_MTS_TT_SWEEP, node);
    return NIL;
  }

  /** Used as second part of forward transfers through what mts searches. Sweeps all nodes accessible to NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 16125) 
  public static final SubLObject sbhl_what_mts_tt_sweep(SubLObject node) {
    sbhl_what_mts_sweep(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), ((NIL != sbhl_search_vars.sbhl_true_search_p()) ? ((SubLObject) sbhl_link_vars.get_sbhl_link_direction()) : sbhl_link_vars.get_sbhl_opposite_link_direction()), sbhl_search_vars.sbhl_search_true_tv(), sbhl_primary_what_mts_spaces(), NIL, node);
    return NIL;
  }

  /** Accessor: @return function-spec-p. Returns the name of the search function to call, as determined by PRED's type, DIRECTION, and TV. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 21293) 
  public static final SubLObject determine_sbhl_what_mts_behavior(SubLObject module, SubLObject direction, SubLObject tv) {
    checkType(module, $sym32$SBHL_MODULE_P);
    if ((NIL != sbhl_module_utilities.sbhl_simple_module_p(module))) {
      if ((NIL != sbhl_search_vars.sbhl_true_tv_p(tv))) {
        return $sym35$SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH;
      } else {
        return $sym36$SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH;
      }
    } else if ((NIL != sbhl_module_utilities.sbhl_transfers_through_module_p(module))) {
      if ((NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction))) {
        return $sym37$SBHL_TT_WHAT_MTS_SEARCH;
      } else {
        return $sym38$SBHL_WHAT_MTS_TT_BACKWARD_SEARCH;
      }
    } else if ((NIL != sbhl_module_utilities.sbhl_disjoins_module_p(module))) {
      if ((NIL != sbhl_search_vars.sbhl_true_tv_p(tv))) {
        return $sym39$SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH;
      } else {
        return $sym40$SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH;
      }
    } else {
      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str41$Search_behavior_not_recognized__S, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** The initial function to call for what-mts search. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 22160) 
  public static SubLSymbol $sbhl_what_mts_behavior$ = null;

  /** Accessor. @return function-spec-p. @see *sbhl-what-mts-behavior* */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 22267) 
  public static final SubLObject get_sbhl_what_mts_behavior() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_what_mts_behavior$.getDynamicValue(thread);
    }
  }

  /** @hack reduces funcalls. applies to NODE @see *sbhl-what-mts-behavior*. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 22790) 
  public static final SubLObject sbhl_apply_what_mts_behavior(SubLObject node) {
    {
      SubLObject behavior = get_sbhl_what_mts_behavior();
      SubLObject pcase_var = behavior;
      if (pcase_var.eql($sym35$SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH)) {
        sbhl_simple_true_what_mts_search(node);
      } else if (pcase_var.eql($sym36$SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1946");
      } else if (pcase_var.eql($sym37$SBHL_TT_WHAT_MTS_SEARCH)) {
        sbhl_tt_what_mts_search(node);
      } else if (pcase_var.eql($sym38$SBHL_WHAT_MTS_TT_BACKWARD_SEARCH)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1962");
      } else if (pcase_var.eql($sym39$SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1961");
      } else if (pcase_var.eql($sym40$SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1947");
      } else {
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str43$Unsupported_what_mts_behavior__a, behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  /** Accessor. @return keywordp; the tag indicating which set of marking spaces holds the correct marking information for the goal. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 23611) 
  public static final SubLObject sbhl_what_mts_terminating_space() {
    {
      SubLObject behavior = get_sbhl_what_mts_behavior();
      SubLObject pcase_var = behavior;
      if (pcase_var.eql($sym35$SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH)) {
        return sbhl_primary_what_mts_spaces();
      } else if (pcase_var.eql($sym36$SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1942");
      } else if (pcase_var.eql($sym37$SBHL_TT_WHAT_MTS_SEARCH)) {
        return sbhl_primary_what_mts_spaces();
      } else if (pcase_var.eql($sym38$SBHL_WHAT_MTS_TT_BACKWARD_SEARCH)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1943");
      } else if (pcase_var.eql($sym39$SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1944");
      } else if (pcase_var.eql($sym40$SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1945");
      } else {
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str43$Unsupported_what_mts_behavior__a, behavior, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  /** @hack explicitly references behavior for #$genlInverse and #$negationInverse. Accessor: @return listp; the final path mts for NODE */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 24481) 
  public static final SubLObject sbhl_what_mts_final_mt_paths(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $sbhl_what_mts_mt_paths$.currentBinding(thread);
          SubLObject _prev_bind_1 = $sbhl_what_mts_inverse_mt_paths$.currentBinding(thread);
          try {
            $sbhl_what_mts_mt_paths$.bind(((sbhl_what_mts_terminating_space() == $kw7$PRIMARY) ? ((SubLObject) $sbhl_primary_what_mts_mt_paths$.getDynamicValue(thread)) : $sbhl_secondary_what_mts_mt_paths$.getDynamicValue(thread)), thread);
            $sbhl_what_mts_inverse_mt_paths$.bind(((sbhl_what_mts_terminating_space() == $kw7$PRIMARY) ? ((SubLObject) $sbhl_primary_what_mts_inverse_mt_paths$.getDynamicValue(thread)) : $sbhl_secondary_what_mts_inverse_mt_paths$.getDynamicValue(thread)), thread);
            if (((sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module()) == $const30$genlInverse)
                || (sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.get_sbhl_search_module()) == $const29$negationInverse))) {
              result = Hashtables.gethash(node, $sbhl_what_mts_inverse_mt_paths$.getDynamicValue(thread), UNPROVIDED);
            } else {
              result = Hashtables.gethash(node, $sbhl_what_mts_mt_paths$.getDynamicValue(thread), UNPROVIDED);
            }
          } finally {
            $sbhl_what_mts_inverse_mt_paths$.rebind(_prev_bind_1, thread);
            $sbhl_what_mts_mt_paths$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** Accessor: @return listp; the list of path mts for @see *sbhl-what-mts-goal*. @see sbhl-what-mts-final-mt-paths */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 25069) 
  public static final SubLObject sbhl_what_mts_goal_final_mt_paths() {
    return sbhl_what_mts_final_mt_paths(get_sbhl_what_mts_goal());
  }

  /** @return listp; the mt paths from NODE to GOAL-NODE via MODULE, optionally constrained by TV. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 25305) 
  public static final SubLObject sbhl_predicate_mt_paths(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym32$SBHL_MODULE_P);
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
              SubLObject tv_var = tv;
              {
                SubLObject _prev_bind_0_47 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_1_48 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.get_sbhl_true_tv()), thread);
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym44$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                  if ((NIL != tv_var)) {
                    if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                      if ((NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        {
                          SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                          if (pcase_var.eql($kw45$ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str46$_A_is_not_a__A, tv_var, $sym47$SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          } else if (pcase_var.eql($kw48$CERROR)) {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2228");
                          } else if (pcase_var.eql($kw50$WARN)) {
                            Errors.warn($str46$_A_is_not_a__A, tv_var, $sym47$SBHL_TRUE_TV_P);
                          } else {
                            Errors.warn($str51$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str49$continue_anyway, $str46$_A_is_not_a__A, tv_var, $sym47$SBHL_TRUE_TV_P);
                          }
                        }
                      }
                    }
                  }
                  {
                    SubLObject _prev_bind_0_49 = sbhl_search_vars.$sbhl_search_truth$.currentBinding(thread);
                    SubLObject _prev_bind_1_50 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                    SubLObject _prev_bind_2_51 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                    try {
                      sbhl_search_vars.$sbhl_search_truth$.bind($const52$True_JustificationTruth, thread);
                      sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                      sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                      {
                        SubLObject source = sbhl_marking_vars.sbhl_new_space_source();
                        {
                          SubLObject _prev_bind_0_52 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                          try {
                            sbhl_marking_vars.$sbhl_space$.bind(((source == $kw53$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                            {
                              SubLObject _prev_bind_0_53 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                              try {
                                sbhl_marking_vars.$sbhl_gather_space$.bind(((source == $kw53$OLD) ? ((SubLObject) sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)) : sbhl_marking_vars.sbhl_get_new_space(source)), thread);
                                {
                                  SubLObject _prev_bind_0_54 = sbhl_search_vars.$sbhl_finishedP$.currentBinding(thread);
                                  SubLObject _prev_bind_1_55 = sbhl_search_vars.$sbhl_stop_search_pathP$.currentBinding(thread);
                                  SubLObject _prev_bind_2_56 = sbhl_search_vars.$sbhl_search_parent_marking$.currentBinding(thread);
                                  SubLObject _prev_bind_3_57 = sbhl_search_vars.$sbhl_nodes_previous_marking$.currentBinding(thread);
                                  SubLObject _prev_bind_4_58 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                        result = sbhl_what_mt_paths_from_node_to_node(node, goal_node);
                                      } finally {
                                        if ((NIL != needs_to_releaseP)) {
                                          ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
                                        }
                                      }
                                    }
                                  } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4_58, thread);
                                    sbhl_search_vars.$sbhl_nodes_previous_marking$.rebind(_prev_bind_3_57, thread);
                                    sbhl_search_vars.$sbhl_search_parent_marking$.rebind(_prev_bind_2_56, thread);
                                    sbhl_search_vars.$sbhl_stop_search_pathP$.rebind(_prev_bind_1_55, thread);
                                    sbhl_search_vars.$sbhl_finishedP$.rebind(_prev_bind_0_54, thread);
                                  }
                                }
                                if ((source == $kw54$RESOURCE)) {
                                  sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                              } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_0_53, thread);
                              }
                            }
                            if ((source == $kw54$RESOURCE)) {
                              sbhl_marking_vars.update_sbhl_resourced_spaces(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            }
                          } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_52, thread);
                          }
                        }
                      }
                    } finally {
                      sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_51, thread);
                      sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_1_50, thread);
                      sbhl_search_vars.$sbhl_search_truth$.rebind(_prev_bind_0_49, thread);
                    }
                  }
                } finally {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_48, thread);
                  sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_47, thread);
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

  /** @return listp; the mt paths from NODE1 to NODE2. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 27027) 
  public static final SubLObject sbhl_what_mt_paths_from_node_to_node(SubLObject node1, SubLObject node2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        if (node1.equal(node2)) {
          result = list(list(mt_vars.$mt_root$.getGlobalValue()));
        } else {
          {
            SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_type$.currentBinding(thread);
            SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            SubLObject _prev_bind_3 = $sbhl_primary_what_mts_mt_paths$.currentBinding(thread);
            SubLObject _prev_bind_4 = $sbhl_primary_what_mts_inverse_mt_paths$.currentBinding(thread);
            SubLObject _prev_bind_5 = $sbhl_secondary_what_mts_mt_paths$.currentBinding(thread);
            SubLObject _prev_bind_6 = $sbhl_secondary_what_mts_inverse_mt_paths$.currentBinding(thread);
            SubLObject _prev_bind_7 = $sbhl_what_mts_goal$.currentBinding(thread);
            SubLObject _prev_bind_8 = $sbhl_what_mts_behavior$.currentBinding(thread);
            try {
              sbhl_search_vars.$sbhl_search_type$.bind($kw57$WHAT_MTS, thread);
              mt_relevance_macros.$relevant_mt_function$.bind($sym58$RELEVANT_MT_IS_EVERYTHING, thread);
              mt_relevance_macros.$mt$.bind($const59$EverythingPSC, thread);
              $sbhl_primary_what_mts_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
              $sbhl_primary_what_mts_inverse_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
              $sbhl_secondary_what_mts_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
              $sbhl_secondary_what_mts_inverse_mt_paths$.bind(sbhl_marking_vars.instantiate_sbhl_marking_space(), thread);
              $sbhl_what_mts_goal$.bind(node2, thread);
              $sbhl_what_mts_behavior$.bind(determine_sbhl_what_mts_behavior(sbhl_search_vars.get_sbhl_search_module(), sbhl_search_vars.get_sbhl_search_direction(), sbhl_search_vars.get_sbhl_tv()), thread);
              sbhl_apply_what_mts_behavior(node1);
              result = sbhl_what_mts_goal_final_mt_paths();
            } finally {
              $sbhl_what_mts_behavior$.rebind(_prev_bind_8, thread);
              $sbhl_what_mts_goal$.rebind(_prev_bind_7, thread);
              $sbhl_secondary_what_mts_inverse_mt_paths$.rebind(_prev_bind_6, thread);
              $sbhl_secondary_what_mts_mt_paths$.rebind(_prev_bind_5, thread);
              $sbhl_primary_what_mts_inverse_mt_paths$.rebind(_prev_bind_4, thread);
              $sbhl_primary_what_mts_mt_paths$.rebind(_prev_bind_3, thread);
              mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
              mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
              sbhl_search_vars.$sbhl_search_type$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return result;
      }
    }
  }

  /** @return listp; the minimal mts of each of the path mts in MT-PATHS. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 27523) 
  public static final SubLObject sbhl_min_mt_paths(SubLObject mt_paths) {
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = mt_paths;
      SubLObject mt_path = NIL;
      for (mt_path = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mt_path = cdolist_list_var.first()) {
        mt_path = mt_vars.minimize_mts_wrt_core(mt_path);
        {
          SubLObject min_mts_of_path = sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($const60$genlMt), mt_path, UNPROVIDED, UNPROVIDED);
          SubLObject failP = NIL;
          if ((NIL == failP)) {
            {
              SubLObject csome_list_var = result;
              SubLObject result_mt_path = NIL;
              for (result_mt_path = csome_list_var.first(); (!(((NIL != failP)
                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), result_mt_path = csome_list_var.first()) {
                if ((NIL != conses_high.subsetp(result_mt_path, min_mts_of_path, UNPROVIDED, UNPROVIDED))) {
                  failP = T;
                }
                if (((NIL == failP)
                     && (NIL != conses_high.subsetp(min_mts_of_path, result_mt_path, UNPROVIDED, UNPROVIDED)))) {
                  result = Sequences.remove(result_mt_path, result, EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
              }
            }
          }
          if ((NIL == failP)) {
            result = cons(min_mts_of_path, result);
          }
        }
      }
      return result;
    }
  }

  /** @return listp; the list of independent mts for which there is a true MODULE relation between NODE and GOAL-NODE. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 28165) 
  public static final SubLObject sbhl_min_mts_of_predicate_paths(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym32$SBHL_MODULE_P);
    return sbhl_min_mt_paths(sbhl_predicate_mt_paths(module, node, goal_node, tv));
  }

  /** helper for @see sbhl-max-floor-mts-of-paths */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 29495) 
  public static final SubLObject sbhl_max_floor_mts(SubLObject mts) {
    return sbhl_search_methods.sbhl_max_floors(sbhl_module_vars.get_sbhl_module($const60$genlMt), mts, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  public static final class $sbhl_max_floor_mts$UnaryFunction extends UnaryFunction {
    public $sbhl_max_floor_mts$UnaryFunction() { super(extractFunctionNamed("SBHL-MAX-FLOOR-MTS")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_max_floor_mts(arg1); }
  }

  /** @return listp; the most general mt(s) by which all of PATH's mts are visible. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 29644) 
  public static final SubLObject sbhl_max_floor_mts_of_paths(SubLObject paths) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = $sbhl_verify_naut_mt_relevance$.currentBinding(thread);
          try {
            $sbhl_verify_naut_mt_relevance$.bind(NIL, thread);
            result = sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($const60$genlMt), Sequences.creduce($sym61$UNION, Sequences.delete(NIL, Mapping.mapcar($sym62$SBHL_MAX_FLOOR_MTS, paths), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER, NIL, NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != sbhl_verify_naut_mt_relevance_p())) {
              sbhl_paranoia.sbhl_warn(ONE_INTEGER, $str63$Mts_might_not_be_valid_because_in, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
          } finally {
            $sbhl_verify_naut_mt_relevance$.rebind(_prev_bind_0, thread);
          }
        }
        return result;
      }
    }
  }

  /** @return listp; the most general mt(s) by which all true MODULE relations between NODE and GOAL-NODE are visible. */
  @SubL(source = "cycl/sbhl/sbhl-search-what-mts.lisp", position = 30163) 
  public static final SubLObject sbhl_max_floor_mts_of_predicate_paths(SubLObject module, SubLObject node, SubLObject goal_node, SubLObject tv) {
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(module, $sym32$SBHL_MODULE_P);
    return sbhl_max_floor_mts_of_paths(sbhl_min_mts_of_predicate_paths(module, node, goal_node, tv));
  }

  public static final SubLObject declare_sbhl_search_what_mts_file() {
    //declareMacro("sbhl_rebind_path_mts", "SBHL-REBIND-PATH-MTS");
    declareFunction("possibly_update_sbhl_path_mts", "POSSIBLY-UPDATE-SBHL-PATH-MTS", 2, 0, false);
    //declareMacro("with_new_sbhl_what_mts_marking_spaces", "WITH-NEW-SBHL-WHAT-MTS-MARKING-SPACES");
    declareFunction("sbhl_primary_what_mts_spaces", "SBHL-PRIMARY-WHAT-MTS-SPACES", 0, 0, false);
    //declareFunction("sbhl_secondary_what_mts_spaces", "SBHL-SECONDARY-WHAT-MTS-SPACES", 0, 0, false);
    //declareMacro("within_sbhl_what_mts_spaces", "WITHIN-SBHL-WHAT-MTS-SPACES");
    declareFunction("get_sbhl_what_mts_marking_space", "GET-SBHL-WHAT-MTS-MARKING-SPACE", 0, 0, false);
    declareFunction("get_sbhl_what_mts_marking", "GET-SBHL-WHAT-MTS-MARKING", 1, 0, false);
    declareFunction("sbhl_what_mts_mark_mt_paths_to_node", "SBHL-WHAT-MTS-MARK-MT-PATHS-TO-NODE", 1, 0, false);
    declareFunction("sbhl_what_mts_marking_subsumes_marking_p", "SBHL-WHAT-MTS-MARKING-SUBSUMES-MARKING-P", 1, 0, false);
    declareFunction("determine_sbhl_link_mt", "DETERMINE-SBHL-LINK-MT", 2, 0, false);
    //declareFunction("sbhl_encountered_difficult_naut_mt_generator", "SBHL-ENCOUNTERED-DIFFICULT-NAUT-MT-GENERATOR", 0, 0, false);
    //declareMacro("with_new_naut_mt_relevance_verification", "WITH-NEW-NAUT-MT-RELEVANCE-VERIFICATION");
    declareFunction("sbhl_verify_naut_mt_relevance_p", "SBHL-VERIFY-NAUT-MT-RELEVANCE-P", 0, 0, false);
    //declareMacro("with_sbhl_what_mts_map_function", "WITH-SBHL-WHAT-MTS-MAP-FUNCTION");
    declareFunction("get_sbhl_what_mts_map_function", "GET-SBHL-WHAT-MTS-MAP-FUNCTION", 0, 0, false);
    declareFunction("sbhl_what_mts_not_mapping_p", "SBHL-WHAT-MTS-NOT-MAPPING-P", 0, 0, false);
    declareFunction("sbhl_apply_what_mts_map_function", "SBHL-APPLY-WHAT-MTS-MAP-FUNCTION", 1, 0, false);
    declareFunction("get_sbhl_what_mts_goal", "GET-SBHL-WHAT-MTS-GOAL", 0, 0, false);
    //declareMacro("with_sbhl_what_mts_goal", "WITH-SBHL-WHAT-MTS-GOAL");
    declareFunction("sbhl_what_mts_goal_p", "SBHL-WHAT-MTS-GOAL-P", 1, 0, false);
    //declareFunction("sbhl_what_mts_proper_mark_p", "SBHL-WHAT-MTS-PROPER-MARK-P", 1, 0, false);
    //declareFunction("sbhl_what_mts_proper_goal_mark_p", "SBHL-WHAT-MTS-PROPER-GOAL-MARK-P", 1, 0, false);
    declareFunction("sbhl_what_mts_mark_and_sweep", "SBHL-WHAT-MTS-MARK-AND-SWEEP", 1, 0, false);
    //declareFunction("sbhl_what_mts_mark_and_sweep_marked_nodes", "SBHL-WHAT-MTS-MARK-AND-SWEEP-MARKED-NODES", 1, 0, false);
    declareFunction("sbhl_what_mts_step_across_links", "SBHL-WHAT-MTS-STEP-ACROSS-LINKS", 1, 0, false);
    //declareFunction("sbhl_what_mts_step_across_marked_links", "SBHL-WHAT-MTS-STEP-ACROSS-MARKED-LINKS", 1, 0, false);
    //declareFunction("sbhl_what_mts_step_and_update_links", "SBHL-WHAT-MTS-STEP-AND-UPDATE-LINKS", 1, 0, false);
    declareFunction("sbhl_what_mts_sweep", "SBHL-WHAT-MTS-SWEEP", 6, 0, false);
    //declareFunction("sbhl_what_mts_sweep_marked", "SBHL-WHAT-MTS-SWEEP-MARKED", 7, 0, false);
    declareFunction("sbhl_what_mts_step", "SBHL-WHAT-MTS-STEP", 5, 0, false);
    //declareFunction("sbhl_what_mts_step_marked", "SBHL-WHAT-MTS-STEP-MARKED", 6, 0, false);
    //declareFunction("sbhl_what_mts_step_and_update_mts", "SBHL-WHAT-MTS-STEP-AND-UPDATE-MTS", 6, 0, false);
    declareFunction("sbhl_simple_true_what_mts_search", "SBHL-SIMPLE-TRUE-WHAT-MTS-SEARCH", 1, 0, false);
    //declareFunction("sbhl_simple_false_what_mts_search", "SBHL-SIMPLE-FALSE-WHAT-MTS-SEARCH", 1, 0, false);
    //declareFunction("sbhl_false_what_mts_step", "SBHL-FALSE-WHAT-MTS-STEP", 1, 0, false);
    //declareFunction("sbhl_false_what_mts_sweep", "SBHL-FALSE-WHAT-MTS-SWEEP", 1, 0, false);
    declareFunction("sbhl_tt_what_mts_search", "SBHL-TT-WHAT-MTS-SEARCH", 1, 0, false);
    declareFunction("sbhl_what_mts_tt_sweep", "SBHL-WHAT-MTS-TT-SWEEP", 1, 0, false);
    //declareFunction("sbhl_what_mts_tt_backward_search", "SBHL-WHAT-MTS-TT-BACKWARD-SEARCH", 1, 0, false);
    //declareFunction("sbhl_what_mts_tt_step", "SBHL-WHAT-MTS-TT-STEP", 1, 0, false);
    //declareFunction("sbhl_what_mts_premark_disjoins", "SBHL-WHAT-MTS-PREMARK-DISJOINS", 1, 0, false);
    //declareFunction("sbhl_what_mts_true_disjoins_search", "SBHL-WHAT-MTS-TRUE-DISJOINS-SEARCH", 1, 0, false);
    //declareFunction("sbhl_what_mts_step_across_marked_disjoins", "SBHL-WHAT-MTS-STEP-ACROSS-MARKED-DISJOINS", 1, 0, false);
    //declareFunction("sbhl_what_mts_sweep_marked_disjoins", "SBHL-WHAT-MTS-SWEEP-MARKED-DISJOINS", 1, 0, false);
    //declareFunction("get_sbhl_what_mts_sweep_disjoins_module", "GET-SBHL-WHAT-MTS-SWEEP-DISJOINS-MODULE", 0, 0, false);
    //declareFunction("sbhl_what_mts_false_disjoins_search", "SBHL-WHAT-MTS-FALSE-DISJOINS-SEARCH", 1, 0, false);
    //declareFunction("sbhl_what_mts_sweep_forward_step_and_sweep_false_disjoins", "SBHL-WHAT-MTS-SWEEP-FORWARD-STEP-AND-SWEEP-FALSE-DISJOINS", 1, 0, false);
    //declareFunction("sbhl_what_mts_sweep_false_disjoins", "SBHL-WHAT-MTS-SWEEP-FALSE-DISJOINS", 1, 0, false);
    declareFunction("determine_sbhl_what_mts_behavior", "DETERMINE-SBHL-WHAT-MTS-BEHAVIOR", 3, 0, false);
    declareFunction("get_sbhl_what_mts_behavior", "GET-SBHL-WHAT-MTS-BEHAVIOR", 0, 0, false);
    //declareMacro("bind_sbhl_what_mts_behavior", "BIND-SBHL-WHAT-MTS-BEHAVIOR");
    declareFunction("sbhl_apply_what_mts_behavior", "SBHL-APPLY-WHAT-MTS-BEHAVIOR", 1, 0, false);
    declareFunction("sbhl_what_mts_terminating_space", "SBHL-WHAT-MTS-TERMINATING-SPACE", 0, 0, false);
    declareFunction("sbhl_what_mts_final_mt_paths", "SBHL-WHAT-MTS-FINAL-MT-PATHS", 1, 0, false);
    declareFunction("sbhl_what_mts_goal_final_mt_paths", "SBHL-WHAT-MTS-GOAL-FINAL-MT-PATHS", 0, 0, false);
    declareFunction("sbhl_predicate_mt_paths", "SBHL-PREDICATE-MT-PATHS", 3, 1, false);
    //declareFunction("sbhl_inverse_mt_paths", "SBHL-INVERSE-MT-PATHS", 3, 1, false);
    //declareFunction("sbhl_false_predicate_mt_paths", "SBHL-FALSE-PREDICATE-MT-PATHS", 3, 1, false);
    //declareFunction("sbhl_false_inverse_mt_paths", "SBHL-FALSE-INVERSE-MT-PATHS", 3, 1, false);
    declareFunction("sbhl_what_mt_paths_from_node_to_node", "SBHL-WHAT-MT-PATHS-FROM-NODE-TO-NODE", 2, 0, false);
    declareFunction("sbhl_min_mt_paths", "SBHL-MIN-MT-PATHS", 1, 0, false);
    declareFunction("sbhl_min_mts_of_predicate_paths", "SBHL-MIN-MTS-OF-PREDICATE-PATHS", 3, 1, false);
    //declareFunction("sbhl_min_mts_of_inverse_paths", "SBHL-MIN-MTS-OF-INVERSE-PATHS", 3, 1, false);
    //declareFunction("sbhl_min_mts_of_false_predicate_paths", "SBHL-MIN-MTS-OF-FALSE-PREDICATE-PATHS", 3, 1, false);
    //declareFunction("sbhl_min_mts_of_false_inverse_paths", "SBHL-MIN-MTS-OF-FALSE-INVERSE-PATHS", 3, 1, false);
    declareFunction("sbhl_max_floor_mts", "SBHL-MAX-FLOOR-MTS", 1, 0, false); new $sbhl_max_floor_mts$UnaryFunction();
    declareFunction("sbhl_max_floor_mts_of_paths", "SBHL-MAX-FLOOR-MTS-OF-PATHS", 1, 0, false);
    declareFunction("sbhl_max_floor_mts_of_predicate_paths", "SBHL-MAX-FLOOR-MTS-OF-PREDICATE-PATHS", 3, 1, false);
    //declareFunction("sbhl_max_floor_mts_of_inverse_paths", "SBHL-MAX-FLOOR-MTS-OF-INVERSE-PATHS", 3, 1, false);
    //declareFunction("sbhl_max_floor_mts_of_false_predicate_paths", "SBHL-MAX-FLOOR-MTS-OF-FALSE-PREDICATE-PATHS", 3, 1, false);
    //declareFunction("sbhl_max_floor_mts_of_false_inverse_paths", "SBHL-MAX-FLOOR-MTS-OF-FALSE-INVERSE-PATHS", 3, 1, false);
    //declareFunction("sbhl_mt_table_of_floors_for_predicate_path", "SBHL-MT-TABLE-OF-FLOORS-FOR-PREDICATE-PATH", 3, 2, false);
    //declareFunction("sbhl_floors_in_space", "SBHL-FLOORS-IN-SPACE", 3, 2, false);
    //declareFunction("sbhl_closure_intersection_in_space", "SBHL-CLOSURE-INTERSECTION-IN-SPACE", 2, 0, false);
    //declareFunction("sbhl_sort_by_least_inverse_cardinality", "SBHL-SORT-BY-LEAST-INVERSE-CARDINALITY", 1, 1, false);
    //declareFunction("sbhl_inverse_cardinalityL", "SBHL-INVERSE-CARDINALITY<", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_search_what_mts_file() {
    $sbhl_path_mts$ = defparameter("*SBHL-PATH-MTS*", NIL);
    $sbhl_what_mts_mt_paths$ = defparameter("*SBHL-WHAT-MTS-MT-PATHS*", NIL);
    $sbhl_what_mts_inverse_mt_paths$ = defparameter("*SBHL-WHAT-MTS-INVERSE-MT-PATHS*", NIL);
    $sbhl_primary_what_mts_mt_paths$ = defparameter("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*", NIL);
    $sbhl_primary_what_mts_inverse_mt_paths$ = defparameter("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*", NIL);
    $sbhl_secondary_what_mts_mt_paths$ = defparameter("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*", NIL);
    $sbhl_secondary_what_mts_inverse_mt_paths$ = defparameter("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*", NIL);
    $sbhl_verify_naut_mt_relevance$ = defparameter("*SBHL-VERIFY-NAUT-MT-RELEVANCE*", NIL);
    $sbhl_what_mts_map_function$ = defparameter("*SBHL-WHAT-MTS-MAP-FUNCTION*", NIL);
    $sbhl_what_mts_goal$ = defparameter("*SBHL-WHAT-MTS-GOAL*", NIL);
    $sbhl_what_mts_behavior$ = defparameter("*SBHL-WHAT-MTS-BEHAVIOR*", NIL);
    return NIL;
  }

  public static final SubLObject setup_sbhl_search_what_mts_file() {
        access_macros.register_macro_helper($sym3$POSSIBLY_UPDATE_SBHL_PATH_MTS, $sym5$SBHL_REBIND_PATH_MTS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym2$_SBHL_PATH_MTS_ = makeSymbol("*SBHL-PATH-MTS*");
  public static final SubLSymbol $sym3$POSSIBLY_UPDATE_SBHL_PATH_MTS = makeSymbol("POSSIBLY-UPDATE-SBHL-PATH-MTS");
  public static final SubLList $list4 = list(makeSymbol("*SBHL-PATH-MTS*"));
  public static final SubLSymbol $sym5$SBHL_REBIND_PATH_MTS = makeSymbol("SBHL-REBIND-PATH-MTS");
  public static final SubLList $list6 = list(list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))), list(makeSymbol("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*"), list(makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"))));
  public static final SubLSymbol $kw7$PRIMARY = makeKeyword("PRIMARY");
  public static final SubLSymbol $kw8$SECONDARY = makeKeyword("SECONDARY");
  public static final SubLList $list9 = list(makeSymbol("SPACE-ID"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym10$_SBHL_WHAT_MTS_MT_PATHS_ = makeSymbol("*SBHL-WHAT-MTS-MT-PATHS*");
  public static final SubLSymbol $sym11$FIF = makeSymbol("FIF");
  public static final SubLList $list12 = list(makeKeyword("PRIMARY"));
  public static final SubLList $list13 = list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-MT-PATHS*"), makeSymbol("*SBHL-SECONDARY-WHAT-MTS-MT-PATHS*"));
  public static final SubLSymbol $sym14$_SBHL_WHAT_MTS_INVERSE_MT_PATHS_ = makeSymbol("*SBHL-WHAT-MTS-INVERSE-MT-PATHS*");
  public static final SubLList $list15 = list(makeSymbol("*SBHL-PRIMARY-WHAT-MTS-INVERSE-MT-PATHS*"), makeSymbol("*SBHL-SECONDARY-WHAT-MTS-INVERSE-MT-PATHS*"));
  public static final SubLList $list16 = list(list(makeSymbol("*SBHL-VERIFY-NAUT-MT-RELEVANCE*"), NIL));
  public static final SubLList $list17 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym18$_SBHL_WHAT_MTS_MAP_FUNCTION_ = makeSymbol("*SBHL-WHAT-MTS-MAP-FUNCTION*");
  public static final SubLSymbol $sym19$SBHL_FALSE_WHAT_MTS_STEP = makeSymbol("SBHL-FALSE-WHAT-MTS-STEP");
  public static final SubLSymbol $sym20$SBHL_FALSE_WHAT_MTS_SWEEP = makeSymbol("SBHL-FALSE-WHAT-MTS-SWEEP");
  public static final SubLSymbol $sym21$SBHL_WHAT_MTS_TT_SWEEP = makeSymbol("SBHL-WHAT-MTS-TT-SWEEP");
  public static final SubLSymbol $sym22$SBHL_WHAT_MTS_TT_STEP = makeSymbol("SBHL-WHAT-MTS-TT-STEP");
  public static final SubLSymbol $sym23$SBHL_WHAT_MTS_STEP_ACROSS_MARKED_DISJOINS = makeSymbol("SBHL-WHAT-MTS-STEP-ACROSS-MARKED-DISJOINS");
  public static final SubLSymbol $sym24$SBHL_WHAT_MTS_SWEEP_MARKED_DISJOINS = makeSymbol("SBHL-WHAT-MTS-SWEEP-MARKED-DISJOINS");
  public static final SubLSymbol $sym25$SBHL_WHAT_MTS_SWEEP_FORWARD_STEP_AND_SWEEP_FALSE_DISJOINS = makeSymbol("SBHL-WHAT-MTS-SWEEP-FORWARD-STEP-AND-SWEEP-FALSE-DISJOINS");
  public static final SubLSymbol $sym26$SBHL_WHAT_MTS_SWEEP_FALSE_DISJOINS = makeSymbol("SBHL-WHAT-MTS-SWEEP-FALSE-DISJOINS");
  public static final SubLList $list27 = list(makeSymbol("NODE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym28$_SBHL_WHAT_MTS_GOAL_ = makeSymbol("*SBHL-WHAT-MTS-GOAL*");
  public static final SubLObject $const29$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLObject $const30$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLString $str31$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLSymbol $sym32$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLSymbol $sym33$SBHL_CHECK_CUTOFF = makeSymbol("SBHL-CHECK-CUTOFF");
  public static final SubLObject $const34$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $sym35$SBHL_SIMPLE_TRUE_WHAT_MTS_SEARCH = makeSymbol("SBHL-SIMPLE-TRUE-WHAT-MTS-SEARCH");
  public static final SubLSymbol $sym36$SBHL_SIMPLE_FALSE_WHAT_MTS_SEARCH = makeSymbol("SBHL-SIMPLE-FALSE-WHAT-MTS-SEARCH");
  public static final SubLSymbol $sym37$SBHL_TT_WHAT_MTS_SEARCH = makeSymbol("SBHL-TT-WHAT-MTS-SEARCH");
  public static final SubLSymbol $sym38$SBHL_WHAT_MTS_TT_BACKWARD_SEARCH = makeSymbol("SBHL-WHAT-MTS-TT-BACKWARD-SEARCH");
  public static final SubLSymbol $sym39$SBHL_WHAT_MTS_TRUE_DISJOINS_SEARCH = makeSymbol("SBHL-WHAT-MTS-TRUE-DISJOINS-SEARCH");
  public static final SubLSymbol $sym40$SBHL_WHAT_MTS_FALSE_DISJOINS_SEARCH = makeSymbol("SBHL-WHAT-MTS-FALSE-DISJOINS-SEARCH");
  public static final SubLString $str41$Search_behavior_not_recognized__S = makeString("Search behavior not recognized. Sorry.");
  public static final SubLList $list42 = list(list(makeSymbol("*SBHL-WHAT-MTS-BEHAVIOR*"), list(makeSymbol("DETERMINE-SBHL-WHAT-MTS-BEHAVIOR"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")), list(makeSymbol("GET-SBHL-SEARCH-DIRECTION")), list(makeSymbol("GET-SBHL-TV")))));
  public static final SubLString $str43$Unsupported_what_mts_behavior__a = makeString("Unsupported what mts behavior ~a");
  public static final SubLSymbol $sym44$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw45$ERROR = makeKeyword("ERROR");
  public static final SubLString $str46$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym47$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw48$CERROR = makeKeyword("CERROR");
  public static final SubLString $str49$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw50$WARN = makeKeyword("WARN");
  public static final SubLString $str51$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const52$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));
  public static final SubLSymbol $kw53$OLD = makeKeyword("OLD");
  public static final SubLSymbol $kw54$RESOURCE = makeKeyword("RESOURCE");
  public static final SubLSymbol $sym55$SBHL_FALSE_TV_P = makeSymbol("SBHL-FALSE-TV-P");
  public static final SubLObject $const56$False_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("False-JustificationTruth"));
  public static final SubLSymbol $kw57$WHAT_MTS = makeKeyword("WHAT-MTS");
  public static final SubLSymbol $sym58$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const59$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const60$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $sym61$UNION = makeSymbol("UNION");
  public static final SubLSymbol $sym62$SBHL_MAX_FLOOR_MTS = makeSymbol("SBHL-MAX-FLOOR-MTS");
  public static final SubLString $str63$Mts_might_not_be_valid_because_in = makeString("Mts might not be valid because initial node was a NAUT which used complicated link generation.");
  public static final SubLSymbol $kw64$NONE = makeKeyword("NONE");
  public static final SubLSymbol $sym65$SBHL_INVERSE_CARDINALITY_ = makeSymbol("SBHL-INVERSE-CARDINALITY<");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_search_what_mts_file();
  }

  public void initializeVariables() {
    init_sbhl_search_what_mts_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_search_what_mts_file();
  }

}
