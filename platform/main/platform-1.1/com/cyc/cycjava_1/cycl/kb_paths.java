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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.assertions_low;
//dm import com.cyc.cycjava_1.cycl.binary_tree;
//dm import com.cyc.cycjava_1.cycl.cardinality_estimates;
//dm import com.cyc.cycjava_1.cycl.clause_strucs;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.keyhash_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
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
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class kb_paths extends SubLTranslatedFile {

  //// Constructor

  private kb_paths() {}
  public static final SubLFile me = new kb_paths();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_paths";

  //// Definitions

  @SubL(source = "cycl/kb-paths.lisp", position = 681) 
  public static SubLSymbol $kbp_quitP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 1649) 
  public static SubLSymbol $kbp_result_format$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 1689) 
  public static SubLSymbol $search_iteration$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 1726) 
  public static SubLSymbol $node_equalP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 1758) 
  public static SubLSymbol $kbp_nodeP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 1792) 
  public static SubLSymbol $kbp_linkP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 1831) 
  public static SubLSymbol $kbp_stats$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 1861) 
  public static SubLSymbol $collect_kbp_statsP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 1897) 
  public static SubLSymbol $kbp_node_count$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 1931) 
  public static SubLSymbol $kbp_link_count$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 1965) 
  public static SubLSymbol $kbp_term_count$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 1999) 
  public static SubLSymbol $source_term_args$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2045) 
  public static SubLSymbol $target_term_args$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2127) 
  public static SubLSymbol $relevant_node_treeP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2177) 
  public static SubLSymbol $path_source$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2208) 
  public static SubLSymbol $path_target$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2239) 
  public static SubLSymbol $kbp_searcher$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2271) 
  public static SubLSymbol $kbp_searchers$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2304) 
  public static SubLSymbol $path_horizon$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2336) 
  public static SubLSymbol $kbp_common_nodes$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2372) 
  public static SubLSymbol $path_link_lattice$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2409) 
  public static SubLSymbol $path_node_lattice$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2446) 
  public static SubLSymbol $kbp_ancestor$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2478) 
  public static SubLSymbol $kbp_run_time$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2510) 
  public static SubLSymbol $node_ancestors$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2545) 
  public static SubLSymbol $link_ancestors$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2579) 
  public static SubLSymbol $kbp_depth$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2608) 
  public static SubLSymbol $kbp_nodes$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2637) 
  public static SubLSymbol $kbp_links$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2666) 
  public static SubLSymbol $term_arg$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2694) 
  public static SubLSymbol $kbp_ancestor_hash$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2759) 
  public static SubLSymbol $kbp_search_hash$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2813) 
  public static SubLSymbol $kbp_min_isa_pathP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2849) 
  public static SubLSymbol $kbp_min_genls_pathP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2886) 
  public static SubLSymbol $kbp_designated_node_superiorsP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2935) 
  public static SubLSymbol $kbp_designated_node_superiors$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 2984) 
  public static SubLSymbol $kbp_trace_level$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3018) 
  public static SubLSymbol $max_search_iterations$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3078) 
  public static SubLSymbol $limit_path_depthP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3113) 
  public static SubLSymbol $kbp_max_depth$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3146) 
  public static SubLSymbol $kbp_max_term_count$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3185) 
  public static SubLSymbol $kbp_quit_with_successP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3227) 
  public static SubLSymbol $kbp_only_gaf_linksP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3265) 
  public static SubLSymbol $kbp_no_bookkeeping_linksP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3333) 
  public static SubLSymbol $kbp_no_instance_linksP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3373) 
  public static SubLSymbol $kbp_no_bi_scoping_linksP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3417) 
  public static SubLSymbol $kbp_explode_natsP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3455) 
  public static SubLSymbol $kbp_designated_predsP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3495) 
  public static SubLSymbol $kbp_designated_preds$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3535) 
  public static SubLSymbol $kbp_restricted_predsP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3575) 
  public static SubLSymbol $kbp_restricted_preds$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3615) 
  public static SubLSymbol $kbp_restricted_mtsP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3655) 
  public static SubLSymbol $kbp_restricted_mts$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3704) 
  public static SubLSymbol $kbp_external_link_predP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3748) 
  public static SubLSymbol $kbp_external_link_pred$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3790) 
  public static SubLSymbol $kbp_genl_boundP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3824) 
  public static SubLSymbol $kbp_genl_bound$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3858) 
  public static SubLSymbol $kbp_genls_cardinality_delta_boundP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3911) 
  public static SubLSymbol $kbp_genls_cardinality_delta_bound$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3963) 
  public static SubLSymbol $kbp_isa_boundP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 3996) 
  public static SubLSymbol $kbp_isa_bound$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4029) 
  public static SubLSymbol $kbp_node_isa_boundP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4067) 
  public static SubLSymbol $kbp_node_isa_bound$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4105) 
  public static SubLSymbol $kbp_restricted_nodes_as_argP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4152) 
  public static SubLSymbol $kbp_restricted_nodes_as_arg$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4221) 
  public static SubLSymbol $kbp_link_reference_set_boundP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4269) 
  public static SubLSymbol $kbp_link_reference_set_bound$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4317) 
  public static SubLSymbol $kbp_designated_link_referencesP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4367) 
  public static SubLSymbol $kbp_designated_link_references$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4417) 
  public static SubLSymbol $kbp_bound_gaf_termsP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4456) 
  public static SubLSymbol $kbp_bound_gaf_terms$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4496) 
  public static SubLSymbol $kbp_bound_link_termsP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4551) 
  public static SubLSymbol $kbp_bound_link_terms$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4591) 
  public static SubLSymbol $kbp_use_max_mtsP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4651) 
  public static SubLSymbol $nodes_accessor_fn$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4689) 
  public static SubLSymbol $path_link_op$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4721) 
  public static SubLSymbol $path_node_op$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4753) 
  public static SubLSymbol $relevant_linkP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4787) 
  public static SubLSymbol $relevant_nodeP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4821) 
  public static SubLSymbol $relevant_link_treeP$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4860) 
  public static SubLSymbol $exclude_nodes$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 4894) 
  public static SubLSymbol $exclude_links$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 38562) 
  public static SubLSymbol $cr_paths_table$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 38672) 
  public static SubLSymbol $cr_gaf_count$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 38704) 
  public static SubLSymbol $cr_explained_count$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 38742) 
  public static SubLSymbol $cr_error_count$ = null;

  @SubL(source = "cycl/kb-paths.lisp", position = 42178) 
  public static final SubLObject fort_name(SubLObject fort) {
    if ((NIL != constant_handles.constant_p(fort))) {
      return constants_high.constant_name(fort);
    } else if ((NIL != nart_handles.nart_p(fort))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 7493");
    }
    return NIL;
  }

  public static final SubLObject declare_kb_paths_file() {
    //declareFunction(myName, "kb_paths", "KB-PATHS", 2, 1, false);
    //declareFunction(myName, "kb_paths_n", "KB-PATHS-N", 2, 1, false);
    //declareFunction(myName, "kb_paths_in_all_mts", "KB-PATHS-IN-ALL-MTS", 2, 0, false);
    //declareFunction(myName, "kb_paths_in_just_mt", "KB-PATHS-IN-JUST-MT", 3, 0, false);
    //declareFunction(myName, "find_paths", "FIND-PATHS", 0, 2, false);
    //declareFunction(myName, "complete_paths_home", "COMPLETE-PATHS-HOME", 0, 1, false);
    //declareFunction(myName, "complete_paths_home_from_link", "COMPLETE-PATHS-HOME-FROM-LINK", 1, 0, false);
    //declareFunction(myName, "complete_paths_home_from_node", "COMPLETE-PATHS-HOME-FROM-NODE", 1, 0, false);
    //declareFunction(myName, "extract_paths", "EXTRACT-PATHS", 0, 2, false);
    //declareFunction(myName, "kbp_result", "KBP-RESULT", 0, 0, false);
    //declareFunction(myName, "kbp_result_links", "KBP-RESULT-LINKS", 0, 0, false);
    //declareFunction(myName, "kbp_result_paths", "KBP-RESULT-PATHS", 0, 0, false);
    //declareFunction(myName, "linearize_lattice", "LINEARIZE-LATTICE", 1, 0, false);
    //declareFunction(myName, "gather_node_lattice", "GATHER-NODE-LATTICE", 0, 2, false);
    //declareFunction(myName, "gather_link_lattice", "GATHER-LINK-LATTICE", 1, 1, false);
    //declareFunction(myName, "kbp_neighbors_among", "KBP-NEIGHBORS-AMONG", 2, 1, false);
    //declareFunction(myName, "kbp_node_links", "KBP-NODE-LINKS", 1, 0, false);
    //declareFunction(myName, "kbp_link_nodes", "KBP-LINK-NODES", 1, 0, false);
    //declareFunction(myName, "kbp_connecting_links", "KBP-CONNECTING-LINKS", 2, 0, false);
    //declareFunction(myName, "kbp_node_neighbors", "KBP-NODE-NEIGHBORS", 1, 0, false);
    //declareFunction(myName, "kbp_legal_linkP", "KBP-LEGAL-LINK?", 1, 0, false);
    //declareFunction(myName, "kbp_legal_nodeP", "KBP-LEGAL-NODE?", 1, 0, false);
    //declareFunction(myName, "ancestor_linkP", "ANCESTOR-LINK?", 1, 0, false);
    //declareFunction(myName, "ancestor_nodeP", "ANCESTOR-NODE?", 1, 0, false);
    //declareFunction(myName, "kbp_under_limit", "KBP-UNDER-LIMIT", 0, 2, false);
    //declareFunction(myName, "mark_next_horizon", "MARK-NEXT-HORIZON", 1, 4, false);
    //declareFunction(myName, "default_link_op", "DEFAULT-LINK-OP", 1, 2, false);
    //declareFunction(myName, "default_node_op", "DEFAULT-NODE-OP", 1, 2, false);
    //declareFunction(myName, "do_link_nodes", "DO-LINK-NODES", 1, 2, false);
    //declareFunction(myName, "default_relevant_linkP", "DEFAULT-RELEVANT-LINK?", 1, 0, false);
    //declareFunction(myName, "default_relevant_nodeP", "DEFAULT-RELEVANT-NODE?", 1, 0, false);
    //declareFunction(myName, "kbp_beyond_genls_cardinality_delta_boundP", "KBP-BEYOND-GENLS-CARDINALITY-DELTA-BOUND?", 1, 0, false);
    //declareFunction(myName, "kbp_beyond_genl_boundP", "KBP-BEYOND-GENL-BOUND?", 1, 0, false);
    //declareFunction(myName, "kbp_beyond_isa_boundP", "KBP-BEYOND-ISA-BOUND?", 1, 0, false);
    //declareFunction(myName, "kbp_undesignated_node_superiorP", "KBP-UNDESIGNATED-NODE-SUPERIOR?", 1, 0, false);
    //declareFunction(myName, "kbp_node_restricted_as_argP", "KBP-NODE-RESTRICTED-AS-ARG?", 1, 0, false);
    //declareFunction(myName, "kbp_node_beyond_isa_boundP", "KBP-NODE-BEYOND-ISA-BOUND?", 1, 0, false);
    //declareFunction(myName, "kbp_gaf_term_beyond_boundP", "KBP-GAF-TERM-BEYOND-BOUND?", 1, 0, false);
    //declareFunction(myName, "kbp_undesignated_pred_assertionP", "KBP-UNDESIGNATED-PRED-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "kbp_restricted_pred_assertionP", "KBP-RESTRICTED-PRED-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "kbp_restricted_mt_assertionP", "KBP-RESTRICTED-MT-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "kbp_link_terms_beyond_reference_set_boundP", "KBP-LINK-TERMS-BEYOND-REFERENCE-SET-BOUND?", 1, 0, false);
    //declareFunction(myName, "kbp_link_terms_wXo_referencesP", "KBP-LINK-TERMS-W/O-REFERENCES?", 1, 0, false);
    //declareFunction(myName, "kbp_link_satisfies_external_predP", "KBP-LINK-SATISFIES-EXTERNAL-PRED?", 1, 0, false);
    //declareFunction(myName, "kbp_link_term_beyond_boundP", "KBP-LINK-TERM-BEYOND-BOUND?", 1, 0, false);
    //declareFunction(myName, "kbp_link_wXo_max_mtP", "KBP-LINK-W/O-MAX-MT?", 1, 0, false);
    //declareFunction(myName, "kbp_bi_scoping_linkP", "KBP-BI-SCOPING-LINK?", 1, 0, false);
    //declareFunction(myName, "kbp_bi_scoping_link_1P", "KBP-BI-SCOPING-LINK-1?", 1, 0, false);
    //declareFunction(myName, "kbp_bi_scoping_nodeP", "KBP-BI-SCOPING-NODE?", 1, 0, false);
    //declareFunction(myName, "kbp_bi_scoping_node_1P", "KBP-BI-SCOPING-NODE-1?", 1, 0, false);
    //declareFunction(myName, "scope_direction", "SCOPE-DIRECTION", 2, 0, false);
    //declareFunction(myName, "default_relevant_link_treeP", "DEFAULT-RELEVANT-LINK-TREE?", 1, 0, false);
    //declareFunction(myName, "do_if_term_assertions", "DO-IF-TERM-ASSERTIONS", 1, 3, false);
    //declareFunction(myName, "obsolete_tree_do_if", "OBSOLETE-TREE-DO-IF", 2, 4, false);
    //declareFunction(myName, "assertion_indexed_by", "ASSERTION-INDEXED-BY", 2, 0, false);
    //declareFunction(myName, "all_assertion_terms", "ALL-ASSERTION-TERMS", 1, 1, false);
    //declareFunction(myName, "all_assertion_references", "ALL-ASSERTION-REFERENCES", 1, 1, false);
    //declareFunction(myName, "clear_kb_paths", "CLEAR-KB-PATHS", 0, 0, false);
    //declareFunction(myName, "kbp_stats", "KBP-STATS", 1, 0, false);
    //declareFunction(myName, "kbp_node_count", "KBP-NODE-COUNT", 0, 0, false);
    //declareFunction(myName, "kbp_link_count", "KBP-LINK-COUNT", 0, 0, false);
    //declareFunction(myName, "kbp_searched_object_count", "KBP-SEARCHED-OBJECT-COUNT", 1, 0, false);
    //declareFunction(myName, "next_iteration", "NEXT-ITERATION", 0, 0, false);
    //declareFunction(myName, "kbp_give_upP", "KBP-GIVE-UP?", 3, 0, false);
    //declareFunction(myName, "kbp_exhaustedP", "KBP-EXHAUSTED?", 2, 0, false);
    //declareFunction(myName, "kbp_iteration_bound_metP", "KBP-ITERATION-BOUND-MET?", 1, 0, false);
    //declareFunction(myName, "kbp_term_bound_metP", "KBP-TERM-BOUND-MET?", 0, 0, false);
    //declareFunction(myName, "paths_link_count", "PATHS-LINK-COUNT", 1, 0, false);
    //declareFunction(myName, "kbp_searcherP", "KBP-SEARCHER?", 1, 0, false);
    //declareFunction(myName, "equal_nodesP", "EQUAL-NODES?", 2, 1, false);
    //declareFunction(myName, "instance_btreeP", "INSTANCE-BTREE?", 1, 0, false);
    //declareFunction(myName, "bookkeeping_btreeP", "BOOKKEEPING-BTREE?", 1, 0, false);
    //declareFunction(myName, "kbp_record_ancestor", "KBP-RECORD-ANCESTOR", 1, 3, false);
    //declareFunction(myName, "kbp_ancestors", "KBP-ANCESTORS", 1, 1, false);
    //declareFunction(myName, "kbp_ancestors_via_all", "KBP-ANCESTORS-VIA-ALL", 1, 1, false);
    //declareFunction(myName, "kbp_ancestorP", "KBP-ANCESTOR?", 1, 3, false);
    //declareFunction(myName, "kbp_ancestor_via_anyP", "KBP-ANCESTOR-VIA-ANY?", 1, 3, false);
    //declareFunction(myName, "kbp_searchedP", "KBP-SEARCHED?", 1, 0, false);
    //declareFunction(myName, "kbp_searched_byP", "KBP-SEARCHED-BY?", 1, 2, false);
    //declareFunction(myName, "kbp_searched_by_allP", "KBP-SEARCHED-BY-ALL?", 1, 2, false);
    //declareFunction(myName, "kbp_searched_by_anyP", "KBP-SEARCHED-BY-ANY?", 1, 2, false);
    //declareFunction(myName, "kbp_searched_by", "KBP-SEARCHED-BY", 1, 0, false);
    //declareFunction(myName, "kbp_all_searched_by", "KBP-ALL-SEARCHED-BY", 0, 1, false);
    //declareFunction(myName, "kbp_mark_as_searched_by", "KBP-MARK-AS-SEARCHED-BY", 1, 2, false);
    //declareFunction(myName, "kbp_mark_as_unsearched_by", "KBP-MARK-AS-UNSEARCHED-BY", 1, 2, false);
    //declareFunction(myName, "kbp_mark_as_searched_by_all", "KBP-MARK-AS-SEARCHED-BY-ALL", 1, 2, false);
    //declareFunction(myName, "kbp_mark_as_unsearched_by_all", "KBP-MARK-AS-UNSEARCHED-BY-ALL", 1, 2, false);
    //declareFunction(myName, "kbp_mark_all_as_unsearched", "KBP-MARK-ALL-AS-UNSEARCHED", 1, 0, false);
    //declareFunction(myName, "kbp_mark_as_unsearched", "KBP-MARK-AS-UNSEARCHED", 1, 0, false);
    //declareFunction(myName, "kbp_all_searched_by_all", "KBP-ALL-SEARCHED-BY-ALL", 0, 2, false);
    //declareFunction(myName, "bookkeeping_gaf_assertionP", "BOOKKEEPING-GAF-ASSERTION?", 1, 0, false);
    //declareFunction(myName, "kbp_excluded_nodeP", "KBP-EXCLUDED-NODE?", 1, 0, false);
    //declareFunction(myName, "kbp_excluded_linkP", "KBP-EXCLUDED-LINK?", 1, 0, false);
    //declareFunction(myName, "kbp_paths_links", "KBP-PATHS-LINKS", 1, 0, false);
    //declareFunction(myName, "kbp_path_links", "KBP-PATH-LINKS", 1, 0, false);
    //declareFunction(myName, "kbp_paths_tuples", "KBP-PATHS-TUPLES", 1, 0, false);
    //declareFunction(myName, "kbp_path_tuples", "KBP-PATH-TUPLES", 1, 0, false);
    //declareFunction(myName, "kbp_justs_from_tuples", "KBP-JUSTS-FROM-TUPLES", 1, 0, false);
    //declareFunction(myName, "kbp_just_from_tuples", "KBP-JUST-FROM-TUPLES", 1, 0, false);
    //declareFunction(myName, "kbp_just_from_tuple", "KBP-JUST-FROM-TUPLE", 1, 0, false);
    //declareFunction(myName, "make_gaf_assertion", "MAKE-GAF-ASSERTION", 1, 0, false);
    //declareFunction(myName, "kbp_note", "KBP-NOTE", 2, 4, false);
    //declareFunction(myName, "kbp_error", "KBP-ERROR", 2, 4, false);
    //declareFunction(myName, "kbp_warn", "KBP-WARN", 2, 4, false);
    //declareFunction(myName, "kbp_min_isa_paths", "KBP-MIN-ISA-PATHS", 2, 2, false);
    //declareFunction(myName, "kbp_min_genls_paths", "KBP-MIN-GENLS-PATHS", 2, 2, false);
    //declareFunction(myName, "kbp_min_genl_mt_paths", "KBP-MIN-GENL-MT-PATHS", 2, 2, false);
    //declareFunction(myName, "explain_cr_pair", "EXPLAIN-CR-PAIR", 2, 0, false);
    //declareFunction(myName, "explain_cr_gafs_via_paths", "EXPLAIN-CR-GAFS-VIA-PATHS", 0, 1, false);
    //declareFunction(myName, "explain_cr_gaf_via_paths", "EXPLAIN-CR-GAF-VIA-PATHS", 1, 0, false);
    //declareFunction(myName, "cr_paths_status", "CR-PATHS-STATUS", 0, 0, false);
    //declareFunction(myName, "evaluate_cr_path", "EVALUATE-CR-PATH", 3, 1, false);
    declareFunction(myName, "fort_name", "FORT-NAME", 1, 0, false);
    //declareFunction(myName, "fort_nameL", "FORT-NAME<", 2, 0, false);
    //declareFunction(myName, "assertions_fi_equalP", "ASSERTIONS-FI-EQUAL?", 2, 0, false);
    //declareFunction(myName, "assertions_fi_formulae", "ASSERTIONS-FI-FORMULAE", 1, 0, false);
    //declareFunction(myName, "focuses", "FOCUSES", 1, 4, false);
    //declareFunction(myName, "genls_gather_focus_preds_cols", "GENLS-GATHER-FOCUS-PREDS-COLS", 1, 0, false);
    //declareFunction(myName, "remove_genls_of_all", "REMOVE-GENLS-OF-ALL", 1, 1, false);
    //declareFunction(myName, "remove_common_spec_path", "REMOVE-COMMON-SPEC-PATH", 1, 1, false);
    //declareFunction(myName, "remove_common_spec_path_wrt", "REMOVE-COMMON-SPEC-PATH-WRT", 2, 1, false);
    //declareFunction(myName, "remove_specs_of_all", "REMOVE-SPECS-OF-ALL", 1, 1, false);
    //declareFunction(myName, "remove_common_genl_path", "REMOVE-COMMON-GENL-PATH", 1, 1, false);
    //declareFunction(myName, "remove_common_genl_path_wrt", "REMOVE-COMMON-GENL-PATH-WRT", 2, 1, false);
    //declareFunction(myName, "candidate_focus_collections", "CANDIDATE-FOCUS-COLLECTIONS", 1, 2, false);
    //declareFunction(myName, "candidate_focus_collections_strategy_middle", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-MIDDLE", 1, 1, false);
    //declareFunction(myName, "candidate_focus_collections_strategy_edge", "CANDIDATE-FOCUS-COLLECTIONS-STRATEGY-EDGE", 1, 1, false);
    //declareFunction(myName, "appraise_candidate_focuses", "APPRAISE-CANDIDATE-FOCUSES", 1, 1, false);
    //declareFunction(myName, "genls_focus_min_preds", "GENLS-FOCUS-MIN-PREDS", 2, 2, false);
    //declareFunction(myName, "genls_gather_focus_preds_of", "GENLS-GATHER-FOCUS-PREDS-OF", 1, 0, false);
    //declareFunction(myName, "meta_pred_specs", "META-PRED-SPECS", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_kb_paths_file() {
    $kbp_quitP$ = defparameter("*KBP-QUIT?*", NIL);
    $kbp_result_format$ = defparameter("*KBP-RESULT-FORMAT*", $kw1$PATHS);
    $search_iteration$ = defparameter("*SEARCH-ITERATION*", NIL);
    $node_equalP$ = defparameter("*NODE-EQUAL?*", Symbols.symbol_function(EQ));
    $kbp_nodeP$ = defparameter("*KBP-NODE?*", Symbols.symbol_function($sym5$FORT_P));
    $kbp_linkP$ = defparameter("*KBP-LINK?*", Symbols.symbol_function($sym7$ASSERTION_P));
    $kbp_stats$ = defparameter("*KBP-STATS*", NIL);
    $collect_kbp_statsP$ = defparameter("*COLLECT-KBP-STATS?*", T);
    $kbp_node_count$ = defparameter("*KBP-NODE-COUNT*", NIL);
    $kbp_link_count$ = defparameter("*KBP-LINK-COUNT*", NIL);
    $kbp_term_count$ = defparameter("*KBP-TERM-COUNT*", NIL);
    $source_term_args$ = defparameter("*SOURCE-TERM-ARGS*", $list14);
    $target_term_args$ = defparameter("*TARGET-TERM-ARGS*", $list16);
    $relevant_node_treeP$ = defparameter("*RELEVANT-NODE-TREE?*", Symbols.symbol_function(IDENTITY));
    $path_source$ = defparameter("*PATH-SOURCE*", NIL);
    $path_target$ = defparameter("*PATH-TARGET*", NIL);
    $kbp_searcher$ = defparameter("*KBP-SEARCHER*", NIL);
    $kbp_searchers$ = defparameter("*KBP-SEARCHERS*", NIL);
    $path_horizon$ = defparameter("*PATH-HORIZON*", NIL);
    $kbp_common_nodes$ = defparameter("*KBP-COMMON-NODES*", NIL);
    $path_link_lattice$ = defparameter("*PATH-LINK-LATTICE*", NIL);
    $path_node_lattice$ = defparameter("*PATH-NODE-LATTICE*", NIL);
    $kbp_ancestor$ = defparameter("*KBP-ANCESTOR*", NIL);
    $kbp_run_time$ = defparameter("*KBP-RUN-TIME*", NIL);
    $node_ancestors$ = defparameter("*NODE-ANCESTORS*", NIL);
    $link_ancestors$ = defparameter("*LINK-ANCESTORS*", NIL);
    $kbp_depth$ = defparameter("*KBP-DEPTH*", NIL);
    $kbp_nodes$ = defparameter("*KBP-NODES*", NIL);
    $kbp_links$ = defparameter("*KBP-LINKS*", NIL);
    $term_arg$ = defparameter("*TERM-ARG*", NIL);
    $kbp_ancestor_hash$ = defparameter("*KBP-ANCESTOR-HASH*", Hashtables.make_hash_table($int35$2048, Symbols.symbol_function(EQUAL), UNPROVIDED));
    $kbp_search_hash$ = defparameter("*KBP-SEARCH-HASH*", Hashtables.make_hash_table($int35$2048, UNPROVIDED, UNPROVIDED));
    $kbp_min_isa_pathP$ = defparameter("*KBP-MIN-ISA-PATH?*", T);
    $kbp_min_genls_pathP$ = defparameter("*KBP-MIN-GENLS-PATH?*", T);
    $kbp_designated_node_superiorsP$ = defparameter("*KBP-DESIGNATED-NODE-SUPERIORS?*", T);
    $kbp_designated_node_superiors$ = defparameter("*KBP-DESIGNATED-NODE-SUPERIORS*", NIL);
    $kbp_trace_level$ = defparameter("*KBP-TRACE-LEVEL*", ZERO_INTEGER);
    $max_search_iterations$ = defparameter("*MAX-SEARCH-ITERATIONS*", FIVE_INTEGER);
    $limit_path_depthP$ = defparameter("*LIMIT-PATH-DEPTH?*", T);
    $kbp_max_depth$ = defparameter("*KBP-MAX-DEPTH*", NIL);
    $kbp_max_term_count$ = defparameter("*KBP-MAX-TERM-COUNT*", $int46$1000);
    $kbp_quit_with_successP$ = defparameter("*KBP-QUIT-WITH-SUCCESS?*", NIL);
    $kbp_only_gaf_linksP$ = defparameter("*KBP-ONLY-GAF-LINKS?*", T);
    $kbp_no_bookkeeping_linksP$ = defparameter("*KBP-NO-BOOKKEEPING-LINKS?*", T);
    $kbp_no_instance_linksP$ = defparameter("*KBP-NO-INSTANCE-LINKS?*", T);
    $kbp_no_bi_scoping_linksP$ = defparameter("*KBP-NO-BI-SCOPING-LINKS?*", NIL);
    $kbp_explode_natsP$ = defparameter("*KBP-EXPLODE-NATS?*", NIL);
    $kbp_designated_predsP$ = defparameter("*KBP-DESIGNATED-PREDS?*", T);
    $kbp_designated_preds$ = defparameter("*KBP-DESIGNATED-PREDS*", NIL);
    $kbp_restricted_predsP$ = defparameter("*KBP-RESTRICTED-PREDS?*", T);
    $kbp_restricted_preds$ = defparameter("*KBP-RESTRICTED-PREDS*", NIL);
    $kbp_restricted_mtsP$ = defparameter("*KBP-RESTRICTED-MTS?*", NIL);
    $kbp_restricted_mts$ = defparameter("*KBP-RESTRICTED-MTS*", $list59);
    $kbp_external_link_predP$ = defparameter("*KBP-EXTERNAL-LINK-PRED?*", NIL);
    $kbp_external_link_pred$ = defparameter("*KBP-EXTERNAL-LINK-PRED*", NIL);
    $kbp_genl_boundP$ = defparameter("*KBP-GENL-BOUND?*", T);
    $kbp_genl_bound$ = defparameter("*KBP-GENL-BOUND*", NIL);
    $kbp_genls_cardinality_delta_boundP$ = defparameter("*KBP-GENLS-CARDINALITY-DELTA-BOUND?*", T);
    $kbp_genls_cardinality_delta_bound$ = defparameter("*KBP-GENLS-CARDINALITY-DELTA-BOUND*", TWENTY_INTEGER);
    $kbp_isa_boundP$ = defparameter("*KBP-ISA-BOUND?*", T);
    $kbp_isa_bound$ = defparameter("*KBP-ISA-BOUND*", NIL);
    $kbp_node_isa_boundP$ = defparameter("*KBP-NODE-ISA-BOUND?*", T);
    $kbp_node_isa_bound$ = defparameter("*KBP-NODE-ISA-BOUND*", NIL);
    $kbp_restricted_nodes_as_argP$ = defparameter("*KBP-RESTRICTED-NODES-AS-ARG?*", T);
    $kbp_restricted_nodes_as_arg$ = defparameter("*KBP-RESTRICTED-NODES-AS-ARG*", $list72);
    $kbp_link_reference_set_boundP$ = defparameter("*KBP-LINK-REFERENCE-SET-BOUND?*", T);
    $kbp_link_reference_set_bound$ = defparameter("*KBP-LINK-REFERENCE-SET-BOUND*", NIL);
    $kbp_designated_link_referencesP$ = defparameter("*KBP-DESIGNATED-LINK-REFERENCES?*", T);
    $kbp_designated_link_references$ = defparameter("*KBP-DESIGNATED-LINK-REFERENCES*", NIL);
    $kbp_bound_gaf_termsP$ = defparameter("*KBP-BOUND-GAF-TERMS?*", T);
    $kbp_bound_gaf_terms$ = defparameter("*KBP-BOUND-GAF-TERMS*", $list79);
    $kbp_bound_link_termsP$ = defparameter("*KBP-BOUND-LINK-TERMS?*", T);
    $kbp_bound_link_terms$ = defparameter("*KBP-BOUND-LINK-TERMS*", NIL);
    $kbp_use_max_mtsP$ = defparameter("*KBP-USE-MAX-MTS?*", NIL);
    $nodes_accessor_fn$ = defparameter("*NODES-ACCESSOR-FN*", NIL);
    $path_link_op$ = defparameter("*PATH-LINK-OP*", NIL);
    $path_node_op$ = defparameter("*PATH-NODE-OP*", NIL);
    $relevant_linkP$ = defparameter("*RELEVANT-LINK?*", NIL);
    $relevant_nodeP$ = defparameter("*RELEVANT-NODE?*", NIL);
    $relevant_link_treeP$ = defparameter("*RELEVANT-LINK-TREE?*", NIL);
    $exclude_nodes$ = defparameter("*EXCLUDE-NODES*", NIL);
    $exclude_links$ = defparameter("*EXCLUDE-LINKS*", NIL);
    $cr_paths_table$ = defparameter("*CR-PATHS-TABLE*", Hashtables.make_hash_table($int157$1024, UNPROVIDED, UNPROVIDED));
    $cr_gaf_count$ = defparameter("*CR-GAF-COUNT*", ZERO_INTEGER);
    $cr_explained_count$ = defparameter("*CR-EXPLAINED-COUNT*", ZERO_INTEGER);
    $cr_error_count$ = defparameter("*CR-ERROR-COUNT*", ZERO_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_kb_paths_file() {
    // CVS_ID("Id: kb-paths.lisp 126640 2008-12-04 13:39:36Z builder ");
    {
      SubLObject item_var = $sym0$_KBP_QUIT__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym0$_KBP_QUIT__, NIL);
    {
      SubLObject item_var = $sym2$_KBP_RESULT_FORMAT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym2$_KBP_RESULT_FORMAT_, NIL);
    {
      SubLObject item_var = $sym3$_SEARCH_ITERATION_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym3$_SEARCH_ITERATION_, NIL);
    {
      SubLObject item_var = $sym4$_NODE_EQUAL__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym4$_NODE_EQUAL__, NIL);
    {
      SubLObject item_var = $sym6$_KBP_NODE__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym6$_KBP_NODE__, NIL);
    {
      SubLObject item_var = $sym8$_KBP_LINK__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym8$_KBP_LINK__, NIL);
    {
      SubLObject item_var = $sym9$_KBP_STATS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym9$_KBP_STATS_, NIL);
    {
      SubLObject item_var = $sym10$_COLLECT_KBP_STATS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym10$_COLLECT_KBP_STATS__, NIL);
    {
      SubLObject item_var = $sym11$_KBP_NODE_COUNT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym11$_KBP_NODE_COUNT_, NIL);
    {
      SubLObject item_var = $sym12$_KBP_LINK_COUNT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym12$_KBP_LINK_COUNT_, NIL);
    {
      SubLObject item_var = $sym13$_KBP_TERM_COUNT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym13$_KBP_TERM_COUNT_, NIL);
    {
      SubLObject item_var = $sym15$_SOURCE_TERM_ARGS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym15$_SOURCE_TERM_ARGS_, NIL);
    {
      SubLObject item_var = $sym17$_TARGET_TERM_ARGS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym17$_TARGET_TERM_ARGS_, NIL);
    {
      SubLObject item_var = $sym18$_RELEVANT_NODE_TREE__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym18$_RELEVANT_NODE_TREE__, NIL);
    {
      SubLObject item_var = $sym19$_PATH_SOURCE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym19$_PATH_SOURCE_, NIL);
    {
      SubLObject item_var = $sym20$_PATH_TARGET_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym20$_PATH_TARGET_, NIL);
    {
      SubLObject item_var = $sym21$_KBP_SEARCHER_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym21$_KBP_SEARCHER_, NIL);
    {
      SubLObject item_var = $sym22$_KBP_SEARCHERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym22$_KBP_SEARCHERS_, NIL);
    {
      SubLObject item_var = $sym23$_PATH_HORIZON_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym23$_PATH_HORIZON_, NIL);
    {
      SubLObject item_var = $sym24$_KBP_COMMON_NODES_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym24$_KBP_COMMON_NODES_, NIL);
    {
      SubLObject item_var = $sym25$_PATH_LINK_LATTICE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym25$_PATH_LINK_LATTICE_, NIL);
    {
      SubLObject item_var = $sym26$_PATH_NODE_LATTICE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym26$_PATH_NODE_LATTICE_, NIL);
    {
      SubLObject item_var = $sym27$_KBP_ANCESTOR_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym27$_KBP_ANCESTOR_, NIL);
    {
      SubLObject item_var = $sym28$_KBP_RUN_TIME_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym28$_KBP_RUN_TIME_, NIL);
    {
      SubLObject item_var = $sym29$_NODE_ANCESTORS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym29$_NODE_ANCESTORS_, NIL);
    {
      SubLObject item_var = $sym30$_LINK_ANCESTORS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym30$_LINK_ANCESTORS_, NIL);
    {
      SubLObject item_var = $sym31$_KBP_DEPTH_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym31$_KBP_DEPTH_, NIL);
    {
      SubLObject item_var = $sym32$_KBP_NODES_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym32$_KBP_NODES_, NIL);
    {
      SubLObject item_var = $sym33$_KBP_LINKS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym33$_KBP_LINKS_, NIL);
    {
      SubLObject item_var = $sym34$_TERM_ARG_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym34$_TERM_ARG_, NIL);
    {
      SubLObject item_var = $sym36$_KBP_ANCESTOR_HASH_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym36$_KBP_ANCESTOR_HASH_, NIL);
    {
      SubLObject item_var = $sym37$_KBP_SEARCH_HASH_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym37$_KBP_SEARCH_HASH_, NIL);
    {
      SubLObject item_var = $sym38$_KBP_MIN_ISA_PATH__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym38$_KBP_MIN_ISA_PATH__, NIL);
    {
      SubLObject item_var = $sym39$_KBP_MIN_GENLS_PATH__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym39$_KBP_MIN_GENLS_PATH__, NIL);
    {
      SubLObject item_var = $sym40$_KBP_DESIGNATED_NODE_SUPERIORS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym40$_KBP_DESIGNATED_NODE_SUPERIORS__, NIL);
    {
      SubLObject item_var = $sym41$_KBP_DESIGNATED_NODE_SUPERIORS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym41$_KBP_DESIGNATED_NODE_SUPERIORS_, NIL);
    {
      SubLObject item_var = $sym42$_KBP_TRACE_LEVEL_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym42$_KBP_TRACE_LEVEL_, NIL);
    {
      SubLObject item_var = $sym43$_MAX_SEARCH_ITERATIONS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym43$_MAX_SEARCH_ITERATIONS_, NIL);
    {
      SubLObject item_var = $sym44$_LIMIT_PATH_DEPTH__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym44$_LIMIT_PATH_DEPTH__, NIL);
    {
      SubLObject item_var = $sym45$_KBP_MAX_DEPTH_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym45$_KBP_MAX_DEPTH_, NIL);
    {
      SubLObject item_var = $sym47$_KBP_MAX_TERM_COUNT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym47$_KBP_MAX_TERM_COUNT_, NIL);
    {
      SubLObject item_var = $sym48$_KBP_QUIT_WITH_SUCCESS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym48$_KBP_QUIT_WITH_SUCCESS__, NIL);
    {
      SubLObject item_var = $sym49$_KBP_ONLY_GAF_LINKS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym49$_KBP_ONLY_GAF_LINKS__, NIL);
    {
      SubLObject item_var = $sym50$_KBP_NO_BOOKKEEPING_LINKS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym50$_KBP_NO_BOOKKEEPING_LINKS__, NIL);
    {
      SubLObject item_var = $sym51$_KBP_NO_INSTANCE_LINKS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym51$_KBP_NO_INSTANCE_LINKS__, NIL);
    {
      SubLObject item_var = $sym52$_KBP_NO_BI_SCOPING_LINKS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym52$_KBP_NO_BI_SCOPING_LINKS__, NIL);
    {
      SubLObject item_var = $sym53$_KBP_EXPLODE_NATS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym53$_KBP_EXPLODE_NATS__, NIL);
    {
      SubLObject item_var = $sym54$_KBP_DESIGNATED_PREDS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym54$_KBP_DESIGNATED_PREDS__, NIL);
    {
      SubLObject item_var = $sym55$_KBP_DESIGNATED_PREDS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym55$_KBP_DESIGNATED_PREDS_, NIL);
    {
      SubLObject item_var = $sym56$_KBP_RESTRICTED_PREDS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym56$_KBP_RESTRICTED_PREDS__, NIL);
    {
      SubLObject item_var = $sym57$_KBP_RESTRICTED_PREDS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym57$_KBP_RESTRICTED_PREDS_, NIL);
    {
      SubLObject item_var = $sym58$_KBP_RESTRICTED_MTS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym58$_KBP_RESTRICTED_MTS__, NIL);
    {
      SubLObject item_var = $sym60$_KBP_RESTRICTED_MTS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym60$_KBP_RESTRICTED_MTS_, NIL);
    {
      SubLObject item_var = $sym61$_KBP_EXTERNAL_LINK_PRED__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym61$_KBP_EXTERNAL_LINK_PRED__, NIL);
    {
      SubLObject item_var = $sym62$_KBP_EXTERNAL_LINK_PRED_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym62$_KBP_EXTERNAL_LINK_PRED_, NIL);
    {
      SubLObject item_var = $sym63$_KBP_GENL_BOUND__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym63$_KBP_GENL_BOUND__, NIL);
    {
      SubLObject item_var = $sym64$_KBP_GENL_BOUND_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym64$_KBP_GENL_BOUND_, NIL);
    {
      SubLObject item_var = $sym65$_KBP_GENLS_CARDINALITY_DELTA_BOUND__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym65$_KBP_GENLS_CARDINALITY_DELTA_BOUND__, NIL);
    {
      SubLObject item_var = $sym66$_KBP_GENLS_CARDINALITY_DELTA_BOUND_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym66$_KBP_GENLS_CARDINALITY_DELTA_BOUND_, NIL);
    {
      SubLObject item_var = $sym67$_KBP_ISA_BOUND__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym67$_KBP_ISA_BOUND__, NIL);
    {
      SubLObject item_var = $sym68$_KBP_ISA_BOUND_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym68$_KBP_ISA_BOUND_, NIL);
    {
      SubLObject item_var = $sym69$_KBP_NODE_ISA_BOUND__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym69$_KBP_NODE_ISA_BOUND__, NIL);
    {
      SubLObject item_var = $sym70$_KBP_NODE_ISA_BOUND_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym70$_KBP_NODE_ISA_BOUND_, NIL);
    {
      SubLObject item_var = $sym71$_KBP_RESTRICTED_NODES_AS_ARG__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym71$_KBP_RESTRICTED_NODES_AS_ARG__, NIL);
    {
      SubLObject item_var = $sym73$_KBP_RESTRICTED_NODES_AS_ARG_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym73$_KBP_RESTRICTED_NODES_AS_ARG_, NIL);
    {
      SubLObject item_var = $sym74$_KBP_LINK_REFERENCE_SET_BOUND__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym74$_KBP_LINK_REFERENCE_SET_BOUND__, NIL);
    {
      SubLObject item_var = $sym75$_KBP_LINK_REFERENCE_SET_BOUND_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym75$_KBP_LINK_REFERENCE_SET_BOUND_, NIL);
    {
      SubLObject item_var = $sym76$_KBP_DESIGNATED_LINK_REFERENCES__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym76$_KBP_DESIGNATED_LINK_REFERENCES__, NIL);
    {
      SubLObject item_var = $sym77$_KBP_DESIGNATED_LINK_REFERENCES_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym77$_KBP_DESIGNATED_LINK_REFERENCES_, NIL);
    {
      SubLObject item_var = $sym78$_KBP_BOUND_GAF_TERMS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym78$_KBP_BOUND_GAF_TERMS__, NIL);
    {
      SubLObject item_var = $sym80$_KBP_BOUND_GAF_TERMS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym80$_KBP_BOUND_GAF_TERMS_, NIL);
    {
      SubLObject item_var = $sym81$_KBP_BOUND_LINK_TERMS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym81$_KBP_BOUND_LINK_TERMS__, NIL);
    {
      SubLObject item_var = $sym82$_KBP_BOUND_LINK_TERMS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym82$_KBP_BOUND_LINK_TERMS_, NIL);
    {
      SubLObject item_var = $sym83$_KBP_USE_MAX_MTS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym83$_KBP_USE_MAX_MTS__, NIL);
    {
      SubLObject item_var = $sym84$_NODES_ACCESSOR_FN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym84$_NODES_ACCESSOR_FN_, NIL);
    {
      SubLObject item_var = $sym85$_PATH_LINK_OP_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym85$_PATH_LINK_OP_, NIL);
    {
      SubLObject item_var = $sym86$_PATH_NODE_OP_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym86$_PATH_NODE_OP_, NIL);
    {
      SubLObject item_var = $sym87$_RELEVANT_LINK__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym87$_RELEVANT_LINK__, NIL);
    {
      SubLObject item_var = $sym88$_RELEVANT_NODE__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym88$_RELEVANT_NODE__, NIL);
    {
      SubLObject item_var = $sym89$_RELEVANT_LINK_TREE__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym89$_RELEVANT_LINK_TREE__, NIL);
    {
      SubLObject item_var = $sym90$_EXCLUDE_NODES_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym90$_EXCLUDE_NODES_, NIL);
    {
      SubLObject item_var = $sym91$_EXCLUDE_LINKS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$kbp_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$kbp_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym91$_EXCLUDE_LINKS_, NIL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_KBP_QUIT__ = makeSymbol("*KBP-QUIT?*");
  public static final SubLSymbol $kw1$PATHS = makeKeyword("PATHS");
  public static final SubLSymbol $sym2$_KBP_RESULT_FORMAT_ = makeSymbol("*KBP-RESULT-FORMAT*");
  public static final SubLSymbol $sym3$_SEARCH_ITERATION_ = makeSymbol("*SEARCH-ITERATION*");
  public static final SubLSymbol $sym4$_NODE_EQUAL__ = makeSymbol("*NODE-EQUAL?*");
  public static final SubLSymbol $sym5$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym6$_KBP_NODE__ = makeSymbol("*KBP-NODE?*");
  public static final SubLSymbol $sym7$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym8$_KBP_LINK__ = makeSymbol("*KBP-LINK?*");
  public static final SubLSymbol $sym9$_KBP_STATS_ = makeSymbol("*KBP-STATS*");
  public static final SubLSymbol $sym10$_COLLECT_KBP_STATS__ = makeSymbol("*COLLECT-KBP-STATS?*");
  public static final SubLSymbol $sym11$_KBP_NODE_COUNT_ = makeSymbol("*KBP-NODE-COUNT*");
  public static final SubLSymbol $sym12$_KBP_LINK_COUNT_ = makeSymbol("*KBP-LINK-COUNT*");
  public static final SubLSymbol $sym13$_KBP_TERM_COUNT_ = makeSymbol("*KBP-TERM-COUNT*");
  public static final SubLList $list14 = list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER);
  public static final SubLSymbol $sym15$_SOURCE_TERM_ARGS_ = makeSymbol("*SOURCE-TERM-ARGS*");
  public static final SubLList $list16 = list(ONE_INTEGER, TWO_INTEGER, FOUR_INTEGER, FOUR_INTEGER, FIVE_INTEGER);
  public static final SubLSymbol $sym17$_TARGET_TERM_ARGS_ = makeSymbol("*TARGET-TERM-ARGS*");
  public static final SubLSymbol $sym18$_RELEVANT_NODE_TREE__ = makeSymbol("*RELEVANT-NODE-TREE?*");
  public static final SubLSymbol $sym19$_PATH_SOURCE_ = makeSymbol("*PATH-SOURCE*");
  public static final SubLSymbol $sym20$_PATH_TARGET_ = makeSymbol("*PATH-TARGET*");
  public static final SubLSymbol $sym21$_KBP_SEARCHER_ = makeSymbol("*KBP-SEARCHER*");
  public static final SubLSymbol $sym22$_KBP_SEARCHERS_ = makeSymbol("*KBP-SEARCHERS*");
  public static final SubLSymbol $sym23$_PATH_HORIZON_ = makeSymbol("*PATH-HORIZON*");
  public static final SubLSymbol $sym24$_KBP_COMMON_NODES_ = makeSymbol("*KBP-COMMON-NODES*");
  public static final SubLSymbol $sym25$_PATH_LINK_LATTICE_ = makeSymbol("*PATH-LINK-LATTICE*");
  public static final SubLSymbol $sym26$_PATH_NODE_LATTICE_ = makeSymbol("*PATH-NODE-LATTICE*");
  public static final SubLSymbol $sym27$_KBP_ANCESTOR_ = makeSymbol("*KBP-ANCESTOR*");
  public static final SubLSymbol $sym28$_KBP_RUN_TIME_ = makeSymbol("*KBP-RUN-TIME*");
  public static final SubLSymbol $sym29$_NODE_ANCESTORS_ = makeSymbol("*NODE-ANCESTORS*");
  public static final SubLSymbol $sym30$_LINK_ANCESTORS_ = makeSymbol("*LINK-ANCESTORS*");
  public static final SubLSymbol $sym31$_KBP_DEPTH_ = makeSymbol("*KBP-DEPTH*");
  public static final SubLSymbol $sym32$_KBP_NODES_ = makeSymbol("*KBP-NODES*");
  public static final SubLSymbol $sym33$_KBP_LINKS_ = makeSymbol("*KBP-LINKS*");
  public static final SubLSymbol $sym34$_TERM_ARG_ = makeSymbol("*TERM-ARG*");
  public static final SubLInteger $int35$2048 = makeInteger(2048);
  public static final SubLSymbol $sym36$_KBP_ANCESTOR_HASH_ = makeSymbol("*KBP-ANCESTOR-HASH*");
  public static final SubLSymbol $sym37$_KBP_SEARCH_HASH_ = makeSymbol("*KBP-SEARCH-HASH*");
  public static final SubLSymbol $sym38$_KBP_MIN_ISA_PATH__ = makeSymbol("*KBP-MIN-ISA-PATH?*");
  public static final SubLSymbol $sym39$_KBP_MIN_GENLS_PATH__ = makeSymbol("*KBP-MIN-GENLS-PATH?*");
  public static final SubLSymbol $sym40$_KBP_DESIGNATED_NODE_SUPERIORS__ = makeSymbol("*KBP-DESIGNATED-NODE-SUPERIORS?*");
  public static final SubLSymbol $sym41$_KBP_DESIGNATED_NODE_SUPERIORS_ = makeSymbol("*KBP-DESIGNATED-NODE-SUPERIORS*");
  public static final SubLSymbol $sym42$_KBP_TRACE_LEVEL_ = makeSymbol("*KBP-TRACE-LEVEL*");
  public static final SubLSymbol $sym43$_MAX_SEARCH_ITERATIONS_ = makeSymbol("*MAX-SEARCH-ITERATIONS*");
  public static final SubLSymbol $sym44$_LIMIT_PATH_DEPTH__ = makeSymbol("*LIMIT-PATH-DEPTH?*");
  public static final SubLSymbol $sym45$_KBP_MAX_DEPTH_ = makeSymbol("*KBP-MAX-DEPTH*");
  public static final SubLInteger $int46$1000 = makeInteger(1000);
  public static final SubLSymbol $sym47$_KBP_MAX_TERM_COUNT_ = makeSymbol("*KBP-MAX-TERM-COUNT*");
  public static final SubLSymbol $sym48$_KBP_QUIT_WITH_SUCCESS__ = makeSymbol("*KBP-QUIT-WITH-SUCCESS?*");
  public static final SubLSymbol $sym49$_KBP_ONLY_GAF_LINKS__ = makeSymbol("*KBP-ONLY-GAF-LINKS?*");
  public static final SubLSymbol $sym50$_KBP_NO_BOOKKEEPING_LINKS__ = makeSymbol("*KBP-NO-BOOKKEEPING-LINKS?*");
  public static final SubLSymbol $sym51$_KBP_NO_INSTANCE_LINKS__ = makeSymbol("*KBP-NO-INSTANCE-LINKS?*");
  public static final SubLSymbol $sym52$_KBP_NO_BI_SCOPING_LINKS__ = makeSymbol("*KBP-NO-BI-SCOPING-LINKS?*");
  public static final SubLSymbol $sym53$_KBP_EXPLODE_NATS__ = makeSymbol("*KBP-EXPLODE-NATS?*");
  public static final SubLSymbol $sym54$_KBP_DESIGNATED_PREDS__ = makeSymbol("*KBP-DESIGNATED-PREDS?*");
  public static final SubLSymbol $sym55$_KBP_DESIGNATED_PREDS_ = makeSymbol("*KBP-DESIGNATED-PREDS*");
  public static final SubLSymbol $sym56$_KBP_RESTRICTED_PREDS__ = makeSymbol("*KBP-RESTRICTED-PREDS?*");
  public static final SubLSymbol $sym57$_KBP_RESTRICTED_PREDS_ = makeSymbol("*KBP-RESTRICTED-PREDS*");
  public static final SubLSymbol $sym58$_KBP_RESTRICTED_MTS__ = makeSymbol("*KBP-RESTRICTED-MTS?*");
  public static final SubLList $list59 = list(constant_handles.reader_make_constant_shell(makeString("EnglishMt")));
  public static final SubLSymbol $sym60$_KBP_RESTRICTED_MTS_ = makeSymbol("*KBP-RESTRICTED-MTS*");
  public static final SubLSymbol $sym61$_KBP_EXTERNAL_LINK_PRED__ = makeSymbol("*KBP-EXTERNAL-LINK-PRED?*");
  public static final SubLSymbol $sym62$_KBP_EXTERNAL_LINK_PRED_ = makeSymbol("*KBP-EXTERNAL-LINK-PRED*");
  public static final SubLSymbol $sym63$_KBP_GENL_BOUND__ = makeSymbol("*KBP-GENL-BOUND?*");
  public static final SubLSymbol $sym64$_KBP_GENL_BOUND_ = makeSymbol("*KBP-GENL-BOUND*");
  public static final SubLSymbol $sym65$_KBP_GENLS_CARDINALITY_DELTA_BOUND__ = makeSymbol("*KBP-GENLS-CARDINALITY-DELTA-BOUND?*");
  public static final SubLSymbol $sym66$_KBP_GENLS_CARDINALITY_DELTA_BOUND_ = makeSymbol("*KBP-GENLS-CARDINALITY-DELTA-BOUND*");
  public static final SubLSymbol $sym67$_KBP_ISA_BOUND__ = makeSymbol("*KBP-ISA-BOUND?*");
  public static final SubLSymbol $sym68$_KBP_ISA_BOUND_ = makeSymbol("*KBP-ISA-BOUND*");
  public static final SubLSymbol $sym69$_KBP_NODE_ISA_BOUND__ = makeSymbol("*KBP-NODE-ISA-BOUND?*");
  public static final SubLSymbol $sym70$_KBP_NODE_ISA_BOUND_ = makeSymbol("*KBP-NODE-ISA-BOUND*");
  public static final SubLSymbol $sym71$_KBP_RESTRICTED_NODES_AS_ARG__ = makeSymbol("*KBP-RESTRICTED-NODES-AS-ARG?*");
  public static final SubLList $list72 = list(list(constant_handles.reader_make_constant_shell(makeString("quotedCollection")), ONE_INTEGER));
  public static final SubLSymbol $sym73$_KBP_RESTRICTED_NODES_AS_ARG_ = makeSymbol("*KBP-RESTRICTED-NODES-AS-ARG*");
  public static final SubLSymbol $sym74$_KBP_LINK_REFERENCE_SET_BOUND__ = makeSymbol("*KBP-LINK-REFERENCE-SET-BOUND?*");
  public static final SubLSymbol $sym75$_KBP_LINK_REFERENCE_SET_BOUND_ = makeSymbol("*KBP-LINK-REFERENCE-SET-BOUND*");
  public static final SubLSymbol $sym76$_KBP_DESIGNATED_LINK_REFERENCES__ = makeSymbol("*KBP-DESIGNATED-LINK-REFERENCES?*");
  public static final SubLSymbol $sym77$_KBP_DESIGNATED_LINK_REFERENCES_ = makeSymbol("*KBP-DESIGNATED-LINK-REFERENCES*");
  public static final SubLSymbol $sym78$_KBP_BOUND_GAF_TERMS__ = makeSymbol("*KBP-BOUND-GAF-TERMS?*");
  public static final SubLList $list79 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym80$_KBP_BOUND_GAF_TERMS_ = makeSymbol("*KBP-BOUND-GAF-TERMS*");
  public static final SubLSymbol $sym81$_KBP_BOUND_LINK_TERMS__ = makeSymbol("*KBP-BOUND-LINK-TERMS?*");
  public static final SubLSymbol $sym82$_KBP_BOUND_LINK_TERMS_ = makeSymbol("*KBP-BOUND-LINK-TERMS*");
  public static final SubLSymbol $sym83$_KBP_USE_MAX_MTS__ = makeSymbol("*KBP-USE-MAX-MTS?*");
  public static final SubLSymbol $sym84$_NODES_ACCESSOR_FN_ = makeSymbol("*NODES-ACCESSOR-FN*");
  public static final SubLSymbol $sym85$_PATH_LINK_OP_ = makeSymbol("*PATH-LINK-OP*");
  public static final SubLSymbol $sym86$_PATH_NODE_OP_ = makeSymbol("*PATH-NODE-OP*");
  public static final SubLSymbol $sym87$_RELEVANT_LINK__ = makeSymbol("*RELEVANT-LINK?*");
  public static final SubLSymbol $sym88$_RELEVANT_NODE__ = makeSymbol("*RELEVANT-NODE?*");
  public static final SubLSymbol $sym89$_RELEVANT_LINK_TREE__ = makeSymbol("*RELEVANT-LINK-TREE?*");
  public static final SubLSymbol $sym90$_EXCLUDE_NODES_ = makeSymbol("*EXCLUDE-NODES*");
  public static final SubLSymbol $sym91$_EXCLUDE_LINKS_ = makeSymbol("*EXCLUDE-LINKS*");
  public static final SubLSymbol $sym92$ALL_ASSERTION_TERMS = makeSymbol("ALL-ASSERTION-TERMS");
  public static final SubLSymbol $sym93$DEFAULT_LINK_OP = makeSymbol("DEFAULT-LINK-OP");
  public static final SubLSymbol $sym94$DEFAULT_NODE_OP = makeSymbol("DEFAULT-NODE-OP");
  public static final SubLSymbol $sym95$DEFAULT_RELEVANT_LINK_ = makeSymbol("DEFAULT-RELEVANT-LINK?");
  public static final SubLSymbol $sym96$DEFAULT_RELEVANT_NODE_ = makeSymbol("DEFAULT-RELEVANT-NODE?");
  public static final SubLSymbol $sym97$DEFAULT_RELEVANT_LINK_TREE_ = makeSymbol("DEFAULT-RELEVANT-LINK-TREE?");
  public static final SubLString $str98$searching_for_kb_paths = makeString("searching for kb paths");
  public static final SubLString $str99$missed_connection = makeString("missed connection");
  public static final SubLString $str100$duplicates_in_accessed1 = makeString("duplicates in accessed1");
  public static final SubLString $str101$duplicates_in_accessed2 = makeString("duplicates in accessed2");
  public static final SubLSymbol $kw102$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLString $str103$horizons_missed__iteration__s = makeString("horizons missed; iteration ~s");
  public static final SubLSymbol $sym104$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const105$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym106$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLString $str107$____kbp_common_nodes___a = makeString("~%~%kbp common nodes: ~a");
  public static final SubLString $str108$____complete_paths_home_from___s_ = makeString("~%~%complete-paths-home-from: ~s ~%~s");
  public static final SubLString $str109$_____acomplete_paths_home_from_li = makeString("~%~%~acomplete-paths-home-from-link: ~s ~%~a~s");
  public static final SubLString $str110$_____acomplete_paths_home_from_no = makeString("~%~%~acomplete-paths-home-from-node: ~s ~%~a~s");
  public static final SubLSymbol $kw111$LINKS = makeKeyword("LINKS");
  public static final SubLString $str112$invalid_path_format___s = makeString("invalid path format: ~s");
  public static final SubLList $list113 = list(makeSymbol("ROOT"), makeSymbol("&OPTIONAL"), makeSymbol("LINKS"));
  public static final SubLString $str114$_____agather_node_latice____a_s = makeString("~%~%~agather-node-latice:~%~a~s");
  public static final SubLString $str115$_____agather_link_latice_____a_s = makeString("~%~%~agather-link-latice: ~%~a~s");
  public static final SubLSymbol $sym116$KBP_LINK_NODES = makeSymbol("KBP-LINK-NODES");
  public static final SubLString $str117$____marking_horizon_for__s_in_ite = makeString("~%~%marking horizon for ~s in iteration ~s");
  public static final SubLString $str118$__search_node____s__s___s = makeString("~%search node: [~s ~s] ~s");
  public static final SubLString $str119$empty_horizon_for__s_in_iteration = makeString("empty horizon for ~s in iteration ~s");
  public static final SubLString $str120$___s_searched_by___s = makeString("~%~s searched by: ~s");
  public static final SubLString $str121$___s______goal_________________ = makeString("~%~s  *** goal!!!!!!!!!!!!!!!!!");
  public static final SubLSymbol $kw122$TERM_BOUND = makeKeyword("TERM-BOUND");
  public static final SubLSymbol $sym123$_ = makeSymbol("+");
  public static final SubLSymbol $sym124$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym125$SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");
  public static final SubLObject $const126$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $kw127$UP = makeKeyword("UP");
  public static final SubLSymbol $kw128$DOWN = makeKeyword("DOWN");
  public static final SubLObject $const129$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw130$NEG = makeKeyword("NEG");
  public static final SubLSymbol $sym131$SECOND = makeSymbol("SECOND");
  public static final SubLSymbol $kw132$POS = makeKeyword("POS");
  public static final SubLSymbol $kw133$OTHER = makeKeyword("OTHER");
  public static final SubLSymbol $kw134$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw135$ITERATIONS = makeKeyword("ITERATIONS");
  public static final SubLSymbol $kw136$TERMS = makeKeyword("TERMS");
  public static final SubLSymbol $kw137$NODES = makeKeyword("NODES");
  public static final SubLSymbol $kw138$BRANCH = makeKeyword("BRANCH");
  public static final SubLSymbol $kw139$TIME = makeKeyword("TIME");
  public static final SubLSymbol $kw140$TERMINATION = makeKeyword("TERMINATION");
  public static final SubLSymbol $kw141$EXHAUST = makeKeyword("EXHAUST");
  public static final SubLSymbol $kw142$ITERATION_BOUND = makeKeyword("ITERATION-BOUND");
  public static final SubLSymbol $sym143$EQUAL_NODES_ = makeSymbol("EQUAL-NODES?");
  public static final SubLSymbol $sym144$ASSERTIONS_FI_EQUAL_ = makeSymbol("ASSERTIONS-FI-EQUAL?");
  public static final SubLList $list145 = list(makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATH"));
  public static final SubLList $list146 = list(makeSymbol("LINK"), makeSymbol("NODE-PATH"));
  public static final SubLList $list147 = list(makeSymbol("NODE-1"), makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATH-1"));
  public static final SubLList $list148 = list(makeSymbol("LINK-1"), makeSymbol("NODE-PATH-1"));
  public static final SubLList $list149 = list(makeSymbol("NODE-2"), makeSymbol("&OPTIONAL"), makeSymbol("LINK-PATH-2"));
  public static final SubLSymbol $sym150$KBP_JUST_FROM_TUPLES = makeSymbol("KBP-JUST-FROM-TUPLES");
  public static final SubLSymbol $sym151$KBP_JUST_FROM_TUPLE = makeSymbol("KBP-JUST-FROM-TUPLE");
  public static final SubLString $str152$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $sym153$WARN = makeSymbol("WARN");
  public static final SubLList $list154 = list(constant_handles.reader_make_constant_shell(makeString("isa")));
  public static final SubLList $list155 = list(constant_handles.reader_make_constant_shell(makeString("genls")));
  public static final SubLList $list156 = list(constant_handles.reader_make_constant_shell(makeString("genlMt")));
  public static final SubLInteger $int157$1024 = makeInteger(1024);
  public static final SubLList $list158 = list(constant_handles.reader_make_constant_shell(makeString("conceptuallyRelated")));
  public static final SubLList $list159 = list(constant_handles.reader_make_constant_shell(makeString("Predicate")), constant_handles.reader_make_constant_shell(makeString("Microtheory")), constant_handles.reader_make_constant_shell(makeString("KnowledgeBase")));
  public static final SubLList $list160 = list(constant_handles.reader_make_constant_shell(makeString("TestingConstant")), constant_handles.reader_make_constant_shell(makeString("LinguisticObjectType")), constant_handles.reader_make_constant_shell(makeString("InferenceRelatedBookkeepingPredicate")), constant_handles.reader_make_constant_shell(makeString("GenericAttribute")), constant_handles.reader_make_constant_shell(makeString("KnowledgeBase")));
  public static final SubLList $list161 = list(constant_handles.reader_make_constant_shell(makeString("PartiallyTangible")), constant_handles.reader_make_constant_shell(makeString("SiblingDisjointCollectionType")), constant_handles.reader_make_constant_shell(makeString("ExistingObjectType")));
  public static final SubLList $list162 = list(constant_handles.reader_make_constant_shell(makeString("Predicate")), constant_handles.reader_make_constant_shell(makeString("Microtheory")));
  public static final SubLSymbol $sym163$EXPLAIN_CR_GAF_VIA_PATHS = makeSymbol("EXPLAIN-CR-GAF-VIA-PATHS");
  public static final SubLObject $const164$conceptuallyRelated = constant_handles.reader_make_constant_shell(makeString("conceptuallyRelated"));
  public static final SubLSymbol $sym165$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $sym166$KB_ASSERTION_ = makeSymbol("KB-ASSERTION?");
  public static final SubLSymbol $sym167$ASSERTION_FI_FORMULA = makeSymbol("ASSERTION-FI-FORMULA");
  public static final SubLString $str168$__cr_gafs_considered___a = makeString("~%cr gafs considered: ~a");
  public static final SubLString $str169$__cr_gafs_explained___a = makeString("~%cr gafs explained: ~a");
  public static final SubLString $str170$__cr_gafs_w_errors___a = makeString("~%cr gafs w/errors: ~a");
  public static final SubLObject $const171$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLObject $const172$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLSymbol $kw173$MIN = makeKeyword("MIN");
  public static final SubLList $list174 = list(makeKeyword("REQUIRED"), makeKeyword("RELATION-ALL"));
  public static final SubLSymbol $kw175$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw176$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw177$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym178$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw179$ERROR = makeKeyword("ERROR");
  public static final SubLString $str180$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym181$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw182$CERROR = makeKeyword("CERROR");
  public static final SubLSymbol $kw183$WARN = makeKeyword("WARN");
  public static final SubLString $str184$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLSymbol $sym185$GENLS_GATHER_FOCUS_PREDS_COLS = makeSymbol("GENLS-GATHER-FOCUS-PREDS-COLS");
  public static final SubLSymbol $kw186$TRUE = makeKeyword("TRUE");
  public static final SubLString $str187$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str188$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym189$CAR = makeSymbol("CAR");
  public static final SubLList $list190 = cons(makeSymbol("COL"), makeSymbol("PRED"));
  public static final SubLSymbol $sym191$_ = makeSymbol(">");
  public static final SubLSymbol $sym192$CADR = makeSymbol("CADR");
  public static final SubLObject $const193$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw194$ALL = makeKeyword("ALL");
  public static final SubLSymbol $kw195$MAX = makeKeyword("MAX");
  public static final SubLSymbol $kw196$MID = makeKeyword("MID");
  public static final SubLSymbol $kw197$EDGE = makeKeyword("EDGE");
  public static final SubLList $list198 = list(makeKeyword("REQUIRED"), makeKeyword("RELATION-ALL"), makeKeyword("RELATION-EXISTS"), makeKeyword("INTER-ARG-ISA-INDEPENDENT"), makeKeyword("INTER-ARG-ISA-DEPENDENT"));
  public static final SubLSymbol $sym199$GENLS_GATHER_FOCUS_PREDS_OF = makeSymbol("GENLS-GATHER-FOCUS-PREDS-OF");

  //// Initializers

  public void declareFunctions() {
    declare_kb_paths_file();
  }

  public void initializeVariables() {
    init_kb_paths_file();
  }

  public void runTopLevelForms() {
    setup_kb_paths_file();
  }

}
