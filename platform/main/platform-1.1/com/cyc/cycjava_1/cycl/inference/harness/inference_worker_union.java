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

package com.cyc.cycjava_1.cycl.inference.harness;
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
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_lookahead_productivity;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_tactician;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macros;

public  final class inference_worker_union extends SubLTranslatedFile {

  //// Constructor

  private inference_worker_union() {}
  public static final SubLFile me = new inference_worker_union();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_worker_union";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 862) 
  public static final SubLObject union_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_p(object))
           && ($kw0$UNION == inference_datastructures_problem_link.problem_link_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 3162) 
  private static SubLSymbol $union_module$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 3287) 
  public static final SubLObject union_tactic_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(object))
             && ($union_module$.getDynamicValue(thread) == inference_datastructures_tactic.tactic_hl_module(object))));
    }
  }

  /** The preference level used for union tactics.
Union tactics are independent of each other, so no bindings from one half
could possibly make the other half any more solvable.
Hence, all union tactics should be preferred. */
  @SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 7927) 
  public static SubLSymbol $union_tactic_preference_level$ = null;

  /** the preference level for all union tactics */
  @SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 8214) 
  public static SubLSymbol $union_tactic_preference_level_justification$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 10818) 
  public static final SubLObject disjunctive_assumption_link_p(SubLObject object) {
    return makeBoolean(((NIL != inference_datastructures_problem_link.problem_link_p(object))
           && ($kw6$DISJUNCTIVE_ASSUMPTION == inference_datastructures_problem_link.problem_link_type(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 11197) 
  private static SubLSymbol $disjunction_assumption_module$ = null;

  @SubL(source = "cycl/inference/harness/inference-worker-union.lisp", position = 11307) 
  public static final SubLObject disjunctive_assumption_tactic_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != inference_datastructures_tactic.tactic_p(object))
             && ($disjunction_assumption_module$.getDynamicValue(thread) == inference_datastructures_tactic.tactic_hl_module(object))));
    }
  }

  public static final SubLObject declare_inference_worker_union_file() {
    declareFunction(myName, "union_link_p", "UNION-LINK-P", 1, 0, false);
    declareFunction(myName, "maybe_new_union_link", "MAYBE-NEW-UNION-LINK", 2, 0, false);
    declareFunction(myName, "new_union_link", "NEW-UNION-LINK", 2, 0, false);
    declareFunction(myName, "destroy_union_link", "DESTROY-UNION-LINK", 1, 0, false);
    declareFunction(myName, "union_link_supporting_problem", "UNION-LINK-SUPPORTING-PROBLEM", 1, 0, false);
    declareFunction(myName, "union_link_tactic", "UNION-LINK-TACTIC", 1, 0, false);
    declareFunction(myName, "union_tactic_p", "UNION-TACTIC-P", 1, 0, false);
    declareFunction(myName, "new_union_tactic", "NEW-UNION-TACTIC", 2, 0, false);
    declareFunction(myName, "union_tactic_disjunct_index", "UNION-TACTIC-DISJUNCT-INDEX", 1, 0, false);
    declareFunction(myName, "union_tactic_link", "UNION-TACTIC-LINK", 1, 0, false);
    declareFunction(myName, "find_or_create_union_tactic_disjunct_mapped_problem", "FIND-OR-CREATE-UNION-TACTIC-DISJUNCT-MAPPED-PROBLEM", 1, 0, false);
    declareFunction(myName, "find_or_create_union_link_supporting_mapped_problem", "FIND-OR-CREATE-UNION-LINK-SUPPORTING-MAPPED-PROBLEM", 2, 0, false);
    declareFunction(myName, "determine_new_union_tactics", "DETERMINE-NEW-UNION-TACTICS", 2, 0, false);
    declareFunction(myName, "compute_strategic_properties_of_union_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-UNION-TACTIC", 3, 0, false);
    declareFunction(myName, "compute_union_tactic_productivity", "COMPUTE-UNION-TACTIC-PRODUCTIVITY", 3, 0, false);
    declareFunction(myName, "compute_union_tactic_preference_level", "COMPUTE-UNION-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
    declareFunction(myName, "union_tactic_lookahead_problem", "UNION-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
    declareFunction(myName, "execute_union_tactic", "EXECUTE-UNION-TACTIC", 1, 0, false);
    declareFunction(myName, "new_union_proof", "NEW-UNION-PROOF", 3, 0, false);
    declareFunction(myName, "bubble_up_proof_to_union_link", "BUBBLE-UP-PROOF-TO-UNION-LINK", 3, 0, false);
    declareFunction(myName, "disjunctive_assumption_link_p", "DISJUNCTIVE-ASSUMPTION-LINK-P", 1, 0, false);
    declareFunction(myName, "disjunctive_assumption_tactic_p", "DISJUNCTIVE-ASSUMPTION-TACTIC-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_worker_union_file() {
    $union_module$ = defparameter("*UNION-MODULE*", inference_modules.inference_structural_module($kw0$UNION, UNPROVIDED));
    $union_tactic_preference_level$ = deflexical("*UNION-TACTIC-PREFERENCE-LEVEL*", $kw5$PREFERRED);
    $union_tactic_preference_level_justification$ = deflexical("*UNION-TACTIC-PREFERENCE-LEVEL-JUSTIFICATION*", $kw5$PREFERRED);
    $disjunction_assumption_module$ = defparameter("*DISJUNCTION-ASSUMPTION-MODULE*", inference_modules.inference_structural_module($kw6$DISJUNCTIVE_ASSUMPTION, UNPROVIDED));
    return NIL;
  }

  public static final SubLObject setup_inference_worker_union_file() {
    // CVS_ID("Id: inference-worker-union.lisp 128648 2009-08-27 17:23:55Z pace ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$UNION = makeKeyword("UNION");
  public static final SubLString $str1$couldn_t_find_the_union_tactic_fo = makeString("couldn't find the union tactic for ~s");
  public static final SubLSymbol $kw2$SKIP = makeKeyword("SKIP");
  public static final SubLString $str3$Could_not_find_the_link_for__a = makeString("Could not find the link for ~a");
  public static final SubLSymbol $kw4$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $kw5$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLSymbol $kw6$DISJUNCTIVE_ASSUMPTION = makeKeyword("DISJUNCTIVE-ASSUMPTION");

  //// Initializers

  public void declareFunctions() {
    declare_inference_worker_union_file();
  }

  public void initializeVariables() {
    init_inference_worker_union_file();
  }

  public void runTopLevelForms() {
    setup_inference_worker_union_file();
  }

}
