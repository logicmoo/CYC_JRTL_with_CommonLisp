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
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.ghl_link_iterators;
import com.cyc.cycjava.cycl.graphl_graph_utilities;
import com.cyc.cycjava.cycl.graphl_search_vars;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.subl_macros;

public  final class ghl_search_vars extends SubLTranslatedFile {

  //// Constructor

  private ghl_search_vars() {}
  public static final SubLFile me = new ghl_search_vars();
  public static final String myName = "com.cyc.cycjava.cycl.ghl_search_vars";

  //// Definitions

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 847) 
  private static SubLSymbol $ghl_search_property_defaults$ = null;

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 1498) 
  public static final SubLObject ghl_search_property_default(SubLObject property) {
    return conses_high.assoc(property, $ghl_search_property_defaults$.getGlobalValue(), Symbols.symbol_function(EQ), UNPROVIDED).rest();
  }

  public static final class $ghl_search_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $graphl_search; }
    public SubLObject getField3() { return $predicates; }
    public SubLObject getField4() { return $tv; }
    public SubLObject setField2(SubLObject value) { return $graphl_search = value; }
    public SubLObject setField3(SubLObject value) { return $predicates = value; }
    public SubLObject setField4(SubLObject value) { return $tv = value; }
    public SubLObject $graphl_search = NIL;
    public SubLObject $predicates = NIL;
    public SubLObject $tv = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($ghl_search_native.class, $sym1$GHL_SEARCH, $sym2$GHL_SEARCH_P, $list3, $list4, new String[] {"$graphl_search", "$predicates", "$tv"}, $list5, $list6, $sym7$PRINT_GHL_SEARCH);
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 1622) 
  public static SubLSymbol $dtp_ghl_search$ = null;

  public static final class $ghl_search_p$UnaryFunction extends UnaryFunction {
    public $ghl_search_p$UnaryFunction() { super(extractFunctionNamed("GHL-SEARCH-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31827"); }
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 1622) 
  public static final SubLObject ghl_search_graphl_search(SubLObject object) {
    checkType(object, $sym2$GHL_SEARCH_P);
    return object.getField2();
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 1622) 
  public static final SubLObject ghl_search_predicates(SubLObject object) {
    checkType(object, $sym2$GHL_SEARCH_P);
    return object.getField3();
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 1622) 
  public static final SubLObject ghl_search_tv(SubLObject object) {
    checkType(object, $sym2$GHL_SEARCH_P);
    return object.getField4();
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 1622) 
  public static final SubLObject _csetf_ghl_search_graphl_search(SubLObject object, SubLObject value) {
    checkType(object, $sym2$GHL_SEARCH_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 1622) 
  public static final SubLObject _csetf_ghl_search_predicates(SubLObject object, SubLObject value) {
    checkType(object, $sym2$GHL_SEARCH_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 1622) 
  public static final SubLObject _csetf_ghl_search_tv(SubLObject object, SubLObject value) {
    checkType(object, $sym2$GHL_SEARCH_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 1622) 
  public static final SubLObject make_ghl_search(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $ghl_search_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw15$GRAPHL_SEARCH)) {
            _csetf_ghl_search_graphl_search(v_new, current_value);
          } else if (pcase_var.eql($kw16$PREDICATES)) {
            _csetf_ghl_search_predicates(v_new, current_value);
          } else if (pcase_var.eql($kw17$TV)) {
            _csetf_ghl_search_tv(v_new, current_value);
          } else {
            Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 2225) 
  public static final SubLObject new_ghl_search(SubLObject plist) {
    {
      SubLObject ghl_search = make_ghl_search(UNPROVIDED);
      SubLObject graphl_search = graphl_search_vars.new_graphl_search(NIL);
      set_ghl_graphl_search(ghl_search, graphl_search);
      set_ghl_search_properties(ghl_search, plist);
      return ghl_search;
    }
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 2495) 
  public static final SubLObject destroy_ghl_search(SubLObject graph_search) {
    graphl_search_vars.destroy_graphl_search(ghl_search_graphl_search(graph_search));
    _csetf_ghl_search_graphl_search(graph_search, $kw25$FREE);
    _csetf_ghl_search_predicates(graph_search, $kw25$FREE);
    _csetf_ghl_search_tv(graph_search, $kw25$FREE);
    return NIL;
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 2796) 
  public static final SubLObject ghl_graphl_search(SubLObject v_search) {
    return ghl_search_graphl_search(v_search);
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 2934) 
  public static final SubLObject ghl_relevant_predicates(SubLObject v_search) {
    return ghl_search_predicates(v_search);
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 3026) 
  public static final SubLObject ghl_tv(SubLObject v_search) {
    return ghl_search_tv(v_search);
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 3093) 
  public static final SubLObject ghl_result(SubLObject v_search) {
    return graphl_search_vars.graphl_result(ghl_graphl_search(v_search));
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 3208) 
  public static final SubLObject ghl_space(SubLObject v_search) {
    return graphl_search_vars.graphl_space(ghl_graphl_search(v_search));
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 3396) 
  public static final SubLObject ghl_direction(SubLObject v_search) {
    return graphl_search_vars.graphl_direction(ghl_graphl_search(v_search));
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 3647) 
  public static final SubLObject ghl_compute_justifyP(SubLObject v_search) {
    return graphl_search_vars.graphl_compute_justifyP(ghl_graphl_search(v_search));
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 3872) 
  public static final SubLObject ghl_goal(SubLObject v_search) {
    return graphl_search_vars.graphl_search_goal(ghl_graphl_search(v_search));
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 3966) 
  public static final SubLObject ghl_goal_fn(SubLObject v_search) {
    return graphl_search_vars.graphl_search_goal_fn(ghl_graphl_search(v_search));
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 5930) 
  public static final SubLObject ghl_depth_first_search_p(SubLObject v_search) {
    return graphl_search_vars.graphl_depth_first_search_p(ghl_graphl_search(v_search));
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 6999) 
  public static final SubLObject set_ghl_search_properties(SubLObject v_search, SubLObject plist) {
    {
      SubLObject cdolist_list_var = $ghl_search_property_defaults$.getGlobalValue();
      SubLObject cons = NIL;
      for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
        {
          SubLObject datum = cons;
          SubLObject current = datum;
          SubLObject prop = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
          prop = current.first();
          current = current.rest();
          value = current;
          if ((NIL != value)) {
            set_ghl_search_property(v_search, prop, value);
          }
        }
      }
    }
    {
      SubLObject remainder = NIL;
      for (remainder = plist; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
        {
          SubLObject prop = remainder.first();
          SubLObject val = conses_high.cadr(remainder);
          set_ghl_search_property(v_search, prop, val);
        }
      }
    }
    return v_search;
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 7359) 
  public static final SubLObject set_ghl_search_property(SubLObject v_search, SubLObject property, SubLObject value) {
    if ((NIL == value)) {
      value = ghl_search_property_default(property);
    }
    {
      SubLObject graphl_search = ghl_graphl_search(v_search);
      SubLObject pcase_var = property;
      if (pcase_var.eql($kw16$PREDICATES)) {
        set_ghl_search_predicates(v_search, value);
      } else if (pcase_var.eql($kw29$DIRECTION)) {
        graphl_search_vars.set_graphl_search_direction(graphl_search, value);
      } else if (pcase_var.eql($kw17$TV)) {
        set_ghl_search_tv(v_search, value);
      } else if (pcase_var.eql($kw30$TYPE)) {
        graphl_search_vars.set_graphl_search_type(graphl_search, value);
      } else if (pcase_var.eql($kw31$ORDER)) {
        graphl_search_vars.set_graphl_search_order(graphl_search, value);
      } else if (pcase_var.eql($kw32$CUTOFF)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31965");
      } else if (pcase_var.eql($kw33$MARKING)) {
        graphl_search_vars.set_graphl_search_marking(graphl_search, value);
      } else if (pcase_var.eql($kw34$MARKING_SPACE)) {
        graphl_search_vars.set_graphl_search_marking_space(graphl_search, value);
      } else if (pcase_var.eql($kw35$GOAL)) {
        graphl_search_vars.set_graphl_search_goal(graphl_search, value);
      } else if (pcase_var.eql($kw36$GOAL_FN)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31966");
      } else if (pcase_var.eql($kw37$GOAL_SPACE)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31967");
      } else if (pcase_var.eql($kw38$SATISFY_FN)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31970");
      } else if (pcase_var.eql($kw39$MAP_FN)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31968");
      } else if (pcase_var.eql($kw40$JUSTIFY_)) {
        graphl_search_vars.set_graphl_search_justifyP(graphl_search, value);
      } else if (pcase_var.eql($kw41$ADD_TO_RESULT_)) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31964");
      }
    }
    return v_search;
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 8709) 
  public static final SubLObject set_ghl_graphl_search(SubLObject v_search, SubLObject graphl_search) {
    _csetf_ghl_search_graphl_search(v_search, graphl_search);
    return NIL;
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 8870) 
  public static final SubLObject set_ghl_search_predicates(SubLObject v_search, SubLObject predicates) {
    _csetf_ghl_search_predicates(v_search, predicates);
    return NIL;
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 9141) 
  public static final SubLObject set_ghl_search_tv(SubLObject v_search, SubLObject tv) {
    _csetf_ghl_search_tv(v_search, tv);
    return NIL;
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 10621) 
  public static final SubLObject set_ghl_search_result(SubLObject v_search, SubLObject result) {
    graphl_search_vars.set_graphl_search_result(ghl_graphl_search(v_search), result);
    return NIL;
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 10752) 
  public static final SubLObject set_ghl_goal_found_p(SubLObject v_search, SubLObject found_p) {
    graphl_search_vars.set_graphl_search_goal_found_p(ghl_graphl_search(v_search), found_p);
    return NIL;
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 10892) 
  public static final SubLObject ghl_set_result(SubLObject v_search, SubLObject result) {
    set_ghl_search_result(v_search, result);
    return NIL;
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 11349) 
  public static final SubLObject ghl_add_to_result(SubLObject v_search, SubLObject addition, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQ);
    }
    graphl_search_vars.graphl_add_to_result(ghl_graphl_search(v_search), addition, test);
    return NIL;
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 12201) 
  public static final SubLObject ghl_forward_direction_p(SubLObject direction) {
    return graphl_search_vars.graphl_forward_direction_p(direction);
  }

  /** Direction to search when determining the predicate relation (PRED A B).
   :forward corresponds to searching from A to B, e.g. (genls Dog Thing)
   :backward corresponds to searching from B to A, (e.g. (geoSubRegion USA Austin) */
  @SubL(source = "cycl/ghl-search-vars.lisp", position = 12591) 
  public static final SubLObject ghl_direction_for_predicate_relation(SubLObject pred) {
    return (ONE_INTEGER.eql(kb_accessors.fan_out_arg(pred, UNPROVIDED)) ? ((SubLObject) $kw52$FORWARD) : $kw53$BACKWARD);
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 13132) 
  public static SubLSymbol $sksi_gt_search_pred$ = null;

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 13333) 
  public static SubLSymbol $ghl_uses_spec_preds_p$ = null;

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 13446) 
  public static final SubLObject ghl_uses_spec_preds_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $ghl_uses_spec_preds_p$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 13933) 
  public static SubLSymbol $gt_args_swapped_p$ = null;

  @SubL(source = "cycl/ghl-search-vars.lisp", position = 14238) 
  public static final SubLObject gt_args_swapped_p() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $gt_args_swapped_p$.getDynamicValue(thread);
    }
  }

  /** controls extent of tracing, warnings, etc., for the ghl modules [0 .. 5] */
  @SubL(source = "cycl/ghl-search-vars.lisp", position = 14307) 
  public static SubLSymbol $ghl_trace_level$ = null;

  public static final SubLObject declare_ghl_search_vars_file() {
    declareFunction(myName, "ghl_search_property_default", "GHL-SEARCH-PROPERTY-DEFAULT", 1, 0, false);
    declareFunction(myName, "ghl_search_print_function_trampoline", "GHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "ghl_search_p", "GHL-SEARCH-P", 1, 0, false); new $ghl_search_p$UnaryFunction();
    declareFunction(myName, "ghl_search_graphl_search", "GHL-SEARCH-GRAPHL-SEARCH", 1, 0, false);
    declareFunction(myName, "ghl_search_predicates", "GHL-SEARCH-PREDICATES", 1, 0, false);
    declareFunction(myName, "ghl_search_tv", "GHL-SEARCH-TV", 1, 0, false);
    declareFunction(myName, "_csetf_ghl_search_graphl_search", "_CSETF-GHL-SEARCH-GRAPHL-SEARCH", 2, 0, false);
    declareFunction(myName, "_csetf_ghl_search_predicates", "_CSETF-GHL-SEARCH-PREDICATES", 2, 0, false);
    declareFunction(myName, "_csetf_ghl_search_tv", "_CSETF-GHL-SEARCH-TV", 2, 0, false);
    declareFunction(myName, "make_ghl_search", "MAKE-GHL-SEARCH", 0, 1, false);
    declareFunction(myName, "print_ghl_search", "PRINT-GHL-SEARCH", 3, 0, false);
    declareFunction(myName, "describe_ghl_search", "DESCRIBE-GHL-SEARCH", 1, 0, false);
    declareFunction(myName, "new_ghl_search", "NEW-GHL-SEARCH", 1, 0, false);
    declareFunction(myName, "destroy_ghl_search", "DESTROY-GHL-SEARCH", 1, 0, false);
    declareFunction(myName, "ghl_graphl_search", "GHL-GRAPHL-SEARCH", 1, 0, false);
    declareFunction(myName, "ghl_relevant_predicates", "GHL-RELEVANT-PREDICATES", 1, 0, false);
    declareFunction(myName, "ghl_tv", "GHL-TV", 1, 0, false);
    declareFunction(myName, "ghl_result", "GHL-RESULT", 1, 0, false);
    declareFunction(myName, "ghl_space", "GHL-SPACE", 1, 0, false);
    declareFunction(myName, "ghl_goal_space", "GHL-GOAL-SPACE", 1, 0, false);
    declareFunction(myName, "ghl_direction", "GHL-DIRECTION", 1, 0, false);
    declareFunction(myName, "ghl_truth", "GHL-TRUTH", 1, 0, false);
    declareFunction(myName, "ghl_strength", "GHL-STRENGTH", 1, 0, false);
    declareFunction(myName, "ghl_compute_justifyP", "GHL-COMPUTE-JUSTIFY?", 1, 0, false);
    declareFunction(myName, "ghl_add_to_resultP", "GHL-ADD-TO-RESULT?", 1, 0, false);
    declareFunction(myName, "ghl_goal", "GHL-GOAL", 1, 0, false);
    declareFunction(myName, "ghl_goal_fn", "GHL-GOAL-FN", 1, 0, false);
    declareFunction(myName, "ghl_cutoff", "GHL-CUTOFF", 1, 0, false);
    declareFunction(myName, "ghl_depth_cutoff", "GHL-DEPTH-CUTOFF", 1, 0, false);
    declareFunction(myName, "ghl_order", "GHL-ORDER", 1, 0, false);
    declareFunction(myName, "ghl_goal_search_p", "GHL-GOAL-SEARCH-P", 1, 0, false);
    declareFunction(myName, "ghl_map_fn", "GHL-MAP-FN", 1, 0, false);
    declareFunction(myName, "ghl_map_p", "GHL-MAP-P", 1, 0, false);
    declareFunction(myName, "ghl_depth_first_search", "GHL-DEPTH-FIRST-SEARCH", 1, 0, false);
    declareFunction(myName, "ghl_breadth_first_search", "GHL-BREADTH-FIRST-SEARCH", 1, 0, false);
    declareFunction(myName, "ghl_depth_marking_search_p", "GHL-DEPTH-MARKING-SEARCH-P", 1, 0, false);
    declareFunction(myName, "ghl_iterative_deepening_search_p", "GHL-ITERATIVE-DEEPENING-SEARCH-P", 1, 0, false);
    declareFunction(myName, "ghl_add_nodes_on_wind_p", "GHL-ADD-NODES-ON-WIND-P", 1, 0, false);
    declareFunction(myName, "ghl_add_edges_on_unwind_p", "GHL-ADD-EDGES-ON-UNWIND-P", 1, 0, false);
    declareFunction(myName, "ghl_add_unwind_edges_now_p", "GHL-ADD-UNWIND-EDGES-NOW-P", 1, 0, false);
    declareFunction(myName, "ghl_goal_found_p", "GHL-GOAL-FOUND-P", 1, 0, false);
    declareFunction(myName, "ghl_single_goal_p", "GHL-SINGLE-GOAL-P", 1, 0, false);
    declareFunction(myName, "ghl_multiple_goals_p", "GHL-MULTIPLE-GOALS-P", 1, 0, false);
    declareFunction(myName, "ghl_goal_fn_p", "GHL-GOAL-FN-P", 1, 0, false);
    declareFunction(myName, "ghl_depth_first_search_p", "GHL-DEPTH-FIRST-SEARCH-P", 1, 0, false);
    declareFunction(myName, "ghl_breadth_first_search_p", "GHL-BREADTH-FIRST-SEARCH-P", 1, 0, false);
    declareFunction(myName, "ghl_goal_found_condition_p", "GHL-GOAL-FOUND-CONDITION-P", 1, 0, false);
    declareFunction(myName, "ghl_transitive_search_p", "GHL-TRANSITIVE-SEARCH-P", 1, 0, false);
    declareFunction(myName, "ghl_return_one_answer_p", "GHL-RETURN-ONE-ANSWER-P", 1, 0, false);
    declareFunction(myName, "ghl_relevant_predP", "GHL-RELEVANT-PRED?", 2, 0, false);
    declareFunction(myName, "ghl_return_all_justificationsP", "GHL-RETURN-ALL-JUSTIFICATIONS?", 1, 0, false);
    declareFunction(myName, "set_ghl_search_properties", "SET-GHL-SEARCH-PROPERTIES", 2, 0, false);
    declareFunction(myName, "set_ghl_search_property", "SET-GHL-SEARCH-PROPERTY", 3, 0, false);
    declareFunction(myName, "set_ghl_graphl_search", "SET-GHL-GRAPHL-SEARCH", 2, 0, false);
    declareFunction(myName, "set_ghl_search_predicates", "SET-GHL-SEARCH-PREDICATES", 2, 0, false);
    declareFunction(myName, "set_ghl_search_direction", "SET-GHL-SEARCH-DIRECTION", 2, 0, false);
    declareFunction(myName, "set_ghl_search_tv", "SET-GHL-SEARCH-TV", 2, 0, false);
    declareFunction(myName, "set_ghl_search_order", "SET-GHL-SEARCH-ORDER", 2, 0, false);
    declareFunction(myName, "set_ghl_search_cutoff", "SET-GHL-SEARCH-CUTOFF", 2, 0, false);
    declareFunction(myName, "set_ghl_search_marking", "SET-GHL-SEARCH-MARKING", 2, 0, false);
    declareFunction(myName, "set_ghl_search_marking_space", "SET-GHL-SEARCH-MARKING-SPACE", 2, 0, false);
    declareFunction(myName, "set_ghl_search_goal", "SET-GHL-SEARCH-GOAL", 2, 0, false);
    declareFunction(myName, "set_ghl_search_goal_fn", "SET-GHL-SEARCH-GOAL-FN", 2, 0, false);
    declareFunction(myName, "set_ghl_search_goal_space", "SET-GHL-SEARCH-GOAL-SPACE", 2, 0, false);
    declareFunction(myName, "set_ghl_search_satisfy_fn", "SET-GHL-SEARCH-SATISFY-FN", 2, 0, false);
    declareFunction(myName, "set_ghl_search_map_fn", "SET-GHL-SEARCH-MAP-FN", 2, 0, false);
    declareFunction(myName, "set_ghl_search_justifyP", "SET-GHL-SEARCH-JUSTIFY?", 2, 0, false);
    declareFunction(myName, "set_ghl_search_result", "SET-GHL-SEARCH-RESULT", 2, 0, false);
    declareFunction(myName, "set_ghl_goal_found_p", "SET-GHL-GOAL-FOUND-P", 2, 0, false);
    declareFunction(myName, "ghl_set_result", "GHL-SET-RESULT", 2, 0, false);
    declareFunction(myName, "ghl_add_node_to_result", "GHL-ADD-NODE-TO-RESULT", 2, 0, false);
    declareFunction(myName, "ghl_add_to_result", "GHL-ADD-TO-RESULT", 2, 1, false);
    declareFunction(myName, "ghl_append_to_result", "GHL-APPEND-TO-RESULT", 2, 0, false);
    declareMacro(myName, "with_ghl_search_initialized", "WITH-GHL-SEARCH-INITIALIZED");
    declareFunction(myName, "reinitialize_ghl_spaces", "REINITIALIZE-GHL-SPACES", 1, 0, false);
    declareFunction(myName, "ghl_forward_direction", "GHL-FORWARD-DIRECTION", 0, 0, false);
    declareFunction(myName, "ghl_backward_direction", "GHL-BACKWARD-DIRECTION", 0, 0, false);
    declareFunction(myName, "ghl_forward_direction_p", "GHL-FORWARD-DIRECTION-P", 1, 0, false);
    declareMacro(myName, "do_ghl_relevant_directions", "DO-GHL-RELEVANT-DIRECTIONS");
    declareFunction(myName, "ghl_opposite_direction", "GHL-OPPOSITE-DIRECTION", 1, 0, false);
    declareFunction(myName, "ghl_direction_for_predicate_relation", "GHL-DIRECTION-FOR-PREDICATE-RELATION", 1, 0, false);
    declareFunction(myName, "ghl_fan_out_direction", "GHL-FAN-OUT-DIRECTION", 1, 0, false);
    declareMacro(myName, "with_sksi_gt_search_pred", "WITH-SKSI-GT-SEARCH-PRED");
    declareFunction(myName, "ghl_uses_spec_preds_p", "GHL-USES-SPEC-PREDS-P", 0, 0, false);
    declareMacro(myName, "with_ghl_spec_pred_use_p", "WITH-GHL-SPEC-PRED-USE-P");
    declareMacro(myName, "with_ghl_spec_pred_use", "WITH-GHL-SPEC-PRED-USE");
    declareMacro(myName, "without_ghl_spec_pred_use", "WITHOUT-GHL-SPEC-PRED-USE");
    declareMacro(myName, "with_gt_args_unswapped", "WITH-GT-ARGS-UNSWAPPED");
    declareMacro(myName, "with_gt_args_swapped", "WITH-GT-ARGS-SWAPPED");
    declareFunction(myName, "gt_args_swapped_p", "GT-ARGS-SWAPPED-P", 0, 0, false);
    declareMacro(myName, "with_ghl_trace_level", "WITH-GHL-TRACE-LEVEL");
    declareFunction(myName, "ghl_error", "GHL-ERROR", 2, 5, false);
    return NIL;
  }

  public static final SubLObject init_ghl_search_vars_file() {
    $ghl_search_property_defaults$ = deflexical("*GHL-SEARCH-PROPERTY-DEFAULTS*", $list0);
    $dtp_ghl_search$ = defconstant("*DTP-GHL-SEARCH*", $sym1$GHL_SEARCH);
    $sksi_gt_search_pred$ = defparameter("*SKSI-GT-SEARCH-PRED*", NIL);
    $ghl_uses_spec_preds_p$ = defparameter("*GHL-USES-SPEC-PREDS-P*", T);
    $gt_args_swapped_p$ = defparameter("*GT-ARGS-SWAPPED-P*", NIL);
    $ghl_trace_level$ = defparameter("*GHL-TRACE-LEVEL*", ONE_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_ghl_search_vars_file() {
    // CVS_ID("Id: ghl-search-vars.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_ghl_search$.getGlobalValue(), Symbols.symbol_function($sym8$GHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$GHL_SEARCH_GRAPHL_SEARCH, $sym10$_CSETF_GHL_SEARCH_GRAPHL_SEARCH);
    Structures.def_csetf($sym11$GHL_SEARCH_PREDICATES, $sym12$_CSETF_GHL_SEARCH_PREDICATES);
    Structures.def_csetf($sym13$GHL_SEARCH_TV, $sym14$_CSETF_GHL_SEARCH_TV);
    Equality.identity($sym1$GHL_SEARCH);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(cons(makeKeyword("DIRECTION"), makeKeyword("FORWARD")), cons(makeKeyword("TV"), makeKeyword("TRUE-DEF")), cons(makeKeyword("ORDER"), makeKeyword("BREADTH-FIRST")));
  public static final SubLSymbol $sym1$GHL_SEARCH = makeSymbol("GHL-SEARCH");
  public static final SubLSymbol $sym2$GHL_SEARCH_P = makeSymbol("GHL-SEARCH-P");
  public static final SubLList $list3 = list(makeSymbol("GRAPHL-SEARCH"), makeSymbol("PREDICATES"), makeSymbol("TV"));
  public static final SubLList $list4 = list(makeKeyword("GRAPHL-SEARCH"), makeKeyword("PREDICATES"), makeKeyword("TV"));
  public static final SubLList $list5 = list(makeSymbol("GHL-SEARCH-GRAPHL-SEARCH"), makeSymbol("GHL-SEARCH-PREDICATES"), makeSymbol("GHL-SEARCH-TV"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-GHL-SEARCH-GRAPHL-SEARCH"), makeSymbol("_CSETF-GHL-SEARCH-PREDICATES"), makeSymbol("_CSETF-GHL-SEARCH-TV"));
  public static final SubLSymbol $sym7$PRINT_GHL_SEARCH = makeSymbol("PRINT-GHL-SEARCH");
  public static final SubLSymbol $sym8$GHL_SEARCH_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GHL-SEARCH-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$GHL_SEARCH_GRAPHL_SEARCH = makeSymbol("GHL-SEARCH-GRAPHL-SEARCH");
  public static final SubLSymbol $sym10$_CSETF_GHL_SEARCH_GRAPHL_SEARCH = makeSymbol("_CSETF-GHL-SEARCH-GRAPHL-SEARCH");
  public static final SubLSymbol $sym11$GHL_SEARCH_PREDICATES = makeSymbol("GHL-SEARCH-PREDICATES");
  public static final SubLSymbol $sym12$_CSETF_GHL_SEARCH_PREDICATES = makeSymbol("_CSETF-GHL-SEARCH-PREDICATES");
  public static final SubLSymbol $sym13$GHL_SEARCH_TV = makeSymbol("GHL-SEARCH-TV");
  public static final SubLSymbol $sym14$_CSETF_GHL_SEARCH_TV = makeSymbol("_CSETF-GHL-SEARCH-TV");
  public static final SubLSymbol $kw15$GRAPHL_SEARCH = makeKeyword("GRAPHL-SEARCH");
  public static final SubLSymbol $kw16$PREDICATES = makeKeyword("PREDICATES");
  public static final SubLSymbol $kw17$TV = makeKeyword("TV");
  public static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str19$__ = makeString("#<");
  public static final SubLSymbol $kw20$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw21$BASE = makeKeyword("BASE");
  public static final SubLString $str22$GHL_Search____a__ = makeString("GHL Search : ~a~%");
  public static final SubLString $str23$Predicates__a__ = makeString("Predicates ~a~%");
  public static final SubLString $str24$TV__s__ = makeString("TV ~s~%");
  public static final SubLSymbol $kw25$FREE = makeKeyword("FREE");
  public static final SubLSymbol $kw26$TRANSITIVE_REASONING = makeKeyword("TRANSITIVE-REASONING");
  public static final SubLSymbol $kw27$ALL = makeKeyword("ALL");
  public static final SubLList $list28 = cons(makeSymbol("PROP"), makeSymbol("VALUE"));
  public static final SubLSymbol $kw29$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw30$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw31$ORDER = makeKeyword("ORDER");
  public static final SubLSymbol $kw32$CUTOFF = makeKeyword("CUTOFF");
  public static final SubLSymbol $kw33$MARKING = makeKeyword("MARKING");
  public static final SubLSymbol $kw34$MARKING_SPACE = makeKeyword("MARKING-SPACE");
  public static final SubLSymbol $kw35$GOAL = makeKeyword("GOAL");
  public static final SubLSymbol $kw36$GOAL_FN = makeKeyword("GOAL-FN");
  public static final SubLSymbol $kw37$GOAL_SPACE = makeKeyword("GOAL-SPACE");
  public static final SubLSymbol $kw38$SATISFY_FN = makeKeyword("SATISFY-FN");
  public static final SubLSymbol $kw39$MAP_FN = makeKeyword("MAP-FN");
  public static final SubLSymbol $kw40$JUSTIFY_ = makeKeyword("JUSTIFY?");
  public static final SubLSymbol $kw41$ADD_TO_RESULT_ = makeKeyword("ADD-TO-RESULT?");
  public static final SubLList $list42 = list(makeSymbol("SEARCH-VAR"), makeSymbol("PLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym43$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym44$NEW_GHL_SEARCH = makeSymbol("NEW-GHL-SEARCH");
  public static final SubLList $list45 = list(makeSymbol("RESET-GRAPHL-FINISHED"));
  public static final SubLSymbol $sym46$DESTROY_GHL_SEARCH = makeSymbol("DESTROY-GHL-SEARCH");
  public static final SubLList $list47 = list(list(makeSymbol("DIR-VAR"), makeSymbol("DIRECTION"), makeSymbol("&KEY"), makeSymbol("DONE-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list48 = list(makeKeyword("DONE-VAR"));
  public static final SubLSymbol $kw49$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw50$DONE_VAR = makeKeyword("DONE-VAR");
  public static final SubLSymbol $sym51$DO_GRAPHL_RELEVANT_DIRECTIONS = makeSymbol("DO-GRAPHL-RELEVANT-DIRECTIONS");
  public static final SubLSymbol $kw52$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $kw53$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLList $list54 = list(makeSymbol("PRED"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym55$_SKSI_GT_SEARCH_PRED_ = makeSymbol("*SKSI-GT-SEARCH-PRED*");
  public static final SubLList $list56 = list(makeSymbol("USE-EM?"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym57$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym58$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list59 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym60$_GHL_USES_SPEC_PREDS_P_ = makeSymbol("*GHL-USES-SPEC-PREDS-P*");
  public static final SubLList $list61 = list(list(makeSymbol("*GHL-USES-SPEC-PREDS-P*"), T));
  public static final SubLList $list62 = list(list(makeSymbol("*GHL-USES-SPEC-PREDS-P*"), NIL));
  public static final SubLList $list63 = list(list(makeSymbol("*GT-ARGS-SWAPPED-P*"), NIL));
  public static final SubLList $list64 = list(list(makeSymbol("*GT-ARGS-SWAPPED-P*"), T));
  public static final SubLList $list65 = list(makeSymbol("LEVEL"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym66$_GHL_TRACE_LEVEL_ = makeSymbol("*GHL-TRACE-LEVEL*");
  public static final SubLString $str67$continue_anyway = makeString("continue anyway");

  //// Initializers

  public void declareFunctions() {
    declare_ghl_search_vars_file();
  }

  public void initializeVariables() {
    init_ghl_search_vars_file();
  }

  public void runTopLevelForms() {
    setup_ghl_search_vars_file();
  }

}
