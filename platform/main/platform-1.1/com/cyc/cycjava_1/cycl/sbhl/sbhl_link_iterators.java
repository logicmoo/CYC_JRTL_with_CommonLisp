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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_iteration;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_datastructures;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class sbhl_link_iterators extends SubLTranslatedFile {

  //// Constructor

  private sbhl_link_iterators() {}
  public static final SubLFile me = new sbhl_link_iterators();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_link_iterators";

  //// Definitions

  public static final class $sbhl_link_node_search_state_iterator_state_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $sbhl_link_node_search_state; }
    public SubLObject getField3() { return $remaining_modules; }
    public SubLObject getField4() { return $module_node_search_state_iterator; }
    public SubLObject setField2(SubLObject value) { return $sbhl_link_node_search_state = value; }
    public SubLObject setField3(SubLObject value) { return $remaining_modules = value; }
    public SubLObject setField4(SubLObject value) { return $module_node_search_state_iterator = value; }
    public SubLObject $sbhl_link_node_search_state = NIL;
    public SubLObject $remaining_modules = NIL;
    public SubLObject $module_node_search_state_iterator = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sbhl_link_node_search_state_iterator_state_native.class, $sym0$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, $sym1$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P, $list2, $list3, new String[] {"$sbhl_link_node_search_state", "$remaining_modules", "$module_node_search_state_iterator"}, $list4, $list5, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 1762) 
  public static SubLSymbol $dtp_sbhl_link_node_search_state_iterator_state$ = null;

  public static final class $sbhl_link_node_search_state_iterator_state_p$UnaryFunction extends UnaryFunction {
    public $sbhl_link_node_search_state_iterator_state_p$UnaryFunction() { super(extractFunctionNamed("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2447"); }
  }

  public static final class $sbhl_module_direction_link_search_state_iterator_state_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $mt_link_iterator; }
    public SubLObject getField3() { return $tv_link_search_state_iterator; }
    public SubLObject getField4() { return $graph_link; }
    public SubLObject getField5() { return $module; }
    public SubLObject getField6() { return $node; }
    public SubLObject getField7() { return $direction; }
    public SubLObject getField8() { return $genl_inverse_modeP; }
    public SubLObject setField2(SubLObject value) { return $mt_link_iterator = value; }
    public SubLObject setField3(SubLObject value) { return $tv_link_search_state_iterator = value; }
    public SubLObject setField4(SubLObject value) { return $graph_link = value; }
    public SubLObject setField5(SubLObject value) { return $module = value; }
    public SubLObject setField6(SubLObject value) { return $node = value; }
    public SubLObject setField7(SubLObject value) { return $direction = value; }
    public SubLObject setField8(SubLObject value) { return $genl_inverse_modeP = value; }
    public SubLObject $mt_link_iterator = NIL;
    public SubLObject $tv_link_search_state_iterator = NIL;
    public SubLObject $graph_link = NIL;
    public SubLObject $module = NIL;
    public SubLObject $node = NIL;
    public SubLObject $direction = NIL;
    public SubLObject $genl_inverse_modeP = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sbhl_module_direction_link_search_state_iterator_state_native.class, $sym25$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE, $sym26$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P, $list27, $list28, new String[] {"$mt_link_iterator", "$tv_link_search_state_iterator", "$graph_link", "$module", "$node", "$direction", "$genl_inverse_modeP"}, $list29, $list30, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 9590) 
  public static SubLSymbol $dtp_sbhl_module_direction_link_search_state_iterator_state$ = null;

  public static final class $sbhl_module_direction_link_search_state_iterator_state_p$UnaryFunction extends UnaryFunction {
    public $sbhl_module_direction_link_search_state_iterator_state_p$UnaryFunction() { super(extractFunctionNamed("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2453"); }
  }

  public static final class $sbhl_module_tv_link_node_search_state_iterator_state_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $tv_link_iterator; }
    public SubLObject getField3() { return $current_tv; }
    public SubLObject getField4() { return $current_remaining_nodes; }
    public SubLObject getField5() { return $module; }
    public SubLObject getField6() { return $parent_node; }
    public SubLObject getField7() { return $direction; }
    public SubLObject getField8() { return $mt; }
    public SubLObject getField9() { return $genl_inverse_modeP; }
    public SubLObject setField2(SubLObject value) { return $tv_link_iterator = value; }
    public SubLObject setField3(SubLObject value) { return $current_tv = value; }
    public SubLObject setField4(SubLObject value) { return $current_remaining_nodes = value; }
    public SubLObject setField5(SubLObject value) { return $module = value; }
    public SubLObject setField6(SubLObject value) { return $parent_node = value; }
    public SubLObject setField7(SubLObject value) { return $direction = value; }
    public SubLObject setField8(SubLObject value) { return $mt = value; }
    public SubLObject setField9(SubLObject value) { return $genl_inverse_modeP = value; }
    public SubLObject $tv_link_iterator = NIL;
    public SubLObject $current_tv = NIL;
    public SubLObject $current_remaining_nodes = NIL;
    public SubLObject $module = NIL;
    public SubLObject $parent_node = NIL;
    public SubLObject $direction = NIL;
    public SubLObject $mt = NIL;
    public SubLObject $genl_inverse_modeP = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sbhl_module_tv_link_node_search_state_iterator_state_native.class, $sym57$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, $sym58$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P, $list59, $list60, new String[] {"$tv_link_iterator", "$current_tv", "$current_remaining_nodes", "$module", "$parent_node", "$direction", "$mt", "$genl_inverse_modeP"}, $list61, $list62, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 15674) 
  public static SubLSymbol $dtp_sbhl_module_tv_link_node_search_state_iterator_state$ = null;

  public static final class $sbhl_module_tv_link_node_search_state_iterator_state_p$UnaryFunction extends UnaryFunction {
    public $sbhl_module_tv_link_node_search_state_iterator_state_p$UnaryFunction() { super(extractFunctionNamed("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2471"); }
  }

  public static final class $sbhl_module_naut_link_node_search_state_iterator_state_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $generating_functions; }
    public SubLObject getField3() { return $current_generating_function; }
    public SubLObject getField4() { return $current_remaining_nodes; }
    public SubLObject getField5() { return $module; }
    public SubLObject getField6() { return $parent_node; }
    public SubLObject getField7() { return $direction; }
    public SubLObject getField8() { return $mt; }
    public SubLObject getField9() { return $tv; }
    public SubLObject getField10() { return $genl_inverse_modeP; }
    public SubLObject setField2(SubLObject value) { return $generating_functions = value; }
    public SubLObject setField3(SubLObject value) { return $current_generating_function = value; }
    public SubLObject setField4(SubLObject value) { return $current_remaining_nodes = value; }
    public SubLObject setField5(SubLObject value) { return $module = value; }
    public SubLObject setField6(SubLObject value) { return $parent_node = value; }
    public SubLObject setField7(SubLObject value) { return $direction = value; }
    public SubLObject setField8(SubLObject value) { return $mt = value; }
    public SubLObject setField9(SubLObject value) { return $tv = value; }
    public SubLObject setField10(SubLObject value) { return $genl_inverse_modeP = value; }
    public SubLObject $generating_functions = NIL;
    public SubLObject $current_generating_function = NIL;
    public SubLObject $current_remaining_nodes = NIL;
    public SubLObject $module = NIL;
    public SubLObject $parent_node = NIL;
    public SubLObject $direction = NIL;
    public SubLObject $mt = NIL;
    public SubLObject $tv = NIL;
    public SubLObject $genl_inverse_modeP = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sbhl_module_naut_link_node_search_state_iterator_state_native.class, $sym89$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE, $sym90$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P, $list91, $list92, new String[] {"$generating_functions", "$current_generating_function", "$current_remaining_nodes", "$module", "$parent_node", "$direction", "$mt", "$tv", "$genl_inverse_modeP"}, $list93, $list94, $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 21796) 
  public static SubLSymbol $dtp_sbhl_module_naut_link_node_search_state_iterator_state$ = null;

  public static final class $sbhl_module_naut_link_node_search_state_iterator_state_p$UnaryFunction extends UnaryFunction {
    public $sbhl_module_naut_link_node_search_state_iterator_state_p$UnaryFunction() { super(extractFunctionNamed("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2463"); }
  }

  @SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27287) 
  public static SubLSymbol $sbhl_link_node_search_state_iterator_state_store$ = null;

  @SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27469) 
  public static SubLSymbol $sbhl_module_direction_link_search_state_iterator_state_store$ = null;

  @SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27561) 
  public static SubLSymbol $sbhl_module_tv_link_node_search_state_iterator_state_store$ = null;

  @SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27651) 
  public static SubLSymbol $sbhl_module_naut_link_node_search_state_iterator_state_store$ = null;

  @SubL(source = "cycl/sbhl/sbhl-link-iterators.lisp", position = 27743) 
  public static SubLSymbol $sbhl_link_iterator_resourcingP$ = null;

  public static final SubLObject declare_sbhl_link_iterators_file() {
    declareFunction(myName, "sbhl_link_node_search_state_iterator_state_print_function_trampoline", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_iterator_state_p", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false); new $sbhl_link_node_search_state_iterator_state_p$UnaryFunction();
    //declareFunction(myName, "sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_iterator_state_remaining_modules", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR", 1, 0, false);
    //declareFunction(myName, "_csetf_sbhl_link_node_search_state_iterator_state_sbhl_link_node_search_state", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_link_node_search_state_iterator_state_remaining_modules", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_link_node_search_state_iterator_state_module_node_search_state_iterator", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR", 2, 0, false);
    //declareFunction(myName, "make_sbhl_link_node_search_state_iterator_state", "MAKE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 1, false);
    //declareFunction(myName, "generate_new_sbhl_link_node_search_state_iterator_state", "GENERATE-NEW-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
    //declareFunction(myName, "get_sbhl_link_node_search_state_iterator_state_next_module", "GET-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-NEXT-MODULE", 1, 0, false);
    //declareFunction(myName, "update_sbhl_link_node_search_state_iterator_state", "UPDATE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_iterator_state_doneP", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DONE?", 1, 0, false);
    //declareFunction(myName, "new_sbhl_link_node_search_state_iterator", "NEW-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_iterator_done", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_iterator_next", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_iterator_finalize", "SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false);
    //declareFunction(myName, "new_sbhl_module_link_node_search_state_iterator", "NEW-SBHL-MODULE-LINK-NODE-SEARCH-STATE-ITERATOR", 2, 0, false);
    //declareFunction(myName, "new_fort_sbhl_module_link_node_search_state_iterator", "NEW-FORT-SBHL-MODULE-LINK-NODE-SEARCH-STATE-ITERATOR", 3, 0, false);
    //declareFunction(myName, "new_naut_sbhl_module_link_node_search_state_iterator", "NEW-NAUT-SBHL-MODULE-LINK-NODE-SEARCH-STATE-ITERATOR", 3, 0, false);
    declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_state_print_function_trampoline", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_state_p", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false); new $sbhl_module_direction_link_search_state_iterator_state_p$UnaryFunction();
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR", 1, 0, false);
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR", 1, 0, false);
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_state_graph_link", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK", 1, 0, false);
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_state_module", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_state_node", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_state_direction", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 1, 0, false);
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 1, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_direction_link_search_state_iterator_state_mt_link_iterator", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_direction_link_search_state_iterator_state_tv_link_search_state_iterator", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_direction_link_search_state_iterator_state_graph_link", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_direction_link_search_state_iterator_state_module", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_direction_link_search_state_iterator_state_node", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_direction_link_search_state_iterator_state_direction", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_direction_link_search_state_iterator_state_genl_inverse_modeP", "_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 2, 0, false);
    //declareFunction(myName, "make_sbhl_module_direction_link_search_state_iterator_state", "MAKE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 0, 1, false);
    //declareFunction(myName, "generate_new_sbhl_module_direction_link_search_state_iterator_state", "GENERATE-NEW-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 5, 0, false);
    //declareFunction(myName, "update_sbhl_module_direction_link_search_state_iterator_state", "UPDATE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_doneP", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE?", 1, 0, false);
    //declareFunction(myName, "new_sbhl_module_direction_link_search_state_iterator", "NEW-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR", 5, 0, false);
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_done", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_next", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "sbhl_module_direction_link_search_state_iterator_finalize", "SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false);
    declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_print_function_trampoline", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_p", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false); new $sbhl_module_tv_link_node_search_state_iterator_state_p$UnaryFunction();
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR", 1, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_current_tv", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV", 1, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 1, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_module", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_parent_node", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_direction", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 1, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_mt", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 1, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 1, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_tv_link_iterator", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_tv", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_current_remaining_nodes", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_module", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_parent_node", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_direction", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_mt", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_tv_link_node_search_state_iterator_state_genl_inverse_modeP", "_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 2, 0, false);
    //declareFunction(myName, "make_sbhl_module_tv_link_node_search_state_iterator_state", "MAKE-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 1, false);
    //declareFunction(myName, "generate_new_sbhl_module_tv_link_node_search_state_iterator_state", "GENERATE-NEW-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 6, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_doneP", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DONE?", 1, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_next_sbhl_link_node_search_state", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-NEXT-SBHL-LINK-NODE-SEARCH-STATE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATE-SBHL-LINK-NODE-SEARCH-STATE", 2, 0, false);
    //declareFunction(myName, "new_sbhl_module_tv_link_node_search_state_iterator", "NEW-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR", 6, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_done", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_next", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "sbhl_module_tv_link_node_search_state_iterator_finalize", "SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false);
    declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_print_function_trampoline", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_p", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P", 1, 0, false); new $sbhl_module_naut_link_node_search_state_iterator_state_p$UnaryFunction();
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_generating_functions", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_module", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_parent_node", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_direction", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_mt", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_tv", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 1, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_generating_functions", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_generating_function", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_current_remaining_nodes", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_module", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_parent_node", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_direction", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_mt", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_tv", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_module_naut_link_node_search_state_iterator_state_genl_inverse_modeP", "_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?", 2, 0, false);
    //declareFunction(myName, "make_sbhl_module_naut_link_node_search_state_iterator_state", "MAKE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 1, false);
    //declareFunction(myName, "generate_new_sbhl_module_naut_link_node_search_state_iterator_state", "GENERATE-NEW-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 7, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_doneP", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DONE?", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_next_sbhl_link_node_search_state", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-NEXT-SBHL-LINK-NODE-SEARCH-STATE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_state_generate_sbhl_link_node_search_state", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATE-SBHL-LINK-NODE-SEARCH-STATE", 2, 0, false);
    //declareFunction(myName, "new_sbhl_module_naut_link_node_search_state_iterator", "NEW-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR", 7, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_done", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_next", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "sbhl_module_naut_link_node_search_state_iterator_finalize", "SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE", 1, 0, false);
    //declareFunction(myName, "within_sbhl_link_iterator_resourcingP", "WITHIN-SBHL-LINK-ITERATOR-RESOURCING?", 0, 0, false);
    //declareMacro(myName, "with_sbhl_link_iterator_state_resourcing", "WITH-SBHL-LINK-ITERATOR-STATE-RESOURCING");
    //declareMacro(myName, "with_sbhl_link_iterator_resourcing", "WITH-SBHL-LINK-ITERATOR-RESOURCING");
    //declareFunction(myName, "find_or_create_sbhl_link_node_search_state_iterator_state", "FIND-OR-CREATE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
    //declareFunction(myName, "find_sbhl_link_node_search_state_iterator_state", "FIND-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
    //declareFunction(myName, "release_sbhl_link_node_search_state_iterator_state", "RELEASE-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
    //declareFunction(myName, "find_or_create_sbhl_module_direction_link_search_state_iterator_state", "FIND-OR-CREATE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
    //declareFunction(myName, "find_sbhl_module_direction_link_search_state_iterator_state", "FIND-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
    //declareFunction(myName, "release_sbhl_module_direction_link_search_state_iterator_state", "RELEASE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
    //declareFunction(myName, "find_or_create_sbhl_module_tv_link_node_search_state_iterator_state", "FIND-OR-CREATE-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
    //declareFunction(myName, "find_sbhl_module_tv_link_node_search_state_iterator_state", "FIND-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
    //declareFunction(myName, "release_sbhl_module_tv_link_node_search_state_iterator_state", "RELEASE-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
    //declareFunction(myName, "find_or_create_sbhl_module_naut_link_node_search_state_iterator_state", "FIND-OR-CREATE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
    //declareFunction(myName, "find_sbhl_module_naut_link_node_search_state_iterator_state", "FIND-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 0, 0, false);
    //declareFunction(myName, "release_sbhl_module_naut_link_node_search_state_iterator_state", "RELEASE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_link_iterators_file() {
    $dtp_sbhl_link_node_search_state_iterator_state$ = defconstant("*DTP-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*", $sym0$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
    $dtp_sbhl_module_direction_link_search_state_iterator_state$ = defconstant("*DTP-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE*", $sym25$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE);
    $dtp_sbhl_module_tv_link_node_search_state_iterator_state$ = defconstant("*DTP-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*", $sym57$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
    $dtp_sbhl_module_naut_link_node_search_state_iterator_state$ = defconstant("*DTP-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE*", $sym89$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
    $sbhl_link_node_search_state_iterator_state_store$ = defparameter("*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL);
    $sbhl_module_direction_link_search_state_iterator_state_store$ = defparameter("*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL);
    $sbhl_module_tv_link_node_search_state_iterator_state_store$ = defparameter("*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL);
    $sbhl_module_naut_link_node_search_state_iterator_state_store$ = defparameter("*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*", NIL);
    $sbhl_link_iterator_resourcingP$ = defparameter("*SBHL-LINK-ITERATOR-RESOURCING?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_sbhl_link_iterators_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_link_node_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function($sym7$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOL));
    Structures.def_csetf($sym8$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_SEARCH_, $sym9$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_);
    Structures.def_csetf($sym10$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODULES, $sym11$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODUL);
    Structures.def_csetf($sym12$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEARCH_STA, $sym13$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEA);
    Equality.identity($sym0$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_direction_link_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function($sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC));
    Structures.def_csetf($sym32$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_LINK_IT, $sym33$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_);
    Structures.def_csetf($sym34$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_LINK_SE, $sym35$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_);
    Structures.def_csetf($sym36$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRAPH_LINK, $sym37$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRA);
    Structures.def_csetf($sym38$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym39$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MOD);
    Structures.def_csetf($sym40$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NODE, $sym41$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NOD);
    Structures.def_csetf($sym42$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym43$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIR);
    Structures.def_csetf($sym44$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, $sym45$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GEN);
    Equality.identity($sym25$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_tv_link_node_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function($sym63$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTI));
    Structures.def_csetf($sym64$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LINK_ITER, $sym65$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LI);
    Structures.def_csetf($sym66$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_TV, $sym67$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE);
    Structures.def_csetf($sym68$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_REMA, $sym69$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE);
    Structures.def_csetf($sym70$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym71$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODUL);
    Structures.def_csetf($sym72$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NODE, $sym73$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAREN);
    Structures.def_csetf($sym74$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym75$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIREC);
    Structures.def_csetf($sym76$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT, $sym77$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT);
    Structures.def_csetf($sym78$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVERSE, $sym79$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_);
    Equality.identity($sym57$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_module_naut_link_node_search_state_iterator_state$.getGlobalValue(), Symbols.symbol_function($sym95$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC));
    Structures.def_csetf($sym96$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENERATING, $sym97$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN);
    Structures.def_csetf($sym98$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_GE, $sym99$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR);
    Structures.def_csetf($sym100$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_RE, $sym101$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR);
    Structures.def_csetf($sym102$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE, $sym103$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MOD);
    Structures.def_csetf($sym104$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NOD, $sym105$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAR);
    Structures.def_csetf($sym106$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION, $sym107$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIR);
    Structures.def_csetf($sym108$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT, $sym109$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT);
    Structures.def_csetf($sym110$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV, $sym111$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV);
    Structures.def_csetf($sym112$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVER, $sym113$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN);
    Equality.identity($sym89$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE");
  public static final SubLSymbol $sym1$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P");
  public static final SubLList $list2 = list(makeSymbol("SBHL-LINK-NODE-SEARCH-STATE"), makeSymbol("REMAINING-MODULES"), makeSymbol("MODULE-NODE-SEARCH-STATE-ITERATOR"));
  public static final SubLList $list3 = list(makeKeyword("SBHL-LINK-NODE-SEARCH-STATE"), makeKeyword("REMAINING-MODULES"), makeKeyword("MODULE-NODE-SEARCH-STATE-ITERATOR"));
  public static final SubLList $list4 = list(makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR"));
  public static final SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym7$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOL = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_SEARCH_ = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE");
  public static final SubLSymbol $sym9$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_SBHL_LINK_NODE_ = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-SBHL-LINK-NODE-SEARCH-STATE");
  public static final SubLSymbol $sym10$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODULES = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES");
  public static final SubLSymbol $sym11$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_REMAINING_MODUL = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-REMAINING-MODULES");
  public static final SubLSymbol $sym12$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEARCH_STA = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR");
  public static final SubLSymbol $sym13$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE_NODE_SEA = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE-NODE-SEARCH-STATE-ITERATOR");
  public static final SubLSymbol $kw14$SBHL_LINK_NODE_SEARCH_STATE = makeKeyword("SBHL-LINK-NODE-SEARCH-STATE");
  public static final SubLSymbol $kw15$REMAINING_MODULES = makeKeyword("REMAINING-MODULES");
  public static final SubLSymbol $kw16$MODULE_NODE_SEARCH_STATE_ITERATOR = makeKeyword("MODULE-NODE-SEARCH-STATE-ITERATOR");
  public static final SubLString $str17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym18$GET_SBHL_MODULE = makeSymbol("GET-SBHL-MODULE");
  public static final SubLSymbol $sym19$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");
  public static final SubLSymbol $sym20$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");
  public static final SubLSymbol $sym21$SBHL_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");
  public static final SubLString $str22$_a_is_neither_an_SBHL_node__FORT_ = makeString("~a is neither an SBHL node (FORT) nor a NAUT.  Returning a null-iterator.");
  public static final SubLString $str23$No__a_direction_links_for__a_with = makeString("No ~a direction links for ~a with module ~a.  Returning a null-iterator.");
  public static final SubLString $str24$No_generating_functions_for_direc = makeString("No generating functions for direction ~a, TV ~a, and module ~a.  Returning a null-iterator.");
  public static final SubLSymbol $sym25$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE");
  public static final SubLSymbol $sym26$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-P");
  public static final SubLList $list27 = list(makeSymbol("MT-LINK-ITERATOR"), makeSymbol("TV-LINK-SEARCH-STATE-ITERATOR"), makeSymbol("GRAPH-LINK"), makeSymbol("MODULE"), makeSymbol("NODE"), makeSymbol("DIRECTION"), makeSymbol("GENL-INVERSE-MODE?"));
  public static final SubLList $list28 = list(makeKeyword("MT-LINK-ITERATOR"), makeKeyword("TV-LINK-SEARCH-STATE-ITERATOR"), makeKeyword("GRAPH-LINK"), makeKeyword("MODULE"), makeKeyword("NODE"), makeKeyword("DIRECTION"), makeKeyword("GENL-INVERSE-MODE?"));
  public static final SubLList $list29 = list(makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));
  public static final SubLList $list30 = list(makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));
  public static final SubLSymbol $sym31$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym32$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_LINK_IT = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR");
  public static final SubLSymbol $sym33$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MT_ = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MT-LINK-ITERATOR");
  public static final SubLSymbol $sym34$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_LINK_SE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR");
  public static final SubLSymbol $sym35$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_TV_ = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-TV-LINK-SEARCH-STATE-ITERATOR");
  public static final SubLSymbol $sym36$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRAPH_LINK = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK");
  public static final SubLSymbol $sym37$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GRA = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GRAPH-LINK");
  public static final SubLSymbol $sym38$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MODULE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE");
  public static final SubLSymbol $sym39$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_MOD = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-MODULE");
  public static final SubLSymbol $sym40$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NODE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE");
  public static final SubLSymbol $sym41$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_NOD = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-NODE");
  public static final SubLSymbol $sym42$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIRECTION = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION");
  public static final SubLSymbol $sym43$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_DIR = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-DIRECTION");
  public static final SubLSymbol $sym44$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GENL_INVER = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");
  public static final SubLSymbol $sym45$_CSETF_SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol("_CSETF-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");
  public static final SubLSymbol $kw46$MT_LINK_ITERATOR = makeKeyword("MT-LINK-ITERATOR");
  public static final SubLSymbol $kw47$TV_LINK_SEARCH_STATE_ITERATOR = makeKeyword("TV-LINK-SEARCH-STATE-ITERATOR");
  public static final SubLSymbol $kw48$GRAPH_LINK = makeKeyword("GRAPH-LINK");
  public static final SubLSymbol $kw49$MODULE = makeKeyword("MODULE");
  public static final SubLSymbol $kw50$NODE = makeKeyword("NODE");
  public static final SubLSymbol $kw51$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw52$GENL_INVERSE_MODE_ = makeKeyword("GENL-INVERSE-MODE?");
  public static final SubLList $list53 = list(makeSymbol("MT"), makeSymbol("TV-LINKS"));
  public static final SubLSymbol $sym54$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-DONE");
  public static final SubLSymbol $sym55$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-NEXT");
  public static final SubLSymbol $sym56$SBHL_MODULE_DIRECTION_LINK_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-FINALIZE");
  public static final SubLSymbol $sym57$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE");
  public static final SubLSymbol $sym58$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P");
  public static final SubLList $list59 = list(makeSymbol("TV-LINK-ITERATOR"), makeSymbol("CURRENT-TV"), makeSymbol("CURRENT-REMAINING-NODES"), makeSymbol("MODULE"), makeSymbol("PARENT-NODE"), makeSymbol("DIRECTION"), makeSymbol("MT"), makeSymbol("GENL-INVERSE-MODE?"));
  public static final SubLList $list60 = list(makeKeyword("TV-LINK-ITERATOR"), makeKeyword("CURRENT-TV"), makeKeyword("CURRENT-REMAINING-NODES"), makeKeyword("MODULE"), makeKeyword("PARENT-NODE"), makeKeyword("DIRECTION"), makeKeyword("MT"), makeKeyword("GENL-INVERSE-MODE?"));
  public static final SubLList $list61 = list(makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));
  public static final SubLList $list62 = list(makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?"));
  public static final SubLSymbol $sym63$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNCTI = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym64$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LINK_ITER = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR");
  public static final SubLSymbol $sym65$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV_LI = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV-LINK-ITERATOR");
  public static final SubLSymbol $sym66$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_TV = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV");
  public static final SubLSymbol $sym67$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-TV");
  public static final SubLSymbol $sym68$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_REMA = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");
  public static final SubLSymbol $sym69$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRE = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");
  public static final SubLSymbol $sym70$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE");
  public static final SubLSymbol $sym71$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODUL = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE");
  public static final SubLSymbol $sym72$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NODE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE");
  public static final SubLSymbol $sym73$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAREN = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE");
  public static final SubLSymbol $sym74$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION");
  public static final SubLSymbol $sym75$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIREC = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION");
  public static final SubLSymbol $sym76$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT");
  public static final SubLSymbol $sym77$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT");
  public static final SubLSymbol $sym78$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVERSE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");
  public static final SubLSymbol $sym79$_CSETF_SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_ = makeSymbol("_CSETF-SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");
  public static final SubLSymbol $kw80$TV_LINK_ITERATOR = makeKeyword("TV-LINK-ITERATOR");
  public static final SubLSymbol $kw81$CURRENT_TV = makeKeyword("CURRENT-TV");
  public static final SubLSymbol $kw82$CURRENT_REMAINING_NODES = makeKeyword("CURRENT-REMAINING-NODES");
  public static final SubLSymbol $kw83$PARENT_NODE = makeKeyword("PARENT-NODE");
  public static final SubLSymbol $kw84$MT = makeKeyword("MT");
  public static final SubLList $list85 = list(makeSymbol("TV"), makeSymbol("LINKS"));
  public static final SubLSymbol $sym86$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");
  public static final SubLSymbol $sym87$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");
  public static final SubLSymbol $sym88$SBHL_MODULE_TV_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");
  public static final SubLSymbol $sym89$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE");
  public static final SubLSymbol $sym90$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_P = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-P");
  public static final SubLList $list91 = list(new SubLObject[] {makeSymbol("GENERATING-FUNCTIONS"), makeSymbol("CURRENT-GENERATING-FUNCTION"), makeSymbol("CURRENT-REMAINING-NODES"), makeSymbol("MODULE"), makeSymbol("PARENT-NODE"), makeSymbol("DIRECTION"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("GENL-INVERSE-MODE?")});
  public static final SubLList $list92 = list(new SubLObject[] {makeKeyword("GENERATING-FUNCTIONS"), makeKeyword("CURRENT-GENERATING-FUNCTION"), makeKeyword("CURRENT-REMAINING-NODES"), makeKeyword("MODULE"), makeKeyword("PARENT-NODE"), makeKeyword("DIRECTION"), makeKeyword("MT"), makeKeyword("TV"), makeKeyword("GENL-INVERSE-MODE?")});
  public static final SubLList $list93 = list(new SubLObject[] {makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV"), makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?")});
  public static final SubLList $list94 = list(new SubLObject[] {makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV"), makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?")});
  public static final SubLSymbol $sym95$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PRINT_FUNC = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym96$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENERATING = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS");
  public static final SubLSymbol $sym97$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENERATING-FUNCTIONS");
  public static final SubLSymbol $sym98$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_GE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION");
  public static final SubLSymbol $sym99$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-GENERATING-FUNCTION");
  public static final SubLSymbol $sym100$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CURRENT_RE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");
  public static final SubLSymbol $sym101$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_CUR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-CURRENT-REMAINING-NODES");
  public static final SubLSymbol $sym102$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MODULE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE");
  public static final SubLSymbol $sym103$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MOD = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MODULE");
  public static final SubLSymbol $sym104$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PARENT_NOD = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE");
  public static final SubLSymbol $sym105$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_PAR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-PARENT-NODE");
  public static final SubLSymbol $sym106$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIRECTION = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION");
  public static final SubLSymbol $sym107$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_DIR = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-DIRECTION");
  public static final SubLSymbol $sym108$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT");
  public static final SubLSymbol $sym109$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_MT = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-MT");
  public static final SubLSymbol $sym110$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV");
  public static final SubLSymbol $sym111$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_TV = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-TV");
  public static final SubLSymbol $sym112$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GENL_INVER = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");
  public static final SubLSymbol $sym113$_CSETF_SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_STATE_GEN = makeSymbol("_CSETF-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-GENL-INVERSE-MODE?");
  public static final SubLSymbol $kw114$GENERATING_FUNCTIONS = makeKeyword("GENERATING-FUNCTIONS");
  public static final SubLSymbol $kw115$CURRENT_GENERATING_FUNCTION = makeKeyword("CURRENT-GENERATING-FUNCTION");
  public static final SubLSymbol $kw116$TV = makeKeyword("TV");
  public static final SubLSymbol $sym117$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_DONE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-DONE");
  public static final SubLSymbol $sym118$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_NEXT = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-NEXT");
  public static final SubLSymbol $sym119$SBHL_MODULE_NAUT_LINK_NODE_SEARCH_STATE_ITERATOR_FINALIZE = makeSymbol("SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-FINALIZE");
  public static final SubLSymbol $sym120$CLET = makeSymbol("CLET");
  public static final SubLList $list121 = list(list(makeSymbol("*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-MODULE-TV-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("FIF"), list(makeSymbol("WITHIN-SBHL-LINK-ITERATOR-RESOURCING?")), makeSymbol("*SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE-STORE*"), list(makeSymbol("NEW-SBHL-STACK")))), list(makeSymbol("*SBHL-LINK-ITERATOR-RESOURCING?*"), T));
  public static final SubLSymbol $sym122$WITH_SBHL_ITERATOR_RESOURCING = makeSymbol("WITH-SBHL-ITERATOR-RESOURCING");
  public static final SubLSymbol $sym123$WITH_SBHL_LINK_ITERATOR_STATE_RESOURCING = makeSymbol("WITH-SBHL-LINK-ITERATOR-STATE-RESOURCING");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_link_iterators_file();
  }

  public void initializeVariables() {
    init_sbhl_link_iterators_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_link_iterators_file();
  }

}
