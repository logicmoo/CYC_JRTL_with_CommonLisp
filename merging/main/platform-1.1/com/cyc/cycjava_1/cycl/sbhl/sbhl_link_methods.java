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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;

public  final class sbhl_link_methods extends SubLTranslatedFile {

  //// Constructor

  private sbhl_link_methods() {}
  public static final SubLFile me = new sbhl_link_methods();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods";

  //// Definitions

  /** Accessor: Takes NODE and DIRECTION, determines sbhl-graph from *sbhl-module*,
   returns mt-links dictionary from DIRECTION field of direction-link. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 828) 
  public static final SubLObject sbhl_access_links(SubLObject node, SubLObject direction) {
    {
      SubLObject result = NIL;
      SubLObject link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
      result = sbhl_links.get_sbhl_mt_links(link, direction, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
      return result;
    }
  }

  /** Accessor: Takes NODE, DIRECTION, MT, and TV. Returns list of nodes for
   TV field of tv-link specified by MT and DIRECTION. Requires *sbhl-module*
   to be defined. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 3123) 
  public static final SubLObject get_sbhl_graph_link_nodes(SubLObject node, SubLObject direction, SubLObject mt, SubLObject tv) {
    {
      SubLObject mt_links = sbhl_access_links(node, direction);
      if ((NIL != mt_links)) {
        {
          SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
          if ((NIL != tv_links)) {
            return sbhl_links.get_sbhl_link_nodes(tv_links, tv);
          }
        }
      }
    }
    return NIL;
  }

  /** Accessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of
   tv-link specified by MT, and in either direction :predicate or :links,
   depending on whether the module specifies directed or undirected links.
   Requires *sbhl-module* to be defined. @see get-sbhl-link */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 3572) 
  public static final SubLObject get_sbhl_forward_link_nodes(SubLObject node, SubLObject mt, SubLObject tv) {
    return get_sbhl_graph_link_nodes(node, sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), mt, tv);
  }

  /** Accessor: Takes NODE, MT, and TV. Returns list of nodes for TV field of
   tv-link specified by MT, and in either direction :inverse or :link,
   depending on whether the module specifies directed or undirected links.
   Requires *sbhl-module* to be defined. @see get-sbhl-link */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 4019) 
  public static final SubLObject get_sbhl_backward_link_nodes(SubLObject node, SubLObject mt, SubLObject tv) {
    return get_sbhl_graph_link_nodes(node, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), mt, tv);
  }

  /** @return listp; the asserted link nodes accessible by NODE via one
   sbhl-link-pred link, as specified by (get-sbhl-module), with
   sbhl-true? truth value. When MT is specified, returns those links
   within MT or one of its spec-mts; otherwise, uses current value of
   *mt*, @see possibly-with-sbhl-mt-relevance. When TV is specified, check that it is
   #$ArbitraryTruth-JustificationTruth or one of its spec-attributes,
   and returns those links with relevant truth value; otherwise,
   assumes TV to be *sbhl-tv*; @see possibly-with-sbhl-tv. When
   WITH-CUTOFF-SUPPORT? is non-nil, calls
   @see predicate-true-links-by-iteration. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 6493) 
  public static final SubLObject sbhl_link_nodes(SubLObject module, SubLObject node, SubLObject direction, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((with_cutoff_supportP == UNPROVIDED)) {
      with_cutoff_supportP = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym4$SBHL_MODULE_P);
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject mt_var = mt;
              {
                SubLObject _prev_bind_0_10 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                try {
                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                  {
                    SubLObject tv_var = tv;
                    {
                      SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                      SubLObject _prev_bind_1_12 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                      try {
                        sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread)), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                        if ((NIL != tv_var)) {
                          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                            if ((NIL == sbhl_search_vars.sbhl_search_truth_value_p(tv_var))) {
                              {
                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($kw6$ERROR)) {
                                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else if (pcase_var.eql($kw9$CERROR)) {
                                  Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2169");
                                } else if (pcase_var.eql($kw11$WARN)) {
                                  Errors.warn($str7$_A_is_not_a__A, tv_var, $sym8$SBHL_SEARCH_TRUTH_VALUE_P);
                                } else {
                                  Errors.warn($str12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                  Errors.cerror($str10$continue_anyway, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_SEARCH_TRUTH_VALUE_P);
                                }
                              }
                            }
                          }
                        }
                        if ((NIL != with_cutoff_supportP)) {
                          result = Errors
								.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1859");
                        } else {
                          {
                            SubLObject node_13 = function_terms.naut_to_nart(node);
                            if ((NIL != sbhl_link_vars.sbhl_node_object_p(node_13))) {
                              {
                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node_13, module);
                                if ((NIL != d_link)) {
                                  {
                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                                    if ((NIL != mt_links)) {
                                      {
                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                                          thread.resetMultipleValues();
                                          {
                                            SubLObject mt_14 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if ((NIL != mt_relevance_macros.relevant_mtP(mt_14))) {
                                              {
                                                SubLObject _prev_bind_0_15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                try {
                                                  sbhl_link_vars.$sbhl_link_mt$.bind(mt_14, thread);
                                                  {
                                                    SubLObject iteration_state_16 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                    while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_16))) {
                                                      thread.resetMultipleValues();
                                                      {
                                                        SubLObject tv_17 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_16);
                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if ((NIL != sbhl_search_vars.relevant_sbhl_tvP(tv_17))) {
                                                          {
                                                            SubLObject _prev_bind_0_18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                            try {
                                                              sbhl_link_vars.$sbhl_link_tv$.bind(tv_17, thread);
                                                              result = ConsesLow.nconc(conses_high.copy_list(link_nodes), result);
                                                            } finally {
                                                              sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_18, thread);
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
                                  sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str3$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                              }
                            } else if ((NIL != obsolete.cnat_p(node_13, UNPROVIDED))) {
                              {
                                SubLObject new_list = ((NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9312")) : Errors
										.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2701"));
                                SubLObject cdolist_list_var = new_list;
                                SubLObject generating_fn = NIL;
                                for (generating_fn = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), generating_fn = cdolist_list_var.first()) {
                                  {
                                    SubLObject _prev_bind_0_19 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                    try {
                                      sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                      {
                                        SubLObject link_nodes = Functions.funcall(generating_fn, node_13);
                                        result = ConsesLow.nconc(conses_high.copy_list(link_nodes), result);
                                      }
                                    } finally {
                                      sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_19, thread);
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_12, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_11, thread);
                      }
                    }
                  }
                } finally {
                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_10, thread);
                }
              }
            }
          } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
          }
        }
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 8083) 
  public static final SubLObject sbhl_forward_true_link_nodes(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((with_cutoff_supportP == UNPROVIDED)) {
      with_cutoff_supportP = NIL;
    }
    checkType(module, $sym4$SBHL_MODULE_P);
    {
      SubLObject direction = sbhl_module_utilities.get_sbhl_module_forward_direction(module);
      if ((NIL != sbhl_search_vars.sbhl_true_tv_p(tv))) {
        return sbhl_link_nodes(module, node, direction, mt, tv, with_cutoff_supportP);
      } else if ((NIL == tv)) {
        return sbhl_link_nodes(module, node, direction, mt, $const13$True_JustificationTruth, with_cutoff_supportP);
      } else {
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$tv___a__does_not_satisfy_sbhl_tru, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str15$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 9240) 
  public static final SubLObject sbhl_backward_true_link_nodes(SubLObject module, SubLObject node, SubLObject mt, SubLObject tv, SubLObject with_cutoff_supportP) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((with_cutoff_supportP == UNPROVIDED)) {
      with_cutoff_supportP = NIL;
    }
    checkType(module, $sym4$SBHL_MODULE_P);
    {
      SubLObject direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
      if ((NIL != sbhl_search_vars.sbhl_true_tv_p(tv))) {
        return sbhl_link_nodes(module, node, direction, mt, tv, with_cutoff_supportP);
      } else if ((NIL == tv)) {
        return sbhl_link_nodes(module, node, direction, mt, $const13$True_JustificationTruth, with_cutoff_supportP);
      } else {
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str14$tv___a__does_not_satisfy_sbhl_tru, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str15$sbhl_link_nodes_never_called_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    return NIL;
  }

  /** @return listp; Assumes TRUE tv, and forward direction and returns
   the link-nodes of NODE in MODULE which match MT */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 10923) 
  public static final SubLObject sbhl_mt_matching_link_nodes(SubLObject module, SubLObject node, SubLObject mt) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym4$SBHL_MODULE_P);
      {
        SubLObject result = NIL;
        {
          SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            {
              SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, module);
              if ((NIL != d_link)) {
                {
                  SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(module);
                  SubLObject direction = NIL;
                  for (direction = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), direction = cdolist_list_var.first()) {
                    {
                      SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module);
                      if ((NIL != mt_links)) {
                        if ((NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction))) {
                          {
                            SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
                            if ((NIL != tv_links)) {
                              {
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
                                  thread.resetMultipleValues();
                                  {
                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject link_nodes = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if ((NIL != sbhl_search_vars.sbhl_true_tv_p(tv))) {
                                      {
                                        SubLObject cdolist_list_var_30 = link_nodes;
                                        SubLObject link_node = NIL;
                                        for (link_node = cdolist_list_var_30.first(); (NIL != cdolist_list_var_30); cdolist_list_var_30 = cdolist_list_var_30.rest(), link_node = cdolist_list_var_30.first()) {
                                          result = cons(link_node, result);
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
                    }
                  }
                }
              }
            }
          } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
          }
        }
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
  }

  /** Returns a new sbhl direction link created from scratch from args. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 12676) 
  public static final SubLObject create_new_sbhl_link(SubLObject direction, SubLObject mt, SubLObject tv, SubLObject node, SubLObject module) {
    if ((module == UNPROVIDED)) {
      module = NIL;
    }
    if ((NIL != module)) {
      checkType(module, $sym4$SBHL_MODULE_P);
    }
    {
      SubLObject link = NIL;
      link = sbhl_links.create_sbhl_direction_link(direction, sbhl_links.create_sbhl_mt_links(mt, sbhl_links.create_sbhl_tv_links(tv, node)), module);
      return link;
    }
  }

  /** stores a new link in the graph corresponding to MODULE using args to initialize the link */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 13313) 
  public static final SubLObject create_and_store_sbhl_link(SubLObject arg1, SubLObject arg2, SubLObject direction, SubLObject mt, SubLObject tv, SubLObject module) {
    if ((NIL != module)) {
      checkType(module, $sym4$SBHL_MODULE_P);
    }
    sbhl_graphs.set_sbhl_graph_link(arg1, create_new_sbhl_link(direction, mt, tv, arg2, module), module);
    return NIL;
  }

  /** Workhorse of link creation. Checks OLD-LINK and creates the necessary link substructures,
   returns the new direction link */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 13634) 
  public static final SubLObject add_to_sbhl_link(SubLObject old_link, SubLObject mt, SubLObject direction, SubLObject tv, SubLObject node) {
    {
      SubLObject link = old_link;
      SubLObject mt_links = sbhl_links.get_sbhl_mt_links(link, direction, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
      if ((NIL != mt_links)) {
        {
          SubLObject tv_links = sbhl_links.get_sbhl_tv_links(mt_links, mt);
          if ((NIL != tv_links)) {
            sbhl_links.push_onto_sbhl_tv_links(tv_links, tv, node);
          } else {
            sbhl_links.set_sbhl_mt_links(mt_links, mt, sbhl_links.create_sbhl_tv_links(tv, node));
          }
        }
      } else {
        sbhl_links.set_sbhl_direction_link(link, direction, sbhl_links.create_sbhl_mt_links(mt, sbhl_links.create_sbhl_tv_links(tv, node)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
      }
      return link;
    }
  }

  /** Calculates forward and backward links relevant to GAF specified by the arguments.
   Store the link, creating proper substructures through @see add-to-sbhl-link,
   create-and-store-sbhl-link. Will not add redundant links. Determines direction of
   link with @see get-sbhl-index-arg. Requires *sbhl-module* to be defined. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 15232) 
  public static final SubLObject store_in_sbhl_graph(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
    if (((NIL != sbhl_link_vars.sbhl_node_object_p(arg1))
         && (NIL != sbhl_link_vars.sbhl_node_object_p(arg2)))) {
      if ((tv != $kw18$UNKNOWN)) {
        {
          SubLObject module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
          if ((!(((NIL != sbhl_module_utilities.sbhl_reflexive_module_p(module))
                 && arg1.equal(arg2))))) {
            {
              SubLObject module_index_arg = sbhl_module_utilities.get_sbhl_index_arg(module);
              SubLObject index_arg = ((module_index_arg == ONE_INTEGER) ? ((SubLObject) arg1) : arg2);
              SubLObject gather_arg = ((module_index_arg == ONE_INTEGER) ? ((SubLObject) arg2) : arg1);
              SubLObject forward_direction = sbhl_module_utilities.get_sbhl_module_forward_direction(module);
              SubLObject backward_direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
              SubLObject forward_link = sbhl_graphs.get_sbhl_graph_link(index_arg, module);
              SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
              SubLObject needs_to_releaseP = NIL;
              try {
                needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
                if ((NIL != forward_link)) {
                  {
                    SubLObject forward_link_nodes = get_sbhl_forward_link_nodes(index_arg, mt, tv);
                    if ((NIL == list_utilities.member_eqP(gather_arg, forward_link_nodes))) {
                      add_to_sbhl_link(forward_link, mt, forward_direction, tv, gather_arg);
                      sbhl_graphs.touch_sbhl_graph_link(index_arg, forward_link, module);
                    }
                  }
                } else {
                  create_and_store_sbhl_link(index_arg, gather_arg, forward_direction, mt, tv, module);
                }
                {
                  SubLObject backward_link = sbhl_graphs.get_sbhl_graph_link(gather_arg, module);
                  if ((NIL != backward_link)) {
                    {
                      SubLObject backward_link_nodes = get_sbhl_backward_link_nodes(gather_arg, mt, tv);
                      if ((NIL == list_utilities.member_eqP(index_arg, backward_link_nodes))) {
                        add_to_sbhl_link(backward_link, mt, backward_direction, tv, index_arg);
                        sbhl_graphs.touch_sbhl_graph_link(gather_arg, backward_link, module);
                      }
                    }
                  } else {
                    create_and_store_sbhl_link(gather_arg, index_arg, backward_direction, mt, tv, module);
                  }
                }
              } finally {
                if ((NIL != needs_to_releaseP)) {
                  ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
                }
              }
            }
          }
        }
      }
    } else if ((NIL != isa_to_naut_conditionsP(arg1, arg2))) {
      {
        SubLObject rw_lock_var = sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue();
        SubLObject needs_to_releaseP = NIL;
        try {
          needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1914");
        } finally {
          if ((NIL != needs_to_releaseP)) {
            ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 17909) 
  public static final SubLObject assertion_sbhl_tv(SubLObject assertion) {
    {
      SubLObject truth = assertions_high.assertion_truth(assertion);
      SubLObject strength = assertions_high.assertion_strength(assertion);
      return sbhl_link_vars.truth_strength_to_sbhl_tv(truth, strength);
    }
  }

  /** after adding support. adds necessary link structure and data to store
  gaf assertion specified by the arguments. @see store-in-sbhl-graph. requires 
  (get-sbhl-module) to be bound for the (get-sbhl-link-pred .. ) reference. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 20909) 
  public static final SubLObject add_sbhl_link(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      store_in_sbhl_graph(arg1, arg2, mt, tv);
      if ((!(((tv == $kw18$UNKNOWN)
            || ((NIL != sbhl_module_utilities.sbhl_reflexive_module_p(sbhl_module_vars.get_sbhl_module(UNPROVIDED)))
               && arg1.equal(arg2)))))) {
        if (sbhl_paranoia.$sbhl_trace_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2246");
        }
        if (sbhl_paranoia.$sbhl_test_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
          {
            SubLObject module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
            SubLObject module_index_arg = sbhl_module_utilities.get_sbhl_index_arg(module);
            SubLObject index_arg = ((module_index_arg == ONE_INTEGER) ? ((SubLObject) arg1) : arg2);
            SubLObject gather_arg = ((module_index_arg == ONE_INTEGER) ? ((SubLObject) arg2) : arg1);
            if ((NIL == subl_promotions.memberP(gather_arg, get_sbhl_graph_link_nodes(index_arg, sbhl_module_utilities.get_sbhl_module_forward_direction(module), mt, tv), UNPROVIDED, UNPROVIDED))) {
              sbhl_paranoia.sbhl_error(THREE_INTEGER, $str25$Link_node___a__not_present_in_for, gather_arg, arg1, arg2, mt, tv);
            }
            if ((NIL == subl_promotions.memberP(index_arg, get_sbhl_graph_link_nodes(gather_arg, sbhl_module_utilities.get_sbhl_module_backward_direction(module), mt, tv), UNPROVIDED, UNPROVIDED))) {
              sbhl_paranoia.sbhl_error(THREE_INTEGER, $str26$Link_node___a__not_present_in_bac, index_arg, arg1, arg2, mt, tv);
            }
          }
        }
      }
      return NIL;
    }
  }

  /** more indirection on top of after adding procedure. @see add-sbhl-link. binds the sbhl pred data corresponding to MODULE. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 22600) 
  public static final SubLObject sbhl_after_adding(SubLObject source, SubLObject assertion, SubLObject module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym4$SBHL_MODULE_P);
      {
        SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        SubLObject _prev_bind_1 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
          sbhl_link_vars.$added_source$.bind(source, thread);
          sbhl_link_vars.$added_assertion$.bind(assertion, thread);
          {
            SubLObject tv = assertion_sbhl_tv(assertion);
            SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject arg1 = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            SubLObject arg2 = assertions_high.gaf_arg(assertion, TWO_INTEGER);
            {
              SubLObject _prev_bind_0_39 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
              try {
                sbhl_module_vars.$sbhl_module$.bind(module, thread);
                add_sbhl_link(arg1, arg2, mt, tv);
              } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_39, thread);
              }
            }
          }
        } finally {
          sbhl_link_vars.$added_assertion$.rebind(_prev_bind_1, thread);
          sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 25231) 
  public static final SubLObject remove_sbhl_link(SubLObject arg1, SubLObject arg2, SubLObject mt, SubLObject tv) {
    {
      SubLObject module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
      SubLObject forward_direction = sbhl_module_utilities.get_sbhl_module_forward_direction(module);
      SubLObject backward_direction = sbhl_module_utilities.get_sbhl_module_backward_direction(module);
      SubLObject arg1_graph_link = sbhl_graphs.get_sbhl_graph_link(arg1, module);
      SubLObject arg2_graph_link = sbhl_graphs.get_sbhl_graph_link(arg2, module);
      SubLObject arg1_mt_links = ((NIL != arg1_graph_link) ? ((SubLObject) sbhl_links.get_sbhl_mt_links(arg1_graph_link, forward_direction, module)) : NIL);
      SubLObject arg2_mt_links = ((NIL != arg2_graph_link) ? ((SubLObject) sbhl_links.get_sbhl_mt_links(arg2_graph_link, backward_direction, module)) : NIL);
      SubLObject arg1_tv_links = ((NIL != arg1_mt_links) ? ((SubLObject) sbhl_links.get_sbhl_tv_links(arg1_mt_links, mt)) : NIL);
      SubLObject arg2_tv_links = ((NIL != arg2_mt_links) ? ((SubLObject) sbhl_links.get_sbhl_tv_links(arg2_mt_links, mt)) : NIL);
      if ((NIL != sbhl_links.member_of_tv_linksP(arg2, tv, arg1_tv_links))) {
        sbhl_links.remove_sbhl_tv_link_node(arg1_tv_links, tv, arg2);
        if ((NIL != sbhl_link_utilities.empty_tv_link_p(tv, arg1_tv_links))) {
          sbhl_links.remove_sbhl_tv_link(arg1_tv_links, tv);
        }
        if ((NIL != sbhl_link_utilities.empty_mt_link_p(mt, arg1_mt_links))) {
          sbhl_links.remove_sbhl_mt_link(arg1_mt_links, mt);
        }
        if ((NIL != sbhl_link_utilities.empty_direction_link_p(forward_direction, arg1_graph_link))) {
          sbhl_links.remove_sbhl_direction_link(arg1_graph_link, forward_direction, module);
        }
        if ((NIL != sbhl_link_utilities.empty_graph_link_p(arg1, module))) {
          sbhl_graphs.remove_sbhl_graph_link(arg1, module);
        } else {
          sbhl_graphs.touch_sbhl_graph_link(arg1, arg1_graph_link, module);
        }
      }
      if ((NIL != sbhl_links.member_of_tv_linksP(arg1, tv, arg2_tv_links))) {
        sbhl_links.remove_sbhl_tv_link_node(arg2_tv_links, tv, arg1);
        if ((NIL != sbhl_link_utilities.empty_tv_link_p(tv, arg2_tv_links))) {
          sbhl_links.remove_sbhl_tv_link(arg2_tv_links, tv);
        }
        if ((NIL != sbhl_link_utilities.empty_mt_link_p(mt, arg2_mt_links))) {
          sbhl_links.remove_sbhl_mt_link(arg2_mt_links, mt);
        }
        if ((NIL != sbhl_link_utilities.empty_direction_link_p(backward_direction, arg2_graph_link))) {
          sbhl_links.remove_sbhl_direction_link(arg2_graph_link, backward_direction, module);
        }
        if ((NIL != sbhl_link_utilities.empty_graph_link_p(arg2, module))) {
          sbhl_graphs.remove_sbhl_graph_link(arg2, module);
        } else {
          sbhl_graphs.touch_sbhl_graph_link(arg2, arg2_graph_link, module);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 27170) 
  public static final SubLObject sbhl_after_removing(SubLObject source, SubLObject assertion, SubLObject module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(module, $sym4$SBHL_MODULE_P);
      if ((NIL == kb_accessors.assertion_still_thereP(assertion, assertions_high.assertion_truth(assertion)))) {
        {
          SubLObject tv = assertion_sbhl_tv(assertion);
          SubLObject mt = assertions_high.assertion_mt(assertion);
          SubLObject arg1 = assertions_high.gaf_arg(assertion, ONE_INTEGER);
          SubLObject arg2 = assertions_high.gaf_arg(assertion, TWO_INTEGER);
          {
            SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
              sbhl_module_vars.$sbhl_module$.bind(module, thread);
              if ((NIL != isa_to_naut_conditionsP(arg1, arg2))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1807");
              } else {
                remove_sbhl_link(arg1, arg2, mt, tv);
              }
            } finally {
              sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 27690) 
  public static final SubLObject possibly_update_sbhl_links_tv(SubLObject assertion, SubLObject old_tv) {
    if ((NIL != assertions_high.gaf_assertionP(assertion))) {
      {
        SubLObject new_tv = assertion_sbhl_tv(assertion);
        old_tv = sbhl_link_vars.support_tv_to_sbhl_tv(old_tv);
        if ((new_tv != old_tv)) {
          {
            SubLObject pred = assertions_high.gaf_predicate(assertion);
            if ((NIL != sbhl_module_utilities.sbhl_predicate_p(pred))) {
              sbhl_after_tv_modification(assertion, old_tv, sbhl_module_vars.get_sbhl_module(pred));
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 28123) 
  public static final SubLObject sbhl_after_tv_modification(SubLObject assertion, SubLObject old_tv, SubLObject module) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject tv = assertion_sbhl_tv(assertion);
        SubLObject mt = assertions_high.assertion_mt(assertion);
        SubLObject arg1 = assertions_high.gaf_arg(assertion, ONE_INTEGER);
        SubLObject arg2 = assertions_high.gaf_arg(assertion, TWO_INTEGER);
        {
          SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
          try {
            sbhl_module_vars.$sbhl_module$.bind(module, thread);
            if ((NIL != isa_to_naut_conditionsP(arg1, arg2))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1808");
            } else {
              remove_sbhl_link(arg1, arg2, mt, old_tv);
            }
            add_sbhl_link(arg1, arg2, mt, tv);
          } finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  /** Store for isa links that have the a NAUT in the arg2 position. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 28556) 
  public static SubLSymbol $isa_arg2_naut_table$ = null;

  /** Initializes *isa-arg2-naut-table*. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 28828) 
  public static final SubLObject initialize_isa_arg2_naut_table() {
    $isa_arg2_naut_table$.setGlobalValue(Hashtables.make_hash_table($int31$200, UNPROVIDED, UNPROVIDED));
    return NIL;
  }

  /** @return booleanp; Whether TERM has any direct isas which are NAUTs. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 29220) 
  public static final SubLObject isa_stored_naut_arg2_p(SubLObject v_term) {
    return makeBoolean(($isa_arg2_naut_table$.getGlobalValue().isHashtable()
           && (NIL != list_utilities.sublisp_boolean(Hashtables.gethash(v_term, $isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED)))));
  }

  /** Return booleanp;  Returns whether looking for (isa ARG1 ARG2) in the NAUT table is applicable. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 29937) 
  public static final SubLObject isa_to_naut_conditionsP(SubLObject arg1, SubLObject arg2) {
    return makeBoolean(((sbhl_module_utilities.get_sbhl_link_pred(sbhl_module_vars.get_sbhl_module(UNPROVIDED)) == $const32$isa)
           && (NIL != sbhl_link_vars.sbhl_node_object_p(arg1))
           && (NIL != el_utilities.possibly_naut_p(arg2))));
  }

  /** Store for quotedIsa links that have the a NAUT in the arg2 position. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 32038) 
  public static SubLSymbol $quoted_isa_arg2_naut_table$ = null;

  /** Initializes *quoted-isa-arg2-naut-table*. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 32395) 
  public static final SubLObject initialize_quoted_isa_arg2_naut_table() {
    $quoted_isa_arg2_naut_table$.setGlobalValue(Hashtables.make_hash_table($int31$200, UNPROVIDED, UNPROVIDED));
    return NIL;
  }

  /** @return booleanp; Whether TERM has any direct isas which are NAUTs. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 32843) 
  public static final SubLObject quoted_isa_stored_naut_arg2_p(SubLObject v_term) {
    return makeBoolean(($quoted_isa_arg2_naut_table$.getGlobalValue().isHashtable()
           && (NIL != list_utilities.sublisp_boolean(Hashtables.gethash(v_term, $quoted_isa_arg2_naut_table$.getGlobalValue(), UNPROVIDED)))));
  }

  /** An #'equal hash table mapping non-forts to their direct isas */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 35898) 
  private static SubLSymbol $non_fort_isa_table$ = null;

  /** An #'eq hash table mapping collections to their non-fort direct instances */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 36167) 
  private static SubLSymbol $non_fort_instance_table$ = null;

  /** For use by the dumper ONLY */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 36798) 
  public static final SubLObject set_non_fort_isa_table(SubLObject table) {
    checkType(table, $sym78$HASH_TABLE_P);
    $non_fort_isa_table$.setGlobalValue(table);
    return NIL;
  }

  /** For use by the dumper ONLY */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 36984) 
  public static final SubLObject set_non_fort_instance_table(SubLObject table) {
    checkType(table, $sym78$HASH_TABLE_P);
    $non_fort_instance_table$.setGlobalValue(table);
    return NIL;
  }

  /** For use by ONLY the dumper. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 37159) 
  public static final SubLObject non_fort_isa_table() {
    return $non_fort_isa_table$.getGlobalValue();
  }

  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 37423) 
  public static final SubLObject non_fort_isa_tables_unbuiltP() {
    return makeBoolean(((NIL != misc_utilities.uninitialized_p($non_fort_isa_table$.getGlobalValue()))
          || (NIL != misc_utilities.uninitialized_p($non_fort_instance_table$.getGlobalValue()))));
  }

  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 38203) 
  public static final SubLObject non_fort_isaP(SubLObject ins, SubLObject col, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(ins, $sym83$NON_FORT_P);
      {
        SubLObject resultP = NIL;
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
                SubLObject _prev_bind_0_56 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                SubLObject _prev_bind_1_57 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                  sbhl_search_vars.$sbhl_tv$.bind(((NIL != tv_var) ? ((SubLObject) tv_var) : sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread)), thread);
                  sbhl_search_vars.$relevant_sbhl_tv_function$.bind(((NIL != tv_var) ? ((SubLObject) $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                  if ((NIL != tv_var)) {
                    if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
                      if ((NIL == sbhl_search_vars.sbhl_search_truth_value_p(tv_var))) {
                        {
                          SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                          if (pcase_var.eql($kw6$ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                          } else if (pcase_var.eql($kw9$CERROR)) {
                            Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2170");
                          } else if (pcase_var.eql($kw11$WARN)) {
                            Errors.warn($str7$_A_is_not_a__A, tv_var, $sym8$SBHL_SEARCH_TRUTH_VALUE_P);
                          } else {
                            Errors.warn($str12$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror($str10$continue_anyway, $str7$_A_is_not_a__A, tv_var, $sym8$SBHL_SEARCH_TRUTH_VALUE_P);
                          }
                        }
                      }
                    }
                  }
                  if ((NIL == resultP)) {
                    {
                      SubLObject csome_list_var = Hashtables.gethash_without_values(ins, non_fort_isa_table(), UNPROVIDED);
                      SubLObject isa_tuple = NIL;
                      for (isa_tuple = csome_list_var.first(); (!(((NIL != resultP)
                            || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), isa_tuple = csome_list_var.first()) {
                        {
                          SubLObject datum = isa_tuple;
                          SubLObject current = datum;
                          SubLObject candidate_col = NIL;
                          SubLObject table_mt = NIL;
                          SubLObject table_tv = NIL;
                          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list84);
                          candidate_col = current.first();
                          current = current.rest();
                          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list84);
                          table_mt = current.first();
                          current = current.rest();
                          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list84);
                          table_tv = current.first();
                          current = current.rest();
                          if ((NIL == current)) {
                            if (((NIL != mt_relevance_macros.relevant_mtP(table_mt))
                                 && (NIL != sbhl_search_vars.relevant_sbhl_tvP(table_tv)))) {
                              if ((NIL != genls.genlsP(candidate_col, col, mt, tv))) {
                                resultP = T;
                              }
                            }
                          } else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, $list84);
                          }
                        }
                      }
                    }
                  }
                } finally {
                  sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_57, thread);
                  sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_56, thread);
                }
              }
            }
          } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
          }
        }
        return resultP;
      }
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 39153) 
  public static final SubLObject non_fort_instance_table_lookup(SubLObject col) {
    return Hashtables.gethash_without_values(col, $non_fort_instance_table$.getGlobalValue(), UNPROVIDED);
  }

  /** Called by the afterAdding for #$isa */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 39273) 
  public static final SubLObject possibly_add_non_fort_isa(SubLObject gaf) {
    {
      SubLObject ins = assertions_high.gaf_arg1(gaf);
      if ((NIL != forts.non_fort_p(ins))) {
        if ((NIL != assertion_utilities.true_assertionP(gaf))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1763");
          return T;
        }
      }
    }
    return NIL;
  }

  /** Called by the afterRemoving for #$isa */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 39533) 
  public static final SubLObject possibly_remove_non_fort_isa(SubLObject gaf) {
    {
      SubLObject ins = assertions_high.gaf_arg1(gaf);
      if ((NIL != forts.non_fort_p(ins))) {
        if ((NIL != assertion_utilities.true_assertionP(gaf))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1809");
          return T;
        }
      }
    }
    return NIL;
  }

  /** @return fort-p; the first term found that appears in the arg 2
   position of a gaf with predicate of MODULE, arg1 NODE, and mt
   relevance MT. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 43534) 
  public static final SubLObject sbhl_any_asserted_true_links(SubLObject module, SubLObject node, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    checkType(module, $sym4$SBHL_MODULE_P);
    return kb_mapping_utilities.some_pred_value_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, $kw82$TRUE);
  }

  /** @return listp; the link-nodes in assertions satisfying
   (PRED NODE link-node) where PRED is MODULE's link predicate. */
  @SubL(source = "cycl/sbhl/sbhl-link-methods.lisp", position = 43997) 
  public static final SubLObject sbhl_asserted_true_links(SubLObject module, SubLObject node, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    checkType(module, $sym4$SBHL_MODULE_P);
    if ((NIL != sbhl_module_utilities.sbhl_module_directed_linksP(module))) {
      return kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $kw82$TRUE);
    } else {
      return ConsesLow.nconc(kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, ONE_INTEGER, TWO_INTEGER, $kw82$TRUE), kb_mapping_utilities.pred_values_in_relevant_mts(node, sbhl_module_vars.get_sbhl_module_link_pred(module), mt, TWO_INTEGER, ONE_INTEGER, $kw82$TRUE));
    }
  }

  public static final SubLObject declare_sbhl_link_methods_file() {
    declareFunction("sbhl_access_links", "SBHL-ACCESS-LINKS", 2, 0, false);
    //declareFunction("sbhl_predicate_links", "SBHL-PREDICATE-LINKS", 1, 0, false);
    //declareFunction("sbhl_inverse_links", "SBHL-INVERSE-LINKS", 1, 0, false);
    //declareFunction("sbhl_undirected_links", "SBHL-UNDIRECTED-LINKS", 1, 0, false);
    declareFunction("get_sbhl_graph_link_nodes", "GET-SBHL-GRAPH-LINK-NODES", 4, 0, false);
    declareFunction("get_sbhl_forward_link_nodes", "GET-SBHL-FORWARD-LINK-NODES", 3, 0, false);
    declareFunction("get_sbhl_backward_link_nodes", "GET-SBHL-BACKWARD-LINK-NODES", 3, 0, false);
    //declareFunction("member_of_sbhl_link_nodesP", "MEMBER-OF-SBHL-LINK-NODES?", 5, 0, false);
    //declareFunction("no_accessible_sbhl_nodes_p", "NO-ACCESSIBLE-SBHL-NODES-P", 1, 0, false);
    //declareFunction("sbhl_link_mts", "SBHL-LINK-MTS", 2, 0, false);
    //declareFunction("sbhl_forward_mts", "SBHL-FORWARD-MTS", 2, 0, false);
    //declareFunction("sbhl_backward_mts", "SBHL-BACKWARD-MTS", 2, 0, false);
    //declareFunction("sbhl_link_nodes_by_iteration", "SBHL-LINK-NODES-BY-ITERATION", 2, 0, false);
    declareFunction("sbhl_link_nodes", "SBHL-LINK-NODES", 3, 3, false);
    //declareFunction("sbhl_link_nodes_p", "SBHL-LINK-NODES-P", 3, 2, false);
    declareFunction("sbhl_forward_true_link_nodes", "SBHL-FORWARD-TRUE-LINK-NODES", 2, 3, false);
    //declareFunction("sbhl_forward_false_link_nodes", "SBHL-FORWARD-FALSE-LINK-NODES", 2, 3, false);
    declareFunction("sbhl_backward_true_link_nodes", "SBHL-BACKWARD-TRUE-LINK-NODES", 2, 3, false);
    //declareFunction("sbhl_backward_true_link_nodes_p", "SBHL-BACKWARD-TRUE-LINK-NODES-P", 2, 2, false);
    //declareFunction("sbhl_backward_false_link_nodes", "SBHL-BACKWARD-FALSE-LINK-NODES", 2, 3, false);
    declareFunction("sbhl_mt_matching_link_nodes", "SBHL-MT-MATCHING-LINK-NODES", 3, 0, false);
    //declareFunction("sbhl_siblings_forward", "SBHL-SIBLINGS-FORWARD", 2, 2, false);
    //declareFunction("sbhl_siblings_backward", "SBHL-SIBLINGS-BACKWARD", 2, 2, false);
    declareFunction("create_new_sbhl_link", "CREATE-NEW-SBHL-LINK", 4, 1, false);
    declareFunction("create_and_store_sbhl_link", "CREATE-AND-STORE-SBHL-LINK", 6, 0, false);
    declareFunction("add_to_sbhl_link", "ADD-TO-SBHL-LINK", 5, 0, false);
    declareFunction("store_in_sbhl_graph", "STORE-IN-SBHL-GRAPH", 4, 0, false);
    //declareFunction("make_all_sbhl_links", "MAKE-ALL-SBHL-LINKS", 0, 0, false);
    declareFunction("assertion_sbhl_tv", "ASSERTION-SBHL-TV", 1, 0, false);
    //declareFunction("sbhl_recompute_links", "SBHL-RECOMPUTE-LINKS", 1, 2, false);
    //declareFunction("sbhl_recompute_graph_links", "SBHL-RECOMPUTE-GRAPH-LINKS", 1, 0, false);
    //declareFunction("sbhl_recompute_links_of_node", "SBHL-RECOMPUTE-LINKS-OF-NODE", 1, 0, false);
    //declareFunction("sbhl_recompute_links_of_nodes", "SBHL-RECOMPUTE-LINKS-OF-NODES", 1, 0, false);
    //declareFunction("reset_sbhl_links", "RESET-SBHL-LINKS", 1, 0, false);
    declareFunction("add_sbhl_link", "ADD-SBHL-LINK", 4, 0, false);
    declareFunction("sbhl_after_adding", "SBHL-AFTER-ADDING", 3, 0, false);
    //declareFunction("set_sbhl_links", "SET-SBHL-LINKS", 2, 1, false);
    //declareFunction("remove_sbhl_link_node", "REMOVE-SBHL-LINK-NODE", 5, 1, false);
    //declareFunction("remove_sbhl_forward_and_backward_link_node", "REMOVE-SBHL-FORWARD-AND-BACKWARD-LINK-NODE", 4, 1, false);
    declareFunction("remove_sbhl_link", "REMOVE-SBHL-LINK", 4, 0, false);
    declareFunction("sbhl_after_removing", "SBHL-AFTER-REMOVING", 3, 0, false);
    declareFunction("possibly_update_sbhl_links_tv", "POSSIBLY-UPDATE-SBHL-LINKS-TV", 2, 0, false);
    declareFunction("sbhl_after_tv_modification", "SBHL-AFTER-TV-MODIFICATION", 3, 0, false);
    declareFunction("initialize_isa_arg2_naut_table", "INITIALIZE-ISA-ARG2-NAUT-TABLE", 0, 0, false);
    //declareFunction("clear_isa_arg2_naut_table", "CLEAR-ISA-ARG2-NAUT-TABLE", 0, 0, false);
    declareFunction("isa_stored_naut_arg2_p", "ISA-STORED-NAUT-ARG2-P", 1, 0, false);
    //declareFunction("store_isa_arg2_naut", "STORE-ISA-ARG2-NAUT", 4, 0, false);
    //declareFunction("remove_isa_arg2_naut", "REMOVE-ISA-ARG2-NAUT", 4, 0, false);
    declareFunction("isa_to_naut_conditionsP", "ISA-TO-NAUT-CONDITIONS?", 2, 0, false);
    //declareFunction("isas_from_naut_arg2", "ISAS-FROM-NAUT-ARG2", 1, 2, false);
    //declareFunction("union_isas_from_naut_arg2", "UNION-ISAS-FROM-NAUT-ARG2", 1, 2, false);
    //declareMacro("do_isas_from_naut_arg2", "DO-ISAS-FROM-NAUT-ARG2");
    declareFunction("initialize_quoted_isa_arg2_naut_table", "INITIALIZE-QUOTED-ISA-ARG2-NAUT-TABLE", 0, 0, false);
    //declareFunction("clear_quoted_isa_arg2_naut_table", "CLEAR-QUOTED-ISA-ARG2-NAUT-TABLE", 0, 0, false);
    declareFunction("quoted_isa_stored_naut_arg2_p", "QUOTED-ISA-STORED-NAUT-ARG2-P", 1, 0, false);
    //declareFunction("store_quoted_isa_arg2_naut", "STORE-QUOTED-ISA-ARG2-NAUT", 4, 0, false);
    //declareFunction("remove_quoted_isa_arg2_naut", "REMOVE-QUOTED-ISA-ARG2-NAUT", 4, 0, false);
    //declareFunction("quoted_isa_to_naut_conditionsP", "QUOTED-ISA-TO-NAUT-CONDITIONS?", 2, 0, false);
    //declareFunction("quoted_isas_from_naut_arg2", "QUOTED-ISAS-FROM-NAUT-ARG2", 1, 2, false);
    //declareFunction("union_quoted_isas_from_naut_arg2", "UNION-QUOTED-ISAS-FROM-NAUT-ARG2", 1, 2, false);
    //declareMacro("do_quoted_isas_from_naut_arg2", "DO-QUOTED-ISAS-FROM-NAUT-ARG2");
    //declareMacro("do_non_fort_isas", "DO-NON-FORT-ISAS");
    declareFunction("set_non_fort_isa_table", "SET-NON-FORT-ISA-TABLE", 1, 0, false);
    declareFunction("set_non_fort_instance_table", "SET-NON-FORT-INSTANCE-TABLE", 1, 0, false);
    declareFunction("non_fort_isa_table", "NON-FORT-ISA-TABLE", 0, 0, false);
    //declareFunction("non_fort_instance_table", "NON-FORT-INSTANCE-TABLE", 0, 0, false);
    declareFunction("non_fort_isa_tables_unbuiltP", "NON-FORT-ISA-TABLES-UNBUILT?", 0, 0, false);
    //declareFunction("initialize_non_fort_isa_tables", "INITIALIZE-NON-FORT-ISA-TABLES", 0, 0, false);
    //declareFunction("rebuild_non_fort_isa_tables", "REBUILD-NON-FORT-ISA-TABLES", 0, 0, false);
    declareFunction("non_fort_isaP", "NON-FORT-ISA?", 2, 2, false);
    //declareFunction("non_fort_isa_anyP", "NON-FORT-ISA-ANY?", 2, 2, false);
    //declareFunction("non_fort_isa_allP", "NON-FORT-ISA-ALL?", 2, 2, false);
    //declareFunction("non_fort_isas", "NON-FORT-ISAS", 1, 2, false);
    //declareFunction("non_fort_all_isa", "NON-FORT-ALL-ISA", 1, 2, false);
    declareFunction("non_fort_instance_table_lookup", "NON-FORT-INSTANCE-TABLE-LOOKUP", 1, 0, false);
    declareFunction("possibly_add_non_fort_isa", "POSSIBLY-ADD-NON-FORT-ISA", 1, 0, false);
    declareFunction("possibly_remove_non_fort_isa", "POSSIBLY-REMOVE-NON-FORT-ISA", 1, 0, false);
    //declareFunction("add_non_fort_isa", "ADD-NON-FORT-ISA", 1, 0, false);
    //declareFunction("remove_non_fort_isa", "REMOVE-NON-FORT-ISA", 1, 0, false);
    //declareFunction("clear_sbhl_links_within_mt", "CLEAR-SBHL-LINKS-WITHIN-MT", 2, 1, false);
    //declareFunction("clear_sbhl_links", "CLEAR-SBHL-LINKS", 1, 1, false);
    //declareFunction("clear_all_sbhl_links", "CLEAR-ALL-SBHL-LINKS", 1, 0, false);
    //declareFunction("clear_all_sbhl_links_within_mt", "CLEAR-ALL-SBHL-LINKS-WITHIN-MT", 2, 0, false);
    //declareFunction("remove_node_from_sbhl_graphs", "REMOVE-NODE-FROM-SBHL-GRAPHS", 1, 0, false);
    //declareFunction("clear_sbhl_module_graph", "CLEAR-SBHL-MODULE-GRAPH", 1, 0, false);
    //declareFunction("clear_all_sbhl_data", "CLEAR-ALL-SBHL-DATA", 0, 0, false);
    //declareFunction("clear_all_sbhl_non_time_data", "CLEAR-ALL-SBHL-NON-TIME-DATA", 0, 0, false);
    declareFunction("sbhl_any_asserted_true_links", "SBHL-ANY-ASSERTED-TRUE-LINKS", 2, 1, false);
    declareFunction("sbhl_asserted_true_links", "SBHL-ASSERTED-TRUE-LINKS", 2, 1, false);
    //declareFunction("sbhl_asserted_false_links", "SBHL-ASSERTED-FALSE-LINKS", 2, 1, false);
    //declareFunction("sbhl_asserted_true_inverse_links", "SBHL-ASSERTED-TRUE-INVERSE-LINKS", 2, 1, false);
    //declareFunction("sbhl_asserted_false_inverse_links", "SBHL-ASSERTED-FALSE-INVERSE-LINKS", 2, 1, false);
    //declareFunction("sbhl_supported_true_links", "SBHL-SUPPORTED-TRUE-LINKS", 2, 1, false);
    //declareFunction("sbhl_supported_false_links", "SBHL-SUPPORTED-FALSE-LINKS", 2, 1, false);
    //declareFunction("sbhl_supported_true_inverse_links", "SBHL-SUPPORTED-TRUE-INVERSE-LINKS", 2, 1, false);
    //declareFunction("sbhl_supported_false_inverse_links", "SBHL-SUPPORTED-FALSE-INVERSE-LINKS", 2, 1, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_link_methods_file() {
    $isa_arg2_naut_table$ = deflexical("*ISA-ARG2-NAUT-TABLE*", maybeDefault( $sym30$_ISA_ARG2_NAUT_TABLE_, $isa_arg2_naut_table$, NIL));
    $quoted_isa_arg2_naut_table$ = deflexical("*QUOTED-ISA-ARG2-NAUT-TABLE*", maybeDefault( $sym57$_QUOTED_ISA_ARG2_NAUT_TABLE_, $quoted_isa_arg2_naut_table$, NIL));
    $non_fort_isa_table$ = deflexical("*NON-FORT-ISA-TABLE*", maybeDefault( $sym67$_NON_FORT_ISA_TABLE_, $non_fort_isa_table$, ()-> (misc_utilities.uninitialized())));
    $non_fort_instance_table$ = deflexical("*NON-FORT-INSTANCE-TABLE*", maybeDefault( $sym68$_NON_FORT_INSTANCE_TABLE_, $non_fort_instance_table$, ()-> (misc_utilities.uninitialized())));
    return NIL;
  }

  public static final SubLObject setup_sbhl_link_methods_file() {
        subl_macro_promotions.declare_defglobal($sym30$_ISA_ARG2_NAUT_TABLE_);
    subl_macro_promotions.declare_defglobal($sym57$_QUOTED_ISA_ARG2_NAUT_TABLE_);
    subl_macro_promotions.declare_defglobal($sym67$_NON_FORT_ISA_TABLE_);
    subl_macro_promotions.declare_defglobal($sym68$_NON_FORT_INSTANCE_TABLE_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw1$INVERSE = makeKeyword("INVERSE");
  public static final SubLSymbol $kw2$LINK = makeKeyword("LINK");
  public static final SubLString $str3$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLSymbol $sym4$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLSymbol $sym5$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw6$ERROR = makeKeyword("ERROR");
  public static final SubLString $str7$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym8$SBHL_SEARCH_TRUTH_VALUE_P = makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P");
  public static final SubLSymbol $kw9$CERROR = makeKeyword("CERROR");
  public static final SubLString $str10$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw11$WARN = makeKeyword("WARN");
  public static final SubLString $str12$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const13$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));
  public static final SubLString $str14$tv___a__does_not_satisfy_sbhl_tru = makeString("tv, ~a, does not satisfy sbhl-true-tv-p");
  public static final SubLString $str15$sbhl_link_nodes_never_called_ = makeString("sbhl-link-nodes never called.");
  public static final SubLObject $const16$False_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("False-JustificationTruth"));
  public static final SubLString $str17$tv___a__does_not_satisfy_sbhl_fal = makeString("tv, ~a, does not satisfy sbhl-false-tv-p");
  public static final SubLSymbol $kw18$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLString $str19$Initializing_SBHL_Graph_Links = makeString("Initializing SBHL Graph Links");
  public static final SubLSymbol $sym20$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw21$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym22$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const23$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLString $str24$adding_sbhl_links_for___a_with_tr = makeString("adding sbhl links for: ~a with truth ~a.~%");
  public static final SubLString $str25$Link_node___a__not_present_in_for = makeString("Link node, ~a, not present in forward links after performing (store-in-sbhl-graph ~a ~a ~a ~a). ~%");
  public static final SubLString $str26$Link_node___a__not_present_in_bac = makeString("Link node, ~a, not present in backward links after performing (store-in-sbhl-graph ~a ~a ~a ~a). ~%");
  public static final SubLString $str27$Cannot_remove_link_node___a__not_ = makeString("Cannot remove link node, ~a, not within links specified by node ~a, direction ~a, mt ~a, tv ~a, within *sbhl-module*~%");
  public static final SubLString $str28$Removing__a_from__a_forward_direc = makeString("Removing ~a from ~a forward direction link");
  public static final SubLString $str29$Removing__a_from__a_backward_dire = makeString("Removing ~a from ~a backward direction link");
  public static final SubLSymbol $sym30$_ISA_ARG2_NAUT_TABLE_ = makeSymbol("*ISA-ARG2-NAUT-TABLE*");
  public static final SubLInteger $int31$200 = makeInteger(200);
  public static final SubLObject $const32$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const33$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym34$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLList $list35 = list(makeSymbol("NAUT"), makeSymbol("ISA-MT"), makeSymbol("ISA-TV"));
  public static final SubLList $list36 = list(list(makeSymbol("ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym37$MODULE = makeUninternedSymbol("MODULE");
  public static final SubLSymbol $sym38$ISA_TUPLE = makeUninternedSymbol("ISA-TUPLE");
  public static final SubLSymbol $sym39$NAUT = makeUninternedSymbol("NAUT");
  public static final SubLSymbol $sym40$ISA_MT = makeUninternedSymbol("ISA-MT");
  public static final SubLSymbol $sym41$ISA_TV = makeUninternedSymbol("ISA-TV");
  public static final SubLSymbol $sym42$CLET = makeSymbol("CLET");
  public static final SubLList $list43 = list(list(makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell(makeString("genls"))));
  public static final SubLSymbol $sym44$POSSIBLY_WITH_SBHL_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-SBHL-MT-RELEVANCE");
  public static final SubLSymbol $sym45$POSSIBLY_WITH_SBHL_TRUE_TV = makeSymbol("POSSIBLY-WITH-SBHL-TRUE-TV");
  public static final SubLSymbol $sym46$WITH_SBHL_MODULE = makeSymbol("WITH-SBHL-MODULE");
  public static final SubLSymbol $sym47$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym48$GETHASH = makeSymbol("GETHASH");
  public static final SubLList $list49 = list(makeSymbol("*ISA-ARG2-NAUT-TABLE*"));
  public static final SubLSymbol $sym50$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLSymbol $sym51$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym52$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym53$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");
  public static final SubLSymbol $sym54$RELEVANT_SBHL_TV_ = makeSymbol("RELEVANT-SBHL-TV?");
  public static final SubLSymbol $sym55$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS = makeSymbol("DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");
  public static final SubLList $list56 = list(makeSymbol("GET-SBHL-FORWARD-DIRECTED-DIRECTION"));
  public static final SubLSymbol $sym57$_QUOTED_ISA_ARG2_NAUT_TABLE_ = makeSymbol("*QUOTED-ISA-ARG2-NAUT-TABLE*");
  public static final SubLObject $const58$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLList $list59 = list(makeSymbol("NAUT"), makeSymbol("QUOTED-ISA-MT"), makeSymbol("QUOTED-ISA-TV"));
  public static final SubLList $list60 = list(list(makeSymbol("QUOTED-ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym61$MODULE = makeUninternedSymbol("MODULE");
  public static final SubLSymbol $sym62$QUOTED_ISA_TUPLE = makeUninternedSymbol("QUOTED-ISA-TUPLE");
  public static final SubLSymbol $sym63$NAUT = makeUninternedSymbol("NAUT");
  public static final SubLSymbol $sym64$QUOTED_ISA_MT = makeUninternedSymbol("QUOTED-ISA-MT");
  public static final SubLSymbol $sym65$QUOTED_ISA_TV = makeUninternedSymbol("QUOTED-ISA-TV");
  public static final SubLList $list66 = list(makeSymbol("*QUOTED-ISA-ARG2-NAUT-TABLE*"));
  public static final SubLSymbol $sym67$_NON_FORT_ISA_TABLE_ = makeSymbol("*NON-FORT-ISA-TABLE*");
  public static final SubLSymbol $sym68$_NON_FORT_INSTANCE_TABLE_ = makeSymbol("*NON-FORT-INSTANCE-TABLE*");
  public static final SubLList $list69 = list(list(makeSymbol("COL-VAR"), makeSymbol("INS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym70$ISA_TUPLE = makeUninternedSymbol("ISA-TUPLE");
  public static final SubLSymbol $sym71$TABLE_MT = makeUninternedSymbol("TABLE-MT");
  public static final SubLSymbol $sym72$TABLE_TV = makeUninternedSymbol("TABLE-TV");
  public static final SubLSymbol $sym73$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
  public static final SubLSymbol $sym74$POSSIBLY_WITH_SBHL_TV = makeSymbol("POSSIBLY-WITH-SBHL-TV");
  public static final SubLSymbol $sym75$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym76$GETHASH_WITHOUT_VALUES = makeSymbol("GETHASH-WITHOUT-VALUES");
  public static final SubLList $list77 = list(list(makeSymbol("NON-FORT-ISA-TABLE")));
  public static final SubLSymbol $sym78$HASH_TABLE_P = makeSymbol("HASH-TABLE-P");
  public static final SubLInteger $int79$256 = makeInteger(256);
  public static final SubLString $str80$__Rebuilding_non_fort___isa_table = makeString("~&Rebuilding non-fort #$isa tables...~%");
  public static final SubLSymbol $kw81$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw82$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym83$NON_FORT_P = makeSymbol("NON-FORT-P");
  public static final SubLList $list84 = list(makeSymbol("CANDIDATE-COL"), makeUninternedSymbol("TABLE-MT"), makeUninternedSymbol("TABLE-TV"));
  public static final SubLList $list85 = list(makeSymbol("COL"), makeUninternedSymbol("TABLE-MT"), makeUninternedSymbol("TABLE-TV"));
  public static final SubLSymbol $kw86$FALSE = makeKeyword("FALSE");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_link_methods_file();
  }

  public void initializeVariables() {
    init_sbhl_link_methods_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_link_methods_file();
  }

}
