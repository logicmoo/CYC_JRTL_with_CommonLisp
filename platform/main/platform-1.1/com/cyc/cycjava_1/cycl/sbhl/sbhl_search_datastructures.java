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
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.vector_utilities;

public  final class sbhl_search_datastructures extends SubLTranslatedFile {

  //// Constructor

  private sbhl_search_datastructures() {}
  public static final SubLFile me = new sbhl_search_datastructures();
  public static final String myName = "com.cyc.cycjava_1.cycl.sbhl.sbhl_search_datastructures";

  //// Definitions

  public static final class $sbhl_stack_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $num; }
    public SubLObject getField3() { return $elements; }
    public SubLObject setField2(SubLObject value) { return $num = value; }
    public SubLObject setField3(SubLObject value) { return $elements = value; }
    public SubLObject $num = NIL;
    public SubLObject $elements = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sbhl_stack_native.class, $sym0$SBHL_STACK, $sym1$SBHL_STACK_P, $list2, $list3, new String[] {"$num", "$elements"}, $list4, $list5, $sym6$PRINT_SBHL_STACK);
  }

  @SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 1074) 
  public static SubLSymbol $dtp_sbhl_stack$ = null;

  public static final class $sbhl_stack_p$UnaryFunction extends UnaryFunction {
    public $sbhl_stack_p$UnaryFunction() { super(extractFunctionNamed("SBHL-STACK-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2307"); }
  }

  public static final class $sbhl_link_node_search_state_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $node; }
    public SubLObject getField3() { return $module; }
    public SubLObject getField4() { return $direction; }
    public SubLObject getField5() { return $mt; }
    public SubLObject getField6() { return $tv; }
    public SubLObject getField7() { return $parent_node; }
    public SubLObject getField8() { return $genl_inverse_modeP; }
    public SubLObject getField9() { return $link_generator; }
    public SubLObject setField2(SubLObject value) { return $node = value; }
    public SubLObject setField3(SubLObject value) { return $module = value; }
    public SubLObject setField4(SubLObject value) { return $direction = value; }
    public SubLObject setField5(SubLObject value) { return $mt = value; }
    public SubLObject setField6(SubLObject value) { return $tv = value; }
    public SubLObject setField7(SubLObject value) { return $parent_node = value; }
    public SubLObject setField8(SubLObject value) { return $genl_inverse_modeP = value; }
    public SubLObject setField9(SubLObject value) { return $link_generator = value; }
    public SubLObject $node = NIL;
    public SubLObject $module = NIL;
    public SubLObject $direction = NIL;
    public SubLObject $mt = NIL;
    public SubLObject $tv = NIL;
    public SubLObject $parent_node = NIL;
    public SubLObject $genl_inverse_modeP = NIL;
    public SubLObject $link_generator = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($sbhl_link_node_search_state_native.class, $sym20$SBHL_LINK_NODE_SEARCH_STATE, $sym21$SBHL_LINK_NODE_SEARCH_STATE_P, $list22, $list23, new String[] {"$node", "$module", "$direction", "$mt", "$tv", "$parent_node", "$genl_inverse_modeP", "$link_generator"}, $list24, $list25, $sym26$PRINT_SBHL_LINK_NODE_SEARCH_STATE);
  }

  @SubL(source = "cycl/sbhl/sbhl-search-datastructures.lisp", position = 3677) 
  public static SubLSymbol $dtp_sbhl_link_node_search_state$ = null;

  public static final class $sbhl_link_node_search_state_p$UnaryFunction extends UnaryFunction {
    public $sbhl_link_node_search_state_p$UnaryFunction() { super(extractFunctionNamed("SBHL-LINK-NODE-SEARCH-STATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 2293"); }
  }

  public static final SubLObject declare_sbhl_search_datastructures_file() {
    declareFunction(myName, "sbhl_stack_print_function_trampoline", "SBHL-STACK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sbhl_stack_p", "SBHL-STACK-P", 1, 0, false); new $sbhl_stack_p$UnaryFunction();
    //declareFunction(myName, "sbhl_stack_num", "SBHL-STACK-NUM", 1, 0, false);
    //declareFunction(myName, "sbhl_stack_elements", "SBHL-STACK-ELEMENTS", 1, 0, false);
    //declareFunction(myName, "_csetf_sbhl_stack_num", "_CSETF-SBHL-STACK-NUM", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_stack_elements", "_CSETF-SBHL-STACK-ELEMENTS", 2, 0, false);
    //declareFunction(myName, "make_sbhl_stack", "MAKE-SBHL-STACK", 0, 1, false);
    //declareFunction(myName, "print_sbhl_stack", "PRINT-SBHL-STACK", 3, 0, false);
    //declareFunction(myName, "new_sbhl_stack", "NEW-SBHL-STACK", 0, 1, false);
    //declareFunction(myName, "sbhl_stack_size", "SBHL-STACK-SIZE", 1, 0, false);
    //declareFunction(myName, "sbhl_stack_emptyP", "SBHL-STACK-EMPTY?", 1, 0, false);
    //declareFunction(myName, "sbhl_stack_push", "SBHL-STACK-PUSH", 2, 0, false);
    //declareFunction(myName, "sbhl_stack_pop", "SBHL-STACK-POP", 1, 0, false);
    //declareFunction(myName, "sbhl_stack_peek", "SBHL-STACK-PEEK", 1, 0, false);
    //declareFunction(myName, "clear_sbhl_stack", "CLEAR-SBHL-STACK", 1, 0, false);
    declareFunction(myName, "sbhl_link_node_search_state_print_function_trampoline", "SBHL-LINK-NODE-SEARCH-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_p", "SBHL-LINK-NODE-SEARCH-STATE-P", 1, 0, false); new $sbhl_link_node_search_state_p$UnaryFunction();
    //declareFunction(myName, "sbhl_link_node_search_state_node", "SBHL-LINK-NODE-SEARCH-STATE-NODE", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_module", "SBHL-LINK-NODE-SEARCH-STATE-MODULE", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_direction", "SBHL-LINK-NODE-SEARCH-STATE-DIRECTION", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_mt", "SBHL-LINK-NODE-SEARCH-STATE-MT", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_tv", "SBHL-LINK-NODE-SEARCH-STATE-TV", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_parent_node", "SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_genl_inverse_modeP", "SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?", 1, 0, false);
    //declareFunction(myName, "sbhl_link_node_search_state_link_generator", "SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR", 1, 0, false);
    //declareFunction(myName, "_csetf_sbhl_link_node_search_state_node", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-NODE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_link_node_search_state_module", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MODULE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_link_node_search_state_direction", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_link_node_search_state_mt", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MT", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_link_node_search_state_tv", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-TV", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_link_node_search_state_parent_node", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_link_node_search_state_genl_inverse_modeP", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?", 2, 0, false);
    //declareFunction(myName, "_csetf_sbhl_link_node_search_state_link_generator", "_CSETF-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR", 2, 0, false);
    //declareFunction(myName, "make_sbhl_link_node_search_state", "MAKE-SBHL-LINK-NODE-SEARCH-STATE", 0, 1, false);
    //declareFunction(myName, "print_sbhl_link_node_search_state", "PRINT-SBHL-LINK-NODE-SEARCH-STATE", 3, 0, false);
    //declareFunction(myName, "new_sbhl_link_node_search_state", "NEW-SBHL-LINK-NODE-SEARCH-STATE", 7, 1, false);
    //declareFunction(myName, "get_sbhl_link_node_search_state_node", "GET-SBHL-LINK-NODE-SEARCH-STATE-NODE", 1, 0, false);
    //declareFunction(myName, "get_sbhl_link_node_search_state_module", "GET-SBHL-LINK-NODE-SEARCH-STATE-MODULE", 1, 0, false);
    //declareFunction(myName, "get_sbhl_link_node_search_state_direction", "GET-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION", 1, 0, false);
    //declareFunction(myName, "get_sbhl_link_node_search_state_mt", "GET-SBHL-LINK-NODE-SEARCH-STATE-MT", 1, 0, false);
    //declareFunction(myName, "get_sbhl_link_node_search_state_tv", "GET-SBHL-LINK-NODE-SEARCH-STATE-TV", 1, 0, false);
    //declareFunction(myName, "get_sbhl_link_node_search_state_parent_node", "GET-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE", 1, 0, false);
    //declareFunction(myName, "get_sbhl_link_node_search_state_genl_inverse_modeP", "GET-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?", 1, 0, false);
    //declareFunction(myName, "get_sbhl_link_node_search_state_link_generator", "GET-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR", 1, 0, false);
    //declareFunction(myName, "print_sbhl_link_node_search_state_contents", "PRINT-SBHL-LINK-NODE-SEARCH-STATE-CONTENTS", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_sbhl_search_datastructures_file() {
    $dtp_sbhl_stack$ = defconstant("*DTP-SBHL-STACK*", $sym0$SBHL_STACK);
    $dtp_sbhl_link_node_search_state$ = defconstant("*DTP-SBHL-LINK-NODE-SEARCH-STATE*", $sym20$SBHL_LINK_NODE_SEARCH_STATE);
    return NIL;
  }

  public static final SubLObject setup_sbhl_search_datastructures_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_stack$.getGlobalValue(), Symbols.symbol_function($sym7$SBHL_STACK_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$SBHL_STACK_NUM, $sym9$_CSETF_SBHL_STACK_NUM);
    Structures.def_csetf($sym10$SBHL_STACK_ELEMENTS, $sym11$_CSETF_SBHL_STACK_ELEMENTS);
    Equality.identity($sym0$SBHL_STACK);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_sbhl_link_node_search_state$.getGlobalValue(), Symbols.symbol_function($sym27$SBHL_LINK_NODE_SEARCH_STATE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym28$SBHL_LINK_NODE_SEARCH_STATE_NODE, $sym29$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_NODE);
    Structures.def_csetf($sym30$SBHL_LINK_NODE_SEARCH_STATE_MODULE, $sym31$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_MODULE);
    Structures.def_csetf($sym32$SBHL_LINK_NODE_SEARCH_STATE_DIRECTION, $sym33$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_DIRECTION);
    Structures.def_csetf($sym34$SBHL_LINK_NODE_SEARCH_STATE_MT, $sym35$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_MT);
    Structures.def_csetf($sym36$SBHL_LINK_NODE_SEARCH_STATE_TV, $sym37$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_TV);
    Structures.def_csetf($sym38$SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE, $sym39$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE);
    Structures.def_csetf($sym40$SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_, $sym41$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_);
    Structures.def_csetf($sym42$SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR, $sym43$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR);
    Equality.identity($sym20$SBHL_LINK_NODE_SEARCH_STATE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SBHL_STACK = makeSymbol("SBHL-STACK");
  public static final SubLSymbol $sym1$SBHL_STACK_P = makeSymbol("SBHL-STACK-P");
  public static final SubLList $list2 = list(makeSymbol("NUM"), makeSymbol("ELEMENTS"));
  public static final SubLList $list3 = list(makeKeyword("NUM"), makeKeyword("ELEMENTS"));
  public static final SubLList $list4 = list(makeSymbol("SBHL-STACK-NUM"), makeSymbol("SBHL-STACK-ELEMENTS"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-SBHL-STACK-NUM"), makeSymbol("_CSETF-SBHL-STACK-ELEMENTS"));
  public static final SubLSymbol $sym6$PRINT_SBHL_STACK = makeSymbol("PRINT-SBHL-STACK");
  public static final SubLSymbol $sym7$SBHL_STACK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-STACK-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$SBHL_STACK_NUM = makeSymbol("SBHL-STACK-NUM");
  public static final SubLSymbol $sym9$_CSETF_SBHL_STACK_NUM = makeSymbol("_CSETF-SBHL-STACK-NUM");
  public static final SubLSymbol $sym10$SBHL_STACK_ELEMENTS = makeSymbol("SBHL-STACK-ELEMENTS");
  public static final SubLSymbol $sym11$_CSETF_SBHL_STACK_ELEMENTS = makeSymbol("_CSETF-SBHL-STACK-ELEMENTS");
  public static final SubLSymbol $kw12$NUM = makeKeyword("NUM");
  public static final SubLSymbol $kw13$ELEMENTS = makeKeyword("ELEMENTS");
  public static final SubLString $str14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str15$__ = makeString("#<");
  public static final SubLSymbol $kw16$STREAM = makeKeyword("STREAM");
  public static final SubLString $str17$size_ = makeString("size=");
  public static final SubLSymbol $kw18$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym19$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym20$SBHL_LINK_NODE_SEARCH_STATE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE");
  public static final SubLSymbol $sym21$SBHL_LINK_NODE_SEARCH_STATE_P = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-P");
  public static final SubLList $list22 = list(makeSymbol("NODE"), makeSymbol("MODULE"), makeSymbol("DIRECTION"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("PARENT-NODE"), makeSymbol("GENL-INVERSE-MODE?"), makeSymbol("LINK-GENERATOR"));
  public static final SubLList $list23 = list(makeKeyword("NODE"), makeKeyword("MODULE"), makeKeyword("DIRECTION"), makeKeyword("MT"), makeKeyword("TV"), makeKeyword("PARENT-NODE"), makeKeyword("GENL-INVERSE-MODE?"), makeKeyword("LINK-GENERATOR"));
  public static final SubLList $list24 = list(makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-NODE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MODULE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-DIRECTION"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MT"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-TV"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?"), makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR"));
  public static final SubLList $list25 = list(makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-NODE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MODULE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MT"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-TV"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?"), makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR"));
  public static final SubLSymbol $sym26$PRINT_SBHL_LINK_NODE_SEARCH_STATE = makeSymbol("PRINT-SBHL-LINK-NODE-SEARCH-STATE");
  public static final SubLSymbol $sym27$SBHL_LINK_NODE_SEARCH_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym28$SBHL_LINK_NODE_SEARCH_STATE_NODE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-NODE");
  public static final SubLSymbol $sym29$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_NODE = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-NODE");
  public static final SubLSymbol $sym30$SBHL_LINK_NODE_SEARCH_STATE_MODULE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MODULE");
  public static final SubLSymbol $sym31$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_MODULE = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MODULE");
  public static final SubLSymbol $sym32$SBHL_LINK_NODE_SEARCH_STATE_DIRECTION = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-DIRECTION");
  public static final SubLSymbol $sym33$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_DIRECTION = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-DIRECTION");
  public static final SubLSymbol $sym34$SBHL_LINK_NODE_SEARCH_STATE_MT = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-MT");
  public static final SubLSymbol $sym35$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_MT = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-MT");
  public static final SubLSymbol $sym36$SBHL_LINK_NODE_SEARCH_STATE_TV = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-TV");
  public static final SubLSymbol $sym37$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_TV = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-TV");
  public static final SubLSymbol $sym38$SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE");
  public static final SubLSymbol $sym39$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_PARENT_NODE = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-PARENT-NODE");
  public static final SubLSymbol $sym40$SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_ = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?");
  public static final SubLSymbol $sym41$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_GENL_INVERSE_MODE_ = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-GENL-INVERSE-MODE?");
  public static final SubLSymbol $sym42$SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR = makeSymbol("SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR");
  public static final SubLSymbol $sym43$_CSETF_SBHL_LINK_NODE_SEARCH_STATE_LINK_GENERATOR = makeSymbol("_CSETF-SBHL-LINK-NODE-SEARCH-STATE-LINK-GENERATOR");
  public static final SubLSymbol $kw44$NODE = makeKeyword("NODE");
  public static final SubLSymbol $kw45$MODULE = makeKeyword("MODULE");
  public static final SubLSymbol $kw46$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw47$MT = makeKeyword("MT");
  public static final SubLSymbol $kw48$TV = makeKeyword("TV");
  public static final SubLSymbol $kw49$PARENT_NODE = makeKeyword("PARENT-NODE");
  public static final SubLSymbol $kw50$GENL_INVERSE_MODE_ = makeKeyword("GENL-INVERSE-MODE?");
  public static final SubLSymbol $kw51$LINK_GENERATOR = makeKeyword("LINK-GENERATOR");
  public static final SubLString $str52$__a____a_ = makeString("(~a : ~a)");
  public static final SubLString $str53$Node_______________a__ = makeString("Node:             ~a~%");
  public static final SubLString $str54$Module_____________a__ = makeString("Module:           ~a~%");
  public static final SubLString $str55$Direction__________a__ = makeString("Direction:        ~a~%");
  public static final SubLString $str56$Mt_________________a__ = makeString("Mt:               ~a~%");
  public static final SubLString $str57$TV_________________a__ = makeString("TV:               ~a~%");
  public static final SubLString $str58$Parent_Node________a__ = makeString("Parent Node:      ~a~%");
  public static final SubLString $str59$genlInverse_mode___a__ = makeString("genlInverse mode: ~a~%");
  public static final SubLString $str60$Link_Generator_____a__ = makeString("Link Generator:   ~a~%");

  //// Initializers

  public void declareFunctions() {
    declare_sbhl_search_datastructures_file();
  }

  public void initializeVariables() {
    init_sbhl_search_datastructures_file();
  }

  public void runTopLevelForms() {
    setup_sbhl_search_datastructures_file();
  }

}
