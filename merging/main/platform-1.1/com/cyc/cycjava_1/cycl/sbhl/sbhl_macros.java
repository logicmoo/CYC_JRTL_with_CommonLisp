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
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class sbhl_macros extends SubLTranslatedFile {

  //// Constructor

  private sbhl_macros() {}
  public static final SubLFile me = new sbhl_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_macros";

  //// Definitions

  @SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 12124) 
  public static final SubLObject do_sbhl_non_fort_linksP(SubLObject node, SubLObject module) {
    return makeBoolean(((module == sbhl_module_vars.get_sbhl_module($const92$isa))
           && (NIL != collection_supports_non_fort_instancesP(node))));
  }

  @SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 12323) 
  public static final SubLObject collection_supports_non_fort_instancesP(SubLObject col) {
    return T;
  }

  /** Accessor: @return listp; the list of sbhl modules allowed by MODULE for following links. */
  @SubL(source = "cycl/sbhl/sbhl-macros.lisp", position = 19898) 
  public static final SubLObject get_sbhl_accessible_modules(SubLObject module) {
    checkType(module, $sym154$SBHL_MODULE_P);
    {
      SubLObject preds = sbhl_module_utilities.get_sbhl_accessible_link_preds(module);
      return ((NIL != preds) ? ((SubLObject) Mapping.mapcar($sym155$GET_SBHL_MODULE, preds)) : list(module));
    }
  }

  public static final SubLObject declare_sbhl_macros_file() {
    //declareMacro("do_sbhl_link_nodes", "DO-SBHL-LINK-NODES");
    //declareMacro("do_sbhl_tv_links", "DO-SBHL-TV-LINKS");
    //declareMacro("do_sbhl_mt_link", "DO-SBHL-MT-LINK");
    //declareMacro("do_sbhl_mt_links", "DO-SBHL-MT-LINKS");
    //declareMacro("do_sbhl_direction_link", "DO-SBHL-DIRECTION-LINK");
    //declareMacro("do_sbhl_graph_link", "DO-SBHL-GRAPH-LINK");
    //declareMacro("do_sbhl_forward_true_link_mts", "DO-SBHL-FORWARD-TRUE-LINK-MTS");
    //declareMacro("do_sbhl_forward_true_link_nodes_and_mts", "DO-SBHL-FORWARD-TRUE-LINK-NODES-AND-MTS");
    //declareMacro("do_all_sbhl_tv_links", "DO-ALL-SBHL-TV-LINKS");
    //declareMacro("do_all_sbhl_link_nodes", "DO-ALL-SBHL-LINK-NODES");
    //declareMacro("do_all_sbhl_forward_true_link_nodes", "DO-ALL-SBHL-FORWARD-TRUE-LINK-NODES");
    //declareMacro("do_all_sbhl_backward_true_link_nodes", "DO-ALL-SBHL-BACKWARD-TRUE-LINK-NODES");
    //declareMacro("with_sbhl_graph_link", "WITH-SBHL-GRAPH-LINK");
    //declareMacro("with_relevant_sbhl_link_nodes", "WITH-RELEVANT-SBHL-LINK-NODES");
    //declareMacro("with_relevant_sbhl_link_nodes_and_non_forts", "WITH-RELEVANT-SBHL-LINK-NODES-AND-NON-FORTS");
    //declareMacro("with_relevant_sbhl_fort_link_nodes", "WITH-RELEVANT-SBHL-FORT-LINK-NODES");
    //declareMacro("do_non_fort_direct_instance_links", "DO-NON-FORT-DIRECT-INSTANCE-LINKS");
    //declareMacro("with_sbhl_non_fort_links", "WITH-SBHL-NON-FORT-LINKS");
    declareFunction("do_sbhl_non_fort_linksP", "DO-SBHL-NON-FORT-LINKS?", 2, 0, false);
    declareFunction("collection_supports_non_fort_instancesP", "COLLECTION-SUPPORTS-NON-FORT-INSTANCES?", 1, 0, false);
    //declareFunction("admissible_non_fort_link_nodeP", "ADMISSIBLE-NON-FORT-LINK-NODE?", 1, 0, false);
    //declareMacro("do_relevant_sbhl_naut_generated_links", "DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");
    //declareMacro("do_relevant_forward_sbhl_link_nodes", "DO-RELEVANT-FORWARD-SBHL-LINK-NODES");
    //declareMacro("do_relevant_backward_sbhl_link_nodes", "DO-RELEVANT-BACKWARD-SBHL-LINK-NODES");
    //declareMacro("with_accessible_sbhl_link_nodes", "WITH-ACCESSIBLE-SBHL-LINK-NODES");
    //declareMacro("with_accessible_sbhl_link_nodes_and_non_forts", "WITH-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");
    //declareMacro("do_accessible_sbhl_link_nodes", "DO-ACCESSIBLE-SBHL-LINK-NODES");
    //declareMacro("do_accessible_sbhl_link_nodes_and_non_forts", "DO-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");
    //declareMacro("do_accessible_sbhl_link_node_search_states", "DO-ACCESSIBLE-SBHL-LINK-NODE-SEARCH-STATES");
    //declareMacro("do_accessible_sbhl_tv_links", "DO-ACCESSIBLE-SBHL-TV-LINKS");
    //declareMacro("do_relevant_sbhl_link_nodes", "DO-RELEVANT-SBHL-LINK-NODES");
    //declareMacro("do_relevant_sbhl_forward_link_nodes", "DO-RELEVANT-SBHL-FORWARD-LINK-NODES");
    //declareMacro("do_relevant_sbhl_backward_link_nodes", "DO-RELEVANT-SBHL-BACKWARD-LINK-NODES");
    //declareMacro("do_sbhl_predicates", "DO-SBHL-PREDICATES");
    //declareMacro("do_sbhl_non_time_predicates", "DO-SBHL-NON-TIME-PREDICATES");
    //declareMacro("do_sbhl_non_time_modules", "DO-SBHL-NON-TIME-MODULES");
    //declareMacro("do_sbhl_graphs", "DO-SBHL-GRAPHS");
    //declareMacro("with_forward_sbhl_link_direction", "WITH-FORWARD-SBHL-LINK-DIRECTION");
    //declareMacro("with_backward_sbhl_link_direction", "WITH-BACKWARD-SBHL-LINK-DIRECTION");
    //declareMacro("with_sbhl_type_test", "WITH-SBHL-TYPE-TEST");
    //declareMacro("do_sbhl_module_graph", "DO-SBHL-MODULE-GRAPH");
    //declareMacro("do_with_relevant_sbhl_modules", "DO-WITH-RELEVANT-SBHL-MODULES");
    declareFunction("get_sbhl_accessible_modules", "GET-SBHL-ACCESSIBLE-MODULES", 1, 0, false);
    //declareMacro("do_relevant_sbhl_directions", "DO-RELEVANT-SBHL-DIRECTIONS");
    //declareMacro("bind_sbhl_search_behavior", "BIND-SBHL-SEARCH-BEHAVIOR");
    //declareMacro("bind_sbhl_boolean_goal_fn", "BIND-SBHL-BOOLEAN-GOAL-FN");
    //declareMacro("bind_sbhl_sample_leaf_search_behavior", "BIND-SBHL-SAMPLE-LEAF-SEARCH-BEHAVIOR");
    //declareMacro("do_all_simple_true_links", "DO-ALL-SIMPLE-TRUE-LINKS");
    //declareMacro("do_all_simple_forward_true_links", "DO-ALL-SIMPLE-FORWARD-TRUE-LINKS");
    //declareMacro("do_all_simple_backward_true_links", "DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS");
    //declareMacro("do_all_simple_true_links_for_inverses", "DO-ALL-SIMPLE-TRUE-LINKS-FOR-INVERSES");
    //declareMacro("do_all_simple_forward_true_links_for_inverses", "DO-ALL-SIMPLE-FORWARD-TRUE-LINKS-FOR-INVERSES");
    //declareMacro("do_all_simple_backward_true_links_for_inverses", "DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS-FOR-INVERSES");
    //declareMacro("do_all_mode_true_links_for_inverses", "DO-ALL-MODE-TRUE-LINKS-FOR-INVERSES");
    //declareMacro("do_all_mode_backward_true_links_for_inverses", "DO-ALL-MODE-BACKWARD-TRUE-LINKS-FOR-INVERSES");
    //declareMacro("do_all_mode_forward_true_links_for_inverses", "DO-ALL-MODE-FORWARD-TRUE-LINKS-FOR-INVERSES");
    //declareMacro("do_all_forward_true_links_for_tt", "DO-ALL-FORWARD-TRUE-LINKS-FOR-TT");
    //declareMacro("do_all_backward_true_links_for_tt", "DO-ALL-BACKWARD-TRUE-LINKS-FOR-TT");
    //declareMacro("do_true_isa_links", "DO-TRUE-ISA-LINKS");
    //declareMacro("do_relevant_isa_links", "DO-RELEVANT-ISA-LINKS");
    //declareMacro("do_local_isas", "DO-LOCAL-ISAS");
    //declareMacro("some_relevant_isa", "SOME-RELEVANT-ISA");
    //declareMacro("do_true_instance_links", "DO-TRUE-INSTANCE-LINKS");
    //declareMacro("do_relevant_instance_links", "DO-RELEVANT-INSTANCE-LINKS");
    //declareMacro("do_local_instances", "DO-LOCAL-INSTANCES");
    //declareMacro("do_true_quoted_isa_links", "DO-TRUE-QUOTED-ISA-LINKS");
    //declareMacro("do_local_quoted_isas", "DO-LOCAL-QUOTED-ISAS");
    //declareMacro("do_true_quoted_instance_links", "DO-TRUE-QUOTED-INSTANCE-LINKS");
    //declareMacro("do_local_quoted_instances", "DO-LOCAL-QUOTED-INSTANCES");
    //declareMacro("do_all_isa", "DO-ALL-ISA");
    //declareMacro("do_all_isa_depth", "DO-ALL-ISA-DEPTH");
    //declareMacro("do_all_isa_breadth", "DO-ALL-ISA-BREADTH");
    //declareMacro("do_all_isas_by_generality", "DO-ALL-ISAS-BY-GENERALITY");
    //declareMacro("do_all_instances", "DO-ALL-INSTANCES");
    //declareMacro("do_all_instances_depth", "DO-ALL-INSTANCES-DEPTH");
    //declareMacro("do_all_instances_breadth", "DO-ALL-INSTANCES-BREADTH");
    //declareMacro("do_all_fort_instances", "DO-ALL-FORT-INSTANCES");
    //declareMacro("do_all_instances_of_all", "DO-ALL-INSTANCES-OF-ALL");
    //declareMacro("do_all_quoted_instances", "DO-ALL-QUOTED-INSTANCES");
    //declareMacro("do_all_quoted_instances_of_all", "DO-ALL-QUOTED-INSTANCES-OF-ALL");
    //declareMacro("do_true_genls_links", "DO-TRUE-GENLS-LINKS");
    //declareMacro("do_relevant_genls_links", "DO-RELEVANT-GENLS-LINKS");
    //declareMacro("do_genls", "DO-GENLS");
    //declareMacro("do_local_genls", "DO-LOCAL-GENLS");
    //declareMacro("do_true_spec_links", "DO-TRUE-SPEC-LINKS");
    //declareMacro("do_relevant_spec_links", "DO-RELEVANT-SPEC-LINKS");
    //declareMacro("do_local_specs", "DO-LOCAL-SPECS");
    //declareMacro("do_all_genls", "DO-ALL-GENLS");
    //declareMacro("do_all_genls_depth", "DO-ALL-GENLS-DEPTH");
    //declareMacro("do_all_genls_breadth", "DO-ALL-GENLS-BREADTH");
    //declareMacro("do_all_genls_by_generality", "DO-ALL-GENLS-BY-GENERALITY");
    //declareMacro("do_all_specs", "DO-ALL-SPECS");
    //declareMacro("do_all_specs_depth", "DO-ALL-SPECS-DEPTH");
    //declareMacro("do_all_specs_breadth", "DO-ALL-SPECS-BREADTH");
    //declareMacro("do_all_specs_by_generality", "DO-ALL-SPECS-BY-GENERALITY");
    //declareMacro("do_true_genl_predicate_links", "DO-TRUE-GENL-PREDICATE-LINKS");
    //declareMacro("do_relevant_genl_predicate_links", "DO-RELEVANT-GENL-PREDICATE-LINKS");
    //declareMacro("do_true_spec_predicate_links", "DO-TRUE-SPEC-PREDICATE-LINKS");
    //declareMacro("do_relevant_spec_predicate_links", "DO-RELEVANT-SPEC-PREDICATE-LINKS");
    //declareMacro("do_all_genl_predicates", "DO-ALL-GENL-PREDICATES");
    //declareMacro("do_all_genl_predicates_depth", "DO-ALL-GENL-PREDICATES-DEPTH");
    //declareMacro("do_all_genl_predicates_breadth", "DO-ALL-GENL-PREDICATES-BREADTH");
    //declareMacro("do_all_genl_predicates_and_inverses", "DO-ALL-GENL-PREDICATES-AND-INVERSES");
    //declareMacro("do_all_spec_predicates", "DO-ALL-SPEC-PREDICATES");
    //declareMacro("do_all_spec_predicates_depth", "DO-ALL-SPEC-PREDICATES-DEPTH");
    //declareMacro("do_all_spec_predicates_breadth", "DO-ALL-SPEC-PREDICATES-BREADTH");
    //declareMacro("do_all_spec_predicates_and_inverses", "DO-ALL-SPEC-PREDICATES-AND-INVERSES");
    //declareMacro("do_all_proper_genl_predicates", "DO-ALL-PROPER-GENL-PREDICATES");
    //declareMacro("do_all_proper_genl_inverses", "DO-ALL-PROPER-GENL-INVERSES");
    //declareMacro("do_true_genl_inverse_links", "DO-TRUE-GENL-INVERSE-LINKS");
    //declareMacro("do_relevant_genl_inverse_links", "DO-RELEVANT-GENL-INVERSE-LINKS");
    //declareMacro("do_true_spec_inverse_links", "DO-TRUE-SPEC-INVERSE-LINKS");
    //declareMacro("do_relevant_spec_inverse_links", "DO-RELEVANT-SPEC-INVERSE-LINKS");
    //declareMacro("do_all_genl_inverses", "DO-ALL-GENL-INVERSES");
    //declareMacro("do_all_genl_inverses_depth", "DO-ALL-GENL-INVERSES-DEPTH");
    //declareMacro("do_all_genl_inverses_breadth", "DO-ALL-GENL-INVERSES-BREADTH");
    //declareMacro("do_all_spec_inverses", "DO-ALL-SPEC-INVERSES");
    //declareMacro("do_all_spec_inverses_depth", "DO-ALL-SPEC-INVERSES-DEPTH");
    //declareMacro("do_all_spec_inverses_breadth", "DO-ALL-SPEC-INVERSES-BREADTH");
    //declareMacro("do_all_genl_preds_and_inverses_breadth", "DO-ALL-GENL-PREDS-AND-INVERSES-BREADTH");
    //declareMacro("do_all_genl_preds_and_inverses_depth", "DO-ALL-GENL-PREDS-AND-INVERSES-DEPTH");
    //declareMacro("do_all_preds_and_inverses", "DO-ALL-PREDS-AND-INVERSES");
    //declareMacro("do_true_genl_mt_links", "DO-TRUE-GENL-MT-LINKS");
    //declareMacro("do_relevant_genl_mt_links", "DO-RELEVANT-GENL-MT-LINKS");
    //declareMacro("do_true_spec_mt_links", "DO-TRUE-SPEC-MT-LINKS");
    //declareMacro("do_relevant_spec_mt_links", "DO-RELEVANT-SPEC-MT-LINKS");
    //declareMacro("do_all_genl_mts", "DO-ALL-GENL-MTS");
    //declareMacro("do_all_genl_mts_depth", "DO-ALL-GENL-MTS-DEPTH");
    //declareMacro("do_all_genl_mts_breadth", "DO-ALL-GENL-MTS-BREADTH");
    //declareMacro("do_all_spec_mts", "DO-ALL-SPEC-MTS");
    //declareMacro("do_all_spec_mts_depth", "DO-ALL-SPEC-MTS-DEPTH");
    //declareMacro("do_all_spec_mts_breadth", "DO-ALL-SPEC-MTS-BREADTH");
    return NIL;
  }

  public static final SubLObject init_sbhl_macros_file() {
    return NIL;
  }

  public static final SubLObject setup_sbhl_macros_file() {
        access_macros.register_macro_helper($sym88$DO_SBHL_NON_FORT_LINKS_, $sym91$DO_SBHL_NON_FORT_LINKS);
    access_macros.register_macro_helper($sym93$ADMISSIBLE_NON_FORT_LINK_NODE_, $sym91$DO_SBHL_NON_FORT_LINKS);
    access_macros.register_macro_helper($sym152$GET_SBHL_ACCESSIBLE_MODULES, $sym104$DO_WITH_RELEVANT_SBHL_MODULES);
    utilities_macros.register_cyc_api_macro($sym289$DO_ALL_INSTANCES, $list287, $str290$Iterator___see_do_all_simple_back);
    utilities_macros.register_cyc_api_macro($sym292$DO_ALL_FORT_INSTANCES, $list287, $str295$Like__xref_do_all_instances_excep);
    utilities_macros.register_cyc_api_macro($sym300$DO_ALL_QUOTED_INSTANCES, $list287, $str290$Iterator___see_do_all_simple_back);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("TV"), makeSymbol("TV-LINKS"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$LINK_NODES = makeUninternedSymbol("LINK-NODES");
  public static final SubLSymbol $sym2$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym3$GET_SBHL_LINK_NODES = makeSymbol("GET-SBHL-LINK-NODES");
  public static final SubLSymbol $sym4$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym5$SBHL_CSOME = makeSymbol("SBHL-CSOME");
  public static final SubLList $list6 = list(list(makeSymbol("TV-VAR"), makeSymbol("LINK-NODES-VAR"), makeSymbol("TV-LINKS"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym7$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLList $list8 = list(list(makeSymbol("TV-VAR"), makeSymbol("LINK-NODES-VAR"), makeSymbol("MT"), makeSymbol("MT-LINKS"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym9$TV_LINKS = makeUninternedSymbol("TV-LINKS");
  public static final SubLSymbol $sym10$GET_SBHL_TV_LINKS = makeSymbol("GET-SBHL-TV-LINKS");
  public static final SubLSymbol $sym11$DO_SBHL_TV_LINKS = makeSymbol("DO-SBHL-TV-LINKS");
  public static final SubLList $list12 = list(list(makeSymbol("MT-VAR"), makeSymbol("TV-LINKS-VAR"), makeSymbol("MT-LINKS"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list13 = list(list(makeSymbol("MT-VAR"), makeSymbol("TV-LINKS-VAR"), makeSymbol("DIRECTION"), makeSymbol("D-LINK"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym14$MT_LINKS = makeUninternedSymbol("MT-LINKS");
  public static final SubLSymbol $sym15$GET_SBHL_MT_LINKS = makeSymbol("GET-SBHL-MT-LINKS");
  public static final SubLList $list16 = list(list(makeSymbol("DIRECTION-VAR"), makeSymbol("MT-LINKS-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym17$D_LINK = makeUninternedSymbol("D-LINK");
  public static final SubLSymbol $sym18$GET_SBHL_GRAPH_LINK = makeSymbol("GET-SBHL-GRAPH-LINK");
  public static final SubLSymbol $sym19$DO_RELEVANT_SBHL_DIRECTIONS = makeSymbol("DO-RELEVANT-SBHL-DIRECTIONS");
  public static final SubLList $list20 = list(list(makeSymbol("MT-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym21$DIRECTION = makeUninternedSymbol("DIRECTION");
  public static final SubLSymbol $sym22$MT_LINKS = makeUninternedSymbol("MT-LINKS");
  public static final SubLSymbol $sym23$TV_LINKS = makeUninternedSymbol("TV-LINKS");
  public static final SubLSymbol $sym24$POSSIBLY_WITH_SBHL_MODULE = makeSymbol("POSSIBLY-WITH-SBHL-MODULE");
  public static final SubLSymbol $sym25$WITH_SBHL_FORWARD_LINK_DIRECTION_FOR_MODULE = makeSymbol("WITH-SBHL-FORWARD-LINK-DIRECTION-FOR-MODULE");
  public static final SubLSymbol $sym26$DO_SBHL_GRAPH_LINK = makeSymbol("DO-SBHL-GRAPH-LINK");
  public static final SubLSymbol $sym27$SBHL_FORWARD_DIRECTION_FOR_MODULE_P = makeSymbol("SBHL-FORWARD-DIRECTION-FOR-MODULE-P");
  public static final SubLSymbol $sym28$DO_SBHL_MT_LINKS = makeSymbol("DO-SBHL-MT-LINKS");
  public static final SubLSymbol $sym29$ANY_SBHL_TRUE_LINK_NODES_P = makeSymbol("ANY-SBHL-TRUE-LINK-NODES-P");
  public static final SubLList $list30 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("MT-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym31$DIRECTION = makeUninternedSymbol("DIRECTION");
  public static final SubLSymbol $sym32$MT_LINKS = makeUninternedSymbol("MT-LINKS");
  public static final SubLSymbol $sym33$TV_LINKS = makeUninternedSymbol("TV-LINKS");
  public static final SubLSymbol $sym34$TV = makeUninternedSymbol("TV");
  public static final SubLSymbol $sym35$LINK_NODES = makeUninternedSymbol("LINK-NODES");
  public static final SubLSymbol $sym36$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $sym37$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLList $list38 = list(list(makeSymbol("DIRECTION-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("LINK-NODES-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym39$MT_LINKS = makeUninternedSymbol("MT-LINKS");
  public static final SubLSymbol $sym40$TV_LINKS = makeUninternedSymbol("TV-LINKS");
  public static final SubLList $list41 = list(list(makeSymbol("DIRECTION-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("LINK-NODE-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym42$LINK_NODES_VAR = makeUninternedSymbol("LINK-NODES-VAR");
  public static final SubLSymbol $sym43$DO_ALL_SBHL_TV_LINKS = makeSymbol("DO-ALL-SBHL-TV-LINKS");
  public static final SubLList $list44 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("TV-VAR"), makeSymbol("MT-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym45$LINK_NODES_VAR = makeUninternedSymbol("LINK-NODES-VAR");
  public static final SubLSymbol $sym46$DIRECTION = makeUninternedSymbol("DIRECTION");
  public static final SubLSymbol $sym47$MT_LINKS = makeUninternedSymbol("MT-LINKS");
  public static final SubLSymbol $sym48$TV_LINKS = makeUninternedSymbol("TV-LINKS");
  public static final SubLSymbol $sym49$GET_SBHL_MODULE_FORWARD_DIRECTION = makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION");
  public static final SubLSymbol $sym50$LINK_NODES_VAR = makeUninternedSymbol("LINK-NODES-VAR");
  public static final SubLSymbol $sym51$DIRECTION = makeUninternedSymbol("DIRECTION");
  public static final SubLSymbol $sym52$MT_LINKS = makeUninternedSymbol("MT-LINKS");
  public static final SubLSymbol $sym53$TV_LINKS = makeUninternedSymbol("TV-LINKS");
  public static final SubLSymbol $sym54$GET_SBHL_MODULE_BACKWARD_DIRECTION = makeSymbol("GET-SBHL-MODULE-BACKWARD-DIRECTION");
  public static final SubLList $list55 = list(list(makeSymbol("D-LINK-VAR"), makeSymbol("NODE"), makeSymbol("MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym56$PIF = makeSymbol("PIF");
  public static final SubLList $list57 = list(list(makeSymbol("SBHL-ERROR"), FIVE_INTEGER, makeString("attempting to bind direction link variable, to NIL. macro body not executed.")));
  public static final SubLList $list58 = list(list(makeSymbol("LINK-NODES-VAR"), makeSymbol("START-NODE"), makeSymbol("DIRECTION"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym59$NODE = makeUninternedSymbol("NODE");
  public static final SubLSymbol $sym60$NAUT_TO_NART = makeSymbol("NAUT-TO-NART");
  public static final SubLSymbol $sym61$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym62$SBHL_NODE_OBJECT_P = makeSymbol("SBHL-NODE-OBJECT-P");
  public static final SubLSymbol $sym63$WITH_RELEVANT_SBHL_FORT_LINK_NODES = makeSymbol("WITH-RELEVANT-SBHL-FORT-LINK-NODES");
  public static final SubLSymbol $sym64$CNAT_P = makeSymbol("CNAT-P");
  public static final SubLSymbol $sym65$DO_RELEVANT_SBHL_NAUT_GENERATED_LINKS = makeSymbol("DO-RELEVANT-SBHL-NAUT-GENERATED-LINKS");
  public static final SubLSymbol $sym66$NODE = makeUninternedSymbol("NODE");
  public static final SubLSymbol $sym67$WITH_SBHL_NON_FORT_LINKS = makeSymbol("WITH-SBHL-NON-FORT-LINKS");
  public static final SubLList $list68 = list(list(makeSymbol("LINK-NODES-VAR"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("MODULE"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym69$D_LINK = makeUninternedSymbol("D-LINK");
  public static final SubLSymbol $sym70$MT = makeUninternedSymbol("MT");
  public static final SubLSymbol $sym71$TV_LINKS = makeUninternedSymbol("TV-LINKS");
  public static final SubLSymbol $sym72$TV = makeUninternedSymbol("TV");
  public static final SubLSymbol $sym73$WITH_SBHL_GRAPH_LINK = makeSymbol("WITH-SBHL-GRAPH-LINK");
  public static final SubLSymbol $sym74$DO_SBHL_DIRECTION_LINK = makeSymbol("DO-SBHL-DIRECTION-LINK");
  public static final SubLSymbol $sym75$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");
  public static final SubLSymbol $sym76$_SBHL_LINK_MT_ = makeSymbol("*SBHL-LINK-MT*");
  public static final SubLSymbol $sym77$RELEVANT_SBHL_TV_ = makeSymbol("RELEVANT-SBHL-TV?");
  public static final SubLSymbol $sym78$_SBHL_LINK_TV_ = makeSymbol("*SBHL-LINK-TV*");
  public static final SubLList $list79 = list(list(makeSymbol("INS-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("COL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym80$INSTANCE_TUPLE = makeUninternedSymbol("INSTANCE-TUPLE");
  public static final SubLSymbol $sym81$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym82$NON_FORT_INSTANCE_TABLE_LOOKUP = makeSymbol("NON-FORT-INSTANCE-TABLE-LOOKUP");
  public static final SubLSymbol $sym83$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLList $list84 = list(list(makeSymbol("LINK-NODES-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym85$LINK_NODE = makeUninternedSymbol("LINK-NODE");
  public static final SubLSymbol $sym86$MT = makeUninternedSymbol("MT");
  public static final SubLSymbol $sym87$TV = makeUninternedSymbol("TV");
  public static final SubLSymbol $sym88$DO_SBHL_NON_FORT_LINKS_ = makeSymbol("DO-SBHL-NON-FORT-LINKS?");
  public static final SubLSymbol $sym89$DO_NON_FORT_DIRECT_INSTANCE_LINKS = makeSymbol("DO-NON-FORT-DIRECT-INSTANCE-LINKS");
  public static final SubLSymbol $sym90$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym91$DO_SBHL_NON_FORT_LINKS = makeSymbol("DO-SBHL-NON-FORT-LINKS");
  public static final SubLObject $const92$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym93$ADMISSIBLE_NON_FORT_LINK_NODE_ = makeSymbol("ADMISSIBLE-NON-FORT-LINK-NODE?");
  public static final SubLList $list94 = list(list(makeSymbol("LINK-NODES-VAR"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym95$GENERATING_FN = makeUninternedSymbol("GENERATING-FN");
  public static final SubLSymbol $sym96$GET_SBHL_MODULE_RELEVANT_NAUT_LINK_GENERATORS = makeSymbol("GET-SBHL-MODULE-RELEVANT-NAUT-LINK-GENERATORS");
  public static final SubLSymbol $sym97$_SBHL_TV_ = makeSymbol("*SBHL-TV*");
  public static final SubLSymbol $sym98$_SBHL_LINK_GENERATOR_ = makeSymbol("*SBHL-LINK-GENERATOR*");
  public static final SubLSymbol $sym99$FUNCALL = makeSymbol("FUNCALL");
  public static final SubLList $list100 = list(list(makeSymbol("LINK-NODES-VAR"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("MODULE"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym101$POSSIBLY_WITH_SBHL_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-SBHL-MT-RELEVANCE");
  public static final SubLSymbol $sym102$POSSIBLY_WITH_SBHL_TV = makeSymbol("POSSIBLY-WITH-SBHL-TV");
  public static final SubLSymbol $sym103$WITH_RELEVANT_SBHL_LINK_NODES = makeSymbol("WITH-RELEVANT-SBHL-LINK-NODES");
  public static final SubLSymbol $sym104$DO_WITH_RELEVANT_SBHL_MODULES = makeSymbol("DO-WITH-RELEVANT-SBHL-MODULES");
  public static final SubLSymbol $sym105$POSSIBLY_FLIP_GENL_INVERSE_MODE = makeSymbol("POSSIBLY-FLIP-GENL-INVERSE-MODE");
  public static final SubLList $list106 = list(makeSymbol("GET-SBHL-MODULE"));
  public static final SubLSymbol $sym107$WITH_RELEVANT_SBHL_LINK_NODES_AND_NON_FORTS = makeSymbol("WITH-RELEVANT-SBHL-LINK-NODES-AND-NON-FORTS");
  public static final SubLList $list108 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym109$LINK_NODES = makeUninternedSymbol("LINK-NODES");
  public static final SubLSymbol $sym110$WITH_ACCESSIBLE_SBHL_LINK_NODES = makeSymbol("WITH-ACCESSIBLE-SBHL-LINK-NODES");
  public static final SubLSymbol $sym111$LINK_NODES = makeUninternedSymbol("LINK-NODES");
  public static final SubLSymbol $sym112$WITH_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS = makeSymbol("WITH-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");
  public static final SubLList $list113 = list(list(makeSymbol("LINK-NODE-SEARCH-STATE-VAR"), makeSymbol("NODE-SEARCH-STATE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list114 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw115$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw116$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym117$DO_SBHL_ITERATOR = makeSymbol("DO-SBHL-ITERATOR");
  public static final SubLSymbol $sym118$NEW_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR = makeSymbol("NEW-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR");
  public static final SubLList $list119 = list(list(makeSymbol("TV-LINKS-VAR"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym120$LINK_NODES = makeUninternedSymbol("LINK-NODES");
  public static final SubLList $list121 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym122$DO_RELEVANT_SBHL_LINK_NODES = makeSymbol("DO-RELEVANT-SBHL-LINK-NODES");
  public static final SubLList $list123 = list(list(makeSymbol("PRED-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym124$SMART_CSOME = makeSymbol("SMART-CSOME");
  public static final SubLList $list125 = list(makeSymbol("GET-SBHL-PREDICATES"));
  public static final SubLSymbol $sym126$MODULE = makeUninternedSymbol("MODULE");
  public static final SubLSymbol $sym127$DO_SBHL_MODULES = makeSymbol("DO-SBHL-MODULES");
  public static final SubLSymbol $sym128$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym129$SBHL_TIME_MODULE_P = makeSymbol("SBHL-TIME-MODULE-P");
  public static final SubLSymbol $sym130$GET_SBHL_LINK_PRED = makeSymbol("GET-SBHL-LINK-PRED");
  public static final SubLList $list131 = list(list(makeSymbol("MODULE-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym132$MODULE = makeUninternedSymbol("MODULE");
  public static final SubLList $list133 = list(list(makeSymbol("MODULE-VAR"), makeSymbol("GRAPH-VAR"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym134$GET_SBHL_MODULE_GRAPH = makeSymbol("GET-SBHL-MODULE-GRAPH");
  public static final SubLList $list135 = list(list(makeSymbol("*SBHL-LINK-DIRECTION*"), list(makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE")))));
  public static final SubLList $list136 = list(list(makeSymbol("*SBHL-LINK-DIRECTION*"), list(makeSymbol("GET-SBHL-MODULE-BACKWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE")))));
  public static final SubLList $list137 = list(makeSymbol("NODE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym138$COR = makeSymbol("COR");
  public static final SubLList $list139 = list(makeSymbol("SUSPEND-SBHL-TYPE-CHECKING?"));
  public static final SubLSymbol $sym140$APPLY_SBHL_MODULE_TYPE_TEST = makeSymbol("APPLY-SBHL-MODULE-TYPE-TEST");
  public static final SubLList $list141 = list(list(makeSymbol("GET-SBHL-MODULE")));
  public static final SubLSymbol $sym142$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym143$SBHL_WARN = makeSymbol("SBHL-WARN");
  public static final SubLString $str144$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLList $list145 = list(list(makeSymbol("GET-SBHL-TYPE-TEST"), list(makeSymbol("GET-SBHL-MODULE"))));
  public static final SubLList $list146 = list(list(makeSymbol("NODE-VAR"), makeSymbol("LINK-VAR"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym147$DO_SBHL_GRAPH_LINKS = makeSymbol("DO-SBHL-GRAPH-LINKS");
  public static final SubLSymbol $kw148$MODULE = makeKeyword("MODULE");
  public static final SubLList $list149 = list(list(makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym150$MODULE_VAR = makeUninternedSymbol("MODULE-VAR");
  public static final SubLSymbol $sym151$ACCESSIBLE_MODULES = makeUninternedSymbol("ACCESSIBLE-MODULES");
  public static final SubLSymbol $sym152$GET_SBHL_ACCESSIBLE_MODULES = makeSymbol("GET-SBHL-ACCESSIBLE-MODULES");
  public static final SubLSymbol $sym153$WITH_SBHL_MODULE = makeSymbol("WITH-SBHL-MODULE");
  public static final SubLSymbol $sym154$SBHL_MODULE_P = makeSymbol("SBHL-MODULE-P");
  public static final SubLSymbol $sym155$GET_SBHL_MODULE = makeSymbol("GET-SBHL-MODULE");
  public static final SubLList $list156 = list(list(makeSymbol("DIRECTION-VAR"), makeSymbol("MODULE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym157$GET_RELEVANT_SBHL_DIRECTIONS = makeSymbol("GET-RELEVANT-SBHL-DIRECTIONS");
  public static final SubLList $list158 = list(list(makeSymbol("*SBHL-SEARCH-BEHAVIOR*"), list(makeSymbol("DETERMINE-SBHL-SEARCH-BEHAVIOR"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")), list(makeSymbol("GET-SBHL-SEARCH-DIRECTION")), list(makeSymbol("GET-SBHL-TV")))), list(makeSymbol("*SBHL-TERMINATING-MARKING-SPACE*"), list(makeSymbol("DETERMINE-SBHL-TERMINATING-MARKING-SPACE"), makeSymbol("*SBHL-SEARCH-BEHAVIOR*"))));
  public static final SubLSymbol $sym159$PREMARKING_ = makeUninternedSymbol("PREMARKING?");
  public static final SubLSymbol $sym160$GOAL_FN = makeUninternedSymbol("GOAL-FN");
  public static final SubLSymbol $sym161$GOAL_NODE = makeUninternedSymbol("GOAL-NODE");
  public static final SubLSymbol $sym162$GOAL_SPACE = makeUninternedSymbol("GOAL-SPACE");
  public static final SubLList $list163 = list(list(makeSymbol("SBHL-MODULE-PREMARKS-GATHER-NODES-P")));
  public static final SubLList $list164 = list(list(makeSymbol("QUOTE"), makeSymbol("SBHL-NODE-IS-GOAL-NODE")));
  public static final SubLList $list165 = list(makeSymbol("*SBHL-SPACE*"));
  public static final SubLList $list166 = list(makeSymbol("GET-SBHL-TRANSFERS-THROUGH-MODULE"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")));
  public static final SubLSymbol $sym167$POSSIBLY_PREMARK_WITH_GENL_INVERSE_MODE = makeSymbol("POSSIBLY-PREMARK-WITH-GENL-INVERSE-MODE");
  public static final SubLSymbol $sym168$SBHL_PREMARK_GATHER_NODES = makeSymbol("SBHL-PREMARK-GATHER-NODES");
  public static final SubLSymbol $sym169$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list170 = list(list(makeSymbol("QUOTE"), makeSymbol("SBHL-NODE-MARKED-AS-GOAL-NODE")));
  public static final SubLList $list171 = list(makeSymbol("*SBHL-GATHER-SPACE*"));
  public static final SubLSymbol $sym172$RESET_SBHL_SEARCH_PARENT_MARKING = makeSymbol("RESET-SBHL-SEARCH-PARENT-MARKING");
  public static final SubLSymbol $sym173$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE = makeSymbol("WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");
  public static final SubLSymbol $sym174$WITH_SBHL_CONSIDER_NODE_FN = makeSymbol("WITH-SBHL-CONSIDER-NODE-FN");
  public static final SubLSymbol $sym175$WITH_SBHL_GOAL_NODE = makeSymbol("WITH-SBHL-GOAL-NODE");
  public static final SubLSymbol $sym176$WITH_SBHL_GOAL_SPACE = makeSymbol("WITH-SBHL-GOAL-SPACE");
  public static final SubLList $list177 = list(list(makeSymbol("*SBHL-SEARCH-BEHAVIOR*"), list(makeSymbol("FIF"), list(makeSymbol("SBHL-TRANSFERS-THROUGH-MODULE-P"), list(makeSymbol("GET-SBHL-MODULE"))), list(makeSymbol("QUOTE"), makeSymbol("SBHL-LEAF-INSTANCES-SWEEP")), list(makeSymbol("QUOTE"), makeSymbol("SBHL-SIMPLE-TRUE-SEARCH-AND-UNWIND")))));
  public static final SubLList $list178 = list(list(new SubLObject[] {makeSymbol("LINK-NODE-VAR"), makeSymbol("MODULE"), makeSymbol("DIRECTION"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("BREADTH"))}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $kw179$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $sym180$NODE_VAR = makeUninternedSymbol("NODE-VAR");
  public static final SubLSymbol $sym181$DECK_TYPE = makeUninternedSymbol("DECK-TYPE");
  public static final SubLSymbol $sym182$RECUR_DECK = makeUninternedSymbol("RECUR-DECK");
  public static final SubLSymbol $sym183$NODE_VARS_LINK_NODE = makeUninternedSymbol("NODE-VARS-LINK-NODE");
  public static final SubLSymbol $sym184$FIF = makeSymbol("FIF");
  public static final SubLList $list185 = list(makeKeyword("BREADTH"));
  public static final SubLList $list186 = list(makeKeyword("QUEUE"), makeKeyword("STACK"));
  public static final SubLSymbol $sym187$CREATE_DECK = makeSymbol("CREATE-DECK");
  public static final SubLSymbol $sym188$WITH_NEW_SBHL_SPACE = makeSymbol("WITH-NEW-SBHL-SPACE");
  public static final SubLSymbol $sym189$POSSIBLY_WITH_SBHL_TRUE_TV = makeSymbol("POSSIBLY-WITH-SBHL-TRUE-TV");
  public static final SubLSymbol $sym190$WITH_SBHL_SEARCH_MODULE = makeSymbol("WITH-SBHL-SEARCH-MODULE");
  public static final SubLSymbol $sym191$WITH_SBHL_TYPE_TEST = makeSymbol("WITH-SBHL-TYPE-TEST");
  public static final SubLSymbol $sym192$WITH_SBHL_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-SEARCH-DIRECTION");
  public static final SubLSymbol $sym193$WITH_SBHL_LINK_DIRECTION = makeSymbol("WITH-SBHL-LINK-DIRECTION");
  public static final SubLSymbol $sym194$SBHL_SEARCH_DIRECTION_TO_LINK_DIRECTION = makeSymbol("SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION");
  public static final SubLSymbol $sym195$SBHL_MARK_NODE_MARKED = makeSymbol("SBHL-MARK-NODE-MARKED");
  public static final SubLSymbol $sym196$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym197$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym198$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym199$DO_ACCESSIBLE_SBHL_LINK_NODES = makeSymbol("DO-ACCESSIBLE-SBHL-LINK-NODES");
  public static final SubLList $list200 = list(makeSymbol("GET-SBHL-LINK-DIRECTION"));
  public static final SubLSymbol $sym201$SBHL_SEARCH_PATH_TERMINATION_P = makeSymbol("SBHL-SEARCH-PATH-TERMINATION-P");
  public static final SubLSymbol $sym202$DECK_PUSH = makeSymbol("DECK-PUSH");
  public static final SubLSymbol $sym203$DECK_POP = makeSymbol("DECK-POP");
  public static final SubLList $list204 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("MODULE"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym205$DO_ALL_SIMPLE_TRUE_LINKS = makeSymbol("DO-ALL-SIMPLE-TRUE-LINKS");
  public static final SubLList $list206 = list(makeSymbol("GET-SBHL-FORWARD-SEARCH-DIRECTION"));
  public static final SubLList $list207 = list(makeSymbol("GET-SBHL-BACKWARD-SEARCH-DIRECTION"));
  public static final SubLList $list208 = list(list(new SubLObject[] {makeSymbol("LINK-NODE-VAR"), makeSymbol("MODULE"), makeSymbol("DIRECTION"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH"))}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $kw209$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $sym210$NODE_VAR = makeUninternedSymbol("NODE-VAR");
  public static final SubLSymbol $sym211$NODE_AND_PREDICATE_MODE = makeUninternedSymbol("NODE-AND-PREDICATE-MODE");
  public static final SubLSymbol $sym212$PREDICATE_MODE = makeUninternedSymbol("PREDICATE-MODE");
  public static final SubLSymbol $sym213$DECK_TYPE = makeUninternedSymbol("DECK-TYPE");
  public static final SubLSymbol $sym214$RECUR_DECK = makeUninternedSymbol("RECUR-DECK");
  public static final SubLSymbol $sym215$NODE_VARS_LINK_NODE = makeUninternedSymbol("NODE-VARS-LINK-NODE");
  public static final SubLList $list216 = list(makeKeyword("DEPTH"));
  public static final SubLList $list217 = list(makeKeyword("STACK"), makeKeyword("QUEUE"));
  public static final SubLList $list218 = list(list(makeSymbol("GENL-INVERSE-MODE-P")));
  public static final SubLSymbol $sym219$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym220$SECOND = makeSymbol("SECOND");
  public static final SubLSymbol $sym221$WITH_SBHL_PREDICATE_MODE = makeSymbol("WITH-SBHL-PREDICATE-MODE");
  public static final SubLSymbol $sym222$APPLY_SBHL_ADD_NODE_TEST = makeSymbol("APPLY-SBHL-ADD-NODE-TEST");
  public static final SubLList $list223 = list(makeSymbol("GET-SBHL-SEARCH-ADD-NODE-TEST"));
  public static final SubLSymbol $sym224$DO_ALL_SIMPLE_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-SIMPLE-TRUE-LINKS-FOR-INVERSES");
  public static final SubLList $list225 = list(list(new SubLObject[] {makeSymbol("LINK-NODE-VAR"), makeSymbol("MODE-VAR"), makeSymbol("MODULE"), makeSymbol("DIRECTION"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH"))}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym226$NODE_VAR = makeUninternedSymbol("NODE-VAR");
  public static final SubLSymbol $sym227$NODE_AND_PREDICATE_MODE = makeUninternedSymbol("NODE-AND-PREDICATE-MODE");
  public static final SubLSymbol $sym228$PREDICATE_MODE = makeUninternedSymbol("PREDICATE-MODE");
  public static final SubLSymbol $sym229$DECK_TYPE = makeUninternedSymbol("DECK-TYPE");
  public static final SubLSymbol $sym230$RECUR_DECK = makeUninternedSymbol("RECUR-DECK");
  public static final SubLSymbol $sym231$NODE_VARS_LINK_NODE = makeUninternedSymbol("NODE-VARS-LINK-NODE");
  public static final SubLList $list232 = list(list(new SubLObject[] {makeSymbol("LINK-NODE-VAR"), makeSymbol("MODE-VAR"), makeSymbol("MODULE"), makeSymbol("NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym233$DO_ALL_MODE_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-MODE-TRUE-LINKS-FOR-INVERSES");
  public static final SubLSymbol $sym234$NODE_VAR = makeUninternedSymbol("NODE-VAR");
  public static final SubLSymbol $sym235$DECK_TYPE = makeUninternedSymbol("DECK-TYPE");
  public static final SubLSymbol $sym236$RECUR_DECK = makeUninternedSymbol("RECUR-DECK");
  public static final SubLSymbol $sym237$NODE_VARS_LINK_NODE = makeUninternedSymbol("NODE-VARS-LINK-NODE");
  public static final SubLSymbol $sym238$WITH_SBHL_FORWARD_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-FORWARD-SEARCH-DIRECTION");
  public static final SubLSymbol $sym239$WITH_SBHL_FORWARD_LINK_DIRECTION = makeSymbol("WITH-SBHL-FORWARD-LINK-DIRECTION");
  public static final SubLSymbol $sym240$NODE_VAR = makeUninternedSymbol("NODE-VAR");
  public static final SubLSymbol $sym241$TT_NODE_VAR = makeUninternedSymbol("TT-NODE-VAR");
  public static final SubLSymbol $sym242$WITH_NEW_SBHL_GATHER_SPACE = makeSymbol("WITH-NEW-SBHL-GATHER-SPACE");
  public static final SubLSymbol $sym243$GET_SBHL_TRANSFERS_THROUGH_MODULE = makeSymbol("GET-SBHL-TRANSFERS-THROUGH-MODULE");
  public static final SubLSymbol $sym244$DO_ACCESSIBLE_SBHL_LINK_NODES_AND_NON_FORTS = makeSymbol("DO-ACCESSIBLE-SBHL-LINK-NODES-AND-NON-FORTS");
  public static final SubLList $list245 = list(list(makeSymbol("ISA-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym246$DO_ALL_SBHL_FORWARD_TRUE_LINK_NODES = makeSymbol("DO-ALL-SBHL-FORWARD-TRUE-LINK-NODES");
  public static final SubLList $list247 = list(makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell(makeString("isa")));
  public static final SubLList $list248 = list(list(makeSymbol("ISA-LINKS-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym249$DO_RELEVANT_FORWARD_SBHL_LINK_NODES = makeSymbol("DO-RELEVANT-FORWARD-SBHL-LINK-NODES");
  public static final SubLList $list250 = list(list(makeSymbol("ISA-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list251 = list(makeKeyword("MT"), makeKeyword("DONE"));
  public static final SubLSymbol $kw252$MT = makeKeyword("MT");
  public static final SubLSymbol $sym253$MT_VAR = makeUninternedSymbol("MT-VAR");
  public static final SubLSymbol $sym254$TV_VAR = makeUninternedSymbol("TV-VAR");
  public static final SubLSymbol $sym255$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");
  public static final SubLSymbol $sym256$DO_TRUE_ISA_LINKS = makeSymbol("DO-TRUE-ISA-LINKS");
  public static final SubLSymbol $sym257$IGNORE = makeSymbol("IGNORE");
  public static final SubLList $list258 = list(list(makeSymbol("ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym259$LINK_NODES = makeUninternedSymbol("LINK-NODES");
  public static final SubLList $list260 = list(makeSymbol("GET-SBHL-MODULE-FORWARD-DIRECTION"), list(makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell(makeString("isa"))));
  public static final SubLList $list261 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym262$DO_ALL_SBHL_BACKWARD_TRUE_LINK_NODES = makeSymbol("DO-ALL-SBHL-BACKWARD-TRUE-LINK-NODES");
  public static final SubLList $list263 = list(list(makeSymbol("INSTANCE-LINKS-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym264$DO_RELEVANT_BACKWARD_SBHL_LINK_NODES = makeSymbol("DO-RELEVANT-BACKWARD-SBHL-LINK-NODES");
  public static final SubLList $list265 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym266$MT_VAR = makeUninternedSymbol("MT-VAR");
  public static final SubLSymbol $sym267$TV_VAR = makeUninternedSymbol("TV-VAR");
  public static final SubLSymbol $sym268$DO_TRUE_INSTANCE_LINKS = makeSymbol("DO-TRUE-INSTANCE-LINKS");
  public static final SubLList $list269 = list(list(makeSymbol("QUOTED-ISA-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list270 = list(makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")));
  public static final SubLList $list271 = list(list(makeSymbol("QUOTED-ISA-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym272$MT_VAR = makeUninternedSymbol("MT-VAR");
  public static final SubLSymbol $sym273$TV_VAR = makeUninternedSymbol("TV-VAR");
  public static final SubLSymbol $sym274$DO_TRUE_QUOTED_ISA_LINKS = makeSymbol("DO-TRUE-QUOTED-ISA-LINKS");
  public static final SubLList $list275 = list(list(makeSymbol("QUOTED-INSTANCE-VAR"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym276$MT_VAR = makeUninternedSymbol("MT-VAR");
  public static final SubLSymbol $sym277$TV_VAR = makeUninternedSymbol("TV-VAR");
  public static final SubLSymbol $sym278$DO_TRUE_QUOTED_INSTANCE_LINKS = makeSymbol("DO-TRUE-QUOTED-INSTANCE-LINKS");
  public static final SubLList $list279 = list(list(makeSymbol("ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym280$DO_ALL_FORWARD_TRUE_LINKS_FOR_TT = makeSymbol("DO-ALL-FORWARD-TRUE-LINKS-FOR-TT");
  public static final SubLList $list281 = list(list(makeSymbol("ISA-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list282 = list(list(makeSymbol("ISA"), makeSymbol("TERM"), makeSymbol("DOMAIN-MT"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym283$ISAS = makeUninternedSymbol("ISAS");
  public static final SubLSymbol $sym284$WITH_MT = makeSymbol("WITH-MT");
  public static final SubLSymbol $sym285$SORT_BY_GENERALITY_ESTIMATE = makeSymbol("SORT-BY-GENERALITY-ESTIMATE");
  public static final SubLSymbol $sym286$ALL_ISA = makeSymbol("ALL-ISA");
  public static final SubLList $list287 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym288$DO_ALL_BACKWARD_TRUE_LINKS_FOR_TT = makeSymbol("DO-ALL-BACKWARD-TRUE-LINKS-FOR-TT");
  public static final SubLSymbol $sym289$DO_ALL_INSTANCES = makeSymbol("DO-ALL-INSTANCES");
  public static final SubLString $str290$Iterator___see_do_all_simple_back = makeString("Iterator. @see do-all-simple-backward-true-links.");
  public static final SubLList $list291 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym292$DO_ALL_FORT_INSTANCES = makeSymbol("DO-ALL-FORT-INSTANCES");
  public static final SubLList $list293 = list(makeSymbol("DO-ALL-INSTANCES"));
  public static final SubLSymbol $sym294$FORT_P = makeSymbol("FORT-P");
  public static final SubLString $str295$Like__xref_do_all_instances_excep = makeString("Like @xref do-all-instances except only iterates over forts.  Deprecated.");
  public static final SubLList $list296 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("TERMS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym297$TERMS_VAR = makeUninternedSymbol("TERMS-VAR");
  public static final SubLSymbol $sym298$ALL_ISA_ = makeSymbol("ALL-ISA?");
  public static final SubLSymbol $sym299$REST = makeSymbol("REST");
  public static final SubLSymbol $sym300$DO_ALL_QUOTED_INSTANCES = makeSymbol("DO-ALL-QUOTED-INSTANCES");
  public static final SubLSymbol $sym301$TERMS_VAR = makeUninternedSymbol("TERMS-VAR");
  public static final SubLSymbol $sym302$ALL_QUOTED_ISA_ = makeSymbol("ALL-QUOTED-ISA?");
  public static final SubLList $list303 = list(list(makeSymbol("GENL-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list304 = list(makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell(makeString("genls")));
  public static final SubLList $list305 = list(list(makeSymbol("GENL-LINKS-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list306 = list(list(makeSymbol("GENL-VAR"), makeSymbol("MT-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("TV")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym307$DUMMY = makeUninternedSymbol("DUMMY");
  public static final SubLSymbol $sym308$DO_TRUE_GENLS_LINKS = makeSymbol("DO-TRUE-GENLS-LINKS");
  public static final SubLList $list309 = list(list(makeSymbol("GENL-VAR"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym310$MT_VAR = makeUninternedSymbol("MT-VAR");
  public static final SubLSymbol $sym311$TV_VAR = makeUninternedSymbol("TV-VAR");
  public static final SubLList $list312 = list(list(makeSymbol("SPEC-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list313 = list(list(makeSymbol("SPEC-LINKS-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list314 = list(list(makeSymbol("SPEC-VAR"), makeSymbol("COL"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym315$MT_VAR = makeUninternedSymbol("MT-VAR");
  public static final SubLSymbol $sym316$TV_VAR = makeUninternedSymbol("TV-VAR");
  public static final SubLSymbol $sym317$DO_TRUE_SPEC_LINKS = makeSymbol("DO-TRUE-SPEC-LINKS");
  public static final SubLList $list318 = list(list(makeSymbol("GENL-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym319$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS = makeSymbol("DO-ALL-SIMPLE-FORWARD-TRUE-LINKS");
  public static final SubLList $list320 = list(list(makeSymbol("GENL-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list321 = list(list(makeSymbol("GENL"), makeSymbol("SPEC"), makeSymbol("DOMAIN-MT"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym322$GENLS = makeUninternedSymbol("GENLS");
  public static final SubLSymbol $sym323$ALL_GENLS = makeSymbol("ALL-GENLS");
  public static final SubLList $list324 = list(list(makeSymbol("SPEC-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym325$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS = makeSymbol("DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS");
  public static final SubLList $list326 = list(list(makeSymbol("SPEC-VAR"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list327 = list(list(makeSymbol("SPEC"), makeSymbol("TERM"), makeSymbol("DOMAIN-MT"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym328$SPECS = makeUninternedSymbol("SPECS");
  public static final SubLSymbol $sym329$NREVERSE = makeSymbol("NREVERSE");
  public static final SubLSymbol $sym330$ALL_SPECS = makeSymbol("ALL-SPECS");
  public static final SubLList $list331 = list(list(makeSymbol("GENL-PREDICATE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list332 = list(makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell(makeString("genlPreds")));
  public static final SubLList $list333 = list(list(makeSymbol("GENL-PREDICATE-LINKS-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list334 = list(list(makeSymbol("SPEC-PREDICATE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list335 = list(list(makeSymbol("SPEC-PREDICATE-LINKS-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list336 = list(list(makeSymbol("GENL-PREDICATE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym337$DO_ALL_SIMPLE_FORWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-SIMPLE-FORWARD-TRUE-LINKS-FOR-INVERSES");
  public static final SubLList $list338 = list(list(makeSymbol("GENL-PREDICATE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list339 = list(list(makeSymbol("GENL-PREDICATE-VAR"), makeSymbol("INVERSE-MODE-P"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym340$DO_ALL_MODE_FORWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-MODE-FORWARD-TRUE-LINKS-FOR-INVERSES");
  public static final SubLList $list341 = list(list(makeSymbol("SPEC-PREDICATE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym342$DO_ALL_SIMPLE_BACKWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-SIMPLE-BACKWARD-TRUE-LINKS-FOR-INVERSES");
  public static final SubLList $list343 = list(list(makeSymbol("SPEC-PREDICATE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list344 = list(list(makeSymbol("SPEC-VAR"), makeSymbol("INVERSE-MODE-P"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym345$DO_ALL_MODE_BACKWARD_TRUE_LINKS_FOR_INVERSES = makeSymbol("DO-ALL-MODE-BACKWARD-TRUE-LINKS-FOR-INVERSES");
  public static final SubLSymbol $sym346$ALL_PROPER_GENL_PREDICATES = makeSymbol("ALL-PROPER-GENL-PREDICATES");
  public static final SubLList $list347 = list(list(makeSymbol("GENL-INVERSE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym348$ALL_PROPER_GENL_INVERSES = makeSymbol("ALL-PROPER-GENL-INVERSES");
  public static final SubLList $list349 = list(list(makeSymbol("GENL-INVERSE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list350 = list(makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell(makeString("genlInverse")));
  public static final SubLList $list351 = list(list(makeSymbol("GENL-INVERSE-LINKS-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list352 = list(list(makeSymbol("SPEC-INVERSE-VAR"), makeSymbol("MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list353 = list(list(makeSymbol("SPEC-INVERSE-LINKS-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list354 = list(list(makeSymbol("GENL-INVERSE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list355 = list(list(makeSymbol("SPEC-INVERSE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list356 = list(list(makeSymbol("SPEC-INVERSE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list357 = list(list(makeSymbol("PRED-VAR"), makeSymbol("INVERSE-MODE-VAR"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym358$DO_ALL_PREDS_AND_INVERSES = makeSymbol("DO-ALL-PREDS-AND-INVERSES");
  public static final SubLList $list359 = list(list(new SubLObject[] {makeSymbol("PRED-VAR"), makeSymbol("INVERSE-MODE-VAR"), makeSymbol("PRED"), makeSymbol("DIRECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym360$MODULE = makeUninternedSymbol("MODULE");
  public static final SubLSymbol $sym361$NODE_VAR = makeUninternedSymbol("NODE-VAR");
  public static final SubLSymbol $sym362$NODE_AND_PREDICATE_MODE = makeUninternedSymbol("NODE-AND-PREDICATE-MODE");
  public static final SubLSymbol $sym363$PREDICATE_MODE = makeUninternedSymbol("PREDICATE-MODE");
  public static final SubLSymbol $sym364$DECK_TYPE = makeUninternedSymbol("DECK-TYPE");
  public static final SubLSymbol $sym365$RECUR_DECK = makeUninternedSymbol("RECUR-DECK");
  public static final SubLSymbol $sym366$NODE_VARS_LINK_NODE = makeUninternedSymbol("NODE-VARS-LINK-NODE");
  public static final SubLList $list367 = list(list(makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell(makeString("genlPreds"))));
  public static final SubLList $list368 = list(list(makeSymbol("GENL-MT-VAR"), makeSymbol("MT-MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list369 = list(makeSymbol("GET-SBHL-MODULE"), constant_handles.reader_make_constant_shell(makeString("genlMt")));
  public static final SubLList $list370 = list(list(makeSymbol("GENL-MT-LINKS-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list371 = list(list(makeSymbol("SPEC-MT-VAR"), makeSymbol("MT-MT-VAR"), makeSymbol("TV-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list372 = list(list(makeSymbol("SPEC-MT-LINKS-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list373 = list(list(makeSymbol("GENL-MT-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list374 = list(list(makeSymbol("GENL-MT-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list375 = list(list(makeSymbol("SPEC-MT-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR"), makeSymbol("SEARCH-TYPE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list376 = list(list(makeSymbol("SPEC-MT-VAR"), makeSymbol("MT-NODE"), makeSymbol("&OPTIONAL"), makeSymbol("MT-MT"), makeSymbol("TV"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_macros_file();
  }

  public void initializeVariables() {
    init_sbhl_macros_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_macros_file();
  }

}
