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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.graphl_search_vars;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class graphl_graph_utilities extends SubLTranslatedFile {

  //// Constructor

  private graphl_graph_utilities() {}
  public static final SubLFile me = new graphl_graph_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.graphl_graph_utilities";

  //// Definitions

  @SubL(source = "cycl/graphl-graph-utilities.lisp", position = 1783) 
  public static SubLSymbol $graphl_finishedP$ = null;

  @SubL(source = "cycl/graphl-graph-utilities.lisp", position = 2086) 
  public static final SubLObject reset_graphl_finished() {
    $graphl_finishedP$.setDynamicValue(NIL);
    return NIL;
  }

  public static final SubLObject declare_graphl_graph_utilities_file() {
    declareFunction(myName, "graphl_node_p", "GRAPHL-NODE-P", 1, 0, false);
    declareFunction(myName, "graphl_edge_p", "GRAPHL-EDGE-P", 1, 0, false);
    declareFunction(myName, "graphl_directed_edge_p", "GRAPHL-DIRECTED-EDGE-P", 1, 0, false);
    declareFunction(myName, "graphl_edge_label", "GRAPHL-EDGE-LABEL", 1, 0, false);
    declareFunction(myName, "graphl_edge_start_node", "GRAPHL-EDGE-START-NODE", 1, 0, false);
    declareFunction(myName, "graphl_edge_end_node", "GRAPHL-EDGE-END-NODE", 1, 0, false);
    declareMacro(myName, "with_new_graphl_finished", "WITH-NEW-GRAPHL-FINISHED");
    declareFunction(myName, "set_graphl_finished", "SET-GRAPHL-FINISHED", 0, 0, false);
    declareFunction(myName, "reset_graphl_finished", "RESET-GRAPHL-FINISHED", 0, 0, false);
    declareFunction(myName, "graphl_add_unwind_edges_now_p", "GRAPHL-ADD-UNWIND-EDGES-NOW-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_graphl_graph_utilities_file() {
    $graphl_finishedP$ = defparameter("*GRAPHL-FINISHED?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_graphl_graph_utilities_file() {
    // CVS_ID("Id: graphl-graph-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLET = makeSymbol("CLET");
  public static final SubLList $list1 = list(list(makeSymbol("*GRAPHL-FINISHED?*"), NIL));

  //// Initializers

  public void declareFunctions() {
    declare_graphl_graph_utilities_file();
  }

  public void initializeVariables() {
    init_graphl_graph_utilities_file();
  }

  public void runTopLevelForms() {
    setup_graphl_graph_utilities_file();
  }

}
