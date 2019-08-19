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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class search extends SubLTranslatedFile {

  //// Constructor

  private search() {}
  public static final SubLFile me = new search();
  public static final String myName = "com.cyc.cycjava_1.cycl.search";

  //// Definitions

  public static final class $search_struc_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $tree; }
    public SubLObject getField3() { return $leaves; }
    public SubLObject getField4() { return $goals; }
    public SubLObject getField5() { return $no_leaves_p_func; }
    public SubLObject getField6() { return $next_node_func; }
    public SubLObject getField7() { return $goal_p_func; }
    public SubLObject getField8() { return $add_goal_func; }
    public SubLObject getField9() { return $options_func; }
    public SubLObject getField10() { return $expand_func; }
    public SubLObject getField11() { return $add_node_func; }
    public SubLObject getField12() { return $too_deep_func; }
    public SubLObject getField13() { return $state; }
    public SubLObject getField14() { return $print_func; }
    public SubLObject getField15() { return $limbo; }
    public SubLObject getField16() { return $current_node; }
    public SubLObject setField2(SubLObject value) { return $tree = value; }
    public SubLObject setField3(SubLObject value) { return $leaves = value; }
    public SubLObject setField4(SubLObject value) { return $goals = value; }
    public SubLObject setField5(SubLObject value) { return $no_leaves_p_func = value; }
    public SubLObject setField6(SubLObject value) { return $next_node_func = value; }
    public SubLObject setField7(SubLObject value) { return $goal_p_func = value; }
    public SubLObject setField8(SubLObject value) { return $add_goal_func = value; }
    public SubLObject setField9(SubLObject value) { return $options_func = value; }
    public SubLObject setField10(SubLObject value) { return $expand_func = value; }
    public SubLObject setField11(SubLObject value) { return $add_node_func = value; }
    public SubLObject setField12(SubLObject value) { return $too_deep_func = value; }
    public SubLObject setField13(SubLObject value) { return $state = value; }
    public SubLObject setField14(SubLObject value) { return $print_func = value; }
    public SubLObject setField15(SubLObject value) { return $limbo = value; }
    public SubLObject setField16(SubLObject value) { return $current_node = value; }
    public SubLObject $tree = NIL;
    public SubLObject $leaves = NIL;
    public SubLObject $goals = NIL;
    public SubLObject $no_leaves_p_func = NIL;
    public SubLObject $next_node_func = NIL;
    public SubLObject $goal_p_func = NIL;
    public SubLObject $add_goal_func = NIL;
    public SubLObject $options_func = NIL;
    public SubLObject $expand_func = NIL;
    public SubLObject $add_node_func = NIL;
    public SubLObject $too_deep_func = NIL;
    public SubLObject $state = NIL;
    public SubLObject $print_func = NIL;
    public SubLObject $limbo = NIL;
    public SubLObject $current_node = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($search_struc_native.class, $sym0$SEARCH_STRUC, $sym1$SEARCH_STRUC_P, $list2, $list3, new String[] {"$tree", "$leaves", "$goals", "$no_leaves_p_func", "$next_node_func", "$goal_p_func", "$add_goal_func", "$options_func", "$expand_func", "$add_node_func", "$too_deep_func", "$state", "$print_func", "$limbo", "$current_node"}, $list4, $list5, $sym6$PRINT_SEARCH);
  }

  @SubL(source = "cycl/search.lisp", position = 1113) 
  public static SubLSymbol $dtp_search_struc$ = null;

  @SubL(source = "cycl/search.lisp", position = 1113) 
  public static final SubLObject search_struc_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12679");
    return NIL;
  }

  public static final class $search_struc_p$UnaryFunction extends UnaryFunction {
    public $search_struc_p$UnaryFunction() { super(extractFunctionNamed("SEARCH-STRUC-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12688"); }
  }

  /** Free list for SEARCH-STRUC objects */
  @SubL(source = "cycl/search.lisp", position = 2243) 
  private static SubLSymbol $search_struc_free_list$ = null;

  /** Lock for SEARCH-STRUC object free list */
  @SubL(source = "cycl/search.lisp", position = 2243) 
  private static SubLSymbol $search_struc_free_lock$ = null;

  public static final class $search_node_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $search; }
    public SubLObject getField3() { return $parent; }
    public SubLObject getField4() { return $children; }
    public SubLObject getField5() { return $depth; }
    public SubLObject getField6() { return $options; }
    public SubLObject getField7() { return $state; }
    public SubLObject setField2(SubLObject value) { return $search = value; }
    public SubLObject setField3(SubLObject value) { return $parent = value; }
    public SubLObject setField4(SubLObject value) { return $children = value; }
    public SubLObject setField5(SubLObject value) { return $depth = value; }
    public SubLObject setField6(SubLObject value) { return $options = value; }
    public SubLObject setField7(SubLObject value) { return $state = value; }
    public SubLObject $search = NIL;
    public SubLObject $parent = NIL;
    public SubLObject $children = NIL;
    public SubLObject $depth = NIL;
    public SubLObject $options = NIL;
    public SubLObject $state = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($search_node_native.class, $sym56$SEARCH_NODE, $sym57$SEARCH_NODE_P, $list59, $list60, new String[] {"$search", "$parent", "$children", "$depth", "$options", "$state"}, $list61, $list62, $sym63$PRINT_SNODE);
  }

  @SubL(source = "cycl/search.lisp", position = 3227) 
  public static SubLSymbol $dtp_search_node$ = null;

  @SubL(source = "cycl/search.lisp", position = 3227) 
  public static final SubLObject search_node_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12680");
    return NIL;
  }

  public static final class $search_node_p$UnaryFunction extends UnaryFunction {
    public $search_node_p$UnaryFunction() { super(extractFunctionNamed("SEARCH-NODE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12684"); }
  }

  /** Free list for SEARCH-NODE objects */
  @SubL(source = "cycl/search.lisp", position = 3782) 
  private static SubLSymbol $search_node_free_list$ = null;

  /** Lock for SEARCH-NODE object free list */
  @SubL(source = "cycl/search.lisp", position = 3782) 
  private static SubLSymbol $search_node_free_lock$ = null;

  @SubL(source = "cycl/search.lisp", position = 4469) 
  public static SubLSymbol $reclaim_dead_end_search_nodes$ = null;

  @SubL(source = "cycl/search.lisp", position = 4709) 
  public static SubLSymbol $dead_end_node_function$ = null;

  @SubL(source = "cycl/search.lisp", position = 4765) 
  public static SubLSymbol $reclaim_dead_end_node_function$ = null;

  @SubL(source = "cycl/search.lisp", position = 5890) 
  public static SubLSymbol $within_generic_search$ = null;

  @SubL(source = "cycl/search.lisp", position = 6028) 
  public static SubLSymbol $interrupt_generic_search$ = null;

  public static final SubLObject declare_search_file() {
    declareFunction("search_struc_print_function_trampoline", "SEARCH-STRUC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction("search_struc_p", "SEARCH-STRUC-P", 1, 0, false); new $search_struc_p$UnaryFunction();
    //declareFunction("search_tree", "SEARCH-TREE", 1, 0, false);
    //declareFunction("search_leaves", "SEARCH-LEAVES", 1, 0, false);
    //declareFunction("search_goals", "SEARCH-GOALS", 1, 0, false);
    //declareFunction("search_no_leaves_p_func", "SEARCH-NO-LEAVES-P-FUNC", 1, 0, false);
    //declareFunction("search_next_node_func", "SEARCH-NEXT-NODE-FUNC", 1, 0, false);
    //declareFunction("search_goal_p_func", "SEARCH-GOAL-P-FUNC", 1, 0, false);
    //declareFunction("search_add_goal_func", "SEARCH-ADD-GOAL-FUNC", 1, 0, false);
    //declareFunction("search_options_func", "SEARCH-OPTIONS-FUNC", 1, 0, false);
    //declareFunction("search_expand_func", "SEARCH-EXPAND-FUNC", 1, 0, false);
    //declareFunction("search_add_node_func", "SEARCH-ADD-NODE-FUNC", 1, 0, false);
    //declareFunction("search_too_deep_func", "SEARCH-TOO-DEEP-FUNC", 1, 0, false);
    //declareFunction("search_state", "SEARCH-STATE", 1, 0, false);
    //declareFunction("search_print_func", "SEARCH-PRINT-FUNC", 1, 0, false);
    //declareFunction("search_limbo", "SEARCH-LIMBO", 1, 0, false);
    //declareFunction("search_current_node", "SEARCH-CURRENT-NODE", 1, 0, false);
    //declareFunction("_csetf_search_tree", "_CSETF-SEARCH-TREE", 2, 0, false);
    //declareFunction("_csetf_search_leaves", "_CSETF-SEARCH-LEAVES", 2, 0, false);
    //declareFunction("_csetf_search_goals", "_CSETF-SEARCH-GOALS", 2, 0, false);
    //declareFunction("_csetf_search_no_leaves_p_func", "_CSETF-SEARCH-NO-LEAVES-P-FUNC", 2, 0, false);
    //declareFunction("_csetf_search_next_node_func", "_CSETF-SEARCH-NEXT-NODE-FUNC", 2, 0, false);
    //declareFunction("_csetf_search_goal_p_func", "_CSETF-SEARCH-GOAL-P-FUNC", 2, 0, false);
    //declareFunction("_csetf_search_add_goal_func", "_CSETF-SEARCH-ADD-GOAL-FUNC", 2, 0, false);
    //declareFunction("_csetf_search_options_func", "_CSETF-SEARCH-OPTIONS-FUNC", 2, 0, false);
    //declareFunction("_csetf_search_expand_func", "_CSETF-SEARCH-EXPAND-FUNC", 2, 0, false);
    //declareFunction("_csetf_search_add_node_func", "_CSETF-SEARCH-ADD-NODE-FUNC", 2, 0, false);
    //declareFunction("_csetf_search_too_deep_func", "_CSETF-SEARCH-TOO-DEEP-FUNC", 2, 0, false);
    //declareFunction("_csetf_search_state", "_CSETF-SEARCH-STATE", 2, 0, false);
    //declareFunction("_csetf_search_print_func", "_CSETF-SEARCH-PRINT-FUNC", 2, 0, false);
    //declareFunction("_csetf_search_limbo", "_CSETF-SEARCH-LIMBO", 2, 0, false);
    //declareFunction("_csetf_search_current_node", "_CSETF-SEARCH-CURRENT-NODE", 2, 0, false);
    //declareFunction("make_search_struc", "MAKE-SEARCH-STRUC", 0, 1, false);
    //declareFunction("print_search", "PRINT-SEARCH", 3, 0, false);
    //declareFunction("make_static_search_struc", "MAKE-STATIC-SEARCH-STRUC", 0, 0, false);
    //declareFunction("init_search_struc", "INIT-SEARCH-STRUC", 1, 0, false);
    //declareFunction("free_search_struc_p", "FREE-SEARCH-STRUC-P", 1, 0, false);
    //declareFunction("free_search_struc", "FREE-SEARCH-STRUC", 1, 0, false);
    //declareFunction("get_search_struc", "GET-SEARCH-STRUC", 0, 0, false);
    //declareFunction("new_search", "NEW-SEARCH", 8, 2, false);
    declareFunction("search_node_print_function_trampoline", "SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction("search_node_p", "SEARCH-NODE-P", 1, 0, false); new $search_node_p$UnaryFunction();
    //declareFunction("snode_search", "SNODE-SEARCH", 1, 0, false);
    //declareFunction("snode_parent", "SNODE-PARENT", 1, 0, false);
    //declareFunction("snode_children", "SNODE-CHILDREN", 1, 0, false);
    //declareFunction("snode_depth", "SNODE-DEPTH", 1, 0, false);
    //declareFunction("snode_options", "SNODE-OPTIONS", 1, 0, false);
    //declareFunction("snode_state", "SNODE-STATE", 1, 0, false);
    //declareFunction("_csetf_snode_search", "_CSETF-SNODE-SEARCH", 2, 0, false);
    //declareFunction("_csetf_snode_parent", "_CSETF-SNODE-PARENT", 2, 0, false);
    //declareFunction("_csetf_snode_children", "_CSETF-SNODE-CHILDREN", 2, 0, false);
    //declareFunction("_csetf_snode_depth", "_CSETF-SNODE-DEPTH", 2, 0, false);
    //declareFunction("_csetf_snode_options", "_CSETF-SNODE-OPTIONS", 2, 0, false);
    //declareFunction("_csetf_snode_state", "_CSETF-SNODE-STATE", 2, 0, false);
    //declareFunction("make_search_node", "MAKE-SEARCH-NODE", 0, 1, false);
    //declareFunction("print_snode", "PRINT-SNODE", 3, 0, false);
    //declareFunction("make_static_search_node", "MAKE-STATIC-SEARCH-NODE", 0, 0, false);
    //declareFunction("init_search_node", "INIT-SEARCH-NODE", 1, 0, false);
    //declareFunction("free_search_node_p", "FREE-SEARCH-NODE-P", 1, 0, false);
    //declareFunction("free_search_node", "FREE-SEARCH-NODE", 1, 0, false);
    //declareFunction("get_search_node", "GET-SEARCH-NODE", 0, 0, false);
    //declareFunction("free_entire_search_node", "FREE-ENTIRE-SEARCH-NODE", 1, 1, false);
    //declareFunction("dead_end_nodeP", "DEAD-END-NODE?", 1, 0, false);
    //declareFunction("reclaim_search_node", "RECLAIM-SEARCH-NODE", 1, 0, false);
    //declareFunction("interrupt_generic_search", "INTERRUPT-GENERIC-SEARCH", 0, 0, false);
    //declareFunction("abort_generic_search", "ABORT-GENERIC-SEARCH", 0, 0, false);
    //declareMacro("do_generic_search", "DO-GENERIC-SEARCH");
    //declareFunction("generic_search", "GENERIC-SEARCH", 1, 3, false);
    //declareFunction("generic_search_reclaim_node", "GENERIC-SEARCH-RECLAIM-NODE", 1, 0, false);
    //declareFunction("generic_search_link_child_to_parent", "GENERIC-SEARCH-LINK-CHILD-TO-PARENT", 2, 0, false);
    //declareFunction("reset_search_node_state", "RESET-SEARCH-NODE-STATE", 2, 0, false);
    //declareFunction("new_search_node", "NEW-SEARCH-NODE", 1, 0, false);
    //declareFunction("new_search_start_node", "NEW-SEARCH-START-NODE", 1, 0, false);
    //declareFunction("register_search_start_node", "REGISTER-SEARCH-START-NODE", 2, 0, false);
    //declareFunction("add_search_start_node", "ADD-SEARCH-START-NODE", 2, 0, false);
    //declareFunction("remove_search_start_node", "REMOVE-SEARCH-START-NODE", 2, 0, false);
    //declareFunction("reconsider_limbo", "RECONSIDER-LIMBO", 2, 0, false);
    //declareFunction("valid_snode_options", "VALID-SNODE-OPTIONS", 1, 0, false);
    //declareFunction("set_valid_snode_options", "SET-VALID-SNODE-OPTIONS", 2, 0, false);
    //declareFunction("doomed_search_nodeP", "DOOMED-SEARCH-NODE?", 1, 0, false);
    //declareFunction("mark_node_as_doomed", "MARK-NODE-AS-DOOMED", 1, 0, false);
    //declareFunction("search_current_path", "SEARCH-CURRENT-PATH", 1, 0, false);
    //declareFunction("search_current_path_internal", "SEARCH-CURRENT-PATH-INTERNAL", 1, 0, false);
    //declareFunction("remaining_time_cutoff", "REMAINING-TIME-CUTOFF", 2, 0, false);
    //declareFunction("search_size", "SEARCH-SIZE", 1, 0, false);
    //declareFunction("search_node_size", "SEARCH-NODE-SIZE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_search_file() {
    $dtp_search_struc$ = defconstant("*DTP-SEARCH-STRUC*", $sym0$SEARCH_STRUC);
    $search_struc_free_list$ = deflexical("*SEARCH-STRUC-FREE-LIST*", NIL);
    $search_struc_free_lock$ = deflexical("*SEARCH-STRUC-FREE-LOCK*", Locks.make_lock($str54$SEARCH_STRUC_resource_lock));
    $dtp_search_node$ = defconstant("*DTP-SEARCH-NODE*", $sym56$SEARCH_NODE);
    $search_node_free_list$ = deflexical("*SEARCH-NODE-FREE-LIST*", NIL);
    $search_node_free_lock$ = deflexical("*SEARCH-NODE-FREE-LOCK*", Locks.make_lock($str85$SEARCH_NODE_resource_lock));
    $reclaim_dead_end_search_nodes$ = defparameter("*RECLAIM-DEAD-END-SEARCH-NODES*", T);
    $dead_end_node_function$ = defparameter("*DEAD-END-NODE-FUNCTION*", $sym87$DEAD_END_NODE_);
    $reclaim_dead_end_node_function$ = defparameter("*RECLAIM-DEAD-END-NODE-FUNCTION*", $sym88$RECLAIM_SEARCH_NODE);
    $within_generic_search$ = defparameter("*WITHIN-GENERIC-SEARCH*", NIL);
    $interrupt_generic_search$ = defparameter("*INTERRUPT-GENERIC-SEARCH*", NIL);
    return NIL;
  }

  public static final SubLObject setup_search_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_search_struc$.getGlobalValue(), Symbols.symbol_function($sym7$SEARCH_STRUC_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$SEARCH_TREE, $sym9$_CSETF_SEARCH_TREE);
    Structures.def_csetf($sym10$SEARCH_LEAVES, $sym11$_CSETF_SEARCH_LEAVES);
    Structures.def_csetf($sym12$SEARCH_GOALS, $sym13$_CSETF_SEARCH_GOALS);
    Structures.def_csetf($sym14$SEARCH_NO_LEAVES_P_FUNC, $sym15$_CSETF_SEARCH_NO_LEAVES_P_FUNC);
    Structures.def_csetf($sym16$SEARCH_NEXT_NODE_FUNC, $sym17$_CSETF_SEARCH_NEXT_NODE_FUNC);
    Structures.def_csetf($sym18$SEARCH_GOAL_P_FUNC, $sym19$_CSETF_SEARCH_GOAL_P_FUNC);
    Structures.def_csetf($sym20$SEARCH_ADD_GOAL_FUNC, $sym21$_CSETF_SEARCH_ADD_GOAL_FUNC);
    Structures.def_csetf($sym22$SEARCH_OPTIONS_FUNC, $sym23$_CSETF_SEARCH_OPTIONS_FUNC);
    Structures.def_csetf($sym24$SEARCH_EXPAND_FUNC, $sym25$_CSETF_SEARCH_EXPAND_FUNC);
    Structures.def_csetf($sym26$SEARCH_ADD_NODE_FUNC, $sym27$_CSETF_SEARCH_ADD_NODE_FUNC);
    Structures.def_csetf($sym28$SEARCH_TOO_DEEP_FUNC, $sym29$_CSETF_SEARCH_TOO_DEEP_FUNC);
    Structures.def_csetf($sym30$SEARCH_STATE, $sym31$_CSETF_SEARCH_STATE);
    Structures.def_csetf($sym32$SEARCH_PRINT_FUNC, $sym33$_CSETF_SEARCH_PRINT_FUNC);
    Structures.def_csetf($sym34$SEARCH_LIMBO, $sym35$_CSETF_SEARCH_LIMBO);
    Structures.def_csetf($sym36$SEARCH_CURRENT_NODE, $sym37$_CSETF_SEARCH_CURRENT_NODE);
    Equality.identity($sym0$SEARCH_STRUC);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_search_node$.getGlobalValue(), Symbols.symbol_function($sym64$SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym65$SNODE_SEARCH, $sym66$_CSETF_SNODE_SEARCH);
    Structures.def_csetf($sym67$SNODE_PARENT, $sym68$_CSETF_SNODE_PARENT);
    Structures.def_csetf($sym69$SNODE_CHILDREN, $sym70$_CSETF_SNODE_CHILDREN);
    Structures.def_csetf($sym71$SNODE_DEPTH, $sym72$_CSETF_SNODE_DEPTH);
    Structures.def_csetf($sym73$SNODE_OPTIONS, $sym74$_CSETF_SNODE_OPTIONS);
    Structures.def_csetf($sym75$SNODE_STATE, $sym76$_CSETF_SNODE_STATE);
    Equality.identity($sym56$SEARCH_NODE);
    utilities_macros.note_funcall_helper_function($sym63$PRINT_SNODE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SEARCH_STRUC = makeSymbol("SEARCH-STRUC");
  public static final SubLSymbol $sym1$SEARCH_STRUC_P = makeSymbol("SEARCH-STRUC-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("TREE"), makeSymbol("LEAVES"), makeSymbol("GOALS"), makeSymbol("NO-LEAVES-P-FUNC"), makeSymbol("NEXT-NODE-FUNC"), makeSymbol("GOAL-P-FUNC"), makeSymbol("ADD-GOAL-FUNC"), makeSymbol("OPTIONS-FUNC"), makeSymbol("EXPAND-FUNC"), makeSymbol("ADD-NODE-FUNC"), makeSymbol("TOO-DEEP-FUNC"), makeSymbol("STATE"), makeSymbol("PRINT-FUNC"), makeSymbol("LIMBO"), makeSymbol("CURRENT-NODE")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("TREE"), makeKeyword("LEAVES"), makeKeyword("GOALS"), makeKeyword("NO-LEAVES-P-FUNC"), makeKeyword("NEXT-NODE-FUNC"), makeKeyword("GOAL-P-FUNC"), makeKeyword("ADD-GOAL-FUNC"), makeKeyword("OPTIONS-FUNC"), makeKeyword("EXPAND-FUNC"), makeKeyword("ADD-NODE-FUNC"), makeKeyword("TOO-DEEP-FUNC"), makeKeyword("STATE"), makeKeyword("PRINT-FUNC"), makeKeyword("LIMBO"), makeKeyword("CURRENT-NODE")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("SEARCH-TREE"), makeSymbol("SEARCH-LEAVES"), makeSymbol("SEARCH-GOALS"), makeSymbol("SEARCH-NO-LEAVES-P-FUNC"), makeSymbol("SEARCH-NEXT-NODE-FUNC"), makeSymbol("SEARCH-GOAL-P-FUNC"), makeSymbol("SEARCH-ADD-GOAL-FUNC"), makeSymbol("SEARCH-OPTIONS-FUNC"), makeSymbol("SEARCH-EXPAND-FUNC"), makeSymbol("SEARCH-ADD-NODE-FUNC"), makeSymbol("SEARCH-TOO-DEEP-FUNC"), makeSymbol("SEARCH-STATE"), makeSymbol("SEARCH-PRINT-FUNC"), makeSymbol("SEARCH-LIMBO"), makeSymbol("SEARCH-CURRENT-NODE")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-SEARCH-TREE"), makeSymbol("_CSETF-SEARCH-LEAVES"), makeSymbol("_CSETF-SEARCH-GOALS"), makeSymbol("_CSETF-SEARCH-NO-LEAVES-P-FUNC"), makeSymbol("_CSETF-SEARCH-NEXT-NODE-FUNC"), makeSymbol("_CSETF-SEARCH-GOAL-P-FUNC"), makeSymbol("_CSETF-SEARCH-ADD-GOAL-FUNC"), makeSymbol("_CSETF-SEARCH-OPTIONS-FUNC"), makeSymbol("_CSETF-SEARCH-EXPAND-FUNC"), makeSymbol("_CSETF-SEARCH-ADD-NODE-FUNC"), makeSymbol("_CSETF-SEARCH-TOO-DEEP-FUNC"), makeSymbol("_CSETF-SEARCH-STATE"), makeSymbol("_CSETF-SEARCH-PRINT-FUNC"), makeSymbol("_CSETF-SEARCH-LIMBO"), makeSymbol("_CSETF-SEARCH-CURRENT-NODE")});
  public static final SubLSymbol $sym6$PRINT_SEARCH = makeSymbol("PRINT-SEARCH");
  public static final SubLSymbol $sym7$SEARCH_STRUC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SEARCH-STRUC-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$SEARCH_TREE = makeSymbol("SEARCH-TREE");
  public static final SubLSymbol $sym9$_CSETF_SEARCH_TREE = makeSymbol("_CSETF-SEARCH-TREE");
  public static final SubLSymbol $sym10$SEARCH_LEAVES = makeSymbol("SEARCH-LEAVES");
  public static final SubLSymbol $sym11$_CSETF_SEARCH_LEAVES = makeSymbol("_CSETF-SEARCH-LEAVES");
  public static final SubLSymbol $sym12$SEARCH_GOALS = makeSymbol("SEARCH-GOALS");
  public static final SubLSymbol $sym13$_CSETF_SEARCH_GOALS = makeSymbol("_CSETF-SEARCH-GOALS");
  public static final SubLSymbol $sym14$SEARCH_NO_LEAVES_P_FUNC = makeSymbol("SEARCH-NO-LEAVES-P-FUNC");
  public static final SubLSymbol $sym15$_CSETF_SEARCH_NO_LEAVES_P_FUNC = makeSymbol("_CSETF-SEARCH-NO-LEAVES-P-FUNC");
  public static final SubLSymbol $sym16$SEARCH_NEXT_NODE_FUNC = makeSymbol("SEARCH-NEXT-NODE-FUNC");
  public static final SubLSymbol $sym17$_CSETF_SEARCH_NEXT_NODE_FUNC = makeSymbol("_CSETF-SEARCH-NEXT-NODE-FUNC");
  public static final SubLSymbol $sym18$SEARCH_GOAL_P_FUNC = makeSymbol("SEARCH-GOAL-P-FUNC");
  public static final SubLSymbol $sym19$_CSETF_SEARCH_GOAL_P_FUNC = makeSymbol("_CSETF-SEARCH-GOAL-P-FUNC");
  public static final SubLSymbol $sym20$SEARCH_ADD_GOAL_FUNC = makeSymbol("SEARCH-ADD-GOAL-FUNC");
  public static final SubLSymbol $sym21$_CSETF_SEARCH_ADD_GOAL_FUNC = makeSymbol("_CSETF-SEARCH-ADD-GOAL-FUNC");
  public static final SubLSymbol $sym22$SEARCH_OPTIONS_FUNC = makeSymbol("SEARCH-OPTIONS-FUNC");
  public static final SubLSymbol $sym23$_CSETF_SEARCH_OPTIONS_FUNC = makeSymbol("_CSETF-SEARCH-OPTIONS-FUNC");
  public static final SubLSymbol $sym24$SEARCH_EXPAND_FUNC = makeSymbol("SEARCH-EXPAND-FUNC");
  public static final SubLSymbol $sym25$_CSETF_SEARCH_EXPAND_FUNC = makeSymbol("_CSETF-SEARCH-EXPAND-FUNC");
  public static final SubLSymbol $sym26$SEARCH_ADD_NODE_FUNC = makeSymbol("SEARCH-ADD-NODE-FUNC");
  public static final SubLSymbol $sym27$_CSETF_SEARCH_ADD_NODE_FUNC = makeSymbol("_CSETF-SEARCH-ADD-NODE-FUNC");
  public static final SubLSymbol $sym28$SEARCH_TOO_DEEP_FUNC = makeSymbol("SEARCH-TOO-DEEP-FUNC");
  public static final SubLSymbol $sym29$_CSETF_SEARCH_TOO_DEEP_FUNC = makeSymbol("_CSETF-SEARCH-TOO-DEEP-FUNC");
  public static final SubLSymbol $sym30$SEARCH_STATE = makeSymbol("SEARCH-STATE");
  public static final SubLSymbol $sym31$_CSETF_SEARCH_STATE = makeSymbol("_CSETF-SEARCH-STATE");
  public static final SubLSymbol $sym32$SEARCH_PRINT_FUNC = makeSymbol("SEARCH-PRINT-FUNC");
  public static final SubLSymbol $sym33$_CSETF_SEARCH_PRINT_FUNC = makeSymbol("_CSETF-SEARCH-PRINT-FUNC");
  public static final SubLSymbol $sym34$SEARCH_LIMBO = makeSymbol("SEARCH-LIMBO");
  public static final SubLSymbol $sym35$_CSETF_SEARCH_LIMBO = makeSymbol("_CSETF-SEARCH-LIMBO");
  public static final SubLSymbol $sym36$SEARCH_CURRENT_NODE = makeSymbol("SEARCH-CURRENT-NODE");
  public static final SubLSymbol $sym37$_CSETF_SEARCH_CURRENT_NODE = makeSymbol("_CSETF-SEARCH-CURRENT-NODE");
  public static final SubLSymbol $kw38$TREE = makeKeyword("TREE");
  public static final SubLSymbol $kw39$LEAVES = makeKeyword("LEAVES");
  public static final SubLSymbol $kw40$GOALS = makeKeyword("GOALS");
  public static final SubLSymbol $kw41$NO_LEAVES_P_FUNC = makeKeyword("NO-LEAVES-P-FUNC");
  public static final SubLSymbol $kw42$NEXT_NODE_FUNC = makeKeyword("NEXT-NODE-FUNC");
  public static final SubLSymbol $kw43$GOAL_P_FUNC = makeKeyword("GOAL-P-FUNC");
  public static final SubLSymbol $kw44$ADD_GOAL_FUNC = makeKeyword("ADD-GOAL-FUNC");
  public static final SubLSymbol $kw45$OPTIONS_FUNC = makeKeyword("OPTIONS-FUNC");
  public static final SubLSymbol $kw46$EXPAND_FUNC = makeKeyword("EXPAND-FUNC");
  public static final SubLSymbol $kw47$ADD_NODE_FUNC = makeKeyword("ADD-NODE-FUNC");
  public static final SubLSymbol $kw48$TOO_DEEP_FUNC = makeKeyword("TOO-DEEP-FUNC");
  public static final SubLSymbol $kw49$STATE = makeKeyword("STATE");
  public static final SubLSymbol $kw50$PRINT_FUNC = makeKeyword("PRINT-FUNC");
  public static final SubLSymbol $kw51$LIMBO = makeKeyword("LIMBO");
  public static final SubLSymbol $kw52$CURRENT_NODE = makeKeyword("CURRENT-NODE");
  public static final SubLString $str53$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str54$SEARCH_STRUC_resource_lock = makeString("SEARCH-STRUC resource lock");
  public static final SubLSymbol $kw55$FREE = makeKeyword("FREE");
  public static final SubLSymbol $sym56$SEARCH_NODE = makeSymbol("SEARCH-NODE");
  public static final SubLSymbol $sym57$SEARCH_NODE_P = makeSymbol("SEARCH-NODE-P");
  public static final SubLInteger $int58$151 = makeInteger(151);
  public static final SubLList $list59 = list(makeSymbol("SEARCH"), makeSymbol("PARENT"), makeSymbol("CHILDREN"), makeSymbol("DEPTH"), makeSymbol("OPTIONS"), makeSymbol("STATE"));
  public static final SubLList $list60 = list(makeKeyword("SEARCH"), makeKeyword("PARENT"), makeKeyword("CHILDREN"), makeKeyword("DEPTH"), makeKeyword("OPTIONS"), makeKeyword("STATE"));
  public static final SubLList $list61 = list(makeSymbol("SNODE-SEARCH"), makeSymbol("SNODE-PARENT"), makeSymbol("SNODE-CHILDREN"), makeSymbol("SNODE-DEPTH"), makeSymbol("SNODE-OPTIONS"), makeSymbol("SNODE-STATE"));
  public static final SubLList $list62 = list(makeSymbol("_CSETF-SNODE-SEARCH"), makeSymbol("_CSETF-SNODE-PARENT"), makeSymbol("_CSETF-SNODE-CHILDREN"), makeSymbol("_CSETF-SNODE-DEPTH"), makeSymbol("_CSETF-SNODE-OPTIONS"), makeSymbol("_CSETF-SNODE-STATE"));
  public static final SubLSymbol $sym63$PRINT_SNODE = makeSymbol("PRINT-SNODE");
  public static final SubLSymbol $sym64$SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym65$SNODE_SEARCH = makeSymbol("SNODE-SEARCH");
  public static final SubLSymbol $sym66$_CSETF_SNODE_SEARCH = makeSymbol("_CSETF-SNODE-SEARCH");
  public static final SubLSymbol $sym67$SNODE_PARENT = makeSymbol("SNODE-PARENT");
  public static final SubLSymbol $sym68$_CSETF_SNODE_PARENT = makeSymbol("_CSETF-SNODE-PARENT");
  public static final SubLSymbol $sym69$SNODE_CHILDREN = makeSymbol("SNODE-CHILDREN");
  public static final SubLSymbol $sym70$_CSETF_SNODE_CHILDREN = makeSymbol("_CSETF-SNODE-CHILDREN");
  public static final SubLSymbol $sym71$SNODE_DEPTH = makeSymbol("SNODE-DEPTH");
  public static final SubLSymbol $sym72$_CSETF_SNODE_DEPTH = makeSymbol("_CSETF-SNODE-DEPTH");
  public static final SubLSymbol $sym73$SNODE_OPTIONS = makeSymbol("SNODE-OPTIONS");
  public static final SubLSymbol $sym74$_CSETF_SNODE_OPTIONS = makeSymbol("_CSETF-SNODE-OPTIONS");
  public static final SubLSymbol $sym75$SNODE_STATE = makeSymbol("SNODE-STATE");
  public static final SubLSymbol $sym76$_CSETF_SNODE_STATE = makeSymbol("_CSETF-SNODE-STATE");
  public static final SubLSymbol $kw77$SEARCH = makeKeyword("SEARCH");
  public static final SubLSymbol $kw78$PARENT = makeKeyword("PARENT");
  public static final SubLSymbol $kw79$CHILDREN = makeKeyword("CHILDREN");
  public static final SubLSymbol $kw80$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw81$OPTIONS = makeKeyword("OPTIONS");
  public static final SubLString $str82$__ = makeString("#<");
  public static final SubLSymbol $kw83$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw84$BASE = makeKeyword("BASE");
  public static final SubLString $str85$SEARCH_NODE_resource_lock = makeString("SEARCH-NODE resource lock");
  public static final SubLSymbol $kw86$UNDETERMINED = makeKeyword("UNDETERMINED");
  public static final SubLSymbol $sym87$DEAD_END_NODE_ = makeSymbol("DEAD-END-NODE?");
  public static final SubLSymbol $sym88$RECLAIM_SEARCH_NODE = makeSymbol("RECLAIM-SEARCH-NODE");
  public static final SubLString $str89$So_don_t = makeString("So don't");
  public static final SubLString $str90$Cannot_reclaim_strange_node__S = makeString("Cannot reclaim strange node ~S");
  public static final SubLSymbol $kw91$ABORT_GENERIC_SEARCH = makeKeyword("ABORT-GENERIC-SEARCH");
  public static final SubLSymbol $kw92$ABORT = makeKeyword("ABORT");
  public static final SubLList $list93 = list(new SubLObject[] {list(makeSymbol("REASON"), makeSymbol("SEARCH"), makeSymbol("&KEY"), makeSymbol("NUMBER-CUT"), makeSymbol("TIME-CUT"), makeSymbol("DEPTH-CUT")), makeSymbol("NO-LEAVES-P-FUNC"), makeSymbol("NEXT-NODE-FUNC"), makeSymbol("GOAL-P-FUNC"), makeSymbol("ADD-GOAL-FUNC"), makeSymbol("TOO-DEEP-FUNC"), makeSymbol("OPTIONS-FUNC"), makeSymbol("EXPAND-FUNC"), makeSymbol("ADD-NODE-FUNC")});
  public static final SubLList $list94 = list(makeKeyword("NUMBER-CUT"), makeKeyword("TIME-CUT"), makeKeyword("DEPTH-CUT"));
  public static final SubLSymbol $kw95$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw96$NUMBER_CUT = makeKeyword("NUMBER-CUT");
  public static final SubLSymbol $kw97$TIME_CUT = makeKeyword("TIME-CUT");
  public static final SubLSymbol $kw98$DEPTH_CUT = makeKeyword("DEPTH-CUT");
  public static final SubLSymbol $sym99$NUMBER = makeUninternedSymbol("NUMBER");
  public static final SubLSymbol $sym100$TIME = makeUninternedSymbol("TIME");
  public static final SubLSymbol $sym101$DEPTH_LIMIT_CROSSED = makeUninternedSymbol("DEPTH-LIMIT-CROSSED");
  public static final SubLSymbol $sym102$ABORTED = makeUninternedSymbol("ABORTED");
  public static final SubLSymbol $sym103$NEXT = makeUninternedSymbol("NEXT");
  public static final SubLSymbol $sym104$NEW_LEAVES = makeUninternedSymbol("NEW-LEAVES");
  public static final SubLSymbol $sym105$PREVIOUS_GOALS = makeUninternedSymbol("PREVIOUS-GOALS");
  public static final SubLSymbol $sym106$NEW_GOALS = makeUninternedSymbol("NEW-GOALS");
  public static final SubLSymbol $sym107$INCREMENT_COUNT = makeUninternedSymbol("INCREMENT-COUNT");
  public static final SubLSymbol $sym108$OPTIONS = makeUninternedSymbol("OPTIONS");
  public static final SubLSymbol $sym109$OPTION = makeUninternedSymbol("OPTION");
  public static final SubLSymbol $sym110$SELF_RE_ADDED_ = makeUninternedSymbol("SELF-RE-ADDED?");
  public static final SubLSymbol $sym111$NEW_NODES = makeUninternedSymbol("NEW-NODES");
  public static final SubLSymbol $sym112$NEW_NODE = makeUninternedSymbol("NEW-NODE");
  public static final SubLSymbol $sym113$PREVIOUS_LEAVES = makeUninternedSymbol("PREVIOUS-LEAVES");
  public static final SubLSymbol $sym114$CLET = makeSymbol("CLET");
  public static final SubLList $list115 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym116$FIF = makeSymbol("FIF");
  public static final SubLSymbol $sym117$TIME_FROM_NOW = makeSymbol("TIME-FROM-NOW");
  public static final SubLList $list118 = list(NIL);
  public static final SubLList $list119 = list(makeSymbol("*INTERRUPT-GENERIC-SEARCH*"), NIL);
  public static final SubLSymbol $sym120$CCATCH = makeSymbol("CCATCH");
  public static final SubLList $list121 = list(list(makeSymbol("*WITHIN-GENERIC-SEARCH*"), T));
  public static final SubLSymbol $sym122$CSETF = makeSymbol("CSETF");
  public static final SubLSymbol $sym123$UNTIL = makeSymbol("UNTIL");
  public static final SubLSymbol $sym124$COR = makeSymbol("COR");
  public static final SubLSymbol $sym125$_INTERRUPT_GENERIC_SEARCH_ = makeSymbol("*INTERRUPT-GENERIC-SEARCH*");
  public static final SubLSymbol $sym126$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym127$__ = makeSymbol(">=");
  public static final SubLSymbol $sym128$TIME_HAS_ARRIVED_ = makeSymbol("TIME-HAS-ARRIVED?");
  public static final SubLSymbol $sym129$FUNCALL_SHORTCUT = makeSymbol("FUNCALL-SHORTCUT");
  public static final SubLSymbol $sym130$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol $sym131$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym132$DOOMED_SEARCH_NODE_ = makeSymbol("DOOMED-SEARCH-NODE?");
  public static final SubLSymbol $sym133$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym134$CINC = makeSymbol("CINC");
  public static final SubLSymbol $sym135$_RECLAIM_DEAD_END_SEARCH_NODES_ = makeSymbol("*RECLAIM-DEAD-END-SEARCH-NODES*");
  public static final SubLSymbol $sym136$GENERIC_SEARCH_RECLAIM_NODE = makeSymbol("GENERIC-SEARCH-RECLAIM-NODE");
  public static final SubLSymbol $sym137$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list138 = list(T);
  public static final SubLSymbol $sym139$CPUSH = makeSymbol("CPUSH");
  public static final SubLSymbol $sym140$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym141$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym142$GENERIC_SEARCH_LINK_CHILD_TO_PARENT = makeSymbol("GENERIC-SEARCH-LINK-CHILD-TO-PARENT");
  public static final SubLSymbol $sym143$NREVERSE = makeSymbol("NREVERSE");
  public static final SubLSymbol $sym144$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLList $list145 = list(makeKeyword("ABORT"));
  public static final SubLList $list146 = list(makeKeyword("INTERRUPT"));
  public static final SubLList $list147 = list(makeKeyword("NUMBER"));
  public static final SubLList $list148 = list(makeKeyword("TIME"));
  public static final SubLList $list149 = list(makeKeyword("DEPTH"));
  public static final SubLList $list150 = list(makeKeyword("EXHAUST"));
  public static final SubLSymbol $kw151$INTERRUPT = makeKeyword("INTERRUPT");
  public static final SubLSymbol $kw152$NUMBER = makeKeyword("NUMBER");
  public static final SubLSymbol $kw153$TIME = makeKeyword("TIME");
  public static final SubLSymbol $kw154$EXHAUST = makeKeyword("EXHAUST");
  public static final SubLSymbol $kw155$DOOMED = makeKeyword("DOOMED");

  //// Initializers

  public void declareFunctions() {
    declare_search_file();
  }

  public void initializeVariables() {
    init_search_file();
  }

  public void runTopLevelForms() {
    setup_search_file();
  }

}
