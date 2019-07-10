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
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.genl_predicates;
//dm import com.cyc.cycjava_1.cycl.gt_methods;
//dm import com.cyc.cycjava_1.cycl.gt_utilities;
//dm import com.cyc.cycjava_1.cycl.gt_vars;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_gp_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.pred_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class gt_search extends SubLTranslatedFile {

  //// Constructor

  private gt_search() {}
  public static final SubLFile me = new gt_search();
  public static final String myName = "com.cyc.cycjava_1.cycl.gt_search";

  //// Definitions

  @SubL(source = "cycl/gt-search.lisp", position = 30437) 
  public static final SubLObject gt_searchedP(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != gt_utilities.gt_term_p(node))) {
        return Hashtables.gethash(node, gt_vars.$gt_marking_table$.getDynamicValue(thread), UNPROVIDED);
      }
      return NIL;
    }
  }

  public static final SubLObject declare_gt_search_file() {
    //declareFunction(myName, "gt_search_index_arg", "GT-SEARCH-INDEX-ARG", 0, 0, false);
    //declareFunction(myName, "gt_search_gather_arg", "GT-SEARCH-GATHER-ARG", 0, 0, false);
    //declareFunction(myName, "gt_link_node", "GT-LINK-NODE", 1, 0, false);
    //declareFunction(myName, "gt_link_node_and_mt", "GT-LINK-NODE-AND-MT", 1, 0, false);
    //declareFunction(myName, "gt_link_values", "GT-LINK-VALUES", 1, 0, false);
    //declareFunction(myName, "gt_add_to_result", "GT-ADD-TO-RESULT", 1, 0, false);
    //declareFunction(myName, "gt_gather_link_node", "GT-GATHER-LINK-NODE", 1, 0, false);
    //declareFunction(myName, "gt_gather_link_node_and_mt", "GT-GATHER-LINK-NODE-AND-MT", 1, 0, false);
    //declareFunction(myName, "gt_siblings", "GT-SIBLINGS", 1, 0, false);
    //declareFunction(myName, "gt_gather_sibling_node", "GT-GATHER-SIBLING-NODE", 1, 0, false);
    //declareFunction(myName, "gt_all_accessed", "GT-ALL-ACCESSED", 1, 0, false);
    //declareFunction(myName, "tts_all_accessed", "TTS-ALL-ACCESSED", 1, 0, false);
    //declareFunction(myName, "gt_extremal_accessed", "GT-EXTREMAL-ACCESSED", 1, 0, false);
    //declareFunction(myName, "gt_gather_extremal_node", "GT-GATHER-EXTREMAL-NODE", 1, 0, false);
    //declareFunction(myName, "gt_accessesP", "GT-ACCESSES?", 2, 1, false);
    //declareFunction(myName, "gt_test_link_node", "GT-TEST-LINK-NODE", 1, 0, false);
    //declareFunction(myName, "gt_gather", "GT-GATHER", 2, 0, false);
    //declareFunction(myName, "gt_gather_node", "GT-GATHER-NODE", 1, 0, false);
    //declareFunction(myName, "gt_common_horizon", "GT-COMMON-HORIZON", 1, 2, false);
    //declareFunction(myName, "gt_compose_fn_all_accessed", "GT-COMPOSE-FN-ALL-ACCESSED", 2, 1, false);
    //declareFunction(myName, "gt_compose_fn_link_node", "GT-COMPOSE-FN-LINK-NODE", 1, 0, false);
    //declareFunction(myName, "gt_select_all_accessed", "GT-SELECT-ALL-ACCESSED", 2, 1, false);
    //declareFunction(myName, "gt_select_link_node", "GT-SELECT-LINK-NODE", 1, 0, false);
    //declareFunction(myName, "gt_all_dependent_accessed", "GT-ALL-DEPENDENT-ACCESSED", 1, 0, false);
    //declareFunction(myName, "gt_gather_marked_accessed", "GT-GATHER-MARKED-ACCESSED", 1, 0, false);
    //declareFunction(myName, "gt_gather_marked_link_node", "GT-GATHER-MARKED-LINK-NODE", 1, 0, false);
    //declareFunction(myName, "gt_mark_unselect_all_accessed_as_unsearched", "GT-MARK-UNSELECT-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_unselect_link_node_all_accessed_as_unsearched", "GT-MARK-UNSELECT-LINK-NODE-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_compose_pred_all_accessed", "GT-COMPOSE-PRED-ALL-ACCESSED", 2, 0, false);
    //declareFunction(myName, "gt_compose_pred_link_node", "GT-COMPOSE-PRED-LINK-NODE", 1, 0, false);
    //declareFunction(myName, "gt_compose_pred_link_node_int", "GT-COMPOSE-PRED-LINK-NODE-INT", 1, 0, false);
    //declareFunction(myName, "gt_why_accessesP", "GT-WHY-ACCESSES?", 2, 0, false);
    //declareFunction(myName, "gt_gather_access_just", "GT-GATHER-ACCESS-JUST", 1, 0, false);
    //declareFunction(myName, "gt_any_access_path", "GT-ANY-ACCESS-PATH", 2, 0, false);
    //declareFunction(myName, "gt_gather_access_path", "GT-GATHER-ACCESS-PATH", 1, 0, false);
    //declareFunction(myName, "gt_min_mts_of_paths", "GT-MIN-MTS-OF-PATHS", 2, 0, false);
    //declareFunction(myName, "gt_maximin_mts_among_lists", "GT-MAXIMIN-MTS-AMONG-LISTS", 2, 0, false);
    //declareFunction(myName, "gt_gather_link_node_and_max_mts", "GT-GATHER-LINK-NODE-AND-MAX-MTS", 1, 0, false);
    //declareFunction(myName, "gt_mark_link_node_as_unsearched_and_collect_mts", "GT-MARK-LINK-NODE-AS-UNSEARCHED-AND-COLLECT-MTS", 1, 0, false);
    //declareFunction(myName, "gt_mark_as_unsearched_and_collect_all_accessed", "GT-MARK-AS-UNSEARCHED-AND-COLLECT-ALL-ACCESSED", 1, 0, false);
    //declareFunction(myName, "gt_all_accessed_with_mts", "GT-ALL-ACCESSED-WITH-MTS", 1, 0, false);
    //declareFunction(myName, "gt_gather_link_node_and_store_edges", "GT-GATHER-LINK-NODE-AND-STORE-EDGES", 1, 0, false);
    //declareFunction(myName, "gt_check_for_cycle_edges_to_add", "GT-CHECK-FOR-CYCLE-EDGES-TO-ADD", 0, 0, false);
    //declareFunction(myName, "gt_all_edges_to_goal", "GT-ALL-EDGES-TO-GOAL", 1, 0, false);
    //declareFunction(myName, "gt_access_all_while_storing_paths", "GT-ACCESS-ALL-WHILE-STORING-PATHS", 1, 0, false);
    //declareFunction(myName, "gt_gather_link_nodes_and_store_all_paths", "GT-GATHER-LINK-NODES-AND-STORE-ALL-PATHS", 1, 0, false);
    //declareFunction(myName, "gt_access_all_while_unifying_mts", "GT-ACCESS-ALL-WHILE-UNIFYING-MTS", 1, 0, false);
    //declareFunction(myName, "gt_map_links_rebinding_candidate_mts", "GT-MAP-LINKS-REBINDING-CANDIDATE-MTS", 1, 1, false);
    //declareFunction(myName, "gt_gather_link_nodes_and_unify_mts_along_the_way", "GT-GATHER-LINK-NODES-AND-UNIFY-MTS-ALONG-THE-WAY", 1, 0, false);
    //declareFunction(myName, "gt_maxs_of_mt_list", "GT-MAXS-OF-MT-LIST", 1, 0, false);
    //declareFunction(myName, "is_x_a_path_list_in_yP", "IS-X-A-PATH-LIST-IN-Y?", 2, 0, false);
    //declareFunction(myName, "fort_sets_equal", "FORT-SETS-EQUAL", 2, 0, false);
    //declareFunction(myName, "adjudiciate_adding_mt", "ADJUDICIATE-ADDING-MT", 1, 0, false);
    //declareFunction(myName, "gt_finished", "GT-FINISHED", 0, 1, false);
    //declareFunction(myName, "gt_map_links", "GT-MAP-LINKS", 1, 1, false);
    //declareFunction(myName, "gt_map_assertion_links", "GT-MAP-ASSERTION-LINKS", 2, 0, false);
    //declareFunction(myName, "gt_map_accessors_links", "GT-MAP-ACCESSORS-LINKS", 2, 0, false);
    //declareFunction(myName, "gt_map_arg_index", "GT-MAP-ARG-INDEX", 4, 1, false);
    //declareFunction(myName, "gt_gp_mapper", "GT-GP-MAPPER", 4, 0, false);
    //declareFunction(myName, "gt_mapper", "GT-MAPPER", 5, 0, false);
    //declareFunction(myName, "gt_map_gaf_arg_index_link_nodes", "GT-MAP-GAF-ARG-INDEX-LINK-NODES", 3, 3, false);
    //declareFunction(myName, "gt_mark_as_searched", "GT-MARK-AS-SEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_as_unsearched", "GT-MARK-AS-UNSEARCHED", 1, 0, false);
    declareFunction(myName, "gt_searchedP", "GT-SEARCHED?", 1, 0, false);
    //declareFunction(myName, "gt_mark_as_searched_by", "GT-MARK-AS-SEARCHED-BY", 2, 0, false);
    //declareFunction(myName, "gt_mark_as_searched_with", "GT-MARK-AS-SEARCHED-WITH", 2, 0, false);
    //declareFunction(myName, "gt_searched_byP", "GT-SEARCHED-BY?", 2, 1, false);
    //declareFunction(myName, "gt_searched_by_allP", "GT-SEARCHED-BY-ALL?", 2, 1, false);
    //declareFunction(myName, "gt_searched_in_target_spaceP", "GT-SEARCHED-IN-TARGET-SPACE?", 1, 1, false);
    //declareFunction(myName, "gt_mark_as_unsearched_in_space", "GT-MARK-AS-UNSEARCHED-IN-SPACE", 1, 1, false);
    //declareFunction(myName, "gt_mark_as_searched_in_target_space", "GT-MARK-AS-SEARCHED-IN-TARGET-SPACE", 3, 0, false);
    //declareFunction(myName, "gt_mark_link_node_as_searched", "GT-MARK-LINK-NODE-AS-SEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_as_searched_and_step", "GT-MARK-AS-SEARCHED-AND-STEP", 1, 0, false);
    //declareFunction(myName, "gt_mark_link_node_as_unsearched", "GT-MARK-LINK-NODE-AS-UNSEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_as_unsearched_and_step", "GT-MARK-AS-UNSEARCHED-AND-STEP", 1, 0, false);
    //declareFunction(myName, "gt_mark_link_node_as_searched_by", "GT-MARK-LINK-NODE-AS-SEARCHED-BY", 1, 0, false);
    //declareFunction(myName, "gt_mark_as_searched_by_and_step", "GT-MARK-AS-SEARCHED-BY-AND-STEP", 1, 0, false);
    //declareFunction(myName, "gt_mark_all_superiors_as_searched", "GT-MARK-ALL-SUPERIORS-AS-SEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_proper_all_superiors_as_searched", "GT-MARK-PROPER-ALL-SUPERIORS-AS-SEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_all_inferiors_as_searched", "GT-MARK-ALL-INFERIORS-AS-SEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_proper_all_inferiors_as_searched", "GT-MARK-PROPER-ALL-INFERIORS-AS-SEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_all_accessed_as_searched", "GT-MARK-ALL-ACCESSED-AS-SEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_proper_all_accessed_as_searched", "GT-MARK-PROPER-ALL-ACCESSED-AS-SEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_all_superiors_as_unsearched", "GT-MARK-ALL-SUPERIORS-AS-UNSEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_proper_all_superiors_as_unsearched", "GT-MARK-PROPER-ALL-SUPERIORS-AS-UNSEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_all_inferiors_as_unsearched", "GT-MARK-ALL-INFERIORS-AS-UNSEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_proper_all_inferiors_as_unsearched", "GT-MARK-PROPER-ALL-INFERIORS-AS-UNSEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_all_accessed_as_unsearched", "GT-MARK-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_proper_all_accessed_as_unsearched", "GT-MARK-PROPER-ALL-ACCESSED-AS-UNSEARCHED", 1, 0, false);
    //declareFunction(myName, "gt_mark_all_accessed_as_searched_by", "GT-MARK-ALL-ACCESSED-AS-SEARCHED-BY", 2, 0, false);
    //declareFunction(myName, "gt_mark_proper_all_accessed_as_searched_by", "GT-MARK-PROPER-ALL-ACCESSED-AS-SEARCHED-BY", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_gt_search_file() {
    return NIL;
  }

  public static final SubLObject setup_gt_search_file() {
    // CVS_ID("Id: gt-search.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$DIRECTED = makeKeyword("DIRECTED");
  public static final SubLSymbol $kw1$SUPERIOR = makeKeyword("SUPERIOR");
  public static final SubLSymbol $kw2$INFERIOR = makeKeyword("INFERIOR");
  public static final SubLSymbol $kw3$INVERSE = makeKeyword("INVERSE");
  public static final SubLString $str4$illegal_value_of__gt_mode____s = makeString("illegal value of *gt-mode*: ~s");
  public static final SubLSymbol $sym5$GT_GATHER_LINK_NODE = makeSymbol("GT-GATHER-LINK-NODE");
  public static final SubLSymbol $sym6$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym7$GT_GATHER_SIBLING_NODE = makeSymbol("GT-GATHER-SIBLING-NODE");
  public static final SubLString $str8$invalid_gt_mode___a = makeString("invalid gt mode: ~a");
  public static final SubLString $str9$illegal_value_of__gt_mode_ = makeString("illegal value of *gt-mode*");
  public static final SubLSymbol $sym10$GT_MAP_LINKS = makeSymbol("GT-MAP-LINKS");
  public static final SubLSymbol $sym11$GT_GATHER_EXTREMAL_NODE = makeSymbol("GT-GATHER-EXTREMAL-NODE");
  public static final SubLSymbol $sym12$GT_TEST_LINK_NODE = makeSymbol("GT-TEST-LINK-NODE");
  public static final SubLString $str13$_a_is_not_a_function = makeString("~a is not a function");
  public static final SubLSymbol $sym14$GT_GATHER_NODE = makeSymbol("GT-GATHER-NODE");
  public static final SubLInteger $int15$128 = makeInteger(128);
  public static final SubLSymbol $sym16$GT_COMPOSE_FN_LINK_NODE = makeSymbol("GT-COMPOSE-FN-LINK-NODE");
  public static final SubLSymbol $sym17$CONS = makeSymbol("CONS");
  public static final SubLSymbol $sym18$GT_SELECT_LINK_NODE = makeSymbol("GT-SELECT-LINK-NODE");
  public static final SubLSymbol $sym19$GT_MARK_AS_SEARCHED_AND_STEP = makeSymbol("GT-MARK-AS-SEARCHED-AND-STEP");
  public static final SubLSymbol $sym20$GT_MARK_AS_UNSEARCHED_AND_STEP = makeSymbol("GT-MARK-AS-UNSEARCHED-AND-STEP");
  public static final SubLSymbol $sym21$GT_GATHER_MARKED_LINK_NODE = makeSymbol("GT-GATHER-MARKED-LINK-NODE");
  public static final SubLSymbol $sym22$GT_MARK_UNSELECT_LINK_NODE_ALL_ACCESSED_AS_UNSEARCHED = makeSymbol("GT-MARK-UNSELECT-LINK-NODE-ALL-ACCESSED-AS-UNSEARCHED");
  public static final SubLSymbol $sym23$GT_ALL_PREDECESSORS_SEARCHED_ = makeSymbol("GT-ALL-PREDECESSORS-SEARCHED?");
  public static final SubLSymbol $sym24$GT_COMPOSE_PRED_LINK_NODE = makeSymbol("GT-COMPOSE-PRED-LINK-NODE");
  public static final SubLSymbol $sym25$FORT_P = makeSymbol("FORT-P");
  public static final SubLObject $const26$equals = constant_handles.reader_make_constant_shell(makeString("equals"));
  public static final SubLList $list27 = list(makeKeyword("TRUE"));
  public static final SubLSymbol $sym28$GT_GATHER_ACCESS_JUST = makeSymbol("GT-GATHER-ACCESS-JUST");
  public static final SubLSymbol $sym29$GT_GATHER_ACCESS_PATH = makeSymbol("GT-GATHER-ACCESS-PATH");
  public static final SubLSymbol $sym30$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const31$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const32$ReflexiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ReflexiveBinaryPredicate"));
  public static final SubLObject $const33$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $kw34$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym35$TRUTH_P = makeSymbol("TRUTH-P");
  public static final SubLSymbol $sym36$GT_MARK_LINK_NODE_AS_UNSEARCHED_AND_COLLECT_MTS = makeSymbol("GT-MARK-LINK-NODE-AS-UNSEARCHED-AND-COLLECT-MTS");
  public static final SubLSymbol $sym37$GT_GATHER_LINK_NODE_AND_MAX_MTS = makeSymbol("GT-GATHER-LINK-NODE-AND-MAX-MTS");
  public static final SubLSymbol $sym38$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym39$GT_GATHER_LINK_NODE_AND_STORE_EDGES = makeSymbol("GT-GATHER-LINK-NODE-AND-STORE-EDGES");
  public static final SubLSymbol $sym40$GT_MAP_LINKS_REBINDING_CANDIDATE_MTS = makeSymbol("GT-MAP-LINKS-REBINDING-CANDIDATE-MTS");
  public static final SubLSymbol $sym41$GT_GATHER_LINK_NODES_AND_STORE_ALL_PATHS = makeSymbol("GT-GATHER-LINK-NODES-AND-STORE-ALL-PATHS");
  public static final SubLSymbol $sym42$GT_GATHER_LINK_NODES_AND_UNIFY_MTS_ALONG_THE_WAY = makeSymbol("GT-GATHER-LINK-NODES-AND-UNIFY-MTS-ALONG-THE-WAY");
  public static final SubLSymbol $kw43$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLString $str44$illegal_value_of__gt_link_type___ = makeString("illegal value of *gt-link-type*: ~s");
  public static final SubLSymbol $sym45$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
  public static final SubLInteger $int46$512 = makeInteger(512);
  public static final SubLString $str47$GT_recursion_limit_reached_ = makeString("GT recursion limit reached.");
  public static final SubLSymbol $kw48$ACCESSORS = makeKeyword("ACCESSORS");
  public static final SubLSymbol $kw49$ACCESSIBLE = makeKeyword("ACCESSIBLE");
  public static final SubLList $list50 = list(makeSymbol("*GT-PRED*"), makeSymbol("*GT-INDEX-ARG*"), makeSymbol("*GT-GATHER-ARG*"));
  public static final SubLSymbol $kw51$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLSymbol $sym52$RELEVANT_PRED_IS_SPEC_PRED = makeSymbol("RELEVANT-PRED-IS-SPEC-PRED");
  public static final SubLSymbol $kw53$GAF = makeKeyword("GAF");
  public static final SubLSymbol $sym54$RELEVANT_PRED_IS_SPEC_INVERSE = makeSymbol("RELEVANT-PRED-IS-SPEC-INVERSE");
  public static final SubLSymbol $sym55$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym56$GT_MARK_AS_SEARCHED_BY_AND_STEP = makeSymbol("GT-MARK-AS-SEARCHED-BY-AND-STEP");

  //// Initializers

  public void declareFunctions() {
    declare_gt_search_file();
  }

  public void initializeVariables() {
    init_gt_search_file();
  }

  public void runTopLevelForms() {
    setup_gt_search_file();
  }

}
