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

package  com.cyc.cycjava.cycl.inference.harness;

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
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.inference.harness.inference_abduction_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_strategy;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_tactic;
import com.cyc.cycjava.cycl.inference.harness.inference_tactician;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_transformation;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class transformation_tactician_datastructures extends SubLTranslatedFile {

  //// Constructor

  private transformation_tactician_datastructures() {}
  public static final SubLFile me = new transformation_tactician_datastructures();
  public static final String myName = "com.cyc.cycjava.cycl.inference.harness.transformation_tactician_datastructures";

  //// Definitions

  public static final class $transformation_strategy_data_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $link_heads_motivated; }
    public SubLObject getField3() { return $problems_pending; }
    public SubLObject getField4() { return $transformation_strategem_index; }
    public SubLObject getField5() { return $problem_total_strategems_active; }
    public SubLObject getField6() { return $problem_strategems_set_aside; }
    public SubLObject getField7() { return $problem_strategems_thrown_away; }
    public SubLObject setField2(SubLObject value) { return $link_heads_motivated = value; }
    public SubLObject setField3(SubLObject value) { return $problems_pending = value; }
    public SubLObject setField4(SubLObject value) { return $transformation_strategem_index = value; }
    public SubLObject setField5(SubLObject value) { return $problem_total_strategems_active = value; }
    public SubLObject setField6(SubLObject value) { return $problem_strategems_set_aside = value; }
    public SubLObject setField7(SubLObject value) { return $problem_strategems_thrown_away = value; }
    public SubLObject $link_heads_motivated = NIL;
    public SubLObject $problems_pending = NIL;
    public SubLObject $transformation_strategem_index = NIL;
    public SubLObject $problem_total_strategems_active = NIL;
    public SubLObject $problem_strategems_set_aside = NIL;
    public SubLObject $problem_strategems_thrown_away = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($transformation_strategy_data_native.class, $sym1$TRANSFORMATION_STRATEGY_DATA, $sym2$TRANSFORMATION_STRATEGY_DATA_P, $list3, $list4, new String[] {"$link_heads_motivated", "$problems_pending", "$transformation_strategem_index", "$problem_total_strategems_active", "$problem_strategems_set_aside", "$problem_strategems_thrown_away"}, $list5, $list6, $sym7$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 1480) 
  public static SubLSymbol $dtp_transformation_strategy_data$ = null;

  public static final class $transformation_strategy_data_p$UnaryFunction extends UnaryFunction {
    public $transformation_strategy_data_p$UnaryFunction() { super(extractFunctionNamed("TRANSFORMATION-STRATEGY-DATA-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35166"); }
  }

  @SubL(source = "cycl/inference/harness/transformation-tactician-datastructures.lisp", position = 2907) 
  public static final SubLObject transformation_strategy_p(SubLObject object) {
    return makeBoolean((((NIL != inference_datastructures_strategy.strategy_p(object))
             && ($kw0$TRANSFORMATION == inference_datastructures_strategy.strategy_type(object)))
          || (NIL != inference_abduction_utilities.abductive_strategy_p(object))));
  }

  public static final SubLObject declare_transformation_tactician_datastructures_file() {
    declareFunction(myName, "transformation_strategy_motivation_p", "TRANSFORMATION-STRATEGY-MOTIVATION-P", 1, 0, false);
    declareFunction(myName, "transformation_strategy_data_print_function_trampoline", "TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "transformation_strategy_data_p", "TRANSFORMATION-STRATEGY-DATA-P", 1, 0, false); new $transformation_strategy_data_p$UnaryFunction();
    declareFunction(myName, "trans_strat_data_link_heads_motivated", "TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 1, 0, false);
    declareFunction(myName, "trans_strat_data_problems_pending", "TRANS-STRAT-DATA-PROBLEMS-PENDING", 1, 0, false);
    declareFunction(myName, "trans_strat_data_transformation_strategem_index", "TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
    declareFunction(myName, "trans_strat_data_problem_total_strategems_active", "TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
    declareFunction(myName, "trans_strat_data_problem_strategems_set_aside", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
    declareFunction(myName, "trans_strat_data_problem_strategems_thrown_away", "TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
    declareFunction(myName, "_csetf_trans_strat_data_link_heads_motivated", "_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED", 2, 0, false);
    declareFunction(myName, "_csetf_trans_strat_data_problems_pending", "_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING", 2, 0, false);
    declareFunction(myName, "_csetf_trans_strat_data_transformation_strategem_index", "_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_trans_strat_data_problem_total_strategems_active", "_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 2, 0, false);
    declareFunction(myName, "_csetf_trans_strat_data_problem_strategems_set_aside", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "_csetf_trans_strat_data_problem_strategems_thrown_away", "_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY", 2, 0, false);
    declareFunction(myName, "make_transformation_strategy_data", "MAKE-TRANSFORMATION-STRATEGY-DATA", 0, 1, false);
    declareFunction(myName, "transformation_strategy_p", "TRANSFORMATION-STRATEGY-P", 1, 0, false);
    declareFunction(myName, "new_transformation_strategy_data", "NEW-TRANSFORMATION-STRATEGY-DATA", 1, 0, false);
    declareFunction(myName, "transformation_strategy_link_heads_motivated", "TRANSFORMATION-STRATEGY-LINK-HEADS-MOTIVATED", 1, 0, false);
    declareFunction(myName, "transformation_strategy_problems_pending", "TRANSFORMATION-STRATEGY-PROBLEMS-PENDING", 1, 0, false);
    declareFunction(myName, "transformation_strategy_transformation_strategem_index", "TRANSFORMATION-STRATEGY-TRANSFORMATION-STRATEGEM-INDEX", 1, 0, false);
    declareFunction(myName, "transformation_strategy_problem_total_strategems_active", "TRANSFORMATION-STRATEGY-PROBLEM-TOTAL-STRATEGEMS-ACTIVE", 1, 0, false);
    declareFunction(myName, "transformation_strategy_problem_strategems_set_aside", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-SET-ASIDE", 1, 0, false);
    declareFunction(myName, "transformation_strategy_problem_strategems_thrown_away", "TRANSFORMATION-STRATEGY-PROBLEM-STRATEGEMS-THROWN-AWAY", 1, 0, false);
    declareFunction(myName, "transformation_strategy_problem_motivatedP", "TRANSFORMATION-STRATEGY-PROBLEM-MOTIVATED?", 2, 0, false);
    declareFunction(myName, "transformation_strategy_link_head_motivatedP", "TRANSFORMATION-STRATEGY-LINK-HEAD-MOTIVATED?", 2, 0, false);
    declareFunction(myName, "transformation_strategy_problem_pendingP", "TRANSFORMATION-STRATEGY-PROBLEM-PENDING?", 2, 0, false);
    declareFunction(myName, "transformation_strategy_problem_totally_pendingP", "TRANSFORMATION-STRATEGY-PROBLEM-TOTALLY-PENDING?", 2, 0, false);
    declareFunction(myName, "transformation_strategy_problem_activeP", "TRANSFORMATION-STRATEGY-PROBLEM-ACTIVE?", 2, 0, false);
    declareFunction(myName, "transformation_strategy_problem_set_asideP", "TRANSFORMATION-STRATEGY-PROBLEM-SET-ASIDE?", 2, 0, false);
    declareFunction(myName, "transformation_strategy_strategem_set_asideP", "TRANSFORMATION-STRATEGY-STRATEGEM-SET-ASIDE?", 2, 0, false);
    declareFunction(myName, "transformation_strategy_strategem_thrown_awayP", "TRANSFORMATION-STRATEGY-STRATEGEM-THROWN-AWAY?", 2, 0, false);
    declareFunction(myName, "transformation_strategy_note_problem_motivated", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-MOTIVATED", 2, 0, false);
    declareFunction(myName, "transformation_strategy_note_link_head_motivated", "TRANSFORMATION-STRATEGY-NOTE-LINK-HEAD-MOTIVATED", 2, 0, false);
    declareFunction(myName, "transformation_strategy_note_problem_pending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-PENDING", 2, 0, false);
    declareFunction(myName, "transformation_strategy_note_problem_unpending", "TRANSFORMATION-STRATEGY-NOTE-PROBLEM-UNPENDING", 2, 0, false);
    declareFunction(myName, "transformation_strategy_activate_strategem", "TRANSFORMATION-STRATEGY-ACTIVATE-STRATEGEM", 2, 0, false);
    declareFunction(myName, "transformation_strategy_note_strategem_set_aside", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-SET-ASIDE", 2, 0, false);
    declareFunction(myName, "transformation_strategy_clear_strategems_set_aside", "TRANSFORMATION-STRATEGY-CLEAR-STRATEGEMS-SET-ASIDE", 1, 0, false);
    declareFunction(myName, "transformation_strategy_note_strategem_thrown_away", "TRANSFORMATION-STRATEGY-NOTE-STRATEGEM-THROWN-AWAY", 2, 0, false);
    declareFunction(myName, "transformation_strategy_clear_set_aside_problems", "TRANSFORMATION-STRATEGY-CLEAR-SET-ASIDE-PROBLEMS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_transformation_tactician_datastructures_file() {
    $dtp_transformation_strategy_data$ = defconstant("*DTP-TRANSFORMATION-STRATEGY-DATA*", $sym1$TRANSFORMATION_STRATEGY_DATA);
    return NIL;
  }

  public static final SubLObject setup_transformation_tactician_datastructures_file() {
    // CVS_ID("Id: inference-transformation-tactician-datastructures.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_transformation_strategy_data$.getGlobalValue(), Symbols.symbol_function($sym8$TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED, $sym10$_CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED);
    Structures.def_csetf($sym11$TRANS_STRAT_DATA_PROBLEMS_PENDING, $sym12$_CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING);
    Structures.def_csetf($sym13$TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX, $sym14$_CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX);
    Structures.def_csetf($sym15$TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE, $sym16$_CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE);
    Structures.def_csetf($sym17$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE, $sym18$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE);
    Structures.def_csetf($sym19$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY, $sym20$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY);
    Equality.identity($sym1$TRANSFORMATION_STRATEGY_DATA);
    utilities_macros.note_funcall_helper_function($sym31$TRANSFORMATION_STRATEGY_PROBLEM_TOTALLY_PENDING_);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $sym1$TRANSFORMATION_STRATEGY_DATA = makeSymbol("TRANSFORMATION-STRATEGY-DATA");
  public static final SubLSymbol $sym2$TRANSFORMATION_STRATEGY_DATA_P = makeSymbol("TRANSFORMATION-STRATEGY-DATA-P");
  public static final SubLList $list3 = list(makeSymbol("LINK-HEADS-MOTIVATED"), makeSymbol("PROBLEMS-PENDING"), makeSymbol("TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("PROBLEM-STRATEGEMS-THROWN-AWAY"));
  public static final SubLList $list4 = list(makeKeyword("LINK-HEADS-MOTIVATED"), makeKeyword("PROBLEMS-PENDING"), makeKeyword("TRANSFORMATION-STRATEGEM-INDEX"), makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE"), makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY"));
  public static final SubLList $list5 = list(makeSymbol("TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("TRANS-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING"), makeSymbol("_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE"), makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY"));
  public static final SubLSymbol $sym7$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym8$TRANSFORMATION_STRATEGY_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRANSFORMATION-STRATEGY-DATA-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED");
  public static final SubLSymbol $sym10$_CSETF_TRANS_STRAT_DATA_LINK_HEADS_MOTIVATED = makeSymbol("_CSETF-TRANS-STRAT-DATA-LINK-HEADS-MOTIVATED");
  public static final SubLSymbol $sym11$TRANS_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("TRANS-STRAT-DATA-PROBLEMS-PENDING");
  public static final SubLSymbol $sym12$_CSETF_TRANS_STRAT_DATA_PROBLEMS_PENDING = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEMS-PENDING");
  public static final SubLSymbol $sym13$TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");
  public static final SubLSymbol $sym14$_CSETF_TRANS_STRAT_DATA_TRANSFORMATION_STRATEGEM_INDEX = makeSymbol("_CSETF-TRANS-STRAT-DATA-TRANSFORMATION-STRATEGEM-INDEX");
  public static final SubLSymbol $sym15$TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
  public static final SubLSymbol $sym16$_CSETF_TRANS_STRAT_DATA_PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
  public static final SubLSymbol $sym17$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");
  public static final SubLSymbol $sym18$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_SET_ASIDE = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-SET-ASIDE");
  public static final SubLSymbol $sym19$TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");
  public static final SubLSymbol $sym20$_CSETF_TRANS_STRAT_DATA_PROBLEM_STRATEGEMS_THROWN_AWAY = makeSymbol("_CSETF-TRANS-STRAT-DATA-PROBLEM-STRATEGEMS-THROWN-AWAY");
  public static final SubLSymbol $kw21$LINK_HEADS_MOTIVATED = makeKeyword("LINK-HEADS-MOTIVATED");
  public static final SubLSymbol $kw22$PROBLEMS_PENDING = makeKeyword("PROBLEMS-PENDING");
  public static final SubLSymbol $kw23$TRANSFORMATION_STRATEGEM_INDEX = makeKeyword("TRANSFORMATION-STRATEGEM-INDEX");
  public static final SubLSymbol $kw24$PROBLEM_TOTAL_STRATEGEMS_ACTIVE = makeKeyword("PROBLEM-TOTAL-STRATEGEMS-ACTIVE");
  public static final SubLSymbol $kw25$PROBLEM_STRATEGEMS_SET_ASIDE = makeKeyword("PROBLEM-STRATEGEMS-SET-ASIDE");
  public static final SubLSymbol $kw26$PROBLEM_STRATEGEMS_THROWN_AWAY = makeKeyword("PROBLEM-STRATEGEMS-THROWN-AWAY");
  public static final SubLString $str27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $sym28$TRANSFORMATION_STRATEGY_P = makeSymbol("TRANSFORMATION-STRATEGY-P");
  public static final SubLSymbol $sym29$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $sym30$MOTIVATION_STRATEGEM_P = makeSymbol("MOTIVATION-STRATEGEM-P");
  public static final SubLSymbol $sym31$TRANSFORMATION_STRATEGY_PROBLEM_TOTALLY_PENDING_ = makeSymbol("TRANSFORMATION-STRATEGY-PROBLEM-TOTALLY-PENDING?");
  public static final SubLSymbol $sym32$STRATEGEM_P = makeSymbol("STRATEGEM-P");
  public static final SubLSymbol $sym33$TRANSFORMATION_STRATEGEM_P = makeSymbol("TRANSFORMATION-STRATEGEM-P");

  //// Initializers

  public void declareFunctions() {
    declare_transformation_tactician_datastructures_file();
  }

  public void initializeVariables() {
    init_transformation_tactician_datastructures_file();
  }

  public void runTopLevelForms() {
    setup_transformation_tactician_datastructures_file();
  }

}
