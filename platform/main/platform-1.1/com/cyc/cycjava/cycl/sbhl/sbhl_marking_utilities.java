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
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;

public  final class sbhl_marking_utilities extends SubLTranslatedFile {

  //// Constructor

  private sbhl_marking_utilities() {}
  public static final SubLFile me = new sbhl_marking_utilities();
  public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities";

  //// Definitions

  /** Accessor: returns the marking state of NODE within SPACE / *sbhl-space* */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 831) 
  public static final SubLObject get_sbhl_marking_state(SubLObject node, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    return Hashtables.gethash_without_values(node, space, UNPROVIDED);
  }

  /** Accessor: returns NODE's current marking state (usually boolean). @see get-sbhl-marking-state. */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 1239) 
  public static final SubLObject sbhl_marked_with(SubLObject node, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    return get_sbhl_marking_state(node, space);
  }

  /** Accessor: @return booleanp; whether MARKING has a non-NIL marking state. */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 1790) 
  public static final SubLObject sbhl_marked_p(SubLObject marking) {
    return list_utilities.sublisp_boolean(marking);
  }

  /** Accessor: @return booleanp; whether MARKING indicates path termination for predicate search */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 5622) 
  public static final SubLObject sbhl_predicate_path_termination_p(SubLObject marking) {
    return ((NIL != sbhl_search_vars.genl_inverse_mode_p()) ? ((SubLObject) makeBoolean(((NIL != sbhl_marking_vars.genl_inverse_marking_p(marking))
              || (NIL != sbhl_marking_vars.genl_preds_and_genl_inverse_marking_p(marking))))) : makeBoolean(((NIL != sbhl_marking_vars.genl_preds_marking_p(marking))
            || (NIL != sbhl_marking_vars.genl_preds_and_genl_inverse_marking_p(marking)))));
  }

  /** Modifier: sets the hash slot for NODE in SPACE / *sbhl-space* to VALUE */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 6053) 
  public static final SubLObject set_sbhl_marking_state(SubLObject node, SubLObject value, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    Hashtables.sethash(node, space, value);
    return NIL;
  }

  /** Modifier: sets the hash slot for NODE in *sbhl-space* / SPACE to t. @see set-sbhl-marking-state */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 6390) 
  public static final SubLObject set_sbhl_marking_state_to_marked(SubLObject node, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    set_sbhl_marking_state(node, T, space);
    return NIL;
  }

  /** Modifier: sets the hash slot for NODE in *sbhl-space* to nil @see set-sbhl-marking-state */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 6663) 
  public static final SubLObject set_sbhl_marking_state_to_unmarked(SubLObject node, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    set_sbhl_marking_state(node, NIL, space);
    return NIL;
  }

  /** Modifier: adds either #$genlPreds or #$genlInverse to NODE's marking, depending on @see genl-inverse-mode-p */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 9996) 
  public static final SubLObject sbhl_predicate_marking_fn(SubLObject node, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    if ((NIL != sbhl_search_vars.genl_inverse_mode_p())) {
      genl_inverse_marking_fn(node, space);
    } else {
      genl_preds_marking_fn(node, space);
    }
    return NIL;
  }

  /** Modifier: adds #$genlPreds to NODE's marking. */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 10395) 
  public static final SubLObject genl_preds_marking_fn(SubLObject node, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    {
      SubLObject current_marking = sbhl_marked_with(node, space);
      if ((NIL == current_marking)) {
        set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue(), space);
      } else if ((current_marking == sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue())) {
        set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue(), space);
      }
    }
    return NIL;
  }

  /** Modifier: adds #$genlInverse to NODE's marking. */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 10969) 
  public static final SubLObject genl_inverse_marking_fn(SubLObject node, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    {
      SubLObject current_marking = sbhl_marked_with(node, UNPROVIDED);
      if ((NIL == current_marking)) {
        set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_inverse_marking$.getGlobalValue(), space);
      } else if ((current_marking == sbhl_marking_vars.$sbhl_genl_preds_marking$.getGlobalValue())) {
        set_sbhl_marking_state(node, sbhl_marking_vars.$sbhl_genl_preds_and_genl_inverse_marking$.getGlobalValue(), space);
      }
    }
    return NIL;
  }

  public static final class $sbhl_predicate_unmarking_fn$UnaryFunction extends UnaryFunction {
    public $sbhl_predicate_unmarking_fn$UnaryFunction() { super(extractFunctionNamed("SBHL-PREDICATE-UNMARKING-FN")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2086"); }
  }

  public static final class $sbhl_predicate_unmarking_fn$BinaryFunction extends BinaryFunction {
    public $sbhl_predicate_unmarking_fn$BinaryFunction() { super(extractFunctionNamed("SBHL-PREDICATE-UNMARKING-FN")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2087"); }
  }

  /** Accessor: applies *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 13807) 
  public static final SubLObject sbhl_search_path_termination_p(SubLObject node, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    if ((NIL != sbhl_search_vars.sbhl_check_for_goal_marking_p())) {
      if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2084"))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2088");
        return T;
      }
    }
    return sbhl_path_terminating_mark_p(node, space);
  }

  /** Accessor: applies *sbhl-module* defined path termination determining fn, @see get-sbhl-path-terminating-mark?-fn. Relies on current context of SPACE / *sbhl-space*. @see sbhl-marked-p */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 14576) 
  public static final SubLObject sbhl_path_terminating_mark_p(SubLObject node, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    {
      SubLObject path_terminating_markP_fn = sbhl_module_utilities.get_sbhl_path_terminating_markP_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
      SubLObject pcase_var = path_terminating_markP_fn;
      if (pcase_var.eql($sym11$SBHL_MARKED_P)) {
        return sbhl_marked_p(sbhl_marked_with(node, space));
      } else if (pcase_var.eql($sym12$SBHL_PREDICATE_PATH_TERMINATION_P)) {
        return sbhl_predicate_path_termination_p(sbhl_marked_with(node, space));
      } else if (pcase_var.eql($sym13$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2085");
      } else {
        return Functions.funcall(path_terminating_markP_fn, node);
      }
    }
  }

  /** Accessor: applies *sbhl-module* defined path-termination-function to NODE's marking within terminating space, @see get-sbhl-termingating-marking-space. */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 16001) 
  public static final SubLObject sbhl_marked_in_terminating_space_p(SubLObject node) {
    return sbhl_search_path_termination_p(node, sbhl_marking_vars.get_sbhl_terminating_marking_space());
  }

  /** Accessor: applies *sbhl-module* defined path-termination-function to NODE's marking within target space, @see *sbhl-target-space* */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 16302) 
  public static final SubLObject sbhl_marked_in_target_space_p(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return sbhl_search_path_termination_p(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
    }
  }

  public static final class $sbhl_marked_in_target_space_p$UnaryFunction extends UnaryFunction {
    public $sbhl_marked_in_target_space_p$UnaryFunction() { super(extractFunctionNamed("SBHL-MARKED-IN-TARGET-SPACE-P")); }
    public SubLObject processItem(SubLObject arg1) { return sbhl_marked_in_target_space_p(arg1); }
  }

  /** Modifier: applies *sbhl-module* defined marking fn, @see get-sbhl-marking-fn. Relies on current context of *sbhl-space*, and gets search node from SEARCH-STATE as necessary (@see set-sbhl-marking-state-to-marked). */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 16559) 
  public static final SubLObject sbhl_mark_node_marked(SubLObject node, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    {
      SubLObject marking_fn = sbhl_module_utilities.get_sbhl_marking_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
      SubLObject pcase_var = marking_fn;
      if (pcase_var.eql($sym14$SET_SBHL_MARKING_STATE_TO_MARKED)) {
        set_sbhl_marking_state_to_marked(node, space);
      } else if (pcase_var.eql($sym15$SBHL_PREDICATE_MARKING_FN)) {
        sbhl_predicate_marking_fn(node, space);
      } else if (pcase_var.eql($sym16$INCREMENT_SBHL_MARKING_STATE_BY_ZERO)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2067");
      } else if (pcase_var.eql($sym17$INCREMENT_SBHL_MARKING_STATE_BY_ONE)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2065");
      } else if (pcase_var.eql($sym18$INCREMENT_SBHL_MARKING_STATE_BY_TWO)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2066");
      } else if (pcase_var.eql($sym19$INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2064");
      } else {
        Functions.funcall(marking_fn, node);
      }
    }
    return NIL;
  }

  /** Modifier: applies *sbhl-module* defined unmarking fn, @see get-sbhl-unmarking-fn. Relies on current context of *sbhl-space*, and gets search node from SEARCH-STATE as necessary (@see set-sbhl-marking-state-to-unmarked). */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 17633) 
  public static final SubLObject sbhl_mark_node_unmarked(SubLObject node, SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    {
      SubLObject unmarking_fn = sbhl_module_utilities.get_sbhl_unmarking_fn(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
      SubLObject pcase_var = unmarking_fn;
      if (pcase_var.eql($sym20$SET_SBHL_MARKING_STATE_TO_UNMARKED)) {
        set_sbhl_marking_state_to_unmarked(node, space);
      } else if (pcase_var.eql($sym21$GENL_PREDS_UNMARKING_FN)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2059");
      } else if (pcase_var.eql($sym22$GENL_INVERSE_UNMARKING_FN)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2056");
      } else {
        Functions.funcall(unmarking_fn, node);
      }
    }
    return NIL;
  }

  /** Modifier: marks each of NODES in @see *sbhl-target-space* */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 25963) 
  public static final SubLObject sbhl_mark_nodes_in_target_space(SubLObject nodes) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cdolist_list_var = nodes;
        SubLObject node = NIL;
        for (node = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
          sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
        }
      }
      return NIL;
    }
  }

  /** Modifier: marks each of NODES in @see *sbhl-target-space* */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 26175) 
  public static final SubLObject sbhl_mark_nodes_in_target_space_gp(SubLObject nodes) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        try {
          sbhl_search_vars.$genl_inverse_mode_p$.bind(((NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED)) ? ((SubLObject) makeBoolean((NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
          {
            SubLObject cdolist_list_var = nodes;
            SubLObject node = NIL;
            for (node = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), node = cdolist_list_var.first()) {
              sbhl_mark_node_marked(node, sbhl_marking_vars.$sbhl_target_space$.getDynamicValue(thread));
            }
          }
        } finally {
          sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** Modifier: clears space */
  @SubL(source = "cycl/sbhl/sbhl-marking-utilities.lisp", position = 26824) 
  public static final SubLObject clear_sbhl_space(SubLObject space) {
    if ((space == UNPROVIDED)) {
      space = sbhl_marking_vars.$sbhl_space$.getDynamicValue();
    }
    Hashtables.clrhash(space);
    return NIL;
  }

  public static final SubLObject declare_sbhl_marking_utilities_file() {
    declareFunction(myName, "get_sbhl_marking_state", "GET-SBHL-MARKING-STATE", 1, 1, false);
    declareFunction(myName, "sbhl_marked_with", "SBHL-MARKED-WITH", 1, 1, false);
    //declareFunction(myName, "sbhl_marked_node_p", "SBHL-MARKED-NODE-P", 1, 1, false);
    declareFunction(myName, "sbhl_marked_p", "SBHL-MARKED-P", 1, 0, false);
    //declareFunction(myName, "sbhl_unmarked_p", "SBHL-UNMARKED-P", 1, 0, false);
    //declareFunction(myName, "sbhl_marking_contains_searcherP", "SBHL-MARKING-CONTAINS-SEARCHER?", 2, 0, false);
    //declareFunction(myName, "sbhl_marking_contains_all_searchersP", "SBHL-MARKING-CONTAINS-ALL-SEARCHERS?", 2, 0, false);
    //declareFunction(myName, "sbhl_temporal_increment", "SBHL-TEMPORAL-INCREMENT", 0, 0, false);
    //declareFunction(myName, "sbhl_temporal_tag_increment", "SBHL-TEMPORAL-TAG-INCREMENT", 1, 0, false);
    //declareFunction(myName, "sbhl_nodes_marking_non_negative_p", "SBHL-NODES-MARKING-NON-NEGATIVE-P", 1, 1, false);
    //declareFunction(myName, "sbhl_current_marking_exceeds_pending_marking_or_marking_threshold_p", "SBHL-CURRENT-MARKING-EXCEEDS-PENDING-MARKING-OR-MARKING-THRESHOLD-P", 1, 0, false);
    //declareFunction(myName, "sbhl_nodes_mark_exceeds_temporal_threshold_p", "SBHL-NODES-MARK-EXCEEDS-TEMPORAL-THRESHOLD-P", 1, 0, false);
    //declareFunction(myName, "sbhl_temporality_path_termination_for_searching_marked_nodes_p", "SBHL-TEMPORALITY-PATH-TERMINATION-FOR-SEARCHING-MARKED-NODES-P", 1, 0, false);
    //declareFunction(myName, "sbhl_current_temporal_node_not_yet_considered_p", "SBHL-CURRENT-TEMPORAL-NODE-NOT-YET-CONSIDERED-P", 0, 0, false);
    declareFunction(myName, "sbhl_predicate_path_termination_p", "SBHL-PREDICATE-PATH-TERMINATION-P", 1, 0, false);
    declareFunction(myName, "set_sbhl_marking_state", "SET-SBHL-MARKING-STATE", 2, 1, false);
    declareFunction(myName, "set_sbhl_marking_state_to_marked", "SET-SBHL-MARKING-STATE-TO-MARKED", 1, 1, false);
    declareFunction(myName, "set_sbhl_marking_state_to_unmarked", "SET-SBHL-MARKING-STATE-TO-UNMARKED", 1, 1, false);
    //declareFunction(myName, "sbhl_mark_node", "SBHL-MARK-NODE", 1, 1, false);
    //declareFunction(myName, "adjoin_to_sbhl_marking_state", "ADJOIN-TO-SBHL-MARKING-STATE", 2, 1, false);
    //declareFunction(myName, "prepend_to_sbhl_marking_state", "PREPEND-TO-SBHL-MARKING-STATE", 2, 1, false);
    //declareFunction(myName, "remove_from_sbhl_marking_state", "REMOVE-FROM-SBHL-MARKING-STATE", 2, 1, false);
    //declareFunction(myName, "increment_sbhl_marking_state", "INCREMENT-SBHL-MARKING-STATE", 2, 1, false);
    //declareFunction(myName, "increment_sbhl_marking_state_by_zero", "INCREMENT-SBHL-MARKING-STATE-BY-ZERO", 1, 1, false);
    //declareFunction(myName, "increment_sbhl_marking_state_by_minus_one", "INCREMENT-SBHL-MARKING-STATE-BY-MINUS-ONE", 1, 1, false);
    //declareFunction(myName, "increment_sbhl_marking_state_by_one", "INCREMENT-SBHL-MARKING-STATE-BY-ONE", 1, 1, false);
    //declareFunction(myName, "increment_sbhl_marking_state_by_two", "INCREMENT-SBHL-MARKING-STATE-BY-TWO", 1, 1, false);
    //declareFunction(myName, "set_sbhl_marking_state_to_zero", "SET-SBHL-MARKING-STATE-TO-ZERO", 1, 1, false);
    //declareFunction(myName, "set_sbhl_marking_state_to_depth", "SET-SBHL-MARKING-STATE-TO-DEPTH", 2, 1, false);
    //declareFunction(myName, "sbhl_node_marking_greater_than_depth_p", "SBHL-NODE-MARKING-GREATER-THAN-DEPTH-P", 2, 1, false);
    declareFunction(myName, "sbhl_predicate_marking_fn", "SBHL-PREDICATE-MARKING-FN", 1, 1, false);
    declareFunction(myName, "genl_preds_marking_fn", "GENL-PREDS-MARKING-FN", 1, 1, false);
    declareFunction(myName, "genl_inverse_marking_fn", "GENL-INVERSE-MARKING-FN", 1, 1, false);
    //declareFunction(myName, "sbhl_predicate_unmarking_fn", "SBHL-PREDICATE-UNMARKING-FN", 1, 1, false); new $sbhl_predicate_unmarking_fn$UnaryFunction(); new $sbhl_predicate_unmarking_fn$BinaryFunction();
    //declareFunction(myName, "genl_preds_unmarking_fn", "GENL-PREDS-UNMARKING-FN", 1, 1, false);
    //declareFunction(myName, "genl_inverse_unmarking_fn", "GENL-INVERSE-UNMARKING-FN", 1, 1, false);
    //declareFunction(myName, "sbhl_mark_node_in_precompute_space", "SBHL-MARK-NODE-IN-PRECOMPUTE-SPACE", 1, 0, false);
    //declareFunction(myName, "sbhl_node_marked_precompute_goal_p", "SBHL-NODE-MARKED-PRECOMPUTE-GOAL-P", 1, 0, false);
    //declareFunction(myName, "set_sbhl_boolean_precompute_goal_conditions", "SET-SBHL-BOOLEAN-PRECOMPUTE-GOAL-CONDITIONS", 1, 0, false);
    declareFunction(myName, "sbhl_search_path_termination_p", "SBHL-SEARCH-PATH-TERMINATION-P", 1, 1, false);
    declareFunction(myName, "sbhl_path_terminating_mark_p", "SBHL-PATH-TERMINATING-MARK-P", 1, 1, false);
    //declareFunction(myName, "sbhl_path_termination_marking_p", "SBHL-PATH-TERMINATION-MARKING-P", 1, 0, false);
    declareFunction(myName, "sbhl_marked_in_terminating_space_p", "SBHL-MARKED-IN-TERMINATING-SPACE-P", 1, 0, false);
    declareFunction(myName, "sbhl_marked_in_target_space_p", "SBHL-MARKED-IN-TARGET-SPACE-P", 1, 0, false); new $sbhl_marked_in_target_space_p$UnaryFunction();
    declareFunction(myName, "sbhl_mark_node_marked", "SBHL-MARK-NODE-MARKED", 1, 1, false);
    declareFunction(myName, "sbhl_mark_node_unmarked", "SBHL-MARK-NODE-UNMARKED", 1, 1, false);
    //declareFunction(myName, "sbhl_mark_in_target_space", "SBHL-MARK-IN-TARGET-SPACE", 1, 0, false);
    //declareFunction(myName, "sbhl_mark_in_target_gather_space", "SBHL-MARK-IN-TARGET-GATHER-SPACE", 1, 0, false);
    //declareFunction(myName, "sbhl_apply_mark_in_space", "SBHL-APPLY-MARK-IN-SPACE", 1, 0, false);
    //declareFunction(myName, "sbhl_apply_unmark_in_space", "SBHL-APPLY-UNMARK-IN-SPACE", 1, 0, false);
    //declareFunction(myName, "sbhl_generational_search_path_termination_p", "SBHL-GENERATIONAL-SEARCH-PATH-TERMINATION-P", 1, 1, false);
    //declareFunction(myName, "sbhl_marking_generation", "SBHL-MARKING-GENERATION", 1, 1, false);
    //declareFunction(myName, "sbhl_generational_mark_node_marked", "SBHL-GENERATIONAL-MARK-NODE-MARKED", 1, 1, false);
    //declareFunction(myName, "sbhl_generational_predicate_marking_fn", "SBHL-GENERATIONAL-PREDICATE-MARKING-FN", 1, 1, false);
    //declareFunction(myName, "genl_preds_generational_marking_fn", "GENL-PREDS-GENERATIONAL-MARKING-FN", 1, 1, false);
    //declareFunction(myName, "genl_inverse_generational_marking_fn", "GENL-INVERSE-GENERATIONAL-MARKING-FN", 1, 1, false);
    //declareFunction(myName, "sbhl_any_nodes_markedP", "SBHL-ANY-NODES-MARKED?", 1, 1, false);
    //declareFunction(myName, "sbhl_all_nodes_markedP", "SBHL-ALL-NODES-MARKED?", 1, 1, false);
    //declareFunction(myName, "sbhl_any_nodes_unmarkedP", "SBHL-ANY-NODES-UNMARKED?", 1, 1, false);
    //declareFunction(myName, "sbhl_all_nodes_unmarkedP", "SBHL-ALL-NODES-UNMARKED?", 1, 1, false);
    //declareFunction(myName, "all_unsearchedP", "ALL-UNSEARCHED?", 1, 0, false);
    //declareFunction(myName, "sbhl_all_marked_nodes", "SBHL-ALL-MARKED-NODES", 1, 1, false);
    //declareFunction(myName, "sbhl_all_unmarked_nodes", "SBHL-ALL-UNMARKED-NODES", 1, 1, false);
    //declareFunction(myName, "sbhl_marked_nodes", "SBHL-MARKED-NODES", 0, 1, false);
    //declareFunction(myName, "sbhl_mark_all_nodes_marked", "SBHL-MARK-ALL-NODES-MARKED", 1, 1, false);
    //declareFunction(myName, "sbhl_mark_all_nodes_unmarked", "SBHL-MARK-ALL-NODES-UNMARKED", 1, 1, false);
    declareFunction(myName, "sbhl_mark_nodes_in_target_space", "SBHL-MARK-NODES-IN-TARGET-SPACE", 1, 0, false);
    declareFunction(myName, "sbhl_mark_nodes_in_target_space_gp", "SBHL-MARK-NODES-IN-TARGET-SPACE-GP", 1, 0, false);
    //declareFunction(myName, "sbhl_space_p", "SBHL-SPACE-P", 1, 0, false);
    //declareFunction(myName, "list_of_sbhl_space_p", "LIST-OF-SBHL-SPACE-P", 1, 0, false);
    declareFunction(myName, "clear_sbhl_space", "CLEAR-SBHL-SPACE", 0, 1, false);
    //declareFunction(myName, "empty_sbhl_space_p", "EMPTY-SBHL-SPACE-P", 1, 0, false);
    //declareFunction(myName, "sbhl_marked_cardinality", "SBHL-MARKED-CARDINALITY", 1, 0, false);
    //declareFunction(myName, "sbhl_space_keys", "SBHL-SPACE-KEYS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_marking_utilities_file() {
    return NIL;
  }

  public static final SubLObject setup_sbhl_marking_utilities_file() {
    // CVS_ID("Id: sbhl-marking-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$WEAK = makeKeyword("WEAK");
  public static final SubLObject $const1$weak_HL_TimePrecedence = constant_handles.reader_make_constant_shell(makeString("weak-HL-TimePrecedence"));
  public static final SubLSymbol $kw2$STRICT = makeKeyword("STRICT");
  public static final SubLObject $const3$strict_HL_TimePrecedence = constant_handles.reader_make_constant_shell(makeString("strict-HL-TimePrecedence"));
  public static final SubLSymbol $kw4$WEAK_SUCCESSOR = makeKeyword("WEAK-SUCCESSOR");
  public static final SubLObject $const5$weakSuccessor_HL_TimePrecedence = constant_handles.reader_make_constant_shell(makeString("weakSuccessor-HL-TimePrecedence"));
  public static final SubLSymbol $kw6$SUCCESSOR_STRICT = makeKeyword("SUCCESSOR-STRICT");
  public static final SubLObject $const7$successorStrict_HL_TimePrecedence = constant_handles.reader_make_constant_shell(makeString("successorStrict-HL-TimePrecedence"));
  public static final SubLSymbol $sym8$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLString $str9$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-preds-unmarking");
  public static final SubLString $str10$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-inverse-unmarking");
  public static final SubLSymbol $sym11$SBHL_MARKED_P = makeSymbol("SBHL-MARKED-P");
  public static final SubLSymbol $sym12$SBHL_PREDICATE_PATH_TERMINATION_P = makeSymbol("SBHL-PREDICATE-PATH-TERMINATION-P");
  public static final SubLSymbol $sym13$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P = makeSymbol("SBHL-NODES-MARK-EXCEEDS-TEMPORAL-THRESHOLD-P");
  public static final SubLSymbol $sym14$SET_SBHL_MARKING_STATE_TO_MARKED = makeSymbol("SET-SBHL-MARKING-STATE-TO-MARKED");
  public static final SubLSymbol $sym15$SBHL_PREDICATE_MARKING_FN = makeSymbol("SBHL-PREDICATE-MARKING-FN");
  public static final SubLSymbol $sym16$INCREMENT_SBHL_MARKING_STATE_BY_ZERO = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-ZERO");
  public static final SubLSymbol $sym17$INCREMENT_SBHL_MARKING_STATE_BY_ONE = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-ONE");
  public static final SubLSymbol $sym18$INCREMENT_SBHL_MARKING_STATE_BY_TWO = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-TWO");
  public static final SubLSymbol $sym19$INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE = makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-MINUS-ONE");
  public static final SubLSymbol $sym20$SET_SBHL_MARKING_STATE_TO_UNMARKED = makeSymbol("SET-SBHL-MARKING-STATE-TO-UNMARKED");
  public static final SubLSymbol $sym21$GENL_PREDS_UNMARKING_FN = makeSymbol("GENL-PREDS-UNMARKING-FN");
  public static final SubLSymbol $sym22$GENL_INVERSE_UNMARKING_FN = makeSymbol("GENL-INVERSE-UNMARKING-FN");
  public static final SubLString $str23$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-preds-marking");
  public static final SubLString $str24$Node__a_has_current_marking__a_wi = makeString("Node ~a has current marking ~a within genl-inverse-marking");
  public static final SubLSymbol $kw25$ERROR = makeKeyword("ERROR");
  public static final SubLString $str26$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym27$SBHL_SPACE_P = makeSymbol("SBHL-SPACE-P");
  public static final SubLSymbol $kw28$CERROR = makeKeyword("CERROR");
  public static final SubLString $str29$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw30$WARN = makeKeyword("WARN");
  public static final SubLString $str31$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_marking_utilities_file();
  }

  public void initializeVariables() {
    init_sbhl_marking_utilities_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_marking_utilities_file();
  }

}
