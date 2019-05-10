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

package  com.cyc.cycjava_1.cycl;

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


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.ghl_search_vars;
import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;

public  final class ghl_marking_utilities extends SubLTranslatedFile {

  //// Constructor

  private ghl_marking_utilities() {}
  public static final SubLFile me = new ghl_marking_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.ghl_marking_utilities";

  //// Definitions

  @SubL(source = "cycl/ghl-marking-utilities.lisp", position = 936) 
  public static SubLSymbol $ghl_table$ = null;

  @SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1866) 
  public static final SubLObject ghl_instantiate_new_space() {
    return Hashtables.make_hash_table($int8$200, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/ghl-marking-utilities.lisp", position = 1952) 
  public static final SubLObject get_ghl_marking(SubLObject v_search, SubLObject node) {
    return Hashtables.gethash(node, ghl_search_vars.ghl_space(v_search), UNPROVIDED);
  }

  @SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2490) 
  public static final SubLObject ghl_mark_node_in_space(SubLObject node, SubLObject mark, SubLObject space) {
    Hashtables.sethash(node, space, mark);
    return NIL;
  }

  @SubL(source = "cycl/ghl-marking-utilities.lisp", position = 2605) 
  public static final SubLObject ghl_mark_node(SubLObject v_search, SubLObject node, SubLObject mark) {
    {
      SubLObject space = ghl_search_vars.ghl_space(v_search);
      ghl_mark_node_in_space(node, mark, space);
    }
    return NIL;
  }

  public static final SubLObject declare_ghl_marking_utilities_file() {
    declareMacro(myName, "with_ghl_table_var", "WITH-GHL-TABLE-VAR");
    declareMacro(myName, "with_new_ghl_table_named", "WITH-NEW-GHL-TABLE-NAMED");
    declareMacro(myName, "with_new_ghl_table", "WITH-NEW-GHL-TABLE");
    declareMacro(myName, "do_ghl_marking_table", "DO-GHL-MARKING-TABLE");
    declareFunction(myName, "ghl_marking_table_marked_nodes", "GHL-MARKING-TABLE-MARKED-NODES", 0, 0, false);
    declareFunction(myName, "ghl_instantiate_new_space", "GHL-INSTANTIATE-NEW-SPACE", 0, 0, false);
    declareFunction(myName, "get_ghl_marking", "GET-GHL-MARKING", 2, 0, false);
    declareFunction(myName, "get_ghl_goal_marking", "GET-GHL-GOAL-MARKING", 2, 0, false);
    declareFunction(myName, "ghl_marked_node_p", "GHL-MARKED-NODE-P", 2, 0, false);
    declareFunction(myName, "ghl_goal_marked_node_p", "GHL-GOAL-MARKED-NODE-P", 2, 0, false);
    declareFunction(myName, "ghl_node_marked_in_space_p", "GHL-NODE-MARKED-IN-SPACE-P", 2, 0, false);
    declareFunction(myName, "ghl_mark_node_in_space", "GHL-MARK-NODE-IN-SPACE", 3, 0, false);
    declareFunction(myName, "ghl_mark_node", "GHL-MARK-NODE", 3, 0, false);
    declareFunction(myName, "ghl_goal_mark_node", "GHL-GOAL-MARK-NODE", 3, 0, false);
    declareFunction(myName, "ghl_mark_node_in_ghl_table", "GHL-MARK-NODE-IN-GHL-TABLE", 2, 0, false);
    declareFunction(myName, "ghl_unmark_node", "GHL-UNMARK-NODE", 2, 0, false);
    declareFunction(myName, "ghl_node_with_equal_or_shallower_depth_p", "GHL-NODE-WITH-EQUAL-OR-SHALLOWER-DEPTH-P", 3, 0, false);
    declareFunction(myName, "ghl_goal_node_with_equal_or_shallower_depth_p", "GHL-GOAL-NODE-WITH-EQUAL-OR-SHALLOWER-DEPTH-P", 3, 0, false);
    declareFunction(myName, "prepend_to_ghl_marking_state", "PREPEND-TO-GHL-MARKING-STATE", 3, 0, false);
    declareFunction(myName, "ghl_goal_mark_node_as_searched", "GHL-GOAL-MARK-NODE-AS-SEARCHED", 2, 0, false);
    declareFunction(myName, "ghl_marked_cardinality", "GHL-MARKED-CARDINALITY", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_ghl_marking_utilities_file() {
    $ghl_table$ = defparameter("*GHL-TABLE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_ghl_marking_utilities_file() {
    // CVS_ID("Id: ghl-marking-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLList $list2 = list(makeSymbol("*GHL-TABLE*"));
  public static final SubLList $list3 = list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list4 = list(list(makeSymbol("*GHL-TABLE*"), list(makeSymbol("GHL-INSTANTIATE-NEW-SPACE"))));
  public static final SubLSymbol $sym5$WITH_GHL_TABLE_VAR = makeSymbol("WITH-GHL-TABLE-VAR");
  public static final SubLList $list6 = list(list(makeSymbol("KEY-VAR"), makeSymbol("MARKING-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym7$CDOHASH = makeSymbol("CDOHASH");
  public static final SubLInteger $int8$200 = makeInteger(200);

  //// Initializers

  public void declareFunctions() {
    declare_ghl_marking_utilities_file();
  }

  public void initializeVariables() {
    init_ghl_marking_utilities_file();
  }

  public void runTopLevelForms() {
    setup_ghl_marking_utilities_file();
  }

}
