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
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class sbhl_search_vars extends SubLTranslatedFile {

  //// Constructor

  private sbhl_search_vars() {}
  public static final SubLFile me = new sbhl_search_vars();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars";

  //// Definitions

  /** Different types of search, leading to different behaviors. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 5373) 
  public static SubLSymbol $sbhl_search_types$ = null;

  /** The current type of search. Governs how each search node is used during search. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 5529) 
  public static SubLSymbol $sbhl_search_type$ = null;

  /** Accessor. @see *sbhl-search-type* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 5837) 
  public static final SubLObject get_sbhl_search_type() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_search_type$.getDynamicValue(thread);
    }
  }

  /** Accessor: @return booleanp; whether search type indicates boolean search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 6720) 
  public static final SubLObject sbhl_boolean_search_p() {
    return Equality.eq(get_sbhl_search_type(), $kw28$BOOLEAN);
  }

  /** Does the current boolean search show the path that allowed success to be concluded */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 7275) 
  public static SubLSymbol $sbhl_justification_search_p$ = null;

  /** Accessor: @return booleanp; whether current search is one that gathers justifications. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 7420) 
  public static final SubLObject sbhl_justification_search_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_justification_search_p$.getDynamicValue(thread);
    }
  }

  /** The current search's entry function */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 8371) 
  public static SubLSymbol $sbhl_search_behavior$ = null;

  /** Accessor. @return sbhl-module-p; @see *sbhl-search-behavior */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 8482) 
  public static final SubLObject get_sbhl_search_behavior() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_search_behavior$.getDynamicValue(thread);
    }
  }

  /** the current behavior used for assembling sbhl-justifications, and determining how their returns will appear */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 8757) 
  public static SubLSymbol $sbhl_justification_behavior$ = null;

  /** @return keywordp; @see *sbhl-justification-behavior* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 8955) 
  public static final SubLObject get_sbhl_just_behavior() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_justification_behavior$.getDynamicValue(thread);
    }
  }

  /** parameter used to indicate when justification was coerced and requires old justification behavior */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 10258) 
  public static SubLSymbol $sbhl_justification_defaulted_old$ = null;

  /** has the justification path already been assembled? */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 11030) 
  public static SubLSymbol $sbhl_justification_assembled_p$ = null;

  /** Accessor: @return booleanp; @see *sbhl-justification-assembled-p* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 11594) 
  public static final SubLObject sbhl_justification_assembled_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_justification_assembled_p$.getDynamicValue(thread);
    }
  }

  /** Is current search an unmarking search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 11759) 
  public static SubLSymbol $sbhl_unmarking_search_p$ = null;

  /** Accessor. @return booleanp; @see *sbhl-unmarking-search-p*. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 11881) 
  public static final SubLObject sbhl_unmarking_search_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_unmarking_search_p$.getDynamicValue(thread);
    }
  }

  /** The module initiating the current search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 12357) 
  public static SubLSymbol $sbhl_search_module$ = null;

  /** Accessor. @return sbhl-module-p; @see *sbhl-search-module* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 12468) 
  public static final SubLObject get_sbhl_search_module() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $sbhl_search_module$.getDynamicValue(thread))) {
        Errors.warn($str48$get_sbhl_search_module___sbhl_sea);
      }
      return $sbhl_search_module$.getDynamicValue(thread);
    }
  }

  /** The module type of the current search module. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 12723) 
  public static SubLSymbol $sbhl_search_module_type$ = null;

  /** Accessor. @return keywordp; @see *sbhl-search-module-type* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 12827) 
  public static final SubLObject get_sbhl_search_module_type() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_search_module_type$.getDynamicValue(thread);
    }
  }

  /** the function used to govern adding nodes to the result during search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 12974) 
  public static SubLSymbol $sbhl_add_node_to_result_test$ = null;

  /** @return function-spec-p; the function applied to a node's marking before pushing correctly marked nodes onto result. Determined by current *sbhl-search-module*. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 13106) 
  public static final SubLObject get_sbhl_search_add_node_test() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_add_node_to_result_test$.getDynamicValue(thread);
    }
  }

  /** the function used to govern adding nodes to the result of an unmarking search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 13362) 
  public static SubLSymbol $sbhl_add_unmarked_node_to_result_test$ = null;

  /** @return function-spec-p; the function applied to a node's marking before pushing unmarked nodes onto result. Determined by current *sbhl-search-module*. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 13512) 
  public static final SubLObject get_sbhl_search_add_unmarked_node_test() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_add_unmarked_node_to_result_test$.getDynamicValue(thread);
    }
  }

  /** Whether current search state has argument order flipped from search's initial order */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 15022) 
  public static SubLSymbol $genl_inverse_mode_p$ = null;

  /** Accessor: @return booleanp. @see *sbhl-genl-inverse-mode-p* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 15183) 
  public static final SubLObject genl_inverse_mode_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $genl_inverse_mode_p$.getDynamicValue(thread);
    }
  }

  /** Accessor: @return booleanp. opposite of @see *sbhl-genl-inverse-mode-p* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 15320) 
  public static final SubLObject not_genl_inverse_mode_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((NIL == $genl_inverse_mode_p$.getDynamicValue(thread)));
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 17167) 
  public static final SubLObject sbhl_module_flips_inverse_mode_p(SubLObject sbhl_module) {
    if ((sbhl_module == UNPROVIDED)) {
      sbhl_module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
    }
    return makeBoolean(((sbhl_module_utilities.get_sbhl_link_pred(sbhl_module) == $const49$genlInverse)
          || (sbhl_module_utilities.get_sbhl_link_pred(sbhl_module) == $const51$negationInverse)));
  }

  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 17391) 
  public static final SubLObject flip_genl_inverse_modeP(SubLObject sbhl_module, SubLObject sbhl_search_module) {
    if ((sbhl_module == UNPROVIDED)) {
      sbhl_module = sbhl_module_vars.get_sbhl_module(UNPROVIDED);
    }
    if ((sbhl_search_module == UNPROVIDED)) {
      sbhl_search_module = get_sbhl_search_module();
    }
    return makeBoolean(((NIL != sbhl_module_utilities.sbhl_module_indicates_predicate_search_p(sbhl_search_module))
           && (NIL != sbhl_module_flips_inverse_mode_p(sbhl_module))));
  }

  /** The keyword specifying forward search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18152) 
  public static SubLSymbol $sbhl_forward_search_direction$ = null;

  /** Accessor. @return sbhl-direction-p; whether sbhl search direction is forward */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18279) 
  public static final SubLObject sbhl_forward_search_direction_p(SubLObject direction) {
    return Equality.eq(direction, $sbhl_forward_search_direction$.getGlobalValue());
  }

  /** Accessor. @see *sbhl-forward-search-direction* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18479) 
  public static final SubLObject get_sbhl_forward_search_direction() {
    return $sbhl_forward_search_direction$.getGlobalValue();
  }

  /** The keyword specifying backward search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18627) 
  public static SubLSymbol $sbhl_backward_search_direction$ = null;

  /** Accessor. @return sbhl-direction-p; whether sbhl search direction is backward */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18735) 
  public static final SubLObject sbhl_backward_search_direction_p(SubLObject direction) {
    return Equality.eq(direction, $sbhl_backward_search_direction$.getGlobalValue());
  }

  /** Accessor. @see *sbhl-backward-search-direction* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 18938) 
  public static final SubLObject get_sbhl_backward_search_direction() {
    return $sbhl_backward_search_direction$.getGlobalValue();
  }

  /** The direction of current search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 19089) 
  public static SubLSymbol $sbhl_search_direction$ = null;

  /** Accessor. @return sbhl-direction-p; @see *sbhl-search-direction* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 19177) 
  public static final SubLObject get_sbhl_search_direction() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_search_direction$.getDynamicValue(thread);
    }
  }

  /** Accessor: @return booleanp; whether the *sbhl-search-direction* is forward. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 19907) 
  public static final SubLObject sbhl_forward_search_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return sbhl_forward_search_direction_p($sbhl_search_direction$.getDynamicValue(thread));
    }
  }

  /** Accessor: @return booleanp; whether the *sbhl-search-direction* is backward. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 20098) 
  public static final SubLObject sbhl_backward_search_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return sbhl_backward_search_direction_p($sbhl_search_direction$.getDynamicValue(thread));
    }
  }

  /** Obsolete */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 20292) 
  public static SubLSymbol $sbhl_index_arg$ = null;

  /** The index arg for current search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 20371) 
  public static SubLSymbol $sbhl_search_index_arg$ = null;

  /** The recursive winding function of current search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21115) 
  public static SubLSymbol $sbhl_map_function$ = null;

  /** Accessor. @see *sbhl-map-function* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21234) 
  public static final SubLObject get_sbhl_map_function() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_map_function$.getDynamicValue(thread);
    }
  }

  /** The function applied during recursive unwind. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21542) 
  public static SubLSymbol $sbhl_unwind_function$ = null;

  /** Accessor. @see *sbhl-unwind-function* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21663) 
  public static final SubLObject get_sbhl_unwind_function() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_unwind_function$.getDynamicValue(thread);
    }
  }

  /** Toggle determining whether to apply *sbhl-unwind-function* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 21992) 
  public static SubLSymbol $sbhl_apply_unwind_function_p$ = null;

  /** Accessor. @return booleanp; the value of @see *sbhl-apply-unwind-function-p* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 22142) 
  public static final SubLObject sbhl_apply_unwind_function_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_apply_unwind_function_p$.getDynamicValue(thread);
    }
  }

  /** Sets to t @see *sbhl-apply-unwind-function-p* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 22314) 
  public static final SubLObject sbhl_toggle_unwind_function_on() {
    $sbhl_apply_unwind_function_p$.setDynamicValue(T);
    return NIL;
  }

  /** The current node's parent marking */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 22998) 
  public static SubLSymbol $sbhl_search_parent_marking$ = null;

  /** Modifier. sets *sbhl-search-parent-marking* to MARKING */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 23280) 
  public static final SubLObject set_sbhl_search_parent_marking(SubLObject marking) {
    $sbhl_search_parent_marking$.setDynamicValue(marking);
    return NIL;
  }

  /** previous marking of node */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 23901) 
  public static SubLSymbol $sbhl_nodes_previous_marking$ = null;

  /** Stores whether sbhl search is finished and if so, how. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 24349) 
  public static SubLSymbol $sbhl_finishedP$ = null;

  /** Modifier: sets *sbhl-finished?* to :goal. Used to specify that an sbhl search terminated upon reaching its goal condition. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 24619) 
  public static final SubLObject sbhl_finished_with_goal() {
    $sbhl_finishedP$.setDynamicValue($kw92$GOAL);
    return NIL;
  }

  /** stop mark and sweep from going further */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 25043) 
  public static SubLSymbol $sbhl_stop_search_pathP$ = null;

  /** Accessor: @return booleanp; whether to stop the current search path. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 25160) 
  public static final SubLObject sbhl_stop_search_path_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_stop_search_pathP$.getDynamicValue(thread);
    }
  }

  /** Modifier: sets environment to stop current search path. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 25313) 
  public static final SubLObject sbhl_stop_search_path() {
    $sbhl_stop_search_pathP$.setDynamicValue(T);
    return NIL;
  }

  /** The target node for current search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 25806) 
  public static SubLSymbol $sbhl_target_node$ = null;

  /** The goal node for current search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 26244) 
  public static SubLSymbol $sbhl_goal_node$ = null;

  /** Accessor: @return booleanp; whether NODE is equal to *sbhl-goal-node* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 26341) 
  public static final SubLObject sbhl_goal_node_p(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return Equality.eq(node, $sbhl_goal_node$.getDynamicValue(thread));
    }
  }

  /** Accessor: @return sbhl-node-object-p; the @see *sbhl-goal-node*. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 26665) 
  public static final SubLObject get_sbhl_goal_node() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_goal_node$.getDynamicValue(thread);
    }
  }

  /** The goal nodes for current search for any goal */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 26802) 
  public static SubLSymbol $sbhl_goal_nodes$ = null;

  /** Accessor: @return listp; the current goal nodes. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 27081) 
  public static final SubLObject get_sbhl_goal_nodes() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_goal_nodes$.getDynamicValue(thread);
    }
  }

  /** The goal node for current search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 27379) 
  public static SubLSymbol $sbhl_isaP_goal$ = null;

  /** the result in search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 27808) 
  public static SubLSymbol $sbhl_result$ = null;

  /** the result in justification searches. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 28171) 
  public static SubLSymbol $sbhl_justification_result$ = null;

  /** function applied to each node during closure searches. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 28601) 
  public static SubLSymbol $sbhl_consider_node_fn$ = null;

  /** Accessor. @return function-spec-p. @see *sbhl-consider-node-fn* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 28740) 
  public static final SubLObject get_sbhl_consider_node_fn() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_consider_node_fn$.getDynamicValue(thread);
    }
  }

  /** function applied to each node during closure searches. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 29053) 
  public static SubLSymbol $sbhl_compose_fn$ = null;

  /** Accessor. @return function-spec-p. @see *sbhl-compose-fn* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 29181) 
  public static final SubLObject get_sbhl_compose_fn() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_compose_fn$.getDynamicValue(thread);
    }
  }

  /** function applied to each node during closure searches. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 29457) 
  public static SubLSymbol $sbhl_combine_fn$ = null;

  /** function applied to each node during closure searches. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 29863) 
  public static SubLSymbol $sbhl_map_test_fn$ = null;

  /** the nodes upon which a gather has already been performed. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 30267) 
  public static SubLSymbol $sbhl_accessed_gather_nodes$ = null;

  /** The source node in dependent searches */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 30596) 
  public static SubLSymbol $sbhl_dependents_cut_node$ = null;

  /** the arg accessed in current sbhl mapping. Used for checking validity of terms within an arg position of a predicate */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 31084) 
  public static SubLSymbol $sbhl_access_arg$ = null;

  /** variable that can be used for comparison during sbhl searched */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 31413) 
  public static SubLSymbol $sbhl_referent$ = null;

  /** Current search path during sample leaves search. Path is saved if successful. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 31737) 
  public static SubLSymbol $sbhl_current_leaf_queue$ = null;

  /** The list of queues guiding sample leaf searches. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 32081) 
  public static SubLSymbol $sbhl_sample_leaf_queues$ = null;

  /** Accessor: @return booleanp; uses *sbhl-sample-leaf-queues* to answer whether current search is one that uses the leaf queues. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 32489) 
  public static final SubLObject sbhl_leaf_sample_search_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return list_utilities.sublisp_boolean($sbhl_sample_leaf_queues$.getDynamicValue(thread));
    }
  }

  /** Function used to test extremal nodes */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 33472) 
  public static SubLSymbol $sbhl_extremal_test_fn$ = null;

  /** Whether to check whether a node is marked as :goal before checking other marking in search path termination. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 33956) 
  public static SubLSymbol $sbhl_check_for_goal_marking_p$ = null;

  /** Accessor. @return booleanp. @see *sbhl-check-for-goal-marking-p* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 34162) 
  public static final SubLObject sbhl_check_for_goal_marking_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_check_for_goal_marking_p$.getDynamicValue(thread);
    }
  }

  /** The space bound for marking successful paths in repeated boolean searches */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 34540) 
  public static SubLSymbol $sbhl_precomputed_goal_space$ = null;

  /** permit isa module to infer isa/genls of reified nats from result-type of functor? */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 34893) 
  public static SubLSymbol $infer_nat_sbhlP$ = null;

  /** obsolete */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35073) 
  public static SubLSymbol $sbhl_mapping_pred$ = null;

  /** obsolete */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35148) 
  public static SubLSymbol $maximize_sbhl_resultP$ = null;

  /** obsolete */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35210) 
  public static SubLSymbol $minimize_sbhl_resultP$ = null;

  /** used to determine whether the search is true or false */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35270) 
  public static SubLSymbol $sbhl_search_truth$ = null;

  /** Accessor: @return booleanp; whether *sbhl-tv* generalizes to #$True-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv? */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 35835) 
  public static final SubLObject sbhl_true_search_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return sbhl_true_tv_p($sbhl_search_truth$.getDynamicValue(thread));
    }
  }

  /** valid sbhl truth values for searching */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 36276) 
  private static SubLSymbol $sbhl_search_truth_values$ = null;

  /** @return booleanp; whether TRUTH is a member of *sbhl-search-truth-values* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 36530) 
  public static final SubLObject sbhl_search_truth_value_p(SubLObject truth) {
    return subl_promotions.memberP(truth, $sbhl_search_truth_values$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
  }

  /** the encompassing true truth for searches. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 36713) 
  private static SubLSymbol $sbhl_true_tv$ = null;

  /** the encompassing false truth for searches. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 36820) 
  private static SubLSymbol $sbhl_false_tv$ = null;

  /** @return sbhl-search-truth-value-p; the encompassing true truth. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 36930) 
  public static final SubLObject get_sbhl_true_tv() {
    return $sbhl_true_tv$.getGlobalValue();
  }

  /** @return sbhl-search-truth-value-p; the encompassing false truth. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 37061) 
  public static final SubLObject get_sbhl_false_tv() {
    return $sbhl_false_tv$.getGlobalValue();
  }

  /** search parameter */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 37195) 
  public static SubLSymbol $sbhl_tv$ = null;

  /** @return sbhl-search-truth-value-p; the truth relevance for the current search. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 37297) 
  public static final SubLObject get_sbhl_tv() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $sbhl_tv$.getDynamicValue(thread);
    }
  }

  /** the truth relevance function for the current search */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 37434) 
  public static SubLSymbol $relevant_sbhl_tv_function$ = null;

  /** Accessor: @return booleanp; whether TV is subsumed by GENERAL-TV. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 37721) 
  public static final SubLObject sbhl_tv_generalizes_to_general_tvP(SubLObject tv, SubLObject general_tv) {
    if ((tv == general_tv)) {
      return T;
    }
    {
      SubLObject pcase_var = tv;
      if (pcase_var.eql($const147$MonotonicallyTrue)) {
        return makeBoolean(((general_tv == $const148$DefaultTrue)
              || (general_tv == $const145$True_JustificationTruth)
              || (general_tv == $const149$ArbitraryTruth_JustifactionTruth)));
      } else if (pcase_var.eql($const148$DefaultTrue)) {
        return makeBoolean(((general_tv == $const145$True_JustificationTruth)
              || (general_tv == $const150$ArbitraryTruth_JustificationTruth)));
      } else if (pcase_var.eql($const145$True_JustificationTruth)) {
        return Equality.eq(general_tv, $const150$ArbitraryTruth_JustificationTruth);
      } else if (pcase_var.eql($const151$MonotonicallyFalse)) {
        return makeBoolean(((general_tv == $const152$DefaultFalse)
              || (general_tv == $const146$False_JustificationTruth)
              || (general_tv == $const153$JustifactionTruth)));
      } else if (pcase_var.eql($const152$DefaultFalse)) {
        return makeBoolean(((general_tv == $const146$False_JustificationTruth)
              || (general_tv == $const150$ArbitraryTruth_JustificationTruth)));
      } else if (pcase_var.eql($const146$False_JustificationTruth)) {
        return Equality.eq(general_tv, $const150$ArbitraryTruth_JustificationTruth);
      } else if (pcase_var.eql($const154$Unknown_JustificationTruth)) {
        return Equality.eq(general_tv, $const150$ArbitraryTruth_JustificationTruth);
      }
    }
    return NIL;
  }

  /** Accessor: @return booleanp; whether TV generalizes to *sbhl-tv* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 38811) 
  public static final SubLObject relevant_sbhl_tv_is_general_tv(SubLObject tv) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return sbhl_tv_generalizes_to_general_tvP(tv, $sbhl_tv$.getDynamicValue(thread));
    }
  }

  public static final class $relevant_sbhl_tv_is_general_tv$UnaryFunction extends UnaryFunction {
    public $relevant_sbhl_tv_is_general_tv$UnaryFunction() { super(extractFunctionNamed("RELEVANT-SBHL-TV-IS-GENERAL-TV")); }
    public SubLObject processItem(SubLObject arg1) { return relevant_sbhl_tv_is_general_tv(arg1); }
  }

  /** Accessor: @return booleanp; applies *relevant-sbhl-tv-function* to TV, or if no function is bound as default applies @see relevant-sbhl-tv-is-general-tv. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 38998) 
  public static final SubLObject relevant_sbhl_tvP(SubLObject tv) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ((NIL != $relevant_sbhl_tv_function$.getDynamicValue(thread)) ? ((SubLObject) Functions.funcall($relevant_sbhl_tv_function$.getDynamicValue(thread), tv)) : relevant_sbhl_tv_is_general_tv(tv));
    }
  }

  /** Accessor: @return booleanp; whether TV generalizes to #$True-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv? */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 39328) 
  public static final SubLObject sbhl_true_tv_p(SubLObject tv) {
    return sbhl_tv_generalizes_to_general_tvP(tv, $const145$True_JustificationTruth);
  }

  /** Accessor: @return booleanp; whether TV generalizes to #$False-JustificationTruth. @see sbhl-tv-generalizes-to-general-tv? */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 39567) 
  public static final SubLObject sbhl_false_tv_p(SubLObject tv) {
    return sbhl_tv_generalizes_to_general_tvP(tv, $const146$False_JustificationTruth);
  }

  /** Accessor: @return sbhl-search-truth-value-p; the truth value with same strength and opposite truth from TV. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 39809) 
  public static final SubLObject sbhl_opposite_tv(SubLObject tv) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject pcase_var = tv;
        if (pcase_var.eql($const147$MonotonicallyTrue)) {
          return $const151$MonotonicallyFalse;
        } else if (pcase_var.eql($const148$DefaultTrue)) {
          return $const152$DefaultFalse;
        } else if (pcase_var.eql($const151$MonotonicallyFalse)) {
          return $const147$MonotonicallyTrue;
        } else if (pcase_var.eql($const152$DefaultFalse)) {
          return $const148$DefaultTrue;
        } else if (pcase_var.eql($const145$True_JustificationTruth)) {
          return $const146$False_JustificationTruth;
        } else if (pcase_var.eql($const146$False_JustificationTruth)) {
          return $const145$True_JustificationTruth;
        } else if (pcase_var.eql($const150$ArbitraryTruth_JustificationTruth)) {
          return $const150$ArbitraryTruth_JustificationTruth;
        } else {
          if ((NIL != sbhl_paranoia.sbhl_object_type_checking_p())) {
            if ((NIL == sbhl_search_truth_value_p(tv))) {
              {
                SubLObject pcase_var_1 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                if (pcase_var_1.eql($kw155$ERROR)) {
                  sbhl_paranoia.sbhl_error(ONE_INTEGER, $str156$_A_is_not_a__A, tv, $sym157$SBHL_SEARCH_TRUTH_VALUE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else if (pcase_var_1.eql($kw158$CERROR)) {
                  Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2226");
                } else if (pcase_var_1.eql($kw160$WARN)) {
                  Errors.warn($str156$_A_is_not_a__A, tv, $sym157$SBHL_SEARCH_TRUTH_VALUE_P);
                } else {
                  Errors.warn($str161$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                  Errors.cerror($str159$continue_anyway, $str156$_A_is_not_a__A, tv, $sym157$SBHL_SEARCH_TRUTH_VALUE_P);
                }
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** Accessor: @return sbhl-search-truth-value-p; the true truth value with same strength as TV */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 40459) 
  public static final SubLObject sbhl_true_tv(SubLObject tv) {
    if ((NIL != sbhl_true_tv_p(tv))) {
      return tv;
    } else if ((NIL != sbhl_false_tv_p(tv))) {
      return sbhl_opposite_tv(tv);
    } else {
      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str162$Expected_true_or_false_sbhl_truth, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** Accessor: @return sbhl-search-truth-value-p; the false truth value with same strength as TV */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 40780) 
  public static final SubLObject sbhl_false_tv(SubLObject tv) {
    if ((NIL != sbhl_false_tv_p(tv))) {
      return tv;
    } else if ((NIL != sbhl_true_tv_p(tv))) {
      return sbhl_opposite_tv(tv);
    } else {
      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str162$Expected_true_or_false_sbhl_truth, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }
    return NIL;
  }

  /** Accessor: @return sbhl-search-truth-value-p; the true truth value with same strength as *sbhl-tv* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 41103) 
  public static final SubLObject sbhl_search_true_tv() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return sbhl_true_tv($sbhl_tv$.getDynamicValue(thread));
    }
  }

  /** Accessor: @return sbhl-search-truth-value-p; the false truth value with same strength as *sbhl-tv* */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 41281) 
  public static final SubLObject sbhl_search_false_tv() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return sbhl_false_tv($sbhl_tv$.getDynamicValue(thread));
    }
  }

  /** Accessor. @return keywordp; the keyword associated with TV, either :true or :false. */
  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 41464) 
  public static final SubLObject sbhl_translate_to_old_tv(SubLObject tv) {
    if ((NIL != sbhl_true_tv_p(tv))) {
      return $kw163$TRUE;
    } else if ((NIL != sbhl_false_tv_p(tv))) {
      return $kw164$FALSE;
    } else {
      sbhl_paranoia.sbhl_error(ONE_INTEGER, $str165$unknown_truth_value_for_translati, tv, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      return NIL;
    }
  }

  @SubL(source = "cycl/sbhl/sbhl-search-vars.lisp", position = 41771) 
  public static final SubLObject sbhl_possibly_translate_tv(SubLObject tv) {
    if ((!(((tv == $kw163$TRUE)
          || (tv == $kw164$FALSE))))) {
      return sbhl_translate_to_old_tv(tv);
    }
    return tv;
  }

  public static final SubLObject declare_sbhl_search_vars_file() {
    //declareMacro(myName, "initialize_sbhl_search", "INITIALIZE-SBHL-SEARCH");
    //declareMacro(myName, "initialize_sbhl_search_wXo_spaces", "INITIALIZE-SBHL-SEARCH-W/O-SPACES");
    //declareMacro(myName, "with_sbhl_forward_true_conditions", "WITH-SBHL-FORWARD-TRUE-CONDITIONS");
    //declareMacro(myName, "with_sbhl_backward_true_conditions", "WITH-SBHL-BACKWARD-TRUE-CONDITIONS");
    //declareMacro(myName, "with_sbhl_forward_false_conditions", "WITH-SBHL-FORWARD-FALSE-CONDITIONS");
    //declareMacro(myName, "with_sbhl_backward_false_conditions", "WITH-SBHL-BACKWARD-FALSE-CONDITIONS");
    //declareMacro(myName, "with_sbhl_forward_true_search", "WITH-SBHL-FORWARD-TRUE-SEARCH");
    //declareMacro(myName, "with_sbhl_backward_true_search", "WITH-SBHL-BACKWARD-TRUE-SEARCH");
    //declareMacro(myName, "with_sbhl_forward_false_search", "WITH-SBHL-FORWARD-FALSE-SEARCH");
    //declareMacro(myName, "with_sbhl_backward_false_search", "WITH-SBHL-BACKWARD-FALSE-SEARCH");
    //declareMacro(myName, "with_sbhl_forward_true_subsearch", "WITH-SBHL-FORWARD-TRUE-SUBSEARCH");
    //declareMacro(myName, "with_sbhl_backward_true_subsearch", "WITH-SBHL-BACKWARD-TRUE-SUBSEARCH");
    //declareMacro(myName, "with_sbhl_forward_false_subsearch", "WITH-SBHL-FORWARD-FALSE-SUBSEARCH");
    //declareMacro(myName, "with_sbhl_backward_false_subsearch", "WITH-SBHL-BACKWARD-FALSE-SUBSEARCH");
    //declareFunction(myName, "sbhl_search_type_p", "SBHL-SEARCH-TYPE-P", 1, 0, false);
    declareFunction(myName, "get_sbhl_search_type", "GET-SBHL-SEARCH-TYPE", 0, 0, false);
    //declareMacro(myName, "with_sbhl_search_type", "WITH-SBHL-SEARCH-TYPE");
    //declareMacro(myName, "with_sbhl_closure_search", "WITH-SBHL-CLOSURE-SEARCH");
    //declareMacro(myName, "with_sbhl_boolean_search", "WITH-SBHL-BOOLEAN-SEARCH");
    //declareMacro(myName, "with_sbhl_what_mts_search", "WITH-SBHL-WHAT-MTS-SEARCH");
    //declareFunction(myName, "sbhl_closure_search_p", "SBHL-CLOSURE-SEARCH-P", 0, 0, false);
    declareFunction(myName, "sbhl_boolean_search_p", "SBHL-BOOLEAN-SEARCH-P", 0, 0, false);
    //declareFunction(myName, "sbhl_what_mts_search_p", "SBHL-WHAT-MTS-SEARCH-P", 0, 0, false);
    //declareFunction(myName, "sbhl_goal_search_p", "SBHL-GOAL-SEARCH-P", 0, 0, false);
    declareFunction(myName, "sbhl_justification_search_p", "SBHL-JUSTIFICATION-SEARCH-P", 0, 0, false);
    //declareMacro(myName, "with_sbhl_justification_search", "WITH-SBHL-JUSTIFICATION-SEARCH");
    //declareMacro(myName, "without_sbhl_justification_search", "WITHOUT-SBHL-JUSTIFICATION-SEARCH");
    declareFunction(myName, "get_sbhl_search_behavior", "GET-SBHL-SEARCH-BEHAVIOR", 0, 0, false);
    //declareMacro(myName, "with_sbhl_search_behavior", "WITH-SBHL-SEARCH-BEHAVIOR");
    declareFunction(myName, "get_sbhl_just_behavior", "GET-SBHL-JUST-BEHAVIOR", 0, 0, false);
    //declareMacro(myName, "with_sbhl_justification_behavior", "WITH-SBHL-JUSTIFICATION-BEHAVIOR");
    //declareMacro(myName, "possibly_with_sbhl_justification_behavior", "POSSIBLY-WITH-SBHL-JUSTIFICATION-BEHAVIOR");
    //declareMacro(myName, "with_sbhl_assertion_justifications", "WITH-SBHL-ASSERTION-JUSTIFICATIONS");
    //declareMacro(myName, "with_sbhl_verbose_justifications", "WITH-SBHL-VERBOSE-JUSTIFICATIONS");
    //declareMacro(myName, "with_sbhl_old_justifications", "WITH-SBHL-OLD-JUSTIFICATIONS");
    //declareMacro(myName, "with_sbhl_justification_default", "WITH-SBHL-JUSTIFICATION-DEFAULT");
    //declareFunction(myName, "sbhl_justification_behavior_defaults_old", "SBHL-JUSTIFICATION-BEHAVIOR-DEFAULTS-OLD", 0, 0, false);
    //declareFunction(myName, "sbhl_justification_defaulted_old_p", "SBHL-JUSTIFICATION-DEFAULTED-OLD-P", 0, 0, false);
    //declareFunction(myName, "sbhl_justification_assembled", "SBHL-JUSTIFICATION-ASSEMBLED", 0, 0, false);
    //declareMacro(myName, "with_sbhl_justification_unassembled", "WITH-SBHL-JUSTIFICATION-UNASSEMBLED");
    declareFunction(myName, "sbhl_justification_assembled_p", "SBHL-JUSTIFICATION-ASSEMBLED-P", 0, 0, false);
    declareFunction(myName, "sbhl_unmarking_search_p", "SBHL-UNMARKING-SEARCH-P", 0, 0, false);
    //declareMacro(myName, "with_sbhl_unmarking_search", "WITH-SBHL-UNMARKING-SEARCH");
    //declareMacro(myName, "without_sbhl_unmarking_search", "WITHOUT-SBHL-UNMARKING-SEARCH");
    declareFunction(myName, "get_sbhl_search_module", "GET-SBHL-SEARCH-MODULE", 0, 0, false);
    declareFunction(myName, "get_sbhl_search_module_type", "GET-SBHL-SEARCH-MODULE-TYPE", 0, 0, false);
    declareFunction(myName, "get_sbhl_search_add_node_test", "GET-SBHL-SEARCH-ADD-NODE-TEST", 0, 0, false);
    declareFunction(myName, "get_sbhl_search_add_unmarked_node_test", "GET-SBHL-SEARCH-ADD-UNMARKED-NODE-TEST", 0, 0, false);
    //declareFunction(myName, "get_sbhl_search_gather_module", "GET-SBHL-SEARCH-GATHER-MODULE", 0, 0, false);
    //declareFunction(myName, "get_sbhl_disjoins_search_gather_module", "GET-SBHL-DISJOINS-SEARCH-GATHER-MODULE", 0, 0, false);
    //declareMacro(myName, "with_sbhl_search_module", "WITH-SBHL-SEARCH-MODULE");
    declareFunction(myName, "genl_inverse_mode_p", "GENL-INVERSE-MODE-P", 0, 0, false);
    declareFunction(myName, "not_genl_inverse_mode_p", "NOT-GENL-INVERSE-MODE-P", 0, 0, false);
    //declareMacro(myName, "with_new_sbhl_predicate_mode_scope", "WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");
    //declareMacro(myName, "with_sbhl_predicate_mode", "WITH-SBHL-PREDICATE-MODE");
    //declareMacro(myName, "with_genl_inverse_mode", "WITH-GENL-INVERSE-MODE");
    //declareMacro(myName, "sbhl_update_genl_inverse_mode", "SBHL-UPDATE-GENL-INVERSE-MODE");
    //declareMacro(myName, "possibly_flip_genl_inverse_mode", "POSSIBLY-FLIP-GENL-INVERSE-MODE");
    //declareMacro(myName, "possibly_premark_with_genl_inverse_mode", "POSSIBLY-PREMARK-WITH-GENL-INVERSE-MODE");
    //declareMacro(myName, "flip_genl_inverse_mode", "FLIP-GENL-INVERSE-MODE");
    declareFunction(myName, "sbhl_module_flips_inverse_mode_p", "SBHL-MODULE-FLIPS-INVERSE-MODE-P", 0, 1, false);
    declareFunction(myName, "flip_genl_inverse_modeP", "FLIP-GENL-INVERSE-MODE?", 0, 2, false);
    //declareMacro(myName, "with_initialized_unmarking_sbhl_marking_module", "WITH-INITIALIZED-UNMARKING-SBHL-MARKING-MODULE");
    declareFunction(myName, "sbhl_forward_search_direction_p", "SBHL-FORWARD-SEARCH-DIRECTION-P", 1, 0, false);
    declareFunction(myName, "get_sbhl_forward_search_direction", "GET-SBHL-FORWARD-SEARCH-DIRECTION", 0, 0, false);
    declareFunction(myName, "sbhl_backward_search_direction_p", "SBHL-BACKWARD-SEARCH-DIRECTION-P", 1, 0, false);
    declareFunction(myName, "get_sbhl_backward_search_direction", "GET-SBHL-BACKWARD-SEARCH-DIRECTION", 0, 0, false);
    declareFunction(myName, "get_sbhl_search_direction", "GET-SBHL-SEARCH-DIRECTION", 0, 0, false);
    //declareMacro(myName, "with_sbhl_search_direction", "WITH-SBHL-SEARCH-DIRECTION");
    //declareMacro(myName, "with_sbhl_forward_search_direction", "WITH-SBHL-FORWARD-SEARCH-DIRECTION");
    //declareMacro(myName, "with_sbhl_backward_search_direction", "WITH-SBHL-BACKWARD-SEARCH-DIRECTION");
    declareFunction(myName, "sbhl_forward_search_p", "SBHL-FORWARD-SEARCH-P", 0, 0, false);
    declareFunction(myName, "sbhl_backward_search_p", "SBHL-BACKWARD-SEARCH-P", 0, 0, false);
    //declareFunction(myName, "get_sbhl_search_index_arg", "GET-SBHL-SEARCH-INDEX-ARG", 0, 0, false);
    //declareFunction(myName, "get_sbhl_search_gather_arg", "GET-SBHL-SEARCH-GATHER-ARG", 0, 0, false);
    //declareMacro(myName, "bind_sbhl_search_index_arg", "BIND-SBHL-SEARCH-INDEX-ARG");
    declareFunction(myName, "get_sbhl_map_function", "GET-SBHL-MAP-FUNCTION", 0, 0, false);
    //declareMacro(myName, "with_sbhl_map_function", "WITH-SBHL-MAP-FUNCTION");
    declareFunction(myName, "get_sbhl_unwind_function", "GET-SBHL-UNWIND-FUNCTION", 0, 0, false);
    //declareMacro(myName, "with_sbhl_unwind_function", "WITH-SBHL-UNWIND-FUNCTION");
    declareFunction(myName, "sbhl_apply_unwind_function_p", "SBHL-APPLY-UNWIND-FUNCTION-P", 0, 0, false);
    declareFunction(myName, "sbhl_toggle_unwind_function_on", "SBHL-TOGGLE-UNWIND-FUNCTION-ON", 0, 0, false);
    //declareFunction(myName, "sbhl_toggle_unwind_function_off", "SBHL-TOGGLE-UNWIND-FUNCTION-OFF", 0, 0, false);
    //declareMacro(myName, "with_sbhl_unwind_function_on", "WITH-SBHL-UNWIND-FUNCTION-ON");
    //declareMacro(myName, "with_sbhl_unwind_function_off", "WITH-SBHL-UNWIND-FUNCTION-OFF");
    //declareFunction(myName, "get_sbhl_search_parent_marking", "GET-SBHL-SEARCH-PARENT-MARKING", 0, 0, false);
    declareFunction(myName, "set_sbhl_search_parent_marking", "SET-SBHL-SEARCH-PARENT-MARKING", 1, 0, false);
    //declareMacro(myName, "reset_sbhl_search_parent_marking", "RESET-SBHL-SEARCH-PARENT-MARKING");
    //declareMacro(myName, "dynamically_rebind_sbhl_search_parent_marking", "DYNAMICALLY-REBIND-SBHL-SEARCH-PARENT-MARKING");
    //declareMacro(myName, "with_new_sbhl_previous_marking", "WITH-NEW-SBHL-PREVIOUS-MARKING");
    //declareFunction(myName, "get_sbhl_nodes_previous_marking", "GET-SBHL-NODES-PREVIOUS-MARKING", 0, 0, false);
    //declareMacro(myName, "with_new_sbhl_finished", "WITH-NEW-SBHL-FINISHED");
    declareFunction(myName, "sbhl_finished_with_goal", "SBHL-FINISHED-WITH-GOAL", 0, 0, false);
    //declareFunction(myName, "sbhl_finished_with_cutoff", "SBHL-FINISHED-WITH-CUTOFF", 0, 0, false);
    declareFunction(myName, "sbhl_stop_search_path_p", "SBHL-STOP-SEARCH-PATH-P", 0, 0, false);
    declareFunction(myName, "sbhl_stop_search_path", "SBHL-STOP-SEARCH-PATH", 0, 0, false);
    //declareFunction(myName, "sbhl_continue_search_path", "SBHL-CONTINUE-SEARCH-PATH", 0, 0, false);
    //declareMacro(myName, "with_new_sbhl_stop_search_path", "WITH-NEW-SBHL-STOP-SEARCH-PATH");
    //declareFunction(myName, "sbhl_target_node_p", "SBHL-TARGET-NODE-P", 1, 0, false);
    //declareMacro(myName, "with_sbhl_target_node", "WITH-SBHL-TARGET-NODE");
    declareFunction(myName, "sbhl_goal_node_p", "SBHL-GOAL-NODE-P", 1, 0, false);
    //declareMacro(myName, "with_sbhl_goal_node", "WITH-SBHL-GOAL-NODE");
    declareFunction(myName, "get_sbhl_goal_node", "GET-SBHL-GOAL-NODE", 0, 0, false);
    //declareFunction(myName, "sbhl_node_isa_goal_node_p", "SBHL-NODE-ISA-GOAL-NODE-P", 1, 0, false);
    declareFunction(myName, "get_sbhl_goal_nodes", "GET-SBHL-GOAL-NODES", 0, 0, false);
    //declareMacro(myName, "with_sbhl_goal_nodes", "WITH-SBHL-GOAL-NODES");
    //declareMacro(myName, "with_sbhl_isaP_goal", "WITH-SBHL-ISA?-GOAL");
    //declareFunction(myName, "get_sbhl_isaP_goal", "GET-SBHL-ISA?-GOAL", 0, 0, false);
    //declareMacro(myName, "with_sbhl_result", "WITH-SBHL-RESULT");
    //declareMacro(myName, "with_sbhl_just_result", "WITH-SBHL-JUST-RESULT");
    declareFunction(myName, "get_sbhl_consider_node_fn", "GET-SBHL-CONSIDER-NODE-FN", 0, 0, false);
    //declareMacro(myName, "with_sbhl_consider_node_fn", "WITH-SBHL-CONSIDER-NODE-FN");
    declareFunction(myName, "get_sbhl_compose_fn", "GET-SBHL-COMPOSE-FN", 0, 0, false);
    //declareMacro(myName, "with_sbhl_compose_fn", "WITH-SBHL-COMPOSE-FN");
    //declareFunction(myName, "get_sbhl_combine_fn", "GET-SBHL-COMBINE-FN", 0, 0, false);
    //declareMacro(myName, "with_sbhl_combine_fn", "WITH-SBHL-COMBINE-FN");
    //declareFunction(myName, "get_sbhl_map_test_fn", "GET-SBHL-MAP-TEST-FN", 0, 0, false);
    //declareMacro(myName, "with_sbhl_map_test_fn", "WITH-SBHL-MAP-TEST-FN");
    //declareMacro(myName, "reset_sbhl_accessed_gather_nodes", "RESET-SBHL-ACCESSED-GATHER-NODES");
    //declareMacro(myName, "with_sbhl_dependents_cut_node", "WITH-SBHL-DEPENDENTS-CUT-NODE");
    //declareFunction(myName, "sbhl_dependents_cut_node_p", "SBHL-DEPENDENTS-CUT-NODE-P", 1, 0, false);
    //declareMacro(myName, "with_sbhl_access_arg", "WITH-SBHL-ACCESS-ARG");
    //declareMacro(myName, "with_sbhl_referent", "WITH-SBHL-REFERENT");
    //declareMacro(myName, "with_new_sbhl_leaf_queue", "WITH-NEW-SBHL-LEAF-QUEUE");
    //declareMacro(myName, "with_sbhl_sample_leaf_queues", "WITH-SBHL-SAMPLE-LEAF-QUEUES");
    declareFunction(myName, "sbhl_leaf_sample_search_p", "SBHL-LEAF-SAMPLE-SEARCH-P", 0, 0, false);
    //declareMacro(myName, "do_sbhl_sample_leaf_queues", "DO-SBHL-SAMPLE-LEAF-QUEUES");
    //declareFunction(myName, "sbhl_extremal_test_fn_p", "SBHL-EXTREMAL-TEST-FN-P", 1, 0, false);
    //declareMacro(myName, "with_sbhl_extremal_test_fn", "WITH-SBHL-EXTREMAL-TEST-FN");
    declareFunction(myName, "sbhl_check_for_goal_marking_p", "SBHL-CHECK-FOR-GOAL-MARKING-P", 0, 0, false);
    //declareMacro(myName, "with_sbhl_search_termination_on_previous_successes", "WITH-SBHL-SEARCH-TERMINATION-ON-PREVIOUS-SUCCESSES");
    //declareMacro(myName, "with_sbhl_precomputed_goal_space", "WITH-SBHL-PRECOMPUTED-GOAL-SPACE");
    //declareMacro(myName, "with_sbhl_true_search", "WITH-SBHL-TRUE-SEARCH");
    //declareMacro(myName, "with_sbhl_false_search", "WITH-SBHL-FALSE-SEARCH");
    declareFunction(myName, "sbhl_true_search_p", "SBHL-TRUE-SEARCH-P", 0, 0, false);
    //declareFunction(myName, "sbhl_false_search_p", "SBHL-FALSE-SEARCH-P", 0, 0, false);
    declareFunction(myName, "sbhl_search_truth_value_p", "SBHL-SEARCH-TRUTH-VALUE-P", 1, 0, false);
    declareFunction(myName, "get_sbhl_true_tv", "GET-SBHL-TRUE-TV", 0, 0, false);
    declareFunction(myName, "get_sbhl_false_tv", "GET-SBHL-FALSE-TV", 0, 0, false);
    declareFunction(myName, "get_sbhl_tv", "GET-SBHL-TV", 0, 0, false);
    //declareFunction(myName, "relevant_sbhl_tv_is_everything", "RELEVANT-SBHL-TV-IS-EVERYTHING", 1, 0, false);
    declareFunction(myName, "sbhl_tv_generalizes_to_general_tvP", "SBHL-TV-GENERALIZES-TO-GENERAL-TV?", 2, 0, false);
    declareFunction(myName, "relevant_sbhl_tv_is_general_tv", "RELEVANT-SBHL-TV-IS-GENERAL-TV", 1, 0, false); new $relevant_sbhl_tv_is_general_tv$UnaryFunction();
    declareFunction(myName, "relevant_sbhl_tvP", "RELEVANT-SBHL-TV?", 1, 0, false);
    declareFunction(myName, "sbhl_true_tv_p", "SBHL-TRUE-TV-P", 1, 0, false);
    declareFunction(myName, "sbhl_false_tv_p", "SBHL-FALSE-TV-P", 1, 0, false);
    declareFunction(myName, "sbhl_opposite_tv", "SBHL-OPPOSITE-TV", 1, 0, false);
    declareFunction(myName, "sbhl_true_tv", "SBHL-TRUE-TV", 1, 0, false);
    declareFunction(myName, "sbhl_false_tv", "SBHL-FALSE-TV", 1, 0, false);
    declareFunction(myName, "sbhl_search_true_tv", "SBHL-SEARCH-TRUE-TV", 0, 0, false);
    declareFunction(myName, "sbhl_search_false_tv", "SBHL-SEARCH-FALSE-TV", 0, 0, false);
    declareFunction(myName, "sbhl_translate_to_old_tv", "SBHL-TRANSLATE-TO-OLD-TV", 1, 0, false);
    declareFunction(myName, "sbhl_possibly_translate_tv", "SBHL-POSSIBLY-TRANSLATE-TV", 1, 0, false);
    //declareFunction(myName, "sbhl_truth_to_support_truth", "SBHL-TRUTH-TO-SUPPORT-TRUTH", 1, 0, false);
    //declareFunction(myName, "support_truth_to_sbhl_truth", "SUPPORT-TRUTH-TO-SBHL-TRUTH", 1, 0, false);
    //declareMacro(myName, "with_sbhl_tv_function", "WITH-SBHL-TV-FUNCTION");
    //declareMacro(myName, "with_sbhl_tv", "WITH-SBHL-TV");
    //declareMacro(myName, "with_all_sbhl_tvs", "WITH-ALL-SBHL-TVS");
    //declareMacro(myName, "with_general_sbhl_tv", "WITH-GENERAL-SBHL-TV");
    //declareMacro(myName, "with_just_sbhl_tv", "WITH-JUST-SBHL-TV");
    //declareMacro(myName, "possibly_with_sbhl_tv", "POSSIBLY-WITH-SBHL-TV");
    //declareMacro(myName, "possibly_with_sbhl_true_tv", "POSSIBLY-WITH-SBHL-TRUE-TV");
    //declareMacro(myName, "possibly_with_sbhl_false_tv", "POSSIBLY-WITH-SBHL-FALSE-TV");
    //declareMacro(myName, "possibly_with_sbhl_mt_relevance", "POSSIBLY-WITH-SBHL-MT-RELEVANCE");
    return NIL;
  }

  public static final SubLObject init_sbhl_search_vars_file() {
    $sbhl_search_types$ = defparameter("*SBHL-SEARCH-TYPES*", $list22);
    $sbhl_search_type$ = defparameter("*SBHL-SEARCH-TYPE*", NIL);
    $sbhl_justification_search_p$ = defparameter("*SBHL-JUSTIFICATION-SEARCH-P*", NIL);
    $sbhl_search_behavior$ = defparameter("*SBHL-SEARCH-BEHAVIOR*", NIL);
    $sbhl_justification_behavior$ = defparameter("*SBHL-JUSTIFICATION-BEHAVIOR*", $kw36$OLD);
    $sbhl_justification_defaulted_old$ = defparameter("*SBHL-JUSTIFICATION-DEFAULTED-OLD*", NIL);
    $sbhl_justification_assembled_p$ = defparameter("*SBHL-JUSTIFICATION-ASSEMBLED-P*", NIL);
    $sbhl_unmarking_search_p$ = defparameter("*SBHL-UNMARKING-SEARCH-P*", NIL);
    $sbhl_search_module$ = defparameter("*SBHL-SEARCH-MODULE*", NIL);
    $sbhl_search_module_type$ = defparameter("*SBHL-SEARCH-MODULE-TYPE*", NIL);
    $sbhl_add_node_to_result_test$ = defparameter("*SBHL-ADD-NODE-TO-RESULT-TEST*", NIL);
    $sbhl_add_unmarked_node_to_result_test$ = defparameter("*SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST*", NIL);
    $genl_inverse_mode_p$ = defparameter("*GENL-INVERSE-MODE-P*", NIL);
    $sbhl_forward_search_direction$ = deflexical("*SBHL-FORWARD-SEARCH-DIRECTION*", $kw75$FORWARD);
    $sbhl_backward_search_direction$ = deflexical("*SBHL-BACKWARD-SEARCH-DIRECTION*", $kw76$BACKWARD);
    $sbhl_search_direction$ = defparameter("*SBHL-SEARCH-DIRECTION*", NIL);
    $sbhl_index_arg$ = defparameter("*SBHL-INDEX-ARG*", NIL);
    $sbhl_search_index_arg$ = defparameter("*SBHL-SEARCH-INDEX-ARG*", NIL);
    $sbhl_map_function$ = defparameter("*SBHL-MAP-FUNCTION*", NIL);
    $sbhl_unwind_function$ = defparameter("*SBHL-UNWIND-FUNCTION*", NIL);
    $sbhl_apply_unwind_function_p$ = defparameter("*SBHL-APPLY-UNWIND-FUNCTION-P*", NIL);
    $sbhl_search_parent_marking$ = defparameter("*SBHL-SEARCH-PARENT-MARKING*", NIL);
    $sbhl_nodes_previous_marking$ = defparameter("*SBHL-NODES-PREVIOUS-MARKING*", NIL);
    $sbhl_finishedP$ = defparameter("*SBHL-FINISHED?*", NIL);
    $sbhl_stop_search_pathP$ = defparameter("*SBHL-STOP-SEARCH-PATH?*", NIL);
    $sbhl_target_node$ = defparameter("*SBHL-TARGET-NODE*", NIL);
    $sbhl_goal_node$ = defparameter("*SBHL-GOAL-NODE*", NIL);
    $sbhl_goal_nodes$ = defparameter("*SBHL-GOAL-NODES*", NIL);
    $sbhl_isaP_goal$ = defparameter("*SBHL-ISA?-GOAL*", NIL);
    $sbhl_result$ = defparameter("*SBHL-RESULT*", NIL);
    $sbhl_justification_result$ = defparameter("*SBHL-JUSTIFICATION-RESULT*", NIL);
    $sbhl_consider_node_fn$ = defparameter("*SBHL-CONSIDER-NODE-FN*", NIL);
    $sbhl_compose_fn$ = defparameter("*SBHL-COMPOSE-FN*", NIL);
    $sbhl_combine_fn$ = defparameter("*SBHL-COMBINE-FN*", $sym108$NCONC);
    $sbhl_map_test_fn$ = defparameter("*SBHL-MAP-TEST-FN*", NIL);
    $sbhl_accessed_gather_nodes$ = defparameter("*SBHL-ACCESSED-GATHER-NODES*", NIL);
    $sbhl_dependents_cut_node$ = defparameter("*SBHL-DEPENDENTS-CUT-NODE*", NIL);
    $sbhl_access_arg$ = defparameter("*SBHL-ACCESS-ARG*", NIL);
    $sbhl_referent$ = defparameter("*SBHL-REFERENT*", NIL);
    $sbhl_current_leaf_queue$ = defparameter("*SBHL-CURRENT-LEAF-QUEUE*", NIL);
    $sbhl_sample_leaf_queues$ = defparameter("*SBHL-SAMPLE-LEAF-QUEUES*", NIL);
    $sbhl_extremal_test_fn$ = defparameter("*SBHL-EXTREMAL-TEST-FN*", NIL);
    $sbhl_check_for_goal_marking_p$ = defparameter("*SBHL-CHECK-FOR-GOAL-MARKING-P*", NIL);
    $sbhl_precomputed_goal_space$ = defparameter("*SBHL-PRECOMPUTED-GOAL-SPACE*", NIL);
    $infer_nat_sbhlP$ = defparameter("*INFER-NAT-SBHL?*", T);
    $sbhl_mapping_pred$ = defparameter("*SBHL-MAPPING-PRED*", NIL);
    $maximize_sbhl_resultP$ = defparameter("*MAXIMIZE-SBHL-RESULT?*", NIL);
    $minimize_sbhl_resultP$ = defparameter("*MINIMIZE-SBHL-RESULT?*", T);
    $sbhl_search_truth$ = defparameter("*SBHL-SEARCH-TRUTH*", NIL);
    $sbhl_search_truth_values$ = deflexical("*SBHL-SEARCH-TRUTH-VALUES*", $list144);
    $sbhl_true_tv$ = deflexical("*SBHL-TRUE-TV*", $const145$True_JustificationTruth);
    $sbhl_false_tv$ = deflexical("*SBHL-FALSE-TV*", $const146$False_JustificationTruth);
    $sbhl_tv$ = defparameter("*SBHL-TV*", $const145$True_JustificationTruth);
    $relevant_sbhl_tv_function$ = defparameter("*RELEVANT-SBHL-TV-FUNCTION*", NIL);
    return NIL;
  }

  public static final SubLObject setup_sbhl_search_vars_file() {
    // CVS_ID("Id: sbhl-search-vars.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$POSSIBLY_WITH_NEW_SBHL_SPACES = makeSymbol("POSSIBLY-WITH-NEW-SBHL-SPACES");
  public static final SubLSymbol $sym1$WITH_NEW_SBHL_FINISHED = makeSymbol("WITH-NEW-SBHL-FINISHED");
  public static final SubLSymbol $sym2$WITH_NEW_SBHL_STOP_SEARCH_PATH = makeSymbol("WITH-NEW-SBHL-STOP-SEARCH-PATH");
  public static final SubLSymbol $sym3$RESET_SBHL_SEARCH_PARENT_MARKING = makeSymbol("RESET-SBHL-SEARCH-PARENT-MARKING");
  public static final SubLSymbol $sym4$WITH_NEW_SBHL_PREVIOUS_MARKING = makeSymbol("WITH-NEW-SBHL-PREVIOUS-MARKING");
  public static final SubLSymbol $sym5$WITH_NEW_SBHL_PREDICATE_MODE_SCOPE = makeSymbol("WITH-NEW-SBHL-PREDICATE-MODE-SCOPE");
  public static final SubLSymbol $sym6$WITH_SBHL_READER_LOCK = makeSymbol("WITH-SBHL-READER-LOCK");
  public static final SubLSymbol $sym7$WITH_SBHL_TRUE_SEARCH = makeSymbol("WITH-SBHL-TRUE-SEARCH");
  public static final SubLSymbol $sym8$WITH_SBHL_FORWARD_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-FORWARD-SEARCH-DIRECTION");
  public static final SubLSymbol $sym9$WITH_SBHL_FORWARD_LINK_DIRECTION = makeSymbol("WITH-SBHL-FORWARD-LINK-DIRECTION");
  public static final SubLSymbol $sym10$WITH_SBHL_BACKWARD_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-BACKWARD-SEARCH-DIRECTION");
  public static final SubLSymbol $sym11$WITH_SBHL_BACKWARD_LINK_DIRECTION = makeSymbol("WITH-SBHL-BACKWARD-LINK-DIRECTION");
  public static final SubLSymbol $sym12$WITH_SBHL_FALSE_SEARCH = makeSymbol("WITH-SBHL-FALSE-SEARCH");
  public static final SubLList $list13 = list(makeSymbol("MT"), makeSymbol("TV"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym14$POSSIBLY_WITH_SBHL_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-SBHL-MT-RELEVANCE");
  public static final SubLSymbol $sym15$POSSIBLY_WITH_SBHL_TRUE_TV = makeSymbol("POSSIBLY-WITH-SBHL-TRUE-TV");
  public static final SubLSymbol $sym16$WITH_SBHL_FORWARD_TRUE_CONDITIONS = makeSymbol("WITH-SBHL-FORWARD-TRUE-CONDITIONS");
  public static final SubLSymbol $sym17$INITIALIZE_SBHL_SEARCH = makeSymbol("INITIALIZE-SBHL-SEARCH");
  public static final SubLSymbol $sym18$WITH_SBHL_BACKWARD_TRUE_CONDITIONS = makeSymbol("WITH-SBHL-BACKWARD-TRUE-CONDITIONS");
  public static final SubLSymbol $sym19$POSSIBLY_WITH_SBHL_FALSE_TV = makeSymbol("POSSIBLY-WITH-SBHL-FALSE-TV");
  public static final SubLSymbol $sym20$WITH_SBHL_FORWARD_FALSE_CONDITIONS = makeSymbol("WITH-SBHL-FORWARD-FALSE-CONDITIONS");
  public static final SubLSymbol $sym21$WITH_SBHL_BACKWARD_FALSE_CONDITIONS = makeSymbol("WITH-SBHL-BACKWARD-FALSE-CONDITIONS");
  public static final SubLList $list22 = list(makeKeyword("CLOSURE"), makeKeyword("BOOLEAN"), makeKeyword("WHAT-MTS"));
  public static final SubLList $list23 = list(makeSymbol("TYPE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym24$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym25$_SBHL_SEARCH_TYPE_ = makeSymbol("*SBHL-SEARCH-TYPE*");
  public static final SubLSymbol $sym26$WITH_SBHL_SEARCH_TYPE = makeSymbol("WITH-SBHL-SEARCH-TYPE");
  public static final SubLSymbol $kw27$CLOSURE = makeKeyword("CLOSURE");
  public static final SubLSymbol $kw28$BOOLEAN = makeKeyword("BOOLEAN");
  public static final SubLSymbol $kw29$WHAT_MTS = makeKeyword("WHAT-MTS");
  public static final SubLList $list30 = list(list(makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*"), T), list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL), list(makeSymbol("*SBHL-UNWIND-FUNCTION*"), list(makeSymbol("FIF"), list(makeSymbol("SBHL-TIME-SEARCH-P")), list(makeSymbol("QUOTE"), makeSymbol("SBHL-TEMPORAL-JUSTIFICATION-UNWIND")), list(makeSymbol("QUOTE"), makeSymbol("SBHL-PUSH-UNWIND-ONTO-RESULT")))));
  public static final SubLSymbol $sym31$WITHOUT_SBHL_CACHES = makeSymbol("WITHOUT-SBHL-CACHES");
  public static final SubLList $list32 = list(list(makeSymbol("*SBHL-JUSTIFICATION-SEARCH-P*"), NIL), list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL));
  public static final SubLSymbol $sym33$WITH_SBHL_CACHES = makeSymbol("WITH-SBHL-CACHES");
  public static final SubLList $list34 = list(makeSymbol("BEHAVIOR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym35$_SBHL_SEARCH_BEHAVIOR_ = makeSymbol("*SBHL-SEARCH-BEHAVIOR*");
  public static final SubLSymbol $kw36$OLD = makeKeyword("OLD");
  public static final SubLSymbol $sym37$_SBHL_JUSTIFICATION_BEHAVIOR_ = makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*");
  public static final SubLSymbol $sym38$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym39$BEHAVIOR = makeSymbol("BEHAVIOR");
  public static final SubLSymbol $sym40$PROGN = makeSymbol("PROGN");
  public static final SubLList $list41 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("ASSERTION")));
  public static final SubLList $list42 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("VERBOSE")));
  public static final SubLList $list43 = list(list(makeSymbol("*SBHL-JUSTIFICATION-BEHAVIOR*"), makeKeyword("OLD")));
  public static final SubLList $list44 = list(list(makeSymbol("*SBHL-JUSTIFICATION-DEFAULTED-OLD*"), NIL));
  public static final SubLList $list45 = list(list(makeSymbol("*SBHL-JUSTIFICATION-ASSEMBLED-P*"), NIL));
  public static final SubLList $list46 = list(list(makeSymbol("*SBHL-UNMARKING-SEARCH-P*"), T));
  public static final SubLList $list47 = list(list(makeSymbol("*SBHL-UNMARKING-SEARCH-P*"), NIL));
  public static final SubLString $str48$get_sbhl_search_module___sbhl_sea = makeString("get-sbhl-search-module: *sbhl-search-module* is unexpectedly null.");
  public static final SubLObject $const49$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLObject $const50$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLObject $const51$negationInverse = constant_handles.reader_make_constant_shell(makeString("negationInverse"));
  public static final SubLObject $const52$negationPreds = constant_handles.reader_make_constant_shell(makeString("negationPreds"));
  public static final SubLList $list53 = list(makeSymbol("MODULE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym54$_SBHL_SEARCH_MODULE_ = makeSymbol("*SBHL-SEARCH-MODULE*");
  public static final SubLSymbol $sym55$_SBHL_SEARCH_MODULE_TYPE_ = makeSymbol("*SBHL-SEARCH-MODULE-TYPE*");
  public static final SubLSymbol $sym56$GET_SBHL_MODULE_TYPE = makeSymbol("GET-SBHL-MODULE-TYPE");
  public static final SubLSymbol $sym57$_SBHL_ADD_NODE_TO_RESULT_TEST_ = makeSymbol("*SBHL-ADD-NODE-TO-RESULT-TEST*");
  public static final SubLSymbol $sym58$GET_SBHL_ADD_NODE_TO_RESULT_TEST = makeSymbol("GET-SBHL-ADD-NODE-TO-RESULT-TEST");
  public static final SubLSymbol $sym59$WITH_SBHL_MODULE = makeSymbol("WITH-SBHL-MODULE");
  public static final SubLList $list60 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), NIL));
  public static final SubLList $list61 = list(makeSymbol("MODE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym62$_GENL_INVERSE_MODE_P_ = makeSymbol("*GENL-INVERSE-MODE-P*");
  public static final SubLList $list63 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), T));
  public static final SubLList $list64 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(makeSymbol("SBHL-MODULE-FLIPS-INVERSE-MODE-P")), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*")), makeSymbol("*GENL-INVERSE-MODE-P*"))));
  public static final SubLList $list65 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(makeSymbol("FLIP-GENL-INVERSE-MODE?")), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*")), makeSymbol("*GENL-INVERSE-MODE-P*"))));
  public static final SubLList $list66 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("FIF"), list(EQ, list(makeSymbol("GET-SBHL-LINK-PRED"), list(makeSymbol("GET-SBHL-SEARCH-MODULE"))), constant_handles.reader_make_constant_shell(makeString("negationInverse"))), T, makeSymbol("*GENL-INVERSE-MODE-P*"))));
  public static final SubLList $list67 = list(list(makeSymbol("*GENL-INVERSE-MODE-P*"), list(makeSymbol("CNOT"), makeSymbol("*GENL-INVERSE-MODE-P*"))));
  public static final SubLList $list68 = list(makeSymbol("START-MARKING"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym69$PRED = makeUninternedSymbol("PRED");
  public static final SubLList $list70 = list(makeSymbol("SBHL-MODULE-INDICATES-PREDICATE-SEARCH-P"), list(makeSymbol("GET-SBHL-SEARCH-MODULE")));
  public static final SubLSymbol $sym71$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym72$_SBHL_ADD_UNMARKED_NODE_TO_RESULT_TEST_ = makeSymbol("*SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST*");
  public static final SubLSymbol $sym73$GET_SBHL_MODULE = makeSymbol("GET-SBHL-MODULE");
  public static final SubLList $list74 = list(constant_handles.reader_make_constant_shell(makeString("genlInverse")));
  public static final SubLSymbol $kw75$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $kw76$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLList $list77 = list(makeSymbol("DIRECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym78$_SBHL_SEARCH_DIRECTION_ = makeSymbol("*SBHL-SEARCH-DIRECTION*");
  public static final SubLSymbol $sym79$WITH_SBHL_SEARCH_DIRECTION = makeSymbol("WITH-SBHL-SEARCH-DIRECTION");
  public static final SubLList $list80 = list(makeSymbol("GET-SBHL-FORWARD-SEARCH-DIRECTION"));
  public static final SubLList $list81 = list(makeSymbol("GET-SBHL-BACKWARD-SEARCH-DIRECTION"));
  public static final SubLList $list82 = list(list(makeSymbol("*SBHL-SEARCH-INDEX-ARG*"), list(makeSymbol("FIF"), list(EQ, makeSymbol("*SBHL-SEARCH-DIRECTION*"), makeKeyword("FORWARD")), list(makeSymbol("GET-SBHL-INDEX-ARG"), list(makeSymbol("GET-SBHL-MODULE"))), list(makeSymbol("GET-SBHL-GATHER-ARG"), list(makeSymbol("GET-SBHL-MODULE"))))));
  public static final SubLList $list83 = list(makeSymbol("FUNCTION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym84$_SBHL_MAP_FUNCTION_ = makeSymbol("*SBHL-MAP-FUNCTION*");
  public static final SubLSymbol $sym85$_SBHL_UNWIND_FUNCTION_ = makeSymbol("*SBHL-UNWIND-FUNCTION*");
  public static final SubLList $list86 = list(list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), T));
  public static final SubLList $list87 = list(list(makeSymbol("*SBHL-APPLY-UNWIND-FUNCTION-P*"), NIL));
  public static final SubLList $list88 = list(list(makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), NIL));
  public static final SubLList $list89 = list(list(makeSymbol("*SBHL-SEARCH-PARENT-MARKING*"), makeSymbol("*SBHL-SEARCH-PARENT-MARKING*")));
  public static final SubLList $list90 = list(list(makeSymbol("*SBHL-NODES-PREVIOUS-MARKING*"), NIL));
  public static final SubLList $list91 = list(list(makeSymbol("*SBHL-FINISHED?*"), NIL));
  public static final SubLSymbol $kw92$GOAL = makeKeyword("GOAL");
  public static final SubLSymbol $kw93$CUTOFF = makeKeyword("CUTOFF");
  public static final SubLList $list94 = list(list(makeSymbol("*SBHL-STOP-SEARCH-PATH?*"), NIL));
  public static final SubLList $list95 = list(makeSymbol("NODE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym96$_SBHL_TARGET_NODE_ = makeSymbol("*SBHL-TARGET-NODE*");
  public static final SubLSymbol $sym97$_SBHL_GOAL_NODE_ = makeSymbol("*SBHL-GOAL-NODE*");
  public static final SubLList $list98 = list(makeSymbol("NODES"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym99$_SBHL_ISA__GOAL_ = makeSymbol("*SBHL-ISA?-GOAL*");
  public static final SubLList $list100 = list(makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list101 = list(makeSymbol("*SBHL-RESULT*"));
  public static final SubLSymbol $sym102$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym103$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list104 = list(makeSymbol("*SBHL-JUSTIFICATION-RESULT*"));
  public static final SubLList $list105 = list(makeSymbol("FN"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym106$_SBHL_CONSIDER_NODE_FN_ = makeSymbol("*SBHL-CONSIDER-NODE-FN*");
  public static final SubLSymbol $sym107$_SBHL_COMPOSE_FN_ = makeSymbol("*SBHL-COMPOSE-FN*");
  public static final SubLSymbol $sym108$NCONC = makeSymbol("NCONC");
  public static final SubLSymbol $sym109$_SBHL_COMBINE_FN_ = makeSymbol("*SBHL-COMBINE-FN*");
  public static final SubLSymbol $sym110$_SBHL_MAP_TEST_FN_ = makeSymbol("*SBHL-MAP-TEST-FN*");
  public static final SubLList $list111 = list(list(makeSymbol("*SBHL-ACCESSED-GATHER-NODES*"), NIL));
  public static final SubLSymbol $sym112$_SBHL_DEPENDENTS_CUT_NODE_ = makeSymbol("*SBHL-DEPENDENTS-CUT-NODE*");
  public static final SubLList $list113 = list(makeSymbol("ARG"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym114$_SBHL_ACCESS_ARG_ = makeSymbol("*SBHL-ACCESS-ARG*");
  public static final SubLList $list115 = list(makeSymbol("REF"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym116$_SBHL_REFERENT_ = makeSymbol("*SBHL-REFERENT*");
  public static final SubLList $list117 = list(list(makeSymbol("*SBHL-CURRENT-LEAF-QUEUE*"), list(makeSymbol("CREATE-QUEUE"))));
  public static final SubLSymbol $sym118$QUEUE = makeUninternedSymbol("QUEUE");
  public static final SubLSymbol $sym119$ENQUEUE = makeSymbol("ENQUEUE");
  public static final SubLList $list120 = list(list(makeSymbol("CREATE-QUEUE")));
  public static final SubLSymbol $sym121$_SBHL_SAMPLE_LEAF_QUEUES_ = makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*");
  public static final SubLSymbol $sym122$LIST = makeSymbol("LIST");
  public static final SubLList $list123 = list(list(makeSymbol("NODE-VAR"), makeSymbol("FOUND-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym124$QUEUE = makeUninternedSymbol("QUEUE");
  public static final SubLSymbol $sym125$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym126$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym127$CNOT = makeSymbol("CNOT");
  public static final SubLList $list128 = list(list(makeSymbol("FIRST"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*")));
  public static final SubLSymbol $sym129$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym130$QUEUE_ELEMENTS = makeSymbol("QUEUE-ELEMENTS");
  public static final SubLSymbol $sym131$WITH_NEW_SBHL_LEAF_QUEUE = makeSymbol("WITH-NEW-SBHL-LEAF-QUEUE");
  public static final SubLSymbol $sym132$RPLACD = makeSymbol("RPLACD");
  public static final SubLList $list133 = list(makeSymbol("LAST"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"));
  public static final SubLList $list134 = list(makeSymbol("*SBHL-CURRENT-LEAF-QUEUE*"));
  public static final SubLList $list135 = list(list(makeSymbol("CSETQ"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"), list(makeSymbol("CDR"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"))));
  public static final SubLSymbol $sym136$DEQUEUE = makeSymbol("DEQUEUE");
  public static final SubLList $list137 = list(list(makeSymbol("CSETQ"), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"), list(makeSymbol("REMOVE-IF"), list(makeSymbol("QUOTE"), makeSymbol("QUEUE-EMPTY-P")), makeSymbol("*SBHL-SAMPLE-LEAF-QUEUES*"))));
  public static final SubLSymbol $sym138$_SBHL_EXTREMAL_TEST_FN_ = makeSymbol("*SBHL-EXTREMAL-TEST-FN*");
  public static final SubLList $list139 = list(list(makeSymbol("*SBHL-CHECK-FOR-GOAL-MARKING-P*"), T));
  public static final SubLList $list140 = list(makeSymbol("GOAL-SPACE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym141$_SBHL_PRECOMPUTED_GOAL_SPACE_ = makeSymbol("*SBHL-PRECOMPUTED-GOAL-SPACE*");
  public static final SubLList $list142 = list(list(makeSymbol("*SBHL-SEARCH-TRUTH*"), constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"))));
  public static final SubLList $list143 = list(list(makeSymbol("*SBHL-SEARCH-TRUTH*"), constant_handles.reader_make_constant_shell(makeString("False-JustificationTruth"))));
  public static final SubLList $list144 = list(constant_handles.reader_make_constant_shell(makeString("MonotonicallyTrue")), constant_handles.reader_make_constant_shell(makeString("DefaultTrue")), constant_handles.reader_make_constant_shell(makeString("MonotonicallyFalse")), constant_handles.reader_make_constant_shell(makeString("DefaultFalse")), constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth")), constant_handles.reader_make_constant_shell(makeString("False-JustificationTruth")), constant_handles.reader_make_constant_shell(makeString("ArbitraryTruth-JustificationTruth")));
  public static final SubLObject $const145$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));
  public static final SubLObject $const146$False_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("False-JustificationTruth"));
  public static final SubLObject $const147$MonotonicallyTrue = constant_handles.reader_make_constant_shell(makeString("MonotonicallyTrue"));
  public static final SubLObject $const148$DefaultTrue = constant_handles.reader_make_constant_shell(makeString("DefaultTrue"));
  public static final SubLObject $const149$ArbitraryTruth_JustifactionTruth = constant_handles.reader_make_constant_shell(makeString("ArbitraryTruth-JustifactionTruth"));
  public static final SubLObject $const150$ArbitraryTruth_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("ArbitraryTruth-JustificationTruth"));
  public static final SubLObject $const151$MonotonicallyFalse = constant_handles.reader_make_constant_shell(makeString("MonotonicallyFalse"));
  public static final SubLObject $const152$DefaultFalse = constant_handles.reader_make_constant_shell(makeString("DefaultFalse"));
  public static final SubLObject $const153$JustifactionTruth = constant_handles.reader_make_constant_shell(makeString("JustifactionTruth"));
  public static final SubLObject $const154$Unknown_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("Unknown-JustificationTruth"));
  public static final SubLSymbol $kw155$ERROR = makeKeyword("ERROR");
  public static final SubLString $str156$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym157$SBHL_SEARCH_TRUTH_VALUE_P = makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P");
  public static final SubLSymbol $kw158$CERROR = makeKeyword("CERROR");
  public static final SubLString $str159$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw160$WARN = makeKeyword("WARN");
  public static final SubLString $str161$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str162$Expected_true_or_false_sbhl_truth = makeString("Expected true or false sbhl truth value. tv: ~a~%");
  public static final SubLSymbol $kw163$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw164$FALSE = makeKeyword("FALSE");
  public static final SubLString $str165$unknown_truth_value_for_translati = makeString("unknown truth value for translation: ~a");
  public static final SubLSymbol $kw166$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLSymbol $kw167$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $kw168$FALSE_MON = makeKeyword("FALSE-MON");
  public static final SubLSymbol $kw169$FALSE_DEF = makeKeyword("FALSE-DEF");
  public static final SubLString $str170$Cannot_translate__s_truth_to_an_s = makeString("Cannot translate ~s truth to an sbhl-tv");
  public static final SubLSymbol $sym171$_RELEVANT_SBHL_TV_FUNCTION_ = makeSymbol("*RELEVANT-SBHL-TV-FUNCTION*");
  public static final SubLList $list172 = list(makeSymbol("SBHL-TV"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym173$_SBHL_TV_ = makeSymbol("*SBHL-TV*");
  public static final SubLSymbol $sym174$WITH_SBHL_TV_FUNCTION = makeSymbol("WITH-SBHL-TV-FUNCTION");
  public static final SubLList $list175 = list(makeSymbol("FUNCTION"), makeSymbol("RELEVANT-SBHL-TV-IS-EVERYTHING"));
  public static final SubLList $list176 = list(makeSymbol("FUNCTION"), makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV"));
  public static final SubLSymbol $sym177$WITH_SBHL_TV = makeSymbol("WITH-SBHL-TV");
  public static final SubLList $list178 = list(makeSymbol("FUNCTION"), makeSymbol("RELEVANT-SBHL-TV-IS-EQ"));
  public static final SubLList $list179 = list(makeSymbol("TV"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym180$TV_VAR = makeUninternedSymbol("TV-VAR");
  public static final SubLSymbol $sym181$FIF = makeSymbol("FIF");
  public static final SubLList $list182 = list(makeSymbol("*SBHL-TV*"));
  public static final SubLList $list183 = list(list(makeSymbol("QUOTE"), makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV")), makeSymbol("*RELEVANT-SBHL-TV-FUNCTION*"));
  public static final SubLSymbol $sym184$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym185$SBHL_CHECK_TYPE = makeSymbol("SBHL-CHECK-TYPE");
  public static final SubLList $list186 = list(makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P"));
  public static final SubLSymbol $sym187$TV_VAR = makeUninternedSymbol("TV-VAR");
  public static final SubLList $list188 = list(list(makeSymbol("GET-SBHL-TRUE-TV")));
  public static final SubLList $list189 = list(makeSymbol("SBHL-TRUE-TV-P"));
  public static final SubLSymbol $sym190$TV_VAR = makeUninternedSymbol("TV-VAR");
  public static final SubLList $list191 = list(list(makeSymbol("GET-SBHL-FALSE-TV")));
  public static final SubLList $list192 = list(makeSymbol("SBHL-FALSE-TV-P"));
  public static final SubLList $list193 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym194$POSSIBLY_WITH_INFERENCE_MT_RELEVANCE = makeSymbol("POSSIBLY-WITH-INFERENCE-MT-RELEVANCE");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_search_vars_file();
  }

  public void initializeVariables() {
    init_sbhl_search_vars_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_search_vars_file();
  }

}
