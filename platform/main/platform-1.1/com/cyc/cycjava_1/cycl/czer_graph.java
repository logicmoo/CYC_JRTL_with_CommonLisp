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
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;

public  final class czer_graph extends SubLTranslatedFile {

  //// Constructor

  private czer_graph() {}
  public static final SubLFile me = new czer_graph();
  public static final String myName = "com.cyc.cycjava_1.cycl.czer_graph";

  //// Definitions

  public static final class $v_colour_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $sorted_constant_list; }
    public SubLObject getField3() { return $sorted_nat_list; }
    public SubLObject getField4() { return $sorted_assertion_list; }
    public SubLObject getField5() { return $list_structure; }
    public SubLObject getField6() { return $sorted_var_positions; }
    public SubLObject setField2(SubLObject value) { return $sorted_constant_list = value; }
    public SubLObject setField3(SubLObject value) { return $sorted_nat_list = value; }
    public SubLObject setField4(SubLObject value) { return $sorted_assertion_list = value; }
    public SubLObject setField5(SubLObject value) { return $list_structure = value; }
    public SubLObject setField6(SubLObject value) { return $sorted_var_positions = value; }
    public SubLObject $sorted_constant_list = NIL;
    public SubLObject $sorted_nat_list = NIL;
    public SubLObject $sorted_assertion_list = NIL;
    public SubLObject $list_structure = NIL;
    public SubLObject $sorted_var_positions = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($v_colour_native.class, $sym0$V_COLOUR, $sym1$V_COLOUR_P, $list2, $list3, new String[] {"$sorted_constant_list", "$sorted_nat_list", "$sorted_assertion_list", "$list_structure", "$sorted_var_positions"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/czer-graph.lisp", position = 783) 
  public static SubLSymbol $dtp_v_colour$ = null;

  @SubL(source = "cycl/czer-graph.lisp", position = 783) 
  public static final SubLObject v_colour_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $v_colour_p$UnaryFunction extends UnaryFunction {
    public $v_colour_p$UnaryFunction() { super(extractFunctionNamed("V-COLOUR-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29117"); }
  }

  public static final class $arc_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $head; }
    public SubLObject getField3() { return $colour; }
    public SubLObject setField2(SubLObject value) { return $head = value; }
    public SubLObject setField3(SubLObject value) { return $colour = value; }
    public SubLObject $head = NIL;
    public SubLObject $colour = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($arc_native.class, $sym25$ARC, $sym26$ARC_P, $list27, $list28, new String[] {"$head", "$colour"}, $list29, $list30, $sym31$PRINT_ARC);
  }

  @SubL(source = "cycl/czer-graph.lisp", position = 2189) 
  public static SubLSymbol $dtp_arc$ = null;

  @SubL(source = "cycl/czer-graph.lisp", position = 2189) 
  public static final SubLObject arc_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29111");
    return NIL;
  }

  public static final class $arc_p$UnaryFunction extends UnaryFunction {
    public $arc_p$UnaryFunction() { super(extractFunctionNamed("ARC-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29090"); }
  }

  public static final class $vertex_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject getField3() { return $colour; }
    public SubLObject getField4() { return $arc_set; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject setField3(SubLObject value) { return $colour = value; }
    public SubLObject setField4(SubLObject value) { return $arc_set = value; }
    public SubLObject $id = NIL;
    public SubLObject $colour = NIL;
    public SubLObject $arc_set = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($vertex_native.class, $sym41$VERTEX, $sym42$VERTEX_P, $list43, $list44, new String[] {"$id", "$colour", "$arc_set"}, $list45, $list46, $sym47$PRINT_VERTEX);
  }

  @SubL(source = "cycl/czer-graph.lisp", position = 2983) 
  public static SubLSymbol $dtp_vertex$ = null;

  @SubL(source = "cycl/czer-graph.lisp", position = 2983) 
  public static final SubLObject vertex_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29113");
    return NIL;
  }

  public static final class $vertex_p$UnaryFunction extends UnaryFunction {
    public $vertex_p$UnaryFunction() { super(extractFunctionNamed("VERTEX-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29120"); }
  }

  public static final class $graph_search_node_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $vertex; }
    public SubLObject getField3() { return $search_history; }
    public SubLObject setField2(SubLObject value) { return $vertex = value; }
    public SubLObject setField3(SubLObject value) { return $search_history = value; }
    public SubLObject $vertex = NIL;
    public SubLObject $search_history = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($graph_search_node_native.class, $sym64$GRAPH_SEARCH_NODE, $sym65$GRAPH_SEARCH_NODE_P, $list66, $list67, new String[] {"$vertex", "$search_history"}, $list68, $list69, $sym70$PRINT_GRAPH_SEARCH_NODE);
  }

  @SubL(source = "cycl/czer-graph.lisp", position = 5899) 
  public static SubLSymbol $dtp_graph_search_node$ = null;

  @SubL(source = "cycl/czer-graph.lisp", position = 5899) 
  public static final SubLObject graph_search_node_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29112");
    return NIL;
  }

  public static final class $graph_search_node_p$UnaryFunction extends UnaryFunction {
    public $graph_search_node_p$UnaryFunction() { super(extractFunctionNamed("GRAPH-SEARCH-NODE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29094"); }
  }

  public static final SubLObject declare_czer_graph_file() {
    declareFunction(myName, "v_colour_print_function_trampoline", "V-COLOUR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "v_colour_p", "V-COLOUR-P", 1, 0, false); new $v_colour_p$UnaryFunction();
    declareFunction(myName, "v_colour_sorted_constant_list", "V-COLOUR-SORTED-CONSTANT-LIST", 1, 0, false);
    declareFunction(myName, "v_colour_sorted_nat_list", "V-COLOUR-SORTED-NAT-LIST", 1, 0, false);
    declareFunction(myName, "v_colour_sorted_assertion_list", "V-COLOUR-SORTED-ASSERTION-LIST", 1, 0, false);
    declareFunction(myName, "v_colour_list_structure", "V-COLOUR-LIST-STRUCTURE", 1, 0, false);
    declareFunction(myName, "v_colour_sorted_var_positions", "V-COLOUR-SORTED-VAR-POSITIONS", 1, 0, false);
    declareFunction(myName, "_csetf_v_colour_sorted_constant_list", "_CSETF-V-COLOUR-SORTED-CONSTANT-LIST", 2, 0, false);
    declareFunction(myName, "_csetf_v_colour_sorted_nat_list", "_CSETF-V-COLOUR-SORTED-NAT-LIST", 2, 0, false);
    declareFunction(myName, "_csetf_v_colour_sorted_assertion_list", "_CSETF-V-COLOUR-SORTED-ASSERTION-LIST", 2, 0, false);
    declareFunction(myName, "_csetf_v_colour_list_structure", "_CSETF-V-COLOUR-LIST-STRUCTURE", 2, 0, false);
    declareFunction(myName, "_csetf_v_colour_sorted_var_positions", "_CSETF-V-COLOUR-SORTED-VAR-POSITIONS", 2, 0, false);
    declareFunction(myName, "make_v_colour", "MAKE-V-COLOUR", 0, 1, false);
    declareFunction(myName, "v_colour_as_list", "V-COLOUR-AS-LIST", 1, 0, false);
    declareFunction(myName, "v_colour_min", "V-COLOUR-MIN", 1, 0, false);
    declareFunction(myName, "arc_print_function_trampoline", "ARC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "arc_p", "ARC-P", 1, 0, false); new $arc_p$UnaryFunction();
    declareFunction(myName, "arc_head", "ARC-HEAD", 1, 0, false);
    declareFunction(myName, "arc_colour", "ARC-COLOUR", 1, 0, false);
    declareFunction(myName, "_csetf_arc_head", "_CSETF-ARC-HEAD", 2, 0, false);
    declareFunction(myName, "_csetf_arc_colour", "_CSETF-ARC-COLOUR", 2, 0, false);
    declareFunction(myName, "make_arc", "MAKE-ARC", 0, 1, false);
    declareFunction(myName, "print_arc", "PRINT-ARC", 3, 0, false);
    declareFunction(myName, "new_arc", "NEW-ARC", 2, 0, false);
    declareFunction(myName, "arc_as_sortable_list", "ARC-AS-SORTABLE-LIST", 1, 0, false);
    declareFunction(myName, "arc_as_unifiable_list", "ARC-AS-UNIFIABLE-LIST", 1, 0, false);
    declareFunction(myName, "colour_arc", "COLOUR-ARC", 3, 0, false);
    declareFunction(myName, "vertex_print_function_trampoline", "VERTEX-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "vertex_p", "VERTEX-P", 1, 0, false); new $vertex_p$UnaryFunction();
    declareFunction(myName, "vertex_id", "VERTEX-ID", 1, 0, false);
    declareFunction(myName, "vertex_colour", "VERTEX-COLOUR", 1, 0, false);
    declareFunction(myName, "vertex_arc_set", "VERTEX-ARC-SET", 1, 0, false);
    declareFunction(myName, "_csetf_vertex_id", "_CSETF-VERTEX-ID", 2, 0, false);
    declareFunction(myName, "_csetf_vertex_colour", "_CSETF-VERTEX-COLOUR", 2, 0, false);
    declareFunction(myName, "_csetf_vertex_arc_set", "_CSETF-VERTEX-ARC-SET", 2, 0, false);
    declareFunction(myName, "make_vertex", "MAKE-VERTEX", 0, 1, false);
    declareFunction(myName, "print_vertex", "PRINT-VERTEX", 3, 0, false);
    declareFunction(myName, "find_vertex_by_id", "FIND-VERTEX-BY-ID", 2, 0, false);
    declareFunction(myName, "vertex_as_sortable_list", "VERTEX-AS-SORTABLE-LIST", 1, 0, false);
    declareFunction(myName, "vertex_as_unifiable_list", "VERTEX-AS-UNIFIABLE-LIST", 1, 0, false);
    declareFunction(myName, "vertex_first_half_as_sortable_list", "VERTEX-FIRST-HALF-AS-SORTABLE-LIST", 1, 0, false);
    declareFunction(myName, "vertex_first_half_as_unifiable_list", "VERTEX-FIRST-HALF-AS-UNIFIABLE-LIST", 1, 0, false);
    declareFunction(myName, "vertex_second_half_as_sortable_set", "VERTEX-SECOND-HALF-AS-SORTABLE-SET", 1, 0, false);
    declareFunction(myName, "vertex_second_half_as_unifiable_set", "VERTEX-SECOND-HALF-AS-UNIFIABLE-SET", 1, 0, false);
    declareFunction(myName, "vertex_add_arc", "VERTEX-ADD-ARC", 3, 0, false);
    declareFunction(myName, "colour_vertex", "COLOUR-VERTEX", 2, 0, false);
    declareFunction(myName, "new_vertex", "NEW-VERTEX", 3, 0, false);
    declareFunction(myName, "graph_search_node_print_function_trampoline", "GRAPH-SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "graph_search_node_p", "GRAPH-SEARCH-NODE-P", 1, 0, false); new $graph_search_node_p$UnaryFunction();
    declareFunction(myName, "graph_search_node_vertex", "GRAPH-SEARCH-NODE-VERTEX", 1, 0, false);
    declareFunction(myName, "graph_search_node_search_history", "GRAPH-SEARCH-NODE-SEARCH-HISTORY", 1, 0, false);
    declareFunction(myName, "_csetf_graph_search_node_vertex", "_CSETF-GRAPH-SEARCH-NODE-VERTEX", 2, 0, false);
    declareFunction(myName, "_csetf_graph_search_node_search_history", "_CSETF-GRAPH-SEARCH-NODE-SEARCH-HISTORY", 2, 0, false);
    declareFunction(myName, "make_graph_search_node", "MAKE-GRAPH-SEARCH-NODE", 0, 1, false);
    declareFunction(myName, "print_graph_search_node", "PRINT-GRAPH-SEARCH-NODE", 3, 0, false);
    declareFunction(myName, "inert_variable", "INERT-VARIABLE", 1, 0, false);
    declareFunction(myName, "graph_search_node_as_sortable_sets", "GRAPH-SEARCH-NODE-AS-SORTABLE-SETS", 1, 0, false);
    declareFunction(myName, "graph_search_node_as_unifiable_sets", "GRAPH-SEARCH-NODE-AS-UNIFIABLE-SETS", 1, 0, false);
    declareFunction(myName, "unify_graph_search_node", "UNIFY-GRAPH-SEARCH-NODE", 2, 0, false);
    declareFunction(myName, "graph_search_nodes_isomorphicP", "GRAPH-SEARCH-NODES-ISOMORPHIC?", 2, 0, false);
    declareFunction(myName, "graph_search_node_L", "GRAPH-SEARCH-NODE-<", 2, 0, false);
    declareFunction(myName, "min_graph_search_node", "MIN-GRAPH-SEARCH-NODE", 1, 0, false);
    declareFunction(myName, "vertex_search_state_as_unifiable_sets_of_sets", "VERTEX-SEARCH-STATE-AS-UNIFIABLE-SETS-OF-SETS", 1, 0, false);
    declareFunction(myName, "vertex_search_state_as_sortable_sets_of_sets", "VERTEX-SEARCH-STATE-AS-SORTABLE-SETS-OF-SETS", 1, 0, false);
    declareFunction(myName, "unify_vertex_search_state", "UNIFY-VERTEX-SEARCH-STATE", 2, 0, false);
    declareFunction(myName, "vertex_search_states_isomorphicP", "VERTEX-SEARCH-STATES-ISOMORPHIC?", 2, 0, false);
    declareFunction(myName, "vertex_search_state_L", "VERTEX-SEARCH-STATE-<", 2, 0, false);
    declareFunction(myName, "min_vertex_search_state", "MIN-VERTEX-SEARCH-STATE", 2, 0, false);
    declareFunction(myName, "source_vertex", "SOURCE-VERTEX", 1, 0, false);
    declareFunction(myName, "init_graph_search_state", "INIT-GRAPH-SEARCH-STATE", 1, 0, false);
    declareFunction(myName, "graph_search_state_covers_graphP", "GRAPH-SEARCH-STATE-COVERS-GRAPH?", 2, 0, false);
    declareFunction(myName, "least_vertex", "LEAST-VERTEX", 1, 1, false);
    declareFunction(myName, "least_vertex_recursive", "LEAST-VERTEX-RECURSIVE", 3, 0, false);
    declareFunction(myName, "penultimate_resort_literals", "PENULTIMATE-RESORT-LITERALS", 1, 0, false);
    declareFunction(myName, "last_resort_literal", "LAST-RESORT-LITERAL", 2, 0, false);
    declareFunction(myName, "compute_sorted_shared_vars", "COMPUTE-SORTED-SHARED-VARS", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_czer_graph_file() {
    $dtp_v_colour$ = defconstant("*DTP-V-COLOUR*", $sym0$V_COLOUR);
    $dtp_arc$ = defconstant("*DTP-ARC*", $sym25$ARC);
    $dtp_vertex$ = defconstant("*DTP-VERTEX*", $sym41$VERTEX);
    $dtp_graph_search_node$ = defconstant("*DTP-GRAPH-SEARCH-NODE*", $sym64$GRAPH_SEARCH_NODE);
    return NIL;
  }

  public static final SubLObject setup_czer_graph_file() {
    // CVS_ID("Id: czer-graph.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_v_colour$.getGlobalValue(), Symbols.symbol_function($sym7$V_COLOUR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$V_COLOUR_SORTED_CONSTANT_LIST, $sym9$_CSETF_V_COLOUR_SORTED_CONSTANT_LIST);
    Structures.def_csetf($sym10$V_COLOUR_SORTED_NAT_LIST, $sym11$_CSETF_V_COLOUR_SORTED_NAT_LIST);
    Structures.def_csetf($sym12$V_COLOUR_SORTED_ASSERTION_LIST, $sym13$_CSETF_V_COLOUR_SORTED_ASSERTION_LIST);
    Structures.def_csetf($sym14$V_COLOUR_LIST_STRUCTURE, $sym15$_CSETF_V_COLOUR_LIST_STRUCTURE);
    Structures.def_csetf($sym16$V_COLOUR_SORTED_VAR_POSITIONS, $sym17$_CSETF_V_COLOUR_SORTED_VAR_POSITIONS);
    Equality.identity($sym0$V_COLOUR);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_arc$.getGlobalValue(), Symbols.symbol_function($sym32$ARC_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym33$ARC_HEAD, $sym34$_CSETF_ARC_HEAD);
    Structures.def_csetf($sym35$ARC_COLOUR, $sym36$_CSETF_ARC_COLOUR);
    Equality.identity($sym25$ARC);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_vertex$.getGlobalValue(), Symbols.symbol_function($sym48$VERTEX_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym49$VERTEX_ID, $sym50$_CSETF_VERTEX_ID);
    Structures.def_csetf($sym51$VERTEX_COLOUR, $sym52$_CSETF_VERTEX_COLOUR);
    Structures.def_csetf($sym53$VERTEX_ARC_SET, $sym54$_CSETF_VERTEX_ARC_SET);
    Equality.identity($sym41$VERTEX);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_graph_search_node$.getGlobalValue(), Symbols.symbol_function($sym71$GRAPH_SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym72$GRAPH_SEARCH_NODE_VERTEX, $sym73$_CSETF_GRAPH_SEARCH_NODE_VERTEX);
    Structures.def_csetf($sym74$GRAPH_SEARCH_NODE_SEARCH_HISTORY, $sym75$_CSETF_GRAPH_SEARCH_NODE_SEARCH_HISTORY);
    Equality.identity($sym64$GRAPH_SEARCH_NODE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$V_COLOUR = makeSymbol("V-COLOUR");
  public static final SubLSymbol $sym1$V_COLOUR_P = makeSymbol("V-COLOUR-P");
  public static final SubLList $list2 = list(makeSymbol("SORTED-CONSTANT-LIST"), makeSymbol("SORTED-NAT-LIST"), makeSymbol("SORTED-ASSERTION-LIST"), makeSymbol("LIST-STRUCTURE"), makeSymbol("SORTED-VAR-POSITIONS"));
  public static final SubLList $list3 = list(makeKeyword("SORTED-CONSTANT-LIST"), makeKeyword("SORTED-NAT-LIST"), makeKeyword("SORTED-ASSERTION-LIST"), makeKeyword("LIST-STRUCTURE"), makeKeyword("SORTED-VAR-POSITIONS"));
  public static final SubLList $list4 = list(makeSymbol("V-COLOUR-SORTED-CONSTANT-LIST"), makeSymbol("V-COLOUR-SORTED-NAT-LIST"), makeSymbol("V-COLOUR-SORTED-ASSERTION-LIST"), makeSymbol("V-COLOUR-LIST-STRUCTURE"), makeSymbol("V-COLOUR-SORTED-VAR-POSITIONS"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-V-COLOUR-SORTED-CONSTANT-LIST"), makeSymbol("_CSETF-V-COLOUR-SORTED-NAT-LIST"), makeSymbol("_CSETF-V-COLOUR-SORTED-ASSERTION-LIST"), makeSymbol("_CSETF-V-COLOUR-LIST-STRUCTURE"), makeSymbol("_CSETF-V-COLOUR-SORTED-VAR-POSITIONS"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$V_COLOUR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("V-COLOUR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$V_COLOUR_SORTED_CONSTANT_LIST = makeSymbol("V-COLOUR-SORTED-CONSTANT-LIST");
  public static final SubLSymbol $sym9$_CSETF_V_COLOUR_SORTED_CONSTANT_LIST = makeSymbol("_CSETF-V-COLOUR-SORTED-CONSTANT-LIST");
  public static final SubLSymbol $sym10$V_COLOUR_SORTED_NAT_LIST = makeSymbol("V-COLOUR-SORTED-NAT-LIST");
  public static final SubLSymbol $sym11$_CSETF_V_COLOUR_SORTED_NAT_LIST = makeSymbol("_CSETF-V-COLOUR-SORTED-NAT-LIST");
  public static final SubLSymbol $sym12$V_COLOUR_SORTED_ASSERTION_LIST = makeSymbol("V-COLOUR-SORTED-ASSERTION-LIST");
  public static final SubLSymbol $sym13$_CSETF_V_COLOUR_SORTED_ASSERTION_LIST = makeSymbol("_CSETF-V-COLOUR-SORTED-ASSERTION-LIST");
  public static final SubLSymbol $sym14$V_COLOUR_LIST_STRUCTURE = makeSymbol("V-COLOUR-LIST-STRUCTURE");
  public static final SubLSymbol $sym15$_CSETF_V_COLOUR_LIST_STRUCTURE = makeSymbol("_CSETF-V-COLOUR-LIST-STRUCTURE");
  public static final SubLSymbol $sym16$V_COLOUR_SORTED_VAR_POSITIONS = makeSymbol("V-COLOUR-SORTED-VAR-POSITIONS");
  public static final SubLSymbol $sym17$_CSETF_V_COLOUR_SORTED_VAR_POSITIONS = makeSymbol("_CSETF-V-COLOUR-SORTED-VAR-POSITIONS");
  public static final SubLSymbol $kw18$SORTED_CONSTANT_LIST = makeKeyword("SORTED-CONSTANT-LIST");
  public static final SubLSymbol $kw19$SORTED_NAT_LIST = makeKeyword("SORTED-NAT-LIST");
  public static final SubLSymbol $kw20$SORTED_ASSERTION_LIST = makeKeyword("SORTED-ASSERTION-LIST");
  public static final SubLSymbol $kw21$LIST_STRUCTURE = makeKeyword("LIST-STRUCTURE");
  public static final SubLSymbol $kw22$SORTED_VAR_POSITIONS = makeKeyword("SORTED-VAR-POSITIONS");
  public static final SubLString $str23$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym24$V_COLOUR_AS_LIST = makeSymbol("V-COLOUR-AS-LIST");
  public static final SubLSymbol $sym25$ARC = makeSymbol("ARC");
  public static final SubLSymbol $sym26$ARC_P = makeSymbol("ARC-P");
  public static final SubLList $list27 = list(makeSymbol("HEAD"), makeSymbol("COLOUR"));
  public static final SubLList $list28 = list(makeKeyword("HEAD"), makeKeyword("COLOUR"));
  public static final SubLList $list29 = list(makeSymbol("ARC-HEAD"), makeSymbol("ARC-COLOUR"));
  public static final SubLList $list30 = list(makeSymbol("_CSETF-ARC-HEAD"), makeSymbol("_CSETF-ARC-COLOUR"));
  public static final SubLSymbol $sym31$PRINT_ARC = makeSymbol("PRINT-ARC");
  public static final SubLSymbol $sym32$ARC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ARC-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym33$ARC_HEAD = makeSymbol("ARC-HEAD");
  public static final SubLSymbol $sym34$_CSETF_ARC_HEAD = makeSymbol("_CSETF-ARC-HEAD");
  public static final SubLSymbol $sym35$ARC_COLOUR = makeSymbol("ARC-COLOUR");
  public static final SubLSymbol $sym36$_CSETF_ARC_COLOUR = makeSymbol("_CSETF-ARC-COLOUR");
  public static final SubLSymbol $kw37$HEAD = makeKeyword("HEAD");
  public static final SubLSymbol $kw38$COLOUR = makeKeyword("COLOUR");
  public static final SubLString $str39$__ARC__a_ = makeString("#<ARC:~a>");
  public static final SubLSymbol $kw40$VARIABLE = makeKeyword("VARIABLE");
  public static final SubLSymbol $sym41$VERTEX = makeSymbol("VERTEX");
  public static final SubLSymbol $sym42$VERTEX_P = makeSymbol("VERTEX-P");
  public static final SubLList $list43 = list(makeSymbol("ID"), makeSymbol("COLOUR"), makeSymbol("ARC-SET"));
  public static final SubLList $list44 = list(makeKeyword("ID"), makeKeyword("COLOUR"), makeKeyword("ARC-SET"));
  public static final SubLList $list45 = list(makeSymbol("VERTEX-ID"), makeSymbol("VERTEX-COLOUR"), makeSymbol("VERTEX-ARC-SET"));
  public static final SubLList $list46 = list(makeSymbol("_CSETF-VERTEX-ID"), makeSymbol("_CSETF-VERTEX-COLOUR"), makeSymbol("_CSETF-VERTEX-ARC-SET"));
  public static final SubLSymbol $sym47$PRINT_VERTEX = makeSymbol("PRINT-VERTEX");
  public static final SubLSymbol $sym48$VERTEX_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VERTEX-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym49$VERTEX_ID = makeSymbol("VERTEX-ID");
  public static final SubLSymbol $sym50$_CSETF_VERTEX_ID = makeSymbol("_CSETF-VERTEX-ID");
  public static final SubLSymbol $sym51$VERTEX_COLOUR = makeSymbol("VERTEX-COLOUR");
  public static final SubLSymbol $sym52$_CSETF_VERTEX_COLOUR = makeSymbol("_CSETF-VERTEX-COLOUR");
  public static final SubLSymbol $sym53$VERTEX_ARC_SET = makeSymbol("VERTEX-ARC-SET");
  public static final SubLSymbol $sym54$_CSETF_VERTEX_ARC_SET = makeSymbol("_CSETF-VERTEX-ARC-SET");
  public static final SubLSymbol $kw55$ID = makeKeyword("ID");
  public static final SubLSymbol $kw56$ARC_SET = makeKeyword("ARC-SET");
  public static final SubLString $str57$__VERTEX__a_ = makeString("#<VERTEX:~a>");
  public static final SubLString $str58$vertex_number__a_not_found = makeString("vertex number ~a not found");
  public static final SubLSymbol $sym59$ARC_AS_SORTABLE_LIST = makeSymbol("ARC-AS-SORTABLE-LIST");
  public static final SubLSymbol $sym60$ARC_AS_UNIFIABLE_LIST = makeSymbol("ARC-AS-UNIFIABLE-LIST");
  public static final SubLSymbol $sym61$NART_ID = makeSymbol("NART-ID");
  public static final SubLSymbol $sym62$ASSERTION_ID = makeSymbol("ASSERTION-ID");
  public static final SubLSymbol $sym63$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLSymbol $sym64$GRAPH_SEARCH_NODE = makeSymbol("GRAPH-SEARCH-NODE");
  public static final SubLSymbol $sym65$GRAPH_SEARCH_NODE_P = makeSymbol("GRAPH-SEARCH-NODE-P");
  public static final SubLList $list66 = list(makeSymbol("VERTEX"), makeSymbol("SEARCH-HISTORY"));
  public static final SubLList $list67 = list(makeKeyword("VERTEX"), makeKeyword("SEARCH-HISTORY"));
  public static final SubLList $list68 = list(makeSymbol("GRAPH-SEARCH-NODE-VERTEX"), makeSymbol("GRAPH-SEARCH-NODE-SEARCH-HISTORY"));
  public static final SubLList $list69 = list(makeSymbol("_CSETF-GRAPH-SEARCH-NODE-VERTEX"), makeSymbol("_CSETF-GRAPH-SEARCH-NODE-SEARCH-HISTORY"));
  public static final SubLSymbol $sym70$PRINT_GRAPH_SEARCH_NODE = makeSymbol("PRINT-GRAPH-SEARCH-NODE");
  public static final SubLSymbol $sym71$GRAPH_SEARCH_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GRAPH-SEARCH-NODE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym72$GRAPH_SEARCH_NODE_VERTEX = makeSymbol("GRAPH-SEARCH-NODE-VERTEX");
  public static final SubLSymbol $sym73$_CSETF_GRAPH_SEARCH_NODE_VERTEX = makeSymbol("_CSETF-GRAPH-SEARCH-NODE-VERTEX");
  public static final SubLSymbol $sym74$GRAPH_SEARCH_NODE_SEARCH_HISTORY = makeSymbol("GRAPH-SEARCH-NODE-SEARCH-HISTORY");
  public static final SubLSymbol $sym75$_CSETF_GRAPH_SEARCH_NODE_SEARCH_HISTORY = makeSymbol("_CSETF-GRAPH-SEARCH-NODE-SEARCH-HISTORY");
  public static final SubLSymbol $kw76$VERTEX = makeKeyword("VERTEX");
  public static final SubLSymbol $kw77$SEARCH_HISTORY = makeKeyword("SEARCH-HISTORY");
  public static final SubLString $str78$__NODE__s__s_ = makeString("#<NODE:~s ~s>");
  public static final SubLSymbol $sym79$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym80$INERT_VARIABLE = makeSymbol("INERT-VARIABLE");
  public static final SubLSymbol $kw81$ARC = makeKeyword("ARC");
  public static final SubLSymbol $kw82$VERTEX_INFO = makeKeyword("VERTEX-INFO");
  public static final SubLString $str83$graph_search_node___failed_to_com = makeString("graph-search-node-< failed to compare nodes ~%~s and ~%~s");
  public static final SubLSymbol $sym84$GRAPH_SEARCH_NODE__ = makeSymbol("GRAPH-SEARCH-NODE-<");
  public static final SubLString $str85$min_graph_search_node_failed_on_n = makeString("min-graph-search-node failed on nodes ~s");
  public static final SubLSymbol $sym86$GRAPH_SEARCH_NODE_AS_UNIFIABLE_SETS = makeSymbol("GRAPH-SEARCH-NODE-AS-UNIFIABLE-SETS");
  public static final SubLSymbol $sym87$GRAPH_SEARCH_NODE_AS_SORTABLE_SETS = makeSymbol("GRAPH-SEARCH-NODE-AS-SORTABLE-SETS");
  public static final SubLSymbol $sym88$VERTEX_SEARCH_STATE__ = makeSymbol("VERTEX-SEARCH-STATE-<");
  public static final SubLSymbol $sym89$SORTED_CONSTANT_INTERNAL_ID_LIST = makeSymbol("SORTED-CONSTANT-INTERNAL-ID-LIST");
  public static final SubLSymbol $sym90$TREE__ = makeSymbol("TREE-<");

  //// Initializers

  public void declareFunctions() {
    declare_czer_graph_file();
  }

  public void initializeVariables() {
    init_czer_graph_file();
  }

  public void runTopLevelForms() {
    setup_czer_graph_file();
  }

}
