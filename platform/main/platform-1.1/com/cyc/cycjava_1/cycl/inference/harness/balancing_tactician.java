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

package com.cyc.cycjava_1.cycl.inference.harness;
 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician_strategic_uninterestingness;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_answer;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_residual_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_split;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_union;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_tactician;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.transformation_tactician_datastructures;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class balancing_tactician extends SubLTranslatedFile {

  //// Constructor

  private balancing_tactician() {}
  public static final SubLFile me = new balancing_tactician();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.balancing_tactician";

  //// Definitions

  public static final class $balancing_tactician_data_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $new_root_substrategy; }
    public SubLObject getField3() { return $transformation_substrategy; }
    public SubLObject getField4() { return $removal_substrategies; }
    public SubLObject setField2(SubLObject value) { return $new_root_substrategy = value; }
    public SubLObject setField3(SubLObject value) { return $transformation_substrategy = value; }
    public SubLObject setField4(SubLObject value) { return $removal_substrategies = value; }
    public SubLObject $new_root_substrategy = NIL;
    public SubLObject $transformation_substrategy = NIL;
    public SubLObject $removal_substrategies = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($balancing_tactician_data_native.class, $sym2$BALANCING_TACTICIAN_DATA, $sym3$BALANCING_TACTICIAN_DATA_P, $list4, $list5, new String[] {"$new_root_substrategy", "$transformation_substrategy", "$removal_substrategies"}, $list6, $list7, $sym8$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 3940) 
  public static SubLSymbol $dtp_balancing_tactician_data$ = null;

  public static final class $balancing_tactician_data_p$UnaryFunction extends UnaryFunction {
    public $balancing_tactician_data_p$UnaryFunction() { super(extractFunctionNamed("BALANCING-TACTICIAN-DATA-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33071"); }
  }

  @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 4198) 
  public static final SubLObject balancing_tactician_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(object))
           && (NIL != list_utilities.member_eqP(inference_datastructures_strategy.strategy_type(object), $list20))));
  }

  @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 7976) 
  public static final SubLObject balancing_tactician_substrategy_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_strategy.strategy_p(object))
           && (NIL != balancing_tactician_p(inference_tactician.controlling_strategy(object)))));
  }

  @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 18416) 
  private static SubLSymbol $balancing_tactician_early_removal_productivity_limit$ = null;

  /** When deciding whether a problem is motivated via residual transformation, if
the rule used on the transformation link is a self looping rule and this fix is
enabled, prevents the motivation from flowing. */
  @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 22466) 
  private static SubLSymbol $balancing_tactician_self_looping_rule_fix_enabledP$ = null;

  /** It seems correct to ensure that the motivating join-ordered link has T before using it
to motivate the creation of a new root.  However, turning this to NIL causes 13 haystacks
to become answerable.  Leviathan @todo investigate why, and try to come up with a more
principled fix. */
  @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 22753) 
  public static SubLSymbol $balancing_tactician_new_roots_check_for_t_on_jo_linkP$ = null;

  /** There ought to be two triggers for new root creation via an RT link:
the motivation transformation link getting T, or the motivating join-ordered link
getting T.  Leviathan experiments indicated that we actually gain
more completeness by refraining from triggering via join-ordered T,
but more recent work requires this to be T for correctness. */
  @SubL(source = "cycl/inference/harness/balancing-tactician.lisp", position = 25702) 
  private static SubLSymbol $balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$ = null;

  public static final SubLObject declare_balancing_tactician_file() {
    declareFunction(myName, "balancing_tactician_data_print_function_trampoline", "BALANCING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "balancing_tactician_data_p", "BALANCING-TACTICIAN-DATA-P", 1, 0, false); new $balancing_tactician_data_p$UnaryFunction();
    declareFunction(myName, "bal_tac_data_new_root_substrategy", "BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
    declareFunction(myName, "bal_tac_data_transformation_substrategy", "BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
    declareFunction(myName, "bal_tac_data_removal_substrategies", "BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 1, 0, false);
    declareFunction(myName, "_csetf_bal_tac_data_new_root_substrategy", "_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY", 2, 0, false);
    declareFunction(myName, "_csetf_bal_tac_data_transformation_substrategy", "_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY", 2, 0, false);
    declareFunction(myName, "_csetf_bal_tac_data_removal_substrategies", "_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES", 2, 0, false);
    declareFunction(myName, "make_balancing_tactician_data", "MAKE-BALANCING-TACTICIAN-DATA", 0, 1, false);
    declareFunction(myName, "balancing_tactician_p", "BALANCING-TACTICIAN-P", 1, 0, false);
    declareMacro(myName, "do_balancing_tactician_substrategies", "DO-BALANCING-TACTICIAN-SUBSTRATEGIES");
    declareMacro(myName, "do_balancing_tactician_spineful_substrategies", "DO-BALANCING-TACTICIAN-SPINEFUL-SUBSTRATEGIES");
    declareFunction(myName, "new_balancing_tactician_data", "NEW-BALANCING-TACTICIAN-DATA", 3, 0, false);
    declareFunction(myName, "balancing_tactician_initialize", "BALANCING-TACTICIAN-INITIALIZE", 1, 0, false);
    declareFunction(myName, "new_balancing_tactician_data_from_inference", "NEW-BALANCING-TACTICIAN-DATA-FROM-INFERENCE", 1, 0, false);
    declareFunction(myName, "balancing_tactician_new_root_substrategy", "BALANCING-TACTICIAN-NEW-ROOT-SUBSTRATEGY", 1, 0, false);
    declareFunction(myName, "balancing_tactician_transformation_substrategy", "BALANCING-TACTICIAN-TRANSFORMATION-SUBSTRATEGY", 1, 0, false);
    declareFunction(myName, "balancing_tactician_removal_substrategies", "BALANCING-TACTICIAN-REMOVAL-SUBSTRATEGIES", 1, 0, false);
    declareFunction(myName, "balancing_tactician_sole_removal_substrategy", "BALANCING-TACTICIAN-SOLE-REMOVAL-SUBSTRATEGY", 1, 0, false);
    declareFunction(myName, "balancing_tactician_all_substrategies", "BALANCING-TACTICIAN-ALL-SUBSTRATEGIES", 1, 0, false);
    declareFunction(myName, "balancing_tactician_problem_motivated_wrt_nP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-N?", 2, 0, false);
    declareFunction(myName, "balancing_tactician_problem_motivated_wrt_rP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-R?", 2, 0, false);
    declareFunction(myName, "balancing_tactician_problem_motivated_wrt_tP", "BALANCING-TACTICIAN-PROBLEM-MOTIVATED-WRT-T?", 2, 0, false);
    declareFunction(myName, "balancing_tactician_link_head_motivated_wrt_rP", "BALANCING-TACTICIAN-LINK-HEAD-MOTIVATED-WRT-R?", 2, 0, false);
    declareFunction(myName, "balancing_tactician_substrategy_p", "BALANCING-TACTICIAN-SUBSTRATEGY-P", 1, 0, false);
    declareFunction(myName, "balancing_tactician_proper_substrategy_p", "BALANCING-TACTICIAN-PROPER-SUBSTRATEGY-P", 1, 0, false);
    declareFunction(myName, "balancing_tactician_spineless_substrategy_p", "BALANCING-TACTICIAN-SPINELESS-SUBSTRATEGY-P", 1, 0, false);
    declareFunction(myName, "balancing_tactician_doneP", "BALANCING-TACTICIAN-DONE?", 1, 0, false);
    declareFunction(myName, "balancing_tactician_do_one_step", "BALANCING-TACTICIAN-DO-ONE-STEP", 1, 0, false);
    declareFunction(myName, "balancing_tactician_do_one_step_int", "BALANCING-TACTICIAN-DO-ONE-STEP-INT", 1, 0, false);
    declareFunction(myName, "balancing_tactician_should_reconsider_set_asidesP", "BALANCING-TACTICIAN-SHOULD-RECONSIDER-SET-ASIDES?", 1, 0, false);
    declareFunction(myName, "balancing_tactician_reconsider_set_asides", "BALANCING-TACTICIAN-RECONSIDER-SET-ASIDES", 1, 0, false);
    declareFunction(myName, "substrategy_do_one_step_interestingness", "SUBSTRATEGY-DO-ONE-STEP-INTERESTINGNESS", 1, 0, false);
    declareFunction(myName, "balancing_tactician_continuation_possibleP", "BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?", 1, 0, false);
    declareFunction(myName, "balancing_tactician_chooses_to_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?", 4, 0, false);
    declareFunction(myName, "balancing_tactician_chooses_to_set_aside_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?", 4, 0, false);
    declareFunction(myName, "balancing_tactician_throw_away_uninteresting_set_asides", "BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES", 1, 0, false);
    declareFunction(myName, "balancing_tactician_note_inference_dynamic_properties_updated", "BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED", 1, 0, false);
    declareFunction(myName, "balancing_tactician_initialize_properties", "BALANCING-TACTICIAN-INITIALIZE-PROPERTIES", 2, 0, false);
    declareFunction(myName, "balancing_tactician_update_properties", "BALANCING-TACTICIAN-UPDATE-PROPERTIES", 2, 0, false);
    declareFunction(myName, "balancing_tactician_initial_relevant_strategies", "BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES", 1, 0, false);
    declareFunction(myName, "balancing_tactician_possibly_activate_problem", "BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM", 2, 0, false);
    declareFunction(myName, "balancing_tactician_problem_is_the_rest_of_an_early_removalP", "BALANCING-TACTICIAN-PROBLEM-IS-THE-REST-OF-AN-EARLY-REMOVAL?", 2, 0, false);
    declareFunction(myName, "balancing_tactician_chooses_to_propagate_new_root_motivation_to_restricted_non_focal_problemP", "BALANCING-TACTICIAN-CHOOSES-TO-PROPAGATE-NEW-ROOT-MOTIVATION-TO-RESTRICTED-NON-FOCAL-PROBLEM?", 3, 0, false);
    declareFunction(myName, "balancing_tactician_treats_restricted_non_focal_as_new_rootP", "BALANCING-TACTICIAN-TREATS-RESTRICTED-NON-FOCAL-AS-NEW-ROOT?", 2, 0, false);
    declareFunction(myName, "balancing_tactician_early_removal_linkP", "BALANCING-TACTICIAN-EARLY-REMOVAL-LINK?", 2, 0, false);
    declareFunction(myName, "substrategy_connected_conjunction_link_motivatedP", "SUBSTRATEGY-CONNECTED-CONJUNCTION-LINK-MOTIVATED?", 2, 0, false);
    declareFunction(myName, "balancing_tactician_note_argument_link", "BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK", 2, 0, false);
    declareFunction(myName, "balancing_tactician_early_removal_productivity_limit", "BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT", 1, 0, false);
    declareFunction(myName, "balancing_tactician_substrategy_strategem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED", 3, 0, false);
    declareFunction(myName, "balancing_tactician_substrategy_problem_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-MOTIVATED", 3, 0, false);
    declareFunction(myName, "balancing_tactician_substrategy_link_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-LINK-MOTIVATED", 3, 0, false);
    declareFunction(myName, "balancing_tactician_chooses_to_make_d_a_new_rootP", "BALANCING-TACTICIAN-CHOOSES-TO-MAKE-D-A-NEW-ROOT?", 2, 0, false);
    declareFunction(myName, "balancing_tactician_residual_conjunction_new_root_candidates", "BALANCING-TACTICIAN-RESIDUAL-CONJUNCTION-NEW-ROOT-CANDIDATES", 2, 0, false);
    declareFunction(myName, "balancing_tactician_transformation_new_root_candidates", "BALANCING-TACTICIAN-TRANSFORMATION-NEW-ROOT-CANDIDATES", 2, 0, false);
    declareFunction(myName, "balancing_tactician_possibly_make_new_root", "BALANCING-TACTICIAN-POSSIBLY-MAKE-NEW-ROOT", 2, 0, false);
    declareFunction(myName, "balancing_tactician_substrategy_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-TACTIC-MOTIVATED", 3, 0, false);
    declareFunction(myName, "balancing_tactician_substrategy_connected_conjunction_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-CONNECTED-CONJUNCTION-TACTIC-MOTIVATED", 3, 0, false);
    declareFunction(myName, "balancing_tactician_possibly_motivate_new_root_via_residual_transformation_link", "BALANCING-TACTICIAN-POSSIBLY-MOTIVATE-NEW-ROOT-VIA-RESIDUAL-TRANSFORMATION-LINK", 2, 0, false);
    declareFunction(myName, "balancing_tactician_substrategy_split_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-SPLIT-TACTIC-MOTIVATED", 3, 0, false);
    declareFunction(myName, "balancing_tactician_possibly_propagate_new_root_motivation_down_split_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-SPLIT-LINK", 2, 0, false);
    declareFunction(myName, "balancing_tactician_substrategy_union_tactic_motivated", "BALANCING-TACTICIAN-SUBSTRATEGY-UNION-TACTIC-MOTIVATED", 3, 0, false);
    declareFunction(myName, "balancing_tactician_possibly_propagate_new_root_motivation_down_union_link", "BALANCING-TACTICIAN-POSSIBLY-PROPAGATE-NEW-ROOT-MOTIVATION-DOWN-UNION-LINK", 2, 0, false);
    declareFunction(myName, "balancing_tactician_allows_split_tactic_to_be_set_aside_wrt_removalP", "BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?", 3, 0, false);
    declareFunction(myName, "balancing_tactician_chooses_to_totally_throw_away_tacticP", "BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?", 5, 0, false);
    declareFunction(myName, "balancing_tactician_substrategy_problem_status_change", "BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE", 5, 0, false);
    declareFunction(myName, "balancing_tactician_recompute_problem_status", "BALANCING-TACTICIAN-RECOMPUTE-PROBLEM-STATUS", 2, 0, false);
    declareFunction(myName, "balancing_tactician_make_problem_no_good", "BALANCING-TACTICIAN-MAKE-PROBLEM-NO-GOOD", 2, 0, false);
    declareFunction(myName, "balancing_tactician_make_problem_pending", "BALANCING-TACTICIAN-MAKE-PROBLEM-PENDING", 2, 0, false);
    declareFunction(myName, "transformation_strategy_sibling_removal_strategy", "TRANSFORMATION-STRATEGY-SIBLING-REMOVAL-STRATEGY", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_balancing_tactician_file() {
    $dtp_balancing_tactician_data$ = defconstant("*DTP-BALANCING-TACTICIAN-DATA*", $sym2$BALANCING_TACTICIAN_DATA);
    $balancing_tactician_early_removal_productivity_limit$ = defvar("*BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT*", inference_datastructures_enumerated_types.productivity_for_number_of_children(backward.$transformation_early_removal_threshold$.getDynamicValue()));
    $balancing_tactician_self_looping_rule_fix_enabledP$ = defparameter("*BALANCING-TACTICIAN-SELF-LOOPING-RULE-FIX-ENABLED?*", T);
    $balancing_tactician_new_roots_check_for_t_on_jo_linkP$ = defvar("*BALANCING-TACTICIAN-NEW-ROOTS-CHECK-FOR-T-ON-JO-LINK?*", T);
    $balancing_tactician_new_roots_triggered_by_t_on_jo_linkP$ = defparameter("*BALANCING-TACTICIAN-NEW-ROOTS-TRIGGERED-BY-T-ON-JO-LINK?*", T);
    return NIL;
  }

  public static final SubLObject setup_balancing_tactician_file() {
    // CVS_ID("Id: balancing-tactician.lisp 128795 2009-09-16 17:03:43Z pace ");
    inference_tactician.inference_strategy_type($kw0$BALANCING, $list1);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_balancing_tactician_data$.getGlobalValue(), Symbols.symbol_function($sym9$BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym10$BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY, $sym11$_CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY);
    Structures.def_csetf($sym12$BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY, $sym13$_CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY);
    Structures.def_csetf($sym14$BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES, $sym15$_CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES);
    Equality.identity($sym2$BALANCING_TACTICIAN_DATA);
    utilities_macros.note_funcall_helper_function($sym30$BALANCING_TACTICIAN_INITIALIZE);
    utilities_macros.note_funcall_helper_function($sym35$BALANCING_TACTICIAN_DONE_);
    utilities_macros.note_funcall_helper_function($sym37$BALANCING_TACTICIAN_DO_ONE_STEP);
    utilities_macros.note_funcall_helper_function($sym39$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_);
    utilities_macros.note_funcall_helper_function($sym40$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_);
    utilities_macros.note_funcall_helper_function($sym41$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_);
    utilities_macros.note_funcall_helper_function($sym42$BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES);
    utilities_macros.note_funcall_helper_function($sym43$BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED);
    utilities_macros.note_funcall_helper_function($sym44$BALANCING_TACTICIAN_INITIALIZE_PROPERTIES);
    utilities_macros.note_funcall_helper_function($sym45$BALANCING_TACTICIAN_UPDATE_PROPERTIES);
    utilities_macros.note_funcall_helper_function($sym46$BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES);
    utilities_macros.note_funcall_helper_function($sym47$BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM);
    utilities_macros.note_funcall_helper_function($sym52$BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK);
    utilities_macros.note_funcall_helper_function($sym53$BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT);
    utilities_macros.note_funcall_helper_function($sym54$BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED);
    utilities_macros.note_funcall_helper_function($sym62$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV);
    utilities_macros.note_funcall_helper_function($sym63$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_);
    utilities_macros.note_funcall_helper_function($sym65$BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$BALANCING = makeKeyword("BALANCING");
  public static final SubLList $list1 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Balancing Tactician"), makeKeyword("COMMENT"), makeString("A balancing tactician type which delegates to a new-root tactician,\n a transformation tactician, and multiple removal tacticians."), makeKeyword("CONSTRUCTOR"), makeSymbol("BALANCING-TACTICIAN-INITIALIZE"), makeKeyword("DONE?"), makeSymbol("BALANCING-TACTICIAN-DONE?"), makeKeyword("DO-ONE-STEP"), makeSymbol("BALANCING-TACTICIAN-DO-ONE-STEP"), makeKeyword("INITIAL-RELEVANT-STRATEGIES"), makeSymbol("BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES"), makeKeyword("INITIALIZE-PROPERTIES"), makeSymbol("BALANCING-TACTICIAN-INITIALIZE-PROPERTIES"), makeKeyword("UPDATE-PROPERTIES"), makeSymbol("BALANCING-TACTICIAN-UPDATE-PROPERTIES"), makeKeyword("INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeSymbol("BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED"), makeKeyword("CONTINUATION-POSSIBLE?"), makeSymbol("BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?"), makeKeyword("THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeSymbol("BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES"), makeKeyword("EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeSymbol("BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT"), makeKeyword("POSSIBLY-ACTIVATE-PROBLEM"), makeSymbol("BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM"), makeKeyword("THROW-AWAY-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?"), makeKeyword("SET-ASIDE-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?"), makeKeyword("NEW-ARGUMENT-LINK"), makeSymbol("BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK"), makeKeyword("NEW-TACTIC"), makeSymbol("IGNORE"), makeKeyword("SPLIT-TACTICS-POSSIBLE"), makeSymbol("IGNORE"), makeKeyword("PROBLEM-COULD-BE-PENDING"), makeSymbol("IGNORE"), makeKeyword("LINK-HEAD-MOTIVATED?"), makeSymbol("FALSE"), makeKeyword("SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED"), makeKeyword("SUBSTRATEGY-TOTALLY-THROW-AWAY-TACTIC"), makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?"), makeKeyword("SUBSTRATEGY-ALLOW-SPLIT-TACTIC-SET-ASIDE-WRT-REMOVAL"), makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?"), makeKeyword("SUBSTRATEGY-PROBLEM-STATUS-CHANGE"), makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE")});
  public static final SubLSymbol $sym2$BALANCING_TACTICIAN_DATA = makeSymbol("BALANCING-TACTICIAN-DATA");
  public static final SubLSymbol $sym3$BALANCING_TACTICIAN_DATA_P = makeSymbol("BALANCING-TACTICIAN-DATA-P");
  public static final SubLList $list4 = list(makeSymbol("NEW-ROOT-SUBSTRATEGY"), makeSymbol("TRANSFORMATION-SUBSTRATEGY"), makeSymbol("REMOVAL-SUBSTRATEGIES"));
  public static final SubLList $list5 = list(makeKeyword("NEW-ROOT-SUBSTRATEGY"), makeKeyword("TRANSFORMATION-SUBSTRATEGY"), makeKeyword("REMOVAL-SUBSTRATEGIES"));
  public static final SubLList $list6 = list(makeSymbol("BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), makeSymbol("BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), makeSymbol("BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES"));
  public static final SubLList $list7 = list(makeSymbol("_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY"), makeSymbol("_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY"), makeSymbol("_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES"));
  public static final SubLSymbol $sym8$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym9$BALANCING_TACTICIAN_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BALANCING-TACTICIAN-DATA-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym10$BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY = makeSymbol("BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY");
  public static final SubLSymbol $sym11$_CSETF_BAL_TAC_DATA_NEW_ROOT_SUBSTRATEGY = makeSymbol("_CSETF-BAL-TAC-DATA-NEW-ROOT-SUBSTRATEGY");
  public static final SubLSymbol $sym12$BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY = makeSymbol("BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY");
  public static final SubLSymbol $sym13$_CSETF_BAL_TAC_DATA_TRANSFORMATION_SUBSTRATEGY = makeSymbol("_CSETF-BAL-TAC-DATA-TRANSFORMATION-SUBSTRATEGY");
  public static final SubLSymbol $sym14$BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES = makeSymbol("BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES");
  public static final SubLSymbol $sym15$_CSETF_BAL_TAC_DATA_REMOVAL_SUBSTRATEGIES = makeSymbol("_CSETF-BAL-TAC-DATA-REMOVAL-SUBSTRATEGIES");
  public static final SubLSymbol $kw16$NEW_ROOT_SUBSTRATEGY = makeKeyword("NEW-ROOT-SUBSTRATEGY");
  public static final SubLSymbol $kw17$TRANSFORMATION_SUBSTRATEGY = makeKeyword("TRANSFORMATION-SUBSTRATEGY");
  public static final SubLSymbol $kw18$REMOVAL_SUBSTRATEGIES = makeKeyword("REMOVAL-SUBSTRATEGIES");
  public static final SubLString $str19$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLList $list20 = list(makeKeyword("BALANCING"));
  public static final SubLList $list21 = list(list(makeSymbol("SUBSTRATEGY-VAR"), makeSymbol("STRATEGY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list22 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw23$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw24$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym25$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym26$BALANCING_TACTICIAN_ALL_SUBSTRATEGIES = makeSymbol("BALANCING-TACTICIAN-ALL-SUBSTRATEGIES");
  public static final SubLSymbol $sym27$DO_BALANCING_TACTICIAN_SUBSTRATEGIES = makeSymbol("DO-BALANCING-TACTICIAN-SUBSTRATEGIES");
  public static final SubLSymbol $sym28$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym29$BALANCING_TACTICIAN_SPINELESS_SUBSTRATEGY_P = makeSymbol("BALANCING-TACTICIAN-SPINELESS-SUBSTRATEGY-P");
  public static final SubLSymbol $sym30$BALANCING_TACTICIAN_INITIALIZE = makeSymbol("BALANCING-TACTICIAN-INITIALIZE");
  public static final SubLSymbol $kw31$NEW_ROOT = makeKeyword("NEW-ROOT");
  public static final SubLSymbol $kw32$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $kw33$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $sym34$BALANCING_TACTICIAN_P = makeSymbol("BALANCING-TACTICIAN-P");
  public static final SubLSymbol $sym35$BALANCING_TACTICIAN_DONE_ = makeSymbol("BALANCING-TACTICIAN-DONE?");
  public static final SubLSymbol $kw36$UNINTERESTING = makeKeyword("UNINTERESTING");
  public static final SubLSymbol $sym37$BALANCING_TACTICIAN_DO_ONE_STEP = makeSymbol("BALANCING-TACTICIAN-DO-ONE-STEP");
  public static final SubLSymbol $kw38$INTERESTING = makeKeyword("INTERESTING");
  public static final SubLSymbol $sym39$BALANCING_TACTICIAN_CONTINUATION_POSSIBLE_ = makeSymbol("BALANCING-TACTICIAN-CONTINUATION-POSSIBLE?");
  public static final SubLSymbol $sym40$BALANCING_TACTICIAN_CHOOSES_TO_THROW_AWAY_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-THROW-AWAY-TACTIC?");
  public static final SubLSymbol $sym41$BALANCING_TACTICIAN_CHOOSES_TO_SET_ASIDE_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-SET-ASIDE-TACTIC?");
  public static final SubLSymbol $sym42$BALANCING_TACTICIAN_THROW_AWAY_UNINTERESTING_SET_ASIDES = makeSymbol("BALANCING-TACTICIAN-THROW-AWAY-UNINTERESTING-SET-ASIDES");
  public static final SubLSymbol $sym43$BALANCING_TACTICIAN_NOTE_INFERENCE_DYNAMIC_PROPERTIES_UPDATED = makeSymbol("BALANCING-TACTICIAN-NOTE-INFERENCE-DYNAMIC-PROPERTIES-UPDATED");
  public static final SubLSymbol $sym44$BALANCING_TACTICIAN_INITIALIZE_PROPERTIES = makeSymbol("BALANCING-TACTICIAN-INITIALIZE-PROPERTIES");
  public static final SubLSymbol $sym45$BALANCING_TACTICIAN_UPDATE_PROPERTIES = makeSymbol("BALANCING-TACTICIAN-UPDATE-PROPERTIES");
  public static final SubLSymbol $sym46$BALANCING_TACTICIAN_INITIAL_RELEVANT_STRATEGIES = makeSymbol("BALANCING-TACTICIAN-INITIAL-RELEVANT-STRATEGIES");
  public static final SubLSymbol $sym47$BALANCING_TACTICIAN_POSSIBLY_ACTIVATE_PROBLEM = makeSymbol("BALANCING-TACTICIAN-POSSIBLY-ACTIVATE-PROBLEM");
  public static final SubLSymbol $kw48$RESTRICTION = makeKeyword("RESTRICTION");
  public static final SubLSymbol $kw49$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $sym50$PROBLEM_LINK_P = makeSymbol("PROBLEM-LINK-P");
  public static final SubLSymbol $kw51$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $sym52$BALANCING_TACTICIAN_NOTE_ARGUMENT_LINK = makeSymbol("BALANCING-TACTICIAN-NOTE-ARGUMENT-LINK");
  public static final SubLSymbol $sym53$BALANCING_TACTICIAN_EARLY_REMOVAL_PRODUCTIVITY_LIMIT = makeSymbol("BALANCING-TACTICIAN-EARLY-REMOVAL-PRODUCTIVITY-LIMIT");
  public static final SubLSymbol $sym54$BALANCING_TACTICIAN_SUBSTRATEGY_STRATEGEM_MOTIVATED = makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-STRATEGEM-MOTIVATED");
  public static final SubLSymbol $kw55$SPLIT = makeKeyword("SPLIT");
  public static final SubLSymbol $kw56$UNION = makeKeyword("UNION");
  public static final SubLSymbol $sym57$TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");
  public static final SubLSymbol $kw58$RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
  public static final SubLSymbol $sym59$CONNECTED_CONJUNCTION_TACTIC_P = makeSymbol("CONNECTED-CONJUNCTION-TACTIC-P");
  public static final SubLSymbol $sym60$SPLIT_TACTIC_P = makeSymbol("SPLIT-TACTIC-P");
  public static final SubLSymbol $sym61$REMOVAL_STRATEGY_P = makeSymbol("REMOVAL-STRATEGY-P");
  public static final SubLSymbol $sym62$BALANCING_TACTICIAN_ALLOWS_SPLIT_TACTIC_TO_BE_SET_ASIDE_WRT_REMOV = makeSymbol("BALANCING-TACTICIAN-ALLOWS-SPLIT-TACTIC-TO-BE-SET-ASIDE-WRT-REMOVAL?");
  public static final SubLSymbol $sym63$BALANCING_TACTICIAN_CHOOSES_TO_TOTALLY_THROW_AWAY_TACTIC_ = makeSymbol("BALANCING-TACTICIAN-CHOOSES-TO-TOTALLY-THROW-AWAY-TACTIC?");
  public static final SubLSymbol $kw64$COMPLETE_REMOVAL_TACTIC_NO_GOOD = makeKeyword("COMPLETE-REMOVAL-TACTIC-NO-GOOD");
  public static final SubLSymbol $sym65$BALANCING_TACTICIAN_SUBSTRATEGY_PROBLEM_STATUS_CHANGE = makeSymbol("BALANCING-TACTICIAN-SUBSTRATEGY-PROBLEM-STATUS-CHANGE");
  public static final SubLSymbol $kw66$FINISHED = makeKeyword("FINISHED");
  public static final SubLSymbol $kw67$NO_GOOD = makeKeyword("NO-GOOD");
  public static final SubLSymbol $kw68$GOOD = makeKeyword("GOOD");
  public static final SubLSymbol $kw69$NEUTRAL = makeKeyword("NEUTRAL");
  public static final SubLSymbol $kw70$CONNECTED_CONJUNCTION = makeKeyword("CONNECTED-CONJUNCTION");

  //// Initializers

  public void declareFunctions() {
    declare_balancing_tactician_file();
  }

  public void initializeVariables() {
    init_balancing_tactician_file();
  }

  public void runTopLevelForms() {
    setup_balancing_tactician_file();
  }

}
