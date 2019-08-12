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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.gt_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.transitivity;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class gt_vars extends SubLTranslatedFile {

  //// Constructor

  private gt_vars() {}
  public static final SubLFile me = new gt_vars();
  public static final String myName = "com.cyc.cycjava_1.cycl.gt_vars";

  //// Definitions

  @SubL(source = "cycl/gt-vars.lisp", position = 526) 
  public static SubLSymbol $gt_dispatch_table$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 4824) 
  public static SubLSymbol $gt_methods$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 4920) 
  public static SubLSymbol $gt_parameters$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 5063) 
  public static SubLSymbol $transitivity_modules$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 5170) 
  public static SubLSymbol $gt_pred$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 5246) 
  public static SubLSymbol $gt_index$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 5322) 
  public static SubLSymbol $gt_gather$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 5422) 
  public static SubLSymbol $gt_index_arg$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 5501) 
  public static SubLSymbol $gt_gather_arg$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 5582) 
  public static SubLSymbol $gt_accessors$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 5651) 
  public static SubLSymbol $gt_link_type$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 5723) 
  public static SubLSymbol $gt_mode$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 5806) 
  public static SubLSymbol $gt_modes$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 5933) 
  public static SubLSymbol $gt_truth$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6018) 
  public static SubLSymbol $gt_query$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6099) 
  public static SubLSymbol $gt_doneP$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6161) 
  public static SubLSymbol $gt_searchedP$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6244) 
  public static SubLSymbol $gt_target$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6302) 
  public static SubLSymbol $gt_result$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6371) 
  public static SubLSymbol $gt_searcher$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6455) 
  public static SubLSymbol $gt_base_fn$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6537) 
  public static SubLSymbol $gt_step_fn$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6634) 
  public static SubLSymbol $gt_compose_fn$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6728) 
  public static SubLSymbol $gt_gather_fn$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6820) 
  public static SubLSymbol $gt_combine_fn$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 6931) 
  public static SubLSymbol $gt_compare_fn$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 7034) 
  public static SubLSymbol $gt_equality_fn$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 7152) 
  public static SubLSymbol $gt_compose_pred$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 7245) 
  public static SubLSymbol $gt_compose_index_arg$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 7350) 
  public static SubLSymbol $gt_compose_gather_arg$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 7457) 
  public static SubLSymbol $gt_max_nodes_direction$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 7556) 
  public static SubLSymbol $gt_use_spec_predsP$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 7629) 
  public static SubLSymbol $gt_handle_non_transitive_predicateP$ = null;

  /** the current link assertion or hl support. */
  @SubL(source = "cycl/gt-vars.lisp", position = 7743) 
  public static SubLSymbol $gt_link_support$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 8683) 
  public static SubLSymbol $gt_what_mts_result$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 8793) 
  public static SubLSymbol $gt_what_mts_goal_node$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 8868) 
  public static SubLSymbol $gt_path_list_of_mts$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 8939) 
  public static SubLSymbol $gt_path_list_of_nodes$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 9037) 
  public static SubLSymbol $gt_path_length$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 9096) 
  public static SubLSymbol $gt_list_of_path_lengths$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 9170) 
  public static SubLSymbol $gt_marking_table$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 9327) 
  public static SubLSymbol $gt_target_marking_table$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 9409) 
  public static SubLSymbol $gt_depth_cutoff$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 9540) 
  public static SubLSymbol $gt_depth_cutoffP$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 9622) 
  public static SubLSymbol $gt_prev_depth_cutoff$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 9724) 
  public static SubLSymbol $gt_time_cutoffP$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 9830) 
  public static SubLSymbol $gt_time_cutoff$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 9904) 
  public static SubLSymbol $gt_initial_time$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 9965) 
  public static SubLSymbol $gt_answers_cutoffP$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 10090) 
  public static SubLSymbol $gt_answers_cutoff$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 10178) 
  public static SubLSymbol $gt_answers_so_far$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 10255) 
  public static SubLSymbol $gt_goal_node$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 10323) 
  public static SubLSymbol $gt_edge_list$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 10398) 
  public static SubLSymbol $gt_edge_list_returnP$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 10466) 
  public static SubLSymbol $gt_path_list_of_assertions$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 10560) 
  public static SubLSymbol $gt_cyclical_edges$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 10741) 
  public static SubLSymbol $gt_trace_level$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 10900) 
  public static SubLSymbol $gt_test_level$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 11008) 
  public static SubLSymbol $suspend_gt_type_checkingP$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 11093) 
  public static SubLSymbol $gt_warnings$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 13658) 
  public static SubLSymbol $tt_dispatch_table$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 15102) 
  public static SubLSymbol $tt_methods$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 15198) 
  public static SubLSymbol $transfers_through_modules$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 15314) 
  public static SubLSymbol $tt_parameters$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 15500) 
  public static SubLSymbol $tt_pred$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 15576) 
  public static SubLSymbol $tt_index$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 15652) 
  public static SubLSymbol $tt_gather$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 15752) 
  public static SubLSymbol $tt_index_arg$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 15831) 
  public static SubLSymbol $tt_gather_arg$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 15912) 
  public static SubLSymbol $tt_truth$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 15997) 
  public static SubLSymbol $tt_step_fn$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 16087) 
  public static SubLSymbol $tt_transitive_conduitP$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 22655) 
  public static SubLSymbol $gt_transitive_via_arg_activeP$ = null;

  @SubL(source = "cycl/gt-vars.lisp", position = 22783) 
  public static SubLSymbol $gt_within_transitive_via_argP$ = null;

  public static final SubLObject declare_gt_vars_file() {
    declareFunction(myName, "gt_link_support", "GT-LINK-SUPPORT", 0, 0, false);
    declareFunction(myName, "gt_link_mt", "GT-LINK-MT", 0, 0, false);
    declareFunction(myName, "gt_link_pred", "GT-LINK-PRED", 0, 0, false);
    declareMacro(myName, "transitivity_module", "TRANSITIVITY-MODULE");
    declareMacro(myName, "tt_module", "TT-MODULE");
    declareMacro(myName, "itt_module", "ITT-MODULE");
    declareMacro(myName, "tti_module", "TTI-MODULE");
    declareMacro(myName, "itti_module", "ITTI-MODULE");
    declareFunction(myName, "gt_within_transitive_via_argP", "GT-WITHIN-TRANSITIVE-VIA-ARG?", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_gt_vars_file() {
    $gt_dispatch_table$ = deflexical("*GT-DISPATCH-TABLE*", $list0);
    $gt_methods$ = defparameter("*GT-METHODS*", Mapping.mapcar(Symbols.symbol_function($sym3$CAR), $gt_dispatch_table$.getGlobalValue()));
    $gt_parameters$ = defparameter("*GT-PARAMETERS*", ConsesLow.append($list6, $gt_methods$.getDynamicValue()));
    $transitivity_modules$ = defparameter("*TRANSITIVITY-MODULES*", NIL);
    $gt_pred$ = defparameter("*GT-PRED*", NIL);
    $gt_index$ = defparameter("*GT-INDEX*", NIL);
    $gt_gather$ = defparameter("*GT-GATHER*", NIL);
    $gt_index_arg$ = defparameter("*GT-INDEX-ARG*", ONE_INTEGER);
    $gt_gather_arg$ = defparameter("*GT-GATHER-ARG*", TWO_INTEGER);
    $gt_accessors$ = defparameter("*GT-ACCESSORS*", NIL);
    $gt_link_type$ = defparameter("*GT-LINK-TYPE*", $kw23$ASSERTION);
    $gt_mode$ = defparameter("*GT-MODE*", $kw26$SUPERIOR);
    $gt_modes$ = defparameter("*GT-MODES*", $list29);
    $gt_truth$ = defparameter("*GT-TRUTH*", $kw32$TRUE);
    $gt_query$ = defparameter("*GT-QUERY*", NIL);
    $gt_doneP$ = defparameter("*GT-DONE?*", NIL);
    $gt_searchedP$ = defparameter("*GT-SEARCHED?*", NIL);
    $gt_target$ = defparameter("*GT-TARGET*", NIL);
    $gt_result$ = defparameter("*GT-RESULT*", NIL);
    $gt_searcher$ = defparameter("*GT-SEARCHER*", NIL);
    $gt_base_fn$ = defparameter("*GT-BASE-FN*", NIL);
    $gt_step_fn$ = defparameter("*GT-STEP-FN*", NIL);
    $gt_compose_fn$ = defparameter("*GT-COMPOSE-FN*", NIL);
    $gt_gather_fn$ = defparameter("*GT-GATHER-FN*", NIL);
    $gt_combine_fn$ = defparameter("*GT-COMBINE-FN*", Symbols.symbol_function($sym55$NCONC));
    $gt_compare_fn$ = defparameter("*GT-COMPARE-FN*", NIL);
    $gt_equality_fn$ = defparameter("*GT-EQUALITY-FN*", Symbols.symbol_function(EQUAL));
    $gt_compose_pred$ = defparameter("*GT-COMPOSE-PRED*", NIL);
    $gt_compose_index_arg$ = defparameter("*GT-COMPOSE-INDEX-ARG*", ONE_INTEGER);
    $gt_compose_gather_arg$ = defparameter("*GT-COMPOSE-GATHER-ARG*", TWO_INTEGER);
    $gt_max_nodes_direction$ = defparameter("*GT-MAX-NODES-DIRECTION*", $kw68$DOWN);
    $gt_use_spec_predsP$ = defparameter("*GT-USE-SPEC-PREDS?*", T);
    $gt_handle_non_transitive_predicateP$ = defparameter("*GT-HANDLE-NON-TRANSITIVE-PREDICATE?*", NIL);
    $gt_link_support$ = defparameter("*GT-LINK-SUPPORT*", NIL);
    $gt_what_mts_result$ = defparameter("*GT-WHAT-MTS-RESULT*", NIL);
    $gt_what_mts_goal_node$ = defparameter("*GT-WHAT-MTS-GOAL-NODE*", NIL);
    $gt_path_list_of_mts$ = defparameter("*GT-PATH-LIST-OF-MTS*", NIL);
    $gt_path_list_of_nodes$ = defparameter("*GT-PATH-LIST-OF-NODES*", NIL);
    $gt_path_length$ = defparameter("*GT-PATH-LENGTH*", ZERO_INTEGER);
    $gt_list_of_path_lengths$ = defparameter("*GT-LIST-OF-PATH-LENGTHS*", NIL);
    $gt_marking_table$ = defparameter("*GT-MARKING-TABLE*", NIL);
    $gt_target_marking_table$ = defparameter("*GT-TARGET-MARKING-TABLE*", NIL);
    $gt_depth_cutoff$ = defparameter("*GT-DEPTH-CUTOFF*", ONE_INTEGER);
    $gt_depth_cutoffP$ = defparameter("*GT-DEPTH-CUTOFF?*", NIL);
    $gt_prev_depth_cutoff$ = defparameter("*GT-PREV-DEPTH-CUTOFF*", ONE_INTEGER);
    $gt_time_cutoffP$ = defparameter("*GT-TIME-CUTOFF?*", NIL);
    $gt_time_cutoff$ = defparameter("*GT-TIME-CUTOFF*", TEN_INTEGER);
    $gt_initial_time$ = defparameter("*GT-INITIAL-TIME*", ZERO_INTEGER);
    $gt_answers_cutoffP$ = defparameter("*GT-ANSWERS-CUTOFF?*", NIL);
    $gt_answers_cutoff$ = defparameter("*GT-ANSWERS-CUTOFF*", ONE_INTEGER);
    $gt_answers_so_far$ = defparameter("*GT-ANSWERS-SO-FAR*", ZERO_INTEGER);
    $gt_goal_node$ = defparameter("*GT-GOAL-NODE*", NIL);
    $gt_edge_list$ = defparameter("*GT-EDGE-LIST*", NIL);
    $gt_edge_list_returnP$ = defparameter("*GT-EDGE-LIST-RETURN?*", NIL);
    $gt_path_list_of_assertions$ = defparameter("*GT-PATH-LIST-OF-ASSERTIONS*", NIL);
    $gt_cyclical_edges$ = defparameter("*GT-CYCLICAL-EDGES*", NIL);
    $gt_trace_level$ = defparameter("*GT-TRACE-LEVEL*", ONE_INTEGER);
    $gt_test_level$ = defparameter("*GT-TEST-LEVEL*", THREE_INTEGER);
    $suspend_gt_type_checkingP$ = defparameter("*SUSPEND-GT-TYPE-CHECKING?*", NIL);
    $gt_warnings$ = defparameter("*GT-WARNINGS*", NIL);
    $tt_dispatch_table$ = defparameter("*TT-DISPATCH-TABLE*", $list149);
    $tt_methods$ = defparameter("*TT-METHODS*", Mapping.mapcar(Symbols.symbol_function($sym3$CAR), $tt_dispatch_table$.getDynamicValue()));
    $transfers_through_modules$ = defparameter("*TRANSFERS-THROUGH-MODULES*", NIL);
    $tt_parameters$ = defparameter("*TT-PARAMETERS*", ConsesLow.append($list155, $tt_methods$.getDynamicValue()));
    $tt_pred$ = defparameter("*TT-PRED*", NIL);
    $tt_index$ = defparameter("*TT-INDEX*", NIL);
    $tt_gather$ = defparameter("*TT-GATHER*", NIL);
    $tt_index_arg$ = defparameter("*TT-INDEX-ARG*", ONE_INTEGER);
    $tt_gather_arg$ = defparameter("*TT-GATHER-ARG*", TWO_INTEGER);
    $tt_truth$ = defparameter("*TT-TRUTH*", $kw32$TRUE);
    $tt_step_fn$ = defparameter("*TT-STEP-FN*", NIL);
    $tt_transitive_conduitP$ = defparameter("*TT-TRANSITIVE-CONDUIT?*", NIL);
    $gt_transitive_via_arg_activeP$ = defparameter("*GT-TRANSITIVE-VIA-ARG-ACTIVE?*", T);
    $gt_within_transitive_via_argP$ = defparameter("*GT-WITHIN-TRANSITIVE-VIA-ARG?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_gt_vars_file() {
        {
      SubLObject item_var = $sym1$_GT_DISPATCH_TABLE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym1$_GT_DISPATCH_TABLE_, $str2$table_used_to_dispatch_gt_methods);
    {
      SubLObject item_var = $sym4$_GT_METHODS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym4$_GT_METHODS_, $str5$candidate_methods_for_gt_modules);
    {
      SubLObject item_var = $sym7$_GT_PARAMETERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym7$_GT_PARAMETERS_, $str8$candidate_parameters_for_gt_metho);
    {
      SubLObject item_var = $sym9$_TRANSITIVITY_MODULES_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym9$_TRANSITIVITY_MODULES_, $str10$all_cyc_modules_defined_using_the);
    {
      SubLObject item_var = $sym11$_GT_PRED_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym11$_GT_PRED_, $str12$transitive_predicate_used_for_cur);
    {
      SubLObject item_var = $sym13$_GT_INDEX_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym13$_GT_INDEX_, $str14$arg_used_as_initial_index_for_cur);
    {
      SubLObject item_var = $sym15$_GT_GATHER_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym15$_GT_GATHER_, $str16$arg_used_as_initial_gather__e_g__);
    {
      SubLObject item_var = $sym17$_GT_INDEX_ARG_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym17$_GT_INDEX_ARG_, $str18$indexing_arg_position_used_for_cu);
    {
      SubLObject item_var = $sym19$_GT_GATHER_ARG_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym19$_GT_GATHER_ARG_, $str20$gathering_arg_position_used_for_c);
    {
      SubLObject item_var = $sym21$_GT_ACCESSORS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym21$_GT_ACCESSORS_, $str22$accessors_used_for_current_gt_que);
    {
      SubLObject item_var = $sym24$_GT_LINK_TYPE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym24$_GT_LINK_TYPE_, $str25$type_of_links_used_in_gt_module);
    {
      SubLObject item_var = $sym27$_GT_MODE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym27$_GT_MODE_, $str28$mode__e_g___direction__of_search_);
    {
      SubLObject item_var = $sym30$_GT_MODES_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym30$_GT_MODES_, $str31$candidate_modes_for_gt_search);
    {
      SubLObject item_var = $sym33$_GT_TRUTH_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym33$_GT_TRUTH_, $str34$truth_relevant_to_the_current_gt_);
    {
      SubLObject item_var = $sym35$_GT_QUERY_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym35$_GT_QUERY_, $str36$literal_denoting_query_formula_of);
    {
      SubLObject item_var = $sym37$_GT_DONE__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym37$_GT_DONE__, $str38$terminate_the_current_gt_search_);
    {
      SubLObject item_var = $sym39$_GT_SEARCHED__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym39$_GT_SEARCHED__, $str40$current_gt_search_path_encountere);
    {
      SubLObject item_var = $sym41$_GT_TARGET_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym41$_GT_TARGET_, $str42$target_of_current_gt_search);
    {
      SubLObject item_var = $sym43$_GT_RESULT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym43$_GT_RESULT_, $str44$accumlates_results_of_current_gt_);
    {
      SubLObject item_var = $sym45$_GT_SEARCHER_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym45$_GT_SEARCHER_, $str46$current_searcher_during_multiple_);
    {
      SubLObject item_var = $sym47$_GT_BASE_FN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym47$_GT_BASE_FN_, $str48$fn_applied_to_each_candidate_node);
    {
      SubLObject item_var = $sym49$_GT_STEP_FN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym49$_GT_STEP_FN_, $str50$fn_used_to_step_from_one_node_to_);
    {
      SubLObject item_var = $sym51$_GT_COMPOSE_FN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym51$_GT_COMPOSE_FN_, $str52$fn_applied_to_each_accessed_node_);
    {
      SubLObject item_var = $sym53$_GT_GATHER_FN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym53$_GT_GATHER_FN_, $str54$fn_applied_to_each_accessed_node_);
    {
      SubLObject item_var = $sym56$_GT_COMBINE_FN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym56$_GT_COMBINE_FN_, $str57$fn_used_to_combine_results_of_com);
    {
      SubLObject item_var = $sym58$_GT_COMPARE_FN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym58$_GT_COMPARE_FN_, $str59$test_used_to_compare_each_accesse);
    {
      SubLObject item_var = $sym60$_GT_EQUALITY_FN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym60$_GT_EQUALITY_FN_, $str61$equality_test_used_to_remove_dupl);
    {
      SubLObject item_var = $sym62$_GT_COMPOSE_PRED_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym62$_GT_COMPOSE_PRED_, $str63$composing_predicate_used_for_curr);
    {
      SubLObject item_var = $sym64$_GT_COMPOSE_INDEX_ARG_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym64$_GT_COMPOSE_INDEX_ARG_, $str65$indexing_arg_position_used_for_co);
    {
      SubLObject item_var = $sym66$_GT_COMPOSE_GATHER_ARG_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym66$_GT_COMPOSE_GATHER_ARG_, $str67$gathering_arg_position_used_for_c);
    {
      SubLObject item_var = $sym69$_GT_MAX_NODES_DIRECTION_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym69$_GT_MAX_NODES_DIRECTION_, $str70$default_search_direction_when_com);
    {
      SubLObject item_var = $sym71$_GT_USE_SPEC_PREDS__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym71$_GT_USE_SPEC_PREDS__, $str72$use_spec_preds_during_gt_searches);
    {
      SubLObject item_var = $sym73$_GT_HANDLE_NON_TRANSITIVE_PREDICATE__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym73$_GT_HANDLE_NON_TRANSITIVE_PREDICATE__, $str74$make_gt_modules_applicable_to_non);
    {
      SubLObject item_var = $sym77$_GT_WHAT_MTS_RESULT_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym77$_GT_WHAT_MTS_RESULT_, $str78$result_holder_for_what_mts);
    {
      SubLObject item_var = $sym79$_GT_WHAT_MTS_GOAL_NODE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym79$_GT_WHAT_MTS_GOAL_NODE_, $str80$goal_node_of_in_what_mt_searches);
    {
      SubLObject item_var = $sym81$_GT_PATH_LIST_OF_MTS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym81$_GT_PATH_LIST_OF_MTS_, $str82$list_of_mts_along_current_path);
    {
      SubLObject item_var = $sym83$_GT_PATH_LIST_OF_NODES_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym83$_GT_PATH_LIST_OF_NODES_, $str84$path_list_of_nodes__accumulated_t);
    {
      SubLObject item_var = $sym85$_GT_PATH_LENGTH_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym85$_GT_PATH_LENGTH_, $str86$length_of_current_mt_path);
    {
      SubLObject item_var = $sym87$_GT_LIST_OF_PATH_LENGTHS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym87$_GT_LIST_OF_PATH_LENGTHS_, $str88$list_of_path_lengths_in_order);
    {
      SubLObject item_var = $sym89$_GT_MARKING_TABLE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym89$_GT_MARKING_TABLE_, $str90$the_hash_table_where_we_do_the_ma);
    {
      SubLObject item_var = $sym91$_GT_TARGET_MARKING_TABLE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym91$_GT_TARGET_MARKING_TABLE_, $str92$used_for_the_occasional_nested_se);
    {
      SubLObject item_var = $sym93$_GT_DEPTH_CUTOFF_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym93$_GT_DEPTH_CUTOFF_, $str94$depth_cutoff_for_the_search);
    {
      SubLObject item_var = $sym95$_GT_DEPTH_CUTOFF__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym95$_GT_DEPTH_CUTOFF__, $str96$flag_for_whether_or_not_to_use_de);
    {
      SubLObject item_var = $sym97$_GT_PREV_DEPTH_CUTOFF_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym97$_GT_PREV_DEPTH_CUTOFF_, $str98$what_the_previous_depth_cutoff_wa);
    {
      SubLObject item_var = $sym99$_GT_TIME_CUTOFF__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym99$_GT_TIME_CUTOFF__, $str100$flag_for_whether_or_not_to_use_ti);
    {
      SubLObject item_var = $sym101$_GT_TIME_CUTOFF_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym101$_GT_TIME_CUTOFF_, $str102$time_cutoff__in_seconds__for_the_);
    {
      SubLObject item_var = $sym103$_GT_INITIAL_TIME_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym103$_GT_INITIAL_TIME_, $str104$when_did_the_timing_begin_);
    {
      SubLObject item_var = $sym105$_GT_ANSWERS_CUTOFF__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym105$_GT_ANSWERS_CUTOFF__, $str106$flag_for_whether_or_not_to_use_nu);
    {
      SubLObject item_var = $sym107$_GT_ANSWERS_CUTOFF_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym107$_GT_ANSWERS_CUTOFF_, $str108$number_of_answers_after_which_we_);
    {
      SubLObject item_var = $sym109$_GT_ANSWERS_SO_FAR_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym109$_GT_ANSWERS_SO_FAR_, $str110$accumulator_for_number_of_answers);
    {
      SubLObject item_var = $sym111$_GT_GOAL_NODE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym111$_GT_GOAL_NODE_, $str112$goal_node);
    {
      SubLObject item_var = $sym113$_GT_EDGE_LIST_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym113$_GT_EDGE_LIST_, $str114$list_of_edges_along_search__for_g);
    {
      SubLObject item_var = $sym115$_GT_EDGE_LIST_RETURN__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym115$_GT_EDGE_LIST_RETURN__, $str116$are_we_gather_edge_lists_);
    {
      SubLObject item_var = $sym117$_GT_PATH_LIST_OF_ASSERTIONS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym117$_GT_PATH_LIST_OF_ASSERTIONS_, $str118$list_of_assertions_along_search__);
    {
      SubLObject item_var = $sym119$_GT_CYCLICAL_EDGES_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym119$_GT_CYCLICAL_EDGES_, $str120$list_of_pairs__a_b___where_a_is_t);
    {
      SubLObject item_var = $sym121$_GT_TRACE_LEVEL_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym121$_GT_TRACE_LEVEL_, $str122$controls_extent_of_tracing__warni);
    {
      SubLObject item_var = $sym123$_GT_TEST_LEVEL_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym123$_GT_TEST_LEVEL_, $str124$controls_extent_of_testing_for_th);
    {
      SubLObject item_var = $sym125$_SUSPEND_GT_TYPE_CHECKING__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym125$_SUSPEND_GT_TYPE_CHECKING__, $str126$skip_type_checking_during_gt_quer);
    {
      SubLObject item_var = $sym127$_GT_WARNINGS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym127$_GT_WARNINGS_, $str128$warnings_from_transitiviy_module_);
    {
      SubLObject item_var = $sym150$_TT_DISPATCH_TABLE_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym150$_TT_DISPATCH_TABLE_, $str151$table_used_to_dispatch_tt_methods);
    {
      SubLObject item_var = $sym152$_TT_METHODS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym152$_TT_METHODS_, $str5$candidate_methods_for_gt_modules);
    {
      SubLObject item_var = $sym153$_TRANSFERS_THROUGH_MODULES_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym153$_TRANSFERS_THROUGH_MODULES_, $str154$all_cyc_modules_defined_using_the);
    {
      SubLObject item_var = $sym156$_TT_PARAMETERS_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym156$_TT_PARAMETERS_, $str157$candidate_parameters_for_tt_metho);
    {
      SubLObject item_var = $sym158$_TT_PRED_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym158$_TT_PRED_, $str159$transitive_predicate_used_for_cur);
    {
      SubLObject item_var = $sym160$_TT_INDEX_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym160$_TT_INDEX_, $str161$arg_used_as_initial_index_for_cur);
    {
      SubLObject item_var = $sym162$_TT_GATHER_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym162$_TT_GATHER_, $str163$arg_used_as_initial_gather__e_g__);
    {
      SubLObject item_var = $sym164$_TT_INDEX_ARG_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym164$_TT_INDEX_ARG_, $str165$indexing_arg_position_used_for_cu);
    {
      SubLObject item_var = $sym166$_TT_GATHER_ARG_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym166$_TT_GATHER_ARG_, $str167$gathering_arg_position_used_for_c);
    {
      SubLObject item_var = $sym168$_TT_TRUTH_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym168$_TT_TRUTH_, $str34$truth_relevant_to_the_current_gt_);
    {
      SubLObject item_var = $sym169$_TT_STEP_FN_;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym169$_TT_STEP_FN_, $str170$fn_used_to_step_from_one_node_to_);
    {
      SubLObject item_var = $sym171$_TT_TRANSITIVE_CONDUIT__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym171$_TT_TRANSITIVE_CONDUIT__, $str172$is_conduit_arg_transitive_in_curr);
    {
      SubLObject item_var = $sym178$_GT_TRANSITIVE_VIA_ARG_ACTIVE__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym178$_GT_TRANSITIVE_VIA_ARG_ACTIVE__, $str179$is_the_gt_transitive_via_arg_modu);
    {
      SubLObject item_var = $sym180$_GT_WITHIN_TRANSITIVE_VIA_ARG__;
      if ((NIL == conses_high.member(item_var, utilities_macros.$gt_state_variables$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
        utilities_macros.$gt_state_variables$.setGlobalValue(cons(item_var, utilities_macros.$gt_state_variables$.getGlobalValue()));
      }
    }
    utilities_macros.note_state_variable_documentation($sym180$_GT_WITHIN_TRANSITIVE_VIA_ARG__, $str181$currently_within_scope_of_a_gt_tr);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(new SubLObject[] {list(makeKeyword("SUPERIORS"), makeSymbol("GTM-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("INFERIORS"), makeSymbol("GTM-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MIN-SUPERIORS"), makeSymbol("GTM-MIN-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MAX-INFERIORS"), makeSymbol("GTM-MAX-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("CO-INFERIORS"), makeSymbol("GTM-CO-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("CO-SUPERIORS"), makeSymbol("GTM-CO-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("REDUNDANT-SUPERIORS"), makeSymbol("GTM-REDUNDANT-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("REDUNDANT-INFERIORS"), makeSymbol("GTM-REDUNDANT-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-SUPERIORS"), makeSymbol("GTM-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-INFERIORS"), makeSymbol("GTM-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-ACCESSIBLE"), makeSymbol("GTM-ALL-ACCESSIBLE"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("UNION-ALL-INFERIORS"), makeSymbol("GTM-UNION-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("COMPOSE-FN-SUPERIORS"), makeSymbol("GTM-COMPOSE-FN-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), list(makeSymbol("QUOTE"), makeSymbol("NCONC"))), makeSymbol("MT"))), list(makeKeyword("COMPOSE-FN-INFERIORS"), makeSymbol("GTM-COMPOSE-FN-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), list(makeSymbol("COMBINE-FN"), list(makeSymbol("QUOTE"), makeSymbol("NCONC"))), makeSymbol("MT"))), list(makeKeyword("ALL-DEPENDENT-INFERIORS"), makeSymbol("GTM-ALL-DEPENDENT-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("COMPOSE-PRED-SUPERIORS"), makeSymbol("GTM-COMPOSE-PRED-ALL-SUPERIORS"), list(makeSymbol("FORT"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), list(makeSymbol("GATHER"), TWO_INTEGER), makeSymbol("MT"))), list(makeKeyword("COMPOSE-PRED-INFERIORS"), makeSymbol("GTM-COMPOSE-PRED-ALL-INFERIORS"), list(makeSymbol("FORT"), makeSymbol("PRED"), makeSymbol("&OPTIONAL"), list(makeSymbol("INDEX"), ONE_INTEGER), list(makeSymbol("GATHER"), TWO_INTEGER), makeSymbol("MT"))), list(makeKeyword("ROOTS"), makeSymbol("GTM-ROOTS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("LEAVES"), makeSymbol("GTM-LEAVES"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("BOOLEAN?"), makeSymbol("GTM-BOOLEAN?"), list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("SUPERIOR?"), makeSymbol("GTM-SUPERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("INFERIOR?"), makeSymbol("GTM-INFERIOR?"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("HAS-SUPERIOR?"), makeSymbol("GTM-HAS-SUPERIOR?"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("HAS-INFERIOR?"), makeSymbol("GTM-HAS-INFERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("GATHER-SUPERIOR"), makeSymbol("GTM-GATHER-SUPERIOR"), list(makeSymbol("SPEC"), makeSymbol("GATHER-FN"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("GATHER-INFERIOR"), makeSymbol("GTM-GATHER-INFERIOR"), list(makeSymbol("GENL"), makeSymbol("GATHER-FN"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("CYCLES?"), makeSymbol("GTM-CYCLES?"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("COMPLETES-CYCLE?"), makeSymbol("GTM-COMPLETES-CYCLE?"), list(makeSymbol("FORT-1"), makeSymbol("FORT-2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MIN-NODES"), makeSymbol("GTM-MIN-NODES"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MAX-NODES"), makeSymbol("GTM-MAX-NODES"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MIN-CEILINGS"), makeSymbol("GTM-MIN-CEILINGS"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"))), list(makeKeyword("MAX-FLOORS"), makeSymbol("GTM-MAX-FLOORS"), list(makeSymbol("FORTS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"))), list(makeKeyword("MIN-SUPERIORS-EXCLUDING"), makeSymbol("GTM-MIN-SUPERIORS-EXCLUDING"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("MAX-INFERIORS-EXCLUDING"), makeSymbol("GTM-MAX-INFERIORS-EXCLUDING"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ANY-SUPERIOR-PATH"), makeSymbol("GTM-ANY-SUPERIOR-PATH"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("WHY-SUPERIOR?"), makeSymbol("GTM-WHY-SUPERIOR?"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("WHY-COMPLETES-CYCLE?"), makeSymbol("GTM-WHY-COMPLETES-CYCLE?"), list(makeSymbol("FORT1"), makeSymbol("FORT2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-SUPERIOR-EDGES"), makeSymbol("GTM-ALL-SUPERIOR-EDGES"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-INFERIOR-EDGES"), makeSymbol("GTM-ALL-INFERIOR-EDGES"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-PATHS"), makeSymbol("GTM-ALL-PATHS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("INFERIORS-WITH-MTS"), makeSymbol("GTM-ALL-INFERIORS-WITH-MTS"), list(makeSymbol("SUPERIOR"))), list(makeKeyword("SUPERIOR-IN-WHAT-MTS"), makeSymbol("GTM-IN-WHAT-MTS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("KEY-METHOD"))), list(makeKeyword("INFERIOR-IN-WHAT-MTS"), makeSymbol("GTM-IN-WHAT-MTS"), list(makeSymbol("SUPERIOR"), makeSymbol("INFERIOR"), makeSymbol("KEY-METHOD"))), list(makeKeyword("ACCESSIBLE-IN-WHAT-MTS"), makeSymbol("GTM-ACCESSIBLE-IN-WHAT-MTS"), list(makeSymbol("INFERIOR"), makeSymbol("SUPERIOR"), makeSymbol("KEY-METHOD")))});
  public static final SubLSymbol $sym1$_GT_DISPATCH_TABLE_ = makeSymbol("*GT-DISPATCH-TABLE*");
  public static final SubLString $str2$table_used_to_dispatch_gt_methods = makeString("table used to dispatch gt methods as actual calls on gt executables");
  public static final SubLSymbol $sym3$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym4$_GT_METHODS_ = makeSymbol("*GT-METHODS*");
  public static final SubLString $str5$candidate_methods_for_gt_modules = makeString("candidate methods for gt modules");
  public static final SubLList $list6 = list(makeKeyword("PREDICATE"), makeKeyword("INDEX-ARG"), makeKeyword("GATHER-ARG"), makeKeyword("ACCESSORS"), makeKeyword("MT"));
  public static final SubLSymbol $sym7$_GT_PARAMETERS_ = makeSymbol("*GT-PARAMETERS*");
  public static final SubLString $str8$candidate_parameters_for_gt_metho = makeString("candidate parameters for gt methods");
  public static final SubLSymbol $sym9$_TRANSITIVITY_MODULES_ = makeSymbol("*TRANSITIVITY-MODULES*");
  public static final SubLString $str10$all_cyc_modules_defined_using_the = makeString("all cyc modules defined using the general transitivity module");
  public static final SubLSymbol $sym11$_GT_PRED_ = makeSymbol("*GT-PRED*");
  public static final SubLString $str12$transitive_predicate_used_for_cur = makeString("transitive predicate used for current gt query");
  public static final SubLSymbol $sym13$_GT_INDEX_ = makeSymbol("*GT-INDEX*");
  public static final SubLString $str14$arg_used_as_initial_index_for_cur = makeString("arg used as initial index for current gt query");
  public static final SubLSymbol $sym15$_GT_GATHER_ = makeSymbol("*GT-GATHER*");
  public static final SubLString $str16$arg_used_as_initial_gather__e_g__ = makeString("arg used as initial gather (e.g., search target) for current gt query");
  public static final SubLSymbol $sym17$_GT_INDEX_ARG_ = makeSymbol("*GT-INDEX-ARG*");
  public static final SubLString $str18$indexing_arg_position_used_for_cu = makeString("indexing arg position used for current gt query");
  public static final SubLSymbol $sym19$_GT_GATHER_ARG_ = makeSymbol("*GT-GATHER-ARG*");
  public static final SubLString $str20$gathering_arg_position_used_for_c = makeString("gathering arg position used for current gt query");
  public static final SubLSymbol $sym21$_GT_ACCESSORS_ = makeSymbol("*GT-ACCESSORS*");
  public static final SubLString $str22$accessors_used_for_current_gt_que = makeString("accessors used for current gt query");
  public static final SubLSymbol $kw23$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLSymbol $sym24$_GT_LINK_TYPE_ = makeSymbol("*GT-LINK-TYPE*");
  public static final SubLString $str25$type_of_links_used_in_gt_module = makeString("type of links used in gt module");
  public static final SubLSymbol $kw26$SUPERIOR = makeKeyword("SUPERIOR");
  public static final SubLSymbol $sym27$_GT_MODE_ = makeSymbol("*GT-MODE*");
  public static final SubLString $str28$mode__e_g___direction__of_search_ = makeString("mode (e.g., direction) of search during gt query");
  public static final SubLList $list29 = list(makeKeyword("SUPERIOR"), makeKeyword("INFERIOR"), makeKeyword("ACCESSIBLE"), makeKeyword("DIRECTED"), makeKeyword("INVERSE"));
  public static final SubLSymbol $sym30$_GT_MODES_ = makeSymbol("*GT-MODES*");
  public static final SubLString $str31$candidate_modes_for_gt_search = makeString("candidate modes for gt search");
  public static final SubLSymbol $kw32$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym33$_GT_TRUTH_ = makeSymbol("*GT-TRUTH*");
  public static final SubLString $str34$truth_relevant_to_the_current_gt_ = makeString("truth relevant to the current gt query [:true :false]");
  public static final SubLSymbol $sym35$_GT_QUERY_ = makeSymbol("*GT-QUERY*");
  public static final SubLString $str36$literal_denoting_query_formula_of = makeString("literal denoting query formula of current gt query");
  public static final SubLSymbol $sym37$_GT_DONE__ = makeSymbol("*GT-DONE?*");
  public static final SubLString $str38$terminate_the_current_gt_search_ = makeString("terminate the current gt search?");
  public static final SubLSymbol $sym39$_GT_SEARCHED__ = makeSymbol("*GT-SEARCHED?*");
  public static final SubLString $str40$current_gt_search_path_encountere = makeString("current gt search path encountered searched nodes");
  public static final SubLSymbol $sym41$_GT_TARGET_ = makeSymbol("*GT-TARGET*");
  public static final SubLString $str42$target_of_current_gt_search = makeString("target of current gt search");
  public static final SubLSymbol $sym43$_GT_RESULT_ = makeSymbol("*GT-RESULT*");
  public static final SubLString $str44$accumlates_results_of_current_gt_ = makeString("accumlates results of current gt query");
  public static final SubLSymbol $sym45$_GT_SEARCHER_ = makeSymbol("*GT-SEARCHER*");
  public static final SubLString $str46$current_searcher_during_multiple_ = makeString("current searcher during multiple-searcher gt search");
  public static final SubLSymbol $sym47$_GT_BASE_FN_ = makeSymbol("*GT-BASE-FN*");
  public static final SubLString $str48$fn_applied_to_each_candidate_node = makeString("fn applied to each candidate node during gt search");
  public static final SubLSymbol $sym49$_GT_STEP_FN_ = makeSymbol("*GT-STEP-FN*");
  public static final SubLString $str50$fn_used_to_step_from_one_node_to_ = makeString("fn used to step from one node to another during gt closure search");
  public static final SubLSymbol $sym51$_GT_COMPOSE_FN_ = makeSymbol("*GT-COMPOSE-FN*");
  public static final SubLString $str52$fn_applied_to_each_accessed_node_ = makeString("fn applied to each accessed node during composing gt search");
  public static final SubLSymbol $sym53$_GT_GATHER_FN_ = makeSymbol("*GT-GATHER-FN*");
  public static final SubLString $str54$fn_applied_to_each_accessed_node_ = makeString("fn applied to each accessed node durung a gather gt search");
  public static final SubLSymbol $sym55$NCONC = makeSymbol("NCONC");
  public static final SubLSymbol $sym56$_GT_COMBINE_FN_ = makeSymbol("*GT-COMBINE-FN*");
  public static final SubLString $str57$fn_used_to_combine_results_of_com = makeString("fn used to combine results of composing fn applied to each accessed node");
  public static final SubLSymbol $sym58$_GT_COMPARE_FN_ = makeSymbol("*GT-COMPARE-FN*");
  public static final SubLString $str59$test_used_to_compare_each_accesse = makeString("test used to compare each accessed node with target during gt search");
  public static final SubLSymbol $sym60$_GT_EQUALITY_FN_ = makeSymbol("*GT-EQUALITY-FN*");
  public static final SubLString $str61$equality_test_used_to_remove_dupl = makeString("equality test used to remove duplicates from non-fort results during gt search");
  public static final SubLSymbol $sym62$_GT_COMPOSE_PRED_ = makeSymbol("*GT-COMPOSE-PRED*");
  public static final SubLString $str63$composing_predicate_used_for_curr = makeString("composing predicate used for current composing gt query");
  public static final SubLSymbol $sym64$_GT_COMPOSE_INDEX_ARG_ = makeSymbol("*GT-COMPOSE-INDEX-ARG*");
  public static final SubLString $str65$indexing_arg_position_used_for_co = makeString("indexing arg position used for composing pred in current gt query");
  public static final SubLSymbol $sym66$_GT_COMPOSE_GATHER_ARG_ = makeSymbol("*GT-COMPOSE-GATHER-ARG*");
  public static final SubLString $str67$gathering_arg_position_used_for_c = makeString("gathering arg position used for composing pred in current gt query");
  public static final SubLSymbol $kw68$DOWN = makeKeyword("DOWN");
  public static final SubLSymbol $sym69$_GT_MAX_NODES_DIRECTION_ = makeSymbol("*GT-MAX-NODES-DIRECTION*");
  public static final SubLString $str70$default_search_direction_when_com = makeString("default search direction when computing gt-max-nodes");
  public static final SubLSymbol $sym71$_GT_USE_SPEC_PREDS__ = makeSymbol("*GT-USE-SPEC-PREDS?*");
  public static final SubLString $str72$use_spec_preds_during_gt_searches = makeString("use spec preds during gt searches?");
  public static final SubLSymbol $sym73$_GT_HANDLE_NON_TRANSITIVE_PREDICATE__ = makeSymbol("*GT-HANDLE-NON-TRANSITIVE-PREDICATE?*");
  public static final SubLString $str74$make_gt_modules_applicable_to_non = makeString("make gt modules applicable to non-transitive predicates?");
  public static final SubLString $str75$Current_link_support__a_is_not_a_ = makeString("Current link support ~a is not a valid support for determining link mt.");
  public static final SubLString $str76$Current_link_support__a_is_not_a_ = makeString("Current link support ~a is not a valid support for determining link predicate.");
  public static final SubLSymbol $sym77$_GT_WHAT_MTS_RESULT_ = makeSymbol("*GT-WHAT-MTS-RESULT*");
  public static final SubLString $str78$result_holder_for_what_mts = makeString("result holder for what-mts");
  public static final SubLSymbol $sym79$_GT_WHAT_MTS_GOAL_NODE_ = makeSymbol("*GT-WHAT-MTS-GOAL-NODE*");
  public static final SubLString $str80$goal_node_of_in_what_mt_searches = makeString("goal node of in-what-mt searches");
  public static final SubLSymbol $sym81$_GT_PATH_LIST_OF_MTS_ = makeSymbol("*GT-PATH-LIST-OF-MTS*");
  public static final SubLString $str82$list_of_mts_along_current_path = makeString("list of mts along current path");
  public static final SubLSymbol $sym83$_GT_PATH_LIST_OF_NODES_ = makeSymbol("*GT-PATH-LIST-OF-NODES*");
  public static final SubLString $str84$path_list_of_nodes__accumulated_t = makeString("path list of nodes, accumulated to guard against cycles");
  public static final SubLSymbol $sym85$_GT_PATH_LENGTH_ = makeSymbol("*GT-PATH-LENGTH*");
  public static final SubLString $str86$length_of_current_mt_path = makeString("length of current mt path");
  public static final SubLSymbol $sym87$_GT_LIST_OF_PATH_LENGTHS_ = makeSymbol("*GT-LIST-OF-PATH-LENGTHS*");
  public static final SubLString $str88$list_of_path_lengths_in_order = makeString("list of path lengths in order");
  public static final SubLSymbol $sym89$_GT_MARKING_TABLE_ = makeSymbol("*GT-MARKING-TABLE*");
  public static final SubLString $str90$the_hash_table_where_we_do_the_ma = makeString("the hash table where we do the marking (usually dynamic)");
  public static final SubLSymbol $sym91$_GT_TARGET_MARKING_TABLE_ = makeSymbol("*GT-TARGET-MARKING-TABLE*");
  public static final SubLString $str92$used_for_the_occasional_nested_se = makeString("used for the occasional nested search");
  public static final SubLSymbol $sym93$_GT_DEPTH_CUTOFF_ = makeSymbol("*GT-DEPTH-CUTOFF*");
  public static final SubLString $str94$depth_cutoff_for_the_search = makeString("depth cutoff for the search");
  public static final SubLSymbol $sym95$_GT_DEPTH_CUTOFF__ = makeSymbol("*GT-DEPTH-CUTOFF?*");
  public static final SubLString $str96$flag_for_whether_or_not_to_use_de = makeString("flag for whether or not to use depth cutoff");
  public static final SubLSymbol $sym97$_GT_PREV_DEPTH_CUTOFF_ = makeSymbol("*GT-PREV-DEPTH-CUTOFF*");
  public static final SubLString $str98$what_the_previous_depth_cutoff_wa = makeString("what the previous depth cutoff was, used for iterive deepening");
  public static final SubLSymbol $sym99$_GT_TIME_CUTOFF__ = makeSymbol("*GT-TIME-CUTOFF?*");
  public static final SubLString $str100$flag_for_whether_or_not_to_use_ti = makeString("flag for whether or not to use time cutoff");
  public static final SubLSymbol $sym101$_GT_TIME_CUTOFF_ = makeSymbol("*GT-TIME-CUTOFF*");
  public static final SubLString $str102$time_cutoff__in_seconds__for_the_ = makeString("time cutoff, in seconds, for the search");
  public static final SubLSymbol $sym103$_GT_INITIAL_TIME_ = makeSymbol("*GT-INITIAL-TIME*");
  public static final SubLString $str104$when_did_the_timing_begin_ = makeString("when did the timing begin?");
  public static final SubLSymbol $sym105$_GT_ANSWERS_CUTOFF__ = makeSymbol("*GT-ANSWERS-CUTOFF?*");
  public static final SubLString $str106$flag_for_whether_or_not_to_use_nu = makeString("flag for whether or not to use number of answers cutoff");
  public static final SubLSymbol $sym107$_GT_ANSWERS_CUTOFF_ = makeSymbol("*GT-ANSWERS-CUTOFF*");
  public static final SubLString $str108$number_of_answers_after_which_we_ = makeString("number of answers after which we are done searching");
  public static final SubLSymbol $sym109$_GT_ANSWERS_SO_FAR_ = makeSymbol("*GT-ANSWERS-SO-FAR*");
  public static final SubLString $str110$accumulator_for_number_of_answers = makeString("accumulator for number of answers so far");
  public static final SubLSymbol $sym111$_GT_GOAL_NODE_ = makeSymbol("*GT-GOAL-NODE*");
  public static final SubLString $str112$goal_node = makeString("goal node");
  public static final SubLSymbol $sym113$_GT_EDGE_LIST_ = makeSymbol("*GT-EDGE-LIST*");
  public static final SubLString $str114$list_of_edges_along_search__for_g = makeString("list of edges along search, for graphing");
  public static final SubLSymbol $sym115$_GT_EDGE_LIST_RETURN__ = makeSymbol("*GT-EDGE-LIST-RETURN?*");
  public static final SubLString $str116$are_we_gather_edge_lists_ = makeString("are we gather edge lists?");
  public static final SubLSymbol $sym117$_GT_PATH_LIST_OF_ASSERTIONS_ = makeSymbol("*GT-PATH-LIST-OF-ASSERTIONS*");
  public static final SubLString $str118$list_of_assertions_along_search__ = makeString("list of assertions along search. for graphing");
  public static final SubLSymbol $sym119$_GT_CYCLICAL_EDGES_ = makeSymbol("*GT-CYCLICAL-EDGES*");
  public static final SubLString $str120$list_of_pairs__a_b___where_a_is_t = makeString("list of pairs (a b), where a is the node in the search upon\n  which the cycle was discovered, and b is the edge list of a cycle it belongs to");
  public static final SubLSymbol $sym121$_GT_TRACE_LEVEL_ = makeSymbol("*GT-TRACE-LEVEL*");
  public static final SubLString $str122$controls_extent_of_tracing__warni = makeString("controls extent of tracing, warnings, etc., for the general transitivity module [0 .. 5]");
  public static final SubLSymbol $sym123$_GT_TEST_LEVEL_ = makeSymbol("*GT-TEST-LEVEL*");
  public static final SubLString $str124$controls_extent_of_testing_for_th = makeString("controls extent of testing for the general transitivity module [0 .. 5]");
  public static final SubLSymbol $sym125$_SUSPEND_GT_TYPE_CHECKING__ = makeSymbol("*SUSPEND-GT-TYPE-CHECKING?*");
  public static final SubLString $str126$skip_type_checking_during_gt_quer = makeString("skip type checking during gt queries?");
  public static final SubLSymbol $sym127$_GT_WARNINGS_ = makeSymbol("*GT-WARNINGS*");
  public static final SubLString $str128$warnings_from_transitiviy_module_ = makeString("warnings from transitiviy module; possible values: :invalid-module :invalid-method");
  public static final SubLList $list129 = list(makeSymbol("MODULE"), makeSymbol("PLIST"));
  public static final SubLSymbol $kw130$ACCESSORS = makeKeyword("ACCESSORS");
  public static final SubLSymbol $kw131$PREDICATE = makeKeyword("PREDICATE");
  public static final SubLSymbol $kw132$INDEX_ARG = makeKeyword("INDEX-ARG");
  public static final SubLSymbol $kw133$GATHER_ARG = makeKeyword("GATHER-ARG");
  public static final SubLSymbol $kw134$MT = makeKeyword("MT");
  public static final SubLSymbol $sym135$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym136$CLET = makeSymbol("CLET");
  public static final SubLList $list137 = list(makeSymbol("RESULT"));
  public static final SubLList $list138 = list(makeSymbol("*GT-LINK-TYPE*"), makeKeyword("ASSERTION"));
  public static final SubLList $list139 = list(list(makeSymbol("*GT-MARKING-TABLE*"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(128))));
  public static final SubLSymbol $sym140$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym141$RESULT = makeSymbol("RESULT");
  public static final SubLList $list142 = list(list(makeSymbol("RET"), makeSymbol("RESULT")));
  public static final SubLSymbol $sym143$QUOTE = makeSymbol("QUOTE");
  public static final SubLList $list144 = list(list(makeSymbol("*GT-LINK-TYPE*"), makeKeyword("ACCESSORS")));
  public static final SubLSymbol $sym145$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym146$SETUP_TRANSITIVITY_MODULE = makeSymbol("SETUP-TRANSITIVITY-MODULE");
  public static final SubLSymbol $sym147$CPUSHNEW = makeSymbol("CPUSHNEW");
  public static final SubLList $list148 = list(makeSymbol("*TRANSITIVITY-MODULES*"));
  public static final SubLList $list149 = list(list(makeKeyword("ALL-TARGETS"), makeSymbol("TTM-ALL-TARGETS"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ALL-SOURCES"), makeSymbol("TTM-ALL-SOURCES"), list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("BOOLEAN?"), makeSymbol("TTM-BOOLEAN?"), list(makeSymbol("FORT"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"))), list(makeKeyword("ACCESSES-IN-WHAT-MTS"), makeSymbol("TTM-ACCESSES-IN-WHAT-MTS"), list(makeSymbol("FORT"), makeSymbol("TERM"))));
  public static final SubLSymbol $sym150$_TT_DISPATCH_TABLE_ = makeSymbol("*TT-DISPATCH-TABLE*");
  public static final SubLString $str151$table_used_to_dispatch_tt_methods = makeString("table used to dispatch tt methods as actual calls on tt executables");
  public static final SubLSymbol $sym152$_TT_METHODS_ = makeSymbol("*TT-METHODS*");
  public static final SubLSymbol $sym153$_TRANSFERS_THROUGH_MODULES_ = makeSymbol("*TRANSFERS-THROUGH-MODULES*");
  public static final SubLString $str154$all_cyc_modules_defined_using_the = makeString("all cyc modules defined using the general transfers-through module");
  public static final SubLList $list155 = list(makeKeyword("PREDICATE"), makeKeyword("CONDUIT-PRED"), makeKeyword("TT-INDEX-ARG"), makeKeyword("TT-GATHER-ARG"), makeKeyword("GT-INDEX-ARG"), makeKeyword("GT-GATHER-ARG"), makeKeyword("MT"));
  public static final SubLSymbol $sym156$_TT_PARAMETERS_ = makeSymbol("*TT-PARAMETERS*");
  public static final SubLString $str157$candidate_parameters_for_tt_metho = makeString("candidate parameters for tt methods");
  public static final SubLSymbol $sym158$_TT_PRED_ = makeSymbol("*TT-PRED*");
  public static final SubLString $str159$transitive_predicate_used_for_cur = makeString("transitive predicate used for current tt query");
  public static final SubLSymbol $sym160$_TT_INDEX_ = makeSymbol("*TT-INDEX*");
  public static final SubLString $str161$arg_used_as_initial_index_for_cur = makeString("arg used as initial index for current tt query");
  public static final SubLSymbol $sym162$_TT_GATHER_ = makeSymbol("*TT-GATHER*");
  public static final SubLString $str163$arg_used_as_initial_gather__e_g__ = makeString("arg used as initial gather (e.g., search target) for current tt query");
  public static final SubLSymbol $sym164$_TT_INDEX_ARG_ = makeSymbol("*TT-INDEX-ARG*");
  public static final SubLString $str165$indexing_arg_position_used_for_cu = makeString("indexing arg position used for current tt query");
  public static final SubLSymbol $sym166$_TT_GATHER_ARG_ = makeSymbol("*TT-GATHER-ARG*");
  public static final SubLString $str167$gathering_arg_position_used_for_c = makeString("gathering arg position used for current tt query");
  public static final SubLSymbol $sym168$_TT_TRUTH_ = makeSymbol("*TT-TRUTH*");
  public static final SubLSymbol $sym169$_TT_STEP_FN_ = makeSymbol("*TT-STEP-FN*");
  public static final SubLString $str170$fn_used_to_step_from_one_node_to_ = makeString("fn used to step from one node to another during tt search");
  public static final SubLSymbol $sym171$_TT_TRANSITIVE_CONDUIT__ = makeSymbol("*TT-TRANSITIVE-CONDUIT?*");
  public static final SubLString $str172$is_conduit_arg_transitive_in_curr = makeString("is conduit-arg transitive in current tt search?");
  public static final SubLSymbol $kw173$CONDUIT_PRED = makeKeyword("CONDUIT-PRED");
  public static final SubLSymbol $sym174$TRANSITIVE_PREDICATE_ = makeSymbol("TRANSITIVE-PREDICATE?");
  public static final SubLSymbol $sym175$GENERIC_TTM = makeSymbol("GENERIC-TTM");
  public static final SubLSymbol $sym176$SETUP_TRANSFERS_THROUGH_MODULE = makeSymbol("SETUP-TRANSFERS-THROUGH-MODULE");
  public static final SubLList $list177 = list(makeSymbol("*TRANSFERS-THROUGH-MODULES*"));
  public static final SubLSymbol $sym178$_GT_TRANSITIVE_VIA_ARG_ACTIVE__ = makeSymbol("*GT-TRANSITIVE-VIA-ARG-ACTIVE?*");
  public static final SubLString $str179$is_the_gt_transitive_via_arg_modu = makeString("is the gt-transitive-via-arg module active?");
  public static final SubLSymbol $sym180$_GT_WITHIN_TRANSITIVE_VIA_ARG__ = makeSymbol("*GT-WITHIN-TRANSITIVE-VIA-ARG?*");
  public static final SubLString $str181$currently_within_scope_of_a_gt_tr = makeString("currently within scope of a gt-transitive-via-arg module?");

  //// Initializers

  public void declareFunctions() {
    declare_gt_vars_file();
  }

  public void initializeVariables() {
    init_gt_vars_file();
  }

  public void runTopLevelForms() {
    setup_gt_vars_file();
  }

}
