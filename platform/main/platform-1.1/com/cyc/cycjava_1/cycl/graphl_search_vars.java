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
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class graphl_search_vars extends SubLTranslatedFile {

  //// Constructor

  private graphl_search_vars() {}
  public static final SubLFile me = new graphl_search_vars();
  public static final String myName = "com.cyc.cycjava_1.cycl.graphl_search_vars";

  //// Definitions

  public static final class $graphl_search_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $direction; }
    public SubLObject getField3() { return $type; }
    public SubLObject getField4() { return $order; }
    public SubLObject getField5() { return $cutoff; }
    public SubLObject getField6() { return $marking; }
    public SubLObject getField7() { return $marking_space; }
    public SubLObject getField8() { return $goal_space; }
    public SubLObject getField9() { return $goal; }
    public SubLObject getField10() { return $goal_fn; }
    public SubLObject getField11() { return $goal_found_p; }
    public SubLObject getField12() { return $satisfy_fn; }
    public SubLObject getField13() { return $map_fn; }
    public SubLObject getField14() { return $justifyP; }
    public SubLObject getField15() { return $add_to_resultP; }
    public SubLObject getField16() { return $unwind_fn_toggle; }
    public SubLObject getField17() { return $result; }
    public SubLObject getField18() { return $graph; }
    public SubLObject setField2(SubLObject value) { return $direction = value; }
    public SubLObject setField3(SubLObject value) { return $type = value; }
    public SubLObject setField4(SubLObject value) { return $order = value; }
    public SubLObject setField5(SubLObject value) { return $cutoff = value; }
    public SubLObject setField6(SubLObject value) { return $marking = value; }
    public SubLObject setField7(SubLObject value) { return $marking_space = value; }
    public SubLObject setField8(SubLObject value) { return $goal_space = value; }
    public SubLObject setField9(SubLObject value) { return $goal = value; }
    public SubLObject setField10(SubLObject value) { return $goal_fn = value; }
    public SubLObject setField11(SubLObject value) { return $goal_found_p = value; }
    public SubLObject setField12(SubLObject value) { return $satisfy_fn = value; }
    public SubLObject setField13(SubLObject value) { return $map_fn = value; }
    public SubLObject setField14(SubLObject value) { return $justifyP = value; }
    public SubLObject setField15(SubLObject value) { return $add_to_resultP = value; }
    public SubLObject setField16(SubLObject value) { return $unwind_fn_toggle = value; }
    public SubLObject setField17(SubLObject value) { return $result = value; }
    public SubLObject setField18(SubLObject value) { return $graph = value; }
    public SubLObject $direction = NIL;
    public SubLObject $type = NIL;
    public SubLObject $order = NIL;
    public SubLObject $cutoff = NIL;
    public SubLObject $marking = NIL;
    public SubLObject $marking_space = NIL;
    public SubLObject $goal_space = NIL;
    public SubLObject $goal = NIL;
    public SubLObject $goal_fn = NIL;
    public SubLObject $goal_found_p = NIL;
    public SubLObject $satisfy_fn = NIL;
    public SubLObject $map_fn = NIL;
    public SubLObject $justifyP = NIL;
    public SubLObject $add_to_resultP = NIL;
    public SubLObject $unwind_fn_toggle = NIL;
    public SubLObject $result = NIL;
    public SubLObject $graph = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($graphl_search_native.class, $sym0$GRAPHL_SEARCH, $sym1$GRAPHL_SEARCH_P, $list2, $list3, new String[] {"$direction", "$type", "$order", "$cutoff", "$marking", "$marking_space", "$goal_space", "$goal", "$goal_fn", "$goal_found_p", "$satisfy_fn", "$map_fn", "$justifyP", "$add_to_resultP", "$unwind_fn_toggle", "$result", "$graph"}, $list4, $list5, $sym6$PRINT_GRAPHL_SEARCH);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static SubLSymbol $dtp_graphl_search$ = null;

  public static final class $graphl_search_p$UnaryFunction extends UnaryFunction {
    public $graphl_search_p$UnaryFunction() { super(extractFunctionNamed("GRAPHL-SEARCH-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31962"); }
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject graphl_search_direction(SubLObject object) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.getField2();
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject graphl_search_order(SubLObject object) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.getField4();
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject graphl_search_marking_space(SubLObject object) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.getField7();
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject graphl_search_goal(SubLObject object) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.getField9();
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject graphl_search_goal_fn(SubLObject object) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.getField10();
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject graphl_search_justifyP(SubLObject object) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.getField14();
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject graphl_search_result(SubLObject object) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.getField17();
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject _csetf_graphl_search_direction(SubLObject object, SubLObject value) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject _csetf_graphl_search_type(SubLObject object, SubLObject value) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject _csetf_graphl_search_order(SubLObject object, SubLObject value) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject _csetf_graphl_search_marking(SubLObject object, SubLObject value) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject _csetf_graphl_search_marking_space(SubLObject object, SubLObject value) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject _csetf_graphl_search_goal(SubLObject object, SubLObject value) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject _csetf_graphl_search_goal_found_p(SubLObject object, SubLObject value) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.setField11(value);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject _csetf_graphl_search_justifyP(SubLObject object, SubLObject value) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.setField14(value);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject _csetf_graphl_search_result(SubLObject object, SubLObject value) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.setField17(value);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject _csetf_graphl_search_graph(SubLObject object, SubLObject value) {
    checkType(object, $sym1$GRAPHL_SEARCH_P);
    return object.setField18(value);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 849) 
  public static final SubLObject make_graphl_search(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $graphl_search_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw42$DIRECTION)) {
            _csetf_graphl_search_direction(v_new, current_value);
          } else if (pcase_var.eql($kw43$TYPE)) {
            _csetf_graphl_search_type(v_new, current_value);
          } else if (pcase_var.eql($kw44$ORDER)) {
            _csetf_graphl_search_order(v_new, current_value);
          } else if (pcase_var.eql($kw45$CUTOFF)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31934");
          } else if (pcase_var.eql($kw46$MARKING)) {
            _csetf_graphl_search_marking(v_new, current_value);
          } else if (pcase_var.eql($kw47$MARKING_SPACE)) {
            _csetf_graphl_search_marking_space(v_new, current_value);
          } else if (pcase_var.eql($kw48$GOAL_SPACE)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31940");
          } else if (pcase_var.eql($kw49$GOAL)) {
            _csetf_graphl_search_goal(v_new, current_value);
          } else if (pcase_var.eql($kw50$GOAL_FN)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31937");
          } else if (pcase_var.eql($kw51$GOAL_FOUND_P)) {
            _csetf_graphl_search_goal_found_p(v_new, current_value);
          } else if (pcase_var.eql($kw52$SATISFY_FN)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31947");
          } else if (pcase_var.eql($kw53$MAP_FN)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31944");
          } else if (pcase_var.eql($kw54$JUSTIFY_)) {
            _csetf_graphl_search_justifyP(v_new, current_value);
          } else if (pcase_var.eql($kw55$ADD_TO_RESULT_)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31931");
          } else if (pcase_var.eql($kw56$UNWIND_FN_TOGGLE)) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31950");
          } else if (pcase_var.eql($kw57$RESULT)) {
            _csetf_graphl_search_result(v_new, current_value);
          } else if (pcase_var.eql($kw58$GRAPH)) {
            _csetf_graphl_search_graph(v_new, current_value);
          } else {
            Errors.error($str59$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 2502) 
  public static final SubLObject new_graphl_search(SubLObject plist) {
    {
      SubLObject graphl_search = make_graphl_search(UNPROVIDED);
      SubLObject remainder = NIL;
      for (remainder = plist; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
        {
          SubLObject property = remainder.first();
          SubLObject value = conses_high.cadr(remainder);
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31969");
        }
      }
      possibly_initialize_graphl_marking_spaces(graphl_search);
      set_graphl_search_result(graphl_search, NIL);
      return graphl_search;
    }
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 2850) 
  public static final SubLObject destroy_graphl_search(SubLObject graph_search) {
    _csetf_graphl_search_direction(graph_search, $kw81$FREE);
    _csetf_graphl_search_marking_space(graph_search, $kw81$FREE);
    _csetf_graphl_search_result(graph_search, $kw81$FREE);
    _csetf_graphl_search_graph(graph_search, $kw81$FREE);
    return NIL;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 3266) 
  public static final SubLObject graphl_direction(SubLObject v_search) {
    return graphl_search_direction(v_search);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 3353) 
  public static final SubLObject graphl_order(SubLObject v_search) {
    return graphl_search_order(v_search);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 3515) 
  public static final SubLObject graphl_space(SubLObject v_search) {
    return graphl_search_marking_space(v_search);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 3942) 
  public static final SubLObject graphl_compute_justifyP(SubLObject v_search) {
    return graphl_search_justifyP(v_search);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 4213) 
  public static final SubLObject graphl_result(SubLObject v_search) {
    return graphl_search_result(v_search);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 4294) 
  public static final SubLObject graphl_depth_first_search_p(SubLObject v_search) {
    return Equality.eq(graphl_order(v_search), $kw82$DEPTH_FIRST);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 8065) 
  public static final SubLObject set_graphl_search_type(SubLObject v_search, SubLObject type) {
    _csetf_graphl_search_type(v_search, type);
    return NIL;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 8262) 
  public static final SubLObject set_graphl_search_direction(SubLObject v_search, SubLObject direction) {
    _csetf_graphl_search_direction(v_search, direction);
    return NIL;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 8394) 
  public static final SubLObject set_graphl_search_order(SubLObject v_search, SubLObject order) {
    _csetf_graphl_search_order(v_search, order);
    return NIL;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 8640) 
  public static final SubLObject set_graphl_search_marking(SubLObject v_search, SubLObject marking) {
    _csetf_graphl_search_marking(v_search, marking);
    return NIL;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 8764) 
  public static final SubLObject set_graphl_search_marking_space(SubLObject v_search, SubLObject marking_space) {
    _csetf_graphl_search_marking_space(v_search, marking_space);
    return NIL;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 8912) 
  public static final SubLObject set_graphl_search_goal(SubLObject v_search, SubLObject goal) {
    _csetf_graphl_search_goal(v_search, goal);
    return NIL;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 9148) 
  public static final SubLObject set_graphl_search_goal_found_p(SubLObject v_search, SubLObject found_p) {
    _csetf_graphl_search_goal_found_p(v_search, found_p);
    return NIL;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 9674) 
  public static final SubLObject set_graphl_search_justifyP(SubLObject v_search, SubLObject justifyP) {
    _csetf_graphl_search_justifyP(v_search, justifyP);
    return NIL;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 9802) 
  public static final SubLObject set_graphl_search_result(SubLObject v_search, SubLObject result) {
    _csetf_graphl_search_result(v_search, result);
    return NIL;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 10054) 
  public static final SubLObject possibly_initialize_graphl_marking_spaces(SubLObject v_search) {
    {
      SubLObject space = graphl_search_marking_space(v_search);
      if ((NIL == space)) {
        _csetf_graphl_search_marking_space(v_search, graphl_instantiate_new_space());
      }
    }
    return v_search;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 10682) 
  public static final SubLObject graphl_add_to_result(SubLObject v_search, SubLObject addition, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQ);
    }
    {
      SubLObject item_var = addition;
      if ((NIL == conses_high.member(item_var, graphl_search_result(v_search), test, Symbols.symbol_function(IDENTITY)))) {
        _csetf_graphl_search_result(v_search, cons(item_var, graphl_search_result(v_search)));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 11815) 
  private static SubLSymbol $graphl_search_size$ = null;

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 11909) 
  public static final SubLObject graphl_search_size() {
    return $graphl_search_size$.getGlobalValue();
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 11979) 
  public static final SubLObject graphl_instantiate_new_space() {
    return Hashtables.make_hash_table(graphl_search_size(), UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 12230) 
  public static final SubLObject graphl_forward_direction_p(SubLObject direction) {
    return Equality.eq(direction, $kw97$FORWARD);
  }

  @SubL(source = "cycl/graphl-search-vars.lisp", position = 12321) 
  public static final SubLObject determine_graphl_relevant_directions(SubLObject graphl_direction) {
    {
      SubLObject pcase_var = graphl_direction;
      if (pcase_var.eql($kw99$ACCESSIBLE)) {
        return $list100;
      } else if (pcase_var.eql($kw97$FORWARD)) {
        return $list101;
      } else if (pcase_var.eql($kw98$BACKWARD)) {
        return $list102;
      }
    }
    return NIL;
  }

  public static final SubLObject declare_graphl_search_vars_file() {
    declareFunction(myName, "graphl_search_print_function_trampoline", "GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "graphl_search_p", "GRAPHL-SEARCH-P", 1, 0, false); new $graphl_search_p$UnaryFunction();
    declareFunction(myName, "graphl_search_direction", "GRAPHL-SEARCH-DIRECTION", 1, 0, false);
    declareFunction(myName, "graphl_search_type", "GRAPHL-SEARCH-TYPE", 1, 0, false);
    declareFunction(myName, "graphl_search_order", "GRAPHL-SEARCH-ORDER", 1, 0, false);
    declareFunction(myName, "graphl_search_cutoff", "GRAPHL-SEARCH-CUTOFF", 1, 0, false);
    declareFunction(myName, "graphl_search_marking", "GRAPHL-SEARCH-MARKING", 1, 0, false);
    declareFunction(myName, "graphl_search_marking_space", "GRAPHL-SEARCH-MARKING-SPACE", 1, 0, false);
    declareFunction(myName, "graphl_search_goal_space", "GRAPHL-SEARCH-GOAL-SPACE", 1, 0, false);
    declareFunction(myName, "graphl_search_goal", "GRAPHL-SEARCH-GOAL", 1, 0, false);
    declareFunction(myName, "graphl_search_goal_fn", "GRAPHL-SEARCH-GOAL-FN", 1, 0, false);
    declareFunction(myName, "graphl_search_goal_found_p", "GRAPHL-SEARCH-GOAL-FOUND-P", 1, 0, false);
    declareFunction(myName, "graphl_search_satisfy_fn", "GRAPHL-SEARCH-SATISFY-FN", 1, 0, false);
    declareFunction(myName, "graphl_search_map_fn", "GRAPHL-SEARCH-MAP-FN", 1, 0, false);
    declareFunction(myName, "graphl_search_justifyP", "GRAPHL-SEARCH-JUSTIFY?", 1, 0, false);
    declareFunction(myName, "graphl_search_add_to_resultP", "GRAPHL-SEARCH-ADD-TO-RESULT?", 1, 0, false);
    declareFunction(myName, "graphl_search_unwind_fn_toggle", "GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 1, 0, false);
    declareFunction(myName, "graphl_search_result", "GRAPHL-SEARCH-RESULT", 1, 0, false);
    declareFunction(myName, "graphl_search_graph", "GRAPHL-SEARCH-GRAPH", 1, 0, false);
    declareFunction(myName, "_csetf_graphl_search_direction", "_CSETF-GRAPHL-SEARCH-DIRECTION", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_type", "_CSETF-GRAPHL-SEARCH-TYPE", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_order", "_CSETF-GRAPHL-SEARCH-ORDER", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_cutoff", "_CSETF-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_marking", "_CSETF-GRAPHL-SEARCH-MARKING", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_marking_space", "_CSETF-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_goal_space", "_CSETF-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_goal", "_CSETF-GRAPHL-SEARCH-GOAL", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_goal_fn", "_CSETF-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_goal_found_p", "_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_satisfy_fn", "_CSETF-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_map_fn", "_CSETF-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_justifyP", "_CSETF-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_add_to_resultP", "_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_unwind_fn_toggle", "_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_result", "_CSETF-GRAPHL-SEARCH-RESULT", 2, 0, false);
    declareFunction(myName, "_csetf_graphl_search_graph", "_CSETF-GRAPHL-SEARCH-GRAPH", 2, 0, false);
    declareFunction(myName, "make_graphl_search", "MAKE-GRAPHL-SEARCH", 0, 1, false);
    declareFunction(myName, "print_graphl_search", "PRINT-GRAPHL-SEARCH", 3, 0, false);
    declareFunction(myName, "describe_graphl_search", "DESCRIBE-GRAPHL-SEARCH", 1, 0, false);
    declareFunction(myName, "new_graphl_search", "NEW-GRAPHL-SEARCH", 1, 0, false);
    declareFunction(myName, "destroy_graphl_search", "DESTROY-GRAPHL-SEARCH", 1, 0, false);
    declareFunction(myName, "graphl_type", "GRAPHL-TYPE", 1, 0, false);
    declareFunction(myName, "graphl_direction", "GRAPHL-DIRECTION", 1, 0, false);
    declareFunction(myName, "graphl_order", "GRAPHL-ORDER", 1, 0, false);
    declareFunction(myName, "graphl_marking", "GRAPHL-MARKING", 1, 0, false);
    declareFunction(myName, "graphl_space", "GRAPHL-SPACE", 1, 0, false);
    declareFunction(myName, "graphl_goal", "GRAPHL-GOAL", 1, 0, false);
    declareFunction(myName, "graphl_goal_space", "GRAPHL-GOAL-SPACE", 1, 0, false);
    declareFunction(myName, "graphl_goal_found_p", "GRAPHL-GOAL-FOUND-P", 1, 0, false);
    declareFunction(myName, "graphl_map_fn", "GRAPHL-MAP-FN", 1, 0, false);
    declareFunction(myName, "graphl_compute_justifyP", "GRAPHL-COMPUTE-JUSTIFY?", 1, 0, false);
    declareFunction(myName, "graphl_cutoff", "GRAPHL-CUTOFF", 1, 0, false);
    declareFunction(myName, "graphl_add_to_resultP", "GRAPHL-ADD-TO-RESULT?", 1, 0, false);
    declareFunction(myName, "graphl_result", "GRAPHL-RESULT", 1, 0, false);
    declareFunction(myName, "graphl_depth_first_search_p", "GRAPHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
    declareFunction(myName, "graphl_breadth_first_search_p", "GRAPHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
    declareFunction(myName, "graphl_iterative_deepening_search_p", "GRAPHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
    declareFunction(myName, "graphl_depth_marking_search_p", "GRAPHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
    declareFunction(myName, "graphl_return_one_answer_p", "GRAPHL-RETURN-ONE-ANSWER-P", 1, 0, false);
    declareFunction(myName, "graphl_add_nodes_on_wind_p", "GRAPHL-ADD-NODES-ON-WIND-P", 1, 0, false);
    declareFunction(myName, "graphl_add_edges_on_unwind_p", "GRAPHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
    declareFunction(myName, "graphl_goal_search_p", "GRAPHL-GOAL-SEARCH-P", 1, 0, false);
    declareFunction(myName, "graphl_single_goal_p", "GRAPHL-SINGLE-GOAL-P", 1, 0, false);
    declareFunction(myName, "graphl_multiple_goals_p", "GRAPHL-MULTIPLE-GOALS-P", 1, 0, false);
    declareFunction(myName, "graphl_goal_fn_p", "GRAPHL-GOAL-FN-P", 1, 0, false);
    declareFunction(myName, "graphl_map_p", "GRAPHL-MAP-P", 1, 0, false);
    declareFunction(myName, "graphl_depth_cutoff", "GRAPHL-DEPTH-CUTOFF", 1, 0, false);
    declareFunction(myName, "graphl_cutoff_search_p", "GRAPHL-CUTOFF-SEARCH-P", 1, 0, false);
    declareFunction(myName, "valid_graphl_search_order_p", "VALID-GRAPHL-SEARCH-ORDER-P", 1, 0, false);
    declareFunction(myName, "valid_graphl_cutoff_p", "VALID-GRAPHL-CUTOFF-P", 1, 0, false);
    declareFunction(myName, "valid_graphl_marking_style_p", "VALID-GRAPHL-MARKING-STYLE-P", 1, 0, false);
    declareFunction(myName, "valid_graphl_search_direction_p", "VALID-GRAPHL-SEARCH-DIRECTION-P", 1, 0, false);
    declareFunction(myName, "graphl_table_p", "GRAPHL-TABLE-P", 1, 0, false);
    declareMacro(myName, "with_graphl_search_initialized", "WITH-GRAPHL-SEARCH-INITIALIZED");
    declareFunction(myName, "set_graphl_search_properties", "SET-GRAPHL-SEARCH-PROPERTIES", 2, 0, false);
    declareFunction(myName, "set_graphl_search_property", "SET-GRAPHL-SEARCH-PROPERTY", 3, 0, false);
    declareFunction(myName, "set_graphl_search_type", "SET-GRAPHL-SEARCH-TYPE", 2, 0, false);
    declareFunction(myName, "set_graphl_search_direction", "SET-GRAPHL-SEARCH-DIRECTION", 2, 0, false);
    declareFunction(myName, "set_graphl_search_order", "SET-GRAPHL-SEARCH-ORDER", 2, 0, false);
    declareFunction(myName, "set_graphl_search_cutoff", "SET-GRAPHL-SEARCH-CUTOFF", 2, 0, false);
    declareFunction(myName, "set_graphl_search_marking", "SET-GRAPHL-SEARCH-MARKING", 2, 0, false);
    declareFunction(myName, "set_graphl_search_marking_space", "SET-GRAPHL-SEARCH-MARKING-SPACE", 2, 0, false);
    declareFunction(myName, "set_graphl_search_goal", "SET-GRAPHL-SEARCH-GOAL", 2, 0, false);
    declareFunction(myName, "set_graphl_search_goal_fn", "SET-GRAPHL-SEARCH-GOAL-FN", 2, 0, false);
    declareFunction(myName, "set_graphl_search_goal_found_p", "SET-GRAPHL-SEARCH-GOAL-FOUND-P", 2, 0, false);
    declareFunction(myName, "set_graphl_search_goal_space", "SET-GRAPHL-SEARCH-GOAL-SPACE", 2, 0, false);
    declareFunction(myName, "set_graphl_search_satisfy_fn", "SET-GRAPHL-SEARCH-SATISFY-FN", 2, 0, false);
    declareFunction(myName, "set_graphl_search_map_fn", "SET-GRAPHL-SEARCH-MAP-FN", 2, 0, false);
    declareFunction(myName, "set_graphl_search_justifyP", "SET-GRAPHL-SEARCH-JUSTIFY?", 2, 0, false);
    declareFunction(myName, "set_graphl_search_result", "SET-GRAPHL-SEARCH-RESULT", 2, 0, false);
    declareFunction(myName, "set_graphl_search_add_to_resultP", "SET-GRAPHL-SEARCH-ADD-TO-RESULT?", 2, 0, false);
    declareFunction(myName, "possibly_initialize_graphl_marking_spaces", "POSSIBLY-INITIALIZE-GRAPHL-MARKING-SPACES", 1, 0, false);
    declareFunction(myName, "reinitialize_graphl_spaces", "REINITIALIZE-GRAPHL-SPACES", 1, 0, false);
    declareFunction(myName, "graphl_add_node_to_result", "GRAPHL-ADD-NODE-TO-RESULT", 2, 0, false);
    declareFunction(myName, "graphl_add_to_result", "GRAPHL-ADD-TO-RESULT", 2, 1, false);
    declareFunction(myName, "graphl_append_to_result", "GRAPHL-APPEND-TO-RESULT", 2, 0, false);
    declareFunction(myName, "graphl_toggle_unwind_off", "GRAPHL-TOGGLE-UNWIND-OFF", 1, 0, false);
    declareFunction(myName, "graphl_toggle_unwind_on", "GRAPHL-TOGGLE-UNWIND-ON", 1, 0, false);
    declareFunction(myName, "graphl_node_provides_answer_p", "GRAPHL-NODE-PROVIDES-ANSWER-P", 2, 0, false);
    declareFunction(myName, "graphl_search_size", "GRAPHL-SEARCH-SIZE", 0, 0, false);
    declareFunction(myName, "graphl_instantiate_new_space", "GRAPHL-INSTANTIATE-NEW-SPACE", 0, 0, false);
    declareFunction(myName, "graphl_forward_direction", "GRAPHL-FORWARD-DIRECTION", 0, 0, false);
    declareFunction(myName, "graphl_backward_direction", "GRAPHL-BACKWARD-DIRECTION", 0, 0, false);
    declareFunction(myName, "graphl_forward_direction_p", "GRAPHL-FORWARD-DIRECTION-P", 1, 0, false);
    declareFunction(myName, "determine_graphl_relevant_directions", "DETERMINE-GRAPHL-RELEVANT-DIRECTIONS", 1, 0, false);
    declareMacro(myName, "do_graphl_relevant_directions", "DO-GRAPHL-RELEVANT-DIRECTIONS");
    declareFunction(myName, "graphl_opposite_direction", "GRAPHL-OPPOSITE-DIRECTION", 1, 0, false);
    declareFunction(myName, "graphl_goal_found_condition_p", "GRAPHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_graphl_search_vars_file() {
    $dtp_graphl_search$ = defconstant("*DTP-GRAPHL-SEARCH*", $sym0$GRAPHL_SEARCH);
    $graphl_search_size$ = deflexical("*GRAPHL-SEARCH-SIZE*", $int96$200);
    return NIL;
  }

  public static final SubLObject setup_graphl_search_vars_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_graphl_search$.getGlobalValue(), Symbols.symbol_function($sym7$GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$GRAPHL_SEARCH_DIRECTION, $sym9$_CSETF_GRAPHL_SEARCH_DIRECTION);
    Structures.def_csetf($sym10$GRAPHL_SEARCH_TYPE, $sym11$_CSETF_GRAPHL_SEARCH_TYPE);
    Structures.def_csetf($sym12$GRAPHL_SEARCH_ORDER, $sym13$_CSETF_GRAPHL_SEARCH_ORDER);
    Structures.def_csetf($sym14$GRAPHL_SEARCH_CUTOFF, $sym15$_CSETF_GRAPHL_SEARCH_CUTOFF);
    Structures.def_csetf($sym16$GRAPHL_SEARCH_MARKING, $sym17$_CSETF_GRAPHL_SEARCH_MARKING);
    Structures.def_csetf($sym18$GRAPHL_SEARCH_MARKING_SPACE, $sym19$_CSETF_GRAPHL_SEARCH_MARKING_SPACE);
    Structures.def_csetf($sym20$GRAPHL_SEARCH_GOAL_SPACE, $sym21$_CSETF_GRAPHL_SEARCH_GOAL_SPACE);
    Structures.def_csetf($sym22$GRAPHL_SEARCH_GOAL, $sym23$_CSETF_GRAPHL_SEARCH_GOAL);
    Structures.def_csetf($sym24$GRAPHL_SEARCH_GOAL_FN, $sym25$_CSETF_GRAPHL_SEARCH_GOAL_FN);
    Structures.def_csetf($sym26$GRAPHL_SEARCH_GOAL_FOUND_P, $sym27$_CSETF_GRAPHL_SEARCH_GOAL_FOUND_P);
    Structures.def_csetf($sym28$GRAPHL_SEARCH_SATISFY_FN, $sym29$_CSETF_GRAPHL_SEARCH_SATISFY_FN);
    Structures.def_csetf($sym30$GRAPHL_SEARCH_MAP_FN, $sym31$_CSETF_GRAPHL_SEARCH_MAP_FN);
    Structures.def_csetf($sym32$GRAPHL_SEARCH_JUSTIFY_, $sym33$_CSETF_GRAPHL_SEARCH_JUSTIFY_);
    Structures.def_csetf($sym34$GRAPHL_SEARCH_ADD_TO_RESULT_, $sym35$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_);
    Structures.def_csetf($sym36$GRAPHL_SEARCH_UNWIND_FN_TOGGLE, $sym37$_CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE);
    Structures.def_csetf($sym38$GRAPHL_SEARCH_RESULT, $sym39$_CSETF_GRAPHL_SEARCH_RESULT);
    Structures.def_csetf($sym40$GRAPHL_SEARCH_GRAPH, $sym41$_CSETF_GRAPHL_SEARCH_GRAPH);
    Equality.identity($sym0$GRAPHL_SEARCH);
    access_macros.register_macro_helper($sym93$SET_GRAPHL_SEARCH_PROPERTIES, $sym95$WITH_GRAPHL_SEARCH_INITIALIZED);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$GRAPHL_SEARCH = makeSymbol("GRAPHL-SEARCH");
  public static final SubLSymbol $sym1$GRAPHL_SEARCH_P = makeSymbol("GRAPHL-SEARCH-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("DIRECTION"), makeSymbol("TYPE"), makeSymbol("ORDER"), makeSymbol("CUTOFF"), makeSymbol("MARKING"), makeSymbol("MARKING-SPACE"), makeSymbol("GOAL-SPACE"), makeSymbol("GOAL"), makeSymbol("GOAL-FN"), makeSymbol("GOAL-FOUND-P"), makeSymbol("SATISFY-FN"), makeSymbol("MAP-FN"), makeSymbol("JUSTIFY?"), makeSymbol("ADD-TO-RESULT?"), makeSymbol("UNWIND-FN-TOGGLE"), makeSymbol("RESULT"), makeSymbol("GRAPH")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("DIRECTION"), makeKeyword("TYPE"), makeKeyword("ORDER"), makeKeyword("CUTOFF"), makeKeyword("MARKING"), makeKeyword("MARKING-SPACE"), makeKeyword("GOAL-SPACE"), makeKeyword("GOAL"), makeKeyword("GOAL-FN"), makeKeyword("GOAL-FOUND-P"), makeKeyword("SATISFY-FN"), makeKeyword("MAP-FN"), makeKeyword("JUSTIFY?"), makeKeyword("ADD-TO-RESULT?"), makeKeyword("UNWIND-FN-TOGGLE"), makeKeyword("RESULT"), makeKeyword("GRAPH")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("GRAPHL-SEARCH-DIRECTION"), makeSymbol("GRAPHL-SEARCH-TYPE"), makeSymbol("GRAPHL-SEARCH-ORDER"), makeSymbol("GRAPHL-SEARCH-CUTOFF"), makeSymbol("GRAPHL-SEARCH-MARKING"), makeSymbol("GRAPHL-SEARCH-MARKING-SPACE"), makeSymbol("GRAPHL-SEARCH-GOAL-SPACE"), makeSymbol("GRAPHL-SEARCH-GOAL"), makeSymbol("GRAPHL-SEARCH-GOAL-FN"), makeSymbol("GRAPHL-SEARCH-GOAL-FOUND-P"), makeSymbol("GRAPHL-SEARCH-SATISFY-FN"), makeSymbol("GRAPHL-SEARCH-MAP-FN"), makeSymbol("GRAPHL-SEARCH-JUSTIFY?"), makeSymbol("GRAPHL-SEARCH-ADD-TO-RESULT?"), makeSymbol("GRAPHL-SEARCH-UNWIND-FN-TOGGLE"), makeSymbol("GRAPHL-SEARCH-RESULT"), makeSymbol("GRAPHL-SEARCH-GRAPH")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-GRAPHL-SEARCH-DIRECTION"), makeSymbol("_CSETF-GRAPHL-SEARCH-TYPE"), makeSymbol("_CSETF-GRAPHL-SEARCH-ORDER"), makeSymbol("_CSETF-GRAPHL-SEARCH-CUTOFF"), makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING"), makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING-SPACE"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-SPACE"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FN"), makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P"), makeSymbol("_CSETF-GRAPHL-SEARCH-SATISFY-FN"), makeSymbol("_CSETF-GRAPHL-SEARCH-MAP-FN"), makeSymbol("_CSETF-GRAPHL-SEARCH-JUSTIFY?"), makeSymbol("_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?"), makeSymbol("_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE"), makeSymbol("_CSETF-GRAPHL-SEARCH-RESULT"), makeSymbol("_CSETF-GRAPHL-SEARCH-GRAPH")});
  public static final SubLSymbol $sym6$PRINT_GRAPHL_SEARCH = makeSymbol("PRINT-GRAPHL-SEARCH");
  public static final SubLSymbol $sym7$GRAPHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GRAPHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$GRAPHL_SEARCH_DIRECTION = makeSymbol("GRAPHL-SEARCH-DIRECTION");
  public static final SubLSymbol $sym9$_CSETF_GRAPHL_SEARCH_DIRECTION = makeSymbol("_CSETF-GRAPHL-SEARCH-DIRECTION");
  public static final SubLSymbol $sym10$GRAPHL_SEARCH_TYPE = makeSymbol("GRAPHL-SEARCH-TYPE");
  public static final SubLSymbol $sym11$_CSETF_GRAPHL_SEARCH_TYPE = makeSymbol("_CSETF-GRAPHL-SEARCH-TYPE");
  public static final SubLSymbol $sym12$GRAPHL_SEARCH_ORDER = makeSymbol("GRAPHL-SEARCH-ORDER");
  public static final SubLSymbol $sym13$_CSETF_GRAPHL_SEARCH_ORDER = makeSymbol("_CSETF-GRAPHL-SEARCH-ORDER");
  public static final SubLSymbol $sym14$GRAPHL_SEARCH_CUTOFF = makeSymbol("GRAPHL-SEARCH-CUTOFF");
  public static final SubLSymbol $sym15$_CSETF_GRAPHL_SEARCH_CUTOFF = makeSymbol("_CSETF-GRAPHL-SEARCH-CUTOFF");
  public static final SubLSymbol $sym16$GRAPHL_SEARCH_MARKING = makeSymbol("GRAPHL-SEARCH-MARKING");
  public static final SubLSymbol $sym17$_CSETF_GRAPHL_SEARCH_MARKING = makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING");
  public static final SubLSymbol $sym18$GRAPHL_SEARCH_MARKING_SPACE = makeSymbol("GRAPHL-SEARCH-MARKING-SPACE");
  public static final SubLSymbol $sym19$_CSETF_GRAPHL_SEARCH_MARKING_SPACE = makeSymbol("_CSETF-GRAPHL-SEARCH-MARKING-SPACE");
  public static final SubLSymbol $sym20$GRAPHL_SEARCH_GOAL_SPACE = makeSymbol("GRAPHL-SEARCH-GOAL-SPACE");
  public static final SubLSymbol $sym21$_CSETF_GRAPHL_SEARCH_GOAL_SPACE = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-SPACE");
  public static final SubLSymbol $sym22$GRAPHL_SEARCH_GOAL = makeSymbol("GRAPHL-SEARCH-GOAL");
  public static final SubLSymbol $sym23$_CSETF_GRAPHL_SEARCH_GOAL = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL");
  public static final SubLSymbol $sym24$GRAPHL_SEARCH_GOAL_FN = makeSymbol("GRAPHL-SEARCH-GOAL-FN");
  public static final SubLSymbol $sym25$_CSETF_GRAPHL_SEARCH_GOAL_FN = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FN");
  public static final SubLSymbol $sym26$GRAPHL_SEARCH_GOAL_FOUND_P = makeSymbol("GRAPHL-SEARCH-GOAL-FOUND-P");
  public static final SubLSymbol $sym27$_CSETF_GRAPHL_SEARCH_GOAL_FOUND_P = makeSymbol("_CSETF-GRAPHL-SEARCH-GOAL-FOUND-P");
  public static final SubLSymbol $sym28$GRAPHL_SEARCH_SATISFY_FN = makeSymbol("GRAPHL-SEARCH-SATISFY-FN");
  public static final SubLSymbol $sym29$_CSETF_GRAPHL_SEARCH_SATISFY_FN = makeSymbol("_CSETF-GRAPHL-SEARCH-SATISFY-FN");
  public static final SubLSymbol $sym30$GRAPHL_SEARCH_MAP_FN = makeSymbol("GRAPHL-SEARCH-MAP-FN");
  public static final SubLSymbol $sym31$_CSETF_GRAPHL_SEARCH_MAP_FN = makeSymbol("_CSETF-GRAPHL-SEARCH-MAP-FN");
  public static final SubLSymbol $sym32$GRAPHL_SEARCH_JUSTIFY_ = makeSymbol("GRAPHL-SEARCH-JUSTIFY?");
  public static final SubLSymbol $sym33$_CSETF_GRAPHL_SEARCH_JUSTIFY_ = makeSymbol("_CSETF-GRAPHL-SEARCH-JUSTIFY?");
  public static final SubLSymbol $sym34$GRAPHL_SEARCH_ADD_TO_RESULT_ = makeSymbol("GRAPHL-SEARCH-ADD-TO-RESULT?");
  public static final SubLSymbol $sym35$_CSETF_GRAPHL_SEARCH_ADD_TO_RESULT_ = makeSymbol("_CSETF-GRAPHL-SEARCH-ADD-TO-RESULT?");
  public static final SubLSymbol $sym36$GRAPHL_SEARCH_UNWIND_FN_TOGGLE = makeSymbol("GRAPHL-SEARCH-UNWIND-FN-TOGGLE");
  public static final SubLSymbol $sym37$_CSETF_GRAPHL_SEARCH_UNWIND_FN_TOGGLE = makeSymbol("_CSETF-GRAPHL-SEARCH-UNWIND-FN-TOGGLE");
  public static final SubLSymbol $sym38$GRAPHL_SEARCH_RESULT = makeSymbol("GRAPHL-SEARCH-RESULT");
  public static final SubLSymbol $sym39$_CSETF_GRAPHL_SEARCH_RESULT = makeSymbol("_CSETF-GRAPHL-SEARCH-RESULT");
  public static final SubLSymbol $sym40$GRAPHL_SEARCH_GRAPH = makeSymbol("GRAPHL-SEARCH-GRAPH");
  public static final SubLSymbol $sym41$_CSETF_GRAPHL_SEARCH_GRAPH = makeSymbol("_CSETF-GRAPHL-SEARCH-GRAPH");
  public static final SubLSymbol $kw42$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw43$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw44$ORDER = makeKeyword("ORDER");
  public static final SubLSymbol $kw45$CUTOFF = makeKeyword("CUTOFF");
  public static final SubLSymbol $kw46$MARKING = makeKeyword("MARKING");
  public static final SubLSymbol $kw47$MARKING_SPACE = makeKeyword("MARKING-SPACE");
  public static final SubLSymbol $kw48$GOAL_SPACE = makeKeyword("GOAL-SPACE");
  public static final SubLSymbol $kw49$GOAL = makeKeyword("GOAL");
  public static final SubLSymbol $kw50$GOAL_FN = makeKeyword("GOAL-FN");
  public static final SubLSymbol $kw51$GOAL_FOUND_P = makeKeyword("GOAL-FOUND-P");
  public static final SubLSymbol $kw52$SATISFY_FN = makeKeyword("SATISFY-FN");
  public static final SubLSymbol $kw53$MAP_FN = makeKeyword("MAP-FN");
  public static final SubLSymbol $kw54$JUSTIFY_ = makeKeyword("JUSTIFY?");
  public static final SubLSymbol $kw55$ADD_TO_RESULT_ = makeKeyword("ADD-TO-RESULT?");
  public static final SubLSymbol $kw56$UNWIND_FN_TOGGLE = makeKeyword("UNWIND-FN-TOGGLE");
  public static final SubLSymbol $kw57$RESULT = makeKeyword("RESULT");
  public static final SubLSymbol $kw58$GRAPH = makeKeyword("GRAPH");
  public static final SubLString $str59$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str60$__ = makeString("#<");
  public static final SubLSymbol $kw61$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw62$BASE = makeKeyword("BASE");
  public static final SubLString $str63$GraphL_Search____a__ = makeString("GraphL Search : ~a~%");
  public static final SubLString $str64$Direction____a__ = makeString("Direction : ~a~%");
  public static final SubLString $str65$Type____a__ = makeString("Type : ~a~%");
  public static final SubLString $str66$Order____a__ = makeString("Order : ~a~%");
  public static final SubLString $str67$Cutoff____a__ = makeString("Cutoff : ~a~%");
  public static final SubLString $str68$Marking____a__ = makeString("Marking : ~a~%");
  public static final SubLString $str69$Space____a__ = makeString("Space : ~a~%");
  public static final SubLString $str70$Goal_Space____a__ = makeString("Goal Space : ~a~%");
  public static final SubLString $str71$Goal____a__ = makeString("Goal : ~a~%");
  public static final SubLString $str72$Goal_Fn____a__ = makeString("Goal Fn : ~a~%");
  public static final SubLString $str73$Goal_Found_P____a__ = makeString("Goal Found-P : ~a~%");
  public static final SubLString $str74$Satisfy_Fn____a__ = makeString("Satisfy Fn : ~a~%");
  public static final SubLString $str75$Map_Fn____a__ = makeString("Map Fn : ~a~%");
  public static final SubLString $str76$Justify_____a__ = makeString("Justify? : ~a~%");
  public static final SubLString $str77$Add_to_Result_____a__ = makeString("Add to Result? : ~a~%");
  public static final SubLString $str78$Unwind_Fn_Toggle____a__ = makeString("Unwind Fn Toggle : ~a~%");
  public static final SubLString $str79$Result____a__ = makeString("Result : ~a~%");
  public static final SubLString $str80$Graph____a__ = makeString("Graph : ~a~%");
  public static final SubLSymbol $kw81$FREE = makeKeyword("FREE");
  public static final SubLSymbol $kw82$DEPTH_FIRST = makeKeyword("DEPTH-FIRST");
  public static final SubLSymbol $kw83$BREADTH_FIRST = makeKeyword("BREADTH-FIRST");
  public static final SubLSymbol $kw84$ITERATIVE_DEEPENING = makeKeyword("ITERATIVE-DEEPENING");
  public static final SubLSymbol $kw85$DEPTH_MARKING = makeKeyword("DEPTH-MARKING");
  public static final SubLSymbol $kw86$NODES_ON_WIND = makeKeyword("NODES-ON-WIND");
  public static final SubLSymbol $kw87$EDGES_ON_UNWIND = makeKeyword("EDGES-ON-UNWIND");
  public static final SubLList $list88 = list(makeKeyword("DEPTH-MARKING"), makeKeyword("SIMPLE"));
  public static final SubLList $list89 = list(makeKeyword("ACCESSIBLE"), makeKeyword("FORWARD"), makeKeyword("BACKWARD"));
  public static final SubLList $list90 = list(makeSymbol("SEARCH-VAR"), makeSymbol("PLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym91$CLET = makeSymbol("CLET");
  public static final SubLList $list92 = list(list(makeSymbol("NEW-GRAPHL-SEARCH")));
  public static final SubLSymbol $sym93$SET_GRAPHL_SEARCH_PROPERTIES = makeSymbol("SET-GRAPHL-SEARCH-PROPERTIES");
  public static final SubLSymbol $sym94$DESTROY_GRAPHL_SEARCH = makeSymbol("DESTROY-GRAPHL-SEARCH");
  public static final SubLSymbol $sym95$WITH_GRAPHL_SEARCH_INITIALIZED = makeSymbol("WITH-GRAPHL-SEARCH-INITIALIZED");
  public static final SubLInteger $int96$200 = makeInteger(200);
  public static final SubLSymbol $kw97$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $kw98$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $kw99$ACCESSIBLE = makeKeyword("ACCESSIBLE");
  public static final SubLList $list100 = list(makeKeyword("FORWARD"), makeKeyword("BACKWARD"));
  public static final SubLList $list101 = list(makeKeyword("FORWARD"));
  public static final SubLList $list102 = list(makeKeyword("BACKWARD"));
  public static final SubLList $list103 = list(list(makeSymbol("DIR-VAR"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list104 = list(makeKeyword("DONE-VAR"));
  public static final SubLSymbol $kw105$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw106$DONE_VAR = makeKeyword("DONE-VAR");
  public static final SubLSymbol $sym107$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym108$DETERMINE_GRAPHL_RELEVANT_DIRECTIONS = makeSymbol("DETERMINE-GRAPHL-RELEVANT-DIRECTIONS");

  //// Initializers

  public void declareFunctions() {
    declare_graphl_search_vars_file();
  }

  public void initializeVariables() {
    init_graphl_search_vars_file();
  }

  public void runTopLevelForms() {
    setup_graphl_search_vars_file();
  }

}
