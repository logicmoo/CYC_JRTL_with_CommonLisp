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
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.ghl_marking_utilities;
import com.cyc.cycjava.cycl.ghl_search_vars;
import com.cyc.cycjava.cycl.graphl_graph_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;

public  final class ghl_search_utilities extends SubLTranslatedFile {

  //// Constructor

  private ghl_search_utilities() {}
  public static final SubLFile me = new ghl_search_utilities();
  public static final String myName = "com.cyc.cycjava.cycl.ghl_search_utilities";

  //// Definitions

  @SubL(source = "cycl/ghl-search-utilities.lisp", position = 926) 
  public static final SubLObject ghl_goal_nodeP(SubLObject v_search, SubLObject node, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQUAL);
    }
    if ((NIL != list_utilities.sublisp_boolean(ghl_search_vars.ghl_goal_fn(v_search)))) {
      return Functions.funcall(ghl_search_vars.ghl_goal_fn(v_search), v_search, node);
    } else if (ghl_search_vars.ghl_goal(v_search).isList()) {
      return subl_promotions.memberP(node, ghl_search_vars.ghl_goal(v_search), test, UNPROVIDED);
    } else {
      return Functions.funcall(test, ghl_search_vars.ghl_goal(v_search), node);
    }
  }

  @SubL(source = "cycl/ghl-search-utilities.lisp", position = 1961) 
  public static final SubLObject ghl_inverse_cardinality(SubLObject pred, SubLObject node) {
    {
      SubLObject kb_cardinality = ((NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) ? ((SubLObject) sbhl_module_utilities.sbhl_inverse_cardinality(sbhl_module_vars.get_sbhl_module(pred), node)) : Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3926"));
      SubLObject sksi_cardinality = ZERO_INTEGER;
      return Numbers.add(kb_cardinality, sksi_cardinality);
    }
  }

  @SubL(source = "cycl/ghl-search-utilities.lisp", position = 2414) 
  public static final SubLObject ghl_predicate_cardinality(SubLObject pred, SubLObject node) {
    {
      SubLObject kb_cardinality = ((NIL != sbhl_module_utilities.sbhl_predicate_p(pred)) ? ((SubLObject) sbhl_module_utilities.sbhl_predicate_cardinality(sbhl_module_vars.get_sbhl_module(pred), node)) : Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3927"));
      SubLObject sksi_cardinality = ZERO_INTEGER;
      return Numbers.add(kb_cardinality, sksi_cardinality);
    }
  }

  @SubL(source = "cycl/ghl-search-utilities.lisp", position = 2854) 
  public static final SubLObject ghl_resolve_goal_found(SubLObject v_search, SubLObject node) {
    if ((NIL == ghl_search_vars.ghl_compute_justifyP(v_search))) {
      ghl_search_vars.ghl_set_result(v_search, node);
    }
    ghl_search_vars.set_ghl_goal_found_p(v_search, T);
    graphl_graph_utilities.$graphl_finishedP$.setDynamicValue(T);
    return NIL;
  }

  public static final SubLObject declare_ghl_search_utilities_file() {
    //declareFunction(myName, "ghl_table_p", "GHL-TABLE-P", 1, 0, false);
    declareFunction(myName, "ghl_goal_nodeP", "GHL-GOAL-NODE?", 2, 1, false);
    //declareFunction(myName, "ghl_goal_or_marked_as_goalP", "GHL-GOAL-OR-MARKED-AS-GOAL?", 2, 1, false);
    //declareFunction(myName, "ghl_node_satisfies_pred_arg_typeP", "GHL-NODE-SATISFIES-PRED-ARG-TYPE?", 2, 0, false);
    declareFunction(myName, "ghl_inverse_cardinality", "GHL-INVERSE-CARDINALITY", 2, 0, false);
    declareFunction(myName, "ghl_predicate_cardinality", "GHL-PREDICATE-CARDINALITY", 2, 0, false);
    declareFunction(myName, "ghl_resolve_goal_found", "GHL-RESOLVE-GOAL-FOUND", 2, 0, false);
    //declareFunction(myName, "ghl_add_gt_assertion_to_result", "GHL-ADD-GT-ASSERTION-TO-RESULT", 2, 0, false);
    //declareFunction(myName, "ghl_add_sbhl_assertion_to_result", "GHL-ADD-SBHL-ASSERTION-TO-RESULT", 6, 0, false);
    //declareFunction(myName, "ghl_add_reflexivity_justification", "GHL-ADD-REFLEXIVITY-JUSTIFICATION", 3, 0, false);
    //declareFunction(myName, "ghl_node_admitted_by_some_reflexive_gaf", "GHL-NODE-ADMITTED-BY-SOME-REFLEXIVE-GAF", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_ghl_search_utilities_file() {
    return NIL;
  }

  public static final SubLObject setup_ghl_search_utilities_file() {
    // CVS_ID("Id: ghl-search-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$ISA = makeKeyword("ISA");
  public static final SubLObject $const1$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLList $list2 = list(constant_handles.reader_make_constant_shell(makeString("ReflexiveBinaryPredicate")));
  public static final SubLSymbol $kw3$GAF = makeKeyword("GAF");
  public static final SubLObject $const4$ReflexiveBinaryPredicate = constant_handles.reader_make_constant_shell(makeString("ReflexiveBinaryPredicate"));

  //// Initializers

  public void declareFunctions() {
    declare_ghl_search_utilities_file();
  }

  public void initializeVariables() {
    init_ghl_search_utilities_file();
  }

  public void runTopLevelForms() {
    setup_ghl_search_utilities_file();
  }

}
