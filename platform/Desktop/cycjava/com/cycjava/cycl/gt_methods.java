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

package  com.cyc.cycjava.cycl;

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
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.gt_search;
import com.cyc.cycjava.cycl.gt_utilities;
import com.cyc.cycjava.cycl.gt_vars;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.transitivity;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class gt_methods extends SubLTranslatedFile {

  //// Constructor

  private gt_methods() {}
  public static final SubLFile me = new gt_methods();
  public static final String myName = "com.cyc.cycjava.cycl.gt_methods";

  //// Definitions

  /** Returns returns the least-subordinate elements of FORTS
   (<direction> should be :up unless all nodes are low in the hierarchy) */
  @SubL(source = "cycl/gt-methods.lisp", position = 28483) 
  public static final SubLObject gt_max_nodes(SubLObject predicate, SubLObject v_forts, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = gt_vars.$gt_max_nodes_direction$.getDynamicValue();
    }
    checkType(predicate, $sym0$FORT_P);
    checkType(v_forts, $sym113$LISTP);
    return transitivity.gtm(predicate, $kw120$MAX_NODES, v_forts, mt, direction, UNPROVIDED, UNPROVIDED);
  }

  /** Returns returns the least-subordinate elements of <nodes>
   (<direction> should be :up unless all nodes are low in the hierarchy) */
  @SubL(source = "cycl/gt-methods.lisp", position = 28920) 
  public static final SubLObject gtm_max_nodes(SubLObject nodes, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = gt_vars.$gt_max_nodes_direction$.getDynamicValue();
    }
    {
      SubLObject unique_nodes = list_utilities.remove_duplicate_forts(nodes);
      if ((NIL != list_utilities.singletonP(unique_nodes))) {
        return unique_nodes;
      } else {
        {
          SubLObject pcase_var = direction;
          if (pcase_var.eql($kw124$UP)) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4445");
          } else if (pcase_var.eql($kw125$DOWN)) {
            return gt_max_nodes_down(unique_nodes, mt);
          }
        }
      }
    }
    return NIL;
  }

  /** returns the least-subordinate elements of <nodes>
   (permit search downwards in the hierarchy: expensive) */
  @SubL(source = "cycl/gt-methods.lisp", position = 29387) 
  public static final SubLObject gt_max_nodes_down(SubLObject nodes, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject result = NIL;
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
              SubLObject cdolist_list_var = nodes;
              SubLObject node = NIL;
              for (node = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
                if ((NIL == gt_search.gt_searchedP(node))) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3581");
                  if ((NIL != gt_search.gt_searchedP(node))) {
                    Errors
							.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3565");
                  }
                }
              }
              result = Sequences.remove_if(Symbols.symbol_function($sym119$GT_SEARCHED_), nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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

  public static final SubLObject declare_gt_methods_file() {
    //declareFunction(myName, "gt_superiors", "GT-SUPERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_superiors", "GTM-SUPERIORS", 1, 1, false);
    //declareFunction(myName, "gt_min_superiors", "GT-MIN-SUPERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_min_superiors", "GTM-MIN-SUPERIORS", 1, 1, false);
    //declareFunction(myName, "gt_inferiors", "GT-INFERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_inferiors", "GTM-INFERIORS", 1, 1, false);
    //declareFunction(myName, "gt_max_inferiors", "GT-MAX-INFERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_max_inferiors", "GTM-MAX-INFERIORS", 1, 1, false);
    //declareFunction(myName, "gt_co_superiors", "GT-CO-SUPERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_co_superiors", "GTM-CO-SUPERIORS", 1, 2, false);
    //declareFunction(myName, "gt_co_inferiors", "GT-CO-INFERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_co_inferiors", "GTM-CO-INFERIORS", 1, 2, false);
    //declareFunction(myName, "gt_redundant_superiors", "GT-REDUNDANT-SUPERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_redundant_superiors", "GTM-REDUNDANT-SUPERIORS", 1, 1, false);
    //declareFunction(myName, "gt_redundant_inferiors", "GT-REDUNDANT-INFERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_redundant_inferiors", "GTM-REDUNDANT-INFERIORS", 1, 1, false);
    //declareFunction(myName, "gt_all_superiors", "GT-ALL-SUPERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_all_superiors", "GTM-ALL-SUPERIORS", 1, 1, false);
    //declareFunction(myName, "gt_all_inferiors", "GT-ALL-INFERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_all_inferiors", "GTM-ALL-INFERIORS", 1, 1, false);
    //declareFunction(myName, "gt_union_all_inferiors", "GT-UNION-ALL-INFERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_union_all_inferiors", "GTM-UNION-ALL-INFERIORS", 1, 1, false);
    //declareFunction(myName, "gt_all_accessible", "GT-ALL-ACCESSIBLE", 2, 1, false);
    //declareFunction(myName, "gtm_all_accessible", "GTM-ALL-ACCESSIBLE", 1, 1, false);
    //declareFunction(myName, "gt_roots", "GT-ROOTS", 2, 1, false);
    //declareFunction(myName, "gtm_roots", "GTM-ROOTS", 1, 1, false);
    //declareFunction(myName, "gt_leaves", "GT-LEAVES", 2, 1, false);
    //declareFunction(myName, "gtm_leaves", "GTM-LEAVES", 1, 1, false);
    //declareFunction(myName, "gt_compose_fn_all_superiors", "GT-COMPOSE-FN-ALL-SUPERIORS", 3, 2, false);
    //declareFunction(myName, "gtm_compose_fn_all_superiors", "GTM-COMPOSE-FN-ALL-SUPERIORS", 2, 2, false);
    //declareFunction(myName, "gt_compose_fn_all_inferiors", "GT-COMPOSE-FN-ALL-INFERIORS", 3, 2, false);
    //declareFunction(myName, "gtm_compose_fn_all_inferiors", "GTM-COMPOSE-FN-ALL-INFERIORS", 2, 2, false);
    //declareFunction(myName, "gt_compose_pred_all_superiors", "GT-COMPOSE-PRED-ALL-SUPERIORS", 3, 3, false);
    //declareFunction(myName, "gtm_compose_pred_all_superiors", "GTM-COMPOSE-PRED-ALL-SUPERIORS", 2, 3, false);
    //declareFunction(myName, "gt_compose_pred_all_inferiors", "GT-COMPOSE-PRED-ALL-INFERIORS", 3, 3, false);
    //declareFunction(myName, "gtm_compose_pred_all_inferiors", "GTM-COMPOSE-PRED-ALL-INFERIORS", 2, 3, false);
    //declareFunction(myName, "gt_all_dependent_inferiors", "GT-ALL-DEPENDENT-INFERIORS", 2, 1, false);
    //declareFunction(myName, "gtm_all_dependent_inferiors", "GTM-ALL-DEPENDENT-INFERIORS", 1, 1, false);
    //declareFunction(myName, "gt_booleanP", "GT-BOOLEAN?", 3, 1, false);
    //declareFunction(myName, "gtm_booleanP", "GTM-BOOLEAN?", 2, 1, false);
    //declareFunction(myName, "gt_superiorP", "GT-SUPERIOR?", 3, 1, false);
    //declareFunction(myName, "gtm_superiorP", "GTM-SUPERIOR?", 2, 1, false);
    //declareFunction(myName, "gt_why_superiorP", "GT-WHY-SUPERIOR?", 3, 1, false);
    //declareFunction(myName, "gt_support_predicate", "GT-SUPPORT-PREDICATE", 1, 0, false);
    //declareFunction(myName, "gt_support_sentence", "GT-SUPPORT-SENTENCE", 1, 0, false);
    //declareFunction(myName, "gtm_why_superiorP", "GTM-WHY-SUPERIOR?", 2, 1, false);
    //declareFunction(myName, "gt_inferiorP", "GT-INFERIOR?", 3, 1, false);
    //declareFunction(myName, "gtm_inferiorP", "GTM-INFERIOR?", 2, 1, false);
    //declareFunction(myName, "gt_has_superiorP", "GT-HAS-SUPERIOR?", 3, 1, false);
    //declareFunction(myName, "gtm_has_superiorP", "GTM-HAS-SUPERIOR?", 2, 1, false);
    //declareFunction(myName, "gt_has_inferiorP", "GT-HAS-INFERIOR?", 3, 1, false);
    //declareFunction(myName, "gtm_has_inferiorP", "GTM-HAS-INFERIOR?", 2, 1, false);
    //declareFunction(myName, "gt_gather_inferior", "GT-GATHER-INFERIOR", 3, 1, false);
    //declareFunction(myName, "gtm_gather_inferior", "GTM-GATHER-INFERIOR", 2, 1, false);
    //declareFunction(myName, "gt_gather_superior", "GT-GATHER-SUPERIOR", 3, 1, false);
    //declareFunction(myName, "gtm_gather_superior", "GTM-GATHER-SUPERIOR", 2, 1, false);
    //declareFunction(myName, "gt_cyclesP", "GT-CYCLES?", 2, 1, false);
    //declareFunction(myName, "gtm_cyclesP", "GTM-CYCLES?", 1, 2, false);
    //declareFunction(myName, "gt_completes_cycleP", "GT-COMPLETES-CYCLE?", 3, 1, false);
    //declareFunction(myName, "gtm_completes_cycleP", "GTM-COMPLETES-CYCLE?", 2, 2, false);
    //declareFunction(myName, "gt_why_completes_cycleP", "GT-WHY-COMPLETES-CYCLE?", 3, 1, false);
    //declareFunction(myName, "gtm_why_completes_cycleP", "GTM-WHY-COMPLETES-CYCLE?", 2, 2, false);
    //declareFunction(myName, "gt_min_nodes", "GT-MIN-NODES", 2, 1, false);
    //declareFunction(myName, "gtm_min_nodes", "GTM-MIN-NODES", 1, 1, false);
    declareFunction(myName, "gt_max_nodes", "GT-MAX-NODES", 2, 2, false);
    declareFunction(myName, "gtm_max_nodes", "GTM-MAX-NODES", 1, 2, false);
    declareFunction(myName, "gt_max_nodes_down", "GT-MAX-NODES-DOWN", 1, 1, false);
    //declareFunction(myName, "gt_max_nodes_up_with_hash", "GT-MAX-NODES-UP-WITH-HASH", 1, 1, false);
    //declareFunction(myName, "gt_max_nodes_up", "GT-MAX-NODES-UP", 1, 1, false);
    //declareFunction(myName, "gt_min_ceilings", "GT-MIN-CEILINGS", 2, 2, false);
    //declareFunction(myName, "gtm_min_ceilings", "GTM-MIN-CEILINGS", 1, 2, false);
    //declareFunction(myName, "gt_ceilings", "GT-CEILINGS", 1, 2, false);
    //declareFunction(myName, "gt_ceilings_int", "GT-CEILINGS-INT", 1, 2, false);
    //declareFunction(myName, "gt_max_floors", "GT-MAX-FLOORS", 2, 2, false);
    //declareFunction(myName, "gtm_max_floors", "GTM-MAX-FLOORS", 1, 2, false);
    //declareFunction(myName, "gt_floors", "GT-FLOORS", 1, 2, false);
    //declareFunction(myName, "gt_floors_int", "GT-FLOORS-INT", 1, 2, false);
    //declareFunction(myName, "gt_min_superiors_excluding", "GT-MIN-SUPERIORS-EXCLUDING", 3, 1, false);
    //declareFunction(myName, "gtm_min_superiors_excluding", "GTM-MIN-SUPERIORS-EXCLUDING", 2, 1, false);
    //declareFunction(myName, "gt_max_inferiors_excluding", "GT-MAX-INFERIORS-EXCLUDING", 3, 1, false);
    //declareFunction(myName, "gtm_max_inferiors_excluding", "GTM-MAX-INFERIORS-EXCLUDING", 2, 1, false);
    //declareFunction(myName, "gt_all_superior_edges", "GT-ALL-SUPERIOR-EDGES", 3, 1, false);
    //declareFunction(myName, "gt_all_inferior_edges", "GT-ALL-INFERIOR-EDGES", 3, 1, false);
    //declareFunction(myName, "gtm_all_superior_edges", "GTM-ALL-SUPERIOR-EDGES", 2, 1, false);
    //declareFunction(myName, "gtm_all_inferior_edges", "GTM-ALL-INFERIOR-EDGES", 2, 1, false);
    //declareFunction(myName, "gt_all_paths", "GT-ALL-PATHS", 3, 1, false);
    //declareFunction(myName, "gtm_all_paths", "GTM-ALL-PATHS", 2, 1, false);
    //declareFunction(myName, "gt_superior_in_what_mts", "GT-SUPERIOR-IN-WHAT-MTS", 3, 0, false);
    //declareFunction(myName, "gtm_in_what_mts", "GTM-IN-WHAT-MTS", 3, 0, false);
    //declareFunction(myName, "gt_which_mts", "GT-WHICH-MTS", 4, 0, false);
    //declareFunction(myName, "gt_hierarchically_direct_in_what_mts", "GT-HIERARCHICALLY-DIRECT-IN-WHAT-MTS", 2, 0, false);
    //declareFunction(myName, "associate_node_with_last_spec_total", "ASSOCIATE-NODE-WITH-LAST-SPEC-TOTAL", 1, 0, false);
    //declareFunction(myName, "find_spec_cardinality", "FIND-SPEC-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "gt_all_inferiors_with_their_max_mts", "GT-ALL-INFERIORS-WITH-THEIR-MAX-MTS", 2, 0, false);
    //declareFunction(myName, "gtm_all_inferiors_with_mts", "GTM-ALL-INFERIORS-WITH-MTS", 1, 0, false);
    //declareFunction(myName, "find_instance_cardinality", "FIND-INSTANCE-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "gt_all_fort_instances_with_their_max_mts", "GT-ALL-FORT-INSTANCES-WITH-THEIR-MAX-MTS", 1, 0, false);
    //declareFunction(myName, "add_result_to_gt_result", "ADD-RESULT-TO-GT-RESULT", 1, 0, false);
    //declareFunction(myName, "gt_isa_in_what_mts", "GT-ISA-IN-WHAT-MTS", 2, 0, false);
    //declareFunction(myName, "gt_any_superior_path", "GT-ANY-SUPERIOR-PATH", 3, 1, false);
    //declareFunction(myName, "gtm_any_superior_path", "GTM-ANY-SUPERIOR-PATH", 2, 1, false);
    return NIL;
  }

  public static final SubLObject init_gt_methods_file() {
    return NIL;
  }

  public static final SubLObject setup_gt_methods_file() {
    // CVS_ID("Id: gt-methods.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym3$GT_SUPERIORS, $list4, $str5$Returns_direct_superiors_of_FORT_, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym15$GT_MIN_SUPERIORS, $list4, $str16$Returns_minimal_superiors_of_FORT, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym18$GT_INFERIORS, $list4, $str19$Returns_direct_inferiors_of_FORT_, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym23$GT_MAX_INFERIORS, $list4, $str24$Returns_maximal_inferiors_of_FORT, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym26$GT_CO_SUPERIORS, $list4, $str27$Returns_sibling_direct_superiors_, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym29$GT_CO_INFERIORS, $list4, $str30$Returns_sibling_direct_inferiors_, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym32$GT_REDUNDANT_SUPERIORS, $list4, $str33$Returns_direct_superiors_of_FORT_, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym35$GT_REDUNDANT_INFERIORS, $list4, $str36$Returns_direct_inferiors_of_FORT_, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym38$GT_ALL_SUPERIORS, $list4, $str39$Returns_all_superiors_of_FORT_via, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym41$GT_ALL_INFERIORS, $list4, $str42$Returns_all_inferiors_of_FORT_via, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym45$GT_ALL_ACCESSIBLE, $list4, $str46$Returns_all_superiors_and_all_inf, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym50$GT_ROOTS, $list4, $str51$Returns_maximal_superiors__i_e___, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym53$GT_LEAVES, $list4, $str54$Returns_minimal_inferiors__i_e___, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym58$GT_COMPOSE_FN_ALL_SUPERIORS, $list59, $str60$Apply_fn_to_each_superior_of_FORT, $list61, NIL);
    utilities_macros.register_cyc_api_function($sym63$GT_COMPOSE_FN_ALL_INFERIORS, $list64, $str65$Apply_fn_to_each_inferior_of_FORT, $list61, NIL);
    utilities_macros.register_cyc_api_function($sym68$GT_COMPOSE_PRED_ALL_SUPERIORS, $list69, $str70$Returns_all_nodes_accessible_by_C, $list71, $list7);
    utilities_macros.register_cyc_api_function($sym74$GT_COMPOSE_PRED_ALL_INFERIORS, $list69, $str75$Returns_all_nodes_accessible_by_C, $list71, $list7);
    utilities_macros.register_cyc_api_function($sym77$GT_ALL_DEPENDENT_INFERIORS, $list4, $str78$Returns_all_inferiors_i_of_FORT_s, $list6, $list7);
    utilities_macros.register_cyc_api_function($sym82$GT_WHY_SUPERIOR_, $list83, $str84$Returns_justification_of_why_SUPE, $list85, $list86);
    utilities_macros.register_cyc_api_function($sym93$GT_HAS_SUPERIOR_, $list94, $str95$Returns_whetherfort_INFERIOR_is_h, $list96, $list97);
    utilities_macros.register_cyc_api_function($sym98$GT_HAS_INFERIOR_, $list83, $str99$Returns_whether_fort_SUPERIOR_is_, $list85, $list97);
    utilities_macros.register_cyc_api_function($sym103$GT_CYCLES_, $list4, $str104$Returns_whether_FORT_is_accessibl, $list6, $list97);
    utilities_macros.register_cyc_api_function($sym106$GT_COMPLETES_CYCLE_, $list107, $str108$Returns_whether_a_transitive_path, $list109, $list97);
    utilities_macros.register_cyc_api_function($sym111$GT_WHY_COMPLETES_CYCLE_, $list107, $str112$Returns_justification_that_a_tran, $list109, NIL);
    utilities_macros.register_cyc_api_function($sym115$GT_MIN_NODES, $list116, $str117$Returns_returns_the_most_subordin, $list118, $list7);
    utilities_macros.register_cyc_api_function($sym121$GT_MAX_NODES, $list122, $str123$Returns_returns_the_least_subordi, $list118, $list7);
    utilities_macros.register_cyc_api_function($sym129$GT_MIN_CEILINGS, $list130, $str131$Returns_the_most_subordinate_comm, $list118, $list7);
    utilities_macros.register_cyc_api_function($sym134$GT_MAX_FLOORS, $list130, $str135$Returns_the_least_subordinate_ele, $list118, $list7);
    utilities_macros.register_cyc_api_function($sym137$GT_MIN_SUPERIORS_EXCLUDING, $list94, $str138$Returns_least_general_superiors_o, $list96, $list7);
    utilities_macros.register_cyc_api_function($sym140$GT_MAX_INFERIORS_EXCLUDING, $list94, $str141$Returns_most_general_inferiors_of, $list96, $list7);
    utilities_macros.register_cyc_api_function($sym161$GT_ANY_SUPERIOR_PATH, $list94, $str162$Returns_list_of_nodes_connecting_, $list96, $list7);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym1$GT_TERM_P = makeSymbol("GT-TERM-P");
  public static final SubLSymbol $kw2$SUPERIORS = makeKeyword("SUPERIORS");
  public static final SubLSymbol $sym3$GT_SUPERIORS = makeSymbol("GT-SUPERIORS");
  public static final SubLList $list4 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str5$Returns_direct_superiors_of_FORT_ = makeString("Returns direct superiors of FORT via transitive PREDICATE");
  public static final SubLList $list6 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("GT-TERM-P")));
  public static final SubLList $list7 = list(list(makeSymbol("LIST"), makeSymbol("GT-TERM-P")));
  public static final SubLSymbol $kw8$GT_ERROR = makeKeyword("GT-ERROR");
  public static final SubLSymbol $kw9$GT_INDEX = makeKeyword("GT-INDEX");
  public static final SubLSymbol $kw10$SUPERIOR = makeKeyword("SUPERIOR");
  public static final SubLString $str11$invalid_gt_mode___a = makeString("invalid gt mode: ~a");
  public static final SubLSymbol $kw12$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym13$TRUTH_P = makeSymbol("TRUTH-P");
  public static final SubLSymbol $kw14$MIN_SUPERIORS = makeKeyword("MIN-SUPERIORS");
  public static final SubLSymbol $sym15$GT_MIN_SUPERIORS = makeSymbol("GT-MIN-SUPERIORS");
  public static final SubLString $str16$Returns_minimal_superiors_of_FORT = makeString("Returns minimal superiors of FORT via transitive PREDICATE");
  public static final SubLSymbol $kw17$INFERIORS = makeKeyword("INFERIORS");
  public static final SubLSymbol $sym18$GT_INFERIORS = makeSymbol("GT-INFERIORS");
  public static final SubLString $str19$Returns_direct_inferiors_of_FORT_ = makeString("Returns direct inferiors of FORT via transitive PREDICATE");
  public static final SubLSymbol $kw20$GT_GATHER = makeKeyword("GT-GATHER");
  public static final SubLSymbol $kw21$INFERIOR = makeKeyword("INFERIOR");
  public static final SubLSymbol $kw22$MAX_INFERIORS = makeKeyword("MAX-INFERIORS");
  public static final SubLSymbol $sym23$GT_MAX_INFERIORS = makeSymbol("GT-MAX-INFERIORS");
  public static final SubLString $str24$Returns_maximal_inferiors_of_FORT = makeString("Returns maximal inferiors of FORT via transitive PREDICATE");
  public static final SubLSymbol $kw25$CO_SUPERIORS = makeKeyword("CO-SUPERIORS");
  public static final SubLSymbol $sym26$GT_CO_SUPERIORS = makeSymbol("GT-CO-SUPERIORS");
  public static final SubLString $str27$Returns_sibling_direct_superiors_ = makeString("Returns sibling direct-superiors of direct-inferiors of FORT via PREDICATE, excluding FORT itself");
  public static final SubLSymbol $kw28$CO_INFERIORS = makeKeyword("CO-INFERIORS");
  public static final SubLSymbol $sym29$GT_CO_INFERIORS = makeSymbol("GT-CO-INFERIORS");
  public static final SubLString $str30$Returns_sibling_direct_inferiors_ = makeString("Returns sibling direct-inferiors of direct-superiors of FORT via PREDICATE, excluding FORT itself");
  public static final SubLSymbol $kw31$REDUNDANT_SUPERIORS = makeKeyword("REDUNDANT-SUPERIORS");
  public static final SubLSymbol $sym32$GT_REDUNDANT_SUPERIORS = makeSymbol("GT-REDUNDANT-SUPERIORS");
  public static final SubLString $str33$Returns_direct_superiors_of_FORT_ = makeString("Returns direct-superiors of FORT via PREDICATE that are subsumed by other superiors");
  public static final SubLSymbol $kw34$REDUNDANT_INFERIORS = makeKeyword("REDUNDANT-INFERIORS");
  public static final SubLSymbol $sym35$GT_REDUNDANT_INFERIORS = makeSymbol("GT-REDUNDANT-INFERIORS");
  public static final SubLString $str36$Returns_direct_inferiors_of_FORT_ = makeString("Returns direct-inferiors of FORT via PREDICATE that subsumed other inferiors");
  public static final SubLSymbol $kw37$ALL_SUPERIORS = makeKeyword("ALL-SUPERIORS");
  public static final SubLSymbol $sym38$GT_ALL_SUPERIORS = makeSymbol("GT-ALL-SUPERIORS");
  public static final SubLString $str39$Returns_all_superiors_of_FORT_via = makeString("Returns all superiors of FORT via PREDICATE");
  public static final SubLSymbol $kw40$ALL_INFERIORS = makeKeyword("ALL-INFERIORS");
  public static final SubLSymbol $sym41$GT_ALL_INFERIORS = makeSymbol("GT-ALL-INFERIORS");
  public static final SubLString $str42$Returns_all_inferiors_of_FORT_via = makeString("Returns all inferiors of FORT via PREDICATE");
  public static final SubLSymbol $kw43$UNION_ALL_INFERIORS = makeKeyword("UNION-ALL-INFERIORS");
  public static final SubLSymbol $kw44$ALL_ACCESSIBLE = makeKeyword("ALL-ACCESSIBLE");
  public static final SubLSymbol $sym45$GT_ALL_ACCESSIBLE = makeSymbol("GT-ALL-ACCESSIBLE");
  public static final SubLString $str46$Returns_all_superiors_and_all_inf = makeString("Returns all superiors and all inferiors of FORT via PREDICATE");
  public static final SubLSymbol $kw47$GT_EITHER = makeKeyword("GT-EITHER");
  public static final SubLSymbol $kw48$ACCESSIBLE = makeKeyword("ACCESSIBLE");
  public static final SubLSymbol $kw49$ROOTS = makeKeyword("ROOTS");
  public static final SubLSymbol $sym50$GT_ROOTS = makeSymbol("GT-ROOTS");
  public static final SubLString $str51$Returns_maximal_superiors__i_e___ = makeString("Returns maximal superiors (i.e., roots) of FORT via PREDICATE");
  public static final SubLSymbol $kw52$LEAVES = makeKeyword("LEAVES");
  public static final SubLSymbol $sym53$GT_LEAVES = makeSymbol("GT-LEAVES");
  public static final SubLString $str54$Returns_minimal_inferiors__i_e___ = makeString("Returns minimal inferiors (i.e., leaves) of FORT via PREDICATE");
  public static final SubLSymbol $sym55$CONS = makeSymbol("CONS");
  public static final SubLSymbol $sym56$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $kw57$COMPOSE_FN_SUPERIORS = makeKeyword("COMPOSE-FN-SUPERIORS");
  public static final SubLSymbol $sym58$GT_COMPOSE_FN_ALL_SUPERIORS = makeSymbol("GT-COMPOSE-FN-ALL-SUPERIORS");
  public static final SubLList $list59 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), list(makeSymbol("FUNCTION"), makeSymbol("CONS"))), makeSymbol("MT"));
  public static final SubLString $str60$Apply_fn_to_each_superior_of_FORT = makeString("Apply fn to each superior of FORT;\n   fn takes a fort as its only arg, and must not effect the search status of each\n  fort it visits");
  public static final SubLList $list61 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("GT-TERM-P")), list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")));
  public static final SubLSymbol $kw62$COMPOSE_FN_INFERIORS = makeKeyword("COMPOSE-FN-INFERIORS");
  public static final SubLSymbol $sym63$GT_COMPOSE_FN_ALL_INFERIORS = makeSymbol("GT-COMPOSE-FN-ALL-INFERIORS");
  public static final SubLList $list64 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), makeSymbol("*GT-COMBINE-FN*")), makeSymbol("MT"));
  public static final SubLString $str65$Apply_fn_to_each_inferior_of_FORT = makeString("Apply fn to each inferior of FORT; \n   fn takes a fort as its only arg, and \n   it must not effect the search status of each fort it visits");
  public static final SubLSymbol $sym66$PREDICATE_IN_ANY_MT_ = makeSymbol("PREDICATE-IN-ANY-MT?");
  public static final SubLSymbol $kw67$COMPOSE_PRED_SUPERIORS = makeKeyword("COMPOSE-PRED-SUPERIORS");
  public static final SubLSymbol $sym68$GT_COMPOSE_PRED_ALL_SUPERIORS = makeSymbol("GT-COMPOSE-PRED-ALL-SUPERIORS");
  public static final SubLList $list69 = list(makeSymbol("PREDICATE"), makeSymbol("FORT"), makeSymbol("COMPOSE-PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMPOSE-INDEX-ARG"), makeSymbol("*GT-COMPOSE-INDEX-ARG*")), list(makeSymbol("COMPOSE-GATHER-ARG"), makeSymbol("*GT-COMPOSE-GATHER-ARG*")), makeSymbol("MT"));
  public static final SubLString $str70$Returns_all_nodes_accessible_by_C = makeString("Returns all nodes accessible by COMPOSE-PRED from each superior of FORT along \n  transitive PREDICATE");
  public static final SubLList $list71 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("GT-TERM-P")), list(makeSymbol("COMPOSE-PRED"), makeSymbol("PREDICATE-IN-ANY-MT?")));
  public static final SubLSymbol $sym72$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLSymbol $kw73$COMPOSE_PRED_INFERIORS = makeKeyword("COMPOSE-PRED-INFERIORS");
  public static final SubLSymbol $sym74$GT_COMPOSE_PRED_ALL_INFERIORS = makeSymbol("GT-COMPOSE-PRED-ALL-INFERIORS");
  public static final SubLString $str75$Returns_all_nodes_accessible_by_C = makeString("Returns all nodes accessible by COMPOSE-PRED from each inferior of FORT along \n  transitive PREDICATE");
  public static final SubLSymbol $kw76$ALL_DEPENDENT_INFERIORS = makeKeyword("ALL-DEPENDENT-INFERIORS");
  public static final SubLSymbol $sym77$GT_ALL_DEPENDENT_INFERIORS = makeSymbol("GT-ALL-DEPENDENT-INFERIORS");
  public static final SubLString $str78$Returns_all_inferiors_i_of_FORT_s = makeString("Returns all inferiors i of FORT s.t. every path connecting i to \n   any superior of FORT must pass through FORT");
  public static final SubLSymbol $kw79$BOOLEAN_ = makeKeyword("BOOLEAN?");
  public static final SubLSymbol $kw80$SUPERIOR_ = makeKeyword("SUPERIOR?");
  public static final SubLSymbol $kw81$WHY_SUPERIOR_ = makeKeyword("WHY-SUPERIOR?");
  public static final SubLSymbol $sym82$GT_WHY_SUPERIOR_ = makeSymbol("GT-WHY-SUPERIOR?");
  public static final SubLList $list83 = list(makeSymbol("PREDICATE"), makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str84$Returns_justification_of_why_SUPE = makeString("Returns justification of why SUPERIOR is superior to (i.e., hierarchically higher than) \n  INFERIOR");
  public static final SubLList $list85 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("SUPERIOR"), makeSymbol("GT-TERM-P")), list(makeSymbol("INFERIOR"), makeSymbol("GT-TERM-P")));
  public static final SubLList $list86 = list(list(makeSymbol("LIST"), makeSymbol("ASSERTION-P")));
  public static final SubLSymbol $kw87$REFLEXIVE = makeKeyword("REFLEXIVE");
  public static final SubLSymbol $kw88$GENLPREDS = makeKeyword("GENLPREDS");
  public static final SubLObject $const89$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLObject $const90$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $kw91$INFERIOR_ = makeKeyword("INFERIOR?");
  public static final SubLSymbol $kw92$HAS_SUPERIOR_ = makeKeyword("HAS-SUPERIOR?");
  public static final SubLSymbol $sym93$GT_HAS_SUPERIOR_ = makeSymbol("GT-HAS-SUPERIOR?");
  public static final SubLList $list94 = list(makeSymbol("PREDICATE"), makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str95$Returns_whetherfort_INFERIOR_is_h = makeString("Returns whetherfort INFERIOR is hierarchically lower (wrt transitive PREDICATE) \n  to fort SUPERIOR?");
  public static final SubLList $list96 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("INFERIOR"), makeSymbol("GT-TERM-P")), list(makeSymbol("SUPERIOR"), makeSymbol("GT-TERM-P")));
  public static final SubLList $list97 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym98$GT_HAS_INFERIOR_ = makeSymbol("GT-HAS-INFERIOR?");
  public static final SubLString $str99$Returns_whether_fort_SUPERIOR_is_ = makeString("Returns whether fort SUPERIOR is hierarchically higher \n   (wrt transitive PREDICATE) to fort INFERIOR?");
  public static final SubLSymbol $kw100$GATHER_INFERIOR = makeKeyword("GATHER-INFERIOR");
  public static final SubLSymbol $kw101$GATHER_SUPERIOR = makeKeyword("GATHER-SUPERIOR");
  public static final SubLSymbol $kw102$CYCLES_ = makeKeyword("CYCLES?");
  public static final SubLSymbol $sym103$GT_CYCLES_ = makeSymbol("GT-CYCLES?");
  public static final SubLString $str104$Returns_whether_FORT_is_accessibl = makeString("Returns whether FORT is accessible from itself by one or more PREDICATE gafs?");
  public static final SubLSymbol $kw105$COMPLETES_CYCLE_ = makeKeyword("COMPLETES-CYCLE?");
  public static final SubLSymbol $sym106$GT_COMPLETES_CYCLE_ = makeSymbol("GT-COMPLETES-CYCLE?");
  public static final SubLList $list107 = list(makeSymbol("PREDICATE"), makeSymbol("FORT1"), makeSymbol("FORT2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str108$Returns_whether_a_transitive_path = makeString("Returns whether a transitive path connect FORT2 to FORT1, \n   or whether a transitive inverse path connect FORT1 to FORT2?");
  public static final SubLList $list109 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORT1"), makeSymbol("GT-TERM-P")), list(makeSymbol("FORT2"), makeSymbol("GT-TERM-P")));
  public static final SubLSymbol $kw110$WHY_COMPLETES_CYCLE_ = makeKeyword("WHY-COMPLETES-CYCLE?");
  public static final SubLSymbol $sym111$GT_WHY_COMPLETES_CYCLE_ = makeSymbol("GT-WHY-COMPLETES-CYCLE?");
  public static final SubLString $str112$Returns_justification_that_a_tran = makeString("Returns justification that a transitive path connects FORT2 to FORT1, \n   or that a transitive inverse path connects FORT1 to FORT2?");
  public static final SubLSymbol $sym113$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $kw114$MIN_NODES = makeKeyword("MIN-NODES");
  public static final SubLSymbol $sym115$GT_MIN_NODES = makeSymbol("GT-MIN-NODES");
  public static final SubLList $list116 = list(makeSymbol("PREDICATE"), makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str117$Returns_returns_the_most_subordin = makeString("Returns returns the most-subordinate elements of FORTS\n   (one member only of a cycle will be a min-node candidate)");
  public static final SubLList $list118 = list(list(makeSymbol("PREDICATE"), makeSymbol("FORT-P")), list(makeSymbol("FORTS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym119$GT_SEARCHED_ = makeSymbol("GT-SEARCHED?");
  public static final SubLSymbol $kw120$MAX_NODES = makeKeyword("MAX-NODES");
  public static final SubLSymbol $sym121$GT_MAX_NODES = makeSymbol("GT-MAX-NODES");
  public static final SubLList $list122 = list(makeSymbol("PREDICATE"), makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("DIRECTION"), makeSymbol("*GT-MAX-NODES-DIRECTION*")));
  public static final SubLString $str123$Returns_returns_the_least_subordi = makeString("Returns returns the least-subordinate elements of FORTS\n   (<direction> should be :up unless all nodes are low in the hierarchy)");
  public static final SubLSymbol $kw124$UP = makeKeyword("UP");
  public static final SubLSymbol $kw125$DOWN = makeKeyword("DOWN");
  public static final SubLSymbol $sym126$GETHASH = makeSymbol("GETHASH");
  public static final SubLSymbol $sym127$MEMBER_ = makeSymbol("MEMBER?");
  public static final SubLSymbol $kw128$MIN_CEILINGS = makeKeyword("MIN-CEILINGS");
  public static final SubLSymbol $sym129$GT_MIN_CEILINGS = makeSymbol("GT-MIN-CEILINGS");
  public static final SubLList $list130 = list(makeSymbol("PREDICATE"), makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"));
  public static final SubLString $str131$Returns_the_most_subordinate_comm = makeString("Returns the most-subordinate common superiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)");
  public static final SubLInteger $int132$128 = makeInteger(128);
  public static final SubLSymbol $kw133$MAX_FLOORS = makeKeyword("MAX-FLOORS");
  public static final SubLSymbol $sym134$GT_MAX_FLOORS = makeSymbol("GT-MAX-FLOORS");
  public static final SubLString $str135$Returns_the_least_subordinate_ele = makeString("Returns the least-subordinate elements or common inferiors of FORTS\n   (when CANDIDATES is non-nil, the result must subset it)");
  public static final SubLSymbol $kw136$MIN_SUPERIORS_EXCLUDING = makeKeyword("MIN-SUPERIORS-EXCLUDING");
  public static final SubLSymbol $sym137$GT_MIN_SUPERIORS_EXCLUDING = makeSymbol("GT-MIN-SUPERIORS-EXCLUDING");
  public static final SubLString $str138$Returns_least_general_superiors_o = makeString("Returns least-general superiors of INFERIOR ignoring SUPERIOR\n   (useful for splicing-out SUPERIOR from hierarchy)");
  public static final SubLSymbol $kw139$MAX_INFERIORS_EXCLUDING = makeKeyword("MAX-INFERIORS-EXCLUDING");
  public static final SubLSymbol $sym140$GT_MAX_INFERIORS_EXCLUDING = makeSymbol("GT-MAX-INFERIORS-EXCLUDING");
  public static final SubLString $str141$Returns_most_general_inferiors_of = makeString("Returns most-general inferiors of SUPERIOR ignoring INFERIOR (expensive)\n   (useful for splicing-out INFERIOR from hierarchy)");
  public static final SubLSymbol $kw142$ALL_SUPERIOR_EDGES = makeKeyword("ALL-SUPERIOR-EDGES");
  public static final SubLSymbol $kw143$ALL_INFERIOR_EDGES = makeKeyword("ALL-INFERIOR-EDGES");
  public static final SubLSymbol $kw144$ALL_PATHS = makeKeyword("ALL-PATHS");
  public static final SubLSymbol $kw145$SUPERIOR_IN_WHAT_MTS = makeKeyword("SUPERIOR-IN-WHAT-MTS");
  public static final SubLSymbol $kw146$HIERARCHICALLY_DIRECT = makeKeyword("HIERARCHICALLY-DIRECT");
  public static final SubLString $str147$illegal_value_for_method_of_which = makeString("illegal value for method of which-mts: ~s");
  public static final SubLSymbol $sym148$RELEVANT_MT_IS_ANY_MT = makeSymbol("RELEVANT-MT-IS-ANY-MT");
  public static final SubLObject $const149$InferencePSC = constant_handles.reader_make_constant_shell(makeString("InferencePSC"));
  public static final SubLSymbol $kw150$INFERIORS_WITH_MTS = makeKeyword("INFERIORS-WITH-MTS");
  public static final SubLSymbol $sym151$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const152$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLObject $const153$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLString $str154$before_gathering_instances = makeString("before gathering instances");
  public static final SubLSymbol $sym155$ADD_RESULT_TO_GT_RESULT = makeSymbol("ADD-RESULT-TO-GT-RESULT");
  public static final SubLObject $const156$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLString $str157$after_instances__before_maximin = makeString("after instances, before maximin");
  public static final SubLString $str158$after_maximin = makeString("after maximin");
  public static final SubLObject $const159$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $kw160$ANY_SUPERIOR_PATH = makeKeyword("ANY-SUPERIOR-PATH");
  public static final SubLSymbol $sym161$GT_ANY_SUPERIOR_PATH = makeSymbol("GT-ANY-SUPERIOR-PATH");
  public static final SubLString $str162$Returns_list_of_nodes_connecting_ = makeString("Returns list of nodes connecting INFERIOR with SUPERIOR");

  //// Initializers

  public void declareFunctions() {
    declare_gt_methods_file();
  }

  public void initializeVariables() {
    init_gt_methods_file();
  }

  public void runTopLevelForms() {
    setup_gt_methods_file();
  }

}
